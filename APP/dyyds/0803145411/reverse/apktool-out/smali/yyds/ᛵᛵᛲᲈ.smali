.class public abstract Lyyds/ᛵᛵᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static volatile ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

.field public static volatile ᛲᲈᲁ:I

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

.field public static final ᲀᛲᛳᲀ:Lyyds/ᛲᲁᛸᛲ;

.field public static final ᲇᲇᲇᛱ:[Ljava/lang/String;

.field public static final ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛲᲁᛸᛲ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᛸᛲ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛲᲁᛸᛲ;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᛸᛲ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛵᛵᛲᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲁᛸᛲ;

    .line 16
    .line 17
    const-string v0, "slf4j.detectLoggerNameMismatch"

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-string v1, "true"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :goto_1
    sput-boolean v1, Lyyds/ᛵᛵᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 35
    .line 36
    const-string v0, "2.0"

    .line 37
    .line 38
    filled-new-array {v0}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lyyds/ᛵᛵᛲᲈ;->ᲇᲇᲇᛱ:[Ljava/lang/String;

    .line 43
    .line 44
    return-void
.end method

.method public static ᛱᲈᲁ(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-le v0, v1, :cond_1

    .line 7
    .line 8
    const-string v0, "Class path contains multiple SLF4J providers."

    .line 9
    .line 10
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lyyds/ᛲᲁᛸᛲ;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Found provider ["

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "]"

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const-string p0, "See https://www.slf4j.org/codes.html#multiple_bindings for an explanation."

    .line 53
    .line 54
    invoke-static {p0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method public static ᛲᛴᛳᛲ()V
    .locals 10

    .line 1
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 5
    .line 6
    check-cast v1, Lyyds/ᲁᲈᛱᛵ;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iput-boolean v2, v1, Lyyds/ᲁᲈᛱᛵ;->ᲀᛲᛳᲀ:Z

    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 12
    .line 13
    check-cast v1, Lyyds/ᲁᲈᛱᛵ;

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v1, v1, Lyyds/ᲁᲈᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lyyds/ᛵᛴᛳᛱ;

    .line 41
    .line 42
    iget-object v3, v2, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v3}, Lyyds/ᛵᛵᛲᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput-object v3, v2, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

    .line 56
    .line 57
    iget-object v0, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 58
    .line 59
    check-cast v0, Lyyds/ᲁᲈᛱᛵ;

    .line 60
    .line 61
    iget-object v1, v0, Lyyds/ᲁᲈᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    new-instance v3, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 v4, 0x80

    .line 70
    .line 71
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    :goto_1
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->drainTo(Ljava/util/Collection;I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

    .line 82
    .line 83
    iget-object v0, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 84
    .line 85
    check-cast v0, Lyyds/ᲁᲈᛱᛵ;

    .line 86
    .line 87
    iget-object v1, v0, Lyyds/ᲁᲈᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 90
    .line 91
    .line 92
    iget-object v0, v0, Lyyds/ᲁᲈᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_a

    .line 107
    .line 108
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Lyyds/ᛲᛱᛳᲈ;

    .line 113
    .line 114
    if-nez v6, :cond_2

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    iget-object v7, v6, Lyyds/ᛲᛱᛳᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛳᛱ;

    .line 118
    .line 119
    iget-object v8, v7, Lyyds/ᛵᛴᛳᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v9, v7, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 122
    .line 123
    if-eqz v9, :cond_9

    .line 124
    .line 125
    iget-object v9, v7, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 126
    .line 127
    instance-of v9, v9, Lyyds/ᛸᛲᛶᛱ;

    .line 128
    .line 129
    if-eqz v9, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    invoke-virtual {v7}, Lyyds/ᛵᛴᛳᛱ;->ᲇᛱᛲ()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_4

    .line 137
    .line 138
    iget v8, v6, Lyyds/ᛲᛱᛳᲈ;->ᛲᲈᲁ:I

    .line 139
    .line 140
    invoke-virtual {v7, v8}, Lyyds/ᛵᛴᛳᛱ;->ᛲᛳᛶᲁ(I)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_5

    .line 145
    .line 146
    invoke-virtual {v7}, Lyyds/ᛵᛴᛳᛱ;->ᲇᛱᛲ()Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_5

    .line 151
    .line 152
    :try_start_1
    iget-object v8, v7, Lyyds/ᛵᛴᛳᛱ;->ᲇᲇᲇᛱ:Ljava/lang/reflect/Method;

    .line 153
    .line 154
    iget-object v7, v7, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 155
    .line 156
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-virtual {v8, v7, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    invoke-static {v8}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :catch_0
    :cond_5
    :goto_3
    add-int/lit8 v7, v0, 0x1

    .line 168
    .line 169
    if-nez v0, :cond_8

    .line 170
    .line 171
    iget-object v0, v6, Lyyds/ᛲᛱᛳᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛳᛱ;

    .line 172
    .line 173
    invoke-virtual {v0}, Lyyds/ᛵᛴᛳᛱ;->ᲇᛱᛲ()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v6, "A number ("

    .line 182
    .line 183
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v6, ") of logging calls during the initialization phase have been intercepted and are"

    .line 190
    .line 191
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v0, "now being replayed. These are subject to the filtering rules of the underlying logging system."

    .line 202
    .line 203
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string v0, "See also https://www.slf4j.org/codes.html#replay"

    .line 207
    .line 208
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    iget-object v0, v6, Lyyds/ᛲᛱᛳᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛴᛳᛱ;

    .line 213
    .line 214
    iget-object v0, v0, Lyyds/ᛵᛴᛳᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲇᲀᲀ;

    .line 215
    .line 216
    instance-of v0, v0, Lyyds/ᛸᛲᛶᛱ;

    .line 217
    .line 218
    if-eqz v0, :cond_7

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_7
    const-string v0, "The following set of substitute loggers may have been accessed"

    .line 222
    .line 223
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v0, "during the initialization phase. Logging calls during this"

    .line 227
    .line 228
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-string v0, "phase were not honored. However, subsequent logging calls to these"

    .line 232
    .line 233
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v0, "loggers will work as normally expected."

    .line 237
    .line 238
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const-string v0, "See also https://www.slf4j.org/codes.html#substituteLogger"

    .line 242
    .line 243
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_8
    :goto_4
    move v0, v7

    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_9
    const-string v0, "Delegate logger cannot be null at this state."

    .line 250
    .line 251
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :goto_5
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 261
    throw v1
.end method

.method public static ᛲᲈᲁ()Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lyyds/ᛵᛵᛲᲈ;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "\" specified via \"slf4j.provider\" system property"

    .line 13
    .line 14
    const-string v3, "Attempting to load provider \""

    .line 15
    .line 16
    const-string v4, "slf4j.provider"

    .line 17
    .line 18
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget v3, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ:I

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    invoke-static {v3}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    sget v6, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ:I

    .line 55
    .line 56
    invoke-static {v6}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-lt v3, v6, :cond_1

    .line 61
    .line 62
    invoke-static {}, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ()Ljava/io/PrintStream;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v6, "SLF4J(I): "

    .line 67
    .line 68
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lyyds/ᛲᲁᛸᛲ;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    move-object v5, v2

    .line 90
    goto :goto_2

    .line 91
    :catch_0
    move-exception v2

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    move-exception v2

    .line 94
    goto :goto_1

    .line 95
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v6, "Specified SLF4JServiceProvider ("

    .line 98
    .line 99
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v4, ") does not implement SLF4JServiceProvider interface"

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3, v2}, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v6, "Failed to instantiate the specified SLF4JServiceProvider ("

    .line 121
    .line 122
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v4, ")"

    .line 129
    .line 130
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3, v2}, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    :goto_2
    if-eqz v5, :cond_3

    .line 141
    .line 142
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_3
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-nez v2, :cond_4

    .line 151
    .line 152
    const-class v2, Lyyds/ᛲᲁᛸᛲ;

    .line 153
    .line 154
    invoke-static {v2, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    goto :goto_3

    .line 159
    :cond_4
    new-instance v2, Lyyds/ᲁᛶᛴ;

    .line 160
    .line 161
    invoke-direct {v2, v1}, Lyyds/ᲁᛶᛴ;-><init>(Ljava/lang/ClassLoader;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v2}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ljava/util/ServiceLoader;

    .line 169
    .line 170
    :goto_3
    invoke-virtual {v1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_5

    .line 179
    .line 180
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lyyds/ᛲᲁᛸᛲ;

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/util/ServiceConfigurationError; {:try_start_1 .. :try_end_1} :catch_2

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :catch_2
    move-exception v2

    .line 191
    new-instance v3, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v4, "A service provider failed to instantiate:\n"

    .line 194
    .line 195
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static {}, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ()Ljava/io/PrintStream;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    const-string v4, "SLF4J(E): "

    .line 214
    .line 215
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_5
    return-object v0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-boolean v1, Lyyds/ᛵᛵᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 10
    .line 11
    if-eqz v1, :cond_6

    .line 12
    .line 13
    sget-object v1, Lyyds/ᛴᛸᛲ;->ᛲᲈᲁ:Lyyds/ᛱᲇᛵᲁ;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    sget-boolean v1, Lyyds/ᛴᛸᛲ;->ᛵᛸᛸᛷ:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :try_start_0
    new-instance v1, Lyyds/ᛱᲇᛵᲁ;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/SecurityManager;-><init>()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-object v1, v2

    .line 32
    :goto_0
    sput-object v1, Lyyds/ᛴᛸᛲ;->ᛲᲈᲁ:Lyyds/ᛱᲇᛵᲁ;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    sput-boolean v3, Lyyds/ᛴᛸᛲ;->ᛵᛸᛸᛷ:Z

    .line 36
    .line 37
    :goto_1
    if-nez v1, :cond_2

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    invoke-virtual {v1}, Lyyds/ᛱᲇᛵᲁ;->getClassContext()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-class v3, Lyyds/ᛴᛸᛲ;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x0

    .line 51
    :goto_2
    array-length v5, v1

    .line 52
    if-ge v4, v5, :cond_4

    .line 53
    .line 54
    aget-object v5, v1, v4

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_3
    array-length v3, v1

    .line 71
    if-ge v4, v3, :cond_5

    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x2

    .line 74
    .line 75
    array-length v3, v1

    .line 76
    if-ge v4, v3, :cond_5

    .line 77
    .line 78
    aget-object v2, v1, v4

    .line 79
    .line 80
    :goto_4
    if-eqz v2, :cond_6

    .line 81
    .line 82
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_6

    .line 87
    .line 88
    invoke-interface {v0}, Lyyds/ᛳᲇᲀᲀ;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v3, "Detected logger name mismatch. Given name: \""

    .line 99
    .line 100
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p0, "\"; computed name: \""

    .line 107
    .line 108
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p0, "\"."

    .line 115
    .line 116
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string p0, "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"

    .line 127
    .line 128
    invoke-static {p0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    const-string p0, "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"

    .line 133
    .line 134
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v2

    .line 138
    :cond_6
    :goto_5
    return-object v0
.end method

.method public static ᛶᛷᛲᲁ(Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier."

    .line 9
    .line 10
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/net/URL;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Ignoring binding found at ["

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "]"

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string p0, "See https://www.slf4j.org/codes.html#ignoredBindings for an explanation."

    .line 53
    .line 54
    invoke-static {p0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;
    .locals 3

    .line 1
    sget v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lyyds/ᛵᛵᛲᲈ;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget v2, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    sput v1, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 14
    .line 15
    invoke-static {}, Lyyds/ᛵᛵᛲᲈ;->ᲇᲈᛵᛷ()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_2
    sget v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 26
    .line 27
    if-eq v0, v1, :cond_5

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲁᛸᛲ;

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    const-string p0, "Unreachable code"

    .line 43
    .line 44
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_3
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    const-string p0, "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit"

    .line 52
    .line 53
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_5
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᛸᛲ;

    .line 58
    .line 59
    :goto_3
    iget v1, v0, Lyyds/ᛲᲁᛸᛲ;->ᛲᲈᲁ:I

    .line 60
    .line 61
    packed-switch v1, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 65
    .line 66
    check-cast v0, Lyyds/ᲁᲈᛱᛵ;

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :pswitch_0
    iget-object v0, v0, Lyyds/ᛲᲁᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛲᛱᛱ;

    .line 70
    .line 71
    check-cast v0, Lyyds/ᛱᛵᲈᲁ;

    .line 72
    .line 73
    :goto_4
    invoke-interface {v0, p0}, Lyyds/ᲁᛲᛱᛱ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Lyyds/ᛳᲇᲀᲀ;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static ᲇᲇᲇᛱ(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const-string v2, "]"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-le v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Actual provider is of type ["

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget v0, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ:I

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    sget v1, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ:I

    .line 46
    .line 47
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-lt v0, v1, :cond_0

    .line 52
    .line 53
    invoke-static {}, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ()Ljava/io/PrintStream;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "SLF4J(I): "

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :cond_1
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lyyds/ᛲᲁᛸᛲ;

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v3, "Connected with provider of type ["

    .line 76
    .line 77
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    sget v0, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ:I

    .line 99
    .line 100
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    sget v1, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ:I

    .line 105
    .line 106
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-lt v0, v1, :cond_2

    .line 111
    .line 112
    invoke-static {}, Lyyds/ᛲᛶᛶᲁ;->ᛵᛸᛸᛷ()Ljava/io/PrintStream;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v1, "SLF4J(D): "

    .line 117
    .line 118
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    return-void

    .line 126
    :cond_3
    const-string p0, "No providers were found which is impossible after successful initialization."

    .line 127
    .line 128
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static final ᲇᲈᛵᛷ()V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛱᲈᲁ(Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x3

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lyyds/ᛲᲁᛸᛲ;

    .line 21
    .line 22
    sput-object v1, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

    .line 23
    .line 24
    sget-object v1, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v1, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sput v2, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 35
    .line 36
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᲇᲇᲇᛱ(Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    const/4 v0, 0x4

    .line 41
    sput v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 42
    .line 43
    const-string v0, "No SLF4J providers were found."

    .line 44
    .line 45
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, "Defaulting to no-operation (NOP) logger implementation"

    .line 49
    .line 50
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "See https://www.slf4j.org/codes.html#noProviders for further details."

    .line 54
    .line 55
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "org/slf4j/impl/StaticLoggerBinder.class"

    .line 59
    .line 60
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 63
    .line 64
    .line 65
    :try_start_1
    const-class v4, Lyyds/ᛵᛵᛲᲈ;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-nez v4, :cond_1

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/ClassLoader;->getSystemResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v4, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/net/URL;

    .line 95
    .line 96
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_1
    :try_start_2
    const-string v4, "Error getting resources from path"

    .line 101
    .line 102
    invoke-static {v4, v0}, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-static {v1}, Lyyds/ᛵᛵᛲᲈ;->ᛶᛷᛲᲁ(Ljava/util/LinkedHashSet;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-static {}, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 109
    .line 110
    .line 111
    sget v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 112
    .line 113
    if-ne v0, v2, :cond_5

    .line 114
    .line 115
    :try_start_3
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᛸᛲ;

    .line 116
    .line 117
    iget v0, v0, Lyyds/ᛲᲁᛸᛲ;->ᛲᲈᲁ:I

    .line 118
    .line 119
    packed-switch v0, :pswitch_data_0

    .line 120
    .line 121
    .line 122
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :pswitch_0
    const-string v0, "2.0.99"

    .line 129
    .line 130
    sget-object v1, Lyyds/ᛵᛵᛲᲈ;->ᲇᲇᲇᛱ:[Ljava/lang/String;

    .line 131
    .line 132
    array-length v2, v1

    .line 133
    move v4, v3

    .line 134
    :goto_3
    if-ge v3, v2, :cond_4

    .line 135
    .line 136
    aget-object v5, v1, v3

    .line 137
    .line 138
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_3

    .line 143
    .line 144
    const/4 v4, 0x1

    .line 145
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    if-nez v4, :cond_5

    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v2, "The requested version "

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v0, " by your slf4j provider is not compatible with "

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    sget-object v0, Lyyds/ᛵᛵᛲᲈ;->ᲇᲇᲇᛱ:[Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v0, "See https://www.slf4j.org/codes.html#version_mismatch for further details."

    .line 189
    .line 190
    invoke-static {v0}, Lyyds/ᛲᛶᛶᲁ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    const-string v1, "Unexpected problem occurred during version sanity check"

    .line 196
    .line 197
    invoke-static {v1, v0}, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :cond_5
    :goto_4
    return-void

    .line 201
    :catch_1
    move-exception v0

    .line 202
    const/4 v1, 0x2

    .line 203
    sput v1, Lyyds/ᛵᛵᛲᲈ;->ᛲᲈᲁ:I

    .line 204
    .line 205
    const-string v1, "Failed to instantiate SLF4J LoggerFactory"

    .line 206
    .line 207
    invoke-static {v1, v0}, Lyyds/ᛲᛶᛶᲁ;->ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    const-string v2, "Unexpected initialization failure"

    .line 213
    .line 214
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    throw v1

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
