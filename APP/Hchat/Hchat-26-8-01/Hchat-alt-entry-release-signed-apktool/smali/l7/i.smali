.class public final Ll7/i;
.super Lr7/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ll7/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ll7/i;

    .line 12
    .line 13
    iget v1, p0, Lr7/f;->n:I

    .line 14
    .line 15
    iget p1, p1, Lr7/f;->n:I

    .line 16
    .line 17
    if-ne v1, p1, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lr7/f;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-class v0, Ll7/f;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ll7/f;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget v3, p0, Lr7/f;->n:I

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Ll7/f;->W(I)Lt7/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v2

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ll7/f;

    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lt7/b;->a(Ll7/f;Lv7/k0;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    iget v0, p0, Lr7/f;->n:I

    .line 34
    .line 35
    const/16 v1, 0x8

    .line 36
    .line 37
    invoke-static {v0, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method
