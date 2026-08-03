.class public final Ly7/b;
.super Lz7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public p:Z


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iput-boolean v1, p0, Ly7/b;->p:Z

    .line 12
    .line 13
    invoke-super {p0, p1}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    return v1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget v0, p0, Lz7/c;->i:I

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ly7/b;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget p1, p0, Lz7/c;->i:I

    .line 11
    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lz7/c;->remove(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Ly7/b;->p:Z

    .line 9
    .line 10
    :cond_0
    return p1
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ly7/b;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lz7/c;->i:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    move v0, v3

    .line 12
    :cond_0
    iput-boolean v3, p0, Ly7/b;->p:Z

    .line 13
    .line 14
    :cond_1
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-super {p0, p1}, Lz7/c;->sort(Ljava/util/Comparator;)V

    .line 17
    .line 18
    .line 19
    :cond_2
    return-void
.end method
