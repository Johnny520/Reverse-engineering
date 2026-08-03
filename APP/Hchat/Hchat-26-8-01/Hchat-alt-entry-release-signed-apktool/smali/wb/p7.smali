.class public final synthetic Lwb/p7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/p7;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/p7;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/p7;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/p7;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/p7;->g:I

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
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const/16 p1, 0xa

    .line 37
    .line 38
    int-to-float v2, p1

    .line 39
    const/4 v4, 0x0

    .line 40
    const/16 v5, 0xd

    .line 41
    .line 42
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p3, p0, Lwb/p7;->h:Li0/a1;

    .line 51
    .line 52
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    check-cast p3, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    if-eqz p3, :cond_1

    .line 63
    .line 64
    iget-object p3, p0, Lwb/p7;->i:Li0/a1;

    .line 65
    .line 66
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    check-cast p3, Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    const-string p3, "-"

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object p3, p0, Lwb/p7;->j:Li0/a1;

    .line 82
    .line 83
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    check-cast p3, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v1, "\u5728\u7ebf\u63d2\u4ef6("

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p3, ")"

    .line 108
    .line 109
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    const/16 v0, 0x30

    .line 117
    .line 118
    const/16 v1, 0xc

    .line 119
    .line 120
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 125
    .line 126
    .line 127
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object p1

    .line 130
    :pswitch_0
    const/16 v0, 0x10

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    if-eq p1, v0, :cond_3

    .line 134
    .line 135
    move p1, v1

    .line 136
    goto :goto_3

    .line 137
    :cond_3
    const/4 p1, 0x0

    .line 138
    :goto_3
    and-int/2addr p3, v1

    .line 139
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    new-instance p1, Lwb/la;

    .line 146
    .line 147
    const/16 p3, 0x12

    .line 148
    .line 149
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 150
    .line 151
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 152
    .line 153
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 154
    .line 155
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 156
    .line 157
    .line 158
    const p3, -0x664f5fa6

    .line 159
    .line 160
    .line 161
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const/16 p3, 0x30

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_4
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 173
    .line 174
    .line 175
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 176
    .line 177
    return-object p1

    .line 178
    :pswitch_1
    const/16 v0, 0x10

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    if-eq p1, v0, :cond_5

    .line 182
    .line 183
    move p1, v1

    .line 184
    goto :goto_5

    .line 185
    :cond_5
    const/4 p1, 0x0

    .line 186
    :goto_5
    and-int/2addr p3, v1

    .line 187
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_6

    .line 192
    .line 193
    new-instance p1, Lwb/la;

    .line 194
    .line 195
    const/4 p3, 0x2

    .line 196
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 197
    .line 198
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 199
    .line 200
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 201
    .line 202
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 203
    .line 204
    .line 205
    const p3, -0x2abaf336

    .line 206
    .line 207
    .line 208
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    const/16 p3, 0x30

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 216
    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_6
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 220
    .line 221
    .line 222
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 223
    .line 224
    return-object p1

    .line 225
    :pswitch_2
    const/16 v0, 0x10

    .line 226
    .line 227
    const/4 v1, 0x1

    .line 228
    if-eq p1, v0, :cond_7

    .line 229
    .line 230
    move p1, v1

    .line 231
    goto :goto_7

    .line 232
    :cond_7
    const/4 p1, 0x0

    .line 233
    :goto_7
    and-int/2addr p3, v1

    .line 234
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_8

    .line 239
    .line 240
    new-instance p1, Lwb/la;

    .line 241
    .line 242
    const/4 p3, 0x0

    .line 243
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 244
    .line 245
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 246
    .line 247
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 248
    .line 249
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 250
    .line 251
    .line 252
    const p3, 0x62ecad23

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
    goto :goto_8

    .line 266
    :cond_8
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 267
    .line 268
    .line 269
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    return-object p1

    .line 272
    :pswitch_3
    const/16 v0, 0x10

    .line 273
    .line 274
    const/4 v1, 0x1

    .line 275
    if-eq p1, v0, :cond_9

    .line 276
    .line 277
    move p1, v1

    .line 278
    goto :goto_9

    .line 279
    :cond_9
    const/4 p1, 0x0

    .line 280
    :goto_9
    and-int/2addr p3, v1

    .line 281
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-eqz p1, :cond_a

    .line 286
    .line 287
    new-instance p1, Lwb/la;

    .line 288
    .line 289
    const/16 p3, 0xb

    .line 290
    .line 291
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 292
    .line 293
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 294
    .line 295
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 296
    .line 297
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 298
    .line 299
    .line 300
    const p3, 0x58ae6cc4

    .line 301
    .line 302
    .line 303
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    const/16 p3, 0x30

    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 311
    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_a
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 315
    .line 316
    .line 317
    :goto_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 318
    .line 319
    return-object p1

    .line 320
    :pswitch_4
    const/16 v0, 0x10

    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    if-eq p1, v0, :cond_b

    .line 324
    .line 325
    move p1, v1

    .line 326
    goto :goto_b

    .line 327
    :cond_b
    const/4 p1, 0x0

    .line 328
    :goto_b
    and-int/2addr p3, v1

    .line 329
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-eqz p1, :cond_c

    .line 334
    .line 335
    new-instance p1, Lwb/la;

    .line 336
    .line 337
    const/16 p3, 0xc

    .line 338
    .line 339
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 340
    .line 341
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 342
    .line 343
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 344
    .line 345
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 346
    .line 347
    .line 348
    const p3, -0x9b59ab3

    .line 349
    .line 350
    .line 351
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    const/16 p3, 0x30

    .line 356
    .line 357
    const/4 v0, 0x0

    .line 358
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 359
    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_c
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 363
    .line 364
    .line 365
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 366
    .line 367
    return-object p1

    .line 368
    :pswitch_5
    const/16 v0, 0x10

    .line 369
    .line 370
    const/4 v1, 0x1

    .line 371
    if-eq p1, v0, :cond_d

    .line 372
    .line 373
    move p1, v1

    .line 374
    goto :goto_d

    .line 375
    :cond_d
    const/4 p1, 0x0

    .line 376
    :goto_d
    and-int/2addr p3, v1

    .line 377
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    if-eqz p1, :cond_e

    .line 382
    .line 383
    new-instance p1, Lwb/la;

    .line 384
    .line 385
    const/16 p3, 0x8

    .line 386
    .line 387
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 388
    .line 389
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 390
    .line 391
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 392
    .line 393
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 394
    .line 395
    .line 396
    const p3, 0x65435677

    .line 397
    .line 398
    .line 399
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    const/16 p3, 0x30

    .line 404
    .line 405
    const/4 v0, 0x0

    .line 406
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 407
    .line 408
    .line 409
    goto :goto_e

    .line 410
    :cond_e
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 411
    .line 412
    .line 413
    :goto_e
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 414
    .line 415
    return-object p1

    .line 416
    :pswitch_6
    const/16 v0, 0x10

    .line 417
    .line 418
    const/4 v1, 0x1

    .line 419
    if-eq p1, v0, :cond_f

    .line 420
    .line 421
    move p1, v1

    .line 422
    goto :goto_f

    .line 423
    :cond_f
    const/4 p1, 0x0

    .line 424
    :goto_f
    and-int/2addr p3, v1

    .line 425
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    if-eqz p1, :cond_10

    .line 430
    .line 431
    new-instance p1, Lwb/la;

    .line 432
    .line 433
    const/4 p3, 0x3

    .line 434
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 435
    .line 436
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 437
    .line 438
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 439
    .line 440
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 441
    .line 442
    .line 443
    const p3, 0x4772da39

    .line 444
    .line 445
    .line 446
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    const/16 p3, 0x30

    .line 451
    .line 452
    const/4 v0, 0x0

    .line 453
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 454
    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_10
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 458
    .line 459
    .line 460
    :goto_10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 461
    .line 462
    return-object p1

    .line 463
    :pswitch_7
    const/16 v0, 0x10

    .line 464
    .line 465
    const/4 v1, 0x1

    .line 466
    if-eq p1, v0, :cond_11

    .line 467
    .line 468
    move p1, v1

    .line 469
    goto :goto_11

    .line 470
    :cond_11
    const/4 p1, 0x0

    .line 471
    :goto_11
    and-int/2addr p3, v1

    .line 472
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    if-eqz p1, :cond_12

    .line 477
    .line 478
    new-instance p1, Lwb/la;

    .line 479
    .line 480
    const/16 p3, 0x9

    .line 481
    .line 482
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 483
    .line 484
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 485
    .line 486
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 487
    .line 488
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 489
    .line 490
    .line 491
    const p3, 0x29a25dfb

    .line 492
    .line 493
    .line 494
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    const/16 p3, 0x30

    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 502
    .line 503
    .line 504
    goto :goto_12

    .line 505
    :cond_12
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 506
    .line 507
    .line 508
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 509
    .line 510
    return-object p1

    .line 511
    :pswitch_8
    const/16 v0, 0x10

    .line 512
    .line 513
    const/4 v1, 0x1

    .line 514
    if-eq p1, v0, :cond_13

    .line 515
    .line 516
    move p1, v1

    .line 517
    goto :goto_13

    .line 518
    :cond_13
    const/4 p1, 0x0

    .line 519
    :goto_13
    and-int/2addr p3, v1

    .line 520
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 521
    .line 522
    .line 523
    move-result p1

    .line 524
    if-eqz p1, :cond_14

    .line 525
    .line 526
    new-instance p1, Lwb/la;

    .line 527
    .line 528
    const/4 p3, 0x6

    .line 529
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 530
    .line 531
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 532
    .line 533
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 534
    .line 535
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 536
    .line 537
    .line 538
    const p3, 0x2143403

    .line 539
    .line 540
    .line 541
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 542
    .line 543
    .line 544
    move-result-object p1

    .line 545
    const/16 p3, 0x30

    .line 546
    .line 547
    const/4 v0, 0x0

    .line 548
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 549
    .line 550
    .line 551
    goto :goto_14

    .line 552
    :cond_14
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 553
    .line 554
    .line 555
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 556
    .line 557
    return-object p1

    .line 558
    :pswitch_9
    const/16 v0, 0x10

    .line 559
    .line 560
    const/4 v1, 0x1

    .line 561
    if-eq p1, v0, :cond_15

    .line 562
    .line 563
    move p1, v1

    .line 564
    goto :goto_15

    .line 565
    :cond_15
    const/4 p1, 0x0

    .line 566
    :goto_15
    and-int/2addr p3, v1

    .line 567
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 568
    .line 569
    .line 570
    move-result p1

    .line 571
    if-eqz p1, :cond_16

    .line 572
    .line 573
    new-instance p1, Lwb/la;

    .line 574
    .line 575
    const/4 p3, 0x4

    .line 576
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 577
    .line 578
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 579
    .line 580
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 581
    .line 582
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 583
    .line 584
    .line 585
    const p3, 0x4303c77

    .line 586
    .line 587
    .line 588
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    const/16 p3, 0x30

    .line 593
    .line 594
    const/4 v0, 0x0

    .line 595
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 596
    .line 597
    .line 598
    goto :goto_16

    .line 599
    :cond_16
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 600
    .line 601
    .line 602
    :goto_16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 603
    .line 604
    return-object p1

    .line 605
    :pswitch_a
    const/16 v0, 0x10

    .line 606
    .line 607
    const/4 v1, 0x1

    .line 608
    if-eq p1, v0, :cond_17

    .line 609
    .line 610
    move p1, v1

    .line 611
    goto :goto_17

    .line 612
    :cond_17
    const/4 p1, 0x0

    .line 613
    :goto_17
    and-int/2addr p3, v1

    .line 614
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    if-eqz p1, :cond_18

    .line 619
    .line 620
    new-instance p1, Lwb/la;

    .line 621
    .line 622
    const/4 p3, 0x5

    .line 623
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 624
    .line 625
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 626
    .line 627
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 628
    .line 629
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 630
    .line 631
    .line 632
    const p3, -0x6dbcc022

    .line 633
    .line 634
    .line 635
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    const/16 p3, 0x30

    .line 640
    .line 641
    const/4 v0, 0x0

    .line 642
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 643
    .line 644
    .line 645
    goto :goto_18

    .line 646
    :cond_18
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 647
    .line 648
    .line 649
    :goto_18
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 650
    .line 651
    return-object p1

    .line 652
    :pswitch_b
    const/16 v0, 0x10

    .line 653
    .line 654
    const/4 v1, 0x1

    .line 655
    if-eq p1, v0, :cond_19

    .line 656
    .line 657
    move p1, v1

    .line 658
    goto :goto_19

    .line 659
    :cond_19
    const/4 p1, 0x0

    .line 660
    :goto_19
    and-int/2addr p3, v1

    .line 661
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 662
    .line 663
    .line 664
    move-result p1

    .line 665
    if-eqz p1, :cond_1a

    .line 666
    .line 667
    new-instance p1, Lwb/la;

    .line 668
    .line 669
    const/4 p3, 0x7

    .line 670
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 671
    .line 672
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 673
    .line 674
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 675
    .line 676
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 677
    .line 678
    .line 679
    const p3, 0x2e399a15

    .line 680
    .line 681
    .line 682
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    const/16 p3, 0x30

    .line 687
    .line 688
    const/4 v0, 0x0

    .line 689
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 690
    .line 691
    .line 692
    goto :goto_1a

    .line 693
    :cond_1a
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 694
    .line 695
    .line 696
    :goto_1a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 697
    .line 698
    return-object p1

    .line 699
    :pswitch_c
    const/16 v0, 0x10

    .line 700
    .line 701
    const/4 v1, 0x1

    .line 702
    if-eq p1, v0, :cond_1b

    .line 703
    .line 704
    move p1, v1

    .line 705
    goto :goto_1b

    .line 706
    :cond_1b
    const/4 p1, 0x0

    .line 707
    :goto_1b
    and-int/2addr p3, v1

    .line 708
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 709
    .line 710
    .line 711
    move-result p1

    .line 712
    if-eqz p1, :cond_1c

    .line 713
    .line 714
    new-instance p1, Lwb/la;

    .line 715
    .line 716
    const/4 p3, 0x1

    .line 717
    iget-object v0, p0, Lwb/p7;->h:Li0/a1;

    .line 718
    .line 719
    iget-object v2, p0, Lwb/p7;->i:Li0/a1;

    .line 720
    .line 721
    iget-object v3, p0, Lwb/p7;->j:Li0/a1;

    .line 722
    .line 723
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/la;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 724
    .line 725
    .line 726
    const p3, 0x520675d8

    .line 727
    .line 728
    .line 729
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    const/16 p3, 0x30

    .line 734
    .line 735
    const/4 v0, 0x0

    .line 736
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 737
    .line 738
    .line 739
    goto :goto_1c

    .line 740
    :cond_1c
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 741
    .line 742
    .line 743
    :goto_1c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 744
    .line 745
    return-object p1

    .line 746
    nop

    .line 747
    :pswitch_data_0
    .packed-switch 0x0
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
