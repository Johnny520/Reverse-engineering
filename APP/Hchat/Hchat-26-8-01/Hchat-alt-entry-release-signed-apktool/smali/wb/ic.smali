.class public final synthetic Lwb/ic;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p8, p0, Lwb/ic;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ic;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ic;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ic;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ic;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ic;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/ic;->m:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/ic;->n:Li0/a1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ic;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    and-int/lit8 v3, v2, 0x3

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    if-eq v3, v4, :cond_0

    .line 26
    .line 27
    move v3, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v3, v5

    .line 30
    :goto_0
    and-int/2addr v2, v6

    .line 31
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_c

    .line 36
    .line 37
    iget-object v8, v0, Lwb/ic;->i:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    const-string v2, "\u6682\u65e0\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u6dfb\u52a0\u4e0d\u540c\u7fa4\u7684\u62a2\u5305\u7b56\u7565"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const-string v3, " \u4e2a\u6a21\u677f\uff0c\u8fdb\u5165\u540e\u65b0\u589e\u6216\u4fee\u6539"

    .line 65
    .line 66
    invoke-static {v2, v3}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :goto_1
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    sget-object v4, Li0/l;->a:Li0/e;

    .line 75
    .line 76
    if-ne v3, v4, :cond_2

    .line 77
    .line 78
    new-instance v3, Lwb/ud;

    .line 79
    .line 80
    const/16 v7, 0x1d

    .line 81
    .line 82
    iget-object v9, v0, Lwb/ic;->j:Li0/a1;

    .line 83
    .line 84
    invoke-direct {v3, v9, v7}, Lwb/ud;-><init>(Li0/a1;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    check-cast v3, Lfg/a;

    .line 91
    .line 92
    const-string v7, "\u7ea2\u5305\u6a21\u677f"

    .line 93
    .line 94
    const/16 v9, 0x186

    .line 95
    .line 96
    invoke-static {v7, v2, v3, v1, v9}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-static {v2, v1, v5, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 101
    .line 102
    .line 103
    iget-object v11, v0, Lwb/ic;->k:Li0/a1;

    .line 104
    .line 105
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    const-string v3, "\u6682\u65e0\u9002\u7528\u804a\u5929\uff0c\u672a\u547d\u4e2d\u65f6\u8d70\u9ed8\u8ba4\u89c4\u5219"

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const-string v7, " \u4e2a\u804a\u5929\uff0c\u8fdb\u5165\u540e\u5206\u914d\u6a21\u677f"

    .line 131
    .line 132
    invoke-static {v3, v7}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    :goto_2
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    if-ne v7, v4, :cond_4

    .line 141
    .line 142
    new-instance v7, Lwb/bf;

    .line 143
    .line 144
    const/4 v10, 0x0

    .line 145
    iget-object v12, v0, Lwb/ic;->l:Li0/a1;

    .line 146
    .line 147
    invoke-direct {v7, v12, v10}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    check-cast v7, Lfg/a;

    .line 154
    .line 155
    const-string v10, "\u9002\u7528\u804a\u5929"

    .line 156
    .line 157
    invoke-static {v10, v3, v7, v1, v9}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v1, v5, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 161
    .line 162
    .line 163
    iget-object v9, v0, Lwb/ic;->m:Li0/a1;

    .line 164
    .line 165
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    check-cast v2, Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/util/List;

    .line 176
    .line 177
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_5

    .line 182
    .line 183
    const-string v2, "\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_7

    .line 195
    .line 196
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    move-object v6, v5

    .line 201
    check-cast v6, Lna/j;

    .line 202
    .line 203
    iget-object v6, v6, Lna/j;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_7
    const/4 v5, 0x0

    .line 213
    :goto_3
    check-cast v5, Lna/j;

    .line 214
    .line 215
    if-eqz v5, :cond_9

    .line 216
    .line 217
    iget-object v3, v5, Lna/j;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_8

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    move-object v2, v3

    .line 227
    goto :goto_4

    .line 228
    :cond_9
    const-string v2, "\u6a21\u677f\u4e0d\u5b58\u5728\uff0c\u5f53\u524d\u4f1a\u56de\u5230\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 229
    .line 230
    :goto_4
    iget-object v10, v0, Lwb/ic;->h:Landroid/content/SharedPreferences;

    .line 231
    .line 232
    invoke-virtual {v1, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    if-nez v3, :cond_a

    .line 241
    .line 242
    if-ne v5, v4, :cond_b

    .line 243
    .line 244
    :cond_a
    new-instance v7, Lc9/r0;

    .line 245
    .line 246
    const/16 v13, 0xe

    .line 247
    .line 248
    iget-object v12, v0, Lwb/ic;->n:Li0/a1;

    .line 249
    .line 250
    invoke-direct/range {v7 .. v13}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-object v5, v7

    .line 257
    :cond_b
    check-cast v5, Lfg/a;

    .line 258
    .line 259
    const/4 v3, 0x6

    .line 260
    const-string v4, "\u9ed8\u8ba4\u89c4\u5219"

    .line 261
    .line 262
    invoke-static {v4, v2, v5, v1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_c
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 267
    .line 268
    .line 269
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    return-object v1

    .line 272
    :pswitch_0
    move-object/from16 v8, p1

    .line 273
    .line 274
    check-cast v8, Li0/h0;

    .line 275
    .line 276
    move-object/from16 v1, p2

    .line 277
    .line 278
    check-cast v1, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    const/4 v11, 0x1

    .line 285
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    const/4 v13, 0x0

    .line 290
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    and-int/lit8 v2, v1, 0x3

    .line 295
    .line 296
    const/4 v15, 0x2

    .line 297
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    if-eq v2, v15, :cond_d

    .line 302
    .line 303
    move v2, v11

    .line 304
    goto :goto_6

    .line 305
    :cond_d
    move v2, v13

    .line 306
    :goto_6
    and-int/2addr v1, v11

    .line 307
    invoke-virtual {v8, v1, v2}, Li0/h0;->S(IZ)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_16

    .line 312
    .line 313
    new-instance v1, Lsf/e;

    .line 314
    .line 315
    const-string v2, "\u5168\u90e8\u62a2"

    .line 316
    .line 317
    invoke-direct {v1, v2, v14}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    new-instance v2, Lsf/e;

    .line 321
    .line 322
    const-string v4, "\u767d\u540d\u5355\uff08\u53ea\u62a2\u6307\u5b9a\u4eba\uff09"

    .line 323
    .line 324
    invoke-direct {v2, v4, v12}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    new-instance v4, Lsf/e;

    .line 328
    .line 329
    const-string v5, "\u9ed1\u540d\u5355\uff08\u4e0d\u62a2\u6307\u5b9a\u4eba\uff09"

    .line 330
    .line 331
    invoke-direct {v4, v5, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    filled-new-array {v1, v2, v4}, [Lsf/e;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v1}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    iget-object v2, v0, Lwb/ic;->i:Li0/a1;

    .line 347
    .line 348
    sget-object v4, Li0/l;->a:Li0/e;

    .line 349
    .line 350
    if-ne v1, v4, :cond_e

    .line 351
    .line 352
    new-instance v1, Lwb/ze;

    .line 353
    .line 354
    const/16 v6, 0x1a

    .line 355
    .line 356
    invoke-direct {v1, v2, v6}, Lwb/ze;-><init>(Li0/a1;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_e
    move-object v7, v1

    .line 363
    check-cast v7, Lfg/l;

    .line 364
    .line 365
    const v9, 0x361b0

    .line 366
    .line 367
    .line 368
    const/4 v10, 0x0

    .line 369
    move-object v1, v2

    .line 370
    iget-object v2, v0, Lwb/ic;->h:Landroid/content/SharedPreferences;

    .line 371
    .line 372
    move-object v6, v3

    .line 373
    const-string v3, "hb_auto_mode"

    .line 374
    .line 375
    move-object/from16 v16, v4

    .line 376
    .line 377
    const-string v4, "\u8fc7\u6ee4\u6a21\u5f0f"

    .line 378
    .line 379
    move-object/from16 v17, v6

    .line 380
    .line 381
    const/4 v6, 0x0

    .line 382
    move-object/from16 v15, v16

    .line 383
    .line 384
    move-object/from16 v16, v1

    .line 385
    .line 386
    move-object/from16 v1, v17

    .line 387
    .line 388
    invoke-static/range {v2 .. v10}, Lwb/ho;->z2(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;Li0/h0;II)V

    .line 389
    .line 390
    .line 391
    const/4 v3, 0x0

    .line 392
    invoke-static {v3, v8, v13, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 393
    .line 394
    .line 395
    new-instance v4, Lsf/e;

    .line 396
    .line 397
    const-string v5, "\u65e0\u9650\u5236"

    .line 398
    .line 399
    invoke-direct {v4, v5, v14}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    new-instance v5, Lsf/e;

    .line 403
    .line 404
    const-string v6, "\u53ea\u62a2\u542b\u5173\u952e\u8bcd\u7684"

    .line 405
    .line 406
    invoke-direct {v5, v6, v12}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    new-instance v6, Lsf/e;

    .line 410
    .line 411
    const-string v7, "\u5c4f\u853d\u542b\u5173\u952e\u8bcd\u7684"

    .line 412
    .line 413
    invoke-direct {v6, v7, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    filled-new-array {v4, v5, v6}, [Lsf/e;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-static {v1}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-object v12, v0, Lwb/ic;->j:Li0/a1;

    .line 429
    .line 430
    iget-object v14, v0, Lwb/ic;->k:Li0/a1;

    .line 431
    .line 432
    if-ne v1, v15, :cond_f

    .line 433
    .line 434
    new-instance v1, Lsh/m1;

    .line 435
    .line 436
    const/4 v4, 0x7

    .line 437
    invoke-direct {v1, v4, v12, v14}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_f
    move-object v7, v1

    .line 444
    check-cast v7, Lfg/l;

    .line 445
    .line 446
    const v9, 0x361b0

    .line 447
    .line 448
    .line 449
    const/4 v10, 0x0

    .line 450
    move v1, v3

    .line 451
    const-string v3, "hb_kw_mode"

    .line 452
    .line 453
    const-string v4, "\u5173\u952e\u8bcd\u8fc7\u6ee4"

    .line 454
    .line 455
    const/4 v6, 0x0

    .line 456
    invoke-static/range {v2 .. v10}, Lwb/ho;->z2(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;Li0/h0;II)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    check-cast v2, Ljava/lang/Number;

    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-eqz v2, :cond_11

    .line 470
    .line 471
    const v2, -0xe02b47b

    .line 472
    .line 473
    .line 474
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 475
    .line 476
    .line 477
    invoke-static {v1, v8, v13, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 478
    .line 479
    .line 480
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    move-object v4, v2

    .line 485
    check-cast v4, Ljava/lang/String;

    .line 486
    .line 487
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-ne v2, v15, :cond_10

    .line 492
    .line 493
    new-instance v2, Lwb/ze;

    .line 494
    .line 495
    const/16 v3, 0x1b

    .line 496
    .line 497
    invoke-direct {v2, v14, v3}, Lwb/ze;-><init>(Li0/a1;I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v8, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_10
    move-object v6, v2

    .line 504
    check-cast v6, Lfg/l;

    .line 505
    .line 506
    move-object v7, v8

    .line 507
    const/16 v8, 0x6036

    .line 508
    .line 509
    const/16 v9, 0x8

    .line 510
    .line 511
    const-string v2, "\u5173\u952e\u8bcd\u5217\u8868"

    .line 512
    .line 513
    const-string v3, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528 | \u5206\u9694"

    .line 514
    .line 515
    const/4 v5, 0x0

    .line 516
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 517
    .line 518
    .line 519
    move-object v8, v7

    .line 520
    invoke-virtual {v8, v13}, Li0/h0;->p(Z)V

    .line 521
    .line 522
    .line 523
    goto :goto_7

    .line 524
    :cond_11
    const v2, -0xe008ca8

    .line 525
    .line 526
    .line 527
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v8, v13}, Li0/h0;->p(Z)V

    .line 531
    .line 532
    .line 533
    :goto_7
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    check-cast v2, Ljava/lang/Number;

    .line 538
    .line 539
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    iget-object v3, v0, Lwb/ic;->m:Li0/a1;

    .line 544
    .line 545
    const/16 v4, 0x186

    .line 546
    .line 547
    if-ne v2, v11, :cond_13

    .line 548
    .line 549
    const v2, -0xdffa97c

    .line 550
    .line 551
    .line 552
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 553
    .line 554
    .line 555
    invoke-static {v1, v8, v13, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 556
    .line 557
    .line 558
    iget-object v1, v0, Lwb/ic;->l:Li0/a1;

    .line 559
    .line 560
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    check-cast v2, Ljava/lang/String;

    .line 565
    .line 566
    invoke-static {v2}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    if-ne v5, v15, :cond_12

    .line 575
    .line 576
    new-instance v5, Lc9/x0;

    .line 577
    .line 578
    const/16 v6, 0x15

    .line 579
    .line 580
    invoke-direct {v5, v6, v1, v3}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    :cond_12
    check-cast v5, Lfg/a;

    .line 587
    .line 588
    const-string v1, "\u767d\u540d\u5355"

    .line 589
    .line 590
    invoke-static {v1, v2, v5, v8, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v8, v13}, Li0/h0;->p(Z)V

    .line 594
    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_13
    invoke-interface/range {v16 .. v16}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    check-cast v2, Ljava/lang/Number;

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    const/4 v5, 0x2

    .line 608
    if-ne v2, v5, :cond_15

    .line 609
    .line 610
    const v2, -0xdf6431c

    .line 611
    .line 612
    .line 613
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 614
    .line 615
    .line 616
    invoke-static {v1, v8, v13, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 617
    .line 618
    .line 619
    iget-object v1, v0, Lwb/ic;->n:Li0/a1;

    .line 620
    .line 621
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Ljava/lang/String;

    .line 626
    .line 627
    invoke-static {v2}, Lwb/ho;->O4(Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    if-ne v5, v15, :cond_14

    .line 636
    .line 637
    new-instance v5, Lc9/x0;

    .line 638
    .line 639
    const/16 v6, 0x16

    .line 640
    .line 641
    invoke-direct {v5, v6, v1, v3}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    :cond_14
    check-cast v5, Lfg/a;

    .line 648
    .line 649
    const-string v1, "\u9ed1\u540d\u5355"

    .line 650
    .line 651
    invoke-static {v1, v2, v5, v8, v4}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v8, v13}, Li0/h0;->p(Z)V

    .line 655
    .line 656
    .line 657
    goto :goto_8

    .line 658
    :cond_15
    const v1, -0xded85c8

    .line 659
    .line 660
    .line 661
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v8, v13}, Li0/h0;->p(Z)V

    .line 665
    .line 666
    .line 667
    goto :goto_8

    .line 668
    :cond_16
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 669
    .line 670
    .line 671
    :goto_8
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 672
    .line 673
    return-object v1

    .line 674
    :pswitch_1
    move-object/from16 v7, p1

    .line 675
    .line 676
    check-cast v7, Li0/h0;

    .line 677
    .line 678
    move-object/from16 v1, p2

    .line 679
    .line 680
    check-cast v1, Ljava/lang/Integer;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    and-int/lit8 v2, v1, 0x3

    .line 687
    .line 688
    const/4 v3, 0x2

    .line 689
    const/4 v11, 0x0

    .line 690
    const/4 v12, 0x1

    .line 691
    if-eq v2, v3, :cond_17

    .line 692
    .line 693
    move v2, v12

    .line 694
    goto :goto_9

    .line 695
    :cond_17
    move v2, v11

    .line 696
    :goto_9
    and-int/2addr v1, v12

    .line 697
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-eqz v1, :cond_24

    .line 702
    .line 703
    const/4 v6, 0x0

    .line 704
    const/16 v8, 0x6db0

    .line 705
    .line 706
    iget-object v2, v0, Lwb/ic;->h:Landroid/content/SharedPreferences;

    .line 707
    .line 708
    const-string v3, "transfer_auto_enable"

    .line 709
    .line 710
    const-string v4, "\u81ea\u52a8\u6536\u6b3e"

    .line 711
    .line 712
    const-string v5, "\u81ea\u52a8\u9886\u53d6\u5f85\u6536\u6b3e\u8f6c\u8d26"

    .line 713
    .line 714
    invoke-static/range {v2 .. v8}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 715
    .line 716
    .line 717
    const/4 v1, 0x0

    .line 718
    invoke-static {v1, v7, v11, v12}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 719
    .line 720
    .line 721
    iget-object v3, v0, Lwb/ic;->i:Li0/a1;

    .line 722
    .line 723
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    check-cast v4, Ljava/util/List;

    .line 728
    .line 729
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    if-eqz v4, :cond_18

    .line 734
    .line 735
    const-string v4, "\u6682\u65e0\u6a21\u677f"

    .line 736
    .line 737
    goto :goto_a

    .line 738
    :cond_18
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    check-cast v4, Ljava/util/List;

    .line 743
    .line 744
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 745
    .line 746
    .line 747
    move-result v4

    .line 748
    const-string v5, " \u4e2a\u6a21\u677f"

    .line 749
    .line 750
    invoke-static {v4, v5}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    :goto_a
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    sget-object v13, Li0/l;->a:Li0/e;

    .line 759
    .line 760
    if-ne v5, v13, :cond_19

    .line 761
    .line 762
    new-instance v5, Lwb/bf;

    .line 763
    .line 764
    const/16 v6, 0x9

    .line 765
    .line 766
    iget-object v8, v0, Lwb/ic;->j:Li0/a1;

    .line 767
    .line 768
    invoke-direct {v5, v8, v6}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    :cond_19
    check-cast v5, Lfg/a;

    .line 775
    .line 776
    const-string v6, "\u6536\u6b3e\u89c4\u5219\u6a21\u677f"

    .line 777
    .line 778
    const/16 v14, 0x186

    .line 779
    .line 780
    invoke-static {v6, v4, v5, v7, v14}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 781
    .line 782
    .line 783
    invoke-static {v1, v7, v11, v12}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 784
    .line 785
    .line 786
    iget-object v4, v0, Lwb/ic;->k:Li0/a1;

    .line 787
    .line 788
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    check-cast v5, Ljava/lang/String;

    .line 793
    .line 794
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    check-cast v6, Ljava/util/List;

    .line 799
    .line 800
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 801
    .line 802
    .line 803
    move-result v8

    .line 804
    const-string v9, "\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 805
    .line 806
    if-eqz v8, :cond_1a

    .line 807
    .line 808
    move-object v5, v9

    .line 809
    goto :goto_c

    .line 810
    :cond_1a
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    :cond_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 815
    .line 816
    .line 817
    move-result v8

    .line 818
    if-eqz v8, :cond_1c

    .line 819
    .line 820
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v8

    .line 824
    move-object v10, v8

    .line 825
    check-cast v10, Lua/i;

    .line 826
    .line 827
    iget-object v10, v10, Lua/i;->a:Ljava/lang/String;

    .line 828
    .line 829
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v10

    .line 833
    if-eqz v10, :cond_1b

    .line 834
    .line 835
    goto :goto_b

    .line 836
    :cond_1c
    const/4 v8, 0x0

    .line 837
    :goto_b
    check-cast v8, Lua/i;

    .line 838
    .line 839
    if-eqz v8, :cond_1d

    .line 840
    .line 841
    iget-object v5, v8, Lua/i;->b:Ljava/lang/String;

    .line 842
    .line 843
    goto :goto_c

    .line 844
    :cond_1d
    const-string v5, "\u6a21\u677f\u4e0d\u5b58\u5728\uff0c\u4f7f\u7528\u5168\u5c40\u8bbe\u7f6e"

    .line 845
    .line 846
    :goto_c
    new-instance v6, Lwb/dq;

    .line 847
    .line 848
    const-string v8, ""

    .line 849
    .line 850
    invoke-direct {v6, v8, v9}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    invoke-static {v6}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 854
    .line 855
    .line 856
    move-result-object v6

    .line 857
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v8

    .line 861
    check-cast v8, Ljava/util/List;

    .line 862
    .line 863
    new-instance v9, Ljava/util/ArrayList;

    .line 864
    .line 865
    invoke-static {v8}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 866
    .line 867
    .line 868
    move-result v10

    .line 869
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 870
    .line 871
    .line 872
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 873
    .line 874
    .line 875
    move-result-object v8

    .line 876
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 877
    .line 878
    .line 879
    move-result v10

    .line 880
    if-eqz v10, :cond_1e

    .line 881
    .line 882
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v10

    .line 886
    check-cast v10, Lua/i;

    .line 887
    .line 888
    new-instance v15, Lwb/dq;

    .line 889
    .line 890
    iget-object v14, v10, Lua/i;->b:Ljava/lang/String;

    .line 891
    .line 892
    iget-object v10, v10, Lua/i;->a:Ljava/lang/String;

    .line 893
    .line 894
    invoke-direct {v15, v10, v14}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    const/16 v14, 0x186

    .line 901
    .line 902
    goto :goto_d

    .line 903
    :cond_1e
    invoke-static {v6, v9}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 904
    .line 905
    .line 906
    move-result-object v6

    .line 907
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    check-cast v8, Ljava/lang/String;

    .line 912
    .line 913
    invoke-virtual {v7, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    move-result v9

    .line 917
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v10

    .line 921
    iget-object v14, v0, Lwb/ic;->l:Li0/a1;

    .line 922
    .line 923
    if-nez v9, :cond_1f

    .line 924
    .line 925
    if-ne v10, v13, :cond_20

    .line 926
    .line 927
    :cond_1f
    new-instance v10, Lwb/ng;

    .line 928
    .line 929
    invoke-direct {v10, v4, v2, v3, v14}, Lwb/ng;-><init>(Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v7, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    :cond_20
    check-cast v10, Lfg/l;

    .line 936
    .line 937
    const/4 v9, 0x6

    .line 938
    move-object v4, v6

    .line 939
    move-object v6, v10

    .line 940
    const/16 v10, 0x20

    .line 941
    .line 942
    const-string v2, "\u9ed8\u8ba4\u89c4\u5219"

    .line 943
    .line 944
    move-object v3, v5

    .line 945
    move-object v5, v8

    .line 946
    move-object v8, v7

    .line 947
    const/4 v7, 0x0

    .line 948
    invoke-static/range {v2 .. v10}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 949
    .line 950
    .line 951
    move-object v7, v8

    .line 952
    invoke-static {v1, v7, v11, v12}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 953
    .line 954
    .line 955
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    check-cast v2, Ljava/util/List;

    .line 960
    .line 961
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 962
    .line 963
    .line 964
    move-result v2

    .line 965
    if-eqz v2, :cond_21

    .line 966
    .line 967
    const-string v2, "\u6682\u65e0\u5355\u72ec\u914d\u7f6e"

    .line 968
    .line 969
    goto :goto_e

    .line 970
    :cond_21
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    check-cast v2, Ljava/util/List;

    .line 975
    .line 976
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    const-string v3, " \u4e2a\u804a\u5929"

    .line 981
    .line 982
    invoke-static {v2, v3}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    :goto_e
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    if-ne v3, v13, :cond_22

    .line 991
    .line 992
    new-instance v3, Lwb/bf;

    .line 993
    .line 994
    const/16 v4, 0xa

    .line 995
    .line 996
    iget-object v5, v0, Lwb/ic;->m:Li0/a1;

    .line 997
    .line 998
    invoke-direct {v3, v5, v4}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1002
    .line 1003
    .line 1004
    :cond_22
    check-cast v3, Lfg/a;

    .line 1005
    .line 1006
    const-string v4, "\u9002\u7528\u804a\u5929"

    .line 1007
    .line 1008
    const/16 v5, 0x186

    .line 1009
    .line 1010
    invoke-static {v4, v2, v3, v7, v5}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v1, v7, v11, v12}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    if-ne v1, v13, :cond_23

    .line 1021
    .line 1022
    new-instance v1, Lwb/bf;

    .line 1023
    .line 1024
    const/16 v2, 0xb

    .line 1025
    .line 1026
    iget-object v3, v0, Lwb/ic;->n:Li0/a1;

    .line 1027
    .line 1028
    invoke-direct {v1, v3, v2}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v7, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    :cond_23
    check-cast v1, Lfg/a;

    .line 1035
    .line 1036
    const/16 v2, 0x1b6

    .line 1037
    .line 1038
    const-string v3, "\u6279\u91cf\u5957\u7528\u6a21\u677f"

    .line 1039
    .line 1040
    const-string v4, "\u4e00\u6b21\u7ed9\u591a\u4e2a\u804a\u5929\u5206\u914d\u540c\u4e00\u89c4\u5219"

    .line 1041
    .line 1042
    invoke-static {v3, v4, v1, v7, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1043
    .line 1044
    .line 1045
    goto :goto_f

    .line 1046
    :cond_24
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 1047
    .line 1048
    .line 1049
    :goto_f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1050
    .line 1051
    return-object v1

    .line 1052
    nop

    .line 1053
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
