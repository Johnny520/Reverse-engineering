.class public final Lb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltf/k;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lb/g;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    check-cast v0, Lb/g;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v1, v0, Lb/g;->b:Ly2/a;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ly2/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget-object v0, p0, Lb/f;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La1/a;

    .line 44
    .line 45
    invoke-virtual {v0}, La1/a;->run()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public b(Lp4/t;Ly1/t;Z)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lb/f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls1/d;

    .line 6
    .line 7
    iget-object v2, v1, Lb/f;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lx1/p;

    .line 10
    .line 11
    iget-boolean v3, v1, Lb/f;->a:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iput-boolean v3, v1, Lb/f;->a:Z

    .line 19
    .line 20
    iget-object v5, v1, Lb/f;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lm/a;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    invoke-virtual {v5, v6, v7}, Lm/a;->t(Lp4/t;Ly1/t;)Lh0/q0;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v5, Lh0/q0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Lf/p;

    .line 35
    .line 36
    invoke-virtual {v6}, Lf/p;->d()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v4

    .line 41
    :goto_0
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Lf/p;->e(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Ls1/t;

    .line 48
    .line 49
    iget-boolean v10, v9, Ls1/t;->d:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v9, Ls1/t;->h:Z

    .line 54
    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    :goto_1
    move v7, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v7, v3

    .line 67
    :goto_2
    invoke-virtual {v6}, Lf/p;->d()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    move v9, v4

    .line 72
    :goto_3
    if-ge v9, v8, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v9}, Lf/p;->e(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Ls1/t;

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    invoke-static {v10}, Ls1/s;->b(Ls1/t;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :cond_4
    iget-object v11, v1, Lb/f;->b:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    check-cast v12, Lx1/f0;

    .line 92
    .line 93
    iget-wide v13, v10, Ls1/t;->c:J

    .line 94
    .line 95
    iget-object v11, v1, Lb/f;->e:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v11

    .line 98
    check-cast v15, Lx1/p;

    .line 99
    .line 100
    iget v11, v10, Ls1/t;->i:I

    .line 101
    .line 102
    const/16 v17, 0x1

    .line 103
    .line 104
    move/from16 v16, v11

    .line 105
    .line 106
    invoke-virtual/range {v12 .. v17}, Lx1/f0;->z(JLx1/p;IZ)V

    .line 107
    .line 108
    .line 109
    iget-object v11, v2, Lx1/p;->g:Lf/f0;

    .line 110
    .line 111
    invoke-virtual {v11}, Lf/f0;->h()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    iget-wide v11, v10, Ls1/t;->a:J

    .line 118
    .line 119
    invoke-static {v10}, Ls1/s;->b(Ls1/t;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v0, v11, v12, v2, v10}, Ls1/d;->a(JLjava/util/List;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lx1/p;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move/from16 v2, p3

    .line 133
    .line 134
    invoke-virtual {v0, v5, v2}, Ls1/d;->b(Lh0/q0;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget-boolean v2, v5, Lh0/q0;->b:Z

    .line 139
    .line 140
    if-eqz v2, :cond_8

    .line 141
    .line 142
    :cond_7
    move v2, v4

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    invoke-virtual {v6}, Lf/p;->d()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    move v5, v4

    .line 149
    :goto_4
    if-ge v5, v2, :cond_7

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Lf/p;->e(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Ls1/t;

    .line 156
    .line 157
    invoke-static {v7, v3}, Ls1/s;->h(Ls1/t;Z)J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    const-wide/16 v10, 0x0

    .line 162
    .line 163
    invoke-static {v8, v9, v10, v11}, Le1/b;->b(JJ)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-nez v8, :cond_9

    .line 168
    .line 169
    invoke-virtual {v7}, Ls1/t;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_9

    .line 174
    .line 175
    move v2, v3

    .line 176
    goto :goto_5

    .line 177
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :goto_5
    invoke-virtual {v6}, Lf/p;->d()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    move v7, v4

    .line 185
    :goto_6
    if-ge v7, v5, :cond_b

    .line 186
    .line 187
    invoke-virtual {v6, v7}, Lf/p;->e(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    check-cast v8, Ls1/t;

    .line 192
    .line 193
    invoke-virtual {v8}, Ls1/t;->b()Z

    .line 194
    .line 195
    .line 196
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    if-eqz v8, :cond_a

    .line 198
    .line 199
    move v5, v3

    .line 200
    goto :goto_7

    .line 201
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_b
    move v5, v4

    .line 205
    :goto_7
    shl-int/2addr v2, v3

    .line 206
    or-int/2addr v0, v2

    .line 207
    shl-int/lit8 v2, v5, 0x2

    .line 208
    .line 209
    or-int/2addr v0, v2

    .line 210
    iput-boolean v4, v1, Lb/f;->a:Z

    .line 211
    .line 212
    return v0

    .line 213
    :goto_8
    iput-boolean v4, v1, Lb/f;->a:Z

    .line 214
    .line 215
    throw v0
.end method

.method public c(II)V
    .locals 3

    .line 1
    int-to-float v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    cmpl-float v0, v0, v1

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Index should be non-negative ("

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x29

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lo/b;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lb/f;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Li0/g1;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Li0/g1;->h(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lb/f;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ls/g0;

    .line 40
    .line 41
    iget v1, v0, Ls/g0;->h:I

    .line 42
    .line 43
    if-eq p1, v1, :cond_1

    .line 44
    .line 45
    iput p1, v0, Ls/g0;->h:I

    .line 46
    .line 47
    div-int/lit8 p1, p1, 0x1e

    .line 48
    .line 49
    mul-int/lit8 p1, p1, 0x1e

    .line 50
    .line 51
    add-int/lit8 v1, p1, -0x64

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/lit16 p1, p1, 0x82

    .line 59
    .line 60
    invoke-static {v1, p1}, Lr9/e0;->r0(II)Llg/d;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v0, v0, Ls/g0;->g:Li0/j1;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    iget-object p1, p0, Lb/f;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Li0/g1;

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Li0/g1;->h(I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public d()V
    .locals 7

    .line 1
    iget-object v0, p0, Lb/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltf/k;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    :cond_0
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lb/g;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move v0, v1

    .line 37
    :goto_0
    iget-object v3, p0, Lb/f;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Landroid/window/OnBackInvokedDispatcher;

    .line 40
    .line 41
    iget-object v4, p0, Lb/f;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Landroid/window/OnBackInvokedCallback;

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    sget-object v5, Lb/c;->a:Lb/c;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-boolean v6, p0, Lb/f;->a:Z

    .line 54
    .line 55
    if-nez v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v5, v3, v2, v4}, Lb/c;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-boolean v1, p0, Lb/f;->a:Z

    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    if-nez v0, :cond_3

    .line 64
    .line 65
    iget-boolean v0, p0, Lb/f;->a:Z

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {v5, v3, v4}, Lb/c;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-boolean v2, p0, Lb/f;->a:Z

    .line 73
    .line 74
    :cond_3
    return-void
.end method
