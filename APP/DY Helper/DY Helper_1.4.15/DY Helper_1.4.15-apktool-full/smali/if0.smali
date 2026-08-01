.class public final Lif0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/List;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "~78D771E8EDF777FCD63305F705F385C32437F8A58A06E57B236CBE52EE80690C87062CCF8375AD4388FCF0F5F78DB89E313078C0432356E4724AD1766356CFE4EE7D09AF8F5E60784E408CC10DD2631F"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9C9B975819B818F3ADA4B36E4ACA44C1601E3B314B37AE43A7B0DDBE45749DE061A534361A60B66540430C9018C112790C01FF65DFD96CB"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lif0;->α:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lif0;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 28
    .line 29
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    array-length v1, p0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    aget-object v3, p0, v2

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-object v0
.end method

.method public static β(Ljava/lang/ClassLoader;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lif0;->α:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v3, ", "

    .line 20
    .line 21
    sget-object v4, Ls62;->α:Ls62;

    .line 22
    .line 23
    const-string v6, "r3a3868dbf7747834"

    .line 24
    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v8, v0

    .line 32
    check-cast v8, Ljava/lang/String;

    .line 33
    .line 34
    move-object/from16 v9, p0

    .line 35
    .line 36
    :try_start_0
    invoke-static {v9, v8}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v11, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    array-length v12, v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    const/4 v14, 0x0

    .line 58
    :goto_1
    const-class v15, Landroid/view/ViewGroup;

    .line 59
    .line 60
    if-ge v14, v12, :cond_3

    .line 61
    .line 62
    :try_start_1
    aget-object v13, v10, v14

    .line 63
    .line 64
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v7, "mLongPressSpeedView"

    .line 69
    .line 70
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v15, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_5

    .line 92
    :cond_2
    :goto_2
    add-int/lit8 v14, v14, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v11, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    array-length v5, v0

    .line 114
    const/4 v13, 0x0

    .line 115
    :goto_3
    if-ge v13, v5, :cond_5

    .line 116
    .line 117
    aget-object v7, v0, v13

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-virtual {v15, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-eqz v10, :cond_4

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v10}, Lif0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-nez v10, :cond_4

    .line 145
    .line 146
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Ljava/lang/reflect/Field;

    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :goto_5
    new-instance v4, Leo1;

    .line 177
    .line 178
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    :goto_6
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_0

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    const-string v4, "\u89e3\u6790\u5bbf\u4e3b\u957f\u6309\u6d6e\u5c42\u5931\u8d25: "

    .line 192
    .line 193
    invoke-static {v4, v8, v3, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const/4 v5, 0x4

    .line 198
    const/4 v7, 0x0

    .line 199
    invoke-static {v6, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_7
    const/4 v5, 0x4

    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_8

    .line 211
    .line 212
    const-string v0, "\u672a\u89e3\u6790\u5230\u5bbf\u4e3b\u957f\u6309\u500d\u901f\u6d6e\u5c42\uff0c\u8df3\u8fc7\u63d0\u793a\u540c\u6b65"

    .line 213
    .line 214
    invoke-static {v6, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_a

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    move-object v2, v0

    .line 233
    check-cast v2, Ljava/lang/Class;

    .line 234
    .line 235
    :try_start_2
    invoke-static {v2}, Lif0;->γ(Ljava/lang/Class;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 236
    .line 237
    .line 238
    move-object v5, v4

    .line 239
    goto :goto_8

    .line 240
    :catchall_1
    move-exception v0

    .line 241
    new-instance v5, Leo1;

    .line 242
    .line 243
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    :goto_8
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-eqz v0, :cond_9

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v5, "\u5b89\u88c5\u6d6e\u5c42\u63d0\u793a\u540c\u6b65\u5931\u8d25: "

    .line 261
    .line 262
    invoke-static {v5, v2, v3, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const/4 v5, 0x4

    .line 267
    const/4 v7, 0x0

    .line 268
    invoke-static {v6, v0, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_9
    const/4 v5, 0x4

    .line 273
    const/4 v7, 0x0

    .line 274
    goto :goto_7

    .line 275
    :cond_a
    return-void
.end method

.method public static γ(Ljava/lang/Class;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lif0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    const-string v3, "r3a3868dbf7747834"

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "\u957f\u6309\u500d\u901f\u6d6e\u5c42\u7f3a\u5c11\u517c\u5bb9\u72b6\u6001\u65b9\u6cd5: "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ":"

    .line 78
    .line 79
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "#"

    .line 86
    .line 87
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, "(boolean)"

    .line 94
    .line 95
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v5, Lif0;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 103
    .line 104
    invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_1

    .line 109
    .line 110
    :try_start_0
    sget-object v6, Lxq0;->α:Lxq0;

    .line 111
    .line 112
    new-instance v7, Lbt;

    .line 113
    .line 114
    invoke-direct {v7, v1}, Lbt;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v0, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    new-instance v6, Leo1;

    .line 124
    .line 125
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v6

    .line 129
    :goto_1
    instance-of v6, v0, Leo1;

    .line 130
    .line 131
    if-nez v6, :cond_2

    .line 132
    .line 133
    move-object v6, v0

    .line 134
    check-cast v6, Ll01;

    .line 135
    .line 136
    const-string v6, "\u5bbf\u4e3b\u957f\u6309\u500d\u901f\u63d0\u793a Hook \u5df2\u5b89\u88c5: "

    .line 137
    .line 138
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v3, v6, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_1

    .line 150
    .line 151
    invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v5, "\u5bbf\u4e3b\u957f\u6309\u500d\u901f\u63d0\u793a Hook \u5b89\u88c5\u5931\u8d25: "

    .line 159
    .line 160
    const-string v6, ", "

    .line 161
    .line 162
    invoke-static {v5, v1, v6, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    return-void
.end method

.method public static δ(Landroid/view/View;I)V
    .locals 11

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-nez v2, :cond_1

    .line 22
    .line 23
    const-string v2, ""

    .line 24
    .line 25
    :cond_1
    sget-object v3, Lgf0;->α:Lym1;

    .line 26
    .line 27
    const/4 v3, 0x5

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-static {p1, v4, v3}, Lj81;->μ(III)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sget-object v5, Lgf0;->α:Lym1;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v5, v5, Lym1;->ε:Ljava/util/regex/Pattern;

    .line 39
    .line 40
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v5, v1, v2}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-nez v5, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    new-instance v7, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    .line 66
    .line 67
    move v8, v1

    .line 68
    :cond_3
    invoke-virtual {v5}, Lix0;->β()Lxm0;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    iget v9, v9, Lvm0;->ε:I

    .line 73
    .line 74
    invoke-virtual {v7, v2, v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Lix0;->α()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Lgx0;

    .line 82
    .line 83
    invoke-virtual {v8, v4}, Lgx0;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-virtual {v5}, Lix0;->α()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    const/4 v10, 0x2

    .line 92
    check-cast v9, Lgx0;

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Lgx0;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    new-instance v10, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Lix0;->β()Lxm0;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget v8, v8, Lvm0;->ζ:I

    .line 124
    .line 125
    add-int/2addr v8, v4

    .line 126
    invoke-virtual {v5}, Lix0;->γ()Lix0;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-ge v8, v6, :cond_4

    .line 131
    .line 132
    if-nez v5, :cond_3

    .line 133
    .line 134
    :cond_4
    if-ge v8, v6, :cond_5

    .line 135
    .line 136
    invoke-virtual {v7, v2, v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    :goto_1
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_6

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 153
    .line 154
    if-eqz v0, :cond_7

    .line 155
    .line 156
    check-cast p0, Landroid/view/ViewGroup;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_2
    if-ge v1, v0, :cond_7

    .line 163
    .line 164
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {v2, p1}, Lif0;->δ(Landroid/view/View;I)V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v1, v1, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    return-void
.end method
