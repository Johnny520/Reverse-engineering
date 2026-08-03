.class public final Lke/j;
.super Lf1/n0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static p(Lud/j;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lud/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lud/h;

    .line 6
    .line 7
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    check-cast p0, Lmd/e;

    .line 18
    .line 19
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 20
    .line 21
    sget-object v0, Lmd/a;->n:Lmd/a;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v0, p0, Lud/n;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    check-cast p0, Lud/n;

    .line 35
    .line 36
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lud/j;

    .line 55
    .line 56
    invoke-static {v0}, Lke/j;->p(Lud/j;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    :cond_2
    const/4 p0, 0x0

    .line 63
    return p0

    .line 64
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "Unknown container type: "

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return p0
.end method


# virtual methods
.method public final a(Lud/r;Lud/n;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lf1/n0;->a(Lud/r;Lud/n;)Z

    .line 2
    .line 3
    .line 4
    instance-of p1, p2, Lxd/d;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final l(Lud/r;Lud/h;Lud/n;)V
    .locals 5

    .line 1
    iget-object p3, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lud/a;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    check-cast p2, Lud/a;

    .line 16
    .line 17
    iget-object v0, p2, Lmd/e;->g:Lmd/f;

    .line 18
    .line 19
    sget-object v1, Lmd/a;->n:Lmd/a;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_a

    .line 26
    .line 27
    iget-object v0, p2, Lud/a;->l:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-ne v2, v3, :cond_a

    .line 35
    .line 36
    iget-object v2, p1, Lud/r;->F:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1, p2}, Lud/r;->U(Lud/a;)Lnd/t;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_2
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lud/n;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-class v3, Lzd/c;

    .line 73
    .line 74
    if-ne v2, v3, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_0
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    move-object p3, p2

    .line 82
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_9

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lud/n;

    .line 93
    .line 94
    instance-of v3, v2, Lud/i;

    .line 95
    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-interface {v2}, Lud/n;->u()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_8

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-interface {v3, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :cond_6
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_8

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, Lud/j;

    .line 128
    .line 129
    if-ne v4, p3, :cond_7

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    invoke-static {v4}, Lke/j;->p(Lud/j;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    :goto_2
    move-object p3, v2

    .line 140
    goto :goto_1

    .line 141
    :cond_9
    const/4 p1, 0x0

    .line 142
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v1}, Lmd/e;->D(Lmd/a;)V

    .line 146
    .line 147
    .line 148
    :cond_a
    :goto_3
    return-void
.end method
