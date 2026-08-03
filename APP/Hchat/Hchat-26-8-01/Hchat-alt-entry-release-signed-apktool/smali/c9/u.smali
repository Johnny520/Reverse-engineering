.class public final synthetic Lc9/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc9/u;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/u;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/u;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/u;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lc9/u;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lc9/u;->j:Z

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;ZLaa/c;)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lc9/u;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/u;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/u;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc9/u;->k:Ljava/lang/Object;

    iput-boolean p4, p0, Lc9/u;->j:Z

    iput-object p5, p0, Lc9/u;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lia/q;Ljava/lang/String;ZLandroid/app/Activity;Lp8/l;)V
    .locals 1

    .line 19
    const/4 v0, 0x2

    iput v0, p0, Lc9/u;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/u;->k:Ljava/lang/Object;

    iput-object p2, p0, Lc9/u;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lc9/u;->j:Z

    iput-object p4, p0, Lc9/u;->h:Ljava/lang/Object;

    iput-object p5, p0, Lc9/u;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p6, p0, Lc9/u;->g:I

    iput-object p1, p0, Lc9/u;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc9/u;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lc9/u;->j:Z

    iput-object p4, p0, Lc9/u;->k:Ljava/lang/Object;

    iput-object p5, p0, Lc9/u;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/u;->g:I

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget-boolean v6, v0, Lc9/u;->j:Z

    .line 10
    .line 11
    iget-object v7, v0, Lc9/u;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v0, Lc9/u;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v9, v0, Lc9/u;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v10, v0, Lc9/u;->h:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v10, Lwb/m3;

    .line 23
    .line 24
    check-cast v9, Lu2/c;

    .line 25
    .line 26
    check-cast v8, Li0/f1;

    .line 27
    .line 28
    check-cast v7, Li0/f1;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Le1/b;

    .line 33
    .line 34
    iget-object v2, v10, Lwb/m3;->a:Lxb/i;

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v8}, Li0/f1;->g()F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v10, 0x0

    .line 43
    cmpg-float v4, v4, v10

    .line 44
    .line 45
    if-nez v4, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {v2}, Lxb/i;->c()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v8}, Li0/f1;->g()F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    mul-float/2addr v4, v2

    .line 57
    const/4 v2, 0x4

    .line 58
    int-to-float v2, v2

    .line 59
    invoke-interface {v9, v2}, Lu2/c;->x0(F)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/16 v9, 0x20

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    add-float/2addr v2, v4

    .line 68
    iget-wide v11, v1, Le1/b;->a:J

    .line 69
    .line 70
    shr-long v8, v11, v9

    .line 71
    .line 72
    long-to-int v1, v8

    .line 73
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-float/2addr v1, v2

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v7}, Li0/f1;->g()F

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    sub-float/2addr v6, v2

    .line 84
    invoke-virtual {v8}, Li0/f1;->g()F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    sub-float/2addr v6, v2

    .line 89
    sub-float/2addr v6, v4

    .line 90
    iget-wide v1, v1, Le1/b;->a:J

    .line 91
    .line 92
    shr-long/2addr v1, v9

    .line 93
    long-to-int v1, v1

    .line 94
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    add-float/2addr v1, v6

    .line 99
    :goto_0
    cmpg-float v2, v10, v1

    .line 100
    .line 101
    if-gtz v2, :cond_3

    .line 102
    .line 103
    invoke-virtual {v7}, Li0/f1;->g()F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    cmpg-float v1, v1, v2

    .line 108
    .line 109
    if-gtz v1, :cond_3

    .line 110
    .line 111
    :cond_2
    move v3, v5

    .line 112
    :cond_3
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    return-object v1

    .line 117
    :pswitch_0
    check-cast v10, Lw/q0;

    .line 118
    .line 119
    check-cast v9, Ld1/v;

    .line 120
    .line 121
    check-cast v8, Lh0/d1;

    .line 122
    .line 123
    check-cast v7, Lb5/k;

    .line 124
    .line 125
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, Le1/b;

    .line 128
    .line 129
    invoke-virtual {v10}, Lw/q0;->b()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_4

    .line 134
    .line 135
    invoke-static {v9}, Ld1/v;->a(Ld1/v;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    iget-object v2, v10, Lw/q0;->c:Ly1/g2;

    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    check-cast v2, Ly1/i1;

    .line 144
    .line 145
    invoke-virtual {v2}, Ly1/i1;->b()V

    .line 146
    .line 147
    .line 148
    :cond_5
    :goto_2
    invoke-virtual {v10}, Lw/q0;->b()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    if-eqz v6, :cond_7

    .line 155
    .line 156
    invoke-virtual {v10}, Lw/q0;->a()Lw/h0;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    sget-object v3, Lw/h0;->h:Lw/h0;

    .line 161
    .line 162
    if-eq v2, v3, :cond_6

    .line 163
    .line 164
    invoke-virtual {v10}, Lw/q0;->d()Lw/m1;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_7

    .line 169
    .line 170
    iget-wide v8, v1, Le1/b;->a:J

    .line 171
    .line 172
    iget-object v1, v10, Lw/q0;->d:Lb/e;

    .line 173
    .line 174
    iget-object v3, v10, Lw/q0;->v:Lw/w;

    .line 175
    .line 176
    invoke-virtual {v2, v8, v9, v5}, Lw/m1;->b(JZ)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-virtual {v7, v2}, Lb5/k;->n(I)I

    .line 181
    .line 182
    .line 183
    iget-object v1, v1, Lb/e;->h:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, Ln2/s;

    .line 186
    .line 187
    invoke-static {v2, v2}, Li2/e0;->b(II)J

    .line 188
    .line 189
    .line 190
    move-result-wide v5

    .line 191
    const/4 v2, 0x5

    .line 192
    const/4 v7, 0x0

    .line 193
    invoke-static {v1, v7, v5, v6, v2}, Ln2/s;->a(Ln2/s;Li2/g;JI)Ln2/s;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v3, v1}, Lw/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    iget-object v1, v10, Lw/q0;->a:Lw/x0;

    .line 201
    .line 202
    iget-object v1, v1, Lw/x0;->a:Li2/g;

    .line 203
    .line 204
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-lez v1, :cond_7

    .line 211
    .line 212
    sget-object v1, Lw/h0;->i:Lw/h0;

    .line 213
    .line 214
    iget-object v2, v10, Lw/q0;->k:Li0/j1;

    .line 215
    .line 216
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    invoke-virtual {v8, v1}, Lh0/d1;->g(Le1/b;)V

    .line 221
    .line 222
    .line 223
    :cond_7
    :goto_3
    return-object v4

    .line 224
    :pswitch_1
    check-cast v8, Lia/q;

    .line 225
    .line 226
    check-cast v9, Ljava/lang/String;

    .line 227
    .line 228
    move-object v6, v10

    .line 229
    check-cast v6, Landroid/app/Activity;

    .line 230
    .line 231
    check-cast v7, Lp8/l;

    .line 232
    .line 233
    move-object/from16 v12, p1

    .line 234
    .line 235
    check-cast v12, Ljava/util/List;

    .line 236
    .line 237
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v1, v8, Lia/q;->a:Lb5/c;

    .line 241
    .line 242
    iget-object v10, v8, Lia/q;->d:Landroid/content/SharedPreferences;

    .line 243
    .line 244
    invoke-virtual {v1, v9}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    iget-object v1, v11, Lia/c;->a:Ljava/util/List;

    .line 249
    .line 250
    new-instance v9, Ljava/util/HashSet;

    .line 251
    .line 252
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    if-eqz v14, :cond_8

    .line 264
    .line 265
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    check-cast v14, Lwb/jv;

    .line 270
    .line 271
    iget-object v14, v14, Lwb/jv;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v9, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    new-instance v13, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v14

    .line 286
    :cond_9
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v15

    .line 290
    if-eqz v15, :cond_a

    .line 291
    .line 292
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v15

    .line 296
    move-object v2, v15

    .line 297
    check-cast v2, Lia/d;

    .line 298
    .line 299
    iget-object v2, v2, Lia/d;->a:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v9, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-nez v2, :cond_9

    .line 306
    .line 307
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    if-eqz v13, :cond_c

    .line 329
    .line 330
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v13

    .line 334
    check-cast v13, Lia/d;

    .line 335
    .line 336
    new-instance v17, Lwb/jv;

    .line 337
    .line 338
    iget-object v14, v13, Lia/d;->a:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v13, v13, Lia/d;->b:Ljava/lang/String;

    .line 341
    .line 342
    const-string v15, "wxid_hchat_fake_like_"

    .line 343
    .line 344
    invoke-static {v14, v15, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    if-eqz v15, :cond_b

    .line 349
    .line 350
    const-string v15, "\u865a\u62df\u70b9\u8d5e\u4eba"

    .line 351
    .line 352
    invoke-static {v15}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    :goto_7
    move-object/from16 v25, v15

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_b
    sget-object v15, Ltf/t;->g:Ltf/t;

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :goto_8
    const/16 v26, 0x78

    .line 363
    .line 364
    const/16 v20, 0x0

    .line 365
    .line 366
    const/16 v21, 0x0

    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    const/16 v23, 0x0

    .line 371
    .line 372
    const/16 v24, 0x0

    .line 373
    .line 374
    move-object/from16 v19, v13

    .line 375
    .line 376
    move-object/from16 v18, v14

    .line 377
    .line 378
    invoke-direct/range {v17 .. v26}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 379
    .line 380
    .line 381
    move-object/from16 v13, v17

    .line 382
    .line 383
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_c
    invoke-static {v2, v12}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const-string v9, "fake_like_auto_select"

    .line 392
    .line 393
    invoke-interface {v10, v9, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    iget-boolean v13, v0, Lc9/u;->j:Z

    .line 398
    .line 399
    const-string v14, " \u4eba"

    .line 400
    .line 401
    if-eqz v9, :cond_12

    .line 402
    .line 403
    const-string v1, "fake_like_auto_select_count"

    .line 404
    .line 405
    const/16 v9, 0x32

    .line 406
    .line 407
    invoke-interface {v10, v1, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-ge v1, v5, :cond_d

    .line 412
    .line 413
    move v1, v5

    .line 414
    :cond_d
    invoke-virtual {v8, v12, v1, v13, v3}, Lia/q;->d(Ljava/util/List;IZZ)Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    move-object v11, v3

    .line 419
    check-cast v11, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_e

    .line 426
    .line 427
    const-string v1, "\u6ca1\u6709\u53ef\u81ea\u52a8\u52fe\u9009\u7684\u70b9\u8d5e\u4eba"

    .line 428
    .line 429
    invoke-static {v6, v1}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_d

    .line 433
    .line 434
    :cond_e
    invoke-static {v3, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    new-instance v3, Ljava/util/HashSet;

    .line 439
    .line 440
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 441
    .line 442
    .line 443
    move-object v5, v8

    .line 444
    new-instance v8, Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    :cond_f
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    if-eqz v9, :cond_10

    .line 458
    .line 459
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    move-object v10, v9

    .line 464
    check-cast v10, Lwb/jv;

    .line 465
    .line 466
    iget-object v10, v10, Lwb/jv;->a:Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v3, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    if-eqz v10, :cond_f

    .line 473
    .line 474
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_10
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 479
    .line 480
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-eqz v3, :cond_11

    .line 492
    .line 493
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    check-cast v3, Lwb/jv;

    .line 498
    .line 499
    iget-object v3, v3, Lwb/jv;->a:Ljava/lang/String;

    .line 500
    .line 501
    invoke-interface {v9, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_11
    const-string v10, "\u81ea\u52a8\u52fe\u9009\u4f2a\u96c6\u8d5e"

    .line 506
    .line 507
    invoke-virtual/range {v5 .. v10}, Lia/q;->h(Landroid/app/Activity;Lp8/l;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-ge v2, v1, :cond_17

    .line 515
    .line 516
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    new-instance v2, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string v3, "\u53ef\u9009\u4eba\u6570\u4e0d\u8db3\uff0c\u5df2\u52fe\u9009 "

    .line 523
    .line 524
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-static {v6, v1}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_d

    .line 541
    .line 542
    :cond_12
    move-object v5, v8

    .line 543
    invoke-static {}, La/a;->E()Luf/c;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    if-eqz v8, :cond_14

    .line 552
    .line 553
    if-eqz v13, :cond_13

    .line 554
    .line 555
    const-string v8, "\u4ece\u597d\u53cb\u53ca\u975e\u597d\u53cb\u4e2d\u624b\u52a8\u9009\u62e9"

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_13
    const-string v8, "\u4ece\u597d\u53cb\u5217\u8868\u624b\u52a8\u9009\u62e9"

    .line 559
    .line 560
    goto :goto_b

    .line 561
    :cond_14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 562
    .line 563
    .line 564
    move-result v8

    .line 565
    const-string v9, "\u5f53\u524d\u5df2\u9009\u62e9 "

    .line 566
    .line 567
    invoke-static {v8, v9, v14}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    :goto_b
    new-instance v9, Lsf/e;

    .line 572
    .line 573
    const-string v10, "\u9009\u62e9\u70b9\u8d5e\u597d\u53cb"

    .line 574
    .line 575
    invoke-direct {v9, v10, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3, v9}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    new-instance v8, Lsf/e;

    .line 582
    .line 583
    const-string v9, "\u968f\u673a\u9009\u62e9\u597d\u53cb"

    .line 584
    .line 585
    const-string v10, "\u6309\u6570\u91cf\u968f\u673a\u52fe\u9009\uff0c\u5019\u9009\u4e0d\u8db3\u65f6\u53ef\u751f\u6210\u865a\u62df\u70b9\u8d5e\u4eba"

    .line 586
    .line 587
    invoke-direct {v8, v9, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3, v8}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    new-instance v8, Lsf/e;

    .line 594
    .line 595
    const-string v9, "\u51ed\u7a7a\u751f\u6210\u70b9\u8d5e"

    .line 596
    .line 597
    const-string v10, "\u65e0\u9700\u771f\u5b9e\u597d\u53cb\uff0c\u968f\u673a\u751f\u6210\u6307\u5b9a\u6570\u91cf\u7684\u865a\u62df\u70b9\u8d5e\u4eba"

    .line 598
    .line 599
    invoke-direct {v8, v9, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3, v8}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result v8

    .line 609
    if-nez v8, :cond_15

    .line 610
    .line 611
    new-instance v8, Lsf/e;

    .line 612
    .line 613
    const-string v9, "\u6e05\u7a7a\u4f2a\u96c6\u8d5e"

    .line 614
    .line 615
    const-string v10, "\u79fb\u9664\u8be5\u670b\u53cb\u5708\u7684\u5168\u90e8\u672c\u5730\u70b9\u8d5e"

    .line 616
    .line 617
    invoke-direct {v8, v9, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3, v8}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    :cond_15
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 624
    .line 625
    .line 626
    move-result-object v14

    .line 627
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-eqz v3, :cond_16

    .line 632
    .line 633
    const-string v1, "\u9009\u62e9\u597d\u53cb\u6216\u6309\u6570\u91cf\u968f\u673a\u751f\u6210"

    .line 634
    .line 635
    goto :goto_c

    .line 636
    :cond_16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    const-string v3, "\u5f53\u524d\u5171 "

    .line 641
    .line 642
    const-string v8, " \u4e2a\u4f2a\u9020\u70b9\u8d5e"

    .line 643
    .line 644
    invoke-static {v1, v3, v8}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    :goto_c
    new-instance v15, Lia/n;

    .line 649
    .line 650
    move-object v10, v2

    .line 651
    move-object v8, v6

    .line 652
    move-object v9, v7

    .line 653
    move-object v6, v14

    .line 654
    move-object v7, v5

    .line 655
    move-object v5, v15

    .line 656
    invoke-direct/range {v5 .. v13}, Lia/n;-><init>(Luf/c;Lia/q;Landroid/app/Activity;Lp8/l;Ljava/util/ArrayList;Lia/c;Ljava/util/List;Z)V

    .line 657
    .line 658
    .line 659
    move-object v6, v8

    .line 660
    new-instance v2, Lk/s1;

    .line 661
    .line 662
    const/4 v3, 0x7

    .line 663
    invoke-direct {v2, v3}, Lk/s1;-><init>(I)V

    .line 664
    .line 665
    .line 666
    const-string v12, "\u670b\u53cb\u5708\u4f2a\u96c6\u8d5e"

    .line 667
    .line 668
    move-object v13, v1

    .line 669
    move-object/from16 v16, v2

    .line 670
    .line 671
    move-object v11, v6

    .line 672
    invoke-static/range {v11 .. v16}, Lwb/y2;->W1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)V

    .line 673
    .line 674
    .line 675
    :cond_17
    :goto_d
    return-object v4

    .line 676
    :pswitch_2
    check-cast v10, Landroid/app/Activity;

    .line 677
    .line 678
    move-object/from16 v18, v8

    .line 679
    .line 680
    check-cast v18, Lfg/l;

    .line 681
    .line 682
    move-object/from16 v20, v9

    .line 683
    .line 684
    check-cast v20, Ljava/lang/String;

    .line 685
    .line 686
    move-object/from16 v21, v7

    .line 687
    .line 688
    check-cast v21, Ljava/lang/String;

    .line 689
    .line 690
    move-object/from16 v17, p1

    .line 691
    .line 692
    check-cast v17, Ljava/util/List;

    .line 693
    .line 694
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    new-instance v1, Lbi/c;

    .line 698
    .line 699
    const/4 v3, 0x7

    .line 700
    invoke-direct {v1, v3}, Lbi/c;-><init>(I)V

    .line 701
    .line 702
    .line 703
    xor-int/lit8 v22, v6, 0x1

    .line 704
    .line 705
    const/16 v25, 0x0

    .line 706
    .line 707
    const/16 v26, 0xf80

    .line 708
    .line 709
    const/16 v23, 0x0

    .line 710
    .line 711
    const/16 v24, 0x0

    .line 712
    .line 713
    move-object/from16 v19, v1

    .line 714
    .line 715
    move-object/from16 v16, v10

    .line 716
    .line 717
    invoke-static/range {v16 .. v26}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 718
    .line 719
    .line 720
    return-object v4

    .line 721
    :pswitch_3
    check-cast v10, Landroid/app/Activity;

    .line 722
    .line 723
    check-cast v9, Ljava/lang/String;

    .line 724
    .line 725
    check-cast v8, Ljava/util/List;

    .line 726
    .line 727
    check-cast v7, Laa/c;

    .line 728
    .line 729
    move-object/from16 v1, p1

    .line 730
    .line 731
    check-cast v1, Ljava/lang/Boolean;

    .line 732
    .line 733
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 734
    .line 735
    .line 736
    move-result v1

    .line 737
    if-nez v1, :cond_18

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_18
    sget-object v1, Lc9/b0;->a:Landroid/os/Handler;

    .line 741
    .line 742
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    const-string v2, "\u6b63\u5728\u5904\u7406 "

    .line 747
    .line 748
    const-string v5, " \u4e2a\u4f1a\u8bdd..."

    .line 749
    .line 750
    invoke-static {v1, v2, v5}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    new-instance v2, Lc9/x;

    .line 755
    .line 756
    invoke-direct {v2, v3, v8, v9, v6}, Lc9/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 757
    .line 758
    .line 759
    new-instance v3, Lc9/l;

    .line 760
    .line 761
    const/4 v5, 0x3

    .line 762
    invoke-direct {v3, v7, v10, v5}, Lc9/l;-><init>(Laa/c;Landroid/app/Activity;I)V

    .line 763
    .line 764
    .line 765
    invoke-static {v10, v9, v1, v2, v3}, Lc9/b0;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;)V

    .line 766
    .line 767
    .line 768
    :goto_e
    return-object v4

    .line 769
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
