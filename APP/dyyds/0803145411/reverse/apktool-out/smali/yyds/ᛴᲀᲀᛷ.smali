.class public final Lyyds/ᛴᲀᲀᛷ;
.super Lyyds/ᛳᲀᛵᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛴᲀᲀᛷ;->ᛲᛴᛳᛲ:I

    iput-object p2, p0, Lyyds/ᛴᲀᲀᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 10
    invoke-direct {p0, p1}, Lyyds/ᛳᲀᛵᛸ;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᲈᲁᛵ;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛴᲀᲀᛷ;->ᛲᛴᛳᛲ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᲀᲀᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lyyds/ᛳᲀᛵᛸ;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛴᲀᲀᛷ;->ᛲᛴᛳᛲ:I

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᛴᲀᲀᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lyyds/ᲁᛶᲁᲀ;

    .line 13
    .line 14
    invoke-interface {v0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-wide v2

    .line 18
    :pswitch_0
    iget-object v0, v0, Lyyds/ᛴᲀᲀᛷ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lyyds/ᲀᲈᲁᛵ;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-wide v6, v0, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ:J

    .line 27
    .line 28
    sub-long v6, v4, v6

    .line 29
    .line 30
    const-wide/16 v8, 0x1

    .line 31
    .line 32
    add-long/2addr v6, v8

    .line 33
    iget-object v1, v0, Lyyds/ᲀᲈᲁᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v8, 0x0

    .line 40
    const-wide v9, 0x7fffffffffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    move-object v13, v8

    .line 47
    move-object v14, v13

    .line 48
    move v12, v11

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    if-eqz v15, :cond_3

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v15

    .line 59
    check-cast v15, Lyyds/ᲈᛸᲀᛸ;

    .line 60
    .line 61
    monitor-enter v15

    .line 62
    :try_start_0
    invoke-virtual {v0, v15, v4, v5}, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;J)I

    .line 63
    .line 64
    .line 65
    move-result v16

    .line 66
    if-lez v16, :cond_0

    .line 67
    .line 68
    add-int/lit8 v12, v12, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    iget-wide v2, v15, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    cmp-long v17, v2, v6

    .line 74
    .line 75
    if-gez v17, :cond_1

    .line 76
    .line 77
    move-wide v6, v2

    .line 78
    move-object v13, v15

    .line 79
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 80
    .line 81
    cmp-long v17, v2, v9

    .line 82
    .line 83
    if-gez v17, :cond_2

    .line 84
    .line 85
    move-wide v9, v2

    .line 86
    move-object v14, v15

    .line 87
    :cond_2
    :goto_1
    monitor-exit v15

    .line 88
    const-wide/16 v2, -0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    monitor-exit v15

    .line 93
    throw v0

    .line 94
    :cond_3
    if-eqz v13, :cond_4

    .line 95
    .line 96
    move-object v8, v13

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const/4 v1, 0x5

    .line 99
    if-le v11, v1, :cond_5

    .line 100
    .line 101
    move-wide v6, v9

    .line 102
    move-object v8, v14

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    const-wide/16 v6, -0x1

    .line 105
    .line 106
    :goto_2
    if-eqz v8, :cond_9

    .line 107
    .line 108
    monitor-enter v8

    .line 109
    :try_start_1
    iget-object v1, v8, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 115
    const-wide/16 v2, 0x0

    .line 116
    .line 117
    if-nez v1, :cond_6

    .line 118
    .line 119
    :goto_3
    monitor-exit v8

    .line 120
    goto :goto_6

    .line 121
    :cond_6
    :try_start_2
    iget-wide v4, v8, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J

    .line 122
    .line 123
    cmp-long v1, v4, v6

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const/4 v1, 0x1

    .line 129
    iput-boolean v1, v8, Lyyds/ᲈᛸᲀᛸ;->ᛷᲈᲈᲁ:Z

    .line 130
    .line 131
    iget-object v1, v0, Lyyds/ᲀᲈᲁᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 132
    .line 133
    invoke-virtual {v1, v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 134
    .line 135
    .line 136
    monitor-exit v8

    .line 137
    iget-object v1, v8, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 138
    .line 139
    invoke-static {v1}, Lyyds/ᛴᛲᛲᲇ;->ᲀᛲᛳᲀ(Ljava/net/Socket;)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lyyds/ᲀᲈᲁᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_c

    .line 149
    .line 150
    iget-object v0, v0, Lyyds/ᲀᲈᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛱᛳ;

    .line 151
    .line 152
    iget-object v1, v0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 153
    .line 154
    monitor-enter v1

    .line 155
    :try_start_3
    invoke-virtual {v0}, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_8

    .line 160
    .line 161
    iget-object v4, v0, Lyyds/ᛱᛷᛱᛳ;->ᛲᲈᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 162
    .line 163
    invoke-virtual {v4, v0}, Lyyds/ᛱᛴᛳᛱ;->ᲀᛲᛳᲀ(Lyyds/ᛱᛷᛱᛳ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    goto :goto_5

    .line 169
    :cond_8
    :goto_4
    monitor-exit v1

    .line 170
    goto :goto_6

    .line 171
    :goto_5
    monitor-exit v1

    .line 172
    throw v0

    .line 173
    :catchall_2
    move-exception v0

    .line 174
    monitor-exit v8

    .line 175
    throw v0

    .line 176
    :cond_9
    if-eqz v14, :cond_a

    .line 177
    .line 178
    iget-wide v0, v0, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ:J

    .line 179
    .line 180
    add-long/2addr v9, v0

    .line 181
    sub-long v2, v9, v4

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    if-lez v12, :cond_b

    .line 185
    .line 186
    iget-wide v2, v0, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ:J

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_b
    const-wide/16 v2, -0x1

    .line 190
    .line 191
    :cond_c
    :goto_6
    return-wide v2

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
