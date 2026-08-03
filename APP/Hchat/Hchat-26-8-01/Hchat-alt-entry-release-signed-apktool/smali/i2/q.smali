.class public final synthetic Li2/q;
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
    iput p1, p0, Li2/q;->g:I

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
    iget v0, p0, Li2/q;->g:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, Li2/o0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move-object v5, p1

    .line 16
    check-cast v5, Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v5}, Li2/o0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    new-instance v0, Li2/p0;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    check-cast v5, Ljava/lang/String;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v5}, Li2/p0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast p1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    new-instance v0, Lt2/g;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Lt2/g;-><init>(I)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    check-cast v0, Li2/i;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v0, v5

    .line 69
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v2, Ljava/lang/Integer;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object v2, v5

    .line 82
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Integer;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move-object v1, v5

    .line 99
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v3, 0x4

    .line 107
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    check-cast v3, Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move-object v3, v5

    .line 117
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    packed-switch v0, :pswitch_data_1

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lokio/a;->k()V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_b

    .line 131
    .line 132
    :pswitch_3
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    move-object v5, p1

    .line 139
    check-cast v5, Ljava/lang/String;

    .line 140
    .line 141
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance p1, Li2/e;

    .line 145
    .line 146
    new-instance v0, Li2/h0;

    .line 147
    .line 148
    invoke-direct {v0, v5}, Li2/h0;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p1, v3, v2, v1, v0}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    move-object v5, p1

    .line 155
    goto/16 :goto_b

    .line 156
    .line 157
    :pswitch_4
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    sget-object v0, Li2/d0;->f:Lp4/t;

    .line 162
    .line 163
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_7

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    if-eqz p1, :cond_8

    .line 173
    .line 174
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lfg/l;

    .line 177
    .line 178
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    move-object v5, p1

    .line 183
    check-cast v5, Li2/k;

    .line 184
    .line 185
    :cond_8
    :goto_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance p1, Li2/e;

    .line 189
    .line 190
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :pswitch_5
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    sget-object v0, Li2/d0;->e:Lp4/t;

    .line 199
    .line 200
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_9

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_9
    if-eqz p1, :cond_a

    .line 210
    .line 211
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lfg/l;

    .line 214
    .line 215
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    move-object v5, p1

    .line 220
    check-cast v5, Li2/l;

    .line 221
    .line 222
    :cond_a
    :goto_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance p1, Li2/e;

    .line 226
    .line 227
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :pswitch_6
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    sget-object v0, Li2/d0;->d:Lp4/t;

    .line 236
    .line 237
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_b

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_b
    if-eqz p1, :cond_c

    .line 247
    .line 248
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lfg/l;

    .line 251
    .line 252
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    move-object v5, p1

    .line 257
    check-cast v5, Li2/o0;

    .line 258
    .line 259
    :cond_c
    :goto_7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance p1, Li2/e;

    .line 263
    .line 264
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :pswitch_7
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    sget-object v0, Li2/d0;->c:Lp4/t;

    .line 273
    .line 274
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_d

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_d
    if-eqz p1, :cond_e

    .line 284
    .line 285
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Lfg/l;

    .line 288
    .line 289
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    move-object v5, p1

    .line 294
    check-cast v5, Li2/p0;

    .line 295
    .line 296
    :cond_e
    :goto_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance p1, Li2/e;

    .line 300
    .line 301
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_4

    .line 305
    .line 306
    :pswitch_8
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    sget-object v0, Li2/d0;->h:Lp4/t;

    .line 311
    .line 312
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_f

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_f
    if-eqz p1, :cond_10

    .line 322
    .line 323
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Lfg/l;

    .line 326
    .line 327
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    move-object v5, p1

    .line 332
    check-cast v5, Li2/f0;

    .line 333
    .line 334
    :cond_10
    :goto_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance p1, Li2/e;

    .line 338
    .line 339
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_4

    .line 343
    .line 344
    :pswitch_9
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    sget-object v0, Li2/d0;->g:Lp4/t;

    .line 349
    .line 350
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-static {p1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_11

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_11
    if-eqz p1, :cond_12

    .line 360
    .line 361
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lfg/l;

    .line 364
    .line 365
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    move-object v5, p1

    .line 370
    check-cast v5, Li2/u;

    .line 371
    .line 372
    :cond_12
    :goto_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance p1, Li2/e;

    .line 376
    .line 377
    invoke-direct {p1, v3, v2, v1, v5}, Li2/e;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :goto_b
    return-object v5

    .line 383
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    check-cast p1, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    new-instance v0, Lt2/h;

    .line 393
    .line 394
    invoke-direct {v0, p1}, Lt2/h;-><init>(I)V

    .line 395
    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    check-cast p1, Ljava/lang/Float;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    invoke-static {p1}, Lt2/f;->a(F)V

    .line 408
    .line 409
    .line 410
    new-instance v0, Lt2/f;

    .line 411
    .line 412
    invoke-direct {v0, p1}, Lt2/f;-><init>(F)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    check-cast p1, Ljava/util/List;

    .line 420
    .line 421
    new-instance v0, Lt2/i;

    .line 422
    .line 423
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    sget v3, Lt2/f;->b:F

    .line 428
    .line 429
    sget-object v3, Li2/d0;->B:Li2/c0;

    .line 430
    .line 431
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-static {v1, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    if-eqz v1, :cond_13

    .line 437
    .line 438
    iget-object v3, v3, Li2/c0;->h:Lfg/l;

    .line 439
    .line 440
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, Lt2/f;

    .line 445
    .line 446
    goto :goto_c

    .line 447
    :cond_13
    move-object v1, v5

    .line 448
    :goto_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget v1, v1, Lt2/f;->a:F

    .line 452
    .line 453
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    sget-object v4, Li2/d0;->C:Li2/c0;

    .line 458
    .line 459
    invoke-static {v3, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    if-eqz v3, :cond_14

    .line 463
    .line 464
    iget-object v4, v4, Li2/c0;->h:Lfg/l;

    .line 465
    .line 466
    invoke-interface {v4, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Lt2/h;

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_14
    move-object v3, v5

    .line 474
    :goto_d
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    iget v3, v3, Lt2/h;->a:I

    .line 478
    .line 479
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    sget-object v2, Li2/d0;->D:Li2/c0;

    .line 484
    .line 485
    invoke-static {p1, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    if-eqz p1, :cond_15

    .line 489
    .line 490
    iget-object v2, v2, Li2/c0;->h:Lfg/l;

    .line 491
    .line 492
    invoke-interface {v2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    move-object v5, p1

    .line 497
    check-cast v5, Lt2/g;

    .line 498
    .line 499
    :cond_15
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    iget p1, v5, Lt2/g;->a:I

    .line 503
    .line 504
    invoke-direct {v0, v1, v3, p1}, Lt2/i;-><init>(FII)V

    .line 505
    .line 506
    .line 507
    return-object v0

    .line 508
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    check-cast p1, Ljava/util/List;

    .line 512
    .line 513
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-eqz v0, :cond_16

    .line 518
    .line 519
    check-cast v0, Ljava/lang/String;

    .line 520
    .line 521
    goto :goto_e

    .line 522
    :cond_16
    move-object v0, v5

    .line 523
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    sget-object v1, Li2/d0;->i:Lp4/t;

    .line 531
    .line 532
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 533
    .line 534
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-eqz v2, :cond_17

    .line 539
    .line 540
    goto :goto_f

    .line 541
    :cond_17
    if-eqz p1, :cond_18

    .line 542
    .line 543
    iget-object v1, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v1, Lfg/l;

    .line 546
    .line 547
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    move-object v5, p1

    .line 552
    check-cast v5, Li2/l0;

    .line 553
    .line 554
    :cond_18
    :goto_f
    new-instance p1, Li2/k;

    .line 555
    .line 556
    invoke-direct {p1, v0, v5}, Li2/k;-><init>(Ljava/lang/String;Li2/l0;)V

    .line 557
    .line 558
    .line 559
    return-object p1

    .line 560
    :pswitch_e
    new-instance v0, Lp2/a;

    .line 561
    .line 562
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    check-cast p1, Ljava/lang/String;

    .line 566
    .line 567
    invoke-static {p1}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const-string v3, "und"

    .line 576
    .line 577
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v2

    .line 581
    if-eqz v2, :cond_19

    .line 582
    .line 583
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 584
    .line 585
    new-instance v3, Ljava/lang/StringBuilder;

    .line 586
    .line 587
    const-string v4, "The language tag "

    .line 588
    .line 589
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const-string p1, " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtag delimiter and must be replaced with \'-\'."

    .line 596
    .line 597
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    invoke-virtual {v2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    :cond_19
    invoke-direct {v0, v1}, Lp2/a;-><init>(Ljava/util/Locale;)V

    .line 608
    .line 609
    .line 610
    return-object v0

    .line 611
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    check-cast p1, Ljava/util/List;

    .line 615
    .line 616
    new-instance v0, Ljava/util/ArrayList;

    .line 617
    .line 618
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 623
    .line 624
    .line 625
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    :goto_10
    if-ge v3, v1, :cond_1c

    .line 630
    .line 631
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    sget-object v4, Li2/d0;->z:Lp4/t;

    .line 636
    .line 637
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 638
    .line 639
    invoke-static {v2, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v6

    .line 643
    if-eqz v6, :cond_1b

    .line 644
    .line 645
    :cond_1a
    move-object v2, v5

    .line 646
    goto :goto_11

    .line 647
    :cond_1b
    if-eqz v2, :cond_1a

    .line 648
    .line 649
    iget-object v4, v4, Lp4/t;->i:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v4, Lfg/l;

    .line 652
    .line 653
    invoke-interface {v4, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    check-cast v2, Lp2/a;

    .line 658
    .line 659
    :goto_11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    add-int/lit8 v3, v3, 0x1

    .line 666
    .line 667
    goto :goto_10

    .line 668
    :cond_1c
    new-instance p1, Lp2/b;

    .line 669
    .line 670
    invoke-direct {p1, v0}, Lp2/b;-><init>(Ljava/util/List;)V

    .line 671
    .line 672
    .line 673
    return-object p1

    .line 674
    :pswitch_10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 675
    .line 676
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_1d

    .line 681
    .line 682
    new-instance p1, Le1/b;

    .line 683
    .line 684
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 690
    .line 691
    .line 692
    goto :goto_13

    .line 693
    :cond_1d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    check-cast p1, Ljava/util/List;

    .line 697
    .line 698
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    if-eqz v0, :cond_1e

    .line 703
    .line 704
    check-cast v0, Ljava/lang/Float;

    .line 705
    .line 706
    goto :goto_12

    .line 707
    :cond_1e
    move-object v0, v5

    .line 708
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object p1

    .line 719
    if-eqz p1, :cond_1f

    .line 720
    .line 721
    move-object v5, p1

    .line 722
    check-cast v5, Ljava/lang/Float;

    .line 723
    .line 724
    :cond_1f
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 728
    .line 729
    .line 730
    move-result p1

    .line 731
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    int-to-long v0, v0

    .line 736
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 737
    .line 738
    .line 739
    move-result p1

    .line 740
    int-to-long v2, p1

    .line 741
    const/16 p1, 0x20

    .line 742
    .line 743
    shl-long/2addr v0, p1

    .line 744
    const-wide v4, 0xffffffffL

    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    and-long/2addr v2, v4

    .line 750
    or-long/2addr v0, v2

    .line 751
    new-instance p1, Le1/b;

    .line 752
    .line 753
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 754
    .line 755
    .line 756
    :goto_13
    return-object p1

    .line 757
    :pswitch_11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_20

    .line 766
    .line 767
    new-instance p1, Lu2/p;

    .line 768
    .line 769
    const-wide v0, 0x200000000L

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    invoke-direct {p1, v0, v1}, Lu2/p;-><init>(J)V

    .line 775
    .line 776
    .line 777
    goto :goto_14

    .line 778
    :cond_20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result p1

    .line 786
    if-eqz p1, :cond_21

    .line 787
    .line 788
    new-instance p1, Lu2/p;

    .line 789
    .line 790
    const-wide v0, 0x100000000L

    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    invoke-direct {p1, v0, v1}, Lu2/p;-><init>(J)V

    .line 796
    .line 797
    .line 798
    goto :goto_14

    .line 799
    :cond_21
    new-instance p1, Lu2/p;

    .line 800
    .line 801
    const-wide/16 v0, 0x0

    .line 802
    .line 803
    invoke-direct {p1, v0, v1}, Lu2/p;-><init>(J)V

    .line 804
    .line 805
    .line 806
    :goto_14
    return-object p1

    .line 807
    :pswitch_12
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 808
    .line 809
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    if-eqz v1, :cond_22

    .line 814
    .line 815
    sget-wide v0, Lu2/o;->c:J

    .line 816
    .line 817
    new-instance p1, Lu2/o;

    .line 818
    .line 819
    invoke-direct {p1, v0, v1}, Lu2/o;-><init>(J)V

    .line 820
    .line 821
    .line 822
    goto :goto_16

    .line 823
    :cond_22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    check-cast p1, Ljava/util/List;

    .line 827
    .line 828
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    if-eqz v1, :cond_23

    .line 833
    .line 834
    check-cast v1, Ljava/lang/Float;

    .line 835
    .line 836
    goto :goto_15

    .line 837
    :cond_23
    move-object v1, v5

    .line 838
    :goto_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    sget-object v2, Li2/d0;->w:Li2/c0;

    .line 850
    .line 851
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    if-eqz p1, :cond_24

    .line 855
    .line 856
    iget-object v0, v2, Li2/c0;->h:Lfg/l;

    .line 857
    .line 858
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object p1

    .line 862
    move-object v5, p1

    .line 863
    check-cast v5, Lu2/p;

    .line 864
    .line 865
    :cond_24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget-wide v2, v5, Lu2/p;->a:J

    .line 869
    .line 870
    invoke-static {v2, v3, v1}, Lx6/d;->R(JF)J

    .line 871
    .line 872
    .line 873
    move-result-wide v0

    .line 874
    new-instance p1, Lu2/o;

    .line 875
    .line 876
    invoke-direct {p1, v0, v1}, Lu2/o;-><init>(J)V

    .line 877
    .line 878
    .line 879
    :goto_16
    return-object p1

    .line 880
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    check-cast p1, Ljava/lang/Integer;

    .line 884
    .line 885
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 886
    .line 887
    .line 888
    move-result p1

    .line 889
    new-instance v0, Lm2/j;

    .line 890
    .line 891
    invoke-direct {v0, p1}, Lm2/j;-><init>(I)V

    .line 892
    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    check-cast p1, Ljava/lang/Integer;

    .line 899
    .line 900
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 901
    .line 902
    .line 903
    move-result p1

    .line 904
    new-instance v0, Lm2/i;

    .line 905
    .line 906
    invoke-direct {v0, p1}, Lm2/i;-><init>(I)V

    .line 907
    .line 908
    .line 909
    return-object v0

    .line 910
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    check-cast p1, Ljava/util/List;

    .line 914
    .line 915
    new-instance v0, Ljava/util/ArrayList;

    .line 916
    .line 917
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 922
    .line 923
    .line 924
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    :goto_17
    if-ge v3, v1, :cond_27

    .line 929
    .line 930
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    sget-object v4, Li2/d0;->b:Lp4/t;

    .line 935
    .line 936
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 937
    .line 938
    invoke-static {v2, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    if-eqz v6, :cond_26

    .line 943
    .line 944
    :cond_25
    move-object v2, v5

    .line 945
    goto :goto_18

    .line 946
    :cond_26
    if-eqz v2, :cond_25

    .line 947
    .line 948
    iget-object v4, v4, Lp4/t;->i:Ljava/lang/Object;

    .line 949
    .line 950
    check-cast v4, Lfg/l;

    .line 951
    .line 952
    invoke-interface {v4, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    check-cast v2, Li2/e;

    .line 957
    .line 958
    :goto_18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    add-int/lit8 v3, v3, 0x1

    .line 965
    .line 966
    goto :goto_17

    .line 967
    :cond_27
    return-object v0

    .line 968
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    check-cast p1, Ljava/lang/Integer;

    .line 972
    .line 973
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 974
    .line 975
    .line 976
    move-result p1

    .line 977
    new-instance v0, Lt2/d;

    .line 978
    .line 979
    invoke-direct {v0, p1}, Lt2/d;-><init>(I)V

    .line 980
    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    check-cast p1, Ljava/lang/Integer;

    .line 987
    .line 988
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 989
    .line 990
    .line 991
    move-result p1

    .line 992
    new-instance v0, Lt2/m;

    .line 993
    .line 994
    invoke-direct {v0, p1}, Lt2/m;-><init>(I)V

    .line 995
    .line 996
    .line 997
    return-object v0

    .line 998
    :pswitch_18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    .line 1000
    .line 1001
    check-cast p1, Ljava/util/List;

    .line 1002
    .line 1003
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    if-eqz v0, :cond_28

    .line 1008
    .line 1009
    check-cast v0, Ljava/lang/String;

    .line 1010
    .line 1011
    goto :goto_19

    .line 1012
    :cond_28
    move-object v0, v5

    .line 1013
    :goto_19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object p1

    .line 1020
    sget-object v1, Li2/d0;->i:Lp4/t;

    .line 1021
    .line 1022
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1023
    .line 1024
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    if-eqz v2, :cond_29

    .line 1029
    .line 1030
    goto :goto_1a

    .line 1031
    :cond_29
    if-eqz p1, :cond_2a

    .line 1032
    .line 1033
    iget-object v1, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v1, Lfg/l;

    .line 1036
    .line 1037
    invoke-interface {v1, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p1

    .line 1041
    move-object v5, p1

    .line 1042
    check-cast v5, Li2/l0;

    .line 1043
    .line 1044
    :cond_2a
    :goto_1a
    new-instance p1, Li2/l;

    .line 1045
    .line 1046
    invoke-direct {p1, v0, v5}, Li2/l;-><init>(Ljava/lang/String;Li2/l0;)V

    .line 1047
    .line 1048
    .line 1049
    return-object p1

    .line 1050
    :pswitch_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    check-cast p1, Ljava/lang/Integer;

    .line 1054
    .line 1055
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1056
    .line 1057
    .line 1058
    move-result p1

    .line 1059
    new-instance v0, Lt2/k;

    .line 1060
    .line 1061
    invoke-direct {v0, p1}, Lt2/k;-><init>(I)V

    .line 1062
    .line 1063
    .line 1064
    return-object v0

    .line 1065
    :pswitch_1a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    check-cast p1, Ljava/util/List;

    .line 1069
    .line 1070
    new-instance v6, Lf1/q0;

    .line 1071
    .line 1072
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    sget v1, Lf1/w;->h:I

    .line 1077
    .line 1078
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1079
    .line 1080
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    if-eqz v0, :cond_2c

    .line 1084
    .line 1085
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1086
    .line 1087
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v3

    .line 1091
    if-eqz v3, :cond_2b

    .line 1092
    .line 1093
    sget-wide v7, Lf1/w;->g:J

    .line 1094
    .line 1095
    new-instance v0, Lf1/w;

    .line 1096
    .line 1097
    invoke-direct {v0, v7, v8}, Lf1/w;-><init>(J)V

    .line 1098
    .line 1099
    .line 1100
    goto :goto_1b

    .line 1101
    :cond_2b
    check-cast v0, Ljava/lang/Integer;

    .line 1102
    .line 1103
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1104
    .line 1105
    .line 1106
    move-result v0

    .line 1107
    invoke-static {v0}, Lf1/c0;->c(I)J

    .line 1108
    .line 1109
    .line 1110
    move-result-wide v7

    .line 1111
    new-instance v0, Lf1/w;

    .line 1112
    .line 1113
    invoke-direct {v0, v7, v8}, Lf1/w;-><init>(J)V

    .line 1114
    .line 1115
    .line 1116
    goto :goto_1b

    .line 1117
    :cond_2c
    move-object v0, v5

    .line 1118
    :goto_1b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    iget-wide v8, v0, Lf1/w;->a:J

    .line 1122
    .line 1123
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    sget-object v3, Li2/d0;->x:Li2/c0;

    .line 1128
    .line 1129
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    if-eqz v0, :cond_2d

    .line 1133
    .line 1134
    iget-object v1, v3, Li2/c0;->h:Lfg/l;

    .line 1135
    .line 1136
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, Le1/b;

    .line 1141
    .line 1142
    goto :goto_1c

    .line 1143
    :cond_2d
    move-object v0, v5

    .line 1144
    :goto_1c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-wide v10, v0, Le1/b;->a:J

    .line 1148
    .line 1149
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object p1

    .line 1153
    if-eqz p1, :cond_2e

    .line 1154
    .line 1155
    move-object v5, p1

    .line 1156
    check-cast v5, Ljava/lang/Float;

    .line 1157
    .line 1158
    :cond_2e
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 1162
    .line 1163
    .line 1164
    move-result v7

    .line 1165
    invoke-direct/range {v6 .. v11}, Lf1/q0;-><init>(FJJ)V

    .line 1166
    .line 1167
    .line 1168
    return-object v6

    .line 1169
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    check-cast p1, Ljava/util/List;

    .line 1173
    .line 1174
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    if-eqz v0, :cond_2f

    .line 1179
    .line 1180
    check-cast v0, Ljava/lang/Integer;

    .line 1181
    .line 1182
    goto :goto_1d

    .line 1183
    :cond_2f
    move-object v0, v5

    .line 1184
    :goto_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1188
    .line 1189
    .line 1190
    move-result v0

    .line 1191
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object p1

    .line 1195
    if-eqz p1, :cond_30

    .line 1196
    .line 1197
    move-object v5, p1

    .line 1198
    check-cast v5, Ljava/lang/Integer;

    .line 1199
    .line 1200
    :cond_30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1204
    .line 1205
    .line 1206
    move-result p1

    .line 1207
    invoke-static {v0, p1}, Li2/e0;->b(II)J

    .line 1208
    .line 1209
    .line 1210
    move-result-wide v0

    .line 1211
    new-instance p1, Li2/m0;

    .line 1212
    .line 1213
    invoke-direct {p1, v0, v1}, Li2/m0;-><init>(J)V

    .line 1214
    .line 1215
    .line 1216
    return-object p1

    .line 1217
    :pswitch_1c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    check-cast p1, Ljava/lang/Float;

    .line 1221
    .line 1222
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 1223
    .line 1224
    .line 1225
    move-result p1

    .line 1226
    new-instance v0, Lt2/a;

    .line 1227
    .line 1228
    invoke-direct {v0, p1}, Lt2/a;-><init>(F)V

    .line 1229
    .line 1230
    .line 1231
    return-object v0

    .line 1232
    :pswitch_1d
    new-instance v0, Lm2/k;

    .line 1233
    .line 1234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    check-cast p1, Ljava/lang/Integer;

    .line 1238
    .line 1239
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1240
    .line 1241
    .line 1242
    move-result p1

    .line 1243
    invoke-direct {v0, p1}, Lm2/k;-><init>(I)V

    .line 1244
    .line 1245
    .line 1246
    return-object v0

    .line 1247
    :pswitch_1e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    check-cast p1, Ljava/util/List;

    .line 1251
    .line 1252
    new-instance v0, Lt2/q;

    .line 1253
    .line 1254
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    sget-object v2, Lu2/o;->b:[Lu2/p;

    .line 1259
    .line 1260
    sget-object v2, Li2/d0;->v:Li2/c0;

    .line 1261
    .line 1262
    iget-object v2, v2, Li2/c0;->h:Lfg/l;

    .line 1263
    .line 1264
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1265
    .line 1266
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    if-eqz v1, :cond_31

    .line 1270
    .line 1271
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    check-cast v1, Lu2/o;

    .line 1276
    .line 1277
    goto :goto_1e

    .line 1278
    :cond_31
    move-object v1, v5

    .line 1279
    :goto_1e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1280
    .line 1281
    .line 1282
    iget-wide v6, v1, Lu2/o;->a:J

    .line 1283
    .line 1284
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object p1

    .line 1288
    invoke-static {p1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    if-eqz p1, :cond_32

    .line 1292
    .line 1293
    invoke-interface {v2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object p1

    .line 1297
    move-object v5, p1

    .line 1298
    check-cast v5, Lu2/o;

    .line 1299
    .line 1300
    :cond_32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    iget-wide v1, v5, Lu2/o;->a:J

    .line 1304
    .line 1305
    invoke-direct {v0, v6, v7, v1, v2}, Lt2/q;-><init>(JJ)V

    .line 1306
    .line 1307
    .line 1308
    return-object v0

    .line 1309
    :pswitch_1f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    check-cast p1, Ljava/util/List;

    .line 1313
    .line 1314
    new-instance v0, Lt2/p;

    .line 1315
    .line 1316
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v1

    .line 1320
    check-cast v1, Ljava/lang/Number;

    .line 1321
    .line 1322
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1323
    .line 1324
    .line 1325
    move-result v1

    .line 1326
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object p1

    .line 1330
    check-cast p1, Ljava/lang/Number;

    .line 1331
    .line 1332
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 1333
    .line 1334
    .line 1335
    move-result p1

    .line 1336
    invoke-direct {v0, v1, p1}, Lt2/p;-><init>(FF)V

    .line 1337
    .line 1338
    .line 1339
    return-object v0

    .line 1340
    :pswitch_20
    new-instance v0, Lt2/l;

    .line 1341
    .line 1342
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1343
    .line 1344
    .line 1345
    check-cast p1, Ljava/lang/Integer;

    .line 1346
    .line 1347
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1348
    .line 1349
    .line 1350
    move-result p1

    .line 1351
    invoke-direct {v0, p1}, Lt2/l;-><init>(I)V

    .line 1352
    .line 1353
    .line 1354
    return-object v0

    .line 1355
    :pswitch_21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1356
    .line 1357
    .line 1358
    check-cast p1, Ljava/util/List;

    .line 1359
    .line 1360
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v0

    .line 1364
    sget-object v1, Li2/d0;->a:Lp4/t;

    .line 1365
    .line 1366
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1367
    .line 1368
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1369
    .line 1370
    .line 1371
    move-result v2

    .line 1372
    if-eqz v2, :cond_34

    .line 1373
    .line 1374
    :cond_33
    move-object v0, v5

    .line 1375
    goto :goto_1f

    .line 1376
    :cond_34
    if-eqz v0, :cond_33

    .line 1377
    .line 1378
    iget-object v1, v1, Lp4/t;->i:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v1, Lfg/l;

    .line 1381
    .line 1382
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    check-cast v0, Ljava/util/List;

    .line 1387
    .line 1388
    :goto_1f
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object p1

    .line 1392
    if-eqz p1, :cond_35

    .line 1393
    .line 1394
    move-object v5, p1

    .line 1395
    check-cast v5, Ljava/lang/String;

    .line 1396
    .line 1397
    :cond_35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1398
    .line 1399
    .line 1400
    new-instance p1, Li2/g;

    .line 1401
    .line 1402
    invoke-direct {p1, v0, v5}, Li2/g;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1403
    .line 1404
    .line 1405
    return-object p1

    .line 1406
    :pswitch_22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1407
    .line 1408
    .line 1409
    check-cast p1, Ljava/util/List;

    .line 1410
    .line 1411
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    sget-object v3, Li2/d0;->h:Lp4/t;

    .line 1416
    .line 1417
    iget-object v3, v3, Lp4/t;->i:Ljava/lang/Object;

    .line 1418
    .line 1419
    check-cast v3, Lfg/l;

    .line 1420
    .line 1421
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1422
    .line 1423
    invoke-static {v0, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v7

    .line 1427
    if-eqz v7, :cond_37

    .line 1428
    .line 1429
    :cond_36
    move-object v0, v5

    .line 1430
    goto :goto_20

    .line 1431
    :cond_37
    if-eqz v0, :cond_36

    .line 1432
    .line 1433
    invoke-interface {v3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    check-cast v0, Li2/f0;

    .line 1438
    .line 1439
    :goto_20
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v4

    .line 1443
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1444
    .line 1445
    .line 1446
    move-result v7

    .line 1447
    if-eqz v7, :cond_39

    .line 1448
    .line 1449
    :cond_38
    move-object v4, v5

    .line 1450
    goto :goto_21

    .line 1451
    :cond_39
    if-eqz v4, :cond_38

    .line 1452
    .line 1453
    invoke-interface {v3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v4

    .line 1457
    check-cast v4, Li2/f0;

    .line 1458
    .line 1459
    :goto_21
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v2

    .line 1463
    invoke-static {v2, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1464
    .line 1465
    .line 1466
    move-result v7

    .line 1467
    if-eqz v7, :cond_3b

    .line 1468
    .line 1469
    :cond_3a
    move-object v2, v5

    .line 1470
    goto :goto_22

    .line 1471
    :cond_3b
    if-eqz v2, :cond_3a

    .line 1472
    .line 1473
    invoke-interface {v3, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v2

    .line 1477
    check-cast v2, Li2/f0;

    .line 1478
    .line 1479
    :goto_22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1480
    .line 1481
    .line 1482
    move-result-object p1

    .line 1483
    invoke-static {p1, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v1

    .line 1487
    if-eqz v1, :cond_3c

    .line 1488
    .line 1489
    goto :goto_23

    .line 1490
    :cond_3c
    if-eqz p1, :cond_3d

    .line 1491
    .line 1492
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object p1

    .line 1496
    move-object v5, p1

    .line 1497
    check-cast v5, Li2/f0;

    .line 1498
    .line 1499
    :cond_3d
    :goto_23
    new-instance p1, Li2/l0;

    .line 1500
    .line 1501
    invoke-direct {p1, v0, v4, v2, v5}, Li2/l0;-><init>(Li2/f0;Li2/f0;Li2/f0;Li2/f0;)V

    .line 1502
    .line 1503
    .line 1504
    return-object p1

    .line 1505
    :pswitch_23
    check-cast p1, Li2/r;

    .line 1506
    .line 1507
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1508
    .line 1509
    const-string v1, "["

    .line 1510
    .line 1511
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1512
    .line 1513
    .line 1514
    iget v1, p1, Li2/r;->b:I

    .line 1515
    .line 1516
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1517
    .line 1518
    .line 1519
    const-string v1, ", "

    .line 1520
    .line 1521
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1522
    .line 1523
    .line 1524
    iget p1, p1, Li2/r;->c:I

    .line 1525
    .line 1526
    const/16 v1, 0x29

    .line 1527
    .line 1528
    invoke-static {v0, p1, v1}, Lp/a;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object p1

    .line 1532
    return-object p1

    .line 1533
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
