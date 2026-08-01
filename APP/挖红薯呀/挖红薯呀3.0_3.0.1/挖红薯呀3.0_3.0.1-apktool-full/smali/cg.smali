.class public final Lcg;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILik;)V
    .locals 1

    .line 13
    const/4 v0, 0x5

    iput v0, p0, Lcg;->h:I

    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public constructor <init>(Lc90;ILik;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lcg;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lcg;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lcg;->i:I

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lik;I)V
    .locals 0

    .line 14
    iput p3, p0, Lcg;->h:I

    iput-object p1, p0, Lcg;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 2

    .line 1
    iget v0, p0, Lcg;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p1, Lcg;

    .line 8
    .line 9
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Li81;

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, Lcg;

    .line 20
    .line 21
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lhs0;

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    new-instance p1, Lcg;

    .line 32
    .line 33
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ls51;

    .line 36
    .line 37
    const/4 v0, 0x7

    .line 38
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    new-instance p1, Lcg;

    .line 43
    .line 44
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lfn;

    .line 47
    .line 48
    const/4 v0, 0x6

    .line 49
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_3
    new-instance p0, Lcg;

    .line 54
    .line 55
    invoke-direct {p0, v1, p2}, Lcg;-><init>(ILik;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcg;->j:Ljava/lang/Object;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_4
    new-instance p1, Lcg;

    .line 62
    .line 63
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lc90;

    .line 66
    .line 67
    iget p0, p0, Lcg;->i:I

    .line 68
    .line 69
    invoke-direct {p1, v0, p0, p2}, Lcg;-><init>(Lc90;ILik;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_5
    new-instance p1, Lcg;

    .line 74
    .line 75
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ld;

    .line 78
    .line 79
    const/4 v0, 0x3

    .line 80
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_6
    new-instance p1, Lcg;

    .line 85
    .line 86
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Lgv;

    .line 89
    .line 90
    invoke-direct {p1, p0, p2, v1}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :pswitch_7
    new-instance p1, Lcg;

    .line 95
    .line 96
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lql;

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_8
    new-instance p1, Lcg;

    .line 106
    .line 107
    iget-object p0, p0, Lcg;->j:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, Ldg;

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {p1, p0, p2, v0}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcg;->h:I

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
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcg;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcg;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcg;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, Lyk;

    .line 54
    .line 55
    check-cast p2, Lik;

    .line 56
    .line 57
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lcg;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_3
    check-cast p1, Lyk;

    .line 69
    .line 70
    check-cast p2, Lik;

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Lcg;

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_4
    check-cast p1, Lny0;

    .line 84
    .line 85
    check-cast p2, Lik;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lcg;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_5
    check-cast p1, Lyk;

    .line 98
    .line 99
    check-cast p2, Lik;

    .line 100
    .line 101
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lcg;

    .line 106
    .line 107
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_6
    check-cast p1, Lyk;

    .line 113
    .line 114
    check-cast p2, Lik;

    .line 115
    .line 116
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Lcg;

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_7
    check-cast p1, Lyk;

    .line 128
    .line 129
    check-cast p2, Lik;

    .line 130
    .line 131
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lcg;

    .line 136
    .line 137
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_8
    check-cast p1, Lyk;

    .line 143
    .line 144
    check-cast p2, Lik;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, Lcg;->g(Ljava/lang/Object;Lik;)Lik;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lcg;

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lcg;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lcg;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v6, Lna1;->a:Lna1;

    .line 5
    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v7, Lzk;->d:Lzk;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Li81;

    .line 18
    .line 19
    iget v8, p0, Lcg;->i:I

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v3, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v6, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lxt0;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, Li81;->r:Lg30;

    .line 43
    .line 44
    invoke-interface {v4}, Lg30;->a()Lhu;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v8, Luo;

    .line 49
    .line 50
    const/4 v9, 0x4

    .line 51
    invoke-direct {v8, v9, v2, v0, v1}, Luo;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 52
    .line 53
    .line 54
    iput v3, p0, Lcg;->i:I

    .line 55
    .line 56
    invoke-interface {v4, v8, p0}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v7, :cond_2

    .line 61
    .line 62
    move-object v6, v7

    .line 63
    :cond_2
    :goto_0
    return-object v6

    .line 64
    :pswitch_0
    iget v0, p0, Lcg;->i:I

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v3, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object v6, v4

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lhs0;

    .line 85
    .line 86
    iput v3, p0, Lcg;->i:I

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Lhs0;->d(Ljk;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v7, :cond_5

    .line 93
    .line 94
    move-object v6, v7

    .line 95
    :cond_5
    :goto_1
    return-object v6

    .line 96
    :pswitch_1
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ls51;

    .line 99
    .line 100
    iget v1, p0, Lcg;->i:I

    .line 101
    .line 102
    const/4 v8, 0x2

    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    if-eq v1, v3, :cond_6

    .line 106
    .line 107
    if-ne v1, v8, :cond_7

    .line 108
    .line 109
    :cond_6
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v6, v4

    .line 117
    goto :goto_2

    .line 118
    :cond_8
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, Ls51;->t:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 122
    .line 123
    iput v8, p0, Lcg;->i:I

    .line 124
    .line 125
    invoke-interface {v1, v0, p0}, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;->invoke(Lrr0;Lik;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-ne v0, v7, :cond_9

    .line 130
    .line 131
    move-object v6, v7

    .line 132
    :cond_9
    :goto_2
    return-object v6

    .line 133
    :pswitch_2
    iget v0, p0, Lcg;->i:I

    .line 134
    .line 135
    if-eqz v0, :cond_b

    .line 136
    .line 137
    if-ne v0, v3, :cond_a

    .line 138
    .line 139
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object v0, p1

    .line 143
    goto :goto_3

    .line 144
    :cond_a
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v0, v4

    .line 148
    goto :goto_3

    .line 149
    :cond_b
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lfn;

    .line 155
    .line 156
    iget-object v0, v0, Lfn;->f:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lvb;

    .line 159
    .line 160
    iput v3, p0, Lcg;->i:I

    .line 161
    .line 162
    new-instance v1, Le;

    .line 163
    .line 164
    const/4 v2, 0x6

    .line 165
    invoke-direct {v1, v0, v4, v2}, Le;-><init>(Ljava/lang/Object;Lik;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1, p0}, Lp30;->w(Lww;Lik;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v7, :cond_c

    .line 173
    .line 174
    move-object v0, v7

    .line 175
    :cond_c
    :goto_3
    return-object v0

    .line 176
    :pswitch_3
    iget v0, p0, Lcg;->i:I

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    if-ne v0, v3, :cond_d

    .line 181
    .line 182
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lyk;

    .line 185
    .line 186
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_d
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object v6, v4

    .line 194
    goto :goto_5

    .line 195
    :cond_e
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lyk;

    .line 201
    .line 202
    :cond_f
    :goto_4
    invoke-interface {v0}, Lyk;->f()Lpk;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static {v1}, Lpf1;->D(Lpk;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_10

    .line 211
    .line 212
    new-instance v1, Lpn;

    .line 213
    .line 214
    const/16 v2, 0x1d

    .line 215
    .line 216
    invoke-direct {v1, v2}, Lpn;-><init>(I)V

    .line 217
    .line 218
    .line 219
    iput-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 220
    .line 221
    iput v3, p0, Lcg;->i:I

    .line 222
    .line 223
    invoke-interface {p0}, Lik;->e()Lpk;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v2}, Lv50;->l(Lpk;)Ls6;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v2, v1, p0}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-ne v1, v7, :cond_f

    .line 236
    .line 237
    move-object v6, v7

    .line 238
    :cond_10
    :goto_5
    return-object v6

    .line 239
    :pswitch_4
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lc90;

    .line 245
    .line 246
    iget v2, p0, Lcg;->i:I

    .line 247
    .line 248
    iget-object v3, v0, Lc90;->e:Lfe;

    .line 249
    .line 250
    iget-object v5, v3, Lfe;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v5, Ldp0;

    .line 253
    .line 254
    invoke-virtual {v5}, Ldp0;->g()I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-ne v5, v2, :cond_11

    .line 259
    .line 260
    iget-object v5, v3, Lfe;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v5, Ldp0;

    .line 263
    .line 264
    invoke-virtual {v5}, Ldp0;->g()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_12

    .line 269
    .line 270
    :cond_11
    iget-object v5, v0, Lc90;->n:Ll70;

    .line 271
    .line 272
    invoke-virtual {v5}, Ll70;->c()V

    .line 273
    .line 274
    .line 275
    iput-object v4, v5, Ll70;->b:Lu5;

    .line 276
    .line 277
    iget-object v5, v0, Lc90;->a:Ldm;

    .line 278
    .line 279
    :cond_12
    invoke-virtual {v3, v2, v1}, Lfe;->b(II)V

    .line 280
    .line 281
    .line 282
    iput-object v4, v3, Lfe;->d:Ljava/lang/Object;

    .line 283
    .line 284
    iget-object v0, v0, Lc90;->k:Lb60;

    .line 285
    .line 286
    if-eqz v0, :cond_13

    .line 287
    .line 288
    invoke-virtual {v0}, Lb60;->k()V

    .line 289
    .line 290
    .line 291
    :cond_13
    return-object v6

    .line 292
    :pswitch_5
    iget v0, p0, Lcg;->i:I

    .line 293
    .line 294
    if-eqz v0, :cond_15

    .line 295
    .line 296
    if-ne v0, v3, :cond_14

    .line 297
    .line 298
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_14
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    move-object v6, v4

    .line 306
    goto :goto_6

    .line 307
    :cond_15
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Ld;

    .line 313
    .line 314
    iget-object v0, v0, Ld;->f:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Lw7;

    .line 317
    .line 318
    new-instance v1, Ljava/lang/Float;

    .line 319
    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 322
    .line 323
    .line 324
    new-instance v4, Ljava/lang/Float;

    .line 325
    .line 326
    const/high16 v8, 0x3f000000    # 0.5f

    .line 327
    .line 328
    invoke-direct {v4, v8}, Ljava/lang/Float;-><init>(F)V

    .line 329
    .line 330
    .line 331
    const/high16 v8, 0x43c80000    # 400.0f

    .line 332
    .line 333
    invoke-static {v2, v8, v4, v3}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iput v3, p0, Lcg;->i:I

    .line 338
    .line 339
    new-instance v4, Lsx0;

    .line 340
    .line 341
    const/16 v3, 0x11

    .line 342
    .line 343
    invoke-direct {v4, v3}, Lsx0;-><init>(I)V

    .line 344
    .line 345
    .line 346
    const/4 v3, 0x1

    .line 347
    move-object v5, p0

    .line 348
    invoke-static/range {v0 .. v5}, Lz60;->h(Lw7;Ljava/lang/Float;Lv7;ZLsw;Ljk;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    if-ne v0, v7, :cond_16

    .line 353
    .line 354
    move-object v6, v7

    .line 355
    :cond_16
    :goto_6
    return-object v6

    .line 356
    :pswitch_6
    iget v0, p0, Lcg;->i:I

    .line 357
    .line 358
    if-eqz v0, :cond_18

    .line 359
    .line 360
    if-ne v0, v3, :cond_17

    .line 361
    .line 362
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_17
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    move-object v6, v4

    .line 370
    goto :goto_7

    .line 371
    :cond_18
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lgv;

    .line 377
    .line 378
    iput v3, p0, Lcg;->i:I

    .line 379
    .line 380
    invoke-static {v0, v4, p0}, Ls91;->n(Lrm;Lp9;Lm51;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    if-ne v0, v7, :cond_19

    .line 385
    .line 386
    move-object v6, v7

    .line 387
    :cond_19
    :goto_7
    return-object v6

    .line 388
    :pswitch_7
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 389
    .line 390
    move-object v12, v0

    .line 391
    check-cast v12, Lql;

    .line 392
    .line 393
    iget v0, p0, Lcg;->i:I

    .line 394
    .line 395
    if-eqz v0, :cond_1b

    .line 396
    .line 397
    if-ne v0, v3, :cond_1a

    .line 398
    .line 399
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_1a
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    move-object v6, v4

    .line 407
    goto :goto_8

    .line 408
    :cond_1b
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    new-instance v9, Lxt0;

    .line 412
    .line 413
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 414
    .line 415
    .line 416
    new-instance v10, Lxt0;

    .line 417
    .line 418
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 419
    .line 420
    .line 421
    new-instance v11, Lxt0;

    .line 422
    .line 423
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 424
    .line 425
    .line 426
    iget-object v0, v12, Lql;->r:Lg30;

    .line 427
    .line 428
    invoke-interface {v0}, Lg30;->a()Lhu;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    new-instance v8, Lsd;

    .line 433
    .line 434
    const/4 v13, 0x1

    .line 435
    invoke-direct/range {v8 .. v13}, Lsd;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 436
    .line 437
    .line 438
    iput v3, p0, Lcg;->i:I

    .line 439
    .line 440
    invoke-interface {v0, v8, p0}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    if-ne v0, v7, :cond_1c

    .line 445
    .line 446
    move-object v6, v7

    .line 447
    :cond_1c
    :goto_8
    return-object v6

    .line 448
    :pswitch_8
    iget-object v0, p0, Lcg;->j:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Ldg;

    .line 451
    .line 452
    iget v1, p0, Lcg;->i:I

    .line 453
    .line 454
    if-eqz v1, :cond_1e

    .line 455
    .line 456
    if-ne v1, v3, :cond_1d

    .line 457
    .line 458
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_1d
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    move-object v6, v4

    .line 466
    goto :goto_a

    .line 467
    :cond_1e
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    sget-object v1, Ldj;->s:Lg41;

    .line 471
    .line 472
    invoke-static {v0, v1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    check-cast v1, Lnc1;

    .line 477
    .line 478
    invoke-interface {v1}, Lnc1;->c()J

    .line 479
    .line 480
    .line 481
    move-result-wide v1

    .line 482
    iput v3, p0, Lcg;->i:I

    .line 483
    .line 484
    invoke-static {v1, v2, p0}, Ls91;->u(JLjk;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    if-ne v1, v7, :cond_1f

    .line 489
    .line 490
    move-object v6, v7

    .line 491
    goto :goto_a

    .line 492
    :cond_1f
    :goto_9
    iget-object v0, v0, Ldg;->O:Lhw;

    .line 493
    .line 494
    if-eqz v0, :cond_20

    .line 495
    .line 496
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    :cond_20
    :goto_a
    return-object v6

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
