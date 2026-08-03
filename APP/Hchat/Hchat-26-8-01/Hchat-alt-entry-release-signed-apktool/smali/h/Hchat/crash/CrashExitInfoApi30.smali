.class public final Lh/Hchat/crash/CrashExitInfoApi30;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x0

.field private static final EXIT_MATCH_WINDOW_MS:J = 0x493e0L

.field public static final INSTANCE:Lh/Hchat/crash/CrashExitInfoApi30;

.field private static final SYSTEM_TRACE_LIMIT:I = 0xc0000


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh/Hchat/crash/CrashExitInfoApi30;

    .line 2
    .line 3
    invoke-direct {v0}, Lh/Hchat/crash/CrashExitInfoApi30;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/crash/CrashExitInfoApi30;->INSTANCE:Lh/Hchat/crash/CrashExitInfoApi30;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(ILandroid/app/Application;Landroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit$lambda$2(ILandroid/app/Application;Landroid/app/ApplicationExitInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(ILandroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit$lambda$1(ILandroid/app/ApplicationExitInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(JLandroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit$lambda$3(JLandroid/app/ApplicationExitInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(ILandroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit$lambda$0(ILandroid/app/ApplicationExitInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final findExit(Landroid/app/Application;IJJJI)Lh/Hchat/crash/h;
    .locals 11

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    const-class v1, Landroid/app/ActivityManager;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/app/ActivityManager;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_19

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v1, v3}, Lg3/o0;->j(Landroid/app/ActivityManager;Ljava/lang/String;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v3, Ldg/n;

    .line 26
    .line 27
    const/4 v4, 0x6

    .line 28
    invoke-direct {v3, v1, v4}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lh/Hchat/crash/a;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v1, p2, v4}, Lh/Hchat/crash/a;-><init>(II)V

    .line 35
    .line 36
    .line 37
    new-instance p2, Lng/i;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-direct {p2, v3, v4, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lh/Hchat/crash/a;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v1, v0, v3}, Lh/Hchat/crash/a;-><init>(II)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lng/i;

    .line 50
    .line 51
    invoke-direct {v3, p2, v4, v1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lh/Hchat/crash/b;

    .line 55
    .line 56
    invoke-direct {p2, v0, p1}, Lh/Hchat/crash/b;-><init>(ILandroid/app/Application;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lng/i;

    .line 60
    .line 61
    invoke-direct {p1, v3, v4, p2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Lh/Hchat/crash/c;

    .line 65
    .line 66
    move-wide/from16 v0, p5

    .line 67
    .line 68
    invoke-direct {p2, v0, v1}, Lh/Hchat/crash/c;-><init>(J)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lng/i;

    .line 72
    .line 73
    invoke-direct {v0, p1, v4, p2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-wide/16 v0, 0x0

    .line 81
    .line 82
    cmp-long p2, p7, v0

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    if-lez p2, :cond_10

    .line 86
    .line 87
    new-instance p2, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v6}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-static {v7}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    sub-long v7, v7, p7

    .line 115
    .line 116
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    const-wide/32 v9, 0x493e0

    .line 121
    .line 122
    .line 123
    cmp-long v7, v7, v9

    .line 124
    .line 125
    if-gtz v7, :cond_1

    .line 126
    .line 127
    move v7, v4

    .line 128
    goto :goto_1

    .line 129
    :cond_1
    move v7, v3

    .line 130
    :goto_1
    if-eqz v7, :cond_0

    .line 131
    .line 132
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_3

    .line 145
    .line 146
    move-object v5, v2

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-nez v6, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-static {v5}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v6}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 164
    .line 165
    .line 166
    move-result-wide v6

    .line 167
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-static {v7}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-static {v8}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v8

    .line 183
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-virtual {v6, v8}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-gez v9, :cond_6

    .line 192
    .line 193
    move-object v5, v7

    .line 194
    move-object v6, v8

    .line 195
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-nez v7, :cond_5

    .line 200
    .line 201
    :goto_2
    invoke-static {v5}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-eqz p2, :cond_7

    .line 206
    .line 207
    goto/16 :goto_a

    .line 208
    .line 209
    :cond_7
    new-instance p2, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_b

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v5}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    cmp-long v7, p3, v0

    .line 233
    .line 234
    if-lez v7, :cond_a

    .line 235
    .line 236
    invoke-static {v6}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    cmp-long v6, v6, p3

    .line 241
    .line 242
    if-ltz v6, :cond_9

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_9
    move v6, v3

    .line 246
    goto :goto_5

    .line 247
    :cond_a
    :goto_4
    move v6, v4

    .line 248
    :goto_5
    if-eqz v6, :cond_8

    .line 249
    .line 250
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_b
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-nez p1, :cond_c

    .line 263
    .line 264
    move-object p1, v2

    .line 265
    goto :goto_6

    .line 266
    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-nez p2, :cond_d

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_d
    invoke-static {p1}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-static {p2}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v0

    .line 285
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    :cond_e
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v1}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 298
    .line 299
    .line 300
    move-result-wide v3

    .line 301
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {p2, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-gez v3, :cond_f

    .line 310
    .line 311
    move-object p1, v0

    .line 312
    move-object p2, v1

    .line 313
    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_e

    .line 318
    .line 319
    :goto_6
    invoke-static {p1}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    goto/16 :goto_a

    .line 324
    .line 325
    :cond_10
    cmp-long p2, p3, v0

    .line 326
    .line 327
    if-lez p2, :cond_18

    .line 328
    .line 329
    new-instance p2, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    :cond_11
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_13

    .line 343
    .line 344
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v0}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-static {v1}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 353
    .line 354
    .line 355
    move-result-wide v5

    .line 356
    cmp-long v1, v5, p3

    .line 357
    .line 358
    if-ltz v1, :cond_12

    .line 359
    .line 360
    move v1, v4

    .line 361
    goto :goto_8

    .line 362
    :cond_12
    move v1, v3

    .line 363
    :goto_8
    if-eqz v1, :cond_11

    .line 364
    .line 365
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_13
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    if-nez p2, :cond_14

    .line 378
    .line 379
    move-object p2, v2

    .line 380
    goto :goto_9

    .line 381
    :cond_14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-nez v0, :cond_15

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_15
    invoke-static {p2}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v0}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 397
    .line 398
    .line 399
    move-result-wide v0

    .line 400
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    :cond_16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-static {v1}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static {v3}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v3

    .line 416
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v0, v3}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    if-gez v4, :cond_17

    .line 425
    .line 426
    move-object p2, v1

    .line 427
    move-object v0, v3

    .line 428
    :cond_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-nez v1, :cond_16

    .line 433
    .line 434
    :goto_9
    invoke-static {p2}, Lg3/o0;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 435
    .line 436
    .line 437
    move-result-object p2

    .line 438
    goto :goto_a

    .line 439
    :cond_18
    move-object p2, v2

    .line 440
    :goto_a
    if-eqz p2, :cond_19

    .line 441
    .line 442
    new-instance p1, Lh/Hchat/crash/h;

    .line 443
    .line 444
    invoke-static {p2}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 445
    .line 446
    .line 447
    move-result-wide v0

    .line 448
    invoke-direct {p0, p2}, Lh/Hchat/crash/CrashExitInfoApi30;->formatExitInfo(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p2

    .line 452
    invoke-direct {p1, v0, v1, p2}, Lh/Hchat/crash/h;-><init>(JLjava/lang/String;)V

    .line 453
    .line 454
    .line 455
    return-object p1

    .line 456
    :cond_19
    return-object v2
.end method

.method private static final findExit$lambda$0(ILandroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lg3/o0;->u(Landroid/app/ApplicationExitInfo;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ne p1, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method private static final findExit$lambda$1(ILandroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    if-lez p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lg3/o0;->b(Landroid/app/ApplicationExitInfo;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method private static final findExit$lambda$2(ILandroid/app/Application;Landroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    if-gtz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p2}, Lg3/o0;->r(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p2}, Lg3/o0;->r(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method private static final findExit$lambda$3(JLandroid/app/ApplicationExitInfo;)Z
    .locals 2

    .line 1
    invoke-static {p2}, Lg3/o0;->p(Landroid/app/ApplicationExitInfo;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long p0, v0, p0

    .line 6
    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private final formatExitInfo(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lg3/o0;->r(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, ""

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move-object v1, v2

    .line 15
    :cond_0
    const-string v3, "\u8fdb\u7a0b: "

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lg3/o0;->b(Landroid/app/ApplicationExitInfo;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v5, "PID: "

    .line 36
    .line 37
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lg3/o0;->v(Landroid/app/ApplicationExitInfo;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-static {p1}, Lg3/o0;->w(Landroid/app/ApplicationExitInfo;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v6, "UID: real="

    .line 64
    .line 65
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v3, ", package="

    .line 72
    .line 73
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-object v3, Lh/Hchat/crash/CrashExitInfoApi30;->INSTANCE:Lh/Hchat/crash/CrashExitInfoApi30;

    .line 90
    .line 91
    invoke-static {p1}, Lg3/o0;->u(Landroid/app/ApplicationExitInfo;)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-direct {v3, v4}, Lh/Hchat/crash/CrashExitInfoApi30;->reasonName(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {p1}, Lg3/o0;->u(Landroid/app/ApplicationExitInfo;)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v7, "\u539f\u56e0: "

    .line 106
    .line 107
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v4, " ("

    .line 114
    .line 115
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v4, ")"

    .line 122
    .line 123
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lg3/o0;->i(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-nez v4, :cond_1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_1
    move-object v2, v4

    .line 144
    :goto_0
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-nez v4, :cond_2

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    const/4 v2, 0x0

    .line 152
    :goto_1
    if-eqz v2, :cond_3

    .line 153
    .line 154
    const-string v4, "\u8bf4\u660e: "

    .line 155
    .line 156
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    :cond_3
    invoke-static {p1}, Lg3/o0;->o(Landroid/app/ApplicationExitInfo;)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    new-instance v4, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v5, "\u72b6\u6001: "

    .line 173
    .line 174
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-static {p1}, Lg3/o0;->s(Landroid/app/ApplicationExitInfo;)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    new-instance v4, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v5, "\u91cd\u8981\u6027: "

    .line 197
    .line 198
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-static {p1}, Lg3/o0;->c(Landroid/app/ApplicationExitInfo;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v4

    .line 218
    invoke-static {p1}, Lg3/o0;->t(Landroid/app/ApplicationExitInfo;)J

    .line 219
    .line 220
    .line 221
    move-result-wide v6

    .line 222
    const-string v2, "PSS/RSS: "

    .line 223
    .line 224
    const-string v8, " KB / "

    .line 225
    .line 226
    invoke-static {v4, v5, v2, v8}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v4, " KB"

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-static {p1}, Lg3/o0;->u(Landroid/app/ApplicationExitInfo;)I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    const/4 v4, 0x6

    .line 253
    if-ne v2, v4, :cond_4

    .line 254
    .line 255
    const-string v2, "\u7cfb\u7edf ANR Trace"

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_4
    const-string v2, "\u7cfb\u7edf Tombstone"

    .line 259
    .line 260
    :goto_2
    invoke-direct {v3, p1, v2}, Lh/Hchat/crash/CrashExitInfoApi30;->readSystemTrace(Landroid/app/ApplicationExitInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    if-eqz p1, :cond_5

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    new-instance v3, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v4, "--- "

    .line 272
    .line 273
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v2, " ---"

    .line 280
    .line 281
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_5
    const-string p1, ": \u5f53\u524d\u7cfb\u7edf\u672a\u63d0\u4f9b"

    .line 299
    .line 300
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-static {p1}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    return-object p1
.end method

.method private final isMostlyText([B)Z
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    array-length v0, p1

    .line 7
    const/16 v2, 0x1000

    .line 8
    .line 9
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    move v2, v1

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-lt v2, v0, :cond_2

    .line 16
    .line 17
    mul-int/lit8 v3, v3, 0x64

    .line 18
    .line 19
    div-int/2addr v3, v0

    .line 20
    const/16 p1, 0x55

    .line 21
    .line 22
    if-lt v3, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_1
    return v1

    .line 27
    :cond_2
    aget-byte v4, p1, v2

    .line 28
    .line 29
    and-int/lit16 v4, v4, 0xff

    .line 30
    .line 31
    const/16 v5, 0x9

    .line 32
    .line 33
    if-eq v4, v5, :cond_4

    .line 34
    .line 35
    const/16 v5, 0xa

    .line 36
    .line 37
    if-eq v4, v5, :cond_4

    .line 38
    .line 39
    const/16 v5, 0xd

    .line 40
    .line 41
    if-eq v4, v5, :cond_4

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    if-gt v5, v4, :cond_3

    .line 46
    .line 47
    const/16 v5, 0x7f

    .line 48
    .line 49
    if-ge v4, v5, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/16 v5, 0x80

    .line 53
    .line 54
    if-lt v4, v5, :cond_5

    .line 55
    .line 56
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0
.end method

.method private final readSystemTrace(Landroid/app/ApplicationExitInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lg3/o0;->h(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x2000

    .line 14
    .line 15
    new-array v3, v2, [B

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    const/high16 v6, 0xc0000

    .line 20
    .line 21
    if-ge v5, v6, :cond_1

    .line 22
    .line 23
    sub-int v7, v6, v5

    .line 24
    .line 25
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {p1, v3, v4, v7}, Ljava/io/InputStream;->read([BII)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-gtz v7, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v1, v3, v4, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 37
    .line 38
    .line 39
    add-int/2addr v5, v7

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v2, v1

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    move-object p2, v0

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    invoke-direct {p0, v1}, Lh/Hchat/crash/CrashExitInfoApi30;->isMostlyText([B)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    array-length v1, v1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "\u7cfb\u7edf\u8fd4\u56de\u4e86 "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, " \u5b57\u8282\u4e8c\u8fdb\u5236 "

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p2, "\uff0c\u65e0\u6cd5\u76f4\u63a5\u663e\u793a\u6587\u672c\u3002"

    .line 85
    .line 86
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v3, Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v3, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v3}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-lt v5, v6, :cond_4

    .line 113
    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v3, "\n["

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p2, " \u8d85\u8fc7\u4fdd\u5b58\u4e0a\u9650]"

    .line 128
    .line 129
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const-string p2, ""

    .line 138
    .line 139
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    :goto_3
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    .line 156
    .line 157
    goto :goto_6

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    goto :goto_5

    .line 160
    :goto_4
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 161
    :catchall_2
    move-exception v1

    .line 162
    :try_start_4
    invoke-static {p1, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 166
    :cond_5
    move-object p2, v0

    .line 167
    goto :goto_6

    .line 168
    :goto_5
    new-instance p2, Lsf/f;

    .line 169
    .line 170
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :goto_6
    instance-of p1, p2, Lsf/f;

    .line 174
    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_6
    move-object v0, p2

    .line 179
    :goto_7
    check-cast v0, Ljava/lang/String;

    .line 180
    .line 181
    return-object v0
.end method

.method private final reasonName(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string p1, "\u672a\u77e5"

    .line 5
    .line 6
    return-object p1

    .line 7
    :pswitch_1
    const-string p1, "\u5176\u4ed6"

    .line 8
    .line 9
    return-object p1

    .line 10
    :pswitch_2
    const-string p1, "\u4f9d\u8d56\u8fdb\u7a0b\u9000\u51fa"

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_3
    const-string p1, "\u7528\u6237\u8bf7\u6c42\u9000\u51fa"

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_4
    const-string p1, "\u8d44\u6e90\u4f7f\u7528\u8fc7\u91cf"

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_5
    const-string p1, "\u6743\u9650\u53d8\u5316"

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_6
    const-string p1, "\u521d\u59cb\u5316\u5931\u8d25"

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_7
    const-string p1, "ANR"

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_8
    const-string p1, "Native \u5d29\u6e83"

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_9
    const-string p1, "Java \u5d29\u6e83"

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_a
    const-string p1, "\u4f4e\u5185\u5b58"

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_b
    const-string p1, "\u6536\u5230\u4fe1\u53f7"

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_c
    const-string p1, "\u8fdb\u7a0b\u81ea\u884c\u9000\u51fa"

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final findAnrExit(Landroid/app/Application;JJ)Lh/Hchat/crash/h;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v7, 0x0

    .line 5
    .line 6
    const/4 v9, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move-wide v3, p2

    .line 11
    move-wide v5, p4

    .line 12
    invoke-direct/range {v0 .. v9}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit(Landroid/app/Application;IJJJI)Lh/Hchat/crash/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final findNativeExit(Landroid/app/Application;JJJI)Lh/Hchat/crash/h;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v2, 0x5

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-wide v3, p2

    .line 8
    move-wide v5, p4

    .line 9
    move-wide/from16 v7, p6

    .line 10
    .line 11
    move/from16 v9, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, Lh/Hchat/crash/CrashExitInfoApi30;->findExit(Landroid/app/Application;IJJJI)Lh/Hchat/crash/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
