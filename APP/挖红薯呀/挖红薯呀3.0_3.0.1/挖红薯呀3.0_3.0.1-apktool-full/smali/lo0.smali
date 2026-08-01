.class public abstract Llo0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lez0;


# instance fields
.field public A:J

.field public final B:La80;

.field public final C:Loh0;

.field public final D:Loh0;

.field public final E:Lgp0;

.field public final F:Lgp0;

.field public final G:Lgp0;

.field public final H:Lgp0;

.field public a:Z

.field public b:Lzn0;

.field public final c:Lgp0;

.field public final d:Lco0;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:Lnm;

.field public final l:Z

.field public m:I

.field public n:Lc80;

.field public o:Z

.field public final p:Lgp0;

.field public q:Lym;

.field public final r:Lxg0;

.field public final s:Ldp0;

.field public final t:Ldp0;

.field public final u:Ld80;

.field public final v:Lpn0;

.field public final w:Leb;

.field public final x:Lo9;

.field public final y:Lgp0;

.field public final z:La90;


# direct methods
.method public constructor <init>(FI)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p1

    .line 5
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 6
    .line 7
    cmpg-double v2, v2, v0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "currentPageOffsetFraction "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, Lok0;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Lok0;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Llo0;->c:Lgp0;

    .line 52
    .line 53
    new-instance v0, Lco0;

    .line 54
    .line 55
    invoke-direct {v0, p2, p1, p0}, Lco0;-><init>(IFLlo0;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Llo0;->d:Lco0;

    .line 59
    .line 60
    iput p2, p0, Llo0;->e:I

    .line 61
    .line 62
    const-wide v0, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, Llo0;->g:J

    .line 68
    .line 69
    new-instance p1, Lfo0;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p1, p0, v0}, Lfo0;-><init>(Llo0;I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lnm;

    .line 76
    .line 77
    invoke-direct {v1, p1}, Lnm;-><init>(Lsw;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Llo0;->k:Lnm;

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    iput-boolean p1, p0, Llo0;->l:Z

    .line 84
    .line 85
    const/4 v1, -0x1

    .line 86
    iput v1, p0, Llo0;->m:I

    .line 87
    .line 88
    sget-object v2, Loo0;->b:Lzn0;

    .line 89
    .line 90
    sget-object v3, Ln2;->M:Ln2;

    .line 91
    .line 92
    new-instance v4, Lgp0;

    .line 93
    .line 94
    invoke-direct {v4, v2, v3}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 95
    .line 96
    .line 97
    iput-object v4, p0, Llo0;->p:Lgp0;

    .line 98
    .line 99
    sget-object v2, Loo0;->a:Lno0;

    .line 100
    .line 101
    iput-object v2, p0, Llo0;->q:Lym;

    .line 102
    .line 103
    new-instance v2, Lxg0;

    .line 104
    .line 105
    invoke-direct {v2}, Lxg0;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v2, p0, Llo0;->r:Lxg0;

    .line 109
    .line 110
    new-instance v2, Ldp0;

    .line 111
    .line 112
    invoke-direct {v2, v1}, Ldp0;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iput-object v2, p0, Llo0;->s:Ldp0;

    .line 116
    .line 117
    new-instance v1, Ldp0;

    .line 118
    .line 119
    invoke-direct {v1, p2}, Ldp0;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object v1, p0, Llo0;->t:Ldp0;

    .line 123
    .line 124
    sget-object p2, Ln2;->U:Ln2;

    .line 125
    .line 126
    new-instance v1, Lgo0;

    .line 127
    .line 128
    invoke-direct {v1, p0, v0}, Lgo0;-><init>(Llo0;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {p2, v1}, Lr60;->l(Ln2;Lhw;)Ldn;

    .line 132
    .line 133
    .line 134
    new-instance v1, Lgo0;

    .line 135
    .line 136
    invoke-direct {v1, p0, p1}, Lgo0;-><init>(Llo0;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {p2, v1}, Lr60;->l(Ln2;Lhw;)Ldn;

    .line 140
    .line 141
    .line 142
    new-instance p2, Ld80;

    .line 143
    .line 144
    new-instance v1, Lfo0;

    .line 145
    .line 146
    invoke-direct {v1, p0, p1}, Lfo0;-><init>(Llo0;I)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p2, v1}, Ld80;-><init>(Lsw;)V

    .line 150
    .line 151
    .line 152
    iput-object p2, p0, Llo0;->u:Ld80;

    .line 153
    .line 154
    new-instance v1, Ljo0;

    .line 155
    .line 156
    invoke-direct {v1, v0}, Ljo0;-><init>(I)V

    .line 157
    .line 158
    .line 159
    new-instance v2, Lpn0;

    .line 160
    .line 161
    new-instance v3, Lgo0;

    .line 162
    .line 163
    const/4 v4, 0x2

    .line 164
    invoke-direct {v3, p0, v4}, Lgo0;-><init>(Llo0;I)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, v1, p2, v3}, Lpn0;-><init>(Ljo0;Ld80;Lgo0;)V

    .line 168
    .line 169
    .line 170
    iput-object v2, p0, Llo0;->v:Lpn0;

    .line 171
    .line 172
    new-instance p2, Leb;

    .line 173
    .line 174
    invoke-direct {p2, p1}, Leb;-><init>(I)V

    .line 175
    .line 176
    .line 177
    iput-object p2, p0, Llo0;->w:Leb;

    .line 178
    .line 179
    new-instance p2, Lo9;

    .line 180
    .line 181
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    iput-object p2, p0, Llo0;->x:Lo9;

    .line 185
    .line 186
    const/4 p2, 0x0

    .line 187
    invoke-static {p2}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    iput-object p2, p0, Llo0;->y:Lgp0;

    .line 192
    .line 193
    new-instance p2, La90;

    .line 194
    .line 195
    invoke-direct {p2, p0, p1}, La90;-><init>(Lez0;I)V

    .line 196
    .line 197
    .line 198
    iput-object p2, p0, Llo0;->z:La90;

    .line 199
    .line 200
    const/16 p1, 0xf

    .line 201
    .line 202
    invoke-static {v0, v0, p1}, Lqj;->b(III)J

    .line 203
    .line 204
    .line 205
    move-result-wide p1

    .line 206
    iput-wide p1, p0, Llo0;->A:J

    .line 207
    .line 208
    new-instance p1, La80;

    .line 209
    .line 210
    invoke-direct {p1}, La80;-><init>()V

    .line 211
    .line 212
    .line 213
    iput-object p1, p0, Llo0;->B:La80;

    .line 214
    .line 215
    invoke-static {}, Lg60;->i()Loh0;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iput-object p1, p0, Llo0;->C:Loh0;

    .line 220
    .line 221
    invoke-static {}, Lg60;->i()Loh0;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iput-object p1, p0, Llo0;->D:Loh0;

    .line 226
    .line 227
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    iput-object p2, p0, Llo0;->E:Lgp0;

    .line 234
    .line 235
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    iput-object p2, p0, Llo0;->F:Lgp0;

    .line 240
    .line 241
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    iput-object p2, p0, Llo0;->G:Lgp0;

    .line 246
    .line 247
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    iput-object p1, p0, Llo0;->H:Lgp0;

    .line 252
    .line 253
    return-void
.end method

.method public static synthetic g(Llo0;ILm51;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v0, v0, v2, v1}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Llo0;->f(ILo31;Ljk;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static j(ZLzn0;)I
    .locals 1

    .line 1
    iget-object v0, p1, Lzn0;->a:Ljava/util/List;

    .line 2
    .line 3
    iget p1, p1, Lzn0;->h:I

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    const p0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    invoke-static {v0}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lae0;

    .line 20
    .line 21
    iget p0, p0, Lae0;->a:I

    .line 22
    .line 23
    add-int/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_1
    invoke-static {v0}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lae0;

    .line 30
    .line 31
    iget p0, p0, Lae0;->a:I

    .line 32
    .line 33
    sub-int/2addr p0, p1

    .line 34
    add-int/lit8 p0, p0, -0x1

    .line 35
    .line 36
    return p0
.end method

.method public static t(Llo0;Lvh0;Lww;Ljk;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lko0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lko0;

    .line 7
    .line 8
    iget v1, v0, Lko0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lko0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lko0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lko0;-><init>(Llo0;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lko0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lko0;->l:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lzk;->d:Lzk;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lko0;->g:Llo0;

    .line 41
    .line 42
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    iget-object p0, v0, Lko0;->i:Lm51;

    .line 53
    .line 54
    move-object p2, p0

    .line 55
    check-cast p2, Lww;

    .line 56
    .line 57
    iget-object p1, v0, Lko0;->h:Lvh0;

    .line 58
    .line 59
    iget-object p0, v0, Lko0;->g:Llo0;

    .line 60
    .line 61
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p0, v0, Lko0;->g:Llo0;

    .line 69
    .line 70
    iput-object p1, v0, Lko0;->h:Lvh0;

    .line 71
    .line 72
    move-object p3, p2

    .line 73
    check-cast p3, Lm51;

    .line 74
    .line 75
    iput-object p3, v0, Lko0;->i:Lm51;

    .line 76
    .line 77
    iput v4, v0, Lko0;->l:I

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Llo0;->i(Ljk;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    if-ne p3, v5, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    iget-object p3, p0, Llo0;->k:Lnm;

    .line 87
    .line 88
    invoke-virtual {p3}, Lnm;->b()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-nez p3, :cond_5

    .line 93
    .line 94
    iget-object p3, p0, Llo0;->d:Lco0;

    .line 95
    .line 96
    iget-object p3, p3, Lco0;->b:Ldp0;

    .line 97
    .line 98
    invoke-virtual {p3}, Ldp0;->g()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    iget-object v1, p0, Llo0;->t:Ldp0;

    .line 103
    .line 104
    invoke-virtual {v1, p3}, Ldp0;->h(I)V

    .line 105
    .line 106
    .line 107
    :cond_5
    iget-object p3, p0, Llo0;->k:Lnm;

    .line 108
    .line 109
    iput-object p0, v0, Lko0;->g:Llo0;

    .line 110
    .line 111
    iput-object v2, v0, Lko0;->h:Lvh0;

    .line 112
    .line 113
    iput-object v2, v0, Lko0;->i:Lm51;

    .line 114
    .line 115
    iput v3, v0, Lko0;->l:I

    .line 116
    .line 117
    invoke-virtual {p3, p1, p2, v0}, Lnm;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v5, :cond_6

    .line 122
    .line 123
    :goto_2
    return-object v5

    .line 124
    :cond_6
    :goto_3
    const/4 p1, -0x1

    .line 125
    iget-object p0, p0, Llo0;->s:Ldp0;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, Ldp0;->h(I)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lna1;->a:Lna1;

    .line 131
    .line 132
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->F:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->k:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnm;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->E:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lvh0;Lww;Ljk;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Llo0;->t(Llo0;Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->k:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnm;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(ILo31;Ljk;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v3, p3, Lho0;

    .line 2
    .line 3
    if-eqz v3, :cond_0

    .line 4
    .line 5
    move-object v3, p3

    .line 6
    check-cast v3, Lho0;

    .line 7
    .line 8
    iget v4, v3, Lho0;->k:I

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    and-int v6, v4, v5

    .line 13
    .line 14
    if-eqz v6, :cond_0

    .line 15
    .line 16
    sub-int/2addr v4, v5

    .line 17
    iput v4, v3, Lho0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v3, Lho0;

    .line 22
    .line 23
    invoke-direct {v3, p0, p3}, Lho0;-><init>(Llo0;Ljk;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v2, v6, Lho0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    iget v3, v6, Lho0;->k:I

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    sget-object v8, Lna1;->a:Lna1;

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    sget-object v10, Lzk;->d:Lzk;

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v5, :cond_2

    .line 42
    .line 43
    if-ne v3, v9, :cond_1

    .line 44
    .line 45
    invoke-static {v2}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v7

    .line 55
    :cond_2
    iget v0, v6, Lho0;->g:I

    .line 56
    .line 57
    iget-object v3, v6, Lho0;->h:Lo31;

    .line 58
    .line 59
    invoke-static {v2}, Lw60;->M(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move v2, v4

    .line 63
    move-object v4, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {v2}, Lw60;->M(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Llo0;->d:Lco0;

    .line 69
    .line 70
    iget-object v2, v2, Lco0;->b:Ldp0;

    .line 71
    .line 72
    invoke-virtual {v2}, Ldp0;->g()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ne p1, v2, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, Llo0;->l()F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    cmpg-float v2, v2, v4

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    invoke-virtual {p0}, Llo0;->n()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    iput-object p2, v6, Lho0;->h:Lo31;

    .line 95
    .line 96
    iput p1, v6, Lho0;->g:I

    .line 97
    .line 98
    iput v5, v6, Lho0;->k:I

    .line 99
    .line 100
    invoke-virtual {p0, v6}, Llo0;->i(Ljk;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-ne v3, v10, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    move v0, p1

    .line 108
    move v2, v4

    .line 109
    move-object v4, p2

    .line 110
    :goto_2
    invoke-virtual {p0, v0}, Llo0;->k(I)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p0}, Llo0;->p()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    int-to-float v3, v3

    .line 119
    mul-float/2addr v3, v2

    .line 120
    move v2, v0

    .line 121
    new-instance v0, Lio0;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    move-object v1, p0

    .line 125
    invoke-direct/range {v0 .. v5}, Lio0;-><init>(Llo0;IFLv7;Lik;)V

    .line 126
    .line 127
    .line 128
    iput-object v7, v6, Lho0;->h:Lo31;

    .line 129
    .line 130
    iput v9, v6, Lho0;->k:I

    .line 131
    .line 132
    sget-object v2, Lvh0;->d:Lvh0;

    .line 133
    .line 134
    invoke-virtual {p0, v2, v0, v6}, Llo0;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-ne v0, v10, :cond_7

    .line 139
    .line 140
    :goto_3
    return-object v10

    .line 141
    :cond_7
    :goto_4
    return-object v8
.end method

.method public final h(Lzn0;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, Lzn0;->a:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p1, Lzn0;->l:I

    .line 4
    .line 5
    iget-object v2, p1, Lzn0;->i:Lae0;

    .line 6
    .line 7
    iget-object v3, p1, Lzn0;->j:Lae0;

    .line 8
    .line 9
    iget v4, p1, Lzn0;->k:F

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, p0, Llo0;->u:Ld80;

    .line 16
    .line 17
    iput v5, v6, Ld80;->e:I

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    iget-boolean v5, p0, Llo0;->a:Z

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    iput-object p1, p0, Llo0;->b:Lzn0;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const/4 v5, 0x1

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iput-boolean v5, p0, Llo0;->a:Z

    .line 32
    .line 33
    :cond_1
    const/4 p2, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    iget-object v7, p0, Llo0;->d:Lco0;

    .line 36
    .line 37
    if-eqz p3, :cond_2

    .line 38
    .line 39
    iget-object p3, v7, Lco0;->c:Lcp0;

    .line 40
    .line 41
    invoke-virtual {p3, v4}, Lcp0;->h(F)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget-object p3, v3, Lae0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object p3, v6

    .line 54
    :goto_0
    iput-object p3, v7, Lco0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    iget-boolean p3, v7, Lco0;->d:Z

    .line 57
    .line 58
    if-nez p3, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-nez p3, :cond_6

    .line 65
    .line 66
    :cond_4
    iput-boolean v5, v7, Lco0;->d:Z

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    iget p3, v3, Lae0;->a:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    move p3, p2

    .line 74
    :goto_1
    iget-object v3, v7, Lco0;->b:Ldp0;

    .line 75
    .line 76
    invoke-virtual {v3, p3}, Ldp0;->h(I)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v7, Lco0;->f:Lt70;

    .line 80
    .line 81
    invoke-virtual {v3, p3}, Lt70;->a(I)V

    .line 82
    .line 83
    .line 84
    iget-object p3, v7, Lco0;->c:Lcp0;

    .line 85
    .line 86
    invoke-virtual {p3, v4}, Lcp0;->h(F)V

    .line 87
    .line 88
    .line 89
    :cond_6
    iget p3, p0, Llo0;->m:I

    .line 90
    .line 91
    const/4 v3, -0x1

    .line 92
    if-eq p3, v3, :cond_8

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    if-nez p3, :cond_8

    .line 99
    .line 100
    iget-boolean p3, p0, Llo0;->o:Z

    .line 101
    .line 102
    invoke-static {p3, p1}, Llo0;->j(ZLzn0;)I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    iget v0, p0, Llo0;->m:I

    .line 107
    .line 108
    if-eq v0, p3, :cond_8

    .line 109
    .line 110
    iput v3, p0, Llo0;->m:I

    .line 111
    .line 112
    iget-object p3, p0, Llo0;->n:Lc80;

    .line 113
    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    invoke-interface {p3}, Lc80;->cancel()V

    .line 117
    .line 118
    .line 119
    :cond_7
    iput-object v6, p0, Llo0;->n:Lc80;

    .line 120
    .line 121
    :cond_8
    :goto_2
    iget-object p3, p0, Llo0;->p:Lgp0;

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-boolean p3, p1, Lzn0;->m:Z

    .line 127
    .line 128
    iget-object v0, p0, Llo0;->E:Lgp0;

    .line 129
    .line 130
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    invoke-virtual {v0, p3}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    iget p3, v2, Lae0;->a:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    move p3, p2

    .line 143
    :goto_3
    if-nez p3, :cond_b

    .line 144
    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_a
    move v5, p2

    .line 149
    :cond_b
    :goto_4
    iget-object p3, p0, Llo0;->F:Lgp0;

    .line 150
    .line 151
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p3, v0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    if-eqz v2, :cond_c

    .line 159
    .line 160
    iget p3, v2, Lae0;->a:I

    .line 161
    .line 162
    iput p3, p0, Llo0;->e:I

    .line 163
    .line 164
    :cond_c
    iput v1, p0, Llo0;->f:I

    .line 165
    .line 166
    invoke-static {}, Lu50;->k()Ll21;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    if-eqz p3, :cond_d

    .line 171
    .line 172
    invoke-virtual {p3}, Ll21;->e()Lsw;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    :cond_d
    invoke-static {p3}, Lu50;->s(Ll21;)Ll21;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :try_start_0
    iget-boolean v1, p0, Llo0;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    const/16 v2, 0x20

    .line 183
    .line 184
    const-wide v3, 0xffffffffL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    if-nez v1, :cond_f

    .line 190
    .line 191
    :cond_e
    :goto_5
    invoke-static {p3, v0, v6}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_f
    :try_start_1
    iget v1, p1, Lzn0;->h:I

    .line 196
    .line 197
    invoke-virtual {p0}, Llo0;->n()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-lt v1, v5, :cond_10

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_10
    iget v1, p0, Llo0;->j:F

    .line 205
    .line 206
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    const/high16 v5, 0x3f000000    # 0.5f

    .line 211
    .line 212
    cmpg-float v1, v1, v5

    .line 213
    .line 214
    if-gtz v1, :cond_11

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_11
    iget v1, p0, Llo0;->j:F

    .line 218
    .line 219
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    iget-object v5, v5, Lzn0;->e:Lum0;

    .line 224
    .line 225
    sget-object v7, Lum0;->d:Lum0;

    .line 226
    .line 227
    if-ne v5, v7, :cond_12

    .line 228
    .line 229
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-virtual {p0}, Llo0;->q()J

    .line 234
    .line 235
    .line 236
    move-result-wide v7

    .line 237
    and-long/2addr v7, v3

    .line 238
    long-to-int v5, v7

    .line 239
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    neg-float v5, v5

    .line 244
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    cmpg-float v1, v1, v5

    .line 249
    .line 250
    if-nez v1, :cond_13

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_12
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {p0}, Llo0;->q()J

    .line 258
    .line 259
    .line 260
    move-result-wide v7

    .line 261
    shr-long/2addr v7, v2

    .line 262
    long-to-int v5, v7

    .line 263
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    neg-float v5, v5

    .line 268
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    cmpg-float v1, v1, v5

    .line 273
    .line 274
    if-nez v1, :cond_13

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_13
    invoke-virtual {p0}, Llo0;->r()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_e

    .line 282
    .line 283
    :goto_6
    iget v1, p0, Llo0;->j:F

    .line 284
    .line 285
    invoke-virtual {p0, v1, p1}, Llo0;->s(FLzn0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    .line 287
    .line 288
    goto :goto_5

    .line 289
    :catchall_0
    move-exception p0

    .line 290
    goto :goto_a

    .line 291
    :goto_7
    invoke-virtual {p0}, Llo0;->n()I

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    invoke-static {p1, p3}, Loo0;->a(Lzn0;I)J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    iput-wide v0, p0, Llo0;->g:J

    .line 300
    .line 301
    invoke-virtual {p0}, Llo0;->n()I

    .line 302
    .line 303
    .line 304
    iget-object p3, p1, Lzn0;->e:Lum0;

    .line 305
    .line 306
    sget-object v0, Lum0;->e:Lum0;

    .line 307
    .line 308
    if-ne p3, v0, :cond_14

    .line 309
    .line 310
    invoke-virtual {p1}, Lzn0;->g()J

    .line 311
    .line 312
    .line 313
    move-result-wide v0

    .line 314
    shr-long/2addr v0, v2

    .line 315
    :goto_8
    long-to-int p3, v0

    .line 316
    goto :goto_9

    .line 317
    :cond_14
    invoke-virtual {p1}, Lzn0;->g()J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    and-long/2addr v0, v3

    .line 322
    goto :goto_8

    .line 323
    :goto_9
    iget-object v0, p1, Lzn0;->n:Ln2;

    .line 324
    .line 325
    iget v1, p1, Lzn0;->b:I

    .line 326
    .line 327
    iget v2, p1, Lzn0;->f:I

    .line 328
    .line 329
    neg-int v2, v2

    .line 330
    iget p1, p1, Lzn0;->d:I

    .line 331
    .line 332
    invoke-virtual {v0, p3, v1, v2, p1}, Ln2;->i(IIII)I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    invoke-static {p1, p2, p3}, Lw60;->n(III)I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    int-to-long p1, p1

    .line 341
    iget-wide v0, p0, Llo0;->g:J

    .line 342
    .line 343
    cmp-long p3, p1, v0

    .line 344
    .line 345
    if-lez p3, :cond_15

    .line 346
    .line 347
    move-wide p1, v0

    .line 348
    :cond_15
    iput-wide p1, p0, Llo0;->h:J

    .line 349
    .line 350
    return-void

    .line 351
    :goto_a
    invoke-static {p3, v0, v6}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 352
    .line 353
    .line 354
    throw p0
.end method

.method public final i(Ljk;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llo0;->p:Lgp0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Loo0;->b:Lzn0;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Llo0;->x:Lo9;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lo9;->g(Ljk;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lzk;->d:Lzk;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 23
    .line 24
    return-object p0
.end method

.method public final k(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Llo0;->n()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Llo0;->n()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, p0}, Lw60;->n(III)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return v1
.end method

.method public final l()F
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->d:Lco0;

    .line 2
    .line 3
    iget-object p0, p0, Lco0;->c:Lcp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcp0;->g()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final m()Lzn0;
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->p:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzn0;

    .line 8
    .line 9
    return-object p0
.end method

.method public abstract n()I
.end method

.method public final o()I
    .locals 0

    .line 1
    iget-object p0, p0, Llo0;->p:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzn0;

    .line 8
    .line 9
    iget p0, p0, Lzn0;->b:I

    .line 10
    .line 11
    return p0
.end method

.method public final p()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Llo0;->o()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Llo0;->p:Lgp0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lzn0;

    .line 12
    .line 13
    iget p0, p0, Lzn0;->c:I

    .line 14
    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-object p0, p0, Llo0;->c:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lok0;

    .line 8
    .line 9
    iget-wide v0, p0, Lok0;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final r()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Llo0;->q()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Llo0;->q()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    long-to-int p0, v0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    float-to-int p0, p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final s(FLzn0;)V
    .locals 8

    .line 1
    iget-object v0, p2, Lzn0;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-boolean v1, p0, Llo0;->l:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_5

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    cmpl-float v1, p1, v1

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x0

    .line 23
    :goto_0
    invoke-static {v1, p2}, Llo0;->j(ZLzn0;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ltz v3, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0}, Llo0;->n()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v3, v2, :cond_5

    .line 34
    .line 35
    iget v2, p0, Llo0;->m:I

    .line 36
    .line 37
    if-eq v3, v2, :cond_3

    .line 38
    .line 39
    iget-boolean v2, p0, Llo0;->o:Z

    .line 40
    .line 41
    if-eq v2, v1, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, Llo0;->n:Lc80;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v2}, Lc80;->cancel()V

    .line 48
    .line 49
    .line 50
    :cond_2
    iput-boolean v1, p0, Llo0;->o:Z

    .line 51
    .line 52
    iput v3, p0, Llo0;->m:I

    .line 53
    .line 54
    iget-wide v4, p0, Llo0;->A:J

    .line 55
    .line 56
    const/4 v6, 0x1

    .line 57
    iget-object v2, p0, Llo0;->u:Ld80;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-virtual/range {v2 .. v7}, Ld80;->a(IJZLsw;)Lc80;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, p0, Llo0;->n:Lc80;

    .line 65
    .line 66
    :cond_3
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-static {v0}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lae0;

    .line 73
    .line 74
    iget v1, p2, Lzn0;->b:I

    .line 75
    .line 76
    iget v2, p2, Lzn0;->c:I

    .line 77
    .line 78
    add-int/2addr v1, v2

    .line 79
    iget v0, v0, Lae0;->j:I

    .line 80
    .line 81
    add-int/2addr v0, v1

    .line 82
    iget p2, p2, Lzn0;->g:I

    .line 83
    .line 84
    sub-int/2addr v0, p2

    .line 85
    int-to-float p2, v0

    .line 86
    cmpg-float p1, p2, p1

    .line 87
    .line 88
    if-gez p1, :cond_5

    .line 89
    .line 90
    iget-object p0, p0, Llo0;->n:Lc80;

    .line 91
    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    invoke-interface {p0}, Lc80;->a()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    invoke-static {v0}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lae0;

    .line 103
    .line 104
    iget p2, p2, Lzn0;->f:I

    .line 105
    .line 106
    iget v0, v0, Lae0;->j:I

    .line 107
    .line 108
    sub-int/2addr p2, v0

    .line 109
    int-to-float p2, p2

    .line 110
    neg-float p1, p1

    .line 111
    cmpg-float p1, p2, p1

    .line 112
    .line 113
    if-gez p1, :cond_5

    .line 114
    .line 115
    iget-object p0, p0, Llo0;->n:Lc80;

    .line 116
    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    invoke-interface {p0}, Lc80;->a()V

    .line 120
    .line 121
    .line 122
    :cond_5
    :goto_1
    return-void
.end method

.method public final u(IFZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Llo0;->d:Lco0;

    .line 2
    .line 3
    iget-object v1, v0, Lco0;->b:Ldp0;

    .line 4
    .line 5
    iget-object v2, v0, Lco0;->c:Lcp0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldp0;->g()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v1, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lcp0;->g()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    cmpg-float v1, v1, p2

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Llo0;->v:Lpn0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lpn0;->a()V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v1, v0, Lco0;->b:Ldp0;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ldp0;->h(I)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lco0;->f:Lt70;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lt70;->a(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p2}, Lcp0;->h(F)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    iput-object p1, v0, Lco0;->e:Ljava/lang/Object;

    .line 42
    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Llo0;->y:Lgp0;

    .line 46
    .line 47
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lb60;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lb60;->k()V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void

    .line 59
    :cond_2
    iget-object p0, p0, Llo0;->D:Loh0;

    .line 60
    .line 61
    sget-object p1, Lna1;->a:Lna1;

    .line 62
    .line 63
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
