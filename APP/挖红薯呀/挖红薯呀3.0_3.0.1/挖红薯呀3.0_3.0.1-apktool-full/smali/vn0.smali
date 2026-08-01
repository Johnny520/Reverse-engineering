.class public final Lvn0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lkm;


# direct methods
.method public synthetic constructor <init>(Lkm;Lik;I)V
    .locals 0

    .line 1
    iput p3, p0, Lvn0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lvn0;->j:Lkm;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 1

    .line 1
    iget p1, p0, Lvn0;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Lvn0;->j:Lkm;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lvn0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, Lvn0;-><init>(Lkm;Lik;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lvn0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, Lvn0;-><init>(Lkm;Lik;I)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, Lvn0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, Lvn0;-><init>(Lkm;Lik;I)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lvn0;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    check-cast p1, Lyk;

    .line 6
    .line 7
    check-cast p2, Lik;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lvn0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lvn0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lvn0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lvn0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lvn0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lvn0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lvn0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lvn0;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lvn0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lvn0;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lvn0;->j:Lkm;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lzk;->d:Lzk;

    .line 8
    .line 9
    sget-object v4, Lna1;->a:Lna1;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lvn0;->i:I

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-ne v0, v6, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    move-object v3, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v3, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput v6, p0, Lvn0;->i:I

    .line 36
    .line 37
    new-instance p1, Ln6;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p1, v0, v5, v6}, Ln6;-><init>(ILik;I)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lvh0;->d:Lvh0;

    .line 44
    .line 45
    invoke-static {v1, v0, p1, p0}, Llo0;->t(Llo0;Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v3, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move-object p0, v4

    .line 53
    :goto_0
    if-ne p0, v3, :cond_0

    .line 54
    .line 55
    :goto_1
    return-object v3

    .line 56
    :pswitch_0
    iget v0, p0, Lvn0;->i:I

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    if-ne v0, v6, :cond_5

    .line 61
    .line 62
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_4
    move-object v3, v4

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v3, v5

    .line 71
    goto :goto_3

    .line 72
    :cond_6
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v1, Llo0;->d:Lco0;

    .line 76
    .line 77
    iput v6, p0, Lvn0;->i:I

    .line 78
    .line 79
    sget-object v0, Loo0;->a:Lno0;

    .line 80
    .line 81
    iget-object v0, p1, Lco0;->b:Ldp0;

    .line 82
    .line 83
    invoke-virtual {v0}, Ldp0;->g()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v0, v6

    .line 88
    invoke-virtual {v1}, Lkm;->n()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-ge v0, v2, :cond_7

    .line 93
    .line 94
    iget-object p1, p1, Lco0;->b:Ldp0;

    .line 95
    .line 96
    invoke-virtual {p1}, Ldp0;->g()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    add-int/2addr p1, v6

    .line 101
    invoke-static {v1, p1, p0}, Llo0;->g(Llo0;ILm51;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v3, :cond_7

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    move-object p0, v4

    .line 109
    :goto_2
    if-ne p0, v3, :cond_4

    .line 110
    .line 111
    :goto_3
    return-object v3

    .line 112
    :pswitch_1
    iget v0, p0, Lvn0;->i:I

    .line 113
    .line 114
    if-eqz v0, :cond_a

    .line 115
    .line 116
    if-ne v0, v6, :cond_9

    .line 117
    .line 118
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_8
    move-object v3, v4

    .line 122
    goto :goto_5

    .line 123
    :cond_9
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v3, v5

    .line 127
    goto :goto_5

    .line 128
    :cond_a
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, v1, Llo0;->d:Lco0;

    .line 132
    .line 133
    iput v6, p0, Lvn0;->i:I

    .line 134
    .line 135
    sget-object v0, Loo0;->a:Lno0;

    .line 136
    .line 137
    iget-object v0, p1, Lco0;->b:Ldp0;

    .line 138
    .line 139
    invoke-virtual {v0}, Ldp0;->g()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sub-int/2addr v0, v6

    .line 144
    if-ltz v0, :cond_b

    .line 145
    .line 146
    iget-object p1, p1, Lco0;->b:Ldp0;

    .line 147
    .line 148
    invoke-virtual {p1}, Ldp0;->g()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    sub-int/2addr p1, v6

    .line 153
    invoke-static {v1, p1, p0}, Llo0;->g(Llo0;ILm51;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, v3, :cond_b

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_b
    move-object p0, v4

    .line 161
    :goto_4
    if-ne p0, v3, :cond_8

    .line 162
    .line 163
    :goto_5
    return-object v3

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
