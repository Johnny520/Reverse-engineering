.class public final Lw/k0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/v;
.implements Lx1/m1;


# instance fields
.field public A:Li2/n0;

.field public B:Lm2/r;

.field public u:Li2/n0;

.field public v:I

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# virtual methods
.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/k0;->B:Lm2/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw/j0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lw/j0;-><init>(Lw/k0;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 16
    .line 17
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final c1()V
    .locals 5

    .line 1
    sget-object v0, Ly1/h1;->k:Li0/m2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm2/d;

    .line 8
    .line 9
    iget-object v1, p0, Lw/k0;->u:Li2/n0;

    .line 10
    .line 11
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Lx1/f0;->F:Lu2/m;

    .line 16
    .line 17
    invoke-static {v1, v2}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lw/k0;->A:Li2/n0;

    .line 22
    .line 23
    invoke-virtual {p0}, Lw/k0;->k1()Li2/n0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Li2/n0;->a:Li2/f0;

    .line 28
    .line 29
    iget-object v1, v1, Li2/f0;->f:Lm2/p;

    .line 30
    .line 31
    invoke-virtual {p0}, Lw/k0;->k1()Li2/n0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v2, v2, Li2/n0;->a:Li2/f0;

    .line 36
    .line 37
    iget-object v2, v2, Li2/f0;->c:Lm2/k;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    sget-object v2, Lm2/k;->i:Lm2/k;

    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Lw/k0;->k1()Li2/n0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v3, v3, Li2/n0;->a:Li2/f0;

    .line 48
    .line 49
    iget-object v3, v3, Li2/f0;->d:Lm2/i;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iget v3, v3, Lm2/i;->a:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/4 v3, 0x0

    .line 57
    :goto_0
    invoke-virtual {p0}, Lw/k0;->k1()Li2/n0;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object v4, v4, Li2/n0;->a:Li2/f0;

    .line 62
    .line 63
    iget-object v4, v4, Li2/f0;->e:Lm2/j;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    iget v4, v4, Lm2/j;->a:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const v4, 0xffff

    .line 71
    .line 72
    .line 73
    :goto_1
    check-cast v0, Lm2/e;

    .line 74
    .line 75
    invoke-virtual {v0, v1, v2, v3, v4}, Lm2/e;->b(Lm2/p;Lm2/k;II)Lm2/r;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lw/k0;->B:Lm2/r;

    .line 80
    .line 81
    new-instance v0, Lw/j0;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-direct {v0, p0, v1}, Lw/j0;-><init>(Lw/k0;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, Lx1/k;->r(Ly0/n;Lfg/a;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 92
    .line 93
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lw/k0;->A:Li2/n0;

    .line 3
    .line 4
    iput-object v0, p0, Lw/k0;->B:Lm2/r;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 8
    .line 9
    return-void
.end method

.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lw/k0;->x:Z

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0}, Lw/k0;->k1()Li2/n0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, Ly1/h1;->k:Li0/m2;

    .line 11
    .line 12
    invoke-static {p0, v2}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lm2/d;

    .line 17
    .line 18
    sget-object v3, Lw/a1;->a:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-static {v0, p1, v2, v3, v4}, Lw/a1;->a(Li2/n0;Lu2/c;Lm2/d;Ljava/lang/String;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    const-wide v7, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v5, v7

    .line 31
    long-to-int v5, v5

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v9, 0xa

    .line 41
    .line 42
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/4 v6, 0x2

    .line 53
    invoke-static {v0, p1, v2, v3, v6}, Lw/a1;->a(Li2/n0;Lu2/c;Lm2/d;Ljava/lang/String;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    and-long/2addr v2, v7

    .line 58
    long-to-int v0, v2

    .line 59
    sub-int/2addr v0, v5

    .line 60
    iget v2, p0, Lw/k0;->v:I

    .line 61
    .line 62
    if-ne v2, v4, :cond_0

    .line 63
    .line 64
    move v2, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {v2, v4, v0, v5}, Lp/a;->z(IIII)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    :goto_0
    iput v2, p0, Lw/k0;->y:I

    .line 71
    .line 72
    iget v2, p0, Lw/k0;->w:I

    .line 73
    .line 74
    const v3, 0x7fffffff

    .line 75
    .line 76
    .line 77
    if-ne v2, v3, :cond_1

    .line 78
    .line 79
    move v0, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-static {v2, v4, v0, v5}, Lp/a;->z(IIII)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    :goto_1
    iput v0, p0, Lw/k0;->z:I

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 89
    .line 90
    :cond_2
    iget v0, p0, Lw/k0;->y:I

    .line 91
    .line 92
    if-eq v0, v1, :cond_3

    .line 93
    .line 94
    invoke-static {p3, p4}, Lu2/a;->i(J)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static {v0, v2, v3}, Lr9/e0;->r(III)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :goto_2
    move v6, v0

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-static {p3, p4}, Lu2/a;->i(J)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    goto :goto_2

    .line 113
    :goto_3
    iget v0, p0, Lw/k0;->z:I

    .line 114
    .line 115
    if-eq v0, v1, :cond_4

    .line 116
    .line 117
    invoke-static {p3, p4}, Lu2/a;->i(J)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-static {v0, v1, v2}, Lr9/e0;->r(III)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    :goto_4
    move v7, v0

    .line 130
    goto :goto_5

    .line 131
    :cond_4
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_4

    .line 136
    :goto_5
    const/4 v5, 0x0

    .line 137
    const/4 v8, 0x3

    .line 138
    const/4 v4, 0x0

    .line 139
    move-wide v2, p3

    .line 140
    invoke-static/range {v2 .. v8}, Lu2/a;->a(JIIIII)J

    .line 141
    .line 142
    .line 143
    move-result-wide p3

    .line 144
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    iget p3, p2, Lv1/b1;->g:I

    .line 149
    .line 150
    iget p4, p2, Lv1/b1;->h:I

    .line 151
    .line 152
    new-instance v0, Lg0/g;

    .line 153
    .line 154
    const/4 v1, 0x7

    .line 155
    invoke-direct {v0, p2, v1}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 156
    .line 157
    .line 158
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 159
    .line 160
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1
.end method

.method public final k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/k0;->u:Li2/n0;

    .line 2
    .line 3
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lx1/f0;->F:Lu2/m;

    .line 8
    .line 9
    invoke-static {v0, v1}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lw/k0;->A:Li2/n0;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 17
    .line 18
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final k1()Li2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/k0;->A:Li2/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Resolved style is not set."

    .line 7
    .line 8
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lokio/a;->c()V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lw/k0;->x:Z

    .line 3
    .line 4
    invoke-static {p0}, Lx1/k;->m(Lx1/v;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
