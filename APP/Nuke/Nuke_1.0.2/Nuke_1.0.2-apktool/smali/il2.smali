.class public final Lil2;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;
.implements Lon2;


# instance fields
.field public v:Lnl2;

.field public w:Z


# virtual methods
.method public final D(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lil2;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const p3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p2, p3}, Lif1;->X(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final U(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lil2;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p3, 0x7fffffff

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p2, p3}, Lif1;->N(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lil2;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lqv1;->h:Lqv1;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lqv1;->i:Lqv1;

    .line 9
    .line 10
    :goto_0
    invoke-static {p3, p4, v0}, Lte;->p(JLqv1;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lil2;->w:Z

    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v7, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-static {p3, p4}, Lfz;->g(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    move v7, v0

    .line 27
    :goto_1
    iget-boolean v0, p0, Lil2;->w:Z

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-static {p3, p4}, Lfz;->h(J)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :cond_2
    move v5, v1

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v8, 0x5

    .line 38
    const/4 v4, 0x0

    .line 39
    move-wide v2, p3

    .line 40
    invoke-static/range {v2 .. v8}, Lfz;->a(JIIIII)J

    .line 41
    .line 42
    .line 43
    move-result-wide p3

    .line 44
    invoke-interface {p2, p3, p4}, Lif1;->e(J)Lsz1;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget p3, p2, Lsz1;->h:I

    .line 49
    .line 50
    invoke-static {v2, v3}, Lfz;->h(J)I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-le p3, p4, :cond_3

    .line 55
    .line 56
    move p3, p4

    .line 57
    :cond_3
    iget p4, p2, Lsz1;->i:I

    .line 58
    .line 59
    invoke-static {v2, v3}, Lfz;->g(J)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-le p4, v0, :cond_4

    .line 64
    .line 65
    move p4, v0

    .line 66
    :cond_4
    iget v0, p2, Lsz1;->i:I

    .line 67
    .line 68
    sub-int/2addr v0, p4

    .line 69
    iget v1, p2, Lsz1;->h:I

    .line 70
    .line 71
    sub-int/2addr v1, p3

    .line 72
    iget-boolean v2, p0, Lil2;->w:Z

    .line 73
    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move v0, v1

    .line 78
    :goto_2
    iget-object v1, p0, Lil2;->v:Lnl2;

    .line 79
    .line 80
    iget-object v2, v1, Lnl2;->e:Lkx1;

    .line 81
    .line 82
    iget-object v1, v1, Lnl2;->a:Lkx1;

    .line 83
    .line 84
    invoke-virtual {v2, v0}, Lkx1;->h(I)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ltl;->B()Lvr2;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    invoke-virtual {v2}, Lvr2;->e()Lin0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    goto :goto_3

    .line 98
    :cond_6
    const/4 v3, 0x0

    .line 99
    :goto_3
    invoke-static {v2}, Ltl;->K(Lvr2;)Lvr2;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    :try_start_0
    invoke-virtual {v1}, Lkx1;->g()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-le v5, v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lkx1;->h(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    goto :goto_7

    .line 116
    :cond_7
    :goto_4
    invoke-static {v2, v4, v3}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, Lil2;->v:Lnl2;

    .line 120
    .line 121
    iget-boolean v2, p0, Lil2;->w:Z

    .line 122
    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    move v2, p4

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move v2, p3

    .line 128
    :goto_5
    iget-object v1, v1, Lnl2;->b:Lkx1;

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Lkx1;->h(I)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lil2;->v:Lnl2;

    .line 134
    .line 135
    iget-boolean v2, p0, Lil2;->w:Z

    .line 136
    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    iget v2, p2, Lsz1;->i:I

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_9
    iget v2, p2, Lsz1;->h:I

    .line 143
    .line 144
    :goto_6
    iget-object v1, v1, Lnl2;->c:Lkx1;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lkx1;->h(I)V

    .line 147
    .line 148
    .line 149
    new-instance v1, La62;

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    invoke-direct {v1, v0, v2, p0, p2}, La62;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lce0;->h:Lce0;

    .line 156
    .line 157
    invoke-interface {p1, p3, p4, p0, v1}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :goto_7
    invoke-static {v2, v4, v3}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 163
    .line 164
    .line 165
    throw p0
.end method

.method public final g(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lil2;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p3, 0x7fffffff

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p2, p3}, Lif1;->W(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 5

    .line 1
    sget-object v0, Lxn2;->a:[Lv41;

    .line 2
    .line 3
    sget-object v0, Lvn2;->n:Lyn2;

    .line 4
    .line 5
    sget-object v1, Lxn2;->a:[Lv41;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    aget-object v2, v1, v2

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-interface {p1, v0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lel2;

    .line 16
    .line 17
    new-instance v2, Lhl2;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v2, p0, v3}, Lhl2;-><init>(Lil2;I)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lhl2;

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-direct {v3, p0, v4}, Lhl2;-><init>(Lil2;I)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v2, v3}, Lel2;-><init>(Lxm0;Lxm0;)V

    .line 30
    .line 31
    .line 32
    iget-boolean p0, p0, Lil2;->w:Z

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    sget-object p0, Lvn2;->w:Lyn2;

    .line 37
    .line 38
    const/16 v2, 0xd

    .line 39
    .line 40
    aget-object v1, v1, v2

    .line 41
    .line 42
    invoke-interface {p1, p0, v0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    sget-object p0, Lvn2;->v:Lyn2;

    .line 47
    .line 48
    const/16 v2, 0xc

    .line 49
    .line 50
    aget-object v1, v1, v2

    .line 51
    .line 52
    invoke-interface {p1, p0, v0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final p(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lil2;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const p3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {p2, p3}, Lif1;->f(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
