.class public final Lf51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lx01;

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Lmh;


# direct methods
.method public constructor <init>(Lpe0;Lx01;JFLrd0;FLmh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf51;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lf51;->e:Lx01;

    .line 7
    .line 8
    iput-wide p3, p0, Lf51;->f:J

    .line 9
    .line 10
    iput p5, p0, Lf51;->g:F

    .line 11
    .line 12
    iput p7, p0, Lf51;->h:F

    .line 13
    .line 14
    iput-object p8, p0, Lf51;->i:Lmh;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    check-cast p1, Lpi;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    sget-object v0, Lna1;->a:Lna1;

    .line 27
    .line 28
    if-eqz p2, :cond_6

    .line 29
    .line 30
    iget-wide v4, p0, Lf51;->f:J

    .line 31
    .line 32
    iget p2, p0, Lf51;->g:F

    .line 33
    .line 34
    invoke-static {v4, v5, p2, p1}, Lh51;->c(JFLpi;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v8

    .line 38
    sget-object p2, Ldj;->h:Lg41;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget v1, p0, Lf51;->h:F

    .line 45
    .line 46
    check-cast p2, Lym;

    .line 47
    .line 48
    invoke-interface {p2, v1}, Lym;->p(F)F

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    iget-object v6, p0, Lf51;->d:Lpe0;

    .line 53
    .line 54
    iget-object v7, p0, Lf51;->e:Lx01;

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    invoke-static/range {v6 .. v11}, Lh51;->b(Lpe0;Lx01;JLrd0;F)Lpe0;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v4, Lii;->a:Lr3;

    .line 66
    .line 67
    if-ne v1, v4, :cond_1

    .line 68
    .line 69
    new-instance v1, Lsx0;

    .line 70
    .line 71
    const/16 v5, 0x10

    .line 72
    .line 73
    invoke-direct {v1, v5}, Lsx0;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    check-cast v1, Lsw;

    .line 80
    .line 81
    sget-object v5, Luz0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    .line 83
    new-instance v5, Lp8;

    .line 84
    .line 85
    invoke-direct {v5, v1}, Lp8;-><init>(Lsw;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p2, v5}, Lpe0;->c(Lpe0;)Lpe0;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-ne v1, v4, :cond_2

    .line 97
    .line 98
    sget-object v1, Le51;->a:Le51;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 104
    .line 105
    sget-object v4, Lo51;->a:Lir0;

    .line 106
    .line 107
    new-instance v4, Ln51;

    .line 108
    .line 109
    const/4 v5, 0x0

    .line 110
    const/4 v6, 0x6

    .line 111
    invoke-direct {v4, v0, v5, v1, v6}, Ln51;-><init>(Ljava/lang/Object;Lr60;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p2, v4}, Lpe0;->c(Lpe0;)Lpe0;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    sget-object v1, Ln2;->e:Lha;

    .line 119
    .line 120
    invoke-static {v1, v2}, Lza;->d(Lha;Z)Lxd0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    sget-object v6, Lfi;->b:Lei;

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object v6, Lei;->b:Lcj;

    .line 142
    .line 143
    invoke-virtual {p1}, Lpi;->Z()V

    .line 144
    .line 145
    .line 146
    iget-boolean v7, p1, Lpi;->S:Z

    .line 147
    .line 148
    if-eqz v7, :cond_3

    .line 149
    .line 150
    invoke-virtual {p1, v6}, Lpi;->k(Lhw;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {p1}, Lpi;->j0()V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object v6, Lei;->e:Lm7;

    .line 158
    .line 159
    invoke-static {p1, v6, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object v1, Lei;->d:Lm7;

    .line 163
    .line 164
    invoke-static {p1, v1, v5}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object v1, Lei;->f:Lm7;

    .line 168
    .line 169
    iget-boolean v5, p1, Lpi;->S:Z

    .line 170
    .line 171
    if-nez v5, :cond_4

    .line 172
    .line 173
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v5, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_5

    .line 186
    .line 187
    :cond_4
    invoke-static {v4, p1, v4, v1}, Lt1;->o(ILpi;ILm7;)V

    .line 188
    .line 189
    .line 190
    :cond_5
    sget-object v1, Lei;->c:Lm7;

    .line 191
    .line 192
    invoke-static {p1, v1, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    iget-object p0, p0, Lf51;->i:Lmh;

    .line 200
    .line 201
    invoke-virtual {p0, p1, p2}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v2}, Lpi;->p(Z)V

    .line 205
    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_6
    invoke-virtual {p1}, Lpi;->R()V

    .line 209
    .line 210
    .line 211
    return-object v0
.end method
