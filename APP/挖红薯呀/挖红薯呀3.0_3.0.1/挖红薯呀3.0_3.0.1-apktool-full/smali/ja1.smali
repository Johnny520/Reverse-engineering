.class public final Lja1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lq8;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb60;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lja1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lja1;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, Lja1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lb60;

    .line 2
    .line 3
    iget-object p0, p0, Lja1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lb60;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lb60;->B(ILb60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lja1;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lja1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lja1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object p0, p0, Lja1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb60;

    .line 4
    .line 5
    iget-object v0, p0, Lb60;->I:Lmj0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb60;->H()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, "onReuse is only expected on attached node"

    .line 14
    .line 15
    invoke-static {v1}, Lw10;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lb60;->K:Lq60;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lq60;->i(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iput-boolean v2, p0, Lb60;->w:Z

    .line 27
    .line 28
    iget-boolean v1, p0, Lb60;->R:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iput-boolean v2, p0, Lb60;->R:Z

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    iget-object v1, p0, Lb60;->I:Lmj0;

    .line 36
    .line 37
    iget-object v1, v1, Lmj0;->e:Ld61;

    .line 38
    .line 39
    move-object v3, v1

    .line 40
    :goto_0
    if-eqz v3, :cond_4

    .line 41
    .line 42
    iget-boolean v4, v3, Loe0;->q:Z

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {v3}, Loe0;->r0()V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    move-object v3, v1

    .line 53
    :goto_1
    if-eqz v3, :cond_6

    .line 54
    .line 55
    iget-boolean v4, v3, Loe0;->q:Z

    .line 56
    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v3}, Loe0;->t0()V

    .line 60
    .line 61
    .line 62
    :cond_5
    iget-object v3, v3, Loe0;->h:Loe0;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    :goto_2
    if-eqz v1, :cond_8

    .line 66
    .line 67
    iget-boolean v3, v1, Loe0;->q:Z

    .line 68
    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    invoke-virtual {v1}, Loe0;->n0()V

    .line 72
    .line 73
    .line 74
    :cond_7
    iget-object v1, v1, Loe0;->h:Loe0;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_8
    :goto_3
    iget v1, p0, Lb60;->e:I

    .line 78
    .line 79
    iget-object v3, p0, Lb60;->r:Ldn0;

    .line 80
    .line 81
    if-eqz v3, :cond_9

    .line 82
    .line 83
    check-cast v3, Lw3;

    .line 84
    .line 85
    invoke-virtual {v3}, Lw3;->getRectManager()Lut0;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_9

    .line 90
    .line 91
    invoke-virtual {v3, p0}, Lut0;->h(Lb60;)V

    .line 92
    .line 93
    .line 94
    :cond_9
    sget-object v3, Luz0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iput v3, p0, Lb60;->e:I

    .line 102
    .line 103
    iget-object v3, p0, Lb60;->r:Ldn0;

    .line 104
    .line 105
    if-eqz v3, :cond_a

    .line 106
    .line 107
    check-cast v3, Lw3;

    .line 108
    .line 109
    invoke-virtual {v3}, Lw3;->getLayoutNodes()Lug0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5, v1}, Lug0;->g(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lw3;->getLayoutNodes()Lug0;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget v5, p0, Lb60;->e:I

    .line 121
    .line 122
    invoke-virtual {v3, v5, p0}, Lug0;->i(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_a
    iget-object v3, v0, Lmj0;->f:Loe0;

    .line 126
    .line 127
    :goto_4
    if-eqz v3, :cond_b

    .line 128
    .line 129
    invoke-virtual {v3}, Loe0;->m0()V

    .line 130
    .line 131
    .line 132
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_b
    invoke-virtual {v0}, Lmj0;->e()V

    .line 136
    .line 137
    .line 138
    const/16 v3, 0x8

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Lmj0;->d(I)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_c

    .line 145
    .line 146
    invoke-virtual {p0}, Lb60;->F()V

    .line 147
    .line 148
    .line 149
    :cond_c
    invoke-static {p0}, Lb60;->Y(Lb60;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lb60;->r:Ldn0;

    .line 153
    .line 154
    if-eqz v0, :cond_e

    .line 155
    .line 156
    check-cast v0, Lw3;

    .line 157
    .line 158
    iget-object v0, v0, Lw3;->N:La3;

    .line 159
    .line 160
    if-eqz v0, :cond_e

    .line 161
    .line 162
    iget-object v3, v0, La3;->f:Lw3;

    .line 163
    .line 164
    iget-object v5, v0, La3;->d:Lx1;

    .line 165
    .line 166
    iget-object v0, v0, La3;->j:Lvg0;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lvg0;->e(I)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_d

    .line 173
    .line 174
    invoke-virtual {v5, v3, v1, v2}, Lx1;->p(Landroid/view/View;IZ)V

    .line 175
    .line 176
    .line 177
    :cond_d
    invoke-virtual {p0}, Lb60;->x()Lsz0;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_e

    .line 182
    .line 183
    iget-object v1, v1, Lsz0;->d:Ljh0;

    .line 184
    .line 185
    sget-object v2, Lb01;->q:Le01;

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljh0;->b(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-ne v1, v4, :cond_e

    .line 192
    .line 193
    iget v1, p0, Lb60;->e:I

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Lvg0;->a(I)Z

    .line 196
    .line 197
    .line 198
    iget v0, p0, Lb60;->e:I

    .line 199
    .line 200
    invoke-virtual {v5, v3, v0, v4}, Lx1;->p(Landroid/view/View;IZ)V

    .line 201
    .line 202
    .line 203
    :cond_e
    iget-object v0, p0, Lb60;->r:Ldn0;

    .line 204
    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    check-cast v0, Lw3;

    .line 208
    .line 209
    invoke-virtual {v0}, Lw3;->getRectManager()Lut0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_f

    .line 214
    .line 215
    invoke-virtual {v0, p0, v4}, Lut0;->f(Lb60;Z)V

    .line 216
    .line 217
    .line 218
    :cond_f
    return-void
.end method

.method public final bridge synthetic d(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lb60;

    .line 2
    .line 3
    return-void
.end method

.method public final e()V
    .locals 0

    .line 1
    iget-object p0, p0, Lja1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb60;

    .line 4
    .line 5
    iget-object p0, p0, Lb60;->r:Ldn0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lw3;

    .line 10
    .line 11
    invoke-virtual {p0}, Lw3;->u()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final f(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Lja1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb60;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lb60;->L(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lja1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lja1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lb60;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lb60;->S(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lja1;->b:Ljava/util/ArrayList;

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
    iput-object v0, p0, Lja1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lja1;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lja1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lja1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lja1;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lb60;

    .line 13
    .line 14
    invoke-virtual {p0}, Lb60;->R()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
