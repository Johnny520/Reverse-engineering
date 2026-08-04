.class public final Lyyds/ᲈᲀᛱᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᛱᛳᲇ:Z

.field public final ᛱᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᛲᛲᲈᲈ:Lyyds/ᲀᲇᛶᲇ;

.field public ᛲᛳᛶᲁ:Landroid/util/CloseGuard;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲀᲈᲁᛵ;

.field public volatile ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

.field public ᛳᲁᲁᲇ:Z

.field public ᛵᛶᛲᲀ:Z

.field public ᛶᛳᛶᛵ:Z

.field public final ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛱᛶ;

.field public final ᛶᲈᛴᲈ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:Lyyds/ᛵᛱᲈᛳ;

.field public volatile ᲀᛲᛲᲇ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

.field public ᲇᛱᛲ:Z

.field public volatile ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲀᲁᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lyyds/ᲈᲀᛶᛳ;

    .line 2
    .line 3
    const-string v1, "\u1c87\u1c87\u1c87\u16f1"

    .line 4
    .line 5
    const-class v2, Lyyds/ᲈᲀᛱᛷ;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲁᲁ;

    .line 7
    .line 8
    iget-object v0, p1, Lyyds/ᛶᛲᛷ;->ᛱᛳᛶᛳ:Lyyds/ᛱᛱᛴ;

    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lyyds/ᲀᲈᲁᛵ;

    .line 13
    .line 14
    iput-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲈᲁᛵ;

    .line 15
    .line 16
    iget-object p1, p1, Lyyds/ᛶᛲᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲈᲈᛶ;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lyyds/ᲈᲀᛶᛳ;->ᛲᲈᲁ:Lyyds/ᲀᲈᲇᛳ;

    .line 22
    .line 23
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 24
    .line 25
    new-instance p1, Lyyds/ᲀᲀᛱᛶ;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lyyds/ᲀᲀᛱᛶ;-><init>(Lyyds/ᲈᲀᛱᛷ;)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lyyds/ᲈᲁᛴᛲ;->ᛶᛷᛲᲁ(J)Lyyds/ᲈᲁᛴᛲ;

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛱᛶ;

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z

    .line 46
    .line 47
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᲈᛴᲈ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    new-instance p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 55
    .line 56
    iget-object p1, p2, Lyyds/ᲀᲁᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲈᲀᛱᛷ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲁᲁ;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final ᛱᲈᲁ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lyyds/ᲈᲀᛱᛷ;->ᛵᛸᛸᛷ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    monitor-exit p0

    .line 39
    throw p1
.end method

