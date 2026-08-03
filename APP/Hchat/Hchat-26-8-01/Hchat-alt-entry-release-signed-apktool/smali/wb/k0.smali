.class public final synthetic Lwb/k0;
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
    iput p1, p0, Lwb/k0;->g:I

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
    iget v0, p0, Lwb/k0;->g:I

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
    const/16 p3, 0x36

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    const-string v1, "\u7fa4\u7ec4"

    .line 55
    .line 56
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 61
    .line 62
    .line 63
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    const/16 v0, 0x10

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    if-eq p1, v0, :cond_2

    .line 70
    .line 71
    move p1, v1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    const/4 p1, 0x0

    .line 74
    :goto_2
    and-int/2addr p3, v1

    .line 75
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    const/16 p1, 0xa

    .line 82
    .line 83
    int-to-float v2, p1

    .line 84
    const/4 v4, 0x0

    .line 85
    const/16 v5, 0xd

    .line 86
    .line 87
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/16 p3, 0x36

    .line 96
    .line 97
    const/16 v0, 0xc

    .line 98
    .line 99
    const-string v1, "\u4e3b\u6309\u94ae\u56fe\u6807"

    .line 100
    .line 101
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 106
    .line 107
    .line 108
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_1
    const/16 v0, 0x10

    .line 112
    .line 113
    const/4 v1, 0x1

    .line 114
    if-eq p1, v0, :cond_4

    .line 115
    .line 116
    move p1, v1

    .line 117
    goto :goto_4

    .line 118
    :cond_4
    const/4 p1, 0x0

    .line 119
    :goto_4
    and-int/2addr p3, v1

    .line 120
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    const/16 p1, 0xa

    .line 127
    .line 128
    int-to-float v2, p1

    .line 129
    const/4 v4, 0x0

    .line 130
    const/16 v5, 0xd

    .line 131
    .line 132
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/16 p3, 0x36

    .line 141
    .line 142
    const/16 v0, 0xc

    .line 143
    .line 144
    const-string v1, "\u663e\u793a\u65b9\u5f0f"

    .line 145
    .line 146
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 151
    .line 152
    .line 153
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 154
    .line 155
    return-object p1

    .line 156
    :pswitch_2
    const/16 v0, 0x10

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    if-eq p1, v0, :cond_6

    .line 160
    .line 161
    move p1, v1

    .line 162
    goto :goto_6

    .line 163
    :cond_6
    const/4 p1, 0x0

    .line 164
    :goto_6
    and-int/2addr p3, v1

    .line 165
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    const/4 p1, 0x6

    .line 172
    const/16 p3, 0xe

    .line 173
    .line 174
    const-string v0, "\u60ac\u6d6e\u5165\u53e3"

    .line 175
    .line 176
    const/4 v1, 0x0

    .line 177
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 182
    .line 183
    .line 184
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_3
    const/16 v0, 0x10

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    if-eq p1, v0, :cond_8

    .line 191
    .line 192
    move p1, v1

    .line 193
    goto :goto_8

    .line 194
    :cond_8
    const/4 p1, 0x0

    .line 195
    :goto_8
    and-int/2addr p3, v1

    .line 196
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_9

    .line 201
    .line 202
    const/4 p1, 0x6

    .line 203
    const/16 p3, 0xe

    .line 204
    .line 205
    const-string v0, "\u52a0\u53f7\u83dc\u5355"

    .line 206
    .line 207
    const/4 v1, 0x0

    .line 208
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 209
    .line 210
    .line 211
    goto :goto_9

    .line 212
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 213
    .line 214
    .line 215
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 216
    .line 217
    return-object p1

    .line 218
    :pswitch_4
    const/16 v0, 0x10

    .line 219
    .line 220
    const/4 v1, 0x1

    .line 221
    if-eq p1, v0, :cond_a

    .line 222
    .line 223
    move p1, v1

    .line 224
    goto :goto_a

    .line 225
    :cond_a
    const/4 p1, 0x0

    .line 226
    :goto_a
    and-int/2addr p3, v1

    .line 227
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_b

    .line 232
    .line 233
    const/4 p1, 0x6

    .line 234
    const/16 p3, 0xe

    .line 235
    .line 236
    const-string v0, "\u5165\u53e3"

    .line 237
    .line 238
    const/4 v1, 0x0

    .line 239
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 240
    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 244
    .line 245
    .line 246
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 247
    .line 248
    return-object p1

    .line 249
    :pswitch_5
    const/16 v0, 0x10

    .line 250
    .line 251
    const/4 v1, 0x1

    .line 252
    if-eq p1, v0, :cond_c

    .line 253
    .line 254
    move p1, v1

    .line 255
    goto :goto_c

    .line 256
    :cond_c
    const/4 p1, 0x0

    .line 257
    :goto_c
    and-int/2addr p3, v1

    .line 258
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_d

    .line 263
    .line 264
    const/16 p1, 0xa

    .line 265
    .line 266
    int-to-float v2, p1

    .line 267
    const/4 v4, 0x0

    .line 268
    const/16 v5, 0xd

    .line 269
    .line 270
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    const/4 v3, 0x0

    .line 274
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    const/16 p3, 0x36

    .line 279
    .line 280
    const/16 v0, 0xc

    .line 281
    .line 282
    const-string v1, "\u64cd\u4f5c"

    .line 283
    .line 284
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 285
    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 289
    .line 290
    .line 291
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 292
    .line 293
    return-object p1

    .line 294
    :pswitch_6
    const/16 v0, 0x10

    .line 295
    .line 296
    const/4 v1, 0x1

    .line 297
    if-eq p1, v0, :cond_e

    .line 298
    .line 299
    move p1, v1

    .line 300
    goto :goto_e

    .line 301
    :cond_e
    const/4 p1, 0x0

    .line 302
    :goto_e
    and-int/2addr p3, v1

    .line 303
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_f

    .line 308
    .line 309
    const/4 p1, 0x6

    .line 310
    const/16 p3, 0xe

    .line 311
    .line 312
    const-string v0, "\u804a\u5929\u83dc\u5355"

    .line 313
    .line 314
    const/4 v1, 0x0

    .line 315
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 316
    .line 317
    .line 318
    goto :goto_f

    .line 319
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 320
    .line 321
    .line 322
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 323
    .line 324
    return-object p1

    .line 325
    :pswitch_7
    const/16 v0, 0x10

    .line 326
    .line 327
    const/4 v1, 0x1

    .line 328
    if-eq p1, v0, :cond_10

    .line 329
    .line 330
    move p1, v1

    .line 331
    goto :goto_10

    .line 332
    :cond_10
    const/4 p1, 0x0

    .line 333
    :goto_10
    and-int/2addr p3, v1

    .line 334
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-eqz p1, :cond_11

    .line 339
    .line 340
    const/4 p1, 0x6

    .line 341
    const/16 p3, 0xe

    .line 342
    .line 343
    const-string v0, "\u8d44\u6599\u9875"

    .line 344
    .line 345
    const/4 v1, 0x0

    .line 346
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 347
    .line 348
    .line 349
    goto :goto_11

    .line 350
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 351
    .line 352
    .line 353
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 354
    .line 355
    return-object p1

    .line 356
    :pswitch_8
    const/16 v0, 0x10

    .line 357
    .line 358
    const/4 v1, 0x1

    .line 359
    if-eq p1, v0, :cond_12

    .line 360
    .line 361
    move p1, v1

    .line 362
    goto :goto_12

    .line 363
    :cond_12
    const/4 p1, 0x0

    .line 364
    :goto_12
    and-int/2addr p3, v1

    .line 365
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-eqz p1, :cond_13

    .line 370
    .line 371
    const/16 p1, 0xa

    .line 372
    .line 373
    int-to-float v2, p1

    .line 374
    const/4 v4, 0x0

    .line 375
    const/16 v5, 0xd

    .line 376
    .line 377
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 378
    .line 379
    const/4 v1, 0x0

    .line 380
    const/4 v3, 0x0

    .line 381
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    const/16 p3, 0x36

    .line 386
    .line 387
    const/16 v0, 0xc

    .line 388
    .line 389
    const-string v1, "\u64cd\u4f5c"

    .line 390
    .line 391
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 392
    .line 393
    .line 394
    goto :goto_13

    .line 395
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 396
    .line 397
    .line 398
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 399
    .line 400
    return-object p1

    .line 401
    :pswitch_9
    const/16 v0, 0x10

    .line 402
    .line 403
    const/4 v1, 0x1

    .line 404
    if-eq p1, v0, :cond_14

    .line 405
    .line 406
    move p1, v1

    .line 407
    goto :goto_14

    .line 408
    :cond_14
    const/4 p1, 0x0

    .line 409
    :goto_14
    and-int/2addr p3, v1

    .line 410
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    if-eqz p1, :cond_15

    .line 415
    .line 416
    const/16 p1, 0xa

    .line 417
    .line 418
    int-to-float v2, p1

    .line 419
    const/4 v4, 0x0

    .line 420
    const/16 v5, 0xd

    .line 421
    .line 422
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 423
    .line 424
    const/4 v1, 0x0

    .line 425
    const/4 v3, 0x0

    .line 426
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    const/16 p3, 0x36

    .line 431
    .line 432
    const/16 v0, 0xc

    .line 433
    .line 434
    const-string v1, "\u5e03\u5c40"

    .line 435
    .line 436
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 437
    .line 438
    .line 439
    goto :goto_15

    .line 440
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 441
    .line 442
    .line 443
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 444
    .line 445
    return-object p1

    .line 446
    :pswitch_a
    const/16 v0, 0x10

    .line 447
    .line 448
    const/4 v1, 0x1

    .line 449
    if-eq p1, v0, :cond_16

    .line 450
    .line 451
    move p1, v1

    .line 452
    goto :goto_16

    .line 453
    :cond_16
    const/4 p1, 0x0

    .line 454
    :goto_16
    and-int/2addr p3, v1

    .line 455
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    if-eqz p1, :cond_17

    .line 460
    .line 461
    const/4 p1, 0x6

    .line 462
    const/16 p3, 0xe

    .line 463
    .line 464
    const-string v0, "\u5e94\u7528\u8303\u56f4"

    .line 465
    .line 466
    const/4 v1, 0x0

    .line 467
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 468
    .line 469
    .line 470
    goto :goto_17

    .line 471
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 472
    .line 473
    .line 474
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 475
    .line 476
    return-object p1

    .line 477
    :pswitch_b
    const/16 v0, 0x10

    .line 478
    .line 479
    const/4 v1, 0x1

    .line 480
    if-eq p1, v0, :cond_18

    .line 481
    .line 482
    move p1, v1

    .line 483
    goto :goto_18

    .line 484
    :cond_18
    const/4 p1, 0x0

    .line 485
    :goto_18
    and-int/2addr p3, v1

    .line 486
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-eqz p1, :cond_19

    .line 491
    .line 492
    const/16 p1, 0xa

    .line 493
    .line 494
    int-to-float v2, p1

    .line 495
    const/4 v4, 0x0

    .line 496
    const/16 v5, 0xd

    .line 497
    .line 498
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 499
    .line 500
    const/4 v1, 0x0

    .line 501
    const/4 v3, 0x0

    .line 502
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    const/16 p3, 0x36

    .line 507
    .line 508
    const/16 v0, 0xc

    .line 509
    .line 510
    const-string v1, "\u914d\u7f6e"

    .line 511
    .line 512
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 513
    .line 514
    .line 515
    goto :goto_19

    .line 516
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 517
    .line 518
    .line 519
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 520
    .line 521
    return-object p1

    .line 522
    :pswitch_c
    const/16 v0, 0x10

    .line 523
    .line 524
    const/4 v1, 0x1

    .line 525
    if-eq p1, v0, :cond_1a

    .line 526
    .line 527
    move p1, v1

    .line 528
    goto :goto_1a

    .line 529
    :cond_1a
    const/4 p1, 0x0

    .line 530
    :goto_1a
    and-int/2addr p3, v1

    .line 531
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 532
    .line 533
    .line 534
    move-result p1

    .line 535
    if-eqz p1, :cond_1b

    .line 536
    .line 537
    const/16 p1, 0xa

    .line 538
    .line 539
    int-to-float v2, p1

    .line 540
    const/4 v4, 0x0

    .line 541
    const/16 v5, 0xd

    .line 542
    .line 543
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 544
    .line 545
    const/4 v1, 0x0

    .line 546
    const/4 v3, 0x0

    .line 547
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    const/16 p3, 0x36

    .line 552
    .line 553
    const/16 v0, 0xc

    .line 554
    .line 555
    const-string v1, "\u6587\u672c"

    .line 556
    .line 557
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 558
    .line 559
    .line 560
    goto :goto_1b

    .line 561
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 562
    .line 563
    .line 564
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 565
    .line 566
    return-object p1

    .line 567
    :pswitch_d
    const/16 v0, 0x10

    .line 568
    .line 569
    const/4 v1, 0x1

    .line 570
    if-eq p1, v0, :cond_1c

    .line 571
    .line 572
    move p1, v1

    .line 573
    goto :goto_1c

    .line 574
    :cond_1c
    const/4 p1, 0x0

    .line 575
    :goto_1c
    and-int/2addr p3, v1

    .line 576
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 577
    .line 578
    .line 579
    move-result p1

    .line 580
    if-eqz p1, :cond_1d

    .line 581
    .line 582
    const/16 p1, 0xa

    .line 583
    .line 584
    int-to-float v2, p1

    .line 585
    const/4 v4, 0x0

    .line 586
    const/16 v5, 0xd

    .line 587
    .line 588
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 589
    .line 590
    const/4 v1, 0x0

    .line 591
    const/4 v3, 0x0

    .line 592
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    const/16 p3, 0x36

    .line 597
    .line 598
    const/16 v0, 0xc

    .line 599
    .line 600
    const-string v1, "\u989c\u8272"

    .line 601
    .line 602
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 603
    .line 604
    .line 605
    goto :goto_1d

    .line 606
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 607
    .line 608
    .line 609
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 610
    .line 611
    return-object p1

    .line 612
    :pswitch_e
    const/16 v0, 0x10

    .line 613
    .line 614
    const/4 v1, 0x1

    .line 615
    if-eq p1, v0, :cond_1e

    .line 616
    .line 617
    move p1, v1

    .line 618
    goto :goto_1e

    .line 619
    :cond_1e
    const/4 p1, 0x0

    .line 620
    :goto_1e
    and-int/2addr p3, v1

    .line 621
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 622
    .line 623
    .line 624
    move-result p1

    .line 625
    if-eqz p1, :cond_1f

    .line 626
    .line 627
    const/4 p1, 0x6

    .line 628
    const/16 p3, 0xe

    .line 629
    .line 630
    const-string v0, "\u57fa\u7840"

    .line 631
    .line 632
    const/4 v1, 0x0

    .line 633
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 634
    .line 635
    .line 636
    goto :goto_1f

    .line 637
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 638
    .line 639
    .line 640
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 641
    .line 642
    return-object p1

    .line 643
    :pswitch_f
    const/16 v0, 0x10

    .line 644
    .line 645
    const/4 v1, 0x1

    .line 646
    if-eq p1, v0, :cond_20

    .line 647
    .line 648
    move p1, v1

    .line 649
    goto :goto_20

    .line 650
    :cond_20
    const/4 p1, 0x0

    .line 651
    :goto_20
    and-int/2addr p3, v1

    .line 652
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 653
    .line 654
    .line 655
    move-result p1

    .line 656
    if-eqz p1, :cond_21

    .line 657
    .line 658
    const/4 p1, 0x6

    .line 659
    const/16 p3, 0xe

    .line 660
    .line 661
    const-string v0, "\u529f\u80fd\u5f00\u5173"

    .line 662
    .line 663
    const/4 v1, 0x0

    .line 664
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 665
    .line 666
    .line 667
    goto :goto_21

    .line 668
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 669
    .line 670
    .line 671
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 672
    .line 673
    return-object p1

    .line 674
    :pswitch_10
    const/16 v0, 0x10

    .line 675
    .line 676
    const/4 v1, 0x1

    .line 677
    if-eq p1, v0, :cond_22

    .line 678
    .line 679
    move p1, v1

    .line 680
    goto :goto_22

    .line 681
    :cond_22
    const/4 p1, 0x0

    .line 682
    :goto_22
    and-int/2addr p3, v1

    .line 683
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 684
    .line 685
    .line 686
    move-result p1

    .line 687
    if-eqz p1, :cond_23

    .line 688
    .line 689
    const/4 p1, 0x6

    .line 690
    const/16 p3, 0xe

    .line 691
    .line 692
    const-string v0, "\u89c6\u9891\u53f7"

    .line 693
    .line 694
    const/4 v1, 0x0

    .line 695
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 696
    .line 697
    .line 698
    goto :goto_23

    .line 699
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 700
    .line 701
    .line 702
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 703
    .line 704
    return-object p1

    .line 705
    :pswitch_11
    const/16 v0, 0x10

    .line 706
    .line 707
    const/4 v1, 0x1

    .line 708
    if-eq p1, v0, :cond_24

    .line 709
    .line 710
    move p1, v1

    .line 711
    goto :goto_24

    .line 712
    :cond_24
    const/4 p1, 0x0

    .line 713
    :goto_24
    and-int/2addr p3, v1

    .line 714
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 715
    .line 716
    .line 717
    move-result p1

    .line 718
    if-eqz p1, :cond_25

    .line 719
    .line 720
    const/4 p1, 0x6

    .line 721
    const/16 p3, 0xe

    .line 722
    .line 723
    const-string v0, "\u670b\u53cb\u5708"

    .line 724
    .line 725
    const/4 v1, 0x0

    .line 726
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 727
    .line 728
    .line 729
    goto :goto_25

    .line 730
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 731
    .line 732
    .line 733
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 734
    .line 735
    return-object p1

    .line 736
    :pswitch_12
    const/16 v0, 0x10

    .line 737
    .line 738
    const/4 v1, 0x1

    .line 739
    if-eq p1, v0, :cond_26

    .line 740
    .line 741
    move p1, v1

    .line 742
    goto :goto_26

    .line 743
    :cond_26
    const/4 p1, 0x0

    .line 744
    :goto_26
    and-int/2addr p3, v1

    .line 745
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 746
    .line 747
    .line 748
    move-result p1

    .line 749
    if-eqz p1, :cond_27

    .line 750
    .line 751
    const/16 p1, 0xa

    .line 752
    .line 753
    int-to-float v2, p1

    .line 754
    const/4 v4, 0x0

    .line 755
    const/16 v5, 0xd

    .line 756
    .line 757
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 758
    .line 759
    const/4 v1, 0x0

    .line 760
    const/4 v3, 0x0

    .line 761
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 762
    .line 763
    .line 764
    move-result-object p1

    .line 765
    const/16 p3, 0x36

    .line 766
    .line 767
    const/16 v0, 0xc

    .line 768
    .line 769
    const-string v1, "\u64cd\u4f5c"

    .line 770
    .line 771
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 772
    .line 773
    .line 774
    goto :goto_27

    .line 775
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 776
    .line 777
    .line 778
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 779
    .line 780
    return-object p1

    .line 781
    :pswitch_13
    const/16 v0, 0x10

    .line 782
    .line 783
    const/4 v1, 0x1

    .line 784
    if-eq p1, v0, :cond_28

    .line 785
    .line 786
    move p1, v1

    .line 787
    goto :goto_28

    .line 788
    :cond_28
    const/4 p1, 0x0

    .line 789
    :goto_28
    and-int/2addr p3, v1

    .line 790
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 791
    .line 792
    .line 793
    move-result p1

    .line 794
    if-eqz p1, :cond_29

    .line 795
    .line 796
    const/16 p1, 0xa

    .line 797
    .line 798
    int-to-float v2, p1

    .line 799
    const/4 v4, 0x0

    .line 800
    const/16 v5, 0xd

    .line 801
    .line 802
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 803
    .line 804
    const/4 v1, 0x0

    .line 805
    const/4 v3, 0x0

    .line 806
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 807
    .line 808
    .line 809
    move-result-object p1

    .line 810
    const/16 p3, 0x36

    .line 811
    .line 812
    const/16 v0, 0xc

    .line 813
    .line 814
    const-string v1, "\u957f\u6309\u83dc\u5355"

    .line 815
    .line 816
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 817
    .line 818
    .line 819
    goto :goto_29

    .line 820
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 821
    .line 822
    .line 823
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 824
    .line 825
    return-object p1

    .line 826
    :pswitch_14
    const/16 v0, 0x10

    .line 827
    .line 828
    const/4 v1, 0x1

    .line 829
    if-eq p1, v0, :cond_2a

    .line 830
    .line 831
    move p1, v1

    .line 832
    goto :goto_2a

    .line 833
    :cond_2a
    const/4 p1, 0x0

    .line 834
    :goto_2a
    and-int/2addr p3, v1

    .line 835
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 836
    .line 837
    .line 838
    move-result p1

    .line 839
    if-eqz p1, :cond_2b

    .line 840
    .line 841
    const/16 p1, 0xa

    .line 842
    .line 843
    int-to-float v2, p1

    .line 844
    const/4 v4, 0x0

    .line 845
    const/16 v5, 0xd

    .line 846
    .line 847
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 848
    .line 849
    const/4 v1, 0x0

    .line 850
    const/4 v3, 0x0

    .line 851
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 852
    .line 853
    .line 854
    move-result-object p1

    .line 855
    const/16 p3, 0x36

    .line 856
    .line 857
    const/16 v0, 0xc

    .line 858
    .line 859
    const-string v1, "\u8bc4\u8bba\u4eba\u8303\u56f4"

    .line 860
    .line 861
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 862
    .line 863
    .line 864
    goto :goto_2b

    .line 865
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 866
    .line 867
    .line 868
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 869
    .line 870
    return-object p1

    .line 871
    :pswitch_15
    const/16 v0, 0x10

    .line 872
    .line 873
    const/4 v1, 0x1

    .line 874
    if-eq p1, v0, :cond_2c

    .line 875
    .line 876
    move p1, v1

    .line 877
    goto :goto_2c

    .line 878
    :cond_2c
    const/4 p1, 0x0

    .line 879
    :goto_2c
    and-int/2addr p3, v1

    .line 880
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 881
    .line 882
    .line 883
    move-result p1

    .line 884
    if-eqz p1, :cond_2d

    .line 885
    .line 886
    const/4 p1, 0x6

    .line 887
    const/16 p3, 0xe

    .line 888
    .line 889
    const-string v0, "\u591a\u9009\u6d88\u606f"

    .line 890
    .line 891
    const/4 v1, 0x0

    .line 892
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 893
    .line 894
    .line 895
    goto :goto_2d

    .line 896
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 897
    .line 898
    .line 899
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 900
    .line 901
    return-object p1

    .line 902
    :pswitch_16
    const/16 v0, 0x10

    .line 903
    .line 904
    const/4 v1, 0x1

    .line 905
    if-eq p1, v0, :cond_2e

    .line 906
    .line 907
    move p1, v1

    .line 908
    goto :goto_2e

    .line 909
    :cond_2e
    const/4 p1, 0x0

    .line 910
    :goto_2e
    and-int/2addr p3, v1

    .line 911
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 912
    .line 913
    .line 914
    move-result p1

    .line 915
    if-eqz p1, :cond_2f

    .line 916
    .line 917
    const/16 p1, 0xa

    .line 918
    .line 919
    int-to-float v2, p1

    .line 920
    const/4 v4, 0x0

    .line 921
    const/16 v5, 0xd

    .line 922
    .line 923
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 924
    .line 925
    const/4 v1, 0x0

    .line 926
    const/4 v3, 0x0

    .line 927
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 928
    .line 929
    .line 930
    move-result-object p1

    .line 931
    const/16 p3, 0x36

    .line 932
    .line 933
    const/16 v0, 0xc

    .line 934
    .line 935
    const-string v1, "\u751f\u6210\u65b9\u5f0f"

    .line 936
    .line 937
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 938
    .line 939
    .line 940
    goto :goto_2f

    .line 941
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 942
    .line 943
    .line 944
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 945
    .line 946
    return-object p1

    .line 947
    :pswitch_17
    const/16 v0, 0x10

    .line 948
    .line 949
    const/4 v1, 0x0

    .line 950
    const/4 v2, 0x1

    .line 951
    if-eq p1, v0, :cond_30

    .line 952
    .line 953
    move p1, v2

    .line 954
    goto :goto_30

    .line 955
    :cond_30
    move p1, v1

    .line 956
    :goto_30
    and-int/2addr p3, v2

    .line 957
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 958
    .line 959
    .line 960
    move-result p1

    .line 961
    if-eqz p1, :cond_31

    .line 962
    .line 963
    invoke-static {p2, v1}, Lwb/ho;->a(Li0/h0;I)V

    .line 964
    .line 965
    .line 966
    goto :goto_31

    .line 967
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 968
    .line 969
    .line 970
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 971
    .line 972
    return-object p1

    .line 973
    :pswitch_18
    const/16 v0, 0x10

    .line 974
    .line 975
    const/4 v1, 0x1

    .line 976
    if-eq p1, v0, :cond_32

    .line 977
    .line 978
    move p1, v1

    .line 979
    goto :goto_32

    .line 980
    :cond_32
    const/4 p1, 0x0

    .line 981
    :goto_32
    and-int/2addr p3, v1

    .line 982
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 983
    .line 984
    .line 985
    move-result p1

    .line 986
    if-eqz p1, :cond_33

    .line 987
    .line 988
    const/4 p1, 0x6

    .line 989
    const/16 p3, 0xe

    .line 990
    .line 991
    const-string v0, "\u670b\u53cb\u5708"

    .line 992
    .line 993
    const/4 v1, 0x0

    .line 994
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 995
    .line 996
    .line 997
    goto :goto_33

    .line 998
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 999
    .line 1000
    .line 1001
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1002
    .line 1003
    return-object p1

    .line 1004
    :pswitch_19
    const/16 v0, 0x10

    .line 1005
    .line 1006
    const/4 v1, 0x1

    .line 1007
    if-eq p1, v0, :cond_34

    .line 1008
    .line 1009
    move p1, v1

    .line 1010
    goto :goto_34

    .line 1011
    :cond_34
    const/4 p1, 0x0

    .line 1012
    :goto_34
    and-int/2addr p3, v1

    .line 1013
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1014
    .line 1015
    .line 1016
    move-result p1

    .line 1017
    if-eqz p1, :cond_35

    .line 1018
    .line 1019
    const/4 p1, 0x6

    .line 1020
    const/16 p3, 0xe

    .line 1021
    .line 1022
    const-string v0, "\u670b\u53cb\u5708"

    .line 1023
    .line 1024
    const/4 v1, 0x0

    .line 1025
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1026
    .line 1027
    .line 1028
    goto :goto_35

    .line 1029
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1030
    .line 1031
    .line 1032
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1033
    .line 1034
    return-object p1

    .line 1035
    :pswitch_1a
    const/16 v0, 0x10

    .line 1036
    .line 1037
    const/4 v1, 0x1

    .line 1038
    if-eq p1, v0, :cond_36

    .line 1039
    .line 1040
    move p1, v1

    .line 1041
    goto :goto_36

    .line 1042
    :cond_36
    const/4 p1, 0x0

    .line 1043
    :goto_36
    and-int/2addr p3, v1

    .line 1044
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1045
    .line 1046
    .line 1047
    move-result p1

    .line 1048
    if-eqz p1, :cond_37

    .line 1049
    .line 1050
    const/4 p1, 0x6

    .line 1051
    const/16 p3, 0xe

    .line 1052
    .line 1053
    const-string v0, "\u670b\u53cb\u5708"

    .line 1054
    .line 1055
    const/4 v1, 0x0

    .line 1056
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1057
    .line 1058
    .line 1059
    goto :goto_37

    .line 1060
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1061
    .line 1062
    .line 1063
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1064
    .line 1065
    return-object p1

    .line 1066
    :pswitch_1b
    const/16 v0, 0x10

    .line 1067
    .line 1068
    const/4 v1, 0x1

    .line 1069
    if-eq p1, v0, :cond_38

    .line 1070
    .line 1071
    move p1, v1

    .line 1072
    goto :goto_38

    .line 1073
    :cond_38
    const/4 p1, 0x0

    .line 1074
    :goto_38
    and-int/2addr p3, v1

    .line 1075
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1076
    .line 1077
    .line 1078
    move-result p1

    .line 1079
    if-eqz p1, :cond_39

    .line 1080
    .line 1081
    const/16 p1, 0xa

    .line 1082
    .line 1083
    int-to-float v2, p1

    .line 1084
    const/4 v4, 0x0

    .line 1085
    const/16 v5, 0xd

    .line 1086
    .line 1087
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1088
    .line 1089
    const/4 v1, 0x0

    .line 1090
    const/4 v3, 0x0

    .line 1091
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p1

    .line 1095
    const/16 p3, 0x36

    .line 1096
    .line 1097
    const/16 v0, 0xc

    .line 1098
    .line 1099
    const-string v1, "\u63d0\u9192\u6a21\u677f"

    .line 1100
    .line 1101
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1102
    .line 1103
    .line 1104
    goto :goto_39

    .line 1105
    :cond_39
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1106
    .line 1107
    .line 1108
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1109
    .line 1110
    return-object p1

    .line 1111
    :pswitch_1c
    const/16 v0, 0x10

    .line 1112
    .line 1113
    const/4 v1, 0x1

    .line 1114
    if-eq p1, v0, :cond_3a

    .line 1115
    .line 1116
    move p1, v1

    .line 1117
    goto :goto_3a

    .line 1118
    :cond_3a
    const/4 p1, 0x0

    .line 1119
    :goto_3a
    and-int/2addr p3, v1

    .line 1120
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1121
    .line 1122
    .line 1123
    move-result p1

    .line 1124
    if-eqz p1, :cond_3b

    .line 1125
    .line 1126
    const/4 p1, 0x6

    .line 1127
    const/16 p3, 0xe

    .line 1128
    .line 1129
    const-string v0, "\u53d1\u5e03\u63d0\u9192"

    .line 1130
    .line 1131
    const/4 v1, 0x0

    .line 1132
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_3b

    .line 1136
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1137
    .line 1138
    .line 1139
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1140
    .line 1141
    return-object p1

    .line 1142
    nop

    .line 1143
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
