.class public abstract Ld7/s;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final B(Lq7/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld7/s;->S(Ljava/io/InputStream;)I

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final N(I)J
    .locals 4

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    invoke-static {v0, p1}, Lk7/a;->s([BI)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    int-to-long v0, p1

    .line 8
    const-wide v2, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    return-wide v0
.end method

.method public final O(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    invoke-static {v0, p1}, Lk7/a;->w([BI)S

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const v0, 0xffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, v0

    .line 11
    return p1
.end method

.method public final P([BIII)V
    .locals 2

    .line 1
    if-lez p4, :cond_2

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    add-int v0, p3, p4

    .line 8
    .line 9
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-le v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 20
    .line 21
    invoke-static {p1, p2, v0, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    return-void
.end method

.method public final Q(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    long-to-int p2, p2

    .line 4
    invoke-static {v0, p1, p2}, Lk7/a;->D([BII)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final R(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    int-to-short p2, p2

    .line 4
    invoke-static {v0, p1, p2}, Lk7/a;->F([BIS)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public abstract S(Ljava/io/InputStream;)I
.end method
