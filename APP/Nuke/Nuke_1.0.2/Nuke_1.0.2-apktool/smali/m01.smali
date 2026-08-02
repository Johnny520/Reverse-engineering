.class public abstract Lm01;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lkj1;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lkj1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lkj1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm01;->a:Lkj1;

    .line 8
    .line 9
    new-instance v2, Low1;

    .line 10
    .line 11
    const-string v0, "boolean"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-direct {v2, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Low1;

    .line 19
    .line 20
    const-string v0, "byte"

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-direct {v3, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Low1;

    .line 28
    .line 29
    const-string v0, "char"

    .line 30
    .line 31
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-direct {v4, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, Low1;

    .line 37
    .line 38
    const-string v0, "short"

    .line 39
    .line 40
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-direct {v5, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Low1;

    .line 46
    .line 47
    const-string v0, "int"

    .line 48
    .line 49
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-direct {v6, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Low1;

    .line 55
    .line 56
    const-string v0, "long"

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-direct {v7, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Low1;

    .line 64
    .line 65
    const-string v0, "float"

    .line 66
    .line 67
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-direct {v8, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v9, Low1;

    .line 73
    .line 74
    const-string v0, "double"

    .line 75
    .line 76
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-direct {v9, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v10, Low1;

    .line 82
    .line 83
    const-string v0, "void"

    .line 84
    .line 85
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-direct {v10, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    filled-new-array/range {v2 .. v10}, [Low1;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Lm01;->b:Ljava/util/Map;

    .line 99
    .line 100
    return-void
.end method

.method public static a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lt6;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v0, v1, p1, p0}, Lt6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lm01;->a:Lkj1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lkj1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object v4, v1, Lkj1;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Ljava/util/WeakHashMap;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget-object v4, v1, Lkj1;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/ClassLoader;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_0
    move-object v4, v5

    .line 56
    :goto_0
    if-ne v4, p0, :cond_4

    .line 57
    .line 58
    iget-object v4, v1, Lkj1;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lm5;

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v4}, Lm5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_2
    :try_start_1
    invoke-virtual {v4, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Ljava/util/Map;

    .line 87
    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Lm5;

    .line 95
    .line 96
    if-nez v4, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {v4}, Lm5;->a()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    if-eqz v4, :cond_4

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_5

    .line 109
    .line 110
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 121
    .line 122
    .line 123
    :try_start_2
    iget-object v3, v1, Lkj1;->l:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Ljava/util/WeakHashMap;

    .line 126
    .line 127
    if-nez v3, :cond_7

    .line 128
    .line 129
    iget-object v4, v1, Lkj1;->j:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 132
    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    check-cast v4, Ljava/lang/ClassLoader;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception p0

    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_5
    move-object v4, v5

    .line 146
    :goto_2
    if-nez v4, :cond_6

    .line 147
    .line 148
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 149
    .line 150
    invoke-direct {v4, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iput-object v4, v1, Lkj1;->j:Ljava/lang/Object;

    .line 154
    .line 155
    iget-object v4, v1, Lkj1;->k:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ljava/util/HashMap;

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    if-eq v4, p0, :cond_7

    .line 164
    .line 165
    new-instance v3, Ljava/util/WeakHashMap;

    .line 166
    .line 167
    invoke-direct {v3}, Ljava/util/WeakHashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v6, v1, Lkj1;->k:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Ljava/util/HashMap;

    .line 173
    .line 174
    invoke-virtual {v3, v4, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v4, Ljava/util/HashMap;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, p0, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    iput-object v3, v1, Lkj1;->l:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v5, v1, Lkj1;->j:Ljava/lang/Object;

    .line 188
    .line 189
    new-instance v4, Ljava/util/HashMap;

    .line 190
    .line 191
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object v4, v1, Lkj1;->k:Ljava/lang/Object;

    .line 195
    .line 196
    :cond_7
    :goto_3
    if-eqz v3, :cond_9

    .line 197
    .line 198
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-nez v1, :cond_8

    .line 203
    .line 204
    new-instance v1, Ljava/util/HashMap;

    .line 205
    .line 206
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v3, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_8
    check-cast v1, Ljava/util/Map;

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    iget-object p0, v1, Lkj1;->k:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v1, p0

    .line 218
    check-cast v1, Ljava/util/HashMap;

    .line 219
    .line 220
    :goto_4
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Lm5;

    .line 225
    .line 226
    if-eqz p0, :cond_a

    .line 227
    .line 228
    invoke-virtual {p0}, Lm5;->a()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 232
    if-eqz v4, :cond_a

    .line 233
    .line 234
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_a
    :try_start_3
    invoke-virtual {v0}, Lt6;->a()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    new-instance p0, Lm5;

    .line 243
    .line 244
    invoke-direct {p0, v4}, Lm5;-><init>(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v1, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 248
    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 251
    .line 252
    .line 253
    :goto_5
    check-cast v4, Ljava/lang/Class;

    .line 254
    .line 255
    return-object v4

    .line 256
    :goto_6
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 257
    .line 258
    .line 259
    throw p0

    .line 260
    :goto_7
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 261
    .line 262
    .line 263
    throw p0
.end method
