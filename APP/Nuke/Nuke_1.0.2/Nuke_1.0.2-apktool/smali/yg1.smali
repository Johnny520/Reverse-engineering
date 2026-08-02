.class public final Lyg1;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public A:Lah1;

.field public t:Llv2;

.field public u:Lp3;

.field public v:Lat;

.field public w:Lat;

.field public x:Lix1;

.field public y:Ljava/util/ArrayList;

.field public z:Ljava/util/ArrayList;


# direct methods
.method public static c0(Lyg1;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lp3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput p1, v0, Lp3;->u:I

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput p1, v0, Lp3;->v:I

    .line 14
    .line 15
    iput-object v0, p0, Lyg1;->u:Lp3;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyg1;->t:Llv2;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Llv2;->D(Lmj0;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget-object v4, v0, Lyg1;->u:Lp3;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-virtual {v4, v1}, Lp3;->D(Lmj0;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v4, 0x0

    .line 25
    :goto_1
    iget-object v5, v0, Lyg1;->v:Lat;

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    invoke-virtual {v5, v1}, Lat;->D(Lmj0;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/4 v5, 0x0

    .line 35
    :goto_2
    iget-object v6, v0, Lyg1;->w:Lat;

    .line 36
    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    invoke-virtual {v6, v1}, Lat;->D(Lmj0;)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    const/4 v6, 0x0

    .line 45
    :goto_3
    iget-object v7, v0, Lyg1;->x:Lix1;

    .line 46
    .line 47
    if-eqz v7, :cond_4

    .line 48
    .line 49
    invoke-virtual {v7, v1}, Lix1;->D(Lmj0;)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    const/4 v7, 0x0

    .line 55
    :goto_4
    iget-object v8, v0, Lyg1;->y:Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v9, 0xa

    .line 58
    .line 59
    if-eqz v8, :cond_6

    .line 60
    .line 61
    new-instance v10, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {v8, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    if-eqz v11, :cond_5

    .line 79
    .line 80
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, Llv2;

    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v1}, Llv2;->D(Lmj0;)I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_5
    invoke-static {v10}, Ldu;->E0(Ljava/util/ArrayList;)[I

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v1, v8}, Lmj0;->f([I)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    goto :goto_6

    .line 110
    :cond_6
    const/4 v8, 0x0

    .line 111
    :goto_6
    iget-object v10, v0, Lyg1;->z:Ljava/util/ArrayList;

    .line 112
    .line 113
    const/4 v11, -0x1

    .line 114
    const/4 v12, 0x1

    .line 115
    if-eqz v10, :cond_b

    .line 116
    .line 117
    new-instance v13, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {v10, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    if-eqz v14, :cond_8

    .line 135
    .line 136
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    check-cast v14, Las1;

    .line 141
    .line 142
    iget v14, v14, Las1;->b:I

    .line 143
    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    if-eqz v14, :cond_7

    .line 147
    .line 148
    packed-switch v14, :pswitch_data_0

    .line 149
    .line 150
    .line 151
    throw v16

    .line 152
    :pswitch_0
    const/4 v14, 0x6

    .line 153
    goto :goto_8

    .line 154
    :pswitch_1
    const/4 v14, 0x5

    .line 155
    goto :goto_8

    .line 156
    :pswitch_2
    const/4 v14, 0x4

    .line 157
    goto :goto_8

    .line 158
    :pswitch_3
    const/4 v14, 0x3

    .line 159
    goto :goto_8

    .line 160
    :pswitch_4
    const/4 v14, 0x2

    .line 161
    goto :goto_8

    .line 162
    :pswitch_5
    move v14, v12

    .line 163
    :goto_8
    new-instance v3, Ls63;

    .line 164
    .line 165
    invoke-direct {v3, v14}, Ls63;-><init>(B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_7
    throw v16

    .line 173
    :cond_8
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    new-array v10, v3, [B

    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    const/4 v14, 0x0

    .line 184
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v16

    .line 188
    if-eqz v16, :cond_9

    .line 189
    .line 190
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    move-object/from16 v15, v16

    .line 195
    .line 196
    check-cast v15, Ls63;

    .line 197
    .line 198
    iget-byte v15, v15, Ls63;->h:B

    .line 199
    .line 200
    add-int/lit8 v16, v14, 0x1

    .line 201
    .line 202
    aput-byte v15, v10, v14

    .line 203
    .line 204
    move/from16 v14, v16

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_9
    invoke-virtual {v1, v12, v3, v12}, Lmj0;->n(III)V

    .line 208
    .line 209
    .line 210
    sub-int/2addr v3, v12

    .line 211
    :goto_a
    if-ge v11, v3, :cond_a

    .line 212
    .line 213
    aget-byte v13, v10, v3

    .line 214
    .line 215
    invoke-virtual {v1, v13}, Lmj0;->a(B)V

    .line 216
    .line 217
    .line 218
    add-int/lit8 v3, v3, -0x1

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_a
    invoke-virtual {v1}, Lmj0;->h()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    goto :goto_b

    .line 226
    :cond_b
    const/4 v3, 0x0

    .line 227
    :goto_b
    iget-object v10, v0, Lyg1;->z:Ljava/util/ArrayList;

    .line 228
    .line 229
    if-eqz v10, :cond_e

    .line 230
    .line 231
    new-instance v13, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-static {v10, v9}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    if-eqz v14, :cond_c

    .line 249
    .line 250
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    check-cast v14, Las1;

    .line 255
    .line 256
    iget-object v14, v14, Las1;->a:Ldx0;

    .line 257
    .line 258
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    check-cast v14, Lqp0;

    .line 262
    .line 263
    invoke-virtual {v14, v1}, Lqp0;->D(Lmj0;)I

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v14

    .line 271
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_c
    invoke-static {v13}, Ldu;->E0(Ljava/util/ArrayList;)[I

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    array-length v13, v10

    .line 280
    const/4 v14, 0x4

    .line 281
    invoke-virtual {v1, v14, v13, v14}, Lmj0;->n(III)V

    .line 282
    .line 283
    .line 284
    array-length v13, v10

    .line 285
    sub-int/2addr v13, v12

    .line 286
    :goto_d
    if-ge v11, v13, :cond_d

    .line 287
    .line 288
    aget v14, v10, v13

    .line 289
    .line 290
    invoke-virtual {v1, v14}, Lmj0;->b(I)V

    .line 291
    .line 292
    .line 293
    add-int/lit8 v13, v13, -0x1

    .line 294
    .line 295
    goto :goto_d

    .line 296
    :cond_d
    invoke-virtual {v1}, Lmj0;->h()I

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    goto :goto_e

    .line 301
    :cond_e
    const/4 v10, 0x0

    .line 302
    :goto_e
    iget-object v0, v0, Lyg1;->A:Lah1;

    .line 303
    .line 304
    if-eqz v0, :cond_f

    .line 305
    .line 306
    invoke-virtual {v0, v1}, Lah1;->D(Lmj0;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    goto :goto_f

    .line 311
    :cond_f
    const/4 v0, 0x0

    .line 312
    :goto_f
    const/16 v11, 0x11

    .line 313
    .line 314
    invoke-virtual {v1, v11}, Lmj0;->m(I)V

    .line 315
    .line 316
    .line 317
    const/16 v11, 0x10

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    invoke-virtual {v1, v11, v13}, Lmj0;->c(II)V

    .line 321
    .line 322
    .line 323
    const/16 v11, 0xf

    .line 324
    .line 325
    invoke-virtual {v1, v11, v13}, Lmj0;->c(II)V

    .line 326
    .line 327
    .line 328
    const/16 v11, 0xe

    .line 329
    .line 330
    invoke-virtual {v1, v11, v13}, Lmj0;->c(II)V

    .line 331
    .line 332
    .line 333
    const/16 v11, 0xd

    .line 334
    .line 335
    invoke-virtual {v1, v11, v13}, Lmj0;->c(II)V

    .line 336
    .line 337
    .line 338
    const/16 v11, 0xc

    .line 339
    .line 340
    invoke-virtual {v1, v11, v13}, Lmj0;->c(II)V

    .line 341
    .line 342
    .line 343
    const/16 v11, 0xb

    .line 344
    .line 345
    invoke-virtual {v1, v11, v0}, Lmj0;->c(II)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, v9, v10}, Lmj0;->c(II)V

    .line 349
    .line 350
    .line 351
    const/16 v0, 0x9

    .line 352
    .line 353
    invoke-virtual {v1, v0, v3}, Lmj0;->c(II)V

    .line 354
    .line 355
    .line 356
    const/16 v0, 0x8

    .line 357
    .line 358
    invoke-virtual {v1, v0, v13}, Lmj0;->c(II)V

    .line 359
    .line 360
    .line 361
    const/4 v0, 0x7

    .line 362
    invoke-virtual {v1, v0, v8}, Lmj0;->c(II)V

    .line 363
    .line 364
    .line 365
    const/4 v0, 0x6

    .line 366
    invoke-virtual {v1, v0, v13}, Lmj0;->c(II)V

    .line 367
    .line 368
    .line 369
    const/4 v0, 0x5

    .line 370
    invoke-virtual {v1, v0, v13}, Lmj0;->c(II)V

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x4

    .line 374
    invoke-virtual {v1, v14, v7}, Lmj0;->c(II)V

    .line 375
    .line 376
    .line 377
    const/4 v0, 0x3

    .line 378
    invoke-virtual {v1, v0, v6}, Lmj0;->c(II)V

    .line 379
    .line 380
    .line 381
    const/4 v0, 0x2

    .line 382
    invoke-virtual {v1, v0, v5}, Lmj0;->c(II)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v12, v4}, Lmj0;->c(II)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v13, v2}, Lmj0;->c(II)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Lmj0;->g()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    invoke-virtual {v1, v0}, Lmj0;->i(I)V

    .line 396
    .line 397
    .line 398
    return v0

    .line 399
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b0(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lat;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Li80;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-static {v0, p1, v1}, Lat;->b0(Lat;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyg1;->v:Lat;

    .line 18
    .line 19
    return-void
.end method

.method public final d0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyg1;->x:Lix1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lix1;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyg1;->x:Lix1;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lyg1;->x:Lix1;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lp3;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lp3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput p1, v0, Lp3;->u:I

    .line 24
    .line 25
    iput p1, v0, Lp3;->v:I

    .line 26
    .line 27
    iput-object v0, p0, Lix1;->u:Lp3;

    .line 28
    .line 29
    return-void
.end method

.method public final varargs e0([Ljava/lang/Class;)V
    .locals 7

    .line 1
    new-instance v0, Lix1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    sget-object v2, Lbe0;->h:Lbe0;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, Lix1;->t:Ljava/util/List;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_2

    .line 18
    .line 19
    aget-object v3, p1, v2

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    new-instance v4, Lhx1;

    .line 24
    .line 25
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v5, Lat;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Li80;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v6, 0x6

    .line 38
    invoke-static {v5, v3, v6}, Lat;->b0(Lat;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iput-object v5, v4, Lhx1;->t:Lat;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v4, 0x0

    .line 45
    :goto_1
    iget-object v3, v0, Lix1;->t:Ljava/util/List;

    .line 46
    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    :cond_1
    iput-object v3, v0, Lix1;->t:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iput-object v0, p0, Lyg1;->x:Lix1;

    .line 63
    .line 64
    return-void
.end method

.method public final f0(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lat;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Li80;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-static {v0, p1, v1}, Lat;->b0(Lat;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyg1;->w:Lat;

    .line 18
    .line 19
    return-void
.end method

.method public final g0(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Llv2;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p1, v1}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lyg1;->t:Llv2;

    .line 8
    .line 9
    return-void
.end method

.method public final varargs h0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Llv2;

    .line 14
    .line 15
    const/4 v5, 0x5

    .line 16
    invoke-direct {v4, v3, v5}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lyg1;->y:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method

.method public final varargs i0([Ljava/lang/Number;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_6

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Las1;

    .line 14
    .line 15
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    instance-of v5, v3, Ljava/lang/Byte;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    new-instance v5, Lle0;

    .line 30
    .line 31
    invoke-direct {v5, v3}, Lle0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v5, v4, Las1;->a:Ldx0;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput v3, v4, Las1;->b:I

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    instance-of v5, v3, Ljava/lang/Short;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    new-instance v5, Lqe0;

    .line 49
    .line 50
    invoke-direct {v5, v3}, Lqe0;-><init>(S)V

    .line 51
    .line 52
    .line 53
    iput-object v5, v4, Las1;->a:Ldx0;

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    iput v3, v4, Las1;->b:I

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    instance-of v5, v3, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    new-instance v5, Loe0;

    .line 68
    .line 69
    invoke-direct {v5, v3}, Loe0;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v4, Las1;->a:Ldx0;

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    iput v3, v4, Las1;->b:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    instance-of v5, v3, Ljava/lang/Long;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    new-instance v3, Lpe0;

    .line 87
    .line 88
    invoke-direct {v3, v5, v6}, Lpe0;-><init>(J)V

    .line 89
    .line 90
    .line 91
    iput-object v3, v4, Las1;->a:Ldx0;

    .line 92
    .line 93
    const/4 v3, 0x4

    .line 94
    iput v3, v4, Las1;->b:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    instance-of v5, v3, Ljava/lang/Float;

    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    new-instance v5, Lne0;

    .line 106
    .line 107
    invoke-direct {v5, v3}, Lne0;-><init>(F)V

    .line 108
    .line 109
    .line 110
    iput-object v5, v4, Las1;->a:Ldx0;

    .line 111
    .line 112
    const/4 v3, 0x5

    .line 113
    iput v3, v4, Las1;->b:I

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    instance-of v5, v3, Ljava/lang/Double;

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    new-instance v3, Lme0;

    .line 125
    .line 126
    invoke-direct {v3, v5, v6}, Lme0;-><init>(D)V

    .line 127
    .line 128
    .line 129
    iput-object v3, v4, Las1;->a:Ldx0;

    .line 130
    .line 131
    const/4 v3, 0x6

    .line 132
    iput v3, v4, Las1;->b:I

    .line 133
    .line 134
    :cond_5
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x1

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lyg1;->z:Ljava/util/ArrayList;

    .line 147
    .line 148
    return-void
.end method

.method public final varargs j0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Llv2;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-direct {v4, v3, v5}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lyg1;->y:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method
