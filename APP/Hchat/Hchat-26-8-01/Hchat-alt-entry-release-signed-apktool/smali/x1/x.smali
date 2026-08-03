.class public final Lx1/x;
.super Lx1/i1;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a0:Lf1/h;


# instance fields
.field public Y:Lx1/v;

.field public Z:Lx1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lf1/w;->h:I

    .line 6
    .line 7
    sget-wide v1, Lf1/w;->e:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lf1/h;->w(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lf1/h;->C(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lf1/h;->D(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lx1/x;->a0:Lf1/h;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lx1/f0;Lx1/v;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx1/i1;-><init>(Lx1/f0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lx1/x;->Y:Lx1/v;

    .line 5
    .line 6
    iget-object p1, p1, Lx1/f0;->n:Lx1/f0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lx1/w;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lx1/w;-><init>(Lx1/x;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iput-object p1, p0, Lx1/x;->Z:Lx1/w;

    .line 18
    .line 19
    check-cast p2, Ly0/n;

    .line 20
    .line 21
    iget-object p1, p2, Ly0/n;->g:Ly0/n;

    .line 22
    .line 23
    iget p1, p1, Ly0/n;->i:I

    .line 24
    .line 25
    and-int/lit16 p1, p1, 0x200

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Lah/a;->d()V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    throw p1
.end method


# virtual methods
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
    invoke-virtual/range {v0 .. v5}, Lx1/i1;->H1(JFLfg/l;Li1/b;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/x;->T1()V

    .line 10
    .line 11
    .line 12
    return-void
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
    invoke-virtual/range {v0 .. v5}, Lx1/i1;->H1(JFLfg/l;Li1/b;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lx1/x;->T1()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final G(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->v:Lx1/i1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lx1/v;->G(Lx1/n0;Lv1/m0;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final G1(Lf1/u;Li1/b;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lx1/i1;->v:Lx1/i1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lx1/i1;->k1(Lf1/u;Li1/b;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lx1/i1;->u:Lx1/f0;

    .line 10
    .line 11
    invoke-static {p2}, Lx1/i0;->a(Lx1/f0;)Lx1/r1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ly1/t;

    .line 16
    .line 17
    invoke-virtual {p2}, Ly1/t;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lx1/i1;->v:Lx1/i1;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Lv1/b1;->i:J

    .line 28
    .line 29
    iget-wide v2, p2, Lv1/b1;->i:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Lu2/l;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Lx1/i1;->F:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lu2/j;->b(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Lv1/b1;->i:J

    .line 48
    .line 49
    const/16 p2, 0x20

    .line 50
    .line 51
    shr-long v2, v0, p2

    .line 52
    .line 53
    long-to-int p2, v2

    .line 54
    int-to-float p2, p2

    .line 55
    const/high16 v2, 0x3f000000    # 0.5f

    .line 56
    .line 57
    sub-float v6, p2, v2

    .line 58
    .line 59
    const-wide v3, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v0, v3

    .line 65
    long-to-int p2, v0

    .line 66
    int-to-float p2, p2

    .line 67
    sub-float v7, p2, v2

    .line 68
    .line 69
    const/high16 v4, 0x3f000000    # 0.5f

    .line 70
    .line 71
    const/high16 v5, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sget-object v8, Lx1/x;->a0:Lf1/h;

    .line 74
    .line 75
    move-object v3, p1

    .line 76
    invoke-interface/range {v3 .. v8}, Lf1/u;->t(FFFFLf1/h;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final K0(Lv1/j;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/x;->Z:Lx1/w;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Lx1/o0;->z:Lf/b0;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lf/b0;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lf/b0;->c:[I

    .line 14
    .line 15
    aget p1, v0, p1

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/high16 p1, -0x80000000

    .line 19
    .line 20
    return p1

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lx1/k;->c(Lx1/n0;Lv1/j;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
.end method

.method public final M(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->v:Lx1/i1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lx1/v;->Q(Lx1/n0;Lv1/m0;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final Q(J)Lv1/b1;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lv1/b1;->E0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 5
    .line 6
    iget-object v1, p0, Lx1/i1;->v:Lx1/i1;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lx1/v;->j(Lv1/p0;Lv1/m0;J)Lv1/o0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lx1/i1;->K1(Lv1/o0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lx1/i1;->B1()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final T1()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx1/n0;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lx1/i1;->C1()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lx1/i1;->v:Lx1/i1;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, Lx1/n0;->q:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Lx1/n0;->q:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lx1/i1;->Z0()Lv1/o0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Lv1/o0;->f()V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, Lx1/n0;->q:Z

    .line 27
    .line 28
    return-void
.end method

.method public final U1(Lx1/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Ly0/n;

    .line 11
    .line 12
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 13
    .line 14
    iget v0, v0, Ly0/n;->i:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lah/a;->d()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Lx1/x;->Y:Lx1/v;

    .line 26
    .line 27
    return-void
.end method

.method public final j(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->v:Lx1/i1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lx1/v;->R0(Lx1/n0;Lv1/m0;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final m1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/x;->Z:Lx1/w;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx1/w;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lx1/w;-><init>(Lx1/x;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx1/x;->Z:Lx1/w;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final p0(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/i1;->v:Lx1/i1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lx1/v;->K0(Lx1/n0;Lv1/m0;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final p1()Lx1/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/x;->Z:Lx1/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r1()Ly0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/x;->Y:Lx1/v;

    .line 2
    .line 3
    check-cast v0, Ly0/n;

    .line 4
    .line 5
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 6
    .line 7
    return-object v0
.end method
