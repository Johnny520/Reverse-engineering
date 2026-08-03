.class public final Lr4/x;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Lr4/p;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->j:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/16 v0, 0x70

    .line 2
    .line 3
    return v0
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 12

    .line 1
    iget-object v0, p1, Lr4/p;->d:Lr4/k0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p1, Lr4/p;->b:Lr4/k0;

    .line 8
    .line 9
    iget-object v2, p1, Lr4/p;->d:Lr4/k0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lr4/o0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v2}, Lr4/o0;->b()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v2}, Lr4/o0;->f()V

    .line 20
    .line 21
    .line 22
    iget v2, v2, Lr4/k0;->i:I

    .line 23
    .line 24
    add-int/2addr v3, v2

    .line 25
    sub-int/2addr v3, v1

    .line 26
    const-string v2, "dex\n"

    .line 27
    .line 28
    const-string v4, "\u0000"

    .line 29
    .line 30
    const-string v5, "035"

    .line 31
    .line 32
    invoke-static {v2, v5, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const-string v5, "file size not yet known"

    .line 41
    .line 42
    const v6, 0x12345678

    .line 43
    .line 44
    .line 45
    const/16 v7, 0x70

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    const/4 v9, 0x4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    new-instance v4, Lv4/c0;

    .line 53
    .line 54
    invoke-direct {v4, v2}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Lv4/c0;->l()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v10, "magic: "

    .line 62
    .line 63
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {p2, v8, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v4, "checksum"

    .line 71
    .line 72
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v4, 0x14

    .line 76
    .line 77
    const-string v10, "signature"

    .line 78
    .line 79
    invoke-virtual {p2, v4, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget v4, p1, Lr4/p;->r:I

    .line 83
    .line 84
    if-ltz v4, :cond_0

    .line 85
    .line 86
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const-string v10, "file_size:       "

    .line 91
    .line 92
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v7}, La/a;->Y0(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-string v10, "header_size:     "

    .line 104
    .line 105
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v6}, La/a;->Y0(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v10, "endian_tag:      "

    .line 117
    .line 118
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v4, "link_size:       0"

    .line 126
    .line 127
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v4, "link_off:        0"

    .line 131
    .line 132
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    const-string v10, "map_off:         "

    .line 140
    .line 141
    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {p2, v9, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_0
    invoke-static {v5}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_1
    :goto_0
    const/4 v4, 0x0

    .line 154
    move v10, v4

    .line 155
    :goto_1
    if-ge v10, v8, :cond_2

    .line 156
    .line 157
    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    invoke-virtual {p2, v11}, Lz4/d;->j(I)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v10, v10, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    const/16 v2, 0x18

    .line 168
    .line 169
    invoke-virtual {p2, v2}, Lz4/d;->o(I)V

    .line 170
    .line 171
    .line 172
    iget v2, p1, Lr4/p;->r:I

    .line 173
    .line 174
    if-ltz v2, :cond_12

    .line 175
    .line 176
    invoke-virtual {p2, v2}, Lz4/d;->k(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v7}, Lz4/d;->k(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v6}, Lz4/d;->k(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, v8}, Lz4/d;->o(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p1, Lr4/p;->f:Lr4/h0;

    .line 192
    .line 193
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Ljava/util/TreeMap;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-nez v2, :cond_3

    .line 205
    .line 206
    move v0, v4

    .line 207
    goto :goto_2

    .line 208
    :cond_3
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    :goto_2
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-eqz v5, :cond_4

    .line 217
    .line 218
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    const-string v6, "string_ids_size: "

    .line 223
    .line 224
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    const-string v6, "string_ids_off:  "

    .line 236
    .line 237
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_4
    invoke-virtual {p2, v2}, Lz4/d;->k(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p1, Lr4/p;->g:Lr4/h0;

    .line 251
    .line 252
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 253
    .line 254
    .line 255
    iget-object v2, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v2, Ljava/util/TreeMap;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-nez v5, :cond_5

    .line 264
    .line 265
    move v0, v4

    .line 266
    goto :goto_3

    .line 267
    :cond_5
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    :goto_3
    const/high16 v6, 0x10000

    .line 272
    .line 273
    if-gt v5, v6, :cond_11

    .line 274
    .line 275
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_6

    .line 280
    .line 281
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const-string v7, "type_ids_size:   "

    .line 286
    .line 287
    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {p2, v9, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const-string v7, "type_ids_off:    "

    .line 299
    .line 300
    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {p2, v9, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_6
    invoke-virtual {p2, v5}, Lz4/d;->k(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 311
    .line 312
    .line 313
    iget-object v0, p1, Lr4/p;->h:Lr4/h0;

    .line 314
    .line 315
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 316
    .line 317
    .line 318
    iget-object v2, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v2, Ljava/util/TreeMap;

    .line 321
    .line 322
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-nez v2, :cond_7

    .line 327
    .line 328
    move v0, v4

    .line 329
    goto :goto_4

    .line 330
    :cond_7
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    :goto_4
    if-gt v2, v6, :cond_10

    .line 335
    .line 336
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    if-eqz v5, :cond_8

    .line 341
    .line 342
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    const-string v6, "proto_ids_size:  "

    .line 347
    .line 348
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    const-string v6, "proto_ids_off:   "

    .line 360
    .line 361
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 366
    .line 367
    .line 368
    :cond_8
    invoke-virtual {p2, v2}, Lz4/d;->k(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 372
    .line 373
    .line 374
    iget-object v0, p1, Lr4/p;->i:Lr4/w;

    .line 375
    .line 376
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 377
    .line 378
    .line 379
    iget-object v2, v0, Lr4/w;->f:Ljava/util/TreeMap;

    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-nez v2, :cond_9

    .line 386
    .line 387
    move v0, v4

    .line 388
    goto :goto_5

    .line 389
    :cond_9
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    :goto_5
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    if-eqz v5, :cond_a

    .line 398
    .line 399
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    const-string v6, "field_ids_size:  "

    .line 404
    .line 405
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    const-string v6, "field_ids_off:   "

    .line 417
    .line 418
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    :cond_a
    invoke-virtual {p2, v2}, Lz4/d;->k(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 429
    .line 430
    .line 431
    iget-object v0, p1, Lr4/p;->j:Lr4/j0;

    .line 432
    .line 433
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 434
    .line 435
    .line 436
    iget-object v2, v0, Lr4/j0;->f:Ljava/util/TreeMap;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-nez v2, :cond_b

    .line 443
    .line 444
    move v0, v4

    .line 445
    goto :goto_6

    .line 446
    :cond_b
    invoke-virtual {v0}, Lr4/o0;->b()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    :goto_6
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-eqz v5, :cond_c

    .line 455
    .line 456
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    const-string v6, "method_ids_size: "

    .line 461
    .line 462
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    const-string v6, "method_ids_off:  "

    .line 474
    .line 475
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-virtual {p2, v9, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 480
    .line 481
    .line 482
    :cond_c
    invoke-virtual {p2, v2}, Lz4/d;->k(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 486
    .line 487
    .line 488
    iget-object p1, p1, Lr4/p;->k:Lr4/g;

    .line 489
    .line 490
    invoke-virtual {p1}, Lr4/o0;->f()V

    .line 491
    .line 492
    .line 493
    iget-object v0, p1, Lr4/g;->g:Ljava/util/TreeMap;

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-nez v0, :cond_d

    .line 500
    .line 501
    goto :goto_7

    .line 502
    :cond_d
    invoke-virtual {p1}, Lr4/o0;->b()I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    :goto_7
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    if-eqz p1, :cond_e

    .line 511
    .line 512
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    const-string v2, "class_defs_size: "

    .line 517
    .line 518
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-virtual {p2, v9, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    const-string v2, "class_defs_off:  "

    .line 530
    .line 531
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    invoke-virtual {p2, v9, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :cond_e
    invoke-virtual {p2, v0}, Lz4/d;->k(I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {p2, v4}, Lz4/d;->k(I)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 545
    .line 546
    .line 547
    move-result p1

    .line 548
    if-eqz p1, :cond_f

    .line 549
    .line 550
    invoke-static {v3}, La/a;->Y0(I)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    const-string v0, "data_size:       "

    .line 555
    .line 556
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    invoke-virtual {p2, v9, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    const-string v0, "data_off:        "

    .line 568
    .line 569
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    invoke-virtual {p2, v9, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :cond_f
    invoke-virtual {p2, v3}, Lz4/d;->k(I)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :cond_10
    const-string p1, "too many proto ids"

    .line 584
    .line 585
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :cond_11
    new-instance p1, Le4/b;

    .line 590
    .line 591
    invoke-virtual {v2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 592
    .line 593
    .line 594
    move-result-object p2

    .line 595
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 596
    .line 597
    .line 598
    move-result p2

    .line 599
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object p2

    .line 603
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    filled-new-array {p2, v0}, [Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object p2

    .line 611
    const-string v0, "Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large."

    .line 612
    .line 613
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object p2

    .line 617
    const/4 v0, 0x0

    .line 618
    invoke-direct {p1, p2, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 619
    .line 620
    .line 621
    throw p1

    .line 622
    :cond_12
    invoke-static {v5}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    return-void
.end method
