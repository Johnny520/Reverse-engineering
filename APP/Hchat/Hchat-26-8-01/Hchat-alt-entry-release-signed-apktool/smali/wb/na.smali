.class public final synthetic Lwb/na;
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


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/na;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/na;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/na;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/na;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/na;->l:Li0/a1;

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
    .locals 13

    .line 1
    iget v0, p0, Lwb/na;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v10

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v11

    .line 25
    :goto_0
    and-int/2addr p1, v10

    .line 26
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_f

    .line 31
    .line 32
    iget-object p1, p0, Lwb/na;->i:Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object p2, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v12, Li0/l;->a:Li0/e;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    if-ne v2, v12, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v2, Lwb/jo;

    .line 61
    .line 62
    const/16 v0, 0xa

    .line 63
    .line 64
    invoke-direct {v2, p2, p1, v0}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    move-object v5, v2

    .line 71
    check-cast v5, Lfg/l;

    .line 72
    .line 73
    const/16 v7, 0x1b0

    .line 74
    .line 75
    const/16 v8, 0x8

    .line 76
    .line 77
    const-string v2, "\u670b\u53cb\u5708\u81ea\u52a8\u8bc4\u8bba"

    .line 78
    .line 79
    const-string v3, "\u6309\u4e0b\u65b9\u89c4\u5219\u5904\u7406\u65b0\u83b7\u53d6\u7684\u670b\u53cb\u5708"

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_e

    .line 96
    .line 97
    const p1, 0x45d68634

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    invoke-static {p1, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lwb/na;->j:Li0/a1;

    .line 108
    .line 109
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    const-string v1, "\u9700\u8981\u586b\u5199"

    .line 122
    .line 123
    :goto_1
    move-object v2, v1

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    const-string v1, "\u70b9\u51fb\u4e0b\u65b9\u4e2d\u6587\u53d8\u91cf\u63d2\u5165\u5230\u5149\u6807\u4f4d\u7f6e"

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_2
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v3, v1

    .line 133
    check-cast v3, Ljava/lang/String;

    .line 134
    .line 135
    sget-object v4, Lwb/ho;->l:Ljava/util/List;

    .line 136
    .line 137
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    if-ne v5, v12, :cond_5

    .line 148
    .line 149
    :cond_4
    new-instance v5, Lwb/jo;

    .line 150
    .line 151
    const/16 v1, 0xb

    .line 152
    .line 153
    invoke-direct {v5, p2, v0, v1}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    check-cast v5, Lfg/l;

    .line 160
    .line 161
    const/16 v8, 0x6006

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    const-string v1, "\u8bc4\u8bba\u5185\u5bb9"

    .line 165
    .line 166
    move-object v7, v6

    .line 167
    move-object v6, v5

    .line 168
    const/4 v5, 0x3

    .line 169
    invoke-static/range {v1 .. v9}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 170
    .line 171
    .line 172
    move-object v6, v7

    .line 173
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/String;

    .line 178
    .line 179
    const-string v1, "${time}"

    .line 180
    .line 181
    invoke-static {v0, v1, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    const v0, 0x45e09489

    .line 188
    .line 189
    .line 190
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 191
    .line 192
    .line 193
    invoke-static {p1, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, Lwb/na;->k:Li0/a1;

    .line 197
    .line 198
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/String;

    .line 203
    .line 204
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 205
    .line 206
    if-nez v0, :cond_6

    .line 207
    .line 208
    const-string v0, ""

    .line 209
    .line 210
    :cond_6
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_7

    .line 223
    .line 224
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 225
    .line 226
    :cond_7
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-direct {v2, v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :catchall_0
    move-exception v0

    .line 235
    new-instance v2, Lsf/f;

    .line 236
    .line 237
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    :goto_3
    instance-of v0, v2, Lsf/f;

    .line 241
    .line 242
    if-nez v0, :cond_8

    .line 243
    .line 244
    const-string v0, "\u4f8b\u5982 HH:mm:ss \u6216 yyyy-MM-dd HH:mm:ss"

    .line 245
    .line 246
    :goto_4
    move-object v2, v0

    .line 247
    goto :goto_5

    .line 248
    :cond_8
    const-string v0, "\u683c\u5f0f\u65e0\u6548\uff0c\u5f53\u524d\u8f93\u5165\u4e0d\u4f1a\u4fdd\u5b58"

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :goto_5
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    move-object v3, v0

    .line 256
    check-cast v3, Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-nez v0, :cond_9

    .line 267
    .line 268
    if-ne v4, v12, :cond_a

    .line 269
    .line 270
    :cond_9
    new-instance v4, Lwb/jo;

    .line 271
    .line 272
    const/16 v0, 0xc

    .line 273
    .line 274
    invoke-direct {v4, p2, v1, v0}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_a
    move-object v5, v4

    .line 281
    check-cast v5, Lfg/l;

    .line 282
    .line 283
    const/4 v7, 0x6

    .line 284
    const/16 v8, 0x8

    .line 285
    .line 286
    const-string v1, "\u65f6\u95f4\u53d8\u91cf\u683c\u5f0f"

    .line 287
    .line 288
    const/4 v4, 0x0

    .line 289
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_b
    const v0, 0x45ef9c4a

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 303
    .line 304
    .line 305
    :goto_6
    invoke-static {p1, v6, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 306
    .line 307
    .line 308
    iget-object p1, p0, Lwb/na;->l:Li0/a1;

    .line 309
    .line 310
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-nez v0, :cond_c

    .line 329
    .line 330
    if-ne v2, v12, :cond_d

    .line 331
    .line 332
    :cond_c
    new-instance v2, Lwb/jo;

    .line 333
    .line 334
    const/16 v0, 0xd

    .line 335
    .line 336
    invoke-direct {v2, p2, p1, v0}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_d
    move-object v5, v2

    .line 343
    check-cast v5, Lfg/l;

    .line 344
    .line 345
    const/16 v7, 0x1b0

    .line 346
    .line 347
    const/16 v8, 0x8

    .line 348
    .line 349
    const-string v2, "\u8bc4\u8bba\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    .line 350
    .line 351
    const-string v3, "\u81ea\u5df1\u7684\u670b\u53cb\u5708\u4e0d\u53d7\u597d\u53cb\u540d\u5355\u9650\u5236"

    .line 352
    .line 353
    const/4 v4, 0x0

    .line 354
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 358
    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    const p1, 0x45f468aa

    .line 362
    .line 363
    .line 364
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v6, v11}, Li0/h0;->p(Z)V

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 372
    .line 373
    .line 374
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 375
    .line 376
    return-object p1

    .line 377
    :pswitch_0
    move-object v5, p1

    .line 378
    check-cast v5, Li0/h0;

    .line 379
    .line 380
    check-cast p2, Ljava/lang/Integer;

    .line 381
    .line 382
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    and-int/lit8 p2, p1, 0x3

    .line 387
    .line 388
    const/4 v0, 0x2

    .line 389
    const/4 v8, 0x0

    .line 390
    const/4 v9, 0x1

    .line 391
    if-eq p2, v0, :cond_10

    .line 392
    .line 393
    move p2, v9

    .line 394
    goto :goto_8

    .line 395
    :cond_10
    move p2, v8

    .line 396
    :goto_8
    and-int/2addr p1, v9

    .line 397
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-eqz p1, :cond_19

    .line 402
    .line 403
    iget-object p1, p0, Lwb/na;->i:Li0/a1;

    .line 404
    .line 405
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p2

    .line 409
    check-cast p2, Ljava/lang/Boolean;

    .line 410
    .line 411
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    iget-object p2, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 416
    .line 417
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    sget-object v10, Li0/l;->a:Li0/e;

    .line 426
    .line 427
    if-nez v1, :cond_11

    .line 428
    .line 429
    if-ne v2, v10, :cond_12

    .line 430
    .line 431
    :cond_11
    new-instance v2, Lwb/qg;

    .line 432
    .line 433
    const/4 v1, 0x1

    .line 434
    invoke-direct {v2, p2, p1, v1}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    :cond_12
    move-object v4, v2

    .line 441
    check-cast v4, Lfg/l;

    .line 442
    .line 443
    const/16 v6, 0x1b0

    .line 444
    .line 445
    const/16 v7, 0x8

    .line 446
    .line 447
    const-string v1, "\u6587\u5b57"

    .line 448
    .line 449
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u8f6c\u53d1"

    .line 450
    .line 451
    const/4 v3, 0x0

    .line 452
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 453
    .line 454
    .line 455
    const/4 p1, 0x0

    .line 456
    invoke-static {p1, v5, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 457
    .line 458
    .line 459
    iget-object v0, p0, Lwb/na;->j:Li0/a1;

    .line 460
    .line 461
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Ljava/lang/Boolean;

    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    if-nez v2, :cond_13

    .line 480
    .line 481
    if-ne v3, v10, :cond_14

    .line 482
    .line 483
    :cond_13
    new-instance v3, Lwb/qg;

    .line 484
    .line 485
    const/4 v2, 0x2

    .line 486
    invoke-direct {v3, p2, v0, v2}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    :cond_14
    move-object v4, v3

    .line 493
    check-cast v4, Lfg/l;

    .line 494
    .line 495
    const/16 v6, 0x1b0

    .line 496
    .line 497
    const/16 v7, 0x8

    .line 498
    .line 499
    move v0, v1

    .line 500
    const-string v1, "\u56fe\u7247/\u56fe\u6587"

    .line 501
    .line 502
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u8f6c\u53d1"

    .line 503
    .line 504
    const/4 v3, 0x0

    .line 505
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 506
    .line 507
    .line 508
    invoke-static {p1, v5, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 509
    .line 510
    .line 511
    iget-object v0, p0, Lwb/na;->k:Li0/a1;

    .line 512
    .line 513
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    check-cast v1, Ljava/lang/Boolean;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 520
    .line 521
    .line 522
    move-result v1

    .line 523
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    if-nez v2, :cond_15

    .line 532
    .line 533
    if-ne v3, v10, :cond_16

    .line 534
    .line 535
    :cond_15
    new-instance v3, Lwb/qg;

    .line 536
    .line 537
    const/4 v2, 0x3

    .line 538
    invoke-direct {v3, p2, v0, v2}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_16
    move-object v4, v3

    .line 545
    check-cast v4, Lfg/l;

    .line 546
    .line 547
    const/16 v6, 0x1b0

    .line 548
    .line 549
    const/16 v7, 0x8

    .line 550
    .line 551
    move v0, v1

    .line 552
    const-string v1, "\u89c6\u9891/\u89c6\u6587"

    .line 553
    .line 554
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u8f6c\u53d1"

    .line 555
    .line 556
    const/4 v3, 0x0

    .line 557
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 558
    .line 559
    .line 560
    invoke-static {p1, v5, v8, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 561
    .line 562
    .line 563
    iget-object p1, p0, Lwb/na;->l:Li0/a1;

    .line 564
    .line 565
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/lang/Boolean;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    if-nez v1, :cond_17

    .line 584
    .line 585
    if-ne v2, v10, :cond_18

    .line 586
    .line 587
    :cond_17
    new-instance v2, Lwb/qg;

    .line 588
    .line 589
    const/4 v1, 0x4

    .line 590
    invoke-direct {v2, p2, p1, v1}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    :cond_18
    move-object v4, v2

    .line 597
    check-cast v4, Lfg/l;

    .line 598
    .line 599
    const/16 v6, 0x1b0

    .line 600
    .line 601
    const/16 v7, 0x8

    .line 602
    .line 603
    const-string v1, "\u5b9e\u51b5\u7167\u7247"

    .line 604
    .line 605
    const-string v2, "\u5141\u8bb8\u81ea\u52a8\u8f6c\u53d1"

    .line 606
    .line 607
    const/4 v3, 0x0

    .line 608
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 609
    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_19
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 613
    .line 614
    .line 615
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 616
    .line 617
    return-object p1

    .line 618
    :pswitch_1
    move-object v4, p1

    .line 619
    check-cast v4, Li0/h0;

    .line 620
    .line 621
    check-cast p2, Ljava/lang/Integer;

    .line 622
    .line 623
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    and-int/lit8 p2, p1, 0x3

    .line 628
    .line 629
    const/4 v0, 0x2

    .line 630
    const/4 v6, 0x0

    .line 631
    const/4 v7, 0x1

    .line 632
    if-eq p2, v0, :cond_1a

    .line 633
    .line 634
    move p2, v7

    .line 635
    goto :goto_a

    .line 636
    :cond_1a
    move p2, v6

    .line 637
    :goto_a
    and-int/2addr p1, v7

    .line 638
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 639
    .line 640
    .line 641
    move-result p1

    .line 642
    if-eqz p1, :cond_23

    .line 643
    .line 644
    iget-object p1, p0, Lwb/na;->i:Li0/a1;

    .line 645
    .line 646
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object p2

    .line 650
    move-object v2, p2

    .line 651
    check-cast v2, Ljava/lang/String;

    .line 652
    .line 653
    iget-object p2, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 654
    .line 655
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    sget-object v8, Li0/l;->a:Li0/e;

    .line 664
    .line 665
    if-nez v0, :cond_1b

    .line 666
    .line 667
    if-ne v1, v8, :cond_1c

    .line 668
    .line 669
    :cond_1b
    new-instance v1, Lwb/qg;

    .line 670
    .line 671
    const/16 v0, 0x18

    .line 672
    .line 673
    invoke-direct {v1, p1, p2, v0}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v4, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    :cond_1c
    move-object v3, v1

    .line 680
    check-cast v3, Lfg/l;

    .line 681
    .line 682
    const/16 v5, 0x36

    .line 683
    .line 684
    const-string v0, "\u6700\u5c0f\u95f4\u9694"

    .line 685
    .line 686
    const-string v1, "\u5355\u4f4d\u79d2\uff0c0-60"

    .line 687
    .line 688
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 689
    .line 690
    .line 691
    const/4 p1, 0x0

    .line 692
    invoke-static {p1, v4, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 693
    .line 694
    .line 695
    iget-object v0, p0, Lwb/na;->j:Li0/a1;

    .line 696
    .line 697
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    move-object v2, v1

    .line 702
    check-cast v2, Ljava/lang/String;

    .line 703
    .line 704
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    if-nez v1, :cond_1d

    .line 713
    .line 714
    if-ne v3, v8, :cond_1e

    .line 715
    .line 716
    :cond_1d
    new-instance v3, Lwb/qg;

    .line 717
    .line 718
    const/16 v1, 0x19

    .line 719
    .line 720
    invoke-direct {v3, v0, p2, v1}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    :cond_1e
    check-cast v3, Lfg/l;

    .line 727
    .line 728
    const/16 v5, 0x36

    .line 729
    .line 730
    const-string v0, "\u6700\u5927\u95f4\u9694"

    .line 731
    .line 732
    const-string v1, "\u5355\u4f4d\u79d2\uff0c0-120"

    .line 733
    .line 734
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 735
    .line 736
    .line 737
    invoke-static {p1, v4, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 738
    .line 739
    .line 740
    iget-object v0, p0, Lwb/na;->k:Li0/a1;

    .line 741
    .line 742
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    move-object v2, v1

    .line 747
    check-cast v2, Ljava/lang/String;

    .line 748
    .line 749
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    if-nez v1, :cond_1f

    .line 758
    .line 759
    if-ne v3, v8, :cond_20

    .line 760
    .line 761
    :cond_1f
    new-instance v3, Lwb/qg;

    .line 762
    .line 763
    const/16 v1, 0x1a

    .line 764
    .line 765
    invoke-direct {v3, v0, p2, v1}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    :cond_20
    check-cast v3, Lfg/l;

    .line 772
    .line 773
    const/16 v5, 0x36

    .line 774
    .line 775
    const-string v0, "\u8bf7\u6c42\u8d85\u65f6"

    .line 776
    .line 777
    const-string v1, "\u5355\u4f4d\u79d2\uff0c5-60"

    .line 778
    .line 779
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 780
    .line 781
    .line 782
    invoke-static {p1, v4, v6, v7}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 783
    .line 784
    .line 785
    iget-object p1, p0, Lwb/na;->l:Li0/a1;

    .line 786
    .line 787
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    move-object v2, v0

    .line 792
    check-cast v2, Ljava/lang/String;

    .line 793
    .line 794
    invoke-virtual {v4, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    if-nez v0, :cond_21

    .line 803
    .line 804
    if-ne v1, v8, :cond_22

    .line 805
    .line 806
    :cond_21
    new-instance v1, Lwb/qg;

    .line 807
    .line 808
    const/16 v0, 0x1b

    .line 809
    .line 810
    invoke-direct {v1, p1, p2, v0}, Lwb/qg;-><init>(Li0/a1;Landroid/content/SharedPreferences;I)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v4, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    :cond_22
    move-object v3, v1

    .line 817
    check-cast v3, Lfg/l;

    .line 818
    .line 819
    const/16 v5, 0x36

    .line 820
    .line 821
    const-string v0, "\u8d85\u65f6\u91cd\u8bd5"

    .line 822
    .line 823
    const-string v1, "\u6bcf\u4f4d\u597d\u53cb\u6700\u591a\u91cd\u8bd5 0-5 \u6b21"

    .line 824
    .line 825
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 826
    .line 827
    .line 828
    goto :goto_b

    .line 829
    :cond_23
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 830
    .line 831
    .line 832
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 833
    .line 834
    return-object p1

    .line 835
    :pswitch_2
    move-object v5, p1

    .line 836
    check-cast v5, Li0/h0;

    .line 837
    .line 838
    check-cast p2, Ljava/lang/Integer;

    .line 839
    .line 840
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 841
    .line 842
    .line 843
    move-result p1

    .line 844
    and-int/lit8 p2, p1, 0x3

    .line 845
    .line 846
    const/4 v0, 0x2

    .line 847
    const/4 v8, 0x1

    .line 848
    const/4 v9, 0x0

    .line 849
    if-eq p2, v0, :cond_24

    .line 850
    .line 851
    move p2, v8

    .line 852
    goto :goto_c

    .line 853
    :cond_24
    move p2, v9

    .line 854
    :goto_c
    and-int/2addr p1, v8

    .line 855
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 856
    .line 857
    .line 858
    move-result p1

    .line 859
    if-eqz p1, :cond_2a

    .line 860
    .line 861
    iget-object p1, p0, Lwb/na;->i:Li0/a1;

    .line 862
    .line 863
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object p2

    .line 867
    check-cast p2, Ljava/lang/Boolean;

    .line 868
    .line 869
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    iget-object p2, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 874
    .line 875
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    sget-object v10, Li0/l;->a:Li0/e;

    .line 884
    .line 885
    if-nez v1, :cond_25

    .line 886
    .line 887
    if-ne v2, v10, :cond_26

    .line 888
    .line 889
    :cond_25
    new-instance v2, Lwb/me;

    .line 890
    .line 891
    const/16 v1, 0xc

    .line 892
    .line 893
    invoke-direct {v2, p2, p1, v1}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    :cond_26
    move-object v4, v2

    .line 900
    check-cast v4, Lfg/l;

    .line 901
    .line 902
    const/16 v6, 0x1b0

    .line 903
    .line 904
    const/16 v7, 0x8

    .line 905
    .line 906
    const-string v1, "\u62a2\u5230\u540e\u81ea\u52a8\u56de\u590d"

    .line 907
    .line 908
    const-string v2, "\u53d1\u9001\u5230\u7ea2\u5305\u6240\u5728\u4f1a\u8bdd"

    .line 909
    .line 910
    const/4 v3, 0x0

    .line 911
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 912
    .line 913
    .line 914
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object p1

    .line 918
    check-cast p1, Ljava/lang/Boolean;

    .line 919
    .line 920
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 921
    .line 922
    .line 923
    move-result p1

    .line 924
    if-eqz p1, :cond_29

    .line 925
    .line 926
    const p1, 0x2921d57a

    .line 927
    .line 928
    .line 929
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 930
    .line 931
    .line 932
    const/4 p1, 0x0

    .line 933
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 934
    .line 935
    .line 936
    iget-object p2, p0, Lwb/na;->j:Li0/a1;

    .line 937
    .line 938
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object p2

    .line 942
    check-cast p2, Ljava/util/List;

    .line 943
    .line 944
    invoke-static {p2}, Lwb/ho;->t5(Ljava/util/List;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object p2

    .line 948
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    iget-object v1, p0, Lwb/na;->k:Li0/a1;

    .line 953
    .line 954
    if-ne v0, v10, :cond_27

    .line 955
    .line 956
    new-instance v0, Lwb/bf;

    .line 957
    .line 958
    const/4 v2, 0x1

    .line 959
    invoke-direct {v0, v1, v2}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    :cond_27
    check-cast v0, Lfg/a;

    .line 966
    .line 967
    const-string v2, "\u79c1\u804a\u7ea2\u5305\u56de\u590d"

    .line 968
    .line 969
    const/16 v3, 0x186

    .line 970
    .line 971
    invoke-static {v2, p2, v0, v5, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 972
    .line 973
    .line 974
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 975
    .line 976
    .line 977
    iget-object p1, p0, Lwb/na;->l:Li0/a1;

    .line 978
    .line 979
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object p1

    .line 983
    check-cast p1, Ljava/util/List;

    .line 984
    .line 985
    invoke-static {p1}, Lwb/ho;->t5(Ljava/util/List;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object p1

    .line 989
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object p2

    .line 993
    if-ne p2, v10, :cond_28

    .line 994
    .line 995
    new-instance p2, Lwb/bf;

    .line 996
    .line 997
    const/4 v0, 0x2

    .line 998
    invoke-direct {p2, v1, v0}, Lwb/bf;-><init>(Li0/a1;I)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1002
    .line 1003
    .line 1004
    :cond_28
    check-cast p2, Lfg/a;

    .line 1005
    .line 1006
    const-string v0, "\u7fa4\u7ea2\u5305\u56de\u590d"

    .line 1007
    .line 1008
    invoke-static {v0, p1, p2, v5, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_d

    .line 1015
    :cond_29
    const p1, 0x292b2535

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1022
    .line 1023
    .line 1024
    goto :goto_d

    .line 1025
    :cond_2a
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1026
    .line 1027
    .line 1028
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1029
    .line 1030
    return-object p1

    .line 1031
    :pswitch_3
    move-object v5, p1

    .line 1032
    check-cast v5, Li0/h0;

    .line 1033
    .line 1034
    check-cast p2, Ljava/lang/Integer;

    .line 1035
    .line 1036
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1037
    .line 1038
    .line 1039
    move-result p1

    .line 1040
    and-int/lit8 p2, p1, 0x3

    .line 1041
    .line 1042
    const/4 v0, 0x2

    .line 1043
    const/4 v8, 0x1

    .line 1044
    const/4 v9, 0x0

    .line 1045
    if-eq p2, v0, :cond_2b

    .line 1046
    .line 1047
    move p2, v8

    .line 1048
    goto :goto_e

    .line 1049
    :cond_2b
    move p2, v9

    .line 1050
    :goto_e
    and-int/2addr p1, v8

    .line 1051
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1052
    .line 1053
    .line 1054
    move-result p1

    .line 1055
    if-eqz p1, :cond_32

    .line 1056
    .line 1057
    iget-object p1, p0, Lwb/na;->i:Li0/a1;

    .line 1058
    .line 1059
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object p2

    .line 1063
    check-cast p2, Ljava/lang/Boolean;

    .line 1064
    .line 1065
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    iget-object p2, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 1070
    .line 1071
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    iget-object v10, p0, Lwb/na;->j:Li0/a1;

    .line 1080
    .line 1081
    sget-object v11, Li0/l;->a:Li0/e;

    .line 1082
    .line 1083
    if-nez v1, :cond_2c

    .line 1084
    .line 1085
    if-ne v2, v11, :cond_2d

    .line 1086
    .line 1087
    :cond_2c
    new-instance v2, Lwb/bc;

    .line 1088
    .line 1089
    const/4 v1, 0x3

    .line 1090
    invoke-direct {v2, p2, p1, v10, v1}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    :cond_2d
    move-object v4, v2

    .line 1097
    check-cast v4, Lfg/l;

    .line 1098
    .line 1099
    const/16 v6, 0x1b0

    .line 1100
    .line 1101
    const/16 v7, 0x8

    .line 1102
    .line 1103
    const-string v1, "\u5c4f\u853d\u827e\u7279\u6240\u6709\u4eba"

    .line 1104
    .line 1105
    const-string v2, "\u4ec5\u62e6\u622a\u6240\u9009\u7fa4\u804a\u7684\u827e\u7279\u6240\u6709\u4eba\u901a\u77e5"

    .line 1106
    .line 1107
    const/4 v3, 0x0

    .line 1108
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1109
    .line 1110
    .line 1111
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object p1

    .line 1115
    check-cast p1, Ljava/lang/Boolean;

    .line 1116
    .line 1117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1118
    .line 1119
    .line 1120
    move-result p1

    .line 1121
    if-eqz p1, :cond_31

    .line 1122
    .line 1123
    const p1, 0x6d429777

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1127
    .line 1128
    .line 1129
    const/4 p1, 0x0

    .line 1130
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1131
    .line 1132
    .line 1133
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object p1

    .line 1137
    check-cast p1, Ljava/lang/Boolean;

    .line 1138
    .line 1139
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1140
    .line 1141
    .line 1142
    move-result p1

    .line 1143
    iget-object p2, p0, Lwb/na;->k:Li0/a1;

    .line 1144
    .line 1145
    if-eqz p1, :cond_2e

    .line 1146
    .line 1147
    const-string p1, "\u5f53\u524d\u5c4f\u853d\u5168\u90e8\u7fa4\u804a\uff0c\u91cd\u65b0\u9009\u62e9\u540e\u6309\u9009\u62e9\u751f\u6548"

    .line 1148
    .line 1149
    goto :goto_f

    .line 1150
    :cond_2e
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object p1

    .line 1154
    check-cast p1, Ljava/util/Set;

    .line 1155
    .line 1156
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 1157
    .line 1158
    .line 1159
    move-result p1

    .line 1160
    if-eqz p1, :cond_2f

    .line 1161
    .line 1162
    const-string p1, "\u672a\u9009\u62e9\u7fa4\u804a\uff0c\u4e0d\u4f1a\u5c4f\u853d\u901a\u77e5"

    .line 1163
    .line 1164
    goto :goto_f

    .line 1165
    :cond_2f
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object p1

    .line 1169
    check-cast p1, Ljava/util/Set;

    .line 1170
    .line 1171
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 1172
    .line 1173
    .line 1174
    move-result p1

    .line 1175
    const-string v0, "\u5df2\u9009\u62e9 "

    .line 1176
    .line 1177
    const-string v1, " \u4e2a\u7fa4\u804a"

    .line 1178
    .line 1179
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p1

    .line 1183
    :goto_f
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    if-ne v0, v11, :cond_30

    .line 1188
    .line 1189
    new-instance v0, Lc9/x0;

    .line 1190
    .line 1191
    const/16 v1, 0x17

    .line 1192
    .line 1193
    iget-object v2, p0, Lwb/na;->l:Li0/a1;

    .line 1194
    .line 1195
    invoke-direct {v0, v1, p2, v2}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    :cond_30
    check-cast v0, Lfg/a;

    .line 1202
    .line 1203
    const/16 p2, 0x186

    .line 1204
    .line 1205
    const-string v1, "\u9009\u62e9\u5c4f\u853d\u7fa4\u804a"

    .line 1206
    .line 1207
    invoke-static {v1, p1, v0, v5, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1211
    .line 1212
    .line 1213
    goto :goto_10

    .line 1214
    :cond_31
    const p1, 0x6d5343a8

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1221
    .line 1222
    .line 1223
    goto :goto_10

    .line 1224
    :cond_32
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1225
    .line 1226
    .line 1227
    :goto_10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1228
    .line 1229
    return-object p1

    .line 1230
    :pswitch_4
    move-object v5, p1

    .line 1231
    check-cast v5, Li0/h0;

    .line 1232
    .line 1233
    check-cast p2, Ljava/lang/Integer;

    .line 1234
    .line 1235
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1236
    .line 1237
    .line 1238
    move-result p1

    .line 1239
    and-int/lit8 p2, p1, 0x3

    .line 1240
    .line 1241
    const/4 v9, 0x0

    .line 1242
    const/4 v10, 0x1

    .line 1243
    const/4 v11, 0x2

    .line 1244
    if-eq p2, v11, :cond_33

    .line 1245
    .line 1246
    move p2, v10

    .line 1247
    goto :goto_11

    .line 1248
    :cond_33
    move p2, v9

    .line 1249
    :goto_11
    and-int/2addr p1, v10

    .line 1250
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1251
    .line 1252
    .line 1253
    move-result p1

    .line 1254
    if-eqz p1, :cond_3c

    .line 1255
    .line 1256
    const/4 v4, 0x0

    .line 1257
    const/16 v6, 0x6db0

    .line 1258
    .line 1259
    iget-object v0, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 1260
    .line 1261
    const-string v1, "hb_auto_enable"

    .line 1262
    .line 1263
    const-string v2, "\u81ea\u52a8\u62a2\u7ea2\u5305"

    .line 1264
    .line 1265
    const-string v3, "\u5f00\u542f\u540e\u81ea\u52a8\u8bc6\u522b\u5e76\u62a2\u7ea2\u5305"

    .line 1266
    .line 1267
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1268
    .line 1269
    .line 1270
    const/4 p1, 0x0

    .line 1271
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1272
    .line 1273
    .line 1274
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1275
    .line 1276
    .line 1277
    move-result-object p2

    .line 1278
    new-instance v1, Lsf/e;

    .line 1279
    .line 1280
    const-string v2, "\u6253\u5f00\u7ea2\u5305\u9875\u9762"

    .line 1281
    .line 1282
    invoke-direct {v1, v2, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1286
    .line 1287
    .line 1288
    move-result-object p2

    .line 1289
    new-instance v2, Lsf/e;

    .line 1290
    .line 1291
    const-string v3, "\u9759\u9ed8\u62a2\u5305\uff08\u540e\u53f0\uff09"

    .line 1292
    .line 1293
    invoke-direct {v2, v3, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1294
    .line 1295
    .line 1296
    filled-new-array {v1, v2}, [Lsf/e;

    .line 1297
    .line 1298
    .line 1299
    move-result-object p2

    .line 1300
    invoke-static {p2}, Lwb/ho;->w6([Lsf/e;)Ljava/util/ArrayList;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    const/16 v7, 0x61b0

    .line 1305
    .line 1306
    const/16 v8, 0x20

    .line 1307
    .line 1308
    const-string v1, "hb_grab_mode"

    .line 1309
    .line 1310
    const-string v2, "\u62a2\u5305\u6a21\u5f0f"

    .line 1311
    .line 1312
    const/4 v4, 0x1

    .line 1313
    move-object v6, v5

    .line 1314
    const/4 v5, 0x0

    .line 1315
    invoke-static/range {v0 .. v8}, Lwb/ho;->z2(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;Li0/h0;II)V

    .line 1316
    .line 1317
    .line 1318
    move-object v5, v6

    .line 1319
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1320
    .line 1321
    .line 1322
    const/4 v4, 0x0

    .line 1323
    const/16 v6, 0x6db0

    .line 1324
    .line 1325
    const-string v1, "hb_skip_self"

    .line 1326
    .line 1327
    const-string v2, "\u8df3\u8fc7\u81ea\u5df1\u7684\u7ea2\u5305"

    .line 1328
    .line 1329
    const-string v3, "\u4e0d\u4f1a\u62a2\u81ea\u5df1\u53d1\u51fa\u7684\u7ea2\u5305"

    .line 1330
    .line 1331
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1332
    .line 1333
    .line 1334
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1335
    .line 1336
    .line 1337
    const-string v1, "hb_block_new_group_enable"

    .line 1338
    .line 1339
    const-string v2, "\u81ea\u52a8\u5c4f\u853d\u65b0\u8fdb\u7fa4"

    .line 1340
    .line 1341
    const-string v3, "\u65b0\u7fa4\u81ea\u52a8\u52a0\u5165\u9002\u7528\u804a\u5929\uff0c\u5e76\u9ed8\u8ba4\u5173\u95ed\u8be5\u7fa4\u62a2\u7ea2\u5305"

    .line 1342
    .line 1343
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1344
    .line 1345
    .line 1346
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1347
    .line 1348
    .line 1349
    const-string v1, "hb_auto_close"

    .line 1350
    .line 1351
    const-string v2, "\u81ea\u52a8\u5173\u95ed\u9875\u9762"

    .line 1352
    .line 1353
    const-string v3, "\u62a2\u5b8c\u6216\u5931\u8d25\u540e\u81ea\u52a8\u6536\u8d77\u7ea2\u5305\u9875"

    .line 1354
    .line 1355
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1356
    .line 1357
    .line 1358
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1359
    .line 1360
    .line 1361
    iget-object p2, p0, Lwb/na;->i:Li0/a1;

    .line 1362
    .line 1363
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    check-cast v0, Ljava/lang/Number;

    .line 1368
    .line 1369
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    if-eq v0, v10, :cond_35

    .line 1374
    .line 1375
    if-eq v0, v11, :cond_34

    .line 1376
    .line 1377
    const-string v0, "\u65e0\u5ef6\u8fdf"

    .line 1378
    .line 1379
    :goto_12
    move-object v1, v0

    .line 1380
    goto :goto_13

    .line 1381
    :cond_34
    const-string v0, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 1382
    .line 1383
    goto :goto_12

    .line 1384
    :cond_35
    const-string v0, "\u968f\u673a\u5ef6\u8fdf"

    .line 1385
    .line 1386
    goto :goto_12

    .line 1387
    :goto_13
    invoke-static {}, Lwb/ho;->F6()Ljava/util/ArrayList;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v2

    .line 1391
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    check-cast v0, Ljava/lang/Number;

    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1398
    .line 1399
    .line 1400
    move-result v3

    .line 1401
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    iget-object v8, p0, Lwb/na;->j:Li0/a1;

    .line 1406
    .line 1407
    sget-object v12, Li0/l;->a:Li0/e;

    .line 1408
    .line 1409
    if-ne v0, v12, :cond_36

    .line 1410
    .line 1411
    new-instance v0, Lsh/m1;

    .line 1412
    .line 1413
    const/16 v4, 0x8

    .line 1414
    .line 1415
    invoke-direct {v0, v4, p2, v8}, Lsh/m1;-><init>(ILi0/a1;Li0/a1;)V

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1419
    .line 1420
    .line 1421
    :cond_36
    move-object v4, v0

    .line 1422
    check-cast v4, Lfg/l;

    .line 1423
    .line 1424
    move-object v6, v5

    .line 1425
    const/4 v5, 0x0

    .line 1426
    const/16 v7, 0x6006

    .line 1427
    .line 1428
    const-string v0, "\u62a2\u5305\u5ef6\u8fdf"

    .line 1429
    .line 1430
    invoke-static/range {v0 .. v7}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 1431
    .line 1432
    .line 1433
    move-object v5, v6

    .line 1434
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    check-cast v0, Ljava/lang/Number;

    .line 1439
    .line 1440
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1441
    .line 1442
    .line 1443
    move-result v0

    .line 1444
    if-ne v0, v11, :cond_38

    .line 1445
    .line 1446
    const p2, -0x31519a7

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 1450
    .line 1451
    .line 1452
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1453
    .line 1454
    .line 1455
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object p1

    .line 1459
    move-object v2, p1

    .line 1460
    check-cast v2, Ljava/lang/String;

    .line 1461
    .line 1462
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object p1

    .line 1466
    if-ne p1, v12, :cond_37

    .line 1467
    .line 1468
    new-instance p1, Lwb/mf;

    .line 1469
    .line 1470
    const/16 p2, 0x9

    .line 1471
    .line 1472
    invoke-direct {p1, v8, p2}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v5, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1476
    .line 1477
    .line 1478
    :cond_37
    move-object v3, p1

    .line 1479
    check-cast v3, Lfg/l;

    .line 1480
    .line 1481
    move-object v6, v5

    .line 1482
    const/16 v5, 0xc36

    .line 1483
    .line 1484
    const-string v0, "\u81ea\u5b9a\u4e49\u5ef6\u8fdf"

    .line 1485
    .line 1486
    const-string v1, "\u5355\u4f4d ms\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 1487
    .line 1488
    move-object v4, v6

    .line 1489
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1490
    .line 1491
    .line 1492
    move-object v5, v4

    .line 1493
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1494
    .line 1495
    .line 1496
    goto/16 :goto_14

    .line 1497
    .line 1498
    :cond_38
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object p2

    .line 1502
    check-cast p2, Ljava/lang/Number;

    .line 1503
    .line 1504
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 1505
    .line 1506
    .line 1507
    move-result p2

    .line 1508
    if-ne p2, v10, :cond_3b

    .line 1509
    .line 1510
    const p2, -0x311c030

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 1514
    .line 1515
    .line 1516
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1517
    .line 1518
    .line 1519
    iget-object p2, p0, Lwb/na;->k:Li0/a1;

    .line 1520
    .line 1521
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    move-object v2, v0

    .line 1526
    check-cast v2, Ljava/lang/String;

    .line 1527
    .line 1528
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    if-ne v0, v12, :cond_39

    .line 1533
    .line 1534
    new-instance v0, Lwb/mf;

    .line 1535
    .line 1536
    const/16 v1, 0xa

    .line 1537
    .line 1538
    invoke-direct {v0, p2, v1}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v5, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1542
    .line 1543
    .line 1544
    :cond_39
    move-object v3, v0

    .line 1545
    check-cast v3, Lfg/l;

    .line 1546
    .line 1547
    move-object v6, v5

    .line 1548
    const/16 v5, 0xc36

    .line 1549
    .line 1550
    const-string v0, "\u6700\u5c0f\u5ef6\u8fdf"

    .line 1551
    .line 1552
    const-string v1, "\u5355\u4f4d ms\uff0c\u4fdd\u5b58\u540e\u751f\u6548"

    .line 1553
    .line 1554
    move-object v4, v6

    .line 1555
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1556
    .line 1557
    .line 1558
    move-object v5, v4

    .line 1559
    invoke-static {p1, v5, v9, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1560
    .line 1561
    .line 1562
    iget-object p1, p0, Lwb/na;->l:Li0/a1;

    .line 1563
    .line 1564
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object p2

    .line 1568
    move-object v2, p2

    .line 1569
    check-cast v2, Ljava/lang/String;

    .line 1570
    .line 1571
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object p2

    .line 1575
    if-ne p2, v12, :cond_3a

    .line 1576
    .line 1577
    new-instance p2, Lwb/mf;

    .line 1578
    .line 1579
    const/16 v0, 0xb

    .line 1580
    .line 1581
    invoke-direct {p2, p1, v0}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1585
    .line 1586
    .line 1587
    :cond_3a
    move-object v3, p2

    .line 1588
    check-cast v3, Lfg/l;

    .line 1589
    .line 1590
    move-object v6, v5

    .line 1591
    const/16 v5, 0xc36

    .line 1592
    .line 1593
    const-string v0, "\u6700\u5927\u5ef6\u8fdf"

    .line 1594
    .line 1595
    const-string v1, "\u5355\u4f4d ms\uff0c\u4e0d\u80fd\u5c0f\u4e8e\u6700\u5c0f\u5ef6\u8fdf"

    .line 1596
    .line 1597
    move-object v4, v6

    .line 1598
    invoke-static/range {v0 .. v5}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1599
    .line 1600
    .line 1601
    move-object v5, v4

    .line 1602
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1603
    .line 1604
    .line 1605
    goto :goto_14

    .line 1606
    :cond_3b
    const p1, -0x30cffec

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v5, p1}, Li0/h0;->a0(I)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1613
    .line 1614
    .line 1615
    goto :goto_14

    .line 1616
    :cond_3c
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1617
    .line 1618
    .line 1619
    :goto_14
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1620
    .line 1621
    return-object p1

    .line 1622
    :pswitch_5
    move-object v5, p1

    .line 1623
    check-cast v5, Li0/h0;

    .line 1624
    .line 1625
    check-cast p2, Ljava/lang/Integer;

    .line 1626
    .line 1627
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1628
    .line 1629
    .line 1630
    move-result p1

    .line 1631
    and-int/lit8 p2, p1, 0x3

    .line 1632
    .line 1633
    const/4 v0, 0x2

    .line 1634
    const/4 v8, 0x1

    .line 1635
    const/4 v9, 0x0

    .line 1636
    if-eq p2, v0, :cond_3d

    .line 1637
    .line 1638
    move p2, v8

    .line 1639
    goto :goto_15

    .line 1640
    :cond_3d
    move p2, v9

    .line 1641
    :goto_15
    and-int/2addr p1, v8

    .line 1642
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1643
    .line 1644
    .line 1645
    move-result p1

    .line 1646
    if-eqz p1, :cond_46

    .line 1647
    .line 1648
    const/4 v4, 0x0

    .line 1649
    const/16 v6, 0x6db0

    .line 1650
    .line 1651
    iget-object v0, p0, Lwb/na;->h:Landroid/content/SharedPreferences;

    .line 1652
    .line 1653
    const-string v1, "sns_anti_recall_enable"

    .line 1654
    .line 1655
    const-string v2, "\u670b\u53cb\u5708\u9632\u64a4\u56de"

    .line 1656
    .line 1657
    const-string v3, "\u5df2\u7f13\u5b58\u7684\u670b\u53cb\u5708\u5728\u5bf9\u65b9\u5220\u9664\u6216\u9650\u5236\u53ef\u89c1\u8303\u56f4\u540e\u7ee7\u7eed\u663e\u793a"

    .line 1658
    .line 1659
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1660
    .line 1661
    .line 1662
    move-object p1, v0

    .line 1663
    const/4 p2, 0x0

    .line 1664
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1665
    .line 1666
    .line 1667
    iget-object v10, p0, Lwb/na;->i:Li0/a1;

    .line 1668
    .line 1669
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    check-cast v0, Ljava/lang/Boolean;

    .line 1674
    .line 1675
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1676
    .line 1677
    .line 1678
    move-result v0

    .line 1679
    invoke-virtual {v5, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1680
    .line 1681
    .line 1682
    move-result v1

    .line 1683
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v2

    .line 1687
    sget-object v11, Li0/l;->a:Li0/e;

    .line 1688
    .line 1689
    if-nez v1, :cond_3e

    .line 1690
    .line 1691
    if-ne v2, v11, :cond_3f

    .line 1692
    .line 1693
    :cond_3e
    new-instance v2, Lwb/wb;

    .line 1694
    .line 1695
    const/16 v1, 0x10

    .line 1696
    .line 1697
    invoke-direct {v2, p1, v10, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1701
    .line 1702
    .line 1703
    :cond_3f
    move-object v4, v2

    .line 1704
    check-cast v4, Lfg/l;

    .line 1705
    .line 1706
    const/16 v6, 0x1b0

    .line 1707
    .line 1708
    const/16 v7, 0x8

    .line 1709
    .line 1710
    const-string v1, "\u81ea\u5b9a\u4e49\u670b\u53cb\u5708\u64a4\u56de\u63d0\u793a"

    .line 1711
    .line 1712
    const-string v2, "\u5f00\u542f\u540e\u53ef\u81ea\u5b9a\u4e49\u670b\u53cb\u5708\u6b63\u6587\u88ab\u5220\u9664\u65f6\u7684\u63d0\u793a\u6587\u6848"

    .line 1713
    .line 1714
    const/4 v3, 0x0

    .line 1715
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1716
    .line 1717
    .line 1718
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v0

    .line 1722
    check-cast v0, Ljava/lang/Boolean;

    .line 1723
    .line 1724
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v0

    .line 1728
    if-eqz v0, :cond_41

    .line 1729
    .line 1730
    const v0, 0x31db20e3

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1734
    .line 1735
    .line 1736
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1737
    .line 1738
    .line 1739
    iget-object v0, p0, Lwb/na;->j:Li0/a1;

    .line 1740
    .line 1741
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v1

    .line 1745
    move-object v2, v1

    .line 1746
    check-cast v2, Ljava/lang/String;

    .line 1747
    .line 1748
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v1

    .line 1752
    if-ne v1, v11, :cond_40

    .line 1753
    .line 1754
    new-instance v1, Lwb/hd;

    .line 1755
    .line 1756
    const/16 v3, 0x1d

    .line 1757
    .line 1758
    invoke-direct {v1, v0, v3}, Lwb/hd;-><init>(Li0/a1;I)V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1762
    .line 1763
    .line 1764
    :cond_40
    move-object v4, v1

    .line 1765
    check-cast v4, Lfg/l;

    .line 1766
    .line 1767
    const/16 v6, 0x6036

    .line 1768
    .line 1769
    const/16 v7, 0x8

    .line 1770
    .line 1771
    const-string v0, "\u670b\u53cb\u5708\u63d0\u793a\u6587\u6848"

    .line 1772
    .line 1773
    const-string v1, "\u9ed8\u8ba4 [\u5df2\u5220\u9664]"

    .line 1774
    .line 1775
    const/4 v3, 0x0

    .line 1776
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1780
    .line 1781
    .line 1782
    goto :goto_16

    .line 1783
    :cond_41
    const v0, 0x31dd7201

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1790
    .line 1791
    .line 1792
    :goto_16
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1793
    .line 1794
    .line 1795
    const/4 v4, 0x0

    .line 1796
    const/16 v6, 0x6db0

    .line 1797
    .line 1798
    const-string v1, "sns_comment_anti_recall_enable"

    .line 1799
    .line 1800
    const-string v2, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u64a4\u56de"

    .line 1801
    .line 1802
    const-string v3, "\u5df2\u7f13\u5b58\u7684\u670b\u53cb\u5708\u8bc4\u8bba\u88ab\u5220\u9664\u540e\u7ee7\u7eed\u663e\u793a\uff0c\u5e76\u6807\u8bb0\u5df2\u5220\u9664"

    .line 1803
    .line 1804
    move-object v0, p1

    .line 1805
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1806
    .line 1807
    .line 1808
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1809
    .line 1810
    .line 1811
    iget-object v10, p0, Lwb/na;->k:Li0/a1;

    .line 1812
    .line 1813
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v0

    .line 1817
    check-cast v0, Ljava/lang/Boolean;

    .line 1818
    .line 1819
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1820
    .line 1821
    .line 1822
    move-result v0

    .line 1823
    invoke-virtual {v5, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1824
    .line 1825
    .line 1826
    move-result v1

    .line 1827
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v2

    .line 1831
    if-nez v1, :cond_42

    .line 1832
    .line 1833
    if-ne v2, v11, :cond_43

    .line 1834
    .line 1835
    :cond_42
    new-instance v2, Lwb/wb;

    .line 1836
    .line 1837
    const/16 v1, 0x11

    .line 1838
    .line 1839
    invoke-direct {v2, p1, v10, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    :cond_43
    move-object v4, v2

    .line 1846
    check-cast v4, Lfg/l;

    .line 1847
    .line 1848
    const/16 v6, 0x1b0

    .line 1849
    .line 1850
    const/16 v7, 0x8

    .line 1851
    .line 1852
    const-string v1, "\u81ea\u5b9a\u4e49\u8bc4\u8bba\u64a4\u56de\u63d0\u793a"

    .line 1853
    .line 1854
    const-string v2, "\u5f00\u542f\u540e\u53ef\u81ea\u5b9a\u4e49\u670b\u53cb\u5708\u8bc4\u8bba\u88ab\u5220\u9664\u65f6\u7684\u63d0\u793a\u6587\u6848"

    .line 1855
    .line 1856
    const/4 v3, 0x0

    .line 1857
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1858
    .line 1859
    .line 1860
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v0

    .line 1864
    check-cast v0, Ljava/lang/Boolean;

    .line 1865
    .line 1866
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1867
    .line 1868
    .line 1869
    move-result v0

    .line 1870
    if-eqz v0, :cond_45

    .line 1871
    .line 1872
    const v0, 0x31ea2122

    .line 1873
    .line 1874
    .line 1875
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1876
    .line 1877
    .line 1878
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1879
    .line 1880
    .line 1881
    iget-object v0, p0, Lwb/na;->l:Li0/a1;

    .line 1882
    .line 1883
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v1

    .line 1887
    move-object v2, v1

    .line 1888
    check-cast v2, Ljava/lang/String;

    .line 1889
    .line 1890
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v1

    .line 1894
    if-ne v1, v11, :cond_44

    .line 1895
    .line 1896
    new-instance v1, Lwb/zd;

    .line 1897
    .line 1898
    const/4 v3, 0x0

    .line 1899
    invoke-direct {v1, v0, v3}, Lwb/zd;-><init>(Li0/a1;I)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1903
    .line 1904
    .line 1905
    :cond_44
    move-object v4, v1

    .line 1906
    check-cast v4, Lfg/l;

    .line 1907
    .line 1908
    const/16 v6, 0x6036

    .line 1909
    .line 1910
    const/16 v7, 0x8

    .line 1911
    .line 1912
    const-string v0, "\u8bc4\u8bba\u63d0\u793a\u6587\u6848"

    .line 1913
    .line 1914
    const-string v1, "\u9ed8\u8ba4 [\u5df2\u5220\u9664]"

    .line 1915
    .line 1916
    const/4 v3, 0x0

    .line 1917
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1921
    .line 1922
    .line 1923
    goto :goto_17

    .line 1924
    :cond_45
    const v0, 0x31ec7601

    .line 1925
    .line 1926
    .line 1927
    invoke-virtual {v5, v0}, Li0/h0;->a0(I)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 1931
    .line 1932
    .line 1933
    :goto_17
    invoke-static {p2, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1934
    .line 1935
    .line 1936
    const/4 v4, 0x0

    .line 1937
    const/16 v6, 0x6db0

    .line 1938
    .line 1939
    const-string v1, "sns_force_legacy_profile_enable"

    .line 1940
    .line 1941
    const-string v2, "\u5f3a\u5236\u65e7\u7248\u4e2a\u4eba\u4e3b\u9875\u670b\u53cb\u5708"

    .line 1942
    .line 1943
    const-string v3, "Flutter \u4e2a\u4eba\u4e3b\u9875\u770b\u4e0d\u5230\u5df2\u5220\u9664\u670b\u53cb\u5708\u65f6\uff0c\u6539\u7528\u5fae\u4fe1\u65e7\u7248 SnsUserUI"

    .line 1944
    .line 1945
    move-object v0, p1

    .line 1946
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1947
    .line 1948
    .line 1949
    goto :goto_18

    .line 1950
    :cond_46
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1951
    .line 1952
    .line 1953
    :goto_18
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1954
    .line 1955
    return-object p1

    .line 1956
    nop

    .line 1957
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
