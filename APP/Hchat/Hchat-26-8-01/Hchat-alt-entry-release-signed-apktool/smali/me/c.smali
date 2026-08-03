.class public final Lme/c;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final d(Lud/r;Lud/h;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lud/h;->g()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_a

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lud/p;

    .line 20
    .line 21
    iget-object v1, v0, Lud/p;->l:Lqd/r;

    .line 22
    .line 23
    iget-object v2, v0, Lud/p;->k:Lpd/k;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, v1, Lqd/r;->m:Lqd/s;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    :goto_1
    move v5, v4

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    iget-object v5, v1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v1}, Lqd/s;->j()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    move v5, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_4
    new-instance v6, Lce/i;

    .line 54
    .line 55
    invoke-direct {v6, p0, p1}, Lce/i;-><init>(Lme/c;Lud/r;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v6}, Lbe/h;->g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    :goto_2
    if-eqz v5, :cond_0

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const/16 v6, 0x22

    .line 69
    .line 70
    if-eq v5, v6, :cond_5

    .line 71
    .line 72
    const/16 v6, 0x26

    .line 73
    .line 74
    if-eq v5, v6, :cond_5

    .line 75
    .line 76
    move v5, v3

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    move v5, v4

    .line 79
    :goto_3
    if-eqz v5, :cond_6

    .line 80
    .line 81
    :goto_4
    move v3, v4

    .line 82
    goto :goto_6

    .line 83
    :cond_6
    invoke-virtual {v0}, Lud/p;->W()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_8

    .line 88
    .line 89
    :cond_7
    move v2, v4

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/16 v5, 0x8

    .line 96
    .line 97
    if-eq v2, v5, :cond_7

    .line 98
    .line 99
    const/16 v5, 0x14

    .line 100
    .line 101
    if-eq v2, v5, :cond_7

    .line 102
    .line 103
    move v2, v3

    .line 104
    :goto_5
    if-eqz v2, :cond_9

    .line 105
    .line 106
    sget-object v2, Lmd/a;->u:Lmd/a;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lmd/e;->w(Lmd/a;)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lmd/e;->w(Lmd/a;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_9
    :goto_6
    if-eqz v3, :cond_0

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    iput-object v2, v0, Lud/p;->l:Lqd/r;

    .line 121
    .line 122
    iget-object v0, p1, Lud/r;->D:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-object v0, v1, Lqd/s;->j:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_0

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lqd/r;

    .line 144
    .line 145
    iput-object v2, v1, Lqd/r;->m:Lqd/s;

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_a
    return-void
.end method
