.class public final Lbk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final β:Ldd;

.field public static final γ:Ljava/util/List;

.field public static final δ:Lbk1;


# instance fields
.field public final α:Li5;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    const/16 v2, 0x2a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-byte v2, v1, v3

    .line 8
    .line 9
    new-instance v2, Ldd;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v2, v1}, Ldd;-><init>([B)V

    .line 16
    .line 17
    .line 18
    sput-object v2, Lbk1;->β:Ldd;

    .line 19
    .line 20
    const-string v1, "*"

    .line 21
    .line 22
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Lbk1;->γ:Ljava/util/List;

    .line 27
    .line 28
    new-instance v1, Lbk1;

    .line 29
    .line 30
    new-instance v2, Li5;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Li5;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2}, Lbk1;-><init>(Li5;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lbk1;->δ:Lbk1;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Li5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbk1;->α:Li5;

    .line 5
    .line 6
    return-void
.end method

.method public static β(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x2e

    .line 6
    .line 7
    aput-char v2, v0, v1

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-static {p0, v0, v1, v2}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lxh;->П(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Lxh;->Д(Ljava/util/List;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final α(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lbk1;->β(Ljava/lang/String;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lbk1;->α:Li5;

    .line 13
    .line 14
    iget-object v1, p0, Li5;->β:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v4

    .line 33
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Li5;->η()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception v2

    .line 49
    :try_start_1
    iput-object v2, p0, Li5;->ζ:Ljava/lang/Object;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    move v1, v3

    .line 58
    goto :goto_0

    .line 59
    :goto_2
    if-eqz v1, :cond_0

    .line 60
    .line 61
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 66
    .line 67
    .line 68
    :cond_0
    throw p0

    .line 69
    :cond_1
    :try_start_2
    iget-object v1, p0, Li5;->γ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_3
    iget-object v1, p0, Li5;->δ:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ldd;

    .line 87
    .line 88
    if-eqz v1, :cond_17

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    new-array v2, v1, [Ldd;

    .line 95
    .line 96
    move v5, v4

    .line 97
    :goto_4
    if-ge v5, v1, :cond_3

    .line 98
    .line 99
    sget-object v6, Ldd;->θ:Ldd;

    .line 100
    .line 101
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v6}, Li2;->ν(Ljava/lang/String;)Ldd;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    aput-object v6, v2, v5

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_3
    move v5, v4

    .line 117
    :goto_5
    const-string v6, "bytes"

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    if-ge v5, v1, :cond_6

    .line 121
    .line 122
    iget-object v8, p0, Li5;->δ:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v8, Ldd;

    .line 125
    .line 126
    if-eqz v8, :cond_5

    .line 127
    .line 128
    invoke-static {v8, v2, v5}, Lrk0;->ι(Ldd;[Ldd;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    if-eqz v8, :cond_4

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_5
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v7

    .line 142
    :cond_6
    move-object v8, v7

    .line 143
    :goto_6
    if-le v1, v3, :cond_9

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    check-cast v5, [Ldd;

    .line 150
    .line 151
    array-length v9, v5

    .line 152
    sub-int/2addr v9, v3

    .line 153
    move v10, v4

    .line 154
    :goto_7
    if-ge v10, v9, :cond_9

    .line 155
    .line 156
    sget-object v11, Lbk1;->β:Ldd;

    .line 157
    .line 158
    aput-object v11, v5, v10

    .line 159
    .line 160
    iget-object v11, p0, Li5;->δ:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v11, Ldd;

    .line 163
    .line 164
    if-eqz v11, :cond_8

    .line 165
    .line 166
    invoke-static {v11, v5, v10}, Lrk0;->ι(Ldd;[Ldd;I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    if-eqz v11, :cond_7

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_8
    invoke-static {v6}, Lln0;->и(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v7

    .line 180
    :cond_9
    move-object v11, v7

    .line 181
    :goto_8
    if-eqz v11, :cond_c

    .line 182
    .line 183
    sub-int/2addr v1, v3

    .line 184
    move v5, v4

    .line 185
    :goto_9
    if-ge v5, v1, :cond_c

    .line 186
    .line 187
    iget-object v6, p0, Li5;->ε:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v6, Ldd;

    .line 190
    .line 191
    if-eqz v6, :cond_b

    .line 192
    .line 193
    invoke-static {v6, v2, v5}, Lrk0;->ι(Ldd;[Ldd;I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    if-eqz v6, :cond_a

    .line 198
    .line 199
    goto :goto_a

    .line 200
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 201
    .line 202
    goto :goto_9

    .line 203
    :cond_b
    const-string p0, "exceptionBytes"

    .line 204
    .line 205
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v7

    .line 209
    :cond_c
    move-object v6, v7

    .line 210
    :goto_a
    const/4 p0, 0x6

    .line 211
    const/16 v1, 0x2e

    .line 212
    .line 213
    if-eqz v6, :cond_d

    .line 214
    .line 215
    const-string v2, "!"

    .line 216
    .line 217
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    new-array v5, v3, [C

    .line 222
    .line 223
    aput-char v1, v5, v4

    .line 224
    .line 225
    invoke-static {v2, v5, v4, p0}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    goto :goto_c

    .line 230
    :cond_d
    if-nez v8, :cond_e

    .line 231
    .line 232
    if-nez v11, :cond_e

    .line 233
    .line 234
    sget-object p0, Lbk1;->γ:Ljava/util/List;

    .line 235
    .line 236
    goto :goto_c

    .line 237
    :cond_e
    sget-object v2, Ljz;->ε:Ljz;

    .line 238
    .line 239
    if-eqz v8, :cond_f

    .line 240
    .line 241
    new-array v5, v3, [C

    .line 242
    .line 243
    aput-char v1, v5, v4

    .line 244
    .line 245
    invoke-static {v8, v5, v4, p0}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    goto :goto_b

    .line 250
    :cond_f
    move-object v5, v2

    .line 251
    :goto_b
    if-eqz v11, :cond_10

    .line 252
    .line 253
    new-array v2, v3, [C

    .line 254
    .line 255
    aput-char v1, v2, v4

    .line 256
    .line 257
    invoke-static {v11, v2, v4, p0}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    :cond_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-le p0, v1, :cond_11

    .line 270
    .line 271
    move-object p0, v5

    .line 272
    goto :goto_c

    .line 273
    :cond_11
    move-object p0, v2

    .line 274
    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    const/16 v5, 0x21

    .line 283
    .line 284
    if-ne v1, v2, :cond_12

    .line 285
    .line 286
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eq v1, v5, :cond_12

    .line 297
    .line 298
    return-object v7

    .line 299
    :cond_12
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-ne v1, v5, :cond_13

    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    :goto_d
    sub-int/2addr v0, p0

    .line 320
    goto :goto_e

    .line 321
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    add-int/2addr p0, v3

    .line 330
    goto :goto_d

    .line 331
    :goto_e
    invoke-static {p1}, Lbk1;->β(Ljava/lang/String;)Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    new-instance p1, Lf7;

    .line 336
    .line 337
    invoke-direct {p1, v3, p0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    if-ltz v0, :cond_16

    .line 341
    .line 342
    if-nez v0, :cond_14

    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_14
    instance-of p0, p1, Ltw;

    .line 346
    .line 347
    if-eqz p0, :cond_15

    .line 348
    .line 349
    check-cast p1, Ltw;

    .line 350
    .line 351
    invoke-interface {p1, v0}, Ltw;->β(I)Lss1;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    goto :goto_f

    .line 356
    :cond_15
    new-instance p0, Lsw;

    .line 357
    .line 358
    invoke-direct {p0, p1, v0, v4}, Lsw;-><init>(Lss1;II)V

    .line 359
    .line 360
    .line 361
    move-object p1, p0

    .line 362
    :goto_f
    const-string p0, "."

    .line 363
    .line 364
    const/16 v0, 0x3e

    .line 365
    .line 366
    invoke-static {p1, p0, v7, v0}, Lus1;->ψ(Lss1;Ljava/lang/String;Lgd1;I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    return-object p0

    .line 371
    :cond_16
    const-string p0, "Requested element count "

    .line 372
    .line 373
    const-string p1, " is less than zero."

    .line 374
    .line 375
    invoke-static {p0, v0, p1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-object v7

    .line 383
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 384
    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v1, "Unable to load "

    .line 388
    .line 389
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    iget-object v1, p0, Li5;->η:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v1, Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string v1, " resource."

    .line 400
    .line 401
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-object p0, p0, Li5;->ζ:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast p0, Ljava/io/IOException;

    .line 414
    .line 415
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 416
    .line 417
    .line 418
    throw p1
.end method
