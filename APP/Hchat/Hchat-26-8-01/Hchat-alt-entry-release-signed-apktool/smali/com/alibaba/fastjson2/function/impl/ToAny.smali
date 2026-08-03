.class public final Lcom/alibaba/fastjson2/function/impl/ToAny;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field private defaultValue:Ljava/lang/Object;

.field private final targetClass:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->targetClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->defaultValue:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->defaultValue:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->targetClass:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->targetClass:Ljava/lang/Class;

    .line 16
    .line 17
    const-class v1, Ljava/lang/String;

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_2
    const-class v1, Ljava/math/BigDecimal;

    .line 27
    .line 28
    if-ne v0, v1, :cond_a

    .line 29
    .line 30
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_3
    sget-object p1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_4
    instance-of v0, p1, Ljava/lang/Byte;

    .line 49
    .line 50
    if-nez v0, :cond_9

    .line 51
    .line 52
    instance-of v0, p1, Ljava/lang/Short;

    .line 53
    .line 54
    if-nez v0, :cond_9

    .line 55
    .line 56
    instance-of v0, p1, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v0, :cond_9

    .line 59
    .line 60
    instance-of v0, p1, Ljava/lang/Long;

    .line 61
    .line 62
    if-nez v0, :cond_9

    .line 63
    .line 64
    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 65
    .line 66
    if-nez v0, :cond_9

    .line 67
    .line 68
    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    instance-of v0, p1, Ljava/lang/Float;

    .line 74
    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    instance-of v0, p1, Ljava/lang/Double;

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    new-instance v0, Ljava/math/BigDecimal;

    .line 87
    .line 88
    check-cast p1, Ljava/math/BigInteger;

    .line 89
    .line 90
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v0, :cond_38

    .line 97
    .line 98
    new-instance v0, Ljava/math/BigDecimal;

    .line 99
    .line 100
    check-cast p1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_8
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(D)Ljava/math/BigDecimal;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :cond_9
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :cond_a
    const-class v1, Ljava/math/BigInteger;

    .line 129
    .line 130
    if-ne v0, v1, :cond_f

    .line 131
    .line 132
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 133
    .line 134
    if-eqz v0, :cond_c

    .line 135
    .line 136
    check-cast p1, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_b

    .line 143
    .line 144
    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_b
    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_c
    instance-of v0, p1, Ljava/lang/Byte;

    .line 151
    .line 152
    if-nez v0, :cond_e

    .line 153
    .line 154
    instance-of v0, p1, Ljava/lang/Short;

    .line 155
    .line 156
    if-nez v0, :cond_e

    .line 157
    .line 158
    instance-of v0, p1, Ljava/lang/Integer;

    .line 159
    .line 160
    if-nez v0, :cond_e

    .line 161
    .line 162
    instance-of v0, p1, Ljava/lang/Long;

    .line 163
    .line 164
    if-nez v0, :cond_e

    .line 165
    .line 166
    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 167
    .line 168
    if-nez v0, :cond_e

    .line 169
    .line 170
    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 171
    .line 172
    if-nez v0, :cond_e

    .line 173
    .line 174
    instance-of v0, p1, Ljava/lang/Float;

    .line 175
    .line 176
    if-nez v0, :cond_e

    .line 177
    .line 178
    instance-of v0, p1, Ljava/lang/Double;

    .line 179
    .line 180
    if-eqz v0, :cond_d

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_d
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 184
    .line 185
    if-eqz v0, :cond_38

    .line 186
    .line 187
    check-cast p1, Ljava/math/BigDecimal;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1

    .line 194
    :cond_e
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 197
    .line 198
    .line 199
    move-result-wide v0

    .line 200
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :cond_f
    const-class v1, Ljava/lang/Boolean;

    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    if-ne v0, v1, :cond_23

    .line 209
    .line 210
    instance-of v0, p1, Ljava/lang/Number;

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    if-eqz v0, :cond_11

    .line 214
    .line 215
    check-cast p1, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-ne p1, v1, :cond_10

    .line 222
    .line 223
    move v2, v1

    .line 224
    :cond_10
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1

    .line 229
    :cond_11
    instance-of v0, p1, Ljava/lang/String;

    .line 230
    .line 231
    if-eqz v0, :cond_38

    .line 232
    .line 233
    move-object v0, p1

    .line 234
    check-cast v0, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    const/4 v4, -0x1

    .line 241
    sparse-switch v3, :sswitch_data_0

    .line 242
    .line 243
    .line 244
    :goto_3
    move v2, v4

    .line 245
    goto/16 :goto_4

    .line 246
    .line 247
    :sswitch_0
    const-string v1, "false"

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_12

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_12
    const/16 v2, 0x10

    .line 257
    .line 258
    goto/16 :goto_4

    .line 259
    .line 260
    :sswitch_1
    const-string v1, "False"

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_13

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_13
    const/16 v2, 0xf

    .line 270
    .line 271
    goto/16 :goto_4

    .line 272
    .line 273
    :sswitch_2
    const-string v1, "FALSE"

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-nez v0, :cond_14

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_14
    const/16 v2, 0xe

    .line 283
    .line 284
    goto/16 :goto_4

    .line 285
    .line 286
    :sswitch_3
    const-string v1, "true"

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_15

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_15
    const/16 v2, 0xd

    .line 296
    .line 297
    goto/16 :goto_4

    .line 298
    .line 299
    :sswitch_4
    const-string v1, "null"

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-nez v0, :cond_16

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_16
    const/16 v2, 0xc

    .line 309
    .line 310
    goto/16 :goto_4

    .line 311
    .line 312
    :sswitch_5
    const-string v1, "True"

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-nez v0, :cond_17

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_17
    const/16 v2, 0xb

    .line 322
    .line 323
    goto/16 :goto_4

    .line 324
    .line 325
    :sswitch_6
    const-string v1, "TRUE"

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-nez v0, :cond_18

    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_18
    const/16 v2, 0xa

    .line 335
    .line 336
    goto/16 :goto_4

    .line 337
    .line 338
    :sswitch_7
    const-string v1, "yes"

    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_19

    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_19
    const/16 v2, 0x9

    .line 348
    .line 349
    goto/16 :goto_4

    .line 350
    .line 351
    :sswitch_8
    const-string v1, "Yes"

    .line 352
    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_1a

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_1a
    const/16 v2, 0x8

    .line 361
    .line 362
    goto/16 :goto_4

    .line 363
    .line 364
    :sswitch_9
    const-string v1, "YES"

    .line 365
    .line 366
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-nez v0, :cond_1b

    .line 371
    .line 372
    goto/16 :goto_3

    .line 373
    .line 374
    :cond_1b
    const/4 v2, 0x7

    .line 375
    goto :goto_4

    .line 376
    :sswitch_a
    const-string v1, "no"

    .line 377
    .line 378
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_1c

    .line 383
    .line 384
    goto/16 :goto_3

    .line 385
    .line 386
    :cond_1c
    const/4 v2, 0x6

    .line 387
    goto :goto_4

    .line 388
    :sswitch_b
    const-string v1, "No"

    .line 389
    .line 390
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-nez v0, :cond_1d

    .line 395
    .line 396
    goto/16 :goto_3

    .line 397
    .line 398
    :cond_1d
    const/4 v2, 0x5

    .line 399
    goto :goto_4

    .line 400
    :sswitch_c
    const-string v1, "NO"

    .line 401
    .line 402
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_1e

    .line 407
    .line 408
    goto/16 :goto_3

    .line 409
    .line 410
    :cond_1e
    const/4 v2, 0x4

    .line 411
    goto :goto_4

    .line 412
    :sswitch_d
    const-string v1, "Y"

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-nez v0, :cond_1f

    .line 419
    .line 420
    goto/16 :goto_3

    .line 421
    .line 422
    :cond_1f
    const/4 v2, 0x3

    .line 423
    goto :goto_4

    .line 424
    :sswitch_e
    const-string v1, "T"

    .line 425
    .line 426
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_20

    .line 431
    .line 432
    goto/16 :goto_3

    .line 433
    .line 434
    :cond_20
    const/4 v2, 0x2

    .line 435
    goto :goto_4

    .line 436
    :sswitch_f
    const-string v2, "N"

    .line 437
    .line 438
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_21

    .line 443
    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :cond_21
    move v2, v1

    .line 447
    goto :goto_4

    .line 448
    :sswitch_10
    const-string v1, "F"

    .line 449
    .line 450
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-nez v0, :cond_22

    .line 455
    .line 456
    goto/16 :goto_3

    .line 457
    .line 458
    :cond_22
    :goto_4
    packed-switch v2, :pswitch_data_0

    .line 459
    .line 460
    .line 461
    goto/16 :goto_9

    .line 462
    .line 463
    :pswitch_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->defaultValue:Ljava/lang/Object;

    .line 464
    .line 465
    return-object p1

    .line 466
    :pswitch_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 467
    .line 468
    return-object p1

    .line 469
    :pswitch_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 470
    .line 471
    return-object p1

    .line 472
    :cond_23
    const-class v1, Ljava/lang/Byte;

    .line 473
    .line 474
    if-ne v0, v1, :cond_25

    .line 475
    .line 476
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 477
    .line 478
    if-eqz v0, :cond_24

    .line 479
    .line 480
    check-cast p1, Ljava/lang/Boolean;

    .line 481
    .line 482
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    return-object p1

    .line 491
    :cond_24
    instance-of v0, p1, Ljava/lang/Number;

    .line 492
    .line 493
    if-eqz v0, :cond_38

    .line 494
    .line 495
    check-cast p1, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    return-object p1

    .line 506
    :cond_25
    const-class v1, Ljava/lang/Double;

    .line 507
    .line 508
    if-ne v0, v1, :cond_2c

    .line 509
    .line 510
    instance-of v0, p1, Ljava/lang/Number;

    .line 511
    .line 512
    if-eqz v0, :cond_26

    .line 513
    .line 514
    check-cast p1, Ljava/lang/Number;

    .line 515
    .line 516
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 517
    .line 518
    .line 519
    move-result-wide v0

    .line 520
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    return-object p1

    .line 525
    :cond_26
    instance-of v0, p1, Ljava/lang/String;

    .line 526
    .line 527
    if-eqz v0, :cond_28

    .line 528
    .line 529
    check-cast p1, Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-eqz v0, :cond_27

    .line 536
    .line 537
    iget-object p1, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->defaultValue:Ljava/lang/Object;

    .line 538
    .line 539
    return-object p1

    .line 540
    :cond_27
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 541
    .line 542
    .line 543
    move-result-wide v0

    .line 544
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    return-object p1

    .line 549
    :cond_28
    instance-of v0, p1, Ljava/util/List;

    .line 550
    .line 551
    if-eqz v0, :cond_2a

    .line 552
    .line 553
    check-cast p1, Ljava/util/List;

    .line 554
    .line 555
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 556
    .line 557
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 562
    .line 563
    .line 564
    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    if-ge v2, v1, :cond_29

    .line 569
    .line 570
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/function/impl/ToAny;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    add-int/lit8 v2, v2, 0x1

    .line 582
    .line 583
    goto :goto_5

    .line 584
    :cond_29
    return-object v0

    .line 585
    :cond_2a
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 586
    .line 587
    if-eqz v0, :cond_38

    .line 588
    .line 589
    check-cast p1, Ljava/lang/Boolean;

    .line 590
    .line 591
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 592
    .line 593
    .line 594
    move-result p1

    .line 595
    if-eqz p1, :cond_2b

    .line 596
    .line 597
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_2b
    const-wide/16 v0, 0x0

    .line 601
    .line 602
    :goto_6
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    return-object p1

    .line 607
    :cond_2c
    const-class v1, Ljava/lang/Float;

    .line 608
    .line 609
    if-ne v0, v1, :cond_2f

    .line 610
    .line 611
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 612
    .line 613
    if-eqz v0, :cond_2e

    .line 614
    .line 615
    check-cast p1, Ljava/lang/Boolean;

    .line 616
    .line 617
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 618
    .line 619
    .line 620
    move-result p1

    .line 621
    if-eqz p1, :cond_2d

    .line 622
    .line 623
    const/high16 p1, 0x3f800000    # 1.0f

    .line 624
    .line 625
    goto :goto_7

    .line 626
    :cond_2d
    const/4 p1, 0x0

    .line 627
    :goto_7
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    return-object p1

    .line 632
    :cond_2e
    instance-of v0, p1, Ljava/lang/Number;

    .line 633
    .line 634
    if-eqz v0, :cond_38

    .line 635
    .line 636
    check-cast p1, Ljava/lang/Number;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 639
    .line 640
    .line 641
    move-result p1

    .line 642
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    return-object p1

    .line 647
    :cond_2f
    const-class v1, Ljava/lang/Integer;

    .line 648
    .line 649
    if-ne v0, v1, :cond_31

    .line 650
    .line 651
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 652
    .line 653
    if-eqz v0, :cond_30

    .line 654
    .line 655
    check-cast p1, Ljava/lang/Boolean;

    .line 656
    .line 657
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 658
    .line 659
    .line 660
    move-result p1

    .line 661
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    return-object p1

    .line 666
    :cond_30
    instance-of v0, p1, Ljava/lang/Number;

    .line 667
    .line 668
    if-eqz v0, :cond_38

    .line 669
    .line 670
    check-cast p1, Ljava/lang/Number;

    .line 671
    .line 672
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 673
    .line 674
    .line 675
    move-result p1

    .line 676
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 677
    .line 678
    .line 679
    move-result-object p1

    .line 680
    return-object p1

    .line 681
    :cond_31
    const-class v1, Ljava/lang/Long;

    .line 682
    .line 683
    if-ne v0, v1, :cond_34

    .line 684
    .line 685
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 686
    .line 687
    if-eqz v0, :cond_33

    .line 688
    .line 689
    check-cast p1, Ljava/lang/Boolean;

    .line 690
    .line 691
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 692
    .line 693
    .line 694
    move-result p1

    .line 695
    if-eqz p1, :cond_32

    .line 696
    .line 697
    const-wide/16 v0, 0x1

    .line 698
    .line 699
    goto :goto_8

    .line 700
    :cond_32
    const-wide/16 v0, 0x0

    .line 701
    .line 702
    :goto_8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 703
    .line 704
    .line 705
    move-result-object p1

    .line 706
    return-object p1

    .line 707
    :cond_33
    instance-of v0, p1, Ljava/lang/Number;

    .line 708
    .line 709
    if-eqz v0, :cond_38

    .line 710
    .line 711
    check-cast p1, Ljava/lang/Number;

    .line 712
    .line 713
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 714
    .line 715
    .line 716
    move-result-wide v0

    .line 717
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 718
    .line 719
    .line 720
    move-result-object p1

    .line 721
    return-object p1

    .line 722
    :cond_34
    const-class v1, Ljava/lang/Short;

    .line 723
    .line 724
    if-ne v0, v1, :cond_36

    .line 725
    .line 726
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 727
    .line 728
    if-eqz v0, :cond_35

    .line 729
    .line 730
    check-cast p1, Ljava/lang/Boolean;

    .line 731
    .line 732
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 733
    .line 734
    .line 735
    move-result p1

    .line 736
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 737
    .line 738
    .line 739
    move-result-object p1

    .line 740
    return-object p1

    .line 741
    :cond_35
    instance-of v0, p1, Ljava/lang/Number;

    .line 742
    .line 743
    if-eqz v0, :cond_38

    .line 744
    .line 745
    check-cast p1, Ljava/lang/Number;

    .line 746
    .line 747
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 748
    .line 749
    .line 750
    move-result p1

    .line 751
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 752
    .line 753
    .line 754
    move-result-object p1

    .line 755
    return-object p1

    .line 756
    :cond_36
    const-class v1, Ljava/lang/Number;

    .line 757
    .line 758
    if-ne v0, v1, :cond_38

    .line 759
    .line 760
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 761
    .line 762
    if-eqz v0, :cond_37

    .line 763
    .line 764
    check-cast p1, Ljava/lang/Boolean;

    .line 765
    .line 766
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 767
    .line 768
    .line 769
    move-result p1

    .line 770
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    return-object p1

    .line 775
    :cond_37
    instance-of v0, p1, Ljava/lang/Number;

    .line 776
    .line 777
    if-eqz v0, :cond_38

    .line 778
    .line 779
    return-object p1

    .line 780
    :cond_38
    :goto_9
    iget-object v0, p0, Lcom/alibaba/fastjson2/function/impl/ToAny;->targetClass:Ljava/lang/Class;

    .line 781
    .line 782
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    const-string v1, " "

    .line 787
    .line 788
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    const-string v2, "can not cast to "

    .line 793
    .line 794
    invoke-static {v2, v0, v1, p1}, Lah/a;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    const/4 p1, 0x0

    .line 798
    return-object p1

    .line 799
    :sswitch_data_0
    .sparse-switch
        0x46 -> :sswitch_10
        0x4e -> :sswitch_f
        0x54 -> :sswitch_e
        0x59 -> :sswitch_d
        0x9c1 -> :sswitch_c
        0x9e1 -> :sswitch_b
        0xdc1 -> :sswitch_a
        0x156c7 -> :sswitch_9
        0x15ac7 -> :sswitch_8
        0x1d2e7 -> :sswitch_7
        0x276d8e -> :sswitch_6
        0x27e9ae -> :sswitch_5
        0x33c587 -> :sswitch_4
        0x36758e -> :sswitch_3
        0x3f92103 -> :sswitch_2
        0x4082903 -> :sswitch_1
        0x5cb1923 -> :sswitch_0
    .end sparse-switch

    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
