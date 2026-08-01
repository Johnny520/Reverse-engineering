.class public abstract Lj4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Ljava/util/Map;

.field public static volatile e:Lg4;

.field public static volatile f:Landroid/os/Handler;

.field public static volatile g:Lc2;

.field public static volatile h:Z

.field public static volatile i:Z

.field public static volatile j:J

.field public static volatile k:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy"

    .line 2
    .line 3
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lj4;->a:[Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lj4;->b:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lj4;->d:Ljava/util/Map;

    .line 39
    .line 40
    return-void
.end method

.method public static declared-synchronized A()V
    .locals 6

    .line 1
    const-class v0, Lj4;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    :try_start_0
    sput-wide v1, Lj4;->j:J

    .line 7
    .line 8
    sput-wide v1, Lj4;->k:J

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3}, Lj4;->d(Lg4;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    sput-boolean v4, Lj4;->h:Z

    .line 16
    .line 17
    sput-boolean v4, Lj4;->i:Z

    .line 18
    .line 19
    sget-object v5, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 22
    .line 23
    .line 24
    sget-object v5, Lj4;->d:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 27
    .line 28
    .line 29
    sget-object v5, Lj4;->b:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {v5}, Ljava/util/Set;->clear()V

    .line 32
    .line 33
    .line 34
    sput-wide v1, Li5;->t:J

    .line 35
    .line 36
    sput-object v3, Ls4;->c:Ljava/lang/ClassLoader;

    .line 37
    .line 38
    sput-boolean v4, Ls4;->d:Z

    .line 39
    .line 40
    sput-object v3, Ls4;->e:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    sput-object v3, Ls4;->f:Ljava/lang/Object;

    .line 43
    .line 44
    sput-boolean v4, Ls4;->g:Z

    .line 45
    .line 46
    sput-boolean v4, Ls4;->h:Z

    .line 47
    .line 48
    sput-object v3, Ls4;->i:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    sput-object v3, Ls4;->j:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    sput-object v3, Ls4;->k:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    sput-object v3, Ls4;->l:Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    sput-object v3, Ls4;->m:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    const-string v1, "reset"

    .line 59
    .line 60
    invoke-static {v3, v1}, Ls4;->f(Lf2;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception v1

    .line 66
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw v1
.end method

.method public static B(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v0, Li3;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p1, v1}, Li3;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Li3;->run()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance p0, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static C(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Li4;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object p1, v1, Li4;->c:Landroid/widget/EditText;

    .line 17
    .line 18
    invoke-static {p1, p0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public static D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    if-gt p0, v0, :cond_21

    .line 4
    .line 5
    aget v0, p4, v1

    .line 6
    .line 7
    const/16 v2, 0xb4

    .line 8
    .line 9
    if-le v0, v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_d

    .line 12
    .line 13
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_d

    .line 20
    .line 21
    :cond_1
    aget v0, p4, v1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    add-int/2addr v0, v2

    .line 25
    aput v0, p4, v1

    .line 26
    .line 27
    instance-of v0, p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    return v1

    .line 52
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    return v2

    .line 59
    :cond_3
    instance-of v0, p1, Ljava/lang/StringBuffer;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    check-cast p1, Ljava/lang/StringBuffer;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_4

    .line 82
    .line 83
    return v1

    .line 84
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    .line 89
    .line 90
    return v2

    .line 91
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/16 v4, 0x28

    .line 100
    .line 101
    if-eqz v3, :cond_a

    .line 102
    .line 103
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    move v3, v1

    .line 112
    :goto_0
    if-ge v1, v0, :cond_9

    .line 113
    .line 114
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    instance-of v5, v4, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    move-object v5, v4

    .line 123
    check-cast v5, Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v5, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_8

    .line 134
    .line 135
    :try_start_0
    invoke-static {p1, v1, v5}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    move v3, v2

    .line 139
    goto :goto_1

    .line 140
    :cond_6
    if-eqz v4, :cond_8

    .line 141
    .line 142
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 143
    .line 144
    if-nez v5, :cond_7

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-static {v5}, Lj4;->r(Ljava/lang/Class;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_8

    .line 155
    .line 156
    :cond_7
    add-int/lit8 v5, p0, 0x1

    .line 157
    .line 158
    invoke-static {v5, v4, p2, p3, p4}, Lj4;->D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    or-int/2addr v3, v4

    .line 163
    :catchall_0
    :cond_8
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_9
    return v3

    .line 167
    :cond_a
    instance-of v3, p1, Ljava/util/List;

    .line 168
    .line 169
    if-eqz v3, :cond_f

    .line 170
    .line 171
    check-cast p1, Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    move v3, v1

    .line 182
    :goto_2
    if-ge v1, v0, :cond_e

    .line 183
    .line 184
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    instance-of v5, v4, Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v5, :cond_b

    .line 191
    .line 192
    move-object v5, v4

    .line 193
    check-cast v5, Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v5, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_d

    .line 204
    .line 205
    :try_start_1
    invoke-interface {p1, v1, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    .line 207
    .line 208
    move v3, v2

    .line 209
    goto :goto_3

    .line 210
    :cond_b
    if-eqz v4, :cond_d

    .line 211
    .line 212
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 213
    .line 214
    if-nez v5, :cond_c

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-static {v5}, Lj4;->r(Ljava/lang/Class;)Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-nez v5, :cond_d

    .line 225
    .line 226
    :cond_c
    add-int/lit8 v5, p0, 0x1

    .line 227
    .line 228
    invoke-static {v5, v4, p2, p3, p4}, Lj4;->D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    or-int/2addr v3, v4

    .line 233
    :catchall_1
    :cond_d
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_e
    return v3

    .line 237
    :cond_f
    instance-of v3, p1, Ljava/util/Map;

    .line 238
    .line 239
    if-eqz v3, :cond_14

    .line 240
    .line 241
    check-cast p1, Ljava/util/Map;

    .line 242
    .line 243
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    move v0, v1

    .line 252
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_13

    .line 257
    .line 258
    const/16 v3, 0x3c

    .line 259
    .line 260
    if-ge v1, v3, :cond_13

    .line 261
    .line 262
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    instance-of v4, v3, Ljava/util/Map$Entry;

    .line 267
    .line 268
    if-eqz v4, :cond_12

    .line 269
    .line 270
    check-cast v3, Ljava/util/Map$Entry;

    .line 271
    .line 272
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    instance-of v5, v4, Ljava/lang/String;

    .line 277
    .line 278
    if-eqz v5, :cond_10

    .line 279
    .line 280
    move-object v5, v4

    .line 281
    check-cast v5, Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v5, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_12

    .line 292
    .line 293
    :try_start_2
    invoke-interface {v3, v5}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 294
    .line 295
    .line 296
    move v0, v2

    .line 297
    goto :goto_5

    .line 298
    :cond_10
    if-eqz v4, :cond_12

    .line 299
    .line 300
    instance-of v3, v4, Ljava/lang/CharSequence;

    .line 301
    .line 302
    if-nez v3, :cond_11

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-static {v3}, Lj4;->r(Ljava/lang/Class;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-nez v3, :cond_12

    .line 313
    .line 314
    :cond_11
    add-int/lit8 v3, p0, 0x1

    .line 315
    .line 316
    invoke-static {v3, v4, p2, p3, p4}, Lj4;->D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    or-int/2addr v0, v3

    .line 321
    :catchall_2
    :cond_12
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_13
    return v0

    .line 325
    :cond_14
    instance-of v3, p1, Ljava/lang/CharSequence;

    .line 326
    .line 327
    if-nez v3, :cond_21

    .line 328
    .line 329
    invoke-static {v0}, Lj4;->r(Ljava/lang/Class;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_15

    .line 334
    .line 335
    goto/16 :goto_d

    .line 336
    .line 337
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    const-string v4, "android."

    .line 342
    .line 343
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-eqz v3, :cond_16

    .line 348
    .line 349
    goto/16 :goto_d

    .line 350
    .line 351
    :cond_16
    move v3, v1

    .line 352
    move v4, v3

    .line 353
    :goto_6
    if-eqz v0, :cond_20

    .line 354
    .line 355
    const-class v5, Ljava/lang/Object;

    .line 356
    .line 357
    if-eq v0, v5, :cond_20

    .line 358
    .line 359
    const/16 v5, 0x38

    .line 360
    .line 361
    if-ge v3, v5, :cond_20

    .line 362
    .line 363
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 364
    .line 365
    .line 366
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 367
    goto :goto_7

    .line 368
    :catchall_3
    const/4 v6, 0x0

    .line 369
    :goto_7
    if-eqz v6, :cond_1f

    .line 370
    .line 371
    move v7, v1

    .line 372
    :goto_8
    array-length v8, v6

    .line 373
    if-ge v7, v8, :cond_1f

    .line 374
    .line 375
    if-ge v3, v5, :cond_1f

    .line 376
    .line 377
    aget-object v8, v6, v7

    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    if-eqz v9, :cond_17

    .line 388
    .line 389
    goto/16 :goto_c

    .line 390
    .line 391
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 392
    .line 393
    :try_start_4
    invoke-virtual {v8, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    instance-of v10, v9, Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v10, :cond_18

    .line 403
    .line 404
    move-object v10, v9

    .line 405
    check-cast v10, Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v10, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-nez v9, :cond_1e

    .line 416
    .line 417
    invoke-virtual {v8, p1, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    move v4, v2

    .line 421
    goto :goto_c

    .line 422
    :cond_18
    instance-of v8, v9, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    if-eqz v8, :cond_1a

    .line 425
    .line 426
    check-cast v9, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    invoke-static {v8, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v10

    .line 444
    if-eqz v10, :cond_19

    .line 445
    .line 446
    :goto_9
    move v8, v1

    .line 447
    goto :goto_b

    .line 448
    :cond_19
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    :goto_a
    move v8, v2

    .line 455
    :goto_b
    or-int/2addr v4, v8

    .line 456
    goto :goto_c

    .line 457
    :cond_1a
    instance-of v8, v9, Ljava/lang/StringBuffer;

    .line 458
    .line 459
    if-eqz v8, :cond_1c

    .line 460
    .line 461
    check-cast v9, Ljava/lang/StringBuffer;

    .line 462
    .line 463
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    invoke-static {v8, p2}, Lj4;->E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v10

    .line 479
    if-eqz v10, :cond_1b

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_1b
    invoke-virtual {v9, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v9, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 486
    .line 487
    .line 488
    goto :goto_a

    .line 489
    :cond_1c
    if-eqz v9, :cond_1e

    .line 490
    .line 491
    instance-of v8, v9, Ljava/lang/CharSequence;

    .line 492
    .line 493
    if-nez v8, :cond_1d

    .line 494
    .line 495
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    invoke-static {v8}, Lj4;->r(Ljava/lang/Class;)Z

    .line 500
    .line 501
    .line 502
    move-result v8

    .line 503
    if-nez v8, :cond_1e

    .line 504
    .line 505
    :cond_1d
    add-int/lit8 v8, p0, 0x1

    .line 506
    .line 507
    invoke-static {v8, v9, p2, p3, p4}, Lj4;->D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z

    .line 508
    .line 509
    .line 510
    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 511
    goto :goto_b

    .line 512
    :catchall_4
    :cond_1e
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 513
    .line 514
    goto/16 :goto_8

    .line 515
    .line 516
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    goto/16 :goto_6

    .line 521
    .line 522
    :cond_20
    return v4

    .line 523
    :cond_21
    :goto_d
    return v1
.end method

.method public static E(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_4

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-lez v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move p1, v1

    .line 42
    :goto_1
    const/16 v2, 0x8

    .line 43
    .line 44
    if-ge p1, v2, :cond_5

    .line 45
    .line 46
    invoke-static {p0}, Lj4;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move v3, v1

    .line 58
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ge v3, v4, :cond_4

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/CharSequence;

    .line 69
    .line 70
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    :goto_3
    return-object p0

    .line 81
    :cond_6
    :goto_4
    return-object v0
.end method

.method public static a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_1
    if-nez p1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/16 v0, 0x20

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 p2, 0x3d

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const/16 v0, 0x50

    .line 55
    .line 56
    if-gt p2, v0, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_2
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    filled-new-array {v2}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v2, p0, v0, v1, v3}, Lj4;->f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    move v1, v2

    .line 20
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3}, Lj4;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-gtz v4, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    if-eqz p0, :cond_1

    .line 44
    .line 45
    if-gt v4, v1, :cond_1

    .line 46
    .line 47
    if-ne v4, v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ge v5, v6, :cond_2

    .line 58
    .line 59
    :cond_1
    move-object p0, v3

    .line 60
    move v1, v4

    .line 61
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object p0
.end method

.method public static c(J)V
    .locals 4

    .line 1
    sget-object v0, Lj4;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Long;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    cmp-long v2, v2, p0

    .line 36
    .line 37
    if-gez v2, :cond_0

    .line 38
    .line 39
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const/16 p1, 0x20

    .line 48
    .line 49
    if-le p0, p1, :cond_3

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public static declared-synchronized d(Lg4;)V
    .locals 2

    .line 1
    const-class v0, Lj4;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lj4;->e:Lg4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eq v1, p0, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :try_start_1
    sput-object p0, Lj4;->e:Lg4;

    .line 16
    .line 17
    sget-object v1, Lj4;->g:Lc2;

    .line 18
    .line 19
    sput-object p0, Lj4;->g:Lc2;

    .line 20
    .line 21
    sget-object p0, Lj4;->f:Landroid/os/Handler;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_1
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw p0
.end method

.method public static e(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Li4;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, v2, Li4;->c:Landroid/widget/EditText;

    .line 18
    .line 19
    new-instance v1, Lf4;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, Lf4;-><init>(Landroid/widget/EditText;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public static f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V
    .locals 9

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-gt p0, v0, :cond_d

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    if-ge v0, v1, :cond_d

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget v1, p4, v0

    .line 16
    .line 17
    const/16 v2, 0x78

    .line 18
    .line 19
    if-le v1, v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_1
    aget v1, p4, v0

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    add-int/2addr v1, v2

    .line 35
    aput v1, p4, v0

    .line 36
    .line 37
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-string p1, "[ELARIS_FAV:"

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :cond_3
    :goto_0
    if-eqz v0, :cond_d

    .line 61
    .line 62
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_d

    .line 67
    .line 68
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/16 v4, 0x1e

    .line 81
    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    :goto_1
    if-ge v0, v1, :cond_d

    .line 93
    .line 94
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    add-int/lit8 v4, p0, 0x1

    .line 99
    .line 100
    invoke-static {v4, v3, p2, p3, p4}, Lj4;->f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    instance-of v3, p1, Ljava/lang/Iterable;

    .line 107
    .line 108
    if-eqz v3, :cond_6

    .line 109
    .line 110
    check-cast p1, Ljava/lang/Iterable;

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_d

    .line 121
    .line 122
    if-ge v0, v4, :cond_d

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    add-int/lit8 v3, p0, 0x1

    .line 129
    .line 130
    invoke-static {v3, v1, p2, p3, p4}, Lj4;->f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v0, v0, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const-string v4, "java."

    .line 141
    .line 142
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_d

    .line 147
    .line 148
    const-string v4, "android."

    .line 149
    .line 150
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_7
    move v3, v0

    .line 158
    :goto_3
    if-eqz v1, :cond_d

    .line 159
    .line 160
    const-class v4, Ljava/lang/Object;

    .line 161
    .line 162
    if-eq v1, v4, :cond_d

    .line 163
    .line 164
    const/16 v4, 0x24

    .line 165
    .line 166
    if-ge v3, v4, :cond_d

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    move v6, v0

    .line 173
    :goto_4
    array-length v7, v5

    .line 174
    if-ge v6, v7, :cond_c

    .line 175
    .line 176
    if-ge v3, v4, :cond_c

    .line 177
    .line 178
    aget-object v7, v5, v6

    .line 179
    .line 180
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_8

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 192
    .line 193
    :try_start_0
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    if-nez v7, :cond_9

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_9
    instance-of v8, v7, Ljava/lang/CharSequence;

    .line 204
    .line 205
    if-nez v8, :cond_a

    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-static {v8}, Lj4;->r(Ljava/lang/Class;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-nez v8, :cond_b

    .line 216
    .line 217
    :cond_a
    add-int/lit8 v8, p0, 0x1

    .line 218
    .line 219
    invoke-static {v8, v7, p2, p3, p4}, Lj4;->f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    :catchall_0
    :cond_b
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    goto :goto_3

    .line 230
    :cond_d
    :goto_6
    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/CharSequence;

    .line 23
    .line 24
    const-string v3, ""

    .line 25
    .line 26
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move p1, v0

    .line 34
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ge p1, v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Character;->isISOControl(C)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    const v2, 0xfffc

    .line 63
    .line 64
    .line 65
    if-eq v1, v2, :cond_2

    .line 66
    .line 67
    const v2, 0xfeff

    .line 68
    .line 69
    .line 70
    if-eq v1, v2, :cond_2

    .line 71
    .line 72
    const/16 v2, 0x200b

    .line 73
    .line 74
    if-lt v1, v2, :cond_4

    .line 75
    .line 76
    const/16 v2, 0x200f

    .line 77
    .line 78
    if-gt v1, v2, :cond_4

    .line 79
    .line 80
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 p0, 0x1

    .line 84
    return p0

    .line 85
    :cond_4
    :goto_2
    return v0
.end method

.method public static h(Ljava/util/ArrayList;I)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    move v1, v2

    .line 22
    :goto_0
    if-ge v1, p1, :cond_5

    .line 23
    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    const/16 v3, 0x2c

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    const-string v3, "null"

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/16 v5, 0x2e

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ltz v5, :cond_2

    .line 58
    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    :cond_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Lj4;->w(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    const-string v4, ":token"

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    filled-new-array {v2}, [I

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    const-string v6, ""

    .line 88
    .line 89
    invoke-static {v3, v2, v4, v5, v6}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    const-string v3, ":reply"

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-le v1, p1, :cond_6

    .line 108
    .line 109
    const-string v1, ",+"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    sub-int/2addr p0, p1

    .line 119
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :cond_6
    const/16 p0, 0x5d

    .line 123
    .line 124
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public static i(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_3

    .line 21
    .line 22
    const-string v2, "[ELARIS_FAV:"

    .line 23
    .line 24
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gez v1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v1, 0xc

    .line 32
    .line 33
    const-string v3, "]"

    .line 34
    .line 35
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-gez v3, :cond_2

    .line 40
    .line 41
    :goto_1
    move v1, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    add-int/lit8 v2, v3, 0x1

    .line 44
    .line 45
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "emoId"

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Lj4;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "path"

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Lj4;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "resID"

    .line 28
    .line 29
    invoke-static {v0, p0, v1}, Lj4;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "md5"

    .line 33
    .line 34
    invoke-static {v0, p0, v1}, Lj4;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "epId"

    .line 38
    .line 39
    invoke-static {v0, p0, v1}, Lj4;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/16 v1, 0x104

    .line 51
    .line 52
    if-le v0, v1, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :cond_0
    return-object p0
.end method

.method public static k(Landroid/view/View;)Landroid/widget/EditText;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-object v1, v0

    .line 8
    :goto_0
    if-nez v1, :cond_0

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "input"

    .line 23
    .line 24
    const-string v4, "id"

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v2, v3, v4, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {v1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of v2, p0, Landroid/widget/EditText;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    check-cast v2, Landroid/widget/EditText;

    .line 47
    .line 48
    invoke-static {v2}, Lj4;->s(Landroid/widget/EditText;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    check-cast p0, Landroid/widget/EditText;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    .line 56
    move-object v0, p0

    .line 57
    :catchall_1
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_4
    const/4 p0, 0x0

    .line 61
    invoke-static {v1, p0}, Lj4;->l(Landroid/view/View;I)Landroid/widget/EditText;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_5
    invoke-static {v1, p0}, Lj4;->m(Landroid/view/View;I)Landroid/widget/EditText;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static l(Landroid/view/View;I)Landroid/widget/EditText;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    :try_start_0
    instance-of v1, p0, Landroid/widget/EditText;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    check-cast v1, Landroid/widget/EditText;

    .line 21
    .line 22
    invoke-static {v1}, Lj4;->s(Landroid/widget/EditText;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast p0, Landroid/widget/EditText;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    check-cast p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/16 v2, 0x50

    .line 42
    .line 43
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 v1, v1, -0x1

    .line 48
    .line 49
    :goto_0
    if-ltz v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    add-int/lit8 v3, p1, 0x1

    .line 56
    .line 57
    invoke-static {v2, v3}, Lj4;->l(Landroid/view/View;I)Landroid/widget/EditText;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    return-object v2

    .line 64
    :cond_2
    add-int/lit8 v1, v1, -0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static m(Landroid/view/View;I)Landroid/widget/EditText;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    instance-of v1, p0, Landroid/widget/EditText;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    check-cast v1, Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-static {v1}, Lj4;->s(Landroid/widget/EditText;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    check-cast p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x50

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/lit8 v1, v1, -0x1

    .line 40
    .line 41
    :goto_0
    if-ltz v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    add-int/lit8 v3, p1, 0x1

    .line 48
    .line 49
    invoke-static {v2, v3}, Lj4;->m(Landroid/view/View;I)Landroid/widget/EditText;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_3
    if-nez v0, :cond_4

    .line 64
    .line 65
    move-object v0, v2

    .line 66
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_18

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p1, v1, :cond_18

    .line 6
    .line 7
    aget v1, p3, v0

    .line 8
    .line 9
    const/16 v2, 0xb4

    .line 10
    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_1
    aget v1, p3, v0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    add-int/2addr v1, v2

    .line 27
    aput v1, p3, v0

    .line 28
    .line 29
    if-nez p4, :cond_2

    .line 30
    .line 31
    const-string p4, ""

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 35
    .line 36
    invoke-virtual {p4, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    :goto_0
    const-string v1, "reply"

    .line 41
    .line 42
    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const-string v4, "quote"

    .line 47
    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p4, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    :cond_3
    invoke-static {p0}, Lj4;->q(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_4
    instance-of v3, p0, Ljava/util/Map;

    .line 65
    .line 66
    if-eqz v3, :cond_9

    .line 67
    .line 68
    check-cast p0, Ljava/util/Map;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    if-eqz p4, :cond_5

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_5
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    move p4, v0

    .line 87
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_18

    .line 92
    .line 93
    const/16 v3, 0x3c

    .line 94
    .line 95
    if-ge p4, v3, :cond_18

    .line 96
    .line 97
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    instance-of v5, v3, Ljava/util/Map$Entry;

    .line 102
    .line 103
    if-eqz v5, :cond_8

    .line 104
    .line 105
    check-cast v3, Ljava/util/Map$Entry;

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_6

    .line 130
    .line 131
    invoke-virtual {v5, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_7

    .line 136
    .line 137
    :cond_6
    invoke-static {v3}, Lj4;->q(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_7
    if-eqz v3, :cond_8

    .line 146
    .line 147
    add-int/lit8 v6, p1, 0x1

    .line 148
    .line 149
    invoke-static {v3, v6, p2, p3, v5}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_8

    .line 154
    .line 155
    goto/16 :goto_6

    .line 156
    .line 157
    :cond_8
    add-int/lit8 p4, p4, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_9
    instance-of v3, p0, Ljava/lang/CharSequence;

    .line 161
    .line 162
    if-eqz v3, :cond_c

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 169
    .line 170
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_a

    .line 179
    .line 180
    invoke-virtual {p4, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_b

    .line 185
    .line 186
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-lez p1, :cond_b

    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_b
    const-string p1, "replymsg"

    .line 195
    .line 196
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_15

    .line 201
    .line 202
    const-string p1, "replyinfo"

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_15

    .line 209
    .line 210
    const-string p1, "quotemsg"

    .line 211
    .line 212
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-nez p1, :cond_15

    .line 217
    .line 218
    const-string p1, "quoteinfo"

    .line 219
    .line 220
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_18

    .line 225
    .line 226
    goto/16 :goto_6

    .line 227
    .line 228
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    const/16 v6, 0x28

    .line 237
    .line 238
    if-eqz v5, :cond_e

    .line 239
    .line 240
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    move v3, v0

    .line 249
    :goto_2
    if-ge v3, v1, :cond_18

    .line 250
    .line 251
    invoke-static {p0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    add-int/lit8 v5, p1, 0x1

    .line 256
    .line 257
    invoke-static {v4, v5, p2, p3, p4}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    if-eqz v4, :cond_d

    .line 262
    .line 263
    goto/16 :goto_6

    .line 264
    .line 265
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_e
    instance-of v5, p0, Ljava/lang/Iterable;

    .line 269
    .line 270
    if-eqz v5, :cond_10

    .line 271
    .line 272
    check-cast p0, Ljava/lang/Iterable;

    .line 273
    .line 274
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    move v1, v0

    .line 279
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_18

    .line 284
    .line 285
    if-ge v1, v6, :cond_18

    .line 286
    .line 287
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    add-int/lit8 v4, p1, 0x1

    .line 292
    .line 293
    invoke-static {v3, v4, p2, p3, p4}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-eqz v3, :cond_f

    .line 298
    .line 299
    goto/16 :goto_6

    .line 300
    .line 301
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p4

    .line 308
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 309
    .line 310
    invoke-virtual {p4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p4

    .line 314
    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-nez v1, :cond_11

    .line 319
    .line 320
    invoke-virtual {p4, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_12

    .line 325
    .line 326
    :cond_11
    invoke-static {p0}, Lj4;->q(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_12

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_12
    invoke-static {v3}, Lj4;->r(Ljava/lang/Class;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_18

    .line 338
    .line 339
    const-string v1, "java."

    .line 340
    .line 341
    invoke-virtual {p4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_18

    .line 346
    .line 347
    const-string v1, "android."

    .line 348
    .line 349
    invoke-virtual {p4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result p4

    .line 353
    if-eqz p4, :cond_13

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_13
    move p4, v0

    .line 357
    :goto_4
    if-eqz v3, :cond_18

    .line 358
    .line 359
    const-class v1, Ljava/lang/Object;

    .line 360
    .line 361
    if-eq v3, v1, :cond_18

    .line 362
    .line 363
    const/16 v1, 0x2e

    .line 364
    .line 365
    if-ge p4, v1, :cond_18

    .line 366
    .line 367
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    move v5, v0

    .line 372
    :goto_5
    array-length v6, v4

    .line 373
    if-ge v5, v6, :cond_17

    .line 374
    .line 375
    if-ge p4, v1, :cond_17

    .line 376
    .line 377
    aget-object v6, v4, v5

    .line 378
    .line 379
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    if-eqz v7, :cond_14

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_14
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    add-int/lit8 p4, p4, 0x1

    .line 395
    .line 396
    :try_start_0
    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    if-eqz v6, :cond_16

    .line 404
    .line 405
    add-int/lit8 v8, p1, 0x1

    .line 406
    .line 407
    invoke-static {v6, v8, p2, p3, v7}, Lj4;->n(Ljava/lang/Object;ILjava/util/Set;[ILjava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    if-eqz v6, :cond_16

    .line 412
    .line 413
    :cond_15
    :goto_6
    return v2

    .line 414
    :catchall_0
    :cond_16
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_17
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    goto :goto_4

    .line 422
    :cond_18
    :goto_8
    return v0
.end method

.method public static o(Ljava/lang/ClassLoader;)I
    .locals 10

    .line 1
    const-string v0, "target.kernel.msg_service_classes"

    .line 2
    .line 3
    sget-object v1, Lj4;->a:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1, p0}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    move v3, v2

    .line 12
    :goto_0
    array-length v4, v0

    .line 13
    if-ge v2, v4, :cond_7

    .line 14
    .line 15
    :try_start_0
    aget-object v4, v0, v2

    .line 16
    .line 17
    invoke-static {p0, v4}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    move v5, v1

    .line 30
    :goto_1
    array-length v6, v4

    .line 31
    if-ge v5, v6, :cond_6

    .line 32
    .line 33
    aget-object v6, v4, v5

    .line 34
    .line 35
    const-class v7, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v6, v7}, Lv4;->m(Ljava/lang/reflect/Method;Ljava/lang/Class;)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-gez v7, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string v8, "sendMsg"

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne v8, v9, :cond_5

    .line 75
    .line 76
    invoke-static {v6}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    sget-object v9, Lj4;->b:Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {v9, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-nez v9, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    const/4 v9, 0x1

    .line 90
    invoke-virtual {v6, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 91
    .line 92
    .line 93
    new-instance v9, Le4;

    .line 94
    .line 95
    invoke-direct {v9, v7}, Le4;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v6, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v7, "hooked favorite emoticon batch sendMsg: "

    .line 109
    .line 110
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_0
    move-exception v4

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v6, "favorite emoticon batch send hook skip: "

    .line 132
    .line 133
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {v4}, Lj4;->u(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_7
    return v3
.end method

.method public static declared-synchronized p(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    const-class v0, Lj4;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_e

    .line 5
    .line 6
    :try_start_0
    sget-boolean v1, Lj4;->h:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-boolean v1, Lj4;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_a

    .line 15
    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    :try_start_1
    invoke-static {p0}, Ls4;->v(Ljava/lang/ClassLoader;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "com.tencent.mobileqq.emoticonview.FavoriteEmotionAdapter"

    .line 23
    .line 24
    invoke-static {p0, v1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const-string p0, "favorite emoticon batch target not found: com.tencent.mobileqq.emoticonview.FavoriteEmotionAdapter"

    .line 31
    .line 32
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :catchall_1
    move-exception p0

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    move v3, v2

    .line 46
    :goto_0
    array-length v4, v1

    .line 47
    const/4 v5, 0x1

    .line 48
    if-ge v3, v4, :cond_5

    .line 49
    .line 50
    aget-object v4, v1, v3

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const-string v6, "onClick"

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    if-eq v6, v7, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    array-length v7, v6

    .line 81
    if-ne v7, v5, :cond_4

    .line 82
    .line 83
    const-class v7, Landroid/view/View;

    .line 84
    .line 85
    aget-object v6, v6, v2

    .line 86
    .line 87
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_4

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    const/4 v4, 0x0

    .line 101
    :goto_2
    invoke-static {p0}, Lj4;->o(Ljava/lang/ClassLoader;)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-lez p0, :cond_6

    .line 106
    .line 107
    sput-boolean v5, Lj4;->i:Z

    .line 108
    .line 109
    :cond_6
    if-nez v4, :cond_7

    .line 110
    .line 111
    const-string v1, "favorite emoticon batch send method not found"

    .line 112
    .line 113
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_3
    move v1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_7
    invoke-static {v4}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v3, Lj4;->b:Ljava/util/Set;

    .line 123
    .line 124
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_8

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Ld4;

    .line 135
    .line 136
    const/16 v6, 0x48

    .line 137
    .line 138
    invoke-direct {v3, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 142
    .line 143
    .line 144
    const-string v3, "hooked favorite emoticon batch click: "

    .line 145
    .line 146
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    move v1, v5

    .line 154
    :goto_4
    if-lez v1, :cond_9

    .line 155
    .line 156
    sput-boolean v5, Lj4;->h:Z

    .line 157
    .line 158
    :cond_9
    add-int/2addr v1, p0

    .line 159
    if-gtz v1, :cond_b

    .line 160
    .line 161
    sget-boolean v3, Lj4;->h:Z

    .line 162
    .line 163
    if-nez v3, :cond_b

    .line 164
    .line 165
    sget-boolean v3, Lj4;->i:Z

    .line 166
    .line 167
    if-eqz v3, :cond_a

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_a
    const-string p0, "favorite emoticon batch hook target not found"

    .line 171
    .line 172
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_b
    :goto_5
    new-instance v3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v6, "favorite emoticon batch hooks installed count="

    .line 182
    .line 183
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v1, " click="

    .line 190
    .line 191
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    if-nez v4, :cond_c

    .line 195
    .line 196
    const-string v1, "null"

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_c
    invoke-static {v4}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    :goto_6
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v1, " send="

    .line 207
    .line 208
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string p0, " active="

    .line 215
    .line 216
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    sget-boolean p0, Lj4;->h:Z

    .line 220
    .line 221
    if-eqz p0, :cond_d

    .line 222
    .line 223
    sget-boolean p0, Lj4;->i:Z

    .line 224
    .line 225
    if-eqz p0, :cond_d

    .line 226
    .line 227
    move v2, v5

    .line 228
    :cond_d
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :goto_7
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v2, "favorite emoticon batch install failed: "

    .line 245
    .line 246
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 257
    .line 258
    .line 259
    :goto_8
    monitor-exit v0

    .line 260
    return-void

    .line 261
    :goto_9
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 262
    throw p0

    .line 263
    :cond_e
    :goto_a
    monitor-exit v0

    .line 264
    return-void
.end method

.method public static q(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    check-cast p0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long p0, v3, v5

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    return v0

    .line 35
    :cond_3
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-lez p0, :cond_4

    .line 52
    .line 53
    return v2

    .line 54
    :cond_4
    return v0

    .line 55
    :cond_5
    instance-of v1, p0, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    check-cast p0, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    xor-int/2addr p0, v2

    .line 66
    return p0

    .line 67
    :cond_6
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 68
    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    check-cast p0, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    return p0

    .line 82
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-lez p0, :cond_8

    .line 97
    .line 98
    return v2

    .line 99
    :cond_8
    return v0

    .line 100
    :cond_9
    return v2
.end method

.method public static r(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-class v0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-class v0, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eq v0, p0, :cond_2

    .line 25
    .line 26
    const-class v0, Ljava/lang/Character;

    .line 27
    .line 28
    if-ne v0, p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public static s(Landroid/widget/EditText;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :catchall_0
    :cond_1
    return v0
.end method

.method public static t(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    sget-object v2, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Li4;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v0
.end method

.method public static u(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "debug_log"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static v()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static w(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    filled-new-array {v2}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v2, p0, v0, v1, v3}, Lj4;->f(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    xor-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    return p0
.end method

.method public static x(Landroid/view/View;Ljava/lang/String;)Z
    .locals 12

    .line 1
    const-string v0, "favorite_emoticon_batch_send"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_f

    .line 9
    .line 10
    sget-object v0, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    invoke-static {p0}, Lj4;->k(Landroid/view/View;)Landroid/widget/EditText;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    :try_start_0
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-object v0, p0

    .line 35
    :goto_0
    if-eqz v0, :cond_f

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lj4;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_f

    .line 58
    .line 59
    invoke-static {v0, v8}, Lj4;->g(Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_3
    invoke-static {v8}, Lj4;->t(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v9, 0x2

    .line 84
    const/4 v10, 0x1

    .line 85
    if-nez v3, :cond_d

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const/16 v4, 0x10

    .line 100
    .line 101
    const-string v6, " source="

    .line 102
    .line 103
    if-le v3, v4, :cond_6

    .line 104
    .line 105
    const-string p0, "\u6df7\u5408\u53d1\u9001\u6536\u85cf\u8868\u60c5\u6570\u91cf\u8fc7\u591a\uff0c\u5df2\u62e6\u622a"

    .line 106
    .line 107
    invoke-static {v5, p0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance p0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v0, "blocked before official click reason=too_many_tokens count="

    .line 113
    .line 114
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    move p0, v9

    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :cond_6
    :try_start_1
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 141
    .line 142
    .line 143
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    :catchall_1
    if-nez p0, :cond_7

    .line 145
    .line 146
    const-string p0, "\u8f93\u5165\u6846\u5185\u5bb9\u672a\u5c31\u7eea\uff0c\u5df2\u62e6\u622a\u6df7\u5408\u53d1\u9001"

    .line 147
    .line 148
    invoke-static {v5, p0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance p0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v0, "blocked before official click reason=editable_missing input="

    .line 154
    .line 155
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Ls4;->p(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_7
    if-nez v0, :cond_8

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :cond_8
    invoke-static {v0, v8}, Ls4;->t(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-static {v7}, Ls4;->m(Ljava/util/ArrayList;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_d

    .line 198
    .line 199
    invoke-static {v7}, Ls4;->h(Ljava/util/ArrayList;)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-gtz v3, :cond_9

    .line 204
    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_9
    invoke-static {v5}, Ls4;->s(Landroid/widget/EditText;)Ly;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-nez v3, :cond_a

    .line 212
    .line 213
    invoke-static {v5, p0, v0}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v0, "\u672a\u627e\u5230QQ\u5b98\u65b9\u56fe\u6587\u8f93\u5165\u94fe\u8def\uff0c\u5df2\u62e6\u622a"

    .line 217
    .line 218
    invoke-static {v5, v0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v0, "blocked before_official_click reason=official_span_missing source="

    .line 222
    .line 223
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/4 v3, 0x0

    .line 228
    const/4 v4, -0x1

    .line 229
    move-object v6, p0

    .line 230
    invoke-static/range {v2 .. v7}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_a
    move-object v11, v6

    .line 235
    move-object v6, p0

    .line 236
    move-object p0, v11

    .line 237
    invoke-static {v0, v7, v2, v3}, Ls4;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ly;)Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    invoke-static {v7}, Ls4;->h(Ljava/util/ArrayList;)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eq v3, v4, :cond_b

    .line 250
    .line 251
    invoke-static {v5, v6, v0}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-string v0, "\u90e8\u5206\u6536\u85cf\u8868\u60c5\u4e0d\u652f\u6301\u6df7\u5408\u53d1\u9001\uff0c\u5df2\u62e6\u622a"

    .line 255
    .line 256
    invoke-static {v5, v0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v3, "blocked before_official_click reason=unsupported_favorite replacement="

    .line 262
    .line 263
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v2, "/"

    .line 274
    .line 275
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-static {v7}, Ls4;->h(Ljava/util/ArrayList;)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const/4 v3, 0x0

    .line 296
    const/4 v4, -0x1

    .line 297
    invoke-static/range {v2 .. v7}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :cond_b
    invoke-static {v5, v6, v0, v2}, Ls4;->a(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    if-nez p0, :cond_c

    .line 307
    .line 308
    invoke-static {v5, v6, v0}, Ls4;->x(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    const-string p0, "\u8f93\u5165\u6846\u5b98\u65b9\u56fe\u6587\u5185\u5bb9\u5199\u5165\u5931\u8d25\uff0c\u5df2\u62e6\u622a"

    .line 312
    .line 313
    invoke-static {v5, p0}, Ls4;->z(Landroid/widget/EditText;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-string p0, "blocked before_official_click reason=span_apply_failed source="

    .line 317
    .line 318
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/4 v3, 0x0

    .line 323
    const/4 v4, -0x1

    .line 324
    invoke-static/range {v2 .. v7}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_c
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    invoke-static {v5, p0, v0, v10}, Ls4;->b(Landroid/widget/EditText;Ljava/lang/String;IZ)Lf2;

    .line 338
    .line 339
    .line 340
    const-string p0, "converted before_official_click source="

    .line 341
    .line 342
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/4 v3, 0x0

    .line 347
    const/4 v4, -0x1

    .line 348
    invoke-static/range {v2 .. v7}, Ls4;->q(Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILandroid/widget/EditText;Landroid/text/Editable;Ljava/util/ArrayList;)V

    .line 349
    .line 350
    .line 351
    move p0, v10

    .line 352
    goto :goto_3

    .line 353
    :cond_d
    :goto_2
    move p0, v1

    .line 354
    :goto_3
    if-ne p0, v10, :cond_e

    .line 355
    .line 356
    invoke-static {v8}, Lj4;->y(Ljava/util/ArrayList;)V

    .line 357
    .line 358
    .line 359
    new-instance p0, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    const-string v0, "favorite emoticon mixed prepared before official click tokens="

    .line 362
    .line 363
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v0, " reason="

    .line 374
    .line 375
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-static {p0}, Lj4;->u(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return v1

    .line 389
    :cond_e
    if-ne p0, v9, :cond_f

    .line 390
    .line 391
    move v1, v10

    .line 392
    :cond_f
    :goto_4
    return v1
.end method

.method public static y(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public static z(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;)Z
    .locals 12

    .line 1
    iget-object v1, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz v1, :cond_d

    .line 5
    .line 6
    if-ltz p1, :cond_d

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    if-ge p1, v1, :cond_d

    .line 10
    .line 11
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    const-string v1, "debug_log"

    .line 20
    .line 21
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-static {p2, v1}, Lj4;->h(Ljava/util/ArrayList;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v1, ""

    .line 34
    .line 35
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    move v4, v2

    .line 41
    move v5, v4

    .line 42
    move v6, v5

    .line 43
    move v7, v6

    .line 44
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-ge v4, v8, :cond_5

    .line 49
    .line 50
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    if-nez v8, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {v8}, Lj4;->w(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    invoke-static {}, Lj4;->v()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    filled-new-array {v2}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-static {v2, v8, p3, v9, v10}, Lj4;->D(ILjava/lang/Object;Ljava/util/ArrayList;Ljava/util/Set;[I)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_3

    .line 76
    .line 77
    invoke-static {v8}, Lj4;->w(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    add-int/lit8 v7, v7, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    add-int/lit8 v5, v5, 0x1

    .line 98
    .line 99
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    move v0, v2

    .line 103
    move v4, v0

    .line 104
    :goto_3
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-ge v0, v8, :cond_a

    .line 109
    .line 110
    move-object/from16 v8, p4

    .line 111
    .line 112
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, Li4;

    .line 117
    .line 118
    if-nez v9, :cond_6

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    iget-object v9, v9, Li4;->f:Lh4;

    .line 123
    .line 124
    :goto_4
    if-eqz v9, :cond_9

    .line 125
    .line 126
    iget v10, v9, Lh4;->a:I

    .line 127
    .line 128
    if-ltz v10, :cond_9

    .line 129
    .line 130
    iget-object v9, v9, Lh4;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v9, [Ljava/lang/Object;

    .line 133
    .line 134
    array-length v11, v9

    .line 135
    if-ge v10, v11, :cond_9

    .line 136
    .line 137
    aget-object v9, v9, v10

    .line 138
    .line 139
    instance-of v10, v9, Ljava/util/ArrayList;

    .line 140
    .line 141
    if-nez v10, :cond_7

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_7
    check-cast v9, Ljava/util/ArrayList;

    .line 145
    .line 146
    move v10, v2

    .line 147
    :goto_5
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-ge v10, v11, :cond_9

    .line 152
    .line 153
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    if-nez v11, :cond_8

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_8
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    if-lez v4, :cond_d

    .line 172
    .line 173
    if-eqz p5, :cond_b

    .line 174
    .line 175
    if-gtz v5, :cond_b

    .line 176
    .line 177
    goto/16 :goto_9

    .line 178
    .line 179
    :cond_b
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 180
    .line 181
    aput-object v3, p0, p1

    .line 182
    .line 183
    const/4 p1, 0x1

    .line 184
    :try_start_0
    const-string v0, "pic_summary_enabled"

    .line 185
    .line 186
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_c

    .line 191
    .line 192
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->findContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {v3, p0, p1}, Li5;->C1(Ljava/util/ArrayList;Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    goto :goto_8

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    move-object p0, v0

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v2, "favorite emoticon batch pic summary failed: "

    .line 205
    .line 206
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-static {p0}, Lj4;->u(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_c
    :goto_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 220
    .line 221
    .line 222
    move-result-wide v8

    .line 223
    sget-object p0, Lj4;->d:Ljava/util/Map;

    .line 224
    .line 225
    monitor-enter p0

    .line 226
    :try_start_1
    invoke-static {v8, v9}, Lj4;->c(J)V

    .line 227
    .line 228
    .line 229
    const-wide/16 v10, 0x2710

    .line 230
    .line 231
    add-long/2addr v8, v10

    .line 232
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 240
    sget-object p0, Lqa;->l:Ljava/lang/ThreadLocal;

    .line 241
    .line 242
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    new-instance p0, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v0, "favorite emoticon batch "

    .line 250
    .line 251
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v2, p6

    .line 255
    .line 256
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v0, " merged official send kept="

    .line 260
    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v0, " appended="

    .line 268
    .line 269
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v0, " cleanedTokenElements="

    .line 276
    .line 277
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v0, " droppedTokenElements="

    .line 284
    .line 285
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v0, " trigger="

    .line 292
    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v0, " merged="

    .line 300
    .line 301
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const/16 v0, 0x8

    .line 305
    .line 306
    invoke-static {v3, v0}, Lj4;->h(Ljava/util/ArrayList;I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    invoke-static {p0}, Lj4;->u(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return p1

    .line 321
    :catchall_1
    move-exception v0

    .line 322
    move-object p1, v0

    .line 323
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 324
    throw p1

    .line 325
    :cond_d
    :goto_9
    return v2
.end method
