.class public final synthetic Lwb/s1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/s1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/s1;->h:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/s1;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lwb/w1;

    .line 37
    .line 38
    const/16 p3, 0xc

    .line 39
    .line 40
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 41
    .line 42
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 43
    .line 44
    .line 45
    const p3, 0x5945182f

    .line 46
    .line 47
    .line 48
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/16 p3, 0x30

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    const/16 v0, 0x10

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    if-eq p1, v0, :cond_2

    .line 69
    .line 70
    move p1, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    :goto_2
    and-int/2addr p3, v1

    .line 74
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    new-instance p1, Lwb/w1;

    .line 81
    .line 82
    const/16 p3, 0x14

    .line 83
    .line 84
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 85
    .line 86
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 87
    .line 88
    .line 89
    const p3, 0x238fe390

    .line 90
    .line 91
    .line 92
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/16 p3, 0x30

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 104
    .line 105
    .line 106
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 107
    .line 108
    return-object p1

    .line 109
    :pswitch_1
    const/16 v0, 0x10

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    if-eq p1, v0, :cond_4

    .line 113
    .line 114
    move p1, v1

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    const/4 p1, 0x0

    .line 117
    :goto_4
    and-int/2addr p3, v1

    .line 118
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    new-instance p1, Lwb/w1;

    .line 125
    .line 126
    const/16 p3, 0x16

    .line 127
    .line 128
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 129
    .line 130
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 131
    .line 132
    .line 133
    const p3, 0x218aa838

    .line 134
    .line 135
    .line 136
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/16 p3, 0x30

    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 144
    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 148
    .line 149
    .line 150
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 151
    .line 152
    return-object p1

    .line 153
    :pswitch_2
    const/16 v0, 0x10

    .line 154
    .line 155
    const/4 v1, 0x1

    .line 156
    if-eq p1, v0, :cond_6

    .line 157
    .line 158
    move p1, v1

    .line 159
    goto :goto_6

    .line 160
    :cond_6
    const/4 p1, 0x0

    .line 161
    :goto_6
    and-int/2addr p3, v1

    .line 162
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    new-instance p1, Lwb/w1;

    .line 169
    .line 170
    const/16 p3, 0x15

    .line 171
    .line 172
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 173
    .line 174
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 175
    .line 176
    .line 177
    const p3, -0xf6336e8

    .line 178
    .line 179
    .line 180
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    const/16 p3, 0x30

    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 192
    .line 193
    .line 194
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_3
    const/16 v0, 0x10

    .line 198
    .line 199
    const/4 v1, 0x1

    .line 200
    if-eq p1, v0, :cond_8

    .line 201
    .line 202
    move p1, v1

    .line 203
    goto :goto_8

    .line 204
    :cond_8
    const/4 p1, 0x0

    .line 205
    :goto_8
    and-int/2addr p3, v1

    .line 206
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_9

    .line 211
    .line 212
    new-instance p1, Lwb/w1;

    .line 213
    .line 214
    const/16 p3, 0xe

    .line 215
    .line 216
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 217
    .line 218
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 219
    .line 220
    .line 221
    const p3, -0x4ba3930c

    .line 222
    .line 223
    .line 224
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    const/16 p3, 0x30

    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 232
    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 236
    .line 237
    .line 238
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 239
    .line 240
    return-object p1

    .line 241
    :pswitch_4
    const/16 v0, 0x10

    .line 242
    .line 243
    const/4 v1, 0x1

    .line 244
    if-eq p1, v0, :cond_a

    .line 245
    .line 246
    move p1, v1

    .line 247
    goto :goto_a

    .line 248
    :cond_a
    const/4 p1, 0x0

    .line 249
    :goto_a
    and-int/2addr p3, v1

    .line 250
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_b

    .line 255
    .line 256
    new-instance p1, Lwb/w1;

    .line 257
    .line 258
    const/16 p3, 0x13

    .line 259
    .line 260
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 261
    .line 262
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 263
    .line 264
    .line 265
    const p3, 0x1294eefd

    .line 266
    .line 267
    .line 268
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    const/16 p3, 0x30

    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 276
    .line 277
    .line 278
    goto :goto_b

    .line 279
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 280
    .line 281
    .line 282
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 283
    .line 284
    return-object p1

    .line 285
    :pswitch_5
    const/16 v0, 0x10

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    if-eq p1, v0, :cond_c

    .line 289
    .line 290
    move p1, v1

    .line 291
    goto :goto_c

    .line 292
    :cond_c
    const/4 p1, 0x0

    .line 293
    :goto_c
    and-int/2addr p3, v1

    .line 294
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_d

    .line 299
    .line 300
    new-instance p1, Lwb/w1;

    .line 301
    .line 302
    const/16 p3, 0x8

    .line 303
    .line 304
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 305
    .line 306
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 307
    .line 308
    .line 309
    const p3, 0x1f925ec2

    .line 310
    .line 311
    .line 312
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    const/16 p3, 0x30

    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 320
    .line 321
    .line 322
    goto :goto_d

    .line 323
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 324
    .line 325
    .line 326
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 327
    .line 328
    return-object p1

    .line 329
    :pswitch_6
    const/16 v0, 0x10

    .line 330
    .line 331
    const/4 v1, 0x1

    .line 332
    if-eq p1, v0, :cond_e

    .line 333
    .line 334
    move p1, v1

    .line 335
    goto :goto_e

    .line 336
    :cond_e
    const/4 p1, 0x0

    .line 337
    :goto_e
    and-int/2addr p3, v1

    .line 338
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    if-eqz p1, :cond_f

    .line 343
    .line 344
    new-instance p1, Lwb/w1;

    .line 345
    .line 346
    const/16 p3, 0x11

    .line 347
    .line 348
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 349
    .line 350
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 351
    .line 352
    .line 353
    const p3, 0x64acf799

    .line 354
    .line 355
    .line 356
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    const/16 p3, 0x30

    .line 361
    .line 362
    const/4 v0, 0x0

    .line 363
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 364
    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 368
    .line 369
    .line 370
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 371
    .line 372
    return-object p1

    .line 373
    :pswitch_7
    const/16 v0, 0x10

    .line 374
    .line 375
    const/4 v1, 0x1

    .line 376
    if-eq p1, v0, :cond_10

    .line 377
    .line 378
    move p1, v1

    .line 379
    goto :goto_10

    .line 380
    :cond_10
    const/4 p1, 0x0

    .line 381
    :goto_10
    and-int/2addr p3, v1

    .line 382
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    if-eqz p1, :cond_11

    .line 387
    .line 388
    new-instance p1, Lwb/w1;

    .line 389
    .line 390
    const/16 p3, 0x1c

    .line 391
    .line 392
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 393
    .line 394
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 395
    .line 396
    .line 397
    const p3, -0x69a010ac

    .line 398
    .line 399
    .line 400
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    const/16 p3, 0x30

    .line 405
    .line 406
    const/4 v0, 0x0

    .line 407
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 408
    .line 409
    .line 410
    goto :goto_11

    .line 411
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 412
    .line 413
    .line 414
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 415
    .line 416
    return-object p1

    .line 417
    :pswitch_8
    const/16 v0, 0x10

    .line 418
    .line 419
    const/4 v1, 0x1

    .line 420
    if-eq p1, v0, :cond_12

    .line 421
    .line 422
    move p1, v1

    .line 423
    goto :goto_12

    .line 424
    :cond_12
    const/4 p1, 0x0

    .line 425
    :goto_12
    and-int/2addr p3, v1

    .line 426
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 427
    .line 428
    .line 429
    move-result p1

    .line 430
    if-eqz p1, :cond_13

    .line 431
    .line 432
    new-instance p1, Lwb/w1;

    .line 433
    .line 434
    const/16 p3, 0x18

    .line 435
    .line 436
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 437
    .line 438
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 439
    .line 440
    .line 441
    const p3, -0x70f8928e

    .line 442
    .line 443
    .line 444
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    const/16 p3, 0x30

    .line 449
    .line 450
    const/4 v0, 0x0

    .line 451
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 452
    .line 453
    .line 454
    goto :goto_13

    .line 455
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 456
    .line 457
    .line 458
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 459
    .line 460
    return-object p1

    .line 461
    :pswitch_9
    const/16 v0, 0x10

    .line 462
    .line 463
    const/4 v1, 0x1

    .line 464
    if-eq p1, v0, :cond_14

    .line 465
    .line 466
    move p1, v1

    .line 467
    goto :goto_14

    .line 468
    :cond_14
    const/4 p1, 0x0

    .line 469
    :goto_14
    and-int/2addr p3, v1

    .line 470
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    if-eqz p1, :cond_15

    .line 475
    .line 476
    new-instance p1, Lwb/w1;

    .line 477
    .line 478
    const/16 p3, 0x12

    .line 479
    .line 480
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 481
    .line 482
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 483
    .line 484
    .line 485
    const p3, -0x71596aa4

    .line 486
    .line 487
    .line 488
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    const/16 p3, 0x30

    .line 493
    .line 494
    const/4 v0, 0x0

    .line 495
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 496
    .line 497
    .line 498
    goto :goto_15

    .line 499
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 500
    .line 501
    .line 502
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 503
    .line 504
    return-object p1

    .line 505
    :pswitch_a
    const/16 v0, 0x10

    .line 506
    .line 507
    const/4 v1, 0x1

    .line 508
    if-eq p1, v0, :cond_16

    .line 509
    .line 510
    move p1, v1

    .line 511
    goto :goto_16

    .line 512
    :cond_16
    const/4 p1, 0x0

    .line 513
    :goto_16
    and-int/2addr p3, v1

    .line 514
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 515
    .line 516
    .line 517
    move-result p1

    .line 518
    if-eqz p1, :cond_17

    .line 519
    .line 520
    new-instance p1, Lwb/w1;

    .line 521
    .line 522
    const/16 p3, 0x10

    .line 523
    .line 524
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 525
    .line 526
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 527
    .line 528
    .line 529
    const p3, -0x252df5c0

    .line 530
    .line 531
    .line 532
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 533
    .line 534
    .line 535
    move-result-object p1

    .line 536
    const/16 p3, 0x30

    .line 537
    .line 538
    const/4 v0, 0x0

    .line 539
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 540
    .line 541
    .line 542
    goto :goto_17

    .line 543
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 544
    .line 545
    .line 546
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 547
    .line 548
    return-object p1

    .line 549
    :pswitch_b
    const/16 v0, 0x10

    .line 550
    .line 551
    const/4 v1, 0x1

    .line 552
    if-eq p1, v0, :cond_18

    .line 553
    .line 554
    move p1, v1

    .line 555
    goto :goto_18

    .line 556
    :cond_18
    const/4 p1, 0x0

    .line 557
    :goto_18
    and-int/2addr p3, v1

    .line 558
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    if-eqz p1, :cond_19

    .line 563
    .line 564
    const/16 p1, 0xa

    .line 565
    .line 566
    int-to-float v2, p1

    .line 567
    const/4 v4, 0x0

    .line 568
    const/16 v5, 0xd

    .line 569
    .line 570
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 571
    .line 572
    const/4 v1, 0x0

    .line 573
    const/4 v3, 0x0

    .line 574
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    iget-object p3, p0, Lwb/s1;->h:Li0/a1;

    .line 579
    .line 580
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object p3

    .line 584
    check-cast p3, Ljava/util/Set;

    .line 585
    .line 586
    invoke-interface {p3}, Ljava/util/Set;->size()I

    .line 587
    .line 588
    .line 589
    move-result p3

    .line 590
    const-string v0, "\u5df2\u9009\u62e9 "

    .line 591
    .line 592
    const-string v1, " \u4e2a\u7fa4"

    .line 593
    .line 594
    invoke-static {p3, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p3

    .line 598
    const/16 v0, 0x30

    .line 599
    .line 600
    const/16 v1, 0xc

    .line 601
    .line 602
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 603
    .line 604
    .line 605
    goto :goto_19

    .line 606
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 607
    .line 608
    .line 609
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 610
    .line 611
    return-object p1

    .line 612
    :pswitch_c
    const/16 v0, 0x10

    .line 613
    .line 614
    const/4 v1, 0x1

    .line 615
    if-eq p1, v0, :cond_1a

    .line 616
    .line 617
    move p1, v1

    .line 618
    goto :goto_1a

    .line 619
    :cond_1a
    const/4 p1, 0x0

    .line 620
    :goto_1a
    and-int/2addr p3, v1

    .line 621
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 622
    .line 623
    .line 624
    move-result p1

    .line 625
    if-eqz p1, :cond_1b

    .line 626
    .line 627
    new-instance p1, Lwb/w1;

    .line 628
    .line 629
    const/16 p3, 0xd

    .line 630
    .line 631
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 632
    .line 633
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 634
    .line 635
    .line 636
    const p3, 0x144c13b8

    .line 637
    .line 638
    .line 639
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 640
    .line 641
    .line 642
    move-result-object p1

    .line 643
    const/16 p3, 0x30

    .line 644
    .line 645
    const/4 v0, 0x0

    .line 646
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 647
    .line 648
    .line 649
    goto :goto_1b

    .line 650
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 651
    .line 652
    .line 653
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 654
    .line 655
    return-object p1

    .line 656
    :pswitch_d
    const/16 v0, 0x10

    .line 657
    .line 658
    const/4 v1, 0x1

    .line 659
    if-eq p1, v0, :cond_1c

    .line 660
    .line 661
    move p1, v1

    .line 662
    goto :goto_1c

    .line 663
    :cond_1c
    const/4 p1, 0x0

    .line 664
    :goto_1c
    and-int/2addr p3, v1

    .line 665
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 666
    .line 667
    .line 668
    move-result p1

    .line 669
    if-eqz p1, :cond_1d

    .line 670
    .line 671
    new-instance p1, Lwb/w1;

    .line 672
    .line 673
    const/16 p3, 0xf

    .line 674
    .line 675
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 676
    .line 677
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 678
    .line 679
    .line 680
    const p3, -0x57949cc1

    .line 681
    .line 682
    .line 683
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 684
    .line 685
    .line 686
    move-result-object p1

    .line 687
    const/16 p3, 0x30

    .line 688
    .line 689
    const/4 v0, 0x0

    .line 690
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 691
    .line 692
    .line 693
    goto :goto_1d

    .line 694
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 695
    .line 696
    .line 697
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 698
    .line 699
    return-object p1

    .line 700
    :pswitch_e
    const/16 v0, 0x10

    .line 701
    .line 702
    const/4 v1, 0x1

    .line 703
    if-eq p1, v0, :cond_1e

    .line 704
    .line 705
    move p1, v1

    .line 706
    goto :goto_1e

    .line 707
    :cond_1e
    const/4 p1, 0x0

    .line 708
    :goto_1e
    and-int/2addr p3, v1

    .line 709
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 710
    .line 711
    .line 712
    move-result p1

    .line 713
    if-eqz p1, :cond_1f

    .line 714
    .line 715
    new-instance p1, Lwb/w1;

    .line 716
    .line 717
    const/16 p3, 0x19

    .line 718
    .line 719
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 720
    .line 721
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 722
    .line 723
    .line 724
    const p3, -0x499dc82a

    .line 725
    .line 726
    .line 727
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 728
    .line 729
    .line 730
    move-result-object p1

    .line 731
    const/16 p3, 0x30

    .line 732
    .line 733
    const/4 v0, 0x0

    .line 734
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 735
    .line 736
    .line 737
    goto :goto_1f

    .line 738
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 739
    .line 740
    .line 741
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 742
    .line 743
    return-object p1

    .line 744
    :pswitch_f
    const/16 v0, 0x10

    .line 745
    .line 746
    const/4 v1, 0x1

    .line 747
    if-eq p1, v0, :cond_20

    .line 748
    .line 749
    move p1, v1

    .line 750
    goto :goto_20

    .line 751
    :cond_20
    const/4 p1, 0x0

    .line 752
    :goto_20
    and-int/2addr p3, v1

    .line 753
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 754
    .line 755
    .line 756
    move-result p1

    .line 757
    if-eqz p1, :cond_21

    .line 758
    .line 759
    new-instance p1, Lwb/w1;

    .line 760
    .line 761
    const/16 p3, 0x9

    .line 762
    .line 763
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 764
    .line 765
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 766
    .line 767
    .line 768
    const p3, 0x38a22f22

    .line 769
    .line 770
    .line 771
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 772
    .line 773
    .line 774
    move-result-object p1

    .line 775
    const/16 p3, 0x30

    .line 776
    .line 777
    const/4 v0, 0x0

    .line 778
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 779
    .line 780
    .line 781
    goto :goto_21

    .line 782
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 783
    .line 784
    .line 785
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 786
    .line 787
    return-object p1

    .line 788
    :pswitch_10
    const/16 v0, 0x10

    .line 789
    .line 790
    const/4 v1, 0x1

    .line 791
    if-eq p1, v0, :cond_22

    .line 792
    .line 793
    move p1, v1

    .line 794
    goto :goto_22

    .line 795
    :cond_22
    const/4 p1, 0x0

    .line 796
    :goto_22
    and-int/2addr p3, v1

    .line 797
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 798
    .line 799
    .line 800
    move-result p1

    .line 801
    if-eqz p1, :cond_23

    .line 802
    .line 803
    new-instance p1, Lwb/w1;

    .line 804
    .line 805
    const/16 p3, 0x17

    .line 806
    .line 807
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 808
    .line 809
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 810
    .line 811
    .line 812
    const p3, 0x480d21d9

    .line 813
    .line 814
    .line 815
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 816
    .line 817
    .line 818
    move-result-object p1

    .line 819
    const/16 p3, 0x30

    .line 820
    .line 821
    const/4 v0, 0x0

    .line 822
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 823
    .line 824
    .line 825
    goto :goto_23

    .line 826
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 827
    .line 828
    .line 829
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 830
    .line 831
    return-object p1

    .line 832
    :pswitch_11
    const/16 v0, 0x10

    .line 833
    .line 834
    const/4 v1, 0x1

    .line 835
    if-eq p1, v0, :cond_24

    .line 836
    .line 837
    move p1, v1

    .line 838
    goto :goto_24

    .line 839
    :cond_24
    const/4 p1, 0x0

    .line 840
    :goto_24
    and-int/2addr p3, v1

    .line 841
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 842
    .line 843
    .line 844
    move-result p1

    .line 845
    if-eqz p1, :cond_25

    .line 846
    .line 847
    new-instance p1, Lwb/w1;

    .line 848
    .line 849
    const/16 p3, 0x1a

    .line 850
    .line 851
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 852
    .line 853
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 854
    .line 855
    .line 856
    const p3, 0x70e38679

    .line 857
    .line 858
    .line 859
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    const/16 p3, 0x30

    .line 864
    .line 865
    const/4 v0, 0x0

    .line 866
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 867
    .line 868
    .line 869
    goto :goto_25

    .line 870
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 871
    .line 872
    .line 873
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 874
    .line 875
    return-object p1

    .line 876
    :pswitch_12
    const/16 v0, 0x10

    .line 877
    .line 878
    const/4 v1, 0x1

    .line 879
    if-eq p1, v0, :cond_26

    .line 880
    .line 881
    move p1, v1

    .line 882
    goto :goto_26

    .line 883
    :cond_26
    const/4 p1, 0x0

    .line 884
    :goto_26
    and-int/2addr p3, v1

    .line 885
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 886
    .line 887
    .line 888
    move-result p1

    .line 889
    if-eqz p1, :cond_27

    .line 890
    .line 891
    new-instance p1, Lwb/w1;

    .line 892
    .line 893
    const/16 p3, 0xb

    .line 894
    .line 895
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 896
    .line 897
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 898
    .line 899
    .line 900
    const p3, 0x24bbd40b

    .line 901
    .line 902
    .line 903
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 904
    .line 905
    .line 906
    move-result-object p1

    .line 907
    const/16 p3, 0x30

    .line 908
    .line 909
    const/4 v0, 0x0

    .line 910
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 911
    .line 912
    .line 913
    goto :goto_27

    .line 914
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 915
    .line 916
    .line 917
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 918
    .line 919
    return-object p1

    .line 920
    :pswitch_13
    const/16 v0, 0x10

    .line 921
    .line 922
    const/4 v1, 0x1

    .line 923
    if-eq p1, v0, :cond_28

    .line 924
    .line 925
    move p1, v1

    .line 926
    goto :goto_28

    .line 927
    :cond_28
    const/4 p1, 0x0

    .line 928
    :goto_28
    and-int/2addr p3, v1

    .line 929
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 930
    .line 931
    .line 932
    move-result p1

    .line 933
    if-eqz p1, :cond_29

    .line 934
    .line 935
    new-instance p1, Lwb/w1;

    .line 936
    .line 937
    const/16 p3, 0xa

    .line 938
    .line 939
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 940
    .line 941
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 942
    .line 943
    .line 944
    const p3, 0x2bc49010

    .line 945
    .line 946
    .line 947
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 948
    .line 949
    .line 950
    move-result-object p1

    .line 951
    const/16 p3, 0x30

    .line 952
    .line 953
    const/4 v0, 0x0

    .line 954
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 955
    .line 956
    .line 957
    goto :goto_29

    .line 958
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 959
    .line 960
    .line 961
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 962
    .line 963
    return-object p1

    .line 964
    :pswitch_14
    const/16 v0, 0x10

    .line 965
    .line 966
    const/4 v1, 0x1

    .line 967
    if-eq p1, v0, :cond_2a

    .line 968
    .line 969
    move p1, v1

    .line 970
    goto :goto_2a

    .line 971
    :cond_2a
    const/4 p1, 0x0

    .line 972
    :goto_2a
    and-int/2addr p3, v1

    .line 973
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 974
    .line 975
    .line 976
    move-result p1

    .line 977
    if-eqz p1, :cond_2b

    .line 978
    .line 979
    new-instance p1, Lwb/w1;

    .line 980
    .line 981
    const/16 p3, 0x1b

    .line 982
    .line 983
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 984
    .line 985
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 986
    .line 987
    .line 988
    const p3, -0x8c89391

    .line 989
    .line 990
    .line 991
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 992
    .line 993
    .line 994
    move-result-object p1

    .line 995
    const/16 p3, 0x30

    .line 996
    .line 997
    const/4 v0, 0x0

    .line 998
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_2b

    .line 1002
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1003
    .line 1004
    .line 1005
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1006
    .line 1007
    return-object p1

    .line 1008
    :pswitch_15
    const/16 v0, 0x10

    .line 1009
    .line 1010
    const/4 v1, 0x1

    .line 1011
    if-eq p1, v0, :cond_2c

    .line 1012
    .line 1013
    move p1, v1

    .line 1014
    goto :goto_2c

    .line 1015
    :cond_2c
    const/4 p1, 0x0

    .line 1016
    :goto_2c
    and-int/2addr p3, v1

    .line 1017
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1018
    .line 1019
    .line 1020
    move-result p1

    .line 1021
    if-eqz p1, :cond_2d

    .line 1022
    .line 1023
    new-instance p1, Lwb/w1;

    .line 1024
    .line 1025
    const/4 p3, 0x6

    .line 1026
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1027
    .line 1028
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1029
    .line 1030
    .line 1031
    const p3, -0x63ac5518

    .line 1032
    .line 1033
    .line 1034
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p1

    .line 1038
    const/16 p3, 0x30

    .line 1039
    .line 1040
    const/4 v0, 0x0

    .line 1041
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1042
    .line 1043
    .line 1044
    goto :goto_2d

    .line 1045
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1046
    .line 1047
    .line 1048
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1049
    .line 1050
    return-object p1

    .line 1051
    :pswitch_16
    const/16 v0, 0x10

    .line 1052
    .line 1053
    const/4 v1, 0x1

    .line 1054
    if-eq p1, v0, :cond_2e

    .line 1055
    .line 1056
    move p1, v1

    .line 1057
    goto :goto_2e

    .line 1058
    :cond_2e
    const/4 p1, 0x0

    .line 1059
    :goto_2e
    and-int/2addr p3, v1

    .line 1060
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1061
    .line 1062
    .line 1063
    move-result p1

    .line 1064
    if-eqz p1, :cond_2f

    .line 1065
    .line 1066
    new-instance p1, Lwb/w1;

    .line 1067
    .line 1068
    const/4 p3, 0x7

    .line 1069
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1070
    .line 1071
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1072
    .line 1073
    .line 1074
    const p3, -0x732c4555

    .line 1075
    .line 1076
    .line 1077
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1078
    .line 1079
    .line 1080
    move-result-object p1

    .line 1081
    const/16 p3, 0x30

    .line 1082
    .line 1083
    const/4 v0, 0x0

    .line 1084
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_2f

    .line 1088
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1089
    .line 1090
    .line 1091
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1092
    .line 1093
    return-object p1

    .line 1094
    :pswitch_17
    const/16 v0, 0x10

    .line 1095
    .line 1096
    const/4 v1, 0x1

    .line 1097
    if-eq p1, v0, :cond_30

    .line 1098
    .line 1099
    move p1, v1

    .line 1100
    goto :goto_30

    .line 1101
    :cond_30
    const/4 p1, 0x0

    .line 1102
    :goto_30
    and-int/2addr p3, v1

    .line 1103
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1104
    .line 1105
    .line 1106
    move-result p1

    .line 1107
    if-eqz p1, :cond_31

    .line 1108
    .line 1109
    new-instance p1, Lwb/w1;

    .line 1110
    .line 1111
    const/4 p3, 0x5

    .line 1112
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1113
    .line 1114
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1115
    .line 1116
    .line 1117
    const p3, -0x2b63f2dc

    .line 1118
    .line 1119
    .line 1120
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1121
    .line 1122
    .line 1123
    move-result-object p1

    .line 1124
    const/16 p3, 0x30

    .line 1125
    .line 1126
    const/4 v0, 0x0

    .line 1127
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_31

    .line 1131
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1132
    .line 1133
    .line 1134
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1135
    .line 1136
    return-object p1

    .line 1137
    :pswitch_18
    const/16 v0, 0x10

    .line 1138
    .line 1139
    const/4 v1, 0x1

    .line 1140
    if-eq p1, v0, :cond_32

    .line 1141
    .line 1142
    move p1, v1

    .line 1143
    goto :goto_32

    .line 1144
    :cond_32
    const/4 p1, 0x0

    .line 1145
    :goto_32
    and-int/2addr p3, v1

    .line 1146
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1147
    .line 1148
    .line 1149
    move-result p1

    .line 1150
    if-eqz p1, :cond_33

    .line 1151
    .line 1152
    new-instance p1, Lwb/w1;

    .line 1153
    .line 1154
    const/4 p3, 0x4

    .line 1155
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1156
    .line 1157
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1158
    .line 1159
    .line 1160
    const p3, -0xb0c203

    .line 1161
    .line 1162
    .line 1163
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1164
    .line 1165
    .line 1166
    move-result-object p1

    .line 1167
    const/16 p3, 0x30

    .line 1168
    .line 1169
    const/4 v0, 0x0

    .line 1170
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1171
    .line 1172
    .line 1173
    goto :goto_33

    .line 1174
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1175
    .line 1176
    .line 1177
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1178
    .line 1179
    return-object p1

    .line 1180
    :pswitch_19
    const/16 v0, 0x10

    .line 1181
    .line 1182
    const/4 v1, 0x1

    .line 1183
    if-eq p1, v0, :cond_34

    .line 1184
    .line 1185
    move p1, v1

    .line 1186
    goto :goto_34

    .line 1187
    :cond_34
    const/4 p1, 0x0

    .line 1188
    :goto_34
    and-int/2addr p3, v1

    .line 1189
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1190
    .line 1191
    .line 1192
    move-result p1

    .line 1193
    if-eqz p1, :cond_35

    .line 1194
    .line 1195
    new-instance p1, Lwb/w1;

    .line 1196
    .line 1197
    const/4 p3, 0x1

    .line 1198
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1199
    .line 1200
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1201
    .line 1202
    .line 1203
    const p3, -0x39a4f351

    .line 1204
    .line 1205
    .line 1206
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1207
    .line 1208
    .line 1209
    move-result-object p1

    .line 1210
    const/16 p3, 0x30

    .line 1211
    .line 1212
    const/4 v0, 0x0

    .line 1213
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_35

    .line 1217
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1218
    .line 1219
    .line 1220
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1221
    .line 1222
    return-object p1

    .line 1223
    :pswitch_1a
    const/16 v0, 0x10

    .line 1224
    .line 1225
    const/4 v1, 0x1

    .line 1226
    if-eq p1, v0, :cond_36

    .line 1227
    .line 1228
    move p1, v1

    .line 1229
    goto :goto_36

    .line 1230
    :cond_36
    const/4 p1, 0x0

    .line 1231
    :goto_36
    and-int/2addr p3, v1

    .line 1232
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1233
    .line 1234
    .line 1235
    move-result p1

    .line 1236
    if-eqz p1, :cond_37

    .line 1237
    .line 1238
    new-instance p1, Lwb/w1;

    .line 1239
    .line 1240
    const/4 p3, 0x0

    .line 1241
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1242
    .line 1243
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1244
    .line 1245
    .line 1246
    const p3, 0x981d685

    .line 1247
    .line 1248
    .line 1249
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1250
    .line 1251
    .line 1252
    move-result-object p1

    .line 1253
    const/16 p3, 0x30

    .line 1254
    .line 1255
    const/4 v0, 0x0

    .line 1256
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1257
    .line 1258
    .line 1259
    goto :goto_37

    .line 1260
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1261
    .line 1262
    .line 1263
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1264
    .line 1265
    return-object p1

    .line 1266
    :pswitch_1b
    const/16 v0, 0x10

    .line 1267
    .line 1268
    const/4 v1, 0x1

    .line 1269
    if-eq p1, v0, :cond_38

    .line 1270
    .line 1271
    move p1, v1

    .line 1272
    goto :goto_38

    .line 1273
    :cond_38
    const/4 p1, 0x0

    .line 1274
    :goto_38
    and-int/2addr p3, v1

    .line 1275
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1276
    .line 1277
    .line 1278
    move-result p1

    .line 1279
    if-eqz p1, :cond_39

    .line 1280
    .line 1281
    new-instance p1, Lwb/w1;

    .line 1282
    .line 1283
    const/4 p3, 0x2

    .line 1284
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1285
    .line 1286
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1287
    .line 1288
    .line 1289
    const p3, 0x76fde26

    .line 1290
    .line 1291
    .line 1292
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1293
    .line 1294
    .line 1295
    move-result-object p1

    .line 1296
    const/16 p3, 0x30

    .line 1297
    .line 1298
    const/4 v0, 0x0

    .line 1299
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_39

    .line 1303
    :cond_39
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1304
    .line 1305
    .line 1306
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1307
    .line 1308
    return-object p1

    .line 1309
    :pswitch_1c
    const/16 v0, 0x10

    .line 1310
    .line 1311
    const/4 v1, 0x1

    .line 1312
    if-eq p1, v0, :cond_3a

    .line 1313
    .line 1314
    move p1, v1

    .line 1315
    goto :goto_3a

    .line 1316
    :cond_3a
    const/4 p1, 0x0

    .line 1317
    :goto_3a
    and-int/2addr p3, v1

    .line 1318
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1319
    .line 1320
    .line 1321
    move-result p1

    .line 1322
    if-eqz p1, :cond_3b

    .line 1323
    .line 1324
    new-instance p1, Lwb/w1;

    .line 1325
    .line 1326
    const/4 p3, 0x3

    .line 1327
    iget-object v0, p0, Lwb/s1;->h:Li0/a1;

    .line 1328
    .line 1329
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 1330
    .line 1331
    .line 1332
    const p3, -0x5d9c469d

    .line 1333
    .line 1334
    .line 1335
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1336
    .line 1337
    .line 1338
    move-result-object p1

    .line 1339
    const/16 p3, 0x30

    .line 1340
    .line 1341
    const/4 v0, 0x0

    .line 1342
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_3b

    .line 1346
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1347
    .line 1348
    .line 1349
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1350
    .line 1351
    return-object p1

    .line 1352
    nop

    .line 1353
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
