.class final Lp/l0;
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
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lp/l0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lp/l0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_2
    return v0
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lp/m0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lh/x0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lp/n0;->g:Lp/n0;

    .line 8
    .line 9
    iput-object v1, v0, Lp/m0;->v:Lp/n0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lp/m0;->w:Z

    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lp/m0;

    .line 2
    .line 3
    sget-object v0, Lp/n0;->g:Lp/n0;

    .line 4
    .line 5
    iput-object v0, p1, Lp/m0;->v:Lp/n0;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p1, Lp/m0;->w:Z

    .line 9
    .line 10
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget-object v0, Lp/n0;->g:Lp/n0;

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
    const/4 v1, 0x1

    .line 10
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v1, v0

    .line 15
    return v1
.end method
