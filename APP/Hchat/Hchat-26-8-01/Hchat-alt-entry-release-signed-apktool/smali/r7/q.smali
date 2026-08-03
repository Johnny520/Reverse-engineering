.class public final Lr7/q;
.super Lr7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final R(Lr7/s;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-ne p1, p0, :cond_1

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_1
    iget-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Lr7/r;->m:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0, p1}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
