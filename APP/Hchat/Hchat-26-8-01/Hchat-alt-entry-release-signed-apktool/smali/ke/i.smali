.class public abstract Lke/i;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static t0(Lud/n;Lae/h;Lud/a;)Z
    .locals 11

    .line 1
    iget-object v0, p1, Lae/h;->h:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    instance-of v2, p0, Lzd/c;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    check-cast p0, Lzd/c;

    .line 13
    .line 14
    iget-object p0, p0, Lzd/c;->q:Lxd/b;

    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Lke/i;->t0(Lud/n;Lae/h;Lud/a;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    instance-of v2, p0, Lud/i;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast p0, Lxd/a;

    .line 26
    .line 27
    iget-object p0, p0, Lxd/a;->i:Lud/n;

    .line 28
    .line 29
    invoke-static {p0, p1, p2}, Lke/i;->t0(Lud/n;Lae/h;Lud/a;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    new-instance v2, Lxd/b;

    .line 35
    .line 36
    invoke-direct {v2, p0}, Lxd/b;-><init>(Lud/n;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    iget-object v6, v2, Lxd/b;->k:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz v5, :cond_6

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lud/j;

    .line 60
    .line 61
    invoke-static {p2, v5}, Lf8/i;->O(Lud/a;Lud/j;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Lae/f;

    .line 82
    .line 83
    iget-object v8, v8, Lae/f;->c:Lud/a;

    .line 84
    .line 85
    if-eqz v8, :cond_4

    .line 86
    .line 87
    sget-object v9, Lmd/a;->u:Lmd/a;

    .line 88
    .line 89
    iget-object v10, v8, Lmd/e;->g:Lmd/f;

    .line 90
    .line 91
    invoke-virtual {v10, v9}, Lmd/f;->a(Lmd/a;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-nez v9, :cond_4

    .line 96
    .line 97
    invoke-static {v8, v5}, Lf8/i;->O(Lud/a;Lud/j;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_7

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    new-instance p2, Lxd/f;

    .line 116
    .line 117
    invoke-direct {p2, p0, v2}, Lxd/f;-><init>(Lud/n;Lxd/b;)V

    .line 118
    .line 119
    .line 120
    iput-object p2, v2, Lxd/a;->i:Lud/n;

    .line 121
    .line 122
    iput-object p1, p2, Lxd/f;->n:Lae/h;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 129
    .line 130
    invoke-direct {v4, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 131
    .line 132
    .line 133
    iput-object v4, p2, Lxd/f;->l:Ljava/util/Map;

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :cond_8
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lae/f;

    .line 150
    .line 151
    iget-object v4, v0, Lae/f;->e:Lxd/b;

    .line 152
    .line 153
    if-eqz v4, :cond_8

    .line 154
    .line 155
    iget-boolean v5, v0, Lae/f;->h:Z

    .line 156
    .line 157
    if-eqz v5, :cond_9

    .line 158
    .line 159
    iput-object v4, p2, Lxd/f;->m:Lud/j;

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    iget-object v5, p2, Lxd/f;->l:Ljava/util/Map;

    .line 163
    .line 164
    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_a
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Lud/j;

    .line 173
    .line 174
    invoke-interface {p0, p1, p2}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-nez p0, :cond_b

    .line 179
    .line 180
    :goto_3
    return v1

    .line 181
    :cond_b
    invoke-interface {v3, v6}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :cond_c
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_d

    .line 193
    .line 194
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Lud/j;

    .line 199
    .line 200
    instance-of p2, p1, Lxd/a;

    .line 201
    .line 202
    if-eqz p2, :cond_c

    .line 203
    .line 204
    check-cast p1, Lxd/a;

    .line 205
    .line 206
    iput-object v2, p1, Lxd/a;->i:Lud/n;

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_d
    const/4 p0, 0x1

    .line 210
    return p0
.end method
