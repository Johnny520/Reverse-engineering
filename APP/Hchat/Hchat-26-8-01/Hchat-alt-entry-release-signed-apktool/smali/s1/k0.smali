.class public final Ls1/k0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lu2/c;
.implements Lwf/c;


# instance fields
.field public final synthetic g:Ls1/l0;

.field public final h:Lqg/g;

.field public i:Lqg/g;

.field public j:Ls1/l;

.field public final k:Lwf/h;

.field public final synthetic l:Ls1/l0;


# direct methods
.method public constructor <init>(Ls1/l0;Lqg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls1/k0;->l:Ls1/l0;

    .line 5
    .line 6
    iput-object p1, p0, Ls1/k0;->g:Ls1/l0;

    .line 7
    .line 8
    iput-object p2, p0, Ls1/k0;->h:Lqg/g;

    .line 9
    .line 10
    sget-object p1, Ls1/l;->h:Ls1/l;

    .line 11
    .line 12
    iput-object p1, p0, Ls1/k0;->j:Ls1/l;

    .line 13
    .line 14
    sget-object p1, Lwf/h;->g:Lwf/h;

    .line 15
    .line 16
    iput-object p1, p0, Ls1/k0;->k:Lwf/h;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B()Ly1/l2;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->l:Ls1/l0;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lx1/f0;->G:Ly1/l2;

    .line 8
    .line 9
    return-object v0
.end method

.method public final C(JLfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Ls1/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ls1/i0;

    .line 7
    .line 8
    iget v1, v0, Ls1/i0;->j:I

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
    iput v1, v0, Ls1/i0;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ls1/i0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ls1/i0;-><init>(Ls1/k0;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Ls1/i0;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ls1/i0;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Ls1/i0;->g:Lqg/e1;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    move-object v6, p0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p2, v0

    .line 43
    move-object v6, p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0x0

    .line 56
    .line 57
    cmp-long p4, p1, v3

    .line 58
    .line 59
    if-gtz p4, :cond_3

    .line 60
    .line 61
    iget-object p4, p0, Ls1/k0;->i:Lqg/g;

    .line 62
    .line 63
    if-eqz p4, :cond_3

    .line 64
    .line 65
    new-instance v1, Ls1/m;

    .line 66
    .line 67
    invoke-direct {v1, p1, p2}, Ls1/m;-><init>(J)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Lsf/f;

    .line 71
    .line 72
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p4, v3}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget-object p4, p0, Ls1/k0;->l:Ls1/l0;

    .line 79
    .line 80
    invoke-virtual {p4}, Ly0/n;->Y0()Lqg/t;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    new-instance v3, Lh0/k0;

    .line 85
    .line 86
    const/4 v8, 0x1

    .line 87
    const/4 v7, 0x0

    .line 88
    move-object v6, p0

    .line 89
    move-wide v4, p1

    .line 90
    invoke-direct/range {v3 .. v8}, Lh0/k0;-><init>(JLjava/lang/Object;Lwf/c;I)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x3

    .line 94
    invoke-static {p4, v7, v3, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :try_start_1
    iput-object p1, v0, Ls1/i0;->g:Lqg/e1;

    .line 99
    .line 100
    iput v2, v0, Ls1/i0;->j:I

    .line 101
    .line 102
    invoke-interface {p3, p0, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 107
    .line 108
    if-ne p4, p2, :cond_4

    .line 109
    .line 110
    return-object p2

    .line 111
    :cond_4
    :goto_1
    sget-object p2, Ls1/b;->h:Ls1/b;

    .line 112
    .line 113
    invoke-interface {p1, p2}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 114
    .line 115
    .line 116
    return-object p4

    .line 117
    :catchall_1
    move-exception v0

    .line 118
    move-object p2, v0

    .line 119
    :goto_2
    sget-object p3, Ls1/b;->h:Ls1/b;

    .line 120
    .line 121
    invoke-interface {p1, p3}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 122
    .line 123
    .line 124
    throw p2
.end method

.method public final E(JLfg/p;Lyf/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Ls1/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Ls1/j0;

    .line 7
    .line 8
    iget v1, v0, Ls1/j0;->i:I

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
    iput v1, v0, Ls1/j0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ls1/j0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Ls1/j0;-><init>(Ls1/k0;Lyf/a;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Ls1/j0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ls1/j0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    :try_start_0
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ls1/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object p4

    .line 38
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_2
    invoke-static {p4}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    iput v2, v0, Ls1/j0;->i:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Ls1/k0;->C(JLfg/p;Lyf/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_1
    .catch Ls1/m; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 55
    .line 56
    if-ne p1, p2, :cond_3

    .line 57
    .line 58
    return-object p2

    .line 59
    :cond_3
    return-object p1

    .line 60
    :catch_0
    const/4 p1, 0x0

    .line 61
    return-object p1
.end method

.method public final G0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->G0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final J(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->J(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final K(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->K(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final L0(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->L0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final O0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->O0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final S(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lu2/c;->S(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/l0;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e(Ls1/l;Lwf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lqg/g;

    .line 2
    .line 3
    invoke-static {p2}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lqg/g;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lqg/g;->p()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ls1/k0;->j:Ls1/l;

    .line 15
    .line 16
    iput-object v0, p0, Ls1/k0;->i:Lqg/g;

    .line 17
    .line 18
    invoke-virtual {v0}, Lqg/g;->o()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final e0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->e0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final getContext()Lwf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->k:Lwf/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lu2/c;->i0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/l0;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-float/2addr p1, v0

    .line 8
    return p1
.end method

.method public final m()J
    .locals 10

    .line 1
    iget-object v0, p0, Ls1/k0;->l:Ls1/l0;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lx1/f0;->G:Ly1/l2;

    .line 8
    .line 9
    invoke-interface {v1}, Ly1/l2;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-interface {v0, v1, v2}, Lu2/c;->L0(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-wide v3, v0, Ls1/l0;->E:J

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    shr-long v5, v1, v0

    .line 22
    .line 23
    long-to-int v5, v5

    .line 24
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    shr-long v6, v3, v0

    .line 29
    .line 30
    long-to-int v6, v6

    .line 31
    int-to-float v6, v6

    .line 32
    sub-float/2addr v5, v6

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/high16 v7, 0x40000000    # 2.0f

    .line 39
    .line 40
    div-float/2addr v5, v7

    .line 41
    const-wide v8, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v1, v8

    .line 47
    long-to-int v1, v1

    .line 48
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    and-long v2, v3, v8

    .line 53
    .line 54
    long-to-int v2, v2

    .line 55
    int-to-float v2, v2

    .line 56
    sub-float/2addr v1, v2

    .line 57
    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    div-float/2addr v1, v7

    .line 62
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    int-to-long v2, v2

    .line 67
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    int-to-long v4, v1

    .line 72
    shl-long v0, v2, v0

    .line 73
    .line 74
    and-long v2, v4, v8

    .line 75
    .line 76
    or-long/2addr v0, v2

    .line 77
    return-wide v0
.end method

.method public final q0()F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/l0;->q0()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls1/k0;->l:Ls1/l0;

    .line 2
    .line 3
    iget-object v1, v0, Ls1/l0;->B:Lj0/b;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Ls1/l0;->A:Lj0/b;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lj0/b;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object v0, p0, Ls1/k0;->h:Lqg/g;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v1

    .line 20
    throw p1
.end method

.method public final x0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/k0;->g:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/l0;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method
