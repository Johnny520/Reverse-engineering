.class public final Lqs0;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Lj61;
.implements Los1;


# instance fields
.field public A:I

.field public B:Lm13;

.field public C:Lm63;

.field public v:Lm13;

.field public w:I

.field public x:I

.field public y:Z

.field public z:I


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final E0()V
    .locals 6

    .line 1
    sget-object v0, Lly;->k:Ltu2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxl0;

    .line 8
    .line 9
    iget-object v1, p0, Lqs0;->v:Lm13;

    .line 10
    .line 11
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Lr61;->G:Ld61;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lqs0;->B:Lm13;

    .line 22
    .line 23
    invoke-virtual {p0}, Lqs0;->M0()Lm13;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lm13;->a:Llt2;

    .line 28
    .line 29
    iget-object v1, v1, Llt2;->f:Lmx2;

    .line 30
    .line 31
    invoke-virtual {p0}, Lqs0;->M0()Lm13;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v2, v2, Lm13;->a:Llt2;

    .line 36
    .line 37
    iget-object v2, v2, Llt2;->c:Lim0;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    sget-object v2, Lim0;->j:Lim0;

    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lqs0;->M0()Lm13;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v3, v3, Lm13;->a:Llt2;

    .line 48
    .line 49
    iget-object v3, v3, Llt2;->d:Lgm0;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    iget v3, v3, Lgm0;->a:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v3, v4

    .line 58
    :goto_0
    invoke-virtual {p0}, Lqs0;->M0()Lm13;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v5, v5, Lm13;->a:Llt2;

    .line 63
    .line 64
    iget-object v5, v5, Llt2;->e:Lhm0;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    iget v5, v5, Lhm0;->a:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const v5, 0xffff

    .line 72
    .line 73
    .line 74
    :goto_1
    check-cast v0, Lyl0;

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2, v3, v5}, Lyl0;->b(Lmx2;Lim0;II)Lm63;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lqs0;->C:Lm63;

    .line 81
    .line 82
    new-instance v0, Lps0;

    .line 83
    .line 84
    invoke-direct {v0, p0, v4}, Lps0;-><init>(Lqs0;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 92
    .line 93
    return-void
.end method

.method public final F0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lqs0;->B:Lm13;

    .line 3
    .line 4
    iput-object v0, p0, Lqs0;->C:Lm63;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 8
    .line 9
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqs0;->C:Lm63;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lps0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lps0;-><init>(Lqs0;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 16
    .line 17
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final M0()Lm13;
    .locals 0

    .line 1
    iget-object p0, p0, Lqs0;->B:Lm13;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Resolved style is not set."

    .line 7
    .line 8
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ls;->b()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 3
    .line 4
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lqs0;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lqs0;->M0()Lm13;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v3, Lly;->k:Ltu2;

    .line 12
    .line 13
    invoke-static {p0, v3}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lxl0;

    .line 18
    .line 19
    sget-object v4, Llz2;->a:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-static {v0, p1, v3, v4, v5}, Llz2;->a(Lm13;Le70;Lxl0;Ljava/lang/String;I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    const-wide v8, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v6, v8

    .line 32
    long-to-int v6, v6

    .line 33
    new-instance v7, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v10, 0xa

    .line 42
    .line 43
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v0, p1, v3, v4, v1}, Llz2;->a(Lm13;Le70;Lxl0;Ljava/lang/String;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    and-long/2addr v3, v8

    .line 58
    long-to-int v0, v3

    .line 59
    sub-int/2addr v0, v6

    .line 60
    iget v3, p0, Lqs0;->w:I

    .line 61
    .line 62
    if-ne v3, v5, :cond_0

    .line 63
    .line 64
    move v3, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sub-int/2addr v3, v5

    .line 67
    mul-int/2addr v3, v0

    .line 68
    add-int/2addr v3, v6

    .line 69
    :goto_0
    iput v3, p0, Lqs0;->z:I

    .line 70
    .line 71
    iget v3, p0, Lqs0;->x:I

    .line 72
    .line 73
    const v4, 0x7fffffff

    .line 74
    .line 75
    .line 76
    if-ne v3, v4, :cond_1

    .line 77
    .line 78
    move v3, v2

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    sub-int/2addr v3, v5

    .line 81
    mul-int/2addr v3, v0

    .line 82
    add-int/2addr v3, v6

    .line 83
    :goto_1
    iput v3, p0, Lqs0;->A:I

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 87
    .line 88
    :cond_2
    iget v0, p0, Lqs0;->z:I

    .line 89
    .line 90
    if-eq v0, v2, :cond_3

    .line 91
    .line 92
    invoke-static {p3, p4}, Lfz;->i(J)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-static {v0, v3, v4}, Lci0;->D(III)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    :goto_2
    move v7, v0

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-static {p3, p4}, Lfz;->i(J)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    goto :goto_2

    .line 111
    :goto_3
    iget p0, p0, Lqs0;->A:I

    .line 112
    .line 113
    if-eq p0, v2, :cond_4

    .line 114
    .line 115
    invoke-static {p3, p4}, Lfz;->i(J)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-static {p0, v0, v2}, Lci0;->D(III)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    :goto_4
    move v8, p0

    .line 128
    goto :goto_5

    .line 129
    :cond_4
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    goto :goto_4

    .line 134
    :goto_5
    const/4 v6, 0x0

    .line 135
    const/4 v9, 0x3

    .line 136
    const/4 v5, 0x0

    .line 137
    move-wide v3, p3

    .line 138
    invoke-static/range {v3 .. v9}, Lfz;->a(JIIIII)J

    .line 139
    .line 140
    .line 141
    move-result-wide p3

    .line 142
    invoke-interface {p2, p3, p4}, Lif1;->e(J)Lsz1;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    iget p2, p0, Lsz1;->h:I

    .line 147
    .line 148
    iget p3, p0, Lsz1;->i:I

    .line 149
    .line 150
    new-instance p4, Lpg;

    .line 151
    .line 152
    invoke-direct {p4, p0, v1}, Lpg;-><init>(Lsz1;I)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lce0;->h:Lce0;

    .line 156
    .line 157
    invoke-interface {p1, p2, p3, p0, p4}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0
.end method

.method public final w0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqs0;->v:Lm13;

    .line 2
    .line 3
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lr61;->G:Ld61;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lqs0;->B:Lm13;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lqs0;->y:Z

    .line 17
    .line 18
    invoke-static {p0}, Lgf1;->A(Lj61;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
