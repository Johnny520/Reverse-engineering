.class public final Le0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Lt0;

.field public b:J

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/high16 v0, -0x8000000000000000L

    .line 5
    .line 6
    iput-wide v0, p0, Le0;->b:J

    .line 7
    .line 8
    iput-wide v0, p0, Le0;->c:J

    .line 9
    .line 10
    new-instance v0, Lt0;

    .line 11
    .line 12
    invoke-direct {v0}, Lt0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Le0;->a:Lt0;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Ljava/io/File;[B)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "status directory unavailable"

    .line 28
    .line 29
    invoke-static {p0}, Lu2;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    :goto_0
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 34
    .line 35
    const-string v2, "rw"

    .line 36
    .line 37
    invoke-direct {v0, p0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 44
    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 45
    .line 46
    .line 47
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :try_start_2
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    array-length v5, p1

    .line 53
    int-to-long v5, v5

    .line 54
    add-long/2addr v3, v5

    .line 55
    const-wide/32 v5, 0x100000

    .line 56
    .line 57
    .line 58
    cmp-long v3, v3, v5

    .line 59
    .line 60
    if-lez v3, :cond_2

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v3, v1

    .line 65
    :goto_1
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const-wide/16 v4, 0x0

    .line 68
    .line 69
    invoke-virtual {p0, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_5

    .line 75
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->size()J

    .line 76
    .line 77
    .line 78
    move-result-wide v4

    .line 79
    invoke-virtual {p0, v4, v5}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-virtual {p0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    :try_start_3
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :catchall_1
    move-exception p1

    .line 106
    goto :goto_7

    .line 107
    :cond_5
    :goto_4
    :try_start_4
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 111
    .line 112
    .line 113
    return v3

    .line 114
    :catchall_2
    move-exception p0

    .line 115
    goto :goto_9

    .line 116
    :goto_5
    if-eqz v2, :cond_6

    .line 117
    .line 118
    :try_start_5
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :catchall_3
    move-exception v1

    .line 123
    :try_start_6
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 127
    :goto_7
    if-eqz p0, :cond_7

    .line 128
    .line 129
    :try_start_7
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 130
    .line 131
    .line 132
    goto :goto_8

    .line 133
    :catchall_4
    move-exception p0

    .line 134
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    :goto_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 138
    :goto_9
    :try_start_9
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 139
    .line 140
    .line 141
    goto :goto_a

    .line 142
    :catchall_5
    move-exception p1

    .line 143
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :goto_a
    throw p0
.end method

.method public static b(Ljava/lang/String;)J
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-wide v0

    .line 6
    :catchall_0
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    return-wide v0
.end method


# virtual methods
.method public final c(JLjava/io/File;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    iget-object v2, v1, Le0;->a:Lt0;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    goto/16 :goto_8

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    iget-wide v9, v1, Le0;->b:J

    .line 28
    .line 29
    cmp-long v9, v5, v9

    .line 30
    .line 31
    if-nez v9, :cond_1

    .line 32
    .line 33
    iget-wide v9, v1, Le0;->c:J

    .line 34
    .line 35
    cmp-long v9, v7, v9

    .line 36
    .line 37
    if-nez v9, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-object v2, v2, Lt0;->c:Ljava/io/Serializable;

    .line 41
    .line 42
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 45
    .line 46
    .line 47
    iget-object v9, v1, Le0;->a:Lt0;

    .line 48
    .line 49
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    .line 50
    .line 51
    new-instance v10, Ljava/io/InputStreamReader;

    .line 52
    .line 53
    new-instance v11, Ljava/io/FileInputStream;

    .line 54
    .line 55
    invoke-direct {v11, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 59
    .line 60
    invoke-direct {v10, v11, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    const-string v10, "\t"

    .line 73
    .line 74
    const/4 v11, -0x1

    .line 75
    invoke-virtual {v0, v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    array-length v10, v0

    .line 80
    const/4 v11, 0x6

    .line 81
    if-lt v10, v11, :cond_2

    .line 82
    .line 83
    array-length v10, v0

    .line 84
    const/16 v12, 0x8

    .line 85
    .line 86
    if-le v10, v12, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v10, 0x0

    .line 90
    aget-object v10, v0, v10

    .line 91
    .line 92
    invoke-static {v10}, Le0;->b(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v20

    .line 96
    cmp-long v10, v20, v3

    .line 97
    .line 98
    if-lez v10, :cond_2

    .line 99
    .line 100
    cmp-long v10, p1, v20

    .line 101
    .line 102
    if-ltz v10, :cond_2

    .line 103
    .line 104
    sub-long v13, p1, v20

    .line 105
    .line 106
    const-wide v15, 0x757b12c00L

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    cmp-long v10, v13, v15

    .line 112
    .line 113
    if-lez v10, :cond_4

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    array-length v10, v0

    .line 117
    const/4 v13, 0x7

    .line 118
    if-lt v10, v13, :cond_5

    .line 119
    .line 120
    aget-object v10, v0, v11

    .line 121
    .line 122
    :goto_1
    move-object/from16 v18, v10

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move-object v3, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_5
    const-string v10, ""

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :goto_2
    array-length v10, v0

    .line 132
    const/4 v11, 0x1

    .line 133
    if-ne v10, v12, :cond_6

    .line 134
    .line 135
    aget-object v10, v0, v13

    .line 136
    .line 137
    invoke-static {v10}, Le0;->b(Ljava/lang/String;)J

    .line 138
    .line 139
    .line 140
    move-result-wide v12

    .line 141
    long-to-int v10, v12

    .line 142
    invoke-static {v10}, Lu9;->x(I)I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    move v10, v11

    .line 148
    :goto_3
    if-nez v10, :cond_7

    .line 149
    .line 150
    move/from16 v19, v11

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    move/from16 v19, v10

    .line 154
    .line 155
    :goto_4
    aget-object v10, v0, v11

    .line 156
    .line 157
    invoke-static {v10}, Le0;->b(Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v10

    .line 161
    long-to-int v10, v10

    .line 162
    const/4 v11, 0x2

    .line 163
    aget-object v11, v0, v11

    .line 164
    .line 165
    const/4 v12, 0x3

    .line 166
    aget-object v12, v0, v12

    .line 167
    .line 168
    invoke-static {v12}, Le0;->b(Ljava/lang/String;)J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    const/4 v14, 0x4

    .line 173
    aget-object v14, v0, v14

    .line 174
    .line 175
    invoke-static {v14}, Le0;->b(Ljava/lang/String;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v14

    .line 179
    const/16 v16, 0x5

    .line 180
    .line 181
    aget-object v0, v0, v16

    .line 182
    .line 183
    invoke-static {v0}, Le0;->b(Ljava/lang/String;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v16

    .line 187
    invoke-virtual/range {v9 .. v21}, Lt0;->e(ILjava/lang/String;JJJLjava/lang/String;IJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_8
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :goto_5
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :catchall_1
    move-exception v0

    .line 200
    :try_start_4
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    :goto_6
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 204
    :catchall_2
    :goto_7
    iput-wide v5, v1, Le0;->b:J

    .line 205
    .line 206
    iput-wide v7, v1, Le0;->c:J

    .line 207
    .line 208
    return-void

    .line 209
    :cond_9
    :goto_8
    iget-wide v5, v1, Le0;->c:J

    .line 210
    .line 211
    cmp-long v0, v5, v3

    .line 212
    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    iget-object v0, v2, Lt0;->c:Ljava/io/Serializable;

    .line 216
    .line 217
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 220
    .line 221
    .line 222
    :cond_a
    iput-wide v3, v1, Le0;->b:J

    .line 223
    .line 224
    iput-wide v3, v1, Le0;->c:J

    .line 225
    .line 226
    return-void
.end method
