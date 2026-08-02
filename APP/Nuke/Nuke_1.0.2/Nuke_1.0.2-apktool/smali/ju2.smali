.class public final Lju2;
.super Ln3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzj0;
.implements Lhu2;
.implements Lvk1;


# static fields
.field public static final synthetic m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public l:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Lju2;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lju2;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lju2;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lak0;Lt00;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Liu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Liu2;

    .line 7
    .line 8
    iget v1, v0, Liu2;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Liu2;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Liu2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Liu2;-><init>(Lju2;Lt00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Liu2;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Liu2;->r:I

    .line 28
    .line 29
    sget-object v2, Lk20;->h:Lk20;

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v5, :cond_3

    .line 38
    .line 39
    if-eq v1, v4, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Liu2;->n:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, v0, Liu2;->m:Lk21;

    .line 46
    .line 47
    iget-object v7, v0, Liu2;->l:Lku2;

    .line 48
    .line 49
    iget-object v8, v0, Liu2;->k:Lak0;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_2
    iget-object p1, v0, Liu2;->o:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v1, v0, Liu2;->m:Lk21;

    .line 67
    .line 68
    iget-object v7, v0, Liu2;->l:Lku2;

    .line 69
    .line 70
    iget-object v8, v0, Liu2;->k:Lak0;

    .line 71
    .line 72
    :try_start_1
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_3
    iget-object v7, v0, Liu2;->l:Lku2;

    .line 77
    .line 78
    iget-object p1, v0, Liu2;->k:Lak0;

    .line 79
    .line 80
    :try_start_2
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-static {p2}, Lfg1;->T(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ln3;->b()Lo3;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Lku2;

    .line 92
    .line 93
    move-object v7, p2

    .line 94
    :goto_1
    :try_start_3
    iget-object p2, v0, Lu00;->i:La20;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v1, Lsn;->K:Lsn;

    .line 100
    .line 101
    invoke-interface {p2, v1}, La20;->o(Lz10;)Ly10;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Lk21;

    .line 106
    .line 107
    move-object v8, p1

    .line 108
    move-object v1, p2

    .line 109
    move-object p1, v6

    .line 110
    :cond_5
    :goto_2
    sget-object p2, Lju2;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 111
    .line 112
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    invoke-interface {v1}, Lk21;->b()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    invoke-interface {v1}, Lk21;->q()Ljava/util/concurrent/CancellationException;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    throw p1

    .line 130
    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_b

    .line 137
    .line 138
    :cond_8
    sget-object p1, Lup0;->e:Lhh1;

    .line 139
    .line 140
    if-ne p2, p1, :cond_9

    .line 141
    .line 142
    move-object p1, v6

    .line 143
    goto :goto_4

    .line 144
    :cond_9
    move-object p1, p2

    .line 145
    :goto_4
    iput-object v8, v0, Liu2;->k:Lak0;

    .line 146
    .line 147
    iput-object v7, v0, Liu2;->l:Lku2;

    .line 148
    .line 149
    iput-object v1, v0, Liu2;->m:Lk21;

    .line 150
    .line 151
    iput-object v6, v0, Liu2;->n:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p2, v0, Liu2;->o:Ljava/lang/Object;

    .line 154
    .line 155
    iput v4, v0, Liu2;->r:I

    .line 156
    .line 157
    invoke-interface {v8, p1, v0}, Lak0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, v2, :cond_a

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_a
    move-object p1, p2

    .line 165
    :cond_b
    :goto_5
    iget-object p2, v7, Lku2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 166
    .line 167
    sget-object v9, Lpp0;->i:Lhh1;

    .line 168
    .line 169
    invoke-virtual {p2, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    sget-object v10, Lpp0;->j:Lhh1;

    .line 177
    .line 178
    if-ne p2, v10, :cond_c

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_c
    iput-object v8, v0, Liu2;->k:Lak0;

    .line 182
    .line 183
    iput-object v7, v0, Liu2;->l:Lku2;

    .line 184
    .line 185
    iput-object v1, v0, Liu2;->m:Lk21;

    .line 186
    .line 187
    iput-object p1, v0, Liu2;->n:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v6, v0, Liu2;->o:Ljava/lang/Object;

    .line 190
    .line 191
    iput v3, v0, Liu2;->r:I

    .line 192
    .line 193
    sget-object p2, La83;->a:La83;

    .line 194
    .line 195
    new-instance v10, Lmp;

    .line 196
    .line 197
    invoke-static {v0}, Lgf1;->z(Lt00;)Lt00;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-direct {v10, v5, v11}, Lmp;-><init>(ILt00;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10}, Lmp;->u()V

    .line 205
    .line 206
    .line 207
    iget-object v11, v7, Lku2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 208
    .line 209
    :cond_d
    invoke-virtual {v11, v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_e

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_e
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    if-eq v12, v9, :cond_d

    .line 221
    .line 222
    invoke-virtual {v10, p2}, Lmp;->h(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :goto_6
    invoke-virtual {v10}, Lmp;->t()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 229
    if-ne v9, v2, :cond_f

    .line 230
    .line 231
    move-object p2, v9

    .line 232
    :cond_f
    if-ne p2, v2, :cond_5

    .line 233
    .line 234
    :goto_7
    return-object v2

    .line 235
    :goto_8
    invoke-virtual {p0, v7}, Ln3;->e(Lo3;)V

    .line 236
    .line 237
    .line 238
    throw p1
.end method

.method public final c()Lo3;
    .locals 0

    .line 1
    new-instance p0, Lku2;

    .line 2
    .line 3
    invoke-direct {p0}, Lku2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final d()[Lo3;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [Lku2;

    .line 3
    .line 4
    return-object p0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lup0;->e:Lhh1;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lup0;->e:Lhh1;

    .line 2
    .line 3
    sget-object v1, Lju2;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    return-object p0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lju2;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lju2;->l:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Lju2;->l:I

    .line 42
    .line 43
    iget-object p2, p0, Ln3;->h:[Lo3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    check-cast p2, [Lku2;

    .line 47
    .line 48
    if-eqz p2, :cond_9

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    move v3, v2

    .line 52
    :goto_1
    if-ge v3, v0, :cond_9

    .line 53
    .line 54
    aget-object v4, p2, v3

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    iget-object v4, v4, Lku2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    sget-object v6, Lpp0;->j:Lhh1;

    .line 68
    .line 69
    if-ne v5, v6, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    sget-object v7, Lpp0;->i:Lhh1;

    .line 73
    .line 74
    if-ne v5, v7, :cond_6

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-eq v7, v5, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    check-cast v5, Lmp;

    .line 97
    .line 98
    sget-object v4, La83;->a:La83;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Lmp;->h(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eq v6, v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, Lju2;->l:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, Lju2;->l:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, Ln3;->h:[Lo3;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v8, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, Lju2;->l:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method

.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lju2;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, La83;->a:La83;

    .line 5
    .line 6
    return-object p0
.end method
