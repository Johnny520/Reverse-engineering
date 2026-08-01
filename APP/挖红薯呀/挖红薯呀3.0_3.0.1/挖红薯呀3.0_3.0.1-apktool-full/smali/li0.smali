.class public final Lli0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lei0;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lo31;

.field public final synthetic h:Lww;

.field public final synthetic i:Z

.field public final synthetic j:Lww;


# direct methods
.method public constructor <init>(Lei0;ZZLo31;Lww;ZLww;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lli0;->d:Lei0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lli0;->e:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lli0;->f:Z

    .line 9
    .line 10
    iput-object p4, p0, Lli0;->g:Lo31;

    .line 11
    .line 12
    iput-object p5, p0, Lli0;->h:Lww;

    .line 13
    .line 14
    iput-boolean p6, p0, Lli0;->i:Z

    .line 15
    .line 16
    iput-object p7, p0, Lli0;->j:Lww;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    if-eqz p2, :cond_9

    .line 27
    .line 28
    iget-boolean p2, p0, Lli0;->f:Z

    .line 29
    .line 30
    iget-boolean v0, p0, Lli0;->e:Z

    .line 31
    .line 32
    iget-object v1, p0, Lli0;->d:Lei0;

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    iget-wide v4, v1, Lei0;->f:J

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-wide v4, v1, Lei0;->a:J

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-wide v4, v1, Lei0;->d:J

    .line 45
    .line 46
    :goto_1
    iget-object p2, p0, Lli0;->g:Lo31;

    .line 47
    .line 48
    invoke-static {v4, v5, p2, p1}, Lp11;->a(JLo31;Lpi;)Lw31;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object v1, p0, Lli0;->h:Lww;

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    iget-boolean v1, p0, Lli0;->i:Z

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    :cond_3
    const v0, -0x25d631cd

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lpi;->W(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, Lii;->a:Lr3;

    .line 73
    .line 74
    if-ne v0, v1, :cond_4

    .line 75
    .line 76
    new-instance v0, Lpg0;

    .line 77
    .line 78
    invoke-direct {v0, v2}, Lpg0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    check-cast v0, Lsw;

    .line 85
    .line 86
    sget-object v1, Luz0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 87
    .line 88
    new-instance v1, Lne;

    .line 89
    .line 90
    invoke-direct {v1, v0}, Lne;-><init>(Lsw;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const v0, -0x25d62e3c

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lpi;->W(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v3}, Lpi;->p(Z)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lme0;->a:Lme0;

    .line 107
    .line 108
    :goto_2
    sget-object v0, Ln2;->e:Lha;

    .line 109
    .line 110
    invoke-static {v0, v3}, Lza;->d(Lha;Z)Lxd0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {p1}, Lo30;->p(Lji;)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {p1}, Lpi;->l()Lfq0;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {p1, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v5, Lfi;->b:Lei;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object v5, Lei;->b:Lcj;

    .line 132
    .line 133
    invoke-virtual {p1}, Lpi;->Z()V

    .line 134
    .line 135
    .line 136
    iget-boolean v6, p1, Lpi;->S:Z

    .line 137
    .line 138
    if-eqz v6, :cond_6

    .line 139
    .line 140
    invoke-virtual {p1, v5}, Lpi;->k(Lhw;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    invoke-virtual {p1}, Lpi;->j0()V

    .line 145
    .line 146
    .line 147
    :goto_3
    sget-object v5, Lei;->e:Lm7;

    .line 148
    .line 149
    invoke-static {p1, v5, v0}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lei;->d:Lm7;

    .line 153
    .line 154
    invoke-static {p1, v0, v4}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lei;->f:Lm7;

    .line 158
    .line 159
    iget-boolean v4, p1, Lpi;->S:Z

    .line 160
    .line 161
    if-nez v4, :cond_7

    .line 162
    .line 163
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-static {v4, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_8

    .line 176
    .line 177
    :cond_7
    invoke-static {v3, p1, v3, v0}, Lt1;->o(ILpi;ILm7;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    sget-object v0, Lei;->c:Lm7;

    .line 181
    .line 182
    invoke-static {p1, v0, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object v0, Lxj;->a:Lej;

    .line 186
    .line 187
    invoke-interface {p2}, Lw31;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    check-cast p2, Lff;

    .line 192
    .line 193
    iget-wide v3, p2, Lff;->a:J

    .line 194
    .line 195
    new-instance p2, Lff;

    .line 196
    .line 197
    invoke-direct {p2, v3, v4}, Lff;-><init>(J)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p2}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    const/16 v0, 0x8

    .line 205
    .line 206
    iget-object p0, p0, Lli0;->j:Lww;

    .line 207
    .line 208
    invoke-static {p2, p0, p1, v0}, Li4;->b(Lct0;Lww;Lji;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v2}, Lpi;->p(Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    invoke-virtual {p1}, Lpi;->R()V

    .line 216
    .line 217
    .line 218
    :goto_4
    sget-object p0, Lna1;->a:Lna1;

    .line 219
    .line 220
    return-object p0
.end method
