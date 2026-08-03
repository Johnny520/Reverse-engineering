.class public final synthetic Lia/t;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lia/t;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lia/t;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ly8/a;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Throwable;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lxa/c;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Ld1/z;

    .line 41
    .line 42
    check-cast p2, Ld1/z;

    .line 43
    .line 44
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lx2/s;

    .line 47
    .line 48
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p2}, Ld1/z;->a()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ne p2, p1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    new-instance p2, Lgg/u;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lc1/b;

    .line 73
    .line 74
    const/4 v2, 0x6

    .line 75
    invoke-direct {v1, p2, v2, v0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p2, Lgg/u;->g:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Ls/h0;

    .line 84
    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    invoke-virtual {p2}, Ls/h0;->a()Ls/h0;

    .line 88
    .line 89
    .line 90
    move-object p1, p2

    .line 91
    :cond_2
    iput-object p1, v0, Lx2/s;->x:Ls/h0;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    iget-object p2, v0, Lx2/s;->x:Ls/h0;

    .line 95
    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    invoke-virtual {p2}, Ls/h0;->b()V

    .line 99
    .line 100
    .line 101
    :cond_4
    iput-object p1, v0, Lx2/s;->x:Ls/h0;

    .line 102
    .line 103
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Throwable;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lua/b;

    .line 116
    .line 117
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 124
    .line 125
    check-cast p2, Ljava/lang/Throwable;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lua/b;

    .line 133
    .line 134
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    return-object p1

    .line 140
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 141
    .line 142
    check-cast p2, Ljava/lang/Throwable;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lu9/b;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v0, "[Hchat:\u9690\u85cf\u5fae\u4fe1\u5e95\u680f] "

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 164
    .line 165
    return-object p1

    .line 166
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 167
    .line 168
    check-cast p2, Ljava/lang/Throwable;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lu9/b;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    const-string v0, "[Hchat:\u9690\u85cf\u5fae\u4fe1\u5e95\u680f] "

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 193
    .line 194
    check-cast p2, Ljava/lang/Throwable;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lrb/b;

    .line 202
    .line 203
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 207
    .line 208
    return-object p1

    .line 209
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 210
    .line 211
    check-cast p2, Ljava/lang/Throwable;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lrb/b;

    .line 219
    .line 220
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 224
    .line 225
    return-object p1

    .line 226
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 227
    .line 228
    check-cast p2, Ljava/lang/Throwable;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lr9/a;

    .line 236
    .line 237
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 244
    .line 245
    check-cast p2, Ljava/lang/Throwable;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Lqb/a;

    .line 253
    .line 254
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 261
    .line 262
    check-cast p2, Ljava/lang/Throwable;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Lq9/b;

    .line 270
    .line 271
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 275
    .line 276
    return-object p1

    .line 277
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 278
    .line 279
    check-cast p2, Ljava/lang/Throwable;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Lq9/b;

    .line 287
    .line 288
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 292
    .line 293
    return-object p1

    .line 294
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 295
    .line 296
    check-cast p2, Ljava/lang/Throwable;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Lpb/a;

    .line 304
    .line 305
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 309
    .line 310
    return-object p1

    .line 311
    :pswitch_d
    check-cast p1, Ljava/lang/String;

    .line 312
    .line 313
    check-cast p2, Ljava/lang/Throwable;

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lob/f;

    .line 321
    .line 322
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 326
    .line 327
    return-object p1

    .line 328
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 329
    .line 330
    check-cast p2, Ljava/lang/Throwable;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lo9/a;

    .line 338
    .line 339
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 346
    .line 347
    check-cast p2, Ljava/lang/Throwable;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Lo9/a;

    .line 355
    .line 356
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 360
    .line 361
    return-object p1

    .line 362
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 363
    .line 364
    check-cast p2, Ljava/lang/Throwable;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lma/a;

    .line 372
    .line 373
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 377
    .line 378
    return-object p1

    .line 379
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 380
    .line 381
    check-cast p2, Ljava/lang/Throwable;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v0, Lm9/a;

    .line 389
    .line 390
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 394
    .line 395
    return-object p1

    .line 396
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 397
    .line 398
    check-cast p2, Ljava/lang/Throwable;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, Llb/k;

    .line 406
    .line 407
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 411
    .line 412
    return-object p1

    .line 413
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 414
    .line 415
    check-cast p2, Ljava/lang/Throwable;

    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v0, Ll9/a;

    .line 423
    .line 424
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 428
    .line 429
    return-object p1

    .line 430
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 431
    .line 432
    check-cast p2, Ljava/lang/Throwable;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Lka/b;

    .line 440
    .line 441
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 442
    .line 443
    .line 444
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 445
    .line 446
    return-object p1

    .line 447
    :pswitch_15
    check-cast p1, Ld1/z;

    .line 448
    .line 449
    check-cast p2, Ld1/z;

    .line 450
    .line 451
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Lk/i0;

    .line 454
    .line 455
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 456
    .line 457
    if-nez v1, :cond_5

    .line 458
    .line 459
    goto/16 :goto_3

    .line 460
    .line 461
    :cond_5
    invoke-virtual {p2}, Ld1/z;->a()Z

    .line 462
    .line 463
    .line 464
    move-result p2

    .line 465
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 466
    .line 467
    .line 468
    move-result p1

    .line 469
    if-ne p2, p1, :cond_6

    .line 470
    .line 471
    goto/16 :goto_3

    .line 472
    .line 473
    :cond_6
    iget-object p1, v0, Lk/i0;->x:Lfg/l;

    .line 474
    .line 475
    if-eqz p1, :cond_7

    .line 476
    .line 477
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-interface {p1, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    :cond_7
    sget-object p1, Lk/j0;->u:Lk/b;

    .line 485
    .line 486
    const/4 v1, 0x0

    .line 487
    if-eqz p2, :cond_9

    .line 488
    .line 489
    invoke-virtual {v0}, Ly0/n;->Y0()Lqg/t;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    new-instance v3, Lci/c;

    .line 494
    .line 495
    const/4 v4, 0x5

    .line 496
    invoke-direct {v3, v0, v1, v4}, Lci/c;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 497
    .line 498
    .line 499
    const/4 v4, 0x3

    .line 500
    invoke-static {v2, v1, v3, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 501
    .line 502
    .line 503
    new-instance v2, Lgg/u;

    .line 504
    .line 505
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 506
    .line 507
    .line 508
    new-instance v3, Laa/c;

    .line 509
    .line 510
    const/16 v4, 0x15

    .line 511
    .line 512
    invoke-direct {v3, v2, v4, v0}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-static {v0, v3}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 516
    .line 517
    .line 518
    iget-object v2, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v2, Ls/h0;

    .line 521
    .line 522
    if-eqz v2, :cond_8

    .line 523
    .line 524
    invoke-virtual {v2}, Ls/h0;->a()Ls/h0;

    .line 525
    .line 526
    .line 527
    goto :goto_1

    .line 528
    :cond_8
    move-object v2, v1

    .line 529
    :goto_1
    iput-object v2, v0, Lk/i0;->z:Ls/h0;

    .line 530
    .line 531
    iget-object v2, v0, Lk/i0;->A:Lx1/i1;

    .line 532
    .line 533
    if-eqz v2, :cond_b

    .line 534
    .line 535
    invoke-virtual {v2}, Lx1/i1;->r1()Ly0/n;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 540
    .line 541
    if-eqz v2, :cond_b

    .line 542
    .line 543
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 544
    .line 545
    if-eqz v2, :cond_b

    .line 546
    .line 547
    invoke-static {v0, p1}, Lx1/k;->j(Lx1/j;Ljava/lang/Object;)Lx1/e2;

    .line 548
    .line 549
    .line 550
    goto :goto_2

    .line 551
    :cond_9
    iget-object v2, v0, Lk/i0;->z:Ls/h0;

    .line 552
    .line 553
    if-eqz v2, :cond_a

    .line 554
    .line 555
    invoke-virtual {v2}, Ls/h0;->b()V

    .line 556
    .line 557
    .line 558
    :cond_a
    iput-object v1, v0, Lk/i0;->z:Ls/h0;

    .line 559
    .line 560
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 561
    .line 562
    if-eqz v2, :cond_b

    .line 563
    .line 564
    invoke-static {v0, p1}, Lx1/k;->j(Lx1/j;Ljava/lang/Object;)Lx1/e2;

    .line 565
    .line 566
    .line 567
    :cond_b
    :goto_2
    invoke-static {v0}, Lx1/k;->n(Lx1/z1;)V

    .line 568
    .line 569
    .line 570
    iget-object p1, v0, Lk/i0;->w:Ln/k;

    .line 571
    .line 572
    if-eqz p1, :cond_e

    .line 573
    .line 574
    iget-object v2, v0, Lk/i0;->y:Ln/f;

    .line 575
    .line 576
    if-eqz p2, :cond_d

    .line 577
    .line 578
    if-eqz v2, :cond_c

    .line 579
    .line 580
    new-instance p2, Ln/g;

    .line 581
    .line 582
    invoke-direct {p2, v2}, Ln/g;-><init>(Ln/f;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, p1, p2}, Lk/i0;->n1(Ln/k;Ln/j;)V

    .line 586
    .line 587
    .line 588
    iput-object v1, v0, Lk/i0;->y:Ln/f;

    .line 589
    .line 590
    :cond_c
    new-instance p2, Ln/f;

    .line 591
    .line 592
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, p1, p2}, Lk/i0;->n1(Ln/k;Ln/j;)V

    .line 596
    .line 597
    .line 598
    iput-object p2, v0, Lk/i0;->y:Ln/f;

    .line 599
    .line 600
    goto :goto_3

    .line 601
    :cond_d
    if-eqz v2, :cond_e

    .line 602
    .line 603
    new-instance p2, Ln/g;

    .line 604
    .line 605
    invoke-direct {p2, v2}, Ln/g;-><init>(Ln/f;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, p1, p2}, Lk/i0;->n1(Ln/k;Ln/j;)V

    .line 609
    .line 610
    .line 611
    iput-object v1, v0, Lk/i0;->y:Ln/f;

    .line 612
    .line 613
    :cond_e
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 614
    .line 615
    return-object p1

    .line 616
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 617
    .line 618
    check-cast p2, Ljava/lang/Throwable;

    .line 619
    .line 620
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, Ljb/a;

    .line 626
    .line 627
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 628
    .line 629
    .line 630
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 631
    .line 632
    return-object p1

    .line 633
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 634
    .line 635
    check-cast p2, Ljava/lang/Throwable;

    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v0, Lja/a;

    .line 643
    .line 644
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 645
    .line 646
    .line 647
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 648
    .line 649
    return-object p1

    .line 650
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 651
    .line 652
    check-cast p2, Ljava/lang/Throwable;

    .line 653
    .line 654
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v0, Lj9/a;

    .line 660
    .line 661
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 662
    .line 663
    .line 664
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 665
    .line 666
    return-object p1

    .line 667
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 668
    .line 669
    check-cast p2, Ljava/lang/Throwable;

    .line 670
    .line 671
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v0, Lj8/h;

    .line 677
    .line 678
    invoke-static {v0, p1, p2}, Lj8/h;->a(Lj8/h;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 679
    .line 680
    .line 681
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 682
    .line 683
    return-object p1

    .line 684
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 685
    .line 686
    check-cast p2, Ljava/lang/Throwable;

    .line 687
    .line 688
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v0, Lj8/h;

    .line 694
    .line 695
    invoke-static {v0, p1, p2}, Lj8/h;->a(Lj8/h;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 696
    .line 697
    .line 698
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 699
    .line 700
    return-object p1

    .line 701
    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    .line 702
    .line 703
    check-cast p2, Ljava/lang/Throwable;

    .line 704
    .line 705
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v0, Lj8/h;

    .line 711
    .line 712
    invoke-static {v0, p1, p2}, Lj8/h;->a(Lj8/h;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 713
    .line 714
    .line 715
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 716
    .line 717
    return-object p1

    .line 718
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 719
    .line 720
    check-cast p2, Ljava/lang/Throwable;

    .line 721
    .line 722
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    iget-object v0, p0, Lgg/d;->h:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v0, Lia/u;

    .line 728
    .line 729
    invoke-virtual {v0, p1, p2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 730
    .line 731
    .line 732
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 733
    .line 734
    return-object p1

    .line 735
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
