.class public final Lxhss/ᛸᛵᛷᲁ;
.super Lxhss/ᛵᛳᲈᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛱᛳᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lxhss/ᛵᛳᲈᛶ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const-class v0, Ljava/lang/Float;

    .line 4
    .line 5
    const-class v1, Ljava/math/BigDecimal;

    .line 6
    .line 7
    const-class v2, Ljava/lang/Double;

    .line 8
    .line 9
    const-class v3, Ljava/lang/Integer;

    .line 10
    .line 11
    const-class v4, Ljava/lang/String;

    .line 12
    .line 13
    const-class v5, Ljava/lang/Long;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    :goto_0
    return-object v6

    .line 28
    :pswitch_1
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    move-object v6, p1

    .line 43
    check-cast v6, Ljava/lang/Long;

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    check-cast p1, Ljava/lang/Double;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Double;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide p0

    .line 84
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_5

    .line 98
    .line 99
    check-cast p1, Ljava/math/BigDecimal;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide p0

    .line 105
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_6

    .line 119
    .line 120
    check-cast p1, Ljava/lang/Float;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Float;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide p0

    .line 126
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    goto :goto_1

    .line 131
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_7

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :goto_1
    return-object v6

    .line 162
    :pswitch_2
    if-nez p1, :cond_8

    .line 163
    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-eqz p0, :cond_9

    .line 175
    .line 176
    move-object v6, p1

    .line 177
    check-cast v6, Ljava/lang/Integer;

    .line 178
    .line 179
    goto/16 :goto_2

    .line 180
    .line 181
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-eqz p0, :cond_a

    .line 190
    .line 191
    check-cast p1, Ljava/lang/Long;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    goto :goto_2

    .line 202
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_b

    .line 211
    .line 212
    check-cast p1, Ljava/lang/Double;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Double;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    goto :goto_2

    .line 223
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-eqz p0, :cond_c

    .line 232
    .line 233
    check-cast p1, Ljava/math/BigDecimal;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    goto :goto_2

    .line 244
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    if-eqz p0, :cond_d

    .line 253
    .line 254
    check-cast p1, Ljava/lang/Float;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Float;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    goto :goto_2

    .line 265
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    if-eqz p0, :cond_e

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    goto :goto_2

    .line 284
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :goto_2
    return-object v6

    .line 296
    :pswitch_3
    if-nez p1, :cond_f

    .line 297
    .line 298
    goto/16 :goto_3

    .line 299
    .line 300
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 305
    .line 306
    .line 307
    move-result p0

    .line 308
    if-eqz p0, :cond_10

    .line 309
    .line 310
    move-object v6, p1

    .line 311
    check-cast v6, Ljava/lang/Float;

    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {v3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    if-eqz p0, :cond_11

    .line 324
    .line 325
    check-cast p1, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Integer;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    goto :goto_3

    .line 336
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-eqz p0, :cond_12

    .line 345
    .line 346
    check-cast p1, Ljava/lang/Long;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Long;->floatValue()F

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    goto :goto_3

    .line 357
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    if-eqz p0, :cond_13

    .line 366
    .line 367
    check-cast p1, Ljava/math/BigDecimal;

    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    .line 370
    .line 371
    .line 372
    move-result p0

    .line 373
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    goto :goto_3

    .line 378
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    if-eqz p0, :cond_14

    .line 387
    .line 388
    check-cast p1, Ljava/lang/Double;

    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    goto :goto_3

    .line 399
    :cond_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    if-eqz p0, :cond_15

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-static {p0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    goto :goto_3

    .line 418
    :cond_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :goto_3
    return-object v6

    .line 430
    :pswitch_4
    if-nez p1, :cond_16

    .line 431
    .line 432
    goto/16 :goto_4

    .line 433
    .line 434
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    if-eqz p0, :cond_17

    .line 443
    .line 444
    move-object v6, p1

    .line 445
    check-cast v6, Ljava/lang/Double;

    .line 446
    .line 447
    goto/16 :goto_4

    .line 448
    .line 449
    :cond_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-virtual {v3, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 454
    .line 455
    .line 456
    move-result p0

    .line 457
    if-eqz p0, :cond_18

    .line 458
    .line 459
    check-cast p1, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Integer;->doubleValue()D

    .line 462
    .line 463
    .line 464
    move-result-wide p0

    .line 465
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    goto :goto_4

    .line 470
    :cond_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    if-eqz p0, :cond_19

    .line 479
    .line 480
    check-cast p1, Ljava/lang/Long;

    .line 481
    .line 482
    invoke-virtual {p1}, Ljava/lang/Long;->doubleValue()D

    .line 483
    .line 484
    .line 485
    move-result-wide p0

    .line 486
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    goto :goto_4

    .line 491
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 496
    .line 497
    .line 498
    move-result p0

    .line 499
    if-eqz p0, :cond_1a

    .line 500
    .line 501
    check-cast p1, Ljava/math/BigDecimal;

    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 504
    .line 505
    .line 506
    move-result-wide p0

    .line 507
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    goto :goto_4

    .line 512
    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    if-eqz p0, :cond_1b

    .line 521
    .line 522
    check-cast p1, Ljava/lang/Float;

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/Float;->doubleValue()D

    .line 525
    .line 526
    .line 527
    move-result-wide p0

    .line 528
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    goto :goto_4

    .line 533
    :cond_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 538
    .line 539
    .line 540
    move-result p0

    .line 541
    if-eqz p0, :cond_1c

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    goto :goto_4

    .line 552
    :cond_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :goto_4
    return-object v6

    .line 564
    :pswitch_5
    if-nez p1, :cond_1d

    .line 565
    .line 566
    goto :goto_5

    .line 567
    :cond_1d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    const-class v0, Ljava/util/Date;

    .line 572
    .line 573
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    if-eqz p0, :cond_1e

    .line 578
    .line 579
    move-object v6, p1

    .line 580
    check-cast v6, Ljava/util/Date;

    .line 581
    .line 582
    goto :goto_5

    .line 583
    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    move-result-object p0

    .line 587
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 588
    .line 589
    .line 590
    move-result p0

    .line 591
    if-eqz p0, :cond_1f

    .line 592
    .line 593
    new-instance v6, Ljava/util/Date;

    .line 594
    .line 595
    check-cast p1, Ljava/lang/Long;

    .line 596
    .line 597
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 598
    .line 599
    .line 600
    move-result-wide p0

    .line 601
    invoke-direct {v6, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 602
    .line 603
    .line 604
    goto :goto_5

    .line 605
    :cond_1f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    invoke-virtual {v4, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 610
    .line 611
    .line 612
    move-result p0

    .line 613
    if-eqz p0, :cond_20

    .line 614
    .line 615
    :try_start_0
    invoke-static {}, Ljava/text/DateFormat;->getInstance()Ljava/text/DateFormat;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 624
    .line 625
    .line 626
    move-result-object v6
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 627
    goto :goto_5

    .line 628
    :catch_0
    move-exception p0

    .line 629
    new-instance p1, Lxhss/ᛷᛴᛵᛴ;

    .line 630
    .line 631
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 632
    .line 633
    .line 634
    throw p1

    .line 635
    :cond_20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :goto_5
    return-object v6

    .line 647
    :pswitch_6
    if-nez p1, :cond_21

    .line 648
    .line 649
    goto :goto_6

    .line 650
    :cond_21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    const-class v0, Ljava/lang/Boolean;

    .line 655
    .line 656
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 657
    .line 658
    .line 659
    move-result p0

    .line 660
    if-eqz p0, :cond_22

    .line 661
    .line 662
    move-object v6, p1

    .line 663
    check-cast v6, Ljava/lang/Boolean;

    .line 664
    .line 665
    goto :goto_6

    .line 666
    :cond_22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    :goto_6
    return-object v6

    .line 678
    :pswitch_7
    if-nez p1, :cond_23

    .line 679
    .line 680
    goto :goto_7

    .line 681
    :cond_23
    new-instance v6, Ljava/math/BigInteger;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    invoke-direct {v6, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    :goto_7
    return-object v6

    .line 691
    :pswitch_8
    if-nez p1, :cond_24

    .line 692
    .line 693
    goto :goto_8

    .line 694
    :cond_24
    new-instance v6, Ljava/math/BigDecimal;

    .line 695
    .line 696
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    invoke-direct {v6, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    :goto_8
    return-object v6

    .line 704
    nop

    .line 705
    :pswitch_data_0
    .packed-switch 0x2
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

.method public ᛳᲁᲇᛸ()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lxhss/ᛵᛳᲈᛶ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance p0, Lxhss/ᛸᛱᲈᛵ;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_1
    new-instance p0, Lxhss/ᛸᛱᲈᛵ;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lxhss/ᛵᛳᲈᛶ;->ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast p1, Lxhss/ᛸᛲᛷᲇ;

    .line 17
    .line 18
    invoke-virtual {p1, p2, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, Lxhss/ᛸᛱᲈᛵ;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    check-cast p1, Lxhss/ᛸᛱᲈᛵ;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᲀᲇᛳᲁ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lxhss/ᛵᛳᲈᛶ;->ᲀᲇᛳᲁ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lxhss/ᛸᛵᛷᲁ;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    iget-object p0, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 19
    .line 20
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lxhss/ᛸᛵᛷᲁ;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᛴᲇᛵ()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lxhss/ᛵᛳᲈᛶ;->ᲇᛴᲇᛵ()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_1
    new-instance p0, Lxhss/ᛸᛲᛷᲇ;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᛸᛵᛷᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lxhss/ᛵᛳᲈᛶ;->ᲇᛶᛴᲀ(Ljava/lang/String;)Lxhss/ᛵᛳᲈᛶ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lxhss/ᛸᛵᛷᲁ;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    iget-object p0, p0, Lxhss/ᛵᛳᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛱᛳᲁ;

    .line 19
    .line 20
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lxhss/ᛸᛵᛷᲁ;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
