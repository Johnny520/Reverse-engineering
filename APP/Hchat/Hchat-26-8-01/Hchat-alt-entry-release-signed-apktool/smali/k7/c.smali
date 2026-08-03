.class public abstract Lk7/c;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/e;


# virtual methods
.method public B(Lq7/b;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_2

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v3, p1}, Lk7/a;->G(Lq7/b;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    :goto_1
    return-void
.end method

.method public C(Ljava/io/ByteArrayOutputStream;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk7/a;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    return v1

    .line 16
    :cond_1
    array-length v2, v0

    .line 17
    move v3, v1

    .line 18
    :goto_1
    if-ge v1, v2, :cond_3

    .line 19
    .line 20
    aget-object v4, v0, v1

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v4, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v4, v3

    .line 29
    move v3, v4

    .line 30
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    return v3
.end method

.method public abstract L()[Lk7/a;
.end method

.method public M()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract N()V
.end method

.method public O()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_2

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    instance-of v4, v3, Lk7/e;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    check-cast v3, Lk7/e;

    .line 19
    .line 20
    invoke-interface {v3}, Lk7/e;->c()V

    .line 21
    .line 22
    .line 23
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk7/a;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lk7/c;->M()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk7/c;->O()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lk7/c;->N()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk7/a;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    return v1

    .line 16
    :cond_1
    array-length v2, v0

    .line 17
    move v3, v1

    .line 18
    :goto_1
    if-ge v1, v2, :cond_3

    .line 19
    .line 20
    aget-object v4, v0, v1

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v4}, Lk7/a;->p()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v4, v3

    .line 29
    move v3, v4

    .line 30
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    return v3
.end method

.method public r()[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk7/a;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    return-object v1

    .line 16
    :cond_1
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_1
    if-ge v3, v2, :cond_3

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v4}, Lk7/a;->r()[B

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v1, v4}, Lk7/a;->o([B[B)[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    return-object v1
.end method

.method public z(Lf6/b;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lf6/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

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
    invoke-virtual {p0}, Lk7/c;->L()[Lk7/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    array-length v1, v0

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_5

    .line 26
    .line 27
    iget-boolean v3, p1, Lf6/b;->b:Z

    .line 28
    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    aget-object v3, v0, v2

    .line 33
    .line 34
    if-eqz v3, :cond_4

    .line 35
    .line 36
    invoke-virtual {v3, p1}, Lk7/a;->z(Lf6/b;)V

    .line 37
    .line 38
    .line 39
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    :goto_1
    return-void
.end method
