.class public final synthetic LA0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le0/a;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, LA0/m;->a:I

    iput-object p1, p0, LA0/m;->c:Ljava/lang/Object;

    iput-object p2, p0, LA0/m;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LA0/m;->a:I

    iput-object p1, p0, LA0/m;->b:Ljava/lang/Object;

    iput-object p2, p0, LA0/m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, ""

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v1, LA0/m;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v8, v1, LA0/m;->b:Ljava/lang/Object;

    .line 14
    .line 15
    iget v9, v1, LA0/m;->a:I

    .line 16
    .line 17
    packed-switch v9, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v8, LM0/l;

    .line 21
    .line 22
    check-cast v7, Lz0/b;

    .line 23
    .line 24
    invoke-interface {v8, v7}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    sget v0, Lcom/lu/wxmask/ui/MainActivity;->x:I

    .line 29
    .line 30
    check-cast v7, Landroid/net/Uri;

    .line 31
    .line 32
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v8, Lcom/lu/wxmask/ui/MainActivity;

    .line 37
    .line 38
    invoke-static {v8, v0, v4}, Lu0/a;->b(Landroid/content/Context;Ljava/lang/String;LM0/l;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    check-cast v7, Landroid/view/ViewGroup;

    .line 43
    .line 44
    check-cast v8, Lt0/c;

    .line 45
    .line 46
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v7}, Lt0/c;->h(Landroid/view/ViewGroup;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, Lt0/c;->b(Landroid/view/ViewGroup;)Lt0/c;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void

    .line 65
    :pswitch_2
    check-cast v8, Ls0/l;

    .line 66
    .line 67
    iget-object v0, v8, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    iget-object v0, v8, Ls0/l;->a:Landroid/app/Activity;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    iget-object v0, v8, Ls0/l;->d:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 93
    .line 94
    .line 95
    check-cast v7, Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    iget-object v0, v8, Ls0/l;->k:Landroid/widget/EditText;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :cond_2
    if-nez v4, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    move-object v3, v4

    .line 118
    :goto_0
    invoke-virtual {v8, v3}, Ls0/l;->c(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const-string v0, "searchEditText"

    .line 123
    .line 124
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v4

    .line 128
    :cond_5
    :goto_1
    return-void

    .line 129
    :pswitch_3
    check-cast v8, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 130
    .line 131
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v2, "identifier"

    .line 136
    .line 137
    invoke-static {v0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    sget-object v2, Lz0/z;->a:Lz0/z;

    .line 141
    .line 142
    invoke-static {v0}, Lz0/z;->b(Ljava/lang/String;)Lz0/y;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :cond_6
    check-cast v7, Li/q1;

    .line 151
    .line 152
    iget-object v2, v7, Li/q1;->g:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_7

    .line 161
    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_7
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    new-instance v2, LC/d;

    .line 175
    .line 176
    const/16 v9, 0x9

    .line 177
    .line 178
    invoke-direct {v2, v9, v8}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v2}, Lz0/y;->a(LM0/l;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-nez v2, :cond_8

    .line 186
    .line 187
    move-object v2, v3

    .line 188
    :cond_8
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-nez v9, :cond_9

    .line 193
    .line 194
    invoke-virtual {v8, v2}, Lcom/lu/wxmask/bean/MaskItemBean;->setTagName(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move v5, v6

    .line 198
    :cond_9
    iget-object v0, v0, Lz0/y;->h:Ljava/lang/String;

    .line 199
    .line 200
    if-eqz v0, :cond_a

    .line 201
    .line 202
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    goto :goto_2

    .line 211
    :cond_a
    move-object v0, v4

    .line 212
    :goto_2
    if-nez v0, :cond_b

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_b
    move-object v3, v0

    .line 216
    :goto_3
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getAvatarUrl()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_c

    .line 225
    .line 226
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_c

    .line 231
    .line 232
    invoke-virtual {v8, v3}, Lcom/lu/wxmask/bean/MaskItemBean;->setAvatarUrl(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_c
    move v6, v5

    .line 237
    :goto_4
    if-nez v6, :cond_d

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_d
    iget-object v0, v7, Li/q1;->c:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Ls0/g;

    .line 243
    .line 244
    if-eqz v0, :cond_11

    .line 245
    .line 246
    iget-object v0, v0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_f

    .line 257
    .line 258
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    move-object v5, v3

    .line 263
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 264
    .line 265
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v5, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_e

    .line 278
    .line 279
    move-object v4, v3

    .line 280
    :cond_f
    check-cast v4, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 281
    .line 282
    if-eqz v4, :cond_10

    .line 283
    .line 284
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v4, v2}, Lcom/lu/wxmask/bean/MaskItemBean;->setTagName(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getAvatarUrl()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v4, v2}, Lcom/lu/wxmask/bean/MaskItemBean;->setAvatarUrl(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    sget-boolean v2, Lz0/i;->a:Z

    .line 299
    .line 300
    invoke-static {v0}, Lz0/g;->N(Ljava/util/List;)V

    .line 301
    .line 302
    .line 303
    :cond_10
    new-instance v0, Landroidx/activity/b;

    .line 304
    .line 305
    const/4 v2, 0x7

    .line 306
    invoke-direct {v0, v2, v7}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    iget-object v2, v7, Li/q1;->b:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v2, Landroid/app/Activity;

    .line 312
    .line 313
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 314
    .line 315
    .line 316
    :goto_5
    return-void

    .line 317
    :cond_11
    const-string v0, "listAdapter"

    .line 318
    .line 319
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v4

    .line 323
    :pswitch_4
    check-cast v8, Lr0/D1;

    .line 324
    .line 325
    check-cast v7, Landroid/view/View;

    .line 326
    .line 327
    invoke-virtual {v8, v7}, Lr0/D1;->J(Landroid/view/View;)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :pswitch_5
    check-cast v7, Lr0/D1;

    .line 332
    .line 333
    check-cast v8, Landroid/app/Activity;

    .line 334
    .line 335
    invoke-virtual {v7, v8}, Lr0/D1;->z(Landroid/app/Activity;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_13

    .line 340
    .line 341
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    if-eqz v0, :cond_12

    .line 346
    .line 347
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    :cond_12
    invoke-virtual {v7, v4}, Lr0/D1;->I(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    :cond_13
    return-void

    .line 355
    :pswitch_6
    check-cast v7, Lr0/Y0;

    .line 356
    .line 357
    check-cast v8, Landroid/app/Activity;

    .line 358
    .line 359
    invoke-virtual {v7, v8}, Lr0/Y0;->s(Landroid/app/Activity;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    if-eqz v0, :cond_14

    .line 364
    .line 365
    invoke-virtual {v7, v0}, Lr0/Y0;->G(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_14
    return-void

    .line 369
    :pswitch_7
    check-cast v7, Lr0/L0;

    .line 370
    .line 371
    invoke-static {v7}, Lr0/L0;->f(Lr0/L0;)V

    .line 372
    .line 373
    .line 374
    check-cast v8, Landroid/app/Activity;

    .line 375
    .line 376
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-eqz v0, :cond_15

    .line 381
    .line 382
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    :cond_15
    invoke-virtual {v7, v4}, Lr0/L0;->y(Landroid/view/View;)Landroid/view/View;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-nez v0, :cond_16

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_16
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 394
    .line 395
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :goto_6
    return-void

    .line 399
    :pswitch_8
    :try_start_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 400
    .line 401
    invoke-static {}, Lz0/g;->x()Z

    .line 402
    .line 403
    .line 404
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    check-cast v8, Lr0/E;

    .line 406
    .line 407
    if-eqz v0, :cond_17

    .line 408
    .line 409
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-static {}, Lr0/E;->v()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-nez v0, :cond_17

    .line 417
    .line 418
    invoke-virtual {v8, v7}, Lr0/E;->C(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_17
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-static {v7}, Lr0/E;->x(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    iget-object v0, v8, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 428
    .line 429
    if-eqz v0, :cond_18

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Landroid/widget/ListView;

    .line 436
    .line 437
    if-eqz v0, :cond_18

    .line 438
    .line 439
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 440
    .line 441
    .line 442
    :cond_18
    iget-object v0, v8, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 443
    .line 444
    if-eqz v0, :cond_19

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, Landroid/widget/ListView;

    .line 451
    .line 452
    if-eqz v0, :cond_19

    .line 453
    .line 454
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 455
    .line 456
    .line 457
    :cond_19
    const-string v0, "hide close friend delayed list refresh"

    .line 458
    .line 459
    invoke-static {}, Lr0/E;->g()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 476
    .line 477
    .line 478
    :catchall_0
    return-void

    .line 479
    :pswitch_9
    check-cast v7, Lq0/f;

    .line 480
    .line 481
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 485
    .line 486
    check-cast v8, Landroid/app/Activity;

    .line 487
    .line 488
    invoke-direct {v0, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 489
    .line 490
    .line 491
    const-string v3, "\u914d\u7f6e\u63d0\u793a"

    .line 492
    .line 493
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 502
    .line 503
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    const-string v3, "\u70b9\u51fb\u7528\u6237\u53d1\u8d77\u804a\u5929\uff0c\u5c31\u53ef\u4ee5\u5bf9\u7528\u6237\u8fdb\u884c\u914d\u7f6e\u5662~"

    .line 508
    .line 509
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    new-instance v3, Lq0/c;

    .line 518
    .line 519
    invoke-direct {v3, v7, v6}, Lq0/c;-><init>(Lq0/f;I)V

    .line 520
    .line 521
    .line 522
    const-string v4, "\u7ee7\u7eed"

    .line 523
    .line 524
    invoke-virtual {v0, v4, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    new-instance v3, Lq0/c;

    .line 529
    .line 530
    invoke-direct {v3, v7, v2}, Lq0/c;-><init>(Lq0/f;I)V

    .line 531
    .line 532
    .line 533
    const-string v4, "\u5ffd\u7565"

    .line 534
    .line 535
    invoke-virtual {v0, v4, v3}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    new-instance v3, Lx0/a;

    .line 540
    .line 541
    invoke-direct {v3, v2, v7}, Lx0/a;-><init>(ILjava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 549
    .line 550
    .line 551
    iput-boolean v6, v7, Lq0/f;->b:Z

    .line 552
    .line 553
    const-string v0, "show WebChatTipConfigUI"

    .line 554
    .line 555
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0}, Li0/a;->c([Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    return-void

    .line 563
    :pswitch_a
    check-cast v8, Lq0/f;

    .line 564
    .line 565
    new-array v0, v5, [Ljava/lang/Object;

    .line 566
    .line 567
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 568
    .line 569
    const-string v9, "isHidden"

    .line 570
    .line 571
    invoke-interface {v2, v7, v9, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    check-cast v0, Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-eqz v0, :cond_1a

    .line 582
    .line 583
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_f

    .line 591
    .line 592
    :cond_1a
    new-array v0, v5, [Ljava/lang/Object;

    .line 593
    .line 594
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 595
    .line 596
    const-string v9, "getActivity"

    .line 597
    .line 598
    invoke-interface {v2, v7, v9, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    move-object v2, v0

    .line 603
    check-cast v2, Landroid/app/Activity;

    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    const-string v9, "com.tencent.mm.ui.LauncherUI"

    .line 614
    .line 615
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v9

    .line 619
    if-nez v9, :cond_1b

    .line 620
    .line 621
    const-string v9, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 622
    .line 623
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v9

    .line 627
    if-nez v9, :cond_1b

    .line 628
    .line 629
    const-string v2, "isNot Match Activity"

    .line 630
    .line 631
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    goto/16 :goto_f

    .line 639
    .line 640
    :cond_1b
    new-array v0, v5, [Ljava/lang/Object;

    .line 641
    .line 642
    sget-object v9, Lc0/f;->b:Ld0/b;

    .line 643
    .line 644
    const-string v10, "getArguments"

    .line 645
    .line 646
    invoke-interface {v9, v7, v10, v0}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    check-cast v0, Landroid/os/Bundle;

    .line 651
    .line 652
    const-string v9, "Chat_User"

    .line 653
    .line 654
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    sget-boolean v0, Lz0/i;->a:Z

    .line 659
    .line 660
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 661
    .line 662
    .line 663
    move-result-object v10

    .line 664
    const-string v0, "maskId"

    .line 665
    .line 666
    invoke-static {v9, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    move v11, v5

    .line 674
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 675
    .line 676
    .line 677
    move-result v12

    .line 678
    const/4 v13, -0x1

    .line 679
    if-eqz v12, :cond_1d

    .line 680
    .line 681
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v12

    .line 685
    check-cast v12, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 686
    .line 687
    invoke-virtual {v12}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v12

    .line 691
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v12

    .line 695
    if-eqz v12, :cond_1c

    .line 696
    .line 697
    goto :goto_8

    .line 698
    :cond_1c
    add-int/2addr v11, v6

    .line 699
    goto :goto_7

    .line 700
    :cond_1d
    move v11, v13

    .line 701
    :goto_8
    invoke-static {}, Lz0/r;->p()I

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    const-string v12, "\u627e\u4e0d\u5230\u5f53\u524d\u804a\u5929\u7684\u7528\u6237\u4fe1\u606f"

    .line 706
    .line 707
    const/16 v14, 0x8fc

    .line 708
    .line 709
    if-lt v0, v14, :cond_27

    .line 710
    .line 711
    :try_start_2
    const-string v15, "f"

    .line 712
    .line 713
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 714
    .line 715
    invoke-interface {v6, v7, v15}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 719
    if-eqz v6, :cond_29

    .line 720
    .line 721
    const-string v7, "com.tencent.mm.autogen.table.BaseContact"

    .line 722
    .line 723
    if-gt v0, v14, :cond_1e

    .line 724
    .line 725
    :try_start_3
    const-string v0, "e"

    .line 726
    .line 727
    sget-object v14, Lc0/f;->b:Ld0/b;

    .line 728
    .line 729
    invoke-interface {v14, v6, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-static {v7}, Lm0/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    move-result-object v7

    .line 741
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 742
    .line 743
    .line 744
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 745
    if-eqz v6, :cond_29

    .line 746
    .line 747
    goto/16 :goto_c

    .line 748
    .line 749
    :catchall_1
    move-exception v0

    .line 750
    goto/16 :goto_a

    .line 751
    .line 752
    :cond_1e
    const/16 v14, 0x910

    .line 753
    .line 754
    const-string v15, "h"

    .line 755
    .line 756
    if-gt v0, v14, :cond_1f

    .line 757
    .line 758
    :try_start_4
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 759
    .line 760
    invoke-interface {v0, v6, v15}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v7}, Lm0/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    move-result-object v6

    .line 768
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    if-eqz v6, :cond_29

    .line 777
    .line 778
    goto/16 :goto_c

    .line 779
    .line 780
    :cond_1f
    const/16 v7, 0x938

    .line 781
    .line 782
    if-gt v0, v7, :cond_20

    .line 783
    .line 784
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 785
    .line 786
    invoke-interface {v0, v6, v15}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    goto/16 :goto_c

    .line 791
    .line 792
    :cond_20
    const/16 v7, 0xaf0

    .line 793
    .line 794
    if-le v0, v7, :cond_26

    .line 795
    .line 796
    const/16 v7, 0x97d

    .line 797
    .line 798
    if-le v0, v7, :cond_26

    .line 799
    .line 800
    const/16 v7, 0xa1d

    .line 801
    .line 802
    if-ne v0, v7, :cond_21

    .line 803
    .line 804
    goto :goto_9

    .line 805
    :cond_21
    const/16 v7, 0xb19

    .line 806
    .line 807
    if-ge v0, v7, :cond_22

    .line 808
    .line 809
    const-string v0, "j"

    .line 810
    .line 811
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 812
    .line 813
    invoke-interface {v7, v6, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    goto/16 :goto_c

    .line 818
    .line 819
    :cond_22
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    new-instance v7, LA0/a;

    .line 824
    .line 825
    const/16 v14, 0x1d

    .line 826
    .line 827
    invoke-direct {v7, v14}, LA0/a;-><init>(I)V

    .line 828
    .line 829
    .line 830
    sget-object v14, Lc0/f;->b:Ld0/b;

    .line 831
    .line 832
    invoke-interface {v14, v0, v7}, Ld0/b;->i(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Field;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    if-eqz v0, :cond_23

    .line 837
    .line 838
    array-length v7, v0

    .line 839
    if-nez v7, :cond_24

    .line 840
    .line 841
    :cond_23
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    new-instance v7, Lq0/d;

    .line 846
    .line 847
    invoke-direct {v7, v5}, Lq0/d;-><init>(I)V

    .line 848
    .line 849
    .line 850
    sget-object v14, Lc0/f;->b:Ld0/b;

    .line 851
    .line 852
    invoke-interface {v14, v0, v7}, Ld0/b;->i(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Field;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    :cond_24
    array-length v7, v0

    .line 857
    if-lez v7, :cond_25

    .line 858
    .line 859
    aget-object v0, v0, v5

    .line 860
    .line 861
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v21

    .line 865
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v16

    .line 869
    const-string v17, "guess user info object, "

    .line 870
    .line 871
    const-string v18, "find field: "

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v19

    .line 877
    const-string v20, "="

    .line 878
    .line 879
    filled-new-array/range {v16 .. v21}, [Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    move-object/from16 v0, v21

    .line 887
    .line 888
    goto :goto_c

    .line 889
    :cond_25
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const-string v6, "guess user info object fail!"

    .line 894
    .line 895
    filled-new-array {v0, v6}, [Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    goto :goto_b

    .line 903
    :cond_26
    :goto_9
    const-string v0, "i"

    .line 904
    .line 905
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 906
    .line 907
    invoke-interface {v7, v6, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 911
    goto :goto_c

    .line 912
    :goto_a
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    goto :goto_b

    .line 920
    :cond_27
    const/16 v6, 0x85c

    .line 921
    .line 922
    if-ne v0, v6, :cond_28

    .line 923
    .line 924
    :try_start_5
    const-string v0, "hED"

    .line 925
    .line 926
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 927
    .line 928
    invoke-interface {v6, v7, v0}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    if-eqz v0, :cond_29

    .line 933
    .line 934
    const-string v6, "ZfP"

    .line 935
    .line 936
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 937
    .line 938
    invoke-interface {v7, v0, v6}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 939
    .line 940
    .line 941
    goto :goto_b

    .line 942
    :catchall_2
    move-exception v0

    .line 943
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    goto :goto_b

    .line 951
    :cond_28
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    const-string v6, "\u672a\u9002\u914d\u7684\u7248\u672c"

    .line 956
    .line 957
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 962
    .line 963
    .line 964
    :cond_29
    :goto_b
    move-object v0, v4

    .line 965
    :goto_c
    if-eqz v0, :cond_2a

    .line 966
    .line 967
    sget-object v6, Lc0/f;->b:Ld0/b;

    .line 968
    .line 969
    const-string v7, "field_conRemark"

    .line 970
    .line 971
    invoke-interface {v6, v0, v7}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v6

    .line 975
    check-cast v6, Ljava/lang/String;

    .line 976
    .line 977
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 978
    .line 979
    const-string v12, "field_nickname"

    .line 980
    .line 981
    invoke-interface {v7, v0, v12}, Ld0/a;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v7

    .line 985
    check-cast v7, Ljava/lang/String;

    .line 986
    .line 987
    sget-object v12, Lg0/a;->a:LT/l;

    .line 988
    .line 989
    invoke-virtual {v12, v0}, LT/l;->f(Ljava/lang/Object;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    const-string v12, "chatUserInfo"

    .line 994
    .line 995
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_d

    .line 1003
    :cond_2a
    move-object v6, v3

    .line 1004
    move-object v7, v6

    .line 1005
    :goto_d
    if-gez v11, :cond_2e

    .line 1006
    .line 1007
    new-instance v0, Ls0/a;

    .line 1008
    .line 1009
    invoke-direct {v0, v2, v10}, Ls0/a;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 1010
    .line 1011
    .line 1012
    iput-object v9, v0, Ls0/a;->c:Ljava/lang/String;

    .line 1013
    .line 1014
    if-eqz v6, :cond_2b

    .line 1015
    .line 1016
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v9

    .line 1020
    if-eqz v9, :cond_2c

    .line 1021
    .line 1022
    :cond_2b
    move-object v6, v7

    .line 1023
    :cond_2c
    if-nez v6, :cond_2d

    .line 1024
    .line 1025
    goto :goto_e

    .line 1026
    :cond_2d
    move-object v3, v6

    .line 1027
    :goto_e
    iput-object v3, v0, Ls0/a;->d:Ljava/lang/String;

    .line 1028
    .line 1029
    new-instance v3, Lq0/c;

    .line 1030
    .line 1031
    invoke-direct {v3, v8, v5}, Lq0/c;-><init>(Lq0/f;I)V

    .line 1032
    .line 1033
    .line 1034
    const-string v5, "\u9000\u51fa\u914d\u7f6e"

    .line 1035
    .line 1036
    iput-object v5, v0, Ls0/a;->e:Ljava/lang/String;

    .line 1037
    .line 1038
    iput-object v3, v0, Ls0/a;->b:Lq0/c;

    .line 1039
    .line 1040
    new-instance v3, Ls0/q;

    .line 1041
    .line 1042
    new-instance v16, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 1043
    .line 1044
    iget-object v5, v0, Ls0/a;->c:Ljava/lang/String;

    .line 1045
    .line 1046
    iget-object v6, v0, Ls0/a;->d:Ljava/lang/String;

    .line 1047
    .line 1048
    const/16 v21, 0x0

    .line 1049
    .line 1050
    const/16 v22, 0x0

    .line 1051
    .line 1052
    const/16 v19, 0x0

    .line 1053
    .line 1054
    const/16 v20, 0x0

    .line 1055
    .line 1056
    const/16 v23, 0x3c

    .line 1057
    .line 1058
    const/16 v24, 0x0

    .line 1059
    .line 1060
    move-object/from16 v17, v5

    .line 1061
    .line 1062
    move-object/from16 v18, v6

    .line 1063
    .line 1064
    invoke-direct/range {v16 .. v24}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 1065
    .line 1066
    .line 1067
    move-object/from16 v5, v16

    .line 1068
    .line 1069
    invoke-direct {v3, v2, v5}, Ls0/q;-><init>(Landroid/app/Activity;Lcom/lu/wxmask/bean/MaskItemBean;)V

    .line 1070
    .line 1071
    .line 1072
    new-instance v5, Landroid/app/AlertDialog$Builder;

    .line 1073
    .line 1074
    invoke-direct {v5, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1075
    .line 1076
    .line 1077
    const-string v6, "\u6dfb\u52a0\u914d\u7f6e"

    .line 1078
    .line 1079
    invoke-virtual {v5, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v5

    .line 1083
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v2

    .line 1087
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 1088
    .line 1089
    invoke-virtual {v5, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    iget-object v5, v3, Ls0/q;->a:Landroid/widget/LinearLayout;

    .line 1094
    .line 1095
    invoke-virtual {v2, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    const-string v5, "\u5173\u95ed"

    .line 1100
    .line 1101
    invoke-virtual {v2, v5, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    const-string v5, "\u786e\u5b9a"

    .line 1106
    .line 1107
    invoke-virtual {v2, v5, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    iget-object v5, v0, Ls0/a;->e:Ljava/lang/String;

    .line 1112
    .line 1113
    iget-object v6, v0, Ls0/a;->b:Lq0/c;

    .line 1114
    .line 1115
    invoke-virtual {v2, v5, v6}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v2

    .line 1127
    invoke-virtual {v2, v13}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v4

    .line 1131
    new-instance v5, Lr0/v0;

    .line 1132
    .line 1133
    const/4 v6, 0x1

    .line 1134
    invoke-direct {v5, v3, v0, v2, v6}, Lr0/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_f

    .line 1141
    :cond_2e
    const-string v0, "\u5df2\u5728\u9690\u85cf\u540d\u5355\u4e2d"

    .line 1142
    .line 1143
    invoke-static {v0}, Lb1/h;->P(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    :goto_f
    return-void

    .line 1147
    :pswitch_b
    check-cast v8, Li/W;

    .line 1148
    .line 1149
    check-cast v7, Landroid/graphics/Typeface;

    .line 1150
    .line 1151
    invoke-virtual {v8, v7}, Li/W;->b(Landroid/graphics/Typeface;)V

    .line 1152
    .line 1153
    .line 1154
    return-void

    .line 1155
    :pswitch_c
    check-cast v8, Landroidx/profileinstaller/ProfileInstallerInitializer;

    .line 1156
    .line 1157
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1161
    .line 1162
    if-lt v2, v0, :cond_2f

    .line 1163
    .line 1164
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    invoke-static {v0}, LL/k;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    goto :goto_10

    .line 1173
    :cond_2f
    new-instance v0, Landroid/os/Handler;

    .line 1174
    .line 1175
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v2

    .line 1179
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1180
    .line 1181
    .line 1182
    :goto_10
    new-instance v2, Ljava/util/Random;

    .line 1183
    .line 1184
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 1185
    .line 1186
    .line 1187
    const/16 v3, 0x3e8

    .line 1188
    .line 1189
    const/4 v6, 0x1

    .line 1190
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    .line 1195
    .line 1196
    .line 1197
    move-result v2

    .line 1198
    new-instance v3, LL/h;

    .line 1199
    .line 1200
    check-cast v7, Landroid/content/Context;

    .line 1201
    .line 1202
    invoke-direct {v3, v7, v5}, LL/h;-><init>(Landroid/content/Context;I)V

    .line 1203
    .line 1204
    .line 1205
    add-int/lit16 v2, v2, 0x1388

    .line 1206
    .line 1207
    int-to-long v4, v2

    .line 1208
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1209
    .line 1210
    .line 1211
    return-void

    .line 1212
    :pswitch_d
    new-instance v0, LC/j;

    .line 1213
    .line 1214
    new-instance v9, LD0/b;

    .line 1215
    .line 1216
    const/4 v12, 0x0

    .line 1217
    const/4 v13, 0x0

    .line 1218
    move-object v10, v8

    .line 1219
    check-cast v10, Ljava/lang/String;

    .line 1220
    .line 1221
    const-string v11, "GET"

    .line 1222
    .line 1223
    const/16 v14, 0x3c

    .line 1224
    .line 1225
    invoke-direct/range {v9 .. v14}, LD0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)V

    .line 1226
    .line 1227
    .line 1228
    invoke-direct {v0, v2}, LC/j;-><init>(I)V

    .line 1229
    .line 1230
    .line 1231
    iput-object v9, v0, LC/j;->c:Ljava/lang/Object;

    .line 1232
    .line 1233
    invoke-virtual {v0}, LC/j;->w()LD0/c;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    check-cast v7, LM0/l;

    .line 1238
    .line 1239
    invoke-interface {v7, v0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    return-void

    .line 1243
    :pswitch_e
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 1244
    .line 1245
    check-cast v8, Landroid/app/Activity;

    .line 1246
    .line 1247
    invoke-direct {v2, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1248
    .line 1249
    .line 1250
    const-string v3, "\u52a8\u6001\u9002\u914d"

    .line 1251
    .line 1252
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    check-cast v7, Ljava/util/ArrayList;

    .line 1257
    .line 1258
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1259
    .line 1260
    .line 1261
    move-result v3

    .line 1262
    new-instance v4, Landroid/widget/LinearLayout;

    .line 1263
    .line 1264
    invoke-direct {v4, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1265
    .line 1266
    .line 1267
    const/4 v6, 0x1

    .line 1268
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1269
    .line 1270
    .line 1271
    sget-object v6, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1272
    .line 1273
    const/16 v6, 0x18

    .line 1274
    .line 1275
    invoke-static {v8, v6}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1276
    .line 1277
    .line 1278
    move-result v9

    .line 1279
    const/16 v10, 0x10

    .line 1280
    .line 1281
    invoke-static {v8, v10}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1282
    .line 1283
    .line 1284
    move-result v11

    .line 1285
    invoke-static {v8, v6}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1286
    .line 1287
    .line 1288
    move-result v6

    .line 1289
    const/4 v12, 0x4

    .line 1290
    invoke-static {v8, v12}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1291
    .line 1292
    .line 1293
    move-result v13

    .line 1294
    invoke-virtual {v4, v9, v11, v6, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 1295
    .line 1296
    .line 1297
    new-instance v6, Landroid/widget/LinearLayout;

    .line 1298
    .line 1299
    invoke-direct {v6, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v6, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1306
    .line 1307
    .line 1308
    new-instance v9, Landroid/widget/TextView;

    .line 1309
    .line 1310
    invoke-direct {v9, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1311
    .line 1312
    .line 1313
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1314
    .line 1315
    const/4 v11, -0x2

    .line 1316
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1317
    .line 1318
    invoke-direct {v10, v5, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1322
    .line 1323
    .line 1324
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1325
    .line 1326
    const-string v11, "\u68c0\u6d4b\u5230 "

    .line 1327
    .line 1328
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1332
    .line 1333
    .line 1334
    const-string v11, " \u9879\u9700\u8981\u626b\u63cf\u9002\u914d"

    .line 1335
    .line 1336
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v10

    .line 1343
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1344
    .line 1345
    .line 1346
    const/high16 v10, 0x41880000    # 17.0f

    .line 1347
    .line 1348
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1349
    .line 1350
    .line 1351
    sget-object v10, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 1352
    .line 1353
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1354
    .line 1355
    .line 1356
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 1357
    .line 1358
    .line 1359
    move-result v0

    .line 1360
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1364
    .line 1365
    .line 1366
    new-instance v0, Landroid/widget/TextView;

    .line 1367
    .line 1368
    invoke-direct {v0, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1376
    .line 1377
    .line 1378
    const/16 v3, 0x11

    .line 1379
    .line 1380
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 1381
    .line 1382
    .line 1383
    const/high16 v3, 0x41600000    # 14.0f

    .line 1384
    .line 1385
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1389
    .line 1390
    .line 1391
    const/16 v9, 0x24

    .line 1392
    .line 1393
    const/16 v10, 0x75

    .line 1394
    .line 1395
    const/16 v11, 0x54

    .line 1396
    .line 1397
    invoke-static {v9, v10, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 1398
    .line 1399
    .line 1400
    move-result v9

    .line 1401
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1402
    .line 1403
    .line 1404
    const/16 v9, 0xc

    .line 1405
    .line 1406
    invoke-static {v8, v9}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1407
    .line 1408
    .line 1409
    move-result v10

    .line 1410
    invoke-static {v8, v12}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1411
    .line 1412
    .line 1413
    move-result v11

    .line 1414
    invoke-static {v8, v9}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1415
    .line 1416
    .line 1417
    move-result v13

    .line 1418
    invoke-static {v8, v12}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1419
    .line 1420
    .line 1421
    move-result v12

    .line 1422
    invoke-virtual {v0, v10, v11, v13, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1423
    .line 1424
    .line 1425
    const/16 v10, 0xe0

    .line 1426
    .line 1427
    const/16 v11, 0xf5

    .line 1428
    .line 1429
    const/16 v12, 0xeb

    .line 1430
    .line 1431
    invoke-static {v10, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 1432
    .line 1433
    .line 1434
    move-result v10

    .line 1435
    const/16 v11, 0xe

    .line 1436
    .line 1437
    invoke-static {v8, v11}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1438
    .line 1439
    .line 1440
    move-result v11

    .line 1441
    invoke-static {v10, v11}, LA0/y;->d(II)Landroid/graphics/drawable/GradientDrawable;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v10

    .line 1445
    invoke-virtual {v0, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1452
    .line 1453
    .line 1454
    new-instance v0, Landroid/widget/TextView;

    .line 1455
    .line 1456
    invoke-direct {v0, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1457
    .line 1458
    .line 1459
    const-string v6, "\u5f00\u59cb\u540e\u4f1a\u81ea\u52a8\u626b\u63cf\u5f53\u524d\u5fae\u4fe1\u7248\u672c\u6240\u9700\u9002\u914d\u70b9\u3002\u626b\u63cf\u6210\u529f\u540e\u91cd\u542f\u5fae\u4fe1\u751f\u6548\u3002"

    .line 1460
    .line 1461
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1465
    .line 1466
    .line 1467
    const/16 v3, 0x64

    .line 1468
    .line 1469
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 1470
    .line 1471
    .line 1472
    move-result v3

    .line 1473
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1474
    .line 1475
    .line 1476
    invoke-static {v8, v9}, LA0/y;->b(Landroid/content/Context;I)I

    .line 1477
    .line 1478
    .line 1479
    move-result v3

    .line 1480
    invoke-virtual {v0, v5, v3, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    new-instance v2, LA0/n;

    .line 1495
    .line 1496
    invoke-direct {v2, v8, v7}, LA0/n;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 1497
    .line 1498
    .line 1499
    const-string v3, "\u5f00\u59cb\u9002\u914d"

    .line 1500
    .line 1501
    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    new-instance v2, LA0/n;

    .line 1506
    .line 1507
    invoke-direct {v2, v7, v8}, LA0/n;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;)V

    .line 1508
    .line 1509
    .line 1510
    const-string v3, "\u6682\u4e0d\u626b\u63cf"

    .line 1511
    .line 1512
    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1517
    .line 1518
    .line 1519
    return-void

    .line 1520
    nop

    :pswitch_data_0
    .packed-switch 0x0
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
