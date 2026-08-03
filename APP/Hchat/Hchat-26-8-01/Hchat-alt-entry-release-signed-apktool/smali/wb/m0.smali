.class public final synthetic Lwb/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/m0;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 7
    iput p2, p0, Lwb/m0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/m0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Set;

    .line 7
    .line 8
    check-cast p2, Lu6/a;

    .line 9
    .line 10
    check-cast p1, Ljava/util/Collection;

    .line 11
    .line 12
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p2, [Ljava/lang/reflect/Type;

    .line 22
    .line 23
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eq v0, v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ljava/lang/reflect/Type;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    throw p1

    .line 72
    :pswitch_0
    if-nez p1, :cond_2

    .line 73
    .line 74
    check-cast p2, Lu6/d;

    .line 75
    .line 76
    iget-object p1, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    throw p1

    .line 87
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 94
    .line 95
    check-cast p2, Lu6/a;

    .line 96
    .line 97
    check-cast p1, Ljava/util/Collection;

    .line 98
    .line 99
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast p2, [Ljava/lang/reflect/TypeVariable;

    .line 109
    .line 110
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    const/4 v2, 0x1

    .line 123
    const/4 v3, 0x0

    .line 124
    if-eq v0, v1, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_4

    .line 138
    .line 139
    move v3, v2

    .line 140
    :goto_1
    xor-int/lit8 p1, v3, 0x1

    .line 141
    .line 142
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/lang/reflect/Type;

    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    throw p1

    .line 162
    :pswitch_2
    check-cast p1, Ljava/util/Set;

    .line 163
    .line 164
    check-cast p2, Lu6/a;

    .line 165
    .line 166
    check-cast p1, Ljava/util/Collection;

    .line 167
    .line 168
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    check-cast p2, [Ljava/lang/reflect/TypeVariable;

    .line 178
    .line 179
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const/4 v2, 0x0

    .line 192
    if-eq v0, v1, :cond_5

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    .line 196
    .line 197
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_6

    .line 206
    .line 207
    const/4 v2, 0x1

    .line 208
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1

    .line 213
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, Ljava/lang/reflect/Type;

    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    throw p1

    .line 228
    :pswitch_3
    check-cast p1, Lfg/l;

    .line 229
    .line 230
    check-cast p2, Lu6/a;

    .line 231
    .line 232
    :try_start_0
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 233
    .line 234
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :catchall_0
    move-exception v0

    .line 253
    move-object p1, v0

    .line 254
    new-instance p2, Lsf/f;

    .line 255
    .line 256
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    move-object p1, p2

    .line 260
    :goto_3
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 261
    .line 262
    instance-of v0, p1, Lsf/f;

    .line 263
    .line 264
    if-eqz v0, :cond_7

    .line 265
    .line 266
    move-object p1, p2

    .line 267
    :cond_7
    check-cast p1, Ljava/lang/Boolean;

    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    check-cast p2, Lu6/a;

    .line 277
    .line 278
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 279
    .line 280
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    if-ne p2, p1, :cond_8

    .line 285
    .line 286
    const/4 p1, 0x1

    .line 287
    goto :goto_4

    .line 288
    :cond_8
    const/4 p1, 0x0

    .line 289
    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    return-object p1

    .line 294
    :pswitch_5
    check-cast p1, Lfg/l;

    .line 295
    .line 296
    check-cast p2, Lu6/a;

    .line 297
    .line 298
    :try_start_1
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 299
    .line 300
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    check-cast p1, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :catchall_1
    move-exception v0

    .line 322
    move-object p1, v0

    .line 323
    new-instance p2, Lsf/f;

    .line 324
    .line 325
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    move-object p1, p2

    .line 329
    :goto_5
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 330
    .line 331
    instance-of v0, p1, Lsf/f;

    .line 332
    .line 333
    if-eqz v0, :cond_9

    .line 334
    .line 335
    move-object p1, p2

    .line 336
    :cond_9
    check-cast p1, Ljava/lang/Boolean;

    .line 337
    .line 338
    return-object p1

    .line 339
    :pswitch_6
    check-cast p1, Lfg/l;

    .line 340
    .line 341
    check-cast p2, Lu6/d;

    .line 342
    .line 343
    :try_start_2
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 344
    .line 345
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    check-cast p1, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :catchall_2
    move-exception v0

    .line 363
    move-object p1, v0

    .line 364
    new-instance p2, Lsf/f;

    .line 365
    .line 366
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    move-object p1, p2

    .line 370
    :goto_6
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 371
    .line 372
    instance-of v0, p1, Lsf/f;

    .line 373
    .line 374
    if-eqz v0, :cond_a

    .line 375
    .line 376
    move-object p1, p2

    .line 377
    :cond_a
    check-cast p1, Ljava/lang/Boolean;

    .line 378
    .line 379
    return-object p1

    .line 380
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    check-cast p2, Lu6/a;

    .line 387
    .line 388
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 389
    .line 390
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    if-eq p2, p1, :cond_b

    .line 395
    .line 396
    const/4 p1, 0x1

    .line 397
    goto :goto_7

    .line 398
    :cond_b
    const/4 p1, 0x0

    .line 399
    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    return-object p1

    .line 404
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    check-cast p2, Lu6/a;

    .line 411
    .line 412
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 413
    .line 414
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 415
    .line 416
    .line 417
    move-result p2

    .line 418
    if-ne p2, p1, :cond_c

    .line 419
    .line 420
    const/4 p1, 0x1

    .line 421
    goto :goto_8

    .line 422
    :cond_c
    const/4 p1, 0x0

    .line 423
    :goto_8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    return-object p1

    .line 428
    :pswitch_9
    check-cast p1, Ljava/util/Set;

    .line 429
    .line 430
    check-cast p2, Lu6/a;

    .line 431
    .line 432
    check-cast p1, Ljava/util/Collection;

    .line 433
    .line 434
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 435
    .line 436
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 437
    .line 438
    .line 439
    move-result-object p2

    .line 440
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    check-cast p2, [Ljava/lang/reflect/Type;

    .line 444
    .line 445
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object p2

    .line 449
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    const/4 v2, 0x1

    .line 458
    const/4 v3, 0x0

    .line 459
    if-eq v0, v1, :cond_d

    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_d
    check-cast p1, Ljava/lang/Iterable;

    .line 463
    .line 464
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-nez v0, :cond_e

    .line 473
    .line 474
    move v3, v2

    .line 475
    :goto_9
    xor-int/lit8 p1, v3, 0x1

    .line 476
    .line 477
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    return-object p1

    .line 482
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    check-cast p1, Ljava/lang/reflect/Type;

    .line 494
    .line 495
    const/4 p1, 0x0

    .line 496
    throw p1

    .line 497
    :pswitch_a
    check-cast p1, Ljava/util/Set;

    .line 498
    .line 499
    check-cast p2, Lu6/a;

    .line 500
    .line 501
    check-cast p1, Ljava/util/Collection;

    .line 502
    .line 503
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 504
    .line 505
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 506
    .line 507
    .line 508
    move-result-object p2

    .line 509
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    check-cast p2, [Ljava/lang/reflect/Type;

    .line 513
    .line 514
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object p2

    .line 518
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    const/4 v2, 0x0

    .line 527
    if-eq v0, v1, :cond_f

    .line 528
    .line 529
    goto :goto_a

    .line 530
    :cond_f
    check-cast p1, Ljava/lang/Iterable;

    .line 531
    .line 532
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object p1

    .line 536
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-nez v0, :cond_10

    .line 541
    .line 542
    const/4 v2, 0x1

    .line 543
    :goto_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    return-object p1

    .line 548
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    check-cast p1, Ljava/lang/reflect/Type;

    .line 560
    .line 561
    const/4 p1, 0x0

    .line 562
    throw p1

    .line 563
    :pswitch_b
    check-cast p1, Ljava/util/Set;

    .line 564
    .line 565
    check-cast p2, Lu6/a;

    .line 566
    .line 567
    check-cast p1, Ljava/util/Collection;

    .line 568
    .line 569
    iget-object p2, p2, Lu6/a;->c:Ljava/lang/reflect/Executable;

    .line 570
    .line 571
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 572
    .line 573
    .line 574
    move-result-object p2

    .line 575
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    check-cast p2, [Ljava/lang/reflect/Type;

    .line 579
    .line 580
    invoke-static {p2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object p2

    .line 584
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    const/4 v2, 0x1

    .line 593
    const/4 v3, 0x0

    .line 594
    if-eq v0, v1, :cond_11

    .line 595
    .line 596
    goto :goto_b

    .line 597
    :cond_11
    check-cast p1, Ljava/lang/Iterable;

    .line 598
    .line 599
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-nez v0, :cond_12

    .line 608
    .line 609
    move v3, v2

    .line 610
    :goto_b
    xor-int/lit8 p1, v3, 0x1

    .line 611
    .line 612
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    return-object p1

    .line 617
    :cond_12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-static {p1}, Lwb/en;->n(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    check-cast p1, Ljava/lang/reflect/Type;

    .line 629
    .line 630
    const/4 p1, 0x0

    .line 631
    throw p1

    .line 632
    :pswitch_c
    check-cast p1, Lfg/l;

    .line 633
    .line 634
    check-cast p2, Lu6/b;

    .line 635
    .line 636
    iget-object p2, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 637
    .line 638
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 639
    .line 640
    .line 641
    move-result-object p2

    .line 642
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object p1

    .line 649
    check-cast p1, Ljava/lang/Boolean;

    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    return-object p1

    .line 655
    :pswitch_d
    if-nez p1, :cond_13

    .line 656
    .line 657
    check-cast p2, Lu6/b;

    .line 658
    .line 659
    iget-object p1, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 660
    .line 661
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    const/4 p1, 0x0

    .line 669
    throw p1

    .line 670
    :cond_13
    new-instance p1, Ljava/lang/ClassCastException;

    .line 671
    .line 672
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 673
    .line 674
    .line 675
    throw p1

    .line 676
    :pswitch_e
    check-cast p1, Lfg/l;

    .line 677
    .line 678
    check-cast p2, Lu6/b;

    .line 679
    .line 680
    iget-object p2, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 681
    .line 682
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    move-result-object p2

    .line 686
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object p1

    .line 693
    check-cast p1, Ljava/lang/Boolean;

    .line 694
    .line 695
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    return-object p1

    .line 699
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 700
    .line 701
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 702
    .line 703
    .line 704
    move-result p1

    .line 705
    check-cast p2, Lu6/b;

    .line 706
    .line 707
    iget-object p2, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 708
    .line 709
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 710
    .line 711
    .line 712
    move-result p2

    .line 713
    if-eq p2, p1, :cond_14

    .line 714
    .line 715
    const/4 p1, 0x1

    .line 716
    goto :goto_c

    .line 717
    :cond_14
    const/4 p1, 0x0

    .line 718
    :goto_c
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 719
    .line 720
    .line 721
    move-result-object p1

    .line 722
    return-object p1

    .line 723
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 724
    .line 725
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 726
    .line 727
    .line 728
    move-result p1

    .line 729
    check-cast p2, Lu6/b;

    .line 730
    .line 731
    iget-object p2, p2, Lu6/b;->c:Ljava/lang/reflect/Field;

    .line 732
    .line 733
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 734
    .line 735
    .line 736
    move-result p2

    .line 737
    if-ne p2, p1, :cond_15

    .line 738
    .line 739
    const/4 p1, 0x1

    .line 740
    goto :goto_d

    .line 741
    :cond_15
    const/4 p1, 0x0

    .line 742
    :goto_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 743
    .line 744
    .line 745
    move-result-object p1

    .line 746
    return-object p1

    .line 747
    :pswitch_11
    check-cast p1, Lfg/l;

    .line 748
    .line 749
    check-cast p2, Lu6/d;

    .line 750
    .line 751
    :try_start_3
    iget-object p2, p2, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 752
    .line 753
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object p2

    .line 757
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p1

    .line 761
    check-cast p1, Ljava/lang/Boolean;

    .line 762
    .line 763
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 764
    .line 765
    .line 766
    goto :goto_e

    .line 767
    :catchall_3
    move-exception v0

    .line 768
    move-object p1, v0

    .line 769
    new-instance p2, Lsf/f;

    .line 770
    .line 771
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 772
    .line 773
    .line 774
    move-object p1, p2

    .line 775
    :goto_e
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 776
    .line 777
    instance-of v0, p1, Lsf/f;

    .line 778
    .line 779
    if-eqz v0, :cond_16

    .line 780
    .line 781
    move-object p1, p2

    .line 782
    :cond_16
    check-cast p1, Ljava/lang/Boolean;

    .line 783
    .line 784
    return-object p1

    .line 785
    :pswitch_12
    check-cast p1, Lwf/g;

    .line 786
    .line 787
    check-cast p2, Lwf/e;

    .line 788
    .line 789
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-interface {p2}, Lwf/e;->getKey()Lwf/f;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-interface {p1, v0}, Lwf/g;->t(Lwf/f;)Lwf/g;

    .line 800
    .line 801
    .line 802
    move-result-object p1

    .line 803
    sget-object v0, Lwf/h;->g:Lwf/h;

    .line 804
    .line 805
    if-ne p1, v0, :cond_17

    .line 806
    .line 807
    goto :goto_10

    .line 808
    :cond_17
    sget-object v1, Lwf/d;->g:Lwf/d;

    .line 809
    .line 810
    invoke-interface {p1, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    check-cast v2, Lqg/p;

    .line 815
    .line 816
    if-nez v2, :cond_18

    .line 817
    .line 818
    new-instance v0, Lwf/b;

    .line 819
    .line 820
    invoke-direct {v0, p2, p1}, Lwf/b;-><init>(Lwf/e;Lwf/g;)V

    .line 821
    .line 822
    .line 823
    :goto_f
    move-object p2, v0

    .line 824
    goto :goto_10

    .line 825
    :cond_18
    invoke-interface {p1, v1}, Lwf/g;->t(Lwf/f;)Lwf/g;

    .line 826
    .line 827
    .line 828
    move-result-object p1

    .line 829
    if-ne p1, v0, :cond_19

    .line 830
    .line 831
    new-instance p1, Lwf/b;

    .line 832
    .line 833
    invoke-direct {p1, v2, p2}, Lwf/b;-><init>(Lwf/e;Lwf/g;)V

    .line 834
    .line 835
    .line 836
    move-object p2, p1

    .line 837
    goto :goto_10

    .line 838
    :cond_19
    new-instance v0, Lwf/b;

    .line 839
    .line 840
    new-instance v1, Lwf/b;

    .line 841
    .line 842
    invoke-direct {v1, p2, p1}, Lwf/b;-><init>(Lwf/e;Lwf/g;)V

    .line 843
    .line 844
    .line 845
    invoke-direct {v0, v2, v1}, Lwf/b;-><init>(Lwf/e;Lwf/g;)V

    .line 846
    .line 847
    .line 848
    goto :goto_f

    .line 849
    :goto_10
    return-object p2

    .line 850
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 851
    .line 852
    check-cast p2, Lwf/e;

    .line 853
    .line 854
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-nez v0, :cond_1a

    .line 865
    .line 866
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    goto :goto_11

    .line 871
    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 872
    .line 873
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    const-string p1, ", "

    .line 880
    .line 881
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object p1

    .line 891
    :goto_11
    return-object p1

    .line 892
    :pswitch_14
    check-cast p1, Li0/h0;

    .line 893
    .line 894
    check-cast p2, Ljava/lang/Integer;

    .line 895
    .line 896
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    const/4 p2, 0x1

    .line 900
    invoke-static {p2}, Li0/r;->C(I)I

    .line 901
    .line 902
    .line 903
    move-result p2

    .line 904
    invoke-static {p1, p2}, Lwb/ho;->a(Li0/h0;I)V

    .line 905
    .line 906
    .line 907
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 908
    .line 909
    return-object p1

    .line 910
    :pswitch_15
    check-cast p1, Li0/h0;

    .line 911
    .line 912
    check-cast p2, Ljava/lang/Integer;

    .line 913
    .line 914
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    const/4 p2, 0x1

    .line 918
    invoke-static {p2}, Li0/r;->C(I)I

    .line 919
    .line 920
    .line 921
    move-result p2

    .line 922
    invoke-static {p1, p2}, Lwb/ho;->R(Li0/h0;I)V

    .line 923
    .line 924
    .line 925
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 926
    .line 927
    return-object p1

    .line 928
    :pswitch_16
    check-cast p1, Lxb/i;

    .line 929
    .line 930
    check-cast p2, Le1/b;

    .line 931
    .line 932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 936
    .line 937
    return-object p1

    .line 938
    :pswitch_17
    move-object v3, p1

    .line 939
    check-cast v3, Li0/h0;

    .line 940
    .line 941
    check-cast p2, Ljava/lang/Integer;

    .line 942
    .line 943
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 944
    .line 945
    .line 946
    move-result p1

    .line 947
    and-int/lit8 p2, p1, 0x3

    .line 948
    .line 949
    const/4 v0, 0x2

    .line 950
    const/4 v1, 0x1

    .line 951
    if-eq p2, v0, :cond_1b

    .line 952
    .line 953
    move p2, v1

    .line 954
    goto :goto_12

    .line 955
    :cond_1b
    const/4 p2, 0x0

    .line 956
    :goto_12
    and-int/2addr p1, v1

    .line 957
    invoke-virtual {v3, p1, p2}, Li0/h0;->S(IZ)Z

    .line 958
    .line 959
    .line 960
    move-result p1

    .line 961
    if-eqz p1, :cond_1c

    .line 962
    .line 963
    const/16 v4, 0x36

    .line 964
    .line 965
    const/4 v5, 0x4

    .line 966
    const-string v0, "\u751f\u6548\u8303\u56f4"

    .line 967
    .line 968
    const-string v1, "\u5fae\u4fe1\u548c\u5c0f\u7a0b\u5e8f\u5b9a\u4f4d"

    .line 969
    .line 970
    const/4 v2, 0x0

    .line 971
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 972
    .line 973
    .line 974
    goto :goto_13

    .line 975
    :cond_1c
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 976
    .line 977
    .line 978
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 979
    .line 980
    return-object p1

    .line 981
    :pswitch_18
    check-cast p1, Li0/h0;

    .line 982
    .line 983
    check-cast p2, Ljava/lang/Integer;

    .line 984
    .line 985
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 986
    .line 987
    .line 988
    move-result p2

    .line 989
    and-int/lit8 v0, p2, 0x3

    .line 990
    .line 991
    const/4 v1, 0x2

    .line 992
    const/4 v2, 0x1

    .line 993
    if-eq v0, v1, :cond_1d

    .line 994
    .line 995
    move v0, v2

    .line 996
    goto :goto_14

    .line 997
    :cond_1d
    const/4 v0, 0x0

    .line 998
    :goto_14
    and-int/2addr p2, v2

    .line 999
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1000
    .line 1001
    .line 1002
    move-result p2

    .line 1003
    if-eqz p2, :cond_1e

    .line 1004
    .line 1005
    const-string p2, "\u6ca1\u6709\u5339\u914d\u6807\u7b7e"

    .line 1006
    .line 1007
    const/4 v0, 0x6

    .line 1008
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_15

    .line 1012
    :cond_1e
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1013
    .line 1014
    .line 1015
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1016
    .line 1017
    return-object p1

    .line 1018
    :pswitch_19
    check-cast p1, Li0/h0;

    .line 1019
    .line 1020
    check-cast p2, Ljava/lang/Integer;

    .line 1021
    .line 1022
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1023
    .line 1024
    .line 1025
    move-result p2

    .line 1026
    and-int/lit8 v0, p2, 0x3

    .line 1027
    .line 1028
    const/4 v1, 0x2

    .line 1029
    const/4 v2, 0x1

    .line 1030
    if-eq v0, v1, :cond_1f

    .line 1031
    .line 1032
    move v0, v2

    .line 1033
    goto :goto_16

    .line 1034
    :cond_1f
    const/4 v0, 0x0

    .line 1035
    :goto_16
    and-int/2addr p2, v2

    .line 1036
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1037
    .line 1038
    .line 1039
    move-result p2

    .line 1040
    if-eqz p2, :cond_20

    .line 1041
    .line 1042
    const-string p2, "\u6ca1\u6709\u5339\u914d\u7ed3\u679c"

    .line 1043
    .line 1044
    const/4 v0, 0x6

    .line 1045
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1046
    .line 1047
    .line 1048
    goto :goto_17

    .line 1049
    :cond_20
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1050
    .line 1051
    .line 1052
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1053
    .line 1054
    return-object p1

    .line 1055
    :pswitch_1a
    check-cast p1, Li0/h0;

    .line 1056
    .line 1057
    check-cast p2, Ljava/lang/Integer;

    .line 1058
    .line 1059
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1060
    .line 1061
    .line 1062
    move-result p2

    .line 1063
    and-int/lit8 v0, p2, 0x3

    .line 1064
    .line 1065
    const/4 v1, 0x2

    .line 1066
    const/4 v2, 0x1

    .line 1067
    if-eq v0, v1, :cond_21

    .line 1068
    .line 1069
    move v0, v2

    .line 1070
    goto :goto_18

    .line 1071
    :cond_21
    const/4 v0, 0x0

    .line 1072
    :goto_18
    and-int/2addr p2, v2

    .line 1073
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1074
    .line 1075
    .line 1076
    move-result p2

    .line 1077
    if-eqz p2, :cond_22

    .line 1078
    .line 1079
    const-string p2, "\u6682\u65e0\u5173\u952e\u8bcd\uff0c\u70b9\u51fb\u5e95\u90e8\u201c\u6dfb\u52a0\u5173\u952e\u8bcd\u201d\u3002"

    .line 1080
    .line 1081
    const/4 v0, 0x6

    .line 1082
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_19

    .line 1086
    :cond_22
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1087
    .line 1088
    .line 1089
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1090
    .line 1091
    return-object p1

    .line 1092
    :pswitch_1b
    check-cast p1, Li0/h0;

    .line 1093
    .line 1094
    check-cast p2, Ljava/lang/Integer;

    .line 1095
    .line 1096
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1097
    .line 1098
    .line 1099
    move-result p2

    .line 1100
    and-int/lit8 v0, p2, 0x3

    .line 1101
    .line 1102
    const/4 v1, 0x2

    .line 1103
    const/4 v2, 0x1

    .line 1104
    if-eq v0, v1, :cond_23

    .line 1105
    .line 1106
    move v0, v2

    .line 1107
    goto :goto_1a

    .line 1108
    :cond_23
    const/4 v0, 0x0

    .line 1109
    :goto_1a
    and-int/2addr p2, v2

    .line 1110
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1111
    .line 1112
    .line 1113
    move-result p2

    .line 1114
    if-eqz p2, :cond_24

    .line 1115
    .line 1116
    const-string p2, "\u6b63\u5728\u8f7d\u5165\u6807\u7b7e..."

    .line 1117
    .line 1118
    const/4 v0, 0x6

    .line 1119
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_1b

    .line 1123
    :cond_24
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1124
    .line 1125
    .line 1126
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1127
    .line 1128
    return-object p1

    .line 1129
    :pswitch_1c
    check-cast p1, Li0/h0;

    .line 1130
    .line 1131
    check-cast p2, Ljava/lang/Integer;

    .line 1132
    .line 1133
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1134
    .line 1135
    .line 1136
    move-result p2

    .line 1137
    and-int/lit8 v0, p2, 0x3

    .line 1138
    .line 1139
    const/4 v1, 0x2

    .line 1140
    const/4 v2, 0x1

    .line 1141
    if-eq v0, v1, :cond_25

    .line 1142
    .line 1143
    move v0, v2

    .line 1144
    goto :goto_1c

    .line 1145
    :cond_25
    const/4 v0, 0x0

    .line 1146
    :goto_1c
    and-int/2addr p2, v2

    .line 1147
    invoke-virtual {p1, p2, v0}, Li0/h0;->S(IZ)Z

    .line 1148
    .line 1149
    .line 1150
    move-result p2

    .line 1151
    if-eqz p2, :cond_26

    .line 1152
    .line 1153
    const-string p2, "\u8be5\u89c4\u5219\u5df2\u4e0d\u5b58\u5728"

    .line 1154
    .line 1155
    const/4 v0, 0x6

    .line 1156
    invoke-static {p2, p1, v0}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_1d

    .line 1160
    :cond_26
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 1161
    .line 1162
    .line 1163
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1164
    .line 1165
    return-object p1

    .line 1166
    nop

    .line 1167
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
