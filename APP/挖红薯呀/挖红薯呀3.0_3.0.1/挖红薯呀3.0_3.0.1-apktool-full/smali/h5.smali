.class public final Lh5;
.super Lav0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lj5;


# direct methods
.method public constructor <init>(Lj5;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh5;->h:Lj5;

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
    new-instance v0, Lh5;

    .line 2
    .line 3
    iget-object p0, p0, Lh5;->h:Lj5;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lh5;-><init>(Lj5;Lik;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lh5;->g:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lh5;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lh5;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lh5;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lh5;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lh5;->h:Lj5;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lzk;->d:Lzk;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v4, :cond_1

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lh5;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lr51;

    .line 19
    .line 20
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_1
    iget-object v0, p0, Lh5;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lr51;

    .line 33
    .line 34
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lh5;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v0, p1

    .line 44
    check-cast v0, Lr51;

    .line 45
    .line 46
    iput-object v0, p0, Lh5;->g:Ljava/lang/Object;

    .line 47
    .line 48
    iput v4, p0, Lh5;->f:I

    .line 49
    .line 50
    invoke-static {v0, p0, v1}, Lm61;->c(Lr51;Lav0;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v5, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    check-cast p1, Lnr0;

    .line 58
    .line 59
    iget-wide v6, p1, Lnr0;->a:J

    .line 60
    .line 61
    iput-wide v6, v3, Lj5;->h:J

    .line 62
    .line 63
    iget-wide v6, p1, Lnr0;->c:J

    .line 64
    .line 65
    iput-wide v6, v3, Lj5;->b:J

    .line 66
    .line 67
    :cond_4
    iput-object v0, p0, Lh5;->g:Ljava/lang/Object;

    .line 68
    .line 69
    iput v1, p0, Lh5;->f:I

    .line 70
    .line 71
    sget-object p1, Ljr0;->e:Ljr0;

    .line 72
    .line 73
    invoke-virtual {v0, p1, p0}, Lr51;->a(Ljr0;Ly9;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v5, :cond_5

    .line 78
    .line 79
    :goto_1
    return-object v5

    .line 80
    :cond_5
    :goto_2
    check-cast p1, Lir0;

    .line 81
    .line 82
    iget-object p1, p1, Lir0;->a:Ljava/util/List;

    .line 83
    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    const/4 v7, 0x0

    .line 98
    move v8, v7

    .line 99
    :goto_3
    if-ge v8, v6, :cond_7

    .line 100
    .line 101
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    move-object v10, v9

    .line 106
    check-cast v10, Lnr0;

    .line 107
    .line 108
    iget-boolean v10, v10, Lnr0;->d:Z

    .line 109
    .line 110
    if-eqz v10, :cond_6

    .line 111
    .line 112
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    :goto_4
    if-ge v7, p1, :cond_9

    .line 123
    .line 124
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    move-object v8, v6

    .line 129
    check-cast v8, Lnr0;

    .line 130
    .line 131
    iget-wide v8, v8, Lnr0;->a:J

    .line 132
    .line 133
    iget-wide v10, v3, Lj5;->h:J

    .line 134
    .line 135
    invoke-static {v8, v9, v10, v11}, Lz60;->s(JJ)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_8

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    move-object v6, v2

    .line 146
    :goto_5
    check-cast v6, Lnr0;

    .line 147
    .line 148
    if-nez v6, :cond_a

    .line 149
    .line 150
    invoke-static {v4}, Lye;->K(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    move-object v6, p1

    .line 155
    check-cast v6, Lnr0;

    .line 156
    .line 157
    :cond_a
    if-eqz v6, :cond_b

    .line 158
    .line 159
    iget-wide v7, v6, Lnr0;->a:J

    .line 160
    .line 161
    iput-wide v7, v3, Lj5;->h:J

    .line 162
    .line 163
    iget-wide v6, v6, Lnr0;->c:J

    .line 164
    .line 165
    iput-wide v6, v3, Lj5;->b:J

    .line 166
    .line 167
    :cond_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_4

    .line 172
    .line 173
    const-wide/16 p0, -0x1

    .line 174
    .line 175
    iput-wide p0, v3, Lj5;->h:J

    .line 176
    .line 177
    sget-object p0, Lna1;->a:Lna1;

    .line 178
    .line 179
    return-object p0
.end method
