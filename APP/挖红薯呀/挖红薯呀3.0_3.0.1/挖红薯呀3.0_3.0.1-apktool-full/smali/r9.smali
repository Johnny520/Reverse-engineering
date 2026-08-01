.class public final Lr9;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyo0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 790
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 791
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 792
    iput-object v0, p0, Lr9;->a:Ljava/lang/Object;

    .line 793
    new-instance v0, Lg9;

    const/4 v1, 0x0

    .line 794
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 795
    iput-object v0, p0, Lr9;->c:Ljava/lang/Object;

    .line 796
    new-instance v0, Ldh0;

    invoke-direct {v0}, Ldh0;-><init>()V

    .line 797
    iput-object v0, p0, Lr9;->d:Ljava/lang/Object;

    .line 798
    new-instance v0, Ldh0;

    invoke-direct {v0}, Ldh0;-><init>()V

    .line 799
    iput-object v0, p0, Lr9;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/text/Layout;)V
    .locals 5

    .line 800
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9;->a:Ljava/lang/Object;

    .line 801
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    .line 802
    :cond_0
    iget-object v2, p0, Lr9;->a:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-static {v2, v3, v1, v4}, Lk41;->Y(Ljava/lang/CharSequence;CII)I

    move-result v1

    if-gez v1, :cond_1

    .line 803
    iget-object v1, p0, Lr9;->a:Ljava/lang/Object;

    check-cast v1, Landroid/text/Layout;

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 804
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    iget-object v2, p0, Lr9;->a:Ljava/lang/Object;

    check-cast v2, Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    .line 806
    iput-object p1, p0, Lr9;->b:Ljava/lang/Object;

    .line 807
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-object v1, p0, Lr9;->c:Ljava/lang/Object;

    .line 808
    iget-object p1, p0, Lr9;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lr9;->d:Ljava/lang/Object;

    .line 809
    iget-object p0, p0, Lr9;->b:Ljava/lang/Object;

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    return-void
.end method

