.class public final Li0/f0;
.super Li0/o;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Z

.field public d:Ljava/util/HashSet;

.field public final e:Lf/l0;

.field public final f:Li0/j1;

.field public final synthetic g:Li0/h0;


# direct methods
.method public constructor <init>(Li0/h0;JZZLandroidx/lifecycle/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/f0;->g:Li0/h0;

    .line 5
    .line 6
    iput-wide p2, p0, Li0/f0;->a:J

    .line 7
    .line 8
    iput-boolean p4, p0, Li0/f0;->b:Z

    .line 9
    .line 10
    iput-boolean p5, p0, Li0/f0;->c:Z

    .line 11
    .line 12
    sget-object p1, Lf/s0;->a:Lf/l0;

    .line 13
    .line 14
    new-instance p1, Lf/l0;

    .line 15
    .line 16
    invoke-direct {p1}, Lf/l0;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Li0/f0;->e:Lf/l0;

    .line 20
    .line 21
    sget-object p1, Ls0/h;->j:Ls0/h;

    .line 22
    .line 23
    sget-object p2, Li0/e;->k:Li0/e;

    .line 24
    .line 25
    new-instance p3, Li0/j1;

    .line 26
    .line 27
    invoke-direct {p3, p1, p2}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 28
    .line 29
    .line 30
    iput-object p3, p0, Li0/f0;->f:Li0/j1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Li0/q;Lfg/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Li0/o;->a(Li0/q;Lfg/p;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Li0/q;Li0/e2;Lfg/p;)Lf/l0;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Li0/o;->b(Li0/q;Li0/e2;Lfg/p;)Lf/l0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget v1, v0, Li0/h0;->A:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, v0, Li0/h0;->A:I

    .line 8
    .line 9
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/o;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/f0;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li0/f0;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li0/f0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Li0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->h:Li0/q;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i()Ls0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->f:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls0/h;

    .line 8
    .line 9
    return-object v0
.end method

.method public final j()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/o;->j()Lwf/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/o;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final l(Li0/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v1, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    iget-object v2, v0, Li0/h0;->h:Li0/q;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Li0/o;->l(Li0/q;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Li0/o;->l(Li0/q;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final m(Li0/v0;)Li0/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li0/o;->m(Li0/v0;)Li0/u0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final n(Li0/q;Li0/e2;Lf/l0;)Lf/l0;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Li0/o;->n(Li0/q;Li0/e2;Lf/l0;)Lf/l0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final o(Ljava/util/Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li0/f0;->d:Ljava/util/HashSet;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(Li0/h0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->e:Lf/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Li0/r1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li0/o;->q(Li0/r1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Li0/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li0/o;->r(Li0/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(Ld1/c0;)Li0/f;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li0/o;->s(Ld1/c0;)Li0/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget v1, v0, Li0/h0;->A:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1

    .line 6
    .line 7
    iput v1, v0, Li0/h0;->A:I

    .line 8
    .line 9
    return-void
.end method

.method public final u(Li0/h0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/f0;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/util/Set;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Li0/h0;->y()Lx0/c;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Li0/f0;->e:Lf/l0;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final v(Li0/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f0;->g:Li0/h0;

    .line 2
    .line 3
    iget-object v0, v0, Li0/h0;->b:Li0/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Li0/o;->v(Li0/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/f0;->e:Lf/l0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf/l0;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_4

    .line 10
    .line 11
    iget-object v2, v0, Li0/f0;->d:Ljava/util/HashSet;

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-object v3, v1, Lf/l0;->b:[Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v4, v1, Lf/l0;->a:[J

    .line 18
    .line 19
    array-length v5, v4

    .line 20
    add-int/lit8 v5, v5, -0x2

    .line 21
    .line 22
    if-ltz v5, :cond_3

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    :goto_0
    aget-wide v8, v4, v7

    .line 26
    .line 27
    not-long v10, v8

    .line 28
    const/4 v12, 0x7

    .line 29
    shl-long/2addr v10, v12

    .line 30
    and-long/2addr v10, v8

    .line 31
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v10, v12

    .line 37
    cmp-long v10, v10, v12

    .line 38
    .line 39
    if-eqz v10, :cond_2

    .line 40
    .line 41
    sub-int v10, v7, v5

    .line 42
    .line 43
    not-int v10, v10

    .line 44
    ushr-int/lit8 v10, v10, 0x1f

    .line 45
    .line 46
    const/16 v11, 0x8

    .line 47
    .line 48
    rsub-int/lit8 v10, v10, 0x8

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    :goto_1
    if-ge v12, v10, :cond_1

    .line 52
    .line 53
    const-wide/16 v13, 0xff

    .line 54
    .line 55
    and-long/2addr v13, v8

    .line 56
    const-wide/16 v15, 0x80

    .line 57
    .line 58
    cmp-long v13, v13, v15

    .line 59
    .line 60
    if-gez v13, :cond_0

    .line 61
    .line 62
    shl-int/lit8 v13, v7, 0x3

    .line 63
    .line 64
    add-int/2addr v13, v12

    .line 65
    aget-object v13, v3, v13

    .line 66
    .line 67
    check-cast v13, Li0/h0;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    if-eqz v15, :cond_0

    .line 78
    .line 79
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v15

    .line 83
    check-cast v15, Ljava/util/Set;

    .line 84
    .line 85
    invoke-virtual {v13}, Li0/h0;->y()Lx0/c;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-interface {v15, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_0
    shr-long/2addr v8, v11

    .line 94
    add-int/lit8 v12, v12, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    if-ne v10, v11, :cond_3

    .line 98
    .line 99
    :cond_2
    if-eq v7, v5, :cond_3

    .line 100
    .line 101
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    invoke-virtual {v1}, Lf/l0;->b()V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method
