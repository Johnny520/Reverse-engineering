.class public final Lyyds/ᛸᛳᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᛳᲀᛵᛳ;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final ᛲᛴᛳᛲ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛳᛱᲀᛶ;

.field public ᛶᛷᛲᲁ:Lyyds/ᛴᲀᛵᛶ;

.field public final ᛷᛲᲈᛱ:Lyyds/ᛲᛸ;

.field public final ᛷᲈᲈᲁ:Lyyds/ᛳᛸᲇ;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᲈᛳᲀ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛳᛱᲀᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᛸᛳᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛱᲀᛶ;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 13
    .line 14
    iget-object p1, p3, Lyyds/ᛳᛱᲀᛶ;->ᛲᲈᲁ:Lcom/ss/android/ugc/awemes/WardDatabase_Impl;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    :cond_0
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᛳᲀ;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    new-instance p1, Lyyds/ᛳᲀᛵᛳ;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛱᲈᲁ:Lyyds/ᛳᲀᛵᛳ;

    .line 37
    .line 38
    iget-object p1, p3, Lyyds/ᛳᛱᲀᛶ;->ᛵᛸᛸᛷ:[Ljava/lang/String;

    .line 39
    .line 40
    new-instance p2, Lyyds/ᛱᛵᛱᛱ;

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p2, p0, p3, p1}, Lyyds/ᛱᛵᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 47
    .line 48
    new-instance p1, Lyyds/ᛳᛸᲇ;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lyyds/ᛳᛸᲇ;-><init>(Lyyds/ᛸᛳᛴᛴ;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛸᲇ;

    .line 54
    .line 55
    new-instance p1, Lyyds/ᛲᛸ;

    .line 56
    .line 57
    invoke-direct {p1, p0}, Lyyds/ᛲᛸ;-><init>(Lyyds/ᛸᛳᛴᛴ;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛲᛸ;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/content/Intent;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛸᛳᛴᛴ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v3, p0, Lyyds/ᛸᛳᛴᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛲᛸ;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v3, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lyyds/ᛸᛳᛴᛴ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛱᲀᛶ;

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛸᛳᛴᛴ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 21
    .line 22
    iget-object v0, p1, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 23
    .line 24
    iget-object v3, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, [Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v4, Lyyds/ᛳᛸᲀᛳ;

    .line 32
    .line 33
    invoke-direct {v4}, Lyyds/ᛳᛸᲀᛳ;-><init>()V

    .line 34
    .line 35
    .line 36
    array-length v5, v3

    .line 37
    move v6, v2

    .line 38
    :goto_0
    if-ge v6, v5, :cond_1

    .line 39
    .line 40
    aget-object v7, v3, v6

    .line 41
    .line 42
    iget-object v8, v0, Lyyds/ᛳᲀᛸᛸ;->ᲀᛲᛳᲀ:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 45
    .line 46
    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Ljava/util/Set;

    .line 55
    .line 56
    if-eqz v8, :cond_0

    .line 57
    .line 58
    invoke-virtual {v4, v8}, Lyyds/ᛳᛸᲀᛳ;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-virtual {v4, v7}, Lyyds/ᛳᛸᲀᛳ;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v4}, Lyyds/ᲀᛱᛳᲈ;->ᛲᛴᛳᛲ(Lyyds/ᛳᛸᲀᛳ;)Lyyds/ᛳᛸᲀᛳ;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-array v4, v2, [Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, [Ljava/lang/String;

    .line 79
    .line 80
    array-length v4, v3

    .line 81
    new-array v5, v4, [I

    .line 82
    .line 83
    move v6, v2

    .line 84
    :goto_2
    if-ge v6, v4, :cond_3

    .line 85
    .line 86
    aget-object v7, v3, v6

    .line 87
    .line 88
    iget-object v8, v0, Lyyds/ᛳᲀᛸᛸ;->ᲇᲇᲇᛱ:Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 91
    .line 92
    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Ljava/lang/Integer;

    .line 101
    .line 102
    if-eqz v8, :cond_2

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    aput v7, v5, v6

    .line 109
    .line 110
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    const-string p0, "There is no table with name "

    .line 114
    .line 115
    invoke-virtual {p0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_3
    new-instance v0, Lkotlin/Pair;

    .line 124
    .line 125
    invoke-direct {v0, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, [Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, [I

    .line 139
    .line 140
    new-instance v4, Lyyds/ᲇᲀᛵᛸ;

    .line 141
    .line 142
    invoke-direct {v4, p0, v0, v3}, Lyyds/ᲇᲀᛵᛸ;-><init>(Lyyds/ᛱᛵᛱᛱ;[I[Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v3, p1, Lyyds/ᛳᛱᲀᛶ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 148
    .line 149
    .line 150
    :try_start_0
    iget-object v5, p1, Lyyds/ᛳᛱᲀᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 151
    .line 152
    invoke-interface {v5, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    iget-object v6, p1, Lyyds/ᛳᛱᲀᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    if-eqz v5, :cond_4

    .line 159
    .line 160
    :try_start_1
    invoke-static {v6, p0}, Lyyds/ᲁᲈᛶᛴ;->ᲀᛲᛲᲇ(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Lyyds/ᲇᲀᛵᛸ;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :catchall_0
    move-exception p0

    .line 168
    goto :goto_7

    .line 169
    :cond_4
    invoke-interface {v6, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Lyyds/ᲇᲀᛵᛸ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    .line 175
    :goto_3
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 176
    .line 177
    .line 178
    if-nez p0, :cond_8

    .line 179
    .line 180
    iget-object p0, p1, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 181
    .line 182
    iget-object p0, p0, Lyyds/ᛳᲀᛸᛸ;->ᛱᲈᲁ:Lyyds/ᛶᛳᛷᲇ;

    .line 183
    .line 184
    iget-object p1, p0, Lyyds/ᛶᛳᛷᲇ;->ᛲᲈᲁ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 187
    .line 188
    .line 189
    :try_start_2
    array-length v3, v0

    .line 190
    move v4, v2

    .line 191
    :goto_4
    if-ge v2, v3, :cond_6

    .line 192
    .line 193
    aget v5, v0, v2

    .line 194
    .line 195
    iget-object v6, p0, Lyyds/ᛶᛳᛷᲇ;->ᛵᛸᛸᛷ:[J

    .line 196
    .line 197
    aget-wide v7, v6, v5

    .line 198
    .line 199
    const-wide/16 v9, 0x1

    .line 200
    .line 201
    add-long/2addr v9, v7

    .line 202
    aput-wide v9, v6, v5

    .line 203
    .line 204
    const-wide/16 v5, 0x0

    .line 205
    .line 206
    cmp-long v5, v7, v5

    .line 207
    .line 208
    if-nez v5, :cond_5

    .line 209
    .line 210
    iput-boolean v1, p0, Lyyds/ᛶᛳᛷᲇ;->ᲇᲈᛵᛷ:Z

    .line 211
    .line 212
    move v4, v1

    .line 213
    goto :goto_5

    .line 214
    :catchall_1
    move-exception p0

    .line 215
    goto :goto_6

    .line 216
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_6
    if-nez v4, :cond_7

    .line 220
    .line 221
    iget-boolean v0, p0, Lyyds/ᛶᛳᛷᲇ;->ᲇᲈᛵᛷ:Z

    .line 222
    .line 223
    if-nez v0, :cond_7

    .line 224
    .line 225
    iget-boolean p0, p0, Lyyds/ᛶᛳᛷᲇ;->ᲇᲇᲇᛱ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 226
    .line 227
    :cond_7
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :goto_6
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 232
    .line 233
    .line 234
    throw p0

    .line 235
    :goto_7
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 236
    .line 237
    .line 238
    throw p0

    .line 239
    :cond_8
    return-void
.end method
