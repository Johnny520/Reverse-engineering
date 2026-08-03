.class public final Lx1/d1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/e1;


# direct methods
.method public static final g(IJ)I
    .locals 1

    .line 1
    sget v0, Lx1/c2;->b:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0xf

    .line 4
    .line 5
    shr-long p0, p1, p0

    .line 6
    .line 7
    long-to-int p0, p0

    .line 8
    and-int/lit16 p0, p0, 0x7fff

    .line 9
    .line 10
    return p0
.end method

.method public static h(IIII)J
    .locals 3

    .line 1
    and-int/lit16 p0, p0, 0x7fff

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    and-int/lit16 p0, p1, 0x7fff

    .line 5
    .line 6
    int-to-long p0, p0

    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    shl-long/2addr p0, v2

    .line 10
    or-long/2addr p0, v0

    .line 11
    and-int/lit16 p2, p2, 0x7fff

    .line 12
    .line 13
    int-to-long v0, p2

    .line 14
    const/16 p2, 0x1e

    .line 15
    .line 16
    shl-long/2addr v0, p2

    .line 17
    or-long/2addr p0, v0

    .line 18
    and-int/lit16 p2, p3, 0x7fff

    .line 19
    .line 20
    int-to-long p2, p2

    .line 21
    const/16 v0, 0x2d

    .line 22
    .line 23
    shl-long/2addr p2, v0

    .line 24
    or-long/2addr p0, p2

    .line 25
    const-wide/high16 p2, -0x8000000000000000L

    .line 26
    .line 27
    or-long/2addr p0, p2

    .line 28
    return-wide p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method

.method public b(Ly0/n;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0}, Lf2/t;->a(Lx1/f0;Z)Lf2/q;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lf2/t;->h(Lf2/q;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public c(Lx1/f0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lx1/f0;->w()Lf2/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p1, Lf2/m;->j:Z

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    :cond_0
    xor-int/lit8 p1, v0, 0x1

    .line 15
    .line 16
    return p1
.end method

.method public d(Lx1/p;Lx1/f0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public e(Lx1/f0;JLx1/p;IZ)V
    .locals 8

    .line 1
    iget-object p1, p1, Lx1/f0;->L:Lx1/b1;

    .line 2
    .line 3
    iget-object p5, p1, Lx1/b1;->d:Lx1/i1;

    .line 4
    .line 5
    sget-object v0, Lx1/i1;->T:Lf1/o0;

    .line 6
    .line 7
    invoke-virtual {p5, p2, p3}, Lx1/i1;->o1(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v1, p1, Lx1/b1;->d:Lx1/i1;

    .line 12
    .line 13
    sget-object v2, Lx1/i1;->X:Lx1/d1;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    move-object v5, p4

    .line 17
    move v7, p6

    .line 18
    invoke-virtual/range {v1 .. v7}, Lx1/i1;->w1(Lx1/e1;JLx1/p;IZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public f(Ly0/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
