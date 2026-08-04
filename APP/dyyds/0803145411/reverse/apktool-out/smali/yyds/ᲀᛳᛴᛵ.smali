.class public abstract Lyyds/ᲀᛳᛴᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

.field public static final ᛵᛸᛸᛷ:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lyyds/ᛲᛲᲇᲈ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᛲᲇᲈ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 8
    .line 9
    new-instance v2, Lkotlin/Pair;

    .line 10
    .line 11
    const-string v0, "boolean"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lkotlin/Pair;

    .line 19
    .line 20
    const-string v0, "byte"

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lkotlin/Pair;

    .line 28
    .line 29
    const-string v0, "char"

    .line 30
    .line 31
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-direct {v4, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, Lkotlin/Pair;

    .line 37
    .line 38
    const-string v0, "short"

    .line 39
    .line 40
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-direct {v5, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lkotlin/Pair;

    .line 46
    .line 47
    const-string v0, "int"

    .line 48
    .line 49
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Lkotlin/Pair;

    .line 55
    .line 56
    const-string v0, "long"

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-direct {v7, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lkotlin/Pair;

    .line 64
    .line 65
    const-string v0, "float"

    .line 66
    .line 67
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-direct {v8, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v9, Lkotlin/Pair;

    .line 73
    .line 74
    const-string v0, "double"

    .line 75
    .line 76
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-direct {v9, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v10, Lkotlin/Pair;

    .line 82
    .line 83
    const-string v0, "void"

    .line 84
    .line 85
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-direct {v10, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    filled-new-array/range {v2 .. v10}, [Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lyyds/ᲁᲈᛶᛴ;->ᛶᲈᛴᲈ([Lkotlin/Pair;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Lyyds/ᲀᛳᛴᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 99
    .line 100
    return-void
.end method

.method public static ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 6

    .line 1
    sget-object v0, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ljava/util/WeakHashMap;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-nez v3, :cond_2

    .line 20
    .line 21
    iget-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/ClassLoader;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto/16 :goto_9

    .line 36
    .line 37
    :cond_0
    move-object v3, v4

    .line 38
    :goto_0
    if-ne v3, p0, :cond_4

    .line 39
    .line 40
    iget-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lyyds/ᲇᛵᲀᲇ;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v3}, Lyyds/ᲇᛵᲀᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_2
    :try_start_1
    invoke-virtual {v3, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/util/Map;

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lyyds/ᲇᛵᲀᲇ;

    .line 77
    .line 78
    if-nez v3, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v3}, Lyyds/ᲇᛵᲀᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 100
    .line 101
    .line 102
    :try_start_2
    iget-object v2, v0, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Ljava/util/WeakHashMap;

    .line 105
    .line 106
    if-nez v2, :cond_7

    .line 107
    .line 108
    iget-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/ClassLoader;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catchall_1
    move-exception p0

    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :cond_5
    move-object v3, v4

    .line 125
    :goto_2
    if-nez v3, :cond_6

    .line 126
    .line 127
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 128
    .line 129
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v3, Ljava/util/HashMap;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    if-eq v3, p0, :cond_7

    .line 143
    .line 144
    new-instance v2, Ljava/util/WeakHashMap;

    .line 145
    .line 146
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 147
    .line 148
    .line 149
    iget-object v5, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, Ljava/util/HashMap;

    .line 152
    .line 153
    invoke-virtual {v2, v3, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    new-instance v3, Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, p0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    iput-object v2, v0, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v4, v0, Lyyds/ᛲᛲᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 167
    .line 168
    new-instance v3, Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v3, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 174
    .line 175
    :cond_7
    :goto_3
    if-eqz v2, :cond_9

    .line 176
    .line 177
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez v0, :cond_8

    .line 182
    .line 183
    new-instance v0, Ljava/util/HashMap;

    .line 184
    .line 185
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_8
    check-cast v0, Ljava/util/Map;

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    iget-object v0, v0, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ljava/util/HashMap;

    .line 197
    .line 198
    :goto_4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Lyyds/ᲇᛵᲀᲇ;

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    invoke-virtual {v2}, Lyyds/ᲇᛵᲀᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 210
    if-eqz v3, :cond_a

    .line 211
    .line 212
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_a
    const/4 v2, 0x0

    .line 217
    move-object v3, p1

    .line 218
    move v4, v2

    .line 219
    :goto_5
    :try_start_3
    const-string v5, "[]"

    .line 220
    .line 221
    invoke-static {v3, v5, v2}, Lyyds/ᛳᲀᲈᛷ;->ᲀᛲᛲᲇ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_b

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    add-int/lit8 v5, v5, -0x2

    .line 234
    .line 235
    invoke-virtual {v3, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    goto :goto_5

    .line 240
    :cond_b
    sget-object v5, Lyyds/ᲀᛳᛴᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 241
    .line 242
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Ljava/lang/Class;

    .line 247
    .line 248
    if-nez v5, :cond_c

    .line 249
    .line 250
    invoke-virtual {p0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    :cond_c
    move p0, v2

    .line 255
    move-object v3, v5

    .line 256
    :goto_6
    if-ge p0, v4, :cond_d

    .line 257
    .line 258
    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    add-int/lit8 p0, p0, 0x1

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_d
    new-instance p0, Lyyds/ᲇᛵᲀᲇ;

    .line 270
    .line 271
    invoke-direct {p0, v3}, Lyyds/ᲇᛵᲀᲇ;-><init>(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 275
    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 278
    .line 279
    .line 280
    :goto_7
    check-cast v3, Ljava/lang/Class;

    .line 281
    .line 282
    return-object v3

    .line 283
    :goto_8
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 284
    .line 285
    .line 286
    throw p0

    .line 287
    :goto_9
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 288
    .line 289
    .line 290
    throw p0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p0, v1}, Lyyds/ᲀᛳᛴᛵ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    new-instance v2, Lyyds/ᲈᛵᛵᛴ;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v1, v2

    .line 38
    :goto_1
    invoke-static {v1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Class;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance p0, Lyyds/ᲈᛵᛵᛴ;

    .line 51
    .line 52
    invoke-direct {p0, v2}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    const/4 p0, 0x0

    .line 57
    new-array p0, p0, [Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
