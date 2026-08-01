.class public final Ltf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltf;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget p0, p0, Ltf;->α:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length p0, p0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    array-length p1, p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :pswitch_0
    check-cast p2, Ljava/lang/reflect/Field;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p2, "INSTANCE"

    .line 42
    .line 43
    invoke-static {p0, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/16 v2, 0x1388

    .line 48
    .line 49
    const-string v3, "LIZ"

    .line 50
    .line 51
    const/16 v4, 0x2710

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    move p0, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {p0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    move p0, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move p0, v1

    .line 66
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p1, Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    move v1, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static {p1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    move v1, v2

    .line 91
    :cond_3
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0

    .line 100
    :pswitch_1
    check-cast p2, Ljava/lang/reflect/Method;

    .line 101
    .line 102
    sget-object p0, Lst;->α:Lst;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p2}, Lst;->Ζ(Ljava/lang/reflect/Method;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p1, Ljava/lang/reflect/Method;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Lst;->Ζ(Ljava/lang/reflect/Method;)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    return p0

    .line 133
    :pswitch_2
    check-cast p2, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    sget-object p0, Lst;->α:Lst;

    .line 136
    .line 137
    invoke-static {p2}, Lst;->Ζ(Ljava/lang/reflect/Method;)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p1, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-static {p1}, Lst;->Ζ(Ljava/lang/reflect/Method;)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    return p0

    .line 160
    :pswitch_3
    check-cast p2, Ljava/lang/reflect/Field;

    .line 161
    .line 162
    sget-object p0, Lst;->α:Lst;

    .line 163
    .line 164
    invoke-static {p2}, Lst;->Θ(Ljava/lang/reflect/Field;)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    check-cast p1, Ljava/lang/reflect/Field;

    .line 173
    .line 174
    invoke-static {p1}, Lst;->Θ(Ljava/lang/reflect/Field;)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    return p0

    .line 187
    :pswitch_4
    check-cast p2, Ljava/lang/reflect/Field;

    .line 188
    .line 189
    sget-object p0, Lst;->α:Lst;

    .line 190
    .line 191
    invoke-static {p2}, Lst;->Ι(Ljava/lang/reflect/Field;)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    check-cast p1, Ljava/lang/reflect/Field;

    .line 200
    .line 201
    invoke-static {p1}, Lst;->Ι(Ljava/lang/reflect/Field;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    return p0

    .line 214
    :pswitch_5
    check-cast p1, Lyp0;

    .line 215
    .line 216
    check-cast p2, Lyp0;

    .line 217
    .line 218
    iget p0, p1, Lyp0;->τ:I

    .line 219
    .line 220
    iget v0, p2, Lyp0;->τ:I

    .line 221
    .line 222
    invoke-static {p0, v0}, Lln0;->ο(II)I

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_4

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    invoke-static {p0, p1}, Lln0;->ο(II)I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    :goto_2
    return p0

    .line 242
    :pswitch_6
    check-cast p2, Ljava/lang/reflect/Method;

    .line 243
    .line 244
    sget-object p0, Ljm;->α:Ljm;

    .line 245
    .line 246
    invoke-static {p0, p2}, Ljm;->α(Ljm;Ljava/lang/reflect/Method;)I

    .line 247
    .line 248
    .line 249
    move-result p2

    .line 250
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    check-cast p1, Ljava/lang/reflect/Method;

    .line 255
    .line 256
    invoke-static {p0, p1}, Ljm;->α(Ljm;Ljava/lang/reflect/Method;)I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    return p0

    .line 269
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {p1}, Lpu0;->Τ(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p2, Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {p2}, Lpu0;->Τ(Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    return p0

    .line 294
    :pswitch_8
    check-cast p2, Ljava/lang/reflect/Method;

    .line 295
    .line 296
    invoke-static {p2}, Lql;->δ(Ljava/lang/reflect/Method;)I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    check-cast p1, Ljava/lang/reflect/Method;

    .line 305
    .line 306
    invoke-static {p1}, Lql;->δ(Ljava/lang/reflect/Method;)I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 315
    .line 316
    .line 317
    move-result p0

    .line 318
    return p0

    .line 319
    :pswitch_9
    check-cast p2, Ljava/lang/String;

    .line 320
    .line 321
    sget-object p0, Lql;->α:Lql;

    .line 322
    .line 323
    invoke-static {p2}, Lql;->Ν(Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    check-cast p1, Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {p1}, Lql;->Ν(Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    return p0

    .line 346
    :pswitch_a
    check-cast p1, Lxm0;

    .line 347
    .line 348
    iget p0, p1, Lvm0;->ε:I

    .line 349
    .line 350
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p2, Lxm0;

    .line 355
    .line 356
    iget p1, p2, Lvm0;->ε:I

    .line 357
    .line 358
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    return p0

    .line 367
    :pswitch_b
    check-cast p2, Ljava/lang/reflect/Method;

    .line 368
    .line 369
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 370
    .line 371
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 372
    .line 373
    .line 374
    move-result p2

    .line 375
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    check-cast p1, Ljava/lang/reflect/Method;

    .line 380
    .line 381
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 390
    .line 391
    .line 392
    move-result p0

    .line 393
    return p0

    .line 394
    :pswitch_c
    check-cast p2, Ljava/lang/reflect/Method;

    .line 395
    .line 396
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 397
    .line 398
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 399
    .line 400
    .line 401
    move-result p2

    .line 402
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object p2

    .line 406
    check-cast p1, Ljava/lang/reflect/Method;

    .line 407
    .line 408
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 409
    .line 410
    .line 411
    move-result p0

    .line 412
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    return p0

    .line 421
    :pswitch_d
    check-cast p2, Ljava/lang/reflect/Method;

    .line 422
    .line 423
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 424
    .line 425
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 426
    .line 427
    .line 428
    move-result p2

    .line 429
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object p2

    .line 433
    check-cast p1, Ljava/lang/reflect/Method;

    .line 434
    .line 435
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    return p0

    .line 448
    :pswitch_e
    check-cast p2, Ljava/lang/reflect/Method;

    .line 449
    .line 450
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 451
    .line 452
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 453
    .line 454
    .line 455
    move-result p2

    .line 456
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    check-cast p1, Ljava/lang/reflect/Method;

    .line 461
    .line 462
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 463
    .line 464
    .line 465
    move-result p0

    .line 466
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 471
    .line 472
    .line 473
    move-result p0

    .line 474
    return p0

    .line 475
    :pswitch_f
    check-cast p2, Ljava/lang/reflect/Method;

    .line 476
    .line 477
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 478
    .line 479
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 483
    .line 484
    .line 485
    move-result p2

    .line 486
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object p2

    .line 490
    check-cast p1, Ljava/lang/reflect/Method;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 496
    .line 497
    .line 498
    move-result p0

    .line 499
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    return p0

    .line 508
    :pswitch_10
    check-cast p2, Ljava/lang/reflect/Method;

    .line 509
    .line 510
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 511
    .line 512
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 513
    .line 514
    .line 515
    move-result p2

    .line 516
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object p2

    .line 520
    check-cast p1, Ljava/lang/reflect/Method;

    .line 521
    .line 522
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 523
    .line 524
    .line 525
    move-result p0

    .line 526
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 531
    .line 532
    .line 533
    move-result p0

    .line 534
    return p0

    .line 535
    :pswitch_11
    check-cast p2, Ljava/lang/reflect/Method;

    .line 536
    .line 537
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 538
    .line 539
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 540
    .line 541
    .line 542
    move-result p2

    .line 543
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 544
    .line 545
    .line 546
    move-result-object p2

    .line 547
    check-cast p1, Ljava/lang/reflect/Method;

    .line 548
    .line 549
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 558
    .line 559
    .line 560
    move-result p0

    .line 561
    return p0

    .line 562
    :pswitch_12
    check-cast p2, Ljava/lang/reflect/Method;

    .line 563
    .line 564
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 565
    .line 566
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 567
    .line 568
    .line 569
    move-result p2

    .line 570
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object p2

    .line 574
    check-cast p1, Ljava/lang/reflect/Method;

    .line 575
    .line 576
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreReplyListMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 585
    .line 586
    .line 587
    move-result p0

    .line 588
    return p0

    .line 589
    :pswitch_13
    check-cast p2, Ljava/lang/reflect/Method;

    .line 590
    .line 591
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 592
    .line 593
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 594
    .line 595
    .line 596
    move-result p2

    .line 597
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object p2

    .line 601
    check-cast p1, Ljava/lang/reflect/Method;

    .line 602
    .line 603
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreLoadMoreCommentMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 604
    .line 605
    .line 606
    move-result p0

    .line 607
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    return p0

    .line 616
    :pswitch_14
    check-cast p2, Ljava/lang/reflect/Method;

    .line 617
    .line 618
    sget-object p0, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->INSTANCE:Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;

    .line 619
    .line 620
    invoke-static {p0, p2}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreBindMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 621
    .line 622
    .line 623
    move-result p2

    .line 624
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object p2

    .line 628
    check-cast p1, Ljava/lang/reflect/Method;

    .line 629
    .line 630
    invoke-static {p0, p1}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->access$scoreBindMethod(Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;Ljava/lang/reflect/Method;)I

    .line 631
    .line 632
    .line 633
    move-result p0

    .line 634
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 639
    .line 640
    .line 641
    move-result p0

    .line 642
    return p0

    .line 643
    :pswitch_15
    check-cast p2, Ljava/io/File;

    .line 644
    .line 645
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 646
    .line 647
    .line 648
    move-result-wide v0

    .line 649
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    check-cast p1, Ljava/io/File;

    .line 654
    .line 655
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 656
    .line 657
    .line 658
    move-result-wide p1

    .line 659
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 664
    .line 665
    .line 666
    move-result p0

    .line 667
    return p0

    .line 668
    :pswitch_16
    check-cast p2, Ljava/lang/reflect/Method;

    .line 669
    .line 670
    sget-object p0, Lfj;->α:Lfj;

    .line 671
    .line 672
    invoke-static {p2}, Lfj;->Ζ(Ljava/lang/reflect/Method;)I

    .line 673
    .line 674
    .line 675
    move-result p0

    .line 676
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    check-cast p1, Ljava/lang/reflect/Method;

    .line 681
    .line 682
    invoke-static {p1}, Lfj;->Ζ(Ljava/lang/reflect/Method;)I

    .line 683
    .line 684
    .line 685
    move-result p1

    .line 686
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 691
    .line 692
    .line 693
    move-result p0

    .line 694
    return p0

    .line 695
    :pswitch_17
    check-cast p2, Ljava/lang/Class;

    .line 696
    .line 697
    sget-object p0, Lkh;->α:Lkh;

    .line 698
    .line 699
    invoke-static {p2}, Lkh;->π(Ljava/lang/Class;)I

    .line 700
    .line 701
    .line 702
    move-result p0

    .line 703
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 704
    .line 705
    .line 706
    move-result-object p0

    .line 707
    check-cast p1, Ljava/lang/Class;

    .line 708
    .line 709
    invoke-static {p1}, Lkh;->π(Ljava/lang/Class;)I

    .line 710
    .line 711
    .line 712
    move-result p1

    .line 713
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 714
    .line 715
    .line 716
    move-result-object p1

    .line 717
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 718
    .line 719
    .line 720
    move-result p0

    .line 721
    return p0

    .line 722
    :pswitch_18
    check-cast p2, Ljava/lang/Class;

    .line 723
    .line 724
    sget-object p0, Lkh;->α:Lkh;

    .line 725
    .line 726
    invoke-static {p2}, Lkh;->π(Ljava/lang/Class;)I

    .line 727
    .line 728
    .line 729
    move-result p0

    .line 730
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 731
    .line 732
    .line 733
    move-result-object p0

    .line 734
    check-cast p1, Ljava/lang/Class;

    .line 735
    .line 736
    invoke-static {p1}, Lkh;->π(Ljava/lang/Class;)I

    .line 737
    .line 738
    .line 739
    move-result p1

    .line 740
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 741
    .line 742
    .line 743
    move-result-object p1

    .line 744
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 745
    .line 746
    .line 747
    move-result p0

    .line 748
    return p0

    .line 749
    :pswitch_19
    check-cast p2, Ljava/lang/Class;

    .line 750
    .line 751
    sget-object p0, Lkh;->α:Lkh;

    .line 752
    .line 753
    invoke-static {p2}, Lkh;->π(Ljava/lang/Class;)I

    .line 754
    .line 755
    .line 756
    move-result p0

    .line 757
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    check-cast p1, Ljava/lang/Class;

    .line 762
    .line 763
    invoke-static {p1}, Lkh;->π(Ljava/lang/Class;)I

    .line 764
    .line 765
    .line 766
    move-result p1

    .line 767
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object p1

    .line 771
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 772
    .line 773
    .line 774
    move-result p0

    .line 775
    return p0

    .line 776
    :pswitch_1a
    check-cast p2, Ljava/lang/Class;

    .line 777
    .line 778
    sget-object p0, Lkh;->α:Lkh;

    .line 779
    .line 780
    invoke-static {p2}, Lkh;->π(Ljava/lang/Class;)I

    .line 781
    .line 782
    .line 783
    move-result p0

    .line 784
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 785
    .line 786
    .line 787
    move-result-object p0

    .line 788
    check-cast p1, Ljava/lang/Class;

    .line 789
    .line 790
    invoke-static {p1}, Lkh;->π(Ljava/lang/Class;)I

    .line 791
    .line 792
    .line 793
    move-result p1

    .line 794
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 799
    .line 800
    .line 801
    move-result p0

    .line 802
    return p0

    .line 803
    :pswitch_1b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 804
    .line 805
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object p0

    .line 809
    const-string p1, "id"

    .line 810
    .line 811
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result p0

    .line 815
    xor-int/2addr p0, v0

    .line 816
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    check-cast p2, Ljava/lang/reflect/Method;

    .line 821
    .line 822
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object p2

    .line 826
    invoke-static {p2, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result p1

    .line 830
    xor-int/2addr p1, v0

    .line 831
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    invoke-static {p0, p1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 836
    .line 837
    .line 838
    move-result p0

    .line 839
    return p0

    .line 840
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 841
    .line 842
    check-cast p2, Ljava/lang/String;

    .line 843
    .line 844
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 851
    .line 852
    .line 853
    move-result p0

    .line 854
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 855
    .line 856
    .line 857
    move-result v2

    .line 858
    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    .line 859
    .line 860
    .line 861
    move-result p0

    .line 862
    const/4 v2, 0x4

    .line 863
    :goto_3
    if-ge v2, p0, :cond_6

    .line 864
    .line 865
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    .line 870
    .line 871
    .line 872
    move-result v4

    .line 873
    if-eq v3, v4, :cond_5

    .line 874
    .line 875
    invoke-static {v3, v4}, Lln0;->ο(II)I

    .line 876
    .line 877
    .line 878
    move-result p0

    .line 879
    if-gez p0, :cond_8

    .line 880
    .line 881
    goto :goto_4

    .line 882
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 883
    .line 884
    goto :goto_3

    .line 885
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 886
    .line 887
    .line 888
    move-result p0

    .line 889
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 890
    .line 891
    .line 892
    move-result p1

    .line 893
    if-eq p0, p1, :cond_7

    .line 894
    .line 895
    if-ge p0, p1, :cond_8

    .line 896
    .line 897
    :goto_4
    const/4 v0, -0x1

    .line 898
    goto :goto_5

    .line 899
    :cond_7
    move v0, v1

    .line 900
    :cond_8
    :goto_5
    return v0

    .line 901
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
