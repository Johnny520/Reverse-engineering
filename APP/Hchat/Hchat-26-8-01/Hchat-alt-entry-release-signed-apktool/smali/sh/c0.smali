.class public final Lsh/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# virtual methods
.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0, p2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lv1/m0;

    .line 32
    .line 33
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-interface {v3, v4}, Lv1/m0;->M(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-le v3, v2, :cond_0

    .line 42
    .line 43
    move v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/16 v0, 0xc8

    .line 46
    .line 47
    int-to-float v0, v0

    .line 48
    invoke-interface {p1, v0}, Lu2/c;->G0(F)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v3, 0x120

    .line 53
    .line 54
    int-to-float v3, v3

    .line 55
    invoke-interface {p1, v3}, Lu2/c;->G0(F)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v2, v0, v3}, Lr9/e0;->r(III)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v9, 0x0

    .line 64
    const/16 v10, 0x8

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    move v7, v6

    .line 68
    move-wide v4, p3

    .line 69
    invoke-static/range {v4 .. v10}, Lu2/a;->a(JIIIII)J

    .line 70
    .line 71
    .line 72
    move-result-wide p3

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lv1/m0;

    .line 97
    .line 98
    invoke-interface {v2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p3, Lv1/b1;

    .line 121
    .line 122
    iget p3, p3, Lv1/b1;->h:I

    .line 123
    .line 124
    add-int/2addr v1, p3

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    new-instance p2, Lh0/o0;

    .line 127
    .line 128
    const/4 p3, 0x1

    .line 129
    invoke-direct {p2, p3, v0}, Lh0/o0;-><init>(ILjava/util/ArrayList;)V

    .line 130
    .line 131
    .line 132
    sget-object p3, Ltf/u;->g:Ltf/u;

    .line 133
    .line 134
    invoke-interface {p1, v6, v1, p3, p2}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1
.end method

.method public final i(Lv1/o;Ljava/util/List;I)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-static {p3, p2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lv1/m0;

    .line 35
    .line 36
    const v4, 0x7fffffff

    .line 37
    .line 38
    .line 39
    invoke-interface {v3, v4}, Lv1/m0;->M(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-le v3, v2, :cond_0

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 p3, 0xc8

    .line 48
    .line 49
    int-to-float p3, p3

    .line 50
    invoke-interface {p1, p3}, Lu2/c;->G0(F)I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    const/16 v3, 0x120

    .line 55
    .line 56
    int-to-float v3, v3

    .line 57
    invoke-interface {p1, v3}, Lu2/c;->G0(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {v2, p3, p1}, Lr9/e0;->r(III)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    invoke-static {p3, p2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_2

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, Lv1/m0;

    .line 92
    .line 93
    invoke-interface {p3, p1}, Lv1/m0;->p0(I)I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    add-int/2addr v1, p3

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    return v1
.end method
