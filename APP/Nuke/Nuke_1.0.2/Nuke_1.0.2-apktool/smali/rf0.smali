.class public final Lrf0;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;


# instance fields
.field public A:Lxm0;

.field public B:Lkf0;

.field public C:J

.field public D:Lr5;

.field public final E:Lqf0;

.field public v:Ly33;

.field public w:Lu33;

.field public x:Lu33;

.field public y:Lsf0;

.field public z:Lph0;


# direct methods
.method public constructor <init>(Ly33;Lu33;Lu33;Lsf0;Lph0;Lxm0;Lkf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrf0;->v:Ly33;

    .line 5
    .line 6
    iput-object p2, p0, Lrf0;->w:Lu33;

    .line 7
    .line 8
    iput-object p3, p0, Lrf0;->x:Lu33;

    .line 9
    .line 10
    iput-object p4, p0, Lrf0;->y:Lsf0;

    .line 11
    .line 12
    iput-object p5, p0, Lrf0;->z:Lph0;

    .line 13
    .line 14
    iput-object p6, p0, Lrf0;->A:Lxm0;

    .line 15
    .line 16
    iput-object p7, p0, Lrf0;->B:Lkf0;

    .line 17
    .line 18
    const-wide p1, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lrf0;->C:J

    .line 24
    .line 25
    const/16 p1, 0xf

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-static {p2, p2, p2, p2, p1}, Lgz;->b(IIIII)J

    .line 29
    .line 30
    .line 31
    new-instance p1, Lqf0;

    .line 32
    .line 33
    invoke-direct {p1, p0, p2}, Lqf0;-><init>(Lrf0;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lrf0;->E:Lqf0;

    .line 37
    .line 38
    new-instance p1, Lqf0;

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-direct {p1, p0, p2}, Lqf0;-><init>(Lrf0;I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final D(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->X(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final E0()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lrf0;->C:J

    .line 7
    .line 8
    return-void
.end method

.method public final M0()Lr5;
    .locals 3

    .line 1
    iget-object v0, p0, Lrf0;->v:Ly33;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly33;->f()Lv33;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lif0;->h:Lif0;

    .line 8
    .line 9
    sget-object v2, Lif0;->i:Lif0;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lv33;->a(Lif0;Lif0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lrf0;->z:Lph0;

    .line 18
    .line 19
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Lrf0;->z:Lph0;

    .line 23
    .line 24
    iget-object p0, p0, Lph0;->a:Lz33;

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final U(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->N(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lrf0;->v:Ly33;

    .line 6
    .line 7
    invoke-virtual {v2}, Ly33;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, Lrf0;->v:Ly33;

    .line 12
    .line 13
    iget-object v3, v3, Ly33;->d:Lnx1;

    .line 14
    .line 15
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    iput-object v4, v0, Lrf0;->D:Lr5;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lrf0;->D:Lr5;

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lrf0;->M0()Lr5;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    sget-object v2, Lsn;->j:Lrk;

    .line 36
    .line 37
    :cond_1
    iput-object v2, v0, Lrf0;->D:Lr5;

    .line 38
    .line 39
    :cond_2
    :goto_0
    invoke-interface {v1}, Lm11;->u()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x3

    .line 44
    sget-object v5, Lce0;->h:Lce0;

    .line 45
    .line 46
    const-wide v6, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v8, 0x20

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface/range {p2 .. p4}, Lif1;->e(J)Lsz1;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget v4, v2, Lsz1;->h:I

    .line 60
    .line 61
    iget v9, v2, Lsz1;->i:I

    .line 62
    .line 63
    int-to-long v10, v4

    .line 64
    shl-long/2addr v10, v8

    .line 65
    int-to-long v12, v9

    .line 66
    and-long/2addr v12, v6

    .line 67
    or-long v9, v10, v12

    .line 68
    .line 69
    iput-wide v9, v0, Lrf0;->C:J

    .line 70
    .line 71
    shr-long v11, v9, v8

    .line 72
    .line 73
    long-to-int v0, v11

    .line 74
    and-long/2addr v6, v9

    .line 75
    long-to-int v4, v6

    .line 76
    new-instance v6, Ln6;

    .line 77
    .line 78
    invoke-direct {v6, v2, v3}, Ln6;-><init>(Lsz1;I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v0, v4, v5, v6}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :cond_3
    iget-object v2, v0, Lrf0;->A:Lxm0;

    .line 87
    .line 88
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_10

    .line 99
    .line 100
    iget-object v2, v0, Lrf0;->B:Lkf0;

    .line 101
    .line 102
    iget-object v9, v2, Lkf0;->a:Lu33;

    .line 103
    .line 104
    iget-object v10, v2, Lkf0;->b:Lu33;

    .line 105
    .line 106
    iget-object v11, v2, Lkf0;->c:Ly33;

    .line 107
    .line 108
    iget-object v12, v2, Lkf0;->d:Lsf0;

    .line 109
    .line 110
    iget-object v13, v12, Lsf0;->a:Lz33;

    .line 111
    .line 112
    iget-object v14, v2, Lkf0;->e:Lph0;

    .line 113
    .line 114
    iget-object v2, v2, Lkf0;->f:Lu33;

    .line 115
    .line 116
    const/4 v15, 0x1

    .line 117
    const/4 v4, 0x0

    .line 118
    move-wide/from16 v16, v6

    .line 119
    .line 120
    if-eqz v9, :cond_4

    .line 121
    .line 122
    new-instance v6, Llf0;

    .line 123
    .line 124
    invoke-direct {v6, v12, v14, v4}, Llf0;-><init>(Lsf0;Lph0;I)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Llf0;

    .line 128
    .line 129
    invoke-direct {v7, v12, v14, v15}, Llf0;-><init>(Lsf0;Lph0;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v6, v7}, Lu33;->a(Lin0;Lin0;)Lt33;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    goto :goto_1

    .line 137
    :cond_4
    const/4 v6, 0x0

    .line 138
    :goto_1
    const/4 v7, 0x2

    .line 139
    if-eqz v10, :cond_5

    .line 140
    .line 141
    new-instance v9, Llf0;

    .line 142
    .line 143
    invoke-direct {v9, v12, v14, v7}, Llf0;-><init>(Lsf0;Lph0;I)V

    .line 144
    .line 145
    .line 146
    move/from16 v18, v8

    .line 147
    .line 148
    new-instance v8, Llf0;

    .line 149
    .line 150
    invoke-direct {v8, v12, v14, v3}, Llf0;-><init>(Lsf0;Lph0;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v9, v8}, Lu33;->a(Lin0;Lin0;)Lt33;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    move/from16 v18, v8

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    :goto_2
    invoke-virtual {v11}, Ly33;->c()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    sget-object v10, Lif0;->h:Lif0;

    .line 166
    .line 167
    if-ne v9, v10, :cond_8

    .line 168
    .line 169
    iget-object v9, v13, Lz33;->b:Lcd2;

    .line 170
    .line 171
    if-eqz v9, :cond_6

    .line 172
    .line 173
    iget-wide v9, v9, Lcd2;->a:J

    .line 174
    .line 175
    new-instance v11, Lm33;

    .line 176
    .line 177
    invoke-direct {v11, v9, v10}, Lm33;-><init>(J)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    iget-object v9, v14, Lph0;->a:Lz33;

    .line 182
    .line 183
    iget-object v9, v9, Lz33;->b:Lcd2;

    .line 184
    .line 185
    if-eqz v9, :cond_7

    .line 186
    .line 187
    iget-wide v9, v9, Lcd2;->a:J

    .line 188
    .line 189
    new-instance v11, Lm33;

    .line 190
    .line 191
    invoke-direct {v11, v9, v10}, Lm33;-><init>(J)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    const/4 v11, 0x0

    .line 196
    goto :goto_3

    .line 197
    :cond_8
    iget-object v9, v14, Lph0;->a:Lz33;

    .line 198
    .line 199
    iget-object v9, v9, Lz33;->b:Lcd2;

    .line 200
    .line 201
    if-eqz v9, :cond_9

    .line 202
    .line 203
    iget-wide v9, v9, Lcd2;->a:J

    .line 204
    .line 205
    new-instance v11, Lm33;

    .line 206
    .line 207
    invoke-direct {v11, v9, v10}, Lm33;-><init>(J)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_9
    iget-object v9, v13, Lz33;->b:Lcd2;

    .line 212
    .line 213
    if-eqz v9, :cond_7

    .line 214
    .line 215
    iget-wide v9, v9, Lcd2;->a:J

    .line 216
    .line 217
    new-instance v11, Lm33;

    .line 218
    .line 219
    invoke-direct {v11, v9, v10}, Lm33;-><init>(J)V

    .line 220
    .line 221
    .line 222
    :goto_3
    if-eqz v2, :cond_a

    .line 223
    .line 224
    sget-object v9, Lv6;->J:Lv6;

    .line 225
    .line 226
    new-instance v10, Lec;

    .line 227
    .line 228
    invoke-direct {v10, v11, v12, v14, v3}, Lec;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v9, v10}, Lu33;->a(Lin0;Lin0;)Lt33;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    goto :goto_4

    .line 236
    :cond_a
    const/4 v2, 0x0

    .line 237
    :goto_4
    new-instance v3, Lec;

    .line 238
    .line 239
    invoke-direct {v3, v6, v8, v2, v7}, Lec;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 240
    .line 241
    .line 242
    invoke-interface/range {p2 .. p4}, Lif1;->e(J)Lsz1;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iget v6, v2, Lsz1;->h:I

    .line 247
    .line 248
    iget v7, v2, Lsz1;->i:I

    .line 249
    .line 250
    int-to-long v8, v6

    .line 251
    shl-long v8, v8, v18

    .line 252
    .line 253
    int-to-long v6, v7

    .line 254
    and-long v6, v6, v16

    .line 255
    .line 256
    or-long/2addr v6, v8

    .line 257
    iget-wide v8, v0, Lrf0;->C:J

    .line 258
    .line 259
    const-wide v10, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v8, v9, v10, v11}, Lh11;->a(JJ)Z

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    if-nez v8, :cond_b

    .line 269
    .line 270
    iget-wide v8, v0, Lrf0;->C:J

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_b
    move-wide v8, v6

    .line 274
    :goto_5
    iget-object v10, v0, Lrf0;->w:Lu33;

    .line 275
    .line 276
    if-eqz v10, :cond_c

    .line 277
    .line 278
    new-instance v11, Lpf0;

    .line 279
    .line 280
    invoke-direct {v11, v0, v8, v9, v4}, Lpf0;-><init>(Lrf0;JI)V

    .line 281
    .line 282
    .line 283
    iget-object v4, v0, Lrf0;->E:Lqf0;

    .line 284
    .line 285
    invoke-virtual {v10, v4, v11}, Lu33;->a(Lin0;Lin0;)Lt33;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    goto :goto_6

    .line 290
    :cond_c
    const/4 v4, 0x0

    .line 291
    :goto_6
    if-eqz v4, :cond_d

    .line 292
    .line 293
    invoke-virtual {v4}, Lt33;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    check-cast v4, Lh11;

    .line 298
    .line 299
    iget-wide v6, v4, Lh11;->a:J

    .line 300
    .line 301
    :cond_d
    move-wide/from16 v10, p3

    .line 302
    .line 303
    invoke-static {v10, v11, v6, v7}, Lgz;->d(JJ)J

    .line 304
    .line 305
    .line 306
    move-result-wide v22

    .line 307
    iget-object v4, v0, Lrf0;->x:Lu33;

    .line 308
    .line 309
    const-wide/16 v6, 0x0

    .line 310
    .line 311
    if-eqz v4, :cond_e

    .line 312
    .line 313
    sget-object v10, Lv6;->K:Lv6;

    .line 314
    .line 315
    new-instance v11, Lpf0;

    .line 316
    .line 317
    invoke-direct {v11, v0, v8, v9, v15}, Lpf0;-><init>(Lrf0;JI)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v4, v10, v11}, Lu33;->a(Lin0;Lin0;)Lt33;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-virtual {v4}, Lt33;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, Lz01;

    .line 329
    .line 330
    iget-wide v10, v4, Lz01;->a:J

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_e
    move-wide v10, v6

    .line 334
    :goto_7
    iget-object v0, v0, Lrf0;->D:Lr5;

    .line 335
    .line 336
    if-eqz v0, :cond_f

    .line 337
    .line 338
    sget-object v24, Ld61;->h:Ld61;

    .line 339
    .line 340
    move-object/from16 v19, v0

    .line 341
    .line 342
    move-wide/from16 v20, v8

    .line 343
    .line 344
    invoke-interface/range {v19 .. v24}, Lr5;->a(JJLd61;)J

    .line 345
    .line 346
    .line 347
    move-result-wide v8

    .line 348
    goto :goto_8

    .line 349
    :cond_f
    move-wide v8, v6

    .line 350
    :goto_8
    invoke-static {v8, v9, v6, v7}, Lz01;->c(JJ)J

    .line 351
    .line 352
    .line 353
    move-result-wide v6

    .line 354
    shr-long v8, v22, v18

    .line 355
    .line 356
    long-to-int v0, v8

    .line 357
    and-long v8, v22, v16

    .line 358
    .line 359
    long-to-int v4, v8

    .line 360
    new-instance v19, Lof0;

    .line 361
    .line 362
    move-object/from16 v20, v2

    .line 363
    .line 364
    move-object/from16 v25, v3

    .line 365
    .line 366
    move-wide/from16 v21, v6

    .line 367
    .line 368
    move-wide/from16 v23, v10

    .line 369
    .line 370
    invoke-direct/range {v19 .. v25}, Lof0;-><init>(Lsz1;JJLec;)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v2, v19

    .line 374
    .line 375
    invoke-interface {v1, v0, v4, v5, v2}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    return-object v0

    .line 380
    :cond_10
    move-wide/from16 v10, p3

    .line 381
    .line 382
    invoke-interface/range {p2 .. p4}, Lif1;->e(J)Lsz1;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget v2, v0, Lsz1;->h:I

    .line 387
    .line 388
    iget v3, v0, Lsz1;->i:I

    .line 389
    .line 390
    new-instance v4, Ln6;

    .line 391
    .line 392
    const/4 v6, 0x4

    .line 393
    invoke-direct {v4, v0, v6}, Ln6;-><init>(Lsz1;I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v1, v2, v3, v5, v4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0
.end method

.method public final g(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->W(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final p(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    invoke-interface {p2, p3}, Lif1;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
