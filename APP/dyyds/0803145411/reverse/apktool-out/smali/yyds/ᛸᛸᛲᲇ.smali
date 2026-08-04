.class public final Lyyds/ᛸᛸᛲᲇ;
.super Ljava/lang/Thread;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic ᛷᛵᲇᲀ:J


# instance fields
.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field private volatile synthetic workerCtl$volatile:I

.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:I

.field public ᛶᛷᛲᲁ:J

.field public final synthetic ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛵᛲ;

.field public ᲇᲇᲇᛱ:J

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᛸᛸᛲᲇ;

    .line 2
    .line 3
    const-string v1, "workerCtl$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sput-object v2, Lyyds/ᛸᛸᛲᲇ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v2, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sput-wide v0, Lyyds/ᛸᛸᛲᲇ;->ᛷᛵᲇᲀ:J

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lyyds/ᛲᛷᛸᛵ;I)V
    .locals 2

    .line 1
    iput-object p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 8
    .line 9
    .line 10
    const-class p1, Lyyds/ᛲᛷᛸᛵ;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lyyds/ᛴᲈᛵᛲ;

    .line 20
    .line 21
    invoke-direct {p1}, Lyyds/ᛴᲈᛵᛲ;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛵᛲ;

    .line 25
    .line 26
    new-instance p1, Lyyds/ᛱᛷᛸᲈ;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 32
    .line 33
    const/4 p1, 0x4

    .line 34
    iput p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 35
    .line 36
    sget-object p1, Lyyds/ᛲᛷᛸᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛸᛴᛶ;

    .line 37
    .line 38
    iput-object p1, p0, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    long-to-int p1, v0

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/16 p1, 0x2a

    .line 49
    .line 50
    :goto_0
    iput p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ:I

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    :cond_0
    :goto_0
    move v7, v6

    .line 5
    :cond_1
    :goto_1
    iget-object v0, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 6
    .line 7
    sget-object v2, Lyyds/ᛲᛷᛸᛵ;->ᛷᛵᲇᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v8, 0x5

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    :cond_2
    move v2, v8

    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_3
    iget v0, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 20
    .line 21
    if-eq v0, v8, :cond_2

    .line 22
    .line 23
    iget-boolean v0, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛳᛶᲁ:Z

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lyyds/ᛸᛸᛲᲇ;->ᛲᲈᲁ(Z)Lyyds/ᲈᲁᛷᛱ;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v9, 0x3

    .line 30
    const-wide/32 v2, -0x200000

    .line 31
    .line 32
    .line 33
    const-wide/16 v10, 0x0

    .line 34
    .line 35
    if-eqz v0, :cond_9

    .line 36
    .line 37
    iput-wide v10, v1, Lyyds/ᛸᛸᛲᲇ;->ᛶᛷᛲᲁ:J

    .line 38
    .line 39
    iget-object v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 40
    .line 41
    iput-wide v10, v1, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ:J

    .line 42
    .line 43
    iget v5, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 44
    .line 45
    const/4 v7, 0x2

    .line 46
    if-ne v5, v9, :cond_4

    .line 47
    .line 48
    iput v7, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 49
    .line 50
    :cond_4
    iget-boolean v5, v0, Lyyds/ᲈᲁᛷᛱ;->ᲇᲈᛵᛷ:Z

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    invoke-virtual {v1, v7}, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ(I)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_7

    .line 59
    .line 60
    invoke-virtual {v4}, Lyyds/ᛲᛷᛸᛵ;->ᛳᲁᲁᲇ()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    sget-object v5, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 68
    .line 69
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-virtual {v4, v9, v10}, Lyyds/ᛲᛷᛸᛵ;->ᛷᲈᲈᲁ(J)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_6
    invoke-virtual {v4}, Lyyds/ᛲᛷᛸᛵ;->ᛳᲁᲁᲇ()Z

    .line 81
    .line 82
    .line 83
    :cond_7
    :goto_2
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-interface {v7, v5, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    sget-object v0, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 100
    .line 101
    invoke-virtual {v0, v4, v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 102
    .line 103
    .line 104
    iget v0, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 105
    .line 106
    if-eq v0, v8, :cond_0

    .line 107
    .line 108
    const/4 v0, 0x4

    .line 109
    iput v0, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-interface {v3, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_9
    iput-boolean v6, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛳᛶᲁ:Z

    .line 130
    .line 131
    iget-wide v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛶᛷᛲᲁ:J

    .line 132
    .line 133
    cmp-long v0, v4, v10

    .line 134
    .line 135
    if-eqz v0, :cond_b

    .line 136
    .line 137
    if-nez v7, :cond_a

    .line 138
    .line 139
    const/4 v7, 0x1

    .line 140
    goto/16 :goto_1

    .line 141
    .line 142
    :cond_a
    invoke-virtual {v1, v9}, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ(I)Z

    .line 143
    .line 144
    .line 145
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 146
    .line 147
    .line 148
    iget-wide v2, v1, Lyyds/ᛸᛸᛲᲇ;->ᛶᛷᛲᲁ:J

    .line 149
    .line 150
    invoke-static {v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 151
    .line 152
    .line 153
    iput-wide v10, v1, Lyyds/ᛸᛸᛲᲇ;->ᛶᛷᛲᲁ:J

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_b
    iget-object v0, v1, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 158
    .line 159
    sget-object v4, Lyyds/ᛲᛷᛸᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛸᛴᛶ;

    .line 160
    .line 161
    if-eq v0, v4, :cond_15

    .line 162
    .line 163
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 164
    .line 165
    sget-wide v2, Lyyds/ᛸᛸᛲᲇ;->ᛷᛵᲇᲀ:J

    .line 166
    .line 167
    const/4 v15, -0x1

    .line 168
    invoke-virtual {v0, v1, v2, v3, v15}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 169
    .line 170
    .line 171
    :goto_4
    iget-object v0, v1, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 172
    .line 173
    sget-object v2, Lyyds/ᛲᛷᛸᛵ;->ᛲᛲᲈᲈ:Lyyds/ᛲᛸᛴᛶ;

    .line 174
    .line 175
    if-eq v0, v2, :cond_1

    .line 176
    .line 177
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 178
    .line 179
    sget-wide v2, Lyyds/ᛸᛸᛲᲇ;->ᛷᛵᲇᲀ:J

    .line 180
    .line 181
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-ne v4, v15, :cond_1

    .line 186
    .line 187
    iget-object v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 188
    .line 189
    sget-object v5, Lyyds/ᛲᛷᛸᛵ;->ᛷᛵᲇᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 190
    .line 191
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_c

    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_c
    iget v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 200
    .line 201
    if-ne v4, v8, :cond_d

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_d
    invoke-virtual {v1, v9}, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ(I)Z

    .line 206
    .line 207
    .line 208
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 209
    .line 210
    .line 211
    const-wide/32 v16, 0x1fffff

    .line 212
    .line 213
    .line 214
    iget-wide v12, v1, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ:J

    .line 215
    .line 216
    cmp-long v4, v12, v10

    .line 217
    .line 218
    if-nez v4, :cond_e

    .line 219
    .line 220
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 221
    .line 222
    .line 223
    move-result-wide v12

    .line 224
    iget-object v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 225
    .line 226
    iget-wide v8, v4, Lyyds/ᛲᛷᛸᛵ;->ᛲᛴᛳᛲ:J

    .line 227
    .line 228
    add-long/2addr v12, v8

    .line 229
    iput-wide v12, v1, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ:J

    .line 230
    .line 231
    :cond_e
    iget-object v4, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 232
    .line 233
    iget-wide v8, v4, Lyyds/ᛲᛷᛸᛵ;->ᛲᛴᛳᛲ:J

    .line 234
    .line 235
    invoke-static {v8, v9}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 239
    .line 240
    .line 241
    move-result-wide v8

    .line 242
    iget-wide v12, v1, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ:J

    .line 243
    .line 244
    sub-long/2addr v8, v12

    .line 245
    cmp-long v4, v8, v10

    .line 246
    .line 247
    if-ltz v4, :cond_14

    .line 248
    .line 249
    iput-wide v10, v1, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ:J

    .line 250
    .line 251
    iget-object v8, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 252
    .line 253
    iget-object v9, v8, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 254
    .line 255
    monitor-enter v9

    .line 256
    :try_start_2
    invoke-virtual {v5, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 257
    .line 258
    .line 259
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 260
    if-eqz v4, :cond_f

    .line 261
    .line 262
    const/4 v4, 0x1

    .line 263
    goto :goto_5

    .line 264
    :cond_f
    move v4, v6

    .line 265
    :goto_5
    if-eqz v4, :cond_10

    .line 266
    .line 267
    monitor-exit v9

    .line 268
    goto :goto_8

    .line 269
    :cond_10
    :try_start_3
    sget-object v12, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 270
    .line 271
    invoke-virtual {v12, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 272
    .line 273
    .line 274
    move-result-wide v4

    .line 275
    and-long v4, v4, v16

    .line 276
    .line 277
    long-to-int v4, v4

    .line 278
    iget v5, v8, Lyyds/ᛲᛷᛸᛵ;->ᲀᛲᛳᲀ:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 279
    .line 280
    if-gt v4, v5, :cond_11

    .line 281
    .line 282
    monitor-exit v9

    .line 283
    goto :goto_8

    .line 284
    :cond_11
    const/4 v4, -0x1

    .line 285
    const/4 v5, 0x1

    .line 286
    :try_start_4
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 287
    .line 288
    .line 289
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 290
    if-nez v0, :cond_12

    .line 291
    .line 292
    monitor-exit v9

    .line 293
    goto :goto_8

    .line 294
    :cond_12
    :try_start_5
    iget v0, v1, Lyyds/ᛸᛸᛲᲇ;->indexInArray:I

    .line 295
    .line 296
    invoke-virtual {v1, v6}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8, v1, v0, v6}, Lyyds/ᛲᛷᛸᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛸᛸᛲᲇ;II)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v2

    .line 306
    and-long v2, v2, v16

    .line 307
    .line 308
    long-to-int v2, v2

    .line 309
    if-eq v2, v0, :cond_13

    .line 310
    .line 311
    iget-object v3, v8, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 312
    .line 313
    invoke-virtual {v3, v2}, Lyyds/ᛴᛳᛶᛷ;->ᛵᛸᛸᛷ(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    check-cast v3, Lyyds/ᛸᛸᛲᲇ;

    .line 318
    .line 319
    iget-object v4, v8, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 320
    .line 321
    invoke-virtual {v4, v0, v3}, Lyyds/ᛴᛳᛶᛷ;->ᲀᛲᛳᲀ(ILyyds/ᛸᛸᛲᲇ;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v0}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲇᲇᛱ(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v8, v3, v2, v0}, Lyyds/ᛲᛷᛸᛵ;->ᛶᛷᛲᲁ(Lyyds/ᛸᛸᛲᲇ;II)V

    .line 328
    .line 329
    .line 330
    goto :goto_6

    .line 331
    :catchall_2
    move-exception v0

    .line 332
    goto :goto_7

    .line 333
    :cond_13
    :goto_6
    iget-object v0, v8, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 334
    .line 335
    const/4 v3, 0x0

    .line 336
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᛳᛶᛷ;->ᲀᛲᛳᲀ(ILyyds/ᛸᛸᛲᲇ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 337
    .line 338
    .line 339
    monitor-exit v9

    .line 340
    const/4 v2, 0x5

    .line 341
    iput v2, v1, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :goto_7
    monitor-exit v9

    .line 345
    throw v0

    .line 346
    :cond_14
    :goto_8
    const/4 v8, 0x5

    .line 347
    const/4 v9, 0x3

    .line 348
    goto/16 :goto_4

    .line 349
    .line 350
    :cond_15
    const-wide/32 v16, 0x1fffff

    .line 351
    .line 352
    .line 353
    iget-object v11, v1, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 354
    .line 355
    sget-object v10, Lyyds/ᛲᛷᛸᛵ;->ᛷᲈᲈᲁ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 356
    .line 357
    iget-object v0, v1, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 358
    .line 359
    if-eq v0, v4, :cond_16

    .line 360
    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :cond_16
    invoke-virtual {v10, v11}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 364
    .line 365
    .line 366
    move-result-wide v12

    .line 367
    and-long v4, v12, v16

    .line 368
    .line 369
    long-to-int v0, v4

    .line 370
    const-wide/32 v4, 0x200000

    .line 371
    .line 372
    .line 373
    add-long/2addr v4, v12

    .line 374
    and-long/2addr v4, v2

    .line 375
    iget v8, v1, Lyyds/ᛸᛸᛲᲇ;->indexInArray:I

    .line 376
    .line 377
    iget-object v9, v11, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 378
    .line 379
    invoke-virtual {v9, v0}, Lyyds/ᛴᛳᛶᛷ;->ᛵᛸᛸᛷ(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iput-object v0, v1, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 384
    .line 385
    int-to-long v8, v8

    .line 386
    or-long v14, v4, v8

    .line 387
    .line 388
    invoke-virtual/range {v10 .. v15}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_16

    .line 393
    .line 394
    goto/16 :goto_1

    .line 395
    .line 396
    :goto_9
    invoke-virtual {v1, v2}, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ(I)Z

    .line 397
    .line 398
    .line 399
    return-void
.end method

.method public final ᛱᲈᲁ(I)Z
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    sget-object v2, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 11
    .line 12
    const-wide v3, 0x40000000000L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iget-object v5, p0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 18
    .line 19
    invoke-virtual {v2, v5, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 20
    .line 21
    .line 22
    :cond_1
    if-eq v0, p1, :cond_2

    .line 23
    .line 24
    iput p1, p0, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 25
    .line 26
    :cond_2
    return v1
.end method

.method public final ᛲᛳᛶᲁ(I)Lyyds/ᲈᲁᛷᛱ;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    iget-object v3, v0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const-wide/32 v6, 0x1fffff

    .line 14
    .line 15
    .line 16
    and-long/2addr v4, v6

    .line 17
    long-to-int v2, v4

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x2

    .line 20
    if-ge v2, v5, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    invoke-virtual {v0, v2}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲈᛵᛷ(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/4 v10, 0x0

    .line 28
    const-wide v11, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    if-ge v10, v2, :cond_11

    .line 34
    .line 35
    const/4 v15, 0x1

    .line 36
    add-int/2addr v6, v15

    .line 37
    if-le v6, v2, :cond_1

    .line 38
    .line 39
    move v6, v15

    .line 40
    :cond_1
    iget-object v5, v3, Lyyds/ᛲᛷᛸᛵ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᛶᛷ;

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Lyyds/ᛴᛳᛶᛷ;->ᛵᛸᛸᛷ(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lyyds/ᛸᛸᛲᲇ;

    .line 47
    .line 48
    if-eqz v5, :cond_f

    .line 49
    .line 50
    if-eq v5, v0, :cond_f

    .line 51
    .line 52
    iget-object v5, v5, Lyyds/ᛸᛸᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛵᛲ;

    .line 53
    .line 54
    const/4 v7, 0x3

    .line 55
    if-ne v1, v7, :cond_2

    .line 56
    .line 57
    invoke-virtual {v5}, Lyyds/ᛴᲈᛵᛲ;->ᛵᛸᛸᛷ()Lyyds/ᲈᲁᛷᛱ;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    move v14, v2

    .line 62
    const-wide v22, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const-wide/16 v24, 0x0

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 74
    .line 75
    const-wide v22, 0x7fffffffffffffffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    sget-wide v8, Lyyds/ᛴᲈᛵᛲ;->ᛲᛴᛳᛲ:J

    .line 81
    .line 82
    invoke-virtual {v7, v5, v8, v9}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    const-wide/16 v24, 0x0

    .line 87
    .line 88
    sget-wide v13, Lyyds/ᛴᲈᛵᛲ;->ᛶᛷᛲᲁ:J

    .line 89
    .line 90
    invoke-virtual {v7, v5, v13, v14}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-ne v1, v15, :cond_3

    .line 95
    .line 96
    move v9, v15

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/4 v9, 0x0

    .line 99
    :goto_1
    if-eq v8, v7, :cond_7

    .line 100
    .line 101
    if-eqz v9, :cond_4

    .line 102
    .line 103
    sget-object v13, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 104
    .line 105
    move v14, v2

    .line 106
    sget-wide v1, Lyyds/ᛴᲈᛵᛲ;->ᲇᲈᛵᛷ:J

    .line 107
    .line 108
    invoke-virtual {v13, v5, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    :goto_2
    move-object v7, v4

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move v14, v2

    .line 117
    :cond_5
    add-int/lit8 v1, v8, 0x1

    .line 118
    .line 119
    invoke-virtual {v5, v8, v9}, Lyyds/ᛴᲈᛵᛲ;->ᲀᛲᛳᲀ(IZ)Lyyds/ᲈᲁᛷᛱ;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-nez v2, :cond_6

    .line 124
    .line 125
    move v8, v1

    .line 126
    move v2, v14

    .line 127
    move/from16 v1, p1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    move-object v7, v2

    .line 131
    goto :goto_3

    .line 132
    :cond_7
    move v14, v2

    .line 133
    goto :goto_2

    .line 134
    :goto_3
    iget-object v8, v0, Lyyds/ᛸᛸᛲᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 135
    .line 136
    if-eqz v7, :cond_8

    .line 137
    .line 138
    iput-object v7, v8, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 139
    .line 140
    const-wide/16 v1, -0x1

    .line 141
    .line 142
    const-wide/16 v26, -0x1

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_8
    const-wide/16 v26, -0x1

    .line 146
    .line 147
    sget-wide v1, Lyyds/ᛴᲈᛵᛲ;->ᲇᲇᲇᛱ:J

    .line 148
    .line 149
    :goto_4
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 150
    .line 151
    invoke-virtual {v7, v5, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lyyds/ᲈᲁᛷᛱ;

    .line 156
    .line 157
    if-nez v7, :cond_9

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_9
    iget-boolean v9, v7, Lyyds/ᲈᲁᛷᛱ;->ᲇᲈᛵᛷ:Z

    .line 161
    .line 162
    if-eqz v9, :cond_a

    .line 163
    .line 164
    move v9, v15

    .line 165
    goto :goto_5

    .line 166
    :cond_a
    const/4 v9, 0x2

    .line 167
    :goto_5
    and-int v9, v9, p1

    .line 168
    .line 169
    if-nez v9, :cond_b

    .line 170
    .line 171
    :goto_6
    const-wide/16 v1, -0x2

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_b
    sget-object v9, Lyyds/ᲇᲇᛲᲇ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᲈᲁ;

    .line 175
    .line 176
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 180
    .line 181
    .line 182
    move-result-wide v16

    .line 183
    move-object v13, v5

    .line 184
    iget-wide v4, v7, Lyyds/ᲈᲁᛷᛱ;->ᲀᛲᛳᲀ:J

    .line 185
    .line 186
    sub-long v16, v16, v4

    .line 187
    .line 188
    sget-wide v4, Lyyds/ᲇᲇᛲᲇ;->ᛵᛸᛸᛷ:J

    .line 189
    .line 190
    cmp-long v18, v16, v4

    .line 191
    .line 192
    if-gez v18, :cond_c

    .line 193
    .line 194
    sub-long v1, v4, v16

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_c
    sget-object v16, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 198
    .line 199
    sget-wide v18, Lyyds/ᛴᲈᛵᛲ;->ᲇᲇᲇᛱ:J

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    move-object/from16 v20, v7

    .line 204
    .line 205
    move-object/from16 v17, v13

    .line 206
    .line 207
    invoke-virtual/range {v16 .. v21}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    move-object/from16 v5, v16

    .line 212
    .line 213
    if-eqz v4, :cond_e

    .line 214
    .line 215
    iput-object v7, v8, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 216
    .line 217
    move-wide/from16 v1, v26

    .line 218
    .line 219
    :goto_7
    cmp-long v4, v1, v26

    .line 220
    .line 221
    if-nez v4, :cond_d

    .line 222
    .line 223
    iget-object v0, v8, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Lyyds/ᲈᲁᛷᛱ;

    .line 226
    .line 227
    const/4 v9, 0x0

    .line 228
    iput-object v9, v8, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_d
    cmp-long v4, v1, v24

    .line 232
    .line 233
    if-lez v4, :cond_10

    .line 234
    .line 235
    invoke-static {v11, v12, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 236
    .line 237
    .line 238
    move-result-wide v11

    .line 239
    goto :goto_8

    .line 240
    :cond_e
    invoke-virtual {v5, v13, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-eq v4, v7, :cond_c

    .line 245
    .line 246
    move-object v5, v13

    .line 247
    const/4 v4, 0x0

    .line 248
    goto :goto_4

    .line 249
    :cond_f
    move v14, v2

    .line 250
    const-wide v22, 0x7fffffffffffffffL

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :cond_10
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 256
    .line 257
    move/from16 v1, p1

    .line 258
    .line 259
    move v2, v14

    .line 260
    const/4 v4, 0x0

    .line 261
    const/4 v5, 0x2

    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_11
    const-wide v22, 0x7fffffffffffffffL

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    const-wide/16 v24, 0x0

    .line 270
    .line 271
    cmp-long v1, v11, v22

    .line 272
    .line 273
    if-eqz v1, :cond_12

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_12
    move-wide/from16 v11, v24

    .line 277
    .line 278
    :goto_9
    iput-wide v11, v0, Lyyds/ᛸᛸᛲᲇ;->ᛶᛷᛲᲁ:J

    .line 279
    .line 280
    const/4 v9, 0x0

    .line 281
    return-object v9
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲈᲁᛷᛱ;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲈᛵᛷ(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object p0, p0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛲᛷᛸᛵ;->ᛱᲈᲁ:Lyyds/ᛷᲇᲀᛳ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᛷᛸᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛷᲇᲀᛳ;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lyyds/ᲈᲁᛷᛱ;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᲈᲁᛷᛱ;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v1}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lyyds/ᲈᲁᛷᛱ;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lyyds/ᲈᲁᛷᛱ;

    .line 44
    .line 45
    return-object p0
.end method

.method public final ᛲᲈᲁ(Z)Lyyds/ᲈᲁᛷᛱ;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    iget-object v3, v0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/4 v9, 0x1

    .line 9
    iget-object v11, v0, Lyyds/ᛸᛸᛲᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛵᛲ;

    .line 10
    .line 11
    if-ne v1, v9, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    const-wide v6, 0x7ffffc0000000000L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v6, v4

    .line 27
    const/16 v2, 0x2a

    .line 28
    .line 29
    shr-long/2addr v6, v2

    .line 30
    long-to-int v2, v6

    .line 31
    if-nez v2, :cond_b

    .line 32
    .line 33
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-wide v1, Lyyds/ᛴᲈᛵᛲ;->ᲇᲇᲇᛱ:J

    .line 37
    .line 38
    :goto_0
    sget-object v4, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 39
    .line 40
    invoke-virtual {v4, v11, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v14, v5

    .line 45
    check-cast v14, Lyyds/ᲈᲁᛷᛱ;

    .line 46
    .line 47
    if-nez v14, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-boolean v5, v14, Lyyds/ᲈᲁᛷᛱ;->ᲇᲈᛵᛷ:Z

    .line 51
    .line 52
    if-ne v5, v9, :cond_5

    .line 53
    .line 54
    :cond_3
    sget-object v10, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 55
    .line 56
    sget-wide v12, Lyyds/ᛴᲈᛵᛲ;->ᲇᲇᲇᛱ:J

    .line 57
    .line 58
    const/4 v15, 0x0

    .line 59
    invoke-virtual/range {v10 .. v15}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    move-object v8, v14

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {v10, v11, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-eq v4, v14, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    :goto_1
    sget-wide v1, Lyyds/ᛴᲈᛵᛲ;->ᛲᛴᛳᛲ:J

    .line 75
    .line 76
    invoke-virtual {v4, v11, v1, v2}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    sget-wide v5, Lyyds/ᛴᲈᛵᛲ;->ᛶᛷᛲᲁ:J

    .line 81
    .line 82
    invoke-virtual {v4, v11, v5, v6}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :cond_6
    if-eq v1, v2, :cond_8

    .line 87
    .line 88
    sget-object v4, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 89
    .line 90
    sget-wide v5, Lyyds/ᛴᲈᛵᛲ;->ᲇᲈᛵᛷ:J

    .line 91
    .line 92
    invoke-virtual {v4, v11, v5, v6}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_7

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    add-int/lit8 v2, v2, -0x1

    .line 100
    .line 101
    invoke-virtual {v11, v2, v9}, Lyyds/ᛴᲈᛵᛲ;->ᲀᛲᛳᲀ(IZ)Lyyds/ᲈᲁᛷᛱ;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    move-object v8, v4

    .line 108
    :cond_8
    :goto_2
    if-nez v8, :cond_a

    .line 109
    .line 110
    iget-object v1, v3, Lyyds/ᛲᛷᛸᛵ;->ᛱᲈᲁ:Lyyds/ᛷᲇᲀᛳ;

    .line 111
    .line 112
    invoke-virtual {v1}, Lyyds/ᛲᲈᛳ;->ᲇᲈᛵᛷ()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lyyds/ᲈᲁᛷᛱ;

    .line 117
    .line 118
    if-nez v1, :cond_9

    .line 119
    .line 120
    invoke-virtual {v0, v9}, Lyyds/ᛸᛸᛲᲇ;->ᛲᛳᛶᲁ(I)Lyyds/ᲈᲁᛷᛱ;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_9
    return-object v1

    .line 126
    :cond_a
    return-object v8

    .line 127
    :cond_b
    const-wide v6, 0x40000000000L

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    sub-long v6, v4, v6

    .line 133
    .line 134
    sget-object v2, Lyyds/ᛲᛷᛸᛵ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 135
    .line 136
    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_1

    .line 141
    .line 142
    iput v9, v0, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ:I

    .line 143
    .line 144
    :goto_3
    if-eqz p1, :cond_10

    .line 145
    .line 146
    iget v1, v3, Lyyds/ᛲᛷᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 147
    .line 148
    mul-int/lit8 v1, v1, 0x2

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lyyds/ᛸᛸᛲᲇ;->ᲇᲈᛵᛷ(I)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_c

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_c
    const/4 v9, 0x0

    .line 158
    :goto_4
    if-eqz v9, :cond_d

    .line 159
    .line 160
    invoke-virtual {v0}, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ()Lyyds/ᲈᲁᛷᛱ;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_d

    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_d
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 171
    .line 172
    sget-wide v2, Lyyds/ᛴᲈᛵᛲ;->ᲇᲇᲇᛱ:J

    .line 173
    .line 174
    invoke-virtual {v1, v11, v2, v3, v8}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lyyds/ᲈᲁᛷᛱ;

    .line 179
    .line 180
    if-nez v1, :cond_e

    .line 181
    .line 182
    invoke-virtual {v11}, Lyyds/ᛴᲈᛵᛲ;->ᛵᛸᛸᛷ()Lyyds/ᲈᲁᛷᛱ;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :cond_e
    if-eqz v1, :cond_f

    .line 187
    .line 188
    return-object v1

    .line 189
    :cond_f
    if-nez v9, :cond_11

    .line 190
    .line 191
    invoke-virtual {v0}, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ()Lyyds/ᲈᲁᛷᛱ;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-eqz v1, :cond_11

    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_10
    invoke-virtual {v0}, Lyyds/ᛸᛸᛲᲇ;->ᛲᛴᛳᛲ()Lyyds/ᲈᲁᛷᛱ;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_11

    .line 203
    .line 204
    return-object v1

    .line 205
    :cond_11
    const/4 v1, 0x3

    .line 206
    invoke-virtual {v0, v1}, Lyyds/ᛸᛸᛲᲇ;->ᛲᛳᛶᲁ(I)Lyyds/ᲈᲁᛷᛱ;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛸᛸᛲᲇ;->indexInArray:I

    .line 2
    .line 3
    return p0
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛸᛲᲇ;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᛸᛸᛲᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᛸᛵ;

    .line 7
    .line 8
    iget-object v1, v1, Lyyds/ᛲᛷᛸᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lyyds/ᛸᛸᛲᲇ;->indexInArray:I

    .line 38
    .line 39
    return-void
.end method

.method public final ᲇᲈᛵᛷ(I)I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lyyds/ᛸᛸᛲᲇ;->ᛱᲈᲁ:I

    .line 13
    .line 14
    add-int/lit8 p0, p1, -0x1

    .line 15
    .line 16
    and-int v1, p0, p1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    and-int/2addr p0, v0

    .line 21
    return p0

    .line 22
    :cond_0
    const p0, 0x7fffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p0, v0

    .line 26
    rem-int/2addr p0, p1

    .line 27
    return p0
.end method
