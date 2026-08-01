.class public final Lg;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:J

.field public final synthetic k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Lik;I)V
    .locals 0

    .line 1
    iput p6, p0, Lg;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lg;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Lg;->j:J

    .line 6
    .line 7
    iput-object p4, p0, Lg;->k:Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget v0, p0, Lg;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lg;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lg;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lg;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, Llz0;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Lwt0;

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    iget-wide v5, p0, Lg;->j:J

    .line 20
    .line 21
    move-object v8, p2

    .line 22
    invoke-direct/range {v3 .. v9}, Lg;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lik;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v3, Lg;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v3

    .line 28
    :pswitch_0
    move-object v9, p2

    .line 29
    new-instance v4, Lg;

    .line 30
    .line 31
    move-object v5, v2

    .line 32
    check-cast v5, Lc40;

    .line 33
    .line 34
    move-object v8, v1

    .line 35
    check-cast v8, Lxg0;

    .line 36
    .line 37
    const/4 v10, 0x1

    .line 38
    iget-wide v6, p0, Lg;->j:J

    .line 39
    .line 40
    invoke-direct/range {v4 .. v10}, Lg;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lik;I)V

    .line 41
    .line 42
    .line 43
    return-object v4

    .line 44
    :pswitch_1
    move-object v9, p2

    .line 45
    new-instance v4, Lg;

    .line 46
    .line 47
    move-object v5, v2

    .line 48
    check-cast v5, Ln;

    .line 49
    .line 50
    move-object v8, v1

    .line 51
    check-cast v8, Lxg0;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    iget-wide v6, p0, Lg;->j:J

    .line 55
    .line 56
    invoke-direct/range {v4 .. v10}, Lg;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lik;I)V

    .line 57
    .line 58
    .line 59
    return-object v4

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljz0;

    .line 9
    .line 10
    check-cast p2, Lik;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lg;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lyk;

    .line 24
    .line 25
    check-cast p2, Lik;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lg;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lyk;

    .line 39
    .line 40
    check-cast p2, Lik;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lg;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lg;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Lna1;->a:Lna1;

    .line 5
    .line 6
    iget-object v3, p0, Lg;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iget-wide v4, p0, Lg;->j:J

    .line 9
    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v7, Lzk;->d:Lzk;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, p0, Lg;->m:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v9, Llz0;

    .line 22
    .line 23
    iget v0, p0, Lg;->i:I

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-ne v0, v8, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v6}, Lxc;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v2, v10

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lg;->l:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljz0;

    .line 44
    .line 45
    invoke-virtual {v9, v4, v5}, Llz0;->g(J)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    check-cast v3, Lwt0;

    .line 50
    .line 51
    new-instance v1, Lvy0;

    .line 52
    .line 53
    invoke-direct {v1, v3, v9, p1}, Lvy0;-><init>(Lwt0;Llz0;Ljz0;)V

    .line 54
    .line 55
    .line 56
    iput v8, p0, Lg;->i:I

    .line 57
    .line 58
    const/16 p1, 0xc

    .line 59
    .line 60
    invoke-static {v0, v10, v1, p0, p1}, Lz60;->f(FLv7;Lww;Lm51;I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v7, :cond_2

    .line 65
    .line 66
    move-object v2, v7

    .line 67
    :cond_2
    :goto_0
    return-object v2

    .line 68
    :pswitch_0
    check-cast v3, Lxg0;

    .line 69
    .line 70
    iget v0, p0, Lg;->i:I

    .line 71
    .line 72
    const/4 v11, 0x3

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    if-eq v0, v8, :cond_5

    .line 76
    .line 77
    if-eq v0, v1, :cond_4

    .line 78
    .line 79
    if-ne v0, v11, :cond_3

    .line 80
    .line 81
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_3
    invoke-static {v6}, Lxc;->o(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object v2, v10

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    iget-object v0, p0, Lg;->l:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lks0;

    .line 93
    .line 94
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v9, Lc40;

    .line 106
    .line 107
    iput v8, p0, Lg;->i:I

    .line 108
    .line 109
    invoke-interface {v9, p0}, Lc40;->v(Ljk;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v7, :cond_7

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_7
    :goto_1
    new-instance p1, Ljs0;

    .line 117
    .line 118
    invoke-direct {p1, v4, v5}, Ljs0;-><init>(J)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lks0;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Lks0;-><init>(Ljs0;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Lg;->l:Ljava/lang/Object;

    .line 127
    .line 128
    iput v1, p0, Lg;->i:I

    .line 129
    .line 130
    invoke-virtual {v3, p1, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v7, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    :goto_2
    iput-object v10, p0, Lg;->l:Ljava/lang/Object;

    .line 138
    .line 139
    iput v11, p0, Lg;->i:I

    .line 140
    .line 141
    invoke-virtual {v3, v0, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v7, :cond_9

    .line 146
    .line 147
    :goto_3
    move-object v2, v7

    .line 148
    :cond_9
    :goto_4
    return-object v2

    .line 149
    :pswitch_1
    check-cast v9, Ln;

    .line 150
    .line 151
    iget v0, p0, Lg;->i:I

    .line 152
    .line 153
    if-eqz v0, :cond_c

    .line 154
    .line 155
    if-eq v0, v8, :cond_b

    .line 156
    .line 157
    if-ne v0, v1, :cond_a

    .line 158
    .line 159
    iget-object p0, p0, Lg;->l:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, Ljs0;

    .line 162
    .line 163
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_a
    invoke-static {v6}, Lxc;->o(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object v2, v10

    .line 171
    goto :goto_8

    .line 172
    :cond_b
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_c
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, Ln;->B0()Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-eqz p1, :cond_d

    .line 184
    .line 185
    sget-wide v10, Lre;->a:J

    .line 186
    .line 187
    iput v8, p0, Lg;->i:I

    .line 188
    .line 189
    invoke-static {v10, v11, p0}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-ne p1, v7, :cond_d

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_d
    :goto_5
    new-instance p1, Ljs0;

    .line 197
    .line 198
    invoke-direct {p1, v4, v5}, Ljs0;-><init>(J)V

    .line 199
    .line 200
    .line 201
    check-cast v3, Lxg0;

    .line 202
    .line 203
    iput-object p1, p0, Lg;->l:Ljava/lang/Object;

    .line 204
    .line 205
    iput v1, p0, Lg;->i:I

    .line 206
    .line 207
    invoke-virtual {v3, p1, p0}, Lxg0;->b(Lf30;Lik;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    if-ne p0, v7, :cond_e

    .line 212
    .line 213
    :goto_6
    move-object v2, v7

    .line 214
    goto :goto_8

    .line 215
    :cond_e
    move-object p0, p1

    .line 216
    :goto_7
    iput-object p0, v9, Ln;->D:Ljs0;

    .line 217
    .line 218
    :goto_8
    return-object v2

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
