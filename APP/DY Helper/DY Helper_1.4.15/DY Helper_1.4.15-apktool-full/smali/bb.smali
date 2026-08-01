.class public final synthetic Lbb;
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
    iput p2, p0, Lbb;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

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
    iput p3, p0, Lbb;->ε:I

    iput-object p1, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyl;->α:Lyl;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"

    .line 14
    .line 15
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"

    .line 20
    .line 21
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    filled-new-array {v1, v2}, [Ljava/lang/String;

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
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    :try_start_0
    new-instance v4, Ls9;

    .line 52
    .line 53
    const/16 v5, 0xf

    .line 54
    .line 55
    invoke-direct {v4, v2, v5}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 77
    .line 78
    :try_start_1
    invoke-virtual {v5, v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    goto :goto_2

    .line 83
    :catchall_0
    move-exception v5

    .line 84
    :try_start_2
    new-instance v6, Leo1;

    .line 85
    .line 86
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object v5, v6

    .line 90
    :goto_2
    instance-of v6, v5, Leo1;

    .line 91
    .line 92
    if-eqz v6, :cond_1

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    :cond_1
    check-cast v5, Ljava/lang/reflect/Method;

    .line 96
    .line 97
    invoke-static {v0, v5}, Lyl;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    move-exception v3

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    sget-object v3, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :goto_3
    new-instance v4, Leo1;

    .line 107
    .line 108
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    move-object v3, v4

    .line 112
    :goto_4
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_0

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    const-string v4, "DexKit query failed for "

    .line 123
    .line 124
    const-string v5, ": "

    .line 125
    .line 126
    const-string v6, "r931d7e30ef229d29"

    .line 127
    .line 128
    invoke-static {v4, v2, v5, v3, v6}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_3
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    invoke-static {v3}, Lyl;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Ljava/lang/reflect/Method;

    .line 157
    .line 158
    invoke-static {v0, p1}, Lyl;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_4
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    check-cast p0, Ljava/lang/Iterable;

    .line 170
    .line 171
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0
.end method

.method private final γ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    sget-object v0, Lyl;->α:Lyl;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lwj;

    .line 16
    .line 17
    const/16 v3, 0x1d

    .line 18
    .line 19
    invoke-direct {v0, v3}, Lwj;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    move-object/from16 v4, p0

    .line 35
    .line 36
    iget-object v5, v4, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 37
    .line 38
    const-string v6, "):"

    .line 39
    .line 40
    const-string v7, "("

    .line 41
    .line 42
    const-string v8, "#"

    .line 43
    .line 44
    const/4 v11, 0x1

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v0, v5}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    new-instance v5, Leo1;

    .line 64
    .line 65
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v5

    .line 69
    :goto_1
    instance-of v5, v0, Leo1;

    .line 70
    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    goto :goto_2

    .line 75
    :cond_0
    move-object v9, v0

    .line 76
    :goto_2
    check-cast v9, Ljava/lang/Class;

    .line 77
    .line 78
    if-eqz v9, :cond_4

    .line 79
    .line 80
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    new-instance v5, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    array-length v9, v0

    .line 92
    const/4 v12, 0x0

    .line 93
    :goto_3
    if-ge v12, v9, :cond_2

    .line 94
    .line 95
    aget-object v13, v0, v12

    .line 96
    .line 97
    invoke-static {v13}, Lyl;->ι(Ljava/lang/reflect/Method;)Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-eqz v14, :cond_1

    .line 102
    .line 103
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_1
    add-int/lit8 v12, v12, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-virtual {v5, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    invoke-static {v12, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance v15, Ljava/util/ArrayList;

    .line 152
    .line 153
    array-length v10, v14

    .line 154
    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    array-length v10, v14

    .line 158
    const/4 v11, 0x0

    .line 159
    :goto_5
    if-ge v11, v10, :cond_3

    .line 160
    .line 161
    move-object/from16 v23, v0

    .line 162
    .line 163
    aget-object v0, v14, v11

    .line 164
    .line 165
    move-object/from16 v24, v3

    .line 166
    .line 167
    const/4 v3, 0x1

    .line 168
    invoke-static {v0, v15, v11, v3}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    move-object/from16 v0, v23

    .line 173
    .line 174
    move-object/from16 v3, v24

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_3
    move-object/from16 v23, v0

    .line 178
    .line 179
    move-object/from16 v24, v3

    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 186
    .line 187
    .line 188
    const/16 v20, 0x0

    .line 189
    .line 190
    const/16 v21, 0x3e

    .line 191
    .line 192
    const-string v16, ","

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    const/16 v19, 0x0

    .line 199
    .line 200
    invoke-static/range {v15 .. v21}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v9, v8, v12, v7, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-object/from16 v0, v23

    .line 222
    .line 223
    const/4 v11, 0x1

    .line 224
    goto :goto_4

    .line 225
    :cond_4
    move-object/from16 v24, v3

    .line 226
    .line 227
    move-object/from16 v3, v24

    .line 228
    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_5
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_9

    .line 236
    .line 237
    new-instance v0, Lul;

    .line 238
    .line 239
    const/4 v3, 0x0

    .line 240
    invoke-direct {v0, v3}, Lul;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_9

    .line 256
    .line 257
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 262
    .line 263
    :try_start_1
    invoke-virtual {v0, v5}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 264
    .line 265
    .line 266
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 267
    goto :goto_7

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    new-instance v4, Leo1;

    .line 270
    .line 271
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    move-object v0, v4

    .line 275
    :goto_7
    instance-of v4, v0, Leo1;

    .line 276
    .line 277
    if-eqz v4, :cond_6

    .line 278
    .line 279
    const/4 v0, 0x0

    .line 280
    :cond_6
    check-cast v0, Ljava/lang/reflect/Method;

    .line 281
    .line 282
    if-eqz v0, :cond_8

    .line 283
    .line 284
    invoke-static {v0}, Lyl;->ι(Ljava/lang/reflect/Method;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-eqz v4, :cond_8

    .line 289
    .line 290
    const/4 v4, 0x1

    .line 291
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-static {v10, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v13, Ljava/util/ArrayList;

    .line 318
    .line 319
    array-length v14, v12

    .line 320
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    array-length v14, v12

    .line 324
    move v15, v3

    .line 325
    :goto_8
    if-ge v15, v14, :cond_7

    .line 326
    .line 327
    aget-object v3, v12, v15

    .line 328
    .line 329
    const/4 v9, 0x1

    .line 330
    invoke-static {v3, v13, v15, v9}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 331
    .line 332
    .line 333
    move-result v15

    .line 334
    const/4 v3, 0x0

    .line 335
    goto :goto_8

    .line 336
    :cond_7
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 341
    .line 342
    .line 343
    const/16 v18, 0x0

    .line 344
    .line 345
    const/16 v19, 0x3e

    .line 346
    .line 347
    const-string v14, ","

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-static {v4, v8, v10, v7, v3}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    :cond_8
    const/4 v3, 0x0

    .line 376
    goto :goto_6

    .line 377
    :cond_9
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_b

    .line 382
    .line 383
    invoke-static {v5}, Lyl;->λ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_b

    .line 396
    .line 397
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, Ljava/lang/reflect/Method;

    .line 402
    .line 403
    invoke-static {v1}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-static {v4, v1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    new-instance v10, Ljava/util/ArrayList;

    .line 423
    .line 424
    array-length v11, v9

    .line 425
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 426
    .line 427
    .line 428
    array-length v11, v9

    .line 429
    const/4 v12, 0x0

    .line 430
    :goto_a
    if-ge v12, v11, :cond_a

    .line 431
    .line 432
    aget-object v13, v9, v12

    .line 433
    .line 434
    const/4 v14, 0x1

    .line 435
    invoke-static {v13, v10, v12, v14}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 436
    .line 437
    .line 438
    move-result v12

    .line 439
    goto :goto_a

    .line 440
    :cond_a
    const/4 v14, 0x1

    .line 441
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 446
    .line 447
    .line 448
    const/4 v15, 0x0

    .line 449
    const/16 v16, 0x3e

    .line 450
    .line 451
    const-string v11, ","

    .line 452
    .line 453
    const/4 v12, 0x0

    .line 454
    const/4 v13, 0x0

    .line 455
    move/from16 v22, v14

    .line 456
    .line 457
    const/4 v14, 0x0

    .line 458
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    invoke-static {v3, v8, v4, v7, v9}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_b
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    check-cast v0, Ljava/lang/Iterable;

    .line 488
    .line 489
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    return-object v0
.end method

.method private final δ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Ljm;->α:Ljm;

    .line 9
    .line 10
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    new-instance v2, Lhm;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, v3}, Lhm;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v2

    .line 47
    :try_start_2
    new-instance v3, Leo1;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v3

    .line 53
    :goto_1
    instance-of v3, v2, Leo1;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    :cond_0
    check-cast v2, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljm;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    sget-object p1, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_2
    new-instance v2, Leo1;

    .line 70
    .line 71
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p1, v2

    .line 75
    :goto_3
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string v2, "DexKit strict query failed: "

    .line 86
    .line 87
    const-string v3, "rb57159a7dbcb5c6"

    .line 88
    .line 89
    invoke-static {v2, p1, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljm;->θ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ljava/lang/reflect/Method;

    .line 117
    .line 118
    invoke-static {v1, p1}, Ljm;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_3
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    check-cast p0, Ljava/lang/Iterable;

    .line 130
    .line 131
    new-instance p1, Ltf;

    .line 132
    .line 133
    sget-object v0, Ljm;->α:Ljm;

    .line 134
    .line 135
    const/16 v0, 0x16

    .line 136
    .line 137
    invoke-direct {p1, v0}, Ltf;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Ljm;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method private final ζ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    :try_start_0
    new-instance v0, Lhm;

    .line 11
    .line 12
    const/16 v1, 0x19

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lhm;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1, p0}, Lp00;->δ(Lorg/luckypray/dexkit/result/MethodDataList;Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v1, v0

    .line 45
    check-cast v1, Ljava/lang/reflect/Method;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/16 v0, 0xa

    .line 64
    .line 65
    invoke-static {p1, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/reflect/Method;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    move-object v1, v0

    .line 116
    check-cast v1, Ljava/lang/Class;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lp00;->γ(Ljava/lang/Class;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const/16 v2, 0x3e8

    .line 126
    .line 127
    if-lt v1, v2, :cond_3

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    new-instance p0, Lqt;

    .line 134
    .line 135
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 136
    .line 137
    const/16 v0, 0x8

    .line 138
    .line 139
    invoke-direct {p0, v0}, Lqt;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    new-instance p1, Ljava/util/HashSet;

    .line 147
    .line 148
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v0, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    move-object v2, v1

    .line 171
    check-cast v2, Ljava/lang/Class;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_5

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    const/4 p0, 0x4

    .line 188
    invoke-static {v0, p0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    goto :goto_4

    .line 193
    :catchall_0
    move-exception p0

    .line 194
    new-instance p1, Leo1;

    .line 195
    .line 196
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    move-object p0, p1

    .line 200
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-eqz p1, :cond_7

    .line 205
    .line 206
    const-string v0, "r4501f4cd04cb7502"

    .line 207
    .line 208
    const-string v1, "DexKit \u6309\u7ed3\u6784\u5b9a\u4f4d\u957f\u6309\u5e7f\u544a\u5224\u65ad\u7c7b\u5931\u8d25"

    .line 209
    .line 210
    invoke-static {v0, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    instance-of p1, p0, Leo1;

    .line 214
    .line 215
    if-eqz p1, :cond_8

    .line 216
    .line 217
    sget-object p0, Ljz;->ε:Ljz;

    .line 218
    .line 219
    :cond_8
    check-cast p0, Ljava/util/List;

    .line 220
    .line 221
    return-object p0
.end method

.method private final η(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lu00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    new-instance v1, Lq00;

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    invoke-direct {v1, v2}, Lq00;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(La80;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lorg/luckypray/dexkit/result/FieldData;

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/result/FieldData;->getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/reflect/Field;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    move-object v1, v0

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move-object v2, v1

    .line 99
    check-cast v2, Ljava/lang/reflect/Field;

    .line 100
    .line 101
    invoke-static {v2}, Lu00;->γ(Ljava/lang/reflect/Field;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    move-object v4, v3

    .line 110
    check-cast v4, Ljava/lang/reflect/Field;

    .line 111
    .line 112
    invoke-static {v4}, Lu00;->γ(Ljava/lang/reflect/Field;)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-ge v2, v4, :cond_6

    .line 117
    .line 118
    move-object v1, v3

    .line 119
    move v2, v4

    .line 120
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_5

    .line 125
    .line 126
    :goto_2
    check-cast v1, Ljava/lang/reflect/Field;

    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-static {v1}, Lu00;->γ(Ljava/lang/reflect/Field;)I

    .line 131
    .line 132
    .line 133
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    const/16 v2, 0xbb8

    .line 135
    .line 136
    if-lt p1, v2, :cond_7

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    :goto_3
    move-object v1, v0

    .line 140
    goto :goto_5

    .line 141
    :goto_4
    const-string v1, "r2475a9d899053c09"

    .line 142
    .line 143
    const-string v2, "DexKit \u5b9a\u4f4d ViewHolder \u5f53\u524d\u4f5c\u54c1\u5b57\u6bb5\u5931\u8d25"

    .line 144
    .line 145
    invoke-static {v1, v2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :goto_5
    if-nez v1, :cond_8

    .line 150
    .line 151
    invoke-static {v0, p0}, Lu00;->α(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :cond_8
    return-object v1
.end method

.method private final θ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    sget-object v0, Lorg/luckypray/dexkit/query/FindMethod;->Companion:Lorg/luckypray/dexkit/query/FindMethod$Companion;

    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/FindMethod$Companion;->create()Lorg/luckypray/dexkit/query/FindMethod;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v2, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;

    .line 22
    .line 23
    invoke-virtual {v2}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v2, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC516C0DF08B46AFD681258733F65F56ED85D13872AD5795D57F46"

    .line 28
    .line 29
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v7, 0x6

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static/range {v3 .. v8}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    :try_start_2
    new-instance v3, Leo1;

    .line 77
    .line 78
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v3

    .line 82
    :goto_1
    instance-of v3, v0, Leo1;

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    :cond_1
    check-cast v0, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    if-eqz v0, :cond_0

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    move-object p1, v0

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_2
    new-instance v0, Leo1;

    .line 105
    .line 106
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    move-object p1, v0

    .line 110
    :goto_3
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v0, "r4739841e849430ff"

    .line 121
    .line 122
    invoke-static {v0, p1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_5

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    move-object v2, v1

    .line 145
    check-cast v2, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    invoke-static {v2}, Ln10;->δ(Ljava/lang/reflect/Method;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_5
    new-instance v0, Lqt;

    .line 158
    .line 159
    const/16 v1, 0xe

    .line 160
    .line 161
    invoke-direct {v0, v1}, Lqt;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p0}, Ln10;->ε(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p1, p0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Ln10;->β(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0
.end method

.method private final ι(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "gesture_enabled"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "*"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    :cond_0
    sget-object p1, Lx10;->ε:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object p0, p1

    .line 30
    :goto_0
    sget-object p1, Lx10;->α:Lx10;

    .line 31
    .line 32
    invoke-static {p0}, Lx10;->π(Ljava/lang/ClassLoader;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lx10;->ν()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Lx10;->λ(Ljava/lang/ClassLoader;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 45
    .line 46
    return-object p0
.end method

.method private final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lm20;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    sget-object v0, Ls62;->α:Ls62;

    .line 11
    .line 12
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    new-instance v2, Lq00;

    .line 18
    .line 19
    const/16 v3, 0x1c

    .line 20
    .line 21
    invoke-direct {v2, v3}, Lq00;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lorg/luckypray/dexkit/result/ClassData;

    .line 48
    .line 49
    invoke-static {v4, p0}, Lm20;->α(Lorg/luckypray/dexkit/result/ClassData;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v2

    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v3, v0

    .line 82
    goto :goto_3

    .line 83
    :goto_2
    new-instance v3, Leo1;

    .line 84
    .line 85
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/4 v3, 0x4

    .line 93
    const-string v4, "rcc14672cf9c445fb"

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    if-eqz v2, :cond_3

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v6, "DexKit \u6309\u7a33\u5b9a\u7c7b\u540d\u5b9a\u4f4d\u5931\u8d25: "

    .line 103
    .line 104
    invoke-static {v6, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v4, v2, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :try_start_1
    new-instance v2, Lq00;

    .line 112
    .line 113
    const/16 v6, 0x1d

    .line 114
    .line 115
    invoke-direct {v2, v6}, Lq00;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-instance v2, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :cond_4
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Lorg/luckypray/dexkit/result/ClassData;

    .line 142
    .line 143
    invoke-static {v6, p0}, Lm20;->α(Lorg/luckypray/dexkit/result/ClassData;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    if-eqz v6, :cond_4

    .line 148
    .line 149
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    goto :goto_6

    .line 155
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_6

    .line 164
    .line 165
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Ljava/lang/Class;

    .line 170
    .line 171
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :goto_6
    new-instance v0, Leo1;

    .line 176
    .line 177
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    :cond_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-eqz p0, :cond_7

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    const-string p1, "DexKit \u6309\u63a5\u53e3\u7ed3\u6784\u5b9a\u4f4d\u5931\u8d25: "

    .line 191
    .line 192
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {v4, p0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_8

    .line 213
    .line 214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Ljava/lang/Class;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-static {p0, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_8
    invoke-static {p0}, Lm20;->ε(Ljava/util/List;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0
.end method

.method private final λ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    new-instance v1, Ll20;

    .line 14
    .line 15
    const/16 v2, 0xe

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 44
    .line 45
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    :try_start_1
    new-instance v1, Ll20;

    .line 59
    .line 60
    const/16 v2, 0xf

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 89
    .line 90
    invoke-static {v2, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    :catchall_1
    invoke-static {v0}, Lpd2;->ο(Ljava/util/List;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method private final μ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    new-instance v1, Ll20;

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 43
    .line 44
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :catchall_0
    :try_start_1
    new-instance v1, Ll20;

    .line 58
    .line 59
    const/16 v2, 0x8

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 88
    .line 89
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    :catchall_1
    :try_start_2
    new-instance v1, Ll20;

    .line 103
    .line 104
    const/16 v2, 0x9

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 133
    .line 134
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_4

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 145
    .line 146
    .line 147
    :catchall_2
    :try_start_3
    new-instance v1, Ll20;

    .line 148
    .line 149
    const/16 v2, 0xa

    .line 150
    .line 151
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v2, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_7

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 178
    .line 179
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-eqz v3, :cond_6

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 190
    .line 191
    .line 192
    :catchall_3
    :try_start_4
    new-instance v1, Ll20;

    .line 193
    .line 194
    const/16 v2, 0xb

    .line 195
    .line 196
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v2, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_9

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 223
    .line 224
    invoke-static {v3, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    if-eqz v3, :cond_8

    .line 229
    .line 230
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_9
    invoke-static {v0, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 235
    .line 236
    .line 237
    :catchall_4
    :try_start_5
    new-instance v1, Ll20;

    .line 238
    .line 239
    const/16 v2, 0xc

    .line 240
    .line 241
    invoke-direct {v1, v2}, Ll20;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    new-instance v1, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    :cond_a
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_b

    .line 262
    .line 263
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 268
    .line 269
    invoke-static {v2, p0}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    if-eqz v2, :cond_a

    .line 274
    .line 275
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_b
    invoke-static {v0, v1}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 280
    .line 281
    .line 282
    :catchall_5
    invoke-static {v0}, Lpd2;->ο(Ljava/util/List;)Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-static {p0}, Lpd2;->Ν(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p1, p0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbb;->ε:I

    .line 4
    .line 5
    const-string v4, "java.lang.String"

    .line 6
    .line 7
    const-string v5, "java.util.List"

    .line 8
    .line 9
    sget-object v6, Ljz;->ε:Ljz;

    .line 10
    .line 11
    const/16 v9, 0x1a

    .line 12
    .line 13
    const/16 v10, 0x12

    .line 14
    .line 15
    const/16 v11, 0x11

    .line 16
    .line 17
    const/16 v12, 0x10

    .line 18
    .line 19
    const-string v13, "int"

    .line 20
    .line 21
    sget-object v14, Ls62;->α:Ls62;

    .line 22
    .line 23
    const/4 v15, 0x4

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v7, 0x1

    .line 27
    iget-object v8, v0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    new-instance v2, Ll20;

    .line 45
    .line 46
    invoke-direct {v2, v12}, Ll20;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;

    .line 73
    .line 74
    invoke-static {v4, v8}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    if-eqz v4, :cond_0

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-static {v1, v3}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :catchall_0
    :try_start_1
    new-instance v2, Ll20;

    .line 88
    .line 89
    invoke-direct {v2, v11}, Ll20;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_3

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;

    .line 116
    .line 117
    invoke-static {v4, v8}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static {v1, v3}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    .line 129
    .line 130
    :catchall_1
    :try_start_2
    new-instance v2, Ll20;

    .line 131
    .line 132
    invoke-direct {v2, v10}, Ll20;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v2, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_5

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 159
    .line 160
    invoke-static {v3, v8}, Lpd2;->а(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    if-eqz v3, :cond_4

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    invoke-static {v1, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 171
    .line 172
    .line 173
    :catchall_2
    invoke-static {v1}, Lpd2;->ο(Ljava/util/List;)Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    return-object v0

    .line 178
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lbb;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lbb;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lbb;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lbb;->ι(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lbb;->θ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :pswitch_5
    move-object/from16 v0, p1

    .line 204
    .line 205
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object v1, Lc10;->α:Lc10;

    .line 211
    .line 212
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 215
    .line 216
    .line 217
    :try_start_3
    new-instance v4, Lq00;

    .line 218
    .line 219
    const/16 v5, 0xf

    .line 220
    .line 221
    invoke-direct {v4, v5}, Lq00;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 243
    .line 244
    :try_start_4
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 245
    .line 246
    .line 247
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 248
    goto :goto_4

    .line 249
    :catchall_3
    move-exception v0

    .line 250
    :try_start_5
    new-instance v5, Leo1;

    .line 251
    .line 252
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    move-object v0, v5

    .line 256
    :goto_4
    instance-of v5, v0, Leo1;

    .line 257
    .line 258
    if-eqz v5, :cond_6

    .line 259
    .line 260
    move-object v0, v3

    .line 261
    :cond_6
    check-cast v0, Ljava/lang/reflect/Method;

    .line 262
    .line 263
    invoke-static {v2, v0}, Lc10;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :catchall_4
    move-exception v0

    .line 268
    new-instance v14, Leo1;

    .line 269
    .line 270
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    :cond_7
    invoke-static {v14}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const-string v4, "DexKit \u5b9a\u4f4d\u53cc\u51fb\u5165\u53e3\u5931\u8d25: "

    .line 284
    .line 285
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const-string v4, "rc8611bc391e3e31b"

    .line 290
    .line 291
    invoke-static {v4, v0, v3, v15, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_8
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v0}, Lc10;->ι(Ljava/util/Collection;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lbb;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0

    .line 311
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lbb;->ζ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0

    .line 316
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Lbb;->δ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    return-object v0

    .line 321
    :pswitch_9
    invoke-direct/range {p0 .. p1}, Lbb;->γ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    return-object v0

    .line 326
    :pswitch_a
    invoke-direct/range {p0 .. p1}, Lbb;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    return-object v0

    .line 331
    :pswitch_b
    move-object/from16 v0, p1

    .line 332
    .line 333
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 334
    .line 335
    sget-object v1, Lql;->α:Lql;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v1, Lwj;

    .line 341
    .line 342
    invoke-direct {v1, v9}, Lwj;-><init>(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v1, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    :cond_9
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_b

    .line 363
    .line 364
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 369
    .line 370
    :try_start_6
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 371
    .line 372
    .line 373
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 374
    goto :goto_6

    .line 375
    :catchall_5
    move-exception v0

    .line 376
    new-instance v4, Leo1;

    .line 377
    .line 378
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object v0, v4

    .line 382
    :goto_6
    instance-of v4, v0, Leo1;

    .line 383
    .line 384
    if-eqz v4, :cond_a

    .line 385
    .line 386
    move-object v0, v3

    .line 387
    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 388
    .line 389
    if-eqz v0, :cond_9

    .line 390
    .line 391
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    :cond_c
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_d

    .line 409
    .line 410
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    move-object v3, v2

    .line 415
    check-cast v3, Ljava/lang/reflect/Method;

    .line 416
    .line 417
    invoke-static {v3, v7}, Lql;->Ε(Ljava/lang/reflect/Method;Z)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eqz v3, :cond_c

    .line 422
    .line 423
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_d
    new-instance v1, Ltf;

    .line 428
    .line 429
    const/16 v2, 0x14

    .line 430
    .line 431
    invoke-direct {v1, v2}, Ltf;-><init>(I)V

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    new-instance v1, Ljava/util/HashSet;

    .line 439
    .line 440
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 441
    .line 442
    .line 443
    new-instance v2, Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_f

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    move-object v4, v3

    .line 463
    check-cast v4, Ljava/lang/reflect/Method;

    .line 464
    .line 465
    invoke-static {v4}, Lql;->Θ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-eqz v4, :cond_e

    .line 474
    .line 475
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    if-eqz v1, :cond_10

    .line 488
    .line 489
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    check-cast v1, Ljava/lang/reflect/Method;

    .line 494
    .line 495
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 496
    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_10
    return-object v2

    .line 500
    :pswitch_c
    move-object/from16 v0, p1

    .line 501
    .line 502
    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    sget-object v1, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 508
    .line 509
    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v8, v0}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    return-object v0

    .line 518
    :pswitch_d
    move-object/from16 v0, p1

    .line 519
    .line 520
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 521
    .line 522
    invoke-static {v8, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->υ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    return-object v0

    .line 527
    :pswitch_e
    move-object/from16 v0, p1

    .line 528
    .line 529
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 530
    .line 531
    invoke-static {v8, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->γ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    return-object v0

    .line 536
    :pswitch_f
    move-object/from16 v0, p1

    .line 537
    .line 538
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 539
    .line 540
    invoke-static {v8, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->τ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    return-object v0

    .line 545
    :pswitch_10
    move-object/from16 v0, p1

    .line 546
    .line 547
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 548
    .line 549
    invoke-static {v8, v0}, Lcom/example/dyhelper/dexkit/hook/CommentBookmarkDexKitResolver;->κ(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;)Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    return-object v0

    .line 554
    :pswitch_11
    move-object/from16 v0, p1

    .line 555
    .line 556
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    sget-object v1, Lfj;->α:Lfj;

    .line 562
    .line 563
    new-instance v1, Ljava/util/ArrayList;

    .line 564
    .line 565
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 566
    .line 567
    .line 568
    sget-object v4, Lfj;->β:Ljava/util/List;

    .line 569
    .line 570
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    if-eqz v5, :cond_11

    .line 579
    .line 580
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    check-cast v5, Ljava/lang/String;

    .line 585
    .line 586
    new-instance v6, Lxi;

    .line 587
    .line 588
    invoke-direct {v6, v0, v5, v8, v2}, Lxi;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/ClassLoader;I)V

    .line 589
    .line 590
    .line 591
    invoke-static {v1, v6}, Lfj;->η(Ljava/util/ArrayList;Lp70;)V

    .line 592
    .line 593
    .line 594
    goto :goto_a

    .line 595
    :cond_11
    const-string v2, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"

    .line 596
    .line 597
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    filled-new-array {v4}, [Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v16

    .line 605
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v17

    .line 613
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v18

    .line 621
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    filled-new-array {v3, v3, v4}, [Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v19

    .line 629
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    filled-new-array {v3, v4, v3}, [Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v20

    .line 637
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    filled-new-array {v4, v3, v3}, [Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v21

    .line 645
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    filled-new-array {v3, v3, v3, v4}, [Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v22

    .line 653
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    filled-new-array {v3, v3, v4, v3}, [Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v23

    .line 661
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    filled-new-array {v3, v4, v3, v3}, [Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v24

    .line 669
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v4

    .line 673
    filled-new-array {v4, v3, v3, v3}, [Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v25

    .line 677
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    filled-new-array {v3, v3, v3, v3, v4}, [Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v26

    .line 685
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    filled-new-array {v3, v3, v3, v4, v3}, [Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v27

    .line 693
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    filled-new-array {v3, v3, v4, v3, v3}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v28

    .line 701
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    filled-new-array {v3, v4, v3, v3, v3}, [Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v29

    .line 709
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    filled-new-array {v2, v3, v3, v3, v3}, [Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v30

    .line 717
    filled-new-array/range {v16 .. v30}, [[Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    if-eqz v3, :cond_12

    .line 734
    .line 735
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    check-cast v3, [Ljava/lang/String;

    .line 740
    .line 741
    new-instance v4, Lz7;

    .line 742
    .line 743
    const/4 v5, 0x3

    .line 744
    invoke-direct {v4, v0, v3, v8, v5}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 745
    .line 746
    .line 747
    invoke-static {v1, v4}, Lfj;->η(Ljava/util/ArrayList;Lp70;)V

    .line 748
    .line 749
    .line 750
    goto :goto_b

    .line 751
    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    .line 752
    .line 753
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    :cond_13
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-eqz v2, :cond_14

    .line 765
    .line 766
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    move-object v3, v2

    .line 771
    check-cast v3, Ljava/lang/reflect/Method;

    .line 772
    .line 773
    invoke-static {v3}, Lfj;->Ζ(Ljava/lang/reflect/Method;)I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    const/16 v4, 0xaf0

    .line 778
    .line 779
    if-lt v3, v4, :cond_13

    .line 780
    .line 781
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    goto :goto_c

    .line 785
    :cond_14
    new-instance v1, Ljava/util/HashSet;

    .line 786
    .line 787
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 788
    .line 789
    .line 790
    new-instance v2, Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    :cond_15
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    if-eqz v3, :cond_16

    .line 804
    .line 805
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    move-object v4, v3

    .line 810
    check-cast v4, Ljava/lang/reflect/Method;

    .line 811
    .line 812
    invoke-static {v4}, Lfj;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v4

    .line 820
    if-eqz v4, :cond_15

    .line 821
    .line 822
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    goto :goto_d

    .line 826
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    :cond_17
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    if-eqz v2, :cond_18

    .line 840
    .line 841
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    move-object v3, v2

    .line 846
    check-cast v3, Ljava/lang/reflect/Method;

    .line 847
    .line 848
    invoke-static {v3}, Lfj;->τ(Ljava/lang/reflect/Method;)Z

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    if-eqz v3, :cond_17

    .line 853
    .line 854
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    goto :goto_e

    .line 858
    :cond_18
    new-instance v1, Ltf;

    .line 859
    .line 860
    const/4 v2, 0x6

    .line 861
    invoke-direct {v1, v2}, Ltf;-><init>(I)V

    .line 862
    .line 863
    .line 864
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    new-instance v1, Ljava/util/HashSet;

    .line 869
    .line 870
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 871
    .line 872
    .line 873
    new-instance v2, Ljava/util/ArrayList;

    .line 874
    .line 875
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 876
    .line 877
    .line 878
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    :cond_19
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v3

    .line 886
    if-eqz v3, :cond_1a

    .line 887
    .line 888
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    move-object v4, v3

    .line 893
    check-cast v4, Ljava/lang/reflect/Method;

    .line 894
    .line 895
    invoke-static {v4}, Lfj;->χ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    if-eqz v4, :cond_19

    .line 904
    .line 905
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    goto :goto_f

    .line 909
    :cond_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    if-eqz v1, :cond_1b

    .line 918
    .line 919
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    check-cast v1, Ljava/lang/reflect/Method;

    .line 924
    .line 925
    invoke-virtual {v1, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 926
    .line 927
    .line 928
    goto :goto_10

    .line 929
    :cond_1b
    return-object v2

    .line 930
    :pswitch_12
    move-object/from16 v1, p1

    .line 931
    .line 932
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    sget-object v0, Lkh;->α:Lkh;

    .line 938
    .line 939
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 940
    .line 941
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 942
    .line 943
    .line 944
    sget-object v0, Lkh;->β:Ljava/util/List;

    .line 945
    .line 946
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    :cond_1c
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    const/4 v4, 0x2

    .line 955
    const/16 v5, 0x1f4

    .line 956
    .line 957
    if-eqz v0, :cond_1f

    .line 958
    .line 959
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    move-object v6, v0

    .line 964
    check-cast v6, Ljava/lang/String;

    .line 965
    .line 966
    :try_start_7
    new-instance v0, Ls9;

    .line 967
    .line 968
    invoke-direct {v0, v6, v4}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    :catchall_6
    :cond_1d
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 980
    .line 981
    .line 982
    move-result v4

    .line 983
    if-eqz v4, :cond_1e

    .line 984
    .line 985
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 990
    .line 991
    :try_start_8
    invoke-virtual {v4, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 992
    .line 993
    .line 994
    move-result-object v4

    .line 995
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    move-result-object v4

    .line 999
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v4}, Lkh;->π(Ljava/lang/Class;)I

    .line 1003
    .line 1004
    .line 1005
    move-result v7

    .line 1006
    if-lt v7, v5, :cond_1d

    .line 1007
    .line 1008
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1009
    .line 1010
    .line 1011
    goto :goto_12

    .line 1012
    :catchall_7
    move-exception v0

    .line 1013
    goto :goto_13

    .line 1014
    :cond_1e
    move-object v4, v14

    .line 1015
    goto :goto_14

    .line 1016
    :goto_13
    new-instance v4, Leo1;

    .line 1017
    .line 1018
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1019
    .line 1020
    .line 1021
    :goto_14
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    if-eqz v0, :cond_1c

    .line 1026
    .line 1027
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    const-string v4, "r69312f33fd204a99"

    .line 1032
    .line 1033
    invoke-static {v4, v6, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_11

    .line 1037
    :cond_1f
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v0

    .line 1041
    if-eqz v0, :cond_20

    .line 1042
    .line 1043
    invoke-static {v8}, Lkh;->κ(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 1048
    .line 1049
    .line 1050
    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    .line 1051
    .line 1052
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1053
    .line 1054
    .line 1055
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    :cond_21
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    if-eqz v2, :cond_22

    .line 1064
    .line 1065
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    move-object v3, v2

    .line 1070
    check-cast v3, Ljava/lang/Class;

    .line 1071
    .line 1072
    invoke-static {v3}, Lkh;->π(Ljava/lang/Class;)I

    .line 1073
    .line 1074
    .line 1075
    move-result v3

    .line 1076
    if-lt v3, v5, :cond_21

    .line 1077
    .line 1078
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    goto :goto_15

    .line 1082
    :cond_22
    new-instance v1, Ltf;

    .line 1083
    .line 1084
    invoke-direct {v1, v4}, Ltf;-><init>(I)V

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    new-instance v1, Ljava/util/HashSet;

    .line 1092
    .line 1093
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1094
    .line 1095
    .line 1096
    new-instance v2, Ljava/util/ArrayList;

    .line 1097
    .line 1098
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1099
    .line 1100
    .line 1101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    :cond_23
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1106
    .line 1107
    .line 1108
    move-result v3

    .line 1109
    if-eqz v3, :cond_24

    .line 1110
    .line 1111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v3

    .line 1115
    move-object v4, v3

    .line 1116
    check-cast v4, Ljava/lang/Class;

    .line 1117
    .line 1118
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v4

    .line 1126
    if-eqz v4, :cond_23

    .line 1127
    .line 1128
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    goto :goto_16

    .line 1132
    :cond_24
    return-object v2

    .line 1133
    :pswitch_13
    move-object/from16 v0, p1

    .line 1134
    .line 1135
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1141
    .line 1142
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1143
    .line 1144
    .line 1145
    :try_start_9
    new-instance v3, Lwe;

    .line 1146
    .line 1147
    const/16 v4, 0x1d

    .line 1148
    .line 1149
    invoke-direct {v3, v4}, Lwe;-><init>(I)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v0, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    :catchall_8
    :cond_25
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1161
    .line 1162
    .line 1163
    move-result v3

    .line 1164
    if-eqz v3, :cond_26

    .line 1165
    .line 1166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1171
    .line 1172
    :try_start_a
    invoke-virtual {v3, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v3

    .line 1176
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1177
    .line 1178
    .line 1179
    move-result v4

    .line 1180
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v4

    .line 1184
    if-eqz v4, :cond_25

    .line 1185
    .line 1186
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1191
    .line 1192
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    if-eqz v4, :cond_25

    .line 1197
    .line 1198
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v4

    .line 1202
    array-length v4, v4

    .line 1203
    if-ne v4, v7, :cond_25

    .line 1204
    .line 1205
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v4

    .line 1209
    aget-object v4, v4, v2

    .line 1210
    .line 1211
    const-class v5, Ljava/lang/Object;

    .line 1212
    .line 1213
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v4

    .line 1217
    if-eqz v4, :cond_25

    .line 1218
    .line 1219
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1223
    .line 1224
    .line 1225
    goto :goto_17

    .line 1226
    :catchall_9
    move-exception v0

    .line 1227
    new-instance v14, Leo1;

    .line 1228
    .line 1229
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1230
    .line 1231
    .line 1232
    :cond_26
    invoke-static {v14}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    if-eqz v0, :cond_27

    .line 1237
    .line 1238
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    const-string v2, "r1a93f9a802935717"

    .line 1243
    .line 1244
    invoke-static {v2, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    :cond_27
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v0

    .line 1251
    if-eqz v0, :cond_28

    .line 1252
    .line 1253
    invoke-static {v8}, Lkh;->θ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 1258
    .line 1259
    .line 1260
    :cond_28
    new-instance v0, Ljava/util/HashSet;

    .line 1261
    .line 1262
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1263
    .line 1264
    .line 1265
    new-instance v2, Ljava/util/ArrayList;

    .line 1266
    .line 1267
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1268
    .line 1269
    .line 1270
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v1

    .line 1274
    :cond_29
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1275
    .line 1276
    .line 1277
    move-result v3

    .line 1278
    if-eqz v3, :cond_2a

    .line 1279
    .line 1280
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v3

    .line 1284
    move-object v4, v3

    .line 1285
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1286
    .line 1287
    sget-object v5, Lkh;->α:Lkh;

    .line 1288
    .line 1289
    invoke-static {v4}, Lkh;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v4

    .line 1293
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v4

    .line 1297
    if-eqz v4, :cond_29

    .line 1298
    .line 1299
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    goto :goto_18

    .line 1303
    :cond_2a
    return-object v2

    .line 1304
    :pswitch_14
    move-object/from16 v0, p1

    .line 1305
    .line 1306
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1307
    .line 1308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    :try_start_b
    new-instance v1, Lwe;

    .line 1312
    .line 1313
    const/16 v2, 0x15

    .line 1314
    .line 1315
    invoke-direct {v1, v2}, Lwe;-><init>(I)V

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    new-instance v1, Ljava/util/ArrayList;

    .line 1323
    .line 1324
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    :cond_2b
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1332
    .line 1333
    .line 1334
    move-result v2

    .line 1335
    if-eqz v2, :cond_2c

    .line 1336
    .line 1337
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    check-cast v2, Lorg/luckypray/dexkit/result/ClassData;

    .line 1342
    .line 1343
    invoke-static {v2, v8}, Lag;->α(Lorg/luckypray/dexkit/result/ClassData;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    if-eqz v2, :cond_2b

    .line 1348
    .line 1349
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1350
    .line 1351
    .line 1352
    goto :goto_19

    .line 1353
    :catchall_a
    move-exception v0

    .line 1354
    goto :goto_1c

    .line 1355
    :cond_2c
    new-instance v0, Ljava/util/ArrayList;

    .line 1356
    .line 1357
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    :cond_2d
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v2

    .line 1368
    if-eqz v2, :cond_2e

    .line 1369
    .line 1370
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    move-object v4, v2

    .line 1375
    check-cast v4, Ljava/lang/Class;

    .line 1376
    .line 1377
    invoke-static {v4}, Lag;->β(Ljava/lang/Class;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    if-eqz v4, :cond_2d

    .line 1382
    .line 1383
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1384
    .line 1385
    .line 1386
    goto :goto_1a

    .line 1387
    :cond_2e
    new-instance v1, Ljava/util/HashSet;

    .line 1388
    .line 1389
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1390
    .line 1391
    .line 1392
    new-instance v2, Ljava/util/ArrayList;

    .line 1393
    .line 1394
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    :cond_2f
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1402
    .line 1403
    .line 1404
    move-result v4

    .line 1405
    if-eqz v4, :cond_30

    .line 1406
    .line 1407
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v4

    .line 1411
    move-object v5, v4

    .line 1412
    check-cast v5, Ljava/lang/Class;

    .line 1413
    .line 1414
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v5

    .line 1418
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v5

    .line 1422
    if-eqz v5, :cond_2f

    .line 1423
    .line 1424
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1425
    .line 1426
    .line 1427
    goto :goto_1b

    .line 1428
    :goto_1c
    new-instance v2, Leo1;

    .line 1429
    .line 1430
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1431
    .line 1432
    .line 1433
    :cond_30
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    if-eqz v0, :cond_31

    .line 1438
    .line 1439
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v0

    .line 1443
    const-string v1, "DexKit \u626b\u63cf Flux \u5e95\u680f\u6ce8\u518c\u5668\u5931\u8d25: "

    .line 1444
    .line 1445
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    const-string v1, "rb3b4f1f2616781f"

    .line 1450
    .line 1451
    invoke-static {v1, v0, v3, v15, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1452
    .line 1453
    .line 1454
    :cond_31
    instance-of v0, v2, Leo1;

    .line 1455
    .line 1456
    if-eqz v0, :cond_32

    .line 1457
    .line 1458
    goto :goto_1d

    .line 1459
    :cond_32
    move-object v6, v2

    .line 1460
    :goto_1d
    check-cast v6, Ljava/util/List;

    .line 1461
    .line 1462
    return-object v6

    .line 1463
    :pswitch_15
    move-object/from16 v1, p1

    .line 1464
    .line 1465
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1466
    .line 1467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1468
    .line 1469
    .line 1470
    sget-object v4, Lbf;->α:Lbf;

    .line 1471
    .line 1472
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 1473
    .line 1474
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1475
    .line 1476
    .line 1477
    :try_start_c
    new-instance v0, Ln7;

    .line 1478
    .line 1479
    const/16 v6, 0x1d

    .line 1480
    .line 1481
    invoke-direct {v0, v6}, Ln7;-><init>(I)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v6

    .line 1492
    :goto_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1493
    .line 1494
    .line 1495
    move-result v0

    .line 1496
    if-eqz v0, :cond_34

    .line 1497
    .line 1498
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1503
    .line 1504
    :try_start_d
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 1508
    goto :goto_1f

    .line 1509
    :catchall_b
    move-exception v0

    .line 1510
    :try_start_e
    new-instance v7, Leo1;

    .line 1511
    .line 1512
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1513
    .line 1514
    .line 1515
    move-object v0, v7

    .line 1516
    :goto_1f
    instance-of v7, v0, Leo1;

    .line 1517
    .line 1518
    if-eqz v7, :cond_33

    .line 1519
    .line 1520
    move-object v0, v3

    .line 1521
    :cond_33
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1522
    .line 1523
    invoke-static {v5, v0}, Lbf;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 1524
    .line 1525
    .line 1526
    goto :goto_1e

    .line 1527
    :catchall_c
    move-exception v0

    .line 1528
    goto :goto_20

    .line 1529
    :cond_34
    move-object v6, v14

    .line 1530
    goto :goto_21

    .line 1531
    :goto_20
    new-instance v6, Leo1;

    .line 1532
    .line 1533
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1534
    .line 1535
    .line 1536
    :goto_21
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    if-eqz v0, :cond_35

    .line 1541
    .line 1542
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1547
    .line 1548
    const-string v7, "DexKit strict query failed: "

    .line 1549
    .line 1550
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    invoke-static {v0}, Lbf;->ζ(Ljava/lang/String;)V

    .line 1561
    .line 1562
    .line 1563
    :cond_35
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    if-eqz v0, :cond_38

    .line 1568
    .line 1569
    :try_start_f
    new-instance v0, Lwe;

    .line 1570
    .line 1571
    invoke-direct {v0, v2}, Lwe;-><init>(I)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v1

    .line 1582
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1583
    .line 1584
    .line 1585
    move-result v0

    .line 1586
    if-eqz v0, :cond_37

    .line 1587
    .line 1588
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1593
    .line 1594
    :try_start_10
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    .line 1598
    goto :goto_23

    .line 1599
    :catchall_d
    move-exception v0

    .line 1600
    :try_start_11
    new-instance v2, Leo1;

    .line 1601
    .line 1602
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1603
    .line 1604
    .line 1605
    move-object v0, v2

    .line 1606
    :goto_23
    instance-of v2, v0, Leo1;

    .line 1607
    .line 1608
    if-eqz v2, :cond_36

    .line 1609
    .line 1610
    move-object v0, v3

    .line 1611
    :cond_36
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1612
    .line 1613
    invoke-static {v5, v0}, Lbf;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_e

    .line 1614
    .line 1615
    .line 1616
    goto :goto_22

    .line 1617
    :catchall_e
    move-exception v0

    .line 1618
    new-instance v14, Leo1;

    .line 1619
    .line 1620
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1621
    .line 1622
    .line 1623
    :cond_37
    invoke-static {v14}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    if-eqz v0, :cond_38

    .line 1628
    .line 1629
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1634
    .line 1635
    const-string v2, "DexKit signature query failed: "

    .line 1636
    .line 1637
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v0

    .line 1647
    invoke-static {v0}, Lbf;->ζ(Ljava/lang/String;)V

    .line 1648
    .line 1649
    .line 1650
    :cond_38
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1651
    .line 1652
    .line 1653
    move-result v0

    .line 1654
    if-eqz v0, :cond_39

    .line 1655
    .line 1656
    invoke-virtual {v4, v8}, Lbf;->η(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1665
    .line 1666
    .line 1667
    move-result v1

    .line 1668
    if-eqz v1, :cond_39

    .line 1669
    .line 1670
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v1

    .line 1674
    check-cast v1, Ljava/lang/reflect/Method;

    .line 1675
    .line 1676
    invoke-static {v5, v1}, Lbf;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 1677
    .line 1678
    .line 1679
    goto :goto_24

    .line 1680
    :cond_39
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v0

    .line 1684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1685
    .line 1686
    .line 1687
    check-cast v0, Ljava/lang/Iterable;

    .line 1688
    .line 1689
    new-instance v1, Ld50;

    .line 1690
    .line 1691
    sget-object v2, Lbf;->α:Lbf;

    .line 1692
    .line 1693
    const/16 v2, 0x1b

    .line 1694
    .line 1695
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v0

    .line 1702
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    invoke-static {v0}, Lbf;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    return-object v0

    .line 1711
    :pswitch_16
    move-object/from16 v0, p1

    .line 1712
    .line 1713
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1714
    .line 1715
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1716
    .line 1717
    .line 1718
    sget-object v1, Lvb;->α:Ljava/util/List;

    .line 1719
    .line 1720
    invoke-static {v8}, Lvb;->ξ(Ljava/lang/ClassLoader;)Ljava/util/LinkedHashSet;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v1

    .line 1724
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v3

    .line 1728
    if-eqz v3, :cond_3a

    .line 1729
    .line 1730
    const-string v0, "data source interface not resolved, skip broad List-return DexKit scan"

    .line 1731
    .line 1732
    invoke-static {v0}, Lvb;->λ(Ljava/lang/String;)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_26

    .line 1736
    :cond_3a
    new-instance v3, Ljava/util/ArrayList;

    .line 1737
    .line 1738
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1739
    .line 1740
    .line 1741
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v4

    .line 1745
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1746
    .line 1747
    .line 1748
    move-result v6

    .line 1749
    if-eqz v6, :cond_3b

    .line 1750
    .line 1751
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v6

    .line 1755
    check-cast v6, Ljava/lang/String;

    .line 1756
    .line 1757
    invoke-static {v0, v8, v6, v5}, Lvb;->ε(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v6

    .line 1761
    invoke-static {v3, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1762
    .line 1763
    .line 1764
    goto :goto_25

    .line 1765
    :cond_3b
    new-instance v0, Lf7;

    .line 1766
    .line 1767
    invoke-direct {v0, v7, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1768
    .line 1769
    .line 1770
    new-instance v3, Ltb;

    .line 1771
    .line 1772
    invoke-direct {v3, v1, v2}, Ltb;-><init>(Ljava/util/LinkedHashSet;I)V

    .line 1773
    .line 1774
    .line 1775
    new-instance v1, Lt52;

    .line 1776
    .line 1777
    invoke-direct {v1, v0, v3}, Lt52;-><init>(Lss1;La80;)V

    .line 1778
    .line 1779
    .line 1780
    new-instance v0, Ln7;

    .line 1781
    .line 1782
    invoke-direct {v0, v12}, Ln7;-><init>(I)V

    .line 1783
    .line 1784
    .line 1785
    new-instance v3, Ly30;

    .line 1786
    .line 1787
    invoke-direct {v3, v1, v7, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1788
    .line 1789
    .line 1790
    new-instance v0, Ld50;

    .line 1791
    .line 1792
    const/16 v1, 0x18

    .line 1793
    .line 1794
    invoke-direct {v0, v1}, Ld50;-><init>(I)V

    .line 1795
    .line 1796
    .line 1797
    new-instance v1, Lcu;

    .line 1798
    .line 1799
    const/4 v5, 0x3

    .line 1800
    invoke-direct {v1, v3, v5, v0}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1801
    .line 1802
    .line 1803
    new-instance v0, Ln7;

    .line 1804
    .line 1805
    invoke-direct {v0, v11}, Ln7;-><init>(I)V

    .line 1806
    .line 1807
    .line 1808
    new-instance v3, Lt52;

    .line 1809
    .line 1810
    invoke-direct {v3, v1, v0}, Lt52;-><init>(Lss1;La80;)V

    .line 1811
    .line 1812
    .line 1813
    new-instance v0, Ln7;

    .line 1814
    .line 1815
    invoke-direct {v0, v10}, Ln7;-><init>(I)V

    .line 1816
    .line 1817
    .line 1818
    new-instance v1, Lcu;

    .line 1819
    .line 1820
    invoke-direct {v1, v3, v2, v0}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1821
    .line 1822
    .line 1823
    new-instance v0, Ln7;

    .line 1824
    .line 1825
    const/16 v2, 0x13

    .line 1826
    .line 1827
    invoke-direct {v0, v2}, Ln7;-><init>(I)V

    .line 1828
    .line 1829
    .line 1830
    invoke-static {v1, v0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v0

    .line 1834
    invoke-static {v0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v6

    .line 1838
    :goto_26
    return-object v6

    .line 1839
    :pswitch_17
    move-object/from16 v0, p1

    .line 1840
    .line 1841
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1842
    .line 1843
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1844
    .line 1845
    .line 1846
    sget-object v1, Lvb;->α:Ljava/util/List;

    .line 1847
    .line 1848
    invoke-static {v8, v7}, Lvb;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v1

    .line 1852
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1853
    .line 1854
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1855
    .line 1856
    .line 1857
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    :cond_3c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1862
    .line 1863
    .line 1864
    move-result v3

    .line 1865
    if-eqz v3, :cond_40

    .line 1866
    .line 1867
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v3

    .line 1871
    check-cast v3, Ljava/lang/Class;

    .line 1872
    .line 1873
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v4

    .line 1877
    invoke-static {v0, v8, v4, v5}, Lvb;->ε(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v4

    .line 1881
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v4

    .line 1885
    :cond_3d
    :goto_27
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1886
    .line 1887
    .line 1888
    move-result v6

    .line 1889
    const/16 v7, 0x898

    .line 1890
    .line 1891
    if-eqz v6, :cond_3e

    .line 1892
    .line 1893
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v6

    .line 1897
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1898
    .line 1899
    invoke-static {v6}, Lvb;->χ(Ljava/lang/reflect/Method;)I

    .line 1900
    .line 1901
    .line 1902
    move-result v10

    .line 1903
    if-lt v10, v7, :cond_3d

    .line 1904
    .line 1905
    invoke-static {v2, v6}, Lvb;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 1906
    .line 1907
    .line 1908
    goto :goto_27

    .line 1909
    :cond_3e
    invoke-static {v3}, Lvb;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v3

    .line 1913
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    :cond_3f
    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1918
    .line 1919
    .line 1920
    move-result v4

    .line 1921
    if-eqz v4, :cond_3c

    .line 1922
    .line 1923
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v4

    .line 1927
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1928
    .line 1929
    invoke-static {v4}, Lvb;->χ(Ljava/lang/reflect/Method;)I

    .line 1930
    .line 1931
    .line 1932
    move-result v6

    .line 1933
    if-lt v6, v7, :cond_3f

    .line 1934
    .line 1935
    invoke-static {v2, v4}, Lvb;->β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 1936
    .line 1937
    .line 1938
    goto :goto_28

    .line 1939
    :cond_40
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v0

    .line 1943
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1944
    .line 1945
    .line 1946
    check-cast v0, Ljava/lang/Iterable;

    .line 1947
    .line 1948
    new-instance v1, Ld50;

    .line 1949
    .line 1950
    invoke-direct {v1, v9}, Ld50;-><init>(I)V

    .line 1951
    .line 1952
    .line 1953
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v0

    .line 1957
    new-instance v1, Ljava/util/HashSet;

    .line 1958
    .line 1959
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1960
    .line 1961
    .line 1962
    new-instance v2, Ljava/util/ArrayList;

    .line 1963
    .line 1964
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1965
    .line 1966
    .line 1967
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    :cond_41
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1972
    .line 1973
    .line 1974
    move-result v3

    .line 1975
    if-eqz v3, :cond_42

    .line 1976
    .line 1977
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v3

    .line 1981
    move-object v4, v3

    .line 1982
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1983
    .line 1984
    invoke-static {v4}, Lvb;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v4

    .line 1988
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1989
    .line 1990
    .line 1991
    move-result v4

    .line 1992
    if-eqz v4, :cond_41

    .line 1993
    .line 1994
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1995
    .line 1996
    .line 1997
    goto :goto_29

    .line 1998
    :cond_42
    return-object v2

    .line 1999
    :pswitch_18
    move-object/from16 v0, p1

    .line 2000
    .line 2001
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2002
    .line 2003
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2004
    .line 2005
    .line 2006
    sget-object v1, Lvb;->α:Ljava/util/List;

    .line 2007
    .line 2008
    sget-object v1, Lvb;->α:Ljava/util/List;

    .line 2009
    .line 2010
    new-instance v2, Ljava/util/ArrayList;

    .line 2011
    .line 2012
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2013
    .line 2014
    .line 2015
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v1

    .line 2019
    :goto_2a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2020
    .line 2021
    .line 2022
    move-result v4

    .line 2023
    if-eqz v4, :cond_43

    .line 2024
    .line 2025
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v4

    .line 2029
    check-cast v4, Ljava/lang/String;

    .line 2030
    .line 2031
    invoke-static {v0, v8, v4, v3}, Lvb;->ε(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v4

    .line 2035
    invoke-static {v2, v4}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2036
    .line 2037
    .line 2038
    goto :goto_2a

    .line 2039
    :cond_43
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v0

    .line 2043
    if-eqz v0, :cond_44

    .line 2044
    .line 2045
    const-string v0, "stable data source provider methods not found by DexKit"

    .line 2046
    .line 2047
    invoke-static {v0}, Lvb;->λ(Ljava/lang/String;)V

    .line 2048
    .line 2049
    .line 2050
    :cond_44
    invoke-static {v2}, Lvb;->ζ(Ljava/util/List;)Ljava/util/List;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v0

    .line 2054
    return-object v0

    .line 2055
    :pswitch_19
    move-object/from16 v0, p1

    .line 2056
    .line 2057
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2058
    .line 2059
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2060
    .line 2061
    .line 2062
    sget-object v0, Lvb;->α:Ljava/util/List;

    .line 2063
    .line 2064
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2065
    .line 2066
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2067
    .line 2068
    .line 2069
    sget-object v1, Lvb;->α:Ljava/util/List;

    .line 2070
    .line 2071
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v1

    .line 2075
    :cond_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2076
    .line 2077
    .line 2078
    move-result v3

    .line 2079
    if-eqz v3, :cond_49

    .line 2080
    .line 2081
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v3

    .line 2085
    check-cast v3, Ljava/lang/String;

    .line 2086
    .line 2087
    invoke-static {v8, v3}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v3

    .line 2091
    if-eqz v3, :cond_45

    .line 2092
    .line 2093
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v4

    .line 2097
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v4

    .line 2104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2105
    .line 2106
    .line 2107
    array-length v5, v4

    .line 2108
    move v6, v2

    .line 2109
    :goto_2b
    const/16 v7, 0x9c4

    .line 2110
    .line 2111
    if-ge v6, v5, :cond_47

    .line 2112
    .line 2113
    aget-object v9, v4, v6

    .line 2114
    .line 2115
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v9

    .line 2119
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2120
    .line 2121
    .line 2122
    invoke-static {v9}, Lvb;->φ(Ljava/lang/Class;)I

    .line 2123
    .line 2124
    .line 2125
    move-result v10

    .line 2126
    if-lt v10, v7, :cond_46

    .line 2127
    .line 2128
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v7

    .line 2132
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    :cond_46
    add-int/lit8 v6, v6, 0x1

    .line 2136
    .line 2137
    goto :goto_2b

    .line 2138
    :cond_47
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v3

    .line 2142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2143
    .line 2144
    .line 2145
    array-length v4, v3

    .line 2146
    move v5, v2

    .line 2147
    :goto_2c
    if-ge v5, v4, :cond_45

    .line 2148
    .line 2149
    aget-object v6, v3, v5

    .line 2150
    .line 2151
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v6

    .line 2155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2156
    .line 2157
    .line 2158
    invoke-static {v6}, Lvb;->φ(Ljava/lang/Class;)I

    .line 2159
    .line 2160
    .line 2161
    move-result v9

    .line 2162
    if-lt v9, v7, :cond_48

    .line 2163
    .line 2164
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v9

    .line 2168
    invoke-interface {v0, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2169
    .line 2170
    .line 2171
    :cond_48
    add-int/lit8 v5, v5, 0x1

    .line 2172
    .line 2173
    goto :goto_2c

    .line 2174
    :cond_49
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v0

    .line 2178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2179
    .line 2180
    .line 2181
    check-cast v0, Ljava/lang/Iterable;

    .line 2182
    .line 2183
    new-instance v1, Ld50;

    .line 2184
    .line 2185
    const/16 v2, 0x19

    .line 2186
    .line 2187
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2188
    .line 2189
    .line 2190
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v0

    .line 2194
    new-instance v1, Ljava/util/HashSet;

    .line 2195
    .line 2196
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2197
    .line 2198
    .line 2199
    new-instance v2, Ljava/util/ArrayList;

    .line 2200
    .line 2201
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2202
    .line 2203
    .line 2204
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v0

    .line 2208
    :cond_4a
    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2209
    .line 2210
    .line 2211
    move-result v3

    .line 2212
    if-eqz v3, :cond_4b

    .line 2213
    .line 2214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v3

    .line 2218
    move-object v4, v3

    .line 2219
    check-cast v4, Ljava/lang/Class;

    .line 2220
    .line 2221
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v4

    .line 2225
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2226
    .line 2227
    .line 2228
    move-result v4

    .line 2229
    if-eqz v4, :cond_4a

    .line 2230
    .line 2231
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2232
    .line 2233
    .line 2234
    goto :goto_2d

    .line 2235
    :cond_4b
    return-object v2

    .line 2236
    :pswitch_1a
    move-object/from16 v5, p1

    .line 2237
    .line 2238
    check-cast v5, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2239
    .line 2240
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2241
    .line 2242
    .line 2243
    sget-object v1, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2244
    .line 2245
    new-instance v1, Ljava/util/ArrayList;

    .line 2246
    .line 2247
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2248
    .line 2249
    .line 2250
    sget-object v2, Lfb;->δ:Ljava/util/List;

    .line 2251
    .line 2252
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v2

    .line 2256
    :goto_2e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2257
    .line 2258
    .line 2259
    move-result v3

    .line 2260
    iget-object v6, v0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2261
    .line 2262
    const-string v7, "cause by"

    .line 2263
    .line 2264
    const-string v8, "visibility update from"

    .line 2265
    .line 2266
    if-eqz v3, :cond_4c

    .line 2267
    .line 2268
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v3

    .line 2272
    check-cast v3, Ljava/lang/String;

    .line 2273
    .line 2274
    filled-new-array {v13, v4}, [Ljava/lang/String;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v9

    .line 2278
    invoke-static {v9}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v9

    .line 2282
    filled-new-array {v8, v7}, [Ljava/lang/String;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v7

    .line 2286
    invoke-static {v7}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v10

    .line 2290
    const-string v8, "void"

    .line 2291
    .line 2292
    move-object v7, v3

    .line 2293
    invoke-static/range {v5 .. v10}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v3

    .line 2297
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2298
    .line 2299
    .line 2300
    goto :goto_2e

    .line 2301
    :cond_4c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2302
    .line 2303
    .line 2304
    move-result v0

    .line 2305
    if-nez v0, :cond_50

    .line 2306
    .line 2307
    new-instance v0, Ljava/util/ArrayList;

    .line 2308
    .line 2309
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2310
    .line 2311
    .line 2312
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v1

    .line 2316
    :cond_4d
    :goto_2f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2317
    .line 2318
    .line 2319
    move-result v2

    .line 2320
    if-eqz v2, :cond_4e

    .line 2321
    .line 2322
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v2

    .line 2326
    move-object v3, v2

    .line 2327
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2328
    .line 2329
    invoke-static {v3}, Lfb;->κ(Ljava/lang/reflect/Method;)I

    .line 2330
    .line 2331
    .line 2332
    move-result v3

    .line 2333
    const/16 v4, 0x5dc

    .line 2334
    .line 2335
    if-lt v3, v4, :cond_4d

    .line 2336
    .line 2337
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2338
    .line 2339
    .line 2340
    goto :goto_2f

    .line 2341
    :cond_4e
    new-instance v1, Ld50;

    .line 2342
    .line 2343
    const/16 v2, 0xa

    .line 2344
    .line 2345
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2346
    .line 2347
    .line 2348
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v0

    .line 2352
    new-instance v1, Ljava/util/HashSet;

    .line 2353
    .line 2354
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2355
    .line 2356
    .line 2357
    new-instance v2, Ljava/util/ArrayList;

    .line 2358
    .line 2359
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2360
    .line 2361
    .line 2362
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v0

    .line 2366
    :cond_4f
    :goto_30
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2367
    .line 2368
    .line 2369
    move-result v3

    .line 2370
    if-eqz v3, :cond_55

    .line 2371
    .line 2372
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v3

    .line 2376
    move-object v4, v3

    .line 2377
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2378
    .line 2379
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v4

    .line 2383
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2384
    .line 2385
    .line 2386
    move-result v4

    .line 2387
    if-eqz v4, :cond_4f

    .line 2388
    .line 2389
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2390
    .line 2391
    .line 2392
    goto :goto_30

    .line 2393
    :cond_50
    filled-new-array {v13, v4}, [Ljava/lang/String;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v0

    .line 2397
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v9

    .line 2401
    filled-new-array {v8, v7}, [Ljava/lang/String;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v0

    .line 2405
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v10

    .line 2409
    const/4 v7, 0x0

    .line 2410
    const-string v8, "void"

    .line 2411
    .line 2412
    invoke-static/range {v5 .. v10}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v0

    .line 2416
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2417
    .line 2418
    .line 2419
    new-instance v0, Ljava/util/ArrayList;

    .line 2420
    .line 2421
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2422
    .line 2423
    .line 2424
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v1

    .line 2428
    :cond_51
    :goto_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2429
    .line 2430
    .line 2431
    move-result v2

    .line 2432
    if-eqz v2, :cond_52

    .line 2433
    .line 2434
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v2

    .line 2438
    move-object v3, v2

    .line 2439
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2440
    .line 2441
    invoke-static {v3}, Lfb;->κ(Ljava/lang/reflect/Method;)I

    .line 2442
    .line 2443
    .line 2444
    move-result v3

    .line 2445
    const/16 v4, 0x320

    .line 2446
    .line 2447
    if-lt v3, v4, :cond_51

    .line 2448
    .line 2449
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2450
    .line 2451
    .line 2452
    goto :goto_31

    .line 2453
    :cond_52
    new-instance v1, Ld50;

    .line 2454
    .line 2455
    const/16 v2, 0xb

    .line 2456
    .line 2457
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2458
    .line 2459
    .line 2460
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v0

    .line 2464
    new-instance v1, Ljava/util/HashSet;

    .line 2465
    .line 2466
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2467
    .line 2468
    .line 2469
    new-instance v2, Ljava/util/ArrayList;

    .line 2470
    .line 2471
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2472
    .line 2473
    .line 2474
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v0

    .line 2478
    :cond_53
    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2479
    .line 2480
    .line 2481
    move-result v3

    .line 2482
    if-eqz v3, :cond_54

    .line 2483
    .line 2484
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v3

    .line 2488
    move-object v4, v3

    .line 2489
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2490
    .line 2491
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v4

    .line 2495
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2496
    .line 2497
    .line 2498
    move-result v4

    .line 2499
    if-eqz v4, :cond_53

    .line 2500
    .line 2501
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2502
    .line 2503
    .line 2504
    goto :goto_32

    .line 2505
    :cond_54
    invoke-static {v2, v15}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v2

    .line 2509
    :cond_55
    return-object v2

    .line 2510
    :pswitch_1b
    move-object/from16 v3, p1

    .line 2511
    .line 2512
    check-cast v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2513
    .line 2514
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2515
    .line 2516
    .line 2517
    sget-object v1, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2518
    .line 2519
    new-instance v1, Ljava/util/ArrayList;

    .line 2520
    .line 2521
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2522
    .line 2523
    .line 2524
    sget-object v2, Lfb;->δ:Ljava/util/List;

    .line 2525
    .line 2526
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v2

    .line 2530
    :goto_33
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2531
    .line 2532
    .line 2533
    move-result v5

    .line 2534
    iget-object v6, v0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2535
    .line 2536
    const-string v7, "height is"

    .line 2537
    .line 2538
    const-string v8, "requestLayout from"

    .line 2539
    .line 2540
    if-eqz v5, :cond_56

    .line 2541
    .line 2542
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v5

    .line 2546
    check-cast v5, Ljava/lang/String;

    .line 2547
    .line 2548
    filled-new-array {v13, v4}, [Ljava/lang/String;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v9

    .line 2552
    invoke-static {v9}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v9

    .line 2556
    filled-new-array {v8, v7}, [Ljava/lang/String;

    .line 2557
    .line 2558
    .line 2559
    move-result-object v7

    .line 2560
    invoke-static {v7}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v10

    .line 2564
    const-string v8, "void"

    .line 2565
    .line 2566
    move-object v7, v5

    .line 2567
    move-object v5, v3

    .line 2568
    invoke-static/range {v5 .. v10}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2569
    .line 2570
    .line 2571
    move-result-object v3

    .line 2572
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2573
    .line 2574
    .line 2575
    move-object v3, v5

    .line 2576
    goto :goto_33

    .line 2577
    :cond_56
    move-object v5, v3

    .line 2578
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2579
    .line 2580
    .line 2581
    move-result v0

    .line 2582
    if-nez v0, :cond_5a

    .line 2583
    .line 2584
    new-instance v0, Ljava/util/ArrayList;

    .line 2585
    .line 2586
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2587
    .line 2588
    .line 2589
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v1

    .line 2593
    :cond_57
    :goto_34
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2594
    .line 2595
    .line 2596
    move-result v2

    .line 2597
    if-eqz v2, :cond_58

    .line 2598
    .line 2599
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2600
    .line 2601
    .line 2602
    move-result-object v2

    .line 2603
    move-object v3, v2

    .line 2604
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2605
    .line 2606
    invoke-static {v3}, Lfb;->κ(Ljava/lang/reflect/Method;)I

    .line 2607
    .line 2608
    .line 2609
    move-result v3

    .line 2610
    const/16 v4, 0x5dc

    .line 2611
    .line 2612
    if-lt v3, v4, :cond_57

    .line 2613
    .line 2614
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2615
    .line 2616
    .line 2617
    goto :goto_34

    .line 2618
    :cond_58
    new-instance v1, Ld50;

    .line 2619
    .line 2620
    const/16 v2, 0x8

    .line 2621
    .line 2622
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2623
    .line 2624
    .line 2625
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2626
    .line 2627
    .line 2628
    move-result-object v0

    .line 2629
    new-instance v1, Ljava/util/HashSet;

    .line 2630
    .line 2631
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2632
    .line 2633
    .line 2634
    new-instance v2, Ljava/util/ArrayList;

    .line 2635
    .line 2636
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2637
    .line 2638
    .line 2639
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v0

    .line 2643
    :cond_59
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2644
    .line 2645
    .line 2646
    move-result v3

    .line 2647
    if-eqz v3, :cond_5f

    .line 2648
    .line 2649
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v3

    .line 2653
    move-object v4, v3

    .line 2654
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2655
    .line 2656
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v4

    .line 2660
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2661
    .line 2662
    .line 2663
    move-result v4

    .line 2664
    if-eqz v4, :cond_59

    .line 2665
    .line 2666
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2667
    .line 2668
    .line 2669
    goto :goto_35

    .line 2670
    :cond_5a
    filled-new-array {v13, v4}, [Ljava/lang/String;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v0

    .line 2674
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v0

    .line 2678
    filled-new-array {v8, v7}, [Ljava/lang/String;

    .line 2679
    .line 2680
    .line 2681
    move-result-object v2

    .line 2682
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v8

    .line 2686
    move-object v3, v5

    .line 2687
    const/4 v5, 0x0

    .line 2688
    move-object v4, v6

    .line 2689
    const-string v6, "void"

    .line 2690
    .line 2691
    move-object v7, v0

    .line 2692
    invoke-static/range {v3 .. v8}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v0

    .line 2696
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2697
    .line 2698
    .line 2699
    new-instance v0, Ljava/util/ArrayList;

    .line 2700
    .line 2701
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2702
    .line 2703
    .line 2704
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v1

    .line 2708
    :cond_5b
    :goto_36
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2709
    .line 2710
    .line 2711
    move-result v2

    .line 2712
    if-eqz v2, :cond_5c

    .line 2713
    .line 2714
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2715
    .line 2716
    .line 2717
    move-result-object v2

    .line 2718
    move-object v3, v2

    .line 2719
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2720
    .line 2721
    invoke-static {v3}, Lfb;->κ(Ljava/lang/reflect/Method;)I

    .line 2722
    .line 2723
    .line 2724
    move-result v3

    .line 2725
    const/16 v4, 0x320

    .line 2726
    .line 2727
    if-lt v3, v4, :cond_5b

    .line 2728
    .line 2729
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2730
    .line 2731
    .line 2732
    goto :goto_36

    .line 2733
    :cond_5c
    new-instance v1, Ld50;

    .line 2734
    .line 2735
    const/16 v2, 0x9

    .line 2736
    .line 2737
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2738
    .line 2739
    .line 2740
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v0

    .line 2744
    new-instance v1, Ljava/util/HashSet;

    .line 2745
    .line 2746
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2747
    .line 2748
    .line 2749
    new-instance v2, Ljava/util/ArrayList;

    .line 2750
    .line 2751
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2752
    .line 2753
    .line 2754
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v0

    .line 2758
    :cond_5d
    :goto_37
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2759
    .line 2760
    .line 2761
    move-result v3

    .line 2762
    if-eqz v3, :cond_5e

    .line 2763
    .line 2764
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v3

    .line 2768
    move-object v4, v3

    .line 2769
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2770
    .line 2771
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v4

    .line 2775
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2776
    .line 2777
    .line 2778
    move-result v4

    .line 2779
    if-eqz v4, :cond_5d

    .line 2780
    .line 2781
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2782
    .line 2783
    .line 2784
    goto :goto_37

    .line 2785
    :cond_5e
    invoke-static {v2, v15}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2786
    .line 2787
    .line 2788
    move-result-object v2

    .line 2789
    :cond_5f
    return-object v2

    .line 2790
    :pswitch_1c
    move-object/from16 v3, p1

    .line 2791
    .line 2792
    check-cast v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 2793
    .line 2794
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2795
    .line 2796
    .line 2797
    sget-object v1, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2798
    .line 2799
    new-instance v1, Ljava/util/ArrayList;

    .line 2800
    .line 2801
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2802
    .line 2803
    .line 2804
    sget-object v2, Lfb;->γ:Ljava/util/List;

    .line 2805
    .line 2806
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v2

    .line 2810
    :goto_38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2811
    .line 2812
    .line 2813
    move-result v4

    .line 2814
    move v5, v4

    .line 2815
    iget-object v4, v0, Lbb;->ζ:Ljava/lang/ClassLoader;

    .line 2816
    .line 2817
    sget-object v8, Ljz;->ε:Ljz;

    .line 2818
    .line 2819
    const-string v6, "boolean"

    .line 2820
    .line 2821
    if-eqz v5, :cond_60

    .line 2822
    .line 2823
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2824
    .line 2825
    .line 2826
    move-result-object v5

    .line 2827
    check-cast v5, Ljava/lang/String;

    .line 2828
    .line 2829
    filled-new-array {v13, v13, v6}, [Ljava/lang/String;

    .line 2830
    .line 2831
    .line 2832
    move-result-object v6

    .line 2833
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2834
    .line 2835
    .line 2836
    move-result-object v7

    .line 2837
    const-string v6, "java.lang.Boolean"

    .line 2838
    .line 2839
    invoke-static/range {v3 .. v8}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2840
    .line 2841
    .line 2842
    move-result-object v4

    .line 2843
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2844
    .line 2845
    .line 2846
    goto :goto_38

    .line 2847
    :cond_60
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2848
    .line 2849
    .line 2850
    move-result v0

    .line 2851
    if-nez v0, :cond_64

    .line 2852
    .line 2853
    new-instance v0, Ljava/util/ArrayList;

    .line 2854
    .line 2855
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2856
    .line 2857
    .line 2858
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v1

    .line 2862
    :cond_61
    :goto_39
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2863
    .line 2864
    .line 2865
    move-result v2

    .line 2866
    if-eqz v2, :cond_62

    .line 2867
    .line 2868
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v2

    .line 2872
    move-object v3, v2

    .line 2873
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2874
    .line 2875
    invoke-static {v3}, Lfb;->λ(Ljava/lang/reflect/Method;)I

    .line 2876
    .line 2877
    .line 2878
    move-result v3

    .line 2879
    const/16 v4, 0x708

    .line 2880
    .line 2881
    if-lt v3, v4, :cond_61

    .line 2882
    .line 2883
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2884
    .line 2885
    .line 2886
    goto :goto_39

    .line 2887
    :cond_62
    new-instance v1, Ld50;

    .line 2888
    .line 2889
    const/16 v2, 0xc

    .line 2890
    .line 2891
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2892
    .line 2893
    .line 2894
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2895
    .line 2896
    .line 2897
    move-result-object v0

    .line 2898
    new-instance v1, Ljava/util/HashSet;

    .line 2899
    .line 2900
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2901
    .line 2902
    .line 2903
    new-instance v2, Ljava/util/ArrayList;

    .line 2904
    .line 2905
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2906
    .line 2907
    .line 2908
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v0

    .line 2912
    :cond_63
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2913
    .line 2914
    .line 2915
    move-result v3

    .line 2916
    if-eqz v3, :cond_69

    .line 2917
    .line 2918
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v3

    .line 2922
    move-object v4, v3

    .line 2923
    check-cast v4, Ljava/lang/reflect/Method;

    .line 2924
    .line 2925
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v4

    .line 2929
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2930
    .line 2931
    .line 2932
    move-result v4

    .line 2933
    if-eqz v4, :cond_63

    .line 2934
    .line 2935
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2936
    .line 2937
    .line 2938
    goto :goto_3a

    .line 2939
    :cond_64
    filled-new-array {v13, v13, v6}, [Ljava/lang/String;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v0

    .line 2943
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2944
    .line 2945
    .line 2946
    move-result-object v7

    .line 2947
    const/4 v5, 0x0

    .line 2948
    const-string v6, "java.lang.Boolean"

    .line 2949
    .line 2950
    invoke-static/range {v3 .. v8}, Lfb;->α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2951
    .line 2952
    .line 2953
    move-result-object v0

    .line 2954
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2955
    .line 2956
    .line 2957
    new-instance v0, Ljava/util/ArrayList;

    .line 2958
    .line 2959
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2960
    .line 2961
    .line 2962
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2963
    .line 2964
    .line 2965
    move-result-object v1

    .line 2966
    :cond_65
    :goto_3b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2967
    .line 2968
    .line 2969
    move-result v2

    .line 2970
    if-eqz v2, :cond_66

    .line 2971
    .line 2972
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2973
    .line 2974
    .line 2975
    move-result-object v2

    .line 2976
    move-object v3, v2

    .line 2977
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2978
    .line 2979
    invoke-static {v3}, Lfb;->λ(Ljava/lang/reflect/Method;)I

    .line 2980
    .line 2981
    .line 2982
    move-result v3

    .line 2983
    const/16 v4, 0x4b0

    .line 2984
    .line 2985
    if-lt v3, v4, :cond_65

    .line 2986
    .line 2987
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2988
    .line 2989
    .line 2990
    goto :goto_3b

    .line 2991
    :cond_66
    new-instance v1, Ld50;

    .line 2992
    .line 2993
    const/16 v2, 0xd

    .line 2994
    .line 2995
    invoke-direct {v1, v2}, Ld50;-><init>(I)V

    .line 2996
    .line 2997
    .line 2998
    invoke-static {v0, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    new-instance v1, Ljava/util/HashSet;

    .line 3003
    .line 3004
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 3005
    .line 3006
    .line 3007
    new-instance v2, Ljava/util/ArrayList;

    .line 3008
    .line 3009
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3010
    .line 3011
    .line 3012
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v0

    .line 3016
    :cond_67
    :goto_3c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3017
    .line 3018
    .line 3019
    move-result v3

    .line 3020
    if-eqz v3, :cond_68

    .line 3021
    .line 3022
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3023
    .line 3024
    .line 3025
    move-result-object v3

    .line 3026
    move-object v4, v3

    .line 3027
    check-cast v4, Ljava/lang/reflect/Method;

    .line 3028
    .line 3029
    invoke-static {v4}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 3030
    .line 3031
    .line 3032
    move-result-object v4

    .line 3033
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 3034
    .line 3035
    .line 3036
    move-result v4

    .line 3037
    if-eqz v4, :cond_67

    .line 3038
    .line 3039
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3040
    .line 3041
    .line 3042
    goto :goto_3c

    .line 3043
    :cond_68
    invoke-static {v2, v15}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v2

    .line 3047
    :cond_69
    return-object v2

    .line 3048
    nop

    .line 3049
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