.method public constructor <init>(Lf8;Ls71;Ljava/util/List;Lym;Ljv;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Lr9;->a:Ljava/lang/Object;

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    iput-object v3, v0, Lr9;->b:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v3, Log0;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, v0, v4}, Log0;-><init>(Lr9;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, Lz60;->I(Lhw;)Lu60;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iput-object v3, v0, Lr9;->c:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v3, Log0;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-direct {v3, v0, v5}, Log0;-><init>(Lr9;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lz60;->I(Lhw;)Lu60;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v0, Lr9;->d:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, v2, Ls71;->b:Lap0;

    .line 41
    .line 42
    sget v5, Lg8;->a:I

    .line 43
    .line 44
    iget-object v5, v1, Lf8;->g:Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v6, v1, Lf8;->e:Ljava/lang/String;

    .line 47
    .line 48
    sget-object v7, Lhs;->d:Lhs;

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    new-instance v8, Lev;

    .line 53
    .line 54
    const/4 v9, 0x6

    .line 55
    invoke-direct {v8, v9}, Lev;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v8}, Lye;->T(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-object v5, v7

    .line 64
    :goto_0
    new-instance v8, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v9, Lx8;

    .line 70
    .line 71
    invoke-direct {v9}, Lx8;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    move v11, v4

    .line 79
    move v12, v11

    .line 80
    :goto_1
    if-ge v11, v10, :cond_a

    .line 81
    .line 82
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    check-cast v13, Le8;

    .line 87
    .line 88
    iget-object v14, v13, Le8;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v14, Lap0;

    .line 91
    .line 92
    invoke-virtual {v3, v14}, Lap0;->a(Lap0;)Lap0;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    iget v15, v13, Le8;->b:I

    .line 97
    .line 98
    iget v13, v13, Le8;->c:I

    .line 99
    .line 100
    if-gt v15, v13, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    const-string v16, "Reversed range is not supported"

    .line 104
    .line 105
    invoke-static/range {v16 .. v16}, Lx10;->a(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    if-ge v12, v15, :cond_4

    .line 109
    .line 110
    invoke-virtual {v9}, Lx8;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v16

    .line 114
    if-nez v16, :cond_4

    .line 115
    .line 116
    invoke-virtual {v9}, Lx8;->last()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v16

    .line 120
    move-object/from16 v4, v16

    .line 121
    .line 122
    check-cast v4, Le8;

    .line 123
    .line 124
    move-object/from16 v16, v5

    .line 125
    .line 126
    iget v5, v4, Le8;->c:I

    .line 127
    .line 128
    move-object/from16 v17, v7

    .line 129
    .line 130
    iget-object v7, v4, Le8;->a:Ljava/lang/Object;

    .line 131
    .line 132
    if-ge v15, v5, :cond_2

    .line 133
    .line 134
    new-instance v4, Le8;

    .line 135
    .line 136
    invoke-direct {v4, v12, v15, v7}, Le8;-><init>(IILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move v12, v15

    .line 143
    move-object/from16 v5, v16

    .line 144
    .line 145
    move-object/from16 v7, v17

    .line 146
    .line 147
    :goto_3
    const/4 v4, 0x0

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    move/from16 v18, v10

    .line 150
    .line 151
    new-instance v10, Le8;

    .line 152
    .line 153
    invoke-direct {v10, v12, v5, v7}, Le8;-><init>(IILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    iget v12, v4, Le8;->c:I

    .line 160
    .line 161
    :goto_4
    invoke-virtual {v9}, Lx8;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    invoke-virtual {v9}, Lx8;->last()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    check-cast v4, Le8;

    .line 172
    .line 173
    iget v4, v4, Le8;->c:I

    .line 174
    .line 175
    if-ne v12, v4, :cond_3

    .line 176
    .line 177
    invoke-virtual {v9}, Lx8;->removeLast()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_3
    move-object/from16 v5, v16

    .line 182
    .line 183
    move-object/from16 v7, v17

    .line 184
    .line 185
    move/from16 v10, v18

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    move-object/from16 v16, v5

    .line 189
    .line 190
    move-object/from16 v17, v7

    .line 191
    .line 192
    move/from16 v18, v10

    .line 193
    .line 194
    if-ge v12, v15, :cond_5

    .line 195
    .line 196
    new-instance v4, Le8;

    .line 197
    .line 198
    invoke-direct {v4, v12, v15, v3}, Le8;-><init>(IILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move v12, v15

    .line 205
    :cond_5
    invoke-virtual {v9}, Lx8;->f()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Le8;

    .line 210
    .line 211
    if-eqz v4, :cond_9

    .line 212
    .line 213
    iget v5, v4, Le8;->c:I

    .line 214
    .line 215
    iget-object v7, v4, Le8;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget v4, v4, Le8;->b:I

    .line 218
    .line 219
    if-ne v4, v15, :cond_6

    .line 220
    .line 221
    if-ne v5, v13, :cond_6

    .line 222
    .line 223
    invoke-virtual {v9}, Lx8;->removeLast()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    new-instance v4, Le8;

    .line 227
    .line 228
    check-cast v7, Lap0;

    .line 229
    .line 230
    invoke-virtual {v7, v14}, Lap0;->a(Lap0;)Lap0;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-direct {v4, v15, v13, v5}, Le8;-><init>(IILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9, v4}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_6
    if-ne v4, v5, :cond_7

    .line 242
    .line 243
    new-instance v10, Le8;

    .line 244
    .line 245
    invoke-direct {v10, v4, v5, v7}, Le8;-><init>(IILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9}, Lx8;->removeLast()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    new-instance v4, Le8;

    .line 255
    .line 256
    invoke-direct {v4, v15, v13, v14}, Le8;-><init>(IILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v9, v4}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_7
    if-lt v5, v13, :cond_8

    .line 264
    .line 265
    new-instance v4, Le8;

    .line 266
    .line 267
    check-cast v7, Lap0;

    .line 268
    .line 269
    invoke-virtual {v7, v14}, Lap0;->a(Lap0;)Lap0;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-direct {v4, v15, v13, v5}, Le8;-><init>(IILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9, v4}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_9
    new-instance v4, Le8;

    .line 287
    .line 288
    invoke-direct {v4, v15, v13, v14}, Le8;-><init>(IILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v9, v4}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 295
    .line 296
    move-object/from16 v5, v16

    .line 297
    .line 298
    move-object/from16 v7, v17

    .line 299
    .line 300
    move/from16 v10, v18

    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_a
    move-object/from16 v17, v7

    .line 306
    .line 307
    :goto_6
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-gt v12, v4, :cond_c

    .line 312
    .line 313
    invoke-virtual {v9}, Lx8;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-nez v4, :cond_c

    .line 318
    .line 319
    invoke-virtual {v9}, Lx8;->last()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    check-cast v4, Le8;

    .line 324
    .line 325
    new-instance v5, Le8;

    .line 326
    .line 327
    iget-object v7, v4, Le8;->a:Ljava/lang/Object;

    .line 328
    .line 329
    iget v4, v4, Le8;->c:I

    .line 330
    .line 331
    invoke-direct {v5, v12, v4, v7}, Le8;-><init>(IILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    :goto_7
    invoke-virtual {v9}, Lx8;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-nez v5, :cond_b

    .line 342
    .line 343
    invoke-virtual {v9}, Lx8;->last()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    check-cast v5, Le8;

    .line 348
    .line 349
    iget v5, v5, Le8;->c:I

    .line 350
    .line 351
    if-ne v4, v5, :cond_b

    .line 352
    .line 353
    invoke-virtual {v9}, Lx8;->removeLast()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_b
    move v12, v4

    .line 358
    goto :goto_6

    .line 359
    :cond_c
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-ge v12, v4, :cond_d

    .line 364
    .line 365
    new-instance v4, Le8;

    .line 366
    .line 367
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-direct {v4, v12, v5, v3}, Le8;-><init>(IILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_e

    .line 382
    .line 383
    new-instance v4, Le8;

    .line 384
    .line 385
    const/4 v5, 0x0

    .line 386
    invoke-direct {v4, v5, v5, v3}, Le8;-><init>(IILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_e
    const/4 v5, 0x0

    .line 394
    :goto_8
    new-instance v4, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    move v9, v5

    .line 408
    :goto_9
    if-ge v9, v7, :cond_1c

    .line 409
    .line 410
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v10

    .line 414
    check-cast v10, Le8;

    .line 415
    .line 416
    iget v11, v10, Le8;->b:I

    .line 417
    .line 418
    iget v12, v10, Le8;->c:I

    .line 419
    .line 420
    new-instance v13, Lf8;

    .line 421
    .line 422
    if-eq v11, v12, :cond_f

    .line 423
    .line 424
    invoke-virtual {v6, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v14

    .line 428
    goto :goto_a

    .line 429
    :cond_f
    const-string v14, ""

    .line 430
    .line 431
    :goto_a
    const/4 v15, 0x0

    .line 432
    if-ne v11, v12, :cond_11

    .line 433
    .line 434
    :goto_b
    move-object/from16 v16, v6

    .line 435
    .line 436
    :cond_10
    move/from16 v25, v7

    .line 437
    .line 438
    move-object/from16 v26, v8

    .line 439
    .line 440
    goto/16 :goto_f

    .line 441
    .line 442
    :cond_11
    iget-object v5, v1, Lf8;->d:Ljava/util/List;

    .line 443
    .line 444
    if-nez v5, :cond_12

    .line 445
    .line 446
    goto :goto_b

    .line 447
    :cond_12
    if-nez v11, :cond_14

    .line 448
    .line 449
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 450
    .line 451
    .line 452
    move-result v15

    .line 453
    if-lt v12, v15, :cond_14

    .line 454
    .line 455
    new-instance v15, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    move-object/from16 v16, v6

    .line 469
    .line 470
    const/4 v6, 0x0

    .line 471
    :goto_c
    if-ge v6, v1, :cond_10

    .line 472
    .line 473
    move/from16 v18, v1

    .line 474
    .line 475
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    move/from16 v19, v6

    .line 480
    .line 481
    move-object v6, v1

    .line 482
    check-cast v6, Le8;

    .line 483
    .line 484
    iget-object v6, v6, Le8;->a:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v6, Ld8;

    .line 487
    .line 488
    instance-of v6, v6, Lap0;

    .line 489
    .line 490
    if-nez v6, :cond_13

    .line 491
    .line 492
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    :cond_13
    add-int/lit8 v6, v19, 0x1

    .line 496
    .line 497
    move/from16 v1, v18

    .line 498
    .line 499
    goto :goto_c

    .line 500
    :cond_14
    move-object/from16 v16, v6

    .line 501
    .line 502
    new-instance v15, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    const/4 v6, 0x0

    .line 516
    :goto_d
    if-ge v6, v1, :cond_10

    .line 517
    .line 518
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v18

    .line 522
    move/from16 v19, v1

    .line 523
    .line 524
    move-object/from16 v1, v18

    .line 525
    .line 526
    check-cast v1, Le8;

    .line 527
    .line 528
    move-object/from16 v18, v5

    .line 529
    .line 530
    iget-object v5, v1, Le8;->a:Ljava/lang/Object;

    .line 531
    .line 532
    move-object/from16 v20, v5

    .line 533
    .line 534
    iget v5, v1, Le8;->b:I

    .line 535
    .line 536
    move/from16 v21, v6

    .line 537
    .line 538
    move-object/from16 v6, v20

    .line 539
    .line 540
    check-cast v6, Ld8;

    .line 541
    .line 542
    instance-of v6, v6, Lap0;

    .line 543
    .line 544
    if-nez v6, :cond_15

    .line 545
    .line 546
    iget v6, v1, Le8;->c:I

    .line 547
    .line 548
    invoke-static {v11, v12, v5, v6}, Lg8;->a(IIII)Z

    .line 549
    .line 550
    .line 551
    move-result v20

    .line 552
    if-eqz v20, :cond_15

    .line 553
    .line 554
    move/from16 v25, v7

    .line 555
    .line 556
    iget-object v7, v1, Le8;->d:Ljava/lang/String;

    .line 557
    .line 558
    iget-object v1, v1, Le8;->a:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v1, Ld8;

    .line 561
    .line 562
    invoke-static {v5, v11, v12}, Lw60;->n(III)I

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    sub-int/2addr v5, v11

    .line 567
    invoke-static {v6, v11, v12}, Lw60;->n(III)I

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    sub-int/2addr v6, v11

    .line 572
    move-object/from16 v26, v8

    .line 573
    .line 574
    new-instance v8, Le8;

    .line 575
    .line 576
    invoke-direct {v8, v1, v5, v6, v7}, Le8;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    goto :goto_e

    .line 583
    :cond_15
    move/from16 v25, v7

    .line 584
    .line 585
    move-object/from16 v26, v8

    .line 586
    .line 587
    :goto_e
    add-int/lit8 v6, v21, 0x1

    .line 588
    .line 589
    move-object/from16 v5, v18

    .line 590
    .line 591
    move/from16 v1, v19

    .line 592
    .line 593
    move/from16 v7, v25

    .line 594
    .line 595
    move-object/from16 v8, v26

    .line 596
    .line 597
    goto :goto_d

    .line 598
    :goto_f
    if-nez v15, :cond_16

    .line 599
    .line 600
    move-object/from16 v15, v17

    .line 601
    .line 602
    :cond_16
    invoke-direct {v13, v14, v15}, Lf8;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 603
    .line 604
    .line 605
    iget-object v1, v10, Le8;->a:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v1, Lap0;

    .line 608
    .line 609
    iget v5, v1, Lap0;->b:I

    .line 610
    .line 611
    if-nez v5, :cond_17

    .line 612
    .line 613
    iget v5, v3, Lap0;->b:I

    .line 614
    .line 615
    iget v6, v1, Lap0;->a:I

    .line 616
    .line 617
    iget-wide v7, v1, Lap0;->c:J

    .line 618
    .line 619
    iget-object v10, v1, Lap0;->d:Lz61;

    .line 620
    .line 621
    iget-object v15, v1, Lap0;->e:Ler0;

    .line 622
    .line 623
    move/from16 v29, v5

    .line 624
    .line 625
    iget-object v5, v1, Lap0;->f:Lla0;

    .line 626
    .line 627
    move-object/from16 v34, v5

    .line 628
    .line 629
    iget v5, v1, Lap0;->g:I

    .line 630
    .line 631
    move/from16 v35, v5

    .line 632
    .line 633
    iget v5, v1, Lap0;->h:I

    .line 634
    .line 635
    iget-object v1, v1, Lap0;->i:Lk71;

    .line 636
    .line 637
    new-instance v27, Lap0;

    .line 638
    .line 639
    move-object/from16 v37, v1

    .line 640
    .line 641
    move/from16 v36, v5

    .line 642
    .line 643
    move/from16 v28, v6

    .line 644
    .line 645
    move-wide/from16 v30, v7

    .line 646
    .line 647
    move-object/from16 v32, v10

    .line 648
    .line 649
    move-object/from16 v33, v15

    .line 650
    .line 651
    invoke-direct/range {v27 .. v37}, Lap0;-><init>(IIJLz61;Ler0;Lla0;IILk71;)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v1, v27

    .line 655
    .line 656
    :cond_17
    new-instance v5, Lxo0;

    .line 657
    .line 658
    new-instance v6, Ls71;

    .line 659
    .line 660
    iget-object v7, v2, Ls71;->a:Lj31;

    .line 661
    .line 662
    invoke-virtual {v3, v1}, Lap0;->a(Lap0;)Lap0;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-direct {v6, v7, v1}, Ls71;-><init>(Lj31;Lap0;)V

    .line 667
    .line 668
    .line 669
    iget-object v1, v13, Lf8;->d:Ljava/util/List;

    .line 670
    .line 671
    if-nez v1, :cond_18

    .line 672
    .line 673
    move-object/from16 v21, v17

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_18
    move-object/from16 v21, v1

    .line 677
    .line 678
    :goto_10
    iget-object v1, v0, Lr9;->b:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v1, Ljava/util/List;

    .line 681
    .line 682
    new-instance v7, Ljava/util/ArrayList;

    .line 683
    .line 684
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 685
    .line 686
    .line 687
    move-result v8

    .line 688
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 692
    .line 693
    .line 694
    move-result v8

    .line 695
    const/4 v10, 0x0

    .line 696
    :goto_11
    if-ge v10, v8, :cond_1b

    .line 697
    .line 698
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v13

    .line 702
    check-cast v13, Le8;

    .line 703
    .line 704
    iget v15, v13, Le8;->b:I

    .line 705
    .line 706
    move-object/from16 v18, v1

    .line 707
    .line 708
    iget v1, v13, Le8;->c:I

    .line 709
    .line 710
    invoke-static {v11, v12, v15, v1}, Lg8;->a(IIII)Z

    .line 711
    .line 712
    .line 713
    move-result v19

    .line 714
    if-eqz v19, :cond_1a

    .line 715
    .line 716
    if-gt v11, v15, :cond_19

    .line 717
    .line 718
    if-gt v1, v12, :cond_19

    .line 719
    .line 720
    :goto_12
    move/from16 v19, v1

    .line 721
    .line 722
    goto :goto_13

    .line 723
    :cond_19
    const-string v19, "placeholder can not overlap with paragraph."

    .line 724
    .line 725
    invoke-static/range {v19 .. v19}, Lx10;->a(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    goto :goto_12

    .line 729
    :goto_13
    new-instance v1, Le8;

    .line 730
    .line 731
    iget-object v13, v13, Le8;->a:Ljava/lang/Object;

    .line 732
    .line 733
    sub-int/2addr v15, v11

    .line 734
    sub-int v2, v19, v11

    .line 735
    .line 736
    invoke-direct {v1, v15, v2, v13}, Le8;-><init>(IILjava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    :cond_1a
    add-int/lit8 v10, v10, 0x1

    .line 743
    .line 744
    move-object/from16 v2, p2

    .line 745
    .line 746
    move-object/from16 v1, v18

    .line 747
    .line 748
    goto :goto_11

    .line 749
    :cond_1b
    new-instance v18, Lc6;

    .line 750
    .line 751
    move-object/from16 v24, p4

    .line 752
    .line 753
    move-object/from16 v23, p5

    .line 754
    .line 755
    move-object/from16 v20, v6

    .line 756
    .line 757
    move-object/from16 v22, v7

    .line 758
    .line 759
    move-object/from16 v19, v14

    .line 760
    .line 761
    invoke-direct/range {v18 .. v24}, Lc6;-><init>(Ljava/lang/String;Ls71;Ljava/util/List;Ljava/util/List;Ljv;Lym;)V

    .line 762
    .line 763
    .line 764
    move-object/from16 v1, v18

    .line 765
    .line 766
    invoke-direct {v5, v1, v11, v12}, Lxo0;-><init>(Lc6;II)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    add-int/lit8 v9, v9, 0x1

    .line 773
    .line 774
    move-object/from16 v1, p1

    .line 775
    .line 776
    move-object/from16 v2, p2

    .line 777
    .line 778
    move-object/from16 v6, v16

    .line 779
    .line 780
    move/from16 v7, v25

    .line 781
    .line 782
    move-object/from16 v8, v26

    .line 783
    .line 784
    const/4 v5, 0x0

    .line 785
    goto/16 :goto_9

    .line 786
    .line 787
    :cond_1c
    iput-object v4, v0, Lr9;->e:Ljava/lang/Object;

    .line 788
    .line 789
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 811
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 812
    iput-object v0, p0, Lr9;->a:Ljava/lang/Object;

    .line 813
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lr9;->b:Ljava/lang/Object;

    .line 814
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lr9;->c:Ljava/lang/Object;

    .line 815
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lr9;->d:Ljava/lang/Object;

    .line 816
    new-instance p1, Lxg;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, Lxg;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lr9;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 0

    .line 1
    iget-object p0, p0, Lr9;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lu60;

    .line 4
    .line 5
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public b()Z
    .locals 4

    .line 1
    iget-object p0, p0, Lr9;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lxo0;

    .line 18
    .line 19
    iget-object v3, v3, Lxo0;->a:Lc6;

    .line 20
    .line 21
    invoke-virtual {v3}, Lc6;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v1
.end method

.method public c()F
    .locals 0

    .line 1
    iget-object p0, p0, Lr9;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lu60;

    .line 4
    .line 5
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public d(Lq9;Lhw;)Lyc;
    .locals 8

    .line 1
    new-instance v0, Lxt0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lxt0;->d:I

    .line 8
    .line 9
    iget-object v1, p0, Lr9;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, p0, Lr9;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Throwable;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Lq9;->b(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ln2;->t:Lxc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v1

    .line 24
    return-object p0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    :try_start_1
    iget-object v2, p0, Lr9;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lg9;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    add-int/lit8 v4, v3, 0x1

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v2, 0x7ffffff

    .line 45
    .line 46
    .line 47
    and-int/2addr v2, v4

    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v2, v5

    .line 55
    :goto_0
    ushr-int/lit8 v4, v4, 0x1b

    .line 56
    .line 57
    and-int/lit8 v4, v4, 0xf

    .line 58
    .line 59
    iput v4, v0, Lxt0;->d:I

    .line 60
    .line 61
    iget-object v4, p0, Lr9;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ldh0;

    .line 64
    .line 65
    invoke-virtual {v4, p1}, Ldh0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v1

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    if-eqz p2, :cond_6

    .line 72
    .line 73
    :try_start_2
    invoke-interface {p2}, Lhw;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :catchall_1
    move-exception p2

    .line 78
    iget-object v1, p0, Lr9;->a:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_3
    iget-object v2, p0, Lr9;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/lang/Throwable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    :goto_1
    monitor-exit v1

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    :try_start_4
    iput-object p2, p0, Lr9;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v2, p0, Lr9;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ldh0;

    .line 94
    .line 95
    iget-object v4, v2, Ldh0;->a:[Ljava/lang/Object;

    .line 96
    .line 97
    iget v2, v2, Ldh0;->b:I

    .line 98
    .line 99
    move v6, v5

    .line 100
    :goto_2
    if-ge v6, v2, :cond_4

    .line 101
    .line 102
    aget-object v7, v4, v6

    .line 103
    .line 104
    check-cast v7, Lq9;

    .line 105
    .line 106
    invoke-virtual {v7, p2}, Lq9;->b(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v6, v6, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_2
    move-exception p0

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    iget-object p2, p0, Lr9;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p2, Ldh0;

    .line 117
    .line 118
    invoke-virtual {p2}, Ldh0;->d()V

    .line 119
    .line 120
    .line 121
    iget-object p2, p0, Lr9;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p2, Lg9;

    .line 124
    .line 125
    :cond_5
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    ushr-int/lit8 v4, v2, 0x1b

    .line 130
    .line 131
    and-int/lit8 v4, v4, 0xf

    .line 132
    .line 133
    add-int/2addr v4, v3

    .line 134
    and-int/lit8 v4, v4, 0xf

    .line 135
    .line 136
    shl-int/lit8 v4, v4, 0x1b

    .line 137
    .line 138
    invoke-virtual {p2, v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 139
    .line 140
    .line 141
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :goto_3
    monitor-exit v1

    .line 146
    throw p0

    .line 147
    :cond_6
    :goto_4
    new-instance p2, Ld;

    .line 148
    .line 149
    new-instance v1, Lp9;

    .line 150
    .line 151
    invoke-direct {v1, p1, p0, v0, v5}, Lp9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    invoke-direct {p2, v1}, Ld;-><init>(Lp9;)V

    .line 155
    .line 156
    .line 157
    return-object p2

    .line 158
    :goto_5
    monitor-exit v1

    .line 159
    throw p0
.end method

.method public e(Lsw;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lr9;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ldh0;

    .line 7
    .line 8
    iget-object v2, p0, Lr9;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ldh0;

    .line 11
    .line 12
    iput-object v2, p0, Lr9;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, p0, Lr9;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p0, p0, Lr9;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lg9;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    ushr-int/lit8 v3, v2, 0x1b

    .line 25
    .line 26
    and-int/lit8 v3, v3, 0xf

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    and-int/lit8 v3, v3, 0xf

    .line 31
    .line 32
    shl-int/lit8 v3, v3, 0x1b

    .line 33
    .line 34
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget p0, v1, Ldh0;->b:I

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    if-ge v2, p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ldh0;->f(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p1, v3}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v1}, Ldh0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0

    .line 63
    throw p0
.end method

.method public f(IZ)F
    .locals 1

    .line 1
    iget-object p0, p0, Lr9;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineEnd(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-le p1, v0, :cond_0

    .line 14
    .line 15
    move p1, v0

    .line 16
    :cond_0
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public g(IZZ)F
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lr9;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v4, v0, Lr9;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Landroid/text/Layout;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p2}, Lr9;->f(IZ)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    invoke-static {v4, v1, v2}, Lpf1;->A(Landroid/text/Layout;IZ)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineStart(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineEnd(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eq v1, v6, :cond_1

    .line 35
    .line 36
    if-eq v1, v7, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p0 .. p2}, Lr9;->f(IZ)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0

    .line 43
    :cond_1
    if-eqz v1, :cond_35

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-ne v1, v8, :cond_2

    .line 54
    .line 55
    goto/16 :goto_1c

    .line 56
    .line 57
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    const-string v11, ")."

    .line 73
    .line 74
    if-ltz v9, :cond_34

    .line 75
    .line 76
    if-gt v9, v10, :cond_33

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    sub-int/2addr v9, v10

    .line 80
    const/4 v12, 0x0

    .line 81
    :goto_0
    if-gt v12, v9, :cond_4

    .line 82
    .line 83
    add-int v13, v12, v9

    .line 84
    .line 85
    ushr-int/2addr v13, v10

    .line 86
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    check-cast v14, Ljava/lang/Comparable;

    .line 91
    .line 92
    invoke-static {v14, v8}, Lpf1;->p(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    if-gez v14, :cond_3

    .line 97
    .line 98
    add-int/lit8 v12, v13, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    if-lez v14, :cond_5

    .line 102
    .line 103
    add-int/lit8 v9, v13, -0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    add-int/2addr v12, v10

    .line 107
    neg-int v13, v12

    .line 108
    :cond_5
    if-gez v13, :cond_6

    .line 109
    .line 110
    add-int/2addr v13, v10

    .line 111
    neg-int v8, v13

    .line 112
    goto :goto_1

    .line 113
    :cond_6
    add-int/lit8 v8, v13, 0x1

    .line 114
    .line 115
    :goto_1
    if-eqz v2, :cond_7

    .line 116
    .line 117
    if-lez v8, :cond_7

    .line 118
    .line 119
    add-int/lit8 v2, v8, -0x1

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-ne v1, v9, :cond_7

    .line 132
    .line 133
    move v8, v2

    .line 134
    :cond_7
    if-nez v8, :cond_8

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    goto :goto_2

    .line 138
    :cond_8
    add-int/lit8 v2, v8, -0x1

    .line 139
    .line 140
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    :goto_2
    invoke-virtual {v4, v2}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v4, v2}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    const/4 v9, -0x1

    .line 159
    if-ne v2, v9, :cond_9

    .line 160
    .line 161
    move v2, v10

    .line 162
    goto :goto_3

    .line 163
    :cond_9
    const/4 v2, 0x0

    .line 164
    :goto_3
    invoke-virtual {v0, v7, v6}, Lr9;->h(II)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-nez v8, :cond_a

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    goto :goto_4

    .line 172
    :cond_a
    add-int/lit8 v12, v8, -0x1

    .line 173
    .line 174
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    check-cast v12, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    :goto_4
    sub-int v13, v6, v12

    .line 185
    .line 186
    sub-int v12, v7, v12

    .line 187
    .line 188
    iget-object v14, v0, Lr9;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v14, Ljava/util/ArrayList;

    .line 191
    .line 192
    iget-object v15, v0, Lr9;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v15, [Z

    .line 195
    .line 196
    aget-boolean v16, v15, v8

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    if-eqz v16, :cond_b

    .line 201
    .line 202
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Ljava/text/Bidi;

    .line 207
    .line 208
    move/from16 v27, v5

    .line 209
    .line 210
    move/from16 v26, v7

    .line 211
    .line 212
    move v5, v9

    .line 213
    goto/16 :goto_b

    .line 214
    .line 215
    :cond_b
    if-nez v8, :cond_c

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    goto :goto_5

    .line 219
    :cond_c
    add-int/lit8 v10, v8, -0x1

    .line 220
    .line 221
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    check-cast v10, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    :goto_5
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v18

    .line 235
    check-cast v18, Ljava/lang/Number;

    .line 236
    .line 237
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    sub-int v11, v9, v10

    .line 242
    .line 243
    move-object/from16 v25, v15

    .line 244
    .line 245
    iget-object v15, v0, Lr9;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v15, [C

    .line 248
    .line 249
    move/from16 v26, v7

    .line 250
    .line 251
    if-eqz v15, :cond_d

    .line 252
    .line 253
    array-length v7, v15

    .line 254
    if-ge v7, v11, :cond_e

    .line 255
    .line 256
    :cond_d
    new-array v15, v11, [C

    .line 257
    .line 258
    :cond_e
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    move/from16 v27, v5

    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    invoke-static {v7, v10, v9, v15, v5}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 266
    .line 267
    .line 268
    invoke-static {v15, v5, v11}, Ljava/text/Bidi;->requiresBidi([CII)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-eqz v7, :cond_12

    .line 273
    .line 274
    if-nez v8, :cond_f

    .line 275
    .line 276
    const/4 v5, 0x0

    .line 277
    goto :goto_6

    .line 278
    :cond_f
    add-int/lit8 v5, v8, -0x1

    .line 279
    .line 280
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Ljava/lang/Number;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    :goto_6
    invoke-virtual {v4, v5}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    const/4 v5, -0x1

    .line 299
    if-ne v3, v5, :cond_10

    .line 300
    .line 301
    const/16 v24, 0x1

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_10
    const/16 v24, 0x0

    .line 305
    .line 306
    :goto_7
    new-instance v18, Ljava/text/Bidi;

    .line 307
    .line 308
    const/16 v21, 0x0

    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    move/from16 v23, v11

    .line 315
    .line 316
    move-object/from16 v19, v15

    .line 317
    .line 318
    invoke-direct/range {v18 .. v24}, Ljava/text/Bidi;-><init>([CI[BIII)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v18 .. v18}, Ljava/text/Bidi;->getRunCount()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    const/4 v7, 0x1

    .line 326
    if-ne v3, v7, :cond_11

    .line 327
    .line 328
    :goto_8
    move-object/from16 v3, v17

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_11
    move-object/from16 v3, v18

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_12
    const/4 v5, -0x1

    .line 335
    const/4 v7, 0x1

    .line 336
    goto :goto_8

    .line 337
    :goto_9
    invoke-virtual {v14, v8, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    aput-boolean v7, v25, v8

    .line 341
    .line 342
    if-eqz v3, :cond_14

    .line 343
    .line 344
    iget-object v7, v0, Lr9;->e:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v7, [C

    .line 347
    .line 348
    if-ne v15, v7, :cond_13

    .line 349
    .line 350
    move-object/from16 v15, v17

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_13
    move-object v15, v7

    .line 354
    :cond_14
    :goto_a
    iput-object v15, v0, Lr9;->e:Ljava/lang/Object;

    .line 355
    .line 356
    :goto_b
    if-eqz v3, :cond_15

    .line 357
    .line 358
    invoke-virtual {v3, v13, v12}, Ljava/text/Bidi;->createLineBidi(II)Ljava/text/Bidi;

    .line 359
    .line 360
    .line 361
    move-result-object v17

    .line 362
    :cond_15
    move-object/from16 v3, v17

    .line 363
    .line 364
    if-eqz v3, :cond_2c

    .line 365
    .line 366
    invoke-virtual {v3}, Ljava/text/Bidi;->getRunCount()I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    const/4 v8, 0x1

    .line 371
    if-ne v7, v8, :cond_16

    .line 372
    .line 373
    move/from16 v16, v8

    .line 374
    .line 375
    :goto_c
    move/from16 v3, v27

    .line 376
    .line 377
    const/4 v11, 0x0

    .line 378
    goto/16 :goto_19

    .line 379
    .line 380
    :cond_16
    invoke-virtual {v3}, Ljava/text/Bidi;->getRunCount()I

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    new-array v8, v7, [Lm50;

    .line 385
    .line 386
    const/4 v9, 0x0

    .line 387
    :goto_d
    if-ge v9, v7, :cond_18

    .line 388
    .line 389
    new-instance v10, Lm50;

    .line 390
    .line 391
    invoke-virtual {v3, v9}, Ljava/text/Bidi;->getRunStart(I)I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    add-int/2addr v11, v6

    .line 396
    invoke-virtual {v3, v9}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    add-int/2addr v12, v6

    .line 401
    invoke-virtual {v3, v9}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    rem-int/lit8 v13, v13, 0x2

    .line 406
    .line 407
    const/4 v14, 0x1

    .line 408
    if-ne v13, v14, :cond_17

    .line 409
    .line 410
    const/4 v13, 0x1

    .line 411
    goto :goto_e

    .line 412
    :cond_17
    const/4 v13, 0x0

    .line 413
    :goto_e
    invoke-direct {v10, v11, v12, v13}, Lm50;-><init>(IIZ)V

    .line 414
    .line 415
    .line 416
    aput-object v10, v8, v9

    .line 417
    .line 418
    add-int/lit8 v9, v9, 0x1

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_18
    invoke-virtual {v3}, Ljava/text/Bidi;->getRunCount()I

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    new-array v10, v9, [B

    .line 426
    .line 427
    const/4 v11, 0x0

    .line 428
    :goto_f
    if-ge v11, v9, :cond_19

    .line 429
    .line 430
    invoke-virtual {v3, v11}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 431
    .line 432
    .line 433
    move-result v12

    .line 434
    int-to-byte v12, v12

    .line 435
    aput-byte v12, v10, v11

    .line 436
    .line 437
    add-int/lit8 v11, v11, 0x1

    .line 438
    .line 439
    goto :goto_f

    .line 440
    :cond_19
    const/4 v11, 0x0

    .line 441
    invoke-static {v10, v11, v8, v11, v7}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 442
    .line 443
    .line 444
    if-ne v1, v6, :cond_22

    .line 445
    .line 446
    move v0, v11

    .line 447
    :goto_10
    if-ge v0, v7, :cond_1b

    .line 448
    .line 449
    aget-object v3, v8, v0

    .line 450
    .line 451
    iget v3, v3, Lm50;->a:I

    .line 452
    .line 453
    if-ne v3, v1, :cond_1a

    .line 454
    .line 455
    move v9, v0

    .line 456
    goto :goto_11

    .line 457
    :cond_1a
    add-int/lit8 v0, v0, 0x1

    .line 458
    .line 459
    goto :goto_10

    .line 460
    :cond_1b
    move v9, v5

    .line 461
    :goto_11
    aget-object v0, v8, v9

    .line 462
    .line 463
    if-nez p2, :cond_1d

    .line 464
    .line 465
    iget-boolean v0, v0, Lm50;->c:Z

    .line 466
    .line 467
    if-ne v2, v0, :cond_1c

    .line 468
    .line 469
    goto :goto_12

    .line 470
    :cond_1c
    move v11, v2

    .line 471
    goto :goto_13

    .line 472
    :cond_1d
    :goto_12
    if-nez v2, :cond_1e

    .line 473
    .line 474
    const/4 v11, 0x1

    .line 475
    :cond_1e
    :goto_13
    if-nez v9, :cond_1f

    .line 476
    .line 477
    if-eqz v11, :cond_1f

    .line 478
    .line 479
    move/from16 v3, v27

    .line 480
    .line 481
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    return v0

    .line 486
    :cond_1f
    move/from16 v3, v27

    .line 487
    .line 488
    const/16 v16, 0x1

    .line 489
    .line 490
    add-int/lit8 v7, v7, -0x1

    .line 491
    .line 492
    if-ne v9, v7, :cond_20

    .line 493
    .line 494
    if-nez v11, :cond_20

    .line 495
    .line 496
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    return v0

    .line 501
    :cond_20
    if-eqz v11, :cond_21

    .line 502
    .line 503
    add-int/lit8 v9, v9, -0x1

    .line 504
    .line 505
    aget-object v0, v8, v9

    .line 506
    .line 507
    iget v0, v0, Lm50;->a:I

    .line 508
    .line 509
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    return v0

    .line 514
    :cond_21
    add-int/lit8 v9, v9, 0x1

    .line 515
    .line 516
    aget-object v0, v8, v9

    .line 517
    .line 518
    iget v0, v0, Lm50;->a:I

    .line 519
    .line 520
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    return v0

    .line 525
    :cond_22
    move/from16 v9, v26

    .line 526
    .line 527
    move/from16 v3, v27

    .line 528
    .line 529
    if-le v1, v9, :cond_23

    .line 530
    .line 531
    invoke-virtual {v0, v1, v6}, Lr9;->h(II)I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    goto :goto_14

    .line 536
    :cond_23
    move v0, v1

    .line 537
    :goto_14
    move v1, v11

    .line 538
    :goto_15
    if-ge v1, v7, :cond_25

    .line 539
    .line 540
    aget-object v6, v8, v1

    .line 541
    .line 542
    iget v6, v6, Lm50;->b:I

    .line 543
    .line 544
    if-ne v6, v0, :cond_24

    .line 545
    .line 546
    move v9, v1

    .line 547
    goto :goto_16

    .line 548
    :cond_24
    add-int/lit8 v1, v1, 0x1

    .line 549
    .line 550
    goto :goto_15

    .line 551
    :cond_25
    move v9, v5

    .line 552
    :goto_16
    aget-object v0, v8, v9

    .line 553
    .line 554
    if-nez p2, :cond_27

    .line 555
    .line 556
    iget-boolean v0, v0, Lm50;->c:Z

    .line 557
    .line 558
    if-ne v2, v0, :cond_26

    .line 559
    .line 560
    goto :goto_17

    .line 561
    :cond_26
    if-nez v2, :cond_28

    .line 562
    .line 563
    const/4 v11, 0x1

    .line 564
    goto :goto_18

    .line 565
    :cond_27
    :goto_17
    move v11, v2

    .line 566
    :cond_28
    :goto_18
    if-nez v9, :cond_29

    .line 567
    .line 568
    if-eqz v11, :cond_29

    .line 569
    .line 570
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    return v0

    .line 575
    :cond_29
    const/16 v16, 0x1

    .line 576
    .line 577
    add-int/lit8 v7, v7, -0x1

    .line 578
    .line 579
    if-ne v9, v7, :cond_2a

    .line 580
    .line 581
    if-nez v11, :cond_2a

    .line 582
    .line 583
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    return v0

    .line 588
    :cond_2a
    if-eqz v11, :cond_2b

    .line 589
    .line 590
    add-int/lit8 v9, v9, -0x1

    .line 591
    .line 592
    aget-object v0, v8, v9

    .line 593
    .line 594
    iget v0, v0, Lm50;->b:I

    .line 595
    .line 596
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    return v0

    .line 601
    :cond_2b
    add-int/lit8 v9, v9, 0x1

    .line 602
    .line 603
    aget-object v0, v8, v9

    .line 604
    .line 605
    iget v0, v0, Lm50;->b:I

    .line 606
    .line 607
    invoke-virtual {v4, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    return v0

    .line 612
    :cond_2c
    const/16 v16, 0x1

    .line 613
    .line 614
    goto/16 :goto_c

    .line 615
    .line 616
    :goto_19
    invoke-virtual {v4, v6}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-nez p2, :cond_2d

    .line 621
    .line 622
    if-ne v2, v0, :cond_2f

    .line 623
    .line 624
    :cond_2d
    if-nez v2, :cond_2e

    .line 625
    .line 626
    move/from16 v2, v16

    .line 627
    .line 628
    goto :goto_1a

    .line 629
    :cond_2e
    move v2, v11

    .line 630
    :cond_2f
    :goto_1a
    if-ne v1, v6, :cond_30

    .line 631
    .line 632
    move v10, v2

    .line 633
    goto :goto_1b

    .line 634
    :cond_30
    if-nez v2, :cond_31

    .line 635
    .line 636
    move/from16 v10, v16

    .line 637
    .line 638
    goto :goto_1b

    .line 639
    :cond_31
    move v10, v11

    .line 640
    :goto_1b
    if-eqz v10, :cond_32

    .line 641
    .line 642
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineLeft(I)F

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    return v0

    .line 647
    :cond_32
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineRight(I)F

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    return v0

    .line 652
    :cond_33
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 653
    .line 654
    new-instance v1, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    const-string v2, "toIndex ("

    .line 657
    .line 658
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    const-string v2, ") is greater than size ("

    .line 665
    .line 666
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    throw v0

    .line 683
    :cond_34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 684
    .line 685
    new-instance v1, Ljava/lang/StringBuilder;

    .line 686
    .line 687
    const-string v2, "fromIndex (0) is greater than toIndex ("

    .line 688
    .line 689
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    throw v0

    .line 706
    :cond_35
    :goto_1c
    invoke-virtual/range {p0 .. p2}, Lr9;->f(IZ)F

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    return v0
.end method

.method public h(II)I
    .locals 2

    .line 1
    :goto_0
    if-le p1, p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lr9;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/text/Layout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    add-int/lit8 v1, p1, -0x1

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/16 v1, 0xa

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x1680

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x2000

    .line 30
    .line 31
    invoke-static {v0, v1}, Lp30;->r(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ltz v1, :cond_0

    .line 36
    .line 37
    const/16 v1, 0x200a

    .line 38
    .line 39
    invoke-static {v0, v1}, Lp30;->r(II)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-gtz v1, :cond_0

    .line 44
    .line 45
    const/16 v1, 0x2007

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    :cond_0
    const/16 v1, 0x205f

    .line 50
    .line 51
    if-eq v0, v1, :cond_2

    .line 52
    .line 53
    const/16 v1, 0x3000

    .line 54
    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    return p1

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return p1
.end method

.method public i(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr9;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr9;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lz31;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lz31;->i(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lr9;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lz31;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lz31;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method
