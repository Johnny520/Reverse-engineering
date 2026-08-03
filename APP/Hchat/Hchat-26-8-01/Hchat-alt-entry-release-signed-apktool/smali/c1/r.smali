.class public final Lc1/r;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;
.implements Lx1/m1;


# instance fields
.field public u:Lf1/r0;

.field public v:Ll1/d;

.field public w:Ll1/b;


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc1/r;->w:Ll1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lx1/k;->u(Ly0/n;)Lf1/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lf1/z;->b()Lb/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lc1/r;->u:Lf1/r0;

    .line 14
    .line 15
    iget-object v2, p0, Lc1/r;->v:Ll1/d;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v3, Ll1/b;

    .line 21
    .line 22
    invoke-direct {v3, v1, v2, v0}, Ll1/b;-><init>(Lf1/r0;Ll1/d;Lb/e;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lc1/r;->w:Ll1/b;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v4, v0

    .line 30
    :goto_0
    iget-object v0, p1, Lx1/h0;->g:Lh1/b;

    .line 31
    .line 32
    invoke-interface {v0}, Lh1/d;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    const/high16 v8, 0x3f800000    # 1.0f

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    move-object v5, p1

    .line 40
    invoke-virtual/range {v4 .. v9}, Lk1/b;->c(Lx1/h0;JFLf1/n;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Lx1/h0;->e()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc1/r;->w:Ll1/b;

    .line 3
    .line 4
    invoke-static {p0}, Lx1/k;->l(Lx1/m;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    instance-of v2, p1, Lc1/r;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object v2, p0, Lc1/r;->u:Lf1/r0;

    .line 14
    .line 15
    check-cast p1, Lc1/r;

    .line 16
    .line 17
    iget-object v3, p1, Lc1/r;->u:Lf1/r0;

    .line 18
    .line 19
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-object v2, p0, Lc1/r;->v:Ll1/d;

    .line 27
    .line 28
    iget-object p1, p1, Lc1/r;->v:Ll1/d;

    .line 29
    .line 30
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    return v0

    .line 38
    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc1/r;->u:Lf1/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lc1/r;->v:Ll1/d;

    .line 10
    .line 11
    invoke-virtual {v1}, Ll1/d;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method
