.class public abstract Li0/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Li0/a0;

.field public static final c:Lb8/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li0/r;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Li0/a0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Li0/r;->b:Li0/a0;

    .line 14
    .line 15
    new-instance v0, Lb8/c;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, v1}, Lb8/c;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Li0/r;->c:Lb8/c;

    .line 22
    .line 23
    return-void
.end method

.method public static final A(Lfg/p;Li0/h0;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Li0/h0;->S:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0, p2}, Li0/h0;->b(Lfg/p;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final B(Lfg/a;)Lm/a;
    .locals 2

    .line 1
    new-instance v0, Lf0/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lf0/b;-><init>(Lfg/a;Lwf/c;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lm/a;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lm/a;-><init>(Lfg/p;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static final C(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final D([Li0/q1;Ls0/h;Ls0/h;)Ls0/h;
    .locals 6

    .line 1
    sget-object v0, Ls0/h;->j:Ls0/h;

    .line 2
    .line 3
    new-instance v1, Ls0/g;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ls0/g;-><init>(Ls0/h;)V

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    iget-object v4, v3, Li0/q1;->a:Li0/p1;

    .line 15
    .line 16
    iget-boolean v5, v3, Li0/q1;->f:Z

    .line 17
    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Ls0/h;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p2, v4}, Ls0/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Li0/p2;

    .line 31
    .line 32
    invoke-virtual {v4, v3, v5}, Li0/p1;->c(Li0/q1;Li0/p2;)Li0/p2;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v4, v3}, Ls0/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v1}, Ls0/g;->a()Ls0/h;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final a(Li0/q1;Ls0/d;Li0/h0;I)V
    .locals 11

    .line 1
    const v0, -0x8ed3d8b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Li0/h0;->x:Li0/m0;

    .line 8
    .line 9
    invoke-virtual {p2}, Li0/h0;->l()Ls0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0xc9

    .line 14
    .line 15
    sget-object v3, Li0/m;->b:Li0/d1;

    .line 16
    .line 17
    invoke-virtual {p2, v2, v3}, Li0/h0;->Y(ILi0/d1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v3, Li0/l;->a:Li0/e;

    .line 25
    .line 26
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move-object v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v2, Li0/p2;

    .line 39
    .line 40
    :goto_0
    iget-object v3, p0, Li0/q1;->a:Li0/p1;

    .line 41
    .line 42
    invoke-virtual {v3, p0, v2}, Li0/p1;->c(Li0/q1;Li0/p2;)Li0/p2;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-boolean v6, p2, Li0/h0;->S:Z

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    const/4 v8, 0x0

    .line 59
    if-eqz v6, :cond_5

    .line 60
    .line 61
    iget-boolean v2, p0, Li0/q1;->f:Z

    .line 62
    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ls0/h;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    :cond_2
    invoke-virtual {v1, v3, v5}, Ls0/h;->c(Li0/p1;Li0/p2;)Ls0/h;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_3
    iput-boolean v7, p2, Li0/h0;->J:Z

    .line 76
    .line 77
    :cond_4
    move v2, v8

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    iget-object v6, p2, Li0/h0;->G:Ll0/g;

    .line 80
    .line 81
    iget v9, v6, Ll0/g;->g:I

    .line 82
    .line 83
    iget-object v10, v6, Ll0/g;->b:[I

    .line 84
    .line 85
    invoke-virtual {v6, v10, v9}, Ll0/g;->b([II)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v6, Ls0/h;

    .line 93
    .line 94
    invoke-virtual {p2}, Li0/h0;->E()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_6

    .line 99
    .line 100
    if-nez v2, :cond_7

    .line 101
    .line 102
    :cond_6
    iget-boolean v9, p0, Li0/q1;->f:Z

    .line 103
    .line 104
    if-nez v9, :cond_a

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Ls0/h;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_7

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    if-eqz v2, :cond_8

    .line 114
    .line 115
    iget-boolean v2, p2, Li0/h0;->w:Z

    .line 116
    .line 117
    if-nez v2, :cond_8

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    iget-boolean v2, p2, Li0/h0;->w:Z

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_9
    :goto_1
    move-object v1, v6

    .line 126
    goto :goto_3

    .line 127
    :cond_a
    :goto_2
    invoke-virtual {v1, v3, v5}, Ls0/h;->c(Li0/p1;Li0/p2;)Ls0/h;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_3
    iget-boolean v2, p2, Li0/h0;->y:Z

    .line 132
    .line 133
    if-nez v2, :cond_b

    .line 134
    .line 135
    if-eq v6, v1, :cond_4

    .line 136
    .line 137
    :cond_b
    move v2, v7

    .line 138
    :goto_4
    if-eqz v2, :cond_c

    .line 139
    .line 140
    iget-boolean v3, p2, Li0/h0;->S:Z

    .line 141
    .line 142
    if-nez v3, :cond_c

    .line 143
    .line 144
    invoke-virtual {p2, v1}, Li0/h0;->N(Ls0/h;)V

    .line 145
    .line 146
    .line 147
    :cond_c
    iget-boolean v3, p2, Li0/h0;->w:Z

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Li0/m0;->c(I)V

    .line 150
    .line 151
    .line 152
    iput-boolean v2, p2, Li0/h0;->w:Z

    .line 153
    .line 154
    iput-object v1, p2, Li0/h0;->K:Ls0/h;

    .line 155
    .line 156
    const/16 v2, 0xca

    .line 157
    .line 158
    sget-object v3, Li0/m;->c:Li0/d1;

    .line 159
    .line 160
    invoke-virtual {p2, v2, v3, v1, v8}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    shr-int/lit8 v1, p3, 0x3

    .line 164
    .line 165
    and-int/lit8 v1, v1, 0xe

    .line 166
    .line 167
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {p1, p2, v1}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v8}, Li0/h0;->p(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v8}, Li0/h0;->p(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Li0/m0;->b()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_d

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_d
    move v7, v8

    .line 188
    :goto_5
    iput-boolean v7, p2, Li0/h0;->w:Z

    .line 189
    .line 190
    iput-object v4, p2, Li0/h0;->K:Ls0/h;

    .line 191
    .line 192
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    if-eqz p2, :cond_e

    .line 197
    .line 198
    new-instance v0, Li/b1;

    .line 199
    .line 200
    const/4 v1, 0x1

    .line 201
    invoke-direct {v0, p0, p1, p3, v1}, Li/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 202
    .line 203
    .line 204
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 205
    .line 206
    :cond_e
    return-void
.end method

.method public static final b([Li0/q1;Lfg/p;Li0/h0;I)V
    .locals 8

    .line 1
    const v0, 0x18bf8a0a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Li0/h0;->x:Li0/m0;

    .line 8
    .line 9
    invoke-virtual {p2}, Li0/h0;->l()Ls0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0xc9

    .line 14
    .line 15
    sget-object v3, Li0/m;->b:Li0/d1;

    .line 16
    .line 17
    invoke-virtual {p2, v2, v3}, Li0/h0;->Y(ILi0/d1;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v2, p2, Li0/h0;->S:Z

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v2, Ls0/h;->j:Ls0/h;

    .line 27
    .line 28
    invoke-static {p0, v1, v2}, Li0/r;->D([Li0/q1;Ls0/h;Ls0/h;)Ls0/h;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p2, v1, v2}, Li0/h0;->j0(Ls0/h;Ls0/h;)Ls0/h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-boolean v3, p2, Li0/h0;->J:Z

    .line 37
    .line 38
    :cond_0
    :goto_0
    move v2, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iget-object v2, p2, Li0/h0;->G:Ll0/g;

    .line 41
    .line 42
    iget v5, v2, Ll0/g;->g:I

    .line 43
    .line 44
    invoke-virtual {v2, v5, v4}, Ll0/g;->h(II)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v2, Ls0/h;

    .line 52
    .line 53
    iget-object v5, p2, Li0/h0;->G:Ll0/g;

    .line 54
    .line 55
    iget v6, v5, Ll0/g;->g:I

    .line 56
    .line 57
    invoke-virtual {v5, v6, v3}, Ll0/g;->h(II)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast v5, Ls0/h;

    .line 65
    .line 66
    invoke-static {p0, v1, v5}, Li0/r;->D([Li0/q1;Ls0/h;Ls0/h;)Ls0/h;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {p2}, Li0/h0;->E()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    iget-boolean v7, p2, Li0/h0;->y:Z

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Lp0/b;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-nez v5, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    iget v1, p2, Li0/h0;->l:I

    .line 88
    .line 89
    iget-object v5, p2, Li0/h0;->G:Ll0/g;

    .line 90
    .line 91
    invoke-virtual {v5}, Ll0/g;->s()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    add-int/2addr v5, v1

    .line 96
    iput v5, p2, Li0/h0;->l:I

    .line 97
    .line 98
    move-object v1, v2

    .line 99
    goto :goto_0

    .line 100
    :cond_3
    :goto_1
    invoke-virtual {p2, v1, v6}, Li0/h0;->j0(Ls0/h;Ls0/h;)Ls0/h;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-boolean v5, p2, Li0/h0;->y:Z

    .line 105
    .line 106
    if-nez v5, :cond_4

    .line 107
    .line 108
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_0

    .line 113
    .line 114
    :cond_4
    move v2, v3

    .line 115
    :goto_2
    if-eqz v2, :cond_5

    .line 116
    .line 117
    iget-boolean v5, p2, Li0/h0;->S:Z

    .line 118
    .line 119
    if-nez v5, :cond_5

    .line 120
    .line 121
    invoke-virtual {p2, v1}, Li0/h0;->N(Ls0/h;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    iget-boolean v5, p2, Li0/h0;->w:Z

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Li0/m0;->c(I)V

    .line 127
    .line 128
    .line 129
    iput-boolean v2, p2, Li0/h0;->w:Z

    .line 130
    .line 131
    iput-object v1, p2, Li0/h0;->K:Ls0/h;

    .line 132
    .line 133
    const/16 v2, 0xca

    .line 134
    .line 135
    sget-object v5, Li0/m;->c:Li0/d1;

    .line 136
    .line 137
    invoke-virtual {p2, v2, v5, v1, v4}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    shr-int/lit8 v1, p3, 0x3

    .line 141
    .line 142
    and-int/lit8 v1, v1, 0xe

    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {p1, p2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v4}, Li0/h0;->p(Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v4}, Li0/h0;->p(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Li0/m0;->b()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    move v3, v4

    .line 165
    :goto_3
    iput-boolean v3, p2, Li0/h0;->w:Z

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    iput-object v0, p2, Li0/h0;->K:Ls0/h;

    .line 169
    .line 170
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    if-eqz p2, :cond_7

    .line 175
    .line 176
    new-instance v0, Li/b1;

    .line 177
    .line 178
    const/4 v1, 0x2

    .line 179
    invoke-direct {v0, p0, p1, p3, v1}, Li/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 180
    .line 181
    .line 182
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 183
    .line 184
    :cond_7
    return-void
.end method

.method public static final c(Ljava/lang/Object;Lfg/l;Li0/h0;)V
    .locals 1

    .line 1
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Li0/l;->a:Li0/e;

    .line 12
    .line 13
    if-ne v0, p0, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Li0/y;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Li0/y;-><init>(Lfg/l;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    check-cast v0, Li0/y;

    .line 24
    .line 25
    return-void
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;Lfg/l;Li0/h0;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    or-int/2addr p0, p1

    .line 10
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, Li0/l;->a:Li0/e;

    .line 17
    .line 18
    if-ne p1, p0, :cond_1

    .line 19
    .line 20
    :cond_0
    new-instance p1, Li0/y;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Li0/y;-><init>(Lfg/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    check-cast p1, Li0/y;

    .line 29
    .line 30
    return-void
.end method

.method public static final e([Ljava/lang/Object;Lfg/l;Li0/h0;)V
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    array-length v0, p0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    aget-object v3, p0, v1

    .line 12
    .line 13
    invoke-virtual {p2, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    or-int/2addr v2, v3

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    sget-object v0, Li0/l;->a:Li0/e;

    .line 28
    .line 29
    if-ne p0, v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    return-void

    .line 33
    :cond_2
    :goto_1
    new-instance p0, Li0/y;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Li0/y;-><init>(Lfg/l;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final f(Lfg/p;Li0/h0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, Li0/h0;->R:Lwf/g;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p2, Li0/l;->a:Li0/e;

    .line 14
    .line 15
    if-ne v1, p2, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance v1, Li0/r0;

    .line 18
    .line 19
    invoke-direct {v1, v0, p0}, Li0/r0;-><init>(Lwf/g;Lfg/p;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    check-cast v1, Li0/r0;

    .line 26
    .line 27
    return-void
.end method

.method public static final g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V
    .locals 1

    .line 1
    iget-object v0, p3, Li0/h0;->R:Lwf/g;

    .line 2
    .line 3
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    or-int/2addr p0, p1

    .line 12
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Li0/l;->a:Li0/e;

    .line 19
    .line 20
    if-ne p1, p0, :cond_1

    .line 21
    .line 22
    :cond_0
    new-instance p1, Li0/r0;

    .line 23
    .line 24
    invoke-direct {p1, v0, p2}, Li0/r0;-><init>(Lwf/g;Lfg/p;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    check-cast p1, Li0/r0;

    .line 31
    .line 32
    return-void
.end method

.method public static final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V
    .locals 1

    .line 1
    iget-object v0, p4, Li0/h0;->R:Lwf/g;

    .line 2
    .line 3
    invoke-virtual {p4, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    or-int/2addr p0, p1

    .line 12
    invoke-virtual {p4, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    or-int/2addr p0, p1

    .line 17
    invoke-virtual {p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    sget-object p0, Li0/l;->a:Li0/e;

    .line 24
    .line 25
    if-ne p1, p0, :cond_1

    .line 26
    .line 27
    :cond_0
    new-instance p1, Li0/r0;

    .line 28
    .line 29
    invoke-direct {p1, v0, p3}, Li0/r0;-><init>(Lwf/g;Lfg/p;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p4, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast p1, Li0/r0;

    .line 36
    .line 37
    return-void
.end method

.method public static final i([Ljava/lang/Object;Lfg/p;Li0/h0;)V
    .locals 5

    .line 1
    iget-object v0, p2, Li0/h0;->R:Lwf/g;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    aget-object v4, p0, v2

    .line 14
    .line 15
    invoke-virtual {p2, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    or-int/2addr v3, v4

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    sget-object v1, Li0/l;->a:Li0/e;

    .line 30
    .line 31
    if-ne p0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    return-void

    .line 35
    :cond_2
    :goto_1
    new-instance p0, Li0/r0;

    .line 36
    .line 37
    invoke-direct {p0, v0, p1}, Li0/r0;-><init>(Lwf/g;Lfg/p;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final j(Lfg/a;Li0/h0;)V
    .locals 1

    .line 1
    iget-object p1, p1, Li0/h0;->M:Lm0/b;

    .line 2
    .line 3
    iget-object p1, p1, Lm0/b;->b:Lm0/a;

    .line 4
    .line 5
    iget-object p1, p1, Lm0/a;->j:Lm0/l0;

    .line 6
    .line 7
    sget-object v0, Lm0/b0;->c:Lm0/b0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lm0/l0;->U(Lm0/j0;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lf8/i;->F0(Lm0/l0;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final k(Ljava/util/List;II)V
    .locals 1

    .line 1
    invoke-static {p1, p0}, Li0/r;->q(ILjava/util/List;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    neg-int p1, p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ge p1, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Li0/n0;

    .line 21
    .line 22
    iget v0, v0, Li0/n0;->b:I

    .line 23
    .line 24
    if-ge v0, p2, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Li0/n0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public static l(Ll0/k;Ljava/util/List;Li0/q;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_3

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ll0/b;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ll0/k;->c(Ll0/b;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0, v2}, Ll0/k;->r(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget-object v4, p0, Ll0/k;->b:[I

    .line 29
    .line 30
    invoke-virtual {p0, v4, v3}, Ll0/k;->N([II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object v4, p0, Ll0/k;->b:[I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ll0/k;->r(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v4, v2}, Ll0/k;->g([II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v3, v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Ll0/k;->h(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, Ll0/k;->c:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object v2, v3, v2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v2, Li0/l;->a:Li0/e;

    .line 58
    .line 59
    :goto_1
    instance-of v3, v2, Li0/r1;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Li0/r1;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    :goto_2
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iput-object p2, v2, Li0/r1;->a:Li0/q;

    .line 70
    .line 71
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-void
.end method

.method public static final m(Ll0/g;Ljava/util/ArrayList;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Ll0/g;->l(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ll0/g;->b:[I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ll0/g;->n(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    add-int/lit8 v0, p2, 0x1

    .line 18
    .line 19
    mul-int/lit8 v2, p2, 0x5

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x3

    .line 22
    .line 23
    aget v2, v1, v2

    .line 24
    .line 25
    add-int/2addr v2, p2

    .line 26
    :goto_0
    if-ge v0, v2, :cond_1

    .line 27
    .line 28
    invoke-static {p0, p1, v0}, Li0/r;->m(Ll0/g;Ljava/util/ArrayList;I)V

    .line 29
    .line 30
    .line 31
    mul-int/lit8 p2, v0, 0x5

    .line 32
    .line 33
    add-int/lit8 p2, p2, 0x3

    .line 34
    .line 35
    aget p2, v1, p2

    .line 36
    .line 37
    add-int/2addr v0, p2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method

.method public static final n(Li0/h0;)Lqg/t;
    .locals 1

    .line 1
    iget-object p0, p0, Li0/h0;->R:Lwf/g;

    .line 2
    .line 3
    new-instance v0, Li0/c2;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Li0/c2;-><init>(Lwf/g;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final o()Lj0/b;
    .locals 3

    .line 1
    sget-object v0, Li0/k2;->b:Lb5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/c;->o()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lj0/b;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lj0/b;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [Li0/g0;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lb5/c;->O(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final p(Lfg/a;)Li0/x;
    .locals 2

    .line 1
    sget-object v0, Li0/k2;->a:Lb5/c;

    .line 2
    .line 3
    new-instance v0, Li0/x;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Li0/x;-><init>(Lfg/a;Li0/e;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final q(ILjava/util/List;)I
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-gt v1, v0, :cond_2

    .line 9
    .line 10
    add-int v2, v1, v0

    .line 11
    .line 12
    ushr-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Li0/n0;

    .line 19
    .line 20
    iget v3, v3, Li0/n0;->b:I

    .line 21
    .line 22
    invoke-static {v3, p0}, Lgg/l;->c(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-gez v3, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-lez v3, :cond_1

    .line 32
    .line 33
    add-int/lit8 v0, v2, -0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v2

    .line 37
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    neg-int p0, v1

    .line 40
    return p0
.end method

.method public static final r(Li0/h0;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/h0;->T:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final s(Lwf/g;)Li0/d;
    .locals 1

    .line 1
    sget-object v0, Li0/e;->i:Li0/e;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li0/d;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    .line 13
    .line 14
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Li0/h0;->b(Lfg/p;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static u(Ljava/lang/Object;)Li0/j1;
    .locals 2

    .line 1
    sget-object v0, Li0/e;->m:Li0/e;

    .line 2
    .line 3
    new-instance v1, Li0/j1;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static final v(Ls0/h;Li0/p1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ls0/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Li0/p1;->b()Li0/p2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    check-cast v0, Li0/p2;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Li0/p2;->a(Ls0/h;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final w(Lfg/l;Li0/h0;)V
    .locals 2

    .line 1
    new-instance v0, Lb0/t;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    invoke-virtual {p1, v0, p0}, Li0/h0;->b(Lfg/p;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final x(Li0/h0;)Li0/f0;
    .locals 9

    .line 1
    const/16 v0, 0xce

    .line 2
    .line 3
    sget-object v1, Li0/m;->e:Li0/d1;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Li0/h0;->Y(ILi0/d1;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Li0/h0;->S:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Li0/h0;->I:Ll0/k;

    .line 13
    .line 14
    invoke-static {v0}, Ll0/k;->z(Ll0/k;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Li0/h0;->H()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Li0/k0;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast v0, Li0/k0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_2

    .line 30
    .line 31
    new-instance v0, Li0/d2;

    .line 32
    .line 33
    new-instance v1, Li0/e0;

    .line 34
    .line 35
    new-instance v2, Li0/f0;

    .line 36
    .line 37
    iget-wide v4, p0, Li0/h0;->T:J

    .line 38
    .line 39
    iget-boolean v6, p0, Li0/h0;->q:Z

    .line 40
    .line 41
    iget-boolean v7, p0, Li0/h0;->C:Z

    .line 42
    .line 43
    iget-object v3, p0, Li0/h0;->h:Li0/q;

    .line 44
    .line 45
    iget-object v8, v3, Li0/q;->z:Landroidx/lifecycle/x;

    .line 46
    .line 47
    move-object v3, p0

    .line 48
    invoke-direct/range {v2 .. v8}, Li0/f0;-><init>(Li0/h0;JZZLandroidx/lifecycle/x;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2}, Li0/e0;-><init>(Li0/f0;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, -0x1

    .line 55
    invoke-direct {v0, v1, p0}, Li0/k0;-><init>(Li0/a2;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v0}, Li0/h0;->l0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move-object v3, p0

    .line 63
    :goto_1
    iget-object p0, v0, Li0/k0;->a:Li0/a2;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    check-cast p0, Li0/e0;

    .line 69
    .line 70
    iget-object p0, p0, Li0/e0;->g:Li0/f0;

    .line 71
    .line 72
    invoke-virtual {v3}, Li0/h0;->l()Ls0/h;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Li0/f0;->f:Li0/j1;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {v3, v0}, Li0/h0;->p(Z)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public static final y(Ljava/lang/Object;Li0/h0;)Li0/a1;
    .locals 2

    .line 1
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li0/l;->a:Li0/e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    check-cast v0, Li0/a1;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final z(Ll0/k;ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ll0/k;->h(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p0, p0, Ll0/k;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v0, p0, p1

    .line 8
    .line 9
    sget-object v1, Li0/l;->a:Li0/e;

    .line 10
    .line 11
    aput-object v1, p0, p1

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string p1, "Slot table is out of sync (expected "

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, ", got "

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x29

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Li0/m;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
