.class public final Lfb/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfb/r;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Lfb/r;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x2f

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-ge v1, v3, :cond_2

    .line 19
    .line 20
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ne v3, v4, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v5, v0

    .line 36
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    move v1, v0

    .line 58
    move v2, v1

    .line 59
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ge v1, v3, :cond_5

    .line 64
    .line 65
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne v3, v4, :cond_3

    .line 78
    .line 79
    move v3, v5

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move v3, v0

    .line 82
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1

    .line 106
    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/CharSequence;

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    move v1, v0

    .line 116
    move v2, v1

    .line 117
    :goto_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    const/16 v4, 0x2f

    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    if-ge v1, v3, :cond_8

    .line 125
    .line 126
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-ne v3, v4, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    move v5, v0

    .line 142
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p2, Ljava/util/Map$Entry;

    .line 162
    .line 163
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    check-cast p2, Ljava/lang/CharSequence;

    .line 168
    .line 169
    move v1, v0

    .line 170
    move v2, v1

    .line 171
    :goto_6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-ge v1, v3, :cond_b

    .line 176
    .line 177
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-ne v3, v4, :cond_9

    .line 190
    .line 191
    move v3, v5

    .line 192
    goto :goto_7

    .line 193
    :cond_9
    move v3, v0

    .line 194
    :goto_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_a

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    .line 206
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    return p1

    .line 218
    :pswitch_1
    check-cast p2, Ljava/io/File;

    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    check-cast p1, Ljava/io/File;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 231
    .line 232
    .line 233
    move-result-wide v0

    .line 234
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    return p1

    .line 243
    :pswitch_2
    check-cast p2, Ljava/io/File;

    .line 244
    .line 245
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 246
    .line 247
    .line 248
    move-result-wide v0

    .line 249
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    check-cast p1, Ljava/io/File;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 256
    .line 257
    .line 258
    move-result-wide v0

    .line 259
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    return p1

    .line 268
    :pswitch_3
    check-cast p1, Ljava/io/File;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    check-cast p2, Ljava/io/File;

    .line 275
    .line 276
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    return p1

    .line 285
    :pswitch_4
    check-cast p2, Ljava/lang/String;

    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    move v1, v0

    .line 289
    move v2, v1

    .line 290
    :goto_8
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    const/16 v4, 0x2f

    .line 295
    .line 296
    const/4 v5, 0x1

    .line 297
    if-ge v1, v3, :cond_e

    .line 298
    .line 299
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-ne v3, v4, :cond_c

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_c
    move v5, v0

    .line 315
    :goto_9
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_d

    .line 324
    .line 325
    add-int/lit8 v2, v2, 0x1

    .line 326
    .line 327
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    check-cast p1, Ljava/lang/String;

    .line 335
    .line 336
    move v1, v0

    .line 337
    move v2, v1

    .line 338
    :goto_a
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-ge v1, v3, :cond_11

    .line 343
    .line 344
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-ne v3, v4, :cond_f

    .line 357
    .line 358
    move v3, v5

    .line 359
    goto :goto_b

    .line 360
    :cond_f
    move v3, v0

    .line 361
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-eqz v3, :cond_10

    .line 370
    .line 371
    add-int/lit8 v2, v2, 0x1

    .line 372
    .line 373
    :cond_10
    add-int/lit8 v1, v1, 0x1

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    return p1

    .line 385
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 386
    .line 387
    const/4 v0, 0x0

    .line 388
    move v1, v0

    .line 389
    move v2, v1

    .line 390
    :goto_c
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    const/16 v4, 0x2f

    .line 395
    .line 396
    const/4 v5, 0x1

    .line 397
    if-ge v1, v3, :cond_14

    .line 398
    .line 399
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-ne v3, v4, :cond_12

    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_12
    move v5, v0

    .line 415
    :goto_d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-eqz v3, :cond_13

    .line 424
    .line 425
    add-int/lit8 v2, v2, 0x1

    .line 426
    .line 427
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    check-cast p2, Ljava/lang/String;

    .line 435
    .line 436
    move v1, v0

    .line 437
    move v2, v1

    .line 438
    :goto_e
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-ge v1, v3, :cond_17

    .line 443
    .line 444
    invoke-interface {p2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-ne v3, v4, :cond_15

    .line 457
    .line 458
    move v3, v5

    .line 459
    goto :goto_f

    .line 460
    :cond_15
    move v3, v0

    .line 461
    :goto_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_16

    .line 470
    .line 471
    add-int/lit8 v2, v2, 0x1

    .line 472
    .line 473
    :cond_16
    add-int/lit8 v1, v1, 0x1

    .line 474
    .line 475
    goto :goto_e

    .line 476
    :cond_17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object p2

    .line 480
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 481
    .line 482
    .line 483
    move-result p1

    .line 484
    return p1

    .line 485
    :pswitch_6
    check-cast p2, Ljava/io/File;

    .line 486
    .line 487
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 488
    .line 489
    .line 490
    move-result-wide v0

    .line 491
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 492
    .line 493
    .line 494
    move-result-object p2

    .line 495
    check-cast p1, Ljava/io/File;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 498
    .line 499
    .line 500
    move-result-wide v0

    .line 501
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 506
    .line 507
    .line 508
    move-result p1

    .line 509
    return p1

    .line 510
    :pswitch_7
    check-cast p2, Lfb/d1;

    .line 511
    .line 512
    iget-boolean p2, p2, Lfb/d1;->l:Z

    .line 513
    .line 514
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    move-result-object p2

    .line 518
    check-cast p1, Lfb/d1;

    .line 519
    .line 520
    iget-boolean p1, p1, Lfb/d1;->l:Z

    .line 521
    .line 522
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    return p1

    .line 531
    :pswitch_8
    check-cast p1, Lfb/p0;

    .line 532
    .line 533
    iget-object p1, p1, Lfb/p0;->b:Ljava/lang/String;

    .line 534
    .line 535
    check-cast p2, Lfb/p0;

    .line 536
    .line 537
    iget-object p2, p2, Lfb/p0;->b:Ljava/lang/String;

    .line 538
    .line 539
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 540
    .line 541
    .line 542
    move-result p1

    .line 543
    return p1

    .line 544
    :pswitch_9
    check-cast p1, Lorg/json/JSONObject;

    .line 545
    .line 546
    const-string v0, "name"

    .line 547
    .line 548
    const-string v1, ""

    .line 549
    .line 550
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    check-cast p2, Lorg/json/JSONObject;

    .line 555
    .line 556
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p2

    .line 560
    invoke-static {p1, p2}, La7/a;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 561
    .line 562
    .line 563
    move-result p1

    .line 564
    return p1

    .line 565
    :pswitch_a
    check-cast p1, Lfb/m0;

    .line 566
    .line 567
    iget-wide v0, p1, Lfb/m0;->f:J

    .line 568
    .line 569
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    check-cast p2, Lfb/m0;

    .line 574
    .line 575
    iget-wide v0, p2, Lfb/m0;->f:J

    .line 576
    .line 577
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 578
    .line 579
    .line 580
    move-result-object p2

    .line 581
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 582
    .line 583
    .line 584
    move-result p1

    .line 585
    return p1

    .line 586
    :pswitch_b
    check-cast p1, Lfb/m0;

    .line 587
    .line 588
    iget-wide v0, p1, Lfb/m0;->f:J

    .line 589
    .line 590
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    check-cast p2, Lfb/m0;

    .line 595
    .line 596
    iget-wide v0, p2, Lfb/m0;->f:J

    .line 597
    .line 598
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 599
    .line 600
    .line 601
    move-result-object p2

    .line 602
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 603
    .line 604
    .line 605
    move-result p1

    .line 606
    return p1

    .line 607
    :pswitch_c
    check-cast p1, Ljava/io/File;

    .line 608
    .line 609
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    xor-int/lit8 p1, p1, 0x1

    .line 614
    .line 615
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    check-cast p2, Ljava/io/File;

    .line 620
    .line 621
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 622
    .line 623
    .line 624
    move-result p2

    .line 625
    xor-int/lit8 p2, p2, 0x1

    .line 626
    .line 627
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 628
    .line 629
    .line 630
    move-result-object p2

    .line 631
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    return p1

    .line 636
    :pswitch_d
    check-cast p1, Lfb/h;

    .line 637
    .line 638
    iget-object p1, p1, Lfb/h;->a:Ljava/lang/String;

    .line 639
    .line 640
    check-cast p2, Lfb/h;

    .line 641
    .line 642
    iget-object p2, p2, Lfb/h;->a:Ljava/lang/String;

    .line 643
    .line 644
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 645
    .line 646
    .line 647
    move-result p1

    .line 648
    return p1

    .line 649
    :pswitch_e
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object p1

    .line 653
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p2

    .line 657
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 658
    .line 659
    .line 660
    move-result p1

    .line 661
    return p1

    .line 662
    nop

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
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
