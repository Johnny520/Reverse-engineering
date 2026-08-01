.class public final synthetic Lef;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lef;->ε:I

    iput-object p2, p0, Lef;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpq;Ljava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    .line 2
    iput p1, p0, Lef;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lef;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lef;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lef;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/reflect/Method;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of p1, p0, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p0, v2

    .line 32
    goto :goto_1

    .line 33
    :goto_0
    new-instance p1, Leo1;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p0, p1

    .line 39
    :goto_1
    instance-of p1, p0, Leo1;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move-object v2, p0

    .line 45
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Field;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    instance-of p1, p0, Ljava/lang/Number;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    check-cast p0, Ljava/lang/Number;

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    goto :goto_4

    .line 66
    :cond_2
    move-object p0, v2

    .line 67
    :goto_3
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide p0

    .line 73
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    goto :goto_5

    .line 78
    :cond_3
    move-object p0, v2

    .line 79
    goto :goto_5

    .line 80
    :goto_4
    new-instance p1, Leo1;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    move-object p0, p1

    .line 86
    :goto_5
    instance-of p1, p0, Leo1;

    .line 87
    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    move-object p0, v2

    .line 91
    :cond_4
    check-cast p0, Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    sget-object p1, Lmi1;->α:Lmi1;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide p0

    .line 101
    invoke-static {p0, p1}, Lmi1;->ι(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide p0

    .line 105
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-wide/16 v3, 0x0

    .line 110
    .line 111
    cmp-long p0, p0, v3

    .line 112
    .line 113
    if-lez p0, :cond_5

    .line 114
    .line 115
    move-object v2, v0

    .line 116
    :cond_5
    return-object v2

    .line 117
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    sget-object v0, Lrg1;->α:Ljava/util/Set;

    .line 123
    .line 124
    check-cast p0, Lorg/json/JSONObject;

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lrg1;->α(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Field;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    :try_start_2
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-eqz p0, :cond_6

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 153
    goto :goto_7

    .line 154
    :catchall_2
    move-exception p0

    .line 155
    goto :goto_6

    .line 156
    :cond_6
    move-object p0, v2

    .line 157
    goto :goto_7

    .line 158
    :goto_6
    new-instance p1, Leo1;

    .line 159
    .line 160
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    move-object p0, p1

    .line 164
    :goto_7
    instance-of p1, p0, Leo1;

    .line 165
    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_7
    move-object v2, p0

    .line 170
    :goto_8
    check-cast v2, Ljava/lang/String;

    .line 171
    .line 172
    return-object v2

    .line 173
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Field;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    :try_start_3
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-nez p0, :cond_9

    .line 186
    .line 187
    :cond_8
    move-object v0, v2

    .line 188
    goto :goto_9

    .line 189
    :cond_9
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-static {p1, p0}, Lh62;->Γ(Ljava/lang/Class;Ljava/lang/Object;)I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-lez p1, :cond_8

    .line 201
    .line 202
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    new-instance v0, Ll91;

    .line 207
    .line 208
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 209
    .line 210
    .line 211
    goto :goto_9

    .line 212
    :catchall_3
    move-exception p0

    .line 213
    new-instance v0, Leo1;

    .line 214
    .line 215
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    :goto_9
    instance-of p0, v0, Leo1;

    .line 219
    .line 220
    if-eqz p0, :cond_a

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_a
    move-object v2, v0

    .line 224
    :goto_a
    check-cast v2, Ll91;

    .line 225
    .line 226
    return-object v2

    .line 227
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Method;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    sget-object v0, Lvj0;->α:Lvj0;

    .line 277
    .line 278
    invoke-static {p0, p1}, Lvj0;->ο(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    instance-of p1, p0, Ljava/lang/Number;

    .line 283
    .line 284
    if-eqz p1, :cond_b

    .line 285
    .line 286
    check-cast p0, Ljava/lang/Number;

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_b
    move-object p0, v2

    .line 290
    :goto_b
    if-eqz p0, :cond_c

    .line 291
    .line 292
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    :cond_c
    return-object v2

    .line 301
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    sget-object p1, Lah0;->α:Landroid/os/Handler;

    .line 307
    .line 308
    invoke-static {}, Lah0;->χ()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-static {p0}, Lah0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    new-instance v0, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    :cond_d
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-eqz v2, :cond_f

    .line 334
    .line 335
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    move-object v3, v2

    .line 340
    check-cast v3, Ljava/lang/reflect/Field;

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    if-nez v4, :cond_d

    .line 351
    .line 352
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    const-string v5, "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"

    .line 361
    .line 362
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-nez v4, :cond_e

    .line 371
    .line 372
    if-eqz p1, :cond_d

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    if-eqz v3, :cond_d

    .line 383
    .line 384
    :cond_e
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    :catchall_4
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_10

    .line 397
    .line 398
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    check-cast p1, Ljava/lang/reflect/Field;

    .line 403
    .line 404
    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 405
    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_10
    new-instance p0, Lqt;

    .line 409
    .line 410
    const/16 p1, 0x19

    .line 411
    .line 412
    invoke-direct {p0, p1}, Lqt;-><init>(I)V

    .line 413
    .line 414
    .line 415
    invoke-static {v0, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    return-object p0

    .line 420
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 421
    .line 422
    :try_start_5
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    instance-of p1, p0, Ljava/lang/Enum;

    .line 430
    .line 431
    if-eqz p1, :cond_11

    .line 432
    .line 433
    check-cast p0, Ljava/lang/Enum;

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :catchall_5
    move-exception p0

    .line 437
    goto :goto_f

    .line 438
    :cond_11
    move-object p0, v2

    .line 439
    :goto_e
    if-eqz p0, :cond_12

    .line 440
    .line 441
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 445
    goto :goto_10

    .line 446
    :cond_12
    move-object p0, v2

    .line 447
    goto :goto_10

    .line 448
    :goto_f
    new-instance p1, Leo1;

    .line 449
    .line 450
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 451
    .line 452
    .line 453
    move-object p0, p1

    .line 454
    :goto_10
    instance-of p1, p0, Leo1;

    .line 455
    .line 456
    if-eqz p1, :cond_13

    .line 457
    .line 458
    goto :goto_11

    .line 459
    :cond_13
    move-object v2, p0

    .line 460
    :goto_11
    check-cast v2, Ljava/lang/String;

    .line 461
    .line 462
    return-object v2

    .line 463
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    :try_start_6
    invoke-static {p0, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 472
    goto :goto_12

    .line 473
    :catchall_6
    move-exception p0

    .line 474
    new-instance p1, Leo1;

    .line 475
    .line 476
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    move-object p0, p1

    .line 480
    :goto_12
    instance-of p1, p0, Leo1;

    .line 481
    .line 482
    if-eqz p1, :cond_14

    .line 483
    .line 484
    move-object p0, v2

    .line 485
    :cond_14
    if-eqz p0, :cond_15

    .line 486
    .line 487
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    if-eqz p0, :cond_15

    .line 492
    .line 493
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result p1

    .line 497
    if-nez p1, :cond_15

    .line 498
    .line 499
    move-object v2, p0

    .line 500
    :cond_15
    return-object v2

    .line 501
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-static {p0, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    if-eqz p0, :cond_16

    .line 511
    .line 512
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    if-eqz p0, :cond_16

    .line 517
    .line 518
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    if-eqz p0, :cond_16

    .line 527
    .line 528
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 529
    .line 530
    .line 531
    move-result p1

    .line 532
    if-nez p1, :cond_16

    .line 533
    .line 534
    move-object v2, p0

    .line 535
    :cond_16
    return-object v2

    .line 536
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Field;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    :try_start_7
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    instance-of p1, p0, Landroid/view/View;

    .line 549
    .line 550
    if-eqz p1, :cond_17

    .line 551
    .line 552
    check-cast p0, Landroid/view/View;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 553
    .line 554
    goto :goto_14

    .line 555
    :catchall_7
    move-exception p0

    .line 556
    goto :goto_13

    .line 557
    :cond_17
    move-object p0, v2

    .line 558
    goto :goto_14

    .line 559
    :goto_13
    new-instance p1, Leo1;

    .line 560
    .line 561
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 562
    .line 563
    .line 564
    move-object p0, p1

    .line 565
    :goto_14
    instance-of p1, p0, Leo1;

    .line 566
    .line 567
    if-eqz p1, :cond_18

    .line 568
    .line 569
    move-object p0, v2

    .line 570
    :cond_18
    check-cast p0, Landroid/view/View;

    .line 571
    .line 572
    instance-of p1, p0, Landroid/widget/FrameLayout;

    .line 573
    .line 574
    if-eqz p1, :cond_19

    .line 575
    .line 576
    move-object v2, p0

    .line 577
    check-cast v2, Landroid/widget/FrameLayout;

    .line 578
    .line 579
    :cond_19
    return-object v2

    .line 580
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Field;

    .line 581
    .line 582
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    :try_start_8
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    instance-of p1, p0, Landroid/util/SparseArray;

    .line 593
    .line 594
    if-eqz p1, :cond_1a

    .line 595
    .line 596
    check-cast p0, Landroid/util/SparseArray;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 597
    .line 598
    goto :goto_16

    .line 599
    :catchall_8
    move-exception p0

    .line 600
    goto :goto_15

    .line 601
    :cond_1a
    move-object p0, v2

    .line 602
    goto :goto_16

    .line 603
    :goto_15
    new-instance p1, Leo1;

    .line 604
    .line 605
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    move-object p0, p1

    .line 609
    :goto_16
    instance-of p1, p0, Leo1;

    .line 610
    .line 611
    if-eqz p1, :cond_1b

    .line 612
    .line 613
    goto :goto_17

    .line 614
    :cond_1b
    move-object v2, p0

    .line 615
    :goto_17
    check-cast v2, Landroid/util/SparseArray;

    .line 616
    .line 617
    return-object v2

    .line 618
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Field;

    .line 619
    .line 620
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    :try_start_9
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    instance-of p1, p0, Landroid/util/SparseArray;

    .line 631
    .line 632
    if-eqz p1, :cond_1c

    .line 633
    .line 634
    check-cast p0, Landroid/util/SparseArray;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 635
    .line 636
    goto :goto_19

    .line 637
    :catchall_9
    move-exception p0

    .line 638
    goto :goto_18

    .line 639
    :cond_1c
    move-object p0, v2

    .line 640
    goto :goto_19

    .line 641
    :goto_18
    new-instance p1, Leo1;

    .line 642
    .line 643
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 644
    .line 645
    .line 646
    move-object p0, p1

    .line 647
    :goto_19
    instance-of p1, p0, Leo1;

    .line 648
    .line 649
    if-eqz p1, :cond_1d

    .line 650
    .line 651
    goto :goto_1a

    .line 652
    :cond_1d
    move-object v2, p0

    .line 653
    :goto_1a
    check-cast v2, Landroid/util/SparseArray;

    .line 654
    .line 655
    return-object v2

    .line 656
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Method;

    .line 657
    .line 658
    :try_start_a
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    instance-of p1, p0, Ljava/lang/Enum;

    .line 666
    .line 667
    if-eqz p1, :cond_1e

    .line 668
    .line 669
    check-cast p0, Ljava/lang/Enum;

    .line 670
    .line 671
    goto :goto_1b

    .line 672
    :catchall_a
    move-exception p0

    .line 673
    goto :goto_1c

    .line 674
    :cond_1e
    move-object p0, v2

    .line 675
    :goto_1b
    if-eqz p0, :cond_1f

    .line 676
    .line 677
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 681
    goto :goto_1d

    .line 682
    :cond_1f
    move-object p0, v2

    .line 683
    goto :goto_1d

    .line 684
    :goto_1c
    new-instance p1, Leo1;

    .line 685
    .line 686
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 687
    .line 688
    .line 689
    move-object p0, p1

    .line 690
    :goto_1d
    instance-of p1, p0, Leo1;

    .line 691
    .line 692
    if-eqz p1, :cond_20

    .line 693
    .line 694
    goto :goto_1e

    .line 695
    :cond_20
    move-object v2, p0

    .line 696
    :goto_1e
    check-cast v2, Ljava/lang/String;

    .line 697
    .line 698
    return-object v2

    .line 699
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Field;

    .line 700
    .line 701
    sget-object v0, Lkf;->α:Lkf;

    .line 702
    .line 703
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-static {p0, p1}, Lkf;->τ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object p0

    .line 710
    instance-of p1, p0, Ljava/lang/Number;

    .line 711
    .line 712
    if-eqz p1, :cond_21

    .line 713
    .line 714
    check-cast p0, Ljava/lang/Number;

    .line 715
    .line 716
    goto :goto_1f

    .line 717
    :cond_21
    move-object p0, v2

    .line 718
    :goto_1f
    if-eqz p0, :cond_22

    .line 719
    .line 720
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 721
    .line 722
    .line 723
    move-result-wide p0

    .line 724
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    :cond_22
    return-object v2

    .line 729
    :pswitch_data_0
    .packed-switch 0x0
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
