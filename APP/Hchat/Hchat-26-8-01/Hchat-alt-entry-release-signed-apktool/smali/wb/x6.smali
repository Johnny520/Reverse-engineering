.class public final synthetic Lwb/x6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/x6;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/x6;->h:Lfg/a;

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
    .locals 9

    .line 1
    iget v0, p0, Lwb/x6;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lth/a;

    .line 7
    .line 8
    move-object v6, p2

    .line 9
    check-cast v6, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p1, p2, 0x11

    .line 21
    .line 22
    const/16 p3, 0x10

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    move p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    and-int/2addr p2, v0

    .line 31
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 v7, 0x6

    .line 38
    const/16 v8, 0x3c

    .line 39
    .line 40
    const-string v0, "\u8fd4\u56de"

    .line 41
    .line 42
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 53
    .line 54
    .line 55
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_0
    check-cast p1, Lr/d;

    .line 59
    .line 60
    check-cast p2, Li0/h0;

    .line 61
    .line 62
    check-cast p3, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    and-int/lit8 p1, p3, 0x11

    .line 72
    .line 73
    const/16 v0, 0x10

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    if-eq p1, v0, :cond_2

    .line 77
    .line 78
    move p1, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/4 p1, 0x0

    .line 81
    :goto_2
    and-int/2addr p3, v1

    .line 82
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    new-instance p1, Lwb/p9;

    .line 89
    .line 90
    const/16 p3, 0xb

    .line 91
    .line 92
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 93
    .line 94
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 95
    .line 96
    .line 97
    const p3, -0x31fe6b01

    .line 98
    .line 99
    .line 100
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const/16 p3, 0x30

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 112
    .line 113
    .line 114
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_1
    check-cast p1, Lth/a;

    .line 118
    .line 119
    move-object v6, p2

    .line 120
    check-cast v6, Li0/h0;

    .line 121
    .line 122
    check-cast p3, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    and-int/lit8 p1, p2, 0x11

    .line 132
    .line 133
    const/16 p3, 0x10

    .line 134
    .line 135
    const/4 v0, 0x1

    .line 136
    if-eq p1, p3, :cond_4

    .line 137
    .line 138
    move p1, v0

    .line 139
    goto :goto_4

    .line 140
    :cond_4
    const/4 p1, 0x0

    .line 141
    :goto_4
    and-int/2addr p2, v0

    .line 142
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_5

    .line 147
    .line 148
    const/4 v7, 0x6

    .line 149
    const/16 v8, 0x3c

    .line 150
    .line 151
    const-string v0, "\u8fd4\u56de"

    .line 152
    .line 153
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 158
    const/4 v5, 0x0

    .line 159
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_5
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 164
    .line 165
    .line 166
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_2
    check-cast p1, Lth/a;

    .line 170
    .line 171
    move-object v6, p2

    .line 172
    check-cast v6, Li0/h0;

    .line 173
    .line 174
    check-cast p3, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    and-int/lit8 p1, p2, 0x11

    .line 184
    .line 185
    const/16 p3, 0x10

    .line 186
    .line 187
    const/4 v0, 0x1

    .line 188
    if-eq p1, p3, :cond_6

    .line 189
    .line 190
    move p1, v0

    .line 191
    goto :goto_6

    .line 192
    :cond_6
    const/4 p1, 0x0

    .line 193
    :goto_6
    and-int/2addr p2, v0

    .line 194
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_7

    .line 199
    .line 200
    const/4 v7, 0x6

    .line 201
    const/16 v8, 0x3c

    .line 202
    .line 203
    const-string v0, "\u8fd4\u56de"

    .line 204
    .line 205
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    const/4 v3, 0x0

    .line 209
    const/4 v4, 0x0

    .line 210
    const/4 v5, 0x0

    .line 211
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 212
    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_7
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 216
    .line 217
    .line 218
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_3
    check-cast p1, Lr/d;

    .line 222
    .line 223
    check-cast p2, Li0/h0;

    .line 224
    .line 225
    check-cast p3, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    and-int/lit8 p1, p3, 0x11

    .line 235
    .line 236
    const/16 v0, 0x10

    .line 237
    .line 238
    const/4 v1, 0x1

    .line 239
    if-eq p1, v0, :cond_8

    .line 240
    .line 241
    move p1, v1

    .line 242
    goto :goto_8

    .line 243
    :cond_8
    const/4 p1, 0x0

    .line 244
    :goto_8
    and-int/2addr p3, v1

    .line 245
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_9

    .line 250
    .line 251
    new-instance p1, Lwb/p9;

    .line 252
    .line 253
    const/4 p3, 0x7

    .line 254
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 255
    .line 256
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 257
    .line 258
    .line 259
    const p3, -0x7b51966e

    .line 260
    .line 261
    .line 262
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    const/16 p3, 0x30

    .line 267
    .line 268
    const/4 v0, 0x0

    .line 269
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 274
    .line 275
    .line 276
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 277
    .line 278
    return-object p1

    .line 279
    :pswitch_4
    check-cast p1, Lth/a;

    .line 280
    .line 281
    move-object v6, p2

    .line 282
    check-cast v6, Li0/h0;

    .line 283
    .line 284
    check-cast p3, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    and-int/lit8 p1, p2, 0x11

    .line 294
    .line 295
    const/16 p3, 0x10

    .line 296
    .line 297
    const/4 v0, 0x1

    .line 298
    if-eq p1, p3, :cond_a

    .line 299
    .line 300
    move p1, v0

    .line 301
    goto :goto_a

    .line 302
    :cond_a
    const/4 p1, 0x0

    .line 303
    :goto_a
    and-int/2addr p2, v0

    .line 304
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-eqz p1, :cond_b

    .line 309
    .line 310
    const/4 v7, 0x6

    .line 311
    const/16 v8, 0x3c

    .line 312
    .line 313
    const-string v0, "\u8fd4\u56de"

    .line 314
    .line 315
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 316
    .line 317
    const/4 v2, 0x0

    .line 318
    const/4 v3, 0x0

    .line 319
    const/4 v4, 0x0

    .line 320
    const/4 v5, 0x0

    .line 321
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 322
    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 326
    .line 327
    .line 328
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 329
    .line 330
    return-object p1

    .line 331
    :pswitch_5
    check-cast p1, Lth/a;

    .line 332
    .line 333
    move-object v6, p2

    .line 334
    check-cast v6, Li0/h0;

    .line 335
    .line 336
    check-cast p3, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    move-result p2

    .line 342
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    and-int/lit8 p1, p2, 0x11

    .line 346
    .line 347
    const/16 p3, 0x10

    .line 348
    .line 349
    const/4 v0, 0x1

    .line 350
    if-eq p1, p3, :cond_c

    .line 351
    .line 352
    move p1, v0

    .line 353
    goto :goto_c

    .line 354
    :cond_c
    const/4 p1, 0x0

    .line 355
    :goto_c
    and-int/2addr p2, v0

    .line 356
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eqz p1, :cond_d

    .line 361
    .line 362
    const/4 v7, 0x6

    .line 363
    const/16 v8, 0x3c

    .line 364
    .line 365
    const-string v0, "\u8fd4\u56de"

    .line 366
    .line 367
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 368
    .line 369
    const/4 v2, 0x0

    .line 370
    const/4 v3, 0x0

    .line 371
    const/4 v4, 0x0

    .line 372
    const/4 v5, 0x0

    .line 373
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 374
    .line 375
    .line 376
    goto :goto_d

    .line 377
    :cond_d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 378
    .line 379
    .line 380
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_6
    check-cast p1, Lth/a;

    .line 384
    .line 385
    move-object v6, p2

    .line 386
    check-cast v6, Li0/h0;

    .line 387
    .line 388
    check-cast p3, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    and-int/lit8 p1, p2, 0x11

    .line 398
    .line 399
    const/16 p3, 0x10

    .line 400
    .line 401
    const/4 v0, 0x1

    .line 402
    if-eq p1, p3, :cond_e

    .line 403
    .line 404
    move p1, v0

    .line 405
    goto :goto_e

    .line 406
    :cond_e
    const/4 p1, 0x0

    .line 407
    :goto_e
    and-int/2addr p2, v0

    .line 408
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 409
    .line 410
    .line 411
    move-result p1

    .line 412
    if-eqz p1, :cond_f

    .line 413
    .line 414
    const/4 v7, 0x6

    .line 415
    const/16 v8, 0x3c

    .line 416
    .line 417
    const-string v0, "\u8fd4\u56de"

    .line 418
    .line 419
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 420
    .line 421
    const/4 v2, 0x0

    .line 422
    const/4 v3, 0x0

    .line 423
    const/4 v4, 0x0

    .line 424
    const/4 v5, 0x0

    .line 425
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 426
    .line 427
    .line 428
    goto :goto_f

    .line 429
    :cond_f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 430
    .line 431
    .line 432
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 433
    .line 434
    return-object p1

    .line 435
    :pswitch_7
    check-cast p1, Lr/d;

    .line 436
    .line 437
    check-cast p2, Li0/h0;

    .line 438
    .line 439
    check-cast p3, Ljava/lang/Integer;

    .line 440
    .line 441
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result p3

    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    and-int/lit8 p1, p3, 0x11

    .line 449
    .line 450
    const/16 v0, 0x10

    .line 451
    .line 452
    const/4 v1, 0x1

    .line 453
    if-eq p1, v0, :cond_10

    .line 454
    .line 455
    move p1, v1

    .line 456
    goto :goto_10

    .line 457
    :cond_10
    const/4 p1, 0x0

    .line 458
    :goto_10
    and-int/2addr p3, v1

    .line 459
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    if-eqz p1, :cond_11

    .line 464
    .line 465
    new-instance p1, Lwb/p9;

    .line 466
    .line 467
    const/4 p3, 0x4

    .line 468
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 469
    .line 470
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 471
    .line 472
    .line 473
    const p3, 0x6b289752

    .line 474
    .line 475
    .line 476
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    const/16 p3, 0x30

    .line 481
    .line 482
    const/4 v0, 0x0

    .line 483
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 484
    .line 485
    .line 486
    goto :goto_11

    .line 487
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 488
    .line 489
    .line 490
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 491
    .line 492
    return-object p1

    .line 493
    :pswitch_8
    check-cast p1, Lr/d;

    .line 494
    .line 495
    check-cast p2, Li0/h0;

    .line 496
    .line 497
    check-cast p3, Ljava/lang/Integer;

    .line 498
    .line 499
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result p3

    .line 503
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    and-int/lit8 p1, p3, 0x11

    .line 507
    .line 508
    const/16 v0, 0x10

    .line 509
    .line 510
    const/4 v1, 0x1

    .line 511
    if-eq p1, v0, :cond_12

    .line 512
    .line 513
    move p1, v1

    .line 514
    goto :goto_12

    .line 515
    :cond_12
    const/4 p1, 0x0

    .line 516
    :goto_12
    and-int/2addr p3, v1

    .line 517
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    if-eqz p1, :cond_13

    .line 522
    .line 523
    new-instance p1, Lwb/p9;

    .line 524
    .line 525
    const/4 p3, 0x6

    .line 526
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 527
    .line 528
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 529
    .line 530
    .line 531
    const p3, -0x61d37057

    .line 532
    .line 533
    .line 534
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    const/16 p3, 0x30

    .line 539
    .line 540
    const/4 v0, 0x0

    .line 541
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 542
    .line 543
    .line 544
    goto :goto_13

    .line 545
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 546
    .line 547
    .line 548
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 549
    .line 550
    return-object p1

    .line 551
    :pswitch_9
    check-cast p1, Lth/a;

    .line 552
    .line 553
    move-object v6, p2

    .line 554
    check-cast v6, Li0/h0;

    .line 555
    .line 556
    check-cast p3, Ljava/lang/Integer;

    .line 557
    .line 558
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result p2

    .line 562
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    and-int/lit8 p1, p2, 0x11

    .line 566
    .line 567
    const/16 p3, 0x10

    .line 568
    .line 569
    const/4 v0, 0x1

    .line 570
    if-eq p1, p3, :cond_14

    .line 571
    .line 572
    move p1, v0

    .line 573
    goto :goto_14

    .line 574
    :cond_14
    const/4 p1, 0x0

    .line 575
    :goto_14
    and-int/2addr p2, v0

    .line 576
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 577
    .line 578
    .line 579
    move-result p1

    .line 580
    if-eqz p1, :cond_15

    .line 581
    .line 582
    const/4 v7, 0x6

    .line 583
    const/16 v8, 0x3c

    .line 584
    .line 585
    const-string v0, "\u8fd4\u56de"

    .line 586
    .line 587
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 588
    .line 589
    const/4 v2, 0x0

    .line 590
    const/4 v3, 0x0

    .line 591
    const/4 v4, 0x0

    .line 592
    const/4 v5, 0x0

    .line 593
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 594
    .line 595
    .line 596
    goto :goto_15

    .line 597
    :cond_15
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 598
    .line 599
    .line 600
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 601
    .line 602
    return-object p1

    .line 603
    :pswitch_a
    check-cast p1, Lth/a;

    .line 604
    .line 605
    move-object v6, p2

    .line 606
    check-cast v6, Li0/h0;

    .line 607
    .line 608
    check-cast p3, Ljava/lang/Integer;

    .line 609
    .line 610
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result p2

    .line 614
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    and-int/lit8 p1, p2, 0x11

    .line 618
    .line 619
    const/16 p3, 0x10

    .line 620
    .line 621
    const/4 v0, 0x1

    .line 622
    if-eq p1, p3, :cond_16

    .line 623
    .line 624
    move p1, v0

    .line 625
    goto :goto_16

    .line 626
    :cond_16
    const/4 p1, 0x0

    .line 627
    :goto_16
    and-int/2addr p2, v0

    .line 628
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 629
    .line 630
    .line 631
    move-result p1

    .line 632
    if-eqz p1, :cond_17

    .line 633
    .line 634
    const/4 v7, 0x6

    .line 635
    const/16 v8, 0x3c

    .line 636
    .line 637
    const-string v0, "\u8fd4\u56de"

    .line 638
    .line 639
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 640
    .line 641
    const/4 v2, 0x0

    .line 642
    const/4 v3, 0x0

    .line 643
    const/4 v4, 0x0

    .line 644
    const/4 v5, 0x0

    .line 645
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 646
    .line 647
    .line 648
    goto :goto_17

    .line 649
    :cond_17
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 650
    .line 651
    .line 652
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 653
    .line 654
    return-object p1

    .line 655
    :pswitch_b
    check-cast p1, Lth/a;

    .line 656
    .line 657
    move-object v6, p2

    .line 658
    check-cast v6, Li0/h0;

    .line 659
    .line 660
    check-cast p3, Ljava/lang/Integer;

    .line 661
    .line 662
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 663
    .line 664
    .line 665
    move-result p2

    .line 666
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    and-int/lit8 p1, p2, 0x11

    .line 670
    .line 671
    const/16 p3, 0x10

    .line 672
    .line 673
    const/4 v0, 0x1

    .line 674
    if-eq p1, p3, :cond_18

    .line 675
    .line 676
    move p1, v0

    .line 677
    goto :goto_18

    .line 678
    :cond_18
    const/4 p1, 0x0

    .line 679
    :goto_18
    and-int/2addr p2, v0

    .line 680
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 681
    .line 682
    .line 683
    move-result p1

    .line 684
    if-eqz p1, :cond_19

    .line 685
    .line 686
    const/16 v7, 0x186

    .line 687
    .line 688
    const/16 v8, 0x30

    .line 689
    .line 690
    const-string v0, "\u5b8c\u6210"

    .line 691
    .line 692
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 693
    .line 694
    const-string v2, "\u8fd4\u56de"

    .line 695
    .line 696
    const/4 v4, 0x0

    .line 697
    const/4 v5, 0x0

    .line 698
    move-object v3, v1

    .line 699
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 700
    .line 701
    .line 702
    goto :goto_19

    .line 703
    :cond_19
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 704
    .line 705
    .line 706
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 707
    .line 708
    return-object p1

    .line 709
    :pswitch_c
    check-cast p1, Lr/d;

    .line 710
    .line 711
    check-cast p2, Li0/h0;

    .line 712
    .line 713
    check-cast p3, Ljava/lang/Integer;

    .line 714
    .line 715
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 716
    .line 717
    .line 718
    move-result p3

    .line 719
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    and-int/lit8 p1, p3, 0x11

    .line 723
    .line 724
    const/16 v0, 0x10

    .line 725
    .line 726
    const/4 v1, 0x1

    .line 727
    if-eq p1, v0, :cond_1a

    .line 728
    .line 729
    move p1, v1

    .line 730
    goto :goto_1a

    .line 731
    :cond_1a
    const/4 p1, 0x0

    .line 732
    :goto_1a
    and-int/2addr p3, v1

    .line 733
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 734
    .line 735
    .line 736
    move-result p1

    .line 737
    if-eqz p1, :cond_1b

    .line 738
    .line 739
    new-instance p1, Lwb/p9;

    .line 740
    .line 741
    const/16 p3, 0xa

    .line 742
    .line 743
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 744
    .line 745
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 746
    .line 747
    .line 748
    const p3, 0xc3645fd

    .line 749
    .line 750
    .line 751
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 752
    .line 753
    .line 754
    move-result-object p1

    .line 755
    const/16 p3, 0x30

    .line 756
    .line 757
    const/4 v0, 0x0

    .line 758
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 759
    .line 760
    .line 761
    goto :goto_1b

    .line 762
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 763
    .line 764
    .line 765
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 766
    .line 767
    return-object p1

    .line 768
    :pswitch_d
    check-cast p1, Lth/a;

    .line 769
    .line 770
    move-object v6, p2

    .line 771
    check-cast v6, Li0/h0;

    .line 772
    .line 773
    check-cast p3, Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result p2

    .line 779
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    and-int/lit8 p1, p2, 0x11

    .line 783
    .line 784
    const/16 p3, 0x10

    .line 785
    .line 786
    const/4 v0, 0x1

    .line 787
    if-eq p1, p3, :cond_1c

    .line 788
    .line 789
    move p1, v0

    .line 790
    goto :goto_1c

    .line 791
    :cond_1c
    const/4 p1, 0x0

    .line 792
    :goto_1c
    and-int/2addr p2, v0

    .line 793
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 794
    .line 795
    .line 796
    move-result p1

    .line 797
    if-eqz p1, :cond_1d

    .line 798
    .line 799
    const/4 v7, 0x6

    .line 800
    const/16 v8, 0x3c

    .line 801
    .line 802
    const-string v0, "\u8fd4\u56de"

    .line 803
    .line 804
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 805
    .line 806
    const/4 v2, 0x0

    .line 807
    const/4 v3, 0x0

    .line 808
    const/4 v4, 0x0

    .line 809
    const/4 v5, 0x0

    .line 810
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 811
    .line 812
    .line 813
    goto :goto_1d

    .line 814
    :cond_1d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 815
    .line 816
    .line 817
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 818
    .line 819
    return-object p1

    .line 820
    :pswitch_e
    check-cast p1, Lth/a;

    .line 821
    .line 822
    move-object v6, p2

    .line 823
    check-cast v6, Li0/h0;

    .line 824
    .line 825
    check-cast p3, Ljava/lang/Integer;

    .line 826
    .line 827
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 828
    .line 829
    .line 830
    move-result p2

    .line 831
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    and-int/lit8 p1, p2, 0x11

    .line 835
    .line 836
    const/16 p3, 0x10

    .line 837
    .line 838
    const/4 v0, 0x1

    .line 839
    if-eq p1, p3, :cond_1e

    .line 840
    .line 841
    move p1, v0

    .line 842
    goto :goto_1e

    .line 843
    :cond_1e
    const/4 p1, 0x0

    .line 844
    :goto_1e
    and-int/2addr p2, v0

    .line 845
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 846
    .line 847
    .line 848
    move-result p1

    .line 849
    if-eqz p1, :cond_1f

    .line 850
    .line 851
    const/4 v7, 0x6

    .line 852
    const/16 v8, 0x3c

    .line 853
    .line 854
    const-string v0, "\u8fd4\u56de"

    .line 855
    .line 856
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 857
    .line 858
    const/4 v2, 0x0

    .line 859
    const/4 v3, 0x0

    .line 860
    const/4 v4, 0x0

    .line 861
    const/4 v5, 0x0

    .line 862
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 863
    .line 864
    .line 865
    goto :goto_1f

    .line 866
    :cond_1f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 867
    .line 868
    .line 869
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 870
    .line 871
    return-object p1

    .line 872
    :pswitch_f
    check-cast p1, Lth/a;

    .line 873
    .line 874
    move-object v6, p2

    .line 875
    check-cast v6, Li0/h0;

    .line 876
    .line 877
    check-cast p3, Ljava/lang/Integer;

    .line 878
    .line 879
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 880
    .line 881
    .line 882
    move-result p2

    .line 883
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    and-int/lit8 p1, p2, 0x11

    .line 887
    .line 888
    const/16 p3, 0x10

    .line 889
    .line 890
    const/4 v0, 0x1

    .line 891
    if-eq p1, p3, :cond_20

    .line 892
    .line 893
    move p1, v0

    .line 894
    goto :goto_20

    .line 895
    :cond_20
    const/4 p1, 0x0

    .line 896
    :goto_20
    and-int/2addr p2, v0

    .line 897
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 898
    .line 899
    .line 900
    move-result p1

    .line 901
    if-eqz p1, :cond_21

    .line 902
    .line 903
    const/4 v7, 0x6

    .line 904
    const/16 v8, 0x3c

    .line 905
    .line 906
    const-string v0, "\u8fd4\u56de"

    .line 907
    .line 908
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 909
    .line 910
    const/4 v2, 0x0

    .line 911
    const/4 v3, 0x0

    .line 912
    const/4 v4, 0x0

    .line 913
    const/4 v5, 0x0

    .line 914
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 915
    .line 916
    .line 917
    goto :goto_21

    .line 918
    :cond_21
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 919
    .line 920
    .line 921
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 922
    .line 923
    return-object p1

    .line 924
    :pswitch_10
    check-cast p1, Lr/d;

    .line 925
    .line 926
    check-cast p2, Li0/h0;

    .line 927
    .line 928
    check-cast p3, Ljava/lang/Integer;

    .line 929
    .line 930
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 931
    .line 932
    .line 933
    move-result p3

    .line 934
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    and-int/lit8 p1, p3, 0x11

    .line 938
    .line 939
    const/16 v0, 0x10

    .line 940
    .line 941
    const/4 v1, 0x1

    .line 942
    if-eq p1, v0, :cond_22

    .line 943
    .line 944
    move p1, v1

    .line 945
    goto :goto_22

    .line 946
    :cond_22
    const/4 p1, 0x0

    .line 947
    :goto_22
    and-int/2addr p3, v1

    .line 948
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 949
    .line 950
    .line 951
    move-result p1

    .line 952
    if-eqz p1, :cond_23

    .line 953
    .line 954
    new-instance p1, Lwb/p9;

    .line 955
    .line 956
    const/4 p3, 0x5

    .line 957
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 958
    .line 959
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 960
    .line 961
    .line 962
    const p3, 0x6c1740a1    # 7.31412E26f

    .line 963
    .line 964
    .line 965
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 966
    .line 967
    .line 968
    move-result-object p1

    .line 969
    const/16 p3, 0x30

    .line 970
    .line 971
    const/4 v0, 0x0

    .line 972
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 973
    .line 974
    .line 975
    goto :goto_23

    .line 976
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 977
    .line 978
    .line 979
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 980
    .line 981
    return-object p1

    .line 982
    :pswitch_11
    check-cast p1, Lr/d;

    .line 983
    .line 984
    check-cast p2, Li0/h0;

    .line 985
    .line 986
    check-cast p3, Ljava/lang/Integer;

    .line 987
    .line 988
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 989
    .line 990
    .line 991
    move-result p3

    .line 992
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    and-int/lit8 p1, p3, 0x11

    .line 996
    .line 997
    const/16 v0, 0x10

    .line 998
    .line 999
    const/4 v1, 0x1

    .line 1000
    if-eq p1, v0, :cond_24

    .line 1001
    .line 1002
    move p1, v1

    .line 1003
    goto :goto_24

    .line 1004
    :cond_24
    const/4 p1, 0x0

    .line 1005
    :goto_24
    and-int/2addr p3, v1

    .line 1006
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1007
    .line 1008
    .line 1009
    move-result p1

    .line 1010
    if-eqz p1, :cond_25

    .line 1011
    .line 1012
    new-instance p1, Lwb/p9;

    .line 1013
    .line 1014
    const/4 p3, 0x3

    .line 1015
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 1016
    .line 1017
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 1018
    .line 1019
    .line 1020
    const p3, 0x704c02f1

    .line 1021
    .line 1022
    .line 1023
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1024
    .line 1025
    .line 1026
    move-result-object p1

    .line 1027
    const/16 p3, 0x30

    .line 1028
    .line 1029
    const/4 v0, 0x0

    .line 1030
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1031
    .line 1032
    .line 1033
    goto :goto_25

    .line 1034
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1035
    .line 1036
    .line 1037
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1038
    .line 1039
    return-object p1

    .line 1040
    :pswitch_12
    check-cast p1, Lth/a;

    .line 1041
    .line 1042
    move-object v6, p2

    .line 1043
    check-cast v6, Li0/h0;

    .line 1044
    .line 1045
    check-cast p3, Ljava/lang/Integer;

    .line 1046
    .line 1047
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1048
    .line 1049
    .line 1050
    move-result p2

    .line 1051
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    and-int/lit8 p1, p2, 0x11

    .line 1055
    .line 1056
    const/16 p3, 0x10

    .line 1057
    .line 1058
    const/4 v0, 0x1

    .line 1059
    if-eq p1, p3, :cond_26

    .line 1060
    .line 1061
    move p1, v0

    .line 1062
    goto :goto_26

    .line 1063
    :cond_26
    const/4 p1, 0x0

    .line 1064
    :goto_26
    and-int/2addr p2, v0

    .line 1065
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1066
    .line 1067
    .line 1068
    move-result p1

    .line 1069
    if-eqz p1, :cond_27

    .line 1070
    .line 1071
    const/4 v7, 0x6

    .line 1072
    const/16 v8, 0x3c

    .line 1073
    .line 1074
    const-string v0, "\u8fd4\u56de"

    .line 1075
    .line 1076
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1077
    .line 1078
    const/4 v2, 0x0

    .line 1079
    const/4 v3, 0x0

    .line 1080
    const/4 v4, 0x0

    .line 1081
    const/4 v5, 0x0

    .line 1082
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_27

    .line 1086
    :cond_27
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1087
    .line 1088
    .line 1089
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1090
    .line 1091
    return-object p1

    .line 1092
    :pswitch_13
    check-cast p1, Lr/d;

    .line 1093
    .line 1094
    check-cast p2, Li0/h0;

    .line 1095
    .line 1096
    check-cast p3, Ljava/lang/Integer;

    .line 1097
    .line 1098
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1099
    .line 1100
    .line 1101
    move-result p3

    .line 1102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    and-int/lit8 p1, p3, 0x11

    .line 1106
    .line 1107
    const/16 v0, 0x10

    .line 1108
    .line 1109
    const/4 v1, 0x1

    .line 1110
    if-eq p1, v0, :cond_28

    .line 1111
    .line 1112
    move p1, v1

    .line 1113
    goto :goto_28

    .line 1114
    :cond_28
    const/4 p1, 0x0

    .line 1115
    :goto_28
    and-int/2addr p3, v1

    .line 1116
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1117
    .line 1118
    .line 1119
    move-result p1

    .line 1120
    if-eqz p1, :cond_29

    .line 1121
    .line 1122
    new-instance p1, Lwb/p9;

    .line 1123
    .line 1124
    const/16 p3, 0x9

    .line 1125
    .line 1126
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 1127
    .line 1128
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 1129
    .line 1130
    .line 1131
    const p3, -0x30ccc7c0

    .line 1132
    .line 1133
    .line 1134
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1135
    .line 1136
    .line 1137
    move-result-object p1

    .line 1138
    const/16 p3, 0x30

    .line 1139
    .line 1140
    const/4 v0, 0x0

    .line 1141
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_29

    .line 1145
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1146
    .line 1147
    .line 1148
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1149
    .line 1150
    return-object p1

    .line 1151
    :pswitch_14
    check-cast p1, Lr/d;

    .line 1152
    .line 1153
    check-cast p2, Li0/h0;

    .line 1154
    .line 1155
    check-cast p3, Ljava/lang/Integer;

    .line 1156
    .line 1157
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1158
    .line 1159
    .line 1160
    move-result p3

    .line 1161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    and-int/lit8 p1, p3, 0x11

    .line 1165
    .line 1166
    const/16 v0, 0x10

    .line 1167
    .line 1168
    const/4 v1, 0x1

    .line 1169
    if-eq p1, v0, :cond_2a

    .line 1170
    .line 1171
    move p1, v1

    .line 1172
    goto :goto_2a

    .line 1173
    :cond_2a
    const/4 p1, 0x0

    .line 1174
    :goto_2a
    and-int/2addr p3, v1

    .line 1175
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1176
    .line 1177
    .line 1178
    move-result p1

    .line 1179
    if-eqz p1, :cond_2b

    .line 1180
    .line 1181
    new-instance p1, Lwb/p9;

    .line 1182
    .line 1183
    const/16 p3, 0x8

    .line 1184
    .line 1185
    iget-object v0, p0, Lwb/x6;->h:Lfg/a;

    .line 1186
    .line 1187
    invoke-direct {p1, v0, p3}, Lwb/p9;-><init>(Lfg/a;I)V

    .line 1188
    .line 1189
    .line 1190
    const p3, -0x73f03037

    .line 1191
    .line 1192
    .line 1193
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1194
    .line 1195
    .line 1196
    move-result-object p1

    .line 1197
    const/16 p3, 0x30

    .line 1198
    .line 1199
    const/4 v0, 0x0

    .line 1200
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1201
    .line 1202
    .line 1203
    goto :goto_2b

    .line 1204
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1205
    .line 1206
    .line 1207
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1208
    .line 1209
    return-object p1

    .line 1210
    :pswitch_15
    check-cast p1, Lth/a;

    .line 1211
    .line 1212
    move-object v6, p2

    .line 1213
    check-cast v6, Li0/h0;

    .line 1214
    .line 1215
    check-cast p3, Ljava/lang/Integer;

    .line 1216
    .line 1217
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1218
    .line 1219
    .line 1220
    move-result p2

    .line 1221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    and-int/lit8 p1, p2, 0x11

    .line 1225
    .line 1226
    const/16 p3, 0x10

    .line 1227
    .line 1228
    const/4 v0, 0x1

    .line 1229
    if-eq p1, p3, :cond_2c

    .line 1230
    .line 1231
    move p1, v0

    .line 1232
    goto :goto_2c

    .line 1233
    :cond_2c
    const/4 p1, 0x0

    .line 1234
    :goto_2c
    and-int/2addr p2, v0

    .line 1235
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1236
    .line 1237
    .line 1238
    move-result p1

    .line 1239
    if-eqz p1, :cond_2d

    .line 1240
    .line 1241
    const/4 v7, 0x6

    .line 1242
    const/16 v8, 0x3c

    .line 1243
    .line 1244
    const-string v0, "\u8fd4\u56de"

    .line 1245
    .line 1246
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1247
    .line 1248
    const/4 v2, 0x0

    .line 1249
    const/4 v3, 0x0

    .line 1250
    const/4 v4, 0x0

    .line 1251
    const/4 v5, 0x0

    .line 1252
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_2d

    .line 1256
    :cond_2d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1257
    .line 1258
    .line 1259
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1260
    .line 1261
    return-object p1

    .line 1262
    :pswitch_16
    check-cast p1, Lth/a;

    .line 1263
    .line 1264
    move-object v6, p2

    .line 1265
    check-cast v6, Li0/h0;

    .line 1266
    .line 1267
    check-cast p3, Ljava/lang/Integer;

    .line 1268
    .line 1269
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1270
    .line 1271
    .line 1272
    move-result p2

    .line 1273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    and-int/lit8 p1, p2, 0x11

    .line 1277
    .line 1278
    const/16 p3, 0x10

    .line 1279
    .line 1280
    const/4 v0, 0x1

    .line 1281
    if-eq p1, p3, :cond_2e

    .line 1282
    .line 1283
    move p1, v0

    .line 1284
    goto :goto_2e

    .line 1285
    :cond_2e
    const/4 p1, 0x0

    .line 1286
    :goto_2e
    and-int/2addr p2, v0

    .line 1287
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1288
    .line 1289
    .line 1290
    move-result p1

    .line 1291
    if-eqz p1, :cond_2f

    .line 1292
    .line 1293
    const/4 v7, 0x6

    .line 1294
    const/16 v8, 0x3c

    .line 1295
    .line 1296
    const-string v0, "\u8fd4\u56de"

    .line 1297
    .line 1298
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1299
    .line 1300
    const/4 v2, 0x0

    .line 1301
    const/4 v3, 0x0

    .line 1302
    const/4 v4, 0x0

    .line 1303
    const/4 v5, 0x0

    .line 1304
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1305
    .line 1306
    .line 1307
    goto :goto_2f

    .line 1308
    :cond_2f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1309
    .line 1310
    .line 1311
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1312
    .line 1313
    return-object p1

    .line 1314
    :pswitch_17
    check-cast p1, Lth/a;

    .line 1315
    .line 1316
    move-object v6, p2

    .line 1317
    check-cast v6, Li0/h0;

    .line 1318
    .line 1319
    check-cast p3, Ljava/lang/Integer;

    .line 1320
    .line 1321
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1322
    .line 1323
    .line 1324
    move-result p2

    .line 1325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    and-int/lit8 p1, p2, 0x11

    .line 1329
    .line 1330
    const/16 p3, 0x10

    .line 1331
    .line 1332
    const/4 v0, 0x1

    .line 1333
    if-eq p1, p3, :cond_30

    .line 1334
    .line 1335
    move p1, v0

    .line 1336
    goto :goto_30

    .line 1337
    :cond_30
    const/4 p1, 0x0

    .line 1338
    :goto_30
    and-int/2addr p2, v0

    .line 1339
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1340
    .line 1341
    .line 1342
    move-result p1

    .line 1343
    if-eqz p1, :cond_31

    .line 1344
    .line 1345
    const/4 v7, 0x6

    .line 1346
    const/16 v8, 0x3c

    .line 1347
    .line 1348
    const-string v0, "\u8fd4\u56de"

    .line 1349
    .line 1350
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1351
    .line 1352
    const/4 v2, 0x0

    .line 1353
    const/4 v3, 0x0

    .line 1354
    const/4 v4, 0x0

    .line 1355
    const/4 v5, 0x0

    .line 1356
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_31

    .line 1360
    :cond_31
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1361
    .line 1362
    .line 1363
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1364
    .line 1365
    return-object p1

    .line 1366
    :pswitch_18
    check-cast p1, Lth/a;

    .line 1367
    .line 1368
    move-object v6, p2

    .line 1369
    check-cast v6, Li0/h0;

    .line 1370
    .line 1371
    check-cast p3, Ljava/lang/Integer;

    .line 1372
    .line 1373
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1374
    .line 1375
    .line 1376
    move-result p2

    .line 1377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1378
    .line 1379
    .line 1380
    and-int/lit8 p1, p2, 0x11

    .line 1381
    .line 1382
    const/16 p3, 0x10

    .line 1383
    .line 1384
    const/4 v0, 0x1

    .line 1385
    if-eq p1, p3, :cond_32

    .line 1386
    .line 1387
    move p1, v0

    .line 1388
    goto :goto_32

    .line 1389
    :cond_32
    const/4 p1, 0x0

    .line 1390
    :goto_32
    and-int/2addr p2, v0

    .line 1391
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1392
    .line 1393
    .line 1394
    move-result p1

    .line 1395
    if-eqz p1, :cond_33

    .line 1396
    .line 1397
    const/4 v7, 0x6

    .line 1398
    const/16 v8, 0x3c

    .line 1399
    .line 1400
    const-string v0, "\u8fd4\u56de"

    .line 1401
    .line 1402
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1403
    .line 1404
    const/4 v2, 0x0

    .line 1405
    const/4 v3, 0x0

    .line 1406
    const/4 v4, 0x0

    .line 1407
    const/4 v5, 0x0

    .line 1408
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_33

    .line 1412
    :cond_33
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1413
    .line 1414
    .line 1415
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1416
    .line 1417
    return-object p1

    .line 1418
    :pswitch_19
    check-cast p1, Lth/a;

    .line 1419
    .line 1420
    move-object v6, p2

    .line 1421
    check-cast v6, Li0/h0;

    .line 1422
    .line 1423
    check-cast p3, Ljava/lang/Integer;

    .line 1424
    .line 1425
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1426
    .line 1427
    .line 1428
    move-result p2

    .line 1429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    and-int/lit8 p1, p2, 0x11

    .line 1433
    .line 1434
    const/16 p3, 0x10

    .line 1435
    .line 1436
    const/4 v0, 0x1

    .line 1437
    if-eq p1, p3, :cond_34

    .line 1438
    .line 1439
    move p1, v0

    .line 1440
    goto :goto_34

    .line 1441
    :cond_34
    const/4 p1, 0x0

    .line 1442
    :goto_34
    and-int/2addr p2, v0

    .line 1443
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1444
    .line 1445
    .line 1446
    move-result p1

    .line 1447
    if-eqz p1, :cond_35

    .line 1448
    .line 1449
    const/4 v7, 0x6

    .line 1450
    const/16 v8, 0x3c

    .line 1451
    .line 1452
    const-string v0, "\u8fd4\u56de"

    .line 1453
    .line 1454
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1455
    .line 1456
    const/4 v2, 0x0

    .line 1457
    const/4 v3, 0x0

    .line 1458
    const/4 v4, 0x0

    .line 1459
    const/4 v5, 0x0

    .line 1460
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1461
    .line 1462
    .line 1463
    goto :goto_35

    .line 1464
    :cond_35
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1465
    .line 1466
    .line 1467
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1468
    .line 1469
    return-object p1

    .line 1470
    :pswitch_1a
    check-cast p1, Lth/a;

    .line 1471
    .line 1472
    move-object v6, p2

    .line 1473
    check-cast v6, Li0/h0;

    .line 1474
    .line 1475
    check-cast p3, Ljava/lang/Integer;

    .line 1476
    .line 1477
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1478
    .line 1479
    .line 1480
    move-result p2

    .line 1481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1482
    .line 1483
    .line 1484
    and-int/lit8 p1, p2, 0x11

    .line 1485
    .line 1486
    const/16 p3, 0x10

    .line 1487
    .line 1488
    const/4 v0, 0x1

    .line 1489
    if-eq p1, p3, :cond_36

    .line 1490
    .line 1491
    move p1, v0

    .line 1492
    goto :goto_36

    .line 1493
    :cond_36
    const/4 p1, 0x0

    .line 1494
    :goto_36
    and-int/2addr p2, v0

    .line 1495
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1496
    .line 1497
    .line 1498
    move-result p1

    .line 1499
    if-eqz p1, :cond_37

    .line 1500
    .line 1501
    const/4 v7, 0x6

    .line 1502
    const/16 v8, 0x3c

    .line 1503
    .line 1504
    const-string v0, "\u8fd4\u56de"

    .line 1505
    .line 1506
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1507
    .line 1508
    const/4 v2, 0x0

    .line 1509
    const/4 v3, 0x0

    .line 1510
    const/4 v4, 0x0

    .line 1511
    const/4 v5, 0x0

    .line 1512
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1513
    .line 1514
    .line 1515
    goto :goto_37

    .line 1516
    :cond_37
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1517
    .line 1518
    .line 1519
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1520
    .line 1521
    return-object p1

    .line 1522
    :pswitch_1b
    check-cast p1, Lth/a;

    .line 1523
    .line 1524
    move-object v6, p2

    .line 1525
    check-cast v6, Li0/h0;

    .line 1526
    .line 1527
    check-cast p3, Ljava/lang/Integer;

    .line 1528
    .line 1529
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1530
    .line 1531
    .line 1532
    move-result p2

    .line 1533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    and-int/lit8 p1, p2, 0x11

    .line 1537
    .line 1538
    const/16 p3, 0x10

    .line 1539
    .line 1540
    const/4 v0, 0x1

    .line 1541
    if-eq p1, p3, :cond_38

    .line 1542
    .line 1543
    move p1, v0

    .line 1544
    goto :goto_38

    .line 1545
    :cond_38
    const/4 p1, 0x0

    .line 1546
    :goto_38
    and-int/2addr p2, v0

    .line 1547
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1548
    .line 1549
    .line 1550
    move-result p1

    .line 1551
    if-eqz p1, :cond_39

    .line 1552
    .line 1553
    const/4 v7, 0x6

    .line 1554
    const/16 v8, 0x3c

    .line 1555
    .line 1556
    const-string v0, "\u8fd4\u56de"

    .line 1557
    .line 1558
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1559
    .line 1560
    const/4 v2, 0x0

    .line 1561
    const/4 v3, 0x0

    .line 1562
    const/4 v4, 0x0

    .line 1563
    const/4 v5, 0x0

    .line 1564
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1565
    .line 1566
    .line 1567
    goto :goto_39

    .line 1568
    :cond_39
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1569
    .line 1570
    .line 1571
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1572
    .line 1573
    return-object p1

    .line 1574
    :pswitch_1c
    check-cast p1, Lth/a;

    .line 1575
    .line 1576
    move-object v6, p2

    .line 1577
    check-cast v6, Li0/h0;

    .line 1578
    .line 1579
    check-cast p3, Ljava/lang/Integer;

    .line 1580
    .line 1581
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 1582
    .line 1583
    .line 1584
    move-result p2

    .line 1585
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1586
    .line 1587
    .line 1588
    and-int/lit8 p1, p2, 0x11

    .line 1589
    .line 1590
    const/16 p3, 0x10

    .line 1591
    .line 1592
    const/4 v0, 0x1

    .line 1593
    if-eq p1, p3, :cond_3a

    .line 1594
    .line 1595
    move p1, v0

    .line 1596
    goto :goto_3a

    .line 1597
    :cond_3a
    const/4 p1, 0x0

    .line 1598
    :goto_3a
    and-int/2addr p2, v0

    .line 1599
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 1600
    .line 1601
    .line 1602
    move-result p1

    .line 1603
    if-eqz p1, :cond_3b

    .line 1604
    .line 1605
    const/4 v7, 0x6

    .line 1606
    const/16 v8, 0x3c

    .line 1607
    .line 1608
    const-string v0, "\u8fd4\u56de"

    .line 1609
    .line 1610
    iget-object v1, p0, Lwb/x6;->h:Lfg/a;

    .line 1611
    .line 1612
    const/4 v2, 0x0

    .line 1613
    const/4 v3, 0x0

    .line 1614
    const/4 v4, 0x0

    .line 1615
    const/4 v5, 0x0

    .line 1616
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 1617
    .line 1618
    .line 1619
    goto :goto_3b

    .line 1620
    :cond_3b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1621
    .line 1622
    .line 1623
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1624
    .line 1625
    return-object p1

    .line 1626
    nop

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
