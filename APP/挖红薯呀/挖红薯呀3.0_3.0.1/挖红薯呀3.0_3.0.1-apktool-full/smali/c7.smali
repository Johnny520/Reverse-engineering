.class public final synthetic Lc7;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc7;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lc7;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lc7;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lc7;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lna1;->a:Lna1;

    .line 5
    .line 6
    iget-object v3, p0, Lc7;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lc7;->e:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ldu0;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Ldu0;->d:Ljava/util/regex/Pattern;

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v1, v3}, Lg60;->c(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lod0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p0, Lkh0;

    .line 35
    .line 36
    check-cast v3, Lyi;

    .line 37
    .line 38
    iget-object v0, p0, Lkh0;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p0, p0, Lkh0;->a:[J

    .line 41
    .line 42
    array-length v4, p0

    .line 43
    add-int/lit8 v4, v4, -0x2

    .line 44
    .line 45
    if-ltz v4, :cond_3

    .line 46
    .line 47
    move v5, v1

    .line 48
    :goto_0
    aget-wide v6, p0, v5

    .line 49
    .line 50
    not-long v8, v6

    .line 51
    const/4 v10, 0x7

    .line 52
    shl-long/2addr v8, v10

    .line 53
    and-long/2addr v8, v6

    .line 54
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v8, v10

    .line 60
    cmp-long v8, v8, v10

    .line 61
    .line 62
    if-eqz v8, :cond_2

    .line 63
    .line 64
    sub-int v8, v5, v4

    .line 65
    .line 66
    not-int v8, v8

    .line 67
    ushr-int/lit8 v8, v8, 0x1f

    .line 68
    .line 69
    const/16 v9, 0x8

    .line 70
    .line 71
    rsub-int/lit8 v8, v8, 0x8

    .line 72
    .line 73
    move v10, v1

    .line 74
    :goto_1
    if-ge v10, v8, :cond_1

    .line 75
    .line 76
    const-wide/16 v11, 0xff

    .line 77
    .line 78
    and-long/2addr v11, v6

    .line 79
    const-wide/16 v13, 0x80

    .line 80
    .line 81
    cmp-long v11, v11, v13

    .line 82
    .line 83
    if-gez v11, :cond_0

    .line 84
    .line 85
    shl-int/lit8 v11, v5, 0x3

    .line 86
    .line 87
    add-int/2addr v11, v10

    .line 88
    aget-object v11, v0, v11

    .line 89
    .line 90
    invoke-virtual {v3, v11}, Lyi;->A(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    shr-long/2addr v6, v9

    .line 94
    add-int/lit8 v10, v10, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    if-ne v8, v9, :cond_3

    .line 98
    .line 99
    :cond_2
    if-eq v5, v4, :cond_3

    .line 100
    .line 101
    add-int/lit8 v5, v5, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    return-object v2

    .line 105
    :pswitch_1
    check-cast p0, Landroid/widget/TextView;

    .line 106
    .line 107
    check-cast v3, Landroid/graphics/drawable/GradientDrawable;

    .line 108
    .line 109
    invoke-static {p0, v3}, Lck0;->a(Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;)Lna1;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_2
    check-cast p0, Lo8;

    .line 115
    .line 116
    check-cast v3, Lit0;

    .line 117
    .line 118
    iget-object p0, p0, Lo8;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lg9;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_4

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    invoke-virtual {v3}, Lit0;->invoke()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :goto_2
    return-object v2

    .line 133
    :pswitch_3
    check-cast p0, Landroid/content/Context;

    .line 134
    .line 135
    check-cast v3, Landroid/widget/TextView;

    .line 136
    .line 137
    invoke-static {p0, v3}, Lvf0;->w(Landroid/content/Context;Landroid/widget/TextView;)Lna1;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_4
    check-cast p0, Landroid/content/Context;

    .line 143
    .line 144
    check-cast v3, Landroid/graphics/Bitmap;

    .line 145
    .line 146
    invoke-static {p0, v3}, Lzc0;->s(Landroid/content/Context;Landroid/graphics/Bitmap;)Lna1;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_5
    check-cast p0, Lzw0;

    .line 152
    .line 153
    check-cast v3, Lyw0;

    .line 154
    .line 155
    new-instance v0, Lf90;

    .line 156
    .line 157
    sget-object v1, Lis;->d:Lis;

    .line 158
    .line 159
    invoke-direct {v0, p0, v1, v3}, Lf90;-><init>(Lzw0;Ljava/util/Map;Lyw0;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_6
    check-cast p0, Ldn;

    .line 164
    .line 165
    check-cast v3, Lkm;

    .line 166
    .line 167
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, Lwn0;

    .line 172
    .line 173
    new-instance v0, Lu5;

    .line 174
    .line 175
    iget-object v1, v3, Llo0;->d:Lco0;

    .line 176
    .line 177
    iget-object v1, v1, Lco0;->f:Lt70;

    .line 178
    .line 179
    invoke-virtual {v1}, Lt70;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lz20;

    .line 184
    .line 185
    invoke-direct {v0, v1, p0}, Lu5;-><init>(Lz20;Lu50;)V

    .line 186
    .line 187
    .line 188
    new-instance v1, Lxn0;

    .line 189
    .line 190
    invoke-direct {v1, v3, p0, v0}, Lxn0;-><init>(Lkm;Lwn0;Lu5;)V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :pswitch_7
    check-cast p0, Lzt0;

    .line 195
    .line 196
    check-cast v3, Lgv;

    .line 197
    .line 198
    sget-object v0, Lvq0;->a:Lej;

    .line 199
    .line 200
    invoke-static {v3, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iput-object v0, p0, Lzt0;->d:Ljava/lang/Object;

    .line 205
    .line 206
    return-object v2

    .line 207
    :pswitch_8
    check-cast p0, Lwi;

    .line 208
    .line 209
    iget-object p0, p0, Lwi;->d:Lpi;

    .line 210
    .line 211
    iget-object v0, p0, Lpi;->c:Lw11;

    .line 212
    .line 213
    invoke-virtual {v0}, Lw11;->c()Lv11;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    move v4, v1

    .line 218
    :goto_3
    :try_start_0
    iget v5, v0, Lw11;->e:I

    .line 219
    .line 220
    const/4 v6, 0x0

    .line 221
    if-ge v4, v5, :cond_e

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Lv11;->l(I)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_8

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Lv11;->n(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    if-eq v5, v3, :cond_7

    .line 234
    .line 235
    instance-of v7, v5, Lku0;

    .line 236
    .line 237
    if-eqz v7, :cond_5

    .line 238
    .line 239
    check-cast v5, Lku0;

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_5
    move-object v5, v6

    .line 243
    :goto_4
    if-eqz v5, :cond_6

    .line 244
    .line 245
    iget-object v5, v5, Lku0;->a:Lju0;

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_6
    move-object v5, v6

    .line 249
    :goto_5
    if-ne v5, v3, :cond_8

    .line 250
    .line 251
    :cond_7
    new-instance v1, Llk0;

    .line 252
    .line 253
    invoke-direct {v1, v4, v6}, Llk0;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Lv11;->c()V

    .line 257
    .line 258
    .line 259
    move-object v6, v1

    .line 260
    goto :goto_b

    .line 261
    :catchall_0
    move-exception p0

    .line 262
    goto/16 :goto_d

    .line 263
    .line 264
    :cond_8
    :try_start_1
    iget-object v5, v2, Lv11;->b:[I

    .line 265
    .line 266
    invoke-static {v5, v4}, Ly11;->b([II)I

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    add-int/lit8 v8, v4, 0x1

    .line 271
    .line 272
    iget v9, v2, Lv11;->c:I

    .line 273
    .line 274
    if-ge v8, v9, :cond_9

    .line 275
    .line 276
    mul-int/lit8 v9, v8, 0x5

    .line 277
    .line 278
    add-int/lit8 v9, v9, 0x4

    .line 279
    .line 280
    aget v5, v5, v9

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_9
    iget v5, v2, Lv11;->e:I

    .line 284
    .line 285
    :goto_6
    sub-int/2addr v5, v7

    .line 286
    move v7, v1

    .line 287
    :goto_7
    if-ge v7, v5, :cond_f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v7}, Lv11;->h(II)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    if-eq v9, v3, :cond_d

    .line 294
    .line 295
    instance-of v10, v9, Lku0;

    .line 296
    .line 297
    if-eqz v10, :cond_a

    .line 298
    .line 299
    check-cast v9, Lku0;

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_a
    move-object v9, v6

    .line 303
    :goto_8
    if-eqz v9, :cond_b

    .line 304
    .line 305
    iget-object v9, v9, Lku0;->a:Lju0;

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_b
    move-object v9, v6

    .line 309
    :goto_9
    if-ne v9, v3, :cond_c

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_c
    add-int/lit8 v7, v7, 0x1

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_d
    :goto_a
    new-instance v6, Llk0;

    .line 316
    .line 317
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-direct {v6, v4, v1}, Llk0;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    .line 323
    .line 324
    :cond_e
    invoke-virtual {v2}, Lv11;->c()V

    .line 325
    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_f
    move v4, v8

    .line 329
    goto :goto_3

    .line 330
    :goto_b
    if-eqz v6, :cond_10

    .line 331
    .line 332
    iget v1, v6, Llk0;->a:I

    .line 333
    .line 334
    iget-object v2, v6, Llk0;->b:Ljava/lang/Integer;

    .line 335
    .line 336
    invoke-virtual {v0}, Lw11;->c()Lv11;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    :try_start_2
    invoke-static {v0, v1, v2}, Lp30;->Y(Lv11;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 341
    .line 342
    .line 343
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 344
    invoke-virtual {v0}, Lv11;->c()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0}, Lpi;->E()Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-static {v1, p0}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    goto :goto_c

    .line 356
    :catchall_1
    move-exception p0

    .line 357
    invoke-virtual {v0}, Lv11;->c()V

    .line 358
    .line 359
    .line 360
    throw p0

    .line 361
    :cond_10
    sget-object p0, Lhs;->d:Lhs;

    .line 362
    .line 363
    :goto_c
    new-instance v0, Lci;

    .line 364
    .line 365
    invoke-direct {v0, p0}, Lci;-><init>(Ljava/util/List;)V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :goto_d
    invoke-virtual {v2}, Lv11;->c()V

    .line 370
    .line 371
    .line 372
    throw p0

    .line 373
    :pswitch_9
    check-cast p0, Lt9;

    .line 374
    .line 375
    check-cast v3, Ld60;

    .line 376
    .line 377
    iget-object v0, p0, Lt9;->s:Lx01;

    .line 378
    .line 379
    iget-object v1, v3, Ld60;->d:Ldd;

    .line 380
    .line 381
    invoke-interface {v1}, Luq;->c()J

    .line 382
    .line 383
    .line 384
    move-result-wide v4

    .line 385
    invoke-virtual {v3}, Ld60;->getLayoutDirection()Lk50;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-interface {v0, v4, v5, v1, v3}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iput-object v0, p0, Lt9;->x:Lv50;

    .line 394
    .line 395
    return-object v2

    .line 396
    :pswitch_a
    check-cast p0, Lmd;

    .line 397
    .line 398
    invoke-interface {p0, v3}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    return-object v2

    .line 402
    nop

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
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
