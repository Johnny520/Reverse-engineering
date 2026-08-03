.class public final synthetic Lb0/v;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lb0/v;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lb0/v;->n:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/view/View;

    .line 11
    .line 12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v3, 0x1e

    .line 15
    .line 16
    if-lt v2, v3, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Lb2/b;->e(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/16 v3, 0x1d

    .line 22
    .line 23
    if-lt v2, v3, :cond_2

    .line 24
    .line 25
    invoke-static {v1}, Lb2/a;->a(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v3, Lf0/n;

    .line 33
    .line 34
    invoke-direct {v3, v2, v1}, Lf0/n;-><init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 39
    :goto_1
    return-object v3

    .line 40
    :pswitch_0
    iget-object v1, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lk/i0;

    .line 43
    .line 44
    iget-object v1, v1, Lk/i0;->B:Ld1/b0;

    .line 45
    .line 46
    invoke-static {v1}, Ld1/b0;->s1(Ld1/b0;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    return-object v1

    .line 55
    :pswitch_1
    iget-object v1, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ld1/i;

    .line 58
    .line 59
    iget-object v2, v1, Ld1/i;->c:Lf/l0;

    .line 60
    .line 61
    iget-object v3, v1, Ld1/i;->d:Lf/l0;

    .line 62
    .line 63
    iget-object v4, v1, Ld1/i;->a:Ld1/p;

    .line 64
    .line 65
    invoke-virtual {v4}, Ld1/p;->f()Ld1/b0;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v6, Ld1/z;->i:Ld1/z;

    .line 70
    .line 71
    if-nez v5, :cond_6

    .line 72
    .line 73
    iget-object v5, v3, Lf/l0;->b:[Ljava/lang/Object;

    .line 74
    .line 75
    const-wide/16 v16, 0x80

    .line 76
    .line 77
    iget-object v7, v3, Lf/l0;->a:[J

    .line 78
    .line 79
    array-length v8, v7

    .line 80
    add-int/lit8 v8, v8, -0x2

    .line 81
    .line 82
    if-ltz v8, :cond_13

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x7

    .line 86
    const-wide/16 v18, 0xff

    .line 87
    .line 88
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    :goto_2
    aget-wide v11, v7, v9

    .line 94
    .line 95
    const/16 v13, 0x8

    .line 96
    .line 97
    not-long v14, v11

    .line 98
    shl-long/2addr v14, v10

    .line 99
    and-long/2addr v14, v11

    .line 100
    and-long v14, v14, v20

    .line 101
    .line 102
    cmp-long v14, v14, v20

    .line 103
    .line 104
    if-eqz v14, :cond_5

    .line 105
    .line 106
    sub-int v14, v9, v8

    .line 107
    .line 108
    not-int v14, v14

    .line 109
    ushr-int/lit8 v14, v14, 0x1f

    .line 110
    .line 111
    rsub-int/lit8 v14, v14, 0x8

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    :goto_3
    if-ge v15, v14, :cond_4

    .line 115
    .line 116
    and-long v22, v11, v18

    .line 117
    .line 118
    cmp-long v22, v22, v16

    .line 119
    .line 120
    if-gez v22, :cond_3

    .line 121
    .line 122
    shl-int/lit8 v22, v9, 0x3

    .line 123
    .line 124
    add-int v22, v22, v15

    .line 125
    .line 126
    aget-object v22, v5, v22

    .line 127
    .line 128
    move/from16 v23, v10

    .line 129
    .line 130
    move-object/from16 v10, v22

    .line 131
    .line 132
    check-cast v10, Ld1/g;

    .line 133
    .line 134
    invoke-interface {v10, v6}, Ld1/g;->E(Ld1/z;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_3
    move/from16 v23, v10

    .line 139
    .line 140
    :goto_4
    shr-long/2addr v11, v13

    .line 141
    add-int/lit8 v15, v15, 0x1

    .line 142
    .line 143
    move/from16 v10, v23

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    move/from16 v23, v10

    .line 147
    .line 148
    if-ne v14, v13, :cond_13

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_5
    move/from16 v23, v10

    .line 152
    .line 153
    :goto_5
    if-eq v9, v8, :cond_13

    .line 154
    .line 155
    add-int/lit8 v9, v9, 0x1

    .line 156
    .line 157
    move/from16 v10, v23

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    const-wide/16 v16, 0x80

    .line 161
    .line 162
    const-wide/16 v18, 0xff

    .line 163
    .line 164
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    const/16 v23, 0x7

    .line 170
    .line 171
    iget-boolean v7, v5, Ly0/n;->t:Z

    .line 172
    .line 173
    if-eqz v7, :cond_13

    .line 174
    .line 175
    invoke-virtual {v2, v5}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_7

    .line 180
    .line 181
    invoke-virtual {v5}, Ld1/b0;->q1()V

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v5}, Ld1/b0;->p1()Ld1/z;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    iget-object v8, v5, Ly0/n;->g:Ly0/n;

    .line 189
    .line 190
    iget-boolean v8, v8, Ly0/n;->t:Z

    .line 191
    .line 192
    if-nez v8, :cond_8

    .line 193
    .line 194
    const-string v8, "visitAncestors called on an unattached node"

    .line 195
    .line 196
    invoke-static {v8}, Lu1/a;->b(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    iget-object v8, v5, Ly0/n;->g:Ly0/n;

    .line 200
    .line 201
    invoke-static {v5}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    const/4 v9, 0x0

    .line 206
    :goto_6
    if-eqz v5, :cond_f

    .line 207
    .line 208
    iget-object v10, v5, Lx1/f0;->L:Lx1/b1;

    .line 209
    .line 210
    iget-object v10, v10, Lx1/b1;->f:Ly0/n;

    .line 211
    .line 212
    iget v10, v10, Ly0/n;->j:I

    .line 213
    .line 214
    and-int/lit16 v10, v10, 0x1400

    .line 215
    .line 216
    if-eqz v10, :cond_d

    .line 217
    .line 218
    :goto_7
    if-eqz v8, :cond_d

    .line 219
    .line 220
    iget v10, v8, Ly0/n;->i:I

    .line 221
    .line 222
    and-int/lit16 v11, v10, 0x1400

    .line 223
    .line 224
    if-eqz v11, :cond_c

    .line 225
    .line 226
    and-int/lit16 v10, v10, 0x400

    .line 227
    .line 228
    if-eqz v10, :cond_9

    .line 229
    .line 230
    add-int/lit8 v9, v9, 0x1

    .line 231
    .line 232
    :cond_9
    instance-of v10, v8, Ld1/g;

    .line 233
    .line 234
    if-eqz v10, :cond_c

    .line 235
    .line 236
    invoke-virtual {v3, v8}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-nez v10, :cond_a

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_a
    const/4 v10, 0x1

    .line 244
    if-gt v9, v10, :cond_b

    .line 245
    .line 246
    move-object v10, v8

    .line 247
    check-cast v10, Ld1/g;

    .line 248
    .line 249
    invoke-interface {v10, v7}, Ld1/g;->E(Ld1/z;)V

    .line 250
    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_b
    move-object v10, v8

    .line 254
    check-cast v10, Ld1/g;

    .line 255
    .line 256
    sget-object v11, Ld1/z;->h:Ld1/z;

    .line 257
    .line 258
    invoke-interface {v10, v11}, Ld1/g;->E(Ld1/z;)V

    .line 259
    .line 260
    .line 261
    :goto_8
    invoke-virtual {v3, v8}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_9
    iget-object v8, v8, Ly0/n;->k:Ly0/n;

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_d
    invoke-virtual {v5}, Lx1/f0;->u()Lx1/f0;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    if-eqz v5, :cond_e

    .line 272
    .line 273
    iget-object v8, v5, Lx1/f0;->L:Lx1/b1;

    .line 274
    .line 275
    if-eqz v8, :cond_e

    .line 276
    .line 277
    iget-object v8, v8, Lx1/b1;->e:Lx1/b2;

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_e
    const/4 v8, 0x0

    .line 281
    goto :goto_6

    .line 282
    :cond_f
    iget-object v5, v3, Lf/l0;->b:[Ljava/lang/Object;

    .line 283
    .line 284
    iget-object v7, v3, Lf/l0;->a:[J

    .line 285
    .line 286
    array-length v8, v7

    .line 287
    add-int/lit8 v8, v8, -0x2

    .line 288
    .line 289
    if-ltz v8, :cond_13

    .line 290
    .line 291
    const/4 v9, 0x0

    .line 292
    :goto_a
    aget-wide v10, v7, v9

    .line 293
    .line 294
    not-long v14, v10

    .line 295
    shl-long v14, v14, v23

    .line 296
    .line 297
    and-long/2addr v14, v10

    .line 298
    and-long v14, v14, v20

    .line 299
    .line 300
    cmp-long v12, v14, v20

    .line 301
    .line 302
    if-eqz v12, :cond_12

    .line 303
    .line 304
    sub-int v12, v9, v8

    .line 305
    .line 306
    not-int v12, v12

    .line 307
    ushr-int/lit8 v12, v12, 0x1f

    .line 308
    .line 309
    const/16 v13, 0x8

    .line 310
    .line 311
    rsub-int/lit8 v14, v12, 0x8

    .line 312
    .line 313
    const/4 v12, 0x0

    .line 314
    :goto_b
    if-ge v12, v14, :cond_11

    .line 315
    .line 316
    and-long v24, v10, v18

    .line 317
    .line 318
    cmp-long v15, v24, v16

    .line 319
    .line 320
    if-gez v15, :cond_10

    .line 321
    .line 322
    shl-int/lit8 v15, v9, 0x3

    .line 323
    .line 324
    add-int/2addr v15, v12

    .line 325
    aget-object v15, v5, v15

    .line 326
    .line 327
    check-cast v15, Ld1/g;

    .line 328
    .line 329
    invoke-interface {v15, v6}, Ld1/g;->E(Ld1/z;)V

    .line 330
    .line 331
    .line 332
    :cond_10
    const/16 v13, 0x8

    .line 333
    .line 334
    shr-long/2addr v10, v13

    .line 335
    add-int/lit8 v12, v12, 0x1

    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_11
    const/16 v13, 0x8

    .line 339
    .line 340
    if-ne v14, v13, :cond_13

    .line 341
    .line 342
    goto :goto_c

    .line 343
    :cond_12
    const/16 v13, 0x8

    .line 344
    .line 345
    :goto_c
    if-eq v9, v8, :cond_13

    .line 346
    .line 347
    add-int/lit8 v9, v9, 0x1

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_13
    invoke-virtual {v4}, Ld1/p;->f()Ld1/b0;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    if-eqz v5, :cond_14

    .line 355
    .line 356
    iget-object v5, v4, Ld1/p;->c:Ld1/b0;

    .line 357
    .line 358
    invoke-virtual {v5}, Ld1/b0;->p1()Ld1/z;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    if-ne v5, v6, :cond_15

    .line 363
    .line 364
    :cond_14
    invoke-virtual {v4}, Ld1/p;->c()V

    .line 365
    .line 366
    .line 367
    :cond_15
    invoke-virtual {v2}, Lf/l0;->b()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3}, Lf/l0;->b()V

    .line 371
    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    iput-boolean v2, v1, Ld1/i;->e:Z

    .line 375
    .line 376
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_2
    iget-object v1, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v1, Lca/f0;

    .line 382
    .line 383
    iget-object v1, v1, Lca/f0;->e:Landroid/content/SharedPreferences;

    .line 384
    .line 385
    const-string v2, "message_forward_sns_enable"

    .line 386
    .line 387
    const/4 v3, 0x0

    .line 388
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    return-object v1

    .line 397
    :pswitch_3
    iget-object v1, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, Ld0/d;

    .line 400
    .line 401
    invoke-interface {v1}, Ld0/d;->j0()Lz/c;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    return-object v1

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
