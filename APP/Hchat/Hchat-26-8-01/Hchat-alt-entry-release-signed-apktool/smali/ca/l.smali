.class public final synthetic Lca/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lca/e0;

.field public final synthetic j:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lca/e0;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lca/l;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/l;->h:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lca/l;->i:Lca/e0;

    .line 10
    .line 11
    iput-object p3, p0, Lca/l;->j:Lfg/l;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;Lfg/l;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lca/l;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/l;->i:Lca/e0;

    iput-object p2, p0, Lca/l;->h:Landroid/app/Activity;

    iput-object p3, p0, Lca/l;->j:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lca/l;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/util/List;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lca/l;->h:Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string p1, "\u6ca1\u6709\u53ef\u7528\u8054\u7cfb\u4eba"

    .line 33
    .line 34
    iget-object v1, p0, Lca/l;->i:Lca/e0;

    .line 35
    .line 36
    invoke-virtual {v1, v0, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p0, Lca/l;->j:Lfg/l;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v3, v2

    .line 71
    check-cast v3, Lwb/jv;

    .line 72
    .line 73
    iget-boolean v4, v3, Lwb/jv;->c:Z

    .line 74
    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    iget-boolean v4, v3, Lwb/jv;->g:Z

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    iget-object v3, v3, Lwb/jv;->f:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    new-instance v1, Ldg/n;

    .line 94
    .line 95
    const/4 v2, 0x6

    .line 96
    invoke-direct {v1, p1, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    new-instance p1, Lb4/b;

    .line 100
    .line 101
    const/16 v2, 0xe

    .line 102
    .line 103
    invoke-direct {p1, v2}, Lb4/b;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Lng/i;

    .line 107
    .line 108
    const/4 v3, 0x1

    .line 109
    invoke-direct {v2, v1, v3, p1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 110
    .line 111
    .line 112
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 115
    .line 116
    .line 117
    new-instance p1, Lng/h;

    .line 118
    .line 119
    invoke-direct {p1, v2}, Lng/h;-><init>(Lng/i;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v2, v1

    .line 133
    check-cast v2, Lwb/jv;

    .line 134
    .line 135
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 136
    .line 137
    invoke-interface {v6, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-static {}, La/a;->E()Luf/c;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v1, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_6

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lwb/jv;

    .line 165
    .line 166
    iget-object v4, v4, Lwb/jv;->f:Ljava/util/List;

    .line 167
    .line 168
    invoke-static {v1, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :cond_7
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Ljava/lang/String;

    .line 199
    .line 200
    new-instance v4, Ldg/n;

    .line 201
    .line 202
    const/4 v5, 0x6

    .line 203
    invoke-direct {v4, v0, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    new-instance v5, Lca/s;

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    invoke-direct {v5, v2, v7}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 210
    .line 211
    .line 212
    new-instance v7, Lng/i;

    .line 213
    .line 214
    invoke-direct {v7, v4, v3, v5}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 215
    .line 216
    .line 217
    new-instance v4, Lb4/b;

    .line 218
    .line 219
    const/16 v5, 0xf

    .line 220
    .line 221
    invoke-direct {v4, v5}, Lb4/b;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-static {v7, v4}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v4}, Lng/m;->S(Lng/j;)Lng/c;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-static {v4}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_7

    .line 241
    .line 242
    new-instance v5, Lca/a0;

    .line 243
    .line 244
    const-string v7, "\u597d\u53cb\u6807\u7b7e \u00b7 "

    .line 245
    .line 246
    invoke-static {v7, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    const-string v8, " \u4eba"

    .line 255
    .line 256
    invoke-static {v7, v8}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-direct {v5, v2, v7, v4}, Lca/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_8
    iget-object v0, p0, Lca/l;->i:Lca/e0;

    .line 268
    .line 269
    iget-object v1, v0, Lca/e0;->a:Lr8/g;

    .line 270
    .line 271
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 272
    .line 273
    invoke-static {v1}, Lx6/d;->K(Landroid/content/Context;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_a

    .line 286
    .line 287
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Ln9/a;

    .line 292
    .line 293
    iget-object v4, v2, Ln9/a;->c:Ljava/util/Set;

    .line 294
    .line 295
    check-cast v4, Ljava/lang/Iterable;

    .line 296
    .line 297
    new-instance v13, Ldg/n;

    .line 298
    .line 299
    const/4 v5, 0x6

    .line 300
    invoke-direct {v13, v4, v5}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 301
    .line 302
    .line 303
    new-instance v4, Lc0/f;

    .line 304
    .line 305
    const-class v5, Ljava/util/Map;

    .line 306
    .line 307
    invoke-static {v5}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    const/4 v11, 0x0

    .line 312
    const/16 v12, 0xb

    .line 313
    .line 314
    const/4 v5, 0x1

    .line 315
    const-string v8, "containsKey"

    .line 316
    .line 317
    const-string v9, "containsKey(Ljava/lang/Object;)Z"

    .line 318
    .line 319
    const/4 v10, 0x0

    .line 320
    invoke-direct/range {v4 .. v12}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 321
    .line 322
    .line 323
    new-instance v5, Lng/i;

    .line 324
    .line 325
    invoke-direct {v5, v13, v3, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v5}, Lng/m;->S(Lng/j;)Lng/c;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-static {v4}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 337
    .line 338
    .line 339
    move-result v5

    .line 340
    if-nez v5, :cond_9

    .line 341
    .line 342
    new-instance v5, Lca/a0;

    .line 343
    .line 344
    iget-object v2, v2, Ln9/a;->b:Ljava/lang/String;

    .line 345
    .line 346
    const-string v7, "\u7fa4\u804a\u6807\u7b7e \u00b7 "

    .line 347
    .line 348
    invoke-static {v7, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    const-string v8, " \u4e2a\u7fa4\u804a"

    .line 357
    .line 358
    invoke-static {v7, v8}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-direct {v5, v2, v7, v4}, Lca/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p1, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_a
    invoke-static {p1}, La/a;->t(Luf/c;)Luf/c;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-virtual {p1}, Luf/c;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    iget-object v2, p0, Lca/l;->h:Landroid/app/Activity;

    .line 378
    .line 379
    if-eqz v1, :cond_b

    .line 380
    .line 381
    const-string p1, "\u6ca1\u6709\u53ef\u7528\u7684\u6807\u7b7e"

    .line 382
    .line 383
    invoke-virtual {v0, v2, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_b
    new-instance v5, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 394
    .line 395
    .line 396
    const/4 v0, 0x0

    .line 397
    invoke-virtual {p1, v0}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    :goto_6
    move-object v1, v0

    .line 402
    check-cast v1, Luf/a;

    .line 403
    .line 404
    invoke-virtual {v1}, Luf/a;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-eqz v3, :cond_c

    .line 409
    .line 410
    invoke-virtual {v1}, Luf/a;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    check-cast v1, Lca/a0;

    .line 415
    .line 416
    iget-object v3, v1, Lca/a0;->a:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v1, v1, Lca/a0;->b:Ljava/lang/String;

    .line 419
    .line 420
    new-instance v4, Lsf/e;

    .line 421
    .line 422
    invoke-direct {v4, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    goto :goto_6

    .line 429
    :cond_c
    new-instance v7, Lc9/i;

    .line 430
    .line 431
    const/4 v0, 0x5

    .line 432
    iget-object v1, p0, Lca/l;->j:Lfg/l;

    .line 433
    .line 434
    invoke-direct {v7, p1, v0, v1}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance v8, Lbi/c;

    .line 438
    .line 439
    const/4 p1, 0x7

    .line 440
    invoke-direct {v8, p1}, Lbi/c;-><init>(I)V

    .line 441
    .line 442
    .line 443
    const/16 v9, 0x130

    .line 444
    .line 445
    const-string v3, "\u9009\u62e9\u6807\u7b7e"

    .line 446
    .line 447
    const-string v4, ""

    .line 448
    .line 449
    const/4 v6, 0x0

    .line 450
    invoke-static/range {v2 .. v9}, Lwb/y2;->Z1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Lfg/l;Lfg/a;I)V

    .line 451
    .line 452
    .line 453
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 454
    .line 455
    return-object p1

    .line 456
    nop

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
