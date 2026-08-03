.class public final Lb5/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/util/RandomAccess;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 361
    new-instance v0, Lj0/b;

    const/16 v1, 0x10

    new-array v2, v1, [Li0/k0;

    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 362
    iput-object v0, p0, Lb5/i;->d:Ljava/lang/Object;

    .line 363
    sget-object v2, Lf/s0;->a:Lf/l0;

    .line 364
    new-instance v2, Lf/l0;

    invoke-direct {v2}, Lf/l0;-><init>()V

    .line 365
    iput-object v2, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 366
    iput-object v0, p0, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 367
    new-instance v0, Lj0/b;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 368
    iput-object v0, p0, Lb5/i;->g:Ljava/lang/Object;

    .line 369
    new-instance v0, Lj0/b;

    new-array v1, v1, [Lfg/a;

    invoke-direct {v0, v1}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 370
    iput-object v0, p0, Lb5/i;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb5/c;Lk5/z;Lac/k;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5/h;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lb5/h;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    iput-object v0, p0, Lb5/i;->h:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p2, p0, Lb5/i;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p3, p0, Lb5/i;->d:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    :try_start_0
    invoke-virtual {p3}, Lac/k;->p()Lk5/b0;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-static {p3}, Lf6/e;->h(Lk5/b0;)Lf6/e;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p2}, Lk5/z;->j1()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lf6/e;->g(Ljava/util/List;)Lf6/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v1, Lac/k;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v1, v3, v2}, Lac/k;-><init>(BI)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Lb5/i;->i:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance v1, Lac/k;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-direct {v1, v3, v2}, Lac/k;-><init>(BI)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lb5/i;->j:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance v1, Landroidx/lifecycle/x;

    .line 74
    .line 75
    invoke-direct {v1, p3}, Landroidx/lifecycle/x;-><init>(Lf6/e;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v3, 0x1

    .line 85
    sub-int/2addr v2, v3

    .line 86
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->u(I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sub-int/2addr v2, v3

    .line 95
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    check-cast p3, Lt5/d;

    .line 100
    .line 101
    invoke-interface {p3}, Lt5/d;->c()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    add-int/2addr v1, p3

    .line 106
    move p3, v0

    .line 107
    :goto_0
    iget-object v2, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Lf6/e;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-ge p3, v2, :cond_4

    .line 116
    .line 117
    iget-object v2, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lf6/e;

    .line 120
    .line 121
    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Lt5/d;

    .line 126
    .line 127
    invoke-interface {v2}, Lt5/d;->i()Lf5/f;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    sget-object v5, Lf5/f;->p:Lf5/f;

    .line 132
    .line 133
    const/4 v6, -0x1

    .line 134
    if-ne v4, v5, :cond_1

    .line 135
    .line 136
    iget-object v5, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Landroidx/lifecycle/x;

    .line 139
    .line 140
    invoke-virtual {v5, p3}, Landroidx/lifecycle/x;->u(I)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    move-object v7, v2

    .line 145
    check-cast v7, Lt5/f;

    .line 146
    .line 147
    invoke-interface {v7}, Lt5/f;->l()I

    .line 148
    .line 149
    .line 150
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    add-int/2addr v7, v5

    .line 152
    :try_start_1
    sget-object v8, Lf5/f;->s:Lf5/f;

    .line 153
    .line 154
    invoke-virtual {p0, v7, v8}, Lb5/i;->e(ILf5/f;)I

    .line 155
    .line 156
    .line 157
    move-result v7
    :try_end_1
    .catch Lb5/g; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 158
    move v8, v3

    .line 159
    goto :goto_1

    .line 160
    :catch_0
    move-exception p3

    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :catch_1
    move v8, v0

    .line 164
    :goto_1
    if-eqz v8, :cond_3

    .line 165
    .line 166
    :try_start_2
    iget-object v8, p0, Lb5/i;->i:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v8, Lac/k;

    .line 169
    .line 170
    invoke-virtual {v8, v7}, Lac/k;->k(I)I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eq v8, v6, :cond_0

    .line 175
    .line 176
    sget-object v6, Lf5/f;->s:Lf5/f;

    .line 177
    .line 178
    invoke-virtual {p0, v7, v6}, Lb5/i;->f(ILf5/f;)Lt5/d;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    iget-object v7, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 183
    .line 184
    new-instance v8, Ly5/a;

    .line 185
    .line 186
    check-cast v2, Lu5/a;

    .line 187
    .line 188
    invoke-interface {v2}, Lt5/g;->h()I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    sub-int v9, v1, v5

    .line 193
    .line 194
    invoke-direct {v8, v4, v2, v9}, Ly5/a;-><init>(Lf5/f;II)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v7, p3, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    iget-object v2, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    invoke-interface {v6}, Lt5/d;->c()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    add-int/2addr v2, v1

    .line 210
    goto :goto_2

    .line 211
    :cond_0
    move v2, v1

    .line 212
    move v1, v7

    .line 213
    :goto_2
    iget-object v4, p0, Lb5/i;->i:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v4, Lac/k;

    .line 216
    .line 217
    invoke-virtual {v4, v1, v5}, Lac/k;->c(II)V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_1
    sget-object v5, Lf5/f;->q:Lf5/f;

    .line 222
    .line 223
    if-ne v4, v5, :cond_3

    .line 224
    .line 225
    iget-object v5, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v5, Landroidx/lifecycle/x;

    .line 228
    .line 229
    invoke-virtual {v5, p3}, Landroidx/lifecycle/x;->u(I)I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    move-object v7, v2

    .line 234
    check-cast v7, Lt5/f;

    .line 235
    .line 236
    invoke-interface {v7}, Lt5/f;->l()I

    .line 237
    .line 238
    .line 239
    move-result v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 240
    add-int/2addr v7, v5

    .line 241
    :try_start_3
    sget-object v8, Lf5/f;->t:Lf5/f;

    .line 242
    .line 243
    invoke-virtual {p0, v7, v8}, Lb5/i;->e(ILf5/f;)I

    .line 244
    .line 245
    .line 246
    move-result v7
    :try_end_3
    .catch Lb5/g; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 247
    move v8, v3

    .line 248
    goto :goto_3

    .line 249
    :catch_2
    move v8, v0

    .line 250
    :goto_3
    if-eqz v8, :cond_3

    .line 251
    .line 252
    :try_start_4
    iget-object v8, p0, Lb5/i;->j:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v8, Lac/k;

    .line 255
    .line 256
    invoke-virtual {v8, v7}, Lac/k;->k(I)I

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eq v8, v6, :cond_2

    .line 261
    .line 262
    sget-object v6, Lf5/f;->t:Lf5/f;

    .line 263
    .line 264
    invoke-virtual {p0, v7, v6}, Lb5/i;->f(ILf5/f;)Lt5/d;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    iget-object v7, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 269
    .line 270
    new-instance v8, Ly5/a;

    .line 271
    .line 272
    check-cast v2, Lu5/a;

    .line 273
    .line 274
    invoke-interface {v2}, Lt5/g;->h()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    sub-int v9, v1, v5

    .line 279
    .line 280
    invoke-direct {v8, v4, v2, v9}, Ly5/a;-><init>(Lf5/f;II)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, p3, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    iget-object v2, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    invoke-interface {v6}, Lt5/d;->c()I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    add-int/2addr v2, v1

    .line 296
    goto :goto_4

    .line 297
    :cond_2
    move v2, v1

    .line 298
    move v1, v7

    .line 299
    :goto_4
    iget-object v4, p0, Lb5/i;->j:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v4, Lac/k;

    .line 302
    .line 303
    invoke-virtual {v4, v1, v5}, Lac/k;->c(II)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 304
    .line 305
    .line 306
    :goto_5
    move v1, v2

    .line 307
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :cond_4
    return-void

    .line 312
    :goto_6
    :try_start_5
    iget-object p1, p1, Lb5/c;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast p1, La2/a;

    .line 315
    .line 316
    new-instance v1, Ljava/io/StringWriter;

    .line 317
    .line 318
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 319
    .line 320
    .line 321
    :try_start_6
    invoke-virtual {p1, v1}, La2/a;->j(Ljava/io/StringWriter;)Lq5/a;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p1, p2}, Lq5/a;->i(Li5/b;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 326
    .line 327
    .line 328
    :try_start_7
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 332
    const-string p2, "Error while processing method %s"

    .line 333
    .line 334
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p3, p2, p1}, Ld6/f;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ld6/f;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    throw p1

    .line 343
    :catch_3
    :try_start_8
    new-instance p1, Ljava/lang/AssertionError;

    .line 344
    .line 345
    const-string p2, "Unexpected IOException"

    .line 346
    .line 347
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 351
    :catch_4
    const-string p1, "Error while processing method"

    .line 352
    .line 353
    new-array p2, v0, [Ljava/lang/Object;

    .line 354
    .line 355
    invoke-static {p3, p1, p2}, Ld6/f;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ld6/f;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    throw p1
.end method

.method public static final h(Li0/k0;Lj0/b;)Z
    .locals 5

    .line 1
    iget-object v0, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p1, Lj0/b;->i:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, p1, :cond_2

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    check-cast v3, Li0/k0;

    .line 12
    .line 13
    iget-object v3, v3, Li0/k0;->a:Li0/a2;

    .line 14
    .line 15
    instance-of v4, v3, Ls0/f;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    check-cast v3, Ls0/f;

    .line 20
    .line 21
    iget-object v3, v3, Ls0/f;->h:Lj0/b;

    .line 22
    .line 23
    invoke-virtual {v3, p0}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {p0, v3}, Lb5/i;->h(Li0/k0;Lj0/b;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return v1
.end method

.method public static j(Le5/a;ILjava/util/Set;)V
    .locals 9

    .line 1
    sget-object v0, Lf5/a;->n:[Lf5/a;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    if-ge v3, v1, :cond_1

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    iget-boolean v6, v5, Lf5/a;->j:Z

    .line 12
    .line 13
    if-eqz v6, :cond_0

    .line 14
    .line 15
    iget v5, v5, Lf5/a;->g:I

    .line 16
    .line 17
    and-int/2addr v5, p1

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    add-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-array v1, v4, [Lf5/a;

    .line 26
    .line 27
    array-length v3, v0

    .line 28
    move v5, v2

    .line 29
    move v6, v5

    .line 30
    :goto_1
    if-ge v5, v3, :cond_3

    .line 31
    .line 32
    aget-object v7, v0, v5

    .line 33
    .line 34
    iget-boolean v8, v7, Lf5/a;->j:Z

    .line 35
    .line 36
    if-eqz v8, :cond_2

    .line 37
    .line 38
    iget v8, v7, Lf5/a;->g:I

    .line 39
    .line 40
    and-int/2addr v8, p1

    .line 41
    if-eqz v8, :cond_2

    .line 42
    .line 43
    add-int/lit8 v8, v6, 0x1

    .line 44
    .line 45
    aput-object v7, v1, v6

    .line 46
    .line 47
    move v6, v8

    .line 48
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    :goto_2
    const/16 p1, 0x20

    .line 52
    .line 53
    if-ge v2, v4, :cond_4

    .line 54
    .line 55
    aget-object v0, v1, v2

    .line 56
    .line 57
    iget-object v0, v0, Lf5/a;->h:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lq5/a;->write(I)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lf5/c;

    .line 83
    .line 84
    iget-object v0, v0, Lf5/c;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lq5/a;->write(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    return-void
.end method

.method public static k(Le5/a;Lk5/z;Lb5/c;)V
    .locals 3

    .line 1
    const-string v0, ".method "

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lk5/z;->l:I

    .line 7
    .line 8
    iget v1, p1, Lk5/z;->p:I

    .line 9
    .line 10
    const/4 v2, 0x7

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v1}, Lf5/c;->a(I)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-static {p0, v0, v1}, Lb5/i;->j(Le5/a;ILjava/util/Set;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lk5/z;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "("

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lk5/z;->j1()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lf6/e;->g(Ljava/util/List;)Lf6/e;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Lf6/e;->i(I)Lf6/c;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_1
    invoke-virtual {v1}, Lf6/c;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Lf6/c;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lo5/p;

    .line 63
    .line 64
    iget-object v2, v2, Lo5/p;->l:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, v2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const-string v1, ")"

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lk5/z;->h1()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p0, v1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0xa

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lq5/a;->write(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Le5/a;->w()V

    .line 88
    .line 89
    .line 90
    invoke-static {p2, p0, p1, v0}, Lb5/i;->l(Lb5/c;Le5/a;Lk5/z;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, p1, Lk5/z;->j:Lk5/u;

    .line 94
    .line 95
    iget p1, p1, Lk5/z;->o:I

    .line 96
    .line 97
    invoke-static {p2, p1}, Lo5/e;->a(Lk5/u;I)Ljava/util/Set;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/util/Set;

    .line 102
    .line 103
    invoke-static {p0, p1}, Lac/p;->Q(Le5/a;Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Le5/a;->u()V

    .line 107
    .line 108
    .line 109
    const-string p1, ".end method\n"

    .line 110
    .line 111
    invoke-virtual {p0, p1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static l(Lb5/c;Le5/a;Lk5/z;Ljava/util/List;)V
    .locals 4

    .line 1
    sget-object v0, Lf5/a;->l:Lf5/a;

    .line 2
    .line 3
    iget p2, p2, Lk5/z;->l:I

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lf5/a;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    xor-int/lit8 p2, p2, 0x1

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lo5/p;

    .line 26
    .line 27
    iget-object v1, v0, Lo5/p;->l:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v0, Lo5/p;->k:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, v0, Lo5/p;->j:Ljava/util/Set;

    .line 32
    .line 33
    iget-object v3, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    :cond_0
    const-string v3, ".param p"

    .line 44
    .line 45
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Le5/a;->z(I)V

    .line 49
    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    const-string v3, ", "

    .line 54
    .line 55
    invoke-virtual {p1, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    const-string v2, "    # "

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    const-string v2, "\n"

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-lez v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p1}, Le5/a;->w()V

    .line 81
    .line 82
    .line 83
    check-cast v0, Ljava/util/Set;

    .line 84
    .line 85
    invoke-static {p1, v0}, Lac/p;->Q(Le5/a;Ljava/util/Set;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Le5/a;->u()V

    .line 89
    .line 90
    .line 91
    const-string v0, ".end param\n"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    add-int/lit8 v0, p2, 0x1

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    const/16 v2, 0x4a

    .line 104
    .line 105
    if-eq v1, v2, :cond_4

    .line 106
    .line 107
    const/16 v2, 0x44

    .line 108
    .line 109
    if-ne v1, v2, :cond_3

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    move p2, v0

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    :goto_1
    add-int/lit8 p2, p2, 0x2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, Lb5/i;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v1, p0, Lb5/i;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lj0/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lf/l0;

    .line 16
    .line 17
    invoke-virtual {v2}, Lf/l0;->b()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 21
    .line 22
    iget-object v1, p0, Lb5/i;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lj0/b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lb5/i;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lj0/b;

    .line 32
    .line 33
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lb5/i;->i:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v0, p0, Lb5/i;->j:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v0, p0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "Compose:abandons"

    .line 18
    .line 19
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Li0/a2;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Li0/a2;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_2
    :goto_2
    return-void
.end method

.method public c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lb5/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj0/b;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/i;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lj0/b;

    .line 8
    .line 9
    iget-object v2, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/Set;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_a

    .line 16
    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    iput-object v3, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iget v3, v1, Lj0/b;->i:I

    .line 21
    .line 22
    if-eqz v3, :cond_6

    .line 23
    .line 24
    const-string v3, "Compose:onForgotten"

    .line 25
    .line 26
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v3, p0, Lb5/i;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lf/l0;

    .line 32
    .line 33
    iget v4, v1, Lj0/b;->i:I

    .line 34
    .line 35
    add-int/lit8 v4, v4, -0x1

    .line 36
    .line 37
    :goto_0
    const/4 v5, -0x1

    .line 38
    if-ge v5, v4, :cond_5

    .line 39
    .line 40
    iget-object v5, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 41
    .line 42
    aget-object v5, v5, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    :try_start_1
    instance-of v6, v5, Li0/k0;

    .line 45
    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    move-object v6, v5

    .line 49
    check-cast v6, Li0/k0;

    .line 50
    .line 51
    iget-object v6, v6, Li0/k0;->a:Li0/a2;

    .line 52
    .line 53
    invoke-interface {v2, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-interface {v6}, Li0/a2;->f()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_3

    .line 62
    :cond_1
    :goto_1
    instance-of v6, v5, Li0/h;

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3, v5}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    move-object v6, v5

    .line 75
    check-cast v6, Li0/h;

    .line 76
    .line 77
    invoke-interface {v6}, Li0/h;->a()V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move-object v6, v5

    .line 82
    check-cast v6, Li0/h;

    .line 83
    .line 84
    invoke-interface {v6}, Li0/h;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, -0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :goto_3
    :try_start_2
    iget-object v1, p0, Lb5/i;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lx0/d;

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    new-instance v2, Lwb/xi;

    .line 97
    .line 98
    const/16 v3, 0x18

    .line 99
    .line 100
    invoke-direct {v2, v1, v3, v5}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v2}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 104
    .line 105
    .line 106
    :cond_4
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_6
    :goto_5
    iget v1, v0, Lj0/b;->i:I

    .line 118
    .line 119
    if-eqz v1, :cond_a

    .line 120
    .line 121
    const-string v1, "Compose:onRemembered"

    .line 122
    .line 123
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :try_start_3
    iget-object v1, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/util/Set;

    .line 129
    .line 130
    if-nez v1, :cond_7

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_7
    iget-object v2, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 134
    .line 135
    iget v0, v0, Lj0/b;->i:I

    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    :goto_6
    if-ge v3, v0, :cond_9

    .line 139
    .line 140
    aget-object v4, v2, v3

    .line 141
    .line 142
    check-cast v4, Li0/k0;

    .line 143
    .line 144
    iget-object v5, v4, Li0/k0;->a:Li0/a2;

    .line 145
    .line 146
    invoke-interface {v1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 147
    .line 148
    .line 149
    :try_start_4
    invoke-interface {v5}, Li0/a2;->j()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 150
    .line 151
    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :catchall_2
    move-exception v0

    .line 156
    :try_start_5
    iget-object v1, p0, Lb5/i;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Lx0/d;

    .line 159
    .line 160
    if-eqz v1, :cond_8

    .line 161
    .line 162
    new-instance v2, Lwb/xi;

    .line 163
    .line 164
    const/16 v3, 0x18

    .line 165
    .line 166
    invoke-direct {v2, v1, v3, v4}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v2}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :catchall_3
    move-exception v0

    .line 174
    goto :goto_9

    .line 175
    :cond_8
    :goto_7
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 176
    :cond_9
    :goto_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :goto_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_a
    :goto_a
    return-void
.end method

.method public d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lb5/i;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj0/b;

    .line 4
    .line 5
    iget v1, v0, Lj0/b;->i:I

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-string v1, "Compose:sideeffects"

    .line 10
    .line 11
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 15
    .line 16
    iget v2, v0, Lj0/b;->i:I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_0

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, Lfg/a;

    .line 24
    .line 25
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {v0}, Lj0/b;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    return-void
.end method

.method public e(ILf5/f;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf6/e;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    :try_start_0
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/x;->x(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_0
    .catch Lc6/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lt5/d;

    .line 19
    .line 20
    invoke-interface {v4}, Lt5/d;->i()Lf5/f;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eq v5, p2, :cond_1

    .line 25
    .line 26
    invoke-interface {v4}, Lt5/d;->i()Lf5/f;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Lf5/f;->n:Lf5/f;

    .line 31
    .line 32
    if-ne v4, v5, :cond_0

    .line 33
    .line 34
    add-int/2addr v3, v2

    .line 35
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ge v3, v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lt5/d;

    .line 46
    .line 47
    invoke-interface {v1}, Lt5/d;->i()Lf5/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-ne v1, p2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroidx/lifecycle/x;->u(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_0
    new-instance p2, Lb5/g;

    .line 59
    .line 60
    invoke-direct {p2, p1}, Lb5/g;-><init>(I)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :cond_1
    return p1

    .line 65
    :catch_0
    new-instance p2, Lb5/g;

    .line 66
    .line 67
    invoke-direct {p2, p1}, Lb5/g;-><init>(I)V

    .line 68
    .line 69
    .line 70
    throw p2
.end method

.method public f(ILf5/f;)Lt5/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf6/e;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/lifecycle/x;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, p1, v2}, Landroidx/lifecycle/x;->x(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catch Lc6/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lt5/d;

    .line 19
    .line 20
    invoke-interface {v3}, Lt5/d;->i()Lf5/f;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eq v4, p2, :cond_1

    .line 25
    .line 26
    invoke-interface {v3}, Lt5/d;->i()Lf5/f;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sget-object v4, Lf5/f;->n:Lf5/f;

    .line 31
    .line 32
    if-ne v3, v4, :cond_0

    .line 33
    .line 34
    add-int/2addr v1, v2

    .line 35
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ge v1, v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lt5/d;

    .line 46
    .line 47
    invoke-interface {v0}, Lt5/d;->i()Lf5/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-ne v1, p2, :cond_0

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_0
    new-instance p2, Lb5/g;

    .line 55
    .line 56
    invoke-direct {p2, p1}, Lb5/g;-><init>(I)V

    .line 57
    .line 58
    .line 59
    throw p2

    .line 60
    :cond_1
    return-object v3

    .line 61
    :catch_0
    new-instance p2, Lb5/g;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Lb5/g;-><init>(I)V

    .line 64
    .line 65
    .line 66
    throw p2
.end method

.method public g(Li0/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj0/b;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf/l0;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget-object v1, p0, Lb5/i;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lf/l0;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 23
    .line 24
    check-cast v1, Lj0/b;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1, v0}, Lb5/i;->h(Li0/k0;Lj0/b;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/util/Set;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object p1, p1, Li0/k0;->a:Li0/a2;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    iget-object v0, p0, Lb5/i;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lf/l0;

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_1
    return-void

    .line 69
    :cond_5
    :goto_2
    iget-object v0, p0, Lb5/i;->g:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lj0/b;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public i(Ljava/util/Set;Lx0/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lb5/i;->a()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/i;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public m(Le5/a;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lb5/i;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lb5/h;

    .line 8
    .line 9
    iget-object v3, v0, Lb5/i;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lac/k;

    .line 12
    .line 13
    iget-object v4, v0, Lb5/i;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lb5/c;

    .line 16
    .line 17
    sget-object v5, Lf5/a;->l:Lf5/a;

    .line 18
    .line 19
    iget-object v6, v0, Lb5/i;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Lk5/z;

    .line 22
    .line 23
    iget v7, v6, Lk5/z;->l:I

    .line 24
    .line 25
    invoke-virtual {v5, v7}, Lf5/a;->a(I)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    xor-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    const-string v7, ".method "

    .line 32
    .line 33
    invoke-virtual {v1, v7}, Lq5/a;->write(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget v7, v6, Lk5/z;->l:I

    .line 37
    .line 38
    iget v8, v6, Lk5/z;->p:I

    .line 39
    .line 40
    const/4 v9, 0x7

    .line 41
    if-ne v8, v9, :cond_0

    .line 42
    .line 43
    sget-object v8, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v8}, Lf5/c;->a(I)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static {v8}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    :goto_0
    invoke-static {v1, v7, v8}, Lb5/i;->j(Le5/a;ILjava/util/Set;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6}, Lk5/z;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v1, v7}, Le5/a;->s(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    const-string v7, "("

    .line 65
    .line 66
    invoke-virtual {v1, v7}, Lq5/a;->write(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v7, v0, Lb5/i;->f:Ljava/util/RandomAccess;

    .line 70
    .line 71
    check-cast v7, Lf6/e;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-virtual {v7, v8}, Lf6/e;->i(I)Lf6/c;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    :goto_1
    invoke-virtual {v9}, Lf6/c;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_3

    .line 83
    .line 84
    invoke-virtual {v9}, Lf6/c;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    check-cast v10, Lo5/p;

    .line 89
    .line 90
    iget-object v10, v10, Lo5/p;->l:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v1, v10}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v11, v5, 0x1

    .line 96
    .line 97
    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    const/16 v12, 0x4a

    .line 102
    .line 103
    if-eq v10, v12, :cond_2

    .line 104
    .line 105
    const/16 v12, 0x44

    .line 106
    .line 107
    if-ne v10, v12, :cond_1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    move v5, v11

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    const-string v9, ")"

    .line 116
    .line 117
    invoke-virtual {v1, v9}, Lq5/a;->write(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Lk5/z;->h1()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v1, v9}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    const/16 v9, 0xa

    .line 128
    .line 129
    invoke-virtual {v1, v9}, Lq5/a;->write(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Le5/a;->w()V

    .line 133
    .line 134
    .line 135
    iget-object v10, v4, Lb5/c;->a:Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v10, v4, Lb5/c;->a:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v12, v10

    .line 140
    check-cast v12, La5/a;

    .line 141
    .line 142
    const-string v10, ".registers "

    .line 143
    .line 144
    invoke-virtual {v1, v10}, Lq5/a;->write(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Lac/k;->t()I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual {v1, v10}, Le5/a;->z(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v9}, Lq5/a;->write(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v4, v1, v6, v7}, Lb5/i;->l(Lb5/c;Le5/a;Lk5/z;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    iget-object v7, v0, Lb5/i;->g:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v7, Lb5/k;

    .line 163
    .line 164
    if-nez v7, :cond_4

    .line 165
    .line 166
    new-instance v7, Lb5/k;

    .line 167
    .line 168
    invoke-virtual {v3}, Lac/k;->t()I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-direct {v7, v12, v10, v5}, Lb5/k;-><init>(La5/a;II)V

    .line 173
    .line 174
    .line 175
    iput-object v7, v0, Lb5/i;->g:Ljava/lang/Object;

    .line 176
    .line 177
    :cond_4
    iget-object v5, v6, Lk5/z;->j:Lk5/u;

    .line 178
    .line 179
    iget v6, v6, Lk5/z;->o:I

    .line 180
    .line 181
    invoke-static {v5, v6}, Lo5/e;->a(Lk5/u;I)Ljava/util/Set;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, Ljava/util/Set;

    .line 186
    .line 187
    invoke-static {v1, v5}, Lac/p;->Q(Le5/a;Ljava/util/Set;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v9}, Lq5/a;->write(I)V

    .line 191
    .line 192
    .line 193
    new-instance v5, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    iget-object v6, v0, Lb5/i;->a:Ljava/util/ArrayList;

    .line 199
    .line 200
    move v7, v8

    .line 201
    move v10, v7

    .line 202
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-ge v7, v11, :cond_d

    .line 207
    .line 208
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    check-cast v11, Lt5/d;

    .line 213
    .line 214
    instance-of v14, v11, Lt5/f;

    .line 215
    .line 216
    if-eqz v14, :cond_a

    .line 217
    .line 218
    new-instance v14, Ld5/f;

    .line 219
    .line 220
    iget-object v15, v4, Lb5/c;->a:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v15, La5/a;

    .line 223
    .line 224
    move-object v13, v11

    .line 225
    check-cast v13, Lt5/f;

    .line 226
    .line 227
    invoke-direct {v14, v0, v10, v13}, Ld5/e;-><init>(Lb5/i;ILt5/d;)V

    .line 228
    .line 229
    .line 230
    new-instance v9, Lb5/f;

    .line 231
    .line 232
    invoke-interface {v13}, Lt5/f;->l()I

    .line 233
    .line 234
    .line 235
    move-result v17

    .line 236
    add-int v8, v17, v10

    .line 237
    .line 238
    invoke-interface {v13}, Lt5/d;->i()Lf5/f;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    move-object/from16 v17, v4

    .line 243
    .line 244
    iget v4, v13, Lf5/f;->m:I

    .line 245
    .line 246
    invoke-static {v4}, Lt3/c;->b(I)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    move-object/from16 v18, v6

    .line 251
    .line 252
    if-eqz v4, :cond_9

    .line 253
    .line 254
    const/4 v6, 0x6

    .line 255
    if-eq v4, v6, :cond_9

    .line 256
    .line 257
    const/16 v6, 0xb

    .line 258
    .line 259
    if-eq v4, v6, :cond_8

    .line 260
    .line 261
    const/16 v6, 0x10

    .line 262
    .line 263
    if-eq v4, v6, :cond_8

    .line 264
    .line 265
    const/16 v6, 0x13

    .line 266
    .line 267
    if-eq v4, v6, :cond_9

    .line 268
    .line 269
    const/16 v6, 0x16

    .line 270
    .line 271
    if-eq v4, v6, :cond_5

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    goto :goto_4

    .line 275
    :cond_5
    sget-object v4, Lf5/f;->o:Lf5/f;

    .line 276
    .line 277
    if-ne v13, v4, :cond_6

    .line 278
    .line 279
    const-string v13, "array_"

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_6
    sget-object v4, Lf5/f;->p:Lf5/f;

    .line 283
    .line 284
    if-ne v13, v4, :cond_7

    .line 285
    .line 286
    const-string v13, "pswitch_data_"

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_7
    const-string v13, "sswitch_data_"

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_8
    const-string v13, "cond_"

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_9
    const-string v13, "goto_"

    .line 296
    .line 297
    :goto_4
    invoke-direct {v9, v15, v8, v13}, Lb5/f;-><init>(La5/a;ILjava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iput-object v9, v14, Ld5/f;->j:Lb5/f;

    .line 301
    .line 302
    invoke-virtual {v2, v9}, Lb5/h;->b(Lb5/f;)Lb5/f;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    iput-object v4, v14, Ld5/f;->j:Lb5/f;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_a
    move-object/from16 v17, v4

    .line 310
    .line 311
    move-object/from16 v18, v6

    .line 312
    .line 313
    instance-of v4, v11, Lg5/a;

    .line 314
    .line 315
    if-eqz v4, :cond_b

    .line 316
    .line 317
    new-instance v14, Ld5/a;

    .line 318
    .line 319
    move-object v4, v11

    .line 320
    check-cast v4, Lg5/a;

    .line 321
    .line 322
    const/4 v6, 0x1

    .line 323
    invoke-direct {v14, v0, v10, v4, v6}, Ld5/a;-><init>(Lb5/i;ILt5/d;I)V

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_b
    invoke-interface {v11}, Lt5/d;->i()Lf5/f;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    iget v4, v4, Lf5/f;->m:I

    .line 332
    .line 333
    invoke-static {v4}, Lt3/c;->b(I)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    packed-switch v4, :pswitch_data_0

    .line 338
    .line 339
    .line 340
    new-instance v14, Ld5/e;

    .line 341
    .line 342
    invoke-direct {v14, v0, v10, v11}, Ld5/e;-><init>(Lb5/i;ILt5/d;)V

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :pswitch_0
    new-instance v14, Ld5/n;

    .line 347
    .line 348
    move-object v4, v11

    .line 349
    check-cast v4, Ll5/e0;

    .line 350
    .line 351
    invoke-direct {v14, v0, v10, v4}, Ld5/n;-><init>(Lb5/i;ILl5/e0;)V

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :pswitch_1
    new-instance v14, Ld5/j;

    .line 356
    .line 357
    move-object v4, v11

    .line 358
    check-cast v4, Ll5/c0;

    .line 359
    .line 360
    invoke-direct {v14, v0, v10, v4}, Ld5/j;-><init>(Lb5/i;ILl5/c0;)V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :pswitch_2
    new-instance v14, Ld5/a;

    .line 365
    .line 366
    move-object v4, v11

    .line 367
    check-cast v4, Ll5/b;

    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    invoke-direct {v14, v0, v10, v4, v6}, Ld5/a;-><init>(Lb5/i;ILt5/d;I)V

    .line 371
    .line 372
    .line 373
    :goto_5
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    add-int/lit8 v4, v4, -0x1

    .line 381
    .line 382
    if-eq v7, v4, :cond_c

    .line 383
    .line 384
    new-instance v4, Lb5/a;

    .line 385
    .line 386
    invoke-direct {v4, v10}, Lb5/j;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    :cond_c
    invoke-interface {v11}, Lt5/d;->c()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    add-int/2addr v10, v4

    .line 397
    add-int/lit8 v7, v7, 0x1

    .line 398
    .line 399
    move-object/from16 v4, v17

    .line 400
    .line 401
    move-object/from16 v6, v18

    .line 402
    .line 403
    const/4 v8, 0x0

    .line 404
    const/16 v9, 0xa

    .line 405
    .line 406
    goto/16 :goto_3

    .line 407
    .line 408
    :cond_d
    iget-object v4, v0, Lb5/i;->e:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v4, Lf6/e;

    .line 411
    .line 412
    iget-object v6, v0, Lb5/i;->k:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v6, Landroidx/lifecycle/x;

    .line 415
    .line 416
    iget-object v7, v3, Lac/k;->i:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v7, Lk5/u;

    .line 419
    .line 420
    iget-object v8, v7, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 421
    .line 422
    iget v9, v3, Lac/k;->h:I

    .line 423
    .line 424
    add-int/lit8 v10, v9, 0x6

    .line 425
    .line 426
    invoke-virtual {v8, v10}, Landroidx/lifecycle/x;->P(I)I

    .line 427
    .line 428
    .line 429
    move-result v8

    .line 430
    if-lez v8, :cond_e

    .line 431
    .line 432
    iget-object v7, v7, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 433
    .line 434
    add-int/lit8 v10, v9, 0xc

    .line 435
    .line 436
    invoke-virtual {v7, v10}, Landroidx/lifecycle/x;->N(I)I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    add-int/lit8 v9, v9, 0x10

    .line 441
    .line 442
    const/4 v10, 0x2

    .line 443
    const/4 v11, 0x3

    .line 444
    invoke-static {v7, v10, v9, v11}, Lp/a;->g(IIII)I

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    and-int/lit8 v7, v7, -0x4

    .line 449
    .line 450
    mul-int/lit8 v9, v8, 0x8

    .line 451
    .line 452
    add-int/2addr v9, v7

    .line 453
    new-instance v10, Lk5/c0;

    .line 454
    .line 455
    invoke-direct {v10, v3, v7, v9, v8}, Lk5/c0;-><init>(Lac/k;III)V

    .line 456
    .line 457
    .line 458
    goto :goto_6

    .line 459
    :cond_e
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 460
    .line 461
    :goto_6
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    if-nez v7, :cond_10

    .line 466
    .line 467
    :cond_f
    const/4 v9, 0x0

    .line 468
    goto/16 :goto_8

    .line 469
    .line 470
    :cond_10
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 471
    .line 472
    .line 473
    move-result v7

    .line 474
    add-int/lit8 v7, v7, -0x1

    .line 475
    .line 476
    invoke-virtual {v6, v7}, Landroidx/lifecycle/x;->u(I)I

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    add-int/lit8 v8, v8, -0x1

    .line 485
    .line 486
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    check-cast v4, Lt5/d;

    .line 491
    .line 492
    invoke-interface {v4}, Lt5/d;->c()I

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    add-int/2addr v4, v7

    .line 497
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    :cond_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 502
    .line 503
    .line 504
    move-result v8

    .line 505
    if-eqz v8, :cond_f

    .line 506
    .line 507
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    check-cast v8, Lk5/f0;

    .line 512
    .line 513
    invoke-virtual {v8}, Lk5/f0;->c()I

    .line 514
    .line 515
    .line 516
    move-result v9

    .line 517
    invoke-virtual {v8}, Lk5/f0;->a()I

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    add-int/2addr v10, v9

    .line 522
    if-ge v9, v4, :cond_14

    .line 523
    .line 524
    if-gt v10, v4, :cond_13

    .line 525
    .line 526
    add-int/lit8 v11, v10, -0x1

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    invoke-virtual {v6, v11, v13}, Landroidx/lifecycle/x;->x(IZ)I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    invoke-virtual {v6, v11}, Landroidx/lifecycle/x;->u(I)I

    .line 534
    .line 535
    .line 536
    move-result v14

    .line 537
    invoke-virtual {v8}, Lk5/f0;->b()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v8

    .line 545
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    if-eqz v11, :cond_11

    .line 550
    .line 551
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    check-cast v11, Lk5/v;

    .line 556
    .line 557
    invoke-virtual {v11}, Lk5/v;->b()I

    .line 558
    .line 559
    .line 560
    move-result v15

    .line 561
    if-ge v15, v4, :cond_12

    .line 562
    .line 563
    move-object/from16 v17, v11

    .line 564
    .line 565
    new-instance v11, Lb5/b;

    .line 566
    .line 567
    iget-object v13, v0, Lb5/i;->h:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v13, Lb5/h;

    .line 570
    .line 571
    invoke-virtual/range {v17 .. v17}, Lk5/v;->a()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v17

    .line 575
    move/from16 v16, v9

    .line 576
    .line 577
    move/from16 v18, v15

    .line 578
    .line 579
    move-object/from16 v15, v17

    .line 580
    .line 581
    const/4 v9, 0x0

    .line 582
    const/16 v19, 0x0

    .line 583
    .line 584
    move/from16 v17, v10

    .line 585
    .line 586
    invoke-direct/range {v11 .. v18}, Lb5/b;-><init>(La5/a;Lb5/h;ILjava/lang/String;III)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move/from16 v9, v16

    .line 593
    .line 594
    move/from16 v13, v19

    .line 595
    .line 596
    goto :goto_7

    .line 597
    :cond_12
    move/from16 v18, v15

    .line 598
    .line 599
    const/4 v9, 0x0

    .line 600
    new-instance v1, Ld6/f;

    .line 601
    .line 602
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    const-string v3, "Exception handler offset %d is past the end of the code block."

    .line 611
    .line 612
    invoke-direct {v1, v9, v3, v2}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    throw v1

    .line 616
    :cond_13
    move/from16 v17, v10

    .line 617
    .line 618
    new-instance v1, Ljava/lang/RuntimeException;

    .line 619
    .line 620
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const-string v3, "Try end offset %d is past the end of the code block."

    .line 629
    .line 630
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw v1

    .line 638
    :cond_14
    move/from16 v16, v9

    .line 639
    .line 640
    new-instance v1, Ljava/lang/RuntimeException;

    .line 641
    .line 642
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const-string v3, "Try start offset %d is past the end of the code block."

    .line 651
    .line 652
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw v1

    .line 660
    :goto_8
    invoke-virtual {v3}, Lac/k;->n()Lo5/j;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-eqz v4, :cond_15

    .line 673
    .line 674
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    check-cast v4, Lx5/a;

    .line 679
    .line 680
    iget-object v6, v0, Lb5/i;->g:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v6, Lb5/k;

    .line 683
    .line 684
    iget v7, v4, Lx5/a;->g:I

    .line 685
    .line 686
    invoke-virtual {v4}, Lx5/a;->a()I

    .line 687
    .line 688
    .line 689
    move-result v8

    .line 690
    const/4 v10, -0x4

    .line 691
    packed-switch v8, :pswitch_data_1

    .line 692
    .line 693
    .line 694
    :pswitch_3
    new-instance v1, Ld6/f;

    .line 695
    .line 696
    invoke-virtual {v4}, Lx5/a;->a()I

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    const-string v3, "Invalid debug item type: %d"

    .line 709
    .line 710
    invoke-direct {v1, v9, v3, v2}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    throw v1

    .line 714
    :pswitch_4
    new-instance v6, Lc5/d;

    .line 715
    .line 716
    check-cast v4, Lx5/d;

    .line 717
    .line 718
    invoke-direct {v6, v7, v4}, Lc5/d;-><init>(ILx5/d;)V

    .line 719
    .line 720
    .line 721
    goto :goto_b

    .line 722
    :pswitch_5
    new-instance v6, Lc5/e;

    .line 723
    .line 724
    check-cast v4, Lx5/f;

    .line 725
    .line 726
    invoke-direct {v6, v7, v4}, Lc5/e;-><init>(ILx5/f;)V

    .line 727
    .line 728
    .line 729
    goto :goto_b

    .line 730
    :pswitch_6
    new-instance v6, Lc5/a;

    .line 731
    .line 732
    const/4 v4, 0x0

    .line 733
    invoke-direct {v6, v7, v10, v4}, Lc5/a;-><init>(III)V

    .line 734
    .line 735
    .line 736
    goto :goto_b

    .line 737
    :pswitch_7
    new-instance v6, Lc5/a;

    .line 738
    .line 739
    const/4 v4, 0x1

    .line 740
    invoke-direct {v6, v7, v10, v4}, Lc5/a;-><init>(III)V

    .line 741
    .line 742
    .line 743
    goto :goto_b

    .line 744
    :pswitch_8
    new-instance v8, Lc5/c;

    .line 745
    .line 746
    check-cast v4, Lx5/e;

    .line 747
    .line 748
    const/4 v10, 0x1

    .line 749
    invoke-direct {v8, v7, v6, v4, v10}, Lc5/c;-><init>(ILb5/k;Lx5/a;I)V

    .line 750
    .line 751
    .line 752
    :goto_a
    move-object v6, v8

    .line 753
    goto :goto_b

    .line 754
    :pswitch_9
    new-instance v8, Lc5/c;

    .line 755
    .line 756
    check-cast v4, Lx5/b;

    .line 757
    .line 758
    const/4 v10, 0x0

    .line 759
    invoke-direct {v8, v7, v6, v4, v10}, Lc5/c;-><init>(ILb5/k;Lx5/a;I)V

    .line 760
    .line 761
    .line 762
    goto :goto_a

    .line 763
    :pswitch_a
    new-instance v8, Lc5/c;

    .line 764
    .line 765
    check-cast v4, Lx5/g;

    .line 766
    .line 767
    const/4 v10, 0x2

    .line 768
    invoke-direct {v8, v7, v6, v4, v10}, Lc5/c;-><init>(ILb5/k;Lx5/a;I)V

    .line 769
    .line 770
    .line 771
    goto :goto_a

    .line 772
    :goto_b
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    goto :goto_9

    .line 776
    :cond_15
    iget-object v2, v2, Lb5/h;->a:Ljava/util/HashMap;

    .line 777
    .line 778
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    if-eqz v3, :cond_16

    .line 791
    .line 792
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    check-cast v3, Lb5/f;

    .line 797
    .line 798
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    goto :goto_c

    .line 802
    :cond_16
    invoke-static {v5}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    if-eqz v3, :cond_18

    .line 814
    .line 815
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    check-cast v3, Lb5/j;

    .line 820
    .line 821
    invoke-virtual {v3, v1}, Lb5/j;->c(Le5/a;)Z

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    if-eqz v3, :cond_17

    .line 826
    .line 827
    const/16 v3, 0xa

    .line 828
    .line 829
    invoke-virtual {v1, v3}, Lq5/a;->write(I)V

    .line 830
    .line 831
    .line 832
    goto :goto_d

    .line 833
    :cond_17
    const/16 v3, 0xa

    .line 834
    .line 835
    goto :goto_d

    .line 836
    :cond_18
    invoke-virtual {v1}, Le5/a;->u()V

    .line 837
    .line 838
    .line 839
    const-string v2, ".end method\n"

    .line 840
    .line 841
    invoke-virtual {v1, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    return-void

    .line 845
    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_a
        :pswitch_3
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
