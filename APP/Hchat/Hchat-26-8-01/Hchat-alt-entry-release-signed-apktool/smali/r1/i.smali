.class public final Lr1/i;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/e2;
.implements Lr1/a;


# instance fields
.field public u:Lr1/a;

.field public v:Lr1/d;

.field public w:Lr1/i;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr1/a;Lr1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr1/i;->u:Lr1/a;

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lr1/d;

    .line 9
    .line 10
    invoke-direct {p2}, Lr1/d;-><init>()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p2, p0, Lr1/i;->v:Lr1/d;

    .line 14
    .line 15
    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    .line 16
    .line 17
    iput-object p1, p0, Lr1/i;->x:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/i;->x:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(JLwf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lr1/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr1/h;

    .line 7
    .line 8
    iget v1, v0, Lr1/h;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr1/h;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr1/h;

    .line 21
    .line 22
    check-cast p3, Lyf/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lr1/h;-><init>(Lr1/i;Lyf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, Lr1/h;->h:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lr1/h;->j:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iget-wide p1, v0, Lr1/h;->g:J

    .line 42
    .line 43
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_6

    .line 47
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    return-object p1

    .line 54
    :cond_2
    iget-wide p1, v0, Lr1/h;->g:J

    .line 55
    .line 56
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-boolean p3, p0, Ly0/n;->t:Z

    .line 64
    .line 65
    if-eqz p3, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lr1/i;->l1()Lr1/i;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    const/4 p3, 0x0

    .line 73
    :goto_1
    if-eqz p3, :cond_6

    .line 74
    .line 75
    iput-wide p1, v0, Lr1/h;->g:J

    .line 76
    .line 77
    iput v3, v0, Lr1/h;->j:I

    .line 78
    .line 79
    invoke-virtual {p3, p1, p2, v0}, Lr1/i;->M(JLwf/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    if-ne p3, v4, :cond_5

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    :goto_2
    check-cast p3, Lu2/q;

    .line 87
    .line 88
    iget-wide v5, p3, Lu2/q;->a:J

    .line 89
    .line 90
    :goto_3
    move-wide v7, v5

    .line 91
    move-wide v5, p1

    .line 92
    move-wide p1, v7

    .line 93
    goto :goto_4

    .line 94
    :cond_6
    const-wide/16 v5, 0x0

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :goto_4
    iget-object p3, p0, Lr1/i;->u:Lr1/a;

    .line 98
    .line 99
    invoke-static {v5, v6, p1, p2}, Lu2/q;->d(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    iput-wide p1, v0, Lr1/h;->g:J

    .line 104
    .line 105
    iput v2, v0, Lr1/h;->j:I

    .line 106
    .line 107
    invoke-interface {p3, v5, v6, v0}, Lr1/a;->M(JLwf/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    if-ne p3, v4, :cond_7

    .line 112
    .line 113
    :goto_5
    return-object v4

    .line 114
    :cond_7
    :goto_6
    check-cast p3, Lu2/q;

    .line 115
    .line 116
    iget-wide v0, p3, Lu2/q;->a:J

    .line 117
    .line 118
    invoke-static {p1, p2, v0, v1}, Lu2/q;->e(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide p1

    .line 122
    new-instance p3, Lu2/q;

    .line 123
    .line 124
    invoke-direct {p3, p1, p2}, Lu2/q;-><init>(J)V

    .line 125
    .line 126
    .line 127
    return-object p3
.end method

.method public final M0(JJI)J
    .locals 6

    .line 1
    iget-object v0, p0, Lr1/i;->u:Lr1/a;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move v5, p5

    .line 6
    invoke-interface/range {v0 .. v5}, Lr1/a;->M0(JJI)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-boolean p3, p0, Ly0/n;->t:Z

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lr1/i;->l1()Lr1/i;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    move-object v0, p3

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 p3, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v1, v2, p1, p2}, Le1/b;->e(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-static {v3, v4, p1, p2}, Le1/b;->d(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-virtual/range {v0 .. v5}, Lr1/i;->M0(JJI)J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    const-wide/16 p3, 0x0

    .line 38
    .line 39
    :goto_2
    invoke-static {p1, p2, p3, p4}, Le1/b;->e(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1
.end method

.method public final c1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/i;->v:Lr1/d;

    .line 2
    .line 3
    iput-object p0, v0, Lr1/d;->a:Lr1/i;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, v0, Lr1/d;->b:Lr1/i;

    .line 7
    .line 8
    iput-object v1, p0, Lr1/i;->w:Lr1/i;

    .line 9
    .line 10
    new-instance v1, Ld1/c0;

    .line 11
    .line 12
    const/16 v2, 0xd

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lr1/d;->c:Lgg/m;

    .line 18
    .line 19
    invoke-virtual {p0}, Ly0/n;->Y0()Lqg/t;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lr1/d;->d:Lqg/t;

    .line 24
    .line 25
    return-void
.end method

.method public final d1()V
    .locals 3

    .line 1
    new-instance v0, Lgg/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lr1/j;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v0, v2}, Lr1/j;-><init>(Lgg/u;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lx1/k;->A(Lx1/e2;Lfg/l;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx1/e2;

    .line 18
    .line 19
    check-cast v0, Lr1/i;

    .line 20
    .line 21
    iput-object v0, p0, Lr1/i;->w:Lr1/i;

    .line 22
    .line 23
    iget-object v1, p0, Lr1/i;->v:Lr1/d;

    .line 24
    .line 25
    iput-object v0, v1, Lr1/d;->b:Lr1/i;

    .line 26
    .line 27
    iget-object v0, v1, Lr1/d;->a:Lr1/i;

    .line 28
    .line 29
    if-ne v0, p0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, v1, Lr1/d;->a:Lr1/i;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final f0(IJ)J
    .locals 3

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr1/i;->l1()Lr1/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lr1/i;->f0(IJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_1
    iget-object v2, p0, Lr1/i;->u:Lr1/a;

    .line 21
    .line 22
    invoke-static {p2, p3, v0, v1}, Le1/b;->d(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    invoke-interface {v2, p1, p2, p3}, Lr1/a;->f0(IJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    invoke-static {v0, v1, p1, p2}, Le1/b;->e(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    return-wide p1
.end method

.method public final k1()Lqg/t;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr1/i;->l1()Lr1/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lr1/i;->k1()Lqg/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Lqg/v;->o(Lqg/t;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object v0, p0, Lr1/i;->v:Lr1/d;

    .line 24
    .line 25
    iget-object v0, v0, Lr1/d;->d:Lqg/t;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_2
    const-string v0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 31
    .line 32
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method

.method public final l1()Lr1/i;
    .locals 10

    .line 1
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 7
    .line 8
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "visitAncestors called on an unattached node"

    .line 13
    .line 14
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 18
    .line 19
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 20
    .line 21
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-eqz v2, :cond_b

    .line 26
    .line 27
    iget-object v3, v2, Lx1/f0;->L:Lx1/b1;

    .line 28
    .line 29
    iget-object v3, v3, Lx1/b1;->f:Ly0/n;

    .line 30
    .line 31
    iget v3, v3, Ly0/n;->j:I

    .line 32
    .line 33
    const/high16 v4, 0x40000

    .line 34
    .line 35
    and-int/2addr v3, v4

    .line 36
    if-eqz v3, :cond_9

    .line 37
    .line 38
    :goto_1
    if-eqz v0, :cond_9

    .line 39
    .line 40
    iget v3, v0, Ly0/n;->i:I

    .line 41
    .line 42
    and-int/2addr v3, v4

    .line 43
    if-eqz v3, :cond_8

    .line 44
    .line 45
    move-object v3, v0

    .line 46
    move-object v5, v1

    .line 47
    :goto_2
    if-eqz v3, :cond_8

    .line 48
    .line 49
    instance-of v6, v3, Lx1/e2;

    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    move-object v6, v3

    .line 54
    check-cast v6, Lx1/e2;

    .line 55
    .line 56
    iget-object v7, p0, Lr1/i;->x:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v6}, Lx1/e2;->F()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_1

    .line 67
    .line 68
    const-class v7, Lr1/i;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    if-ne v7, v8, :cond_1

    .line 75
    .line 76
    move-object v1, v6

    .line 77
    goto :goto_5

    .line 78
    :cond_1
    iget v6, v3, Ly0/n;->i:I

    .line 79
    .line 80
    and-int/2addr v6, v4

    .line 81
    if-eqz v6, :cond_7

    .line 82
    .line 83
    instance-of v6, v3, Lx1/j;

    .line 84
    .line 85
    if-eqz v6, :cond_7

    .line 86
    .line 87
    move-object v6, v3

    .line 88
    check-cast v6, Lx1/j;

    .line 89
    .line 90
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    :goto_3
    const/4 v8, 0x1

    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    iget v9, v6, Ly0/n;->i:I

    .line 97
    .line 98
    and-int/2addr v9, v4

    .line 99
    if-eqz v9, :cond_5

    .line 100
    .line 101
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    if-ne v7, v8, :cond_2

    .line 104
    .line 105
    move-object v3, v6

    .line 106
    goto :goto_4

    .line 107
    :cond_2
    if-nez v5, :cond_3

    .line 108
    .line 109
    new-instance v5, Lj0/b;

    .line 110
    .line 111
    const/16 v8, 0x10

    .line 112
    .line 113
    new-array v8, v8, [Ly0/n;

    .line 114
    .line 115
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    if-eqz v3, :cond_4

    .line 119
    .line 120
    invoke-virtual {v5, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object v3, v1

    .line 124
    :cond_4
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    if-ne v7, v8, :cond_7

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    goto :goto_2

    .line 138
    :cond_8
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_9
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_a

    .line 146
    .line 147
    iget-object v0, v2, Lx1/f0;->L:Lx1/b1;

    .line 148
    .line 149
    if-eqz v0, :cond_a

    .line 150
    .line 151
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_a
    move-object v0, v1

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_b
    :goto_5
    check-cast v1, Lr1/i;

    .line 159
    .line 160
    :cond_c
    return-object v1
.end method

.method public final m0(JJLyf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, Lr1/g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lr1/g;

    .line 9
    .line 10
    iget v2, v1, Lr1/g;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lr1/g;->k:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lr1/g;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lr1/g;-><init>(Lr1/i;Lyf/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, Lr1/g;->i:Ljava/lang/Object;

    .line 30
    .line 31
    iget v1, v7, Lr1/g;->k:I

    .line 32
    .line 33
    const/4 v8, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    if-ne v1, v8, :cond_1

    .line 42
    .line 43
    iget-wide v1, v7, Lr1/g;->g:J

    .line 44
    .line 45
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_5

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0

    .line 56
    :cond_2
    iget-wide v1, v7, Lr1/g;->h:J

    .line 57
    .line 58
    iget-wide v3, v7, Lr1/g;->g:J

    .line 59
    .line 60
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {v0}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lr1/i;->u:Lr1/a;

    .line 68
    .line 69
    iput-wide p1, v7, Lr1/g;->g:J

    .line 70
    .line 71
    move-wide v5, p3

    .line 72
    iput-wide v5, v7, Lr1/g;->h:J

    .line 73
    .line 74
    iput v2, v7, Lr1/g;->k:I

    .line 75
    .line 76
    move-wide v3, p1

    .line 77
    move-object v2, v0

    .line 78
    invoke-interface/range {v2 .. v7}, Lr1/a;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-ne v0, v9, :cond_4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    move-wide v3, p1

    .line 86
    move-wide v1, p3

    .line 87
    :goto_2
    check-cast v0, Lu2/q;

    .line 88
    .line 89
    iget-wide v10, v0, Lu2/q;->a:J

    .line 90
    .line 91
    iget-boolean v0, p0, Ly0/n;->t:Z

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Lr1/i;->l1()Lr1/i;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    const/4 v0, 0x0

    .line 103
    goto :goto_3

    .line 104
    :cond_6
    iget-object v0, p0, Lr1/i;->w:Lr1/i;

    .line 105
    .line 106
    :goto_3
    if-eqz v0, :cond_8

    .line 107
    .line 108
    invoke-static {v3, v4, v10, v11}, Lu2/q;->e(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    invoke-static {v1, v2, v10, v11}, Lu2/q;->d(JJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v5

    .line 116
    iput-wide v10, v7, Lr1/g;->g:J

    .line 117
    .line 118
    iput v8, v7, Lr1/g;->k:I

    .line 119
    .line 120
    move-object v2, v0

    .line 121
    invoke-virtual/range {v2 .. v7}, Lr1/i;->m0(JJLyf/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v9, :cond_7

    .line 126
    .line 127
    :goto_4
    return-object v9

    .line 128
    :cond_7
    move-wide v1, v10

    .line 129
    :goto_5
    check-cast v0, Lu2/q;

    .line 130
    .line 131
    iget-wide v3, v0, Lu2/q;->a:J

    .line 132
    .line 133
    move-wide v10, v1

    .line 134
    goto :goto_6

    .line 135
    :cond_8
    const-wide/16 v3, 0x0

    .line 136
    .line 137
    :goto_6
    invoke-static {v10, v11, v3, v4}, Lu2/q;->e(JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    new-instance v2, Lu2/q;

    .line 142
    .line 143
    invoke-direct {v2, v0, v1}, Lu2/q;-><init>(J)V

    .line 144
    .line 145
    .line 146
    return-object v2
.end method
