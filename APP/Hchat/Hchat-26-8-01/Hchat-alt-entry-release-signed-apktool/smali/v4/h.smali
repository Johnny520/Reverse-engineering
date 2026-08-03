.class public final Lv4/h;
.super Lv4/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "}"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lv4/d;->g:Lv4/c;

    .line 5
    .line 6
    const-string v3, "{"

    .line 7
    .line 8
    invoke-virtual {v2, v3, v0, v1}, Lz4/e;->n(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 1

    .line 1
    check-cast p1, Lv4/h;

    .line 2
    .line 3
    iget-object p1, p1, Lv4/d;->g:Lv4/c;

    .line 4
    .line 5
    iget-object v0, p0, Lv4/d;->g:Lv4/c;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/c;->o(Lv4/c;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lv4/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lv4/h;

    .line 6
    .line 7
    iget-object p1, p1, Lv4/d;->g:Lv4/c;

    .line 8
    .line 9
    iget-object v0, p0, Lv4/d;->g:Lv4/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lz4/e;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/d;->g:Lv4/c;

    .line 2
    .line 3
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "call site"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "}"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lv4/d;->g:Lv4/c;

    .line 5
    .line 6
    const-string v3, "call site{"

    .line 7
    .line 8
    invoke-virtual {v2, v3, v0, v1}, Lz4/e;->n(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method
