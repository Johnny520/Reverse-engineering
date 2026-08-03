.class public abstract Lr4/u0;
.super Lr4/o0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Lr4/a0;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/z;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lr4/a0;->c()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    mul-int/2addr p1, v0

    .line 12
    if-ltz p1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lr4/o0;->d:I

    .line 15
    .line 16
    if-ltz v0, :cond_0

    .line 17
    .line 18
    add-int/2addr v0, p1

    .line 19
    return v0

    .line 20
    :cond_0
    const-string p1, "fileOffset not yet set"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    const-string p1, "relative < 0"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0
.end method

.method public final e()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr4/u0;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lr4/o0;->c()Ljava/util/Collection;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lr4/a0;

    .line 23
    .line 24
    iget-object v2, p0, Lr4/o0;->b:Lr4/p;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lr4/a0;->a(Lr4/p;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final h()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr4/o0;->c()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lr4/a0;

    .line 22
    .line 23
    invoke-virtual {v0}, Lr4/a0;->c()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    mul-int/2addr v0, v1

    .line 28
    return v0
.end method

.method public final j(Lz4/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lr4/o0;->c()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lr4/a0;

    .line 20
    .line 21
    iget-object v2, p0, Lr4/o0;->b:Lr4/p;

    .line 22
    .line 23
    invoke-virtual {v1, v2, p1}, Lr4/a0;->d(Lr4/p;Lz4/d;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lr4/o0;->c:I

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lz4/d;->a(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public abstract k()V
.end method
