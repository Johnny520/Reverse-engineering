.class public final synthetic Lcf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcf1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget p0, p0, Lcf1;->ε:I

    .line 2
    .line 3
    const-string v0, "  "

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    sget-object v5, Ls62;->α:Ls62;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lmi1;->α:Lmi1;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lmi1;->η(Ljava/lang/ClassLoader;)V

    .line 32
    .line 33
    .line 34
    return-object v5

    .line 35
    :pswitch_1
    check-cast p1, Ljava/lang/ClassLoader;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p0, Lqx;

    .line 41
    .line 42
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v0, Lkx;->е:Lkx;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v2, Lk41;

    .line 51
    .line 52
    const/16 v3, 0xb

    .line 53
    .line 54
    invoke-direct {v2, p1, v3}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 55
    .line 56
    .line 57
    const-string v3, "\u5b9a\u4f4d\u8bc4\u8bba\u65f6\u95f4\u7ec4\u4ef6"

    .line 58
    .line 59
    invoke-direct {p0, v0, v3, v2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lqx;

    .line 63
    .line 64
    sget-object v2, Lkx;->и:Lkx;

    .line 65
    .line 66
    invoke-static {v2, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    new-instance v3, Lk41;

    .line 71
    .line 72
    const/16 v4, 0xc

    .line 73
    .line 74
    invoke-direct {v3, p1, v4}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 75
    .line 76
    .line 77
    const-string v4, "\u5b9a\u4f4d\u6a21\u677f\u8bc4\u8bba\u65f6\u95f4\u6e32\u67d3\u65b9\u6cd5"

    .line 78
    .line 79
    invoke-direct {v0, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Lqx;

    .line 83
    .line 84
    sget-object v3, Lkx;->к:Lkx;

    .line 85
    .line 86
    invoke-static {v3, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    new-instance v4, Lk41;

    .line 91
    .line 92
    invoke-direct {v4, p1, v1}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 93
    .line 94
    .line 95
    const-string p1, "\u5b9a\u4f4d Compose \u8bc4\u8bba\u65f6\u95f4\u683c\u5f0f\u5316\u65b9\u6cd5"

    .line 96
    .line 97
    invoke-direct {v2, v3, p1, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 98
    .line 99
    .line 100
    filled-new-array {p0, v0, v2}, [Lqx;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_2
    check-cast p1, Ljava/lang/Class;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :pswitch_3
    check-cast p1, Ljava/lang/Class;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_4
    move-object v8, p1

    .line 127
    check-cast v8, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const/4 v12, 0x6

    .line 133
    const/4 v13, 0x0

    .line 134
    const-string v9, "java.lang.String"

    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    invoke-static/range {v8 .. v13}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 139
    .line 140
    .line 141
    sget-object p0, Lki1;->β:Ljava/util/List;

    .line 142
    .line 143
    new-array p1, v7, [Ljava/lang/String;

    .line 144
    .line 145
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    check-cast p0, [Ljava/lang/String;

    .line 150
    .line 151
    array-length p1, p0

    .line 152
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, [Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v8, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 159
    .line 160
    .line 161
    sget-object p0, Lki1;->γ:Ljava/util/List;

    .line 162
    .line 163
    invoke-static {p0}, Lxh;->З(Ljava/util/List;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Ljava/util/Collection;

    .line 168
    .line 169
    new-array p1, v7, [Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, [Ljava/lang/String;

    .line 176
    .line 177
    array-length p1, p0

    .line 178
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, [Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v8, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 185
    .line 186
    .line 187
    return-object v5

    .line 188
    :pswitch_5
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance p0, Lcf1;

    .line 194
    .line 195
    const/16 v0, 0x18

    .line 196
    .line 197
    invoke-direct {p0, v0}, Lcf1;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 201
    .line 202
    .line 203
    return-object v5

    .line 204
    :pswitch_6
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    new-instance p0, Lcf1;

    .line 210
    .line 211
    const/16 v0, 0x14

    .line 212
    .line 213
    invoke-direct {p0, v0}, Lcf1;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 217
    .line 218
    .line 219
    return-object v5

    .line 220
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_8
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    const-string p0, "void"

    .line 233
    .line 234
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string p0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444045E5F45F7E1B2B50D5955DD465C390D2E76F87756154E0D31183F4"

    .line 238
    .line 239
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    filled-new-array {v2, p0}, [Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 248
    .line 249
    .line 250
    return-object v5

    .line 251
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_a
    check-cast p1, Ljava/lang/Class;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_b
    check-cast p1, Lzg1;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object p0, p1, Lzg1;->α:Ljava/lang/String;

    .line 274
    .line 275
    iget-object v1, p1, Lzg1;->β:Ljava/lang/String;

    .line 276
    .line 277
    iget v2, p1, Lzg1;->γ:I

    .line 278
    .line 279
    iget-object p1, p1, Lzg1;->δ:Ljava/lang/String;

    .line 280
    .line 281
    new-instance v3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string p0, "\u6761("

    .line 302
    .line 303
    const-string v0, ")"

    .line 304
    .line 305
    invoke-static {v3, p0, p1, v0}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    return-object p0

    .line 310
    :pswitch_c
    check-cast p1, Ll91;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object p0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p0, Ljava/lang/String;

    .line 318
    .line 319
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p1, Ljava/lang/String;

    .line 322
    .line 323
    invoke-static {p0, v0, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    return-object p0

    .line 328
    :pswitch_d
    check-cast p1, Lzg1;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object p0, p1, Lzg1;->α:Ljava/lang/String;

    .line 334
    .line 335
    iget v0, p1, Lzg1;->γ:I

    .line 336
    .line 337
    iget-object p1, p1, Lzg1;->δ:Ljava/lang/String;

    .line 338
    .line 339
    new-instance v1, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string p0, ":"

    .line 348
    .line 349
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    return-object p0

    .line 366
    :pswitch_e
    check-cast p1, Ltf1;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object p0, p1, Ltf1;->κ:Ljava/lang/String;

    .line 372
    .line 373
    iget-object p1, p1, Ltf1;->ζ:Ljava/lang/String;

    .line 374
    .line 375
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    new-instance p1, Lnq1;

    .line 384
    .line 385
    const/16 v0, 0x1a

    .line 386
    .line 387
    invoke-direct {p1, v0}, Lnq1;-><init>(I)V

    .line 388
    .line 389
    .line 390
    new-instance v0, Ly30;

    .line 391
    .line 392
    invoke-direct {v0, p0, v7, p1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 393
    .line 394
    .line 395
    new-instance p0, Lx30;

    .line 396
    .line 397
    invoke-direct {p0, v0}, Lx30;-><init>(Ly30;)V

    .line 398
    .line 399
    .line 400
    :cond_0
    invoke-virtual {p0}, Lx30;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    if-eqz p1, :cond_1

    .line 405
    .line 406
    invoke-virtual {p0}, Lx30;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    check-cast p1, Ljava/lang/String;

    .line 411
    .line 412
    const-string v0, "\u591a\u95ea"

    .line 413
    .line 414
    invoke-static {p1, v0, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_0

    .line 419
    .line 420
    const-string v0, "\u4e92\u53d1"

    .line 421
    .line 422
    invoke-static {p1, v0, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_0

    .line 427
    .line 428
    const-string v0, "\u6d88\u606f"

    .line 429
    .line 430
    invoke-static {p1, v0, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-eqz p1, :cond_0

    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_1
    move v6, v7

    .line 438
    :goto_0
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0

    .line 443
    :pswitch_f
    check-cast p1, Lky1;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget p0, p1, Lky1;->δ:I

    .line 449
    .line 450
    if-ne p0, v6, :cond_2

    .line 451
    .line 452
    iget-object p0, p1, Lky1;->α:Ljava/lang/String;

    .line 453
    .line 454
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 455
    .line 456
    .line 457
    move-result p0

    .line 458
    if-nez p0, :cond_2

    .line 459
    .line 460
    iget-wide v0, p1, Lky1;->β:J

    .line 461
    .line 462
    cmp-long p0, v0, v3

    .line 463
    .line 464
    if-lez p0, :cond_2

    .line 465
    .line 466
    iget-wide p0, p1, Lky1;->γ:J

    .line 467
    .line 468
    cmp-long p0, p0, v3

    .line 469
    .line 470
    if-lez p0, :cond_2

    .line 471
    .line 472
    goto :goto_1

    .line 473
    :cond_2
    move v6, v7

    .line 474
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    return-object p0

    .line 479
    :pswitch_10
    check-cast p1, Lky1;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    iget p0, p1, Lky1;->δ:I

    .line 485
    .line 486
    if-ne p0, v6, :cond_3

    .line 487
    .line 488
    iget-object p0, p1, Lky1;->α:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 491
    .line 492
    .line 493
    move-result p0

    .line 494
    if-nez p0, :cond_3

    .line 495
    .line 496
    iget-wide v0, p1, Lky1;->β:J

    .line 497
    .line 498
    cmp-long p0, v0, v3

    .line 499
    .line 500
    if-lez p0, :cond_3

    .line 501
    .line 502
    iget-wide p0, p1, Lky1;->γ:J

    .line 503
    .line 504
    cmp-long p0, p0, v3

    .line 505
    .line 506
    if-lez p0, :cond_3

    .line 507
    .line 508
    goto :goto_2

    .line 509
    :cond_3
    move v6, v7

    .line 510
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    return-object p0

    .line 515
    :pswitch_11
    check-cast p1, Ltf1;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    iget-object p0, p1, Ltf1;->β:Ljava/lang/String;

    .line 521
    .line 522
    if-nez p0, :cond_4

    .line 523
    .line 524
    iget-object p0, p1, Ltf1;->α:Ljava/lang/String;

    .line 525
    .line 526
    :cond_4
    return-object p0

    .line 527
    :pswitch_12
    check-cast p1, Ljava/util/Map$Entry;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    check-cast p0, Ljava/lang/String;

    .line 537
    .line 538
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    check-cast p1, Ljava/lang/Number;

    .line 543
    .line 544
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 545
    .line 546
    .line 547
    move-result p1

    .line 548
    const-string v0, "="

    .line 549
    .line 550
    invoke-static {p0, v0, p1}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    return-object p0

    .line 555
    :pswitch_13
    check-cast p1, Lky1;

    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    iget-wide v0, p1, Lky1;->β:J

    .line 561
    .line 562
    cmp-long p0, v0, v3

    .line 563
    .line 564
    if-lez p0, :cond_5

    .line 565
    .line 566
    iget p0, p1, Lky1;->δ:I

    .line 567
    .line 568
    if-ne p0, v6, :cond_5

    .line 569
    .line 570
    iget-wide p0, p1, Lky1;->γ:J

    .line 571
    .line 572
    cmp-long p0, p0, v3

    .line 573
    .line 574
    if-lez p0, :cond_5

    .line 575
    .line 576
    goto :goto_3

    .line 577
    :cond_5
    move v6, v7

    .line 578
    :goto_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 579
    .line 580
    .line 581
    move-result-object p0

    .line 582
    return-object p0

    .line 583
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 584
    .line 585
    if-eqz p1, :cond_6

    .line 586
    .line 587
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    if-eqz p0, :cond_6

    .line 596
    .line 597
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 598
    .line 599
    .line 600
    move-result p1

    .line 601
    if-lez p1, :cond_6

    .line 602
    .line 603
    move-object v2, p0

    .line 604
    :cond_6
    return-object v2

    .line 605
    :pswitch_15
    check-cast p1, Ljava/lang/Class;

    .line 606
    .line 607
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    return-object p0

    .line 619
    :pswitch_16
    check-cast p1, Ljava/lang/reflect/Field;

    .line 620
    .line 621
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-result-object p0

    .line 625
    return-object p0

    .line 626
    :pswitch_17
    check-cast p1, Ljava/lang/reflect/Field;

    .line 627
    .line 628
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 629
    .line 630
    .line 631
    move-result p0

    .line 632
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 633
    .line 634
    .line 635
    move-result p0

    .line 636
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    return-object p0

    .line 641
    :pswitch_18
    check-cast p1, Lky1;

    .line 642
    .line 643
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    iget p0, p1, Lky1;->δ:I

    .line 647
    .line 648
    if-ne p0, v6, :cond_7

    .line 649
    .line 650
    iget-object p0, p1, Lky1;->α:Ljava/lang/String;

    .line 651
    .line 652
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result p0

    .line 656
    if-nez p0, :cond_7

    .line 657
    .line 658
    iget-wide v0, p1, Lky1;->β:J

    .line 659
    .line 660
    cmp-long p0, v0, v3

    .line 661
    .line 662
    if-lez p0, :cond_7

    .line 663
    .line 664
    iget-wide p0, p1, Lky1;->γ:J

    .line 665
    .line 666
    cmp-long p0, p0, v3

    .line 667
    .line 668
    if-lez p0, :cond_7

    .line 669
    .line 670
    goto :goto_4

    .line 671
    :cond_7
    move v6, v7

    .line 672
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 673
    .line 674
    .line 675
    move-result-object p0

    .line 676
    return-object p0

    .line 677
    :pswitch_19
    check-cast p1, Lorg/json/JSONObject;

    .line 678
    .line 679
    if-eqz p1, :cond_8

    .line 680
    .line 681
    const-string p0, "action"

    .line 682
    .line 683
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    :cond_8
    return-object v2

    .line 688
    :pswitch_1a
    check-cast p1, Lky1;

    .line 689
    .line 690
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    iget-wide v0, p1, Lky1;->β:J

    .line 694
    .line 695
    cmp-long p0, v0, v3

    .line 696
    .line 697
    if-lez p0, :cond_9

    .line 698
    .line 699
    iget p0, p1, Lky1;->δ:I

    .line 700
    .line 701
    if-ne p0, v6, :cond_9

    .line 702
    .line 703
    iget-wide p0, p1, Lky1;->γ:J

    .line 704
    .line 705
    cmp-long p0, p0, v3

    .line 706
    .line 707
    if-lez p0, :cond_9

    .line 708
    .line 709
    goto :goto_5

    .line 710
    :cond_9
    move v6, v7

    .line 711
    :goto_5
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 712
    .line 713
    .line 714
    move-result-object p0

    .line 715
    return-object p0

    .line 716
    :pswitch_1b
    check-cast p1, Lze1;

    .line 717
    .line 718
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    new-instance v3, Ldf1;

    .line 722
    .line 723
    iget-object v4, p1, Lze1;->α:Ljava/lang/String;

    .line 724
    .line 725
    iget-object p0, p1, Lze1;->β:Ljava/lang/String;

    .line 726
    .line 727
    const/16 v0, 0x20

    .line 728
    .line 729
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object p0

    .line 733
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    const/16 v5, 0xa

    .line 737
    .line 738
    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object p0

    .line 753
    const/16 v6, 0x40

    .line 754
    .line 755
    invoke-static {p0, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object p0

    .line 759
    move v7, v6

    .line 760
    iget-object v6, p1, Lze1;->γ:Ljava/lang/Integer;

    .line 761
    .line 762
    move v8, v7

    .line 763
    iget-object v7, p1, Lze1;->δ:Ljava/lang/Integer;

    .line 764
    .line 765
    move v9, v8

    .line 766
    iget-object v8, p1, Lze1;->ε:Ljava/lang/Integer;

    .line 767
    .line 768
    iget-object v10, p1, Lze1;->ζ:Ljava/lang/String;

    .line 769
    .line 770
    if-eqz v10, :cond_a

    .line 771
    .line 772
    const/16 v11, 0x800

    .line 773
    .line 774
    invoke-static {v10, v11}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    goto :goto_6

    .line 779
    :cond_a
    move-object v10, v2

    .line 780
    :goto_6
    iget-object p1, p1, Lze1;->η:Ljava/lang/String;

    .line 781
    .line 782
    if-eqz p1, :cond_b

    .line 783
    .line 784
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object p1

    .line 795
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 799
    .line 800
    .line 801
    move-result-object p1

    .line 802
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object p1

    .line 806
    if-eqz p1, :cond_b

    .line 807
    .line 808
    invoke-static {p1, v9}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    :cond_b
    move-object v5, p0

    .line 813
    move-object v9, v10

    .line 814
    move-object v10, v2

    .line 815
    invoke-direct/range {v3 .. v10}, Ldf1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    return-object v3

    .line 819
    :pswitch_1c
    check-cast p1, Lze1;

    .line 820
    .line 821
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    iget-object p0, p1, Lze1;->θ:Ljava/lang/String;

    .line 825
    .line 826
    const-string p1, "response.food_info.list["

    .line 827
    .line 828
    invoke-static {p0, p1, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 829
    .line 830
    .line 831
    move-result p0

    .line 832
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 833
    .line 834
    .line 835
    move-result-object p0

    .line 836
    return-object p0

    .line 837
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
