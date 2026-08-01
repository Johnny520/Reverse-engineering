.class public final Lr51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lym;
.implements Lik;


# instance fields
.field public final synthetic d:Ls51;

.field public final e:Lwc;

.field public f:Lwc;

.field public g:Ljr0;

.field public final h:Lfs;

.field public final synthetic i:Ls51;


# direct methods
.method public constructor <init>(Ls51;Lwc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr51;->i:Ls51;

    .line 5
    .line 6
    iput-object p1, p0, Lr51;->d:Ls51;

    .line 7
    .line 8
    iput-object p2, p0, Lr51;->e:Lwc;

    .line 9
    .line 10
    sget-object p1, Ljr0;->e:Ljr0;

    .line 11
    .line 12
    iput-object p1, p0, Lr51;->g:Ljr0;

    .line 13
    .line 14
    sget-object p1, Lfs;->d:Lfs;

    .line 15
    .line 16
    iput-object p1, p0, Lr51;->h:Lfs;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final F(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->F(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final M(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->M(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final P(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->P(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Z(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->Z(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final a(Ljr0;Ly9;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lwc;

    .line 2
    .line 3
    invoke-static {p2}, Lrd0;->z(Lik;)Lik;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lwc;-><init>(ILik;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lwc;->v()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lr51;->g:Ljr0;

    .line 15
    .line 16
    iput-object v0, p0, Lr51;->f:Lwc;

    .line 17
    .line 18
    invoke-virtual {v0}, Lwc;->t()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls51;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d()J
    .locals 9

    .line 1
    iget-object p0, p0, Lr51;->i:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lb60;->D:Lnc1;

    .line 11
    .line 12
    invoke-interface {v0}, Lnc1;->e()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-interface {p0, v0, v1}, Lym;->M(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-wide v2, p0, Ls51;->A:J

    .line 21
    .line 22
    const/16 p0, 0x20

    .line 23
    .line 24
    shr-long v4, v0, p0

    .line 25
    .line 26
    long-to-int v4, v4

    .line 27
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    shr-long v5, v2, p0

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    int-to-float v5, v5

    .line 35
    sub-float/2addr v4, v5

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/high16 v6, 0x40000000    # 2.0f

    .line 42
    .line 43
    div-float/2addr v4, v6

    .line 44
    const-wide v7, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v0, v7

    .line 50
    long-to-int v0, v0

    .line 51
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    and-long v1, v2, v7

    .line 56
    .line 57
    long-to-int v1, v1

    .line 58
    int-to-float v1, v1

    .line 59
    sub-float/2addr v0, v1

    .line 60
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    div-float/2addr v0, v6

    .line 65
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    int-to-long v1, v1

    .line 70
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    int-to-long v3, v0

    .line 75
    shl-long v0, v1, p0

    .line 76
    .line 77
    and-long v2, v3, v7

    .line 78
    .line 79
    or-long/2addr v0, v2

    .line 80
    return-wide v0
.end method

.method public final e()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->h:Lfs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Lnc1;
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->i:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Lb60;->D:Lnc1;

    .line 11
    .line 12
    return-object p0
.end method

.method public final f0(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->f0(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h()F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls51;->h()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr51;->i:Ls51;

    .line 2
    .line 3
    iget-object v1, v0, Ls51;->x:Lsh0;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Ls51;->w:Lsh0;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lsh0;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object p0, p0, Lr51;->e:Lwc;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lwc;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v1

    .line 20
    throw p0
.end method

.method public final i0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls51;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final l(JLww;Ljk;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lp51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lp51;

    .line 7
    .line 8
    iget v1, v0, Lp51;->j:I

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
    iput v1, v0, Lp51;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp51;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lp51;-><init>(Lr51;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lp51;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lp51;->j:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lp51;->g:Lr31;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long p4, p1, v4

    .line 55
    .line 56
    if-gtz p4, :cond_3

    .line 57
    .line 58
    iget-object p4, p0, Lr51;->f:Lwc;

    .line 59
    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-instance v1, Lkr0;

    .line 63
    .line 64
    invoke-direct {v1, p1, p2}, Lkr0;-><init>(J)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lbv0;

    .line 68
    .line 69
    invoke-direct {v4, v1}, Lbv0;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, v4}, Lwc;->i(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object p4, p0, Lr51;->i:Ls51;

    .line 76
    .line 77
    invoke-virtual {p4}, Loe0;->k0()Lyk;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    new-instance v1, Lbz0;

    .line 82
    .line 83
    invoke-direct {v1, p1, p2, p0, v2}, Lbz0;-><init>(JLr51;Lik;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x3

    .line 87
    invoke-static {p4, v2, v1, p1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :try_start_1
    iput-object p1, v0, Lp51;->g:Lr31;

    .line 92
    .line 93
    iput v3, v0, Lp51;->j:I

    .line 94
    .line 95
    invoke-interface {p3, p0, v0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    sget-object p0, Lzk;->d:Lzk;

    .line 100
    .line 101
    if-ne p4, p0, :cond_4

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_4
    move-object p0, p1

    .line 105
    :goto_1
    sget-object p1, Ltc;->e:Ltc;

    .line 106
    .line 107
    invoke-interface {p0, p1}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    return-object p4

    .line 111
    :catchall_1
    move-exception p0

    .line 112
    move-object v6, p1

    .line 113
    move-object p1, p0

    .line 114
    move-object p0, v6

    .line 115
    :goto_2
    sget-object p2, Ltc;->e:Ltc;

    .line 116
    .line 117
    invoke-interface {p0, p2}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 118
    .line 119
    .line 120
    throw p1
.end method

.method public final n(JLww;Ly9;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lq51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lq51;

    .line 7
    .line 8
    iget v1, v0, Lq51;->i:I

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
    iput v1, v0, Lq51;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lq51;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lq51;-><init>(Lr51;Ly9;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lq51;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lq51;->i:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkr0; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p4

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p4}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    iput v3, v0, Lq51;->i:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lr51;->l(JLww;Ljk;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_1
    .catch Lkr0; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    sget-object p1, Lzk;->d:Lzk;

    .line 55
    .line 56
    if-ne p0, p1, :cond_3

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    return-object p0

    .line 60
    :catch_0
    return-object v2
.end method

.method public final o(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lym;->o(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final p(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ls51;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final y(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lr51;->d:Ls51;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lym;->y(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
