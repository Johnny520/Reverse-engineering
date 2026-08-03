.class public final synthetic Lxh/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic A:Ls0/d;

.field public final synthetic g:Lqg/t;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Li/c;

.field public final synthetic k:Z

.field public final synthetic l:Li/c;

.field public final synthetic m:Ly0/o;

.field public final synthetic n:Li/c;

.field public final synthetic o:Z

.field public final synthetic p:F

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:J

.field public final synthetic s:J

.field public final synthetic t:J

.field public final synthetic u:J

.field public final synthetic v:J

.field public final synthetic w:Z

.field public final synthetic x:Li0/g1;

.field public final synthetic y:Lu2/f;

.field public final synthetic z:Li0/f1;


# direct methods
.method public synthetic constructor <init>(Lqg/t;Lfg/l;Lfg/a;Li/c;ZLi/c;Ly0/o;Li/c;ZFLjava/lang/String;JJJJJZLi0/g1;Lu2/f;Li0/f1;Ls0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/c;->g:Lqg/t;

    .line 5
    .line 6
    iput-object p2, p0, Lxh/c;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lxh/c;->i:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lxh/c;->j:Li/c;

    .line 11
    .line 12
    iput-boolean p5, p0, Lxh/c;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lxh/c;->l:Li/c;

    .line 15
    .line 16
    iput-object p7, p0, Lxh/c;->m:Ly0/o;

    .line 17
    .line 18
    iput-object p8, p0, Lxh/c;->n:Li/c;

    .line 19
    .line 20
    iput-boolean p9, p0, Lxh/c;->o:Z

    .line 21
    .line 22
    iput p10, p0, Lxh/c;->p:F

    .line 23
    .line 24
    iput-object p11, p0, Lxh/c;->q:Ljava/lang/String;

    .line 25
    .line 26
    iput-wide p12, p0, Lxh/c;->r:J

    .line 27
    .line 28
    iput-wide p14, p0, Lxh/c;->s:J

    .line 29
    .line 30
    move-wide/from16 p1, p16

    .line 31
    .line 32
    iput-wide p1, p0, Lxh/c;->t:J

    .line 33
    .line 34
    move-wide/from16 p1, p18

    .line 35
    .line 36
    iput-wide p1, p0, Lxh/c;->u:J

    .line 37
    .line 38
    move-wide/from16 p1, p20

    .line 39
    .line 40
    iput-wide p1, p0, Lxh/c;->v:J

    .line 41
    .line 42
    move/from16 p1, p22

    .line 43
    .line 44
    iput-boolean p1, p0, Lxh/c;->w:Z

    .line 45
    .line 46
    move-object/from16 p1, p23

    .line 47
    .line 48
    iput-object p1, p0, Lxh/c;->x:Li0/g1;

    .line 49
    .line 50
    move-object/from16 p1, p24

    .line 51
    .line 52
    iput-object p1, p0, Lxh/c;->y:Lu2/f;

    .line 53
    .line 54
    move-object/from16 p1, p25

    .line 55
    .line 56
    iput-object p1, p0, Lxh/c;->z:Li0/f1;

    .line 57
    .line 58
    move-object/from16 p1, p26

    .line 59
    .line 60
    iput-object p1, p0, Lxh/c;->A:Ls0/d;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, Li0/h0;

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
    const/4 v4, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v4

    .line 26
    invoke-virtual {v5, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_e

    .line 31
    .line 32
    invoke-static {v5}, La/a;->I0(Li0/h0;)Ls3/e;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, v0, Lxh/c;->g:Lqg/t;

    .line 37
    .line 38
    invoke-virtual {v5, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v4, v0, Lxh/c;->h:Lfg/l;

    .line 43
    .line 44
    invoke-virtual {v5, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    or-int/2addr v3, v6

    .line 49
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    sget-object v15, Li0/l;->a:Li0/e;

    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    if-ne v6, v15, :cond_2

    .line 58
    .line 59
    :cond_1
    new-instance v6, Lwb/xi;

    .line 60
    .line 61
    const/16 v3, 0x1b

    .line 62
    .line 63
    invoke-direct {v6, v2, v4, v3}, Lwb/xi;-><init>(Ljava/lang/Object;Lfg/l;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v3, v6

    .line 70
    check-cast v3, Lfg/a;

    .line 71
    .line 72
    iget-object v9, v0, Lxh/c;->i:Lfg/a;

    .line 73
    .line 74
    invoke-virtual {v5, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v2, :cond_3

    .line 83
    .line 84
    if-ne v4, v15, :cond_4

    .line 85
    .line 86
    :cond_3
    new-instance v4, Lwb/kc;

    .line 87
    .line 88
    const/16 v2, 0x1d

    .line 89
    .line 90
    invoke-direct {v4, v9, v2}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    check-cast v4, Lfg/a;

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-static/range {v1 .. v7}, Lx6/d;->d(Ls3/e;ZLfg/a;Lfg/a;Li0/h0;II)V

    .line 102
    .line 103
    .line 104
    iget-object v2, v1, Ls3/e;->a:Li0/j1;

    .line 105
    .line 106
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lr3/e;

    .line 111
    .line 112
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    iget-object v13, v0, Lxh/c;->j:Li/c;

    .line 117
    .line 118
    invoke-virtual {v5, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    or-int/2addr v3, v4

    .line 123
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget-object v12, v0, Lxh/c;->z:Li0/f1;

    .line 128
    .line 129
    if-nez v3, :cond_5

    .line 130
    .line 131
    if-ne v4, v15, :cond_6

    .line 132
    .line 133
    :cond_5
    move-object v3, v9

    .line 134
    goto :goto_1

    .line 135
    :cond_6
    move-object v3, v9

    .line 136
    move-object v11, v13

    .line 137
    goto :goto_2

    .line 138
    :goto_1
    new-instance v9, Lw/u0;

    .line 139
    .line 140
    const/16 v14, 0x9

    .line 141
    .line 142
    move-object v11, v13

    .line 143
    const/4 v13, 0x0

    .line 144
    move-object v10, v1

    .line 145
    invoke-direct/range {v9 .. v14}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v4, v9

    .line 152
    :goto_2
    check-cast v4, Lfg/p;

    .line 153
    .line 154
    invoke-static {v4, v5, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-boolean v1, v0, Lxh/c;->k:Z

    .line 158
    .line 159
    if-eqz v1, :cond_9

    .line 160
    .line 161
    const v1, -0x63a819a6

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 165
    .line 166
    .line 167
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 168
    .line 169
    invoke-virtual {v5, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Lbi/b;

    .line 174
    .line 175
    invoke-virtual {v1}, Lbi/b;->o()J

    .line 176
    .line 177
    .line 178
    move-result-wide v1

    .line 179
    sget-object v4, Lp/h1;->c:Lp/a0;

    .line 180
    .line 181
    invoke-virtual {v5, v1, v2}, Li0/h0;->e(J)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    iget-object v7, v0, Lxh/c;->l:Li/c;

    .line 186
    .line 187
    invoke-virtual {v5, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    or-int/2addr v6, v9

    .line 192
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    if-nez v6, :cond_7

    .line 197
    .line 198
    if-ne v9, v15, :cond_8

    .line 199
    .line 200
    :cond_7
    new-instance v9, Lsh/a0;

    .line 201
    .line 202
    invoke-direct {v9, v1, v2, v12, v7}, Lsh/a0;-><init>(JLi0/f1;Li/c;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    check-cast v9, Lfg/l;

    .line 209
    .line 210
    invoke-static {v4, v9}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v1, v5, v8}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_9
    const v1, -0x63a2f407

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, v1}, Li0/h0;->a0(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 228
    .line 229
    .line 230
    :goto_3
    iget-object v1, v0, Lxh/c;->n:Li/c;

    .line 231
    .line 232
    invoke-virtual {v5, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    iget-boolean v4, v0, Lxh/c;->o:Z

    .line 237
    .line 238
    invoke-virtual {v5, v4}, Li0/h0;->g(Z)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    or-int/2addr v2, v6

    .line 243
    iget v6, v0, Lxh/c;->p:F

    .line 244
    .line 245
    invoke-virtual {v5, v6}, Li0/h0;->c(F)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    or-int/2addr v2, v7

    .line 250
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    if-nez v2, :cond_a

    .line 255
    .line 256
    if-ne v7, v15, :cond_b

    .line 257
    .line 258
    :cond_a
    new-instance v7, Lxh/e;

    .line 259
    .line 260
    invoke-direct {v7, v1, v4, v6}, Lxh/e;-><init>(Li/c;ZF)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_b
    check-cast v7, Lfg/l;

    .line 267
    .line 268
    iget-object v1, v0, Lxh/c;->m:Ly0/o;

    .line 269
    .line 270
    invoke-static {v1, v7}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 271
    .line 272
    .line 273
    move-result-object v16

    .line 274
    invoke-virtual {v5, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    if-nez v1, :cond_c

    .line 283
    .line 284
    if-ne v2, v15, :cond_d

    .line 285
    .line 286
    :cond_c
    new-instance v2, Lxh/f;

    .line 287
    .line 288
    const/4 v1, 0x0

    .line 289
    invoke-direct {v2, v3, v1}, Lxh/f;-><init>(Lfg/a;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_d
    move-object v15, v2

    .line 296
    check-cast v15, Lfg/a;

    .line 297
    .line 298
    new-instance v1, Lwb/zi;

    .line 299
    .line 300
    const/16 v2, 0xb

    .line 301
    .line 302
    iget-object v4, v0, Lxh/c;->A:Ls0/d;

    .line 303
    .line 304
    invoke-direct {v1, v3, v2, v4}, Lwb/zi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    const v2, 0x330bb6fd

    .line 308
    .line 309
    .line 310
    invoke-static {v2, v1, v5}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 311
    .line 312
    .line 313
    move-result-object v18

    .line 314
    const/high16 v20, 0x38000000

    .line 315
    .line 316
    iget-object v1, v0, Lxh/c;->q:Ljava/lang/String;

    .line 317
    .line 318
    iget-wide v2, v0, Lxh/c;->r:J

    .line 319
    .line 320
    move-object/from16 v19, v5

    .line 321
    .line 322
    iget-wide v4, v0, Lxh/c;->s:J

    .line 323
    .line 324
    iget-wide v6, v0, Lxh/c;->t:J

    .line 325
    .line 326
    iget-wide v8, v0, Lxh/c;->u:J

    .line 327
    .line 328
    move-object v13, v11

    .line 329
    iget-wide v10, v0, Lxh/c;->v:J

    .line 330
    .line 331
    iget-boolean v12, v0, Lxh/c;->w:Z

    .line 332
    .line 333
    iget-object v14, v0, Lxh/c;->x:Li0/g1;

    .line 334
    .line 335
    move-object/from16 v17, v1

    .line 336
    .line 337
    iget-object v1, v0, Lxh/c;->y:Lu2/f;

    .line 338
    .line 339
    move-object/from16 v21, v17

    .line 340
    .line 341
    move-object/from16 v17, v1

    .line 342
    .line 343
    move-object/from16 v1, v21

    .line 344
    .line 345
    invoke-static/range {v1 .. v20}, Lg4/a;->b(Ljava/lang/String;JJJJJZLi/c;Li0/a1;Lfg/a;Ly0/o;Lu2/f;Ls0/d;Li0/h0;I)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_e
    move-object/from16 v19, v5

    .line 350
    .line 351
    invoke-virtual/range {v19 .. v19}, Li0/h0;->V()V

    .line 352
    .line 353
    .line 354
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 355
    .line 356
    return-object v1
.end method
