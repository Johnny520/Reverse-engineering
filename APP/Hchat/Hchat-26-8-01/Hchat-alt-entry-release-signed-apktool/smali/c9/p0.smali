.class public final synthetic Lc9/p0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lc9/p0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/p0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/p0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/p0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lc9/p0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lc9/p0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p6, p0, Lc9/p0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/p0;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lqg/t;

    .line 11
    .line 12
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v2

    .line 15
    check-cast v4, Li0/a1;

    .line 16
    .line 17
    iget-object v2, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v2

    .line 20
    check-cast v5, Li0/a1;

    .line 21
    .line 22
    iget-object v2, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, v2

    .line 25
    check-cast v6, Laa/c;

    .line 26
    .line 27
    iget-object v2, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v7, v2

    .line 30
    check-cast v7, Li0/a1;

    .line 31
    .line 32
    iget-object v2, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v8, v2

    .line 35
    check-cast v8, Li0/a1;

    .line 36
    .line 37
    new-instance v3, Lf0/b;

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/16 v10, 0xb

    .line 41
    .line 42
    invoke-direct/range {v3 .. v10}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x3

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-static {v1, v4, v3, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_0
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    iget-object v1, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v3, v1

    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    check-cast v4, Li0/a1;

    .line 67
    .line 68
    iget-object v1, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v5, v1

    .line 71
    check-cast v5, Landroid/content/Context;

    .line 72
    .line 73
    iget-object v1, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v6, v1

    .line 76
    check-cast v6, Lwb/yt;

    .line 77
    .line 78
    iget-object v1, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v7, v1

    .line 81
    check-cast v7, Li0/a1;

    .line 82
    .line 83
    invoke-static/range {v2 .. v7}, Lwb/y2;->n1(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Li0/a1;Landroid/content/Context;Lwb/yt;Li0/a1;)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_1
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v2, v1

    .line 92
    check-cast v2, Lqg/t;

    .line 93
    .line 94
    iget-object v1, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v3, v1

    .line 97
    check-cast v3, Li0/a1;

    .line 98
    .line 99
    iget-object v1, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v4, v1

    .line 102
    check-cast v4, Li0/a1;

    .line 103
    .line 104
    iget-object v1, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v5, v1

    .line 107
    check-cast v5, Lfb/v;

    .line 108
    .line 109
    iget-object v1, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v6, v1

    .line 112
    check-cast v6, Li0/a1;

    .line 113
    .line 114
    iget-object v1, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v7, v1

    .line 117
    check-cast v7, Li0/a1;

    .line 118
    .line 119
    invoke-static/range {v2 .. v7}, Lwb/y2;->f0(Lqg/t;Li0/a1;Li0/a1;Lfb/v;Li0/a1;Li0/a1;)V

    .line 120
    .line 121
    .line 122
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_2
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Lwb/hq;

    .line 128
    .line 129
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v5, v2

    .line 132
    check-cast v5, Li0/a1;

    .line 133
    .line 134
    iget-object v2, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v3, v2

    .line 137
    check-cast v3, Landroid/content/SharedPreferences;

    .line 138
    .line 139
    iget-object v2, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v4, v2

    .line 142
    check-cast v4, Li0/a1;

    .line 143
    .line 144
    iget-object v2, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v6, v2

    .line 147
    check-cast v6, Li0/a1;

    .line 148
    .line 149
    iget-object v2, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Li0/a1;

    .line 152
    .line 153
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    iget v1, v1, Lwb/hq;->a:I

    .line 164
    .line 165
    if-ltz v1, :cond_0

    .line 166
    .line 167
    if-ge v1, v7, :cond_0

    .line 168
    .line 169
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Ljava/util/List;

    .line 174
    .line 175
    invoke-static {v7}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const/4 v9, 0x0

    .line 186
    const/16 v10, 0x50

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    invoke-static/range {v3 .. v10}, Lwb/ho;->Y2(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    :cond_0
    const/4 v1, 0x0

    .line 193
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 197
    .line 198
    return-object v1

    .line 199
    :pswitch_3
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Lwb/uq;

    .line 202
    .line 203
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Li0/a1;

    .line 206
    .line 207
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v3, Li0/a1;

    .line 210
    .line 211
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v4, Li0/a1;

    .line 214
    .line 215
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v5, Landroid/content/SharedPreferences;

    .line 218
    .line 219
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v6, Li0/a1;

    .line 222
    .line 223
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    check-cast v7, Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    iget v1, v1, Lwb/uq;->a:I

    .line 234
    .line 235
    const/4 v8, 0x0

    .line 236
    if-ltz v1, :cond_9

    .line 237
    .line 238
    if-ge v1, v7, :cond_9

    .line 239
    .line 240
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    check-cast v7, Ljava/util/List;

    .line 245
    .line 246
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    check-cast v7, Lna/j;

    .line 251
    .line 252
    iget-object v7, v7, Lna/j;->a:Ljava/lang/String;

    .line 253
    .line 254
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Ljava/util/List;

    .line 259
    .line 260
    invoke-static {v9}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, Ljava/util/List;

    .line 272
    .line 273
    new-instance v10, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-eqz v11, :cond_2

    .line 291
    .line 292
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    move-object v12, v11

    .line 297
    check-cast v12, Lna/i;

    .line 298
    .line 299
    iget-object v11, v12, Lna/i;->e:Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {v11, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    if-eqz v11, :cond_1

    .line 306
    .line 307
    const-string v17, ""

    .line 308
    .line 309
    const/16 v18, 0x6f

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v14, 0x0

    .line 313
    const/4 v15, 0x0

    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    invoke-static/range {v12 .. v18}, Lna/i;->a(Lna/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)Lna/i;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    :cond_1
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_0

    .line 324
    :cond_2
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    check-cast v1, Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v1, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    if-nez v7, :cond_5

    .line 335
    .line 336
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    if-eqz v7, :cond_3

    .line 341
    .line 342
    goto :goto_1

    .line 343
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    if-eqz v11, :cond_5

    .line 352
    .line 353
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    check-cast v11, Lna/j;

    .line 358
    .line 359
    iget-object v11, v11, Lna/j;->a:Ljava/lang/String;

    .line 360
    .line 361
    invoke-virtual {v11, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    if-eqz v11, :cond_4

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_5
    :goto_1
    move-object v1, v8

    .line 369
    :goto_2
    if-eqz v1, :cond_6

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_6
    invoke-static {v9}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lna/j;

    .line 377
    .line 378
    if-eqz v1, :cond_7

    .line 379
    .line 380
    iget-object v1, v1, Lna/j;->a:Ljava/lang/String;

    .line 381
    .line 382
    goto :goto_3

    .line 383
    :cond_7
    move-object v1, v8

    .line 384
    :goto_3
    if-nez v1, :cond_8

    .line 385
    .line 386
    const-string v1, ""

    .line 387
    .line 388
    :cond_8
    :goto_4
    invoke-interface {v2, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v3, v10}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v5, v9, v10, v1}, Lwb/ho;->X2(Landroid/content/SharedPreferences;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :cond_9
    invoke-interface {v6, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 404
    .line 405
    return-object v1

    .line 406
    :pswitch_4
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v1, Lwb/c4;

    .line 409
    .line 410
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v2, Landroid/content/SharedPreferences;

    .line 413
    .line 414
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v3, Landroid/content/Context;

    .line 417
    .line 418
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v4, Li0/a1;

    .line 421
    .line 422
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v5, Li0/a1;

    .line 425
    .line 426
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v6, Li0/a1;

    .line 429
    .line 430
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    check-cast v7, Ljava/util/List;

    .line 435
    .line 436
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    iget v1, v1, Lwb/c4;->a:I

    .line 441
    .line 442
    if-ltz v1, :cond_c

    .line 443
    .line 444
    if-ge v1, v7, :cond_c

    .line 445
    .line 446
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    check-cast v7, Ljava/util/List;

    .line 451
    .line 452
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    check-cast v7, Lo9/q;

    .line 457
    .line 458
    iget-object v7, v7, Lo9/q;->a:Ljava/lang/String;

    .line 459
    .line 460
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    check-cast v8, Ljava/util/List;

    .line 465
    .line 466
    invoke-static {v8}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    check-cast v1, Ljava/util/List;

    .line 478
    .line 479
    new-instance v9, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v10

    .line 492
    if-eqz v10, :cond_b

    .line 493
    .line 494
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v10

    .line 498
    move-object v11, v10

    .line 499
    check-cast v11, Lo9/r;

    .line 500
    .line 501
    iget-object v11, v11, Lo9/r;->c:Ljava/lang/String;

    .line 502
    .line 503
    invoke-static {v11, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    if-nez v11, :cond_a

    .line 508
    .line 509
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    goto :goto_5

    .line 513
    :cond_b
    invoke-interface {v4, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    invoke-interface {v5, v9}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    const-string v2, "group_member_reply_templates"

    .line 524
    .line 525
    invoke-static {v8}, Lr9/e0;->D(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    const-string v2, "group_member_reply_template_bindings"

    .line 534
    .line 535
    invoke-static {v9}, Lr9/e0;->A(Ljava/util/List;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 544
    .line 545
    .line 546
    const-string v1, "\u6a21\u677f\u5df2\u5220\u9664"

    .line 547
    .line 548
    const/4 v2, 0x0

    .line 549
    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 554
    .line 555
    .line 556
    :cond_c
    const/4 v1, 0x0

    .line 557
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 561
    .line 562
    return-object v1

    .line 563
    :pswitch_5
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 564
    .line 565
    move-object v3, v1

    .line 566
    check-cast v3, Li0/a1;

    .line 567
    .line 568
    iget-object v1, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 569
    .line 570
    move-object v4, v1

    .line 571
    check-cast v4, Li0/a1;

    .line 572
    .line 573
    iget-object v1, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 574
    .line 575
    move-object v5, v1

    .line 576
    check-cast v5, Li0/a1;

    .line 577
    .line 578
    iget-object v1, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 579
    .line 580
    move-object v6, v1

    .line 581
    check-cast v6, Landroid/content/SharedPreferences;

    .line 582
    .line 583
    iget-object v1, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 584
    .line 585
    move-object v7, v1

    .line 586
    check-cast v7, Li0/a1;

    .line 587
    .line 588
    iget-object v1, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v1, Li0/a1;

    .line 591
    .line 592
    new-instance v8, Lwb/v0;

    .line 593
    .line 594
    new-instance v2, Lwb/eh;

    .line 595
    .line 596
    invoke-direct/range {v2 .. v7}, Lwb/eh;-><init>(Li0/a1;Li0/a1;Li0/a1;Landroid/content/SharedPreferences;Li0/a1;)V

    .line 597
    .line 598
    .line 599
    const/4 v14, 0x1

    .line 600
    const/16 v15, 0xc0

    .line 601
    .line 602
    const-string v9, "\u9009\u62e9\u9002\u7528\u804a\u5929"

    .line 603
    .line 604
    sget-object v10, Lwb/u0;->i:Lwb/u0;

    .line 605
    .line 606
    const/4 v11, 0x1

    .line 607
    const-string v12, ""

    .line 608
    .line 609
    move-object v13, v2

    .line 610
    invoke-direct/range {v8 .. v15}, Lwb/v0;-><init>(Ljava/lang/String;Lwb/u0;ZLjava/lang/String;Lfg/l;ZI)V

    .line 611
    .line 612
    .line 613
    invoke-interface {v1, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 617
    .line 618
    return-object v1

    .line 619
    :pswitch_6
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v1, Lwb/l4;

    .line 622
    .line 623
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v2, Landroid/content/SharedPreferences;

    .line 626
    .line 627
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v3, Landroid/content/Context;

    .line 630
    .line 631
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v4, Li0/a1;

    .line 634
    .line 635
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v5, Li0/a1;

    .line 638
    .line 639
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v6, Li0/a1;

    .line 642
    .line 643
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    check-cast v7, Ljava/lang/String;

    .line 648
    .line 649
    invoke-static {v7}, Lwb/ho;->y6(Ljava/lang/String;)Ljava/util/Set;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    check-cast v1, Lwb/j4;

    .line 654
    .line 655
    iget-object v1, v1, Lwb/j4;->a:Ljava/lang/String;

    .line 656
    .line 657
    invoke-static {v7, v1}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    invoke-static {v7}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    invoke-interface {v4, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    check-cast v7, Ljava/util/List;

    .line 673
    .line 674
    new-instance v8, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    :cond_d
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v9

    .line 687
    if-eqz v9, :cond_e

    .line 688
    .line 689
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v9

    .line 693
    move-object v10, v9

    .line 694
    check-cast v10, Lq9/h;

    .line 695
    .line 696
    iget-object v10, v10, Lq9/h;->a:Ljava/lang/String;

    .line 697
    .line 698
    invoke-static {v10, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result v10

    .line 702
    if-nez v10, :cond_d

    .line 703
    .line 704
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    goto :goto_6

    .line 708
    :cond_e
    invoke-interface {v5, v8}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    check-cast v4, Ljava/lang/String;

    .line 716
    .line 717
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    check-cast v5, Ljava/util/List;

    .line 722
    .line 723
    invoke-static {v2, v1, v4, v5}, Lwb/ho;->j5(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 724
    .line 725
    .line 726
    const-string v1, "\u7fa4\u914d\u7f6e\u5df2\u5220\u9664"

    .line 727
    .line 728
    const/4 v2, 0x0

    .line 729
    invoke-static {v3, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 734
    .line 735
    .line 736
    sget-object v1, Lwb/h4;->b:Lwb/h4;

    .line 737
    .line 738
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 742
    .line 743
    return-object v1

    .line 744
    :pswitch_7
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v1, Lx8/r;

    .line 747
    .line 748
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v2, Landroid/content/Context;

    .line 751
    .line 752
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v3, Li0/a1;

    .line 755
    .line 756
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v4, Li0/a1;

    .line 759
    .line 760
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v5, Li0/a1;

    .line 763
    .line 764
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v6, Li0/a1;

    .line 767
    .line 768
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    check-cast v7, Ljava/util/List;

    .line 773
    .line 774
    new-instance v8, Ljava/util/ArrayList;

    .line 775
    .line 776
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 777
    .line 778
    .line 779
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    :cond_f
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 784
    .line 785
    .line 786
    move-result v9

    .line 787
    if-eqz v9, :cond_11

    .line 788
    .line 789
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    move-object v10, v9

    .line 794
    check-cast v10, Lx8/u;

    .line 795
    .line 796
    iget-object v11, v10, Lx8/u;->a:Ljava/lang/String;

    .line 797
    .line 798
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v12

    .line 802
    check-cast v12, Ljava/lang/String;

    .line 803
    .line 804
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v11

    .line 808
    if-nez v11, :cond_f

    .line 809
    .line 810
    iget-object v10, v10, Lx8/u;->a:Ljava/lang/String;

    .line 811
    .line 812
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v11

    .line 816
    check-cast v11, Ljava/lang/String;

    .line 817
    .line 818
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v10

    .line 822
    if-eqz v10, :cond_10

    .line 823
    .line 824
    goto :goto_7

    .line 825
    :cond_10
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    goto :goto_7

    .line 829
    :cond_11
    invoke-static {v8}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    check-cast v5, Lx8/u;

    .line 834
    .line 835
    if-eqz v5, :cond_12

    .line 836
    .line 837
    iget-object v5, v5, Lx8/u;->a:Ljava/lang/String;

    .line 838
    .line 839
    if-eqz v5, :cond_12

    .line 840
    .line 841
    goto :goto_8

    .line 842
    :cond_12
    const-string v5, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 843
    .line 844
    :goto_8
    invoke-virtual {v1, v5, v8}, Lx8/r;->n(Ljava/lang/String;Ljava/util/List;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v1}, Lx8/r;->p()Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    invoke-interface {v3, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1}, Lx8/r;->b()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    check-cast v1, Ljava/lang/String;

    .line 866
    .line 867
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    const-string v1, "\u5df2\u5220\u9664\u5f53\u524d\u914d\u7f6e"

    .line 871
    .line 872
    const/4 v3, 0x0

    .line 873
    invoke-static {v2, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 878
    .line 879
    .line 880
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 881
    .line 882
    return-object v1

    .line 883
    :pswitch_8
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v1, Lqg/t;

    .line 886
    .line 887
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v2, Li0/a1;

    .line 890
    .line 891
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v3, Li0/a1;

    .line 894
    .line 895
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 896
    .line 897
    move-object v10, v4

    .line 898
    check-cast v10, Li0/a1;

    .line 899
    .line 900
    iget-object v4, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 901
    .line 902
    move-object v6, v4

    .line 903
    check-cast v6, Landroid/content/Context;

    .line 904
    .line 905
    iget-object v4, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 906
    .line 907
    move-object v9, v4

    .line 908
    check-cast v9, Li0/a1;

    .line 909
    .line 910
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    move-object v7, v2

    .line 915
    check-cast v7, Ljava/lang/String;

    .line 916
    .line 917
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    move-object v8, v2

    .line 922
    check-cast v8, Ljava/lang/String;

    .line 923
    .line 924
    const-string v2, "\u6b63\u5728\u62c9\u53d6\u6a21\u578b..."

    .line 925
    .line 926
    invoke-interface {v10, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    new-instance v5, Lf0/b;

    .line 930
    .line 931
    const/4 v11, 0x0

    .line 932
    const/16 v12, 0x8

    .line 933
    .line 934
    invoke-direct/range {v5 .. v12}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 935
    .line 936
    .line 937
    const/4 v2, 0x3

    .line 938
    const/4 v3, 0x0

    .line 939
    invoke-static {v1, v3, v5, v2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 940
    .line 941
    .line 942
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 943
    .line 944
    return-object v1

    .line 945
    :pswitch_9
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v1, Li0/a1;

    .line 948
    .line 949
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v2, Li0/a1;

    .line 952
    .line 953
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v3, Li0/a1;

    .line 956
    .line 957
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v4, Li0/a1;

    .line 960
    .line 961
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v5, Li0/a1;

    .line 964
    .line 965
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v6, Li0/a1;

    .line 968
    .line 969
    const/16 v7, 0x2c

    .line 970
    .line 971
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 972
    .line 973
    .line 974
    move-result-object v7

    .line 975
    invoke-interface {v1, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    const-string v1, "#FFFFFF"

    .line 979
    .line 980
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    invoke-interface {v3, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    const-string v1, ""

    .line 987
    .line 988
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 989
    .line 990
    .line 991
    const/16 v2, 0xe

    .line 992
    .line 993
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    invoke-interface {v5, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1004
    .line 1005
    return-object v1

    .line 1006
    :pswitch_a
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v1, Lwb/s0;

    .line 1009
    .line 1010
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v2, Lwb/s0;

    .line 1013
    .line 1014
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v3, Ljava/lang/String;

    .line 1017
    .line 1018
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v4, Li0/a1;

    .line 1021
    .line 1022
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v5, Li0/a1;

    .line 1025
    .line 1026
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast v6, Li0/a1;

    .line 1029
    .line 1030
    if-nez v1, :cond_13

    .line 1031
    .line 1032
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_9

    .line 1036
    :cond_13
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    check-cast v1, Ljava/util/Set;

    .line 1041
    .line 1042
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v1

    .line 1046
    if-eqz v1, :cond_14

    .line 1047
    .line 1048
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    check-cast v1, Ljava/util/Set;

    .line 1053
    .line 1054
    invoke-static {v1, v3}, Ltf/d0;->S(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1062
    .line 1063
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_9

    .line 1067
    :cond_14
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    check-cast v1, Ljava/util/Set;

    .line 1072
    .line 1073
    invoke-static {v1, v3}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    invoke-interface {v5, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1081
    .line 1082
    invoke-interface {v6, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1086
    .line 1087
    return-object v1

    .line 1088
    :pswitch_b
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1089
    .line 1090
    check-cast v1, Landroid/content/Context;

    .line 1091
    .line 1092
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v2, Li0/a1;

    .line 1095
    .line 1096
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v3, Li0/a1;

    .line 1099
    .line 1100
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v4, Li0/a1;

    .line 1103
    .line 1104
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v5, Li0/a1;

    .line 1107
    .line 1108
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v6, Li0/a1;

    .line 1111
    .line 1112
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    check-cast v2, Ljava/lang/String;

    .line 1117
    .line 1118
    invoke-static {v2}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    check-cast v3, Ljava/lang/String;

    .line 1127
    .line 1128
    invoke-static {v3}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v3

    .line 1132
    const/4 v7, 0x0

    .line 1133
    if-eqz v3, :cond_15

    .line 1134
    .line 1135
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1136
    .line 1137
    .line 1138
    move-result v3

    .line 1139
    move v10, v3

    .line 1140
    goto :goto_a

    .line 1141
    :cond_15
    move v10, v7

    .line 1142
    :goto_a
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v3

    .line 1146
    check-cast v3, Ljava/lang/String;

    .line 1147
    .line 1148
    invoke-static {v3}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v3

    .line 1152
    if-eqz v3, :cond_16

    .line 1153
    .line 1154
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1155
    .line 1156
    .line 1157
    move-result v3

    .line 1158
    move v11, v3

    .line 1159
    goto :goto_b

    .line 1160
    :cond_16
    move v11, v7

    .line 1161
    :goto_b
    if-nez v2, :cond_17

    .line 1162
    .line 1163
    const-string v2, "Type \u5fc5\u987b\u662f\u6570\u5b57"

    .line 1164
    .line 1165
    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_c

    .line 1173
    :cond_17
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    check-cast v3, Ljava/lang/String;

    .line 1178
    .line 1179
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v8

    .line 1187
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1188
    .line 1189
    .line 1190
    move-result v9

    .line 1191
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v2

    .line 1195
    move-object v12, v2

    .line 1196
    check-cast v12, Ljava/lang/String;

    .line 1197
    .line 1198
    new-instance v13, Lq9/a;

    .line 1199
    .line 1200
    const/16 v2, 0xb

    .line 1201
    .line 1202
    invoke-direct {v13, v1, v2}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 1203
    .line 1204
    .line 1205
    invoke-static/range {v8 .. v13}, Lwa/j;->a(Ljava/lang/String;IIILjava/lang/String;Lwa/h;)Z

    .line 1206
    .line 1207
    .line 1208
    :goto_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1209
    .line 1210
    return-object v1

    .line 1211
    :pswitch_c
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v1, Landroid/content/Context;

    .line 1214
    .line 1215
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v2, Lfg/l;

    .line 1218
    .line 1219
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1220
    .line 1221
    check-cast v3, Li0/a1;

    .line 1222
    .line 1223
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1224
    .line 1225
    check-cast v4, Li0/a1;

    .line 1226
    .line 1227
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v5, Li0/a1;

    .line 1230
    .line 1231
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v6, Ljava/util/List;

    .line 1234
    .line 1235
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v7

    .line 1239
    check-cast v7, Ljava/lang/String;

    .line 1240
    .line 1241
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v7

    .line 1245
    const/4 v8, 0x0

    .line 1246
    if-eqz v7, :cond_18

    .line 1247
    .line 1248
    const-string v2, "\u8bf7\u5148\u9009\u62e9\u6a21\u677f"

    .line 1249
    .line 1250
    invoke-static {v1, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1255
    .line 1256
    .line 1257
    goto/16 :goto_12

    .line 1258
    .line 1259
    :cond_18
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v7

    .line 1263
    check-cast v7, Ljava/util/Set;

    .line 1264
    .line 1265
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v7

    .line 1269
    if-eqz v7, :cond_19

    .line 1270
    .line 1271
    const-string v2, "\u8bf7\u5148\u9009\u62e9\u7fa4"

    .line 1272
    .line 1273
    invoke-static {v1, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v1

    .line 1277
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1278
    .line 1279
    .line 1280
    goto/16 :goto_12

    .line 1281
    .line 1282
    :cond_19
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    check-cast v1, Ljava/util/List;

    .line 1287
    .line 1288
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1289
    .line 1290
    .line 1291
    move-result v5

    .line 1292
    invoke-static {v5}, Ltf/y;->a0(I)I

    .line 1293
    .line 1294
    .line 1295
    move-result v5

    .line 1296
    const/16 v7, 0x10

    .line 1297
    .line 1298
    if-ge v5, v7, :cond_1a

    .line 1299
    .line 1300
    move v5, v7

    .line 1301
    :cond_1a
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1302
    .line 1303
    invoke-direct {v7, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-eqz v5, :cond_1c

    .line 1315
    .line 1316
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    check-cast v5, Lwb/s0;

    .line 1321
    .line 1322
    iget-object v8, v5, Lwb/s0;->a:Ljava/lang/String;

    .line 1323
    .line 1324
    iget-object v9, v5, Lwb/s0;->b:Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v10

    .line 1330
    if-eqz v10, :cond_1b

    .line 1331
    .line 1332
    iget-object v9, v5, Lwb/s0;->a:Ljava/lang/String;

    .line 1333
    .line 1334
    :cond_1b
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    goto :goto_d

    .line 1338
    :cond_1c
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v1

    .line 1342
    check-cast v1, Ljava/util/Set;

    .line 1343
    .line 1344
    check-cast v1, Ljava/lang/Iterable;

    .line 1345
    .line 1346
    new-instance v4, Ljava/util/ArrayList;

    .line 1347
    .line 1348
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1349
    .line 1350
    .line 1351
    move-result v5

    .line 1352
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1353
    .line 1354
    .line 1355
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v1

    .line 1359
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v5

    .line 1363
    if-eqz v5, :cond_22

    .line 1364
    .line 1365
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v5

    .line 1369
    check-cast v5, Ljava/lang/String;

    .line 1370
    .line 1371
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v8

    .line 1375
    check-cast v8, Ljava/lang/String;

    .line 1376
    .line 1377
    if-eqz v8, :cond_1d

    .line 1378
    .line 1379
    goto :goto_11

    .line 1380
    :cond_1d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v8

    .line 1384
    :cond_1e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v9

    .line 1388
    const/4 v10, 0x0

    .line 1389
    if-eqz v9, :cond_1f

    .line 1390
    .line 1391
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v9

    .line 1395
    move-object v11, v9

    .line 1396
    check-cast v11, Lq9/h;

    .line 1397
    .line 1398
    iget-object v11, v11, Lq9/h;->a:Ljava/lang/String;

    .line 1399
    .line 1400
    invoke-static {v11, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v11

    .line 1404
    if-eqz v11, :cond_1e

    .line 1405
    .line 1406
    goto :goto_f

    .line 1407
    :cond_1f
    move-object v9, v10

    .line 1408
    :goto_f
    check-cast v9, Lq9/h;

    .line 1409
    .line 1410
    if-eqz v9, :cond_20

    .line 1411
    .line 1412
    iget-object v8, v9, Lq9/h;->b:Ljava/lang/String;

    .line 1413
    .line 1414
    goto :goto_10

    .line 1415
    :cond_20
    move-object v8, v10

    .line 1416
    :goto_10
    if-eqz v8, :cond_21

    .line 1417
    .line 1418
    goto :goto_11

    .line 1419
    :cond_21
    move-object v8, v5

    .line 1420
    :goto_11
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v9

    .line 1424
    check-cast v9, Ljava/lang/String;

    .line 1425
    .line 1426
    new-instance v10, Lq9/h;

    .line 1427
    .line 1428
    invoke-direct {v10, v5, v8, v9}, Lq9/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1432
    .line 1433
    .line 1434
    goto :goto_e

    .line 1435
    :cond_22
    invoke-interface {v2, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    :goto_12
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1439
    .line 1440
    return-object v1

    .line 1441
    :pswitch_d
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1442
    .line 1443
    check-cast v1, Landroid/content/Context;

    .line 1444
    .line 1445
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1446
    .line 1447
    check-cast v2, Lfg/l;

    .line 1448
    .line 1449
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v3, Lwb/h5;

    .line 1452
    .line 1453
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1454
    .line 1455
    check-cast v4, Li0/a1;

    .line 1456
    .line 1457
    iget-object v5, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v5, Li0/a1;

    .line 1460
    .line 1461
    iget-object v6, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1462
    .line 1463
    check-cast v6, Li0/a1;

    .line 1464
    .line 1465
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v7

    .line 1469
    check-cast v7, Ljava/util/Set;

    .line 1470
    .line 1471
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    .line 1472
    .line 1473
    .line 1474
    move-result v7

    .line 1475
    if-eqz v7, :cond_23

    .line 1476
    .line 1477
    const-string v2, "\u8bf7\u5148\u9009\u62e9\u6a21\u677f"

    .line 1478
    .line 1479
    const/4 v3, 0x0

    .line 1480
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v1

    .line 1484
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1485
    .line 1486
    .line 1487
    goto :goto_14

    .line 1488
    :cond_23
    iget-object v1, v3, Lwb/h5;->b:Ljava/util/ArrayList;

    .line 1489
    .line 1490
    new-instance v3, Ljava/util/ArrayList;

    .line 1491
    .line 1492
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1493
    .line 1494
    .line 1495
    move-result v7

    .line 1496
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v1

    .line 1503
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1504
    .line 1505
    .line 1506
    move-result v7

    .line 1507
    if-eqz v7, :cond_24

    .line 1508
    .line 1509
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v7

    .line 1513
    move-object v8, v7

    .line 1514
    check-cast v8, Laa/a;

    .line 1515
    .line 1516
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v7

    .line 1520
    check-cast v7, Ljava/lang/Boolean;

    .line 1521
    .line 1522
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1523
    .line 1524
    .line 1525
    move-result v12

    .line 1526
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v7

    .line 1530
    move-object v13, v7

    .line 1531
    check-cast v13, Ljava/lang/String;

    .line 1532
    .line 1533
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v7

    .line 1537
    move-object v14, v7

    .line 1538
    check-cast v14, Ljava/util/Set;

    .line 1539
    .line 1540
    const-string v18, ""

    .line 1541
    .line 1542
    const/16 v19, 0xf

    .line 1543
    .line 1544
    const/4 v9, 0x0

    .line 1545
    const/4 v10, 0x0

    .line 1546
    const/4 v11, 0x0

    .line 1547
    const/4 v15, 0x0

    .line 1548
    const/16 v16, 0x0

    .line 1549
    .line 1550
    sget-object v17, Ltf/v;->g:Ltf/v;

    .line 1551
    .line 1552
    invoke-static/range {v8 .. v19}, Laa/a;->a(Laa/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;ZZLjava/util/Set;Ljava/lang/String;I)Laa/a;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v7

    .line 1556
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    goto :goto_13

    .line 1560
    :cond_24
    invoke-interface {v2, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    :goto_14
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1564
    .line 1565
    return-object v1

    .line 1566
    :pswitch_e
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v1, Lv0/b;

    .line 1569
    .line 1570
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1571
    .line 1572
    check-cast v2, Lv0/j;

    .line 1573
    .line 1574
    iget-object v3, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1575
    .line 1576
    check-cast v3, Lv0/f;

    .line 1577
    .line 1578
    iget-object v4, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v4, Ljava/lang/String;

    .line 1581
    .line 1582
    iget-object v5, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v5, [Ljava/lang/Object;

    .line 1585
    .line 1586
    iget-object v6, v1, Lv0/b;->h:Lv0/f;

    .line 1587
    .line 1588
    const/4 v7, 0x1

    .line 1589
    if-eq v6, v3, :cond_25

    .line 1590
    .line 1591
    iput-object v3, v1, Lv0/b;->h:Lv0/f;

    .line 1592
    .line 1593
    move v3, v7

    .line 1594
    goto :goto_15

    .line 1595
    :cond_25
    const/4 v3, 0x0

    .line 1596
    :goto_15
    iget-object v6, v1, Lv0/b;->i:Ljava/lang/String;

    .line 1597
    .line 1598
    invoke-static {v6, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1599
    .line 1600
    .line 1601
    move-result v6

    .line 1602
    if-nez v6, :cond_26

    .line 1603
    .line 1604
    iput-object v4, v1, Lv0/b;->i:Ljava/lang/String;

    .line 1605
    .line 1606
    goto :goto_16

    .line 1607
    :cond_26
    move v7, v3

    .line 1608
    :goto_16
    iput-object v2, v1, Lv0/b;->g:Lv0/j;

    .line 1609
    .line 1610
    iget-object v2, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1611
    .line 1612
    iput-object v2, v1, Lv0/b;->j:Ljava/lang/Object;

    .line 1613
    .line 1614
    iput-object v5, v1, Lv0/b;->k:[Ljava/lang/Object;

    .line 1615
    .line 1616
    iget-object v2, v1, Lv0/b;->l:Lv0/e;

    .line 1617
    .line 1618
    if-eqz v2, :cond_27

    .line 1619
    .line 1620
    if-eqz v7, :cond_27

    .line 1621
    .line 1622
    check-cast v2, Lb5/c;

    .line 1623
    .line 1624
    invoke-virtual {v2}, Lb5/c;->Z()V

    .line 1625
    .line 1626
    .line 1627
    const/4 v2, 0x0

    .line 1628
    iput-object v2, v1, Lv0/b;->l:Lv0/e;

    .line 1629
    .line 1630
    invoke-virtual {v1}, Lv0/b;->a()V

    .line 1631
    .line 1632
    .line 1633
    :cond_27
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1634
    .line 1635
    return-object v1

    .line 1636
    :pswitch_f
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1637
    .line 1638
    move-object v2, v1

    .line 1639
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1640
    .line 1641
    iget-object v1, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1642
    .line 1643
    move-object v3, v1

    .line 1644
    check-cast v3, Ljava/lang/String;

    .line 1645
    .line 1646
    iget-object v1, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1647
    .line 1648
    move-object v4, v1

    .line 1649
    check-cast v4, Ljava/lang/String;

    .line 1650
    .line 1651
    iget-object v1, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1652
    .line 1653
    move-object v5, v1

    .line 1654
    check-cast v5, Ljava/lang/String;

    .line 1655
    .line 1656
    iget-object v1, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1657
    .line 1658
    move-object v6, v1

    .line 1659
    check-cast v6, Ljava/lang/String;

    .line 1660
    .line 1661
    iget-object v1, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1662
    .line 1663
    move-object v7, v1

    .line 1664
    check-cast v7, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;

    .line 1665
    .line 1666
    invoke-static/range {v2 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->Q(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)Lsf/n;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    return-object v1

    .line 1671
    :pswitch_10
    iget-object v1, v0, Lc9/p0;->h:Ljava/lang/Object;

    .line 1672
    .line 1673
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1674
    .line 1675
    iget-object v2, v0, Lc9/p0;->i:Ljava/lang/Object;

    .line 1676
    .line 1677
    move-object v7, v2

    .line 1678
    check-cast v7, Landroid/app/Activity;

    .line 1679
    .line 1680
    iget-object v2, v0, Lc9/p0;->j:Ljava/lang/Object;

    .line 1681
    .line 1682
    move-object v4, v2

    .line 1683
    check-cast v4, Lc9/a1;

    .line 1684
    .line 1685
    iget-object v2, v0, Lc9/p0;->k:Ljava/lang/Object;

    .line 1686
    .line 1687
    move-object v5, v2

    .line 1688
    check-cast v5, Landroid/widget/FrameLayout;

    .line 1689
    .line 1690
    iget-object v2, v0, Lc9/p0;->l:Ljava/lang/Object;

    .line 1691
    .line 1692
    move-object v6, v2

    .line 1693
    check-cast v6, Landroid/view/ViewGroup;

    .line 1694
    .line 1695
    iget-object v2, v0, Lc9/p0;->m:Ljava/lang/Object;

    .line 1696
    .line 1697
    move-object v8, v2

    .line 1698
    check-cast v8, Lgg/u;

    .line 1699
    .line 1700
    const/4 v2, 0x0

    .line 1701
    const/4 v3, 0x1

    .line 1702
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1703
    .line 1704
    .line 1705
    move-result v1

    .line 1706
    if-nez v1, :cond_28

    .line 1707
    .line 1708
    goto :goto_17

    .line 1709
    :cond_28
    new-instance v3, Lc9/r0;

    .line 1710
    .line 1711
    const/4 v9, 0x0

    .line 1712
    invoke-direct/range {v3 .. v9}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1713
    .line 1714
    .line 1715
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v1

    .line 1719
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v2

    .line 1723
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1724
    .line 1725
    .line 1726
    move-result v1

    .line 1727
    if-eqz v1, :cond_29

    .line 1728
    .line 1729
    invoke-virtual {v3}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    goto :goto_17

    .line 1733
    :cond_29
    new-instance v1, La1/a;

    .line 1734
    .line 1735
    const/4 v2, 0x4

    .line 1736
    invoke-direct {v1, v3, v2}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v7, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1740
    .line 1741
    .line 1742
    :goto_17
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1743
    .line 1744
    return-object v1

    .line 1745
    :pswitch_data_0
    .packed-switch 0x0
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
