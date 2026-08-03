.class public final synthetic Lwb/j9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lsh/x;

.field public final synthetic i:Lr/z;

.field public final synthetic j:Landroid/content/SharedPreferences;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsh/x;Lr/z;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/j9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/j9;->h:Lsh/x;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/j9;->i:Lr/z;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/j9;->j:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/j9;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/j9;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwb/j9;->g:I

    .line 2
    .line 3
    check-cast p1, Lp/x0;

    .line 4
    .line 5
    move-object v9, p2

    .line 6
    check-cast v9, Li0/h0;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    and-int/lit8 p3, p2, 0x6

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    const/4 p3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p3, 0x2

    .line 33
    :goto_0
    or-int/2addr p2, p3

    .line 34
    :cond_1
    and-int/lit8 p3, p2, 0x13

    .line 35
    .line 36
    const/16 v0, 0x12

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    if-eq p3, v0, :cond_2

    .line 40
    .line 41
    move p3, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p3, 0x0

    .line 44
    :goto_1
    and-int/2addr p2, v1

    .line 45
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 52
    .line 53
    iget-object p3, p0, Lwb/j9;->h:Lsh/x;

    .line 54
    .line 55
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {p1}, Lp/x0;->c()F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/16 p3, 0x8

    .line 67
    .line 68
    int-to-float p3, p3

    .line 69
    add-float/2addr p2, p3

    .line 70
    invoke-interface {p1}, Lp/x0;->a()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    const/16 p3, 0x54

    .line 75
    .line 76
    int-to-float p3, p3

    .line 77
    add-float/2addr p1, p3

    .line 78
    const/4 p3, 0x5

    .line 79
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object p1, p0, Lwb/j9;->j:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    sget-object p2, Li0/l;->a:Li0/e;

    .line 96
    .line 97
    if-ne p3, p2, :cond_4

    .line 98
    .line 99
    :cond_3
    new-instance p3, Lwb/bc;

    .line 100
    .line 101
    const/16 p2, 0xc

    .line 102
    .line 103
    iget-object v1, p0, Lwb/j9;->k:Li0/a1;

    .line 104
    .line 105
    iget-object v3, p0, Lwb/j9;->l:Li0/a1;

    .line 106
    .line 107
    invoke-direct {p3, p1, v1, v3, p2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    move-object v8, p3

    .line 114
    check-cast v8, Lfg/l;

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    const/16 v11, 0x1f8

    .line 118
    .line 119
    iget-object v1, p0, Lwb/j9;->i:Lr/z;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v4, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 131
    .line 132
    .line 133
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 134
    .line 135
    return-object p1

    .line 136
    :pswitch_0
    if-nez p3, :cond_7

    .line 137
    .line 138
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-eqz p3, :cond_6

    .line 143
    .line 144
    const/4 p3, 0x4

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    const/4 p3, 0x2

    .line 147
    :goto_3
    or-int/2addr p2, p3

    .line 148
    :cond_7
    and-int/lit8 p3, p2, 0x13

    .line 149
    .line 150
    const/16 v0, 0x12

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    if-eq p3, v0, :cond_8

    .line 154
    .line 155
    move p3, v1

    .line 156
    goto :goto_4

    .line 157
    :cond_8
    const/4 p3, 0x0

    .line 158
    :goto_4
    and-int/2addr p2, v1

    .line 159
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-eqz p2, :cond_b

    .line 164
    .line 165
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 166
    .line 167
    iget-object p3, p0, Lwb/j9;->h:Lsh/x;

    .line 168
    .line 169
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {p1}, Lp/x0;->c()F

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    const/16 p3, 0x8

    .line 181
    .line 182
    int-to-float p3, p3

    .line 183
    add-float/2addr p2, p3

    .line 184
    invoke-interface {p1}, Lp/x0;->a()F

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    const/16 p3, 0x54

    .line 189
    .line 190
    int-to-float p3, p3

    .line 191
    add-float/2addr p1, p3

    .line 192
    const/4 p3, 0x5

    .line 193
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget-object p1, p0, Lwb/j9;->j:Landroid/content/SharedPreferences;

    .line 198
    .line 199
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    if-nez p2, :cond_9

    .line 208
    .line 209
    sget-object p2, Li0/l;->a:Li0/e;

    .line 210
    .line 211
    if-ne p3, p2, :cond_a

    .line 212
    .line 213
    :cond_9
    new-instance p3, Lwb/bc;

    .line 214
    .line 215
    const/16 p2, 0xb

    .line 216
    .line 217
    iget-object v1, p0, Lwb/j9;->k:Li0/a1;

    .line 218
    .line 219
    iget-object v3, p0, Lwb/j9;->l:Li0/a1;

    .line 220
    .line 221
    invoke-direct {p3, p1, v1, v3, p2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_a
    move-object v8, p3

    .line 228
    check-cast v8, Lfg/l;

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    const/16 v11, 0x1f8

    .line 232
    .line 233
    iget-object v1, p0, Lwb/j9;->i:Lr/z;

    .line 234
    .line 235
    const/4 v3, 0x0

    .line 236
    const/4 v4, 0x0

    .line 237
    const/4 v5, 0x0

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v7, 0x0

    .line 240
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 245
    .line 246
    .line 247
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 248
    .line 249
    return-object p1

    .line 250
    :pswitch_1
    if-nez p3, :cond_d

    .line 251
    .line 252
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p3

    .line 256
    if-eqz p3, :cond_c

    .line 257
    .line 258
    const/4 p3, 0x4

    .line 259
    goto :goto_6

    .line 260
    :cond_c
    const/4 p3, 0x2

    .line 261
    :goto_6
    or-int/2addr p2, p3

    .line 262
    :cond_d
    and-int/lit8 p3, p2, 0x13

    .line 263
    .line 264
    const/16 v0, 0x12

    .line 265
    .line 266
    const/4 v1, 0x1

    .line 267
    if-eq p3, v0, :cond_e

    .line 268
    .line 269
    move p3, v1

    .line 270
    goto :goto_7

    .line 271
    :cond_e
    const/4 p3, 0x0

    .line 272
    :goto_7
    and-int/2addr p2, v1

    .line 273
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_11

    .line 278
    .line 279
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 280
    .line 281
    iget-object p3, p0, Lwb/j9;->h:Lsh/x;

    .line 282
    .line 283
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 284
    .line 285
    const/4 v0, 0x0

    .line 286
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-interface {p1}, Lp/x0;->c()F

    .line 291
    .line 292
    .line 293
    move-result p2

    .line 294
    const/16 p3, 0x8

    .line 295
    .line 296
    int-to-float p3, p3

    .line 297
    add-float/2addr p2, p3

    .line 298
    invoke-interface {p1}, Lp/x0;->a()F

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    const/16 p3, 0x54

    .line 303
    .line 304
    int-to-float p3, p3

    .line 305
    add-float/2addr p1, p3

    .line 306
    const/4 p3, 0x5

    .line 307
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    iget-object p1, p0, Lwb/j9;->j:Landroid/content/SharedPreferences;

    .line 312
    .line 313
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p3

    .line 321
    if-nez p2, :cond_f

    .line 322
    .line 323
    sget-object p2, Li0/l;->a:Li0/e;

    .line 324
    .line 325
    if-ne p3, p2, :cond_10

    .line 326
    .line 327
    :cond_f
    new-instance p3, Lwb/bc;

    .line 328
    .line 329
    const/16 p2, 0xa

    .line 330
    .line 331
    iget-object v1, p0, Lwb/j9;->k:Li0/a1;

    .line 332
    .line 333
    iget-object v3, p0, Lwb/j9;->l:Li0/a1;

    .line 334
    .line 335
    invoke-direct {p3, p1, v1, v3, p2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_10
    move-object v8, p3

    .line 342
    check-cast v8, Lfg/l;

    .line 343
    .line 344
    const/4 v10, 0x0

    .line 345
    const/16 v11, 0x1f8

    .line 346
    .line 347
    iget-object v1, p0, Lwb/j9;->i:Lr/z;

    .line 348
    .line 349
    const/4 v3, 0x0

    .line 350
    const/4 v4, 0x0

    .line 351
    const/4 v5, 0x0

    .line 352
    const/4 v6, 0x0

    .line 353
    const/4 v7, 0x0

    .line 354
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 355
    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_11
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 359
    .line 360
    .line 361
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 362
    .line 363
    return-object p1

    .line 364
    :pswitch_2
    if-nez p3, :cond_13

    .line 365
    .line 366
    invoke-virtual {v9, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result p3

    .line 370
    if-eqz p3, :cond_12

    .line 371
    .line 372
    const/4 p3, 0x4

    .line 373
    goto :goto_9

    .line 374
    :cond_12
    const/4 p3, 0x2

    .line 375
    :goto_9
    or-int/2addr p2, p3

    .line 376
    :cond_13
    and-int/lit8 p3, p2, 0x13

    .line 377
    .line 378
    const/16 v0, 0x12

    .line 379
    .line 380
    const/4 v1, 0x1

    .line 381
    if-eq p3, v0, :cond_14

    .line 382
    .line 383
    move p3, v1

    .line 384
    goto :goto_a

    .line 385
    :cond_14
    const/4 p3, 0x0

    .line 386
    :goto_a
    and-int/2addr p2, v1

    .line 387
    invoke-virtual {v9, p2, p3}, Li0/h0;->S(IZ)Z

    .line 388
    .line 389
    .line 390
    move-result p2

    .line 391
    if-eqz p2, :cond_17

    .line 392
    .line 393
    sget-object p2, Lp/h1;->c:Lp/a0;

    .line 394
    .line 395
    iget-object p3, p0, Lwb/j9;->h:Lsh/x;

    .line 396
    .line 397
    iget-object p3, p3, Lsh/x;->e:Lm/a;

    .line 398
    .line 399
    const/4 v0, 0x0

    .line 400
    invoke-static {p2, p3, v0}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-interface {p1}, Lp/x0;->c()F

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    const/16 p3, 0x8

    .line 409
    .line 410
    int-to-float p3, p3

    .line 411
    add-float/2addr p2, p3

    .line 412
    invoke-interface {p1}, Lp/x0;->a()F

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    const/16 p3, 0x54

    .line 417
    .line 418
    int-to-float p3, p3

    .line 419
    add-float/2addr p1, p3

    .line 420
    const/4 p3, 0x5

    .line 421
    invoke-static {p2, p1, p3}, Lp/d;->b(FFI)Lp/z0;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object p1, p0, Lwb/j9;->j:Landroid/content/SharedPreferences;

    .line 426
    .line 427
    invoke-virtual {v9, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result p2

    .line 431
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object p3

    .line 435
    if-nez p2, :cond_15

    .line 436
    .line 437
    sget-object p2, Li0/l;->a:Li0/e;

    .line 438
    .line 439
    if-ne p3, p2, :cond_16

    .line 440
    .line 441
    :cond_15
    new-instance p3, Lwb/bc;

    .line 442
    .line 443
    const/16 p2, 0x8

    .line 444
    .line 445
    iget-object v1, p0, Lwb/j9;->k:Li0/a1;

    .line 446
    .line 447
    iget-object v3, p0, Lwb/j9;->l:Li0/a1;

    .line 448
    .line 449
    invoke-direct {p3, p1, v1, v3, p2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v9, p3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_16
    move-object v8, p3

    .line 456
    check-cast v8, Lfg/l;

    .line 457
    .line 458
    const/4 v10, 0x0

    .line 459
    const/16 v11, 0x1f8

    .line 460
    .line 461
    iget-object v1, p0, Lwb/j9;->i:Lr/z;

    .line 462
    .line 463
    const/4 v3, 0x0

    .line 464
    const/4 v4, 0x0

    .line 465
    const/4 v5, 0x0

    .line 466
    const/4 v6, 0x0

    .line 467
    const/4 v7, 0x0

    .line 468
    invoke-static/range {v0 .. v11}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 469
    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_17
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 473
    .line 474
    .line 475
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 476
    .line 477
    return-object p1

    .line 478
    nop

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
