.class public final synthetic Lwb/uf;
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
    iput p2, p0, Lwb/uf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/uf;->h:Li0/a1;

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
    .locals 10

    .line 1
    iget v0, p0, Lwb/uf;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Li0/h0;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit8 p1, p3, 0x11

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
    new-instance p1, Lwb/nh;

    .line 37
    .line 38
    const/16 p3, 0x10

    .line 39
    .line 40
    iget-object v0, p0, Lwb/uf;->h:Li0/a1;

    .line 41
    .line 42
    invoke-direct {p1, v0, p3}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 43
    .line 44
    .line 45
    const p3, -0x52612b71

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
    move-object v7, p2

    .line 66
    check-cast v7, Li0/h0;

    .line 67
    .line 68
    check-cast p3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    and-int/lit8 p1, p2, 0x11

    .line 78
    .line 79
    const/16 p3, 0x10

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    if-eq p1, p3, :cond_2

    .line 83
    .line 84
    move p1, v0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const/4 p1, 0x0

    .line 87
    :goto_2
    and-int/2addr p2, v0

    .line 88
    invoke-virtual {v7, p2, p1}, Li0/h0;->S(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    iget-object p1, p0, Lwb/uf;->h:Li0/a1;

    .line 95
    .line 96
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    move-object v0, p2

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    const/16 p2, 0xc

    .line 104
    .line 105
    int-to-float p2, p2

    .line 106
    const/4 p3, 0x0

    .line 107
    const/4 v1, 0x2

    .line 108
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 109
    .line 110
    invoke-static {v2, p2, p3, v1}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v7, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    if-nez p2, :cond_3

    .line 123
    .line 124
    sget-object p2, Li0/l;->a:Li0/e;

    .line 125
    .line 126
    if-ne p3, p2, :cond_4

    .line 127
    .line 128
    :cond_3
    new-instance p3, Lwb/gj;

    .line 129
    .line 130
    const/16 p2, 0x1c

    .line 131
    .line 132
    invoke-direct {p3, p1, p2}, Lwb/gj;-><init>(Li0/a1;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    move-object v6, p3

    .line 139
    check-cast v6, Lfg/l;

    .line 140
    .line 141
    const/16 v8, 0x1b0

    .line 142
    .line 143
    const/16 v9, 0x38

    .line 144
    .line 145
    const-string v1, "\u641c\u7d22\u63d2\u4ef6\u3001\u4f5c\u8005\u6216\u76ee\u5f55\u540d"

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-static/range {v0 .. v9}, Lwb/ho;->u3(Ljava/lang/String;Ljava/lang/String;Ly0/o;ZLd1/v;Lfg/a;Lfg/l;Li0/h0;II)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 155
    .line 156
    .line 157
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 158
    .line 159
    return-object p1

    .line 160
    :pswitch_1
    check-cast p2, Li0/h0;

    .line 161
    .line 162
    check-cast p3, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    and-int/lit8 p1, p3, 0x11

    .line 172
    .line 173
    const/16 v0, 0x10

    .line 174
    .line 175
    const/4 v1, 0x1

    .line 176
    if-eq p1, v0, :cond_6

    .line 177
    .line 178
    move p1, v1

    .line 179
    goto :goto_4

    .line 180
    :cond_6
    const/4 p1, 0x0

    .line 181
    :goto_4
    and-int/2addr p3, v1

    .line 182
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_7

    .line 187
    .line 188
    new-instance p1, Lwb/nh;

    .line 189
    .line 190
    const/4 p3, 0x0

    .line 191
    iget-object v0, p0, Lwb/uf;->h:Li0/a1;

    .line 192
    .line 193
    invoke-direct {p1, v0, p3}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 194
    .line 195
    .line 196
    const p3, -0x7fa61386

    .line 197
    .line 198
    .line 199
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const/16 p3, 0x30

    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 211
    .line 212
    .line 213
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 214
    .line 215
    return-object p1

    .line 216
    :pswitch_2
    check-cast p2, Li0/h0;

    .line 217
    .line 218
    check-cast p3, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result p3

    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    and-int/lit8 p1, p3, 0x11

    .line 228
    .line 229
    const/16 v0, 0x10

    .line 230
    .line 231
    const/4 v1, 0x1

    .line 232
    if-eq p1, v0, :cond_8

    .line 233
    .line 234
    move p1, v1

    .line 235
    goto :goto_6

    .line 236
    :cond_8
    const/4 p1, 0x0

    .line 237
    :goto_6
    and-int/2addr p3, v1

    .line 238
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_9

    .line 243
    .line 244
    new-instance p1, Lwb/nh;

    .line 245
    .line 246
    const/4 p3, 0x1

    .line 247
    iget-object v0, p0, Lwb/uf;->h:Li0/a1;

    .line 248
    .line 249
    invoke-direct {p1, v0, p3}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 250
    .line 251
    .line 252
    const p3, -0x2477a668

    .line 253
    .line 254
    .line 255
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    const/16 p3, 0x30

    .line 260
    .line 261
    const/4 v0, 0x0

    .line 262
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 267
    .line 268
    .line 269
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    return-object p1

    .line 272
    :pswitch_3
    check-cast p2, Li0/h0;

    .line 273
    .line 274
    check-cast p3, Ljava/lang/Integer;

    .line 275
    .line 276
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    and-int/lit8 p1, p3, 0x11

    .line 284
    .line 285
    const/16 v0, 0x10

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    if-eq p1, v0, :cond_a

    .line 289
    .line 290
    move p1, v1

    .line 291
    goto :goto_8

    .line 292
    :cond_a
    const/4 p1, 0x0

    .line 293
    :goto_8
    and-int/2addr p3, v1

    .line 294
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_b

    .line 299
    .line 300
    new-instance p1, Lwb/w1;

    .line 301
    .line 302
    const/16 p3, 0x1d

    .line 303
    .line 304
    iget-object v0, p0, Lwb/uf;->h:Li0/a1;

    .line 305
    .line 306
    invoke-direct {p1, v0, p3}, Lwb/w1;-><init>(Li0/a1;I)V

    .line 307
    .line 308
    .line 309
    const p3, 0x3c4f13df

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
    goto :goto_9

    .line 323
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 324
    .line 325
    .line 326
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 327
    .line 328
    return-object p1

    .line 329
    :pswitch_4
    check-cast p2, Li0/h0;

    .line 330
    .line 331
    check-cast p3, Ljava/lang/Integer;

    .line 332
    .line 333
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result p3

    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    and-int/lit8 p1, p3, 0x11

    .line 341
    .line 342
    const/16 v0, 0x10

    .line 343
    .line 344
    const/4 v1, 0x1

    .line 345
    if-eq p1, v0, :cond_c

    .line 346
    .line 347
    move p1, v1

    .line 348
    goto :goto_a

    .line 349
    :cond_c
    const/4 p1, 0x0

    .line 350
    :goto_a
    and-int/2addr p3, v1

    .line 351
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-eqz p1, :cond_d

    .line 356
    .line 357
    new-instance p1, Lwb/nh;

    .line 358
    .line 359
    const/4 p3, 0x2

    .line 360
    iget-object v0, p0, Lwb/uf;->h:Li0/a1;

    .line 361
    .line 362
    invoke-direct {p1, v0, p3}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 363
    .line 364
    .line 365
    const p3, -0x7ca9a923

    .line 366
    .line 367
    .line 368
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    const/16 p3, 0x30

    .line 373
    .line 374
    const/4 v0, 0x0

    .line 375
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 376
    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 380
    .line 381
    .line 382
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 383
    .line 384
    return-object p1

    .line 385
    :pswitch_5
    check-cast p2, Li0/h0;

    .line 386
    .line 387
    check-cast p3, Ljava/lang/Integer;

    .line 388
    .line 389
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result p3

    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    and-int/lit8 p1, p3, 0x11

    .line 397
    .line 398
    const/16 v0, 0x10

    .line 399
    .line 400
    const/4 v1, 0x0

    .line 401
    const/4 v2, 0x1

    .line 402
    if-eq p1, v0, :cond_e

    .line 403
    .line 404
    move p1, v2

    .line 405
    goto :goto_c

    .line 406
    :cond_e
    move p1, v1

    .line 407
    :goto_c
    and-int/2addr p3, v2

    .line 408
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 409
    .line 410
    .line 411
    move-result p1

    .line 412
    if-eqz p1, :cond_f

    .line 413
    .line 414
    const/16 p1, 0x8

    .line 415
    .line 416
    int-to-float v6, p1

    .line 417
    const/4 v7, 0x7

    .line 418
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 419
    .line 420
    const/4 v3, 0x0

    .line 421
    const/4 v4, 0x0

    .line 422
    const/4 v5, 0x0

    .line 423
    invoke-static/range {v2 .. v7}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    new-instance p3, Lwb/nh;

    .line 428
    .line 429
    const/4 v0, 0x3

    .line 430
    iget-object v2, p0, Lwb/uf;->h:Li0/a1;

    .line 431
    .line 432
    invoke-direct {p3, v2, v0}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 433
    .line 434
    .line 435
    const v0, 0x73a1d62

    .line 436
    .line 437
    .line 438
    invoke-static {v0, p3, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 439
    .line 440
    .line 441
    move-result-object p3

    .line 442
    const/16 v0, 0x36

    .line 443
    .line 444
    invoke-static {p1, p3, p2, v0, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 445
    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 449
    .line 450
    .line 451
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 452
    .line 453
    return-object p1

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
