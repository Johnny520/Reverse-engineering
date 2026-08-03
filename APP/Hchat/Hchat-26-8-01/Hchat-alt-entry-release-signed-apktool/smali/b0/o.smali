.class public abstract Lb0/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ls0/d;

.field public static final b:Ls0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lb0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ls0/d;

    .line 8
    .line 9
    const v2, 0x25ecfd93

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lb0/o;->a:Ls0/d;

    .line 17
    .line 18
    new-instance v0, Lb0/n;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Lb0/n;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Ls0/d;

    .line 25
    .line 26
    const v2, -0x50ee6e26

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lb0/o;->b:Ls0/d;

    .line 33
    .line 34
    return-void
.end method

.method public static final a(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 9

    .line 1
    const v0, 0x2f1e7ec1

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
    const/4 v7, 0x4

    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v7

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v2

    .line 22
    :goto_0
    or-int/2addr v0, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p3

    .line 25
    :goto_1
    and-int/lit8 v4, p3, 0x30

    .line 26
    .line 27
    if-nez v4, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    const/16 v4, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v4, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v4

    .line 41
    :cond_3
    and-int/lit8 v4, v0, 0x13

    .line 42
    .line 43
    const/16 v5, 0x12

    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    if-eq v4, v5, :cond_4

    .line 47
    .line 48
    move v4, v6

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v4, 0x0

    .line 51
    :goto_3
    and-int/2addr v0, v6

    .line 52
    invoke-virtual {p2, v0, v4}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v4, Li0/l;->a:Li0/e;

    .line 63
    .line 64
    if-ne v0, v4, :cond_5

    .line 65
    .line 66
    sget-object v0, Li0/e;->j:Li0/e;

    .line 67
    .line 68
    new-instance v5, Li0/j1;

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    invoke-direct {v5, v8, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v5

    .line 78
    :cond_5
    check-cast v0, Li0/a1;

    .line 79
    .line 80
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-ne v5, v4, :cond_6

    .line 85
    .line 86
    new-instance v5, Lb0/j;

    .line 87
    .line 88
    invoke-direct {v5, v0, v6}, Lb0/j;-><init>(Li0/a1;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_6
    check-cast v5, Lfg/a;

    .line 95
    .line 96
    sget-object v4, Lb0/w;->a:Ly2/c0;

    .line 97
    .line 98
    sget-object v4, Lb0/o;->b:Ls0/d;

    .line 99
    .line 100
    const/4 v6, 0x6

    .line 101
    invoke-static {v4, p2, v6}, Lr9/e0;->j(Ls0/d;Li0/h0;I)Ld0/c;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v5, p2, v2}, Lb0/o;->e(Lfg/a;Li0/h0;I)Lb0/h;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    sget-object v6, Ld0/f;->b:Li0/u;

    .line 110
    .line 111
    invoke-virtual {v6, v2}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    sget-object v6, Ld0/f;->a:Li0/u;

    .line 116
    .line 117
    invoke-virtual {v6, v4}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    filled-new-array {v2, v6}, [Li0/q1;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    move-object v2, v0

    .line 126
    new-instance v0, Lb0/z;

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    move-object v1, p0

    .line 130
    move-object v3, p1

    .line 131
    invoke-direct/range {v0 .. v6}, Lb0/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    const v2, 0x3fd00381

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v0, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const/16 v2, 0x38

    .line 142
    .line 143
    invoke-static {v8, v0, p2, v2}, Li0/r;->b([Li0/q1;Lfg/p;Li0/h0;I)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 148
    .line 149
    .line 150
    :goto_4
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_8

    .line 155
    .line 156
    new-instance v2, Lb0/i;

    .line 157
    .line 158
    invoke-direct {v2, p0, p1, p3, v7}, Lb0/i;-><init>(Ly0/o;Ls0/d;II)V

    .line 159
    .line 160
    .line 161
    iput-object v2, v0, Li0/r1;->d:Lfg/p;

    .line 162
    .line 163
    :cond_8
    return-void
.end method

.method public static final b(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 9

    .line 1
    const v0, 0x94b3c0e

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
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eq v1, v2, :cond_4

    .line 46
    .line 47
    move v1, v4

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    move v1, v3

    .line 50
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 51
    .line 52
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_b

    .line 57
    .line 58
    sget-object v1, Ld0/f;->a:Li0/u;

    .line 59
    .line 60
    invoke-virtual {p2, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v1, v3

    .line 69
    :goto_4
    sget-object v2, Ld0/f;->b:Li0/u;

    .line 70
    .line 71
    invoke-virtual {p2, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_6

    .line 76
    .line 77
    move v2, v4

    .line 78
    goto :goto_5

    .line 79
    :cond_6
    move v2, v3

    .line 80
    :goto_5
    if-eqz v1, :cond_8

    .line 81
    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    const v1, -0x75d97e52    # -8.016999E-33f

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Ly0/b;->g:Ly0/g;

    .line 91
    .line 92
    invoke-static {v1, v4}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-wide v5, p2, Li0/h0;->T:J

    .line 97
    .line 98
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {p2}, Li0/h0;->l()Ls0/h;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {p2, p0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 116
    .line 117
    invoke-virtual {p2}, Li0/h0;->d0()V

    .line 118
    .line 119
    .line 120
    iget-boolean v8, p2, Li0/h0;->S:Z

    .line 121
    .line 122
    if-eqz v8, :cond_7

    .line 123
    .line 124
    invoke-virtual {p2, v7}, Li0/h0;->k(Lfg/a;)V

    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    invoke-virtual {p2}, Li0/h0;->n0()V

    .line 129
    .line 130
    .line 131
    :goto_6
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 132
    .line 133
    invoke-static {v7, p2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 137
    .line 138
    invoke-static {v1, p2, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 146
    .line 147
    invoke-static {v2, p2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 151
    .line 152
    invoke-static {v1, p2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 153
    .line 154
    .line 155
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 156
    .line 157
    invoke-static {v1, p2, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    shr-int/lit8 v0, v0, 0x3

    .line 161
    .line 162
    and-int/lit8 v0, v0, 0xe

    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p1, p2, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v4}, Li0/h0;->p(Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_8
    if-eqz v1, :cond_9

    .line 179
    .line 180
    const v1, -0x75d6974a

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 184
    .line 185
    .line 186
    and-int/lit8 v0, v0, 0x7e

    .line 187
    .line 188
    invoke-static {p0, p1, p2, v0}, Lb0/o;->c(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_9
    if-eqz v2, :cond_a

    .line 196
    .line 197
    const v1, -0x75d44a4a

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 201
    .line 202
    .line 203
    and-int/lit8 v0, v0, 0x7e

    .line 204
    .line 205
    invoke-static {p0, p1, p2, v0}, Lb0/w;->d(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_a
    const v1, -0x75d24cd9

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2, v1}, Li0/h0;->a0(I)V

    .line 216
    .line 217
    .line 218
    and-int/lit8 v0, v0, 0x7e

    .line 219
    .line 220
    invoke-static {p0, p1, p2, v0}, Lb0/o;->a(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_b
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 228
    .line 229
    .line 230
    :goto_7
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    if-eqz p2, :cond_c

    .line 235
    .line 236
    new-instance v0, Lb0/i;

    .line 237
    .line 238
    const/4 v1, 0x3

    .line 239
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/i;-><init>(Ly0/o;Ls0/d;II)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 243
    .line 244
    :cond_c
    return-void
.end method

.method public static final c(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 3

    .line 1
    const v0, 0x7b14daa1

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
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    if-eq v1, v2, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const/4 v1, 0x0

    .line 48
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    and-int/lit8 v1, v0, 0xe

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x30

    .line 59
    .line 60
    shl-int/lit8 v0, v0, 0x3

    .line 61
    .line 62
    and-int/lit16 v0, v0, 0x380

    .line 63
    .line 64
    or-int/2addr v0, v1

    .line 65
    invoke-static {p0, p1, p2, v0}, Lb0/o;->d(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 70
    .line 71
    .line 72
    :goto_4
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_6

    .line 77
    .line 78
    new-instance v0, Lb0/i;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/i;-><init>(Ly0/o;Ls0/d;II)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 85
    .line 86
    :cond_6
    return-void
.end method

.method public static final d(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 6

    .line 1
    const v0, 0x2e032b74

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
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p2, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v0, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p3, 0x180

    .line 41
    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/16 v1, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v0, v1

    .line 56
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x1

    .line 62
    if-eq v1, v3, :cond_6

    .line 63
    .line 64
    move v1, v5

    .line 65
    goto :goto_4

    .line 66
    :cond_6
    move v1, v4

    .line 67
    :goto_4
    and-int/2addr v0, v5

    .line 68
    invoke-virtual {p2, v0, v1}, Li0/h0;->S(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_9

    .line 73
    .line 74
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, Li0/l;->a:Li0/e;

    .line 79
    .line 80
    if-ne v0, v1, :cond_7

    .line 81
    .line 82
    sget-object v0, Li0/e;->j:Li0/e;

    .line 83
    .line 84
    new-instance v3, Li0/j1;

    .line 85
    .line 86
    invoke-direct {v3, v2, v0}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v0, v3

    .line 93
    :cond_7
    check-cast v0, Li0/a1;

    .line 94
    .line 95
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-ne v2, v1, :cond_8

    .line 100
    .line 101
    new-instance v2, Lb0/j;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-direct {v2, v0, v1}, Lb0/j;-><init>(Li0/a1;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_8
    check-cast v2, Lfg/a;

    .line 111
    .line 112
    invoke-static {v2, p2, v4}, Lb0/o;->e(Lfg/a;Li0/h0;I)Lb0/h;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    sget-object v2, Ld0/f;->b:Li0/u;

    .line 117
    .line 118
    invoke-virtual {v2, v1}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v2, Lb0/k;

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    invoke-direct {v2, p0, v0, p1, v3}, Lb0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    const v0, -0x115affcc

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/16 v2, 0x38

    .line 136
    .line 137
    invoke-static {v1, v0, p2, v2}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_9
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 142
    .line 143
    .line 144
    :goto_5
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    if-eqz p2, :cond_a

    .line 149
    .line 150
    new-instance v0, Lb0/i;

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/i;-><init>(Ly0/o;Ls0/d;II)V

    .line 154
    .line 155
    .line 156
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 157
    .line 158
    :cond_a
    return-void
.end method

.method public static final e(Lfg/a;Li0/h0;I)Lb0/h;
    .locals 3

    .line 1
    sget-object p2, Ly1/i0;->f:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Li0/l;->a:Li0/e;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lb0/h;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {v1, p2, v0, p0}, Lb0/h;-><init>(Landroid/view/View;Lfg/l;Lfg/a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    check-cast v1, Lb0/h;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    if-ne p2, v2, :cond_3

    .line 45
    .line 46
    :cond_2
    new-instance p2, Lb0/a;

    .line 47
    .line 48
    const/4 p0, 0x3

    .line 49
    invoke-direct {p2, v1, p0}, Lb0/a;-><init>(Lb0/h;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    check-cast p2, Lfg/l;

    .line 56
    .line 57
    invoke-static {v1, p2, p1}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 58
    .line 59
    .line 60
    return-object v1
.end method
