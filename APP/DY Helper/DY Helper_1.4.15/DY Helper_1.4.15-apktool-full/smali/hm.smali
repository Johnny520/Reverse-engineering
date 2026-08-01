.class public final synthetic Lhm;
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
    iput p1, p0, Lhm;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljm;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lhm;->ε:I

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lhm;->ε:I

    .line 4
    .line 5
    const-string v1, "\u672a\u626b\u63cf\u5230\uff1a"

    .line 6
    .line 7
    const-string v2, "db"

    .line 8
    .line 9
    const-string v3, "cache"

    .line 10
    .line 11
    const-string v4, "kotlin.jvm.functions.Function1"

    .line 12
    .line 13
    const-string v5, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E48552B876304A031F6E953731E44C09B5A86"

    .line 14
    .line 15
    const-string v6, "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"

    .line 16
    .line 17
    const-string v7, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E485537B953059726D5F9466F197DD5864992"

    .line 18
    .line 19
    const/16 v8, 0xa

    .line 20
    .line 21
    sget-object v9, Ls62;->α:Ls62;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, Ljava/lang/ClassLoader;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v1, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    sget-object v1, Lr00;->ι:Lrz;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v2, Lτ;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lτ;-><init>(Lχ;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v2}, Lτ;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Lτ;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lr00;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static {v1, v0, v3}, Ls00;->δ(Lr00;Ljava/lang/ClassLoader;Z)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-object v9

    .line 63
    :pswitch_0
    move-object/from16 v0, p1

    .line 64
    .line 65
    check-cast v0, Ljava/lang/ClassLoader;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v1, Lr00;->ι:Lrz;

    .line 71
    .line 72
    new-instance v2, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v1, v8}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lχ;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lr00;

    .line 96
    .line 97
    new-instance v4, Lqx;

    .line 98
    .line 99
    sget-object v5, Lox;->α:Ljava/lang/Object;

    .line 100
    .line 101
    iget-object v5, v3, Lr00;->ε:Lkx;

    .line 102
    .line 103
    invoke-static {v5, v0}, Lox;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iget-object v6, v3, Lr00;->ε:Lkx;

    .line 108
    .line 109
    iget-object v6, v6, Lkx;->ζ:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v7, Lp3;

    .line 112
    .line 113
    const/4 v8, 0x6

    .line 114
    invoke-direct {v7, v3, v8, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v4, v5, v6, v7}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    return-object v2

    .line 125
    :pswitch_1
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, Ljava/lang/Class;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :pswitch_2
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const/4 v5, 0x6

    .line 142
    const/4 v6, 0x0

    .line 143
    const-string v2, "boolean"

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v4, 0x0

    .line 147
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 148
    .line 149
    .line 150
    const-string v0, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 151
    .line 152
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v2, "java.lang.String"

    .line 157
    .line 158
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 163
    .line 164
    .line 165
    return-object v9

    .line 166
    :pswitch_3
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v1, Lhm;

    .line 174
    .line 175
    const/16 v2, 0x1a

    .line 176
    .line 177
    invoke-direct {v1, v2}, Lhm;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 181
    .line 182
    .line 183
    return-object v9

    .line 184
    :pswitch_4
    move-object/from16 v0, p1

    .line 185
    .line 186
    check-cast v0, Ljava/lang/ClassLoader;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v1, Lqx;

    .line 192
    .line 193
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 194
    .line 195
    sget-object v2, Lkx;->Х:Lkx;

    .line 196
    .line 197
    invoke-static {v2, v0}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    new-instance v3, Lcb;

    .line 202
    .line 203
    const/16 v4, 0x19

    .line 204
    .line 205
    invoke-direct {v3, v0, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 206
    .line 207
    .line 208
    const-string v0, "\u5b9a\u4f4d\u957f\u6309\u9762\u677f\u5e7f\u544a\u5224\u65ad\u7c7b"

    .line 209
    .line 210
    invoke-direct {v1, v2, v0, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_5
    move-object/from16 v0, p1

    .line 219
    .line 220
    check-cast v0, Lqx;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v0, v0, Lqx;->α:Ljava/lang/String;

    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_6
    move-object/from16 v0, p1

    .line 229
    .line 230
    check-cast v0, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Lku;->γ(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0

    .line 240
    :pswitch_7
    move-object/from16 v0, p1

    .line 241
    .line 242
    check-cast v0, Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, Lln0;->Ω(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :pswitch_8
    move-object/from16 v0, p1

    .line 253
    .line 254
    check-cast v0, Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {v0}, Lln0;->Ω(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :pswitch_9
    move-object/from16 v0, p1

    .line 265
    .line 266
    check-cast v0, Ljava/lang/ClassLoader;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    sget-object v1, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 272
    .line 273
    invoke-static {v0}, Leu;->α(Ljava/lang/ClassLoader;)V

    .line 274
    .line 275
    .line 276
    return-object v9

    .line 277
    :pswitch_a
    move-object/from16 v0, p1

    .line 278
    .line 279
    check-cast v0, Ljava/lang/ClassLoader;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    sget-object v0, Ljz;->ε:Ljz;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_b
    move-object/from16 v0, p1

    .line 288
    .line 289
    check-cast v0, Ljava/lang/Class;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :pswitch_c
    move-object/from16 v0, p1

    .line 297
    .line 298
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance v1, Lhm;

    .line 304
    .line 305
    invoke-direct {v1, v8}, Lhm;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 309
    .line 310
    .line 311
    return-object v9

    .line 312
    :pswitch_d
    move-object/from16 v0, p1

    .line 313
    .line 314
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v1, Lhm;

    .line 320
    .line 321
    const/16 v2, 0x9

    .line 322
    .line 323
    invoke-direct {v1, v2}, Lhm;-><init>(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 327
    .line 328
    .line 329
    return-object v9

    .line 330
    :pswitch_e
    move-object/from16 v0, p1

    .line 331
    .line 332
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance v1, Lhm;

    .line 338
    .line 339
    const/16 v2, 0xb

    .line 340
    .line 341
    invoke-direct {v1, v2}, Lhm;-><init>(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 345
    .line 346
    .line 347
    return-object v9

    .line 348
    :pswitch_f
    move-object/from16 v0, p1

    .line 349
    .line 350
    check-cast v0, Ljava/lang/ClassLoader;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object v1, Lst;->α:Lst;

    .line 356
    .line 357
    invoke-virtual {v1, v0}, Lst;->σ(Ljava/lang/ClassLoader;)V

    .line 358
    .line 359
    .line 360
    return-object v9

    .line 361
    :pswitch_10
    move-object/from16 v0, p1

    .line 362
    .line 363
    check-cast v0, Ljava/lang/ClassLoader;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v1, Lqx;

    .line 369
    .line 370
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 371
    .line 372
    sget-object v2, Lkx;->ｖ:Lkx;

    .line 373
    .line 374
    invoke-static {v2, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    new-instance v3, Lcb;

    .line 379
    .line 380
    const/16 v4, 0x18

    .line 381
    .line 382
    invoke-direct {v3, v0, v4}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 383
    .line 384
    .line 385
    const-string v0, "\u5b9a\u4f4d IM \u7528\u6237\u663e\u793a\u540d\u65b9\u6cd5"

    .line 386
    .line 387
    invoke-direct {v1, v2, v0, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    return-object v0

    .line 395
    :pswitch_11
    move-object/from16 v10, p1

    .line 396
    .line 397
    check-cast v10, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 398
    .line 399
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    const/4 v14, 0x6

    .line 407
    const/4 v15, 0x0

    .line 408
    const/4 v12, 0x0

    .line 409
    const/4 v13, 0x0

    .line 410
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 411
    .line 412
    .line 413
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 418
    .line 419
    .line 420
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v10, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 429
    .line 430
    .line 431
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v10, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 436
    .line 437
    .line 438
    return-object v9

    .line 439
    :pswitch_12
    move-object/from16 v0, p1

    .line 440
    .line 441
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 451
    .line 452
    .line 453
    return-object v9

    .line 454
    :pswitch_13
    move-object/from16 v10, p1

    .line 455
    .line 456
    check-cast v10, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 457
    .line 458
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v11

    .line 465
    const/4 v14, 0x6

    .line 466
    const/4 v15, 0x0

    .line 467
    const/4 v12, 0x0

    .line 468
    const/4 v13, 0x0

    .line 469
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 470
    .line 471
    .line 472
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v11

    .line 476
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 477
    .line 478
    .line 479
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v10, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 488
    .line 489
    .line 490
    return-object v9

    .line 491
    :pswitch_14
    move-object/from16 v0, p1

    .line 492
    .line 493
    check-cast v0, Ljava/lang/String;

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :pswitch_15
    move-object/from16 v0, p1

    .line 504
    .line 505
    check-cast v0, Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    return-object v0

    .line 515
    :pswitch_16
    move-object/from16 v0, p1

    .line 516
    .line 517
    check-cast v0, Lsp;

    .line 518
    .line 519
    instance-of v1, v0, Lkotlinx/coroutines/α;

    .line 520
    .line 521
    if-eqz v1, :cond_2

    .line 522
    .line 523
    check-cast v0, Lkotlinx/coroutines/α;

    .line 524
    .line 525
    goto :goto_2

    .line 526
    :cond_2
    const/4 v0, 0x0

    .line 527
    :goto_2
    return-object v0

    .line 528
    :pswitch_17
    move-object/from16 v0, p1

    .line 529
    .line 530
    check-cast v0, Ljava/lang/reflect/Field;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    return-object v0

    .line 537
    :pswitch_18
    move-object/from16 v0, p1

    .line 538
    .line 539
    check-cast v0, Ljava/lang/reflect/Field;

    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    return-object v0

    .line 554
    :pswitch_19
    move-object/from16 v1, p1

    .line 555
    .line 556
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    const-string v0, "~78EB30D04CD080004957FDC2BBA11C8B895E0C2FF698A046BB51347798C259FB7B1F17A5A14F21E167290B72F04A0A7066529DFB937E71DBC9C4F0D7BE9DE7F277D9B8F87E84143F46CEAA91F5DA9FC73B62C3512CD957AFFFA005833B1204"

    .line 562
    .line 563
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/4 v5, 0x6

    .line 568
    const/4 v6, 0x0

    .line 569
    const/4 v3, 0x0

    .line 570
    const/4 v4, 0x0

    .line 571
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 572
    .line 573
    .line 574
    const-string v2, "void"

    .line 575
    .line 576
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 577
    .line 578
    .line 579
    const-string v0, "android.view.View"

    .line 580
    .line 581
    filled-new-array {v0}, [Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 586
    .line 587
    .line 588
    return-object v9

    .line 589
    :pswitch_1a
    move-object/from16 v0, p1

    .line 590
    .line 591
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    new-instance v1, Lhm;

    .line 597
    .line 598
    const/4 v2, 0x3

    .line 599
    invoke-direct {v1, v2}, Lhm;-><init>(I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 603
    .line 604
    .line 605
    return-object v9

    .line 606
    :pswitch_1b
    move-object/from16 v0, p1

    .line 607
    .line 608
    check-cast v0, Ljava/lang/reflect/Field;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    const-class v1, Landroid/widget/FrameLayout;

    .line 615
    .line 616
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    return-object v0

    .line 625
    :pswitch_1c
    move-object/from16 v0, p1

    .line 626
    .line 627
    check-cast v0, Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    const-string v1, "*"

    .line 633
    .line 634
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-nez v1, :cond_3

    .line 639
    .line 640
    const-string v1, "hide_comment_search_entry_enabled"

    .line 641
    .line 642
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-eqz v0, :cond_4

    .line 647
    .line 648
    :cond_3
    invoke-static {}, Ljm;->η()Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-nez v0, :cond_4

    .line 653
    .line 654
    invoke-static {}, Ljm;->κ()V

    .line 655
    .line 656
    .line 657
    :cond_4
    return-object v9

    .line 658
    nop

    .line 659
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
