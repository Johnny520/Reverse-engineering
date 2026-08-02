.class public final Lam1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/concurrent/locks/ReentrantLock;

.field public static final d:Ljava/util/concurrent/ExecutorService;

.field public static volatile e:Z

.field public static volatile f:Lql1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxl1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lxl1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lam1;->b:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lam1;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 26
    .line 27
    new-instance v0, Lt;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lt;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sput-object v0, Lam1;->d:Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    return-void
.end method

.method public static a(Lql1;[B)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lam1;->e(Lql1;[B)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Native Engine activation failed"

    .line 9
    .line 10
    invoke-static {p0}, Lc80;->x(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static b(Ljava/lang/String;Lxm0;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    sget-object v0, Lam1;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Boolean;

    .line 27
    .line 28
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-static {}, Lam1;->c()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lxm0;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :try_start_2
    invoke-virtual {p0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    :try_start_3
    invoke-virtual {p0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_0
    const-string p1, "Native call \'"

    .line 59
    .line 60
    const-string v0, "\' attempted on main thread"

    .line 61
    .line 62
    invoke-static {p1, p0, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lc80;->h(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static c()V
    .locals 6

    .line 1
    sget-boolean v0, Lam1;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lam1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-boolean v1, Lam1;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :cond_1
    :try_start_1
    invoke-static {}, Ls11;->Z()Lql1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, v1, Lql1;->a:Ljava/io/File;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-wide v2, v1, Lql1;->g:J

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long v2, v2, v4

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    invoke-static {v1, v3}, Lam1;->a(Lql1;[B)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {v1, v3}, Lam1;->e(Lql1;[B)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-static {}, Ls11;->X()Lql1;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v3}, Lam1;->a(Lql1;[B)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-static {v1}, Lvl1;->b(Lql1;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v1, v2}, Lam1;->a(Lql1;[B)V

    .line 61
    .line 62
    .line 63
    :goto_0
    sput-object v1, Lam1;->f:Lql1;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    sput-boolean v1, Lam1;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    monitor-exit v0

    .line 69
    return-void

    .line 70
    :goto_1
    monitor-exit v0

    .line 71
    throw v1
.end method

.method public static d(ZLaf;)V
    .locals 11

    .line 1
    const-string v0, "[NukeNativeUpdate]"

    .line 2
    .line 3
    sget-object v1, Lam1;->f:Lql1;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    sget-object v2, Lvl1;->a:Let1;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-wide v5, Lvl1;->b:J

    .line 18
    .line 19
    cmp-long p0, v2, v5

    .line 20
    .line 21
    if-gez p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/32 v5, 0xea60

    .line 25
    .line 26
    .line 27
    add-long/2addr v2, v5

    .line 28
    sput-wide v2, Lvl1;->b:J

    .line 29
    .line 30
    :try_start_0
    invoke-static {v1, p1}, Lvl1;->a(Lql1;Lmn0;)Lsl1;

    .line 31
    .line 32
    .line 33
    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    goto :goto_1

    .line 35
    :catch_0
    move-exception p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "native release check unavailable: "

    .line 43
    .line 44
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La83;->a:La83;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    new-instance v0, Lx92;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p1, v0

    .line 83
    :goto_0
    instance-of p1, p1, Lx92;

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    const/4 p1, 0x6

    .line 88
    const-string v0, "NukeNativeUpdate"

    .line 89
    .line 90
    invoke-static {p1, v0, p0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 94
    .line 95
    :goto_2
    return-void

    .line 96
    :cond_3
    iget-object p0, v4, Lsl1;->a:Lql1;

    .line 97
    .line 98
    iget-object p1, v4, Lsl1;->b:[B

    .line 99
    .line 100
    invoke-static {p0, p1}, Lam1;->a(Lql1;[B)V

    .line 101
    .line 102
    .line 103
    iget-object p0, v4, Lsl1;->a:Lql1;

    .line 104
    .line 105
    invoke-static {}, Ls11;->g0()Ljava/io/File;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, Ls11;->H(Ljava/io/File;)V

    .line 110
    .line 111
    .line 112
    :try_start_2
    invoke-static {p1}, Ls11;->U(Ljava/io/File;)Ljava/nio/channels/FileChannel;

    .line 113
    .line 114
    .line 115
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 116
    :try_start_3
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 117
    .line 118
    .line 119
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    :try_start_4
    iget-object v2, p0, Lql1;->c:Ljava/io/File;

    .line 121
    .line 122
    iget-object v3, p0, Lql1;->h:Ljava/io/File;

    .line 123
    .line 124
    iget-object v5, p0, Lql1;->d:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2, p1}, Lzl1;->f(Ljava/io/File;Ljava/io/File;)Lb5;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-object v6, v2, Lb5;->i:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v6, Lh80;

    .line 133
    .line 134
    iget-object v7, v6, Lh80;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_6

    .line 141
    .line 142
    iget-wide v7, v6, Lh80;->b:J

    .line 143
    .line 144
    iget-wide v9, p0, Lql1;->e:J

    .line 145
    .line 146
    cmp-long v7, v7, v9

    .line 147
    .line 148
    if-nez v7, :cond_6

    .line 149
    .line 150
    iget-object v6, v6, Lh80;->f:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v7, p0, Lql1;->f:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    iget-object v6, v2, Lb5;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, Ljava/io/File;

    .line 163
    .line 164
    iget-object v7, p0, Lql1;->b:Ljava/io/File;

    .line 165
    .line 166
    invoke-virtual {v6, v7}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_6

    .line 171
    .line 172
    if-eqz v3, :cond_5

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v3}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {v6, v3}, Lup0;->y(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_5

    .line 187
    .line 188
    iget-object v3, p0, Lql1;->c:Ljava/io/File;

    .line 189
    .line 190
    iget-wide v6, p0, Lql1;->g:J

    .line 191
    .line 192
    invoke-static {v6, v7, v2, p1, v3}, Ls11;->r0(JLb5;Ljava/io/File;Ljava/io/File;)V

    .line 193
    .line 194
    .line 195
    invoke-static {p1, v5}, Ls11;->b0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 196
    .line 197
    .line 198
    if-eqz v1, :cond_4

    .line 199
    .line 200
    :try_start_5
    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :catchall_1
    move-exception p0

    .line 205
    goto :goto_6

    .line 206
    :cond_4
    :goto_3
    :try_start_6
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 207
    .line 208
    .line 209
    iget-object p0, v4, Lsl1;->a:Lql1;

    .line 210
    .line 211
    sput-object p0, Lam1;->f:Lql1;

    .line 212
    .line 213
    return-void

    .line 214
    :catchall_2
    move-exception p0

    .line 215
    goto :goto_4

    .line 216
    :cond_5
    :try_start_7
    new-instance p0, Ljava/lang/SecurityException;

    .line 217
    .line 218
    const-string p1, "Native activation proof is missing"

    .line 219
    .line 220
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p0

    .line 224
    :cond_6
    new-instance p0, Ljava/lang/SecurityException;

    .line 225
    .line 226
    const-string p1, "Staged Native release changed before activation"

    .line 227
    .line 228
    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 232
    :goto_4
    if-eqz v1, :cond_7

    .line 233
    .line 234
    :try_start_8
    invoke-virtual {v1}, Ljava/nio/channels/FileLock;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catchall_3
    move-exception p1

    .line 239
    :try_start_9
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    :cond_7
    :goto_5
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 243
    :goto_6
    if-eqz v0, :cond_8

    .line 244
    .line 245
    :try_start_a
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :catchall_4
    move-exception p1

    .line 250
    :try_start_b
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    :cond_8
    :goto_7
    throw p0
    :try_end_b
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    .line 254
    :catch_1
    move-exception p0

    .line 255
    new-instance p1, Ljava/lang/SecurityException;

    .line 256
    .line 257
    const-string v0, "Unable to commit Native release"

    .line 258
    .line 259
    invoke-direct {p1, v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :catch_2
    move-exception p0

    .line 264
    throw p0
.end method

.method public static e(Lql1;[B)Z
    .locals 8

    .line 1
    sget-object v0, Lnuke/data/cipher/NativeCrypto;->INSTANCE:Lnuke/data/cipher/NativeCrypto;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnuke/data/cipher/NativeCrypto;->prepareModuleAttestationForActivation$app()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lql1;->b:Ljava/io/File;

    .line 7
    .line 8
    const/high16 v2, 0x10000000

    .line 9
    .line 10
    invoke-static {v1, v2}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    move-object v2, v1

    .line 15
    :try_start_0
    invoke-virtual {v7}, Landroid/os/ParcelFileDescriptor;->getFd()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-wide v3, p0, Lql1;->e:J

    .line 27
    .line 28
    iget-object v5, p0, Lql1;->f:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v6, p1

    .line 34
    invoke-virtual/range {v0 .. v6}, Lnuke/data/cipher/NativeCrypto;->activateEngineDirect$app(ILjava/lang/String;JLjava/lang/String;[B)Z

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-interface {v7}, Ljava/io/Closeable;->close()V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lnuke/data/cipher/NativeCrypto;->engineGenerationDirect$app()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-wide p0, p0, Lql1;->e:J

    .line 48
    .line 49
    cmp-long p0, v0, p0

    .line 50
    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p0, v0

    .line 59
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    invoke-static {v7, p0}, Lpp0;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method
