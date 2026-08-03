.class public final Lc1/b;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lc1/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lc1/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly1/a;

    .line 9
    .line 10
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ly1/i2;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ly1/z;

    .line 23
    .line 24
    iget-object v1, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ly1/e2;

    .line 27
    .line 28
    iget-object v2, v1, Ly1/e2;->k:Lf2/j;

    .line 29
    .line 30
    iget-object v3, v1, Ly1/e2;->l:Lf2/j;

    .line 31
    .line 32
    iget-object v4, v1, Ly1/e2;->i:Ljava/lang/Float;

    .line 33
    .line 34
    iget-object v5, v1, Ly1/e2;->j:Ljava/lang/Float;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v7, v2, Lf2/j;->a:Lfg/a;

    .line 42
    .line 43
    invoke-interface {v7}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    sub-float/2addr v7, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v7, v6

    .line 60
    :goto_0
    if-eqz v3, :cond_1

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    iget-object v4, v3, Lf2/j;->a:Lfg/a;

    .line 65
    .line 66
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    sub-float/2addr v4, v5

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    move v4, v6

    .line 83
    :goto_1
    cmpg-float v5, v7, v6

    .line 84
    .line 85
    if-nez v5, :cond_2

    .line 86
    .line 87
    cmpg-float v4, v4, v6

    .line 88
    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    iget v4, v1, Ly1/e2;->g:I

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ly1/z;->t(I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v0}, Ly1/z;->l()Lf/k;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    iget v6, v0, Ly1/z;->q:I

    .line 103
    .line 104
    invoke-virtual {v5, v6}, Lf/k;->b(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Lf2/r;

    .line 109
    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    :try_start_0
    iget-object v6, v0, Ly1/z;->s:Lh3/g;

    .line 113
    .line 114
    if-eqz v6, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0, v5}, Ly1/z;->d(Lf2/r;)Landroid/graphics/Rect;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iget-object v6, v6, Lh3/g;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 121
    .line 122
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .line 124
    .line 125
    :catch_0
    :cond_3
    invoke-virtual {v0}, Ly1/z;->l()Lf/k;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget v6, v0, Ly1/z;->r:I

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Lf/k;->b(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lf2/r;

    .line 136
    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    :try_start_1
    iget-object v6, v0, Ly1/z;->t:Lh3/g;

    .line 140
    .line 141
    if-eqz v6, :cond_4

    .line 142
    .line 143
    invoke-virtual {v0, v5}, Ly1/z;->d(Lf2/r;)Landroid/graphics/Rect;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    iget-object v6, v6, Lh3/g;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 148
    .line 149
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 150
    .line 151
    .line 152
    :catch_1
    :cond_4
    iget-object v5, v0, Ly1/z;->j:Ly1/t;

    .line 153
    .line 154
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ly1/z;->l()Lf/k;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5, v4}, Lf/k;->b(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Lf2/r;

    .line 166
    .line 167
    if-eqz v5, :cond_7

    .line 168
    .line 169
    iget-object v5, v5, Lf2/r;->a:Lf2/q;

    .line 170
    .line 171
    if-eqz v5, :cond_7

    .line 172
    .line 173
    iget-object v5, v5, Lf2/q;->c:Lx1/f0;

    .line 174
    .line 175
    if-eqz v5, :cond_7

    .line 176
    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    iget-object v6, v0, Ly1/z;->v:Lf/w;

    .line 180
    .line 181
    invoke-virtual {v6, v4, v2}, Lf/w;->h(ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    if-eqz v3, :cond_6

    .line 185
    .line 186
    iget-object v6, v0, Ly1/z;->w:Lf/w;

    .line 187
    .line 188
    invoke-virtual {v6, v4, v3}, Lf/w;->h(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    invoke-virtual {v0, v5}, Ly1/z;->p(Lx1/f0;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    :goto_2
    if-eqz v2, :cond_8

    .line 195
    .line 196
    iget-object v0, v2, Lf2/j;->a:Lfg/a;

    .line 197
    .line 198
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/Float;

    .line 203
    .line 204
    iput-object v0, v1, Ly1/e2;->i:Ljava/lang/Float;

    .line 205
    .line 206
    :cond_8
    if-eqz v3, :cond_9

    .line 207
    .line 208
    iget-object v0, v3, Lf2/j;->a:Lfg/a;

    .line 209
    .line 210
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/lang/Float;

    .line 215
    .line 216
    iput-object v0, v1, Ly1/e2;->j:Ljava/lang/Float;

    .line 217
    .line 218
    :cond_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_1
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Ly1/t;

    .line 224
    .line 225
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v1, Landroid/view/MotionEvent;

    .line 228
    .line 229
    invoke-static {v1, v0}, Ly1/t;->g(Landroid/view/MotionEvent;Ly1/t;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :pswitch_2
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Ly1/t;

    .line 241
    .line 242
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v1, Landroid/view/KeyEvent;

    .line 245
    .line 246
    invoke-static {v0, v1}, Ly1/t;->h(Ly1/t;Landroid/view/KeyEvent;)Z

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0

    .line 255
    :pswitch_3
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Lgg/u;

    .line 258
    .line 259
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, Lx2/s;

    .line 262
    .line 263
    sget-object v2, Lv1/z0;->a:Li0/u;

    .line 264
    .line 265
    invoke-static {v1, v2}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iput-object v1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 270
    .line 271
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_4
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Lfg/l;

    .line 277
    .line 278
    sget-object v1, Lx1/i1;->T:Lf1/o0;

    .line 279
    .line 280
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    iget-object v0, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Lx1/i1;

    .line 286
    .line 287
    iget-object v2, v0, Lx1/i1;->J:Lf1/r0;

    .line 288
    .line 289
    iget-object v3, v1, Lf1/o0;->s:Lf1/r0;

    .line 290
    .line 291
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    iget-boolean v3, v0, Lx1/i1;->K:Z

    .line 296
    .line 297
    iget-boolean v4, v1, Lf1/o0;->t:Z

    .line 298
    .line 299
    const/4 v5, 0x1

    .line 300
    if-eq v3, v4, :cond_a

    .line 301
    .line 302
    move v3, v5

    .line 303
    goto :goto_3

    .line 304
    :cond_a
    const/4 v3, 0x0

    .line 305
    :goto_3
    if-eqz v2, :cond_b

    .line 306
    .line 307
    if-eqz v3, :cond_d

    .line 308
    .line 309
    :cond_b
    iget-object v6, v1, Lf1/o0;->s:Lf1/r0;

    .line 310
    .line 311
    iput-object v6, v0, Lx1/i1;->J:Lf1/r0;

    .line 312
    .line 313
    iput-boolean v4, v0, Lx1/i1;->K:Z

    .line 314
    .line 315
    iget-boolean v6, v0, Lx1/i1;->L:Z

    .line 316
    .line 317
    if-eqz v6, :cond_d

    .line 318
    .line 319
    if-nez v3, :cond_c

    .line 320
    .line 321
    if-eqz v4, :cond_d

    .line 322
    .line 323
    if-nez v2, :cond_d

    .line 324
    .line 325
    :cond_c
    iget-object v2, v0, Lx1/i1;->u:Lx1/f0;

    .line 326
    .line 327
    invoke-virtual {v2}, Lx1/f0;->E()V

    .line 328
    .line 329
    .line 330
    :cond_d
    iput-boolean v5, v0, Lx1/i1;->L:Z

    .line 331
    .line 332
    iget-object v0, v1, Lf1/o0;->s:Lf1/r0;

    .line 333
    .line 334
    iget-wide v2, v1, Lf1/o0;->v:J

    .line 335
    .line 336
    iget-object v4, v1, Lf1/o0;->x:Lu2/m;

    .line 337
    .line 338
    iget-object v5, v1, Lf1/o0;->w:Lu2/c;

    .line 339
    .line 340
    invoke-interface {v0, v2, v3, v4, v5}, Lf1/r0;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iput-object v0, v1, Lf1/o0;->A:Lf1/c0;

    .line 345
    .line 346
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_5
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Lx1/f0;

    .line 352
    .line 353
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 354
    .line 355
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, Lgg/u;

    .line 358
    .line 359
    iget-object v2, v0, Lx1/b1;->f:Ly0/n;

    .line 360
    .line 361
    iget v2, v2, Ly0/n;->j:I

    .line 362
    .line 363
    and-int/lit8 v2, v2, 0x8

    .line 364
    .line 365
    if-eqz v2, :cond_18

    .line 366
    .line 367
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 368
    .line 369
    :goto_4
    if-eqz v0, :cond_18

    .line 370
    .line 371
    iget v2, v0, Ly0/n;->i:I

    .line 372
    .line 373
    and-int/lit8 v2, v2, 0x8

    .line 374
    .line 375
    if-eqz v2, :cond_17

    .line 376
    .line 377
    const/4 v2, 0x0

    .line 378
    move-object v3, v0

    .line 379
    move-object v4, v2

    .line 380
    :goto_5
    if-eqz v3, :cond_17

    .line 381
    .line 382
    instance-of v5, v3, Lx1/z1;

    .line 383
    .line 384
    const/4 v6, 0x1

    .line 385
    if-eqz v5, :cond_10

    .line 386
    .line 387
    check-cast v3, Lx1/z1;

    .line 388
    .line 389
    invoke-interface {v3}, Lx1/z1;->c0()Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_e

    .line 394
    .line 395
    new-instance v5, Lf2/m;

    .line 396
    .line 397
    invoke-direct {v5}, Lf2/m;-><init>()V

    .line 398
    .line 399
    .line 400
    iput-object v5, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 401
    .line 402
    iput-boolean v6, v5, Lf2/m;->j:Z

    .line 403
    .line 404
    :cond_e
    invoke-interface {v3}, Lx1/z1;->S0()Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_f

    .line 409
    .line 410
    iget-object v5, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v5, Lf2/m;

    .line 413
    .line 414
    iput-boolean v6, v5, Lf2/m;->i:Z

    .line 415
    .line 416
    :cond_f
    iget-object v5, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v5, Lf2/y;

    .line 419
    .line 420
    invoke-interface {v3, v5}, Lx1/z1;->X0(Lf2/y;)V

    .line 421
    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_10
    iget v5, v3, Ly0/n;->i:I

    .line 425
    .line 426
    and-int/lit8 v5, v5, 0x8

    .line 427
    .line 428
    if-eqz v5, :cond_16

    .line 429
    .line 430
    instance-of v5, v3, Lx1/j;

    .line 431
    .line 432
    if-eqz v5, :cond_16

    .line 433
    .line 434
    move-object v5, v3

    .line 435
    check-cast v5, Lx1/j;

    .line 436
    .line 437
    iget-object v5, v5, Lx1/j;->v:Ly0/n;

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    :goto_6
    if-eqz v5, :cond_15

    .line 441
    .line 442
    iget v8, v5, Ly0/n;->i:I

    .line 443
    .line 444
    and-int/lit8 v8, v8, 0x8

    .line 445
    .line 446
    if-eqz v8, :cond_14

    .line 447
    .line 448
    add-int/lit8 v7, v7, 0x1

    .line 449
    .line 450
    if-ne v7, v6, :cond_11

    .line 451
    .line 452
    move-object v3, v5

    .line 453
    goto :goto_7

    .line 454
    :cond_11
    if-nez v4, :cond_12

    .line 455
    .line 456
    new-instance v4, Lj0/b;

    .line 457
    .line 458
    const/16 v8, 0x10

    .line 459
    .line 460
    new-array v8, v8, [Ly0/n;

    .line 461
    .line 462
    invoke-direct {v4, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :cond_12
    if-eqz v3, :cond_13

    .line 466
    .line 467
    invoke-virtual {v4, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    move-object v3, v2

    .line 471
    :cond_13
    invoke-virtual {v4, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_14
    :goto_7
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :cond_15
    if-ne v7, v6, :cond_16

    .line 478
    .line 479
    goto :goto_5

    .line 480
    :cond_16
    :goto_8
    invoke-static {v4}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    goto :goto_5

    .line 485
    :cond_17
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 486
    .line 487
    goto :goto_4

    .line 488
    :cond_18
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_6
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, Ls1/d;

    .line 494
    .line 495
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v1, Ly0/n;

    .line 498
    .line 499
    invoke-virtual {v0, v1}, Ls1/d;->d(Ly0/n;)V

    .line 500
    .line 501
    .line 502
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_7
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Lgg/u;

    .line 508
    .line 509
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v1, Ld1/b0;

    .line 512
    .line 513
    invoke-virtual {v1}, Ld1/b0;->m1()Ld1/t;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    iput-object v1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 518
    .line 519
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_8
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Lfg/a;

    .line 525
    .line 526
    if-eqz v0, :cond_19

    .line 527
    .line 528
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, Le1/c;

    .line 533
    .line 534
    if-nez v0, :cond_1c

    .line 535
    .line 536
    :cond_19
    iget-object v0, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, Lx1/i1;

    .line 539
    .line 540
    invoke-virtual {v0}, Lx1/i1;->r1()Ly0/n;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 545
    .line 546
    const/4 v2, 0x0

    .line 547
    if-eqz v1, :cond_1a

    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_1a
    move-object v0, v2

    .line 551
    :goto_9
    if-eqz v0, :cond_1b

    .line 552
    .line 553
    iget-wide v0, v0, Lv1/b1;->i:J

    .line 554
    .line 555
    invoke-static {v0, v1}, Lr9/e0;->q0(J)J

    .line 556
    .line 557
    .line 558
    move-result-wide v0

    .line 559
    const-wide/16 v2, 0x0

    .line 560
    .line 561
    invoke-static {v2, v3, v0, v1}, Lac/p;->a(JJ)Le1/c;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    goto :goto_a

    .line 566
    :cond_1b
    move-object v0, v2

    .line 567
    :cond_1c
    :goto_a
    return-object v0

    .line 568
    :pswitch_9
    iget-object v0, p0, Lc1/b;->h:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, Lc1/c;

    .line 571
    .line 572
    iget-object v0, v0, Lc1/c;->w:Lfg/l;

    .line 573
    .line 574
    iget-object v1, p0, Lc1/b;->i:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v1, Lc1/d;

    .line 577
    .line 578
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 582
    .line 583
    return-object v0

    .line 584
    nop

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
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
