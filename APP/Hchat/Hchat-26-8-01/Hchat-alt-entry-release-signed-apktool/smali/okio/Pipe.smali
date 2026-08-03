.class public final Lokio/Pipe;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final buffer:Lokio/Buffer;

.field private canceled:Z

.field private final condition:Ljava/util/concurrent/locks/Condition;

.field private foldedSink:Lokio/Sink;

.field private final lock:Ljava/util/concurrent/locks/ReentrantLock;

.field private final maxBufferSize:J

.field private final sink:Lokio/Sink;

.field private sinkClosed:Z

.field private final source:Lokio/Source;

.field private sourceClosed:Z


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lokio/Pipe;->maxBufferSize:J

    .line 5
    .line 6
    new-instance v0, Lokio/Buffer;

    .line 7
    .line 8
    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lokio/Pipe;->buffer:Lokio/Buffer;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lokio/Pipe;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lokio/Pipe;->condition:Ljava/util/concurrent/locks/Condition;

    .line 28
    .line 29
    const-wide/16 v0, 0x1

    .line 30
    .line 31
    cmp-long v0, p1, v0

    .line 32
    .line 33
    if-ltz v0, :cond_0

    .line 34
    .line 35
    new-instance p1, Lokio/Pipe$sink$1;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Lokio/Pipe$sink$1;-><init>(Lokio/Pipe;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lokio/Pipe;->sink:Lokio/Sink;

    .line 41
    .line 42
    new-instance p1, Lokio/Pipe$source$1;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lokio/Pipe$source$1;-><init>(Lokio/Pipe;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lokio/Pipe;->source:Lokio/Source;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string v0, "maxBufferSize < 1: "

    .line 51
    .line 52
    invoke-static {p1, p2, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    throw p1
.end method

.method private final forward(Lokio/Sink;Lfg/l;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Sink;",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lokio/Pipe;->sink()Lokio/Sink;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Lokio/Sink;->timeout()Lokio/Timeout;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lokio/Timeout;->timeoutNanos()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sget-object v4, Lokio/Timeout;->Companion:Lokio/Timeout$Companion;

    .line 18
    .line 19
    invoke-virtual {v1}, Lokio/Timeout;->timeoutNanos()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    invoke-virtual {v0}, Lokio/Timeout;->timeoutNanos()J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    invoke-virtual {v4, v5, v6, v7, v8}, Lokio/Timeout$Companion;->minTimeout(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    invoke-virtual {v0, v4, v5, v6}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lokio/Timeout;->hasDeadline()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Lokio/Timeout;->deadlineNanoTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Lokio/Timeout;->deadlineNanoTime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-virtual {v1}, Lokio/Timeout;->deadlineNanoTime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    invoke-virtual {v0, v7, v8}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 65
    .line 66
    .line 67
    :cond_0
    :try_start_0
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2, v3, v6}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0, v4, v5}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    invoke-virtual {v0, v2, v3, v6}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0, v4, v5}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 94
    .line 95
    .line 96
    :cond_2
    throw p1

    .line 97
    :cond_3
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-virtual {v1}, Lokio/Timeout;->deadlineNanoTime()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    invoke-virtual {v0, v4, v5}, Lokio/Timeout;->deadlineNanoTime(J)Lokio/Timeout;

    .line 108
    .line 109
    .line 110
    :cond_4
    :try_start_1
    invoke-interface {p2, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2, v3, v6}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    invoke-virtual {v0}, Lokio/Timeout;->clearDeadline()Lokio/Timeout;

    .line 123
    .line 124
    .line 125
    :cond_5
    return-void

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    invoke-virtual {v0, v2, v3, v6}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lokio/Timeout;->hasDeadline()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    invoke-virtual {v0}, Lokio/Timeout;->clearDeadline()Lokio/Timeout;

    .line 137
    .line 138
    .line 139
    :cond_6
    throw p1
.end method


# virtual methods
.method public final -deprecated_sink()Lokio/Sink;
    .locals 1
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lokio/Pipe;->sink:Lokio/Sink;

    .line 2
    .line 3
    return-object v0
.end method

.method public final -deprecated_source()Lokio/Source;
    .locals 1
    .annotation runtime Lsf/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lokio/Pipe;->source:Lokio/Source;

    .line 2
    .line 3
    return-object v0
.end method

.method public final cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lokio/Pipe;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Lokio/Pipe;->canceled:Z

    .line 8
    .line 9
    iget-object v1, p0, Lokio/Pipe;->buffer:Lokio/Buffer;

    .line 10
    .line 11
    invoke-virtual {v1}, Lokio/Buffer;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lokio/Pipe;->condition:Ljava/util/concurrent/locks/Condition;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw v1
.end method

.method public final fold(Lokio/Sink;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Lokio/Pipe;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lokio/Pipe;->foldedSink:Lokio/Sink;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    iget-boolean v1, p0, Lokio/Pipe;->canceled:Z

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lokio/Pipe;->buffer:Lokio/Buffer;

    .line 18
    .line 19
    invoke-virtual {v1}, Lokio/Buffer;->exhausted()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iput-boolean v2, p0, Lokio/Pipe;->sourceClosed:Z

    .line 27
    .line 28
    iput-object p1, p0, Lokio/Pipe;->foldedSink:Lokio/Sink;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lokio/Pipe;->sinkClosed:Z

    .line 37
    .line 38
    new-instance v3, Lokio/Buffer;

    .line 39
    .line 40
    invoke-direct {v3}, Lokio/Buffer;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lokio/Pipe;->buffer:Lokio/Buffer;

    .line 44
    .line 45
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v3, v4, v5, v6}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 50
    .line 51
    .line 52
    iget-object v4, p0, Lokio/Pipe;->condition:Ljava/util/concurrent/locks/Condition;

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v3}, Lokio/Buffer;->size()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-interface {p1, v3, v4, v5}, Lokio/Sink;->write(Lokio/Buffer;J)V

    .line 65
    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-interface {p1}, Lokio/Sink;->close()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-interface {p1}, Lokio/Sink;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :goto_1
    iget-object v0, p0, Lokio/Pipe;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 82
    .line 83
    .line 84
    :try_start_3
    iput-boolean v2, p0, Lokio/Pipe;->sourceClosed:Z

    .line 85
    .line 86
    iget-object v1, p0, Lokio/Pipe;->condition:Ljava/util/concurrent/locks/Condition;

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :catchall_2
    move-exception p1

    .line 96
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_2
    :try_start_4
    iput-object p1, p0, Lokio/Pipe;->foldedSink:Lokio/Sink;

    .line 101
    .line 102
    new-instance p1, Ljava/io/IOException;

    .line 103
    .line 104
    const-string v1, "canceled"

    .line 105
    .line 106
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_3
    const-string p1, "sink already folded"

    .line 111
    .line 112
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final getBuffer$okio()Lokio/Buffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->buffer:Lokio/Buffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCanceled$okio()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/Pipe;->canceled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCondition()Ljava/util/concurrent/locks/Condition;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->condition:Ljava/util/concurrent/locks/Condition;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFoldedSink$okio()Lokio/Sink;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->foldedSink:Lokio/Sink;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLock()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaxBufferSize$okio()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokio/Pipe;->maxBufferSize:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSinkClosed$okio()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/Pipe;->sinkClosed:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSourceClosed$okio()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokio/Pipe;->sourceClosed:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setCanceled$okio(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokio/Pipe;->canceled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFoldedSink$okio(Lokio/Sink;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokio/Pipe;->foldedSink:Lokio/Sink;

    .line 2
    .line 3
    return-void
.end method

.method public final setSinkClosed$okio(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokio/Pipe;->sinkClosed:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSourceClosed$okio(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokio/Pipe;->sourceClosed:Z

    .line 2
    .line 3
    return-void
.end method

.method public final sink()Lokio/Sink;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->sink:Lokio/Sink;

    .line 2
    .line 3
    return-object v0
.end method

.method public final source()Lokio/Source;
    .locals 1

    .line 1
    iget-object v0, p0, Lokio/Pipe;->source:Lokio/Source;

    .line 2
    .line 3
    return-object v0
.end method
