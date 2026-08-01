.class public final synthetic Lt20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt20;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput p3, p0, Lt20;->ε:I

    iput-object p1, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Luv0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    const-string v2, "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A221312F42CA326BDF84B464FE4832D738AC40A470FA237C08CA8228174BCD0BE11003D6A14F53CEC1BDE7E952FC87873CAAC51D93E24B25B15D"

    .line 17
    .line 18
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    new-instance v3, Leo1;

    .line 29
    .line 30
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object v2, v3

    .line 34
    :goto_0
    instance-of v3, v2, Leo1;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    move-object v2, v4

    .line 40
    :cond_0
    check-cast v2, Ljava/lang/Class;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    :cond_1
    move-object v1, v4

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Lss1;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/4 v6, 0x2

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v5}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    const/4 v8, 0x3

    .line 91
    if-ne v7, v8, :cond_3

    .line 92
    .line 93
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const-class v8, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-nez v7, :cond_3

    .line 104
    .line 105
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-nez v7, :cond_3

    .line 114
    .line 115
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Ljava/lang/Class;

    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    move-object v5, v4

    .line 129
    :goto_1
    if-eqz v5, :cond_1

    .line 130
    .line 131
    new-instance v1, Ltv0;

    .line 132
    .line 133
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Ljava/lang/Class;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, Ljava/lang/Class;

    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-direct {v1, v2, v5}, Ltv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    if-nez v1, :cond_5

    .line 157
    .line 158
    sget-object p0, Ljz;->ε:Ljz;

    .line 159
    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :cond_5
    :try_start_1
    new-instance v2, Lrv0;

    .line 163
    .line 164
    invoke-direct {v2, v1, v3}, Lrv0;-><init>(Ltv0;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 168
    .line 169
    .line 170
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    goto :goto_3

    .line 172
    :catchall_1
    move-exception p1

    .line 173
    new-instance v2, Leo1;

    .line 174
    .line 175
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    move-object p1, v2

    .line 179
    :goto_3
    instance-of v2, p1, Leo1;

    .line 180
    .line 181
    if-eqz v2, :cond_6

    .line 182
    .line 183
    move-object p1, v4

    .line 184
    :cond_6
    check-cast p1, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 185
    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_8

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 203
    .line 204
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    if-eqz v2, :cond_7

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_8
    new-instance p0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :cond_9
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_a

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    move-object v5, v2

    .line 234
    check-cast v5, Ljava/lang/reflect/Method;

    .line 235
    .line 236
    invoke-static {v5, v1}, Luv0;->γ(Ljava/lang/reflect/Method;Ltv0;)I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    const/16 v6, 0xbb8

    .line 241
    .line 242
    if-lt v5, v6, :cond_9

    .line 243
    .line 244
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_a
    new-instance p1, Lye;

    .line 249
    .line 250
    const/16 v2, 0x1a

    .line 251
    .line 252
    invoke-direct {p1, v2, v1}, Lye;-><init>(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_b

    .line 268
    .line 269
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Ljava/lang/reflect/Method;

    .line 274
    .line 275
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_b
    new-instance p1, Ljava/util/HashSet;

    .line 280
    .line 281
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 282
    .line 283
    .line 284
    new-instance v1, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    :cond_c
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_d

    .line 298
    .line 299
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    move-object v3, v2

    .line 304
    check-cast v3, Ljava/lang/reflect/Method;

    .line 305
    .line 306
    invoke-static {v3}, Luv0;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_c

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    const-string v0, "comment DexKit candidates="

    .line 329
    .line 330
    const-string v2, ", matched="

    .line 331
    .line 332
    invoke-static {p0, p1, v0, v2}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    const/4 p1, 0x4

    .line 337
    const-string v0, "rf5644a5272eb2eef"

    .line 338
    .line 339
    invoke-static {v0, p0, v4, p1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    move-object p0, v1

    .line 343
    :goto_8
    return-object p0
.end method

.method private final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    sget-object v0, Ll41;->α:Ll41;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Lsv0;

    .line 9
    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lsv0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    .line 39
    .line 40
    iget-object v2, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-static {v1, v2}, Ll41;->ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v1, v0

    .line 72
    check-cast v1, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-static {v1}, Ll41;->η(Ljava/lang/reflect/Method;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-object p0
.end method

.method private final δ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll41;->α:Ll41;

    .line 7
    .line 8
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, Ll41;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sget-object v4, Ll41;->ε:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string v0, "\u8c03\u6574\u7f13\u5b58\u4e0a\u9650"

    .line 59
    .line 60
    const-string v2, "\u5c06\u6e05\u7a7a\u5df2\u6709\u7f13\u5b58"

    .line 61
    .line 62
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p1, p0, v0}, Ll41;->γ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v2, v0

    .line 90
    check-cast v2, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-static {v2}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "offlinemode"

    .line 107
    .line 108
    const/4 v4, 0x1

    .line 109
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-static {v1, p1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method

.method private final ζ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll41;->α:Ll41;

    .line 7
    .line 8
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, Ll41;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sget-object v2, Ll41;->ζ:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-object p1
.end method

.method private final η(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll41;->α:Ll41;

    .line 7
    .line 8
    const-string v0, "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, Ll41;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sget-object v4, Ll41;->δ:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-string v0, "setCacheCount, mPbSize = "

    .line 59
    .line 60
    filled-new-array {v0}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p1, p0, v0}, Ll41;->γ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v2, v0

    .line 88
    check-cast v2, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    invoke-static {v2}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "offlinemode"

    .line 105
    .line 106
    const/4 v4, 0x1

    .line 107
    invoke-static {v2, v3, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_2

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    invoke-static {v1, p1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method

.method private final θ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    sget-object v0, Ll41;->α:Ll41;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Lsv0;

    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lsv0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    .line 39
    .line 40
    iget-object v2, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-static {v1, v2}, Ll41;->ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v1, v0

    .line 72
    check-cast v1, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-static {v1}, Ll41;->θ(Ljava/lang/reflect/Method;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-object p0
.end method

.method private final ι(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    sget-object v0, Ll41;->α:Ll41;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Lsv0;

    .line 9
    .line 10
    const/16 v1, 0xe

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lsv0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    .line 39
    .line 40
    iget-object v2, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-static {v1, v2}, Ll41;->ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v1, v0

    .line 72
    check-cast v1, Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-static {v1}, Ll41;->ε(Ljava/lang/reflect/Method;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "offlinemode"

    .line 89
    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    return-object p0
.end method

.method private final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "rec_from_group_id"

    .line 12
    .line 13
    const-string v2, "recommend_rank"

    .line 14
    .line 15
    const-string v3, "recommend_page"

    .line 16
    .line 17
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    invoke-static {p1, p0, v1}, Lp81;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "flow_type"

    .line 35
    .line 36
    const-string v2, "from_gid"

    .line 37
    .line 38
    const-string v3, "is_outer"

    .line 39
    .line 40
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, p0, v1}, Lp81;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v0, p1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "X.C845060Wxx"

    .line 56
    .line 57
    invoke-static {p0, p1}, Lp81;->κ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_0
    new-instance p0, Lf7;

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-direct {p0, p1, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lf71;

    .line 73
    .line 74
    const/4 v0, 0x5

    .line 75
    invoke-direct {p1, v0}, Lf71;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcu;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {v0, p0, v1, p1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lf71;

    .line 85
    .line 86
    const/4 p1, 0x6

    .line 87
    invoke-direct {p0, p1}, Lf71;-><init>(I)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Ly30;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-direct {p1, v0, v1, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 94
    .line 95
    .line 96
    new-instance p0, Luh0;

    .line 97
    .line 98
    const/16 v0, 0x18

    .line 99
    .line 100
    invoke-direct {p0, v0}, Luh0;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_1

    .line 119
    .line 120
    sget-object p0, Ljz;->ε:Ljz;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_2

    .line 132
    .line 133
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    goto :goto_1

    .line 138
    :cond_2
    invoke-static {p1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_3
    move-object p0, p1

    .line 157
    :goto_1
    return-object p0
.end method

.method private final λ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "topview_splash_dislike"

    .line 12
    .line 13
    const-string v2, "click_mute_author"

    .line 14
    .line 15
    const-string v3, "is_first_level_not_interesting_action"

    .line 16
    .line 17
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    invoke-static {p1, p0, v1}, Lp81;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "button_type"

    .line 35
    .line 36
    const-string v2, "is_meteormode"

    .line 37
    .line 38
    const-string v3, "dislike_type"

    .line 39
    .line 40
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, p0, v1}, Lp81;->δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v0, p1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "~789325E9C4B2AA228E18888457F2F91C62869634665744D0739FD84B98DBD2867A6B9B84318D72C0AB2C5BBC54D41867D271D27F1B4C8D3B6EAE18A46E40BCBD51"

    .line 56
    .line 57
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p0, p1}, Lp81;->κ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_0
    new-instance p0, Lf7;

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    invoke-direct {p0, p1, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lf71;

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    invoke-direct {p1, v0}, Lf71;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lcu;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-direct {v0, p0, v1, p1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Lf71;

    .line 89
    .line 90
    const/4 p1, 0x4

    .line 91
    invoke-direct {p0, p1}, Lf71;-><init>(I)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Ly30;

    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    invoke-direct {p1, v0, v1, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 98
    .line 99
    .line 100
    new-instance p0, Luh0;

    .line 101
    .line 102
    const/16 v0, 0x17

    .line 103
    .line 104
    invoke-direct {p0, v0}, Luh0;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1, p0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_1

    .line 123
    .line 124
    sget-object p0, Ljz;->ε:Ljz;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_2

    .line 136
    .line 137
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    goto :goto_1

    .line 142
    :cond_2
    invoke-static {p1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_3
    move-object p0, p1

    .line 161
    :goto_1
    return-object p0
.end method

.method private final μ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Ll91;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    array-length v0, p0

    .line 30
    :goto_0
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    aget-object v3, p0, v1

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v4, v4

    .line 52
    if-nez v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_3

    .line 67
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v3, v2

    .line 71
    :goto_1
    if-nez v3, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v3, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-lez p1, :cond_3

    .line 101
    .line 102
    const-string p1, "0"

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_3
    :goto_2
    move-object p0, v2

    .line 112
    goto :goto_4

    .line 113
    :goto_3
    new-instance p1, Leo1;

    .line 114
    .line 115
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object p0, p1

    .line 119
    :goto_4
    instance-of p1, p0, Leo1;

    .line 120
    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_4
    move-object v2, p0

    .line 125
    :goto_5
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    return-object v2
.end method

.method private final ν(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Luh1;->α:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "java.lang.String"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 20
    .line 21
    const-string v3, "onPlayCompleted"

    .line 22
    .line 23
    invoke-static {p1, p0, v0, v3, v2}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "int"

    .line 27
    .line 28
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {p1, p0, v0, v3, v4}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    filled-new-array {v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "onPlayCompletedFirstTime"

    .line 40
    .line 41
    invoke-static {p1, p0, v0, v5, v4}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v4, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F96CC58EAD434E9B00A2D2C063C389CCBAA1A923338920BA399B8488"

    .line 45
    .line 46
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    filled-new-array {v1, v6}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {p1, p0, v0, v5, v6}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-static {p1, p0, v0, v3, v7}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    filled-new-array {v6, v1, v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1, p0, v0, v3, v2}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {p1, p0, v0, v5, v2}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    filled-new-array {v6, v1, v2}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {p1, p0, v0, v5, v1}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444045E5F45F7E1B2B50D5955DD465C390D2E76F87756154E0D31183F4"

    .line 91
    .line 92
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    filled-new-array {v6, v2}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {p1, p0, v0, v3, v2}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    filled-new-array {v6, v2}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v3, "onPlayCompletedFirst"

    .line 112
    .line 113
    invoke-static {p1, p0, v0, v3, v2}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const-string v2, "beforeNotifyCompletedPlay"

    .line 125
    .line 126
    invoke-static {p1, p0, v0, v2, v1}, Luh1;->η(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;Ljava/lang/String;[Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    const/4 v2, 0x4

    .line 134
    const-string v3, "r5fd016b85524a7fd"

    .line 135
    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    :try_start_0
    new-instance v1, Lcf1;

    .line 139
    .line 140
    const/16 v4, 0x16

    .line 141
    .line 142
    invoke-direct {v1, v4}, Lcf1;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 166
    .line 167
    .line 168
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    goto :goto_1

    .line 170
    :catchall_0
    move-exception v1

    .line 171
    :try_start_2
    new-instance v4, Leo1;

    .line 172
    .line 173
    invoke-direct {v4, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object v1, v4

    .line 177
    :goto_1
    instance-of v4, v1, Leo1;

    .line 178
    .line 179
    if-eqz v4, :cond_1

    .line 180
    .line 181
    move-object v1, v6

    .line 182
    :cond_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    if-nez v1, :cond_2

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_2
    invoke-static {v1}, Luh1;->ε(Ljava/lang/reflect/Method;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_0

    .line 192
    .line 193
    invoke-static {v0, v1}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :catchall_1
    move-exception p0

    .line 198
    goto :goto_2

    .line 199
    :cond_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :goto_2
    new-instance p1, Leo1;

    .line 203
    .line 204
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    move-object p0, p1

    .line 208
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    if-eqz p0, :cond_4

    .line 213
    .line 214
    new-instance p1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v1, "query feed type-only completed methods failed: "

    .line 217
    .line 218
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    :try_start_3
    invoke-static {v3, p0, v6, v2, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 229
    .line 230
    .line 231
    :catchall_2
    :cond_4
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    const-string p1, "DexKit completed methods found="

    .line 236
    .line 237
    invoke-static {p1, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    :try_start_4
    invoke-static {v3, p0, v6, v2, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 242
    .line 243
    .line 244
    :catchall_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    check-cast p0, Ljava/lang/Iterable;

    .line 252
    .line 253
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    return-object p0
.end method

.method private final ξ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lki1;->δ:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    :try_start_0
    new-instance v3, Lyh0;

    .line 30
    .line 31
    const/16 v4, 0x9

    .line 32
    .line 33
    invoke-direct {v3, v2, v4}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lorg/luckypray/dexkit/result/ClassData;

    .line 55
    .line 56
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v3

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    sget-object v3, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_2
    new-instance v4, Leo1;

    .line 70
    .line 71
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v3, v4

    .line 75
    :goto_3
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "\u6a21\u677f\u65f6\u95f4\u7c7b\u540d\u67e5\u8be2\u5931\u8d25 name="

    .line 86
    .line 87
    const-string v5, ": "

    .line 88
    .line 89
    const-string v6, "r99b7e71b74d4ef6d"

    .line 90
    .line 91
    invoke-static {v4, v2, v5, v3, v6}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_3
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Ljava/lang/String;

    .line 115
    .line 116
    iget-object v2, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 117
    .line 118
    invoke-static {v2, v1}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_5
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    move-object v1, v0

    .line 148
    check-cast v1, Ljava/lang/Class;

    .line 149
    .line 150
    invoke-static {v1}, Lki1;->η(Ljava/lang/Class;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_5

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    new-instance p1, Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :cond_7
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_8

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    move-object v2, v1

    .line 185
    check-cast v2, Ljava/lang/Class;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_7

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_8
    return-object v0
.end method

.method private final ο(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lmi1;->β:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    :try_start_0
    new-instance v3, Lyh0;

    .line 30
    .line 31
    const/16 v4, 0xb

    .line 32
    .line 33
    invoke-direct {v3, v2, v4}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lorg/luckypray/dexkit/result/ClassData;

    .line 55
    .line 56
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v3

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    sget-object v3, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_2
    new-instance v4, Leo1;

    .line 70
    .line 71
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v3, v4

    .line 75
    :goto_3
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "strict className scan failed name="

    .line 86
    .line 87
    const-string v5, ": "

    .line 88
    .line 89
    const-string v6, "rb95bed5e6997b6c3"

    .line 90
    .line 91
    invoke-static {v4, v2, v5, v3, v6}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_3
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Ljava/lang/String;

    .line 115
    .line 116
    iget-object v2, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 117
    .line 118
    invoke-static {v2, v1}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_5
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    move-object v1, v0

    .line 148
    check-cast v1, Ljava/lang/Class;

    .line 149
    .line 150
    sget-object v2, Lmi1;->α:Lmi1;

    .line 151
    .line 152
    invoke-static {v1}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    const/16 v2, 0x7d0

    .line 157
    .line 158
    if-lt v1, v2, :cond_5

    .line 159
    .line 160
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_6
    new-instance p1, Ljava/util/HashSet;

    .line 165
    .line 166
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 167
    .line 168
    .line 169
    new-instance v0, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    :cond_7
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    move-object v2, v1

    .line 189
    check-cast v2, Ljava/lang/Class;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_7

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_8
    new-instance p0, Lib1;

    .line 206
    .line 207
    const/16 p1, 0x15

    .line 208
    .line 209
    invoke-direct {p0, p1}, Lib1;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0
.end method

.method private final π(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "setData: "

    .line 14
    .line 15
    const-string v2, "IMShareContactsListAdapter"

    .line 16
    .line 17
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    filled-new-array {v2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    filled-new-array {v1, v2}, [[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :catchall_0
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, [Ljava/lang/String;

    .line 48
    .line 49
    :try_start_0
    new-instance v3, Lzi;

    .line 50
    .line 51
    const/4 v4, 0x6

    .line 52
    invoke-direct {v3, v2, v4}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v3, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    goto :goto_1

    .line 84
    :catchall_1
    move-exception v3

    .line 85
    :try_start_2
    new-instance v4, Leo1;

    .line 86
    .line 87
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object v3, v4

    .line 91
    :goto_1
    instance-of v4, v3, Leo1;

    .line 92
    .line 93
    if-eqz v4, :cond_2

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    :cond_2
    check-cast v3, Ljava/lang/Class;

    .line 97
    .line 98
    if-eqz v3, :cond_1

    .line 99
    .line 100
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-static {v0}, Lfk1;->γ(Ljava/util/Collection;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt20;->ε:I

    .line 4
    .line 5
    const/16 v3, 0xe

    .line 6
    .line 7
    const/16 v4, 0x19

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/16 v6, 0x17

    .line 11
    .line 12
    const/4 v7, 0x6

    .line 13
    const/4 v8, 0x3

    .line 14
    sget-object v9, Ls62;->α:Ls62;

    .line 15
    .line 16
    const/4 v10, 0x5

    .line 17
    const/4 v11, 0x0

    .line 18
    const/16 v12, 0x13

    .line 19
    .line 20
    const/4 v14, 0x4

    .line 21
    sget-object v15, Ljz;->ε:Ljz;

    .line 22
    .line 23
    const/4 v13, 0x1

    .line 24
    iget-object v2, v0, Lt20;->ζ:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lry1;->α:Lry1;

    .line 37
    .line 38
    invoke-static {v0, v2}, Lry1;->ｃ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lt20;->π(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_1
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v0}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lt20;->ο(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lt20;->ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lt20;->ν(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lt20;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lt20;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lt20;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Lt20;->ι(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Lt20;->θ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_a
    invoke-direct/range {p0 .. p1}, Lt20;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :pswitch_b
    invoke-direct/range {p0 .. p1}, Lt20;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_c
    invoke-direct/range {p0 .. p1}, Lt20;->ζ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :pswitch_d
    invoke-direct/range {p0 .. p1}, Lt20;->δ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_e
    invoke-direct/range {p0 .. p1}, Lt20;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_f
    move-object/from16 v1, p1

    .line 130
    .line 131
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v0, Luv0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    new-instance v3, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v0, "~78F34A746881AA3660EE86BE622F7993067D6CB566F11858AD9BFDFAF7546DEFBE6F7A699FA0B4E1E231EAB579946FE2D2FA5C5B0B85A1F36EBFE6A126665CE055B3E4F9F2C8200D94DA2CD0520C73EF472A0B678E1F90F349"

    .line 144
    .line 145
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v4, "~781A9FBE2FBD8F61F657275D326874C55508DE7AC4D364B88930CC7C2AF8B2F6F1F42FB5723DCF19FDB169E3B07C1571F28AB7C03C50DB95F93145BAB7A004FEEA08CD9ED47324A2FC64074299E44EC1B9FF3E0358910EF4B9C33D8620934304D760AC"

    .line 150
    .line 151
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/String;

    .line 178
    .line 179
    :try_start_0
    new-instance v5, Lyh0;

    .line 180
    .line 181
    invoke-direct {v5, v0, v14}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 185
    .line 186
    .line 187
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    goto :goto_0

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    new-instance v5, Leo1;

    .line 191
    .line 192
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    move-object v0, v5

    .line 196
    :goto_0
    instance-of v5, v0, Leo1;

    .line 197
    .line 198
    if-eqz v5, :cond_1

    .line 199
    .line 200
    const/4 v0, 0x0

    .line 201
    :cond_1
    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 202
    .line 203
    if-eqz v0, :cond_0

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_0

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;

    .line 220
    .line 221
    invoke-virtual {v5, v2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    if-eqz v5, :cond_2

    .line 226
    .line 227
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_5

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    move-object v3, v2

    .line 251
    check-cast v3, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    invoke-static {v3}, Luv0;->δ(Ljava/lang/reflect/Method;)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    const/16 v4, 0x7d0

    .line 258
    .line 259
    if-lt v3, v4, :cond_4

    .line 260
    .line 261
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_6

    .line 274
    .line 275
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Ljava/lang/reflect/Method;

    .line 280
    .line 281
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_6
    new-instance v1, Ljava/util/HashSet;

    .line 286
    .line 287
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 288
    .line 289
    .line 290
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_8

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    move-object v4, v3

    .line 310
    check-cast v4, Ljava/lang/reflect/Method;

    .line 311
    .line 312
    invoke-static {v4}, Luv0;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    if-eqz v4, :cond_7

    .line 321
    .line 322
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_8
    return-object v2

    .line 327
    :pswitch_10
    move-object/from16 v0, p1

    .line 328
    .line 329
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    sget-object v1, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 335
    .line 336
    new-instance v1, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 339
    .line 340
    .line 341
    new-instance v3, Lxh0;

    .line 342
    .line 343
    invoke-direct {v3, v0, v2, v14}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 344
    .line 345
    .line 346
    :try_start_1
    invoke-virtual {v3}, Lxh0;->invoke()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    check-cast v3, Ljava/lang/Iterable;

    .line 351
    .line 352
    invoke-static {v1, v3}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 353
    .line 354
    .line 355
    :catchall_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    if-eqz v3, :cond_9

    .line 360
    .line 361
    new-instance v3, Lxh0;

    .line 362
    .line 363
    invoke-direct {v3, v0, v2, v10}, Lxh0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;I)V

    .line 364
    .line 365
    .line 366
    :try_start_2
    invoke-virtual {v3}, Lxh0;->invoke()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, Ljava/lang/Iterable;

    .line 371
    .line 372
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 373
    .line 374
    .line 375
    :catchall_2
    :cond_9
    invoke-static {v2}, Ltu0;->δ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v1, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    new-instance v1, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_b

    .line 397
    .line 398
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    move-object v3, v2

    .line 403
    check-cast v3, Ljava/lang/reflect/Method;

    .line 404
    .line 405
    invoke-static {v3}, Ltu0;->β(Ljava/lang/reflect/Method;)Z

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-eqz v3, :cond_a

    .line 410
    .line 411
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_b
    new-instance v0, Ljava/util/HashSet;

    .line 416
    .line 417
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 418
    .line 419
    .line 420
    new-instance v2, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-eqz v3, :cond_d

    .line 434
    .line 435
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    move-object v4, v3

    .line 440
    check-cast v4, Ljava/lang/reflect/Method;

    .line 441
    .line 442
    invoke-static {v4}, Ltu0;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-eqz v4, :cond_c

    .line 451
    .line 452
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    goto :goto_6

    .line 456
    :cond_d
    return-object v2

    .line 457
    :pswitch_11
    move-object/from16 v1, p1

    .line 458
    .line 459
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 460
    .line 461
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    sget-object v0, Lcp0;->α:Ljava/util/Set;

    .line 465
    .line 466
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 467
    .line 468
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 469
    .line 470
    .line 471
    sget-object v0, Lcp0;->ζ:Ljava/util/List;

    .line 472
    .line 473
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    :cond_e
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    const-string v5, ", "

    .line 482
    .line 483
    if-eqz v0, :cond_12

    .line 484
    .line 485
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    move-object v11, v0

    .line 490
    check-cast v11, Ljava/lang/String;

    .line 491
    .line 492
    :try_start_3
    sget-object v0, Lorg/luckypray/dexkit/query/FindClass;->Companion:Lorg/luckypray/dexkit/query/FindClass$Companion;

    .line 493
    .line 494
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindClass$Companion;->create()Lorg/luckypray/dexkit/query/FindClass;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    sget-object v6, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;

    .line 499
    .line 500
    invoke-virtual {v6}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    const/4 v14, 0x6

    .line 505
    const/4 v15, 0x0

    .line 506
    const/4 v12, 0x0

    .line 507
    const/4 v13, 0x0

    .line 508
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    invoke-virtual {v0, v6}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    :cond_f
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-eqz v0, :cond_11

    .line 529
    .line 530
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 535
    .line 536
    :try_start_4
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/result/ClassData;->getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 540
    goto :goto_9

    .line 541
    :catchall_3
    move-exception v0

    .line 542
    :try_start_5
    new-instance v7, Leo1;

    .line 543
    .line 544
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    move-object v0, v7

    .line 548
    :goto_9
    instance-of v7, v0, Leo1;

    .line 549
    .line 550
    if-eqz v7, :cond_10

    .line 551
    .line 552
    const/4 v0, 0x0

    .line 553
    :cond_10
    check-cast v0, Ljava/lang/Class;

    .line 554
    .line 555
    if-eqz v0, :cond_f

    .line 556
    .line 557
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 558
    .line 559
    .line 560
    goto :goto_8

    .line 561
    :catchall_4
    move-exception v0

    .line 562
    goto :goto_a

    .line 563
    :cond_11
    move-object v6, v9

    .line 564
    goto :goto_b

    .line 565
    :goto_a
    new-instance v6, Leo1;

    .line 566
    .line 567
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 568
    .line 569
    .line 570
    :goto_b
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    if-eqz v0, :cond_e

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    new-instance v6, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    const-string v7, "DexKit exact class query failed: "

    .line 583
    .line 584
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-static {v0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    goto :goto_7

    .line 604
    :cond_12
    sget-object v0, Lcp0;->α:Ljava/util/Set;

    .line 605
    .line 606
    check-cast v0, Ljava/lang/Iterable;

    .line 607
    .line 608
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    :cond_13
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-eqz v0, :cond_18

    .line 617
    .line 618
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    move-object v6, v0

    .line 623
    check-cast v6, Ljava/lang/String;

    .line 624
    .line 625
    :try_start_6
    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 626
    .line 627
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    sget-object v7, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 632
    .line 633
    invoke-virtual {v7}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    filled-new-array {v6}, [Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v8

    .line 641
    invoke-virtual {v7, v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 642
    .line 643
    .line 644
    move-result-object v10

    .line 645
    const-class v7, Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v11

    .line 651
    const/4 v14, 0x6

    .line 652
    const/4 v15, 0x0

    .line 653
    const/4 v12, 0x0

    .line 654
    const/4 v13, 0x0

    .line 655
    invoke-static/range {v10 .. v15}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    invoke-virtual {v0, v7}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    :cond_14
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_17

    .line 676
    .line 677
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 682
    .line 683
    :try_start_7
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 684
    .line 685
    .line 686
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 687
    goto :goto_e

    .line 688
    :catchall_5
    move-exception v0

    .line 689
    :try_start_8
    new-instance v8, Leo1;

    .line 690
    .line 691
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 692
    .line 693
    .line 694
    move-object v0, v8

    .line 695
    :goto_e
    instance-of v8, v0, Leo1;

    .line 696
    .line 697
    if-eqz v8, :cond_15

    .line 698
    .line 699
    const/4 v0, 0x0

    .line 700
    :cond_15
    check-cast v0, Ljava/lang/reflect/Method;

    .line 701
    .line 702
    if-eqz v0, :cond_16

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    goto :goto_f

    .line 709
    :catchall_6
    move-exception v0

    .line 710
    goto :goto_10

    .line 711
    :cond_16
    const/4 v0, 0x0

    .line 712
    :goto_f
    if-eqz v0, :cond_14

    .line 713
    .line 714
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 715
    .line 716
    .line 717
    goto :goto_d

    .line 718
    :cond_17
    move-object v7, v9

    .line 719
    goto :goto_11

    .line 720
    :goto_10
    new-instance v7, Leo1;

    .line 721
    .line 722
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    :goto_11
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    if-eqz v0, :cond_13

    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    new-instance v7, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    const-string v8, "DexKit moduleName query failed: "

    .line 738
    .line 739
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-static {v0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    goto/16 :goto_c

    .line 759
    .line 760
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    :cond_19
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    if-eqz v2, :cond_1a

    .line 774
    .line 775
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    move-object v3, v2

    .line 780
    check-cast v3, Ljava/lang/Class;

    .line 781
    .line 782
    invoke-static {v3}, Lcp0;->ζ(Ljava/lang/Class;)I

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    const/16 v4, 0x384

    .line 787
    .line 788
    if-lt v3, v4, :cond_19

    .line 789
    .line 790
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    goto :goto_12

    .line 794
    :cond_1a
    new-instance v1, Luh0;

    .line 795
    .line 796
    const/16 v2, 0xb

    .line 797
    .line 798
    invoke-direct {v1, v2}, Luh0;-><init>(I)V

    .line 799
    .line 800
    .line 801
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    new-instance v1, Ljava/util/HashSet;

    .line 806
    .line 807
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 808
    .line 809
    .line 810
    new-instance v2, Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 813
    .line 814
    .line 815
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    :cond_1b
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-eqz v3, :cond_1c

    .line 824
    .line 825
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    move-object v4, v3

    .line 830
    check-cast v4, Ljava/lang/Class;

    .line 831
    .line 832
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    if-eqz v4, :cond_1b

    .line 841
    .line 842
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    goto :goto_13

    .line 846
    :cond_1c
    return-object v2

    .line 847
    :pswitch_12
    move-object/from16 v0, p1

    .line 848
    .line 849
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    sget-object v1, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 855
    .line 856
    new-instance v1, Ljava/util/ArrayList;

    .line 857
    .line 858
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 859
    .line 860
    .line 861
    :try_start_9
    new-instance v3, Lwj0;

    .line 862
    .line 863
    invoke-direct {v3, v12}, Lwj0;-><init>(I)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-static {v0, v2}, Lbk0;->θ(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 871
    .line 872
    .line 873
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 874
    goto :goto_14

    .line 875
    :catchall_7
    move-exception v0

    .line 876
    new-instance v3, Leo1;

    .line 877
    .line 878
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 879
    .line 880
    .line 881
    move-object v0, v3

    .line 882
    :goto_14
    instance-of v3, v0, Leo1;

    .line 883
    .line 884
    if-eqz v3, :cond_1d

    .line 885
    .line 886
    goto :goto_15

    .line 887
    :cond_1d
    move-object v15, v0

    .line 888
    :goto_15
    check-cast v15, Ljava/lang/Iterable;

    .line 889
    .line 890
    invoke-static {v1, v15}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 891
    .line 892
    .line 893
    invoke-static {v2}, Lbk0;->ε(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 898
    .line 899
    .line 900
    new-instance v0, Ljava/util/ArrayList;

    .line 901
    .line 902
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    :cond_1e
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    if-eqz v2, :cond_1f

    .line 914
    .line 915
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    move-object v3, v2

    .line 920
    check-cast v3, Ljava/lang/reflect/Method;

    .line 921
    .line 922
    invoke-static {v3}, Lbk0;->δ(Ljava/lang/reflect/Method;)Z

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    if-eqz v3, :cond_1e

    .line 927
    .line 928
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    goto :goto_16

    .line 932
    :cond_1f
    new-instance v1, Ljava/util/HashSet;

    .line 933
    .line 934
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 935
    .line 936
    .line 937
    new-instance v2, Ljava/util/ArrayList;

    .line 938
    .line 939
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    :cond_20
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    if-eqz v3, :cond_21

    .line 951
    .line 952
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v3

    .line 956
    move-object v4, v3

    .line 957
    check-cast v4, Ljava/lang/reflect/Method;

    .line 958
    .line 959
    invoke-static {v4}, Lbk0;->η(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    if-eqz v4, :cond_20

    .line 968
    .line 969
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    goto :goto_17

    .line 973
    :cond_21
    return-object v2

    .line 974
    :pswitch_13
    move-object/from16 v0, p1

    .line 975
    .line 976
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 977
    .line 978
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    new-instance v1, Ljava/util/ArrayList;

    .line 982
    .line 983
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 984
    .line 985
    .line 986
    :try_start_a
    sget-object v3, Lzj0;->α:Lzj0;

    .line 987
    .line 988
    new-instance v3, Lfj0;

    .line 989
    .line 990
    const/16 v4, 0x14

    .line 991
    .line 992
    invoke-direct {v3, v4}, Lfj0;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1003
    goto :goto_18

    .line 1004
    :catchall_8
    move-exception v0

    .line 1005
    new-instance v3, Leo1;

    .line 1006
    .line 1007
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1008
    .line 1009
    .line 1010
    move-object v0, v3

    .line 1011
    :goto_18
    instance-of v3, v0, Leo1;

    .line 1012
    .line 1013
    if-eqz v3, :cond_22

    .line 1014
    .line 1015
    move-object v0, v15

    .line 1016
    :cond_22
    check-cast v0, Ljava/lang/Iterable;

    .line 1017
    .line 1018
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1019
    .line 1020
    .line 1021
    new-instance v16, Lng;

    .line 1022
    .line 1023
    sget-object v18, Lzj0;->α:Lzj0;

    .line 1024
    .line 1025
    const/16 v22, 0x0

    .line 1026
    .line 1027
    const/16 v23, 0x17

    .line 1028
    .line 1029
    const/16 v17, 0x1

    .line 1030
    .line 1031
    const-class v19, Lzj0;

    .line 1032
    .line 1033
    const-string v20, "isNoticeUnreadMapMethod"

    .line 1034
    .line 1035
    const-string v21, "isNoticeUnreadMapMethod(Ljava/lang/reflect/Method;)Z"

    .line 1036
    .line 1037
    invoke-direct/range {v16 .. v23}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1038
    .line 1039
    .line 1040
    move-object/from16 v0, v16

    .line 1041
    .line 1042
    invoke-static {v2, v0}, Lx;->Π(Ljava/lang/ClassLoader;La80;)Ljava/util/ArrayList;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1047
    .line 1048
    .line 1049
    new-instance v0, Lf7;

    .line 1050
    .line 1051
    invoke-direct {v0, v13, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    new-instance v1, Lfj0;

    .line 1055
    .line 1056
    const/16 v2, 0x15

    .line 1057
    .line 1058
    invoke-direct {v1, v2}, Lfj0;-><init>(I)V

    .line 1059
    .line 1060
    .line 1061
    new-instance v2, Ly30;

    .line 1062
    .line 1063
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1064
    .line 1065
    .line 1066
    new-instance v0, Lfj0;

    .line 1067
    .line 1068
    const/16 v1, 0x16

    .line 1069
    .line 1070
    invoke-direct {v0, v1}, Lfj0;-><init>(I)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v1, Ly30;

    .line 1074
    .line 1075
    invoke-direct {v1, v2, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v0, Luh0;

    .line 1079
    .line 1080
    const/16 v2, 0x8

    .line 1081
    .line 1082
    invoke-direct {v0, v2}, Luh0;-><init>(I)V

    .line 1083
    .line 1084
    .line 1085
    new-instance v2, Lfj0;

    .line 1086
    .line 1087
    invoke-direct {v2, v6}, Lfj0;-><init>(I)V

    .line 1088
    .line 1089
    .line 1090
    new-instance v3, Lbu;

    .line 1091
    .line 1092
    invoke-static {v1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1097
    .line 1098
    .line 1099
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-direct {v3, v0, v2}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1107
    .line 1108
    .line 1109
    move-result v0

    .line 1110
    if-nez v0, :cond_23

    .line 1111
    .line 1112
    goto :goto_1a

    .line 1113
    :cond_23
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    if-nez v1, :cond_24

    .line 1122
    .line 1123
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v15

    .line 1127
    goto :goto_1a

    .line 1128
    :cond_24
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v15

    .line 1132
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    if-eqz v0, :cond_25

    .line 1137
    .line 1138
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1143
    .line 1144
    .line 1145
    goto :goto_19

    .line 1146
    :cond_25
    :goto_1a
    return-object v15

    .line 1147
    :pswitch_14
    move-object/from16 v1, p1

    .line 1148
    .line 1149
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1150
    .line 1151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    new-instance v3, Ljava/util/ArrayList;

    .line 1155
    .line 1156
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1157
    .line 1158
    .line 1159
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD80D768DA874A7739F1535D8D0B64C96CD3C16C27FA1E8BC98"

    .line 1160
    .line 1161
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    const-string v4, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"

    .line 1166
    .line 1167
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v6

    .line 1171
    :try_start_b
    sget-object v9, Lzj0;->α:Lzj0;

    .line 1172
    .line 1173
    new-instance v9, Lub;

    .line 1174
    .line 1175
    invoke-direct {v9, v8, v0, v6}, Lub;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v1, v9}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1186
    goto :goto_1b

    .line 1187
    :catchall_9
    move-exception v0

    .line 1188
    new-instance v6, Leo1;

    .line 1189
    .line 1190
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1191
    .line 1192
    .line 1193
    move-object v0, v6

    .line 1194
    :goto_1b
    instance-of v6, v0, Leo1;

    .line 1195
    .line 1196
    if-eqz v6, :cond_26

    .line 1197
    .line 1198
    move-object v0, v15

    .line 1199
    :cond_26
    check-cast v0, Ljava/util/List;

    .line 1200
    .line 1201
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1202
    .line 1203
    .line 1204
    :try_start_c
    sget-object v0, Lzj0;->α:Lzj0;

    .line 1205
    .line 1206
    new-instance v0, Lwj0;

    .line 1207
    .line 1208
    invoke-direct {v0, v11}, Lwj0;-><init>(I)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 1219
    goto :goto_1c

    .line 1220
    :catchall_a
    move-exception v0

    .line 1221
    new-instance v1, Leo1;

    .line 1222
    .line 1223
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1224
    .line 1225
    .line 1226
    move-object v0, v1

    .line 1227
    :goto_1c
    instance-of v1, v0, Leo1;

    .line 1228
    .line 1229
    if-eqz v1, :cond_27

    .line 1230
    .line 1231
    move-object v0, v15

    .line 1232
    :cond_27
    check-cast v0, Ljava/lang/Iterable;

    .line 1233
    .line 1234
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1235
    .line 1236
    .line 1237
    :try_start_d
    const-string v0, "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC8F2E17EC0A94ED7DDF376B1F1CCFFF57998EAEE9C317A38A8FB63CCDD0"

    .line 1238
    .line 1239
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    invoke-static {v0, v11, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    sget-object v1, Lzj0;->α:Lzj0;

    .line 1248
    .line 1249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    invoke-static {v0}, Lzj0;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    new-instance v1, Ljava/util/ArrayList;

    .line 1257
    .line 1258
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    :cond_28
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1266
    .line 1267
    .line 1268
    move-result v2

    .line 1269
    if-eqz v2, :cond_29

    .line 1270
    .line 1271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v2

    .line 1275
    move-object v6, v2

    .line 1276
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1277
    .line 1278
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1279
    .line 1280
    .line 1281
    move-result v6

    .line 1282
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v6

    .line 1286
    if-eqz v6, :cond_28

    .line 1287
    .line 1288
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    goto :goto_1d

    .line 1292
    :catchall_b
    move-exception v0

    .line 1293
    goto/16 :goto_22

    .line 1294
    .line 1295
    :cond_29
    new-instance v0, Ljava/util/ArrayList;

    .line 1296
    .line 1297
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v1

    .line 1304
    :cond_2a
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1305
    .line 1306
    .line 1307
    move-result v2

    .line 1308
    if-eqz v2, :cond_2b

    .line 1309
    .line 1310
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v2

    .line 1314
    move-object v6, v2

    .line 1315
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1316
    .line 1317
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v6

    .line 1321
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    array-length v6, v6

    .line 1325
    if-nez v6, :cond_2a

    .line 1326
    .line 1327
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    goto :goto_1e

    .line 1331
    :cond_2b
    new-instance v1, Ljava/util/ArrayList;

    .line 1332
    .line 1333
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    :cond_2c
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1341
    .line 1342
    .line 1343
    move-result v2

    .line 1344
    if-eqz v2, :cond_2e

    .line 1345
    .line 1346
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    move-object v6, v2

    .line 1351
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1352
    .line 1353
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v6

    .line 1357
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v9

    .line 1364
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v10

    .line 1368
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1369
    .line 1370
    .line 1371
    move-result v9

    .line 1372
    if-eqz v9, :cond_2d

    .line 1373
    .line 1374
    move v6, v13

    .line 1375
    goto :goto_20

    .line 1376
    :cond_2d
    invoke-static {v6}, Lx;->ω(Ljava/lang/Class;)Z

    .line 1377
    .line 1378
    .line 1379
    move-result v6

    .line 1380
    :goto_20
    if-eqz v6, :cond_2c

    .line 1381
    .line 1382
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    goto :goto_1f

    .line 1386
    :cond_2e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1391
    .line 1392
    .line 1393
    move-result v2

    .line 1394
    if-eqz v2, :cond_2f

    .line 1395
    .line 1396
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    check-cast v2, Ljava/lang/reflect/Method;

    .line 1401
    .line 1402
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 1403
    .line 1404
    .line 1405
    goto :goto_21

    .line 1406
    :goto_22
    new-instance v1, Leo1;

    .line 1407
    .line 1408
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1409
    .line 1410
    .line 1411
    :cond_2f
    instance-of v0, v1, Leo1;

    .line 1412
    .line 1413
    if-eqz v0, :cond_30

    .line 1414
    .line 1415
    move-object v1, v15

    .line 1416
    :cond_30
    check-cast v1, Ljava/util/List;

    .line 1417
    .line 1418
    invoke-static {v3, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v0, Lf7;

    .line 1422
    .line 1423
    invoke-direct {v0, v13, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v1, Lwj0;

    .line 1427
    .line 1428
    invoke-direct {v1, v13}, Lwj0;-><init>(I)V

    .line 1429
    .line 1430
    .line 1431
    new-instance v2, Ly30;

    .line 1432
    .line 1433
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1434
    .line 1435
    .line 1436
    new-instance v0, Lwj0;

    .line 1437
    .line 1438
    invoke-direct {v0, v5}, Lwj0;-><init>(I)V

    .line 1439
    .line 1440
    .line 1441
    new-instance v1, Ly30;

    .line 1442
    .line 1443
    invoke-direct {v1, v2, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1444
    .line 1445
    .line 1446
    new-instance v0, Lwj0;

    .line 1447
    .line 1448
    invoke-direct {v0, v8}, Lwj0;-><init>(I)V

    .line 1449
    .line 1450
    .line 1451
    new-instance v2, Ly30;

    .line 1452
    .line 1453
    invoke-direct {v2, v1, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1454
    .line 1455
    .line 1456
    new-instance v0, Luh0;

    .line 1457
    .line 1458
    invoke-direct {v0, v7}, Luh0;-><init>(I)V

    .line 1459
    .line 1460
    .line 1461
    new-instance v1, Lwj0;

    .line 1462
    .line 1463
    invoke-direct {v1, v14}, Lwj0;-><init>(I)V

    .line 1464
    .line 1465
    .line 1466
    new-instance v3, Lbu;

    .line 1467
    .line 1468
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    invoke-static {v2, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-direct {v3, v0, v1}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v0

    .line 1486
    if-nez v0, :cond_31

    .line 1487
    .line 1488
    goto :goto_24

    .line 1489
    :cond_31
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1494
    .line 1495
    .line 1496
    move-result v1

    .line 1497
    if-nez v1, :cond_32

    .line 1498
    .line 1499
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v15

    .line 1503
    goto :goto_24

    .line 1504
    :cond_32
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v15

    .line 1508
    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v0

    .line 1512
    if-eqz v0, :cond_33

    .line 1513
    .line 1514
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    goto :goto_23

    .line 1522
    :cond_33
    :goto_24
    return-object v15

    .line 1523
    :pswitch_15
    move-object/from16 v0, p1

    .line 1524
    .line 1525
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1526
    .line 1527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    new-instance v1, Ljava/util/ArrayList;

    .line 1531
    .line 1532
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1533
    .line 1534
    .line 1535
    invoke-static {v2, v0}, Lx;->Η(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1540
    .line 1541
    .line 1542
    new-instance v16, Lng;

    .line 1543
    .line 1544
    sget-object v18, Lzj0;->α:Lzj0;

    .line 1545
    .line 1546
    const/16 v22, 0x0

    .line 1547
    .line 1548
    const/16 v23, 0x15

    .line 1549
    .line 1550
    const/16 v17, 0x1

    .line 1551
    .line 1552
    const-class v19, Lzj0;

    .line 1553
    .line 1554
    const-string v20, "isNoticeClearUnreadMethod"

    .line 1555
    .line 1556
    const-string v21, "isNoticeClearUnreadMethod(Ljava/lang/reflect/Method;)Z"

    .line 1557
    .line 1558
    invoke-direct/range {v16 .. v23}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1559
    .line 1560
    .line 1561
    move-object/from16 v0, v16

    .line 1562
    .line 1563
    invoke-static {v2, v0}, Lx;->Π(Ljava/lang/ClassLoader;La80;)Ljava/util/ArrayList;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1568
    .line 1569
    .line 1570
    new-instance v0, Lf7;

    .line 1571
    .line 1572
    invoke-direct {v0, v13, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1573
    .line 1574
    .line 1575
    new-instance v1, Lwj0;

    .line 1576
    .line 1577
    invoke-direct {v1, v10}, Lwj0;-><init>(I)V

    .line 1578
    .line 1579
    .line 1580
    new-instance v2, Ly30;

    .line 1581
    .line 1582
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1583
    .line 1584
    .line 1585
    new-instance v0, Luh0;

    .line 1586
    .line 1587
    invoke-direct {v0, v10}, Luh0;-><init>(I)V

    .line 1588
    .line 1589
    .line 1590
    new-instance v1, Lwj0;

    .line 1591
    .line 1592
    invoke-direct {v1, v7}, Lwj0;-><init>(I)V

    .line 1593
    .line 1594
    .line 1595
    new-instance v3, Lbu;

    .line 1596
    .line 1597
    invoke-static {v2}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v2

    .line 1601
    invoke-static {v2, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1602
    .line 1603
    .line 1604
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    invoke-direct {v3, v0, v1}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 1609
    .line 1610
    .line 1611
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1612
    .line 1613
    .line 1614
    move-result v0

    .line 1615
    if-nez v0, :cond_34

    .line 1616
    .line 1617
    goto :goto_26

    .line 1618
    :cond_34
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1623
    .line 1624
    .line 1625
    move-result v1

    .line 1626
    if-nez v1, :cond_35

    .line 1627
    .line 1628
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v15

    .line 1632
    goto :goto_26

    .line 1633
    :cond_35
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v15

    .line 1637
    :goto_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1638
    .line 1639
    .line 1640
    move-result v0

    .line 1641
    if-eqz v0, :cond_36

    .line 1642
    .line 1643
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v0

    .line 1647
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1648
    .line 1649
    .line 1650
    goto :goto_25

    .line 1651
    :cond_36
    :goto_26
    return-object v15

    .line 1652
    :pswitch_16
    move-object/from16 v1, p1

    .line 1653
    .line 1654
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1655
    .line 1656
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1657
    .line 1658
    .line 1659
    new-instance v3, Ljava/util/ArrayList;

    .line 1660
    .line 1661
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1662
    .line 1663
    .line 1664
    :try_start_e
    sget-object v0, Lzj0;->α:Lzj0;

    .line 1665
    .line 1666
    new-instance v0, Lfj0;

    .line 1667
    .line 1668
    const/16 v5, 0x18

    .line 1669
    .line 1670
    invoke-direct {v0, v5}, Lfj0;-><init>(I)V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 1681
    goto :goto_27

    .line 1682
    :catchall_c
    move-exception v0

    .line 1683
    new-instance v5, Leo1;

    .line 1684
    .line 1685
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1686
    .line 1687
    .line 1688
    move-object v0, v5

    .line 1689
    :goto_27
    instance-of v5, v0, Leo1;

    .line 1690
    .line 1691
    if-eqz v5, :cond_37

    .line 1692
    .line 1693
    move-object v0, v15

    .line 1694
    :cond_37
    check-cast v0, Ljava/lang/Iterable;

    .line 1695
    .line 1696
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1697
    .line 1698
    .line 1699
    :try_start_f
    sget-object v0, Lzj0;->α:Lzj0;

    .line 1700
    .line 1701
    new-instance v0, Lfj0;

    .line 1702
    .line 1703
    invoke-direct {v0, v4}, Lfj0;-><init>(I)V

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    .line 1714
    goto :goto_28

    .line 1715
    :catchall_d
    move-exception v0

    .line 1716
    new-instance v1, Leo1;

    .line 1717
    .line 1718
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1719
    .line 1720
    .line 1721
    move-object v0, v1

    .line 1722
    :goto_28
    instance-of v1, v0, Leo1;

    .line 1723
    .line 1724
    if-eqz v1, :cond_38

    .line 1725
    .line 1726
    move-object v0, v15

    .line 1727
    :cond_38
    check-cast v0, Ljava/lang/Iterable;

    .line 1728
    .line 1729
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1730
    .line 1731
    .line 1732
    :try_start_10
    const-string v0, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"

    .line 1733
    .line 1734
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    invoke-static {v0, v11, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    sget-object v1, Lzj0;->α:Lzj0;

    .line 1743
    .line 1744
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1745
    .line 1746
    .line 1747
    const-string v1, "LJIIL"

    .line 1748
    .line 1749
    invoke-static {}, Lzj0;->ω()[Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v2

    .line 1753
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v2

    .line 1757
    check-cast v2, [Ljava/lang/Class;

    .line 1758
    .line 1759
    invoke-static {v0, v1, v2}, Lzj0;->θ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v1

    .line 1763
    invoke-static {v0}, Lzj0;->η(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v0

    .line 1767
    filled-new-array {v1, v0}, [Ljava/lang/reflect/Method;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    invoke-static {v0}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    .line 1775
    goto :goto_29

    .line 1776
    :catchall_e
    move-exception v0

    .line 1777
    new-instance v1, Leo1;

    .line 1778
    .line 1779
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1780
    .line 1781
    .line 1782
    move-object v0, v1

    .line 1783
    :goto_29
    instance-of v1, v0, Leo1;

    .line 1784
    .line 1785
    if-eqz v1, :cond_39

    .line 1786
    .line 1787
    move-object v0, v15

    .line 1788
    :cond_39
    check-cast v0, Ljava/util/List;

    .line 1789
    .line 1790
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1791
    .line 1792
    .line 1793
    new-instance v0, Lf7;

    .line 1794
    .line 1795
    invoke-direct {v0, v13, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1796
    .line 1797
    .line 1798
    new-instance v1, Lfj0;

    .line 1799
    .line 1800
    const/16 v2, 0x1a

    .line 1801
    .line 1802
    invoke-direct {v1, v2}, Lfj0;-><init>(I)V

    .line 1803
    .line 1804
    .line 1805
    new-instance v2, Ly30;

    .line 1806
    .line 1807
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1808
    .line 1809
    .line 1810
    new-instance v0, Lfj0;

    .line 1811
    .line 1812
    const/16 v1, 0x1b

    .line 1813
    .line 1814
    invoke-direct {v0, v1}, Lfj0;-><init>(I)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v1, Ly30;

    .line 1818
    .line 1819
    invoke-direct {v1, v2, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1820
    .line 1821
    .line 1822
    new-instance v0, Luh0;

    .line 1823
    .line 1824
    invoke-direct {v0, v14}, Luh0;-><init>(I)V

    .line 1825
    .line 1826
    .line 1827
    new-instance v2, Lfj0;

    .line 1828
    .line 1829
    const/16 v3, 0x1c

    .line 1830
    .line 1831
    invoke-direct {v2, v3}, Lfj0;-><init>(I)V

    .line 1832
    .line 1833
    .line 1834
    new-instance v3, Lbu;

    .line 1835
    .line 1836
    invoke-static {v1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v1

    .line 1840
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1841
    .line 1842
    .line 1843
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v0

    .line 1847
    invoke-direct {v3, v0, v2}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 1848
    .line 1849
    .line 1850
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v0

    .line 1854
    if-nez v0, :cond_3a

    .line 1855
    .line 1856
    goto :goto_2b

    .line 1857
    :cond_3a
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v0

    .line 1861
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1862
    .line 1863
    .line 1864
    move-result v1

    .line 1865
    if-nez v1, :cond_3b

    .line 1866
    .line 1867
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v15

    .line 1871
    goto :goto_2b

    .line 1872
    :cond_3b
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v15

    .line 1876
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1877
    .line 1878
    .line 1879
    move-result v0

    .line 1880
    if-eqz v0, :cond_3c

    .line 1881
    .line 1882
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v0

    .line 1886
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1887
    .line 1888
    .line 1889
    goto :goto_2a

    .line 1890
    :cond_3c
    :goto_2b
    return-object v15

    .line 1891
    :pswitch_17
    move-object/from16 v0, p1

    .line 1892
    .line 1893
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1894
    .line 1895
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1896
    .line 1897
    .line 1898
    new-instance v1, Ljava/util/ArrayList;

    .line 1899
    .line 1900
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1901
    .line 1902
    .line 1903
    invoke-static {v2, v0}, Lx;->Η(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v4

    .line 1907
    invoke-static {v1, v4}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1908
    .line 1909
    .line 1910
    :try_start_11
    sget-object v4, Lzj0;->α:Lzj0;

    .line 1911
    .line 1912
    new-instance v4, Lwj0;

    .line 1913
    .line 1914
    const/16 v5, 0xd

    .line 1915
    .line 1916
    invoke-direct {v4, v5}, Lwj0;-><init>(I)V

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {v0, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v0

    .line 1923
    invoke-static {v0, v2}, Lzj0;->β(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_f

    .line 1927
    goto :goto_2c

    .line 1928
    :catchall_f
    move-exception v0

    .line 1929
    new-instance v4, Leo1;

    .line 1930
    .line 1931
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1932
    .line 1933
    .line 1934
    move-object v0, v4

    .line 1935
    :goto_2c
    instance-of v4, v0, Leo1;

    .line 1936
    .line 1937
    if-eqz v4, :cond_3d

    .line 1938
    .line 1939
    move-object v0, v15

    .line 1940
    :cond_3d
    check-cast v0, Ljava/lang/Iterable;

    .line 1941
    .line 1942
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1943
    .line 1944
    .line 1945
    new-instance v4, Lng;

    .line 1946
    .line 1947
    sget-object v6, Lzj0;->α:Lzj0;

    .line 1948
    .line 1949
    const/4 v10, 0x0

    .line 1950
    const/16 v11, 0x16

    .line 1951
    .line 1952
    const/4 v5, 0x1

    .line 1953
    const-class v7, Lzj0;

    .line 1954
    .line 1955
    const-string v8, "isNoticeSetUnreadCountMethod"

    .line 1956
    .line 1957
    const-string v9, "isNoticeSetUnreadCountMethod(Ljava/lang/reflect/Method;)Z"

    .line 1958
    .line 1959
    invoke-direct/range {v4 .. v11}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1960
    .line 1961
    .line 1962
    invoke-static {v2, v4}, Lx;->Π(Ljava/lang/ClassLoader;La80;)Ljava/util/ArrayList;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1967
    .line 1968
    .line 1969
    new-instance v0, Lf7;

    .line 1970
    .line 1971
    invoke-direct {v0, v13, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1972
    .line 1973
    .line 1974
    new-instance v1, Lwj0;

    .line 1975
    .line 1976
    invoke-direct {v1, v3}, Lwj0;-><init>(I)V

    .line 1977
    .line 1978
    .line 1979
    new-instance v2, Ly30;

    .line 1980
    .line 1981
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1982
    .line 1983
    .line 1984
    new-instance v0, Lwj0;

    .line 1985
    .line 1986
    const/16 v1, 0xf

    .line 1987
    .line 1988
    invoke-direct {v0, v1}, Lwj0;-><init>(I)V

    .line 1989
    .line 1990
    .line 1991
    new-instance v1, Ly30;

    .line 1992
    .line 1993
    invoke-direct {v1, v2, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1994
    .line 1995
    .line 1996
    new-instance v0, Luh0;

    .line 1997
    .line 1998
    const/4 v2, 0x7

    .line 1999
    invoke-direct {v0, v2}, Luh0;-><init>(I)V

    .line 2000
    .line 2001
    .line 2002
    new-instance v2, Lfj0;

    .line 2003
    .line 2004
    invoke-direct {v2, v12}, Lfj0;-><init>(I)V

    .line 2005
    .line 2006
    .line 2007
    new-instance v3, Lbu;

    .line 2008
    .line 2009
    invoke-static {v1}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v1

    .line 2013
    invoke-static {v1, v0}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2014
    .line 2015
    .line 2016
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v0

    .line 2020
    invoke-direct {v3, v0, v2}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 2021
    .line 2022
    .line 2023
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2024
    .line 2025
    .line 2026
    move-result v0

    .line 2027
    if-nez v0, :cond_3e

    .line 2028
    .line 2029
    goto :goto_2e

    .line 2030
    :cond_3e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v0

    .line 2034
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2035
    .line 2036
    .line 2037
    move-result v1

    .line 2038
    if-nez v1, :cond_3f

    .line 2039
    .line 2040
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v15

    .line 2044
    goto :goto_2e

    .line 2045
    :cond_3f
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v15

    .line 2049
    :goto_2d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2050
    .line 2051
    .line 2052
    move-result v0

    .line 2053
    if-eqz v0, :cond_40

    .line 2054
    .line 2055
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v0

    .line 2059
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2060
    .line 2061
    .line 2062
    goto :goto_2d

    .line 2063
    :cond_40
    :goto_2e
    return-object v15

    .line 2064
    :pswitch_18
    move-object/from16 v0, p1

    .line 2065
    .line 2066
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2067
    .line 2068
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2069
    .line 2070
    .line 2071
    sget-object v1, Lvj0;->α:Lvj0;

    .line 2072
    .line 2073
    invoke-static {v0, v2, v13}, Lvj0;->λ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v3

    .line 2077
    invoke-virtual {v1, v3}, Lvj0;->φ(Ljava/util/List;)Ljava/util/List;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v4

    .line 2081
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 2082
    .line 2083
    .line 2084
    move-result v6

    .line 2085
    if-ne v6, v5, :cond_41

    .line 2086
    .line 2087
    move-object v13, v4

    .line 2088
    goto :goto_2f

    .line 2089
    :cond_41
    const/4 v13, 0x0

    .line 2090
    :goto_2f
    if-eqz v13, :cond_42

    .line 2091
    .line 2092
    goto :goto_30

    .line 2093
    :cond_42
    invoke-static {v0, v2, v11}, Lvj0;->λ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v0

    .line 2097
    invoke-static {v3, v0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v0

    .line 2101
    invoke-virtual {v1, v0}, Lvj0;->φ(Ljava/util/List;)Ljava/util/List;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v13

    .line 2105
    :goto_30
    return-object v13

    .line 2106
    :pswitch_19
    move-object/from16 v0, p1

    .line 2107
    .line 2108
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2109
    .line 2110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2111
    .line 2112
    .line 2113
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 2114
    .line 2115
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2116
    .line 2117
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2118
    .line 2119
    .line 2120
    const-string v3, "im_msg_list_same_item_id_exception"

    .line 2121
    .line 2122
    :try_start_12
    sget-object v4, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 2123
    .line 2124
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v4

    .line 2128
    sget-object v5, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 2129
    .line 2130
    invoke-virtual {v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v5

    .line 2134
    filled-new-array {v3}, [Ljava/lang/String;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v3

    .line 2138
    invoke-virtual {v5, v3}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v3

    .line 2142
    invoke-virtual {v4, v3}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v3

    .line 2146
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v0

    .line 2150
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v3

    .line 2154
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2155
    .line 2156
    .line 2157
    :cond_43
    :goto_31
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2158
    .line 2159
    .line 2160
    move-result v0

    .line 2161
    if-eqz v0, :cond_47

    .line 2162
    .line 2163
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v0

    .line 2167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2168
    .line 2169
    .line 2170
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    .line 2171
    .line 2172
    :try_start_13
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    .line 2176
    goto :goto_32

    .line 2177
    :catchall_10
    move-exception v0

    .line 2178
    :try_start_14
    new-instance v4, Leo1;

    .line 2179
    .line 2180
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2181
    .line 2182
    .line 2183
    move-object v0, v4

    .line 2184
    :goto_32
    instance-of v4, v0, Leo1;

    .line 2185
    .line 2186
    if-eqz v4, :cond_44

    .line 2187
    .line 2188
    const/4 v0, 0x0

    .line 2189
    :cond_44
    check-cast v0, Ljava/lang/reflect/Method;

    .line 2190
    .line 2191
    if-nez v0, :cond_45

    .line 2192
    .line 2193
    goto :goto_31

    .line 2194
    :cond_45
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    if-nez v0, :cond_46

    .line 2199
    .line 2200
    goto :goto_31

    .line 2201
    :cond_46
    invoke-static {v0}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 2202
    .line 2203
    .line 2204
    move-result v4

    .line 2205
    if-eqz v4, :cond_43

    .line 2206
    .line 2207
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    .line 2208
    .line 2209
    .line 2210
    goto :goto_31

    .line 2211
    :catchall_11
    move-exception v0

    .line 2212
    new-instance v9, Leo1;

    .line 2213
    .line 2214
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2215
    .line 2216
    .line 2217
    :cond_47
    invoke-static {v9}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v0

    .line 2221
    if-eqz v0, :cond_48

    .line 2222
    .line 2223
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2224
    .line 2225
    .line 2226
    :cond_48
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v0

    .line 2230
    return-object v0

    .line 2231
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2232
    .line 2233
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2234
    .line 2235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2236
    .line 2237
    .line 2238
    new-instance v5, Ljava/util/ArrayList;

    .line 2239
    .line 2240
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2241
    .line 2242
    .line 2243
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 2244
    .line 2245
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v0

    .line 2249
    const-string v7, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 2250
    .line 2251
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v7

    .line 2255
    filled-new-array {v0, v7}, [Ljava/lang/String;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v0

    .line 2259
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v7

    .line 2267
    :cond_49
    :goto_33
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2268
    .line 2269
    .line 2270
    move-result v0

    .line 2271
    if-eqz v0, :cond_4c

    .line 2272
    .line 2273
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v0

    .line 2277
    move-object v10, v0

    .line 2278
    check-cast v10, Ljava/lang/String;

    .line 2279
    .line 2280
    :try_start_15
    new-instance v0, Ls9;

    .line 2281
    .line 2282
    invoke-direct {v0, v10, v4}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 2283
    .line 2284
    .line 2285
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v0

    .line 2289
    new-instance v11, Ljava/util/ArrayList;

    .line 2290
    .line 2291
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2292
    .line 2293
    .line 2294
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v0

    .line 2298
    :cond_4a
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2299
    .line 2300
    .line 2301
    move-result v12

    .line 2302
    if-eqz v12, :cond_4b

    .line 2303
    .line 2304
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v12

    .line 2308
    check-cast v12, Lorg/luckypray/dexkit/result/MethodData;

    .line 2309
    .line 2310
    invoke-virtual {v12, v2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v12

    .line 2314
    if-eqz v12, :cond_4a

    .line 2315
    .line 2316
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2317
    .line 2318
    .line 2319
    goto :goto_34

    .line 2320
    :catchall_12
    move-exception v0

    .line 2321
    goto :goto_35

    .line 2322
    :cond_4b
    invoke-static {v5, v11}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    .line 2323
    .line 2324
    .line 2325
    move-object v11, v9

    .line 2326
    goto :goto_36

    .line 2327
    :goto_35
    new-instance v11, Leo1;

    .line 2328
    .line 2329
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2330
    .line 2331
    .line 2332
    :goto_36
    invoke-static {v11}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v0

    .line 2336
    if-eqz v0, :cond_49

    .line 2337
    .line 2338
    const-string v11, "r45da87c70c377d6f"

    .line 2339
    .line 2340
    const-string v12, "DexKit \u5b9a\u4f4d\u89c6\u9891 UrlModel Getter \u5931\u8d25 returnType="

    .line 2341
    .line 2342
    invoke-static {v12, v10, v11, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2343
    .line 2344
    .line 2345
    goto :goto_33

    .line 2346
    :cond_4c
    new-instance v0, Lf7;

    .line 2347
    .line 2348
    invoke-direct {v0, v13, v5}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 2349
    .line 2350
    .line 2351
    new-instance v1, Ls20;

    .line 2352
    .line 2353
    invoke-direct {v1, v6}, Ls20;-><init>(I)V

    .line 2354
    .line 2355
    .line 2356
    new-instance v2, Ly30;

    .line 2357
    .line 2358
    invoke-direct {v2, v0, v13, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 2359
    .line 2360
    .line 2361
    new-instance v0, Ls20;

    .line 2362
    .line 2363
    invoke-direct {v0, v3}, Ls20;-><init>(I)V

    .line 2364
    .line 2365
    .line 2366
    invoke-static {v2, v0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v0

    .line 2370
    new-instance v1, Lqt;

    .line 2371
    .line 2372
    const/16 v2, 0x11

    .line 2373
    .line 2374
    invoke-direct {v1, v2}, Lqt;-><init>(I)V

    .line 2375
    .line 2376
    .line 2377
    new-instance v2, Lcu;

    .line 2378
    .line 2379
    invoke-direct {v2, v0, v8, v1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2380
    .line 2381
    .line 2382
    new-instance v0, Ls20;

    .line 2383
    .line 2384
    const/16 v1, 0xf

    .line 2385
    .line 2386
    invoke-direct {v0, v1}, Ls20;-><init>(I)V

    .line 2387
    .line 2388
    .line 2389
    new-instance v1, Ly30;

    .line 2390
    .line 2391
    invoke-direct {v1, v2, v13, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 2392
    .line 2393
    .line 2394
    new-instance v0, Ls20;

    .line 2395
    .line 2396
    const/16 v2, 0x10

    .line 2397
    .line 2398
    invoke-direct {v0, v2}, Ls20;-><init>(I)V

    .line 2399
    .line 2400
    .line 2401
    new-instance v2, Lbu;

    .line 2402
    .line 2403
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v1

    .line 2407
    invoke-direct {v2, v1, v0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 2408
    .line 2409
    .line 2410
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2411
    .line 2412
    .line 2413
    move-result v0

    .line 2414
    if-nez v0, :cond_4d

    .line 2415
    .line 2416
    goto :goto_38

    .line 2417
    :cond_4d
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v0

    .line 2421
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2422
    .line 2423
    .line 2424
    move-result v1

    .line 2425
    if-nez v1, :cond_4e

    .line 2426
    .line 2427
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v15

    .line 2431
    goto :goto_38

    .line 2432
    :cond_4e
    invoke-static {v0}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v15

    .line 2436
    :goto_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2437
    .line 2438
    .line 2439
    move-result v0

    .line 2440
    if-eqz v0, :cond_4f

    .line 2441
    .line 2442
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v0

    .line 2446
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2447
    .line 2448
    .line 2449
    goto :goto_37

    .line 2450
    :cond_4f
    :goto_38
    return-object v15

    .line 2451
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2452
    .line 2453
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2454
    .line 2455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2456
    .line 2457
    .line 2458
    new-instance v1, Ljava/util/ArrayList;

    .line 2459
    .line 2460
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2461
    .line 2462
    .line 2463
    const-string v8, "insertPreloadMedia"

    .line 2464
    .line 2465
    const-string v9, "startDataLoader"

    .line 2466
    .line 2467
    const-string v3, "setIntValue"

    .line 2468
    .line 2469
    const-string v4, "addTask"

    .line 2470
    .line 2471
    const-string v5, "addPreloadModelMedia"

    .line 2472
    .line 2473
    const-string v6, "addPriorityPreloadTask"

    .line 2474
    .line 2475
    const-string v7, "addPreloadMedias"

    .line 2476
    .line 2477
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v3

    .line 2481
    invoke-static {v3}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v3

    .line 2485
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v3

    .line 2489
    :catchall_13
    :goto_39
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2490
    .line 2491
    .line 2492
    move-result v4

    .line 2493
    if-eqz v4, :cond_52

    .line 2494
    .line 2495
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v4

    .line 2499
    check-cast v4, Ljava/lang/String;

    .line 2500
    .line 2501
    :try_start_16
    new-instance v5, Ls9;

    .line 2502
    .line 2503
    invoke-direct {v5, v4, v12}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 2504
    .line 2505
    .line 2506
    invoke-virtual {v0, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v4

    .line 2510
    new-instance v5, Ljava/util/ArrayList;

    .line 2511
    .line 2512
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v4

    .line 2519
    :cond_50
    :goto_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2520
    .line 2521
    .line 2522
    move-result v6

    .line 2523
    if-eqz v6, :cond_51

    .line 2524
    .line 2525
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v6

    .line 2529
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;

    .line 2530
    .line 2531
    invoke-static {v6, v2}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v6

    .line 2535
    if-eqz v6, :cond_50

    .line 2536
    .line 2537
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2538
    .line 2539
    .line 2540
    goto :goto_3a

    .line 2541
    :cond_51
    invoke-static {v1, v5}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 2542
    .line 2543
    .line 2544
    goto :goto_39

    .line 2545
    :cond_52
    invoke-static {v1}, Lpd2;->ο(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v0

    .line 2549
    return-object v0

    .line 2550
    :pswitch_1c
    move-object/from16 v0, p1

    .line 2551
    .line 2552
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2553
    .line 2554
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2555
    .line 2556
    .line 2557
    :try_start_17
    new-instance v1, Ll20;

    .line 2558
    .line 2559
    invoke-direct {v1, v12}, Ll20;-><init>(I)V

    .line 2560
    .line 2561
    .line 2562
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v0

    .line 2566
    new-instance v1, Ljava/util/ArrayList;

    .line 2567
    .line 2568
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2569
    .line 2570
    .line 2571
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v0

    .line 2575
    :cond_53
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2576
    .line 2577
    .line 2578
    move-result v3

    .line 2579
    if-eqz v3, :cond_54

    .line 2580
    .line 2581
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v3

    .line 2585
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 2586
    .line 2587
    invoke-static {v3, v2}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v3

    .line 2591
    if-eqz v3, :cond_53

    .line 2592
    .line 2593
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_14

    .line 2594
    .line 2595
    .line 2596
    goto :goto_3b

    .line 2597
    :catchall_14
    move-exception v0

    .line 2598
    new-instance v1, Leo1;

    .line 2599
    .line 2600
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2601
    .line 2602
    .line 2603
    :cond_54
    instance-of v0, v1, Leo1;

    .line 2604
    .line 2605
    if-eqz v0, :cond_55

    .line 2606
    .line 2607
    goto :goto_3c

    .line 2608
    :cond_55
    move-object v15, v1

    .line 2609
    :goto_3c
    check-cast v15, Ljava/util/List;

    .line 2610
    .line 2611
    return-object v15

    .line 2612
    nop

    .line 2613
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
