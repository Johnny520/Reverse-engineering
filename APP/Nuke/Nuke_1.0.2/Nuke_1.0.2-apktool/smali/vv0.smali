.class public final Lvv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lht2;


# instance fields
.field public final h:J

.field public i:Z

.field public final j:Lfn;

.field public final k:Lfn;

.field public l:Z

.field public final synthetic m:Lxv0;


# direct methods
.method public constructor <init>(Lxv0;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvv0;->m:Lxv0;

    .line 5
    .line 6
    iput-wide p2, p0, Lvv0;->h:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lvv0;->i:Z

    .line 9
    .line 10
    new-instance p1, Lfn;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lvv0;->j:Lfn;

    .line 16
    .line 17
    new-instance p1, Lfn;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lvv0;->k:Lfn;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Lo23;
    .locals 0

    .line 1
    iget-object p0, p0, Lvv0;->m:Lxv0;

    .line 2
    .line 3
    iget-object p0, p0, Lxv0;->q:Lwv0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lvv0;->m:Lxv0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lvv0;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, Lvv0;->k:Lfn;

    .line 8
    .line 9
    iget-wide v2, v1, Lfn;->i:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lfn;->g()V

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
    iget-object v0, p0, Lvv0;->m:Lxv0;

    .line 25
    .line 26
    sget-object v1, Lwg3;->a:Ljava/util/TimeZone;

    .line 27
    .line 28
    iget-object v0, v0, Lxv0;->i:Lqv0;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lqv0;->h(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lvv0;->m:Lxv0;

    .line 34
    .line 35
    invoke-virtual {p0}, Lxv0;->a()V

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

.method public final n(Lfn;J)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v1, v0, Lvv0;->m:Lxv0;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, v1, Lxv0;->i:Lqv0;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lxv0;->p:Luv0;

    .line 15
    .line 16
    iget-boolean v3, v2, Luv0;->j:Z

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-boolean v2, v2, Luv0;->h:Z

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v2, v5

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_1
    move v2, v4

    .line 30
    :goto_2
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-object v3, v1, Lxv0;->q:Lwv0;

    .line 33
    .line 34
    invoke-virtual {v3}, Lwg;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_8

    .line 40
    .line 41
    :cond_2
    :goto_3
    :try_start_1
    invoke-virtual {v1}, Lxv0;->f()Lcg0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    iget-boolean v3, v0, Lvv0;->i:Z

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    iget-object v3, v1, Lxv0;->t:Ljava/io/IOException;

    .line 52
    .line 53
    if-nez v3, :cond_4

    .line 54
    .line 55
    new-instance v3, Lav2;

    .line 56
    .line 57
    invoke-virtual {v1}, Lxv0;->f()Lcg0;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v6}, Lav2;-><init>(Lcg0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :catchall_1
    move-exception v0

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_3
    const/4 v3, 0x0

    .line 72
    :cond_4
    :goto_4
    iget-boolean v6, v0, Lvv0;->l:Z

    .line 73
    .line 74
    if-nez v6, :cond_d

    .line 75
    .line 76
    iget-object v6, v0, Lvv0;->k:Lfn;

    .line 77
    .line 78
    iget-wide v7, v6, Lfn;->i:J

    .line 79
    .line 80
    const-wide/16 v9, 0x0

    .line 81
    .line 82
    cmp-long v9, v7, v9

    .line 83
    .line 84
    if-lez v9, :cond_7

    .line 85
    .line 86
    const-wide/16 v12, 0x2000

    .line 87
    .line 88
    invoke-static {v12, v13, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    move-object/from16 v9, p1

    .line 93
    .line 94
    invoke-virtual {v6, v9, v7, v8}, Lfn;->n(Lfn;J)J

    .line 95
    .line 96
    .line 97
    move-result-wide v13

    .line 98
    iget-object v12, v1, Lxv0;->j:Lsd3;

    .line 99
    .line 100
    const-wide/16 v15, 0x0

    .line 101
    .line 102
    const/16 v17, 0x2

    .line 103
    .line 104
    invoke-static/range {v12 .. v17}, Lsd3;->b(Lsd3;JJI)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v1, Lxv0;->j:Lsd3;

    .line 108
    .line 109
    invoke-virtual {v4}, Lsd3;->a()J

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    if-nez v3, :cond_5

    .line 114
    .line 115
    iget-object v4, v1, Lxv0;->i:Lqv0;

    .line 116
    .line 117
    iget-object v4, v4, Lqv0;->x:Lxp2;

    .line 118
    .line 119
    invoke-virtual {v4}, Lxp2;->a()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    div-int/lit8 v4, v4, 0x2

    .line 124
    .line 125
    const-wide/16 p2, -0x1

    .line 126
    .line 127
    int-to-long v10, v4

    .line 128
    cmp-long v4, v6, v10

    .line 129
    .line 130
    if-ltz v4, :cond_6

    .line 131
    .line 132
    iget-object v4, v1, Lxv0;->i:Lqv0;

    .line 133
    .line 134
    iget v8, v1, Lxv0;->h:I

    .line 135
    .line 136
    invoke-virtual {v4, v6, v7, v8}, Lqv0;->o(JI)V

    .line 137
    .line 138
    .line 139
    iget-object v15, v1, Lxv0;->j:Lsd3;

    .line 140
    .line 141
    const-wide/16 v16, 0x0

    .line 142
    .line 143
    const/16 v20, 0x1

    .line 144
    .line 145
    move-wide/from16 v18, v6

    .line 146
    .line 147
    invoke-static/range {v15 .. v20}, Lsd3;->b(Lsd3;JJI)V

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_5
    const-wide/16 p2, -0x1

    .line 152
    .line 153
    :cond_6
    :goto_5
    move v4, v5

    .line 154
    goto :goto_6

    .line 155
    :cond_7
    move-object/from16 v9, p1

    .line 156
    .line 157
    const-wide/16 p2, -0x1

    .line 158
    .line 159
    iget-boolean v6, v0, Lvv0;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    .line 161
    if-nez v6, :cond_8

    .line 162
    .line 163
    if-nez v3, :cond_8

    .line 164
    .line 165
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    .line 167
    .line 168
    move-wide/from16 v13, p2

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 176
    .line 177
    .line 178
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 181
    .line 182
    .line 183
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 184
    :cond_8
    move-wide/from16 v13, p2

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :goto_6
    if-eqz v2, :cond_9

    .line 188
    .line 189
    :try_start_4
    iget-object v2, v1, Lxv0;->q:Lwv0;

    .line 190
    .line 191
    invoke-virtual {v2}, Lwv0;->l()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 192
    .line 193
    .line 194
    :cond_9
    monitor-exit v1

    .line 195
    iget-object v1, v0, Lvv0;->m:Lxv0;

    .line 196
    .line 197
    iget-object v1, v1, Lxv0;->i:Lqv0;

    .line 198
    .line 199
    iget-object v1, v1, Lqv0;->w:Lbk0;

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    if-eqz v4, :cond_a

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_a
    cmp-long v0, v13, p2

    .line 209
    .line 210
    if-eqz v0, :cond_b

    .line 211
    .line 212
    return-wide v13

    .line 213
    :cond_b
    if-nez v3, :cond_c

    .line 214
    .line 215
    return-wide p2

    .line 216
    :cond_c
    throw v3

    .line 217
    :cond_d
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    .line 218
    .line 219
    const-string v3, "stream closed"

    .line 220
    .line 221
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 225
    :goto_7
    if-eqz v2, :cond_e

    .line 226
    .line 227
    :try_start_6
    iget-object v2, v1, Lxv0;->q:Lwv0;

    .line 228
    .line 229
    invoke-virtual {v2}, Lwv0;->l()V

    .line 230
    .line 231
    .line 232
    :cond_e
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 233
    :goto_8
    monitor-exit v1

    .line 234
    throw v0
.end method
