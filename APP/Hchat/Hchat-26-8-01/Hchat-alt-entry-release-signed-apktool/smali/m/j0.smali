.class public abstract Lm/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    .line 2
    .line 3
    double-to-float v0, v0

    .line 4
    const/16 v1, 0x12

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    div-float/2addr v0, v1

    .line 8
    sput v0, Lm/j0;->a:F

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Ls1/k0;JLyf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lm/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lm/c0;

    .line 7
    .line 8
    iget v1, v0, Lm/c0;->j:I

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
    iput v1, v0, Lm/c0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/c0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lm/c0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/c0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lm/c0;->h:Lgg/t;

    .line 36
    .line 37
    iget-object p1, v0, Lm/c0;->g:Ls1/k0;

    .line 38
    .line 39
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v11, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v11

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, Ls1/k0;->l:Ls1/l0;

    .line 57
    .line 58
    iget-object p3, p3, Ls1/l0;->z:Ls1/k;

    .line 59
    .line 60
    invoke-static {p3, p1, p2}, Lm/j0;->e(Ls1/k;J)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :cond_3
    new-instance p3, Lgg/t;

    .line 69
    .line 70
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-wide p1, p3, Lgg/t;->g:J

    .line 74
    .line 75
    :goto_1
    iput-object p0, v0, Lm/c0;->g:Ls1/k0;

    .line 76
    .line 77
    iput-object p3, v0, Lm/c0;->h:Lgg/t;

    .line 78
    .line 79
    iput v2, v0, Lm/c0;->j:I

    .line 80
    .line 81
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 88
    .line 89
    if-ne p1, p2, :cond_4

    .line 90
    .line 91
    return-object p2

    .line 92
    :cond_4
    move-object v11, p3

    .line 93
    move-object p3, p1

    .line 94
    move-object p1, v11

    .line 95
    :goto_2
    check-cast p3, Ls1/k;

    .line 96
    .line 97
    iget-object p2, p3, Ls1/k;->a:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    const/4 v4, 0x0

    .line 104
    move v5, v4

    .line 105
    :goto_3
    if-ge v5, v1, :cond_6

    .line 106
    .line 107
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move-object v7, v6

    .line 112
    check-cast v7, Ls1/t;

    .line 113
    .line 114
    iget-wide v7, v7, Ls1/t;->a:J

    .line 115
    .line 116
    iget-wide v9, p1, Lgg/t;->g:J

    .line 117
    .line 118
    invoke-static {v7, v8, v9, v10}, Ls1/s;->e(JJ)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    move-object v6, v3

    .line 129
    :goto_4
    check-cast v6, Ls1/t;

    .line 130
    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    move-object v6, v3

    .line 134
    goto :goto_7

    .line 135
    :cond_7
    invoke-static {v6}, Ls1/s;->d(Ls1/t;)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-eqz p2, :cond_b

    .line 140
    .line 141
    iget-object p2, p3, Ls1/k;->a:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    :goto_5
    if-ge v4, p3, :cond_9

    .line 148
    .line 149
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    move-object v5, v1

    .line 154
    check-cast v5, Ls1/t;

    .line 155
    .line 156
    iget-boolean v5, v5, Ls1/t;->d:Z

    .line 157
    .line 158
    if-eqz v5, :cond_8

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    move-object v1, v3

    .line 165
    :goto_6
    check-cast v1, Ls1/t;

    .line 166
    .line 167
    if-nez v1, :cond_a

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_a
    iget-wide p2, v1, Ls1/t;->a:J

    .line 171
    .line 172
    iput-wide p2, p1, Lgg/t;->g:J

    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_b
    invoke-static {v6, v2}, Ls1/s;->h(Ls1/t;Z)J

    .line 176
    .line 177
    .line 178
    move-result-wide p2

    .line 179
    const-wide/16 v4, 0x0

    .line 180
    .line 181
    invoke-static {p2, p3, v4, v5}, Le1/b;->b(JJ)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_d

    .line 186
    .line 187
    :goto_7
    if-eqz v6, :cond_c

    .line 188
    .line 189
    invoke-virtual {v6}, Ls1/t;->b()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_c

    .line 194
    .line 195
    return-object v6

    .line 196
    :cond_c
    :goto_8
    return-object v3

    .line 197
    :cond_d
    :goto_9
    move-object p3, p1

    .line 198
    goto :goto_1
.end method

