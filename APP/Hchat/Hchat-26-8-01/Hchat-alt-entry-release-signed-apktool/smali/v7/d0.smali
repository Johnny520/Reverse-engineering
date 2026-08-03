.class public final Lv7/d0;
.super Lv7/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final B(Lq7/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr7/b;->k:[B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x8

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, v2, v1}, Lr7/b;->M(IZ)V

    .line 21
    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-super {p0, p1}, Lv7/j0;->B(Lq7/b;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final O()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr7/b;->k:[B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lr7/b;->k:[B

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0

    .line 27
    :cond_0
    invoke-super {p0}, Lv7/j0;->O()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0
.end method

.method public final P()Ll7/g;
    .locals 2

    .line 1
    const-class v0, Lv7/d;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv7/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-class v1, Ll7/f;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ll7/f;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final Q()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr7/b;->k:[B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    invoke-super {p0}, Lv7/j0;->Q()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method public final R()B
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr7/b;->k:[B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lr7/b;->k:[B

    .line 20
    .line 21
    aget-byte v0, v0, v2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    invoke-super {p0}, Lv7/j0;->R()B

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
.end method

.method public final X(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lr7/b;->k:[B

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v0, v1, v2}, Lk7/a;->q([BII)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lv7/d0;->Y()Lv7/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lr7/b;->k:[B

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-super {p0, p1}, Lv7/j0;->X(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final Y()Lv7/e;
    .locals 1

    .line 1
    const-class v0, Lv7/b0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv7/b0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lv7/g0;->k:Lv7/i0;

    .line 12
    .line 13
    check-cast v0, Lv7/e;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, "Unreachable"

    .line 17
    .line 18
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method
