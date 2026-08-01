.class public abstract Lxhss/ᛶᛲᛵᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Ljava/util/Map;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lxhss/ᲇᛸᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 8
    .line 9
    new-instance v2, Lxhss/ᲀᛴᛳᛸ;

    .line 10
    .line 11
    const-string v0, "boolean"

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-direct {v2, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lxhss/ᲀᛴᛳᛸ;

    .line 19
    .line 20
    const-string v0, "byte"

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-direct {v3, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lxhss/ᲀᛴᛳᛸ;

    .line 28
    .line 29
    const-string v0, "char"

    .line 30
    .line 31
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-direct {v4, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, Lxhss/ᲀᛴᛳᛸ;

    .line 37
    .line 38
    const-string v0, "short"

    .line 39
    .line 40
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-direct {v5, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lxhss/ᲀᛴᛳᛸ;

    .line 46
    .line 47
    const-string v0, "int"

    .line 48
    .line 49
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-direct {v6, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Lxhss/ᲀᛴᛳᛸ;

    .line 55
    .line 56
    const-string v0, "long"

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-direct {v7, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lxhss/ᲀᛴᛳᛸ;

    .line 64
    .line 65
    const-string v0, "float"

    .line 66
    .line 67
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-direct {v8, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v9, Lxhss/ᲀᛴᛳᛸ;

    .line 73
    .line 74
    const-string v0, "double"

    .line 75
    .line 76
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-direct {v9, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v10, Lxhss/ᲀᛴᛳᛸ;

    .line 82
    .line 83
    const-string v0, "void"

    .line 84
    .line 85
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-direct {v10, v0, v1}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    filled-new-array/range {v2 .. v10}, [Lxhss/ᲀᛴᛳᛸ;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lxhss/ᲁᛵᛸᛳ;->ᲇᛸᛳᲁ([Lxhss/ᲀᛴᛳᛸ;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, Lxhss/ᛶᛲᛵᛶ;->ᛱᛱᛲᲇ:Ljava/util/Map;

    .line 99
    .line 100
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;)Ljava/io/Serializable;
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
    invoke-static {p0, v1}, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

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
    new-instance v2, Lxhss/ᲈᛳᛱᲇ;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v1, v2

    .line 38
    :goto_1
    invoke-static {v1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

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
    new-instance p0, Lxhss/ᲈᛳᛱᲇ;

    .line 51
    .line 52
    invoke-direct {p0, v2}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

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
    if-eqz p0, :cond_2

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    const-string p0, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 67
    .line 68
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛲᛷᛱ(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return-object p0
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 7

    .line 1
    new-instance v0, Lxhss/ᛳᛶᲈᲇ;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lxhss/ᛳᛶᲈᲇ;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lxhss/ᛶᛲᛵᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛸᛶ;

    .line 7
    .line 8
    iget-object v2, v1, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v4, v1, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/util/WeakHashMap;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    iget-object v4, v1, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/ClassLoader;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_0
    move-object v4, v5

    .line 43
    :goto_0
    if-ne v4, p0, :cond_4

    .line 44
    .line 45
    iget-object v4, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lxhss/ᛲᛵᲁᲁ;

    .line 54
    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v4}, Lxhss/ᛲᛵᲁᲁ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_2
    :try_start_1
    invoke-virtual {v4, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/util/Map;

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lxhss/ᛲᛵᲁᲁ;

    .line 82
    .line 83
    if-nez v4, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v4}, Lxhss/ᛲᛵᲁᲁ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 105
    .line 106
    .line 107
    :try_start_2
    iget-object v3, v1, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, Ljava/util/WeakHashMap;

    .line 110
    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    iget-object v4, v1, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/lang/ClassLoader;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p0

    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_5
    move-object v4, v5

    .line 130
    :goto_2
    if-nez v4, :cond_6

    .line 131
    .line 132
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 133
    .line 134
    invoke-direct {v4, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iput-object v4, v1, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v4, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, Ljava/util/HashMap;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    if-eq v4, p0, :cond_7

    .line 148
    .line 149
    new-instance v3, Ljava/util/WeakHashMap;

    .line 150
    .line 151
    invoke-direct {v3}, Ljava/util/WeakHashMap;-><init>()V

    .line 152
    .line 153
    .line 154
    iget-object v6, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v6, Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v3, v4, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    new-instance v4, Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, p0, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    iput-object v3, v1, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v5, v1, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 172
    .line 173
    new-instance v4, Ljava/util/HashMap;

    .line 174
    .line 175
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object v4, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 179
    .line 180
    :cond_7
    :goto_3
    if-eqz v3, :cond_9

    .line 181
    .line 182
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v1, :cond_8

    .line 187
    .line 188
    new-instance v1, Ljava/util/HashMap;

    .line 189
    .line 190
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-interface {v3, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_8
    check-cast v1, Ljava/util/Map;

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_9
    iget-object p0, v1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v1, p0

    .line 202
    check-cast v1, Ljava/util/HashMap;

    .line 203
    .line 204
    :goto_4
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, Lxhss/ᛲᛵᲁᲁ;

    .line 209
    .line 210
    if-eqz p0, :cond_a

    .line 211
    .line 212
    invoke-virtual {p0}, Lxhss/ᛲᛵᲁᲁ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    if-eqz v4, :cond_a

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 219
    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    :try_start_3
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲇ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    new-instance p0, Lxhss/ᛲᛵᲁᲁ;

    .line 227
    .line 228
    invoke-direct {p0, v4}, Lxhss/ᛲᛵᲁᲁ;-><init>(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v1, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 232
    .line 233
    .line 234
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 235
    .line 236
    .line 237
    :goto_5
    check-cast v4, Ljava/lang/Class;

    .line 238
    .line 239
    return-object v4

    .line 240
    :goto_6
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 241
    .line 242
    .line 243
    throw p0

    .line 244
    :goto_7
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 245
    .line 246
    .line 247
    throw p0
.end method
