.class public final synthetic Lli1;
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
    iput p1, p0, Lli1;->ε:I

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
    .locals 11

    .line 1
    iget p0, p0, Lli1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    sget-object v1, Ls62;->α:Ls62;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    new-instance p1, Lrg0;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lrg0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    new-instance p1, Le32;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Le32;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    check-cast p0, Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object p0, v2

    .line 57
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lrq1;->ι:Ln5;

    .line 65
    .line 66
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-static {p1, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    if-eqz p1, :cond_2

    .line 76
    .line 77
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La80;

    .line 80
    .line 81
    invoke-interface {v0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v2, p1

    .line 86
    check-cast v2, Lo32;

    .line 87
    .line 88
    :cond_2
    :goto_1
    new-instance p1, Lgs0;

    .line 89
    .line 90
    invoke-direct {p1, p0, v2}, Lgs0;-><init>(Ljava/lang/String;Lo32;)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast p1, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    new-instance p1, Lz22;

    .line 104
    .line 105
    invoke-direct {p1, p0}, Lz22;-><init>(I)V

    .line 106
    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast p1, Ljava/util/List;

    .line 113
    .line 114
    new-instance v5, Lfv1;

    .line 115
    .line 116
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    sget v1, Lci;->θ:I

    .line 121
    .line 122
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    if-eqz p0, :cond_4

    .line 128
    .line 129
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-static {p0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_3

    .line 136
    .line 137
    sget-wide v6, Lci;->η:J

    .line 138
    .line 139
    new-instance p0, Lci;

    .line 140
    .line 141
    invoke-direct {p0, v6, v7}, Lci;-><init>(J)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    check-cast p0, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    int-to-long v6, p0

    .line 152
    const/16 p0, 0x20

    .line 153
    .line 154
    shl-long/2addr v6, p0

    .line 155
    new-instance p0, Lci;

    .line 156
    .line 157
    invoke-direct {p0, v6, v7}, Lci;-><init>(J)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    move-object p0, v2

    .line 162
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-wide v6, p0, Lci;->α:J

    .line 166
    .line 167
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    sget-object v3, Lrq1;->ω:Lqq1;

    .line 172
    .line 173
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    if-eqz p0, :cond_5

    .line 177
    .line 178
    iget-object v1, v3, Lqq1;->ζ:La80;

    .line 179
    .line 180
    invoke-interface {v1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Lo41;

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move-object p0, v2

    .line 188
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget-wide v8, p0, Lo41;->α:J

    .line 192
    .line 193
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-eqz p0, :cond_6

    .line 198
    .line 199
    move-object v2, p0

    .line 200
    check-cast v2, Ljava/lang/Float;

    .line 201
    .line 202
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-direct/range {v5 .. v10}, Lfv1;-><init>(JJF)V

    .line 210
    .line 211
    .line 212
    return-object v5

    .line 213
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    check-cast p1, Ljava/util/List;

    .line 217
    .line 218
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-eqz p0, :cond_7

    .line 223
    .line 224
    check-cast p0, Ljava/lang/Integer;

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_7
    move-object p0, v2

    .line 228
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-eqz p1, :cond_8

    .line 240
    .line 241
    move-object v2, p1

    .line 242
    check-cast v2, Ljava/lang/Integer;

    .line 243
    .line 244
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {p0, p1}, Lg81;->α(II)J

    .line 252
    .line 253
    .line 254
    move-result-wide p0

    .line 255
    new-instance v0, Lr32;

    .line 256
    .line 257
    invoke-direct {v0, p0, p1}, Lr32;-><init>(J)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast p1, Ljava/lang/Float;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    new-instance p1, Lr8;

    .line 271
    .line 272
    invoke-direct {p1, p0}, Lr8;-><init>(F)V

    .line 273
    .line 274
    .line 275
    return-object p1

    .line 276
    :pswitch_6
    new-instance p0, Ld60;

    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    check-cast p1, Ljava/lang/Integer;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    invoke-direct {p0, p1}, Ld60;-><init>(I)V

    .line 288
    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    check-cast p1, Ljava/util/List;

    .line 295
    .line 296
    new-instance p0, Lh32;

    .line 297
    .line 298
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget-object v1, Ly32;->β:[Lz32;

    .line 303
    .line 304
    sget-object v1, Lrq1;->χ:Lqq1;

    .line 305
    .line 306
    iget-object v1, v1, Lqq1;->ζ:La80;

    .line 307
    .line 308
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    if-eqz v0, :cond_9

    .line 314
    .line 315
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Ly32;

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_9
    move-object v0, v2

    .line 323
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-wide v5, v0, Ly32;->α:J

    .line 327
    .line 328
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-static {p1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    if-eqz p1, :cond_a

    .line 336
    .line 337
    invoke-interface {v1, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    move-object v2, p1

    .line 342
    check-cast v2, Ly32;

    .line 343
    .line 344
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    iget-wide v0, v2, Ly32;->α:J

    .line 348
    .line 349
    invoke-direct {p0, v5, v6, v0, v1}, Lh32;-><init>(JJ)V

    .line 350
    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    check-cast p1, Ljava/util/List;

    .line 357
    .line 358
    new-instance p0, Lg32;

    .line 359
    .line 360
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    check-cast p1, Ljava/lang/Number;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    invoke-direct {p0, v0, p1}, Lg32;-><init>(FF)V

    .line 381
    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_9
    new-instance p0, Lc32;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    check-cast p1, Ljava/lang/Integer;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    invoke-direct {p0, p1}, Lc32;-><init>(I)V

    .line 396
    .line 397
    .line 398
    return-object p0

    .line 399
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    check-cast p1, Ljava/util/List;

    .line 403
    .line 404
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    sget-object v0, Lrq1;->α:Ln5;

    .line 409
    .line 410
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_c

    .line 417
    .line 418
    :cond_b
    move-object p0, v2

    .line 419
    goto :goto_6

    .line 420
    :cond_c
    if-eqz p0, :cond_b

    .line 421
    .line 422
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, La80;

    .line 425
    .line 426
    invoke-interface {v0, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    check-cast p0, Ljava/util/List;

    .line 431
    .line 432
    :goto_6
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    if-eqz p1, :cond_d

    .line 437
    .line 438
    move-object v2, p1

    .line 439
    check-cast v2, Ljava/lang/String;

    .line 440
    .line 441
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    new-instance p1, Lg4;

    .line 445
    .line 446
    invoke-direct {p1, p0, v2}, Lg4;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    return-object p1

    .line 450
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    check-cast p1, Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    sget-object v1, Lrq1;->θ:Ln5;

    .line 460
    .line 461
    iget-object v1, v1, Ln5;->η:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, La80;

    .line 464
    .line 465
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 466
    .line 467
    invoke-static {p0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-eqz v5, :cond_f

    .line 472
    .line 473
    :cond_e
    move-object p0, v2

    .line 474
    goto :goto_7

    .line 475
    :cond_f
    if-eqz p0, :cond_e

    .line 476
    .line 477
    invoke-interface {v1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    check-cast p0, Lux1;

    .line 482
    .line 483
    :goto_7
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v5

    .line 491
    if-eqz v5, :cond_11

    .line 492
    .line 493
    :cond_10
    move-object v3, v2

    .line 494
    goto :goto_8

    .line 495
    :cond_11
    if-eqz v3, :cond_10

    .line 496
    .line 497
    invoke-interface {v1, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    check-cast v3, Lux1;

    .line 502
    .line 503
    :goto_8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-eqz v5, :cond_13

    .line 512
    .line 513
    :cond_12
    move-object v0, v2

    .line 514
    goto :goto_9

    .line 515
    :cond_13
    if-eqz v0, :cond_12

    .line 516
    .line 517
    invoke-interface {v1, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, Lux1;

    .line 522
    .line 523
    :goto_9
    const/4 v5, 0x3

    .line 524
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    invoke-static {p1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    if-eqz v4, :cond_14

    .line 533
    .line 534
    goto :goto_a

    .line 535
    :cond_14
    if-eqz p1, :cond_15

    .line 536
    .line 537
    invoke-interface {v1, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    move-object v2, p1

    .line 542
    check-cast v2, Lux1;

    .line 543
    .line 544
    :cond_15
    :goto_a
    new-instance p1, Lo32;

    .line 545
    .line 546
    invoke-direct {p1, p0, v3, v0, v2}, Lo32;-><init>(Lux1;Lux1;Lux1;Lux1;)V

    .line 547
    .line 548
    .line 549
    return-object p1

    .line 550
    :pswitch_c
    check-cast p1, Ljava/lang/Class;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    array-length p1, p0

    .line 563
    move-object v1, v2

    .line 564
    move v0, v4

    .line 565
    :goto_b
    if-ge v4, p1, :cond_18

    .line 566
    .line 567
    aget-object v5, p0, v4

    .line 568
    .line 569
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    if-nez v6, :cond_17

    .line 578
    .line 579
    const-class v6, Landroid/widget/ImageView;

    .line 580
    .line 581
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    if-eqz v6, :cond_17

    .line 590
    .line 591
    if-eqz v0, :cond_16

    .line 592
    .line 593
    :goto_c
    move-object v1, v2

    .line 594
    goto :goto_d

    .line 595
    :cond_16
    move v0, v3

    .line 596
    move-object v1, v5

    .line 597
    :cond_17
    add-int/lit8 v4, v4, 0x1

    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_18
    if-nez v0, :cond_19

    .line 601
    .line 602
    goto :goto_c

    .line 603
    :cond_19
    :goto_d
    if-eqz v1, :cond_1a

    .line 604
    .line 605
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 606
    .line 607
    .line 608
    move-object v2, v1

    .line 609
    :cond_1a
    return-object v2

    .line 610
    :pswitch_d
    check-cast p1, Ljava/lang/Class;

    .line 611
    .line 612
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    return-object p0

    .line 620
    :pswitch_e
    check-cast p1, Ljava/lang/Class;

    .line 621
    .line 622
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-static {p1}, Lxb;->Ψ(Ljava/lang/Class;)Lce0;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    if-eqz p0, :cond_1b

    .line 630
    .line 631
    goto :goto_e

    .line 632
    :cond_1b
    move v3, v4

    .line 633
    :goto_e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    return-object p0

    .line 638
    :pswitch_f
    check-cast p1, Ljava/lang/ClassLoader;

    .line 639
    .line 640
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    sget-object p0, Lfk1;->α:Lfk1;

    .line 644
    .line 645
    invoke-virtual {p0, p1, v4}, Lfk1;->α(Ljava/lang/ClassLoader;Z)V

    .line 646
    .line 647
    .line 648
    return-object v1

    .line 649
    :pswitch_10
    check-cast p1, Ljava/lang/ClassLoader;

    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    new-instance p0, Lqx;

    .line 655
    .line 656
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 657
    .line 658
    sget-object v0, Lkx;->Ж:Lkx;

    .line 659
    .line 660
    invoke-static {v0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    new-instance v1, Lk41;

    .line 665
    .line 666
    const/16 v2, 0xf

    .line 667
    .line 668
    invoke-direct {v1, p1, v2}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 669
    .line 670
    .line 671
    const-string p1, "\u5b9a\u4f4d\u89c6\u9891\u5feb\u6377\u5206\u4eab\u8054\u7cfb\u4eba Adapter"

    .line 672
    .line 673
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 674
    .line 675
    .line 676
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    return-object p0

    .line 681
    :pswitch_11
    check-cast p1, Ljava/lang/Class;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    return-object p0

    .line 691
    :pswitch_12
    check-cast p1, Ljava/lang/Class;

    .line 692
    .line 693
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    return-object p0

    .line 701
    :pswitch_13
    check-cast p1, Ljava/lang/ClassLoader;

    .line 702
    .line 703
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    sget-object p0, Lck1;->α:Lck1;

    .line 707
    .line 708
    invoke-virtual {p0, p1}, Lck1;->γ(Ljava/lang/ClassLoader;)V

    .line 709
    .line 710
    .line 711
    return-object v1

    .line 712
    :pswitch_14
    check-cast p1, Ljava/lang/ClassLoader;

    .line 713
    .line 714
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    new-instance p0, Lqx;

    .line 718
    .line 719
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 720
    .line 721
    sget-object v0, Lkx;->ю:Lkx;

    .line 722
    .line 723
    invoke-static {v0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    new-instance v1, Lk41;

    .line 728
    .line 729
    const/16 v2, 0xe

    .line 730
    .line 731
    invoke-direct {v1, p1, v2}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 732
    .line 733
    .line 734
    const-string p1, "\u5b9a\u4f4d\u5e95\u680f\u53d1\u5e03\u6309\u94ae"

    .line 735
    .line 736
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 737
    .line 738
    .line 739
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object p0

    .line 743
    return-object p0

    .line 744
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 745
    .line 746
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    invoke-static {}, Lnj1;->η()V

    .line 750
    .line 751
    .line 752
    invoke-static {}, Lnj1;->ζ()V

    .line 753
    .line 754
    .line 755
    invoke-static {}, Lnj1;->ε()V

    .line 756
    .line 757
    .line 758
    invoke-static {}, Lnj1;->δ()V

    .line 759
    .line 760
    .line 761
    return-object v1

    .line 762
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 763
    .line 764
    sget-object p0, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 765
    .line 766
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 770
    .line 771
    .line 772
    move-result p0

    .line 773
    const v0, -0x7ead0c5f

    .line 774
    .line 775
    .line 776
    if-eq p0, v0, :cond_20

    .line 777
    .line 778
    const/16 v0, 0x2a

    .line 779
    .line 780
    if-eq p0, v0, :cond_1e

    .line 781
    .line 782
    const v0, 0x5bf20cf8

    .line 783
    .line 784
    .line 785
    if-eq p0, v0, :cond_1c

    .line 786
    .line 787
    goto :goto_f

    .line 788
    :cond_1c
    const-string p0, "profile_video_comment_bar_alpha"

    .line 789
    .line 790
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result p0

    .line 794
    if-nez p0, :cond_1d

    .line 795
    .line 796
    goto :goto_f

    .line 797
    :cond_1d
    invoke-static {}, Lnj1;->ζ()V

    .line 798
    .line 799
    .line 800
    invoke-static {}, Lnj1;->δ()V

    .line 801
    .line 802
    .line 803
    goto :goto_f

    .line 804
    :cond_1e
    const-string p0, "*"

    .line 805
    .line 806
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result p0

    .line 810
    if-nez p0, :cond_1f

    .line 811
    .line 812
    goto :goto_f

    .line 813
    :cond_1f
    invoke-static {}, Lnj1;->η()V

    .line 814
    .line 815
    .line 816
    invoke-static {}, Lnj1;->ζ()V

    .line 817
    .line 818
    .line 819
    invoke-static {}, Lnj1;->ε()V

    .line 820
    .line 821
    .line 822
    invoke-static {}, Lnj1;->δ()V

    .line 823
    .line 824
    .line 825
    goto :goto_f

    .line 826
    :cond_20
    const-string p0, "profile_video_search_alpha"

    .line 827
    .line 828
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result p0

    .line 832
    if-nez p0, :cond_21

    .line 833
    .line 834
    goto :goto_f

    .line 835
    :cond_21
    invoke-static {}, Lnj1;->η()V

    .line 836
    .line 837
    .line 838
    invoke-static {}, Lnj1;->ε()V

    .line 839
    .line 840
    .line 841
    :goto_f
    return-object v1

    .line 842
    :pswitch_17
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkReflect;->α(Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 843
    .line 844
    .line 845
    move-result-object p0

    .line 846
    return-object p0

    .line 847
    :pswitch_18
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;

    .line 848
    .line 849
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->α(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery$Summary;)Ls62;

    .line 850
    .line 851
    .line 852
    move-result-object p0

    .line 853
    return-object p0

    .line 854
    :pswitch_19
    check-cast p1, Ljava/lang/reflect/Method;

    .line 855
    .line 856
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object p0

    .line 863
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    return-object p0

    .line 867
    :pswitch_1a
    check-cast p1, Ljava/lang/Class;

    .line 868
    .line 869
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object p0

    .line 873
    return-object p0

    .line 874
    :pswitch_1b
    check-cast p1, Lqu0;

    .line 875
    .line 876
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    sget-object p0, Lcj1;->α:Lcj1;

    .line 880
    .line 881
    iget-object p0, p1, Lqu0;->δ:Ljava/lang/String;

    .line 882
    .line 883
    invoke-static {p0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object p0

    .line 887
    if-nez p0, :cond_22

    .line 888
    .line 889
    iget-object p0, p1, Lqu0;->γ:Ljava/lang/String;

    .line 890
    .line 891
    invoke-static {p0}, Lcj1;->θ(Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object p0

    .line 895
    :cond_22
    return-object p0

    .line 896
    :pswitch_1c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 897
    .line 898
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 902
    .line 903
    .line 904
    move-result p0

    .line 905
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 906
    .line 907
    .line 908
    move-result p0

    .line 909
    if-nez p0, :cond_23

    .line 910
    .line 911
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    move-result-object p0

    .line 915
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 916
    .line 917
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result p0

    .line 921
    if-nez p0, :cond_24

    .line 922
    .line 923
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    move-result-object p0

    .line 927
    const-class p1, Ljava/lang/Long;

    .line 928
    .line 929
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result p0

    .line 933
    if-eqz p0, :cond_23

    .line 934
    .line 935
    goto :goto_10

    .line 936
    :cond_23
    move v3, v4

    .line 937
    :cond_24
    :goto_10
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 938
    .line 939
    .line 940
    move-result-object p0

    .line 941
    return-object p0

    .line 942
    nop

    .line 943
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
