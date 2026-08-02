.class public final Lxy1;
.super Lbz1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public n:Lyy1;


# virtual methods
.method public final bridge synthetic a()Lzy1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxy1;->d()Lyy1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic b()Lzy1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxy1;->d()Lyy1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Le42;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lbz1;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lm93;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lm93;

    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d()Lyy1;
    .locals 3

    .line 1
    iget-object v0, p0, Lbz1;->j:Lh43;

    .line 2
    .line 3
    iget-object v1, p0, Lxy1;->n:Lyy1;

    .line 4
    .line 5
    iget-object v2, v1, Lzy1;->h:Lh43;

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Li51;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbz1;->i:Li51;

    .line 17
    .line 18
    new-instance v1, Lyy1;

    .line 19
    .line 20
    iget-object v0, p0, Lbz1;->j:Lh43;

    .line 21
    .line 22
    iget v2, p0, Lbz1;->m:I

    .line 23
    .line 24
    invoke-direct {v1, v0, v2}, Lzy1;-><init>(Lh43;I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v1, p0, Lxy1;->n:Lyy1;

    .line 28
    .line 29
    return-object v1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Le42;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lbz1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lm93;

    .line 14
    .line 15
    return-object p0
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, Le42;

    .line 7
    .line 8
    check-cast p2, Lm93;

    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lm93;

    .line 15
    .line 16
    return-object p0
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Le42;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lbz1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lm93;

    .line 14
    .line 15
    return-object p0
.end method
