.class public final Ls7/c;
.super Lo7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static l0(Ls7/b;)Lz7/c;
    .locals 5

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lz7/c;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lz7/c;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lv7/d;

    .line 20
    .line 21
    invoke-virtual {v3}, Lv7/d;->y()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Lv7/d;->L()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final k0(Ls7/b;Lk7/f;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ls7/d;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lo7/b;->b0(Lk7/f;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p1, Ls7/d;->n:Lo7/c;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Ls7/c;

    .line 15
    .line 16
    iget-object v1, v1, Lo7/b;->l:Lk7/f;

    .line 17
    .line 18
    sget-object v2, Lr7/k;->p:Lokio/a;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-ne v1, v2, :cond_3

    .line 22
    .line 23
    check-cast v0, Ls7/c;

    .line 24
    .line 25
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 26
    .line 27
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x2

    .line 32
    if-ge v1, v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    if-eq p1, v1, :cond_2

    .line 41
    .line 42
    new-instance v2, Ls7/a;

    .line 43
    .line 44
    invoke-direct {v2, p1}, Ls7/a;-><init>(Ls7/b;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lz7/c;->k(Lz7/t;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lo7/b;->h0(I)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const-string p1, "swappable == this"

    .line 58
    .line 59
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    :goto_0
    invoke-static {p1}, Ls7/c;->l0(Ls7/b;)Lz7/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v1, v0, Lz7/c;->i:I

    .line 68
    .line 69
    add-int/lit8 v2, v1, -0x1

    .line 70
    .line 71
    iget-object v4, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 72
    .line 73
    aget-object v2, v4, v2

    .line 74
    .line 75
    check-cast v2, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {p0}, Lo7/b;->N()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p2}, Lo7/b;->b0(Lk7/f;)V

    .line 85
    .line 86
    .line 87
    move p2, v3

    .line 88
    move v4, p2

    .line 89
    :goto_1
    if-ge p2, v1, :cond_5

    .line 90
    .line 91
    iget-object v5, v0, Lz7/c;->g:[Ljava/lang/Object;

    .line 92
    .line 93
    aget-object v5, v5, p2

    .line 94
    .line 95
    check-cast v5, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    if-ge v4, v5, :cond_4

    .line 104
    .line 105
    invoke-virtual {p1, v4}, Lo7/b;->O(I)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 110
    .line 111
    move v4, v5

    .line 112
    goto :goto_1

    .line 113
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    invoke-virtual {p1, v2, v3}, Ls7/d;->d0(IZ)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Lo7/b;->k:Lz7/c;

    .line 119
    .line 120
    invoke-virtual {p1}, Lz7/c;->size()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    invoke-virtual {p0, p1}, Lo7/c;->c0(I)V

    .line 125
    .line 126
    .line 127
    return-void
.end method
