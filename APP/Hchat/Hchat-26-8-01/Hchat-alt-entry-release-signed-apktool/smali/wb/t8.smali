.class public final synthetic Lwb/t8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/t8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/t8;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/t8;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/t8;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/t8;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/t8;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/t8;->g:I

    .line 2
    .line 3
    move-object v4, p1

    .line 4
    check-cast v4, Li0/h0;

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-eq p2, v1, :cond_0

    .line 21
    .line 22
    move p2, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v9

    .line 25
    :goto_0
    and-int/2addr p1, v0

    .line 26
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_f

    .line 31
    .line 32
    iget-object p1, p0, Lwb/t8;->i:Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    const-string v2, "\u53ea\u62a2\u542b\u5173\u952e\u8bcd"

    .line 45
    .line 46
    const-string v3, "\u5c4f\u853d\u542b\u5173\u952e\u8bcd"

    .line 47
    .line 48
    const-string v5, "\u4e0d\u9650\u5173\u952e\u8bcd"

    .line 49
    .line 50
    if-eq p2, v0, :cond_2

    .line 51
    .line 52
    if-eq p2, v1, :cond_1

    .line 53
    .line 54
    move-object p2, v2

    .line 55
    move-object v2, v5

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object p2, v2

    .line 58
    move-object v2, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object p2, v2

    .line 61
    :goto_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    new-instance v7, Lsf/e;

    .line 66
    .line 67
    invoke-direct {v7, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v6, Lsf/e;

    .line 75
    .line 76
    invoke-direct {v6, p2, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    new-instance v1, Lsf/e;

    .line 84
    .line 85
    invoke-direct {v1, v3, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    filled-new-array {v7, v6, v1}, [Lsf/e;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-static {p2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    iget-object v10, p0, Lwb/t8;->h:Li0/a1;

    .line 107
    .line 108
    invoke-virtual {v4, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    or-int/2addr v1, v5

    .line 117
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    sget-object v11, Li0/l;->a:Li0/e;

    .line 122
    .line 123
    if-nez v1, :cond_3

    .line 124
    .line 125
    if-ne v5, v11, :cond_4

    .line 126
    .line 127
    :cond_3
    new-instance v5, Lsh/m1;

    .line 128
    .line 129
    const/16 v1, 0xe

    .line 130
    .line 131
    invoke-direct {v5, v1, v10, p1}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    check-cast v5, Lfg/l;

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v8, 0x6

    .line 141
    const-string v1, "\u5173\u952e\u8bcd\u8fc7\u6ee4"

    .line 142
    .line 143
    move-object v7, v4

    .line 144
    move v4, p2

    .line 145
    invoke-static/range {v1 .. v8}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 146
    .line 147
    .line 148
    move-object v4, v7

    .line 149
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    const/4 p2, 0x0

    .line 160
    if-eqz p1, :cond_7

    .line 161
    .line 162
    const p1, 0x4d8b5c0f    # 2.9225827E8f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {p2, v4, v9, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    move-object v3, p1

    .line 176
    check-cast v3, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v4, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez p1, :cond_5

    .line 187
    .line 188
    if-ne v1, v11, :cond_6

    .line 189
    .line 190
    :cond_5
    new-instance v1, Lwb/oh;

    .line 191
    .line 192
    const/16 p1, 0x16

    .line 193
    .line 194
    invoke-direct {v1, v10, p1}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_6
    move-object v5, v1

    .line 201
    check-cast v5, Lfg/l;

    .line 202
    .line 203
    const/16 v7, 0xc36

    .line 204
    .line 205
    const/4 v8, 0x0

    .line 206
    const-string v1, "\u5173\u952e\u8bcd"

    .line 207
    .line 208
    const-string v2, "\u591a\u4e2a\u7528 |\u3001\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 209
    .line 210
    move-object v6, v4

    .line 211
    const/4 v4, 0x2

    .line 212
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 213
    .line 214
    .line 215
    move-object v4, v6

    .line 216
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_7
    const p1, 0x4d90c901    # 3.036365E8f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 227
    .line 228
    .line 229
    :goto_2
    invoke-static {p2, v4, v9, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 230
    .line 231
    .line 232
    iget-object p1, p0, Lwb/t8;->j:Li0/a1;

    .line 233
    .line 234
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    if-nez v2, :cond_8

    .line 253
    .line 254
    if-ne v3, v11, :cond_9

    .line 255
    .line 256
    :cond_8
    new-instance v3, Lwb/oh;

    .line 257
    .line 258
    const/16 v2, 0x17

    .line 259
    .line 260
    invoke-direct {v3, p1, v2}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_9
    move-object v5, v3

    .line 267
    check-cast v5, Lfg/l;

    .line 268
    .line 269
    const/16 v7, 0x1b0

    .line 270
    .line 271
    const/16 v8, 0x8

    .line 272
    .line 273
    const-string v2, "\u7981\u62a2\u65f6\u6bb5"

    .line 274
    .line 275
    const-string v3, "\u5728\u6307\u5b9a\u65f6\u95f4\u6bb5\u5185\u4e0d\u62a2\u7ea2\u5305"

    .line 276
    .line 277
    move-object v6, v4

    .line 278
    const/4 v4, 0x0

    .line 279
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 280
    .line 281
    .line 282
    move-object v4, v6

    .line 283
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, Ljava/lang/Boolean;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_e

    .line 294
    .line 295
    const p1, 0x4d95dfda    # 3.1430944E8f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {p2, v4, v9, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 302
    .line 303
    .line 304
    iget-object p1, p0, Lwb/t8;->k:Li0/a1;

    .line 305
    .line 306
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    move-object v6, v1

    .line 311
    check-cast v6, Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-nez v1, :cond_a

    .line 322
    .line 323
    if-ne v2, v11, :cond_b

    .line 324
    .line 325
    :cond_a
    new-instance v2, Lwb/oh;

    .line 326
    .line 327
    const/16 v1, 0x18

    .line 328
    .line 329
    invoke-direct {v2, p1, v1}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_b
    move-object v3, v2

    .line 336
    check-cast v3, Lfg/l;

    .line 337
    .line 338
    const/4 v1, 0x6

    .line 339
    const/4 v2, 0x4

    .line 340
    const-string v5, "\u5f00\u59cb\u65f6\u95f4"

    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    invoke-static/range {v1 .. v7}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 344
    .line 345
    .line 346
    invoke-static {p2, v4, v9, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 347
    .line 348
    .line 349
    iget-object p1, p0, Lwb/t8;->l:Li0/a1;

    .line 350
    .line 351
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    move-object v6, p2

    .line 356
    check-cast v6, Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p2

    .line 362
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-nez p2, :cond_c

    .line 367
    .line 368
    if-ne v0, v11, :cond_d

    .line 369
    .line 370
    :cond_c
    new-instance v0, Lwb/oh;

    .line 371
    .line 372
    const/16 p2, 0x19

    .line 373
    .line 374
    invoke-direct {v0, p1, p2}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    :cond_d
    move-object v3, v0

    .line 381
    check-cast v3, Lfg/l;

    .line 382
    .line 383
    const/4 v1, 0x6

    .line 384
    const/4 v2, 0x4

    .line 385
    const-string v5, "\u7ed3\u675f\u65f6\u95f4"

    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    invoke-static/range {v1 .. v7}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 392
    .line 393
    .line 394
    goto :goto_3

    .line 395
    :cond_e
    const p1, 0x4d99bb21    # 3.2239722E8f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4, v9}, Li0/h0;->p(Z)V

    .line 402
    .line 403
    .line 404
    goto :goto_3

    .line 405
    :cond_f
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 406
    .line 407
    .line 408
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 409
    .line 410
    return-object p1

    .line 411
    :pswitch_0
    and-int/lit8 p2, p1, 0x3

    .line 412
    .line 413
    const/4 v0, 0x2

    .line 414
    const/4 v9, 0x1

    .line 415
    const/4 v10, 0x0

    .line 416
    if-eq p2, v0, :cond_10

    .line 417
    .line 418
    move p2, v9

    .line 419
    goto :goto_4

    .line 420
    :cond_10
    move p2, v10

    .line 421
    :goto_4
    and-int/2addr p1, v9

    .line 422
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    if-eqz p1, :cond_19

    .line 427
    .line 428
    iget-object p1, p0, Lwb/t8;->h:Li0/a1;

    .line 429
    .line 430
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    check-cast p2, Ljava/lang/String;

    .line 435
    .line 436
    const-string v0, "avatar_above"

    .line 437
    .line 438
    invoke-static {p2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    const-string v2, "\u6d88\u606f\u4e0b\u65b9"

    .line 443
    .line 444
    const-string v3, "\u5934\u50cf\u4e0b\u65b9"

    .line 445
    .line 446
    const-string v5, "avatar_below"

    .line 447
    .line 448
    const-string v6, "\u5934\u50cf\u4e0a\u65b9"

    .line 449
    .line 450
    if-eqz v1, :cond_11

    .line 451
    .line 452
    move-object v1, v6

    .line 453
    goto :goto_5

    .line 454
    :cond_11
    invoke-static {p2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result p2

    .line 458
    if-eqz p2, :cond_12

    .line 459
    .line 460
    move-object v1, v3

    .line 461
    goto :goto_5

    .line 462
    :cond_12
    move-object v1, v2

    .line 463
    :goto_5
    new-instance p2, Lwb/dq;

    .line 464
    .line 465
    const-string v11, "message_bottom"

    .line 466
    .line 467
    invoke-direct {p2, v11, v2}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    new-instance v2, Lwb/dq;

    .line 471
    .line 472
    invoke-direct {v2, v0, v6}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    new-instance v0, Lwb/dq;

    .line 476
    .line 477
    invoke-direct {v0, v5, v3}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    filled-new-array {p2, v2, v0}, [Lwb/dq;

    .line 481
    .line 482
    .line 483
    move-result-object p2

    .line 484
    invoke-static {p2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    move-object v3, p2

    .line 493
    check-cast v3, Ljava/lang/String;

    .line 494
    .line 495
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p2

    .line 499
    sget-object v12, Li0/l;->a:Li0/e;

    .line 500
    .line 501
    if-ne p2, v12, :cond_13

    .line 502
    .line 503
    new-instance p2, Lwb/ab;

    .line 504
    .line 505
    const/4 v0, 0x3

    .line 506
    invoke-direct {p2, p1, v0}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    :cond_13
    check-cast p2, Lfg/l;

    .line 513
    .line 514
    const/16 v7, 0x6006

    .line 515
    .line 516
    const/16 v8, 0x20

    .line 517
    .line 518
    const-string v0, "\u663e\u793a\u4f4d\u7f6e"

    .line 519
    .line 520
    const/4 v5, 0x0

    .line 521
    move-object v6, v4

    .line 522
    move-object v4, p2

    .line 523
    invoke-static/range {v0 .. v8}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 524
    .line 525
    .line 526
    move-object v4, v6

    .line 527
    const/4 p2, 0x0

    .line 528
    invoke-static {p2, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 529
    .line 530
    .line 531
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    check-cast p1, Ljava/lang/String;

    .line 536
    .line 537
    invoke-static {p1, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result p1

    .line 541
    if-eqz p1, :cond_16

    .line 542
    .line 543
    const p1, -0x7f00add3

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 547
    .line 548
    .line 549
    iget-object p1, p0, Lwb/t8;->i:Li0/a1;

    .line 550
    .line 551
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    move-object v2, v0

    .line 556
    check-cast v2, Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    if-ne v0, v12, :cond_14

    .line 563
    .line 564
    new-instance v0, Lwb/ab;

    .line 565
    .line 566
    const/4 v1, 0x4

    .line 567
    invoke-direct {v0, p1, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    :cond_14
    move-object v3, v0

    .line 574
    check-cast v3, Lfg/l;

    .line 575
    .line 576
    const/16 v5, 0xc36

    .line 577
    .line 578
    const-string v0, "\u5de6\u8fb9\u8ddd"

    .line 579
    .line 580
    const-string v1, "\u5355\u4f4d dp\uff0c\u5bf9\u65b9\u6d88\u606f\u4f7f\u7528"

    .line 581
    .line 582
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 583
    .line 584
    .line 585
    invoke-static {p2, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 586
    .line 587
    .line 588
    iget-object p1, p0, Lwb/t8;->j:Li0/a1;

    .line 589
    .line 590
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    move-object v2, v0

    .line 595
    check-cast v2, Ljava/lang/String;

    .line 596
    .line 597
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    if-ne v0, v12, :cond_15

    .line 602
    .line 603
    new-instance v0, Lwb/ab;

    .line 604
    .line 605
    const/4 v1, 0x5

    .line 606
    invoke-direct {v0, p1, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    :cond_15
    move-object v3, v0

    .line 613
    check-cast v3, Lfg/l;

    .line 614
    .line 615
    const/16 v5, 0xc36

    .line 616
    .line 617
    const-string v0, "\u53f3\u8fb9\u8ddd"

    .line 618
    .line 619
    const-string v1, "\u5355\u4f4d dp\uff0c\u81ea\u5df1\u6d88\u606f\u4f7f\u7528"

    .line 620
    .line 621
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 622
    .line 623
    .line 624
    invoke-static {p2, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v4, v10}, Li0/h0;->p(Z)V

    .line 628
    .line 629
    .line 630
    goto :goto_6

    .line 631
    :cond_16
    const p1, -0x7efbbd5d

    .line 632
    .line 633
    .line 634
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 635
    .line 636
    .line 637
    iget-object p1, p0, Lwb/t8;->k:Li0/a1;

    .line 638
    .line 639
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    move-object v2, v0

    .line 644
    check-cast v2, Ljava/lang/String;

    .line 645
    .line 646
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    if-ne v0, v12, :cond_17

    .line 651
    .line 652
    new-instance v0, Lwb/ab;

    .line 653
    .line 654
    const/4 v1, 0x6

    .line 655
    invoke-direct {v0, p1, v1}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :cond_17
    move-object v3, v0

    .line 662
    check-cast v3, Lfg/l;

    .line 663
    .line 664
    const/16 v5, 0xc36

    .line 665
    .line 666
    const-string v0, "\u4e0e\u5934\u50cf\u95f4\u8ddd"

    .line 667
    .line 668
    const-string v1, "\u5355\u4f4d dp\uff0c\u53ef\u8bbe\u7f6e 0-64"

    .line 669
    .line 670
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 671
    .line 672
    .line 673
    invoke-static {p2, v4, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v4, v10}, Li0/h0;->p(Z)V

    .line 677
    .line 678
    .line 679
    :goto_6
    iget-object p1, p0, Lwb/t8;->l:Li0/a1;

    .line 680
    .line 681
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object p2

    .line 685
    move-object v2, p2

    .line 686
    check-cast v2, Ljava/lang/String;

    .line 687
    .line 688
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object p2

    .line 692
    if-ne p2, v12, :cond_18

    .line 693
    .line 694
    new-instance p2, Lwb/ab;

    .line 695
    .line 696
    const/4 v0, 0x7

    .line 697
    invoke-direct {p2, p1, v0}, Lwb/ab;-><init>(Li0/a1;I)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    :cond_18
    move-object v3, p2

    .line 704
    check-cast v3, Lfg/l;

    .line 705
    .line 706
    const/16 v5, 0xc36

    .line 707
    .line 708
    const-string v0, "\u5b57\u4f53\u5927\u5c0f"

    .line 709
    .line 710
    const-string v1, "\u5355\u4f4d sp"

    .line 711
    .line 712
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 713
    .line 714
    .line 715
    goto :goto_7

    .line 716
    :cond_19
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 717
    .line 718
    .line 719
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 720
    .line 721
    return-object p1

    .line 722
    nop

    .line 723
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
