.class public final Lkb1;
.super Lro0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final e:Lgp0;

.field public final f:Lgp0;

.field public final g:Lfb1;

.field public final h:Lgp0;

.field public i:F

.field public j:Lja;


# direct methods
.method public constructor <init>(Lay;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lro0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lq11;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lq11;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lkb1;->e:Lgp0;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lkb1;->f:Lgp0;

    .line 24
    .line 25
    new-instance v0, Lfb1;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lfb1;-><init>(Lay;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Li7;

    .line 31
    .line 32
    const/16 v1, 0xb

    .line 33
    .line 34
    invoke-direct {p1, v1, p0}, Li7;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lfb1;->f:Lhw;

    .line 38
    .line 39
    iput-object v0, p0, Lkb1;->g:Lfb1;

    .line 40
    .line 41
    sget-object p1, Ln2;->M:Ln2;

    .line 42
    .line 43
    new-instance v0, Lgp0;

    .line 44
    .line 45
    sget-object v1, Lna1;->a:Lna1;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Lgp0;-><init>(Ljava/lang/Object;Ln2;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lkb1;->h:Lgp0;

    .line 51
    .line 52
    const/high16 p1, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput p1, p0, Lkb1;->i:F

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .line 1
    iput p1, p0, Lkb1;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public final b(Lja;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkb1;->j:Lja;

    .line 2
    .line 3
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lkb1;->e:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lq11;

    .line 8
    .line 9
    iget-wide v0, p0, Lq11;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final e(Ld60;)V
    .locals 10

    .line 1
    iget-object v0, p1, Ld60;->d:Ldd;

    .line 2
    .line 3
    iget-object v1, p0, Lkb1;->j:Lja;

    .line 4
    .line 5
    iget-object v2, p0, Lkb1;->g:Lfb1;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v2, Lfb1;->g:Lgp0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lja;

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Lkb1;->f:Lgp0;

    .line 18
    .line 19
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ld60;->getLayoutDirection()Lk50;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Lk50;->e:Lk50;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Luq;->K()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object v0, v0, Ldd;->e:Lo8;

    .line 44
    .line 45
    invoke-virtual {v0}, Lo8;->h()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v0}, Lo8;->f()Lbd;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v7}, Lbd;->i()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object v7, v0, Lo8;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Lx1;

    .line 59
    .line 60
    const/high16 v8, -0x40800000    # -1.0f

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9, v3, v4}, Lx1;->s(FFJ)V

    .line 65
    .line 66
    .line 67
    iget v3, p0, Lkb1;->i:F

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1}, Lfb1;->e(Luq;FLja;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lo8;->f()Lbd;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lbd;->g()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5, v6}, Lo8;->q(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-virtual {v0}, Lo8;->f()Lbd;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p1}, Lbd;->g()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v5, v6}, Lo8;->q(J)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_1
    iget v0, p0, Lkb1;->i:F

    .line 96
    .line 97
    invoke-virtual {v2, p1, v0, v1}, Lfb1;->e(Luq;FLja;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object p0, p0, Lkb1;->h:Lgp0;

    .line 101
    .line 102
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void
.end method
