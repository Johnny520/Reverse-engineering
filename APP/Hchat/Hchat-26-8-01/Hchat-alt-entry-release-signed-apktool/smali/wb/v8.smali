.class public final synthetic Lwb/v8;
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


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/v8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/v8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/v8;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/v8;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/v8;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/v8;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/v8;->m:Li0/a1;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/v8;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v8, p1

    .line 9
    .line 10
    check-cast v8, Li0/h0;

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
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v11

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v12

    .line 30
    :goto_0
    and-int/2addr v1, v11

    .line 31
    invoke-virtual {v8, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_a

    .line 36
    .line 37
    iget-object v1, v0, Lwb/v8;->i:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v13, v0, Lwb/v8;->h:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    const/4 v14, 0x0

    .line 52
    sget-object v15, Li0/l;->a:Li0/e;

    .line 53
    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    const v2, 0x329c0375

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, Lwb/v8;->j:Li0/a1;

    .line 63
    .line 64
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v4, v3

    .line 69
    check-cast v4, Ljava/lang/String;

    .line 70
    .line 71
    sget-object v5, Lwb/ho;->k:Ljava/util/List;

    .line 72
    .line 73
    invoke-virtual {v8, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    if-ne v6, v15, :cond_2

    .line 84
    .line 85
    :cond_1
    new-instance v6, Lwb/qg;

    .line 86
    .line 87
    const/4 v3, 0x5

    .line 88
    invoke-direct {v6, v13, v2, v3}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v7, v6

    .line 95
    check-cast v7, Lfg/l;

    .line 96
    .line 97
    const/16 v9, 0x36

    .line 98
    .line 99
    const/16 v10, 0x10

    .line 100
    .line 101
    const-string v2, "\u901a\u77e5\u6807\u9898"

    .line 102
    .line 103
    const-string v3, "\u7559\u7a7a\u4f7f\u7528\u9ed8\u8ba4\u6807\u9898"

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-static/range {v2 .. v10}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 107
    .line 108
    .line 109
    invoke-static {v14, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lwb/v8;->k:Li0/a1;

    .line 113
    .line 114
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    move-object v4, v3

    .line 119
    check-cast v4, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v8, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-nez v3, :cond_3

    .line 130
    .line 131
    if-ne v6, v15, :cond_4

    .line 132
    .line 133
    :cond_3
    new-instance v6, Lwb/qg;

    .line 134
    .line 135
    const/4 v3, 0x6

    .line 136
    invoke-direct {v6, v13, v2, v3}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    move-object v7, v6

    .line 143
    check-cast v7, Lfg/l;

    .line 144
    .line 145
    const/16 v9, 0x6036

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    const-string v2, "\u901a\u77e5\u5185\u5bb9"

    .line 149
    .line 150
    const-string v3, "\u7559\u7a7a\u4f7f\u7528\u53d1\u5e03\u8005\u3001\u7c7b\u578b\u548c\u5b8c\u6574\u6b63\u6587"

    .line 151
    .line 152
    const/4 v6, 0x2

    .line 153
    invoke-static/range {v2 .. v10}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    const v2, 0x32a6b7cf

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 167
    .line 168
    .line 169
    :goto_1
    iget-object v2, v0, Lwb/v8;->l:Li0/a1;

    .line 170
    .line 171
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_9

    .line 182
    .line 183
    const v2, 0x32a7779f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_6

    .line 200
    .line 201
    const v1, 0x2aeca5e1

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v14, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 208
    .line 209
    .line 210
    :goto_2
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    const v1, 0x32a84acf

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :goto_3
    iget-object v1, v0, Lwb/v8;->m:Li0/a1;

    .line 222
    .line 223
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    move-object v4, v2

    .line 228
    check-cast v4, Ljava/lang/String;

    .line 229
    .line 230
    sget-object v5, Lwb/ho;->k:Ljava/util/List;

    .line 231
    .line 232
    invoke-virtual {v8, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    if-nez v2, :cond_7

    .line 241
    .line 242
    if-ne v3, v15, :cond_8

    .line 243
    .line 244
    :cond_7
    new-instance v3, Lwb/qg;

    .line 245
    .line 246
    const/4 v2, 0x7

    .line 247
    invoke-direct {v3, v13, v1, v2}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_8
    move-object v7, v3

    .line 254
    check-cast v7, Lfg/l;

    .line 255
    .line 256
    const/16 v9, 0x6036

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    const-string v2, "Toast\u5185\u5bb9"

    .line 260
    .line 261
    const-string v3, "\u7559\u7a7a\u4f7f\u7528\u9ed8\u8ba4\u63d0\u9192"

    .line 262
    .line 263
    const/4 v6, 0x2

    .line 264
    invoke-static/range {v2 .. v10}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_9
    const v1, 0x32adcd4f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 282
    .line 283
    .line 284
    :goto_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 285
    .line 286
    return-object v1

    .line 287
    :pswitch_0
    move-object/from16 v6, p1

    .line 288
    .line 289
    check-cast v6, Li0/h0;

    .line 290
    .line 291
    move-object/from16 v1, p2

    .line 292
    .line 293
    check-cast v1, Ljava/lang/Integer;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    and-int/lit8 v2, v1, 0x3

    .line 300
    .line 301
    const/4 v3, 0x2

    .line 302
    const/4 v10, 0x0

    .line 303
    const/4 v11, 0x1

    .line 304
    if-eq v2, v3, :cond_b

    .line 305
    .line 306
    move v2, v11

    .line 307
    goto :goto_5

    .line 308
    :cond_b
    move v2, v10

    .line 309
    :goto_5
    and-int/2addr v1, v11

    .line 310
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_18

    .line 315
    .line 316
    iget-object v1, v0, Lwb/v8;->i:Li0/a1;

    .line 317
    .line 318
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Ljava/lang/Number;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-ne v2, v11, :cond_c

    .line 329
    .line 330
    const-string v2, "\u5728\u8303\u56f4\u5185\u968f\u673a\u7b49\u5f85"

    .line 331
    .line 332
    :goto_6
    move-object v3, v2

    .line 333
    goto :goto_7

    .line 334
    :cond_c
    const-string v2, "\u6bcf\u6761\u7b49\u5f85\u56fa\u5b9a\u65f6\u95f4"

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :goto_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    new-instance v4, Lsf/e;

    .line 342
    .line 343
    const-string v5, "\u56fa\u5b9a\u5ef6\u8fdf"

    .line 344
    .line 345
    invoke-direct {v4, v5, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    new-instance v5, Lsf/e;

    .line 353
    .line 354
    const-string v7, "\u968f\u673a\u5ef6\u8fdf"

    .line 355
    .line 356
    invoke-direct {v5, v7, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    filled-new-array {v4, v5}, [Lsf/e;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-static {v2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    check-cast v2, Ljava/lang/Number;

    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    iget-object v12, v0, Lwb/v8;->h:Landroid/content/SharedPreferences;

    .line 378
    .line 379
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    sget-object v13, Li0/l;->a:Li0/e;

    .line 388
    .line 389
    if-nez v2, :cond_d

    .line 390
    .line 391
    if-ne v7, v13, :cond_e

    .line 392
    .line 393
    :cond_d
    new-instance v7, Lwb/qg;

    .line 394
    .line 395
    const/16 v2, 0x8

    .line 396
    .line 397
    invoke-direct {v7, v12, v1, v2}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_e
    check-cast v7, Lfg/l;

    .line 404
    .line 405
    move-object v8, v6

    .line 406
    move-object v6, v7

    .line 407
    const/4 v7, 0x0

    .line 408
    const/4 v9, 0x6

    .line 409
    const-string v2, "\u8f6c\u53d1\u5ef6\u8fdf"

    .line 410
    .line 411
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 412
    .line 413
    .line 414
    move-object v6, v8

    .line 415
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    check-cast v1, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    const/4 v8, 0x0

    .line 426
    if-nez v1, :cond_11

    .line 427
    .line 428
    const v1, -0x2881c9f3

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 432
    .line 433
    .line 434
    invoke-static {v8, v6, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 435
    .line 436
    .line 437
    iget-object v1, v0, Lwb/v8;->j:Li0/a1;

    .line 438
    .line 439
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    move-object v4, v2

    .line 444
    check-cast v4, Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    if-nez v2, :cond_f

    .line 455
    .line 456
    if-ne v3, v13, :cond_10

    .line 457
    .line 458
    :cond_f
    new-instance v3, Lwb/qg;

    .line 459
    .line 460
    const/16 v2, 0x9

    .line 461
    .line 462
    invoke-direct {v3, v1, v12, v2}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :cond_10
    move-object v5, v3

    .line 469
    check-cast v5, Lfg/l;

    .line 470
    .line 471
    const/16 v7, 0x36

    .line 472
    .line 473
    const-string v2, "\u7b49\u5f85\u65f6\u95f4"

    .line 474
    .line 475
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 476
    .line 477
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 481
    .line 482
    .line 483
    goto :goto_8

    .line 484
    :cond_11
    const v1, -0x28772d17

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 488
    .line 489
    .line 490
    invoke-static {v8, v6, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 491
    .line 492
    .line 493
    iget-object v1, v0, Lwb/v8;->k:Li0/a1;

    .line 494
    .line 495
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    move-object v4, v2

    .line 500
    check-cast v4, Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    if-nez v2, :cond_12

    .line 511
    .line 512
    if-ne v3, v13, :cond_13

    .line 513
    .line 514
    :cond_12
    new-instance v3, Lwb/qg;

    .line 515
    .line 516
    const/16 v2, 0xa

    .line 517
    .line 518
    invoke-direct {v3, v1, v12, v2}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    :cond_13
    move-object v5, v3

    .line 525
    check-cast v5, Lfg/l;

    .line 526
    .line 527
    const/16 v7, 0x36

    .line 528
    .line 529
    const-string v2, "\u6700\u77ed\u7b49\u5f85"

    .line 530
    .line 531
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 532
    .line 533
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 534
    .line 535
    .line 536
    invoke-static {v8, v6, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 537
    .line 538
    .line 539
    iget-object v1, v0, Lwb/v8;->l:Li0/a1;

    .line 540
    .line 541
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    move-object v4, v2

    .line 546
    check-cast v4, Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    if-nez v2, :cond_14

    .line 557
    .line 558
    if-ne v3, v13, :cond_15

    .line 559
    .line 560
    :cond_14
    new-instance v3, Lwb/qg;

    .line 561
    .line 562
    const/16 v2, 0xb

    .line 563
    .line 564
    invoke-direct {v3, v1, v12, v2}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    :cond_15
    move-object v5, v3

    .line 571
    check-cast v5, Lfg/l;

    .line 572
    .line 573
    const/16 v7, 0x36

    .line 574
    .line 575
    const-string v2, "\u6700\u957f\u7b49\u5f85"

    .line 576
    .line 577
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u4e0d\u80fd\u5c0f\u4e8e\u6700\u77ed\u7b49\u5f85"

    .line 578
    .line 579
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 583
    .line 584
    .line 585
    :goto_8
    invoke-static {v8, v6, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 586
    .line 587
    .line 588
    iget-object v1, v0, Lwb/v8;->m:Li0/a1;

    .line 589
    .line 590
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    move-object v4, v2

    .line 595
    check-cast v4, Ljava/lang/String;

    .line 596
    .line 597
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    if-nez v2, :cond_16

    .line 606
    .line 607
    if-ne v3, v13, :cond_17

    .line 608
    .line 609
    :cond_16
    new-instance v3, Lwb/qg;

    .line 610
    .line 611
    const/16 v2, 0xc

    .line 612
    .line 613
    invoke-direct {v3, v1, v12, v2}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_17
    move-object v5, v3

    .line 620
    check-cast v5, Lfg/l;

    .line 621
    .line 622
    const/16 v7, 0x36

    .line 623
    .line 624
    const-string v2, "\u6bcf\u65e5\u8f6c\u53d1\u4e0a\u9650"

    .line 625
    .line 626
    const-string v3, "\u6bcf\u5929\u6700\u591a\u8f6c\u53d1\u7684\u670b\u53cb\u5708\u6570\u91cf\uff0c0 \u8868\u793a\u4e0d\u9650\u5236"

    .line 627
    .line 628
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 629
    .line 630
    .line 631
    goto :goto_9

    .line 632
    :cond_18
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 633
    .line 634
    .line 635
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 636
    .line 637
    return-object v1

    .line 638
    :pswitch_1
    move-object/from16 v5, p1

    .line 639
    .line 640
    check-cast v5, Li0/h0;

    .line 641
    .line 642
    move-object/from16 v1, p2

    .line 643
    .line 644
    check-cast v1, Ljava/lang/Integer;

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    and-int/lit8 v2, v1, 0x3

    .line 651
    .line 652
    const/4 v3, 0x2

    .line 653
    const/4 v10, 0x1

    .line 654
    const/4 v11, 0x0

    .line 655
    if-eq v2, v3, :cond_19

    .line 656
    .line 657
    move v2, v10

    .line 658
    goto :goto_a

    .line 659
    :cond_19
    move v2, v11

    .line 660
    :goto_a
    and-int/2addr v1, v10

    .line 661
    invoke-virtual {v5, v1, v2}, Li0/h0;->S(IZ)Z

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    if-eqz v1, :cond_26

    .line 666
    .line 667
    iget-object v1, v0, Lwb/v8;->i:Li0/a1;

    .line 668
    .line 669
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    check-cast v2, Ljava/lang/Boolean;

    .line 674
    .line 675
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    iget-object v12, v0, Lwb/v8;->h:Landroid/content/SharedPreferences;

    .line 680
    .line 681
    invoke-virtual {v5, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    sget-object v13, Li0/l;->a:Li0/e;

    .line 690
    .line 691
    if-nez v3, :cond_1a

    .line 692
    .line 693
    if-ne v4, v13, :cond_1b

    .line 694
    .line 695
    :cond_1a
    new-instance v4, Lwb/me;

    .line 696
    .line 697
    const/4 v3, 0x2

    .line 698
    invoke-direct {v4, v12, v1, v3}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    :cond_1b
    move-object v6, v4

    .line 705
    check-cast v6, Lfg/l;

    .line 706
    .line 707
    const/16 v8, 0x1b0

    .line 708
    .line 709
    const/16 v9, 0x8

    .line 710
    .line 711
    const-string v3, "\u670b\u53cb\u5708\u81ea\u52a8\u5237\u65b0"

    .line 712
    .line 713
    const-string v4, "\u6309\u8bbe\u5b9a\u95f4\u9694\u83b7\u53d6\u65b0\u7684\u670b\u53cb\u5708\u5185\u5bb9"

    .line 714
    .line 715
    move-object v7, v5

    .line 716
    const/4 v5, 0x0

    .line 717
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 718
    .line 719
    .line 720
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    check-cast v1, Ljava/lang/Boolean;

    .line 725
    .line 726
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    if-eqz v1, :cond_25

    .line 731
    .line 732
    const v1, -0x38722b67

    .line 733
    .line 734
    .line 735
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 736
    .line 737
    .line 738
    const/4 v1, 0x0

    .line 739
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 740
    .line 741
    .line 742
    iget-object v2, v0, Lwb/v8;->j:Li0/a1;

    .line 743
    .line 744
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    move-object v4, v3

    .line 749
    check-cast v4, Ljava/lang/String;

    .line 750
    .line 751
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v5

    .line 759
    if-nez v3, :cond_1c

    .line 760
    .line 761
    if-ne v5, v13, :cond_1d

    .line 762
    .line 763
    :cond_1c
    new-instance v5, Lwb/me;

    .line 764
    .line 765
    invoke-direct {v5, v2, v12}, Lwb/me;-><init>(Li0/a1;Landroid/content/SharedPreferences;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    :cond_1d
    check-cast v5, Lfg/l;

    .line 772
    .line 773
    move-object v6, v7

    .line 774
    const/16 v7, 0x36

    .line 775
    .line 776
    const-string v2, "\u5237\u65b0\u95f4\u9694"

    .line 777
    .line 778
    const-string v3, "\u5355\u4f4d\u79d2\uff0c\u6700\u5c11 0 \u79d2"

    .line 779
    .line 780
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 781
    .line 782
    .line 783
    move-object v7, v6

    .line 784
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 785
    .line 786
    .line 787
    iget-object v14, v0, Lwb/v8;->k:Li0/a1;

    .line 788
    .line 789
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    check-cast v2, Ljava/lang/Boolean;

    .line 794
    .line 795
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 796
    .line 797
    .line 798
    move-result v2

    .line 799
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v4

    .line 807
    if-nez v3, :cond_1e

    .line 808
    .line 809
    if-ne v4, v13, :cond_1f

    .line 810
    .line 811
    :cond_1e
    new-instance v4, Lwb/me;

    .line 812
    .line 813
    const/4 v3, 0x4

    .line 814
    invoke-direct {v4, v12, v14, v3}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    :cond_1f
    move-object v6, v4

    .line 821
    check-cast v6, Lfg/l;

    .line 822
    .line 823
    const/16 v8, 0x1b0

    .line 824
    .line 825
    const/16 v9, 0x8

    .line 826
    .line 827
    const-string v3, "\u9650\u5236\u5237\u65b0\u65f6\u6bb5"

    .line 828
    .line 829
    const-string v4, "\u652f\u6301\u8de8\u96f6\u70b9\u65f6\u6bb5"

    .line 830
    .line 831
    const/4 v5, 0x0

    .line 832
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 833
    .line 834
    .line 835
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    check-cast v2, Ljava/lang/Boolean;

    .line 840
    .line 841
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    if-eqz v2, :cond_24

    .line 846
    .line 847
    const v2, -0x38676e74

    .line 848
    .line 849
    .line 850
    invoke-virtual {v7, v2}, Li0/h0;->a0(I)V

    .line 851
    .line 852
    .line 853
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 854
    .line 855
    .line 856
    iget-object v2, v0, Lwb/v8;->l:Li0/a1;

    .line 857
    .line 858
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v3

    .line 862
    check-cast v3, Ljava/lang/String;

    .line 863
    .line 864
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    if-nez v4, :cond_20

    .line 873
    .line 874
    if-ne v5, v13, :cond_21

    .line 875
    .line 876
    :cond_20
    new-instance v5, Lwb/me;

    .line 877
    .line 878
    const/4 v4, 0x5

    .line 879
    invoke-direct {v5, v12, v2, v4}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    :cond_21
    move-object v4, v5

    .line 886
    check-cast v4, Lfg/l;

    .line 887
    .line 888
    const/4 v2, 0x6

    .line 889
    move-object v5, v7

    .line 890
    move-object v7, v3

    .line 891
    const/4 v3, 0x4

    .line 892
    const-string v6, "\u5f00\u59cb\u65f6\u95f4"

    .line 893
    .line 894
    const/4 v8, 0x0

    .line 895
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 896
    .line 897
    .line 898
    move-object v7, v5

    .line 899
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 900
    .line 901
    .line 902
    iget-object v1, v0, Lwb/v8;->m:Li0/a1;

    .line 903
    .line 904
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    check-cast v2, Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v4

    .line 918
    if-nez v3, :cond_22

    .line 919
    .line 920
    if-ne v4, v13, :cond_23

    .line 921
    .line 922
    :cond_22
    new-instance v4, Lwb/me;

    .line 923
    .line 924
    const/4 v3, 0x6

    .line 925
    invoke-direct {v4, v12, v1, v3}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 926
    .line 927
    .line 928
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    :cond_23
    check-cast v4, Lfg/l;

    .line 932
    .line 933
    move-object v5, v7

    .line 934
    move-object v7, v2

    .line 935
    const/4 v2, 0x6

    .line 936
    const/4 v3, 0x4

    .line 937
    const-string v6, "\u7ed3\u675f\u65f6\u95f4"

    .line 938
    .line 939
    const/4 v8, 0x0

    .line 940
    invoke-static/range {v2 .. v8}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 941
    .line 942
    .line 943
    move-object v7, v5

    .line 944
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 945
    .line 946
    .line 947
    goto :goto_b

    .line 948
    :cond_24
    const v1, -0x385e78d1

    .line 949
    .line 950
    .line 951
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 955
    .line 956
    .line 957
    :goto_b
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 958
    .line 959
    .line 960
    goto :goto_c

    .line 961
    :cond_25
    const v1, -0x385e2391

    .line 962
    .line 963
    .line 964
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 968
    .line 969
    .line 970
    goto :goto_c

    .line 971
    :cond_26
    move-object v7, v5

    .line 972
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 973
    .line 974
    .line 975
    :goto_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 976
    .line 977
    return-object v1

    .line 978
    nop

    .line 979
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
