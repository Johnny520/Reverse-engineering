.class public final Lbd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final η:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final θ:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Agw-Js-Conv"

    .line 2
    .line 3
    const-string v1, "X-Hamlet-Is-Unity"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lbd1;->α:Ljava/util/Set;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lbd1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lbd1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lbd1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lbd1;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lbd1;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 57
    .line 58
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lbd1;->θ:Ljava/util/Map;

    .line 68
    .line 69
    return-void
.end method

.method public static final α([Ljava/lang/Object;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    instance-of v3, v2, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-nez v2, :cond_2

    .line 29
    .line 30
    const-string v2, ""

    .line 31
    .line 32
    :cond_2
    move-object v6, v2

    .line 33
    const-string v2, "farm/"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-static {v6, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v14, 0x3f

    .line 41
    .line 42
    invoke-static {v6, v14, v6}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-array v7, v3, [C

    .line 47
    .line 48
    const/16 v8, 0x2f

    .line 49
    .line 50
    aput-char v8, v7, v1

    .line 51
    .line 52
    invoke-static {v5, v7}, Lq02;->Д(Ljava/lang/String;[C)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v7, "/config/v2/load"

    .line 66
    .line 67
    invoke-static {v5, v7, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    invoke-static {v3, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    instance-of v3, v2, Lorg/json/JSONObject;

    .line 81
    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    check-cast v2, Lorg/json/JSONObject;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    const/4 v2, 0x0

    .line 88
    :goto_2
    const/4 v3, 0x2

    .line 89
    invoke-static {v3, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    instance-of v5, v3, Lorg/json/JSONObject;

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    check-cast v3, Lorg/json/JSONObject;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    const/4 v3, 0x0

    .line 101
    :goto_3
    const/4 v5, 0x3

    .line 102
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    instance-of v7, v5, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v7, :cond_6

    .line 109
    .line 110
    check-cast v5, Ljava/lang/String;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    const/4 v5, 0x0

    .line 114
    :goto_4
    if-eqz v5, :cond_7

    .line 115
    .line 116
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    goto :goto_5

    .line 125
    :cond_7
    const/4 v5, 0x0

    .line 126
    :goto_5
    if-nez v5, :cond_8

    .line 127
    .line 128
    const-string v5, ""

    .line 129
    .line 130
    :cond_8
    move-object v7, v5

    .line 131
    invoke-static {v2}, Lbd1;->τ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    if-nez v3, :cond_9

    .line 143
    .line 144
    sget-object v5, Ljz;->ε:Ljz;

    .line 145
    .line 146
    :goto_6
    move-object v15, v5

    .line 147
    goto :goto_8

    .line 148
    :cond_9
    new-instance v5, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_a

    .line 162
    .line 163
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_a
    invoke-static {v5}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    goto :goto_6

    .line 176
    :goto_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 177
    .line 178
    .line 179
    move-result-wide v20

    .line 180
    new-instance v5, Lwc1;

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    move-object v9, v15

    .line 185
    move-wide/from16 v10, v20

    .line 186
    .line 187
    invoke-direct/range {v5 .. v13}, Lwc1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    sget-object v9, Lbd1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 191
    .line 192
    invoke-virtual {v9, v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    const/4 v5, 0x4

    .line 196
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-eqz v0, :cond_c

    .line 201
    .line 202
    sget-object v5, Lbd1;->θ:Ljava/util/Map;

    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    monitor-enter v5

    .line 208
    :try_start_0
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    const/16 v12, 0x80

    .line 213
    .line 214
    if-lt v9, v12, :cond_b

    .line 215
    .line 216
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 217
    .line 218
    .line 219
    goto :goto_9

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    goto :goto_a

    .line 222
    :cond_b
    :goto_9
    new-instance v9, Lxc1;

    .line 223
    .line 224
    invoke-direct {v9, v10, v11, v6, v7}, Lxc1;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v5, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    .line 229
    .line 230
    monitor-exit v5

    .line 231
    goto :goto_b

    .line 232
    :goto_a
    monitor-exit v5

    .line 233
    throw v0

    .line 234
    :cond_c
    :goto_b
    if-eqz v1, :cond_d

    .line 235
    .line 236
    invoke-static {v6, v14, v6}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v1, "r92f7758a36520680"

    .line 241
    .line 242
    invoke-static {v1, v7, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_d
    if-eqz v2, :cond_e

    .line 247
    .line 248
    const-string v0, "sec_pet_id"

    .line 249
    .line 250
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    goto :goto_c

    .line 265
    :cond_e
    const/4 v0, 0x0

    .line 266
    :goto_c
    if-nez v0, :cond_f

    .line 267
    .line 268
    const-string v0, ""

    .line 269
    .line 270
    :cond_f
    if-nez v3, :cond_10

    .line 271
    .line 272
    sget-object v1, Lkz;->ε:Lkz;

    .line 273
    .line 274
    :goto_d
    move-object/from16 v19, v1

    .line 275
    .line 276
    goto :goto_11

    .line 277
    :cond_10
    sget-object v1, Lbd1;->α:Ljava/util/Set;

    .line 278
    .line 279
    check-cast v1, Ljava/lang/Iterable;

    .line 280
    .line 281
    new-instance v2, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    :cond_11
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-eqz v5, :cond_15

    .line 295
    .line 296
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    check-cast v5, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    if-eqz v9, :cond_14

    .line 307
    .line 308
    sget-object v12, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 309
    .line 310
    if-ne v9, v12, :cond_12

    .line 311
    .line 312
    const/4 v9, 0x0

    .line 313
    :cond_12
    if-eqz v9, :cond_14

    .line 314
    .line 315
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    if-eqz v9, :cond_14

    .line 320
    .line 321
    invoke-static {v9}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    if-eqz v9, :cond_14

    .line 330
    .line 331
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    if-lez v12, :cond_13

    .line 336
    .line 337
    goto :goto_f

    .line 338
    :cond_13
    const/4 v9, 0x0

    .line 339
    :goto_f
    if-eqz v9, :cond_14

    .line 340
    .line 341
    new-instance v12, Ll91;

    .line 342
    .line 343
    invoke-direct {v12, v5, v9}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    goto :goto_10

    .line 347
    :cond_14
    const/4 v12, 0x0

    .line 348
    :goto_10
    if-eqz v12, :cond_11

    .line 349
    .line 350
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_e

    .line 354
    :cond_15
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 355
    .line 356
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-static {v2, v1}, Lex0;->Π(Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V

    .line 360
    .line 361
    .line 362
    goto :goto_d

    .line 363
    :goto_11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-lez v1, :cond_3d

    .line 368
    .line 369
    invoke-interface/range {v19 .. v19}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    sget-object v2, Lbd1;->α:Ljava/util/Set;

    .line 374
    .line 375
    check-cast v2, Ljava/util/Collection;

    .line 376
    .line 377
    invoke-interface {v1, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-eqz v1, :cond_3d

    .line 382
    .line 383
    sget-object v1, Luc1;->θ:Luc1;

    .line 384
    .line 385
    invoke-virtual {v1, v0}, Luc1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    sget-object v2, Lbd1;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 390
    .line 391
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, Lvc1;

    .line 396
    .line 397
    sget-object v3, Lbd1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 398
    .line 399
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    check-cast v3, Lvc1;

    .line 404
    .line 405
    if-nez v3, :cond_18

    .line 406
    .line 407
    sget-object v3, Lxn0;->ξ:Lxn0;

    .line 408
    .line 409
    invoke-virtual {v3}, Lxn0;->Ρ()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    :cond_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-eqz v5, :cond_17

    .line 422
    .line 423
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    move-object v9, v5

    .line 428
    check-cast v9, Lvc1;

    .line 429
    .line 430
    invoke-virtual {v9}, Lvc1;->β()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v9

    .line 434
    invoke-virtual {v9, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-eqz v9, :cond_16

    .line 439
    .line 440
    goto :goto_12

    .line 441
    :cond_17
    const/4 v5, 0x0

    .line 442
    :goto_12
    move-object v3, v5

    .line 443
    check-cast v3, Lvc1;

    .line 444
    .line 445
    :cond_18
    if-nez v2, :cond_1f

    .line 446
    .line 447
    sget-object v1, Lbd1;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    check-cast v5, Lzc1;

    .line 454
    .line 455
    const-wide/16 v16, 0x0

    .line 456
    .line 457
    if-eqz v5, :cond_1a

    .line 458
    .line 459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 460
    .line 461
    .line 462
    move-result-wide v20

    .line 463
    const-wide/32 v22, 0x1d4c1

    .line 464
    .line 465
    .line 466
    iget-wide v12, v5, Lzc1;->δ:J

    .line 467
    .line 468
    sub-long v20, v20, v12

    .line 469
    .line 470
    cmp-long v9, v16, v20

    .line 471
    .line 472
    if-gtz v9, :cond_19

    .line 473
    .line 474
    cmp-long v9, v20, v22

    .line 475
    .line 476
    if-gez v9, :cond_19

    .line 477
    .line 478
    goto :goto_13

    .line 479
    :cond_19
    const/4 v5, 0x0

    .line 480
    :goto_13
    if-eqz v5, :cond_1b

    .line 481
    .line 482
    move-wide/from16 v20, v10

    .line 483
    .line 484
    goto :goto_16

    .line 485
    :cond_1a
    const-wide/32 v22, 0x1d4c1

    .line 486
    .line 487
    .line 488
    :cond_1b
    sget-object v5, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 489
    .line 490
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    check-cast v5, Lyc1;

    .line 495
    .line 496
    if-eqz v5, :cond_1f

    .line 497
    .line 498
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 499
    .line 500
    .line 501
    move-result-wide v12

    .line 502
    move-wide/from16 v20, v10

    .line 503
    .line 504
    iget-wide v9, v5, Lyc1;->β:J

    .line 505
    .line 506
    sub-long/2addr v12, v9

    .line 507
    cmp-long v9, v16, v12

    .line 508
    .line 509
    if-gtz v9, :cond_1c

    .line 510
    .line 511
    cmp-long v9, v12, v22

    .line 512
    .line 513
    if-gez v9, :cond_1c

    .line 514
    .line 515
    goto :goto_14

    .line 516
    :cond_1c
    const/4 v5, 0x0

    .line 517
    :goto_14
    if-nez v5, :cond_1d

    .line 518
    .line 519
    goto :goto_15

    .line 520
    :cond_1d
    sget-object v9, Lhe1;->α:Lym1;

    .line 521
    .line 522
    iget-object v9, v5, Lyc1;->α:Lee1;

    .line 523
    .line 524
    invoke-static {}, Lbd1;->ο()Ljava/util/ArrayList;

    .line 525
    .line 526
    .line 527
    move-result-object v10

    .line 528
    invoke-static {v9, v10}, Lhe1;->ε(Lee1;Ljava/util/ArrayList;)Lge1;

    .line 529
    .line 530
    .line 531
    move-result-object v9

    .line 532
    if-nez v9, :cond_1e

    .line 533
    .line 534
    goto :goto_15

    .line 535
    :cond_1e
    new-instance v22, Lzc1;

    .line 536
    .line 537
    iget-wide v10, v9, Lge1;->α:J

    .line 538
    .line 539
    iget-object v12, v9, Lge1;->β:Ljava/lang/String;

    .line 540
    .line 541
    iget-object v13, v9, Lge1;->γ:Ljava/lang/Long;

    .line 542
    .line 543
    iget-wide v4, v5, Lyc1;->β:J

    .line 544
    .line 545
    iget-object v9, v9, Lge1;->δ:Ljava/lang/String;

    .line 546
    .line 547
    const-string v14, "deferred:"

    .line 548
    .line 549
    invoke-virtual {v14, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v29

    .line 553
    move-wide/from16 v27, v4

    .line 554
    .line 555
    move-wide/from16 v23, v10

    .line 556
    .line 557
    move-object/from16 v25, v12

    .line 558
    .line 559
    move-object/from16 v26, v13

    .line 560
    .line 561
    invoke-direct/range {v22 .. v29}, Lzc1;-><init>(JLjava/lang/String;Ljava/lang/Long;JLjava/lang/String;)V

    .line 562
    .line 563
    .line 564
    move-object/from16 v5, v22

    .line 565
    .line 566
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    goto :goto_16

    .line 570
    :cond_1f
    move-wide/from16 v20, v10

    .line 571
    .line 572
    :goto_15
    const/4 v5, 0x0

    .line 573
    :goto_16
    new-instance v16, Lvc1;

    .line 574
    .line 575
    sget-object v18, Luc1;->θ:Luc1;

    .line 576
    .line 577
    if-eqz v2, :cond_21

    .line 578
    .line 579
    iget-object v1, v2, Lvc1;->ε:Ljava/lang/Long;

    .line 580
    .line 581
    if-nez v1, :cond_20

    .line 582
    .line 583
    goto :goto_18

    .line 584
    :cond_20
    :goto_17
    move-object/from16 v22, v1

    .line 585
    .line 586
    goto :goto_1a

    .line 587
    :cond_21
    :goto_18
    if-eqz v3, :cond_22

    .line 588
    .line 589
    iget-object v1, v3, Lvc1;->ε:Ljava/lang/Long;

    .line 590
    .line 591
    goto :goto_19

    .line 592
    :cond_22
    const/4 v1, 0x0

    .line 593
    :goto_19
    if-nez v1, :cond_20

    .line 594
    .line 595
    if-eqz v5, :cond_23

    .line 596
    .line 597
    iget-wide v9, v5, Lzc1;->α:J

    .line 598
    .line 599
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    goto :goto_17

    .line 604
    :cond_23
    const/16 v22, 0x0

    .line 605
    .line 606
    :goto_1a
    if-eqz v2, :cond_25

    .line 607
    .line 608
    iget-object v1, v2, Lvc1;->ζ:Ljava/lang/String;

    .line 609
    .line 610
    if-nez v1, :cond_24

    .line 611
    .line 612
    goto :goto_1c

    .line 613
    :cond_24
    :goto_1b
    move-object/from16 v23, v1

    .line 614
    .line 615
    goto :goto_1e

    .line 616
    :cond_25
    :goto_1c
    if-eqz v3, :cond_26

    .line 617
    .line 618
    iget-object v1, v3, Lvc1;->ζ:Ljava/lang/String;

    .line 619
    .line 620
    goto :goto_1d

    .line 621
    :cond_26
    const/4 v1, 0x0

    .line 622
    :goto_1d
    if-nez v1, :cond_24

    .line 623
    .line 624
    if-eqz v5, :cond_27

    .line 625
    .line 626
    iget-object v1, v5, Lzc1;->β:Ljava/lang/String;

    .line 627
    .line 628
    goto :goto_1b

    .line 629
    :cond_27
    const/16 v23, 0x0

    .line 630
    .line 631
    :goto_1e
    if-eqz v2, :cond_29

    .line 632
    .line 633
    iget-object v1, v2, Lvc1;->η:Ljava/lang/Long;

    .line 634
    .line 635
    if-nez v1, :cond_28

    .line 636
    .line 637
    goto :goto_20

    .line 638
    :cond_28
    :goto_1f
    move-object/from16 v17, v0

    .line 639
    .line 640
    move-object/from16 v24, v1

    .line 641
    .line 642
    goto :goto_22

    .line 643
    :cond_29
    :goto_20
    if-eqz v3, :cond_2a

    .line 644
    .line 645
    iget-object v1, v3, Lvc1;->η:Ljava/lang/Long;

    .line 646
    .line 647
    goto :goto_21

    .line 648
    :cond_2a
    const/4 v1, 0x0

    .line 649
    :goto_21
    if-nez v1, :cond_28

    .line 650
    .line 651
    if-eqz v5, :cond_2b

    .line 652
    .line 653
    iget-object v1, v5, Lzc1;->γ:Ljava/lang/Long;

    .line 654
    .line 655
    goto :goto_1f

    .line 656
    :cond_2b
    move-object/from16 v17, v0

    .line 657
    .line 658
    const/16 v24, 0x0

    .line 659
    .line 660
    :goto_22
    invoke-direct/range {v16 .. v24}, Lvc1;-><init>(Ljava/lang/String;Luc1;Ljava/util/Map;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v0, v16

    .line 664
    .line 665
    if-nez v2, :cond_2c

    .line 666
    .line 667
    invoke-static {v0, v3}, Lbd1;->π(Lvc1;Lvc1;)Lvc1;

    .line 668
    .line 669
    .line 670
    move-result-object v16

    .line 671
    move-object/from16 v9, v16

    .line 672
    .line 673
    goto :goto_23

    .line 674
    :cond_2c
    move-object v9, v0

    .line 675
    :goto_23
    if-nez v2, :cond_3d

    .line 676
    .line 677
    sget-object v0, Lbd1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 678
    .line 679
    invoke-virtual {v9}, Lvc1;->β()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {v0, v1, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    sget-object v1, Lxn0;->ξ:Lxn0;

    .line 687
    .line 688
    monitor-enter v1

    .line 689
    :try_start_1
    invoke-static {}, Lui1;->Α()Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-eqz v0, :cond_35

    .line 694
    .line 695
    iget-object v0, v9, Lvc1;->α:Ljava/lang/String;

    .line 696
    .line 697
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_2d

    .line 702
    .line 703
    goto/16 :goto_28

    .line 704
    .line 705
    :cond_2d
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 706
    .line 707
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1}, Lxn0;->Ρ()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    if-eqz v4, :cond_2e

    .line 723
    .line 724
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    check-cast v4, Lvc1;

    .line 729
    .line 730
    invoke-virtual {v4}, Lvc1;->β()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v10

    .line 734
    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    goto :goto_24

    .line 738
    :catchall_1
    move-exception v0

    .line 739
    goto/16 :goto_2d

    .line 740
    .line 741
    :cond_2e
    invoke-virtual {v9}, Lvc1;->β()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    check-cast v2, Lvc1;

    .line 750
    .line 751
    invoke-virtual {v9}, Lvc1;->β()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    iget-object v10, v9, Lvc1;->ε:Ljava/lang/Long;

    .line 756
    .line 757
    if-nez v10, :cond_2f

    .line 758
    .line 759
    if-eqz v2, :cond_30

    .line 760
    .line 761
    iget-object v10, v2, Lvc1;->ε:Ljava/lang/Long;

    .line 762
    .line 763
    :cond_2f
    move-object v11, v10

    .line 764
    goto :goto_25

    .line 765
    :cond_30
    const/4 v11, 0x0

    .line 766
    :goto_25
    iget-object v10, v9, Lvc1;->ζ:Ljava/lang/String;

    .line 767
    .line 768
    if-nez v10, :cond_31

    .line 769
    .line 770
    if-eqz v2, :cond_32

    .line 771
    .line 772
    iget-object v10, v2, Lvc1;->ζ:Ljava/lang/String;

    .line 773
    .line 774
    :cond_31
    move-object v12, v10

    .line 775
    goto :goto_26

    .line 776
    :cond_32
    const/4 v12, 0x0

    .line 777
    :goto_26
    iget-object v10, v9, Lvc1;->η:Ljava/lang/Long;

    .line 778
    .line 779
    if-nez v10, :cond_33

    .line 780
    .line 781
    if-eqz v2, :cond_34

    .line 782
    .line 783
    iget-object v10, v2, Lvc1;->η:Ljava/lang/Long;

    .line 784
    .line 785
    :cond_33
    move-object v13, v10

    .line 786
    goto :goto_27

    .line 787
    :cond_34
    const/4 v13, 0x0

    .line 788
    :goto_27
    const/16 v14, 0xf

    .line 789
    .line 790
    const/4 v10, 0x0

    .line 791
    invoke-static/range {v9 .. v14}, Lvc1;->α(Lvc1;Ljava/util/LinkedHashMap;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;I)Lvc1;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {v0}, Lxn0;->м(Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 806
    .line 807
    .line 808
    monitor-exit v1

    .line 809
    goto :goto_29

    .line 810
    :cond_35
    :goto_28
    monitor-exit v1

    .line 811
    :goto_29
    invoke-static {}, Ldd1;->γ()Z

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    if-eqz v0, :cond_36

    .line 816
    .line 817
    const-wide/16 v0, 0x7d0

    .line 818
    .line 819
    invoke-static {v0, v1}, Ldd1;->η(J)V

    .line 820
    .line 821
    .line 822
    :cond_36
    iget-object v0, v9, Lvc1;->ε:Ljava/lang/Long;

    .line 823
    .line 824
    if-eqz v0, :cond_3a

    .line 825
    .line 826
    if-eqz v3, :cond_37

    .line 827
    .line 828
    iget-object v4, v3, Lvc1;->ε:Ljava/lang/Long;

    .line 829
    .line 830
    goto :goto_2a

    .line 831
    :cond_37
    const/4 v4, 0x0

    .line 832
    :goto_2a
    if-eqz v4, :cond_38

    .line 833
    .line 834
    const-string v1, "cached"

    .line 835
    .line 836
    goto :goto_2b

    .line 837
    :cond_38
    if-eqz v5, :cond_39

    .line 838
    .line 839
    iget-object v1, v5, Lzc1;->ε:Ljava/lang/String;

    .line 840
    .line 841
    goto :goto_2b

    .line 842
    :cond_39
    const-string v1, "manual"

    .line 843
    .line 844
    :goto_2b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 845
    .line 846
    const-string v3, "rad2803da1aa0f08a"

    .line 847
    .line 848
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    goto :goto_2e

    .line 865
    :cond_3a
    invoke-static {}, Lux;->π()Z

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    if-eqz v0, :cond_3d

    .line 870
    .line 871
    sget-object v0, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    check-cast v0, Lyc1;

    .line 878
    .line 879
    if-eqz v0, :cond_3b

    .line 880
    .line 881
    iget-object v0, v0, Lyc1;->α:Lee1;

    .line 882
    .line 883
    iget-object v4, v0, Lee1;->ε:Ljava/util/Set;

    .line 884
    .line 885
    goto :goto_2c

    .line 886
    :cond_3b
    const/4 v4, 0x0

    .line 887
    :goto_2c
    if-nez v4, :cond_3c

    .line 888
    .line 889
    sget-object v4, Lnz;->ε:Lnz;

    .line 890
    .line 891
    :cond_3c
    invoke-static {}, Lbd1;->ο()Ljava/util/ArrayList;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    invoke-static {v4}, Lbd1;->σ(Ljava/util/Set;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    new-instance v2, Ljava/lang/StringBuilder;

    .line 904
    .line 905
    const-string v3, "r98519b8a46ecbd1e"

    .line 906
    .line 907
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    goto :goto_2e

    .line 924
    :goto_2d
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 925
    throw v0

    .line 926
    :cond_3d
    :goto_2e
    const-string v16, ","

    .line 927
    .line 928
    const/16 v20, 0x0

    .line 929
    .line 930
    const/16 v21, 0x3e

    .line 931
    .line 932
    const/16 v17, 0x0

    .line 933
    .line 934
    const/16 v18, 0x0

    .line 935
    .line 936
    const/16 v19, 0x0

    .line 937
    .line 938
    invoke-static/range {v15 .. v21}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    const-string v1, "request method="

    .line 943
    .line 944
    const-string v2, " path="

    .line 945
    .line 946
    const-string v3, " params="

    .line 947
    .line 948
    invoke-static {v1, v7, v2, v6, v3}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    const-string v2, " headerNames="

    .line 956
    .line 957
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    const/16 v1, 0x2ee0

    .line 968
    .line 969
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    const-string v1, "r8ce45eb8182ecab1"

    .line 974
    .line 975
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    return-void
.end method

.method public static final β(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lbd1;->θ:Ljava/util/Map;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lxc1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v1

    .line 18
    :goto_0
    if-nez p0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    if-nez p2, :cond_2

    .line 22
    .line 23
    const-string p2, ""

    .line 24
    .line 25
    :cond_2
    const/16 v0, 0xd

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/16 v0, 0xa

    .line 37
    .line 38
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/16 v0, 0xf0

    .line 46
    .line 47
    invoke-static {p2, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget-object v0, p0, Lxc1;->α:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p0, Lxc1;->β:Ljava/lang/String;

    .line 54
    .line 55
    iget-wide v2, p0, Lxc1;->γ:J

    .line 56
    .line 57
    new-instance v4, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "error"

    .line 63
    .line 64
    invoke-virtual {v4, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-object v4, p1

    .line 76
    invoke-static/range {v0 .. v5}, Lbd1;->φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Lxc1;->α:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 p1, -0x1

    .line 89
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "r60e225453a01e198"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    monitor-exit v1

    .line 116
    throw p0
.end method

.method public static final γ(Ljava/lang/Object;Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    const/16 v0, 0xc8

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    move-object p0, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Lbd1;->θ:Ljava/util/Map;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lxc1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object v7, p0, Lxc1;->α:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v1, Lkd1;->α:Lkd1;

    .line 31
    .line 32
    invoke-static {v7}, Lkd1;->δ(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_c

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lkd1;->α(Lorg/json/JSONObject;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object p1, v0

    .line 46
    :goto_1
    if-nez p1, :cond_3

    .line 47
    .line 48
    sget-object p1, Ljz;->ε:Ljz;

    .line 49
    .line 50
    :cond_3
    new-instance v1, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "seed_count"

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "shop_seed_count"

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    move v4, v7

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move v4, v7

    .line 81
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_7

    .line 86
    .line 87
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Lid1;

    .line 92
    .line 93
    iget-boolean v6, v6, Lid1;->τ:Z

    .line 94
    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    if-ltz v4, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    invoke-static {}, Lyh;->ф()V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_7
    :goto_3
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lxc1;->α:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v2, p0, Lxc1;->β:Ljava/lang/String;

    .line 120
    .line 121
    iget-wide v3, p0, Lxc1;->γ:J

    .line 122
    .line 123
    invoke-static/range {v1 .. v6}, Lbd1;->φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string p0, "rc2954fec18baf260"

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_8

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_b

    .line 148
    .line 149
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Lid1;

    .line 154
    .line 155
    iget-boolean v2, v2, Lid1;->τ:Z

    .line 156
    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    add-int/lit8 v7, v7, 0x1

    .line 160
    .line 161
    if-ltz v7, :cond_a

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_a
    invoke-static {}, Lyh;->ф()V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_b
    :goto_5
    const-string p1, "\u5bbf\u4e3b\u73a9\u6cd5\u914d\u7f6e\u5df2\u89e3\u6790 seedCount="

    .line 169
    .line 170
    const-string v2, " shopSeedCount="

    .line 171
    .line 172
    invoke-static {v1, v7, p1, v2}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const/4 v1, 0x4

    .line 177
    invoke-static {p0, p1, v0, v1, v0}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_c
    invoke-static {p1}, Lbd1;->τ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v1, p0, Lxc1;->α:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v2, p0, Lxc1;->β:Ljava/lang/String;

    .line 195
    .line 196
    iget-wide v3, p0, Lxc1;->γ:J

    .line 197
    .line 198
    invoke-static/range {v1 .. v6}, Lbd1;->φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    new-instance p0, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string p1, "response source=bridge path="

    .line 204
    .line 205
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string p1, " data="

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const/16 p1, 0x2ee0

    .line 224
    .line 225
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    const-string p1, "r8ce45eb8182ecab1"

    .line 230
    .line 231
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    move-object p0, v0

    .line 241
    monitor-exit v1

    .line 242
    throw p0
.end method

.method public static final δ([Ljava/lang/Object;)V
    .locals 13

    .line 1
    const/4 v1, 0x0

    .line 2
    invoke-static {v1, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_10

    .line 9
    .line 10
    :cond_0
    const/4 v2, 0x1

    .line 11
    invoke-static {v2, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_10

    .line 18
    .line 19
    :cond_1
    const-string v3, "request"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    goto/16 :goto_10

    .line 28
    .line 29
    :cond_2
    const-string v0, "getUrl"

    .line 30
    .line 31
    invoke-static {v3, v0}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object v0, v4

    .line 54
    :goto_0
    const-string v5, ""

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    move-object v6, v5

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object v6, v0

    .line 61
    :goto_1
    sget-object v0, Lkd1;->α:Lkd1;

    .line 62
    .line 63
    invoke-static {v6}, Lkd1;->δ(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const-string v8, "farm/"

    .line 68
    .line 69
    invoke-static {v6, v8, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_5

    .line 74
    .line 75
    if-nez v7, :cond_5

    .line 76
    .line 77
    goto/16 :goto_10

    .line 78
    .line 79
    :cond_5
    const-string v2, "body"

    .line 80
    .line 81
    invoke-static {p0, v2}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_2

    .line 92
    :cond_6
    move-object v2, v4

    .line 93
    :goto_2
    if-nez v2, :cond_7

    .line 94
    .line 95
    move-object v2, v5

    .line 96
    :cond_7
    const-string v8, "code"

    .line 97
    .line 98
    invoke-static {p0, v8}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    instance-of v8, p0, Ljava/lang/Number;

    .line 103
    .line 104
    if-eqz v8, :cond_8

    .line 105
    .line 106
    check-cast p0, Ljava/lang/Number;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    move-object p0, v4

    .line 110
    :goto_3
    if-eqz p0, :cond_9

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    move-object v10, p0

    .line 121
    goto :goto_4

    .line 122
    :cond_9
    move-object v10, v4

    .line 123
    :goto_4
    const-string p0, "getMethod"

    .line 124
    .line 125
    if-eqz v7, :cond_15

    .line 126
    .line 127
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 128
    .line 129
    invoke-direct {v7, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v7}, Lkd1;->α(Lorg/json/JSONObject;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    goto :goto_5

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    new-instance v2, Leo1;

    .line 139
    .line 140
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object v0, v2

    .line 144
    :goto_5
    instance-of v2, v0, Leo1;

    .line 145
    .line 146
    if-eqz v2, :cond_a

    .line 147
    .line 148
    sget-object v0, Ljz;->ε:Ljz;

    .line 149
    .line 150
    :cond_a
    check-cast v0, Ljava/util/List;

    .line 151
    .line 152
    new-instance v2, Lorg/json/JSONObject;

    .line 153
    .line 154
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v7, "seed_count"

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-eqz v7, :cond_b

    .line 172
    .line 173
    move v8, v1

    .line 174
    goto :goto_7

    .line 175
    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    move v8, v1

    .line 180
    :cond_c
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-eqz v9, :cond_e

    .line 185
    .line 186
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    check-cast v9, Lid1;

    .line 191
    .line 192
    iget-boolean v9, v9, Lid1;->τ:Z

    .line 193
    .line 194
    if-eqz v9, :cond_c

    .line 195
    .line 196
    add-int/lit8 v8, v8, 0x1

    .line 197
    .line 198
    if-ltz v8, :cond_d

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_d
    invoke-static {}, Lyh;->ф()V

    .line 202
    .line 203
    .line 204
    throw v4

    .line 205
    :cond_e
    :goto_7
    const-string v7, "shop_seed_count"

    .line 206
    .line 207
    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {v3, p0}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-eqz p0, :cond_f

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-eqz p0, :cond_f

    .line 229
    .line 230
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    goto :goto_8

    .line 239
    :cond_f
    move-object p0, v4

    .line 240
    :goto_8
    if-nez p0, :cond_10

    .line 241
    .line 242
    move-object v7, v5

    .line 243
    goto :goto_9

    .line 244
    :cond_10
    move-object v7, p0

    .line 245
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 246
    .line 247
    .line 248
    move-result-wide v8

    .line 249
    invoke-static/range {v6 .. v11}, Lbd1;->φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_11

    .line 261
    .line 262
    goto :goto_b

    .line 263
    :cond_11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    :cond_12
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_14

    .line 272
    .line 273
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, Lid1;

    .line 278
    .line 279
    iget-boolean v2, v2, Lid1;->τ:Z

    .line 280
    .line 281
    if-eqz v2, :cond_12

    .line 282
    .line 283
    add-int/lit8 v1, v1, 0x1

    .line 284
    .line 285
    if-ltz v1, :cond_13

    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_13
    invoke-static {}, Lyh;->ф()V

    .line 289
    .line 290
    .line 291
    throw v4

    .line 292
    :cond_14
    :goto_b
    const-string v0, "\u5bbf\u4e3b\u73a9\u6cd5\u914d\u7f6e\u76d1\u63a7\u54cd\u5e94\u5df2\u89e3\u6790 seedCount="

    .line 293
    .line 294
    const-string v2, " shopSeedCount="

    .line 295
    .line 296
    invoke-static {p0, v1, v0, v2}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    const/4 v0, 0x4

    .line 301
    const-string v1, "rc2954fec18baf260"

    .line 302
    .line 303
    invoke-static {v1, p0, v4, v0, v4}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_10

    .line 307
    .line 308
    :cond_15
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 309
    .line 310
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Lbd1;->τ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 321
    goto :goto_c

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    new-instance v1, Leo1;

    .line 324
    .line 325
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    move-object v0, v1

    .line 329
    :goto_c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    const/16 v12, 0x2ee0

    .line 334
    .line 335
    if-nez v1, :cond_16

    .line 336
    .line 337
    goto :goto_d

    .line 338
    :cond_16
    invoke-static {v2, v12}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    :goto_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-object v11, v0

    .line 346
    check-cast v11, Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v3, p0}, Lbd1;->ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    if-eqz p0, :cond_17

    .line 353
    .line 354
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    if-eqz p0, :cond_17

    .line 359
    .line 360
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    :cond_17
    if-nez v4, :cond_18

    .line 369
    .line 370
    move-object v7, v5

    .line 371
    goto :goto_e

    .line 372
    :cond_18
    move-object v7, v4

    .line 373
    :goto_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 374
    .line 375
    .line 376
    move-result-wide v8

    .line 377
    invoke-static/range {v6 .. v11}, Lbd1;->φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    if-eqz v10, :cond_19

    .line 381
    .line 382
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    goto :goto_f

    .line 387
    :cond_19
    const/4 p0, -0x1

    .line 388
    :goto_f
    const-string v0, " path="

    .line 389
    .line 390
    const-string v1, " data="

    .line 391
    .line 392
    const-string v2, "response http="

    .line 393
    .line 394
    invoke-static {p0, v2, v0, v6, v1}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    invoke-static {p0, v12}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    const-string v0, "r8ce45eb8182ecab1"

    .line 410
    .line 411
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    :goto_10
    return-void
.end method

.method public static final ε([Ljava/lang/Object;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    const/4 v3, 0x0

    .line 9
    if-ge v2, v1, :cond_2

    .line 10
    .line 11
    aget-object v4, p0, v2

    .line 12
    .line 13
    instance-of v5, v4, Ljava/util/Map;

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    move-object v3, v4

    .line 18
    check-cast v3, Ljava/util/Map;

    .line 19
    .line 20
    :cond_0
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_3
    sget-object p0, Lhe1;->α:Lym1;

    .line 37
    .line 38
    new-instance p0, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v1, 0xa

    .line 41
    .line 42
    invoke-static {v0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/util/Map;

    .line 64
    .line 65
    invoke-static {v2}, Lhe1;->β(Ljava/util/Map;)Lee1;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    new-instance v1, Lee1;

    .line 74
    .line 75
    invoke-direct {v1}, Lee1;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lee1;

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lee1;->β(Lee1;)Lee1;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const-string p0, "unity_state"

    .line 100
    .line 101
    invoke-static {v1, p0}, Lbd1;->η(Lee1;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lee1;->α()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_a

    .line 109
    .line 110
    invoke-static {}, Lux;->π()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_a

    .line 115
    .line 116
    new-instance p0, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Ljava/util/Map;

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/lang/Iterable;

    .line 142
    .line 143
    new-instance v2, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_8

    .line 157
    .line 158
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-eqz v4, :cond_7

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move-object v4, v3

    .line 170
    :goto_5
    if-eqz v4, :cond_6

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    invoke-static {p0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    invoke-static {p0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0}, Lbd1;->σ(Ljava/util/Set;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    const-string v0, "r151314eb9ef1f86"

    .line 189
    .line 190
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_a
    :goto_6
    return-void
.end method

.method public static final ζ(Landroid/app/Activity;)V
    .locals 12

    .line 1
    sget-object v0, Lbd1;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "launch_schema"

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p0, v1

    .line 28
    :goto_0
    sget-object v2, Lhe1;->α:Lym1;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    const-string p0, ""

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    move-object v1, p0

    .line 45
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    new-instance p0, Lee1;

    .line 52
    .line 53
    invoke-direct {p0}, Lee1;-><init>()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_3
    const/16 v2, 0x3f

    .line 59
    .line 60
    invoke-static {v1, v2, p0}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/16 v2, 0x23

    .line 65
    .line 66
    invoke-static {v1, v2, v1}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    new-instance p0, Lee1;

    .line 77
    .line 78
    invoke-direct {p0}, Lee1;-><init>()V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    new-instance v2, Lb8;

    .line 83
    .line 84
    const/4 v3, 0x5

    .line 85
    invoke-direct {v2, v3}, Lb8;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    new-array v3, v3, [C

    .line 90
    .line 91
    const/16 v4, 0x26

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    aput-char v4, v3, v5

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    invoke-static {v1, v3, v5, v4}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_5
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_5

    .line 122
    .line 123
    const/16 v4, 0x3d

    .line 124
    .line 125
    invoke-static {v3, v4, v3}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v3, v4, p0}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v6}, Lhe1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-static {v3}, Lhe1;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v2, v3, v4}, Lb8;->γ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v3, v5}, Lb8;->τ(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    new-instance v6, Lee1;

    .line 149
    .line 150
    iget-object p0, v2, Lb8;->α:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v7, p0

    .line 153
    check-cast v7, Ljava/lang/Long;

    .line 154
    .line 155
    iget-object p0, v2, Lb8;->β:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v8, p0

    .line 158
    check-cast v8, Ljava/lang/String;

    .line 159
    .line 160
    iget-object p0, v2, Lb8;->γ:Ljava/lang/Object;

    .line 161
    .line 162
    move-object v9, p0

    .line 163
    check-cast v9, Ljava/lang/Long;

    .line 164
    .line 165
    iget-object p0, v2, Lb8;->δ:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v10, p0

    .line 168
    check-cast v10, Ljava/lang/String;

    .line 169
    .line 170
    iget-object p0, v2, Lb8;->ε:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v11, p0

    .line 173
    check-cast v11, Ljava/util/LinkedHashSet;

    .line 174
    .line 175
    invoke-direct/range {v6 .. v11}, Lee1;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;)V

    .line 176
    .line 177
    .line 178
    move-object p0, v6

    .line 179
    :goto_2
    invoke-static {p0, v0}, Lbd1;->η(Lee1;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lee1;->α()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_7

    .line 187
    .line 188
    invoke-static {}, Lux;->π()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    iget-object p0, p0, Lee1;->ε:Ljava/util/Set;

    .line 195
    .line 196
    invoke-static {p0}, Lbd1;->σ(Ljava/util/Set;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    const-string v0, "r5272cef44c97f052"

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    return-void
.end method

.method public static η(Lee1;Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lee1;->α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v6

    .line 12
    iget-object v0, p0, Lee1;->α:Ljava/lang/Long;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    if-nez v0, :cond_5

    .line 19
    .line 20
    iget-object v0, p0, Lee1;->β:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lee1;->γ:Ljava/lang/Long;

    .line 31
    .line 32
    if-nez v0, :cond_5

    .line 33
    .line 34
    iget-object v0, p0, Lee1;->δ:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    :cond_2
    invoke-static {}, Lux;->π()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object p0, p0, Lee1;->ε:Ljava/util/Set;

    .line 51
    .line 52
    invoke-static {p0}, Lbd1;->σ(Ljava/util/Set;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    move v1, v2

    .line 63
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, "r7196732039ba50b0"

    .line 66
    .line 67
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_0
    return-void

    .line 87
    :cond_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lyc1;

    .line 92
    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    iget-wide v9, v0, Lyc1;->β:J

    .line 99
    .line 100
    sub-long v9, v6, v9

    .line 101
    .line 102
    cmp-long v11, v4, v9

    .line 103
    .line 104
    if-gtz v11, :cond_6

    .line 105
    .line 106
    const-wide/32 v11, 0x1d4c1

    .line 107
    .line 108
    .line 109
    cmp-long v9, v9, v11

    .line 110
    .line 111
    if-gez v9, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    move-object v0, v8

    .line 115
    :goto_1
    const-string v9, "launch_schema"

    .line 116
    .line 117
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-nez v9, :cond_8

    .line 122
    .line 123
    if-nez v0, :cond_7

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_7
    iget-object v0, v0, Lyc1;->α:Lee1;

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lee1;->β(Lee1;)Lee1;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :cond_8
    :goto_2
    iget-object v0, p0, Lee1;->ε:Ljava/util/Set;

    .line 133
    .line 134
    new-instance v9, Lyc1;

    .line 135
    .line 136
    invoke-direct {v9, p0, v6, v7}, Lyc1;-><init>(Lee1;J)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lbd1;->ο()Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {p0, v3}, Lhe1;->ε(Lee1;Ljava/util/ArrayList;)Lge1;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    if-nez v9, :cond_19

    .line 151
    .line 152
    invoke-static {v0}, Lbd1;->σ(Ljava/util/Set;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    iget-object v7, p0, Lee1;->β:Ljava/lang/String;

    .line 157
    .line 158
    if-nez v7, :cond_9

    .line 159
    .line 160
    const-string v7, ""

    .line 161
    .line 162
    :cond_9
    invoke-static {v7, v3}, Lhe1;->γ(Ljava/lang/String;Ljava/util/ArrayList;)Lde1;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    iget-object p0, p0, Lee1;->γ:Ljava/lang/Long;

    .line 167
    .line 168
    if-eqz p0, :cond_f

    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v10

    .line 174
    cmp-long v4, v10, v4

    .line 175
    .line 176
    if-lez v4, :cond_a

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_a
    move-object p0, v8

    .line 180
    :goto_3
    if-eqz p0, :cond_f

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_b

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    move v3, v1

    .line 198
    :cond_c
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_10

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    check-cast v10, Lfe1;

    .line 209
    .line 210
    iget-object v10, v10, Lfe1;->γ:Ljava/lang/Long;

    .line 211
    .line 212
    if-nez v10, :cond_d

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_d
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    cmp-long v10, v10, v4

    .line 220
    .line 221
    if-nez v10, :cond_c

    .line 222
    .line 223
    add-int/lit8 v3, v3, 0x1

    .line 224
    .line 225
    if-ltz v3, :cond_e

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_e
    invoke-static {}, Lyh;->ф()V

    .line 229
    .line 230
    .line 231
    throw v8

    .line 232
    :cond_f
    :goto_5
    move v3, v1

    .line 233
    :cond_10
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    if-lez p0, :cond_11

    .line 238
    .line 239
    move p0, v2

    .line 240
    goto :goto_6

    .line 241
    :cond_11
    move p0, v1

    .line 242
    :goto_6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    if-lez v5, :cond_14

    .line 251
    .line 252
    move v5, v1

    .line 253
    :goto_7
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-ge v5, v10, :cond_13

    .line 258
    .line 259
    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-nez v10, :cond_12

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_13
    move v5, v2

    .line 274
    goto :goto_9

    .line 275
    :cond_14
    :goto_8
    move v5, v1

    .line 276
    :goto_9
    new-array v2, v2, [C

    .line 277
    .line 278
    const/16 v10, 0x3a

    .line 279
    .line 280
    aput-char v10, v2, v1

    .line 281
    .line 282
    const/4 v10, 0x6

    .line 283
    invoke-static {v7, v2, v1, v10}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    if-eqz v10, :cond_15

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    :cond_16
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    if-eqz v10, :cond_18

    .line 303
    .line 304
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    check-cast v10, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    if-lez v10, :cond_16

    .line 315
    .line 316
    add-int/lit8 v1, v1, 0x1

    .line 317
    .line 318
    if-ltz v1, :cond_17

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_17
    invoke-static {}, Lyh;->ф()V

    .line 322
    .line 323
    .line 324
    throw v8

    .line 325
    :cond_18
    :goto_b
    sget-object v2, Lhe1;->α:Lym1;

    .line 326
    .line 327
    invoke-static {v2, v7}, Lym1;->α(Lym1;Ljava/lang/String;)Lcu;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    new-instance v7, Lf71;

    .line 332
    .line 333
    const/16 v8, 0x17

    .line 334
    .line 335
    invoke-direct {v7, v8}, Lf71;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-static {v2, v7}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-static {v2}, Lus1;->Θ(Lss1;)Ljava/util/Set;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    iget-object v7, v9, Lde1;->α:Ljava/util/List;

    .line 351
    .line 352
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    iget-object v8, v9, Lde1;->β:Ljava/util/List;

    .line 357
    .line 358
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    iget-object v10, v9, Lde1;->γ:Ljava/util/List;

    .line 363
    .line 364
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    iget-object v9, v9, Lde1;->δ:Ljava/util/List;

    .line 369
    .line 370
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    const-string v11, "sec_uid"

    .line 375
    .line 376
    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    new-instance v11, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v12, "cidPresent="

    .line 383
    .line 384
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const-string p0, " cidLength="

    .line 391
    .line 392
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const-string p0, " cidNumeric="

    .line 399
    .line 400
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string p0, " cidParts="

    .line 407
    .line 408
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string p0, " cidNumbers="

    .line 415
    .line 416
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string p0, " matches=short:"

    .line 420
    .line 421
    const-string v1, ",exact:"

    .line 422
    .line 423
    invoke-static {v11, v2, p0, v7, v1}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    const-string p0, ",participants:"

    .line 427
    .line 428
    const-string v1, ",uid:"

    .line 429
    .line 430
    invoke-static {v11, v8, p0, v10, v1}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 431
    .line 432
    .line 433
    const-string p0, ",other:"

    .line 434
    .line 435
    const-string v1, " secUidObserved="

    .line 436
    .line 437
    invoke-static {v11, v9, p0, v3, v1}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    const-string v1, "rf973f421553d444f"

    .line 450
    .line 451
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_19
    iget-object p0, v9, Lge1;->δ:Ljava/lang/String;

    .line 472
    .line 473
    new-instance v1, Lzc1;

    .line 474
    .line 475
    iget-wide v2, v9, Lge1;->α:J

    .line 476
    .line 477
    iget-object v4, v9, Lge1;->β:Ljava/lang/String;

    .line 478
    .line 479
    iget-object v5, v9, Lge1;->γ:Ljava/lang/Long;

    .line 480
    .line 481
    const-string v0, ":"

    .line 482
    .line 483
    invoke-static {p1, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-direct/range {v1 .. v8}, Lzc1;-><init>(JLjava/lang/String;Ljava/lang/Long;JLjava/lang/String;)V

    .line 488
    .line 489
    .line 490
    sget-object v0, Lbd1;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 491
    .line 492
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    iget-wide v0, v9, Lge1;->α:J

    .line 496
    .line 497
    new-instance v2, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v3, "r1aefe15b196f0fa6"

    .line 500
    .line 501
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    return-void
.end method

.method public static θ(Ljava/lang/Class;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v4, v2

    .line 34
    check-cast v4, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-class v4, Lorg/json/JSONObject;

    .line 51
    .line 52
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/reflect/Method;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 76
    .line 77
    .line 78
    sget-object v2, Lxq0;->α:Lxq0;

    .line 79
    .line 80
    new-instance v4, Loj0;

    .line 81
    .line 82
    const/16 v5, 0x1a

    .line 83
    .line 84
    invoke-direct {v4, v5}, Loj0;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 88
    .line 89
    .line 90
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v4, v2

    .line 110
    check-cast v4, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {v4, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    array-length v4, v5

    .line 127
    const/4 v6, 0x2

    .line 128
    if-ne v4, v6, :cond_2

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    aget-object v6, v5, v4

    .line 132
    .line 133
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 134
    .line 135
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-nez v6, :cond_3

    .line 140
    .line 141
    aget-object v4, v5, v4

    .line 142
    .line 143
    const-class v6, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_2

    .line 150
    .line 151
    :cond_3
    aget-object v4, v5, v1

    .line 152
    .line 153
    const-class v5, Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_2

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    if-eqz p0, :cond_5

    .line 172
    .line 173
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lxq0;->α:Lxq0;

    .line 177
    .line 178
    new-instance v1, Loj0;

    .line 179
    .line 180
    const/16 v2, 0x1b

    .line 181
    .line 182
    invoke-direct {v1, v2}, Loj0;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p0, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 186
    .line 187
    .line 188
    :cond_5
    return-void

    .line 189
    :cond_6
    const-string p0, "\u672a\u627e\u5230\u552f\u4e00\u7684 Hamlet JSONObject \u6210\u529f\u56de\u8c03"

    .line 190
    .line 191
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public static ι(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E6A7BFCEAA5ACFEB501A06BC7D6BBAD1E0D3D1EB2B1F75DB3E34B944368002BC8D99"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

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
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v4, v2

    .line 44
    check-cast v4, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    array-length v5, v5

    .line 63
    if-ne v5, v3, :cond_0

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    aget-object v3, v3, v1

    .line 70
    .line 71
    const-class v4, Ljava/util/Map;

    .line 72
    .line 73
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_0

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/reflect/Method;

    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lxq0;->α:Lxq0;

    .line 109
    .line 110
    new-instance v4, Loj0;

    .line 111
    .line 112
    const/16 v5, 0x1c

    .line 113
    .line 114
    invoke-direct {v4, v5}, Loj0;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, "rc6a14a32a12c5157"

    .line 128
    .line 129
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_3
    const-string p0, "\u672a\u627e\u5230 Hamlet \u5355 Map \u516c\u5171\u53c2\u6570\u5165\u53e3"

    .line 144
    .line 145
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public static κ(Ljava/lang/ClassLoader;)V
    .locals 7

    .line 1
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E6A7BFCEAA5ACFEB501A06BC7D6BBAD1E0D3C5EB341E7EE11836BD6514810FBD8E8E"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

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
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v4, v2

    .line 44
    check-cast v4, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    array-length v4, v5

    .line 73
    const/4 v6, 0x2

    .line 74
    if-ne v4, v6, :cond_0

    .line 75
    .line 76
    aget-object v4, v5, v1

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v6, "~79E5B19C98B999B9F082C9F024BE3A6EDBEB8D5A00AD3512D795EC8C"

    .line 83
    .line 84
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_0

    .line 93
    .line 94
    aget-object v3, v5, v3

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const-string v4, "~791C379118E47E8B07D05A90B0CB51AAE8EE453FF46C693C81B12D1195DEBF202DE4"

    .line 101
    .line 102
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_0

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz p0, :cond_2

    .line 123
    .line 124
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lxq0;->α:Lxq0;

    .line 128
    .line 129
    new-instance v1, Loj0;

    .line 130
    .line 131
    const/16 v2, 0x1d

    .line 132
    .line 133
    invoke-direct {v1, v2}, Loj0;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p0, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    const-string p0, "\u672a\u627e\u5230\u552f\u4e00\u7684 Hamlet \u7f51\u7edc\u54cd\u5e94\u76d1\u63a7\u65b9\u6cd5"

    .line 141
    .line 142
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public static λ(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F93137A4FAB193EE755529BB7A132C85E57DBFFBB37FDE095537D6082174A9"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

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
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const-string v4, "onCreate"

    .line 50
    .line 51
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-class v3, Landroid/os/Bundle;

    .line 74
    .line 75
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lxq0;->α:Lxq0;

    .line 102
    .line 103
    new-instance v1, Lad1;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-direct {v1, v2}, Lad1;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p0, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_2
    const-string p0, "\u672a\u627e\u5230\u552f\u4e00\u7684 Hamlet WorldActivity.onCreate(Bundle)"

    .line 114
    .line 115
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static μ(Ljava/lang/Class;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    array-length v2, v3

    .line 51
    const/4 v4, 0x2

    .line 52
    if-ne v2, v4, :cond_0

    .line 53
    .line 54
    array-length v2, v3

    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_1
    if-ge v4, v2, :cond_2

    .line 57
    .line 58
    aget-object v5, v3, v4

    .line 59
    .line 60
    const-class v6, Ljava/util/Map;

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lxq0;->α:Lxq0;

    .line 89
    .line 90
    new-instance v1, Lad1;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {v1, v2}, Lad1;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p0, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    const-string p0, "\u672a\u627e\u5230\u552f\u4e00\u7684 Hamlet \u4e16\u754c\u72b6\u6001\u540c\u6b65\u65b9\u6cd5"

    .line 101
    .line 102
    invoke-static {p0}, Lql1;->δ(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static ν(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    aget-object v4, v0, v2

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    array-length v5, v5

    .line 37
    if-nez v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v4, v3

    .line 44
    :goto_1
    if-nez v4, :cond_2

    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    const/4 p1, 0x1

    .line 48
    invoke-virtual {v4, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static ξ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "token"

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "auth"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "cookie"

    .line 28
    .line 29
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "session"

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "signature"

    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const-string v0, "sec_pet_id"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    const-string v0, "conversation_id"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    const-string v0, "sign"

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return v1

    .line 77
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public static ο()Ljava/util/ArrayList;
    .locals 12

    .line 1
    sget-object v0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {v0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    move-object v5, v2

    .line 35
    check-cast v5, Lky1;

    .line 36
    .line 37
    iget v6, v5, Lky1;->δ:I

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    if-ne v6, v7, :cond_0

    .line 41
    .line 42
    iget-wide v5, v5, Lky1;->β:J

    .line 43
    .line 44
    cmp-long v3, v5, v3

    .line 45
    .line 46
    if-lez v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v2, 0xa

    .line 55
    .line 56
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lky1;

    .line 78
    .line 79
    iget-wide v5, v2, Lky1;->β:J

    .line 80
    .line 81
    iget-object v7, v2, Lky1;->α:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    const/4 v9, 0x0

    .line 88
    if-nez v8, :cond_2

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v7, v9

    .line 92
    :goto_2
    iget-wide v10, v2, Lky1;->γ:J

    .line 93
    .line 94
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    cmp-long v8, v10, v3

    .line 99
    .line 100
    if-lez v8, :cond_3

    .line 101
    .line 102
    move-object v9, v2

    .line 103
    :cond_3
    new-instance v2, Lfe1;

    .line 104
    .line 105
    invoke-direct {v2, v5, v6, v7, v9}, Lfe1;-><init>(JLjava/lang/String;Ljava/lang/Long;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    return-object v0
.end method

.method public static π(Lvc1;Lvc1;)Lvc1;
    .locals 8

    .line 1
    iget-object v0, p0, Lvc1;->ε:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lvc1;->ε:Ljava/lang/Long;

    .line 9
    .line 10
    :cond_0
    move-object v4, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    move-object v4, v1

    .line 13
    :goto_0
    iget-object v0, p0, Lvc1;->ζ:Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    iget-object v0, p1, Lvc1;->ζ:Ljava/lang/String;

    .line 20
    .line 21
    :cond_2
    move-object v5, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_3
    move-object v5, v1

    .line 24
    :goto_1
    iget-object v0, p0, Lvc1;->η:Ljava/lang/Long;

    .line 25
    .line 26
    if-nez v0, :cond_5

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    iget-object v1, p1, Lvc1;->η:Ljava/lang/Long;

    .line 31
    .line 32
    :cond_4
    move-object v6, v1

    .line 33
    goto :goto_2

    .line 34
    :cond_5
    move-object v6, v0

    .line 35
    :goto_2
    const/16 v7, 0xf

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move-object v2, p0

    .line 39
    invoke-static/range {v2 .. v7}, Lvc1;->α(Lvc1;Ljava/util/LinkedHashMap;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;I)Lvc1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static ρ(Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    array-length v2, v3

    .line 40
    const/4 v4, 0x5

    .line 41
    if-ne v2, v4, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    aget-object v2, v3, v2

    .line 45
    .line 46
    const-class v4, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    aget-object v2, v3, v2

    .line 56
    .line 57
    const-class v5, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    aget-object v2, v3, v2

    .line 67
    .line 68
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    aget-object v2, v3, v2

    .line 76
    .line 77
    invoke-static {v2, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-static {v0}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    return-object p0
.end method

.method public static σ(Ljava/util/Set;)Ljava/lang/String;
    .locals 3

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-static {p0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lf71;

    .line 8
    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lf71;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ly30;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lf7;

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-direct {p0, v0, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x18

    .line 27
    .line 28
    invoke-static {p0, v0}, Lus1;->Ε(Lss1;I)Lss1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    const/16 v1, 0x3e

    .line 34
    .line 35
    const-string v2, ","

    .line 36
    .line 37
    invoke-static {p0, v2, v0, v1}, Lus1;->ψ(Lss1;Ljava/lang/String;Lgd1;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static τ(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lbd1;->ξ(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const-string v3, "<redacted>"

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, Lbd1;->υ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :goto_1
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v0
.end method

.method public static υ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-static {p0}, Lbd1;->τ(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    new-instance v0, Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 19
    .line 20
    .line 21
    check-cast p0, Lorg/json/JSONArray;

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Lbd1;->υ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v0

    .line 45
    :cond_2
    return-object p0
.end method

.method public static φ(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Lsc1;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-wide v3, p2

    .line 6
    move-object v5, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Lsc1;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Ltc1;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Ltc1;-><init>(Lsc1;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lbd1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {p1, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method
