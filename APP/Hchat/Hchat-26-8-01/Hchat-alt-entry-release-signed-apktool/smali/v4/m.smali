.class public final Lv4/m;
.super Lv4/w;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final e(Lv4/a;)I
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lv4/w;->e(Lv4/a;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    check-cast p1, Lv4/m;

    .line 9
    .line 10
    iget-object v0, p0, Lv4/w;->h:Lv4/z;

    .line 11
    .line 12
    iget-object v0, v0, Lv4/z;->h:Lv4/c0;

    .line 13
    .line 14
    iget-object p1, p1, Lv4/w;->h:Lv4/z;

    .line 15
    .line 16
    iget-object p1, p1, Lv4/z;->h:Lv4/c0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/w;->h:Lv4/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/z;->k()Lw4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "field"

    .line 2
    .line 3
    return-object v0
.end method
