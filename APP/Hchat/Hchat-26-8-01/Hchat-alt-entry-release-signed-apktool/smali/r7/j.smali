.class public final Lr7/j;
.super Lr7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public q:I


# virtual methods
.method public final L()V
    .locals 2

    .line 1
    invoke-super {p0}, Lr7/k;->L()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr7/b;->k:[B

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, Lk7/a;->x([BI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lr7/j;->q:I

    .line 12
    .line 13
    return-void
.end method

.method public final N()I
    .locals 1

    .line 1
    iget v0, p0, Lr7/j;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public final O()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final P()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Lk7/a;->x([BI)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    mul-int/lit8 v0, v0, 0x4

    .line 9
    .line 10
    return v0
.end method

.method public final Q(I)V
    .locals 2

    .line 1
    iget v0, p0, Lr7/j;->q:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lr7/k;->R(I)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lr7/j;->q:I

    .line 9
    .line 10
    iget-object v0, p0, Lr7/b;->k:[B

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v0, v1, p1}, Lk7/a;->E([BII)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final S(I)V
    .locals 2

    .line 1
    div-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    invoke-static {p1}, Lr7/k;->R(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr7/b;->k:[B

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-static {v0, v1, p1}, Lk7/a;->E([BII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr7/k;

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget v0, p0, Lr7/k;->m:I

    .line 8
    .line 9
    iget p1, p1, Lr7/k;->m:I

    .line 10
    .line 11
    invoke-static {v0, p1}, Ly7/a;->b(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
