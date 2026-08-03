.class public final Lch/c;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Ljava/util/List;

.field public h:Lfh/a;


# virtual methods
.method public final G(Lg6/b;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lch/c;->g:Ljava/util/List;

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
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v3}, Lg6/b;->e(Ljava/lang/CharSequence;)I

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
    iget-object v2, p0, Lch/c;->h:Lfh/a;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Lfh/a;->G(Lg6/b;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v2, v1

    .line 63
    :goto_2
    const/4 v3, 0x6

    .line 64
    invoke-virtual {p1, v3}, Lg6/b;->n(I)V

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    invoke-virtual {p1, v3, v2}, Lg6/b;->c(II)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x3

    .line 72
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 73
    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 87
    .line 88
    .line 89
    return v0
.end method
