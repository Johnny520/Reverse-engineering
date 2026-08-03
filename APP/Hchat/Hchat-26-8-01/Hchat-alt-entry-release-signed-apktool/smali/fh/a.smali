.class public final Lfh/a;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lgh/c;

.field public h:Lfh/a;

.field public i:Lfh/j;

.field public j:Lfh/l;

.field public k:Ljava/util/ArrayList;


# direct methods
.method public static r0(Lfh/a;Ljava/util/Collection;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    new-instance v2, Lgh/c;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v2, v1, v3}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lfh/a;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lfh/a;->g:Lgh/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lgh/c;->G(Lg6/b;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    iget-object v2, p0, Lfh/a;->h:Lfh/a;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lfh/a;->G(Lg6/b;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    :goto_1
    iget-object v3, p0, Lfh/a;->i:Lfh/j;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lfh/j;->G(Lg6/b;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v3, v1

    .line 32
    :goto_2
    iget-object v4, p0, Lfh/a;->j:Lfh/l;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lfh/l;->G(Lg6/b;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_3
    iget-object v5, p0, Lfh/a;->k:Ljava/util/ArrayList;

    .line 43
    .line 44
    if-eqz v5, :cond_5

    .line 45
    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Lgh/c;

    .line 70
    .line 71
    invoke-virtual {v7, p1}, Lgh/c;->G(Lg6/b;)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-static {v6}, Ltf/m;->O1(Ljava/util/ArrayList;)[I

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {p1, v5}, Lg6/b;->f([I)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move v5, v1

    .line 93
    :goto_5
    const/16 v6, 0x9

    .line 94
    .line 95
    invoke-virtual {p1, v6}, Lg6/b;->n(I)V

    .line 96
    .line 97
    .line 98
    const/16 v6, 0x8

    .line 99
    .line 100
    invoke-virtual {p1, v6, v5}, Lg6/b;->c(II)V

    .line 101
    .line 102
    .line 103
    const/4 v5, 0x7

    .line 104
    invoke-virtual {p1, v5, v4}, Lg6/b;->c(II)V

    .line 105
    .line 106
    .line 107
    const/4 v4, 0x6

    .line 108
    invoke-virtual {p1, v4, v3}, Lg6/b;->c(II)V

    .line 109
    .line 110
    .line 111
    const/4 v3, 0x5

    .line 112
    invoke-virtual {p1, v3, v1}, Lg6/b;->c(II)V

    .line 113
    .line 114
    .line 115
    const/4 v3, 0x4

    .line 116
    invoke-virtual {p1, v3, v1}, Lg6/b;->c(II)V

    .line 117
    .line 118
    .line 119
    const/4 v3, 0x3

    .line 120
    invoke-virtual {p1, v3, v2}, Lg6/b;->c(II)V

    .line 121
    .line 122
    .line 123
    const/4 v2, 0x2

    .line 124
    invoke-virtual {p1, v2, v1}, Lg6/b;->c(II)V

    .line 125
    .line 126
    .line 127
    const/4 v2, 0x1

    .line 128
    invoke-virtual {p1, v2, v0}, Lg6/b;->c(II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1, v1}, Lg6/b;->c(II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 139
    .line 140
    .line 141
    return v0
.end method

.method public final k0(Ljava/lang/Class;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfh/a;->i:Lfh/j;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lfh/j;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object v0, p0, Lfh/a;->i:Lfh/j;

    .line 15
    .line 16
    new-instance v1, Lfh/i;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lfh/a;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkh/b;->d(Ljava/lang/Class;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v3, 0x5

    .line 31
    invoke-virtual {v2, v3, p1}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v1, Lfh/i;->g:Lfh/a;

    .line 35
    .line 36
    iget-object p1, v0, Lfh/j;->h:Ljava/util/List;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    new-instance p1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-object p1, v0, Lfh/j;->h:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final l0(Lfh/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/a;->j:Lfh/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfh/l;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lfh/a;->j:Lfh/l;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lfh/l;->k0(Lfh/k;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final m0(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lgh/c;

    .line 7
    .line 8
    invoke-direct {v0, p2, p1}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lfh/a;->g:Lgh/c;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    throw p1
.end method

.method public final n0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfh/a;->i:Lfh/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfh/j;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lfh/j;-><init>(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v0, p0, Lfh/a;->i:Lfh/j;

    .line 12
    .line 13
    new-instance v1, Lgh/a;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lgh/a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lfh/j;->i:Lgh/a;

    .line 19
    .line 20
    return-void
.end method

.method public final o0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lfh/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lgh/c;

    .line 7
    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {v1, p1, v2}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lfh/a;->g:Lgh/c;

    .line 13
    .line 14
    iput-object v0, p0, Lfh/a;->h:Lfh/a;

    .line 15
    .line 16
    return-void
.end method

.method public final varargs p0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Lgh/c;

    .line 14
    .line 15
    const/4 v5, 0x5

    .line 16
    invoke-direct {v4, v3, v5}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lfh/a;->k:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method

.method public final varargs q0([Ljava/lang/String;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, p1, v2

    .line 12
    .line 13
    new-instance v4, Lgh/c;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-direct {v4, v3, v5}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lfh/a;->k:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method
