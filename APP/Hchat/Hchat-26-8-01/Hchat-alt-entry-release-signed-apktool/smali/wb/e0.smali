.class public final synthetic Lwb/e0;
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
    iput p1, p0, Lwb/e0;->g:I

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
    iget v0, p0, Lwb/e0;->g:I

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
    const/4 p1, 0x6

    .line 37
    const/16 p3, 0xe

    .line 38
    .line 39
    const-string v0, "\u5f53\u524d\u914d\u7f6e"

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 47
    .line 48
    .line 49
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    const/16 v0, 0x10

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-eq p1, v0, :cond_2

    .line 56
    .line 57
    move p1, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    :goto_2
    and-int/2addr p3, v1

    .line 61
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x6

    .line 68
    const/16 p3, 0xe

    .line 69
    .line 70
    const-string v0, "\u6a21\u677f"

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 78
    .line 79
    .line 80
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_1
    const/16 v0, 0x10

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    if-eq p1, v0, :cond_4

    .line 87
    .line 88
    move p1, v1

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    const/4 p1, 0x0

    .line 91
    :goto_4
    and-int/2addr p3, v1

    .line 92
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    const/16 p1, 0xa

    .line 99
    .line 100
    int-to-float v2, p1

    .line 101
    const/4 v4, 0x0

    .line 102
    const/16 v5, 0xd

    .line 103
    .line 104
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const/16 p3, 0x36

    .line 113
    .line 114
    const/16 v0, 0xc

    .line 115
    .line 116
    const-string v1, "\u64cd\u4f5c"

    .line 117
    .line 118
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 123
    .line 124
    .line 125
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 126
    .line 127
    return-object p1

    .line 128
    :pswitch_2
    const/16 v0, 0x10

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    if-eq p1, v0, :cond_6

    .line 132
    .line 133
    move p1, v1

    .line 134
    goto :goto_6

    .line 135
    :cond_6
    const/4 p1, 0x0

    .line 136
    :goto_6
    and-int/2addr p3, v1

    .line 137
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_7

    .line 142
    .line 143
    const/4 p1, 0x6

    .line 144
    const/16 p3, 0xe

    .line 145
    .line 146
    const-string v0, "\u52a0\u53f7\u83dc\u5355"

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 150
    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 154
    .line 155
    .line 156
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_3
    const/16 v0, 0x10

    .line 160
    .line 161
    const/4 v1, 0x1

    .line 162
    if-eq p1, v0, :cond_8

    .line 163
    .line 164
    move p1, v1

    .line 165
    goto :goto_8

    .line 166
    :cond_8
    const/4 p1, 0x0

    .line 167
    :goto_8
    and-int/2addr p3, v1

    .line 168
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_9

    .line 173
    .line 174
    const/16 p1, 0xa

    .line 175
    .line 176
    int-to-float v2, p1

    .line 177
    const/4 v4, 0x0

    .line 178
    const/16 v5, 0xd

    .line 179
    .line 180
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 181
    .line 182
    const/4 v1, 0x0

    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const/16 p3, 0x36

    .line 189
    .line 190
    const/16 v0, 0xc

    .line 191
    .line 192
    const-string v1, "\u5ef6\u8fdf"

    .line 193
    .line 194
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 195
    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 199
    .line 200
    .line 201
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_4
    const/16 v0, 0x10

    .line 205
    .line 206
    const/4 v1, 0x1

    .line 207
    if-eq p1, v0, :cond_a

    .line 208
    .line 209
    move p1, v1

    .line 210
    goto :goto_a

    .line 211
    :cond_a
    const/4 p1, 0x0

    .line 212
    :goto_a
    and-int/2addr p3, v1

    .line 213
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_b

    .line 218
    .line 219
    const/16 p1, 0xa

    .line 220
    .line 221
    int-to-float v2, p1

    .line 222
    const/4 v4, 0x0

    .line 223
    const/16 v5, 0xd

    .line 224
    .line 225
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    const/4 v3, 0x0

    .line 229
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const/16 p3, 0x36

    .line 234
    .line 235
    const/16 v0, 0xc

    .line 236
    .line 237
    const-string v1, "\u5a92\u4f53"

    .line 238
    .line 239
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const-string v1, "\u63d0\u793a\u6a21\u677f"

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
    const/16 p1, 0xa

    .line 310
    .line 311
    int-to-float v2, p1

    .line 312
    const/4 v4, 0x0

    .line 313
    const/16 v5, 0xd

    .line 314
    .line 315
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 316
    .line 317
    const/4 v1, 0x0

    .line 318
    const/4 v3, 0x0

    .line 319
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    const/16 p3, 0x36

    .line 324
    .line 325
    const/16 v0, 0xc

    .line 326
    .line 327
    const-string v1, "\u4e8b\u4ef6"

    .line 328
    .line 329
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const/4 p1, 0x6

    .line 355
    const/16 p3, 0xe

    .line 356
    .line 357
    const-string v0, "\u6a21\u677f"

    .line 358
    .line 359
    const/4 v1, 0x0

    .line 360
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 361
    .line 362
    .line 363
    goto :goto_11

    .line 364
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 365
    .line 366
    .line 367
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 368
    .line 369
    return-object p1

    .line 370
    :pswitch_8
    const/16 v0, 0x10

    .line 371
    .line 372
    const/4 v1, 0x1

    .line 373
    if-eq p1, v0, :cond_12

    .line 374
    .line 375
    move p1, v1

    .line 376
    goto :goto_12

    .line 377
    :cond_12
    const/4 p1, 0x0

    .line 378
    :goto_12
    and-int/2addr p3, v1

    .line 379
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-eqz p1, :cond_13

    .line 384
    .line 385
    const/16 p1, 0xa

    .line 386
    .line 387
    int-to-float v2, p1

    .line 388
    const/4 v4, 0x0

    .line 389
    const/16 v5, 0xd

    .line 390
    .line 391
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 392
    .line 393
    const/4 v1, 0x0

    .line 394
    const/4 v3, 0x0

    .line 395
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    const/16 p3, 0x36

    .line 400
    .line 401
    const/16 v0, 0xc

    .line 402
    .line 403
    const-string v1, "\u76d1\u542c\u7fa4"

    .line 404
    .line 405
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 406
    .line 407
    .line 408
    goto :goto_13

    .line 409
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 410
    .line 411
    .line 412
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 413
    .line 414
    return-object p1

    .line 415
    :pswitch_9
    const/16 v0, 0x10

    .line 416
    .line 417
    const/4 v1, 0x1

    .line 418
    if-eq p1, v0, :cond_14

    .line 419
    .line 420
    move p1, v1

    .line 421
    goto :goto_14

    .line 422
    :cond_14
    const/4 p1, 0x0

    .line 423
    :goto_14
    and-int/2addr p3, v1

    .line 424
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result p1

    .line 428
    if-eqz p1, :cond_15

    .line 429
    .line 430
    const/4 p1, 0x6

    .line 431
    const/16 p3, 0xe

    .line 432
    .line 433
    const-string v0, "\u6a21\u677f"

    .line 434
    .line 435
    const/4 v1, 0x0

    .line 436
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const/16 p1, 0xa

    .line 462
    .line 463
    int-to-float v2, p1

    .line 464
    const/4 v4, 0x0

    .line 465
    const/16 v5, 0xd

    .line 466
    .line 467
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 468
    .line 469
    const/4 v1, 0x0

    .line 470
    const/4 v3, 0x0

    .line 471
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    const/16 p3, 0x36

    .line 476
    .line 477
    const/16 v0, 0xc

    .line 478
    .line 479
    const-string v1, "\u8fd0\u884c\u72b6\u6001"

    .line 480
    .line 481
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const/4 p1, 0x6

    .line 507
    const/16 p3, 0xe

    .line 508
    .line 509
    const-string v0, "\u6a21\u677f"

    .line 510
    .line 511
    const/4 v1, 0x0

    .line 512
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

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
    const-string v1, "\u6a21\u677f"

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
    const-string v1, "\u7cbe\u7ec6\u5ef6\u8fdf"

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
    const-string v0, "\u4f1a\u8bdd\u5217\u8868"

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
    const/16 p1, 0xa

    .line 659
    .line 660
    int-to-float v2, p1

    .line 661
    const/4 v4, 0x0

    .line 662
    const/16 v5, 0xd

    .line 663
    .line 664
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 665
    .line 666
    const/4 v1, 0x0

    .line 667
    const/4 v3, 0x0

    .line 668
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    const/16 p3, 0x36

    .line 673
    .line 674
    const/16 v0, 0xc

    .line 675
    .line 676
    const-string v1, "\u5a92\u4f53"

    .line 677
    .line 678
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 679
    .line 680
    .line 681
    goto :goto_21

    .line 682
    :cond_21
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 683
    .line 684
    .line 685
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 686
    .line 687
    return-object p1

    .line 688
    :pswitch_10
    const/16 v0, 0x10

    .line 689
    .line 690
    const/4 v1, 0x1

    .line 691
    if-eq p1, v0, :cond_22

    .line 692
    .line 693
    move p1, v1

    .line 694
    goto :goto_22

    .line 695
    :cond_22
    const/4 p1, 0x0

    .line 696
    :goto_22
    and-int/2addr p3, v1

    .line 697
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 698
    .line 699
    .line 700
    move-result p1

    .line 701
    if-eqz p1, :cond_23

    .line 702
    .line 703
    const/16 p1, 0xa

    .line 704
    .line 705
    int-to-float v2, p1

    .line 706
    const/4 v4, 0x0

    .line 707
    const/16 v5, 0xd

    .line 708
    .line 709
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 710
    .line 711
    const/4 v1, 0x0

    .line 712
    const/4 v3, 0x0

    .line 713
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 714
    .line 715
    .line 716
    move-result-object p1

    .line 717
    const/16 p3, 0x36

    .line 718
    .line 719
    const/16 v0, 0xc

    .line 720
    .line 721
    const-string v1, "\u5361\u7247\u6a21\u677f"

    .line 722
    .line 723
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 724
    .line 725
    .line 726
    goto :goto_23

    .line 727
    :cond_23
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 728
    .line 729
    .line 730
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 731
    .line 732
    return-object p1

    .line 733
    :pswitch_11
    const/16 v0, 0x10

    .line 734
    .line 735
    const/4 v1, 0x1

    .line 736
    if-eq p1, v0, :cond_24

    .line 737
    .line 738
    move p1, v1

    .line 739
    goto :goto_24

    .line 740
    :cond_24
    const/4 p1, 0x0

    .line 741
    :goto_24
    and-int/2addr p3, v1

    .line 742
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 743
    .line 744
    .line 745
    move-result p1

    .line 746
    if-eqz p1, :cond_25

    .line 747
    .line 748
    const/16 p1, 0xa

    .line 749
    .line 750
    int-to-float v2, p1

    .line 751
    const/4 v4, 0x0

    .line 752
    const/16 v5, 0xd

    .line 753
    .line 754
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 755
    .line 756
    const/4 v1, 0x0

    .line 757
    const/4 v3, 0x0

    .line 758
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    const/16 p3, 0x36

    .line 763
    .line 764
    const/16 v0, 0xc

    .line 765
    .line 766
    const-string v1, "\u6587\u672c\u6a21\u677f"

    .line 767
    .line 768
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 769
    .line 770
    .line 771
    goto :goto_25

    .line 772
    :cond_25
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 773
    .line 774
    .line 775
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 776
    .line 777
    return-object p1

    .line 778
    :pswitch_12
    const/16 v0, 0x10

    .line 779
    .line 780
    const/4 v1, 0x1

    .line 781
    if-eq p1, v0, :cond_26

    .line 782
    .line 783
    move p1, v1

    .line 784
    goto :goto_26

    .line 785
    :cond_26
    const/4 p1, 0x0

    .line 786
    :goto_26
    and-int/2addr p3, v1

    .line 787
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 788
    .line 789
    .line 790
    move-result p1

    .line 791
    if-eqz p1, :cond_27

    .line 792
    .line 793
    const/16 p1, 0xa

    .line 794
    .line 795
    int-to-float v2, p1

    .line 796
    const/4 v4, 0x0

    .line 797
    const/16 v5, 0xd

    .line 798
    .line 799
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 800
    .line 801
    const/4 v1, 0x0

    .line 802
    const/4 v3, 0x0

    .line 803
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    const/16 p3, 0x36

    .line 808
    .line 809
    const/16 v0, 0xc

    .line 810
    .line 811
    const-string v1, "\u8fdb\u9000\u7fa4\u56de\u590d"

    .line 812
    .line 813
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 814
    .line 815
    .line 816
    goto :goto_27

    .line 817
    :cond_27
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 818
    .line 819
    .line 820
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 821
    .line 822
    return-object p1

    .line 823
    :pswitch_13
    const/16 v0, 0x10

    .line 824
    .line 825
    const/4 v1, 0x1

    .line 826
    if-eq p1, v0, :cond_28

    .line 827
    .line 828
    move p1, v1

    .line 829
    goto :goto_28

    .line 830
    :cond_28
    const/4 p1, 0x0

    .line 831
    :goto_28
    and-int/2addr p3, v1

    .line 832
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 833
    .line 834
    .line 835
    move-result p1

    .line 836
    if-eqz p1, :cond_29

    .line 837
    .line 838
    const/4 p1, 0x6

    .line 839
    const/16 p3, 0xe

    .line 840
    .line 841
    const-string v0, "\u7cfb\u7edf\u6d88\u606f"

    .line 842
    .line 843
    const/4 v1, 0x0

    .line 844
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 845
    .line 846
    .line 847
    goto :goto_29

    .line 848
    :cond_29
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 849
    .line 850
    .line 851
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 852
    .line 853
    return-object p1

    .line 854
    :pswitch_14
    const/16 v0, 0x10

    .line 855
    .line 856
    const/4 v1, 0x1

    .line 857
    if-eq p1, v0, :cond_2a

    .line 858
    .line 859
    move p1, v1

    .line 860
    goto :goto_2a

    .line 861
    :cond_2a
    const/4 p1, 0x0

    .line 862
    :goto_2a
    and-int/2addr p3, v1

    .line 863
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 864
    .line 865
    .line 866
    move-result p1

    .line 867
    if-eqz p1, :cond_2b

    .line 868
    .line 869
    const/16 p1, 0xa

    .line 870
    .line 871
    int-to-float v2, p1

    .line 872
    const/4 v4, 0x0

    .line 873
    const/16 v5, 0xd

    .line 874
    .line 875
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 876
    .line 877
    const/4 v1, 0x0

    .line 878
    const/4 v3, 0x0

    .line 879
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    const/16 p3, 0x36

    .line 884
    .line 885
    const/16 v0, 0xc

    .line 886
    .line 887
    const-string v1, "\u64cd\u4f5c"

    .line 888
    .line 889
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 890
    .line 891
    .line 892
    goto :goto_2b

    .line 893
    :cond_2b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 894
    .line 895
    .line 896
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 897
    .line 898
    return-object p1

    .line 899
    :pswitch_15
    const/16 v0, 0x10

    .line 900
    .line 901
    const/4 v1, 0x1

    .line 902
    if-eq p1, v0, :cond_2c

    .line 903
    .line 904
    move p1, v1

    .line 905
    goto :goto_2c

    .line 906
    :cond_2c
    const/4 p1, 0x0

    .line 907
    :goto_2c
    and-int/2addr p3, v1

    .line 908
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 909
    .line 910
    .line 911
    move-result p1

    .line 912
    if-eqz p1, :cond_2d

    .line 913
    .line 914
    const/16 p1, 0xa

    .line 915
    .line 916
    int-to-float v2, p1

    .line 917
    const/4 v4, 0x0

    .line 918
    const/16 v5, 0xd

    .line 919
    .line 920
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 921
    .line 922
    const/4 v1, 0x0

    .line 923
    const/4 v3, 0x0

    .line 924
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 925
    .line 926
    .line 927
    move-result-object p1

    .line 928
    const/16 p3, 0x36

    .line 929
    .line 930
    const/16 v0, 0xc

    .line 931
    .line 932
    const-string v1, "MCP\u6865\u63a5"

    .line 933
    .line 934
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 935
    .line 936
    .line 937
    goto :goto_2d

    .line 938
    :cond_2d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 939
    .line 940
    .line 941
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 942
    .line 943
    return-object p1

    .line 944
    :pswitch_16
    const/16 v0, 0x10

    .line 945
    .line 946
    const/4 v1, 0x1

    .line 947
    if-eq p1, v0, :cond_2e

    .line 948
    .line 949
    move p1, v1

    .line 950
    goto :goto_2e

    .line 951
    :cond_2e
    const/4 p1, 0x0

    .line 952
    :goto_2e
    and-int/2addr p3, v1

    .line 953
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 954
    .line 955
    .line 956
    move-result p1

    .line 957
    if-eqz p1, :cond_2f

    .line 958
    .line 959
    const/16 p1, 0xa

    .line 960
    .line 961
    int-to-float v2, p1

    .line 962
    const/4 v4, 0x0

    .line 963
    const/16 v5, 0xd

    .line 964
    .line 965
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 966
    .line 967
    const/4 v1, 0x0

    .line 968
    const/4 v3, 0x0

    .line 969
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 970
    .line 971
    .line 972
    move-result-object p1

    .line 973
    const/16 p3, 0x36

    .line 974
    .line 975
    const/16 v0, 0xc

    .line 976
    .line 977
    const-string v1, "\u5361\u7247\u6a21\u677f"

    .line 978
    .line 979
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 980
    .line 981
    .line 982
    goto :goto_2f

    .line 983
    :cond_2f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 984
    .line 985
    .line 986
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 987
    .line 988
    return-object p1

    .line 989
    :pswitch_17
    const/16 v0, 0x10

    .line 990
    .line 991
    const/4 v1, 0x1

    .line 992
    if-eq p1, v0, :cond_30

    .line 993
    .line 994
    move p1, v1

    .line 995
    goto :goto_30

    .line 996
    :cond_30
    const/4 p1, 0x0

    .line 997
    :goto_30
    and-int/2addr p3, v1

    .line 998
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 999
    .line 1000
    .line 1001
    move-result p1

    .line 1002
    if-eqz p1, :cond_31

    .line 1003
    .line 1004
    const/16 p1, 0xa

    .line 1005
    .line 1006
    int-to-float v2, p1

    .line 1007
    const/4 v4, 0x0

    .line 1008
    const/16 v5, 0xd

    .line 1009
    .line 1010
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1011
    .line 1012
    const/4 v1, 0x0

    .line 1013
    const/4 v3, 0x0

    .line 1014
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p1

    .line 1018
    const/16 p3, 0x36

    .line 1019
    .line 1020
    const/16 v0, 0xc

    .line 1021
    .line 1022
    const-string v1, "\u6587\u672c\u6a21\u677f"

    .line 1023
    .line 1024
    invoke-static {v1, p1, p2, p3, v0}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_31

    .line 1028
    :cond_31
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1029
    .line 1030
    .line 1031
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1032
    .line 1033
    return-object p1

    .line 1034
    :pswitch_18
    const/16 v0, 0x10

    .line 1035
    .line 1036
    const/4 v1, 0x1

    .line 1037
    if-eq p1, v0, :cond_32

    .line 1038
    .line 1039
    move p1, v1

    .line 1040
    goto :goto_32

    .line 1041
    :cond_32
    const/4 p1, 0x0

    .line 1042
    :goto_32
    and-int/2addr p3, v1

    .line 1043
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1044
    .line 1045
    .line 1046
    move-result p1

    .line 1047
    if-eqz p1, :cond_33

    .line 1048
    .line 1049
    const/4 p1, 0x6

    .line 1050
    const/16 p3, 0xe

    .line 1051
    .line 1052
    const-string v0, "\u63d0\u793a\u8bbe\u7f6e"

    .line 1053
    .line 1054
    const/4 v1, 0x0

    .line 1055
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_33

    .line 1059
    :cond_33
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1060
    .line 1061
    .line 1062
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1063
    .line 1064
    return-object p1

    .line 1065
    :pswitch_19
    const/16 v0, 0x10

    .line 1066
    .line 1067
    const/4 v1, 0x1

    .line 1068
    if-eq p1, v0, :cond_34

    .line 1069
    .line 1070
    move p1, v1

    .line 1071
    goto :goto_34

    .line 1072
    :cond_34
    const/4 p1, 0x0

    .line 1073
    :goto_34
    and-int/2addr p3, v1

    .line 1074
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1075
    .line 1076
    .line 1077
    move-result p1

    .line 1078
    if-eqz p1, :cond_35

    .line 1079
    .line 1080
    const/4 p1, 0x6

    .line 1081
    const/16 p3, 0xe

    .line 1082
    .line 1083
    const-string v0, "\u6a21\u677f"

    .line 1084
    .line 1085
    const/4 v1, 0x0

    .line 1086
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1087
    .line 1088
    .line 1089
    goto :goto_35

    .line 1090
    :cond_35
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1091
    .line 1092
    .line 1093
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1094
    .line 1095
    return-object p1

    .line 1096
    :pswitch_1a
    const/16 v0, 0x10

    .line 1097
    .line 1098
    const/4 v1, 0x1

    .line 1099
    if-eq p1, v0, :cond_36

    .line 1100
    .line 1101
    move p1, v1

    .line 1102
    goto :goto_36

    .line 1103
    :cond_36
    const/4 p1, 0x0

    .line 1104
    :goto_36
    and-int/2addr p3, v1

    .line 1105
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1106
    .line 1107
    .line 1108
    move-result p1

    .line 1109
    if-eqz p1, :cond_37

    .line 1110
    .line 1111
    const/4 p1, 0x6

    .line 1112
    const/16 p3, 0xe

    .line 1113
    .line 1114
    const-string v0, "\u804a\u5929\u8bb0\u5f55"

    .line 1115
    .line 1116
    const/4 v1, 0x0

    .line 1117
    invoke-static {v0, v1, p2, p1, p3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 1118
    .line 1119
    .line 1120
    goto :goto_37

    .line 1121
    :cond_37
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1122
    .line 1123
    .line 1124
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1125
    .line 1126
    return-object p1

    .line 1127
    :pswitch_1b
    const/16 v0, 0x10

    .line 1128
    .line 1129
    const/4 v1, 0x1

    .line 1130
    if-eq p1, v0, :cond_38

    .line 1131
    .line 1132
    move p1, v1

    .line 1133
    goto :goto_38

    .line 1134
    :cond_38
    const/4 p1, 0x0

    .line 1135
    :goto_38
    and-int/2addr p3, v1

    .line 1136
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 1137
    .line 1138
    .line 1139
    move-result p1

    .line 1140
    if-eqz p1, :cond_39

    .line 1141
    .line 1142
    sget-object p1, Lwb/p0;->E3:Ls0/d;

    .line 1143
    .line 1144
    const/16 p3, 0x30

    .line 1145
    .line 1146
    const/4 v0, 0x0

    .line 1147
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

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
    sget-object p1, Lwb/p0;->C3:Ls0/d;

    .line 1173
    .line 1174
    const/16 p3, 0x30

    .line 1175
    .line 1176
    const/4 v0, 0x0

    .line 1177
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 1178
    .line 1179
    .line 1180
    goto :goto_3b

    .line 1181
    :cond_3b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 1182
    .line 1183
    .line 1184
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1185
    .line 1186
    return-object p1

    .line 1187
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
