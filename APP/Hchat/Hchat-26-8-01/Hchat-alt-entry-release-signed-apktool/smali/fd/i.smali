.class public final Lfd/i;
.super Lfd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lfd/i;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lfd/i;->h:Lmh/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final r(Lfc/f;Lud/j;)V
    .locals 2

    .line 1
    check-cast p2, Lmd/e;

    .line 2
    .line 3
    iget-object p2, p2, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    sget-object v0, Lmd/b;->w:Lmd/b;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lnd/e;

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p2, Lnd/e;->g:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lqd/k;

    .line 32
    .line 33
    invoke-virtual {p1}, Lfc/f;->p()V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, v0, Lqd/k;->d:Z

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const-string v1, "final "

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, v0, Lqd/k;->b:Lqd/j;

    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Lfd/e;->q(Lfc/f;Lqd/j;)V

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x20

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, Lfd/e;->d(Lfc/f;Lqd/k;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x3b

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lqd/k;->a()Lqd/s;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v0, v0, Lqd/s;->i:Lqd/r;

    .line 68
    .line 69
    iget-object v1, p0, Lfd/e;->b:Lud/r;

    .line 70
    .line 71
    invoke-static {p1, v1, v0}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-void
.end method

.method public final s(Lfc/f;Lae/f;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lfd/e;->a:Lfd/g;

    .line 2
    .line 3
    iget-object v1, v0, Lfd/g;->d:Lfd/h;

    .line 4
    .line 5
    iget-object v2, p2, Lae/f;->e:Lxd/b;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v3, "} catch ("

    .line 11
    .line 12
    invoke-virtual {p1, v3}, Lfc/f;->r(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lae/f;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    sget-object v3, Lqd/j;->o:Lqd/e;

    .line 22
    .line 23
    iget-object v0, v0, Lfd/g;->b:Lfd/a;

    .line 24
    .line 25
    invoke-virtual {v0, p1, v3}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v0, p2, Lae/f;->a:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lod/a;

    .line 46
    .line 47
    invoke-virtual {p0, p1, v3}, Lfd/e;->p(Lfc/f;Lod/a;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const-string v3, " | "

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lod/a;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v3}, Lfd/e;->p(Lfc/f;Lod/a;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    :goto_1
    const/16 v0, 0x20

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 74
    .line 75
    .line 76
    iget-object v0, p2, Lae/f;->f:Lqd/l;

    .line 77
    .line 78
    iget-object v3, p0, Lfd/e;->b:Lud/r;

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    const-string v0, "unknown"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    instance-of v4, v0, Lqd/r;

    .line 89
    .line 90
    if-eqz v4, :cond_6

    .line 91
    .line 92
    check-cast v0, Lqd/r;

    .line 93
    .line 94
    iget-object v0, v0, Lqd/r;->m:Lqd/s;

    .line 95
    .line 96
    instance-of v4, p1, Lfc/b;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-static {v3, v0}, Lic/d;->a(Lud/r;Lqd/s;)Lic/d;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {p1, v4}, Lfc/f;->k(Lhc/c;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-virtual {v0}, Lqd/s;->b()Lqd/k;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, Lfd/h;->a(Lqd/k;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    instance-of v4, v0, Lqd/p;

    .line 120
    .line 121
    if-eqz v4, :cond_9

    .line 122
    .line 123
    check-cast v0, Lqd/p;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v4, v0, Lqd/p;->l:Ljava/lang/String;

    .line 129
    .line 130
    iget-boolean v5, v1, Lfd/h;->g:Z

    .line 131
    .line 132
    if-eqz v5, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-virtual {v1, v4}, Lfd/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    iput-object v4, v0, Lqd/p;->l:Ljava/lang/String;

    .line 140
    .line 141
    :goto_2
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 142
    .line 143
    .line 144
    :goto_3
    const-string v0, ") {"

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 147
    .line 148
    .line 149
    iget v0, p2, Lae/f;->b:I

    .line 150
    .line 151
    if-ltz v0, :cond_8

    .line 152
    .line 153
    instance-of v1, p1, Lfc/b;

    .line 154
    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    new-instance v1, Lic/a;

    .line 158
    .line 159
    invoke-direct {v1, v0}, Lic/a;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v1}, Lfc/f;->l(Lic/a;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    iget-object p2, p2, Lae/f;->c:Lud/a;

    .line 166
    .line 167
    invoke-static {p1, v3, p2}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, p1, v2}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_9
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    const-string v0, "Unexpected arg type in catch block: "

    .line 187
    .line 188
    const-string v1, ", class: "

    .line 189
    .line 190
    invoke-static {v0, p1, v1, p2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final t(Lyd/c;Lfc/f;Z)V
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lyd/a;->H()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-virtual {p2, p3}, Lfc/f;->s(I)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lyd/a;->H()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p2, p3}, Lfc/f;->m(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p3, Lmd/a;->t:Lmd/a;

    .line 19
    .line 20
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 21
    .line 22
    invoke-virtual {v0, p3}, Lmd/f;->a(Lmd/a;)Z

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    const-string v0, "// "

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 31
    .line 32
    .line 33
    :cond_1
    const-string v0, "if ("

    .line 34
    .line 35
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 36
    .line 37
    .line 38
    new-instance v0, Lfd/c;

    .line 39
    .line 40
    iget-object v1, p0, Lfd/e;->a:Lfd/g;

    .line 41
    .line 42
    iget-boolean v2, p0, Lfd/e;->d:Z

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p1, Lyd/a;->k:Lyd/b;

    .line 48
    .line 49
    new-instance v2, Landroidx/lifecycle/x;

    .line 50
    .line 51
    const/16 v3, 0xc

    .line 52
    .line 53
    invoke-direct {v2, v3}, Landroidx/lifecycle/x;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p2, v2, v1}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 57
    .line 58
    .line 59
    const-string v0, ") {"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 62
    .line 63
    .line 64
    instance-of v0, p2, Lfc/b;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object v0, p1, Lyd/a;->l:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_2

    .line 76
    .line 77
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lud/a;

    .line 82
    .line 83
    invoke-static {v0}, La/a;->c0(Lud/h;)Lud/p;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p2, v0}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lfd/e;->b:Lud/r;

    .line 91
    .line 92
    invoke-static {p2, v2, v0}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v0, p1, Lyd/c;->m:Lud/j;

    .line 96
    .line 97
    invoke-virtual {p0, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 98
    .line 99
    .line 100
    const-string v0, "// }"

    .line 101
    .line 102
    if-eqz p3, :cond_3

    .line 103
    .line 104
    invoke-virtual {p2, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 109
    .line 110
    .line 111
    :goto_1
    iget-object p1, p1, Lyd/c;->n:Lud/j;

    .line 112
    .line 113
    invoke-static {p1}, Lf8/i;->n0(Lud/j;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_9

    .line 118
    .line 119
    const-string v2, " else "

    .line 120
    .line 121
    invoke-virtual {p2, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 122
    .line 123
    .line 124
    move-object v2, p1

    .line 125
    check-cast v2, Lmd/e;

    .line 126
    .line 127
    iget-object v2, v2, Lmd/e;->g:Lmd/f;

    .line 128
    .line 129
    sget-object v3, Lmd/a;->R:Lmd/a;

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    instance-of v2, p1, Lxd/b;

    .line 138
    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    move-object v2, p1

    .line 142
    check-cast v2, Lxd/b;

    .line 143
    .line 144
    iget-object v2, v2, Lxd/b;->k:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    const/4 v4, 0x1

    .line 151
    if-ne v3, v4, :cond_5

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Lud/j;

    .line 158
    .line 159
    :goto_2
    instance-of v3, v2, Lxd/b;

    .line 160
    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    move-object v3, v2

    .line 164
    check-cast v3, Lxd/b;

    .line 165
    .line 166
    iget-object v3, v3, Lxd/b;->k:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eq v5, v4, :cond_4

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Lud/j;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    const/4 v2, 0x0

    .line 183
    :cond_6
    :goto_3
    instance-of v3, v2, Lyd/c;

    .line 184
    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-virtual {p0, p2, v2}, Lfd/i;->r(Lfc/f;Lud/j;)V

    .line 188
    .line 189
    .line 190
    check-cast v2, Lyd/c;

    .line 191
    .line 192
    invoke-virtual {p0, v2, p2, v1}, Lfd/i;->t(Lyd/c;Lfc/f;Z)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    const/16 v1, 0x7b

    .line 197
    .line 198
    invoke-virtual {p2, v1}, Lfc/f;->d(C)Lfc/f;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p2, p1}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 202
    .line 203
    .line 204
    if-eqz p3, :cond_8

    .line 205
    .line 206
    invoke-virtual {p2, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_8
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 211
    .line 212
    .line 213
    :cond_9
    return-void
.end method

.method public final u(Lfc/f;Lud/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfd/i;->r(Lfc/f;Lud/j;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p0, p1}, Lud/j;->b(Lfd/i;Lfc/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final v(Lfc/f;Lud/j;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lfd/i;->u(Lfc/f;Lud/j;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w(Lfc/f;Lod/c;Lud/g;)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object v0, p3, Lud/g;->k:Lud/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Lud/e;->c0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lfd/e;->c:Lud/u;

    .line 11
    .line 12
    iget-object v0, v0, Lud/u;->s:Led/c;

    .line 13
    .line 14
    iget-object v1, p2, Lod/c;->g:Lod/a;

    .line 15
    .line 16
    iget-object v1, v1, Lod/a;->g:Lqd/j;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Led/c;->c(Lqd/j;)Led/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x4000

    .line 25
    .line 26
    iget v0, v0, Led/b;->b:I

    .line 27
    .line 28
    invoke-static {v0, v1}, Lr9/e0;->G(II)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    :goto_0
    if-eqz v0, :cond_3

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Lfc/f;->j(Lhc/a;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object p2, p2, Lod/c;->j:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    invoke-virtual {p0, p1, p2}, Lfd/e;->o(Lfc/f;Lod/c;)V

    .line 51
    .line 52
    .line 53
    if-eqz p3, :cond_4

    .line 54
    .line 55
    iget-object p2, p0, Lfd/e;->b:Lud/r;

    .line 56
    .line 57
    sget-object v0, Lbc/a;->k:Lbc/a;

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Lnd/b0;->N(Lbc/a;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    sget-object p2, Loc/c;->f:Loc/c;

    .line 66
    .line 67
    iget-object p3, p3, Lmd/e;->g:Lmd/f;

    .line 68
    .line 69
    invoke-virtual {p3, p2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lnc/a;

    .line 74
    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    iget-object p2, p2, Lnc/a;->h:Ljava/lang/Object;

    .line 78
    .line 79
    if-eqz p2, :cond_4

    .line 80
    .line 81
    const-string p3, " /* "

    .line 82
    .line 83
    invoke-virtual {p1, p3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string p2, " */"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 98
    .line 99
    .line 100
    :cond_4
    return-void
.end method
