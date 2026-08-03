.class public final Lf1/p;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lf1/p;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lf1/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/a0;

    .line 7
    .line 8
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ly2/x;

    .line 11
    .line 12
    iget-object v0, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ly2/b0;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ly2/x;->setPositionProvider(Ly2/b0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ly2/x;->r()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ly2/i;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ly1/f1;

    .line 29
    .line 30
    iget-object v0, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lfg/p;

    .line 33
    .line 34
    iget-object v1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ly1/x2;

    .line 37
    .line 38
    iget-boolean v2, v1, Ly1/x2;->i:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-object v2, p1, Ly1/f1;->c:Landroidx/lifecycle/q;

    .line 43
    .line 44
    iget-object v3, p1, Ly1/f1;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-interface {v2}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v0, v1, Ly1/x2;->k:Lfg/p;

    .line 51
    .line 52
    iget-object v4, v1, Ly1/x2;->j:Landroidx/lifecycle/s;

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_0

    .line 73
    .line 74
    new-instance p1, Lrb/g;

    .line 75
    .line 76
    const/16 v0, 0x14

    .line 77
    .line 78
    invoke-direct {p1, v1, v0, v2}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iput-object v2, v1, Ly1/x2;->j:Landroidx/lifecycle/s;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object v2, v2, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 92
    .line 93
    sget-object v3, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ltz v2, :cond_2

    .line 100
    .line 101
    iget-object v2, v1, Ly1/x2;->h:Li0/q;

    .line 102
    .line 103
    new-instance v3, Ly1/g1;

    .line 104
    .line 105
    invoke-direct {v3, v1, p1, v0}, Ly1/g1;-><init>(Ly1/x2;Ly1/f1;Lfg/p;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ls0/d;

    .line 109
    .line 110
    const v0, -0x66c1ecc8

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x1

    .line 114
    invoke-direct {p1, v0, v3, v1}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Li0/q;->A(Lfg/p;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 124
    .line 125
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Li0/d;

    .line 128
    .line 129
    iget-object p1, p1, Li0/d;->h:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, Landroid/view/Choreographer;

    .line 132
    .line 133
    iget-object v0, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ly1/o0;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 138
    .line 139
    .line 140
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    return-object p1

    .line 143
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 144
    .line 145
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p1, Ly1/n0;

    .line 148
    .line 149
    iget-object v0, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Ly1/o0;

    .line 152
    .line 153
    iget-object v1, p1, Ly1/n0;->k:Ljava/lang/Object;

    .line 154
    .line 155
    monitor-enter v1

    .line 156
    :try_start_0
    iget-object p1, p1, Ly1/n0;->m:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    monitor-exit v1

    .line 162
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 163
    .line 164
    return-object p1

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move-object p1, v0

    .line 167
    monitor-exit v1

    .line 168
    throw p1

    .line 169
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 170
    .line 171
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Ly1/s1;

    .line 174
    .line 175
    iget-object v1, p1, Ly1/s1;->c:Ljava/lang/Object;

    .line 176
    .line 177
    monitor-enter v1

    .line 178
    const/4 v0, 0x1

    .line 179
    :try_start_1
    iput-boolean v0, p1, Ly1/s1;->e:Z

    .line 180
    .line 181
    iget-object v0, p1, Ly1/s1;->d:Lj0/b;

    .line 182
    .line 183
    iget-object v2, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 184
    .line 185
    iget v0, v0, Lj0/b;->i:I

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    :goto_1
    const/4 v4, 0x0

    .line 189
    if-ge v3, v0, :cond_4

    .line 190
    .line 191
    aget-object v5, v2, v3

    .line 192
    .line 193
    check-cast v5, Lx1/g2;

    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, Ln2/l;

    .line 200
    .line 201
    if-eqz v5, :cond_3

    .line 202
    .line 203
    iget-object v6, v5, Ln2/l;->b:Lf0/v;

    .line 204
    .line 205
    if-eqz v6, :cond_3

    .line 206
    .line 207
    invoke-virtual {v6}, Lf0/v;->closeConnection()V

    .line 208
    .line 209
    .line 210
    iput-object v4, v5, Ln2/l;->b:Lf0/v;

    .line 211
    .line 212
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :catchall_1
    move-exception v0

    .line 216
    move-object p1, v0

    .line 217
    goto :goto_2

    .line 218
    :cond_4
    iget-object p1, p1, Ly1/s1;->d:Lj0/b;

    .line 219
    .line 220
    invoke-virtual {p1}, Lj0/b;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 221
    .line 222
    .line 223
    monitor-exit v1

    .line 224
    iget-object p1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p1, Ly1/k0;

    .line 227
    .line 228
    iget-object p1, p1, Ly1/k0;->h:Ln2/t;

    .line 229
    .line 230
    iget-object v0, p1, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 231
    .line 232
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object p1, p1, Ln2/t;->a:Ln2/n;

    .line 236
    .line 237
    invoke-interface {p1}, Ln2/n;->d()V

    .line 238
    .line 239
    .line 240
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 241
    .line 242
    return-object p1

    .line 243
    :goto_2
    monitor-exit v1

    .line 244
    throw p1

    .line 245
    :pswitch_4
    check-cast p1, Lqg/t;

    .line 246
    .line 247
    new-instance p1, Ly1/s1;

    .line 248
    .line 249
    iget-object v0, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lf0/u;

    .line 252
    .line 253
    new-instance v1, Ld1/c0;

    .line 254
    .line 255
    iget-object v2, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v2, Ly1/k0;

    .line 258
    .line 259
    const/16 v3, 0x12

    .line 260
    .line 261
    invoke-direct {v1, v2, v3}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 262
    .line 263
    .line 264
    invoke-direct {p1, v0, v1}, Ly1/s1;-><init>(Lf0/u;Ld1/c0;)V

    .line 265
    .line 266
    .line 267
    return-object p1

    .line 268
    :pswitch_5
    check-cast p1, Lv1/a1;

    .line 269
    .line 270
    iget-object v0, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Lv1/b1;

    .line 273
    .line 274
    iget-object v1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, Ly0/s;

    .line 277
    .line 278
    iget v1, v1, Ly0/s;->u:F

    .line 279
    .line 280
    const/4 v2, 0x0

    .line 281
    invoke-virtual {p1, v0, v2, v2, v1}, Lv1/a1;->A(Lv1/b1;IIF)V

    .line 282
    .line 283
    .line 284
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 285
    .line 286
    return-object p1

    .line 287
    :pswitch_6
    check-cast p1, Ly0/o;

    .line 288
    .line 289
    iget-object v0, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Lx1/f0;

    .line 292
    .line 293
    iget-object v1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, Ly0/o;

    .line 296
    .line 297
    invoke-interface {p1, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {v0, p1}, Lx1/f0;->d0(Ly0/o;)V

    .line 302
    .line 303
    .line 304
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 305
    .line 306
    return-object p1

    .line 307
    :pswitch_7
    const-string v0, "onTouchEvent"

    .line 308
    .line 309
    check-cast p1, Landroid/view/MotionEvent;

    .line 310
    .line 311
    iget-object v1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Ls1/a0;

    .line 314
    .line 315
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    const/4 v3, 0x0

    .line 320
    if-nez v2, :cond_7

    .line 321
    .line 322
    iget-object v2, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v2, Lhb/c;

    .line 325
    .line 326
    iget-object v1, v1, Ls1/a0;->a:Ls1/b0;

    .line 327
    .line 328
    if-eqz v1, :cond_6

    .line 329
    .line 330
    invoke-virtual {v1, p1}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    check-cast p1, Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-eqz p1, :cond_5

    .line 341
    .line 342
    sget-object p1, Ls1/y;->h:Ls1/y;

    .line 343
    .line 344
    goto :goto_3

    .line 345
    :cond_5
    sget-object p1, Ls1/y;->i:Ls1/y;

    .line 346
    .line 347
    :goto_3
    iput-object p1, v2, Lhb/c;->h:Ljava/lang/Object;

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_6
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v3

    .line 354
    :cond_7
    iget-object v1, v1, Ls1/a0;->a:Ls1/b0;

    .line 355
    .line 356
    if-eqz v1, :cond_8

    .line 357
    .line 358
    invoke-virtual {v1, p1}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 362
    .line 363
    return-object p1

    .line 364
    :cond_8
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v3

    .line 368
    :pswitch_8
    check-cast p1, Lh1/d;

    .line 369
    .line 370
    iget-object v0, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 371
    .line 372
    move-object v1, v0

    .line 373
    check-cast v1, Lh1/d;

    .line 374
    .line 375
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lb5/c;->s()Lu2/c;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-virtual {v2}, Lb5/c;->u()Lu2/m;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-virtual {v4}, Lb5/c;->v()J

    .line 404
    .line 405
    .line 406
    move-result-wide v4

    .line 407
    invoke-interface {p1}, Lh1/d;->z0()Lb5/c;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    iget-object p1, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast p1, Li1/b;

    .line 414
    .line 415
    iget-object v6, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v6, Lfg/l;

    .line 418
    .line 419
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    invoke-virtual {v7}, Lb5/c;->s()Lu2/c;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-virtual {v8}, Lb5/c;->u()Lu2/m;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-virtual {v9}, Lb5/c;->p()Lf1/u;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    invoke-virtual {v10}, Lb5/c;->v()J

    .line 448
    .line 449
    .line 450
    move-result-wide v10

    .line 451
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    iget-object v12, v12, Lb5/c;->b:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v12, Li1/b;

    .line 458
    .line 459
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 460
    .line 461
    .line 462
    move-result-object v13

    .line 463
    invoke-virtual {v13, v0}, Lb5/c;->R(Lu2/c;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v13, v2}, Lb5/c;->S(Lu2/m;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v13, v3}, Lb5/c;->P(Lf1/u;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v13, v4, v5}, Lb5/c;->U(J)V

    .line 473
    .line 474
    .line 475
    iput-object p1, v13, Lb5/c;->b:Ljava/lang/Object;

    .line 476
    .line 477
    invoke-interface {v3}, Lf1/u;->e()V

    .line 478
    .line 479
    .line 480
    :try_start_2
    invoke-interface {v6, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 481
    .line 482
    .line 483
    invoke-interface {v3}, Lf1/u;->p()V

    .line 484
    .line 485
    .line 486
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-virtual {p1, v7}, Lb5/c;->R(Lu2/c;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p1, v8}, Lb5/c;->S(Lu2/m;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {p1, v9}, Lb5/c;->P(Lf1/u;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {p1, v10, v11}, Lb5/c;->U(J)V

    .line 500
    .line 501
    .line 502
    iput-object v12, p1, Lb5/c;->b:Ljava/lang/Object;

    .line 503
    .line 504
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 505
    .line 506
    return-object p1

    .line 507
    :catchall_2
    move-exception v0

    .line 508
    move-object p1, v0

    .line 509
    invoke-interface {v3}, Lf1/u;->p()V

    .line 510
    .line 511
    .line 512
    invoke-interface {v1}, Lh1/d;->z0()Lb5/c;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v0, v7}, Lb5/c;->R(Lu2/c;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v8}, Lb5/c;->S(Lu2/m;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v9}, Lb5/c;->P(Lf1/u;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v10, v11}, Lb5/c;->U(J)V

    .line 526
    .line 527
    .line 528
    iput-object v12, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 529
    .line 530
    throw p1

    .line 531
    :pswitch_9
    check-cast p1, Lv1/a1;

    .line 532
    .line 533
    iget-object v0, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lv1/b1;

    .line 536
    .line 537
    iget-object v1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v1, Lh/e0;

    .line 540
    .line 541
    iget-object v1, v1, Lh/e0;->c:Li0/f1;

    .line 542
    .line 543
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    const/4 v2, 0x0

    .line 548
    invoke-virtual {p1, v0, v2, v2, v1}, Lv1/a1;->A(Lv1/b1;IIF)V

    .line 549
    .line 550
    .line 551
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 552
    .line 553
    return-object p1

    .line 554
    :pswitch_a
    move-object v0, p1

    .line 555
    check-cast v0, Lv1/a1;

    .line 556
    .line 557
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 558
    .line 559
    move-object v1, p1

    .line 560
    check-cast v1, Lv1/b1;

    .line 561
    .line 562
    iget-object p1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast p1, Lf1/s0;

    .line 565
    .line 566
    iget-object v4, p1, Lf1/s0;->G:Lb1/f;

    .line 567
    .line 568
    const/4 v5, 0x4

    .line 569
    const/4 v2, 0x0

    .line 570
    const/4 v3, 0x0

    .line 571
    invoke-static/range {v0 .. v5}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 572
    .line 573
    .line 574
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 575
    .line 576
    return-object p1

    .line 577
    :pswitch_b
    move-object v0, p1

    .line 578
    check-cast v0, Lv1/a1;

    .line 579
    .line 580
    iget-object p1, p0, Lf1/p;->h:Ljava/lang/Object;

    .line 581
    .line 582
    move-object v1, p1

    .line 583
    check-cast v1, Lv1/b1;

    .line 584
    .line 585
    iget-object p1, p0, Lf1/p;->i:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast p1, Lf1/q;

    .line 588
    .line 589
    iget-object v4, p1, Lf1/q;->u:Lfg/l;

    .line 590
    .line 591
    const/4 v5, 0x4

    .line 592
    const/4 v2, 0x0

    .line 593
    const/4 v3, 0x0

    .line 594
    invoke-static/range {v0 .. v5}, Lv1/a1;->G(Lv1/a1;Lv1/b1;IILfg/l;I)V

    .line 595
    .line 596
    .line 597
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 598
    .line 599
    return-object p1

    .line 600
    nop

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
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
