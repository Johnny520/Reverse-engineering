.class public final synthetic Lwb/r6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/r6;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/r6;->g:I

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
    new-instance p1, Lwb/l8;

    .line 37
    .line 38
    const/16 p3, 0x10

    .line 39
    .line 40
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 43
    .line 44
    .line 45
    const p3, 0x36b9a062

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
    new-instance p1, Lwb/sb;

    .line 81
    .line 82
    const/4 p3, 0x1

    .line 83
    const/4 v0, 0x0

    .line 84
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 85
    .line 86
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 87
    .line 88
    .line 89
    const p3, 0x647804c7

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
    new-instance p1, Lwb/l8;

    .line 125
    .line 126
    const/16 p3, 0x1a

    .line 127
    .line 128
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 129
    .line 130
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 131
    .line 132
    .line 133
    const p3, -0x21ce2eba

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
    new-instance p1, Lwb/l8;

    .line 169
    .line 170
    const/4 p3, 0x3

    .line 171
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 172
    .line 173
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 174
    .line 175
    .line 176
    const p3, 0xf7c6451

    .line 177
    .line 178
    .line 179
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const/16 p3, 0x30

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 191
    .line 192
    .line 193
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 194
    .line 195
    return-object p1

    .line 196
    :pswitch_3
    const/16 v0, 0x10

    .line 197
    .line 198
    const/4 v1, 0x1

    .line 199
    if-eq p1, v0, :cond_8

    .line 200
    .line 201
    move p1, v1

    .line 202
    goto :goto_8

    .line 203
    :cond_8
    const/4 p1, 0x0

    .line 204
    :goto_8
    and-int/2addr p3, v1

    .line 205
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_9

    .line 210
    .line 211
    new-instance p1, Lwb/l8;

    .line 212
    .line 213
    const/16 p3, 0x1c

    .line 214
    .line 215
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 216
    .line 217
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 218
    .line 219
    .line 220
    const p3, 0x1d0b7e1e

    .line 221
    .line 222
    .line 223
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    const/16 p3, 0x30

    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 235
    .line 236
    .line 237
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 238
    .line 239
    return-object p1

    .line 240
    :pswitch_4
    const/16 v0, 0x10

    .line 241
    .line 242
    const/4 v1, 0x1

    .line 243
    if-eq p1, v0, :cond_a

    .line 244
    .line 245
    move p1, v1

    .line 246
    goto :goto_a

    .line 247
    :cond_a
    const/4 p1, 0x0

    .line 248
    :goto_a
    and-int/2addr p3, v1

    .line 249
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-eqz p1, :cond_b

    .line 254
    .line 255
    new-instance p1, Lwb/l8;

    .line 256
    .line 257
    const/4 p3, 0x1

    .line 258
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 259
    .line 260
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 261
    .line 262
    .line 263
    const p3, 0x7502005d

    .line 264
    .line 265
    .line 266
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    const/16 p3, 0x30

    .line 271
    .line 272
    const/4 v0, 0x0

    .line 273
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 274
    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 278
    .line 279
    .line 280
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 281
    .line 282
    return-object p1

    .line 283
    :pswitch_5
    const/16 v0, 0x10

    .line 284
    .line 285
    const/4 v1, 0x1

    .line 286
    if-eq p1, v0, :cond_c

    .line 287
    .line 288
    move p1, v1

    .line 289
    goto :goto_c

    .line 290
    :cond_c
    const/4 p1, 0x0

    .line 291
    :goto_c
    and-int/2addr p3, v1

    .line 292
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_d

    .line 297
    .line 298
    new-instance p1, Lwb/sb;

    .line 299
    .line 300
    const/4 p3, 0x2

    .line 301
    const/4 v0, 0x0

    .line 302
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 303
    .line 304
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 305
    .line 306
    .line 307
    const p3, -0x12eb8ba1

    .line 308
    .line 309
    .line 310
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    const/16 p3, 0x30

    .line 315
    .line 316
    const/4 v0, 0x0

    .line 317
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 318
    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 322
    .line 323
    .line 324
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 325
    .line 326
    return-object p1

    .line 327
    :pswitch_6
    const/16 v0, 0x10

    .line 328
    .line 329
    const/4 v1, 0x1

    .line 330
    if-eq p1, v0, :cond_e

    .line 331
    .line 332
    move p1, v1

    .line 333
    goto :goto_e

    .line 334
    :cond_e
    const/4 p1, 0x0

    .line 335
    :goto_e
    and-int/2addr p3, v1

    .line 336
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-eqz p1, :cond_f

    .line 341
    .line 342
    new-instance p1, Lwb/l8;

    .line 343
    .line 344
    const/4 p3, 0x0

    .line 345
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 346
    .line 347
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 348
    .line 349
    .line 350
    const p3, 0x5aed3239

    .line 351
    .line 352
    .line 353
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    const/16 p3, 0x30

    .line 358
    .line 359
    const/4 v0, 0x0

    .line 360
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 361
    .line 362
    .line 363
    goto :goto_f

    .line 364
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 365
    .line 366
    .line 367
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 368
    .line 369
    return-object p1

    .line 370
    :pswitch_7
    const/16 v0, 0x10

    .line 371
    .line 372
    const/4 v1, 0x1

    .line 373
    if-eq p1, v0, :cond_10

    .line 374
    .line 375
    move p1, v1

    .line 376
    goto :goto_10

    .line 377
    :cond_10
    const/4 p1, 0x0

    .line 378
    :goto_10
    and-int/2addr p3, v1

    .line 379
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-eqz p1, :cond_11

    .line 384
    .line 385
    new-instance p1, Lwb/l8;

    .line 386
    .line 387
    const/16 p3, 0x11

    .line 388
    .line 389
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 390
    .line 391
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 392
    .line 393
    .line 394
    const p3, 0x4fda1ff3

    .line 395
    .line 396
    .line 397
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    const/16 p3, 0x30

    .line 402
    .line 403
    const/4 v0, 0x0

    .line 404
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 405
    .line 406
    .line 407
    goto :goto_11

    .line 408
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 409
    .line 410
    .line 411
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 412
    .line 413
    return-object p1

    .line 414
    :pswitch_8
    const/16 v0, 0x10

    .line 415
    .line 416
    const/4 v1, 0x1

    .line 417
    if-eq p1, v0, :cond_12

    .line 418
    .line 419
    move p1, v1

    .line 420
    goto :goto_12

    .line 421
    :cond_12
    const/4 p1, 0x0

    .line 422
    :goto_12
    and-int/2addr p3, v1

    .line 423
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 424
    .line 425
    .line 426
    move-result p1

    .line 427
    if-eqz p1, :cond_13

    .line 428
    .line 429
    new-instance p1, Lwb/l8;

    .line 430
    .line 431
    const/4 p3, 0x2

    .line 432
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 433
    .line 434
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 435
    .line 436
    .line 437
    const p3, -0x6ce0308e

    .line 438
    .line 439
    .line 440
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    const/16 p3, 0x30

    .line 445
    .line 446
    const/4 v0, 0x0

    .line 447
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 448
    .line 449
    .line 450
    goto :goto_13

    .line 451
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 452
    .line 453
    .line 454
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 455
    .line 456
    return-object p1

    .line 457
    :pswitch_9
    const/16 v0, 0x10

    .line 458
    .line 459
    const/4 v1, 0x1

    .line 460
    if-eq p1, v0, :cond_14

    .line 461
    .line 462
    move p1, v1

    .line 463
    goto :goto_14

    .line 464
    :cond_14
    const/4 p1, 0x0

    .line 465
    :goto_14
    and-int/2addr p3, v1

    .line 466
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    if-eqz p1, :cond_15

    .line 471
    .line 472
    new-instance p1, Lwb/l8;

    .line 473
    .line 474
    const/16 p3, 0x9

    .line 475
    .line 476
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 477
    .line 478
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 479
    .line 480
    .line 481
    const p3, 0x666b8e62

    .line 482
    .line 483
    .line 484
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 485
    .line 486
    .line 487
    move-result-object p1

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
    goto :goto_15

    .line 495
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 496
    .line 497
    .line 498
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 499
    .line 500
    return-object p1

    .line 501
    :pswitch_a
    const/16 v0, 0x10

    .line 502
    .line 503
    const/4 v1, 0x1

    .line 504
    if-eq p1, v0, :cond_16

    .line 505
    .line 506
    move p1, v1

    .line 507
    goto :goto_16

    .line 508
    :cond_16
    const/4 p1, 0x0

    .line 509
    :goto_16
    and-int/2addr p3, v1

    .line 510
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 511
    .line 512
    .line 513
    move-result p1

    .line 514
    if-eqz p1, :cond_17

    .line 515
    .line 516
    new-instance p1, Lwb/l8;

    .line 517
    .line 518
    const/16 p3, 0x19

    .line 519
    .line 520
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 521
    .line 522
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 523
    .line 524
    .line 525
    const p3, -0x7d5d63f1

    .line 526
    .line 527
    .line 528
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    const/16 p3, 0x30

    .line 533
    .line 534
    const/4 v0, 0x0

    .line 535
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 536
    .line 537
    .line 538
    goto :goto_17

    .line 539
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 540
    .line 541
    .line 542
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 543
    .line 544
    return-object p1

    .line 545
    :pswitch_b
    const/16 v0, 0x10

    .line 546
    .line 547
    const/4 v1, 0x1

    .line 548
    if-eq p1, v0, :cond_18

    .line 549
    .line 550
    move p1, v1

    .line 551
    goto :goto_18

    .line 552
    :cond_18
    const/4 p1, 0x0

    .line 553
    :goto_18
    and-int/2addr p3, v1

    .line 554
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 555
    .line 556
    .line 557
    move-result p1

    .line 558
    if-eqz p1, :cond_19

    .line 559
    .line 560
    new-instance p1, Lwb/l8;

    .line 561
    .line 562
    const/16 p3, 0x15

    .line 563
    .line 564
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 565
    .line 566
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 567
    .line 568
    .line 569
    const p3, 0x183ef4b

    .line 570
    .line 571
    .line 572
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    const/16 p3, 0x30

    .line 577
    .line 578
    const/4 v0, 0x0

    .line 579
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 580
    .line 581
    .line 582
    goto :goto_19

    .line 583
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 584
    .line 585
    .line 586
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 587
    .line 588
    return-object p1

    .line 589
    :pswitch_c
    const/16 v0, 0x10

    .line 590
    .line 591
    const/4 v1, 0x1

    .line 592
    if-eq p1, v0, :cond_1a

    .line 593
    .line 594
    move p1, v1

    .line 595
    goto :goto_1a

    .line 596
    :cond_1a
    const/4 p1, 0x0

    .line 597
    :goto_1a
    and-int/2addr p3, v1

    .line 598
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 599
    .line 600
    .line 601
    move-result p1

    .line 602
    if-eqz p1, :cond_1b

    .line 603
    .line 604
    new-instance p1, Lwb/l8;

    .line 605
    .line 606
    const/16 p3, 0x12

    .line 607
    .line 608
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 609
    .line 610
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 611
    .line 612
    .line 613
    const p3, 0x4905dc86    # 548296.4f

    .line 614
    .line 615
    .line 616
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    const/16 p3, 0x30

    .line 621
    .line 622
    const/4 v0, 0x0

    .line 623
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 624
    .line 625
    .line 626
    goto :goto_1b

    .line 627
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 628
    .line 629
    .line 630
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 631
    .line 632
    return-object p1

    .line 633
    :pswitch_d
    const/16 v0, 0x10

    .line 634
    .line 635
    const/4 v1, 0x1

    .line 636
    if-eq p1, v0, :cond_1c

    .line 637
    .line 638
    move p1, v1

    .line 639
    goto :goto_1c

    .line 640
    :cond_1c
    const/4 p1, 0x0

    .line 641
    :goto_1c
    and-int/2addr p3, v1

    .line 642
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 643
    .line 644
    .line 645
    move-result p1

    .line 646
    if-eqz p1, :cond_1d

    .line 647
    .line 648
    new-instance p1, Lwb/l8;

    .line 649
    .line 650
    const/16 p3, 0xe

    .line 651
    .line 652
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 653
    .line 654
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 655
    .line 656
    .line 657
    const p3, -0x2de2d189

    .line 658
    .line 659
    .line 660
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    const/16 p3, 0x30

    .line 665
    .line 666
    const/4 v0, 0x0

    .line 667
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 668
    .line 669
    .line 670
    goto :goto_1d

    .line 671
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 672
    .line 673
    .line 674
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 675
    .line 676
    return-object p1

    .line 677
    :pswitch_e
    const/16 v0, 0x10

    .line 678
    .line 679
    const/4 v1, 0x1

    .line 680
    if-eq p1, v0, :cond_1e

    .line 681
    .line 682
    move p1, v1

    .line 683
    goto :goto_1e

    .line 684
    :cond_1e
    const/4 p1, 0x0

    .line 685
    :goto_1e
    and-int/2addr p3, v1

    .line 686
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 687
    .line 688
    .line 689
    move-result p1

    .line 690
    if-eqz p1, :cond_1f

    .line 691
    .line 692
    new-instance p1, Lwb/l8;

    .line 693
    .line 694
    const/16 p3, 0x14

    .line 695
    .line 696
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 697
    .line 698
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 699
    .line 700
    .line 701
    const p3, -0x153d9cb4

    .line 702
    .line 703
    .line 704
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 705
    .line 706
    .line 707
    move-result-object p1

    .line 708
    const/16 p3, 0x30

    .line 709
    .line 710
    const/4 v0, 0x0

    .line 711
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 712
    .line 713
    .line 714
    goto :goto_1f

    .line 715
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 716
    .line 717
    .line 718
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 719
    .line 720
    return-object p1

    .line 721
    :pswitch_f
    const/16 v0, 0x10

    .line 722
    .line 723
    const/4 v1, 0x1

    .line 724
    if-eq p1, v0, :cond_20

    .line 725
    .line 726
    move p1, v1

    .line 727
    goto :goto_20

    .line 728
    :cond_20
    const/4 p1, 0x0

    .line 729
    :goto_20
    and-int/2addr p3, v1

    .line 730
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 731
    .line 732
    .line 733
    move-result p1

    .line 734
    if-eqz p1, :cond_21

    .line 735
    .line 736
    new-instance p1, Lwb/l8;

    .line 737
    .line 738
    const/4 p3, 0x7

    .line 739
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 740
    .line 741
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 742
    .line 743
    .line 744
    const p3, 0x6778e03c

    .line 745
    .line 746
    .line 747
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    const/16 p3, 0x30

    .line 752
    .line 753
    const/4 v0, 0x0

    .line 754
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 755
    .line 756
    .line 757
    goto :goto_21

    .line 758
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 759
    .line 760
    .line 761
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 762
    .line 763
    return-object p1

    .line 764
    :pswitch_10
    const/16 v0, 0x10

    .line 765
    .line 766
    const/4 v1, 0x1

    .line 767
    if-eq p1, v0, :cond_22

    .line 768
    .line 769
    move p1, v1

    .line 770
    goto :goto_22

    .line 771
    :cond_22
    const/4 p1, 0x0

    .line 772
    :goto_22
    and-int/2addr p3, v1

    .line 773
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 774
    .line 775
    .line 776
    move-result p1

    .line 777
    if-eqz p1, :cond_23

    .line 778
    .line 779
    new-instance p1, Lwb/sb;

    .line 780
    .line 781
    const/16 p3, 0x9

    .line 782
    .line 783
    const/4 v0, 0x0

    .line 784
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 785
    .line 786
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 787
    .line 788
    .line 789
    const p3, -0x6eb3f3d9

    .line 790
    .line 791
    .line 792
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 793
    .line 794
    .line 795
    move-result-object p1

    .line 796
    const/16 p3, 0x30

    .line 797
    .line 798
    const/4 v0, 0x0

    .line 799
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 800
    .line 801
    .line 802
    goto :goto_23

    .line 803
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 804
    .line 805
    .line 806
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 807
    .line 808
    return-object p1

    .line 809
    :pswitch_11
    const/16 v0, 0x10

    .line 810
    .line 811
    const/4 v1, 0x0

    .line 812
    const/4 v2, 0x1

    .line 813
    if-eq p1, v0, :cond_24

    .line 814
    .line 815
    move p1, v2

    .line 816
    goto :goto_24

    .line 817
    :cond_24
    move p1, v1

    .line 818
    :goto_24
    and-int/2addr p3, v2

    .line 819
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 820
    .line 821
    .line 822
    move-result p1

    .line 823
    if-eqz p1, :cond_25

    .line 824
    .line 825
    iget-object p1, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 826
    .line 827
    invoke-static {p1, p2, v1}, Lwb/ho;->L3(Landroid/content/SharedPreferences;Li0/h0;I)V

    .line 828
    .line 829
    .line 830
    goto :goto_25

    .line 831
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 832
    .line 833
    .line 834
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 835
    .line 836
    return-object p1

    .line 837
    :pswitch_12
    const/16 v0, 0x10

    .line 838
    .line 839
    const/4 v1, 0x1

    .line 840
    if-eq p1, v0, :cond_26

    .line 841
    .line 842
    move p1, v1

    .line 843
    goto :goto_26

    .line 844
    :cond_26
    const/4 p1, 0x0

    .line 845
    :goto_26
    and-int/2addr p3, v1

    .line 846
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 847
    .line 848
    .line 849
    move-result p1

    .line 850
    if-eqz p1, :cond_27

    .line 851
    .line 852
    new-instance p1, Lwb/sb;

    .line 853
    .line 854
    const/16 p3, 0x8

    .line 855
    .line 856
    const/4 v0, 0x0

    .line 857
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 858
    .line 859
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 860
    .line 861
    .line 862
    const p3, -0x48edf197

    .line 863
    .line 864
    .line 865
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 866
    .line 867
    .line 868
    move-result-object p1

    .line 869
    const/16 p3, 0x30

    .line 870
    .line 871
    const/4 v0, 0x0

    .line 872
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 873
    .line 874
    .line 875
    goto :goto_27

    .line 876
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 877
    .line 878
    .line 879
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 880
    .line 881
    return-object p1

    .line 882
    :pswitch_13
    const/16 v0, 0x10

    .line 883
    .line 884
    const/4 v1, 0x1

    .line 885
    if-eq p1, v0, :cond_28

    .line 886
    .line 887
    move p1, v1

    .line 888
    goto :goto_28

    .line 889
    :cond_28
    const/4 p1, 0x0

    .line 890
    :goto_28
    and-int/2addr p3, v1

    .line 891
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 892
    .line 893
    .line 894
    move-result p1

    .line 895
    if-eqz p1, :cond_29

    .line 896
    .line 897
    new-instance p1, Lwb/sb;

    .line 898
    .line 899
    const/4 p3, 0x5

    .line 900
    const/4 v0, 0x0

    .line 901
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 902
    .line 903
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 904
    .line 905
    .line 906
    const p3, -0x35a68e48    # -3562606.0f

    .line 907
    .line 908
    .line 909
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 910
    .line 911
    .line 912
    move-result-object p1

    .line 913
    const/16 p3, 0x30

    .line 914
    .line 915
    const/4 v0, 0x0

    .line 916
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 917
    .line 918
    .line 919
    goto :goto_29

    .line 920
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 921
    .line 922
    .line 923
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 924
    .line 925
    return-object p1

    .line 926
    :pswitch_14
    const/16 v0, 0x10

    .line 927
    .line 928
    const/4 v1, 0x1

    .line 929
    if-eq p1, v0, :cond_2a

    .line 930
    .line 931
    move p1, v1

    .line 932
    goto :goto_2a

    .line 933
    :cond_2a
    const/4 p1, 0x0

    .line 934
    :goto_2a
    and-int/2addr p3, v1

    .line 935
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 936
    .line 937
    .line 938
    move-result p1

    .line 939
    if-eqz p1, :cond_2b

    .line 940
    .line 941
    new-instance p1, Lwb/sb;

    .line 942
    .line 943
    const/4 p3, 0x6

    .line 944
    const/4 v0, 0x0

    .line 945
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 946
    .line 947
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 948
    .line 949
    .line 950
    const p3, -0x3a79664b

    .line 951
    .line 952
    .line 953
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 954
    .line 955
    .line 956
    move-result-object p1

    .line 957
    const/16 p3, 0x30

    .line 958
    .line 959
    const/4 v0, 0x0

    .line 960
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 961
    .line 962
    .line 963
    goto :goto_2b

    .line 964
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 965
    .line 966
    .line 967
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 968
    .line 969
    return-object p1

    .line 970
    :pswitch_15
    const/16 v0, 0x10

    .line 971
    .line 972
    const/4 v1, 0x1

    .line 973
    if-eq p1, v0, :cond_2c

    .line 974
    .line 975
    move p1, v1

    .line 976
    goto :goto_2c

    .line 977
    :cond_2c
    const/4 p1, 0x0

    .line 978
    :goto_2c
    and-int/2addr p3, v1

    .line 979
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 980
    .line 981
    .line 982
    move-result p1

    .line 983
    if-eqz p1, :cond_2d

    .line 984
    .line 985
    new-instance p1, Lwb/sb;

    .line 986
    .line 987
    const/4 p3, 0x7

    .line 988
    const/4 v0, 0x0

    .line 989
    iget-object v2, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 990
    .line 991
    invoke-direct {p1, v2, p3, v0}, Lwb/sb;-><init>(Landroid/content/SharedPreferences;IB)V

    .line 992
    .line 993
    .line 994
    const p3, -0x56175c89

    .line 995
    .line 996
    .line 997
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    const/16 p3, 0x30

    .line 1002
    .line 1003
    const/4 v0, 0x0

    .line 1004
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_2d

    .line 1008
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1009
    .line 1010
    .line 1011
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1012
    .line 1013
    return-object p1

    .line 1014
    :pswitch_16
    const/16 v0, 0x10

    .line 1015
    .line 1016
    const/4 v1, 0x1

    .line 1017
    if-eq p1, v0, :cond_2e

    .line 1018
    .line 1019
    move p1, v1

    .line 1020
    goto :goto_2e

    .line 1021
    :cond_2e
    const/4 p1, 0x0

    .line 1022
    :goto_2e
    and-int/2addr p3, v1

    .line 1023
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1024
    .line 1025
    .line 1026
    move-result p1

    .line 1027
    if-eqz p1, :cond_2f

    .line 1028
    .line 1029
    new-instance p1, Lwb/l8;

    .line 1030
    .line 1031
    const/4 p3, 0x5

    .line 1032
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1033
    .line 1034
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1035
    .line 1036
    .line 1037
    const p3, 0x34d04e7d

    .line 1038
    .line 1039
    .line 1040
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1041
    .line 1042
    .line 1043
    move-result-object p1

    .line 1044
    const/16 p3, 0x30

    .line 1045
    .line 1046
    const/4 v0, 0x0

    .line 1047
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_2f

    .line 1051
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1052
    .line 1053
    .line 1054
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1055
    .line 1056
    return-object p1

    .line 1057
    :pswitch_17
    const/16 v0, 0x10

    .line 1058
    .line 1059
    const/4 v1, 0x1

    .line 1060
    if-eq p1, v0, :cond_30

    .line 1061
    .line 1062
    move p1, v1

    .line 1063
    goto :goto_30

    .line 1064
    :cond_30
    const/4 p1, 0x0

    .line 1065
    :goto_30
    and-int/2addr p3, v1

    .line 1066
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1067
    .line 1068
    .line 1069
    move-result p1

    .line 1070
    if-eqz p1, :cond_31

    .line 1071
    .line 1072
    new-instance p1, Lwb/l8;

    .line 1073
    .line 1074
    const/4 p3, 0x4

    .line 1075
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1076
    .line 1077
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1078
    .line 1079
    .line 1080
    const p3, -0x66b1b674

    .line 1081
    .line 1082
    .line 1083
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1084
    .line 1085
    .line 1086
    move-result-object p1

    .line 1087
    const/16 p3, 0x30

    .line 1088
    .line 1089
    const/4 v0, 0x0

    .line 1090
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1091
    .line 1092
    .line 1093
    goto :goto_31

    .line 1094
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1095
    .line 1096
    .line 1097
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1098
    .line 1099
    return-object p1

    .line 1100
    :pswitch_18
    const/16 v0, 0x10

    .line 1101
    .line 1102
    const/4 v1, 0x1

    .line 1103
    if-eq p1, v0, :cond_32

    .line 1104
    .line 1105
    move p1, v1

    .line 1106
    goto :goto_32

    .line 1107
    :cond_32
    const/4 p1, 0x0

    .line 1108
    :goto_32
    and-int/2addr p3, v1

    .line 1109
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1110
    .line 1111
    .line 1112
    move-result p1

    .line 1113
    if-eqz p1, :cond_33

    .line 1114
    .line 1115
    new-instance p1, Lwb/l8;

    .line 1116
    .line 1117
    const/16 p3, 0x18

    .line 1118
    .line 1119
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1120
    .line 1121
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1122
    .line 1123
    .line 1124
    const p3, -0x6c8b7d8

    .line 1125
    .line 1126
    .line 1127
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1128
    .line 1129
    .line 1130
    move-result-object p1

    .line 1131
    const/16 p3, 0x30

    .line 1132
    .line 1133
    const/4 v0, 0x0

    .line 1134
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_33

    .line 1138
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1139
    .line 1140
    .line 1141
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1142
    .line 1143
    return-object p1

    .line 1144
    :pswitch_19
    const/16 v0, 0x10

    .line 1145
    .line 1146
    const/4 v1, 0x1

    .line 1147
    if-eq p1, v0, :cond_34

    .line 1148
    .line 1149
    move p1, v1

    .line 1150
    goto :goto_34

    .line 1151
    :cond_34
    const/4 p1, 0x0

    .line 1152
    :goto_34
    and-int/2addr p3, v1

    .line 1153
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1154
    .line 1155
    .line 1156
    move-result p1

    .line 1157
    if-eqz p1, :cond_35

    .line 1158
    .line 1159
    new-instance p1, Lwb/l8;

    .line 1160
    .line 1161
    const/16 p3, 0x17

    .line 1162
    .line 1163
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1164
    .line 1165
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1166
    .line 1167
    .line 1168
    const p3, -0x59480ef7

    .line 1169
    .line 1170
    .line 1171
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1172
    .line 1173
    .line 1174
    move-result-object p1

    .line 1175
    const/16 p3, 0x30

    .line 1176
    .line 1177
    const/4 v0, 0x0

    .line 1178
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_35

    .line 1182
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1183
    .line 1184
    .line 1185
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1186
    .line 1187
    return-object p1

    .line 1188
    :pswitch_1a
    const/16 v0, 0x10

    .line 1189
    .line 1190
    const/4 v1, 0x1

    .line 1191
    if-eq p1, v0, :cond_36

    .line 1192
    .line 1193
    move p1, v1

    .line 1194
    goto :goto_36

    .line 1195
    :cond_36
    const/4 p1, 0x0

    .line 1196
    :goto_36
    and-int/2addr p3, v1

    .line 1197
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1198
    .line 1199
    .line 1200
    move-result p1

    .line 1201
    if-eqz p1, :cond_37

    .line 1202
    .line 1203
    new-instance p1, Lwb/l8;

    .line 1204
    .line 1205
    const/16 p3, 0x8

    .line 1206
    .line 1207
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1208
    .line 1209
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1210
    .line 1211
    .line 1212
    const p3, 0x614f1dd8

    .line 1213
    .line 1214
    .line 1215
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1216
    .line 1217
    .line 1218
    move-result-object p1

    .line 1219
    const/16 p3, 0x30

    .line 1220
    .line 1221
    const/4 v0, 0x0

    .line 1222
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1223
    .line 1224
    .line 1225
    goto :goto_37

    .line 1226
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1227
    .line 1228
    .line 1229
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1230
    .line 1231
    return-object p1

    .line 1232
    :pswitch_1b
    const/16 v0, 0x10

    .line 1233
    .line 1234
    const/4 v1, 0x1

    .line 1235
    if-eq p1, v0, :cond_38

    .line 1236
    .line 1237
    move p1, v1

    .line 1238
    goto :goto_38

    .line 1239
    :cond_38
    const/4 p1, 0x0

    .line 1240
    :goto_38
    and-int/2addr p3, v1

    .line 1241
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1242
    .line 1243
    .line 1244
    move-result p1

    .line 1245
    if-eqz p1, :cond_39

    .line 1246
    .line 1247
    new-instance p1, Lwb/l8;

    .line 1248
    .line 1249
    const/16 p3, 0xd

    .line 1250
    .line 1251
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1252
    .line 1253
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1254
    .line 1255
    .line 1256
    const p3, 0x70315d4a

    .line 1257
    .line 1258
    .line 1259
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1260
    .line 1261
    .line 1262
    move-result-object p1

    .line 1263
    const/16 p3, 0x30

    .line 1264
    .line 1265
    const/4 v0, 0x0

    .line 1266
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1267
    .line 1268
    .line 1269
    goto :goto_39

    .line 1270
    :cond_39
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1271
    .line 1272
    .line 1273
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1274
    .line 1275
    return-object p1

    .line 1276
    :pswitch_1c
    const/16 v0, 0x10

    .line 1277
    .line 1278
    const/4 v1, 0x1

    .line 1279
    if-eq p1, v0, :cond_3a

    .line 1280
    .line 1281
    move p1, v1

    .line 1282
    goto :goto_3a

    .line 1283
    :cond_3a
    const/4 p1, 0x0

    .line 1284
    :goto_3a
    and-int/2addr p3, v1

    .line 1285
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1286
    .line 1287
    .line 1288
    move-result p1

    .line 1289
    if-eqz p1, :cond_3b

    .line 1290
    .line 1291
    new-instance p1, Lwb/l8;

    .line 1292
    .line 1293
    const/16 p3, 0x1d

    .line 1294
    .line 1295
    iget-object v0, p0, Lwb/r6;->h:Landroid/content/SharedPreferences;

    .line 1296
    .line 1297
    invoke-direct {p1, v0, p3}, Lwb/l8;-><init>(Landroid/content/SharedPreferences;I)V

    .line 1298
    .line 1299
    .line 1300
    const p3, 0x3b7fe235

    .line 1301
    .line 1302
    .line 1303
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1304
    .line 1305
    .line 1306
    move-result-object p1

    .line 1307
    const/16 p3, 0x30

    .line 1308
    .line 1309
    const/4 v0, 0x0

    .line 1310
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1311
    .line 1312
    .line 1313
    goto :goto_3b

    .line 1314
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1315
    .line 1316
    .line 1317
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1318
    .line 1319
    return-object p1

    .line 1320
    nop

    .line 1321
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
