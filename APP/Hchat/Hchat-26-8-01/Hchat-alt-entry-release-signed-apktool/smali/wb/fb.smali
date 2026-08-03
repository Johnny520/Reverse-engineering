.class public final synthetic Lwb/fb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lvb/a;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lvb/a;Landroid/content/SharedPreferences;Lfg/a;Landroid/content/Context;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p7, p0, Lwb/fb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/fb;->h:Lvb/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/fb;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/fb;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/fb;->k:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/fb;->l:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/fb;->m:Li0/a1;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/fb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lwb/wo;

    .line 7
    .line 8
    move-object v4, p2

    .line 9
    check-cast v4, Li0/h0;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    and-int/lit8 p3, p2, 0x6

    .line 21
    .line 22
    if-nez p3, :cond_2

    .line 23
    .line 24
    and-int/lit8 p3, p2, 0x8

    .line 25
    .line 26
    if-nez p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v4, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    :goto_0
    if-eqz p3, :cond_1

    .line 38
    .line 39
    const/4 p3, 0x4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 p3, 0x2

    .line 42
    :goto_1
    or-int/2addr p2, p3

    .line 43
    :cond_2
    and-int/lit8 p3, p2, 0x13

    .line 44
    .line 45
    const/16 v0, 0x12

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    if-eq p3, v0, :cond_3

    .line 50
    .line 51
    move p3, v1

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move p3, v7

    .line 54
    :goto_2
    and-int/2addr p2, v1

    .line 55
    invoke-virtual {v4, p2, p3}, Li0/h0;->S(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_a

    .line 60
    .line 61
    sget-object p2, Lwb/vo;->a:Lwb/vo;

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iget-object v1, p0, Lwb/fb;->i:Landroid/content/SharedPreferences;

    .line 68
    .line 69
    iget-object p3, p0, Lwb/fb;->l:Li0/a1;

    .line 70
    .line 71
    iget-object v0, p0, Lwb/fb;->m:Li0/a1;

    .line 72
    .line 73
    sget-object v2, Li0/l;->a:Li0/e;

    .line 74
    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    const p1, 0x3a2d28d2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Ljava/util/Set;

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-ne p2, v2, :cond_4

    .line 98
    .line 99
    new-instance p2, Lc9/x0;

    .line 100
    .line 101
    const/16 v2, 0x1b

    .line 102
    .line 103
    invoke-direct {p2, v2, p3, v0}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    check-cast p2, Lfg/a;

    .line 110
    .line 111
    const/16 v6, 0x6000

    .line 112
    .line 113
    iget-object v0, p0, Lwb/fb;->h:Lvb/a;

    .line 114
    .line 115
    iget-object v3, p0, Lwb/fb;->j:Lfg/a;

    .line 116
    .line 117
    move v2, p1

    .line 118
    move-object v5, v4

    .line 119
    move-object v4, p2

    .line 120
    invoke-static/range {v0 .. v6}, Lwb/ho;->s2(Lvb/a;Landroid/content/SharedPreferences;ILfg/a;Lfg/a;Li0/h0;I)V

    .line 121
    .line 122
    .line 123
    move-object v4, v5

    .line 124
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    instance-of p2, p1, Lwb/uo;

    .line 129
    .line 130
    if-eqz p2, :cond_9

    .line 131
    .line 132
    const p2, 0x3a2d893b

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p2}, Li0/h0;->a0(I)V

    .line 136
    .line 137
    .line 138
    check-cast p1, Lwb/uo;

    .line 139
    .line 140
    iget-object p1, p1, Lwb/uo;->a:Lwb/v0;

    .line 141
    .line 142
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    if-ne p2, v2, :cond_6

    .line 147
    .line 148
    new-instance p2, Lwb/bj;

    .line 149
    .line 150
    const/16 v3, 0x16

    .line 151
    .line 152
    invoke-direct {p2, v0, v3}, Lwb/bj;-><init>(Li0/a1;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_6
    check-cast p2, Lfg/a;

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    if-nez v3, :cond_7

    .line 169
    .line 170
    if-ne v5, v2, :cond_8

    .line 171
    .line 172
    :cond_7
    new-instance v5, Lwb/bc;

    .line 173
    .line 174
    const/4 v2, 0x6

    .line 175
    invoke-direct {v5, v1, p3, v0, v2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    move-object v3, v5

    .line 182
    check-cast v3, Lfg/l;

    .line 183
    .line 184
    const/16 v5, 0x180

    .line 185
    .line 186
    iget-object v0, p0, Lwb/fb;->k:Landroid/content/Context;

    .line 187
    .line 188
    move-object v1, p1

    .line 189
    move-object v2, p2

    .line 190
    invoke-static/range {v0 .. v5}, Lwb/ho;->b0(Landroid/content/Context;Lwb/v0;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_9
    const p1, 0x3a2d2311

    .line 198
    .line 199
    .line 200
    invoke-static {v4, p1, v7}, Lbc/e;->d(Li0/h0;IZ)Laf/d;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    throw p1

    .line 205
    :cond_a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 206
    .line 207
    .line 208
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 209
    .line 210
    return-object p1

    .line 211
    :pswitch_0
    check-cast p1, Lwb/qo;

    .line 212
    .line 213
    move-object v4, p2

    .line 214
    check-cast v4, Li0/h0;

    .line 215
    .line 216
    check-cast p3, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    and-int/lit8 p3, p2, 0x6

    .line 226
    .line 227
    if-nez p3, :cond_d

    .line 228
    .line 229
    and-int/lit8 p3, p2, 0x8

    .line 230
    .line 231
    if-nez p3, :cond_b

    .line 232
    .line 233
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p3

    .line 237
    goto :goto_4

    .line 238
    :cond_b
    invoke-virtual {v4, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result p3

    .line 242
    :goto_4
    if-eqz p3, :cond_c

    .line 243
    .line 244
    const/4 p3, 0x4

    .line 245
    goto :goto_5

    .line 246
    :cond_c
    const/4 p3, 0x2

    .line 247
    :goto_5
    or-int/2addr p2, p3

    .line 248
    :cond_d
    and-int/lit8 p3, p2, 0x13

    .line 249
    .line 250
    const/16 v0, 0x12

    .line 251
    .line 252
    const/4 v1, 0x1

    .line 253
    const/4 v7, 0x0

    .line 254
    if-eq p3, v0, :cond_e

    .line 255
    .line 256
    move p3, v1

    .line 257
    goto :goto_6

    .line 258
    :cond_e
    move p3, v7

    .line 259
    :goto_6
    and-int/2addr p2, v1

    .line 260
    invoke-virtual {v4, p2, p3}, Li0/h0;->S(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    if-eqz p2, :cond_15

    .line 265
    .line 266
    sget-object p2, Lwb/po;->a:Lwb/po;

    .line 267
    .line 268
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    iget-object v1, p0, Lwb/fb;->i:Landroid/content/SharedPreferences;

    .line 273
    .line 274
    iget-object p3, p0, Lwb/fb;->l:Li0/a1;

    .line 275
    .line 276
    iget-object v0, p0, Lwb/fb;->m:Li0/a1;

    .line 277
    .line 278
    sget-object v2, Li0/l;->a:Li0/e;

    .line 279
    .line 280
    if-eqz p2, :cond_10

    .line 281
    .line 282
    const p1, 0x3e569c15

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {p3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    check-cast p1, Ljava/util/Set;

    .line 293
    .line 294
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    if-ne p2, v2, :cond_f

    .line 303
    .line 304
    new-instance p2, Lc9/x0;

    .line 305
    .line 306
    const/16 v2, 0x1d

    .line 307
    .line 308
    invoke-direct {p2, v2, p3, v0}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_f
    check-cast p2, Lfg/a;

    .line 315
    .line 316
    const/16 v6, 0x6000

    .line 317
    .line 318
    iget-object v0, p0, Lwb/fb;->h:Lvb/a;

    .line 319
    .line 320
    iget-object v3, p0, Lwb/fb;->j:Lfg/a;

    .line 321
    .line 322
    move v2, p1

    .line 323
    move-object v5, v4

    .line 324
    move-object v4, p2

    .line 325
    invoke-static/range {v0 .. v6}, Lwb/ho;->k2(Lvb/a;Landroid/content/SharedPreferences;ILfg/a;Lfg/a;Li0/h0;I)V

    .line 326
    .line 327
    .line 328
    move-object v4, v5

    .line 329
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_10
    instance-of p2, p1, Lwb/oo;

    .line 334
    .line 335
    if-eqz p2, :cond_14

    .line 336
    .line 337
    const p2, 0x3e56fa3c

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, p2}, Li0/h0;->a0(I)V

    .line 341
    .line 342
    .line 343
    check-cast p1, Lwb/oo;

    .line 344
    .line 345
    iget-object p1, p1, Lwb/oo;->a:Lwb/v0;

    .line 346
    .line 347
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    if-ne p2, v2, :cond_11

    .line 352
    .line 353
    new-instance p2, Lwb/fk;

    .line 354
    .line 355
    const/16 v3, 0x10

    .line 356
    .line 357
    invoke-direct {p2, v0, v3}, Lwb/fk;-><init>(Li0/a1;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_11
    check-cast p2, Lfg/a;

    .line 364
    .line 365
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    if-nez v3, :cond_12

    .line 374
    .line 375
    if-ne v5, v2, :cond_13

    .line 376
    .line 377
    :cond_12
    new-instance v5, Lwb/bc;

    .line 378
    .line 379
    const/16 v2, 0x9

    .line 380
    .line 381
    invoke-direct {v5, v1, p3, v0, v2}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_13
    move-object v3, v5

    .line 388
    check-cast v3, Lfg/l;

    .line 389
    .line 390
    const/16 v5, 0x180

    .line 391
    .line 392
    iget-object v0, p0, Lwb/fb;->k:Landroid/content/Context;

    .line 393
    .line 394
    move-object v1, p1

    .line 395
    move-object v2, p2

    .line 396
    invoke-static/range {v0 .. v5}, Lwb/ho;->b0(Landroid/content/Context;Lwb/v0;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4, v7}, Li0/h0;->p(Z)V

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_14
    const p1, 0x3e5696db

    .line 404
    .line 405
    .line 406
    invoke-static {v4, p1, v7}, Lbc/e;->d(Li0/h0;IZ)Laf/d;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    throw p1

    .line 411
    :cond_15
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 412
    .line 413
    .line 414
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 415
    .line 416
    return-object p1

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
