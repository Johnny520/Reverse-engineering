.class public final synthetic Lwj0;
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
    iput p1, p0, Lwj0;->ε:I

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lwj0;->ε:I

    .line 4
    .line 5
    const-string v1, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"

    .line 6
    .line 7
    const-string v2, "int"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    sget-object v5, Ls62;->α:Ls62;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :pswitch_0
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_1
    move-object/from16 v0, p1

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_2
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, Ljava/lang/ClassLoader;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v1, Lcp0;->α:Ljava/util/Set;

    .line 60
    .line 61
    invoke-static {v0, v4}, Lcp0;->δ(Ljava/lang/ClassLoader;Z)V

    .line 62
    .line 63
    .line 64
    return-object v5

    .line 65
    :pswitch_3
    move-object/from16 v0, p1

    .line 66
    .line 67
    check-cast v0, Ljava/lang/ClassLoader;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v1, Lqx;

    .line 73
    .line 74
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 75
    .line 76
    sget-object v2, Lkx;->ｘ:Lkx;

    .line 77
    .line 78
    invoke-static {v2, v0}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v3, Lr20;

    .line 83
    .line 84
    const/16 v4, 0x17

    .line 85
    .line 86
    invoke-direct {v3, v0, v4}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 87
    .line 88
    .line 89
    const-string v0, "\u5b9a\u4f4d\u5168\u5c4f\u89c2\u770b\u5165\u53e3\u6a21\u5757"

    .line 90
    .line 91
    invoke-direct {v1, v2, v0, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_4
    move-object/from16 v0, p1

    .line 100
    .line 101
    check-cast v0, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_5
    move-object/from16 v0, p1

    .line 115
    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    sget-object v1, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    const/16 v2, 0x2a

    .line 128
    .line 129
    if-eq v1, v2, :cond_2

    .line 130
    .line 131
    const v2, 0x620fb24c

    .line 132
    .line 133
    .line 134
    if-eq v1, v2, :cond_1

    .line 135
    .line 136
    const v2, 0x6ec6276e

    .line 137
    .line 138
    .line 139
    if-eq v1, v2, :cond_0

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_0
    const-string v1, "immersive_navigation_bar_enabled"

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    const-string v1, "immersive_status_bar_enabled"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_3

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    const-string v1, "*"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    :cond_3
    sget-object v0, Lil0;->β:Ljava/util/Set;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    check-cast v0, Ljava/lang/Iterable;

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_4

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Landroid/app/Activity;

    .line 190
    .line 191
    sget-object v2, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 192
    .line 193
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-static {v1}, Lil0;->α(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_4
    :goto_1
    return-object v5

    .line 201
    :pswitch_6
    move-object/from16 v0, p1

    .line 202
    .line 203
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-nez v0, :cond_5

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    move v3, v4

    .line 213
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_7
    move-object/from16 v0, p1

    .line 219
    .line 220
    check-cast v0, Lbh1;

    .line 221
    .line 222
    return-object v5

    .line 223
    :pswitch_8
    move-object/from16 v6, p1

    .line 224
    .line 225
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    const/4 v10, 0x6

    .line 231
    const/4 v11, 0x0

    .line 232
    const-string v7, "long"

    .line 233
    .line 234
    const/4 v8, 0x0

    .line 235
    const/4 v9, 0x0

    .line 236
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 237
    .line 238
    .line 239
    sget-object v0, Lbk0;->ι:Ljava/lang/String;

    .line 240
    .line 241
    const/4 v1, 0x0

    .line 242
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v6, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 247
    .line 248
    .line 249
    return-object v5

    .line 250
    :pswitch_9
    move-object/from16 v0, p1

    .line 251
    .line 252
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v1, Lwj0;

    .line 258
    .line 259
    const/16 v2, 0x14

    .line 260
    .line 261
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 265
    .line 266
    .line 267
    return-object v5

    .line 268
    :pswitch_a
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, Ljava/lang/Class;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0

    .line 277
    :pswitch_b
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
    invoke-static {v0}, Lbk0;->γ(Ljava/lang/ClassLoader;)V

    .line 285
    .line 286
    .line 287
    return-object v5

    .line 288
    :pswitch_c
    move-object/from16 v0, p1

    .line 289
    .line 290
    check-cast v0, Ljava/lang/ClassLoader;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    new-instance v1, Lqx;

    .line 296
    .line 297
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 298
    .line 299
    sget-object v2, Lkx;->ｑ:Lkx;

    .line 300
    .line 301
    invoke-static {v2, v0}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    new-instance v3, Lr20;

    .line 306
    .line 307
    const/16 v4, 0x16

    .line 308
    .line 309
    invoke-direct {v3, v0, v4}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 310
    .line 311
    .line 312
    const-string v0, "\u5b9a\u4f4d\u79c1\u4fe1\u72b6\u6001\u4e0a\u62a5\u53d1\u9001\u5165\u53e3"

    .line 313
    .line 314
    invoke-direct {v1, v2, v0, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    return-object v0

    .line 322
    :pswitch_d
    move-object/from16 v0, p1

    .line 323
    .line 324
    check-cast v0, Ljava/lang/reflect/Method;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_7

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, Lx;->ω(Ljava/lang/Class;)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_6

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_6
    move v3, v4

    .line 354
    :cond_7
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :pswitch_e
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, Ljava/lang/reflect/Method;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    sget-object v1, Lzj0;->α:Lzj0;

    .line 367
    .line 368
    invoke-static {v0}, Lzj0;->σ(Ljava/lang/reflect/Method;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    return-object v0

    .line 377
    :pswitch_f
    move-object/from16 v0, p1

    .line 378
    .line 379
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    new-instance v1, Lwj0;

    .line 385
    .line 386
    const/16 v2, 0x8

    .line 387
    .line 388
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 392
    .line 393
    .line 394
    return-object v5

    .line 395
    :pswitch_10
    move-object/from16 v6, p1

    .line 396
    .line 397
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 398
    .line 399
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    const-string v0, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"

    .line 403
    .line 404
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    const/4 v10, 0x6

    .line 409
    const/4 v11, 0x0

    .line 410
    const/4 v8, 0x0

    .line 411
    const/4 v9, 0x0

    .line 412
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 413
    .line 414
    .line 415
    const-string v7, "void"

    .line 416
    .line 417
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 418
    .line 419
    .line 420
    const-string v11, "long"

    .line 421
    .line 422
    const-string v12, "boolean"

    .line 423
    .line 424
    const-string v7, "int"

    .line 425
    .line 426
    const-string v8, "int"

    .line 427
    .line 428
    const-string v9, "int"

    .line 429
    .line 430
    const-string v10, "int"

    .line 431
    .line 432
    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v6, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 437
    .line 438
    .line 439
    return-object v5

    .line 440
    :pswitch_11
    move-object/from16 v7, p1

    .line 441
    .line 442
    check-cast v7, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 443
    .line 444
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    const/4 v11, 0x6

    .line 448
    const/4 v12, 0x0

    .line 449
    const-string v8, "java.util.Map"

    .line 450
    .line 451
    const/4 v9, 0x0

    .line 452
    const/4 v10, 0x0

    .line 453
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 454
    .line 455
    .line 456
    return-object v5

    .line 457
    :pswitch_12
    move-object/from16 v13, p1

    .line 458
    .line 459
    check-cast v13, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 460
    .line 461
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    const/16 v17, 0x6

    .line 465
    .line 466
    const/16 v18, 0x0

    .line 467
    .line 468
    const-string v14, "void"

    .line 469
    .line 470
    const/4 v15, 0x0

    .line 471
    const/16 v16, 0x0

    .line 472
    .line 473
    invoke-static/range {v13 .. v18}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 474
    .line 475
    .line 476
    const-string v10, "long"

    .line 477
    .line 478
    const-string v11, "boolean"

    .line 479
    .line 480
    const-string v6, "int"

    .line 481
    .line 482
    const-string v7, "int"

    .line 483
    .line 484
    const-string v8, "int"

    .line 485
    .line 486
    const-string v9, "int"

    .line 487
    .line 488
    filled-new-array/range {v6 .. v11}, [Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v13, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 493
    .line 494
    .line 495
    return-object v5

    .line 496
    :pswitch_13
    move-object/from16 v6, p1

    .line 497
    .line 498
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 499
    .line 500
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    const/4 v10, 0x6

    .line 508
    const/4 v11, 0x0

    .line 509
    const/4 v8, 0x0

    .line 510
    const/4 v9, 0x0

    .line 511
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 512
    .line 513
    .line 514
    return-object v5

    .line 515
    :pswitch_14
    move-object/from16 v12, p1

    .line 516
    .line 517
    check-cast v12, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 518
    .line 519
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    const/16 v16, 0x6

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const-string v13, "void"

    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x0

    .line 530
    invoke-static/range {v12 .. v17}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 531
    .line 532
    .line 533
    const-string v0, "boolean"

    .line 534
    .line 535
    filled-new-array {v2, v2, v0}, [Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {v12, v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 540
    .line 541
    .line 542
    return-object v5

    .line 543
    :pswitch_15
    move-object/from16 v0, p1

    .line 544
    .line 545
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v1, Lfj0;

    .line 551
    .line 552
    const/16 v2, 0x1d

    .line 553
    .line 554
    invoke-direct {v1, v2}, Lfj0;-><init>(I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 558
    .line 559
    .line 560
    return-object v5

    .line 561
    :pswitch_16
    move-object/from16 v0, p1

    .line 562
    .line 563
    check-cast v0, Ljava/lang/reflect/Method;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    sget-object v1, Lzj0;->α:Lzj0;

    .line 569
    .line 570
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    return-object v0

    .line 575
    :pswitch_17
    move-object/from16 v0, p1

    .line 576
    .line 577
    check-cast v0, Ljava/lang/reflect/Method;

    .line 578
    .line 579
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    sget-object v1, Lzj0;->α:Lzj0;

    .line 583
    .line 584
    invoke-static {v1, v0}, Lzj0;->α(Lzj0;Ljava/lang/reflect/Method;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    return-object v0

    .line 593
    :pswitch_18
    move-object/from16 v0, p1

    .line 594
    .line 595
    check-cast v0, Ljava/lang/reflect/Method;

    .line 596
    .line 597
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    sget-object v1, Lzj0;->α:Lzj0;

    .line 601
    .line 602
    invoke-static {v0}, Lzj0;->Δ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    return-object v0

    .line 607
    :pswitch_19
    move-object/from16 v0, p1

    .line 608
    .line 609
    check-cast v0, Ljava/lang/reflect/Method;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-nez v2, :cond_a

    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    if-eqz v1, :cond_8

    .line 652
    .line 653
    move v0, v3

    .line 654
    goto :goto_4

    .line 655
    :cond_8
    invoke-static {v0}, Lx;->ω(Ljava/lang/Class;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    :goto_4
    if-eqz v0, :cond_9

    .line 660
    .line 661
    goto :goto_5

    .line 662
    :cond_9
    move v3, v4

    .line 663
    :cond_a
    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    return-object v0

    .line 668
    :pswitch_1a
    move-object/from16 v0, p1

    .line 669
    .line 670
    check-cast v0, Ljava/lang/reflect/Method;

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    array-length v0, v0

    .line 683
    if-nez v0, :cond_b

    .line 684
    .line 685
    goto :goto_6

    .line 686
    :cond_b
    move v3, v4

    .line 687
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    return-object v0

    .line 692
    :pswitch_1b
    move-object/from16 v0, p1

    .line 693
    .line 694
    check-cast v0, Ljava/lang/reflect/Method;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    return-object v0

    .line 712
    :pswitch_1c
    move-object/from16 v0, p1

    .line 713
    .line 714
    check-cast v0, Lorg/luckypray/dexkit/query/FindMethod;

    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    new-instance v1, Lwj0;

    .line 720
    .line 721
    const/16 v2, 0x9

    .line 722
    .line 723
    invoke-direct {v1, v2}, Lwj0;-><init>(I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 727
    .line 728
    .line 729
    return-object v5

    .line 730
    nop

    .line 731
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
