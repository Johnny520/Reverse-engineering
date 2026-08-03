.class public final Lwb/f5;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:Ls1/t;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lwb/e5;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lwb/e5;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/f5;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/f5;->k:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/f5;->l:Lwb/e5;

    .line 6
    .line 7
    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Lwb/f5;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/f5;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/f5;->l:Lwb/e5;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lwb/f5;->k:Lfg/l;

    .line 12
    .line 13
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/f5;-><init>(Lfg/l;Lwb/e5;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lwb/f5;

    .line 20
    .line 21
    iget-object v1, p0, Lwb/f5;->l:Lwb/e5;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, Lwb/f5;->k:Lfg/l;

    .line 25
    .line 26
    invoke-direct {v0, v3, v1, p2, v2}, Lwb/f5;-><init>(Lfg/l;Lwb/e5;Lwf/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/f5;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/f5;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/f5;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/f5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/f5;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lwb/f5;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lwb/f5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/f5;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    sget-object v3, Ls1/l;->h:Ls1/l;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 12
    .line 13
    iget-object v8, v0, Lwb/f5;->k:Lfg/l;

    .line 14
    .line 15
    iget-object v9, v0, Lwb/f5;->l:Lwb/e5;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/high16 v11, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const-string v12, "#%06X"

    .line 21
    .line 22
    const/4 v15, 0x3

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    const-wide v17, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x2

    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    iget v1, v9, Lwb/e5;->c:F

    .line 36
    .line 37
    iget v9, v9, Lwb/e5;->b:F

    .line 38
    .line 39
    const v19, 0xffffff

    .line 40
    .line 41
    .line 42
    iget-object v13, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v13, Ls1/k0;

    .line 45
    .line 46
    const/16 v20, 0x0

    .line 47
    .line 48
    iget v14, v0, Lwb/f5;->i:I

    .line 49
    .line 50
    const/high16 v21, 0x43b40000    # 360.0f

    .line 51
    .line 52
    if-eqz v14, :cond_2

    .line 53
    .line 54
    if-eq v14, v6, :cond_1

    .line 55
    .line 56
    if-ne v14, v7, :cond_0

    .line 57
    .line 58
    iget-object v4, v0, Lwb/f5;->h:Ls1/t;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v6, p1

    .line 64
    .line 65
    move-object v14, v8

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_0
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v2, v16

    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object/from16 v4, p1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object v13, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 85
    .line 86
    iput v6, v0, Lwb/f5;->i:I

    .line 87
    .line 88
    invoke-static {v13, v0, v7}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-ne v4, v5, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    :goto_0
    check-cast v4, Ls1/t;

    .line 96
    .line 97
    move/from16 v22, v7

    .line 98
    .line 99
    move-object v14, v8

    .line 100
    iget-wide v7, v4, Ls1/t;->c:J

    .line 101
    .line 102
    and-long v7, v7, v17

    .line 103
    .line 104
    long-to-int v7, v7

    .line 105
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    iget-object v8, v13, Ls1/k0;->l:Ls1/l0;

    .line 110
    .line 111
    move/from16 v23, v6

    .line 112
    .line 113
    move/from16 p1, v7

    .line 114
    .line 115
    iget-wide v6, v8, Ls1/l0;->E:J

    .line 116
    .line 117
    and-long v6, v6, v17

    .line 118
    .line 119
    long-to-int v6, v6

    .line 120
    int-to-float v6, v6

    .line 121
    div-float v7, p1, v6

    .line 122
    .line 123
    invoke-static {v7, v10, v11}, Lr9/e0;->q(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    mul-float v6, v6, v21

    .line 128
    .line 129
    new-array v7, v15, [F

    .line 130
    .line 131
    aput v6, v7, v20

    .line 132
    .line 133
    aput v9, v7, v23

    .line 134
    .line 135
    aput v1, v7, v22

    .line 136
    .line 137
    invoke-static {v7}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    and-int v6, v6, v19

    .line 142
    .line 143
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    move/from16 v7, v23

    .line 152
    .line 153
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-interface {v14, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :goto_1
    iput-object v13, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v4, v0, Lwb/f5;->h:Ls1/t;

    .line 167
    .line 168
    move/from16 v6, v22

    .line 169
    .line 170
    iput v6, v0, Lwb/f5;->i:I

    .line 171
    .line 172
    invoke-virtual {v13, v3, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    if-ne v6, v5, :cond_4

    .line 177
    .line 178
    :goto_2
    move-object v2, v5

    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :cond_4
    :goto_3
    check-cast v6, Ls1/k;

    .line 182
    .line 183
    iget-object v6, v6, Ls1/k;->a:Ljava/lang/Object;

    .line 184
    .line 185
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-eqz v7, :cond_6

    .line 194
    .line 195
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    move-object v8, v7

    .line 200
    check-cast v8, Ls1/t;

    .line 201
    .line 202
    iget-wide v10, v8, Ls1/t;->a:J

    .line 203
    .line 204
    move/from16 v24, v1

    .line 205
    .line 206
    move-object v8, v2

    .line 207
    iget-wide v1, v4, Ls1/t;->a:J

    .line 208
    .line 209
    invoke-static {v10, v11, v1, v2}, Ls1/s;->e(JJ)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_5

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_5
    move-object v2, v8

    .line 217
    move/from16 v1, v24

    .line 218
    .line 219
    const/4 v10, 0x0

    .line 220
    const/high16 v11, 0x3f800000    # 1.0f

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_6
    move/from16 v24, v1

    .line 224
    .line 225
    move-object v8, v2

    .line 226
    move-object/from16 v7, v16

    .line 227
    .line 228
    :goto_5
    check-cast v7, Ls1/t;

    .line 229
    .line 230
    if-eqz v7, :cond_8

    .line 231
    .line 232
    iget-wide v1, v7, Ls1/t;->c:J

    .line 233
    .line 234
    and-long v1, v1, v17

    .line 235
    .line 236
    long-to-int v1, v1

    .line 237
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    iget-object v2, v13, Ls1/k0;->l:Ls1/l0;

    .line 242
    .line 243
    iget-wide v10, v2, Ls1/l0;->E:J

    .line 244
    .line 245
    and-long v10, v10, v17

    .line 246
    .line 247
    long-to-int v2, v10

    .line 248
    int-to-float v2, v2

    .line 249
    div-float/2addr v1, v2

    .line 250
    const/4 v2, 0x0

    .line 251
    const/high16 v6, 0x3f800000    # 1.0f

    .line 252
    .line 253
    invoke-static {v1, v2, v6}, Lr9/e0;->q(FFF)F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    mul-float v1, v1, v21

    .line 258
    .line 259
    new-array v2, v15, [F

    .line 260
    .line 261
    aput v1, v2, v20

    .line 262
    .line 263
    const/4 v1, 0x1

    .line 264
    aput v9, v2, v1

    .line 265
    .line 266
    const/16 v22, 0x2

    .line 267
    .line 268
    aput v24, v2, v22

    .line 269
    .line 270
    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    and-int v2, v2, v19

    .line 275
    .line 276
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-static {v12, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-interface {v14, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7}, Ls1/t;->a()V

    .line 296
    .line 297
    .line 298
    iget-boolean v1, v7, Ls1/t;->d:Z

    .line 299
    .line 300
    if-nez v1, :cond_7

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_7
    move-object v2, v8

    .line 304
    move/from16 v1, v24

    .line 305
    .line 306
    const/4 v10, 0x0

    .line 307
    const/high16 v11, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/16 v22, 0x2

    .line 310
    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :cond_8
    :goto_6
    move-object v2, v8

    .line 314
    :goto_7
    return-object v2

    .line 315
    :pswitch_0
    move-object v14, v8

    .line 316
    const v19, 0xffffff

    .line 317
    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    move-object v8, v2

    .line 322
    iget v1, v9, Lwb/e5;->a:F

    .line 323
    .line 324
    iget-object v2, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v2, Ls1/k0;

    .line 327
    .line 328
    iget v6, v0, Lwb/f5;->i:I

    .line 329
    .line 330
    const/4 v9, 0x1

    .line 331
    const/4 v10, 0x2

    .line 332
    if-eqz v6, :cond_b

    .line 333
    .line 334
    if-eq v6, v9, :cond_a

    .line 335
    .line 336
    if-ne v6, v10, :cond_9

    .line 337
    .line 338
    iget-object v4, v0, Lwb/f5;->h:Ls1/t;

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    move-object v11, v8

    .line 344
    move-object v6, v14

    .line 345
    move v8, v1

    .line 346
    move-object/from16 v1, p1

    .line 347
    .line 348
    const/16 p1, 0x20

    .line 349
    .line 350
    goto/16 :goto_b

    .line 351
    .line 352
    :cond_9
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    move-object/from16 v2, v16

    .line 356
    .line 357
    goto/16 :goto_e

    .line 358
    .line 359
    :cond_a
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v4, p1

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    iput-object v2, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 369
    .line 370
    iput v9, v0, Lwb/f5;->i:I

    .line 371
    .line 372
    invoke-static {v2, v0, v10}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    if-ne v4, v5, :cond_c

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_c
    :goto_8
    check-cast v4, Ls1/t;

    .line 380
    .line 381
    iget-wide v9, v4, Ls1/t;->c:J

    .line 382
    .line 383
    iget-object v6, v2, Ls1/k0;->l:Ls1/l0;

    .line 384
    .line 385
    move-object v11, v8

    .line 386
    const/16 v13, 0x20

    .line 387
    .line 388
    iget-wide v7, v6, Ls1/l0;->E:J

    .line 389
    .line 390
    move/from16 p1, v13

    .line 391
    .line 392
    move-object v6, v14

    .line 393
    shr-long v13, v7, p1

    .line 394
    .line 395
    long-to-int v13, v13

    .line 396
    int-to-float v13, v13

    .line 397
    and-long v7, v7, v17

    .line 398
    .line 399
    long-to-int v7, v7

    .line 400
    int-to-float v7, v7

    .line 401
    move v8, v1

    .line 402
    move-object v14, v2

    .line 403
    shr-long v1, v9, p1

    .line 404
    .line 405
    long-to-int v1, v1

    .line 406
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    div-float/2addr v1, v13

    .line 411
    const/4 v2, 0x0

    .line 412
    const/high16 v13, 0x3f800000    # 1.0f

    .line 413
    .line 414
    invoke-static {v1, v2, v13}, Lr9/e0;->q(FFF)F

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    and-long v9, v9, v17

    .line 419
    .line 420
    long-to-int v9, v9

    .line 421
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    div-float/2addr v9, v7

    .line 426
    sub-float v7, v13, v9

    .line 427
    .line 428
    invoke-static {v7, v2, v13}, Lr9/e0;->q(FFF)F

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    new-array v2, v15, [F

    .line 433
    .line 434
    aput v8, v2, v20

    .line 435
    .line 436
    const/4 v9, 0x1

    .line 437
    aput v1, v2, v9

    .line 438
    .line 439
    const/4 v10, 0x2

    .line 440
    aput v7, v2, v10

    .line 441
    .line 442
    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    and-int v1, v1, v19

    .line 447
    .line 448
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-static {v12, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-interface {v6, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-object v2, v14

    .line 468
    :goto_9
    iput-object v2, v0, Lwb/f5;->j:Ljava/lang/Object;

    .line 469
    .line 470
    iput-object v4, v0, Lwb/f5;->h:Ls1/t;

    .line 471
    .line 472
    iput v10, v0, Lwb/f5;->i:I

    .line 473
    .line 474
    invoke-virtual {v2, v3, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-ne v1, v5, :cond_d

    .line 479
    .line 480
    :goto_a
    move-object v2, v5

    .line 481
    goto/16 :goto_e

    .line 482
    .line 483
    :cond_d
    :goto_b
    check-cast v1, Ls1/k;

    .line 484
    .line 485
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 486
    .line 487
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 492
    .line 493
    .line 494
    move-result v7

    .line 495
    if-eqz v7, :cond_f

    .line 496
    .line 497
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    move-object v9, v7

    .line 502
    check-cast v9, Ls1/t;

    .line 503
    .line 504
    iget-wide v9, v9, Ls1/t;->a:J

    .line 505
    .line 506
    iget-wide v13, v4, Ls1/t;->a:J

    .line 507
    .line 508
    invoke-static {v9, v10, v13, v14}, Ls1/s;->e(JJ)Z

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    if-eqz v9, :cond_e

    .line 513
    .line 514
    goto :goto_c

    .line 515
    :cond_f
    move-object/from16 v7, v16

    .line 516
    .line 517
    :goto_c
    check-cast v7, Ls1/t;

    .line 518
    .line 519
    if-eqz v7, :cond_11

    .line 520
    .line 521
    iget-wide v9, v7, Ls1/t;->c:J

    .line 522
    .line 523
    iget-object v1, v2, Ls1/k0;->l:Ls1/l0;

    .line 524
    .line 525
    iget-wide v13, v1, Ls1/l0;->E:J

    .line 526
    .line 527
    shr-long v0, v13, p1

    .line 528
    .line 529
    long-to-int v0, v0

    .line 530
    int-to-float v0, v0

    .line 531
    and-long v13, v13, v17

    .line 532
    .line 533
    long-to-int v1, v13

    .line 534
    int-to-float v1, v1

    .line 535
    shr-long v13, v9, p1

    .line 536
    .line 537
    long-to-int v13, v13

    .line 538
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 539
    .line 540
    .line 541
    move-result v13

    .line 542
    div-float/2addr v13, v0

    .line 543
    const/4 v0, 0x0

    .line 544
    const/high16 v14, 0x3f800000    # 1.0f

    .line 545
    .line 546
    invoke-static {v13, v0, v14}, Lr9/e0;->q(FFF)F

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    and-long v9, v9, v17

    .line 551
    .line 552
    long-to-int v9, v9

    .line 553
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    div-float/2addr v9, v1

    .line 558
    sub-float v1, v14, v9

    .line 559
    .line 560
    invoke-static {v1, v0, v14}, Lr9/e0;->q(FFF)F

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    new-array v9, v15, [F

    .line 565
    .line 566
    aput v8, v9, v20

    .line 567
    .line 568
    const/4 v10, 0x1

    .line 569
    aput v13, v9, v10

    .line 570
    .line 571
    const/16 v22, 0x2

    .line 572
    .line 573
    aput v1, v9, v22

    .line 574
    .line 575
    invoke-static {v9}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    and-int v1, v1, v19

    .line 580
    .line 581
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    invoke-static {v12, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    invoke-interface {v6, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v7}, Ls1/t;->a()V

    .line 601
    .line 602
    .line 603
    iget-boolean v1, v7, Ls1/t;->d:Z

    .line 604
    .line 605
    if-nez v1, :cond_10

    .line 606
    .line 607
    goto :goto_d

    .line 608
    :cond_10
    move-object/from16 v0, p0

    .line 609
    .line 610
    move/from16 v10, v22

    .line 611
    .line 612
    goto/16 :goto_9

    .line 613
    .line 614
    :cond_11
    :goto_d
    move-object v2, v11

    .line 615
    :goto_e
    return-object v2

    .line 616
    nop

    .line 617
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
