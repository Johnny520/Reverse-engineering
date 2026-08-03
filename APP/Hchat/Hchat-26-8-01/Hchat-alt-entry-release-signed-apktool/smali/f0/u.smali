.class public final Lf0/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lf0/n;

.field public c:Lfg/l;

.field public d:Lfg/l;

.field public e:Lw/q0;

.field public f:Lh0/d1;

.field public g:Ly1/l2;

.field public h:Ln2/s;

.field public i:Ln2/j;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/lang/Object;

.field public l:Landroid/graphics/Rect;

.field public final m:Lf0/r;


# direct methods
.method public constructor <init>(Landroid/view/View;Lf0/a;Lf0/n;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/u;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p3, p0, Lf0/u;->b:Lf0/n;

    .line 7
    .line 8
    new-instance p1, Le9/h;

    .line 9
    .line 10
    const/16 v0, 0x15

    .line 11
    .line 12
    invoke-direct {p1, v0}, Le9/h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lf0/u;->c:Lfg/l;

    .line 16
    .line 17
    new-instance p1, Le9/h;

    .line 18
    .line 19
    const/16 v0, 0x16

    .line 20
    .line 21
    invoke-direct {p1, v0}, Le9/h;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lf0/u;->d:Lfg/l;

    .line 25
    .line 26
    new-instance p1, Ln2/s;

    .line 27
    .line 28
    sget-wide v0, Li2/m0;->b:J

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    const-string v3, ""

    .line 32
    .line 33
    invoke-direct {p1, v2, v3, v0, v1}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lf0/u;->h:Ln2/s;

    .line 37
    .line 38
    sget-object p1, Ln2/j;->g:Ln2/j;

    .line 39
    .line 40
    iput-object p1, p0, Lf0/u;->i:Ln2/j;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance p1, Lab/a;

    .line 50
    .line 51
    const/16 v0, 0x12

    .line 52
    .line 53
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lsf/d;->h:Lsf/d;

    .line 57
    .line 58
    invoke-static {v0, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lf0/u;->k:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance p1, Lf0/r;

    .line 65
    .line 66
    invoke-direct {p1, p2, p3}, Lf0/r;-><init>(Lf0/a;Lf0/n;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lf0/u;->m:Lf0/r;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)Lf0/v;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lf0/u;->h:Ln2/s;

    .line 6
    .line 7
    iget-object v3, v2, Ln2/s;->a:Li2/g;

    .line 8
    .line 9
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v4, v2, Ln2/s;->b:J

    .line 12
    .line 13
    iget-object v2, v0, Lf0/u;->i:Ln2/j;

    .line 14
    .line 15
    iget v6, v2, Ln2/j;->e:I

    .line 16
    .line 17
    iget v7, v2, Ln2/j;->d:I

    .line 18
    .line 19
    iget-boolean v8, v2, Ln2/j;->a:Z

    .line 20
    .line 21
    const/4 v10, 0x4

    .line 22
    const/4 v11, 0x5

    .line 23
    const/4 v13, 0x7

    .line 24
    const/4 v14, 0x6

    .line 25
    const/4 v15, 0x3

    .line 26
    const/4 v12, 0x2

    .line 27
    const/4 v9, 0x1

    .line 28
    if-ne v6, v9, :cond_1

    .line 29
    .line 30
    if-eqz v8, :cond_0

    .line 31
    .line 32
    :goto_0
    move v6, v14

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v6, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-nez v6, :cond_2

    .line 37
    .line 38
    move v6, v9

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-ne v6, v12, :cond_3

    .line 41
    .line 42
    move v6, v12

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    if-ne v6, v14, :cond_4

    .line 45
    .line 46
    move v6, v11

    .line 47
    goto :goto_1

    .line 48
    :cond_4
    if-ne v6, v11, :cond_5

    .line 49
    .line 50
    move v6, v13

    .line 51
    goto :goto_1

    .line 52
    :cond_5
    if-ne v6, v15, :cond_6

    .line 53
    .line 54
    move v6, v15

    .line 55
    goto :goto_1

    .line 56
    :cond_6
    if-ne v6, v10, :cond_7

    .line 57
    .line 58
    move v6, v10

    .line 59
    goto :goto_1

    .line 60
    :cond_7
    if-ne v6, v13, :cond_1c

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_1
    iput v6, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 64
    .line 65
    iget-object v6, v2, Ln2/j;->f:Lp2/b;

    .line 66
    .line 67
    sget-object v13, Lp2/b;->i:Lp2/b;

    .line 68
    .line 69
    invoke-static {v6, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-eqz v13, :cond_8

    .line 74
    .line 75
    const/4 v13, 0x0

    .line 76
    iput-object v13, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_8
    new-instance v13, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {v6}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iget-object v6, v6, Lp2/b;->g:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-eqz v14, :cond_9

    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    check-cast v14, Lp2/a;

    .line 105
    .line 106
    iget-object v14, v14, Lp2/a;->a:Ljava/util/Locale;

    .line 107
    .line 108
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_9
    const/4 v14, 0x0

    .line 113
    new-array v6, v14, [Ljava/util/Locale;

    .line 114
    .line 115
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, [Ljava/util/Locale;

    .line 120
    .line 121
    array-length v13, v6

    .line 122
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, [Ljava/util/Locale;

    .line 127
    .line 128
    new-instance v13, Landroid/os/LocaleList;

    .line 129
    .line 130
    invoke-direct {v13, v6}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 131
    .line 132
    .line 133
    iput-object v13, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    .line 134
    .line 135
    :goto_3
    const/16 v6, 0x9

    .line 136
    .line 137
    const/16 v13, 0x8

    .line 138
    .line 139
    if-ne v7, v9, :cond_a

    .line 140
    .line 141
    :goto_4
    move v10, v9

    .line 142
    goto :goto_5

    .line 143
    :cond_a
    if-ne v7, v12, :cond_b

    .line 144
    .line 145
    iget v10, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 146
    .line 147
    const/high16 v11, -0x80000000

    .line 148
    .line 149
    or-int/2addr v10, v11

    .line 150
    iput v10, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_b
    if-ne v7, v15, :cond_c

    .line 154
    .line 155
    move v10, v12

    .line 156
    goto :goto_5

    .line 157
    :cond_c
    if-ne v7, v10, :cond_d

    .line 158
    .line 159
    move v10, v15

    .line 160
    goto :goto_5

    .line 161
    :cond_d
    if-ne v7, v11, :cond_e

    .line 162
    .line 163
    const/16 v10, 0x11

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_e
    const/4 v10, 0x6

    .line 167
    if-ne v7, v10, :cond_f

    .line 168
    .line 169
    const/16 v10, 0x21

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_f
    const/4 v10, 0x7

    .line 173
    if-ne v7, v10, :cond_10

    .line 174
    .line 175
    const/16 v10, 0x81

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_10
    if-ne v7, v13, :cond_11

    .line 179
    .line 180
    const/16 v10, 0x12

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_11
    if-ne v7, v6, :cond_1b

    .line 184
    .line 185
    const/16 v10, 0x2002

    .line 186
    .line 187
    :goto_5
    iput v10, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 188
    .line 189
    if-nez v8, :cond_12

    .line 190
    .line 191
    and-int/lit8 v8, v10, 0x1

    .line 192
    .line 193
    if-ne v8, v9, :cond_12

    .line 194
    .line 195
    const/high16 v8, 0x20000

    .line 196
    .line 197
    or-int/2addr v8, v10

    .line 198
    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 199
    .line 200
    iget v8, v2, Ln2/j;->e:I

    .line 201
    .line 202
    if-ne v8, v9, :cond_12

    .line 203
    .line 204
    iget v8, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 205
    .line 206
    const/high16 v10, 0x40000000    # 2.0f

    .line 207
    .line 208
    or-int/2addr v8, v10

    .line 209
    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 210
    .line 211
    :cond_12
    iget v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 212
    .line 213
    and-int/lit8 v10, v8, 0x1

    .line 214
    .line 215
    if-ne v10, v9, :cond_16

    .line 216
    .line 217
    iget v10, v2, Ln2/j;->b:I

    .line 218
    .line 219
    if-ne v10, v9, :cond_13

    .line 220
    .line 221
    or-int/lit16 v8, v8, 0x1000

    .line 222
    .line 223
    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_13
    if-ne v10, v12, :cond_14

    .line 227
    .line 228
    or-int/lit16 v8, v8, 0x2000

    .line 229
    .line 230
    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_14
    if-ne v10, v15, :cond_15

    .line 234
    .line 235
    or-int/lit16 v8, v8, 0x4000

    .line 236
    .line 237
    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 238
    .line 239
    :cond_15
    :goto_6
    iget-boolean v2, v2, Ln2/j;->c:Z

    .line 240
    .line 241
    if-eqz v2, :cond_16

    .line 242
    .line 243
    iget v2, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 244
    .line 245
    const v8, 0x8000

    .line 246
    .line 247
    .line 248
    or-int/2addr v2, v8

    .line 249
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 250
    .line 251
    :cond_16
    sget v2, Li2/m0;->c:I

    .line 252
    .line 253
    const/16 v2, 0x20

    .line 254
    .line 255
    shr-long v10, v4, v2

    .line 256
    .line 257
    long-to-int v2, v10

    .line 258
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 259
    .line 260
    const-wide v10, 0xffffffffL

    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    and-long/2addr v4, v10

    .line 266
    long-to-int v2, v4

    .line 267
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 268
    .line 269
    invoke-static {v1, v3}, Lr9/e0;->k0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    iget v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 273
    .line 274
    const/high16 v3, 0x2000000

    .line 275
    .line 276
    or-int/2addr v2, v3

    .line 277
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 278
    .line 279
    sget-boolean v2, Le0/e;->a:Z

    .line 280
    .line 281
    if-eqz v2, :cond_17

    .line 282
    .line 283
    const/4 v10, 0x7

    .line 284
    if-ne v7, v10, :cond_18

    .line 285
    .line 286
    :cond_17
    :goto_7
    const/4 v14, 0x0

    .line 287
    goto :goto_8

    .line 288
    :cond_18
    if-ne v7, v13, :cond_19

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_19
    invoke-static {v1, v9}, Lr9/e0;->l0(Landroid/view/inputmethod/EditorInfo;Z)V

    .line 292
    .line 293
    .line 294
    invoke-static {}, Lb0/a0;->l()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v16

    .line 298
    invoke-static {}, Lb0/a0;->w()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-result-object v17

    .line 302
    invoke-static {}, Lb0/a0;->s()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v18

    .line 306
    invoke-static {}, Lb0/a0;->u()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object v19

    .line 310
    invoke-static {}, Lb0/a0;->y()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v20

    .line 314
    invoke-static {}, Lb0/a0;->A()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v21

    .line 318
    invoke-static {}, Lb0/a0;->C()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    move-result-object v22

    .line 322
    filled-new-array/range {v16 .. v22}, [Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v1, v2}, Lb0/a0;->o(Landroid/view/inputmethod/EditorInfo;Ljava/util/List;)V

    .line 331
    .line 332
    .line 333
    invoke-static {}, Lb0/a0;->l()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-static {}, Lb0/a0;->w()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-static {}, Lb0/a0;->s()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-static {}, Lb0/a0;->u()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-static {v2}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-static {v1, v2}, Lb0/a0;->p(Landroid/view/inputmethod/EditorInfo;Ljava/util/Set;)V

    .line 358
    .line 359
    .line 360
    goto :goto_9

    .line 361
    :goto_8
    invoke-static {v1, v14}, Lr9/e0;->l0(Landroid/view/inputmethod/EditorInfo;Z)V

    .line 362
    .line 363
    .line 364
    :goto_9
    sget-object v2, Lf0/t;->a:Lf0/s;

    .line 365
    .line 366
    invoke-static {}, Ll3/i;->d()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-nez v2, :cond_1a

    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_1a
    invoke-static {}, Ll3/i;->a()Ll3/i;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2, v1}, Ll3/i;->g(Landroid/view/inputmethod/EditorInfo;)V

    .line 378
    .line 379
    .line 380
    :goto_a
    iget-object v8, v0, Lf0/u;->h:Ln2/s;

    .line 381
    .line 382
    iget-object v1, v0, Lf0/u;->i:Ln2/j;

    .line 383
    .line 384
    iget-boolean v10, v1, Ln2/j;->c:Z

    .line 385
    .line 386
    new-instance v9, Landroidx/lifecycle/x;

    .line 387
    .line 388
    invoke-direct {v9, v0, v6}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 389
    .line 390
    .line 391
    iget-object v11, v0, Lf0/u;->e:Lw/q0;

    .line 392
    .line 393
    iget-object v12, v0, Lf0/u;->f:Lh0/d1;

    .line 394
    .line 395
    iget-object v13, v0, Lf0/u;->g:Ly1/l2;

    .line 396
    .line 397
    new-instance v7, Lf0/v;

    .line 398
    .line 399
    invoke-direct/range {v7 .. v13}, Lf0/v;-><init>(Ln2/s;Landroidx/lifecycle/x;ZLw/q0;Lh0/d1;Ly1/l2;)V

    .line 400
    .line 401
    .line 402
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 403
    .line 404
    invoke-direct {v1, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iget-object v2, v0, Lf0/u;->j:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    return-object v7

    .line 413
    :cond_1b
    const-string v1, "Invalid Keyboard Type"

    .line 414
    .line 415
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const/16 v16, 0x0

    .line 419
    .line 420
    return-object v16

    .line 421
    :cond_1c
    const/16 v16, 0x0

    .line 422
    .line 423
    const-string v1, "invalid ImeAction"

    .line 424
    .line 425
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return-object v16
.end method
