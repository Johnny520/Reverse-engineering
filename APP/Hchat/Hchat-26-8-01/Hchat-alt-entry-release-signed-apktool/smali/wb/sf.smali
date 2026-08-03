.class public final synthetic Lwb/sf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Lfg/p;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p10, p0, Lwb/sf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/sf;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/sf;->i:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/sf;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/sf;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/sf;->l:Ljava/util/List;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/sf;->m:Ljava/util/List;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/sf;->n:Lfg/p;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/sf;->o:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/sf;->p:Li0/a1;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/sf;->g:I

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
    if-eqz p2, :cond_f

    .line 30
    .line 31
    iget-object p2, p0, Lwb/sf;->j:Li0/a1;

    .line 32
    .line 33
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    const/4 v0, 0x6

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    const p2, -0x2d58e6b9

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 50
    .line 51
    .line 52
    const-string p2, "\u6b63\u5728\u8f7d\u5165\u76d1\u542c\u7fa4..."

    .line 53
    .line 54
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_1
    iget-object p2, p0, Lwb/sf;->k:Li0/a1;

    .line 63
    .line 64
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    const v0, -0x2d58de00

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p2, p1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_2
    iget-object p2, p0, Lwb/sf;->h:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    const p2, -0x2d58d5af

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 108
    .line 109
    .line 110
    const-string p2, "\u6682\u65e0\u76d1\u542c\u7fa4\u3002\u70b9\u51fb\u5e95\u90e8\u201c\u9009\u62e9\u76d1\u542c\u7fa4\u201d\u6dfb\u52a0\u3002"

    .line 111
    .line 112
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_3
    iget-object p2, p0, Lwb/sf;->i:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    const p2, -0x2d58cbdd

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 132
    .line 133
    .line 134
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 135
    .line 136
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_4
    const v0, -0x7dbf0888

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    move v1, v3

    .line 155
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_e

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    add-int/lit8 v5, v1, 0x1

    .line 166
    .line 167
    if-ltz v1, :cond_d

    .line 168
    .line 169
    check-cast v4, Lwb/s0;

    .line 170
    .line 171
    iget-object v6, p0, Lwb/sf;->o:Li0/a1;

    .line 172
    .line 173
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    iget-object v7, p0, Lwb/sf;->l:Ljava/util/List;

    .line 184
    .line 185
    iget-object v8, p0, Lwb/sf;->m:Ljava/util/List;

    .line 186
    .line 187
    sget-object v9, Li0/l;->a:Li0/e;

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    const v6, 0x4865356b

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v6}, Li0/h0;->a0(I)V

    .line 195
    .line 196
    .line 197
    iget-object v6, v4, Lwb/s0;->b:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v10, v4, Lwb/s0;->a:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-eqz v11, :cond_5

    .line 206
    .line 207
    move-object v6, v10

    .line 208
    :cond_5
    invoke-static {v10, v10, v7, v8}, Lwb/ho;->G5(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    new-instance v8, Lwb/bp;

    .line 213
    .line 214
    invoke-direct {v8, v6, v1, v7}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-object v6, p0, Lwb/sf;->p:Li0/a1;

    .line 218
    .line 219
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    check-cast v7, Ljava/util/Set;

    .line 224
    .line 225
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    if-nez v10, :cond_6

    .line 238
    .line 239
    if-ne v11, v9, :cond_7

    .line 240
    .line 241
    :cond_6
    new-instance v11, Lwb/x1;

    .line 242
    .line 243
    const/4 v9, 0x3

    .line 244
    invoke-direct {v11, v4, v6, v9}, Lwb/x1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_7
    check-cast v11, Lfg/a;

    .line 251
    .line 252
    invoke-static {v8, v7, v11, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_8
    const v6, 0x4873def6

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v6}, Li0/h0;->a0(I)V

    .line 263
    .line 264
    .line 265
    iget-object v6, v4, Lwb/s0;->b:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v10, v4, Lwb/s0;->a:Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    if-eqz v11, :cond_9

    .line 274
    .line 275
    move-object v6, v10

    .line 276
    :cond_9
    invoke-static {v10, v10, v7, v8}, Lwb/ho;->G5(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    iget-object v8, p0, Lwb/sf;->n:Lfg/p;

    .line 281
    .line 282
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    or-int/2addr v10, v11

    .line 291
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    if-nez v10, :cond_a

    .line 296
    .line 297
    if-ne v11, v9, :cond_b

    .line 298
    .line 299
    :cond_a
    new-instance v11, Lwb/ah;

    .line 300
    .line 301
    const/4 v9, 0x1

    .line 302
    invoke-direct {v11, v8, v4, v9}, Lwb/ah;-><init>(Lfg/p;Lwb/s0;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_b
    check-cast v11, Lfg/a;

    .line 309
    .line 310
    invoke-static {v6, v7, v11, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 314
    .line 315
    .line 316
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    sub-int/2addr v4, v2

    .line 321
    if-ge v1, v4, :cond_c

    .line 322
    .line 323
    const v1, 0x12daad91

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 327
    .line 328
    .line 329
    const/4 v1, 0x0

    .line 330
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 331
    .line 332
    .line 333
    :goto_3
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_c
    const v1, 0x487b391f

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 341
    .line 342
    .line 343
    goto :goto_3

    .line 344
    :goto_4
    move v1, v5

    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :cond_d
    invoke-static {}, La/a;->Q0()V

    .line 348
    .line 349
    .line 350
    const/4 p1, 0x0

    .line 351
    throw p1

    .line 352
    :cond_e
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 353
    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 357
    .line 358
    .line 359
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 360
    .line 361
    return-object p1

    .line 362
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 363
    .line 364
    const/4 v1, 0x2

    .line 365
    const/4 v2, 0x1

    .line 366
    const/4 v3, 0x0

    .line 367
    if-eq v0, v1, :cond_10

    .line 368
    .line 369
    move v0, v2

    .line 370
    goto :goto_6

    .line 371
    :cond_10
    move v0, v3

    .line 372
    :goto_6
    and-int/2addr p2, v2

    .line 373
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    if-eqz p2, :cond_1f

    .line 378
    .line 379
    iget-object p2, p0, Lwb/sf;->j:Li0/a1;

    .line 380
    .line 381
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    check-cast p2, Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 388
    .line 389
    .line 390
    move-result p2

    .line 391
    const/4 v0, 0x6

    .line 392
    if-eqz p2, :cond_11

    .line 393
    .line 394
    const p2, 0x67470963

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 398
    .line 399
    .line 400
    const-string p2, "\u6b63\u5728\u8f7d\u5165\u76d1\u542c\u7fa4..."

    .line 401
    .line 402
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_b

    .line 409
    .line 410
    :cond_11
    iget-object p2, p0, Lwb/sf;->k:Li0/a1;

    .line 411
    .line 412
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    check-cast v1, Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-lez v1, :cond_12

    .line 423
    .line 424
    const v0, 0x6747121c

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 428
    .line 429
    .line 430
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    check-cast p2, Ljava/lang/String;

    .line 435
    .line 436
    invoke-static {p2, p1, v3}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_b

    .line 443
    .line 444
    :cond_12
    iget-object p2, p0, Lwb/sf;->h:Ljava/util/List;

    .line 445
    .line 446
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result p2

    .line 450
    if-eqz p2, :cond_13

    .line 451
    .line 452
    const p2, 0x67471a6d

    .line 453
    .line 454
    .line 455
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 456
    .line 457
    .line 458
    const-string p2, "\u6682\u65e0\u76d1\u542c\u7fa4\u3002\u70b9\u51fb\u5e95\u90e8\u201c\u9009\u62e9\u76d1\u542c\u7fa4\u201d\u6dfb\u52a0\u3002"

    .line 459
    .line 460
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_b

    .line 467
    .line 468
    :cond_13
    iget-object p2, p0, Lwb/sf;->i:Ljava/util/ArrayList;

    .line 469
    .line 470
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-eqz v1, :cond_14

    .line 475
    .line 476
    const p2, 0x6747243f

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1, p2}, Li0/h0;->a0(I)V

    .line 480
    .line 481
    .line 482
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 483
    .line 484
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_b

    .line 491
    .line 492
    :cond_14
    const v0, -0x7e60f980

    .line 493
    .line 494
    .line 495
    invoke-virtual {p1, v0}, Li0/h0;->a0(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    move v1, v3

    .line 503
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_1e

    .line 508
    .line 509
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    add-int/lit8 v5, v1, 0x1

    .line 514
    .line 515
    if-ltz v1, :cond_1d

    .line 516
    .line 517
    check-cast v4, Lwb/s0;

    .line 518
    .line 519
    iget-object v6, p0, Lwb/sf;->o:Li0/a1;

    .line 520
    .line 521
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    check-cast v6, Ljava/lang/Boolean;

    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 528
    .line 529
    .line 530
    move-result v6

    .line 531
    iget-object v7, p0, Lwb/sf;->l:Ljava/util/List;

    .line 532
    .line 533
    iget-object v8, p0, Lwb/sf;->m:Ljava/util/List;

    .line 534
    .line 535
    sget-object v9, Li0/l;->a:Li0/e;

    .line 536
    .line 537
    if-eqz v6, :cond_18

    .line 538
    .line 539
    const v6, 0x47c346a1

    .line 540
    .line 541
    .line 542
    invoke-virtual {p1, v6}, Li0/h0;->a0(I)V

    .line 543
    .line 544
    .line 545
    iget-object v6, v4, Lwb/s0;->b:Ljava/lang/String;

    .line 546
    .line 547
    iget-object v10, v4, Lwb/s0;->a:Ljava/lang/String;

    .line 548
    .line 549
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 550
    .line 551
    .line 552
    move-result v11

    .line 553
    if-eqz v11, :cond_15

    .line 554
    .line 555
    move-object v6, v10

    .line 556
    :cond_15
    invoke-static {v10, v7, v8}, Lwb/ho;->V5(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v7

    .line 560
    new-instance v8, Lwb/bp;

    .line 561
    .line 562
    invoke-direct {v8, v6, v1, v7}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 563
    .line 564
    .line 565
    iget-object v6, p0, Lwb/sf;->p:Li0/a1;

    .line 566
    .line 567
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    check-cast v7, Ljava/util/Set;

    .line 572
    .line 573
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v10

    .line 581
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    if-nez v10, :cond_16

    .line 586
    .line 587
    if-ne v11, v9, :cond_17

    .line 588
    .line 589
    :cond_16
    new-instance v11, Lwb/x1;

    .line 590
    .line 591
    const/4 v9, 0x2

    .line 592
    invoke-direct {v11, v4, v6, v9}, Lwb/x1;-><init>(Lwb/s0;Li0/a1;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :cond_17
    check-cast v11, Lfg/a;

    .line 599
    .line 600
    invoke-static {v8, v7, v11, p1, v3}, Lwb/ho;->x2(Lwb/bp;ZLfg/a;Li0/h0;I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 604
    .line 605
    .line 606
    goto :goto_8

    .line 607
    :cond_18
    const v6, 0x47d1aa6c

    .line 608
    .line 609
    .line 610
    invoke-virtual {p1, v6}, Li0/h0;->a0(I)V

    .line 611
    .line 612
    .line 613
    iget-object v6, v4, Lwb/s0;->b:Ljava/lang/String;

    .line 614
    .line 615
    iget-object v10, v4, Lwb/s0;->a:Ljava/lang/String;

    .line 616
    .line 617
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    if-eqz v11, :cond_19

    .line 622
    .line 623
    move-object v6, v10

    .line 624
    :cond_19
    invoke-static {v10, v7, v8}, Lwb/ho;->V5(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    iget-object v8, p0, Lwb/sf;->n:Lfg/p;

    .line 629
    .line 630
    invoke-virtual {p1, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v10

    .line 634
    invoke-virtual {p1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v11

    .line 638
    or-int/2addr v10, v11

    .line 639
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    if-nez v10, :cond_1a

    .line 644
    .line 645
    if-ne v11, v9, :cond_1b

    .line 646
    .line 647
    :cond_1a
    new-instance v11, Lwb/ah;

    .line 648
    .line 649
    const/4 v9, 0x0

    .line 650
    invoke-direct {v11, v8, v4, v9}, Lwb/ah;-><init>(Lfg/p;Lwb/s0;I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {p1, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    :cond_1b
    check-cast v11, Lfg/a;

    .line 657
    .line 658
    invoke-static {v6, v7, v11, p1, v3}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 662
    .line 663
    .line 664
    :goto_8
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    sub-int/2addr v4, v2

    .line 669
    if-ge v1, v4, :cond_1c

    .line 670
    .line 671
    const v1, -0x588566d3

    .line 672
    .line 673
    .line 674
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 675
    .line 676
    .line 677
    const/4 v1, 0x0

    .line 678
    invoke-static {v1, p1, v3, v2}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 679
    .line 680
    .line 681
    :goto_9
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 682
    .line 683
    .line 684
    goto :goto_a

    .line 685
    :cond_1c
    const v1, 0x47d8c103

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1, v1}, Li0/h0;->a0(I)V

    .line 689
    .line 690
    .line 691
    goto :goto_9

    .line 692
    :goto_a
    move v1, v5

    .line 693
    goto/16 :goto_7

    .line 694
    .line 695
    :cond_1d
    invoke-static {}, La/a;->Q0()V

    .line 696
    .line 697
    .line 698
    const/4 p1, 0x0

    .line 699
    throw p1

    .line 700
    :cond_1e
    invoke-virtual {p1, v3}, Li0/h0;->p(Z)V

    .line 701
    .line 702
    .line 703
    goto :goto_b

    .line 704
    :cond_1f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 705
    .line 706
    .line 707
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 708
    .line 709
    return-object p1

    .line 710
    nop

    .line 711
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
