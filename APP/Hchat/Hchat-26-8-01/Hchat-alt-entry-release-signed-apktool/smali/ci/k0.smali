.class public abstract Lci/k0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(Li0/h0;I)V
    .locals 3

    .line 1
    const v0, 0x35102176

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    and-int/lit8 v1, p1, 0x1

    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Li0/h0;->S(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    sget-object v0, Ly1/i0;->f:Li0/m2;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    sget-object v1, Li0/l;->a:Li0/e;

    .line 43
    .line 44
    if-ne v2, v1, :cond_2

    .line 45
    .line 46
    :cond_1
    new-instance v2, Lb0/d0;

    .line 47
    .line 48
    const/16 v1, 0x8

    .line 49
    .line 50
    invoke-direct {v2, v0, v1}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    check-cast v2, Lfg/l;

    .line 57
    .line 58
    invoke-static {v0, v2, p0}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-virtual {p0}, Li0/h0;->V()V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {p0}, Li0/h0;->t()Li0/r1;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    new-instance v0, Lc9/n1;

    .line 72
    .line 73
    invoke-direct {v0, p1}, Lc9/n1;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Li0/r1;->d:Lfg/p;

    .line 77
    .line 78
    :cond_4
    return-void
.end method

.method public static b(FF)F
    .locals 8

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {v0, v0}, Ljava/lang/Math;->min(FF)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    float-to-double v2, v0

    .line 17
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 18
    .line 19
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sub-double v4, v2, v4

    .line 24
    .line 25
    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    .line 26
    .line 27
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    div-double/2addr v2, v6

    .line 32
    add-double/2addr v2, v4

    .line 33
    float-to-double v4, p1

    .line 34
    mul-double/2addr v2, v4

    .line 35
    double-to-float p1, v2

    .line 36
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    cmpg-float v0, p0, v1

    .line 41
    .line 42
    if-gtz v0, :cond_0

    .line 43
    .line 44
    return v1

    .line 45
    :cond_0
    cmpl-float v0, p0, p1

    .line 46
    .line 47
    if-ltz v0, :cond_1

    .line 48
    .line 49
    move p0, p1

    .line 50
    :cond_1
    float-to-double p0, p0

    .line 51
    mul-double/2addr p0, v6

    .line 52
    sub-double p0, v4, p0

    .line 53
    .line 54
    const-wide v0, 0x3fe5555555555555L    # 0.6666666666666666

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-static {p0, p1}, Ljava/lang/Math;->signum(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    mul-double/2addr v2, v0

    .line 68
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    const-wide v0, 0x3fd5555555555555L    # 0.3333333333333333

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 78
    .line 79
    .line 80
    move-result-wide p0

    .line 81
    mul-double/2addr p0, v2

    .line 82
    sub-double/2addr v4, p0

    .line 83
    double-to-float p0, v4

    .line 84
    return p0
.end method

.method public static c(Ly0/o;Ln/k;Lci/o0;Z)Ly0/o;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    new-instance v0, Lci/i0;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3}, Lci/i0;-><init>(Ln/k;Lk/y0;Z)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    new-instance p2, Lci/i0;

    .line 16
    .line 17
    invoke-direct {p2, p1, v0, p3}, Lci/i0;-><init>(Ln/k;Lk/y0;Z)V

    .line 18
    .line 19
    .line 20
    move-object v0, p2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    invoke-static {v1, p1, p2}, Lk/v0;->a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v1, Lci/i0;

    .line 31
    .line 32
    invoke-direct {v1, p1, v0, p3}, Lci/i0;-><init>(Ln/k;Lk/y0;Z)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    new-instance p1, Lci/j0;

    .line 41
    .line 42
    invoke-direct {p1, p2, p3}, Lci/j0;-><init>(Lk/y0;Z)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, p1}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
