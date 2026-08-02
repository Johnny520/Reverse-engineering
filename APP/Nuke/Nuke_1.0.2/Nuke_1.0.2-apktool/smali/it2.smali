.class public final Lit2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lh40;
.implements Lg40;


# instance fields
.field public final h:Lt40;

.field public final i:Lw40;

.field public volatile j:I

.field public volatile k:Lc40;

.field public volatile l:Ljava/lang/Object;

.field public volatile m:Lih1;

.field public volatile n:Ld40;


# direct methods
.method public constructor <init>(Lt40;Lw40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lit2;->h:Lt40;

    .line 5
    .line 6
    iput-object p2, p0, Lit2;->i:Lw40;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La51;Ljava/lang/Object;Lf40;ILa51;)V
    .locals 0

    .line 1
    move-object p4, p0

    .line 2
    iget-object p0, p4, Lit2;->i:Lw40;

    .line 3
    .line 4
    iget-object p4, p4, Lit2;->m:Lih1;

    .line 5
    .line 6
    iget-object p4, p4, Lih1;->c:Lf40;

    .line 7
    .line 8
    invoke-interface {p4}, Lf40;->e()I

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    move-object p5, p1

    .line 13
    invoke-virtual/range {p0 .. p5}, Lw40;->a(La51;Ljava/lang/Object;Lf40;ILa51;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b(La51;Ljava/lang/Exception;Lf40;I)V
    .locals 0

    .line 1
    iget-object p4, p0, Lit2;->i:Lw40;

    .line 2
    .line 3
    iget-object p0, p0, Lit2;->m:Lih1;

    .line 4
    .line 5
    iget-object p0, p0, Lih1;->c:Lf40;

    .line 6
    .line 7
    invoke-interface {p0}, Lf40;->e()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p4, p1, p2, p3, p0}, Lw40;->b(La51;Ljava/lang/Exception;Lf40;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lit2;->l:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lit2;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v1, p0, Lit2;->l:Ljava/lang/Object;

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, v0}, Lit2;->d(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    const/4 v3, 0x3

    .line 20
    const-string v4, "SourceGenerator"

    .line 21
    .line 22
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const-string v3, "Failed to properly rewind or write data to cache"

    .line 29
    .line 30
    invoke-static {v4, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lit2;->k:Lc40;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lit2;->k:Lc40;

    .line 38
    .line 39
    invoke-virtual {v0}, Lc40;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    :goto_0
    return v2

    .line 46
    :cond_1
    iput-object v1, p0, Lit2;->k:Lc40;

    .line 47
    .line 48
    iput-object v1, p0, Lit2;->m:Lih1;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :cond_2
    :goto_1
    if-nez v0, :cond_4

    .line 52
    .line 53
    iget v1, p0, Lit2;->j:I

    .line 54
    .line 55
    iget-object v3, p0, Lit2;->h:Lt40;

    .line 56
    .line 57
    invoke-virtual {v3}, Lt40;->b()Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v1, v3, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lit2;->h:Lt40;

    .line 68
    .line 69
    invoke-virtual {v1}, Lt40;->b()Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v3, p0, Lit2;->j:I

    .line 74
    .line 75
    add-int/lit8 v4, v3, 0x1

    .line 76
    .line 77
    iput v4, p0, Lit2;->j:I

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lih1;

    .line 84
    .line 85
    iput-object v1, p0, Lit2;->m:Lih1;

    .line 86
    .line 87
    iget-object v1, p0, Lit2;->m:Lih1;

    .line 88
    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    iget-object v1, p0, Lit2;->h:Lt40;

    .line 92
    .line 93
    iget-object v1, v1, Lt40;->p:Lb90;

    .line 94
    .line 95
    iget-object v3, p0, Lit2;->m:Lih1;

    .line 96
    .line 97
    iget-object v3, v3, Lih1;->c:Lf40;

    .line 98
    .line 99
    invoke-interface {v3}, Lf40;->e()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1, v3}, Lb90;->a(I)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    iget-object v1, p0, Lit2;->h:Lt40;

    .line 110
    .line 111
    iget-object v3, p0, Lit2;->m:Lih1;

    .line 112
    .line 113
    iget-object v3, v3, Lih1;->c:Lf40;

    .line 114
    .line 115
    invoke-interface {v3}, Lf40;->a()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Lt40;->c(Ljava/lang/Class;)Lwb1;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    :cond_3
    iget-object v0, p0, Lit2;->m:Lih1;

    .line 126
    .line 127
    iget-object v1, p0, Lit2;->m:Lih1;

    .line 128
    .line 129
    iget-object v1, v1, Lih1;->c:Lf40;

    .line 130
    .line 131
    iget-object v3, p0, Lit2;->h:Lt40;

    .line 132
    .line 133
    iget-object v3, v3, Lt40;->o:Li32;

    .line 134
    .line 135
    new-instance v4, Ldq1;

    .line 136
    .line 137
    const/16 v5, 0xe

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    invoke-direct {v4, v5, p0, v0, v6}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1, v3, v4}, Lf40;->c(Li32;Le40;)V

    .line 144
    .line 145
    .line 146
    move v0, v2

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    return v0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lit2;->m:Lih1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lih1;->c:Lf40;

    .line 6
    .line 7
    invoke-interface {p0}, Lf40;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    const-string v0, "SourceGenerator"

    .line 2
    .line 3
    const-string v1, "Attempt to write: "

    .line 4
    .line 5
    const-string v2, "Finished encoding source to cache, key: "

    .line 6
    .line 7
    sget v3, Ltc1;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    const/4 v5, 0x0

    .line 14
    :try_start_0
    iget-object v6, p0, Lit2;->h:Lt40;

    .line 15
    .line 16
    iget-object v6, v6, Lt40;->c:Lvp0;

    .line 17
    .line 18
    invoke-virtual {v6}, Lvp0;->a()Lv72;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-virtual {v6, p1}, Lv72;->g(Ljava/lang/Object;)Lk40;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-interface {v6}, Lk40;->f()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    iget-object v8, p0, Lit2;->h:Lt40;

    .line 31
    .line 32
    invoke-virtual {v8, v7}, Lt40;->d(Ljava/lang/Object;)Lwe0;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    new-instance v9, Lb5;

    .line 37
    .line 38
    iget-object v10, p0, Lit2;->h:Lt40;

    .line 39
    .line 40
    iget-object v10, v10, Lt40;->i:Lov1;

    .line 41
    .line 42
    const/4 v11, 0x5

    .line 43
    invoke-direct {v9, v8, v7, v10, v11}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v7, Ld40;

    .line 47
    .line 48
    iget-object v10, p0, Lit2;->m:Lih1;

    .line 49
    .line 50
    iget-object v10, v10, Lih1;->a:La51;

    .line 51
    .line 52
    iget-object v11, p0, Lit2;->h:Lt40;

    .line 53
    .line 54
    iget-object v12, v11, Lt40;->n:La51;

    .line 55
    .line 56
    invoke-direct {v7, v10, v12}, Ld40;-><init>(La51;La51;)V

    .line 57
    .line 58
    .line 59
    iget-object v10, v11, Lt40;->h:Laf0;

    .line 60
    .line 61
    invoke-virtual {v10}, Laf0;->a()La90;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-interface {v10, v7, v9}, La90;->j(La51;Lb5;)V

    .line 66
    .line 67
    .line 68
    const/4 v9, 0x2

    .line 69
    invoke-static {v0, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 70
    .line 71
    .line 72
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    const-string v11, ", data: "

    .line 74
    .line 75
    if-eqz v9, :cond_0

    .line 76
    .line 77
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v2, ", encoder: "

    .line 92
    .line 93
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v2, ", duration: "

    .line 100
    .line 101
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-static {v3, v4}, Ltc1;->a(J)D

    .line 105
    .line 106
    .line 107
    move-result-wide v2

    .line 108
    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    move-object p1, v0

    .line 121
    goto :goto_1

    .line 122
    :cond_0
    :goto_0
    invoke-interface {v10, v7}, La90;->d(La51;)Ljava/io/File;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/4 v3, 0x1

    .line 127
    if-eqz v2, :cond_1

    .line 128
    .line 129
    iput-object v7, p0, Lit2;->n:Ld40;

    .line 130
    .line 131
    new-instance p1, Lc40;

    .line 132
    .line 133
    iget-object v0, p0, Lit2;->m:Lih1;

    .line 134
    .line 135
    iget-object v0, v0, Lih1;->a:La51;

    .line 136
    .line 137
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v1, p0, Lit2;->h:Lt40;

    .line 142
    .line 143
    invoke-direct {p1, v0, v1, p0}, Lc40;-><init>(Ljava/util/List;Lt40;Lg40;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lit2;->k:Lc40;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    .line 148
    iget-object p0, p0, Lit2;->m:Lih1;

    .line 149
    .line 150
    iget-object p0, p0, Lih1;->c:Lf40;

    .line 151
    .line 152
    invoke-interface {p0}, Lf40;->b()V

    .line 153
    .line 154
    .line 155
    return v3

    .line 156
    :cond_1
    const/4 v2, 0x3

    .line 157
    :try_start_2
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lit2;->n:Ld40;

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    .line 180
    .line 181
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    .line 190
    .line 191
    :cond_2
    move-object p1, v6

    .line 192
    :try_start_3
    iget-object v6, p0, Lit2;->i:Lw40;

    .line 193
    .line 194
    iget-object v0, p0, Lit2;->m:Lih1;

    .line 195
    .line 196
    iget-object v7, v0, Lih1;->a:La51;

    .line 197
    .line 198
    invoke-interface {p1}, Lk40;->f()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    iget-object p1, p0, Lit2;->m:Lih1;

    .line 203
    .line 204
    iget-object v9, p1, Lih1;->c:Lf40;

    .line 205
    .line 206
    iget-object p1, p0, Lit2;->m:Lih1;

    .line 207
    .line 208
    iget-object p1, p1, Lih1;->c:Lf40;

    .line 209
    .line 210
    invoke-interface {p1}, Lf40;->e()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    iget-object p1, p0, Lit2;->m:Lih1;

    .line 215
    .line 216
    iget-object v11, p1, Lih1;->a:La51;

    .line 217
    .line 218
    invoke-virtual/range {v6 .. v11}, Lw40;->a(La51;Ljava/lang/Object;Lf40;ILa51;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    .line 220
    .line 221
    return v5

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    move-object p1, v0

    .line 224
    move v5, v3

    .line 225
    :goto_1
    if-nez v5, :cond_3

    .line 226
    .line 227
    iget-object p0, p0, Lit2;->m:Lih1;

    .line 228
    .line 229
    iget-object p0, p0, Lih1;->c:Lf40;

    .line 230
    .line 231
    invoke-interface {p0}, Lf40;->b()V

    .line 232
    .line 233
    .line 234
    :cond_3
    throw p1
.end method
