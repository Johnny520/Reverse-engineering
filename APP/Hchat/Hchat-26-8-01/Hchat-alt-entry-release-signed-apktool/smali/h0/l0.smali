.class public final Lh0/l0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/e;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lh0/l0;->g:I

    iput-object p1, p0, Lh0/l0;->h:Ljava/lang/Object;

    iput-object p3, p0, Lh0/l0;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltg/c;Lgg/u;Ltg/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lh0/l0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lh0/l0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lh0/l0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lh0/l0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln/j;

    .line 7
    .line 8
    iget-object p2, p0, Lh0/l0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lw/r0;

    .line 11
    .line 12
    iget-object v0, p0, Lh0/l0;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lf/f0;

    .line 15
    .line 16
    instance-of v1, p1, Ln/h;

    .line 17
    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    instance-of v1, p1, Ln/f;

    .line 21
    .line 22
    if-nez v1, :cond_4

    .line 23
    .line 24
    instance-of v1, p1, Ln/m;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v1, p1, Ln/i;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    check-cast p1, Ln/i;

    .line 34
    .line 35
    iget-object p1, p1, Ln/i;->a:Ln/h;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    instance-of v1, p1, Ln/g;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    check-cast p1, Ln/g;

    .line 46
    .line 47
    iget-object p1, p1, Ln/g;->a:Ln/f;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    instance-of v1, p1, Ln/n;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    check-cast p1, Ln/n;

    .line 58
    .line 59
    iget-object p1, p1, Ln/n;->a:Ln/m;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    instance-of v1, p1, Ln/l;

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    check-cast p1, Ln/l;

    .line 70
    .line 71
    iget-object p1, p1, Ln/l;->a:Ln/m;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lf/f0;->j(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    :goto_0
    invoke-virtual {v0, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    :goto_1
    iget-object p1, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 81
    .line 82
    iget v0, v0, Lf/f0;->b:I

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    move v2, v1

    .line 86
    :goto_2
    if-ge v1, v0, :cond_9

    .line 87
    .line 88
    aget-object v3, p1, v1

    .line 89
    .line 90
    check-cast v3, Ln/j;

    .line 91
    .line 92
    instance-of v4, v3, Ln/h;

    .line 93
    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    or-int/lit8 v2, v2, 0x2

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    instance-of v4, v3, Ln/f;

    .line 103
    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    or-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    instance-of v3, v3, Ln/m;

    .line 113
    .line 114
    if-eqz v3, :cond_8

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    or-int/lit8 v2, v2, 0x4

    .line 120
    .line 121
    :cond_8
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_9
    iget-object p1, p2, Lw/r0;->b:Li0/g1;

    .line 125
    .line 126
    invoke-virtual {p1, v2}, Li0/g1;->h(I)V

    .line 127
    .line 128
    .line 129
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 130
    .line 131
    return-object p1

    .line 132
    :pswitch_0
    instance-of v0, p2, Ltg/j;

    .line 133
    .line 134
    if-eqz v0, :cond_a

    .line 135
    .line 136
    move-object v0, p2

    .line 137
    check-cast v0, Ltg/j;

    .line 138
    .line 139
    iget v1, v0, Ltg/j;->i:I

    .line 140
    .line 141
    const/high16 v2, -0x80000000

    .line 142
    .line 143
    and-int v3, v1, v2

    .line 144
    .line 145
    if-eqz v3, :cond_a

    .line 146
    .line 147
    sub-int/2addr v1, v2

    .line 148
    iput v1, v0, Ltg/j;->i:I

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_a
    new-instance v0, Ltg/j;

    .line 152
    .line 153
    invoke-direct {v0, p0, p2}, Ltg/j;-><init>(Lh0/l0;Lwf/c;)V

    .line 154
    .line 155
    .line 156
    :goto_4
    iget-object p2, v0, Ltg/j;->h:Ljava/lang/Object;

    .line 157
    .line 158
    iget v1, v0, Ltg/j;->i:I

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    if-eqz v1, :cond_c

    .line 162
    .line 163
    if-ne v1, v2, :cond_b

    .line 164
    .line 165
    iget-object p1, v0, Ltg/j;->k:Ljava/lang/Object;

    .line 166
    .line 167
    iget-object v0, v0, Ltg/j;->g:Lh0/l0;

    .line 168
    .line 169
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_b
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 174
    .line 175
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 p1, 0x0

    .line 179
    goto :goto_6

    .line 180
    :cond_c
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p0, Lh0/l0;->h:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p2, Lfg/p;

    .line 186
    .line 187
    iput-object p0, v0, Ltg/j;->g:Lh0/l0;

    .line 188
    .line 189
    iput-object p1, v0, Ltg/j;->k:Ljava/lang/Object;

    .line 190
    .line 191
    iput v2, v0, Ltg/j;->i:I

    .line 192
    .line 193
    invoke-interface {p2, p1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 198
    .line 199
    if-ne p2, v0, :cond_d

    .line 200
    .line 201
    move-object p1, v0

    .line 202
    goto :goto_6

    .line 203
    :cond_d
    move-object v0, p0

    .line 204
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-nez p2, :cond_e

    .line 211
    .line 212
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 213
    .line 214
    :goto_6
    return-object p1

    .line 215
    :cond_e
    iget-object p2, v0, Lh0/l0;->i:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p2, Lgg/u;

    .line 218
    .line 219
    iput-object p1, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 220
    .line 221
    new-instance p1, Lug/a;

    .line 222
    .line 223
    invoke-direct {p1, v0}, Lug/a;-><init>(Ltg/e;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :pswitch_1
    iget-object v0, p0, Lh0/l0;->h:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Lgg/u;

    .line 230
    .line 231
    instance-of v1, p2, Ltg/b;

    .line 232
    .line 233
    if-eqz v1, :cond_f

    .line 234
    .line 235
    move-object v1, p2

    .line 236
    check-cast v1, Ltg/b;

    .line 237
    .line 238
    iget v2, v1, Ltg/b;->i:I

    .line 239
    .line 240
    const/high16 v3, -0x80000000

    .line 241
    .line 242
    and-int v4, v2, v3

    .line 243
    .line 244
    if-eqz v4, :cond_f

    .line 245
    .line 246
    sub-int/2addr v2, v3

    .line 247
    iput v2, v1, Ltg/b;->i:I

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_f
    new-instance v1, Ltg/b;

    .line 251
    .line 252
    invoke-direct {v1, p0, p2}, Ltg/b;-><init>(Lh0/l0;Lwf/c;)V

    .line 253
    .line 254
    .line 255
    :goto_7
    iget-object p2, v1, Ltg/b;->g:Ljava/lang/Object;

    .line 256
    .line 257
    iget v2, v1, Ltg/b;->i:I

    .line 258
    .line 259
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 260
    .line 261
    const/4 v4, 0x1

    .line 262
    if-eqz v2, :cond_11

    .line 263
    .line 264
    if-ne v2, v4, :cond_10

    .line 265
    .line 266
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_10
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 271
    .line 272
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    goto :goto_8

    .line 277
    :cond_11
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget-object p2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 281
    .line 282
    sget-object v2, Lug/c;->b:Ll3/q;

    .line 283
    .line 284
    if-eq p2, v2, :cond_12

    .line 285
    .line 286
    invoke-static {p2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    if-nez p2, :cond_13

    .line 291
    .line 292
    :cond_12
    iput-object p1, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 293
    .line 294
    iget-object p2, p0, Lh0/l0;->i:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast p2, Ltg/e;

    .line 297
    .line 298
    iput v4, v1, Ltg/b;->i:I

    .line 299
    .line 300
    invoke-interface {p2, p1, v1}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 305
    .line 306
    if-ne p1, p2, :cond_13

    .line 307
    .line 308
    move-object v3, p2

    .line 309
    :cond_13
    :goto_8
    return-object v3

    .line 310
    :pswitch_2
    check-cast p1, Le1/b;

    .line 311
    .line 312
    iget-wide v2, p1, Le1/b;->a:J

    .line 313
    .line 314
    iget-object p1, p0, Lh0/l0;->h:Ljava/lang/Object;

    .line 315
    .line 316
    move-object v1, p1

    .line 317
    check-cast v1, Li/c;

    .line 318
    .line 319
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    check-cast p1, Le1/b;

    .line 324
    .line 325
    iget-wide v4, p1, Le1/b;->a:J

    .line 326
    .line 327
    const-wide v6, 0x7fffffff7fffffffL

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    and-long/2addr v4, v6

    .line 333
    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    cmp-long p1, v4, v8

    .line 339
    .line 340
    sget-object v10, Lsf/n;->a:Lsf/n;

    .line 341
    .line 342
    if-eqz p1, :cond_15

    .line 343
    .line 344
    and-long v4, v2, v6

    .line 345
    .line 346
    cmp-long p1, v4, v8

    .line 347
    .line 348
    if-eqz p1, :cond_15

    .line 349
    .line 350
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    check-cast p1, Le1/b;

    .line 355
    .line 356
    iget-wide v4, p1, Le1/b;->a:J

    .line 357
    .line 358
    const-wide v6, 0xffffffffL

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    and-long/2addr v4, v6

    .line 364
    long-to-int p1, v4

    .line 365
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    and-long v4, v2, v6

    .line 370
    .line 371
    long-to-int v0, v4

    .line 372
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    cmpg-float p1, p1, v0

    .line 377
    .line 378
    if-nez p1, :cond_14

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_14
    iget-object p1, p0, Lh0/l0;->i:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast p1, Lqg/t;

    .line 384
    .line 385
    new-instance v0, Lh0/k0;

    .line 386
    .line 387
    const/4 v5, 0x0

    .line 388
    const/4 v4, 0x0

    .line 389
    invoke-direct/range {v0 .. v5}, Lh0/k0;-><init>(Ljava/lang/Object;JLwf/c;I)V

    .line 390
    .line 391
    .line 392
    const/4 p2, 0x3

    .line 393
    invoke-static {p1, v4, v0, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 394
    .line 395
    .line 396
    goto :goto_a

    .line 397
    :cond_15
    :goto_9
    new-instance p1, Le1/b;

    .line 398
    .line 399
    invoke-direct {p1, v2, v3}, Le1/b;-><init>(J)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, p1, p2}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 407
    .line 408
    if-ne p1, p2, :cond_16

    .line 409
    .line 410
    move-object v10, p1

    .line 411
    :cond_16
    :goto_a
    return-object v10

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
