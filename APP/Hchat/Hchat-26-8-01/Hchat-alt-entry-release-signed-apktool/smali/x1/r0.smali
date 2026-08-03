.class public final Lx1/r0;
.super Lv1/b1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/m0;
.implements Lx1/a;
.implements Lx1/y0;


# instance fields
.field public A:Z

.field public final B:Lx1/q0;

.field public C:Z

.field public D:Ljava/lang/Object;

.field public E:J

.field public final F:Lx1/q0;

.field public final G:Lx1/q0;

.field public H:Z

.field public final l:Lx1/j0;

.field public m:Z

.field public n:I

.field public o:I

.field public p:Lx1/d0;

.field public q:Z

.field public r:Z

.field public s:Lu2/a;

.field public t:J

.field public u:Lfg/l;

.field public v:Li1/b;

.field public w:Lx1/p0;

.field public final x:Lx1/g0;

.field public final y:Lj0/b;

.field public z:Z


# direct methods
.method public constructor <init>(Lx1/j0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lv1/b1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/r0;->l:Lx1/j0;

    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput v0, p0, Lx1/r0;->n:I

    .line 10
    .line 11
    iput v0, p0, Lx1/r0;->o:I

    .line 12
    .line 13
    sget-object v0, Lx1/d0;->i:Lx1/d0;

    .line 14
    .line 15
    iput-object v0, p0, Lx1/r0;->p:Lx1/d0;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lx1/r0;->t:J

    .line 20
    .line 21
    sget-object v0, Lx1/p0;->i:Lx1/p0;

    .line 22
    .line 23
    iput-object v0, p0, Lx1/r0;->w:Lx1/p0;

    .line 24
    .line 25
    new-instance v0, Lx1/g0;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, Lx1/g0;-><init>(Lx1/a;I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lx1/r0;->x:Lx1/g0;

    .line 32
    .line 33
    new-instance v0, Lj0/b;

    .line 34
    .line 35
    const/16 v1, 0x10

    .line 36
    .line 37
    new-array v1, v1, [Lx1/r0;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lx1/r0;->y:Lj0/b;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lx1/r0;->z:Z

    .line 46
    .line 47
    new-instance v1, Lx1/q0;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v1, p0, v2}, Lx1/q0;-><init>(Lx1/r0;I)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lx1/r0;->B:Lx1/q0;

    .line 54
    .line 55
    iput-boolean v0, p0, Lx1/r0;->C:Z

    .line 56
    .line 57
    iget-object p1, p1, Lx1/j0;->p:Lx1/v0;

    .line 58
    .line 59
    iget-object p1, p1, Lx1/v0;->x:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object p1, p0, Lx1/r0;->D:Ljava/lang/Object;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    const/16 v0, 0xf

    .line 65
    .line 66
    invoke-static {p1, p1, p1, p1, v0}, Lu2/b;->b(IIIII)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    iput-wide v0, p0, Lx1/r0;->E:J

    .line 71
    .line 72
    new-instance p1, Lx1/q0;

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    invoke-direct {p1, p0, v0}, Lx1/q0;-><init>(Lx1/r0;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lx1/r0;->F:Lx1/q0;

    .line 79
    .line 80
    new-instance p1, Lx1/q0;

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    invoke-direct {p1, p0, v0}, Lx1/q0;-><init>(Lx1/r0;I)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lx1/r0;->G:Lx1/q0;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final A()Lx1/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

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
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p4, p3}, Lx1/r0;->T0(JLfg/l;Li1/b;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final B()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

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
    iget-object v0, v0, Lx1/j0;->q:Lx1/r0;

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
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lx1/r0;->T0(JLfg/l;Li1/b;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final G(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/r0;->R0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx1/i1;->p1()Lx1/o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lv1/m0;->G(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Lx1/r0;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final J0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

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
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, v0, Lx1/j0;->c:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public final K0(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lx1/r0;->J0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lx1/r0;->J0()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object p1, Lx1/p0;->i:Lx1/p0;

    .line 19
    .line 20
    iput-object p1, p0, Lx1/r0;->w:Lx1/p0;

    .line 21
    .line 22
    iget-object p1, p0, Lx1/r0;->l:Lx1/j0;

    .line 23
    .line 24
    iget-object p1, p1, Lx1/j0;->a:Lx1/f0;

    .line 25
    .line 26
    invoke-virtual {p1}, Lx1/f0;->y()Lj0/b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p1, Lj0/b;->g:[Ljava/lang/Object;

    .line 31
    .line 32
    iget p1, p1, Lj0/b;->i:I

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, p1, :cond_2

    .line 36
    .line 37
    aget-object v2, v0, v1

    .line 38
    .line 39
    check-cast v2, Lx1/f0;

    .line 40
    .line 41
    iget-object v2, v2, Lx1/f0;->M:Lx1/j0;

    .line 42
    .line 43
    iget-object v2, v2, Lx1/j0;->q:Lx1/r0;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-virtual {v2, v3}, Lx1/r0;->K0(Z)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public final M(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/r0;->R0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx1/i1;->p1()Lx1/o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lv1/m0;->M(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final M0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lx1/r0;->w:Lx1/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/r0;->l:Lx1/j0;

    .line 4
    .line 5
    iget-boolean v2, v1, Lx1/j0;->c:Z

    .line 6
    .line 7
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 8
    .line 9
    sget-object v4, Lx1/p0;->g:Lx1/p0;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Lx1/p0;->h:Lx1/p0;

    .line 14
    .line 15
    iput-object v2, p0, Lx1/r0;->w:Lx1/p0;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object v4, p0, Lx1/r0;->w:Lx1/p0;

    .line 19
    .line 20
    :goto_0
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    iget-boolean v0, v1, Lx1/j0;->e:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-static {v3, v1, v0}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 36
    .line 37
    iget v0, v0, Lj0/b;->i:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_1
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    aget-object v3, v1, v2

    .line 43
    .line 44
    check-cast v3, Lx1/f0;

    .line 45
    .line 46
    iget-object v4, v3, Lx1/f0;->M:Lx1/j0;

    .line 47
    .line 48
    iget-object v4, v4, Lx1/j0;->q:Lx1/r0;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    iget v5, v4, Lx1/r0;->o:I

    .line 53
    .line 54
    const v6, 0x7fffffff

    .line 55
    .line 56
    .line 57
    if-eq v5, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v4}, Lx1/r0;->M0()V

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Lx1/f0;->W(Lx1/f0;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const-string v0, "Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope."

    .line 69
    .line 70
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public final N0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget v1, v0, Lx1/j0;->o:I

    .line 4
    .line 5
    if-lez v1, :cond_3

    .line 6
    .line 7
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lx1/f0;->y()Lj0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, Lj0/b;->i:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_3

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, Lx1/f0;

    .line 24
    .line 25
    iget-object v5, v4, Lx1/f0;->M:Lx1/j0;

    .line 26
    .line 27
    iget-boolean v6, v5, Lx1/j0;->m:Z

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    iget-boolean v6, v5, Lx1/j0;->n:Z

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    :cond_0
    iget-boolean v6, v5, Lx1/j0;->f:Z

    .line 36
    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Lx1/f0;->S(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v4, v5, Lx1/j0;->q:Lx1/r0;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v4}, Lx1/r0;->N0()V

    .line 47
    .line 48
    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method

.method public final Q(J)Lv1/b1;
    .locals 5

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lx1/f0;->M:Lx1/j0;

    .line 15
    .line 16
    iget-object v1, v1, Lx1/j0;->d:Lx1/b0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v3

    .line 20
    :goto_0
    sget-object v4, Lx1/b0;->h:Lx1/b0;

    .line 21
    .line 22
    if-eq v1, v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Lx1/f0;->M:Lx1/j0;

    .line 31
    .line 32
    iget-object v3, v1, Lx1/j0;->d:Lx1/b0;

    .line 33
    .line 34
    :cond_1
    sget-object v1, Lx1/b0;->j:Lx1/b0;

    .line 35
    .line 36
    if-ne v3, v1, :cond_3

    .line 37
    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, v0, Lx1/j0;->b:Z

    .line 40
    .line 41
    :cond_3
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lx1/d0;->i:Lx1/d0;

    .line 46
    .line 47
    if-eqz v0, :cond_9

    .line 48
    .line 49
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 50
    .line 51
    iget-object v3, p0, Lx1/r0;->p:Lx1/d0;

    .line 52
    .line 53
    if-eq v3, v1, :cond_5

    .line 54
    .line 55
    iget-boolean v3, v2, Lx1/f0;->K:Z

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    const-string v3, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 61
    .line 62
    invoke-static {v3}, Lu1/a;->b(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_1
    iget-object v3, v0, Lx1/j0;->d:Lx1/b0;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_8

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    if-eq v3, v4, :cond_8

    .line 75
    .line 76
    const/4 v4, 0x2

    .line 77
    if-eq v3, v4, :cond_7

    .line 78
    .line 79
    const/4 v4, 0x3

    .line 80
    if-ne v3, v4, :cond_6

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_6
    const-string p1, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 84
    .line 85
    iget-object p2, v0, Lx1/j0;->d:Lx1/b0;

    .line 86
    .line 87
    invoke-static {p2, p1}, Lokio/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    return-object p1

    .line 92
    :cond_7
    :goto_2
    sget-object v0, Lx1/d0;->h:Lx1/d0;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_8
    sget-object v0, Lx1/d0;->g:Lx1/d0;

    .line 96
    .line 97
    :goto_3
    iput-object v0, p0, Lx1/r0;->p:Lx1/d0;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_9
    iput-object v1, p0, Lx1/r0;->p:Lx1/d0;

    .line 101
    .line 102
    :goto_4
    iget-object v0, v2, Lx1/f0;->I:Lx1/d0;

    .line 103
    .line 104
    if-ne v0, v1, :cond_a

    .line 105
    .line 106
    invoke-virtual {v2}, Lx1/f0;->e()V

    .line 107
    .line 108
    .line 109
    :cond_a
    invoke-virtual {p0, p1, p2}, Lx1/r0;->X0(J)Z

    .line 110
    .line 111
    .line 112
    return-object p0
.end method

.method public final R0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x7

    .line 7
    invoke-static {v1, v2, v3}, Lx1/f0;->T(Lx1/f0;ZI)V

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

.method public final S0()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/r0;->H:Z

    .line 3
    .line 4
    iget-object v1, p0, Lx1/r0;->l:Lx1/j0;

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
    iget-object v3, p0, Lx1/r0;->w:Lx1/p0;

    .line 13
    .line 14
    sget-object v4, Lx1/p0;->g:Lx1/p0;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    iget-boolean v4, v1, Lx1/j0;->c:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    sget-object v4, Lx1/p0;->h:Lx1/p0;

    .line 24
    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    iget-boolean v1, v1, Lx1/j0;->c:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Lx1/r0;->M0()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, Lx1/r0;->m:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2, v5}, Lx1/f0;->S(Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    if-eqz v2, :cond_5

    .line 44
    .line 45
    iget-object v1, v2, Lx1/f0;->M:Lx1/j0;

    .line 46
    .line 47
    iget-boolean v2, p0, Lx1/r0;->m:Z

    .line 48
    .line 49
    if-nez v2, :cond_6

    .line 50
    .line 51
    iget-object v2, v1, Lx1/j0;->d:Lx1/b0;

    .line 52
    .line 53
    sget-object v3, Lx1/b0;->i:Lx1/b0;

    .line 54
    .line 55
    if-eq v2, v3, :cond_3

    .line 56
    .line 57
    sget-object v3, Lx1/b0;->j:Lx1/b0;

    .line 58
    .line 59
    if-ne v2, v3, :cond_6

    .line 60
    .line 61
    :cond_3
    iget v2, p0, Lx1/r0;->o:I

    .line 62
    .line 63
    const v3, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v2, v3, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-string v2, "Place was called on a node which was placed already"

    .line 70
    .line 71
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget v2, v1, Lx1/j0;->h:I

    .line 75
    .line 76
    iput v2, p0, Lx1/r0;->o:I

    .line 77
    .line 78
    add-int/2addr v2, v0

    .line 79
    iput v2, v1, Lx1/j0;->h:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    iput v5, p0, Lx1/r0;->o:I

    .line 83
    .line 84
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lx1/r0;->h0()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final T0(JLfg/l;Li1/b;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/j0;->a:Lx1/f0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    iget-object v4, v4, Lx1/f0;->M:Lx1/j0;

    .line 15
    .line 16
    iget-object v4, v4, Lx1/j0;->d:Lx1/b0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v4, v3

    .line 20
    :goto_0
    sget-object v5, Lx1/b0;->j:Lx1/b0;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    if-ne v4, v5, :cond_1

    .line 24
    .line 25
    iput-boolean v6, v0, Lx1/j0;->c:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_1
    :goto_1
    iget-boolean v4, v2, Lx1/f0;->W:Z

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    const-string v4, "place is called on a deactivated node"

    .line 36
    .line 37
    invoke-static {v4}, Lu1/a;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iput-object v5, v0, Lx1/j0;->d:Lx1/b0;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    iput-boolean v4, p0, Lx1/r0;->q:Z

    .line 44
    .line 45
    iput-boolean v6, p0, Lx1/r0;->H:Z

    .line 46
    .line 47
    iget-wide v7, p0, Lx1/r0;->t:J

    .line 48
    .line 49
    invoke-static {p1, p2, v7, v8}, Lu2/j;->b(JJ)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_5

    .line 54
    .line 55
    iget-boolean v5, v0, Lx1/j0;->n:Z

    .line 56
    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    iget-boolean v5, v0, Lx1/j0;->m:Z

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    :cond_3
    iput-boolean v4, v0, Lx1/j0;->f:Z

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p0}, Lx1/r0;->N0()V

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iput-wide p1, p0, Lx1/r0;->t:J

    .line 73
    .line 74
    iget-boolean v7, v0, Lx1/j0;->f:Z

    .line 75
    .line 76
    if-nez v7, :cond_7

    .line 77
    .line 78
    iget-object v7, p0, Lx1/r0;->w:Lx1/p0;

    .line 79
    .line 80
    sget-object v8, Lx1/p0;->i:Lx1/p0;

    .line 81
    .line 82
    if-eq v7, v8, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    move v4, v6

    .line 86
    :goto_2
    if-eqz v4, :cond_7

    .line 87
    .line 88
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lx1/i1;->p1()Lx1/o0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-wide v4, v2, Lv1/b1;->k:J

    .line 100
    .line 101
    invoke-static {p1, p2, v4, v5}, Lu2/j;->d(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide p1

    .line 105
    invoke-virtual {v2, p1, p2}, Lx1/o0;->i1(J)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lx1/r0;->S0()V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    invoke-virtual {v0, v6}, Lx1/j0;->h(Z)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lx1/r0;->x:Lx1/g0;

    .line 116
    .line 117
    iput-boolean v6, p1, Lx1/g0;->e:Z

    .line 118
    .line 119
    check-cast v5, Ly1/t;

    .line 120
    .line 121
    invoke-virtual {v5}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object p2, p0, Lx1/r0;->G:Lx1/q0;

    .line 126
    .line 127
    iget-object v4, p1, Lx1/t1;->g:Lx1/d;

    .line 128
    .line 129
    iget-object p1, p1, Lx1/t1;->a:Lw0/s;

    .line 130
    .line 131
    invoke-virtual {p1, v2, v4, p2}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    iput-object p3, p0, Lx1/r0;->u:Lfg/l;

    .line 135
    .line 136
    iput-object p4, p0, Lx1/r0;->v:Li1/b;

    .line 137
    .line 138
    sget-object p1, Lx1/b0;->k:Lx1/b0;

    .line 139
    .line 140
    iput-object p1, v0, Lx1/j0;->d:Lx1/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    return-void

    .line 143
    :goto_4
    invoke-virtual {v1, p1}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw v3
.end method

.method public final X()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/r0;->D:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X0(J)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

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
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v2}, Lx1/f0;->u()Lx1/f0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-boolean v4, v2, Lx1/f0;->K:Z

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v3, Lx1/f0;->K:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v6

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_1
    move v3, v5

    .line 40
    :goto_2
    iput-boolean v3, v2, Lx1/f0;->K:Z

    .line 41
    .line 42
    iget-object v3, v2, Lx1/f0;->M:Lx1/j0;

    .line 43
    .line 44
    iget-boolean v3, v3, Lx1/j0;->e:Z

    .line 45
    .line 46
    if-nez v3, :cond_6

    .line 47
    .line 48
    iget-object v3, p0, Lx1/r0;->s:Lu2/a;

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    move v3, v6

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    iget-wide v3, v3, Lu2/a;->a:J

    .line 55
    .line 56
    invoke-static {v3, v4, p1, p2}, Lu2/a;->b(JJ)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    :goto_3
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    iget-object p1, v2, Lx1/f0;->t:Lx1/r1;

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    check-cast p1, Ly1/t;

    .line 68
    .line 69
    invoke-virtual {p1, v2, v5}, Ly1/t;->n(Lx1/f0;Z)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v2}, Lx1/f0;->X()V

    .line 73
    .line 74
    .line 75
    return v6

    .line 76
    :cond_6
    :goto_4
    new-instance v3, Lu2/a;

    .line 77
    .line 78
    invoke-direct {v3, p1, p2}, Lu2/a;-><init>(J)V

    .line 79
    .line 80
    .line 81
    iput-object v3, p0, Lx1/r0;->s:Lu2/a;

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, Lv1/b1;->E0(J)V

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Lx1/r0;->x:Lx1/g0;

    .line 87
    .line 88
    iput-boolean v6, v3, Lx1/g0;->d:Z

    .line 89
    .line 90
    invoke-virtual {v2}, Lx1/f0;->y()Lj0/b;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v3, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 95
    .line 96
    iget v2, v2, Lj0/b;->i:I

    .line 97
    .line 98
    move v4, v6

    .line 99
    :goto_5
    if-ge v4, v2, :cond_7

    .line 100
    .line 101
    aget-object v7, v3, v4

    .line 102
    .line 103
    check-cast v7, Lx1/f0;

    .line 104
    .line 105
    iget-object v7, v7, Lx1/f0;->M:Lx1/j0;

    .line 106
    .line 107
    iget-object v7, v7, Lx1/j0;->q:Lx1/r0;

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v7, v7, Lx1/r0;->x:Lx1/g0;

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    iget-boolean v2, p0, Lx1/r0;->r:Z

    .line 121
    .line 122
    const-wide v3, 0xffffffffL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    const/16 v7, 0x20

    .line 128
    .line 129
    if-eqz v2, :cond_8

    .line 130
    .line 131
    iget-wide v8, p0, Lv1/b1;->i:J

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_8
    const/high16 v2, -0x80000000

    .line 135
    .line 136
    int-to-long v8, v2

    .line 137
    shl-long v10, v8, v7

    .line 138
    .line 139
    and-long/2addr v8, v3

    .line 140
    or-long/2addr v8, v10

    .line 141
    :goto_6
    iput-boolean v5, p0, Lx1/r0;->r:Z

    .line 142
    .line 143
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Lx1/i1;->p1()Lx1/o0;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v2, :cond_9

    .line 152
    .line 153
    move v10, v5

    .line 154
    goto :goto_7

    .line 155
    :cond_9
    move v10, v6

    .line 156
    :goto_7
    if-nez v10, :cond_a

    .line 157
    .line 158
    const-string v10, "Lookahead result from lookaheadRemeasure cannot be null"

    .line 159
    .line 160
    invoke-static {v10}, Lu1/a;->b(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_a
    invoke-virtual {v0, p1, p2}, Lx1/j0;->c(J)V

    .line 164
    .line 165
    .line 166
    iget p1, v2, Lv1/b1;->g:I

    .line 167
    .line 168
    iget p2, v2, Lv1/b1;->h:I

    .line 169
    .line 170
    int-to-long v10, p1

    .line 171
    shl-long/2addr v10, v7

    .line 172
    int-to-long p1, p2

    .line 173
    and-long/2addr p1, v3

    .line 174
    or-long/2addr p1, v10

    .line 175
    invoke-virtual {p0, p1, p2}, Lv1/b1;->C0(J)V

    .line 176
    .line 177
    .line 178
    shr-long p1, v8, v7

    .line 179
    .line 180
    long-to-int p1, p1

    .line 181
    iget p2, v2, Lv1/b1;->g:I

    .line 182
    .line 183
    if-ne p1, p2, :cond_c

    .line 184
    .line 185
    and-long p1, v8, v3

    .line 186
    .line 187
    long-to-int p1, p1

    .line 188
    iget p2, v2, Lv1/b1;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    if-eq p1, p2, :cond_b

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_b
    return v6

    .line 194
    :cond_c
    :goto_8
    return v5

    .line 195
    :goto_9
    invoke-virtual {v1, p1}, Lx1/f0;->Y(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    const/4 p1, 0x0

    .line 199
    throw p1
.end method

.method public final c0(Lb1/f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

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
    iget-object v3, v3, Lx1/j0;->q:Lx1/r0;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v3}, Lb1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public final e()Lx1/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/r0;->x:Lx1/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lx1/i1;->p1()Lx1/o0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v1, Lx1/n0;->o:Z

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lx1/i1;->p1()Lx1/o0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iput-boolean p1, v0, Lx1/n0;->o:Z

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final h0()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/r0;->A:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx1/r0;->x:Lx1/g0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/g0;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lx1/r0;->l:Lx1/j0;

    .line 10
    .line 11
    iget-boolean v2, v1, Lx1/j0;->f:Z

    .line 12
    .line 13
    iget-object v3, v1, Lx1/j0;->a:Lx1/f0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3}, Lx1/f0;->y()Lj0/b;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v5, v2, Lj0/b;->g:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v2, v2, Lj0/b;->i:I

    .line 25
    .line 26
    move v6, v4

    .line 27
    :goto_0
    if-ge v6, v2, :cond_2

    .line 28
    .line 29
    aget-object v7, v5, v6

    .line 30
    .line 31
    check-cast v7, Lx1/f0;

    .line 32
    .line 33
    iget-object v8, v7, Lx1/f0;->M:Lx1/j0;

    .line 34
    .line 35
    iget-boolean v9, v8, Lx1/j0;->e:Z

    .line 36
    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    invoke-virtual {v7}, Lx1/f0;->s()Lx1/d0;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v9, Lx1/d0;->g:Lx1/d0;

    .line 44
    .line 45
    if-ne v7, v9, :cond_1

    .line 46
    .line 47
    iget-object v7, v8, Lx1/j0;->q:Lx1/r0;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v8, v8, Lx1/j0;->q:Lx1/r0;

    .line 53
    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    iget-object v8, v8, Lx1/r0;->s:Lu2/a;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v8, 0x0

    .line 60
    :goto_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-wide v8, v8, Lu2/a;->a:J

    .line 64
    .line 65
    invoke-virtual {v7, v8, v9}, Lx1/r0;->X0(J)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    const/4 v7, 0x7

    .line 72
    invoke-static {v3, v4, v7}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 73
    .line 74
    .line 75
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p0}, Lx1/r0;->A()Lx1/r;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v2, v2, Lx1/r;->Z:Lx1/q;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-boolean v5, v1, Lx1/j0;->g:Z

    .line 88
    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    iget-boolean v5, v2, Lx1/n0;->q:Z

    .line 92
    .line 93
    if-nez v5, :cond_5

    .line 94
    .line 95
    iget-boolean v5, v1, Lx1/j0;->f:Z

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    :cond_3
    iput-boolean v4, v1, Lx1/j0;->f:Z

    .line 100
    .line 101
    iget-object v5, v1, Lx1/j0;->d:Lx1/b0;

    .line 102
    .line 103
    sget-object v6, Lx1/b0;->j:Lx1/b0;

    .line 104
    .line 105
    iput-object v6, v1, Lx1/j0;->d:Lx1/b0;

    .line 106
    .line 107
    invoke-virtual {v1, v4}, Lx1/j0;->i(Z)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Ly1/t;

    .line 115
    .line 116
    invoke-virtual {v6}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v7, v6, Lx1/t1;->h:Lx1/d;

    .line 121
    .line 122
    iget-object v6, v6, Lx1/t1;->a:Lw0/s;

    .line 123
    .line 124
    iget-object v8, p0, Lx1/r0;->B:Lx1/q0;

    .line 125
    .line 126
    invoke-virtual {v6, v3, v7, v8}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 127
    .line 128
    .line 129
    iput-object v5, v1, Lx1/j0;->d:Lx1/b0;

    .line 130
    .line 131
    iget-boolean v3, v1, Lx1/j0;->m:Z

    .line 132
    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    iget-boolean v2, v2, Lx1/n0;->q:Z

    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0}, Lx1/r0;->requestLayout()V

    .line 140
    .line 141
    .line 142
    :cond_4
    iput-boolean v4, v1, Lx1/j0;->g:Z

    .line 143
    .line 144
    :cond_5
    iget-boolean v1, v0, Lx1/g0;->b:Z

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {v0}, Lx1/g0;->e()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    invoke-virtual {v0}, Lx1/g0;->g()V

    .line 155
    .line 156
    .line 157
    :cond_6
    iput-boolean v4, p0, Lx1/r0;->A:Z

    .line 158
    .line 159
    return-void
.end method

.method public final j(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/r0;->R0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx1/i1;->p1()Lx1/o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lv1/m0;->j(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/r0;->R0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx1/j0;->a()Lx1/i1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx1/i1;->p1()Lx1/o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1}, Lv1/m0;->p0(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final requestLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/r0;->l:Lx1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/j0;->a:Lx1/f0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lx1/f0;->S(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
