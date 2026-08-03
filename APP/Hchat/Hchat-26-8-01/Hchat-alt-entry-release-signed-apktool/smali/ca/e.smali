.class public final synthetic Lca/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/f;


# direct methods
.method public synthetic constructor <init>(Lca/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lca/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/e;->h:Lca/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lca/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca/e;->h:Lca/f;

    .line 7
    .line 8
    iget-object v0, v0, Lca/f;->f:Lca/f0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v1, Lp8/j;->a:Lp8/j;

    .line 13
    .line 14
    iget-object v2, v0, Lca/f0;->a:Lr8/g;

    .line 15
    .line 16
    iget-object v3, v0, Lca/f0;->b:Lp8/o;

    .line 17
    .line 18
    iget-object v0, v0, Lca/f0;->d:Lab/b;

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3, v0}, Lp8/j;->d(Lr8/g;Lp8/o;Lfg/p;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_0
    iget-object v0, p0, Lca/e;->h:Lca/f;

    .line 35
    .line 36
    iget-object v0, v0, Lca/f;->e:Lca/e0;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    if-eqz v0, :cond_1b

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v2, v0, Lca/e0;->p:Lb5/c;

    .line 43
    .line 44
    iget-object v2, v2, Lb5/c;->c:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lca/b;

    .line 51
    .line 52
    iget-object v2, v0, Lca/e0;->a:Lr8/g;

    .line 53
    .line 54
    iget-object v3, v0, Lca/e0;->c:Lab/b;

    .line 55
    .line 56
    invoke-static {v2, v3}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, v0, Lca/e0;->a:Lr8/g;

    .line 61
    .line 62
    iget-object v4, v0, Lca/e0;->c:Lab/b;

    .line 63
    .line 64
    invoke-static {v3, v4}, Lf8/i;->j0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x0

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    move v4, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    move v4, v1

    .line 82
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/reflect/Method;

    .line 93
    .line 94
    new-instance v7, Lca/d0;

    .line 95
    .line 96
    const/4 v8, 0x1

    .line 97
    invoke-direct {v7, v0, v8}, Lca/d0;-><init>(Lca/e0;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v6, v7}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_2

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    if-ltz v4, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-static {}, La/a;->P0()V

    .line 112
    .line 113
    .line 114
    throw v5

    .line 115
    :catchall_0
    move-exception v1

    .line 116
    goto/16 :goto_d

    .line 117
    .line 118
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    move v3, v1

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    move v3, v1

    .line 131
    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_8

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Ljava/lang/reflect/Method;

    .line 142
    .line 143
    new-instance v7, Lca/d0;

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    invoke-direct {v7, v0, v8}, Lca/d0;-><init>(Lca/e0;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v6, v7}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_6

    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    if-ltz v3, :cond_7

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    invoke-static {}, La/a;->P0()V

    .line 161
    .line 162
    .line 163
    throw v5

    .line 164
    :cond_8
    :goto_4
    if-gtz v4, :cond_9

    .line 165
    .line 166
    iget-object v2, v0, Lca/e0;->c:Lab/b;

    .line 167
    .line 168
    const-string v6, "\u8f6c\u53d1\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 169
    .line 170
    invoke-virtual {v2, v6, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    :cond_9
    if-gtz v3, :cond_a

    .line 174
    .line 175
    iget-object v2, v0, Lca/e0;->c:Lab/b;

    .line 176
    .line 177
    const-string v6, "\u8f6c\u53d1\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 178
    .line 179
    invoke-virtual {v2, v6, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_a
    iget-object v2, v0, Lca/e0;->a:Lr8/g;

    .line 183
    .line 184
    iget-object v6, v0, Lca/e0;->c:Lab/b;

    .line 185
    .line 186
    invoke-static {v2, v6}, Lac/p;->F(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iget-object v6, v0, Lca/e0;->a:Lr8/g;

    .line 191
    .line 192
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 193
    .line 194
    invoke-static {v6, v7}, Lac/p;->E(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-eqz v6, :cond_b

    .line 199
    .line 200
    iget-object v7, v0, Lca/e0;->a:Lr8/g;

    .line 201
    .line 202
    iget-object v8, v0, Lca/e0;->c:Lab/b;

    .line 203
    .line 204
    invoke-static {v7, v6, v8}, Lac/p;->G(Lr8/g;Ljava/lang/reflect/Method;Lfg/p;)Ljava/lang/reflect/Method;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    goto :goto_5

    .line 209
    :cond_b
    move-object v7, v5

    .line 210
    :goto_5
    const/4 v8, 0x1

    .line 211
    if-eqz v2, :cond_c

    .line 212
    .line 213
    if-eqz v7, :cond_c

    .line 214
    .line 215
    new-instance v9, Lca/d0;

    .line 216
    .line 217
    const/4 v10, 0x4

    .line 218
    invoke-direct {v9, v0, v10}, Lca/d0;-><init>(Lca/e0;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v2, v9}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_c

    .line 226
    .line 227
    move v2, v8

    .line 228
    goto :goto_6

    .line 229
    :cond_c
    move v2, v1

    .line 230
    :goto_6
    if-eqz v6, :cond_d

    .line 231
    .line 232
    if-eqz v7, :cond_d

    .line 233
    .line 234
    new-instance v9, Lc9/c2;

    .line 235
    .line 236
    const/4 v10, 0x1

    .line 237
    invoke-direct {v9, v0, v10, v7}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v6, v9}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_d

    .line 245
    .line 246
    move v6, v8

    .line 247
    goto :goto_7

    .line 248
    :cond_d
    move v6, v1

    .line 249
    :goto_7
    if-nez v2, :cond_e

    .line 250
    .line 251
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 252
    .line 253
    const-string v9, "\u591a\u9009\u8f6c\u53d1\u670b\u53cb\u5708\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 254
    .line 255
    invoke-virtual {v7, v9, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_e
    if-nez v6, :cond_f

    .line 259
    .line 260
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 261
    .line 262
    const-string v9, "\u591a\u9009\u8f6c\u53d1\u670b\u53cb\u5708\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 263
    .line 264
    invoke-virtual {v7, v9, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_f
    iget-object v7, v0, Lca/e0;->a:Lr8/g;

    .line 268
    .line 269
    iget-object v9, v0, Lca/e0;->c:Lab/b;

    .line 270
    .line 271
    invoke-static {v7, v1, v9}, Lj8/a;->g(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    if-eqz v9, :cond_10

    .line 280
    .line 281
    move v9, v1

    .line 282
    goto :goto_9

    .line 283
    :cond_10
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    move v9, v1

    .line 288
    :cond_11
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-eqz v10, :cond_13

    .line 293
    .line 294
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    check-cast v10, Ljava/lang/reflect/Method;

    .line 299
    .line 300
    new-instance v11, Lca/d0;

    .line 301
    .line 302
    const/4 v12, 0x3

    .line 303
    invoke-direct {v11, v0, v12}, Lca/d0;-><init>(Lca/e0;I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v10, v11}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    if-eqz v10, :cond_11

    .line 311
    .line 312
    add-int/lit8 v9, v9, 0x1

    .line 313
    .line 314
    if-ltz v9, :cond_12

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_12
    invoke-static {}, La/a;->P0()V

    .line 318
    .line 319
    .line 320
    throw v5

    .line 321
    :cond_13
    :goto_9
    iget-object v7, v0, Lca/e0;->a:Lr8/g;

    .line 322
    .line 323
    iget-object v10, v0, Lca/e0;->c:Lab/b;

    .line 324
    .line 325
    invoke-static {v7, v1, v10}, Lj8/a;->f(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v10, :cond_14

    .line 334
    .line 335
    move v10, v1

    .line 336
    goto :goto_b

    .line 337
    :cond_14
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    move v10, v1

    .line 342
    :cond_15
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-eqz v11, :cond_17

    .line 347
    .line 348
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    check-cast v11, Ljava/lang/reflect/Method;

    .line 353
    .line 354
    new-instance v12, Lca/d0;

    .line 355
    .line 356
    const/4 v13, 0x2

    .line 357
    invoke-direct {v12, v0, v13}, Lca/d0;-><init>(Lca/e0;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v11, v12}, Lca/e0;->d(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    if-eqz v11, :cond_15

    .line 365
    .line 366
    add-int/lit8 v10, v10, 0x1

    .line 367
    .line 368
    if-ltz v10, :cond_16

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_16
    invoke-static {}, La/a;->P0()V

    .line 372
    .line 373
    .line 374
    throw v5

    .line 375
    :cond_17
    :goto_b
    if-gtz v9, :cond_18

    .line 376
    .line 377
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 378
    .line 379
    const-string v11, "\u6536\u85cf\u8f6c\u53d1\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 380
    .line 381
    invoke-virtual {v7, v11, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    :cond_18
    if-gtz v10, :cond_19

    .line 385
    .line 386
    iget-object v7, v0, Lca/e0;->c:Lab/b;

    .line 387
    .line 388
    const-string v11, "\u6536\u85cf\u8f6c\u53d1\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 389
    .line 390
    invoke-virtual {v7, v11, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    .line 392
    .line 393
    :cond_19
    if-lez v4, :cond_1a

    .line 394
    .line 395
    if-lez v3, :cond_1a

    .line 396
    .line 397
    if-eqz v2, :cond_1a

    .line 398
    .line 399
    if-eqz v6, :cond_1a

    .line 400
    .line 401
    if-lez v9, :cond_1a

    .line 402
    .line 403
    if-lez v10, :cond_1a

    .line 404
    .line 405
    move v2, v8

    .line 406
    goto :goto_c

    .line 407
    :cond_1a
    move v2, v1

    .line 408
    :goto_c
    monitor-exit v0

    .line 409
    if-ne v2, v8, :cond_1b

    .line 410
    .line 411
    move v1, v8

    .line 412
    goto :goto_e

    .line 413
    :goto_d
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 414
    throw v1

    .line 415
    :cond_1b
    :goto_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    return-object v0

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
