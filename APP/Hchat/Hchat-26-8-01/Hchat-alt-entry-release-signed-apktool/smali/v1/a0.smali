.class public final Lv1/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/k1;
.implements Lv1/p0;


# instance fields
.field public final synthetic g:Lv1/d0;

.field public final synthetic h:Lv1/j0;


# direct methods
.method public constructor <init>(Lv1/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv1/a0;->h:Lv1/j0;

    .line 5
    .line 6
    iget-object p1, p1, Lv1/j0;->n:Lv1/d0;

    .line 7
    .line 8
    iput-object p1, p0, Lv1/a0;->g:Lv1/d0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;
    .locals 6

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Lv1/d0;->D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final G0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->G0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final J(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->J(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final K(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->K(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final L0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->L0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p0, Lv1/a0;->h:Lv1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lv1/j0;->g:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lv1/j0;->m:Lf/k0;

    .line 6
    .line 7
    invoke-virtual {v2, p2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lx1/f0;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lx1/f0;->o()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lf/d0;

    .line 20
    .line 21
    iget-object v4, v4, Lf/d0;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Lj0/b;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Lj0/b;->i(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v5, v0, Lv1/j0;->j:I

    .line 30
    .line 31
    if-ge v4, v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, Lx1/f0;->m()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    iget-object v3, v0, Lv1/j0;->r:Lf/k0;

    .line 39
    .line 40
    iget-object v4, v0, Lv1/j0;->p:Lf/k0;

    .line 41
    .line 42
    iget-object v5, v0, Lv1/j0;->s:Lj0/b;

    .line 43
    .line 44
    iget v6, v5, Lj0/b;->i:I

    .line 45
    .line 46
    iget v7, v0, Lv1/j0;->k:I

    .line 47
    .line 48
    if-lt v6, v7, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v6, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    .line 52
    .line 53
    invoke-static {v6}, Lu1/a;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {v2, p2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Lx1/f0;

    .line 61
    .line 62
    iget v7, v5, Lj0/b;->i:I

    .line 63
    .line 64
    iget v8, v0, Lv1/j0;->k:I

    .line 65
    .line 66
    if-ne v7, v8, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5, p2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v5, v5, Lj0/b;->g:[Ljava/lang/Object;

    .line 73
    .line 74
    aget-object v7, v5, v8

    .line 75
    .line 76
    aput-object p2, v5, v8

    .line 77
    .line 78
    :goto_1
    iget v5, v0, Lv1/j0;->k:I

    .line 79
    .line 80
    const/4 v7, 0x1

    .line 81
    add-int/2addr v5, v7

    .line 82
    iput v5, v0, Lv1/j0;->k:I

    .line 83
    .line 84
    invoke-virtual {v4, p2}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v8, 0x0

    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0, p2, p1, v8}, Lv1/j0;->k(Ljava/lang/Object;Lfg/p;Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p2}, Lv1/j0;->f(Ljava/lang/Object;)Lv1/h1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v3, p2, p1}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    if-nez v5, :cond_4

    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    invoke-virtual {v1}, Lx1/f0;->o()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Lf/d0;

    .line 113
    .line 114
    iget-object v5, v5, Lf/d0;->h:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, Lj0/b;

    .line 117
    .line 118
    invoke-virtual {v5, v6}, Lj0/b;->i(Ljava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v1}, Lx1/f0;->o()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    check-cast v9, Lf/d0;

    .line 127
    .line 128
    iget-object v9, v9, Lf/d0;->h:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v9, Lj0/b;

    .line 131
    .line 132
    iget v9, v9, Lj0/b;->i:I

    .line 133
    .line 134
    invoke-virtual {v0, v5, v9}, Lv1/j0;->j(II)V

    .line 135
    .line 136
    .line 137
    iget v5, v0, Lv1/j0;->u:I

    .line 138
    .line 139
    add-int/2addr v5, v7

    .line 140
    iput v5, v0, Lv1/j0;->u:I

    .line 141
    .line 142
    invoke-virtual {v2, p2}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, p2, v6}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p2}, Lv1/j0;->f(Ljava/lang/Object;)Lv1/h1;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v3, p2, v2}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lx1/f0;->G()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0}, Lv1/j0;->h()V

    .line 162
    .line 163
    .line 164
    :cond_4
    invoke-virtual {v4, p2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Lx1/f0;

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    iget-object v3, v0, Lv1/j0;->l:Lf/k0;

    .line 174
    .line 175
    invoke-virtual {v3, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, Lv1/b0;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move-object v3, v2

    .line 183
    :goto_2
    if-eqz v3, :cond_6

    .line 184
    .line 185
    iget-boolean v5, v3, Lv1/b0;->d:Z

    .line 186
    .line 187
    if-ne v5, v7, :cond_6

    .line 188
    .line 189
    invoke-virtual {v0, v1, p2, v8, p1}, Lv1/j0;->m(Lx1/f0;Ljava/lang/Object;ZLfg/p;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    if-eqz v3, :cond_7

    .line 193
    .line 194
    iget-object v2, v3, Lv1/b0;->f:Li0/l1;

    .line 195
    .line 196
    :cond_7
    if-eqz v2, :cond_8

    .line 197
    .line 198
    invoke-virtual {v0, v3, v7}, Lv1/j0;->d(Lv1/b0;Z)V

    .line 199
    .line 200
    .line 201
    :cond_8
    :goto_3
    invoke-virtual {v4, p2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Lx1/f0;

    .line 206
    .line 207
    if-eqz p1, :cond_a

    .line 208
    .line 209
    iget-object p1, p1, Lx1/f0;->M:Lx1/j0;

    .line 210
    .line 211
    iget-object p1, p1, Lx1/j0;->p:Lx1/v0;

    .line 212
    .line 213
    invoke-virtual {p1}, Lx1/v0;->J0()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    move-object p2, p1

    .line 218
    check-cast p2, Lf/d0;

    .line 219
    .line 220
    iget-object v0, p2, Lf/d0;->h:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Lj0/b;

    .line 223
    .line 224
    iget v0, v0, Lj0/b;->i:I

    .line 225
    .line 226
    :goto_4
    if-ge v8, v0, :cond_9

    .line 227
    .line 228
    invoke-virtual {p2, v8}, Lf/d0;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, Lx1/v0;

    .line 233
    .line 234
    iget-object v1, v1, Lx1/v0;->l:Lx1/j0;

    .line 235
    .line 236
    iput-boolean v7, v1, Lx1/j0;->b:Z

    .line 237
    .line 238
    add-int/lit8 v8, v8, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_9
    return-object p1

    .line 242
    :cond_a
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 243
    .line 244
    return-object p1
.end method

.method public final O0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->O0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final S(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->S(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    iget v0, v0, Lv1/d0;->h:F

    .line 4
    .line 5
    return v0
.end method

.method public final e0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->e0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final getLayoutDirection()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    iget-object v0, v0, Lv1/d0;->g:Lu2/m;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->i0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/d0;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-float/2addr p1, v0

    .line 8
    return p1
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    iget v0, v0, Lv1/d0;->i:F

    .line 4
    .line 5
    return v0
.end method

.method public final u0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/d0;->u0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final x0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/d0;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method

.method public final z(IILjava/util/Map;Lfg/l;)Lv1/o0;
    .locals 6

    .line 1
    iget-object v0, p0, Lv1/a0;->g:Lv1/d0;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lv1/d0;->D0(IILjava/util/Map;Lfg/l;Lfg/l;)Lv1/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
