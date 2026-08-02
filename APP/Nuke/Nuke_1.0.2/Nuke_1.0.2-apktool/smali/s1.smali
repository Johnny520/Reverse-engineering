.class public final synthetic Ls1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lgo0;Ldq;Lpr2;Lui1;)V
    .locals 0

    .line 1
    const/16 p4, 0x9

    .line 2
    .line 3
    iput p4, p0, Ls1;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ls1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Ls1;->k:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Ls1;->i:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p4, p0, Ls1;->h:I

    iput-object p1, p0, Ls1;->j:Ljava/lang/Object;

    iput-object p2, p0, Ls1;->k:Ljava/lang/Object;

    iput-object p3, p0, Ls1;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lxk1;Lxk1;I)V
    .locals 0

    .line 16
    iput p4, p0, Ls1;->h:I

    iput-object p1, p0, Ls1;->j:Ljava/lang/Object;

    iput-object p2, p0, Ls1;->i:Ljava/lang/Object;

    iput-object p3, p0, Ls1;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxk1;Lzq;Lxk1;)V
    .locals 1

    .line 15
    const/4 v0, 0x5

    iput v0, p0, Ls1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1;->i:Ljava/lang/Object;

    iput-object p2, p0, Ls1;->j:Ljava/lang/Object;

    iput-object p3, p0, Ls1;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ls1;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lbe0;->h:Lbe0;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, La83;->a:La83;

    .line 9
    .line 10
    iget-object v6, p0, Ls1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, p0, Ls1;->k:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Ls1;->j:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Lin0;

    .line 20
    .line 21
    check-cast v7, Ljava/util/Set;

    .line 22
    .line 23
    check-cast v6, Lxk1;

    .line 24
    .line 25
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Set;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Iterable;

    .line 32
    .line 33
    check-cast v7, Ljava/lang/Iterable;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    instance-of v1, v7, Ljava/util/Collection;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    check-cast v7, Ljava/util/Collection;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v7}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    :goto_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v7, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-interface {p0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    return-object v5

    .line 85
    :pswitch_0
    check-cast p0, Lao0;

    .line 86
    .line 87
    check-cast v7, Ltr2;

    .line 88
    .line 89
    check-cast v6, Ljv1;

    .line 90
    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {v7, p0}, Ltr2;->c(Lao0;)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    iget v0, v7, Ltr2;->t:I

    .line 98
    .line 99
    sub-int/2addr p0, v0

    .line 100
    invoke-virtual {v7, p0}, Ltr2;->a(I)V

    .line 101
    .line 102
    .line 103
    :cond_3
    iget p0, v7, Ltr2;->t:I

    .line 104
    .line 105
    invoke-static {v7, v4, p0, v4}, Lp7;->l(Ltr2;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lfx;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    iget-object v0, v0, Lfx;->b:Ljava/lang/Integer;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object v0, v4

    .line 121
    :goto_2
    invoke-interface {v6, v0}, Ljv1;->f(Ljava/lang/Integer;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v0, :cond_a

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_5
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Lfx;

    .line 139
    .line 140
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    sub-int/2addr v7, v3

    .line 145
    if-gtz v7, :cond_6

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_6
    if-ne v7, v3, :cond_7

    .line 149
    .line 150
    invoke-static {v1}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-static {v1}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    instance-of v7, v1, Ljava/util/RandomAccess;

    .line 165
    .line 166
    if-eqz v7, :cond_8

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    :goto_3
    if-ge v3, v7, :cond_9

    .line 173
    .line 174
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    add-int/lit8 v3, v3, 0x1

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_8
    invoke-interface {v1, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_9

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_9
    :goto_5
    iget v1, v5, Lfx;->a:I

    .line 203
    .line 204
    new-instance v3, Lfx;

    .line 205
    .line 206
    invoke-direct {v3, v1, v4, v0}, Lfx;-><init>(ILpp0;Ljava/lang/Integer;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v3}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0, v2}, Ldu;->x0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    :cond_a
    :goto_6
    new-instance v0, Lex;

    .line 218
    .line 219
    invoke-static {p0, v1}, Ldu;->x0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-interface {v6}, Ljv1;->i()Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-direct {v0, p0, v1}, Lex;-><init>(Ljava/util/List;Z)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_1
    check-cast p0, Lin0;

    .line 232
    .line 233
    check-cast v7, Ljava/lang/Integer;

    .line 234
    .line 235
    check-cast v6, Lxk1;

    .line 236
    .line 237
    new-instance v0, Lci1;

    .line 238
    .line 239
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_b

    .line 250
    .line 251
    const/4 v1, -0x1

    .line 252
    goto :goto_7

    .line 253
    :cond_b
    if-eqz v7, :cond_c

    .line 254
    .line 255
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    :goto_7
    invoke-direct {v0, v1}, Lci1;-><init>(I)V

    .line 260
    .line 261
    .line 262
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_c
    return-object v5

    .line 266
    :pswitch_2
    check-cast p0, Ln70;

    .line 267
    .line 268
    check-cast v7, Ld91;

    .line 269
    .line 270
    check-cast v6, Lo71;

    .line 271
    .line 272
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    check-cast p0, Ls81;

    .line 277
    .line 278
    new-instance v0, Le9;

    .line 279
    .line 280
    iget-object v1, v7, Ld91;->e:Los;

    .line 281
    .line 282
    iget-object v1, v1, Los;->e:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Ld81;

    .line 285
    .line 286
    invoke-virtual {v1}, Ld81;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, Lc11;

    .line 291
    .line 292
    invoke-direct {v0, v1, p0}, Le9;-><init>(Lc11;Ls81;)V

    .line 293
    .line 294
    .line 295
    new-instance v1, Lt81;

    .line 296
    .line 297
    invoke-direct {v1, v7, p0, v6, v0}, Lt81;-><init>(Ld91;Ls81;Lo71;Le9;)V

    .line 298
    .line 299
    .line 300
    return-object v1

    .line 301
    :pswitch_3
    check-cast p0, Lxt0;

    .line 302
    .line 303
    check-cast v6, Lxk1;

    .line 304
    .line 305
    check-cast v7, Lxk1;

    .line 306
    .line 307
    sget-object v0, Lpp1;->a:Lpp1;

    .line 308
    .line 309
    iget-object p0, p0, Lxt0;->a:Lvj;

    .line 310
    .line 311
    invoke-virtual {p0}, Lvj;->d()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    const-string v8, "hooker_debug_records"

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-static {}, Lpp1;->b()Lop1;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    :try_start_0
    new-instance v0, Lcg;

    .line 328
    .line 329
    sget-object v10, Lyt0;->Companion:Lyt0$b;

    .line 330
    .line 331
    invoke-virtual {v10}, Lyt0$b;->serializer()Lw41;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    invoke-direct {v0, v10}, Lcg;-><init>(Lw41;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v0}, Lse;->D(Lw41;)Lw41;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v9, v0, v4, v8}, Lop1;->b(Lw41;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    .line 348
    goto :goto_8

    .line 349
    :catchall_0
    move-exception v0

    .line 350
    new-instance v10, Lx92;

    .line 351
    .line 352
    invoke-direct {v10, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 353
    .line 354
    .line 355
    move-object v0, v10

    .line 356
    :goto_8
    nop

    .line 357
    instance-of v10, v0, Lx92;

    .line 358
    .line 359
    if-eqz v10, :cond_d

    .line 360
    .line 361
    move-object v0, v4

    .line 362
    :cond_d
    check-cast v0, Ljava/util/List;

    .line 363
    .line 364
    if-nez v0, :cond_e

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_e
    move-object v2, v0

    .line 368
    :goto_9
    new-instance v0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    :cond_f
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    if-eqz v10, :cond_10

    .line 382
    .line 383
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    move-object v11, v10

    .line 388
    check-cast v11, Lyt0;

    .line 389
    .line 390
    invoke-virtual {v11}, Lyt0;->l()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    invoke-static {v11, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-nez v11, :cond_f

    .line 399
    .line 400
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_10
    :try_start_1
    new-instance v1, Lcg;

    .line 405
    .line 406
    sget-object v2, Lyt0;->Companion:Lyt0$b;

    .line 407
    .line 408
    invoke-virtual {v2}, Lyt0$b;->serializer()Lw41;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-direct {v1, v2}, Lcg;-><init>(Lw41;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v9, v1, v0, v8}, Lop1;->d(Lw41;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 416
    .line 417
    .line 418
    :catchall_1
    iget-object p0, p0, Lvj;->b:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 421
    .line 422
    .line 423
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    check-cast p0, Ljava/lang/Number;

    .line 428
    .line 429
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    add-int/2addr p0, v3

    .line 434
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-interface {v6, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v7, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v5

    .line 445
    :pswitch_4
    check-cast p0, Lwm0;

    .line 446
    .line 447
    check-cast v6, Lxk1;

    .line 448
    .line 449
    check-cast v7, Lxk1;

    .line 450
    .line 451
    invoke-interface {v6, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-interface {v7, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    return-object v5

    .line 462
    :pswitch_5
    check-cast p0, Lyp2;

    .line 463
    .line 464
    check-cast v6, Lxk1;

    .line 465
    .line 466
    check-cast v7, Lxk1;

    .line 467
    .line 468
    invoke-interface {v6, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    iget p0, p0, Lyp2;->a:I

    .line 472
    .line 473
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    invoke-interface {v7, p0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v5

    .line 481
    :pswitch_6
    check-cast p0, Lnuke/ui/HomeActivity;

    .line 482
    .line 483
    check-cast v6, Lxk1;

    .line 484
    .line 485
    check-cast v7, Lxk1;

    .line 486
    .line 487
    invoke-static {p0, v6, v7}, Lnuke/ui/HomeActivity;->j(Lnuke/ui/HomeActivity;Lxk1;Lxk1;)La83;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    return-object p0

    .line 492
    :pswitch_7
    check-cast p0, Lgo0;

    .line 493
    .line 494
    check-cast v7, Ldq;

    .line 495
    .line 496
    check-cast v6, Lpr2;

    .line 497
    .line 498
    iget-object v2, p0, Lgo0;->M:Lqx;

    .line 499
    .line 500
    iget-object v3, v2, Lqx;->b:Ldq;

    .line 501
    .line 502
    :try_start_2
    iput-object v7, v2, Lqx;->b:Ldq;

    .line 503
    .line 504
    iget-object v5, p0, Lgo0;->G:Lpr2;

    .line 505
    .line 506
    iget-object v7, p0, Lgo0;->o:[I

    .line 507
    .line 508
    iget-object v8, p0, Lgo0;->v:Lzj1;

    .line 509
    .line 510
    iput-object v4, p0, Lgo0;->o:[I

    .line 511
    .line 512
    iput-object v4, p0, Lgo0;->v:Lzj1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 513
    .line 514
    :try_start_3
    iput-object v6, p0, Lgo0;->G:Lpr2;

    .line 515
    .line 516
    iget-boolean v6, v2, Lqx;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 517
    .line 518
    :try_start_4
    iput-boolean v1, v2, Lqx;->e:Z

    .line 519
    .line 520
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 521
    :catchall_2
    move-exception v0

    .line 522
    :try_start_5
    iput-boolean v6, v2, Lqx;->e:Z

    .line 523
    .line 524
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 525
    :catchall_3
    move-exception v0

    .line 526
    :try_start_6
    iput-object v5, p0, Lgo0;->G:Lpr2;

    .line 527
    .line 528
    iput-object v7, p0, Lgo0;->o:[I

    .line 529
    .line 530
    iput-object v8, p0, Lgo0;->v:Lzj1;

    .line 531
    .line 532
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 533
    :catchall_4
    move-exception v0

    .line 534
    move-object p0, v0

    .line 535
    iput-object v3, v2, Lqx;->b:Ldq;

    .line 536
    .line 537
    throw p0

    .line 538
    :pswitch_8
    check-cast p0, Ljava/util/List;

    .line 539
    .line 540
    check-cast v7, Ljava/util/ArrayList;

    .line 541
    .line 542
    check-cast v6, Ljava/util/ArrayList;

    .line 543
    .line 544
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_14

    .line 553
    .line 554
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, Landroid/widget/TextView;

    .line 559
    .line 560
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 565
    .line 566
    if-eqz v2, :cond_11

    .line 567
    .line 568
    check-cast v1, Landroid/view/ViewGroup;

    .line 569
    .line 570
    goto :goto_c

    .line 571
    :cond_11
    move-object v1, v4

    .line 572
    :goto_c
    if-nez v1, :cond_12

    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_12
    const v2, 0x79080036

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    if-ne v3, v0, :cond_13

    .line 583
    .line 584
    invoke-virtual {v1, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    :cond_13
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 588
    .line 589
    .line 590
    goto :goto_b

    .line 591
    :cond_14
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_15

    .line 600
    .line 601
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    check-cast v0, Low1;

    .line 606
    .line 607
    iget-object v1, v0, Low1;->h:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, Landroid/view/ViewGroup;

    .line 610
    .line 611
    iget-object v0, v0, Low1;->i:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v0, Lv90;

    .line 614
    .line 615
    iget v2, v0, Lv90;->a:I

    .line 616
    .line 617
    iget v3, v0, Lv90;->b:I

    .line 618
    .line 619
    iget v4, v0, Lv90;->c:I

    .line 620
    .line 621
    iget v0, v0, Lv90;->d:I

    .line 622
    .line 623
    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 624
    .line 625
    .line 626
    goto :goto_d

    .line 627
    :cond_15
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-eqz v0, :cond_16

    .line 636
    .line 637
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    check-cast v0, Low1;

    .line 642
    .line 643
    iget-object v1, v0, Low1;->h:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v1, Landroid/view/ViewGroup;

    .line 646
    .line 647
    iget-object v0, v0, Low1;->i:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v0, Lu90;

    .line 650
    .line 651
    iget-boolean v2, v0, Lu90;->a:Z

    .line 652
    .line 653
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 654
    .line 655
    .line 656
    iget-boolean v0, v0, Lu90;->b:Z

    .line 657
    .line 658
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 659
    .line 660
    .line 661
    goto :goto_e

    .line 662
    :cond_16
    return-object v5

    .line 663
    :pswitch_9
    check-cast p0, Lg00;

    .line 664
    .line 665
    move-object v0, v7

    .line 666
    check-cast v0, Lp83;

    .line 667
    .line 668
    move-object v2, v6

    .line 669
    check-cast v2, Lvm;

    .line 670
    .line 671
    iget-object v13, p0, Lg00;->z:Llm;

    .line 672
    .line 673
    :goto_f
    iget-object v6, v13, Llm;->a:Lzk1;

    .line 674
    .line 675
    iget v7, v6, Lzk1;->j:I

    .line 676
    .line 677
    if-eqz v7, :cond_19

    .line 678
    .line 679
    if-eqz v7, :cond_18

    .line 680
    .line 681
    add-int/lit8 v7, v7, -0x1

    .line 682
    .line 683
    iget-object v6, v6, Lzk1;->h:[Ljava/lang/Object;

    .line 684
    .line 685
    aget-object v6, v6, v7

    .line 686
    .line 687
    check-cast v6, Ld00;

    .line 688
    .line 689
    iget-object v6, v6, Ld00;->a:Lqm;

    .line 690
    .line 691
    invoke-virtual {v6}, Lqm;->a()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    move-object v7, v6

    .line 696
    check-cast v7, Lo62;

    .line 697
    .line 698
    if-nez v7, :cond_17

    .line 699
    .line 700
    move-object v6, p0

    .line 701
    move p0, v3

    .line 702
    goto :goto_10

    .line 703
    :cond_17
    const-wide/16 v10, 0x0

    .line 704
    .line 705
    const/4 v12, 0x3

    .line 706
    const-wide/16 v8, 0x0

    .line 707
    .line 708
    move-object v6, p0

    .line 709
    invoke-static/range {v6 .. v12}, Lg00;->O0(Lg00;Lo62;JJI)Z

    .line 710
    .line 711
    .line 712
    move-result p0

    .line 713
    :goto_10
    if-eqz p0, :cond_1a

    .line 714
    .line 715
    iget-object p0, v13, Llm;->a:Lzk1;

    .line 716
    .line 717
    iget v7, p0, Lzk1;->j:I

    .line 718
    .line 719
    sub-int/2addr v7, v3

    .line 720
    invoke-virtual {p0, v7}, Lzk1;->k(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object p0

    .line 724
    check-cast p0, Ld00;

    .line 725
    .line 726
    iget-object p0, p0, Ld00;->b:Lmp;

    .line 727
    .line 728
    invoke-virtual {p0, v5}, Lmp;->h(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    move-object p0, v6

    .line 732
    goto :goto_f

    .line 733
    :cond_18
    const-string p0, "MutableVector is empty."

    .line 734
    .line 735
    invoke-static {p0}, Lum2;->i(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    goto :goto_12

    .line 739
    :cond_19
    move-object v6, p0

    .line 740
    :cond_1a
    iget-boolean p0, v6, Lg00;->A:Z

    .line 741
    .line 742
    if-eqz p0, :cond_1c

    .line 743
    .line 744
    iget-object p0, v6, Lg00;->y:Lwl2;

    .line 745
    .line 746
    invoke-virtual {p0}, Lwl2;->a()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object p0

    .line 750
    move-object v7, p0

    .line 751
    check-cast v7, Lo62;

    .line 752
    .line 753
    if-eqz v7, :cond_1b

    .line 754
    .line 755
    const-wide/16 v10, 0x0

    .line 756
    .line 757
    const/4 v12, 0x3

    .line 758
    const-wide/16 v8, 0x0

    .line 759
    .line 760
    invoke-static/range {v6 .. v12}, Lg00;->O0(Lg00;Lo62;JJI)Z

    .line 761
    .line 762
    .line 763
    move-result p0

    .line 764
    if-ne p0, v3, :cond_1b

    .line 765
    .line 766
    goto :goto_11

    .line 767
    :cond_1b
    move v3, v1

    .line 768
    :goto_11
    if-eqz v3, :cond_1c

    .line 769
    .line 770
    iput-boolean v1, v6, Lg00;->A:Z

    .line 771
    .line 772
    :cond_1c
    const-wide/16 v3, 0x0

    .line 773
    .line 774
    invoke-static {v6, v2, v3, v4}, Lg00;->M0(Lg00;Lvm;J)F

    .line 775
    .line 776
    .line 777
    move-result p0

    .line 778
    iput p0, v0, Lp83;->e:F

    .line 779
    .line 780
    move-object v4, v5

    .line 781
    :goto_12
    return-object v4

    .line 782
    :pswitch_a
    check-cast p0, Lcq;

    .line 783
    .line 784
    check-cast v7, Lyr0;

    .line 785
    .line 786
    check-cast v6, Lq5;

    .line 787
    .line 788
    iget-object p0, p0, Lcq;->b:Lup0;

    .line 789
    .line 790
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v7}, Lyr0;->a()Ljava/util/List;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    iget-object v1, v6, Lq5;->i:Lyw0;

    .line 798
    .line 799
    iget-object v1, v1, Lyw0;->d:Ljava/lang/String;

    .line 800
    .line 801
    invoke-virtual {p0, v1, v0}, Lup0;->o(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object p0

    .line 805
    return-object p0

    .line 806
    :pswitch_b
    check-cast v6, Lxk1;

    .line 807
    .line 808
    check-cast p0, Lzq;

    .line 809
    .line 810
    check-cast v7, Lxk1;

    .line 811
    .line 812
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    check-cast v0, Ljava/util/List;

    .line 817
    .line 818
    new-instance v1, Ljava/util/ArrayList;

    .line 819
    .line 820
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 821
    .line 822
    .line 823
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    :cond_1d
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    if-eqz v2, :cond_1e

    .line 832
    .line 833
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    move-object v3, v2

    .line 838
    check-cast v3, Lzq;

    .line 839
    .line 840
    iget-object v3, v3, Lzq;->a:Ljava/lang/String;

    .line 841
    .line 842
    iget-object v8, p0, Lzq;->a:Ljava/lang/String;

    .line 843
    .line 844
    invoke-static {v3, v8}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v3

    .line 848
    if-nez v3, :cond_1d

    .line 849
    .line 850
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    goto :goto_13

    .line 854
    :cond_1e
    invoke-interface {v6, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    invoke-interface {v7, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    return-object v5

    .line 861
    :pswitch_c
    check-cast p0, Lsm;

    .line 862
    .line 863
    check-cast v7, Lzn1;

    .line 864
    .line 865
    check-cast v6, Lt6;

    .line 866
    .line 867
    invoke-static {p0, v7, v6}, Lsm;->M0(Lsm;Lzn1;Lt6;)Lo62;

    .line 868
    .line 869
    .line 870
    move-result-object v9

    .line 871
    if-eqz v9, :cond_20

    .line 872
    .line 873
    iget-object v8, p0, Lsm;->v:Lg00;

    .line 874
    .line 875
    iget-wide v0, v8, Lg00;->B:J

    .line 876
    .line 877
    const-wide/16 v2, -0x1

    .line 878
    .line 879
    invoke-static {v0, v1, v2, v3}, Lh11;->a(JJ)Z

    .line 880
    .line 881
    .line 882
    move-result p0

    .line 883
    if-eqz p0, :cond_1f

    .line 884
    .line 885
    const-string p0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 886
    .line 887
    invoke-static {p0}, Lnz0;->c(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    :cond_1f
    invoke-virtual {v8}, Lg00;->N0()J

    .line 891
    .line 892
    .line 893
    move-result-wide v10

    .line 894
    const-wide/16 v12, 0x0

    .line 895
    .line 896
    invoke-virtual/range {v8 .. v13}, Lg00;->Q0(Lo62;JJ)J

    .line 897
    .line 898
    .line 899
    move-result-wide v0

    .line 900
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    xor-long/2addr v0, v2

    .line 906
    invoke-virtual {v9, v0, v1}, Lo62;->i(J)Lo62;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    :cond_20
    return-object v4

    .line 911
    :pswitch_d
    check-cast p0, Lbj;

    .line 912
    .line 913
    check-cast v7, Lcj;

    .line 914
    .line 915
    check-cast v6, La72;

    .line 916
    .line 917
    invoke-virtual {p0}, Lbj;->a()V

    .line 918
    .line 919
    .line 920
    iget-object p0, v7, Lcj;->c:Ljava/lang/Object;

    .line 921
    .line 922
    move-object v0, p0

    .line 923
    check-cast v0, Lxg;

    .line 924
    .line 925
    iget v1, v6, La72;->h:I

    .line 926
    .line 927
    :cond_21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 928
    .line 929
    .line 930
    move-result p0

    .line 931
    ushr-int/lit8 v2, p0, 0x1b

    .line 932
    .line 933
    and-int/lit8 v2, v2, 0xf

    .line 934
    .line 935
    if-ne v2, v1, :cond_22

    .line 936
    .line 937
    add-int/lit8 v2, p0, -0x1

    .line 938
    .line 939
    goto :goto_14

    .line 940
    :cond_22
    move v2, p0

    .line 941
    :goto_14
    invoke-virtual {v0, p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 942
    .line 943
    .line 944
    move-result p0

    .line 945
    if-eqz p0, :cond_21

    .line 946
    .line 947
    return-object v5

    .line 948
    :pswitch_e
    const-string v0, "WeChat rejected open request: sendId="

    .line 949
    .line 950
    check-cast p0, Ljava/lang/String;

    .line 951
    .line 952
    check-cast v7, Lgh;

    .line 953
    .line 954
    check-cast v6, Ljava/lang/String;

    .line 955
    .line 956
    sget-object v1, Lhh;->h:Ljava/lang/String;

    .line 957
    .line 958
    sget-object v2, Lhh;->d:Lhh;

    .line 959
    .line 960
    sget-object v3, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 961
    .line 962
    :try_start_7
    invoke-virtual {v3, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v4

    .line 966
    if-eq v4, v7, :cond_23

    .line 967
    .line 968
    goto :goto_15

    .line 969
    :cond_23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    invoke-static {v7, v6}, Lhh;->q(Lgh;Ljava/lang/String;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v4

    .line 976
    sget-object v6, Lbn1;->d:Lbn1;

    .line 977
    .line 978
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    sget-object v6, Lbn1;->h:Lhx2;

    .line 982
    .line 983
    invoke-virtual {v6}, Lhx2;->getValue()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v6

    .line 987
    check-cast v6, Ljava/lang/reflect/Method;

    .line 988
    .line 989
    sget-object v8, Lbn1;->g:Lhx2;

    .line 990
    .line 991
    invoke-virtual {v8}, Lhx2;->getValue()Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v8

    .line 995
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v4

    .line 999
    invoke-virtual {v6, v8, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v4

    .line 1003
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    check-cast v4, Ljava/lang/Boolean;

    .line 1007
    .line 1008
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v4

    .line 1012
    if-nez v4, :cond_24

    .line 1013
    .line 1014
    invoke-virtual {v3, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    invoke-static {v1, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1022
    .line 1023
    .line 1024
    goto :goto_15

    .line 1025
    :catchall_5
    move-exception v0

    .line 1026
    invoke-virtual {v3, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object p0

    .line 1036
    const-string v0, "Send open request failed: "

    .line 1037
    .line 1038
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object p0

    .line 1042
    invoke-static {v1, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    :cond_24
    :goto_15
    return-object v5

    .line 1046
    :pswitch_f
    check-cast p0, Lin0;

    .line 1047
    .line 1048
    check-cast v6, Lxk1;

    .line 1049
    .line 1050
    check-cast v7, Lxk1;

    .line 1051
    .line 1052
    new-instance v0, Lde;

    .line 1053
    .line 1054
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    check-cast v1, Ljava/lang/String;

    .line 1059
    .line 1060
    invoke-interface {v7}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    check-cast v2, Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-direct {v0, v1, v2}, Lde;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    return-object v5

    .line 1073
    :pswitch_10
    check-cast p0, Landroid/content/Context;

    .line 1074
    .line 1075
    check-cast v7, Lrh0;

    .line 1076
    .line 1077
    check-cast v6, Lxk1;

    .line 1078
    .line 1079
    invoke-interface {v6, v4}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 1080
    .line 1081
    .line 1082
    iget-object v0, v7, Lrh0;->a:Ljava/lang/String;

    .line 1083
    .line 1084
    invoke-static {p0, v0}, Lsp0;->R(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1085
    .line 1086
    .line 1087
    return-object v5

    .line 1088
    nop

    .line 1089
    :pswitch_data_0
    .packed-switch 0x0
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
