.class public final synthetic Lca/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lca/k;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput p4, p0, Lca/k;->j:I

    .line 9
    .line 10
    iput-object p2, p0, Lca/k;->h:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, p0, Lca/k;->i:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Lca/k;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p5, p0, Lca/k;->g:I

    iput-object p1, p0, Lca/k;->h:Ljava/lang/Object;

    iput p2, p0, Lca/k;->j:I

    iput-object p3, p0, Lca/k;->i:Ljava/lang/Object;

    iput-object p4, p0, Lca/k;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 18
    iput p5, p0, Lca/k;->g:I

    iput-object p1, p0, Lca/k;->h:Ljava/lang/Object;

    iput-object p2, p0, Lca/k;->i:Ljava/lang/Object;

    iput-object p3, p0, Lca/k;->k:Ljava/lang/Object;

    iput p4, p0, Lca/k;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([Lv1/b1;Lp/e1;I[I)V
    .locals 1

    .line 19
    const/4 v0, 0x4

    iput v0, p0, Lca/k;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/k;->h:Ljava/lang/Object;

    iput-object p2, p0, Lca/k;->i:Ljava/lang/Object;

    iput p3, p0, Lca/k;->j:I

    iput-object p4, p0, Lca/k;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lca/k;->g:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, v0, Lca/k;->j:I

    .line 11
    .line 12
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    iget-object v8, v0, Lca/k;->k:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, Lca/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v0, Lca/k;->h:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v10, Ljava/util/List;

    .line 24
    .line 25
    check-cast v9, Lfg/l;

    .line 26
    .line 27
    check-cast v8, Ldb/c;

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v6, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {v8, v2}, Lwb/ho;->p7(Ldb/c;Ljava/util/ArrayList;)Ldb/c;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v9, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v7

    .line 50
    :pswitch_0
    check-cast v10, Landroid/content/Context;

    .line 51
    .line 52
    check-cast v9, Landroid/content/SharedPreferences;

    .line 53
    .line 54
    check-cast v8, Li0/a1;

    .line 55
    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    if-ne v6, v5, :cond_0

    .line 68
    .line 69
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    invoke-static {v10, v1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_0
    invoke-interface {v8, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "hb_notify_sound_mode"

    .line 83
    .line 84
    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v3, "hb_notify_sound_uri"

    .line 89
    .line 90
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-object v7

    .line 98
    :pswitch_1
    check-cast v10, Li0/a1;

    .line 99
    .line 100
    move-object v11, v9

    .line 101
    check-cast v11, Lk9/j;

    .line 102
    .line 103
    check-cast v8, Landroid/content/Context;

    .line 104
    .line 105
    check-cast v1, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v17

    .line 111
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v1}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v18, 0x3f

    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    invoke-static/range {v11 .. v18}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    invoke-static {v8, v10, v1}, Lwb/ho;->V0(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 137
    .line 138
    .line 139
    return-object v7

    .line 140
    :pswitch_2
    check-cast v10, Lu2/c;

    .line 141
    .line 142
    check-cast v9, Li0/f1;

    .line 143
    .line 144
    check-cast v8, Li0/f1;

    .line 145
    .line 146
    check-cast v1, Lv1/t;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1}, Lv1/t;->F()J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    const/16 v3, 0x20

    .line 156
    .line 157
    shr-long/2addr v1, v3

    .line 158
    long-to-int v1, v1

    .line 159
    int-to-float v1, v1

    .line 160
    invoke-virtual {v9, v1}, Li0/f1;->h(F)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9}, Li0/f1;->g()F

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    const/16 v2, 0x8

    .line 168
    .line 169
    int-to-float v2, v2

    .line 170
    invoke-interface {v10, v2}, Lu2/c;->x0(F)F

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    sub-float/2addr v1, v2

    .line 175
    int-to-float v2, v6

    .line 176
    div-float/2addr v1, v2

    .line 177
    const/4 v2, 0x0

    .line 178
    cmpg-float v3, v1, v2

    .line 179
    .line 180
    if-gez v3, :cond_2

    .line 181
    .line 182
    move v1, v2

    .line 183
    :cond_2
    invoke-virtual {v8, v1}, Li0/f1;->h(F)V

    .line 184
    .line 185
    .line 186
    return-object v7

    .line 187
    :pswitch_3
    check-cast v10, Lw/l0;

    .line 188
    .line 189
    check-cast v9, Lv1/p0;

    .line 190
    .line 191
    check-cast v8, Lv1/b1;

    .line 192
    .line 193
    move-object v11, v1

    .line 194
    check-cast v11, Lv1/a1;

    .line 195
    .line 196
    iget v12, v10, Lw/l0;->b:I

    .line 197
    .line 198
    iget-object v1, v10, Lw/l0;->a:Lw/j1;

    .line 199
    .line 200
    iget-object v13, v10, Lw/l0;->c:Ln2/z;

    .line 201
    .line 202
    iget-object v2, v10, Lw/l0;->d:Lfg/a;

    .line 203
    .line 204
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Lw/m1;

    .line 209
    .line 210
    if-eqz v2, :cond_3

    .line 211
    .line 212
    iget-object v4, v2, Lw/m1;->a:Li2/k0;

    .line 213
    .line 214
    :cond_3
    move-object v14, v4

    .line 215
    invoke-interface {v9}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    sget-object v4, Lu2/m;->h:Lu2/m;

    .line 220
    .line 221
    if-ne v2, v4, :cond_4

    .line 222
    .line 223
    move v15, v5

    .line 224
    goto :goto_0

    .line 225
    :cond_4
    move v15, v3

    .line 226
    :goto_0
    iget v2, v8, Lv1/b1;->g:I

    .line 227
    .line 228
    move/from16 v16, v2

    .line 229
    .line 230
    invoke-static/range {v11 .. v16}, Lw/s;->k(Lv1/a1;ILn2/z;Li2/k0;ZI)Le1/c;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget-object v4, Lm/p1;->h:Lm/p1;

    .line 235
    .line 236
    iget v5, v8, Lv1/b1;->g:I

    .line 237
    .line 238
    invoke-virtual {v1, v4, v2, v6, v5}, Lw/j1;->a(Lm/p1;Le1/c;II)V

    .line 239
    .line 240
    .line 241
    iget-object v1, v1, Lw/j1;->a:Li0/f1;

    .line 242
    .line 243
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    neg-float v1, v1

    .line 248
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    invoke-static {v11, v8, v1, v3}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 253
    .line 254
    .line 255
    return-object v7

    .line 256
    :pswitch_4
    check-cast v10, [Lv1/b1;

    .line 257
    .line 258
    check-cast v9, Lp/e1;

    .line 259
    .line 260
    check-cast v8, [I

    .line 261
    .line 262
    check-cast v1, Lv1/a1;

    .line 263
    .line 264
    array-length v2, v10

    .line 265
    move v5, v3

    .line 266
    :goto_1
    if-ge v3, v2, :cond_8

    .line 267
    .line 268
    aget-object v11, v10, v3

    .line 269
    .line 270
    add-int/lit8 v12, v5, 0x1

    .line 271
    .line 272
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v11}, Lv1/b1;->X()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    instance-of v14, v13, Lp/c1;

    .line 280
    .line 281
    if-eqz v14, :cond_5

    .line 282
    .line 283
    check-cast v13, Lp/c1;

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_5
    move-object v13, v4

    .line 287
    :goto_2
    if-eqz v13, :cond_6

    .line 288
    .line 289
    iget-object v13, v13, Lp/c1;->c:Lp/x;

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_6
    move-object v13, v4

    .line 293
    :goto_3
    if-eqz v13, :cond_7

    .line 294
    .line 295
    iget v14, v11, Lv1/b1;->h:I

    .line 296
    .line 297
    iget-object v13, v13, Lp/x;->a:Ly0/f;

    .line 298
    .line 299
    invoke-virtual {v13, v14, v6}, Ly0/f;->a(II)I

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    goto :goto_4

    .line 304
    :cond_7
    iget-object v13, v9, Lp/e1;->b:Ly0/f;

    .line 305
    .line 306
    iget v14, v11, Lv1/b1;->h:I

    .line 307
    .line 308
    invoke-virtual {v13, v14, v6}, Ly0/f;->a(II)I

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    :goto_4
    aget v5, v8, v5

    .line 313
    .line 314
    invoke-static {v1, v11, v5, v13}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 315
    .line 316
    .line 317
    add-int/lit8 v3, v3, 0x1

    .line 318
    .line 319
    move v5, v12

    .line 320
    goto :goto_1

    .line 321
    :cond_8
    return-object v7

    .line 322
    :pswitch_5
    check-cast v10, Li0/x;

    .line 323
    .line 324
    check-cast v9, Ls0/e;

    .line 325
    .line 326
    check-cast v8, Lf/b0;

    .line 327
    .line 328
    if-eq v1, v10, :cond_b

    .line 329
    .line 330
    instance-of v2, v1, Lw0/u;

    .line 331
    .line 332
    if-eqz v2, :cond_a

    .line 333
    .line 334
    iget v2, v9, Ls0/e;->a:I

    .line 335
    .line 336
    sub-int/2addr v2, v6

    .line 337
    invoke-virtual {v8, v1}, Lf/b0;->d(Ljava/lang/Object;)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-ltz v3, :cond_9

    .line 342
    .line 343
    iget-object v4, v8, Lf/b0;->c:[I

    .line 344
    .line 345
    aget v3, v4, v3

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_9
    const v3, 0x7fffffff

    .line 349
    .line 350
    .line 351
    :goto_5
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    invoke-virtual {v8, v2, v1}, Lf/b0;->g(ILjava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_a
    move-object v4, v7

    .line 359
    goto :goto_6

    .line 360
    :cond_b
    const-string v1, "A derived state calculation cannot read itself"

    .line 361
    .line 362
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :goto_6
    return-object v4

    .line 366
    :pswitch_6
    check-cast v10, Lca/e0;

    .line 367
    .line 368
    check-cast v9, Landroid/app/Activity;

    .line 369
    .line 370
    check-cast v8, Ljava/util/List;

    .line 371
    .line 372
    check-cast v1, Lp8/c;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Lp8/c;->a()Luf/c;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    new-instance v11, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-eqz v3, :cond_c

    .line 399
    .line 400
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    check-cast v3, Lwb/jv;

    .line 405
    .line 406
    iget-object v3, v3, Lwb/jv;->a:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_c
    const-string v13, "\u7fa4\u53d1\u52a9\u624b"

    .line 413
    .line 414
    iget v12, v0, Lca/k;->j:I

    .line 415
    .line 416
    move-object v8, v10

    .line 417
    move-object v10, v1

    .line 418
    invoke-virtual/range {v8 .. v13}, Lca/e0;->n(Landroid/app/Activity;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 419
    .line 420
    .line 421
    return-object v7

    .line 422
    :pswitch_7
    move-object v14, v10

    .line 423
    check-cast v14, Lca/e0;

    .line 424
    .line 425
    move-object v15, v9

    .line 426
    check-cast v15, Landroid/app/Activity;

    .line 427
    .line 428
    move-object/from16 v16, v8

    .line 429
    .line 430
    check-cast v16, Lhb/t;

    .line 431
    .line 432
    check-cast v1, Ljava/util/List;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    new-instance v2, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_d

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    check-cast v3, Lwb/jv;

    .line 461
    .line 462
    iget-object v3, v3, Lwb/jv;->a:Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_d
    const-string v19, "\u7fa4\u53d1\u52a9\u624b"

    .line 469
    .line 470
    iget v1, v0, Lca/k;->j:I

    .line 471
    .line 472
    move/from16 v18, v1

    .line 473
    .line 474
    move-object/from16 v17, v2

    .line 475
    .line 476
    invoke-virtual/range {v14 .. v19}, Lca/e0;->o(Landroid/app/Activity;Lhb/t;Ljava/util/List;ILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    return-object v7

    .line 480
    :pswitch_8
    check-cast v10, Lca/e0;

    .line 481
    .line 482
    check-cast v9, Landroid/app/Activity;

    .line 483
    .line 484
    move-object v2, v8

    .line 485
    check-cast v2, Lp8/v;

    .line 486
    .line 487
    move-object v11, v1

    .line 488
    check-cast v11, Ljava/util/List;

    .line 489
    .line 490
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    new-instance v8, Lca/k;

    .line 494
    .line 495
    const/4 v13, 0x2

    .line 496
    iget v12, v0, Lca/k;->j:I

    .line 497
    .line 498
    move-object/from16 v20, v10

    .line 499
    .line 500
    move-object v10, v9

    .line 501
    move-object/from16 v9, v20

    .line 502
    .line 503
    invoke-direct/range {v8 .. v13}, Lca/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 504
    .line 505
    .line 506
    const-string v1, "\u7fa4\u53d1\u52a9\u624b"

    .line 507
    .line 508
    invoke-virtual {v9, v10, v2, v1, v8}, Lca/e0;->k(Landroid/app/Activity;Lp8/v;Ljava/lang/String;Lfg/l;)V

    .line 509
    .line 510
    .line 511
    return-object v7

    .line 512
    nop

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
