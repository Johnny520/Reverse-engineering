.class public final synthetic Lfj0;
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
    iput p1, p0, Lfj0;->ε:I

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lfj0;->ε:I

    .line 4
    .line 5
    const-string v1, "):"

    .line 6
    .line 7
    const-string v2, "("

    .line 8
    .line 9
    const-string v3, "#"

    .line 10
    .line 11
    sget-object v4, Ls62;->α:Ls62;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v7, p1

    .line 19
    .line 20
    check-cast v7, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD80D768DA874A7739F1535D8D0B64C96CD3C16C27FA1E8BC98"

    .line 26
    .line 27
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const/4 v11, 0x6

    .line 32
    const/4 v12, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 36
    .line 37
    .line 38
    const-string v8, "void"

    .line 39
    .line 40
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :pswitch_0
    move-object/from16 v0, p1

    .line 45
    .line 46
    check-cast v0, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v1, Lzj0;->α:Lzj0;

    .line 52
    .line 53
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :pswitch_1
    move-object/from16 v0, p1

    .line 59
    .line 60
    check-cast v0, Ljava/lang/reflect/Method;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lx;->б(Ljava/lang/reflect/Method;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/16 v1, 0x64

    .line 70
    .line 71
    if-lt v0, v1, :cond_0

    .line 72
    .line 73
    move v5, v6

    .line 74
    :cond_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_2
    move-object/from16 v0, p1

    .line 80
    .line 81
    check-cast v0, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    sget-object v1, Lzj0;->α:Lzj0;

    .line 87
    .line 88
    invoke-static {v0}, Lzj0;->π(Ljava/lang/reflect/Method;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_3
    move-object/from16 v0, p1

    .line 98
    .line 99
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v1, Lwj0;

    .line 105
    .line 106
    const/16 v2, 0xa

    .line 107
    .line 108
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 112
    .line 113
    .line 114
    return-object v4

    .line 115
    :pswitch_4
    move-object/from16 v0, p1

    .line 116
    .line 117
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v1, Lwj0;

    .line 123
    .line 124
    const/16 v2, 0xc

    .line 125
    .line 126
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 130
    .line 131
    .line 132
    return-object v4

    .line 133
    :pswitch_5
    move-object/from16 v0, p1

    .line 134
    .line 135
    check-cast v0, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget-object v1, Lzj0;->α:Lzj0;

    .line 141
    .line 142
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_6
    move-object/from16 v0, p1

    .line 148
    .line 149
    check-cast v0, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v0}, Lx;->ω(Ljava/lang/Class;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :pswitch_7
    move-object/from16 v0, p1

    .line 171
    .line 172
    check-cast v0, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v1, Lzj0;->α:Lzj0;

    .line 178
    .line 179
    invoke-static {v0}, Lzj0;->τ(Ljava/lang/reflect/Method;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_8
    move-object/from16 v0, p1

    .line 189
    .line 190
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v1, Lwj0;

    .line 196
    .line 197
    const/16 v2, 0xb

    .line 198
    .line 199
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 203
    .line 204
    .line 205
    return-object v4

    .line 206
    :pswitch_9
    move-object/from16 v0, p1

    .line 207
    .line 208
    check-cast v0, Ljava/lang/reflect/Method;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object v1, Lzj0;->α:Lzj0;

    .line 214
    .line 215
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0

    .line 220
    :pswitch_a
    move-object/from16 v0, p1

    .line 221
    .line 222
    check-cast v0, Ljava/lang/ClassLoader;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    sget-object v1, Lzj0;->α:Lzj0;

    .line 228
    .line 229
    invoke-static {v0}, Lzj0;->λ(Ljava/lang/ClassLoader;)V

    .line 230
    .line 231
    .line 232
    return-object v4

    .line 233
    :pswitch_b
    move-object/from16 v0, p1

    .line 234
    .line 235
    check-cast v0, Ljava/lang/ClassLoader;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance v1, Lqx;

    .line 241
    .line 242
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 243
    .line 244
    sget-object v2, Lkx;->ｊ:Lkx;

    .line 245
    .line 246
    invoke-static {v2, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    new-instance v3, Lr20;

    .line 251
    .line 252
    const/16 v4, 0x13

    .line 253
    .line 254
    invoke-direct {v3, v0, v4}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 255
    .line 256
    .line 257
    const-string v4, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u670d\u52a1\u5165\u53e3"

    .line 258
    .line 259
    invoke-direct {v1, v2, v4, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 260
    .line 261
    .line 262
    new-instance v2, Lqx;

    .line 263
    .line 264
    sget-object v3, Lkx;->ｋ:Lkx;

    .line 265
    .line 266
    invoke-static {v3, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    new-instance v4, Lr20;

    .line 271
    .line 272
    const/16 v5, 0x14

    .line 273
    .line 274
    invoke-direct {v4, v0, v5}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 275
    .line 276
    .line 277
    const-string v5, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6e05\u672a\u8bfb\u5165\u53e3"

    .line 278
    .line 279
    invoke-direct {v2, v3, v5, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 280
    .line 281
    .line 282
    new-instance v3, Lqx;

    .line 283
    .line 284
    sget-object v4, Lkx;->ｌ:Lkx;

    .line 285
    .line 286
    invoke-static {v4, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    new-instance v5, Lr20;

    .line 291
    .line 292
    const/16 v6, 0x15

    .line 293
    .line 294
    invoke-direct {v5, v0, v6}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 295
    .line 296
    .line 297
    const-string v6, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6570\u5b57\u6e05\u96f6\u5165\u53e3"

    .line 298
    .line 299
    invoke-direct {v3, v4, v6, v5}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 300
    .line 301
    .line 302
    new-instance v4, Lqx;

    .line 303
    .line 304
    sget-object v5, Lkx;->ｍ:Lkx;

    .line 305
    .line 306
    invoke-static {v5, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    new-instance v6, Lr20;

    .line 311
    .line 312
    const/16 v7, 0x11

    .line 313
    .line 314
    invoke-direct {v6, v0, v7}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 315
    .line 316
    .line 317
    const-string v7, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u672a\u8bfb\u5206\u7ec4\u5165\u53e3"

    .line 318
    .line 319
    invoke-direct {v4, v5, v7, v6}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 320
    .line 321
    .line 322
    new-instance v5, Lqx;

    .line 323
    .line 324
    sget-object v6, Lkx;->ц:Lkx;

    .line 325
    .line 326
    invoke-static {v6, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    new-instance v7, Lr20;

    .line 331
    .line 332
    const/16 v8, 0x12

    .line 333
    .line 334
    invoke-direct {v7, v0, v8}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 335
    .line 336
    .line 337
    const-string v0, "\u5b9a\u4f4d\u6d88\u606f\u5e95\u680f\u672a\u8bfb\u540c\u6b65\u5165\u53e3"

    .line 338
    .line 339
    invoke-direct {v5, v6, v0, v7}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 340
    .line 341
    .line 342
    filled-new-array {v1, v2, v3, v4, v5}, [Lqx;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    return-object v0

    .line 351
    :pswitch_c
    move-object/from16 v0, p1

    .line 352
    .line 353
    check-cast v0, Ljava/lang/reflect/Method;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    sget-object v1, Lzj0;->α:Lzj0;

    .line 359
    .line 360
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    return-object v0

    .line 365
    :pswitch_d
    move-object/from16 v0, p1

    .line 366
    .line 367
    check-cast v0, Ljava/lang/reflect/Method;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_1

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    array-length v0, v0

    .line 390
    if-nez v0, :cond_1

    .line 391
    .line 392
    move v5, v6

    .line 393
    :cond_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_e
    move-object/from16 v0, p1

    .line 399
    .line 400
    check-cast v0, Ljava/lang/reflect/Method;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    sget-object v1, Lzj0;->α:Lzj0;

    .line 406
    .line 407
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    return-object v0

    .line 412
    :pswitch_f
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Ljava/lang/reflect/Method;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    sget-object v1, Lzj0;->α:Lzj0;

    .line 420
    .line 421
    invoke-static {v0}, Lzj0;->σ(Ljava/lang/reflect/Method;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    return-object v0

    .line 430
    :pswitch_10
    move-object/from16 v0, p1

    .line 431
    .line 432
    check-cast v0, Ljava/lang/reflect/Method;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    sget-object v1, Lzj0;->α:Lzj0;

    .line 438
    .line 439
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    return-object v0

    .line 444
    :pswitch_11
    move-object/from16 v0, p1

    .line 445
    .line 446
    check-cast v0, Ljava/lang/reflect/Method;

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    xor-int/2addr v0, v6

    .line 460
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    return-object v0

    .line 465
    :pswitch_12
    move-object/from16 v0, p1

    .line 466
    .line 467
    check-cast v0, Ljava/lang/reflect/Method;

    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    sget-object v1, Lzj0;->α:Lzj0;

    .line 473
    .line 474
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    return-object v0

    .line 479
    :pswitch_13
    move-object/from16 v0, p1

    .line 480
    .line 481
    check-cast v0, Ljava/lang/reflect/Method;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    sget-object v1, Lzj0;->α:Lzj0;

    .line 487
    .line 488
    invoke-static {v0}, Lzj0;->τ(Ljava/lang/reflect/Method;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_14
    move-object/from16 v0, p1

    .line 498
    .line 499
    check-cast v0, Ljava/lang/Class;

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    return-object v0

    .line 506
    :pswitch_15
    move-object/from16 v0, p1

    .line 507
    .line 508
    check-cast v0, Ljava/lang/reflect/Method;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    if-eqz v2, :cond_2

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 532
    .line 533
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-eqz v0, :cond_2

    .line 538
    .line 539
    array-length v0, v1

    .line 540
    const/4 v2, 0x5

    .line 541
    if-ne v0, v2, :cond_2

    .line 542
    .line 543
    aget-object v0, v1, v6

    .line 544
    .line 545
    const-class v2, Ljava/lang/String;

    .line 546
    .line 547
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    if-eqz v0, :cond_2

    .line 552
    .line 553
    const/4 v0, 0x2

    .line 554
    aget-object v0, v1, v0

    .line 555
    .line 556
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 557
    .line 558
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_2

    .line 563
    .line 564
    const/4 v0, 0x3

    .line 565
    aget-object v0, v1, v0

    .line 566
    .line 567
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 568
    .line 569
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    if-eqz v0, :cond_2

    .line 574
    .line 575
    const/4 v0, 0x4

    .line 576
    aget-object v0, v1, v0

    .line 577
    .line 578
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_2

    .line 583
    .line 584
    move v5, v6

    .line 585
    :cond_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    return-object v0

    .line 590
    :pswitch_16
    move-object/from16 v0, p1

    .line 591
    .line 592
    check-cast v0, Ljava/lang/reflect/Method;

    .line 593
    .line 594
    invoke-static {v0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    invoke-static {v7, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v8

    .line 606
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v9

    .line 610
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    new-instance v10, Ljava/util/ArrayList;

    .line 614
    .line 615
    array-length v11, v9

    .line 616
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 617
    .line 618
    .line 619
    array-length v11, v9

    .line 620
    :goto_0
    if-ge v5, v11, :cond_3

    .line 621
    .line 622
    aget-object v12, v9, v5

    .line 623
    .line 624
    invoke-static {v12, v10, v5, v6}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 625
    .line 626
    .line 627
    move-result v5

    .line 628
    goto :goto_0

    .line 629
    :cond_3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 634
    .line 635
    .line 636
    const/4 v15, 0x0

    .line 637
    const/16 v16, 0x3e

    .line 638
    .line 639
    const-string v11, ","

    .line 640
    .line 641
    const/4 v12, 0x0

    .line 642
    const/4 v13, 0x0

    .line 643
    const/4 v14, 0x0

    .line 644
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-static {v4, v3, v7, v2, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v0, v1, v8}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    return-object v0

    .line 657
    :pswitch_17
    move-object/from16 v0, p1

    .line 658
    .line 659
    check-cast v0, Ld62;

    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    iget-object v0, v0, Ld62;->η:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v0, Ljava/lang/Number;

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    const/16 v1, 0x2ee0

    .line 673
    .line 674
    if-lt v0, v1, :cond_4

    .line 675
    .line 676
    move v5, v6

    .line 677
    :cond_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    return-object v0

    .line 682
    :pswitch_18
    move-object/from16 v0, p1

    .line 683
    .line 684
    check-cast v0, Ljava/lang/reflect/Method;

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    sget-object v1, Lvj0;->α:Lvj0;

    .line 690
    .line 691
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-static {v2}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    invoke-static {v1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    invoke-static {v2, v1}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    new-instance v2, Lfj0;

    .line 725
    .line 726
    const/4 v3, 0x6

    .line 727
    invoke-direct {v2, v3}, Lfj0;-><init>(I)V

    .line 728
    .line 729
    .line 730
    new-instance v3, Lbu;

    .line 731
    .line 732
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-direct {v3, v1, v2}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 737
    .line 738
    .line 739
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    if-nez v1, :cond_5

    .line 744
    .line 745
    sget-object v1, Ljz;->ε:Ljz;

    .line 746
    .line 747
    goto :goto_2

    .line 748
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    if-nez v2, :cond_6

    .line 757
    .line 758
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    goto :goto_2

    .line 763
    :cond_6
    invoke-static {v1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    if-eqz v2, :cond_7

    .line 772
    .line 773
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    goto :goto_1

    .line 781
    :cond_7
    :goto_2
    new-instance v2, Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    if-eqz v3, :cond_9

    .line 795
    .line 796
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    move-object v4, v3

    .line 801
    check-cast v4, Ljava/lang/reflect/Method;

    .line 802
    .line 803
    invoke-static {v4}, Lvj0;->θ(Ljava/lang/reflect/Method;)Z

    .line 804
    .line 805
    .line 806
    move-result v4

    .line 807
    if-eqz v4, :cond_8

    .line 808
    .line 809
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    goto :goto_3

    .line 813
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    const/4 v7, 0x0

    .line 822
    if-nez v1, :cond_a

    .line 823
    .line 824
    move-object v1, v7

    .line 825
    goto :goto_4

    .line 826
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    if-nez v2, :cond_b

    .line 835
    .line 836
    goto :goto_4

    .line 837
    :cond_b
    move-object v2, v1

    .line 838
    check-cast v2, Ljava/lang/reflect/Method;

    .line 839
    .line 840
    invoke-static {v2}, Lvj0;->υ(Ljava/lang/reflect/Method;)I

    .line 841
    .line 842
    .line 843
    move-result v2

    .line 844
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    move-object v6, v3

    .line 849
    check-cast v6, Ljava/lang/reflect/Method;

    .line 850
    .line 851
    invoke-static {v6}, Lvj0;->υ(Ljava/lang/reflect/Method;)I

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    if-ge v2, v6, :cond_d

    .line 856
    .line 857
    move-object v1, v3

    .line 858
    move v2, v6

    .line 859
    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    if-nez v3, :cond_c

    .line 864
    .line 865
    :goto_4
    check-cast v1, Ljava/lang/reflect/Method;

    .line 866
    .line 867
    if-nez v1, :cond_e

    .line 868
    .line 869
    goto :goto_6

    .line 870
    :cond_e
    new-instance v7, Ld62;

    .line 871
    .line 872
    invoke-static {v0}, Lvj0;->β(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    const-string v3, "/aweme/v1/notice/del/"

    .line 877
    .line 878
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 879
    .line 880
    .line 881
    move-result v3

    .line 882
    if-eqz v3, :cond_f

    .line 883
    .line 884
    const/16 v3, 0x1770

    .line 885
    .line 886
    goto :goto_5

    .line 887
    :cond_f
    move v3, v5

    .line 888
    :goto_5
    const-string v4, "notice_id"

    .line 889
    .line 890
    invoke-static {v2, v4, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    if-eqz v2, :cond_10

    .line 895
    .line 896
    add-int/lit16 v3, v3, 0xbb8

    .line 897
    .line 898
    :cond_10
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 903
    .line 904
    .line 905
    move-result v2

    .line 906
    if-eqz v2, :cond_11

    .line 907
    .line 908
    add-int/lit16 v3, v3, 0x7d0

    .line 909
    .line 910
    :cond_11
    invoke-static {v1}, Lvj0;->υ(Ljava/lang/reflect/Method;)I

    .line 911
    .line 912
    .line 913
    move-result v2

    .line 914
    add-int/2addr v2, v3

    .line 915
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-direct {v7, v0, v1, v2}, Ld62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    :goto_6
    return-object v7

    .line 923
    :pswitch_19
    move-object/from16 v0, p1

    .line 924
    .line 925
    check-cast v0, Ljava/lang/reflect/Method;

    .line 926
    .line 927
    invoke-static {v0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v7

    .line 935
    invoke-static {v7, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v8

    .line 939
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    move-result-object v9

    .line 943
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    new-instance v10, Ljava/util/ArrayList;

    .line 947
    .line 948
    array-length v11, v9

    .line 949
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 950
    .line 951
    .line 952
    array-length v11, v9

    .line 953
    :goto_7
    if-ge v5, v11, :cond_12

    .line 954
    .line 955
    aget-object v12, v9, v5

    .line 956
    .line 957
    invoke-static {v12, v10, v5, v6}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 958
    .line 959
    .line 960
    move-result v5

    .line 961
    goto :goto_7

    .line 962
    :cond_12
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 967
    .line 968
    .line 969
    const/4 v15, 0x0

    .line 970
    const/16 v16, 0x3e

    .line 971
    .line 972
    const-string v11, ","

    .line 973
    .line 974
    const/4 v12, 0x0

    .line 975
    const/4 v13, 0x0

    .line 976
    const/4 v14, 0x0

    .line 977
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-static {v4, v3, v7, v2, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    invoke-static {v0, v1, v8}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    return-object v0

    .line 990
    :pswitch_1a
    move-object/from16 v0, p1

    .line 991
    .line 992
    check-cast v0, Lxi0;

    .line 993
    .line 994
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0}, Lxi0;->α()Z

    .line 998
    .line 999
    .line 1000
    move-result v0

    .line 1001
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    return-object v0

    .line 1006
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1007
    .line 1008
    check-cast v0, Lxi0;

    .line 1009
    .line 1010
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v0}, Lxi0;->α()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    return-object v0

    .line 1022
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1023
    .line 1024
    check-cast v0, Lxi0;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    iget-object v0, v0, Lxi0;->α:Ljava/lang/String;

    .line 1030
    .line 1031
    return-object v0

    .line 1032
    nop

    .line 1033
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
