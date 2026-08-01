.class public final Lt0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lt0;->c:Ljava/io/Serializable;

    const-wide v0, 0x757b12c00L

    .line 34
    iput-wide v0, p0, Lt0;->a:J

    const/16 v0, 0x3000

    .line 35
    iput v0, p0, Lt0;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    const/high16 v1, 0x3f400000    # 0.75f

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lt0;->c:Ljava/io/Serializable;

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    const-wide/32 v0, 0xea60

    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Lt0;->a:J

    .line 22
    .line 23
    iput p1, p0, Lt0;->b:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public constructor <init>(Ljava/io/File;JJI)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lt0;->c:Ljava/io/Serializable;

    const-wide/16 v0, 0x0

    .line 38
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lt0;->a:J

    .line 39
    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->max(JJ)J

    const/4 p1, 0x1

    .line 40
    invoke-static {p1, p6}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lt0;->b:I

    return-void
.end method

.method public static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-ne p1, v0, :cond_2

    .line 6
    .line 7
    :cond_0
    if-eqz p0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "|"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, "#"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    :goto_0
    const-string p0, ""

    .line 43
    .line 44
    return-object p0
.end method

.method public static f(JLjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "sender#"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "#"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method


# virtual methods
.method public declared-synchronized a(JLjava/lang/String;)Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eqz p3, :cond_5

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

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
    iget-object v1, p0, Lt0;->c:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Long;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    cmp-long v2, p1, v2

    .line 29
    .line 30
    if-ltz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    sub-long v1, p1, v1

    .line 37
    .line 38
    iget-wide v3, p0, Lt0;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    cmp-long v1, v1, v3

    .line 41
    .line 42
    if-gez v1, :cond_1

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return v0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    :try_start_1
    iget-object v0, p0, Lt0;->c:Ljava/io/Serializable;

    .line 49
    .line 50
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v0, p3, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object p1, p0, Lt0;->c:Ljava/io/Serializable;

    .line 60
    .line 61
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget p2, p0, Lt0;->b:I

    .line 68
    .line 69
    if-le p1, p2, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Lt0;->c:Ljava/io/Serializable;

    .line 72
    .line 73
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_2

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/util/Map$Entry;

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Ljava/lang/String;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    const/4 p1, 0x0

    .line 103
    :goto_1
    if-nez p1, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    iget-object p2, p0, Lt0;->c:Ljava/io/Serializable;

    .line 107
    .line 108
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-virtual {p2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_4
    :goto_2
    monitor-exit p0

    .line 115
    const/4 p0, 0x1

    .line 116
    return p0

    .line 117
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    throw p1

    .line 119
    :cond_5
    :goto_4
    monitor-exit p0

    .line 120
    return v0
.end method

.method public c(JLjava/lang/String;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lt0;->c:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    iget-wide v3, v1, Ls0;->a:J

    .line 16
    .line 17
    cmp-long v5, p1, v3

    .line 18
    .line 19
    if-ltz v5, :cond_1

    .line 20
    .line 21
    sub-long/2addr p1, v3

    .line 22
    iget-wide v3, p0, Lt0;->a:J

    .line 23
    .line 24
    cmp-long p0, p1, v3

    .line 25
    .line 26
    if-gtz p0, :cond_1

    .line 27
    .line 28
    iget p0, v1, Ls0;->b:I

    .line 29
    .line 30
    return p0

    .line 31
    :cond_1
    invoke-virtual {v0, p3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return v2
.end method

.method public d(ILjava/lang/String;JJJLjava/lang/String;J)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    move-wide/from16 v6, p10

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    if-eq v1, v8, :cond_1

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    if-ne v1, v8, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v9

    .line 20
    :cond_1
    :goto_0
    const-wide/16 v10, 0x0

    .line 21
    .line 22
    cmp-long v8, p7, v10

    .line 23
    .line 24
    if-gez v8, :cond_2

    .line 25
    .line 26
    const-wide/32 v12, -0x80000000

    .line 27
    .line 28
    .line 29
    cmp-long v8, p7, v12

    .line 30
    .line 31
    if-ltz v8, :cond_2

    .line 32
    .line 33
    const-wide v12, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long v12, p7, v12

    .line 39
    .line 40
    :goto_1
    move-object/from16 v8, p2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move-wide/from16 v12, p7

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    invoke-static {v8, v1}, Lt0;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    const-string v15, "sig#"

    .line 55
    .line 56
    move-wide/from16 v16, v10

    .line 57
    .line 58
    const-string v10, "id#"

    .line 59
    .line 60
    const-string v11, "#"

    .line 61
    .line 62
    if-lez v14, :cond_5

    .line 63
    .line 64
    invoke-virtual {v8, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    cmp-long v18, v4, v16

    .line 69
    .line 70
    if-gtz v18, :cond_3

    .line 71
    .line 72
    move v14, v9

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v0, v6, v7, v9}, Lt0;->c(JLjava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    const/4 v14, 0x0

    .line 94
    :goto_3
    invoke-static {v14, v9}, Lu9;->B(II)I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    cmp-long v14, v2, v16

    .line 99
    .line 100
    if-lez v14, :cond_4

    .line 101
    .line 102
    cmp-long v18, v12, v16

    .line 103
    .line 104
    if-lez v18, :cond_4

    .line 105
    .line 106
    move/from16 p2, v14

    .line 107
    .line 108
    new-instance v14, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v14, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-virtual {v8, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    invoke-virtual {v0, v6, v7, v14}, Lt0;->c(JLjava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    invoke-static {v9, v14}, Lu9;->B(II)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    goto :goto_4

    .line 139
    :cond_4
    move/from16 p2, v14

    .line 140
    .line 141
    :goto_4
    if-lez p2, :cond_6

    .line 142
    .line 143
    invoke-virtual/range {p9 .. p9}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-lez v14, :cond_6

    .line 148
    .line 149
    move-object/from16 v14, p9

    .line 150
    .line 151
    invoke-static {v2, v3, v14}, Lt0;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    invoke-virtual {v8, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v0, v6, v7, v8}, Lt0;->c(JLjava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-static {v9, v8}, Lu9;->B(II)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    goto :goto_5

    .line 168
    :cond_5
    move v14, v9

    .line 169
    :cond_6
    :goto_5
    cmp-long v8, v4, v16

    .line 170
    .line 171
    if-lez v8, :cond_7

    .line 172
    .line 173
    new-instance v8, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v0, v6, v7, v4}, Lt0;->c(JLjava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-static {v9, v4}, Lu9;->B(II)I

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    :cond_7
    cmp-long v4, v2, v16

    .line 200
    .line 201
    if-lez v4, :cond_8

    .line 202
    .line 203
    cmp-long v4, v12, v16

    .line 204
    .line 205
    if-lez v4, :cond_8

    .line 206
    .line 207
    new-instance v4, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v0, v6, v7, v1}, Lt0;->c(JLjava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    invoke-static {v9, v0}, Lu9;->B(II)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    return v0

    .line 240
    :cond_8
    return v9
.end method

.method public e(ILjava/lang/String;JJJLjava/lang/String;IJ)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    move-object/from16 v6, p9

    .line 10
    .line 11
    move-wide/from16 v7, p11

    .line 12
    .line 13
    const/4 v9, 0x1

    .line 14
    if-eq v0, v9, :cond_1

    .line 15
    .line 16
    const/4 v10, 0x2

    .line 17
    if-ne v0, v10, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    invoke-static/range {p10 .. p10}, Lu9;->x(I)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    if-nez v10, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    const-wide/16 v11, 0x0

    .line 29
    .line 30
    cmp-long v13, p7, v11

    .line 31
    .line 32
    if-gez v13, :cond_3

    .line 33
    .line 34
    const-wide/32 v13, -0x80000000

    .line 35
    .line 36
    .line 37
    cmp-long v13, p7, v13

    .line 38
    .line 39
    if-ltz v13, :cond_3

    .line 40
    .line 41
    const-wide v13, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long v13, p7, v13

    .line 47
    .line 48
    :goto_1
    move-object/from16 v15, p2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-wide/from16 v13, p7

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_2
    invoke-static {v15, v0}, Lt0;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v16

    .line 62
    if-lez v16, :cond_6

    .line 63
    .line 64
    const-string v9, "id#"

    .line 65
    .line 66
    invoke-virtual {v15, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    cmp-long v17, v4, v11

    .line 71
    .line 72
    if-lez v17, :cond_4

    .line 73
    .line 74
    move-wide/from16 v17, v11

    .line 75
    .line 76
    iget-object v11, v1, Lt0;->c:Ljava/io/Serializable;

    .line 77
    .line 78
    check-cast v11, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    new-instance v12, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    new-instance v12, Ls0;

    .line 96
    .line 97
    invoke-direct {v12, v7, v8, v10}, Ls0;-><init>(JI)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    move-wide/from16 v17, v11

    .line 105
    .line 106
    :goto_3
    cmp-long v9, v2, v17

    .line 107
    .line 108
    if-lez v9, :cond_5

    .line 109
    .line 110
    cmp-long v11, v13, v17

    .line 111
    .line 112
    if-lez v11, :cond_5

    .line 113
    .line 114
    iget-object v11, v1, Lt0;->c:Ljava/io/Serializable;

    .line 115
    .line 116
    check-cast v11, Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    .line 118
    new-instance v12, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    move/from16 p2, v9

    .line 121
    .line 122
    const-string v9, "sig#"

    .line 123
    .line 124
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v9, "#"

    .line 131
    .line 132
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-virtual {v15, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    new-instance v12, Ls0;

    .line 147
    .line 148
    invoke-direct {v12, v7, v8, v10}, Ls0;-><init>(JI)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    move/from16 p2, v9

    .line 156
    .line 157
    :goto_4
    if-lez p2, :cond_7

    .line 158
    .line 159
    if-eqz v6, :cond_7

    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-lez v9, :cond_7

    .line 166
    .line 167
    iget-object v9, v1, Lt0;->c:Ljava/io/Serializable;

    .line 168
    .line 169
    check-cast v9, Ljava/util/concurrent/ConcurrentHashMap;

    .line 170
    .line 171
    invoke-static {v2, v3, v6}, Lt0;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v15, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    new-instance v11, Ls0;

    .line 180
    .line 181
    invoke-direct {v11, v7, v8, v10}, Ls0;-><init>(JI)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v6, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_6
    move-wide/from16 v17, v11

    .line 189
    .line 190
    :cond_7
    :goto_5
    cmp-long v6, v4, v17

    .line 191
    .line 192
    if-lez v6, :cond_8

    .line 193
    .line 194
    iget-object v6, v1, Lt0;->c:Ljava/io/Serializable;

    .line 195
    .line 196
    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    .line 197
    .line 198
    new-instance v9, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    const-string v11, "id#"

    .line 201
    .line 202
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v11, "#"

    .line 209
    .line 210
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    new-instance v5, Ls0;

    .line 221
    .line 222
    invoke-direct {v5, v7, v8, v10}, Ls0;-><init>(JI)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    :cond_8
    cmp-long v4, v2, v17

    .line 229
    .line 230
    if-lez v4, :cond_9

    .line 231
    .line 232
    cmp-long v4, v13, v17

    .line 233
    .line 234
    if-lez v4, :cond_9

    .line 235
    .line 236
    iget-object v4, v1, Lt0;->c:Ljava/io/Serializable;

    .line 237
    .line 238
    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 239
    .line 240
    new-instance v5, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v6, "sig#"

    .line 243
    .line 244
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v0, "#"

    .line 251
    .line 252
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-instance v2, Ls0;

    .line 269
    .line 270
    invoke-direct {v2, v7, v8, v10}, Ls0;-><init>(JI)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    :cond_9
    monitor-enter p0

    .line 277
    :try_start_0
    iget-object v0, v1, Lt0;->c:Ljava/io/Serializable;

    .line 278
    .line 279
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    iget v2, v1, Lt0;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    if-gt v0, v2, :cond_a

    .line 288
    .line 289
    monitor-exit p0

    .line 290
    return-void

    .line 291
    :cond_a
    :try_start_1
    iget-object v0, v1, Lt0;->c:Ljava/io/Serializable;

    .line 292
    .line 293
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_e

    .line 308
    .line 309
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ljava/util/Map$Entry;

    .line 314
    .line 315
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    check-cast v3, Ls0;

    .line 320
    .line 321
    if-eqz v3, :cond_d

    .line 322
    .line 323
    iget-wide v4, v3, Ls0;->a:J

    .line 324
    .line 325
    cmp-long v6, v7, v4

    .line 326
    .line 327
    if-ltz v6, :cond_c

    .line 328
    .line 329
    sub-long v4, v7, v4

    .line 330
    .line 331
    iget-wide v9, v1, Lt0;->a:J

    .line 332
    .line 333
    cmp-long v4, v4, v9

    .line 334
    .line 335
    if-gtz v4, :cond_c

    .line 336
    .line 337
    const/4 v4, 0x1

    .line 338
    goto :goto_7

    .line 339
    :catchall_0
    move-exception v0

    .line 340
    goto :goto_a

    .line 341
    :cond_c
    const/4 v4, 0x0

    .line 342
    :goto_7
    if-nez v4, :cond_b

    .line 343
    .line 344
    :cond_d
    iget-object v4, v1, Lt0;->c:Ljava/io/Serializable;

    .line 345
    .line 346
    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 347
    .line 348
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_e
    :goto_8
    iget-object v0, v1, Lt0;->c:Ljava/io/Serializable;

    .line 357
    .line 358
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    iget v2, v1, Lt0;->b:I

    .line 365
    .line 366
    if-le v0, v2, :cond_12

    .line 367
    .line 368
    iget-object v0, v1, Lt0;->c:Ljava/io/Serializable;

    .line 369
    .line 370
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const/4 v2, 0x0

    .line 381
    const-wide v3, 0x7fffffffffffffffL

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    :cond_f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    if-eqz v5, :cond_10

    .line 391
    .line 392
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    check-cast v5, Ljava/util/Map$Entry;

    .line 397
    .line 398
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    check-cast v6, Ls0;

    .line 403
    .line 404
    if-eqz v6, :cond_f

    .line 405
    .line 406
    iget-wide v6, v6, Ls0;->a:J

    .line 407
    .line 408
    cmp-long v8, v6, v3

    .line 409
    .line 410
    if-gez v8, :cond_f

    .line 411
    .line 412
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 417
    .line 418
    move-wide v3, v6

    .line 419
    goto :goto_9

    .line 420
    :cond_10
    if-nez v2, :cond_11

    .line 421
    .line 422
    monitor-exit p0

    .line 423
    return-void

    .line 424
    :cond_11
    :try_start_2
    iget-object v0, v1, Lt0;->c:Ljava/io/Serializable;

    .line 425
    .line 426
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 427
    .line 428
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 429
    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_12
    monitor-exit p0

    .line 433
    return-void

    .line 434
    :goto_a
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 435
    throw v0
.end method
