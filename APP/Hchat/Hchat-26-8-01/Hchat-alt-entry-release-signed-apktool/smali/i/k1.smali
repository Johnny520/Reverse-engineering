.class public final Li/k1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lb/e;

.field public final b:Li/k1;

.field public final c:Ljava/lang/String;

.field public final d:Li0/j1;

.field public final e:Li0/j1;

.field public final f:Li0/h1;

.field public final g:Li0/h1;

.field public final h:Li0/j1;

.field public final i:Lw0/p;

.field public final j:Lw0/p;

.field public final k:Li0/j1;


# direct methods
.method public constructor <init>(Lb/e;Li/k1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/k1;->a:Lb/e;

    .line 5
    .line 6
    iput-object p2, p0, Li/k1;->b:Li/k1;

    .line 7
    .line 8
    iput-object p3, p0, Li/k1;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Li/k1;->d:Li0/j1;

    .line 19
    .line 20
    new-instance p1, Li/f1;

    .line 21
    .line 22
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-direct {p1, p2, p3}, Li/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Li/k1;->e:Li0/j1;

    .line 38
    .line 39
    new-instance p1, Li0/h1;

    .line 40
    .line 41
    const-wide/16 p2, 0x0

    .line 42
    .line 43
    invoke-direct {p1, p2, p3}, Li0/h1;-><init>(J)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Li/k1;->f:Li0/h1;

    .line 47
    .line 48
    new-instance p1, Li0/h1;

    .line 49
    .line 50
    const-wide/high16 p2, -0x8000000000000000L

    .line 51
    .line 52
    invoke-direct {p1, p2, p3}, Li0/h1;-><init>(J)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Li/k1;->g:Li0/h1;

    .line 56
    .line 57
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iput-object p2, p0, Li/k1;->h:Li0/j1;

    .line 64
    .line 65
    new-instance p2, Lw0/p;

    .line 66
    .line 67
    invoke-direct {p2}, Lw0/p;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Li/k1;->i:Lw0/p;

    .line 71
    .line 72
    new-instance p2, Lw0/p;

    .line 73
    .line 74
    invoke-direct {p2}, Lw0/p;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p2, p0, Li/k1;->j:Lw0/p;

    .line 78
    .line 79
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Li/k1;->k:Li0/j1;

    .line 84
    .line 85
    new-instance p1, Li/a1;

    .line 86
    .line 87
    const/4 p2, 0x1

    .line 88
    invoke-direct {p1, p0, p2}, Li/a1;-><init>(Li/k1;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, -0x59064cff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    and-int/lit8 v0, p3, 0x8

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v0, 0x2

    .line 29
    :goto_1
    or-int/2addr v0, p3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v0, p3

    .line 32
    :goto_2
    and-int/lit8 v1, p3, 0x30

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    move v1, v2

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    const/16 v1, 0x10

    .line 47
    .line 48
    :goto_3
    or-int/2addr v0, v1

    .line 49
    :cond_4
    and-int/lit8 v1, v0, 0x13

    .line 50
    .line 51
    const/16 v3, 0x12

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    const/4 v5, 0x0

    .line 55
    if-eq v1, v3, :cond_5

    .line 56
    .line 57
    move v1, v4

    .line 58
    goto :goto_4

    .line 59
    :cond_5
    move v1, v5

    .line 60
    :goto_4
    and-int/lit8 v3, v0, 0x1

    .line 61
    .line 62
    invoke-virtual {p2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_f

    .line 67
    .line 68
    invoke-virtual {p0}, Li/k1;->g()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_e

    .line 73
    .line 74
    const v1, 0x1bc78ba1

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Li/k1;->k(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    and-int/lit8 v0, v0, 0x70

    .line 84
    .line 85
    if-ne v0, v2, :cond_6

    .line 86
    .line 87
    move v1, v4

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    move v1, v5

    .line 90
    :goto_5
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v6, Li0/l;->a:Li0/e;

    .line 95
    .line 96
    if-nez v1, :cond_7

    .line 97
    .line 98
    if-ne v3, v6, :cond_8

    .line 99
    .line 100
    :cond_7
    new-instance v1, Li/a1;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v1, p0, v3}, Li/a1;-><init>(Li/k1;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {p2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    check-cast v3, Li0/l2;

    .line 114
    .line 115
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_d

    .line 126
    .line 127
    const v1, 0x1bcdc5d4

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-ne v1, v6, :cond_9

    .line 138
    .line 139
    invoke-static {p2}, Li0/r;->n(Li0/h0;)Lqg/t;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {p2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    check-cast v1, Lqg/t;

    .line 147
    .line 148
    invoke-virtual {p2, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-ne v0, v2, :cond_a

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_a
    move v4, v5

    .line 156
    :goto_6
    or-int v0, v3, v4

    .line 157
    .line 158
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-nez v0, :cond_b

    .line 163
    .line 164
    if-ne v2, v6, :cond_c

    .line 165
    .line 166
    :cond_b
    new-instance v2, Lc9/i;

    .line 167
    .line 168
    const/16 v0, 0xf

    .line 169
    .line 170
    invoke-direct {v2, v1, v0, p0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_c
    check-cast v2, Lfg/l;

    .line 177
    .line 178
    invoke-static {v1, p0, v2, p2}, Li0/r;->d(Ljava/lang/Object;Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_d
    const v0, 0x1be0bba1

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 192
    .line 193
    .line 194
    :goto_7
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_e
    const v0, 0x1be0e261

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v0}, Li0/h0;->a0(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_f
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 209
    .line 210
    .line 211
    :goto_8
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    if-eqz p2, :cond_10

    .line 216
    .line 217
    new-instance v0, Li/b1;

    .line 218
    .line 219
    const/4 v1, 0x0

    .line 220
    invoke-direct {v0, p0, p1, p3, v1}, Li/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 221
    .line 222
    .line 223
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 224
    .line 225
    :cond_10
    return-void
.end method

.method public final b()J
    .locals 8

    .line 1
    iget-object v0, p0, Li/k1;->i:Lw0/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    move v5, v4

    .line 11
    :goto_0
    if-ge v5, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Li/g1;

    .line 18
    .line 19
    iget-object v6, v6, Li/g1;->p:Li0/h1;

    .line 20
    .line 21
    invoke-virtual {v6}, Li0/h1;->g()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Li/k1;->j:Lw0/p;

    .line 33
    .line 34
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_1
    if-ge v4, v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v4}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Li/k1;

    .line 45
    .line 46
    invoke-virtual {v5}, Li/k1;->b()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    return-wide v2
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li/k1;->a:Lb/e;

    .line 2
    .line 3
    iget-object v0, v0, Lb/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li0/j1;

    .line 6
    .line 7
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final d()Z
    .locals 5

    .line 1
    iget-object v0, p0, Li/k1;->i:Lw0/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Li/g1;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Li/k1;->j:Lw0/p;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    move v3, v2

    .line 30
    :goto_1
    if-ge v3, v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Li/k1;

    .line 37
    .line 38
    invoke-virtual {v4}, Li/k1;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return v2
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-object v0, p0, Li/k1;->b:Li/k1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li/k1;->e()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-object v0, p0, Li/k1;->f:Li0/h1;

    .line 11
    .line 12
    invoke-virtual {v0}, Li0/h1;->g()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final f()Li/e1;
    .locals 1

    .line 1
    iget-object v0, p0, Li/k1;->e:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li/e1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/k1;->k:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final h(JZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Li/k1;->a:Lb/e;

    .line 2
    .line 3
    iget-object v1, v0, Lb/e;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li0/j1;

    .line 6
    .line 7
    iget-object v2, p0, Li/k1;->g:Li0/h1;

    .line 8
    .line 9
    invoke-virtual {v2}, Li0/h1;->g()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    const-wide/high16 v5, -0x8000000000000000L

    .line 14
    .line 15
    cmp-long v3, v3, v5

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, p1, p2}, Li0/h1;->h(J)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lb/e;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Li0/j1;

    .line 25
    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Li/k1;->h:Li0/j1;

    .line 50
    .line 51
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Li/k1;->i:Lw0/p;

    .line 57
    .line 58
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/4 v2, 0x0

    .line 63
    const/4 v3, 0x1

    .line 64
    move v4, v2

    .line 65
    :goto_1
    if-ge v4, v1, :cond_5

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Li/g1;

    .line 72
    .line 73
    iget-object v6, v5, Li/g1;->k:Li0/j1;

    .line 74
    .line 75
    iget-object v7, v5, Li/g1;->k:Li0/j1;

    .line 76
    .line 77
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    if-eqz p3, :cond_2

    .line 90
    .line 91
    invoke-virtual {v5}, Li/g1;->a()Li/z0;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Li/z0;->b()J

    .line 96
    .line 97
    .line 98
    move-result-wide v8

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move-wide v8, p1

    .line 101
    :goto_2
    invoke-virtual {v5}, Li/g1;->a()Li/z0;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v6, v8, v9}, Li/z0;->f(J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iget-object v10, v5, Li/g1;->n:Li0/j1;

    .line 110
    .line 111
    invoke-virtual {v10, v6}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Li/g1;->a()Li/z0;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-virtual {v6, v8, v9}, Li/z0;->d(J)Li/q;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iput-object v6, v5, Li/g1;->o:Li/q;

    .line 123
    .line 124
    invoke-virtual {v5}, Li/g1;->a()Li/z0;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-interface {v5, v8, v9}, Li/g;->e(J)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_3

    .line 133
    .line 134
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v7, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_4

    .line 150
    .line 151
    move v3, v2

    .line 152
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    iget-object v0, p0, Li/k1;->j:Lw0/p;

    .line 156
    .line 157
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    move v4, v2

    .line 162
    :goto_3
    if-ge v4, v1, :cond_8

    .line 163
    .line 164
    invoke-virtual {v0, v4}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Li/k1;

    .line 169
    .line 170
    iget-object v6, v5, Li/k1;->d:Li0/j1;

    .line 171
    .line 172
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v5}, Li/k1;->c()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-nez v6, :cond_6

    .line 185
    .line 186
    invoke-virtual {v5, p1, p2, p3}, Li/k1;->h(JZ)V

    .line 187
    .line 188
    .line 189
    :cond_6
    iget-object v6, v5, Li/k1;->d:Li0/j1;

    .line 190
    .line 191
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v5}, Li/k1;->c()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-static {v6, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_7

    .line 204
    .line 205
    move v3, v2

    .line 206
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_8
    if-eqz v3, :cond_9

    .line 210
    .line 211
    invoke-virtual {p0}, Li/k1;->i()V

    .line 212
    .line 213
    .line 214
    :cond_9
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    iget-object v2, p0, Li/k1;->g:Li0/h1;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Li0/h1;->h(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li/k1;->d:Li0/j1;

    .line 9
    .line 10
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Li/k1;->a:Lb/e;

    .line 15
    .line 16
    iget-object v2, v1, Lb/e;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Li0/j1;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Li/k1;->b:Li/k1;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Li/k1;->f:Li0/h1;

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Li0/h1;->h(J)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, v1, Lb/e;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Li0/j1;

    .line 37
    .line 38
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Li/k1;->j:Lw0/p;

    .line 44
    .line 45
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_0
    if-ge v2, v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Li/k1;

    .line 57
    .line 58
    invoke-virtual {v3}, Li/k1;->i()V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    iget-object v2, p0, Li/k1;->g:Li0/h1;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Li0/h1;->h(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li/k1;->a:Lb/e;

    .line 9
    .line 10
    iget-object v1, v0, Lb/e;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li0/j1;

    .line 13
    .line 14
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Li/k1;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Li/k1;->d:Li0/j1;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    iget-object v0, v0, Lb/e;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Li0/j1;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2, p2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Li/k1;->k:Li0/j1;

    .line 68
    .line 69
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Li/f1;

    .line 75
    .line 76
    invoke-direct {v0, p1, p2}, Li/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Li/k1;->e:Li0/j1;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object p1, p0, Li/k1;->j:Lw0/p;

    .line 85
    .line 86
    invoke-virtual {p1}, Lw0/p;->size()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    const/4 v0, 0x0

    .line 91
    move v1, v0

    .line 92
    :goto_0
    if-ge v1, p2, :cond_4

    .line 93
    .line 94
    invoke-virtual {p1, v1}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Li/k1;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Li/k1;->g()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2}, Li/k1;->c()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, v2, Li/k1;->d:Li0/j1;

    .line 114
    .line 115
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v2, v3, v4}, Li/k1;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    iget-object p1, p0, Li/k1;->i:Lw0/p;

    .line 126
    .line 127
    invoke-virtual {p1}, Lw0/p;->size()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    :goto_1
    if-ge v0, p2, :cond_5

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Li/g1;

    .line 138
    .line 139
    invoke-virtual {v1}, Li/g1;->d()V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    return-void
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li/k1;->d:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    new-instance v1, Li/f1;

    .line 14
    .line 15
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2, p1}, Li/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Li/k1;->e:Li0/j1;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, Li/k1;->a:Lb/e;

    .line 46
    .line 47
    iget-object v2, v2, Lb/e;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Li0/j1;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Li/k1;->g:Li0/h1;

    .line 58
    .line 59
    invoke-virtual {p1}, Li0/h1;->g()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/high16 v2, -0x8000000000000000L

    .line 64
    .line 65
    cmp-long p1, v0, v2

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object p1, p0, Li/k1;->h:Li0/j1;

    .line 71
    .line 72
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iget-object p1, p0, Li/k1;->i:Lw0/p;

    .line 78
    .line 79
    invoke-virtual {p1}, Lw0/p;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/4 v1, 0x0

    .line 84
    :goto_1
    if-ge v1, v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Li/g1;

    .line 91
    .line 92
    const/high16 v3, -0x40000000    # -2.0f

    .line 93
    .line 94
    iget-object v2, v2, Li/g1;->l:Li0/f1;

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Li0/f1;->h(F)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Li/k1;->i:Lw0/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "Transition animation values: "

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Li/g1;

    .line 17
    .line 18
    new-instance v5, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", "

    .line 30
    .line 31
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v2
.end method
