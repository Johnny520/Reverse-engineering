.class public final Lg51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lx01;

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:Lxg0;

.field public final synthetic i:Z

.field public final synthetic j:Lhw;

.field public final synthetic k:F

.field public final synthetic l:Lmh;


# direct methods
.method public constructor <init>(Lpe0;Lx01;JFLxg0;ZLhw;FLmh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg51;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lg51;->e:Lx01;

    .line 7
    .line 8
    iput-wide p3, p0, Lg51;->f:J

    .line 9
    .line 10
    iput p5, p0, Lg51;->g:F

    .line 11
    .line 12
    iput-object p6, p0, Lg51;->h:Lxg0;

    .line 13
    .line 14
    iput-boolean p7, p0, Lg51;->i:Z

    .line 15
    .line 16
    iput-object p8, p0, Lg51;->j:Lhw;

    .line 17
    .line 18
    iput p9, p0, Lg51;->k:F

    .line 19
    .line 20
    iput-object p10, p0, Lg51;->l:Lmh;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

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
    if-eqz p2, :cond_4

    .line 27
    .line 28
    sget-object p2, Lj30;->a:Lcz;

    .line 29
    .line 30
    sget-object p2, Lke0;->a:Lke0;

    .line 31
    .line 32
    iget-object v0, p0, Lg51;->d:Lpe0;

    .line 33
    .line 34
    invoke-interface {v0, p2}, Lpe0;->c(Lpe0;)Lpe0;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-wide v0, p0, Lg51;->f:J

    .line 39
    .line 40
    iget p2, p0, Lg51;->g:F

    .line 41
    .line 42
    invoke-static {v0, v1, p2, p1}, Lh51;->c(JFLpi;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    sget-object p2, Ldj;->h:Lg41;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget v0, p0, Lg51;->k:F

    .line 53
    .line 54
    check-cast p2, Lym;

    .line 55
    .line 56
    invoke-interface {p2, v0}, Lym;->p(F)F

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    iget-object v5, p0, Lg51;->e:Lx01;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-static/range {v4 .. v9}, Lh51;->b(Lpe0;Lx01;JLrd0;F)Lpe0;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v1, 0x7

    .line 69
    invoke-static {v0, v1}, Luv0;->a(FI)Lwv0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-boolean v1, p0, Lg51;->i:Z

    .line 74
    .line 75
    iget-object v4, p0, Lg51;->j:Lhw;

    .line 76
    .line 77
    iget-object v5, p0, Lg51;->h:Lxg0;

    .line 78
    .line 79
    invoke-static {p2, v5, v0, v1, v4}, Lrd0;->i(Lpe0;Lxg0;Lwv0;ZLhw;)Lpe0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    new-instance v0, Lpg0;

    .line 84
    .line 85
    invoke-direct {v0, v3}, Lpg0;-><init>(I)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lhe;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Lhe;-><init>(Lpg0;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, v1}, Lpe0;->c(Lpe0;)Lpe0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object v0, Ln2;->e:Lha;

    .line 98
    .line 99
    invoke-static {v0, v3}, Lza;->d(Lha;Z)Lxd0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {p1, p2}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    sget-object v5, Lfi;->b:Lei;

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v5, Lei;->b:Lcj;

    .line 121
    .line 122
    invoke-virtual {p1}, Lpi;->Z()V

    .line 123
    .line 124
    .line 125
    iget-boolean v6, p1, Lpi;->S:Z

    .line 126
    .line 127
    if-eqz v6, :cond_1

    .line 128
    .line 129
    invoke-virtual {p1, v5}, Lpi;->k(Lhw;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-virtual {p1}, Lpi;->j0()V

    .line 134
    .line 135
    .line 136
    :goto_1
    sget-object v5, Lei;->e:Lm7;

    .line 137
    .line 138
    invoke-static {p1, v5, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lei;->d:Lm7;

    .line 142
    .line 143
    invoke-static {p1, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lei;->f:Lm7;

    .line 147
    .line 148
    iget-boolean v4, p1, Lpi;->S:Z

    .line 149
    .line 150
    if-nez v4, :cond_2

    .line 151
    .line 152
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v4, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_3

    .line 165
    .line 166
    :cond_2
    invoke-static {v1, p1, v1, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    sget-object v0, Lei;->c:Lm7;

    .line 170
    .line 171
    invoke-static {p1, v0, p2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    iget-object p0, p0, Lg51;->l:Lmh;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, Lmh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 188
    .line 189
    .line 190
    :goto_2
    sget-object p0, Lna1;->a:Lna1;

    .line 191
    .line 192
    return-object p0
.end method
