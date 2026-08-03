.class public final Lx1/q0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx1/r0;


# direct methods
.method public synthetic constructor <init>(Lx1/r0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx1/q0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lx1/q0;->h:Lx1/r0;

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
    .locals 9

    .line 1
    iget v0, p0, Lx1/q0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx1/q0;->h:Lx1/r0;

    .line 7
    .line 8
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lx1/i1;->p1()Lx1/o0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-wide v2, v0, Lx1/r0;->E:J

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Lv1/m0;->Q(J)Lv1/b1;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    iget-object v0, p0, Lx1/q0;->h:Lx1/r0;

    .line 30
    .line 31
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 32
    .line 33
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 34
    .line 35
    invoke-static {v2}, Lx1/k;->q(Lx1/f0;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    iget-boolean v2, v1, Lx1/j0;->c:Z

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v2, v2, Lx1/i1;->w:Lx1/i1;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2}, Lx1/i1;->p1()Lx1/o0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    iget-object v3, v2, Lx1/n0;->r:Lv1/k0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object v2, v2, Lx1/i1;->w:Lx1/i1;

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    iget-object v3, v2, Lx1/n0;->r:Lv1/k0;

    .line 72
    .line 73
    :cond_1
    :goto_0
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 76
    .line 77
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ly1/t;

    .line 82
    .line 83
    invoke-virtual {v2}, Ly1/t;->getPlacementScope()Lv1/a1;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :cond_2
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lx1/i1;->p1()Lx1/o0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-wide v4, v0, Lx1/r0;->t:J

    .line 99
    .line 100
    invoke-static {v3, v1, v4, v5}, Lv1/a1;->C(Lv1/a1;Lv1/b1;J)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_1
    iget-object v0, p0, Lx1/q0;->h:Lx1/r0;

    .line 107
    .line 108
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    iput v2, v1, Lx1/j0;->h:I

    .line 112
    .line 113
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 114
    .line 115
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 120
    .line 121
    iget v3, v3, Lj0/b;->i:I

    .line 122
    .line 123
    move v5, v2

    .line 124
    :goto_1
    const v6, 0x7fffffff

    .line 125
    .line 126
    .line 127
    if-ge v5, v3, :cond_4

    .line 128
    .line 129
    aget-object v7, v4, v5

    .line 130
    .line 131
    check-cast v7, Lx1/f0;

    .line 132
    .line 133
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 134
    .line 135
    iget-object v7, v7, Lx1/j0;->q:Lx1/r0;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget v8, v7, Lx1/r0;->o:I

    .line 141
    .line 142
    iput v8, v7, Lx1/r0;->n:I

    .line 143
    .line 144
    iput v6, v7, Lx1/r0;->o:I

    .line 145
    .line 146
    iget-object v6, v7, Lx1/r0;->p:Lx1/d0;

    .line 147
    .line 148
    sget-object v8, Lx1/d0;->h:Lx1/d0;

    .line 149
    .line 150
    if-ne v6, v8, :cond_3

    .line 151
    .line 152
    sget-object v6, Lx1/d0;->i:Lx1/d0;

    .line 153
    .line 154
    iput-object v6, v7, Lx1/r0;->p:Lx1/d0;

    .line 155
    .line 156
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 160
    .line 161
    iget-object v1, v1, Lx1/j0;->a:Lx1/f0;

    .line 162
    .line 163
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 168
    .line 169
    iget v3, v3, Lj0/b;->i:I

    .line 170
    .line 171
    move v5, v2

    .line 172
    :goto_2
    if-ge v5, v3, :cond_5

    .line 173
    .line 174
    aget-object v7, v4, v5

    .line 175
    .line 176
    check-cast v7, Lx1/f0;

    .line 177
    .line 178
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 179
    .line 180
    iget-object v7, v7, Lx1/j0;->q:Lx1/r0;

    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v7, v7, Lx1/r0;->x:Lx1/g0;

    .line 186
    .line 187
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    add-int/lit8 v5, v5, 0x1

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_5
    invoke-virtual {v0}, Lx1/r0;->A()Lx1/r;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iget-object v3, v3, Lx1/r;->Z:Lx1/q;

    .line 198
    .line 199
    if-eqz v3, :cond_7

    .line 200
    .line 201
    iget-boolean v3, v3, Lx1/n0;->q:Z

    .line 202
    .line 203
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Lf/d0;

    .line 208
    .line 209
    iget-object v5, v4, Lf/d0;->h:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v5, Lj0/b;

    .line 212
    .line 213
    iget v5, v5, Lj0/b;->i:I

    .line 214
    .line 215
    move v7, v2

    .line 216
    :goto_3
    if-ge v7, v5, :cond_7

    .line 217
    .line 218
    invoke-virtual {v4, v7}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    check-cast v8, Lx1/f0;

    .line 223
    .line 224
    iget-object v8, v8, Lx1/f0;->L:Lx1/b1;

    .line 225
    .line 226
    iget-object v8, v8, Lx1/b1;->d:Lx1/i1;

    .line 227
    .line 228
    invoke-virtual {v8}, Lx1/i1;->p1()Lx1/o0;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    if-eqz v8, :cond_6

    .line 233
    .line 234
    iput-boolean v3, v8, Lx1/n0;->q:Z

    .line 235
    .line 236
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    invoke-virtual {v0}, Lx1/r0;->A()Lx1/r;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    iget-object v3, v3, Lx1/r;->Z:Lx1/q;

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Lx1/o0;->Z0()Lv1/o0;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-interface {v3}, Lv1/o0;->f()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Lx1/r0;->A()Lx1/r;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iget-object v0, v0, Lx1/r;->Z:Lx1/q;

    .line 260
    .line 261
    if-eqz v0, :cond_9

    .line 262
    .line 263
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Lf/d0;

    .line 268
    .line 269
    iget-object v3, v0, Lf/d0;->h:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v3, Lj0/b;

    .line 272
    .line 273
    iget v3, v3, Lj0/b;->i:I

    .line 274
    .line 275
    move v4, v2

    .line 276
    :goto_4
    if-ge v4, v3, :cond_9

    .line 277
    .line 278
    invoke-virtual {v0, v4}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    check-cast v5, Lx1/f0;

    .line 283
    .line 284
    iget-object v5, v5, Lx1/f0;->L:Lx1/b1;

    .line 285
    .line 286
    iget-object v5, v5, Lx1/b1;->d:Lx1/i1;

    .line 287
    .line 288
    invoke-virtual {v5}, Lx1/i1;->p1()Lx1/o0;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    if-eqz v5, :cond_8

    .line 293
    .line 294
    iput-boolean v2, v5, Lx1/n0;->q:Z

    .line 295
    .line 296
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_9
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v3, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 304
    .line 305
    iget v0, v0, Lj0/b;->i:I

    .line 306
    .line 307
    move v4, v2

    .line 308
    :goto_5
    if-ge v4, v0, :cond_b

    .line 309
    .line 310
    aget-object v5, v3, v4

    .line 311
    .line 312
    check-cast v5, Lx1/f0;

    .line 313
    .line 314
    iget-object v5, v5, Lx1/f0;->M:Lx1/j0;

    .line 315
    .line 316
    iget-object v5, v5, Lx1/j0;->q:Lx1/r0;

    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget v7, v5, Lx1/r0;->n:I

    .line 322
    .line 323
    iget v8, v5, Lx1/r0;->o:I

    .line 324
    .line 325
    if-eq v7, v8, :cond_a

    .line 326
    .line 327
    if-ne v8, v6, :cond_a

    .line 328
    .line 329
    const/4 v7, 0x1

    .line 330
    invoke-virtual {v5, v7}, Lx1/r0;->K0(Z)V

    .line 331
    .line 332
    .line 333
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_b
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 341
    .line 342
    iget v0, v0, Lj0/b;->i:I

    .line 343
    .line 344
    move v3, v2

    .line 345
    :goto_6
    if-ge v3, v0, :cond_c

    .line 346
    .line 347
    aget-object v4, v1, v3

    .line 348
    .line 349
    check-cast v4, Lx1/f0;

    .line 350
    .line 351
    iget-object v4, v4, Lx1/f0;->M:Lx1/j0;

    .line 352
    .line 353
    iget-object v4, v4, Lx1/j0;->q:Lx1/r0;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    iget-object v4, v4, Lx1/r0;->x:Lx1/g0;

    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iput-boolean v2, v4, Lx1/g0;->c:Z

    .line 364
    .line 365
    add-int/lit8 v3, v3, 0x1

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
