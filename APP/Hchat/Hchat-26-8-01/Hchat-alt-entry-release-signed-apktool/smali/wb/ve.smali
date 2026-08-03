.class public final synthetic Lwb/ve;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/ve;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ve;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ve;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwb/ve;->g:I

    iput-object p1, p0, Lwb/ve;->i:Ljava/util/List;

    iput-object p2, p0, Lwb/ve;->h:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/ve;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x2

    .line 20
    if-eq p2, v11, :cond_0

    .line 21
    .line 22
    move p2, v10

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v0

    .line 25
    :goto_0
    and-int/2addr p1, v10

    .line 26
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_11

    .line 31
    .line 32
    iget-object p1, p0, Lwb/ve;->h:Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lua/i;

    .line 39
    .line 40
    iget-object v4, p2, Lua/i;->h:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v12, Li0/l;->a:Li0/e;

    .line 51
    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    if-ne v1, v12, :cond_2

    .line 55
    .line 56
    :cond_1
    new-instance v1, Lwb/gi;

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-direct {v1, p1, p2}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    check-cast v1, Lfg/l;

    .line 66
    .line 67
    const/16 v8, 0x36

    .line 68
    .line 69
    const/16 v9, 0x20

    .line 70
    .line 71
    move-object v7, v5

    .line 72
    move-object v5, v1

    .line 73
    const-string v1, "\u6536\u6b3e\u4f4d\u7f6e"

    .line 74
    .line 75
    const-string v2, "\u9009\u62e9\u8f6c\u8d26\u5230\u8d26\u8d26\u6237"

    .line 76
    .line 77
    iget-object v3, p0, Lwb/ve;->i:Ljava/util/List;

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-static/range {v1 .. v9}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 81
    .line 82
    .line 83
    move-object v5, v7

    .line 84
    const/4 p2, 0x0

    .line 85
    invoke-static {p2, v5, v0, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lua/i;

    .line 93
    .line 94
    iget-boolean v1, v1, Lua/i;->u:Z

    .line 95
    .line 96
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-nez v2, :cond_3

    .line 105
    .line 106
    if-ne v3, v12, :cond_4

    .line 107
    .line 108
    :cond_3
    new-instance v3, Lwb/gi;

    .line 109
    .line 110
    const/4 v2, 0x2

    .line 111
    invoke-direct {v3, p1, v2}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    check-cast v3, Lfg/l;

    .line 118
    .line 119
    const/16 v7, 0x1b0

    .line 120
    .line 121
    const/16 v8, 0x8

    .line 122
    .line 123
    const-string v2, "\u62d2\u6536\u65f6\u9000\u56de"

    .line 124
    .line 125
    move-object v6, v5

    .line 126
    move-object v5, v3

    .line 127
    const-string v3, "\u89c4\u5219\u4e0d\u901a\u8fc7\u65f6\u539f\u8def\u9000\u56de"

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 131
    .line 132
    .line 133
    move-object v5, v6

    .line 134
    invoke-static {p2, v5, v0, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Lua/i;

    .line 142
    .line 143
    iget v1, v1, Lua/i;->d:I

    .line 144
    .line 145
    if-eq v1, v10, :cond_6

    .line 146
    .line 147
    if-eq v1, v11, :cond_5

    .line 148
    .line 149
    const-string v1, "\u65e0\u5ef6\u8fdf"

    .line 150
    .line 151
    :goto_1
    move-object v2, v1

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    const-string v1, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    const-string v1, "\u968f\u673a\u5ef6\u8fdf"

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :goto_2
    invoke-static {}, Lwb/ho;->F6()Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Lua/i;

    .line 168
    .line 169
    iget v4, v1, Lua/i;->d:I

    .line 170
    .line 171
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    if-nez v1, :cond_7

    .line 180
    .line 181
    if-ne v6, v12, :cond_8

    .line 182
    .line 183
    :cond_7
    new-instance v6, Lwb/gi;

    .line 184
    .line 185
    const/4 v1, 0x3

    .line 186
    invoke-direct {v6, p1, v1}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_8
    check-cast v6, Lfg/l;

    .line 193
    .line 194
    move-object v7, v5

    .line 195
    move-object v5, v6

    .line 196
    const/4 v6, 0x0

    .line 197
    const/4 v8, 0x6

    .line 198
    const-string v1, "\u6536\u6b3e\u5ef6\u8fdf"

    .line 199
    .line 200
    invoke-static/range {v1 .. v8}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 201
    .line 202
    .line 203
    move-object v5, v7

    .line 204
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, Lua/i;

    .line 209
    .line 210
    iget v1, v1, Lua/i;->d:I

    .line 211
    .line 212
    if-ne v1, v11, :cond_b

    .line 213
    .line 214
    const v1, 0x64c44153

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 218
    .line 219
    .line 220
    invoke-static {p2, v5, v0, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 221
    .line 222
    .line 223
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    check-cast p2, Lua/i;

    .line 228
    .line 229
    iget-wide v1, p2, Lua/i;->e:J

    .line 230
    .line 231
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-nez p2, :cond_9

    .line 244
    .line 245
    if-ne v1, v12, :cond_a

    .line 246
    .line 247
    :cond_9
    new-instance v1, Lwb/gi;

    .line 248
    .line 249
    const/4 p2, 0x4

    .line 250
    invoke-direct {v1, p1, p2}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_a
    move-object v4, v1

    .line 257
    check-cast v4, Lfg/l;

    .line 258
    .line 259
    const/16 v6, 0x36

    .line 260
    .line 261
    const-string v1, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 262
    .line 263
    const-string v2, "\u5355\u4f4d ms"

    .line 264
    .line 265
    invoke-static/range {v1 .. v6}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, v0}, Li0/h0;->p(Z)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :cond_b
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    check-cast v1, Lua/i;

    .line 278
    .line 279
    iget v1, v1, Lua/i;->d:I

    .line 280
    .line 281
    if-ne v1, v10, :cond_10

    .line 282
    .line 283
    const v1, 0x64c85f53

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 287
    .line 288
    .line 289
    invoke-static {p2, v5, v0, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Lua/i;

    .line 297
    .line 298
    iget-wide v1, v1, Lua/i;->f:J

    .line 299
    .line 300
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-nez v1, :cond_c

    .line 313
    .line 314
    if-ne v2, v12, :cond_d

    .line 315
    .line 316
    :cond_c
    new-instance v2, Lwb/gi;

    .line 317
    .line 318
    const/4 v1, 0x5

    .line 319
    invoke-direct {v2, p1, v1}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_d
    move-object v4, v2

    .line 326
    check-cast v4, Lfg/l;

    .line 327
    .line 328
    const/16 v6, 0x36

    .line 329
    .line 330
    const-string v1, "\u6700\u5c0f\u5ef6\u8fdf"

    .line 331
    .line 332
    const-string v2, "\u5355\u4f4d ms"

    .line 333
    .line 334
    invoke-static/range {v1 .. v6}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 335
    .line 336
    .line 337
    invoke-static {p2, v5, v0, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 338
    .line 339
    .line 340
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    check-cast p2, Lua/i;

    .line 345
    .line 346
    iget-wide v1, p2, Lua/i;->g:J

    .line 347
    .line 348
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-nez p2, :cond_e

    .line 361
    .line 362
    if-ne v1, v12, :cond_f

    .line 363
    .line 364
    :cond_e
    new-instance v1, Lwb/gi;

    .line 365
    .line 366
    const/4 p2, 0x6

    .line 367
    invoke-direct {v1, p1, p2}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_f
    move-object v4, v1

    .line 374
    check-cast v4, Lfg/l;

    .line 375
    .line 376
    const/16 v6, 0x36

    .line 377
    .line 378
    const-string v1, "\u6700\u5927\u5ef6\u8fdf"

    .line 379
    .line 380
    const-string v2, "\u5355\u4f4d ms"

    .line 381
    .line 382
    invoke-static/range {v1 .. v6}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v5, v0}, Li0/h0;->p(Z)V

    .line 386
    .line 387
    .line 388
    goto :goto_3

    .line 389
    :cond_10
    const p1, 0x64cea23e

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v0}, Li0/h0;->p(Z)V

    .line 396
    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_11
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 400
    .line 401
    .line 402
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 403
    .line 404
    return-object p1

    .line 405
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 406
    .line 407
    check-cast p2, Ljava/lang/Integer;

    .line 408
    .line 409
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result p2

    .line 413
    and-int/lit8 v0, p2, 0x3

    .line 414
    .line 415
    const/4 v1, 0x2

    .line 416
    const/4 v2, 0x1

    .line 417
    const/4 v3, 0x0

    .line 418
    if-eq v0, v1, :cond_12

    .line 419
    .line 420
    move v0, v2

    .line 421
    goto :goto_4

    .line 422
    :cond_12
    move v0, v3

    .line 423
    :goto_4
    and-int/2addr p2, v2

    .line 424
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result p2

    .line 428
    if-eqz p2, :cond_1b

    .line 429
    .line 430
    new-instance p2, Lwb/bp;

    .line 431
    .line 432
    const/4 v0, -0x1

    .line 433
    const-string v1, "\u542f\u7528\u540e\u6309\u9ed8\u8ba4\u89c4\u5219\u6216\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e\u62a2\u7ea2\u5305"

    .line 434
    .line 435
    const-string v4, "\u8ddf\u968f\u9ed8\u8ba4\u89c4\u5219"

    .line 436
    .line 437
    invoke-direct {p2, v4, v0, v1}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 438
    .line 439
    .line 440
    iget-object v0, p0, Lwb/ve;->h:Li0/a1;

    .line 441
    .line 442
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    check-cast v1, Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    sget-object v6, Li0/l;->a:Li0/e;

    .line 461
    .line 462
    if-nez v4, :cond_13

    .line 463
    .line 464
    if-ne v5, v6, :cond_14

    .line 465
    .line 466
    :cond_13
    new-instance v5, Lwb/bf;

    .line 467
    .line 468
    const/16 v4, 0x13

    .line 469
    .line 470
    invoke-direct {v5, v0, v4}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    :cond_14
    check-cast v5, Lfg/a;

    .line 477
    .line 478
    invoke-static {p2, v1, v5, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 479
    .line 480
    .line 481
    iget-object p2, p0, Lwb/ve;->i:Ljava/util/List;

    .line 482
    .line 483
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    const/4 v4, 0x0

    .line 488
    if-nez v1, :cond_15

    .line 489
    .line 490
    const v1, -0x600b06cd

    .line 491
    .line 492
    .line 493
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 494
    .line 495
    .line 496
    invoke-static {v4, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 497
    .line 498
    .line 499
    :goto_5
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 500
    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_15
    const v1, 0x5eaa61bd

    .line 504
    .line 505
    .line 506
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 507
    .line 508
    .line 509
    goto :goto_5

    .line 510
    :goto_6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    move v5, v3

    .line 515
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    if-eqz v7, :cond_1c

    .line 520
    .line 521
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v7

    .line 525
    add-int/lit8 v8, v5, 0x1

    .line 526
    .line 527
    if-ltz v5, :cond_1a

    .line 528
    .line 529
    check-cast v7, Lna/j;

    .line 530
    .line 531
    iget-object v9, v7, Lna/j;->b:Ljava/lang/String;

    .line 532
    .line 533
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    if-eqz v10, :cond_16

    .line 538
    .line 539
    const-string v9, "\u6a21\u677f "

    .line 540
    .line 541
    invoke-static {v8, v9}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v9

    .line 545
    :cond_16
    invoke-static {v7}, Lwb/ho;->u5(Lna/j;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v10

    .line 549
    new-instance v11, Lwb/bp;

    .line 550
    .line 551
    invoke-direct {v11, v9, v5, v10}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    check-cast v9, Ljava/lang/String;

    .line 559
    .line 560
    iget-object v10, v7, Lna/j;->a:Ljava/lang/String;

    .line 561
    .line 562
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v9

    .line 566
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-virtual {p1, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v12

    .line 574
    or-int/2addr v10, v12

    .line 575
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v12

    .line 579
    if-nez v10, :cond_17

    .line 580
    .line 581
    if-ne v12, v6, :cond_18

    .line 582
    .line 583
    :cond_17
    new-instance v12, Lsh/v1;

    .line 584
    .line 585
    const/16 v10, 0x11

    .line 586
    .line 587
    invoke-direct {v12, v7, v10, v0}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {p1, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    :cond_18
    check-cast v12, Lfg/a;

    .line 594
    .line 595
    invoke-static {v11, v9, v12, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 596
    .line 597
    .line 598
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 599
    .line 600
    .line 601
    move-result v7

    .line 602
    sub-int/2addr v7, v2

    .line 603
    if-ge v5, v7, :cond_19

    .line 604
    .line 605
    const v5, -0x5f6aa8e5

    .line 606
    .line 607
    .line 608
    invoke-virtual {p1, v5}, Li0/h0;->a0(I)V

    .line 609
    .line 610
    .line 611
    invoke-static {v4, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 612
    .line 613
    .line 614
    :goto_8
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 615
    .line 616
    .line 617
    goto :goto_9

    .line 618
    :cond_19
    const v5, 0x7215c0d5

    .line 619
    .line 620
    .line 621
    invoke-virtual {p1, v5}, Li0/h0;->a0(I)V

    .line 622
    .line 623
    .line 624
    goto :goto_8

    .line 625
    :goto_9
    move v5, v8

    .line 626
    goto :goto_7

    .line 627
    :cond_1a
    invoke-static {}, La/a;->Q0()V

    .line 628
    .line 629
    .line 630
    const/4 p1, 0x0

    .line 631
    throw p1

    .line 632
    :cond_1b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 633
    .line 634
    .line 635
    :cond_1c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 636
    .line 637
    return-object p1

    .line 638
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 639
    .line 640
    check-cast p2, Ljava/lang/Integer;

    .line 641
    .line 642
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result p2

    .line 646
    and-int/lit8 v0, p2, 0x3

    .line 647
    .line 648
    const/4 v1, 0x2

    .line 649
    const/4 v2, 0x1

    .line 650
    const/4 v3, 0x0

    .line 651
    if-eq v0, v1, :cond_1d

    .line 652
    .line 653
    move v0, v2

    .line 654
    goto :goto_a

    .line 655
    :cond_1d
    move v0, v3

    .line 656
    :goto_a
    and-int/2addr p2, v2

    .line 657
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 658
    .line 659
    .line 660
    move-result p2

    .line 661
    if-eqz p2, :cond_26

    .line 662
    .line 663
    iget-object p2, p0, Lwb/ve;->i:Ljava/util/List;

    .line 664
    .line 665
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    move v1, v3

    .line 670
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    if-eqz v4, :cond_27

    .line 675
    .line 676
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    add-int/lit8 v5, v1, 0x1

    .line 681
    .line 682
    const/4 v6, 0x0

    .line 683
    if-ltz v1, :cond_25

    .line 684
    .line 685
    check-cast v4, Ln9/a;

    .line 686
    .line 687
    iget-object v7, v4, Ln9/a;->c:Ljava/util/Set;

    .line 688
    .line 689
    check-cast v7, Ljava/lang/Iterable;

    .line 690
    .line 691
    instance-of v8, v7, Ljava/util/Collection;

    .line 692
    .line 693
    iget-object v9, p0, Lwb/ve;->h:Li0/a1;

    .line 694
    .line 695
    if-eqz v8, :cond_1e

    .line 696
    .line 697
    move-object v8, v7

    .line 698
    check-cast v8, Ljava/util/Collection;

    .line 699
    .line 700
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 701
    .line 702
    .line 703
    move-result v8

    .line 704
    if-eqz v8, :cond_1e

    .line 705
    .line 706
    move v8, v3

    .line 707
    goto :goto_d

    .line 708
    :cond_1e
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 709
    .line 710
    .line 711
    move-result-object v7

    .line 712
    move v8, v3

    .line 713
    :cond_1f
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 714
    .line 715
    .line 716
    move-result v10

    .line 717
    if-eqz v10, :cond_21

    .line 718
    .line 719
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v10

    .line 723
    check-cast v10, Ljava/lang/String;

    .line 724
    .line 725
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    check-cast v11, Ljava/util/Set;

    .line 730
    .line 731
    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v10

    .line 735
    if-eqz v10, :cond_1f

    .line 736
    .line 737
    add-int/lit8 v8, v8, 0x1

    .line 738
    .line 739
    if-ltz v8, :cond_20

    .line 740
    .line 741
    goto :goto_c

    .line 742
    :cond_20
    invoke-static {}, La/a;->P0()V

    .line 743
    .line 744
    .line 745
    throw v6

    .line 746
    :cond_21
    :goto_d
    invoke-virtual {p1, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    invoke-virtual {p1, v8}, Li0/h0;->d(I)Z

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    or-int/2addr v6, v7

    .line 755
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v7

    .line 759
    or-int/2addr v6, v7

    .line 760
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    if-nez v6, :cond_22

    .line 765
    .line 766
    sget-object v6, Li0/l;->a:Li0/e;

    .line 767
    .line 768
    if-ne v7, v6, :cond_23

    .line 769
    .line 770
    :cond_22
    new-instance v7, Lhb/e0;

    .line 771
    .line 772
    invoke-direct {v7, v8, v4, v9}, Lhb/e0;-><init>(ILn9/a;Li0/a1;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {p1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    :cond_23
    check-cast v7, Lfg/a;

    .line 779
    .line 780
    const/16 v6, 0x8

    .line 781
    .line 782
    invoke-static {v4, v8, v7, p1, v6}, Lwb/ho;->f1(Ln9/a;ILfg/a;Li0/h0;I)V

    .line 783
    .line 784
    .line 785
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    sub-int/2addr v4, v2

    .line 790
    if-ge v1, v4, :cond_24

    .line 791
    .line 792
    const v1, -0x8a3c9df

    .line 793
    .line 794
    .line 795
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 796
    .line 797
    .line 798
    const/4 v1, 0x0

    .line 799
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 800
    .line 801
    .line 802
    :goto_e
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 803
    .line 804
    .line 805
    goto :goto_f

    .line 806
    :cond_24
    const v1, -0xbd53d71

    .line 807
    .line 808
    .line 809
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 810
    .line 811
    .line 812
    goto :goto_e

    .line 813
    :goto_f
    move v1, v5

    .line 814
    goto/16 :goto_b

    .line 815
    .line 816
    :cond_25
    invoke-static {}, La/a;->Q0()V

    .line 817
    .line 818
    .line 819
    throw v6

    .line 820
    :cond_26
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 821
    .line 822
    .line 823
    :cond_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 824
    .line 825
    return-object p1

    .line 826
    :pswitch_2
    move-object v5, p1

    .line 827
    check-cast v5, Li0/h0;

    .line 828
    .line 829
    check-cast p2, Ljava/lang/Integer;

    .line 830
    .line 831
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 832
    .line 833
    .line 834
    move-result p1

    .line 835
    and-int/lit8 p2, p1, 0x3

    .line 836
    .line 837
    const/4 v0, 0x2

    .line 838
    const/4 v8, 0x1

    .line 839
    const/4 v9, 0x0

    .line 840
    if-eq p2, v0, :cond_28

    .line 841
    .line 842
    move p2, v8

    .line 843
    goto :goto_10

    .line 844
    :cond_28
    move p2, v9

    .line 845
    :goto_10
    and-int/2addr p1, v8

    .line 846
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 847
    .line 848
    .line 849
    move-result p1

    .line 850
    if-eqz p1, :cond_30

    .line 851
    .line 852
    iget-object p1, p0, Lwb/ve;->i:Ljava/util/List;

    .line 853
    .line 854
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 855
    .line 856
    .line 857
    move-result p2

    .line 858
    if-eqz p2, :cond_29

    .line 859
    .line 860
    const p1, -0x6c4d9069

    .line 861
    .line 862
    .line 863
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 864
    .line 865
    .line 866
    const-string p1, "\u6682\u65e0\u6a21\u677f\u3002\u5148\u65b0\u589e\u6a21\u677f\uff0c\u518d\u56de\u6765\u6279\u91cf\u6dfb\u52a0\u540d\u5355\u3002"

    .line 867
    .line 868
    const/4 p2, 0x6

    .line 869
    invoke-static {p1, v5, p2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_14

    .line 876
    .line 877
    :cond_29
    const p2, -0x6c4bda2c

    .line 878
    .line 879
    .line 880
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 881
    .line 882
    .line 883
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 884
    .line 885
    .line 886
    move-result-object p2

    .line 887
    move v10, v9

    .line 888
    :goto_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    if-eqz v0, :cond_2f

    .line 893
    .line 894
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    add-int/lit8 v11, v10, 0x1

    .line 899
    .line 900
    if-ltz v10, :cond_2e

    .line 901
    .line 902
    check-cast v0, Laa/h;

    .line 903
    .line 904
    iget-object v1, p0, Lwb/ve;->h:Li0/a1;

    .line 905
    .line 906
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    check-cast v2, Ljava/util/Set;

    .line 911
    .line 912
    iget-object v3, v0, Laa/h;->a:Ljava/lang/String;

    .line 913
    .line 914
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    iget-object v3, v0, Laa/h;->b:Ljava/lang/String;

    .line 919
    .line 920
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    if-eqz v4, :cond_2a

    .line 925
    .line 926
    const-string v3, "\u6a21\u677f "

    .line 927
    .line 928
    invoke-static {v11, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v3

    .line 932
    :cond_2a
    move-object v4, v0

    .line 933
    move v0, v2

    .line 934
    invoke-static {v4}, Lwb/ho;->r5(Laa/h;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v6

    .line 942
    invoke-virtual {v5, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-result v7

    .line 946
    or-int/2addr v6, v7

    .line 947
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    if-nez v6, :cond_2b

    .line 952
    .line 953
    sget-object v6, Li0/l;->a:Li0/e;

    .line 954
    .line 955
    if-ne v7, v6, :cond_2c

    .line 956
    .line 957
    :cond_2b
    new-instance v7, Lwb/l7;

    .line 958
    .line 959
    const/16 v6, 0xb

    .line 960
    .line 961
    invoke-direct {v7, v4, v6, v1}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    :cond_2c
    move-object v4, v7

    .line 968
    check-cast v4, Lfg/l;

    .line 969
    .line 970
    const/4 v6, 0x0

    .line 971
    const/16 v7, 0x8

    .line 972
    .line 973
    move-object v1, v3

    .line 974
    const/4 v3, 0x0

    .line 975
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 976
    .line 977
    .line 978
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    sub-int/2addr v0, v8

    .line 983
    if-ge v10, v0, :cond_2d

    .line 984
    .line 985
    const v0, -0x649ea894

    .line 986
    .line 987
    .line 988
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 989
    .line 990
    .line 991
    const/4 v0, 0x0

    .line 992
    invoke-static {v0, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 993
    .line 994
    .line 995
    :goto_12
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 996
    .line 997
    .line 998
    goto :goto_13

    .line 999
    :cond_2d
    const v0, -0x2f36355c

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_12

    .line 1006
    :goto_13
    move v10, v11

    .line 1007
    goto :goto_11

    .line 1008
    :cond_2e
    invoke-static {}, La/a;->Q0()V

    .line 1009
    .line 1010
    .line 1011
    const/4 p1, 0x0

    .line 1012
    throw p1

    .line 1013
    :cond_2f
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1014
    .line 1015
    .line 1016
    goto :goto_14

    .line 1017
    :cond_30
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1018
    .line 1019
    .line 1020
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1021
    .line 1022
    return-object p1

    .line 1023
    :pswitch_3
    check-cast p1, Li0/h0;

    .line 1024
    .line 1025
    check-cast p2, Ljava/lang/Integer;

    .line 1026
    .line 1027
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1028
    .line 1029
    .line 1030
    move-result p2

    .line 1031
    and-int/lit8 v0, p2, 0x3

    .line 1032
    .line 1033
    const/4 v1, 0x2

    .line 1034
    const/4 v2, 0x0

    .line 1035
    const/4 v3, 0x1

    .line 1036
    if-eq v0, v1, :cond_31

    .line 1037
    .line 1038
    move v0, v3

    .line 1039
    goto :goto_15

    .line 1040
    :cond_31
    move v0, v2

    .line 1041
    :goto_15
    and-int/2addr p2, v3

    .line 1042
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1043
    .line 1044
    .line 1045
    move-result p2

    .line 1046
    if-eqz p2, :cond_38

    .line 1047
    .line 1048
    new-instance p2, Lwb/bp;

    .line 1049
    .line 1050
    const/4 v0, -0x1

    .line 1051
    const-string v1, "\u4f7f\u7528\u9ed8\u8ba4\u6a21\u677f\u6216\u5168\u5c40\u8bbe\u7f6e"

    .line 1052
    .line 1053
    const-string v4, "\u8ddf\u968f\u9ed8\u8ba4\u89c4\u5219"

    .line 1054
    .line 1055
    invoke-direct {p2, v4, v0, v1}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    iget-object v0, p0, Lwb/ve;->h:Li0/a1;

    .line 1059
    .line 1060
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    check-cast v1, Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v1

    .line 1070
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v4

    .line 1074
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v5

    .line 1078
    sget-object v6, Li0/l;->a:Li0/e;

    .line 1079
    .line 1080
    if-nez v4, :cond_32

    .line 1081
    .line 1082
    if-ne v5, v6, :cond_33

    .line 1083
    .line 1084
    :cond_32
    new-instance v5, Lwb/bf;

    .line 1085
    .line 1086
    const/16 v4, 0x16

    .line 1087
    .line 1088
    invoke-direct {v5, v0, v4}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1092
    .line 1093
    .line 1094
    :cond_33
    check-cast v5, Lfg/a;

    .line 1095
    .line 1096
    invoke-static {p2, v1, v5, p1, v2}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 1097
    .line 1098
    .line 1099
    iget-object p2, p0, Lwb/ve;->i:Ljava/util/List;

    .line 1100
    .line 1101
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1102
    .line 1103
    .line 1104
    move-result-object p2

    .line 1105
    move v1, v2

    .line 1106
    :goto_16
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    if-eqz v4, :cond_39

    .line 1111
    .line 1112
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    add-int/lit8 v5, v1, 0x1

    .line 1117
    .line 1118
    if-ltz v1, :cond_37

    .line 1119
    .line 1120
    check-cast v4, Lua/i;

    .line 1121
    .line 1122
    const/4 v7, 0x0

    .line 1123
    invoke-static {v7, p1, v2, v3}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1124
    .line 1125
    .line 1126
    iget-object v7, v4, Lua/i;->b:Ljava/lang/String;

    .line 1127
    .line 1128
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v8

    .line 1132
    if-eqz v8, :cond_34

    .line 1133
    .line 1134
    const-string v7, "\u6a21\u677f "

    .line 1135
    .line 1136
    invoke-static {v5, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v7

    .line 1140
    :cond_34
    invoke-static {v4}, Lwb/ho;->w5(Lua/i;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v8

    .line 1144
    new-instance v9, Lwb/bp;

    .line 1145
    .line 1146
    invoke-direct {v9, v7, v1, v8}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    check-cast v1, Ljava/lang/String;

    .line 1154
    .line 1155
    iget-object v7, v4, Lua/i;->a:Ljava/lang/String;

    .line 1156
    .line 1157
    invoke-static {v1, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v1

    .line 1161
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v7

    .line 1165
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v8

    .line 1169
    or-int/2addr v7, v8

    .line 1170
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v8

    .line 1174
    if-nez v7, :cond_35

    .line 1175
    .line 1176
    if-ne v8, v6, :cond_36

    .line 1177
    .line 1178
    :cond_35
    new-instance v8, Lsh/v1;

    .line 1179
    .line 1180
    const/16 v7, 0x16

    .line 1181
    .line 1182
    invoke-direct {v8, v4, v7, v0}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {p1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1186
    .line 1187
    .line 1188
    :cond_36
    check-cast v8, Lfg/a;

    .line 1189
    .line 1190
    invoke-static {v9, v1, v8, p1, v2}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 1191
    .line 1192
    .line 1193
    move v1, v5

    .line 1194
    goto :goto_16

    .line 1195
    :cond_37
    invoke-static {}, La/a;->Q0()V

    .line 1196
    .line 1197
    .line 1198
    const/4 p1, 0x0

    .line 1199
    throw p1

    .line 1200
    :cond_38
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1201
    .line 1202
    .line 1203
    :cond_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1204
    .line 1205
    return-object p1

    .line 1206
    :pswitch_4
    move-object v5, p1

    .line 1207
    check-cast v5, Li0/h0;

    .line 1208
    .line 1209
    check-cast p2, Ljava/lang/Integer;

    .line 1210
    .line 1211
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1212
    .line 1213
    .line 1214
    move-result p1

    .line 1215
    and-int/lit8 p2, p1, 0x3

    .line 1216
    .line 1217
    const/4 v0, 0x2

    .line 1218
    const/4 v8, 0x1

    .line 1219
    const/4 v9, 0x0

    .line 1220
    if-eq p2, v0, :cond_3a

    .line 1221
    .line 1222
    move p2, v8

    .line 1223
    goto :goto_17

    .line 1224
    :cond_3a
    move p2, v9

    .line 1225
    :goto_17
    and-int/2addr p1, v8

    .line 1226
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1227
    .line 1228
    .line 1229
    move-result p1

    .line 1230
    if-eqz p1, :cond_3f

    .line 1231
    .line 1232
    iget-object p1, p0, Lwb/ve;->i:Ljava/util/List;

    .line 1233
    .line 1234
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1235
    .line 1236
    .line 1237
    move-result-object p1

    .line 1238
    move p2, v9

    .line 1239
    :goto_18
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    if-eqz v0, :cond_40

    .line 1244
    .line 1245
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    add-int/lit8 v10, p2, 0x1

    .line 1250
    .line 1251
    if-ltz p2, :cond_3e

    .line 1252
    .line 1253
    check-cast v0, Lsf/j;

    .line 1254
    .line 1255
    if-lez p2, :cond_3b

    .line 1256
    .line 1257
    const p2, 0x245cafcb

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 1261
    .line 1262
    .line 1263
    const/4 p2, 0x0

    .line 1264
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1265
    .line 1266
    .line 1267
    :goto_19
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1268
    .line 1269
    .line 1270
    goto :goto_1a

    .line 1271
    :cond_3b
    const p2, 0x67397e25

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 1275
    .line 1276
    .line 1277
    goto :goto_19

    .line 1278
    :goto_1a
    iget-object p2, p0, Lwb/ve;->h:Li0/a1;

    .line 1279
    .line 1280
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    check-cast v1, Ljava/util/Set;

    .line 1285
    .line 1286
    iget-object v2, v0, Lsf/j;->g:Ljava/lang/Object;

    .line 1287
    .line 1288
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v1

    .line 1292
    iget-object v2, v0, Lsf/j;->h:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v2, Ljava/lang/String;

    .line 1295
    .line 1296
    iget-object v3, v0, Lsf/j;->i:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v3, Ljava/lang/String;

    .line 1299
    .line 1300
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v4

    .line 1304
    invoke-virtual {v5, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v6

    .line 1308
    or-int/2addr v4, v6

    .line 1309
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v6

    .line 1313
    if-nez v4, :cond_3c

    .line 1314
    .line 1315
    sget-object v4, Li0/l;->a:Li0/e;

    .line 1316
    .line 1317
    if-ne v6, v4, :cond_3d

    .line 1318
    .line 1319
    :cond_3c
    new-instance v6, Lwb/l7;

    .line 1320
    .line 1321
    const/4 v4, 0x7

    .line 1322
    invoke-direct {v6, v0, v4, p2}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1326
    .line 1327
    .line 1328
    :cond_3d
    move-object v4, v6

    .line 1329
    check-cast v4, Lfg/l;

    .line 1330
    .line 1331
    const/4 v6, 0x0

    .line 1332
    const/16 v7, 0x8

    .line 1333
    .line 1334
    move v0, v1

    .line 1335
    move-object v1, v2

    .line 1336
    move-object v2, v3

    .line 1337
    const/4 v3, 0x0

    .line 1338
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1339
    .line 1340
    .line 1341
    move p2, v10

    .line 1342
    goto :goto_18

    .line 1343
    :cond_3e
    invoke-static {}, La/a;->Q0()V

    .line 1344
    .line 1345
    .line 1346
    const/4 p1, 0x0

    .line 1347
    throw p1

    .line 1348
    :cond_3f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1349
    .line 1350
    .line 1351
    :cond_40
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1352
    .line 1353
    return-object p1

    .line 1354
    nop

    .line 1355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
