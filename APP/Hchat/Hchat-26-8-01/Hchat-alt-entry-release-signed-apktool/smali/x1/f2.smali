.class public final Lx1/f2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/a;


# instance fields
.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx1/f0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/f2;->g:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lx1/f2;->h:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f2;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx1/f2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p0, Lx1/f2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lx1/f0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lx1/f0;->P()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lx1/f0;

    .line 2
    .line 3
    iget-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lx1/f0;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lx1/f0;->A(ILx1/f0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/f2;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final f()V
    .locals 8

    .line 1
    iget-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1/f0;

    .line 4
    .line 5
    iget-object v1, v0, Lx1/f0;->L:Lx1/b1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lx1/f0;->G()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-string v2, "onReuse is only expected on attached node"

    .line 14
    .line 15
    invoke-static {v2}, Lu1/a;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v2, v0, Lx1/f0;->u:Lx2/v;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v3, v2, Lx2/h;->h:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eq v4, v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v2, v2, Lx2/h;->l:Lfg/a;

    .line 35
    .line 36
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    iget-object v2, v0, Lx1/f0;->N:Lv1/j0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lv1/j0;->i(Z)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iput-boolean v3, v0, Lx1/f0;->z:Z

    .line 48
    .line 49
    iget-boolean v2, v0, Lx1/f0;->W:Z

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iput-boolean v3, v0, Lx1/f0;->W:Z

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_4
    iget-object v2, v0, Lx1/f0;->L:Lx1/b1;

    .line 57
    .line 58
    iget-object v2, v2, Lx1/b1;->e:Lx1/b2;

    .line 59
    .line 60
    move-object v4, v2

    .line 61
    :goto_1
    if-eqz v4, :cond_6

    .line 62
    .line 63
    iget-boolean v5, v4, Ly0/n;->t:Z

    .line 64
    .line 65
    if-eqz v5, :cond_5

    .line 66
    .line 67
    invoke-virtual {v4}, Ly0/n;->f1()V

    .line 68
    .line 69
    .line 70
    :cond_5
    iget-object v4, v4, Ly0/n;->k:Ly0/n;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_6
    move-object v4, v2

    .line 74
    :goto_2
    if-eqz v4, :cond_8

    .line 75
    .line 76
    iget-boolean v5, v4, Ly0/n;->t:Z

    .line 77
    .line 78
    if-eqz v5, :cond_7

    .line 79
    .line 80
    invoke-virtual {v4}, Ly0/n;->h1()V

    .line 81
    .line 82
    .line 83
    :cond_7
    iget-object v4, v4, Ly0/n;->k:Ly0/n;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_8
    :goto_3
    if-eqz v2, :cond_a

    .line 87
    .line 88
    iget-boolean v4, v2, Ly0/n;->t:Z

    .line 89
    .line 90
    if-eqz v4, :cond_9

    .line 91
    .line 92
    invoke-virtual {v2}, Ly0/n;->b1()V

    .line 93
    .line 94
    .line 95
    :cond_9
    iget-object v2, v2, Ly0/n;->k:Ly0/n;

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_a
    :goto_4
    iget v2, v0, Lx1/f0;->h:I

    .line 99
    .line 100
    iget-object v4, v0, Lx1/f0;->t:Lx1/r1;

    .line 101
    .line 102
    if-eqz v4, :cond_b

    .line 103
    .line 104
    check-cast v4, Ly1/t;

    .line 105
    .line 106
    invoke-virtual {v4}, Ly1/t;->getRectManager()Lg2/b;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eqz v4, :cond_b

    .line 111
    .line 112
    invoke-virtual {v4, v0}, Lg2/b;->g(Lx1/f0;)V

    .line 113
    .line 114
    .line 115
    :cond_b
    sget-object v4, Lf2/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    iput v4, v0, Lx1/f0;->h:I

    .line 123
    .line 124
    iget-object v4, v0, Lx1/f0;->t:Lx1/r1;

    .line 125
    .line 126
    if-eqz v4, :cond_c

    .line 127
    .line 128
    check-cast v4, Ly1/t;

    .line 129
    .line 130
    invoke-virtual {v4}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6, v2}, Lf/w;->g(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ly1/t;->getLayoutNodes()Lf/w;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    iget v6, v0, Lx1/f0;->h:I

    .line 142
    .line 143
    invoke-virtual {v4, v6, v0}, Lf/w;->h(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_c
    iget-object v4, v1, Lx1/b1;->f:Ly0/n;

    .line 147
    .line 148
    :goto_5
    if-eqz v4, :cond_d

    .line 149
    .line 150
    invoke-virtual {v4}, Ly0/n;->a1()V

    .line 151
    .line 152
    .line 153
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_d
    invoke-virtual {v1}, Lx1/b1;->e()V

    .line 157
    .line 158
    .line 159
    const/16 v4, 0x8

    .line 160
    .line 161
    invoke-virtual {v1, v4}, Lx1/b1;->d(I)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_e

    .line 166
    .line 167
    invoke-virtual {v0}, Lx1/f0;->E()V

    .line 168
    .line 169
    .line 170
    :cond_e
    invoke-static {v0}, Lx1/f0;->W(Lx1/f0;)V

    .line 171
    .line 172
    .line 173
    iget-object v1, v0, Lx1/f0;->t:Lx1/r1;

    .line 174
    .line 175
    if-eqz v1, :cond_10

    .line 176
    .line 177
    check-cast v1, Ly1/t;

    .line 178
    .line 179
    iget-object v1, v1, Ly1/t;->T:Lz0/c;

    .line 180
    .line 181
    if-eqz v1, :cond_10

    .line 182
    .line 183
    iget-object v4, v1, Lz0/c;->i:Ly1/t;

    .line 184
    .line 185
    iget-object v6, v1, Lz0/c;->g:Lxe/e;

    .line 186
    .line 187
    iget-object v1, v1, Lz0/c;->n:Lf/x;

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Lf/x;->e(I)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    if-eqz v7, :cond_f

    .line 194
    .line 195
    invoke-virtual {v6, v4, v2, v3}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 196
    .line 197
    .line 198
    :cond_f
    invoke-virtual {v0}, Lx1/f0;->w()Lf2/m;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eqz v2, :cond_10

    .line 203
    .line 204
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 205
    .line 206
    sget-object v3, Lf2/u;->q:Lf2/x;

    .line 207
    .line 208
    invoke-virtual {v2, v3}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-ne v2, v5, :cond_10

    .line 213
    .line 214
    iget v2, v0, Lx1/f0;->h:I

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Lf/x;->a(I)Z

    .line 217
    .line 218
    .line 219
    iget v1, v0, Lx1/f0;->h:I

    .line 220
    .line 221
    invoke-virtual {v6, v4, v1, v5}, Lxe/e;->b(Landroid/view/View;IZ)V

    .line 222
    .line 223
    .line 224
    :cond_10
    iget-object v1, v0, Lx1/f0;->t:Lx1/r1;

    .line 225
    .line 226
    if-eqz v1, :cond_11

    .line 227
    .line 228
    check-cast v1, Ly1/t;

    .line 229
    .line 230
    invoke-virtual {v1}, Ly1/t;->getRectManager()Lg2/b;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    if-eqz v1, :cond_11

    .line 235
    .line 236
    invoke-virtual {v1, v0}, Lg2/b;->f(Lx1/f0;)V

    .line 237
    .line 238
    .line 239
    :cond_11
    return-void
.end method

.method public final h(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lx1/f0;->K(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final i(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lx1/f0;->Q(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/f2;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public final bridge synthetic p(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lx1/f0;

    .line 2
    .line 3
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1/f0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/f0;->t:Lx1/r1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast v0, Ly1/t;

    .line 10
    .line 11
    invoke-virtual {v0}, Ly1/t;->A()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final r()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/f2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
