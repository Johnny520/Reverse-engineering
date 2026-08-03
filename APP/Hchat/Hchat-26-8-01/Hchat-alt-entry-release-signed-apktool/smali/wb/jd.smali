.class public final synthetic Lwb/jd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lfg/a;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    .line 2
    iput p4, p0, Lwb/jd;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/jd;->h:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/jd;->i:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/jd;->j:Lfg/a;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Lfg/a;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwb/jd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/jd;->i:Ljava/lang/String;

    iput-object p2, p0, Lwb/jd;->h:Landroid/content/Context;

    iput-object p3, p0, Lwb/jd;->j:Lfg/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/jd;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xc31

    .line 20
    .line 21
    invoke-static {v2}, Li0/r;->C(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, v0, Lwb/jd;->h:Landroid/content/Context;

    .line 26
    .line 27
    iget-object v4, v0, Lwb/jd;->i:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v5, v0, Lwb/jd;->j:Lfg/a;

    .line 30
    .line 31
    invoke-static {v3, v4, v5, v1, v2}, Lwb/ho;->q3(Landroid/content/Context;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    move-object/from16 v11, p1

    .line 38
    .line 39
    check-cast v11, Li0/h0;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    and-int/lit8 v2, v1, 0x3

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x1

    .line 54
    if-eq v2, v3, :cond_0

    .line 55
    .line 56
    move v2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v2, v4

    .line 59
    :goto_0
    and-int/2addr v1, v5

    .line 60
    invoke-virtual {v11, v1, v2}, Li0/h0;->S(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    sget-object v1, Lp/j;->c:Lp/e;

    .line 67
    .line 68
    sget-object v2, Ly0/b;->s:Ly0/e;

    .line 69
    .line 70
    invoke-static {v1, v2, v11, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-wide v2, v11, Li0/h0;->T:J

    .line 75
    .line 76
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 85
    .line 86
    invoke-static {v11, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 96
    .line 97
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 98
    .line 99
    .line 100
    iget-boolean v8, v11, Li0/h0;->S:Z

    .line 101
    .line 102
    if-eqz v8, :cond_1

    .line 103
    .line 104
    invoke-virtual {v11, v7}, Li0/h0;->k(Lfg/a;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 112
    .line 113
    invoke-static {v7, v11, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 117
    .line 118
    invoke-static {v1, v11, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 126
    .line 127
    invoke-static {v2, v11, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 131
    .line 132
    invoke-static {v1, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 133
    .line 134
    .line 135
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 136
    .line 137
    invoke-static {v1, v11, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 141
    .line 142
    invoke-virtual {v11, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Lbi/b;

    .line 147
    .line 148
    invoke-virtual {v2}, Lbi/b;->g()J

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    const/16 v6, 0xd

    .line 153
    .line 154
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    const/high16 v8, 0x3f800000    # 1.0f

    .line 159
    .line 160
    invoke-static {v4, v8}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    const/16 v10, 0x8

    .line 165
    .line 166
    int-to-float v10, v10

    .line 167
    const/4 v12, 0x0

    .line 168
    invoke-static {v9, v12, v10, v5}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-static {v10}, Lv/e;->a(F)Lv/d;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-static {v9, v12}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-virtual {v11, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Lbi/b;

    .line 185
    .line 186
    invoke-virtual {v1}, Lbi/b;->n()J

    .line 187
    .line 188
    .line 189
    move-result-wide v12

    .line 190
    sget-object v1, Lf1/c0;->b:Lf1/m0;

    .line 191
    .line 192
    invoke-static {v9, v12, v13, v1}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const/16 v9, 0xc

    .line 197
    .line 198
    int-to-float v9, v9

    .line 199
    const/16 v12, 0xa

    .line 200
    .line 201
    int-to-float v12, v12

    .line 202
    invoke-static {v1, v9, v12}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const/16 v23, 0x0

    .line 207
    .line 208
    const v24, 0x3ffe8

    .line 209
    .line 210
    .line 211
    move-object v12, v4

    .line 212
    move-wide/from16 v30, v2

    .line 213
    .line 214
    move v3, v5

    .line 215
    move-wide/from16 v4, v30

    .line 216
    .line 217
    iget-object v2, v0, Lwb/jd;->i:Ljava/lang/String;

    .line 218
    .line 219
    move v13, v8

    .line 220
    const/4 v8, 0x0

    .line 221
    move v14, v9

    .line 222
    const/4 v9, 0x0

    .line 223
    move v15, v10

    .line 224
    move-object/from16 v21, v11

    .line 225
    .line 226
    const-wide/16 v10, 0x0

    .line 227
    .line 228
    move-object/from16 v16, v12

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    move/from16 v18, v13

    .line 232
    .line 233
    move/from16 v17, v14

    .line 234
    .line 235
    const-wide/16 v13, 0x0

    .line 236
    .line 237
    move/from16 v19, v15

    .line 238
    .line 239
    const/4 v15, 0x0

    .line 240
    move-object/from16 v20, v16

    .line 241
    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    move/from16 v22, v17

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    move/from16 v25, v18

    .line 249
    .line 250
    const/16 v18, 0x0

    .line 251
    .line 252
    move/from16 v26, v19

    .line 253
    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    move-object/from16 v27, v20

    .line 257
    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    move/from16 v28, v22

    .line 261
    .line 262
    const/16 v22, 0x6000

    .line 263
    .line 264
    move-object v3, v1

    .line 265
    move/from16 v1, v25

    .line 266
    .line 267
    move-object/from16 v29, v27

    .line 268
    .line 269
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v11, v21

    .line 273
    .line 274
    iget-object v3, v0, Lwb/jd;->h:Landroid/content/Context;

    .line 275
    .line 276
    invoke-virtual {v11, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    or-int/2addr v4, v5

    .line 285
    iget-object v5, v0, Lwb/jd;->j:Lfg/a;

    .line 286
    .line 287
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    or-int/2addr v4, v6

    .line 292
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    if-nez v4, :cond_2

    .line 297
    .line 298
    sget-object v4, Li0/l;->a:Li0/e;

    .line 299
    .line 300
    if-ne v6, v4, :cond_3

    .line 301
    .line 302
    :cond_2
    new-instance v6, Lab/e;

    .line 303
    .line 304
    const/16 v4, 0x17

    .line 305
    .line 306
    invoke-direct {v6, v3, v2, v5, v4}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_3
    move-object v3, v6

    .line 313
    check-cast v3, Lfg/a;

    .line 314
    .line 315
    move-object/from16 v2, v29

    .line 316
    .line 317
    invoke-static {v2, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    const/16 v16, 0x0

    .line 322
    .line 323
    const/16 v17, 0xd

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const/4 v15, 0x0

    .line 327
    move/from16 v14, v28

    .line 328
    .line 329
    invoke-static/range {v12 .. v17}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-static {v11}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    const/16 v12, 0x186

    .line 338
    .line 339
    const/16 v13, 0x778

    .line 340
    .line 341
    const-string v2, "\u590d\u5236\u8def\u5f84"

    .line 342
    .line 343
    move-object v6, v5

    .line 344
    const/4 v5, 0x0

    .line 345
    move-object v7, v6

    .line 346
    const/4 v6, 0x0

    .line 347
    move-object v8, v7

    .line 348
    const/4 v7, 0x0

    .line 349
    move-object v10, v8

    .line 350
    const/4 v8, 0x0

    .line 351
    move-object v14, v10

    .line 352
    const/4 v10, 0x0

    .line 353
    move-object/from16 v18, v14

    .line 354
    .line 355
    move-object/from16 v14, v29

    .line 356
    .line 357
    invoke-static/range {v2 .. v13}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 358
    .line 359
    .line 360
    invoke-static {v14, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    const/4 v13, 0x0

    .line 365
    move/from16 v14, v26

    .line 366
    .line 367
    invoke-static/range {v12 .. v17}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-static {v11}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    const/16 v12, 0x186

    .line 376
    .line 377
    const/16 v13, 0x778

    .line 378
    .line 379
    const-string v2, "\u5173\u95ed"

    .line 380
    .line 381
    move-object/from16 v3, v18

    .line 382
    .line 383
    invoke-static/range {v2 .. v13}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 384
    .line 385
    .line 386
    const/4 v3, 0x1

    .line 387
    invoke-virtual {v11, v3}, Li0/h0;->p(Z)V

    .line 388
    .line 389
    .line 390
    goto :goto_2

    .line 391
    :cond_4
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 392
    .line 393
    .line 394
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 395
    .line 396
    return-object v1

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
