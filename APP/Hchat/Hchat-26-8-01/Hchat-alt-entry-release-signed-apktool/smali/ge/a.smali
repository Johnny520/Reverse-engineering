.class public final Lge/a;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/d;


# instance fields
.field public g:Z

.field public h:Ll3/w;


# virtual methods
.method public final c(Lud/r;Lud/n;)Z
    .locals 4

    .line 1
    iget-boolean p1, p0, Lge/a;->g:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    instance-of p1, p2, Lxd/d;

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    check-cast p2, Lxd/d;

    .line 12
    .line 13
    iget-object p1, p2, Lxd/d;->l:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lxd/c;

    .line 30
    .line 31
    iget-object p2, p2, Lxd/c;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    instance-of v2, v1, Lud/g;

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    check-cast v1, Lud/g;

    .line 52
    .line 53
    iget-object v1, v1, Lud/g;->k:Lud/e;

    .line 54
    .line 55
    invoke-virtual {v1}, Lud/e;->a0()Lud/e;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, Lye/f;->a:Lmh/b;

    .line 60
    .line 61
    iget-object v2, v1, Lud/e;->x:Lud/e;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, v2, Lud/e;->m:Lod/a;

    .line 66
    .line 67
    invoke-virtual {v2}, Lod/a;->k()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "R"

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object v1, v1, Lud/e;->m:Lod/a;

    .line 80
    .line 81
    invoke-virtual {v1}, Lod/a;->f()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "android.R"

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Lge/a;->g:Z

    .line 95
    .line 96
    iget-object p1, p0, Lge/a;->h:Ll3/w;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_0
    return v0
.end method

.method public final f(Lud/u;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lud/u;->k:Ll3/w;

    .line 2
    .line 3
    iput-object p1, p0, Lge/a;->h:Ll3/w;

    .line 4
    .line 5
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 2

    .line 1
    sget-object v0, Loc/c;->a:Loc/c;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lpc/d;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lge/a;->i(Lpc/d;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lge/a;->g:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-boolean v0, p0, Lge/a;->g:Z

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lnd/c;->g:Lnd/c;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lnd/d;->b(Lud/r;Lnd/c;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p1, p0}, Lx6/d;->i0(Lud/r;Lke/d;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Lud/e;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lge/a;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Loc/c;->a:Loc/c;

    .line 7
    .line 8
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lpc/d;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lge/a;->i(Lpc/d;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method public final i(Lpc/d;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p1, Lpc/d;->g:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lnc/b;

    .line 24
    .line 25
    iget v1, v0, Lnc/b;->a:I

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lnc/a;

    .line 58
    .line 59
    iget-object v1, v1, Lnc/a;->h:Ljava/lang/Object;

    .line 60
    .line 61
    instance-of v2, v1, Lud/l;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    check-cast v1, Lud/l;

    .line 66
    .line 67
    invoke-interface {v1}, Lud/l;->f()Lod/c;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Lod/c;->g:Lod/a;

    .line 72
    .line 73
    iget-object v1, v1, Lod/a;->k:Lod/a;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object v2, v1, Lod/a;->h:Ljava/lang/String;

    .line 78
    .line 79
    const-string v3, "R"

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    iget-object v1, v1, Lod/a;->j:Ljava/lang/String;

    .line 88
    .line 89
    const-string v2, "android.R"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_2

    .line 96
    .line 97
    iget-object p1, p0, Lge/a;->h:Ll3/w;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x1

    .line 103
    return p1

    .line 104
    :cond_3
    const/4 p1, 0x0

    .line 105
    return p1
.end method
