.class public final Lio0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Llo0;

.field public final synthetic k:I

.field public final synthetic l:F

.field public final synthetic m:Lv7;


# direct methods
.method public constructor <init>(Llo0;IFLv7;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio0;->j:Llo0;

    .line 2
    .line 3
    iput p2, p0, Lio0;->k:I

    .line 4
    .line 5
    iput p3, p0, Lio0;->l:F

    .line 6
    .line 7
    iput-object p4, p0, Lio0;->m:Lv7;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 6

    .line 1
    new-instance v0, Lio0;

    .line 2
    .line 3
    iget v3, p0, Lio0;->l:F

    .line 4
    .line 5
    iget-object v4, p0, Lio0;->m:Lv7;

    .line 6
    .line 7
    iget-object v1, p0, Lio0;->j:Llo0;

    .line 8
    .line 9
    iget v2, p0, Lio0;->k:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lio0;-><init>(Llo0;IFLv7;Lik;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lio0;->i:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lny0;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lio0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lio0;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lio0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lio0;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lio0;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lny0;

    .line 27
    .line 28
    new-instance v0, Lmm;

    .line 29
    .line 30
    iget-object v3, p0, Lio0;->j:Llo0;

    .line 31
    .line 32
    invoke-direct {v0, p1, v3}, Lmm;-><init>(Lny0;Llo0;)V

    .line 33
    .line 34
    .line 35
    iput v2, p0, Lio0;->h:I

    .line 36
    .line 37
    sget-object p1, Loo0;->a:Lno0;

    .line 38
    .line 39
    new-instance p1, Ljava/lang/Integer;

    .line 40
    .line 41
    iget v4, p0, Lio0;->k:I

    .line 42
    .line 43
    invoke-direct {p1, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v3, p1}, Llo0;->k(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v5, v3, Llo0;->s:Ldp0;

    .line 55
    .line 56
    invoke-virtual {v5, p1}, Ldp0;->h(I)V

    .line 57
    .line 58
    .line 59
    iget p1, v3, Llo0;->e:I

    .line 60
    .line 61
    if-le v4, p1, :cond_2

    .line 62
    .line 63
    move p1, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    :goto_0
    invoke-virtual {v3}, Llo0;->m()Lzn0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v5, v5, Lzn0;->a:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v5}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lae0;

    .line 77
    .line 78
    iget v5, v5, Lae0;->a:I

    .line 79
    .line 80
    iget v6, v3, Llo0;->e:I

    .line 81
    .line 82
    sub-int/2addr v5, v6

    .line 83
    add-int/2addr v5, v2

    .line 84
    const/4 v6, 0x0

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v3}, Llo0;->m()Lzn0;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v7, v7, Lzn0;->a:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v7}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lae0;

    .line 98
    .line 99
    iget v7, v7, Lae0;->a:I

    .line 100
    .line 101
    if-gt v4, v7, :cond_4

    .line 102
    .line 103
    :cond_3
    if-nez p1, :cond_8

    .line 104
    .line 105
    iget v7, v3, Llo0;->e:I

    .line 106
    .line 107
    if-ge v4, v7, :cond_8

    .line 108
    .line 109
    :cond_4
    iget v7, v3, Llo0;->e:I

    .line 110
    .line 111
    sub-int v7, v4, v7

    .line 112
    .line 113
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    const/4 v8, 0x3

    .line 118
    if-lt v7, v8, :cond_8

    .line 119
    .line 120
    iget v7, v3, Llo0;->e:I

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    sub-int p1, v4, v5

    .line 125
    .line 126
    if-ge p1, v7, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move v7, p1

    .line 130
    goto :goto_1

    .line 131
    :cond_6
    add-int/2addr v5, v4

    .line 132
    if-le v5, v7, :cond_7

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    move v7, v5

    .line 136
    :goto_1
    invoke-virtual {v3}, Llo0;->p()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    int-to-float p1, p1

    .line 141
    div-float p1, v6, p1

    .line 142
    .line 143
    invoke-virtual {v3, v7, p1, v2}, Llo0;->u(IFZ)V

    .line 144
    .line 145
    .line 146
    :cond_8
    iget-object p1, v3, Llo0;->d:Lco0;

    .line 147
    .line 148
    iget-object p1, p1, Lco0;->b:Ldp0;

    .line 149
    .line 150
    invoke-virtual {p1}, Ldp0;->g()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    sub-int/2addr v4, p1

    .line 155
    invoke-virtual {v3}, Llo0;->p()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    mul-int/2addr p1, v4

    .line 160
    int-to-float p1, p1

    .line 161
    invoke-virtual {v3}, Llo0;->l()F

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v3}, Llo0;->p()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    int-to-float v4, v4

    .line 170
    mul-float/2addr v2, v4

    .line 171
    sub-float/2addr p1, v2

    .line 172
    add-float/2addr p1, v6

    .line 173
    invoke-static {p1}, Lrd0;->Q(F)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-static {v3}, Lj50;->k(Llo0;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    int-to-long v6, p1

    .line 182
    add-long v8, v4, v6

    .line 183
    .line 184
    iget-wide v10, v3, Llo0;->h:J

    .line 185
    .line 186
    iget-wide v12, v3, Llo0;->g:J

    .line 187
    .line 188
    invoke-static/range {v8 .. v13}, Lw60;->o(JJJ)J

    .line 189
    .line 190
    .line 191
    move-result-wide v4

    .line 192
    invoke-static {v3}, Lj50;->k(Llo0;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v2

    .line 196
    sub-long/2addr v4, v2

    .line 197
    long-to-int p1, v4

    .line 198
    int-to-float p1, p1

    .line 199
    iget v2, p0, Lio0;->l:F

    .line 200
    .line 201
    add-float/2addr p1, v2

    .line 202
    new-instance v2, Lwt0;

    .line 203
    .line 204
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v3, Led;

    .line 208
    .line 209
    const/16 v4, 0xa

    .line 210
    .line 211
    invoke-direct {v3, v4, v2, v0}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const/4 v0, 0x4

    .line 215
    iget-object v2, p0, Lio0;->m:Lv7;

    .line 216
    .line 217
    invoke-static {p1, v2, v3, p0, v0}, Lz60;->f(FLv7;Lww;Lm51;I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    sget-object p1, Lzk;->d:Lzk;

    .line 222
    .line 223
    if-ne p0, p1, :cond_9

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_9
    move-object p0, v1

    .line 227
    :goto_2
    if-ne p0, p1, :cond_a

    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_a
    return-object v1
.end method
