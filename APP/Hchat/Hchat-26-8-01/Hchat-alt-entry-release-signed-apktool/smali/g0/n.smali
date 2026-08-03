.class public final Lg0/n;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/v;
.implements Lx1/m;
.implements Lx1/z1;


# instance fields
.field public A:I

.field public B:Ljava/util/HashMap;

.field public C:Lg0/e;

.field public D:Li2/n0;

.field public E:Lg0/l;

.field public F:Lg0/m;

.field public u:Ljava/lang/String;

.field public v:Li2/n0;

.field public w:Lm2/d;

.field public x:I

.field public y:Z

.field public z:I


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lg0/n;->F:Lg0/m;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Lg0/m;->c:Z

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
    iget-object v0, v0, Lg0/m;->d:Lg0/e;

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0}, Lg0/n;->k1()Lg0/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_3
    iget-object v1, v0, Lg0/e;->j:Li2/a;

    .line 28
    .line 29
    if-eqz v1, :cond_e

    .line 30
    .line 31
    iget-object p1, p1, Lx1/h0;->g:Lh1/b;

    .line 32
    .line 33
    iget-object p1, p1, Lh1/b;->h:Lb5/c;

    .line 34
    .line 35
    invoke-virtual {p1}, Lb5/c;->p()Lf1/u;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-boolean p1, v0, Lg0/e;->k:Z

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    iget-wide v3, v0, Lg0/e;->l:J

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
    invoke-interface {v2}, Lf1/u;->e()V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-interface/range {v2 .. v7}, Lf1/u;->l(FFFFI)V

    .line 66
    .line 67
    .line 68
    :cond_4
    const/4 v0, 0x2

    .line 69
    :try_start_0
    invoke-virtual {p0, v0}, Lg0/n;->m1(I)Z

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lg0/n;->D:Li2/n0;

    .line 73
    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    iget-object v0, p0, Lg0/n;->v:Li2/n0;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_5

    .line 81
    :cond_5
    :goto_1
    iget-object v3, v0, Li2/n0;->a:Li2/f0;

    .line 82
    .line 83
    iget-object v4, v3, Li2/f0;->m:Lt2/l;

    .line 84
    .line 85
    if-nez v4, :cond_6

    .line 86
    .line 87
    sget-object v4, Lt2/l;->b:Lt2/l;

    .line 88
    .line 89
    :cond_6
    move-object v6, v4

    .line 90
    iget-object v4, v3, Li2/f0;->n:Lf1/q0;

    .line 91
    .line 92
    if-nez v4, :cond_7

    .line 93
    .line 94
    sget-object v4, Lf1/q0;->d:Lf1/q0;

    .line 95
    .line 96
    :cond_7
    move-object v5, v4

    .line 97
    iget-object v4, v3, Li2/f0;->o:Lh1/c;

    .line 98
    .line 99
    if-nez v4, :cond_8

    .line 100
    .line 101
    sget-object v4, Lh1/f;->b:Lh1/f;

    .line 102
    .line 103
    :cond_8
    move-object v7, v4

    .line 104
    iget-object v3, v3, Li2/f0;->a:Lt2/o;

    .line 105
    .line 106
    invoke-interface {v3}, Lt2/o;->c()Lf1/s;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-eqz v3, :cond_9

    .line 111
    .line 112
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 113
    .line 114
    iget-object v0, v0, Li2/f0;->a:Lt2/o;

    .line 115
    .line 116
    invoke-interface {v0}, Lt2/o;->a()F

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual/range {v1 .. v7}, Li2/a;->g(Lf1/u;Lf1/s;FLf1/q0;Lt2/l;Lh1/c;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_9
    sget-wide v3, Lf1/w;->g:J

    .line 125
    .line 126
    const-wide/16 v8, 0x10

    .line 127
    .line 128
    cmp-long v10, v3, v8

    .line 129
    .line 130
    if-eqz v10, :cond_a

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_a
    invoke-virtual {v0}, Li2/n0;->a()J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    cmp-long v3, v3, v8

    .line 138
    .line 139
    if-eqz v3, :cond_b

    .line 140
    .line 141
    invoke-virtual {v0}, Li2/n0;->a()J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    goto :goto_2

    .line 146
    :cond_b
    sget-wide v3, Lf1/w;->b:J

    .line 147
    .line 148
    :goto_2
    invoke-virtual/range {v1 .. v7}, Li2/a;->f(Lf1/u;JLf1/q0;Lt2/l;Lh1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    :goto_3
    if-eqz p1, :cond_c

    .line 152
    .line 153
    invoke-interface {v2}, Lf1/u;->p()V

    .line 154
    .line 155
    .line 156
    :cond_c
    :goto_4
    return-void

    .line 157
    :goto_5
    if-eqz p1, :cond_d

    .line 158
    .line 159
    invoke-interface {v2}, Lf1/u;->p()V

    .line 160
    .line 161
    .line 162
    :cond_d
    throw v0

    .line 163
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v0, "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lg0/n;->C:Lg0/e;

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v0, ", textSubstitution="

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lg0/n;->F:Lg0/m;

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const/16 v0, 0x29

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lokio/a;->c()V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final G(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/n;->l1(Lv1/p0;)Lg0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Lg0/e;->e(Lu2/m;)Li2/t;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Li2/t;->b()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lw/s;->n(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final K0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/n;->l1(Lv1/p0;)Lg0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p3, p1}, Lg0/e;->a(ILu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final Q(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/n;->l1(Lv1/p0;)Lg0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p1}, Lg0/e;->e(Lu2/m;)Li2/t;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Li2/t;->c()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lw/s;->n(F)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final R0(Lx1/n0;Lv1/m0;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg0/n;->l1(Lv1/p0;)Lg0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2, p3, p1}, Lg0/e;->a(ILu2/m;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final X0(Lf2/y;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lg0/n;->E:Lg0/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg0/l;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lg0/l;-><init>(Lg0/n;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lg0/n;->E:Lg0/l;

    .line 12
    .line 13
    :cond_0
    new-instance v1, Li2/g;

    .line 14
    .line 15
    iget-object v2, p0, Lg0/n;->u:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 21
    .line 22
    sget-object v2, Lf2/u;->B:Lf2/x;

    .line 23
    .line 24
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1, v2, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lg0/n;->F:Lg0/m;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-boolean v2, v1, Lg0/m;->c:Z

    .line 36
    .line 37
    sget-object v3, Lf2/u;->D:Lf2/x;

    .line 38
    .line 39
    sget-object v4, Lf2/w;->a:[Lmg/d;

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
    invoke-interface {p1, v3, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Li2/g;

    .line 53
    .line 54
    iget-object v1, v1, Lg0/m;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Li2/g;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lf2/u;->C:Lf2/x;

    .line 60
    .line 61
    const/16 v3, 0x10

    .line 62
    .line 63
    aget-object v3, v4, v3

    .line 64
    .line 65
    invoke-interface {p1, v1, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-instance v1, Lg0/l;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    invoke-direct {v1, p0, v2}, Lg0/l;-><init>(Lg0/n;I)V

    .line 72
    .line 73
    .line 74
    sget-object v2, Lf2/l;->l:Lf2/x;

    .line 75
    .line 76
    new-instance v3, Lf2/a;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lg0/l;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, p0, v2}, Lg0/l;-><init>(Lg0/n;I)V

    .line 89
    .line 90
    .line 91
    sget-object v2, Lf2/l;->m:Lf2/x;

    .line 92
    .line 93
    new-instance v3, Lf2/a;

    .line 94
    .line 95
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, Lab/a;

    .line 102
    .line 103
    const/16 v2, 0x16

    .line 104
    .line 105
    invoke-direct {v1, p0, v2}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    sget-object v2, Lf2/l;->n:Lf2/x;

    .line 109
    .line 110
    new-instance v3, Lf2/a;

    .line 111
    .line 112
    invoke-direct {v3, v4, v1}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v0}, Lf2/w;->a(Lf2/y;Lfg/l;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
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
    invoke-virtual {p0, p1}, Lg0/n;->l1(Lv1/p0;)Lg0/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p3, p4, v1}, Lg0/e;->b(JLu2/m;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    iget-object p4, v0, Lg0/e;->n:Li2/t;

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    invoke-interface {p4}, Li2/t;->a()Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p4, v0, Lg0/e;->j:Li2/a;

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p4, p4, Li2/a;->d:Lj2/k;

    .line 31
    .line 32
    iget-wide v0, v0, Lg0/e;->l:J

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    const/4 p3, 0x2

    .line 37
    invoke-static {p0, p3}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lx1/i1;->y1()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lg0/n;->B:Ljava/util/HashMap;

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    new-instance v2, Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-direct {v2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lg0/n;->B:Ljava/util/HashMap;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    :goto_0
    sget-object p3, Lv1/c;->a:Lv1/j;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-virtual {p4, v3}, Lj2/k;->d(I)F

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object p3, Lv1/c;->b:Lv1/j;

    .line 77
    .line 78
    iget v3, p4, Lj2/k;->g:I

    .line 79
    .line 80
    add-int/lit8 v3, v3, -0x1

    .line 81
    .line 82
    invoke-virtual {p4, v3}, Lj2/k;->d(I)F

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-interface {v2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :cond_2
    const/16 p3, 0x20

    .line 98
    .line 99
    shr-long p3, v0, p3

    .line 100
    .line 101
    long-to-int p3, p3

    .line 102
    const-wide v2, 0xffffffffL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    and-long/2addr v0, v2

    .line 108
    long-to-int p4, v0

    .line 109
    invoke-static {p3, p3, p4, p4}, Lf8/i;->u(IIII)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-interface {p2, v0, v1}, Lv1/m0;->Q(J)Lv1/b1;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-object v0, p0, Lg0/n;->B:Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v1, Lg0/g;

    .line 123
    .line 124
    const/4 v2, 0x1

    .line 125
    invoke-direct {v1, p2, v2}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, p3, p4, v0, v1}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 137
    .line 138
    .line 139
    throw p1
.end method

.method public final k1()Lg0/e;
    .locals 9

    .line 1
    iget-object v0, p0, Lg0/n;->D:Li2/n0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg0/n;->v:Li2/n0;

    .line 6
    .line 7
    :cond_0
    move-object v3, v0

    .line 8
    iget-object v0, p0, Lg0/n;->C:Lg0/e;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lg0/e;

    .line 13
    .line 14
    iget-object v2, p0, Lg0/n;->u:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, p0, Lg0/n;->w:Lm2/d;

    .line 17
    .line 18
    iget v5, p0, Lg0/n;->x:I

    .line 19
    .line 20
    iget-boolean v6, p0, Lg0/n;->y:Z

    .line 21
    .line 22
    iget v7, p0, Lg0/n;->z:I

    .line 23
    .line 24
    iget v8, p0, Lg0/n;->A:I

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lg0/e;-><init>(Ljava/lang/String;Li2/n0;Lm2/d;IZII)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lg0/n;->C:Lg0/e;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lg0/n;->C:Lg0/e;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final l1(Lv1/p0;)Lg0/e;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lg0/n;->m1(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lg0/n;->D:Li2/n0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lg0/n;->v:Li2/n0;

    .line 13
    .line 14
    :cond_0
    move-object v3, v0

    .line 15
    invoke-virtual {p0}, Lg0/n;->k1()Lg0/e;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lg0/n;->u:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lg0/n;->w:Lm2/d;

    .line 22
    .line 23
    iget v5, p0, Lg0/n;->x:I

    .line 24
    .line 25
    iget-boolean v6, p0, Lg0/n;->y:Z

    .line 26
    .line 27
    iget v7, p0, Lg0/n;->z:I

    .line 28
    .line 29
    iget v8, p0, Lg0/n;->A:I

    .line 30
    .line 31
    invoke-virtual/range {v1 .. v8}, Lg0/e;->f(Ljava/lang/String;Li2/n0;Lm2/d;IZII)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lg0/n;->F:Lg0/m;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-boolean v1, v0, Lg0/m;->c:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    :goto_0
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iget-object v0, v0, Lg0/m;->d:Lg0/e;

    .line 47
    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    :cond_3
    invoke-virtual {p0}, Lg0/n;->k1()Lg0/e;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_4
    invoke-virtual {v0, p1}, Lg0/e;->d(Lu2/c;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public final m1(I)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lg0/n;->D:Li2/n0;

    .line 2
    .line 3
    iget-object v0, p0, Lg0/n;->v:Li2/n0;

    .line 4
    .line 5
    new-instance v1, Lg0/o;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v2}, Lg0/o;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v2, "StyleOuterNode"

    .line 12
    .line 13
    invoke-static {p0, v2, v1}, Lx1/k;->z(Lx1/i;Ljava/lang/Object;Lfg/l;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg0/n;->D:Li2/n0;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_0
    invoke-virtual {p1, v0}, Li2/n0;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    xor-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    return p1
.end method
