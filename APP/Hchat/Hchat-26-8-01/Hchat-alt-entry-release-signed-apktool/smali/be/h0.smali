.class public final Lbe/h0;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public h:Z


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbe/h0;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lud/e;Lud/r;Lb5/k;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lb5/k;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lud/e;->x:Lud/e;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    xor-int/2addr p0, v0

    .line 25
    return p0

    .line 26
    :cond_1
    return v0
.end method

.method public static j(Lud/e;Lud/r;Lud/r;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/r;

    .line 18
    .line 19
    if-ne v1, p1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v2, v1, Lud/r;->H:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lud/r;

    .line 39
    .line 40
    invoke-virtual {v3, p2}, Lud/r;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v4, v1, Lud/r;->m:Lb5/k;

    .line 48
    .line 49
    invoke-static {p0, v3, v4}, Lbe/h0;->i(Lud/e;Lud/r;Lb5/k;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_4
    const/4 p0, 0x1

    .line 58
    return p0
.end method

.method public static k(Lud/e;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lud/e;->o:Lb5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/k;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lud/e;->m:Lod/a;

    .line 13
    .line 14
    iget-object v0, v0, Lod/a;->h:Ljava/lang/String;

    .line 15
    .line 16
    const-string v3, "$"

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Lud/e;->B:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ne v0, v2, :cond_23

    .line 42
    .line 43
    iget-object v0, p0, Lud/e;->C:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-ne v0, v2, :cond_23

    .line 50
    .line 51
    iget-object v0, p0, Lud/e;->C:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lud/r;

    .line 58
    .line 59
    iget-object v3, v0, Lud/r;->k:Lod/d;

    .line 60
    .line 61
    invoke-virtual {v3}, Lod/d;->e()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_23

    .line 66
    .line 67
    iget-object v0, v0, Lud/r;->l:Lud/e;

    .line 68
    .line 69
    invoke-virtual {v0}, Lud/e;->c0()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_23

    .line 74
    .line 75
    :cond_2
    :goto_0
    iget-object v0, p0, Lud/e;->t:Ljava/util/List;

    .line 76
    .line 77
    new-instance v3, La7/b;

    .line 78
    .line 79
    const/16 v4, 0x13

    .line 80
    .line 81
    invoke-direct {v3, v4}, La7/b;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v3}, Lbe/h;->w(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lud/r;

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    goto/16 :goto_b

    .line 93
    .line 94
    :cond_3
    iget-object v3, v0, Lud/r;->H:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    const/4 v4, 0x2

    .line 101
    if-eq v3, v2, :cond_6

    .line 102
    .line 103
    iget-object v3, v0, Lud/r;->H:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    move v3, v1

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, Lud/r;

    .line 118
    .line 119
    iget-object v5, v5, Lud/r;->l:Lud/e;

    .line 120
    .line 121
    new-instance v6, Lbe/g0;

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    invoke-direct {v6, v5, v7}, Lbe/g0;-><init>(Lud/e;I)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3, v6}, Lbe/h;->g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    :goto_1
    if-nez v3, :cond_6

    .line 132
    .line 133
    :cond_5
    :goto_2
    move v3, v1

    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_6
    iget-object v3, v0, Lud/r;->H:Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Lud/r;

    .line 143
    .line 144
    iget-object v5, v3, Lud/r;->l:Lud/e;

    .line 145
    .line 146
    invoke-virtual {v5, p0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_11

    .line 151
    .line 152
    iget-object v3, v0, Lud/r;->H:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lud/r;

    .line 159
    .line 160
    iget-object v5, v3, Lud/r;->k:Lod/d;

    .line 161
    .line 162
    invoke-virtual {v5}, Lod/d;->e()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_8

    .line 167
    .line 168
    :cond_7
    :goto_3
    move v3, v1

    .line 169
    goto/16 :goto_5

    .line 170
    .line 171
    :cond_8
    iget-object v5, p0, Lud/e;->C:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_9

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    iget-object v5, p0, Lud/e;->u:Ljava/util/List;

    .line 181
    .line 182
    new-instance v6, Lbe/g0;

    .line 183
    .line 184
    const/4 v7, 0x1

    .line 185
    invoke-direct {v6, p0, v7}, Lbe/g0;-><init>(Lud/e;I)V

    .line 186
    .line 187
    .line 188
    invoke-static {v5, v6}, Lbe/h;->w(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Lud/g;

    .line 193
    .line 194
    if-nez v5, :cond_a

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_a
    iget-object v6, v5, Lud/g;->o:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-ne v7, v4, :cond_7

    .line 204
    .line 205
    invoke-interface {v6, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_7

    .line 210
    .line 211
    iget-object v7, p0, Lud/e;->C:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v6, v7}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-nez v6, :cond_b

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_b
    invoke-static {p0, v0, v3}, Lbe/h0;->j(Lud/e;Lud/r;Lud/r;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-nez v3, :cond_c

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_c
    iget-object v3, p0, Lud/e;->u:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    :cond_d
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_10

    .line 238
    .line 239
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, Lud/g;

    .line 244
    .line 245
    if-ne v6, v5, :cond_e

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_e
    iget-object v7, v6, Lud/g;->o:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_d

    .line 259
    .line 260
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    check-cast v8, Lud/r;

    .line 265
    .line 266
    iget-object v9, v6, Lud/g;->m:Lb5/k;

    .line 267
    .line 268
    invoke-static {p0, v8, v9}, Lbe/h0;->i(Lud/e;Lud/r;Lb5/k;)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    if-eqz v8, :cond_f

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_10
    sget-object v3, Lmd/a;->I:Lmd/a;

    .line 276
    .line 277
    invoke-virtual {v5, v3}, Lmd/e;->w(Lmd/a;)V

    .line 278
    .line 279
    .line 280
    move v3, v2

    .line 281
    :goto_5
    if-eqz v3, :cond_5

    .line 282
    .line 283
    move v3, v4

    .line 284
    goto :goto_6

    .line 285
    :cond_11
    invoke-virtual {v5}, Lud/e;->a0()Lud/e;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v5, p0}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_12

    .line 294
    .line 295
    goto/16 :goto_2

    .line 296
    .line 297
    :cond_12
    invoke-static {p0, v0, v3}, Lbe/h0;->j(Lud/e;Lud/r;Lud/r;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_13

    .line 302
    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :cond_13
    iget-object v3, p0, Lud/e;->u:Ljava/util/List;

    .line 306
    .line 307
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    :cond_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-eqz v5, :cond_16

    .line 316
    .line 317
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    check-cast v5, Lud/g;

    .line 322
    .line 323
    iget-object v6, v5, Lud/g;->o:Ljava/util/List;

    .line 324
    .line 325
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    :cond_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    if-eqz v7, :cond_14

    .line 334
    .line 335
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    check-cast v7, Lud/r;

    .line 340
    .line 341
    iget-object v8, v5, Lud/g;->m:Lb5/k;

    .line 342
    .line 343
    invoke-static {p0, v7, v8}, Lbe/h0;->i(Lud/e;Lud/r;Lb5/k;)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-eqz v7, :cond_15

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :cond_16
    move v3, v2

    .line 352
    :goto_6
    if-nez v3, :cond_17

    .line 353
    .line 354
    goto/16 :goto_b

    .line 355
    .line 356
    :cond_17
    iget-object v5, p0, Lud/e;->q:Ljava/util/List;

    .line 357
    .line 358
    iget-object v6, p0, Lud/e;->k:Lud/u;

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    const/4 v7, 0x0

    .line 365
    if-le v5, v2, :cond_18

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_18
    iget-object v8, p0, Lud/e;->p:Lqd/j;

    .line 369
    .line 370
    if-eqz v8, :cond_1c

    .line 371
    .line 372
    sget-object v9, Lqd/j;->k:Lqd/e;

    .line 373
    .line 374
    invoke-virtual {v8, v9}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-eqz v9, :cond_19

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_19
    if-nez v5, :cond_1a

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_1a
    iget-object v5, p0, Lud/e;->q:Ljava/util/List;

    .line 385
    .line 386
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    check-cast v5, Lqd/j;

    .line 391
    .line 392
    iget-object v9, v6, Lud/u;->s:Led/c;

    .line 393
    .line 394
    invoke-virtual {v8}, Lqd/j;->l()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    invoke-virtual {v5}, Lqd/j;->l()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-virtual {v9, v10}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    invoke-interface {v9, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    if-eqz v9, :cond_1b

    .line 411
    .line 412
    :goto_7
    move-object v7, v8

    .line 413
    goto :goto_9

    .line 414
    :cond_1b
    iget-object v6, v6, Lud/u;->a:Lbc/g;

    .line 415
    .line 416
    iget-boolean v6, v6, Lbc/g;->u:Z

    .line 417
    .line 418
    if-eqz v6, :cond_1e

    .line 419
    .line 420
    invoke-virtual {v8}, Lqd/j;->l()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    const-string v8, "kotlin.jvm.internal.Lambda"

    .line 425
    .line 426
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-eqz v6, :cond_1e

    .line 431
    .line 432
    move-object v7, v5

    .line 433
    goto :goto_9

    .line 434
    :cond_1c
    :goto_8
    if-ne v5, v2, :cond_1d

    .line 435
    .line 436
    iget-object v5, p0, Lud/e;->q:Ljava/util/List;

    .line 437
    .line 438
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    move-object v7, v5

    .line 443
    check-cast v7, Lqd/j;

    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_1d
    sget-object v7, Lqd/j;->k:Lqd/e;

    .line 447
    .line 448
    :cond_1e
    :goto_9
    if-nez v7, :cond_1f

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_1f
    if-ne v3, v4, :cond_20

    .line 452
    .line 453
    iget-object v4, p0, Lud/e;->C:Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    check-cast v4, Lud/r;

    .line 460
    .line 461
    iget-object v4, v4, Lud/r;->l:Lud/e;

    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_20
    iget-object v4, v0, Lud/r;->H:Ljava/util/List;

    .line 465
    .line 466
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, Lud/r;

    .line 471
    .line 472
    iget-object v4, v4, Lud/r;->l:Lud/e;

    .line 473
    .line 474
    :goto_a
    invoke-virtual {v4, p0}, Lud/e;->S(Lud/e;)V

    .line 475
    .line 476
    .line 477
    new-instance v5, Lnd/a;

    .line 478
    .line 479
    invoke-direct {v5, v4, v7, v3}, Lnd/a;-><init>(Lud/e;Lqd/j;I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p0, v5}, Lmd/e;->y(Loc/b;)V

    .line 483
    .line 484
    .line 485
    sget-object v3, Lmd/a;->s:Lmd/a;

    .line 486
    .line 487
    invoke-virtual {p0, v3}, Lmd/e;->w(Lmd/a;)V

    .line 488
    .line 489
    .line 490
    sget-object v3, Lmd/a;->H:Lmd/a;

    .line 491
    .line 492
    invoke-virtual {v0, v3}, Lmd/e;->w(Lmd/a;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v4}, Lud/e;->a0()Lud/e;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {p0, v0}, Lud/e;->i0(Lud/e;)V

    .line 500
    .line 501
    .line 502
    iget-object v3, v4, Lud/e;->B:Ljava/util/List;

    .line 503
    .line 504
    if-eqz v3, :cond_21

    .line 505
    .line 506
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    if-nez v4, :cond_21

    .line 511
    .line 512
    invoke-interface {v3, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    :cond_21
    iget-object v3, p0, Lud/e;->x:Lud/e;

    .line 516
    .line 517
    if-ne v3, p0, :cond_22

    .line 518
    .line 519
    move v1, v2

    .line 520
    :cond_22
    if-eqz v1, :cond_23

    .line 521
    .line 522
    invoke-virtual {v0, p0}, Lud/e;->i0(Lud/e;)V

    .line 523
    .line 524
    .line 525
    iget-object v1, v0, Lud/e;->A:Ljava/util/List;

    .line 526
    .line 527
    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-nez v1, :cond_23

    .line 532
    .line 533
    iget-object v1, v0, Lud/e;->A:Ljava/util/List;

    .line 534
    .line 535
    invoke-static {v1, p0}, Lbe/h;->Y(Ljava/util/List;Lnd/b0;)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    iput-object p0, v0, Lud/e;->A:Ljava/util/List;

    .line 540
    .line 541
    :cond_23
    :goto_b
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lbe/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "ProcessMethodsForInline"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "ProcessAnonymous"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lud/u;)V
    .locals 7

    .line 1
    iget v0, p0, Lbe/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lud/u;->a:Lbc/g;

    .line 7
    .line 8
    iget-boolean p1, p1, Lbc/g;->t:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lbe/h0;->h:Z

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p1, Lud/u;->a:Lbc/g;

    .line 14
    .line 15
    iget-boolean v0, v0, Lbc/g;->s:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lbe/h0;->h:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    iget-object v0, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v1, Lae/e;

    .line 26
    .line 27
    const/4 v2, 0x6

    .line 28
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lud/e;

    .line 61
    .line 62
    sget-object v4, Lmd/b;->h:Lmd/b;

    .line 63
    .line 64
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lnd/a;

    .line 71
    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    iget-object v4, v4, Lnd/a;->g:Lud/e;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/util/List;

    .line 81
    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 91
    .line 92
    const/4 v6, 0x2

    .line 93
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 103
    .line 104
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    new-instance v2, Ljava/util/HashSet;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v3, Lbe/f0;

    .line 124
    .line 125
    invoke-direct {v3, p0, v2, v0}, Lbe/f0;-><init>(Lbe/h0;Ljava/util/HashSet;Ljava/util/HashMap;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->forEach(Ljava/util/function/BiConsumer;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lud/e;

    .line 148
    .line 149
    iget-object v0, v0, Lud/e;->A:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    const/4 v3, 0x1

    .line 156
    if-le v1, v3, :cond_6

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 159
    .line 160
    .line 161
    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    :goto_2
    return-void

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lud/e;)Z
    .locals 5

    .line 1
    iget v0, p0, Lbe/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lbe/h0;->h:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object p1, p1, Lud/e;->t:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lud/r;

    .line 30
    .line 31
    iget-boolean v1, v0, Lud/r;->p:Z

    .line 32
    .line 33
    iget-object v2, v0, Lud/r;->l:Lud/e;

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    sget-object v1, Lmd/a;->s:Lmd/a;

    .line 38
    .line 39
    iget-object v3, v0, Lmd/e;->g:Lmd/f;

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v1, v0, Lud/r;->m:Lb5/k;

    .line 49
    .line 50
    invoke-virtual {v1}, Lb5/k;->i()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    iget-object v3, v0, Lud/r;->k:Lod/d;

    .line 57
    .line 58
    iget-object v3, v3, Lod/d;->g:Ljava/lang/String;

    .line 59
    .line 60
    const-string v4, "$"

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v1}, Lb5/k;->h()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-virtual {v0}, Lud/r;->W()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    iget-object v1, v2, Lud/e;->k:Lud/u;

    .line 82
    .line 83
    iget-object v1, v1, Lud/u;->a:Lbc/g;

    .line 84
    .line 85
    iget-boolean v1, v1, Lbc/g;->s:Z

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    :goto_1
    sget-object v1, Lmd/a;->c0:Lmd/a;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lud/e;->a0()Lud/e;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v0, v0, Lud/r;->H:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Lud/r;

    .line 115
    .line 116
    iget-object v2, v2, Lud/r;->l:Lud/e;

    .line 117
    .line 118
    invoke-virtual {v2}, Lud/e;->a0()Lud/e;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-eq v2, v1, :cond_5

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Lud/e;->i0(Lud/e;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v2, Lud/e;->A:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_5

    .line 134
    .line 135
    iget-object v3, v2, Lud/e;->A:Ljava/util/List;

    .line 136
    .line 137
    invoke-static {v3, v1}, Lbe/h;->Y(Ljava/util/List;Lnd/b0;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iput-object v3, v2, Lud/e;->A:Ljava/util/List;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    const/4 p1, 0x1

    .line 145
    :goto_3
    return p1

    .line 146
    :pswitch_0
    iget-boolean v0, p0, Lbe/h0;->h:Z

    .line 147
    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    sget-object v0, Lmd/a;->i0:Lmd/a;

    .line 151
    .line 152
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    :try_start_0
    invoke-static {p1}, Lbe/h0;->k(Lud/e;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :catch_0
    move-exception v0

    .line 165
    goto :goto_4

    .line 166
    :catch_1
    move-exception v0

    .line 167
    :goto_4
    const-string v1, "Anonymous visitor error"

    .line 168
    .line 169
    invoke-static {p1, v1, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :goto_5
    iget-object p1, p1, Lud/e;->v:Ljava/util/List;

    .line 173
    .line 174
    new-instance v0, Lae/g;

    .line 175
    .line 176
    const/4 v1, 0x4

    .line 177
    invoke-direct {v0, p0, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    const/4 p1, 0x0

    .line 184
    return p1

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
