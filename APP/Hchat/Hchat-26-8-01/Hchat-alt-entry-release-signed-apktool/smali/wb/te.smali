.class public final synthetic Lwb/te;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/te;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/te;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/te;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/te;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/te;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/te;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/te;->m:Li0/a1;

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
    .locals 11

    .line 1
    iget v0, p0, Lwb/te;->g:I

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
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    move p2, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p2, v10

    .line 25
    :goto_0
    and-int/2addr p1, v9

    .line 26
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_a

    .line 31
    .line 32
    iget-object p1, p0, Lwb/te;->h:Li0/a1;

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
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v0, Li0/l;->a:Li0/e;

    .line 49
    .line 50
    if-ne p2, v0, :cond_1

    .line 51
    .line 52
    new-instance p2, Lwb/tg;

    .line 53
    .line 54
    const/16 v2, 0x1a

    .line 55
    .line 56
    invoke-direct {p2, p1, v2}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    move-object v5, p2

    .line 63
    check-cast v5, Lfg/l;

    .line 64
    .line 65
    const/16 v7, 0x61b0

    .line 66
    .line 67
    const/16 v8, 0x8

    .line 68
    .line 69
    const-string v2, "\u5e94\u7528\u542f\u7528\u72b6\u6001"

    .line 70
    .line 71
    const-string v3, "\u6279\u91cf\u5f00\u5173\u4f1a\u8bdd\u89c4\u5219"

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/4 p2, 0x0

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    const p1, 0x3427aa73

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {p2, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lwb/te;->i:Li0/a1;

    .line 100
    .line 101
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-ne v2, v0, :cond_2

    .line 116
    .line 117
    new-instance v2, Lwb/tg;

    .line 118
    .line 119
    const/16 v3, 0x1b

    .line 120
    .line 121
    invoke-direct {v2, p1, v3}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_2
    move-object v5, v2

    .line 128
    check-cast v5, Lfg/l;

    .line 129
    .line 130
    const/16 v7, 0x61b0

    .line 131
    .line 132
    const/16 v8, 0x8

    .line 133
    .line 134
    const-string v2, "\u542f\u7528\u89c4\u5219"

    .line 135
    .line 136
    const-string v3, "\u5173\u95ed\u540e\u4e0d\u518d\u63a5\u7ba1\u5bf9\u5e94\u4f1a\u8bdd\u901a\u77e5"

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    const p1, 0x3429d246

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 153
    .line 154
    .line 155
    :goto_1
    invoke-static {p2, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, Lwb/te;->j:Li0/a1;

    .line 159
    .line 160
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-ne v2, v0, :cond_4

    .line 175
    .line 176
    new-instance v2, Lwb/tg;

    .line 177
    .line 178
    const/16 v3, 0x1c

    .line 179
    .line 180
    invoke-direct {v2, p1, v3}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_4
    move-object v5, v2

    .line 187
    check-cast v5, Lfg/l;

    .line 188
    .line 189
    const/16 v7, 0x61b0

    .line 190
    .line 191
    const/16 v8, 0x8

    .line 192
    .line 193
    const-string v2, "\u5e94\u7528\u514d\u6253\u6270"

    .line 194
    .line 195
    const-string v3, "\u6279\u91cf\u8bbe\u7f6e\u662f\u5426\u5f39\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 196
    .line 197
    const/4 v4, 0x0

    .line 198
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_6

    .line 212
    .line 213
    const p1, 0x342c4017

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 217
    .line 218
    .line 219
    invoke-static {p2, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, Lwb/te;->k:Li0/a1;

    .line 223
    .line 224
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    if-ne v2, v0, :cond_5

    .line 239
    .line 240
    new-instance v2, Lwb/tg;

    .line 241
    .line 242
    const/16 v3, 0x1d

    .line 243
    .line 244
    invoke-direct {v2, p1, v3}, Lwb/tg;-><init>(Li0/a1;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_5
    move-object v5, v2

    .line 251
    check-cast v5, Lfg/l;

    .line 252
    .line 253
    const/16 v7, 0x61b0

    .line 254
    .line 255
    const/16 v8, 0x8

    .line 256
    .line 257
    const-string v2, "\u514d\u6253\u6270"

    .line 258
    .line 259
    const-string v3, "\u5f00\u542f\u540e\u4e0d\u5f39\u81ea\u5b9a\u4e49\u901a\u77e5\uff0c\u53ea\u62e6\u622a\u539f\u751f\u901a\u77e5"

    .line 260
    .line 261
    const/4 v4, 0x0

    .line 262
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_6
    const p1, 0x342e58e6

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 276
    .line 277
    .line 278
    :goto_2
    invoke-static {p2, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 279
    .line 280
    .line 281
    iget-object p1, p0, Lwb/te;->l:Li0/a1;

    .line 282
    .line 283
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, Ljava/lang/Boolean;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    if-ne v2, v0, :cond_7

    .line 298
    .line 299
    new-instance v2, Lwb/ih;

    .line 300
    .line 301
    const/4 v3, 0x0

    .line 302
    invoke-direct {v2, p1, v3}, Lwb/ih;-><init>(Li0/a1;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_7
    move-object v5, v2

    .line 309
    check-cast v5, Lfg/l;

    .line 310
    .line 311
    const/16 v7, 0x61b0

    .line 312
    .line 313
    const/16 v8, 0x8

    .line 314
    .line 315
    const-string v2, "\u5e94\u7528\u5fae\u4fe1\u514d\u6253\u6270\u7b56\u7565"

    .line 316
    .line 317
    const-string v3, "\u6279\u91cf\u8bbe\u7f6e\u662f\u5426\u5ffd\u7565\u5fae\u4fe1\u539f\u751f\u4f1a\u8bdd\u514d\u6253\u6270"

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    check-cast p1, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-eqz p1, :cond_9

    .line 334
    .line 335
    const p1, 0x34322640

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 339
    .line 340
    .line 341
    invoke-static {p2, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 342
    .line 343
    .line 344
    iget-object p1, p0, Lwb/te;->m:Li0/a1;

    .line 345
    .line 346
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    check-cast p2, Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p2

    .line 360
    if-ne p2, v0, :cond_8

    .line 361
    .line 362
    new-instance p2, Lwb/ih;

    .line 363
    .line 364
    const/4 v0, 0x1

    .line 365
    invoke-direct {p2, p1, v0}, Lwb/ih;-><init>(Li0/a1;I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v6, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_8
    move-object v5, p2

    .line 372
    check-cast v5, Lfg/l;

    .line 373
    .line 374
    const/16 v7, 0x61b0

    .line 375
    .line 376
    const/16 v8, 0x8

    .line 377
    .line 378
    const-string v2, "\u5ffd\u7565\u5fae\u4fe1\u81ea\u5e26\u7684\u6d88\u606f\u514d\u6253\u6270"

    .line 379
    .line 380
    const-string v3, "\u5f00\u542f\u540e\uff0c\u5bf9\u5e94\u4f1a\u8bdd\u5728\u5fae\u4fe1\u4e2d\u8bbe\u7f6e\u514d\u6253\u6270\u4ecd\u4f1a\u5f39\u51fa\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 387
    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_9
    const p1, 0x343675e6

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, p1}, Li0/h0;->a0(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 397
    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_a
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 401
    .line 402
    .line 403
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 404
    .line 405
    return-object p1

    .line 406
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 407
    .line 408
    check-cast p2, Ljava/lang/Integer;

    .line 409
    .line 410
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result p2

    .line 414
    and-int/lit8 v0, p2, 0x3

    .line 415
    .line 416
    const/4 v1, 0x2

    .line 417
    const/4 v2, 0x1

    .line 418
    if-eq v0, v1, :cond_b

    .line 419
    .line 420
    move v0, v2

    .line 421
    goto :goto_4

    .line 422
    :cond_b
    const/4 v0, 0x0

    .line 423
    :goto_4
    and-int/2addr p2, v2

    .line 424
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result p2

    .line 428
    if-eqz p2, :cond_d

    .line 429
    .line 430
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object p2

    .line 434
    sget-object v0, Li0/l;->a:Li0/e;

    .line 435
    .line 436
    if-ne p2, v0, :cond_c

    .line 437
    .line 438
    new-instance v1, Lc9/p0;

    .line 439
    .line 440
    const/4 v8, 0x7

    .line 441
    iget-object v2, p0, Lwb/te;->h:Li0/a1;

    .line 442
    .line 443
    iget-object v3, p0, Lwb/te;->i:Li0/a1;

    .line 444
    .line 445
    iget-object v4, p0, Lwb/te;->j:Li0/a1;

    .line 446
    .line 447
    iget-object v5, p0, Lwb/te;->k:Li0/a1;

    .line 448
    .line 449
    iget-object v6, p0, Lwb/te;->l:Li0/a1;

    .line 450
    .line 451
    iget-object v7, p0, Lwb/te;->m:Li0/a1;

    .line 452
    .line 453
    invoke-direct/range {v1 .. v8}, Lc9/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    move-object p2, v1

    .line 460
    :cond_c
    check-cast p2, Lfg/a;

    .line 461
    .line 462
    const/16 v0, 0x1b6

    .line 463
    .line 464
    const-string v1, "\u6062\u590d\u9ed8\u8ba4\u5916\u89c2"

    .line 465
    .line 466
    const-string v2, "\u6062\u590d\u6309\u94ae\u548c\u83dc\u5355\u540d\u79f0\u7684\u9ed8\u8ba4\u5916\u89c2"

    .line 467
    .line 468
    invoke-static {v1, v2, p2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 469
    .line 470
    .line 471
    goto :goto_5

    .line 472
    :cond_d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 473
    .line 474
    .line 475
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 476
    .line 477
    return-object p1

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
