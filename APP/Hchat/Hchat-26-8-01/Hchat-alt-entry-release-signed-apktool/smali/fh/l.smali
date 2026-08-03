.class public final Lfh/l;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Ljava/util/List;


# virtual methods
.method public final G(Lg6/b;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lfh/l;->g:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lfh/k;

    .line 30
    .line 31
    invoke-virtual {v3, p1}, Lfh/k;->G(Lg6/b;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v2}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Lg6/b;->f([I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v0, v1

    .line 53
    :goto_1
    const/4 v2, 0x3

    .line 54
    invoke-virtual {p1, v2}, Lg6/b;->n(I)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 69
    .line 70
    .line 71
    return v0
.end method

.method public final k0(Lfh/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/l;->g:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lfh/l;->g:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
