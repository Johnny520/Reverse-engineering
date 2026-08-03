.class public final Li0/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public final D:Li0/g0;

.field public final E:Ljava/util/ArrayList;

.field public F:Z

.field public G:Ll0/g;

.field public H:Ll0/h;

.field public I:Ll0/k;

.field public J:Z

.field public K:Ls0/h;

.field public L:Lm0/a;

.field public final M:Lm0/b;

.field public N:Ll0/b;

.field public O:Lm0/c;

.field public P:Li0/e2;

.field public final Q:Lx0/d;

.field public final R:Lwf/g;

.field public S:Z

.field public T:J

.field public U:Li0/i0;

.field public final a:Lx1/f2;

.field public final b:Li0/o;

.field public final c:Ll0/h;

.field public final d:Lf/n0;

.field public final e:Lm0/a;

.field public final f:Lm0/a;

.field public final g:Landroidx/lifecycle/x;

.field public final h:Li0/q;

.field public final i:Ljava/util/ArrayList;

.field public j:Li0/j0;

.field public k:I

.field public l:I

.field public m:I

.field public final n:Li0/m0;

.field public o:[I

.field public p:Lf/u;

.field public q:Z

.field public r:Z

.field public final s:Ljava/util/ArrayList;

.field public final t:Li0/m0;

.field public u:Ls0/h;

.field public v:Lf/w;

.field public w:Z

.field public final x:Li0/m0;

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Lx1/f2;Li0/o;Ll0/h;Lf/n0;Lm0/a;Lm0/a;Landroidx/lifecycle/x;Li0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/h0;->a:Lx1/f2;

    .line 5
    .line 6
    iput-object p2, p0, Li0/h0;->b:Li0/o;

    .line 7
    .line 8
    iput-object p3, p0, Li0/h0;->c:Ll0/h;

    .line 9
    .line 10
    iput-object p4, p0, Li0/h0;->d:Lf/n0;

    .line 11
    .line 12
    iput-object p5, p0, Li0/h0;->e:Lm0/a;

    .line 13
    .line 14
    iput-object p6, p0, Li0/h0;->f:Lm0/a;

    .line 15
    .line 16
    iput-object p7, p0, Li0/h0;->g:Landroidx/lifecycle/x;

    .line 17
    .line 18
    iput-object p8, p0, Li0/h0;->h:Li0/q;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance p1, Li0/m0;

    .line 28
    .line 29
    invoke-direct {p1}, Li0/m0;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Li0/h0;->n:Li0/m0;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance p1, Li0/m0;

    .line 42
    .line 43
    invoke-direct {p1}, Li0/m0;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Li0/h0;->t:Li0/m0;

    .line 47
    .line 48
    sget-object p1, Ls0/h;->j:Ls0/h;

    .line 49
    .line 50
    iput-object p1, p0, Li0/h0;->u:Ls0/h;

    .line 51
    .line 52
    new-instance p1, Li0/m0;

    .line 53
    .line 54
    invoke-direct {p1}, Li0/m0;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Li0/h0;->x:Li0/m0;

    .line 58
    .line 59
    const/4 p1, -0x1

    .line 60
    iput p1, p0, Li0/h0;->z:I

    .line 61
    .line 62
    invoke-virtual {p2}, Li0/o;->f()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 p4, 0x0

    .line 67
    const/4 p6, 0x1

    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p2}, Li0/o;->d()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move p1, p4

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    :goto_0
    move p1, p6

    .line 80
    :goto_1
    iput-boolean p1, p0, Li0/h0;->C:Z

    .line 81
    .line 82
    new-instance p1, Li0/g0;

    .line 83
    .line 84
    const/4 p7, 0x0

    .line 85
    invoke-direct {p1, p0, p7}, Li0/g0;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Li0/h0;->D:Li0/g0;

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Li0/h0;->E:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p3}, Ll0/h;->d()Ll0/g;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ll0/g;->c()V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Li0/h0;->G:Ll0/g;

    .line 105
    .line 106
    new-instance p1, Ll0/h;

    .line 107
    .line 108
    invoke-direct {p1}, Ll0/h;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Li0/o;->f()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-eqz p3, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1}, Ll0/h;->c()V

    .line 118
    .line 119
    .line 120
    :cond_2
    invoke-virtual {p2}, Li0/o;->d()Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_3

    .line 125
    .line 126
    new-instance p3, Lf/w;

    .line 127
    .line 128
    invoke-direct {p3}, Lf/w;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object p3, p1, Ll0/h;->q:Lf/w;

    .line 132
    .line 133
    :cond_3
    iput-object p1, p0, Li0/h0;->H:Ll0/h;

    .line 134
    .line 135
    invoke-virtual {p1}, Ll0/h;->e()Ll0/k;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, p6}, Ll0/k;->e(Z)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Li0/h0;->I:Ll0/k;

    .line 143
    .line 144
    new-instance p1, Lm0/b;

    .line 145
    .line 146
    invoke-direct {p1, p0, p5}, Lm0/b;-><init>(Li0/h0;Lm0/a;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Li0/h0;->M:Lm0/b;

    .line 150
    .line 151
    iget-object p1, p0, Li0/h0;->H:Ll0/h;

    .line 152
    .line 153
    invoke-virtual {p1}, Ll0/h;->d()Ll0/g;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :try_start_0
    invoke-virtual {p1, p4}, Ll0/g;->a(I)Ll0/b;

    .line 158
    .line 159
    .line 160
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    invoke-virtual {p1}, Ll0/g;->c()V

    .line 162
    .line 163
    .line 164
    iput-object p3, p0, Li0/h0;->N:Ll0/b;

    .line 165
    .line 166
    new-instance p1, Lm0/c;

    .line 167
    .line 168
    invoke-direct {p1}, Lm0/c;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Li0/h0;->O:Lm0/c;

    .line 172
    .line 173
    new-instance p1, Lx0/d;

    .line 174
    .line 175
    invoke-direct {p1, p0}, Lx0/d;-><init>(Li0/h0;)V

    .line 176
    .line 177
    .line 178
    iput-object p1, p0, Li0/h0;->Q:Lx0/d;

    .line 179
    .line 180
    invoke-virtual {p2}, Li0/o;->j()Lwf/g;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p0}, Li0/h0;->C()Lx0/d;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-eqz p2, :cond_4

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_4
    sget-object p2, Lwf/h;->g:Lwf/h;

    .line 192
    .line 193
    :goto_2
    invoke-interface {p1, p2}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, p0, Li0/h0;->R:Lwf/g;

    .line 198
    .line 199
    return-void

    .line 200
    :catchall_0
    move-exception p2

    .line 201
    invoke-virtual {p1}, Ll0/g;->c()V

    .line 202
    .line 203
    .line 204
    throw p2
.end method

