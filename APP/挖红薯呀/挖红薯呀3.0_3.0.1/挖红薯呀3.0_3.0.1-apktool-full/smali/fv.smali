.class public final synthetic Lfv;
.super Lhx;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcv;

    .line 2
    .line 3
    check-cast p2, Lcv;

    .line 4
    .line 5
    iget-object p0, p0, Lqc;->receiver:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lgv;

    .line 8
    .line 9
    iget-boolean v0, p0, Loe0;->q:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Lcv;->a()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1}, Lcv;->a()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lgv;->u:Lf;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lf;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 p1, 0x0

    .line 39
    if-eqz p2, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lcg;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v1, p0, p1, v2}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x3

    .line 52
    invoke-static {v0, p1, v1, v2}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lzt0;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lc7;

    .line 61
    .line 62
    invoke-direct {v1, v2, v0, p0}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v1}, Lr60;->v(Loe0;Lhw;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Lzt0;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ly70;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, Ly70;->a()Ly70;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move-object v0, p1

    .line 79
    :goto_0
    iput-object v0, p0, Lgv;->w:Ly70;

    .line 80
    .line 81
    iget-object v0, p0, Lgv;->x:Lqj0;

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0}, Lqj0;->G0()Loe0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v0, v0, Loe0;->q:Z

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0}, Lgv;->A0()V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    iget-object v0, p0, Lgv;->w:Ly70;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0}, Ly70;->b()V

    .line 102
    .line 103
    .line 104
    :cond_5
    iput-object p1, p0, Lgv;->w:Ly70;

    .line 105
    .line 106
    invoke-virtual {p0}, Lgv;->A0()V

    .line 107
    .line 108
    .line 109
    :cond_6
    :goto_1
    invoke-static {p0}, Lz60;->D(Lvz0;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lgv;->t:Lxg0;

    .line 113
    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    iget-object v1, p0, Lgv;->v:Lru;

    .line 117
    .line 118
    if-eqz p2, :cond_8

    .line 119
    .line 120
    if-eqz v1, :cond_7

    .line 121
    .line 122
    new-instance p2, Lsu;

    .line 123
    .line 124
    invoke-direct {p2, v1}, Lsu;-><init>(Lru;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0, p2}, Lgv;->z0(Lxg0;Lf30;)V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Lgv;->v:Lru;

    .line 131
    .line 132
    :cond_7
    new-instance p1, Lru;

    .line 133
    .line 134
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0, p1}, Lgv;->z0(Lxg0;Lf30;)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lgv;->v:Lru;

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_8
    if-eqz v1, :cond_9

    .line 144
    .line 145
    new-instance p2, Lsu;

    .line 146
    .line 147
    invoke-direct {p2, v1}, Lsu;-><init>(Lru;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v0, p2}, Lgv;->z0(Lxg0;Lf30;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lgv;->v:Lru;

    .line 154
    .line 155
    :cond_9
    :goto_2
    sget-object p0, Lna1;->a:Lna1;

    .line 156
    .line 157
    return-object p0
.end method
