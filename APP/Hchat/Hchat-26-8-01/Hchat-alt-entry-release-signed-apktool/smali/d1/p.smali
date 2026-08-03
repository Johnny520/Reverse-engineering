.class public final Ld1/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld1/l;


# instance fields
.field public final a:Ly1/t;

.field public final b:Ly1/t;

.field public final c:Ld1/b0;

.field public final d:Ld1/i;

.field public final e:Ld1/m;

.field public f:Lf/a0;

.field public final g:Lf/f0;

.field public h:Ld1/b0;


# direct methods
.method public constructor <init>(Ly1/t;Ly1/t;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/p;->a:Ly1/t;

    .line 5
    .line 6
    iput-object p2, p0, Ld1/p;->b:Ly1/t;

    .line 7
    .line 8
    new-instance p1, Ld1/b0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {p1, v2, v0, v1}, Ld1/b0;-><init>(ILfg/p;I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ld1/p;->c:Ld1/b0;

    .line 18
    .line 19
    new-instance p1, Ld1/i;

    .line 20
    .line 21
    invoke-direct {p1, p0, p2}, Ld1/i;-><init>(Ld1/p;Ly1/t;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ld1/p;->d:Ld1/i;

    .line 25
    .line 26
    new-instance p1, Ld1/m;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Ld1/m;-><init>(Ld1/p;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ld1/p;->e:Ld1/m;

    .line 32
    .line 33
    new-instance p1, Lf/f0;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    invoke-direct {p1, p2}, Lf/f0;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ld1/p;->g:Lf/f0;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(Z)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1}, Ld1/p;->i(Ld1/b0;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_c

    .line 19
    .line 20
    sget-object v2, Ld1/z;->g:Ld1/z;

    .line 21
    .line 22
    sget-object v3, Ld1/z;->i:Ld1/z;

    .line 23
    .line 24
    invoke-virtual {p1, v2, v3}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p1, Ly0/n;->g:Ly0/n;

    .line 28
    .line 29
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-string v2, "visitAncestors called on an unattached node"

    .line 34
    .line 35
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v2, p1, Ly0/n;->g:Ly0/n;

    .line 39
    .line 40
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 41
    .line 42
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    if-eqz p1, :cond_c

    .line 47
    .line 48
    iget-object v4, p1, Lx1/f0;->L:Lx1/b1;

    .line 49
    .line 50
    iget-object v4, v4, Lx1/b1;->f:Ly0/n;

    .line 51
    .line 52
    iget v4, v4, Ly0/n;->j:I

    .line 53
    .line 54
    and-int/lit16 v4, v4, 0x400

    .line 55
    .line 56
    if-eqz v4, :cond_a

    .line 57
    .line 58
    :goto_1
    if-eqz v2, :cond_a

    .line 59
    .line 60
    iget v4, v2, Ly0/n;->i:I

    .line 61
    .line 62
    and-int/lit16 v4, v4, 0x400

    .line 63
    .line 64
    if-eqz v4, :cond_9

    .line 65
    .line 66
    move-object v5, v1

    .line 67
    move-object v4, v2

    .line 68
    :goto_2
    if-eqz v4, :cond_9

    .line 69
    .line 70
    instance-of v6, v4, Ld1/b0;

    .line 71
    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    check-cast v4, Ld1/b0;

    .line 75
    .line 76
    sget-object v6, Ld1/z;->h:Ld1/z;

    .line 77
    .line 78
    invoke-virtual {v4, v6, v3}, Ld1/b0;->l1(Ld1/z;Ld1/z;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_2
    iget v6, v4, Ly0/n;->i:I

    .line 83
    .line 84
    and-int/lit16 v6, v6, 0x400

    .line 85
    .line 86
    if-eqz v6, :cond_8

    .line 87
    .line 88
    instance-of v6, v4, Lx1/j;

    .line 89
    .line 90
    if-eqz v6, :cond_8

    .line 91
    .line 92
    move-object v6, v4

    .line 93
    check-cast v6, Lx1/j;

    .line 94
    .line 95
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    :goto_3
    if-eqz v6, :cond_7

    .line 99
    .line 100
    iget v8, v6, Ly0/n;->i:I

    .line 101
    .line 102
    and-int/lit16 v8, v8, 0x400

    .line 103
    .line 104
    if-eqz v8, :cond_6

    .line 105
    .line 106
    add-int/lit8 v7, v7, 0x1

    .line 107
    .line 108
    if-ne v7, v0, :cond_3

    .line 109
    .line 110
    move-object v4, v6

    .line 111
    goto :goto_4

    .line 112
    :cond_3
    if-nez v5, :cond_4

    .line 113
    .line 114
    new-instance v5, Lj0/b;

    .line 115
    .line 116
    const/16 v8, 0x10

    .line 117
    .line 118
    new-array v8, v8, [Ly0/n;

    .line 119
    .line 120
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    if-eqz v4, :cond_5

    .line 124
    .line 125
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v4, v1

    .line 129
    :cond_5
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    if-ne v7, v0, :cond_8

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_8
    :goto_5
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    goto :goto_2

    .line 143
    :cond_9
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_a
    invoke-virtual {p1}, Lx1/f0;->u()Lx1/f0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_b

    .line 151
    .line 152
    iget-object v2, p1, Lx1/f0;->L:Lx1/b1;

    .line 153
    .line 154
    if-eqz v2, :cond_b

    .line 155
    .line 156
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_b
    move-object v2, v1

    .line 160
    goto :goto_0

    .line 161
    :cond_c
    :goto_6
    return v0
.end method

.method public final b(IZZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, Ld1/p;->c:Ld1/b0;

    .line 5
    .line 6
    invoke-static {v1, p1}, Ld1/d;->t(Ld1/b0;I)Ld1/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    if-eq p1, p2, :cond_1

    .line 20
    .line 21
    const/4 p2, 0x3

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0, p2}, Ld1/p;->a(Z)Z

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {p0, p2}, Ld1/p;->a(Z)Z

    .line 37
    .line 38
    .line 39
    :goto_1
    if-eqz v0, :cond_4

    .line 40
    .line 41
    if-eqz p3, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Ld1/p;->c()V

    .line 44
    .line 45
    .line 46
    :cond_4
    return v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld1/p;->a:Ly1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void

    .line 35
    :cond_3
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final d(Landroid/view/KeyEvent;Lfg/a;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Ld1/p;->c:Ld1/b0;

    .line 2
    .line 3
    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Ld1/p;->d:Ld1/i;

    .line 9
    .line 10
    iget-boolean v1, v1, Ld1/i;->e:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p1, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 16
    .line 17
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_1e

    .line 28
    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ld1/p;->j(Landroid/view/KeyEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    :try_start_2
    invoke-static {v0}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    const-string v3, "visitAncestors called on an unattached node"

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v1, :cond_7

    .line 50
    .line 51
    :try_start_3
    iget-object v7, v1, Ly0/n;->g:Ly0/n;

    .line 52
    .line 53
    iget-boolean v7, v7, Ly0/n;->t:Z

    .line 54
    .line 55
    if-nez v7, :cond_2

    .line 56
    .line 57
    const-string v7, "visitLocalDescendants called on an unattached node"

    .line 58
    .line 59
    invoke-static {v7}, Lu1/a;->b(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v7, v1, Ly0/n;->g:Ly0/n;

    .line 63
    .line 64
    iget v8, v7, Ly0/n;->j:I

    .line 65
    .line 66
    and-int/lit16 v8, v8, 0x2400

    .line 67
    .line 68
    if-eqz v8, :cond_5

    .line 69
    .line 70
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 71
    .line 72
    move-object v8, v5

    .line 73
    :goto_0
    if-eqz v7, :cond_6

    .line 74
    .line 75
    iget v9, v7, Ly0/n;->i:I

    .line 76
    .line 77
    and-int/lit16 v10, v9, 0x2400

    .line 78
    .line 79
    if-eqz v10, :cond_4

    .line 80
    .line 81
    and-int/lit16 v9, v9, 0x400

    .line 82
    .line 83
    if-eqz v9, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object v8, v7

    .line 87
    :cond_4
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    move-object v8, v5

    .line 91
    :cond_6
    :goto_1
    if-nez v8, :cond_22

    .line 92
    .line 93
    :cond_7
    if-eqz v1, :cond_14

    .line 94
    .line 95
    iget-object v7, v1, Ly0/n;->g:Ly0/n;

    .line 96
    .line 97
    iget-boolean v7, v7, Ly0/n;->t:Z

    .line 98
    .line 99
    if-nez v7, :cond_8

    .line 100
    .line 101
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    iget-object v7, v1, Ly0/n;->g:Ly0/n;

    .line 105
    .line 106
    invoke-static {v1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_2
    if-eqz v1, :cond_13

    .line 111
    .line 112
    iget-object v8, v1, Lx1/f0;->L:Lx1/b1;

    .line 113
    .line 114
    iget-object v8, v8, Lx1/b1;->f:Ly0/n;

    .line 115
    .line 116
    iget v8, v8, Ly0/n;->j:I

    .line 117
    .line 118
    and-int/lit16 v8, v8, 0x2000

    .line 119
    .line 120
    if-eqz v8, :cond_11

    .line 121
    .line 122
    :goto_3
    if-eqz v7, :cond_11

    .line 123
    .line 124
    iget v8, v7, Ly0/n;->i:I

    .line 125
    .line 126
    and-int/lit16 v8, v8, 0x2000

    .line 127
    .line 128
    if-eqz v8, :cond_10

    .line 129
    .line 130
    move-object v9, v5

    .line 131
    move-object v8, v7

    .line 132
    :goto_4
    if-eqz v8, :cond_10

    .line 133
    .line 134
    instance-of v10, v8, Lq1/e;

    .line 135
    .line 136
    if-eqz v10, :cond_9

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_9
    iget v10, v8, Ly0/n;->i:I

    .line 140
    .line 141
    and-int/lit16 v10, v10, 0x2000

    .line 142
    .line 143
    if-eqz v10, :cond_f

    .line 144
    .line 145
    instance-of v10, v8, Lx1/j;

    .line 146
    .line 147
    if-eqz v10, :cond_f

    .line 148
    .line 149
    move-object v10, v8

    .line 150
    check-cast v10, Lx1/j;

    .line 151
    .line 152
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 153
    .line 154
    move v11, v2

    .line 155
    :goto_5
    if-eqz v10, :cond_e

    .line 156
    .line 157
    iget v12, v10, Ly0/n;->i:I

    .line 158
    .line 159
    and-int/lit16 v12, v12, 0x2000

    .line 160
    .line 161
    if-eqz v12, :cond_d

    .line 162
    .line 163
    add-int/lit8 v11, v11, 0x1

    .line 164
    .line 165
    if-ne v11, v6, :cond_a

    .line 166
    .line 167
    move-object v8, v10

    .line 168
    goto :goto_6

    .line 169
    :cond_a
    if-nez v9, :cond_b

    .line 170
    .line 171
    new-instance v9, Lj0/b;

    .line 172
    .line 173
    new-array v12, v4, [Ly0/n;

    .line 174
    .line 175
    invoke-direct {v9, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    if-eqz v8, :cond_c

    .line 179
    .line 180
    invoke-virtual {v9, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object v8, v5

    .line 184
    :cond_c
    invoke-virtual {v9, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_d
    :goto_6
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_e
    if-ne v11, v6, :cond_f

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_f
    invoke-static {v9}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    goto :goto_4

    .line 198
    :cond_10
    iget-object v7, v7, Ly0/n;->k:Ly0/n;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_11
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-eqz v1, :cond_12

    .line 206
    .line 207
    iget-object v7, v1, Lx1/f0;->L:Lx1/b1;

    .line 208
    .line 209
    if-eqz v7, :cond_12

    .line 210
    .line 211
    iget-object v7, v7, Lx1/b1;->e:Lx1/b2;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_12
    move-object v7, v5

    .line 215
    goto :goto_2

    .line 216
    :cond_13
    move-object v8, v5

    .line 217
    :goto_7
    check-cast v8, Lq1/e;

    .line 218
    .line 219
    if-eqz v8, :cond_14

    .line 220
    .line 221
    check-cast v8, Ly0/n;

    .line 222
    .line 223
    iget-object v8, v8, Ly0/n;->g:Ly0/n;

    .line 224
    .line 225
    goto/16 :goto_e

    .line 226
    .line 227
    :cond_14
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 228
    .line 229
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 230
    .line 231
    if-nez v1, :cond_15

    .line 232
    .line 233
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_15
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 237
    .line 238
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 239
    .line 240
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :goto_8
    if-eqz v0, :cond_20

    .line 245
    .line 246
    iget-object v7, v0, Lx1/f0;->L:Lx1/b1;

    .line 247
    .line 248
    iget-object v7, v7, Lx1/b1;->f:Ly0/n;

    .line 249
    .line 250
    iget v7, v7, Ly0/n;->j:I

    .line 251
    .line 252
    and-int/lit16 v7, v7, 0x2000

    .line 253
    .line 254
    if-eqz v7, :cond_1e

    .line 255
    .line 256
    :goto_9
    if-eqz v1, :cond_1e

    .line 257
    .line 258
    iget v7, v1, Ly0/n;->i:I

    .line 259
    .line 260
    and-int/lit16 v7, v7, 0x2000

    .line 261
    .line 262
    if-eqz v7, :cond_1d

    .line 263
    .line 264
    move-object v7, v1

    .line 265
    move-object v8, v5

    .line 266
    :goto_a
    if-eqz v7, :cond_1d

    .line 267
    .line 268
    instance-of v9, v7, Lq1/e;

    .line 269
    .line 270
    if-eqz v9, :cond_16

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :cond_16
    iget v9, v7, Ly0/n;->i:I

    .line 274
    .line 275
    and-int/lit16 v9, v9, 0x2000

    .line 276
    .line 277
    if-eqz v9, :cond_1c

    .line 278
    .line 279
    instance-of v9, v7, Lx1/j;

    .line 280
    .line 281
    if-eqz v9, :cond_1c

    .line 282
    .line 283
    move-object v9, v7

    .line 284
    check-cast v9, Lx1/j;

    .line 285
    .line 286
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 287
    .line 288
    move v10, v2

    .line 289
    :goto_b
    if-eqz v9, :cond_1b

    .line 290
    .line 291
    iget v11, v9, Ly0/n;->i:I

    .line 292
    .line 293
    and-int/lit16 v11, v11, 0x2000

    .line 294
    .line 295
    if-eqz v11, :cond_1a

    .line 296
    .line 297
    add-int/lit8 v10, v10, 0x1

    .line 298
    .line 299
    if-ne v10, v6, :cond_17

    .line 300
    .line 301
    move-object v7, v9

    .line 302
    goto :goto_c

    .line 303
    :cond_17
    if-nez v8, :cond_18

    .line 304
    .line 305
    new-instance v8, Lj0/b;

    .line 306
    .line 307
    new-array v11, v4, [Ly0/n;

    .line 308
    .line 309
    invoke-direct {v8, v11}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_18
    if-eqz v7, :cond_19

    .line 313
    .line 314
    invoke-virtual {v8, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    move-object v7, v5

    .line 318
    :cond_19
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_1a
    :goto_c
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_1b
    if-ne v10, v6, :cond_1c

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_1c
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    goto :goto_a

    .line 332
    :cond_1d
    iget-object v1, v1, Ly0/n;->k:Ly0/n;

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_1e
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_1f

    .line 340
    .line 341
    iget-object v1, v0, Lx1/f0;->L:Lx1/b1;

    .line 342
    .line 343
    if-eqz v1, :cond_1f

    .line 344
    .line 345
    iget-object v1, v1, Lx1/b1;->e:Lx1/b2;

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_1f
    move-object v1, v5

    .line 349
    goto :goto_8

    .line 350
    :cond_20
    move-object v7, v5

    .line 351
    :goto_d
    check-cast v7, Lq1/e;

    .line 352
    .line 353
    if-eqz v7, :cond_21

    .line 354
    .line 355
    check-cast v7, Ly0/n;

    .line 356
    .line 357
    iget-object v8, v7, Ly0/n;->g:Ly0/n;

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_21
    move-object v8, v5

    .line 361
    :cond_22
    :goto_e
    if-eqz v8, :cond_45

    .line 362
    .line 363
    iget-object v0, v8, Ly0/n;->g:Ly0/n;

    .line 364
    .line 365
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 366
    .line 367
    if-nez v0, :cond_23

    .line 368
    .line 369
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :cond_23
    iget-object v0, v8, Ly0/n;->g:Ly0/n;

    .line 373
    .line 374
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 375
    .line 376
    invoke-static {v8}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    move-object v3, v5

    .line 381
    :goto_f
    if-eqz v1, :cond_2f

    .line 382
    .line 383
    iget-object v7, v1, Lx1/f0;->L:Lx1/b1;

    .line 384
    .line 385
    iget-object v7, v7, Lx1/b1;->f:Ly0/n;

    .line 386
    .line 387
    iget v7, v7, Ly0/n;->j:I

    .line 388
    .line 389
    and-int/lit16 v7, v7, 0x2000

    .line 390
    .line 391
    if-eqz v7, :cond_2d

    .line 392
    .line 393
    :goto_10
    if-eqz v0, :cond_2d

    .line 394
    .line 395
    iget v7, v0, Ly0/n;->i:I

    .line 396
    .line 397
    and-int/lit16 v7, v7, 0x2000

    .line 398
    .line 399
    if-eqz v7, :cond_2c

    .line 400
    .line 401
    move-object v7, v0

    .line 402
    move-object v9, v5

    .line 403
    :goto_11
    if-eqz v7, :cond_2c

    .line 404
    .line 405
    instance-of v10, v7, Lq1/e;

    .line 406
    .line 407
    if-eqz v10, :cond_25

    .line 408
    .line 409
    if-nez v3, :cond_24

    .line 410
    .line 411
    new-instance v3, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    :cond_24
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move v10, v2

    .line 420
    goto :goto_12

    .line 421
    :cond_25
    move v10, v6

    .line 422
    :goto_12
    if-eqz v10, :cond_2b

    .line 423
    .line 424
    iget v10, v7, Ly0/n;->i:I

    .line 425
    .line 426
    and-int/lit16 v10, v10, 0x2000

    .line 427
    .line 428
    if-eqz v10, :cond_2b

    .line 429
    .line 430
    instance-of v10, v7, Lx1/j;

    .line 431
    .line 432
    if-eqz v10, :cond_2b

    .line 433
    .line 434
    move-object v10, v7

    .line 435
    check-cast v10, Lx1/j;

    .line 436
    .line 437
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 438
    .line 439
    move v11, v2

    .line 440
    :goto_13
    if-eqz v10, :cond_2a

    .line 441
    .line 442
    iget v12, v10, Ly0/n;->i:I

    .line 443
    .line 444
    and-int/lit16 v12, v12, 0x2000

    .line 445
    .line 446
    if-eqz v12, :cond_29

    .line 447
    .line 448
    add-int/lit8 v11, v11, 0x1

    .line 449
    .line 450
    if-ne v11, v6, :cond_26

    .line 451
    .line 452
    move-object v7, v10

    .line 453
    goto :goto_14

    .line 454
    :cond_26
    if-nez v9, :cond_27

    .line 455
    .line 456
    new-instance v9, Lj0/b;

    .line 457
    .line 458
    new-array v12, v4, [Ly0/n;

    .line 459
    .line 460
    invoke-direct {v9, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    :cond_27
    if-eqz v7, :cond_28

    .line 464
    .line 465
    invoke-virtual {v9, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    move-object v7, v5

    .line 469
    :cond_28
    invoke-virtual {v9, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :cond_29
    :goto_14
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 473
    .line 474
    goto :goto_13

    .line 475
    :cond_2a
    if-ne v11, v6, :cond_2b

    .line 476
    .line 477
    goto :goto_11

    .line 478
    :cond_2b
    invoke-static {v9}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    goto :goto_11

    .line 483
    :cond_2c
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_2d
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    if-eqz v1, :cond_2e

    .line 491
    .line 492
    iget-object v0, v1, Lx1/f0;->L:Lx1/b1;

    .line 493
    .line 494
    if-eqz v0, :cond_2e

    .line 495
    .line 496
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 497
    .line 498
    goto :goto_f

    .line 499
    :cond_2e
    move-object v0, v5

    .line 500
    goto :goto_f

    .line 501
    :cond_2f
    if-eqz v3, :cond_32

    .line 502
    .line 503
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    add-int/lit8 v0, v0, -0x1

    .line 508
    .line 509
    if-ltz v0, :cond_32

    .line 510
    .line 511
    :goto_15
    add-int/lit8 v1, v0, -0x1

    .line 512
    .line 513
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Lq1/e;

    .line 518
    .line 519
    invoke-interface {v0, p1}, Lq1/e;->C(Landroid/view/KeyEvent;)Z

    .line 520
    .line 521
    .line 522
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 523
    if-eqz v0, :cond_30

    .line 524
    .line 525
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 526
    .line 527
    .line 528
    return v6

    .line 529
    :cond_30
    if-gez v1, :cond_31

    .line 530
    .line 531
    goto :goto_16

    .line 532
    :cond_31
    move v0, v1

    .line 533
    goto :goto_15

    .line 534
    :cond_32
    :goto_16
    :try_start_4
    iget-object v0, v8, Ly0/n;->g:Ly0/n;

    .line 535
    .line 536
    move-object v1, v5

    .line 537
    :goto_17
    if-eqz v0, :cond_3a

    .line 538
    .line 539
    instance-of v7, v0, Lq1/e;

    .line 540
    .line 541
    if-eqz v7, :cond_33

    .line 542
    .line 543
    check-cast v0, Lq1/e;

    .line 544
    .line 545
    invoke-interface {v0, p1}, Lq1/e;->C(Landroid/view/KeyEvent;)Z

    .line 546
    .line 547
    .line 548
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 549
    if-eqz v0, :cond_39

    .line 550
    .line 551
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 552
    .line 553
    .line 554
    return v6

    .line 555
    :cond_33
    :try_start_5
    iget v7, v0, Ly0/n;->i:I

    .line 556
    .line 557
    and-int/lit16 v7, v7, 0x2000

    .line 558
    .line 559
    if-eqz v7, :cond_39

    .line 560
    .line 561
    instance-of v7, v0, Lx1/j;

    .line 562
    .line 563
    if-eqz v7, :cond_39

    .line 564
    .line 565
    move-object v7, v0

    .line 566
    check-cast v7, Lx1/j;

    .line 567
    .line 568
    iget-object v7, v7, Lx1/j;->v:Ly0/n;

    .line 569
    .line 570
    move v9, v2

    .line 571
    :goto_18
    if-eqz v7, :cond_38

    .line 572
    .line 573
    iget v10, v7, Ly0/n;->i:I

    .line 574
    .line 575
    and-int/lit16 v10, v10, 0x2000

    .line 576
    .line 577
    if-eqz v10, :cond_37

    .line 578
    .line 579
    add-int/lit8 v9, v9, 0x1

    .line 580
    .line 581
    if-ne v9, v6, :cond_34

    .line 582
    .line 583
    move-object v0, v7

    .line 584
    goto :goto_19

    .line 585
    :cond_34
    if-nez v1, :cond_35

    .line 586
    .line 587
    new-instance v1, Lj0/b;

    .line 588
    .line 589
    new-array v10, v4, [Ly0/n;

    .line 590
    .line 591
    invoke-direct {v1, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    :cond_35
    if-eqz v0, :cond_36

    .line 595
    .line 596
    invoke-virtual {v1, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    move-object v0, v5

    .line 600
    :cond_36
    invoke-virtual {v1, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    :cond_37
    :goto_19
    iget-object v7, v7, Ly0/n;->l:Ly0/n;

    .line 604
    .line 605
    goto :goto_18

    .line 606
    :cond_38
    if-ne v9, v6, :cond_39

    .line 607
    .line 608
    goto :goto_17

    .line 609
    :cond_39
    invoke-static {v1}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    goto :goto_17

    .line 614
    :cond_3a
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object p2

    .line 618
    check-cast p2, Ljava/lang/Boolean;

    .line 619
    .line 620
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 621
    .line 622
    .line 623
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 624
    if-eqz p2, :cond_3b

    .line 625
    .line 626
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 627
    .line 628
    .line 629
    return v6

    .line 630
    :cond_3b
    :try_start_6
    iget-object p2, v8, Ly0/n;->g:Ly0/n;

    .line 631
    .line 632
    move-object v0, v5

    .line 633
    :goto_1a
    if-eqz p2, :cond_43

    .line 634
    .line 635
    instance-of v1, p2, Lq1/e;

    .line 636
    .line 637
    if-eqz v1, :cond_3c

    .line 638
    .line 639
    check-cast p2, Lq1/e;

    .line 640
    .line 641
    invoke-interface {p2, p1}, Lq1/e;->W(Landroid/view/KeyEvent;)Z

    .line 642
    .line 643
    .line 644
    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 645
    if-eqz p2, :cond_42

    .line 646
    .line 647
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 648
    .line 649
    .line 650
    return v6

    .line 651
    :cond_3c
    :try_start_7
    iget v1, p2, Ly0/n;->i:I

    .line 652
    .line 653
    and-int/lit16 v1, v1, 0x2000

    .line 654
    .line 655
    if-eqz v1, :cond_42

    .line 656
    .line 657
    instance-of v1, p2, Lx1/j;

    .line 658
    .line 659
    if-eqz v1, :cond_42

    .line 660
    .line 661
    move-object v1, p2

    .line 662
    check-cast v1, Lx1/j;

    .line 663
    .line 664
    iget-object v1, v1, Lx1/j;->v:Ly0/n;

    .line 665
    .line 666
    move v7, v2

    .line 667
    :goto_1b
    if-eqz v1, :cond_41

    .line 668
    .line 669
    iget v8, v1, Ly0/n;->i:I

    .line 670
    .line 671
    and-int/lit16 v8, v8, 0x2000

    .line 672
    .line 673
    if-eqz v8, :cond_40

    .line 674
    .line 675
    add-int/lit8 v7, v7, 0x1

    .line 676
    .line 677
    if-ne v7, v6, :cond_3d

    .line 678
    .line 679
    move-object p2, v1

    .line 680
    goto :goto_1c

    .line 681
    :cond_3d
    if-nez v0, :cond_3e

    .line 682
    .line 683
    new-instance v0, Lj0/b;

    .line 684
    .line 685
    new-array v8, v4, [Ly0/n;

    .line 686
    .line 687
    invoke-direct {v0, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    :cond_3e
    if-eqz p2, :cond_3f

    .line 691
    .line 692
    invoke-virtual {v0, p2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    move-object p2, v5

    .line 696
    :cond_3f
    invoke-virtual {v0, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    :cond_40
    :goto_1c
    iget-object v1, v1, Ly0/n;->l:Ly0/n;

    .line 700
    .line 701
    goto :goto_1b

    .line 702
    :cond_41
    if-ne v7, v6, :cond_42

    .line 703
    .line 704
    goto :goto_1a

    .line 705
    :cond_42
    invoke-static {v0}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 706
    .line 707
    .line 708
    move-result-object p2

    .line 709
    goto :goto_1a

    .line 710
    :cond_43
    if-eqz v3, :cond_45

    .line 711
    .line 712
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 713
    .line 714
    .line 715
    move-result p2

    .line 716
    move v0, v2

    .line 717
    :goto_1d
    if-ge v0, p2, :cond_45

    .line 718
    .line 719
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    check-cast v1, Lq1/e;

    .line 724
    .line 725
    invoke-interface {v1, p1}, Lq1/e;->W(Landroid/view/KeyEvent;)Z

    .line 726
    .line 727
    .line 728
    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 729
    if-eqz v1, :cond_44

    .line 730
    .line 731
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 732
    .line 733
    .line 734
    return v6

    .line 735
    :cond_44
    add-int/lit8 v0, v0, 0x1

    .line 736
    .line 737
    goto :goto_1d

    .line 738
    :cond_45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 739
    .line 740
    .line 741
    return v2

    .line 742
    :goto_1e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 743
    .line 744
    .line 745
    throw p1
.end method

.method public final e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;
    .locals 19

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
    iget-object v4, v0, Ld1/p;->c:Ld1/b0;

    .line 10
    .line 11
    invoke-static {v4}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x6

    .line 18
    const/4 v10, 0x5

    .line 19
    const/4 v11, 0x2

    .line 20
    iget-object v13, v0, Ld1/p;->b:Ly1/t;

    .line 21
    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    if-eqz v5, :cond_25

    .line 28
    .line 29
    invoke-virtual {v13}, Ly1/t;->getLayoutDirection()Lu2/m;

    .line 30
    .line 31
    .line 32
    move-result-object v18

    .line 33
    invoke-virtual {v5}, Ld1/b0;->m1()Ld1/t;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    iget-object v6, v14, Ld1/t;->h:Ld1/v;

    .line 38
    .line 39
    iget-object v12, v14, Ld1/t;->i:Ld1/v;

    .line 40
    .line 41
    if-ne v1, v15, :cond_0

    .line 42
    .line 43
    iget-object v6, v14, Ld1/t;->b:Ld1/v;

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_0
    if-ne v1, v11, :cond_1

    .line 48
    .line 49
    iget-object v6, v14, Ld1/t;->c:Ld1/v;

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    if-ne v1, v10, :cond_2

    .line 54
    .line 55
    iget-object v6, v14, Ld1/t;->d:Ld1/v;

    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_2
    if-ne v1, v9, :cond_3

    .line 60
    .line 61
    iget-object v6, v14, Ld1/t;->e:Ld1/v;

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    if-ne v1, v8, :cond_7

    .line 66
    .line 67
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_5

    .line 72
    .line 73
    if-ne v9, v15, :cond_4

    .line 74
    .line 75
    move-object v6, v12

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {}, Lokio/a;->k()V

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    return-object v1

    .line 82
    :cond_5
    :goto_0
    sget-object v9, Ld1/v;->b:Ld1/v;

    .line 83
    .line 84
    if-ne v6, v9, :cond_6

    .line 85
    .line 86
    move-object/from16 v6, v17

    .line 87
    .line 88
    :cond_6
    if-nez v6, :cond_10

    .line 89
    .line 90
    iget-object v6, v14, Ld1/t;->f:Ld1/v;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    if-ne v1, v7, :cond_b

    .line 94
    .line 95
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_9

    .line 100
    .line 101
    if-ne v9, v15, :cond_8

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_8
    invoke-static {}, Lokio/a;->k()V

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    return-object v1

    .line 109
    :cond_9
    move-object v6, v12

    .line 110
    :goto_1
    sget-object v9, Ld1/v;->b:Ld1/v;

    .line 111
    .line 112
    if-ne v6, v9, :cond_a

    .line 113
    .line 114
    move-object/from16 v6, v17

    .line 115
    .line 116
    :cond_a
    if-nez v6, :cond_10

    .line 117
    .line 118
    iget-object v6, v14, Ld1/t;->g:Ld1/v;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_b
    const/4 v6, 0x7

    .line 122
    if-ne v1, v6, :cond_c

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_c
    const/16 v9, 0x8

    .line 126
    .line 127
    if-ne v1, v9, :cond_24

    .line 128
    .line 129
    :goto_2
    new-instance v9, Ld1/a;

    .line 130
    .line 131
    invoke-direct {v9, v1}, Ld1/a;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v5}, Lx1/k;->x(Lx1/i;)Lx1/r1;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    check-cast v12, Ly1/t;

    .line 139
    .line 140
    invoke-virtual {v12}, Ly1/t;->getFocusOwner()Ld1/l;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    check-cast v12, Ld1/p;

    .line 145
    .line 146
    invoke-virtual {v12}, Ld1/p;->f()Ld1/b0;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    if-ne v1, v6, :cond_d

    .line 151
    .line 152
    iget-object v6, v14, Ld1/t;->j:Lgg/m;

    .line 153
    .line 154
    invoke-interface {v6, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_d
    iget-object v6, v14, Ld1/t;->k:Lgg/m;

    .line 159
    .line 160
    invoke-interface {v6, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :goto_3
    iget-boolean v6, v9, Ld1/a;->b:Z

    .line 164
    .line 165
    if-eqz v6, :cond_e

    .line 166
    .line 167
    sget-object v6, Ld1/v;->c:Ld1/v;

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_e
    invoke-virtual {v12}, Ld1/p;->f()Ld1/b0;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-eq v10, v6, :cond_f

    .line 175
    .line 176
    sget-object v6, Ld1/v;->d:Ld1/v;

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_f
    sget-object v6, Ld1/v;->b:Ld1/v;

    .line 180
    .line 181
    :cond_10
    :goto_4
    sget-object v9, Ld1/v;->c:Ld1/v;

    .line 182
    .line 183
    invoke-static {v6, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-eqz v10, :cond_11

    .line 188
    .line 189
    goto/16 :goto_11

    .line 190
    .line 191
    :cond_11
    sget-object v10, Ld1/v;->d:Ld1/v;

    .line 192
    .line 193
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-eqz v10, :cond_12

    .line 198
    .line 199
    invoke-static {v4}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-eqz v1, :cond_31

    .line 204
    .line 205
    invoke-interface {v3, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Ljava/lang/Boolean;

    .line 210
    .line 211
    return-object v1

    .line 212
    :cond_12
    sget-object v10, Ld1/v;->b:Ld1/v;

    .line 213
    .line 214
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    if-nez v12, :cond_26

    .line 219
    .line 220
    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 221
    .line 222
    if-eq v6, v10, :cond_23

    .line 223
    .line 224
    if-eq v6, v9, :cond_22

    .line 225
    .line 226
    iget-object v1, v6, Ld1/v;->a:Lj0/b;

    .line 227
    .line 228
    iget v2, v1, Lj0/b;->i:I

    .line 229
    .line 230
    if-nez v2, :cond_13

    .line 231
    .line 232
    const-string v1, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 233
    .line 234
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 235
    .line 236
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_c

    .line 240
    .line 241
    :cond_13
    iget-object v1, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 242
    .line 243
    move/from16 v4, v16

    .line 244
    .line 245
    move v5, v4

    .line 246
    :goto_5
    if-ge v4, v2, :cond_21

    .line 247
    .line 248
    aget-object v6, v1, v4

    .line 249
    .line 250
    check-cast v6, Ld1/x;

    .line 251
    .line 252
    check-cast v6, Ly0/n;

    .line 253
    .line 254
    iget-object v7, v6, Ly0/n;->g:Ly0/n;

    .line 255
    .line 256
    iget-boolean v7, v7, Ly0/n;->t:Z

    .line 257
    .line 258
    if-nez v7, :cond_14

    .line 259
    .line 260
    const-string v7, "visitChildren called on an unattached node"

    .line 261
    .line 262
    invoke-static {v7}, Lu1/a;->b(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_14
    new-instance v7, Lj0/b;

    .line 266
    .line 267
    const/16 v8, 0x10

    .line 268
    .line 269
    new-array v9, v8, [Ly0/n;

    .line 270
    .line 271
    invoke-direct {v7, v9}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v6, v6, Ly0/n;->g:Ly0/n;

    .line 275
    .line 276
    iget-object v8, v6, Ly0/n;->l:Ly0/n;

    .line 277
    .line 278
    if-nez v8, :cond_15

    .line 279
    .line 280
    invoke-static {v7, v6}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_15
    invoke-virtual {v7, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_16
    :goto_6
    iget v6, v7, Lj0/b;->i:I

    .line 288
    .line 289
    if-eqz v6, :cond_20

    .line 290
    .line 291
    add-int/lit8 v6, v6, -0x1

    .line 292
    .line 293
    invoke-virtual {v7, v6}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    check-cast v6, Ly0/n;

    .line 298
    .line 299
    iget v8, v6, Ly0/n;->j:I

    .line 300
    .line 301
    and-int/lit16 v8, v8, 0x400

    .line 302
    .line 303
    if-nez v8, :cond_17

    .line 304
    .line 305
    invoke-static {v7, v6}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_17
    :goto_7
    if-eqz v6, :cond_16

    .line 310
    .line 311
    iget v8, v6, Ly0/n;->i:I

    .line 312
    .line 313
    and-int/lit16 v8, v8, 0x400

    .line 314
    .line 315
    if-eqz v8, :cond_1f

    .line 316
    .line 317
    move-object/from16 v8, v17

    .line 318
    .line 319
    :goto_8
    if-eqz v6, :cond_16

    .line 320
    .line 321
    instance-of v9, v6, Ld1/b0;

    .line 322
    .line 323
    if-eqz v9, :cond_18

    .line 324
    .line 325
    check-cast v6, Ld1/b0;

    .line 326
    .line 327
    invoke-interface {v3, v6}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    check-cast v6, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_1e

    .line 338
    .line 339
    move v5, v15

    .line 340
    goto :goto_b

    .line 341
    :cond_18
    iget v9, v6, Ly0/n;->i:I

    .line 342
    .line 343
    and-int/lit16 v9, v9, 0x400

    .line 344
    .line 345
    if-eqz v9, :cond_1e

    .line 346
    .line 347
    instance-of v9, v6, Lx1/j;

    .line 348
    .line 349
    if-eqz v9, :cond_1e

    .line 350
    .line 351
    move-object v9, v6

    .line 352
    check-cast v9, Lx1/j;

    .line 353
    .line 354
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 355
    .line 356
    move/from16 v10, v16

    .line 357
    .line 358
    :goto_9
    if-eqz v9, :cond_1d

    .line 359
    .line 360
    iget v11, v9, Ly0/n;->i:I

    .line 361
    .line 362
    and-int/lit16 v11, v11, 0x400

    .line 363
    .line 364
    if-eqz v11, :cond_1c

    .line 365
    .line 366
    add-int/lit8 v10, v10, 0x1

    .line 367
    .line 368
    if-ne v10, v15, :cond_19

    .line 369
    .line 370
    move-object v6, v9

    .line 371
    goto :goto_a

    .line 372
    :cond_19
    if-nez v8, :cond_1a

    .line 373
    .line 374
    new-instance v8, Lj0/b;

    .line 375
    .line 376
    const/16 v11, 0x10

    .line 377
    .line 378
    new-array v12, v11, [Ly0/n;

    .line 379
    .line 380
    invoke-direct {v8, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_1a
    if-eqz v6, :cond_1b

    .line 384
    .line 385
    invoke-virtual {v8, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v6, v17

    .line 389
    .line 390
    :cond_1b
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_1c
    :goto_a
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_1d
    if-ne v10, v15, :cond_1e

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_1e
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    goto :goto_8

    .line 404
    :cond_1f
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_20
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 408
    .line 409
    goto/16 :goto_5

    .line 410
    .line 411
    :cond_21
    move/from16 v16, v5

    .line 412
    .line 413
    :goto_c
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    return-object v1

    .line 418
    :cond_22
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    const/4 v1, 0x0

    .line 422
    return-object v1

    .line 423
    :cond_23
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    const/4 v1, 0x0

    .line 427
    return-object v1

    .line 428
    :cond_24
    const-string v1, "invalid FocusDirection"

    .line 429
    .line 430
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    const/4 v1, 0x0

    .line 434
    return-object v1

    .line 435
    :cond_25
    move-object/from16 v5, v17

    .line 436
    .line 437
    :cond_26
    invoke-virtual {v13}, Ly1/t;->getLayoutDirection()Lu2/m;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    new-instance v9, Lb1/g;

    .line 442
    .line 443
    invoke-direct {v9, v5, v0, v3}, Lb1/g;-><init>(Ld1/b0;Ld1/p;Lfg/l;)V

    .line 444
    .line 445
    .line 446
    if-ne v1, v15, :cond_27

    .line 447
    .line 448
    goto :goto_d

    .line 449
    :cond_27
    if-ne v1, v11, :cond_2a

    .line 450
    .line 451
    :goto_d
    if-ne v1, v15, :cond_28

    .line 452
    .line 453
    invoke-static {v4, v9}, Ld1/d;->k(Ld1/b0;Lb1/g;)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    goto :goto_e

    .line 458
    :cond_28
    if-ne v1, v11, :cond_29

    .line 459
    .line 460
    invoke-static {v4, v9}, Ld1/d;->a(Ld1/b0;Lb1/g;)Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    :goto_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    return-object v1

    .line 469
    :cond_29
    const-string v1, "This function should only be used for 1-D focus search"

    .line 470
    .line 471
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    const/4 v1, 0x0

    .line 475
    return-object v1

    .line 476
    :cond_2a
    if-ne v1, v8, :cond_2b

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_2b
    if-ne v1, v7, :cond_2c

    .line 480
    .line 481
    goto :goto_f

    .line 482
    :cond_2c
    const/4 v3, 0x5

    .line 483
    if-ne v1, v3, :cond_2d

    .line 484
    .line 485
    goto :goto_f

    .line 486
    :cond_2d
    const/4 v3, 0x6

    .line 487
    if-ne v1, v3, :cond_2e

    .line 488
    .line 489
    :goto_f
    invoke-static {v1, v9, v4, v2}, Ld1/d;->C(ILb1/g;Ld1/b0;Le1/c;)Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    return-object v1

    .line 494
    :cond_2e
    const/4 v3, 0x7

    .line 495
    if-ne v1, v3, :cond_32

    .line 496
    .line 497
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_30

    .line 502
    .line 503
    if-ne v1, v15, :cond_2f

    .line 504
    .line 505
    move v7, v8

    .line 506
    goto :goto_10

    .line 507
    :cond_2f
    invoke-static {}, Lokio/a;->k()V

    .line 508
    .line 509
    .line 510
    const/4 v1, 0x0

    .line 511
    return-object v1

    .line 512
    :cond_30
    :goto_10
    invoke-static {v4}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    if-eqz v1, :cond_31

    .line 517
    .line 518
    invoke-static {v7, v9, v1, v2}, Ld1/d;->C(ILb1/g;Ld1/b0;Le1/c;)Ljava/lang/Boolean;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    return-object v1

    .line 523
    :cond_31
    :goto_11
    return-object v17

    .line 524
    :cond_32
    const/16 v2, 0x8

    .line 525
    .line 526
    if-ne v1, v2, :cond_42

    .line 527
    .line 528
    invoke-static {v4}, Ld1/d;->f(Ld1/b0;)Ld1/b0;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    if-eqz v1, :cond_3f

    .line 533
    .line 534
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 535
    .line 536
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 537
    .line 538
    if-nez v2, :cond_33

    .line 539
    .line 540
    const-string v2, "visitAncestors called on an unattached node"

    .line 541
    .line 542
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :cond_33
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 546
    .line 547
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 548
    .line 549
    invoke-static {v1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    :goto_12
    if-eqz v1, :cond_3f

    .line 554
    .line 555
    iget-object v3, v1, Lx1/f0;->L:Lx1/b1;

    .line 556
    .line 557
    iget-object v3, v3, Lx1/b1;->f:Ly0/n;

    .line 558
    .line 559
    iget v3, v3, Ly0/n;->j:I

    .line 560
    .line 561
    and-int/lit16 v3, v3, 0x400

    .line 562
    .line 563
    if-eqz v3, :cond_3d

    .line 564
    .line 565
    :goto_13
    if-eqz v2, :cond_3d

    .line 566
    .line 567
    iget v3, v2, Ly0/n;->i:I

    .line 568
    .line 569
    and-int/lit16 v3, v3, 0x400

    .line 570
    .line 571
    if-eqz v3, :cond_3c

    .line 572
    .line 573
    move-object v3, v2

    .line 574
    move-object/from16 v5, v17

    .line 575
    .line 576
    :goto_14
    if-eqz v3, :cond_3c

    .line 577
    .line 578
    instance-of v6, v3, Ld1/b0;

    .line 579
    .line 580
    if-eqz v6, :cond_35

    .line 581
    .line 582
    check-cast v3, Ld1/b0;

    .line 583
    .line 584
    invoke-virtual {v3}, Ld1/b0;->m1()Ld1/t;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    iget-boolean v6, v6, Ld1/t;->a:Z

    .line 589
    .line 590
    if-eqz v6, :cond_34

    .line 591
    .line 592
    move-object v15, v3

    .line 593
    goto/16 :goto_19

    .line 594
    .line 595
    :cond_34
    const/16 v8, 0x10

    .line 596
    .line 597
    goto :goto_18

    .line 598
    :cond_35
    iget v6, v3, Ly0/n;->i:I

    .line 599
    .line 600
    and-int/lit16 v6, v6, 0x400

    .line 601
    .line 602
    if-eqz v6, :cond_34

    .line 603
    .line 604
    instance-of v6, v3, Lx1/j;

    .line 605
    .line 606
    if-eqz v6, :cond_34

    .line 607
    .line 608
    move-object v6, v3

    .line 609
    check-cast v6, Lx1/j;

    .line 610
    .line 611
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 612
    .line 613
    move/from16 v7, v16

    .line 614
    .line 615
    :goto_15
    if-eqz v6, :cond_3a

    .line 616
    .line 617
    iget v8, v6, Ly0/n;->i:I

    .line 618
    .line 619
    and-int/lit16 v8, v8, 0x400

    .line 620
    .line 621
    if-eqz v8, :cond_36

    .line 622
    .line 623
    add-int/lit8 v7, v7, 0x1

    .line 624
    .line 625
    if-ne v7, v15, :cond_37

    .line 626
    .line 627
    move-object v3, v6

    .line 628
    :cond_36
    const/16 v8, 0x10

    .line 629
    .line 630
    goto :goto_17

    .line 631
    :cond_37
    if-nez v5, :cond_38

    .line 632
    .line 633
    new-instance v5, Lj0/b;

    .line 634
    .line 635
    const/16 v8, 0x10

    .line 636
    .line 637
    new-array v10, v8, [Ly0/n;

    .line 638
    .line 639
    invoke-direct {v5, v10}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    goto :goto_16

    .line 643
    :cond_38
    const/16 v8, 0x10

    .line 644
    .line 645
    :goto_16
    if-eqz v3, :cond_39

    .line 646
    .line 647
    invoke-virtual {v5, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    move-object/from16 v3, v17

    .line 651
    .line 652
    :cond_39
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    :goto_17
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 656
    .line 657
    goto :goto_15

    .line 658
    :cond_3a
    const/16 v8, 0x10

    .line 659
    .line 660
    if-ne v7, v15, :cond_3b

    .line 661
    .line 662
    goto :goto_14

    .line 663
    :cond_3b
    :goto_18
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    goto :goto_14

    .line 668
    :cond_3c
    const/16 v8, 0x10

    .line 669
    .line 670
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_3d
    const/16 v8, 0x10

    .line 674
    .line 675
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    if-eqz v1, :cond_3e

    .line 680
    .line 681
    iget-object v2, v1, Lx1/f0;->L:Lx1/b1;

    .line 682
    .line 683
    if-eqz v2, :cond_3e

    .line 684
    .line 685
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 686
    .line 687
    goto/16 :goto_12

    .line 688
    .line 689
    :cond_3e
    move-object/from16 v2, v17

    .line 690
    .line 691
    goto/16 :goto_12

    .line 692
    .line 693
    :cond_3f
    move-object/from16 v15, v17

    .line 694
    .line 695
    :goto_19
    if-eqz v15, :cond_41

    .line 696
    .line 697
    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-eqz v1, :cond_40

    .line 702
    .line 703
    goto :goto_1a

    .line 704
    :cond_40
    invoke-virtual {v9, v15}, Lb1/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    check-cast v1, Ljava/lang/Boolean;

    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 711
    .line 712
    .line 713
    move-result v16

    .line 714
    :cond_41
    :goto_1a
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    return-object v1

    .line 719
    :cond_42
    const-string v2, "Focus search invoked with invalid FocusDirection "

    .line 720
    .line 721
    invoke-static {v1}, Ld1/f;->a(I)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-static {v1, v2}, Lg1/d;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    const/4 v1, 0x0

    .line 729
    return-object v1
.end method

.method public final f()Ld1/b0;
    .locals 3

    .line 1
    iget-object v0, p0, Ld1/p;->h:Ld1/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final g(IZ)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ld1/p;->a:Ly1/t;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, v0, Ld1/b0;->u:Z

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ly1/t;->z(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lgg/u;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    iput-object v3, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1}, Ly1/t;->getEmbeddedViewFocusRect()Le1/c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v4, Ld1/n;

    .line 40
    .line 41
    invoke-direct {v4, v0, p1}, Ld1/n;-><init>(Lgg/u;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1, v1, v4}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Ld1/p;->f()Ld1/b0;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eq v3, v4, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const/4 v3, 0x0

    .line 64
    if-eqz v1, :cond_6

    .line 65
    .line 66
    iget-object v4, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    if-ne p1, v2, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const/4 v0, 0x2

    .line 92
    if-ne p1, v0, :cond_6

    .line 93
    .line 94
    :goto_0
    if-eqz p2, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0, p1, v3, v3}, Ld1/p;->b(IZZ)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    new-instance p2, Ld1/o;

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    invoke-direct {p2, p1, v0}, Ld1/o;-><init>(II)V

    .line 106
    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, p1, v0, p2}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    move p1, v3

    .line 121
    :goto_1
    if-eqz p1, :cond_6

    .line 122
    .line 123
    :goto_2
    return v2

    .line 124
    :cond_6
    :goto_3
    return v3
.end method

.method public final h(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Ld1/p;->b(IZZ)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance v1, Ld1/o;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, v2}, Ld1/o;-><init>(II)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, p1, v2, v1}, Ld1/p;->e(ILe1/c;Lfg/l;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :cond_1
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Ld1/p;->c()V

    .line 29
    .line 30
    .line 31
    :cond_2
    return v0
.end method

.method public final i(Ld1/b0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld1/p;->h:Ld1/b0;

    .line 2
    .line 3
    iput-object p1, p0, Ld1/p;->h:Ld1/b0;

    .line 4
    .line 5
    iget-object v1, p0, Ld1/p;->g:Lf/f0;

    .line 6
    .line 7
    iget-object v2, v1, Lf/f0;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, v1, Lf/f0;->b:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    aget-object v4, v2, v3

    .line 15
    .line 16
    check-cast v4, Ld1/j;

    .line 17
    .line 18
    invoke-interface {v4, v0, p1}, Ld1/j;->e(Ld1/b0;Ld1/b0;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final j(Landroid/view/KeyEvent;)Z
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lq1/d;->b(Landroid/view/KeyEvent;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static/range {p1 .. p1}, Lq1/d;->c(Landroid/view/KeyEvent;)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x2

    .line 12
    const v10, -0x3361d2af    # -8.293031E7f

    .line 13
    .line 14
    .line 15
    const-wide/16 v15, 0x0

    .line 16
    .line 17
    const-wide v17, 0x101010101010101L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide/16 v19, 0xfe

    .line 23
    .line 24
    const/16 p1, 0x6

    .line 25
    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    const/16 v21, 0x0

    .line 29
    .line 30
    const-wide/16 v22, 0x1

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x1

    .line 34
    if-ne v3, v4, :cond_11

    .line 35
    .line 36
    iget-object v3, v0, Ld1/p;->f:Lf/a0;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    new-instance v3, Lf/a0;

    .line 41
    .line 42
    invoke-direct {v3, v6}, Lf/a0;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object v3, v0, Ld1/p;->f:Lf/a0;

    .line 46
    .line 47
    :cond_0
    move-object v4, v3

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    mul-int/2addr v3, v10

    .line 53
    shl-int/lit8 v24, v3, 0x10

    .line 54
    .line 55
    xor-int v3, v3, v24

    .line 56
    .line 57
    move/from16 v24, v6

    .line 58
    .line 59
    ushr-int/lit8 v6, v3, 0x7

    .line 60
    .line 61
    and-int/lit8 v3, v3, 0x7f

    .line 62
    .line 63
    const/16 v25, 0x3f

    .line 64
    .line 65
    iget v8, v4, Lf/a0;->c:I

    .line 66
    .line 67
    and-int v26, v6, v8

    .line 68
    .line 69
    move/from16 v27, v21

    .line 70
    .line 71
    const/16 v28, 0x7

    .line 72
    .line 73
    :goto_0
    iget-object v9, v4, Lf/a0;->a:[J

    .line 74
    .line 75
    shr-int/lit8 v29, v26, 0x3

    .line 76
    .line 77
    and-int/lit8 v30, v26, 0x7

    .line 78
    .line 79
    move/from16 v31, v10

    .line 80
    .line 81
    shl-int/lit8 v10, v30, 0x3

    .line 82
    .line 83
    aget-wide v32, v9, v29

    .line 84
    .line 85
    ushr-long v32, v32, v10

    .line 86
    .line 87
    add-int/lit8 v29, v29, 0x1

    .line 88
    .line 89
    aget-wide v29, v9, v29

    .line 90
    .line 91
    rsub-int/lit8 v9, v10, 0x40

    .line 92
    .line 93
    shl-long v29, v29, v9

    .line 94
    .line 95
    int-to-long v9, v10

    .line 96
    neg-long v9, v9

    .line 97
    shr-long v9, v9, v25

    .line 98
    .line 99
    and-long v9, v29, v9

    .line 100
    .line 101
    or-long v9, v32, v9

    .line 102
    .line 103
    const-wide/16 v29, 0xff

    .line 104
    .line 105
    int-to-long v11, v3

    .line 106
    mul-long v32, v11, v17

    .line 107
    .line 108
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    xor-long v13, v9, v32

    .line 114
    .line 115
    sub-long v32, v13, v17

    .line 116
    .line 117
    not-long v13, v13

    .line 118
    and-long v13, v32, v13

    .line 119
    .line 120
    and-long v13, v13, v34

    .line 121
    .line 122
    :goto_1
    cmp-long v32, v13, v15

    .line 123
    .line 124
    if-eqz v32, :cond_2

    .line 125
    .line 126
    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 127
    .line 128
    .line 129
    move-result v32

    .line 130
    shr-int/lit8 v32, v32, 0x3

    .line 131
    .line 132
    add-int v32, v26, v32

    .line 133
    .line 134
    and-int v32, v32, v8

    .line 135
    .line 136
    move-wide/from16 v36, v15

    .line 137
    .line 138
    iget-object v15, v4, Lf/a0;->b:[J

    .line 139
    .line 140
    aget-wide v38, v15, v32

    .line 141
    .line 142
    cmp-long v15, v38, v1

    .line 143
    .line 144
    if-nez v15, :cond_1

    .line 145
    .line 146
    move/from16 v33, v7

    .line 147
    .line 148
    goto/16 :goto_d

    .line 149
    .line 150
    :cond_1
    sub-long v15, v13, v22

    .line 151
    .line 152
    and-long/2addr v13, v15

    .line 153
    move-wide/from16 v15, v36

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    move-wide/from16 v36, v15

    .line 157
    .line 158
    not-long v13, v9

    .line 159
    shl-long v13, v13, p1

    .line 160
    .line 161
    and-long/2addr v9, v13

    .line 162
    and-long v9, v9, v34

    .line 163
    .line 164
    cmp-long v9, v9, v36

    .line 165
    .line 166
    if-eqz v9, :cond_10

    .line 167
    .line 168
    invoke-virtual {v4, v6}, Lf/a0;->b(I)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    iget v8, v4, Lf/a0;->e:I

    .line 173
    .line 174
    if-nez v8, :cond_3

    .line 175
    .line 176
    iget-object v8, v4, Lf/a0;->a:[J

    .line 177
    .line 178
    shr-int/lit8 v13, v3, 0x3

    .line 179
    .line 180
    aget-wide v13, v8, v13

    .line 181
    .line 182
    and-int/lit8 v8, v3, 0x7

    .line 183
    .line 184
    shl-int/lit8 v8, v8, 0x3

    .line 185
    .line 186
    shr-long/2addr v13, v8

    .line 187
    and-long v13, v13, v29

    .line 188
    .line 189
    cmp-long v8, v13, v19

    .line 190
    .line 191
    if-nez v8, :cond_4

    .line 192
    .line 193
    :cond_3
    move/from16 v33, v7

    .line 194
    .line 195
    const-wide/16 v17, 0x80

    .line 196
    .line 197
    goto/16 :goto_c

    .line 198
    .line 199
    :cond_4
    iget v3, v4, Lf/a0;->c:I

    .line 200
    .line 201
    if-le v3, v5, :cond_d

    .line 202
    .line 203
    iget v8, v4, Lf/a0;->d:I

    .line 204
    .line 205
    int-to-long v13, v8

    .line 206
    const-wide/16 v15, 0x20

    .line 207
    .line 208
    mul-long/2addr v13, v15

    .line 209
    const-wide/16 v15, 0x80

    .line 210
    .line 211
    int-to-long v9, v3

    .line 212
    const-wide/16 v17, 0x19

    .line 213
    .line 214
    mul-long v9, v9, v17

    .line 215
    .line 216
    invoke-static {v13, v14, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-gtz v3, :cond_c

    .line 221
    .line 222
    iget-object v3, v4, Lf/a0;->a:[J

    .line 223
    .line 224
    iget v8, v4, Lf/a0;->c:I

    .line 225
    .line 226
    iget-object v9, v4, Lf/a0;->b:[J

    .line 227
    .line 228
    add-int/lit8 v10, v8, 0x7

    .line 229
    .line 230
    shr-int/lit8 v10, v10, 0x3

    .line 231
    .line 232
    move/from16 v13, v21

    .line 233
    .line 234
    :goto_2
    if-ge v13, v10, :cond_5

    .line 235
    .line 236
    aget-wide v17, v3, v13

    .line 237
    .line 238
    move v14, v5

    .line 239
    move/from16 v32, v6

    .line 240
    .line 241
    and-long v5, v17, v34

    .line 242
    .line 243
    move-wide/from16 v17, v15

    .line 244
    .line 245
    move/from16 v16, v14

    .line 246
    .line 247
    not-long v14, v5

    .line 248
    ushr-long v5, v5, v28

    .line 249
    .line 250
    add-long/2addr v14, v5

    .line 251
    const-wide v5, -0x101010101010102L

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    and-long/2addr v5, v14

    .line 257
    aput-wide v5, v3, v13

    .line 258
    .line 259
    add-int/lit8 v13, v13, 0x1

    .line 260
    .line 261
    move/from16 v5, v16

    .line 262
    .line 263
    move-wide/from16 v15, v17

    .line 264
    .line 265
    move/from16 v6, v32

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_5
    move/from16 v32, v6

    .line 269
    .line 270
    move-wide/from16 v17, v15

    .line 271
    .line 272
    move/from16 v16, v5

    .line 273
    .line 274
    invoke-static {v3}, Ltf/l;->B0([J)I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    add-int/lit8 v6, v5, -0x1

    .line 279
    .line 280
    aget-wide v13, v3, v6

    .line 281
    .line 282
    const-wide v22, 0xffffffffffffffL

    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    and-long v13, v13, v22

    .line 288
    .line 289
    const-wide/high16 v25, -0x100000000000000L

    .line 290
    .line 291
    or-long v13, v13, v25

    .line 292
    .line 293
    aput-wide v13, v3, v6

    .line 294
    .line 295
    aget-wide v13, v3, v21

    .line 296
    .line 297
    aput-wide v13, v3, v5

    .line 298
    .line 299
    move/from16 v5, v21

    .line 300
    .line 301
    :goto_3
    if-eq v5, v8, :cond_a

    .line 302
    .line 303
    shr-int/lit8 v6, v5, 0x3

    .line 304
    .line 305
    aget-wide v13, v3, v6

    .line 306
    .line 307
    and-int/lit8 v10, v5, 0x7

    .line 308
    .line 309
    shl-int/lit8 v10, v10, 0x3

    .line 310
    .line 311
    shr-long/2addr v13, v10

    .line 312
    and-long v13, v13, v29

    .line 313
    .line 314
    cmp-long v15, v13, v17

    .line 315
    .line 316
    if-nez v15, :cond_6

    .line 317
    .line 318
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_6
    cmp-long v13, v13, v19

    .line 322
    .line 323
    if-eqz v13, :cond_7

    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_7
    aget-wide v13, v9, v5

    .line 327
    .line 328
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 329
    .line 330
    .line 331
    move-result v13

    .line 332
    mul-int v13, v13, v31

    .line 333
    .line 334
    shl-int/lit8 v14, v13, 0x10

    .line 335
    .line 336
    xor-int/2addr v13, v14

    .line 337
    ushr-int/lit8 v14, v13, 0x7

    .line 338
    .line 339
    invoke-virtual {v4, v14}, Lf/a0;->b(I)I

    .line 340
    .line 341
    .line 342
    move-result v15

    .line 343
    and-int/2addr v14, v8

    .line 344
    sub-int v25, v15, v14

    .line 345
    .line 346
    and-int v25, v25, v8

    .line 347
    .line 348
    move/from16 v33, v7

    .line 349
    .line 350
    div-int/lit8 v7, v25, 0x8

    .line 351
    .line 352
    sub-int v14, v5, v14

    .line 353
    .line 354
    and-int/2addr v14, v8

    .line 355
    div-int/lit8 v14, v14, 0x8

    .line 356
    .line 357
    const-wide/high16 v25, -0x8000000000000000L

    .line 358
    .line 359
    if-ne v7, v14, :cond_8

    .line 360
    .line 361
    and-int/lit8 v7, v13, 0x7f

    .line 362
    .line 363
    int-to-long v13, v7

    .line 364
    aget-wide v34, v3, v6

    .line 365
    .line 366
    move v7, v5

    .line 367
    move/from16 p1, v6

    .line 368
    .line 369
    shl-long v5, v29, v10

    .line 370
    .line 371
    not-long v5, v5

    .line 372
    and-long v5, v34, v5

    .line 373
    .line 374
    shl-long/2addr v13, v10

    .line 375
    or-long/2addr v5, v13

    .line 376
    aput-wide v5, v3, p1

    .line 377
    .line 378
    array-length v5, v3

    .line 379
    add-int/lit8 v5, v5, -0x1

    .line 380
    .line 381
    aget-wide v13, v3, v21

    .line 382
    .line 383
    and-long v13, v13, v22

    .line 384
    .line 385
    or-long v13, v13, v25

    .line 386
    .line 387
    aput-wide v13, v3, v5

    .line 388
    .line 389
    add-int/lit8 v5, v7, 0x1

    .line 390
    .line 391
    :goto_5
    move/from16 v7, v33

    .line 392
    .line 393
    goto :goto_3

    .line 394
    :cond_8
    move v7, v5

    .line 395
    move/from16 p1, v6

    .line 396
    .line 397
    shr-int/lit8 v5, v15, 0x3

    .line 398
    .line 399
    aget-wide v34, v3, v5

    .line 400
    .line 401
    and-int/lit8 v6, v15, 0x7

    .line 402
    .line 403
    shl-int/lit8 v6, v6, 0x3

    .line 404
    .line 405
    shr-long v38, v34, v6

    .line 406
    .line 407
    and-long v38, v38, v29

    .line 408
    .line 409
    cmp-long v14, v38, v17

    .line 410
    .line 411
    if-nez v14, :cond_9

    .line 412
    .line 413
    and-int/lit8 v13, v13, 0x7f

    .line 414
    .line 415
    int-to-long v13, v13

    .line 416
    move/from16 v27, v5

    .line 417
    .line 418
    move/from16 v38, v6

    .line 419
    .line 420
    shl-long v5, v29, v38

    .line 421
    .line 422
    not-long v5, v5

    .line 423
    and-long v5, v34, v5

    .line 424
    .line 425
    shl-long v13, v13, v38

    .line 426
    .line 427
    or-long/2addr v5, v13

    .line 428
    aput-wide v5, v3, v27

    .line 429
    .line 430
    aget-wide v5, v3, p1

    .line 431
    .line 432
    shl-long v13, v29, v10

    .line 433
    .line 434
    not-long v13, v13

    .line 435
    and-long/2addr v5, v13

    .line 436
    shl-long v13, v17, v10

    .line 437
    .line 438
    or-long/2addr v5, v13

    .line 439
    aput-wide v5, v3, p1

    .line 440
    .line 441
    aget-wide v5, v9, v7

    .line 442
    .line 443
    aput-wide v5, v9, v15

    .line 444
    .line 445
    aput-wide v36, v9, v7

    .line 446
    .line 447
    move v5, v7

    .line 448
    goto :goto_6

    .line 449
    :cond_9
    move/from16 v27, v5

    .line 450
    .line 451
    move/from16 v38, v6

    .line 452
    .line 453
    and-int/lit8 v5, v13, 0x7f

    .line 454
    .line 455
    int-to-long v5, v5

    .line 456
    shl-long v13, v29, v38

    .line 457
    .line 458
    not-long v13, v13

    .line 459
    and-long v13, v34, v13

    .line 460
    .line 461
    shl-long v5, v5, v38

    .line 462
    .line 463
    or-long/2addr v5, v13

    .line 464
    aput-wide v5, v3, v27

    .line 465
    .line 466
    aget-wide v5, v9, v15

    .line 467
    .line 468
    aget-wide v13, v9, v7

    .line 469
    .line 470
    aput-wide v13, v9, v15

    .line 471
    .line 472
    aput-wide v5, v9, v7

    .line 473
    .line 474
    add-int/lit8 v5, v7, -0x1

    .line 475
    .line 476
    :goto_6
    array-length v6, v3

    .line 477
    add-int/lit8 v6, v6, -0x1

    .line 478
    .line 479
    aget-wide v13, v3, v21

    .line 480
    .line 481
    and-long v13, v13, v22

    .line 482
    .line 483
    or-long v13, v13, v25

    .line 484
    .line 485
    aput-wide v13, v3, v6

    .line 486
    .line 487
    add-int/lit8 v5, v5, 0x1

    .line 488
    .line 489
    goto :goto_5

    .line 490
    :cond_a
    move/from16 v33, v7

    .line 491
    .line 492
    iget v3, v4, Lf/a0;->c:I

    .line 493
    .line 494
    invoke-static {v3}, Lf/r0;->a(I)I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    iget v5, v4, Lf/a0;->d:I

    .line 499
    .line 500
    sub-int/2addr v3, v5

    .line 501
    iput v3, v4, Lf/a0;->e:I

    .line 502
    .line 503
    :cond_b
    move/from16 v5, v32

    .line 504
    .line 505
    goto/16 :goto_b

    .line 506
    .line 507
    :cond_c
    move-wide/from16 v17, v15

    .line 508
    .line 509
    :goto_7
    move/from16 v32, v6

    .line 510
    .line 511
    move/from16 v33, v7

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_d
    const-wide/16 v17, 0x80

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :goto_8
    iget v3, v4, Lf/a0;->c:I

    .line 518
    .line 519
    invoke-static {v3}, Lf/r0;->b(I)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    iget-object v5, v4, Lf/a0;->a:[J

    .line 524
    .line 525
    iget-object v6, v4, Lf/a0;->b:[J

    .line 526
    .line 527
    iget v7, v4, Lf/a0;->c:I

    .line 528
    .line 529
    invoke-virtual {v4, v3}, Lf/a0;->c(I)V

    .line 530
    .line 531
    .line 532
    iget-object v3, v4, Lf/a0;->a:[J

    .line 533
    .line 534
    iget-object v8, v4, Lf/a0;->b:[J

    .line 535
    .line 536
    iget v9, v4, Lf/a0;->c:I

    .line 537
    .line 538
    move/from16 v10, v21

    .line 539
    .line 540
    :goto_9
    if-ge v10, v7, :cond_b

    .line 541
    .line 542
    shr-int/lit8 v13, v10, 0x3

    .line 543
    .line 544
    aget-wide v13, v5, v13

    .line 545
    .line 546
    and-int/lit8 v15, v10, 0x7

    .line 547
    .line 548
    shl-int/lit8 v15, v15, 0x3

    .line 549
    .line 550
    shr-long/2addr v13, v15

    .line 551
    and-long v13, v13, v29

    .line 552
    .line 553
    cmp-long v13, v13, v17

    .line 554
    .line 555
    if-gez v13, :cond_e

    .line 556
    .line 557
    aget-wide v13, v6, v10

    .line 558
    .line 559
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 560
    .line 561
    .line 562
    move-result v15

    .line 563
    mul-int v15, v15, v31

    .line 564
    .line 565
    shl-int/lit8 v16, v15, 0x10

    .line 566
    .line 567
    xor-int v15, v15, v16

    .line 568
    .line 569
    move-object/from16 v16, v3

    .line 570
    .line 571
    ushr-int/lit8 v3, v15, 0x7

    .line 572
    .line 573
    invoke-virtual {v4, v3}, Lf/a0;->b(I)I

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    and-int/lit8 v15, v15, 0x7f

    .line 578
    .line 579
    move-object/from16 v19, v5

    .line 580
    .line 581
    move-object/from16 v20, v6

    .line 582
    .line 583
    int-to-long v5, v15

    .line 584
    shr-int/lit8 v15, v3, 0x3

    .line 585
    .line 586
    and-int/lit8 v22, v3, 0x7

    .line 587
    .line 588
    shl-int/lit8 v22, v22, 0x3

    .line 589
    .line 590
    aget-wide v25, v16, v15

    .line 591
    .line 592
    move-wide/from16 v34, v5

    .line 593
    .line 594
    shl-long v5, v29, v22

    .line 595
    .line 596
    not-long v5, v5

    .line 597
    and-long v5, v25, v5

    .line 598
    .line 599
    shl-long v22, v34, v22

    .line 600
    .line 601
    or-long v5, v5, v22

    .line 602
    .line 603
    aput-wide v5, v16, v15

    .line 604
    .line 605
    add-int/lit8 v15, v3, -0x7

    .line 606
    .line 607
    and-int/2addr v15, v9

    .line 608
    and-int/lit8 v22, v9, 0x7

    .line 609
    .line 610
    add-int v15, v15, v22

    .line 611
    .line 612
    shr-int/lit8 v15, v15, 0x3

    .line 613
    .line 614
    aput-wide v5, v16, v15

    .line 615
    .line 616
    aput-wide v13, v8, v3

    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_e
    move-object/from16 v16, v3

    .line 620
    .line 621
    move-object/from16 v19, v5

    .line 622
    .line 623
    move-object/from16 v20, v6

    .line 624
    .line 625
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 626
    .line 627
    move-object/from16 v3, v16

    .line 628
    .line 629
    move-object/from16 v5, v19

    .line 630
    .line 631
    move-object/from16 v6, v20

    .line 632
    .line 633
    goto :goto_9

    .line 634
    :goto_b
    invoke-virtual {v4, v5}, Lf/a0;->b(I)I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    :goto_c
    move/from16 v32, v3

    .line 639
    .line 640
    iget v3, v4, Lf/a0;->d:I

    .line 641
    .line 642
    add-int/lit8 v3, v3, 0x1

    .line 643
    .line 644
    iput v3, v4, Lf/a0;->d:I

    .line 645
    .line 646
    iget v3, v4, Lf/a0;->e:I

    .line 647
    .line 648
    iget-object v5, v4, Lf/a0;->a:[J

    .line 649
    .line 650
    shr-int/lit8 v6, v32, 0x3

    .line 651
    .line 652
    aget-wide v7, v5, v6

    .line 653
    .line 654
    and-int/lit8 v9, v32, 0x7

    .line 655
    .line 656
    shl-int/lit8 v9, v9, 0x3

    .line 657
    .line 658
    shr-long v13, v7, v9

    .line 659
    .line 660
    and-long v13, v13, v29

    .line 661
    .line 662
    cmp-long v10, v13, v17

    .line 663
    .line 664
    if-nez v10, :cond_f

    .line 665
    .line 666
    move/from16 v21, v33

    .line 667
    .line 668
    :cond_f
    sub-int v3, v3, v21

    .line 669
    .line 670
    iput v3, v4, Lf/a0;->e:I

    .line 671
    .line 672
    iget v3, v4, Lf/a0;->c:I

    .line 673
    .line 674
    shl-long v13, v29, v9

    .line 675
    .line 676
    not-long v13, v13

    .line 677
    and-long/2addr v7, v13

    .line 678
    shl-long v9, v11, v9

    .line 679
    .line 680
    or-long/2addr v7, v9

    .line 681
    aput-wide v7, v5, v6

    .line 682
    .line 683
    add-int/lit8 v6, v32, -0x7

    .line 684
    .line 685
    and-int/2addr v6, v3

    .line 686
    and-int/lit8 v3, v3, 0x7

    .line 687
    .line 688
    add-int/2addr v6, v3

    .line 689
    shr-int/lit8 v3, v6, 0x3

    .line 690
    .line 691
    aput-wide v7, v5, v3

    .line 692
    .line 693
    :goto_d
    iget-object v3, v4, Lf/a0;->b:[J

    .line 694
    .line 695
    aput-wide v1, v3, v32

    .line 696
    .line 697
    return v33

    .line 698
    :cond_10
    move/from16 v16, v5

    .line 699
    .line 700
    move v5, v6

    .line 701
    move/from16 v33, v7

    .line 702
    .line 703
    add-int/lit8 v27, v27, 0x8

    .line 704
    .line 705
    add-int v26, v26, v27

    .line 706
    .line 707
    and-int v26, v26, v8

    .line 708
    .line 709
    move/from16 v5, v16

    .line 710
    .line 711
    move/from16 v10, v31

    .line 712
    .line 713
    move-wide/from16 v15, v36

    .line 714
    .line 715
    goto/16 :goto_0

    .line 716
    .line 717
    :cond_11
    move/from16 v24, v6

    .line 718
    .line 719
    move/from16 v31, v10

    .line 720
    .line 721
    move-wide/from16 v36, v15

    .line 722
    .line 723
    const/16 v25, 0x3f

    .line 724
    .line 725
    const/16 v28, 0x7

    .line 726
    .line 727
    const-wide/16 v29, 0xff

    .line 728
    .line 729
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    move/from16 v16, v5

    .line 735
    .line 736
    if-ne v3, v7, :cond_17

    .line 737
    .line 738
    iget-object v3, v0, Ld1/p;->f:Lf/a0;

    .line 739
    .line 740
    if-eqz v3, :cond_16

    .line 741
    .line 742
    invoke-virtual {v3, v1, v2}, Lf/a0;->a(J)Z

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    if-ne v3, v7, :cond_16

    .line 747
    .line 748
    iget-object v3, v0, Ld1/p;->f:Lf/a0;

    .line 749
    .line 750
    if-eqz v3, :cond_14

    .line 751
    .line 752
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    mul-int v4, v4, v31

    .line 757
    .line 758
    shl-int/lit8 v5, v4, 0x10

    .line 759
    .line 760
    xor-int/2addr v4, v5

    .line 761
    and-int/lit8 v5, v4, 0x7f

    .line 762
    .line 763
    iget v6, v3, Lf/a0;->c:I

    .line 764
    .line 765
    ushr-int/lit8 v4, v4, 0x7

    .line 766
    .line 767
    :goto_e
    and-int/2addr v4, v6

    .line 768
    iget-object v7, v3, Lf/a0;->a:[J

    .line 769
    .line 770
    shr-int/lit8 v8, v4, 0x3

    .line 771
    .line 772
    and-int/lit8 v9, v4, 0x7

    .line 773
    .line 774
    shl-int/lit8 v9, v9, 0x3

    .line 775
    .line 776
    aget-wide v10, v7, v8

    .line 777
    .line 778
    ushr-long/2addr v10, v9

    .line 779
    const/16 v33, 0x1

    .line 780
    .line 781
    add-int/lit8 v8, v8, 0x1

    .line 782
    .line 783
    aget-wide v12, v7, v8

    .line 784
    .line 785
    rsub-int/lit8 v7, v9, 0x40

    .line 786
    .line 787
    shl-long v7, v12, v7

    .line 788
    .line 789
    int-to-long v12, v9

    .line 790
    neg-long v12, v12

    .line 791
    shr-long v12, v12, v25

    .line 792
    .line 793
    and-long/2addr v7, v12

    .line 794
    or-long/2addr v7, v10

    .line 795
    int-to-long v9, v5

    .line 796
    mul-long v9, v9, v17

    .line 797
    .line 798
    xor-long/2addr v9, v7

    .line 799
    sub-long v11, v9, v17

    .line 800
    .line 801
    not-long v9, v9

    .line 802
    and-long/2addr v9, v11

    .line 803
    and-long v9, v9, v34

    .line 804
    .line 805
    :goto_f
    cmp-long v11, v9, v36

    .line 806
    .line 807
    if-eqz v11, :cond_13

    .line 808
    .line 809
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 810
    .line 811
    .line 812
    move-result v11

    .line 813
    shr-int/lit8 v11, v11, 0x3

    .line 814
    .line 815
    add-int/2addr v11, v4

    .line 816
    and-int/2addr v11, v6

    .line 817
    iget-object v12, v3, Lf/a0;->b:[J

    .line 818
    .line 819
    aget-wide v13, v12, v11

    .line 820
    .line 821
    cmp-long v12, v13, v1

    .line 822
    .line 823
    if-nez v12, :cond_12

    .line 824
    .line 825
    goto :goto_10

    .line 826
    :cond_12
    sub-long v11, v9, v22

    .line 827
    .line 828
    and-long/2addr v9, v11

    .line 829
    goto :goto_f

    .line 830
    :cond_13
    not-long v9, v7

    .line 831
    shl-long v9, v9, p1

    .line 832
    .line 833
    and-long/2addr v7, v9

    .line 834
    and-long v7, v7, v34

    .line 835
    .line 836
    cmp-long v7, v7, v36

    .line 837
    .line 838
    if-eqz v7, :cond_15

    .line 839
    .line 840
    const/4 v11, -0x1

    .line 841
    :goto_10
    if-ltz v11, :cond_14

    .line 842
    .line 843
    iget v1, v3, Lf/a0;->d:I

    .line 844
    .line 845
    const/16 v33, 0x1

    .line 846
    .line 847
    add-int/lit8 v1, v1, -0x1

    .line 848
    .line 849
    iput v1, v3, Lf/a0;->d:I

    .line 850
    .line 851
    iget-object v1, v3, Lf/a0;->a:[J

    .line 852
    .line 853
    iget v2, v3, Lf/a0;->c:I

    .line 854
    .line 855
    shr-int/lit8 v3, v11, 0x3

    .line 856
    .line 857
    and-int/lit8 v4, v11, 0x7

    .line 858
    .line 859
    shl-int/lit8 v4, v4, 0x3

    .line 860
    .line 861
    aget-wide v5, v1, v3

    .line 862
    .line 863
    shl-long v7, v29, v4

    .line 864
    .line 865
    not-long v7, v7

    .line 866
    and-long/2addr v5, v7

    .line 867
    shl-long v7, v19, v4

    .line 868
    .line 869
    or-long v4, v5, v7

    .line 870
    .line 871
    aput-wide v4, v1, v3

    .line 872
    .line 873
    add-int/lit8 v11, v11, -0x7

    .line 874
    .line 875
    and-int v3, v11, v2

    .line 876
    .line 877
    and-int/lit8 v2, v2, 0x7

    .line 878
    .line 879
    add-int/2addr v3, v2

    .line 880
    shr-int/lit8 v2, v3, 0x3

    .line 881
    .line 882
    aput-wide v4, v1, v2

    .line 883
    .line 884
    const/16 v33, 0x1

    .line 885
    .line 886
    return v33

    .line 887
    :cond_14
    const/16 v33, 0x1

    .line 888
    .line 889
    goto :goto_11

    .line 890
    :cond_15
    const/16 v33, 0x1

    .line 891
    .line 892
    add-int/lit8 v21, v21, 0x8

    .line 893
    .line 894
    add-int v4, v4, v21

    .line 895
    .line 896
    goto/16 :goto_e

    .line 897
    .line 898
    :cond_16
    return v21

    .line 899
    :cond_17
    move/from16 v33, v7

    .line 900
    .line 901
    :goto_11
    return v33
.end method
