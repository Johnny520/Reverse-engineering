.class public abstract Lzc;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/util/Map;

.field public static final b:Ljava/util/Map;

.field public static volatile c:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lzc;->a:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lzc;->b:Ljava/util/Map;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p3, :cond_b

    .line 4
    .line 5
    array-length v2, p3

    .line 6
    if-lez v2, :cond_b

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-object v3, p3, v2

    .line 10
    .line 11
    if-eqz v3, :cond_9

    .line 12
    .line 13
    instance-of v4, v3, Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v4, :cond_9

    .line 16
    .line 17
    instance-of v4, v3, Ljava/lang/Number;

    .line 18
    .line 19
    if-nez v4, :cond_9

    .line 20
    .line 21
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-nez v4, :cond_9

    .line 24
    .line 25
    instance-of v4, v3, Landroid/view/View;

    .line 26
    .line 27
    if-nez v4, :cond_9

    .line 28
    .line 29
    instance-of v4, v3, Ljava/lang/Class;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    if-eqz p2, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {p2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lzc;->b(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :catchall_0
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-class v4, Ljava/lang/Object;

    .line 64
    .line 65
    if-ne p2, v4, :cond_2

    .line 66
    .line 67
    :goto_0
    move-object v5, v0

    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    sget-object v4, Lzc;->a:Ljava/util/Map;

    .line 71
    .line 72
    monitor-enter v4

    .line 73
    :try_start_1
    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    monitor-exit v4

    .line 82
    goto :goto_5

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_3
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    sget-object v5, Lzc;->b:Ljava/util/Map;

    .line 88
    .line 89
    monitor-enter v5

    .line 90
    :try_start_2
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-interface {v5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v4, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_4

    .line 101
    .line 102
    monitor-exit v5

    .line 103
    goto :goto_0

    .line 104
    :catchall_2
    move-exception p0

    .line 105
    goto :goto_7

    .line 106
    :cond_4
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    move-object v4, p2

    .line 108
    move-object v5, v0

    .line 109
    :goto_1
    if-eqz v4, :cond_7

    .line 110
    .line 111
    const-class v6, Ljava/lang/Object;

    .line 112
    .line 113
    if-eq v4, v6, :cond_7

    .line 114
    .line 115
    if-nez v5, :cond_7

    .line 116
    .line 117
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 121
    goto :goto_2

    .line 122
    :catchall_3
    move-object v6, v0

    .line 123
    :goto_2
    if-eqz v6, :cond_6

    .line 124
    .line 125
    array-length v7, v6

    .line 126
    move v8, v2

    .line 127
    :goto_3
    if-ge v8, v7, :cond_6

    .line 128
    .line 129
    aget-object v9, v6, v8

    .line 130
    .line 131
    invoke-static {v9}, Lzc;->c(Ljava/lang/reflect/Method;)Z

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    if-eqz v10, :cond_5

    .line 136
    .line 137
    invoke-virtual {v9, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 138
    .line 139
    .line 140
    move-object v5, v9

    .line 141
    goto :goto_4

    .line 142
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    :goto_4
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    if-eqz v5, :cond_8

    .line 151
    .line 152
    sget-object v2, Lzc;->a:Ljava/util/Map;

    .line 153
    .line 154
    monitor-enter v2

    .line 155
    :try_start_4
    invoke-interface {v2, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    monitor-exit v2

    .line 159
    goto :goto_5

    .line 160
    :catchall_4
    move-exception p0

    .line 161
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 162
    throw p0

    .line 163
    :cond_8
    sget-object v2, Lzc;->b:Ljava/util/Map;

    .line 164
    .line 165
    monitor-enter v2

    .line 166
    :try_start_5
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-interface {v2, p2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 172
    :goto_5
    if-nez v5, :cond_a

    .line 173
    .line 174
    :catchall_5
    :cond_9
    :goto_6
    move-object p2, v0

    .line 175
    goto :goto_9

    .line 176
    :cond_a
    :try_start_6
    invoke-virtual {v5, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-static {p2}, Lzc;->b(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    goto :goto_9

    .line 187
    :catchall_6
    move-exception p0

    .line 188
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 189
    throw p0

    .line 190
    :goto_7
    :try_start_8
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 191
    throw p0

    .line 192
    :goto_8
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 193
    throw p0

    .line 194
    :goto_9
    if-eqz p2, :cond_b

    .line 195
    .line 196
    return-object p2

    .line 197
    :cond_b
    if-eqz p0, :cond_c

    .line 198
    .line 199
    if-eqz p1, :cond_c

    .line 200
    .line 201
    :try_start_a
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {p0}, Lzc;->b(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 209
    if-eqz p1, :cond_c

    .line 210
    .line 211
    return-object p0

    .line 212
    :catchall_7
    :cond_c
    if-eqz p3, :cond_d

    .line 213
    .line 214
    array-length p0, p3

    .line 215
    if-le p0, v1, :cond_d

    .line 216
    .line 217
    aget-object p0, p3, v1

    .line 218
    .line 219
    invoke-static {p0}, Lzc;->b(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_d

    .line 224
    .line 225
    aget-object p0, p3, v1

    .line 226
    .line 227
    return-object p0

    .line 228
    :cond_d
    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    instance-of v1, p0, Landroid/view/View;

    .line 5
    .line 6
    if-nez v1, :cond_5

    .line 7
    .line 8
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 9
    .line 10
    if-nez v1, :cond_5

    .line 11
    .line 12
    instance-of v1, p0, Ljava/lang/Number;

    .line 13
    .line 14
    if-nez v1, :cond_5

    .line 15
    .line 16
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 17
    .line 18
    if-nez v1, :cond_5

    .line 19
    .line 20
    instance-of v1, p0, Ljava/lang/Class;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, ".AIOMsgItem"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-nez v2, :cond_4

    .line 41
    .line 42
    const-string v2, ".aio.msg."

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v2, "MsgRecord"

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    return v3

    .line 60
    :cond_2
    invoke-static {p0}, Lv4;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    return v3

    .line 67
    :cond_3
    return v0

    .line 68
    :cond_4
    :goto_0
    return v3

    .line 69
    :cond_5
    :goto_1
    return v0
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v1, v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v1, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    const-string v1, ".AIOMsgItem"

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return v0

    .line 58
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_3
    :goto_1
    return v0
.end method

.method public static d()V
    .locals 2

    .line 1
    sget-object v0, Lzc;->a:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 5
    .line 6
    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    sget-object v1, Lzc;->b:Ljava/util/Map;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 12
    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0

    .line 19
    :catchall_1
    move-exception v1

    .line 20
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 21
    throw v1
.end method
