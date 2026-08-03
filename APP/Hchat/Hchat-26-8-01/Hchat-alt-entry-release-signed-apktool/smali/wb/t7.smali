.class public final synthetic Lwb/t7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput v0, p0, Lwb/t7;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lwb/t7;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p1, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    iput-object p3, p0, Lwb/t7;->j:Li0/a1;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 15
    iput p4, p0, Lwb/t7;->g:I

    iput-object p1, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/t7;->i:Li0/a1;

    iput-object p3, p0, Lwb/t7;->j:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/t7;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lwb/n8;

    .line 37
    .line 38
    const/16 p3, 0xd

    .line 39
    .line 40
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 43
    .line 44
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 45
    .line 46
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 47
    .line 48
    .line 49
    const p3, 0x55889bd7

    .line 50
    .line 51
    .line 52
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 p3, 0x30

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_0
    const/16 v0, 0x10

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    if-eq p1, v0, :cond_2

    .line 73
    .line 74
    move p1, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 p1, 0x0

    .line 77
    :goto_2
    and-int/2addr p3, v1

    .line 78
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    new-instance p1, Lwb/n8;

    .line 85
    .line 86
    const/4 p3, 0x4

    .line 87
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 88
    .line 89
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 90
    .line 91
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 92
    .line 93
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 94
    .line 95
    .line 96
    const p3, -0x77372d87

    .line 97
    .line 98
    .line 99
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const/16 p3, 0x30

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 111
    .line 112
    .line 113
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_1
    const/16 v0, 0x10

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    if-eq p1, v0, :cond_4

    .line 120
    .line 121
    move p1, v1

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    const/4 p1, 0x0

    .line 124
    :goto_4
    and-int/2addr p3, v1

    .line 125
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    new-instance p1, Lwb/n8;

    .line 132
    .line 133
    const/4 p3, 0x6

    .line 134
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 135
    .line 136
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 137
    .line 138
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 139
    .line 140
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 141
    .line 142
    .line 143
    const p3, 0x70d20160

    .line 144
    .line 145
    .line 146
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const/16 p3, 0x30

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 158
    .line 159
    .line 160
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 161
    .line 162
    return-object p1

    .line 163
    :pswitch_2
    const/16 v0, 0x10

    .line 164
    .line 165
    const/4 v1, 0x1

    .line 166
    if-eq p1, v0, :cond_6

    .line 167
    .line 168
    move p1, v1

    .line 169
    goto :goto_6

    .line 170
    :cond_6
    const/4 p1, 0x0

    .line 171
    :goto_6
    and-int/2addr p3, v1

    .line 172
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    new-instance p1, Lwb/n8;

    .line 179
    .line 180
    const/4 p3, 0x3

    .line 181
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 182
    .line 183
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 184
    .line 185
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 186
    .line 187
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 188
    .line 189
    .line 190
    const p3, -0x79caf65

    .line 191
    .line 192
    .line 193
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const/16 p3, 0x30

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 205
    .line 206
    .line 207
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 208
    .line 209
    return-object p1

    .line 210
    :pswitch_3
    const/16 v0, 0x10

    .line 211
    .line 212
    const/4 v1, 0x0

    .line 213
    const/4 v2, 0x1

    .line 214
    if-eq p1, v0, :cond_8

    .line 215
    .line 216
    move p1, v2

    .line 217
    goto :goto_8

    .line 218
    :cond_8
    move p1, v1

    .line 219
    :goto_8
    and-int/2addr p3, v2

    .line 220
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-eqz p1, :cond_d

    .line 225
    .line 226
    iget-object p1, p0, Lwb/t7;->j:Li0/a1;

    .line 227
    .line 228
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    check-cast p3, Ljava/util/List;

    .line 233
    .line 234
    iget-object v0, p0, Lwb/t7;->i:Li0/a1;

    .line 235
    .line 236
    invoke-virtual {p2, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    sget-object v4, Li0/l;->a:Li0/e;

    .line 245
    .line 246
    if-nez v2, :cond_9

    .line 247
    .line 248
    if-ne v3, v4, :cond_a

    .line 249
    .line 250
    :cond_9
    new-instance v3, Lwb/gj;

    .line 251
    .line 252
    const/16 v2, 0x12

    .line 253
    .line 254
    invoke-direct {v3, v0, v2}, Lwb/gj;-><init>(Li0/a1;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    check-cast v3, Lfg/l;

    .line 261
    .line 262
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 263
    .line 264
    invoke-virtual {p2, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    if-nez v2, :cond_b

    .line 273
    .line 274
    if-ne v5, v4, :cond_c

    .line 275
    .line 276
    :cond_b
    new-instance v5, Lwb/od;

    .line 277
    .line 278
    const/4 v2, 0x6

    .line 279
    invoke-direct {v5, v0, p1, v2}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_c
    check-cast v5, Lfg/a;

    .line 286
    .line 287
    invoke-static {p3, v3, v5, p2, v1}, Lwb/ho;->v3(Ljava/util/List;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 288
    .line 289
    .line 290
    goto :goto_9

    .line 291
    :cond_d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 292
    .line 293
    .line 294
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 295
    .line 296
    return-object p1

    .line 297
    :pswitch_4
    const/16 v0, 0x10

    .line 298
    .line 299
    const/4 v1, 0x1

    .line 300
    if-eq p1, v0, :cond_e

    .line 301
    .line 302
    move p1, v1

    .line 303
    goto :goto_a

    .line 304
    :cond_e
    const/4 p1, 0x0

    .line 305
    :goto_a
    and-int/2addr p3, v1

    .line 306
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-eqz p1, :cond_f

    .line 311
    .line 312
    new-instance p1, Lwb/n8;

    .line 313
    .line 314
    const/4 p3, 0x2

    .line 315
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 316
    .line 317
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 318
    .line 319
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 320
    .line 321
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 322
    .line 323
    .line 324
    const p3, 0x5b71f35

    .line 325
    .line 326
    .line 327
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    const/16 p3, 0x30

    .line 332
    .line 333
    const/4 v0, 0x0

    .line 334
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 335
    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 339
    .line 340
    .line 341
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 342
    .line 343
    return-object p1

    .line 344
    :pswitch_5
    const/16 v0, 0x10

    .line 345
    .line 346
    const/4 v1, 0x1

    .line 347
    if-eq p1, v0, :cond_10

    .line 348
    .line 349
    move p1, v1

    .line 350
    goto :goto_c

    .line 351
    :cond_10
    const/4 p1, 0x0

    .line 352
    :goto_c
    and-int/2addr p3, v1

    .line 353
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-eqz p1, :cond_11

    .line 358
    .line 359
    new-instance p1, Lwb/n8;

    .line 360
    .line 361
    const/4 p3, 0x0

    .line 362
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 363
    .line 364
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 365
    .line 366
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 367
    .line 368
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 369
    .line 370
    .line 371
    const p3, -0x534d230d

    .line 372
    .line 373
    .line 374
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    const/16 p3, 0x30

    .line 379
    .line 380
    const/4 v0, 0x0

    .line 381
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 382
    .line 383
    .line 384
    goto :goto_d

    .line 385
    :cond_11
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 386
    .line 387
    .line 388
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 389
    .line 390
    return-object p1

    .line 391
    :pswitch_6
    const/16 v0, 0x10

    .line 392
    .line 393
    const/4 v1, 0x1

    .line 394
    if-eq p1, v0, :cond_12

    .line 395
    .line 396
    move p1, v1

    .line 397
    goto :goto_e

    .line 398
    :cond_12
    const/4 p1, 0x0

    .line 399
    :goto_e
    and-int/2addr p3, v1

    .line 400
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    if-eqz p1, :cond_13

    .line 405
    .line 406
    new-instance p1, Lwb/n8;

    .line 407
    .line 408
    const/4 p3, 0x1

    .line 409
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 410
    .line 411
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 412
    .line 413
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 414
    .line 415
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 416
    .line 417
    .line 418
    const p3, 0x6a4b9f58

    .line 419
    .line 420
    .line 421
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    const/16 p3, 0x30

    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 429
    .line 430
    .line 431
    goto :goto_f

    .line 432
    :cond_13
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 433
    .line 434
    .line 435
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 436
    .line 437
    return-object p1

    .line 438
    :pswitch_7
    const/16 v0, 0x10

    .line 439
    .line 440
    const/4 v1, 0x1

    .line 441
    if-eq p1, v0, :cond_14

    .line 442
    .line 443
    move p1, v1

    .line 444
    goto :goto_10

    .line 445
    :cond_14
    const/4 p1, 0x0

    .line 446
    :goto_10
    and-int/2addr p3, v1

    .line 447
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-eqz p1, :cond_15

    .line 452
    .line 453
    new-instance p1, Lwb/n8;

    .line 454
    .line 455
    const/4 p3, 0x5

    .line 456
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 457
    .line 458
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 459
    .line 460
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 461
    .line 462
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 463
    .line 464
    .line 465
    const p3, -0x5a60591b

    .line 466
    .line 467
    .line 468
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    const/16 p3, 0x30

    .line 473
    .line 474
    const/4 v0, 0x0

    .line 475
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 476
    .line 477
    .line 478
    goto :goto_11

    .line 479
    :cond_15
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 480
    .line 481
    .line 482
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 483
    .line 484
    return-object p1

    .line 485
    :pswitch_8
    const/16 v0, 0x10

    .line 486
    .line 487
    const/4 v1, 0x1

    .line 488
    if-eq p1, v0, :cond_16

    .line 489
    .line 490
    move p1, v1

    .line 491
    goto :goto_12

    .line 492
    :cond_16
    const/4 p1, 0x0

    .line 493
    :goto_12
    and-int/2addr p3, v1

    .line 494
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 495
    .line 496
    .line 497
    move-result p1

    .line 498
    if-eqz p1, :cond_17

    .line 499
    .line 500
    new-instance p1, Lwb/n8;

    .line 501
    .line 502
    const/16 p3, 0x9

    .line 503
    .line 504
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 505
    .line 506
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 507
    .line 508
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 509
    .line 510
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 511
    .line 512
    .line 513
    const p3, -0x2869186e

    .line 514
    .line 515
    .line 516
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    const/16 p3, 0x30

    .line 521
    .line 522
    const/4 v0, 0x0

    .line 523
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 524
    .line 525
    .line 526
    goto :goto_13

    .line 527
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 528
    .line 529
    .line 530
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 531
    .line 532
    return-object p1

    .line 533
    :pswitch_9
    const/16 v0, 0x10

    .line 534
    .line 535
    const/4 v1, 0x1

    .line 536
    if-eq p1, v0, :cond_18

    .line 537
    .line 538
    move p1, v1

    .line 539
    goto :goto_14

    .line 540
    :cond_18
    const/4 p1, 0x0

    .line 541
    :goto_14
    and-int/2addr p3, v1

    .line 542
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 543
    .line 544
    .line 545
    move-result p1

    .line 546
    if-eqz p1, :cond_19

    .line 547
    .line 548
    new-instance p1, Lwb/n8;

    .line 549
    .line 550
    const/16 p3, 0xb

    .line 551
    .line 552
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 553
    .line 554
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 555
    .line 556
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 557
    .line 558
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 559
    .line 560
    .line 561
    const p3, -0x2b9059ed

    .line 562
    .line 563
    .line 564
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    const/16 p3, 0x30

    .line 569
    .line 570
    const/4 v0, 0x0

    .line 571
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 572
    .line 573
    .line 574
    goto :goto_15

    .line 575
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 576
    .line 577
    .line 578
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 579
    .line 580
    return-object p1

    .line 581
    :pswitch_a
    const/16 v0, 0x10

    .line 582
    .line 583
    const/4 v1, 0x1

    .line 584
    if-eq p1, v0, :cond_1a

    .line 585
    .line 586
    move p1, v1

    .line 587
    goto :goto_16

    .line 588
    :cond_1a
    const/4 p1, 0x0

    .line 589
    :goto_16
    and-int/2addr p3, v1

    .line 590
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 591
    .line 592
    .line 593
    move-result p1

    .line 594
    if-eqz p1, :cond_1b

    .line 595
    .line 596
    new-instance p1, Lwb/n8;

    .line 597
    .line 598
    const/16 p3, 0xa

    .line 599
    .line 600
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 601
    .line 602
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 603
    .line 604
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 605
    .line 606
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 607
    .line 608
    .line 609
    const p3, 0x73c822d6

    .line 610
    .line 611
    .line 612
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    const/16 p3, 0x30

    .line 617
    .line 618
    const/4 v0, 0x0

    .line 619
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 620
    .line 621
    .line 622
    goto :goto_17

    .line 623
    :cond_1b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 624
    .line 625
    .line 626
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 627
    .line 628
    return-object p1

    .line 629
    :pswitch_b
    const/16 v0, 0x10

    .line 630
    .line 631
    const/4 v1, 0x1

    .line 632
    if-eq p1, v0, :cond_1c

    .line 633
    .line 634
    move p1, v1

    .line 635
    goto :goto_18

    .line 636
    :cond_1c
    const/4 p1, 0x0

    .line 637
    :goto_18
    and-int/2addr p3, v1

    .line 638
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 639
    .line 640
    .line 641
    move-result p1

    .line 642
    if-eqz p1, :cond_1d

    .line 643
    .line 644
    new-instance p1, Lwb/n8;

    .line 645
    .line 646
    const/16 p3, 0x8

    .line 647
    .line 648
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 649
    .line 650
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 651
    .line 652
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 653
    .line 654
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 655
    .line 656
    .line 657
    const p3, 0x57a1f2a6

    .line 658
    .line 659
    .line 660
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    const/16 p3, 0x30

    .line 665
    .line 666
    const/4 v0, 0x0

    .line 667
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 668
    .line 669
    .line 670
    goto :goto_19

    .line 671
    :cond_1d
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 672
    .line 673
    .line 674
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 675
    .line 676
    return-object p1

    .line 677
    :pswitch_c
    const/16 v0, 0x10

    .line 678
    .line 679
    const/4 v1, 0x1

    .line 680
    if-eq p1, v0, :cond_1e

    .line 681
    .line 682
    move p1, v1

    .line 683
    goto :goto_1a

    .line 684
    :cond_1e
    const/4 p1, 0x0

    .line 685
    :goto_1a
    and-int/2addr p3, v1

    .line 686
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 687
    .line 688
    .line 689
    move-result p1

    .line 690
    if-eqz p1, :cond_1f

    .line 691
    .line 692
    new-instance p1, Lwb/n8;

    .line 693
    .line 694
    const/4 p3, 0x7

    .line 695
    iget-object v0, p0, Lwb/t7;->h:Landroid/content/SharedPreferences;

    .line 696
    .line 697
    iget-object v2, p0, Lwb/t7;->i:Li0/a1;

    .line 698
    .line 699
    iget-object v3, p0, Lwb/t7;->j:Li0/a1;

    .line 700
    .line 701
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/n8;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 702
    .line 703
    .line 704
    const p3, 0x1e5a8838

    .line 705
    .line 706
    .line 707
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    const/16 p3, 0x30

    .line 712
    .line 713
    const/4 v0, 0x0

    .line 714
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 715
    .line 716
    .line 717
    goto :goto_1b

    .line 718
    :cond_1f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 719
    .line 720
    .line 721
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 722
    .line 723
    return-object p1

    .line 724
    nop

    .line 725
    :pswitch_data_0
    .packed-switch 0x0
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
