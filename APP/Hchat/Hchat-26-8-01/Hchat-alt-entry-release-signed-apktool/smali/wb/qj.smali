.class public final synthetic Lwb/qj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(FFLfg/a;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/qj;->g:F

    .line 5
    .line 6
    iput p2, p0, Lwb/qj;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lwb/qj;->i:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/qj;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/qj;->k:Landroid/content/Context;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    check-cast v8, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v8, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 33
    .line 34
    const/high16 v2, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v6, 0x0

    .line 41
    iget v7, v0, Lwb/qj;->g:F

    .line 42
    .line 43
    invoke-static {v3, v6, v7, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v7, Lp/j;->c:Lp/e;

    .line 48
    .line 49
    sget-object v9, Ly0/b;->s:Ly0/e;

    .line 50
    .line 51
    invoke-static {v7, v9, v8, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    iget-wide v9, v8, Li0/h0;->T:J

    .line 56
    .line 57
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    invoke-virtual {v8}, Li0/h0;->l()Ls0/h;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v8, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 75
    .line 76
    invoke-virtual {v8}, Li0/h0;->d0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v12, v8, Li0/h0;->S:Z

    .line 80
    .line 81
    if-eqz v12, :cond_1

    .line 82
    .line 83
    invoke-virtual {v8, v11}, Li0/h0;->k(Lfg/a;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v8}, Li0/h0;->n0()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 91
    .line 92
    invoke-static {v12, v8, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 96
    .line 97
    invoke-static {v7, v8, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 105
    .line 106
    invoke-static {v10, v8, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v9, Lx1/f;->g:Lx1/d;

    .line 110
    .line 111
    invoke-static {v9, v8}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 112
    .line 113
    .line 114
    sget-object v13, Lx1/f;->c:Lx1/e;

    .line 115
    .line 116
    invoke-static {v13, v8, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v14, v0, Lwb/qj;->h:F

    .line 124
    .line 125
    invoke-static {v3, v6, v14, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v8}, Lk/n;->q(Li0/h0;)Lk/w1;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    invoke-static {v3, v14, v5, v5}, Lk/n;->r(Ly0/o;Lk/w1;ZZ)Ly0/o;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    sget-object v14, Ly0/b;->g:Ly0/g;

    .line 138
    .line 139
    invoke-static {v14, v4}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    iget-wide v4, v8, Li0/h0;->T:J

    .line 144
    .line 145
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-virtual {v8}, Li0/h0;->l()Ls0/h;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v8, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v8}, Li0/h0;->d0()V

    .line 158
    .line 159
    .line 160
    iget-boolean v15, v8, Li0/h0;->S:Z

    .line 161
    .line 162
    if-eqz v15, :cond_2

    .line 163
    .line 164
    invoke-virtual {v8, v11}, Li0/h0;->k(Lfg/a;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    invoke-virtual {v8}, Li0/h0;->n0()V

    .line 169
    .line 170
    .line 171
    :goto_2
    invoke-static {v12, v8, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v7, v8, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v4, v8, v10, v8, v9}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v13, v8, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v3, v0, Lwb/qj;->j:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_3

    .line 190
    .line 191
    const v3, -0x6d090448

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v3}, Li0/h0;->a0(I)V

    .line 195
    .line 196
    .line 197
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 198
    .line 199
    invoke-virtual {v8, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Lbi/b;

    .line 204
    .line 205
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    const/16 v5, 0xd

    .line 210
    .line 211
    invoke-static {v5}, Lx6/d;->D(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide v9

    .line 215
    const/16 v5, 0xa

    .line 216
    .line 217
    int-to-float v5, v5

    .line 218
    const/4 v7, 0x1

    .line 219
    invoke-static {v1, v6, v5, v7}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const v23, 0x3ffe8

    .line 226
    .line 227
    .line 228
    move-object v6, v1

    .line 229
    const-string v1, "\u6682\u65e0\u8bf4\u660e"

    .line 230
    .line 231
    move v11, v7

    .line 232
    const/4 v7, 0x0

    .line 233
    move-object/from16 v20, v8

    .line 234
    .line 235
    const/4 v8, 0x0

    .line 236
    move v12, v2

    .line 237
    move-object v2, v5

    .line 238
    move-object v13, v6

    .line 239
    move-wide v5, v9

    .line 240
    const-wide/16 v9, 0x0

    .line 241
    .line 242
    move v14, v11

    .line 243
    const/4 v11, 0x0

    .line 244
    move v15, v12

    .line 245
    move-object/from16 v16, v13

    .line 246
    .line 247
    const-wide/16 v12, 0x0

    .line 248
    .line 249
    move/from16 v17, v14

    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    move/from16 v18, v15

    .line 253
    .line 254
    const/4 v15, 0x0

    .line 255
    move-object/from16 v19, v16

    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    move/from16 v21, v17

    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    move/from16 v24, v18

    .line 264
    .line 265
    const/16 v18, 0x0

    .line 266
    .line 267
    move-object/from16 v25, v19

    .line 268
    .line 269
    const/16 v19, 0x0

    .line 270
    .line 271
    move/from16 v26, v21

    .line 272
    .line 273
    const/16 v21, 0x6036

    .line 274
    .line 275
    move-object/from16 v27, v25

    .line 276
    .line 277
    const/4 v0, 0x0

    .line 278
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v8, v20

    .line 282
    .line 283
    invoke-virtual {v8, v0}, Li0/h0;->p(Z)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v13, p0

    .line 287
    .line 288
    :goto_3
    const/4 v14, 0x1

    .line 289
    goto :goto_4

    .line 290
    :cond_3
    move-object/from16 v27, v1

    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    const v1, -0x6d047a25

    .line 294
    .line 295
    .line 296
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 297
    .line 298
    .line 299
    sget-object v1, Lwb/y2;->i:Lwb/y2;

    .line 300
    .line 301
    const/high16 v9, 0x30000

    .line 302
    .line 303
    const/16 v10, 0x1c

    .line 304
    .line 305
    move-object/from16 v13, p0

    .line 306
    .line 307
    iget-object v2, v13, Lwb/qj;->k:Landroid/content/Context;

    .line 308
    .line 309
    const/4 v4, 0x0

    .line 310
    const-wide/16 v5, 0x0

    .line 311
    .line 312
    const/4 v7, 0x0

    .line 313
    invoke-virtual/range {v1 .. v10}, Lwb/y2;->i(Landroid/content/Context;Ljava/lang/String;Lp/x0;JLfg/l;Li0/h0;II)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8, v0}, Li0/h0;->p(Z)V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :goto_4
    invoke-virtual {v8, v14}, Li0/h0;->p(Z)V

    .line 321
    .line 322
    .line 323
    move-object/from16 v6, v27

    .line 324
    .line 325
    const/high16 v15, 0x3f800000    # 1.0f

    .line 326
    .line 327
    invoke-static {v6, v15}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    const/16 v1, 0xc

    .line 332
    .line 333
    int-to-float v2, v1

    .line 334
    const/4 v4, 0x0

    .line 335
    const/16 v5, 0xd

    .line 336
    .line 337
    const/4 v1, 0x0

    .line 338
    const/4 v3, 0x0

    .line 339
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    move-object/from16 v20, v8

    .line 344
    .line 345
    invoke-static/range {v20 .. v20}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    const/16 v11, 0x186

    .line 350
    .line 351
    const/16 v12, 0x778

    .line 352
    .line 353
    const-string v1, "\u5173\u95ed"

    .line 354
    .line 355
    iget-object v2, v13, Lwb/qj;->i:Lfg/a;

    .line 356
    .line 357
    const/4 v4, 0x0

    .line 358
    const/4 v5, 0x0

    .line 359
    const/4 v6, 0x0

    .line 360
    const/4 v7, 0x0

    .line 361
    const/4 v9, 0x0

    .line 362
    move-object/from16 v10, v20

    .line 363
    .line 364
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 365
    .line 366
    .line 367
    move-object v8, v10

    .line 368
    invoke-virtual {v8, v14}, Li0/h0;->p(Z)V

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_4
    move-object v13, v0

    .line 373
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 374
    .line 375
    .line 376
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 377
    .line 378
    return-object v0
.end method
