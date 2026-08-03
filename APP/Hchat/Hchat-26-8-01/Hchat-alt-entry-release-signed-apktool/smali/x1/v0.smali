.class public final Lx1/v0;
.super Lv1/b1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/m0;
.implements Lx1/a;
.implements Lx1/y0;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final D:Lx1/g0;

.field public final E:Lj0/b;

.field public F:Z

.field public G:Z

.field public H:J

.field public final I:Lx1/u0;

.field public final J:Lx1/u0;

.field public K:F

.field public L:Z

.field public M:Lfg/l;

.field public N:Li1/b;

.field public O:J

.field public P:F

.field public final Q:Lx1/u0;

.field public R:Z

.field public final l:Lx1/j0;

.field public m:Z

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Lx1/d0;

.field public s:J

.field public t:Lfg/l;

.field public u:Li1/b;

.field public v:F

.field public w:Z

.field public x:Ljava/lang/Object;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lx1/j0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lv1/b1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/v0;->l:Lx1/j0;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lx1/v0;->n:I

    .line 10
    .line 11
    iput p1, p0, Lx1/v0;->o:I

    .line 12
    .line 13
    sget-object p1, Lx1/d0;->i:Lx1/d0;

    .line 14
    .line 15
    iput-object p1, p0, Lx1/v0;->r:Lx1/d0;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lx1/v0;->s:J

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lx1/v0;->w:Z

    .line 23
    .line 24
    new-instance v2, Lx1/g0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, Lx1/g0;-><init>(Lx1/a;I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lx1/v0;->D:Lx1/g0;

    .line 31
    .line 32
    new-instance v2, Lj0/b;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    new-array v3, v3, [Lx1/v0;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lx1/v0;->E:Lj0/b;

    .line 42
    .line 43
    iput-boolean p1, p0, Lx1/v0;->F:Z

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    const/16 v2, 0xf

    .line 47
    .line 48
    invoke-static {p1, p1, p1, p1, v2}, Lu2/b;->b(IIIII)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iput-wide v2, p0, Lx1/v0;->H:J

    .line 53
    .line 54
    new-instance p1, Lx1/u0;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {p1, p0, v2}, Lx1/u0;-><init>(Lx1/v0;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lx1/v0;->I:Lx1/u0;

    .line 61
    .line 62
    new-instance p1, Lx1/u0;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {p1, p0, v2}, Lx1/u0;-><init>(Lx1/v0;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lx1/v0;->J:Lx1/u0;

    .line 69
    .line 70
    iput-wide v0, p0, Lx1/v0;->O:J

    .line 71
    .line 72
    new-instance p1, Lx1/u0;

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    invoke-direct {p1, p0, v0}, Lx1/u0;-><init>(Lx1/v0;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lx1/v0;->Q:Lx1/u0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final A()Lx1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 6
    .line 7
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 8
    .line 9
    return-object v0
.end method

.method public final A0(JFLfg/l;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Lx1/v0;->T0(JFLfg/l;Li1/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final B()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public final B0(JFLi1/b;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v5, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Lx1/v0;->T0(JFLfg/l;Li1/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final G(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-static {v1}, Lx1/k;->q(Lx1/f0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx1/r0;->G(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lx1/v0;->N0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p1}, Lv1/m0;->G(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Lx1/v0;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final J0()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lx1/f0;->f0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lx1/v0;->F:Z

    .line 9
    .line 10
    iget-object v2, p0, Lx1/v0;->E:Lj0/b;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lj0/b;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/f0;->y()Lj0/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, Lj0/b;->i:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v5, v1, :cond_2

    .line 32
    .line 33
    aget-object v6, v3, v5

    .line 34
    .line 35
    check-cast v6, Lx1/f0;

    .line 36
    .line 37
    iget v7, v2, Lj0/b;->i:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, Lx1/f0;->M:Lx1/j0;

    .line 42
    .line 43
    iget-object v6, v6, Lx1/j0;->p:Lx1/v0;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, Lx1/f0;->M:Lx1/j0;

    .line 50
    .line 51
    iget-object v6, v6, Lx1/j0;->p:Lx1/v0;

    .line 52
    .line 53
    iget-object v7, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object v8, v7, v5

    .line 56
    .line 57
    aput-object v6, v7, v5

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Lx1/f0;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lf/d0;

    .line 67
    .line 68
    iget-object v0, v0, Lf/d0;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lj0/b;

    .line 71
    .line 72
    iget v0, v0, Lj0/b;->i:I

    .line 73
    .line 74
    iget v1, v2, Lj0/b;->i:I

    .line 75
    .line 76
    invoke-virtual {v2, v0, v1}, Lj0/b;->l(II)V

    .line 77
    .line 78
    .line 79
    iput-boolean v4, p0, Lx1/v0;->F:Z

    .line 80
    .line 81
    invoke-virtual {v2}, Lj0/b;->f()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method

.method public final K0()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lx1/v0;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lx1/v0;->y:Z

    .line 5
    .line 6
    iget-object v2, p0, Lx1/v0;->l:Lx1/j0;

    .line 7
    .line 8
    iget-object v3, v2, Lx1/j0;->a:Lx1/f0;

    .line 9
    .line 10
    iget-object v4, v3, Lx1/f0;->L:Lx1/b1;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v4, Lx1/b1;->c:Lx1/r;

    .line 15
    .line 16
    invoke-virtual {v0}, Lx1/i1;->C1()V

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ly1/t;

    .line 24
    .line 25
    invoke-virtual {v0}, Ly1/t;->getRectManager()Lg2/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, v2, Lx1/j0;->a:Lx1/f0;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lg2/b;->f(Lx1/f0;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Lx1/f0;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x6

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-static {v3, v1, v2}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, v3, Lx1/f0;->M:Lx1/j0;

    .line 46
    .line 47
    iget-boolean v0, v0, Lx1/j0;->e:Z

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-static {v3, v1, v2}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    iget-object v0, v4, Lx1/b1;->d:Lx1/i1;

    .line 55
    .line 56
    iget-object v1, v4, Lx1/b1;->c:Lx1/r;

    .line 57
    .line 58
    iget-object v1, v1, Lx1/i1;->v:Lx1/i1;

    .line 59
    .line 60
    :goto_1
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-boolean v2, v0, Lx1/i1;->Q:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0}, Lx1/i1;->y1()V

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object v0, v0, Lx1/i1;->v:Lx1/i1;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v0, v0, Lj0/b;->i:I

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    :goto_2
    if-ge v2, v0, :cond_5

    .line 88
    .line 89
    aget-object v3, v1, v2

    .line 90
    .line 91
    check-cast v3, Lx1/f0;

    .line 92
    .line 93
    invoke-virtual {v3}, Lx1/f0;->v()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    const v5, 0x7fffffff

    .line 98
    .line 99
    .line 100
    if-eq v4, v5, :cond_4

    .line 101
    .line 102
    iget-object v4, v3, Lx1/f0;->M:Lx1/j0;

    .line 103
    .line 104
    iget-object v4, v4, Lx1/j0;->p:Lx1/v0;

    .line 105
    .line 106
    invoke-virtual {v4}, Lx1/v0;->K0()V

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lx1/f0;->W(Lx1/f0;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    return-void
.end method

.method public final M(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-static {v1}, Lx1/k;->q(Lx1/f0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx1/r0;->M(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lx1/v0;->N0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p1}, Lv1/m0;->M(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final M0()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lx1/v0;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lx1/v0;->y:Z

    .line 7
    .line 8
    iget-object v1, p0, Lx1/v0;->l:Lx1/j0;

    .line 9
    .line 10
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 11
    .line 12
    iget-object v1, v1, Lx1/j0;->a:Lx1/f0;

    .line 13
    .line 14
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ly1/t;

    .line 19
    .line 20
    invoke-virtual {v2}, Ly1/t;->getRectManager()Lg2/b;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v1}, Lg2/b;->g(Lx1/f0;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, Lx1/f0;->L:Lx1/b1;

    .line 28
    .line 29
    iget-object v3, v2, Lx1/b1;->d:Lx1/i1;

    .line 30
    .line 31
    iget-object v2, v2, Lx1/b1;->c:Lx1/r;

    .line 32
    .line 33
    iget-object v2, v2, Lx1/i1;->v:Lx1/i1;

    .line 34
    .line 35
    :goto_0
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-virtual {v3}, Lx1/i1;->E1()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lx1/i1;->J1()V

    .line 47
    .line 48
    .line 49
    iget-object v3, v3, Lx1/i1;->v:Lx1/i1;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 57
    .line 58
    iget v1, v1, Lj0/b;->i:I

    .line 59
    .line 60
    :goto_1
    if-ge v0, v1, :cond_1

    .line 61
    .line 62
    aget-object v3, v2, v0

    .line 63
    .line 64
    check-cast v3, Lx1/f0;

    .line 65
    .line 66
    iget-object v3, v3, Lx1/f0;->M:Lx1/j0;

    .line 67
    .line 68
    iget-object v3, v3, Lx1/j0;->p:Lx1/v0;

    .line 69
    .line 70
    invoke-virtual {v3}, Lx1/v0;->M0()V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    return-void
.end method

.method public final N0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x7

    .line 7
    invoke-static {v1, v2, v3}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-object v2, v0, Lx1/f0;->I:Lx1/d0;

    .line 19
    .line 20
    sget-object v3, Lx1/d0;->i:Lx1/d0;

    .line 21
    .line 22
    if-ne v2, v3, :cond_2

    .line 23
    .line 24
    iget-object v2, v1, Lx1/f0;->M:Lx1/j0;

    .line 25
    .line 26
    iget-object v2, v2, Lx1/j0;->d:Lx1/b0;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v2, v3, :cond_0

    .line 36
    .line 37
    iget-object v1, v1, Lx1/f0;->I:Lx1/d0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v1, Lx1/d0;->h:Lx1/d0;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v1, Lx1/d0;->g:Lx1/d0;

    .line 44
    .line 45
    :goto_0
    iput-object v1, v0, Lx1/f0;->I:Lx1/d0;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final Q(J)Lv1/b1;
    .locals 5

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    iget-object v3, v1, Lx1/f0;->I:Lx1/d0;

    .line 8
    .line 9
    sget-object v4, Lx1/d0;->i:Lx1/d0;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lx1/f0;->e()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, Lx1/k;->q(Lx1/f0;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v4, v0, Lx1/r0;->p:Lx1/d0;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lx1/r0;->Q(J)Lv1/b1;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 39
    .line 40
    iget-object v1, p0, Lx1/v0;->r:Lx1/d0;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v1, v2, Lx1/f0;->K:Z

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 50
    .line 51
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v1, v0, Lx1/j0;->d:Lx1/b0;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-ne v1, v2, :cond_4

    .line 64
    .line 65
    sget-object v0, Lx1/d0;->h:Lx1/d0;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    const-string p1, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 69
    .line 70
    iget-object p2, v0, Lx1/j0;->d:Lx1/b0;

    .line 71
    .line 72
    invoke-static {p2, p1}, Lokio/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    return-object p1

    .line 77
    :cond_5
    sget-object v0, Lx1/d0;->g:Lx1/d0;

    .line 78
    .line 79
    :goto_1
    iput-object v0, p0, Lx1/v0;->r:Lx1/d0;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iput-object v4, p0, Lx1/v0;->r:Lx1/d0;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0, p1, p2}, Lx1/v0;->X0(J)Z

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final R0()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/v0;->L:Z

    .line 3
    .line 4
    iget-object v1, p0, Lx1/v0;->l:Lx1/j0;

    .line 5
    .line 6
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 7
    .line 8
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lx1/v0;->A()Lx1/r;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, Lx1/i1;->G:F

    .line 17
    .line 18
    iget-object v1, v1, Lx1/j0;->a:Lx1/f0;

    .line 19
    .line 20
    iget-object v4, v1, Lx1/f0;->L:Lx1/b1;

    .line 21
    .line 22
    iget-object v5, v4, Lx1/b1;->d:Lx1/i1;

    .line 23
    .line 24
    iget-object v4, v4, Lx1/b1;->c:Lx1/r;

    .line 25
    .line 26
    :goto_0
    if-eq v5, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v5, Lx1/x;

    .line 32
    .line 33
    iget v6, v5, Lx1/i1;->G:F

    .line 34
    .line 35
    add-float/2addr v3, v6

    .line 36
    iget-object v5, v5, Lx1/i1;->v:Lx1/i1;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, p0, Lx1/v0;->K:F

    .line 40
    .line 41
    cmpg-float v4, v3, v4

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iput v3, p0, Lx1/v0;->K:F

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2}, Lx1/f0;->O()V

    .line 51
    .line 52
    .line 53
    :cond_2
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Lx1/f0;->B()V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lx1/v0;->A()Lx1/r;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-boolean v3, v3, Lx1/n0;->q:Z

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-nez v3, :cond_8

    .line 66
    .line 67
    iget-boolean v3, p0, Lx1/v0;->y:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v5, p0, Lx1/v0;->D:Lx1/g0;

    .line 72
    .line 73
    invoke-virtual {v5}, Lx1/g0;->d()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-virtual {p0}, Lx1/v0;->K0()V

    .line 80
    .line 81
    .line 82
    :cond_5
    if-nez v3, :cond_7

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-virtual {v2}, Lx1/f0;->B()V

    .line 87
    .line 88
    .line 89
    :cond_6
    iget-boolean v1, p0, Lx1/v0;->m:Z

    .line 90
    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Lx1/f0;->U(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    iget-object v1, v1, Lx1/f0;->L:Lx1/b1;

    .line 100
    .line 101
    iget-object v1, v1, Lx1/b1;->c:Lx1/r;

    .line 102
    .line 103
    invoke-virtual {v1}, Lx1/i1;->C1()V

    .line 104
    .line 105
    .line 106
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 107
    .line 108
    iget-object v1, v2, Lx1/f0;->M:Lx1/j0;

    .line 109
    .line 110
    iget-boolean v2, p0, Lx1/v0;->m:Z

    .line 111
    .line 112
    if-nez v2, :cond_b

    .line 113
    .line 114
    iget-object v2, v1, Lx1/j0;->d:Lx1/b0;

    .line 115
    .line 116
    sget-object v3, Lx1/b0;->i:Lx1/b0;

    .line 117
    .line 118
    if-ne v2, v3, :cond_b

    .line 119
    .line 120
    iget v2, p0, Lx1/v0;->o:I

    .line 121
    .line 122
    const v3, 0x7fffffff

    .line 123
    .line 124
    .line 125
    if-ne v2, v3, :cond_9

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_9
    const-string v2, "Place was called on a node which was placed already"

    .line 129
    .line 130
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    iget v2, v1, Lx1/j0;->i:I

    .line 134
    .line 135
    iput v2, p0, Lx1/v0;->o:I

    .line 136
    .line 137
    add-int/2addr v2, v0

    .line 138
    iput v2, v1, Lx1/j0;->i:I

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_a
    iput v4, p0, Lx1/v0;->o:I

    .line 142
    .line 143
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lx1/v0;->h0()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final S0(JFLfg/l;Li1/b;)V
    .locals 8

    .line 1
    iget-object v6, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v6, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v1, v6, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    iget-boolean v0, v0, Lx1/f0;->W:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v0}, Lu1/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v0, Lx1/b0;->i:Lx1/b0;

    .line 17
    .line 18
    iput-object v0, v6, Lx1/j0;->d:Lx1/b0;

    .line 19
    .line 20
    iput-wide p1, p0, Lx1/v0;->s:J

    .line 21
    .line 22
    iput p3, p0, Lx1/v0;->v:F

    .line 23
    .line 24
    iput-object p4, p0, Lx1/v0;->t:Lfg/l;

    .line 25
    .line 26
    iput-object p5, p0, Lx1/v0;->u:Li1/b;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lx1/v0;->L:Z

    .line 30
    .line 31
    invoke-static {v1}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-boolean v3, p0, Lx1/v0;->B:Z

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iget-boolean v3, p0, Lx1/v0;->y:Z

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v6}, Lx1/j0;->a()Lx1/i1;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-wide v1, v0, Lv1/b1;->k:J

    .line 48
    .line 49
    invoke-static {p1, p2, v1, v2}, Lu2/j;->d(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    move v3, p3

    .line 54
    move-object v4, p4

    .line 55
    move-object v5, p5

    .line 56
    invoke-virtual/range {v0 .. v5}, Lx1/i1;->H1(JFLfg/l;Li1/b;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lx1/v0;->R0()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v7, p0, Lx1/v0;->D:Lx1/g0;

    .line 64
    .line 65
    iput-boolean v0, v7, Lx1/g0;->e:Z

    .line 66
    .line 67
    invoke-virtual {v6, v0}, Lx1/j0;->f(Z)V

    .line 68
    .line 69
    .line 70
    iput-object p4, p0, Lx1/v0;->M:Lfg/l;

    .line 71
    .line 72
    iput-wide p1, p0, Lx1/v0;->O:J

    .line 73
    .line 74
    iput p3, p0, Lx1/v0;->P:F

    .line 75
    .line 76
    iput-object p5, p0, Lx1/v0;->N:Li1/b;

    .line 77
    .line 78
    check-cast v2, Ly1/t;

    .line 79
    .line 80
    invoke-virtual {v2}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p2, p1, Lx1/t1;->f:Lx1/d;

    .line 85
    .line 86
    iget-object p1, p1, Lx1/t1;->a:Lw0/s;

    .line 87
    .line 88
    iget-object p3, p0, Lx1/v0;->Q:Lx1/u0;

    .line 89
    .line 90
    invoke-virtual {p1, v1, p2, p3}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    sget-object p1, Lx1/b0;->k:Lx1/b0;

    .line 94
    .line 95
    iput-object p1, v6, Lx1/j0;->d:Lx1/b0;

    .line 96
    .line 97
    invoke-virtual {v6}, Lx1/j0;->a()Lx1/i1;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-boolean p1, p1, Lx1/n0;->q:Z

    .line 102
    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    iget-boolean p1, v6, Lx1/j0;->k:Z

    .line 106
    .line 107
    if-nez p1, :cond_2

    .line 108
    .line 109
    iget-boolean p1, v6, Lx1/j0;->j:Z

    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    :cond_2
    invoke-virtual {p0}, Lx1/v0;->requestLayout()V

    .line 114
    .line 115
    .line 116
    :cond_3
    const/4 p1, 0x1

    .line 117
    iput-boolean p1, p0, Lx1/v0;->q:Z

    .line 118
    .line 119
    return-void
.end method

.method public final T0(JFLfg/l;Li1/b;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iput-boolean v3, p0, Lx1/v0;->z:Z

    .line 9
    .line 10
    iget-wide v4, p0, Lx1/v0;->s:J

    .line 11
    .line 12
    invoke-static {p1, p2, v4, v5}, Lu2/j;->b(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v4, p0, Lx1/v0;->t:Lfg/l;

    .line 20
    .line 21
    if-ne p4, v4, :cond_0

    .line 22
    .line 23
    iget-boolean v4, p0, Lx1/v0;->R:Z

    .line 24
    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    :goto_0
    iget-boolean v4, v0, Lx1/j0;->k:Z

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    iget-boolean v4, v0, Lx1/j0;->j:Z

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    iget-boolean v4, p0, Lx1/v0;->R:Z

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    :cond_1
    iput-boolean v3, p0, Lx1/v0;->B:Z

    .line 45
    .line 46
    iput-boolean v5, p0, Lx1/v0;->R:Z

    .line 47
    .line 48
    :cond_2
    iget-object v4, v0, Lx1/j0;->q:Lx1/r0;

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    iget-object v6, v4, Lx1/r0;->l:Lx1/j0;

    .line 53
    .line 54
    iget-object v4, v4, Lx1/r0;->w:Lx1/p0;

    .line 55
    .line 56
    sget-object v7, Lx1/p0;->i:Lx1/p0;

    .line 57
    .line 58
    if-ne v4, v7, :cond_4

    .line 59
    .line 60
    iget-object v4, v6, Lx1/j0;->a:Lx1/f0;

    .line 61
    .line 62
    invoke-static {v4}, Lx1/k;->q(Lx1/f0;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iput-boolean v3, v6, Lx1/j0;->c:Z

    .line 70
    .line 71
    :cond_4
    :goto_1
    iget-object v4, v0, Lx1/j0;->q:Lx1/r0;

    .line 72
    .line 73
    if-eqz v4, :cond_8

    .line 74
    .line 75
    invoke-virtual {v4}, Lx1/r0;->J0()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ne v4, v3, :cond_8

    .line 80
    .line 81
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v3, v3, Lx1/i1;->w:Lx1/i1;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    iget-object v3, v3, Lx1/n0;->r:Lv1/k0;

    .line 90
    .line 91
    if-nez v3, :cond_6

    .line 92
    .line 93
    :cond_5
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ly1/t;

    .line 98
    .line 99
    invoke-virtual {v3}, Ly1/t;->getPlacementScope()Lv1/a1;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_6
    iget-object v4, v0, Lx1/j0;->q:Lx1/r0;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-eqz v2, :cond_7

    .line 113
    .line 114
    iget-object v2, v2, Lx1/f0;->M:Lx1/j0;

    .line 115
    .line 116
    iput v5, v2, Lx1/j0;->h:I

    .line 117
    .line 118
    :cond_7
    const v2, 0x7fffffff

    .line 119
    .line 120
    .line 121
    iput v2, v4, Lx1/r0;->o:I

    .line 122
    .line 123
    const/16 v2, 0x20

    .line 124
    .line 125
    shr-long v5, p1, v2

    .line 126
    .line 127
    long-to-int v2, v5

    .line 128
    const-wide v5, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    and-long/2addr v5, p1

    .line 134
    long-to-int v5, v5

    .line 135
    invoke-static {v3, v4, v2, v5}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 136
    .line 137
    .line 138
    :cond_8
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 139
    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    iget-boolean v0, v0, Lx1/r0;->q:Z

    .line 143
    .line 144
    if-nez v0, :cond_9

    .line 145
    .line 146
    const-string v0, "Error: Placement happened before lookahead."

    .line 147
    .line 148
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    move-object v2, p0

    .line 152
    move-wide v3, p1

    .line 153
    move v5, p3

    .line 154
    move-object v6, p4

    .line 155
    move-object v7, p5

    .line 156
    invoke-virtual/range {v2 .. v7}, Lx1/v0;->S0(JFLfg/l;Li1/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :goto_2
    invoke-virtual {v1, p1}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    throw p1
.end method

.method public final X()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->x:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X0(J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Lx1/f0;->W:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Lu1/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-boolean v5, v2, Lx1/f0;->K:Z

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-boolean v4, v4, Lx1/f0;->K:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v6

    .line 44
    :goto_2
    iput-boolean v4, v2, Lx1/f0;->K:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lx1/f0;->q()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    iget-wide v4, p0, Lv1/b1;->j:J

    .line 53
    .line 54
    invoke-static {v4, v5, p1, p2}, Lu2/a;->b(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    check-cast v3, Ly1/t;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v7}, Ly1/t;->n(Lx1/f0;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lx1/f0;->X()V

    .line 67
    .line 68
    .line 69
    return v7

    .line 70
    :cond_4
    :goto_3
    iget-object v3, p0, Lx1/v0;->D:Lx1/g0;

    .line 71
    .line 72
    iput-boolean v7, v3, Lx1/g0;->d:Z

    .line 73
    .line 74
    invoke-virtual {v2}, Lx1/f0;->y()Lj0/b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v3, Lj0/b;->g:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v3, v3, Lj0/b;->i:I

    .line 81
    .line 82
    move v5, v7

    .line 83
    :goto_4
    if-ge v5, v3, :cond_5

    .line 84
    .line 85
    aget-object v8, v4, v5

    .line 86
    .line 87
    check-cast v8, Lx1/f0;

    .line 88
    .line 89
    iget-object v8, v8, Lx1/f0;->M:Lx1/j0;

    .line 90
    .line 91
    iget-object v8, v8, Lx1/j0;->p:Lx1/v0;

    .line 92
    .line 93
    iget-object v8, v8, Lx1/v0;->D:Lx1/g0;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_5
    iput-boolean v6, p0, Lx1/v0;->p:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-wide v3, v3, Lv1/b1;->i:J

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lv1/b1;->E0(J)V

    .line 110
    .line 111
    .line 112
    iget-object v5, v0, Lx1/j0;->d:Lx1/b0;

    .line 113
    .line 114
    sget-object v8, Lx1/b0;->k:Lx1/b0;

    .line 115
    .line 116
    if-ne v5, v8, :cond_6

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    const-string v5, "layout state is not idle before measure starts"

    .line 120
    .line 121
    invoke-static {v5}, Lu1/a;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_5
    iput-wide p1, p0, Lx1/v0;->H:J

    .line 125
    .line 126
    sget-object p1, Lx1/b0;->g:Lx1/b0;

    .line 127
    .line 128
    iput-object p1, v0, Lx1/j0;->d:Lx1/b0;

    .line 129
    .line 130
    iput-boolean v7, p0, Lx1/v0;->A:Z

    .line 131
    .line 132
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Ly1/t;

    .line 137
    .line 138
    invoke-virtual {p2}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget-object v5, p0, Lx1/v0;->I:Lx1/u0;

    .line 143
    .line 144
    iget-object v9, p2, Lx1/t1;->c:Lx1/d;

    .line 145
    .line 146
    iget-object p2, p2, Lx1/t1;->a:Lw0/s;

    .line 147
    .line 148
    invoke-virtual {p2, v2, v9, v5}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, v0, Lx1/j0;->d:Lx1/b0;

    .line 152
    .line 153
    if-ne p2, p1, :cond_7

    .line 154
    .line 155
    iput-boolean v6, p0, Lx1/v0;->B:Z

    .line 156
    .line 157
    iput-boolean v6, p0, Lx1/v0;->C:Z

    .line 158
    .line 159
    iput-object v8, v0, Lx1/j0;->d:Lx1/b0;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-wide p1, p1, Lv1/b1;->i:J

    .line 166
    .line 167
    invoke-static {p1, p2, v3, v4}, Lu2/l;->a(JJ)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget p1, p1, Lv1/b1;->g:I

    .line 178
    .line 179
    iget p2, p0, Lv1/b1;->g:I

    .line 180
    .line 181
    if-ne p1, p2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget p1, p1, Lv1/b1;->h:I

    .line 188
    .line 189
    iget p2, p0, Lv1/b1;->h:I

    .line 190
    .line 191
    if-eq p1, p2, :cond_8

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    move v6, v7

    .line 195
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget p1, p1, Lv1/b1;->g:I

    .line 200
    .line 201
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    iget p2, p2, Lv1/b1;->h:I

    .line 206
    .line 207
    int-to-long v2, p1

    .line 208
    const/16 p1, 0x20

    .line 209
    .line 210
    shl-long/2addr v2, p1

    .line 211
    int-to-long p1, p2

    .line 212
    const-wide v4, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    and-long/2addr p1, v4

    .line 218
    or-long/2addr p1, v2

    .line 219
    invoke-virtual {p0, p1, p2}, Lv1/b1;->C0(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    return v6

    .line 223
    :goto_7
    invoke-virtual {v1, p1}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    throw p1
.end method

.method public final Y0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lx1/f0;->H()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget v0, v0, Lx1/j0;->l:I

    .line 14
    .line 15
    if-lez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, v2, Lx1/f0;->M:Lx1/j0;

    .line 18
    .line 19
    iget-boolean v1, v0, Lx1/j0;->j:Z

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-boolean v1, v0, Lx1/j0;->k:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :cond_0
    iget-object v0, v0, Lx1/j0;->p:Lx1/v0;

    .line 29
    .line 30
    iget-boolean v0, v0, Lx1/v0;->B:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lx1/f0;->U(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2}, Lx1/f0;->y()Lj0/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 42
    .line 43
    iget v0, v0, Lj0/b;->i:I

    .line 44
    .line 45
    :goto_0
    if-ge v3, v0, :cond_2

    .line 46
    .line 47
    aget-object v2, v1, v3

    .line 48
    .line 49
    check-cast v2, Lx1/f0;

    .line 50
    .line 51
    iget-object v2, v2, Lx1/f0;->M:Lx1/j0;

    .line 52
    .line 53
    iget-object v2, v2, Lx1/j0;->p:Lx1/v0;

    .line 54
    .line 55
    invoke-virtual {v2}, Lx1/v0;->Y0()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public final c0(Lb1/f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx1/f0;->y()Lj0/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, v0, Lj0/b;->i:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    aget-object v3, v1, v2

    .line 17
    .line 18
    check-cast v3, Lx1/f0;

    .line 19
    .line 20
    iget-object v3, v3, Lx1/f0;->M:Lx1/j0;

    .line 21
    .line 22
    iget-object v3, v3, Lx1/j0;->p:Lx1/v0;

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Lb1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final e()Lx1/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->D:Lx1/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v1, v1, Lx1/n0;->o:Z

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-boolean p1, v0, Lx1/n0;->o:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lx1/v0;->R:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/v0;->G:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx1/v0;->D:Lx1/g0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/g0;->h()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lx1/v0;->B:Z

    .line 10
    .line 11
    iget-object v2, p0, Lx1/v0;->l:Lx1/j0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    iget-object v1, v2, Lx1/j0;->a:Lx1/f0;

    .line 17
    .line 18
    invoke-virtual {v1}, Lx1/f0;->y()Lj0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lj0/b;->i:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_4

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, Lx1/f0;

    .line 32
    .line 33
    invoke-virtual {v6}, Lx1/f0;->q()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v8, v6, Lx1/f0;->M:Lx1/j0;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    invoke-virtual {v6}, Lx1/f0;->r()Lx1/d0;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    sget-object v9, Lx1/d0;->g:Lx1/d0;

    .line 46
    .line 47
    if-ne v7, v9, :cond_3

    .line 48
    .line 49
    iget-object v7, v8, Lx1/j0;->p:Lx1/v0;

    .line 50
    .line 51
    iget-boolean v9, v7, Lx1/v0;->p:Z

    .line 52
    .line 53
    if-eqz v9, :cond_0

    .line 54
    .line 55
    iget-wide v9, v7, Lv1/b1;->j:J

    .line 56
    .line 57
    new-instance v7, Lu2/a;

    .line 58
    .line 59
    invoke-direct {v7, v9, v10}, Lu2/a;-><init>(J)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    const/4 v7, 0x0

    .line 64
    :goto_1
    if-eqz v7, :cond_2

    .line 65
    .line 66
    iget-object v9, v6, Lx1/f0;->I:Lx1/d0;

    .line 67
    .line 68
    sget-object v10, Lx1/d0;->i:Lx1/d0;

    .line 69
    .line 70
    if-ne v9, v10, :cond_1

    .line 71
    .line 72
    invoke-virtual {v6}, Lx1/f0;->e()V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object v6, v8, Lx1/j0;->p:Lx1/v0;

    .line 76
    .line 77
    iget-wide v7, v7, Lu2/a;->a:J

    .line 78
    .line 79
    invoke-virtual {v6, v7, v8}, Lx1/v0;->X0(J)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move v6, v3

    .line 85
    :goto_2
    if-eqz v6, :cond_3

    .line 86
    .line 87
    iget-object v6, v2, Lx1/j0;->a:Lx1/f0;

    .line 88
    .line 89
    const/4 v7, 0x7

    .line 90
    invoke-static {v6, v3, v7}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 91
    .line 92
    .line 93
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    iget-boolean v1, p0, Lx1/v0;->C:Z

    .line 97
    .line 98
    if-nez v1, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Lx1/v0;->A()Lx1/r;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-boolean v1, v1, Lx1/n0;->q:Z

    .line 105
    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    iget-boolean v1, p0, Lx1/v0;->B:Z

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    :cond_5
    iput-boolean v3, p0, Lx1/v0;->B:Z

    .line 113
    .line 114
    iget-object v1, v2, Lx1/j0;->d:Lx1/b0;

    .line 115
    .line 116
    sget-object v4, Lx1/b0;->i:Lx1/b0;

    .line 117
    .line 118
    iput-object v4, v2, Lx1/j0;->d:Lx1/b0;

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Lx1/j0;->g(Z)V

    .line 121
    .line 122
    .line 123
    iget-object v4, v2, Lx1/j0;->a:Lx1/f0;

    .line 124
    .line 125
    invoke-static {v4}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Ly1/t;

    .line 130
    .line 131
    invoke-virtual {v5}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget-object v6, v5, Lx1/t1;->e:Lx1/d;

    .line 136
    .line 137
    iget-object v5, v5, Lx1/t1;->a:Lw0/s;

    .line 138
    .line 139
    iget-object v7, p0, Lx1/v0;->J:Lx1/u0;

    .line 140
    .line 141
    invoke-virtual {v5, v4, v6, v7}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 142
    .line 143
    .line 144
    iput-object v1, v2, Lx1/j0;->d:Lx1/b0;

    .line 145
    .line 146
    iput-boolean v3, p0, Lx1/v0;->C:Z

    .line 147
    .line 148
    :cond_6
    iget-boolean v1, v0, Lx1/g0;->b:Z

    .line 149
    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, Lx1/g0;->e()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    invoke-virtual {v0}, Lx1/g0;->g()V

    .line 159
    .line 160
    .line 161
    :cond_7
    iput-boolean v3, p0, Lx1/v0;->G:Z

    .line 162
    .line 163
    return-void
.end method

.method public final j(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-static {v1}, Lx1/k;->q(Lx1/f0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx1/r0;->j(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lx1/v0;->N0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p1}, Lv1/m0;->j(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p0(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    invoke-static {v1}, Lx1/k;->q(Lx1/f0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx1/r0;->p0(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lx1/v0;->N0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p1}, Lv1/m0;->p0(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final r0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lv1/b1;->r0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final requestLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lx1/f0;->U(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final w0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/v0;->l:Lx1/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lv1/b1;->w0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