.method public static final R(Li0/h0;IZI)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li0/h0;->G:Ll0/g;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ll0/g;->j(I)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_c

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ll0/g;->i(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v6, v2, Ll0/g;->b:[I

    .line 19
    .line 20
    invoke-virtual {v2, v6, v1}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/16 v7, 0xce

    .line 25
    .line 26
    if-ne v3, v7, :cond_a

    .line 27
    .line 28
    sget-object v3, Li0/m;->e:Li0/d1;

    .line 29
    .line 30
    invoke-static {v6, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_a

    .line 35
    .line 36
    invoke-virtual {v2, v1, v4}, Ll0/g;->h(II)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    instance-of v6, v3, Li0/k0;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    check-cast v3, Li0/k0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v3, v7

    .line 49
    :goto_0
    if-eqz v3, :cond_1

    .line 50
    .line 51
    iget-object v3, v3, Li0/k0;->a:Li0/a2;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v3, v7

    .line 55
    :goto_1
    instance-of v6, v3, Li0/e0;

    .line 56
    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    move-object v7, v3

    .line 60
    check-cast v7, Li0/e0;

    .line 61
    .line 62
    :cond_2
    if-eqz v7, :cond_9

    .line 63
    .line 64
    iget-object v3, v7, Li0/e0;->g:Li0/f0;

    .line 65
    .line 66
    iget-object v3, v3, Li0/f0;->e:Lf/l0;

    .line 67
    .line 68
    iget-object v6, v3, Lf/l0;->b:[Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v3, v3, Lf/l0;->a:[J

    .line 71
    .line 72
    array-length v7, v3

    .line 73
    add-int/lit8 v7, v7, -0x2

    .line 74
    .line 75
    if-ltz v7, :cond_9

    .line 76
    .line 77
    move v8, v4

    .line 78
    :goto_2
    aget-wide v9, v3, v8

    .line 79
    .line 80
    not-long v11, v9

    .line 81
    const/4 v13, 0x7

    .line 82
    shl-long/2addr v11, v13

    .line 83
    and-long/2addr v11, v9

    .line 84
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v11, v13

    .line 90
    cmp-long v11, v11, v13

    .line 91
    .line 92
    if-eqz v11, :cond_8

    .line 93
    .line 94
    sub-int v11, v8, v7

    .line 95
    .line 96
    not-int v11, v11

    .line 97
    ushr-int/lit8 v11, v11, 0x1f

    .line 98
    .line 99
    const/16 v12, 0x8

    .line 100
    .line 101
    rsub-int/lit8 v11, v11, 0x8

    .line 102
    .line 103
    move v13, v4

    .line 104
    :goto_3
    if-ge v13, v11, :cond_7

    .line 105
    .line 106
    const-wide/16 v14, 0xff

    .line 107
    .line 108
    and-long/2addr v14, v9

    .line 109
    const-wide/16 v16, 0x80

    .line 110
    .line 111
    cmp-long v14, v14, v16

    .line 112
    .line 113
    if-gez v14, :cond_6

    .line 114
    .line 115
    shl-int/lit8 v14, v8, 0x3

    .line 116
    .line 117
    add-int/2addr v14, v13

    .line 118
    aget-object v14, v6, v14

    .line 119
    .line 120
    check-cast v14, Li0/h0;

    .line 121
    .line 122
    iget-object v15, v14, Li0/h0;->c:Ll0/h;

    .line 123
    .line 124
    const/16 v16, 0x1

    .line 125
    .line 126
    iget v5, v15, Ll0/h;->h:I

    .line 127
    .line 128
    if-lez v5, :cond_5

    .line 129
    .line 130
    iget-object v5, v15, Ll0/h;->g:[I

    .line 131
    .line 132
    aget v5, v5, v16

    .line 133
    .line 134
    const/high16 v15, 0x4000000

    .line 135
    .line 136
    and-int/2addr v5, v15

    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    iget-object v5, v14, Li0/h0;->h:Li0/q;

    .line 140
    .line 141
    iget-object v15, v5, Li0/q;->j:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v15

    .line 144
    :try_start_0
    invoke-virtual {v5}, Li0/q;->p()V

    .line 145
    .line 146
    .line 147
    move/from16 p2, v12

    .line 148
    .line 149
    iget-object v12, v5, Li0/q;->t:Lf/k0;

    .line 150
    .line 151
    invoke-static {}, Lf8/i;->o()Lf/k0;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iput-object v4, v5, Li0/q;->t:Lf/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 156
    .line 157
    :try_start_1
    iget-object v4, v5, Li0/q;->B:Li0/h0;

    .line 158
    .line 159
    invoke-virtual {v4, v12}, Li0/h0;->g0(Lf/k0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 160
    .line 161
    .line 162
    monitor-exit v15

    .line 163
    new-instance v4, Lm0/a;

    .line 164
    .line 165
    invoke-direct {v4}, Lm0/a;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object v4, v14, Li0/h0;->L:Lm0/a;

    .line 169
    .line 170
    iget-object v5, v14, Li0/h0;->c:Ll0/h;

    .line 171
    .line 172
    invoke-virtual {v5}, Ll0/h;->d()Ll0/g;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    :try_start_2
    iput-object v5, v14, Li0/h0;->G:Ll0/g;

    .line 177
    .line 178
    iget-object v12, v14, Li0/h0;->M:Lm0/b;

    .line 179
    .line 180
    iget-object v15, v12, Lm0/b;->b:Lm0/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 181
    .line 182
    :try_start_3
    iput-object v4, v12, Lm0/b;->b:Lm0/a;

    .line 183
    .line 184
    const/4 v4, 0x0

    .line 185
    invoke-virtual {v14, v4}, Li0/h0;->Q(I)V

    .line 186
    .line 187
    .line 188
    iget-object v4, v14, Li0/h0;->M:Lm0/b;

    .line 189
    .line 190
    invoke-virtual {v4}, Lm0/b;->b()V

    .line 191
    .line 192
    .line 193
    move-object/from16 p3, v3

    .line 194
    .line 195
    iget-boolean v3, v4, Lm0/b;->c:Z

    .line 196
    .line 197
    if-eqz v3, :cond_3

    .line 198
    .line 199
    iget-object v3, v4, Lm0/b;->b:Lm0/a;

    .line 200
    .line 201
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 202
    .line 203
    move-object/from16 v18, v5

    .line 204
    .line 205
    :try_start_4
    sget-object v5, Lm0/c0;->c:Lm0/c0;

    .line 206
    .line 207
    invoke-virtual {v3, v5}, Lm0/l0;->U(Lm0/j0;)V

    .line 208
    .line 209
    .line 210
    iget-boolean v3, v4, Lm0/b;->c:Z

    .line 211
    .line 212
    if-eqz v3, :cond_4

    .line 213
    .line 214
    const/4 v3, 0x0

    .line 215
    invoke-virtual {v4, v3}, Lm0/b;->d(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v3}, Lm0/b;->d(Z)V

    .line 219
    .line 220
    .line 221
    iget-object v5, v4, Lm0/b;->b:Lm0/a;

    .line 222
    .line 223
    iget-object v5, v5, Lm0/a;->j:Lm0/l0;

    .line 224
    .line 225
    sget-object v3, Lm0/m;->c:Lm0/m;

    .line 226
    .line 227
    invoke-virtual {v5, v3}, Lm0/l0;->U(Lm0/j0;)V

    .line 228
    .line 229
    .line 230
    const/4 v3, 0x0

    .line 231
    iput-boolean v3, v4, Lm0/b;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :catchall_0
    move-exception v0

    .line 235
    goto :goto_5

    .line 236
    :cond_3
    move-object/from16 v18, v5

    .line 237
    .line 238
    :cond_4
    const/4 v3, 0x0

    .line 239
    :goto_4
    :try_start_5
    iput-object v15, v12, Lm0/b;->b:Lm0/a;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 240
    .line 241
    invoke-virtual/range {v18 .. v18}, Ll0/g;->c()V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    goto :goto_6

    .line 247
    :catchall_2
    move-exception v0

    .line 248
    move-object/from16 v18, v5

    .line 249
    .line 250
    :goto_5
    :try_start_6
    iput-object v15, v12, Lm0/b;->b:Lm0/a;

    .line 251
    .line 252
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 253
    :catchall_3
    move-exception v0

    .line 254
    move-object/from16 v18, v5

    .line 255
    .line 256
    :goto_6
    invoke-virtual/range {v18 .. v18}, Ll0/g;->c()V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :catchall_4
    move-exception v0

    .line 261
    :try_start_7
    iput-object v12, v5, Li0/q;->t:Lf/k0;

    .line 262
    .line 263
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 264
    :catchall_5
    move-exception v0

    .line 265
    monitor-exit v15

    .line 266
    throw v0

    .line 267
    :cond_5
    move-object/from16 p3, v3

    .line 268
    .line 269
    move v3, v4

    .line 270
    move/from16 p2, v12

    .line 271
    .line 272
    :goto_7
    iget-object v4, v0, Li0/h0;->b:Li0/o;

    .line 273
    .line 274
    iget-object v5, v14, Li0/h0;->h:Li0/q;

    .line 275
    .line 276
    invoke-virtual {v4, v5}, Li0/o;->r(Li0/q;)V

    .line 277
    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_6
    move-object/from16 p3, v3

    .line 281
    .line 282
    move v3, v4

    .line 283
    move/from16 p2, v12

    .line 284
    .line 285
    const/16 v16, 0x1

    .line 286
    .line 287
    :goto_8
    shr-long v9, v9, p2

    .line 288
    .line 289
    add-int/lit8 v13, v13, 0x1

    .line 290
    .line 291
    move/from16 v12, p2

    .line 292
    .line 293
    move v4, v3

    .line 294
    move-object/from16 v3, p3

    .line 295
    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :cond_7
    move-object/from16 p3, v3

    .line 299
    .line 300
    move v3, v4

    .line 301
    move v4, v12

    .line 302
    const/16 v16, 0x1

    .line 303
    .line 304
    if-ne v11, v4, :cond_9

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_8
    move-object/from16 p3, v3

    .line 308
    .line 309
    move v3, v4

    .line 310
    const/16 v16, 0x1

    .line 311
    .line 312
    :goto_9
    if-eq v8, v7, :cond_9

    .line 313
    .line 314
    add-int/lit8 v8, v8, 0x1

    .line 315
    .line 316
    move v4, v3

    .line 317
    move-object/from16 v3, p3

    .line 318
    .line 319
    goto/16 :goto_2

    .line 320
    .line 321
    :cond_9
    invoke-virtual {v2, v1}, Ll0/g;->o(I)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    return v0

    .line 326
    :cond_a
    const/16 v16, 0x1

    .line 327
    .line 328
    invoke-virtual {v2, v1}, Ll0/g;->l(I)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_b

    .line 333
    .line 334
    goto/16 :goto_e

    .line 335
    .line 336
    :cond_b
    invoke-virtual {v2, v1}, Ll0/g;->o(I)I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    return v0

    .line 341
    :cond_c
    move v3, v4

    .line 342
    const/16 v16, 0x1

    .line 343
    .line 344
    invoke-virtual {v2, v1}, Ll0/g;->d(I)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_14

    .line 349
    .line 350
    iget-object v4, v2, Ll0/g;->b:[I

    .line 351
    .line 352
    mul-int/lit8 v5, v1, 0x5

    .line 353
    .line 354
    add-int/lit8 v5, v5, 0x3

    .line 355
    .line 356
    aget v4, v4, v5

    .line 357
    .line 358
    add-int/2addr v4, v1

    .line 359
    add-int/lit8 v5, v1, 0x1

    .line 360
    .line 361
    move v6, v5

    .line 362
    move v5, v3

    .line 363
    :goto_a
    if-ge v6, v4, :cond_12

    .line 364
    .line 365
    invoke-virtual {v2, v6}, Ll0/g;->l(I)Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-eqz v7, :cond_d

    .line 370
    .line 371
    iget-object v8, v0, Li0/h0;->M:Lm0/b;

    .line 372
    .line 373
    invoke-virtual {v8}, Lm0/b;->c()V

    .line 374
    .line 375
    .line 376
    iget-object v8, v0, Li0/h0;->M:Lm0/b;

    .line 377
    .line 378
    invoke-virtual {v2, v6}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-virtual {v8}, Lm0/b;->c()V

    .line 383
    .line 384
    .line 385
    iget-object v8, v8, Lm0/b;->h:Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    :cond_d
    if-nez v7, :cond_f

    .line 391
    .line 392
    if-eqz p2, :cond_e

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_e
    move v8, v3

    .line 396
    goto :goto_c

    .line 397
    :cond_f
    :goto_b
    move/from16 v8, v16

    .line 398
    .line 399
    :goto_c
    if-eqz v7, :cond_10

    .line 400
    .line 401
    move v9, v3

    .line 402
    goto :goto_d

    .line 403
    :cond_10
    add-int v9, p3, v5

    .line 404
    .line 405
    :goto_d
    invoke-static {v0, v6, v8, v9}, Li0/h0;->R(Li0/h0;IZI)I

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    add-int/2addr v5, v8

    .line 410
    if-eqz v7, :cond_11

    .line 411
    .line 412
    iget-object v7, v0, Li0/h0;->M:Lm0/b;

    .line 413
    .line 414
    invoke-virtual {v7}, Lm0/b;->c()V

    .line 415
    .line 416
    .line 417
    iget-object v7, v0, Li0/h0;->M:Lm0/b;

    .line 418
    .line 419
    invoke-virtual {v7}, Lm0/b;->a()V

    .line 420
    .line 421
    .line 422
    :cond_11
    iget-object v7, v2, Ll0/g;->b:[I

    .line 423
    .line 424
    mul-int/lit8 v8, v6, 0x5

    .line 425
    .line 426
    add-int/lit8 v8, v8, 0x3

    .line 427
    .line 428
    aget v7, v7, v8

    .line 429
    .line 430
    add-int/2addr v6, v7

    .line 431
    goto :goto_a

    .line 432
    :cond_12
    invoke-virtual {v2, v1}, Ll0/g;->l(I)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_13

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_13
    return v5

    .line 440
    :cond_14
    invoke-virtual {v2, v1}, Ll0/g;->l(I)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_15

    .line 445
    .line 446
    :goto_e
    return v16

    .line 447
    :cond_15
    invoke-virtual {v2, v1}, Ll0/g;->o(I)I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    return v0
.end method


# virtual methods
.method public final A()Li0/r1;
    .locals 2

    .line 1
    iget v0, p0, Li0/h0;->A:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li0/h0;->E:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Li0/r1;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/h0;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Li0/h0;->w:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Li0/h0;->A()Li0/r1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v0, v0, Li0/r1;->b:I

    .line 18
    .line 19
    and-int/lit8 v0, v0, 0x4

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public final C()Lx0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/h0;->b:Li0/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/o;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Li0/h0;->Q:Lx0/d;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    return v0
.end method

.method public final E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Li0/h0;->y:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Li0/h0;->w:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Li0/h0;->A()Li0/r1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget v0, v0, Li0/r1;->b:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, 0x8

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public final F(Ljava/util/ArrayList;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Li0/h0;->f:Lm0/a;

    .line 4
    .line 5
    iget-object v7, v1, Li0/h0;->M:Lm0/b;

    .line 6
    .line 7
    iget-object v8, v7, Lm0/b;->b:Lm0/a;

    .line 8
    .line 9
    :try_start_0
    iput-object v0, v7, Lm0/b;->b:Lm0/a;

    .line 10
    .line 11
    iget-object v0, v0, Lm0/a;->j:Lm0/l0;

    .line 12
    .line 13
    sget-object v2, Lm0/a0;->c:Lm0/a0;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v9, 0x0

    .line 23
    move v10, v9

    .line 24
    :goto_0
    if-ge v10, v0, :cond_3

    .line 25
    .line 26
    move-object/from16 v11, p1

    .line 27
    .line 28
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lsf/e;

    .line 33
    .line 34
    iget-object v3, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Li0/v0;

    .line 37
    .line 38
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Li0/v0;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static {v2}, Lfb/v0;->b(Ll0/b;)Ll0/b;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static {v4}, Ll0/j;->d(Ll0/h;)Ll0/h;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4, v2}, Ll0/h;->a(Ll0/b;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    new-instance v12, Ls0/e;

    .line 60
    .line 61
    invoke-direct {v12}, Ls0/e;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Lm0/b;->b()V

    .line 65
    .line 66
    .line 67
    iget-object v6, v7, Lm0/b;->b:Lm0/a;

    .line 68
    .line 69
    iget-object v6, v6, Lm0/a;->j:Lm0/l0;

    .line 70
    .line 71
    sget-object v13, Lm0/j;->c:Lm0/j;

    .line 72
    .line 73
    invoke-virtual {v6, v13}, Lm0/l0;->U(Lm0/j0;)V

    .line 74
    .line 75
    .line 76
    const/4 v13, 0x1

    .line 77
    invoke-static {v6, v9, v12, v13, v2}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v2, v1, Li0/h0;->H:Ll0/h;

    .line 81
    .line 82
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    iget-object v2, v1, Li0/h0;->I:Ll0/k;

    .line 89
    .line 90
    iget-boolean v2, v2, Ll0/k;->w:Z

    .line 91
    .line 92
    if-nez v2, :cond_0

    .line 93
    .line 94
    const-string v2, "Check failed"

    .line 95
    .line 96
    invoke-static {v2}, Li0/m;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_0
    invoke-virtual {v1}, Li0/h0;->x()V

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {v4}, Ll0/h;->d()Ll0/g;

    .line 103
    .line 104
    .line 105
    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :try_start_1
    invoke-virtual {v14, v5}, Ll0/g;->r(I)V

    .line 107
    .line 108
    .line 109
    iput v5, v7, Lm0/b;->f:I

    .line 110
    .line 111
    new-instance v15, Lm0/a;

    .line 112
    .line 113
    invoke-direct {v15}, Lm0/a;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance v6, Lab/e;

    .line 117
    .line 118
    invoke-direct {v6, v1, v15, v14, v3}, Lab/e;-><init>(Li0/h0;Lm0/a;Ll0/g;Li0/v0;)V

    .line 119
    .line 120
    .line 121
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-virtual/range {v1 .. v6}, Li0/h0;->K(Li0/q;Li0/q;Ljava/lang/Integer;Ljava/util/List;Lfg/a;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    iget-object v1, v7, Lm0/b;->b:Lm0/a;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v2, v15, Lm0/a;->j:Lm0/l0;

    .line 135
    .line 136
    invoke-virtual {v2}, Lm0/l0;->T()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_2

    .line 141
    .line 142
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 143
    .line 144
    sget-object v2, Lm0/f;->c:Lm0/f;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v1, v9, v15, v13, v12}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    .line 151
    .line 152
    :cond_2
    :try_start_2
    invoke-virtual {v14}, Ll0/g;->c()V

    .line 153
    .line 154
    .line 155
    iget-object v1, v7, Lm0/b;->b:Lm0/a;

    .line 156
    .line 157
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 158
    .line 159
    sget-object v2, Lm0/c0;->c:Lm0/c0;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v10, v10, 0x1

    .line 165
    .line 166
    move-object/from16 v1, p0

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :catchall_0
    move-exception v0

    .line 171
    goto :goto_1

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    invoke-virtual {v14}, Ll0/g;->c()V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_3
    invoke-virtual {v7}, Lm0/b;->b()V

    .line 178
    .line 179
    .line 180
    iget-object v0, v7, Lm0/b;->b:Lm0/a;

    .line 181
    .line 182
    iget-object v0, v0, Lm0/a;->j:Lm0/l0;

    .line 183
    .line 184
    sget-object v1, Lm0/n;->c:Lm0/n;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lm0/l0;->U(Lm0/j0;)V

    .line 187
    .line 188
    .line 189
    iput v9, v7, Lm0/b;->f:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    iput-object v8, v7, Lm0/b;->b:Lm0/a;

    .line 192
    .line 193
    return-void

    .line 194
    :goto_1
    iput-object v8, v7, Lm0/b;->b:Lm0/a;

    .line 195
    .line 196
    throw v0
.end method

.method public final G(Ls0/h;Ljava/lang/Object;)V
    .locals 8

    .line 1
    const v0, 0x78cc281

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v0, v1, v1, v2}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-wide v3, p0, Li0/h0;->T:J

    .line 16
    .line 17
    int-to-long v5, v0

    .line 18
    :try_start_0
    iput-wide v5, p0, Li0/h0;->T:J

    .line 19
    .line 20
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 25
    .line 26
    invoke-static {v0}, Ll0/k;->z(Ll0/k;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    :goto_0
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    :cond_1
    move v0, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 40
    .line 41
    invoke-virtual {v0}, Ll0/g;->f()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    move v0, v5

    .line 52
    :goto_1
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Li0/h0;->N(Ls0/h;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    sget-object v6, Li0/m;->c:Li0/d1;

    .line 58
    .line 59
    const/16 v7, 0xca

    .line 60
    .line 61
    invoke-virtual {p0, v7, v6, p1, v2}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Li0/h0;->K:Ls0/h;

    .line 65
    .line 66
    iget-boolean p1, p0, Li0/h0;->w:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Li0/h0;->w:Z

    .line 69
    .line 70
    new-instance v0, Lb0/t;

    .line 71
    .line 72
    const/16 v6, 0x9

    .line 73
    .line 74
    invoke-direct {v0, p2, v6}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    new-instance p2, Ls0/d;

    .line 78
    .line 79
    const v6, -0x3873acb

    .line 80
    .line 81
    .line 82
    invoke-direct {p2, v6, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p2}, Ls0/i;->d(Li0/h0;Lfg/p;)V

    .line 86
    .line 87
    .line 88
    iput-boolean p1, p0, Li0/h0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    invoke-virtual {p0, v2}, Li0/h0;->p(Z)V

    .line 91
    .line 92
    .line 93
    iput-object v1, p0, Li0/h0;->K:Ls0/h;

    .line 94
    .line 95
    iput-wide v3, p0, Li0/h0;->T:J

    .line 96
    .line 97
    invoke-virtual {p0, v2}, Li0/h0;->p(Z)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :goto_2
    :try_start_1
    new-instance p2, Li0/d0;

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    invoke-direct {p2, p0, v0}, Li0/d0;-><init>(Li0/h0;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1, p2}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 108
    .line 109
    .line 110
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    :catchall_1
    move-exception p1

    .line 112
    invoke-virtual {p0, v2}, Li0/h0;->p(Z)V

    .line 113
    .line 114
    .line 115
    iput-object v1, p0, Li0/h0;->K:Ls0/h;

    .line 116
    .line 117
    iput-wide v3, p0, Li0/h0;->T:J

    .line 118
    .line 119
    invoke-virtual {p0, v2}, Li0/h0;->p(Z)V

    .line 120
    .line 121
    .line 122
    throw p1
.end method

.method public final H()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    sget-object v1, Li0/l;->a:Li0/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Li0/h0;->r:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    .line 12
    .line 13
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Ll0/g;->m()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v2, p0, Li0/h0;->y:Z

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    instance-of v2, v0, Li0/d2;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    :cond_1
    return-object v1

    .line 32
    :cond_2
    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Li0/h0;->b:Li0/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/o;->h()Li0/n;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Li0/q;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object v2, v1, Li0/q;->l:Ll0/h;

    .line 17
    .line 18
    invoke-static {v2}, Ll0/j;->d(Ll0/h;)Ll0/h;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ll0/h;->d()Ll0/g;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :try_start_0
    iget v4, v3, Ll0/g;->c:I

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static {v3, v0, v5, v4}, Lg4/a;->n(Ll0/g;Li0/o;II)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    invoke-virtual {v3}, Ll0/g;->c()V

    .line 34
    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {v2}, Ll0/j;->d(Ll0/h;)Ll0/h;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ll0/h;->d()Ll0/g;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v2, v0, v3}, Lg4/a;->M(Ll0/g;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    invoke-virtual {v2}, Ll0/g;->c()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Li0/q;->B:Li0/h0;

    .line 62
    .line 63
    invoke-virtual {v1}, Li0/h0;->I()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    invoke-virtual {v2}, Ll0/g;->c()V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    :goto_1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 78
    .line 79
    return-object v0

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    invoke-virtual {v3}, Ll0/g;->c()V

    .line 82
    .line 83
    .line 84
    throw v0
.end method

.method public final J(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v0, p1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Li0/h0;->G:Ll0/g;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ll0/g;->k(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, Li0/h0;->G:Ll0/g;

    .line 23
    .line 24
    iget-object v2, v2, Ll0/g;->b:[I

    .line 25
    .line 26
    mul-int/lit8 v3, v0, 0x5

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x3

    .line 29
    .line 30
    aget v2, v2, v3

    .line 31
    .line 32
    add-int/2addr v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v1
.end method

.method public final K(Li0/q;Li0/q;Ljava/lang/Integer;Ljava/util/List;Lfg/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Li0/h0;->F:Z

    .line 2
    .line 3
    iget v1, p0, Li0/h0;->k:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    iput-boolean v2, p0, Li0/h0;->F:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p0, Li0/h0;->k:I

    .line 10
    .line 11
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    move v4, v2

    .line 16
    :goto_0
    const/4 v5, 0x0

    .line 17
    if-ge v4, v3, :cond_1

    .line 18
    .line 19
    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Lsf/e;

    .line 24
    .line 25
    iget-object v7, v6, Lsf/e;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, Li0/r1;

    .line 28
    .line 29
    iget-object v6, v6, Lsf/e;->h:Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v7, v6}, Li0/h0;->f0(Li0/r1;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_4

    .line 39
    :cond_0
    invoke-virtual {p0, v7, v5}, Li0/h0;->f0(Li0/r1;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    if-eqz p1, :cond_4

    .line 46
    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/4 p3, -0x1

    .line 55
    :goto_2
    if-eqz p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    if-nez p4, :cond_3

    .line 62
    .line 63
    if-ltz p3, :cond_3

    .line 64
    .line 65
    iput-object p2, p1, Li0/q;->x:Li0/q;

    .line 66
    .line 67
    iput p3, p1, Li0/q;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    :try_start_1
    invoke-interface {p5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    iput-object v5, p1, Li0/q;->x:Li0/q;

    .line 74
    .line 75
    iput v2, p1, Li0/q;->y:I

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception p2

    .line 79
    iput-object v5, p1, Li0/q;->x:Li0/q;

    .line 80
    .line 81
    iput v2, p1, Li0/q;->y:I

    .line 82
    .line 83
    throw p2

    .line 84
    :cond_3
    invoke-interface {p5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :goto_3
    if-nez p2, :cond_5

    .line 89
    .line 90
    :cond_4
    invoke-interface {p5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    :cond_5
    iput-boolean v0, p0, Li0/h0;->F:Z

    .line 95
    .line 96
    iput v1, p0, Li0/h0;->k:I

    .line 97
    .line 98
    return-object p2

    .line 99
    :goto_4
    iput-boolean v0, p0, Li0/h0;->F:Z

    .line 100
    .line 101
    iput v1, p0, Li0/h0;->k:I

    .line 102
    .line 103
    throw p1
.end method

.method public final L()V
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Li0/e;->m:Li0/e;

    .line 4
    .line 5
    iget-boolean v2, v1, Li0/h0;->F:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, v1, Li0/h0;->F:Z

    .line 9
    .line 10
    iget-object v4, v1, Li0/h0;->G:Ll0/g;

    .line 11
    .line 12
    iget v5, v4, Ll0/g;->i:I

    .line 13
    .line 14
    iget-object v6, v4, Ll0/g;->b:[I

    .line 15
    .line 16
    mul-int/lit8 v7, v5, 0x5

    .line 17
    .line 18
    const/4 v8, 0x3

    .line 19
    add-int/2addr v7, v8

    .line 20
    aget v6, v6, v7

    .line 21
    .line 22
    add-int/2addr v6, v5

    .line 23
    iget v9, v1, Li0/h0;->k:I

    .line 24
    .line 25
    iget-wide v10, v1, Li0/h0;->T:J

    .line 26
    .line 27
    iget v12, v1, Li0/h0;->l:I

    .line 28
    .line 29
    iget v13, v1, Li0/h0;->m:I

    .line 30
    .line 31
    iget v4, v4, Ll0/g;->g:I

    .line 32
    .line 33
    iget-object v14, v1, Li0/h0;->s:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v4, v14}, Li0/r;->q(ILjava/util/List;)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-gez v4, :cond_0

    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    neg-int v4, v4

    .line 44
    :cond_0
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    move/from16 v16, v8

    .line 49
    .line 50
    if-ge v4, v15, :cond_1

    .line 51
    .line 52
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Li0/n0;

    .line 57
    .line 58
    iget v15, v4, Li0/n0;->b:I

    .line 59
    .line 60
    if-ge v15, v6, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v4, 0x0

    .line 64
    :goto_0
    move/from16 v18, v3

    .line 65
    .line 66
    move v3, v5

    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    :goto_1
    if-eqz v4, :cond_2c

    .line 70
    .line 71
    iget-object v8, v4, Li0/n0;->a:Li0/r1;

    .line 72
    .line 73
    iget v15, v4, Li0/n0;->b:I

    .line 74
    .line 75
    move-object/from16 v19, v0

    .line 76
    .line 77
    invoke-static {v15, v14}, Li0/r;->q(ILjava/util/List;)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ltz v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Li0/n0;

    .line 88
    .line 89
    :cond_2
    iget-object v0, v4, Li0/n0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    const-wide/16 v20, 0x80

    .line 92
    .line 93
    const-wide/16 v22, 0xff

    .line 94
    .line 95
    const/16 v24, 0x7

    .line 96
    .line 97
    const-wide v25, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move/from16 v33, v6

    .line 108
    .line 109
    move/from16 v28, v7

    .line 110
    .line 111
    move/from16 v29, v9

    .line 112
    .line 113
    :goto_2
    move/from16 v31, v12

    .line 114
    .line 115
    move/from16 v32, v13

    .line 116
    .line 117
    :cond_3
    :goto_3
    move/from16 v0, v18

    .line 118
    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :cond_4
    const/16 v27, 0x8

    .line 122
    .line 123
    iget-object v4, v8, Li0/r1;->g:Lf/k0;

    .line 124
    .line 125
    if-nez v4, :cond_5

    .line 126
    .line 127
    move/from16 v33, v6

    .line 128
    .line 129
    move/from16 v28, v7

    .line 130
    .line 131
    move/from16 v29, v9

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move/from16 v28, v7

    .line 135
    .line 136
    instance-of v7, v0, Li0/x;

    .line 137
    .line 138
    if-eqz v7, :cond_7

    .line 139
    .line 140
    check-cast v0, Li0/x;

    .line 141
    .line 142
    iget-object v7, v0, Li0/x;->i:Li0/e;

    .line 143
    .line 144
    if-nez v7, :cond_6

    .line 145
    .line 146
    move-object/from16 v7, v19

    .line 147
    .line 148
    :cond_6
    move/from16 v29, v9

    .line 149
    .line 150
    invoke-virtual {v0}, Li0/x;->h()Li0/w;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    iget-object v9, v9, Li0/w;->f:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-virtual {v4, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v7, v9, v0}, Li0/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    xor-int/lit8 v0, v0, 0x1

    .line 165
    .line 166
    move/from16 v33, v6

    .line 167
    .line 168
    move/from16 v31, v12

    .line 169
    .line 170
    move/from16 v32, v13

    .line 171
    .line 172
    goto/16 :goto_6

    .line 173
    .line 174
    :cond_7
    move/from16 v29, v9

    .line 175
    .line 176
    instance-of v7, v0, Lf/l0;

    .line 177
    .line 178
    if-eqz v7, :cond_f

    .line 179
    .line 180
    check-cast v0, Lf/l0;

    .line 181
    .line 182
    invoke-virtual {v0}, Lf/l0;->h()Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_d

    .line 187
    .line 188
    iget-object v7, v0, Lf/l0;->b:[Ljava/lang/Object;

    .line 189
    .line 190
    iget-object v0, v0, Lf/l0;->a:[J

    .line 191
    .line 192
    array-length v9, v0

    .line 193
    add-int/lit8 v9, v9, -0x2

    .line 194
    .line 195
    if-ltz v9, :cond_d

    .line 196
    .line 197
    move-object/from16 v30, v0

    .line 198
    .line 199
    move/from16 v31, v12

    .line 200
    .line 201
    move/from16 v32, v13

    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    :goto_4
    aget-wide v12, v30, v0

    .line 205
    .line 206
    move/from16 v33, v6

    .line 207
    .line 208
    move-object/from16 v34, v7

    .line 209
    .line 210
    not-long v6, v12

    .line 211
    shl-long v6, v6, v24

    .line 212
    .line 213
    and-long/2addr v6, v12

    .line 214
    and-long v6, v6, v25

    .line 215
    .line 216
    cmp-long v6, v6, v25

    .line 217
    .line 218
    if-eqz v6, :cond_c

    .line 219
    .line 220
    sub-int v6, v0, v9

    .line 221
    .line 222
    not-int v6, v6

    .line 223
    ushr-int/lit8 v6, v6, 0x1f

    .line 224
    .line 225
    rsub-int/lit8 v6, v6, 0x8

    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    :goto_5
    if-ge v7, v6, :cond_b

    .line 229
    .line 230
    and-long v35, v12, v22

    .line 231
    .line 232
    cmp-long v35, v35, v20

    .line 233
    .line 234
    if-gez v35, :cond_9

    .line 235
    .line 236
    shl-int/lit8 v35, v0, 0x3

    .line 237
    .line 238
    add-int v35, v35, v7

    .line 239
    .line 240
    move/from16 v36, v7

    .line 241
    .line 242
    aget-object v7, v34, v35

    .line 243
    .line 244
    move-wide/from16 v37, v12

    .line 245
    .line 246
    instance-of v12, v7, Li0/x;

    .line 247
    .line 248
    if-eqz v12, :cond_3

    .line 249
    .line 250
    check-cast v7, Li0/x;

    .line 251
    .line 252
    iget-object v12, v7, Li0/x;->i:Li0/e;

    .line 253
    .line 254
    if-nez v12, :cond_8

    .line 255
    .line 256
    move-object/from16 v12, v19

    .line 257
    .line 258
    :cond_8
    invoke-virtual {v7}, Li0/x;->h()Li0/w;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    iget-object v13, v13, Li0/w;->f:Ljava/lang/Object;

    .line 263
    .line 264
    invoke-virtual {v4, v7}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-virtual {v12, v13, v7}, Li0/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-nez v7, :cond_a

    .line 273
    .line 274
    goto/16 :goto_3

    .line 275
    .line 276
    :cond_9
    move/from16 v36, v7

    .line 277
    .line 278
    move-wide/from16 v37, v12

    .line 279
    .line 280
    :cond_a
    shr-long v12, v37, v27

    .line 281
    .line 282
    add-int/lit8 v7, v36, 0x1

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_b
    move/from16 v7, v27

    .line 286
    .line 287
    if-ne v6, v7, :cond_e

    .line 288
    .line 289
    :cond_c
    if-eq v0, v9, :cond_e

    .line 290
    .line 291
    add-int/lit8 v0, v0, 0x1

    .line 292
    .line 293
    move/from16 v6, v33

    .line 294
    .line 295
    move-object/from16 v7, v34

    .line 296
    .line 297
    const/16 v27, 0x8

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_d
    move/from16 v33, v6

    .line 301
    .line 302
    move/from16 v31, v12

    .line 303
    .line 304
    move/from16 v32, v13

    .line 305
    .line 306
    :cond_e
    const/4 v0, 0x0

    .line 307
    goto :goto_6

    .line 308
    :cond_f
    move/from16 v33, v6

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :goto_6
    if-eqz v0, :cond_22

    .line 313
    .line 314
    iget-object v0, v1, Li0/h0;->G:Ll0/g;

    .line 315
    .line 316
    invoke-virtual {v0, v15}, Ll0/g;->r(I)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v1, Li0/h0;->G:Ll0/g;

    .line 320
    .line 321
    iget v0, v0, Ll0/g;->g:I

    .line 322
    .line 323
    invoke-virtual {v1, v3, v0, v5}, Li0/h0;->O(III)V

    .line 324
    .line 325
    .line 326
    iget-object v3, v1, Li0/h0;->G:Ll0/g;

    .line 327
    .line 328
    invoke-virtual {v3, v0}, Ll0/g;->q(I)I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    :goto_7
    if-eq v3, v5, :cond_10

    .line 333
    .line 334
    iget-object v4, v1, Li0/h0;->G:Ll0/g;

    .line 335
    .line 336
    invoke-virtual {v4, v3}, Ll0/g;->l(I)Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-nez v4, :cond_10

    .line 341
    .line 342
    iget-object v4, v1, Li0/h0;->G:Ll0/g;

    .line 343
    .line 344
    invoke-virtual {v4, v3}, Ll0/g;->q(I)I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    goto :goto_7

    .line 349
    :cond_10
    iget-object v4, v1, Li0/h0;->G:Ll0/g;

    .line 350
    .line 351
    invoke-virtual {v4, v3}, Ll0/g;->l(I)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-eqz v4, :cond_11

    .line 356
    .line 357
    const/4 v4, 0x0

    .line 358
    goto :goto_8

    .line 359
    :cond_11
    move/from16 v4, v29

    .line 360
    .line 361
    :goto_8
    if-ne v3, v0, :cond_12

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_12
    invoke-virtual {v1, v3}, Li0/h0;->m0(I)I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    iget-object v7, v1, Li0/h0;->G:Ll0/g;

    .line 369
    .line 370
    invoke-virtual {v7, v0}, Ll0/g;->o(I)I

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    sub-int/2addr v6, v7

    .line 375
    add-int/2addr v6, v4

    .line 376
    :cond_13
    if-ge v4, v6, :cond_15

    .line 377
    .line 378
    if-eq v3, v15, :cond_15

    .line 379
    .line 380
    add-int/lit8 v3, v3, 0x1

    .line 381
    .line 382
    :goto_9
    if-ge v3, v15, :cond_15

    .line 383
    .line 384
    iget-object v7, v1, Li0/h0;->G:Ll0/g;

    .line 385
    .line 386
    iget-object v9, v7, Ll0/g;->b:[I

    .line 387
    .line 388
    mul-int/lit8 v12, v3, 0x5

    .line 389
    .line 390
    add-int/lit8 v12, v12, 0x3

    .line 391
    .line 392
    aget v9, v9, v12

    .line 393
    .line 394
    add-int/2addr v9, v3

    .line 395
    if-lt v15, v9, :cond_13

    .line 396
    .line 397
    invoke-virtual {v7, v3}, Ll0/g;->l(I)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_14

    .line 402
    .line 403
    move/from16 v3, v18

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_14
    invoke-virtual {v1, v3}, Li0/h0;->m0(I)I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    :goto_a
    add-int/2addr v4, v3

    .line 411
    move v3, v9

    .line 412
    goto :goto_9

    .line 413
    :cond_15
    :goto_b
    iput v4, v1, Li0/h0;->k:I

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Li0/h0;->J(I)I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    iput v3, v1, Li0/h0;->m:I

    .line 420
    .line 421
    iget-object v3, v1, Li0/h0;->G:Ll0/g;

    .line 422
    .line 423
    invoke-virtual {v3, v0}, Ll0/g;->q(I)I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    const/4 v4, 0x0

    .line 428
    int-to-long v6, v4

    .line 429
    move/from16 v9, v16

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    :goto_c
    if-ltz v3, :cond_16

    .line 433
    .line 434
    if-ne v3, v5, :cond_17

    .line 435
    .line 436
    invoke-static {v10, v11, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 437
    .line 438
    .line 439
    move-result-wide v3

    .line 440
    xor-long/2addr v6, v3

    .line 441
    :cond_16
    move/from16 v17, v0

    .line 442
    .line 443
    goto/16 :goto_11

    .line 444
    .line 445
    :cond_17
    iget-object v12, v1, Li0/h0;->G:Ll0/g;

    .line 446
    .line 447
    invoke-virtual {v12, v3}, Ll0/g;->k(I)Z

    .line 448
    .line 449
    .line 450
    move-result v13

    .line 451
    iget-object v15, v12, Ll0/g;->b:[I

    .line 452
    .line 453
    if-eqz v13, :cond_1a

    .line 454
    .line 455
    invoke-virtual {v12, v15, v3}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    if-eqz v12, :cond_19

    .line 460
    .line 461
    instance-of v13, v12, Ljava/lang/Enum;

    .line 462
    .line 463
    if-eqz v13, :cond_18

    .line 464
    .line 465
    check-cast v12, Ljava/lang/Enum;

    .line 466
    .line 467
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 468
    .line 469
    .line 470
    move-result v12

    .line 471
    :goto_d
    move/from16 v17, v0

    .line 472
    .line 473
    goto :goto_f

    .line 474
    :cond_18
    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    .line 475
    .line 476
    .line 477
    move-result v12

    .line 478
    goto :goto_d

    .line 479
    :cond_19
    move/from16 v17, v0

    .line 480
    .line 481
    const/4 v12, 0x0

    .line 482
    goto :goto_f

    .line 483
    :cond_1a
    invoke-virtual {v12, v3}, Ll0/g;->i(I)I

    .line 484
    .line 485
    .line 486
    move-result v13

    .line 487
    move/from16 v17, v0

    .line 488
    .line 489
    const/16 v0, 0xcf

    .line 490
    .line 491
    if-ne v13, v0, :cond_1c

    .line 492
    .line 493
    invoke-virtual {v12, v15, v3}, Ll0/g;->b([II)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_1c

    .line 498
    .line 499
    sget-object v12, Li0/l;->a:Li0/e;

    .line 500
    .line 501
    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    if-eqz v12, :cond_1b

    .line 506
    .line 507
    goto :goto_e

    .line 508
    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    move v12, v0

    .line 513
    goto :goto_f

    .line 514
    :cond_1c
    :goto_e
    move v12, v13

    .line 515
    :goto_f
    const v0, 0x78cc281

    .line 516
    .line 517
    .line 518
    if-ne v12, v0, :cond_1d

    .line 519
    .line 520
    int-to-long v12, v12

    .line 521
    invoke-static {v12, v13, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 522
    .line 523
    .line 524
    move-result-wide v3

    .line 525
    xor-long/2addr v6, v3

    .line 526
    goto :goto_11

    .line 527
    :cond_1d
    iget-object v0, v1, Li0/h0;->G:Ll0/g;

    .line 528
    .line 529
    invoke-virtual {v0, v3}, Ll0/g;->k(I)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-eqz v0, :cond_1e

    .line 534
    .line 535
    const/4 v0, 0x0

    .line 536
    goto :goto_10

    .line 537
    :cond_1e
    invoke-virtual {v1, v3}, Li0/h0;->J(I)I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    :goto_10
    int-to-long v12, v12

    .line 542
    invoke-static {v12, v13, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 543
    .line 544
    .line 545
    move-result-wide v12

    .line 546
    xor-long/2addr v6, v12

    .line 547
    int-to-long v12, v0

    .line 548
    invoke-static {v12, v13, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 549
    .line 550
    .line 551
    move-result-wide v12

    .line 552
    xor-long/2addr v6, v12

    .line 553
    add-int/lit8 v9, v9, 0x6

    .line 554
    .line 555
    rem-int/lit8 v9, v9, 0x40

    .line 556
    .line 557
    add-int/lit8 v4, v4, 0x6

    .line 558
    .line 559
    rem-int/lit8 v4, v4, 0x40

    .line 560
    .line 561
    iget-object v0, v1, Li0/h0;->G:Ll0/g;

    .line 562
    .line 563
    invoke-virtual {v0, v3}, Ll0/g;->q(I)I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    move/from16 v0, v17

    .line 568
    .line 569
    goto/16 :goto_c

    .line 570
    .line 571
    :goto_11
    iput-wide v6, v1, Li0/h0;->T:J

    .line 572
    .line 573
    const/4 v0, 0x0

    .line 574
    iput-object v0, v1, Li0/h0;->K:Ls0/h;

    .line 575
    .line 576
    iget-object v3, v8, Li0/r1;->d:Lfg/p;

    .line 577
    .line 578
    if-eqz v3, :cond_21

    .line 579
    .line 580
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    invoke-interface {v3, v1, v4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    iput-object v0, v1, Li0/h0;->K:Ls0/h;

    .line 588
    .line 589
    iget-object v3, v1, Li0/h0;->G:Ll0/g;

    .line 590
    .line 591
    iget-object v4, v3, Ll0/g;->b:[I

    .line 592
    .line 593
    aget v4, v4, v28

    .line 594
    .line 595
    add-int/2addr v4, v5

    .line 596
    iget v6, v3, Ll0/g;->g:I

    .line 597
    .line 598
    if-lt v6, v5, :cond_1f

    .line 599
    .line 600
    if-gt v6, v4, :cond_1f

    .line 601
    .line 602
    move/from16 v7, v18

    .line 603
    .line 604
    goto :goto_12

    .line 605
    :cond_1f
    const/4 v7, 0x0

    .line 606
    :goto_12
    if-nez v7, :cond_20

    .line 607
    .line 608
    new-instance v7, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    const-string v8, "Index "

    .line 611
    .line 612
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v8, " is not a parent of "

    .line 619
    .line 620
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    invoke-static {v6}, Li0/m;->a(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :cond_20
    iput v5, v3, Ll0/g;->i:I

    .line 634
    .line 635
    iput v4, v3, Ll0/g;->h:I

    .line 636
    .line 637
    const/4 v4, 0x0

    .line 638
    iput v4, v3, Ll0/g;->l:I

    .line 639
    .line 640
    iput v4, v3, Ll0/g;->m:I

    .line 641
    .line 642
    move v3, v4

    .line 643
    move-object v4, v1

    .line 644
    move v1, v3

    .line 645
    move-wide/from16 v34, v10

    .line 646
    .line 647
    move/from16 v3, v17

    .line 648
    .line 649
    move/from16 v17, v18

    .line 650
    .line 651
    goto/16 :goto_1c

    .line 652
    .line 653
    :cond_21
    const-string v0, "Invalid restart scope"

    .line 654
    .line 655
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :cond_22
    const/4 v0, 0x0

    .line 660
    iget-object v4, v1, Li0/h0;->E:Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    iget-object v6, v1, Li0/h0;->g:Landroidx/lifecycle/x;

    .line 666
    .line 667
    invoke-virtual {v6}, Landroidx/lifecycle/x;->m()V

    .line 668
    .line 669
    .line 670
    iget-object v6, v8, Li0/r1;->a:Li0/q;

    .line 671
    .line 672
    if-eqz v6, :cond_28

    .line 673
    .line 674
    iget-object v7, v8, Li0/r1;->f:Lf/b0;

    .line 675
    .line 676
    if-eqz v7, :cond_28

    .line 677
    .line 678
    move/from16 v9, v18

    .line 679
    .line 680
    invoke-virtual {v8, v9}, Li0/r1;->d(Z)V

    .line 681
    .line 682
    .line 683
    :try_start_0
    iget-object v9, v7, Lf/b0;->b:[Ljava/lang/Object;

    .line 684
    .line 685
    iget-object v12, v7, Lf/b0;->c:[I

    .line 686
    .line 687
    iget-object v7, v7, Lf/b0;->a:[J

    .line 688
    .line 689
    array-length v13, v7

    .line 690
    add-int/lit8 v13, v13, -0x2

    .line 691
    .line 692
    if-ltz v13, :cond_27

    .line 693
    .line 694
    const/4 v15, 0x0

    .line 695
    :goto_13
    aget-wide v0, v7, v15

    .line 696
    .line 697
    move-wide/from16 v34, v10

    .line 698
    .line 699
    move-object v11, v9

    .line 700
    not-long v9, v0

    .line 701
    shl-long v9, v9, v24

    .line 702
    .line 703
    and-long/2addr v9, v0

    .line 704
    and-long v9, v9, v25

    .line 705
    .line 706
    cmp-long v9, v9, v25

    .line 707
    .line 708
    if-eqz v9, :cond_26

    .line 709
    .line 710
    sub-int v9, v15, v13

    .line 711
    .line 712
    not-int v9, v9

    .line 713
    ushr-int/lit8 v9, v9, 0x1f

    .line 714
    .line 715
    const/16 v27, 0x8

    .line 716
    .line 717
    rsub-int/lit8 v9, v9, 0x8

    .line 718
    .line 719
    const/4 v10, 0x0

    .line 720
    :goto_14
    if-ge v10, v9, :cond_24

    .line 721
    .line 722
    and-long v36, v0, v22

    .line 723
    .line 724
    cmp-long v30, v36, v20

    .line 725
    .line 726
    if-gez v30, :cond_23

    .line 727
    .line 728
    shl-int/lit8 v30, v15, 0x3

    .line 729
    .line 730
    add-int v30, v30, v10

    .line 731
    .line 732
    move-wide/from16 v36, v0

    .line 733
    .line 734
    aget-object v0, v11, v30

    .line 735
    .line 736
    aget v1, v12, v30

    .line 737
    .line 738
    invoke-virtual {v6, v0}, Li0/q;->y(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 739
    .line 740
    .line 741
    :goto_15
    const/16 v0, 0x8

    .line 742
    .line 743
    goto :goto_16

    .line 744
    :catchall_0
    move-exception v0

    .line 745
    const/4 v1, 0x0

    .line 746
    goto :goto_1a

    .line 747
    :cond_23
    move-wide/from16 v36, v0

    .line 748
    .line 749
    goto :goto_15

    .line 750
    :goto_16
    shr-long v36, v36, v0

    .line 751
    .line 752
    add-int/lit8 v10, v10, 0x1

    .line 753
    .line 754
    move-wide/from16 v0, v36

    .line 755
    .line 756
    goto :goto_14

    .line 757
    :cond_24
    const/16 v0, 0x8

    .line 758
    .line 759
    if-ne v9, v0, :cond_25

    .line 760
    .line 761
    goto :goto_18

    .line 762
    :cond_25
    :goto_17
    const/4 v1, 0x0

    .line 763
    goto :goto_19

    .line 764
    :cond_26
    const/16 v0, 0x8

    .line 765
    .line 766
    :goto_18
    if-eq v15, v13, :cond_25

    .line 767
    .line 768
    add-int/lit8 v15, v15, 0x1

    .line 769
    .line 770
    move-object v9, v11

    .line 771
    move-wide/from16 v10, v34

    .line 772
    .line 773
    goto :goto_13

    .line 774
    :cond_27
    move-wide/from16 v34, v10

    .line 775
    .line 776
    goto :goto_17

    .line 777
    :goto_19
    invoke-virtual {v8, v1}, Li0/r1;->d(Z)V

    .line 778
    .line 779
    .line 780
    goto :goto_1b

    .line 781
    :goto_1a
    invoke-virtual {v8, v1}, Li0/r1;->d(Z)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :cond_28
    move-wide/from16 v34, v10

    .line 786
    .line 787
    const/4 v1, 0x0

    .line 788
    :goto_1b
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    const/16 v18, 0x1

    .line 793
    .line 794
    add-int/lit8 v0, v0, -0x1

    .line 795
    .line 796
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-object/from16 v4, p0

    .line 800
    .line 801
    :goto_1c
    iget-object v0, v4, Li0/h0;->G:Ll0/g;

    .line 802
    .line 803
    iget v0, v0, Ll0/g;->g:I

    .line 804
    .line 805
    invoke-static {v0, v14}, Li0/r;->q(ILjava/util/List;)I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    if-gez v0, :cond_29

    .line 810
    .line 811
    add-int/lit8 v0, v0, 0x1

    .line 812
    .line 813
    neg-int v0, v0

    .line 814
    :cond_29
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 815
    .line 816
    .line 817
    move-result v6

    .line 818
    if-ge v0, v6, :cond_2a

    .line 819
    .line 820
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    check-cast v0, Li0/n0;

    .line 825
    .line 826
    iget v6, v0, Li0/n0;->b:I

    .line 827
    .line 828
    move/from16 v7, v33

    .line 829
    .line 830
    if-ge v6, v7, :cond_2b

    .line 831
    .line 832
    goto :goto_1d

    .line 833
    :cond_2a
    move/from16 v7, v33

    .line 834
    .line 835
    :cond_2b
    const/4 v0, 0x0

    .line 836
    :goto_1d
    move-object v1, v4

    .line 837
    move v6, v7

    .line 838
    move/from16 v7, v28

    .line 839
    .line 840
    move/from16 v9, v29

    .line 841
    .line 842
    move/from16 v12, v31

    .line 843
    .line 844
    move/from16 v13, v32

    .line 845
    .line 846
    move-wide/from16 v10, v34

    .line 847
    .line 848
    move-object v4, v0

    .line 849
    move-object/from16 v0, v19

    .line 850
    .line 851
    goto/16 :goto_1

    .line 852
    .line 853
    :cond_2c
    move-object v4, v1

    .line 854
    move/from16 v29, v9

    .line 855
    .line 856
    move-wide/from16 v34, v10

    .line 857
    .line 858
    move/from16 v31, v12

    .line 859
    .line 860
    move/from16 v32, v13

    .line 861
    .line 862
    if-eqz v17, :cond_2d

    .line 863
    .line 864
    invoke-virtual {v4, v3, v5, v5}, Li0/h0;->O(III)V

    .line 865
    .line 866
    .line 867
    iget-object v0, v4, Li0/h0;->G:Ll0/g;

    .line 868
    .line 869
    invoke-virtual {v0}, Ll0/g;->t()V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v4, v5}, Li0/h0;->m0(I)I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    add-int v9, v29, v0

    .line 877
    .line 878
    iput v9, v4, Li0/h0;->k:I

    .line 879
    .line 880
    add-int v12, v31, v0

    .line 881
    .line 882
    iput v12, v4, Li0/h0;->l:I

    .line 883
    .line 884
    move/from16 v0, v32

    .line 885
    .line 886
    iput v0, v4, Li0/h0;->m:I

    .line 887
    .line 888
    :goto_1e
    move-wide/from16 v0, v34

    .line 889
    .line 890
    goto :goto_1f

    .line 891
    :cond_2d
    invoke-virtual {v4}, Li0/h0;->U()V

    .line 892
    .line 893
    .line 894
    goto :goto_1e

    .line 895
    :goto_1f
    iput-wide v0, v4, Li0/h0;->T:J

    .line 896
    .line 897
    iput-boolean v2, v4, Li0/h0;->F:Z

    .line 898
    .line 899
    return-void
.end method

.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 2
    .line 3
    iget v0, v0, Ll0/g;->g:I

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Li0/h0;->Q(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li0/h0;->M:Lm0/b;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lm0/b;->d(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lm0/b;->d:Li0/m0;

    .line 15
    .line 16
    iget-object v3, v0, Lm0/b;->a:Li0/h0;

    .line 17
    .line 18
    iget-object v4, v3, Li0/h0;->G:Ll0/g;

    .line 19
    .line 20
    iget v5, v4, Ll0/g;->c:I

    .line 21
    .line 22
    if-lez v5, :cond_1

    .line 23
    .line 24
    iget v5, v4, Ll0/g;->i:I

    .line 25
    .line 26
    const/4 v6, -0x2

    .line 27
    invoke-virtual {v2, v6}, Li0/m0;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eq v6, v5, :cond_1

    .line 32
    .line 33
    iget-boolean v6, v0, Lm0/b;->c:Z

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    iget-boolean v6, v0, Lm0/b;->e:Z

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lm0/b;->d(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Lm0/b;->b:Lm0/a;

    .line 46
    .line 47
    iget-object v6, v6, Lm0/a;->j:Lm0/l0;

    .line 48
    .line 49
    sget-object v8, Lm0/q;->c:Lm0/q;

    .line 50
    .line 51
    invoke-virtual {v6, v8}, Lm0/l0;->U(Lm0/j0;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v7, v0, Lm0/b;->c:Z

    .line 55
    .line 56
    :cond_0
    if-lez v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ll0/g;->a(I)Ll0/b;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v2, v5}, Li0/m0;->c(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lm0/b;->d(Z)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, Lm0/b;->b:Lm0/a;

    .line 69
    .line 70
    iget-object v2, v2, Lm0/a;->j:Lm0/l0;

    .line 71
    .line 72
    sget-object v5, Lm0/p;->c:Lm0/p;

    .line 73
    .line 74
    invoke-virtual {v2, v5}, Lm0/l0;->U(Lm0/j0;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v1, v4}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-boolean v7, v0, Lm0/b;->c:Z

    .line 81
    .line 82
    :cond_1
    iget-object v1, v0, Lm0/b;->b:Lm0/a;

    .line 83
    .line 84
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 85
    .line 86
    sget-object v2, Lm0/y;->c:Lm0/y;

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 89
    .line 90
    .line 91
    iget v1, v0, Lm0/b;->f:I

    .line 92
    .line 93
    iget-object v2, v3, Li0/h0;->G:Ll0/g;

    .line 94
    .line 95
    iget-object v3, v2, Ll0/g;->b:[I

    .line 96
    .line 97
    iget v2, v2, Ll0/g;->g:I

    .line 98
    .line 99
    mul-int/lit8 v2, v2, 0x5

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x3

    .line 102
    .line 103
    aget v2, v3, v2

    .line 104
    .line 105
    add-int/2addr v2, v1

    .line 106
    iput v2, v0, Lm0/b;->f:I

    .line 107
    .line 108
    return-void
.end method

.method public final N(Ls0/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/h0;->v:Lf/w;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf/w;

    .line 6
    .line 7
    invoke-direct {v0}, Lf/w;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li0/h0;->v:Lf/w;

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 13
    .line 14
    iget v1, v1, Ll0/g;->g:I

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lf/w;->h(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final O(III)V
    .locals 6

    .line 1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eq p1, p3, :cond_9

    .line 7
    .line 8
    if-ne p2, p3, :cond_1

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_1
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v1, p2, :cond_2

    .line 17
    .line 18
    move p3, p2

    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_2
    invoke-virtual {v0, p2}, Ll0/g;->q(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v1, p1, :cond_3

    .line 26
    .line 27
    :goto_0
    move p3, p1

    .line 28
    goto :goto_6

    .line 29
    :cond_3
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, p2}, Ll0/g;->q(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ne v1, v2, :cond_4

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    goto :goto_6

    .line 44
    :cond_4
    const/4 v1, 0x0

    .line 45
    move v2, p1

    .line 46
    move v3, v1

    .line 47
    :goto_1
    if-lez v2, :cond_5

    .line 48
    .line 49
    if-eq v2, p3, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ll0/g;->q(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    move v2, p2

    .line 59
    move v4, v1

    .line 60
    :goto_2
    if-lez v2, :cond_6

    .line 61
    .line 62
    if-eq v2, p3, :cond_6

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ll0/g;->q(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    sub-int p3, v3, v4

    .line 72
    .line 73
    move v5, p1

    .line 74
    move v2, v1

    .line 75
    :goto_3
    if-ge v2, p3, :cond_7

    .line 76
    .line 77
    invoke-virtual {v0, v5}, Ll0/g;->q(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_7
    sub-int/2addr v4, v3

    .line 85
    move p3, p2

    .line 86
    :goto_4
    if-ge v1, v4, :cond_8

    .line 87
    .line 88
    invoke-virtual {v0, p3}, Ll0/g;->q(I)I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    move v1, p3

    .line 96
    move p3, v5

    .line 97
    :goto_5
    if-eq p3, v1, :cond_9

    .line 98
    .line 99
    invoke-virtual {v0, p3}, Ll0/g;->q(I)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-virtual {v0, v1}, Ll0/g;->q(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    goto :goto_5

    .line 108
    :cond_9
    :goto_6
    if-lez p1, :cond_b

    .line 109
    .line 110
    if-eq p1, p3, :cond_b

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Ll0/g;->l(I)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_a

    .line 117
    .line 118
    iget-object v1, p0, Li0/h0;->M:Lm0/b;

    .line 119
    .line 120
    invoke-virtual {v1}, Lm0/b;->a()V

    .line 121
    .line 122
    .line 123
    :cond_a
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    goto :goto_6

    .line 128
    :cond_b
    invoke-virtual {p0, p2, p3}, Li0/h0;->o(II)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final P()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    sget-object v1, Li0/l;->a:Li0/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Li0/h0;->r:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    .line 12
    .line 13
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Ll0/g;->m()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v2, p0, Li0/h0;->y:Z

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    instance-of v2, v0, Li0/d2;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    :cond_1
    return-object v1

    .line 32
    :cond_2
    instance-of v1, v0, Li0/k0;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    check-cast v0, Li0/k0;

    .line 37
    .line 38
    iget-object v0, v0, Li0/k0;->a:Li0/a2;

    .line 39
    .line 40
    :cond_3
    return-object v0
.end method

.method public final Q(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll0/g;->l(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Li0/h0;->M:Lm0/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lm0/b;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Li0/h0;->G:Ll0/g;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1}, Lm0/b;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, Lm0/b;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    invoke-static {p0, p1, v0, v2}, Li0/h0;->R(Li0/h0;IZI)I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lm0/b;->c()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Lm0/b;->a()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final S(IZ)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_5

    .line 5
    .line 6
    iget-boolean p1, p0, Li0/h0;->S:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-boolean p1, p0, Li0/h0;->y:Z

    .line 11
    .line 12
    if-eqz p1, :cond_5

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Li0/h0;->P:Li0/e2;

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Li0/h0;->A()Li0/r1;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-nez p2, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-interface {p1}, Li0/e2;->a()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_7

    .line 31
    .line 32
    iget p1, p2, Li0/r1;->b:I

    .line 33
    .line 34
    and-int/lit16 v2, p1, 0x200

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    return v0

    .line 39
    :cond_3
    or-int/lit8 v0, p1, 0x1

    .line 40
    .line 41
    iput v0, p2, Li0/r1;->b:I

    .line 42
    .line 43
    iget-boolean v2, p0, Li0/h0;->y:Z

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    or-int/lit16 p1, p1, 0x81

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    and-int/lit16 p1, v0, -0x81

    .line 51
    .line 52
    :goto_0
    or-int/lit16 p1, p1, 0x100

    .line 53
    .line 54
    iput p1, p2, Li0/r1;->b:I

    .line 55
    .line 56
    iget-object p1, p0, Li0/h0;->M:Lm0/b;

    .line 57
    .line 58
    iget-object p1, p1, Lm0/b;->b:Lm0/a;

    .line 59
    .line 60
    iget-object p1, p1, Lm0/a;->j:Lm0/l0;

    .line 61
    .line 62
    sget-object v0, Lm0/x;->c:Lm0/x;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lm0/l0;->U(Lm0/j0;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v1, p2}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Li0/h0;->b:Li0/o;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Li0/o;->q(Li0/r1;)V

    .line 73
    .line 74
    .line 75
    return v1

    .line 76
    :cond_5
    if-nez p2, :cond_7

    .line 77
    .line 78
    invoke-virtual {p0}, Li0/h0;->E()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_6

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_6
    return v1

    .line 86
    :cond_7
    :goto_1
    return v0
.end method

.method public final T()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, v0, Li0/h0;->l:I

    .line 12
    .line 13
    iget-object v2, v0, Li0/h0;->G:Ll0/g;

    .line 14
    .line 15
    invoke-virtual {v2}, Ll0/g;->s()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v2, v1

    .line 20
    iput v2, v0, Li0/h0;->l:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v1, v0, Li0/h0;->G:Ll0/g;

    .line 24
    .line 25
    invoke-virtual {v1}, Ll0/g;->g()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, v1, Ll0/g;->b:[I

    .line 30
    .line 31
    iget v4, v1, Ll0/g;->g:I

    .line 32
    .line 33
    iget v5, v1, Ll0/g;->h:I

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-ge v4, v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v3, v4}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v4, v6

    .line 44
    :goto_0
    invoke-virtual {v1}, Ll0/g;->f()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    iget v7, v0, Li0/h0;->m:I

    .line 49
    .line 50
    sget-object v8, Li0/l;->a:Li0/e;

    .line 51
    .line 52
    const/16 v9, 0xcf

    .line 53
    .line 54
    const/4 v11, 0x3

    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    if-ne v2, v9, :cond_2

    .line 60
    .line 61
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    if-nez v12, :cond_2

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    iget-wide v13, v0, Li0/h0;->T:J

    .line 72
    .line 73
    invoke-static {v13, v14, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 74
    .line 75
    .line 76
    move-result-wide v13

    .line 77
    int-to-long v9, v12

    .line 78
    xor-long/2addr v9, v13

    .line 79
    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    int-to-long v12, v7

    .line 84
    xor-long/2addr v9, v12

    .line 85
    iput-wide v9, v0, Li0/h0;->T:J

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    iget-wide v9, v0, Li0/h0;->T:J

    .line 89
    .line 90
    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    int-to-long v12, v2

    .line 95
    xor-long/2addr v9, v12

    .line 96
    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    int-to-long v12, v7

    .line 101
    xor-long/2addr v9, v12

    .line 102
    :goto_1
    iput-wide v9, v0, Li0/h0;->T:J

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    instance-of v9, v4, Ljava/lang/Enum;

    .line 106
    .line 107
    if-eqz v9, :cond_4

    .line 108
    .line 109
    move-object v9, v4

    .line 110
    check-cast v9, Ljava/lang/Enum;

    .line 111
    .line 112
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    iget-wide v12, v0, Li0/h0;->T:J

    .line 117
    .line 118
    invoke-static {v12, v13, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    int-to-long v9, v9

    .line 123
    xor-long/2addr v9, v12

    .line 124
    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    const/4 v12, 0x0

    .line 129
    :goto_2
    int-to-long v13, v12

    .line 130
    xor-long/2addr v9, v13

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const/4 v12, 0x0

    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    iget-wide v13, v0, Li0/h0;->T:J

    .line 138
    .line 139
    invoke-static {v13, v14, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 140
    .line 141
    .line 142
    move-result-wide v13

    .line 143
    int-to-long v9, v9

    .line 144
    xor-long/2addr v9, v13

    .line 145
    invoke-static {v9, v10, v11}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 146
    .line 147
    .line 148
    move-result-wide v9

    .line 149
    goto :goto_2

    .line 150
    :goto_3
    iget v9, v1, Ll0/g;->g:I

    .line 151
    .line 152
    mul-int/lit8 v9, v9, 0x5

    .line 153
    .line 154
    const/4 v12, 0x1

    .line 155
    add-int/2addr v9, v12

    .line 156
    aget v3, v3, v9

    .line 157
    .line 158
    const/high16 v9, 0x40000000    # 2.0f

    .line 159
    .line 160
    and-int/2addr v3, v9

    .line 161
    if-eqz v3, :cond_5

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    const/4 v12, 0x0

    .line 165
    :goto_4
    invoke-virtual {v0, v6, v12}, Li0/h0;->Z(Ljava/lang/Object;Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Li0/h0;->L()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ll0/g;->e()V

    .line 172
    .line 173
    .line 174
    if-nez v4, :cond_7

    .line 175
    .line 176
    if-eqz v5, :cond_6

    .line 177
    .line 178
    const/16 v15, 0xcf

    .line 179
    .line 180
    if-ne v2, v15, :cond_6

    .line 181
    .line 182
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_6

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    iget-wide v2, v0, Li0/h0;->T:J

    .line 193
    .line 194
    int-to-long v4, v7

    .line 195
    xor-long/2addr v2, v4

    .line 196
    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    int-to-long v4, v1

    .line 201
    xor-long v1, v2, v4

    .line 202
    .line 203
    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 204
    .line 205
    .line 206
    move-result-wide v1

    .line 207
    iput-wide v1, v0, Li0/h0;->T:J

    .line 208
    .line 209
    return-void

    .line 210
    :cond_6
    iget-wide v3, v0, Li0/h0;->T:J

    .line 211
    .line 212
    int-to-long v5, v7

    .line 213
    xor-long/2addr v3, v5

    .line 214
    invoke-static {v3, v4, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 215
    .line 216
    .line 217
    move-result-wide v3

    .line 218
    int-to-long v1, v2

    .line 219
    xor-long/2addr v1, v3

    .line 220
    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 221
    .line 222
    .line 223
    move-result-wide v1

    .line 224
    iput-wide v1, v0, Li0/h0;->T:J

    .line 225
    .line 226
    return-void

    .line 227
    :cond_7
    instance-of v1, v4, Ljava/lang/Enum;

    .line 228
    .line 229
    if-eqz v1, :cond_8

    .line 230
    .line 231
    check-cast v4, Ljava/lang/Enum;

    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    iget-wide v2, v0, Li0/h0;->T:J

    .line 238
    .line 239
    const/4 v12, 0x0

    .line 240
    int-to-long v4, v12

    .line 241
    xor-long/2addr v2, v4

    .line 242
    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    int-to-long v4, v1

    .line 247
    xor-long v1, v2, v4

    .line 248
    .line 249
    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 250
    .line 251
    .line 252
    move-result-wide v1

    .line 253
    iput-wide v1, v0, Li0/h0;->T:J

    .line 254
    .line 255
    return-void

    .line 256
    :cond_8
    const/4 v12, 0x0

    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    iget-wide v2, v0, Li0/h0;->T:J

    .line 262
    .line 263
    int-to-long v4, v12

    .line 264
    xor-long/2addr v2, v4

    .line 265
    invoke-static {v2, v3, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 266
    .line 267
    .line 268
    move-result-wide v2

    .line 269
    int-to-long v4, v1

    .line 270
    xor-long v1, v2, v4

    .line 271
    .line 272
    invoke-static {v1, v2, v11}, Ljava/lang/Long;->rotateRight(JI)J

    .line 273
    .line 274
    .line 275
    move-result-wide v1

    .line 276
    iput-wide v1, v0, Li0/h0;->T:J

    .line 277
    .line 278
    return-void
.end method

.method public final U()V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 2
    .line 3
    iget v1, v0, Ll0/g;->i:I

    .line 4
    .line 5
    if-ltz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Ll0/g;->b:[I

    .line 8
    .line 9
    mul-int/lit8 v1, v1, 0x5

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    aget v1, v2, v1

    .line 14
    .line 15
    const v2, 0x3ffffff

    .line 16
    .line 17
    .line 18
    and-int/2addr v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    iput v1, p0, Li0/h0;->l:I

    .line 22
    .line 23
    invoke-virtual {v0}, Ll0/g;->t()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final V()V
    .locals 3

    .line 1
    iget v0, p0, Li0/h0;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "No nodes can be emitted before calling skipAndEndGroup"

    .line 7
    .line 8
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 12
    .line 13
    if-nez v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Li0/h0;->A()Li0/r1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget v1, v0, Li0/r1;->b:I

    .line 22
    .line 23
    and-int/lit16 v2, v1, 0x80

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    or-int/lit8 v1, v1, 0x10

    .line 29
    .line 30
    iput v1, v0, Li0/r1;->b:I

    .line 31
    .line 32
    :cond_2
    :goto_1
    iget-object v0, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Li0/h0;->U()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    invoke-virtual {p0}, Li0/h0;->L()V

    .line 45
    .line 46
    .line 47
    :cond_4
    return-void
.end method

.method public final W(ILjava/lang/Object;Ljava/lang/Object;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    iget-boolean v7, v0, Li0/h0;->r:Z

    .line 17
    .line 18
    if-eqz v7, :cond_0

    .line 19
    .line 20
    const-string v7, "A call to createNode(), emitNode() or useNode() expected"

    .line 21
    .line 22
    invoke-static {v7}, Li0/m;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget v7, v0, Li0/h0;->m:I

    .line 26
    .line 27
    sget-object v8, Li0/l;->a:Li0/e;

    .line 28
    .line 29
    const/4 v9, 0x3

    .line 30
    const/4 v10, 0x0

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/16 v11, 0xcf

    .line 36
    .line 37
    if-ne v1, v11, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    iget-wide v12, v0, Li0/h0;->T:J

    .line 50
    .line 51
    invoke-static {v12, v13, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 52
    .line 53
    .line 54
    move-result-wide v12

    .line 55
    int-to-long v14, v11

    .line 56
    xor-long v11, v12, v14

    .line 57
    .line 58
    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 59
    .line 60
    .line 61
    move-result-wide v11

    .line 62
    int-to-long v13, v7

    .line 63
    xor-long/2addr v11, v13

    .line 64
    iput-wide v11, v0, Li0/h0;->T:J

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    iget-wide v11, v0, Li0/h0;->T:J

    .line 68
    .line 69
    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    int-to-long v13, v1

    .line 74
    xor-long/2addr v11, v13

    .line 75
    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    int-to-long v13, v7

    .line 80
    :goto_0
    xor-long/2addr v11, v13

    .line 81
    iput-wide v11, v0, Li0/h0;->T:J

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    instance-of v7, v2, Ljava/lang/Enum;

    .line 85
    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    move-object v7, v2

    .line 89
    check-cast v7, Ljava/lang/Enum;

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    :goto_1
    iget-wide v11, v0, Li0/h0;->T:J

    .line 96
    .line 97
    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 98
    .line 99
    .line 100
    move-result-wide v11

    .line 101
    int-to-long v13, v7

    .line 102
    xor-long/2addr v11, v13

    .line 103
    invoke-static {v11, v12, v9}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 104
    .line 105
    .line 106
    move-result-wide v11

    .line 107
    int-to-long v13, v10

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    goto :goto_1

    .line 114
    :goto_2
    const/4 v7, 0x1

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget v9, v0, Li0/h0;->m:I

    .line 118
    .line 119
    add-int/2addr v9, v7

    .line 120
    iput v9, v0, Li0/h0;->m:I

    .line 121
    .line 122
    :cond_4
    if-eqz v4, :cond_5

    .line 123
    .line 124
    move v9, v7

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move v9, v10

    .line 127
    :goto_3
    iget-boolean v11, v0, Li0/h0;->S:Z

    .line 128
    .line 129
    const/4 v12, -0x2

    .line 130
    const/4 v13, 0x0

    .line 131
    if-eqz v11, :cond_b

    .line 132
    .line 133
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 134
    .line 135
    iget v11, v4, Ll0/g;->k:I

    .line 136
    .line 137
    add-int/2addr v11, v7

    .line 138
    iput v11, v4, Ll0/g;->k:I

    .line 139
    .line 140
    iget-object v4, v0, Li0/h0;->I:Ll0/k;

    .line 141
    .line 142
    iget v11, v4, Ll0/k;->t:I

    .line 143
    .line 144
    if-eqz v9, :cond_6

    .line 145
    .line 146
    invoke-virtual {v4, v1, v8, v8, v7}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    if-eqz v3, :cond_8

    .line 151
    .line 152
    if-nez v2, :cond_7

    .line 153
    .line 154
    move-object v2, v8

    .line 155
    :cond_7
    invoke-virtual {v4, v1, v2, v3, v10}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    if-nez v2, :cond_9

    .line 160
    .line 161
    move-object v2, v8

    .line 162
    :cond_9
    invoke-virtual {v4, v1, v2, v8, v10}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 163
    .line 164
    .line 165
    :goto_4
    iget-object v2, v0, Li0/h0;->j:Li0/j0;

    .line 166
    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    new-instance v3, Ll0/e;

    .line 170
    .line 171
    sub-int/2addr v12, v11

    .line 172
    invoke-direct {v3, v6, v1, v12, v5}, Ll0/e;-><init>(Ljava/lang/Object;III)V

    .line 173
    .line 174
    .line 175
    iget v1, v0, Li0/h0;->k:I

    .line 176
    .line 177
    iget v4, v2, Li0/j0;->b:I

    .line 178
    .line 179
    sub-int/2addr v1, v4

    .line 180
    iget-object v4, v2, Li0/j0;->e:Lf/w;

    .line 181
    .line 182
    new-instance v6, Lk0/a;

    .line 183
    .line 184
    invoke-direct {v6, v5, v1, v10}, Lk0/a;-><init>(III)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v12, v6}, Lf/w;->h(ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, v2, Li0/j0;->d:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_a
    invoke-virtual {v0, v9, v13}, Li0/h0;->w(ZLi0/j0;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_b
    if-eq v4, v7, :cond_c

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_c
    iget-boolean v4, v0, Li0/h0;->y:Z

    .line 203
    .line 204
    if-eqz v4, :cond_d

    .line 205
    .line 206
    move v4, v7

    .line 207
    goto :goto_6

    .line 208
    :cond_d
    :goto_5
    move v4, v10

    .line 209
    :goto_6
    iget-object v11, v0, Li0/h0;->j:Li0/j0;

    .line 210
    .line 211
    if-nez v11, :cond_f

    .line 212
    .line 213
    iget-object v11, v0, Li0/h0;->G:Ll0/g;

    .line 214
    .line 215
    invoke-virtual {v11}, Ll0/g;->g()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    if-nez v4, :cond_10

    .line 220
    .line 221
    if-ne v11, v1, :cond_10

    .line 222
    .line 223
    iget-object v11, v0, Li0/h0;->G:Ll0/g;

    .line 224
    .line 225
    iget v14, v11, Ll0/g;->g:I

    .line 226
    .line 227
    iget v15, v11, Ll0/g;->h:I

    .line 228
    .line 229
    if-ge v14, v15, :cond_e

    .line 230
    .line 231
    iget-object v15, v11, Ll0/g;->b:[I

    .line 232
    .line 233
    invoke-virtual {v11, v15, v14}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    goto :goto_7

    .line 238
    :cond_e
    move-object v11, v13

    .line 239
    :goto_7
    invoke-static {v2, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    if-eqz v11, :cond_10

    .line 244
    .line 245
    invoke-virtual {v0, v3, v9}, Li0/h0;->Z(Ljava/lang/Object;Z)V

    .line 246
    .line 247
    .line 248
    :cond_f
    move/from16 p4, v4

    .line 249
    .line 250
    goto :goto_b

    .line 251
    :cond_10
    new-instance v11, Li0/j0;

    .line 252
    .line 253
    iget-object v14, v0, Li0/h0;->G:Ll0/g;

    .line 254
    .line 255
    iget-object v15, v14, Ll0/g;->b:[I

    .line 256
    .line 257
    new-instance v5, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    iget v13, v14, Ll0/g;->k:I

    .line 263
    .line 264
    if-lez v13, :cond_12

    .line 265
    .line 266
    :cond_11
    move/from16 p4, v4

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :cond_12
    iget v13, v14, Ll0/g;->g:I

    .line 270
    .line 271
    :goto_8
    iget v12, v14, Ll0/g;->h:I

    .line 272
    .line 273
    if-ge v13, v12, :cond_11

    .line 274
    .line 275
    new-instance v12, Ll0/e;

    .line 276
    .line 277
    mul-int/lit8 v18, v13, 0x5

    .line 278
    .line 279
    aget v7, v15, v18

    .line 280
    .line 281
    invoke-virtual {v14, v15, v13}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    add-int/lit8 v20, v18, 0x1

    .line 286
    .line 287
    aget v20, v15, v20

    .line 288
    .line 289
    const/high16 v21, 0x40000000    # 2.0f

    .line 290
    .line 291
    and-int v21, v20, v21

    .line 292
    .line 293
    if-eqz v21, :cond_13

    .line 294
    .line 295
    move/from16 p4, v4

    .line 296
    .line 297
    const/4 v4, 0x1

    .line 298
    goto :goto_9

    .line 299
    :cond_13
    const v21, 0x3ffffff

    .line 300
    .line 301
    .line 302
    and-int v20, v20, v21

    .line 303
    .line 304
    move/from16 p4, v4

    .line 305
    .line 306
    move/from16 v4, v20

    .line 307
    .line 308
    :goto_9
    invoke-direct {v12, v10, v7, v13, v4}, Ll0/e;-><init>(Ljava/lang/Object;III)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    add-int/lit8 v18, v18, 0x3

    .line 315
    .line 316
    aget v4, v15, v18

    .line 317
    .line 318
    add-int/2addr v13, v4

    .line 319
    move/from16 v4, p4

    .line 320
    .line 321
    const/4 v7, 0x1

    .line 322
    const/4 v10, 0x0

    .line 323
    goto :goto_8

    .line 324
    :goto_a
    iget v4, v0, Li0/h0;->k:I

    .line 325
    .line 326
    invoke-direct {v11, v4, v5}, Li0/j0;-><init>(ILjava/util/ArrayList;)V

    .line 327
    .line 328
    .line 329
    iput-object v11, v0, Li0/h0;->j:Li0/j0;

    .line 330
    .line 331
    :goto_b
    iget-object v4, v0, Li0/h0;->j:Li0/j0;

    .line 332
    .line 333
    if-eqz v4, :cond_2b

    .line 334
    .line 335
    iget-object v5, v4, Li0/j0;->d:Ljava/util/ArrayList;

    .line 336
    .line 337
    iget-object v7, v4, Li0/j0;->e:Lf/w;

    .line 338
    .line 339
    iget v10, v4, Li0/j0;->b:I

    .line 340
    .line 341
    if-eqz v2, :cond_14

    .line 342
    .line 343
    new-instance v11, Li0/p0;

    .line 344
    .line 345
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    invoke-direct {v11, v12, v2}, Li0/p0;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    :goto_c
    iget-object v12, v4, Li0/j0;->f:Lsf/i;

    .line 358
    .line 359
    invoke-virtual {v12}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v12

    .line 363
    check-cast v12, Lj0/a;

    .line 364
    .line 365
    iget-object v12, v12, Lj0/a;->a:Lf/k0;

    .line 366
    .line 367
    invoke-virtual {v12, v11}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v13

    .line 371
    if-nez v13, :cond_15

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    goto :goto_d

    .line 375
    :cond_15
    instance-of v14, v13, Lf/f0;

    .line 376
    .line 377
    if-eqz v14, :cond_18

    .line 378
    .line 379
    check-cast v13, Lf/f0;

    .line 380
    .line 381
    const/4 v14, 0x0

    .line 382
    invoke-virtual {v13, v14}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v15

    .line 386
    invoke-virtual {v13}, Lf/f0;->h()Z

    .line 387
    .line 388
    .line 389
    move-result v14

    .line 390
    if-eqz v14, :cond_16

    .line 391
    .line 392
    invoke-virtual {v12, v11}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    :cond_16
    iget v14, v13, Lf/f0;->b:I

    .line 396
    .line 397
    const/4 v2, 0x1

    .line 398
    if-ne v14, v2, :cond_17

    .line 399
    .line 400
    invoke-virtual {v13}, Lf/f0;->e()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-virtual {v12, v11, v2}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    :cond_17
    move-object v13, v15

    .line 408
    goto :goto_d

    .line 409
    :cond_18
    invoke-virtual {v12, v11}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    :goto_d
    check-cast v13, Ll0/e;

    .line 413
    .line 414
    if-nez p4, :cond_2c

    .line 415
    .line 416
    if-eqz v13, :cond_2c

    .line 417
    .line 418
    iget v1, v13, Ll0/e;->c:I

    .line 419
    .line 420
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    invoke-virtual {v7, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    check-cast v2, Lk0/a;

    .line 428
    .line 429
    if-eqz v2, :cond_19

    .line 430
    .line 431
    iget v2, v2, Lk0/a;->b:I

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_19
    const/4 v2, -0x1

    .line 435
    :goto_e
    add-int/2addr v2, v10

    .line 436
    iput v2, v0, Li0/h0;->k:I

    .line 437
    .line 438
    invoke-virtual {v7, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, Lk0/a;

    .line 443
    .line 444
    if-eqz v2, :cond_1a

    .line 445
    .line 446
    iget v5, v2, Lk0/a;->a:I

    .line 447
    .line 448
    goto :goto_f

    .line 449
    :cond_1a
    const/4 v5, -0x1

    .line 450
    :goto_f
    iget v2, v4, Li0/j0;->c:I

    .line 451
    .line 452
    sub-int v4, v5, v2

    .line 453
    .line 454
    const/16 v8, 0x8

    .line 455
    .line 456
    if-le v5, v2, :cond_21

    .line 457
    .line 458
    const/16 p1, 0x7

    .line 459
    .line 460
    iget-object v6, v7, Lf/k;->c:[Ljava/lang/Object;

    .line 461
    .line 462
    iget-object v7, v7, Lf/k;->a:[J

    .line 463
    .line 464
    const-wide/16 v20, 0x80

    .line 465
    .line 466
    array-length v10, v7

    .line 467
    add-int/lit8 v10, v10, -0x2

    .line 468
    .line 469
    if-ltz v10, :cond_20

    .line 470
    .line 471
    const/4 v11, 0x0

    .line 472
    const-wide/16 v22, 0xff

    .line 473
    .line 474
    :goto_10
    aget-wide v12, v7, v11

    .line 475
    .line 476
    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    not-long v14, v12

    .line 482
    shl-long v14, v14, p1

    .line 483
    .line 484
    and-long/2addr v14, v12

    .line 485
    and-long v14, v14, v24

    .line 486
    .line 487
    cmp-long v14, v14, v24

    .line 488
    .line 489
    if-eqz v14, :cond_1f

    .line 490
    .line 491
    sub-int v14, v11, v10

    .line 492
    .line 493
    not-int v14, v14

    .line 494
    ushr-int/lit8 v14, v14, 0x1f

    .line 495
    .line 496
    rsub-int/lit8 v14, v14, 0x8

    .line 497
    .line 498
    const/4 v15, 0x0

    .line 499
    :goto_11
    if-ge v15, v14, :cond_1e

    .line 500
    .line 501
    and-long v26, v12, v22

    .line 502
    .line 503
    cmp-long v16, v26, v20

    .line 504
    .line 505
    if-gez v16, :cond_1c

    .line 506
    .line 507
    shl-int/lit8 v16, v11, 0x3

    .line 508
    .line 509
    add-int v16, v16, v15

    .line 510
    .line 511
    aget-object v16, v6, v16

    .line 512
    .line 513
    move/from16 p2, v8

    .line 514
    .line 515
    move-object/from16 v8, v16

    .line 516
    .line 517
    check-cast v8, Lk0/a;

    .line 518
    .line 519
    move/from16 p4, v4

    .line 520
    .line 521
    iget v4, v8, Lk0/a;->a:I

    .line 522
    .line 523
    if-ne v4, v5, :cond_1b

    .line 524
    .line 525
    iput v2, v8, Lk0/a;->a:I

    .line 526
    .line 527
    goto :goto_12

    .line 528
    :cond_1b
    if-gt v2, v4, :cond_1d

    .line 529
    .line 530
    if-ge v4, v5, :cond_1d

    .line 531
    .line 532
    add-int/lit8 v4, v4, 0x1

    .line 533
    .line 534
    iput v4, v8, Lk0/a;->a:I

    .line 535
    .line 536
    goto :goto_12

    .line 537
    :cond_1c
    move/from16 p4, v4

    .line 538
    .line 539
    move/from16 p2, v8

    .line 540
    .line 541
    :cond_1d
    :goto_12
    shr-long v12, v12, p2

    .line 542
    .line 543
    add-int/lit8 v15, v15, 0x1

    .line 544
    .line 545
    move/from16 v8, p2

    .line 546
    .line 547
    move/from16 v4, p4

    .line 548
    .line 549
    goto :goto_11

    .line 550
    :cond_1e
    move/from16 p4, v4

    .line 551
    .line 552
    move v4, v8

    .line 553
    if-ne v14, v4, :cond_27

    .line 554
    .line 555
    goto :goto_13

    .line 556
    :cond_1f
    move/from16 p4, v4

    .line 557
    .line 558
    :goto_13
    if-eq v11, v10, :cond_27

    .line 559
    .line 560
    add-int/lit8 v11, v11, 0x1

    .line 561
    .line 562
    move/from16 v4, p4

    .line 563
    .line 564
    const/16 v8, 0x8

    .line 565
    .line 566
    goto :goto_10

    .line 567
    :cond_20
    move/from16 p4, v4

    .line 568
    .line 569
    goto/16 :goto_1a

    .line 570
    .line 571
    :cond_21
    move/from16 p4, v4

    .line 572
    .line 573
    const/16 p1, 0x7

    .line 574
    .line 575
    const-wide/16 v20, 0x80

    .line 576
    .line 577
    const-wide/16 v22, 0xff

    .line 578
    .line 579
    const-wide v24, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    if-le v2, v5, :cond_27

    .line 585
    .line 586
    iget-object v4, v7, Lf/k;->c:[Ljava/lang/Object;

    .line 587
    .line 588
    iget-object v6, v7, Lf/k;->a:[J

    .line 589
    .line 590
    array-length v7, v6

    .line 591
    add-int/lit8 v7, v7, -0x2

    .line 592
    .line 593
    if-ltz v7, :cond_27

    .line 594
    .line 595
    const/4 v8, 0x0

    .line 596
    :goto_14
    aget-wide v10, v6, v8

    .line 597
    .line 598
    not-long v12, v10

    .line 599
    shl-long v12, v12, p1

    .line 600
    .line 601
    and-long/2addr v12, v10

    .line 602
    and-long v12, v12, v24

    .line 603
    .line 604
    cmp-long v12, v12, v24

    .line 605
    .line 606
    if-eqz v12, :cond_26

    .line 607
    .line 608
    sub-int v12, v8, v7

    .line 609
    .line 610
    not-int v12, v12

    .line 611
    ushr-int/lit8 v12, v12, 0x1f

    .line 612
    .line 613
    const/16 v13, 0x8

    .line 614
    .line 615
    rsub-int/lit8 v12, v12, 0x8

    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    :goto_15
    if-ge v13, v12, :cond_25

    .line 619
    .line 620
    and-long v14, v10, v22

    .line 621
    .line 622
    cmp-long v14, v14, v20

    .line 623
    .line 624
    if-gez v14, :cond_24

    .line 625
    .line 626
    shl-int/lit8 v14, v8, 0x3

    .line 627
    .line 628
    add-int/2addr v14, v13

    .line 629
    aget-object v14, v4, v14

    .line 630
    .line 631
    check-cast v14, Lk0/a;

    .line 632
    .line 633
    iget v15, v14, Lk0/a;->a:I

    .line 634
    .line 635
    if-ne v15, v5, :cond_22

    .line 636
    .line 637
    iput v2, v14, Lk0/a;->a:I

    .line 638
    .line 639
    goto :goto_17

    .line 640
    :cond_22
    move-object/from16 v16, v4

    .line 641
    .line 642
    add-int/lit8 v4, v5, 0x1

    .line 643
    .line 644
    if-gt v4, v15, :cond_23

    .line 645
    .line 646
    if-ge v15, v2, :cond_23

    .line 647
    .line 648
    add-int/lit8 v15, v15, -0x1

    .line 649
    .line 650
    iput v15, v14, Lk0/a;->a:I

    .line 651
    .line 652
    :cond_23
    :goto_16
    const/16 v4, 0x8

    .line 653
    .line 654
    goto :goto_18

    .line 655
    :cond_24
    :goto_17
    move-object/from16 v16, v4

    .line 656
    .line 657
    goto :goto_16

    .line 658
    :goto_18
    shr-long/2addr v10, v4

    .line 659
    add-int/lit8 v13, v13, 0x1

    .line 660
    .line 661
    move-object/from16 v4, v16

    .line 662
    .line 663
    goto :goto_15

    .line 664
    :cond_25
    move-object/from16 v16, v4

    .line 665
    .line 666
    const/16 v4, 0x8

    .line 667
    .line 668
    if-ne v12, v4, :cond_27

    .line 669
    .line 670
    goto :goto_19

    .line 671
    :cond_26
    move-object/from16 v16, v4

    .line 672
    .line 673
    const/16 v4, 0x8

    .line 674
    .line 675
    :goto_19
    if-eq v8, v7, :cond_27

    .line 676
    .line 677
    add-int/lit8 v8, v8, 0x1

    .line 678
    .line 679
    move-object/from16 v4, v16

    .line 680
    .line 681
    goto :goto_14

    .line 682
    :cond_27
    :goto_1a
    iget-object v2, v0, Li0/h0;->M:Lm0/b;

    .line 683
    .line 684
    iget v4, v2, Lm0/b;->f:I

    .line 685
    .line 686
    iget-object v5, v2, Lm0/b;->a:Li0/h0;

    .line 687
    .line 688
    iget-object v6, v5, Li0/h0;->G:Ll0/g;

    .line 689
    .line 690
    iget v6, v6, Ll0/g;->g:I

    .line 691
    .line 692
    sub-int v6, v1, v6

    .line 693
    .line 694
    add-int/2addr v6, v4

    .line 695
    iput v6, v2, Lm0/b;->f:I

    .line 696
    .line 697
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 698
    .line 699
    invoke-virtual {v4, v1}, Ll0/g;->r(I)V

    .line 700
    .line 701
    .line 702
    if-lez p4, :cond_2a

    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    invoke-virtual {v2, v14}, Lm0/b;->d(Z)V

    .line 706
    .line 707
    .line 708
    iget-object v1, v2, Lm0/b;->d:Li0/m0;

    .line 709
    .line 710
    iget-object v4, v5, Li0/h0;->G:Ll0/g;

    .line 711
    .line 712
    iget v5, v4, Ll0/g;->c:I

    .line 713
    .line 714
    if-lez v5, :cond_29

    .line 715
    .line 716
    iget v5, v4, Ll0/g;->i:I

    .line 717
    .line 718
    const/4 v6, -0x2

    .line 719
    invoke-virtual {v1, v6}, Li0/m0;->a(I)I

    .line 720
    .line 721
    .line 722
    move-result v6

    .line 723
    if-eq v6, v5, :cond_29

    .line 724
    .line 725
    iget-boolean v6, v2, Lm0/b;->c:Z

    .line 726
    .line 727
    if-nez v6, :cond_28

    .line 728
    .line 729
    iget-boolean v6, v2, Lm0/b;->e:Z

    .line 730
    .line 731
    if-eqz v6, :cond_28

    .line 732
    .line 733
    const/4 v14, 0x0

    .line 734
    invoke-virtual {v2, v14}, Lm0/b;->d(Z)V

    .line 735
    .line 736
    .line 737
    iget-object v6, v2, Lm0/b;->b:Lm0/a;

    .line 738
    .line 739
    iget-object v6, v6, Lm0/a;->j:Lm0/l0;

    .line 740
    .line 741
    sget-object v7, Lm0/q;->c:Lm0/q;

    .line 742
    .line 743
    invoke-virtual {v6, v7}, Lm0/l0;->U(Lm0/j0;)V

    .line 744
    .line 745
    .line 746
    const/4 v6, 0x1

    .line 747
    iput-boolean v6, v2, Lm0/b;->c:Z

    .line 748
    .line 749
    :cond_28
    if-lez v5, :cond_29

    .line 750
    .line 751
    invoke-virtual {v4, v5}, Ll0/g;->a(I)Ll0/b;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-virtual {v1, v5}, Li0/m0;->c(I)V

    .line 756
    .line 757
    .line 758
    const/4 v14, 0x0

    .line 759
    invoke-virtual {v2, v14}, Lm0/b;->d(Z)V

    .line 760
    .line 761
    .line 762
    iget-object v1, v2, Lm0/b;->b:Lm0/a;

    .line 763
    .line 764
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 765
    .line 766
    sget-object v5, Lm0/p;->c:Lm0/p;

    .line 767
    .line 768
    invoke-virtual {v1, v5}, Lm0/l0;->U(Lm0/j0;)V

    .line 769
    .line 770
    .line 771
    invoke-static {v1, v14, v4}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    const/4 v6, 0x1

    .line 775
    iput-boolean v6, v2, Lm0/b;->c:Z

    .line 776
    .line 777
    :cond_29
    iget-object v1, v2, Lm0/b;->b:Lm0/a;

    .line 778
    .line 779
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 780
    .line 781
    sget-object v2, Lm0/u;->c:Lm0/u;

    .line 782
    .line 783
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 784
    .line 785
    .line 786
    iget-object v2, v1, Lm0/l0;->e:[I

    .line 787
    .line 788
    iget v4, v1, Lm0/l0;->f:I

    .line 789
    .line 790
    iget-object v5, v1, Lm0/l0;->c:[Lm0/j0;

    .line 791
    .line 792
    iget v1, v1, Lm0/l0;->d:I

    .line 793
    .line 794
    const/16 v19, 0x1

    .line 795
    .line 796
    add-int/lit8 v1, v1, -0x1

    .line 797
    .line 798
    aget-object v1, v5, v1

    .line 799
    .line 800
    iget v1, v1, Lm0/j0;->a:I

    .line 801
    .line 802
    sub-int/2addr v4, v1

    .line 803
    aput p4, v2, v4

    .line 804
    .line 805
    :cond_2a
    invoke-virtual {v0, v3, v9}, Li0/h0;->Z(Ljava/lang/Object;Z)V

    .line 806
    .line 807
    .line 808
    :cond_2b
    const/4 v2, 0x0

    .line 809
    goto/16 :goto_20

    .line 810
    .line 811
    :cond_2c
    iget-object v2, v0, Li0/h0;->G:Ll0/g;

    .line 812
    .line 813
    iget v4, v2, Ll0/g;->k:I

    .line 814
    .line 815
    const/4 v11, 0x1

    .line 816
    add-int/2addr v4, v11

    .line 817
    iput v4, v2, Ll0/g;->k:I

    .line 818
    .line 819
    iput-boolean v11, v0, Li0/h0;->S:Z

    .line 820
    .line 821
    const/4 v2, 0x0

    .line 822
    iput-object v2, v0, Li0/h0;->K:Ls0/h;

    .line 823
    .line 824
    iget-object v4, v0, Li0/h0;->I:Ll0/k;

    .line 825
    .line 826
    iget-boolean v4, v4, Ll0/k;->w:Z

    .line 827
    .line 828
    if-eqz v4, :cond_2d

    .line 829
    .line 830
    iget-object v4, v0, Li0/h0;->H:Ll0/h;

    .line 831
    .line 832
    invoke-virtual {v4}, Ll0/h;->e()Ll0/k;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    iput-object v4, v0, Li0/h0;->I:Ll0/k;

    .line 837
    .line 838
    invoke-virtual {v4}, Ll0/k;->M()V

    .line 839
    .line 840
    .line 841
    const/4 v14, 0x0

    .line 842
    iput-boolean v14, v0, Li0/h0;->J:Z

    .line 843
    .line 844
    iput-object v2, v0, Li0/h0;->K:Ls0/h;

    .line 845
    .line 846
    :cond_2d
    iget-object v2, v0, Li0/h0;->I:Ll0/k;

    .line 847
    .line 848
    invoke-virtual {v2}, Ll0/k;->d()V

    .line 849
    .line 850
    .line 851
    iget-object v2, v0, Li0/h0;->I:Ll0/k;

    .line 852
    .line 853
    iget v4, v2, Ll0/k;->t:I

    .line 854
    .line 855
    if-eqz v9, :cond_2e

    .line 856
    .line 857
    const/4 v11, 0x1

    .line 858
    invoke-virtual {v2, v1, v8, v8, v11}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 859
    .line 860
    .line 861
    const/4 v14, 0x0

    .line 862
    goto :goto_1e

    .line 863
    :cond_2e
    if-eqz v3, :cond_30

    .line 864
    .line 865
    if-nez p2, :cond_2f

    .line 866
    .line 867
    :goto_1b
    const/4 v14, 0x0

    .line 868
    goto :goto_1c

    .line 869
    :cond_2f
    move-object/from16 v8, p2

    .line 870
    .line 871
    goto :goto_1b

    .line 872
    :goto_1c
    invoke-virtual {v2, v1, v8, v3, v14}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 873
    .line 874
    .line 875
    goto :goto_1e

    .line 876
    :cond_30
    const/4 v14, 0x0

    .line 877
    if-nez p2, :cond_31

    .line 878
    .line 879
    move-object v3, v8

    .line 880
    goto :goto_1d

    .line 881
    :cond_31
    move-object/from16 v3, p2

    .line 882
    .line 883
    :goto_1d
    invoke-virtual {v2, v1, v3, v8, v14}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 884
    .line 885
    .line 886
    :goto_1e
    iget-object v2, v0, Li0/h0;->I:Ll0/k;

    .line 887
    .line 888
    invoke-virtual {v2, v4}, Ll0/k;->b(I)Ll0/b;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    iput-object v2, v0, Li0/h0;->N:Ll0/b;

    .line 893
    .line 894
    new-instance v2, Ll0/e;

    .line 895
    .line 896
    const/16 v17, -0x2

    .line 897
    .line 898
    rsub-int/lit8 v12, v4, -0x2

    .line 899
    .line 900
    const/4 v3, -0x1

    .line 901
    invoke-direct {v2, v6, v1, v12, v3}, Ll0/e;-><init>(Ljava/lang/Object;III)V

    .line 902
    .line 903
    .line 904
    iget v1, v0, Li0/h0;->k:I

    .line 905
    .line 906
    sub-int/2addr v1, v10

    .line 907
    new-instance v4, Lk0/a;

    .line 908
    .line 909
    invoke-direct {v4, v3, v1, v14}, Lk0/a;-><init>(III)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v7, v12, v4}, Lf/w;->h(ILjava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    new-instance v13, Li0/j0;

    .line 919
    .line 920
    new-instance v1, Ljava/util/ArrayList;

    .line 921
    .line 922
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 923
    .line 924
    .line 925
    if-eqz v9, :cond_32

    .line 926
    .line 927
    move v10, v14

    .line 928
    goto :goto_1f

    .line 929
    :cond_32
    iget v10, v0, Li0/h0;->k:I

    .line 930
    .line 931
    :goto_1f
    invoke-direct {v13, v10, v1}, Li0/j0;-><init>(ILjava/util/ArrayList;)V

    .line 932
    .line 933
    .line 934
    goto :goto_21

    .line 935
    :goto_20
    move-object v13, v2

    .line 936
    :goto_21
    invoke-virtual {v0, v9, v13}, Li0/h0;->w(ZLi0/j0;)V

    .line 937
    .line 938
    .line 939
    return-void
.end method

.method public final X()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, -0x7f

    .line 4
    .line 5
    invoke-virtual {p0, v2, v0, v0, v1}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final Y(ILi0/d1;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, v1, v0}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z(Ljava/lang/Object;Z)V
    .locals 2

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    iget-object p1, p0, Li0/h0;->G:Ll0/g;

    .line 4
    .line 5
    iget p2, p1, Ll0/g;->k:I

    .line 6
    .line 7
    if-gtz p2, :cond_1

    .line 8
    .line 9
    iget-object p2, p1, Ll0/g;->b:[I

    .line 10
    .line 11
    iget v0, p1, Ll0/g;->g:I

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x5

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    aget p2, p2, v0

    .line 18
    .line 19
    const/high16 v0, 0x40000000    # 2.0f

    .line 20
    .line 21
    and-int/2addr p2, v0

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p2, "Expected a node group"

    .line 26
    .line 27
    invoke-static {p2}, Li0/n1;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p1}, Ll0/g;->u()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :cond_2
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object p2, p0, Li0/h0;->G:Ll0/g;

    .line 37
    .line 38
    invoke-virtual {p2}, Ll0/g;->f()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eq p2, p1, :cond_3

    .line 43
    .line 44
    iget-object p2, p0, Li0/h0;->M:Lm0/b;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, v0}, Lm0/b;->d(Z)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p2, Lm0/b;->b:Lm0/a;

    .line 54
    .line 55
    iget-object p2, p2, Lm0/a;->j:Lm0/l0;

    .line 56
    .line 57
    sget-object v1, Lm0/f0;->c:Lm0/f0;

    .line 58
    .line 59
    invoke-virtual {p2, v1}, Lm0/l0;->U(Lm0/j0;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2, v0, p1}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object p1, p0, Li0/h0;->G:Ll0/g;

    .line 66
    .line 67
    invoke-virtual {p1}, Ll0/g;->u()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final a()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li0/h0;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li0/h0;->n:Li0/m0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, v0, Li0/m0;->b:I

    .line 13
    .line 14
    iget-object v0, p0, Li0/h0;->t:Li0/m0;

    .line 15
    .line 16
    iput v1, v0, Li0/m0;->b:I

    .line 17
    .line 18
    iget-object v0, p0, Li0/h0;->x:Li0/m0;

    .line 19
    .line 20
    iput v1, v0, Li0/m0;->b:I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Li0/h0;->v:Lf/w;

    .line 24
    .line 25
    iget-object v0, p0, Li0/h0;->O:Lm0/c;

    .line 26
    .line 27
    iget-object v2, v0, Lm0/c;->d:Lm0/l0;

    .line 28
    .line 29
    invoke-virtual {v2}, Lm0/l0;->R()V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lm0/c;->c:Lm0/l0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lm0/l0;->R()V

    .line 35
    .line 36
    .line 37
    int-to-long v2, v1

    .line 38
    iput-wide v2, p0, Li0/h0;->T:J

    .line 39
    .line 40
    iput v1, p0, Li0/h0;->A:I

    .line 41
    .line 42
    iput-boolean v1, p0, Li0/h0;->r:Z

    .line 43
    .line 44
    iput-boolean v1, p0, Li0/h0;->S:Z

    .line 45
    .line 46
    iput-boolean v1, p0, Li0/h0;->y:Z

    .line 47
    .line 48
    iput-boolean v1, p0, Li0/h0;->F:Z

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    iput v0, p0, Li0/h0;->z:I

    .line 52
    .line 53
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 54
    .line 55
    iget-boolean v1, v0, Ll0/g;->f:Z

    .line 56
    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0}, Ll0/g;->c()V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 63
    .line 64
    iget-boolean v0, v0, Ll0/k;->w:Z

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Li0/h0;->x()V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public final a0(I)V
    .locals 9

    .line 1
    iget-object v0, p0, Li0/h0;->j:Li0/j0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v2, v2, v1}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Li0/h0;->r:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    .line 16
    .line 17
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget v0, p0, Li0/h0;->m:I

    .line 21
    .line 22
    iget-wide v3, p0, Li0/h0;->T:J

    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    invoke-static {v3, v4, v5}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    int-to-long v6, p1

    .line 30
    xor-long/2addr v3, v6

    .line 31
    invoke-static {v3, v4, v5}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    int-to-long v5, v0

    .line 36
    xor-long/2addr v3, v5

    .line 37
    iput-wide v3, p0, Li0/h0;->T:J

    .line 38
    .line 39
    iget v0, p0, Li0/h0;->m:I

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    add-int/2addr v0, v3

    .line 43
    iput v0, p0, Li0/h0;->m:I

    .line 44
    .line 45
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 46
    .line 47
    iget-boolean v4, p0, Li0/h0;->S:Z

    .line 48
    .line 49
    sget-object v5, Li0/l;->a:Li0/e;

    .line 50
    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    iget v4, v0, Ll0/g;->k:I

    .line 54
    .line 55
    add-int/2addr v4, v3

    .line 56
    iput v4, v0, Ll0/g;->k:I

    .line 57
    .line 58
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 59
    .line 60
    invoke-virtual {v0, p1, v5, v5, v1}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1, v2}, Li0/h0;->w(ZLi0/j0;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0}, Ll0/g;->g()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ne v4, p1, :cond_4

    .line 72
    .line 73
    iget v4, v0, Ll0/g;->g:I

    .line 74
    .line 75
    iget v6, v0, Ll0/g;->h:I

    .line 76
    .line 77
    if-ge v4, v6, :cond_3

    .line 78
    .line 79
    iget-object v6, v0, Ll0/g;->b:[I

    .line 80
    .line 81
    mul-int/lit8 v4, v4, 0x5

    .line 82
    .line 83
    add-int/2addr v4, v3

    .line 84
    aget v4, v6, v4

    .line 85
    .line 86
    const/high16 v6, 0x20000000

    .line 87
    .line 88
    and-int/2addr v4, v6

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {v0}, Ll0/g;->u()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v1, v2}, Li0/h0;->w(ZLi0/j0;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    :goto_0
    iget v4, v0, Ll0/g;->k:I

    .line 100
    .line 101
    if-lez v4, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    iget v4, v0, Ll0/g;->g:I

    .line 105
    .line 106
    iget v6, v0, Ll0/g;->h:I

    .line 107
    .line 108
    if-ne v4, v6, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    iget v6, p0, Li0/h0;->k:I

    .line 112
    .line 113
    invoke-virtual {p0}, Li0/h0;->M()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ll0/g;->s()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    iget-object v8, p0, Li0/h0;->M:Lm0/b;

    .line 121
    .line 122
    invoke-virtual {v8, v6, v7}, Lm0/b;->e(II)V

    .line 123
    .line 124
    .line 125
    iget-object v6, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 126
    .line 127
    iget v7, v0, Ll0/g;->g:I

    .line 128
    .line 129
    invoke-static {v6, v4, v7}, Li0/r;->k(Ljava/util/List;II)V

    .line 130
    .line 131
    .line 132
    :goto_1
    iget v4, v0, Ll0/g;->k:I

    .line 133
    .line 134
    add-int/2addr v4, v3

    .line 135
    iput v4, v0, Ll0/g;->k:I

    .line 136
    .line 137
    iput-boolean v3, p0, Li0/h0;->S:Z

    .line 138
    .line 139
    iput-object v2, p0, Li0/h0;->K:Ls0/h;

    .line 140
    .line 141
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 142
    .line 143
    iget-boolean v0, v0, Ll0/k;->w:Z

    .line 144
    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    iget-object v0, p0, Li0/h0;->H:Ll0/h;

    .line 148
    .line 149
    invoke-virtual {v0}, Ll0/h;->e()Ll0/k;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iput-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 154
    .line 155
    invoke-virtual {v0}, Ll0/k;->M()V

    .line 156
    .line 157
    .line 158
    iput-boolean v1, p0, Li0/h0;->J:Z

    .line 159
    .line 160
    iput-object v2, p0, Li0/h0;->K:Ls0/h;

    .line 161
    .line 162
    :cond_7
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 163
    .line 164
    invoke-virtual {v0}, Ll0/k;->d()V

    .line 165
    .line 166
    .line 167
    iget v3, v0, Ll0/k;->t:I

    .line 168
    .line 169
    invoke-virtual {v0, p1, v5, v5, v1}, Ll0/k;->Q(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v3}, Ll0/k;->b(I)Ll0/b;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iput-object p1, p0, Li0/h0;->N:Ll0/b;

    .line 177
    .line 178
    invoke-virtual {p0, v1, v2}, Li0/h0;->w(ZLi0/j0;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final b(Lfg/p;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Li0/h0;->O:Lm0/c;

    .line 9
    .line 10
    iget-object v0, v0, Lm0/c;->c:Lm0/l0;

    .line 11
    .line 12
    sget-object v4, Lm0/g0;->c:Lm0/g0;

    .line 13
    .line 14
    invoke-virtual {v0, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v3, p2}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, p1}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Li0/h0;->M:Lm0/b;

    .line 31
    .line 32
    invoke-virtual {v0}, Lm0/b;->b()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Lm0/b;->b:Lm0/a;

    .line 36
    .line 37
    iget-object v0, v0, Lm0/a;->j:Lm0/l0;

    .line 38
    .line 39
    sget-object v4, Lm0/g0;->c:Lm0/g0;

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p1}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v3, p2, v2, p1}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final b0(I)Li0/h0;
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Li0/h0;->a0(I)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Li0/h0;->S:Z

    .line 5
    .line 6
    iget-object v0, p0, Li0/h0;->g:Landroidx/lifecycle/x;

    .line 7
    .line 8
    iget-object v1, p0, Li0/h0;->E:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Li0/h0;->h:Li0/q;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Li0/r1;

    .line 15
    .line 16
    invoke-direct {p1, v2}, Li0/r1;-><init>(Li0/q;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget v1, p0, Li0/h0;->B:I

    .line 26
    .line 27
    iput v1, p1, Li0/r1;->e:I

    .line 28
    .line 29
    iget v1, p1, Li0/r1;->b:I

    .line 30
    .line 31
    and-int/lit8 v1, v1, -0x11

    .line 32
    .line 33
    iput v1, p1, Li0/r1;->b:I

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/lifecycle/x;->m()V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    iget-object p1, p0, Li0/h0;->G:Ll0/g;

    .line 40
    .line 41
    iget p1, p1, Ll0/g;->i:I

    .line 42
    .line 43
    iget-object v3, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-static {p1, v3}, Li0/r;->q(ILjava/util/List;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ltz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Li0/n0;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    :goto_0
    iget-object v3, p0, Li0/h0;->G:Ll0/g;

    .line 60
    .line 61
    invoke-virtual {v3}, Ll0/g;->m()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v4, Li0/l;->a:Li0/e;

    .line 66
    .line 67
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    new-instance v3, Li0/r1;

    .line 74
    .line 75
    invoke-direct {v3, v2}, Li0/r1;-><init>(Li0/q;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v3}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v3, Li0/r1;

    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x0

    .line 88
    const/4 v4, 0x1

    .line 89
    if-nez p1, :cond_6

    .line 90
    .line 91
    iget p1, v3, Li0/r1;->b:I

    .line 92
    .line 93
    and-int/lit8 v5, p1, 0x40

    .line 94
    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    move v5, v4

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move v5, v2

    .line 100
    :goto_2
    if-eqz v5, :cond_4

    .line 101
    .line 102
    and-int/lit8 p1, p1, -0x41

    .line 103
    .line 104
    iput p1, v3, Li0/r1;->b:I

    .line 105
    .line 106
    :cond_4
    if-eqz v5, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move p1, v2

    .line 110
    goto :goto_4

    .line 111
    :cond_6
    :goto_3
    move p1, v4

    .line 112
    :goto_4
    iget v5, v3, Li0/r1;->b:I

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    or-int/lit8 p1, v5, 0x8

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    and-int/lit8 p1, v5, -0x9

    .line 120
    .line 121
    :goto_5
    iput p1, v3, Li0/r1;->b:I

    .line 122
    .line 123
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    iget p1, p0, Li0/h0;->B:I

    .line 127
    .line 128
    iput p1, v3, Li0/r1;->e:I

    .line 129
    .line 130
    iget p1, v3, Li0/r1;->b:I

    .line 131
    .line 132
    and-int/lit8 p1, p1, -0x11

    .line 133
    .line 134
    iput p1, v3, Li0/r1;->b:I

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/lifecycle/x;->m()V

    .line 137
    .line 138
    .line 139
    iget p1, v3, Li0/r1;->b:I

    .line 140
    .line 141
    and-int/lit16 v0, p1, 0x100

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    and-int/lit16 p1, p1, -0x101

    .line 146
    .line 147
    or-int/lit16 p1, p1, 0x200

    .line 148
    .line 149
    iput p1, v3, Li0/r1;->b:I

    .line 150
    .line 151
    iget-object p1, p0, Li0/h0;->M:Lm0/b;

    .line 152
    .line 153
    iget-object p1, p1, Lm0/b;->b:Lm0/a;

    .line 154
    .line 155
    iget-object p1, p1, Lm0/a;->j:Lm0/l0;

    .line 156
    .line 157
    sget-object v0, Lm0/d0;->c:Lm0/d0;

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Lm0/l0;->U(Lm0/j0;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1, v2, v3}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-boolean p1, p0, Li0/h0;->y:Z

    .line 166
    .line 167
    if-nez p1, :cond_8

    .line 168
    .line 169
    iget p1, v3, Li0/r1;->b:I

    .line 170
    .line 171
    and-int/lit16 v0, p1, 0x80

    .line 172
    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    iput-boolean v4, p0, Li0/h0;->y:Z

    .line 176
    .line 177
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 178
    .line 179
    iget v0, v0, Ll0/g;->i:I

    .line 180
    .line 181
    iput v0, p0, Li0/h0;->z:I

    .line 182
    .line 183
    or-int/lit16 p1, p1, 0x400

    .line 184
    .line 185
    iput p1, v3, Li0/r1;->b:I

    .line 186
    .line 187
    :cond_8
    return-object p0
.end method

.method public final c(F)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Float;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    cmpg-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final c0(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    const/16 v1, 0xcf

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Ll0/g;->g()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 16
    .line 17
    invoke-virtual {v0}, Ll0/g;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget v0, p0, Li0/h0;->z:I

    .line 28
    .line 29
    if-gez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 32
    .line 33
    iget v0, v0, Ll0/g;->g:I

    .line 34
    .line 35
    iput v0, p0, Li0/h0;->z:I

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Li0/h0;->y:Z

    .line 39
    .line 40
    :cond_0
    const/4 v0, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {p0, v1, v0, p1, v2}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final d(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public final d0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/16 v2, 0x7d

    .line 4
    .line 5
    invoke-virtual {p0, v2, v0, v0, v1}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Li0/h0;->r:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e(J)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final e0()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li0/h0;->m:I

    .line 3
    .line 4
    iget-object v1, p0, Li0/h0;->c:Ll0/h;

    .line 5
    .line 6
    invoke-virtual {v1}, Ll0/h;->d()Ll0/g;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 11
    .line 12
    const/16 v1, 0x64

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p0, v1, v2, v2, v0}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Li0/h0;->b:Li0/o;

    .line 19
    .line 20
    invoke-virtual {v1}, Li0/o;->t()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Li0/o;->i()Ls0/h;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, Li0/h0;->x:Li0/m0;

    .line 28
    .line 29
    iget-boolean v5, p0, Li0/h0;->w:Z

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Li0/m0;->c(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iput-boolean v4, p0, Li0/h0;->w:Z

    .line 39
    .line 40
    iput-object v2, p0, Li0/h0;->K:Ls0/h;

    .line 41
    .line 42
    iget-boolean v4, p0, Li0/h0;->q:Z

    .line 43
    .line 44
    if-nez v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, Li0/o;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iput-boolean v4, p0, Li0/h0;->q:Z

    .line 51
    .line 52
    :cond_0
    iget-boolean v4, p0, Li0/h0;->C:Z

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1}, Li0/o;->f()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iput-boolean v4, p0, Li0/h0;->C:Z

    .line 61
    .line 62
    :cond_1
    iget-boolean v4, p0, Li0/h0;->C:Z

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    sget-object v4, Lx0/e;->a:Li0/m2;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v5, Li0/n2;

    .line 72
    .line 73
    invoke-virtual {p0}, Li0/h0;->C()Lx0/d;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-direct {v5, v6}, Li0/n2;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4, v5}, Ls0/h;->c(Li0/p1;Li0/p2;)Ls0/h;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    :cond_2
    iput-object v3, p0, Li0/h0;->u:Ls0/h;

    .line 85
    .line 86
    sget-object v4, Lx0/g;->a:Li0/m2;

    .line 87
    .line 88
    invoke-static {v3, v4}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/util/Set;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Li0/h0;->y()Lx0/c;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v3}, Li0/o;->o(Ljava/util/Set;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-virtual {v1}, Li0/o;->g()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p0, v1, v2, v2, v0}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final f0(Li0/r1;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object v0, p1, Li0/r1;->c:Ll0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 7
    .line 8
    iget-object v1, v1, Ll0/g;->a:Ll0/h;

    .line 9
    .line 10
    invoke-static {v0}, Lfb/v0;->b(Ll0/b;)Ll0/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v1, v0}, Ll0/h;->a(Ll0/b;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v1, p0, Li0/h0;->F:Z

    .line 19
    .line 20
    if-eqz v1, :cond_6

    .line 21
    .line 22
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 23
    .line 24
    iget v1, v1, Ll0/g;->g:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_6

    .line 27
    .line 28
    iget-object v1, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-static {v0, v1}, Li0/r;->q(ILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    if-gez v2, :cond_2

    .line 37
    .line 38
    add-int/2addr v2, v3

    .line 39
    neg-int v2, v2

    .line 40
    instance-of v5, p2, Li0/x;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p2, v4

    .line 46
    :goto_0
    new-instance v4, Li0/n0;

    .line 47
    .line 48
    invoke-direct {v4, p1, v0, p2}, Li0/n0;-><init>(Li0/r1;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return v3

    .line 55
    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Li0/n0;

    .line 60
    .line 61
    instance-of v0, p2, Li0/x;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    iget-object v0, p1, Li0/n0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    iput-object p2, p1, Li0/n0;->c:Ljava/lang/Object;

    .line 70
    .line 71
    return v3

    .line 72
    :cond_3
    instance-of v1, v0, Lf/l0;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    check-cast v0, Lf/l0;

    .line 77
    .line 78
    invoke-virtual {v0, p2}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :cond_4
    sget-object v1, Lf/s0;->a:Lf/l0;

    .line 83
    .line 84
    new-instance v1, Lf/l0;

    .line 85
    .line 86
    const/4 v2, 0x2

    .line 87
    invoke-direct {v1, v2}, Lf/l0;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lf/l0;->k(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p2}, Lf/l0;->k(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p1, Li0/n0;->c:Ljava/lang/Object;

    .line 97
    .line 98
    return v3

    .line 99
    :cond_5
    iput-object v4, p1, Li0/n0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    return v3

    .line 102
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 103
    return p1
.end method

.method public final g(Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public final g0(Lf/k0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v2}, La/a;->b0(Ljava/util/List;)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    :goto_0
    const/4 v5, -0x1

    .line 12
    if-ge v5, v3, :cond_3

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Li0/n0;

    .line 19
    .line 20
    iget-object v6, v5, Li0/n0;->a:Li0/r1;

    .line 21
    .line 22
    iget-object v6, v6, Li0/r1;->c:Ll0/b;

    .line 23
    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    invoke-static {v6}, Lfb/v0;->b(Ll0/b;)Ll0/b;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v4}, Ll0/b;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget v6, v5, Li0/n0;->b:I

    .line 41
    .line 42
    iget v4, v4, Ll0/b;->a:I

    .line 43
    .line 44
    if-eq v6, v4, :cond_2

    .line 45
    .line 46
    iput v4, v5, Li0/n0;->b:I

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-object v3, v1, Lf/k0;->b:[Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v5, v1, Lf/k0;->c:[Ljava/lang/Object;

    .line 58
    .line 59
    iget-object v1, v1, Lf/k0;->a:[J

    .line 60
    .line 61
    array-length v6, v1

    .line 62
    add-int/lit8 v6, v6, -0x2

    .line 63
    .line 64
    if-ltz v6, :cond_8

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    :goto_3
    aget-wide v9, v1, v8

    .line 68
    .line 69
    not-long v11, v9

    .line 70
    const/4 v13, 0x7

    .line 71
    shl-long/2addr v11, v13

    .line 72
    and-long/2addr v11, v9

    .line 73
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v11, v13

    .line 79
    cmp-long v11, v11, v13

    .line 80
    .line 81
    if-eqz v11, :cond_7

    .line 82
    .line 83
    sub-int v11, v8, v6

    .line 84
    .line 85
    not-int v11, v11

    .line 86
    ushr-int/lit8 v11, v11, 0x1f

    .line 87
    .line 88
    const/16 v12, 0x8

    .line 89
    .line 90
    rsub-int/lit8 v11, v11, 0x8

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    :goto_4
    if-ge v13, v11, :cond_6

    .line 94
    .line 95
    const-wide/16 v14, 0xff

    .line 96
    .line 97
    and-long/2addr v14, v9

    .line 98
    const-wide/16 v16, 0x80

    .line 99
    .line 100
    cmp-long v14, v14, v16

    .line 101
    .line 102
    if-gez v14, :cond_5

    .line 103
    .line 104
    shl-int/lit8 v14, v8, 0x3

    .line 105
    .line 106
    add-int/2addr v14, v13

    .line 107
    aget-object v15, v3, v14

    .line 108
    .line 109
    aget-object v14, v5, v14

    .line 110
    .line 111
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v15, Li0/r1;

    .line 115
    .line 116
    iget-object v4, v15, Li0/r1;->c:Ll0/b;

    .line 117
    .line 118
    if-eqz v4, :cond_5

    .line 119
    .line 120
    invoke-static {v4}, Lfb/v0;->b(Ll0/b;)Ll0/b;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget v4, v4, Ll0/b;->a:I

    .line 125
    .line 126
    sget-object v7, Li0/e;->l:Li0/e;

    .line 127
    .line 128
    if-ne v14, v7, :cond_4

    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    :cond_4
    new-instance v7, Li0/n0;

    .line 132
    .line 133
    invoke-direct {v7, v15, v4, v14}, Li0/n0;-><init>(Li0/r1;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    shr-long/2addr v9, v12

    .line 140
    add-int/lit8 v13, v13, 0x1

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_6
    if-ne v11, v12, :cond_8

    .line 144
    .line 145
    :cond_7
    if-eq v8, v6, :cond_8

    .line 146
    .line 147
    add-int/lit8 v8, v8, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    sget-object v1, Li0/r;->c:Lb8/c;

    .line 151
    .line 152
    invoke-static {v2, v1}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public final h0(II)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Li0/h0;->m0(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p2, :cond_3

    .line 6
    .line 7
    if-gez p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Li0/h0;->p:Lf/u;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lf/u;

    .line 14
    .line 15
    invoke-direct {v0}, Lf/u;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li0/h0;->p:Lf/u;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, p1, p2}, Lf/u;->f(II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v0, p0, Li0/h0;->o:[I

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 29
    .line 30
    iget v0, v0, Ll0/g;->c:I

    .line 31
    .line 32
    new-array v1, v0, [I

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {v1, v3, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Li0/h0;->o:[I

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :cond_2
    aput p2, v0, p1

    .line 43
    .line 44
    :cond_3
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Li0/h0;->j:Li0/j0;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Li0/h0;->k:I

    .line 6
    .line 7
    iput v1, p0, Li0/h0;->l:I

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    iput-wide v2, p0, Li0/h0;->T:J

    .line 12
    .line 13
    iput-boolean v1, p0, Li0/h0;->r:Z

    .line 14
    .line 15
    iget-object v2, p0, Li0/h0;->M:Lm0/b;

    .line 16
    .line 17
    iput-boolean v1, v2, Lm0/b;->c:Z

    .line 18
    .line 19
    iget-object v3, v2, Lm0/b;->d:Li0/m0;

    .line 20
    .line 21
    iput v1, v3, Li0/m0;->b:I

    .line 22
    .line 23
    iput v1, v2, Lm0/b;->f:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    iput-boolean v3, v2, Lm0/b;->e:Z

    .line 27
    .line 28
    iput v1, v2, Lm0/b;->g:I

    .line 29
    .line 30
    iget-object v3, v2, Lm0/b;->h:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    iput v3, v2, Lm0/b;->i:I

    .line 37
    .line 38
    iput v3, v2, Lm0/b;->j:I

    .line 39
    .line 40
    iput v3, v2, Lm0/b;->k:I

    .line 41
    .line 42
    iput v1, v2, Lm0/b;->l:I

    .line 43
    .line 44
    iget-object v1, p0, Li0/h0;->E:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Li0/h0;->o:[I

    .line 50
    .line 51
    iput-object v0, p0, Li0/h0;->p:Lf/u;

    .line 52
    .line 53
    return-void
.end method

.method public final i0(II)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Li0/h0;->m0(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p2, :cond_3

    .line 6
    .line 7
    sub-int/2addr p2, v0

    .line 8
    iget-object v0, p0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    :goto_0
    const/4 v2, -0x1

    .line 17
    if-eq p1, v2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Li0/h0;->m0(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v3, p2

    .line 24
    invoke-virtual {p0, p1, v3}, Li0/h0;->h0(II)V

    .line 25
    .line 26
    .line 27
    move v4, v1

    .line 28
    :goto_1
    if-ge v2, v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Li0/j0;

    .line 35
    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-virtual {v5, p1, v3}, Li0/j0;->a(II)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    add-int/lit8 v4, v4, -0x1

    .line 45
    .line 46
    move v1, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    add-int/lit8 v4, v4, -0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_2
    iget-object v2, p0, Li0/h0;->G:Ll0/g;

    .line 52
    .line 53
    if-gez p1, :cond_2

    .line 54
    .line 55
    iget p1, v2, Ll0/g;->i:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v2, p1}, Ll0/g;->l(I)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, Li0/h0;->G:Ll0/g;

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ll0/g;->q(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public final j(Li0/p1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/h0;->l()Ls0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final j0(Ls0/h;Ls0/h;)Ls0/h;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls0/g;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ls0/g;-><init>(Ls0/h;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ls0/g;->putAll(Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ls0/g;->a()Ls0/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 v0, 0xcc

    .line 17
    .line 18
    sget-object v1, Li0/m;->d:Li0/d1;

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Li0/h0;->Y(ILi0/d1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    invoke-virtual {p0, p2}, Li0/h0;->p(Z)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final k(Lfg/a;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Li0/h0;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    .line 6
    .line 7
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Li0/h0;->r:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Li0/h0;->S:Z

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, "createNode() can only be called when inserting"

    .line 18
    .line 19
    invoke-static {v1}, Li0/m;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v1, p0, Li0/h0;->n:Li0/m0;

    .line 23
    .line 24
    iget-object v2, v1, Li0/m0;->a:[I

    .line 25
    .line 26
    iget v1, v1, Li0/m0;->b:I

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    sub-int/2addr v1, v3

    .line 30
    aget v1, v2, v1

    .line 31
    .line 32
    iget-object v2, p0, Li0/h0;->I:Ll0/k;

    .line 33
    .line 34
    iget v4, v2, Ll0/k;->v:I

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Ll0/k;->b(I)Ll0/b;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget v4, p0, Li0/h0;->l:I

    .line 41
    .line 42
    add-int/2addr v4, v3

    .line 43
    iput v4, p0, Li0/h0;->l:I

    .line 44
    .line 45
    iget-object v4, p0, Li0/h0;->O:Lm0/c;

    .line 46
    .line 47
    iget-object v5, v4, Lm0/c;->c:Lm0/l0;

    .line 48
    .line 49
    sget-object v6, Lm0/r;->d:Lm0/r;

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Lm0/l0;->U(Lm0/j0;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v5, v0, p1}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, v5, Lm0/l0;->e:[I

    .line 58
    .line 59
    iget v6, v5, Lm0/l0;->f:I

    .line 60
    .line 61
    iget-object v7, v5, Lm0/l0;->c:[Lm0/j0;

    .line 62
    .line 63
    iget v8, v5, Lm0/l0;->d:I

    .line 64
    .line 65
    sub-int/2addr v8, v3

    .line 66
    aget-object v7, v7, v8

    .line 67
    .line 68
    iget v7, v7, Lm0/j0;->a:I

    .line 69
    .line 70
    sub-int/2addr v6, v7

    .line 71
    aput v1, p1, v6

    .line 72
    .line 73
    invoke-static {v5, v3, v2}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v4, Lm0/c;->d:Lm0/l0;

    .line 77
    .line 78
    sget-object v4, Lm0/r;->e:Lm0/r;

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p1, Lm0/l0;->e:[I

    .line 84
    .line 85
    iget v5, p1, Lm0/l0;->f:I

    .line 86
    .line 87
    iget-object v6, p1, Lm0/l0;->c:[Lm0/j0;

    .line 88
    .line 89
    iget v7, p1, Lm0/l0;->d:I

    .line 90
    .line 91
    sub-int/2addr v7, v3

    .line 92
    aget-object v3, v6, v7

    .line 93
    .line 94
    iget v3, v3, Lm0/j0;->a:I

    .line 95
    .line 96
    sub-int/2addr v5, v3

    .line 97
    aput v1, v4, v5

    .line 98
    .line 99
    invoke-static {p1, v0, v2}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final k0(Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p1, Li0/a2;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Li0/k0;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Li0/a2;

    .line 9
    .line 10
    iget v2, p0, Li0/h0;->m:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, -0x1

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Li0/k0;-><init>(Li0/a2;I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v1, p0, Li0/h0;->S:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Li0/h0;->M:Lm0/b;

    .line 22
    .line 23
    iget-object v1, v1, Lm0/b;->b:Lm0/a;

    .line 24
    .line 25
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 26
    .line 27
    sget-object v2, Lm0/w;->c:Lm0/w;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {v1, v2, v0}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, p0, Li0/h0;->d:Lf/n0;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lf/n0;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-object p1, v0

    .line 42
    :cond_1
    invoke-virtual {p0, p1}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final l()Ls0/h;
    .locals 6

    .line 1
    iget-object v0, p0, Li0/h0;->K:Ls0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 7
    .line 8
    iget v0, v0, Ll0/g;->i:I

    .line 9
    .line 10
    iget-boolean v1, p0, Li0/h0;->S:Z

    .line 11
    .line 12
    sget-object v2, Li0/m;->c:Li0/d1;

    .line 13
    .line 14
    const/16 v3, 0xca

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-boolean v1, p0, Li0/h0;->J:Z

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Li0/h0;->I:Ll0/k;

    .line 23
    .line 24
    iget v1, v1, Ll0/k;->v:I

    .line 25
    .line 26
    :goto_0
    if-lez v1, :cond_2

    .line 27
    .line 28
    iget-object v4, p0, Li0/h0;->I:Ll0/k;

    .line 29
    .line 30
    invoke-virtual {v4, v1}, Ll0/k;->s(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ne v4, v3, :cond_1

    .line 35
    .line 36
    iget-object v4, p0, Li0/h0;->I:Ll0/k;

    .line 37
    .line 38
    invoke-virtual {v4, v1}, Ll0/k;->t(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ll0/k;->q(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v0, Ls0/h;

    .line 58
    .line 59
    iput-object v0, p0, Li0/h0;->K:Ls0/h;

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    iget-object v4, p0, Li0/h0;->I:Ll0/k;

    .line 63
    .line 64
    iget-object v5, v4, Ll0/k;->b:[I

    .line 65
    .line 66
    invoke-virtual {v4, v5, v1}, Ll0/k;->E([II)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 72
    .line 73
    iget v1, v1, Ll0/g;->c:I

    .line 74
    .line 75
    if-lez v1, :cond_6

    .line 76
    .line 77
    :goto_1
    if-lez v0, :cond_6

    .line 78
    .line 79
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ll0/g;->i(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-ne v1, v3, :cond_5

    .line 86
    .line 87
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 88
    .line 89
    iget-object v4, v1, Ll0/g;->b:[I

    .line 90
    .line 91
    invoke-virtual {v1, v4, v0}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-object v1, p0, Li0/h0;->v:Lf/w;

    .line 102
    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Lf/k;->b(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ls0/h;

    .line 110
    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    :cond_3
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 114
    .line 115
    iget-object v2, v1, Ll0/g;->b:[I

    .line 116
    .line 117
    invoke-virtual {v1, v2, v0}, Ll0/g;->b([II)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object v1, v0

    .line 125
    check-cast v1, Ls0/h;

    .line 126
    .line 127
    :cond_4
    iput-object v1, p0, Li0/h0;->K:Ls0/h;

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_5
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ll0/g;->q(I)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    goto :goto_1

    .line 137
    :cond_6
    iget-object v0, p0, Li0/h0;->u:Ls0/h;

    .line 138
    .line 139
    iput-object v0, p0, Li0/h0;->K:Ls0/h;

    .line 140
    .line 141
    return-object v0
.end method

.method public final l0(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 6
    .line 7
    iget v1, v0, Ll0/k;->n:I

    .line 8
    .line 9
    if-lez v1, :cond_2

    .line 10
    .line 11
    iget v1, v0, Ll0/k;->i:I

    .line 12
    .line 13
    iget v2, v0, Ll0/k;->k:I

    .line 14
    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    iget-object v1, v0, Ll0/k;->s:Lf/w;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Lf/w;

    .line 22
    .line 23
    invoke-direct {v1}, Lf/w;-><init>()V

    .line 24
    .line 25
    .line 26
    :cond_0
    iput-object v1, v0, Ll0/k;->s:Lf/w;

    .line 27
    .line 28
    iget v0, v0, Ll0/k;->v:I

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lf/k;->b(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    new-instance v2, Lf/f0;

    .line 37
    .line 38
    invoke-direct {v2}, Lf/f0;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lf/w;->h(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    check-cast v2, Lf/f0;

    .line 45
    .line 46
    invoke-virtual {v2, p1}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0, p1}, Ll0/k;->F(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :cond_3
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 55
    .line 56
    iget-boolean v1, v0, Ll0/g;->n:Z

    .line 57
    .line 58
    iget-object v2, p0, Li0/h0;->M:Lm0/b;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    iget v1, v0, Ll0/g;->l:I

    .line 65
    .line 66
    iget-object v5, v0, Ll0/g;->b:[I

    .line 67
    .line 68
    iget v0, v0, Ll0/g;->i:I

    .line 69
    .line 70
    invoke-static {v5, v0}, Ll0/j;->b([II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sub-int/2addr v1, v0

    .line 75
    sub-int/2addr v1, v4

    .line 76
    iget-object v0, v2, Lm0/b;->a:Li0/h0;

    .line 77
    .line 78
    iget-object v0, v0, Li0/h0;->G:Ll0/g;

    .line 79
    .line 80
    iget v0, v0, Ll0/g;->i:I

    .line 81
    .line 82
    iget v5, v2, Lm0/b;->f:I

    .line 83
    .line 84
    sub-int/2addr v0, v5

    .line 85
    if-gez v0, :cond_4

    .line 86
    .line 87
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 88
    .line 89
    iget v5, v0, Ll0/g;->i:I

    .line 90
    .line 91
    invoke-virtual {v0, v5}, Ll0/g;->a(I)Ll0/b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v2, v2, Lm0/b;->b:Lm0/a;

    .line 96
    .line 97
    iget-object v2, v2, Lm0/a;->j:Lm0/l0;

    .line 98
    .line 99
    sget-object v5, Lm0/r;->f:Lm0/r;

    .line 100
    .line 101
    invoke-virtual {v2, v5}, Lm0/l0;->U(Lm0/j0;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v3, p1, v4, v0}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, v2, Lm0/l0;->e:[I

    .line 108
    .line 109
    iget v0, v2, Lm0/l0;->f:I

    .line 110
    .line 111
    iget-object v3, v2, Lm0/l0;->c:[Lm0/j0;

    .line 112
    .line 113
    iget v2, v2, Lm0/l0;->d:I

    .line 114
    .line 115
    sub-int/2addr v2, v4

    .line 116
    aget-object v2, v3, v2

    .line 117
    .line 118
    iget v2, v2, Lm0/j0;->a:I

    .line 119
    .line 120
    sub-int/2addr v0, v2

    .line 121
    aput v1, p1, v0

    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    invoke-virtual {v2, v4}, Lm0/b;->d(Z)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v2, Lm0/b;->b:Lm0/a;

    .line 128
    .line 129
    iget-object v0, v0, Lm0/a;->j:Lm0/l0;

    .line 130
    .line 131
    sget-object v2, Lm0/r;->g:Lm0/r;

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v3, p1}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, v0, Lm0/l0;->e:[I

    .line 140
    .line 141
    iget v2, v0, Lm0/l0;->f:I

    .line 142
    .line 143
    iget-object v3, v0, Lm0/l0;->c:[Lm0/j0;

    .line 144
    .line 145
    iget v0, v0, Lm0/l0;->d:I

    .line 146
    .line 147
    sub-int/2addr v0, v4

    .line 148
    aget-object v0, v3, v0

    .line 149
    .line 150
    iget v0, v0, Lm0/j0;->a:I

    .line 151
    .line 152
    sub-int/2addr v2, v0

    .line 153
    aput v1, p1, v2

    .line 154
    .line 155
    return-void

    .line 156
    :cond_5
    iget v1, v0, Ll0/g;->i:I

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ll0/g;->a(I)Ll0/b;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v1, v2, Lm0/b;->b:Lm0/a;

    .line 163
    .line 164
    iget-object v1, v1, Lm0/a;->j:Lm0/l0;

    .line 165
    .line 166
    sget-object v2, Lm0/e;->c:Lm0/e;

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Lm0/l0;->U(Lm0/j0;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1, v3, v0, v4, p1}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final m()Lx0/a;
    .locals 9

    .line 1
    iget-object v0, p0, Li0/h0;->b:Li0/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/o;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, La/a;->E()Luf/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Li0/h0;->I:Ll0/k;

    .line 15
    .line 16
    iget v3, v2, Ll0/k;->t:I

    .line 17
    .line 18
    invoke-static {v2, v1, v3, v1}, Lg4/a;->h(Ll0/k;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Luf/c;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 26
    .line 27
    iget-boolean v2, v1, Ll0/g;->f:Z

    .line 28
    .line 29
    iget-object v3, v1, Ll0/g;->b:[I

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    iget v2, v1, Ll0/g;->c:I

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    new-instance v2, Lx0/j;

    .line 38
    .line 39
    invoke-direct {v2, v1}, Lx0/j;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget v4, v1, Ll0/g;->i:I

    .line 43
    .line 44
    iget v5, v1, Ll0/g;->l:I

    .line 45
    .line 46
    invoke-static {v3, v4}, Ll0/j;->b([II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    sub-int/2addr v5, v6

    .line 51
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    :goto_0
    if-ltz v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ll0/g;->k(I)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1, v3, v4}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    sget-object v6, Li0/l;->a:Li0/e;

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v1, v4}, Ll0/g;->i(I)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iget-object v8, v1, Ll0/g;->a:Ll0/h;

    .line 75
    .line 76
    invoke-virtual {v8, v4}, Ll0/h;->g(I)Ll0/c;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v2, v7, v6, v8, v5}, Lf1/n0;->m(ILjava/lang/Object;Ll0/c;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v4}, Ll0/g;->a(I)Ll0/b;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v1, v4}, Ll0/g;->q(I)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, v2, Lf1/n0;->g:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Ljava/util/ArrayList;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 98
    .line 99
    :goto_2
    invoke-virtual {v0, v1}, Luf/c;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Li0/h0;->I()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Luf/c;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-boolean v1, p0, Li0/h0;->C:Z

    .line 114
    .line 115
    new-instance v2, Lx0/a;

    .line 116
    .line 117
    invoke-direct {v2, v0, v1}, Lx0/a;-><init>(Ljava/util/List;Z)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :cond_3
    return-object v1
.end method

.method public final m0(I)I
    .locals 3

    .line 1
    if-gez p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Li0/h0;->p:Lf/u;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lf/u;->c(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ltz v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lf/u;->c(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ltz v1, :cond_0

    .line 19
    .line 20
    iget-object p1, v0, Lf/u;->c:[I

    .line 21
    .line 22
    aget p1, p1, v1

    .line 23
    .line 24
    return p1

    .line 25
    :cond_0
    const-string v0, "Cannot find value for key "

    .line 26
    .line 27
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    iget-object v0, p0, Li0/h0;->o:[I

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    aget v0, v0, p1

    .line 42
    .line 43
    if-ltz v0, :cond_3

    .line 44
    .line 45
    return v0

    .line 46
    :cond_3
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ll0/g;->o(I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1
.end method

.method public final n(Lf/k0;Lfg/p;)V
    .locals 7

    .line 1
    const-string v0, "Check failed"

    .line 2
    .line 3
    iget-object v1, p0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-boolean v2, p0, Li0/h0;->F:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    const-string v2, "Reentrant composition is not supported"

    .line 10
    .line 11
    invoke-static {v2}, Li0/m;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Li0/h0;->g:Landroidx/lifecycle/x;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/lifecycle/x;->m()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Compose:recompose"

    .line 20
    .line 21
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-static {}, Lw0/m;->j()Lw0/f;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lw0/f;->g()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, p0, Li0/h0;->B:I

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-object v2, p0, Li0/h0;->v:Lf/w;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Li0/h0;->g0(Lf/k0;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    iput p1, p0, Li0/h0;->k:I

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    iput-boolean v2, p0, Li0/h0;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 49
    .line 50
    :try_start_1
    invoke-virtual {p0}, Li0/h0;->e0()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eq v3, p2, :cond_1

    .line 58
    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, p2}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p2

    .line 66
    goto :goto_3

    .line 67
    :cond_1
    :goto_0
    iget-object v4, p0, Li0/h0;->D:Li0/g0;

    .line 68
    .line 69
    invoke-static {}, Li0/r;->o()Lj0/b;

    .line 70
    .line 71
    .line 72
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    sget-object v4, Li0/m;->a:Li0/d1;

    .line 77
    .line 78
    const/16 v6, 0xc8

    .line 79
    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    :try_start_3
    invoke-virtual {p0, v6, v4}, Li0/h0;->Y(ILi0/d1;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p2}, Ls0/i;->d(Li0/h0;Lfg/p;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Li0/h0;->p(Z)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-exception p2

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    iget-boolean p2, p0, Li0/h0;->w:Z

    .line 95
    .line 96
    if-eqz p2, :cond_3

    .line 97
    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    sget-object p2, Li0/l;->a:Li0/e;

    .line 101
    .line 102
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-nez p2, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0, v6, v4}, Li0/h0;->Y(ILi0/d1;)V

    .line 109
    .line 110
    .line 111
    const/4 p2, 0x2

    .line 112
    invoke-static {p2, v3}, Lgg/x;->c(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    check-cast v3, Lfg/p;

    .line 116
    .line 117
    invoke-static {p0, v3}, Ls0/i;->d(Li0/h0;Lfg/p;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Li0/h0;->p(Z)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    invoke-virtual {p0}, Li0/h0;->T()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    .line 126
    .line 127
    :goto_1
    :try_start_4
    iget p2, v5, Lj0/b;->i:I

    .line 128
    .line 129
    sub-int/2addr p2, v2

    .line 130
    invoke-virtual {v5, p2}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Li0/h0;->v()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 134
    .line 135
    .line 136
    :try_start_5
    iput-boolean p1, p0, Li0/h0;->F:Z

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Li0/h0;->I:Ll0/k;

    .line 142
    .line 143
    iget-boolean p1, p1, Ll0/k;->w:Z

    .line 144
    .line 145
    if-nez p1, :cond_4

    .line 146
    .line 147
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    invoke-virtual {p0}, Li0/h0;->x()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 151
    .line 152
    .line 153
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :catchall_2
    move-exception p1

    .line 158
    goto :goto_4

    .line 159
    :goto_2
    :try_start_6
    iget v3, v5, Lj0/b;->i:I

    .line 160
    .line 161
    sub-int/2addr v3, v2

    .line 162
    invoke-virtual {v5, v3}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 166
    :goto_3
    :try_start_7
    new-instance v2, Li0/d0;

    .line 167
    .line 168
    const/4 v3, 0x1

    .line 169
    invoke-direct {v2, p0, v3}, Li0/d0;-><init>(Li0/h0;I)V

    .line 170
    .line 171
    .line 172
    invoke-static {p2, v2}, Lig/a;->b0(Ljava/lang/Throwable;Lfg/a;)Z

    .line 173
    .line 174
    .line 175
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 176
    :catchall_3
    move-exception p2

    .line 177
    :try_start_8
    iput-boolean p1, p0, Li0/h0;->F:Z

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Li0/h0;->a()V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, Li0/h0;->I:Ll0/k;

    .line 186
    .line 187
    iget-boolean p1, p1, Ll0/k;->w:Z

    .line 188
    .line 189
    if-nez p1, :cond_5

    .line 190
    .line 191
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    invoke-virtual {p0}, Li0/h0;->x()V

    .line 195
    .line 196
    .line 197
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 198
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 199
    .line 200
    .line 201
    throw p1
.end method

.method public final n0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Li0/h0;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    .line 6
    .line 7
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Li0/h0;->r:Z

    .line 12
    .line 13
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string v0, "useNode() called while inserting"

    .line 18
    .line 19
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 23
    .line 24
    iget v1, v0, Ll0/g;->i:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Li0/h0;->M:Lm0/b;

    .line 31
    .line 32
    invoke-virtual {v1}, Lm0/b;->c()V

    .line 33
    .line 34
    .line 35
    iget-object v2, v1, Lm0/b;->h:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-boolean v2, p0, Li0/h0;->y:Z

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    instance-of v0, v0, Li0/h;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Lm0/b;->b()V

    .line 49
    .line 50
    .line 51
    iget-object v0, v1, Lm0/b;->b:Lm0/a;

    .line 52
    .line 53
    iget-object v0, v0, Lm0/a;->j:Lm0/l0;

    .line 54
    .line 55
    sget-object v1, Lm0/i0;->c:Lm0/i0;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lm0/l0;->U(Lm0/j0;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final o(II)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-eq p1, p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li0/h0;->G:Ll0/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ll0/g;->q(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0, p2}, Li0/h0;->o(II)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Li0/h0;->G:Ll0/g;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ll0/g;->l(I)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Li0/h0;->G:Ll0/g;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p2, p0, Li0/h0;->M:Lm0/b;

    .line 29
    .line 30
    invoke-virtual {p2}, Lm0/b;->c()V

    .line 31
    .line 32
    .line 33
    iget-object p2, p2, Lm0/b;->h:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final p(Z)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/h0;->n:Li0/m0;

    .line 4
    .line 5
    iget-object v2, v1, Li0/m0;->a:[I

    .line 6
    .line 7
    iget v3, v1, Li0/m0;->b:I

    .line 8
    .line 9
    add-int/lit8 v3, v3, -0x2

    .line 10
    .line 11
    aget v2, v2, v3

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    iget-boolean v4, v0, Li0/h0;->S:Z

    .line 16
    .line 17
    sget-object v5, Li0/l;->a:Li0/e;

    .line 18
    .line 19
    const/16 v6, 0xcf

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x3

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    iget-object v4, v0, Li0/h0;->I:Ll0/k;

    .line 26
    .line 27
    iget v9, v4, Ll0/k;->v:I

    .line 28
    .line 29
    invoke-virtual {v4, v9}, Ll0/k;->s(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget-object v10, v0, Li0/h0;->I:Ll0/k;

    .line 34
    .line 35
    invoke-virtual {v10, v9}, Ll0/k;->t(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    iget-object v11, v0, Li0/h0;->I:Ll0/k;

    .line 40
    .line 41
    invoke-virtual {v11, v9}, Ll0/k;->q(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    if-nez v10, :cond_1

    .line 46
    .line 47
    if-eqz v9, :cond_0

    .line 48
    .line 49
    if-ne v4, v6, :cond_0

    .line 50
    .line 51
    invoke-virtual {v9, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iget-wide v5, v0, Li0/h0;->T:J

    .line 62
    .line 63
    int-to-long v9, v2

    .line 64
    xor-long/2addr v5, v9

    .line 65
    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    int-to-long v9, v4

    .line 70
    xor-long v4, v5, v9

    .line 71
    .line 72
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    iput-wide v4, v0, Li0/h0;->T:J

    .line 77
    .line 78
    goto/16 :goto_4

    .line 79
    .line 80
    :cond_0
    iget-wide v5, v0, Li0/h0;->T:J

    .line 81
    .line 82
    int-to-long v9, v2

    .line 83
    xor-long/2addr v5, v9

    .line 84
    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    int-to-long v9, v4

    .line 89
    xor-long v4, v5, v9

    .line 90
    .line 91
    :goto_0
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    iput-wide v4, v0, Li0/h0;->T:J

    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_1
    instance-of v2, v10, Ljava/lang/Enum;

    .line 100
    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    check-cast v10, Ljava/lang/Enum;

    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    :goto_1
    iget-wide v4, v0, Li0/h0;->T:J

    .line 110
    .line 111
    int-to-long v9, v7

    .line 112
    xor-long/2addr v4, v9

    .line 113
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    int-to-long v9, v2

    .line 118
    xor-long/2addr v4, v9

    .line 119
    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 126
    .line 127
    iget v9, v4, Ll0/g;->i:I

    .line 128
    .line 129
    invoke-virtual {v4, v9}, Ll0/g;->i(I)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    iget-object v10, v0, Li0/h0;->G:Ll0/g;

    .line 134
    .line 135
    iget-object v11, v10, Ll0/g;->b:[I

    .line 136
    .line 137
    invoke-virtual {v10, v11, v9}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    iget-object v11, v0, Li0/h0;->G:Ll0/g;

    .line 142
    .line 143
    iget-object v12, v11, Ll0/g;->b:[I

    .line 144
    .line 145
    invoke-virtual {v11, v12, v9}, Ll0/g;->b([II)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    if-nez v10, :cond_5

    .line 150
    .line 151
    if-eqz v9, :cond_4

    .line 152
    .line 153
    if-ne v4, v6, :cond_4

    .line 154
    .line 155
    invoke-virtual {v9, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-nez v5, :cond_4

    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    iget-wide v5, v0, Li0/h0;->T:J

    .line 166
    .line 167
    int-to-long v9, v2

    .line 168
    xor-long/2addr v5, v9

    .line 169
    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 170
    .line 171
    .line 172
    move-result-wide v5

    .line 173
    int-to-long v9, v4

    .line 174
    xor-long v4, v5, v9

    .line 175
    .line 176
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 177
    .line 178
    .line 179
    move-result-wide v4

    .line 180
    iput-wide v4, v0, Li0/h0;->T:J

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_4
    iget-wide v5, v0, Li0/h0;->T:J

    .line 184
    .line 185
    int-to-long v9, v2

    .line 186
    xor-long/2addr v5, v9

    .line 187
    invoke-static {v5, v6, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 188
    .line 189
    .line 190
    move-result-wide v5

    .line 191
    int-to-long v9, v4

    .line 192
    xor-long v4, v5, v9

    .line 193
    .line 194
    :goto_2
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    iput-wide v4, v0, Li0/h0;->T:J

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_5
    instance-of v2, v10, Ljava/lang/Enum;

    .line 202
    .line 203
    if-eqz v2, :cond_6

    .line 204
    .line 205
    check-cast v10, Ljava/lang/Enum;

    .line 206
    .line 207
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    :goto_3
    iget-wide v4, v0, Li0/h0;->T:J

    .line 212
    .line 213
    int-to-long v9, v7

    .line 214
    xor-long/2addr v4, v9

    .line 215
    invoke-static {v4, v5, v8}, Ljava/lang/Long;->rotateRight(JI)J

    .line 216
    .line 217
    .line 218
    move-result-wide v4

    .line 219
    int-to-long v9, v2

    .line 220
    xor-long/2addr v4, v9

    .line 221
    goto :goto_2

    .line 222
    :cond_6
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    goto :goto_3

    .line 227
    :goto_4
    iget v2, v0, Li0/h0;->l:I

    .line 228
    .line 229
    iget-object v4, v0, Li0/h0;->j:Li0/j0;

    .line 230
    .line 231
    iget-object v5, v0, Li0/h0;->s:Ljava/util/ArrayList;

    .line 232
    .line 233
    iget-object v9, v0, Li0/h0;->M:Lm0/b;

    .line 234
    .line 235
    if-eqz v4, :cond_22

    .line 236
    .line 237
    iget-object v10, v4, Li0/j0;->e:Lf/w;

    .line 238
    .line 239
    iget v11, v4, Li0/j0;->b:I

    .line 240
    .line 241
    iget-object v12, v4, Li0/j0;->a:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    if-lez v13, :cond_22

    .line 248
    .line 249
    iget-object v13, v4, Li0/j0;->d:Ljava/util/ArrayList;

    .line 250
    .line 251
    new-instance v14, Ljava/util/HashSet;

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    invoke-direct {v14, v15}, Ljava/util/HashSet;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    move/from16 v16, v8

    .line 265
    .line 266
    move v8, v7

    .line 267
    :goto_5
    if-ge v8, v15, :cond_7

    .line 268
    .line 269
    const/16 v17, -0x1

    .line 270
    .line 271
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-virtual {v14, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    add-int/lit8 v8, v8, 0x1

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_7
    const/16 v17, -0x1

    .line 282
    .line 283
    sget-object v6, Lf/s0;->a:Lf/l0;

    .line 284
    .line 285
    new-instance v6, Lf/l0;

    .line 286
    .line 287
    invoke-direct {v6}, Lf/l0;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v15

    .line 298
    move v3, v7

    .line 299
    move/from16 v19, v3

    .line 300
    .line 301
    move/from16 v20, v19

    .line 302
    .line 303
    :goto_6
    if-ge v3, v15, :cond_21

    .line 304
    .line 305
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v21

    .line 309
    move-object/from16 v7, v21

    .line 310
    .line 311
    check-cast v7, Ll0/e;

    .line 312
    .line 313
    invoke-virtual {v14, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v21

    .line 317
    if-nez v21, :cond_9

    .line 318
    .line 319
    move-object/from16 v21, v1

    .line 320
    .line 321
    iget v1, v7, Ll0/e;->c:I

    .line 322
    .line 323
    invoke-virtual {v10, v1}, Lf/k;->b(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    check-cast v1, Lk0/a;

    .line 328
    .line 329
    if-eqz v1, :cond_8

    .line 330
    .line 331
    iget v1, v1, Lk0/a;->b:I

    .line 332
    .line 333
    move/from16 v22, v1

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_8
    move/from16 v22, v17

    .line 337
    .line 338
    :goto_7
    iget v1, v7, Ll0/e;->c:I

    .line 339
    .line 340
    move/from16 v23, v3

    .line 341
    .line 342
    add-int v3, v22, v11

    .line 343
    .line 344
    iget v7, v7, Ll0/e;->d:I

    .line 345
    .line 346
    invoke-virtual {v9, v3, v7}, Lm0/b;->e(II)V

    .line 347
    .line 348
    .line 349
    const/4 v3, 0x0

    .line 350
    invoke-virtual {v4, v1, v3}, Li0/j0;->a(II)Z

    .line 351
    .line 352
    .line 353
    iget v3, v9, Lm0/b;->f:I

    .line 354
    .line 355
    iget-object v7, v9, Lm0/b;->a:Li0/h0;

    .line 356
    .line 357
    iget-object v7, v7, Li0/h0;->G:Ll0/g;

    .line 358
    .line 359
    iget v7, v7, Ll0/g;->g:I

    .line 360
    .line 361
    sub-int v7, v1, v7

    .line 362
    .line 363
    add-int/2addr v7, v3

    .line 364
    iput v7, v9, Lm0/b;->f:I

    .line 365
    .line 366
    iget-object v3, v0, Li0/h0;->G:Ll0/g;

    .line 367
    .line 368
    invoke-virtual {v3, v1}, Ll0/g;->r(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Li0/h0;->M()V

    .line 372
    .line 373
    .line 374
    iget-object v3, v0, Li0/h0;->G:Ll0/g;

    .line 375
    .line 376
    invoke-virtual {v3}, Ll0/g;->s()I

    .line 377
    .line 378
    .line 379
    iget-object v3, v0, Li0/h0;->G:Ll0/g;

    .line 380
    .line 381
    iget-object v3, v3, Ll0/g;->b:[I

    .line 382
    .line 383
    mul-int/lit8 v7, v1, 0x5

    .line 384
    .line 385
    add-int/lit8 v7, v7, 0x3

    .line 386
    .line 387
    aget v3, v3, v7

    .line 388
    .line 389
    add-int/2addr v3, v1

    .line 390
    invoke-static {v5, v1, v3}, Li0/r;->k(Ljava/util/List;II)V

    .line 391
    .line 392
    .line 393
    :goto_8
    add-int/lit8 v3, v23, 0x1

    .line 394
    .line 395
    move-object/from16 v1, v21

    .line 396
    .line 397
    :goto_9
    const/4 v7, 0x0

    .line 398
    goto :goto_6

    .line 399
    :cond_9
    move-object/from16 v21, v1

    .line 400
    .line 401
    move/from16 v23, v3

    .line 402
    .line 403
    invoke-virtual {v6, v7}, Lf/l0;->c(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_a

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_a
    move/from16 v1, v19

    .line 411
    .line 412
    if-ge v1, v8, :cond_20

    .line 413
    .line 414
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    check-cast v3, Ll0/e;

    .line 419
    .line 420
    if-eq v3, v7, :cond_1e

    .line 421
    .line 422
    iget v7, v3, Ll0/e;->c:I

    .line 423
    .line 424
    invoke-virtual {v10, v7}, Lf/k;->b(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    check-cast v7, Lk0/a;

    .line 429
    .line 430
    if-eqz v7, :cond_b

    .line 431
    .line 432
    iget v7, v7, Lk0/a;->b:I

    .line 433
    .line 434
    goto :goto_a

    .line 435
    :cond_b
    move/from16 v7, v17

    .line 436
    .line 437
    :goto_a
    invoke-virtual {v6, v3}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move/from16 v19, v1

    .line 441
    .line 442
    move/from16 v1, v20

    .line 443
    .line 444
    move-object/from16 v20, v4

    .line 445
    .line 446
    if-eq v7, v1, :cond_1c

    .line 447
    .line 448
    iget v4, v3, Ll0/e;->c:I

    .line 449
    .line 450
    invoke-virtual {v10, v4}, Lf/k;->b(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    check-cast v4, Lk0/a;

    .line 455
    .line 456
    if-eqz v4, :cond_c

    .line 457
    .line 458
    iget v4, v4, Lk0/a;->c:I

    .line 459
    .line 460
    :goto_b
    move-object/from16 v22, v6

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_c
    iget v4, v3, Ll0/e;->d:I

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :goto_c
    add-int v6, v7, v11

    .line 467
    .line 468
    move/from16 v24, v8

    .line 469
    .line 470
    add-int v8, v1, v11

    .line 471
    .line 472
    if-lez v4, :cond_f

    .line 473
    .line 474
    move/from16 v25, v11

    .line 475
    .line 476
    iget v11, v9, Lm0/b;->l:I

    .line 477
    .line 478
    if-lez v11, :cond_d

    .line 479
    .line 480
    move/from16 v26, v11

    .line 481
    .line 482
    iget v11, v9, Lm0/b;->j:I

    .line 483
    .line 484
    move-object/from16 v27, v12

    .line 485
    .line 486
    sub-int v12, v6, v26

    .line 487
    .line 488
    if-ne v11, v12, :cond_e

    .line 489
    .line 490
    iget v11, v9, Lm0/b;->k:I

    .line 491
    .line 492
    sub-int v12, v8, v26

    .line 493
    .line 494
    if-ne v11, v12, :cond_e

    .line 495
    .line 496
    add-int v11, v26, v4

    .line 497
    .line 498
    iput v11, v9, Lm0/b;->l:I

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_d
    move-object/from16 v27, v12

    .line 502
    .line 503
    :cond_e
    invoke-virtual {v9}, Lm0/b;->c()V

    .line 504
    .line 505
    .line 506
    iput v6, v9, Lm0/b;->j:I

    .line 507
    .line 508
    iput v8, v9, Lm0/b;->k:I

    .line 509
    .line 510
    iput v4, v9, Lm0/b;->l:I

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_f
    move/from16 v25, v11

    .line 514
    .line 515
    move-object/from16 v27, v12

    .line 516
    .line 517
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    :goto_d
    const-wide/16 v28, 0xff

    .line 521
    .line 522
    const-wide v30, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    if-le v7, v1, :cond_16

    .line 528
    .line 529
    const/16 v26, 0x7

    .line 530
    .line 531
    iget-object v6, v10, Lf/k;->c:[Ljava/lang/Object;

    .line 532
    .line 533
    const-wide/16 v32, 0x80

    .line 534
    .line 535
    iget-object v11, v10, Lf/k;->a:[J

    .line 536
    .line 537
    array-length v12, v11

    .line 538
    add-int/lit8 v12, v12, -0x2

    .line 539
    .line 540
    if-ltz v12, :cond_15

    .line 541
    .line 542
    move-object/from16 v35, v13

    .line 543
    .line 544
    move-object/from16 v36, v14

    .line 545
    .line 546
    const/4 v8, 0x0

    .line 547
    :goto_e
    const/16 v34, 0x8

    .line 548
    .line 549
    aget-wide v13, v11, v8

    .line 550
    .line 551
    move/from16 v38, v4

    .line 552
    .line 553
    move-object/from16 v37, v5

    .line 554
    .line 555
    not-long v4, v13

    .line 556
    shl-long v4, v4, v26

    .line 557
    .line 558
    and-long/2addr v4, v13

    .line 559
    and-long v4, v4, v30

    .line 560
    .line 561
    cmp-long v4, v4, v30

    .line 562
    .line 563
    if-eqz v4, :cond_14

    .line 564
    .line 565
    sub-int v4, v8, v12

    .line 566
    .line 567
    not-int v4, v4

    .line 568
    ushr-int/lit8 v4, v4, 0x1f

    .line 569
    .line 570
    rsub-int/lit8 v4, v4, 0x8

    .line 571
    .line 572
    const/4 v5, 0x0

    .line 573
    :goto_f
    if-ge v5, v4, :cond_13

    .line 574
    .line 575
    and-long v39, v13, v28

    .line 576
    .line 577
    cmp-long v39, v39, v32

    .line 578
    .line 579
    if-gez v39, :cond_11

    .line 580
    .line 581
    shl-int/lit8 v39, v8, 0x3

    .line 582
    .line 583
    add-int v39, v39, v5

    .line 584
    .line 585
    aget-object v39, v6, v39

    .line 586
    .line 587
    move/from16 v40, v5

    .line 588
    .line 589
    move-object/from16 v5, v39

    .line 590
    .line 591
    check-cast v5, Lk0/a;

    .line 592
    .line 593
    move-object/from16 v39, v6

    .line 594
    .line 595
    iget v6, v5, Lk0/a;->b:I

    .line 596
    .line 597
    move-object/from16 v41, v11

    .line 598
    .line 599
    if-gt v7, v6, :cond_10

    .line 600
    .line 601
    add-int v11, v7, v38

    .line 602
    .line 603
    if-ge v6, v11, :cond_10

    .line 604
    .line 605
    sub-int/2addr v6, v7

    .line 606
    add-int/2addr v6, v1

    .line 607
    iput v6, v5, Lk0/a;->b:I

    .line 608
    .line 609
    goto :goto_10

    .line 610
    :cond_10
    if-gt v1, v6, :cond_12

    .line 611
    .line 612
    if-ge v6, v7, :cond_12

    .line 613
    .line 614
    add-int v6, v6, v38

    .line 615
    .line 616
    iput v6, v5, Lk0/a;->b:I

    .line 617
    .line 618
    goto :goto_10

    .line 619
    :cond_11
    move/from16 v40, v5

    .line 620
    .line 621
    move-object/from16 v39, v6

    .line 622
    .line 623
    move-object/from16 v41, v11

    .line 624
    .line 625
    :cond_12
    :goto_10
    shr-long v13, v13, v34

    .line 626
    .line 627
    add-int/lit8 v5, v40, 0x1

    .line 628
    .line 629
    move-object/from16 v6, v39

    .line 630
    .line 631
    move-object/from16 v11, v41

    .line 632
    .line 633
    goto :goto_f

    .line 634
    :cond_13
    move-object/from16 v39, v6

    .line 635
    .line 636
    move-object/from16 v41, v11

    .line 637
    .line 638
    move/from16 v5, v34

    .line 639
    .line 640
    if-ne v4, v5, :cond_1d

    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_14
    move-object/from16 v39, v6

    .line 644
    .line 645
    move-object/from16 v41, v11

    .line 646
    .line 647
    :goto_11
    if-eq v8, v12, :cond_1d

    .line 648
    .line 649
    add-int/lit8 v8, v8, 0x1

    .line 650
    .line 651
    move-object/from16 v5, v37

    .line 652
    .line 653
    move/from16 v4, v38

    .line 654
    .line 655
    move-object/from16 v6, v39

    .line 656
    .line 657
    move-object/from16 v11, v41

    .line 658
    .line 659
    goto :goto_e

    .line 660
    :cond_15
    move-object/from16 v37, v5

    .line 661
    .line 662
    goto/16 :goto_17

    .line 663
    .line 664
    :cond_16
    move/from16 v38, v4

    .line 665
    .line 666
    move-object/from16 v37, v5

    .line 667
    .line 668
    move-object/from16 v35, v13

    .line 669
    .line 670
    move-object/from16 v36, v14

    .line 671
    .line 672
    const/16 v26, 0x7

    .line 673
    .line 674
    const-wide/16 v32, 0x80

    .line 675
    .line 676
    if-le v1, v7, :cond_1d

    .line 677
    .line 678
    iget-object v4, v10, Lf/k;->c:[Ljava/lang/Object;

    .line 679
    .line 680
    iget-object v5, v10, Lf/k;->a:[J

    .line 681
    .line 682
    array-length v6, v5

    .line 683
    add-int/lit8 v6, v6, -0x2

    .line 684
    .line 685
    if-ltz v6, :cond_1d

    .line 686
    .line 687
    const/4 v8, 0x0

    .line 688
    :goto_12
    aget-wide v11, v5, v8

    .line 689
    .line 690
    not-long v13, v11

    .line 691
    shl-long v13, v13, v26

    .line 692
    .line 693
    and-long/2addr v13, v11

    .line 694
    and-long v13, v13, v30

    .line 695
    .line 696
    cmp-long v13, v13, v30

    .line 697
    .line 698
    if-eqz v13, :cond_1b

    .line 699
    .line 700
    sub-int v13, v8, v6

    .line 701
    .line 702
    not-int v13, v13

    .line 703
    ushr-int/lit8 v13, v13, 0x1f

    .line 704
    .line 705
    const/16 v34, 0x8

    .line 706
    .line 707
    rsub-int/lit8 v13, v13, 0x8

    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    :goto_13
    if-ge v14, v13, :cond_1a

    .line 711
    .line 712
    and-long v39, v11, v28

    .line 713
    .line 714
    cmp-long v39, v39, v32

    .line 715
    .line 716
    if-gez v39, :cond_19

    .line 717
    .line 718
    shl-int/lit8 v39, v8, 0x3

    .line 719
    .line 720
    add-int v39, v39, v14

    .line 721
    .line 722
    aget-object v39, v4, v39

    .line 723
    .line 724
    move-object/from16 v40, v4

    .line 725
    .line 726
    move-object/from16 v4, v39

    .line 727
    .line 728
    check-cast v4, Lk0/a;

    .line 729
    .line 730
    move-object/from16 v39, v5

    .line 731
    .line 732
    iget v5, v4, Lk0/a;->b:I

    .line 733
    .line 734
    move/from16 v41, v7

    .line 735
    .line 736
    if-gt v7, v5, :cond_17

    .line 737
    .line 738
    add-int v7, v41, v38

    .line 739
    .line 740
    if-ge v5, v7, :cond_17

    .line 741
    .line 742
    sub-int v5, v5, v41

    .line 743
    .line 744
    add-int/2addr v5, v1

    .line 745
    iput v5, v4, Lk0/a;->b:I

    .line 746
    .line 747
    goto :goto_14

    .line 748
    :cond_17
    add-int/lit8 v7, v41, 0x1

    .line 749
    .line 750
    if-gt v7, v5, :cond_18

    .line 751
    .line 752
    if-ge v5, v1, :cond_18

    .line 753
    .line 754
    sub-int v5, v5, v38

    .line 755
    .line 756
    iput v5, v4, Lk0/a;->b:I

    .line 757
    .line 758
    :cond_18
    :goto_14
    const/16 v5, 0x8

    .line 759
    .line 760
    goto :goto_15

    .line 761
    :cond_19
    move-object/from16 v40, v4

    .line 762
    .line 763
    move-object/from16 v39, v5

    .line 764
    .line 765
    move/from16 v41, v7

    .line 766
    .line 767
    goto :goto_14

    .line 768
    :goto_15
    shr-long/2addr v11, v5

    .line 769
    add-int/lit8 v14, v14, 0x1

    .line 770
    .line 771
    move-object/from16 v5, v39

    .line 772
    .line 773
    move-object/from16 v4, v40

    .line 774
    .line 775
    move/from16 v7, v41

    .line 776
    .line 777
    goto :goto_13

    .line 778
    :cond_1a
    move-object/from16 v40, v4

    .line 779
    .line 780
    move-object/from16 v39, v5

    .line 781
    .line 782
    move/from16 v41, v7

    .line 783
    .line 784
    const/16 v5, 0x8

    .line 785
    .line 786
    if-ne v13, v5, :cond_1d

    .line 787
    .line 788
    goto :goto_16

    .line 789
    :cond_1b
    move-object/from16 v40, v4

    .line 790
    .line 791
    move-object/from16 v39, v5

    .line 792
    .line 793
    move/from16 v41, v7

    .line 794
    .line 795
    const/16 v5, 0x8

    .line 796
    .line 797
    :goto_16
    if-eq v8, v6, :cond_1d

    .line 798
    .line 799
    add-int/lit8 v8, v8, 0x1

    .line 800
    .line 801
    move-object/from16 v5, v39

    .line 802
    .line 803
    move-object/from16 v4, v40

    .line 804
    .line 805
    move/from16 v7, v41

    .line 806
    .line 807
    goto :goto_12

    .line 808
    :cond_1c
    move-object/from16 v37, v5

    .line 809
    .line 810
    move-object/from16 v22, v6

    .line 811
    .line 812
    move/from16 v24, v8

    .line 813
    .line 814
    move/from16 v25, v11

    .line 815
    .line 816
    move-object/from16 v27, v12

    .line 817
    .line 818
    :goto_17
    move-object/from16 v35, v13

    .line 819
    .line 820
    move-object/from16 v36, v14

    .line 821
    .line 822
    :cond_1d
    move/from16 v4, v23

    .line 823
    .line 824
    goto :goto_18

    .line 825
    :cond_1e
    move/from16 v19, v1

    .line 826
    .line 827
    move-object/from16 v37, v5

    .line 828
    .line 829
    move-object/from16 v22, v6

    .line 830
    .line 831
    move/from16 v24, v8

    .line 832
    .line 833
    move/from16 v25, v11

    .line 834
    .line 835
    move-object/from16 v27, v12

    .line 836
    .line 837
    move-object/from16 v35, v13

    .line 838
    .line 839
    move-object/from16 v36, v14

    .line 840
    .line 841
    move/from16 v1, v20

    .line 842
    .line 843
    move-object/from16 v20, v4

    .line 844
    .line 845
    add-int/lit8 v4, v23, 0x1

    .line 846
    .line 847
    :goto_18
    add-int/lit8 v19, v19, 0x1

    .line 848
    .line 849
    iget v5, v3, Ll0/e;->c:I

    .line 850
    .line 851
    invoke-virtual {v10, v5}, Lf/k;->b(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    check-cast v5, Lk0/a;

    .line 856
    .line 857
    if-eqz v5, :cond_1f

    .line 858
    .line 859
    iget v3, v5, Lk0/a;->c:I

    .line 860
    .line 861
    goto :goto_19

    .line 862
    :cond_1f
    iget v3, v3, Ll0/e;->d:I

    .line 863
    .line 864
    :goto_19
    add-int/2addr v1, v3

    .line 865
    move v3, v4

    .line 866
    move-object/from16 v4, v20

    .line 867
    .line 868
    move-object/from16 v6, v22

    .line 869
    .line 870
    move/from16 v8, v24

    .line 871
    .line 872
    move/from16 v11, v25

    .line 873
    .line 874
    move-object/from16 v12, v27

    .line 875
    .line 876
    move-object/from16 v13, v35

    .line 877
    .line 878
    move-object/from16 v14, v36

    .line 879
    .line 880
    move-object/from16 v5, v37

    .line 881
    .line 882
    const/4 v7, 0x0

    .line 883
    move/from16 v20, v1

    .line 884
    .line 885
    move-object/from16 v1, v21

    .line 886
    .line 887
    goto/16 :goto_6

    .line 888
    .line 889
    :cond_20
    move/from16 v19, v1

    .line 890
    .line 891
    move/from16 v1, v20

    .line 892
    .line 893
    move-object/from16 v1, v21

    .line 894
    .line 895
    move/from16 v3, v23

    .line 896
    .line 897
    goto/16 :goto_9

    .line 898
    .line 899
    :cond_21
    move-object/from16 v21, v1

    .line 900
    .line 901
    move-object/from16 v37, v5

    .line 902
    .line 903
    move-object/from16 v27, v12

    .line 904
    .line 905
    invoke-virtual {v9}, Lm0/b;->c()V

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    if-lez v1, :cond_23

    .line 913
    .line 914
    iget-object v1, v0, Li0/h0;->G:Ll0/g;

    .line 915
    .line 916
    iget v3, v1, Ll0/g;->h:I

    .line 917
    .line 918
    iget v4, v9, Lm0/b;->f:I

    .line 919
    .line 920
    iget-object v5, v9, Lm0/b;->a:Li0/h0;

    .line 921
    .line 922
    iget-object v5, v5, Li0/h0;->G:Ll0/g;

    .line 923
    .line 924
    iget v5, v5, Ll0/g;->g:I

    .line 925
    .line 926
    sub-int/2addr v3, v5

    .line 927
    add-int/2addr v3, v4

    .line 928
    iput v3, v9, Lm0/b;->f:I

    .line 929
    .line 930
    invoke-virtual {v1}, Ll0/g;->t()V

    .line 931
    .line 932
    .line 933
    goto :goto_1a

    .line 934
    :cond_22
    move-object/from16 v21, v1

    .line 935
    .line 936
    move-object/from16 v37, v5

    .line 937
    .line 938
    const/16 v17, -0x1

    .line 939
    .line 940
    :cond_23
    :goto_1a
    iget-boolean v1, v0, Li0/h0;->S:Z

    .line 941
    .line 942
    const/4 v3, -0x2

    .line 943
    if-nez v1, :cond_27

    .line 944
    .line 945
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 946
    .line 947
    iget v5, v4, Ll0/g;->m:I

    .line 948
    .line 949
    iget v4, v4, Ll0/g;->l:I

    .line 950
    .line 951
    sub-int/2addr v5, v4

    .line 952
    if-lez v5, :cond_27

    .line 953
    .line 954
    if-lez v5, :cond_26

    .line 955
    .line 956
    const/4 v4, 0x0

    .line 957
    invoke-virtual {v9, v4}, Lm0/b;->d(Z)V

    .line 958
    .line 959
    .line 960
    iget-object v4, v9, Lm0/b;->d:Li0/m0;

    .line 961
    .line 962
    iget-object v6, v9, Lm0/b;->a:Li0/h0;

    .line 963
    .line 964
    iget-object v6, v6, Li0/h0;->G:Ll0/g;

    .line 965
    .line 966
    iget v7, v6, Ll0/g;->c:I

    .line 967
    .line 968
    if-lez v7, :cond_25

    .line 969
    .line 970
    iget v7, v6, Ll0/g;->i:I

    .line 971
    .line 972
    invoke-virtual {v4, v3}, Li0/m0;->a(I)I

    .line 973
    .line 974
    .line 975
    move-result v8

    .line 976
    if-eq v8, v7, :cond_25

    .line 977
    .line 978
    iget-boolean v8, v9, Lm0/b;->c:Z

    .line 979
    .line 980
    if-nez v8, :cond_24

    .line 981
    .line 982
    iget-boolean v8, v9, Lm0/b;->e:Z

    .line 983
    .line 984
    if-eqz v8, :cond_24

    .line 985
    .line 986
    const/4 v8, 0x0

    .line 987
    invoke-virtual {v9, v8}, Lm0/b;->d(Z)V

    .line 988
    .line 989
    .line 990
    iget-object v8, v9, Lm0/b;->b:Lm0/a;

    .line 991
    .line 992
    iget-object v8, v8, Lm0/a;->j:Lm0/l0;

    .line 993
    .line 994
    sget-object v10, Lm0/q;->c:Lm0/q;

    .line 995
    .line 996
    invoke-virtual {v8, v10}, Lm0/l0;->U(Lm0/j0;)V

    .line 997
    .line 998
    .line 999
    const/4 v8, 0x1

    .line 1000
    iput-boolean v8, v9, Lm0/b;->c:Z

    .line 1001
    .line 1002
    :cond_24
    if-lez v7, :cond_25

    .line 1003
    .line 1004
    invoke-virtual {v6, v7}, Ll0/g;->a(I)Ll0/b;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v6

    .line 1008
    invoke-virtual {v4, v7}, Li0/m0;->c(I)V

    .line 1009
    .line 1010
    .line 1011
    const/4 v4, 0x0

    .line 1012
    invoke-virtual {v9, v4}, Lm0/b;->d(Z)V

    .line 1013
    .line 1014
    .line 1015
    iget-object v7, v9, Lm0/b;->b:Lm0/a;

    .line 1016
    .line 1017
    iget-object v7, v7, Lm0/a;->j:Lm0/l0;

    .line 1018
    .line 1019
    sget-object v8, Lm0/p;->c:Lm0/p;

    .line 1020
    .line 1021
    invoke-virtual {v7, v8}, Lm0/l0;->U(Lm0/j0;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v7, v4, v6}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 1025
    .line 1026
    .line 1027
    const/4 v8, 0x1

    .line 1028
    iput-boolean v8, v9, Lm0/b;->c:Z

    .line 1029
    .line 1030
    :cond_25
    iget-object v4, v9, Lm0/b;->b:Lm0/a;

    .line 1031
    .line 1032
    iget-object v4, v4, Lm0/a;->j:Lm0/l0;

    .line 1033
    .line 1034
    sget-object v6, Lm0/e0;->c:Lm0/e0;

    .line 1035
    .line 1036
    invoke-virtual {v4, v6}, Lm0/l0;->U(Lm0/j0;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object v6, v4, Lm0/l0;->e:[I

    .line 1040
    .line 1041
    iget v7, v4, Lm0/l0;->f:I

    .line 1042
    .line 1043
    iget-object v8, v4, Lm0/l0;->c:[Lm0/j0;

    .line 1044
    .line 1045
    iget v4, v4, Lm0/l0;->d:I

    .line 1046
    .line 1047
    const/16 v18, 0x1

    .line 1048
    .line 1049
    add-int/lit8 v4, v4, -0x1

    .line 1050
    .line 1051
    aget-object v4, v8, v4

    .line 1052
    .line 1053
    iget v4, v4, Lm0/j0;->a:I

    .line 1054
    .line 1055
    sub-int/2addr v7, v4

    .line 1056
    aput v5, v6, v7

    .line 1057
    .line 1058
    goto :goto_1b

    .line 1059
    :cond_26
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    :cond_27
    :goto_1b
    iget v4, v0, Li0/h0;->k:I

    .line 1063
    .line 1064
    :goto_1c
    iget-object v5, v0, Li0/h0;->G:Ll0/g;

    .line 1065
    .line 1066
    iget v6, v5, Ll0/g;->k:I

    .line 1067
    .line 1068
    if-lez v6, :cond_28

    .line 1069
    .line 1070
    goto :goto_1d

    .line 1071
    :cond_28
    iget v6, v5, Ll0/g;->g:I

    .line 1072
    .line 1073
    iget v5, v5, Ll0/g;->h:I

    .line 1074
    .line 1075
    if-ne v6, v5, :cond_3a

    .line 1076
    .line 1077
    :goto_1d
    if-eqz v1, :cond_33

    .line 1078
    .line 1079
    if-eqz p1, :cond_2a

    .line 1080
    .line 1081
    iget-object v2, v0, Li0/h0;->O:Lm0/c;

    .line 1082
    .line 1083
    iget-object v4, v2, Lm0/c;->d:Lm0/l0;

    .line 1084
    .line 1085
    iget v5, v4, Lm0/l0;->d:I

    .line 1086
    .line 1087
    if-eqz v5, :cond_29

    .line 1088
    .line 1089
    goto :goto_1e

    .line 1090
    :cond_29
    const-string v5, "Cannot end node insertion, there are no pending operations that can be realized."

    .line 1091
    .line 1092
    invoke-static {v5}, Li0/m;->a(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    :goto_1e
    iget-object v2, v2, Lm0/c;->c:Lm0/l0;

    .line 1096
    .line 1097
    iget-object v5, v4, Lm0/l0;->c:[Lm0/j0;

    .line 1098
    .line 1099
    iget v6, v4, Lm0/l0;->d:I

    .line 1100
    .line 1101
    add-int/lit8 v6, v6, -0x1

    .line 1102
    .line 1103
    iput v6, v4, Lm0/l0;->d:I

    .line 1104
    .line 1105
    aget-object v7, v5, v6

    .line 1106
    .line 1107
    const/4 v8, 0x0

    .line 1108
    aput-object v8, v5, v6

    .line 1109
    .line 1110
    invoke-virtual {v2, v7}, Lm0/l0;->U(Lm0/j0;)V

    .line 1111
    .line 1112
    .line 1113
    iget-object v5, v4, Lm0/l0;->g:[Ljava/lang/Object;

    .line 1114
    .line 1115
    iget-object v6, v2, Lm0/l0;->g:[Ljava/lang/Object;

    .line 1116
    .line 1117
    iget v10, v2, Lm0/l0;->h:I

    .line 1118
    .line 1119
    iget v11, v7, Lm0/j0;->b:I

    .line 1120
    .line 1121
    sub-int/2addr v10, v11

    .line 1122
    iget v12, v4, Lm0/l0;->h:I

    .line 1123
    .line 1124
    sub-int v13, v12, v11

    .line 1125
    .line 1126
    sub-int/2addr v12, v13

    .line 1127
    invoke-static {v5, v13, v6, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1128
    .line 1129
    .line 1130
    iget-object v5, v4, Lm0/l0;->g:[Ljava/lang/Object;

    .line 1131
    .line 1132
    iget v6, v4, Lm0/l0;->h:I

    .line 1133
    .line 1134
    sub-int v10, v6, v11

    .line 1135
    .line 1136
    invoke-static {v5, v10, v6, v8}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 1137
    .line 1138
    .line 1139
    iget-object v5, v4, Lm0/l0;->e:[I

    .line 1140
    .line 1141
    iget-object v6, v2, Lm0/l0;->e:[I

    .line 1142
    .line 1143
    iget v2, v2, Lm0/l0;->f:I

    .line 1144
    .line 1145
    iget v7, v7, Lm0/j0;->a:I

    .line 1146
    .line 1147
    sub-int/2addr v2, v7

    .line 1148
    iget v8, v4, Lm0/l0;->f:I

    .line 1149
    .line 1150
    sub-int v10, v8, v7

    .line 1151
    .line 1152
    invoke-static {v5, v6, v2, v10, v8}, Ltf/l;->p0([I[IIII)V

    .line 1153
    .line 1154
    .line 1155
    iget v2, v4, Lm0/l0;->h:I

    .line 1156
    .line 1157
    sub-int/2addr v2, v11

    .line 1158
    iput v2, v4, Lm0/l0;->h:I

    .line 1159
    .line 1160
    iget v2, v4, Lm0/l0;->f:I

    .line 1161
    .line 1162
    sub-int/2addr v2, v7

    .line 1163
    iput v2, v4, Lm0/l0;->f:I

    .line 1164
    .line 1165
    const/4 v2, 0x1

    .line 1166
    :cond_2a
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 1167
    .line 1168
    iget v5, v4, Ll0/g;->k:I

    .line 1169
    .line 1170
    if-lez v5, :cond_2b

    .line 1171
    .line 1172
    goto :goto_1f

    .line 1173
    :cond_2b
    const-string v5, "Unbalanced begin/end empty"

    .line 1174
    .line 1175
    invoke-static {v5}, Li0/n1;->a(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    :goto_1f
    iget v5, v4, Ll0/g;->k:I

    .line 1179
    .line 1180
    add-int/lit8 v5, v5, -0x1

    .line 1181
    .line 1182
    iput v5, v4, Ll0/g;->k:I

    .line 1183
    .line 1184
    iget-object v4, v0, Li0/h0;->I:Ll0/k;

    .line 1185
    .line 1186
    iget v5, v4, Ll0/k;->v:I

    .line 1187
    .line 1188
    invoke-virtual {v4}, Ll0/k;->j()V

    .line 1189
    .line 1190
    .line 1191
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 1192
    .line 1193
    iget v4, v4, Ll0/g;->k:I

    .line 1194
    .line 1195
    if-lez v4, :cond_2c

    .line 1196
    .line 1197
    goto/16 :goto_23

    .line 1198
    .line 1199
    :cond_2c
    rsub-int/lit8 v4, v5, -0x2

    .line 1200
    .line 1201
    iget-object v5, v0, Li0/h0;->I:Ll0/k;

    .line 1202
    .line 1203
    invoke-virtual {v5}, Ll0/k;->k()V

    .line 1204
    .line 1205
    .line 1206
    iget-object v5, v0, Li0/h0;->I:Ll0/k;

    .line 1207
    .line 1208
    const/4 v8, 0x1

    .line 1209
    invoke-virtual {v5, v8}, Ll0/k;->e(Z)V

    .line 1210
    .line 1211
    .line 1212
    iget-object v5, v0, Li0/h0;->N:Ll0/b;

    .line 1213
    .line 1214
    iget-object v6, v0, Li0/h0;->O:Lm0/c;

    .line 1215
    .line 1216
    iget-object v6, v6, Lm0/c;->c:Lm0/l0;

    .line 1217
    .line 1218
    invoke-virtual {v6}, Lm0/l0;->T()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v6

    .line 1222
    iget-object v7, v0, Li0/h0;->H:Ll0/h;

    .line 1223
    .line 1224
    if-eqz v6, :cond_2f

    .line 1225
    .line 1226
    invoke-virtual {v9}, Lm0/b;->b()V

    .line 1227
    .line 1228
    .line 1229
    const/4 v8, 0x0

    .line 1230
    invoke-virtual {v9, v8}, Lm0/b;->d(Z)V

    .line 1231
    .line 1232
    .line 1233
    iget-object v6, v9, Lm0/b;->d:Li0/m0;

    .line 1234
    .line 1235
    iget-object v8, v9, Lm0/b;->a:Li0/h0;

    .line 1236
    .line 1237
    iget-object v8, v8, Li0/h0;->G:Ll0/g;

    .line 1238
    .line 1239
    iget v10, v8, Ll0/g;->c:I

    .line 1240
    .line 1241
    if-lez v10, :cond_2e

    .line 1242
    .line 1243
    iget v10, v8, Ll0/g;->i:I

    .line 1244
    .line 1245
    invoke-virtual {v6, v3}, Li0/m0;->a(I)I

    .line 1246
    .line 1247
    .line 1248
    move-result v3

    .line 1249
    if-eq v3, v10, :cond_2e

    .line 1250
    .line 1251
    iget-boolean v3, v9, Lm0/b;->c:Z

    .line 1252
    .line 1253
    if-nez v3, :cond_2d

    .line 1254
    .line 1255
    iget-boolean v3, v9, Lm0/b;->e:Z

    .line 1256
    .line 1257
    if-eqz v3, :cond_2d

    .line 1258
    .line 1259
    const/4 v3, 0x0

    .line 1260
    invoke-virtual {v9, v3}, Lm0/b;->d(Z)V

    .line 1261
    .line 1262
    .line 1263
    iget-object v3, v9, Lm0/b;->b:Lm0/a;

    .line 1264
    .line 1265
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;

    .line 1266
    .line 1267
    sget-object v11, Lm0/q;->c:Lm0/q;

    .line 1268
    .line 1269
    invoke-virtual {v3, v11}, Lm0/l0;->U(Lm0/j0;)V

    .line 1270
    .line 1271
    .line 1272
    const/4 v3, 0x1

    .line 1273
    iput-boolean v3, v9, Lm0/b;->c:Z

    .line 1274
    .line 1275
    :cond_2d
    if-lez v10, :cond_2e

    .line 1276
    .line 1277
    invoke-virtual {v8, v10}, Ll0/g;->a(I)Ll0/b;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    invoke-virtual {v6, v10}, Li0/m0;->c(I)V

    .line 1282
    .line 1283
    .line 1284
    const/4 v8, 0x0

    .line 1285
    invoke-virtual {v9, v8}, Lm0/b;->d(Z)V

    .line 1286
    .line 1287
    .line 1288
    iget-object v6, v9, Lm0/b;->b:Lm0/a;

    .line 1289
    .line 1290
    iget-object v6, v6, Lm0/a;->j:Lm0/l0;

    .line 1291
    .line 1292
    sget-object v10, Lm0/p;->c:Lm0/p;

    .line 1293
    .line 1294
    invoke-virtual {v6, v10}, Lm0/l0;->U(Lm0/j0;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-static {v6, v8, v3}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 1298
    .line 1299
    .line 1300
    const/4 v8, 0x1

    .line 1301
    iput-boolean v8, v9, Lm0/b;->c:Z

    .line 1302
    .line 1303
    goto :goto_20

    .line 1304
    :cond_2e
    const/4 v8, 0x1

    .line 1305
    :goto_20
    invoke-virtual {v9}, Lm0/b;->c()V

    .line 1306
    .line 1307
    .line 1308
    iget-object v3, v9, Lm0/b;->b:Lm0/a;

    .line 1309
    .line 1310
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;

    .line 1311
    .line 1312
    sget-object v6, Lm0/s;->c:Lm0/s;

    .line 1313
    .line 1314
    invoke-virtual {v3, v6}, Lm0/l0;->U(Lm0/j0;)V

    .line 1315
    .line 1316
    .line 1317
    const/4 v6, 0x0

    .line 1318
    invoke-static {v3, v6, v5, v8, v7}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    move v3, v6

    .line 1322
    goto/16 :goto_21

    .line 1323
    .line 1324
    :cond_2f
    const/4 v6, 0x0

    .line 1325
    iget-object v8, v0, Li0/h0;->O:Lm0/c;

    .line 1326
    .line 1327
    invoke-virtual {v9}, Lm0/b;->b()V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v9, v6}, Lm0/b;->d(Z)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v6, v9, Lm0/b;->d:Li0/m0;

    .line 1334
    .line 1335
    iget-object v10, v9, Lm0/b;->a:Li0/h0;

    .line 1336
    .line 1337
    iget-object v10, v10, Li0/h0;->G:Ll0/g;

    .line 1338
    .line 1339
    iget v11, v10, Ll0/g;->c:I

    .line 1340
    .line 1341
    if-lez v11, :cond_31

    .line 1342
    .line 1343
    iget v11, v10, Ll0/g;->i:I

    .line 1344
    .line 1345
    invoke-virtual {v6, v3}, Li0/m0;->a(I)I

    .line 1346
    .line 1347
    .line 1348
    move-result v3

    .line 1349
    if-eq v3, v11, :cond_31

    .line 1350
    .line 1351
    iget-boolean v3, v9, Lm0/b;->c:Z

    .line 1352
    .line 1353
    if-nez v3, :cond_30

    .line 1354
    .line 1355
    iget-boolean v3, v9, Lm0/b;->e:Z

    .line 1356
    .line 1357
    if-eqz v3, :cond_30

    .line 1358
    .line 1359
    const/4 v3, 0x0

    .line 1360
    invoke-virtual {v9, v3}, Lm0/b;->d(Z)V

    .line 1361
    .line 1362
    .line 1363
    iget-object v3, v9, Lm0/b;->b:Lm0/a;

    .line 1364
    .line 1365
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;

    .line 1366
    .line 1367
    sget-object v12, Lm0/q;->c:Lm0/q;

    .line 1368
    .line 1369
    invoke-virtual {v3, v12}, Lm0/l0;->U(Lm0/j0;)V

    .line 1370
    .line 1371
    .line 1372
    const/4 v3, 0x1

    .line 1373
    iput-boolean v3, v9, Lm0/b;->c:Z

    .line 1374
    .line 1375
    :cond_30
    if-lez v11, :cond_31

    .line 1376
    .line 1377
    invoke-virtual {v10, v11}, Ll0/g;->a(I)Ll0/b;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    invoke-virtual {v6, v11}, Li0/m0;->c(I)V

    .line 1382
    .line 1383
    .line 1384
    const/4 v6, 0x0

    .line 1385
    invoke-virtual {v9, v6}, Lm0/b;->d(Z)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v10, v9, Lm0/b;->b:Lm0/a;

    .line 1389
    .line 1390
    iget-object v10, v10, Lm0/a;->j:Lm0/l0;

    .line 1391
    .line 1392
    sget-object v11, Lm0/p;->c:Lm0/p;

    .line 1393
    .line 1394
    invoke-virtual {v10, v11}, Lm0/l0;->U(Lm0/j0;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-static {v10, v6, v3}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 1398
    .line 1399
    .line 1400
    const/4 v3, 0x1

    .line 1401
    iput-boolean v3, v9, Lm0/b;->c:Z

    .line 1402
    .line 1403
    :cond_31
    invoke-virtual {v9}, Lm0/b;->c()V

    .line 1404
    .line 1405
    .line 1406
    iget-object v3, v9, Lm0/b;->b:Lm0/a;

    .line 1407
    .line 1408
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;

    .line 1409
    .line 1410
    sget-object v6, Lm0/t;->c:Lm0/t;

    .line 1411
    .line 1412
    invoke-virtual {v3, v6}, Lm0/l0;->U(Lm0/j0;)V

    .line 1413
    .line 1414
    .line 1415
    iget v6, v3, Lm0/l0;->h:I

    .line 1416
    .line 1417
    iget-object v9, v3, Lm0/l0;->c:[Lm0/j0;

    .line 1418
    .line 1419
    iget v10, v3, Lm0/l0;->d:I

    .line 1420
    .line 1421
    const/16 v18, 0x1

    .line 1422
    .line 1423
    add-int/lit8 v10, v10, -0x1

    .line 1424
    .line 1425
    aget-object v9, v9, v10

    .line 1426
    .line 1427
    iget v9, v9, Lm0/j0;->b:I

    .line 1428
    .line 1429
    sub-int/2addr v6, v9

    .line 1430
    iget-object v3, v3, Lm0/l0;->g:[Ljava/lang/Object;

    .line 1431
    .line 1432
    aput-object v5, v3, v6

    .line 1433
    .line 1434
    add-int/lit8 v5, v6, 0x1

    .line 1435
    .line 1436
    aput-object v7, v3, v5

    .line 1437
    .line 1438
    add-int/lit8 v6, v6, 0x2

    .line 1439
    .line 1440
    aput-object v8, v3, v6

    .line 1441
    .line 1442
    new-instance v3, Lm0/c;

    .line 1443
    .line 1444
    invoke-direct {v3}, Lm0/c;-><init>()V

    .line 1445
    .line 1446
    .line 1447
    iput-object v3, v0, Li0/h0;->O:Lm0/c;

    .line 1448
    .line 1449
    const/4 v3, 0x0

    .line 1450
    :goto_21
    iput-boolean v3, v0, Li0/h0;->S:Z

    .line 1451
    .line 1452
    iget-object v5, v0, Li0/h0;->c:Ll0/h;

    .line 1453
    .line 1454
    iget v5, v5, Ll0/h;->h:I

    .line 1455
    .line 1456
    if-nez v5, :cond_32

    .line 1457
    .line 1458
    goto :goto_23

    .line 1459
    :cond_32
    invoke-virtual {v0, v4, v3}, Li0/h0;->h0(II)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v0, v4, v2}, Li0/h0;->i0(II)V

    .line 1463
    .line 1464
    .line 1465
    goto :goto_23

    .line 1466
    :cond_33
    if-eqz p1, :cond_34

    .line 1467
    .line 1468
    invoke-virtual {v9}, Lm0/b;->a()V

    .line 1469
    .line 1470
    .line 1471
    :cond_34
    iget-object v3, v9, Lm0/b;->a:Li0/h0;

    .line 1472
    .line 1473
    iget-object v3, v3, Li0/h0;->G:Ll0/g;

    .line 1474
    .line 1475
    iget v3, v3, Ll0/g;->i:I

    .line 1476
    .line 1477
    iget-object v4, v9, Lm0/b;->d:Li0/m0;

    .line 1478
    .line 1479
    move/from16 v5, v17

    .line 1480
    .line 1481
    invoke-virtual {v4, v5}, Li0/m0;->a(I)I

    .line 1482
    .line 1483
    .line 1484
    move-result v6

    .line 1485
    if-gt v6, v3, :cond_35

    .line 1486
    .line 1487
    goto :goto_22

    .line 1488
    :cond_35
    const-string v6, "Missed recording an endGroup"

    .line 1489
    .line 1490
    invoke-static {v6}, Li0/m;->a(Ljava/lang/String;)V

    .line 1491
    .line 1492
    .line 1493
    :goto_22
    invoke-virtual {v4, v5}, Li0/m0;->a(I)I

    .line 1494
    .line 1495
    .line 1496
    move-result v5

    .line 1497
    if-ne v5, v3, :cond_36

    .line 1498
    .line 1499
    const/4 v8, 0x0

    .line 1500
    invoke-virtual {v9, v8}, Lm0/b;->d(Z)V

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v4}, Li0/m0;->b()I

    .line 1504
    .line 1505
    .line 1506
    iget-object v3, v9, Lm0/b;->b:Lm0/a;

    .line 1507
    .line 1508
    iget-object v3, v3, Lm0/a;->j:Lm0/l0;

    .line 1509
    .line 1510
    sget-object v4, Lm0/m;->c:Lm0/m;

    .line 1511
    .line 1512
    invoke-virtual {v3, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 1513
    .line 1514
    .line 1515
    :cond_36
    iget-object v3, v0, Li0/h0;->G:Ll0/g;

    .line 1516
    .line 1517
    iget v3, v3, Ll0/g;->i:I

    .line 1518
    .line 1519
    invoke-virtual {v0, v3}, Li0/h0;->m0(I)I

    .line 1520
    .line 1521
    .line 1522
    move-result v4

    .line 1523
    if-eq v2, v4, :cond_37

    .line 1524
    .line 1525
    invoke-virtual {v0, v3, v2}, Li0/h0;->i0(II)V

    .line 1526
    .line 1527
    .line 1528
    :cond_37
    if-eqz p1, :cond_38

    .line 1529
    .line 1530
    const/4 v2, 0x1

    .line 1531
    :cond_38
    iget-object v3, v0, Li0/h0;->G:Ll0/g;

    .line 1532
    .line 1533
    invoke-virtual {v3}, Ll0/g;->e()V

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v9}, Lm0/b;->c()V

    .line 1537
    .line 1538
    .line 1539
    :goto_23
    iget-object v3, v0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 1540
    .line 1541
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1542
    .line 1543
    .line 1544
    move-result v4

    .line 1545
    const/16 v18, 0x1

    .line 1546
    .line 1547
    add-int/lit8 v4, v4, -0x1

    .line 1548
    .line 1549
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v3

    .line 1553
    check-cast v3, Li0/j0;

    .line 1554
    .line 1555
    if-eqz v3, :cond_39

    .line 1556
    .line 1557
    if-nez v1, :cond_39

    .line 1558
    .line 1559
    iget v1, v3, Li0/j0;->c:I

    .line 1560
    .line 1561
    add-int/lit8 v1, v1, 0x1

    .line 1562
    .line 1563
    iput v1, v3, Li0/j0;->c:I

    .line 1564
    .line 1565
    :cond_39
    iput-object v3, v0, Li0/h0;->j:Li0/j0;

    .line 1566
    .line 1567
    invoke-virtual/range {v21 .. v21}, Li0/m0;->b()I

    .line 1568
    .line 1569
    .line 1570
    move-result v1

    .line 1571
    add-int/2addr v1, v2

    .line 1572
    iput v1, v0, Li0/h0;->k:I

    .line 1573
    .line 1574
    invoke-virtual/range {v21 .. v21}, Li0/m0;->b()I

    .line 1575
    .line 1576
    .line 1577
    move-result v1

    .line 1578
    iput v1, v0, Li0/h0;->m:I

    .line 1579
    .line 1580
    invoke-virtual/range {v21 .. v21}, Li0/m0;->b()I

    .line 1581
    .line 1582
    .line 1583
    move-result v1

    .line 1584
    add-int/2addr v1, v2

    .line 1585
    iput v1, v0, Li0/h0;->l:I

    .line 1586
    .line 1587
    return-void

    .line 1588
    :cond_3a
    move/from16 v5, v17

    .line 1589
    .line 1590
    const/4 v8, 0x0

    .line 1591
    const/16 v18, 0x1

    .line 1592
    .line 1593
    invoke-virtual {v0}, Li0/h0;->M()V

    .line 1594
    .line 1595
    .line 1596
    iget-object v7, v0, Li0/h0;->G:Ll0/g;

    .line 1597
    .line 1598
    invoke-virtual {v7}, Ll0/g;->s()I

    .line 1599
    .line 1600
    .line 1601
    move-result v7

    .line 1602
    invoke-virtual {v9, v4, v7}, Lm0/b;->e(II)V

    .line 1603
    .line 1604
    .line 1605
    iget-object v7, v0, Li0/h0;->G:Ll0/g;

    .line 1606
    .line 1607
    iget v7, v7, Ll0/g;->g:I

    .line 1608
    .line 1609
    move-object/from16 v10, v37

    .line 1610
    .line 1611
    invoke-static {v10, v6, v7}, Li0/r;->k(Ljava/util/List;II)V

    .line 1612
    .line 1613
    .line 1614
    goto/16 :goto_1c
.end method

.method public final q()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Li0/h0;->p(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Li0/h0;->A()Li0/r1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v1, v0, Li0/r1;->b:I

    .line 12
    .line 13
    and-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    or-int/lit8 v1, v1, 0x2

    .line 18
    .line 19
    iput v1, v0, Li0/r1;->b:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Li0/h0;->p(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Li0/h0;->p(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final t()Li0/r1;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/h0;->E:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sub-int/2addr v2, v3

    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Li0/r1;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-eqz v1, :cond_7

    .line 26
    .line 27
    iget v5, v1, Li0/r1;->b:I

    .line 28
    .line 29
    and-int/lit8 v5, v5, -0x9

    .line 30
    .line 31
    iput v5, v1, Li0/r1;->b:I

    .line 32
    .line 33
    iget-object v5, v0, Li0/h0;->g:Landroidx/lifecycle/x;

    .line 34
    .line 35
    invoke-virtual {v5}, Landroidx/lifecycle/x;->m()V

    .line 36
    .line 37
    .line 38
    iget v5, v0, Li0/h0;->B:I

    .line 39
    .line 40
    iget-object v6, v1, Li0/r1;->f:Lf/b0;

    .line 41
    .line 42
    if-eqz v6, :cond_5

    .line 43
    .line 44
    iget v7, v1, Li0/r1;->b:I

    .line 45
    .line 46
    and-int/lit8 v7, v7, 0x10

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_1
    iget-object v7, v6, Lf/b0;->b:[Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v8, v6, Lf/b0;->c:[I

    .line 54
    .line 55
    iget-object v9, v6, Lf/b0;->a:[J

    .line 56
    .line 57
    array-length v10, v9

    .line 58
    add-int/lit8 v10, v10, -0x2

    .line 59
    .line 60
    if-ltz v10, :cond_5

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    :goto_1
    aget-wide v12, v9, v11

    .line 64
    .line 65
    not-long v14, v12

    .line 66
    const/16 v16, 0x7

    .line 67
    .line 68
    shl-long v14, v14, v16

    .line 69
    .line 70
    and-long/2addr v14, v12

    .line 71
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    and-long v14, v14, v16

    .line 77
    .line 78
    cmp-long v14, v14, v16

    .line 79
    .line 80
    if-eqz v14, :cond_4

    .line 81
    .line 82
    sub-int v14, v11, v10

    .line 83
    .line 84
    not-int v14, v14

    .line 85
    ushr-int/lit8 v14, v14, 0x1f

    .line 86
    .line 87
    const/16 v15, 0x8

    .line 88
    .line 89
    rsub-int/lit8 v14, v14, 0x8

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    :goto_2
    if-ge v4, v14, :cond_3

    .line 93
    .line 94
    const-wide/16 v17, 0xff

    .line 95
    .line 96
    and-long v17, v12, v17

    .line 97
    .line 98
    const-wide/16 v19, 0x80

    .line 99
    .line 100
    cmp-long v17, v17, v19

    .line 101
    .line 102
    if-gez v17, :cond_2

    .line 103
    .line 104
    shl-int/lit8 v17, v11, 0x3

    .line 105
    .line 106
    add-int v17, v17, v4

    .line 107
    .line 108
    aget-object v18, v7, v17

    .line 109
    .line 110
    aget v2, v8, v17

    .line 111
    .line 112
    if-eq v2, v5, :cond_2

    .line 113
    .line 114
    new-instance v2, Leb/v0;

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-direct {v2, v1, v5, v6, v4}, Leb/v0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_2
    shr-long/2addr v12, v15

    .line 122
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    if-ne v14, v15, :cond_5

    .line 126
    .line 127
    :cond_4
    if-eq v11, v10, :cond_5

    .line 128
    .line 129
    add-int/lit8 v11, v11, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    :goto_3
    const/4 v2, 0x0

    .line 133
    :goto_4
    iget-object v4, v0, Li0/h0;->M:Lm0/b;

    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    iget-object v5, v4, Lm0/b;->b:Lm0/a;

    .line 138
    .line 139
    iget-object v5, v5, Lm0/a;->j:Lm0/l0;

    .line 140
    .line 141
    sget-object v6, Lm0/l;->c:Lm0/l;

    .line 142
    .line 143
    invoke-virtual {v5, v6}, Lm0/l0;->U(Lm0/j0;)V

    .line 144
    .line 145
    .line 146
    iget-object v6, v0, Li0/h0;->h:Li0/q;

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-static {v5, v7, v2, v3, v6}, Lf8/i;->G0(Lm0/l0;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    iget v2, v1, Li0/r1;->b:I

    .line 153
    .line 154
    and-int/lit16 v5, v2, 0x200

    .line 155
    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    and-int/lit16 v2, v2, -0x201

    .line 159
    .line 160
    iput v2, v1, Li0/r1;->b:I

    .line 161
    .line 162
    iget-object v2, v4, Lm0/b;->b:Lm0/a;

    .line 163
    .line 164
    iget-object v2, v2, Lm0/a;->j:Lm0/l0;

    .line 165
    .line 166
    sget-object v4, Lm0/o;->c:Lm0/o;

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Lm0/l0;->U(Lm0/j0;)V

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    invoke-static {v2, v7, v1}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget v2, v1, Li0/r1;->b:I

    .line 176
    .line 177
    and-int/lit16 v4, v2, -0x81

    .line 178
    .line 179
    iput v4, v1, Li0/r1;->b:I

    .line 180
    .line 181
    and-int/lit16 v4, v2, 0x400

    .line 182
    .line 183
    if-eqz v4, :cond_7

    .line 184
    .line 185
    and-int/lit16 v2, v2, -0x481

    .line 186
    .line 187
    iput v2, v1, Li0/r1;->b:I

    .line 188
    .line 189
    iget v2, v0, Li0/h0;->z:I

    .line 190
    .line 191
    iget-object v4, v0, Li0/h0;->G:Ll0/g;

    .line 192
    .line 193
    iget v4, v4, Ll0/g;->i:I

    .line 194
    .line 195
    if-ne v2, v4, :cond_7

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    iput-boolean v7, v0, Li0/h0;->y:Z

    .line 199
    .line 200
    const/4 v2, -0x1

    .line 201
    iput v2, v0, Li0/h0;->z:I

    .line 202
    .line 203
    :cond_7
    if-eqz v1, :cond_c

    .line 204
    .line 205
    iget v2, v1, Li0/r1;->b:I

    .line 206
    .line 207
    and-int/lit8 v4, v2, 0x10

    .line 208
    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_8
    and-int/2addr v2, v3

    .line 213
    if-eqz v2, :cond_9

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_9
    iget-boolean v2, v0, Li0/h0;->q:Z

    .line 217
    .line 218
    if-eqz v2, :cond_c

    .line 219
    .line 220
    :goto_5
    iget-object v2, v1, Li0/r1;->c:Ll0/b;

    .line 221
    .line 222
    if-nez v2, :cond_b

    .line 223
    .line 224
    iget-boolean v2, v0, Li0/h0;->S:Z

    .line 225
    .line 226
    if-eqz v2, :cond_a

    .line 227
    .line 228
    iget-object v2, v0, Li0/h0;->I:Ll0/k;

    .line 229
    .line 230
    iget v3, v2, Ll0/k;->v:I

    .line 231
    .line 232
    invoke-virtual {v2, v3}, Ll0/k;->b(I)Ll0/b;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    goto :goto_6

    .line 237
    :cond_a
    iget-object v2, v0, Li0/h0;->G:Ll0/g;

    .line 238
    .line 239
    iget v3, v2, Ll0/g;->i:I

    .line 240
    .line 241
    invoke-virtual {v2, v3}, Ll0/g;->a(I)Ll0/b;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    :goto_6
    iput-object v2, v1, Li0/r1;->c:Ll0/b;

    .line 246
    .line 247
    :cond_b
    iget v2, v1, Li0/r1;->b:I

    .line 248
    .line 249
    and-int/lit8 v2, v2, -0x5

    .line 250
    .line 251
    iput v2, v1, Li0/r1;->b:I

    .line 252
    .line 253
    move-object v4, v1

    .line 254
    :goto_7
    const/4 v7, 0x0

    .line 255
    goto :goto_9

    .line 256
    :cond_c
    :goto_8
    const/4 v4, 0x0

    .line 257
    goto :goto_7

    .line 258
    :goto_9
    invoke-virtual {v0, v7}, Li0/h0;->p(Z)V

    .line 259
    .line 260
    .line 261
    return-object v4
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/h0;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Li0/h0;->z:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "Cannot disable reuse from root if it was caused by other groups"

    .line 11
    .line 12
    invoke-static {v0}, Li0/n1;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 v0, -0x1

    .line 16
    iput v0, p0, Li0/h0;->z:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Li0/h0;->y:Z

    .line 20
    .line 21
    return-void
.end method

.method public final v()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Li0/h0;->p(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Li0/h0;->b:Li0/o;

    .line 6
    .line 7
    invoke-virtual {v1}, Li0/o;->c()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Li0/h0;->p(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Li0/h0;->M:Lm0/b;

    .line 14
    .line 15
    iget-boolean v2, v1, Lm0/b;->c:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lm0/b;->d(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lm0/b;->d(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v1, Lm0/b;->b:Lm0/a;

    .line 26
    .line 27
    iget-object v2, v2, Lm0/a;->j:Lm0/l0;

    .line 28
    .line 29
    sget-object v3, Lm0/m;->c:Lm0/m;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lm0/l0;->U(Lm0/j0;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v0, v1, Lm0/b;->c:Z

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, Lm0/b;->b()V

    .line 37
    .line 38
    .line 39
    iget-object v1, v1, Lm0/b;->d:Li0/m0;

    .line 40
    .line 41
    iget v1, v1, Li0/m0;->b:I

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string v1, "Missed recording an endGroup()"

    .line 47
    .line 48
    invoke-static {v1}, Li0/m;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v1, p0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    const-string v1, "Start/end imbalance"

    .line 60
    .line 61
    invoke-static {v1}, Li0/m;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {p0}, Li0/h0;->i()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Li0/h0;->G:Ll0/g;

    .line 68
    .line 69
    invoke-virtual {v1}, Ll0/g;->c()V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Li0/h0;->x:Li0/m0;

    .line 73
    .line 74
    invoke-virtual {v1}, Li0/m0;->b()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    const/4 v0, 0x1

    .line 81
    :cond_3
    iput-boolean v0, p0, Li0/h0;->w:Z

    .line 82
    .line 83
    return-void
.end method

.method public final w(ZLi0/j0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/h0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Li0/h0;->j:Li0/j0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Li0/h0;->j:Li0/j0;

    .line 9
    .line 10
    iget p2, p0, Li0/h0;->l:I

    .line 11
    .line 12
    iget-object v0, p0, Li0/h0;->n:Li0/m0;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Li0/m0;->c(I)V

    .line 15
    .line 16
    .line 17
    iget p2, p0, Li0/h0;->m:I

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Li0/m0;->c(I)V

    .line 20
    .line 21
    .line 22
    iget p2, p0, Li0/h0;->k:I

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Li0/m0;->c(I)V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iput p2, p0, Li0/h0;->k:I

    .line 31
    .line 32
    :cond_0
    iput p2, p0, Li0/h0;->l:I

    .line 33
    .line 34
    iput p2, p0, Li0/h0;->m:I

    .line 35
    .line 36
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    new-instance v0, Ll0/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ll0/h;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Li0/h0;->C:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ll0/h;->c()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Li0/h0;->b:Li0/o;

    .line 14
    .line 15
    invoke-virtual {v1}, Li0/o;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lf/w;

    .line 22
    .line 23
    invoke-direct {v1}, Lf/w;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Ll0/h;->q:Lf/w;

    .line 27
    .line 28
    :cond_1
    iput-object v0, p0, Li0/h0;->H:Ll0/h;

    .line 29
    .line 30
    invoke-virtual {v0}, Ll0/h;->e()Ll0/k;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Ll0/k;->e(Z)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 39
    .line 40
    return-void
.end method

.method public final y()Lx0/c;
    .locals 2

    .line 1
    iget-object v0, p0, Li0/h0;->U:Li0/i0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li0/i0;

    .line 6
    .line 7
    iget-object v1, p0, Li0/h0;->h:Li0/q;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Li0/i0;-><init>(Li0/n;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li0/h0;->U:Li0/i0;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final z()Ls0/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/h0;->l()Ls0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
