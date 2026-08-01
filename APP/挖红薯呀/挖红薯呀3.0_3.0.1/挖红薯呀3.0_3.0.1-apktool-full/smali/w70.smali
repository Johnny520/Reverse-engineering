.class public final Lw70;
.super Lav0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public f:Lnr0;

.field public g:Lnr0;

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lkm;


# direct methods
.method public constructor <init>(Lkm;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw70;->j:Lkm;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lav0;-><init>(Lik;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 1

    .line 1
    new-instance v0, Lw70;

    .line 2
    .line 3
    iget-object p0, p0, Lw70;->j:Lkm;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lw70;-><init>(Lkm;Lik;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw70;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr51;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw70;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lw70;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lw70;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lw70;->j:Lkm;

    .line 2
    .line 3
    iget-object v0, v0, Llo0;->c:Lgp0;

    .line 4
    .line 5
    iget v1, p0, Lw70;->h:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Ljr0;->d:Ljr0;

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    sget-object v7, Lzk;->d:Lzk;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    if-eq v1, v6, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lw70;->g:Lnr0;

    .line 22
    .line 23
    iget-object v2, p0, Lw70;->f:Lnr0;

    .line 24
    .line 25
    iget-object v6, p0, Lw70;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lr51;

    .line 28
    .line 29
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    iget-object v1, p0, Lw70;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lr51;

    .line 42
    .line 43
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lw70;->i:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v1, p1

    .line 53
    check-cast v1, Lr51;

    .line 54
    .line 55
    iput-object v1, p0, Lw70;->i:Ljava/lang/Object;

    .line 56
    .line 57
    iput v6, p0, Lw70;->h:I

    .line 58
    .line 59
    invoke-static {v1, v5, v3, p0}, Lm61;->b(Lr51;ZLjr0;Ly9;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v7, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_0
    check-cast p1, Lnr0;

    .line 67
    .line 68
    new-instance v6, Lok0;

    .line 69
    .line 70
    const-wide/16 v8, 0x0

    .line 71
    .line 72
    invoke-direct {v6, v8, v9}, Lok0;-><init>(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v6}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v6, v1

    .line 79
    :goto_1
    if-nez v2, :cond_7

    .line 80
    .line 81
    iput-object v6, p0, Lw70;->i:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object p1, p0, Lw70;->f:Lnr0;

    .line 84
    .line 85
    iput-object v2, p0, Lw70;->g:Lnr0;

    .line 86
    .line 87
    iput v4, p0, Lw70;->h:I

    .line 88
    .line 89
    invoke-virtual {v6, v3, p0}, Lr51;->a(Ljr0;Ly9;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne v1, v7, :cond_4

    .line 94
    .line 95
    :goto_2
    return-object v7

    .line 96
    :cond_4
    move-object v12, v2

    .line 97
    move-object v2, p1

    .line 98
    move-object p1, v1

    .line 99
    move-object v1, v12

    .line 100
    :goto_3
    check-cast p1, Lir0;

    .line 101
    .line 102
    iget-object v8, p1, Lir0;->a:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    move v10, v5

    .line 109
    :goto_4
    if-ge v10, v9, :cond_6

    .line 110
    .line 111
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    check-cast v11, Lnr0;

    .line 116
    .line 117
    invoke-static {v11}, Lw60;->j(Lnr0;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-nez v11, :cond_5

    .line 122
    .line 123
    move-object p1, v2

    .line 124
    move-object v2, v1

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    iget-object p1, p1, Lir0;->a:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lnr0;

    .line 136
    .line 137
    move-object v12, v2

    .line 138
    move-object v2, p1

    .line 139
    move-object p1, v12

    .line 140
    goto :goto_1

    .line 141
    :cond_7
    iget-wide v1, v2, Lnr0;->c:J

    .line 142
    .line 143
    iget-wide p0, p1, Lnr0;->c:J

    .line 144
    .line 145
    invoke-static {v1, v2, p0, p1}, Lok0;->d(JJ)J

    .line 146
    .line 147
    .line 148
    move-result-wide p0

    .line 149
    new-instance v1, Lok0;

    .line 150
    .line 151
    invoke-direct {v1, p0, p1}, Lok0;-><init>(J)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object p0, Lna1;->a:Lna1;

    .line 158
    .line 159
    return-object p0
.end method
