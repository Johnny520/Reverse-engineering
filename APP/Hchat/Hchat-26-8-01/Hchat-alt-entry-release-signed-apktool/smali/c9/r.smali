.class public final synthetic Lc9/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Laa/c;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;Laa/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc9/r;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/r;->h:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/r;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/r;->j:Laa/c;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc9/r;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, " \u4e2a\u4f1a\u8bdd"

    .line 7
    .line 8
    iget-object v4, v1, Lc9/r;->j:Laa/c;

    .line 9
    .line 10
    iget-object v5, v1, Lc9/r;->i:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    const/4 v7, 0x6

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v11, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lwb/jv;

    .line 49
    .line 50
    iget-object v2, v2, Lwb/jv;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const-string v2, "\u5c06\u6e05\u7a7a\u6240\u9009 "

    .line 61
    .line 62
    const-string v3, " \u4e2a\u4f1a\u8bdd\u7684\u672c\u5730\u804a\u5929\u8bb0\u5f55\uff0c\u8054\u7cfb\u4eba\u3001\u7fa4\u804a\u548c\u804a\u5929\u5206\u7ec4\u5f52\u5c5e\u4e0d\u4f1a\u5220\u9664\u3002\u6b64\u64cd\u4f5c\u65e0\u6cd5\u64a4\u9500\u3002"

    .line 63
    .line 64
    invoke-static {v0, v2, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    new-instance v15, Lc9/k;

    .line 69
    .line 70
    const/4 v13, 0x0

    .line 71
    iget-object v9, v1, Lc9/r;->h:Landroid/app/Activity;

    .line 72
    .line 73
    iget-object v10, v1, Lc9/r;->i:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v12, v1, Lc9/r;->j:Laa/c;

    .line 76
    .line 77
    move-object v8, v15

    .line 78
    invoke-direct/range {v8 .. v13}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lbi/c;

    .line 82
    .line 83
    invoke-direct {v0, v7}, Lbi/c;-><init>(I)V

    .line 84
    .line 85
    .line 86
    sget-object v17, Lwb/lv;->j:Lwb/lv;

    .line 87
    .line 88
    const-string v13, "\u6e05\u7a7a\u804a\u5929\u8bb0\u5f55"

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    move-object v12, v9

    .line 93
    invoke-static/range {v12 .. v17}, Lwb/y2;->S1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 94
    .line 95
    .line 96
    return-object v6

    .line 97
    :pswitch_0
    move-object/from16 v0, p1

    .line 98
    .line 99
    check-cast v0, Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v8, v1, Lc9/r;->h:Landroid/app/Activity;

    .line 105
    .line 106
    invoke-static {v8}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    new-instance v10, Lsf/e;

    .line 111
    .line 112
    const-string v11, "\u5fae\u4fe1\u9996\u9875"

    .line 113
    .line 114
    invoke-direct {v10, v2, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v10}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v10, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    :cond_1
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-eqz v11, :cond_2

    .line 135
    .line 136
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    move-object v12, v11

    .line 141
    check-cast v12, Lc9/a;

    .line 142
    .line 143
    iget-object v12, v12, Lc9/a;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v12, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-nez v12, :cond_1

    .line 150
    .line 151
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-static {v10}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-eqz v10, :cond_3

    .line 173
    .line 174
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    check-cast v10, Lc9/a;

    .line 179
    .line 180
    iget-object v11, v10, Lc9/a;->a:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v10, v10, Lc9/a;->b:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v12, Lsf/e;

    .line 185
    .line 186
    invoke-direct {v12, v11, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_3
    invoke-static {v2, v5}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const-string v9, "\u5df2\u9009\u62e9 "

    .line 202
    .line 203
    invoke-static {v5, v9, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    new-instance v11, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_4

    .line 225
    .line 226
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, Lsf/e;

    .line 231
    .line 232
    iget-object v5, v5, Lsf/e;->h:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v5, Ljava/lang/String;

    .line 235
    .line 236
    new-instance v9, Lsf/e;

    .line 237
    .line 238
    const-string v12, ""

    .line 239
    .line 240
    invoke-direct {v9, v5, v12}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_4
    new-instance v12, Lc9/k;

    .line 248
    .line 249
    invoke-direct {v12, v2, v8, v0, v4}, Lc9/k;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;Ljava/util/List;Laa/c;)V

    .line 250
    .line 251
    .line 252
    new-instance v13, Lbi/c;

    .line 253
    .line 254
    invoke-direct {v13, v7}, Lbi/c;-><init>(I)V

    .line 255
    .line 256
    .line 257
    const-string v9, "\u79fb\u81f3"

    .line 258
    .line 259
    invoke-static/range {v8 .. v13}, Lwb/y2;->W1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)V

    .line 260
    .line 261
    .line 262
    return-object v6

    .line 263
    :pswitch_1
    move-object/from16 v0, p1

    .line 264
    .line 265
    check-cast v0, Ljava/util/List;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v2, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    if-eqz v8, :cond_5

    .line 288
    .line 289
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    check-cast v8, Lwb/jv;

    .line 294
    .line 295
    iget-object v8, v8, Lwb/jv;->a:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_5
    iget-object v7, v1, Lc9/r;->h:Landroid/app/Activity;

    .line 302
    .line 303
    invoke-static {v7, v5, v2}, Lc9/o2;->t(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    sget-object v5, Lc9/b0;->a:Landroid/os/Handler;

    .line 308
    .line 309
    if-eqz v2, :cond_6

    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    const-string v5, "\u5df2\u6dfb\u52a0 "

    .line 316
    .line 317
    invoke-static {v0, v5, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    goto :goto_5

    .line 322
    :cond_6
    const-string v0, "\u6dfb\u52a0\u4f1a\u8bdd\u5931\u8d25"

    .line 323
    .line 324
    :goto_5
    invoke-static {v7, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    if-eqz v2, :cond_7

    .line 328
    .line 329
    invoke-virtual {v4}, Laa/c;->invoke()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    :cond_7
    return-object v6

    .line 333
    :pswitch_2
    move-object/from16 v0, p1

    .line 334
    .line 335
    check-cast v0, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    sget-object v8, Lc9/b0;->a:Landroid/os/Handler;

    .line 342
    .line 343
    const/4 v8, 0x2

    .line 344
    const/4 v9, 0x1

    .line 345
    iget-object v10, v1, Lc9/r;->h:Landroid/app/Activity;

    .line 346
    .line 347
    const-string v11, "\u5f53\u524d\u5206\u7ec4\u6ca1\u6709\u4f1a\u8bdd"

    .line 348
    .line 349
    const/4 v12, 0x0

    .line 350
    sget-object v13, Ltf/t;->g:Ltf/t;

    .line 351
    .line 352
    packed-switch v0, :pswitch_data_1

    .line 353
    .line 354
    .line 355
    goto/16 :goto_14

    .line 356
    .line 357
    :pswitch_3
    invoke-static {v10, v5, v4}, Lc9/b0;->g(Landroid/app/Activity;Ljava/lang/String;Laa/c;)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_14

    .line 361
    .line 362
    :pswitch_4
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    new-instance v15, Lb4/b;

    .line 367
    .line 368
    invoke-direct {v15, v9}, Lb4/b;-><init>(I)V

    .line 369
    .line 370
    .line 371
    const-string v12, "\u641c\u7d22\u5206\u7ec4\u4f1a\u8bdd"

    .line 372
    .line 373
    const-string v13, "\u6253\u5f00"

    .line 374
    .line 375
    const/4 v14, 0x1

    .line 376
    invoke-static/range {v10 .. v15}, Lc9/b0;->f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_14

    .line 380
    .line 381
    :pswitch_5
    invoke-static {v10, v5}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    if-eqz v0, :cond_8

    .line 386
    .line 387
    iget-object v2, v0, Lc9/a;->e:Ljava/util/List;

    .line 388
    .line 389
    :cond_8
    if-nez v2, :cond_9

    .line 390
    .line 391
    move-object v11, v13

    .line 392
    goto :goto_6

    .line 393
    :cond_9
    move-object v11, v2

    .line 394
    :goto_6
    new-instance v15, Lc9/r;

    .line 395
    .line 396
    invoke-direct {v15, v10, v5, v4, v8}, Lc9/r;-><init>(Landroid/app/Activity;Ljava/lang/String;Laa/c;I)V

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const-string v12, "\u9009\u62e9\u8981\u79fb\u52a8\u7684\u4f1a\u8bdd"

    .line 401
    .line 402
    const-string v13, "\u4e0b\u4e00\u6b65"

    .line 403
    .line 404
    invoke-static/range {v10 .. v15}, Lc9/b0;->f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_14

    .line 408
    .line 409
    :pswitch_6
    invoke-static {v10, v5}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-eqz v0, :cond_a

    .line 414
    .line 415
    iget-object v2, v0, Lc9/a;->e:Ljava/util/List;

    .line 416
    .line 417
    :cond_a
    if-nez v2, :cond_b

    .line 418
    .line 419
    move-object v11, v13

    .line 420
    goto :goto_7

    .line 421
    :cond_b
    move-object v11, v2

    .line 422
    :goto_7
    new-instance v15, Lc9/l;

    .line 423
    .line 424
    invoke-direct {v15, v10, v4}, Lc9/l;-><init>(Landroid/app/Activity;Laa/c;)V

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const-string v12, "\u79fb\u51fa\u5f53\u524d\u5206\u7ec4"

    .line 429
    .line 430
    const-string v13, "\u79fb\u51fa"

    .line 431
    .line 432
    invoke-static/range {v10 .. v15}, Lc9/b0;->f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_14

    .line 436
    .line 437
    :pswitch_7
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    if-eqz v3, :cond_c

    .line 446
    .line 447
    invoke-virtual {v3}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    :cond_c
    if-nez v2, :cond_d

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_d
    move-object v13, v2

    .line 455
    :goto_8
    new-instance v2, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    if-eqz v7, :cond_e

    .line 473
    .line 474
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    check-cast v7, Ll8/b;

    .line 479
    .line 480
    iget-object v7, v7, Ll8/b;->a:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    :cond_f
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    if-eqz v7, :cond_10

    .line 500
    .line 501
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    move-object v8, v7

    .line 506
    check-cast v8, Ljava/lang/String;

    .line 507
    .line 508
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    if-nez v11, :cond_f

    .line 513
    .line 514
    invoke-static {v8}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 515
    .line 516
    .line 517
    move-result v11

    .line 518
    if-nez v11, :cond_f

    .line 519
    .line 520
    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-nez v8, :cond_f

    .line 525
    .line 526
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto :goto_a

    .line 530
    :cond_10
    invoke-static {v3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v11

    .line 538
    new-instance v15, Lc9/r;

    .line 539
    .line 540
    invoke-direct {v15, v10, v5, v4, v9}, Lc9/r;-><init>(Landroid/app/Activity;Ljava/lang/String;Laa/c;I)V

    .line 541
    .line 542
    .line 543
    const/4 v14, 0x0

    .line 544
    const-string v12, "\u6dfb\u52a0\u5230\u5f53\u524d\u5206\u7ec4"

    .line 545
    .line 546
    const-string v13, "\u6dfb\u52a0"

    .line 547
    .line 548
    invoke-static/range {v10 .. v15}, Lc9/b0;->f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_14

    .line 552
    .line 553
    :pswitch_8
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    new-instance v4, Ljava/util/ArrayList;

    .line 562
    .line 563
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 564
    .line 565
    .line 566
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    :cond_11
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_14

    .line 575
    .line 576
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    move-object v0, v11

    .line 581
    check-cast v0, Ljava/lang/String;

    .line 582
    .line 583
    if-eqz v3, :cond_12

    .line 584
    .line 585
    :try_start_0
    invoke-virtual {v3, v0}, Lg8/i;->H(Ljava/lang/String;)Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-ne v0, v9, :cond_12

    .line 590
    .line 591
    move v0, v9

    .line 592
    goto :goto_c

    .line 593
    :catchall_0
    move-exception v0

    .line 594
    goto :goto_d

    .line 595
    :cond_12
    move v0, v12

    .line 596
    :goto_c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 597
    .line 598
    .line 599
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 600
    goto :goto_e

    .line 601
    :goto_d
    new-instance v14, Lsf/f;

    .line 602
    .line 603
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 604
    .line 605
    .line 606
    move-object v0, v14

    .line 607
    :goto_e
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 608
    .line 609
    instance-of v15, v0, Lsf/f;

    .line 610
    .line 611
    if-eqz v15, :cond_13

    .line 612
    .line 613
    move-object v0, v14

    .line 614
    :cond_13
    check-cast v0, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-eqz v0, :cond_11

    .line 621
    .line 622
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-eqz v0, :cond_15

    .line 631
    .line 632
    const-string v0, "\u5f53\u524d\u5206\u7ec4\u6ca1\u6709\u53ef\u9080\u8bf7\u7684\u597d\u53cb"

    .line 633
    .line 634
    invoke-static {v10, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_14

    .line 638
    .line 639
    :cond_15
    if-eqz v3, :cond_16

    .line 640
    .line 641
    :try_start_1
    invoke-virtual {v3}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 642
    .line 643
    .line 644
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 645
    goto :goto_f

    .line 646
    :catchall_1
    move-exception v0

    .line 647
    new-instance v2, Lsf/f;

    .line 648
    .line 649
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 650
    .line 651
    .line 652
    goto :goto_10

    .line 653
    :cond_16
    :goto_f
    if-nez v2, :cond_17

    .line 654
    .line 655
    move-object v2, v13

    .line 656
    :cond_17
    :goto_10
    instance-of v0, v2, Lsf/f;

    .line 657
    .line 658
    if-eqz v0, :cond_18

    .line 659
    .line 660
    goto :goto_11

    .line 661
    :cond_18
    move-object v13, v2

    .line 662
    :goto_11
    check-cast v13, Ljava/lang/Iterable;

    .line 663
    .line 664
    new-instance v11, Ljava/util/ArrayList;

    .line 665
    .line 666
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 671
    .line 672
    .line 673
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eqz v2, :cond_1b

    .line 682
    .line 683
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 688
    .line 689
    iget-object v13, v2, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v14

    .line 695
    iget-object v3, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 696
    .line 697
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 698
    .line 699
    iget-object v9, v2, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 700
    .line 701
    iget-object v12, v2, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 702
    .line 703
    iget-object v2, v2, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 704
    .line 705
    filled-new-array {v9, v12, v2}, [Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    new-instance v9, Ljava/util/ArrayList;

    .line 714
    .line 715
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 716
    .line 717
    .line 718
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    :cond_19
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v12

    .line 726
    if-eqz v12, :cond_1a

    .line 727
    .line 728
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v12

    .line 732
    move-object v15, v12

    .line 733
    check-cast v15, Ljava/lang/String;

    .line 734
    .line 735
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 736
    .line 737
    .line 738
    move-result v15

    .line 739
    if-nez v15, :cond_19

    .line 740
    .line 741
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    goto :goto_13

    .line 745
    :cond_1a
    new-instance v12, Lwb/jv;

    .line 746
    .line 747
    const/4 v15, 0x1

    .line 748
    const/16 v18, 0x0

    .line 749
    .line 750
    const/16 v19, 0x0

    .line 751
    .line 752
    const/16 v21, 0x60

    .line 753
    .line 754
    move-object/from16 v16, v3

    .line 755
    .line 756
    move-object/from16 v17, v5

    .line 757
    .line 758
    move-object/from16 v20, v9

    .line 759
    .line 760
    invoke-direct/range {v12 .. v21}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    goto :goto_12

    .line 767
    :cond_1b
    new-instance v12, Lc9/i;

    .line 768
    .line 769
    invoke-direct {v12, v10, v8, v4}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    new-instance v13, Lbi/c;

    .line 773
    .line 774
    invoke-direct {v13, v7}, Lbi/c;-><init>(I)V

    .line 775
    .line 776
    .line 777
    const/16 v19, 0x1

    .line 778
    .line 779
    const/16 v20, 0xbc0

    .line 780
    .line 781
    const-string v14, "\u9009\u62e9\u7fa4\u804a"

    .line 782
    .line 783
    const-string v15, "\u4e0b\u4e00\u6b65"

    .line 784
    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    const/16 v18, 0x0

    .line 790
    .line 791
    invoke-static/range {v10 .. v20}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 792
    .line 793
    .line 794
    goto/16 :goto_14

    .line 795
    .line 796
    :pswitch_9
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 801
    .line 802
    .line 803
    move-result v2

    .line 804
    if-eqz v2, :cond_1c

    .line 805
    .line 806
    invoke-static {v10, v11}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    goto/16 :goto_14

    .line 810
    .line 811
    :cond_1c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    const-string v4, "\u53d1\u9001\u7ed9\u5f53\u524d\u5206\u7ec4\u53ca\u5b50\u5206\u7ec4\u5185 "

    .line 816
    .line 817
    invoke-static {v2, v4, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v12

    .line 821
    new-instance v2, Lc9/s;

    .line 822
    .line 823
    invoke-direct {v2, v10, v0}, Lc9/s;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 824
    .line 825
    .line 826
    new-instance v0, Lbi/c;

    .line 827
    .line 828
    invoke-direct {v0, v7}, Lbi/c;-><init>(I)V

    .line 829
    .line 830
    .line 831
    const/16 v19, 0x248

    .line 832
    .line 833
    const-string v11, "\u53d1\u9001"

    .line 834
    .line 835
    const/4 v13, 0x0

    .line 836
    const-string v14, "\u8f93\u5165\u8981\u53d1\u9001\u7684\u6587\u5b57"

    .line 837
    .line 838
    const/16 v15, 0x1388

    .line 839
    .line 840
    const/16 v16, 0x0

    .line 841
    .line 842
    move-object/from16 v18, v0

    .line 843
    .line 844
    move-object/from16 v17, v2

    .line 845
    .line 846
    invoke-static/range {v10 .. v19}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 847
    .line 848
    .line 849
    goto :goto_14

    .line 850
    :pswitch_a
    invoke-static {v10, v5, v12, v4}, Lc9/b0;->e(Landroid/app/Activity;Ljava/lang/String;ZLaa/c;)V

    .line 851
    .line 852
    .line 853
    goto :goto_14

    .line 854
    :pswitch_b
    invoke-static {v10, v5, v9, v4}, Lc9/b0;->e(Landroid/app/Activity;Ljava/lang/String;ZLaa/c;)V

    .line 855
    .line 856
    .line 857
    goto :goto_14

    .line 858
    :pswitch_c
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 859
    .line 860
    .line 861
    move-result-object v11

    .line 862
    new-instance v15, Lc9/r;

    .line 863
    .line 864
    const/4 v0, 0x3

    .line 865
    invoke-direct {v15, v10, v5, v4, v0}, Lc9/r;-><init>(Landroid/app/Activity;Ljava/lang/String;Laa/c;I)V

    .line 866
    .line 867
    .line 868
    const/4 v14, 0x0

    .line 869
    const-string v12, "\u6279\u91cf\u5220\u9664\u6d88\u606f"

    .line 870
    .line 871
    const-string v13, "\u7ee7\u7eed"

    .line 872
    .line 873
    invoke-static/range {v10 .. v15}, Lc9/b0;->f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V

    .line 874
    .line 875
    .line 876
    goto :goto_14

    .line 877
    :pswitch_d
    invoke-static {v10, v5}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_1d

    .line 886
    .line 887
    invoke-static {v10, v11}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    goto :goto_14

    .line 891
    :cond_1d
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 892
    .line 893
    .line 894
    move-result v2

    .line 895
    const-string v3, "\u6b63\u5728\u6807\u8bb0 "

    .line 896
    .line 897
    const-string v5, " \u4e2a\u4f1a\u8bdd..."

    .line 898
    .line 899
    invoke-static {v2, v3, v5}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    new-instance v3, Lc9/s;

    .line 904
    .line 905
    invoke-direct {v3, v0, v10}, Lc9/s;-><init>(Ljava/util/List;Landroid/app/Activity;)V

    .line 906
    .line 907
    .line 908
    new-instance v0, Lc9/l;

    .line 909
    .line 910
    invoke-direct {v0, v4, v10, v9}, Lc9/l;-><init>(Laa/c;Landroid/app/Activity;I)V

    .line 911
    .line 912
    .line 913
    const-string v4, "\u6240\u6709\u6d88\u606f\u6807\u4e3a\u5df2\u8bfb"

    .line 914
    .line 915
    invoke-static {v10, v4, v2, v3, v0}, Lc9/b0;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;)V

    .line 916
    .line 917
    .line 918
    goto :goto_14

    .line 919
    :pswitch_e
    invoke-static {v10, v2, v12}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 920
    .line 921
    .line 922
    :goto_14
    return-object v6

    .line 923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    :pswitch_data_1
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
    .end packed-switch
.end method
