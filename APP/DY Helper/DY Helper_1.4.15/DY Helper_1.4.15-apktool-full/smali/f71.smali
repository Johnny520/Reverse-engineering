.class public final synthetic Lf71;
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
    iput p1, p0, Lf71;->ε:I

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lf71;->ε:I

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v0, v1

    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    move-object v5, v0

    .line 39
    :cond_0
    return-object v5

    .line 40
    :pswitch_0
    move-object v0, v1

    .line 41
    check-cast v0, Lky1;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget v1, v0, Lky1;->δ:I

    .line 47
    .line 48
    if-ne v1, v7, :cond_1

    .line 49
    .line 50
    iget-object v1, v0, Lky1;->α:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    iget-wide v1, v0, Lky1;->β:J

    .line 59
    .line 60
    cmp-long v1, v1, v3

    .line 61
    .line 62
    if-lez v1, :cond_1

    .line 63
    .line 64
    iget-wide v0, v0, Lky1;->γ:J

    .line 65
    .line 66
    cmp-long v0, v0, v3

    .line 67
    .line 68
    if-lez v0, :cond_1

    .line 69
    .line 70
    move v6, v7

    .line 71
    :cond_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_1
    move-object v0, v1

    .line 77
    check-cast v0, Lky1;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget v1, v0, Lky1;->δ:I

    .line 83
    .line 84
    if-ne v1, v7, :cond_2

    .line 85
    .line 86
    iget-object v1, v0, Lky1;->α:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_2

    .line 93
    .line 94
    iget-wide v1, v0, Lky1;->β:J

    .line 95
    .line 96
    cmp-long v1, v1, v3

    .line 97
    .line 98
    if-lez v1, :cond_2

    .line 99
    .line 100
    iget-wide v0, v0, Lky1;->γ:J

    .line 101
    .line 102
    cmp-long v0, v0, v3

    .line 103
    .line 104
    if-lez v0, :cond_2

    .line 105
    .line 106
    move v6, v7

    .line 107
    :cond_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :pswitch_2
    move-object v0, v1

    .line 113
    check-cast v0, Lky1;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget v1, v0, Lky1;->δ:I

    .line 119
    .line 120
    if-ne v1, v7, :cond_3

    .line 121
    .line 122
    iget-object v1, v0, Lky1;->α:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_3

    .line 129
    .line 130
    iget-wide v1, v0, Lky1;->β:J

    .line 131
    .line 132
    cmp-long v1, v1, v3

    .line 133
    .line 134
    if-lez v1, :cond_3

    .line 135
    .line 136
    iget-wide v0, v0, Lky1;->γ:J

    .line 137
    .line 138
    cmp-long v0, v0, v3

    .line 139
    .line 140
    if-lez v0, :cond_3

    .line 141
    .line 142
    move v6, v7

    .line 143
    :cond_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_3
    move-object v0, v1

    .line 149
    check-cast v0, Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-lez v1, :cond_4

    .line 168
    .line 169
    move-object v5, v0

    .line 170
    :cond_4
    return-object v5

    .line 171
    :pswitch_4
    move-object v0, v1

    .line 172
    check-cast v0, Ljava/lang/Long;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v0, Lie1;

    .line 178
    .line 179
    invoke-direct {v0}, Lie1;-><init>()V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_5
    move-object v0, v1

    .line 184
    check-cast v0, Lix0;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v0, v0, Lix0;->α:Ljava/util/regex/Matcher;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {v0, v2}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-eqz v0, :cond_5

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    cmp-long v1, v1, v3

    .line 209
    .line 210
    if-lez v1, :cond_5

    .line 211
    .line 212
    move-object v5, v0

    .line 213
    :cond_5
    return-object v5

    .line 214
    :pswitch_6
    move-object v0, v1

    .line 215
    check-cast v0, Lce1;

    .line 216
    .line 217
    sget v1, Lcom/example/dyhelper/ui/dialog/PetElfCampTrendChartView;->μ:I

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v0, v0, Lce1;->γ:Ljava/util/List;

    .line 223
    .line 224
    new-instance v1, Lf7;

    .line 225
    .line 226
    invoke-direct {v1, v7, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-object v1

    .line 230
    :pswitch_7
    move-object v8, v1

    .line 231
    check-cast v8, Ljb1;

    .line 232
    .line 233
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget v0, v8, Ljb1;->ε:I

    .line 237
    .line 238
    const v1, 0x7fffffff

    .line 239
    .line 240
    .line 241
    if-ne v0, v1, :cond_6

    .line 242
    .line 243
    :goto_0
    move v15, v1

    .line 244
    goto :goto_1

    .line 245
    :cond_6
    add-int/lit8 v1, v0, 0x1

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :goto_1
    const/16 v17, 0x0

    .line 249
    .line 250
    const/16 v18, 0x6f

    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    const-wide/16 v10, 0x0

    .line 254
    .line 255
    const-wide/16 v12, 0x0

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    invoke-static/range {v8 .. v18}, Ljb1;->α(Ljb1;Ljava/time/LocalDate;JJIIIII)Ljb1;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :pswitch_8
    move-object v0, v1

    .line 266
    check-cast v0, Lid;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v1, v0, Lid;->ε:Ljava/lang/Long;

    .line 272
    .line 273
    iget-object v2, v0, Lid;->ζ:Ljava/lang/Long;

    .line 274
    .line 275
    iget-object v0, v0, Lid;->η:Ljava/lang/Long;

    .line 276
    .line 277
    filled-new-array {v1, v2, v0}, [Ljava/lang/Long;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    return-object v0

    .line 286
    :pswitch_9
    move-object v0, v1

    .line 287
    check-cast v0, Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    move v3, v6

    .line 302
    :goto_2
    if-ge v3, v2, :cond_8

    .line 303
    .line 304
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-static {v4}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-eqz v5, :cond_7

    .line 313
    .line 314
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 315
    .line 316
    .line 317
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    const-string v1, "icon"

    .line 334
    .line 335
    invoke-static {v0, v1, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-nez v1, :cond_9

    .line 340
    .line 341
    const-string v1, "image"

    .line 342
    .line 343
    invoke-static {v0, v1, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-nez v1, :cond_9

    .line 348
    .line 349
    const-string v1, "pic"

    .line 350
    .line 351
    invoke-static {v0, v1, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-nez v1, :cond_9

    .line 356
    .line 357
    const-string v1, "url"

    .line 358
    .line 359
    invoke-static {v0, v1, v6}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_a

    .line 364
    .line 365
    :cond_9
    move v6, v7

    .line 366
    :cond_a
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0

    .line 371
    :pswitch_a
    move-object v0, v1

    .line 372
    check-cast v0, Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object v1, Lbd1;->α:Ljava/util/Set;

    .line 378
    .line 379
    invoke-static {v0}, Lbd1;->ξ(Ljava/lang/String;)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    return-object v0

    .line 388
    :pswitch_b
    move-object v0, v1

    .line 389
    check-cast v0, Lid1;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v1, v0, Lid1;->ε:Ljava/lang/Integer;

    .line 395
    .line 396
    iget-object v0, v0, Lid1;->ζ:Ljava/lang/Integer;

    .line 397
    .line 398
    if-eqz v1, :cond_b

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-ltz v1, :cond_b

    .line 405
    .line 406
    if-eqz v0, :cond_b

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-ltz v0, :cond_b

    .line 413
    .line 414
    move v6, v7

    .line 415
    :cond_b
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    return-object v0

    .line 420
    :pswitch_c
    move-object v0, v1

    .line 421
    check-cast v0, Ljava/lang/Throwable;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    return-object v0

    .line 431
    :pswitch_d
    move-object v0, v1

    .line 432
    check-cast v0, Ljava/util/Map$Entry;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    check-cast v1, Lod;

    .line 442
    .line 443
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast v0, Lbc1;

    .line 448
    .line 449
    sget-object v2, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 450
    .line 451
    invoke-static {v1}, Ljc1;->α(Lod;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    iget-object v2, v0, Lbc1;->α:Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    iget v0, v0, Lbc1;->β:I

    .line 462
    .line 463
    new-instance v3, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    const-string v1, "="

    .line 472
    .line 473
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v1, "\u4eba/"

    .line 480
    .line 481
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v0, "\u6b21"

    .line 488
    .line 489
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_e
    move-object v0, v1

    .line 498
    check-cast v0, Lky1;

    .line 499
    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    iget v1, v0, Lky1;->δ:I

    .line 504
    .line 505
    if-ne v1, v7, :cond_c

    .line 506
    .line 507
    iget-wide v1, v0, Lky1;->β:J

    .line 508
    .line 509
    cmp-long v1, v1, v3

    .line 510
    .line 511
    if-lez v1, :cond_c

    .line 512
    .line 513
    iget-wide v0, v0, Lky1;->γ:J

    .line 514
    .line 515
    cmp-long v0, v0, v3

    .line 516
    .line 517
    if-lez v0, :cond_c

    .line 518
    .line 519
    move v6, v7

    .line 520
    :cond_c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    return-object v0

    .line 525
    :pswitch_f
    if-eqz v1, :cond_11

    .line 526
    .line 527
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 528
    .line 529
    if-ne v1, v0, :cond_d

    .line 530
    .line 531
    move-object v1, v5

    .line 532
    :cond_d
    if-eqz v1, :cond_11

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    if-eqz v0, :cond_11

    .line 539
    .line 540
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-eqz v0, :cond_11

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    const/4 v2, 0x3

    .line 555
    if-gt v2, v1, :cond_10

    .line 556
    .line 557
    const/16 v2, 0x101

    .line 558
    .line 559
    if-ge v1, v2, :cond_10

    .line 560
    .line 561
    const-string v1, "0"

    .line 562
    .line 563
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    if-nez v1, :cond_10

    .line 568
    .line 569
    move v1, v6

    .line 570
    :goto_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-ge v1, v2, :cond_f

    .line 575
    .line 576
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    invoke-static {v2}, Ljx0;->Κ(C)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_e

    .line 585
    .line 586
    goto :goto_4

    .line 587
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 588
    .line 589
    goto :goto_3

    .line 590
    :cond_f
    move v6, v7

    .line 591
    :cond_10
    :goto_4
    if-eqz v6, :cond_11

    .line 592
    .line 593
    move-object v5, v0

    .line 594
    :cond_11
    return-object v5

    .line 595
    :pswitch_10
    move-object v0, v1

    .line 596
    check-cast v0, Ljava/lang/Throwable;

    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    return-object v0

    .line 606
    :pswitch_11
    move-object v0, v1

    .line 607
    check-cast v0, Ljava/lang/Throwable;

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    return-object v0

    .line 617
    :pswitch_12
    move-object v0, v1

    .line 618
    check-cast v0, Ljava/lang/String;

    .line 619
    .line 620
    if-eqz v0, :cond_12

    .line 621
    .line 622
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    if-eqz v0, :cond_12

    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-lez v1, :cond_12

    .line 637
    .line 638
    move-object v5, v0

    .line 639
    :cond_12
    return-object v5

    .line 640
    :pswitch_13
    move-object v0, v1

    .line 641
    check-cast v0, Lod;

    .line 642
    .line 643
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    const/4 v1, 0x2

    .line 651
    if-eqz v0, :cond_15

    .line 652
    .line 653
    if-eq v0, v7, :cond_14

    .line 654
    .line 655
    if-ne v0, v1, :cond_13

    .line 656
    .line 657
    sget-object v0, Lxn0;->ο:Lxn0;

    .line 658
    .line 659
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 660
    .line 661
    .line 662
    move-result-wide v1

    .line 663
    invoke-virtual {v0, v1, v2}, Lxn0;->Φ(J)Lrc1;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    goto :goto_5

    .line 668
    :cond_13
    invoke-static {}, Lγ;->κ()V

    .line 669
    .line 670
    .line 671
    goto :goto_5

    .line 672
    :cond_14
    sget-object v2, Lxn0;->ο:Lxn0;

    .line 673
    .line 674
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 675
    .line 676
    .line 677
    move-result-wide v0

    .line 678
    monitor-enter v2

    .line 679
    :try_start_0
    invoke-virtual {v2, v0, v1}, Lxn0;->Φ(J)Lrc1;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 684
    .line 685
    const-string v1, "pet_elf_camp_plant_count"

    .line 686
    .line 687
    iget v3, v0, Lrc1;->β:I

    .line 688
    .line 689
    add-int/2addr v3, v7

    .line 690
    invoke-static {v1, v3}, Lui1;->Η(Ljava/lang/String;I)V

    .line 691
    .line 692
    .line 693
    iget v1, v0, Lrc1;->β:I

    .line 694
    .line 695
    add-int/2addr v1, v7

    .line 696
    invoke-static {v0, v6, v1, v7}, Lrc1;->α(Lrc1;III)Lrc1;

    .line 697
    .line 698
    .line 699
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 700
    monitor-exit v2

    .line 701
    goto :goto_5

    .line 702
    :catchall_0
    move-exception v0

    .line 703
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 704
    throw v0

    .line 705
    :cond_15
    sget-object v2, Lxn0;->ο:Lxn0;

    .line 706
    .line 707
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 708
    .line 709
    .line 710
    move-result-wide v3

    .line 711
    monitor-enter v2

    .line 712
    :try_start_2
    invoke-virtual {v2, v3, v4}, Lxn0;->Φ(J)Lrc1;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 717
    .line 718
    const-string v3, "pet_elf_camp_harvest_count"

    .line 719
    .line 720
    iget v4, v0, Lrc1;->α:I

    .line 721
    .line 722
    add-int/2addr v4, v7

    .line 723
    invoke-static {v3, v4}, Lui1;->Η(Ljava/lang/String;I)V

    .line 724
    .line 725
    .line 726
    iget v3, v0, Lrc1;->α:I

    .line 727
    .line 728
    add-int/2addr v3, v7

    .line 729
    invoke-static {v0, v3, v6, v1}, Lrc1;->α(Lrc1;III)Lrc1;

    .line 730
    .line 731
    .line 732
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 733
    monitor-exit v2

    .line 734
    :goto_5
    return-object v5

    .line 735
    :catchall_1
    move-exception v0

    .line 736
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 737
    throw v0

    .line 738
    :pswitch_14
    move-object v0, v1

    .line 739
    check-cast v0, Ljava/lang/String;

    .line 740
    .line 741
    if-eqz v0, :cond_16

    .line 742
    .line 743
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    if-eqz v0, :cond_16

    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    if-lez v1, :cond_16

    .line 758
    .line 759
    move-object v5, v0

    .line 760
    :cond_16
    return-object v5

    .line 761
    :pswitch_15
    move-object v0, v1

    .line 762
    check-cast v0, Lky1;

    .line 763
    .line 764
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    iget v1, v0, Lky1;->δ:I

    .line 768
    .line 769
    if-ne v1, v7, :cond_17

    .line 770
    .line 771
    iget-object v1, v0, Lky1;->α:Ljava/lang/String;

    .line 772
    .line 773
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    if-nez v1, :cond_17

    .line 778
    .line 779
    iget-wide v1, v0, Lky1;->β:J

    .line 780
    .line 781
    cmp-long v1, v1, v3

    .line 782
    .line 783
    if-lez v1, :cond_17

    .line 784
    .line 785
    iget-wide v0, v0, Lky1;->γ:J

    .line 786
    .line 787
    cmp-long v0, v0, v3

    .line 788
    .line 789
    if-lez v0, :cond_17

    .line 790
    .line 791
    move v6, v7

    .line 792
    :cond_17
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    return-object v0

    .line 797
    :pswitch_16
    move-object v0, v1

    .line 798
    check-cast v0, Ljava/lang/Class;

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    sget-object v1, Lp81;->α:Lp81;

    .line 804
    .line 805
    invoke-static {v0}, Lp81;->σ(Ljava/lang/Class;)I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    if-lez v0, :cond_18

    .line 810
    .line 811
    move v6, v7

    .line 812
    :cond_18
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    return-object v0

    .line 817
    :pswitch_17
    move-object v0, v1

    .line 818
    check-cast v0, Ljava/lang/Class;

    .line 819
    .line 820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    return-object v0

    .line 828
    :pswitch_18
    move-object v0, v1

    .line 829
    check-cast v0, Ljava/lang/Class;

    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    sget-object v1, Lp81;->α:Lp81;

    .line 835
    .line 836
    invoke-static {v0}, Lp81;->ρ(Ljava/lang/Class;)I

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-lez v0, :cond_19

    .line 841
    .line 842
    move v6, v7

    .line 843
    :cond_19
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    return-object v0

    .line 848
    :pswitch_19
    move-object v0, v1

    .line 849
    check-cast v0, Ljava/lang/Class;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    return-object v0

    .line 859
    :pswitch_1a
    move-object v0, v1

    .line 860
    check-cast v0, Ljava/lang/ClassLoader;

    .line 861
    .line 862
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    sget-object v1, Lp81;->α:Lp81;

    .line 866
    .line 867
    invoke-virtual {v1, v0, v6}, Lp81;->ο(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v1, v0, v6}, Lp81;->π(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    sget-object v0, Ls62;->α:Ls62;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_1b
    move-object v0, v1

    .line 877
    check-cast v0, Ljava/lang/ClassLoader;

    .line 878
    .line 879
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    new-instance v1, Lqx;

    .line 883
    .line 884
    sget-object v3, Lox;->α:Ljava/lang/Object;

    .line 885
    .line 886
    sget-object v3, Lkx;->щ:Lkx;

    .line 887
    .line 888
    invoke-static {v3, v0}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    const-string v4, "\u5b9a\u4f4d\u539f\u59cb\u4e0d\u611f\u5174\u8da3 DislikeAction"

    .line 893
    .line 894
    new-instance v5, Lk41;

    .line 895
    .line 896
    const/16 v6, 0x9

    .line 897
    .line 898
    invoke-direct {v5, v0, v6}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 899
    .line 900
    .line 901
    invoke-direct {v1, v3, v4, v5}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 902
    .line 903
    .line 904
    new-instance v3, Lqx;

    .line 905
    .line 906
    sget-object v4, Lkx;->э:Lkx;

    .line 907
    .line 908
    invoke-static {v4, v0}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    const-string v5, "\u5b9a\u4f4d\u63a8\u8350\u9875 notRelated \u4e0d\u611f\u5174\u8da3 Action"

    .line 913
    .line 914
    new-instance v6, Lk41;

    .line 915
    .line 916
    invoke-direct {v6, v0, v2}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 917
    .line 918
    .line 919
    invoke-direct {v3, v4, v5, v6}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 920
    .line 921
    .line 922
    filled-new-array {v1, v3}, [Lqx;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    return-object v0

    .line 931
    :pswitch_1c
    move-object v0, v1

    .line 932
    check-cast v0, Lj71;

    .line 933
    .line 934
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    sget-object v1, Lw71;->α:Ljava/util/List;

    .line 938
    .line 939
    iget-object v1, v0, Lj71;->α:Ljava/lang/String;

    .line 940
    .line 941
    invoke-static {v1}, Lw71;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v7

    .line 945
    invoke-static {v1}, Lw71;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v8

    .line 949
    iget-object v9, v0, Lj71;->β:Ljava/lang/String;

    .line 950
    .line 951
    iget v10, v0, Lj71;->δ:I

    .line 952
    .line 953
    iget-object v11, v0, Lj71;->ε:Ljava/lang/String;

    .line 954
    .line 955
    iget-object v12, v0, Lj71;->ζ:Ljava/lang/String;

    .line 956
    .line 957
    iget-boolean v1, v0, Lj71;->η:Z

    .line 958
    .line 959
    xor-int/lit8 v13, v1, 0x1

    .line 960
    .line 961
    if-eqz v1, :cond_1a

    .line 962
    .line 963
    move-object v14, v9

    .line 964
    goto :goto_6

    .line 965
    :cond_1a
    move-object v14, v5

    .line 966
    :goto_6
    iget-object v15, v0, Lj71;->θ:Lp70;

    .line 967
    .line 968
    new-instance v6, Lm71;

    .line 969
    .line 970
    invoke-direct/range {v6 .. v15}, Lm71;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lp70;)V

    .line 971
    .line 972
    .line 973
    return-object v6

    .line 974
    nop

    .line 975
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
