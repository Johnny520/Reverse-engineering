.class public final Lev;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Lev;

.field public static final c:Lev;

.field public static final d:Lev;

.field public static final e:Lev;

.field public static final f:Lev;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lev;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lev;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lev;->b:Lev;

    .line 8
    .line 9
    new-instance v0, Lev;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lev;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lev;->c:Lev;

    .line 16
    .line 17
    new-instance v0, Lev;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lev;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lev;->d:Lev;

    .line 24
    .line 25
    new-instance v0, Lev;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lev;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lev;->e:Lev;

    .line 32
    .line 33
    new-instance v0, Lev;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lev;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lev;->f:Lev;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lev;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget p0, p0, Lev;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lb60;

    .line 7
    .line 8
    check-cast p2, Lb60;

    .line 9
    .line 10
    iget p0, p1, Lb60;->s:I

    .line 11
    .line 12
    iget v0, p2, Lb60;->s:I

    .line 13
    .line 14
    invoke-static {p0, v0}, Lp30;->r(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    :goto_0
    return p0

    .line 34
    :pswitch_0
    check-cast p1, Le8;

    .line 35
    .line 36
    iget p0, p1, Le8;->b:I

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p2, Le8;

    .line 43
    .line 44
    iget p1, p2, Le8;->b:I

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, p1}, Lpf1;->p(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :pswitch_1
    check-cast p1, Le8;

    .line 56
    .line 57
    iget p0, p1, Le8;->b:I

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p2, Le8;

    .line 64
    .line 65
    iget p1, p2, Le8;->b:I

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p0, p1}, Lpf1;->p(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :pswitch_2
    check-cast p1, Luo0;

    .line 77
    .line 78
    check-cast p2, Luo0;

    .line 79
    .line 80
    iget-object p0, p1, Luo0;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lst0;

    .line 83
    .line 84
    iget p0, p0, Lst0;->b:F

    .line 85
    .line 86
    iget-object v0, p2, Luo0;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lst0;

    .line 89
    .line 90
    iget v0, v0, Lst0;->b:F

    .line 91
    .line 92
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object p0, p1, Luo0;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lst0;

    .line 102
    .line 103
    iget p0, p0, Lst0;->d:F

    .line 104
    .line 105
    iget-object p1, p2, Luo0;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Lst0;

    .line 108
    .line 109
    iget p1, p1, Lst0;->d:F

    .line 110
    .line 111
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    :goto_1
    return p0

    .line 116
    :pswitch_3
    check-cast p1, Lxz0;

    .line 117
    .line 118
    check-cast p2, Lxz0;

    .line 119
    .line 120
    invoke-virtual {p1}, Lxz0;->h()Lst0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p2}, Lxz0;->h()Lst0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget p2, p1, Lst0;->c:F

    .line 129
    .line 130
    iget v0, p0, Lst0;->c:F

    .line 131
    .line 132
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_2

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_2
    iget p2, p0, Lst0;->b:F

    .line 140
    .line 141
    iget v0, p1, Lst0;->b:F

    .line 142
    .line 143
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_3

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    iget p2, p0, Lst0;->d:F

    .line 151
    .line 152
    iget v0, p1, Lst0;->d:F

    .line 153
    .line 154
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-eqz p2, :cond_4

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    iget p1, p1, Lst0;->a:F

    .line 162
    .line 163
    iget p0, p0, Lst0;->a:F

    .line 164
    .line 165
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    :goto_2
    return p2

    .line 170
    :pswitch_4
    check-cast p1, Lb60;

    .line 171
    .line 172
    check-cast p2, Lb60;

    .line 173
    .line 174
    iget p0, p2, Lb60;->s:I

    .line 175
    .line 176
    iget v0, p1, Lb60;->s:I

    .line 177
    .line 178
    invoke-static {p0, v0}, Lp30;->r(II)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-eqz p0, :cond_5

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    :goto_3
    return p0

    .line 198
    :pswitch_5
    check-cast p1, Lxz0;

    .line 199
    .line 200
    check-cast p2, Lxz0;

    .line 201
    .line 202
    invoke-virtual {p1}, Lxz0;->h()Lst0;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p2}, Lxz0;->h()Lst0;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    iget p2, p0, Lst0;->a:F

    .line 211
    .line 212
    iget v0, p1, Lst0;->a:F

    .line 213
    .line 214
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_6

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_6
    iget p2, p0, Lst0;->b:F

    .line 222
    .line 223
    iget v0, p1, Lst0;->b:F

    .line 224
    .line 225
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    if-eqz p2, :cond_7

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_7
    iget p2, p0, Lst0;->d:F

    .line 233
    .line 234
    iget v0, p1, Lst0;->d:F

    .line 235
    .line 236
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    if-eqz p2, :cond_8

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    iget p0, p0, Lst0;->c:F

    .line 244
    .line 245
    iget p1, p1, Lst0;->c:F

    .line 246
    .line 247
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 248
    .line 249
    .line 250
    move-result p2

    .line 251
    :goto_4
    return p2

    .line 252
    :pswitch_6
    check-cast p1, Ldv;

    .line 253
    .line 254
    check-cast p2, Ldv;

    .line 255
    .line 256
    invoke-static {p1}, Li4;->t(Ldv;)Z

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    const/4 v0, 0x0

    .line 261
    const/4 v1, 0x1

    .line 262
    if-eqz p0, :cond_13

    .line 263
    .line 264
    invoke-static {p2}, Li4;->t(Ldv;)Z

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    if-nez p0, :cond_9

    .line 269
    .line 270
    goto/16 :goto_8

    .line 271
    .line 272
    :cond_9
    invoke-static {p1}, Lpf1;->Q(Lrm;)Lb60;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {p2}, Lpf1;->Q(Lrm;)Lb60;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    if-eqz p2, :cond_a

    .line 285
    .line 286
    goto/16 :goto_9

    .line 287
    .line 288
    :cond_a
    const/16 p2, 0x10

    .line 289
    .line 290
    new-array v2, p2, [Lb60;

    .line 291
    .line 292
    move v3, v0

    .line 293
    :goto_5
    if-eqz p0, :cond_d

    .line 294
    .line 295
    add-int/lit8 v4, v3, 0x1

    .line 296
    .line 297
    array-length v5, v2

    .line 298
    if-ge v5, v4, :cond_b

    .line 299
    .line 300
    array-length v5, v2

    .line 301
    mul-int/lit8 v6, v5, 0x2

    .line 302
    .line 303
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    new-array v4, v4, [Ljava/lang/Object;

    .line 308
    .line 309
    invoke-static {v2, v0, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 310
    .line 311
    .line 312
    move-object v2, v4

    .line 313
    :cond_b
    if-eqz v3, :cond_c

    .line 314
    .line 315
    const/4 v4, 0x0

    .line 316
    add-int/2addr v4, v1

    .line 317
    add-int/lit8 v5, v3, 0x0

    .line 318
    .line 319
    invoke-static {v2, v0, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 320
    .line 321
    .line 322
    :cond_c
    aput-object p0, v2, v0

    .line 323
    .line 324
    add-int/lit8 v3, v3, 0x1

    .line 325
    .line 326
    invoke-virtual {p0}, Lb60;->v()Lb60;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    goto :goto_5

    .line 331
    :cond_d
    new-array p0, p2, [Lb60;

    .line 332
    .line 333
    move p2, v0

    .line 334
    :goto_6
    if-eqz p1, :cond_10

    .line 335
    .line 336
    add-int/lit8 v4, p2, 0x1

    .line 337
    .line 338
    array-length v5, p0

    .line 339
    if-ge v5, v4, :cond_e

    .line 340
    .line 341
    array-length v5, p0

    .line 342
    mul-int/lit8 v6, v5, 0x2

    .line 343
    .line 344
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    new-array v4, v4, [Ljava/lang/Object;

    .line 349
    .line 350
    invoke-static {p0, v0, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 351
    .line 352
    .line 353
    move-object p0, v4

    .line 354
    :cond_e
    if-eqz p2, :cond_f

    .line 355
    .line 356
    const/4 v4, 0x0

    .line 357
    add-int/2addr v4, v1

    .line 358
    add-int/lit8 v5, p2, 0x0

    .line 359
    .line 360
    invoke-static {p0, v0, p0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 361
    .line 362
    .line 363
    :cond_f
    aput-object p1, p0, v0

    .line 364
    .line 365
    add-int/lit8 p2, p2, 0x1

    .line 366
    .line 367
    invoke-virtual {p1}, Lb60;->v()Lb60;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    goto :goto_6

    .line 372
    :cond_10
    sub-int/2addr v3, v1

    .line 373
    sub-int/2addr p2, v1

    .line 374
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 375
    .line 376
    .line 377
    move-result p1

    .line 378
    if-ltz p1, :cond_12

    .line 379
    .line 380
    move p2, v0

    .line 381
    :goto_7
    aget-object v1, v2, p2

    .line 382
    .line 383
    aget-object v3, p0, p2

    .line 384
    .line 385
    invoke-static {v1, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-nez v1, :cond_11

    .line 390
    .line 391
    aget-object p1, v2, p2

    .line 392
    .line 393
    check-cast p1, Lb60;

    .line 394
    .line 395
    invoke-virtual {p1}, Lb60;->w()I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    aget-object p0, p0, p2

    .line 400
    .line 401
    check-cast p0, Lb60;

    .line 402
    .line 403
    invoke-virtual {p0}, Lb60;->w()I

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    invoke-static {p1, p0}, Lp30;->r(II)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    goto :goto_9

    .line 412
    :cond_11
    if-eq p2, p1, :cond_12

    .line 413
    .line 414
    add-int/lit8 p2, p2, 0x1

    .line 415
    .line 416
    goto :goto_7

    .line 417
    :cond_12
    const-string p0, "Could not find a common ancestor between the two FocusModifiers."

    .line 418
    .line 419
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    goto :goto_9

    .line 423
    :cond_13
    :goto_8
    invoke-static {p1}, Li4;->t(Ldv;)Z

    .line 424
    .line 425
    .line 426
    move-result p0

    .line 427
    if-eqz p0, :cond_14

    .line 428
    .line 429
    const/4 v0, -0x1

    .line 430
    goto :goto_9

    .line 431
    :cond_14
    invoke-static {p2}, Li4;->t(Ldv;)Z

    .line 432
    .line 433
    .line 434
    move-result p0

    .line 435
    if-eqz p0, :cond_15

    .line 436
    .line 437
    move v0, v1

    .line 438
    :cond_15
    :goto_9
    return v0

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
