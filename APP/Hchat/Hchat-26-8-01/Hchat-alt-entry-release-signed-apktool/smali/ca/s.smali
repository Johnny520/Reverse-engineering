.class public final synthetic Lca/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lca/s;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/s;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lca/s;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lca/s;->h:Ljava/lang/String;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ly9/d;

    .line 14
    .line 15
    iget-object p1, p1, Ly9/d;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_0
    check-cast p1, Log/f;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast p1, Log/i;

    .line 32
    .line 33
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Log/g;

    .line 38
    .line 39
    invoke-virtual {p1, v4}, Log/g;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "notify@all"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const-string p1, "\u6240\u6709\u4eba"

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v5, p1}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v2

    .line 76
    :goto_0
    const-string v3, ""

    .line 77
    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    move-object v1, v3

    .line 81
    :cond_2
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    :cond_3
    if-nez v2, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move-object v3, v2

    .line 97
    :goto_1
    move-object v1, v3

    .line 98
    :cond_5
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    move-object p1, v1

    .line 106
    :goto_2
    const-string v0, "@"

    .line 107
    .line 108
    const-string v1, "\u2005"

    .line 109
    .line 110
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :pswitch_1
    move-object v2, p1

    .line 116
    check-cast v2, Landroid/webkit/WebView;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-string v6, "UTF-8"

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    iget-object v4, p0, Lca/s;->h:Ljava/lang/String;

    .line 126
    .line 127
    const-string v5, "image/svg+xml"

    .line 128
    .line 129
    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :pswitch_2
    check-cast p1, Lvb/a;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Lvb/a;->a()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const-string v0, "ID: "

    .line 157
    .line 158
    invoke-static {p1, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    invoke-static {p1, v5, v3}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_7

    .line 169
    .line 170
    move v3, v4

    .line 171
    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    return-object p1

    .line 190
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {p1, v5}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_8

    .line 209
    .line 210
    invoke-static {p1, v5}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    :cond_8
    return-object v0

    .line 215
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance p1, Lr8/d;

    .line 221
    .line 222
    invoke-direct {p1, v5}, Lr8/d;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object p1

    .line 226
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {p1, v5, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1

    .line 240
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-eqz v0, :cond_9

    .line 250
    .line 251
    iget-object v0, v0, Lj8/p;->f:Lj8/h;

    .line 252
    .line 253
    if-eqz v0, :cond_9

    .line 254
    .line 255
    invoke-virtual {v0, v5, p1}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-ne p1, v4, :cond_9

    .line 260
    .line 261
    move v3, v4

    .line 262
    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    return-object p1

    .line 267
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-eqz v0, :cond_a

    .line 277
    .line 278
    new-instance v1, Ljava/io/File;

    .line 279
    .line 280
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    iget-object v0, v0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 288
    .line 289
    invoke-virtual {v0, v5, p1, v1}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-ne p1, v4, :cond_a

    .line 294
    .line 295
    move v3, v4

    .line 296
    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    return-object p1

    .line 301
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-eqz v0, :cond_b

    .line 311
    .line 312
    iget-object v0, v0, Lj8/p;->c:Lbb/b;

    .line 313
    .line 314
    if-eqz v0, :cond_b

    .line 315
    .line 316
    invoke-virtual {v0, v5, p1}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-ne p1, v4, :cond_b

    .line 321
    .line 322
    move v3, v4

    .line 323
    :cond_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    return-object p1

    .line 328
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-eqz v0, :cond_c

    .line 338
    .line 339
    iget-object v0, v0, Lj8/p;->d:Lj8/f;

    .line 340
    .line 341
    invoke-virtual {v0, v5, p1}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-ne p1, v4, :cond_c

    .line 346
    .line 347
    move v3, v4

    .line 348
    :cond_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    return-object p1

    .line 353
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-eqz v0, :cond_d

    .line 363
    .line 364
    invoke-virtual {v0, v5, p1}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    if-ne p1, v4, :cond_d

    .line 369
    .line 370
    move v3, v4

    .line 371
    :cond_d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    return-object p1

    .line 376
    :pswitch_d
    check-cast p1, Lf2/y;

    .line 377
    .line 378
    sget-object v0, Lf2/w;->a:[Lmg/d;

    .line 379
    .line 380
    sget-object v0, Lf2/u;->a:Lf2/x;

    .line 381
    .line 382
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-interface {p1, v0, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    const/4 v0, 0x5

    .line 390
    invoke-static {p1, v0}, Lf2/w;->c(Lf2/y;I)V

    .line 391
    .line 392
    .line 393
    return-object v1

    .line 394
    :pswitch_e
    check-cast p1, Lt7/b;

    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p1}, Lt7/b;->c()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-static {p1, v5}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    return-object p1

    .line 412
    :pswitch_f
    check-cast p1, Lt7/b;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-nez v0, :cond_e

    .line 422
    .line 423
    invoke-virtual {p1}, Lt7/b;->c()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    invoke-static {p1, v5}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 428
    .line 429
    .line 430
    move-result p1

    .line 431
    if-eqz p1, :cond_f

    .line 432
    .line 433
    :cond_e
    move v3, v4

    .line 434
    :cond_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    return-object p1

    .line 439
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-static {v5, p1}, Lfb/u;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    if-eqz p1, :cond_10

    .line 449
    .line 450
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    :cond_10
    return-object v2

    .line 459
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {v5, p1}, Lfb/u;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    return-object p1

    .line 469
    :pswitch_12
    check-cast p1, Log/f;

    .line 470
    .line 471
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance p1, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    const-string v0, "<title>"

    .line 477
    .line 478
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v0, "</title>"

    .line 485
    .line 486
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    return-object p1

    .line 494
    :pswitch_13
    check-cast p1, Log/f;

    .line 495
    .line 496
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance p1, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    const-string v0, "&lt;title&gt;"

    .line 502
    .line 503
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v0, "&lt;/title&gt;"

    .line 510
    .line 511
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    return-object p1

    .line 519
    :pswitch_14
    check-cast p1, Leb/j0;

    .line 520
    .line 521
    iget-object p1, p1, Leb/j0;->a:Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result p1

    .line 527
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    return-object p1

    .line 532
    :pswitch_15
    check-cast p1, Lsf/e;

    .line 533
    .line 534
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    iget-object p1, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast p1, Ljava/lang/String;

    .line 540
    .line 541
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-lez v0, :cond_11

    .line 546
    .line 547
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-nez v0, :cond_11

    .line 552
    .line 553
    const-string v0, "@chatroom"

    .line 554
    .line 555
    invoke-static {p1, v0, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 556
    .line 557
    .line 558
    move-result p1

    .line 559
    if-nez p1, :cond_11

    .line 560
    .line 561
    move v3, v4

    .line 562
    :cond_11
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    return-object p1

    .line 567
    :pswitch_16
    check-cast p1, Lwb/jv;

    .line 568
    .line 569
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-object p1, p1, Lwb/jv;->f:Ljava/util/List;

    .line 573
    .line 574
    invoke-interface {p1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result p1

    .line 578
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    return-object p1

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
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
