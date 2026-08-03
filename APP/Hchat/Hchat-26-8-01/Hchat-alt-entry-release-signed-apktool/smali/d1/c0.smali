.class public final Ld1/c0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld1/c0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ld1/c0;->h:Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld1/c0;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly2/x;

    .line 11
    .line 12
    invoke-static {v0}, Ly2/x;->m(Ly2/x;)Lv1/t;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v2}, Lv1/t;->C()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ly2/x;->getPopupContentSize-bOM6tXw()Lu2/l;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :pswitch_0
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ly1/x1;

    .line 46
    .line 47
    iget-object v0, v0, Ly1/x1;->a:Lxe/e;

    .line 48
    .line 49
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lt0/c;

    .line 52
    .line 53
    iget-boolean v2, v0, Lt0/c;->b:Z

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-boolean v2, v0, Lt0/c;->c:Z

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    const-string v2, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 63
    .line 64
    invoke-static {v2}, Lu0/a;->a(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    invoke-virtual {v0}, Lt0/c;->a()V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    iput-boolean v2, v0, Lt0/c;->c:Z

    .line 72
    .line 73
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_1
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ly1/f1;

    .line 79
    .line 80
    const-wide/16 v2, 0x0

    .line 81
    .line 82
    invoke-static {v2, v3, v2, v3}, Lu2/l;->a(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    iget-object v0, v0, Ly1/f1;->a:Landroid/view/View;

    .line 87
    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    invoke-static {v0}, Ly1/g0;->e(Landroid/view/View;)Ly1/j1;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lbe/h;->a(Landroid/content/Context;)Lu2/e;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v2, v3}, Lr9/e0;->q0(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-interface {v0, v4, v5}, Lu2/c;->K(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    new-instance v0, Ly1/j1;

    .line 112
    .line 113
    invoke-direct {v0, v2, v3, v4, v5}, Ly1/j1;-><init>(JJ)V

    .line 114
    .line 115
    .line 116
    :goto_3
    return-object v0

    .line 117
    :pswitch_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_3
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Ly1/k0;

    .line 123
    .line 124
    iget-object v0, v0, Ly1/k0;->i:Lqg/t;

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-static {v0, v2}, Lqg/v;->c(Lqg/t;Ls1/w;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_4
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Le1/c;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_5
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lx1/f0;

    .line 141
    .line 142
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 143
    .line 144
    iget-object v2, v0, Lx1/j0;->p:Lx1/v0;

    .line 145
    .line 146
    const/4 v3, 0x1

    .line 147
    iput-boolean v3, v2, Lx1/v0;->F:Z

    .line 148
    .line 149
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    iput-boolean v3, v0, Lx1/r0;->z:Z

    .line 154
    .line 155
    :cond_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_6
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lv1/j1;

    .line 161
    .line 162
    invoke-virtual {v0}, Lv1/j1;->a()Lv1/j0;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v2, v0, Lv1/j0;->g:Lx1/f0;

    .line 167
    .line 168
    invoke-virtual {v2}, Lx1/f0;->o()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Lf/d0;

    .line 173
    .line 174
    iget-object v3, v3, Lf/d0;->h:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v3, Lj0/b;

    .line 177
    .line 178
    iget v3, v3, Lj0/b;->i:I

    .line 179
    .line 180
    iget v4, v0, Lv1/j0;->t:I

    .line 181
    .line 182
    if-eq v4, v3, :cond_b

    .line 183
    .line 184
    iget-object v0, v0, Lv1/j0;->l:Lf/k0;

    .line 185
    .line 186
    iget-object v3, v0, Lf/k0;->c:[Ljava/lang/Object;

    .line 187
    .line 188
    iget-object v0, v0, Lf/k0;->a:[J

    .line 189
    .line 190
    array-length v4, v0

    .line 191
    add-int/lit8 v4, v4, -0x2

    .line 192
    .line 193
    const/4 v5, 0x7

    .line 194
    const/4 v6, 0x0

    .line 195
    if-ltz v4, :cond_9

    .line 196
    .line 197
    move v7, v6

    .line 198
    :goto_4
    aget-wide v8, v0, v7

    .line 199
    .line 200
    not-long v10, v8

    .line 201
    shl-long/2addr v10, v5

    .line 202
    and-long/2addr v10, v8

    .line 203
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    and-long/2addr v10, v12

    .line 209
    cmp-long v10, v10, v12

    .line 210
    .line 211
    if-eqz v10, :cond_8

    .line 212
    .line 213
    sub-int v10, v7, v4

    .line 214
    .line 215
    not-int v10, v10

    .line 216
    ushr-int/lit8 v10, v10, 0x1f

    .line 217
    .line 218
    const/16 v11, 0x8

    .line 219
    .line 220
    rsub-int/lit8 v10, v10, 0x8

    .line 221
    .line 222
    move v12, v6

    .line 223
    :goto_5
    if-ge v12, v10, :cond_7

    .line 224
    .line 225
    const-wide/16 v13, 0xff

    .line 226
    .line 227
    and-long/2addr v13, v8

    .line 228
    const-wide/16 v15, 0x80

    .line 229
    .line 230
    cmp-long v13, v13, v15

    .line 231
    .line 232
    if-gez v13, :cond_6

    .line 233
    .line 234
    shl-int/lit8 v13, v7, 0x3

    .line 235
    .line 236
    add-int/2addr v13, v12

    .line 237
    aget-object v13, v3, v13

    .line 238
    .line 239
    check-cast v13, Lv1/b0;

    .line 240
    .line 241
    const/4 v14, 0x1

    .line 242
    iput-boolean v14, v13, Lv1/b0;->d:Z

    .line 243
    .line 244
    :cond_6
    shr-long/2addr v8, v11

    .line 245
    add-int/lit8 v12, v12, 0x1

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_7
    if-ne v10, v11, :cond_9

    .line 249
    .line 250
    :cond_8
    if-eq v7, v4, :cond_9

    .line 251
    .line 252
    add-int/lit8 v7, v7, 0x1

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_9
    iget-object v0, v2, Lx1/f0;->n:Lx1/f0;

    .line 256
    .line 257
    if-eqz v0, :cond_a

    .line 258
    .line 259
    iget-object v0, v2, Lx1/f0;->M:Lx1/j0;

    .line 260
    .line 261
    iget-boolean v0, v0, Lx1/j0;->e:Z

    .line 262
    .line 263
    if-nez v0, :cond_b

    .line 264
    .line 265
    invoke-static {v2, v6, v5}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_a
    invoke-virtual {v2}, Lx1/f0;->q()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_b

    .line 274
    .line 275
    invoke-static {v2, v6, v5}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 276
    .line 277
    .line 278
    :cond_b
    :goto_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_7
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lv1/b0;

    .line 284
    .line 285
    iget-object v2, v0, Lv1/b0;->g:Li0/j1;

    .line 286
    .line 287
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Ljava/lang/Boolean;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-nez v2, :cond_c

    .line 298
    .line 299
    iget-object v0, v0, Lv1/b0;->c:Li0/q;

    .line 300
    .line 301
    if-eqz v0, :cond_c

    .line 302
    .line 303
    invoke-virtual {v0}, Li0/q;->l()V

    .line 304
    .line 305
    .line 306
    :cond_c
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_8
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lr1/i;

    .line 312
    .line 313
    invoke-virtual {v0}, Lr1/i;->k1()Lqg/t;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    return-object v0

    .line 318
    :pswitch_9
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lr1/d;

    .line 321
    .line 322
    iget-object v0, v0, Lr1/d;->d:Lqg/t;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_a
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 326
    .line 327
    iget-object v2, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v2, Ln2/v;

    .line 330
    .line 331
    iget-object v2, v2, Ln2/v;->a:Landroid/view/View;

    .line 332
    .line 333
    const/4 v3, 0x0

    .line 334
    invoke-direct {v0, v2, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 335
    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_b
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, Lb5/c;

    .line 341
    .line 342
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Landroid/view/View;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const-string v2, "input_method"

    .line 351
    .line 352
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_c
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Lm1/j0;

    .line 365
    .line 366
    iget-object v0, v0, Lm1/j0;->h:Li0/j1;

    .line 367
    .line 368
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 369
    .line 370
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    return-object v2

    .line 374
    :pswitch_d
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Llh/d;

    .line 377
    .line 378
    new-instance v2, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v3, "("

    .line 381
    .line 382
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    iget-object v4, v0, Llh/d;->i:Ljava/util/ArrayList;

    .line 386
    .line 387
    sget-object v8, Llh/c;->g:Llh/c;

    .line 388
    .line 389
    const/16 v9, 0x1e

    .line 390
    .line 391
    const-string v5, ""

    .line 392
    .line 393
    const/4 v6, 0x0

    .line 394
    const/4 v7, 0x0

    .line 395
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v3, ")"

    .line 403
    .line 404
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    iget-object v0, v0, Llh/d;->j:Ljava/lang/String;

    .line 408
    .line 409
    invoke-static {v0}, Lkh/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    return-object v0

    .line 421
    :pswitch_e
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Llh/b;

    .line 424
    .line 425
    iget-object v0, v0, Llh/b;->i:Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v0}, Lkh/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    return-object v0

    .line 432
    :pswitch_f
    new-instance v0, Llh/d;

    .line 433
    .line 434
    iget-object v2, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v2, Lhh/o;

    .line 437
    .line 438
    iget-object v2, v2, Lhh/o;->j:Ljava/lang/String;

    .line 439
    .line 440
    invoke-direct {v0, v2}, Llh/d;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_10
    new-instance v0, Llh/b;

    .line 445
    .line 446
    iget-object v2, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v2, Lhh/l;

    .line 449
    .line 450
    iget-object v2, v2, Lhh/l;->j:Ljava/lang/String;

    .line 451
    .line 452
    invoke-direct {v0, v2}, Llh/b;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_11
    new-instance v0, Llh/a;

    .line 457
    .line 458
    iget-object v2, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v2, Lhh/i;

    .line 461
    .line 462
    iget-object v2, v2, Lhh/i;->j:Ljava/lang/String;

    .line 463
    .line 464
    invoke-direct {v0, v2}, Llh/a;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_12
    new-instance v0, Llh/a;

    .line 469
    .line 470
    iget-object v2, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v2, Lhh/a;

    .line 473
    .line 474
    iget-object v2, v2, Lhh/a;->h:Ljava/lang/String;

    .line 475
    .line 476
    invoke-direct {v0, v2}, Llh/a;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_13
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Li/k1;

    .line 483
    .line 484
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    sget-object v3, Lh/f0;->i:Lh/f0;

    .line 489
    .line 490
    if-ne v2, v3, :cond_d

    .line 491
    .line 492
    iget-object v0, v0, Li/k1;->d:Li0/j1;

    .line 493
    .line 494
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-ne v0, v3, :cond_d

    .line 499
    .line 500
    const/4 v0, 0x1

    .line 501
    goto :goto_7

    .line 502
    :cond_d
    const/4 v0, 0x0

    .line 503
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    return-object v0

    .line 508
    :pswitch_14
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, Lg2/b;

    .line 511
    .line 512
    const/4 v2, 0x0

    .line 513
    iput-object v2, v0, Lg2/b;->h:Lb0/c;

    .line 514
    .line 515
    const-string v2, "OnPositionedDispatch"

    .line 516
    .line 517
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    :try_start_0
    invoke-virtual {v0}, Lg2/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    .line 522
    .line 523
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 524
    .line 525
    .line 526
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 527
    .line 528
    return-object v0

    .line 529
    :catchall_0
    move-exception v0

    .line 530
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 531
    .line 532
    .line 533
    throw v0

    .line 534
    :pswitch_15
    iget-object v0, v1, Ld1/c0;->h:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Ld1/b0;

    .line 537
    .line 538
    invoke-virtual {v0}, Ld1/b0;->m1()Ld1/t;

    .line 539
    .line 540
    .line 541
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 542
    .line 543
    return-object v0

    .line 544
    nop

    .line 545
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
