.class public abstract Lm7/i;
.super Lm7/q;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public l:Lm7/r;


# virtual methods
.method public final L()Lm7/q;
    .locals 1

    .line 1
    invoke-super {p0}, Lm7/q;->L()Lm7/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lm7/i;

    .line 6
    .line 7
    return-object v0
.end method

.method public M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm7/i;->R()Ld7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lm7/q;

    .line 22
    .line 23
    invoke-virtual {v1}, Lm7/q;->M()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public N()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm7/i;->R()Ld7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo7/b;->N()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final O(Ljava/lang/String;)Lm7/j;
    .locals 3

    .line 1
    new-instance v0, Lbc/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p1, v1}, Lbc/i;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lz7/f;

    .line 8
    .line 9
    invoke-virtual {p0}, Lm7/i;->R()Ld7/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 14
    .line 15
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-class v2, Lm7/j;

    .line 20
    .line 21
    invoke-direct {p1, v1, v2, v0}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/lang/Class;Lbc/i;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lz7/f;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Lz7/f;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    check-cast p1, Lm7/j;

    .line 37
    .line 38
    return-object p1
.end method

.method public final varargs P([Ljava/lang/String;)Ljava/util/Iterator;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Lm7/i;->Q([Ljava/lang/String;I)Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final Q([Ljava/lang/String;I)Ljava/util/Iterator;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    if-le p2, v0, :cond_0

    .line 5
    .line 6
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    aget-object v1, p1, p2

    .line 10
    .line 11
    new-instance v2, Lbc/i;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v2, v1, v3}, Lbc/i;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lz7/f;

    .line 18
    .line 19
    invoke-virtual {p0}, Lm7/i;->R()Ld7/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 24
    .line 25
    invoke-virtual {v3}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-class v4, Lm7/j;

    .line 30
    .line 31
    invoke-direct {v1, v3, v4, v2}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/lang/Class;Lbc/i;)V

    .line 32
    .line 33
    .line 34
    if-eq p2, v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Lz7/f;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    new-instance v0, Lm7/h;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1, p2}, Lm7/h;-><init>(Lz7/f;[Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    return-object v1
.end method

.method public abstract R()Ld7/b;
.end method

.method public final S()Lm7/i;
    .locals 1

    .line 1
    invoke-super {p0}, Lm7/q;->L()Lm7/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lm7/i;

    .line 6
    .line 7
    return-object v0
.end method

.method public final T(I)Lm7/x;
    .locals 4

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    if-eq p1, v2, :cond_1

    .line 7
    .line 8
    if-eq p1, v1, :cond_1

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Lm7/x;

    .line 14
    .line 15
    new-instance v0, Ll7/j;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1}, Ll7/j;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, v0, v1}, Lm7/x;-><init>(Lk7/c;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    new-instance v3, Lm7/y;

    .line 26
    .line 27
    if-ne p1, v2, :cond_2

    .line 28
    .line 29
    new-instance p1, Lm7/l;

    .line 30
    .line 31
    invoke-direct {p1}, Lm7/l;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    if-ne p1, v1, :cond_3

    .line 36
    .line 37
    new-instance p1, Lm7/m;

    .line 38
    .line 39
    invoke-direct {p1}, Lm7/m;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    if-ne p1, v0, :cond_4

    .line 44
    .line 45
    new-instance p1, Lm7/w;

    .line 46
    .line 47
    invoke-direct {p1}, Lm7/w;-><init>()V

    .line 48
    .line 49
    .line 50
    :goto_1
    const/4 v0, 0x1

    .line 51
    invoke-direct {v3, p1, v0}, Lm7/x;-><init>(Lk7/c;I)V

    .line 52
    .line 53
    .line 54
    move-object p1, v3

    .line 55
    :goto_2
    invoke-virtual {p0}, Lm7/i;->R()Ld7/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p1}, Lo7/b;->M(Lk7/a;)Z

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_4
    invoke-static {p1}, Lj8/b;->u(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "Invalid chunk type: "

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm7/i;->S()Lm7/i;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lm7/r;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lm7/r;-><init>(Lm7/i;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
