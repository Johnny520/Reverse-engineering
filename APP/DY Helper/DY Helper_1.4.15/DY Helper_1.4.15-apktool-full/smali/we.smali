.class public final synthetic Lwe;
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
    iput p1, p0, Lwe;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lkf;I)V
    .locals 0

    .line 7
    iput p2, p0, Lwe;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget p0, p0, Lwe;->ε:I

    .line 2
    .line 3
    const-string v0, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"

    .line 4
    .line 5
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Ls62;->α:Ls62;

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p0, Lgh;

    .line 21
    .line 22
    invoke-direct {p0, v4}, Lgh;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 26
    .line 27
    .line 28
    return-object v5

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "isPlaying"

    .line 36
    .line 37
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    array-length p0, p0

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-class p1, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    :cond_0
    move v3, v4

    .line 78
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sget-object p0, Lug;->α:Ltg;

    .line 96
    .line 97
    const-string p0, "PrefsManager"

    .line 98
    .line 99
    invoke-static {p1, p0}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v5

    .line 103
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object p0, Lug;->α:Ltg;

    .line 109
    .line 110
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 111
    .line 112
    new-instance p1, Ls0;

    .line 113
    .line 114
    invoke-direct {p1, v2}, Ls0;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    return-object v5

    .line 121
    :pswitch_4
    check-cast p1, Ljava/lang/Class;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_5
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-nez p0, :cond_2

    .line 138
    .line 139
    move v3, v4

    .line 140
    :cond_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_6
    check-cast p1, Lmq;

    .line 146
    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    iget-wide p0, p1, Lmq;->δ:J

    .line 150
    .line 151
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-nez p0, :cond_4

    .line 160
    .line 161
    :cond_3
    const-string p0, "none"

    .line 162
    .line 163
    :cond_4
    new-instance p1, Lea;

    .line 164
    .line 165
    invoke-direct {p1, p0, v4}, Lea;-><init>(Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    if-ne p0, v1, :cond_5

    .line 179
    .line 180
    invoke-virtual {p1}, Lea;->run()V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_5
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 185
    .line 186
    .line 187
    :goto_0
    return-object v5

    .line 188
    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance p0, Lwe;

    .line 194
    .line 195
    const/16 v0, 0xe

    .line 196
    .line 197
    invoke-direct {p0, v0}, Lwe;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 201
    .line 202
    .line 203
    return-object v5

    .line 204
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_6

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    array-length p0, p0

    .line 224
    if-nez p0, :cond_6

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    if-eqz p0, :cond_6

    .line 235
    .line 236
    move v3, v4

    .line 237
    :cond_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_9
    check-cast p1, Ljava/lang/ClassLoader;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    sget-object p0, Lug;->α:Ltg;

    .line 248
    .line 249
    invoke-static {p1}, Ltg;->Κ(Ljava/lang/ClassLoader;)V

    .line 250
    .line 251
    .line 252
    return-object v5

    .line 253
    :pswitch_a
    check-cast p1, Ljava/lang/ClassLoader;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance p0, Lqx;

    .line 259
    .line 260
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 261
    .line 262
    sget-object v0, Lkx;->Ｔ:Lkx;

    .line 263
    .line 264
    invoke-static {v0, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-instance v1, Lcb;

    .line 269
    .line 270
    const/16 v2, 0x9

    .line 271
    .line 272
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 273
    .line 274
    .line 275
    const-string p1, "\u5b9a\u4f4d\u6e05\u723d\u6a21\u5f0f\u5e95\u680f\u6742\u9879\u6ce8\u518c\u5668"

    .line 276
    .line 277
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 278
    .line 279
    .line 280
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    return-object p0

    .line 285
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    const-class p0, Landroid/view/View;

    .line 291
    .line 292
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 296
    .line 297
    .line 298
    return-object v5

    .line 299
    :pswitch_c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    new-instance p0, Lwe;

    .line 305
    .line 306
    const/16 v0, 0x11

    .line 307
    .line 308
    invoke-direct {p0, v0}, Lwe;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 312
    .line 313
    .line 314
    return-object v5

    .line 315
    :pswitch_d
    check-cast p1, Ljava/lang/Class;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    return-object p0

    .line 325
    :pswitch_e
    move-object v6, p1

    .line 326
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 327
    .line 328
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    const-string p0, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"

    .line 332
    .line 333
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    const/4 v10, 0x6

    .line 338
    const/4 v11, 0x0

    .line 339
    const/4 v8, 0x0

    .line 340
    const/4 v9, 0x0

    .line 341
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 342
    .line 343
    .line 344
    new-instance p0, Lwe;

    .line 345
    .line 346
    const/16 p1, 0x10

    .line 347
    .line 348
    invoke-direct {p0, p1}, Lwe;-><init>(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methods(La80;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 352
    .line 353
    .line 354
    return-object v5

    .line 355
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Field;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 362
    .line 363
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    if-nez p0, :cond_7

    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    const-class v0, Ljava/lang/Integer;

    .line 374
    .line 375
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    if-nez p0, :cond_7

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 386
    .line 387
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    if-nez p0, :cond_7

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    const-class p1, Ljava/lang/Long;

    .line 398
    .line 399
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-eqz p0, :cond_8

    .line 404
    .line 405
    :cond_7
    move v3, v4

    .line 406
    :cond_8
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    return-object p0

    .line 411
    :pswitch_10
    check-cast p1, Ljava/lang/reflect/Field;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 414
    .line 415
    .line 416
    move-result p0

    .line 417
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    xor-int/2addr p0, v4

    .line 422
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    return-object p0

    .line 427
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    const-string v0, "duration"

    .line 435
    .line 436
    invoke-static {p0, v0}, Lkf;->μ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result p0

    .line 440
    if-eqz p0, :cond_9

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    const-string p1, "LJIIIIZZ"

    .line 447
    .line 448
    invoke-static {p0, p1}, Lkf;->μ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    if-eqz p0, :cond_9

    .line 453
    .line 454
    move v3, v4

    .line 455
    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    return-object p0

    .line 460
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    invoke-static {p0}, Lkf;->κ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    if-eqz p1, :cond_a

    .line 472
    .line 473
    const-string p1, "getDuration"

    .line 474
    .line 475
    invoke-static {p0, p1}, Lkf;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    if-eqz p1, :cond_a

    .line 480
    .line 481
    const-string p1, "currentPosition"

    .line 482
    .line 483
    invoke-static {p0, p1}, Lkf;->ζ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    if-eqz p0, :cond_a

    .line 488
    .line 489
    move v3, v4

    .line 490
    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    return-object p0

    .line 495
    :pswitch_13
    check-cast p1, Ljava/lang/reflect/Method;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 501
    .line 502
    .line 503
    move-result p0

    .line 504
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    if-nez p0, :cond_c

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 515
    .line 516
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    if-eqz p0, :cond_c

    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    array-length p0, p0

    .line 527
    if-ne p0, v4, :cond_c

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    aget-object p0, p0, v3

    .line 534
    .line 535
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 536
    .line 537
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result p0

    .line 541
    if-nez p0, :cond_b

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    aget-object p0, p0, v3

    .line 548
    .line 549
    const-class p1, Ljava/lang/Float;

    .line 550
    .line 551
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result p0

    .line 555
    if-eqz p0, :cond_c

    .line 556
    .line 557
    :cond_b
    move v3, v4

    .line 558
    :cond_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    return-object p0

    .line 563
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    const-string p1, "~78E784A121CC4D4A76A82A6412191AC853CB05E0BEF16A4FCD52E9EDE594B1EB7A26029BA8545F3C7E30A101FAD966DF810DCD83CF069660D5377A43BED0508D947414BCADFE80D1D63722F51F5BE5BECF12C2F147A77F50B5412A90"

    .line 575
    .line 576
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result p0

    .line 584
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 585
    .line 586
    .line 587
    move-result-object p0

    .line 588
    return-object p0

    .line 589
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    sget-object p0, Lkf;->α:Lkf;

    .line 593
    .line 594
    invoke-static {p1}, Lkf;->ξ(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result p0

    .line 598
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    return-object p0

    .line 603
    :pswitch_16
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 604
    .line 605
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    const-string v11, "int"

    .line 613
    .line 614
    const/4 v12, 0x0

    .line 615
    const-string v7, "long"

    .line 616
    .line 617
    const-string v8, "boolean"

    .line 618
    .line 619
    const-string v9, "boolean"

    .line 620
    .line 621
    const-string v10, "boolean"

    .line 622
    .line 623
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 628
    .line 629
    .line 630
    return-object v5

    .line 631
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 632
    .line 633
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    new-instance p0, Lwe;

    .line 637
    .line 638
    const/4 v0, 0x6

    .line 639
    invoke-direct {p0, v0}, Lwe;-><init>(I)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 643
    .line 644
    .line 645
    return-object v5

    .line 646
    :pswitch_18
    check-cast p1, Ljava/lang/ClassLoader;

    .line 647
    .line 648
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    sget-object p0, Laf;->α:Laf;

    .line 652
    .line 653
    invoke-virtual {p0, p1}, Laf;->ε(Ljava/lang/ClassLoader;)V

    .line 654
    .line 655
    .line 656
    return-object v5

    .line 657
    :pswitch_19
    check-cast p1, Ljava/lang/ClassLoader;

    .line 658
    .line 659
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    new-instance p0, Lqx;

    .line 663
    .line 664
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 665
    .line 666
    sget-object v0, Lkx;->Ｅ:Lkx;

    .line 667
    .line 668
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    new-instance v1, Lcb;

    .line 673
    .line 674
    const/16 v2, 0x8

    .line 675
    .line 676
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 677
    .line 678
    .line 679
    const-string p1, "\u5b9a\u4f4d 39.3 \u53ca\u4ee5\u4e0a\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u81ea\u52a8\u8df3\u8fc7\u903b\u8f91"

    .line 680
    .line 681
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 682
    .line 683
    .line 684
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object p0

    .line 688
    return-object p0

    .line 689
    :pswitch_1a
    move-object v6, p1

    .line 690
    check-cast v6, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 691
    .line 692
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v7

    .line 699
    const/4 v10, 0x6

    .line 700
    const/4 v11, 0x0

    .line 701
    const/4 v8, 0x0

    .line 702
    const/4 v9, 0x0

    .line 703
    invoke-static/range {v6 .. v11}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 704
    .line 705
    .line 706
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    const-string v12, "int"

    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const-string v8, "long"

    .line 714
    .line 715
    const-string v9, "boolean"

    .line 716
    .line 717
    const-string v10, "boolean"

    .line 718
    .line 719
    const-string v11, "boolean"

    .line 720
    .line 721
    filled-new-array/range {v7 .. v13}, [Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 726
    .line 727
    .line 728
    return-object v5

    .line 729
    :pswitch_1b
    move-object v7, p1

    .line 730
    check-cast v7, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 731
    .line 732
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v8

    .line 739
    const/4 v11, 0x6

    .line 740
    const/4 v12, 0x0

    .line 741
    const/4 v9, 0x0

    .line 742
    const/4 v10, 0x0

    .line 743
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 744
    .line 745
    .line 746
    const-string p0, "enter_auto_skip_marketing_chapter"

    .line 747
    .line 748
    filled-new-array {p0}, [Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    invoke-virtual {v7, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 753
    .line 754
    .line 755
    return-object v5

    .line 756
    :pswitch_1c
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 757
    .line 758
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    new-instance p0, Lwe;

    .line 762
    .line 763
    const/4 v0, 0x2

    .line 764
    invoke-direct {p0, v0}, Lwe;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 768
    .line 769
    .line 770
    return-object v5

    .line 771
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
