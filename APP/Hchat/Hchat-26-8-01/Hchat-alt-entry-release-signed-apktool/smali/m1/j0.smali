.class public final Lm1/j0;
.super Lk1/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Li0/j1;

.field public final f:Li0/j1;

.field public final g:Lm1/e0;

.field public final h:Li0/j1;

.field public i:F

.field public j:Lf1/n;


# direct methods
.method public constructor <init>(Lm1/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lk1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le1/e;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Le1/e;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lm1/j0;->e:Li0/j1;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lm1/j0;->f:Li0/j1;

    .line 24
    .line 25
    new-instance v0, Lm1/e0;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lm1/e0;-><init>(Lm1/c;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Ld1/c0;

    .line 31
    .line 32
    const/16 v1, 0x9

    .line 33
    .line 34
    invoke-direct {p1, p0, v1}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lm1/e0;->f:Lgg/m;

    .line 38
    .line 39
    iput-object v0, p0, Lm1/j0;->g:Lm1/e0;

    .line 40
    .line 41
    sget-object p1, Li0/e;->j:Li0/e;

    .line 42
    .line 43
    new-instance v0, Li0/j1;

    .line 44
    .line 45
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lm1/j0;->h:Li0/j1;

    .line 51
    .line 52
    const/high16 p1, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput p1, p0, Lm1/j0;->i:F

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .line 1
    iput p1, p0, Lm1/j0;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public final b(Lf1/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/j0;->j:Lf1/n;

    .line 2
    .line 3
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object v0, p0, Lm1/j0;->e:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le1/e;

    .line 8
    .line 9
    iget-wide v0, v0, Le1/e;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final e(Lx1/h0;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lx1/h0;->g:Lh1/b;

    .line 2
    .line 3
    iget-object v1, p0, Lm1/j0;->j:Lf1/n;

    .line 4
    .line 5
    iget-object v2, p0, Lm1/j0;->g:Lm1/e0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v2, Lm1/e0;->g:Li0/j1;

    .line 10
    .line 11
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lf1/n;

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Lm1/j0;->f:Li0/j1;

    .line 18
    .line 19
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

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
    invoke-virtual {p1}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Lu2/m;->h:Lu2/m;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Lh1/d;->I0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object v0, v0, Lh1/b;->h:Lb5/c;

    .line 44
    .line 45
    invoke-virtual {v0}, Lb5/c;->v()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v7}, Lf1/u;->e()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object v7, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Landroidx/lifecycle/x;

    .line 59
    .line 60
    const/high16 v8, -0x40800000    # -1.0f

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9, v3, v4}, Landroidx/lifecycle/x;->S(FFJ)V

    .line 65
    .line 66
    .line 67
    iget v3, p0, Lm1/j0;->i:F

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1}, Lm1/e0;->e(Lh1/d;FLf1/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Lf1/u;->p()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5, v6}, Lb5/c;->U(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    invoke-virtual {v0}, Lb5/c;->p()Lf1/u;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v1}, Lf1/u;->p()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v5, v6}, Lb5/c;->U(J)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_1
    iget v0, p0, Lm1/j0;->i:F

    .line 96
    .line 97
    invoke-virtual {v2, p1, v0, v1}, Lm1/e0;->e(Lh1/d;FLf1/n;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object p1, p0, Lm1/j0;->h:Li0/j1;

    .line 101
    .line 102
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void
.end method
