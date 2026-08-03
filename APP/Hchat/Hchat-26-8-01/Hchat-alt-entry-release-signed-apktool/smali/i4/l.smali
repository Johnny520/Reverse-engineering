.class public final Li4/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lu4/a;


# instance fields
.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li4/i;

    .line 2
    .line 3
    invoke-direct {v0}, Li4/i;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lg8/b;Lv4/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Li4/l;->g:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Li4/l;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "pool == null"

    .line 12
    .line 13
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method

.method public constructor <init>(Li4/z;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/l;->h:Ljava/lang/Object;

    .line 19
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li4/l;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li4/z;Lz4/g;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li4/l;->g:Ljava/lang/Object;

    iput-object p1, p0, Li4/l;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ILi4/k;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v9, "...at bytecode offset "

    .line 8
    .line 9
    iget-object v0, v1, Li4/l;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lv4/e0;

    .line 12
    .line 13
    iget-object v3, v1, Li4/l;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lg8/b;

    .line 16
    .line 17
    iget-object v5, v3, Lg8/b;->b:[B

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v3, v4}, Lg8/b;->e(I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    sget-object v7, Li4/h;->a:[I

    .line 24
    .line 25
    aget v7, v7, v6

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x5

    .line 29
    const/16 v10, 0xac

    .line 30
    .line 31
    const/16 v11, 0x2e

    .line 32
    .line 33
    const/16 v12, 0x4f

    .line 34
    .line 35
    const/4 v13, 0x3

    .line 36
    const/4 v14, 0x2

    .line 37
    const/4 v15, 0x1

    .line 38
    packed-switch v6, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, v6, v4}, Li4/k;->d(II)V

    .line 42
    .line 43
    .line 44
    return v15

    .line 45
    :catch_0
    move-exception v0

    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :catch_1
    move-exception v0

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :pswitch_0
    add-int/lit8 v0, v4, 0x1

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Lg8/b;->b(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    add-int/2addr v0, v4

    .line 58
    const/16 v3, 0xc8

    .line 59
    .line 60
    if-ne v6, v3, :cond_0

    .line 61
    .line 62
    const/16 v3, 0xa7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/16 v3, 0xa8

    .line 66
    .line 67
    :goto_0
    invoke-interface {v2, v3, v4, v8, v0}, Li4/k;->h(IIII)V
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    return v8

    .line 71
    :pswitch_1
    add-int/lit8 v5, v4, 0x1

    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v3, v5}, Lg8/b;->g(I)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    add-int/lit8 v7, v4, 0x3

    .line 78
    .line 79
    invoke-virtual {v3, v7}, Lg8/b;->e(I)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {v0, v5}, Lv4/e0;->l(I)Lv4/a;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v5, 0x4

    .line 88
    const/4 v8, 0x4

    .line 89
    move v3, v6

    .line 90
    move-object v6, v0

    .line 91
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 92
    .line 93
    .line 94
    return v8

    .line 95
    :catch_2
    move-exception v0

    .line 96
    move/from16 v4, p1

    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :catch_3
    move-exception v0

    .line 101
    move/from16 v4, p1

    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :pswitch_2
    invoke-virtual/range {p0 .. p2}, Li4/l;->f(ILi4/k;)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    return v0

    .line 110
    :pswitch_3
    invoke-virtual/range {p0 .. p2}, Li4/l;->c(ILi4/k;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    return v0

    .line 115
    :pswitch_4
    move v2, v6

    .line 116
    add-int/lit8 v4, p1, 0x1

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Lg8/b;->g(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {v0, v3}, Lv4/e0;->l(I)Lv4/a;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    move-object v6, v0

    .line 127
    check-cast v6, Lv4/q;

    .line 128
    .line 129
    const/4 v5, 0x5

    .line 130
    const/4 v7, 0x0

    .line 131
    move/from16 v4, p1

    .line 132
    .line 133
    move v3, v2

    .line 134
    move-object/from16 v2, p2

    .line 135
    .line 136
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 137
    .line 138
    .line 139
    return v8

    .line 140
    :pswitch_5
    move v2, v6

    .line 141
    add-int/lit8 v4, p1, 0x1

    .line 142
    .line 143
    invoke-virtual {v3, v4}, Lg8/b;->g(I)I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    add-int/lit8 v5, p1, 0x3

    .line 148
    .line 149
    invoke-virtual {v3, v5}, Lg8/b;->e(I)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    add-int/lit8 v6, p1, 0x4

    .line 154
    .line 155
    invoke-virtual {v3, v6}, Lg8/b;->e(I)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {v0, v4}, Lv4/e0;->l(I)Lv4/a;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    shl-int/lit8 v0, v3, 0x8

    .line 164
    .line 165
    or-int v7, v5, v0

    .line 166
    .line 167
    const/4 v5, 0x5

    .line 168
    move/from16 v4, p1

    .line 169
    .line 170
    move v3, v2

    .line 171
    move-object/from16 v2, p2

    .line 172
    .line 173
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 174
    .line 175
    .line 176
    return v8

    .line 177
    :pswitch_6
    move v2, v6

    .line 178
    add-int/lit8 v4, p1, 0x1

    .line 179
    .line 180
    invoke-virtual {v3, v4}, Lg8/b;->g(I)I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {v0, v3}, Lv4/e0;->l(I)Lv4/a;

    .line 185
    .line 186
    .line 187
    move-result-object v6
    :try_end_1
    .catch Li4/b0; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 188
    const/4 v5, 0x3

    .line 189
    const/4 v7, 0x0

    .line 190
    move/from16 v4, p1

    .line 191
    .line 192
    move v3, v2

    .line 193
    move-object/from16 v2, p2

    .line 194
    .line 195
    :try_start_2
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 196
    .line 197
    .line 198
    return v13

    .line 199
    :pswitch_7
    move v0, v6

    .line 200
    sget-object v3, Lw4/c;->w:Lw4/c;

    .line 201
    .line 202
    invoke-interface {v2, v0, v4, v3}, Li4/k;->a(IILw4/c;)V

    .line 203
    .line 204
    .line 205
    return v15

    .line 206
    :pswitch_8
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 207
    .line 208
    invoke-interface {v2, v10, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 209
    .line 210
    .line 211
    return v15

    .line 212
    :pswitch_9
    sget-object v0, Lw4/c;->r:Lw4/c;

    .line 213
    .line 214
    invoke-interface {v2, v10, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 215
    .line 216
    .line 217
    return v15

    .line 218
    :pswitch_a
    sget-object v0, Lw4/c;->s:Lw4/c;

    .line 219
    .line 220
    invoke-interface {v2, v10, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 221
    .line 222
    .line 223
    return v15

    .line 224
    :pswitch_b
    sget-object v0, Lw4/c;->u:Lw4/c;

    .line 225
    .line 226
    invoke-interface {v2, v10, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 227
    .line 228
    .line 229
    return v15

    .line 230
    :pswitch_c
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 231
    .line 232
    invoke-interface {v2, v10, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 233
    .line 234
    .line 235
    return v15

    .line 236
    :pswitch_d
    invoke-virtual/range {p0 .. p2}, Li4/l;->b(ILi4/k;)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    return v0

    .line 241
    :pswitch_e
    invoke-virtual/range {p0 .. p2}, Li4/l;->e(ILi4/k;)I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    return v0

    .line 246
    :pswitch_f
    move v0, v6

    .line 247
    add-int/lit8 v5, v4, 0x1

    .line 248
    .line 249
    invoke-virtual {v3, v5}, Lg8/b;->e(I)I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    sget-object v7, Lw4/c;->y:Lw4/c;

    .line 254
    .line 255
    const/4 v8, 0x0

    .line 256
    const/4 v5, 0x2

    .line 257
    move v3, v0

    .line 258
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 259
    .line 260
    .line 261
    return v14

    .line 262
    :pswitch_10
    move v0, v6

    .line 263
    add-int/lit8 v5, v4, 0x1

    .line 264
    .line 265
    invoke-virtual {v3, v5}, Lg8/b;->d(I)I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    add-int/2addr v3, v4

    .line 270
    invoke-interface {v2, v0, v4, v13, v3}, Li4/k;->h(IIII)V

    .line 271
    .line 272
    .line 273
    return v13

    .line 274
    :pswitch_11
    move v0, v6

    .line 275
    sget-object v3, Lw4/c;->t:Lw4/c;

    .line 276
    .line 277
    invoke-interface {v2, v0, v4, v3}, Li4/k;->a(IILw4/c;)V

    .line 278
    .line 279
    .line 280
    return v15

    .line 281
    :pswitch_12
    move v0, v6

    .line 282
    sget-object v3, Lw4/c;->r:Lw4/c;

    .line 283
    .line 284
    invoke-interface {v2, v0, v4, v3}, Li4/k;->a(IILw4/c;)V

    .line 285
    .line 286
    .line 287
    return v15

    .line 288
    :pswitch_13
    move v0, v6

    .line 289
    sget-object v3, Lw4/c;->s:Lw4/c;

    .line 290
    .line 291
    invoke-interface {v2, v0, v4, v3}, Li4/k;->a(IILw4/c;)V

    .line 292
    .line 293
    .line 294
    return v15

    .line 295
    :pswitch_14
    move v0, v6

    .line 296
    sget-object v3, Lw4/c;->u:Lw4/c;

    .line 297
    .line 298
    invoke-interface {v2, v0, v4, v3}, Li4/k;->a(IILw4/c;)V

    .line 299
    .line 300
    .line 301
    return v15

    .line 302
    :pswitch_15
    move v0, v6

    .line 303
    add-int/lit8 v6, v4, 0x1

    .line 304
    .line 305
    invoke-virtual {v3, v6}, Lg8/b;->e(I)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    add-int/lit8 v7, v4, 0x2

    .line 310
    .line 311
    add-int/lit8 v8, v4, 0x3

    .line 312
    .line 313
    invoke-virtual {v3, v7, v8}, Lg8/b;->a(II)V

    .line 314
    .line 315
    .line 316
    aget-byte v8, v5, v7

    .line 317
    .line 318
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 319
    .line 320
    const/4 v5, 0x3

    .line 321
    move v3, v0

    .line 322
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 323
    .line 324
    .line 325
    return v13

    .line 326
    :pswitch_16
    move v3, v6

    .line 327
    add-int/lit8 v6, v3, -0x3

    .line 328
    .line 329
    sget-object v0, Lw4/c;->r:Lw4/c;

    .line 330
    .line 331
    invoke-interface {v2, v6, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 332
    .line 333
    .line 334
    return v15

    .line 335
    :pswitch_17
    move v3, v6

    .line 336
    add-int/lit8 v6, v3, -0x2

    .line 337
    .line 338
    sget-object v0, Lw4/c;->s:Lw4/c;

    .line 339
    .line 340
    invoke-interface {v2, v6, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 341
    .line 342
    .line 343
    return v15

    .line 344
    :pswitch_18
    move v3, v6

    .line 345
    add-int/lit8 v6, v3, -0x1

    .line 346
    .line 347
    sget-object v0, Lw4/c;->u:Lw4/c;

    .line 348
    .line 349
    invoke-interface {v2, v6, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 350
    .line 351
    .line 352
    return v15

    .line 353
    :pswitch_19
    move v3, v6

    .line 354
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 355
    .line 356
    invoke-interface {v2, v3, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 357
    .line 358
    .line 359
    return v15

    .line 360
    :pswitch_1a
    move v3, v6

    .line 361
    sget-object v0, Lw4/c;->w:Lw4/c;

    .line 362
    .line 363
    invoke-interface {v2, v3, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 364
    .line 365
    .line 366
    return v15

    .line 367
    :pswitch_1b
    sget-object v0, Lw4/c;->v:Lw4/c;

    .line 368
    .line 369
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 370
    .line 371
    .line 372
    return v15

    .line 373
    :pswitch_1c
    sget-object v0, Lw4/c;->q:Lw4/c;

    .line 374
    .line 375
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 376
    .line 377
    .line 378
    return v15

    .line 379
    :pswitch_1d
    sget-object v0, Lw4/c;->p:Lw4/c;

    .line 380
    .line 381
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 382
    .line 383
    .line 384
    return v15

    .line 385
    :pswitch_1e
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 386
    .line 387
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 388
    .line 389
    .line 390
    return v15

    .line 391
    :pswitch_1f
    sget-object v0, Lw4/c;->r:Lw4/c;

    .line 392
    .line 393
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 394
    .line 395
    .line 396
    return v15

    .line 397
    :pswitch_20
    sget-object v0, Lw4/c;->s:Lw4/c;

    .line 398
    .line 399
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 400
    .line 401
    .line 402
    return v15

    .line 403
    :pswitch_21
    sget-object v0, Lw4/c;->u:Lw4/c;

    .line 404
    .line 405
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 406
    .line 407
    .line 408
    return v15

    .line 409
    :pswitch_22
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 410
    .line 411
    invoke-interface {v2, v12, v4, v0}, Li4/k;->a(IILw4/c;)V
    :try_end_2
    .catch Li4/b0; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 412
    .line 413
    .line 414
    return v15

    .line 415
    :pswitch_23
    move v3, v6

    .line 416
    add-int/lit8 v6, v3, -0x4b

    .line 417
    .line 418
    :try_start_3
    sget-object v7, Lw4/c;->E:Lw4/c;

    .line 419
    .line 420
    const/4 v8, 0x0

    .line 421
    const/16 v3, 0x36

    .line 422
    .line 423
    const/4 v5, 0x1

    .line 424
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 425
    .line 426
    .line 427
    return v15

    .line 428
    :pswitch_24
    move v3, v6

    .line 429
    add-int/lit8 v6, v3, -0x47

    .line 430
    .line 431
    sget-object v7, Lw4/c;->r:Lw4/c;

    .line 432
    .line 433
    const/4 v8, 0x0

    .line 434
    const/16 v3, 0x36

    .line 435
    .line 436
    const/4 v5, 0x1

    .line 437
    move/from16 v4, p1

    .line 438
    .line 439
    move-object/from16 v2, p2

    .line 440
    .line 441
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 442
    .line 443
    .line 444
    return v15

    .line 445
    :pswitch_25
    move v3, v6

    .line 446
    add-int/lit8 v6, v3, -0x43

    .line 447
    .line 448
    sget-object v7, Lw4/c;->s:Lw4/c;

    .line 449
    .line 450
    const/4 v8, 0x0

    .line 451
    const/16 v3, 0x36

    .line 452
    .line 453
    const/4 v5, 0x1

    .line 454
    move/from16 v4, p1

    .line 455
    .line 456
    move-object/from16 v2, p2

    .line 457
    .line 458
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 459
    .line 460
    .line 461
    return v15

    .line 462
    :pswitch_26
    move v3, v6

    .line 463
    add-int/lit8 v6, v3, -0x3f

    .line 464
    .line 465
    sget-object v7, Lw4/c;->u:Lw4/c;

    .line 466
    .line 467
    const/4 v8, 0x0

    .line 468
    const/16 v3, 0x36

    .line 469
    .line 470
    const/4 v5, 0x1

    .line 471
    move/from16 v4, p1

    .line 472
    .line 473
    move-object/from16 v2, p2

    .line 474
    .line 475
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 476
    .line 477
    .line 478
    return v15

    .line 479
    :pswitch_27
    move v3, v6

    .line 480
    add-int/lit8 v6, v3, -0x3b

    .line 481
    .line 482
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 483
    .line 484
    const/4 v8, 0x0

    .line 485
    const/16 v3, 0x36

    .line 486
    .line 487
    const/4 v5, 0x1

    .line 488
    move/from16 v4, p1

    .line 489
    .line 490
    move-object/from16 v2, p2

    .line 491
    .line 492
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 493
    .line 494
    .line 495
    return v15

    .line 496
    :pswitch_28
    add-int/lit8 v0, p1, 0x1

    .line 497
    .line 498
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 499
    .line 500
    .line 501
    move-result v6

    .line 502
    sget-object v7, Lw4/c;->E:Lw4/c;

    .line 503
    .line 504
    const/4 v8, 0x0

    .line 505
    const/16 v3, 0x36

    .line 506
    .line 507
    const/4 v5, 0x2

    .line 508
    move/from16 v4, p1

    .line 509
    .line 510
    move-object/from16 v2, p2

    .line 511
    .line 512
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 513
    .line 514
    .line 515
    return v14

    .line 516
    :pswitch_29
    add-int/lit8 v0, p1, 0x1

    .line 517
    .line 518
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    sget-object v7, Lw4/c;->r:Lw4/c;

    .line 523
    .line 524
    const/4 v8, 0x0

    .line 525
    const/16 v3, 0x36

    .line 526
    .line 527
    const/4 v5, 0x2

    .line 528
    move/from16 v4, p1

    .line 529
    .line 530
    move-object/from16 v2, p2

    .line 531
    .line 532
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 533
    .line 534
    .line 535
    return v14

    .line 536
    :pswitch_2a
    add-int/lit8 v0, p1, 0x1

    .line 537
    .line 538
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    sget-object v7, Lw4/c;->s:Lw4/c;

    .line 543
    .line 544
    const/4 v8, 0x0

    .line 545
    const/16 v3, 0x36

    .line 546
    .line 547
    const/4 v5, 0x2

    .line 548
    move/from16 v4, p1

    .line 549
    .line 550
    move-object/from16 v2, p2

    .line 551
    .line 552
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 553
    .line 554
    .line 555
    return v14

    .line 556
    :pswitch_2b
    add-int/lit8 v0, p1, 0x1

    .line 557
    .line 558
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    sget-object v7, Lw4/c;->u:Lw4/c;

    .line 563
    .line 564
    const/4 v8, 0x0

    .line 565
    const/16 v3, 0x36

    .line 566
    .line 567
    const/4 v5, 0x2

    .line 568
    move/from16 v4, p1

    .line 569
    .line 570
    move-object/from16 v2, p2

    .line 571
    .line 572
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 573
    .line 574
    .line 575
    return v14

    .line 576
    :pswitch_2c
    add-int/lit8 v0, p1, 0x1

    .line 577
    .line 578
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 579
    .line 580
    .line 581
    move-result v6

    .line 582
    sget-object v7, Lw4/c;->t:Lw4/c;
    :try_end_3
    .catch Li4/b0; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 583
    .line 584
    const/4 v8, 0x0

    .line 585
    const/16 v3, 0x36

    .line 586
    .line 587
    const/4 v5, 0x2

    .line 588
    move/from16 v4, p1

    .line 589
    .line 590
    move-object/from16 v2, p2

    .line 591
    .line 592
    :try_start_4
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 593
    .line 594
    .line 595
    return v14

    .line 596
    :pswitch_2d
    sget-object v0, Lw4/c;->v:Lw4/c;

    .line 597
    .line 598
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 599
    .line 600
    .line 601
    return v15

    .line 602
    :pswitch_2e
    sget-object v0, Lw4/c;->q:Lw4/c;

    .line 603
    .line 604
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 605
    .line 606
    .line 607
    return v15

    .line 608
    :pswitch_2f
    sget-object v0, Lw4/c;->p:Lw4/c;

    .line 609
    .line 610
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 611
    .line 612
    .line 613
    return v15

    .line 614
    :pswitch_30
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 615
    .line 616
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 617
    .line 618
    .line 619
    return v15

    .line 620
    :pswitch_31
    sget-object v0, Lw4/c;->r:Lw4/c;

    .line 621
    .line 622
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 623
    .line 624
    .line 625
    return v15

    .line 626
    :pswitch_32
    sget-object v0, Lw4/c;->s:Lw4/c;

    .line 627
    .line 628
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 629
    .line 630
    .line 631
    return v15

    .line 632
    :pswitch_33
    sget-object v0, Lw4/c;->u:Lw4/c;

    .line 633
    .line 634
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V

    .line 635
    .line 636
    .line 637
    return v15

    .line 638
    :pswitch_34
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 639
    .line 640
    invoke-interface {v2, v11, v4, v0}, Li4/k;->a(IILw4/c;)V
    :try_end_4
    .catch Li4/b0; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    .line 641
    .line 642
    .line 643
    return v15

    .line 644
    :pswitch_35
    move v3, v6

    .line 645
    add-int/lit8 v6, v3, -0x2a

    .line 646
    .line 647
    :try_start_5
    sget-object v7, Lw4/c;->E:Lw4/c;

    .line 648
    .line 649
    const/4 v8, 0x0

    .line 650
    const/16 v3, 0x15

    .line 651
    .line 652
    const/4 v5, 0x1

    .line 653
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 654
    .line 655
    .line 656
    return v15

    .line 657
    :pswitch_36
    move v3, v6

    .line 658
    add-int/lit8 v6, v3, -0x26

    .line 659
    .line 660
    sget-object v7, Lw4/c;->r:Lw4/c;

    .line 661
    .line 662
    const/4 v8, 0x0

    .line 663
    const/16 v3, 0x15

    .line 664
    .line 665
    const/4 v5, 0x1

    .line 666
    move/from16 v4, p1

    .line 667
    .line 668
    move-object/from16 v2, p2

    .line 669
    .line 670
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 671
    .line 672
    .line 673
    return v15

    .line 674
    :pswitch_37
    move v3, v6

    .line 675
    add-int/lit8 v6, v3, -0x22

    .line 676
    .line 677
    sget-object v7, Lw4/c;->s:Lw4/c;

    .line 678
    .line 679
    const/4 v8, 0x0

    .line 680
    const/16 v3, 0x15

    .line 681
    .line 682
    const/4 v5, 0x1

    .line 683
    move/from16 v4, p1

    .line 684
    .line 685
    move-object/from16 v2, p2

    .line 686
    .line 687
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 688
    .line 689
    .line 690
    return v15

    .line 691
    :pswitch_38
    move v3, v6

    .line 692
    add-int/lit8 v6, v3, -0x1e

    .line 693
    .line 694
    sget-object v7, Lw4/c;->u:Lw4/c;

    .line 695
    .line 696
    const/4 v8, 0x0

    .line 697
    const/16 v3, 0x15

    .line 698
    .line 699
    const/4 v5, 0x1

    .line 700
    move/from16 v4, p1

    .line 701
    .line 702
    move-object/from16 v2, p2

    .line 703
    .line 704
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 705
    .line 706
    .line 707
    return v15

    .line 708
    :pswitch_39
    move v3, v6

    .line 709
    add-int/lit8 v6, v3, -0x1a

    .line 710
    .line 711
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 712
    .line 713
    const/4 v8, 0x0

    .line 714
    const/16 v3, 0x15

    .line 715
    .line 716
    const/4 v5, 0x1

    .line 717
    move/from16 v4, p1

    .line 718
    .line 719
    move-object/from16 v2, p2

    .line 720
    .line 721
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 722
    .line 723
    .line 724
    return v15

    .line 725
    :pswitch_3a
    add-int/lit8 v0, p1, 0x1

    .line 726
    .line 727
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 728
    .line 729
    .line 730
    move-result v6

    .line 731
    sget-object v7, Lw4/c;->E:Lw4/c;

    .line 732
    .line 733
    const/4 v8, 0x0

    .line 734
    const/16 v3, 0x15

    .line 735
    .line 736
    const/4 v5, 0x2

    .line 737
    move/from16 v4, p1

    .line 738
    .line 739
    move-object/from16 v2, p2

    .line 740
    .line 741
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 742
    .line 743
    .line 744
    return v14

    .line 745
    :pswitch_3b
    add-int/lit8 v0, p1, 0x1

    .line 746
    .line 747
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 748
    .line 749
    .line 750
    move-result v6

    .line 751
    sget-object v7, Lw4/c;->r:Lw4/c;

    .line 752
    .line 753
    const/4 v8, 0x0

    .line 754
    const/16 v3, 0x15

    .line 755
    .line 756
    const/4 v5, 0x2

    .line 757
    move/from16 v4, p1

    .line 758
    .line 759
    move-object/from16 v2, p2

    .line 760
    .line 761
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 762
    .line 763
    .line 764
    return v14

    .line 765
    :pswitch_3c
    add-int/lit8 v0, p1, 0x1

    .line 766
    .line 767
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    sget-object v7, Lw4/c;->s:Lw4/c;

    .line 772
    .line 773
    const/4 v8, 0x0

    .line 774
    const/16 v3, 0x15

    .line 775
    .line 776
    const/4 v5, 0x2

    .line 777
    move/from16 v4, p1

    .line 778
    .line 779
    move-object/from16 v2, p2

    .line 780
    .line 781
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 782
    .line 783
    .line 784
    return v14

    .line 785
    :pswitch_3d
    add-int/lit8 v0, p1, 0x1

    .line 786
    .line 787
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 788
    .line 789
    .line 790
    move-result v6

    .line 791
    sget-object v7, Lw4/c;->u:Lw4/c;

    .line 792
    .line 793
    const/4 v8, 0x0

    .line 794
    const/16 v3, 0x15

    .line 795
    .line 796
    const/4 v5, 0x2

    .line 797
    move/from16 v4, p1

    .line 798
    .line 799
    move-object/from16 v2, p2

    .line 800
    .line 801
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 802
    .line 803
    .line 804
    return v14

    .line 805
    :pswitch_3e
    add-int/lit8 v0, p1, 0x1

    .line 806
    .line 807
    invoke-virtual {v3, v0}, Lg8/b;->e(I)I

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 812
    .line 813
    const/4 v8, 0x0

    .line 814
    const/16 v3, 0x15

    .line 815
    .line 816
    const/4 v5, 0x2

    .line 817
    move/from16 v4, p1

    .line 818
    .line 819
    move-object/from16 v2, p2

    .line 820
    .line 821
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 822
    .line 823
    .line 824
    return v14

    .line 825
    :pswitch_3f
    add-int/lit8 v2, p1, 0x1

    .line 826
    .line 827
    invoke-virtual {v3, v2}, Lg8/b;->g(I)I

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    invoke-virtual {v0, v2}, Lv4/e0;->l(I)Lv4/a;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    const/4 v5, 0x3

    .line 836
    const/4 v7, 0x0

    .line 837
    const/16 v3, 0x14

    .line 838
    .line 839
    move/from16 v4, p1

    .line 840
    .line 841
    move-object/from16 v2, p2

    .line 842
    .line 843
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 844
    .line 845
    .line 846
    return v13

    .line 847
    :pswitch_40
    add-int/lit8 v2, p1, 0x1

    .line 848
    .line 849
    invoke-virtual {v3, v2}, Lg8/b;->g(I)I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    invoke-virtual {v0, v2}, Lv4/e0;->l(I)Lv4/a;

    .line 854
    .line 855
    .line 856
    move-result-object v6

    .line 857
    instance-of v0, v6, Lv4/o;

    .line 858
    .line 859
    if-eqz v0, :cond_1

    .line 860
    .line 861
    move-object v0, v6

    .line 862
    check-cast v0, Lv4/o;

    .line 863
    .line 864
    invoke-virtual {v0}, Lv4/o;->n()I

    .line 865
    .line 866
    .line 867
    move-result v7

    .line 868
    :cond_1
    const/16 v3, 0x12

    .line 869
    .line 870
    const/4 v5, 0x3

    .line 871
    move/from16 v4, p1

    .line 872
    .line 873
    move-object/from16 v2, p2

    .line 874
    .line 875
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 876
    .line 877
    .line 878
    return v13

    .line 879
    :pswitch_41
    add-int/lit8 v2, p1, 0x1

    .line 880
    .line 881
    invoke-virtual {v3, v2}, Lg8/b;->e(I)I

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    invoke-virtual {v0, v2}, Lv4/e0;->l(I)Lv4/a;

    .line 886
    .line 887
    .line 888
    move-result-object v6

    .line 889
    instance-of v0, v6, Lv4/o;

    .line 890
    .line 891
    if-eqz v0, :cond_2

    .line 892
    .line 893
    move-object v0, v6

    .line 894
    check-cast v0, Lv4/o;

    .line 895
    .line 896
    invoke-virtual {v0}, Lv4/o;->n()I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    :cond_2
    const/16 v3, 0x12

    .line 901
    .line 902
    const/4 v5, 0x2

    .line 903
    move/from16 v4, p1

    .line 904
    .line 905
    move-object/from16 v2, p2

    .line 906
    .line 907
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 908
    .line 909
    .line 910
    return v14

    .line 911
    :pswitch_42
    add-int/lit8 v0, p1, 0x1

    .line 912
    .line 913
    invoke-virtual {v3, v0}, Lg8/b;->d(I)I

    .line 914
    .line 915
    .line 916
    move-result v7

    .line 917
    invoke-static {v7}, Lv4/o;->o(I)Lv4/o;

    .line 918
    .line 919
    .line 920
    move-result-object v6

    .line 921
    const/16 v3, 0x12

    .line 922
    .line 923
    const/4 v5, 0x3

    .line 924
    move/from16 v4, p1

    .line 925
    .line 926
    move-object/from16 v2, p2

    .line 927
    .line 928
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 929
    .line 930
    .line 931
    return v13

    .line 932
    :pswitch_43
    add-int/lit8 v0, p1, 0x1

    .line 933
    .line 934
    add-int/lit8 v2, p1, 0x2

    .line 935
    .line 936
    invoke-virtual {v3, v0, v2}, Lg8/b;->a(II)V

    .line 937
    .line 938
    .line 939
    aget-byte v7, v5, v0

    .line 940
    .line 941
    invoke-static {v7}, Lv4/o;->o(I)Lv4/o;

    .line 942
    .line 943
    .line 944
    move-result-object v6

    .line 945
    const/16 v3, 0x12

    .line 946
    .line 947
    const/4 v5, 0x2

    .line 948
    move/from16 v4, p1

    .line 949
    .line 950
    move-object/from16 v2, p2

    .line 951
    .line 952
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 953
    .line 954
    .line 955
    return v14

    .line 956
    :pswitch_44
    sget-object v6, Lv4/k;->i:Lv4/k;

    .line 957
    .line 958
    const/4 v7, 0x0

    .line 959
    const/16 v3, 0x12

    .line 960
    .line 961
    const/4 v5, 0x1

    .line 962
    move/from16 v4, p1

    .line 963
    .line 964
    move-object/from16 v2, p2

    .line 965
    .line 966
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 967
    .line 968
    .line 969
    return v15

    .line 970
    :pswitch_45
    sget-object v6, Lv4/k;->h:Lv4/k;

    .line 971
    .line 972
    const/4 v7, 0x0

    .line 973
    const/16 v3, 0x12

    .line 974
    .line 975
    const/4 v5, 0x1

    .line 976
    move/from16 v4, p1

    .line 977
    .line 978
    move-object/from16 v2, p2

    .line 979
    .line 980
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 981
    .line 982
    .line 983
    return v15

    .line 984
    :pswitch_46
    sget-object v6, Lv4/n;->j:Lv4/n;

    .line 985
    .line 986
    const/4 v7, 0x0

    .line 987
    const/16 v3, 0x12

    .line 988
    .line 989
    const/4 v5, 0x1

    .line 990
    move/from16 v4, p1

    .line 991
    .line 992
    move-object/from16 v2, p2

    .line 993
    .line 994
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 995
    .line 996
    .line 997
    return v15

    .line 998
    :pswitch_47
    sget-object v6, Lv4/n;->i:Lv4/n;

    .line 999
    .line 1000
    const/4 v7, 0x0

    .line 1001
    const/16 v3, 0x12

    .line 1002
    .line 1003
    const/4 v5, 0x1

    .line 1004
    move/from16 v4, p1

    .line 1005
    .line 1006
    move-object/from16 v2, p2

    .line 1007
    .line 1008
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1009
    .line 1010
    .line 1011
    return v15

    .line 1012
    :pswitch_48
    sget-object v6, Lv4/n;->h:Lv4/n;

    .line 1013
    .line 1014
    const/4 v7, 0x0

    .line 1015
    const/16 v3, 0x12

    .line 1016
    .line 1017
    const/4 v5, 0x1

    .line 1018
    move/from16 v4, p1

    .line 1019
    .line 1020
    move-object/from16 v2, p2

    .line 1021
    .line 1022
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1023
    .line 1024
    .line 1025
    return v15

    .line 1026
    :pswitch_49
    sget-object v6, Lv4/v;->i:Lv4/v;

    .line 1027
    .line 1028
    const/4 v7, 0x0

    .line 1029
    const/16 v3, 0x12

    .line 1030
    .line 1031
    const/4 v5, 0x1

    .line 1032
    move/from16 v4, p1

    .line 1033
    .line 1034
    move-object/from16 v2, p2

    .line 1035
    .line 1036
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1037
    .line 1038
    .line 1039
    return v15

    .line 1040
    :pswitch_4a
    sget-object v6, Lv4/v;->h:Lv4/v;

    .line 1041
    .line 1042
    const/4 v7, 0x0

    .line 1043
    const/16 v3, 0x12

    .line 1044
    .line 1045
    const/4 v5, 0x1

    .line 1046
    move/from16 v4, p1

    .line 1047
    .line 1048
    move-object/from16 v2, p2

    .line 1049
    .line 1050
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1051
    .line 1052
    .line 1053
    return v15

    .line 1054
    :pswitch_4b
    sget-object v6, Lv4/o;->o:Lv4/o;

    .line 1055
    .line 1056
    const/4 v7, 0x5

    .line 1057
    const/16 v3, 0x12

    .line 1058
    .line 1059
    const/4 v5, 0x1

    .line 1060
    move/from16 v4, p1

    .line 1061
    .line 1062
    move-object/from16 v2, p2

    .line 1063
    .line 1064
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1065
    .line 1066
    .line 1067
    return v15

    .line 1068
    :pswitch_4c
    sget-object v6, Lv4/o;->n:Lv4/o;

    .line 1069
    .line 1070
    const/4 v7, 0x4

    .line 1071
    const/16 v3, 0x12

    .line 1072
    .line 1073
    const/4 v5, 0x1

    .line 1074
    move/from16 v4, p1

    .line 1075
    .line 1076
    move-object/from16 v2, p2

    .line 1077
    .line 1078
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1079
    .line 1080
    .line 1081
    return v15

    .line 1082
    :pswitch_4d
    sget-object v6, Lv4/o;->m:Lv4/o;

    .line 1083
    .line 1084
    const/4 v7, 0x3

    .line 1085
    const/16 v3, 0x12

    .line 1086
    .line 1087
    const/4 v5, 0x1

    .line 1088
    move/from16 v4, p1

    .line 1089
    .line 1090
    move-object/from16 v2, p2

    .line 1091
    .line 1092
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1093
    .line 1094
    .line 1095
    return v15

    .line 1096
    :pswitch_4e
    sget-object v6, Lv4/o;->l:Lv4/o;

    .line 1097
    .line 1098
    const/4 v7, 0x2

    .line 1099
    const/16 v3, 0x12

    .line 1100
    .line 1101
    const/4 v5, 0x1

    .line 1102
    move/from16 v4, p1

    .line 1103
    .line 1104
    move-object/from16 v2, p2

    .line 1105
    .line 1106
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1107
    .line 1108
    .line 1109
    return v15

    .line 1110
    :pswitch_4f
    sget-object v6, Lv4/o;->k:Lv4/o;

    .line 1111
    .line 1112
    const/4 v7, 0x1

    .line 1113
    const/16 v3, 0x12

    .line 1114
    .line 1115
    const/4 v5, 0x1

    .line 1116
    move/from16 v4, p1

    .line 1117
    .line 1118
    move-object/from16 v2, p2

    .line 1119
    .line 1120
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1121
    .line 1122
    .line 1123
    return v15

    .line 1124
    :pswitch_50
    sget-object v6, Lv4/o;->j:Lv4/o;

    .line 1125
    .line 1126
    const/4 v7, 0x0

    .line 1127
    const/16 v3, 0x12

    .line 1128
    .line 1129
    const/4 v5, 0x1

    .line 1130
    move/from16 v4, p1

    .line 1131
    .line 1132
    move-object/from16 v2, p2

    .line 1133
    .line 1134
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1135
    .line 1136
    .line 1137
    return v15

    .line 1138
    :pswitch_51
    sget-object v6, Lv4/o;->i:Lv4/o;

    .line 1139
    .line 1140
    const/4 v7, -0x1

    .line 1141
    const/16 v3, 0x12

    .line 1142
    .line 1143
    const/4 v5, 0x1

    .line 1144
    move/from16 v4, p1

    .line 1145
    .line 1146
    move-object/from16 v2, p2

    .line 1147
    .line 1148
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1149
    .line 1150
    .line 1151
    return v15

    .line 1152
    :pswitch_52
    sget-object v6, Lv4/r;->g:Lv4/r;
    :try_end_5
    .catch Li4/b0; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    .line 1153
    .line 1154
    const/4 v7, 0x0

    .line 1155
    const/16 v3, 0x12

    .line 1156
    .line 1157
    const/4 v5, 0x1

    .line 1158
    move/from16 v4, p1

    .line 1159
    .line 1160
    move-object/from16 v2, p2

    .line 1161
    .line 1162
    :try_start_6
    invoke-interface/range {v2 .. v7}, Li4/k;->b(IIILv4/a;I)V

    .line 1163
    .line 1164
    .line 1165
    return v15

    .line 1166
    :pswitch_53
    move v3, v6

    .line 1167
    sget-object v0, Lw4/c;->w:Lw4/c;

    .line 1168
    .line 1169
    invoke-interface {v2, v3, v4, v0}, Li4/k;->a(IILw4/c;)V
    :try_end_6
    .catch Li4/b0; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    .line 1170
    .line 1171
    .line 1172
    return v15

    .line 1173
    :goto_1
    new-instance v2, Li4/b0;

    .line 1174
    .line 1175
    const/4 v3, 0x0

    .line 1176
    invoke-direct {v2, v3, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-virtual {v2, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    throw v2

    .line 1191
    :goto_2
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v2

    .line 1199
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    throw v0

    .line 1203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_13
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
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
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_11
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_10
        :pswitch_10
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(ILi4/k;)I
    .locals 10

    .line 1
    iget-object v0, p0, Li4/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x4

    .line 6
    .line 7
    and-int/lit8 v1, v1, -0x4

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    shl-int/lit8 v4, v4, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lg8/b;->e(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    or-int/2addr v4, v5

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0, v1}, Lg8/b;->b(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    add-int/lit8 v5, v1, 0x4

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Lg8/b;->b(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/lit8 v1, v1, 0x8

    .line 37
    .line 38
    new-instance v6, Li4/n;

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    invoke-direct {v6, v5, v7}, Li4/n;-><init>(II)V

    .line 42
    .line 43
    .line 44
    :goto_1
    if-ge v3, v5, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lg8/b;->b(I)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    add-int/lit8 v8, v1, 0x4

    .line 51
    .line 52
    invoke-virtual {v0, v8}, Lg8/b;->b(I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    add-int/2addr v8, p1

    .line 57
    add-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    invoke-virtual {v6}, Lz4/j;->j()V

    .line 60
    .line 61
    .line 62
    if-ltz v8, :cond_1

    .line 63
    .line 64
    iget-object v9, v6, Li4/n;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v9, Lz4/g;

    .line 67
    .line 68
    invoke-virtual {v9, v7}, Lz4/g;->l(I)V

    .line 69
    .line 70
    .line 71
    iget-object v7, v6, Li4/n;->k:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v7, Lz4/g;

    .line 74
    .line 75
    invoke-virtual {v7, v8}, Lz4/g;->l(I)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const-string p1, "target < 0"

    .line 82
    .line 83
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    return p1

    .line 88
    :cond_2
    invoke-virtual {v6, v2}, Li4/n;->s(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Li4/n;->r()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Li4/n;->i()V

    .line 95
    .line 96
    .line 97
    sub-int/2addr v1, p1

    .line 98
    invoke-interface {p2, p1, v1, v6, v4}, Li4/k;->g(IILi4/n;I)V

    .line 99
    .line 100
    .line 101
    return v1
.end method

.method public c(ILi4/k;)I
    .locals 13

    .line 1
    iget-object v0, p0, Li4/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg8/b;->e(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, Li4/b0;

    .line 16
    .line 17
    invoke-static {v1}, La/a;->W0(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "bad newarray code "

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :pswitch_0
    sget-object v3, Lv4/d0;->y:Lv4/d0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    sget-object v3, Lv4/d0;->z:Lv4/d0;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    sget-object v3, Lv4/d0;->A:Lv4/d0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_3
    sget-object v3, Lv4/d0;->u:Lv4/d0;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_4
    sget-object v3, Lv4/d0;->w:Lv4/d0;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_5
    sget-object v3, Lv4/d0;->x:Lv4/d0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_6
    sget-object v3, Lv4/d0;->v:Lv4/d0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_7
    sget-object v3, Lv4/d0;->t:Lv4/d0;

    .line 53
    .line 54
    :goto_0
    invoke-interface {p2}, Li4/k;->f()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    new-instance v5, Li4/j;

    .line 59
    .line 60
    invoke-direct {v5}, Li4/i;-><init>()V

    .line 61
    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    if-ltz v4, :cond_0

    .line 65
    .line 66
    invoke-virtual {p0, v4, v5}, Li4/l;->a(ILi4/k;)I

    .line 67
    .line 68
    .line 69
    iget-object v7, v5, Li4/j;->h:Lv4/a;

    .line 70
    .line 71
    instance-of v7, v7, Lv4/o;

    .line 72
    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    iget v7, v5, Li4/j;->i:I

    .line 76
    .line 77
    add-int/2addr v7, v4

    .line 78
    if-ne v7, p1, :cond_0

    .line 79
    .line 80
    iget v4, v5, Li4/j;->j:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    move v4, v6

    .line 84
    :goto_1
    add-int/lit8 v7, p1, 0x2

    .line 85
    .line 86
    new-instance v8, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    :goto_2
    add-int/lit8 v9, v7, 0x1

    .line 94
    .line 95
    invoke-virtual {v0, v7}, Lg8/b;->e(I)I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    const/16 v11, 0x59

    .line 100
    .line 101
    if-eq v10, v11, :cond_1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_1
    invoke-virtual {p0, v9, v5}, Li4/l;->a(ILi4/k;)I

    .line 105
    .line 106
    .line 107
    iget v10, v5, Li4/j;->i:I

    .line 108
    .line 109
    if-eqz v10, :cond_5

    .line 110
    .line 111
    iget-object v11, v5, Li4/j;->h:Lv4/a;

    .line 112
    .line 113
    instance-of v11, v11, Lv4/o;

    .line 114
    .line 115
    if-eqz v11, :cond_5

    .line 116
    .line 117
    iget v11, v5, Li4/j;->j:I

    .line 118
    .line 119
    if-eq v11, v6, :cond_2

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_2
    add-int/2addr v9, v10

    .line 123
    invoke-virtual {p0, v9, v5}, Li4/l;->a(ILi4/k;)I

    .line 124
    .line 125
    .line 126
    iget v10, v5, Li4/j;->i:I

    .line 127
    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    iget-object v11, v5, Li4/j;->h:Lv4/a;

    .line 131
    .line 132
    instance-of v12, v11, Lv4/u;

    .line 133
    .line 134
    if-nez v12, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    add-int/2addr v9, v10

    .line 138
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    add-int/lit8 v10, v9, 0x1

    .line 142
    .line 143
    invoke-virtual {v0, v9}, Lg8/b;->e(I)I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    packed-switch v1, :pswitch_data_1

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :pswitch_8
    const/16 v11, 0x50

    .line 152
    .line 153
    if-eq v9, v11, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :pswitch_9
    const/16 v11, 0x4f

    .line 157
    .line 158
    if-eq v9, v11, :cond_4

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :pswitch_a
    const/16 v11, 0x56

    .line 162
    .line 163
    if-eq v9, v11, :cond_4

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :pswitch_b
    const/16 v11, 0x52

    .line 167
    .line 168
    if-eq v9, v11, :cond_4

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :pswitch_c
    const/16 v11, 0x51

    .line 172
    .line 173
    if-eq v9, v11, :cond_4

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :pswitch_d
    const/16 v11, 0x55

    .line 177
    .line 178
    if-eq v9, v11, :cond_4

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :pswitch_e
    const/16 v11, 0x54

    .line 182
    .line 183
    if-eq v9, v11, :cond_4

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    move v7, v10

    .line 189
    goto :goto_2

    .line 190
    :cond_5
    :goto_3
    const/4 v0, 0x2

    .line 191
    if-lt v6, v0, :cond_7

    .line 192
    .line 193
    if-eq v6, v4, :cond_6

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    sub-int/2addr v7, p1

    .line 197
    invoke-interface {p2, p1, v7, v3, v8}, Li4/k;->c(IILv4/d0;Ljava/util/ArrayList;)V

    .line 198
    .line 199
    .line 200
    return v7

    .line 201
    :cond_7
    :goto_4
    invoke-interface {p2, p1, v0, v3, v2}, Li4/k;->c(IILv4/d0;Ljava/util/ArrayList;)V

    .line 202
    .line 203
    .line 204
    return v0

    .line 205
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_e
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public d(Lu4/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/l;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/z;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li4/z;->h(Lu4/b;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Li4/l;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lz4/g;

    .line 14
    .line 15
    iget p1, p1, Lu4/b;->a:I

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lz4/g;->l(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public e(ILi4/k;)I
    .locals 11

    .line 1
    iget-object v0, p0, Li4/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x4

    .line 6
    .line 7
    and-int/lit8 v1, v1, -0x4

    .line 8
    .line 9
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v2, v1, :cond_0

    .line 14
    .line 15
    shl-int/lit8 v4, v4, 0x8

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lg8/b;->e(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    or-int/2addr v4, v5

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0, v1}, Lg8/b;->b(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v2, p1

    .line 30
    add-int/lit8 v5, v1, 0x4

    .line 31
    .line 32
    invoke-virtual {v0, v5}, Lg8/b;->b(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/lit8 v6, v1, 0x8

    .line 37
    .line 38
    invoke-virtual {v0, v6}, Lg8/b;->b(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    sub-int v7, v6, v5

    .line 43
    .line 44
    add-int/lit8 v7, v7, 0x1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0xc

    .line 47
    .line 48
    if-gt v5, v6, :cond_3

    .line 49
    .line 50
    new-instance v6, Li4/n;

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    invoke-direct {v6, v7, v8}, Li4/n;-><init>(II)V

    .line 54
    .line 55
    .line 56
    :goto_1
    if-ge v3, v7, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lg8/b;->b(I)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    add-int/2addr v8, p1

    .line 63
    add-int/lit8 v1, v1, 0x4

    .line 64
    .line 65
    add-int v9, v5, v3

    .line 66
    .line 67
    invoke-virtual {v6}, Lz4/j;->j()V

    .line 68
    .line 69
    .line 70
    if-ltz v8, :cond_1

    .line 71
    .line 72
    iget-object v10, v6, Li4/n;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, Lz4/g;

    .line 75
    .line 76
    invoke-virtual {v10, v9}, Lz4/g;->l(I)V

    .line 77
    .line 78
    .line 79
    iget-object v9, v6, Li4/n;->k:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, Lz4/g;

    .line 82
    .line 83
    invoke-virtual {v9, v8}, Lz4/g;->l(I)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const-string p1, "target < 0"

    .line 90
    .line 91
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    return p1

    .line 96
    :cond_2
    invoke-virtual {v6, v2}, Li4/n;->s(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Li4/n;->r()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Li4/n;->i()V

    .line 103
    .line 104
    .line 105
    sub-int/2addr v1, p1

    .line 106
    invoke-interface {p2, p1, v1, v6, v4}, Li4/k;->g(IILi4/n;I)V

    .line 107
    .line 108
    .line 109
    return v1

    .line 110
    :cond_3
    new-instance p1, Li4/b0;

    .line 111
    .line 112
    const-string p2, "low / high inversion"

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-direct {p1, p2, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public f(ILi4/k;)I
    .locals 11

    .line 1
    iget-object v0, p0, Li4/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg8/b;->e(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg8/b;->g(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    const/16 v1, 0x84

    .line 18
    .line 19
    if-eq v3, v1, :cond_1

    .line 20
    .line 21
    const/16 v0, 0xa9

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v3, v0, :cond_0

    .line 25
    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    packed-switch v3, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    const/16 v0, 0xc4

    .line 33
    .line 34
    invoke-interface {p2, v0, p1}, Li4/k;->d(II)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :pswitch_0
    sget-object v9, Lw4/c;->E:Lw4/c;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/16 v5, 0x36

    .line 43
    .line 44
    const/4 v7, 0x4

    .line 45
    move v6, p1

    .line 46
    move-object v4, p2

    .line 47
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :pswitch_1
    move v6, p1

    .line 52
    move-object v4, p2

    .line 53
    sget-object v9, Lw4/c;->r:Lw4/c;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    const/16 v5, 0x36

    .line 57
    .line 58
    const/4 v7, 0x4

    .line 59
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :pswitch_2
    move v6, p1

    .line 64
    move-object v4, p2

    .line 65
    sget-object v9, Lw4/c;->s:Lw4/c;

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    const/16 v5, 0x36

    .line 69
    .line 70
    const/4 v7, 0x4

    .line 71
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :pswitch_3
    move v6, p1

    .line 76
    move-object v4, p2

    .line 77
    sget-object v9, Lw4/c;->u:Lw4/c;

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/16 v5, 0x36

    .line 81
    .line 82
    const/4 v7, 0x4

    .line 83
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :pswitch_4
    move v6, p1

    .line 88
    move-object v4, p2

    .line 89
    sget-object v9, Lw4/c;->t:Lw4/c;

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const/16 v5, 0x36

    .line 93
    .line 94
    const/4 v7, 0x4

    .line 95
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 96
    .line 97
    .line 98
    return v1

    .line 99
    :pswitch_5
    move v6, p1

    .line 100
    move-object v4, p2

    .line 101
    sget-object v9, Lw4/c;->E:Lw4/c;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    const/16 v5, 0x15

    .line 105
    .line 106
    const/4 v7, 0x4

    .line 107
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 108
    .line 109
    .line 110
    return v1

    .line 111
    :pswitch_6
    move v6, p1

    .line 112
    move-object v4, p2

    .line 113
    sget-object v9, Lw4/c;->r:Lw4/c;

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/16 v5, 0x15

    .line 117
    .line 118
    const/4 v7, 0x4

    .line 119
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 120
    .line 121
    .line 122
    return v1

    .line 123
    :pswitch_7
    move v6, p1

    .line 124
    move-object v4, p2

    .line 125
    sget-object v9, Lw4/c;->s:Lw4/c;

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    const/16 v5, 0x15

    .line 129
    .line 130
    const/4 v7, 0x4

    .line 131
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :pswitch_8
    move v6, p1

    .line 136
    move-object v4, p2

    .line 137
    sget-object v9, Lw4/c;->u:Lw4/c;

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    const/16 v5, 0x15

    .line 141
    .line 142
    const/4 v7, 0x4

    .line 143
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 144
    .line 145
    .line 146
    return v1

    .line 147
    :pswitch_9
    move v6, p1

    .line 148
    move-object v4, p2

    .line 149
    sget-object v9, Lw4/c;->t:Lw4/c;

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v5, 0x15

    .line 153
    .line 154
    const/4 v7, 0x4

    .line 155
    invoke-interface/range {v4 .. v10}, Li4/k;->i(IIIILw4/c;I)V

    .line 156
    .line 157
    .line 158
    return v1

    .line 159
    :cond_0
    move v6, p1

    .line 160
    move-object v4, p2

    .line 161
    sget-object v7, Lw4/c;->y:Lw4/c;

    .line 162
    .line 163
    move-object v2, v4

    .line 164
    move v4, v6

    .line 165
    move v6, v8

    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v5, 0x4

    .line 168
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 169
    .line 170
    .line 171
    return v1

    .line 172
    :cond_1
    move v6, p1

    .line 173
    move-object v4, p2

    .line 174
    add-int/lit8 p1, v6, 0x4

    .line 175
    .line 176
    invoke-virtual {v0, p1}, Lg8/b;->d(I)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    const/4 v5, 0x6

    .line 181
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 182
    .line 183
    move-object v2, v4

    .line 184
    move v4, v6

    .line 185
    move v6, v8

    .line 186
    move v8, p1

    .line 187
    invoke-interface/range {v2 .. v8}, Li4/k;->i(IIIILw4/c;I)V

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x6

    .line 191
    return p1

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    :pswitch_data_1
    .packed-switch 0x36
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
