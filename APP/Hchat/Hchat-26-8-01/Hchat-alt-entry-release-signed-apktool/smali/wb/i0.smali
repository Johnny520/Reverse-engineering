.class public final synthetic Lwb/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/i0;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/i0;->g:I

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
    sget-object p1, Lwb/p0;->g6:Ls0/d;

    .line 37
    .line 38
    const/16 p3, 0x30

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    const/16 v0, 0x10

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    if-eq p1, v0, :cond_2

    .line 55
    .line 56
    move p1, v1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 p1, 0x0

    .line 59
    :goto_2
    and-int/2addr p3, v1

    .line 60
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    const/4 p1, 0x6

    .line 67
    const/16 p3, 0xe

    .line 68
    .line 69
    const-string v0, "\u641c\u7d22"

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 77
    .line 78
    .line 79
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_1
    const/16 v0, 0x10

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    if-eq p1, v0, :cond_4

    .line 86
    .line 87
    move p1, v1

    .line 88
    goto :goto_4

    .line 89
    :cond_4
    const/4 p1, 0x0

    .line 90
    :goto_4
    and-int/2addr p3, v1

    .line 91
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    const/16 p1, 0xa

    .line 98
    .line 99
    int-to-float v2, p1

    .line 100
    const/4 v4, 0x0

    .line 101
    const/16 v5, 0xd

    .line 102
    .line 103
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    const/4 v3, 0x0

    .line 107
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const/16 p3, 0x36

    .line 112
    .line 113
    const/16 v0, 0xc

    .line 114
    .line 115
    const-string v1, "\u6267\u884c\u65f6\u95f4"

    .line 116
    .line 117
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_2
    const/16 v0, 0x10

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    if-eq p1, v0, :cond_6

    .line 131
    .line 132
    move p1, v1

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    const/4 p1, 0x0

    .line 135
    :goto_6
    and-int/2addr p3, v1

    .line 136
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_7

    .line 141
    .line 142
    sget-object p1, Lwb/p0;->e6:Ls0/d;

    .line 143
    .line 144
    const/16 p3, 0x30

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 152
    .line 153
    .line 154
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    return-object p1

    .line 157
    :pswitch_3
    const/16 v0, 0x10

    .line 158
    .line 159
    const/4 v1, 0x1

    .line 160
    if-eq p1, v0, :cond_8

    .line 161
    .line 162
    move p1, v1

    .line 163
    goto :goto_8

    .line 164
    :cond_8
    const/4 p1, 0x0

    .line 165
    :goto_8
    and-int/2addr p3, v1

    .line 166
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_9

    .line 171
    .line 172
    sget-object p1, Lwb/p0;->c6:Ls0/d;

    .line 173
    .line 174
    const/16 p3, 0x30

    .line 175
    .line 176
    const/4 v0, 0x0

    .line 177
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 182
    .line 183
    .line 184
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_4
    const/16 v0, 0x10

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    if-eq p1, v0, :cond_a

    .line 191
    .line 192
    move p1, v1

    .line 193
    goto :goto_a

    .line 194
    :cond_a
    const/4 p1, 0x0

    .line 195
    :goto_a
    and-int/2addr p3, v1

    .line 196
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_b

    .line 201
    .line 202
    sget-object p1, Lwb/p0;->a6:Ls0/d;

    .line 203
    .line 204
    const/16 p3, 0x30

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 208
    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 212
    .line 213
    .line 214
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 215
    .line 216
    return-object p1

    .line 217
    :pswitch_5
    const/16 v0, 0x10

    .line 218
    .line 219
    const/4 v1, 0x1

    .line 220
    if-eq p1, v0, :cond_c

    .line 221
    .line 222
    move p1, v1

    .line 223
    goto :goto_c

    .line 224
    :cond_c
    const/4 p1, 0x0

    .line 225
    :goto_c
    and-int/2addr p3, v1

    .line 226
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_d

    .line 231
    .line 232
    sget-object p1, Lwb/p0;->Y5:Ls0/d;

    .line 233
    .line 234
    const/16 p3, 0x30

    .line 235
    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 238
    .line 239
    .line 240
    goto :goto_d

    .line 241
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 242
    .line 243
    .line 244
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 245
    .line 246
    return-object p1

    .line 247
    :pswitch_6
    const/16 v0, 0x10

    .line 248
    .line 249
    const/4 v1, 0x1

    .line 250
    if-eq p1, v0, :cond_e

    .line 251
    .line 252
    move p1, v1

    .line 253
    goto :goto_e

    .line 254
    :cond_e
    const/4 p1, 0x0

    .line 255
    :goto_e
    and-int/2addr p3, v1

    .line 256
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_f

    .line 261
    .line 262
    sget-object p1, Lwb/p0;->W5:Ls0/d;

    .line 263
    .line 264
    const/16 p3, 0x30

    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 268
    .line 269
    .line 270
    goto :goto_f

    .line 271
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 272
    .line 273
    .line 274
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 275
    .line 276
    return-object p1

    .line 277
    :pswitch_7
    const/16 v0, 0x10

    .line 278
    .line 279
    const/4 v1, 0x1

    .line 280
    if-eq p1, v0, :cond_10

    .line 281
    .line 282
    move p1, v1

    .line 283
    goto :goto_10

    .line 284
    :cond_10
    const/4 p1, 0x0

    .line 285
    :goto_10
    and-int/2addr p3, v1

    .line 286
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-eqz p1, :cond_11

    .line 291
    .line 292
    const/4 p1, 0x6

    .line 293
    const/16 p3, 0xe

    .line 294
    .line 295
    const-string v0, "\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 296
    .line 297
    const/4 v1, 0x0

    .line 298
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 299
    .line 300
    .line 301
    goto :goto_11

    .line 302
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 303
    .line 304
    .line 305
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 306
    .line 307
    return-object p1

    .line 308
    :pswitch_8
    const/16 v0, 0x10

    .line 309
    .line 310
    const/4 v1, 0x1

    .line 311
    if-eq p1, v0, :cond_12

    .line 312
    .line 313
    move p1, v1

    .line 314
    goto :goto_12

    .line 315
    :cond_12
    const/4 p1, 0x0

    .line 316
    :goto_12
    and-int/2addr p3, v1

    .line 317
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    if-eqz p1, :cond_13

    .line 322
    .line 323
    const/16 p1, 0xa

    .line 324
    .line 325
    int-to-float v2, p1

    .line 326
    const/4 v4, 0x0

    .line 327
    const/16 v5, 0xd

    .line 328
    .line 329
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 330
    .line 331
    const/4 v1, 0x0

    .line 332
    const/4 v3, 0x0

    .line 333
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    const/16 p3, 0x36

    .line 338
    .line 339
    const/16 v0, 0xc

    .line 340
    .line 341
    const-string v1, "\u597d\u53cb\u8303\u56f4"

    .line 342
    .line 343
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 344
    .line 345
    .line 346
    goto :goto_13

    .line 347
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 348
    .line 349
    .line 350
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 351
    .line 352
    return-object p1

    .line 353
    :pswitch_9
    const/16 v0, 0x10

    .line 354
    .line 355
    const/4 v1, 0x1

    .line 356
    if-eq p1, v0, :cond_14

    .line 357
    .line 358
    move p1, v1

    .line 359
    goto :goto_14

    .line 360
    :cond_14
    const/4 p1, 0x0

    .line 361
    :goto_14
    and-int/2addr p3, v1

    .line 362
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_15

    .line 367
    .line 368
    sget-object p1, Lwb/p0;->U5:Ls0/d;

    .line 369
    .line 370
    const/16 p3, 0x30

    .line 371
    .line 372
    const/4 v0, 0x0

    .line 373
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 374
    .line 375
    .line 376
    goto :goto_15

    .line 377
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 378
    .line 379
    .line 380
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_a
    const/16 v0, 0x10

    .line 384
    .line 385
    const/4 v1, 0x1

    .line 386
    if-eq p1, v0, :cond_16

    .line 387
    .line 388
    move p1, v1

    .line 389
    goto :goto_16

    .line 390
    :cond_16
    const/4 p1, 0x0

    .line 391
    :goto_16
    and-int/2addr p3, v1

    .line 392
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_17

    .line 397
    .line 398
    sget-object p1, Lwb/p0;->S5:Ls0/d;

    .line 399
    .line 400
    const/16 p3, 0x30

    .line 401
    .line 402
    const/4 v0, 0x0

    .line 403
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 404
    .line 405
    .line 406
    goto :goto_17

    .line 407
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 408
    .line 409
    .line 410
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 411
    .line 412
    return-object p1

    .line 413
    :pswitch_b
    const/16 v0, 0x10

    .line 414
    .line 415
    const/4 v1, 0x1

    .line 416
    if-eq p1, v0, :cond_18

    .line 417
    .line 418
    move p1, v1

    .line 419
    goto :goto_18

    .line 420
    :cond_18
    const/4 p1, 0x0

    .line 421
    :goto_18
    and-int/2addr p3, v1

    .line 422
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    if-eqz p1, :cond_19

    .line 427
    .line 428
    const-string p1, "\u7fa4\u804a\u6807\u7b7e"

    .line 429
    .line 430
    const/4 p3, 0x6

    .line 431
    invoke-static {p1, p2, p3}, Lwb/ho;->E2(Ljava/lang/String;Li0/h0;I)V

    .line 432
    .line 433
    .line 434
    goto :goto_19

    .line 435
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 436
    .line 437
    .line 438
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 439
    .line 440
    return-object p1

    .line 441
    :pswitch_c
    const/16 v0, 0x10

    .line 442
    .line 443
    const/4 v1, 0x1

    .line 444
    if-eq p1, v0, :cond_1a

    .line 445
    .line 446
    move p1, v1

    .line 447
    goto :goto_1a

    .line 448
    :cond_1a
    const/4 p1, 0x0

    .line 449
    :goto_1a
    and-int/2addr p3, v1

    .line 450
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    if-eqz p1, :cond_1b

    .line 455
    .line 456
    sget-object p1, Lwb/p0;->P5:Ls0/d;

    .line 457
    .line 458
    const/16 p3, 0x30

    .line 459
    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 462
    .line 463
    .line 464
    goto :goto_1b

    .line 465
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 466
    .line 467
    .line 468
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 469
    .line 470
    return-object p1

    .line 471
    :pswitch_d
    const/16 v0, 0x10

    .line 472
    .line 473
    const/4 v1, 0x1

    .line 474
    if-eq p1, v0, :cond_1c

    .line 475
    .line 476
    move p1, v1

    .line 477
    goto :goto_1c

    .line 478
    :cond_1c
    const/4 p1, 0x0

    .line 479
    :goto_1c
    and-int/2addr p3, v1

    .line 480
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 481
    .line 482
    .line 483
    move-result p1

    .line 484
    if-eqz p1, :cond_1d

    .line 485
    .line 486
    sget-object p1, Lwb/p0;->N5:Ls0/d;

    .line 487
    .line 488
    const/16 p3, 0x30

    .line 489
    .line 490
    const/4 v0, 0x0

    .line 491
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 492
    .line 493
    .line 494
    goto :goto_1d

    .line 495
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 496
    .line 497
    .line 498
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 499
    .line 500
    return-object p1

    .line 501
    :pswitch_e
    const/16 v0, 0x10

    .line 502
    .line 503
    const/4 v1, 0x1

    .line 504
    if-eq p1, v0, :cond_1e

    .line 505
    .line 506
    move p1, v1

    .line 507
    goto :goto_1e

    .line 508
    :cond_1e
    const/4 p1, 0x0

    .line 509
    :goto_1e
    and-int/2addr p3, v1

    .line 510
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 511
    .line 512
    .line 513
    move-result p1

    .line 514
    if-eqz p1, :cond_1f

    .line 515
    .line 516
    const/16 p1, 0xa

    .line 517
    .line 518
    int-to-float v2, p1

    .line 519
    const/4 v4, 0x0

    .line 520
    const/16 v5, 0xd

    .line 521
    .line 522
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 523
    .line 524
    const/4 v1, 0x0

    .line 525
    const/4 v3, 0x0

    .line 526
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    const/16 p3, 0x36

    .line 531
    .line 532
    const/16 v0, 0xc

    .line 533
    .line 534
    const-string v1, "\u64cd\u4f5c"

    .line 535
    .line 536
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 537
    .line 538
    .line 539
    goto :goto_1f

    .line 540
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 541
    .line 542
    .line 543
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 544
    .line 545
    return-object p1

    .line 546
    :pswitch_f
    const/16 v0, 0x10

    .line 547
    .line 548
    const/4 v1, 0x1

    .line 549
    if-eq p1, v0, :cond_20

    .line 550
    .line 551
    move p1, v1

    .line 552
    goto :goto_20

    .line 553
    :cond_20
    const/4 p1, 0x0

    .line 554
    :goto_20
    and-int/2addr p3, v1

    .line 555
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 556
    .line 557
    .line 558
    move-result p1

    .line 559
    if-eqz p1, :cond_21

    .line 560
    .line 561
    sget-object p1, Lwb/p0;->L5:Ls0/d;

    .line 562
    .line 563
    const/16 p3, 0x30

    .line 564
    .line 565
    const/4 v0, 0x0

    .line 566
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 567
    .line 568
    .line 569
    goto :goto_21

    .line 570
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 571
    .line 572
    .line 573
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 574
    .line 575
    return-object p1

    .line 576
    :pswitch_10
    const/16 v0, 0x10

    .line 577
    .line 578
    const/4 v1, 0x1

    .line 579
    if-eq p1, v0, :cond_22

    .line 580
    .line 581
    move p1, v1

    .line 582
    goto :goto_22

    .line 583
    :cond_22
    const/4 p1, 0x0

    .line 584
    :goto_22
    and-int/2addr p3, v1

    .line 585
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    if-eqz p1, :cond_23

    .line 590
    .line 591
    const/4 p1, 0x6

    .line 592
    const/16 p3, 0xe

    .line 593
    .line 594
    const-string v0, "\u81ea\u52a8\u70b9\u8d5e"

    .line 595
    .line 596
    const/4 v1, 0x0

    .line 597
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 598
    .line 599
    .line 600
    goto :goto_23

    .line 601
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 602
    .line 603
    .line 604
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 605
    .line 606
    return-object p1

    .line 607
    :pswitch_11
    const/16 v0, 0x10

    .line 608
    .line 609
    const/4 v1, 0x1

    .line 610
    if-eq p1, v0, :cond_24

    .line 611
    .line 612
    move p1, v1

    .line 613
    goto :goto_24

    .line 614
    :cond_24
    const/4 p1, 0x0

    .line 615
    :goto_24
    and-int/2addr p3, v1

    .line 616
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 617
    .line 618
    .line 619
    move-result p1

    .line 620
    if-eqz p1, :cond_25

    .line 621
    .line 622
    const/16 p1, 0xa

    .line 623
    .line 624
    int-to-float v2, p1

    .line 625
    const/4 v4, 0x0

    .line 626
    const/16 v5, 0xd

    .line 627
    .line 628
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 629
    .line 630
    const/4 v1, 0x0

    .line 631
    const/4 v3, 0x0

    .line 632
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    const/16 p3, 0x36

    .line 637
    .line 638
    const/16 v0, 0xc

    .line 639
    .line 640
    const-string v1, "\u663e\u793a"

    .line 641
    .line 642
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 643
    .line 644
    .line 645
    goto :goto_25

    .line 646
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 647
    .line 648
    .line 649
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 650
    .line 651
    return-object p1

    .line 652
    :pswitch_12
    const/16 v0, 0x10

    .line 653
    .line 654
    const/4 v1, 0x1

    .line 655
    if-eq p1, v0, :cond_26

    .line 656
    .line 657
    move p1, v1

    .line 658
    goto :goto_26

    .line 659
    :cond_26
    const/4 p1, 0x0

    .line 660
    :goto_26
    and-int/2addr p3, v1

    .line 661
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 662
    .line 663
    .line 664
    move-result p1

    .line 665
    if-eqz p1, :cond_27

    .line 666
    .line 667
    const/4 p1, 0x6

    .line 668
    const/16 p3, 0xe

    .line 669
    .line 670
    const-string v0, "\u57fa\u7840"

    .line 671
    .line 672
    const/4 v1, 0x0

    .line 673
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 674
    .line 675
    .line 676
    goto :goto_27

    .line 677
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 678
    .line 679
    .line 680
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 681
    .line 682
    return-object p1

    .line 683
    :pswitch_13
    const/16 v0, 0x10

    .line 684
    .line 685
    const/4 v1, 0x1

    .line 686
    if-eq p1, v0, :cond_28

    .line 687
    .line 688
    move p1, v1

    .line 689
    goto :goto_28

    .line 690
    :cond_28
    const/4 p1, 0x0

    .line 691
    :goto_28
    and-int/2addr p3, v1

    .line 692
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 693
    .line 694
    .line 695
    move-result p1

    .line 696
    if-eqz p1, :cond_29

    .line 697
    .line 698
    const/4 p1, 0x6

    .line 699
    const/16 p3, 0xe

    .line 700
    .line 701
    const-string v0, "\u7fa4\u6635\u79f0"

    .line 702
    .line 703
    const/4 v1, 0x0

    .line 704
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 705
    .line 706
    .line 707
    goto :goto_29

    .line 708
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 709
    .line 710
    .line 711
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 712
    .line 713
    return-object p1

    .line 714
    :pswitch_14
    const/16 v0, 0x10

    .line 715
    .line 716
    const/4 v1, 0x1

    .line 717
    if-eq p1, v0, :cond_2a

    .line 718
    .line 719
    move p1, v1

    .line 720
    goto :goto_2a

    .line 721
    :cond_2a
    const/4 p1, 0x0

    .line 722
    :goto_2a
    and-int/2addr p3, v1

    .line 723
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 724
    .line 725
    .line 726
    move-result p1

    .line 727
    if-eqz p1, :cond_2b

    .line 728
    .line 729
    const/16 p1, 0xa

    .line 730
    .line 731
    int-to-float v2, p1

    .line 732
    const/4 v4, 0x0

    .line 733
    const/16 v5, 0xd

    .line 734
    .line 735
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 736
    .line 737
    const/4 v1, 0x0

    .line 738
    const/4 v3, 0x0

    .line 739
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    const/16 p3, 0x36

    .line 744
    .line 745
    const/16 v0, 0xc

    .line 746
    .line 747
    const-string v1, "\u989c\u8272"

    .line 748
    .line 749
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 750
    .line 751
    .line 752
    goto :goto_2b

    .line 753
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 754
    .line 755
    .line 756
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 757
    .line 758
    return-object p1

    .line 759
    :pswitch_15
    const/16 v0, 0x10

    .line 760
    .line 761
    const/4 v1, 0x1

    .line 762
    if-eq p1, v0, :cond_2c

    .line 763
    .line 764
    move p1, v1

    .line 765
    goto :goto_2c

    .line 766
    :cond_2c
    const/4 p1, 0x0

    .line 767
    :goto_2c
    and-int/2addr p3, v1

    .line 768
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 769
    .line 770
    .line 771
    move-result p1

    .line 772
    if-eqz p1, :cond_2d

    .line 773
    .line 774
    const/16 p1, 0xa

    .line 775
    .line 776
    int-to-float v2, p1

    .line 777
    const/4 v4, 0x0

    .line 778
    const/16 v5, 0xd

    .line 779
    .line 780
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 781
    .line 782
    const/4 v1, 0x0

    .line 783
    const/4 v3, 0x0

    .line 784
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    const/16 p3, 0x36

    .line 789
    .line 790
    const/16 v0, 0xc

    .line 791
    .line 792
    const-string v1, "\u540d\u79f0"

    .line 793
    .line 794
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 795
    .line 796
    .line 797
    goto :goto_2d

    .line 798
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 799
    .line 800
    .line 801
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 802
    .line 803
    return-object p1

    .line 804
    :pswitch_16
    const/16 v0, 0x10

    .line 805
    .line 806
    const/4 v1, 0x1

    .line 807
    if-eq p1, v0, :cond_2e

    .line 808
    .line 809
    move p1, v1

    .line 810
    goto :goto_2e

    .line 811
    :cond_2e
    const/4 p1, 0x0

    .line 812
    :goto_2e
    and-int/2addr p3, v1

    .line 813
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 814
    .line 815
    .line 816
    move-result p1

    .line 817
    if-eqz p1, :cond_2f

    .line 818
    .line 819
    const/4 p1, 0x6

    .line 820
    const/16 p3, 0xe

    .line 821
    .line 822
    const-string v0, "\u57fa\u7840"

    .line 823
    .line 824
    const/4 v1, 0x0

    .line 825
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 826
    .line 827
    .line 828
    goto :goto_2f

    .line 829
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 830
    .line 831
    .line 832
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 833
    .line 834
    return-object p1

    .line 835
    :pswitch_17
    const/16 v0, 0x10

    .line 836
    .line 837
    const/4 v1, 0x1

    .line 838
    if-eq p1, v0, :cond_30

    .line 839
    .line 840
    move p1, v1

    .line 841
    goto :goto_30

    .line 842
    :cond_30
    const/4 p1, 0x0

    .line 843
    :goto_30
    and-int/2addr p3, v1

    .line 844
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 845
    .line 846
    .line 847
    move-result p1

    .line 848
    if-eqz p1, :cond_31

    .line 849
    .line 850
    sget-object p1, Lwb/p0;->s1:Ls0/d;

    .line 851
    .line 852
    const/16 p3, 0x30

    .line 853
    .line 854
    const/4 v0, 0x0

    .line 855
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 856
    .line 857
    .line 858
    goto :goto_31

    .line 859
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 860
    .line 861
    .line 862
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 863
    .line 864
    return-object p1

    .line 865
    :pswitch_18
    const/16 v0, 0x10

    .line 866
    .line 867
    const/4 v1, 0x1

    .line 868
    if-eq p1, v0, :cond_32

    .line 869
    .line 870
    move p1, v1

    .line 871
    goto :goto_32

    .line 872
    :cond_32
    const/4 p1, 0x0

    .line 873
    :goto_32
    and-int/2addr p3, v1

    .line 874
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 875
    .line 876
    .line 877
    move-result p1

    .line 878
    if-eqz p1, :cond_33

    .line 879
    .line 880
    const/16 p1, 0xa

    .line 881
    .line 882
    int-to-float v2, p1

    .line 883
    const/4 v4, 0x0

    .line 884
    const/16 v5, 0xd

    .line 885
    .line 886
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 887
    .line 888
    const/4 v1, 0x0

    .line 889
    const/4 v3, 0x0

    .line 890
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    const/16 p3, 0x36

    .line 895
    .line 896
    const/16 v0, 0xc

    .line 897
    .line 898
    const-string v1, "\u91d1\u989d"

    .line 899
    .line 900
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 901
    .line 902
    .line 903
    goto :goto_33

    .line 904
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 905
    .line 906
    .line 907
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 908
    .line 909
    return-object p1

    .line 910
    :pswitch_19
    const/16 v0, 0x10

    .line 911
    .line 912
    const/4 v1, 0x1

    .line 913
    if-eq p1, v0, :cond_34

    .line 914
    .line 915
    move p1, v1

    .line 916
    goto :goto_34

    .line 917
    :cond_34
    const/4 p1, 0x0

    .line 918
    :goto_34
    and-int/2addr p3, v1

    .line 919
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 920
    .line 921
    .line 922
    move-result p1

    .line 923
    if-eqz p1, :cond_35

    .line 924
    .line 925
    const/4 p1, 0x6

    .line 926
    const/16 p3, 0xe

    .line 927
    .line 928
    const-string v0, "\u663e\u793a"

    .line 929
    .line 930
    const/4 v1, 0x0

    .line 931
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 932
    .line 933
    .line 934
    goto :goto_35

    .line 935
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 936
    .line 937
    .line 938
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 939
    .line 940
    return-object p1

    .line 941
    :pswitch_1a
    const/16 v0, 0x10

    .line 942
    .line 943
    const/4 v1, 0x1

    .line 944
    if-eq p1, v0, :cond_36

    .line 945
    .line 946
    move p1, v1

    .line 947
    goto :goto_36

    .line 948
    :cond_36
    const/4 p1, 0x0

    .line 949
    :goto_36
    and-int/2addr p3, v1

    .line 950
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 951
    .line 952
    .line 953
    move-result p1

    .line 954
    if-eqz p1, :cond_37

    .line 955
    .line 956
    const/16 p1, 0xa

    .line 957
    .line 958
    int-to-float v2, p1

    .line 959
    const/4 v4, 0x0

    .line 960
    const/16 v5, 0xd

    .line 961
    .line 962
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 963
    .line 964
    const/4 v1, 0x0

    .line 965
    const/4 v3, 0x0

    .line 966
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 967
    .line 968
    .line 969
    move-result-object p1

    .line 970
    const/16 p3, 0x36

    .line 971
    .line 972
    const/16 v0, 0xc

    .line 973
    .line 974
    const-string v1, "\u64cd\u4f5c"

    .line 975
    .line 976
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 977
    .line 978
    .line 979
    goto :goto_37

    .line 980
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 981
    .line 982
    .line 983
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 984
    .line 985
    return-object p1

    .line 986
    :pswitch_1b
    const/16 v0, 0x10

    .line 987
    .line 988
    const/4 v1, 0x1

    .line 989
    if-eq p1, v0, :cond_38

    .line 990
    .line 991
    move p1, v1

    .line 992
    goto :goto_38

    .line 993
    :cond_38
    const/4 p1, 0x0

    .line 994
    :goto_38
    and-int/2addr p3, v1

    .line 995
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 996
    .line 997
    .line 998
    move-result p1

    .line 999
    if-eqz p1, :cond_39

    .line 1000
    .line 1001
    const/4 p1, 0x6

    .line 1002
    const/16 p3, 0xe

    .line 1003
    .line 1004
    const-string v0, "\u70ed\u66f4\u65b0"

    .line 1005
    .line 1006
    const/4 v1, 0x0

    .line 1007
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1008
    .line 1009
    .line 1010
    goto :goto_39

    .line 1011
    :cond_39
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1012
    .line 1013
    .line 1014
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1015
    .line 1016
    return-object p1

    .line 1017
    :pswitch_1c
    const/16 v0, 0x10

    .line 1018
    .line 1019
    const/4 v1, 0x1

    .line 1020
    if-eq p1, v0, :cond_3a

    .line 1021
    .line 1022
    move p1, v1

    .line 1023
    goto :goto_3a

    .line 1024
    :cond_3a
    const/4 p1, 0x0

    .line 1025
    :goto_3a
    and-int/2addr p3, v1

    .line 1026
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1027
    .line 1028
    .line 1029
    move-result p1

    .line 1030
    if-eqz p1, :cond_3b

    .line 1031
    .line 1032
    const/16 p1, 0xa

    .line 1033
    .line 1034
    int-to-float v2, p1

    .line 1035
    const/4 v4, 0x0

    .line 1036
    const/16 v5, 0xd

    .line 1037
    .line 1038
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1039
    .line 1040
    const/4 v1, 0x0

    .line 1041
    const/4 v3, 0x0

    .line 1042
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1043
    .line 1044
    .line 1045
    move-result-object p1

    .line 1046
    const/16 p3, 0x36

    .line 1047
    .line 1048
    const/16 v0, 0xc

    .line 1049
    .line 1050
    const-string v1, "\u6210\u529f\u63d0\u9192"

    .line 1051
    .line 1052
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_3b

    .line 1056
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1057
    .line 1058
    .line 1059
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1060
    .line 1061
    return-object p1

    .line 1062
    nop

    .line 1063
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
