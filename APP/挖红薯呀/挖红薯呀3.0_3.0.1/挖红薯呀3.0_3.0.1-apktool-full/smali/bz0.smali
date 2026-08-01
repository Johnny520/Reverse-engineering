.class public final Lbz0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ljava/lang/Object;

.field public synthetic k:J


# direct methods
.method public constructor <init>(JLr51;Lik;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lbz0;->h:I

    .line 3
    .line 4
    iput-wide p1, p0, Lbz0;->k:J

    .line 5
    .line 6
    iput-object p3, p0, Lbz0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ldz0;JLik;I)V
    .locals 0

    .line 13
    iput p5, p0, Lbz0;->h:I

    iput-object p1, p0, Lbz0;->j:Ljava/lang/Object;

    iput-wide p2, p0, Lbz0;->k:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public constructor <init>(Ldz0;Lik;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lbz0;->h:I

    .line 14
    iput-object p1, p0, Lbz0;->j:Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 7

    .line 1
    iget v0, p0, Lbz0;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lbz0;->j:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lbz0;

    .line 9
    .line 10
    iget-wide v2, p0, Lbz0;->k:J

    .line 11
    .line 12
    check-cast v1, Lr51;

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v1, p2}, Lbz0;-><init>(JLr51;Lik;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p0, Lbz0;

    .line 19
    .line 20
    check-cast v1, Ldz0;

    .line 21
    .line 22
    invoke-direct {p0, v1, p2}, Lbz0;-><init>(Ldz0;Lik;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Lok0;

    .line 26
    .line 27
    iget-wide p1, p1, Lok0;->a:J

    .line 28
    .line 29
    iput-wide p1, p0, Lbz0;->k:J

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    new-instance v0, Lbz0;

    .line 33
    .line 34
    check-cast v1, Ldz0;

    .line 35
    .line 36
    iget-wide v2, p0, Lbz0;->k:J

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    move-object v4, p2

    .line 40
    invoke-direct/range {v0 .. v5}, Lbz0;-><init>(Ldz0;JLik;I)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_2
    move-object v4, p2

    .line 45
    move-object p1, v1

    .line 46
    new-instance v1, Lbz0;

    .line 47
    .line 48
    move-object v2, p1

    .line 49
    check-cast v2, Ldz0;

    .line 50
    .line 51
    iget-wide p0, p0, Lbz0;->k:J

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v5, v4

    .line 55
    move-wide v3, p0

    .line 56
    invoke-direct/range {v1 .. v6}, Lbz0;-><init>(Ldz0;JLik;I)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lbz0;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lyk;

    .line 9
    .line 10
    check-cast p2, Lik;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lbz0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lbz0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lbz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lok0;

    .line 24
    .line 25
    iget-wide v2, p1, Lok0;->a:J

    .line 26
    .line 27
    check-cast p2, Lik;

    .line 28
    .line 29
    new-instance p1, Lbz0;

    .line 30
    .line 31
    iget-object p0, p0, Lbz0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ldz0;

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, Lbz0;-><init>(Ldz0;Lik;)V

    .line 36
    .line 37
    .line 38
    iput-wide v2, p1, Lbz0;->k:J

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Lbz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p1, Lyk;

    .line 46
    .line 47
    check-cast p2, Lik;

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Lbz0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lbz0;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lbz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Lyk;

    .line 61
    .line 62
    check-cast p2, Lik;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, Lbz0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lbz0;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lbz0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lbz0;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Lbz0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lzk;->d:Lzk;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-wide v7, p0, Lbz0;->k:J

    .line 17
    .line 18
    iget v0, p0, Lbz0;->i:I

    .line 19
    .line 20
    const-wide/16 v9, 0x8

    .line 21
    .line 22
    const/4 v11, 0x2

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v5, :cond_1

    .line 26
    .line 27
    if-ne v0, v11, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v6

    .line 37
    goto :goto_3

    .line 38
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sub-long v12, v7, v9

    .line 46
    .line 47
    iput v5, p0, Lbz0;->i:I

    .line 48
    .line 49
    invoke-static {v12, v13, p0}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v4, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_0
    iput v11, p0, Lbz0;->i:I

    .line 57
    .line 58
    invoke-static {v9, v10, p0}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v4, :cond_4

    .line 63
    .line 64
    :goto_1
    move-object v1, v4

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_2
    check-cast v2, Lr51;

    .line 67
    .line 68
    iget-object p0, v2, Lr51;->f:Lwc;

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    new-instance p1, Lkr0;

    .line 73
    .line 74
    invoke-direct {p1, v7, v8}, Lkr0;-><init>(J)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lbv0;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Lbv0;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lwc;->i(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_3
    return-object v1

    .line 86
    :pswitch_0
    iget v0, p0, Lbz0;->i:I

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    if-ne v0, v5, :cond_6

    .line 91
    .line 92
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    move-object p1, v6

    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-wide v0, p0, Lbz0;->k:J

    .line 105
    .line 106
    check-cast v2, Ldz0;

    .line 107
    .line 108
    iget-object p1, v2, Ldz0;->Q:Llz0;

    .line 109
    .line 110
    iput v5, p0, Lbz0;->i:I

    .line 111
    .line 112
    invoke-static {p1, v0, v1, p0}, Lwy0;->a(Llz0;JLjk;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v4, :cond_8

    .line 117
    .line 118
    move-object p1, v4

    .line 119
    :cond_8
    :goto_4
    return-object p1

    .line 120
    :pswitch_1
    iget v0, p0, Lbz0;->i:I

    .line 121
    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    if-ne v0, v5, :cond_9

    .line 125
    .line 126
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_9
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    move-object v1, v6

    .line 134
    goto :goto_5

    .line 135
    :cond_a
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    check-cast v2, Ldz0;

    .line 139
    .line 140
    iget-object p1, v2, Ldz0;->Q:Llz0;

    .line 141
    .line 142
    iget-wide v2, p0, Lbz0;->k:J

    .line 143
    .line 144
    iput v5, p0, Lbz0;->i:I

    .line 145
    .line 146
    invoke-virtual {p1, v2, v3, v5, p0}, Llz0;->b(JZLm51;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-ne p0, v4, :cond_b

    .line 151
    .line 152
    move-object v1, v4

    .line 153
    :cond_b
    :goto_5
    return-object v1

    .line 154
    :pswitch_2
    iget v0, p0, Lbz0;->i:I

    .line 155
    .line 156
    if-eqz v0, :cond_d

    .line 157
    .line 158
    if-ne v0, v5, :cond_c

    .line 159
    .line 160
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_c
    invoke-static {v3}, Lxc;->o(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object v1, v6

    .line 168
    goto :goto_6

    .line 169
    :cond_d
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    check-cast v2, Ldz0;

    .line 173
    .line 174
    iget-object p1, v2, Ldz0;->Q:Llz0;

    .line 175
    .line 176
    new-instance v0, Laz0;

    .line 177
    .line 178
    iget-wide v2, p0, Lbz0;->k:J

    .line 179
    .line 180
    invoke-direct {v0, v2, v3, v6}, Laz0;-><init>(JLik;)V

    .line 181
    .line 182
    .line 183
    iput v5, p0, Lbz0;->i:I

    .line 184
    .line 185
    sget-object v2, Lvh0;->e:Lvh0;

    .line 186
    .line 187
    invoke-virtual {p1, v2, v0, p0}, Llz0;->f(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-ne p0, v4, :cond_e

    .line 192
    .line 193
    move-object v1, v4

    .line 194
    :cond_e
    :goto_6
    return-object v1

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
