.class public final synthetic Lxhss/ᲇᛵᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲇᛵᲈᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lxhss/ᲇᛵᲈᛵ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    check-cast p2, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eq p1, p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/reflect/Member;

    .line 33
    .line 34
    instance-of p0, p2, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    check-cast p2, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    instance-of p0, p2, Ljava/lang/reflect/Constructor;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    instance-of p0, p2, Ljava/lang/reflect/Field;

    .line 57
    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    check-cast p2, Ljava/lang/reflect/Field;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->toGenericString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_1
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const-string p0, "Unsupported member type: "

    .line 76
    .line 77
    invoke-static {p2, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    return-object v0

    .line 81
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    check-cast p2, Ljava/lang/reflect/Member;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eq p1, p0, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move v1, v2

    .line 97
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    check-cast p2, Ljava/lang/reflect/Member;

    .line 109
    .line 110
    invoke-interface {p2}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-ne p1, p0, :cond_5

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move v1, v2

    .line 118
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_3
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 124
    .line 125
    check-cast p2, Ljava/lang/reflect/Member;

    .line 126
    .line 127
    :try_start_0
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    sget-object p2, Lxhss/ᲀᛴᛳᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲇᛳᛴ;

    .line 132
    .line 133
    new-instance v0, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    new-instance v3, Lxhss/ᛸᛲᲀᛵ;

    .line 139
    .line 140
    invoke-direct {v3, v2, p2}, Lxhss/ᛸᛲᲀᛵ;-><init>(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    :goto_5
    invoke-virtual {v3}, Lxhss/ᛸᛲᲀᛵ;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    invoke-virtual {v3}, Lxhss/ᛸᛲᲀᛵ;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    move-object v4, p2

    .line 154
    check-cast v4, Lxhss/ᲀᛴᛳᲁ;

    .line 155
    .line 156
    iget v4, v4, Lxhss/ᲀᛴᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 157
    .line 158
    and-int/2addr v4, p0

    .line 159
    if-eqz v4, :cond_7

    .line 160
    .line 161
    move v4, v1

    .line 162
    goto :goto_6

    .line 163
    :cond_7
    move v4, v2

    .line 164
    :goto_6
    if-eqz v4, :cond_6

    .line 165
    .line 166
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_8
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛷᛸᛷ(Ljava/util/Collection;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :catchall_0
    move-exception p0

    .line 185
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 186
    .line 187
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object p0, p1

    .line 191
    :goto_7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    instance-of p2, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 194
    .line 195
    if-eqz p2, :cond_9

    .line 196
    .line 197
    move-object p0, p1

    .line 198
    :cond_9
    check-cast p0, Ljava/lang/Boolean;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_4
    check-cast p1, Ljava/util/Set;

    .line 202
    .line 203
    check-cast p2, Ljava/lang/reflect/Member;

    .line 204
    .line 205
    if-eqz p1, :cond_a

    .line 206
    .line 207
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_a

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-eqz p1, :cond_c

    .line 223
    .line 224
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    check-cast p1, Lxhss/ᲀᛴᛳᲁ;

    .line 229
    .line 230
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    iget p1, p1, Lxhss/ᲀᛴᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 235
    .line 236
    and-int/2addr p1, v0

    .line 237
    if-eqz p1, :cond_b

    .line 238
    .line 239
    move v1, v2

    .line 240
    :cond_c
    :goto_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_5
    check-cast p1, Ljava/util/Set;

    .line 246
    .line 247
    check-cast p2, Ljava/lang/reflect/Member;

    .line 248
    .line 249
    if-eqz p1, :cond_d

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_d

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_d
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_f

    .line 267
    .line 268
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    check-cast p1, Lxhss/ᲀᛴᛳᲁ;

    .line 273
    .line 274
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    iget p1, p1, Lxhss/ᲀᛴᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 279
    .line 280
    and-int/2addr p1, v0

    .line 281
    if-eqz p1, :cond_e

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_e
    move v1, v2

    .line 285
    :cond_f
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_6
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 291
    .line 292
    check-cast p2, Ljava/lang/reflect/Member;

    .line 293
    .line 294
    :try_start_1
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 305
    .line 306
    .line 307
    goto :goto_b

    .line 308
    :catchall_1
    move-exception p0

    .line 309
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 310
    .line 311
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move-object p0, p1

    .line 315
    :goto_b
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 316
    .line 317
    instance-of p2, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 318
    .line 319
    if-eqz p2, :cond_10

    .line 320
    .line 321
    move-object p0, p1

    .line 322
    :cond_10
    check-cast p0, Ljava/lang/Boolean;

    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 326
    .line 327
    check-cast p2, Ljava/lang/reflect/Member;

    .line 328
    .line 329
    invoke-interface {p2}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    check-cast p2, Ljava/lang/reflect/Method;

    .line 349
    .line 350
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-ne p1, p0, :cond_11

    .line 355
    .line 356
    goto :goto_c

    .line 357
    :cond_11
    move v1, v2

    .line 358
    :goto_c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_9
    check-cast p1, Ljava/util/Set;

    .line 364
    .line 365
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 376
    .line 377
    .line 378
    move-result p2

    .line 379
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eq p2, v3, :cond_12

    .line 384
    .line 385
    move v1, v2

    .line 386
    goto :goto_d

    .line 387
    :cond_12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result p2

    .line 395
    if-nez p2, :cond_13

    .line 396
    .line 397
    :goto_d
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    check-cast p0, Ljava/lang/reflect/Type;

    .line 414
    .line 415
    throw v0

    .line 416
    :pswitch_a
    check-cast p1, Ljava/util/Set;

    .line 417
    .line 418
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 419
    .line 420
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eq p2, v3, :cond_14

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 444
    .line 445
    .line 446
    move-result p2

    .line 447
    if-nez p2, :cond_15

    .line 448
    .line 449
    move v2, v1

    .line 450
    :goto_e
    xor-int/lit8 p0, v2, 0x1

    .line 451
    .line 452
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :cond_15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    check-cast p0, Ljava/lang/reflect/Type;

    .line 469
    .line 470
    throw v0

    .line 471
    :pswitch_b
    check-cast p1, Ljava/util/Set;

    .line 472
    .line 473
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 474
    .line 475
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 484
    .line 485
    .line 486
    move-result p2

    .line 487
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-eq p2, v3, :cond_16

    .line 492
    .line 493
    move v1, v2

    .line 494
    goto :goto_f

    .line 495
    :cond_16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result p2

    .line 503
    if-nez p2, :cond_17

    .line 504
    .line 505
    :goto_f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    return-object p0

    .line 510
    :cond_17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    check-cast p0, Ljava/lang/reflect/Type;

    .line 522
    .line 523
    throw v0

    .line 524
    :pswitch_c
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 525
    .line 526
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 527
    .line 528
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    check-cast p0, Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 543
    .line 544
    .line 545
    goto :goto_10

    .line 546
    :catchall_2
    move-exception p0

    .line 547
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 548
    .line 549
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    move-object p0, p1

    .line 553
    :goto_10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 554
    .line 555
    instance-of p2, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 556
    .line 557
    if-eqz p2, :cond_18

    .line 558
    .line 559
    move-object p0, p1

    .line 560
    :cond_18
    check-cast p0, Ljava/lang/Boolean;

    .line 561
    .line 562
    return-object p0

    .line 563
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result p0

    .line 569
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 570
    .line 571
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 572
    .line 573
    .line 574
    move-result p1

    .line 575
    if-ne p1, p0, :cond_19

    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_19
    move v1, v2

    .line 579
    :goto_11
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    return-object p0

    .line 584
    :pswitch_e
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 585
    .line 586
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 587
    .line 588
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    check-cast p0, Ljava/lang/Boolean;

    .line 601
    .line 602
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 603
    .line 604
    .line 605
    goto :goto_12

    .line 606
    :catchall_3
    move-exception p0

    .line 607
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 608
    .line 609
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 610
    .line 611
    .line 612
    move-object p0, p1

    .line 613
    :goto_12
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 614
    .line 615
    instance-of p2, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 616
    .line 617
    if-eqz p2, :cond_1a

    .line 618
    .line 619
    move-object p0, p1

    .line 620
    :cond_1a
    check-cast p0, Ljava/lang/Boolean;

    .line 621
    .line 622
    return-object p0

    .line 623
    :pswitch_f
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 624
    .line 625
    check-cast p2, Ljava/lang/reflect/Method;

    .line 626
    .line 627
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    check-cast p0, Ljava/lang/Boolean;

    .line 636
    .line 637
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 638
    .line 639
    .line 640
    goto :goto_13

    .line 641
    :catchall_4
    move-exception p0

    .line 642
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 643
    .line 644
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 645
    .line 646
    .line 647
    move-object p0, p1

    .line 648
    :goto_13
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 649
    .line 650
    instance-of p2, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 651
    .line 652
    if-eqz p2, :cond_1b

    .line 653
    .line 654
    move-object p0, p1

    .line 655
    :cond_1b
    check-cast p0, Ljava/lang/Boolean;

    .line 656
    .line 657
    return-object p0

    .line 658
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 659
    .line 660
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 661
    .line 662
    .line 663
    move-result p0

    .line 664
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 665
    .line 666
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 667
    .line 668
    .line 669
    move-result p1

    .line 670
    if-eq p1, p0, :cond_1c

    .line 671
    .line 672
    goto :goto_14

    .line 673
    :cond_1c
    move v1, v2

    .line 674
    :goto_14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 675
    .line 676
    .line 677
    move-result-object p0

    .line 678
    return-object p0

    .line 679
    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    .line 680
    .line 681
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 682
    .line 683
    .line 684
    move-result p0

    .line 685
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 686
    .line 687
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 688
    .line 689
    .line 690
    move-result p1

    .line 691
    if-ne p1, p0, :cond_1d

    .line 692
    .line 693
    goto :goto_15

    .line 694
    :cond_1d
    move v1, v2

    .line 695
    :goto_15
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    return-object p0

    .line 700
    :pswitch_12
    check-cast p1, Ljava/util/Set;

    .line 701
    .line 702
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 703
    .line 704
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 713
    .line 714
    .line 715
    move-result p2

    .line 716
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    if-eq p2, v3, :cond_1e

    .line 721
    .line 722
    goto :goto_16

    .line 723
    :cond_1e
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 724
    .line 725
    .line 726
    move-result-object p1

    .line 727
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 728
    .line 729
    .line 730
    move-result p2

    .line 731
    if-nez p2, :cond_1f

    .line 732
    .line 733
    move v2, v1

    .line 734
    :goto_16
    xor-int/lit8 p0, v2, 0x1

    .line 735
    .line 736
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 737
    .line 738
    .line 739
    move-result-object p0

    .line 740
    return-object p0

    .line 741
    :cond_1f
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    check-cast p0, Ljava/lang/reflect/Type;

    .line 753
    .line 754
    throw v0

    .line 755
    :pswitch_13
    check-cast p1, Ljava/util/Set;

    .line 756
    .line 757
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 758
    .line 759
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 760
    .line 761
    .line 762
    move-result-object p0

    .line 763
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 768
    .line 769
    .line 770
    move-result p2

    .line 771
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    if-eq p2, v3, :cond_20

    .line 776
    .line 777
    move v1, v2

    .line 778
    goto :goto_17

    .line 779
    :cond_20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 780
    .line 781
    .line 782
    move-result-object p1

    .line 783
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 784
    .line 785
    .line 786
    move-result p2

    .line 787
    if-nez p2, :cond_21

    .line 788
    .line 789
    :goto_17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 790
    .line 791
    .line 792
    move-result-object p0

    .line 793
    return-object p0

    .line 794
    :cond_21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object p0

    .line 805
    check-cast p0, Ljava/lang/reflect/Type;

    .line 806
    .line 807
    throw v0

    .line 808
    :pswitch_14
    check-cast p1, Ljava/util/Set;

    .line 809
    .line 810
    check-cast p2, Ljava/lang/reflect/Executable;

    .line 811
    .line 812
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getGenericExceptionTypes()[Ljava/lang/reflect/Type;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    invoke-static {p0}, Lxhss/ᛲᛷᲁᲁ;->ᲀᛷᲁᲀ([Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 821
    .line 822
    .line 823
    move-result p2

    .line 824
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-eq p2, v3, :cond_22

    .line 829
    .line 830
    goto :goto_18

    .line 831
    :cond_22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result p2

    .line 839
    if-nez p2, :cond_23

    .line 840
    .line 841
    move v2, v1

    .line 842
    :goto_18
    xor-int/lit8 p0, v2, 0x1

    .line 843
    .line 844
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 845
    .line 846
    .line 847
    move-result-object p0

    .line 848
    return-object p0

    .line 849
    :cond_23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲁᛲᛴᛴ(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object p0

    .line 860
    check-cast p0, Ljava/lang/reflect/Type;

    .line 861
    .line 862
    throw v0

    .line 863
    :pswitch_15
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 864
    .line 865
    check-cast p2, Ljava/lang/reflect/Field;

    .line 866
    .line 867
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object p0

    .line 875
    check-cast p0, Ljava/lang/Boolean;

    .line 876
    .line 877
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 878
    .line 879
    .line 880
    return-object p0

    .line 881
    :pswitch_16
    if-nez p1, :cond_24

    .line 882
    .line 883
    check-cast p2, Ljava/lang/reflect/Field;

    .line 884
    .line 885
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 886
    .line 887
    .line 888
    throw v0

    .line 889
    :cond_24
    new-instance p0, Ljava/lang/ClassCastException;

    .line 890
    .line 891
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 892
    .line 893
    .line 894
    throw p0

    .line 895
    :pswitch_17
    check-cast p1, Lxhss/ᛷᛴᛲᛲ;

    .line 896
    .line 897
    check-cast p2, Ljava/lang/reflect/Field;

    .line 898
    .line 899
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    move-result-object p0

    .line 903
    invoke-interface {p1, p0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object p0

    .line 907
    check-cast p0, Ljava/lang/Boolean;

    .line 908
    .line 909
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 910
    .line 911
    .line 912
    return-object p0

    .line 913
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 914
    .line 915
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 916
    .line 917
    .line 918
    move-result p0

    .line 919
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 920
    .line 921
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 922
    .line 923
    .line 924
    move-result-object p0

    .line 925
    return-object p0

    .line 926
    :pswitch_19
    check-cast p1, Lxhss/ᛴᛵᛳᛵ;

    .line 927
    .line 928
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 929
    .line 930
    invoke-interface {p1, p2}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 931
    .line 932
    .line 933
    move-result-object p0

    .line 934
    return-object p0

    .line 935
    :pswitch_1a
    check-cast p1, Lxhss/ᛴᛵᛳᛵ;

    .line 936
    .line 937
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 938
    .line 939
    invoke-interface {p1, p2}, Lxhss/ᛴᛵᛳᛵ;->ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 940
    .line 941
    .line 942
    move-result-object p0

    .line 943
    return-object p0

    .line 944
    :pswitch_1b
    check-cast p1, Lxhss/ᛴᛵᛳᛵ;

    .line 945
    .line 946
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 947
    .line 948
    invoke-interface {p2}, Lxhss/ᛳᛵᲈᛲ;->getKey()Lxhss/ᲇᲁᛵᲈ;

    .line 949
    .line 950
    .line 951
    move-result-object p0

    .line 952
    invoke-interface {p1, p0}, Lxhss/ᛴᛵᛳᛵ;->ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;

    .line 953
    .line 954
    .line 955
    move-result-object p0

    .line 956
    sget-object p1, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 957
    .line 958
    if-ne p0, p1, :cond_25

    .line 959
    .line 960
    goto :goto_1a

    .line 961
    :cond_25
    sget-object v0, Lxhss/ᛳᛴᲀᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 962
    .line 963
    invoke-interface {p0, v0}, Lxhss/ᛴᛵᛳᛵ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    check-cast v1, Lxhss/ᛲᛶᲇᲇ;

    .line 968
    .line 969
    if-nez v1, :cond_26

    .line 970
    .line 971
    new-instance p1, Lxhss/ᛳᛵᲈᲈ;

    .line 972
    .line 973
    invoke-direct {p1, p0, p2}, Lxhss/ᛳᛵᲈᲈ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V

    .line 974
    .line 975
    .line 976
    :goto_19
    move-object p2, p1

    .line 977
    goto :goto_1a

    .line 978
    :cond_26
    invoke-interface {p0, v0}, Lxhss/ᛴᛵᛳᛵ;->ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;

    .line 979
    .line 980
    .line 981
    move-result-object p0

    .line 982
    if-ne p0, p1, :cond_27

    .line 983
    .line 984
    new-instance p0, Lxhss/ᛳᛵᲈᲈ;

    .line 985
    .line 986
    invoke-direct {p0, p2, v1}, Lxhss/ᛳᛵᲈᲈ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V

    .line 987
    .line 988
    .line 989
    move-object p2, p0

    .line 990
    goto :goto_1a

    .line 991
    :cond_27
    new-instance p1, Lxhss/ᛳᛵᲈᲈ;

    .line 992
    .line 993
    new-instance v0, Lxhss/ᛳᛵᲈᲈ;

    .line 994
    .line 995
    invoke-direct {v0, p0, p2}, Lxhss/ᛳᛵᲈᲈ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V

    .line 996
    .line 997
    .line 998
    invoke-direct {p1, v0, v1}, Lxhss/ᛳᛵᲈᲈ;-><init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛳᛵᲈᛲ;)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_19

    .line 1002
    :goto_1a
    return-object p2

    .line 1003
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 1004
    .line 1005
    check-cast p2, Lxhss/ᛳᛵᲈᛲ;

    .line 1006
    .line 1007
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 1008
    .line 1009
    .line 1010
    move-result p0

    .line 1011
    if-nez p0, :cond_28

    .line 1012
    .line 1013
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object p0

    .line 1017
    goto :goto_1b

    .line 1018
    :cond_28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    const-string p1, ", "

    .line 1024
    .line 1025
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object p0

    .line 1035
    :goto_1b
    return-object p0

    .line 1036
    nop

    .line 1037
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
