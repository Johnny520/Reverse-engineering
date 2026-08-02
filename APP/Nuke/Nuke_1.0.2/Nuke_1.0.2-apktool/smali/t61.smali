.class public final Lt61;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnc0;


# instance fields
.field public final h:Lsp;

.field public i:Lmc0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lsp;

    .line 2
    .line 3
    invoke-direct {v0}, Lsp;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt61;->h:Lsp;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final A(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsp;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final E()Lb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    iget-object p0, p0, Lsp;->i:Lb5;

    .line 4
    .line 5
    return-object p0
.end method

.method public final G(Ly9;Lan;FLop0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lsp;->G(Ly9;Lan;FLop0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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

.method public final R(Ld9;JJJFLcl;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p10}, Lsp;->R(Ld9;JJJFLcl;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final T(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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

.method public final Y(JJJFI)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p8}, Lsp;->Y(JJJFI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a()V
    .locals 11

    .line 1
    iget-object v0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    iget-object v1, v0, Lsp;->i:Lb5;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb5;->q()Lqp;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-object p0, p0, Lt61;->i:Lmc0;

    .line 10
    .line 11
    if-eqz p0, :cond_f

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    check-cast v1, Lth1;

    .line 15
    .line 16
    iget-object v2, v1, Lth1;->h:Lth1;

    .line 17
    .line 18
    iget-object v2, v2, Lth1;->m:Lth1;

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x4

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget v4, v2, Lth1;->k:I

    .line 26
    .line 27
    and-int/2addr v4, v10

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    if-eqz v2, :cond_4

    .line 32
    .line 33
    iget v4, v2, Lth1;->j:I

    .line 34
    .line 35
    and-int/lit8 v5, v4, 0x2

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    and-int/lit8 v4, v4, 0x4

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    iget-object v2, v2, Lth1;->m:Lth1;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    :goto_1
    move-object v2, v9

    .line 49
    :goto_2
    if-eqz v2, :cond_d

    .line 50
    .line 51
    move-object p0, v9

    .line 52
    :goto_3
    if-eqz v2, :cond_c

    .line 53
    .line 54
    instance-of v1, v2, Lmc0;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    move-object v7, v2

    .line 59
    check-cast v7, Lmc0;

    .line 60
    .line 61
    iget-object v1, v0, Lsp;->i:Lb5;

    .line 62
    .line 63
    iget-object v1, v1, Lb5;->j:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, Lpq0;

    .line 67
    .line 68
    invoke-static {v7, v10}, Lsp0;->Z(Lt60;I)Lzn1;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-wide v1, v6, Lsz1;->j:J

    .line 73
    .line 74
    invoke-static {v1, v2}, Ls11;->q0(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v4

    .line 78
    iget-object v1, v6, Lzn1;->v:Lr61;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lu61;->a(Lr61;)Lzv1;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lb7;

    .line 88
    .line 89
    invoke-virtual {v1}, Lb7;->getSharedDrawScope()Lt61;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual/range {v2 .. v8}, Lt61;->c(Lqp;JLzn1;Lmc0;Lpq0;)V

    .line 94
    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_5
    iget v1, v2, Lth1;->j:I

    .line 98
    .line 99
    and-int/2addr v1, v10

    .line 100
    if-eqz v1, :cond_b

    .line 101
    .line 102
    instance-of v1, v2, Lu60;

    .line 103
    .line 104
    if-eqz v1, :cond_b

    .line 105
    .line 106
    move-object v1, v2

    .line 107
    check-cast v1, Lu60;

    .line 108
    .line 109
    iget-object v1, v1, Lu60;->w:Lth1;

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    :goto_4
    const/4 v5, 0x1

    .line 113
    if-eqz v1, :cond_a

    .line 114
    .line 115
    iget v6, v1, Lth1;->j:I

    .line 116
    .line 117
    and-int/2addr v6, v10

    .line 118
    if-eqz v6, :cond_9

    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    if-ne v4, v5, :cond_6

    .line 123
    .line 124
    move-object v2, v1

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    if-nez p0, :cond_7

    .line 127
    .line 128
    new-instance p0, Lzk1;

    .line 129
    .line 130
    const/16 v5, 0x10

    .line 131
    .line 132
    new-array v5, v5, [Lth1;

    .line 133
    .line 134
    invoke-direct {p0, v5}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    if-eqz v2, :cond_8

    .line 138
    .line 139
    invoke-virtual {p0, v2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v2, v9

    .line 143
    :cond_8
    invoke-virtual {p0, v1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_5
    iget-object v1, v1, Lth1;->m:Lth1;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    if-ne v4, v5, :cond_b

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_b
    :goto_6
    invoke-static {p0}, Lsp0;->m(Lzk1;)Lth1;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    goto :goto_3

    .line 157
    :cond_c
    return-void

    .line 158
    :cond_d
    invoke-static {p0, v10}, Lsp0;->Z(Lt60;I)Lzn1;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Lzn1;->S0()Lth1;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget-object v1, v1, Lth1;->h:Lth1;

    .line 167
    .line 168
    if-ne v2, v1, :cond_e

    .line 169
    .line 170
    iget-object p0, p0, Lzn1;->w:Lzn1;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    :cond_e
    iget-object v0, v0, Lsp;->i:Lb5;

    .line 176
    .line 177
    iget-object v0, v0, Lb5;->j:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lpq0;

    .line 180
    .line 181
    invoke-virtual {p0, v3, v0}, Lzn1;->h1(Lqp;Lpq0;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_f
    const-string p0, "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."

    .line 186
    .line 187
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    throw p0
.end method

.method public final a0()J
    .locals 2

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-interface {p0}, Lnc0;->a0()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsp;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(Lqp;JLzn1;Lmc0;Lpq0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lt61;->i:Lmc0;

    .line 2
    .line 3
    iput-object p5, p0, Lt61;->i:Lmc0;

    .line 4
    .line 5
    iget-object v1, p4, Lzn1;->v:Lr61;

    .line 6
    .line 7
    iget-object v1, v1, Lr61;->G:Ld61;

    .line 8
    .line 9
    iget-object v2, p0, Lt61;->h:Lsp;

    .line 10
    .line 11
    iget-object v3, v2, Lsp;->i:Lb5;

    .line 12
    .line 13
    iget-object v4, v3, Lb5;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lsp;

    .line 16
    .line 17
    iget-object v4, v4, Lsp;->h:Lrp;

    .line 18
    .line 19
    iget-object v5, v4, Lrp;->a:Le70;

    .line 20
    .line 21
    iget-object v4, v4, Lrp;->b:Ld61;

    .line 22
    .line 23
    invoke-virtual {v3}, Lb5;->q()Lqp;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v2, v2, Lsp;->i:Lb5;

    .line 28
    .line 29
    invoke-virtual {v2}, Lb5;->u()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    iget-object v8, v2, Lb5;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, Lpq0;

    .line 36
    .line 37
    invoke-virtual {v2, p4}, Lb5;->C(Le70;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lb5;->D(Ld61;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p1}, Lb5;->B(Lqp;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, p2, p3}, Lb5;->E(J)V

    .line 47
    .line 48
    .line 49
    iput-object p6, v2, Lb5;->j:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-interface {p1}, Lqp;->l()V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-interface {p5, p0}, Lmc0;->P(Lt61;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Lqp;->i()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v5}, Lb5;->C(Le70;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v4}, Lb5;->D(Ld61;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Lb5;->B(Lqp;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v6, v7}, Lb5;->E(J)V

    .line 70
    .line 71
    .line 72
    iput-object v8, v2, Lb5;->j:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v0, p0, Lt61;->i:Lmc0;

    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    invoke-interface {p1}, Lqp;->i()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v5}, Lb5;->C(Le70;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Lb5;->D(Ld61;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Lb5;->B(Lqp;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6, v7}, Lb5;->E(J)V

    .line 91
    .line 92
    .line 93
    iput-object v8, v2, Lb5;->j:Ljava/lang/Object;

    .line 94
    .line 95
    throw p0
.end method

.method public final c0(JJJLop0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p8}, Lsp;->c0(JJJLop0;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-interface {p0}, Lnc0;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d0(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 4
    .line 5
    iget-object p0, p0, Lrp;->b:Ld61;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsp;->m()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final o(JFJLop0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p6}, Lsp;->o(JFJLop0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p0(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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

.method public final t(Ly9;JLop0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lsp;->t(Ly9;JLop0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u0(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

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
    iget-object p0, p0, Lt61;->h:Lsp;

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
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsp;->b()F

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
    iget-object p0, p0, Lt61;->h:Lsp;

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

.method public final z(Lan;JJJFLop0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p9}, Lsp;->z(Lan;JJJFLop0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z0(JFFJJLop0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lt61;->h:Lsp;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p9}, Lsp;->z0(JFFJJLop0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
