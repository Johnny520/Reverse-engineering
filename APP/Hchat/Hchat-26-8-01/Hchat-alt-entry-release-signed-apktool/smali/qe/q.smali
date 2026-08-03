.class public final Lqe/q;
.super Lqe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a(Landroidx/lifecycle/e0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lqe/a;->a:Lud/p;

    .line 2
    .line 3
    iget-object v1, v0, Lud/p;->l:Lqd/r;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroidx/lifecycle/e0;->b(Lqd/l;)Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v0, v0, Lud/p;->m:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lqd/l;

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Landroidx/lifecycle/e0;->b(Lqd/l;)Lqd/j;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_1
    const/4 p1, 0x1

    .line 40
    return p1
.end method
