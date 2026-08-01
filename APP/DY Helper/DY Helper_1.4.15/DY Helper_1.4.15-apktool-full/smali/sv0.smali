.class public final synthetic Lsv0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsv0;->ε:I

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
    .locals 12

    .line 1
    iget p0, p0, Lsv0;->ε:I

    .line 2
    .line 3
    const/16 v0, 0x1f4

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    const/16 v2, 0x64

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Byte;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const-string p1, "%02x"

    .line 22
    .line 23
    and-int/lit16 p0, p0, 0xff

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    const-string v0, "="

    .line 60
    .line 61
    invoke-static {p0, v0, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-lez p1, :cond_0

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    :cond_0
    return-object v3

    .line 88
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance p0, Les0;

    .line 94
    .line 95
    invoke-direct {p0, p1}, Les0;-><init>(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Les0;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_1

    .line 103
    .line 104
    move-object p0, v3

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {p0}, Les0;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 111
    .line 112
    if-eqz p0, :cond_2

    .line 113
    .line 114
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    :cond_2
    const-string p0, "\u7f13\u5b58\u6761\u6570"

    .line 123
    .line 124
    invoke-static {v3, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance p0, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-ge v4, v0, :cond_4

    .line 148
    .line 149
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v0}, Ljx0;->Κ(C)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_3

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 160
    .line 161
    .line 162
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    const-string p1, "200\u6761"

    .line 170
    .line 171
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object p0, Lm41;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_5

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    sget-object p0, Lxn0;->λ:Lxn0;

    .line 199
    .line 200
    monitor-enter p0

    .line 201
    :try_start_0
    sput-object v3, Lxn0;->μ:Ljava/lang/Integer;

    .line 202
    .line 203
    sput-object v3, Lxn0;->ν:Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 204
    .line 205
    monitor-exit p0

    .line 206
    const-string p0, "offline_cache_count_enabled"

    .line 207
    .line 208
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    const-string v3, "offline_cache_count"

    .line 213
    .line 214
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 219
    .line 220
    .line 221
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    :catchall_0
    invoke-static {v2, v1, v0}, Lj81;->μ(III)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    sput-boolean p0, Ljx0;->ρ:Z

    .line 227
    .line 228
    sput v0, Ljx0;->σ:I

    .line 229
    .line 230
    sget-object p0, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 231
    .line 232
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    xor-int/2addr p0, v5

    .line 237
    sget-boolean p1, Ljx0;->ρ:Z

    .line 238
    .line 239
    sget v0, Ljx0;->σ:I

    .line 240
    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v2, "[config] profile_changed uid_present="

    .line 244
    .line 245
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string p0, " enabled="

    .line 252
    .line 253
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string p0, " count="

    .line 260
    .line 261
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {p0}, Lm41;->γ(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 275
    .line 276
    return-object p0

    .line 277
    :catchall_1
    move-exception v0

    .line 278
    move-object p1, v0

    .line 279
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 280
    throw p1

    .line 281
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    const v5, -0x33c1fa48    # -4.9813216E7f

    .line 291
    .line 292
    .line 293
    if-eq p0, v5, :cond_8

    .line 294
    .line 295
    const v5, -0x220f164a

    .line 296
    .line 297
    .line 298
    if-eq p0, v5, :cond_7

    .line 299
    .line 300
    const/16 v5, 0x2a

    .line 301
    .line 302
    if-eq p0, v5, :cond_6

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_6
    const-string p0, "*"

    .line 306
    .line 307
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-eqz p0, :cond_a

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_7
    const-string p0, "offline_cache_count"

    .line 315
    .line 316
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    if-nez p0, :cond_9

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_8
    const-string p0, "offline_cache_count_enabled"

    .line 324
    .line 325
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    if-nez p0, :cond_9

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_9
    :goto_3
    const-string p0, "offline_cache_count_enabled"

    .line 333
    .line 334
    invoke-static {p0, v4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    const-string v4, "offline_cache_count"

    .line 339
    .line 340
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-interface {v5, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 345
    .line 346
    .line 347
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 348
    :catchall_2
    invoke-static {v2, v1, v0}, Lj81;->μ(III)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    sput-boolean p0, Ljx0;->ρ:Z

    .line 353
    .line 354
    sput v0, Ljx0;->σ:I

    .line 355
    .line 356
    sget-object p0, Lxn0;->λ:Lxn0;

    .line 357
    .line 358
    monitor-enter p0

    .line 359
    :try_start_4
    sput-object v3, Lxn0;->ν:Ljava/lang/Integer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 360
    .line 361
    monitor-exit p0

    .line 362
    sget-object p0, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 363
    .line 364
    sget-boolean p0, Ljx0;->ρ:Z

    .line 365
    .line 366
    sget v0, Ljx0;->σ:I

    .line 367
    .line 368
    new-instance v1, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v2, "[config] key="

    .line 371
    .line 372
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string p1, " enabled="

    .line 379
    .line 380
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string p0, " count="

    .line 387
    .line 388
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-static {p0}, Lm41;->γ(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_a
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 402
    .line 403
    return-object p0

    .line 404
    :catchall_3
    move-exception v0

    .line 405
    move-object p1, v0

    .line 406
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 407
    throw p1

    .line 408
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    sget-object p0, Ll41;->α:Ll41;

    .line 414
    .line 415
    invoke-static {p1}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-eqz p0, :cond_b

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 430
    .line 431
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    if-eqz p0, :cond_b

    .line 440
    .line 441
    sget-object p0, Ll41;->ε:Ljava/util/Set;

    .line 442
    .line 443
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    if-eqz p0, :cond_b

    .line 452
    .line 453
    move v4, v5

    .line 454
    :cond_b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    return-object p0

    .line 459
    :pswitch_7
    check-cast p1, Ljava/lang/ClassLoader;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {p1}, Lm41;->β(Ljava/lang/ClassLoader;)V

    .line 465
    .line 466
    .line 467
    sget-object p0, Ls62;->α:Ls62;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_8
    check-cast p1, Ljava/lang/ClassLoader;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    sget-object p0, Ll41;->α:Ll41;

    .line 476
    .line 477
    sget-object p0, Lkx;->Ｍ:Lkx;

    .line 478
    .line 479
    new-instance v0, Lk41;

    .line 480
    .line 481
    invoke-direct {v0, p1, v5}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 482
    .line 483
    .line 484
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    sget-object p0, Lkx;->Ｎ:Lkx;

    .line 489
    .line 490
    new-instance v0, Lk41;

    .line 491
    .line 492
    const/4 v1, 0x2

    .line 493
    invoke-direct {v0, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 494
    .line 495
    .line 496
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    sget-object p0, Lkx;->Ｏ:Lkx;

    .line 501
    .line 502
    new-instance v0, Lk41;

    .line 503
    .line 504
    const/4 v1, 0x3

    .line 505
    invoke-direct {v0, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 506
    .line 507
    .line 508
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    sget-object p0, Lkx;->Ｐ:Lkx;

    .line 513
    .line 514
    new-instance v0, Lk41;

    .line 515
    .line 516
    const/4 v1, 0x4

    .line 517
    invoke-direct {v0, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 518
    .line 519
    .line 520
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    sget-object p0, Lkx;->Ｑ:Lkx;

    .line 525
    .line 526
    new-instance v0, Lk41;

    .line 527
    .line 528
    const/4 v1, 0x5

    .line 529
    invoke-direct {v0, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 530
    .line 531
    .line 532
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 533
    .line 534
    .line 535
    move-result-object v10

    .line 536
    sget-object p0, Lkx;->Ｒ:Lkx;

    .line 537
    .line 538
    new-instance v0, Lk41;

    .line 539
    .line 540
    const/4 v1, 0x6

    .line 541
    invoke-direct {v0, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 542
    .line 543
    .line 544
    invoke-static {p0, p1, v0}, Ll41;->ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;

    .line 545
    .line 546
    .line 547
    move-result-object v11

    .line 548
    filled-new-array/range {v6 .. v11}, [Lqx;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    sget-object p0, Ll41;->α:Ll41;

    .line 563
    .line 564
    invoke-static {p1}, Ll41;->ε(Ljava/lang/reflect/Method;)Z

    .line 565
    .line 566
    .line 567
    move-result p0

    .line 568
    if-eqz p0, :cond_c

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    const-string p1, "offlinemode"

    .line 579
    .line 580
    invoke-static {p0, p1, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 581
    .line 582
    .line 583
    move-result p0

    .line 584
    if-eqz p0, :cond_c

    .line 585
    .line 586
    move v4, v5

    .line 587
    :cond_c
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    return-object p0

    .line 592
    :pswitch_a
    move-object v0, p1

    .line 593
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    const-string v1, "onViewCreated"

    .line 599
    .line 600
    const/4 v4, 0x6

    .line 601
    const/4 v5, 0x0

    .line 602
    const/4 v2, 0x0

    .line 603
    const/4 v3, 0x0

    .line 604
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->name$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 605
    .line 606
    .line 607
    const-string v1, "void"

    .line 608
    .line 609
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 610
    .line 611
    .line 612
    const-string p0, "android.view.View"

    .line 613
    .line 614
    const-string p1, "android.os.Bundle"

    .line 615
    .line 616
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object p0

    .line 620
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 621
    .line 622
    .line 623
    sget-object p0, Ls62;->α:Ls62;

    .line 624
    .line 625
    return-object p0

    .line 626
    :pswitch_b
    move-object v0, p1

    .line 627
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    const-string v1, "int"

    .line 633
    .line 634
    const/4 v4, 0x6

    .line 635
    const/4 v5, 0x0

    .line 636
    const/4 v2, 0x0

    .line 637
    const/4 v3, 0x0

    .line 638
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 642
    .line 643
    .line 644
    const-string p0, "cache_count"

    .line 645
    .line 646
    filled-new-array {p0}, [Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object p0

    .line 650
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 651
    .line 652
    .line 653
    sget-object p0, Ls62;->α:Ls62;

    .line 654
    .line 655
    return-object p0

    .line 656
    :pswitch_c
    move-object v0, p1

    .line 657
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    const-string v1, "void"

    .line 663
    .line 664
    const/4 v4, 0x6

    .line 665
    const/4 v5, 0x0

    .line 666
    const/4 v2, 0x0

    .line 667
    const/4 v3, 0x0

    .line 668
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 669
    .line 670
    .line 671
    const-string p0, "int"

    .line 672
    .line 673
    filled-new-array {p0}, [Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 678
    .line 679
    .line 680
    const-string p0, "cache_count"

    .line 681
    .line 682
    filled-new-array {p0}, [Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 687
    .line 688
    .line 689
    sget-object p0, Ls62;->α:Ls62;

    .line 690
    .line 691
    return-object p0

    .line 692
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 693
    .line 694
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    new-instance p0, Lsv0;

    .line 698
    .line 699
    const/16 v0, 0x11

    .line 700
    .line 701
    invoke-direct {p0, v0}, Lsv0;-><init>(I)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 705
    .line 706
    .line 707
    sget-object p0, Ls62;->α:Ls62;

    .line 708
    .line 709
    return-object p0

    .line 710
    :pswitch_e
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 711
    .line 712
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    new-instance p0, Lsv0;

    .line 716
    .line 717
    const/16 v0, 0x12

    .line 718
    .line 719
    invoke-direct {p0, v0}, Lsv0;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 723
    .line 724
    .line 725
    sget-object p0, Ls62;->α:Ls62;

    .line 726
    .line 727
    return-object p0

    .line 728
    :pswitch_f
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 729
    .line 730
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    new-instance p0, Lsv0;

    .line 734
    .line 735
    const/16 v0, 0x10

    .line 736
    .line 737
    invoke-direct {p0, v0}, Lsv0;-><init>(I)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 741
    .line 742
    .line 743
    sget-object p0, Ls62;->α:Ls62;

    .line 744
    .line 745
    return-object p0

    .line 746
    :pswitch_10
    check-cast p1, Ljava/lang/reflect/Method;

    .line 747
    .line 748
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    sget-object p0, Ll41;->α:Ll41;

    .line 752
    .line 753
    invoke-static {p1}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 754
    .line 755
    .line 756
    move-result p0

    .line 757
    if-eqz p0, :cond_d

    .line 758
    .line 759
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    move-result-object p0

    .line 763
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    const-string v0, "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"

    .line 768
    .line 769
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result p0

    .line 777
    if-eqz p0, :cond_d

    .line 778
    .line 779
    sget-object p0, Ll41;->δ:Ljava/util/Set;

    .line 780
    .line 781
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object p1

    .line 785
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result p0

    .line 789
    if-eqz p0, :cond_d

    .line 790
    .line 791
    move v4, v5

    .line 792
    :cond_d
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    return-object p0

    .line 797
    :pswitch_11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 798
    .line 799
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    sget-object p0, Ll41;->α:Ll41;

    .line 803
    .line 804
    invoke-static {p1}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 805
    .line 806
    .line 807
    move-result p0

    .line 808
    if-eqz p0, :cond_e

    .line 809
    .line 810
    sget-object p0, Ll41;->ζ:Ljava/util/Set;

    .line 811
    .line 812
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result p0

    .line 820
    if-eqz p0, :cond_e

    .line 821
    .line 822
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    move-result-object p0

    .line 826
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object p0

    .line 830
    const-string p1, "offlinemode"

    .line 831
    .line 832
    invoke-static {p0, p1, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 833
    .line 834
    .line 835
    move-result p0

    .line 836
    if-eqz p0, :cond_e

    .line 837
    .line 838
    move v4, v5

    .line 839
    :cond_e
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 840
    .line 841
    .line 842
    move-result-object p0

    .line 843
    return-object p0

    .line 844
    :pswitch_12
    check-cast p1, Lg31;

    .line 845
    .line 846
    iget-object p0, p1, Lg31;->α:Lk1;

    .line 847
    .line 848
    if-eqz p0, :cond_f

    .line 849
    .line 850
    invoke-virtual {p0}, Lk1;->invoke()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    :cond_f
    sget-object p0, Ls62;->α:Ls62;

    .line 854
    .line 855
    return-object p0

    .line 856
    :pswitch_13
    check-cast p1, Lm91;

    .line 857
    .line 858
    new-instance p0, Ljava/lang/StringBuilder;

    .line 859
    .line 860
    const-string v0, "["

    .line 861
    .line 862
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    iget v0, p1, Lm91;->β:I

    .line 866
    .line 867
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    const-string v0, ", "

    .line 871
    .line 872
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    iget p1, p1, Lm91;->γ:I

    .line 876
    .line 877
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 878
    .line 879
    .line 880
    const/16 p1, 0x29

    .line 881
    .line 882
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object p0

    .line 889
    return-object p0

    .line 890
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 891
    .line 892
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    const-string p0, "http"

    .line 896
    .line 897
    invoke-static {p1, p0, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 898
    .line 899
    .line 900
    move-result p0

    .line 901
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 902
    .line 903
    .line 904
    move-result-object p0

    .line 905
    return-object p0

    .line 906
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 907
    .line 908
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    const-string p0, "http"

    .line 912
    .line 913
    invoke-static {p1, p0, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 914
    .line 915
    .line 916
    move-result p0

    .line 917
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 918
    .line 919
    .line 920
    move-result-object p0

    .line 921
    return-object p0

    .line 922
    :pswitch_16
    check-cast p1, Ljava/lang/reflect/Field;

    .line 923
    .line 924
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 928
    .line 929
    .line 930
    move-result p0

    .line 931
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 932
    .line 933
    .line 934
    move-result p0

    .line 935
    xor-int/2addr p0, v5

    .line 936
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 937
    .line 938
    .line 939
    move-result-object p0

    .line 940
    return-object p0

    .line 941
    :pswitch_17
    check-cast p1, Ljava/lang/reflect/Field;

    .line 942
    .line 943
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 947
    .line 948
    .line 949
    move-result p0

    .line 950
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 951
    .line 952
    .line 953
    move-result p0

    .line 954
    xor-int/2addr p0, v5

    .line 955
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 956
    .line 957
    .line 958
    move-result-object p0

    .line 959
    return-object p0

    .line 960
    :pswitch_18
    check-cast p1, Ljava/lang/reflect/Field;

    .line 961
    .line 962
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    move-result-object p0

    .line 969
    const-class p1, Ljava/lang/String;

    .line 970
    .line 971
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result p0

    .line 975
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 976
    .line 977
    .line 978
    move-result-object p0

    .line 979
    return-object p0

    .line 980
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/Field;

    .line 981
    .line 982
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 986
    .line 987
    .line 988
    move-result p0

    .line 989
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 990
    .line 991
    .line 992
    move-result p0

    .line 993
    xor-int/2addr p0, v5

    .line 994
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 995
    .line 996
    .line 997
    move-result-object p0

    .line 998
    return-object p0

    .line 999
    :pswitch_1a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 1000
    .line 1001
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    move-result-object p0

    .line 1005
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    array-length p0, p0

    .line 1009
    if-nez p0, :cond_10

    .line 1010
    .line 1011
    move v4, v5

    .line 1012
    :cond_10
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1013
    .line 1014
    .line 1015
    move-result-object p0

    .line 1016
    return-object p0

    .line 1017
    :pswitch_1b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 1018
    .line 1019
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1020
    .line 1021
    .line 1022
    move-result p0

    .line 1023
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1024
    .line 1025
    .line 1026
    move-result p0

    .line 1027
    xor-int/2addr p0, v5

    .line 1028
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1029
    .line 1030
    .line 1031
    move-result-object p0

    .line 1032
    return-object p0

    .line 1033
    :pswitch_1c
    check-cast p1, Ljava/lang/ClassLoader;

    .line 1034
    .line 1035
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    invoke-static {p1}, Ljx0;->Γ(Ljava/lang/ClassLoader;)V

    .line 1039
    .line 1040
    .line 1041
    sget-object p0, Ls62;->α:Ls62;

    .line 1042
    .line 1043
    return-object p0

    .line 1044
    nop

    .line 1045
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
