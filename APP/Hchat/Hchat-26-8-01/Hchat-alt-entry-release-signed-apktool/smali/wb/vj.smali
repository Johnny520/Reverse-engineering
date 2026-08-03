.class public final synthetic Lwb/vj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lvb/a;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lvb/a;Landroid/content/SharedPreferences;Lfg/a;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/vj;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/vj;->h:Lvb/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/vj;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/vj;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/vj;->k:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/vj;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/vj;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/vj;->n:Li0/a1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/vj;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, Lwb/no;

    .line 8
    .line 9
    move-object v7, p2

    .line 10
    check-cast v7, Li0/h0;

    .line 11
    .line 12
    move-object/from16 p1, p3

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, p1, 0x6

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    and-int/lit8 v0, p1, 0x8

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v7, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v7, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    if-eqz v0, :cond_1

    .line 42
    .line 43
    move v0, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 v0, 0x2

    .line 46
    :goto_1
    or-int/2addr p1, v0

    .line 47
    :cond_2
    and-int/lit8 v0, p1, 0x13

    .line 48
    .line 49
    const/16 v3, 0x12

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v12, 0x0

    .line 53
    if-eq v0, v3, :cond_3

    .line 54
    .line 55
    move v0, v4

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move v0, v12

    .line 58
    :goto_2
    and-int/lit8 v3, p1, 0x1

    .line 59
    .line 60
    invoke-virtual {v7, v3, v0}, Li0/h0;->S(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_c

    .line 65
    .line 66
    sget-object v0, Lwb/mo;->a:Lwb/mo;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v3, p0, Lwb/vj;->i:Landroid/content/SharedPreferences;

    .line 73
    .line 74
    iget-object v5, p0, Lwb/vj;->l:Li0/a1;

    .line 75
    .line 76
    move v6, v4

    .line 77
    iget-object v4, p0, Lwb/vj;->m:Li0/a1;

    .line 78
    .line 79
    move v8, v6

    .line 80
    iget-object v6, p0, Lwb/vj;->n:Li0/a1;

    .line 81
    .line 82
    sget-object v9, Li0/l;->a:Li0/e;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    const p1, -0x7e018e68

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7, p1}, Li0/h0;->a0(I)V

    .line 90
    .line 91
    .line 92
    move-object p1, v3

    .line 93
    sget-object v3, Lwb/y2;->k:Lwb/y2;

    .line 94
    .line 95
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/util/Set;

    .line 100
    .line 101
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/util/Set;

    .line 106
    .line 107
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne v2, v9, :cond_4

    .line 112
    .line 113
    new-instance v2, Lwb/ad;

    .line 114
    .line 115
    const/16 v8, 0x8

    .line 116
    .line 117
    invoke-direct {v2, v4, v5, v6, v8}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    move-object v9, v2

    .line 124
    check-cast v9, Lfg/l;

    .line 125
    .line 126
    const/high16 v11, 0x1b0000

    .line 127
    .line 128
    iget-object v4, p0, Lwb/vj;->h:Lvb/a;

    .line 129
    .line 130
    iget-object v8, p0, Lwb/vj;->j:Lfg/a;

    .line 131
    .line 132
    move-object v5, p1

    .line 133
    move-object v6, v0

    .line 134
    move-object v10, v7

    .line 135
    move-object v7, v1

    .line 136
    invoke-virtual/range {v3 .. v11}, Lwb/y2;->v(Lvb/a;Landroid/content/SharedPreferences;Ljava/util/Set;Ljava/util/Set;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v12}, Li0/h0;->p(Z)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_4

    .line 143
    .line 144
    :cond_5
    move-object v10, v7

    .line 145
    instance-of v0, v2, Lwb/lo;

    .line 146
    .line 147
    if-eqz v0, :cond_b

    .line 148
    .line 149
    const v0, -0x7e010fd6

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10, v0}, Li0/h0;->a0(I)V

    .line 153
    .line 154
    .line 155
    move-object v0, v2

    .line 156
    check-cast v0, Lwb/lo;

    .line 157
    .line 158
    iget-object v0, v0, Lwb/lo;->b:Lwb/v0;

    .line 159
    .line 160
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    if-ne v7, v9, :cond_6

    .line 165
    .line 166
    new-instance v7, Lwb/gl;

    .line 167
    .line 168
    const/16 v11, 0x14

    .line 169
    .line 170
    invoke-direct {v7, v6, v11}, Lwb/gl;-><init>(Li0/a1;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_6
    move-object v11, v7

    .line 177
    check-cast v11, Lfg/a;

    .line 178
    .line 179
    and-int/lit8 v7, p1, 0xe

    .line 180
    .line 181
    if-eq v7, v1, :cond_8

    .line 182
    .line 183
    and-int/lit8 p1, p1, 0x8

    .line 184
    .line 185
    if-eqz p1, :cond_7

    .line 186
    .line 187
    invoke-virtual {v10, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_7

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_7
    move v8, v12

    .line 195
    :cond_8
    :goto_3
    invoke-virtual {v10, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    or-int/2addr p1, v8

    .line 200
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez p1, :cond_9

    .line 205
    .line 206
    if-ne v1, v9, :cond_a

    .line 207
    .line 208
    :cond_9
    new-instance v1, Leb/o;

    .line 209
    .line 210
    const/16 v7, 0x13

    .line 211
    .line 212
    invoke-direct/range {v1 .. v7}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    move-object v6, v1

    .line 219
    check-cast v6, Lfg/l;

    .line 220
    .line 221
    const/16 v8, 0x180

    .line 222
    .line 223
    iget-object v3, p0, Lwb/vj;->k:Landroid/content/Context;

    .line 224
    .line 225
    move-object v4, v0

    .line 226
    move-object v7, v10

    .line 227
    move-object v5, v11

    .line 228
    invoke-static/range {v3 .. v8}, Lwb/ho;->b0(Landroid/content/Context;Lwb/v0;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10, v12}, Li0/h0;->p(Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_b
    const p1, -0x7e019256

    .line 236
    .line 237
    .line 238
    invoke-static {v10, p1, v12}, Lbc/e;->d(Li0/h0;IZ)Laf/d;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    throw p1

    .line 243
    :cond_c
    move-object v10, v7

    .line 244
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 245
    .line 246
    .line 247
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 248
    .line 249
    return-object p1

    .line 250
    :pswitch_0
    move-object v1, p1

    .line 251
    check-cast v1, Lwb/to;

    .line 252
    .line 253
    move-object v6, p2

    .line 254
    check-cast v6, Li0/h0;

    .line 255
    .line 256
    move-object/from16 p1, p3

    .line 257
    .line 258
    check-cast p1, Ljava/lang/Integer;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    and-int/lit8 v0, p1, 0x6

    .line 268
    .line 269
    const/4 v2, 0x4

    .line 270
    if-nez v0, :cond_f

    .line 271
    .line 272
    and-int/lit8 v0, p1, 0x8

    .line 273
    .line 274
    if-nez v0, :cond_d

    .line 275
    .line 276
    invoke-virtual {v6, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    goto :goto_5

    .line 281
    :cond_d
    invoke-virtual {v6, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    :goto_5
    if-eqz v0, :cond_e

    .line 286
    .line 287
    move v0, v2

    .line 288
    goto :goto_6

    .line 289
    :cond_e
    const/4 v0, 0x2

    .line 290
    :goto_6
    or-int/2addr p1, v0

    .line 291
    :cond_f
    and-int/lit8 v0, p1, 0x13

    .line 292
    .line 293
    const/16 v3, 0x12

    .line 294
    .line 295
    const/4 v4, 0x1

    .line 296
    const/4 v10, 0x0

    .line 297
    if-eq v0, v3, :cond_10

    .line 298
    .line 299
    move v0, v4

    .line 300
    goto :goto_7

    .line 301
    :cond_10
    move v0, v10

    .line 302
    :goto_7
    and-int/lit8 v3, p1, 0x1

    .line 303
    .line 304
    invoke-virtual {v6, v3, v0}, Li0/h0;->S(IZ)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_19

    .line 309
    .line 310
    sget-object v0, Lwb/so;->a:Lwb/so;

    .line 311
    .line 312
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    iget-object v3, p0, Lwb/vj;->i:Landroid/content/SharedPreferences;

    .line 317
    .line 318
    move v5, v4

    .line 319
    iget-object v4, p0, Lwb/vj;->l:Li0/a1;

    .line 320
    .line 321
    move-object v7, v3

    .line 322
    iget-object v3, p0, Lwb/vj;->m:Li0/a1;

    .line 323
    .line 324
    move v8, v5

    .line 325
    iget-object v5, p0, Lwb/vj;->n:Li0/a1;

    .line 326
    .line 327
    sget-object v9, Li0/l;->a:Li0/e;

    .line 328
    .line 329
    if-eqz v0, :cond_12

    .line 330
    .line 331
    const p1, -0x129ffd94

    .line 332
    .line 333
    .line 334
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/util/Set;

    .line 342
    .line 343
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Ljava/util/Set;

    .line 348
    .line 349
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    if-ne v1, v9, :cond_11

    .line 354
    .line 355
    new-instance v1, Lwb/ad;

    .line 356
    .line 357
    const/4 v2, 0x6

    .line 358
    invoke-direct {v1, v3, v4, v5, v2}, Lwb/ad;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :cond_11
    check-cast v1, Lfg/l;

    .line 365
    .line 366
    const/high16 v9, 0x30000

    .line 367
    .line 368
    iget-object v2, p0, Lwb/vj;->h:Lvb/a;

    .line 369
    .line 370
    move-object v8, v6

    .line 371
    iget-object v6, p0, Lwb/vj;->j:Lfg/a;

    .line 372
    .line 373
    move-object v4, p1

    .line 374
    move-object v5, v0

    .line 375
    move-object v3, v7

    .line 376
    move-object v7, v1

    .line 377
    invoke-static/range {v2 .. v9}, Lwb/ho;->m2(Lvb/a;Landroid/content/SharedPreferences;Ljava/util/Set;Ljava/util/Set;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 378
    .line 379
    .line 380
    move-object v7, v8

    .line 381
    invoke-virtual {v7, v10}, Li0/h0;->p(Z)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_9

    .line 385
    .line 386
    :cond_12
    move-object v0, v7

    .line 387
    move-object v7, v6

    .line 388
    instance-of v6, v1, Lwb/ro;

    .line 389
    .line 390
    if-eqz v6, :cond_18

    .line 391
    .line 392
    const v6, -0x129f7eb7

    .line 393
    .line 394
    .line 395
    invoke-virtual {v7, v6}, Li0/h0;->a0(I)V

    .line 396
    .line 397
    .line 398
    move-object v6, v1

    .line 399
    check-cast v6, Lwb/ro;

    .line 400
    .line 401
    iget-object v11, v6, Lwb/ro;->b:Lwb/v0;

    .line 402
    .line 403
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    if-ne v6, v9, :cond_13

    .line 408
    .line 409
    new-instance v6, Lwb/yk;

    .line 410
    .line 411
    const/16 v12, 0x17

    .line 412
    .line 413
    invoke-direct {v6, v5, v12}, Lwb/yk;-><init>(Li0/a1;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_13
    move-object v12, v6

    .line 420
    check-cast v12, Lfg/a;

    .line 421
    .line 422
    and-int/lit8 v6, p1, 0xe

    .line 423
    .line 424
    if-eq v6, v2, :cond_15

    .line 425
    .line 426
    and-int/lit8 p1, p1, 0x8

    .line 427
    .line 428
    if-eqz p1, :cond_14

    .line 429
    .line 430
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-eqz p1, :cond_14

    .line 435
    .line 436
    goto :goto_8

    .line 437
    :cond_14
    move v8, v10

    .line 438
    :cond_15
    :goto_8
    invoke-virtual {v7, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result p1

    .line 442
    or-int/2addr p1, v8

    .line 443
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    if-nez p1, :cond_16

    .line 448
    .line 449
    if-ne v2, v9, :cond_17

    .line 450
    .line 451
    :cond_16
    move-object v2, v0

    .line 452
    new-instance v0, Leb/o;

    .line 453
    .line 454
    const/16 v6, 0x12

    .line 455
    .line 456
    invoke-direct/range {v0 .. v6}, Leb/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    move-object v2, v0

    .line 463
    :cond_17
    move-object v5, v2

    .line 464
    check-cast v5, Lfg/l;

    .line 465
    .line 466
    move-object v8, v7

    .line 467
    const/16 v7, 0x180

    .line 468
    .line 469
    iget-object v2, p0, Lwb/vj;->k:Landroid/content/Context;

    .line 470
    .line 471
    move-object v6, v8

    .line 472
    move-object v3, v11

    .line 473
    move-object v4, v12

    .line 474
    invoke-static/range {v2 .. v7}, Lwb/ho;->b0(Landroid/content/Context;Lwb/v0;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v8, v10}, Li0/h0;->p(Z)V

    .line 478
    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_18
    move-object v8, v7

    .line 482
    const p1, -0x12a00137

    .line 483
    .line 484
    .line 485
    invoke-static {v8, p1, v10}, Lbc/e;->d(Li0/h0;IZ)Laf/d;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    throw p1

    .line 490
    :cond_19
    move-object v8, v6

    .line 491
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 492
    .line 493
    .line 494
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 495
    .line 496
    return-object p1

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
