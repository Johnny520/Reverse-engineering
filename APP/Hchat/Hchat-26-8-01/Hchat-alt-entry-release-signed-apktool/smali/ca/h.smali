.class public final synthetic Lca/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/e0;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Lhb/t;


# direct methods
.method public synthetic constructor <init>(Lca/e0;Landroid/app/Activity;Lhb/t;I)V
    .locals 0

    .line 14
    iput p4, p0, Lca/h;->g:I

    iput-object p1, p0, Lca/h;->h:Lca/e0;

    iput-object p2, p0, Lca/h;->i:Landroid/app/Activity;

    iput-object p3, p0, Lca/h;->j:Lhb/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhb/t;Lca/e0;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lca/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca/h;->j:Lhb/t;

    .line 8
    .line 9
    iput-object p2, p0, Lca/h;->h:Lca/e0;

    .line 10
    .line 11
    iput-object p3, p0, Lca/h;->i:Landroid/app/Activity;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lca/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lca/h;->h:Lca/e0;

    .line 7
    .line 8
    iget-object v2, p0, Lca/h;->i:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object v3, p0, Lca/h;->j:Lhb/t;

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    check-cast v4, Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const-string v6, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 20
    .line 21
    invoke-virtual/range {v1 .. v6}, Lca/e0;->o(Landroid/app/Activity;Lhb/t;Ljava/util/List;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object v3, p0, Lca/h;->j:Lhb/t;

    .line 28
    .line 29
    iget-object v1, p0, Lca/h;->h:Lca/e0;

    .line 30
    .line 31
    iget-object v2, p0, Lca/h;->i:Landroid/app/Activity;

    .line 32
    .line 33
    check-cast p1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v0, 0x0

    .line 40
    const/4 v4, 0x1

    .line 41
    if-ne p1, v4, :cond_0

    .line 42
    .line 43
    move p1, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move p1, v4

    .line 46
    move v4, v0

    .line 47
    :goto_1
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    const-string v5, "\u8bf7\u9009\u62e9\u53d1\u9001\u5185\u5bb9"

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    sget-object v6, La/a;->g:Lhb/k0;

    .line 61
    .line 62
    if-eqz v6, :cond_5

    .line 63
    .line 64
    if-eq v4, p1, :cond_2

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    iget-object v7, v6, Lhb/k0;->c:Lhb/k;

    .line 69
    .line 70
    invoke-virtual {v7}, Lhb/k;->g()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_3

    .line 75
    .line 76
    const-string v5, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u4e0d\u53ef\u7528"

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object v7, v6, Lhb/k0;->c:Lhb/k;

    .line 80
    .line 81
    invoke-virtual {v7, v5}, Lhb/k;->o(Ljava/util/List;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_4

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    const/16 v13, 0x3e

    .line 93
    .line 94
    const-string v9, "\u3001"

    .line 95
    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v11, 0x0

    .line 98
    invoke-static/range {v8 .. v13}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-string v6, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u4e0d\u652f\u6301: "

    .line 103
    .line 104
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    iget-object v6, v6, Lhb/k0;->c:Lhb/k;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {v5}, Lhb/k;->j(Ljava/util/List;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const-string v5, "\u7fa4\u53d1\u52a9\u624b\u5c1a\u672a\u5c31\u7eea"

    .line 120
    .line 121
    :goto_2
    if-eqz v5, :cond_6

    .line 122
    .line 123
    invoke-virtual {v1, v2, v5}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_6
    if-ne v4, p1, :cond_7

    .line 128
    .line 129
    move v9, p1

    .line 130
    goto :goto_3

    .line 131
    :cond_7
    move v9, v0

    .line 132
    :goto_3
    if-eqz v9, :cond_8

    .line 133
    .line 134
    const-string p1, "\u9009\u62e9\u5b98\u65b9\u7fa4\u53d1\u597d\u53cb"

    .line 135
    .line 136
    :goto_4
    move-object v7, p1

    .line 137
    goto :goto_5

    .line 138
    :cond_8
    const-string p1, "\u9009\u62e9\u7fa4\u53d1\u5bf9\u8c61"

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :goto_5
    new-instance v0, Lca/k;

    .line 142
    .line 143
    const/4 v5, 0x1

    .line 144
    invoke-direct/range {v0 .. v5}, Lca/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    const-string v8, "\u53d1\u9001"

    .line 148
    .line 149
    move-object v6, v0

    .line 150
    move-object v4, v1

    .line 151
    move-object v5, v2

    .line 152
    invoke-virtual/range {v4 .. v9}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 156
    .line 157
    return-object p1

    .line 158
    :pswitch_1
    iget-object v0, p0, Lca/h;->h:Lca/e0;

    .line 159
    .line 160
    iget-object v1, p0, Lca/h;->i:Landroid/app/Activity;

    .line 161
    .line 162
    iget-object v2, p0, Lca/h;->j:Lhb/t;

    .line 163
    .line 164
    check-cast p1, Ljava/util/List;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v3, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_9

    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    check-cast v4, Lwb/jv;

    .line 193
    .line 194
    iget-object v4, v4, Lwb/jv;->a:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_9
    const/4 v4, 0x0

    .line 201
    const-string v5, "\u8f6c\u53d1\u7ed9\u597d\u53cb"

    .line 202
    .line 203
    invoke-virtual/range {v0 .. v5}, Lca/e0;->o(Landroid/app/Activity;Lhb/t;Ljava/util/List;ILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :pswitch_2
    iget-object v0, p0, Lca/h;->h:Lca/e0;

    .line 209
    .line 210
    iget-object v1, p0, Lca/h;->i:Landroid/app/Activity;

    .line 211
    .line 212
    iget-object v2, p0, Lca/h;->j:Lhb/t;

    .line 213
    .line 214
    check-cast p1, Ljava/lang/Integer;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_20

    .line 221
    .line 222
    const/4 v3, 0x1

    .line 223
    if-eq p1, v3, :cond_1f

    .line 224
    .line 225
    const/4 v4, 0x2

    .line 226
    const/4 v5, 0x3

    .line 227
    if-eq p1, v4, :cond_c

    .line 228
    .line 229
    if-eq p1, v5, :cond_b

    .line 230
    .line 231
    const/4 v3, 0x4

    .line 232
    if-eq p1, v3, :cond_a

    .line 233
    .line 234
    goto/16 :goto_10

    .line 235
    .line 236
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance p1, Lca/h;

    .line 240
    .line 241
    const/4 v3, 0x3

    .line 242
    invoke-direct {p1, v0, v1, v2, v3}, Lca/h;-><init>(Lca/e0;Landroid/app/Activity;Lhb/t;I)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lca/l;

    .line 246
    .line 247
    invoke-direct {v2, v0, v1, p1}, Lca/l;-><init>(Lca/e0;Landroid/app/Activity;Lfg/l;)V

    .line 248
    .line 249
    .line 250
    const-string p1, "\u8f6c\u53d1\u81f3\u6807\u7b7e"

    .line 251
    .line 252
    const/4 v3, 0x0

    .line 253
    invoke-virtual {v0, v1, v2, p1, v3}, Lca/e0;->e(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Z)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_10

    .line 257
    .line 258
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance p1, Lsf/e;

    .line 262
    .line 263
    const-string v3, "\u6a21\u5757\u901a\u9053"

    .line 264
    .line 265
    const-string v4, "\u652f\u6301\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u548c\u6807\u7b7e"

    .line 266
    .line 267
    invoke-direct {p1, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    new-instance v3, Lsf/e;

    .line 271
    .line 272
    const-string v4, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b"

    .line 273
    .line 274
    const-string v5, "\u4ec5\u9009\u62e9\u597d\u53cb\u5e76\u6309\u539f\u751f\u961f\u5217\u53d1\u9001"

    .line 275
    .line 276
    invoke-direct {v3, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    filled-new-array {p1, v3}, [Lsf/e;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    new-instance v5, Lca/h;

    .line 288
    .line 289
    invoke-direct {v5, v2, v0, v1}, Lca/h;-><init>(Lhb/t;Lca/e0;Landroid/app/Activity;)V

    .line 290
    .line 291
    .line 292
    new-instance v6, Lbi/c;

    .line 293
    .line 294
    const/4 p1, 0x7

    .line 295
    invoke-direct {v6, p1}, Lbi/c;-><init>(I)V

    .line 296
    .line 297
    .line 298
    sget-object v7, Lwb/lv;->j:Lwb/lv;

    .line 299
    .line 300
    const-string v2, "\u9009\u62e9\u7fa4\u53d1\u901a\u9053"

    .line 301
    .line 302
    const-string v3, ""

    .line 303
    .line 304
    invoke-static/range {v1 .. v7}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 305
    .line 306
    .line 307
    goto/16 :goto_10

    .line 308
    .line 309
    :cond_c
    iget-object p1, v0, Lca/e0;->o:Landroidx/lifecycle/x;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget v4, v2, Lhb/t;->b:I

    .line 315
    .line 316
    const v6, 0xffff

    .line 317
    .line 318
    .line 319
    and-int/2addr v4, v6

    .line 320
    iget-object v6, v2, Lhb/t;->g:Lk8/t;

    .line 321
    .line 322
    const-string v7, ""

    .line 323
    .line 324
    const/4 v8, 0x0

    .line 325
    if-ne v4, v3, :cond_10

    .line 326
    .line 327
    if-eqz v6, :cond_d

    .line 328
    .line 329
    iget-object v8, v6, Lk8/t;->c:Ljava/lang/String;

    .line 330
    .line 331
    :cond_d
    if-nez v8, :cond_e

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_e
    move-object v7, v8

    .line 335
    :goto_8
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    if-eqz p1, :cond_f

    .line 340
    .line 341
    iget-object v7, v2, Lhb/t;->d:Ljava/lang/String;

    .line 342
    .line 343
    :cond_f
    const-string p1, "\u6d88\u606f\u5185\u5bb9\u4e3a\u7a7a"

    .line 344
    .line 345
    invoke-static {v1, v7, p1}, Landroidx/lifecycle/x;->a0(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    goto/16 :goto_f

    .line 350
    .line 351
    :cond_10
    const/16 v3, 0x3e

    .line 352
    .line 353
    const/16 v9, 0x2f

    .line 354
    .line 355
    const/16 v10, 0x2b

    .line 356
    .line 357
    const/16 v11, 0x22

    .line 358
    .line 359
    if-eq v4, v5, :cond_14

    .line 360
    .line 361
    if-eq v4, v11, :cond_13

    .line 362
    .line 363
    if-eq v4, v10, :cond_14

    .line 364
    .line 365
    if-eq v4, v9, :cond_11

    .line 366
    .line 367
    if-eq v4, v3, :cond_14

    .line 368
    .line 369
    :goto_9
    move-object v2, v7

    .line 370
    goto :goto_c

    .line 371
    :cond_11
    if-eqz v6, :cond_12

    .line 372
    .line 373
    iget-object v2, v6, Lk8/t;->f:Ljava/lang/String;

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_12
    move-object v2, v8

    .line 377
    :goto_a
    if-nez v2, :cond_16

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_13
    iget-object v2, v2, Lhb/t;->h:Ljava/lang/String;

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_14
    if-eqz v6, :cond_15

    .line 384
    .line 385
    iget-object v2, v6, Lk8/t;->f:Ljava/lang/String;

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_15
    move-object v2, v8

    .line 389
    :goto_b
    if-nez v2, :cond_16

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_16
    :goto_c
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-nez v6, :cond_17

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_17
    move-object v2, v8

    .line 400
    :goto_d
    if-eqz v2, :cond_18

    .line 401
    .line 402
    new-instance v8, Ljava/io/File;

    .line 403
    .line 404
    invoke-direct {v8, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :cond_18
    if-eqz v8, :cond_1e

    .line 408
    .line 409
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-nez v2, :cond_19

    .line 414
    .line 415
    const-string p1, "\u5206\u4eab\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_19
    if-eq v4, v5, :cond_1d

    .line 419
    .line 420
    if-eq v4, v11, :cond_1c

    .line 421
    .line 422
    if-eq v4, v10, :cond_1b

    .line 423
    .line 424
    if-eq v4, v9, :cond_1d

    .line 425
    .line 426
    if-eq v4, v3, :cond_1b

    .line 427
    .line 428
    invoke-static {v8}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 433
    .line 434
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-virtual {v3, v2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    if-eqz v2, :cond_1a

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :cond_1a
    const-string v2, "application/octet-stream"

    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_1b
    const-string v2, "video/*"

    .line 456
    .line 457
    goto :goto_e

    .line 458
    :cond_1c
    const-string v2, "audio/*"

    .line 459
    .line 460
    goto :goto_e

    .line 461
    :cond_1d
    const-string v2, "image/*"

    .line 462
    .line 463
    :goto_e
    invoke-static {v8}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {p1, v1, v3, v2, v7}, Landroidx/lifecycle/x;->Y(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    goto :goto_f

    .line 472
    :cond_1e
    const-string p1, "\u8be5\u6d88\u606f\u6682\u4e0d\u652f\u6301\u7cfb\u7edf\u5206\u4eab"

    .line 473
    .line 474
    :goto_f
    if-eqz p1, :cond_22

    .line 475
    .line 476
    invoke-virtual {v0, v1, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    goto :goto_10

    .line 480
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-object p1, v2

    .line 484
    new-instance v2, Lca/h;

    .line 485
    .line 486
    const/4 v3, 0x1

    .line 487
    invoke-direct {v2, v0, v1, p1, v3}, Lca/h;-><init>(Lca/e0;Landroid/app/Activity;Lhb/t;I)V

    .line 488
    .line 489
    .line 490
    const-string v3, "\u9009\u62e9\u8f6c\u53d1\u5bf9\u8c61"

    .line 491
    .line 492
    const-string v4, "\u8f6c\u53d1"

    .line 493
    .line 494
    const/4 v5, 0x0

    .line 495
    invoke-virtual/range {v0 .. v5}, Lca/e0;->p(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 496
    .line 497
    .line 498
    goto :goto_10

    .line 499
    :cond_20
    move-object p1, v2

    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    invoke-virtual {v0, v1, p1}, Lca/e0;->j(Landroid/app/Activity;Ljava/util/List;)Lca/c0;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    iget-object v2, p1, Lca/c0;->a:Landroid/content/Intent;

    .line 512
    .line 513
    if-nez v2, :cond_21

    .line 514
    .line 515
    iget-object p1, p1, Lca/c0;->b:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v0, v1, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_21
    invoke-virtual {v0, v1, v2}, Lca/e0;->q(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 522
    .line 523
    .line 524
    :cond_22
    :goto_10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 525
    .line 526
    return-object p1

    .line 527
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
