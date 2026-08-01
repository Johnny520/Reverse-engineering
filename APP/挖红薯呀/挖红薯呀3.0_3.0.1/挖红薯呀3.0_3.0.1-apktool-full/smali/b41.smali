.class public final Lb41;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic h:I

.field public i:F

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb91;Lik;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb41;->h:I

    .line 15
    iput-object p1, p0, Lb41;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lm51;-><init>(ILik;)V

    return-void
.end method

.method public constructor <init>(Lfe;FLv7;Lik;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lb41;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lb41;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lb41;->i:F

    .line 7
    .line 8
    iput-object p3, p0, Lb41;->l:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Lm51;-><init>(ILik;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 2

    .line 1
    iget v0, p0, Lb41;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lb41;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lb41;

    .line 9
    .line 10
    check-cast v1, Lb91;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, Lb41;-><init>(Lb91;Lik;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lb41;->k:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p1, Lb41;

    .line 19
    .line 20
    iget-object v0, p0, Lb41;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lfe;

    .line 23
    .line 24
    iget p0, p0, Lb41;->i:F

    .line 25
    .line 26
    check-cast v1, Lv7;

    .line 27
    .line 28
    invoke-direct {p1, v0, p0, v1, p2}, Lb41;-><init>(Lfe;FLv7;Lik;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb41;->h:I

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
    invoke-virtual {p0, p1, p2}, Lb41;->g(Ljava/lang/Object;Lik;)Lik;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lb41;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lb41;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lb41;->g(Ljava/lang/Object;Lik;)Lik;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lb41;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lb41;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lb41;->h:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Lb41;->l:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lzk;->d:Lzk;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lb41;->j:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v6, :cond_0

    .line 21
    .line 22
    iget v0, p0, Lb41;->i:F

    .line 23
    .line 24
    iget-object v3, p0, Lb41;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lyk;

    .line 27
    .line 28
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lb41;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lyk;

    .line 43
    .line 44
    invoke-interface {p1}, Lyk;->f()Lpk;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lz60;->x(Lpk;)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    move-object v3, p1

    .line 53
    :cond_2
    :goto_0
    invoke-static {v3}, Lp30;->K(Lyk;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    move-object p1, v2

    .line 60
    check-cast p1, Lb91;

    .line 61
    .line 62
    new-instance v4, Lz81;

    .line 63
    .line 64
    invoke-direct {v4, p1, v0}, Lz81;-><init>(Lb91;F)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, Lb41;->k:Ljava/lang/Object;

    .line 68
    .line 69
    iput v0, p0, Lb41;->i:F

    .line 70
    .line 71
    iput v6, p0, Lb41;->j:I

    .line 72
    .line 73
    invoke-interface {p0}, Lik;->e()Lpk;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lv50;->l(Lpk;)Ls6;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, v4, p0}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v5, :cond_2

    .line 86
    .line 87
    move-object v1, v5

    .line 88
    :cond_3
    :goto_1
    return-object v1

    .line 89
    :pswitch_0
    iget v0, p0, Lb41;->j:I

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    if-ne v0, v6, :cond_4

    .line 94
    .line 95
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v3

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lb41;->k:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Lfe;

    .line 110
    .line 111
    iget-object p1, p1, Lfe;->c:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v7, p1

    .line 114
    check-cast v7, Lb7;

    .line 115
    .line 116
    iget p1, p0, Lb41;->i:F

    .line 117
    .line 118
    new-instance v8, Ljava/lang/Float;

    .line 119
    .line 120
    invoke-direct {v8, p1}, Ljava/lang/Float;-><init>(F)V

    .line 121
    .line 122
    .line 123
    move-object v9, v2

    .line 124
    check-cast v9, Lv7;

    .line 125
    .line 126
    iput v6, p0, Lb41;->j:I

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    const/16 v12, 0xc

    .line 130
    .line 131
    move-object v11, p0

    .line 132
    invoke-static/range {v7 .. v12}, Lb7;->c(Lb7;Ljava/lang/Object;Lv7;Lsw;Lm51;I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v5, :cond_6

    .line 137
    .line 138
    move-object v1, v5

    .line 139
    :cond_6
    :goto_2
    return-object v1

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
