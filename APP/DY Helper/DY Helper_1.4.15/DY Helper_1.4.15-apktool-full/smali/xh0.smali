.class public final synthetic Lxh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic η:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxh0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput-object p2, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lxh0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 15
    .line 16
    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v2, "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"

    .line 21
    .line 22
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v7, 0x6

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    const/4 v13, 0x6

    .line 35
    const/4 v14, 0x0

    .line 36
    const-string v10, "void"

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    invoke-static/range {v9 .. v14}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p0, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 74
    .line 75
    :try_start_0
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    new-instance v3, Leo1;

    .line 82
    .line 83
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object v0, v3

    .line 87
    :goto_1
    instance-of v3, v0, Leo1;

    .line 88
    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    :cond_1
    check-cast v0, Ljava/lang/reflect/Method;

    .line 93
    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    return-object v2

    .line 101
    :pswitch_0
    iget-object v1, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 102
    .line 103
    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 104
    .line 105
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 110
    .line 111
    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v2, "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"

    .line 116
    .line 117
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const/4 v7, 0x6

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    const/4 v13, 0x6

    .line 130
    const/4 v14, 0x0

    .line 131
    const-string v10, "void"

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    invoke-static/range {v9 .. v14}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const-string v3, "java.lang.String"

    .line 140
    .line 141
    const-string v4, "boolean"

    .line 142
    .line 143
    const-string v5, "long"

    .line 144
    .line 145
    filled-new-array {v5, v3, v3, v4}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget-object p0, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    new-instance v2, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 183
    .line 184
    :try_start_1
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 188
    goto :goto_3

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    new-instance v3, Leo1;

    .line 191
    .line 192
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    move-object v0, v3

    .line 196
    :goto_3
    instance-of v3, v0, Leo1;

    .line 197
    .line 198
    if-eqz v3, :cond_4

    .line 199
    .line 200
    const/4 v0, 0x0

    .line 201
    :cond_4
    check-cast v0, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    if-eqz v0, :cond_3

    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    return-object v2

    .line 210
    :pswitch_1
    new-instance v0, Lsh0;

    .line 211
    .line 212
    const/16 v1, 0xa

    .line 213
    .line 214
    invoke-direct {v0, v1}, Lsh0;-><init>(I)V

    .line 215
    .line 216
    .line 217
    iget-object v1, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-eqz v2, :cond_7

    .line 237
    .line 238
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 243
    .line 244
    iget-object v3, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 245
    .line 246
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    if-eqz v2, :cond_6

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_7
    return-object v1

    .line 257
    :pswitch_2
    new-instance v0, Lsh0;

    .line 258
    .line 259
    const/16 v1, 0x9

    .line 260
    .line 261
    invoke-direct {v0, v1}, Lsh0;-><init>(I)V

    .line 262
    .line 263
    .line 264
    iget-object v1, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 265
    .line 266
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v1, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_9

    .line 284
    .line 285
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 290
    .line 291
    iget-object v3, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 292
    .line 293
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    if-eqz v2, :cond_8

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_9
    return-object v1

    .line 304
    :pswitch_3
    new-instance v0, Lsh0;

    .line 305
    .line 306
    const/16 v1, 0x8

    .line 307
    .line 308
    invoke-direct {v0, v1}, Lsh0;-><init>(I)V

    .line 309
    .line 310
    .line 311
    iget-object v1, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 312
    .line 313
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v1, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :cond_a
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_b

    .line 331
    .line 332
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 337
    .line 338
    iget-object v3, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 339
    .line 340
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    if-eqz v2, :cond_a

    .line 345
    .line 346
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_b
    return-object v1

    .line 351
    :pswitch_4
    new-instance v0, Lsh0;

    .line 352
    .line 353
    const/16 v1, 0xb

    .line 354
    .line 355
    invoke-direct {v0, v1}, Lsh0;-><init>(I)V

    .line 356
    .line 357
    .line 358
    iget-object v1, p0, Lxh0;->ζ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 359
    .line 360
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v1, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_d

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 384
    .line 385
    iget-object v3, p0, Lxh0;->η:Ljava/lang/ClassLoader;

    .line 386
    .line 387
    invoke-virtual {v2, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    if-eqz v2, :cond_c

    .line 392
    .line 393
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_d
    return-object v1

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
