.class public final Li4/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li4/m;

.field public final b:Li4/e;

.field public final c:I

.field public final d:I

.field public final e:Li4/a0;

.field public final f:Li4/c0;

.field public final g:[Lb5/c;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:[Li4/l;

.field public k:Z

.field public final l:[Lf1/h;

.field public m:Z

.field public final n:Li4/x;


# direct methods
.method public constructor <init>(Li4/m;Lh4/u;Ln4/a;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Li4/m;->c:Lh4/c;

    .line 9
    .line 10
    iput-object v0, v1, Li4/z;->a:Li4/m;

    .line 11
    .line 12
    new-instance v3, Li4/a;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, v3, Li4/a;->h:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v4, v0, Li4/m;->c:Lh4/c;

    .line 20
    .line 21
    iget-object v4, v4, Lh4/c;->d:Li4/l;

    .line 22
    .line 23
    iget-object v4, v4, Li4/l;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Lg8/b;

    .line 26
    .line 27
    iget v4, v4, Lg8/b;->c:I

    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    invoke-static {v4}, Lx6/d;->L(I)[I

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iput-object v5, v3, Li4/a;->i:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v4}, Lx6/d;->L(I)[I

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iput-object v5, v3, Li4/a;->j:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v4}, Lx6/d;->L(I)[I

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iput-object v5, v3, Li4/a;->k:Ljava/lang/Object;

    .line 48
    .line 49
    new-array v5, v4, [Lz4/g;

    .line 50
    .line 51
    iput-object v5, v3, Li4/a;->l:Ljava/lang/Object;

    .line 52
    .line 53
    new-array v4, v4, [Li4/g;

    .line 54
    .line 55
    iput-object v4, v3, Li4/a;->m:Ljava/lang/Object;

    .line 56
    .line 57
    const/4 v4, -0x1

    .line 58
    iput v4, v3, Li4/a;->g:I

    .line 59
    .line 60
    iget-object v4, v3, Li4/a;->j:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, [I

    .line 63
    .line 64
    iget-object v5, v2, Lh4/c;->d:Li4/l;

    .line 65
    .line 66
    iget-object v6, v2, Lh4/c;->e:Li4/g;

    .line 67
    .line 68
    iget-object v7, v6, Lz4/e;->h:[Ljava/lang/Object;

    .line 69
    .line 70
    array-length v7, v7

    .line 71
    iget-object v8, v3, Li4/a;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, [I

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-static {v8, v9}, Lx6/d;->g0([II)V

    .line 77
    .line 78
    .line 79
    iget-object v10, v3, Li4/a;->k:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, [I

    .line 82
    .line 83
    invoke-static {v10, v9}, Lx6/d;->g0([II)V

    .line 84
    .line 85
    .line 86
    :cond_0
    array-length v11, v8

    .line 87
    move v12, v9

    .line 88
    :goto_0
    if-ge v12, v11, :cond_4

    .line 89
    .line 90
    aget v13, v8, v12

    .line 91
    .line 92
    if-eqz v13, :cond_3

    .line 93
    .line 94
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-static {v8, v9}, Lx6/d;->x([II)I

    .line 98
    .line 99
    .line 100
    move-result v11
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    if-gez v11, :cond_2

    .line 102
    .line 103
    move v11, v9

    .line 104
    :goto_2
    if-ge v11, v7, :cond_0

    .line 105
    .line 106
    invoke-virtual {v6, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    check-cast v12, Li4/f;

    .line 111
    .line 112
    iget v13, v12, Li4/f;->a:I

    .line 113
    .line 114
    iget v14, v12, Li4/f;->b:I

    .line 115
    .line 116
    invoke-static {v4, v13}, Lx6/d;->x([II)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-ltz v15, :cond_1

    .line 121
    .line 122
    if-ge v15, v14, :cond_1

    .line 123
    .line 124
    invoke-static {v10, v13}, Lx6/d;->g0([II)V

    .line 125
    .line 126
    .line 127
    invoke-static {v10, v14}, Lx6/d;->g0([II)V

    .line 128
    .line 129
    .line 130
    iget v12, v12, Li4/f;->c:I

    .line 131
    .line 132
    const/4 v13, 0x1

    .line 133
    invoke-virtual {v3, v12, v13}, Li4/a;->e(IZ)V

    .line 134
    .line 135
    .line 136
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_2
    :try_start_1
    invoke-static {v8, v11}, Lx6/d;->q([II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v11, v3}, Li4/l;->a(ILi4/k;)I

    .line 143
    .line 144
    .line 145
    iput v11, v3, Li4/a;->g:I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catch_0
    move-exception v0

    .line 149
    new-instance v2, Li4/b0;

    .line 150
    .line 151
    const-string v3, "flow of control falls off end of method"

    .line 152
    .line 153
    invoke-direct {v2, v3, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 154
    .line 155
    .line 156
    throw v2

    .line 157
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_4
    iget-object v5, v3, Li4/a;->h:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v5, Li4/m;

    .line 163
    .line 164
    iget-object v5, v5, Li4/m;->c:Lh4/c;

    .line 165
    .line 166
    iget-object v5, v5, Lh4/c;->d:Li4/l;

    .line 167
    .line 168
    iget-object v5, v5, Li4/l;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Lg8/b;

    .line 171
    .line 172
    iget v5, v5, Lg8/b;->c:I

    .line 173
    .line 174
    new-array v5, v5, [Li4/d;

    .line 175
    .line 176
    move v6, v9

    .line 177
    move v12, v6

    .line 178
    :goto_3
    add-int/lit8 v7, v12, 0x1

    .line 179
    .line 180
    invoke-static {v10, v7}, Lx6/d;->x([II)I

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    if-gez v14, :cond_6

    .line 185
    .line 186
    new-instance v3, Li4/e;

    .line 187
    .line 188
    invoke-direct {v3, v6}, Lz4/i;-><init>(I)V

    .line 189
    .line 190
    .line 191
    move v4, v9

    .line 192
    :goto_4
    if-ge v4, v6, :cond_5

    .line 193
    .line 194
    aget-object v7, v5, v4

    .line 195
    .line 196
    invoke-virtual {v3, v4, v7}, Lz4/i;->q(ILz4/h;)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_5
    iput-object v3, v1, Li4/z;->b:Li4/e;

    .line 203
    .line 204
    invoke-virtual {v3}, Lz4/i;->o()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    iput v4, v1, Li4/z;->d:I

    .line 209
    .line 210
    iget v5, v2, Lh4/c;->c:I

    .line 211
    .line 212
    iput v5, v1, Li4/z;->c:I

    .line 213
    .line 214
    new-instance v6, Li4/a0;

    .line 215
    .line 216
    move-object/from16 v7, p2

    .line 217
    .line 218
    invoke-direct {v6, v1, v0, v7}, Li4/a0;-><init>(Li4/z;Li4/m;Lh4/u;)V

    .line 219
    .line 220
    .line 221
    iput-object v6, v1, Li4/z;->e:Li4/a0;

    .line 222
    .line 223
    new-instance v7, Li4/c0;

    .line 224
    .line 225
    move-object/from16 v8, p3

    .line 226
    .line 227
    invoke-direct {v7, v6, v0, v8}, Li4/c0;-><init>(Li4/a0;Li4/m;Ln4/a;)V

    .line 228
    .line 229
    .line 230
    iput-object v7, v1, Li4/z;->f:Li4/c0;

    .line 231
    .line 232
    new-array v0, v4, [Lb5/c;

    .line 233
    .line 234
    iput-object v0, v1, Li4/z;->g:[Lb5/c;

    .line 235
    .line 236
    new-array v6, v4, [Lf1/h;

    .line 237
    .line 238
    iput-object v6, v1, Li4/z;->l:[Lf1/h;

    .line 239
    .line 240
    new-instance v6, Ljava/util/ArrayList;

    .line 241
    .line 242
    iget-object v7, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 243
    .line 244
    array-length v7, v7

    .line 245
    mul-int/lit8 v7, v7, 0x2

    .line 246
    .line 247
    add-int/lit8 v7, v7, 0xa

    .line 248
    .line 249
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 250
    .line 251
    .line 252
    iput-object v6, v1, Li4/z;->h:Ljava/util/ArrayList;

    .line 253
    .line 254
    new-instance v6, Ljava/util/ArrayList;

    .line 255
    .line 256
    iget-object v3, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 257
    .line 258
    array-length v3, v3

    .line 259
    mul-int/lit8 v3, v3, 0x2

    .line 260
    .line 261
    add-int/lit8 v3, v3, 0xa

    .line 262
    .line 263
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 264
    .line 265
    .line 266
    iput-object v6, v1, Li4/z;->i:Ljava/util/ArrayList;

    .line 267
    .line 268
    new-array v3, v4, [Li4/l;

    .line 269
    .line 270
    iput-object v3, v1, Li4/z;->j:[Li4/l;

    .line 271
    .line 272
    iput-boolean v9, v1, Li4/z;->k:Z

    .line 273
    .line 274
    new-instance v3, Lb5/c;

    .line 275
    .line 276
    iget v2, v2, Lh4/c;->b:I

    .line 277
    .line 278
    new-instance v6, Li4/u;

    .line 279
    .line 280
    invoke-direct {v6, v5}, Li4/u;-><init>(I)V

    .line 281
    .line 282
    .line 283
    new-instance v5, Li4/n;

    .line 284
    .line 285
    const/4 v7, 0x0

    .line 286
    invoke-direct {v5, v2, v7}, Li4/n;-><init>(II)V

    .line 287
    .line 288
    .line 289
    sget-object v2, Lz4/g;->k:Lz4/g;

    .line 290
    .line 291
    invoke-direct {v3, v6, v5, v2}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 292
    .line 293
    .line 294
    aput-object v3, v0, v9

    .line 295
    .line 296
    new-instance v0, Li4/x;

    .line 297
    .line 298
    invoke-direct {v0, v4}, Li4/i;-><init>(I)V

    .line 299
    .line 300
    .line 301
    iget-object v2, v1, Li4/z;->a:Li4/m;

    .line 302
    .line 303
    iget-object v2, v2, Li4/m;->c:Lh4/c;

    .line 304
    .line 305
    iget-object v2, v2, Lh4/c;->e:Li4/g;

    .line 306
    .line 307
    iget-object v2, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 308
    .line 309
    array-length v2, v2

    .line 310
    add-int/2addr v4, v2

    .line 311
    iput v4, v0, Li4/x;->h:I

    .line 312
    .line 313
    iput-object v0, v1, Li4/z;->n:Li4/x;

    .line 314
    .line 315
    return-void

    .line 316
    :cond_6
    move-object/from16 v7, p2

    .line 317
    .line 318
    move-object/from16 v8, p3

    .line 319
    .line 320
    invoke-static {v4, v12}, Lx6/d;->z([II)Z

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    if-eqz v11, :cond_b

    .line 325
    .line 326
    add-int/lit8 v11, v14, -0x1

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    :goto_5
    if-lt v11, v12, :cond_8

    .line 330
    .line 331
    iget-object v13, v3, Li4/a;->l:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v13, [Lz4/g;

    .line 334
    .line 335
    aget-object v13, v13, v11

    .line 336
    .line 337
    if-eqz v13, :cond_7

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_7
    add-int/lit8 v11, v11, -0x1

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_8
    const/4 v11, -0x1

    .line 344
    :goto_6
    if-nez v13, :cond_a

    .line 345
    .line 346
    invoke-static {v14}, Lz4/g;->o(I)Lz4/g;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    sget-object v11, Li4/g;->i:Li4/g;

    .line 351
    .line 352
    :cond_9
    :goto_7
    move-object/from16 v16, v11

    .line 353
    .line 354
    move-object v15, v13

    .line 355
    goto :goto_8

    .line 356
    :cond_a
    iget-object v15, v3, Li4/a;->m:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v15, [Li4/g;

    .line 359
    .line 360
    aget-object v11, v15, v11

    .line 361
    .line 362
    if-nez v11, :cond_9

    .line 363
    .line 364
    sget-object v11, Li4/g;->i:Li4/g;

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :goto_8
    new-instance v11, Li4/d;

    .line 368
    .line 369
    move v13, v12

    .line 370
    invoke-direct/range {v11 .. v16}, Li4/d;-><init>(IIILz4/g;Li4/g;)V

    .line 371
    .line 372
    .line 373
    aput-object v11, v5, v6

    .line 374
    .line 375
    add-int/lit8 v6, v6, 0x1

    .line 376
    .line 377
    :cond_b
    move v12, v14

    .line 378
    goto/16 :goto_3
.end method

.method public static b(Li4/m;Lh4/u;Ln4/a;)Lf1/h;
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Li4/z;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Li4/z;-><init>(Li4/m;Lh4/u;Ln4/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Li4/z;->c()V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, Li4/z;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    new-instance v1, Lu4/c;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Lu4/c;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    const/4 v4, -0x1

    .line 23
    if-ge v3, p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Lu4/b;

    .line 30
    .line 31
    invoke-virtual {v1, v3, v5}, Lz4/i;->q(ILz4/h;)V

    .line 32
    .line 33
    .line 34
    iput v4, v1, Lu4/c;->j:I

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput-boolean v2, v1, Lz4/j;->g:Z

    .line 40
    .line 41
    new-instance p1, Lf1/h;

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Li4/z;->f(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-direct {p1, v1, p2}, Lf1/h;-><init>(Lu4/c;I)V
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :catch_0
    move-exception p1

    .line 52
    iget-object p0, p0, Li4/m;->a:Ll4/b;

    .line 53
    .line 54
    invoke-interface {p0}, Ll4/a;->d()Lv4/z;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lv4/z;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p2, "...while working on method "

    .line 63
    .line 64
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1, p0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method


# virtual methods
.method public final a(Lu4/b;Lz4/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lz4/j;->k()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Li4/z;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Li4/z;->d:I

    .line 4
    .line 5
    invoke-static {v0}, Lx6/d;->L(I)[I

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v2, v3}, Lx6/d;->g0([II)V

    .line 11
    .line 12
    .line 13
    iget-object v4, v1, Li4/z;->a:Li4/m;

    .line 14
    .line 15
    iget-object v5, v4, Li4/m;->e:Li4/r;

    .line 16
    .line 17
    invoke-virtual {v4, v3}, Li4/m;->f(I)Lu4/t;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    iget-object v12, v4, Li4/m;->a:Ll4/b;

    .line 22
    .line 23
    invoke-interface {v12}, Ll4/b;->a()Lw4/a;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget-object v13, v6, Lw4/a;->i:Lw4/b;

    .line 28
    .line 29
    iget-object v6, v13, Lz4/e;->h:[Ljava/lang/Object;

    .line 30
    .line 31
    array-length v14, v6

    .line 32
    new-instance v15, Lh4/u;

    .line 33
    .line 34
    add-int/lit8 v6, v14, 0x1

    .line 35
    .line 36
    invoke-direct {v15, v6}, Lz4/e;-><init>(I)V

    .line 37
    .line 38
    .line 39
    move v6, v3

    .line 40
    move v7, v6

    .line 41
    :goto_0
    const/4 v9, 0x0

    .line 42
    if-ge v6, v14, :cond_2

    .line 43
    .line 44
    invoke-virtual {v13, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    check-cast v10, Lw4/c;

    .line 49
    .line 50
    invoke-virtual {v5, v3, v7}, Li4/r;->o(II)Li4/q;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    if-nez v11, :cond_0

    .line 55
    .line 56
    invoke-static {v7, v10, v9}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    :goto_1
    move v3, v6

    .line 61
    goto :goto_3

    .line 62
    :cond_0
    iget-object v3, v11, Li4/q;->c:Lv4/c0;

    .line 63
    .line 64
    iget-object v11, v11, Li4/q;->e:Lv4/c0;

    .line 65
    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    if-nez v11, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    new-instance v9, Lu4/k;

    .line 72
    .line 73
    invoke-direct {v9, v3, v11}, Lu4/k;-><init>(Lv4/c0;Lv4/c0;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    invoke-static {v7, v10, v9}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    goto :goto_1

    .line 81
    :goto_3
    new-instance v6, Lu4/l;

    .line 82
    .line 83
    move v11, v7

    .line 84
    invoke-static {v10}, Lu4/s;->h(Lw4/d;)Lu4/r;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    move-object/from16 v17, v10

    .line 89
    .line 90
    sget-object v10, Lu4/p;->i:Lu4/p;

    .line 91
    .line 92
    move/from16 v18, v11

    .line 93
    .line 94
    invoke-static/range {v18 .. v18}, Lv4/o;->o(I)Lv4/o;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    invoke-direct/range {v6 .. v11}, Lu4/l;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v15, v3, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v17 .. v17}, Lw4/c;->i()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    add-int v7, v6, v18

    .line 109
    .line 110
    add-int/lit8 v6, v3, 0x1

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    goto :goto_0

    .line 114
    :cond_2
    new-instance v3, Lu4/m;

    .line 115
    .line 116
    sget-object v5, Lu4/s;->s:Lu4/r;

    .line 117
    .line 118
    sget-object v10, Lu4/p;->i:Lu4/p;

    .line 119
    .line 120
    invoke-direct {v3, v5, v8, v9, v10}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v15, v14, v3}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    iput-boolean v3, v15, Lz4/j;->g:Z

    .line 128
    .line 129
    invoke-virtual {v1}, Li4/z;->i()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_3

    .line 134
    .line 135
    const/4 v6, -0x4

    .line 136
    invoke-virtual {v1, v6}, Li4/z;->f(I)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    move v13, v6

    .line 141
    goto :goto_4

    .line 142
    :cond_3
    const/4 v13, 0x0

    .line 143
    :goto_4
    new-instance v6, Lu4/b;

    .line 144
    .line 145
    const/4 v14, -0x1

    .line 146
    invoke-virtual {v1, v14}, Li4/z;->f(I)I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-static {v13}, Lz4/g;->o(I)Lz4/g;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-direct {v6, v7, v15, v11, v13}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 155
    .line 156
    .line 157
    sget-object v15, Lz4/g;->k:Lz4/g;

    .line 158
    .line 159
    invoke-virtual {v1, v6, v15}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 160
    .line 161
    .line 162
    iget v6, v1, Li4/z;->c:I

    .line 163
    .line 164
    const/4 v11, 0x1

    .line 165
    if-eqz v3, :cond_8

    .line 166
    .line 167
    iget-object v3, v4, Li4/m;->c:Lh4/c;

    .line 168
    .line 169
    iget v3, v3, Lh4/c;->b:I

    .line 170
    .line 171
    add-int/2addr v3, v6

    .line 172
    if-ge v3, v11, :cond_4

    .line 173
    .line 174
    move v3, v11

    .line 175
    :cond_4
    sget-object v7, Lw4/c;->E:Lw4/c;

    .line 176
    .line 177
    invoke-static {v3, v7, v9}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v1}, Li4/z;->g()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_5

    .line 186
    .line 187
    move v7, v6

    .line 188
    new-instance v6, Lu4/v;

    .line 189
    .line 190
    move v5, v7

    .line 191
    sget-object v7, Lu4/s;->q:Lu4/r;

    .line 192
    .line 193
    move-object/from16 v18, v9

    .line 194
    .line 195
    move-object v9, v10

    .line 196
    sget-object v10, Lw4/b;->i:Lw4/b;

    .line 197
    .line 198
    move/from16 v19, v11

    .line 199
    .line 200
    invoke-interface {v12}, Ll4/a;->b()Lv4/d0;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    move v14, v5

    .line 205
    move/from16 v5, v19

    .line 206
    .line 207
    const/16 v17, 0x2

    .line 208
    .line 209
    invoke-direct/range {v6 .. v11}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 210
    .line 211
    .line 212
    new-instance v7, Lh4/u;

    .line 213
    .line 214
    invoke-direct {v7, v5}, Lz4/e;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    invoke-virtual {v7, v10, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move/from16 v19, v0

    .line 222
    .line 223
    move-object v6, v3

    .line 224
    move v0, v5

    .line 225
    move-object/from16 v17, v12

    .line 226
    .line 227
    move v12, v10

    .line 228
    const/4 v10, 0x0

    .line 229
    goto :goto_5

    .line 230
    :cond_5
    move v14, v6

    .line 231
    move-object v9, v10

    .line 232
    move/from16 v19, v11

    .line 233
    .line 234
    const/4 v6, 0x2

    .line 235
    const/4 v10, 0x0

    .line 236
    new-instance v7, Lh4/u;

    .line 237
    .line 238
    invoke-direct {v7, v6}, Lz4/e;-><init>(I)V

    .line 239
    .line 240
    .line 241
    move/from16 v17, v6

    .line 242
    .line 243
    new-instance v6, Lu4/l;

    .line 244
    .line 245
    move-object v11, v7

    .line 246
    sget-object v7, Lu4/s;->l:Lu4/r;

    .line 247
    .line 248
    move-object/from16 v16, v11

    .line 249
    .line 250
    sget-object v11, Lv4/o;->j:Lv4/o;

    .line 251
    .line 252
    move/from16 v17, v19

    .line 253
    .line 254
    move/from16 v19, v0

    .line 255
    .line 256
    move/from16 v0, v17

    .line 257
    .line 258
    move-object/from16 v17, v12

    .line 259
    .line 260
    move v12, v10

    .line 261
    move-object v10, v9

    .line 262
    move-object v9, v3

    .line 263
    move-object/from16 v3, v16

    .line 264
    .line 265
    invoke-direct/range {v6 .. v11}, Lu4/l;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 266
    .line 267
    .line 268
    move-object v7, v6

    .line 269
    move-object v6, v9

    .line 270
    move-object v9, v10

    .line 271
    invoke-virtual {v3, v12, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    new-instance v7, Lu4/m;

    .line 275
    .line 276
    const/4 v10, 0x0

    .line 277
    invoke-direct {v7, v5, v8, v10, v9}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v0, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object v7, v3

    .line 284
    :goto_5
    const/4 v3, -0x5

    .line 285
    invoke-virtual {v1, v3}, Li4/z;->f(I)I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    iput-boolean v12, v7, Lz4/j;->g:Z

    .line 290
    .line 291
    new-instance v5, Lu4/b;

    .line 292
    .line 293
    invoke-static {v3}, Lz4/g;->o(I)Lz4/g;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    invoke-direct {v5, v13, v7, v11, v3}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v5, v15}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 301
    .line 302
    .line 303
    new-instance v5, Lh4/u;

    .line 304
    .line 305
    invoke-virtual {v1}, Li4/z;->g()Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    if-eqz v7, :cond_6

    .line 310
    .line 311
    const/4 v7, 0x2

    .line 312
    goto :goto_6

    .line 313
    :cond_6
    move v7, v0

    .line 314
    :goto_6
    invoke-direct {v5, v7}, Lz4/e;-><init>(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Li4/z;->g()Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    if-eqz v7, :cond_7

    .line 322
    .line 323
    new-instance v7, Lu4/m;

    .line 324
    .line 325
    invoke-static {v6}, Lu4/s;->j(Lw4/d;)Lu4/r;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    invoke-direct {v7, v11, v8, v6, v9}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 330
    .line 331
    .line 332
    const/4 v12, 0x0

    .line 333
    invoke-virtual {v5, v12, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_7
    const/4 v12, 0x0

    .line 338
    :goto_7
    new-instance v7, Lu4/u;

    .line 339
    .line 340
    sget-object v9, Lu4/s;->E1:Lu4/r;

    .line 341
    .line 342
    invoke-static {v6}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    sget-object v11, Lw4/b;->i:Lw4/b;

    .line 347
    .line 348
    invoke-direct {v7, v9, v8, v6, v11}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Li4/z;->g()Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    invoke-virtual {v5, v6, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    iput-boolean v12, v5, Lz4/j;->g:Z

    .line 359
    .line 360
    new-instance v6, Lu4/b;

    .line 361
    .line 362
    invoke-static {v12}, Lz4/g;->o(I)Lz4/g;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    invoke-direct {v6, v3, v5, v7, v12}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v6, v15}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :cond_8
    move/from16 v19, v0

    .line 374
    .line 375
    move v14, v6

    .line 376
    move-object v10, v9

    .line 377
    move v0, v11

    .line 378
    move-object/from16 v17, v12

    .line 379
    .line 380
    const/4 v12, 0x0

    .line 381
    :goto_8
    invoke-interface/range {v17 .. v17}, Ll4/b;->a()Lw4/a;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    iget-object v5, v1, Li4/z;->g:[Lb5/c;

    .line 386
    .line 387
    aget-object v6, v5, v12

    .line 388
    .line 389
    iget-object v3, v3, Lw4/a;->i:Lw4/b;

    .line 390
    .line 391
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v7, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 395
    .line 396
    array-length v7, v7

    .line 397
    const/4 v8, 0x0

    .line 398
    const/4 v9, 0x0

    .line 399
    :goto_9
    if-ge v8, v7, :cond_9

    .line 400
    .line 401
    invoke-virtual {v3, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v11

    .line 405
    check-cast v11, Lw4/c;

    .line 406
    .line 407
    iget-object v12, v6, Lb5/c;->a:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v12, Li4/s;

    .line 410
    .line 411
    invoke-virtual {v12, v9, v11}, Li4/s;->s(ILw4/d;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v11}, Lw4/c;->i()I

    .line 415
    .line 416
    .line 417
    move-result v11

    .line 418
    add-int/2addr v9, v11

    .line 419
    add-int/lit8 v8, v8, 0x1

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_9
    const/4 v12, 0x0

    .line 423
    aget-object v3, v5, v12

    .line 424
    .line 425
    iget-object v6, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v6, Li4/s;

    .line 428
    .line 429
    invoke-virtual {v6}, Lz4/j;->i()V

    .line 430
    .line 431
    .line 432
    iget-object v3, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, Li4/n;

    .line 435
    .line 436
    iput-boolean v12, v3, Lz4/j;->g:Z

    .line 437
    .line 438
    :goto_a
    invoke-static {v2, v12}, Lx6/d;->x([II)I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-gez v3, :cond_19

    .line 443
    .line 444
    iget-object v2, v1, Li4/z;->e:Li4/a0;

    .line 445
    .line 446
    iget-object v3, v2, Li4/a0;->C:Lu4/r;

    .line 447
    .line 448
    if-nez v3, :cond_a

    .line 449
    .line 450
    const/4 v12, 0x0

    .line 451
    goto/16 :goto_c

    .line 452
    .line 453
    :cond_a
    iget-object v2, v2, Li4/a0;->D:Lu4/t;

    .line 454
    .line 455
    const/4 v6, -0x2

    .line 456
    invoke-virtual {v1, v6}, Li4/z;->f(I)I

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    invoke-virtual {v1}, Li4/z;->i()Z

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    if-eqz v7, :cond_c

    .line 465
    .line 466
    new-instance v7, Lh4/u;

    .line 467
    .line 468
    invoke-direct {v7, v0}, Lz4/e;-><init>(I)V

    .line 469
    .line 470
    .line 471
    new-instance v8, Lu4/u;

    .line 472
    .line 473
    sget-object v9, Lu4/s;->F1:Lu4/r;

    .line 474
    .line 475
    iget-object v11, v4, Li4/m;->c:Lh4/c;

    .line 476
    .line 477
    iget v11, v11, Lh4/c;->b:I

    .line 478
    .line 479
    add-int/2addr v11, v14

    .line 480
    if-ge v11, v0, :cond_b

    .line 481
    .line 482
    move v11, v0

    .line 483
    :cond_b
    sget-object v12, Lw4/c;->E:Lw4/c;

    .line 484
    .line 485
    invoke-static {v11, v12, v10}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    invoke-static {v11}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    sget-object v12, Lw4/b;->i:Lw4/b;

    .line 494
    .line 495
    invoke-direct {v8, v9, v2, v11, v12}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 496
    .line 497
    .line 498
    const/4 v12, 0x0

    .line 499
    invoke-virtual {v7, v12, v8}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    iput-boolean v12, v7, Lz4/j;->g:Z

    .line 503
    .line 504
    const/4 v8, -0x3

    .line 505
    invoke-virtual {v1, v8}, Li4/z;->f(I)I

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    new-instance v9, Lu4/b;

    .line 510
    .line 511
    invoke-static {v8}, Lz4/g;->o(I)Lz4/g;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    invoke-direct {v9, v6, v7, v11, v8}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 516
    .line 517
    .line 518
    sget-object v6, Lz4/g;->k:Lz4/g;

    .line 519
    .line 520
    invoke-virtual {v1, v9, v6}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 521
    .line 522
    .line 523
    move v6, v8

    .line 524
    :cond_c
    new-instance v7, Lh4/u;

    .line 525
    .line 526
    invoke-direct {v7, v0}, Lz4/e;-><init>(I)V

    .line 527
    .line 528
    .line 529
    iget-object v8, v3, Lu4/r;->c:Lw4/e;

    .line 530
    .line 531
    invoke-interface {v8}, Lw4/e;->size()I

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    if-nez v9, :cond_d

    .line 536
    .line 537
    sget-object v8, Lu4/p;->i:Lu4/p;

    .line 538
    .line 539
    const/4 v12, 0x0

    .line 540
    goto :goto_b

    .line 541
    :cond_d
    const/4 v12, 0x0

    .line 542
    invoke-interface {v8, v12}, Lw4/e;->getType(I)Lw4/c;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    invoke-static {v12, v8, v10}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-static {v8}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    :goto_b
    new-instance v9, Lu4/m;

    .line 555
    .line 556
    invoke-direct {v9, v3, v2, v10, v8}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7, v12, v9}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    iput-boolean v12, v7, Lz4/j;->g:Z

    .line 563
    .line 564
    new-instance v2, Lu4/b;

    .line 565
    .line 566
    sget-object v3, Lz4/g;->k:Lz4/g;

    .line 567
    .line 568
    const/4 v8, -0x1

    .line 569
    invoke-direct {v2, v6, v7, v3, v8}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v2, v3}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 573
    .line 574
    .line 575
    :goto_c
    iget-boolean v2, v1, Li4/z;->k:Z

    .line 576
    .line 577
    const/4 v3, 0x4

    .line 578
    if-nez v2, :cond_e

    .line 579
    .line 580
    goto/16 :goto_d

    .line 581
    .line 582
    :cond_e
    invoke-virtual {v4, v12}, Li4/m;->f(I)Lu4/t;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    sget-object v6, Lw4/c;->H:Lw4/c;

    .line 587
    .line 588
    invoke-static {v12, v6, v10}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    new-instance v8, Lh4/u;

    .line 593
    .line 594
    const/4 v9, 0x2

    .line 595
    invoke-direct {v8, v9}, Lz4/e;-><init>(I)V

    .line 596
    .line 597
    .line 598
    new-instance v9, Lu4/m;

    .line 599
    .line 600
    new-instance v11, Lu4/r;

    .line 601
    .line 602
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    sget-object v13, Lw4/b;->i:Lw4/b;

    .line 606
    .line 607
    invoke-direct {v11, v3, v6, v13, v10}, Lu4/r;-><init>(ILw4/c;Lw4/e;Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    sget-object v6, Lu4/p;->i:Lu4/p;

    .line 611
    .line 612
    invoke-direct {v9, v11, v2, v7, v6}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v8, v12, v9}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    new-instance v6, Lu4/u;

    .line 619
    .line 620
    sget-object v9, Lu4/s;->F1:Lu4/r;

    .line 621
    .line 622
    iget-object v4, v4, Li4/m;->c:Lh4/c;

    .line 623
    .line 624
    iget v4, v4, Lh4/c;->b:I

    .line 625
    .line 626
    add-int v11, v14, v4

    .line 627
    .line 628
    if-ge v11, v0, :cond_f

    .line 629
    .line 630
    move v11, v0

    .line 631
    :cond_f
    sget-object v4, Lw4/c;->E:Lw4/c;

    .line 632
    .line 633
    invoke-static {v11, v4, v10}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    invoke-static {v4}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    invoke-direct {v6, v9, v2, v4, v13}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v8, v0, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    const/4 v12, 0x0

    .line 648
    iput-boolean v12, v8, Lz4/j;->g:Z

    .line 649
    .line 650
    const/4 v4, -0x7

    .line 651
    invoke-virtual {v1, v4}, Li4/z;->f(I)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    new-instance v6, Lu4/b;

    .line 656
    .line 657
    const/4 v9, -0x6

    .line 658
    invoke-virtual {v1, v9}, Li4/z;->f(I)I

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    invoke-static {v4}, Lz4/g;->o(I)Lz4/g;

    .line 663
    .line 664
    .line 665
    move-result-object v11

    .line 666
    invoke-direct {v6, v9, v8, v11, v4}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 667
    .line 668
    .line 669
    sget-object v8, Lz4/g;->k:Lz4/g;

    .line 670
    .line 671
    invoke-virtual {v1, v6, v8}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 672
    .line 673
    .line 674
    new-instance v6, Lh4/u;

    .line 675
    .line 676
    invoke-direct {v6, v0}, Lz4/e;-><init>(I)V

    .line 677
    .line 678
    .line 679
    new-instance v9, Lu4/u;

    .line 680
    .line 681
    sget-object v11, Lu4/s;->D1:Lu4/r;

    .line 682
    .line 683
    invoke-static {v7}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 684
    .line 685
    .line 686
    move-result-object v7

    .line 687
    invoke-direct {v9, v11, v2, v7, v13}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 688
    .line 689
    .line 690
    const/4 v12, 0x0

    .line 691
    invoke-virtual {v6, v12, v9}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    iput-boolean v12, v6, Lz4/j;->g:Z

    .line 695
    .line 696
    new-instance v2, Lu4/b;

    .line 697
    .line 698
    const/4 v7, -0x1

    .line 699
    invoke-direct {v2, v4, v6, v8, v7}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v2, v8}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 703
    .line 704
    .line 705
    :goto_d
    iget-object v2, v1, Li4/z;->j:[Li4/l;

    .line 706
    .line 707
    array-length v4, v2

    .line 708
    const/4 v6, 0x0

    .line 709
    :goto_e
    if-ge v6, v4, :cond_11

    .line 710
    .line 711
    aget-object v7, v2, v6

    .line 712
    .line 713
    if-eqz v7, :cond_10

    .line 714
    .line 715
    iget-object v7, v7, Li4/l;->g:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v7, Ljava/util/HashMap;

    .line 718
    .line 719
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 724
    .line 725
    .line 726
    move-result-object v7

    .line 727
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 728
    .line 729
    .line 730
    move-result v8

    .line 731
    if-eqz v8, :cond_10

    .line 732
    .line 733
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v8

    .line 737
    check-cast v8, Li4/w;

    .line 738
    .line 739
    invoke-virtual {v1, v6}, Li4/z;->j(I)Lu4/b;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    iget-object v9, v9, Lu4/b;->b:Lh4/u;

    .line 744
    .line 745
    const/4 v12, 0x0

    .line 746
    invoke-virtual {v9, v12}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v9

    .line 750
    check-cast v9, Lu4/i;

    .line 751
    .line 752
    iget-object v9, v9, Lu4/i;->h:Lu4/t;

    .line 753
    .line 754
    new-instance v11, Lh4/u;

    .line 755
    .line 756
    const/4 v12, 0x2

    .line 757
    invoke-direct {v11, v12}, Lz4/e;-><init>(I)V

    .line 758
    .line 759
    .line 760
    new-instance v13, Lu4/m;

    .line 761
    .line 762
    iget-object v15, v8, Li4/w;->a:Lw4/c;

    .line 763
    .line 764
    new-instance v12, Lu4/r;

    .line 765
    .line 766
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    sget-object v0, Lw4/b;->i:Lw4/b;

    .line 770
    .line 771
    invoke-direct {v12, v3, v15, v0, v10}, Lu4/r;-><init>(ILw4/c;Lw4/e;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    iget-object v0, v8, Li4/w;->a:Lw4/c;

    .line 775
    .line 776
    invoke-static {v14, v0, v10}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    sget-object v15, Lu4/p;->i:Lu4/p;

    .line 781
    .line 782
    invoke-direct {v13, v12, v9, v0, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 783
    .line 784
    .line 785
    const/4 v12, 0x0

    .line 786
    invoke-virtual {v11, v12, v13}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    new-instance v0, Lu4/m;

    .line 790
    .line 791
    sget-object v13, Lu4/s;->s:Lu4/r;

    .line 792
    .line 793
    invoke-direct {v0, v13, v9, v10, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 794
    .line 795
    .line 796
    const/4 v9, 0x1

    .line 797
    invoke-virtual {v11, v9, v0}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    iput-boolean v12, v11, Lz4/j;->g:Z

    .line 801
    .line 802
    new-instance v0, Lu4/b;

    .line 803
    .line 804
    iget v8, v8, Li4/w;->b:I

    .line 805
    .line 806
    invoke-static {v6}, Lz4/g;->o(I)Lz4/g;

    .line 807
    .line 808
    .line 809
    move-result-object v9

    .line 810
    invoke-direct {v0, v8, v11, v9, v6}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 811
    .line 812
    .line 813
    aget-object v8, v5, v6

    .line 814
    .line 815
    iget-object v8, v8, Lb5/c;->c:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v8, Lz4/g;

    .line 818
    .line 819
    invoke-virtual {v1, v0, v8}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 820
    .line 821
    .line 822
    const/4 v0, 0x1

    .line 823
    goto :goto_f

    .line 824
    :cond_10
    add-int/lit8 v6, v6, 0x1

    .line 825
    .line 826
    const/4 v0, 0x1

    .line 827
    goto :goto_e

    .line 828
    :cond_11
    iget-boolean v0, v1, Li4/z;->m:Z

    .line 829
    .line 830
    if-eqz v0, :cond_18

    .line 831
    .line 832
    new-instance v0, Lz4/g;

    .line 833
    .line 834
    invoke-direct {v0, v3}, Lz4/g;-><init>(I)V

    .line 835
    .line 836
    .line 837
    new-instance v2, Li4/l;

    .line 838
    .line 839
    invoke-direct {v2, v1, v0}, Li4/l;-><init>(Li4/z;Lz4/g;)V

    .line 840
    .line 841
    .line 842
    const/4 v12, 0x0

    .line 843
    invoke-virtual {v1, v12}, Li4/z;->j(I)Lu4/b;

    .line 844
    .line 845
    .line 846
    move-result-object v3

    .line 847
    new-instance v4, Ljava/util/BitSet;

    .line 848
    .line 849
    move/from16 v6, v19

    .line 850
    .line 851
    invoke-direct {v4, v6}, Ljava/util/BitSet;-><init>(I)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1, v3, v2, v4}, Li4/z;->d(Lu4/b;Lu4/a;Ljava/util/BitSet;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v1}, Li4/z;->e()I

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    new-instance v3, Ljava/util/ArrayList;

    .line 862
    .line 863
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 864
    .line 865
    .line 866
    move v4, v12

    .line 867
    :goto_10
    if-ge v4, v2, :cond_12

    .line 868
    .line 869
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    add-int/lit8 v4, v4, 0x1

    .line 873
    .line 874
    goto :goto_10

    .line 875
    :cond_12
    move v2, v12

    .line 876
    :goto_11
    iget-object v4, v1, Li4/z;->h:Ljava/util/ArrayList;

    .line 877
    .line 878
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 879
    .line 880
    .line 881
    move-result v5

    .line 882
    iget-object v7, v1, Li4/z;->i:Ljava/util/ArrayList;

    .line 883
    .line 884
    if-ge v2, v5, :cond_14

    .line 885
    .line 886
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    check-cast v4, Lu4/b;

    .line 891
    .line 892
    if-nez v4, :cond_13

    .line 893
    .line 894
    goto :goto_12

    .line 895
    :cond_13
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v5

    .line 899
    check-cast v5, Lz4/g;

    .line 900
    .line 901
    iget v4, v4, Lu4/b;->a:I

    .line 902
    .line 903
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    :goto_12
    add-int/lit8 v2, v2, 0x1

    .line 907
    .line 908
    goto :goto_11

    .line 909
    :cond_14
    iget v2, v0, Lz4/g;->i:I

    .line 910
    .line 911
    :goto_13
    if-ge v12, v2, :cond_15

    .line 912
    .line 913
    invoke-virtual {v0, v12}, Lz4/g;->n(I)I

    .line 914
    .line 915
    .line 916
    move-result v5

    .line 917
    new-instance v8, Li4/y;

    .line 918
    .line 919
    new-instance v9, Li4/i;

    .line 920
    .line 921
    invoke-virtual {v1}, Li4/z;->e()I

    .line 922
    .line 923
    .line 924
    move-result v10

    .line 925
    invoke-direct {v9, v10}, Li4/i;-><init>(I)V

    .line 926
    .line 927
    .line 928
    invoke-direct {v8, v1, v9, v3}, Li4/y;-><init>(Li4/z;Li4/i;Ljava/util/ArrayList;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v1, v5}, Li4/z;->j(I)Lu4/b;

    .line 932
    .line 933
    .line 934
    move-result-object v5

    .line 935
    invoke-virtual {v8, v5}, Li4/y;->a(Lu4/b;)V

    .line 936
    .line 937
    .line 938
    add-int/lit8 v12, v12, 0x1

    .line 939
    .line 940
    goto :goto_13

    .line 941
    :cond_15
    new-instance v0, Lz4/g;

    .line 942
    .line 943
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    invoke-direct {v0, v2}, Lz4/g;-><init>(I)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 951
    .line 952
    .line 953
    const/4 v7, -0x1

    .line 954
    invoke-virtual {v1, v7}, Li4/z;->f(I)I

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    new-instance v3, Landroidx/lifecycle/x;

    .line 959
    .line 960
    const/16 v5, 0x19

    .line 961
    .line 962
    invoke-direct {v3, v0, v5}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v1, v2}, Li4/z;->j(I)Lu4/b;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    new-instance v5, Ljava/util/BitSet;

    .line 970
    .line 971
    invoke-direct {v5, v6}, Ljava/util/BitSet;-><init>(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1, v2, v3, v5}, Li4/z;->d(Lu4/b;Lu4/a;Ljava/util/BitSet;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0}, Lz4/g;->s()V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 981
    .line 982
    .line 983
    move-result v2

    .line 984
    const/16 v19, 0x1

    .line 985
    .line 986
    add-int/lit8 v2, v2, -0x1

    .line 987
    .line 988
    :goto_14
    if-ltz v2, :cond_18

    .line 989
    .line 990
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v3

    .line 994
    check-cast v3, Lu4/b;

    .line 995
    .line 996
    iget v3, v3, Lu4/b;->a:I

    .line 997
    .line 998
    invoke-virtual {v0, v3}, Lz4/g;->m(I)I

    .line 999
    .line 1000
    .line 1001
    move-result v8

    .line 1002
    if-ltz v8, :cond_16

    .line 1003
    .line 1004
    goto :goto_15

    .line 1005
    :cond_16
    move v8, v7

    .line 1006
    :goto_15
    if-gez v8, :cond_17

    .line 1007
    .line 1008
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    :cond_17
    add-int/lit8 v2, v2, -0x1

    .line 1012
    .line 1013
    goto :goto_14

    .line 1014
    :cond_18
    return-void

    .line 1015
    :cond_19
    move/from16 v6, v19

    .line 1016
    .line 1017
    const/4 v7, -0x1

    .line 1018
    const/4 v12, 0x0

    .line 1019
    move/from16 v19, v0

    .line 1020
    .line 1021
    invoke-static {v2, v3}, Lx6/d;->q([II)V

    .line 1022
    .line 1023
    .line 1024
    iget-object v0, v1, Li4/z;->b:Li4/e;

    .line 1025
    .line 1026
    invoke-virtual {v0, v3}, Lz4/i;->p(I)I

    .line 1027
    .line 1028
    .line 1029
    move-result v8

    .line 1030
    if-ltz v8, :cond_1a

    .line 1031
    .line 1032
    invoke-virtual {v0, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    check-cast v0, Li4/d;

    .line 1037
    .line 1038
    aget-object v8, v5, v3

    .line 1039
    .line 1040
    :try_start_0
    invoke-virtual {v1, v0, v8, v2}, Li4/z;->m(Li4/d;Lb5/c;[I)V
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 1041
    .line 1042
    .line 1043
    move/from16 v0, v19

    .line 1044
    .line 1045
    move/from16 v19, v6

    .line 1046
    .line 1047
    goto/16 :goto_a

    .line 1048
    .line 1049
    :catch_0
    move-exception v0

    .line 1050
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    const-string v3, "...while working on block "

    .line 1055
    .line 1056
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v2

    .line 1060
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    throw v0

    .line 1064
    :cond_1a
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    const-string v2, "no such label: "

    .line 1069
    .line 1070
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    return-void
.end method

.method public final d(Lu4/b;Lu4/a;Ljava/util/BitSet;)V
    .locals 5

    .line 1
    invoke-interface {p2, p1}, Lu4/a;->d(Lu4/b;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lu4/b;->a:I

    .line 5
    .line 6
    invoke-virtual {p3, v0}, Ljava/util/BitSet;->set(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lu4/b;->c:Lz4/g;

    .line 10
    .line 11
    iget v1, v0, Lz4/g;->i:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lz4/g;->n(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p3, v3}, Ljava/util/BitSet;->get(I)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Li4/z;->h(Lu4/b;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    if-lez v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p0, v3}, Li4/z;->k(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ltz v3, :cond_2

    .line 41
    .line 42
    iget-object v4, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lu4/b;

    .line 49
    .line 50
    invoke-virtual {p0, v3, p2, p3}, Li4/z;->d(Lu4/b;Lu4/a;Ljava/util/BitSet;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return-void
.end method

.method public final e()I
    .locals 3

    .line 1
    iget-object v0, p0, Li4/z;->a:Li4/m;

    .line 2
    .line 3
    iget-object v0, v0, Li4/m;->c:Lh4/c;

    .line 4
    .line 5
    iget-object v0, v0, Lh4/c;->e:Li4/g;

    .line 6
    .line 7
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    iget v1, p0, Li4/z;->d:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    add-int/lit8 v1, v1, 0x7

    .line 14
    .line 15
    iget-object v0, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lu4/b;

    .line 32
    .line 33
    iget v2, v2, Lu4/b;->a:I

    .line 34
    .line 35
    if-lt v2, v1, :cond_0

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    move v1, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return v1
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li4/z;->a:Li4/m;

    .line 2
    .line 3
    iget-object v0, v0, Li4/m;->c:Lh4/c;

    .line 4
    .line 5
    iget-object v0, v0, Lh4/c;->e:Li4/g;

    .line 6
    .line 7
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    iget v1, p0, Li4/z;->d:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    not-int p1, p1

    .line 14
    add-int/2addr v1, p1

    .line 15
    return v1
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li4/z;->a:Li4/m;

    .line 2
    .line 3
    iget-object v0, v0, Li4/m;->a:Ll4/b;

    .line 4
    .line 5
    invoke-interface {v0}, Ll4/a;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final h(Lu4/b;)Z
    .locals 4

    .line 1
    iget-object p1, p1, Lu4/b;->c:Lz4/g;

    .line 2
    .line 3
    iget v0, p1, Lz4/g;->i:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Lz4/g;->n(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v1, p0, Li4/z;->l:[Lf1/h;

    .line 16
    .line 17
    array-length v3, v1

    .line 18
    if-ge p1, v3, :cond_1

    .line 19
    .line 20
    aget-object p1, v1, p1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return v2
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li4/z;->a:Li4/m;

    .line 2
    .line 3
    iget-object v0, v0, Li4/m;->a:Ll4/b;

    .line 4
    .line 5
    invoke-interface {v0}, Ll4/a;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    and-int/lit8 v0, v0, 0x20

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final j(I)Lu4/b;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Li4/z;->k(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lu4/b;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "no such label "

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method public final k(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lu4/b;

    .line 15
    .line 16
    iget v3, v3, Lu4/b;->a:I

    .line 17
    .line 18
    if-ne v3, p1, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, -0x1

    .line 25
    return p1
.end method

.method public final l(IILf1/h;Lb5/c;[I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    iget-object v5, v3, Lb5/c;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, Lz4/g;

    .line 14
    .line 15
    iget-object v6, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v6, Li4/n;

    .line 18
    .line 19
    iget-object v7, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v7, Li4/s;

    .line 22
    .line 23
    move-object/from16 v8, p0

    .line 24
    .line 25
    iget-object v9, v8, Li4/z;->g:[Lb5/c;

    .line 26
    .line 27
    aget-object v10, v9, v0

    .line 28
    .line 29
    if-eqz v10, :cond_7

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget v2, v2, Lf1/h;->h:I

    .line 34
    .line 35
    invoke-virtual {v10, v2, v1, v3}, Lb5/c;->F(IILb5/c;)Lb5/c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_3

    .line 40
    :cond_0
    iget-object v1, v10, Lb5/c;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Li4/s;

    .line 43
    .line 44
    invoke-virtual {v1, v7}, Li4/s;->q(Li4/s;)Li4/s;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v3, v10, Lb5/c;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Li4/n;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-static {v3, v6}, Lx6/d;->N(Li4/n;Li4/n;)Li4/n;

    .line 56
    .line 57
    .line 58
    move-result-object v6
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    iget-object v7, v10, Lb5/c;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lz4/g;

    .line 62
    .line 63
    invoke-virtual {v7, v5}, Lz4/g;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    if-eqz v11, :cond_1

    .line 68
    .line 69
    move-object v11, v7

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v11, Lz4/g;

    .line 72
    .line 73
    const/4 v12, 0x4

    .line 74
    invoke-direct {v11, v12}, Lz4/g;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iget v12, v7, Lz4/g;->i:I

    .line 78
    .line 79
    iget v13, v5, Lz4/g;->i:I

    .line 80
    .line 81
    const/4 v15, 0x0

    .line 82
    :goto_0
    if-ge v15, v12, :cond_2

    .line 83
    .line 84
    if-ge v15, v13, :cond_2

    .line 85
    .line 86
    invoke-virtual {v7, v15}, Lz4/g;->n(I)I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    invoke-virtual {v5, v15}, Lz4/g;->n(I)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-ne v14, v8, :cond_2

    .line 95
    .line 96
    invoke-virtual {v11, v15}, Lz4/g;->l(I)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v15, v15, 0x1

    .line 100
    .line 101
    move-object/from16 v8, p0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    const/4 v5, 0x0

    .line 105
    iput-boolean v5, v11, Lz4/j;->g:Z

    .line 106
    .line 107
    :goto_1
    instance-of v5, v2, Li4/t;

    .line 108
    .line 109
    if-nez v5, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    check-cast v2, Li4/t;

    .line 113
    .line 114
    iget v5, v11, Lz4/g;->i:I

    .line 115
    .line 116
    if-nez v5, :cond_4

    .line 117
    .line 118
    iget-object v2, v2, Li4/t;->h:Li4/u;

    .line 119
    .line 120
    :cond_4
    :goto_2
    if-ne v2, v1, :cond_5

    .line 121
    .line 122
    if-ne v6, v3, :cond_5

    .line 123
    .line 124
    if-ne v7, v11, :cond_5

    .line 125
    .line 126
    move-object v1, v10

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    new-instance v1, Lb5/c;

    .line 129
    .line 130
    invoke-direct {v1, v2, v6, v11}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    if-eq v1, v10, :cond_6

    .line 134
    .line 135
    aput-object v1, v9, v0

    .line 136
    .line 137
    invoke-static {v4, v0}, Lx6/d;->g0([II)V

    .line 138
    .line 139
    .line 140
    :cond_6
    return-void

    .line 141
    :catch_0
    move-exception v0

    .line 142
    const-string v1, "underlay stack:"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v0}, Li4/n;->l(Li4/b0;)V

    .line 148
    .line 149
    .line 150
    const-string v1, "overlay stack:"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v0}, Li4/n;->l(Li4/b0;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_7
    if-eqz v2, :cond_8

    .line 160
    .line 161
    invoke-virtual {v5}, Lz4/g;->p()Lz4/g;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2, v0}, Lz4/g;->l(I)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Lb5/c;

    .line 169
    .line 170
    invoke-virtual {v7}, Li4/s;->o()Li4/u;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-static {v0}, Lz4/g;->o(I)Lz4/g;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-direct {v2, v5, v6, v7}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v0, v1, v3}, Lb5/c;->F(IILb5/c;)Lb5/c;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    aput-object v1, v9, v0

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_8
    aput-object v3, v9, v0

    .line 189
    .line 190
    :goto_4
    invoke-static {v4, v0}, Lx6/d;->g0([II)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final m(Li4/d;Lb5/c;[I)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v7, v0, Li4/d;->e:Li4/g;

    .line 8
    .line 9
    iget v8, v0, Li4/d;->a:I

    .line 10
    .line 11
    iget-object v3, v7, Lz4/e;->h:[Ljava/lang/Object;

    .line 12
    .line 13
    array-length v3, v3

    .line 14
    const/4 v9, 0x0

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    sget-object v3, Lw4/b;->i:Lw4/b;

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance v4, Lw4/b;

    .line 21
    .line 22
    invoke-direct {v4, v3}, Lz4/e;-><init>(I)V

    .line 23
    .line 24
    .line 25
    move v5, v9

    .line 26
    :goto_0
    if-ge v5, v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v7, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Li4/f;

    .line 33
    .line 34
    iget-object v6, v6, Li4/f;->d:Lv4/d0;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget-object v6, Lv4/d0;->j:Lv4/d0;

    .line 40
    .line 41
    :goto_1
    iget-object v6, v6, Lv4/d0;->g:Lw4/c;

    .line 42
    .line 43
    invoke-virtual {v4, v5, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-boolean v9, v4, Lz4/j;->g:Z

    .line 50
    .line 51
    move-object v3, v4

    .line 52
    :goto_2
    iget-object v10, v1, Li4/z;->e:Li4/a0;

    .line 53
    .line 54
    iput-object v3, v10, Li4/a0;->u:Lw4/b;

    .line 55
    .line 56
    iget-object v11, v10, Li4/a0;->t:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    iput-boolean v9, v10, Li4/a0;->v:Z

    .line 62
    .line 63
    iput-boolean v9, v10, Li4/a0;->w:Z

    .line 64
    .line 65
    iput v9, v10, Li4/a0;->x:I

    .line 66
    .line 67
    iput v9, v10, Li4/a0;->y:I

    .line 68
    .line 69
    iput-boolean v9, v10, Li4/a0;->A:Z

    .line 70
    .line 71
    iput-boolean v9, v10, Li4/a0;->z:Z

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    iput-object v12, v10, Li4/a0;->B:Li4/v;

    .line 75
    .line 76
    new-instance v5, Lb5/c;

    .line 77
    .line 78
    iget-object v3, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Li4/s;

    .line 81
    .line 82
    invoke-virtual {v3}, Li4/s;->m()Li4/s;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget-object v4, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Li4/n;

    .line 89
    .line 90
    invoke-virtual {v4}, Li4/n;->n()Li4/n;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v2, v2, Lb5/c;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Lz4/g;

    .line 97
    .line 98
    invoke-direct {v5, v3, v4, v2}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v5, Lb5/c;->a:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v13, v2

    .line 104
    check-cast v13, Li4/s;

    .line 105
    .line 106
    iget-object v2, v5, Lb5/c;->b:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v14, v2

    .line 109
    check-cast v14, Li4/n;

    .line 110
    .line 111
    iget-object v2, v5, Lb5/c;->c:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v15, v2

    .line 114
    check-cast v15, Lz4/g;

    .line 115
    .line 116
    iget-object v2, v1, Li4/z;->f:Li4/c0;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget v3, v0, Li4/d;->c:I

    .line 122
    .line 123
    iget-object v4, v2, Li4/c0;->e:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Lf1/h;

    .line 126
    .line 127
    iput-object v5, v4, Lf1/h;->j:Ljava/lang/Object;

    .line 128
    .line 129
    :try_start_0
    iget v6, v0, Li4/d;->b:I

    .line 130
    .line 131
    :goto_3
    if-ge v6, v3, :cond_3

    .line 132
    .line 133
    move-object/from16 v16, v12

    .line 134
    .line 135
    iget-object v12, v2, Li4/c0;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v12, Li4/l;

    .line 138
    .line 139
    invoke-virtual {v12, v6, v4}, Li4/l;->a(ILi4/k;)I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    iput v6, v4, Lf1/h;->h:I
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    add-int/2addr v6, v12

    .line 146
    move-object/from16 v12, v16

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :catch_0
    move-exception v0

    .line 150
    goto/16 :goto_23

    .line 151
    .line 152
    :cond_3
    move-object/from16 v16, v12

    .line 153
    .line 154
    invoke-virtual {v13}, Lz4/j;->i()V

    .line 155
    .line 156
    .line 157
    iput-boolean v9, v14, Lz4/j;->g:Z

    .line 158
    .line 159
    iget v12, v10, Li4/a0;->y:I

    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iget-object v3, v7, Lz4/e;->h:[Ljava/lang/Object;

    .line 166
    .line 167
    array-length v3, v3

    .line 168
    iget-object v4, v0, Li4/d;->d:Lz4/g;

    .line 169
    .line 170
    iget-boolean v6, v10, Li4/a0;->z:Z

    .line 171
    .line 172
    iget-object v9, v1, Li4/z;->l:[Lf1/h;

    .line 173
    .line 174
    move-object/from16 p2, v9

    .line 175
    .line 176
    const/4 v9, 0x1

    .line 177
    if-eqz v6, :cond_5

    .line 178
    .line 179
    invoke-virtual {v4, v9}, Lz4/g;->n(I)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    aget-object v18, p2, v6

    .line 184
    .line 185
    if-nez v18, :cond_4

    .line 186
    .line 187
    move/from16 v18, v9

    .line 188
    .line 189
    new-instance v9, Lf1/h;

    .line 190
    .line 191
    invoke-direct {v9, v1, v6}, Lf1/h;-><init>(Li4/z;I)V

    .line 192
    .line 193
    .line 194
    aput-object v9, p2, v6

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_4
    move/from16 v18, v9

    .line 198
    .line 199
    :goto_4
    aget-object v9, p2, v6

    .line 200
    .line 201
    iget-object v9, v9, Lf1/h;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v9, Ljava/util/BitSet;

    .line 204
    .line 205
    invoke-virtual {v9, v8}, Ljava/util/BitSet;->set(I)V

    .line 206
    .line 207
    .line 208
    aget-object v6, p2, v6

    .line 209
    .line 210
    move-object/from16 v1, p3

    .line 211
    .line 212
    move/from16 v19, v2

    .line 213
    .line 214
    move/from16 v21, v3

    .line 215
    .line 216
    move-object v9, v4

    .line 217
    move-object/from16 v20, v5

    .line 218
    .line 219
    move-object v4, v6

    .line 220
    move/from16 v29, v8

    .line 221
    .line 222
    move/from16 v28, v12

    .line 223
    .line 224
    move/from16 v2, v18

    .line 225
    .line 226
    goto/16 :goto_c

    .line 227
    .line 228
    :cond_5
    move/from16 v18, v9

    .line 229
    .line 230
    iget-object v6, v10, Li4/a0;->B:Li4/v;

    .line 231
    .line 232
    if-eqz v6, :cond_e

    .line 233
    .line 234
    iget v4, v6, Li4/v;->g:I

    .line 235
    .line 236
    aget-object v6, p2, v4

    .line 237
    .line 238
    if-nez v6, :cond_6

    .line 239
    .line 240
    new-instance v6, Lf1/h;

    .line 241
    .line 242
    invoke-direct {v6, v1, v4}, Lf1/h;-><init>(Li4/z;I)V

    .line 243
    .line 244
    .line 245
    iget-object v9, v6, Lf1/h;->j:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v9, Ljava/util/BitSet;

    .line 248
    .line 249
    invoke-virtual {v9, v8}, Ljava/util/BitSet;->set(I)V

    .line 250
    .line 251
    .line 252
    aput-object v6, p2, v4

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_6
    iget-object v6, v6, Lf1/h;->j:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v6, Ljava/util/BitSet;

    .line 258
    .line 259
    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    .line 260
    .line 261
    .line 262
    :goto_5
    aget-object v6, p2, v4

    .line 263
    .line 264
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v9, Lz4/g;

    .line 268
    .line 269
    iget-object v1, v6, Lf1/h;->i:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v1, Ljava/util/BitSet;

    .line 272
    .line 273
    move/from16 v19, v2

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    invoke-direct {v9, v2}, Lz4/g;-><init>(I)V

    .line 280
    .line 281
    .line 282
    const/4 v2, 0x0

    .line 283
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 284
    .line 285
    .line 286
    move-result v17

    .line 287
    move/from16 v2, v17

    .line 288
    .line 289
    :goto_6
    if-ltz v2, :cond_7

    .line 290
    .line 291
    move/from16 v21, v3

    .line 292
    .line 293
    iget-object v3, v6, Lf1/h;->k:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v3, Li4/z;

    .line 296
    .line 297
    invoke-virtual {v3, v2}, Li4/z;->j(I)Lu4/b;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    iget-object v3, v3, Lu4/b;->c:Lz4/g;

    .line 302
    .line 303
    move/from16 v17, v2

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    invoke-virtual {v3, v2}, Lz4/g;->n(I)I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    invoke-virtual {v9, v3}, Lz4/g;->l(I)V

    .line 311
    .line 312
    .line 313
    add-int/lit8 v3, v17, 0x1

    .line 314
    .line 315
    invoke-virtual {v1, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    move v2, v3

    .line 320
    move/from16 v3, v21

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_7
    move/from16 v21, v3

    .line 324
    .line 325
    const/4 v2, 0x0

    .line 326
    iput-boolean v2, v9, Lz4/j;->g:Z

    .line 327
    .line 328
    aget-object v1, p2, v4

    .line 329
    .line 330
    iget-object v3, v1, Lf1/h;->i:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v3, Ljava/util/BitSet;

    .line 333
    .line 334
    iget-object v4, v1, Lf1/h;->k:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v4, Li4/z;

    .line 337
    .line 338
    invoke-virtual {v3, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 339
    .line 340
    .line 341
    move-result v6

    .line 342
    :goto_7
    if-ltz v6, :cond_d

    .line 343
    .line 344
    move-object/from16 v20, v5

    .line 345
    .line 346
    invoke-virtual {v4, v6}, Li4/z;->j(I)Lu4/b;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    iget-object v5, v5, Lu4/b;->c:Lz4/g;

    .line 351
    .line 352
    invoke-virtual {v5, v2}, Lz4/g;->n(I)I

    .line 353
    .line 354
    .line 355
    move-result v23

    .line 356
    iget v2, v1, Lf1/h;->h:I

    .line 357
    .line 358
    const-string v5, "returning from invalid subroutine"

    .line 359
    .line 360
    move-object/from16 p2, v1

    .line 361
    .line 362
    instance-of v1, v13, Li4/t;

    .line 363
    .line 364
    if-eqz v1, :cond_9

    .line 365
    .line 366
    move-object v1, v13

    .line 367
    check-cast v1, Li4/t;

    .line 368
    .line 369
    iget-object v1, v1, Li4/t;->i:Ljava/util/ArrayList;

    .line 370
    .line 371
    move-object/from16 v22, v4

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-lt v6, v4, :cond_8

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_8
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Li4/s;

    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_9
    move-object/from16 v22, v4

    .line 388
    .line 389
    :goto_8
    move-object/from16 v1, v16

    .line 390
    .line 391
    :goto_9
    :try_start_1
    invoke-virtual {v15}, Lz4/g;->p()Lz4/g;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-virtual {v4}, Lz4/j;->j()V

    .line 396
    .line 397
    .line 398
    move/from16 v28, v12

    .line 399
    .line 400
    iget v12, v4, Lz4/g;->i:I

    .line 401
    .line 402
    add-int/lit8 v12, v12, -0x1

    .line 403
    .line 404
    invoke-virtual {v4, v12}, Lz4/g;->n(I)I

    .line 405
    .line 406
    .line 407
    move-result v12

    .line 408
    move/from16 v29, v8

    .line 409
    .line 410
    iget v8, v4, Lz4/g;->i:I

    .line 411
    .line 412
    add-int/lit8 v8, v8, -0x1

    .line 413
    .line 414
    iput v8, v4, Lz4/g;->i:I

    .line 415
    .line 416
    if-ne v12, v2, :cond_c

    .line 417
    .line 418
    const/4 v2, 0x0

    .line 419
    iput-boolean v2, v4, Lz4/j;->g:Z
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 420
    .line 421
    if-nez v1, :cond_a

    .line 422
    .line 423
    move-object/from16 v26, v16

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_a
    new-instance v2, Lb5/c;

    .line 427
    .line 428
    invoke-direct {v2, v1, v14, v4}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 429
    .line 430
    .line 431
    move-object/from16 v26, v2

    .line 432
    .line 433
    :goto_a
    if-eqz v26, :cond_b

    .line 434
    .line 435
    const/16 v24, -0x1

    .line 436
    .line 437
    const/16 v25, 0x0

    .line 438
    .line 439
    move-object/from16 v27, p3

    .line 440
    .line 441
    invoke-virtual/range {v22 .. v27}, Li4/z;->l(IILf1/h;Lb5/c;[I)V

    .line 442
    .line 443
    .line 444
    move-object/from16 v1, p3

    .line 445
    .line 446
    goto :goto_b

    .line 447
    :cond_b
    move-object/from16 v1, p3

    .line 448
    .line 449
    invoke-static {v1, v6}, Lx6/d;->g0([II)V

    .line 450
    .line 451
    .line 452
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 453
    .line 454
    invoke-virtual {v3, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    move-object/from16 v1, p2

    .line 459
    .line 460
    move-object/from16 v5, v20

    .line 461
    .line 462
    move-object/from16 v4, v22

    .line 463
    .line 464
    move/from16 v12, v28

    .line 465
    .line 466
    move/from16 v8, v29

    .line 467
    .line 468
    const/4 v2, 0x0

    .line 469
    goto :goto_7

    .line 470
    :cond_c
    :try_start_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 471
    .line 472
    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    throw v0
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    .line 476
    :catch_1
    const-string v0, "can\'t return from non-subroutine"

    .line 477
    .line 478
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :catch_2
    invoke-static {v5}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :cond_d
    move-object/from16 v1, p3

    .line 487
    .line 488
    move-object/from16 v20, v5

    .line 489
    .line 490
    move/from16 v29, v8

    .line 491
    .line 492
    move/from16 v28, v12

    .line 493
    .line 494
    iget v2, v9, Lz4/g;->i:I

    .line 495
    .line 496
    move-object/from16 v4, v16

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_e
    move-object/from16 v1, p3

    .line 500
    .line 501
    move/from16 v19, v2

    .line 502
    .line 503
    move/from16 v21, v3

    .line 504
    .line 505
    move-object/from16 v20, v5

    .line 506
    .line 507
    move/from16 v29, v8

    .line 508
    .line 509
    move/from16 v28, v12

    .line 510
    .line 511
    iget-boolean v2, v10, Li4/a0;->v:Z

    .line 512
    .line 513
    if-eqz v2, :cond_f

    .line 514
    .line 515
    move-object v9, v4

    .line 516
    move-object/from16 v4, v16

    .line 517
    .line 518
    move/from16 v2, v21

    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_f
    move-object v9, v4

    .line 522
    move-object/from16 v4, v16

    .line 523
    .line 524
    const/4 v2, 0x0

    .line 525
    :goto_c
    iget v8, v9, Lz4/g;->i:I

    .line 526
    .line 527
    move v12, v2

    .line 528
    :goto_d
    if-ge v12, v8, :cond_10

    .line 529
    .line 530
    invoke-virtual {v9, v12}, Lz4/g;->n(I)I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    :try_start_3
    iget v3, v0, Li4/d;->a:I
    :try_end_3
    .catch Li4/b0; {:try_start_3 .. :try_end_3} :catch_4

    .line 535
    .line 536
    move-object v6, v1

    .line 537
    move/from16 v22, v8

    .line 538
    .line 539
    move/from16 v8, v19

    .line 540
    .line 541
    move-object/from16 v5, v20

    .line 542
    .line 543
    move-object/from16 v1, p0

    .line 544
    .line 545
    move-object/from16 v19, v9

    .line 546
    .line 547
    move/from16 v9, v21

    .line 548
    .line 549
    :try_start_4
    invoke-virtual/range {v1 .. v6}, Li4/z;->l(IILf1/h;Lb5/c;[I)V
    :try_end_4
    .catch Li4/b0; {:try_start_4 .. :try_end_4} :catch_3

    .line 550
    .line 551
    .line 552
    move-object/from16 v20, v5

    .line 553
    .line 554
    add-int/lit8 v12, v12, 0x1

    .line 555
    .line 556
    move-object/from16 v1, p3

    .line 557
    .line 558
    move/from16 v21, v9

    .line 559
    .line 560
    move-object/from16 v9, v19

    .line 561
    .line 562
    move/from16 v19, v8

    .line 563
    .line 564
    move/from16 v8, v22

    .line 565
    .line 566
    goto :goto_d

    .line 567
    :catch_3
    move-exception v0

    .line 568
    goto :goto_e

    .line 569
    :catch_4
    move-exception v0

    .line 570
    move-object/from16 v1, p0

    .line 571
    .line 572
    :goto_e
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    const-string v3, "...while merging to block "

    .line 577
    .line 578
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v0

    .line 586
    :cond_10
    move-object/from16 v1, p0

    .line 587
    .line 588
    move/from16 v22, v8

    .line 589
    .line 590
    move/from16 v8, v19

    .line 591
    .line 592
    move-object/from16 v19, v9

    .line 593
    .line 594
    move/from16 v9, v21

    .line 595
    .line 596
    if-nez v22, :cond_11

    .line 597
    .line 598
    iget-boolean v2, v10, Li4/a0;->w:Z

    .line 599
    .line 600
    if-eqz v2, :cond_11

    .line 601
    .line 602
    const/4 v2, -0x2

    .line 603
    invoke-virtual {v1, v2}, Li4/z;->f(I)I

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    invoke-static {v2}, Lz4/g;->o(I)Lz4/g;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    move/from16 v3, v18

    .line 612
    .line 613
    goto :goto_f

    .line 614
    :cond_11
    move-object/from16 v2, v19

    .line 615
    .line 616
    move/from16 v3, v22

    .line 617
    .line 618
    :goto_f
    if-nez v3, :cond_12

    .line 619
    .line 620
    const/4 v4, -0x1

    .line 621
    goto :goto_10

    .line 622
    :cond_12
    iget v4, v10, Li4/a0;->x:I

    .line 623
    .line 624
    if-ltz v4, :cond_13

    .line 625
    .line 626
    invoke-virtual {v2, v4}, Lz4/g;->n(I)I

    .line 627
    .line 628
    .line 629
    move-result v4

    .line 630
    :cond_13
    :goto_10
    invoke-virtual {v1}, Li4/z;->i()Z

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    if-eqz v5, :cond_14

    .line 635
    .line 636
    iget-boolean v5, v10, Li4/a0;->A:Z

    .line 637
    .line 638
    if-eqz v5, :cond_14

    .line 639
    .line 640
    move/from16 v10, v18

    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_14
    const/4 v10, 0x0

    .line 644
    :goto_11
    if-nez v10, :cond_16

    .line 645
    .line 646
    if-eqz v9, :cond_15

    .line 647
    .line 648
    goto :goto_12

    .line 649
    :cond_15
    move v0, v4

    .line 650
    goto/16 :goto_19

    .line 651
    .line 652
    :cond_16
    :goto_12
    new-instance v2, Lz4/g;

    .line 653
    .line 654
    invoke-direct {v2, v3}, Lz4/g;-><init>(I)V

    .line 655
    .line 656
    .line 657
    const/4 v3, 0x0

    .line 658
    const/4 v5, 0x0

    .line 659
    :goto_13
    if-ge v3, v9, :cond_1c

    .line 660
    .line 661
    invoke-virtual {v7, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v6

    .line 665
    check-cast v6, Li4/f;

    .line 666
    .line 667
    iget-object v12, v6, Li4/f;->d:Lv4/d0;

    .line 668
    .line 669
    if-eqz v12, :cond_17

    .line 670
    .line 671
    goto :goto_14

    .line 672
    :cond_17
    sget-object v12, Lv4/d0;->j:Lv4/d0;

    .line 673
    .line 674
    :goto_14
    iget v6, v6, Li4/f;->c:I

    .line 675
    .line 676
    sget-object v1, Lv4/d0;->j:Lv4/d0;

    .line 677
    .line 678
    if-ne v12, v1, :cond_18

    .line 679
    .line 680
    move/from16 v1, v18

    .line 681
    .line 682
    goto :goto_15

    .line 683
    :cond_18
    const/4 v1, 0x0

    .line 684
    :goto_15
    or-int v19, v5, v1

    .line 685
    .line 686
    invoke-virtual {v14}, Li4/n;->n()Li4/n;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    invoke-virtual {v1}, Lz4/j;->j()V

    .line 691
    .line 692
    .line 693
    move-object/from16 v20, v2

    .line 694
    .line 695
    const/4 v5, 0x0

    .line 696
    :goto_16
    iget v2, v1, Li4/n;->i:I

    .line 697
    .line 698
    if-ge v5, v2, :cond_19

    .line 699
    .line 700
    iget-object v2, v1, Li4/n;->j:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v2, [Lw4/d;

    .line 703
    .line 704
    aput-object v16, v2, v5

    .line 705
    .line 706
    iget-object v2, v1, Li4/n;->k:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v2, [Z

    .line 709
    .line 710
    move-object/from16 v21, v2

    .line 711
    .line 712
    const/4 v2, 0x0

    .line 713
    aput-boolean v2, v21, v5

    .line 714
    .line 715
    add-int/lit8 v5, v5, 0x1

    .line 716
    .line 717
    goto :goto_16

    .line 718
    :cond_19
    const/4 v2, 0x0

    .line 719
    iput v2, v1, Li4/n;->i:I

    .line 720
    .line 721
    invoke-virtual {v1, v12}, Li4/n;->q(Lw4/d;)V

    .line 722
    .line 723
    .line 724
    new-instance v5, Lb5/c;

    .line 725
    .line 726
    invoke-direct {v5, v13, v1, v15}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 727
    .line 728
    .line 729
    move v1, v3

    .line 730
    :try_start_5
    iget v3, v0, Li4/d;->a:I
    :try_end_5
    .catch Li4/b0; {:try_start_5 .. :try_end_5} :catch_6

    .line 731
    .line 732
    move v2, v4

    .line 733
    const/4 v4, 0x0

    .line 734
    move-object/from16 v0, v20

    .line 735
    .line 736
    move-object/from16 v20, v7

    .line 737
    .line 738
    move-object v7, v0

    .line 739
    move/from16 v21, v1

    .line 740
    .line 741
    move v0, v2

    .line 742
    move v2, v6

    .line 743
    move-object/from16 v1, p0

    .line 744
    .line 745
    move-object/from16 v6, p3

    .line 746
    .line 747
    :try_start_6
    invoke-virtual/range {v1 .. v6}, Li4/z;->l(IILf1/h;Lb5/c;[I)V
    :try_end_6
    .catch Li4/b0; {:try_start_6 .. :try_end_6} :catch_5

    .line 748
    .line 749
    .line 750
    iget-object v3, v1, Li4/z;->j:[Li4/l;

    .line 751
    .line 752
    aget-object v4, v3, v2

    .line 753
    .line 754
    if-nez v4, :cond_1a

    .line 755
    .line 756
    new-instance v4, Li4/l;

    .line 757
    .line 758
    invoke-direct {v4, v1}, Li4/l;-><init>(Li4/z;)V

    .line 759
    .line 760
    .line 761
    aput-object v4, v3, v2

    .line 762
    .line 763
    :cond_1a
    iget-object v2, v12, Lv4/d0;->g:Lw4/c;

    .line 764
    .line 765
    iget-object v3, v4, Li4/l;->g:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v3, Ljava/util/HashMap;

    .line 768
    .line 769
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    check-cast v5, Li4/w;

    .line 774
    .line 775
    if-nez v5, :cond_1b

    .line 776
    .line 777
    iget-object v4, v4, Li4/l;->h:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v4, Li4/z;

    .line 780
    .line 781
    iget-object v4, v4, Li4/z;->n:Li4/x;

    .line 782
    .line 783
    invoke-virtual {v4}, Li4/x;->k()I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    new-instance v5, Li4/w;

    .line 788
    .line 789
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 790
    .line 791
    .line 792
    iput-object v2, v5, Li4/w;->a:Lw4/c;

    .line 793
    .line 794
    iput v4, v5, Li4/w;->b:I

    .line 795
    .line 796
    invoke-virtual {v3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    :cond_1b
    iget v2, v5, Li4/w;->b:I

    .line 800
    .line 801
    invoke-virtual {v7, v2}, Lz4/g;->l(I)V

    .line 802
    .line 803
    .line 804
    add-int/lit8 v3, v21, 0x1

    .line 805
    .line 806
    move v4, v0

    .line 807
    move-object v2, v7

    .line 808
    move/from16 v5, v19

    .line 809
    .line 810
    move-object/from16 v7, v20

    .line 811
    .line 812
    move-object/from16 v0, p1

    .line 813
    .line 814
    goto/16 :goto_13

    .line 815
    .line 816
    :catch_5
    move-exception v0

    .line 817
    goto :goto_17

    .line 818
    :catch_6
    move-exception v0

    .line 819
    move-object/from16 v1, p0

    .line 820
    .line 821
    move v2, v6

    .line 822
    :goto_17
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    const-string v3, "...while merging exception to block "

    .line 827
    .line 828
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    throw v0

    .line 836
    :cond_1c
    move-object v7, v2

    .line 837
    move v0, v4

    .line 838
    if-eqz v10, :cond_1e

    .line 839
    .line 840
    if-nez v5, :cond_1e

    .line 841
    .line 842
    const/4 v2, -0x6

    .line 843
    invoke-virtual {v1, v2}, Li4/z;->f(I)I

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    invoke-virtual {v7, v2}, Lz4/g;->l(I)V

    .line 848
    .line 849
    .line 850
    move/from16 v2, v18

    .line 851
    .line 852
    iput-boolean v2, v1, Li4/z;->k:Z

    .line 853
    .line 854
    sub-int v3, v8, v28

    .line 855
    .line 856
    sub-int/2addr v3, v2

    .line 857
    :goto_18
    if-ge v3, v8, :cond_1e

    .line 858
    .line 859
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    check-cast v2, Lu4/i;

    .line 864
    .line 865
    iget-object v4, v2, Lu4/i;->g:Lu4/r;

    .line 866
    .line 867
    invoke-virtual {v4}, Lu4/r;->a()Z

    .line 868
    .line 869
    .line 870
    move-result v4

    .line 871
    if-eqz v4, :cond_1d

    .line 872
    .line 873
    sget-object v4, Lw4/c;->E:Lw4/c;

    .line 874
    .line 875
    invoke-virtual {v2, v4}, Lu4/i;->i(Lw4/c;)Lu4/i;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    invoke-virtual {v11, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    :cond_1d
    add-int/lit8 v3, v3, 0x1

    .line 883
    .line 884
    goto :goto_18

    .line 885
    :cond_1e
    if-ltz v0, :cond_1f

    .line 886
    .line 887
    invoke-virtual {v7, v0}, Lz4/g;->l(I)V

    .line 888
    .line 889
    .line 890
    :cond_1f
    const/4 v2, 0x0

    .line 891
    iput-boolean v2, v7, Lz4/j;->g:Z

    .line 892
    .line 893
    move-object v2, v7

    .line 894
    :goto_19
    invoke-virtual {v2, v0}, Lz4/g;->m(I)I

    .line 895
    .line 896
    .line 897
    move-result v3

    .line 898
    if-ltz v3, :cond_20

    .line 899
    .line 900
    move v12, v3

    .line 901
    goto :goto_1a

    .line 902
    :cond_20
    const/4 v12, -0x1

    .line 903
    :goto_1a
    move v4, v0

    .line 904
    move-object v0, v2

    .line 905
    move v2, v8

    .line 906
    :goto_1b
    if-lez v28, :cond_24

    .line 907
    .line 908
    add-int/lit8 v2, v2, -0x1

    .line 909
    .line 910
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    check-cast v3, Lu4/i;

    .line 915
    .line 916
    iget-object v5, v3, Lu4/i;->g:Lu4/r;

    .line 917
    .line 918
    iget v5, v5, Lu4/r;->e:I

    .line 919
    .line 920
    const/4 v6, 0x1

    .line 921
    if-ne v5, v6, :cond_21

    .line 922
    .line 923
    const/4 v5, 0x1

    .line 924
    goto :goto_1c

    .line 925
    :cond_21
    const/4 v5, 0x0

    .line 926
    :goto_1c
    new-instance v6, Lh4/u;

    .line 927
    .line 928
    if-eqz v5, :cond_22

    .line 929
    .line 930
    const/4 v7, 0x2

    .line 931
    goto :goto_1d

    .line 932
    :cond_22
    const/4 v7, 0x1

    .line 933
    :goto_1d
    invoke-direct {v6, v7}, Lz4/e;-><init>(I)V

    .line 934
    .line 935
    .line 936
    const/4 v7, 0x0

    .line 937
    invoke-virtual {v6, v7, v3}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    if-eqz v5, :cond_23

    .line 941
    .line 942
    new-instance v5, Lu4/m;

    .line 943
    .line 944
    sget-object v8, Lu4/s;->s:Lu4/r;

    .line 945
    .line 946
    iget-object v3, v3, Lu4/i;->h:Lu4/t;

    .line 947
    .line 948
    sget-object v9, Lu4/p;->i:Lu4/p;

    .line 949
    .line 950
    move-object/from16 v10, v16

    .line 951
    .line 952
    invoke-direct {v5, v8, v3, v10, v9}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 953
    .line 954
    .line 955
    const/4 v3, 0x1

    .line 956
    invoke-virtual {v6, v3, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    invoke-static {v4}, Lz4/g;->o(I)Lz4/g;

    .line 960
    .line 961
    .line 962
    move-result-object v3

    .line 963
    goto :goto_1e

    .line 964
    :cond_23
    move-object v3, v0

    .line 965
    :goto_1e
    iput-boolean v7, v6, Lz4/j;->g:Z

    .line 966
    .line 967
    invoke-virtual {v1}, Li4/z;->e()I

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    new-instance v8, Lu4/b;

    .line 972
    .line 973
    invoke-direct {v8, v5, v6, v3, v4}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v8, v15}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v0}, Lz4/g;->p()Lz4/g;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-virtual {v0, v12, v5}, Lz4/g;->q(II)V

    .line 984
    .line 985
    .line 986
    iput-boolean v7, v0, Lz4/j;->g:Z

    .line 987
    .line 988
    add-int/lit8 v28, v28, -0x1

    .line 989
    .line 990
    move v4, v5

    .line 991
    const/16 v16, 0x0

    .line 992
    .line 993
    goto :goto_1b

    .line 994
    :cond_24
    if-nez v2, :cond_25

    .line 995
    .line 996
    const/4 v10, 0x0

    .line 997
    goto :goto_1f

    .line 998
    :cond_25
    add-int/lit8 v3, v2, -0x1

    .line 999
    .line 1000
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v3

    .line 1004
    move-object v10, v3

    .line 1005
    check-cast v10, Lu4/i;

    .line 1006
    .line 1007
    :goto_1f
    if-eqz v10, :cond_26

    .line 1008
    .line 1009
    iget-object v3, v10, Lu4/i;->g:Lu4/r;

    .line 1010
    .line 1011
    iget v3, v3, Lu4/r;->e:I

    .line 1012
    .line 1013
    const/4 v6, 0x1

    .line 1014
    if-ne v3, v6, :cond_28

    .line 1015
    .line 1016
    :cond_26
    if-nez v10, :cond_27

    .line 1017
    .line 1018
    sget-object v3, Lu4/t;->d:Lu4/t;

    .line 1019
    .line 1020
    goto :goto_20

    .line 1021
    :cond_27
    iget-object v3, v10, Lu4/i;->h:Lu4/t;

    .line 1022
    .line 1023
    :goto_20
    new-instance v5, Lu4/m;

    .line 1024
    .line 1025
    sget-object v6, Lu4/s;->s:Lu4/r;

    .line 1026
    .line 1027
    sget-object v7, Lu4/p;->i:Lu4/p;

    .line 1028
    .line 1029
    const/4 v10, 0x0

    .line 1030
    invoke-direct {v5, v6, v3, v10, v7}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    add-int/lit8 v2, v2, 0x1

    .line 1037
    .line 1038
    :cond_28
    new-instance v3, Lh4/u;

    .line 1039
    .line 1040
    invoke-direct {v3, v2}, Lz4/e;-><init>(I)V

    .line 1041
    .line 1042
    .line 1043
    const/4 v5, 0x0

    .line 1044
    :goto_21
    if-ge v5, v2, :cond_29

    .line 1045
    .line 1046
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v6

    .line 1050
    check-cast v6, Lu4/i;

    .line 1051
    .line 1052
    invoke-virtual {v3, v5, v6}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    add-int/lit8 v5, v5, 0x1

    .line 1056
    .line 1057
    goto :goto_21

    .line 1058
    :cond_29
    const/4 v7, 0x0

    .line 1059
    iput-boolean v7, v3, Lz4/j;->g:Z

    .line 1060
    .line 1061
    new-instance v2, Lu4/b;

    .line 1062
    .line 1063
    move/from16 v5, v29

    .line 1064
    .line 1065
    invoke-direct {v2, v5, v3, v0, v4}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 1066
    .line 1067
    .line 1068
    iget v0, v2, Lu4/b;->a:I

    .line 1069
    .line 1070
    invoke-virtual {v1, v0}, Li4/z;->k(I)I

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    if-gez v0, :cond_2a

    .line 1075
    .line 1076
    goto :goto_22

    .line 1077
    :cond_2a
    invoke-virtual {v1, v0}, Li4/z;->n(I)V

    .line 1078
    .line 1079
    .line 1080
    :goto_22
    iget-object v0, v1, Li4/z;->h:Ljava/util/ArrayList;

    .line 1081
    .line 1082
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v15}, Lz4/j;->k()V

    .line 1086
    .line 1087
    .line 1088
    iget-object v0, v1, Li4/z;->i:Ljava/util/ArrayList;

    .line 1089
    .line 1090
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    return-void

    .line 1094
    :goto_23
    invoke-virtual {v13, v0}, Li4/s;->l(Li4/b0;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v14, v0}, Li4/n;->l(Li4/b0;)V

    .line 1098
    .line 1099
    .line 1100
    throw v0
.end method

.method public final n(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Li4/z;->a:Li4/m;

    .line 2
    .line 3
    iget-object v0, v0, Li4/m;->c:Lh4/c;

    .line 4
    .line 5
    iget-object v0, v0, Lh4/c;->e:Li4/g;

    .line 6
    .line 7
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    iget v1, p0, Li4/z;->d:I

    .line 11
    .line 12
    add-int/2addr v1, v0

    .line 13
    add-int/lit8 v1, v1, 0x7

    .line 14
    .line 15
    iget-object v0, p0, Li4/z;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lu4/b;

    .line 22
    .line 23
    iget-object v2, v2, Lu4/b;->c:Lz4/g;

    .line 24
    .line 25
    iget v3, v2, Lz4/g;->i:I

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Li4/z;->i:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    :goto_0
    if-ge p1, v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lz4/g;->n(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lt v0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Li4/z;->k(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ltz v4, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0, v4}, Li4/z;->n(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "Invalid label "

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    return-void
.end method
