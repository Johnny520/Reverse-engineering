.class public final Lj7/c;
.super Lk7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final V()V
    .locals 3

    .line 1
    const-class v0, Lv7/c0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv7/c0;

    .line 8
    .line 9
    iget-object v0, v0, Lv7/g0;->k:Lv7/i0;

    .line 10
    .line 11
    check-cast v0, Lv7/f;

    .line 12
    .line 13
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 14
    .line 15
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v0, v0, Lr7/b;->k:[B

    .line 20
    .line 21
    const/16 v2, 0xc

    .line 22
    .line 23
    invoke-static {v0, v2, v1}, Lk7/a;->D([BII)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final X()V
    .locals 0

    .line 1
    return-void
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lv7/e0;

    .line 2
    .line 3
    check-cast p2, Lv7/e0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    if-nez p2, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    if-ne p2, p1, :cond_3

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_3
    invoke-virtual {p1}, Lv7/e0;->Z()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p2}, Lv7/e0;->Z()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-ne p1, p2, :cond_4

    .line 28
    .line 29
    :goto_0
    return v0

    .line 30
    :cond_4
    if-nez p1, :cond_5

    .line 31
    .line 32
    return v1

    .line 33
    :cond_5
    if-nez p2, :cond_6

    .line 34
    .line 35
    :goto_1
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :cond_6
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public final n()Lk7/a;
    .locals 3

    .line 1
    new-instance v0, Lv7/e0;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, v1, v2}, Lv7/j0;-><init>(II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
