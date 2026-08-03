.class public final synthetic Lwb/jg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/jg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/jg;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/jg;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/jg;->j:Lfg/l;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/jg;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/jg;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/jg;->g:I

    .line 4
    .line 5
    move-object/from16 v6, p1

    .line 6
    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v11

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v10

    .line 30
    :goto_0
    and-int/2addr v1, v11

    .line 31
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_9

    .line 36
    .line 37
    iget-object v1, v0, Lwb/jg;->k:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v2, v11, :cond_1

    .line 50
    .line 51
    const-string v2, "\u9664\u9ed1\u540d\u5355\u5916\u5747\u53ef\u8bc4\u8bba"

    .line 52
    .line 53
    :goto_1
    move-object v3, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    const-string v2, "\u53ea\u8bc4\u8bba\u767d\u540d\u5355\u597d\u53cb"

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :goto_2
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v4, Lsf/e;

    .line 63
    .line 64
    const-string v12, "\u767d\u540d\u5355"

    .line 65
    .line 66
    invoke-direct {v4, v12, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v5, Lsf/e;

    .line 74
    .line 75
    const-string v13, "\u9ed1\u540d\u5355"

    .line 76
    .line 77
    invoke-direct {v5, v13, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v4, v5}, [Lsf/e;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    iget-object v14, v0, Lwb/jg;->h:Landroid/content/SharedPreferences;

    .line 99
    .line 100
    invoke-virtual {v6, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    sget-object v15, Li0/l;->a:Li0/e;

    .line 109
    .line 110
    if-nez v2, :cond_2

    .line 111
    .line 112
    if-ne v7, v15, :cond_3

    .line 113
    .line 114
    :cond_2
    new-instance v7, Lwb/di;

    .line 115
    .line 116
    const/16 v2, 0x1c

    .line 117
    .line 118
    invoke-direct {v7, v14, v1, v2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    check-cast v7, Lfg/l;

    .line 125
    .line 126
    move-object v8, v6

    .line 127
    move-object v6, v7

    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v9, 0x6

    .line 130
    const-string v2, "\u540d\u5355\u6a21\u5f0f"

    .line 131
    .line 132
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 133
    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-static {v2, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-ne v3, v11, :cond_4

    .line 150
    .line 151
    move-object v12, v13

    .line 152
    :cond_4
    iget-object v3, v0, Lwb/jg;->j:Lfg/l;

    .line 153
    .line 154
    invoke-virtual {v8, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-nez v4, :cond_5

    .line 163
    .line 164
    if-ne v5, v15, :cond_6

    .line 165
    .line 166
    :cond_5
    new-instance v5, Lwb/o1;

    .line 167
    .line 168
    const/16 v4, 0xc

    .line 169
    .line 170
    invoke-direct {v5, v3, v1, v4}, Lwb/o1;-><init>(Lfg/l;Li0/a1;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_6
    check-cast v5, Lfg/a;

    .line 177
    .line 178
    iget-object v1, v0, Lwb/jg;->i:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v12, v1, v5, v8, v10}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v2, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v0, Lwb/jg;->l:Li0/a1;

    .line 187
    .line 188
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    move-object v4, v2

    .line 193
    check-cast v4, Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v8, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-nez v2, :cond_7

    .line 204
    .line 205
    if-ne v3, v15, :cond_8

    .line 206
    .line 207
    :cond_7
    new-instance v3, Lwb/di;

    .line 208
    .line 209
    const/16 v2, 0x1d

    .line 210
    .line 211
    invoke-direct {v3, v1, v14, v2}, Lwb/di;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_8
    move-object v5, v3

    .line 218
    check-cast v5, Lfg/l;

    .line 219
    .line 220
    const/16 v7, 0x36

    .line 221
    .line 222
    const-string v2, "\u540c\u4e00\u4eba\u6bcf\u5929\u8bc4\u8bba\u6570\u91cf"

    .line 223
    .line 224
    const-string v3, "\u6bcf\u5929\u6700\u591a\u8bc4\u8bba\u540c\u4e00\u4eba\u7684\u670b\u53cb\u5708\u6761\u6570\uff0c0 \u8868\u793a\u4e0d\u9650\u5236"

    .line 225
    .line 226
    move-object v6, v8

    .line 227
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_9
    move-object v8, v6

    .line 232
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 233
    .line 234
    .line 235
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 236
    .line 237
    return-object v1

    .line 238
    :pswitch_0
    move-object/from16 v1, p2

    .line 239
    .line 240
    check-cast v1, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    and-int/lit8 v2, v1, 0x3

    .line 247
    .line 248
    const/4 v3, 0x2

    .line 249
    const/4 v10, 0x0

    .line 250
    const/4 v11, 0x1

    .line 251
    if-eq v2, v3, :cond_a

    .line 252
    .line 253
    move v2, v11

    .line 254
    goto :goto_4

    .line 255
    :cond_a
    move v2, v10

    .line 256
    :goto_4
    and-int/2addr v1, v11

    .line 257
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_13

    .line 262
    .line 263
    iget-object v1, v0, Lwb/jg;->k:Li0/a1;

    .line 264
    .line 265
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, Ljava/lang/Number;

    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-ne v2, v11, :cond_b

    .line 276
    .line 277
    const-string v2, "\u9664\u9ed1\u540d\u5355\u5916\u5747\u53ef\u70b9\u8d5e"

    .line 278
    .line 279
    :goto_5
    move-object v3, v2

    .line 280
    goto :goto_6

    .line 281
    :cond_b
    const-string v2, "\u53ea\u70b9\u8d5e\u767d\u540d\u5355\u597d\u53cb"

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :goto_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    new-instance v4, Lsf/e;

    .line 289
    .line 290
    const-string v12, "\u767d\u540d\u5355"

    .line 291
    .line 292
    invoke-direct {v4, v12, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    new-instance v5, Lsf/e;

    .line 300
    .line 301
    const-string v13, "\u9ed1\u540d\u5355"

    .line 302
    .line 303
    invoke-direct {v5, v13, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    filled-new-array {v4, v5}, [Lsf/e;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    check-cast v2, Ljava/lang/Number;

    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    iget-object v14, v0, Lwb/jg;->h:Landroid/content/SharedPreferences;

    .line 325
    .line 326
    invoke-virtual {v6, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    sget-object v15, Li0/l;->a:Li0/e;

    .line 335
    .line 336
    if-nez v2, :cond_c

    .line 337
    .line 338
    if-ne v7, v15, :cond_d

    .line 339
    .line 340
    :cond_c
    new-instance v7, Lwb/qg;

    .line 341
    .line 342
    const/16 v2, 0x16

    .line 343
    .line 344
    invoke-direct {v7, v14, v1, v2}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_d
    check-cast v7, Lfg/l;

    .line 351
    .line 352
    move-object v8, v6

    .line 353
    move-object v6, v7

    .line 354
    const/4 v7, 0x0

    .line 355
    const/4 v9, 0x6

    .line 356
    const-string v2, "\u540d\u5355\u6a21\u5f0f"

    .line 357
    .line 358
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 359
    .line 360
    .line 361
    const/4 v2, 0x0

    .line 362
    invoke-static {v2, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    check-cast v3, Ljava/lang/Number;

    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-ne v3, v11, :cond_e

    .line 376
    .line 377
    move-object v12, v13

    .line 378
    :cond_e
    iget-object v3, v0, Lwb/jg;->j:Lfg/l;

    .line 379
    .line 380
    invoke-virtual {v8, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    if-nez v4, :cond_f

    .line 389
    .line 390
    if-ne v5, v15, :cond_10

    .line 391
    .line 392
    :cond_f
    new-instance v5, Lwb/o1;

    .line 393
    .line 394
    const/16 v4, 0x8

    .line 395
    .line 396
    invoke-direct {v5, v3, v1, v4}, Lwb/o1;-><init>(Lfg/l;Li0/a1;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v8, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_10
    check-cast v5, Lfg/a;

    .line 403
    .line 404
    iget-object v1, v0, Lwb/jg;->i:Ljava/lang/String;

    .line 405
    .line 406
    invoke-static {v12, v1, v5, v8, v10}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 407
    .line 408
    .line 409
    invoke-static {v2, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 410
    .line 411
    .line 412
    iget-object v1, v0, Lwb/jg;->l:Li0/a1;

    .line 413
    .line 414
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    move-object v4, v2

    .line 419
    check-cast v4, Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v8, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    if-nez v2, :cond_11

    .line 430
    .line 431
    if-ne v3, v15, :cond_12

    .line 432
    .line 433
    :cond_11
    new-instance v3, Lwb/qg;

    .line 434
    .line 435
    const/16 v2, 0x17

    .line 436
    .line 437
    invoke-direct {v3, v1, v14, v2}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_12
    move-object v5, v3

    .line 444
    check-cast v5, Lfg/l;

    .line 445
    .line 446
    const/16 v7, 0x36

    .line 447
    .line 448
    const-string v2, "\u540c\u4e00\u4eba\u6bcf\u5929\u70b9\u8d5e\u6570\u91cf"

    .line 449
    .line 450
    const-string v3, "\u6bcf\u5929\u6700\u591a\u70b9\u8d5e\u540c\u4e00\u4eba\u7684\u670b\u53cb\u5708\u6761\u6570\uff0c0 \u8868\u793a\u4e0d\u9650\u5236"

    .line 451
    .line 452
    move-object v6, v8

    .line 453
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 454
    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_13
    move-object v8, v6

    .line 458
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 459
    .line 460
    .line 461
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 462
    .line 463
    return-object v1

    .line 464
    nop

    .line 465
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
