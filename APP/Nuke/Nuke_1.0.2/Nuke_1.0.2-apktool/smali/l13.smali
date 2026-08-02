.class public final Ll13;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lj61;
.implements Lmc0;
.implements Lon2;


# instance fields
.field public A:I

.field public B:I

.field public C:Ljava/util/HashMap;

.field public D:Luw1;

.field public E:Lj13;

.field public F:Lk13;

.field public v:Ljava/lang/String;

.field public w:Lm13;

.field public x:Lxl0;

.field public y:I

.field public z:Z


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final D(Lkd1;Lif1;I)I
    .locals 1

    .line 1
    iget-object p2, p0, Ll13;->F:Lk13;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p2, Lk13;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lk13;->d:Luw1;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Luw1;->d(Le70;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p3, p0}, Luw1;->a(ILd61;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final M0()Luw1;
    .locals 8

    .line 1
    iget-object v2, p0, Ll13;->w:Lm13;

    .line 2
    .line 3
    iget-object v0, p0, Ll13;->D:Luw1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Luw1;

    .line 8
    .line 9
    iget-object v1, p0, Ll13;->v:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Ll13;->x:Lxl0;

    .line 12
    .line 13
    iget v4, p0, Ll13;->y:I

    .line 14
    .line 15
    iget-boolean v5, p0, Ll13;->z:Z

    .line 16
    .line 17
    iget v6, p0, Ll13;->A:I

    .line 18
    .line 19
    iget v7, p0, Ll13;->B:I

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Luw1;-><init>(Ljava/lang/String;Lm13;Lxl0;IZII)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll13;->D:Luw1;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Ll13;->D:Luw1;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final P(Lt61;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lth1;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ll13;->F:Lk13;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Lk13;->c:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, Lk13;->d:Luw1;

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_3
    iget-object v1, v0, Luw1;->j:Lt9;

    .line 28
    .line 29
    if-eqz v1, :cond_d

    .line 30
    .line 31
    iget-object p1, p1, Lt61;->h:Lsp;

    .line 32
    .line 33
    iget-object p1, p1, Lsp;->i:Lb5;

    .line 34
    .line 35
    invoke-virtual {p1}, Lb5;->q()Lqp;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-boolean p1, v0, Luw1;->k:Z

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-wide v3, v0, Luw1;->l:J

    .line 44
    .line 45
    const/16 v0, 0x20

    .line 46
    .line 47
    shr-long v5, v3, v0

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    int-to-float v5, v0

    .line 51
    const-wide v6, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    and-long/2addr v3, v6

    .line 57
    long-to-int v0, v3

    .line 58
    int-to-float v6, v0

    .line 59
    invoke-interface {v2}, Lqp;->l()V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-interface/range {v2 .. v7}, Lqp;->f(FFFFI)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :try_start_0
    iget-object p0, p0, Ll13;->w:Lm13;

    .line 69
    .line 70
    iget-object v0, p0, Lm13;->a:Llt2;

    .line 71
    .line 72
    iget-object v3, v0, Llt2;->m:Lgz2;

    .line 73
    .line 74
    if-nez v3, :cond_5

    .line 75
    .line 76
    sget-object v3, Lgz2;->b:Lgz2;

    .line 77
    .line 78
    :cond_5
    move-object v6, v3

    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    goto :goto_5

    .line 83
    :goto_1
    iget-object v3, v0, Llt2;->n:Lbq2;

    .line 84
    .line 85
    if-nez v3, :cond_6

    .line 86
    .line 87
    sget-object v3, Lbq2;->d:Lbq2;

    .line 88
    .line 89
    :cond_6
    move-object v5, v3

    .line 90
    iget-object v3, v0, Llt2;->o:Lop0;

    .line 91
    .line 92
    if-nez v3, :cond_7

    .line 93
    .line 94
    sget-object v3, Lxi0;->h:Lxi0;

    .line 95
    .line 96
    :cond_7
    move-object v7, v3

    .line 97
    iget-object v0, v0, Llt2;->a:Ll03;

    .line 98
    .line 99
    invoke-interface {v0}, Ll03;->k()Lan;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-eqz v3, :cond_8

    .line 104
    .line 105
    iget-object p0, p0, Lm13;->a:Llt2;

    .line 106
    .line 107
    iget-object p0, p0, Llt2;->a:Ll03;

    .line 108
    .line 109
    invoke-interface {p0}, Ll03;->a()F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual/range {v1 .. v7}, Lt9;->g(Lqp;Lan;FLbq2;Lgz2;Lop0;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_8
    sget-wide v3, Lju;->g:J

    .line 118
    .line 119
    const-wide/16 v8, 0x10

    .line 120
    .line 121
    cmp-long v0, v3, v8

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_9
    invoke-virtual {p0}, Lm13;->b()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    cmp-long v0, v3, v8

    .line 131
    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    invoke-virtual {p0}, Lm13;->b()J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    goto :goto_2

    .line 139
    :cond_a
    sget-wide v3, Lju;->b:J

    .line 140
    .line 141
    :goto_2
    invoke-virtual/range {v1 .. v7}, Lt9;->f(Lqp;JLbq2;Lgz2;Lop0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    :goto_3
    if-eqz p1, :cond_b

    .line 145
    .line 146
    invoke-interface {v2}, Lqp;->i()V

    .line 147
    .line 148
    .line 149
    :cond_b
    :goto_4
    return-void

    .line 150
    :goto_5
    if-eqz p1, :cond_c

    .line 151
    .line 152
    invoke-interface {v2}, Lqp;->i()V

    .line 153
    .line 154
    .line 155
    :cond_c
    throw p0

    .line 156
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v0, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    .line 159
    .line 160
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Ll13;->D:Luw1;

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v0, ", textSubstitution="

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-object p0, p0, Ll13;->F:Lk13;

    .line 174
    .line 175
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const/16 p0, 0x29

    .line 179
    .line 180
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 188
    .line 189
    .line 190
    invoke-static {}, Ls;->b()V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final U(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-object p2, p0, Ll13;->F:Lk13;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean p3, p2, Lk13;->c:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lk13;->d:Luw1;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Luw1;->d(Le70;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p0}, Luw1;->e(Ld61;)Ltw1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Ltw1;->a()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Lqp0;->l(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final e(Lpf1;Lif1;J)Lof1;
    .locals 4

    .line 1
    const-string v0, "TextStringSimpleNode::measure"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ll13;->F:Lk13;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, Lk13;->c:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lk13;->d:Luw1;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    invoke-virtual {v0, p1}, Luw1;->d(Le70;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p3, p4, v1}, Luw1;->b(JLd61;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    iget-object p4, v0, Luw1;->n:Ltw1;

    .line 38
    .line 39
    if-eqz p4, :cond_3

    .line 40
    .line 41
    invoke-interface {p4}, Ltw1;->b()Z

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p4, v0, Luw1;->j:Lt9;

    .line 45
    .line 46
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p4, p4, Lt9;->d:Lw03;

    .line 50
    .line 51
    iget-wide v0, v0, Luw1;->l:J

    .line 52
    .line 53
    if-eqz p3, :cond_5

    .line 54
    .line 55
    const/4 p3, 0x2

    .line 56
    invoke-static {p0, p3}, Lsp0;->Z(Lt60;I)Lzn1;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Lzn1;->Z0()V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Ll13;->C:Ljava/util/HashMap;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    new-instance v2, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Ll13;->C:Ljava/util/HashMap;

    .line 73
    .line 74
    :cond_4
    sget-object p3, Lu5;->a:Ldu0;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-virtual {p4, v3}, Lw03;->d(I)F

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p3, Lu5;->b:Ldu0;

    .line 93
    .line 94
    iget v3, p4, Lw03;->g:I

    .line 95
    .line 96
    add-int/lit8 v3, v3, -0x1

    .line 97
    .line 98
    invoke-virtual {p4, v3}, Lw03;->d(I)F

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_5
    const/16 p3, 0x20

    .line 114
    .line 115
    shr-long p3, v0, p3

    .line 116
    .line 117
    long-to-int p3, p3

    .line 118
    const-wide v2, 0xffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    and-long/2addr v0, v2

    .line 124
    long-to-int p4, v0

    .line 125
    invoke-static {p3, p3, p4, p4}, Lrp0;->d0(IIII)J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-interface {p2, v0, v1}, Lif1;->e(J)Lsz1;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    iget-object p0, p0, Ll13;->C:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance v0, Lpg;

    .line 139
    .line 140
    const/4 v1, 0x7

    .line 141
    invoke-direct {v0, p2, v1}, Lpg;-><init>(Lsz1;I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, p3, p4, p0, v0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 145
    .line 146
    .line 147
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 149
    .line 150
    .line 151
    return-object p0

    .line 152
    :catchall_0
    move-exception p0

    .line 153
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 154
    .line 155
    .line 156
    throw p0
.end method

.method public final g(Lkd1;Lif1;I)I
    .locals 0

    .line 1
    iget-object p2, p0, Ll13;->F:Lk13;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean p3, p2, Lk13;->c:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lk13;->d:Luw1;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Luw1;->d(Le70;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p0}, Luw1;->e(Ld61;)Ltw1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Ltw1;->c()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Lqp0;->l(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll13;->E:Lj13;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj13;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lj13;-><init>(Ll13;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ll13;->E:Lj13;

    .line 12
    .line 13
    :cond_0
    new-instance v1, Lsd;

    .line 14
    .line 15
    iget-object v2, p0, Ll13;->v:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lsd;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lxn2;->a:[Lv41;

    .line 21
    .line 22
    sget-object v2, Lvn2;->C:Lyn2;

    .line 23
    .line 24
    invoke-static {v1}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v2, v1}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ll13;->F:Lk13;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v1, Lk13;->c:Z

    .line 36
    .line 37
    sget-object v3, Lvn2;->E:Lyn2;

    .line 38
    .line 39
    sget-object v4, Lxn2;->a:[Lv41;

    .line 40
    .line 41
    const/16 v5, 0x11

    .line 42
    .line 43
    aget-object v5, v4, v5

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v3, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lsd;

    .line 53
    .line 54
    iget-object v1, v1, Lk13;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lsd;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lvn2;->D:Lyn2;

    .line 60
    .line 61
    const/16 v3, 0x10

    .line 62
    .line 63
    aget-object v3, v4, v3

    .line 64
    .line 65
    invoke-interface {p1, v1, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v1, Lj13;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-direct {v1, p0, v2}, Lj13;-><init>(Ll13;I)V

    .line 72
    .line 73
    .line 74
    sget-object v2, Lkn2;->l:Lyn2;

    .line 75
    .line 76
    new-instance v3, Lq3;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v3, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lj13;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, p0, v2}, Lj13;-><init>(Ll13;I)V

    .line 89
    .line 90
    .line 91
    sget-object v2, Lkn2;->m:Lyn2;

    .line 92
    .line 93
    new-instance v3, Lq3;

    .line 94
    .line 95
    invoke-direct {v3, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lta;

    .line 102
    .line 103
    const/16 v2, 0x1d

    .line 104
    .line 105
    invoke-direct {v1, v2, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkn2;->n:Lyn2;

    .line 109
    .line 110
    new-instance v2, Lq3;

    .line 111
    .line 112
    invoke-direct {v2, v4, v1}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, p0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v0}, Lxn2;->a(Lzn2;Lin0;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final p(Lkd1;Lif1;I)I
    .locals 1

    .line 1
    iget-object p2, p0, Ll13;->F:Lk13;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p2, Lk13;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    :goto_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p2, Lk13;->d:Luw1;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Ll13;->M0()Luw1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-virtual {p2, p1}, Luw1;->d(Le70;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lm11;->getLayoutDirection()Ld61;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p2, p3, p0}, Luw1;->a(ILd61;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method
