.class public final Lh/q0;
.super Lh/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public A:Lh/s0;

.field public B:Lfg/a;

.field public C:Lh/h0;

.field public D:J

.field public E:Ly0/c;

.field public final F:Lh/p0;

.field public final G:Lh/p0;

.field public v:Li/k1;

.field public w:Li/d1;

.field public x:Li/d1;

.field public y:Li/d1;

.field public z:Lh/r0;


# direct methods
.method public constructor <init>(Li/k1;Li/d1;Li/d1;Li/d1;Lh/r0;Lh/s0;Lfg/a;Lh/h0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lh/x0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lh/q0;->v:Li/k1;

    .line 6
    .line 7
    iput-object p2, p0, Lh/q0;->w:Li/d1;

    .line 8
    .line 9
    iput-object p3, p0, Lh/q0;->x:Li/d1;

    .line 10
    .line 11
    iput-object p4, p0, Lh/q0;->y:Li/d1;

    .line 12
    .line 13
    iput-object p5, p0, Lh/q0;->z:Lh/r0;

    .line 14
    .line 15
    iput-object p6, p0, Lh/q0;->A:Lh/s0;

    .line 16
    .line 17
    iput-object p7, p0, Lh/q0;->B:Lfg/a;

    .line 18
    .line 19
    iput-object p8, p0, Lh/q0;->C:Lh/h0;

    .line 20
    .line 21
    sget-wide p1, Lh/d0;->a:J

    .line 22
    .line 23
    iput-wide p1, p0, Lh/q0;->D:J

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    const/16 p2, 0xf

    .line 27
    .line 28
    invoke-static {p1, p1, p1, p1, p2}, Lu2/b;->b(IIIII)J

    .line 29
    .line 30
    .line 31
    new-instance p1, Lh/p0;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-direct {p1, p0, p2}, Lh/p0;-><init>(Lh/q0;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lh/q0;->F:Lh/p0;

    .line 38
    .line 39
    new-instance p1, Lh/p0;

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-direct {p1, p0, p2}, Lh/p0;-><init>(Lh/q0;I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lh/q0;->G:Lh/p0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final c1()V
    .locals 2

    .line 1
    sget-wide v0, Lh/d0;->a:J

    .line 2
    .line 3
    iput-wide v0, p0, Lh/q0;->D:J

    .line 4
    .line 5
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lh/q0;->v:Li/k1;

    .line 6
    .line 7
    invoke-virtual {v2}, Li/k1;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, Lh/q0;->v:Li/k1;

    .line 12
    .line 13
    iget-object v3, v3, Li/k1;->d:Li0/j1;

    .line 14
    .line 15
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

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
    iput-object v4, v0, Lh/q0;->E:Ly0/c;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lh/q0;->E:Ly0/c;

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Lh/q0;->m1()Ly0/c;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    sget-object v2, Ly0/b;->g:Ly0/g;

    .line 36
    .line 37
    :cond_1
    iput-object v2, v0, Lh/q0;->E:Ly0/c;

    .line 38
    .line 39
    :cond_2
    :goto_0
    invoke-interface {v1}, Lv1/o;->u0()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    sget-object v3, Ltf/u;->g:Ltf/u;

    .line 44
    .line 45
    const-wide v5, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const/16 v7, 0x20

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-interface/range {p2 .. p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v4, v2, Lv1/b1;->g:I

    .line 59
    .line 60
    iget v8, v2, Lv1/b1;->h:I

    .line 61
    .line 62
    int-to-long v9, v4

    .line 63
    shl-long/2addr v9, v7

    .line 64
    int-to-long v11, v8

    .line 65
    and-long/2addr v11, v5

    .line 66
    or-long v8, v9, v11

    .line 67
    .line 68
    iput-wide v8, v0, Lh/q0;->D:J

    .line 69
    .line 70
    shr-long v10, v8, v7

    .line 71
    .line 72
    long-to-int v4, v10

    .line 73
    and-long/2addr v5, v8

    .line 74
    long-to-int v5, v5

    .line 75
    new-instance v6, Lc1/n;

    .line 76
    .line 77
    const/4 v7, 0x2

    .line 78
    invoke-direct {v6, v2, v7}, Lc1/n;-><init>(Lv1/b1;I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v4, v5, v3, v6}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    return-object v1

    .line 86
    :cond_3
    iget-object v2, v0, Lh/q0;->B:Lfg/a;

    .line 87
    .line 88
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

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
    if-eqz v2, :cond_e

    .line 99
    .line 100
    iget-object v2, v0, Lh/q0;->C:Lh/h0;

    .line 101
    .line 102
    iget-object v8, v2, Lh/h0;->a:Li/d1;

    .line 103
    .line 104
    iget-object v9, v2, Lh/h0;->b:Li/d1;

    .line 105
    .line 106
    iget-object v10, v2, Lh/h0;->c:Li/k1;

    .line 107
    .line 108
    iget-object v11, v2, Lh/h0;->d:Lh/r0;

    .line 109
    .line 110
    iget-object v12, v2, Lh/h0;->e:Lh/s0;

    .line 111
    .line 112
    iget-object v2, v2, Lh/h0;->f:Li/d1;

    .line 113
    .line 114
    if-eqz v8, :cond_4

    .line 115
    .line 116
    new-instance v13, Lh/i0;

    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    invoke-direct {v13, v11, v12, v14}, Lh/i0;-><init>(Lh/r0;Lh/s0;I)V

    .line 120
    .line 121
    .line 122
    new-instance v14, Lh/i0;

    .line 123
    .line 124
    const/4 v15, 0x1

    .line 125
    invoke-direct {v14, v11, v12, v15}, Lh/i0;-><init>(Lh/r0;Lh/s0;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v13, v14}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object v8, v4

    .line 134
    :goto_1
    if-eqz v9, :cond_5

    .line 135
    .line 136
    new-instance v13, Lh/i0;

    .line 137
    .line 138
    const/4 v14, 0x2

    .line 139
    invoke-direct {v13, v11, v12, v14}, Lh/i0;-><init>(Lh/r0;Lh/s0;I)V

    .line 140
    .line 141
    .line 142
    new-instance v14, Lh/i0;

    .line 143
    .line 144
    const/4 v15, 0x3

    .line 145
    invoke-direct {v14, v11, v12, v15}, Lh/i0;-><init>(Lh/r0;Lh/s0;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9, v13, v14}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    move-object v9, v4

    .line 154
    :goto_2
    invoke-virtual {v10}, Li/k1;->c()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    sget-object v13, Lh/f0;->g:Lh/f0;

    .line 159
    .line 160
    if-ne v10, v13, :cond_6

    .line 161
    .line 162
    iget-object v10, v12, Lh/s0;->a:Lh/h1;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    iget-object v10, v12, Lh/s0;->a:Lh/h1;

    .line 166
    .line 167
    :goto_3
    if-eqz v2, :cond_7

    .line 168
    .line 169
    sget-object v10, Lh/c;->m:Lh/c;

    .line 170
    .line 171
    new-instance v13, Lb1/g;

    .line 172
    .line 173
    const/4 v14, 0x4

    .line 174
    invoke-direct {v13, v4, v11, v12, v14}, Lb1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v10, v13}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    goto :goto_4

    .line 182
    :cond_7
    move-object v2, v4

    .line 183
    :goto_4
    new-instance v10, Lb1/g;

    .line 184
    .line 185
    const/4 v11, 0x3

    .line 186
    invoke-direct {v10, v8, v9, v2, v11}, Lb1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 187
    .line 188
    .line 189
    invoke-interface/range {p2 .. p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    iget v2, v11, Lv1/b1;->g:I

    .line 194
    .line 195
    iget v8, v11, Lv1/b1;->h:I

    .line 196
    .line 197
    int-to-long v12, v2

    .line 198
    shl-long/2addr v12, v7

    .line 199
    int-to-long v8, v8

    .line 200
    and-long/2addr v8, v5

    .line 201
    or-long/2addr v8, v12

    .line 202
    iget-wide v12, v0, Lh/q0;->D:J

    .line 203
    .line 204
    sget-wide v14, Lh/d0;->a:J

    .line 205
    .line 206
    invoke-static {v12, v13, v14, v15}, Lu2/l;->a(JJ)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_8

    .line 211
    .line 212
    iget-wide v12, v0, Lh/q0;->D:J

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_8
    move-wide v12, v8

    .line 216
    :goto_5
    iget-object v2, v0, Lh/q0;->w:Li/d1;

    .line 217
    .line 218
    if-eqz v2, :cond_9

    .line 219
    .line 220
    new-instance v4, Lh/o0;

    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    invoke-direct {v4, v0, v12, v13, v14}, Lh/o0;-><init>(Lh/q0;JI)V

    .line 224
    .line 225
    .line 226
    iget-object v14, v0, Lh/q0;->F:Lh/p0;

    .line 227
    .line 228
    invoke-virtual {v2, v14, v4}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    :cond_9
    if-eqz v4, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4}, Li/c1;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Lu2/l;

    .line 239
    .line 240
    iget-wide v8, v2, Lu2/l;->a:J

    .line 241
    .line 242
    :cond_a
    move-wide/from16 v14, p3

    .line 243
    .line 244
    invoke-static {v14, v15, v8, v9}, Lu2/b;->d(JJ)J

    .line 245
    .line 246
    .line 247
    move-result-wide v17

    .line 248
    iget-object v2, v0, Lh/q0;->x:Li/d1;

    .line 249
    .line 250
    const-wide/16 v8, 0x0

    .line 251
    .line 252
    if-eqz v2, :cond_b

    .line 253
    .line 254
    sget-object v4, Lh/c;->n:Lh/c;

    .line 255
    .line 256
    new-instance v14, Lh/o0;

    .line 257
    .line 258
    const/4 v15, 0x1

    .line 259
    invoke-direct {v14, v0, v12, v13, v15}, Lh/o0;-><init>(Lh/q0;JI)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4, v14}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v2}, Li/c1;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    check-cast v2, Lu2/j;

    .line 271
    .line 272
    iget-wide v14, v2, Lu2/j;->a:J

    .line 273
    .line 274
    move-wide/from16 v20, v14

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_b
    move-wide/from16 v20, v8

    .line 278
    .line 279
    :goto_6
    iget-object v2, v0, Lh/q0;->y:Li/d1;

    .line 280
    .line 281
    if-eqz v2, :cond_c

    .line 282
    .line 283
    new-instance v4, Lh/o0;

    .line 284
    .line 285
    const/4 v14, 0x2

    .line 286
    invoke-direct {v4, v0, v12, v13, v14}, Lh/o0;-><init>(Lh/q0;JI)V

    .line 287
    .line 288
    .line 289
    iget-object v14, v0, Lh/q0;->G:Lh/p0;

    .line 290
    .line 291
    invoke-virtual {v2, v14, v4}, Li/d1;->a(Lfg/l;Lfg/l;)Li/c1;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v2}, Li/c1;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    check-cast v2, Lu2/j;

    .line 300
    .line 301
    iget-wide v14, v2, Lu2/j;->a:J

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_c
    move-wide v14, v8

    .line 305
    :goto_7
    iget-object v2, v0, Lh/q0;->E:Ly0/c;

    .line 306
    .line 307
    if-eqz v2, :cond_d

    .line 308
    .line 309
    sget-object v19, Lu2/m;->g:Lu2/m;

    .line 310
    .line 311
    move-wide/from16 v22, v14

    .line 312
    .line 313
    move-wide v15, v12

    .line 314
    move-wide/from16 v12, v22

    .line 315
    .line 316
    move-object v14, v2

    .line 317
    invoke-interface/range {v14 .. v19}, Ly0/c;->a(JJLu2/m;)J

    .line 318
    .line 319
    .line 320
    move-result-wide v8

    .line 321
    goto :goto_8

    .line 322
    :cond_d
    move-wide v12, v14

    .line 323
    :goto_8
    invoke-static {v8, v9, v12, v13}, Lu2/j;->d(JJ)J

    .line 324
    .line 325
    .line 326
    move-result-wide v12

    .line 327
    shr-long v7, v17, v7

    .line 328
    .line 329
    long-to-int v2, v7

    .line 330
    and-long v4, v17, v5

    .line 331
    .line 332
    long-to-int v4, v4

    .line 333
    move-object/from16 v16, v10

    .line 334
    .line 335
    new-instance v10, Lh/n0;

    .line 336
    .line 337
    move-wide/from16 v14, v20

    .line 338
    .line 339
    invoke-direct/range {v10 .. v16}, Lh/n0;-><init>(Lv1/b1;JJLb1/g;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v1, v2, v4, v3, v10}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    return-object v1

    .line 347
    :cond_e
    move-wide/from16 v14, p3

    .line 348
    .line 349
    invoke-interface/range {p2 .. p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget v4, v2, Lv1/b1;->g:I

    .line 354
    .line 355
    iget v5, v2, Lv1/b1;->h:I

    .line 356
    .line 357
    new-instance v6, Lc1/n;

    .line 358
    .line 359
    const/4 v7, 0x3

    .line 360
    invoke-direct {v6, v2, v7}, Lc1/n;-><init>(Lv1/b1;I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v1, v4, v5, v3, v6}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    return-object v1
.end method

.method public final m1()Ly0/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/q0;->v:Li/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/k1;->f()Li/e1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lh/f0;->g:Lh/f0;

    .line 8
    .line 9
    sget-object v2, Lh/f0;->h:Lh/f0;

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Li/e1;->a(Lh/f0;Lh/f0;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lh/q0;->A:Lh/s0;

    .line 18
    .line 19
    iget-object v0, v0, Lh/s0;->a:Lh/h1;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lh/q0;->A:Lh/s0;

    .line 23
    .line 24
    iget-object v0, v0, Lh/s0;->a:Lh/h1;

    .line 25
    .line 26
    :goto_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method
