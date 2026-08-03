.class public final Lx1/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lx1/f0;

.field public b:Z

.field public c:Z

.field public d:Lx1/b0;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Z

.field public n:Z

.field public o:I

.field public final p:Lx1/v0;

.field public q:Lx1/r0;


# direct methods
.method public constructor <init>(Lx1/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/j0;->a:Lx1/f0;

    .line 5
    .line 6
    sget-object p1, Lx1/b0;->k:Lx1/b0;

    .line 7
    .line 8
    iput-object p1, p0, Lx1/j0;->d:Lx1/b0;

    .line 9
    .line 10
    new-instance p1, Lx1/v0;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lx1/v0;-><init>(Lx1/j0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lx1/j0;->p:Lx1/v0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lx1/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/j0;->a:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/b1;->d:Lx1/i1;

    .line 6
    .line 7
    return-object v0
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/j0;->a:Lx1/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 4
    .line 5
    iget-object v0, v0, Lx1/j0;->d:Lx1/b0;

    .line 6
    .line 7
    sget-object v1, Lx1/b0;->i:Lx1/b0;

    .line 8
    .line 9
    sget-object v2, Lx1/b0;->j:Lx1/b0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    if-ne v0, v2, :cond_2

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lx1/j0;->p:Lx1/v0;

    .line 17
    .line 18
    iget-boolean v1, v1, Lx1/v0;->G:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lx1/j0;->g(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, v3}, Lx1/j0;->f(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    if-ne v0, v2, :cond_4

    .line 30
    .line 31
    iget-object v0, p0, Lx1/j0;->q:Lx1/r0;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-boolean v0, v0, Lx1/r0;->A:Z

    .line 36
    .line 37
    if-ne v0, v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Lx1/j0;->i(Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    invoke-virtual {p0, v3}, Lx1/j0;->h(Z)V

    .line 44
    .line 45
    .line 46
    :cond_4
    return-void
.end method

.method public final c(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/j0;->q:Lx1/r0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 6
    .line 7
    sget-object v2, Lx1/b0;->h:Lx1/b0;

    .line 8
    .line 9
    iput-object v2, v1, Lx1/j0;->d:Lx1/b0;

    .line 10
    .line 11
    iget-object v2, v1, Lx1/j0;->a:Lx1/f0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    iput-boolean v3, v1, Lx1/j0;->e:Z

    .line 15
    .line 16
    iput-wide p1, v0, Lx1/r0;->E:J

    .line 17
    .line 18
    invoke-static {v2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ly1/t;

    .line 23
    .line 24
    invoke-virtual {p1}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p2, v0, Lx1/r0;->F:Lx1/q0;

    .line 29
    .line 30
    iget-object v0, p1, Lx1/t1;->b:Lx1/d;

    .line 31
    .line 32
    iget-object p1, p1, Lx1/t1;->a:Lw0/s;

    .line 33
    .line 34
    invoke-virtual {p1, v2, v0, p2}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    iput-boolean p1, v1, Lx1/j0;->f:Z

    .line 39
    .line 40
    iput-boolean p1, v1, Lx1/j0;->g:Z

    .line 41
    .line 42
    invoke-static {v2}, Lx1/k;->q(Lx1/f0;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget-object v0, v1, Lx1/j0;->p:Lx1/v0;

    .line 47
    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    iput-boolean p1, v0, Lx1/v0;->B:Z

    .line 51
    .line 52
    iput-boolean p1, v0, Lx1/v0;->C:Z

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput-boolean p1, v0, Lx1/v0;->A:Z

    .line 56
    .line 57
    :goto_0
    sget-object p1, Lx1/b0;->k:Lx1/b0;

    .line 58
    .line 59
    iput-object p1, v1, Lx1/j0;->d:Lx1/b0;

    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    iget v0, p0, Lx1/j0;->l:I

    .line 2
    .line 3
    iput p1, p0, Lx1/j0;->l:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_1
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    iget-object v0, p0, Lx1/j0;->a:Lx1/f0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_1
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget v1, v0, Lx1/j0;->l:I

    .line 32
    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lx1/j0;->d(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    add-int/2addr v1, v2

    .line 42
    invoke-virtual {v0, v1}, Lx1/j0;->d(I)V

    .line 43
    .line 44
    .line 45
    :cond_4
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget v0, p0, Lx1/j0;->o:I

    .line 2
    .line 3
    iput p1, p0, Lx1/j0;->o:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_1
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    iget-object v0, p0, Lx1/j0;->a:Lx1/f0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lx1/f0;->u()Lx1/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, v0, Lx1/f0;->M:Lx1/j0;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_1
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget v1, v0, Lx1/j0;->o:I

    .line 32
    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lx1/j0;->e(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    add-int/2addr v1, v2

    .line 42
    invoke-virtual {v0, v1}, Lx1/j0;->e(I)V

    .line 43
    .line 44
    .line 45
    :cond_4
    return-void
.end method

.method public final f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx1/j0;->k:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lx1/j0;->k:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lx1/j0;->j:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lx1/j0;->l:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lx1/j0;->d(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lx1/j0;->j:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lx1/j0;->l:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lx1/j0;->d(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx1/j0;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lx1/j0;->j:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lx1/j0;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lx1/j0;->l:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lx1/j0;->d(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lx1/j0;->k:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lx1/j0;->l:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lx1/j0;->d(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final h(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx1/j0;->n:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lx1/j0;->n:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lx1/j0;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lx1/j0;->o:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lx1/j0;->e(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lx1/j0;->m:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lx1/j0;->o:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lx1/j0;->e(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final i(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx1/j0;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lx1/j0;->m:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lx1/j0;->n:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lx1/j0;->o:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lx1/j0;->e(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lx1/j0;->n:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lx1/j0;->o:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lx1/j0;->e(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx1/j0;->p:Lx1/v0;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/v0;->l:Lx1/j0;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/v0;->x:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    iget-object v4, p0, Lx1/j0;->a:Lx1/f0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lx1/i1;->X()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v2, v0, Lx1/v0;->w:Z

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iput-boolean v5, v0, Lx1/v0;->w:Z

    .line 30
    .line 31
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lx1/i1;->X()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, v0, Lx1/v0;->x:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v4}, Lx1/f0;->u()Lx1/f0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {v0, v5, v3}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    iget-object v0, p0, Lx1/j0;->q:Lx1/r0;

    .line 51
    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    iget-object v1, v0, Lx1/r0;->l:Lx1/j0;

    .line 55
    .line 56
    iget-object v2, v0, Lx1/r0;->D:Ljava/lang/Object;

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Lx1/i1;->p1()Lx1/o0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v2, v2, Lx1/o0;->u:Lx1/i1;

    .line 72
    .line 73
    invoke-virtual {v2}, Lx1/i1;->X()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    iget-boolean v2, v0, Lx1/r0;->C:Z

    .line 81
    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    iput-boolean v5, v0, Lx1/r0;->C:Z

    .line 86
    .line 87
    invoke-virtual {v1}, Lx1/j0;->a()Lx1/i1;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lx1/i1;->p1()Lx1/o0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v1, v1, Lx1/o0;->u:Lx1/i1;

    .line 99
    .line 100
    invoke-virtual {v1}, Lx1/i1;->X()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, v0, Lx1/r0;->D:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v4}, Lx1/k;->q(Lx1/f0;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    invoke-virtual {v4}, Lx1/f0;->u()Lx1/f0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    invoke-static {v0, v5, v3}, Lx1/f0;->V(Lx1/f0;ZI)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_5
    invoke-virtual {v4}, Lx1/f0;->u()Lx1/f0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-static {v0, v5, v3}, Lx1/f0;->T(Lx1/f0;ZI)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_1
    return-void
.end method
