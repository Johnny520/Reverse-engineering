.class public final synthetic Lbe/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbe/i;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Lbe/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lca/s;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lca/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :pswitch_0
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lca/c;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :pswitch_1
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lca/c;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :pswitch_2
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lca/c;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :pswitch_3
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lqe/r;

    .line 69
    .line 70
    check-cast p1, Lqd/s;

    .line 71
    .line 72
    iget-object v0, v0, Lqe/r;->b:Landroidx/lifecycle/e0;

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Landroidx/lifecycle/e0;->c(Lqd/s;)Lqe/s;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-boolean p1, p1, Lqe/s;->b:Z

    .line 79
    .line 80
    return p1

    .line 81
    :pswitch_4
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lqd/r;

    .line 84
    .line 85
    check-cast p1, Lqd/r;

    .line 86
    .line 87
    if-ne p1, v0, :cond_0

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/4 p1, 0x0

    .line 92
    :goto_0
    return p1

    .line 93
    :pswitch_5
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lpd/q;

    .line 96
    .line 97
    check-cast p1, Lpd/q;

    .line 98
    .line 99
    if-ne p1, v0, :cond_1

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const/4 p1, 0x0

    .line 104
    :goto_1
    return p1

    .line 105
    :pswitch_6
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lca/c;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    return p1

    .line 120
    :pswitch_7
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lca/s;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Lca/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    return p1

    .line 135
    :pswitch_8
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, Lca/c;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    return p1

    .line 150
    :pswitch_9
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Lca/c;

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    return p1

    .line 165
    :pswitch_a
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lbc/a;

    .line 168
    .line 169
    check-cast p1, Ljava/util/Map$Entry;

    .line 170
    .line 171
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Lbc/a;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-gt p1, v0, :cond_2

    .line 186
    .line 187
    const/4 p1, 0x1

    .line 188
    goto :goto_2

    .line 189
    :cond_2
    const/4 p1, 0x0

    .line 190
    :goto_2
    return p1

    .line 191
    :pswitch_b
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lud/j;

    .line 194
    .line 195
    check-cast p1, Lme/e;

    .line 196
    .line 197
    iget-object v1, p1, Lme/e;->b:Lud/h;

    .line 198
    .line 199
    if-ne v0, v1, :cond_3

    .line 200
    .line 201
    const/4 p1, 0x1

    .line 202
    goto :goto_3

    .line 203
    :cond_3
    instance-of v1, v0, Lud/n;

    .line 204
    .line 205
    if-eqz v1, :cond_4

    .line 206
    .line 207
    iget-object p1, p1, Lme/e;->a:Lud/n;

    .line 208
    .line 209
    invoke-static {v0, p1}, Lf8/i;->a0(Lud/j;Lud/n;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    goto :goto_3

    .line 214
    :cond_4
    const/4 p1, 0x0

    .line 215
    :goto_3
    return p1

    .line 216
    :pswitch_c
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lce/n;

    .line 219
    .line 220
    check-cast p1, Lm7/q;

    .line 221
    .line 222
    instance-of v1, p1, Lm7/j;

    .line 223
    .line 224
    if-eqz v1, :cond_5

    .line 225
    .line 226
    check-cast p1, Lm7/j;

    .line 227
    .line 228
    invoke-virtual {v0, p1}, Lce/n;->test(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_5

    .line 233
    .line 234
    const/4 p1, 0x1

    .line 235
    goto :goto_4

    .line 236
    :cond_5
    const/4 p1, 0x0

    .line 237
    :goto_4
    return p1

    .line 238
    :pswitch_d
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Lpd/s;

    .line 241
    .line 242
    check-cast p1, Lxd/c;

    .line 243
    .line 244
    iget-object v1, p1, Lxd/c;->b:Lud/j;

    .line 245
    .line 246
    invoke-static {v1}, Lf8/i;->n0(Lud/j;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-nez v1, :cond_7

    .line 251
    .line 252
    iget-object p1, p1, Lxd/c;->a:Ljava/util/List;

    .line 253
    .line 254
    sget-object v1, Lxd/d;->m:Luf/d;

    .line 255
    .line 256
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_6

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_6
    iget-boolean p1, v0, Lpd/s;->p:Z

    .line 264
    .line 265
    if-eqz p1, :cond_7

    .line 266
    .line 267
    :goto_5
    const/4 p1, 0x1

    .line 268
    goto :goto_6

    .line 269
    :cond_7
    const/4 p1, 0x0

    .line 270
    :goto_6
    return p1

    .line 271
    :pswitch_e
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lb5/c;

    .line 274
    .line 275
    check-cast p1, Lud/a;

    .line 276
    .line 277
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Lud/r;

    .line 280
    .line 281
    iget-object v1, v0, Lud/r;->B:Lud/a;

    .line 282
    .line 283
    invoke-virtual {p1, v1}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_9

    .line 288
    .line 289
    iget-object v0, v0, Lud/r;->C:Lud/a;

    .line 290
    .line 291
    invoke-virtual {p1, v0}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-eqz p1, :cond_8

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_8
    const/4 p1, 0x0

    .line 299
    goto :goto_8

    .line 300
    :cond_9
    :goto_7
    const/4 p1, 0x1

    .line 301
    :goto_8
    return p1

    .line 302
    :pswitch_f
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lfd/a;

    .line 305
    .line 306
    check-cast p1, Lnd/b0;

    .line 307
    .line 308
    sget-object v1, Lmd/a;->s:Lmd/a;

    .line 309
    .line 310
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 311
    .line 312
    invoke-virtual {p1, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_b

    .line 317
    .line 318
    iget-boolean p1, v0, Lfd/a;->d:Z

    .line 319
    .line 320
    if-eqz p1, :cond_a

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_a
    const/4 p1, 0x0

    .line 324
    goto :goto_a

    .line 325
    :cond_b
    :goto_9
    const/4 p1, 0x1

    .line 326
    :goto_a
    return p1

    .line 327
    :pswitch_10
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lca/c;

    .line 330
    .line 331
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    check-cast p1, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    return p1

    .line 342
    :pswitch_11
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lca/c;

    .line 345
    .line 346
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    check-cast p1, Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    return p1

    .line 357
    :pswitch_12
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Lca/c;

    .line 360
    .line 361
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    check-cast p1, Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    return p1

    .line 372
    :pswitch_13
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Lca/c;

    .line 375
    .line 376
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    check-cast p1, Ljava/lang/Boolean;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    return p1

    .line 387
    :pswitch_14
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lca/c;

    .line 390
    .line 391
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Ljava/lang/Boolean;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    return p1

    .line 402
    :pswitch_15
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lca/c;

    .line 405
    .line 406
    invoke-virtual {v0, p1}, Lca/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    check-cast p1, Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    return p1

    .line 417
    :pswitch_16
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lae/h;

    .line 420
    .line 421
    check-cast p1, Lud/a;

    .line 422
    .line 423
    sget-object v1, Lmd/b;->F:Lmd/b;

    .line 424
    .line 425
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 426
    .line 427
    invoke-virtual {p1, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    check-cast p1, Lae/b;

    .line 432
    .line 433
    if-eqz p1, :cond_c

    .line 434
    .line 435
    iget-object p1, p1, Lae/b;->g:Ljava/util/List;

    .line 436
    .line 437
    iget-object v0, v0, Lae/h;->h:Ljava/util/List;

    .line 438
    .line 439
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    if-eqz p1, :cond_c

    .line 444
    .line 445
    const/4 p1, 0x1

    .line 446
    goto :goto_b

    .line 447
    :cond_c
    const/4 p1, 0x0

    .line 448
    :goto_b
    return p1

    .line 449
    :pswitch_17
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Ljava/util/List;

    .line 452
    .line 453
    check-cast p1, Lud/a;

    .line 454
    .line 455
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    const/4 v2, 0x1

    .line 464
    if-eqz v1, :cond_e

    .line 465
    .line 466
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    check-cast v1, Lud/a;

    .line 471
    .line 472
    invoke-static {v1, p1}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-eqz v1, :cond_d

    .line 477
    .line 478
    move p1, v2

    .line 479
    goto :goto_c

    .line 480
    :cond_e
    const/4 p1, 0x0

    .line 481
    :goto_c
    xor-int/2addr p1, v2

    .line 482
    return p1

    .line 483
    :pswitch_18
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, Ljava/lang/Class;

    .line 486
    .line 487
    check-cast p1, Ljava/lang/reflect/Field;

    .line 488
    .line 489
    invoke-static {v0, p1}, Lbsh/Reflect;->i(Ljava/lang/Class;Ljava/lang/reflect/Field;)Z

    .line 490
    .line 491
    .line 492
    move-result p1

    .line 493
    return p1

    .line 494
    :pswitch_19
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, Ljava/lang/reflect/Method;

    .line 497
    .line 498
    check-cast p1, Ljava/lang/reflect/Method;

    .line 499
    .line 500
    invoke-static {v0, p1}, Lbsh/ClassGeneratorUtil;->c(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    return p1

    .line 505
    :pswitch_1a
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Lod/c;

    .line 508
    .line 509
    check-cast p1, Lud/p;

    .line 510
    .line 511
    check-cast p1, Lpd/j;

    .line 512
    .line 513
    iget-object p1, p1, Lpd/j;->o:Ljava/lang/Object;

    .line 514
    .line 515
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result p1

    .line 519
    return p1

    .line 520
    :pswitch_1b
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, Lqd/j;

    .line 523
    .line 524
    check-cast p1, Lud/g;

    .line 525
    .line 526
    iget-object p1, p1, Lud/g;->n:Lqd/j;

    .line 527
    .line 528
    invoke-virtual {p1}, Lqd/j;->h()Lqd/j;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result p1

    .line 536
    return p1

    .line 537
    :pswitch_1c
    iget-object v0, p0, Lbe/i;->h:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v0, Lbe/k;

    .line 540
    .line 541
    check-cast p1, Lqd/r;

    .line 542
    .line 543
    iget-object v0, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, Ljava/util/ArrayList;

    .line 546
    .line 547
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 548
    .line 549
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result p1

    .line 553
    xor-int/lit8 p1, p1, 0x1

    .line 554
    .line 555
    return p1

    .line 556
    nop

    .line 557
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
