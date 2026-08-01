.class public final Leh;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Leh;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ε:Ljava/util/Map;

.field public static volatile ζ:Z

.field public static volatile η:Ljava/lang/reflect/Method;

.field public static volatile θ:Lw0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Leh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leh;->α:Leh;

    .line 7
    .line 8
    new-instance v0, Ldh;

    .line 9
    .line 10
    const-string v1, "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FE55BEEB53651A3D9FCA8F6DFFFA7C43B5D51C35C040DA683C463A6A38124B5FB87EE6088DA06E7332125C97D9CF2CC318B6F73"

    .line 11
    .line 12
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "\u5531\u7247"

    .line 17
    .line 18
    const-string v3, "3903 music cover"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3}, Ldh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ldh;

    .line 24
    .line 25
    const-string v2, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B6D0672FD037E761E35B71F3B4E52AFBBE6B6AF8A56E29C8DCEEACC2ECCC88C7C8DD3FC35789B8235F2BE07881D34EC212579"

    .line 26
    .line 27
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "\u542c\u97f3\u4e50"

    .line 32
    .line 33
    const-string v4, "3903 listen cover"

    .line 34
    .line 35
    invoke-direct {v1, v2, v3, v4}, Ldh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    filled-new-array {v0, v1}, [Ldh;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Leh;->β:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Leh;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 53
    .line 54
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Leh;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 59
    .line 60
    new-instance v0, Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sput-object v0, Leh;->ε:Ljava/util/Map;

    .line 73
    .line 74
    return-void
.end method

.method public static α()Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    sget-object v1, Leh;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroid/view/View;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_1
    if-ne v2, v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-object v0
.end method

.method public static β(Ljava/lang/ClassLoader;)V
    .locals 16

    .line 1
    sget-object v1, Ls62;->α:Ls62;

    .line 2
    .line 3
    sget-boolean v0, Leh;->ζ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v0, "~78DBC59980EBBAB6E9CCD251AC4B8380FEA2F16AC26F2F72557622D1948C9C49C53378AB91649ED6CBF2598FFB50FA29875946BA0235B57F6A8007CB465B6B8313D1AFF15C31EDFED19A2993F74B0E421D5A3F"

    .line 11
    .line 12
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object/from16 v2, p0

    .line 17
    .line 18
    invoke-static {v2, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    new-instance v2, Leo1;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v2

    .line 30
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x4

    .line 35
    const-string v4, "r9151163aa4084a59"

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    if-nez v2, :cond_10

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    array-length v7, v0

    .line 56
    const/4 v9, 0x0

    .line 57
    :goto_1
    if-ge v9, v7, :cond_2

    .line 58
    .line 59
    aget-object v10, v0, v9

    .line 60
    .line 61
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    if-nez v11, :cond_1

    .line 70
    .line 71
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-nez v11, :cond_1

    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-nez v11, :cond_1

    .line 86
    .line 87
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-nez v11, :cond_1

    .line 92
    .line 93
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-eqz v11, :cond_1

    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    const-class v12, Landroid/graphics/Bitmap;

    .line 110
    .line 111
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-static {v11, v12}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-eqz v11, :cond_1

    .line 120
    .line 121
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v7, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    array-length v9, v0

    .line 140
    const/4 v10, 0x0

    .line 141
    :goto_2
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    if-ge v10, v9, :cond_4

    .line 144
    .line 145
    aget-object v12, v0, v10

    .line 146
    .line 147
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-nez v13, :cond_3

    .line 156
    .line 157
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-nez v13, :cond_3

    .line 166
    .line 167
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    if-nez v13, :cond_3

    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-nez v13, :cond_3

    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-static {v13, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_3

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 194
    .line 195
    filled-new-array {v13, v13, v13}, [Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    invoke-static {v11, v13}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    if-eqz v11, :cond_3

    .line 204
    .line 205
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_4
    invoke-static {v7}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Ljava/lang/reflect/Method;

    .line 216
    .line 217
    const/4 v9, 0x1

    .line 218
    if-eqz v0, :cond_5

    .line 219
    .line 220
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_5
    move-object v0, v5

    .line 225
    :goto_3
    sput-object v0, Leh;->η:Ljava/lang/reflect/Method;

    .line 226
    .line 227
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eq v0, v9, :cond_6

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    new-instance v10, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v12, "GL \u5531\u7247\u505c\u6b62\u5165\u53e3\u4e0d\u552f\u4e00: class="

    .line 244
    .line 245
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v0, ", count="

    .line 252
    .line 253
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    const/4 v7, 0x0

    .line 271
    :cond_7
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    const-string v10, ", "

    .line 276
    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    move-object v12, v0

    .line 284
    check-cast v12, Ljava/lang/reflect/Method;

    .line 285
    .line 286
    :try_start_1
    invoke-virtual {v12, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lxq0;->α:Lxq0;

    .line 290
    .line 291
    new-instance v13, Lxe;

    .line 292
    .line 293
    const/4 v14, 0x2

    .line 294
    invoke-direct {v13, v14, v12}, Lxe;-><init>(ILjava/lang/reflect/Method;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v12, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 298
    .line 299
    .line 300
    add-int/lit8 v7, v7, 0x1

    .line 301
    .line 302
    invoke-static {v12}, Leh;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    new-instance v13, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    const-string v14, "GL \u5531\u7247\u542f\u52a8 Hook \u5df2\u5b89\u88c5: "

    .line 312
    .line 313
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 324
    .line 325
    .line 326
    move-object v13, v1

    .line 327
    goto :goto_5

    .line 328
    :catchall_1
    move-exception v0

    .line 329
    new-instance v13, Leo1;

    .line 330
    .line 331
    invoke-direct {v13, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    :goto_5
    invoke-static {v13}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-eqz v0, :cond_7

    .line 339
    .line 340
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v12

    .line 344
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    const-string v13, "GL \u5531\u7247\u542f\u52a8 Hook \u5931\u8d25: "

    .line 349
    .line 350
    invoke-static {v13, v12, v10, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    array-length v2, v0

    .line 366
    move-object v13, v5

    .line 367
    const/4 v6, 0x0

    .line 368
    const/4 v12, 0x0

    .line 369
    :goto_6
    if-ge v6, v2, :cond_b

    .line 370
    .line 371
    aget-object v14, v0, v6

    .line 372
    .line 373
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v15

    .line 377
    const-string v8, "LIZJ"

    .line 378
    .line 379
    invoke-static {v15, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    if-eqz v8, :cond_a

    .line 384
    .line 385
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    if-nez v8, :cond_a

    .line 394
    .line 395
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 400
    .line 401
    .line 402
    move-result v8

    .line 403
    if-nez v8, :cond_a

    .line 404
    .line 405
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    invoke-static {v8, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v8

    .line 413
    if-eqz v8, :cond_a

    .line 414
    .line 415
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    array-length v8, v8

    .line 423
    if-nez v8, :cond_a

    .line 424
    .line 425
    if-eqz v12, :cond_9

    .line 426
    .line 427
    :goto_7
    move-object v13, v5

    .line 428
    goto :goto_8

    .line 429
    :cond_9
    move v12, v9

    .line 430
    move-object v13, v14

    .line 431
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 432
    .line 433
    goto :goto_6

    .line 434
    :cond_b
    if-nez v12, :cond_c

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_c
    :goto_8
    if-eqz v13, :cond_d

    .line 438
    .line 439
    :try_start_2
    invoke-virtual {v13, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 440
    .line 441
    .line 442
    sget-object v0, Lxq0;->α:Lxq0;

    .line 443
    .line 444
    new-instance v2, Lxe;

    .line 445
    .line 446
    const/4 v6, 0x3

    .line 447
    invoke-direct {v2, v6, v13}, Lxe;-><init>(ILjava/lang/reflect/Method;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v13, v2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 451
    .line 452
    .line 453
    add-int/lit8 v7, v7, 0x1

    .line 454
    .line 455
    invoke-static {v13}, Leh;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v2, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    const-string v6, "GL \u5531\u7247\u6062\u590d Hook \u5df2\u5b89\u88c5: "

    .line 465
    .line 466
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 477
    .line 478
    .line 479
    goto :goto_9

    .line 480
    :catchall_2
    move-exception v0

    .line 481
    new-instance v1, Leo1;

    .line 482
    .line 483
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 484
    .line 485
    .line 486
    :goto_9
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    if-eqz v0, :cond_e

    .line 491
    .line 492
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    const-string v2, "GL \u5531\u7247\u6062\u590d Hook \u5931\u8d25: "

    .line 501
    .line 502
    invoke-static {v2, v1, v10, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_d
    const-string v0, "GL \u5531\u7247\u6062\u590d\u5165\u53e3\u672a\u547d\u4e2d: LIZJ"

    .line 511
    .line 512
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    :cond_e
    :goto_a
    if-lez v7, :cond_f

    .line 516
    .line 517
    move v8, v9

    .line 518
    goto :goto_b

    .line 519
    :cond_f
    const/4 v8, 0x0

    .line 520
    :goto_b
    sput-boolean v8, Leh;->ζ:Z

    .line 521
    .line 522
    return-void

    .line 523
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v1, "GL \u5531\u7247\u7c7b\u672a\u547d\u4e2d: "

    .line 528
    .line 529
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-static {v4, v0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    return-void
.end method

.method public static δ()Z
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Leh;->θ:Lw0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lw0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    new-instance v1, Leo1;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v0, v1

    .line 32
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "GL \u5531\u7247\u7b56\u7565\u8bfb\u53d6\u5931\u8d25: "

    .line 44
    .line 45
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x4

    .line 50
    const-string v2, "r9151163aa4084a59"

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    return v0
.end method

.method public static ε(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v3, Lwe;

    .line 21
    .line 22
    const/16 v4, 0x1b

    .line 23
    .line 24
    invoke-direct {v3, v4}, Lwe;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/16 v4, 0x1e

    .line 28
    .line 29
    const-string v5, ","

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-static {v2, v5, v6, v3, v4}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v3, "#"

    .line 45
    .line 46
    const-string v4, "("

    .line 47
    .line 48
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "):"

    .line 53
    .line 54
    invoke-static {v0, v1, p0}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static ζ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Leh;->ε:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    :goto_0
    monitor-exit v0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    sget-object v1, Leh;->η:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0

    .line 40
    throw p0

    .line 41
    :cond_2
    :try_start_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    filled-new-array {v2, v0, v2}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    new-instance v1, Leo1;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    sget-object v1, Leh;->ε:Ljava/util/Map;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    .line 72
    .line 73
    monitor-exit v1

    .line 74
    const-string p0, "r9151163aa4084a59"

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "GL \u5531\u7247\u505c\u6b62\u5931\u8d25: reason="

    .line 81
    .line 82
    const-string v2, ", "

    .line 83
    .line 84
    invoke-static {v1, p1, v2, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const/4 v0, 0x4

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {p0, p1, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_2
    move-exception p0

    .line 95
    monitor-exit v1

    .line 96
    throw p0

    .line 97
    :cond_3
    :goto_2
    return-void

    .line 98
    :catchall_3
    move-exception p0

    .line 99
    monitor-exit v0

    .line 100
    throw p0
.end method


# virtual methods
.method public final γ(Ljava/lang/ClassLoader;Ldh;Lig;)V
    .locals 16

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, v1, Ldh;->α:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, v1, Ldh;->β:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v4, Leh;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 8
    .line 9
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    move-object/from16 v0, p1

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0, v2}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    new-instance v5, Leo1;

    .line 26
    .line 27
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v5

    .line 31
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v7, "r9151163aa4084a59"

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-nez v5, :cond_8

    .line 39
    .line 40
    check-cast v0, Ljava/lang/Class;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v9, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    array-length v10, v5

    .line 55
    const/4 v11, 0x0

    .line 56
    :goto_1
    const/4 v12, 0x1

    .line 57
    if-ge v11, v10, :cond_5

    .line 58
    .line 59
    aget-object v13, v5, v11

    .line 60
    .line 61
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-nez v14, :cond_4

    .line 70
    .line 71
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    if-eqz v14, :cond_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-nez v14, :cond_4

    .line 87
    .line 88
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-eqz v14, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    const-class v14, Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    invoke-virtual {v14, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    if-nez v14, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    array-length v15, v14

    .line 113
    const/4 v6, 0x3

    .line 114
    if-ne v15, v6, :cond_4

    .line 115
    .line 116
    const-class v6, Landroid/content/Context;

    .line 117
    .line 118
    aget-object v12, v14, v12

    .line 119
    .line 120
    invoke-virtual {v6, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_4

    .line 125
    .line 126
    const/4 v6, 0x2

    .line 127
    aget-object v6, v14, v6

    .line 128
    .line 129
    const-class v12, Landroid/view/ViewGroup;

    .line 130
    .line 131
    invoke-virtual {v12, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_4

    .line 136
    .line 137
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eq v5, v12, :cond_6

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    new-instance v2, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v3, "\u521b\u5efa\u5165\u53e3\u4e0d\u552f\u4e00\uff0c\u62d2\u7edd\u5b89\u88c5: class="

    .line 166
    .line 167
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, ", count="

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/4 v1, 0x4

    .line 186
    invoke-static {v7, v0, v8, v1, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_6
    invoke-static {v9}, Lxh;->Щ(Ljava/util/List;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Ljava/lang/reflect/Method;

    .line 195
    .line 196
    :try_start_1
    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 197
    .line 198
    .line 199
    sget-object v5, Lxq0;->α:Lxq0;

    .line 200
    .line 201
    new-instance v6, Lqg;

    .line 202
    .line 203
    const/4 v9, 0x2

    .line 204
    move-object/from16 v10, p0

    .line 205
    .line 206
    move-object/from16 v11, p3

    .line 207
    .line 208
    invoke-direct {v6, v10, v11, v1, v9}, Lqg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v0, v6}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    invoke-static {v0}, Leh;->ε(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v2, "\u521b\u5efa Hook \u5df2\u5b89\u88c5: "

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const/4 v1, 0x4

    .line 242
    invoke-static {v7, v0, v8, v1, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :catchall_1
    move-exception v0

    .line 249
    new-instance v1, Leo1;

    .line 250
    .line 251
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    move-object v0, v1

    .line 255
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v1, "\u521b\u5efa Hook \u5931\u8d25: "

    .line 266
    .line 267
    invoke-static {v3, v1, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const/4 v1, 0x4

    .line 272
    invoke-static {v7, v0, v8, v1, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_7
    :goto_4
    return-void

    .line 276
    :cond_8
    const/4 v1, 0x4

    .line 277
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const-string v2, "\u6ce8\u518c\u7c7b\u672a\u547d\u4e2d: "

    .line 282
    .line 283
    invoke-static {v3, v2, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v7, v0, v8, v1, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method
