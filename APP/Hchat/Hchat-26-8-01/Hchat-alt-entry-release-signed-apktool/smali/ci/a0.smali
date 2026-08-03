.class final Lci/a0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p1, p1, Lci/a0;

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    return v0
.end method

.method public final f()Ly0/n;
    .locals 1

    .line 1
    new-instance v0, Lci/e0;

    .line 2
    .line 3
    invoke-direct {v0}, Lci/e0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 3

    .line 1
    check-cast p1, Lci/e0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lci/e0;->w:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    iput-boolean v1, p1, Lci/e0;->w:Z

    .line 16
    .line 17
    iput-boolean v1, p1, Lci/e0;->x:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p1, Ly0/n;->t:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lci/e0;->s1()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v2}, Lx1/f0;->U(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-int/lit8 v1, v1, 0x1f

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "OverscrollElement(isVertical=true, nestedScrollToParent=true)"

    .line 2
    .line 3
    return-object v0
.end method
