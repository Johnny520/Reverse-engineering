.class public abstract Lc30;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Follow"

    .line 2
    .line 3
    const-string v1, "Relation"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lc30;->α:Ljava/util/Set;

    .line 14
    .line 15
    const-string v0, "ColorRing"

    .line 16
    .line 17
    invoke-static {v0}, Lg81;->φ(Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lc30;->β:Ljava/util/Set;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lc30;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lc30;->δ:Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static β(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "getFirst"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_2

    .line 21
    .line 22
    aget-object v5, v2, v4

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {v6, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    array-length v6, v6

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v5, v1

    .line 49
    :goto_1
    if-eqz v5, :cond_3

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object p0

    .line 60
    :catchall_0
    :cond_3
    :try_start_1
    const-string v2, "first"

    .line 61
    .line 62
    invoke-static {p0, v2}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    return-object p0

    .line 67
    :catchall_1
    :try_start_2
    const-string v2, "a"

    .line 68
    .line 69
    invoke-static {p0, v2}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    return-object p0

    .line 74
    :catchall_2
    :try_start_3
    const-class v2, Ll91;

    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 90
    return-object p0

    .line 91
    :catchall_3
    :cond_4
    :goto_2
    return-object v1
.end method

.method public static γ(Ljava/lang/Class;Ljava/lang/String;)I
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v3, v2

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    :goto_0
    const/4 v0, 0x0

    .line 15
    const-string v7, "FeedRightControlsHide3903"

    .line 16
    .line 17
    if-ge v5, v3, :cond_8

    .line 18
    .line 19
    aget-object v8, v2, v5

    .line 20
    .line 21
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-class v9, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    if-nez v9, :cond_0

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    array-length v10, v9

    .line 43
    const/4 v11, 0x1

    .line 44
    const-class v12, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-ne v10, v11, :cond_1

    .line 47
    .line 48
    aget-object v10, v9, v4

    .line 49
    .line 50
    invoke-virtual {v12, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-eqz v10, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    array-length v10, v9

    .line 58
    move v13, v4

    .line 59
    :goto_1
    if-ge v13, v10, :cond_7

    .line 60
    .line 61
    aget-object v14, v9, v13

    .line 62
    .line 63
    const-class v15, Landroid/content/Context;

    .line 64
    .line 65
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-eqz v14, :cond_6

    .line 70
    .line 71
    array-length v10, v9

    .line 72
    move v13, v4

    .line 73
    :goto_2
    if-ge v13, v10, :cond_7

    .line 74
    .line 75
    aget-object v14, v9, v13

    .line 76
    .line 77
    invoke-virtual {v12, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    if-eqz v14, :cond_5

    .line 82
    .line 83
    :goto_3
    const-string v9, "viewFactory:"

    .line 84
    .line 85
    invoke-virtual {v9, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v14, Ls20;

    .line 109
    .line 110
    const/16 v15, 0xc

    .line 111
    .line 112
    invoke-direct {v14, v15}, Ls20;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const/16 v15, 0x1f

    .line 116
    .line 117
    invoke-static {v13, v0, v0, v14, v15}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    const-string v14, "#"

    .line 130
    .line 131
    const-string v15, "("

    .line 132
    .line 133
    invoke-static {v10, v14, v12, v15, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v10, "):"

    .line 138
    .line 139
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v10, ":"

    .line 146
    .line 147
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    sget-object v12, Lc30;->δ:Ljava/util/LinkedHashSet;

    .line 158
    .line 159
    invoke-virtual {v12, v10}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_2

    .line 164
    .line 165
    move v0, v4

    .line 166
    goto :goto_5

    .line 167
    :cond_2
    :try_start_0
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lxq0;->α:Lxq0;

    .line 171
    .line 172
    new-instance v11, Lqg;

    .line 173
    .line 174
    const/4 v13, 0x4

    .line 175
    invoke-direct {v11, v13, v1, v8}, Lqg;-><init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v8, v11}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 179
    .line 180
    .line 181
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :catchall_0
    move-exception v0

    .line 185
    new-instance v8, Leo1;

    .line 186
    .line 187
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v0, v8

    .line 191
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    if-eqz v8, :cond_3

    .line 196
    .line 197
    invoke-virtual {v12, v10}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    const-string v12, " method="

    .line 205
    .line 206
    const-string v13, " err="

    .line 207
    .line 208
    const-string v14, "Hook 3903 \u53f3\u4fa7\u63a7\u4ef6\u65b9\u6cd5\u5931\u8d25 reason="

    .line 209
    .line 210
    invoke-static {v14, v9, v12, v10, v13}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-static {v7, v9, v8}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    :cond_3
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 225
    .line 226
    instance-of v8, v0, Leo1;

    .line 227
    .line 228
    if-eqz v8, :cond_4

    .line 229
    .line 230
    move-object v0, v7

    .line 231
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    :goto_5
    if-eqz v0, :cond_7

    .line 238
    .line 239
    add-int/lit8 v6, v6, 0x1

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :cond_6
    add-int/lit8 v13, v13, 0x1

    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :cond_7
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const-string v3, " class="

    .line 259
    .line 260
    const-string v4, " methods="

    .line 261
    .line 262
    const-string v5, "\u5df2\u5b89\u88c5 3903 \u53f3\u4fa7\u63a7\u4ef6 Hook control="

    .line 263
    .line 264
    invoke-static {v5, v1, v3, v2, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const/4 v2, 0x4

    .line 276
    invoke-static {v7, v1, v0, v2, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return v6
.end method

.method public static δ(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    const-string v0, "FeedRightControlsHide3903"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    sget-object v2, Lc30;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    :try_start_0
    sget-object v1, Lb30;->α:Lb30;

    .line 19
    .line 20
    invoke-virtual {v1, p0, v3}, Lb30;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move v4, v3

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Ljava/lang/Class;

    .line 40
    .line 41
    sget-object v6, Lb30;->α:Lb30;

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Lb30;->η(Ljava/lang/Class;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    invoke-static {v5, v6}, Lc30;->γ(Ljava/lang/Class;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    add-int/2addr v4, v5

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    sget-object v1, Lb30;->α:Lb30;

    .line 58
    .line 59
    invoke-virtual {v1, p0, v3}, Lb30;->ε(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/lang/Class;

    .line 78
    .line 79
    sget-object v5, Lxq0;->α:Lxq0;

    .line 80
    .line 81
    new-instance v6, Lf10;

    .line 82
    .line 83
    const/16 v7, 0xd

    .line 84
    .line 85
    invoke-direct {v6, v7}, Lf10;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v1, v6}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 p0, 0x4

    .line 95
    const/4 v1, 0x0

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 99
    .line 100
    .line 101
    const-string v4, "Feed \u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d 3903 \u672a\u547d\u4e2d\u76ee\u6807\u7c7b\uff0c\u7b49\u5f85 DexKit \u9884\u70ed\u540e\u91cd\u8bd5"

    .line 102
    .line 103
    invoke-static {v0, v4, v1, p0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v6, "Feed \u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d 3903 Hook \u5df2\u5b89\u88c5 targets="

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-static {v0, v4, v1, p0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :goto_2
    new-instance v1, Leo1;

    .line 131
    .line 132
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object p0, v1

    .line 136
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v3, "Feed \u53f3\u4fa7\u63a7\u4ef6\u5c4f\u853d 3903 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 152
    .line 153
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v0, v1, p0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    :goto_4
    return-void
.end method

.method public static ε(Ljava/lang/Class;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC4A7715FFCC5AB89D9F2F8D22FF033ED3A0ED25608D469AD56F47"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    array-length v2, v0

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v2, :cond_2

    .line 30
    .line 31
    aget-object v5, v0, v4

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v5}, Lc30;->ε(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    invoke-static {p0}, Lc30;->ε(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ne p0, v1, :cond_3

    .line 57
    .line 58
    move p0, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move p0, v3

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_3

    .line 69
    :goto_2
    new-instance v0, Leo1;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p0, v0

    .line 75
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    instance-of v2, p0, Leo1;

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    move-object p0, v0

    .line 82
    :cond_4
    check-cast p0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move v1, v3

    .line 92
    :goto_4
    return v1
.end method
