.class public final synthetic Lul;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lul;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyl;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput p1, p0, Lul;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p0, p0, Lul;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/ClassLoader;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljm;->α:Ljm;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljm;->ε(Ljava/lang/ClassLoader;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ls62;->α:Ls62;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/ClassLoader;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p0, Lqx;

    .line 27
    .line 28
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v0, Lkx;->Ｃ:Lkx;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u533a\u641c\u7d22\u5165\u53e3\u89c6\u56fe\u521d\u59cb\u5316"

    .line 37
    .line 38
    new-instance v2, Lcb;

    .line 39
    .line 40
    const/16 v3, 0x16

    .line 41
    .line 42
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Ls62;->α:Ls62;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 62
    .line 63
    sget-object p0, Lem;->α:Ljava/util/Set;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {p0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    array-length p0, p0

    .line 95
    if-nez p0, :cond_0

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const-class p0, Landroid/view/ViewGroup;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    aget-object p1, p1, v0

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_1

    .line 111
    .line 112
    move v0, v1

    .line 113
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Ls62;->α:Ls62;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string v2, "getIntValue"

    .line 133
    .line 134
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-eqz p0, :cond_2

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_2

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 157
    .line 158
    const-class v3, Ljava/lang/String;

    .line 159
    .line 160
    filled-new-array {p1, v3, v2, v2}, [Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_2

    .line 169
    .line 170
    move v0, v1

    .line 171
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Method;

    .line 177
    .line 178
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 179
    .line 180
    .line 181
    sget-object p0, Ls62;->α:Ls62;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-eqz p0, :cond_3

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    array-length p0, p0

    .line 204
    if-nez p0, :cond_3

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 211
    .line 212
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-eqz p0, :cond_3

    .line 217
    .line 218
    move v0, v1

    .line 219
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    return-object p0

    .line 224
    :pswitch_7
    check-cast p1, Ljava/lang/reflect/Method;

    .line 225
    .line 226
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Ls62;->α:Ls62;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    const-string v2, "isAllowShowCommentRelatedSearchView"

    .line 239
    .line 240
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    if-eqz p0, :cond_4

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 251
    .line 252
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    if-eqz p0, :cond_4

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    array-length p0, p0

    .line 263
    if-ne p0, v1, :cond_4

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    aget-object p0, p0, v0

    .line 270
    .line 271
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    const-string p1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 276
    .line 277
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    if-eqz p0, :cond_4

    .line 286
    .line 287
    move v0, v1

    .line 288
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 294
    .line 295
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Ls62;->α:Ls62;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-nez p0, :cond_5

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 318
    .line 319
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    if-eqz p0, :cond_5

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    array-length p0, p0

    .line 330
    if-ne p0, v1, :cond_5

    .line 331
    .line 332
    const-class p0, Landroid/view/View;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    aget-object p1, p1, v0

    .line 339
    .line 340
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-eqz p0, :cond_5

    .line 345
    .line 346
    move v0, v1

    .line 347
    :cond_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    const-string p0, "*"

    .line 358
    .line 359
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result p0

    .line 363
    if-nez p0, :cond_6

    .line 364
    .line 365
    const-string p0, "hide_comment_input_bar_enabled"

    .line 366
    .line 367
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    if-eqz p0, :cond_9

    .line 372
    .line 373
    :cond_6
    sget-object p0, Ldm;->α:Ldm;

    .line 374
    .line 375
    const-string p0, "hide_comment_input_bar_enabled"

    .line 376
    .line 377
    invoke-static {p0}, Ldm;->ε(Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result p0

    .line 381
    if-nez p0, :cond_9

    .line 382
    .line 383
    sget-object p0, Lgm;->α:Ljava/util/Map;

    .line 384
    .line 385
    monitor-enter p0

    .line 386
    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    check-cast p1, Ljava/lang/Iterable;

    .line 391
    .line 392
    new-instance v0, Ljava/util/ArrayList;

    .line 393
    .line 394
    const/16 v1, 0xa

    .line 395
    .line 396
    invoke-static {p1, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-eqz v1, :cond_7

    .line 412
    .line 413
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    check-cast v1, Ljava/util/Map$Entry;

    .line 418
    .line 419
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    new-instance v3, Ll91;

    .line 428
    .line 429
    invoke-direct {v3, v2, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    .line 434
    .line 435
    goto :goto_1

    .line 436
    :catchall_0
    move-exception v0

    .line 437
    move-object p1, v0

    .line 438
    goto :goto_3

    .line 439
    :cond_7
    monitor-exit p0

    .line 440
    sget-object p0, Lgm;->β:Ljava/lang/ThreadLocal;

    .line 441
    .line 442
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 443
    .line 444
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-eqz p1, :cond_8

    .line 456
    .line 457
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    check-cast p1, Ll91;

    .line 462
    .line 463
    iget-object v0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, Landroid/view/View;

    .line 466
    .line 467
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast p1, Lfm;

    .line 470
    .line 471
    iget v1, p1, Lfm;->α:I

    .line 472
    .line 473
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 474
    .line 475
    .line 476
    iget v1, p1, Lfm;->β:F

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 479
    .line 480
    .line 481
    iget-boolean v1, p1, Lfm;->γ:Z

    .line 482
    .line 483
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 484
    .line 485
    .line 486
    iget-boolean v1, p1, Lfm;->δ:Z

    .line 487
    .line 488
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 489
    .line 490
    .line 491
    iget-boolean v1, p1, Lfm;->ε:Z

    .line 492
    .line 493
    invoke-virtual {v0, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 494
    .line 495
    .line 496
    iget-boolean v1, p1, Lfm;->ζ:Z

    .line 497
    .line 498
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 499
    .line 500
    .line 501
    iget-boolean v1, p1, Lfm;->η:Z

    .line 502
    .line 503
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 504
    .line 505
    .line 506
    iget p1, p1, Lfm;->θ:I

    .line 507
    .line 508
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 509
    .line 510
    .line 511
    goto :goto_2

    .line 512
    :cond_8
    sget-object p0, Lgm;->β:Ljava/lang/ThreadLocal;

    .line 513
    .line 514
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 515
    .line 516
    .line 517
    sget-object p0, Lgm;->α:Ljava/util/Map;

    .line 518
    .line 519
    monitor-enter p0

    .line 520
    :try_start_2
    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 521
    .line 522
    .line 523
    monitor-exit p0

    .line 524
    goto :goto_4

    .line 525
    :catchall_1
    move-exception v0

    .line 526
    move-object p1, v0

    .line 527
    monitor-exit p0

    .line 528
    throw p1

    .line 529
    :catchall_2
    move-exception v0

    .line 530
    move-object p0, v0

    .line 531
    sget-object p1, Lgm;->β:Ljava/lang/ThreadLocal;

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 534
    .line 535
    .line 536
    throw p0

    .line 537
    :goto_3
    monitor-exit p0

    .line 538
    throw p1

    .line 539
    :cond_9
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 540
    .line 541
    return-object p0

    .line 542
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Method;

    .line 543
    .line 544
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 549
    .line 550
    .line 551
    move-result p0

    .line 552
    xor-int/2addr p0, v1

    .line 553
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    return-object p0

    .line 558
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Field;

    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    const-class p0, Landroid/util/SparseArray;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 570
    .line 571
    .line 572
    move-result p0

    .line 573
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    return-object p0

    .line 578
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Field;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 584
    .line 585
    .line 586
    move-result p0

    .line 587
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 588
    .line 589
    .line 590
    move-result p0

    .line 591
    xor-int/2addr p0, v1

    .line 592
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    return-object p0

    .line 597
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Field;

    .line 598
    .line 599
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    const-class p0, Landroid/util/SparseArray;

    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 609
    .line 610
    .line 611
    move-result p0

    .line 612
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    return-object p0

    .line 617
    :pswitch_10
    check-cast p1, Ljava/lang/reflect/Field;

    .line 618
    .line 619
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 623
    .line 624
    .line 625
    move-result p0

    .line 626
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 627
    .line 628
    .line 629
    move-result p0

    .line 630
    xor-int/2addr p0, v1

    .line 631
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    return-object p0

    .line 636
    :pswitch_11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    move-result-object p0

    .line 642
    array-length p0, p0

    .line 643
    if-ne p0, v1, :cond_a

    .line 644
    .line 645
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    move-result-object p0

    .line 649
    aget-object p0, p0, v0

    .line 650
    .line 651
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 652
    .line 653
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result p0

    .line 657
    if-eqz p0, :cond_a

    .line 658
    .line 659
    move v0, v1

    .line 660
    :cond_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 661
    .line 662
    .line 663
    move-result-object p0

    .line 664
    return-object p0

    .line 665
    :pswitch_12
    check-cast p1, Ljava/lang/reflect/Method;

    .line 666
    .line 667
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 672
    .line 673
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result p0

    .line 677
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 678
    .line 679
    .line 680
    move-result-object p0

    .line 681
    return-object p0

    .line 682
    :pswitch_13
    check-cast p1, Ljava/lang/reflect/Method;

    .line 683
    .line 684
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 685
    .line 686
    .line 687
    move-result p0

    .line 688
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 689
    .line 690
    .line 691
    move-result p0

    .line 692
    xor-int/2addr p0, v1

    .line 693
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 694
    .line 695
    .line 696
    move-result-object p0

    .line 697
    return-object p0

    .line 698
    :pswitch_14
    check-cast p1, Ljava/lang/Class;

    .line 699
    .line 700
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object p0

    .line 704
    return-object p0

    .line 705
    :pswitch_15
    check-cast p1, Landroid/view/View;

    .line 706
    .line 707
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    sget-object p0, Lyl;->θ:Ljava/util/Map;

    .line 711
    .line 712
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result p0

    .line 716
    if-eqz p0, :cond_b

    .line 717
    .line 718
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 719
    .line 720
    .line 721
    move-result p0

    .line 722
    const/16 v0, 0x8

    .line 723
    .line 724
    if-eq p0, v0, :cond_b

    .line 725
    .line 726
    sget-object p0, Lyl;->α:Lyl;

    .line 727
    .line 728
    const-string p0, "panel.onViewCreated"

    .line 729
    .line 730
    invoke-static {p1, p0}, Lyl;->δ(Landroid/view/View;Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    :cond_b
    sget-object p0, Ls62;->α:Ls62;

    .line 734
    .line 735
    return-object p0

    .line 736
    :pswitch_16
    check-cast p1, Ljava/lang/ClassLoader;

    .line 737
    .line 738
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    sget-object p0, Lyl;->α:Lyl;

    .line 742
    .line 743
    invoke-virtual {p0, p1}, Lyl;->ε(Ljava/lang/ClassLoader;)V

    .line 744
    .line 745
    .line 746
    sget-object p0, Ls62;->α:Ls62;

    .line 747
    .line 748
    return-object p0

    .line 749
    :pswitch_17
    check-cast p1, Ljava/lang/ClassLoader;

    .line 750
    .line 751
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    new-instance p0, Lqx;

    .line 755
    .line 756
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 757
    .line 758
    sget-object v0, Lkx;->Ｂ:Lkx;

    .line 759
    .line 760
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u952e\u76d8\u9762\u677f\u89c6\u56fe\u521d\u59cb\u5316\u5165\u53e3"

    .line 765
    .line 766
    new-instance v2, Lcb;

    .line 767
    .line 768
    const/16 v3, 0x14

    .line 769
    .line 770
    invoke-direct {v2, p1, v3}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 771
    .line 772
    .line 773
    invoke-direct {p0, v0, v1, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 774
    .line 775
    .line 776
    new-instance v0, Lqx;

    .line 777
    .line 778
    sget-object v1, Lkx;->Ａ:Lkx;

    .line 779
    .line 780
    invoke-static {v1, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    const-string v2, "\u5b9a\u4f4d\u8bc4\u8bba\u8f93\u5165\u6846\u53d1\u5e03\u4f5c\u54c1\u9884\u89c8\u63a7\u4ef6\u521d\u59cb\u5316"

    .line 785
    .line 786
    new-instance v3, Lcb;

    .line 787
    .line 788
    const/16 v4, 0x15

    .line 789
    .line 790
    invoke-direct {v3, p1, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 791
    .line 792
    .line 793
    invoke-direct {v0, v1, v2, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 794
    .line 795
    .line 796
    filled-new-array {p0, v0}, [Lqx;

    .line 797
    .line 798
    .line 799
    move-result-object p0

    .line 800
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 801
    .line 802
    .line 803
    move-result-object p0

    .line 804
    return-object p0

    .line 805
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 806
    .line 807
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    const-string p0, "*"

    .line 811
    .line 812
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result p0

    .line 816
    if-nez p0, :cond_c

    .line 817
    .line 818
    const-string p0, "hide_comment_keyboard_entrance_enabled"

    .line 819
    .line 820
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result p0

    .line 824
    if-eqz p0, :cond_d

    .line 825
    .line 826
    :cond_c
    invoke-static {}, Lyl;->ζ()Z

    .line 827
    .line 828
    .line 829
    move-result p0

    .line 830
    if-nez p0, :cond_d

    .line 831
    .line 832
    invoke-static {}, Lyl;->ξ()V

    .line 833
    .line 834
    .line 835
    :cond_d
    sget-object p0, Ls62;->α:Ls62;

    .line 836
    .line 837
    return-object p0

    .line 838
    :pswitch_19
    check-cast p1, Landroid/view/View;

    .line 839
    .line 840
    sget-object p0, Ls62;->α:Ls62;

    .line 841
    .line 842
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    instance-of v1, p1, Landroid/widget/Checkable;

    .line 846
    .line 847
    if-eqz v1, :cond_e

    .line 848
    .line 849
    sget-object v1, Lyl;->α:Lyl;

    .line 850
    .line 851
    invoke-static {p1}, Lyl;->θ(Landroid/view/View;)Z

    .line 852
    .line 853
    .line 854
    move-result v1

    .line 855
    if-eqz v1, :cond_e

    .line 856
    .line 857
    :try_start_3
    move-object v1, p1

    .line 858
    check-cast v1, Landroid/widget/Checkable;

    .line 859
    .line 860
    invoke-interface {v1, v0}, Landroid/widget/Checkable;->setChecked(Z)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 864
    .line 865
    .line 866
    move-object v0, p0

    .line 867
    goto :goto_5

    .line 868
    :catchall_3
    move-exception v0

    .line 869
    move-object p1, v0

    .line 870
    new-instance v0, Leo1;

    .line 871
    .line 872
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 873
    .line 874
    .line 875
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 876
    .line 877
    .line 878
    move-result-object p1

    .line 879
    if-eqz p1, :cond_e

    .line 880
    .line 881
    const-string v0, "r931d7e30ef229d29"

    .line 882
    .line 883
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object p1

    .line 887
    const-string v1, "uncheck publish checkbox failed: "

    .line 888
    .line 889
    invoke-static {v1, p1, v0}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    :cond_e
    return-object p0

    .line 893
    :pswitch_1a
    move-object v2, p1

    .line 894
    check-cast v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 895
    .line 896
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    const-string v3, "void"

    .line 900
    .line 901
    const/4 v6, 0x6

    .line 902
    const/4 v7, 0x0

    .line 903
    const/4 v4, 0x0

    .line 904
    const/4 v5, 0x0

    .line 905
    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 906
    .line 907
    .line 908
    const-string p0, "android.view.View"

    .line 909
    .line 910
    filled-new-array {p0}, [Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object p0

    .line 914
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 915
    .line 916
    .line 917
    sget-object p0, Ls62;->α:Ls62;

    .line 918
    .line 919
    return-object p0

    .line 920
    :pswitch_1b
    move-object v0, p1

    .line 921
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 922
    .line 923
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    const-string v1, "void"

    .line 927
    .line 928
    const/4 v4, 0x6

    .line 929
    const/4 v5, 0x0

    .line 930
    const/4 v2, 0x0

    .line 931
    const/4 v3, 0x0

    .line 932
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 933
    .line 934
    .line 935
    const-string p0, "PublishToAwemeUtils#toPublishPreviewTextEdit"

    .line 936
    .line 937
    filled-new-array {p0}, [Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object p0

    .line 941
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 942
    .line 943
    .line 944
    sget-object p0, Ls62;->α:Ls62;

    .line 945
    .line 946
    return-object p0

    .line 947
    :pswitch_1c
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 948
    .line 949
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    new-instance p0, Lul;

    .line 953
    .line 954
    const/4 v0, 0x2

    .line 955
    invoke-direct {p0, v0}, Lul;-><init>(I)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 959
    .line 960
    .line 961
    sget-object p0, Ls62;->α:Ls62;

    .line 962
    .line 963
    return-object p0

    .line 964
    nop

    .line 965
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
