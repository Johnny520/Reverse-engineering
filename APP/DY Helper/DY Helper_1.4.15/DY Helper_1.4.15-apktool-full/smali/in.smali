.class public abstract Lin;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Ljava/lang/Object;


# virtual methods
.method public α(ILx80;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget-object v0, p2, Lx80;->α:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lin;->β(ILx80;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_4

    .line 18
    .line 19
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    instance-of v6, v5, Lq80;

    .line 24
    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v3, p2, v5}, Lin;->β(ILx80;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    instance-of v6, v5, Lx80;

    .line 38
    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, Lx80;

    .line 43
    .line 44
    invoke-virtual {p0, p1, v6, p3}, Lin;->α(ILx80;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v3, p2, v5}, Lin;->β(ILx80;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p0, "Unexpected child source info "

    .line 58
    .line 59
    invoke-static {v5, p0}, Lγ;->π(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return p0

    .line 64
    :cond_4
    return v3
.end method

.method public β(ILx80;Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p2, Ljn;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p2, p1, p3, p3}, Ljn;-><init>(ILv81;Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lin;->α:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public γ()Landroid/graphics/RenderEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Lin;->α:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderEffect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lin;->ε()Landroid/graphics/RenderEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lin;->α:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public δ()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public abstract ε()Landroid/graphics/RenderEffect;
.end method

.method public ζ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public η(ILjava/lang/Object;Lx80;Ljava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p4, Lqn;->α:Li2;

    .line 2
    .line 3
    invoke-static {p2, p4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p3, p2}, Lin;->β(ILx80;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
