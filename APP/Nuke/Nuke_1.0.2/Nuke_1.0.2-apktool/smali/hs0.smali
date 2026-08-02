.class public final Lhs0;
.super Liy0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final a(Lz70;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->k:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    const/16 p0, 0x70

    .line 2
    .line 3
    return p0
.end method

.method public final d(Lz70;Lyn;)V
    .locals 11

    .line 1
    iget-object p0, p1, Lz70;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Leh1;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljm2;->b()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iget-object v0, p1, Lz70;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Leh1;

    .line 12
    .line 13
    iget-object v1, p1, Lz70;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Leh1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljm2;->b()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1}, Ljm2;->b()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1}, Ljm2;->f()V

    .line 26
    .line 27
    .line 28
    iget v1, v1, Leh1;->i:I

    .line 29
    .line 30
    add-int/2addr v2, v1

    .line 31
    sub-int/2addr v2, v0

    .line 32
    const-string v1, "dex\n"

    .line 33
    .line 34
    const-string v3, "\u0000"

    .line 35
    .line 36
    const-string v4, "035"

    .line 37
    .line 38
    invoke-static {v1, v4, v3}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p2}, Lyn;->d()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const-string v4, "file size not yet known"

    .line 47
    .line 48
    const v5, 0x12345678

    .line 49
    .line 50
    .line 51
    const/16 v6, 0x70

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    const/4 v8, 0x4

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    new-instance v3, Lq30;

    .line 59
    .line 60
    invoke-direct {v3, v1}, Lq30;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Lq30;->g()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v9, "magic: "

    .line 68
    .line 69
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p2, v3, v7}, Lyn;->c(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    const-string v3, "checksum"

    .line 77
    .line 78
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    const/16 v3, 0x14

    .line 82
    .line 83
    const-string v9, "signature"

    .line 84
    .line 85
    invoke-virtual {p2, v9, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    iget v3, p1, Lz70;->a:I

    .line 89
    .line 90
    if-ltz v3, :cond_0

    .line 91
    .line 92
    invoke-static {v3}, Lpp0;->K(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v9, "file_size:       "

    .line 97
    .line 98
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, Lpp0;->K(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v9, "header_size:     "

    .line 110
    .line 111
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v5}, Lpp0;->K(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    const-string v9, "endian_tag:      "

    .line 123
    .line 124
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    const-string v3, "link_size:       0"

    .line 132
    .line 133
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    const-string v3, "link_off:        0"

    .line 137
    .line 138
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    const-string v9, "map_off:         "

    .line 146
    .line 147
    invoke-virtual {v9, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {p2, v3, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    invoke-static {v4}, Lc80;->j(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 160
    move v9, v3

    .line 161
    :goto_1
    if-ge v9, v7, :cond_2

    .line 162
    .line 163
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-virtual {p2, v10}, Lyn;->i(I)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 v9, v9, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    const/16 v1, 0x18

    .line 174
    .line 175
    invoke-virtual {p2, v1}, Lyn;->n(I)V

    .line 176
    .line 177
    .line 178
    iget v1, p1, Lz70;->a:I

    .line 179
    .line 180
    if-ltz v1, :cond_12

    .line 181
    .line 182
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, v6}, Lyn;->j(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v5}, Lyn;->j(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v7}, Lyn;->n(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p1, Lz70;->h:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Lb42;

    .line 200
    .line 201
    invoke-virtual {p0}, Ljm2;->f()V

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, Ljava/util/TreeMap;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-nez v1, :cond_3

    .line 213
    .line 214
    move p0, v3

    .line 215
    goto :goto_2

    .line 216
    :cond_3
    invoke-virtual {p0}, Ljm2;->b()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    :goto_2
    invoke-virtual {p2}, Lyn;->d()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_4

    .line 225
    .line 226
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    const-string v5, "string_ids_size: "

    .line 231
    .line 232
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    const-string v5, "string_ids_off:  "

    .line 244
    .line 245
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 250
    .line 251
    .line 252
    :cond_4
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 256
    .line 257
    .line 258
    iget-object p0, p1, Lz70;->i:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Lb42;

    .line 261
    .line 262
    invoke-virtual {p0}, Ljm2;->f()V

    .line 263
    .line 264
    .line 265
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, Ljava/util/TreeMap;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-nez v4, :cond_5

    .line 274
    .line 275
    move p0, v3

    .line 276
    goto :goto_3

    .line 277
    :cond_5
    invoke-virtual {p0}, Ljm2;->b()I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    :goto_3
    const/high16 v5, 0x10000

    .line 282
    .line 283
    if-gt v4, v5, :cond_11

    .line 284
    .line 285
    invoke-virtual {p2}, Lyn;->d()Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_6

    .line 290
    .line 291
    invoke-static {v4}, Lpp0;->K(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    const-string v6, "type_ids_size:   "

    .line 296
    .line 297
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {p2, v1, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 302
    .line 303
    .line 304
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    const-string v6, "type_ids_off:    "

    .line 309
    .line 310
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {p2, v1, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    :cond_6
    invoke-virtual {p2, v4}, Lyn;->j(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 321
    .line 322
    .line 323
    iget-object p0, p1, Lz70;->j:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p0, Lb42;

    .line 326
    .line 327
    invoke-virtual {p0}, Ljm2;->f()V

    .line 328
    .line 329
    .line 330
    iget-object v1, p0, Lb42;->g:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, Ljava/util/TreeMap;

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-nez v1, :cond_7

    .line 339
    .line 340
    move p0, v3

    .line 341
    goto :goto_4

    .line 342
    :cond_7
    invoke-virtual {p0}, Ljm2;->b()I

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    :goto_4
    if-gt v1, v5, :cond_10

    .line 347
    .line 348
    invoke-virtual {p2}, Lyn;->d()Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_8

    .line 353
    .line 354
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    const-string v5, "proto_ids_size:  "

    .line 359
    .line 360
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 365
    .line 366
    .line 367
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    const-string v5, "proto_ids_off:   "

    .line 372
    .line 373
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 378
    .line 379
    .line 380
    :cond_8
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 384
    .line 385
    .line 386
    iget-object p0, p1, Lz70;->k:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p0, Lni0;

    .line 389
    .line 390
    invoke-virtual {p0}, Ljm2;->f()V

    .line 391
    .line 392
    .line 393
    iget-object v1, p0, Lni0;->f:Ljava/util/TreeMap;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-nez v1, :cond_9

    .line 400
    .line 401
    move p0, v3

    .line 402
    goto :goto_5

    .line 403
    :cond_9
    invoke-virtual {p0}, Ljm2;->b()I

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    :goto_5
    invoke-virtual {p2}, Lyn;->d()Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    if-eqz v4, :cond_a

    .line 412
    .line 413
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    const-string v5, "field_ids_size:  "

    .line 418
    .line 419
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 424
    .line 425
    .line 426
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    const-string v5, "field_ids_off:   "

    .line 431
    .line 432
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 437
    .line 438
    .line 439
    :cond_a
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 443
    .line 444
    .line 445
    iget-object p0, p1, Lz70;->l:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast p0, Lxg1;

    .line 448
    .line 449
    invoke-virtual {p0}, Ljm2;->f()V

    .line 450
    .line 451
    .line 452
    iget-object v1, p0, Lxg1;->f:Ljava/util/TreeMap;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-nez v1, :cond_b

    .line 459
    .line 460
    move p0, v3

    .line 461
    goto :goto_6

    .line 462
    :cond_b
    invoke-virtual {p0}, Ljm2;->b()I

    .line 463
    .line 464
    .line 465
    move-result p0

    .line 466
    :goto_6
    invoke-virtual {p2}, Lyn;->d()Z

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-eqz v4, :cond_c

    .line 471
    .line 472
    invoke-static {v1}, Lpp0;->K(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    const-string v5, "method_ids_size: "

    .line 477
    .line 478
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 483
    .line 484
    .line 485
    invoke-static {p0}, Lpp0;->K(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    const-string v5, "method_ids_off:  "

    .line 490
    .line 491
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    invoke-virtual {p2, v4, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 496
    .line 497
    .line 498
    :cond_c
    invoke-virtual {p2, v1}, Lyn;->j(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {p2, p0}, Lyn;->j(I)V

    .line 502
    .line 503
    .line 504
    iget-object p0, p1, Lz70;->m:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast p0, Lys;

    .line 507
    .line 508
    invoke-virtual {p0}, Ljm2;->f()V

    .line 509
    .line 510
    .line 511
    iget-object p1, p0, Lys;->f:Ljava/util/TreeMap;

    .line 512
    .line 513
    invoke-virtual {p1}, Ljava/util/TreeMap;->size()I

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    if-nez p1, :cond_d

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :cond_d
    invoke-virtual {p0}, Ljm2;->b()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    :goto_7
    invoke-virtual {p2}, Lyn;->d()Z

    .line 525
    .line 526
    .line 527
    move-result p0

    .line 528
    if-eqz p0, :cond_e

    .line 529
    .line 530
    invoke-static {p1}, Lpp0;->K(I)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    const-string v1, "class_defs_size: "

    .line 535
    .line 536
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    invoke-virtual {p2, p0, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 541
    .line 542
    .line 543
    invoke-static {v3}, Lpp0;->K(I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    const-string v1, "class_defs_off:  "

    .line 548
    .line 549
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    invoke-virtual {p2, p0, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 554
    .line 555
    .line 556
    :cond_e
    invoke-virtual {p2, p1}, Lyn;->j(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {p2, v3}, Lyn;->j(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {p2}, Lyn;->d()Z

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    if-eqz p0, :cond_f

    .line 567
    .line 568
    invoke-static {v2}, Lpp0;->K(I)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    const-string p1, "data_size:       "

    .line 573
    .line 574
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-virtual {p2, p0, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 579
    .line 580
    .line 581
    invoke-static {v0}, Lpp0;->K(I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    const-string p1, "data_off:        "

    .line 586
    .line 587
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    invoke-virtual {p2, p0, v8}, Lyn;->c(Ljava/lang/String;I)V

    .line 592
    .line 593
    .line 594
    :cond_f
    invoke-virtual {p2, v2}, Lyn;->j(I)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {p2, v0}, Lyn;->j(I)V

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :cond_10
    const-string p0, "too many proto ids"

    .line 602
    .line 603
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_11
    new-instance p0, La80;

    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 614
    .line 615
    .line 616
    move-result p1

    .line 617
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object p2

    .line 625
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    const-string p2, "Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large."

    .line 630
    .line 631
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    const/4 p2, 0x0

    .line 636
    invoke-direct {p0, p2, p1}, Lsg0;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw p0

    .line 640
    :cond_12
    invoke-static {v4}, Lc80;->j(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-void
.end method
