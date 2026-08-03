.class public final synthetic Lsh/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Lsf/b;Z)V
    .locals 0

    .line 17
    iput p2, p0, Lsh/j;->g:I

    iput-object p3, p0, Lsh/j;->i:Ljava/lang/Object;

    iput-boolean p6, p0, Lsh/j;->h:Z

    iput-object p4, p0, Lsh/j;->j:Ljava/lang/Object;

    iput-object p5, p0, Lsh/j;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 16
    iput p1, p0, Lsh/j;->g:I

    iput-boolean p5, p0, Lsh/j;->h:Z

    iput-object p2, p0, Lsh/j;->i:Ljava/lang/Object;

    iput-object p3, p0, Lsh/j;->j:Ljava/lang/Object;

    iput-object p4, p0, Lsh/j;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lh2/a;Ly0/o;Lsh/i;ZI)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    .line 2
    iput p5, p0, Lsh/j;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Lsh/j;->h:Z

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;ZLfg/a;II)V
    .locals 0

    .line 18
    iput p6, p0, Lsh/j;->g:I

    iput-object p1, p0, Lsh/j;->i:Ljava/lang/Object;

    iput-object p2, p0, Lsh/j;->j:Ljava/lang/Object;

    iput-boolean p3, p0, Lsh/j;->h:Z

    iput-object p4, p0, Lsh/j;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lsh/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/a;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xc07

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    iget-boolean v3, p0, Lsh/j;->h:Z

    .line 36
    .line 37
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->K(Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    check-cast v1, Lwb/y2;

    .line 47
    .line 48
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    check-cast v4, Lfg/l;

    .line 57
    .line 58
    move-object v5, p1

    .line 59
    check-cast v5, Li0/h0;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/16 p1, 0xc31

    .line 67
    .line 68
    invoke-static {p1}, Li0/r;->C(I)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    iget-boolean v2, p0, Lsh/j;->h:Z

    .line 73
    .line 74
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->N(ZLjava/lang/String;Lfg/l;Li0/h0;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_1
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v1, v0

    .line 81
    check-cast v1, Lwb/s0;

    .line 82
    .line 83
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v2, v0

    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v4, v0

    .line 91
    check-cast v4, Lfg/a;

    .line 92
    .line 93
    move-object v5, p1

    .line 94
    check-cast v5, Li0/h0;

    .line 95
    .line 96
    check-cast p2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    invoke-static {p1}, Li0/r;->C(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iget-boolean v3, p0, Lsh/j;->h:Z

    .line 107
    .line 108
    invoke-static/range {v1 .. v6}, Lwb/ho;->W1(Lwb/s0;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_2
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v2, v0

    .line 120
    check-cast v2, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v4, v0

    .line 125
    check-cast v4, Lfg/a;

    .line 126
    .line 127
    move-object v5, p1

    .line 128
    check-cast v5, Li0/h0;

    .line 129
    .line 130
    check-cast p2, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x1

    .line 136
    invoke-static {p1}, Li0/r;->C(I)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    iget-boolean v3, p0, Lsh/j;->h:Z

    .line 141
    .line 142
    invoke-static/range {v1 .. v6}, Lwb/ho;->y(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :pswitch_3
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 147
    .line 148
    move-object v5, v0

    .line 149
    check-cast v5, Lfg/l;

    .line 150
    .line 151
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Ljava/util/List;

    .line 154
    .line 155
    iget-object v1, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 156
    .line 157
    move-object v9, v1

    .line 158
    check-cast v9, Lfg/a;

    .line 159
    .line 160
    move-object v6, p1

    .line 161
    check-cast v6, Li0/h0;

    .line 162
    .line 163
    check-cast p2, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    and-int/lit8 p2, p1, 0x3

    .line 170
    .line 171
    const/4 v1, 0x2

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x1

    .line 174
    if-eq p2, v1, :cond_0

    .line 175
    .line 176
    move p2, v11

    .line 177
    goto :goto_1

    .line 178
    :cond_0
    move p2, v10

    .line 179
    :goto_1
    and-int/2addr p1, v11

    .line 180
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_6

    .line 185
    .line 186
    const/16 v7, 0x1b0

    .line 187
    .line 188
    const/16 v8, 0x8

    .line 189
    .line 190
    iget-boolean v1, p0, Lsh/j;->h:Z

    .line 191
    .line 192
    const-string v2, "\u542f\u7528\u6d88\u606f\u81ea\u52a8\u8f6c\u53d1"

    .line 193
    .line 194
    const-string v3, "\u9ed8\u8ba4\u4e0d\u8f6c\u53d1\u81ea\u5df1\u53d1\u9001\u7684\u6d88\u606f\uff0c\u53ef\u5728\u6bcf\u6761\u89c4\u5219\u4e2d\u5355\u72ec\u5f00\u542f"

    .line 195
    .line 196
    const/4 v4, 0x0

    .line 197
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 198
    .line 199
    .line 200
    const/4 p1, 0x0

    .line 201
    invoke-static {p1, v6, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_1

    .line 209
    .line 210
    const-string p1, "\u6682\u65e0\u89c4\u5219"

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-eqz p2, :cond_2

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_5

    .line 233
    .line 234
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Lv8/a;

    .line 239
    .line 240
    iget-boolean v0, v0, Lv8/a;->c:Z

    .line 241
    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    if-ltz v10, :cond_4

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_4
    invoke-static {}, La/a;->P0()V

    .line 250
    .line 251
    .line 252
    const/4 p1, 0x0

    .line 253
    throw p1

    .line 254
    :cond_5
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string p1, " \u6761\u89c4\u5219\uff0c"

    .line 263
    .line 264
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string p1, " \u6761\u542f\u7528"

    .line 271
    .line 272
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    :goto_4
    const/4 p2, 0x6

    .line 280
    const-string v0, "\u8f6c\u53d1\u89c4\u5219"

    .line 281
    .line 282
    invoke-static {v0, p1, v9, v6, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_6
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 287
    .line 288
    .line 289
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 290
    .line 291
    return-object p1

    .line 292
    :pswitch_4
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v1, v0

    .line 295
    check-cast v1, Lth/j;

    .line 296
    .line 297
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 298
    .line 299
    move-object v3, v0

    .line 300
    check-cast v3, Ly0/o;

    .line 301
    .line 302
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 303
    .line 304
    move-object v4, v0

    .line 305
    check-cast v4, Ls0/d;

    .line 306
    .line 307
    move-object v5, p1

    .line 308
    check-cast v5, Li0/h0;

    .line 309
    .line 310
    check-cast p2, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    const/16 p1, 0xc01

    .line 316
    .line 317
    invoke-static {p1}, Li0/r;->C(I)I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    iget-boolean v2, p0, Lsh/j;->h:Z

    .line 322
    .line 323
    invoke-static/range {v1 .. v6}, Lwb/o3;->d(Lth/j;ZLy0/o;Ls0/d;Li0/h0;I)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :pswitch_5
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Lxb/i;

    .line 331
    .line 332
    iget-object v1, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, Li0/f1;

    .line 335
    .line 336
    iget-object v2, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v2, Li0/l2;

    .line 339
    .line 340
    check-cast p1, Le1/e;

    .line 341
    .line 342
    check-cast p2, Le1/b;

    .line 343
    .line 344
    iget-boolean p2, p0, Lsh/j;->h:Z

    .line 345
    .line 346
    const/16 v3, 0x20

    .line 347
    .line 348
    const/high16 v4, 0x3f000000    # 0.5f

    .line 349
    .line 350
    if-eqz p2, :cond_7

    .line 351
    .line 352
    invoke-virtual {v0}, Lxb/i;->c()F

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    add-float/2addr p2, v4

    .line 357
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    mul-float/2addr v0, p2

    .line 362
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 363
    .line 364
    .line 365
    move-result p2

    .line 366
    add-float/2addr p2, v0

    .line 367
    goto :goto_6

    .line 368
    :cond_7
    iget-wide v5, p1, Le1/e;->a:J

    .line 369
    .line 370
    shr-long/2addr v5, v3

    .line 371
    long-to-int p2, v5

    .line 372
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    invoke-virtual {v0}, Lxb/i;->c()F

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    add-float/2addr v0, v4

    .line 381
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    mul-float/2addr v1, v0

    .line 386
    sub-float/2addr p2, v1

    .line 387
    invoke-static {v2}, Lwb/o3;->b(Li0/l2;)F

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    add-float/2addr p2, v0

    .line 392
    :goto_6
    iget-wide v0, p1, Le1/e;->a:J

    .line 393
    .line 394
    const-wide v4, 0xffffffffL

    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    and-long/2addr v0, v4

    .line 400
    long-to-int p1, v0

    .line 401
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    const/high16 v0, 0x40000000    # 2.0f

    .line 406
    .line 407
    div-float/2addr p1, v0

    .line 408
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 409
    .line 410
    .line 411
    move-result p2

    .line 412
    int-to-long v0, p2

    .line 413
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    int-to-long p1, p1

    .line 418
    shl-long/2addr v0, v3

    .line 419
    and-long/2addr p1, v4

    .line 420
    or-long/2addr p1, v0

    .line 421
    new-instance v0, Le1/b;

    .line 422
    .line 423
    invoke-direct {v0, p1, p2}, Le1/b;-><init>(J)V

    .line 424
    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_6
    iget-object v0, p0, Lsh/j;->i:Ljava/lang/Object;

    .line 428
    .line 429
    move-object v1, v0

    .line 430
    check-cast v1, Lh2/a;

    .line 431
    .line 432
    iget-object v0, p0, Lsh/j;->j:Ljava/lang/Object;

    .line 433
    .line 434
    move-object v2, v0

    .line 435
    check-cast v2, Ly0/o;

    .line 436
    .line 437
    iget-object v0, p0, Lsh/j;->k:Ljava/lang/Object;

    .line 438
    .line 439
    move-object v3, v0

    .line 440
    check-cast v3, Lsh/i;

    .line 441
    .line 442
    move-object v5, p1

    .line 443
    check-cast v5, Li0/h0;

    .line 444
    .line 445
    check-cast p2, Ljava/lang/Integer;

    .line 446
    .line 447
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    const/16 p1, 0x1b1

    .line 451
    .line 452
    invoke-static {p1}, Li0/r;->C(I)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    iget-boolean v4, p0, Lsh/j;->h:Z

    .line 457
    .line 458
    invoke-static/range {v1 .. v6}, Lsh/s;->d(Lh2/a;Ly0/o;Lsh/i;ZLi0/h0;I)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
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
