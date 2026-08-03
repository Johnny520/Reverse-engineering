.class public final synthetic Lc9/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lc9/a;

.field public final synthetic j:Laa/c;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lc9/a;Laa/c;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc9/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/n;->h:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/n;->i:Lc9/a;

    .line 6
    .line 7
    iput-object p3, p0, Lc9/n;->j:Laa/c;

    .line 8
    .line 9
    iput-object p4, p0, Lc9/n;->k:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/n;->g:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sget-object v3, Lc9/b0;->a:Landroid/os/Handler;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    iget-object v4, v0, Lc9/n;->h:Landroid/app/Activity;

    .line 22
    .line 23
    iget-object v5, v0, Lc9/n;->i:Lc9/a;

    .line 24
    .line 25
    iget-object v6, v0, Lc9/n;->j:Laa/c;

    .line 26
    .line 27
    iget-object v7, v0, Lc9/n;->k:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v8, 0x2

    .line 30
    const/4 v9, 0x1

    .line 31
    if-eqz v1, :cond_9

    .line 32
    .line 33
    const/4 v10, 0x6

    .line 34
    if-eq v1, v9, :cond_6

    .line 35
    .line 36
    if-eq v1, v8, :cond_3

    .line 37
    .line 38
    const/4 v10, 0x3

    .line 39
    if-eq v1, v10, :cond_2

    .line 40
    .line 41
    if-eq v1, v3, :cond_1

    .line 42
    .line 43
    const/4 v10, 0x5

    .line 44
    if-eq v1, v10, :cond_0

    .line 45
    .line 46
    move-object/from16 v18, v2

    .line 47
    .line 48
    move-object v3, v6

    .line 49
    move-object v2, v7

    .line 50
    move v0, v9

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_0
    iget-boolean v10, v5, Lc9/a;->l:Z

    .line 54
    .line 55
    xor-int/lit8 v16, v10, 0x1

    .line 56
    .line 57
    const/16 v17, 0x7ff

    .line 58
    .line 59
    move-object v10, v6

    .line 60
    const/4 v6, 0x0

    .line 61
    move-object v11, v7

    .line 62
    const/4 v7, 0x0

    .line 63
    move v12, v8

    .line 64
    const/4 v8, 0x0

    .line 65
    move v13, v9

    .line 66
    const/4 v9, 0x0

    .line 67
    move-object v14, v10

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v15, v11

    .line 70
    const/4 v11, 0x0

    .line 71
    move/from16 v18, v12

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    move/from16 v19, v13

    .line 75
    .line 76
    const/4 v13, 0x0

    .line 77
    move-object/from16 v20, v14

    .line 78
    .line 79
    const/4 v14, 0x0

    .line 80
    move-object/from16 v21, v15

    .line 81
    .line 82
    const/4 v15, 0x0

    .line 83
    move-object/from16 v18, v2

    .line 84
    .line 85
    move/from16 v0, v19

    .line 86
    .line 87
    move-object/from16 v3, v20

    .line 88
    .line 89
    move-object/from16 v2, v21

    .line 90
    .line 91
    invoke-static/range {v5 .. v17}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v4, v5, v3}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_1
    move-object/from16 v18, v2

    .line 101
    .line 102
    move-object v3, v6

    .line 103
    move-object v2, v7

    .line 104
    move v0, v9

    .line 105
    iget-boolean v6, v5, Lc9/a;->j:Z

    .line 106
    .line 107
    xor-int/lit8 v15, v6, 0x1

    .line 108
    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    const/16 v17, 0xdff

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v14, 0x0

    .line 122
    invoke-static/range {v5 .. v17}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-static {v4, v5, v3}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :cond_2
    move-object/from16 v18, v2

    .line 132
    .line 133
    move-object v3, v6

    .line 134
    move-object v2, v7

    .line 135
    move v0, v9

    .line 136
    iget-boolean v6, v5, Lc9/a;->i:Z

    .line 137
    .line 138
    xor-int/lit8 v14, v6, 0x1

    .line 139
    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0xeff

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    invoke-static/range {v5 .. v17}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-static {v4, v5, v3}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :cond_3
    move-object/from16 v18, v2

    .line 163
    .line 164
    move-object v3, v6

    .line 165
    move-object v2, v7

    .line 166
    move v0, v9

    .line 167
    invoke-static {v4, v2}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-eqz v6, :cond_4

    .line 172
    .line 173
    iget-object v11, v6, Lc9/a;->b:Ljava/lang/String;

    .line 174
    .line 175
    move-object v5, v4

    .line 176
    new-instance v4, Lc9/n;

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    move-object v8, v2

    .line 180
    move-object v7, v3

    .line 181
    invoke-direct/range {v4 .. v9}, Lc9/n;-><init>(Landroid/app/Activity;Lc9/a;Laa/c;Ljava/lang/String;I)V

    .line 182
    .line 183
    .line 184
    move-object v14, v7

    .line 185
    move-object v15, v8

    .line 186
    new-instance v12, Lbi/c;

    .line 187
    .line 188
    invoke-direct {v12, v10}, Lbi/c;-><init>(I)V

    .line 189
    .line 190
    .line 191
    const/16 v13, 0x240

    .line 192
    .line 193
    move-object v7, v11

    .line 194
    move-object v11, v4

    .line 195
    move-object v4, v5

    .line 196
    const-string v5, "\u547d\u540d"

    .line 197
    .line 198
    const-string v6, "\u4fee\u6539\u5f53\u524d\u804a\u5929\u5206\u7ec4\u540d\u79f0"

    .line 199
    .line 200
    const-string v8, "\u5206\u7ec4\u540d\u79f0"

    .line 201
    .line 202
    const/16 v9, 0x32

    .line 203
    .line 204
    const/4 v10, 0x0

    .line 205
    invoke-static/range {v4 .. v13}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 206
    .line 207
    .line 208
    :goto_0
    move-object v5, v4

    .line 209
    goto :goto_1

    .line 210
    :cond_4
    move-object v15, v2

    .line 211
    move-object v14, v3

    .line 212
    goto :goto_0

    .line 213
    :cond_5
    :goto_1
    move-object v4, v5

    .line 214
    :goto_2
    move-object v3, v14

    .line 215
    move-object v2, v15

    .line 216
    goto/16 :goto_4

    .line 217
    .line 218
    :cond_6
    move-object/from16 v18, v2

    .line 219
    .line 220
    move-object v5, v4

    .line 221
    move-object v14, v6

    .line 222
    move-object v15, v7

    .line 223
    move v0, v9

    .line 224
    invoke-static {v5, v15}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_5

    .line 229
    .line 230
    invoke-static {v15}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-static {v5, v6}, Ld9/o;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    iget-object v2, v2, Lc9/a;->b:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {}, La/a;->E()Luf/c;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-eqz v3, :cond_7

    .line 245
    .line 246
    const-string v7, "\u66f4\u6362\u5934\u50cf"

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_7
    const-string v7, "\u9009\u62e9\u5934\u50cf"

    .line 250
    .line 251
    :goto_3
    new-instance v8, Lsf/e;

    .line 252
    .line 253
    const-string v9, "\u4ece\u7cfb\u7edf\u76f8\u518c\u6216\u6587\u4ef6\u4e2d\u9009\u62e9"

    .line 254
    .line 255
    invoke-direct {v8, v7, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, v8}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    if-eqz v3, :cond_8

    .line 262
    .line 263
    new-instance v3, Lsf/e;

    .line 264
    .line 265
    const-string v7, "\u6062\u590d\u9ed8\u8ba4"

    .line 266
    .line 267
    const-string v8, "\u79fb\u9664\u5f53\u524d\u5206\u7ec4\u5934\u50cf"

    .line 268
    .line 269
    invoke-direct {v3, v7, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v3}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    :cond_8
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    new-instance v4, Lc9/o;

    .line 280
    .line 281
    const/4 v9, 0x0

    .line 282
    move-object v8, v14

    .line 283
    move-object v7, v15

    .line 284
    invoke-direct/range {v4 .. v9}, Lc9/o;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Laa/c;I)V

    .line 285
    .line 286
    .line 287
    new-instance v9, Lbi/c;

    .line 288
    .line 289
    invoke-direct {v9, v10}, Lbi/c;-><init>(I)V

    .line 290
    .line 291
    .line 292
    sget-object v10, Lwb/lv;->j:Lwb/lv;

    .line 293
    .line 294
    move-object v8, v4

    .line 295
    move-object v4, v5

    .line 296
    const-string v5, "\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 297
    .line 298
    move-object v6, v2

    .line 299
    move-object v7, v3

    .line 300
    invoke-static/range {v4 .. v10}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :cond_9
    move-object/from16 v18, v2

    .line 305
    .line 306
    move-object v14, v6

    .line 307
    move-object v15, v7

    .line 308
    move v0, v9

    .line 309
    iget-boolean v2, v5, Lc9/a;->g:Z

    .line 310
    .line 311
    xor-int/lit8 v12, v2, 0x1

    .line 312
    .line 313
    const/16 v16, 0x0

    .line 314
    .line 315
    const/16 v17, 0xfbf

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v7, 0x0

    .line 319
    const/4 v8, 0x0

    .line 320
    const/4 v9, 0x0

    .line 321
    const/4 v10, 0x0

    .line 322
    const/4 v11, 0x0

    .line 323
    const/4 v13, 0x0

    .line 324
    move-object v3, v14

    .line 325
    const/4 v14, 0x0

    .line 326
    move-object v2, v15

    .line 327
    const/4 v15, 0x0

    .line 328
    invoke-static/range {v5 .. v17}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-static {v4, v5, v3}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 333
    .line 334
    .line 335
    :goto_4
    if-eq v1, v0, :cond_a

    .line 336
    .line 337
    const/4 v12, 0x2

    .line 338
    if-eq v1, v12, :cond_a

    .line 339
    .line 340
    sget-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 341
    .line 342
    new-instance v1, Lac/l;

    .line 343
    .line 344
    const/4 v5, 0x4

    .line 345
    invoke-direct {v1, v5, v4, v3, v2}, Lac/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 349
    .line 350
    .line 351
    :cond_a
    return-object v18

    .line 352
    :pswitch_0
    move-object/from16 v18, v2

    .line 353
    .line 354
    move-object/from16 v0, p1

    .line 355
    .line 356
    check-cast v0, Ljava/lang/String;

    .line 357
    .line 358
    sget-object v1, Lc9/b0;->a:Landroid/os/Handler;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-object/from16 v1, p0

    .line 364
    .line 365
    iget-object v2, v1, Lc9/n;->h:Landroid/app/Activity;

    .line 366
    .line 367
    invoke-static {v2}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    iget-object v5, v1, Lc9/n;->i:Lc9/a;

    .line 376
    .line 377
    if-eqz v4, :cond_b

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_d

    .line 389
    .line 390
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    check-cast v4, Lc9/a;

    .line 395
    .line 396
    iget-object v6, v4, Lc9/a;->a:Ljava/lang/String;

    .line 397
    .line 398
    iget-object v7, v1, Lc9/n;->k:Ljava/lang/String;

    .line 399
    .line 400
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    if-nez v6, :cond_c

    .line 405
    .line 406
    iget-object v6, v4, Lc9/a;->c:Ljava/lang/String;

    .line 407
    .line 408
    iget-object v7, v5, Lc9/a;->c:Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    if-eqz v6, :cond_c

    .line 415
    .line 416
    iget-object v4, v4, Lc9/a;->b:Ljava/lang/String;

    .line 417
    .line 418
    invoke-static {v4, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    if-eqz v4, :cond_c

    .line 423
    .line 424
    const-string v0, "\u540c\u4e00\u5c42\u7ea7\u5df2\u5b58\u5728\u540c\u540d\u5206\u7ec4"

    .line 425
    .line 426
    invoke-static {v2, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    goto :goto_6

    .line 430
    :cond_d
    :goto_5
    const/16 v30, 0x0

    .line 431
    .line 432
    const/16 v31, 0xffd

    .line 433
    .line 434
    const/16 v20, 0x0

    .line 435
    .line 436
    const/16 v22, 0x0

    .line 437
    .line 438
    const/16 v23, 0x0

    .line 439
    .line 440
    const/16 v24, 0x0

    .line 441
    .line 442
    const/16 v25, 0x0

    .line 443
    .line 444
    const/16 v26, 0x0

    .line 445
    .line 446
    const/16 v27, 0x0

    .line 447
    .line 448
    const/16 v28, 0x0

    .line 449
    .line 450
    const/16 v29, 0x0

    .line 451
    .line 452
    move-object/from16 v21, v0

    .line 453
    .line 454
    move-object/from16 v19, v5

    .line 455
    .line 456
    invoke-static/range {v19 .. v31}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    iget-object v3, v1, Lc9/n;->j:Laa/c;

    .line 461
    .line 462
    invoke-static {v2, v0, v3}, Lc9/b0;->j(Landroid/app/Activity;Lc9/a;Lfg/a;)V

    .line 463
    .line 464
    .line 465
    :goto_6
    return-object v18

    .line 466
    nop

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
