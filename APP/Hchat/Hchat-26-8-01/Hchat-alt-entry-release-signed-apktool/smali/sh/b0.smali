.class public final synthetic Lsh/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:Ls0/d;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLfg/l;Lfg/a;Lfg/a;Lsh/f0;JLy0/o;Ls0/d;I)V
    .locals 0

    .line 1
    const/4 p11, 0x0

    .line 2
    iput p11, p0, Lsh/b0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lsh/b0;->h:J

    .line 8
    .line 9
    iput-object p3, p0, Lsh/b0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lsh/b0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lsh/b0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p6, p0, Lsh/b0;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-wide p7, p0, Lsh/b0;->i:J

    .line 18
    .line 19
    iput-object p9, p0, Lsh/b0;->o:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p10, p0, Lsh/b0;->j:Ls0/d;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lth/j;Li0/l2;Lth/a;JLxb/o;JLs0/d;Lv/d;)V
    .locals 1

    .line 24
    const/4 v0, 0x1

    iput v0, p0, Lsh/b0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/b0;->k:Ljava/lang/Object;

    iput-object p2, p0, Lsh/b0;->l:Ljava/lang/Object;

    iput-object p3, p0, Lsh/b0;->m:Ljava/lang/Object;

    iput-wide p4, p0, Lsh/b0;->h:J

    iput-object p6, p0, Lsh/b0;->n:Ljava/lang/Object;

    iput-wide p7, p0, Lsh/b0;->i:J

    iput-object p9, p0, Lsh/b0;->j:Ls0/d;

    iput-object p10, p0, Lsh/b0;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsh/b0;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    iget-object v3, v0, Lsh/b0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lsh/b0;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lsh/b0;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lsh/b0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lsh/b0;->k:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Lth/j;

    .line 21
    .line 22
    check-cast v6, Li0/l2;

    .line 23
    .line 24
    move-object v9, v5

    .line 25
    check-cast v9, Lth/a;

    .line 26
    .line 27
    check-cast v4, Lxb/o;

    .line 28
    .line 29
    check-cast v3, Lv/d;

    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Li0/h0;

    .line 34
    .line 35
    move-object/from16 v5, p2

    .line 36
    .line 37
    check-cast v5, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    and-int/lit8 v8, v5, 0x3

    .line 44
    .line 45
    const/4 v10, 0x1

    .line 46
    const/4 v11, 0x2

    .line 47
    if-eq v8, v11, :cond_0

    .line 48
    .line 49
    move v8, v10

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v8, 0x0

    .line 52
    :goto_0
    and-int/2addr v5, v10

    .line 53
    invoke-virtual {v1, v5, v8}, Li0/h0;->S(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_a

    .line 58
    .line 59
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    sget-object v8, Li0/l;->a:Li0/e;

    .line 64
    .line 65
    if-ne v5, v8, :cond_1

    .line 66
    .line 67
    new-instance v5, Lw0/l;

    .line 68
    .line 69
    const/4 v12, 0x3

    .line 70
    invoke-direct {v5, v12}, Lw0/l;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    check-cast v5, Lfg/l;

    .line 77
    .line 78
    sget-object v12, Lf2/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 79
    .line 80
    new-instance v12, Lf2/c;

    .line 81
    .line 82
    invoke-direct {v12, v5}, Lf2/c;-><init>(Lfg/l;)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-static {v12, v5}, Lc1/h;->a(Ly0/o;F)Ly0/o;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    invoke-static {v12, v7}, Lth/c;->d(Ly0/o;Lth/j;)Ly0/o;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    const/16 v14, 0x8

    .line 103
    .line 104
    if-nez v12, :cond_2

    .line 105
    .line 106
    if-ne v13, v8, :cond_3

    .line 107
    .line 108
    :cond_2
    new-instance v13, Lsh/y0;

    .line 109
    .line 110
    invoke-direct {v13, v6, v14}, Lsh/y0;-><init>(Li0/l2;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    check-cast v13, Lfg/l;

    .line 117
    .line 118
    invoke-static {v7, v13}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-ne v7, v8, :cond_4

    .line 127
    .line 128
    new-instance v7, Lv0/a;

    .line 129
    .line 130
    invoke-direct {v7, v3, v14}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    check-cast v7, Lfg/a;

    .line 137
    .line 138
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v12, 0x4

    .line 143
    if-ne v3, v8, :cond_5

    .line 144
    .line 145
    new-instance v3, Lw0/l;

    .line 146
    .line 147
    invoke-direct {v3, v12}, Lw0/l;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    check-cast v3, Lfg/l;

    .line 154
    .line 155
    iget-wide v13, v0, Lsh/b0;->h:J

    .line 156
    .line 157
    invoke-virtual {v1, v13, v14}, Li0/h0;->e(J)Z

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    if-nez v15, :cond_6

    .line 166
    .line 167
    if-ne v10, v8, :cond_7

    .line 168
    .line 169
    :cond_6
    new-instance v10, Lca/c;

    .line 170
    .line 171
    const/16 v8, 0x11

    .line 172
    .line 173
    invoke-direct {v10, v13, v14, v8}, Lca/c;-><init>(JI)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    move-object v14, v10

    .line 180
    check-cast v14, Lfg/l;

    .line 181
    .line 182
    const/16 v15, 0x778

    .line 183
    .line 184
    move v8, v12

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    move-object v10, v7

    .line 188
    move v7, v11

    .line 189
    move-object v11, v3

    .line 190
    move v3, v8

    .line 191
    move-object v8, v6

    .line 192
    const/4 v6, 0x1

    .line 193
    invoke-static/range {v8 .. v15}, Lth/c;->b(Ly0/o;Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;I)Ly0/o;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    if-eqz v4, :cond_8

    .line 198
    .line 199
    iget-object v4, v4, Lxb/o;->i:Ly0/o;

    .line 200
    .line 201
    if-eqz v4, :cond_8

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_8
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 205
    .line 206
    :goto_1
    invoke-interface {v8, v4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    const/16 v8, 0x38

    .line 211
    .line 212
    int-to-float v8, v8

    .line 213
    invoke-static {v4, v8}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    int-to-float v3, v3

    .line 218
    invoke-static {v4, v3, v5, v7}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    new-instance v13, Lf1/n;

    .line 223
    .line 224
    iget-wide v3, v0, Lsh/b0;->i:J

    .line 225
    .line 226
    const/4 v5, 0x5

    .line 227
    invoke-direct {v13, v3, v4, v5}, Lf1/n;-><init>(JI)V

    .line 228
    .line 229
    .line 230
    const v14, 0x3ffff

    .line 231
    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/4 v10, 0x0

    .line 235
    const/4 v11, 0x0

    .line 236
    const/4 v12, 0x0

    .line 237
    invoke-static/range {v8 .. v14}, Lf1/c0;->n(Ly0/o;FFLf1/r0;ZLf1/n;I)Ly0/o;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    sget-object v4, Ly0/b;->q:Ly0/f;

    .line 242
    .line 243
    sget-object v5, Lp/j;->a:Lp/c;

    .line 244
    .line 245
    const/16 v7, 0x30

    .line 246
    .line 247
    invoke-static {v5, v4, v1, v7}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    iget-wide v7, v1, Li0/h0;->T:J

    .line 252
    .line 253
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v1, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 271
    .line 272
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 273
    .line 274
    .line 275
    iget-boolean v9, v1, Li0/h0;->S:Z

    .line 276
    .line 277
    if-eqz v9, :cond_9

    .line 278
    .line 279
    invoke-virtual {v1, v8}, Li0/h0;->k(Lfg/a;)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_9
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 284
    .line 285
    .line 286
    :goto_2
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 287
    .line 288
    invoke-static {v8, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 292
    .line 293
    invoke-static {v4, v1, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 301
    .line 302
    invoke-static {v5, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 306
    .line 307
    invoke-static {v4, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 308
    .line 309
    .line 310
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 311
    .line 312
    invoke-static {v4, v1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    const/4 v3, 0x6

    .line 316
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    iget-object v4, v0, Lsh/b0;->j:Ls0/d;

    .line 321
    .line 322
    sget-object v5, Lp/f1;->a:Lp/f1;

    .line 323
    .line 324
    invoke-virtual {v4, v5, v1, v3}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v6}, Li0/h0;->p(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_a
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 332
    .line 333
    .line 334
    :goto_3
    return-object v2

    .line 335
    :pswitch_0
    move-object v9, v7

    .line 336
    check-cast v9, Lfg/l;

    .line 337
    .line 338
    move-object v10, v6

    .line 339
    check-cast v10, Lfg/a;

    .line 340
    .line 341
    move-object v11, v5

    .line 342
    check-cast v11, Lfg/a;

    .line 343
    .line 344
    move-object v12, v4

    .line 345
    check-cast v12, Lsh/f0;

    .line 346
    .line 347
    move-object v15, v3

    .line 348
    check-cast v15, Ly0/o;

    .line 349
    .line 350
    move-object/from16 v17, p1

    .line 351
    .line 352
    check-cast v17, Li0/h0;

    .line 353
    .line 354
    move-object/from16 v1, p2

    .line 355
    .line 356
    check-cast v1, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    const v1, 0xc00031

    .line 362
    .line 363
    .line 364
    invoke-static {v1}, Li0/r;->C(I)I

    .line 365
    .line 366
    .line 367
    move-result v18

    .line 368
    iget-wide v7, v0, Lsh/b0;->h:J

    .line 369
    .line 370
    iget-wide v13, v0, Lsh/b0;->i:J

    .line 371
    .line 372
    iget-object v1, v0, Lsh/b0;->j:Ls0/d;

    .line 373
    .line 374
    move-object/from16 v16, v1

    .line 375
    .line 376
    invoke-static/range {v7 .. v18}, Lsh/s;->h(JLfg/l;Lfg/a;Lfg/a;Lsh/f0;JLy0/o;Ls0/d;Li0/h0;I)V

    .line 377
    .line 378
    .line 379
    return-object v2

    .line 380
    nop

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
