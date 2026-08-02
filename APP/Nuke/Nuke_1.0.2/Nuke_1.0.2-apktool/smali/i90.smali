.class public final Li90;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements La90;


# instance fields
.field public final h:Ldq1;

.field public final i:Ljava/io/File;

.field public final j:J

.field public final k:Z

.field public final l:Lsz0;

.field public m:Lh90;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsz0;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lsz0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li90;->l:Lsz0;

    .line 12
    .line 13
    iput-object p1, p0, Li90;->i:Ljava/io/File;

    .line 14
    .line 15
    const-wide/32 v0, 0xfa00000

    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Li90;->j:J

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Li90;->k:Z

    .line 22
    .line 23
    new-instance p1, Ldq1;

    .line 24
    .line 25
    const/16 v0, 0x9

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ldq1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Li90;->h:Ldq1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lh90;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Li90;->m:Lh90;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Li90;->i:Ljava/io/File;

    .line 7
    .line 8
    iget-wide v1, p0, Li90;->j:J

    .line 9
    .line 10
    iget-boolean v3, p0, Li90;->k:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lh90;->h(Ljava/io/File;JZ)Lh90;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Li90;->m:Lh90;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    iget-object v0, p0, Li90;->m:Lh90;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-object v0

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
.end method

.method public final d(La51;)Ljava/io/File;
    .locals 5

    .line 1
    const-string v0, ".0"

    .line 2
    .line 3
    iget-object v1, p0, Li90;->h:Ldq1;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ldq1;->G(La51;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    const-string v3, "DiskLruCacheWrapper"

    .line 11
    .line 12
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v4, "Get: Obtained: "

    .line 21
    .line 22
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, " for for Key: "

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Li90;->a()Lh90;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v1}, Lh90;->k(Ljava/lang/String;)Lb5;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, [Ljava/io/File;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    aget-object p0, p1, p0

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    new-instance p1, Ljava/io/File;

    .line 64
    .line 65
    iget-object v1, p0, Lb5;->k:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lh90;

    .line 68
    .line 69
    iget-object v1, v1, Lh90;->h:Ljava/io/File;

    .line 70
    .line 71
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {p1, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :catch_0
    move-exception p0

    .line 84
    const/4 p1, 0x5

    .line 85
    invoke-static {v3, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    const-string p1, "Unable to get from disk cache"

    .line 92
    .line 93
    invoke-static {v3, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 94
    .line 95
    .line 96
    :cond_2
    const/4 p0, 0x0

    .line 97
    return-object p0
.end method

.method public final j(La51;Lb5;)V
    .locals 7

    .line 1
    const-string v0, "Had two simultaneous puts for: "

    .line 2
    .line 3
    const-string v1, "Put: Obtained: "

    .line 4
    .line 5
    iget-object v2, p0, Li90;->h:Ldq1;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Ldq1;->G(La51;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Li90;->l:Lsz0;

    .line 12
    .line 13
    monitor-enter v3

    .line 14
    :try_start_0
    iget-object v4, v3, Lsz0;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lc90;

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    iget-object v4, v3, Lsz0;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lfo;

    .line 29
    .line 30
    iget-object v5, v4, Lfo;->a:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :try_start_1
    iget-object v4, v4, Lfo;->a:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lc90;

    .line 40
    .line 41
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    :try_start_2
    new-instance v4, Lc90;

    .line 45
    .line 46
    invoke-direct {v4}, Lc90;-><init>()V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v5, v3, Lsz0;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :catchall_1
    move-exception p0

    .line 61
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :try_start_4
    throw p0

    .line 63
    :cond_1
    :goto_0
    iget v5, v4, Lc90;->b:I

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    add-int/2addr v5, v6

    .line 67
    iput v5, v4, Lc90;->b:I

    .line 68
    .line 69
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    iget-object v3, v4, Lc90;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 73
    .line 74
    .line 75
    :try_start_5
    const-string v3, "DiskLruCacheWrapper"

    .line 76
    .line 77
    const/4 v4, 0x2

    .line 78
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    const-string v3, "DiskLruCacheWrapper"

    .line 85
    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, " for for Key: "

    .line 95
    .line 96
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_2
    move-exception p1

    .line 111
    goto :goto_4

    .line 112
    :cond_2
    :goto_1
    :try_start_6
    invoke-virtual {p0}, Li90;->a()Lh90;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1, v2}, Lh90;->k(Ljava/lang/String;)Lb5;

    .line 117
    .line 118
    .line 119
    move-result-object v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    :catch_0
    :cond_3
    :goto_2
    iget-object p0, p0, Li90;->l:Lsz0;

    .line 123
    .line 124
    invoke-virtual {p0, v2}, Lsz0;->L(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_4
    :try_start_7
    invoke-virtual {p1, v2}, Lh90;->g(Ljava/lang/String;)Lf90;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    :try_start_8
    invoke-virtual {p1}, Lf90;->d()Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v1, p2, Lb5;->i:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Lwe0;

    .line 141
    .line 142
    iget-object v3, p2, Lb5;->j:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object p2, p2, Lb5;->k:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p2, Lov1;

    .line 147
    .line 148
    invoke-interface {v1, v3, v0, p2}, Lwe0;->c(Ljava/lang/Object;Ljava/io/File;Lov1;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_5

    .line 153
    .line 154
    iget-object p2, p1, Lf90;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p2, Lh90;

    .line 157
    .line 158
    invoke-static {p2, p1, v6}, Lh90;->b(Lh90;Lf90;Z)V

    .line 159
    .line 160
    .line 161
    iput-boolean v6, p1, Lf90;->a:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 162
    .line 163
    :cond_5
    :try_start_9
    iget-boolean p2, p1, Lf90;->a:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 164
    .line 165
    if-nez p2, :cond_3

    .line 166
    .line 167
    :try_start_a
    invoke-virtual {p1}, Lf90;->a()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :catch_1
    move-exception p1

    .line 172
    goto :goto_3

    .line 173
    :catchall_3
    move-exception p2

    .line 174
    :try_start_b
    iget-boolean v0, p1, Lf90;->a:Z
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 175
    .line 176
    if-nez v0, :cond_6

    .line 177
    .line 178
    :try_start_c
    invoke-virtual {p1}, Lf90;->a()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 179
    .line 180
    .line 181
    :catch_2
    :cond_6
    :try_start_d
    throw p2

    .line 182
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p1
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 192
    :goto_3
    :try_start_e
    const-string p2, "DiskLruCacheWrapper"

    .line 193
    .line 194
    const/4 v0, 0x5

    .line 195
    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_3

    .line 200
    .line 201
    const-string p2, "DiskLruCacheWrapper"

    .line 202
    .line 203
    const-string v0, "Unable to put to disk cache"

    .line 204
    .line 205
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_4
    iget-object p0, p0, Li90;->l:Lsz0;

    .line 210
    .line 211
    invoke-virtual {p0, v2}, Lsz0;->L(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1

    .line 215
    :goto_5
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 216
    throw p0
.end method
