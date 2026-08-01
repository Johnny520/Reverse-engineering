.class public final Lxhss/ᛴᛱᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;


# static fields
.field public static final ᛷᲁᲁ:Lxhss/ᛶᛲᛷᛵ;

.field public static final synthetic ᛸᛲᲀᛵ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _isTerminated$volatile:I

.field private volatile synthetic controlState$volatile:J

.field private volatile synthetic parkedWorkersStack$volatile:J

.field public final ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

.field public final ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

.field public final ᲇᛴᲇᛵ:J

.field public final ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "parkedWorkersStack$volatile"

    .line 2
    .line 3
    const-class v1, Lxhss/ᛴᛱᲀᛴ;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 10
    .line 11
    const-string v0, "controlState$volatile"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "_isTerminated$volatile"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lxhss/ᛴᛱᲀᛴ;->ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 26
    .line 27
    new-instance v0, Lxhss/ᛶᛲᛷᛵ;

    .line 28
    .line 29
    const-string v1, "NOT_IN_STACK"

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v0, v1, v2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛷᲁᲁ:Lxhss/ᛶᛲᛷᛵ;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ:I

    .line 5
    .line 6
    iput p5, p0, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    iput-wide p1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛴᲇᛵ:J

    .line 9
    .line 10
    iput-object p3, p0, Lxhss/ᛴᛱᲀᛴ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-lt p4, p3, :cond_3

    .line 15
    .line 16
    const-string p3, "Max pool size "

    .line 17
    .line 18
    if-lt p5, p4, :cond_2

    .line 19
    .line 20
    const v1, 0x1ffffe

    .line 21
    .line 22
    .line 23
    if-gt p5, v1, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x0

    .line 26
    .line 27
    cmp-long p3, p1, v0

    .line 28
    .line 29
    if-lez p3, :cond_0

    .line 30
    .line 31
    new-instance p1, Lxhss/ᛷᲈᛲᲀ;

    .line 32
    .line 33
    invoke-direct {p1}, Lxhss/ᲀᛳᛲᲈ;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;

    .line 37
    .line 38
    new-instance p1, Lxhss/ᛷᲈᛲᲀ;

    .line 39
    .line 40
    invoke-direct {p1}, Lxhss/ᲀᛳᛲᲈ;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 44
    .line 45
    new-instance p1, Lxhss/ᛱᛷᛳᛴ;

    .line 46
    .line 47
    add-int/lit8 p2, p4, 0x1

    .line 48
    .line 49
    mul-int/lit8 p2, p2, 0x2

    .line 50
    .line 51
    invoke-direct {p1, p2}, Lxhss/ᛱᛷᛳᛴ;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 55
    .line 56
    int-to-long p1, p4

    .line 57
    const/16 p3, 0x2a

    .line 58
    .line 59
    shl-long/2addr p1, p3

    .line 60
    iput-wide p1, p0, Lxhss/ᛴᛱᲀᛴ;->controlState$volatile:J

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    iput p1, p0, Lxhss/ᛴᛱᲀᛴ;->_isTerminated$volatile:I

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string p3, "Idle worker keep alive time "

    .line 69
    .line 70
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, " must be positive"

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_1
    const-string p0, " should not exceed maximal supported number of threads 2097150"

    .line 96
    .line 97
    invoke-static {p3, p5, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛷᲈᲈ(Ljava/lang/String;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    const-string p0, " should be greater than or equals to core pool size "

    .line 102
    .line 103
    invoke-static {p5, p4, p3, p0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_3
    const-string p0, "Core pool size "

    .line 112
    .line 113
    const-string p1, " should be at least 1"

    .line 114
    .line 115
    invoke-static {p0, p4, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛷᲈᲈ(Ljava/lang/String;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 10

    .line 1
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Lxhss/ᛷᛴᛵᛶ;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lxhss/ᛷᛴᛵᛶ;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v0, v3

    .line 25
    :goto_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v1, v0, Lxhss/ᛷᛴᛵᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛴᛱᲀᛴ;

    .line 28
    .line 29
    if-eq v1, p0, :cond_3

    .line 30
    .line 31
    :cond_2
    move-object v0, v3

    .line 32
    :cond_3
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v4, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 36
    .line 37
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    const-wide/32 v6, 0x1fffff

    .line 42
    .line 43
    .line 44
    and-long/2addr v4, v6

    .line 45
    long-to-int v4, v4

    .line 46
    monitor-exit v1

    .line 47
    if-gt v2, v4, :cond_8

    .line 48
    .line 49
    move v1, v2

    .line 50
    :goto_1
    iget-object v5, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 51
    .line 52
    invoke-virtual {v5, v1}, Lxhss/ᛱᛷᛳᛴ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lxhss/ᛷᛴᛵᛶ;

    .line 57
    .line 58
    if-eq v5, v0, :cond_7

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    sget-object v7, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 65
    .line 66
    if-eq v6, v7, :cond_4

    .line 67
    .line 68
    invoke-static {v5}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 69
    .line 70
    .line 71
    const-wide/16 v6, 0x2710

    .line 72
    .line 73
    invoke-virtual {v5, v6, v7}, Ljava/lang/Thread;->join(J)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iget-object v5, v5, Lxhss/ᛷᛴᛵᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛸᲈᛸ;

    .line 78
    .line 79
    iget-object v6, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v7, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 85
    .line 86
    sget-wide v8, Lxhss/ᛴᛸᲈᛸ;->ᲇᛶᛴᲀ:J

    .line 87
    .line 88
    invoke-virtual {v7, v5, v8, v9, v3}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Lxhss/ᛲᛲᛲᛲ;

    .line 93
    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Lxhss/ᲀᛳᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_3
    invoke-virtual {v5}, Lxhss/ᛴᛸᲈᛸ;->ᛱᛱᛲᲇ()Lxhss/ᛲᛲᛲᛲ;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    if-nez v7, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    invoke-virtual {v6, v7}, Lxhss/ᲀᛳᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    :goto_4
    if-eq v1, v4, :cond_8

    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_8
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 116
    .line 117
    invoke-virtual {v1}, Lxhss/ᲀᛳᛲᲈ;->ᛱᛱᛲᲇ()V

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;

    .line 121
    .line 122
    invoke-virtual {v1}, Lxhss/ᲀᛳᛲᲈ;->ᛱᛱᛲᲇ()V

    .line 123
    .line 124
    .line 125
    :goto_5
    if-eqz v0, :cond_9

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lxhss/ᛷᛴᛵᛶ;->ᛷᛵᛵᲈ(Z)Lxhss/ᛲᛲᛲᛲ;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-nez v1, :cond_b

    .line 132
    .line 133
    :cond_9
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;

    .line 134
    .line 135
    invoke-virtual {v1}, Lxhss/ᲀᛳᛲᲈ;->ᲇᛴᲇᛵ()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lxhss/ᛲᛲᛲᛲ;

    .line 140
    .line 141
    if-nez v1, :cond_b

    .line 142
    .line 143
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 144
    .line 145
    invoke-virtual {v1}, Lxhss/ᲀᛳᛲᲈ;->ᲇᛴᲇᛵ()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Lxhss/ᛲᛲᛲᛲ;

    .line 150
    .line 151
    if-nez v1, :cond_b

    .line 152
    .line 153
    if-eqz v0, :cond_a

    .line 154
    .line 155
    const/4 v1, 0x5

    .line 156
    invoke-virtual {v0, v1}, Lxhss/ᛷᛴᛵᛶ;->ᛸᛴᛶᛳ(I)Z

    .line 157
    .line 158
    .line 159
    :cond_a
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 160
    .line 161
    const-wide/16 v1, 0x0

    .line 162
    .line 163
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 167
    .line 168
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_b
    :try_start_1
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :catchall_0
    move-exception v1

    .line 177
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-interface {v4, v3, v1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_1
    move-exception p0

    .line 190
    monitor-exit v1

    .line 191
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Runnable;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 7
    .line 8
    invoke-virtual {v1}, Lxhss/ᛱᛷᛳᛴ;->ᛷᛵᛵᲈ()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    move v5, v3

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    move v8, v7

    .line 18
    move v9, v4

    .line 19
    :goto_0
    if-ge v9, v2, :cond_8

    .line 20
    .line 21
    invoke-virtual {v1, v9}, Lxhss/ᛱᛷᛳᛴ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    check-cast v10, Lxhss/ᛷᛴᛵᛶ;

    .line 26
    .line 27
    if-nez v10, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    iget-object v11, v10, Lxhss/ᛷᛴᛵᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛸᲈᛸ;

    .line 32
    .line 33
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v12, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 37
    .line 38
    sget-wide v13, Lxhss/ᛴᛸᲈᛸ;->ᲇᛶᛴᲀ:J

    .line 39
    .line 40
    invoke-virtual {v12, v11, v13, v14}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    invoke-virtual {v11}, Lxhss/ᛴᛸᲈᛸ;->ᛷᛵᛵᲈ()I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v12, :cond_1

    .line 49
    .line 50
    add-int/2addr v11, v4

    .line 51
    :cond_1
    iget v10, v10, Lxhss/ᛷᛴᛵᛶ;->ᲇᛴᲇᛵ:I

    .line 52
    .line 53
    invoke-static {v10}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_6

    .line 58
    .line 59
    if-eq v10, v4, :cond_5

    .line 60
    .line 61
    const/4 v12, 0x2

    .line 62
    if-eq v10, v12, :cond_4

    .line 63
    .line 64
    const/4 v12, 0x3

    .line 65
    if-eq v10, v12, :cond_3

    .line 66
    .line 67
    const/4 v11, 0x4

    .line 68
    if-ne v10, v11, :cond_2

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance p0, Lxhss/ᛵᛲᛲᲇ;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    if-lez v11, :cond_7

    .line 82
    .line 83
    new-instance v10, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v11, 0x64

    .line 92
    .line 93
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    new-instance v10, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const/16 v11, 0x62

    .line 118
    .line 119
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 131
    .line 132
    new-instance v10, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const/16 v11, 0x63

    .line 141
    .line 142
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_7
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_8
    sget-object v1, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 157
    .line 158
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v1

    .line 162
    new-instance v4, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    iget-object v9, p0, Lxhss/ᛴᛱᲀᛴ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const/16 v9, 0x40

    .line 173
    .line 174
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v9, "[Pool Size {core = "

    .line 185
    .line 186
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget v9, p0, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ:I

    .line 190
    .line 191
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v10, ", max = "

    .line 195
    .line 196
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget v10, p0, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ:I

    .line 200
    .line 201
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v10, "}, Worker States {CPU = "

    .line 205
    .line 206
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v3, ", blocking = "

    .line 213
    .line 214
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v3, ", parked = "

    .line 221
    .line 222
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v3, ", dormant = "

    .line 229
    .line 230
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v3, ", terminated = "

    .line 237
    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v3, "}, running workers queues = "

    .line 245
    .line 246
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, ", global CPU queue size = "

    .line 253
    .line 254
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v0, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;

    .line 258
    .line 259
    invoke-virtual {v0}, Lxhss/ᲀᛳᛲᲈ;->ᛳᲁᲇᛸ()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v0, ", global blocking queue size = "

    .line 267
    .line 268
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget-object p0, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 272
    .line 273
    invoke-virtual {p0}, Lxhss/ᲀᛳᛲᲈ;->ᛳᲁᲇᛸ()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string p0, ", Control State {created workers= "

    .line 281
    .line 282
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-wide/32 v5, 0x1fffff

    .line 286
    .line 287
    .line 288
    and-long/2addr v5, v1

    .line 289
    long-to-int p0, v5

    .line 290
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string p0, ", blocking tasks = "

    .line 294
    .line 295
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-wide v5, 0x3ffffe00000L

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    and-long/2addr v5, v1

    .line 304
    const/16 p0, 0x15

    .line 305
    .line 306
    shr-long/2addr v5, p0

    .line 307
    long-to-int p0, v5

    .line 308
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p0, ", CPUs acquired = "

    .line 312
    .line 313
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-wide v5, 0x7ffffc0000000000L

    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    and-long v0, v1, v5

    .line 322
    .line 323
    const/16 p0, 0x2a

    .line 324
    .line 325
    shr-long/2addr v0, p0

    .line 326
    long-to-int p0, v0

    .line 327
    sub-int/2addr v9, p0

    .line 328
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string p0, "}]"

    .line 332
    .line 333
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()I
    .locals 11

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lxhss/ᛴᛱᲀᛴ;->ᲈᛳᲀ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    const/4 p0, -0x1

    .line 21
    return p0

    .line 22
    :cond_1
    :try_start_1
    sget-object v1, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/32 v6, 0x1fffff

    .line 29
    .line 30
    .line 31
    and-long v8, v4, v6

    .line 32
    .line 33
    long-to-int v8, v8

    .line 34
    const-wide v9, 0x3ffffe00000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v4, v9

    .line 40
    const/16 v9, 0x15

    .line 41
    .line 42
    shr-long/2addr v4, v9

    .line 43
    long-to-int v4, v4

    .line 44
    sub-int v4, v8, v4

    .line 45
    .line 46
    if-gez v4, :cond_2

    .line 47
    .line 48
    move v4, v3

    .line 49
    :cond_2
    iget v5, p0, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    if-lt v4, v5, :cond_3

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return v3

    .line 55
    :cond_3
    :try_start_2
    iget v5, p0, Lxhss/ᛴᛱᲀᛴ;->ᛳᲁᲇᛸ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    if-lt v8, v5, :cond_4

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return v3

    .line 61
    :cond_4
    :try_start_3
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    and-long/2addr v8, v6

    .line 66
    long-to-int v3, v8

    .line 67
    add-int/2addr v3, v2

    .line 68
    if-lez v3, :cond_6

    .line 69
    .line 70
    iget-object v5, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 71
    .line 72
    invoke-virtual {v5, v3}, Lxhss/ᛱᛷᛳᛴ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_6

    .line 77
    .line 78
    new-instance v5, Lxhss/ᛷᛴᛵᛶ;

    .line 79
    .line 80
    invoke-direct {v5, p0, v3}, Lxhss/ᛷᛴᛵᛶ;-><init>(Lxhss/ᛴᛱᲀᛴ;I)V

    .line 81
    .line 82
    .line 83
    iget-object v8, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 84
    .line 85
    invoke-virtual {v8, v3, v5}, Lxhss/ᛱᛷᛳᛴ;->ᛳᲁᲇᛸ(ILxhss/ᛷᛴᛵᛶ;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    and-long/2addr v6, v8

    .line 93
    long-to-int p0, v6

    .line 94
    if-ne v3, p0, :cond_5

    .line 95
    .line 96
    add-int/2addr v4, v2

    .line 97
    monitor-exit v0

    .line 98
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 99
    .line 100
    .line 101
    return v4

    .line 102
    :cond_5
    :try_start_4
    const-string p0, "Failed requirement."

    .line 103
    .line 104
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    goto :goto_1

    .line 112
    :cond_6
    const-string p0, "Failed requirement."

    .line 113
    .line 114
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 120
    :goto_1
    monitor-exit v0

    .line 121
    throw p0
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/Runnable;Z)V
    .locals 10

    .line 1
    sget-object v0, Lxhss/ᛷᛶᛲᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    instance-of v2, p1, Lxhss/ᛲᛲᛲᛲ;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast p1, Lxhss/ᛲᛲᛲᛲ;

    .line 15
    .line 16
    iput-wide v0, p1, Lxhss/ᛲᛲᛲᛲ;->ᛱᛱᛲᲇ:J

    .line 17
    .line 18
    iput-boolean p2, p1, Lxhss/ᛲᛲᛲᛲ;->ᛳᲁᲇᛸ:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v2, Lxhss/ᲁᛳᲈᲁ;

    .line 22
    .line 23
    invoke-direct {v2, p1, v0, v1, p2}, Lxhss/ᲁᛳᲈᲁ;-><init>(Ljava/lang/Runnable;JZ)V

    .line 24
    .line 25
    .line 26
    move-object p1, v2

    .line 27
    :goto_0
    iget-boolean p2, p1, Lxhss/ᛲᛲᛲᛲ;->ᛳᲁᲇᛸ:Z

    .line 28
    .line 29
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const-wide/32 v1, 0x200000

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v4, v3, Lxhss/ᛷᛴᛵᛶ;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    check-cast v3, Lxhss/ᛷᛴᛵᛶ;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v5

    .line 56
    :goto_2
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-object v4, v3, Lxhss/ᛷᛴᛵᛶ;->ᛸᛲᲀᛵ:Lxhss/ᛴᛱᲀᛴ;

    .line 59
    .line 60
    if-eq v4, p0, :cond_4

    .line 61
    .line 62
    :cond_3
    move-object v3, v5

    .line 63
    :cond_4
    if-nez v3, :cond_5

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_5
    iget v4, v3, Lxhss/ᛷᛴᛵᛶ;->ᲇᛴᲇᛵ:I

    .line 67
    .line 68
    const/4 v6, 0x5

    .line 69
    if-ne v4, v6, :cond_6

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_6
    iget-boolean v6, p1, Lxhss/ᛲᛲᛲᛲ;->ᛳᲁᲇᛸ:Z

    .line 73
    .line 74
    if-nez v6, :cond_7

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    if-ne v4, v6, :cond_7

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    const/4 v4, 0x1

    .line 81
    iput-boolean v4, v3, Lxhss/ᛷᛴᛵᛶ;->ᛸᛴᛶᛳ:Z

    .line 82
    .line 83
    iget-object v3, v3, Lxhss/ᛷᛴᛵᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛸᲈᛸ;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v4, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 89
    .line 90
    sget-wide v6, Lxhss/ᛴᛸᲈᛸ;->ᲇᛶᛴᲀ:J

    .line 91
    .line 92
    invoke-virtual {v4, v3, v6, v7, p1}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lxhss/ᛲᛲᛲᛲ;

    .line 97
    .line 98
    if-nez p1, :cond_8

    .line 99
    .line 100
    :goto_3
    move-object p1, v5

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    iget-object v4, v3, Lxhss/ᛴᛸᲈᛸ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 103
    .line 104
    invoke-virtual {v3}, Lxhss/ᛴᛸᲈᛸ;->ᛷᛵᛵᲈ()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    const/16 v7, 0x7f

    .line 109
    .line 110
    if-ne v6, v7, :cond_9

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_9
    iget-boolean v6, p1, Lxhss/ᛲᛲᛲᛲ;->ᛳᲁᲇᛸ:Z

    .line 114
    .line 115
    if-eqz v6, :cond_a

    .line 116
    .line 117
    sget-object v6, Lxhss/ᛴᛸᲈᛸ;->ᛳᲁᲇᛸ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 118
    .line 119
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    :cond_a
    sget-object v6, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 123
    .line 124
    sget-wide v8, Lxhss/ᛴᛸᲈᛸ;->ᲀᲇᛳᲁ:J

    .line 125
    .line 126
    invoke-virtual {v6, v3, v8, v9}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    and-int/2addr v6, v7

    .line 131
    :goto_4
    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    if-eqz v7, :cond_b

    .line 136
    .line 137
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_b
    invoke-virtual {v4, v6, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lxhss/ᛴᛸᲈᛸ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 145
    .line 146
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :goto_5
    if-eqz p1, :cond_e

    .line 151
    .line 152
    iget-boolean v3, p1, Lxhss/ᛲᛲᛲᛲ;->ᛳᲁᲇᛸ:Z

    .line 153
    .line 154
    if-eqz v3, :cond_c

    .line 155
    .line 156
    iget-object v3, p0, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛷᲈᛲᲀ;

    .line 157
    .line 158
    invoke-virtual {v3, p1}, Lxhss/ᲀᛳᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    goto :goto_6

    .line 163
    :cond_c
    iget-object v3, p0, Lxhss/ᛴᛱᲀᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛷᲈᛲᲀ;

    .line 164
    .line 165
    invoke-virtual {v3, p1}, Lxhss/ᲀᛳᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    :goto_6
    if-eqz p1, :cond_d

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_d
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    .line 173
    .line 174
    new-instance p2, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lxhss/ᛴᛱᲀᛴ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, " was terminated"

    .line 185
    .line 186
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-direct {p1, p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_e
    :goto_7
    if-eqz p2, :cond_11

    .line 198
    .line 199
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_f

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_f
    invoke-virtual {p0, v1, v2}, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ(J)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_10

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_10
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ()Z

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_11
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ()Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_12

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 225
    .line 226
    .line 227
    move-result-wide p1

    .line 228
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᛱᲀᛴ;->ᲀᲇᛳᲁ(J)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_13

    .line 233
    .line 234
    :goto_8
    return-void

    .line 235
    :cond_13
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ()Z

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final ᛸᛲᲀᛵ()Z
    .locals 13

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const-wide/32 v4, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v4, v2

    .line 11
    long-to-int v1, v4

    .line 12
    iget-object v4, p0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛴᛶᛳ:Lxhss/ᛱᛷᛳᛴ;

    .line 13
    .line 14
    invoke-virtual {v4, v1}, Lxhss/ᛱᛷᛳᛴ;->ᛱᛱᛲᲇ(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v6, v1

    .line 19
    check-cast v6, Lxhss/ᛷᛴᛵᛶ;

    .line 20
    .line 21
    const/4 v7, -0x1

    .line 22
    const/4 v8, 0x0

    .line 23
    if-nez v6, :cond_1

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v0, p0

    .line 27
    goto :goto_3

    .line 28
    :cond_1
    const-wide/32 v4, 0x200000

    .line 29
    .line 30
    .line 31
    add-long/2addr v4, v2

    .line 32
    const-wide/32 v9, -0x200000

    .line 33
    .line 34
    .line 35
    and-long/2addr v4, v9

    .line 36
    invoke-virtual {v6}, Lxhss/ᛷᛴᛵᛶ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_1
    sget-object v9, Lxhss/ᛴᛱᲀᛴ;->ᛷᲁᲁ:Lxhss/ᛶᛲᛷᛵ;

    .line 41
    .line 42
    if-ne v1, v9, :cond_2

    .line 43
    .line 44
    move v10, v7

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    if-nez v1, :cond_3

    .line 47
    .line 48
    move v10, v8

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    check-cast v1, Lxhss/ᛷᛴᛵᛶ;

    .line 51
    .line 52
    invoke-virtual {v1}, Lxhss/ᛷᛴᛵᛶ;->ᛱᛱᛲᲇ()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_6

    .line 57
    .line 58
    :goto_2
    if-ltz v10, :cond_0

    .line 59
    .line 60
    int-to-long v10, v10

    .line 61
    or-long/2addr v4, v10

    .line 62
    move-object v1, p0

    .line 63
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    move-object v0, v1

    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    invoke-virtual {v6, v9}, Lxhss/ᛷᛴᛵᛶ;->ᲀᲇᛳᲁ(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_3
    if-nez v6, :cond_4

    .line 74
    .line 75
    return v8

    .line 76
    :cond_4
    sget-object p0, Lxhss/ᛷᛴᛵᛶ;->ᛸᛷᲈᲈ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 77
    .line 78
    invoke-virtual {p0, v6, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_5

    .line 83
    .line 84
    invoke-static {v6}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :cond_5
    move-object p0, v0

    .line 90
    goto :goto_0

    .line 91
    :cond_6
    move-object v12, v0

    .line 92
    move-object v0, p0

    .line 93
    move-object p0, v12

    .line 94
    invoke-virtual {v1}, Lxhss/ᛷᛴᛵᛶ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move-object v12, v0

    .line 99
    move-object v0, p0

    .line 100
    move-object p0, v12

    .line 101
    goto :goto_1
.end method

.method public final ᲀᲇᛳᲁ(J)Z
    .locals 3

    .line 1
    const-wide/32 v0, 0x1fffff

    .line 2
    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0x3ffffe00000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    shr-long/2addr p1, v1

    .line 15
    long-to-int p1, p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 p1, 0x0

    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    move v0, p1

    .line 21
    :cond_0
    iget p2, p0, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ:I

    .line 22
    .line 23
    if-ge v0, p2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    if-le p2, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lxhss/ᛴᛱᲀᛴ;->ᛱᛱᛲᲇ()I

    .line 35
    .line 36
    .line 37
    :cond_1
    if-lez v0, :cond_2

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    return p1
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᛷᛴᛵᛶ;II)V
    .locals 8

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Lxhss/ᛴᛱᲀᛴ;->ᛸᛲᲀᛵ:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const-wide/32 v4, 0x1fffff

    .line 8
    .line 9
    .line 10
    and-long/2addr v4, v2

    .line 11
    long-to-int v1, v4

    .line 12
    const-wide/32 v4, 0x200000

    .line 13
    .line 14
    .line 15
    add-long/2addr v4, v2

    .line 16
    const-wide/32 v6, -0x200000

    .line 17
    .line 18
    .line 19
    and-long/2addr v4, v6

    .line 20
    if-ne v1, p2, :cond_5

    .line 21
    .line 22
    if-nez p3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Lxhss/ᛷᛴᛵᛶ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_1
    sget-object v6, Lxhss/ᛴᛱᲀᛴ;->ᛷᲁᲁ:Lxhss/ᛶᛲᛷᛵ;

    .line 29
    .line 30
    if-ne v1, v6, :cond_1

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    if-nez v1, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    check-cast v1, Lxhss/ᛷᛴᛵᛶ;

    .line 39
    .line 40
    invoke-virtual {v1}, Lxhss/ᛷᛴᛵᛶ;->ᛱᛱᛲᲇ()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    move v1, v6

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-virtual {v1}, Lxhss/ᛷᛴᛵᛶ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move v1, p3

    .line 54
    :cond_5
    :goto_2
    if-ltz v1, :cond_0

    .line 55
    .line 56
    int-to-long v6, v1

    .line 57
    or-long/2addr v4, v6

    .line 58
    move-object v1, p0

    .line 59
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    return-void

    .line 66
    :cond_6
    move-object p0, v1

    .line 67
    goto :goto_0
.end method
