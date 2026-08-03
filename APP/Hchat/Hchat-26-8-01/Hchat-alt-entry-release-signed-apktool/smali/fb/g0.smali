.class public final synthetic Lfb/g0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfb/g0;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lfb/g0;->g:I

    .line 2
    .line 3
    const-string v1, "data:"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "%02x"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lfb/a0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_1
    check-cast p1, Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    check-cast p1, Lfb/a0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_4
    check-cast p1, Ljava/lang/Byte;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    and-int/lit16 p1, p1, 0xff

    .line 75
    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_5
    check-cast p1, Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :pswitch_6
    check-cast p1, Ljava/io/File;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_7
    check-cast p1, Ljava/io/File;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "main.java"

    .line 133
    .line 134
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_0

    .line 139
    .line 140
    const-string v0, "js"

    .line 141
    .line 142
    const-string v1, "kt"

    .line 143
    .line 144
    const-string v2, "java"

    .line 145
    .line 146
    const-string v3, "bsh"

    .line 147
    .line 148
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_0

    .line 174
    .line 175
    move v4, v5

    .line 176
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :pswitch_8
    check-cast p1, Lfb/a0;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 187
    .line 188
    return-object p1

    .line 189
    :pswitch_9
    check-cast p1, Lfb/a0;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_a
    check-cast p1, Ljava/lang/Byte;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    and-int/lit16 p1, p1, 0xff

    .line 204
    .line 205
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {v3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    return-object p1

    .line 222
    :pswitch_b
    check-cast p1, Ljava/util/zip/ZipEntry;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_1

    .line 229
    .line 230
    sget-object v0, Lfb/l1;->e:Log/k;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p1}, Log/k;->d(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-eqz p1, :cond_1

    .line 244
    .line 245
    move v4, v5

    .line 246
    :cond_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :pswitch_c
    check-cast p1, Ljava/io/File;

    .line 252
    .line 253
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 254
    .line 255
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 259
    .line 260
    invoke-static {p1, v1}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {v0, p1}, Lfb/g1;->c(Ljava/lang/String;)Lfb/d1;

    .line 265
    .line 266
    .line 267
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    goto :goto_0

    .line 269
    :catchall_0
    move-exception p1

    .line 270
    new-instance v0, Lsf/f;

    .line 271
    .line 272
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    move-object p1, v0

    .line 276
    :goto_0
    nop

    .line 277
    instance-of v0, p1, Lsf/f;

    .line 278
    .line 279
    if-eqz v0, :cond_2

    .line 280
    .line 281
    goto :goto_1

    .line 282
    :cond_2
    move-object v2, p1

    .line 283
    :goto_1
    check-cast v2, Lfb/d1;

    .line 284
    .line 285
    return-object v2

    .line 286
    :pswitch_d
    check-cast p1, Ljava/io/File;

    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_3

    .line 293
    .line 294
    invoke-static {p1}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    const-string v0, "json"

    .line 299
    .line 300
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-eqz p1, :cond_3

    .line 305
    .line 306
    move v4, v5

    .line 307
    :cond_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    return-object p1

    .line 312
    :pswitch_e
    check-cast p1, Ljava/io/File;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    return-object p1

    .line 322
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    new-instance p1, Ljava/lang/Object;

    .line 328
    .line 329
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 330
    .line 331
    .line 332
    return-object p1

    .line 333
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    new-instance p1, Ljava/lang/Object;

    .line 339
    .line 340
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 341
    .line 342
    .line 343
    return-object p1

    .line 344
    :pswitch_11
    check-cast p1, Lfb/d1;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 350
    .line 351
    iget-object p1, p1, Lfb/d1;->e:Ljava/util/List;

    .line 352
    .line 353
    invoke-static {p1}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    return-object p1

    .line 362
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    :try_start_1
    const-class v0, Lfb/v0;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-eqz v0, :cond_4

    .line 374
    .line 375
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    if-eqz p1, :cond_4

    .line 380
    .line 381
    new-instance v0, Ljava/io/InputStreamReader;

    .line 382
    .line 383
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 384
    .line 385
    invoke-direct {v0, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 386
    .line 387
    .line 388
    new-instance p1, Ljava/io/BufferedReader;

    .line 389
    .line 390
    const/16 v1, 0x2000

    .line 391
    .line 392
    invoke-direct {p1, v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 393
    .line 394
    .line 395
    :try_start_2
    invoke-static {p1}, Lr9/e0;->e0(Ljava/io/Reader;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 399
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 400
    .line 401
    .line 402
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 403
    .line 404
    .line 405
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 406
    if-nez p1, :cond_4

    .line 407
    .line 408
    goto :goto_3

    .line 409
    :cond_4
    move-object v0, v2

    .line 410
    goto :goto_3

    .line 411
    :catchall_1
    move-exception p1

    .line 412
    goto :goto_2

    .line 413
    :catchall_2
    move-exception v0

    .line 414
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 415
    :catchall_3
    move-exception v1

    .line 416
    :try_start_5
    invoke-static {p1, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 420
    :goto_2
    new-instance v0, Lsf/f;

    .line 421
    .line 422
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    :goto_3
    instance-of p1, v0, Lsf/f;

    .line 426
    .line 427
    if-eqz p1, :cond_5

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_5
    move-object v2, v0

    .line 431
    :goto_4
    check-cast v2, Ljava/lang/String;

    .line 432
    .line 433
    return-object v2

    .line 434
    :pswitch_13
    check-cast p1, Ljava/lang/Byte;

    .line 435
    .line 436
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    and-int/lit16 p1, p1, 0xff

    .line 441
    .line 442
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-static {v3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    return-object p1

    .line 459
    :pswitch_14
    check-cast p1, Leb/c0;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v0, p1, Leb/c0;->a:Ljava/lang/String;

    .line 465
    .line 466
    iget-object v1, p1, Leb/c0;->h:Ljava/lang/String;

    .line 467
    .line 468
    if-eqz v1, :cond_6

    .line 469
    .line 470
    goto :goto_5

    .line 471
    :cond_6
    iget-object v1, p1, Leb/c0;->b:Ljava/lang/String;

    .line 472
    .line 473
    :goto_5
    iget-object p1, p1, Leb/c0;->f:Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_7

    .line 480
    .line 481
    const-string p1, "unknown"

    .line 482
    .line 483
    :cond_7
    const-string v2, ", name="

    .line 484
    .line 485
    const-string v3, ", version="

    .line 486
    .line 487
    const-string v4, "- id="

    .line 488
    .line 489
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    return-object p1

    .line 501
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    :try_start_6
    new-instance v0, Lorg/json/JSONObject;

    .line 507
    .line 508
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 509
    .line 510
    .line 511
    goto :goto_6

    .line 512
    :catchall_4
    move-exception p1

    .line 513
    new-instance v0, Lsf/f;

    .line 514
    .line 515
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    :goto_6
    instance-of p1, v0, Lsf/f;

    .line 519
    .line 520
    if-eqz p1, :cond_8

    .line 521
    .line 522
    goto :goto_7

    .line 523
    :cond_8
    move-object v2, v0

    .line 524
    :goto_7
    check-cast v2, Lorg/json/JSONObject;

    .line 525
    .line 526
    return-object v2

    .line 527
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    const-string v0, "{"

    .line 533
    .line 534
    invoke-static {p1, v0, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 535
    .line 536
    .line 537
    move-result p1

    .line 538
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    return-object p1

    .line 543
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 544
    .line 545
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-static {p1, v1}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    return-object p1

    .line 561
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-static {p1, v1, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 567
    .line 568
    .line 569
    move-result p1

    .line 570
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    return-object p1

    .line 575
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 576
    .line 577
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    return-object p1

    .line 582
    :pswitch_1a
    check-cast p1, Lfb/l0;

    .line 583
    .line 584
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    iget-object p1, p1, Lfb/l0;->a:Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result p1

    .line 593
    xor-int/2addr p1, v5

    .line 594
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    return-object p1

    .line 599
    :pswitch_1b
    const-class v0, Ll7/m;

    .line 600
    .line 601
    check-cast p1, Lv7/d;

    .line 602
    .line 603
    :try_start_7
    new-instance v1, Lfb/l0;

    .line 604
    .line 605
    iget-object v3, p1, Lv7/d;->k:Lv7/g0;

    .line 606
    .line 607
    instance-of v5, v3, Lv7/b0;

    .line 608
    .line 609
    if-eqz v5, :cond_9

    .line 610
    .line 611
    check-cast v3, Lv7/b0;

    .line 612
    .line 613
    iget-object v3, v3, Lv7/g0;->l:Lk7/a;

    .line 614
    .line 615
    check-cast v3, Lv7/d0;

    .line 616
    .line 617
    goto :goto_8

    .line 618
    :cond_9
    move-object v3, v2

    .line 619
    :goto_8
    if-eqz v3, :cond_a

    .line 620
    .line 621
    invoke-virtual {v3}, Lv7/j0;->S()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    goto :goto_9

    .line 626
    :cond_a
    move-object v3, v2

    .line 627
    :goto_9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-virtual {p1, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    check-cast v5, Ll7/m;

    .line 635
    .line 636
    if-eqz v5, :cond_b

    .line 637
    .line 638
    iget-object v5, v5, Ll7/a;->m:Lp7/a;

    .line 639
    .line 640
    check-cast v5, Lp7/k;

    .line 641
    .line 642
    iget-object v5, v5, Lp7/k;->v:Lv7/y;

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_b
    move-object v5, v2

    .line 646
    :goto_a
    if-eqz v5, :cond_c

    .line 647
    .line 648
    invoke-virtual {v5}, Lv7/y;->T()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v5

    .line 652
    goto :goto_b

    .line 653
    :catchall_5
    move-exception p1

    .line 654
    goto :goto_d

    .line 655
    :cond_c
    move-object v5, v2

    .line 656
    :goto_b
    if-nez v5, :cond_d

    .line 657
    .line 658
    const-string v5, ""

    .line 659
    .line 660
    :cond_d
    invoke-virtual {p1, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    check-cast p1, Ll7/m;

    .line 665
    .line 666
    if-eqz p1, :cond_e

    .line 667
    .line 668
    iget-object p1, p1, Ll7/a;->m:Lp7/a;

    .line 669
    .line 670
    check-cast p1, Lp7/k;

    .line 671
    .line 672
    iget-object p1, p1, Lp7/k;->v:Lv7/y;

    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_e
    move-object p1, v2

    .line 676
    :goto_c
    if-eqz p1, :cond_f

    .line 677
    .line 678
    iget-object p1, p1, Lv7/z;->n:Lv7/a0;

    .line 679
    .line 680
    invoke-virtual {p1}, Lr7/b;->r()[B

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    invoke-static {p1}, Lv7/z;->R([B)Z

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    :cond_f
    invoke-direct {v1, v3, v5, v4}, Lfb/l0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 689
    .line 690
    .line 691
    goto :goto_e

    .line 692
    :goto_d
    new-instance v1, Lsf/f;

    .line 693
    .line 694
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 695
    .line 696
    .line 697
    :goto_e
    instance-of p1, v1, Lsf/f;

    .line 698
    .line 699
    if-eqz p1, :cond_10

    .line 700
    .line 701
    goto :goto_f

    .line 702
    :cond_10
    move-object v2, v1

    .line 703
    :goto_f
    check-cast v2, Lfb/l0;

    .line 704
    .line 705
    return-object v2

    .line 706
    :pswitch_1c
    check-cast p1, Ljava/lang/Byte;

    .line 707
    .line 708
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 709
    .line 710
    .line 711
    move-result p1

    .line 712
    and-int/lit16 p1, p1, 0xff

    .line 713
    .line 714
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object p1

    .line 722
    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object p1

    .line 726
    invoke-static {v3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object p1

    .line 730
    return-object p1

    .line 731
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
