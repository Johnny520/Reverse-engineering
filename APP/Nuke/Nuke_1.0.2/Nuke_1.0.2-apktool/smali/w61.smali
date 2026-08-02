.class public final Lw61;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Liw2;
.implements Lpf1;


# instance fields
.field public final synthetic h:Lz61;

.field public final synthetic i:Lf71;


# direct methods
.method public constructor <init>(Lf71;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw61;->i:Lf71;

    .line 5
    .line 6
    iget-object p1, p1, Lf71;->o:Lz61;

    .line 7
    .line 8
    iput-object p1, p0, Lw61;->h:Lz61;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz61;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final I(Lmn0;Ljava/lang/Object;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object p0, p0, Lw61;->i:Lf71;

    .line 2
    .line 3
    iget-object v0, p0, Lf71;->h:Lr61;

    .line 4
    .line 5
    iget-object v1, p0, Lf71;->n:Lrk1;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lr61;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lr61;->o()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljk1;

    .line 20
    .line 21
    iget-object v3, v3, Ljk1;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lzk1;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lzk1;->i(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget v4, p0, Lf71;->k:I

    .line 30
    .line 31
    if-ge v3, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2}, Lr61;->m()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    iget-object v2, p0, Lf71;->s:Lrk1;

    .line 39
    .line 40
    iget-object v3, p0, Lf71;->q:Lrk1;

    .line 41
    .line 42
    iget-object v4, p0, Lf71;->t:Lzk1;

    .line 43
    .line 44
    iget v5, v4, Lzk1;->j:I

    .line 45
    .line 46
    iget v6, p0, Lf71;->l:I

    .line 47
    .line 48
    if-lt v5, v6, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v5, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    .line 52
    .line 53
    invoke-static {v5}, Lkz0;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {v1, p2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lr61;

    .line 61
    .line 62
    iget v6, v4, Lzk1;->j:I

    .line 63
    .line 64
    iget v7, p0, Lf71;->l:I

    .line 65
    .line 66
    if-ne v6, v7, :cond_2

    .line 67
    .line 68
    invoke-virtual {v4, p2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v4, v4, Lzk1;->h:[Ljava/lang/Object;

    .line 73
    .line 74
    aget-object v6, v4, v7

    .line 75
    .line 76
    aput-object p2, v4, v7

    .line 77
    .line 78
    :goto_1
    iget v4, p0, Lf71;->l:I

    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    add-int/2addr v4, v6

    .line 82
    iput v4, p0, Lf71;->l:I

    .line 83
    .line 84
    invoke-virtual {v3, p2}, Lrk1;->b(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x0

    .line 89
    if-nez v4, :cond_3

    .line 90
    .line 91
    if-nez v5, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0, p2, p1, v7}, Lf71;->k(Ljava/lang/Object;Lmn0;Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p2}, Lf71;->f(Ljava/lang/Object;)Lfw2;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v2, p2, p0}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    if-nez v4, :cond_4

    .line 105
    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    invoke-virtual {v0}, Lr61;->o()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Ljk1;

    .line 113
    .line 114
    iget-object v4, v4, Ljk1;->i:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Lzk1;

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Lzk1;->i(Ljava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v0}, Lr61;->o()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    check-cast v8, Ljk1;

    .line 127
    .line 128
    iget-object v8, v8, Ljk1;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v8, Lzk1;

    .line 131
    .line 132
    iget v8, v8, Lzk1;->j:I

    .line 133
    .line 134
    invoke-virtual {p0, v4, v8}, Lf71;->j(II)V

    .line 135
    .line 136
    .line 137
    iget v4, p0, Lf71;->v:I

    .line 138
    .line 139
    add-int/2addr v4, v6

    .line 140
    iput v4, p0, Lf71;->v:I

    .line 141
    .line 142
    invoke-virtual {v1, p2}, Lrk1;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, p2, v5}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p2}, Lf71;->f(Ljava/lang/Object;)Lfw2;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v2, p2, v1}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Lr61;->H()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    invoke-virtual {p0}, Lf71;->h()V

    .line 162
    .line 163
    .line 164
    :cond_4
    invoke-virtual {v3, p2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lr61;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    iget-object v2, p0, Lf71;->m:Lrk1;

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Lx61;

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move-object v2, v1

    .line 183
    :goto_2
    if-eqz v2, :cond_6

    .line 184
    .line 185
    iget-boolean v4, v2, Lx61;->d:Z

    .line 186
    .line 187
    if-ne v4, v6, :cond_6

    .line 188
    .line 189
    invoke-virtual {p0, v0, p2, v7, p1}, Lf71;->m(Lr61;Ljava/lang/Object;ZLmn0;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    if-eqz v2, :cond_7

    .line 193
    .line 194
    iget-object v1, v2, Lx61;->f:Lsy1;

    .line 195
    .line 196
    :cond_7
    if-eqz v1, :cond_8

    .line 197
    .line 198
    invoke-virtual {p0, v2, v6}, Lf71;->d(Lx61;Z)V

    .line 199
    .line 200
    .line 201
    :cond_8
    :goto_3
    invoke-virtual {v3, p2}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, Lr61;

    .line 206
    .line 207
    if-eqz p0, :cond_a

    .line 208
    .line 209
    iget-object p0, p0, Lr61;->N:Lv61;

    .line 210
    .line 211
    iget-object p0, p0, Lv61;->p:Lmf1;

    .line 212
    .line 213
    invoke-virtual {p0}, Lmf1;->l0()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    move-object p1, p0

    .line 218
    check-cast p1, Ljk1;

    .line 219
    .line 220
    iget-object p2, p1, Ljk1;->i:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p2, Lzk1;

    .line 223
    .line 224
    iget p2, p2, Lzk1;->j:I

    .line 225
    .line 226
    :goto_4
    if-ge v7, p2, :cond_9

    .line 227
    .line 228
    invoke-virtual {p1, v7}, Ljk1;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Lmf1;

    .line 233
    .line 234
    iget-object v0, v0, Lmf1;->m:Lv61;

    .line 235
    .line 236
    iput-boolean v6, v0, Lv61;->b:Z

    .line 237
    .line 238
    add-int/lit8 v7, v7, 0x1

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_9
    return-object p0

    .line 242
    :cond_a
    sget-object p0, Lbe0;->h:Lbe0;

    .line 243
    .line 244
    return-object p0
.end method

.method public final K(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Le70;->K(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final S(IILjava/util/Map;Lin0;Lin0;)Lof1;
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lz61;->S(IILjava/util/Map;Lin0;Lin0;)Lof1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final T(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Le70;->T(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    iget p0, p0, Lz61;->i:F

    .line 4
    .line 5
    return p0
.end method

.method public final d0(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Le70;->d0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final getLayoutDirection()Ld61;
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    iget-object p0, p0, Lz61;->h:Ld61;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Le70;->h0(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final j0(IILjava/util/Map;Lin0;)Lof1;
    .locals 6

    .line 1
    iget-object v0, p0, Lw61;->h:Lz61;

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
    invoke-virtual/range {v0 .. v5}, Lz61;->S(IILjava/util/Map;Lin0;Lin0;)Lof1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    iget p0, p0, Lz61;->j:F

    .line 4
    .line 5
    return p0
.end method

.method public final p0(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Le70;->p0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz61;->u()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final u0(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Le70;->u0(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final x(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Le70;->x(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final x0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz61;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final y(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lw61;->h:Lz61;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Le70;->y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
