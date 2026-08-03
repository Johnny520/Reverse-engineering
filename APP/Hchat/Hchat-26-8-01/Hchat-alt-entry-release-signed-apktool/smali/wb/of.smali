.class public final synthetic Lwb/of;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/of;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/of;->h:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/of;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/of;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/of;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/of;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/of;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/of;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/of;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/of;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/of;->q:Li0/a1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v8

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v9

    .line 20
    :goto_0
    and-int/2addr p1, v8

    .line 21
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_18

    .line 26
    .line 27
    iget-object p1, p0, Lwb/of;->h:Li0/a1;

    .line 28
    .line 29
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-boolean p2, p0, Lwb/of;->g:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    const-string v1, "\u542f\u7528\u9ed8\u8ba4\u89c4\u5219"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string v1, "\u542f\u7528\u6b64\u4f1a\u8bdd\u89c4\u5219"

    .line 47
    .line 48
    :goto_1
    if-eqz p2, :cond_2

    .line 49
    .line 50
    const-string p2, "\u5f00\u542f\u540e\u63a5\u7ba1\u672a\u5355\u72ec\u914d\u7f6e\u7684\u5bf9\u5e94\u4f1a\u8bdd\u901a\u77e5"

    .line 51
    .line 52
    :goto_2
    move-object v2, p2

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    const-string p2, "\u5173\u95ed\u540e\u4e0d\u518d\u63a5\u7ba1\u8be5\u4f1a\u8bdd\u901a\u77e5"

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :goto_3
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v10, Li0/l;->a:Li0/e;

    .line 66
    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    if-ne v3, v10, :cond_4

    .line 70
    .line 71
    :cond_3
    new-instance v3, Lwb/bi;

    .line 72
    .line 73
    const/16 p2, 0x9

    .line 74
    .line 75
    invoke-direct {v3, p1, p2}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    move-object v4, v3

    .line 82
    check-cast v4, Lfg/l;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/16 v7, 0x8

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, Lwb/of;->i:Li0/a1;

    .line 96
    .line 97
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    if-ne v2, v10, :cond_6

    .line 118
    .line 119
    :cond_5
    new-instance v2, Lwb/bi;

    .line 120
    .line 121
    const/16 v1, 0xa

    .line 122
    .line 123
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    move-object v4, v2

    .line 130
    check-cast v4, Lfg/l;

    .line 131
    .line 132
    const/16 v6, 0x1b0

    .line 133
    .line 134
    const/16 v7, 0x8

    .line 135
    .line 136
    const-string v1, "\u514d\u6253\u6270"

    .line 137
    .line 138
    const-string v2, "\u5f00\u542f\u540e\u4e0d\u5f39\u81ea\u5b9a\u4e49\u901a\u77e5\uff0c\u4e5f\u4f1a\u62e6\u622a\u539f\u751f\u901a\u77e5"

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lwb/of;->j:Li0/a1;

    .line 148
    .line 149
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-nez v1, :cond_7

    .line 168
    .line 169
    if-ne v2, v10, :cond_8

    .line 170
    .line 171
    :cond_7
    new-instance v2, Lwb/bi;

    .line 172
    .line 173
    const/16 v1, 0xb

    .line 174
    .line 175
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_8
    move-object v4, v2

    .line 182
    check-cast v4, Lfg/l;

    .line 183
    .line 184
    const/16 v6, 0x1b0

    .line 185
    .line 186
    const/16 v7, 0x8

    .line 187
    .line 188
    const-string v1, "\u5ffd\u7565\u5fae\u4fe1\u81ea\u5e26\u7684\u6d88\u606f\u514d\u6253\u6270"

    .line 189
    .line 190
    const-string v2, "\u5f00\u542f\u540e\uff0c\u8be5\u4f1a\u8bdd\u5728\u5fae\u4fe1\u4e2d\u8bbe\u7f6e\u514d\u6253\u6270\u4ecd\u4f1a\u5f39\u51fa\u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 194
    .line 195
    .line 196
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 197
    .line 198
    .line 199
    iget-object p2, p0, Lwb/of;->k:Li0/a1;

    .line 200
    .line 201
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v1, :cond_9

    .line 220
    .line 221
    if-ne v2, v10, :cond_a

    .line 222
    .line 223
    :cond_9
    new-instance v2, Lwb/bi;

    .line 224
    .line 225
    const/16 v1, 0xc

    .line 226
    .line 227
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_a
    move-object v4, v2

    .line 234
    check-cast v4, Lfg/l;

    .line 235
    .line 236
    const/16 v6, 0x1b0

    .line 237
    .line 238
    const/16 v7, 0x8

    .line 239
    .line 240
    const-string v1, "\u9707\u52a8"

    .line 241
    .line 242
    const-string v2, "\u901a\u77e5\u65f6\u9707\u52a8"

    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 246
    .line 247
    .line 248
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 249
    .line 250
    .line 251
    iget-object p2, p0, Lwb/of;->l:Li0/a1;

    .line 252
    .line 253
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-nez v1, :cond_b

    .line 272
    .line 273
    if-ne v2, v10, :cond_c

    .line 274
    .line 275
    :cond_b
    new-instance v2, Lwb/bi;

    .line 276
    .line 277
    const/16 v1, 0xd

    .line 278
    .line 279
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_c
    move-object v4, v2

    .line 286
    check-cast v4, Lfg/l;

    .line 287
    .line 288
    const/16 v6, 0x1b0

    .line 289
    .line 290
    const/16 v7, 0x8

    .line 291
    .line 292
    const-string v1, "\u94c3\u58f0"

    .line 293
    .line 294
    const-string v2, "\u901a\u77e5\u65f6\u64ad\u653e\u7cfb\u7edf\u6216\u81ea\u5b9a\u4e49\u94c3\u58f0"

    .line 295
    .line 296
    const/4 v3, 0x0

    .line 297
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 298
    .line 299
    .line 300
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 301
    .line 302
    .line 303
    iget-object p2, p0, Lwb/of;->m:Li0/a1;

    .line 304
    .line 305
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-nez v1, :cond_d

    .line 324
    .line 325
    if-ne v2, v10, :cond_e

    .line 326
    .line 327
    :cond_d
    new-instance v2, Lwb/bi;

    .line 328
    .line 329
    const/16 v1, 0xe

    .line 330
    .line 331
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_e
    move-object v4, v2

    .line 338
    check-cast v4, Lfg/l;

    .line 339
    .line 340
    const/16 v6, 0x1b0

    .line 341
    .line 342
    const/16 v7, 0x8

    .line 343
    .line 344
    const-string v1, "\u5df2\u8bfb\u6309\u94ae"

    .line 345
    .line 346
    const-string v2, "\u901a\u77e5\u680f\u76f4\u63a5\u6807\u8bb0\u5f53\u524d\u4f1a\u8bdd\u5df2\u8bfb"

    .line 347
    .line 348
    const/4 v3, 0x0

    .line 349
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 350
    .line 351
    .line 352
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 353
    .line 354
    .line 355
    iget-object p2, p0, Lwb/of;->n:Li0/a1;

    .line 356
    .line 357
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Ljava/lang/Boolean;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    if-nez v1, :cond_f

    .line 376
    .line 377
    if-ne v2, v10, :cond_10

    .line 378
    .line 379
    :cond_f
    new-instance v2, Lwb/bi;

    .line 380
    .line 381
    const/16 v1, 0xf

    .line 382
    .line 383
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_10
    move-object v4, v2

    .line 390
    check-cast v4, Lfg/l;

    .line 391
    .line 392
    const/16 v6, 0x1b0

    .line 393
    .line 394
    const/16 v7, 0x8

    .line 395
    .line 396
    const-string v1, "\u5feb\u6377\u56de\u590d"

    .line 397
    .line 398
    const-string v2, "\u901a\u77e5\u680f\u76f4\u63a5\u56de\u590d\u6587\u672c\u6d88\u606f"

    .line 399
    .line 400
    const/4 v3, 0x0

    .line 401
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 402
    .line 403
    .line 404
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    check-cast p2, Ljava/lang/Boolean;

    .line 409
    .line 410
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 411
    .line 412
    .line 413
    move-result p2

    .line 414
    if-eqz p2, :cond_13

    .line 415
    .line 416
    const p2, 0x557ac32e

    .line 417
    .line 418
    .line 419
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 420
    .line 421
    .line 422
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 423
    .line 424
    .line 425
    iget-object p2, p0, Lwb/of;->o:Li0/a1;

    .line 426
    .line 427
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    if-nez v1, :cond_11

    .line 446
    .line 447
    if-ne v2, v10, :cond_12

    .line 448
    .line 449
    :cond_11
    new-instance v2, Lwb/bi;

    .line 450
    .line 451
    const/16 v1, 0x10

    .line 452
    .line 453
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_12
    move-object v4, v2

    .line 460
    check-cast v4, Lfg/l;

    .line 461
    .line 462
    const/16 v6, 0x1b0

    .line 463
    .line 464
    const/16 v7, 0x8

    .line 465
    .line 466
    const-string v1, "\u5f15\u7528\u6d88\u606f\u56de\u590d"

    .line 467
    .line 468
    const-string v2, "\u5feb\u6377\u56de\u590d\u65f6\u5f15\u7528\u89e6\u53d1\u901a\u77e5\u7684\u539f\u6d88\u606f"

    .line 469
    .line 470
    const/4 v3, 0x0

    .line 471
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 475
    .line 476
    .line 477
    goto :goto_4

    .line 478
    :cond_13
    const p2, 0x557df949

    .line 479
    .line 480
    .line 481
    invoke-virtual {v5, p2}, Li0/h0;->a0(I)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v5, v9}, Li0/h0;->p(Z)V

    .line 485
    .line 486
    .line 487
    :goto_4
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 488
    .line 489
    .line 490
    iget-object p2, p0, Lwb/of;->p:Li0/a1;

    .line 491
    .line 492
    invoke-interface {p2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, Ljava/lang/Boolean;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    invoke-virtual {v5, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    if-nez v1, :cond_14

    .line 511
    .line 512
    if-ne v2, v10, :cond_15

    .line 513
    .line 514
    :cond_14
    new-instance v2, Lwb/bi;

    .line 515
    .line 516
    const/16 v1, 0x11

    .line 517
    .line 518
    invoke-direct {v2, p2, v1}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    :cond_15
    move-object v4, v2

    .line 525
    check-cast v4, Lfg/l;

    .line 526
    .line 527
    const/16 v6, 0x1b0

    .line 528
    .line 529
    const/16 v7, 0x8

    .line 530
    .line 531
    const-string v1, "\u5408\u5e76\u540c\u4f1a\u8bdd\u901a\u77e5"

    .line 532
    .line 533
    const-string v2, "\u540c\u4e00 wxid \u7684\u65b0\u6d88\u606f\u66f4\u65b0\u5230\u4e00\u6761\u901a\u77e5"

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 537
    .line 538
    .line 539
    invoke-static {p1, v5, v9, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 540
    .line 541
    .line 542
    iget-object p1, p0, Lwb/of;->q:Li0/a1;

    .line 543
    .line 544
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p2

    .line 548
    check-cast p2, Ljava/lang/Boolean;

    .line 549
    .line 550
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result p2

    .line 558
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    if-nez p2, :cond_16

    .line 563
    .line 564
    if-ne v1, v10, :cond_17

    .line 565
    .line 566
    :cond_16
    new-instance v1, Lwb/bi;

    .line 567
    .line 568
    const/16 p2, 0x12

    .line 569
    .line 570
    invoke-direct {v1, p1, p2}, Lwb/bi;-><init>(Li0/a1;I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    :cond_17
    move-object v4, v1

    .line 577
    check-cast v4, Lfg/l;

    .line 578
    .line 579
    const/16 v6, 0x1b0

    .line 580
    .line 581
    const/16 v7, 0x8

    .line 582
    .line 583
    const-string v1, "\u901a\u77e5\u663e\u793a\u6d88\u606f\u8be6\u60c5"

    .line 584
    .line 585
    const-string v2, "\u5173\u95ed\u540e\u53ea\u663e\u793a\u6536\u5230\u4e00\u6761\u65b0\u6d88\u606f"

    .line 586
    .line 587
    const/4 v3, 0x0

    .line 588
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 589
    .line 590
    .line 591
    goto :goto_5

    .line 592
    :cond_18
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 593
    .line 594
    .line 595
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 596
    .line 597
    return-object p1
.end method