.method public static final b(Ls1/k0;JLyf/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lm/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lm/d0;

    .line 7
    .line 8
    iget v1, v0, Lm/d0;->k:I

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
    iput v1, v0, Lm/d0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/d0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lm/d0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/d0;->k:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lm/d0;->i:Lgg/q;

    .line 36
    .line 37
    iget-object p1, v0, Lm/d0;->h:Lgg/u;

    .line 38
    .line 39
    iget-object p2, v0, Lm/d0;->g:Ls1/t;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ls1/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p3, p0, Ls1/k0;->l:Ls1/l0;

    .line 57
    .line 58
    iget-object p3, p3, Ls1/l0;->z:Ls1/k;

    .line 59
    .line 60
    invoke-static {p3, p1, p2}, Lm/j0;->e(Ls1/k;J)Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_3
    iget-object p3, p0, Ls1/k0;->l:Ls1/l0;

    .line 68
    .line 69
    iget-object p3, p3, Ls1/l0;->z:Ls1/k;

    .line 70
    .line 71
    iget-object p3, p3, Ls1/k;->a:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/4 v4, 0x0

    .line 78
    :goto_1
    if-ge v4, v1, :cond_5

    .line 79
    .line 80
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    move-object v6, v5

    .line 85
    check-cast v6, Ls1/t;

    .line 86
    .line 87
    iget-wide v6, v6, Ls1/t;->a:J

    .line 88
    .line 89
    invoke-static {v6, v7, p1, p2}, Ls1/s;->e(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v5, v3

    .line 100
    :goto_2
    move-object p2, v5

    .line 101
    check-cast p2, Ls1/t;

    .line 102
    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    new-instance p1, Lgg/u;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance p3, Lgg/u;

    .line 112
    .line 113
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p2, p3, Lgg/u;->g:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {p0}, Ls1/k0;->B()Ly1/l2;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v1}, Ly1/l2;->b()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    :try_start_1
    new-instance v1, Lgg/q;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    new-instance v6, Lm/e0;

    .line 132
    .line 133
    invoke-direct {v6, v1, p3, p1, v3}, Lm/e0;-><init>(Lgg/q;Lgg/u;Lgg/u;Lwf/c;)V

    .line 134
    .line 135
    .line 136
    iput-object p2, v0, Lm/d0;->g:Ls1/t;

    .line 137
    .line 138
    iput-object p1, v0, Lm/d0;->h:Lgg/u;

    .line 139
    .line 140
    iput-object v1, v0, Lm/d0;->i:Lgg/q;

    .line 141
    .line 142
    iput v2, v0, Lm/d0;->k:I

    .line 143
    .line 144
    invoke-virtual {p0, v4, v5, v6, v0}, Ls1/k0;->C(JLfg/p;Lyf/c;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0
    :try_end_1
    .catch Ls1/m; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    sget-object p3, Lxf/a;->g:Lxf/a;

    .line 149
    .line 150
    if-ne p0, p3, :cond_7

    .line 151
    .line 152
    return-object p3

    .line 153
    :cond_7
    move-object p0, v1

    .line 154
    :goto_3
    :try_start_2
    iget-boolean p0, p0, Lgg/q;->g:Z

    .line 155
    .line 156
    if-eqz p0, :cond_9

    .line 157
    .line 158
    iget-object p0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Ls1/t;
    :try_end_2
    .catch Ls1/m; {:try_start_2 .. :try_end_2} :catch_0

    .line 161
    .line 162
    if-nez p0, :cond_8

    .line 163
    .line 164
    return-object p2

    .line 165
    :cond_8
    return-object p0

    .line 166
    :cond_9
    :goto_4
    return-object v3

    .line 167
    :catch_0
    iget-object p0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Ls1/t;

    .line 170
    .line 171
    if-nez p0, :cond_a

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_a
    move-object p2, p0

    .line 175
    :goto_5
    return-object p2
.end method

.method public static final c(Ls1/k0;JLb0/t;Lyf/a;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    instance-of v3, v2, Lm/f0;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lm/f0;

    .line 11
    .line 12
    iget v4, v3, Lm/f0;->n:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lm/f0;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lm/f0;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lyf/c;-><init>(Lwf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lm/f0;->m:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Lm/f0;->n:I

    .line 32
    .line 33
    const-wide/16 v5, 0x0

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    const/4 v8, 0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v8, :cond_2

    .line 43
    .line 44
    if-ne v4, v7, :cond_1

    .line 45
    .line 46
    iget v0, v3, Lm/f0;->l:F

    .line 47
    .line 48
    iget-object v1, v3, Lm/f0;->k:Ls1/t;

    .line 49
    .line 50
    iget-object v4, v3, Lm/f0;->j:Lm/a3;

    .line 51
    .line 52
    iget-object v11, v3, Lm/f0;->i:Lgg/t;

    .line 53
    .line 54
    iget-object v12, v3, Lm/f0;->h:Ls1/k0;

    .line 55
    .line 56
    iget-object v13, v3, Lm/f0;->g:Lfg/p;

    .line 57
    .line 58
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 p4, v12

    .line 62
    .line 63
    move-object v12, v11

    .line 64
    move-object/from16 v11, p4

    .line 65
    .line 66
    move v15, v7

    .line 67
    move v2, v8

    .line 68
    move-object/from16 p4, v9

    .line 69
    .line 70
    move-wide v6, v5

    .line 71
    move v5, v0

    .line 72
    move-object v0, v13

    .line 73
    goto/16 :goto_a

    .line 74
    .line 75
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :cond_2
    iget v0, v3, Lm/f0;->l:F

    .line 83
    .line 84
    iget-object v1, v3, Lm/f0;->j:Lm/a3;

    .line 85
    .line 86
    iget-object v4, v3, Lm/f0;->i:Lgg/t;

    .line 87
    .line 88
    iget-object v11, v3, Lm/f0;->h:Ls1/k0;

    .line 89
    .line 90
    iget-object v12, v3, Lm/f0;->g:Lfg/p;

    .line 91
    .line 92
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object/from16 v17, v4

    .line 96
    .line 97
    move v4, v0

    .line 98
    move-object v0, v12

    .line 99
    :goto_1
    move-object/from16 v12, v17

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    invoke-static {v2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v2, p0

    .line 106
    .line 107
    iget-object v4, v2, Ls1/k0;->l:Ls1/l0;

    .line 108
    .line 109
    iget-object v4, v4, Ls1/l0;->z:Ls1/k;

    .line 110
    .line 111
    invoke-static {v4, v0, v1}, Lm/j0;->e(Ls1/k;J)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    move-object/from16 p4, v9

    .line 118
    .line 119
    goto/16 :goto_b

    .line 120
    .line 121
    :cond_4
    invoke-virtual {v2}, Ls1/k0;->B()Ly1/l2;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-interface {v4}, Ly1/l2;->f()F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    new-instance v11, Lgg/t;

    .line 130
    .line 131
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-wide v0, v11, Lgg/t;->g:J

    .line 135
    .line 136
    new-instance v0, Lm/a3;

    .line 137
    .line 138
    invoke-direct {v0, v5, v6, v9}, Lm/a3;-><init>(JLm/p1;)V

    .line 139
    .line 140
    .line 141
    move-object v1, v0

    .line 142
    move-object/from16 v0, p3

    .line 143
    .line 144
    :goto_2
    iput-object v0, v3, Lm/f0;->g:Lfg/p;

    .line 145
    .line 146
    iput-object v2, v3, Lm/f0;->h:Ls1/k0;

    .line 147
    .line 148
    iput-object v11, v3, Lm/f0;->i:Lgg/t;

    .line 149
    .line 150
    iput-object v1, v3, Lm/f0;->j:Lm/a3;

    .line 151
    .line 152
    iput-object v9, v3, Lm/f0;->k:Ls1/t;

    .line 153
    .line 154
    iput v4, v3, Lm/f0;->l:F

    .line 155
    .line 156
    iput v8, v3, Lm/f0;->n:I

    .line 157
    .line 158
    sget-object v12, Ls1/l;->h:Ls1/l;

    .line 159
    .line 160
    invoke-virtual {v2, v12, v3}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    if-ne v12, v10, :cond_5

    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :cond_5
    move-object/from16 v17, v11

    .line 169
    .line 170
    move-object v11, v2

    .line 171
    move-object v2, v12

    .line 172
    goto :goto_1

    .line 173
    :goto_3
    check-cast v2, Ls1/k;

    .line 174
    .line 175
    iget-object v13, v2, Ls1/k;->a:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    move-object/from16 p4, v9

    .line 182
    .line 183
    const/4 v9, 0x0

    .line 184
    :goto_4
    if-ge v9, v14, :cond_7

    .line 185
    .line 186
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v16

    .line 190
    move-object/from16 v15, v16

    .line 191
    .line 192
    check-cast v15, Ls1/t;

    .line 193
    .line 194
    iget-wide v5, v15, Ls1/t;->a:J

    .line 195
    .line 196
    iget-wide v7, v12, Lgg/t;->g:J

    .line 197
    .line 198
    invoke-static {v5, v6, v7, v8}, Ls1/s;->e(JJ)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_6

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 206
    .line 207
    const-wide/16 v5, 0x0

    .line 208
    .line 209
    const/4 v7, 0x2

    .line 210
    const/4 v8, 0x1

    .line 211
    goto :goto_4

    .line 212
    :cond_7
    move-object/from16 v16, p4

    .line 213
    .line 214
    :goto_5
    move-object/from16 v5, v16

    .line 215
    .line 216
    check-cast v5, Ls1/t;

    .line 217
    .line 218
    if-nez v5, :cond_8

    .line 219
    .line 220
    goto/16 :goto_b

    .line 221
    .line 222
    :cond_8
    invoke-virtual {v5}, Ls1/t;->b()Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_9

    .line 227
    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :cond_9
    invoke-static {v5}, Ls1/s;->d(Ls1/t;)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_d

    .line 235
    .line 236
    iget-object v2, v2, Ls1/k;->a:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    const/4 v6, 0x0

    .line 243
    :goto_6
    if-ge v6, v5, :cond_b

    .line 244
    .line 245
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    move-object v8, v7

    .line 250
    check-cast v8, Ls1/t;

    .line 251
    .line 252
    iget-boolean v8, v8, Ls1/t;->d:Z

    .line 253
    .line 254
    if-eqz v8, :cond_a

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_b
    move-object/from16 v7, p4

    .line 261
    .line 262
    :goto_7
    check-cast v7, Ls1/t;

    .line 263
    .line 264
    if-nez v7, :cond_c

    .line 265
    .line 266
    goto :goto_b

    .line 267
    :cond_c
    iget-wide v5, v7, Ls1/t;->a:J

    .line 268
    .line 269
    iput-wide v5, v12, Lgg/t;->g:J

    .line 270
    .line 271
    const/4 v2, 0x1

    .line 272
    const-wide/16 v6, 0x0

    .line 273
    .line 274
    goto :goto_8

    .line 275
    :cond_d
    const/4 v2, 0x1

    .line 276
    invoke-static {v5, v2}, Ls1/s;->h(Ls1/t;Z)J

    .line 277
    .line 278
    .line 279
    move-result-wide v6

    .line 280
    invoke-virtual {v1, v6, v7, v4, v2}, Lm/a3;->a(JFZ)J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    const-wide v8, 0x7fffffff7fffffffL

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    and-long/2addr v8, v6

    .line 290
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    cmp-long v8, v8, v13

    .line 296
    .line 297
    if-eqz v8, :cond_f

    .line 298
    .line 299
    new-instance v8, Le1/b;

    .line 300
    .line 301
    invoke-direct {v8, v6, v7}, Le1/b;-><init>(J)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v0, v5, v8}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, Ls1/t;->b()Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_e

    .line 312
    .line 313
    return-object v5

    .line 314
    :cond_e
    const-wide/16 v6, 0x0

    .line 315
    .line 316
    iput-wide v6, v1, Lm/a3;->b:J

    .line 317
    .line 318
    :goto_8
    move-object/from16 v9, p4

    .line 319
    .line 320
    move v8, v2

    .line 321
    move-wide v5, v6

    .line 322
    move-object v2, v11

    .line 323
    move-object v11, v12

    .line 324
    const/4 v7, 0x2

    .line 325
    goto/16 :goto_2

    .line 326
    .line 327
    :cond_f
    const-wide/16 v6, 0x0

    .line 328
    .line 329
    iput-object v0, v3, Lm/f0;->g:Lfg/p;

    .line 330
    .line 331
    iput-object v11, v3, Lm/f0;->h:Ls1/k0;

    .line 332
    .line 333
    iput-object v12, v3, Lm/f0;->i:Lgg/t;

    .line 334
    .line 335
    iput-object v1, v3, Lm/f0;->j:Lm/a3;

    .line 336
    .line 337
    iput-object v5, v3, Lm/f0;->k:Ls1/t;

    .line 338
    .line 339
    iput v4, v3, Lm/f0;->l:F

    .line 340
    .line 341
    const/4 v15, 0x2

    .line 342
    iput v15, v3, Lm/f0;->n:I

    .line 343
    .line 344
    sget-object v8, Ls1/l;->i:Ls1/l;

    .line 345
    .line 346
    invoke-virtual {v11, v8, v3}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    if-ne v8, v10, :cond_10

    .line 351
    .line 352
    :goto_9
    return-object v10

    .line 353
    :cond_10
    move/from16 v17, v4

    .line 354
    .line 355
    move-object v4, v1

    .line 356
    move-object v1, v5

    .line 357
    move/from16 v5, v17

    .line 358
    .line 359
    :goto_a
    invoke-virtual {v1}, Ls1/t;->b()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-eqz v1, :cond_11

    .line 364
    .line 365
    :goto_b
    return-object p4

    .line 366
    :cond_11
    move-object/from16 v9, p4

    .line 367
    .line 368
    move v8, v2

    .line 369
    move-object v1, v4

    .line 370
    move v4, v5

    .line 371
    move-wide v5, v6

    .line 372
    move-object v2, v11

    .line 373
    move-object v11, v12

    .line 374
    move v7, v15

    .line 375
    goto/16 :goto_2
.end method

.method public static final d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lm/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lm/h0;

    .line 7
    .line 8
    iget v1, v0, Lm/h0;->j:I

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
    iput v1, v0, Lm/h0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/h0;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lm/h0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/h0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lm/h0;->h:Lfg/l;

    .line 35
    .line 36
    iget-object p1, v0, Lm/h0;->g:Ls1/k0;

    .line 37
    .line 38
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object p3, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    iput-object p0, v0, Lm/h0;->g:Ls1/k0;

    .line 55
    .line 56
    iput-object p3, v0, Lm/h0;->h:Lfg/l;

    .line 57
    .line 58
    iput v2, v0, Lm/h0;->j:I

    .line 59
    .line 60
    invoke-static {p0, p1, p2, v0}, Lm/j0;->a(Ls1/k0;JLyf/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 65
    .line 66
    if-ne p4, p1, :cond_3

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    :goto_2
    check-cast p4, Ls1/t;

    .line 70
    .line 71
    if-nez p4, :cond_4

    .line 72
    .line 73
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_4
    invoke-static {p4}, Ls1/s;->d(Ls1/t;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    invoke-interface {p3, p4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-wide p1, p4, Ls1/t;->a:J

    .line 89
    .line 90
    goto :goto_1
.end method

.method public static final e(Ls1/k;J)Z
    .locals 6

    .line 1
    iget-object p0, p0, Ls1/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    move-object v4, v3

    .line 16
    check-cast v4, Ls1/t;

    .line 17
    .line 18
    iget-wide v4, v4, Ls1/t;->a:J

    .line 19
    .line 20
    invoke-static {v4, v5, p1, p2}, Ls1/s;->e(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_1
    check-cast v3, Ls1/t;

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-boolean p1, v3, Ls1/t;->d:Z

    .line 37
    .line 38
    if-ne p1, p0, :cond_2

    .line 39
    .line 40
    move v1, p0

    .line 41
    :cond_2
    xor-int/2addr p0, v1

    .line 42
    return p0
.end method

.method public static final f(Ly1/l2;I)F
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Ly1/l2;->f()F

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    sget p1, Lm/j0;->a:F

    .line 9
    .line 10
    mul-float/2addr p0, p1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-interface {p0}, Ly1/l2;->f()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final g(Ls1/k0;Ls1/t;Lk/s1;Lf0/h;Lb0/t;Lw/t0;Lb0/d0;Lyf/a;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    instance-of v2, v1, Lm/i0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lm/i0;

    iget v3, v2, Lm/i0;->v:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lm/i0;->v:I

    goto :goto_0

    :cond_0
    new-instance v2, Lm/i0;

    .line 1
    invoke-direct {v2, v1}, Lyf/c;-><init>(Lwf/c;)V

    .line 2
    :goto_0
    iget-object v1, v2, Lm/i0;->u:Ljava/lang/Object;

    .line 3
    iget v3, v2, Lm/i0;->v:I

    sget-object v5, Ls1/l;->i:Ls1/l;

    sget-object v6, Ls1/l;->h:Ls1/l;

    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    sget-object v8, Lxf/a;->g:Lxf/a;

    packed-switch v3, :pswitch_data_0

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    iget-object v0, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v0, Lgg/t;

    iget-object v3, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v3, Ls1/k0;

    iget-object v4, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v4, Ls1/k0;

    iget-object v5, v2, Lm/i0;->i:Lsf/b;

    check-cast v5, Lfg/l;

    iget-object v9, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v9, Lfg/a;

    iget-object v10, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v10, Lfg/p;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object v7, v5

    const/4 v15, 0x0

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v0

    move-object v0, v8

    goto/16 :goto_28

    :pswitch_1
    iget v0, v2, Lm/i0;->t:F

    iget-object v3, v2, Lm/i0;->r:Ls1/t;

    iget-object v4, v2, Lm/i0;->q:Lm/a3;

    iget-object v9, v2, Lm/i0;->p:Lgg/t;

    const-wide v18, 0x7fffffff7fffffffL

    iget-object v10, v2, Lm/i0;->o:Ljava/lang/Object;

    check-cast v10, Ls1/k0;

    iget-object v11, v2, Lm/i0;->n:Ljava/lang/Object;

    check-cast v11, Lgg/t;

    iget-object v14, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v14, Ls1/t;

    iget-object v12, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v12, Lfg/l;

    iget-object v13, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v13, Lfg/a;

    iget-object v15, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v15, Lfg/p;

    iget-object v7, v2, Lm/i0;->i:Lsf/b;

    check-cast v7, Lfg/q;

    move/from16 p0, v0

    iget-object v0, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v0, Lm/p1;

    move-object/from16 p1, v0

    iget-object v0, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v0, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object v1, v15

    move-object v15, v10

    move-object v10, v1

    move-object v1, v0

    move-object/from16 v23, v6

    move-object v0, v8

    move-object v8, v9

    move-object v6, v11

    move-object v9, v5

    move-object v11, v7

    move-object v7, v12

    move-object/from16 v12, p1

    move-object v5, v4

    move/from16 v4, p0

    goto/16 :goto_23

    :pswitch_2
    const-wide v18, 0x7fffffff7fffffffL

    iget v0, v2, Lm/i0;->t:F

    iget-object v3, v2, Lm/i0;->q:Lm/a3;

    iget-object v4, v2, Lm/i0;->p:Lgg/t;

    iget-object v7, v2, Lm/i0;->o:Ljava/lang/Object;

    check-cast v7, Ls1/k0;

    iget-object v9, v2, Lm/i0;->n:Ljava/lang/Object;

    check-cast v9, Lgg/t;

    iget-object v10, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v10, Ls1/t;

    iget-object v11, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v11, Lfg/l;

    iget-object v12, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v12, Lfg/a;

    iget-object v13, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v13, Lfg/p;

    iget-object v14, v2, Lm/i0;->i:Lsf/b;

    check-cast v14, Lfg/q;

    iget-object v15, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v15, Lm/p1;

    move/from16 p0, v0

    iget-object v0, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v0, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object/from16 v23, v4

    move/from16 v4, p0

    move-object/from16 p0, v1

    move-object v1, v3

    move-object v3, v2

    move-object v2, v0

    move-object v0, v8

    move-object/from16 v8, v23

    move-object/from16 v23, v14

    move-object v14, v7

    move-object v7, v11

    move-object/from16 v11, v23

    move-object/from16 v23, v6

    move-object v6, v9

    move-object v9, v12

    move-object v12, v15

    goto/16 :goto_1b

    :pswitch_3
    const-wide v18, 0x7fffffff7fffffffL

    iget-object v0, v2, Lm/i0;->o:Ljava/lang/Object;

    check-cast v0, Lgg/t;

    iget-object v3, v2, Lm/i0;->n:Ljava/lang/Object;

    check-cast v3, Ls1/t;

    iget-object v4, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v4, Ls1/t;

    iget-object v7, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v7, Lfg/l;

    iget-object v9, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v9, Lfg/a;

    iget-object v10, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v10, Lfg/p;

    iget-object v11, v2, Lm/i0;->i:Lsf/b;

    check-cast v11, Lfg/q;

    iget-object v12, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v12, Lm/p1;

    iget-object v13, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v13, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object/from16 v23, v6

    move-object v6, v0

    move-object v0, v8

    goto/16 :goto_14

    :pswitch_4
    const-wide v18, 0x7fffffff7fffffffL

    iget v0, v2, Lm/i0;->t:F

    iget-object v3, v2, Lm/i0;->r:Ls1/t;

    iget-object v7, v2, Lm/i0;->q:Lm/a3;

    iget-object v9, v2, Lm/i0;->p:Lgg/t;

    iget-object v10, v2, Lm/i0;->o:Ljava/lang/Object;

    check-cast v10, Ls1/k0;

    iget-object v11, v2, Lm/i0;->n:Ljava/lang/Object;

    check-cast v11, Lgg/t;

    iget-object v12, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v12, Ls1/t;

    iget-object v13, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v13, Lfg/l;

    iget-object v14, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v14, Lfg/a;

    iget-object v15, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v15, Lfg/p;

    iget-object v4, v2, Lm/i0;->i:Lsf/b;

    check-cast v4, Lfg/q;

    move/from16 p0, v0

    iget-object v0, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v0, Lm/p1;

    move-object/from16 p1, v0

    iget-object v0, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v0, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object v1, v13

    move-object v13, v0

    move-object v0, v8

    move-object v8, v10

    move-object v10, v1

    move-object v1, v11

    move-object v11, v5

    move-object v5, v7

    move-object v7, v15

    move-object v15, v1

    move/from16 v25, p0

    move-object/from16 v23, v6

    move-object v1, v12

    move-object v12, v9

    move-object v9, v4

    move-object/from16 v4, p1

    goto/16 :goto_e

    :pswitch_5
    const-wide v18, 0x7fffffff7fffffffL

    iget v0, v2, Lm/i0;->t:F

    iget-object v3, v2, Lm/i0;->q:Lm/a3;

    iget-object v4, v2, Lm/i0;->p:Lgg/t;

    iget-object v7, v2, Lm/i0;->o:Ljava/lang/Object;

    check-cast v7, Ls1/k0;

    iget-object v9, v2, Lm/i0;->n:Ljava/lang/Object;

    check-cast v9, Lgg/t;

    iget-object v10, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v10, Ls1/t;

    iget-object v11, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v11, Lfg/l;

    iget-object v12, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v12, Lfg/a;

    iget-object v13, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v13, Lfg/p;

    iget-object v14, v2, Lm/i0;->i:Lsf/b;

    check-cast v14, Lfg/q;

    iget-object v15, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v15, Lm/p1;

    move/from16 p0, v0

    iget-object v0, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v0, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object/from16 v23, v0

    move/from16 v0, p0

    move-object/from16 p0, v1

    move-object v1, v3

    move-object v3, v15

    move-object v15, v9

    move-object v9, v14

    move-object/from16 v14, v23

    move-object/from16 v23, v12

    move-object v12, v4

    move-object/from16 v4, v23

    move-object/from16 v23, v13

    move-object v13, v7

    move-object/from16 v7, v23

    :goto_1
    move-object/from16 v23, v6

    goto/16 :goto_7

    :pswitch_6
    const-wide v18, 0x7fffffff7fffffffL

    iget-boolean v0, v2, Lm/i0;->s:Z

    iget-object v3, v2, Lm/i0;->m:Ljava/lang/Object;

    check-cast v3, Lfg/l;

    iget-object v4, v2, Lm/i0;->l:Ljava/lang/Object;

    check-cast v4, Lfg/a;

    iget-object v7, v2, Lm/i0;->k:Ljava/lang/Object;

    check-cast v7, Lfg/p;

    iget-object v9, v2, Lm/i0;->j:Ljava/lang/Object;

    check-cast v9, Lfg/q;

    iget-object v10, v2, Lm/i0;->i:Lsf/b;

    check-cast v10, Lm/p1;

    iget-object v11, v2, Lm/i0;->h:Ljava/lang/Object;

    check-cast v11, Ls1/t;

    iget-object v12, v2, Lm/i0;->g:Ljava/lang/Object;

    check-cast v12, Ls1/k0;

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    move-object/from16 v27, v10

    move-object v10, v3

    move-object/from16 v3, v27

    goto :goto_3

    :pswitch_7
    const-wide v18, 0x7fffffff7fffffffL

    invoke-static {v1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-virtual/range {p1 .. p1}, Ls1/t;->a()V

    .line 6
    :cond_1
    iput-object v0, v2, Lm/i0;->g:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v2, Lm/i0;->h:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v2, Lm/i0;->i:Lsf/b;

    move-object/from16 v4, p3

    iput-object v4, v2, Lm/i0;->j:Ljava/lang/Object;

    move-object/from16 v7, p4

    iput-object v7, v2, Lm/i0;->k:Ljava/lang/Object;

    move-object/from16 v9, p5

    iput-object v9, v2, Lm/i0;->l:Ljava/lang/Object;

    move-object/from16 v10, p6

    iput-object v10, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-boolean v1, v2, Lm/i0;->s:Z

    const/4 v11, 0x1

    iput v11, v2, Lm/i0;->v:I

    const/4 v11, 0x2

    invoke-static {v0, v2, v11}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v8, :cond_2

    :goto_2
    move-object v0, v8

    goto/16 :goto_27

    :cond_2
    move-object v11, v12

    move-object v12, v0

    move v0, v1

    move-object v1, v11

    move-object v11, v9

    move-object v9, v4

    move-object v4, v11

    move-object v11, v3

    const/4 v3, 0x0

    .line 7
    :goto_3
    check-cast v1, Ls1/t;

    .line 8
    new-instance v13, Lgg/t;

    .line 9
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    const-wide/16 v14, 0x0

    .line 10
    iput-wide v14, v13, Lgg/t;->g:J

    if-eqz v0, :cond_13

    .line 11
    :goto_4
    iget-wide v14, v1, Ls1/t;->a:J

    .line 12
    iget v0, v1, Ls1/t;->i:I

    .line 13
    iget-object v11, v12, Ls1/k0;->l:Ls1/l0;

    .line 14
    iget-object v11, v11, Ls1/l0;->z:Ls1/k;

    .line 15
    invoke-static {v11, v14, v15}, Lm/j0;->e(Ls1/k;J)Z

    move-result v11

    if-eqz v11, :cond_3

    move-object v11, v5

    move-object/from16 v23, v6

    move-object v0, v8

    :goto_5
    const/4 v5, 0x0

    goto/16 :goto_f

    .line 16
    :cond_3
    invoke-virtual {v12}, Ls1/k0;->B()Ly1/l2;

    move-result-object v11

    invoke-static {v11, v0}, Lm/j0;->f(Ly1/l2;I)F

    move-result v0

    .line 17
    new-instance v11, Lgg/t;

    .line 18
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-wide v14, v11, Lgg/t;->g:J

    .line 20
    new-instance v14, Lm/a3;

    move/from16 p0, v0

    move-object v15, v1

    const-wide/16 v0, 0x0

    invoke-direct {v14, v0, v1, v3}, Lm/a3;-><init>(JLm/p1;)V

    move/from16 v0, p0

    move-object v1, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    .line 21
    :goto_6
    iput-object v13, v2, Lm/i0;->g:Ljava/lang/Object;

    iput-object v3, v2, Lm/i0;->h:Ljava/lang/Object;

    iput-object v9, v2, Lm/i0;->i:Lsf/b;

    iput-object v7, v2, Lm/i0;->j:Ljava/lang/Object;

    iput-object v4, v2, Lm/i0;->k:Ljava/lang/Object;

    iput-object v10, v2, Lm/i0;->l:Ljava/lang/Object;

    iput-object v1, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-object v14, v2, Lm/i0;->n:Ljava/lang/Object;

    iput-object v12, v2, Lm/i0;->o:Ljava/lang/Object;

    iput-object v11, v2, Lm/i0;->p:Lgg/t;

    iput-object v15, v2, Lm/i0;->q:Lm/a3;

    move-object/from16 p0, v1

    const/4 v1, 0x0

    iput-object v1, v2, Lm/i0;->r:Ls1/t;

    iput v0, v2, Lm/i0;->t:F

    const/4 v1, 0x2

    iput v1, v2, Lm/i0;->v:I

    .line 22
    invoke-virtual {v12, v6, v2}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v23, v10

    move-object/from16 v10, p0

    move-object/from16 p0, v1

    move-object v1, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v11, v23

    goto/16 :goto_1

    .line 23
    :goto_7
    move-object/from16 v6, p0

    check-cast v6, Ls1/k;

    move-object/from16 v24, v8

    .line 24
    iget-object v8, v6, Ls1/k;->a:Ljava/lang/Object;

    move-object/from16 v25, v5

    .line 25
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v5

    move-object/from16 p0, v13

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v5, :cond_6

    .line 26
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    move/from16 p1, v5

    .line 27
    move-object/from16 v5, v26

    check-cast v5, Ls1/t;

    move-object/from16 p2, v10

    move-object/from16 p3, v11

    .line 28
    iget-wide v10, v5, Ls1/t;->a:J

    move-object/from16 p4, v4

    .line 29
    iget-wide v4, v12, Lgg/t;->g:J

    invoke-static {v10, v11, v4, v5}, Ls1/s;->e(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_9

    :cond_5
    add-int/lit8 v13, v13, 0x1

    move/from16 v5, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v4, p4

    goto :goto_8

    :cond_6
    move-object/from16 p4, v4

    move-object/from16 p2, v10

    move-object/from16 p3, v11

    const/16 v26, 0x0

    :goto_9
    move-object/from16 v4, v26

    check-cast v4, Ls1/t;

    if-nez v4, :cond_7

    :goto_a
    move-object/from16 v1, p2

    move-object/from16 v10, p3

    move-object/from16 v4, p4

    move-object v12, v14

    move-object v13, v15

    move-object/from16 v0, v24

    move-object/from16 v11, v25

    goto/16 :goto_5

    .line 30
    :cond_7
    invoke-virtual {v4}, Ls1/t;->b()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_a

    .line 31
    :cond_8
    invoke-static {v4}, Ls1/s;->d(Ls1/t;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 32
    iget-object v4, v6, Ls1/k;->a:Ljava/lang/Object;

    .line 33
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v5, :cond_a

    .line 34
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 35
    move-object v10, v8

    check-cast v10, Ls1/t;

    .line 36
    iget-boolean v10, v10, Ls1/t;->d:Z

    if-eqz v10, :cond_9

    goto :goto_c

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_a
    const/4 v8, 0x0

    .line 37
    :goto_c
    check-cast v8, Ls1/t;

    if-nez v8, :cond_b

    goto :goto_a

    .line 38
    :cond_b
    iget-wide v4, v8, Ls1/t;->a:J

    .line 39
    iput-wide v4, v12, Lgg/t;->g:J

    goto :goto_d

    :cond_c
    const/4 v11, 0x1

    .line 40
    invoke-static {v4, v11}, Ls1/s;->h(Ls1/t;Z)J

    move-result-wide v5

    .line 41
    invoke-virtual {v1, v5, v6, v0, v11}, Lm/a3;->a(JFZ)J

    move-result-wide v5

    and-long v10, v5, v18

    cmp-long v8, v10, v16

    if-eqz v8, :cond_e

    .line 42
    invoke-virtual {v4}, Ls1/t;->a()V

    .line 43
    iput-wide v5, v15, Lgg/t;->g:J

    .line 44
    invoke-virtual {v4}, Ls1/t;->b()Z

    move-result v5

    if-eqz v5, :cond_d

    move-object/from16 v1, p2

    move-object/from16 v10, p3

    move-object v5, v4

    move-object v12, v14

    move-object v13, v15

    move-object/from16 v0, v24

    move-object/from16 v11, v25

    move-object/from16 v4, p4

    goto/16 :goto_f

    :cond_d
    const-wide/16 v4, 0x0

    .line 45
    iput-wide v4, v1, Lm/a3;->b:J

    :goto_d
    move-object/from16 v10, p3

    move-object/from16 v4, p4

    move-object v11, v12

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v6, v23

    move-object/from16 v8, v24

    move-object/from16 v5, v25

    move-object/from16 v12, p0

    move-object v15, v1

    move-object/from16 v1, p2

    goto/16 :goto_6

    .line 46
    :cond_e
    iput-object v14, v2, Lm/i0;->g:Ljava/lang/Object;

    iput-object v3, v2, Lm/i0;->h:Ljava/lang/Object;

    iput-object v9, v2, Lm/i0;->i:Lsf/b;

    iput-object v7, v2, Lm/i0;->j:Ljava/lang/Object;

    move-object/from16 v5, p4

    iput-object v5, v2, Lm/i0;->k:Ljava/lang/Object;

    move-object/from16 v10, p3

    iput-object v10, v2, Lm/i0;->l:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-object v15, v2, Lm/i0;->n:Ljava/lang/Object;

    move-object/from16 v8, p0

    iput-object v8, v2, Lm/i0;->o:Ljava/lang/Object;

    iput-object v12, v2, Lm/i0;->p:Lgg/t;

    iput-object v1, v2, Lm/i0;->q:Lm/a3;

    iput-object v4, v2, Lm/i0;->r:Ls1/t;

    iput v0, v2, Lm/i0;->t:F

    const/4 v11, 0x3

    iput v11, v2, Lm/i0;->v:I

    move-object/from16 v11, v25

    invoke-virtual {v8, v11, v2}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v13

    move/from16 v25, v0

    move-object/from16 v0, v24

    if-ne v13, v0, :cond_f

    goto/16 :goto_27

    :cond_f
    move-object v13, v4

    move-object v4, v3

    move-object v3, v13

    move-object v13, v14

    move-object v14, v5

    move-object v5, v1

    move-object v1, v6

    .line 47
    :goto_e
    invoke-virtual {v3}, Ls1/t;->b()Z

    move-result v3

    if-eqz v3, :cond_12

    move-object v3, v4

    move-object v12, v13

    move-object v4, v14

    move-object v13, v15

    goto/16 :goto_5

    :goto_f
    if-eqz v5, :cond_11

    .line 48
    invoke-virtual {v5}, Ls1/t;->b()Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_10

    :cond_10
    move-object v8, v0

    move-object v5, v11

    move-object/from16 v6, v23

    goto/16 :goto_4

    :cond_11
    :goto_10
    move-object/from16 v27, v11

    move-object v11, v5

    move-object/from16 v5, v27

    goto :goto_11

    :cond_12
    move-object v3, v4

    move-object v4, v14

    move-object v14, v15

    move-object/from16 v6, v23

    move-object v15, v5

    move-object v5, v11

    move-object v11, v12

    move-object v12, v8

    move-object v8, v0

    move/from16 v0, v25

    goto/16 :goto_6

    :cond_13
    move-object/from16 v23, v6

    move-object v0, v8

    :goto_11
    if-nez v11, :cond_2a

    .line 49
    iget-object v6, v12, Ls1/k0;->l:Ls1/l0;

    .line 50
    iget-object v6, v6, Ls1/l0;->z:Ls1/k;

    .line 51
    iget-object v6, v6, Ls1/k;->a:Ljava/lang/Object;

    .line 52
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v14, 0x0

    :goto_12
    if-ge v14, v8, :cond_2a

    .line 53
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 54
    check-cast v15, Ls1/t;

    .line 55
    iget-boolean v15, v15, Ls1/t;->d:Z

    if-eqz v15, :cond_29

    move-object/from16 v27, v4

    move-object v4, v1

    move-object v1, v12

    move-object v12, v3

    move-object v3, v11

    move-object v11, v9

    move-object/from16 v9, v27

    move-object/from16 v27, v10

    move-object v10, v7

    move-object/from16 v7, v27

    .line 56
    :goto_13
    iput-object v1, v2, Lm/i0;->g:Ljava/lang/Object;

    iput-object v12, v2, Lm/i0;->h:Ljava/lang/Object;

    iput-object v11, v2, Lm/i0;->i:Lsf/b;

    iput-object v10, v2, Lm/i0;->j:Ljava/lang/Object;

    iput-object v9, v2, Lm/i0;->k:Ljava/lang/Object;

    iput-object v7, v2, Lm/i0;->l:Ljava/lang/Object;

    iput-object v4, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-object v3, v2, Lm/i0;->n:Ljava/lang/Object;

    iput-object v13, v2, Lm/i0;->o:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v2, Lm/i0;->p:Lgg/t;

    iput-object v6, v2, Lm/i0;->q:Lm/a3;

    iput-object v6, v2, Lm/i0;->r:Ls1/t;

    const/4 v6, 0x4

    iput v6, v2, Lm/i0;->v:I

    invoke-virtual {v1, v5, v2}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_14

    goto/16 :goto_27

    :cond_14
    move-object/from16 v27, v13

    move-object v13, v1

    move-object v1, v6

    move-object/from16 v6, v27

    .line 57
    :goto_14
    check-cast v1, Ls1/k;

    .line 58
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 59
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v14, 0x0

    :goto_15
    if-ge v14, v8, :cond_17

    .line 60
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 61
    check-cast v15, Ls1/t;

    .line 62
    invoke-virtual {v15}, Ls1/t;->b()Z

    move-result v15

    if-eqz v15, :cond_16

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v14, 0x0

    :goto_16
    if-ge v14, v8, :cond_17

    .line 64
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 65
    check-cast v15, Ls1/t;

    .line 66
    iget-boolean v15, v15, Ls1/t;->d:Z

    if-eqz v15, :cond_15

    move-object v1, v13

    move-object v13, v6

    goto :goto_13

    :cond_15
    add-int/lit8 v14, v14, 0x1

    goto :goto_16

    :cond_16
    add-int/lit8 v14, v14, 0x1

    goto :goto_15

    .line 67
    :cond_17
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v14, 0x0

    :goto_17
    if-ge v14, v8, :cond_28

    .line 68
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 69
    check-cast v15, Ls1/t;

    .line 70
    iget-boolean v15, v15, Ls1/t;->d:Z

    if-eqz v15, :cond_27

    .line 71
    invoke-static {v1}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t;

    if-eqz v1, :cond_18

    .line 72
    iget-wide v14, v1, Ls1/t;->c:J

    :goto_18
    move-object/from16 p0, v2

    goto :goto_19

    :cond_18
    const-wide/16 v14, 0x0

    goto :goto_18

    :goto_19
    iget-wide v1, v4, Ls1/t;->c:J

    .line 73
    invoke-static {v14, v15, v1, v2}, Le1/b;->d(JJ)J

    move-result-wide v1

    .line 74
    iget-wide v14, v4, Ls1/t;->a:J

    .line 75
    iget v3, v4, Ls1/t;->i:I

    .line 76
    iget-object v8, v13, Ls1/k0;->l:Ls1/l0;

    .line 77
    iget-object v8, v8, Ls1/l0;->z:Ls1/k;

    .line 78
    invoke-static {v8, v14, v15}, Lm/j0;->e(Ls1/k;J)Z

    move-result v8

    if-eqz v8, :cond_19

    move-object v1, v10

    move-object v10, v7

    move-object v7, v1

    move-object/from16 v2, p0

    move-object v1, v4

    move-object v4, v9

    move-object v3, v12

    move-object v12, v13

    move-object v9, v5

    move-object v13, v6

    const/4 v5, 0x0

    goto/16 :goto_24

    .line 79
    :cond_19
    invoke-virtual {v13}, Ls1/k0;->B()Ly1/l2;

    move-result-object v8

    invoke-static {v8, v3}, Lm/j0;->f(Ly1/l2;I)F

    move-result v3

    .line 80
    new-instance v8, Lgg/t;

    .line 81
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-wide v14, v8, Lgg/t;->g:J

    .line 83
    new-instance v14, Lm/a3;

    invoke-direct {v14, v1, v2, v12}, Lm/a3;-><init>(JLm/p1;)V

    move-object/from16 v2, p0

    move-object v1, v13

    .line 84
    :goto_1a
    iput-object v1, v2, Lm/i0;->g:Ljava/lang/Object;

    iput-object v12, v2, Lm/i0;->h:Ljava/lang/Object;

    iput-object v11, v2, Lm/i0;->i:Lsf/b;

    iput-object v10, v2, Lm/i0;->j:Ljava/lang/Object;

    iput-object v9, v2, Lm/i0;->k:Ljava/lang/Object;

    iput-object v7, v2, Lm/i0;->l:Ljava/lang/Object;

    iput-object v4, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-object v6, v2, Lm/i0;->n:Ljava/lang/Object;

    iput-object v13, v2, Lm/i0;->o:Ljava/lang/Object;

    iput-object v8, v2, Lm/i0;->p:Lgg/t;

    iput-object v14, v2, Lm/i0;->q:Lm/a3;

    const/4 v15, 0x0

    iput-object v15, v2, Lm/i0;->r:Ls1/t;

    iput v3, v2, Lm/i0;->t:F

    const/4 v15, 0x5

    iput v15, v2, Lm/i0;->v:I

    move-object/from16 v22, v1

    move-object/from16 v15, v23

    .line 85
    invoke-virtual {v13, v15, v2}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1a

    goto/16 :goto_27

    :cond_1a
    move-object/from16 p0, v1

    move-object v1, v14

    move-object/from16 v23, v15

    move-object v14, v13

    move-object v13, v10

    move-object v10, v4

    move v4, v3

    move-object v3, v2

    move-object/from16 v2, v22

    .line 86
    :goto_1b
    move-object/from16 v15, p0

    check-cast v15, Ls1/k;

    move-object/from16 v24, v0

    .line 87
    iget-object v0, v15, Ls1/k;->a:Ljava/lang/Object;

    move-object/from16 v25, v5

    .line 88
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v5

    move-object/from16 v22, v14

    const/4 v14, 0x0

    :goto_1c
    if-ge v14, v5, :cond_1c

    .line 89
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    move-object/from16 p0, v0

    .line 90
    move-object/from16 v0, v26

    check-cast v0, Ls1/t;

    move-object/from16 p2, v9

    move-object/from16 p1, v10

    .line 91
    iget-wide v9, v0, Ls1/t;->a:J

    move-object v0, v13

    move/from16 p3, v14

    .line 92
    iget-wide v13, v8, Lgg/t;->g:J

    invoke-static {v9, v10, v13, v14}, Ls1/s;->e(JJ)Z

    move-result v9

    if-eqz v9, :cond_1b

    goto :goto_1d

    :cond_1b
    add-int/lit8 v14, p3, 0x1

    move-object/from16 v10, p1

    move-object/from16 v9, p2

    move-object v13, v0

    move-object/from16 v0, p0

    goto :goto_1c

    :cond_1c
    move-object/from16 p2, v9

    move-object/from16 p1, v10

    move-object v0, v13

    const/16 v26, 0x0

    :goto_1d
    move-object/from16 v5, v26

    check-cast v5, Ls1/t;

    if-nez v5, :cond_1d

    :goto_1e
    move-object v1, v12

    move-object v12, v2

    move-object v2, v3

    move-object v3, v1

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object v13, v6

    move-object v10, v7

    move-object/from16 v9, v25

    const/4 v5, 0x0

    :goto_1f
    move-object v7, v0

    move-object/from16 v0, v24

    goto/16 :goto_24

    .line 93
    :cond_1d
    invoke-virtual {v5}, Ls1/t;->b()Z

    move-result v9

    if-eqz v9, :cond_1e

    goto :goto_1e

    .line 94
    :cond_1e
    invoke-static {v5}, Ls1/s;->d(Ls1/t;)Z

    move-result v9

    if-eqz v9, :cond_22

    .line 95
    iget-object v5, v15, Ls1/k;->a:Ljava/lang/Object;

    .line 96
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_20
    if-ge v10, v9, :cond_20

    .line 97
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 98
    move-object v14, v13

    check-cast v14, Ls1/t;

    .line 99
    iget-boolean v14, v14, Ls1/t;->d:Z

    if-eqz v14, :cond_1f

    goto :goto_21

    :cond_1f
    add-int/lit8 v10, v10, 0x1

    goto :goto_20

    :cond_20
    const/4 v13, 0x0

    .line 100
    :goto_21
    check-cast v13, Ls1/t;

    if-nez v13, :cond_21

    goto :goto_1e

    .line 101
    :cond_21
    iget-wide v9, v13, Ls1/t;->a:J

    .line 102
    iput-wide v9, v8, Lgg/t;->g:J

    const-wide/16 v9, 0x0

    goto :goto_22

    :cond_22
    const/4 v9, 0x1

    .line 103
    invoke-static {v5, v9}, Ls1/s;->h(Ls1/t;Z)J

    move-result-wide v13

    .line 104
    invoke-virtual {v1, v13, v14, v4, v9}, Lm/a3;->a(JFZ)J

    move-result-wide v13

    and-long v9, v13, v18

    cmp-long v9, v9, v16

    if-eqz v9, :cond_24

    .line 105
    invoke-virtual {v5}, Ls1/t;->a()V

    const/4 v9, 0x0

    .line 106
    invoke-static {v5, v9}, Ls1/s;->h(Ls1/t;Z)J

    move-result-wide v13

    .line 107
    iput-wide v13, v6, Lgg/t;->g:J

    .line 108
    invoke-virtual {v5}, Ls1/t;->b()Z

    move-result v9

    if-eqz v9, :cond_23

    move-object v1, v12

    move-object v12, v2

    move-object v2, v3

    move-object v3, v1

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object v13, v6

    move-object v10, v7

    move-object/from16 v9, v25

    goto :goto_1f

    :cond_23
    const-wide/16 v9, 0x0

    .line 109
    iput-wide v9, v1, Lm/a3;->b:J

    :goto_22
    move-object/from16 v9, p2

    move-object v10, v0

    move-object v14, v1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-object/from16 v13, v22

    move-object/from16 v0, v24

    move-object/from16 v5, v25

    move-object/from16 v4, p1

    goto/16 :goto_1a

    :cond_24
    const-wide/16 v9, 0x0

    .line 110
    iput-object v2, v3, Lm/i0;->g:Ljava/lang/Object;

    iput-object v12, v3, Lm/i0;->h:Ljava/lang/Object;

    iput-object v11, v3, Lm/i0;->i:Lsf/b;

    iput-object v0, v3, Lm/i0;->j:Ljava/lang/Object;

    move-object/from16 v13, p2

    iput-object v13, v3, Lm/i0;->k:Ljava/lang/Object;

    iput-object v7, v3, Lm/i0;->l:Ljava/lang/Object;

    move-object/from16 v14, p1

    iput-object v14, v3, Lm/i0;->m:Ljava/lang/Object;

    iput-object v6, v3, Lm/i0;->n:Ljava/lang/Object;

    move-object/from16 v15, v22

    iput-object v15, v3, Lm/i0;->o:Ljava/lang/Object;

    iput-object v8, v3, Lm/i0;->p:Lgg/t;

    iput-object v1, v3, Lm/i0;->q:Lm/a3;

    iput-object v5, v3, Lm/i0;->r:Ls1/t;

    iput v4, v3, Lm/i0;->t:F

    const/4 v9, 0x6

    iput v9, v3, Lm/i0;->v:I

    move-object/from16 v9, v25

    invoke-virtual {v15, v9, v3}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v0

    move-object/from16 v0, v24

    if-ne v10, v0, :cond_25

    goto/16 :goto_27

    :cond_25
    move-object v10, v5

    move-object v5, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v10

    move-object/from16 v10, v22

    .line 111
    :goto_23
    invoke-virtual {v3}, Ls1/t;->b()Z

    move-result v3

    if-eqz v3, :cond_26

    move-object v3, v10

    move-object v10, v7

    move-object v7, v3

    move-object v3, v12

    move-object v4, v13

    const/4 v5, 0x0

    move-object v12, v1

    move-object v13, v6

    move-object v1, v14

    :goto_24
    move-object/from16 v27, v11

    move-object v11, v5

    move-object v5, v9

    move-object/from16 v9, v27

    goto/16 :goto_11

    :cond_26
    move v3, v4

    move-object v4, v14

    move-object v14, v5

    move-object v5, v9

    move-object v9, v13

    move-object v13, v15

    goto/16 :goto_1a

    :cond_27
    move-object/from16 p0, v2

    move-object/from16 v25, v5

    const-wide/16 v20, 0x0

    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_17

    :cond_28
    move-object/from16 p0, v2

    const-wide/16 v20, 0x0

    move-object v1, v10

    move-object v10, v7

    move-object v7, v1

    move-object v1, v4

    move-object v4, v9

    move-object v9, v11

    move-object v11, v3

    move-object v3, v12

    move-object v12, v13

    move-object v13, v6

    goto/16 :goto_11

    :cond_29
    move-object/from16 v25, v5

    const-wide/16 v20, 0x0

    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_12

    :cond_2a
    if-eqz v11, :cond_39

    .line 112
    iget-wide v5, v13, Lgg/t;->g:J

    .line 113
    new-instance v3, Le1/b;

    invoke-direct {v3, v5, v6}, Le1/b;-><init>(J)V

    .line 114
    invoke-interface {v9, v1, v11, v3}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-wide v5, v13, Lgg/t;->g:J

    .line 116
    new-instance v1, Le1/b;

    invoke-direct {v1, v5, v6}, Le1/b;-><init>(J)V

    .line 117
    invoke-interface {v7, v11, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iget-wide v5, v11, Ls1/t;->a:J

    .line 119
    iget-object v1, v12, Ls1/k0;->l:Ls1/l0;

    .line 120
    iget-object v1, v1, Ls1/l0;->z:Ls1/k;

    .line 121
    invoke-static {v1, v5, v6}, Lm/j0;->e(Ls1/k;J)Z

    move-result v1

    if-eqz v1, :cond_2b

    const/4 v7, 0x0

    goto/16 :goto_31

    .line 122
    :cond_2b
    :goto_25
    new-instance v1, Lgg/t;

    .line 123
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-wide v5, v1, Lgg/t;->g:J

    move-object v9, v4

    move-object v5, v10

    move-object v3, v12

    move-object v4, v3

    move-object v10, v7

    .line 125
    :goto_26
    iput-object v10, v2, Lm/i0;->g:Ljava/lang/Object;

    iput-object v9, v2, Lm/i0;->h:Ljava/lang/Object;

    iput-object v5, v2, Lm/i0;->i:Lsf/b;

    iput-object v4, v2, Lm/i0;->j:Ljava/lang/Object;

    iput-object v3, v2, Lm/i0;->k:Ljava/lang/Object;

    iput-object v1, v2, Lm/i0;->l:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v2, Lm/i0;->m:Ljava/lang/Object;

    iput-object v15, v2, Lm/i0;->n:Ljava/lang/Object;

    iput-object v15, v2, Lm/i0;->o:Ljava/lang/Object;

    iput-object v15, v2, Lm/i0;->p:Lgg/t;

    iput-object v15, v2, Lm/i0;->q:Lm/a3;

    iput-object v15, v2, Lm/i0;->r:Ls1/t;

    const/4 v6, 0x7

    iput v6, v2, Lm/i0;->v:I

    move-object/from16 v6, v23

    .line 126
    invoke-virtual {v3, v6, v2}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_2c

    :goto_27
    return-object v0

    :cond_2c
    move-object/from16 v27, v2

    move-object v2, v1

    move-object v1, v7

    move-object v7, v5

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, v27

    .line 127
    :goto_28
    check-cast v1, Ls1/k;

    .line 128
    iget-object v8, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 129
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_29
    if-ge v12, v11, :cond_2e

    .line 130
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 131
    move-object v14, v13

    check-cast v14, Ls1/t;

    move-object/from16 p0, v3

    move-object/from16 p1, v4

    .line 132
    iget-wide v3, v14, Ls1/t;->a:J

    move-object/from16 p2, v5

    move-object/from16 v23, v6

    .line 133
    iget-wide v5, v2, Lgg/t;->g:J

    invoke-static {v3, v4, v5, v6}, Ls1/s;->e(JJ)Z

    move-result v3

    if-eqz v3, :cond_2d

    move-object v4, v13

    goto :goto_2a

    :cond_2d
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, v23

    goto :goto_29

    :cond_2e
    move-object/from16 p0, v3

    move-object/from16 p1, v4

    move-object/from16 p2, v5

    move-object/from16 v23, v6

    move-object v4, v15

    :goto_2a
    check-cast v4, Ls1/t;

    if-nez v4, :cond_2f

    move-object v4, v15

    :goto_2b
    const/4 v11, 0x1

    goto :goto_2f

    .line 134
    :cond_2f
    invoke-static {v4}, Ls1/s;->d(Ls1/t;)Z

    move-result v3

    if-eqz v3, :cond_33

    .line 135
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 136
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_2c
    if-ge v5, v3, :cond_31

    .line 137
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 138
    move-object v8, v6

    check-cast v8, Ls1/t;

    .line 139
    iget-boolean v8, v8, Ls1/t;->d:Z

    if-eqz v8, :cond_30

    goto :goto_2d

    :cond_30
    add-int/lit8 v5, v5, 0x1

    goto :goto_2c

    :cond_31
    move-object v6, v15

    .line 140
    :goto_2d
    check-cast v6, Ls1/t;

    if-nez v6, :cond_32

    goto :goto_2b

    .line 141
    :cond_32
    iget-wide v3, v6, Ls1/t;->a:J

    .line 142
    iput-wide v3, v2, Lgg/t;->g:J

    const/4 v11, 0x1

    goto :goto_2e

    :cond_33
    const/4 v11, 0x1

    .line 143
    invoke-static {v4, v11}, Ls1/s;->h(Ls1/t;Z)J

    move-result-wide v5

    .line 144
    invoke-static {v5, v6}, Le1/b;->c(J)F

    move-result v1

    const/4 v3, 0x0

    cmpg-float v1, v1, v3

    if-nez v1, :cond_34

    :goto_2e
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object v1, v2

    move-object v5, v7

    move-object/from16 v2, p0

    goto/16 :goto_26

    :cond_34
    :goto_2f
    if-nez v4, :cond_35

    :goto_30
    move-object v10, v7

    move-object v4, v9

    move-object v7, v15

    goto :goto_31

    .line 145
    :cond_35
    invoke-virtual {v4}, Ls1/t;->b()Z

    move-result v1

    if-eqz v1, :cond_36

    goto :goto_30

    .line 146
    :cond_36
    invoke-static {v4}, Ls1/s;->d(Ls1/t;)Z

    move-result v1

    if-eqz v1, :cond_38

    move-object v10, v7

    move-object v7, v4

    move-object v4, v9

    :goto_31
    if-nez v7, :cond_37

    .line 147
    invoke-interface {v4}, Lfg/a;->invoke()Ljava/lang/Object;

    goto :goto_32

    .line 148
    :cond_37
    invoke-interface {v10, v7}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_32

    :cond_38
    const/4 v1, 0x0

    .line 149
    invoke-static {v4, v1}, Ls1/s;->h(Ls1/t;Z)J

    move-result-wide v2

    .line 150
    new-instance v5, Le1/b;

    invoke-direct {v5, v2, v3}, Le1/b;-><init>(J)V

    .line 151
    invoke-interface {v10, v4, v5}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    invoke-virtual {v4}, Ls1/t;->a()V

    .line 153
    iget-wide v5, v4, Ls1/t;->a:J

    move-object v2, v10

    move-object v10, v7

    move-object v7, v2

    move-object/from16 v2, p0

    move-object/from16 v12, p2

    move-object v4, v9

    goto/16 :goto_25

    .line 154
    :cond_39
    :goto_32
    sget-object v0, Lsf/n;->a:Lsf/n;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
