.class public final Lyyds/ᲀᲇᛱᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᛱᲈᛳ;


# instance fields
.field public ᛲᛴᛳᛲ:J

.field public final ᛶᛷᛲᲁ:Ljava/util/concurrent/LinkedBlockingDeque;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

.field public final ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛳᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᲀᛷᛷ;Lyyds/ᛱᛴᛳᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛳᛱ;

    .line 7
    .line 8
    const-wide/high16 p1, -0x8000000000000000L

    .line 9
    .line 10
    iput-wide p1, p0, Lyyds/ᲀᲇᛱᲇ;->ᛲᛴᛳᛲ:J

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᲀᲇᛱᲇ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ()Lyyds/ᛸᲀᛷᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lyyds/ᲀᲈᲇ;

    .line 18
    .line 19
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->cancel()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛲᲈᲁ()Lyyds/ᲀᲈᲇ;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v3, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 30
    .line 31
    iget-object v3, v3, Lyyds/ᛸᲀᛷᛷ;->ᲇᛱᛲ:Lyyds/ᛱᲁᛳᛵ;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Lyyds/ᛱᲁᛳᛵ;->addLast(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᲈᛷᛲᛱ;
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lyyds/ᛸᲀᛷᛷ;->ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v0}, Lyyds/ᛸᲀᛷᛷ;->ᛵᛸᛸᛷ()Lyyds/ᲀᲈᲇ;

    .line 11
    .line 12
    .line 13
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v2

    .line 16
    new-instance v3, Lyyds/ᛵᛱᲇᛲ;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Lyyds/ᛵᛱᲇᛲ;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object v2, v3

    .line 22
    :goto_0
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛲᛴᛳᛲ()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    new-instance p0, Lyyds/ᲈᛷᛲᛱ;

    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    invoke-direct {p0, v2, v1, v1, v0}, Lyyds/ᲈᛷᛲᛱ;-><init>(Lyyds/ᲀᲈᲇ;Lyyds/ᲈᛵᲀᲇ;Ljava/lang/Throwable;I)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    instance-of v3, v2, Lyyds/ᛵᛱᲇᛲ;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    check-cast v2, Lyyds/ᛵᛱᲇᛲ;

    .line 40
    .line 41
    iget-object p0, v2, Lyyds/ᛵᛱᲇᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛲᛱ;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    iget-object v3, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v4, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v4, " connect "

    .line 60
    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Lyyds/ᛸᲀᛷᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 65
    .line 66
    iget-object v0, v0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 67
    .line 68
    invoke-virtual {v0}, Lyyds/ᛱᛲᲀᛶ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v3, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛳᛱ;

    .line 80
    .line 81
    invoke-virtual {v3}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, Lyyds/ᛱᛱᛸᲈ;

    .line 86
    .line 87
    invoke-direct {v4, v0, v2, p0}, Lyyds/ᛱᛱᛸᲈ;-><init>(Ljava/lang/String;Lyyds/ᲀᲈᲇ;Lyyds/ᲀᲇᛱᲇ;)V

    .line 88
    .line 89
    .line 90
    const-wide/16 v5, 0x0

    .line 91
    .line 92
    invoke-virtual {v3, v4, v5, v6}, Lyyds/ᛱᛷᛱᛳ;->ᲀᛲᛳᲀ(Lyyds/ᛳᲀᛵᛸ;J)V

    .line 93
    .line 94
    .line 95
    :cond_2
    return-object v1
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lyyds/ᛸᲀᛷᛷ;->ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;)Z

    .line 14
    .line 15
    .line 16
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lyyds/ᲀᲇᛱᲇ;->ᛲᲈᲁ()V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_2
    :goto_1
    :try_start_1
    iget-object v2, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 28
    .line 29
    iget-object v2, v2, Lyyds/ᛸᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᲈᲀᛱᛷ;

    .line 30
    .line 31
    iget-boolean v2, v2, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛲᲇ:Z

    .line 32
    .line 33
    if-nez v2, :cond_f

    .line 34
    .line 35
    iget-object v2, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛴᛳᛱ;

    .line 36
    .line 37
    iget-object v2, v2, Lyyds/ᛱᛴᛳᛱ;->ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iget-wide v4, p0, Lyyds/ᲀᲇᛱᲇ;->ᛲᛴᛳᛲ:J

    .line 44
    .line 45
    sub-long/2addr v4, v2

    .line 46
    iget-object v6, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_4

    .line 53
    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    cmp-long v6, v4, v6

    .line 57
    .line 58
    if-gtz v6, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-wide v5, v4

    .line 62
    move-object v4, v0

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lyyds/ᲀᲇᛱᲇ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛷᛲᛱ;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-wide/32 v5, 0xee6b280

    .line 69
    .line 70
    .line 71
    add-long/2addr v2, v5

    .line 72
    iput-wide v2, p0, Lyyds/ᲀᲇᛱᲇ;->ᛲᛴᛳᛲ:J

    .line 73
    .line 74
    :goto_3
    if-nez v4, :cond_7

    .line 75
    .line 76
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 77
    .line 78
    iget-object v3, p0, Lyyds/ᲀᲇᛱᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    :goto_4
    move-object v4, v0

    .line 87
    goto :goto_5

    .line 88
    :cond_5
    iget-object v4, p0, Lyyds/ᲀᲇᛱᲇ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 89
    .line 90
    invoke-virtual {v4, v5, v6, v2}, Ljava/util/concurrent/LinkedBlockingDeque;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lyyds/ᲈᛷᛲᛱ;

    .line 95
    .line 96
    if-nez v2, :cond_6

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iget-object v4, v2, Lyyds/ᲈᛷᛲᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᲇ;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-object v4, v2

    .line 105
    :goto_5
    if-nez v4, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᲇ;

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v5, 0x1

    .line 112
    if-nez v2, :cond_8

    .line 113
    .line 114
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Throwable;

    .line 115
    .line 116
    if-nez v2, :cond_8

    .line 117
    .line 118
    move v2, v5

    .line 119
    goto :goto_6

    .line 120
    :cond_8
    move v2, v3

    .line 121
    :goto_6
    if-eqz v2, :cond_b

    .line 122
    .line 123
    invoke-virtual {p0}, Lyyds/ᲀᲇᛱᲇ;->ᛲᲈᲁ()V

    .line 124
    .line 125
    .line 126
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᲇ;

    .line 127
    .line 128
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛲᛴᛳᛲ()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_9

    .line 133
    .line 134
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᲇ;

    .line 135
    .line 136
    invoke-interface {v2}, Lyyds/ᲀᲈᲇ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛷᛲᛱ;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_9
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᲇ;

    .line 141
    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Throwable;

    .line 145
    .line 146
    if-nez v2, :cond_a

    .line 147
    .line 148
    move v3, v5

    .line 149
    :cond_a
    if-eqz v3, :cond_b

    .line 150
    .line 151
    iget-object v0, v4, Lyyds/ᲈᛷᛲᛱ;->ᛲᲈᲁ:Lyyds/ᲀᲈᲇ;

    .line 152
    .line 153
    invoke-interface {v0}, Lyyds/ᲀᲈᲇ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;

    .line 154
    .line 155
    .line 156
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    invoke-virtual {p0}, Lyyds/ᲀᲇᛱᲇ;->ᛲᲈᲁ()V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_b
    :try_start_2
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Throwable;

    .line 162
    .line 163
    if-eqz v2, :cond_e

    .line 164
    .line 165
    instance-of v3, v2, Ljava/io/IOException;

    .line 166
    .line 167
    if-eqz v3, :cond_d

    .line 168
    .line 169
    if-nez v1, :cond_c

    .line 170
    .line 171
    check-cast v2, Ljava/io/IOException;

    .line 172
    .line 173
    move-object v1, v2

    .line 174
    goto :goto_7

    .line 175
    :cond_c
    invoke-static {v1, v2}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_d
    throw v2

    .line 180
    :cond_e
    :goto_7
    iget-object v2, v4, Lyyds/ᲈᛷᛲᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᲇ;

    .line 181
    .line 182
    if-eqz v2, :cond_0

    .line 183
    .line 184
    iget-object v3, p0, Lyyds/ᲀᲇᛱᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛷᛷ;

    .line 185
    .line 186
    iget-object v3, v3, Lyyds/ᛸᲀᛷᛷ;->ᲇᛱᛲ:Lyyds/ᛱᲁᛳᛵ;

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Lyyds/ᛱᲁᛳᛵ;->addFirst(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 194
    .line 195
    const-string v1, "Canceled"

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    :goto_8
    invoke-virtual {p0}, Lyyds/ᲀᲇᛱᲇ;->ᛲᲈᲁ()V

    .line 202
    .line 203
    .line 204
    throw v0
.end method
