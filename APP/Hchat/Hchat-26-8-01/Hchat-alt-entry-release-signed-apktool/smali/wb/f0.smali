.class public final synthetic Lwb/f0;
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
    iput p1, p0, Lwb/f0;->g:I

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
    iget v0, p0, Lwb/f0;->g:I

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
    const-string v1, "\u8fc7\u6ee4\u89c4\u5219"

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
    const-string v1, "\u89c4\u5219\u7ba1\u7406"

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
    const/4 p1, 0x6

    .line 127
    const/16 p3, 0xe

    .line 128
    .line 129
    const-string v0, "\u6838\u5fc3\u529f\u80fd"

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 137
    .line 138
    .line 139
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 140
    .line 141
    return-object p1

    .line 142
    :pswitch_2
    const/16 v0, 0x10

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    if-eq p1, v0, :cond_6

    .line 146
    .line 147
    move p1, v1

    .line 148
    goto :goto_6

    .line 149
    :cond_6
    const/4 p1, 0x0

    .line 150
    :goto_6
    and-int/2addr p3, v1

    .line 151
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    const/4 p1, 0x6

    .line 158
    const/16 p3, 0xe

    .line 159
    .line 160
    const-string v0, "\u626b\u7801"

    .line 161
    .line 162
    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 164
    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 168
    .line 169
    .line 170
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 171
    .line 172
    return-object p1

    .line 173
    :pswitch_3
    const/16 v0, 0x10

    .line 174
    .line 175
    const/4 v1, 0x1

    .line 176
    if-eq p1, v0, :cond_8

    .line 177
    .line 178
    move p1, v1

    .line 179
    goto :goto_8

    .line 180
    :cond_8
    const/4 p1, 0x0

    .line 181
    :goto_8
    and-int/2addr p3, v1

    .line 182
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_9

    .line 187
    .line 188
    const/16 p1, 0xa

    .line 189
    .line 190
    int-to-float v2, p1

    .line 191
    const/4 v4, 0x0

    .line 192
    const/16 v5, 0xd

    .line 193
    .line 194
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 195
    .line 196
    const/4 v1, 0x0

    .line 197
    const/4 v3, 0x0

    .line 198
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    const/16 p3, 0x36

    .line 203
    .line 204
    const/16 v0, 0xc

    .line 205
    .line 206
    const-string v1, "\u64cd\u4f5c"

    .line 207
    .line 208
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const/16 p1, 0xa

    .line 234
    .line 235
    int-to-float v2, p1

    .line 236
    const/4 v4, 0x0

    .line 237
    const/16 v5, 0xd

    .line 238
    .line 239
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 240
    .line 241
    const/4 v1, 0x0

    .line 242
    const/4 v3, 0x0

    .line 243
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    const/16 p3, 0x36

    .line 248
    .line 249
    const/16 v0, 0xc

    .line 250
    .line 251
    const-string v1, "\u53d1\u9001\u8282\u594f"

    .line 252
    .line 253
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 254
    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 258
    .line 259
    .line 260
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 261
    .line 262
    return-object p1

    .line 263
    :pswitch_5
    const/16 v0, 0x10

    .line 264
    .line 265
    const/4 v1, 0x1

    .line 266
    if-eq p1, v0, :cond_c

    .line 267
    .line 268
    move p1, v1

    .line 269
    goto :goto_c

    .line 270
    :cond_c
    const/4 p1, 0x0

    .line 271
    :goto_c
    and-int/2addr p3, v1

    .line 272
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-eqz p1, :cond_d

    .line 277
    .line 278
    const/16 p1, 0xa

    .line 279
    .line 280
    int-to-float v2, p1

    .line 281
    const/4 v4, 0x0

    .line 282
    const/16 v5, 0xd

    .line 283
    .line 284
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 285
    .line 286
    const/4 v1, 0x0

    .line 287
    const/4 v3, 0x0

    .line 288
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    const/16 p3, 0x36

    .line 293
    .line 294
    const/16 v0, 0xc

    .line 295
    .line 296
    const-string v1, "\u6267\u884c\u8ba1\u5212"

    .line 297
    .line 298
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 299
    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 303
    .line 304
    .line 305
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 306
    .line 307
    return-object p1

    .line 308
    :pswitch_6
    const/16 v0, 0x10

    .line 309
    .line 310
    const/4 v1, 0x1

    .line 311
    if-eq p1, v0, :cond_e

    .line 312
    .line 313
    move p1, v1

    .line 314
    goto :goto_e

    .line 315
    :cond_e
    const/4 p1, 0x0

    .line 316
    :goto_e
    and-int/2addr p3, v1

    .line 317
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    if-eqz p1, :cond_f

    .line 322
    .line 323
    const/4 p1, 0x6

    .line 324
    const/16 p3, 0xe

    .line 325
    .line 326
    const-string v0, "\u4efb\u52a1\u76ee\u6807"

    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 330
    .line 331
    .line 332
    goto :goto_f

    .line 333
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 334
    .line 335
    .line 336
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 337
    .line 338
    return-object p1

    .line 339
    :pswitch_7
    const/16 v0, 0x10

    .line 340
    .line 341
    const/4 v1, 0x1

    .line 342
    if-eq p1, v0, :cond_10

    .line 343
    .line 344
    move p1, v1

    .line 345
    goto :goto_10

    .line 346
    :cond_10
    const/4 p1, 0x0

    .line 347
    :goto_10
    and-int/2addr p3, v1

    .line 348
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-eqz p1, :cond_11

    .line 353
    .line 354
    const/16 p1, 0xa

    .line 355
    .line 356
    int-to-float v2, p1

    .line 357
    const/4 v4, 0x0

    .line 358
    const/16 v5, 0xd

    .line 359
    .line 360
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 361
    .line 362
    const/4 v1, 0x0

    .line 363
    const/4 v3, 0x0

    .line 364
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    const/16 p3, 0x36

    .line 369
    .line 370
    const/16 v0, 0xc

    .line 371
    .line 372
    const-string v1, "\u56de\u590d"

    .line 373
    .line 374
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 375
    .line 376
    .line 377
    goto :goto_11

    .line 378
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 379
    .line 380
    .line 381
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 382
    .line 383
    return-object p1

    .line 384
    :pswitch_8
    const/16 v0, 0x10

    .line 385
    .line 386
    const/4 v1, 0x1

    .line 387
    if-eq p1, v0, :cond_12

    .line 388
    .line 389
    move p1, v1

    .line 390
    goto :goto_12

    .line 391
    :cond_12
    const/4 p1, 0x0

    .line 392
    :goto_12
    and-int/2addr p3, v1

    .line 393
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    if-eqz p1, :cond_13

    .line 398
    .line 399
    const/16 p1, 0xa

    .line 400
    .line 401
    int-to-float v2, p1

    .line 402
    const/4 v4, 0x0

    .line 403
    const/16 v5, 0xd

    .line 404
    .line 405
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 406
    .line 407
    const/4 v1, 0x0

    .line 408
    const/4 v3, 0x0

    .line 409
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    const/16 p3, 0x36

    .line 414
    .line 415
    const/16 v0, 0xc

    .line 416
    .line 417
    const-string v1, "\u6a21\u578b\u5de5\u5177"

    .line 418
    .line 419
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 420
    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 424
    .line 425
    .line 426
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 427
    .line 428
    return-object p1

    .line 429
    :pswitch_9
    const/16 v0, 0x10

    .line 430
    .line 431
    const/4 v1, 0x1

    .line 432
    if-eq p1, v0, :cond_14

    .line 433
    .line 434
    move p1, v1

    .line 435
    goto :goto_14

    .line 436
    :cond_14
    const/4 p1, 0x0

    .line 437
    :goto_14
    and-int/2addr p3, v1

    .line 438
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 439
    .line 440
    .line 441
    move-result p1

    .line 442
    if-eqz p1, :cond_15

    .line 443
    .line 444
    const/4 p1, 0x6

    .line 445
    const/16 p3, 0xe

    .line 446
    .line 447
    const-string v0, "\u804a\u5929\u6d88\u606f"

    .line 448
    .line 449
    const/4 v1, 0x0

    .line 450
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 451
    .line 452
    .line 453
    goto :goto_15

    .line 454
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 455
    .line 456
    .line 457
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 458
    .line 459
    return-object p1

    .line 460
    :pswitch_a
    const/16 v0, 0x10

    .line 461
    .line 462
    const/4 v1, 0x1

    .line 463
    if-eq p1, v0, :cond_16

    .line 464
    .line 465
    move p1, v1

    .line 466
    goto :goto_16

    .line 467
    :cond_16
    const/4 p1, 0x0

    .line 468
    :goto_16
    and-int/2addr p3, v1

    .line 469
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    if-eqz p1, :cond_17

    .line 474
    .line 475
    const/4 p1, 0x6

    .line 476
    const/16 p3, 0xe

    .line 477
    .line 478
    const-string v0, "\u5907\u6ce8"

    .line 479
    .line 480
    const/4 v1, 0x0

    .line 481
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 482
    .line 483
    .line 484
    goto :goto_17

    .line 485
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 486
    .line 487
    .line 488
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 489
    .line 490
    return-object p1

    .line 491
    :pswitch_b
    const/16 v0, 0x10

    .line 492
    .line 493
    const/4 v1, 0x1

    .line 494
    if-eq p1, v0, :cond_18

    .line 495
    .line 496
    move p1, v1

    .line 497
    goto :goto_18

    .line 498
    :cond_18
    const/4 p1, 0x0

    .line 499
    :goto_18
    and-int/2addr p3, v1

    .line 500
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    if-eqz p1, :cond_19

    .line 505
    .line 506
    sget-object p1, Lwb/p0;->r4:Ls0/d;

    .line 507
    .line 508
    const/16 p3, 0x30

    .line 509
    .line 510
    const/4 v0, 0x0

    .line 511
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 512
    .line 513
    .line 514
    goto :goto_19

    .line 515
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 516
    .line 517
    .line 518
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 519
    .line 520
    return-object p1

    .line 521
    :pswitch_c
    const/16 v0, 0x10

    .line 522
    .line 523
    const/4 v1, 0x1

    .line 524
    if-eq p1, v0, :cond_1a

    .line 525
    .line 526
    move p1, v1

    .line 527
    goto :goto_1a

    .line 528
    :cond_1a
    const/4 p1, 0x0

    .line 529
    :goto_1a
    and-int/2addr p3, v1

    .line 530
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    if-eqz p1, :cond_1b

    .line 535
    .line 536
    const/16 p1, 0xa

    .line 537
    .line 538
    int-to-float v2, p1

    .line 539
    const/4 v4, 0x0

    .line 540
    const/16 v5, 0xd

    .line 541
    .line 542
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 543
    .line 544
    const/4 v1, 0x0

    .line 545
    const/4 v3, 0x0

    .line 546
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    const/16 p3, 0x36

    .line 551
    .line 552
    const/16 v0, 0xc

    .line 553
    .line 554
    const-string v1, "\u4efb\u52a1\u5217\u8868"

    .line 555
    .line 556
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 557
    .line 558
    .line 559
    goto :goto_1b

    .line 560
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 561
    .line 562
    .line 563
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 564
    .line 565
    return-object p1

    .line 566
    :pswitch_d
    const/16 v0, 0x10

    .line 567
    .line 568
    const/4 v1, 0x1

    .line 569
    if-eq p1, v0, :cond_1c

    .line 570
    .line 571
    move p1, v1

    .line 572
    goto :goto_1c

    .line 573
    :cond_1c
    const/4 p1, 0x0

    .line 574
    :goto_1c
    and-int/2addr p3, v1

    .line 575
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 576
    .line 577
    .line 578
    move-result p1

    .line 579
    if-eqz p1, :cond_1d

    .line 580
    .line 581
    const/4 p1, 0x6

    .line 582
    const/16 p3, 0xe

    .line 583
    .line 584
    const-string v0, "\u53d1\u9001\u8ba1\u5212"

    .line 585
    .line 586
    const/4 v1, 0x0

    .line 587
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 588
    .line 589
    .line 590
    goto :goto_1d

    .line 591
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 592
    .line 593
    .line 594
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 595
    .line 596
    return-object p1

    .line 597
    :pswitch_e
    const/16 v0, 0x10

    .line 598
    .line 599
    const/4 v1, 0x1

    .line 600
    if-eq p1, v0, :cond_1e

    .line 601
    .line 602
    move p1, v1

    .line 603
    goto :goto_1e

    .line 604
    :cond_1e
    const/4 p1, 0x0

    .line 605
    :goto_1e
    and-int/2addr p3, v1

    .line 606
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 607
    .line 608
    .line 609
    move-result p1

    .line 610
    if-eqz p1, :cond_1f

    .line 611
    .line 612
    const/16 p1, 0xa

    .line 613
    .line 614
    int-to-float v2, p1

    .line 615
    const/4 v4, 0x0

    .line 616
    const/16 v5, 0xd

    .line 617
    .line 618
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 619
    .line 620
    const/4 v1, 0x0

    .line 621
    const/4 v3, 0x0

    .line 622
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    const/16 p3, 0x36

    .line 627
    .line 628
    const/16 v0, 0xc

    .line 629
    .line 630
    const-string v1, "\u72b6\u6001"

    .line 631
    .line 632
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 633
    .line 634
    .line 635
    goto :goto_1f

    .line 636
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 637
    .line 638
    .line 639
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 640
    .line 641
    return-object p1

    .line 642
    :pswitch_f
    const/16 v0, 0x10

    .line 643
    .line 644
    const/4 v1, 0x1

    .line 645
    if-eq p1, v0, :cond_20

    .line 646
    .line 647
    move p1, v1

    .line 648
    goto :goto_20

    .line 649
    :cond_20
    const/4 p1, 0x0

    .line 650
    :goto_20
    and-int/2addr p3, v1

    .line 651
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 652
    .line 653
    .line 654
    move-result p1

    .line 655
    if-eqz p1, :cond_21

    .line 656
    .line 657
    const/16 p1, 0xa

    .line 658
    .line 659
    int-to-float v2, p1

    .line 660
    const/4 v4, 0x0

    .line 661
    const/16 v5, 0xd

    .line 662
    .line 663
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 664
    .line 665
    const/4 v1, 0x0

    .line 666
    const/4 v3, 0x0

    .line 667
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    const/16 p3, 0x36

    .line 672
    .line 673
    const/16 v0, 0xc

    .line 674
    .line 675
    const-string v1, "\u53d1\u9001"

    .line 676
    .line 677
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 678
    .line 679
    .line 680
    goto :goto_21

    .line 681
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 682
    .line 683
    .line 684
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 685
    .line 686
    return-object p1

    .line 687
    :pswitch_10
    const/16 v0, 0x10

    .line 688
    .line 689
    const/4 v1, 0x1

    .line 690
    if-eq p1, v0, :cond_22

    .line 691
    .line 692
    move p1, v1

    .line 693
    goto :goto_22

    .line 694
    :cond_22
    const/4 p1, 0x0

    .line 695
    :goto_22
    and-int/2addr p3, v1

    .line 696
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 697
    .line 698
    .line 699
    move-result p1

    .line 700
    if-eqz p1, :cond_23

    .line 701
    .line 702
    const/16 p1, 0xa

    .line 703
    .line 704
    int-to-float v2, p1

    .line 705
    const/4 v4, 0x0

    .line 706
    const/16 v5, 0xd

    .line 707
    .line 708
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 709
    .line 710
    const/4 v1, 0x0

    .line 711
    const/4 v3, 0x0

    .line 712
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    const/16 p3, 0x36

    .line 717
    .line 718
    const/16 v0, 0xc

    .line 719
    .line 720
    const-string v1, "\u6587\u4ef6"

    .line 721
    .line 722
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 723
    .line 724
    .line 725
    goto :goto_23

    .line 726
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 727
    .line 728
    .line 729
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 730
    .line 731
    return-object p1

    .line 732
    :pswitch_11
    const/16 v0, 0x10

    .line 733
    .line 734
    const/4 v1, 0x1

    .line 735
    if-eq p1, v0, :cond_24

    .line 736
    .line 737
    move p1, v1

    .line 738
    goto :goto_24

    .line 739
    :cond_24
    const/4 p1, 0x0

    .line 740
    :goto_24
    and-int/2addr p3, v1

    .line 741
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 742
    .line 743
    .line 744
    move-result p1

    .line 745
    if-eqz p1, :cond_25

    .line 746
    .line 747
    const/4 p1, 0x6

    .line 748
    const/16 p3, 0xe

    .line 749
    .line 750
    const-string v0, "\u8f6c\u6362\u65b9\u5f0f"

    .line 751
    .line 752
    const/4 v1, 0x0

    .line 753
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 754
    .line 755
    .line 756
    goto :goto_25

    .line 757
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 758
    .line 759
    .line 760
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 761
    .line 762
    return-object p1

    .line 763
    :pswitch_12
    const/16 v0, 0x10

    .line 764
    .line 765
    const/4 v1, 0x1

    .line 766
    if-eq p1, v0, :cond_26

    .line 767
    .line 768
    move p1, v1

    .line 769
    goto :goto_26

    .line 770
    :cond_26
    const/4 p1, 0x0

    .line 771
    :goto_26
    and-int/2addr p3, v1

    .line 772
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 773
    .line 774
    .line 775
    move-result p1

    .line 776
    if-eqz p1, :cond_27

    .line 777
    .line 778
    const/16 p1, 0xa

    .line 779
    .line 780
    int-to-float v2, p1

    .line 781
    const/4 v4, 0x0

    .line 782
    const/16 v5, 0xd

    .line 783
    .line 784
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 785
    .line 786
    const/4 v1, 0x0

    .line 787
    const/4 v3, 0x0

    .line 788
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    const/16 p3, 0x36

    .line 793
    .line 794
    const/16 v0, 0xc

    .line 795
    .line 796
    const-string v1, "\u914d\u7f6e\u7ba1\u7406"

    .line 797
    .line 798
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 799
    .line 800
    .line 801
    goto :goto_27

    .line 802
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 803
    .line 804
    .line 805
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 806
    .line 807
    return-object p1

    .line 808
    :pswitch_13
    const/16 v0, 0x10

    .line 809
    .line 810
    const/4 v1, 0x1

    .line 811
    if-eq p1, v0, :cond_28

    .line 812
    .line 813
    move p1, v1

    .line 814
    goto :goto_28

    .line 815
    :cond_28
    const/4 p1, 0x0

    .line 816
    :goto_28
    and-int/2addr p3, v1

    .line 817
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 818
    .line 819
    .line 820
    move-result p1

    .line 821
    if-eqz p1, :cond_29

    .line 822
    .line 823
    const/16 p1, 0xa

    .line 824
    .line 825
    int-to-float v2, p1

    .line 826
    const/4 v4, 0x0

    .line 827
    const/16 v5, 0xd

    .line 828
    .line 829
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 830
    .line 831
    const/4 v1, 0x0

    .line 832
    const/4 v3, 0x0

    .line 833
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 834
    .line 835
    .line 836
    move-result-object p1

    .line 837
    const/16 p3, 0x36

    .line 838
    .line 839
    const/16 v0, 0xc

    .line 840
    .line 841
    const-string v1, "\u6536\u85cf\u8bed\u97f3"

    .line 842
    .line 843
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 844
    .line 845
    .line 846
    goto :goto_29

    .line 847
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 848
    .line 849
    .line 850
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 851
    .line 852
    return-object p1

    .line 853
    :pswitch_14
    const/16 v0, 0x10

    .line 854
    .line 855
    const/4 v1, 0x1

    .line 856
    if-eq p1, v0, :cond_2a

    .line 857
    .line 858
    move p1, v1

    .line 859
    goto :goto_2a

    .line 860
    :cond_2a
    const/4 p1, 0x0

    .line 861
    :goto_2a
    and-int/2addr p3, v1

    .line 862
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 863
    .line 864
    .line 865
    move-result p1

    .line 866
    if-eqz p1, :cond_2b

    .line 867
    .line 868
    const/4 p1, 0x6

    .line 869
    const/16 p3, 0xe

    .line 870
    .line 871
    const-string v0, "\u8f93\u5165\u72b6\u6001"

    .line 872
    .line 873
    const/4 v1, 0x0

    .line 874
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 875
    .line 876
    .line 877
    goto :goto_2b

    .line 878
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 879
    .line 880
    .line 881
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 882
    .line 883
    return-object p1

    .line 884
    :pswitch_15
    const/16 v0, 0x10

    .line 885
    .line 886
    const/4 v1, 0x1

    .line 887
    if-eq p1, v0, :cond_2c

    .line 888
    .line 889
    move p1, v1

    .line 890
    goto :goto_2c

    .line 891
    :cond_2c
    const/4 p1, 0x0

    .line 892
    :goto_2c
    and-int/2addr p3, v1

    .line 893
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 894
    .line 895
    .line 896
    move-result p1

    .line 897
    if-eqz p1, :cond_2d

    .line 898
    .line 899
    const/4 p1, 0x6

    .line 900
    const/16 p3, 0xe

    .line 901
    .line 902
    const-string v0, "\u804a\u5929\u8bed\u97f3"

    .line 903
    .line 904
    const/4 v1, 0x0

    .line 905
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 906
    .line 907
    .line 908
    goto :goto_2d

    .line 909
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 910
    .line 911
    .line 912
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 913
    .line 914
    return-object p1

    .line 915
    :pswitch_16
    const/16 v0, 0x10

    .line 916
    .line 917
    const/4 v1, 0x1

    .line 918
    if-eq p1, v0, :cond_2e

    .line 919
    .line 920
    move p1, v1

    .line 921
    goto :goto_2e

    .line 922
    :cond_2e
    const/4 p1, 0x0

    .line 923
    :goto_2e
    and-int/2addr p3, v1

    .line 924
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 925
    .line 926
    .line 927
    move-result p1

    .line 928
    if-eqz p1, :cond_2f

    .line 929
    .line 930
    const/4 p1, 0x6

    .line 931
    const/16 p3, 0xe

    .line 932
    .line 933
    const-string v0, "\u6587\u672c\u8f6c\u8bed\u97f3"

    .line 934
    .line 935
    const/4 v1, 0x0

    .line 936
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 937
    .line 938
    .line 939
    goto :goto_2f

    .line 940
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 941
    .line 942
    .line 943
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 944
    .line 945
    return-object p1

    .line 946
    :pswitch_17
    const/16 v0, 0x10

    .line 947
    .line 948
    const/4 v1, 0x1

    .line 949
    if-eq p1, v0, :cond_30

    .line 950
    .line 951
    move p1, v1

    .line 952
    goto :goto_30

    .line 953
    :cond_30
    const/4 p1, 0x0

    .line 954
    :goto_30
    and-int/2addr p3, v1

    .line 955
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 956
    .line 957
    .line 958
    move-result p1

    .line 959
    if-eqz p1, :cond_31

    .line 960
    .line 961
    const/16 p1, 0xa

    .line 962
    .line 963
    int-to-float v2, p1

    .line 964
    const/4 v4, 0x0

    .line 965
    const/16 v5, 0xd

    .line 966
    .line 967
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 968
    .line 969
    const/4 v1, 0x0

    .line 970
    const/4 v3, 0x0

    .line 971
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 972
    .line 973
    .line 974
    move-result-object p1

    .line 975
    const/16 p3, 0x36

    .line 976
    .line 977
    const/16 v0, 0xc

    .line 978
    .line 979
    const-string v1, "\u64cd\u4f5c"

    .line 980
    .line 981
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 982
    .line 983
    .line 984
    goto :goto_31

    .line 985
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 986
    .line 987
    .line 988
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 989
    .line 990
    return-object p1

    .line 991
    :pswitch_18
    const/16 v0, 0x10

    .line 992
    .line 993
    const/4 v1, 0x1

    .line 994
    if-eq p1, v0, :cond_32

    .line 995
    .line 996
    move p1, v1

    .line 997
    goto :goto_32

    .line 998
    :cond_32
    const/4 p1, 0x0

    .line 999
    :goto_32
    and-int/2addr p3, v1

    .line 1000
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1001
    .line 1002
    .line 1003
    move-result p1

    .line 1004
    if-eqz p1, :cond_33

    .line 1005
    .line 1006
    const/16 p1, 0xa

    .line 1007
    .line 1008
    int-to-float v2, p1

    .line 1009
    const/4 v4, 0x0

    .line 1010
    const/16 v5, 0xd

    .line 1011
    .line 1012
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1013
    .line 1014
    const/4 v1, 0x0

    .line 1015
    const/4 v3, 0x0

    .line 1016
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1017
    .line 1018
    .line 1019
    move-result-object p1

    .line 1020
    const/16 p3, 0x36

    .line 1021
    .line 1022
    const/16 v0, 0xc

    .line 1023
    .line 1024
    const-string v1, "\u5ef6\u8fdf"

    .line 1025
    .line 1026
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_33

    .line 1030
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1031
    .line 1032
    .line 1033
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1034
    .line 1035
    return-object p1

    .line 1036
    :pswitch_19
    const/16 v0, 0x10

    .line 1037
    .line 1038
    const/4 v1, 0x1

    .line 1039
    if-eq p1, v0, :cond_34

    .line 1040
    .line 1041
    move p1, v1

    .line 1042
    goto :goto_34

    .line 1043
    :cond_34
    const/4 p1, 0x0

    .line 1044
    :goto_34
    and-int/2addr p3, v1

    .line 1045
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1046
    .line 1047
    .line 1048
    move-result p1

    .line 1049
    if-eqz p1, :cond_35

    .line 1050
    .line 1051
    const/16 p1, 0xa

    .line 1052
    .line 1053
    int-to-float v2, p1

    .line 1054
    const/4 v4, 0x0

    .line 1055
    const/16 v5, 0xd

    .line 1056
    .line 1057
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1058
    .line 1059
    const/4 v1, 0x0

    .line 1060
    const/4 v3, 0x0

    .line 1061
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1062
    .line 1063
    .line 1064
    move-result-object p1

    .line 1065
    const/16 p3, 0x36

    .line 1066
    .line 1067
    const/16 v0, 0xc

    .line 1068
    .line 1069
    const-string v1, "\u5a92\u4f53"

    .line 1070
    .line 1071
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1072
    .line 1073
    .line 1074
    goto :goto_35

    .line 1075
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1076
    .line 1077
    .line 1078
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1079
    .line 1080
    return-object p1

    .line 1081
    :pswitch_1a
    const/16 v0, 0x10

    .line 1082
    .line 1083
    const/4 v1, 0x1

    .line 1084
    if-eq p1, v0, :cond_36

    .line 1085
    .line 1086
    move p1, v1

    .line 1087
    goto :goto_36

    .line 1088
    :cond_36
    const/4 p1, 0x0

    .line 1089
    :goto_36
    and-int/2addr p3, v1

    .line 1090
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1091
    .line 1092
    .line 1093
    move-result p1

    .line 1094
    if-eqz p1, :cond_37

    .line 1095
    .line 1096
    const/16 p1, 0xa

    .line 1097
    .line 1098
    int-to-float v2, p1

    .line 1099
    const/4 v4, 0x0

    .line 1100
    const/16 v5, 0xd

    .line 1101
    .line 1102
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1103
    .line 1104
    const/4 v1, 0x0

    .line 1105
    const/4 v3, 0x0

    .line 1106
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1107
    .line 1108
    .line 1109
    move-result-object p1

    .line 1110
    const/16 p3, 0x36

    .line 1111
    .line 1112
    const/16 v0, 0xc

    .line 1113
    .line 1114
    const-string v1, "\u63d0\u793a\u6a21\u677f"

    .line 1115
    .line 1116
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_37

    .line 1120
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1121
    .line 1122
    .line 1123
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1124
    .line 1125
    return-object p1

    .line 1126
    :pswitch_1b
    const/16 v0, 0x10

    .line 1127
    .line 1128
    const/4 v1, 0x1

    .line 1129
    if-eq p1, v0, :cond_38

    .line 1130
    .line 1131
    move p1, v1

    .line 1132
    goto :goto_38

    .line 1133
    :cond_38
    const/4 p1, 0x0

    .line 1134
    :goto_38
    and-int/2addr p3, v1

    .line 1135
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1136
    .line 1137
    .line 1138
    move-result p1

    .line 1139
    if-eqz p1, :cond_39

    .line 1140
    .line 1141
    const/4 p1, 0x6

    .line 1142
    const/16 p3, 0xe

    .line 1143
    .line 1144
    const-string v0, "\u4e8b\u4ef6"

    .line 1145
    .line 1146
    const/4 v1, 0x0

    .line 1147
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1148
    .line 1149
    .line 1150
    goto :goto_39

    .line 1151
    :cond_39
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1152
    .line 1153
    .line 1154
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1155
    .line 1156
    return-object p1

    .line 1157
    :pswitch_1c
    const/16 v0, 0x10

    .line 1158
    .line 1159
    const/4 v1, 0x1

    .line 1160
    if-eq p1, v0, :cond_3a

    .line 1161
    .line 1162
    move p1, v1

    .line 1163
    goto :goto_3a

    .line 1164
    :cond_3a
    const/4 p1, 0x0

    .line 1165
    :goto_3a
    and-int/2addr p3, v1

    .line 1166
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1167
    .line 1168
    .line 1169
    move-result p1

    .line 1170
    if-eqz p1, :cond_3b

    .line 1171
    .line 1172
    const/16 p1, 0xa

    .line 1173
    .line 1174
    int-to-float v2, p1

    .line 1175
    const/4 v4, 0x0

    .line 1176
    const/16 v5, 0xd

    .line 1177
    .line 1178
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1179
    .line 1180
    const/4 v1, 0x0

    .line 1181
    const/4 v3, 0x0

    .line 1182
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1183
    .line 1184
    .line 1185
    move-result-object p1

    .line 1186
    const/16 p3, 0x36

    .line 1187
    .line 1188
    const/16 v0, 0xc

    .line 1189
    .line 1190
    const-string v1, "\u7fa4\u53f7"

    .line 1191
    .line 1192
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1193
    .line 1194
    .line 1195
    goto :goto_3b

    .line 1196
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1197
    .line 1198
    .line 1199
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1200
    .line 1201
    return-object p1

    .line 1202
    nop

    .line 1203
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
