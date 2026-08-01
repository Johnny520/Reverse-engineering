.class public final Le31;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lsw;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public c:Z

.field public final d:Lya;

.field public final e:Lo;

.field public final f:Lsh0;

.field public final g:Ljava/lang/Object;

.field public h:Lyk0;

.field public i:Ld31;

.field public j:J


# direct methods
.method public constructor <init>(Lsw;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le31;->a:Lsw;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Le31;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    new-instance p1, Lya;

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    invoke-direct {p1, v0, p0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Le31;->d:Lya;

    .line 22
    .line 23
    new-instance p1, Lo;

    .line 24
    .line 25
    const/16 v0, 0x16

    .line 26
    .line 27
    invoke-direct {p1, v0, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Le31;->e:Lo;

    .line 31
    .line 32
    new-instance p1, Lsh0;

    .line 33
    .line 34
    const/16 v0, 0x10

    .line 35
    .line 36
    new-array v0, v0, [Ld31;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Le31;->f:Lsh0;

    .line 42
    .line 43
    new-instance p1, Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Le31;->g:Ljava/lang/Object;

    .line 49
    .line 50
    const-wide/16 v0, -0x1

    .line 51
    .line 52
    iput-wide v0, p0, Le31;->j:J

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 10

    .line 1
    iget-object v0, p0, Le31;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Le31;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    iget-object v2, p0, Le31;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_4

    .line 23
    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    move-object v6, v3

    .line 28
    check-cast v6, Ljava/util/Set;

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    instance-of v6, v3, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v6, :cond_b

    .line 34
    .line 35
    move-object v6, v3

    .line 36
    check-cast v6, Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x2

    .line 49
    if-ne v8, v9, :cond_3

    .line 50
    .line 51
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-le v8, v9, :cond_4

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_4
    :goto_2
    move-object v6, v7

    .line 71
    :cond_5
    :goto_3
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_a

    .line 76
    .line 77
    move-object v4, v6

    .line 78
    :goto_4
    if-nez v4, :cond_6

    .line 79
    .line 80
    return v1

    .line 81
    :cond_6
    iget-object v2, p0, Le31;->g:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter v2

    .line 84
    :try_start_1
    iget-object v3, p0, Le31;->f:Lsh0;

    .line 85
    .line 86
    iget-object v6, v3, Lsh0;->d:[Ljava/lang/Object;

    .line 87
    .line 88
    iget v3, v3, Lsh0;->f:I

    .line 89
    .line 90
    move v7, v0

    .line 91
    :goto_5
    if-ge v7, v3, :cond_9

    .line 92
    .line 93
    aget-object v8, v6, v7

    .line 94
    .line 95
    check-cast v8, Ld31;

    .line 96
    .line 97
    invoke-virtual {v8, v4}, Ld31;->a(Ljava/util/Set;)Z

    .line 98
    .line 99
    .line 100
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    if-nez v8, :cond_8

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_7
    move v1, v0

    .line 107
    goto :goto_7

    .line 108
    :cond_8
    :goto_6
    move v1, v5

    .line 109
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_8

    .line 114
    :cond_9
    monitor-exit v2

    .line 115
    goto :goto_0

    .line 116
    :goto_8
    monitor-exit v2

    .line 117
    throw p0

    .line 118
    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-eq v7, v3, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_b
    const-string p0, "Unexpected notification"

    .line 126
    .line 127
    invoke-static {p0}, Lqi;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 128
    .line 129
    .line 130
    new-instance p0, Lsg;

    .line 131
    .line 132
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :catchall_1
    move-exception p0

    .line 137
    monitor-exit v0

    .line 138
    throw p0
.end method

.method public final b(Ljava/lang/Object;Lsw;Lhw;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Le31;->g:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget-object v4, v1, Le31;->f:Lsh0;

    .line 11
    .line 12
    iget-object v5, v4, Lsh0;->d:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v6, v4, Lsh0;->f:I

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    :goto_0
    const/4 v9, 0x0

    .line 18
    if-ge v8, v6, :cond_1

    .line 19
    .line 20
    aget-object v10, v5, v8

    .line 21
    .line 22
    move-object v11, v10

    .line 23
    check-cast v11, Ld31;

    .line 24
    .line 25
    iget-object v11, v11, Ld31;->a:Lsw;

    .line 26
    .line 27
    if-ne v11, v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v10, v9

    .line 34
    :goto_1
    check-cast v10, Ld31;

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-nez v10, :cond_2

    .line 38
    .line 39
    new-instance v10, Ld31;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v5, v2}, Ls91;->m(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v10, v2}, Ld31;-><init>(Lsw;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v10}, Lsh0;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 51
    .line 52
    .line 53
    :cond_2
    monitor-exit v3

    .line 54
    iget-object v2, v1, Le31;->i:Ld31;

    .line 55
    .line 56
    iget-wide v3, v1, Le31;->j:J

    .line 57
    .line 58
    const-wide/16 v11, -0x1

    .line 59
    .line 60
    cmp-long v6, v3, v11

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    invoke-static {}, Lu50;->g()J

    .line 65
    .line 66
    .line 67
    move-result-wide v11

    .line 68
    cmp-long v6, v3, v11

    .line 69
    .line 70
    if-nez v6, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v8, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    .line 76
    .line 77
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v8, "), currentThread={id="

    .line 84
    .line 85
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lu50;->g()J

    .line 89
    .line 90
    .line 91
    move-result-wide v11

    .line 92
    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v8, ", name="

    .line 96
    .line 97
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v8, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    .line 112
    .line 113
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v6}, Lwr0;->a(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_2
    :try_start_1
    iput-object v10, v1, Le31;->i:Ld31;

    .line 124
    .line 125
    invoke-static {}, Lu50;->g()J

    .line 126
    .line 127
    .line 128
    move-result-wide v11

    .line 129
    iput-wide v11, v1, Le31;->j:J

    .line 130
    .line 131
    iget-object v15, v1, Le31;->e:Lo;

    .line 132
    .line 133
    iget-object v6, v10, Ld31;->b:Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v8, v10, Ld31;->c:Lch0;

    .line 136
    .line 137
    iget v11, v10, Ld31;->d:I

    .line 138
    .line 139
    iput-object v0, v10, Ld31;->b:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v12, v10, Ld31;->f:Ljh0;

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lch0;

    .line 148
    .line 149
    iput-object v0, v10, Ld31;->c:Lch0;

    .line 150
    .line 151
    iget v0, v10, Ld31;->d:I

    .line 152
    .line 153
    const/4 v12, -0x1

    .line 154
    if-ne v0, v12, :cond_5

    .line 155
    .line 156
    invoke-static {}, Lt21;->j()Ll21;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ll21;->g()J

    .line 161
    .line 162
    .line 163
    move-result-wide v12

    .line 164
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    iput v0, v10, Ld31;->d:I

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    goto/16 :goto_10

    .line 173
    .line 174
    :cond_5
    :goto_3
    iget-object v0, v10, Ld31;->i:Loi;

    .line 175
    .line 176
    invoke-static {}, Lr60;->k()Lsh0;

    .line 177
    .line 178
    .line 179
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    :try_start_2
    invoke-virtual {v12, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    if-nez v15, :cond_6

    .line 184
    .line 185
    invoke-interface/range {p3 .. p3}, Lhw;->invoke()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-object/from16 p2, v8

    .line 189
    .line 190
    goto/16 :goto_6

    .line 191
    .line 192
    :catchall_1
    move-exception v0

    .line 193
    move/from16 v16, v5

    .line 194
    .line 195
    goto/16 :goto_f

    .line 196
    .line 197
    :cond_6
    sget-object v0, Lt21;->b:Lo8;

    .line 198
    .line 199
    invoke-virtual {v0}, Lo8;->e()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    move-object v13, v0

    .line 204
    check-cast v13, Ll21;

    .line 205
    .line 206
    instance-of v0, v13, Le91;

    .line 207
    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    move-object v0, v13

    .line 211
    check-cast v0, Le91;

    .line 212
    .line 213
    move-object/from16 p2, v8

    .line 214
    .line 215
    iget-wide v7, v0, Le91;->t:J

    .line 216
    .line 217
    invoke-static {}, Lu50;->g()J

    .line 218
    .line 219
    .line 220
    move-result-wide v16

    .line 221
    cmp-long v0, v7, v16

    .line 222
    .line 223
    if-nez v0, :cond_8

    .line 224
    .line 225
    move-object v0, v13

    .line 226
    check-cast v0, Le91;

    .line 227
    .line 228
    iget-object v7, v0, Le91;->r:Lsw;

    .line 229
    .line 230
    move-object v0, v13

    .line 231
    check-cast v0, Le91;

    .line 232
    .line 233
    iget-object v8, v0, Le91;->s:Lsw;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 234
    .line 235
    :try_start_3
    move-object v0, v13

    .line 236
    check-cast v0, Le91;

    .line 237
    .line 238
    invoke-static {v15, v7, v5}, Lt21;->k(Lsw;Lsw;Z)Lsw;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    iput-object v9, v0, Le91;->r:Lsw;

    .line 243
    .line 244
    move-object v0, v13

    .line 245
    check-cast v0, Le91;

    .line 246
    .line 247
    iput-object v8, v0, Le91;->s:Lsw;

    .line 248
    .line 249
    invoke-interface/range {p3 .. p3}, Lhw;->invoke()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 250
    .line 251
    .line 252
    :try_start_4
    move-object v0, v13

    .line 253
    check-cast v0, Le91;

    .line 254
    .line 255
    iput-object v7, v0, Le91;->r:Lsw;

    .line 256
    .line 257
    check-cast v13, Le91;

    .line 258
    .line 259
    iput-object v8, v13, Le91;->s:Lsw;

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :catchall_2
    move-exception v0

    .line 263
    move-object v6, v13

    .line 264
    check-cast v6, Le91;

    .line 265
    .line 266
    iput-object v7, v6, Le91;->r:Lsw;

    .line 267
    .line 268
    check-cast v13, Le91;

    .line 269
    .line 270
    iput-object v8, v13, Le91;->s:Lsw;

    .line 271
    .line 272
    throw v0

    .line 273
    :cond_7
    move-object/from16 p2, v8

    .line 274
    .line 275
    :cond_8
    if-eqz v13, :cond_a

    .line 276
    .line 277
    instance-of v0, v13, Lnh0;

    .line 278
    .line 279
    if-eqz v0, :cond_9

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_9
    invoke-virtual {v13, v15}, Ll21;->u(Lsw;)Ll21;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object v13, v0

    .line 287
    goto :goto_5

    .line 288
    :cond_a
    :goto_4
    new-instance v0, Le91;

    .line 289
    .line 290
    instance-of v7, v13, Lnh0;

    .line 291
    .line 292
    if-eqz v7, :cond_b

    .line 293
    .line 294
    move-object v9, v13

    .line 295
    check-cast v9, Lnh0;

    .line 296
    .line 297
    :cond_b
    move-object v14, v9

    .line 298
    const/16 v17, 0x1

    .line 299
    .line 300
    const/16 v18, 0x0

    .line 301
    .line 302
    const/16 v16, 0x0

    .line 303
    .line 304
    move-object v13, v0

    .line 305
    invoke-direct/range {v13 .. v18}, Le91;-><init>(Lnh0;Lsw;Lsw;ZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 306
    .line 307
    .line 308
    :goto_5
    :try_start_5
    invoke-virtual {v13}, Ll21;->j()Ll21;

    .line 309
    .line 310
    .line 311
    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 312
    :try_start_6
    invoke-interface/range {p3 .. p3}, Lhw;->invoke()Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 313
    .line 314
    .line 315
    :try_start_7
    invoke-static {v7}, Ll21;->q(Ll21;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 316
    .line 317
    .line 318
    :try_start_8
    invoke-virtual {v13}, Ll21;->c()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 319
    .line 320
    .line 321
    :goto_6
    :try_start_9
    iget v0, v12, Lsh0;->f:I

    .line 322
    .line 323
    sub-int/2addr v0, v5

    .line 324
    invoke-virtual {v12, v0}, Lsh0;->k(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    iget-object v0, v10, Ld31;->b:Ljava/lang/Object;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget v7, v10, Ld31;->d:I

    .line 333
    .line 334
    iget-object v8, v10, Ld31;->c:Lch0;

    .line 335
    .line 336
    if-eqz v8, :cond_14

    .line 337
    .line 338
    iget-object v9, v8, Lch0;->a:[J

    .line 339
    .line 340
    array-length v12, v9

    .line 341
    add-int/lit8 v12, v12, -0x2

    .line 342
    .line 343
    if-ltz v12, :cond_14

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    :goto_7
    aget-wide v14, v9, v13

    .line 347
    .line 348
    move/from16 v16, v5

    .line 349
    .line 350
    move-object/from16 v17, v6

    .line 351
    .line 352
    not-long v5, v14

    .line 353
    const/16 v18, 0x7

    .line 354
    .line 355
    shl-long v5, v5, v18

    .line 356
    .line 357
    and-long/2addr v5, v14

    .line 358
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    and-long v5, v5, v19

    .line 364
    .line 365
    cmp-long v5, v5, v19

    .line 366
    .line 367
    if-eqz v5, :cond_13

    .line 368
    .line 369
    sub-int v5, v13, v12

    .line 370
    .line 371
    not-int v5, v5

    .line 372
    ushr-int/lit8 v5, v5, 0x1f

    .line 373
    .line 374
    const/16 v6, 0x8

    .line 375
    .line 376
    rsub-int/lit8 v5, v5, 0x8

    .line 377
    .line 378
    move/from16 p1, v6

    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    :goto_8
    if-ge v6, v5, :cond_11

    .line 382
    .line 383
    const-wide/16 v19, 0xff

    .line 384
    .line 385
    and-long v19, v14, v19

    .line 386
    .line 387
    const-wide/16 v21, 0x80

    .line 388
    .line 389
    cmp-long v18, v19, v21

    .line 390
    .line 391
    if-gez v18, :cond_f

    .line 392
    .line 393
    shl-int/lit8 v18, v13, 0x3

    .line 394
    .line 395
    move/from16 v19, v6

    .line 396
    .line 397
    add-int v6, v18, v19

    .line 398
    .line 399
    move-object/from16 v18, v9

    .line 400
    .line 401
    iget-object v9, v8, Lch0;->b:[Ljava/lang/Object;

    .line 402
    .line 403
    aget-object v9, v9, v6

    .line 404
    .line 405
    move-wide/from16 v20, v14

    .line 406
    .line 407
    iget-object v14, v8, Lch0;->c:[I

    .line 408
    .line 409
    aget v14, v14, v6

    .line 410
    .line 411
    if-eq v14, v7, :cond_c

    .line 412
    .line 413
    move/from16 v14, v16

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_c
    const/4 v14, 0x0

    .line 417
    :goto_9
    if-eqz v14, :cond_d

    .line 418
    .line 419
    iget-object v15, v10, Ld31;->e:Ljh0;

    .line 420
    .line 421
    invoke-static {v15, v9, v0}, Lu50;->x(Ljh0;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-object/from16 v22, v0

    .line 425
    .line 426
    instance-of v0, v9, Ldn;

    .line 427
    .line 428
    if-eqz v0, :cond_e

    .line 429
    .line 430
    invoke-virtual {v15, v9}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_e

    .line 435
    .line 436
    iget-object v0, v10, Ld31;->l:Ljh0;

    .line 437
    .line 438
    invoke-static {v0, v9}, Lu50;->y(Ljh0;Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    iget-object v0, v10, Ld31;->m:Ljava/util/HashMap;

    .line 442
    .line 443
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_d
    move-object/from16 v22, v0

    .line 448
    .line 449
    :cond_e
    :goto_a
    if-eqz v14, :cond_10

    .line 450
    .line 451
    invoke-virtual {v8, v6}, Lch0;->f(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_f
    move-object/from16 v22, v0

    .line 456
    .line 457
    move/from16 v19, v6

    .line 458
    .line 459
    move-object/from16 v18, v9

    .line 460
    .line 461
    move-wide/from16 v20, v14

    .line 462
    .line 463
    :cond_10
    :goto_b
    shr-long v14, v20, p1

    .line 464
    .line 465
    add-int/lit8 v6, v19, 0x1

    .line 466
    .line 467
    move-object/from16 v9, v18

    .line 468
    .line 469
    move-object/from16 v0, v22

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_11
    move-object/from16 v22, v0

    .line 473
    .line 474
    move-object/from16 v18, v9

    .line 475
    .line 476
    move/from16 v0, p1

    .line 477
    .line 478
    if-ne v5, v0, :cond_12

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_12
    move-object/from16 v0, v17

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_13
    move-object/from16 v22, v0

    .line 485
    .line 486
    move-object/from16 v18, v9

    .line 487
    .line 488
    :goto_c
    if-eq v13, v12, :cond_12

    .line 489
    .line 490
    add-int/lit8 v13, v13, 0x1

    .line 491
    .line 492
    move/from16 v5, v16

    .line 493
    .line 494
    move-object/from16 v6, v17

    .line 495
    .line 496
    move-object/from16 v9, v18

    .line 497
    .line 498
    move-object/from16 v0, v22

    .line 499
    .line 500
    goto/16 :goto_7

    .line 501
    .line 502
    :cond_14
    move-object v0, v6

    .line 503
    :goto_d
    iput-object v0, v10, Ld31;->b:Ljava/lang/Object;

    .line 504
    .line 505
    move-object/from16 v0, p2

    .line 506
    .line 507
    iput-object v0, v10, Ld31;->c:Lch0;

    .line 508
    .line 509
    iput v11, v10, Ld31;->d:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 510
    .line 511
    iput-object v2, v1, Le31;->i:Ld31;

    .line 512
    .line 513
    iput-wide v3, v1, Le31;->j:J

    .line 514
    .line 515
    return-void

    .line 516
    :catchall_3
    move-exception v0

    .line 517
    move/from16 v16, v5

    .line 518
    .line 519
    goto :goto_e

    .line 520
    :catchall_4
    move-exception v0

    .line 521
    move/from16 v16, v5

    .line 522
    .line 523
    :try_start_a
    invoke-static {v7}, Ll21;->q(Ll21;)V

    .line 524
    .line 525
    .line 526
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 527
    :catchall_5
    move-exception v0

    .line 528
    :goto_e
    :try_start_b
    invoke-virtual {v13}, Ll21;->c()V

    .line 529
    .line 530
    .line 531
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 532
    :catchall_6
    move-exception v0

    .line 533
    :goto_f
    :try_start_c
    iget v5, v12, Lsh0;->f:I

    .line 534
    .line 535
    add-int/lit8 v5, v5, -0x1

    .line 536
    .line 537
    invoke-virtual {v12, v5}, Lsh0;->k(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 541
    :goto_10
    iput-object v2, v1, Le31;->i:Ld31;

    .line 542
    .line 543
    iput-wide v3, v1, Le31;->j:J

    .line 544
    .line 545
    throw v0

    .line 546
    :catchall_7
    move-exception v0

    .line 547
    monitor-exit v3

    .line 548
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Le31;->d:Lya;

    .line 2
    .line 3
    sget-object v1, Lt21;->a:Lsx0;

    .line 4
    .line 5
    invoke-static {v1}, Lt21;->e(Lsw;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lt21;->c:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    sget-object v2, Lt21;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lye;->R(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sput-object v2, Lt21;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    new-instance v1, Lyk0;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lyk0;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Le31;->h:Lyk0;

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    monitor-exit v1

    .line 30
    throw p0
.end method
