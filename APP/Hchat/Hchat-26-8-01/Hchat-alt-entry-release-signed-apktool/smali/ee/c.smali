.class public final Lee/c;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lee/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lud/a;Lud/a;Lee/b;Lee/a;Ljava/util/HashMap;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v3, Lee/a;->e:Lee/b;

    .line 12
    .line 13
    new-instance v6, Lze/a;

    .line 14
    .line 15
    invoke-direct {v6, v0, v1}, Lze/a;-><init>(Lud/a;Lud/a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    check-cast v7, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0

    .line 31
    :cond_0
    iget-object v7, v1, Lmd/e;->g:Lmd/f;

    .line 32
    .line 33
    sget-object v8, Lmd/a;->l:Lmd/a;

    .line 34
    .line 35
    invoke-virtual {v7, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    iget-object v1, v1, Lud/a;->o:Ljava/util/List;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v1, v1, Lud/a;->n:Ljava/util/List;

    .line 45
    .line 46
    :goto_0
    iget-object v7, v0, Lmd/e;->g:Lmd/f;

    .line 47
    .line 48
    invoke-virtual {v7, v8}, Lmd/f;->a(Lmd/a;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, Lud/a;->o:Ljava/util/List;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, v0, Lud/a;->n:Ljava/util/List;

    .line 58
    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-ne v7, v8, :cond_c

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    move v8, v7

    .line 71
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-ge v8, v10, :cond_c

    .line 76
    .line 77
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    check-cast v10, Lud/a;

    .line 82
    .line 83
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, Lud/a;

    .line 88
    .line 89
    iget-object v12, v3, Lee/a;->b:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_b

    .line 96
    .line 97
    iget-object v12, v11, Lud/a;->l:Ljava/util/ArrayList;

    .line 98
    .line 99
    iget-object v13, v10, Lud/a;->l:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v15

    .line 109
    if-nez v15, :cond_4

    .line 110
    .line 111
    if-nez v14, :cond_6

    .line 112
    .line 113
    move-object/from16 v17, v0

    .line 114
    .line 115
    :cond_3
    const/4 v7, 0x1

    .line 116
    goto :goto_6

    .line 117
    :cond_4
    if-ge v14, v15, :cond_5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    iput-object v12, v3, Lee/a;->h:Ljava/util/List;

    .line 121
    .line 122
    iput v7, v3, Lee/a;->i:I

    .line 123
    .line 124
    :goto_3
    if-ge v7, v15, :cond_8

    .line 125
    .line 126
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    move-object/from16 v9, v16

    .line 131
    .line 132
    check-cast v9, Lud/p;

    .line 133
    .line 134
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    move-object/from16 v0, v16

    .line 141
    .line 142
    check-cast v0, Lud/p;

    .line 143
    .line 144
    invoke-static {v3, v9, v0}, Lee/c;->o(Lee/a;Lud/p;Lud/p;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    :cond_6
    :goto_4
    const/4 v9, 0x0

    .line 151
    goto :goto_8

    .line 152
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 153
    .line 154
    move-object/from16 v0, v17

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    move-object/from16 v17, v0

    .line 158
    .line 159
    if-le v14, v15, :cond_3

    .line 160
    .line 161
    iget-object v0, v11, Lud/a;->l:Ljava/util/ArrayList;

    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    :goto_5
    if-ge v7, v15, :cond_9

    .line 165
    .line 166
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    check-cast v9, Lud/p;

    .line 171
    .line 172
    invoke-virtual {v2, v11, v9}, Lee/b;->b(Lud/a;Lud/p;)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v7, v7, 0x1

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_9
    const/4 v7, 0x1

    .line 179
    iput-boolean v7, v2, Lee/b;->c:Z

    .line 180
    .line 181
    invoke-virtual {v5, v10}, Lee/b;->a(Lud/a;)V

    .line 182
    .line 183
    .line 184
    iput-boolean v7, v5, Lee/b;->c:Z

    .line 185
    .line 186
    :goto_6
    invoke-static {v11, v10, v2, v3, v4}, Lee/c;->i(Lud/a;Lud/a;Lee/b;Lee/a;Ljava/util/HashMap;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_a

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_a
    invoke-virtual {v2, v11}, Lee/b;->a(Lud/a;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v10}, Lee/b;->a(Lud/a;)V

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_b
    move-object/from16 v17, v0

    .line 201
    .line 202
    const/4 v7, 0x1

    .line 203
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 204
    .line 205
    move-object/from16 v0, v17

    .line 206
    .line 207
    const/4 v7, 0x0

    .line 208
    goto/16 :goto_2

    .line 209
    .line 210
    :cond_c
    const/4 v7, 0x1

    .line 211
    move v9, v7

    .line 212
    :goto_8
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v4, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    return v9
.end method

.method public static j(Lee/a;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z
    .locals 4

    .line 1
    iput-object p1, p0, Lee/a;->h:Ljava/util/List;

    .line 2
    .line 3
    iput p3, p0, Lee/a;->i:I

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    :goto_0
    if-ltz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lud/p;

    .line 18
    .line 19
    add-int v3, p3, v0

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lud/p;

    .line 26
    .line 27
    invoke-static {p0, v3, v2}, Lee/c;->o(Lee/a;Lud/p;Lud/p;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v1
.end method

.method public static k(Lqd/l;Lqd/l;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lqd/r;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p1, Lqd/r;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p0, Lqd/r;

    .line 15
    .line 16
    iget-object p0, p0, Lqd/r;->m:Lqd/s;

    .line 17
    .line 18
    check-cast p1, Lqd/r;

    .line 19
    .line 20
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 21
    .line 22
    invoke-virtual {p0}, Lqd/s;->b()Lqd/k;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, Lqd/s;->m(Lqd/k;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static l(Lee/b;Lmd/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lee/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/p;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lmd/e;->w(Lmd/a;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lee/b;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lud/p;

    .line 45
    .line 46
    iget-object v3, p0, Lee/b;->b:Ljava/util/IdentityHashMap;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lud/a;

    .line 53
    .line 54
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lud/a;

    .line 73
    .line 74
    iget-object v1, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lud/p;

    .line 91
    .line 92
    iget-object v2, v2, Lmd/e;->g:Lmd/f;

    .line 93
    .line 94
    invoke-virtual {v2, p1}, Lmd/f;->a(Lmd/a;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_2

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-virtual {v0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    return-void
.end method

.method public static m(Lud/r;Lae/h;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lae/h;->l:Z

    .line 6
    .line 7
    iget-object v3, v1, Lae/h;->h:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :cond_0
    :goto_0
    move/from16 v16, v4

    .line 13
    .line 14
    goto/16 :goto_18

    .line 15
    .line 16
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v5, :cond_5

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Lae/f;

    .line 32
    .line 33
    invoke-virtual {v5}, Lae/f;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    iget-object v2, v5, Lae/f;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_4

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, Lud/a;

    .line 56
    .line 57
    invoke-static {v7}, La/a;->c0(Lud/h;)Lud/p;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    if-eqz v8, :cond_3

    .line 62
    .line 63
    iget-object v8, v8, Lud/p;->k:Lpd/k;

    .line 64
    .line 65
    sget-object v9, Lpd/k;->r:Lpd/k;

    .line 66
    .line 67
    if-ne v8, v9, :cond_3

    .line 68
    .line 69
    invoke-static {v7}, La/a;->c0(Lud/h;)Lud/p;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    move-object v2, v6

    .line 75
    move-object v6, v5

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move-object v2, v6

    .line 78
    :goto_2
    if-eqz v6, :cond_0

    .line 79
    .line 80
    iget-object v5, v6, Lae/f;->d:Ljava/util/ArrayList;

    .line 81
    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    iget-object v7, v6, Lae/f;->c:Lud/a;

    .line 85
    .line 86
    new-instance v8, Ljava/util/ArrayList;

    .line 87
    .line 88
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    const/4 v11, 0x1

    .line 98
    invoke-static {v7, v7, v9, v10, v11}, La/a;->z(Lud/a;Lud/a;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    new-instance v9, Lce/n;

    .line 108
    .line 109
    const/4 v10, 0x5

    .line 110
    invoke-direct {v9, v10}, Lce/n;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v8, v9}, Lbe/h;->v(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eq v10, v11, :cond_6

    .line 122
    .line 123
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    new-instance v10, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v12, "Finally have unexpected throw blocks count: "

    .line 130
    .line 131
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v9, ", expect 1"

    .line 138
    .line 139
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v0, v9}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    check-cast v9, Lud/a;

    .line 155
    .line 156
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    invoke-static {v8, v9}, Lee/c;->n(Ljava/util/ArrayList;Lud/a;)V

    .line 160
    .line 161
    .line 162
    :goto_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    sget-object v10, Lmd/a;->s:Lmd/a;

    .line 167
    .line 168
    if-nez v9, :cond_28

    .line 169
    .line 170
    invoke-static {v8}, La/a;->l0(Ljava/util/List;)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_7

    .line 175
    .line 176
    goto/16 :goto_16

    .line 177
    .line 178
    :cond_7
    iget-object v7, v7, Lud/a;->o:Ljava/util/List;

    .line 179
    .line 180
    invoke-static {v7}, Lxe/s;->f(Ljava/util/List;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    check-cast v7, Lud/a;

    .line 185
    .line 186
    new-instance v9, Lee/a;

    .line 187
    .line 188
    invoke-direct {v9, v0, v7, v8}, Lee/a;-><init>(Lud/r;Lud/a;Ljava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    iget-object v7, v1, Lae/h;->k:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    xor-int/lit8 v12, v7, 0x1

    .line 198
    .line 199
    if-nez v7, :cond_8

    .line 200
    .line 201
    new-instance v13, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 204
    .line 205
    .line 206
    iget-object v14, v1, Lae/h;->k:Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    if-eqz v15, :cond_9

    .line 217
    .line 218
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    check-cast v15, Lae/h;

    .line 223
    .line 224
    iget-object v15, v15, Lae/h;->h:Ljava/util/List;

    .line 225
    .line 226
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_8
    move-object v13, v3

    .line 231
    :cond_9
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    if-eqz v14, :cond_a

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_a
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    move/from16 v16, v4

    .line 248
    .line 249
    iget-object v4, v9, Lee/a;->e:Lee/b;

    .line 250
    .line 251
    if-eqz v15, :cond_f

    .line 252
    .line 253
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    check-cast v15, Lae/f;

    .line 258
    .line 259
    if-ne v15, v6, :cond_b

    .line 260
    .line 261
    move/from16 v4, v16

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_b
    iget-object v15, v15, Lae/f;->d:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v15

    .line 270
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v17

    .line 274
    if-eqz v17, :cond_e

    .line 275
    .line 276
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v17

    .line 280
    move/from16 v18, v11

    .line 281
    .line 282
    move-object/from16 v11, v17

    .line 283
    .line 284
    check-cast v11, Lud/a;

    .line 285
    .line 286
    invoke-static {v11, v9}, Lee/c;->p(Lud/a;Lee/a;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-eqz v11, :cond_c

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_c
    iget-boolean v11, v4, Lee/b;->c:Z

    .line 294
    .line 295
    if-nez v11, :cond_d

    .line 296
    .line 297
    iget-object v11, v4, Lee/b;->a:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 300
    .line 301
    .line 302
    iget-object v11, v4, Lee/b;->b:Ljava/util/IdentityHashMap;

    .line 303
    .line 304
    invoke-virtual {v11}, Ljava/util/IdentityHashMap;->clear()V

    .line 305
    .line 306
    .line 307
    :cond_d
    move/from16 v11, v18

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_e
    move/from16 v18, v11

    .line 311
    .line 312
    :goto_7
    move/from16 v4, v16

    .line 313
    .line 314
    move/from16 v11, v18

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_f
    move/from16 v18, v11

    .line 318
    .line 319
    iget-object v11, v9, Lee/a;->c:Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 322
    .line 323
    .line 324
    move-result v14

    .line 325
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    add-int/lit8 v13, v13, -0x1

    .line 330
    .line 331
    if-ne v14, v13, :cond_10

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_10
    if-nez v7, :cond_29

    .line 335
    .line 336
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    add-int/lit8 v7, v7, -0x1

    .line 341
    .line 342
    if-eq v14, v7, :cond_11

    .line 343
    .line 344
    goto/16 :goto_18

    .line 345
    .line 346
    :cond_11
    move/from16 v12, v16

    .line 347
    .line 348
    :goto_8
    iget-object v7, v6, Lae/f;->g:Lae/h;

    .line 349
    .line 350
    iget-object v7, v7, Lae/h;->i:Ljava/util/List;

    .line 351
    .line 352
    invoke-static {v5}, La/a;->V(Ljava/util/List;)Lud/a;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-nez v5, :cond_12

    .line 357
    .line 358
    goto/16 :goto_18

    .line 359
    .line 360
    :cond_12
    invoke-static {v5}, La/a;->K(Lud/a;)Lud/a;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-static {v5}, La/a;->d0(Lud/a;)Lud/a;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    if-nez v13, :cond_13

    .line 369
    .line 370
    goto/16 :goto_18

    .line 371
    .line 372
    :cond_13
    iget-object v14, v13, Lud/a;->m:Ljava/util/List;

    .line 373
    .line 374
    invoke-interface {v14}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 375
    .line 376
    .line 377
    move-result-object v14

    .line 378
    new-instance v15, Lce/o;

    .line 379
    .line 380
    move-object/from16 v17, v7

    .line 381
    .line 382
    const/4 v7, 0x2

    .line 383
    invoke-direct {v15, v5, v7}, Lce/o;-><init>(Lud/a;I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v14, v15}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    iget-object v7, v0, Lud/r;->C:Lud/a;

    .line 391
    .line 392
    if-ne v13, v7, :cond_14

    .line 393
    .line 394
    new-instance v7, Lcom/alibaba/fastjson2/writer/b;

    .line 395
    .line 396
    const/16 v13, 0x11

    .line 397
    .line 398
    invoke-direct {v7, v13}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v5, v7}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    :cond_14
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    invoke-interface {v5, v7}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    check-cast v5, Ljava/util/List;

    .line 414
    .line 415
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    move/from16 v7, v16

    .line 420
    .line 421
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v13

    .line 425
    if-eqz v13, :cond_1b

    .line 426
    .line 427
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v13

    .line 431
    check-cast v13, Lud/a;

    .line 432
    .line 433
    invoke-static {v0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 434
    .line 435
    .line 436
    move-result-object v14

    .line 437
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v15

    .line 441
    if-nez v15, :cond_16

    .line 442
    .line 443
    invoke-static {v0}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 444
    .line 445
    .line 446
    move-result-object v15

    .line 447
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v19

    .line 451
    :goto_a
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v20

    .line 455
    if-eqz v20, :cond_15

    .line 456
    .line 457
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v20

    .line 461
    move-object/from16 v21, v5

    .line 462
    .line 463
    move-object/from16 v5, v20

    .line 464
    .line 465
    check-cast v5, Lud/a;

    .line 466
    .line 467
    iget v5, v5, Lud/a;->j:I

    .line 468
    .line 469
    invoke-virtual {v15, v5}, Ljava/util/BitSet;->set(I)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v5, v21

    .line 473
    .line 474
    goto :goto_a

    .line 475
    :cond_15
    move-object/from16 v21, v5

    .line 476
    .line 477
    invoke-virtual {v14, v15}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 478
    .line 479
    .line 480
    goto :goto_b

    .line 481
    :cond_16
    move-object/from16 v21, v5

    .line 482
    .line 483
    :goto_b
    new-instance v5, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 486
    .line 487
    .line 488
    new-instance v15, Lx8/h;

    .line 489
    .line 490
    move/from16 v19, v7

    .line 491
    .line 492
    const/4 v7, 0x1

    .line 493
    invoke-direct {v15, v5, v7}, Lx8/h;-><init>(Ljava/lang/Object;I)V

    .line 494
    .line 495
    .line 496
    invoke-static {v13, v14, v15}, La/a;->U0(Lud/a;Ljava/util/BitSet;Ljava/util/function/Predicate;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 504
    .line 505
    .line 506
    move-result v13

    .line 507
    if-ge v7, v13, :cond_18

    .line 508
    .line 509
    :cond_17
    move/from16 v7, v19

    .line 510
    .line 511
    :goto_c
    move-object/from16 v5, v21

    .line 512
    .line 513
    goto :goto_9

    .line 514
    :cond_18
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    :cond_19
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    if-eqz v7, :cond_17

    .line 523
    .line 524
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    check-cast v7, Lud/a;

    .line 529
    .line 530
    invoke-static {v7, v9}, Lee/c;->p(Lud/a;Lee/a;)Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-eqz v7, :cond_1a

    .line 535
    .line 536
    move/from16 v7, v18

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_1a
    iget-boolean v7, v4, Lee/b;->c:Z

    .line 540
    .line 541
    if-nez v7, :cond_19

    .line 542
    .line 543
    iget-object v7, v4, Lee/b;->a:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 546
    .line 547
    .line 548
    iget-object v7, v4, Lee/b;->b:Ljava/util/IdentityHashMap;

    .line 549
    .line 550
    invoke-virtual {v7}, Ljava/util/IdentityHashMap;->clear()V

    .line 551
    .line 552
    .line 553
    goto :goto_d

    .line 554
    :cond_1b
    move/from16 v19, v7

    .line 555
    .line 556
    if-nez v19, :cond_1c

    .line 557
    .line 558
    goto/16 :goto_18

    .line 559
    .line 560
    :cond_1c
    iget-object v5, v4, Lee/b;->a:Ljava/util/ArrayList;

    .line 561
    .line 562
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v8

    .line 570
    const-string v13, ", expected: "

    .line 571
    .line 572
    iget-object v14, v9, Lee/a;->a:Lud/r;

    .line 573
    .line 574
    if-eqz v8, :cond_1e

    .line 575
    .line 576
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    check-cast v8, Lee/b;

    .line 581
    .line 582
    iget-object v15, v8, Lee/b;->a:Ljava/util/ArrayList;

    .line 583
    .line 584
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 585
    .line 586
    .line 587
    move-result v15

    .line 588
    move-object/from16 v17, v7

    .line 589
    .line 590
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    if-eq v15, v7, :cond_1d

    .line 595
    .line 596
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    new-instance v3, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    const-string v4, "Incorrect finally slice size: "

    .line 607
    .line 608
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-virtual {v14, v1}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    goto :goto_11

    .line 628
    :cond_1d
    move-object/from16 v7, v17

    .line 629
    .line 630
    goto :goto_e

    .line 631
    :cond_1e
    move/from16 v7, v16

    .line 632
    .line 633
    :goto_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 634
    .line 635
    .line 636
    move-result v8

    .line 637
    if-ge v7, v8, :cond_21

    .line 638
    .line 639
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    check-cast v8, Lud/p;

    .line 644
    .line 645
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v9

    .line 649
    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v15

    .line 653
    if-eqz v15, :cond_20

    .line 654
    .line 655
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v15

    .line 659
    check-cast v15, Lee/b;

    .line 660
    .line 661
    iget-object v15, v15, Lee/b;->a:Ljava/util/ArrayList;

    .line 662
    .line 663
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    check-cast v15, Lud/p;

    .line 668
    .line 669
    move-object/from16 v17, v5

    .line 670
    .line 671
    iget-object v5, v8, Lud/p;->k:Lpd/k;

    .line 672
    .line 673
    move/from16 v19, v7

    .line 674
    .line 675
    iget-object v7, v15, Lud/p;->k:Lpd/k;

    .line 676
    .line 677
    if-eq v5, v7, :cond_1f

    .line 678
    .line 679
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    new-instance v3, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    const-string v4, "Incorrect finally slice insn: "

    .line 690
    .line 691
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-virtual {v14, v1}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    :goto_11
    const-string v1, "Finally extract failed"

    .line 711
    .line 712
    invoke-virtual {v0, v1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    return v16

    .line 716
    :cond_1f
    move-object/from16 v5, v17

    .line 717
    .line 718
    move/from16 v7, v19

    .line 719
    .line 720
    goto :goto_10

    .line 721
    :cond_20
    move-object/from16 v17, v5

    .line 722
    .line 723
    move/from16 v19, v7

    .line 724
    .line 725
    add-int/lit8 v7, v19, 0x1

    .line 726
    .line 727
    goto :goto_f

    .line 728
    :cond_21
    sget-object v0, Lmd/a;->C:Lmd/a;

    .line 729
    .line 730
    invoke-static {v4, v0}, Lee/c;->l(Lee/b;Lmd/a;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 738
    .line 739
    .line 740
    move-result v5

    .line 741
    if-eqz v5, :cond_22

    .line 742
    .line 743
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    check-cast v5, Lee/b;

    .line 748
    .line 749
    invoke-static {v5, v10}, Lee/c;->l(Lee/b;Lmd/a;)V

    .line 750
    .line 751
    .line 752
    goto :goto_12

    .line 753
    :cond_22
    iget-object v0, v4, Lee/b;->a:Ljava/util/ArrayList;

    .line 754
    .line 755
    move/from16 v4, v16

    .line 756
    .line 757
    :goto_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    if-ge v4, v5, :cond_25

    .line 762
    .line 763
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    check-cast v5, Lud/p;

    .line 768
    .line 769
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v7

    .line 773
    :cond_23
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v8

    .line 777
    if-eqz v8, :cond_24

    .line 778
    .line 779
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v8

    .line 783
    check-cast v8, Lee/b;

    .line 784
    .line 785
    iget-object v8, v8, Lee/b;->a:Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v8

    .line 791
    check-cast v8, Lud/p;

    .line 792
    .line 793
    iget-object v9, v5, Lud/p;->l:Lqd/r;

    .line 794
    .line 795
    iget-object v13, v8, Lud/p;->l:Lqd/r;

    .line 796
    .line 797
    invoke-static {v9, v13}, Lee/c;->k(Lqd/l;Lqd/l;)V

    .line 798
    .line 799
    .line 800
    iget-object v9, v5, Lud/p;->m:Ljava/util/List;

    .line 801
    .line 802
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 803
    .line 804
    .line 805
    move-result v9

    .line 806
    move/from16 v13, v16

    .line 807
    .line 808
    :goto_14
    if-ge v13, v9, :cond_23

    .line 809
    .line 810
    invoke-virtual {v5, v13}, Lud/p;->S(I)Lqd/l;

    .line 811
    .line 812
    .line 813
    move-result-object v14

    .line 814
    invoke-virtual {v8, v13}, Lud/p;->S(I)Lqd/l;

    .line 815
    .line 816
    .line 817
    move-result-object v15

    .line 818
    invoke-static {v14, v15}, Lee/c;->k(Lqd/l;Lqd/l;)V

    .line 819
    .line 820
    .line 821
    add-int/lit8 v13, v13, 0x1

    .line 822
    .line 823
    goto :goto_14

    .line 824
    :cond_24
    add-int/lit8 v4, v4, 0x1

    .line 825
    .line 826
    goto :goto_13

    .line 827
    :cond_25
    move/from16 v4, v18

    .line 828
    .line 829
    iput-boolean v4, v6, Lae/f;->h:Z

    .line 830
    .line 831
    if-eqz v12, :cond_27

    .line 832
    .line 833
    iget-object v0, v1, Lae/h;->k:Ljava/util/List;

    .line 834
    .line 835
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v5

    .line 843
    if-eqz v5, :cond_26

    .line 844
    .line 845
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v5

    .line 849
    check-cast v5, Lae/h;

    .line 850
    .line 851
    iget-object v6, v5, Lae/h;->h:Ljava/util/List;

    .line 852
    .line 853
    invoke-interface {v3, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 854
    .line 855
    .line 856
    iget-object v6, v1, Lae/h;->i:Ljava/util/List;

    .line 857
    .line 858
    iget-object v7, v5, Lae/h;->i:Ljava/util/List;

    .line 859
    .line 860
    invoke-interface {v6, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 861
    .line 862
    .line 863
    const/4 v6, 0x1

    .line 864
    iput-boolean v6, v5, Lae/h;->l:Z

    .line 865
    .line 866
    goto :goto_15

    .line 867
    :cond_26
    iget-object v3, v1, Lae/h;->i:Ljava/util/List;

    .line 868
    .line 869
    new-instance v4, Ljava/util/ArrayList;

    .line 870
    .line 871
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 872
    .line 873
    invoke-direct {v5, v3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 874
    .line 875
    .line 876
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 877
    .line 878
    .line 879
    iput-object v4, v1, Lae/h;->i:Ljava/util/List;

    .line 880
    .line 881
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 882
    .line 883
    .line 884
    :cond_27
    const/4 v4, 0x1

    .line 885
    goto :goto_17

    .line 886
    :cond_28
    :goto_16
    iget-object v0, v6, Lae/f;->g:Lae/h;

    .line 887
    .line 888
    iget-object v0, v0, Lae/h;->h:Ljava/util/List;

    .line 889
    .line 890
    invoke-interface {v0, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    const/4 v4, 0x1

    .line 894
    iput-boolean v4, v6, Lae/f;->i:Z

    .line 895
    .line 896
    new-instance v0, Lae/e;

    .line 897
    .line 898
    const/4 v1, 0x0

    .line 899
    invoke-direct {v0, v1}, Lae/e;-><init>(I)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 903
    .line 904
    .line 905
    :goto_17
    invoke-virtual {v2, v10}, Lmd/e;->w(Lmd/a;)V

    .line 906
    .line 907
    .line 908
    return v4

    .line 909
    :cond_29
    :goto_18
    return v16
.end method

.method public static n(Ljava/util/ArrayList;Lud/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lud/a;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lud/a;

    .line 18
    .line 19
    iget-object v2, v1, Lud/a;->l:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, v1, Lud/a;->o:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v2, v1, Lud/a;->n:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :goto_1
    if-nez v2, :cond_0

    .line 50
    .line 51
    invoke-static {p0, v1}, Lee/c;->n(Ljava/util/ArrayList;Lud/a;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void
.end method

.method public static o(Lee/a;Lud/p;Lud/p;)Z
    .locals 11

    .line 1
    invoke-virtual {p1, p2}, Lud/p;->Y(Lud/p;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_c

    .line 9
    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    iget-object v2, p1, Lud/p;->m:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-ge v0, v2, :cond_12

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lud/p;->S(I)Lqd/l;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p2, v0}, Lud/p;->S(I)Lqd/l;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    instance-of v5, v2, Lqd/r;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    instance-of v6, v4, Lqd/r;

    .line 37
    .line 38
    if-eq v5, v6, :cond_1

    .line 39
    .line 40
    :goto_1
    move v3, v1

    .line 41
    goto/16 :goto_b

    .line 42
    .line 43
    :cond_1
    if-eqz v5, :cond_d

    .line 44
    .line 45
    move-object v5, v2

    .line 46
    check-cast v5, Lqd/r;

    .line 47
    .line 48
    move-object v6, v4

    .line 49
    check-cast v6, Lqd/r;

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Lqd/r;->g0(Lqd/r;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_d

    .line 56
    .line 57
    iget-object v7, v6, Lmd/e;->g:Lmd/f;

    .line 58
    .line 59
    sget-object v8, Lmd/b;->L:Lmd/b;

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Lnd/d0;

    .line 66
    .line 67
    iget-object v9, v5, Lmd/e;->g:Lmd/f;

    .line 68
    .line 69
    invoke-virtual {v9, v8}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, Lnd/d0;

    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    if-nez v8, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v8, v7}, Lnd/d0;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    :goto_2
    move v7, v1

    .line 86
    :goto_3
    if-nez v7, :cond_d

    .line 87
    .line 88
    iget-object v7, p0, Lee/a;->e:Lee/b;

    .line 89
    .line 90
    iget-object v7, v7, Lee/b;->a:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v6}, Lqd/r;->f0()Lud/p;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-static {v7, v8, v1}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    const/4 v8, -0x1

    .line 101
    if-eq v7, v8, :cond_4

    .line 102
    .line 103
    move v7, v3

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    move v7, v1

    .line 106
    :goto_4
    if-eqz v7, :cond_5

    .line 107
    .line 108
    :goto_5
    move v7, v1

    .line 109
    goto :goto_7

    .line 110
    :cond_5
    invoke-virtual {v5}, Lqd/r;->f0()Lud/p;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    iget-object v9, p0, Lee/a;->g:Lee/b;

    .line 115
    .line 116
    if-eqz v9, :cond_7

    .line 117
    .line 118
    iget-object v9, v9, Lee/b;->a:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v9, v7, v1}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eq v9, v8, :cond_6

    .line 125
    .line 126
    move v9, v3

    .line 127
    goto :goto_6

    .line 128
    :cond_6
    move v9, v1

    .line 129
    :goto_6
    if-eqz v9, :cond_7

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    iget-object v9, p0, Lee/a;->h:Ljava/util/List;

    .line 133
    .line 134
    invoke-static {v9}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-eqz v10, :cond_8

    .line 139
    .line 140
    iget v10, p0, Lee/a;->i:I

    .line 141
    .line 142
    invoke-static {v9, v7, v10}, Lxe/k;->a(Ljava/util/List;Lud/p;I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eq v7, v8, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move v7, v3

    .line 150
    :goto_7
    if-eqz v7, :cond_d

    .line 151
    .line 152
    invoke-virtual {v6}, Lqd/r;->f0()Lud/p;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v5}, Lqd/r;->f0()Lud/p;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v6, :cond_a

    .line 161
    .line 162
    if-nez v5, :cond_9

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_9
    invoke-virtual {v6, v5}, Lud/p;->Y(Lud/p;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-nez v7, :cond_b

    .line 170
    .line 171
    :cond_a
    :goto_8
    move v5, v3

    .line 172
    goto :goto_9

    .line 173
    :cond_b
    invoke-virtual {v6}, Lud/p;->W()Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_c

    .line 178
    .line 179
    invoke-virtual {v5}, Lud/p;->W()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_c

    .line 184
    .line 185
    invoke-virtual {v6, v5}, Lud/p;->X(Lud/p;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    xor-int/2addr v5, v3

    .line 190
    goto :goto_9

    .line 191
    :cond_c
    move v5, v1

    .line 192
    :goto_9
    if-eqz v5, :cond_d

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :cond_d
    invoke-virtual {v2}, Lqd/l;->K()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-virtual {v4}, Lqd/l;->K()Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eq v5, v6, :cond_e

    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :cond_e
    if-eqz v5, :cond_10

    .line 209
    .line 210
    invoke-virtual {v2}, Lqd/l;->K()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_f

    .line 215
    .line 216
    invoke-virtual {v4}, Lqd/l;->K()Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    goto :goto_a

    .line 227
    :cond_f
    move v2, v1

    .line 228
    :goto_a
    if-nez v2, :cond_10

    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_10
    :goto_b
    if-nez v3, :cond_11

    .line 233
    .line 234
    :goto_c
    return v1

    .line 235
    :cond_11
    add-int/lit8 v0, v0, 0x1

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_12
    return v3
.end method

.method public static p(Lud/a;Lee/a;)Z
    .locals 12

    .line 1
    iget-object v0, p1, Lee/a;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_0
    iget-object v0, p1, Lee/a;->f:Lud/a;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, p1, Lee/a;->g:Lee/b;

    .line 16
    .line 17
    iget-object v3, p1, Lee/a;->e:Lee/b;

    .line 18
    .line 19
    iget-object v4, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v5, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v8, 0x1

    .line 32
    if-ge v6, v7, :cond_1

    .line 33
    .line 34
    :goto_0
    move-object v10, v2

    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_1
    if-ne v6, v7, :cond_3

    .line 38
    .line 39
    invoke-static {p1, v4, v5, v1}, Lee/c;->j(Lee/a;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-nez v7, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v7, v1

    .line 47
    move v9, v7

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    sub-int v9, v6, v7

    .line 50
    .line 51
    invoke-static {p1, v4, v5, v9}, Lee/c;->j(Lee/a;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-nez v10, :cond_6

    .line 56
    .line 57
    move v10, v8

    .line 58
    :goto_1
    if-ge v10, v9, :cond_5

    .line 59
    .line 60
    invoke-static {p1, v4, v5, v10}, Lee/c;->j(Lee/a;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    add-int/2addr v7, v10

    .line 67
    move v9, v10

    .line 68
    move v10, v8

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    move v7, v1

    .line 74
    move v10, v7

    .line 75
    :goto_2
    if-nez v10, :cond_7

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_6
    move v7, v1

    .line 79
    :cond_7
    :goto_3
    new-instance v10, Lee/b;

    .line 80
    .line 81
    invoke-direct {v10}, Lee/b;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v10, p1, Lee/a;->g:Lee/b;

    .line 85
    .line 86
    if-eqz v7, :cond_8

    .line 87
    .line 88
    add-int/lit8 v6, v7, 0x1

    .line 89
    .line 90
    move v7, v8

    .line 91
    goto :goto_4

    .line 92
    :cond_8
    move v7, v1

    .line 93
    :goto_4
    if-ge v9, v6, :cond_9

    .line 94
    .line 95
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    check-cast v11, Lud/p;

    .line 100
    .line 101
    invoke-virtual {v10, p0, v11}, Lee/b;->b(Lud/a;Lud/p;)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v9, v9, 0x1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_9
    iget-boolean v4, v3, Lee/b;->c:Z

    .line 108
    .line 109
    if-eqz v4, :cond_a

    .line 110
    .line 111
    iget-object v4, v3, Lee/b;->a:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    iget-object v5, v10, Lee/b;->a:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eq v4, v5, :cond_b

    .line 124
    .line 125
    iget-object v4, p1, Lee/a;->a:Lud/r;

    .line 126
    .line 127
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    new-instance v7, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v9, "Another duplicated slice has different insns count: "

    .line 138
    .line 139
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v5, ", finally: "

    .line 146
    .line 147
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v4, v5}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_b

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, Lud/p;

    .line 176
    .line 177
    invoke-virtual {v3, v0, v5}, Lee/b;->b(Lud/a;Lud/p;)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_b
    if-eqz v7, :cond_c

    .line 182
    .line 183
    iput-boolean v8, v10, Lee/b;->c:Z

    .line 184
    .line 185
    iput-boolean v8, v3, Lee/b;->c:Z

    .line 186
    .line 187
    :cond_c
    :goto_6
    if-nez v10, :cond_d

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_d
    iget-boolean v4, v10, Lee/b;->c:Z

    .line 191
    .line 192
    if-nez v4, :cond_e

    .line 193
    .line 194
    new-instance v4, Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-static {p0, v0, v10, p1, v4}, Lee/c;->i(Lud/a;Lud/a;Lee/b;Lee/a;Ljava/util/HashMap;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_11

    .line 204
    .line 205
    iput-boolean v8, v10, Lee/b;->c:Z

    .line 206
    .line 207
    iput-boolean v8, v3, Lee/b;->c:Z

    .line 208
    .line 209
    :cond_e
    iget-object p0, v10, Lee/b;->a:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_f

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_f
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-ne v0, v8, :cond_10

    .line 223
    .line 224
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    check-cast p0, Lud/p;

    .line 229
    .line 230
    iget-object p0, p0, Lud/p;->k:Lpd/k;

    .line 231
    .line 232
    sget-object v0, Lpd/k;->v:Lpd/k;

    .line 233
    .line 234
    if-ne p0, v0, :cond_10

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_10
    move-object v2, v10

    .line 238
    :cond_11
    :goto_7
    if-nez v2, :cond_12

    .line 239
    .line 240
    :goto_8
    return v1

    .line 241
    :cond_12
    iget-object p0, p1, Lee/a;->c:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    return v8
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 5

    .line 1
    sget-object v0, Lmd/b;->t:Lmd/b;

    .line 2
    .line 3
    iget-boolean v1, p1, Lud/r;->p:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    iget-object v1, p1, Lud/r;->E:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    :try_start_0
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lae/h;

    .line 39
    .line 40
    invoke-static {p1, v4}, Lee/c;->m(Lud/r;Lae/h;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    or-int/2addr v3, v4

    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget-object v2, p1, Lud/r;->E:Ljava/util/List;

    .line 51
    .line 52
    new-instance v3, Lud/b;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v3, v4}, Lud/b;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v3}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 59
    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lce/n;

    .line 67
    .line 68
    const/4 v3, 0x4

    .line 69
    invoke-direct {v1, v3}, Lce/n;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lmd/e;->E(Loc/a;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lmd/e;->C()Lmd/f;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v1, Lmd/d;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-direct {v1, v0, v3}, Lmd/d;-><init>(Lmd/f;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_1
    const-string v1, "Undo finally extract visitor"

    .line 96
    .line 97
    invoke-virtual {p1, v1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :try_start_1
    invoke-virtual {p1}, Lud/r;->e0()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lud/r;->a0()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p1, Lud/r;->l:Lud/e;

    .line 107
    .line 108
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 109
    .line 110
    iget-object v0, v0, Lud/u;->r:Ldd/b;

    .line 111
    .line 112
    iget-object v0, v0, Ldd/b;->a:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lbe/a;

    .line 129
    .line 130
    instance-of v2, v1, Lee/c;

    .line 131
    .line 132
    if-eqz v2, :cond_2

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_2
    invoke-static {v1, p1}, Lbe/h;->i0(Lbe/a;Lud/r;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catch_1
    move-exception v0

    .line 140
    const-string v1, "Undo finally extract failed"

    .line 141
    .line 142
    invoke-static {p1, v1, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    :goto_3
    return-void
.end method
