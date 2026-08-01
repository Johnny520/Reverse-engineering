.class public final Lxhss/ᛸᛳᛶᛸ;
.super Lxhss/ᲁᛳᛸᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛶᲇᲈᛸ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛱᛳᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛸᛳᛶᛸ;->ᛶᲇᲈᛸ:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lxhss/ᛵᛳᲈᛶ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lxhss/ᛸᛳᛶᛸ;->ᛶᲇᲈᛸ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    new-array p0, p0, [J

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    add-int/lit8 v2, v0, 0x1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-long v3, v1

    .line 38
    aput-wide v3, p0, v0

    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object p0

    .line 43
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    new-array p0, p0, [Ljava/lang/Character;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move v1, v0

    .line 56
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    aput-object v2, p0, v1

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    return-object p0

    .line 87
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    new-array p0, p0, [C

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    move v1, v0

    .line 100
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    add-int/lit8 v3, v1, 0x1

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    aput-char v2, p0, v1

    .line 121
    .line 122
    move v1, v3

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    return-object p0

    .line 125
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    new-array p0, p0, [Ljava/lang/Byte;

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_6

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-nez v1, :cond_4

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_4
    instance-of v2, v1, Ljava/lang/Byte;

    .line 151
    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    check-cast v1, Ljava/lang/Byte;

    .line 155
    .line 156
    aput-object v1, p0, v0

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    check-cast v1, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    aput-object v1, p0, v0

    .line 170
    .line 171
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    return-object p0

    .line 175
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    new-array p0, p0, [B

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    add-int/lit8 v2, v0, 0x1

    .line 198
    .line 199
    check-cast v1, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    aput-byte v1, p0, v0

    .line 206
    .line 207
    move v0, v2

    .line 208
    goto :goto_5

    .line 209
    :cond_7
    return-object p0

    .line 210
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    new-array p0, p0, [Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-nez v1, :cond_8

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_8
    instance-of v2, v1, Ljava/lang/Integer;

    .line 236
    .line 237
    if-eqz v2, :cond_9

    .line 238
    .line 239
    check-cast v1, Ljava/lang/Integer;

    .line 240
    .line 241
    aput-object v1, p0, v0

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_9
    check-cast v1, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    aput-object v1, p0, v0

    .line 255
    .line 256
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_a
    return-object p0

    .line 260
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    new-array p0, p0, [I

    .line 267
    .line 268
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_b

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    add-int/lit8 v2, v0, 0x1

    .line 283
    .line 284
    check-cast v1, Ljava/lang/Number;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    aput v1, p0, v0

    .line 291
    .line 292
    move v0, v2

    .line 293
    goto :goto_8

    .line 294
    :cond_b
    return-object p0

    .line 295
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 296
    .line 297
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    new-array p0, p0, [Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    move v1, v0

    .line 308
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_10

    .line 313
    .line 314
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-nez v2, :cond_c

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_c
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 322
    .line 323
    if-eqz v3, :cond_d

    .line 324
    .line 325
    check-cast v2, Ljava/lang/Boolean;

    .line 326
    .line 327
    aput-object v2, p0, v1

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_d
    instance-of v3, v2, Ljava/lang/Number;

    .line 331
    .line 332
    if-eqz v3, :cond_f

    .line 333
    .line 334
    check-cast v2, Ljava/lang/Number;

    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_e

    .line 341
    .line 342
    const/4 v2, 0x1

    .line 343
    goto :goto_a

    .line 344
    :cond_e
    move v2, v0

    .line 345
    :goto_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    aput-object v2, p0, v1

    .line 350
    .line 351
    :goto_b
    add-int/lit8 v1, v1, 0x1

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_f
    new-instance p0, Ljava/lang/RuntimeException;

    .line 355
    .line 356
    new-instance p1, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const-string v0, "can not convert "

    .line 359
    .line 360
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v0, " toBoolean"

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw p0

    .line 379
    :cond_10
    return-object p0

    .line 380
    :pswitch_7
    check-cast p1, Ljava/util/List;

    .line 381
    .line 382
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    new-array p0, p0, [Z

    .line 387
    .line 388
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_11

    .line 397
    .line 398
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    add-int/lit8 v2, v0, 0x1

    .line 403
    .line 404
    check-cast v1, Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    aput-boolean v1, p0, v0

    .line 411
    .line 412
    move v0, v2

    .line 413
    goto :goto_c

    .line 414
    :cond_11
    return-object p0

    .line 415
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 416
    .line 417
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    new-array p0, p0, [Ljava/lang/Double;

    .line 422
    .line 423
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_14

    .line 432
    .line 433
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-nez v1, :cond_12

    .line 438
    .line 439
    goto :goto_d

    .line 440
    :cond_12
    instance-of v2, v1, Ljava/lang/Double;

    .line 441
    .line 442
    if-eqz v2, :cond_13

    .line 443
    .line 444
    check-cast v1, Ljava/lang/Double;

    .line 445
    .line 446
    aput-object v1, p0, v0

    .line 447
    .line 448
    goto :goto_e

    .line 449
    :cond_13
    check-cast v1, Ljava/lang/Number;

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 452
    .line 453
    .line 454
    move-result-wide v1

    .line 455
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    aput-object v1, p0, v0

    .line 460
    .line 461
    :goto_e
    add-int/lit8 v0, v0, 0x1

    .line 462
    .line 463
    goto :goto_d

    .line 464
    :cond_14
    return-object p0

    .line 465
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 466
    .line 467
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 468
    .line 469
    .line 470
    move-result p0

    .line 471
    new-array p0, p0, [D

    .line 472
    .line 473
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    if-eqz v1, :cond_15

    .line 482
    .line 483
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    add-int/lit8 v2, v0, 0x1

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Number;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 492
    .line 493
    .line 494
    move-result-wide v3

    .line 495
    aput-wide v3, p0, v0

    .line 496
    .line 497
    move v0, v2

    .line 498
    goto :goto_f

    .line 499
    :cond_15
    return-object p0

    .line 500
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 501
    .line 502
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 503
    .line 504
    .line 505
    move-result p0

    .line 506
    new-array p0, p0, [Ljava/lang/Float;

    .line 507
    .line 508
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object p1

    .line 512
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    if-eqz v1, :cond_18

    .line 517
    .line 518
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    if-nez v1, :cond_16

    .line 523
    .line 524
    goto :goto_10

    .line 525
    :cond_16
    instance-of v2, v1, Ljava/lang/Float;

    .line 526
    .line 527
    if-eqz v2, :cond_17

    .line 528
    .line 529
    check-cast v1, Ljava/lang/Float;

    .line 530
    .line 531
    aput-object v1, p0, v0

    .line 532
    .line 533
    goto :goto_11

    .line 534
    :cond_17
    check-cast v1, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    aput-object v1, p0, v0

    .line 545
    .line 546
    :goto_11
    add-int/lit8 v0, v0, 0x1

    .line 547
    .line 548
    goto :goto_10

    .line 549
    :cond_18
    return-object p0

    .line 550
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 551
    .line 552
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 553
    .line 554
    .line 555
    move-result p0

    .line 556
    new-array p0, p0, [F

    .line 557
    .line 558
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_19

    .line 567
    .line 568
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    add-int/lit8 v2, v0, 0x1

    .line 573
    .line 574
    check-cast v1, Ljava/lang/Number;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    aput v1, p0, v0

    .line 581
    .line 582
    move v0, v2

    .line 583
    goto :goto_12

    .line 584
    :cond_19
    return-object p0

    .line 585
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 586
    .line 587
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 588
    .line 589
    .line 590
    move-result p0

    .line 591
    new-array p0, p0, [Ljava/lang/Long;

    .line 592
    .line 593
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    if-eqz v1, :cond_1c

    .line 602
    .line 603
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    if-nez v1, :cond_1a

    .line 608
    .line 609
    goto :goto_13

    .line 610
    :cond_1a
    instance-of v2, v1, Ljava/lang/Float;

    .line 611
    .line 612
    if-eqz v2, :cond_1b

    .line 613
    .line 614
    check-cast v1, Ljava/lang/Long;

    .line 615
    .line 616
    aput-object v1, p0, v0

    .line 617
    .line 618
    goto :goto_14

    .line 619
    :cond_1b
    check-cast v1, Ljava/lang/Number;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 622
    .line 623
    .line 624
    move-result-wide v1

    .line 625
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    aput-object v1, p0, v0

    .line 630
    .line 631
    :goto_14
    add-int/lit8 v0, v0, 0x1

    .line 632
    .line 633
    goto :goto_13

    .line 634
    :cond_1c
    return-object p0

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
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