.method public final ᛲᛳᛶᲁ()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, -0x1

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Ljava/lang/ref/Reference;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v5

    .line 40
    :goto_1
    const/4 v2, 0x0

    .line 41
    if-eq v3, v5, :cond_6

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    iput-wide v3, v0, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J

    .line 59
    .line 60
    iget-object p0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲀᲈᲁᛵ;

    .line 61
    .line 62
    iget-object v1, p0, Lyyds/ᲀᲈᲁᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 63
    .line 64
    sget-object v3, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 65
    .line 66
    iget-boolean v3, v0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    iget-object v0, p0, Lyyds/ᲀᲈᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛱᛳ;

    .line 71
    .line 72
    iget-object p0, p0, Lyyds/ᲀᲈᲁᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᲀᛷ;

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-virtual {v0, p0, v3, v4}, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛸ;J)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_2
    const/4 v2, 0x1

    .line 81
    iput-boolean v2, v0, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    iget-object p0, p0, Lyyds/ᲀᲈᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛱᛳ;

    .line 93
    .line 94
    iget-object v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 95
    .line 96
    monitor-enter v1

    .line 97
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    iget-object v2, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 104
    .line 105
    invoke-virtual {v2, p0}, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ(Lyyds/ᛱᛷᛱᛳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    :goto_2
    monitor-exit v1

    .line 112
    goto :goto_4

    .line 113
    :goto_3
    monitor-exit v1

    .line 114
    throw p0

    .line 115
    :cond_4
    :goto_4
    iget-object p0, v0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_5
    return-object v2

    .line 119
    :cond_6
    const-string p0, "Check failed."

    .line 120
    .line 121
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v2
.end method

.method public final ᛲᛴᛳᛲ(Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object p1, v2, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lyyds/ᲀᲇᲇᛵ;

    .line 16
    .line 17
    invoke-interface {p1}, Lyyds/ᲀᲇᲇᛵ;->cancel()V

    .line 18
    .line 19
    .line 20
    iget-object p1, v2, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Lyyds/ᲈᲀᛱᛷ;

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual/range {v1 .. v7}, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲇᛶᲇ;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛲᛲᲈᲈ:Lyyds/ᲀᲇᛶᲇ;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 38
    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛶᛷᛶᲈ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛲᛳᛶᲁ:Landroid/util/CloseGuard;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lyyds/ᛶᛷᛶᲈ;-><init>(Lyyds/ᲈᲀᛱᛷ;Landroid/util/CloseGuard;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Check failed."

    .line 23
    .line 24
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᲈᲀᛱᛷ;->ᛲᛳᛶᲁ()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Lyyds/ᛴᛲᛲᲇ;->ᲀᛲᛳᲀ(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string p0, "Check failed."

    .line 32
    .line 33
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0

    .line 40
    throw p0

    .line 41
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛵᲇᲀ:Z

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛱᛶ;

    .line 47
    .line 48
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    :goto_1
    move-object v0, p1

    .line 55
    goto :goto_2

    .line 56
    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 57
    .line 58
    const-string v1, "timeout"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    :cond_6
    :goto_2
    iget-object p0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 69
    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᲀᲇᛶᲇ;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    monitor-enter p0

    .line 12
    const/4 p1, 0x1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-boolean v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 17
    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 24
    .line 25
    iget-boolean v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 26
    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    :cond_2
    if-eqz p5, :cond_3

    .line 30
    .line 31
    iget-boolean v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 32
    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    :cond_3
    if-eqz p4, :cond_b

    .line 36
    .line 37
    iget-boolean v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 38
    .line 39
    if-eqz v1, :cond_b

    .line 40
    .line 41
    :cond_4
    if-eqz p2, :cond_5

    .line 42
    .line 43
    iput-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 44
    .line 45
    :cond_5
    if-eqz p3, :cond_6

    .line 46
    .line 47
    iput-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 48
    .line 49
    :cond_6
    if-eqz p5, :cond_7

    .line 50
    .line 51
    iput-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 52
    .line 53
    :cond_7
    if-eqz p4, :cond_8

    .line 54
    .line 55
    iput-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 56
    .line 57
    :cond_8
    iget-boolean p2, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 58
    .line 59
    if-nez p2, :cond_9

    .line 60
    .line 61
    iget-boolean p2, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 62
    .line 63
    if-nez p2, :cond_9

    .line 64
    .line 65
    iget-boolean p2, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 66
    .line 67
    if-nez p2, :cond_9

    .line 68
    .line 69
    iget-boolean p2, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 70
    .line 71
    if-nez p2, :cond_9

    .line 72
    .line 73
    move p2, p1

    .line 74
    goto :goto_1

    .line 75
    :cond_9
    move p2, v0

    .line 76
    :goto_1
    if-eqz p2, :cond_a

    .line 77
    .line 78
    iget-boolean p3, p0, Lyyds/ᲈᲀᛱᛷ;->ᛵᛶᛲᲀ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    if-nez p3, :cond_a

    .line 81
    .line 82
    move v0, p1

    .line 83
    :cond_a
    move v2, v0

    .line 84
    move v0, p2

    .line 85
    move p2, v2

    .line 86
    goto :goto_3

    .line 87
    :goto_2
    monitor-exit p0

    .line 88
    throw p1

    .line 89
    :cond_b
    move p2, v0

    .line 90
    :goto_3
    monitor-exit p0

    .line 91
    if-eqz v0, :cond_c

    .line 92
    .line 93
    const/4 p3, 0x0

    .line 94
    iput-object p3, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 95
    .line 96
    iget-object p3, p0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᛸᲀᛸ;

    .line 97
    .line 98
    if-eqz p3, :cond_c

    .line 99
    .line 100
    monitor-enter p3

    .line 101
    :try_start_1
    iget p4, p3, Lyyds/ᲈᛸᲀᛸ;->ᛲᛲᲈᲈ:I

    .line 102
    .line 103
    add-int/2addr p4, p1

    .line 104
    iput p4, p3, Lyyds/ᲈᛸᲀᛸ;->ᛲᛲᲈᲈ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    monitor-exit p3

    .line 107
    goto :goto_4

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    monitor-exit p3

    .line 110
    throw p0

    .line 111
    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    .line 112
    .line 113
    invoke-virtual {p0, p6}, Lyyds/ᲈᲀᛱᛷ;->ᛵᛸᛸᛷ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_d
    :goto_5
    return-object p6
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 16
    .line 17
    invoke-interface {v0}, Lyyds/ᲀᲇᲇᛵ;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᲈᛴᲈ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lyyds/ᲀᲈᲇ;

    .line 37
    .line 38
    invoke-interface {v1}, Lyyds/ᲀᲈᲇ;->cancel()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᛴᛴᛷᲁ;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v2}, Lyyds/ᛶᲁᛶᲁ;->ᛶᛸᲀᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lyyds/ᲈᛸᛵᲀ;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v0, v3}, Lyyds/ᲈᛸᛵᲀ;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v0, Lyyds/ᲈᛸᛵᲀ;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, v3}, Lyyds/ᲈᛸᛵᲀ;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance v0, Lyyds/ᲈᛸᛵᲀ;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v3}, Lyyds/ᲈᛸᛵᲀ;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget-object v0, Lyyds/ᲈᛸᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛵᲀ;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 48
    .line 49
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v0, v2}, Lyyds/ᛶᲁᛶᲁ;->ᛶᛸᲀᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lyyds/ᲈᛸᛵᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛵᲀ;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance v0, Lyyds/ᲇᲁᲁᲈ;

    .line 60
    .line 61
    iget-object v5, v1, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲁᲁ;

    .line 62
    .line 63
    iget-object v3, v1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 64
    .line 65
    iget v6, v3, Lyyds/ᛶᛲᛷ;->ᛶᛸᲀᲁ:I

    .line 66
    .line 67
    iget v7, v3, Lyyds/ᛶᛲᛷ;->ᛵᲀᲈᛴ:I

    .line 68
    .line 69
    iget v8, v3, Lyyds/ᛶᛲᛷ;->ᛲᛶᛱᲈ:I

    .line 70
    .line 71
    iget-object v9, v3, Lyyds/ᛶᛲᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛵᛴᲀ;

    .line 72
    .line 73
    iget-object v10, v3, Lyyds/ᛶᛲᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲁᲁᲈᛵ;

    .line 74
    .line 75
    iget-object v11, v3, Lyyds/ᛶᛲᛷ;->ᛱᛳᛶᛳ:Lyyds/ᛱᛱᛴ;

    .line 76
    .line 77
    iget-object v12, v3, Lyyds/ᛶᛲᛷ;->ᛷᲈᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 78
    .line 79
    iget-object v13, v3, Lyyds/ᛶᛲᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛵᲈᲁ;

    .line 80
    .line 81
    iget-object v14, v3, Lyyds/ᛶᛲᛷ;->ᲀᛲᛲᲇ:Ljavax/net/ssl/HostnameVerifier;

    .line 82
    .line 83
    iget-object v15, v3, Lyyds/ᛶᛲᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 84
    .line 85
    iget-object v4, v3, Lyyds/ᛶᛲᛷ;->ᛷᛵᲇᲀ:Ljava/net/ProxySelector;

    .line 86
    .line 87
    move-object/from16 v16, v0

    .line 88
    .line 89
    iget-boolean v0, v3, Lyyds/ᛶᛲᛷ;->ᛲᛴᛳᛲ:Z

    .line 90
    .line 91
    move/from16 v17, v0

    .line 92
    .line 93
    iget-object v0, v3, Lyyds/ᛶᛲᛷ;->ᛱᛳᲇ:Ljavax/net/SocketFactory;

    .line 94
    .line 95
    move-object/from16 v18, v0

    .line 96
    .line 97
    iget-object v0, v3, Lyyds/ᛶᛲᛷ;->ᛳᲁᲁᲇ:Ljavax/net/ssl/SSLSocketFactory;

    .line 98
    .line 99
    move-object/from16 v19, v0

    .line 100
    .line 101
    iget-object v0, v3, Lyyds/ᛶᛲᛷ;->ᲇᛱᛲ:Ljavax/net/ssl/X509TrustManager;

    .line 102
    .line 103
    iget-object v3, v3, Lyyds/ᛶᛲᛷ;->ᛶᲈᛴᲈ:Lyyds/ᛱᛷᲈᛲ;

    .line 104
    .line 105
    move-object/from16 v21, v3

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    move-object/from16 v20, v0

    .line 109
    .line 110
    move-object/from16 v0, v16

    .line 111
    .line 112
    move-object/from16 v16, v4

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    invoke-direct/range {v0 .. v21}, Lyyds/ᲇᲁᲁᲈ;-><init>(Lyyds/ᲈᲀᛱᛷ;Ljava/util/ArrayList;ILyyds/ᲀᲇᛶᲇ;Lyyds/ᲀᲁᲁ;IIILyyds/ᲈᛵᛴᲀ;Lyyds/ᲁᲁᲈᛵ;Lyyds/ᛱᛱᛴ;Lyyds/ᲀᛴᛱᛷ;Lyyds/ᛱᛵᲈᲁ;Ljavax/net/ssl/HostnameVerifier;Lyyds/ᲈᛵᛴᲀ;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lyyds/ᛱᛷᲈᛲ;)V

    .line 116
    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    const/4 v3, 0x0

    .line 120
    :try_start_0
    invoke-virtual {v0, v5}, Lyyds/ᲇᲁᲁᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲀᲁᲁ;)Lyyds/ᛴᛴᛷᲁ;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-boolean v4, v1, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    if-nez v4, :cond_0

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lyyds/ᲈᲀᛱᛷ;->ᛱᲈᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_0
    :try_start_1
    invoke-static {v0}, Lyyds/ᛶᲁᛵᛲ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Ljava/io/IOException;

    .line 136
    .line 137
    const-string v4, "Canceled"

    .line 138
    .line 139
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    const/4 v3, 0x1

    .line 147
    :try_start_2
    invoke-virtual {v1, v0}, Lyyds/ᲈᲀᛱᛷ;->ᛱᲈᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    :goto_0
    if-nez v3, :cond_1

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lyyds/ᲈᲀᛱᛷ;->ᛱᲈᲁ(Ljava/io/IOException;)Ljava/io/IOException;

    .line 155
    .line 156
    .line 157
    :cond_1
    throw v0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛱᲈᲁ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛱᛶ;

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 17
    .line 18
    sget-object v0, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 19
    .line 20
    const-string v1, "response.body().close()"

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/util/CloseGuard;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/util/CloseGuard;->open(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᛲᛳᛶᲁ:Landroid/util/CloseGuard;

    .line 34
    .line 35
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :try_start_0
    iget-object v0, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 41
    .line 42
    iget-object v0, v0, Lyyds/ᛶᛲᛷ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 43
    .line 44
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :try_start_1
    iget-object v1, v0, Lyyds/ᛲᛲᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_2
    monitor-exit v0

    .line 53
    invoke-virtual {p0}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ()Lyyds/ᛴᛴᛷᲁ;

    .line 54
    .line 55
    .line 56
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    iget-object v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 58
    .line 59
    iget-object v1, v1, Lyyds/ᛶᛲᛷ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 60
    .line 61
    invoke-virtual {v1, p0}, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ(Lyyds/ᲈᲀᛱᛷ;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto :goto_0

    .line 67
    :catchall_1
    move-exception v1

    .line 68
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 69
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    :goto_0
    iget-object v1, p0, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛲᛷ;

    .line 71
    .line 72
    iget-object v1, v1, Lyyds/ᛶᛲᛷ;->ᛲᲈᲁ:Lyyds/ᛲᛲᲇᲈ;

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ(Lyyds/ᲈᲀᛱᛷ;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_0
    const-string p0, "Already Executed"

    .line 79
    .line 80
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method
