.class public final Lyyds/ᛱᛷᛱᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/ArrayList;

.field public final ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛴᛳᛱ;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛴᲀᲀᛷ;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lyyds/ᛴᲀᲀᛷ;-><init>(Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p1, 0x0

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1, p2}, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛸ;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ(Lyyds/ᛱᛷᛱᛳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method public final ᛲᲈᲁ()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛸ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, v0, Lyyds/ᛳᲀᛵᛸ;->ᛵᛸᛸᛷ:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-boolean v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᲇᲇᲇᛱ:Z

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    const/4 v4, -0x1

    .line 21
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lyyds/ᛳᲀᛵᛸ;

    .line 28
    .line 29
    iget-boolean v4, v4, Lyyds/ᛳᲀᛵᛸ;->ᛵᛸᛸᛷ:Z

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 34
    .line 35
    iget-object v3, v3, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lyyds/ᛳᲀᛵᛸ;

    .line 42
    .line 43
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    const-string v5, "canceled"

    .line 52
    .line 53
    invoke-static {v3, v4, p0, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move v3, v1

    .line 60
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return v3
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛸ;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ:Z

    .line 5
    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    iget-boolean p2, p1, Lyyds/ᛳᲀᛵᛸ;->ᛵᛸᛸᛷ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    iget-object p3, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 11
    .line 12
    iget-object p3, p3, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_1
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 17
    .line 18
    invoke-virtual {p3, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    const-string p2, "schedule canceled (queue is shutdown)"

    .line 25
    .line 26
    invoke-static {p3, p1, p0, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_1
    :try_start_2
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    const-string p2, "schedule failed (queue is shutdown)"

    .line 43
    .line 44
    invoke-static {p3, p1, p0, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    new-instance p0, Ljava/util/concurrent/RejectedExecutionException;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_3
    const/4 v1, 0x0

    .line 54
    invoke-virtual {p0, p1, p2, p3, v1}, Lyyds/ᛱᛷᛱᛳ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛸ;JZ)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget-object p1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ(Lyyds/ᛱᛷᛱᛳ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_4
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_1
    monitor-exit v0

    .line 68
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛸ;JZ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛴᛳᛱ;->ᛵᛸᛸᛷ:Ljava/util/logging/Logger;

    .line 4
    .line 5
    iget-object v1, p1, Lyyds/ᛳᲀᛵᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v1, p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-nez v1, :cond_9

    .line 12
    .line 13
    iput-object p0, p1, Lyyds/ᛳᲀᛵᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 14
    .line 15
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    add-long v5, v3, p2

    .line 20
    .line 21
    iget-object v1, p0, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, -0x1

    .line 28
    if-eq v7, v8, :cond_2

    .line 29
    .line 30
    iget-wide v9, p1, Lyyds/ᛳᲀᛵᛸ;->ᲇᲈᛵᛷ:J

    .line 31
    .line 32
    cmp-long v9, v9, v5

    .line 33
    .line 34
    if-gtz v9, :cond_1

    .line 35
    .line 36
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_8

    .line 43
    .line 44
    const-string p2, "already scheduled"

    .line 45
    .line 46
    invoke-static {v0, p1, p0, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :cond_1
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-wide v5, p1, Lyyds/ᛳᲀᛵᛸ;->ᲇᲈᛵᛷ:J

    .line 54
    .line 55
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 56
    .line 57
    invoke-virtual {v0, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    if-eqz p4, :cond_3

    .line 64
    .line 65
    sub-long/2addr v5, v3

    .line 66
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛵᛸᛸᛷ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    const-string v5, "run again after "

    .line 71
    .line 72
    invoke-virtual {v5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sub-long/2addr v5, v3

    .line 78
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛵᛸᛸᛷ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    const-string v5, "scheduled after "

    .line 83
    .line 84
    invoke-virtual {v5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    :goto_1
    invoke-static {v0, p1, p0, p4}, Lyyds/ᲁᲀᲈᛸ;->ᛱᲈᲁ(Ljava/util/logging/Logger;Lyyds/ᛳᲀᛵᛸ;Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    move p4, v2

    .line 96
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lyyds/ᛳᲀᛵᛸ;

    .line 107
    .line 108
    iget-wide v5, v0, Lyyds/ᛳᲀᛵᛸ;->ᲇᲈᛵᛷ:J

    .line 109
    .line 110
    sub-long/2addr v5, v3

    .line 111
    cmp-long v0, v5, p2

    .line 112
    .line 113
    if-lez v0, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    add-int/lit8 p4, p4, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    move p4, v8

    .line 120
    :goto_3
    if-ne p4, v8, :cond_7

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result p4

    .line 126
    :cond_7
    invoke-virtual {v1, p4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    if-nez p4, :cond_8

    .line 130
    .line 131
    const/4 p0, 0x1

    .line 132
    return p0

    .line 133
    :cond_8
    return v2

    .line 134
    :cond_9
    const-string p0, "task is in multiple queues"

    .line 135
    .line 136
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return v2
.end method
