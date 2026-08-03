.class public final Lx1/u0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx1/v0;


# direct methods
.method public synthetic constructor <init>(Lx1/v0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx1/u0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lx1/u0;->h:Lx1/v0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lx1/u0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx1/u0;->h:Lx1/v0;

    .line 7
    .line 8
    iget-object v1, v0, Lx1/v0;->l:Lx1/j0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v2, v2, Lx1/i1;->w:Lx1/i1;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Lx1/n0;->r:Lv1/k0;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 23
    .line 24
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ly1/t;

    .line 29
    .line 30
    invoke-virtual {v2}, Ly1/t;->getPlacementScope()Lv1/a1;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    iget-object v3, v0, Lx1/v0;->M:Lfg/l;

    .line 35
    .line 36
    iget-object v4, v0, Lx1/v0;->N:Li1/b;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-wide v5, v0, Lx1/v0;->O:J

    .line 45
    .line 46
    iget v0, v0, Lx1/v0;->P:F

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v1}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Lv1/b1;->k:J

    .line 55
    .line 56
    invoke-static {v5, v6, v2, v3}, Lu2/j;->d(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3, v0, v4}, Lx1/i1;->B0(JFLi1/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-nez v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-wide v3, v0, Lx1/v0;->O:J

    .line 71
    .line 72
    iget v0, v0, Lx1/v0;->P:F

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v1}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 78
    .line 79
    .line 80
    iget-wide v5, v1, Lv1/b1;->k:J

    .line 81
    .line 82
    invoke-static {v3, v4, v5, v6}, Lu2/j;->d(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {v1, v2, v3, v0, v4}, Lv1/b1;->A0(JFLfg/l;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-wide v4, v0, Lx1/v0;->O:J

    .line 96
    .line 97
    iget v0, v0, Lx1/v0;->P:F

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v1}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 103
    .line 104
    .line 105
    iget-wide v6, v1, Lv1/b1;->k:J

    .line 106
    .line 107
    invoke-static {v4, v5, v6, v7}, Lu2/j;->d(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    invoke-virtual {v1, v4, v5, v0, v3}, Lv1/b1;->A0(JFLfg/l;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_0
    iget-object v0, p0, Lx1/u0;->h:Lx1/v0;

    .line 118
    .line 119
    iget-object v1, v0, Lx1/v0;->l:Lx1/j0;

    .line 120
    .line 121
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-wide v2, v0, Lx1/v0;->H:J

    .line 126
    .line 127
    invoke-interface {v1, v2, v3}, Lv1/m0;->Q(J)Lv1/b1;

    .line 128
    .line 129
    .line 130
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_1
    iget-object v0, p0, Lx1/u0;->h:Lx1/v0;

    .line 134
    .line 135
    iget-object v1, v0, Lx1/v0;->l:Lx1/j0;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    iput v2, v1, Lx1/j0;->i:I

    .line 139
    .line 140
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 141
    .line 142
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 147
    .line 148
    iget v3, v3, Lj0/b;->i:I

    .line 149
    .line 150
    move v5, v2

    .line 151
    :goto_1
    const v6, 0x7fffffff

    .line 152
    .line 153
    .line 154
    if-ge v5, v3, :cond_5

    .line 155
    .line 156
    aget-object v7, v4, v5

    .line 157
    .line 158
    check-cast v7, Lx1/f0;

    .line 159
    .line 160
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 161
    .line 162
    iget-object v7, v7, Lx1/j0;->p:Lx1/v0;

    .line 163
    .line 164
    iget v8, v7, Lx1/v0;->o:I

    .line 165
    .line 166
    iput v8, v7, Lx1/v0;->n:I

    .line 167
    .line 168
    iput v6, v7, Lx1/v0;->o:I

    .line 169
    .line 170
    iput-boolean v2, v7, Lx1/v0;->z:Z

    .line 171
    .line 172
    iget-object v6, v7, Lx1/v0;->r:Lx1/d0;

    .line 173
    .line 174
    sget-object v8, Lx1/d0;->h:Lx1/d0;

    .line 175
    .line 176
    if-ne v6, v8, :cond_4

    .line 177
    .line 178
    sget-object v6, Lx1/d0;->i:Lx1/d0;

    .line 179
    .line 180
    iput-object v6, v7, Lx1/v0;->r:Lx1/d0;

    .line 181
    .line 182
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 186
    .line 187
    iget-object v1, v1, Lx1/j0;->a:Lx1/f0;

    .line 188
    .line 189
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 194
    .line 195
    iget v3, v3, Lj0/b;->i:I

    .line 196
    .line 197
    move v5, v2

    .line 198
    :goto_2
    if-ge v5, v3, :cond_6

    .line 199
    .line 200
    aget-object v7, v4, v5

    .line 201
    .line 202
    check-cast v7, Lx1/f0;

    .line 203
    .line 204
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 205
    .line 206
    iget-object v7, v7, Lx1/j0;->p:Lx1/v0;

    .line 207
    .line 208
    iget-object v7, v7, Lx1/v0;->D:Lx1/g0;

    .line 209
    .line 210
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    add-int/lit8 v5, v5, 0x1

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_6
    invoke-virtual {v0}, Lx1/v0;->A()Lx1/r;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    iget-boolean v3, v3, Lx1/n0;->q:Z

    .line 221
    .line 222
    if-eqz v3, :cond_7

    .line 223
    .line 224
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Lf/d0;

    .line 229
    .line 230
    iget-object v4, v3, Lf/d0;->h:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v4, Lj0/b;

    .line 233
    .line 234
    iget v4, v4, Lj0/b;->i:I

    .line 235
    .line 236
    move v5, v2

    .line 237
    :goto_3
    if-ge v5, v4, :cond_7

    .line 238
    .line 239
    invoke-virtual {v3, v5}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    check-cast v7, Lx1/f0;

    .line 244
    .line 245
    iget-object v7, v7, Lx1/f0;->L:Lx1/b1;

    .line 246
    .line 247
    iget-object v7, v7, Lx1/b1;->d:Lx1/i1;

    .line 248
    .line 249
    const/4 v8, 0x1

    .line 250
    iput-boolean v8, v7, Lx1/n0;->q:Z

    .line 251
    .line 252
    add-int/lit8 v5, v5, 0x1

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_7
    invoke-virtual {v0}, Lx1/v0;->A()Lx1/r;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3}, Lx1/i1;->Z0()Lv1/o0;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-interface {v3}, Lv1/o0;->f()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lx1/v0;->A()Lx1/r;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iget-boolean v0, v0, Lx1/n0;->q:Z

    .line 271
    .line 272
    if-eqz v0, :cond_8

    .line 273
    .line 274
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Lf/d0;

    .line 279
    .line 280
    iget-object v3, v0, Lf/d0;->h:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, Lj0/b;

    .line 283
    .line 284
    iget v3, v3, Lj0/b;->i:I

    .line 285
    .line 286
    move v4, v2

    .line 287
    :goto_4
    if-ge v4, v3, :cond_8

    .line 288
    .line 289
    invoke-virtual {v0, v4}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    check-cast v5, Lx1/f0;

    .line 294
    .line 295
    iget-object v5, v5, Lx1/f0;->L:Lx1/b1;

    .line 296
    .line 297
    iget-object v5, v5, Lx1/b1;->d:Lx1/i1;

    .line 298
    .line 299
    iput-boolean v2, v5, Lx1/n0;->q:Z

    .line 300
    .line 301
    add-int/lit8 v4, v4, 0x1

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_8
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v3, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 309
    .line 310
    iget v0, v0, Lj0/b;->i:I

    .line 311
    .line 312
    move v4, v2

    .line 313
    :goto_5
    if-ge v4, v0, :cond_c

    .line 314
    .line 315
    aget-object v5, v3, v4

    .line 316
    .line 317
    check-cast v5, Lx1/f0;

    .line 318
    .line 319
    iget-object v7, v5, Lx1/f0;->M:Lx1/j0;

    .line 320
    .line 321
    iget-object v8, v7, Lx1/j0;->p:Lx1/v0;

    .line 322
    .line 323
    iget v8, v8, Lx1/v0;->n:I

    .line 324
    .line 325
    invoke-virtual {v5}, Lx1/f0;->v()I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    if-eq v8, v9, :cond_b

    .line 330
    .line 331
    invoke-virtual {v1}, Lx1/f0;->O()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Lx1/f0;->B()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5}, Lx1/f0;->v()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-ne v8, v6, :cond_b

    .line 342
    .line 343
    iget-boolean v8, v7, Lx1/j0;->c:Z

    .line 344
    .line 345
    if-nez v8, :cond_9

    .line 346
    .line 347
    invoke-static {v5}, Lx1/k;->q(Lx1/f0;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_a

    .line 352
    .line 353
    :cond_9
    iget-object v5, v7, Lx1/j0;->q:Lx1/r0;

    .line 354
    .line 355
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v5, v2}, Lx1/r0;->K0(Z)V

    .line 359
    .line 360
    .line 361
    :cond_a
    iget-object v5, v7, Lx1/j0;->p:Lx1/v0;

    .line 362
    .line 363
    invoke-virtual {v5}, Lx1/v0;->M0()V

    .line 364
    .line 365
    .line 366
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_c
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 374
    .line 375
    iget v0, v0, Lj0/b;->i:I

    .line 376
    .line 377
    move v3, v2

    .line 378
    :goto_6
    if-ge v3, v0, :cond_d

    .line 379
    .line 380
    aget-object v4, v1, v3

    .line 381
    .line 382
    check-cast v4, Lx1/f0;

    .line 383
    .line 384
    iget-object v4, v4, Lx1/f0;->M:Lx1/j0;

    .line 385
    .line 386
    iget-object v4, v4, Lx1/j0;->p:Lx1/v0;

    .line 387
    .line 388
    iget-object v4, v4, Lx1/v0;->D:Lx1/g0;

    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iput-boolean v2, v4, Lx1/g0;->c:Z

    .line 394
    .line 395
    add-int/lit8 v3, v3, 0x1

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_d
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
