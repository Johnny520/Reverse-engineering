.class public abstract Lh;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static volatile a:Z = false

.field public static final b:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh;->b:Ljava/util/HashSet;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "TABLET"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_2

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static b(Ljava/lang/Class;[Ljava/lang/Class;)I
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    array-length v1, p1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    move v3, v0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v2, :cond_5

    .line 17
    .line 18
    :try_start_1
    aget-object v5, v1, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    array-length v8, p1

    .line 39
    move v9, v0

    .line 40
    :goto_1
    if-ge v9, v8, :cond_3

    .line 41
    .line 42
    aget-object v10, p1, v9

    .line 43
    .line 44
    if-ne v6, v10, :cond_2

    .line 45
    .line 46
    invoke-static {v10}, Lh;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    goto :goto_3

    .line 51
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_2
    move v0, v4

    .line 55
    goto :goto_5

    .line 56
    :cond_3
    move-object v6, v7

    .line 57
    :goto_3
    if-nez v6, :cond_4

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_4
    const/4 v8, 0x1

    .line 61
    invoke-virtual {v5, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v7, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_2

    .line 74
    :cond_5
    return v4

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "tablet mode cached field write failed: "

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p0, ": "

    .line 91
    .line 92
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_6
    :goto_6
    return v0
.end method

.method public static c(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    sget-boolean v0, Lh;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    :try_start_0
    const-string v0, "com.tencent.common.config.pad.PadUtil"

    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "com.tencent.common.config.pad.DeviceType"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 21
    .line 22
    :try_start_1
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-static {v2}, Lh;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    :catchall_0
    :cond_1
    :try_start_2
    const-string v2, "com.tencent.common.config.DeviceType"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 44
    .line 45
    :try_start_3
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-static {p0}, Lh;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 64
    .line 65
    .line 66
    :catchall_1
    :cond_2
    const/4 p0, 0x0

    .line 67
    :try_start_4
    new-array v2, p0, [Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, [Ljava/lang/Class;

    .line 74
    .line 75
    if-eqz v0, :cond_a

    .line 76
    .line 77
    array-length v2, v1

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    invoke-static {v0, v1}, Lh;->b(Ljava/lang/Class;[Ljava/lang/Class;)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    array-length v3, v0

    .line 91
    move v4, p0

    .line 92
    move v5, v4

    .line 93
    :goto_0
    const/4 v6, 0x1

    .line 94
    if-ge v4, v3, :cond_8

    .line 95
    .line 96
    aget-object v7, v0, v4

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    if-eqz v8, :cond_6

    .line 114
    .line 115
    array-length v9, v1

    .line 116
    move v10, p0

    .line 117
    :goto_1
    if-ge v10, v9, :cond_6

    .line 118
    .line 119
    aget-object v11, v1, v10

    .line 120
    .line 121
    if-ne v8, v11, :cond_5

    .line 122
    .line 123
    invoke-static {v11}, Lh;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    const/4 v8, 0x0

    .line 132
    :goto_2
    if-nez v8, :cond_7

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    new-instance v9, Le;

    .line 143
    .line 144
    invoke-direct {v9, v6, v1, v8}, Le;-><init>(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v7, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 148
    .line 149
    .line 150
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    new-instance v6, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v8, "hooked tablet mode: "

    .line 158
    .line 159
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-static {v7}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-static {v6}, Lv4;->C(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_8
    if-lez v5, :cond_9

    .line 180
    .line 181
    sput-boolean v6, Lh;->a:Z

    .line 182
    .line 183
    new-instance p0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const-string v0, "tablet mode hooks installed count="

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v0, ", cachedFields="

    .line 197
    .line 198
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_9
    const-string p0, "tablet mode method not found"

    .line 213
    .line 214
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_a
    :goto_4
    const-string p0, "tablet mode target not found"

    .line 219
    .line 220
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :catchall_2
    move-exception p0

    .line 225
    const-string v0, "hookForceTabletMode failed: "

    .line 226
    .line 227
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    :cond_b
    :goto_5
    return-void
.end method

.method public static d(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-string v0, "web-kernel"

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    const-string v3, "com.tencent.smtt.sdk.QbSdk"

    .line 7
    .line 8
    invoke-static {p0, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-eqz v3, :cond_3

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    array-length v4, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 19
    move v5, v2

    .line 20
    move v6, v5

    .line 21
    :goto_0
    if-ge v5, v4, :cond_4

    .line 22
    .line 23
    :try_start_1
    aget-object v7, v3, v5

    .line 24
    .line 25
    const-string v8, "getIsSysWebViewForcedByOuter"

    .line 26
    .line 27
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    const-string v8, "isSysWebViewForcedByOuter"

    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-eqz v8, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v3

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :goto_1
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_2

    .line 61
    .line 62
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    if-ne v8, v9, :cond_2

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    array-length v8, v8

    .line 75
    if-nez v8, :cond_2

    .line 76
    .line 77
    invoke-static {v7}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    sget-object v9, Lh;->b:Ljava/util/HashSet;

    .line 82
    .line 83
    monitor-enter v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :try_start_2
    invoke-virtual {v9, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 89
    if-nez v10, :cond_1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    :try_start_3
    new-instance v9, Lf;

    .line 93
    .line 94
    invoke-direct {v9, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v7, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 98
    .line 99
    .line 100
    add-int/lit8 v6, v6, 0x1

    .line 101
    .line 102
    new-instance v7, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v9, "hooked web kernel runtime fallback gate: "

    .line 108
    .line 109
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-static {v7}, Lv4;->C(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v3

    .line 124
    :try_start_4
    sget-object v4, Lh;->b:Ljava/util/HashSet;

    .line 125
    .line 126
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    :try_start_5
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 131
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 132
    :catchall_2
    move-exception v3

    .line 133
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 134
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 135
    :catchall_3
    move-exception v3

    .line 136
    :try_start_9
    monitor-exit v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 137
    :try_start_a
    throw v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 138
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :catchall_4
    move-exception v3

    .line 142
    move v6, v2

    .line 143
    goto :goto_3

    .line 144
    :cond_3
    move v6, v2

    .line 145
    goto :goto_4

    .line 146
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v5, "hook QbSdk web fallback failed: "

    .line 149
    .line 150
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v4}, Lv4;->C(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const-string v4, "qbsdk-hook"

    .line 164
    .line 165
    invoke-static {v0, v4, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_4
    if-nez v6, :cond_c

    .line 169
    .line 170
    sget-object v3, Lh;->b:Ljava/util/HashSet;

    .line 171
    .line 172
    monitor-enter v3

    .line 173
    :try_start_b
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 178
    if-eqz v4, :cond_c

    .line 179
    .line 180
    :try_start_c
    const-string v3, "com.tencent.smtt.utils.LoadPropertiesUtils"

    .line 181
    .line 182
    invoke-static {p0, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-nez p0, :cond_5

    .line 187
    .line 188
    goto/16 :goto_9

    .line 189
    .line 190
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    array-length v3, p0

    .line 195
    const/4 v4, 0x0

    .line 196
    move v5, v2

    .line 197
    move-object v7, v4

    .line 198
    :goto_5
    if-ge v5, v3, :cond_9

    .line 199
    .line 200
    aget-object v8, p0, v5

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-nez v9, :cond_8

    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    if-nez v9, :cond_8

    .line 221
    .line 222
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 227
    .line 228
    if-ne v9, v10, :cond_8

    .line 229
    .line 230
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    array-length v9, v9

    .line 235
    if-eqz v9, :cond_6

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_6
    if-eqz v7, :cond_7

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_7
    move-object v7, v8

    .line 242
    :cond_8
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_9
    move-object v4, v7

    .line 246
    :goto_7
    if-nez v4, :cond_a

    .line 247
    .line 248
    const-string p0, "web kernel properties fallback skipped reason=unique zero-arg void target missing"

    .line 249
    .line 250
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_9

    .line 254
    :catchall_5
    move-exception p0

    .line 255
    goto :goto_8

    .line 256
    :cond_a
    invoke-static {v4}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    sget-object v3, Lh;->b:Ljava/util/HashSet;

    .line 261
    .line 262
    monitor-enter v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 263
    :try_start_d
    invoke-virtual {v3, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 268
    if-nez v5, :cond_b

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_b
    const/4 v3, 0x1

    .line 272
    :try_start_e
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 273
    .line 274
    .line 275
    new-instance v5, Lg;

    .line 276
    .line 277
    invoke-direct {v5, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 278
    .line 279
    .line 280
    invoke-static {v4, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 281
    .line 282
    .line 283
    :try_start_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const-string v4, "hooked web kernel properties force system: "

    .line 289
    .line 290
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    move v2, v3

    .line 304
    goto :goto_9

    .line 305
    :catchall_6
    move-exception v1

    .line 306
    sget-object v3, Lh;->b:Ljava/util/HashSet;

    .line 307
    .line 308
    monitor-enter v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 309
    :try_start_10
    invoke-virtual {v3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 313
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 314
    :catchall_7
    move-exception p0

    .line 315
    :try_start_12
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 316
    :try_start_13
    throw p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 317
    :catchall_8
    move-exception p0

    .line 318
    :try_start_14
    monitor-exit v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 319
    :try_start_15
    throw p0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    .line 320
    :goto_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    const-string v3, "hookLoadPropertiesUtils failed: "

    .line 323
    .line 324
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1}, Lv4;->C(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const-string v1, "legacy-properties-hook"

    .line 338
    .line 339
    invoke-static {v0, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    :goto_9
    add-int/2addr v6, v2

    .line 343
    goto :goto_a

    .line 344
    :catchall_9
    move-exception p0

    .line 345
    :try_start_16
    monitor-exit v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 346
    throw p0

    .line 347
    :cond_c
    :goto_a
    if-nez v6, :cond_d

    .line 348
    .line 349
    sget-object p0, Lh;->b:Ljava/util/HashSet;

    .line 350
    .line 351
    monitor-enter p0

    .line 352
    :try_start_17
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    monitor-exit p0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 357
    if-eqz v0, :cond_d

    .line 358
    .line 359
    const-string p0, "web kernel fallback target not found"

    .line 360
    .line 361
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :catchall_a
    move-exception v0

    .line 366
    :try_start_18
    monitor-exit p0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 367
    throw v0

    .line 368
    :cond_d
    :goto_b
    return-void
.end method
