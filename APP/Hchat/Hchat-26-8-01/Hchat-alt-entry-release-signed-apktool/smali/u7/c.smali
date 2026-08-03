.class public abstract Lu7/c;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final o:Ljava/lang/Object;

.field public final p:Ls7/g;

.field public final q:Ls7/h;

.field public final r:Lf1/h;

.field public s:Z


# direct methods
.method public constructor <init>(ZZLokio/a;)V
    .locals 6

    .line 1
    new-instance v0, Lp7/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/i;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lu7/c;->o:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, v0, Lp7/i;->y:Lq9/a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lp7/i;->T(Z)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lo7/c;

    .line 24
    .line 25
    iget-object v1, v0, Lp7/i;->r:Lr7/f;

    .line 26
    .line 27
    invoke-direct {p1, v1}, Lo7/c;-><init>(Lr7/f;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lo7/c;

    .line 31
    .line 32
    iget-object v2, v0, Lp7/i;->s:Lr7/f;

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lo7/c;-><init>(Lr7/f;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lr7/a;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v2, v4, v3}, Lr7/a;-><init>(IZ)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Ls7/g;

    .line 45
    .line 46
    invoke-direct {v3, v2, v0, p1, p3}, Ls7/g;-><init>(Lr7/a;Lp7/i;Lo7/c;Lokio/a;)V

    .line 47
    .line 48
    .line 49
    iput-object v3, p0, Lu7/c;->p:Ls7/g;

    .line 50
    .line 51
    new-instance p3, Ls7/h;

    .line 52
    .line 53
    iget-object v4, v0, Lp7/i;->x:Lr7/f;

    .line 54
    .line 55
    sget-object v5, Lr7/u;->q:Lokio/a;

    .line 56
    .line 57
    invoke-direct {p3, v4, v1, v5}, Ls7/d;-><init>(Lr7/f;Lo7/c;Lk7/f;)V

    .line 58
    .line 59
    .line 60
    iput-object p3, p0, Lu7/c;->q:Ls7/h;

    .line 61
    .line 62
    new-instance v4, Ls7/i;

    .line 63
    .line 64
    iget-object v0, v0, Lp7/i;->s:Lr7/f;

    .line 65
    .line 66
    invoke-direct {v4, v0}, Ls7/i;-><init>(Lr7/f;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lo7/d;->P(Lk7/a;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p3}, Lo7/d;->P(Lk7/a;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v4}, Lo7/d;->P(Lk7/a;)V

    .line 85
    .line 86
    .line 87
    iput-boolean p2, p0, Lu7/c;->s:Z

    .line 88
    .line 89
    new-instance p1, Lf1/h;

    .line 90
    .line 91
    invoke-direct {p1}, Lf1/h;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lu7/c;->r:Lf1/h;

    .line 95
    .line 96
    new-instance p2, Lb8/c;

    .line 97
    .line 98
    const/16 p3, 0xb

    .line 99
    .line 100
    invoke-direct {p2, p3}, Lb8/c;-><init>(I)V

    .line 101
    .line 102
    .line 103
    iget-object p3, p1, Lf1/h;->i:Ljava/lang/Object;

    .line 104
    .line 105
    monitor-enter p3

    .line 106
    :try_start_0
    iput-object p2, p1, Lf1/h;->k:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-exit p3

    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    throw p1
.end method


# virtual methods
.method public M()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu7/c;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public R()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu7/c;->X()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu7/c;->a0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final S()V
    .locals 0

    .line 1
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu7/c;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu7/c;->s:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lu7/c;->s:Z

    .line 14
    .line 15
    invoke-virtual {p0}, Lu7/c;->W()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lu7/c;->a0()V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
.end method

.method public final V(I)Lr7/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->p:Ls7/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo7/b;->Q(I)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lr7/s;

    .line 8
    .line 9
    return-object p1
.end method

.method public W()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->q:Ls7/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls7/h;->m0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final X()V
    .locals 7

    .line 1
    iget-object v0, p0, Lu7/c;->p:Ls7/g;

    .line 2
    .line 3
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lu7/c;->q:Ls7/h;

    .line 10
    .line 11
    iget-object v3, v2, Lo7/b;->k:Lz7/c;

    .line 12
    .line 13
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v3

    .line 21
    :goto_0
    const/4 v3, 0x0

    .line 22
    :goto_1
    if-ge v3, v1, :cond_4

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lr7/u;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lr7/s;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    iget-object v6, v5, Lr7/s;->q:Lr7/u;

    .line 39
    .line 40
    if-ne v6, v4, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    if-nez v6, :cond_2

    .line 44
    .line 45
    iput-object v4, v5, Lr7/s;->q:Lr7/u;

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Lr7/u;->S(Lr7/s;)V

    .line 48
    .line 49
    .line 50
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const-string v0, "Style item is already linked"

    .line 54
    .line 55
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v0, "Can not link null style item"

    .line 63
    .line 64
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    invoke-virtual {v2}, Ls7/h;->m0()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public Y(ILr7/s;)V
    .locals 0

    .line 1
    return-void
.end method

.method public Z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->q:Ls7/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls7/h;->n0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lu7/c;->r:Lf1/h;

    .line 2
    .line 3
    iget-object v1, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashMap;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto/16 :goto_8

    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    if-nez v0, :cond_b

    .line 24
    .line 25
    iget-object v0, p0, Lu7/c;->r:Lf1/h;

    .line 26
    .line 27
    iget-object v1, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_1
    iget-object v2, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ljava/util/HashMap;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget v4, v0, Lf1/h;->h:I

    .line 38
    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    iput v4, v0, Lf1/h;->h:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_1
    :goto_1
    iput-object v3, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 54
    .line 55
    .line 56
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    iget-object v0, p0, Lu7/c;->r:Lf1/h;

    .line 58
    .line 59
    invoke-virtual {p0}, Lu7/c;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v2

    .line 66
    :try_start_2
    iput v1, v0, Lf1/h;->h:I

    .line 67
    .line 68
    iget-object v1, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ljava/util/HashMap;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    iput-object v3, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_2
    move-exception v0

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_3
    :goto_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    iget-object v0, p0, Lu7/c;->r:Lf1/h;

    .line 88
    .line 89
    invoke-virtual {p0}, Lu7/c;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v3, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 94
    .line 95
    monitor-enter v3

    .line 96
    :cond_4
    :goto_3
    :try_start_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_a

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v4, v2

    .line 107
    check-cast v4, Lr7/s;

    .line 108
    .line 109
    invoke-virtual {v4}, Lr7/s;->Y()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    iget-object v5, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v5, Ljava/util/HashMap;

    .line 121
    .line 122
    if-nez v5, :cond_7

    .line 123
    .line 124
    iget v5, v0, Lf1/h;->h:I

    .line 125
    .line 126
    if-nez v5, :cond_6

    .line 127
    .line 128
    new-instance v5, Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    new-instance v6, Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-direct {v6, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 137
    .line 138
    .line 139
    move-object v5, v6

    .line 140
    :goto_4
    iput-object v5, v0, Lf1/h;->j:Ljava/lang/Object;

    .line 141
    .line 142
    :cond_7
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-nez v6, :cond_8

    .line 147
    .line 148
    invoke-interface {v5, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    const-class v8, Lz7/o;

    .line 157
    .line 158
    if-ne v7, v8, :cond_9

    .line 159
    .line 160
    check-cast v6, Lz7/o;

    .line 161
    .line 162
    invoke-virtual {v6, v2}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_4

    .line 167
    .line 168
    invoke-virtual {v6, v2}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v6}, Lf1/h;->E(Lz7/o;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_9
    invoke-interface {v5, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v0, v6, v2}, Lf1/h;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-interface {v5, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :catchall_3
    move-exception v0

    .line 188
    goto :goto_5

    .line 189
    :cond_a
    monitor-exit v3

    .line 190
    return-void

    .line 191
    :goto_5
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 192
    throw v0

    .line 193
    :goto_6
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 194
    throw v0

    .line 195
    :goto_7
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 196
    throw v0

    .line 197
    :cond_b
    return-void

    .line 198
    :goto_8
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 199
    throw v0
.end method

.method public final b0(Lr7/m;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Lr7/g;->get()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Lu7/c;->V(I)Lr7/s;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lr7/s;->a0(Lr7/m;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->p:Ls7/g;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final r()[B
    .locals 2

    .line 1
    new-instance v0, Lx7/b;

    .line 2
    .line 3
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 4
    .line 5
    check-cast v1, Lp7/i;

    .line 6
    .line 7
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 8
    .line 9
    iget v1, v1, Lr7/f;->n:I

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lx7/b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0, v0}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lx7/b;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :catch_0
    invoke-virtual {v0}, Lx7/b;->toByteArray()[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->p:Ls7/g;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
