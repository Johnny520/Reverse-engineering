.class public final Lo7/g;
.super Lk7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:Lk7/a;


# virtual methods
.method public final B(Lq7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final L()[Lk7/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    instance-of v1, v0, Lk7/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lk7/e;

    .line 8
    .line 9
    invoke-interface {v0}, Lk7/e;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final P(Lk7/a;)V
    .locals 2

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lo7/g;->k:Lk7/a;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-virtual {p1, v1}, Lk7/a;->H(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lk7/a;->J(Lk7/a;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iput-object p1, p0, Lo7/g;->k:Lk7/a;

    .line 19
    .line 20
    iget v0, p0, Lk7/a;->g:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lk7/a;->p()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final r()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lk7/a;->r()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const-class v0, Lo7/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, ": EMPTY"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final z(Lf6/b;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lf6/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk7/a;

    .line 9
    .line 10
    if-ne v0, p0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lf6/b;->b:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lo7/g;->k:Lk7/a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lk7/a;->z(Lf6/b;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    return-void
.end method
