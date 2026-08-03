.class public final synthetic Lwb/hf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/hf;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/hf;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/hf;->i:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/hf;->j:Ljava/util/List;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/hf;->k:Lfg/p;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/hf;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/hf;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 20
    iput p7, p0, Lwb/hf;->g:I

    iput-object p1, p0, Lwb/hf;->i:Ljava/util/List;

    iput-object p2, p0, Lwb/hf;->h:Ljava/util/ArrayList;

    iput-object p3, p0, Lwb/hf;->j:Ljava/util/List;

    iput-object p4, p0, Lwb/hf;->k:Lfg/p;

    iput-object p5, p0, Lwb/hf;->l:Li0/a1;

    iput-object p6, p0, Lwb/hf;->m:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/hf;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    and-int/2addr p2, v2

    .line 25
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_d

    .line 30
    .line 31
    iget-object p2, p0, Lwb/hf;->i:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v0, 0x6

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    const p2, -0x408b7deb

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 44
    .line 45
    .line 46
    const-string p2, "\u6682\u65e0\u9002\u7528\u804a\u5929\u3002\u6dfb\u52a0\u7fa4\u804a\u6216\u597d\u53cb\u540e\uff0c\u518d\u7ed9\u5b83\u5206\u914d\u7ea2\u5305\u6a21\u677f\u3002"

    .line 47
    .line 48
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    iget-object p2, p0, Lwb/hf;->h:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    const p2, -0x40899de7

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 68
    .line 69
    .line 70
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c\u3002\u53ef\u6309\u6635\u79f0\u3001ID \u6216\u6a21\u677f\u540d\u641c\u7d22\u3002"

    .line 71
    .line 72
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_2
    const v0, -0x408790d7

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move v1, v3

    .line 91
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_c

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    add-int/lit8 v5, v1, 0x1

    .line 102
    .line 103
    if-ltz v1, :cond_b

    .line 104
    .line 105
    check-cast v4, Lsf/e;

    .line 106
    .line 107
    iget-object v6, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v6, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Lna/i;

    .line 118
    .line 119
    iget-object v7, p0, Lwb/hf;->l:Li0/a1;

    .line 120
    .line 121
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    iget-object v8, p0, Lwb/hf;->j:Ljava/util/List;

    .line 132
    .line 133
    sget-object v9, Li0/l;->a:Li0/e;

    .line 134
    .line 135
    if-eqz v7, :cond_6

    .line 136
    .line 137
    const v7, -0x50857a73

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 141
    .line 142
    .line 143
    iget-object v7, v4, Lna/i;->c:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_3

    .line 150
    .line 151
    iget-object v7, v4, Lna/i;->b:Ljava/lang/String;

    .line 152
    .line 153
    :cond_3
    invoke-static {v4, v8}, Lwb/ho;->s5(Lna/i;Ljava/util/List;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    new-instance v10, Lwb/bp;

    .line 158
    .line 159
    invoke-direct {v10, v7, v6, v8}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v6, p0, Lwb/hf;->m:Li0/a1;

    .line 163
    .line 164
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Ljava/util/Set;

    .line 169
    .line 170
    iget-object v8, v4, Lna/i;->a:Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    if-nez v8, :cond_4

    .line 185
    .line 186
    if-ne v11, v9, :cond_5

    .line 187
    .line 188
    :cond_4
    new-instance v11, Lsh/v1;

    .line 189
    .line 190
    const/16 v8, 0x12

    .line 191
    .line 192
    invoke-direct {v11, v4, v8, v6}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    check-cast v11, Lfg/a;

    .line 199
    .line 200
    invoke-static {v10, v7, v11, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    const v7, -0x5077a285

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 211
    .line 212
    .line 213
    iget-object v7, v4, Lna/i;->c:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-eqz v10, :cond_7

    .line 220
    .line 221
    iget-object v7, v4, Lna/i;->b:Ljava/lang/String;

    .line 222
    .line 223
    :cond_7
    invoke-static {v4, v8}, Lwb/ho;->s5(Lna/i;Ljava/util/List;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    iget-object v10, p0, Lwb/hf;->k:Lfg/p;

    .line 228
    .line 229
    invoke-virtual {p1, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    invoke-virtual {p1, v6}, Li0/h0;->d(I)Z

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    or-int/2addr v11, v12

    .line 238
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v12

    .line 242
    or-int/2addr v11, v12

    .line 243
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    if-nez v11, :cond_8

    .line 248
    .line 249
    if-ne v12, v9, :cond_9

    .line 250
    .line 251
    :cond_8
    new-instance v12, Lhb/e0;

    .line 252
    .line 253
    const/4 v9, 0x2

    .line 254
    invoke-direct {v12, v10, v6, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_9
    check-cast v12, Lfg/a;

    .line 261
    .line 262
    invoke-static {v7, v8, v12, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 266
    .line 267
    .line 268
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    sub-int/2addr v4, v2

    .line 273
    if-ge v1, v4, :cond_a

    .line 274
    .line 275
    const v1, 0x5a9c4e5

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 279
    .line 280
    .line 281
    const/4 v1, 0x0

    .line 282
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 283
    .line 284
    .line 285
    :goto_3
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_a
    const v1, -0x5070f3b5

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :goto_4
    move v1, v5

    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :cond_b
    invoke-static {}, La/a;->Q0()V

    .line 300
    .line 301
    .line 302
    const/4 p1, 0x0

    .line 303
    throw p1

    .line 304
    :cond_c
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 309
    .line 310
    .line 311
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 312
    .line 313
    return-object p1

    .line 314
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 315
    .line 316
    const/4 v1, 0x2

    .line 317
    const/4 v2, 0x1

    .line 318
    const/4 v3, 0x0

    .line 319
    if-eq v0, v1, :cond_e

    .line 320
    .line 321
    move v0, v2

    .line 322
    goto :goto_6

    .line 323
    :cond_e
    move v0, v3

    .line 324
    :goto_6
    and-int/2addr p2, v2

    .line 325
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 326
    .line 327
    .line 328
    move-result p2

    .line 329
    if-eqz p2, :cond_1b

    .line 330
    .line 331
    iget-object p2, p0, Lwb/hf;->h:Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_10

    .line 338
    .line 339
    const p2, 0x330636d7

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 343
    .line 344
    .line 345
    iget-object p2, p0, Lwb/hf;->i:Ljava/util/List;

    .line 346
    .line 347
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 348
    .line 349
    .line 350
    move-result p2

    .line 351
    if-eqz p2, :cond_f

    .line 352
    .line 353
    const-string p2, "\u6682\u65e0\u9002\u7528\u804a\u5929\u3002"

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_f
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c\u3002"

    .line 357
    .line 358
    :goto_7
    invoke-static {p2, p1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_c

    .line 365
    .line 366
    :cond_10
    const v0, 0x330891e3

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    move v1, v3

    .line 377
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_1a

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    add-int/lit8 v5, v1, 0x1

    .line 388
    .line 389
    if-ltz v1, :cond_19

    .line 390
    .line 391
    check-cast v4, Lsf/e;

    .line 392
    .line 393
    iget-object v6, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v6, Ljava/lang/Number;

    .line 396
    .line 397
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, Lua/h;

    .line 404
    .line 405
    iget-object v7, p0, Lwb/hf;->l:Li0/a1;

    .line 406
    .line 407
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    iget-object v8, p0, Lwb/hf;->j:Ljava/util/List;

    .line 418
    .line 419
    sget-object v9, Li0/l;->a:Li0/e;

    .line 420
    .line 421
    if-eqz v7, :cond_14

    .line 422
    .line 423
    const v7, 0xf6b7e6

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 427
    .line 428
    .line 429
    iget-object v7, v4, Lua/h;->c:Ljava/lang/String;

    .line 430
    .line 431
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    if-eqz v10, :cond_11

    .line 436
    .line 437
    iget-object v7, v4, Lua/h;->b:Ljava/lang/String;

    .line 438
    .line 439
    :cond_11
    invoke-static {v4, v8}, Lwb/ho;->v5(Lua/h;Ljava/util/List;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    new-instance v10, Lwb/bp;

    .line 444
    .line 445
    invoke-direct {v10, v7, v6, v8}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 446
    .line 447
    .line 448
    iget-object v6, p0, Lwb/hf;->m:Li0/a1;

    .line 449
    .line 450
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v7

    .line 454
    check-cast v7, Ljava/util/Set;

    .line 455
    .line 456
    iget-object v8, v4, Lua/h;->a:Ljava/lang/String;

    .line 457
    .line 458
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v7

    .line 462
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    if-nez v8, :cond_12

    .line 471
    .line 472
    if-ne v11, v9, :cond_13

    .line 473
    .line 474
    :cond_12
    new-instance v11, Lsh/v1;

    .line 475
    .line 476
    const/16 v8, 0x17

    .line 477
    .line 478
    invoke-direct {v11, v4, v8, v6}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :cond_13
    check-cast v11, Lfg/a;

    .line 485
    .line 486
    invoke-static {v10, v7, v11, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 490
    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_14
    const v7, 0x104833c

    .line 494
    .line 495
    .line 496
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 497
    .line 498
    .line 499
    iget-object v7, v4, Lua/h;->c:Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    if-eqz v10, :cond_15

    .line 506
    .line 507
    iget-object v7, v4, Lua/h;->b:Ljava/lang/String;

    .line 508
    .line 509
    :cond_15
    invoke-static {v4, v8}, Lwb/ho;->v5(Lua/h;Ljava/util/List;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    iget-object v10, p0, Lwb/hf;->k:Lfg/p;

    .line 514
    .line 515
    invoke-virtual {p1, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v11

    .line 519
    invoke-virtual {p1, v6}, Li0/h0;->d(I)Z

    .line 520
    .line 521
    .line 522
    move-result v12

    .line 523
    or-int/2addr v11, v12

    .line 524
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v12

    .line 528
    or-int/2addr v11, v12

    .line 529
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v12

    .line 533
    if-nez v11, :cond_16

    .line 534
    .line 535
    if-ne v12, v9, :cond_17

    .line 536
    .line 537
    :cond_16
    new-instance v12, Lhb/e0;

    .line 538
    .line 539
    const/4 v9, 0x6

    .line 540
    invoke-direct {v12, v10, v6, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {p1, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_17
    check-cast v12, Lfg/a;

    .line 547
    .line 548
    invoke-static {v7, v8, v12, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 552
    .line 553
    .line 554
    :goto_9
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    sub-int/2addr v4, v2

    .line 559
    if-ge v1, v4, :cond_18

    .line 560
    .line 561
    const v1, 0x6321588d

    .line 562
    .line 563
    .line 564
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 565
    .line 566
    .line 567
    const/4 v1, 0x0

    .line 568
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 569
    .line 570
    .line 571
    :goto_a
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 572
    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_18
    const v1, 0x109eda3

    .line 576
    .line 577
    .line 578
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 579
    .line 580
    .line 581
    goto :goto_a

    .line 582
    :goto_b
    move v1, v5

    .line 583
    goto/16 :goto_8

    .line 584
    .line 585
    :cond_19
    invoke-static {}, La/a;->Q0()V

    .line 586
    .line 587
    .line 588
    const/4 p1, 0x0

    .line 589
    throw p1

    .line 590
    :cond_1a
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 591
    .line 592
    .line 593
    goto :goto_c

    .line 594
    :cond_1b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 595
    .line 596
    .line 597
    :goto_c
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 598
    .line 599
    return-object p1

    .line 600
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 601
    .line 602
    const/4 v1, 0x2

    .line 603
    const/4 v2, 0x1

    .line 604
    const/4 v3, 0x0

    .line 605
    if-eq v0, v1, :cond_1c

    .line 606
    .line 607
    move v0, v2

    .line 608
    goto :goto_d

    .line 609
    :cond_1c
    move v0, v3

    .line 610
    :goto_d
    and-int/2addr p2, v2

    .line 611
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 612
    .line 613
    .line 614
    move-result p2

    .line 615
    if-eqz p2, :cond_29

    .line 616
    .line 617
    iget-object p2, p0, Lwb/hf;->i:Ljava/util/List;

    .line 618
    .line 619
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result p2

    .line 623
    const/4 v0, 0x6

    .line 624
    if-eqz p2, :cond_1d

    .line 625
    .line 626
    const p2, 0x4a97bbc9    # 4972004.5f

    .line 627
    .line 628
    .line 629
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 630
    .line 631
    .line 632
    const-string p2, "\u6682\u65e0\u540d\u5355\u3002\u6dfb\u52a0\u597d\u53cb\u3001\u7fa4\u804a\u3001\u516c\u4f17\u53f7\u6216\u7fa4\u6210\u5458\u540e\uff0c\u518d\u7ed9\u540d\u5355\u5206\u914d\u6a21\u677f\u3002"

    .line 633
    .line 634
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_12

    .line 641
    .line 642
    :cond_1d
    iget-object p2, p0, Lwb/hf;->h:Ljava/util/ArrayList;

    .line 643
    .line 644
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-eqz v1, :cond_1e

    .line 649
    .line 650
    const p2, 0x4a99ae92    # 5035849.0f

    .line 651
    .line 652
    .line 653
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 654
    .line 655
    .line 656
    const-string p2, "\u6ca1\u6709\u5339\u914d\u540d\u5355\u3002\u53ef\u6309\u6635\u79f0\u3001ID \u6216\u6a21\u677f\u540d\u641c\u7d22\u3002"

    .line 657
    .line 658
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_12

    .line 665
    .line 666
    :cond_1e
    const v0, 0x4a9bbc5c    # 5103150.0f

    .line 667
    .line 668
    .line 669
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    move v1, v3

    .line 677
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 678
    .line 679
    .line 680
    move-result v4

    .line 681
    if-eqz v4, :cond_28

    .line 682
    .line 683
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    add-int/lit8 v5, v1, 0x1

    .line 688
    .line 689
    if-ltz v1, :cond_27

    .line 690
    .line 691
    check-cast v4, Lsf/e;

    .line 692
    .line 693
    iget-object v6, v4, Lsf/e;->g:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v6, Ljava/lang/Number;

    .line 696
    .line 697
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 698
    .line 699
    .line 700
    move-result v6

    .line 701
    iget-object v4, v4, Lsf/e;->h:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v4, Laa/a;

    .line 704
    .line 705
    iget-object v7, p0, Lwb/hf;->l:Li0/a1;

    .line 706
    .line 707
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    check-cast v7, Ljava/lang/Boolean;

    .line 712
    .line 713
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 714
    .line 715
    .line 716
    move-result v7

    .line 717
    iget-object v8, p0, Lwb/hf;->j:Ljava/util/List;

    .line 718
    .line 719
    sget-object v9, Li0/l;->a:Li0/e;

    .line 720
    .line 721
    if-eqz v7, :cond_22

    .line 722
    .line 723
    const v7, -0x10640f1b

    .line 724
    .line 725
    .line 726
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 727
    .line 728
    .line 729
    iget-object v7, v4, Laa/a;->d:Ljava/lang/String;

    .line 730
    .line 731
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 732
    .line 733
    .line 734
    move-result v10

    .line 735
    if-eqz v10, :cond_1f

    .line 736
    .line 737
    iget-object v7, v4, Laa/a;->c:Ljava/lang/String;

    .line 738
    .line 739
    :cond_1f
    invoke-static {v4, v8}, Lwb/ho;->o5(Laa/a;Ljava/util/List;)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v8

    .line 743
    new-instance v10, Lwb/bp;

    .line 744
    .line 745
    invoke-direct {v10, v7, v6, v8}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 746
    .line 747
    .line 748
    iget-object v6, p0, Lwb/hf;->m:Li0/a1;

    .line 749
    .line 750
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v7

    .line 754
    check-cast v7, Ljava/util/Set;

    .line 755
    .line 756
    iget-object v8, v4, Laa/a;->a:Ljava/lang/String;

    .line 757
    .line 758
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v8

    .line 766
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    if-nez v8, :cond_20

    .line 771
    .line 772
    if-ne v11, v9, :cond_21

    .line 773
    .line 774
    :cond_20
    new-instance v11, Lsh/v1;

    .line 775
    .line 776
    const/16 v8, 0x15

    .line 777
    .line 778
    invoke-direct {v11, v4, v8, v6}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    :cond_21
    check-cast v11, Lfg/a;

    .line 785
    .line 786
    invoke-static {v10, v7, v11, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 790
    .line 791
    .line 792
    goto :goto_f

    .line 793
    :cond_22
    const v7, -0x10562b8d

    .line 794
    .line 795
    .line 796
    invoke-virtual {p1, v7}, Li0/h0;->a0(I)V

    .line 797
    .line 798
    .line 799
    iget-object v7, v4, Laa/a;->d:Ljava/lang/String;

    .line 800
    .line 801
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    if-eqz v10, :cond_23

    .line 806
    .line 807
    iget-object v7, v4, Laa/a;->c:Ljava/lang/String;

    .line 808
    .line 809
    :cond_23
    invoke-static {v4, v8}, Lwb/ho;->o5(Laa/a;Ljava/util/List;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v8

    .line 813
    iget-object v10, p0, Lwb/hf;->k:Lfg/p;

    .line 814
    .line 815
    invoke-virtual {p1, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v11

    .line 819
    invoke-virtual {p1, v6}, Li0/h0;->d(I)Z

    .line 820
    .line 821
    .line 822
    move-result v12

    .line 823
    or-int/2addr v11, v12

    .line 824
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result v12

    .line 828
    or-int/2addr v11, v12

    .line 829
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v12

    .line 833
    if-nez v11, :cond_24

    .line 834
    .line 835
    if-ne v12, v9, :cond_25

    .line 836
    .line 837
    :cond_24
    new-instance v12, Lhb/e0;

    .line 838
    .line 839
    const/4 v9, 0x3

    .line 840
    invoke-direct {v12, v10, v6, v4, v9}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {p1, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    :cond_25
    check-cast v12, Lfg/a;

    .line 847
    .line 848
    invoke-static {v7, v8, v12, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 852
    .line 853
    .line 854
    :goto_f
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    sub-int/2addr v4, v2

    .line 859
    if-ge v1, v4, :cond_26

    .line 860
    .line 861
    const v1, 0x20818f4a

    .line 862
    .line 863
    .line 864
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 865
    .line 866
    .line 867
    const/4 v1, 0x0

    .line 868
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 869
    .line 870
    .line 871
    :goto_10
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 872
    .line 873
    .line 874
    goto :goto_11

    .line 875
    :cond_26
    const v1, -0x104f717a

    .line 876
    .line 877
    .line 878
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 879
    .line 880
    .line 881
    goto :goto_10

    .line 882
    :goto_11
    move v1, v5

    .line 883
    goto/16 :goto_e

    .line 884
    .line 885
    :cond_27
    invoke-static {}, La/a;->Q0()V

    .line 886
    .line 887
    .line 888
    const/4 p1, 0x0

    .line 889
    throw p1

    .line 890
    :cond_28
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 891
    .line 892
    .line 893
    goto :goto_12

    .line 894
    :cond_29
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 895
    .line 896
    .line 897
    :goto_12
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 898
    .line 899
    return-object p1

    .line 900
    nop

    .line 901
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
