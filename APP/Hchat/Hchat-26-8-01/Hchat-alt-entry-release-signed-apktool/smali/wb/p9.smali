.class public final synthetic Lwb/p9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;


# direct methods
.method public synthetic constructor <init>(IILfg/a;)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/p9;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/p9;->h:Lfg/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lfg/a;I)V
    .locals 0

    .line 9
    iput p2, p0, Lwb/p9;->g:I

    iput-object p1, p0, Lwb/p9;->h:Lfg/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/p9;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x7

    .line 14
    invoke-static {p2}, Li0/r;->C(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, Lwb/p9;->h:Lfg/a;

    .line 19
    .line 20
    invoke-static {v0, p1, p2}, Lwb/ho;->k0(Lfg/a;Li0/h0;I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_0
    move-object v4, p1

    .line 27
    check-cast v4, Li0/h0;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    and-int/lit8 p2, p1, 0x3

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eq p2, v0, :cond_0

    .line 41
    .line 42
    move p2, v6

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move p2, v7

    .line 45
    :goto_1
    and-int/2addr p1, v6

    .line 46
    invoke-virtual {v4, p1, p2}, Li0/h0;->S(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object p1, p0, Lwb/p9;->h:Lfg/a;

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    const p1, -0x40635a55

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    const p2, -0x40635a54

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, p2}, Li0/h0;->a0(I)V

    .line 71
    .line 72
    .line 73
    const/16 p2, 0x28

    .line 74
    .line 75
    int-to-float p2, p2

    .line 76
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 77
    .line 78
    invoke-static {v0, p2}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p2, p1}, Lwb/ho;->O6(Ly0/o;Lfg/a;)Ly0/o;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object p2, Ly0/b;->k:Ly0/g;

    .line 87
    .line 88
    invoke-static {p2, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iget-wide v1, v4, Li0/h0;->T:J

    .line 93
    .line 94
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v4, p1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget-object v3, Lx1/g;->f:Lx1/f;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v3, Lx1/f;->b:Lx1/y;

    .line 112
    .line 113
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 114
    .line 115
    .line 116
    iget-boolean v5, v4, Li0/h0;->S:Z

    .line 117
    .line 118
    if-eqz v5, :cond_2

    .line 119
    .line 120
    invoke-virtual {v4, v3}, Li0/h0;->k(Lfg/a;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 125
    .line 126
    .line 127
    :goto_2
    sget-object v3, Lx1/f;->e:Lx1/e;

    .line 128
    .line 129
    invoke-static {v3, v4, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object p2, Lx1/f;->d:Lx1/e;

    .line 133
    .line 134
    invoke-static {p2, v4, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 142
    .line 143
    invoke-static {v1, v4, p2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sget-object p2, Lx1/f;->g:Lx1/d;

    .line 147
    .line 148
    invoke-static {p2, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 149
    .line 150
    .line 151
    sget-object p2, Lx1/f;->c:Lx1/e;

    .line 152
    .line 153
    invoke-static {p2, v4, p1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-object p1, v0

    .line 157
    sget-object v0, Lwb/ap;->a:Lm1/f;

    .line 158
    .line 159
    sget-object p2, Lbi/d;->a:Li0/m2;

    .line 160
    .line 161
    invoke-virtual {v4, p2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    check-cast p2, Lbi/b;

    .line 166
    .line 167
    invoke-virtual {p2}, Lbi/b;->g()J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    new-instance v3, Lf1/n;

    .line 172
    .line 173
    const/4 p2, 0x5

    .line 174
    invoke-direct {v3, v1, v2, p2}, Lf1/n;-><init>(JI)V

    .line 175
    .line 176
    .line 177
    const/16 p2, 0x18

    .line 178
    .line 179
    int-to-float p2, p2

    .line 180
    invoke-static {p1, p2}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const-string v1, "\u8fd4\u56de"

    .line 185
    .line 186
    const/16 v5, 0x1b6

    .line 187
    .line 188
    invoke-static/range {v0 .. v5}, Lk/n;->c(Lm1/f;Ljava/lang/String;Ly0/o;Lf1/n;Li0/h0;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v6}, Li0/h0;->p(Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_3
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 199
    .line 200
    .line 201
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 205
    .line 206
    check-cast p2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    and-int/lit8 v0, p2, 0x3

    .line 213
    .line 214
    const/4 v1, 0x2

    .line 215
    const/4 v2, 0x1

    .line 216
    if-eq v0, v1, :cond_4

    .line 217
    .line 218
    move v0, v2

    .line 219
    goto :goto_4

    .line 220
    :cond_4
    const/4 v0, 0x0

    .line 221
    :goto_4
    and-int/2addr p2, v2

    .line 222
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    if-eqz p2, :cond_5

    .line 227
    .line 228
    const-string p2, "\u6dfb\u52a0\u4e00\u6761\u6309\u987a\u5e8f\u53d1\u9001\u7684\u56de\u590d"

    .line 229
    .line 230
    const/16 v0, 0x36

    .line 231
    .line 232
    const-string v1, "\u65b0\u589e\u56de\u590d"

    .line 233
    .line 234
    iget-object v2, p0, Lwb/p9;->h:Lfg/a;

    .line 235
    .line 236
    invoke-static {v1, p2, v2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_5
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 241
    .line 242
    .line 243
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 244
    .line 245
    return-object p1

    .line 246
    :pswitch_2
    check-cast p1, Li0/h0;

    .line 247
    .line 248
    check-cast p2, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result p2

    .line 254
    and-int/lit8 v0, p2, 0x3

    .line 255
    .line 256
    const/4 v1, 0x2

    .line 257
    const/4 v2, 0x1

    .line 258
    if-eq v0, v1, :cond_6

    .line 259
    .line 260
    move v0, v2

    .line 261
    goto :goto_6

    .line 262
    :cond_6
    const/4 v0, 0x0

    .line 263
    :goto_6
    and-int/2addr p2, v2

    .line 264
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    if-eqz p2, :cond_9

    .line 269
    .line 270
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 271
    .line 272
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-nez v0, :cond_7

    .line 281
    .line 282
    sget-object v0, Li0/l;->a:Li0/e;

    .line 283
    .line 284
    if-ne v1, v0, :cond_8

    .line 285
    .line 286
    :cond_7
    new-instance v1, Lwb/kc;

    .line 287
    .line 288
    const/16 v0, 0x17

    .line 289
    .line 290
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_8
    check-cast v1, Lfg/a;

    .line 297
    .line 298
    const/16 p2, 0x36

    .line 299
    .line 300
    const-string v0, "\u5220\u9664\u5f53\u524d\u7fa4"

    .line 301
    .line 302
    const-string v2, "\u79fb\u9664\u76d1\u542c\u3001\u6a21\u677f\u7ed1\u5b9a\u548c\u672c\u7fa4\u4e13\u5c5e\u8bbe\u7f6e"

    .line 303
    .line 304
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_9
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 309
    .line 310
    .line 311
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 312
    .line 313
    return-object p1

    .line 314
    :pswitch_3
    check-cast p1, Li0/h0;

    .line 315
    .line 316
    check-cast p2, Ljava/lang/Integer;

    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    and-int/lit8 v0, p2, 0x3

    .line 323
    .line 324
    const/4 v1, 0x2

    .line 325
    const/4 v2, 0x1

    .line 326
    if-eq v0, v1, :cond_a

    .line 327
    .line 328
    move v0, v2

    .line 329
    goto :goto_8

    .line 330
    :cond_a
    const/4 v0, 0x0

    .line 331
    :goto_8
    and-int/2addr p2, v2

    .line 332
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    if-eqz p2, :cond_d

    .line 337
    .line 338
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 339
    .line 340
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    if-nez v0, :cond_b

    .line 349
    .line 350
    sget-object v0, Li0/l;->a:Li0/e;

    .line 351
    .line 352
    if-ne v1, v0, :cond_c

    .line 353
    .line 354
    :cond_b
    new-instance v1, Lwb/kc;

    .line 355
    .line 356
    const/16 v0, 0x16

    .line 357
    .line 358
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :cond_c
    check-cast v1, Lfg/a;

    .line 365
    .line 366
    const/16 p2, 0x36

    .line 367
    .line 368
    const-string v0, "\u5220\u9664\u6a21\u677f"

    .line 369
    .line 370
    const-string v2, "\u5220\u9664\u540e\u7ed1\u5b9a\u5173\u7cfb\u4e5f\u4f1a\u79fb\u9664"

    .line 371
    .line 372
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 373
    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 377
    .line 378
    .line 379
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 380
    .line 381
    return-object p1

    .line 382
    :pswitch_4
    check-cast p1, Li0/h0;

    .line 383
    .line 384
    check-cast p2, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result p2

    .line 390
    and-int/lit8 v0, p2, 0x3

    .line 391
    .line 392
    const/4 v1, 0x2

    .line 393
    const/4 v2, 0x1

    .line 394
    if-eq v0, v1, :cond_e

    .line 395
    .line 396
    move v0, v2

    .line 397
    goto :goto_a

    .line 398
    :cond_e
    const/4 v0, 0x0

    .line 399
    :goto_a
    and-int/2addr p2, v2

    .line 400
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 401
    .line 402
    .line 403
    move-result p2

    .line 404
    if-eqz p2, :cond_f

    .line 405
    .line 406
    const-string p2, "\u5220\u9664\u540e\u76f8\u5173\u804a\u5929\u6062\u590d\u9ed8\u8ba4\u89c4\u5219"

    .line 407
    .line 408
    const/16 v0, 0x36

    .line 409
    .line 410
    const-string v1, "\u5220\u9664\u6a21\u677f"

    .line 411
    .line 412
    iget-object v2, p0, Lwb/p9;->h:Lfg/a;

    .line 413
    .line 414
    invoke-static {v1, p2, v2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 415
    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 419
    .line 420
    .line 421
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 422
    .line 423
    return-object p1

    .line 424
    :pswitch_5
    check-cast p1, Li0/h0;

    .line 425
    .line 426
    check-cast p2, Ljava/lang/Integer;

    .line 427
    .line 428
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    and-int/lit8 v0, p2, 0x3

    .line 433
    .line 434
    const/4 v1, 0x2

    .line 435
    const/4 v2, 0x1

    .line 436
    if-eq v0, v1, :cond_10

    .line 437
    .line 438
    move v0, v2

    .line 439
    goto :goto_c

    .line 440
    :cond_10
    const/4 v0, 0x0

    .line 441
    :goto_c
    and-int/2addr p2, v2

    .line 442
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 443
    .line 444
    .line 445
    move-result p2

    .line 446
    if-eqz p2, :cond_11

    .line 447
    .line 448
    const-string p2, "\u5220\u9664\u540e\u4e0d\u4f1a\u79fb\u9664\u539f\u529f\u80fd\u4e2d\u5df2\u7ecf\u4fdd\u5b58\u7684\u7fa4\u804a"

    .line 449
    .line 450
    const/16 v0, 0x36

    .line 451
    .line 452
    const-string v1, "\u5220\u9664\u6807\u7b7e"

    .line 453
    .line 454
    iget-object v2, p0, Lwb/p9;->h:Lfg/a;

    .line 455
    .line 456
    invoke-static {v1, p2, v2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 457
    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_11
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 461
    .line 462
    .line 463
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 464
    .line 465
    return-object p1

    .line 466
    :pswitch_6
    check-cast p1, Li0/h0;

    .line 467
    .line 468
    check-cast p2, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result p2

    .line 474
    and-int/lit8 v0, p2, 0x3

    .line 475
    .line 476
    const/4 v1, 0x2

    .line 477
    const/4 v2, 0x1

    .line 478
    if-eq v0, v1, :cond_12

    .line 479
    .line 480
    move v0, v2

    .line 481
    goto :goto_e

    .line 482
    :cond_12
    const/4 v0, 0x0

    .line 483
    :goto_e
    and-int/2addr p2, v2

    .line 484
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 485
    .line 486
    .line 487
    move-result p2

    .line 488
    if-eqz p2, :cond_15

    .line 489
    .line 490
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 491
    .line 492
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    if-nez v0, :cond_13

    .line 501
    .line 502
    sget-object v0, Li0/l;->a:Li0/e;

    .line 503
    .line 504
    if-ne v1, v0, :cond_14

    .line 505
    .line 506
    :cond_13
    new-instance v1, Lwb/kc;

    .line 507
    .line 508
    const/4 v0, 0x4

    .line 509
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    :cond_14
    check-cast v1, Lfg/a;

    .line 516
    .line 517
    const/16 p2, 0x36

    .line 518
    .line 519
    const-string v0, "\u5220\u9664\u89c4\u5219"

    .line 520
    .line 521
    const-string v2, "\u79fb\u9664\u8be5\u4f1a\u8bdd\u81ea\u5b9a\u4e49\u901a\u77e5\u914d\u7f6e"

    .line 522
    .line 523
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 524
    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_15
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 528
    .line 529
    .line 530
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 531
    .line 532
    return-object p1

    .line 533
    :pswitch_7
    check-cast p1, Li0/h0;

    .line 534
    .line 535
    check-cast p2, Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    and-int/lit8 v0, p2, 0x3

    .line 542
    .line 543
    const/4 v1, 0x2

    .line 544
    const/4 v2, 0x1

    .line 545
    if-eq v0, v1, :cond_16

    .line 546
    .line 547
    move v0, v2

    .line 548
    goto :goto_10

    .line 549
    :cond_16
    const/4 v0, 0x0

    .line 550
    :goto_10
    and-int/2addr p2, v2

    .line 551
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 552
    .line 553
    .line 554
    move-result p2

    .line 555
    if-eqz p2, :cond_19

    .line 556
    .line 557
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 558
    .line 559
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    if-nez v0, :cond_17

    .line 568
    .line 569
    sget-object v0, Li0/l;->a:Li0/e;

    .line 570
    .line 571
    if-ne v1, v0, :cond_18

    .line 572
    .line 573
    :cond_17
    new-instance v1, Lwb/kc;

    .line 574
    .line 575
    const/16 v0, 0x9

    .line 576
    .line 577
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    :cond_18
    check-cast v1, Lfg/a;

    .line 584
    .line 585
    const/16 p2, 0x36

    .line 586
    .line 587
    const-string v0, "\u6e05\u7a7a\u6240\u6709\u5173\u952e\u8bcd"

    .line 588
    .line 589
    const-string v2, "\u79fb\u9664\u5168\u90e8\u5173\u952e\u8bcd"

    .line 590
    .line 591
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 592
    .line 593
    .line 594
    goto :goto_11

    .line 595
    :cond_19
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 596
    .line 597
    .line 598
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 599
    .line 600
    return-object p1

    .line 601
    :pswitch_8
    check-cast p1, Li0/h0;

    .line 602
    .line 603
    check-cast p2, Ljava/lang/Integer;

    .line 604
    .line 605
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result p2

    .line 609
    and-int/lit8 v0, p2, 0x3

    .line 610
    .line 611
    const/4 v1, 0x2

    .line 612
    const/4 v2, 0x1

    .line 613
    if-eq v0, v1, :cond_1a

    .line 614
    .line 615
    move v0, v2

    .line 616
    goto :goto_12

    .line 617
    :cond_1a
    const/4 v0, 0x0

    .line 618
    :goto_12
    and-int/2addr p2, v2

    .line 619
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 620
    .line 621
    .line 622
    move-result p2

    .line 623
    if-eqz p2, :cond_1d

    .line 624
    .line 625
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 626
    .line 627
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    if-nez v0, :cond_1b

    .line 636
    .line 637
    sget-object v0, Li0/l;->a:Li0/e;

    .line 638
    .line 639
    if-ne v1, v0, :cond_1c

    .line 640
    .line 641
    :cond_1b
    new-instance v1, Lwb/kc;

    .line 642
    .line 643
    const/16 v0, 0xf

    .line 644
    .line 645
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_1c
    check-cast v1, Lfg/a;

    .line 652
    .line 653
    const/16 p2, 0x36

    .line 654
    .line 655
    const-string v0, "\u81ea\u5b9a\u4e49\u7fa4\u53d1"

    .line 656
    .line 657
    const-string v2, "\u7f16\u8f91\u5185\u5bb9\u5e76\u9009\u62e9\u6a21\u5757\u6216\u5fae\u4fe1\u539f\u751f\u901a\u9053"

    .line 658
    .line 659
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 660
    .line 661
    .line 662
    goto :goto_13

    .line 663
    :cond_1d
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 664
    .line 665
    .line 666
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 667
    .line 668
    return-object p1

    .line 669
    :pswitch_9
    check-cast p1, Li0/h0;

    .line 670
    .line 671
    check-cast p2, Ljava/lang/Integer;

    .line 672
    .line 673
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 674
    .line 675
    .line 676
    move-result p2

    .line 677
    and-int/lit8 v0, p2, 0x3

    .line 678
    .line 679
    const/4 v1, 0x2

    .line 680
    const/4 v2, 0x1

    .line 681
    if-eq v0, v1, :cond_1e

    .line 682
    .line 683
    move v0, v2

    .line 684
    goto :goto_14

    .line 685
    :cond_1e
    const/4 v0, 0x0

    .line 686
    :goto_14
    and-int/2addr p2, v2

    .line 687
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 688
    .line 689
    .line 690
    move-result p2

    .line 691
    if-eqz p2, :cond_1f

    .line 692
    .line 693
    const-string p2, "\u79fb\u9664\u540e\u6062\u590d\u9ed8\u8ba4\u89c4\u5219"

    .line 694
    .line 695
    const/16 v0, 0x36

    .line 696
    .line 697
    const-string v1, "\u79fb\u9664\u9002\u7528\u804a\u5929"

    .line 698
    .line 699
    iget-object v2, p0, Lwb/p9;->h:Lfg/a;

    .line 700
    .line 701
    invoke-static {v1, p2, v2, p1, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 702
    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_1f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 706
    .line 707
    .line 708
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 709
    .line 710
    return-object p1

    .line 711
    :pswitch_a
    check-cast p1, Li0/h0;

    .line 712
    .line 713
    check-cast p2, Ljava/lang/Integer;

    .line 714
    .line 715
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 716
    .line 717
    .line 718
    move-result p2

    .line 719
    and-int/lit8 v0, p2, 0x3

    .line 720
    .line 721
    const/4 v1, 0x2

    .line 722
    const/4 v2, 0x1

    .line 723
    if-eq v0, v1, :cond_20

    .line 724
    .line 725
    move v0, v2

    .line 726
    goto :goto_16

    .line 727
    :cond_20
    const/4 v0, 0x0

    .line 728
    :goto_16
    and-int/2addr p2, v2

    .line 729
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 730
    .line 731
    .line 732
    move-result p2

    .line 733
    if-eqz p2, :cond_23

    .line 734
    .line 735
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 736
    .line 737
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    if-nez v0, :cond_21

    .line 746
    .line 747
    sget-object v0, Li0/l;->a:Li0/e;

    .line 748
    .line 749
    if-ne v1, v0, :cond_22

    .line 750
    .line 751
    :cond_21
    new-instance v1, Lwb/kc;

    .line 752
    .line 753
    const/16 v0, 0xa

    .line 754
    .line 755
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    :cond_22
    check-cast v1, Lfg/a;

    .line 762
    .line 763
    const/16 p2, 0x36

    .line 764
    .line 765
    const-string v0, "\u5220\u9664\u5173\u952e\u8bcd"

    .line 766
    .line 767
    const-string v2, "\u79fb\u9664\u8be5\u5173\u952e\u8bcd"

    .line 768
    .line 769
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 770
    .line 771
    .line 772
    goto :goto_17

    .line 773
    :cond_23
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 774
    .line 775
    .line 776
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 777
    .line 778
    return-object p1

    .line 779
    :pswitch_b
    check-cast p1, Li0/h0;

    .line 780
    .line 781
    check-cast p2, Ljava/lang/Integer;

    .line 782
    .line 783
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 784
    .line 785
    .line 786
    move-result p2

    .line 787
    and-int/lit8 v0, p2, 0x3

    .line 788
    .line 789
    const/4 v1, 0x2

    .line 790
    const/4 v2, 0x1

    .line 791
    if-eq v0, v1, :cond_24

    .line 792
    .line 793
    move v0, v2

    .line 794
    goto :goto_18

    .line 795
    :cond_24
    const/4 v0, 0x0

    .line 796
    :goto_18
    and-int/2addr p2, v2

    .line 797
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 798
    .line 799
    .line 800
    move-result p2

    .line 801
    if-eqz p2, :cond_27

    .line 802
    .line 803
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 804
    .line 805
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    if-nez v0, :cond_25

    .line 814
    .line 815
    sget-object v0, Li0/l;->a:Li0/e;

    .line 816
    .line 817
    if-ne v1, v0, :cond_26

    .line 818
    .line 819
    :cond_25
    new-instance v1, Lwb/kc;

    .line 820
    .line 821
    const/16 v0, 0xd

    .line 822
    .line 823
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    :cond_26
    check-cast v1, Lfg/a;

    .line 830
    .line 831
    const/16 p2, 0x36

    .line 832
    .line 833
    const-string v0, "\u5220\u9664\u6a21\u677f"

    .line 834
    .line 835
    const-string v2, "\u5220\u9664\u540e\u540c\u65f6\u89e3\u9664\u6240\u6709\u7fa4\u7ed1\u5b9a"

    .line 836
    .line 837
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 838
    .line 839
    .line 840
    goto :goto_19

    .line 841
    :cond_27
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 842
    .line 843
    .line 844
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 845
    .line 846
    return-object p1

    .line 847
    :pswitch_c
    check-cast p1, Li0/h0;

    .line 848
    .line 849
    check-cast p2, Ljava/lang/Integer;

    .line 850
    .line 851
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 852
    .line 853
    .line 854
    move-result p2

    .line 855
    and-int/lit8 v0, p2, 0x3

    .line 856
    .line 857
    const/4 v1, 0x2

    .line 858
    const/4 v2, 0x1

    .line 859
    if-eq v0, v1, :cond_28

    .line 860
    .line 861
    move v0, v2

    .line 862
    goto :goto_1a

    .line 863
    :cond_28
    const/4 v0, 0x0

    .line 864
    :goto_1a
    and-int/2addr p2, v2

    .line 865
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 866
    .line 867
    .line 868
    move-result p2

    .line 869
    if-eqz p2, :cond_2b

    .line 870
    .line 871
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 872
    .line 873
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    if-nez v0, :cond_29

    .line 882
    .line 883
    sget-object v0, Li0/l;->a:Li0/e;

    .line 884
    .line 885
    if-ne v1, v0, :cond_2a

    .line 886
    .line 887
    :cond_29
    new-instance v1, Lwb/kc;

    .line 888
    .line 889
    const/4 v0, 0x0

    .line 890
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    :cond_2a
    check-cast v1, Lfg/a;

    .line 897
    .line 898
    const/16 p2, 0x36

    .line 899
    .line 900
    const-string v0, "\u5728\u7ebf\u63d2\u4ef6"

    .line 901
    .line 902
    const-string v2, "\u6d4f\u89c8\u3001\u5b89\u88c5\u6216\u4e0a\u4f20\u793e\u533a\u811a\u672c\u63d2\u4ef6"

    .line 903
    .line 904
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 905
    .line 906
    .line 907
    goto :goto_1b

    .line 908
    :cond_2b
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 909
    .line 910
    .line 911
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 912
    .line 913
    return-object p1

    .line 914
    :pswitch_d
    check-cast p1, Li0/h0;

    .line 915
    .line 916
    check-cast p2, Ljava/lang/Integer;

    .line 917
    .line 918
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 919
    .line 920
    .line 921
    move-result p2

    .line 922
    and-int/lit8 v0, p2, 0x3

    .line 923
    .line 924
    const/4 v1, 0x2

    .line 925
    const/4 v2, 0x1

    .line 926
    if-eq v0, v1, :cond_2c

    .line 927
    .line 928
    move v0, v2

    .line 929
    goto :goto_1c

    .line 930
    :cond_2c
    const/4 v0, 0x0

    .line 931
    :goto_1c
    and-int/2addr p2, v2

    .line 932
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 933
    .line 934
    .line 935
    move-result p2

    .line 936
    if-eqz p2, :cond_2f

    .line 937
    .line 938
    iget-object p2, p0, Lwb/p9;->h:Lfg/a;

    .line 939
    .line 940
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    move-result v0

    .line 944
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    if-nez v0, :cond_2d

    .line 949
    .line 950
    sget-object v0, Li0/l;->a:Li0/e;

    .line 951
    .line 952
    if-ne v1, v0, :cond_2e

    .line 953
    .line 954
    :cond_2d
    new-instance v1, Lwb/kc;

    .line 955
    .line 956
    const/4 v0, 0x1

    .line 957
    invoke-direct {v1, p2, v0}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    :cond_2e
    check-cast v1, Lfg/a;

    .line 964
    .line 965
    const/16 p2, 0x36

    .line 966
    .line 967
    const-string v0, "\u63d2\u4ef6 Agent"

    .line 968
    .line 969
    const-string v2, "\u6309\u9700\u6c42\u751f\u6210\u6216\u4fee\u6539\u811a\u672c\u63d2\u4ef6"

    .line 970
    .line 971
    invoke-static {v0, v2, v1, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 972
    .line 973
    .line 974
    goto :goto_1d

    .line 975
    :cond_2f
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 976
    .line 977
    .line 978
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 979
    .line 980
    return-object p1

    .line 981
    :pswitch_e
    check-cast p1, Li0/h0;

    .line 982
    .line 983
    check-cast p2, Ljava/lang/Integer;

    .line 984
    .line 985
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    const/4 p2, 0x1

    .line 989
    invoke-static {p2}, Li0/r;->C(I)I

    .line 990
    .line 991
    .line 992
    move-result p2

    .line 993
    iget-object v0, p0, Lwb/p9;->h:Lfg/a;

    .line 994
    .line 995
    invoke-static {v0, p1, p2}, Lwb/ho;->F3(Lfg/a;Li0/h0;I)V

    .line 996
    .line 997
    .line 998
    goto/16 :goto_0

    .line 999
    .line 1000
    nop

    .line 1001
    :pswitch_data_0
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
