.class public final synthetic Lwb/g1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/g1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/g1;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/g1;->i:Lfg/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/g1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lth/a;

    .line 7
    .line 8
    move-object v6, p2

    .line 9
    check-cast v6, Li0/h0;

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
    and-int/lit8 p1, p2, 0x11

    .line 21
    .line 22
    const/16 p3, 0x10

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, p3, :cond_0

    .line 26
    .line 27
    move p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    and-int/2addr p2, v0

    .line 31
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/16 v7, 0x186

    .line 38
    .line 39
    const/16 v8, 0x30

    .line 40
    .line 41
    const-string v0, "\u4fdd\u5b58\u914d\u7f6e"

    .line 42
    .line 43
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 44
    .line 45
    const-string v2, "\u8fd4\u56de"

    .line 46
    .line 47
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 56
    .line 57
    .line 58
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_0
    check-cast p1, Lth/a;

    .line 62
    .line 63
    move-object v6, p2

    .line 64
    check-cast v6, Li0/h0;

    .line 65
    .line 66
    check-cast p3, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    and-int/lit8 p1, p2, 0x11

    .line 76
    .line 77
    const/16 p3, 0x10

    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    if-eq p1, p3, :cond_2

    .line 81
    .line 82
    move p1, v0

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/4 p1, 0x0

    .line 85
    :goto_2
    and-int/2addr p2, v0

    .line 86
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    const/16 v7, 0x186

    .line 93
    .line 94
    const/16 v8, 0x30

    .line 95
    .line 96
    const-string v0, "\u6dfb\u52a0\u5173\u952e\u8bcd"

    .line 97
    .line 98
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 99
    .line 100
    const-string v2, "\u8fd4\u56de"

    .line 101
    .line 102
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    invoke-virtual {v6}, Li0/h0;->V()V

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
    check-cast p1, Lth/a;

    .line 117
    .line 118
    move-object v6, p2

    .line 119
    check-cast v6, Li0/h0;

    .line 120
    .line 121
    check-cast p3, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    and-int/lit8 p1, p2, 0x11

    .line 131
    .line 132
    const/16 p3, 0x10

    .line 133
    .line 134
    const/4 v0, 0x1

    .line 135
    if-eq p1, p3, :cond_4

    .line 136
    .line 137
    move p1, v0

    .line 138
    goto :goto_4

    .line 139
    :cond_4
    const/4 p1, 0x0

    .line 140
    :goto_4
    and-int/2addr p2, v0

    .line 141
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    const/16 v7, 0x186

    .line 148
    .line 149
    const/16 v8, 0x30

    .line 150
    .line 151
    const-string v0, "\u65b0\u589e\u6a21\u677f"

    .line 152
    .line 153
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 154
    .line 155
    const-string v2, "\u8fd4\u56de"

    .line 156
    .line 157
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    const/4 v5, 0x0

    .line 161
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 166
    .line 167
    .line 168
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_2
    check-cast p1, Lth/a;

    .line 172
    .line 173
    move-object v6, p2

    .line 174
    check-cast v6, Li0/h0;

    .line 175
    .line 176
    check-cast p3, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    and-int/lit8 p1, p2, 0x11

    .line 186
    .line 187
    const/16 p3, 0x10

    .line 188
    .line 189
    const/4 v0, 0x1

    .line 190
    if-eq p1, p3, :cond_6

    .line 191
    .line 192
    move p1, v0

    .line 193
    goto :goto_6

    .line 194
    :cond_6
    const/4 p1, 0x0

    .line 195
    :goto_6
    and-int/2addr p2, v0

    .line 196
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_7

    .line 201
    .line 202
    const/16 v7, 0x186

    .line 203
    .line 204
    const/16 v8, 0x30

    .line 205
    .line 206
    const-string v0, "\u65b0\u589e\u6a21\u677f"

    .line 207
    .line 208
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 209
    .line 210
    const-string v2, "\u8fd4\u56de"

    .line 211
    .line 212
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    const/4 v5, 0x0

    .line 216
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_7
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 221
    .line 222
    .line 223
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 224
    .line 225
    return-object p1

    .line 226
    :pswitch_3
    check-cast p1, Lth/a;

    .line 227
    .line 228
    move-object v6, p2

    .line 229
    check-cast v6, Li0/h0;

    .line 230
    .line 231
    check-cast p3, Ljava/lang/Integer;

    .line 232
    .line 233
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    and-int/lit8 p1, p2, 0x11

    .line 241
    .line 242
    const/16 p3, 0x10

    .line 243
    .line 244
    const/4 v0, 0x1

    .line 245
    if-eq p1, p3, :cond_8

    .line 246
    .line 247
    move p1, v0

    .line 248
    goto :goto_8

    .line 249
    :cond_8
    const/4 p1, 0x0

    .line 250
    :goto_8
    and-int/2addr p2, v0

    .line 251
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_9

    .line 256
    .line 257
    const/16 v7, 0x186

    .line 258
    .line 259
    const/16 v8, 0x30

    .line 260
    .line 261
    const-string v0, "\u65b0\u589e\u6a21\u677f"

    .line 262
    .line 263
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 264
    .line 265
    const-string v2, "\u8fd4\u56de"

    .line 266
    .line 267
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 268
    .line 269
    const/4 v4, 0x0

    .line 270
    const/4 v5, 0x0

    .line 271
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 272
    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_9
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 276
    .line 277
    .line 278
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 279
    .line 280
    return-object p1

    .line 281
    :pswitch_4
    check-cast p1, Lth/a;

    .line 282
    .line 283
    move-object v6, p2

    .line 284
    check-cast v6, Li0/h0;

    .line 285
    .line 286
    check-cast p3, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    and-int/lit8 p1, p2, 0x11

    .line 296
    .line 297
    const/16 p3, 0x10

    .line 298
    .line 299
    const/4 v0, 0x1

    .line 300
    if-eq p1, p3, :cond_a

    .line 301
    .line 302
    move p1, v0

    .line 303
    goto :goto_a

    .line 304
    :cond_a
    const/4 p1, 0x0

    .line 305
    :goto_a
    and-int/2addr p2, v0

    .line 306
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-eqz p1, :cond_b

    .line 311
    .line 312
    const/16 v7, 0x186

    .line 313
    .line 314
    const/16 v8, 0x30

    .line 315
    .line 316
    const-string v0, "\u65b0\u589e\u6a21\u677f"

    .line 317
    .line 318
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 319
    .line 320
    const-string v2, "\u8fd4\u56de"

    .line 321
    .line 322
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 323
    .line 324
    const/4 v4, 0x0

    .line 325
    const/4 v5, 0x0

    .line 326
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 327
    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 331
    .line 332
    .line 333
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 334
    .line 335
    return-object p1

    .line 336
    :pswitch_5
    check-cast p1, Lth/a;

    .line 337
    .line 338
    move-object v6, p2

    .line 339
    check-cast v6, Li0/h0;

    .line 340
    .line 341
    check-cast p3, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    and-int/lit8 p1, p2, 0x11

    .line 351
    .line 352
    const/16 p3, 0x10

    .line 353
    .line 354
    const/4 v0, 0x1

    .line 355
    if-eq p1, p3, :cond_c

    .line 356
    .line 357
    move p1, v0

    .line 358
    goto :goto_c

    .line 359
    :cond_c
    const/4 p1, 0x0

    .line 360
    :goto_c
    and-int/2addr p2, v0

    .line 361
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-eqz p1, :cond_d

    .line 366
    .line 367
    const/16 v7, 0x186

    .line 368
    .line 369
    const/16 v8, 0x30

    .line 370
    .line 371
    const-string v0, "\u65b0\u589e\u6807\u7b7e"

    .line 372
    .line 373
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 374
    .line 375
    const-string v2, "\u8fd4\u56de"

    .line 376
    .line 377
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    const/4 v5, 0x0

    .line 381
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 382
    .line 383
    .line 384
    goto :goto_d

    .line 385
    :cond_d
    invoke-virtual {v6}, Li0/h0;->V()V

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
    check-cast p1, Lth/a;

    .line 392
    .line 393
    move-object v6, p2

    .line 394
    check-cast v6, Li0/h0;

    .line 395
    .line 396
    check-cast p3, Ljava/lang/Integer;

    .line 397
    .line 398
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result p2

    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    and-int/lit8 p1, p2, 0x11

    .line 406
    .line 407
    const/16 p3, 0x10

    .line 408
    .line 409
    const/4 v0, 0x1

    .line 410
    if-eq p1, p3, :cond_e

    .line 411
    .line 412
    move p1, v0

    .line 413
    goto :goto_e

    .line 414
    :cond_e
    const/4 p1, 0x0

    .line 415
    :goto_e
    and-int/2addr p2, v0

    .line 416
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_f

    .line 421
    .line 422
    const/16 v7, 0x186

    .line 423
    .line 424
    const/16 v8, 0x30

    .line 425
    .line 426
    const-string v0, "\u4fdd\u5b58\u4efb\u52a1"

    .line 427
    .line 428
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 429
    .line 430
    const-string v2, "\u8fd4\u56de"

    .line 431
    .line 432
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 433
    .line 434
    const/4 v4, 0x0

    .line 435
    const/4 v5, 0x0

    .line 436
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 437
    .line 438
    .line 439
    goto :goto_f

    .line 440
    :cond_f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 441
    .line 442
    .line 443
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 444
    .line 445
    return-object p1

    .line 446
    :pswitch_7
    check-cast p1, Lth/a;

    .line 447
    .line 448
    move-object v6, p2

    .line 449
    check-cast v6, Li0/h0;

    .line 450
    .line 451
    check-cast p3, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result p2

    .line 457
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    and-int/lit8 p1, p2, 0x11

    .line 461
    .line 462
    const/16 p3, 0x10

    .line 463
    .line 464
    const/4 v0, 0x1

    .line 465
    if-eq p1, p3, :cond_10

    .line 466
    .line 467
    move p1, v0

    .line 468
    goto :goto_10

    .line 469
    :cond_10
    const/4 p1, 0x0

    .line 470
    :goto_10
    and-int/2addr p2, v0

    .line 471
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 472
    .line 473
    .line 474
    move-result p1

    .line 475
    if-eqz p1, :cond_11

    .line 476
    .line 477
    const/16 v7, 0x186

    .line 478
    .line 479
    const/16 v8, 0x30

    .line 480
    .line 481
    const-string v0, "\u5f00\u59cb\u7fa4\u53d1"

    .line 482
    .line 483
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 484
    .line 485
    const-string v2, "\u8fd4\u56de"

    .line 486
    .line 487
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 488
    .line 489
    const/4 v4, 0x0

    .line 490
    const/4 v5, 0x0

    .line 491
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 492
    .line 493
    .line 494
    goto :goto_11

    .line 495
    :cond_11
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 496
    .line 497
    .line 498
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 499
    .line 500
    return-object p1

    .line 501
    :pswitch_8
    check-cast p1, Lth/a;

    .line 502
    .line 503
    move-object v6, p2

    .line 504
    check-cast v6, Li0/h0;

    .line 505
    .line 506
    check-cast p3, Ljava/lang/Integer;

    .line 507
    .line 508
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result p2

    .line 512
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    and-int/lit8 p1, p2, 0x11

    .line 516
    .line 517
    const/16 p3, 0x10

    .line 518
    .line 519
    const/4 v0, 0x1

    .line 520
    if-eq p1, p3, :cond_12

    .line 521
    .line 522
    move p1, v0

    .line 523
    goto :goto_12

    .line 524
    :cond_12
    const/4 p1, 0x0

    .line 525
    :goto_12
    and-int/2addr p2, v0

    .line 526
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    if-eqz p1, :cond_13

    .line 531
    .line 532
    const/16 v7, 0x186

    .line 533
    .line 534
    const/16 v8, 0x30

    .line 535
    .line 536
    const-string v0, "\u65b0\u589e\u6a21\u677f"

    .line 537
    .line 538
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 539
    .line 540
    const-string v2, "\u8fd4\u56de"

    .line 541
    .line 542
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 543
    .line 544
    const/4 v4, 0x0

    .line 545
    const/4 v5, 0x0

    .line 546
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 547
    .line 548
    .line 549
    goto :goto_13

    .line 550
    :cond_13
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 551
    .line 552
    .line 553
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 554
    .line 555
    return-object p1

    .line 556
    :pswitch_9
    check-cast p1, Lth/a;

    .line 557
    .line 558
    move-object v6, p2

    .line 559
    check-cast v6, Li0/h0;

    .line 560
    .line 561
    check-cast p3, Ljava/lang/Integer;

    .line 562
    .line 563
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 564
    .line 565
    .line 566
    move-result p2

    .line 567
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    and-int/lit8 p1, p2, 0x11

    .line 571
    .line 572
    const/16 p3, 0x10

    .line 573
    .line 574
    const/4 v0, 0x1

    .line 575
    if-eq p1, p3, :cond_14

    .line 576
    .line 577
    move p1, v0

    .line 578
    goto :goto_14

    .line 579
    :cond_14
    const/4 p1, 0x0

    .line 580
    :goto_14
    and-int/2addr p2, v0

    .line 581
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 582
    .line 583
    .line 584
    move-result p1

    .line 585
    if-eqz p1, :cond_15

    .line 586
    .line 587
    const/16 v7, 0x186

    .line 588
    .line 589
    const/16 v8, 0x30

    .line 590
    .line 591
    const-string v0, "\u4fdd\u5b58\u56de\u590d"

    .line 592
    .line 593
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 594
    .line 595
    const-string v2, "\u8fd4\u56de"

    .line 596
    .line 597
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 598
    .line 599
    const/4 v4, 0x0

    .line 600
    const/4 v5, 0x0

    .line 601
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 602
    .line 603
    .line 604
    goto :goto_15

    .line 605
    :cond_15
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 606
    .line 607
    .line 608
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 609
    .line 610
    return-object p1

    .line 611
    :pswitch_a
    check-cast p1, Lr/d;

    .line 612
    .line 613
    check-cast p2, Li0/h0;

    .line 614
    .line 615
    check-cast p3, Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result p3

    .line 621
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    and-int/lit8 p1, p3, 0x11

    .line 625
    .line 626
    const/16 v0, 0x10

    .line 627
    .line 628
    const/4 v1, 0x1

    .line 629
    if-eq p1, v0, :cond_16

    .line 630
    .line 631
    move p1, v1

    .line 632
    goto :goto_16

    .line 633
    :cond_16
    const/4 p1, 0x0

    .line 634
    :goto_16
    and-int/2addr p3, v1

    .line 635
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 636
    .line 637
    .line 638
    move-result p1

    .line 639
    if-eqz p1, :cond_17

    .line 640
    .line 641
    new-instance p1, Lwb/cf;

    .line 642
    .line 643
    const/4 p3, 0x1

    .line 644
    iget-object v0, p0, Lwb/g1;->h:Lfg/a;

    .line 645
    .line 646
    iget-object v2, p0, Lwb/g1;->i:Lfg/a;

    .line 647
    .line 648
    invoke-direct {p1, v0, v2, p3}, Lwb/cf;-><init>(Lfg/a;Lfg/a;I)V

    .line 649
    .line 650
    .line 651
    const p3, -0x450a833c

    .line 652
    .line 653
    .line 654
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    const/16 p3, 0x30

    .line 659
    .line 660
    const/4 v0, 0x0

    .line 661
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 662
    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_17
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 666
    .line 667
    .line 668
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 669
    .line 670
    return-object p1

    .line 671
    :pswitch_b
    check-cast p1, Lr/d;

    .line 672
    .line 673
    check-cast p2, Li0/h0;

    .line 674
    .line 675
    check-cast p3, Ljava/lang/Integer;

    .line 676
    .line 677
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 678
    .line 679
    .line 680
    move-result p3

    .line 681
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    and-int/lit8 p1, p3, 0x11

    .line 685
    .line 686
    const/16 v0, 0x10

    .line 687
    .line 688
    const/4 v1, 0x1

    .line 689
    if-eq p1, v0, :cond_18

    .line 690
    .line 691
    move p1, v1

    .line 692
    goto :goto_18

    .line 693
    :cond_18
    const/4 p1, 0x0

    .line 694
    :goto_18
    and-int/2addr p3, v1

    .line 695
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 696
    .line 697
    .line 698
    move-result p1

    .line 699
    if-eqz p1, :cond_19

    .line 700
    .line 701
    new-instance p1, Lwb/cf;

    .line 702
    .line 703
    const/4 p3, 0x0

    .line 704
    iget-object v0, p0, Lwb/g1;->h:Lfg/a;

    .line 705
    .line 706
    iget-object v2, p0, Lwb/g1;->i:Lfg/a;

    .line 707
    .line 708
    invoke-direct {p1, v0, v2, p3}, Lwb/cf;-><init>(Lfg/a;Lfg/a;I)V

    .line 709
    .line 710
    .line 711
    const p3, -0x34147f60

    .line 712
    .line 713
    .line 714
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    const/16 p3, 0x30

    .line 719
    .line 720
    const/4 v0, 0x0

    .line 721
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 722
    .line 723
    .line 724
    goto :goto_19

    .line 725
    :cond_19
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 726
    .line 727
    .line 728
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 729
    .line 730
    return-object p1

    .line 731
    :pswitch_c
    check-cast p1, Lth/a;

    .line 732
    .line 733
    move-object v6, p2

    .line 734
    check-cast v6, Li0/h0;

    .line 735
    .line 736
    check-cast p3, Ljava/lang/Integer;

    .line 737
    .line 738
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result p2

    .line 742
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    and-int/lit8 p1, p2, 0x11

    .line 746
    .line 747
    const/16 p3, 0x10

    .line 748
    .line 749
    const/4 v0, 0x1

    .line 750
    if-eq p1, p3, :cond_1a

    .line 751
    .line 752
    move p1, v0

    .line 753
    goto :goto_1a

    .line 754
    :cond_1a
    const/4 p1, 0x0

    .line 755
    :goto_1a
    and-int/2addr p2, v0

    .line 756
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 757
    .line 758
    .line 759
    move-result p1

    .line 760
    if-eqz p1, :cond_1b

    .line 761
    .line 762
    const/16 v7, 0x186

    .line 763
    .line 764
    const/16 v8, 0x30

    .line 765
    .line 766
    const-string v0, "\u4fdd\u5b58"

    .line 767
    .line 768
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 769
    .line 770
    const-string v2, "\u8fd4\u56de"

    .line 771
    .line 772
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 773
    .line 774
    const/4 v4, 0x0

    .line 775
    const/4 v5, 0x0

    .line 776
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 777
    .line 778
    .line 779
    goto :goto_1b

    .line 780
    :cond_1b
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 781
    .line 782
    .line 783
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 784
    .line 785
    return-object p1

    .line 786
    :pswitch_d
    check-cast p1, Lth/a;

    .line 787
    .line 788
    move-object v6, p2

    .line 789
    check-cast v6, Li0/h0;

    .line 790
    .line 791
    check-cast p3, Ljava/lang/Integer;

    .line 792
    .line 793
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 794
    .line 795
    .line 796
    move-result p2

    .line 797
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    and-int/lit8 p1, p2, 0x11

    .line 801
    .line 802
    const/16 p3, 0x10

    .line 803
    .line 804
    const/4 v0, 0x1

    .line 805
    if-eq p1, p3, :cond_1c

    .line 806
    .line 807
    move p1, v0

    .line 808
    goto :goto_1c

    .line 809
    :cond_1c
    const/4 p1, 0x0

    .line 810
    :goto_1c
    and-int/2addr p2, v0

    .line 811
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 812
    .line 813
    .line 814
    move-result p1

    .line 815
    if-eqz p1, :cond_1d

    .line 816
    .line 817
    const/16 v7, 0x186

    .line 818
    .line 819
    const/16 v8, 0x30

    .line 820
    .line 821
    const-string v0, "\u65b0\u589e\u4efb\u52a1"

    .line 822
    .line 823
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 824
    .line 825
    const-string v2, "\u8fd4\u56de"

    .line 826
    .line 827
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 828
    .line 829
    const/4 v4, 0x0

    .line 830
    const/4 v5, 0x0

    .line 831
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 832
    .line 833
    .line 834
    goto :goto_1d

    .line 835
    :cond_1d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 836
    .line 837
    .line 838
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 839
    .line 840
    return-object p1

    .line 841
    :pswitch_e
    check-cast p1, Lth/a;

    .line 842
    .line 843
    move-object v6, p2

    .line 844
    check-cast v6, Li0/h0;

    .line 845
    .line 846
    check-cast p3, Ljava/lang/Integer;

    .line 847
    .line 848
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 849
    .line 850
    .line 851
    move-result p2

    .line 852
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    and-int/lit8 p1, p2, 0x11

    .line 856
    .line 857
    const/16 p3, 0x10

    .line 858
    .line 859
    const/4 v0, 0x1

    .line 860
    if-eq p1, p3, :cond_1e

    .line 861
    .line 862
    move p1, v0

    .line 863
    goto :goto_1e

    .line 864
    :cond_1e
    const/4 p1, 0x0

    .line 865
    :goto_1e
    and-int/2addr p2, v0

    .line 866
    invoke-virtual {v6, p2, p1}, Li0/h0;->S(IZ)Z

    .line 867
    .line 868
    .line 869
    move-result p1

    .line 870
    if-eqz p1, :cond_1f

    .line 871
    .line 872
    const/16 v7, 0x186

    .line 873
    .line 874
    const/16 v8, 0x30

    .line 875
    .line 876
    const-string v0, "\u65b0\u589e\u5206\u7ec4"

    .line 877
    .line 878
    iget-object v1, p0, Lwb/g1;->h:Lfg/a;

    .line 879
    .line 880
    const-string v2, "\u8fd4\u56de"

    .line 881
    .line 882
    iget-object v3, p0, Lwb/g1;->i:Lfg/a;

    .line 883
    .line 884
    const/4 v4, 0x0

    .line 885
    const/4 v5, 0x0

    .line 886
    invoke-static/range {v0 .. v8}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 887
    .line 888
    .line 889
    goto :goto_1f

    .line 890
    :cond_1f
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 891
    .line 892
    .line 893
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 894
    .line 895
    return-object p1

    .line 896
    nop

    .line 897
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
