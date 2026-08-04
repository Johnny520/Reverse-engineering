.class public final Lyyds/ᛳᲇᛴᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛷᛳᛷ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲈᛲ;

.field public ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:J

.field public final ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᲇᲀᲁᛵ;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛳᲇᛴᛱ;->ᲀᛲᛳᲀ:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 9
    .line 10
    new-instance p1, Lyyds/ᛷᛲᲈᛲ;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛳᲇᛴᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲈᛲ;

    .line 16
    .line 17
    new-instance p1, Lyyds/ᛷᛲᲈᛲ;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lyyds/ᛳᲇᛴᛱ;->ᛶᛷᛲᲁ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 8
    .line 9
    iget-wide v2, v1, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛶᛷᲀ(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 25
    .line 26
    sget-object v1, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 27
    .line 28
    iget-object v0, v0, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lyyds/ᛴᲀᛷᛷ;->ᛳᲁᲁᲇ(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 34
    .line 35
    invoke-virtual {p0}, Lyyds/ᲇᲀᲁᛵ;->ᛲᲈᲁ()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v0

    .line 41
    throw p0
.end method

.method public final ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :goto_0
    iget-object v1, v0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, v1, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lyyds/ᲇᲀᲁᛵ;->ᛷᛲᲈᛱ:Lyyds/ᛸᲀᛲᛸ;

    .line 12
    .line 13
    iget-boolean v3, v2, Lyyds/ᛸᲀᛲᛸ;->ᛲᛴᛳᛲ:Z

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x0

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v2, Lyyds/ᛸᲀᛲᛸ;->ᲀᛲᛳᲀ:Z

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v2, v5

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_1
    move v2, v4

    .line 27
    :goto_2
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v3, v1, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 30
    .line 31
    invoke-virtual {v3}, Lyyds/ᛲᛳᛶᲈ;->ᛱᲈᲁ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_2
    :goto_3
    :try_start_1
    invoke-virtual {v1}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    iget-boolean v3, v0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    iget-object v3, v1, Lyyds/ᲇᲀᲁᛵ;->ᛳᲁᲁᲇ:Ljava/io/IOException;

    .line 49
    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    new-instance v3, Lyyds/ᲈᛱᲈᲈ;

    .line 53
    .line 54
    invoke-virtual {v1}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-direct {v3, v6}, Lyyds/ᲈᛱᲈᲈ;-><init>(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_3
    const/4 v3, 0x0

    .line 66
    :cond_4
    :goto_4
    iget-boolean v6, v0, Lyyds/ᛳᲇᛴᛱ;->ᛶᛷᛲᲁ:Z

    .line 67
    .line 68
    if-nez v6, :cond_d

    .line 69
    .line 70
    iget-object v6, v0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 71
    .line 72
    iget-wide v7, v6, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 73
    .line 74
    const-wide/16 v9, 0x0

    .line 75
    .line 76
    cmp-long v9, v7, v9

    .line 77
    .line 78
    if-lez v9, :cond_7

    .line 79
    .line 80
    const-wide/16 v12, 0x2000

    .line 81
    .line 82
    invoke-static {v12, v13, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    move-object/from16 v9, p3

    .line 87
    .line 88
    invoke-virtual {v6, v7, v8, v9}, Lyyds/ᛷᛲᲈᛲ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v13

    .line 92
    iget-object v12, v1, Lyyds/ᲇᲀᲁᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛳᲀᛶ;

    .line 93
    .line 94
    const-wide/16 v15, 0x0

    .line 95
    .line 96
    const/16 v17, 0x2

    .line 97
    .line 98
    invoke-static/range {v12 .. v17}, Lyyds/ᲁᛳᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛳᲀᛶ;JJI)V

    .line 99
    .line 100
    .line 101
    iget-object v4, v1, Lyyds/ᲇᲀᲁᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛳᲀᛶ;

    .line 102
    .line 103
    invoke-virtual {v4}, Lyyds/ᲁᛳᲀᛶ;->ᛵᛸᛸᛷ()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    if-nez v3, :cond_5

    .line 108
    .line 109
    iget-object v4, v1, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 110
    .line 111
    iget-object v4, v4, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

    .line 112
    .line 113
    invoke-virtual {v4}, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    div-int/lit8 v4, v4, 0x2

    .line 118
    .line 119
    const-wide/16 p1, -0x1

    .line 120
    .line 121
    int-to-long v10, v4

    .line 122
    cmp-long v4, v6, v10

    .line 123
    .line 124
    if-ltz v4, :cond_6

    .line 125
    .line 126
    iget-object v4, v1, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 127
    .line 128
    iget v8, v1, Lyyds/ᲇᲀᲁᛵ;->ᲀᛲᛳᲀ:I

    .line 129
    .line 130
    invoke-virtual {v4, v8, v6, v7}, Lyyds/ᛴᲀᛷᛷ;->ᛳᛸᛴᛶ(IJ)V

    .line 131
    .line 132
    .line 133
    iget-object v15, v1, Lyyds/ᲇᲀᲁᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛳᲀᛶ;

    .line 134
    .line 135
    const-wide/16 v16, 0x0

    .line 136
    .line 137
    const/16 v20, 0x1

    .line 138
    .line 139
    move-wide/from16 v18, v6

    .line 140
    .line 141
    invoke-static/range {v15 .. v20}, Lyyds/ᲁᛳᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛳᲀᛶ;JJI)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    const-wide/16 p1, -0x1

    .line 146
    .line 147
    :cond_6
    :goto_5
    move v4, v5

    .line 148
    goto :goto_6

    .line 149
    :cond_7
    move-object/from16 v9, p3

    .line 150
    .line 151
    const-wide/16 p1, -0x1

    .line 152
    .line 153
    iget-boolean v6, v0, Lyyds/ᛳᲇᛴᛱ;->ᲇᲈᛵᛷ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    .line 155
    if-nez v6, :cond_8

    .line 156
    .line 157
    if-nez v3, :cond_8

    .line 158
    .line 159
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    .line 161
    .line 162
    move-wide/from16 v13, p1

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 170
    .line 171
    .line 172
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 175
    .line 176
    .line 177
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    :cond_8
    move-wide/from16 v13, p1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :goto_6
    if-eqz v2, :cond_9

    .line 182
    .line 183
    :try_start_4
    iget-object v2, v1, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 184
    .line 185
    invoke-virtual {v2}, Lyyds/ᛷᲁᛸᛲ;->ᛷᛲᲈᛱ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 186
    .line 187
    .line 188
    :cond_9
    monitor-exit v1

    .line 189
    iget-object v1, v0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 190
    .line 191
    iget-object v1, v1, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 192
    .line 193
    iget-object v1, v1, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛷᛷᲁᛲ;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    if-eqz v4, :cond_a

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_a
    cmp-long v0, v13, p1

    .line 203
    .line 204
    if-eqz v0, :cond_b

    .line 205
    .line 206
    return-wide v13

    .line 207
    :cond_b
    if-nez v3, :cond_c

    .line 208
    .line 209
    return-wide p1

    .line 210
    :cond_c
    throw v3

    .line 211
    :cond_d
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    .line 212
    .line 213
    const-string v3, "stream closed"

    .line 214
    .line 215
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 219
    :goto_7
    if-eqz v2, :cond_e

    .line 220
    .line 221
    :try_start_6
    iget-object v2, v1, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 222
    .line 223
    invoke-virtual {v2}, Lyyds/ᛷᲁᛸᛲ;->ᛷᛲᲈᛱ()V

    .line 224
    .line 225
    .line 226
    :cond_e
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 227
    :goto_8
    monitor-exit v1

    .line 228
    throw v0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᲀᲁᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛷᲁᛸᛲ;

    .line 4
    .line 5
    return-object p0
.end method
