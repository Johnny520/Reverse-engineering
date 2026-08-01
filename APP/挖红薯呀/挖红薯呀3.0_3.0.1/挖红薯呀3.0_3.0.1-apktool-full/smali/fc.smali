.class public final Lfc;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:I

.field public final synthetic i:Lb7;

.field public final synthetic j:F

.field public final synthetic k:Z

.field public final synthetic l:Lgc;

.field public final synthetic m:Lf30;


# direct methods
.method public constructor <init>(Lb7;FZLgc;Lf30;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfc;->i:Lb7;

    .line 2
    .line 3
    iput p2, p0, Lfc;->j:F

    .line 4
    .line 5
    iput-boolean p3, p0, Lfc;->k:Z

    .line 6
    .line 7
    iput-object p4, p0, Lfc;->l:Lgc;

    .line 8
    .line 9
    iput-object p5, p0, Lfc;->m:Lf30;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lm51;-><init>(ILik;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 7

    .line 1
    new-instance v0, Lfc;

    .line 2
    .line 3
    iget-object v4, p0, Lfc;->l:Lgc;

    .line 4
    .line 5
    iget-object v5, p0, Lfc;->m:Lf30;

    .line 6
    .line 7
    iget-object v1, p0, Lfc;->i:Lb7;

    .line 8
    .line 9
    iget v2, p0, Lfc;->j:F

    .line 10
    .line 11
    iget-boolean v3, p0, Lfc;->k:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lfc;-><init>(Lb7;FZLgc;Lf30;Lik;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyk;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lfc;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lfc;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lfc;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lfc;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v4, :cond_1

    .line 11
    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    :goto_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move p1, v3

    .line 30
    iget-object v3, p0, Lfc;->i:Lb7;

    .line 31
    .line 32
    iget-object v0, v3, Lb7;->e:Lgp0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lnp;

    .line 39
    .line 40
    iget v0, v0, Lnp;->d:F

    .line 41
    .line 42
    iget v5, p0, Lfc;->j:F

    .line 43
    .line 44
    invoke-static {v0, v5}, Lnp;->b(FF)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_11

    .line 49
    .line 50
    iget-boolean v0, p0, Lfc;->k:Z

    .line 51
    .line 52
    sget-object v9, Lzk;->d:Lzk;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    new-instance p1, Lnp;

    .line 57
    .line 58
    invoke-direct {p1, v5}, Lnp;-><init>(F)V

    .line 59
    .line 60
    .line 61
    iput v4, p0, Lfc;->h:I

    .line 62
    .line 63
    invoke-virtual {v3, p1, p0}, Lb7;->e(Ljava/lang/Object;Lm51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v9, :cond_11

    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_3
    iget-object v0, v3, Lb7;->e:Lgp0;

    .line 72
    .line 73
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lnp;

    .line 78
    .line 79
    iget v0, v0, Lnp;->d:F

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static {v0, v4}, Lnp;->b(FF)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    new-instance v0, Ljs0;

    .line 89
    .line 90
    const-wide/16 v6, 0x0

    .line 91
    .line 92
    invoke-direct {v0, v6, v7}, Ljs0;-><init>(J)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    iget-object v6, p0, Lfc;->l:Lgc;

    .line 97
    .line 98
    iget v6, v6, Lgc;->a:F

    .line 99
    .line 100
    invoke-static {v0, v6}, Lnp;->b(FF)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    new-instance v0, Lgz;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    invoke-static {v0, v4}, Lnp;->b(FF)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    new-instance v0, Lru;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    move-object v0, v2

    .line 125
    :goto_1
    iput p1, p0, Lfc;->h:I

    .line 126
    .line 127
    sget-object p1, Lmr;->b:Lp91;

    .line 128
    .line 129
    sget-object v4, Lmr;->a:Lp91;

    .line 130
    .line 131
    iget-object v6, p0, Lfc;->m:Lf30;

    .line 132
    .line 133
    if-eqz v6, :cond_a

    .line 134
    .line 135
    instance-of p1, v6, Ljs0;

    .line 136
    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    :goto_2
    move-object v2, v4

    .line 140
    goto :goto_4

    .line 141
    :cond_7
    instance-of p1, v6, Llq;

    .line 142
    .line 143
    if-eqz p1, :cond_8

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_8
    instance-of p1, v6, Lgz;

    .line 147
    .line 148
    if-eqz p1, :cond_9

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_9
    instance-of p1, v6, Lru;

    .line 152
    .line 153
    if-eqz p1, :cond_e

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_a
    if-eqz v0, :cond_e

    .line 157
    .line 158
    instance-of v4, v0, Ljs0;

    .line 159
    .line 160
    if-eqz v4, :cond_b

    .line 161
    .line 162
    :goto_3
    move-object v2, p1

    .line 163
    goto :goto_4

    .line 164
    :cond_b
    instance-of v4, v0, Llq;

    .line 165
    .line 166
    if-eqz v4, :cond_c

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_c
    instance-of v4, v0, Lgz;

    .line 170
    .line 171
    if-eqz v4, :cond_d

    .line 172
    .line 173
    sget-object v2, Lmr;->c:Lp91;

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_d
    instance-of v0, v0, Lru;

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_e
    :goto_4
    if-eqz v2, :cond_f

    .line 182
    .line 183
    new-instance v4, Lnp;

    .line 184
    .line 185
    invoke-direct {v4, v5}, Lnp;-><init>(F)V

    .line 186
    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    const/16 v8, 0xc

    .line 190
    .line 191
    move-object v7, p0

    .line 192
    move-object v5, v2

    .line 193
    invoke-static/range {v3 .. v8}, Lb7;->c(Lb7;Ljava/lang/Object;Lv7;Lsw;Lm51;I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, v9, :cond_10

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_f
    move-object v7, p0

    .line 201
    new-instance p0, Lnp;

    .line 202
    .line 203
    invoke-direct {p0, v5}, Lnp;-><init>(F)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, p0, v7}, Lb7;->e(Ljava/lang/Object;Lm51;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    if-ne p0, v9, :cond_10

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_10
    move-object p0, v1

    .line 214
    :goto_5
    if-ne p0, v9, :cond_11

    .line 215
    .line 216
    :goto_6
    return-object v9

    .line 217
    :cond_11
    :goto_7
    return-object v1
.end method
