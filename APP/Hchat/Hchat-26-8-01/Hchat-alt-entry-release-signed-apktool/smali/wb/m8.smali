.class public final synthetic Lwb/m8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/m8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/m8;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/m8;->g:I

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
    const/4 v1, 0x1

    .line 19
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 32
    .line 33
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    move-object v3, p2

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    iget-object p2, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    invoke-virtual {v6, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    sget-object v0, Li0/l;->a:Li0/e;

    .line 53
    .line 54
    if-ne v1, v0, :cond_2

    .line 55
    .line 56
    :cond_1
    new-instance v1, Lwb/qg;

    .line 57
    .line 58
    const/16 v0, 0xf

    .line 59
    .line 60
    invoke-direct {v1, p2, p1, v0}, Lwb/qg;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v5, v1

    .line 67
    check-cast v5, Lfg/l;

    .line 68
    .line 69
    const/16 v7, 0x36

    .line 70
    .line 71
    const/16 v8, 0x8

    .line 72
    .line 73
    const-string v1, "\u89e6\u53d1\u8bcd"

    .line 74
    .line 75
    const-string v2, "\u591a\u4e2a\u89e6\u53d1\u8bcd\u7528\u9017\u53f7\u5206\u9694"

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object p1

    .line 88
    :pswitch_0
    move-object v5, p1

    .line 89
    check-cast v5, Li0/h0;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    and-int/lit8 p2, p1, 0x3

    .line 98
    .line 99
    const/4 v0, 0x2

    .line 100
    const/4 v1, 0x1

    .line 101
    if-eq p2, v0, :cond_4

    .line 102
    .line 103
    move p2, v1

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    const/4 p2, 0x0

    .line 106
    :goto_2
    and-int/2addr p1, v1

    .line 107
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 114
    .line 115
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-object p2, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 126
    .line 127
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-nez v1, :cond_5

    .line 136
    .line 137
    sget-object v1, Li0/l;->a:Li0/e;

    .line 138
    .line 139
    if-ne v2, v1, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v2, Lwb/wh;

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    invoke-direct {v2, p2, p1, v1}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_6
    move-object v4, v2

    .line 151
    check-cast v4, Lfg/l;

    .line 152
    .line 153
    const/16 v6, 0x1b0

    .line 154
    .line 155
    const/16 v7, 0x8

    .line 156
    .line 157
    const-string v1, "\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1"

    .line 158
    .line 159
    const-string v2, "\u6309\u89c4\u5219\u9759\u9ed8\u8f6c\u53d1\u6307\u5b9a\u597d\u53cb\u7684\u65b0\u670b\u53cb\u5708"

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 167
    .line 168
    .line 169
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 170
    .line 171
    return-object p1

    .line 172
    :pswitch_1
    move-object v5, p1

    .line 173
    check-cast v5, Li0/h0;

    .line 174
    .line 175
    check-cast p2, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    and-int/lit8 p2, p1, 0x3

    .line 182
    .line 183
    const/4 v0, 0x2

    .line 184
    const/4 v1, 0x1

    .line 185
    if-eq p2, v0, :cond_8

    .line 186
    .line 187
    move p2, v1

    .line 188
    goto :goto_4

    .line 189
    :cond_8
    const/4 p2, 0x0

    .line 190
    :goto_4
    and-int/2addr p1, v1

    .line 191
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_b

    .line 196
    .line 197
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 198
    .line 199
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    check-cast p2, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iget-object p2, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 210
    .line 211
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

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
    sget-object v1, Li0/l;->a:Li0/e;

    .line 222
    .line 223
    if-ne v2, v1, :cond_a

    .line 224
    .line 225
    :cond_9
    new-instance v2, Lwb/wb;

    .line 226
    .line 227
    const/16 v1, 0x8

    .line 228
    .line 229
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_a
    move-object v4, v2

    .line 236
    check-cast v4, Lfg/l;

    .line 237
    .line 238
    const/16 v6, 0x1b0

    .line 239
    .line 240
    const/16 v7, 0x8

    .line 241
    .line 242
    const-string v1, "\u8df3\u8fc7\u5168\u5c40\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a"

    .line 243
    .line 244
    const-string v2, "\u963b\u6b62\u6240\u6709\u5c0f\u7a0b\u5e8f\u5c55\u793a\u542f\u52a8\u5f00\u5c4f\u5e7f\u544a\uff0c\u4fee\u6539\u540e\u9700\u91cd\u542f\u5fae\u4fe1"

    .line 245
    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 252
    .line 253
    .line 254
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 255
    .line 256
    return-object p1

    .line 257
    :pswitch_2
    move-object v5, p1

    .line 258
    check-cast v5, Li0/h0;

    .line 259
    .line 260
    check-cast p2, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    and-int/lit8 p2, p1, 0x3

    .line 267
    .line 268
    const/4 v0, 0x2

    .line 269
    const/4 v1, 0x1

    .line 270
    if-eq p2, v0, :cond_c

    .line 271
    .line 272
    move p2, v1

    .line 273
    goto :goto_6

    .line 274
    :cond_c
    const/4 p2, 0x0

    .line 275
    :goto_6
    and-int/2addr p1, v1

    .line 276
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-eqz p1, :cond_f

    .line 281
    .line 282
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 283
    .line 284
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    check-cast p2, Ljava/lang/Boolean;

    .line 289
    .line 290
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    iget-object p2, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 295
    .line 296
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    if-nez v1, :cond_d

    .line 305
    .line 306
    sget-object v1, Li0/l;->a:Li0/e;

    .line 307
    .line 308
    if-ne v2, v1, :cond_e

    .line 309
    .line 310
    :cond_d
    new-instance v2, Lwb/wb;

    .line 311
    .line 312
    const/16 v1, 0x14

    .line 313
    .line 314
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_e
    move-object v4, v2

    .line 321
    check-cast v4, Lfg/l;

    .line 322
    .line 323
    const/16 v6, 0x1b0

    .line 324
    .line 325
    const/16 v7, 0x8

    .line 326
    .line 327
    const-string v1, "\u517c\u5bb9\u4f4e\u7248\u672c\u5c0f\u7a0b\u5e8f"

    .line 328
    .line 329
    const-string v2, "\u4f2a\u88c5\u542f\u52a8\u57fa\u7840\u5e93\u7248\u672c\u5e76\u963b\u6b62\u5b98\u65b9\u5347\u7ea7\u9875"

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 333
    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 337
    .line 338
    .line 339
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 340
    .line 341
    return-object p1

    .line 342
    :pswitch_3
    move-object v5, p1

    .line 343
    check-cast v5, Li0/h0;

    .line 344
    .line 345
    check-cast p2, Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    and-int/lit8 p2, p1, 0x3

    .line 352
    .line 353
    const/4 v0, 0x2

    .line 354
    const/4 v1, 0x1

    .line 355
    if-eq p2, v0, :cond_10

    .line 356
    .line 357
    move p2, v1

    .line 358
    goto :goto_8

    .line 359
    :cond_10
    const/4 p2, 0x0

    .line 360
    :goto_8
    and-int/2addr p1, v1

    .line 361
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-eqz p1, :cond_13

    .line 366
    .line 367
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 368
    .line 369
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    check-cast p2, Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    iget-object p2, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 380
    .line 381
    invoke-virtual {v5, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    if-nez v1, :cond_11

    .line 390
    .line 391
    sget-object v1, Li0/l;->a:Li0/e;

    .line 392
    .line 393
    if-ne v2, v1, :cond_12

    .line 394
    .line 395
    :cond_11
    new-instance v2, Lwb/wb;

    .line 396
    .line 397
    const/4 v1, 0x7

    .line 398
    invoke-direct {v2, p2, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :cond_12
    move-object v4, v2

    .line 405
    check-cast v4, Lfg/l;

    .line 406
    .line 407
    const/16 v6, 0x1b0

    .line 408
    .line 409
    const/16 v7, 0x8

    .line 410
    .line 411
    const-string v1, "\u8df3\u8fc7\u5c0f\u7a0b\u5e8f\u89c6\u9891\u5e7f\u544a"

    .line 412
    .line 413
    const-string v2, "\u81ea\u52a8\u8df3\u8fc7\u5c0f\u7a0b\u5e8f\u89c6\u9891\u5e7f\u544a"

    .line 414
    .line 415
    const/4 v3, 0x0

    .line 416
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 417
    .line 418
    .line 419
    goto :goto_9

    .line 420
    :cond_13
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 421
    .line 422
    .line 423
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 424
    .line 425
    return-object p1

    .line 426
    :pswitch_4
    move-object v5, p1

    .line 427
    check-cast v5, Li0/h0;

    .line 428
    .line 429
    check-cast p2, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    and-int/lit8 p2, p1, 0x3

    .line 436
    .line 437
    const/4 v0, 0x2

    .line 438
    const/4 v7, 0x0

    .line 439
    const/4 v8, 0x1

    .line 440
    if-eq p2, v0, :cond_14

    .line 441
    .line 442
    move p2, v8

    .line 443
    goto :goto_a

    .line 444
    :cond_14
    move p2, v7

    .line 445
    :goto_a
    and-int/2addr p1, v8

    .line 446
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    if-eqz p1, :cond_16

    .line 451
    .line 452
    const/4 v4, 0x0

    .line 453
    const/16 v6, 0x6db0

    .line 454
    .line 455
    iget-object v0, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 456
    .line 457
    const-string v1, "protobuf_packet_enable"

    .line 458
    .line 459
    const-string v2, "Protobuf \u6293\u5305"

    .line 460
    .line 461
    const-string v3, "\u5f00\u542f\u540e\u8f93\u51fa\u8bf7\u6c42\u548c\u54cd\u5e94\u5230 LSPosed \u65e5\u5fd7"

    .line 462
    .line 463
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 464
    .line 465
    .line 466
    const/4 p1, 0x0

    .line 467
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 468
    .line 469
    .line 470
    const/4 v4, 0x1

    .line 471
    const-string v1, "protobuf_packet_capture_request"

    .line 472
    .line 473
    const-string v2, "\u6293\u8bf7\u6c42"

    .line 474
    .line 475
    const-string v3, "\u8bb0\u5f55\u8bf7\u6c42 URI\u3001Type \u548c PB JSON"

    .line 476
    .line 477
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 478
    .line 479
    .line 480
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 481
    .line 482
    .line 483
    const-string v1, "protobuf_packet_capture_response"

    .line 484
    .line 485
    const-string v2, "\u6293\u54cd\u5e94"

    .line 486
    .line 487
    const-string v3, "\u8bb0\u5f55\u54cd\u5e94 URI\u3001Type \u548c PB JSON"

    .line 488
    .line 489
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 490
    .line 491
    .line 492
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 493
    .line 494
    .line 495
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 496
    .line 497
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p2

    .line 501
    move-object v2, p2

    .line 502
    check-cast v2, Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    sget-object v0, Li0/l;->a:Li0/e;

    .line 509
    .line 510
    if-ne p2, v0, :cond_15

    .line 511
    .line 512
    new-instance p2, Lwb/hd;

    .line 513
    .line 514
    const/4 v0, 0x3

    .line 515
    invoke-direct {p2, p1, v0}, Lwb/hd;-><init>(Li0/a1;I)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v5, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    :cond_15
    move-object v4, p2

    .line 522
    check-cast v4, Lfg/l;

    .line 523
    .line 524
    const/16 v6, 0x6c36

    .line 525
    .line 526
    const/4 v7, 0x0

    .line 527
    const-string v0, "\u8fc7\u6ee4 Type"

    .line 528
    .line 529
    const-string v1, "\u591a\u4e2a Type \u7528\u9017\u53f7\u6216\u7a7a\u683c\u5206\u9694"

    .line 530
    .line 531
    const/4 v3, 0x3

    .line 532
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 533
    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_16
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 537
    .line 538
    .line 539
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 540
    .line 541
    return-object p1

    .line 542
    :pswitch_5
    move-object v5, p1

    .line 543
    check-cast v5, Li0/h0;

    .line 544
    .line 545
    check-cast p2, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result p1

    .line 551
    and-int/lit8 p2, p1, 0x3

    .line 552
    .line 553
    const/4 v0, 0x2

    .line 554
    const/4 v7, 0x0

    .line 555
    const/4 v8, 0x1

    .line 556
    if-eq p2, v0, :cond_17

    .line 557
    .line 558
    move p2, v8

    .line 559
    goto :goto_c

    .line 560
    :cond_17
    move p2, v7

    .line 561
    :goto_c
    and-int/2addr p1, v8

    .line 562
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 563
    .line 564
    .line 565
    move-result p1

    .line 566
    if-eqz p1, :cond_1a

    .line 567
    .line 568
    const/4 v4, 0x0

    .line 569
    const/16 v6, 0x6db0

    .line 570
    .line 571
    iget-object v0, p0, Lwb/m8;->h:Landroid/content/SharedPreferences;

    .line 572
    .line 573
    const-string v1, "enable"

    .line 574
    .line 575
    const-string v2, "\u7fa4\u5458\u5934\u8854"

    .line 576
    .line 577
    const-string v3, "\u5728\u7fa4\u804a\u6635\u79f0\u5de6\u4fa7\u663e\u793a\u8eab\u4efd\u5934\u8854"

    .line 578
    .line 579
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 580
    .line 581
    .line 582
    const/4 p1, 0x0

    .line 583
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 584
    .line 585
    .line 586
    iget-object p1, p0, Lwb/m8;->i:Li0/a1;

    .line 587
    .line 588
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p2

    .line 592
    check-cast p2, Ljava/lang/Boolean;

    .line 593
    .line 594
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 595
    .line 596
    .line 597
    move-result p2

    .line 598
    invoke-virtual {v5, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    if-nez v1, :cond_18

    .line 607
    .line 608
    sget-object v1, Li0/l;->a:Li0/e;

    .line 609
    .line 610
    if-ne v2, v1, :cond_19

    .line 611
    .line 612
    :cond_18
    new-instance v2, Lwb/wb;

    .line 613
    .line 614
    const/4 v1, 0x6

    .line 615
    invoke-direct {v2, v0, p1, v1}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :cond_19
    move-object v4, v2

    .line 622
    check-cast v4, Lfg/l;

    .line 623
    .line 624
    const/16 v6, 0x1b0

    .line 625
    .line 626
    const/16 v7, 0x8

    .line 627
    .line 628
    const-string v1, "\u663e\u793a\u666e\u901a\u7fa4\u5458"

    .line 629
    .line 630
    const-string v2, "\u5173\u95ed\u540e\u53ea\u663e\u793a\u7fa4\u4e3b\u3001\u7ba1\u7406\u5458\u548c\u81ea\u5b9a\u4e49\u5934\u8854"

    .line 631
    .line 632
    const/4 v3, 0x0

    .line 633
    move v0, p2

    .line 634
    invoke-static/range {v0 .. v7}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 635
    .line 636
    .line 637
    goto :goto_d

    .line 638
    :cond_1a
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 639
    .line 640
    .line 641
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 642
    .line 643
    return-object p1

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
