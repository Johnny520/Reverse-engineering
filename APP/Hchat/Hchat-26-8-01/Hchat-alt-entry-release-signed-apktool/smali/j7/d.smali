.class public final Lj7/d;
.super Lk7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final V()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 7
    .line 8
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lo7/j;

    .line 24
    .line 25
    iget-object v4, v2, Lo7/j;->m:Lj7/e;

    .line 26
    .line 27
    iget-object v4, v4, Lo7/b;->k:Lz7/c;

    .line 28
    .line 29
    invoke-virtual {v4}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ll7/m;

    .line 44
    .line 45
    iget-object v5, v5, Ll7/m;->o:Ls7/b;

    .line 46
    .line 47
    iget-object v5, v5, Lo7/b;->k:Lz7/c;

    .line 48
    .line 49
    invoke-virtual {v5}, Lz7/c;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-le v5, v3, :cond_1

    .line 54
    .line 55
    move v3, v5

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v2, v2, Lo7/j;->l:Ll7/j;

    .line 58
    .line 59
    invoke-virtual {v2}, Ll7/j;->V()B

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-le v3, v4, :cond_0

    .line 80
    .line 81
    :cond_3
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/util/Map$Entry;

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/lang/Byte;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    invoke-virtual {p0, v2}, Lj7/d;->k0(B)Lo7/j;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v4, v2, Lo7/j;->l:Ll7/j;

    .line 138
    .line 139
    iget-object v4, v4, Ll7/j;->p:Lr7/b;

    .line 140
    .line 141
    check-cast v4, Lr7/p;

    .line 142
    .line 143
    invoke-virtual {v4, v1}, Lr7/p;->N(I)V

    .line 144
    .line 145
    .line 146
    iget-object v5, v4, Lr7/p;->m:Lr7/f;

    .line 147
    .line 148
    iget-object v4, v4, Lr7/b;->k:[B

    .line 149
    .line 150
    array-length v4, v4

    .line 151
    div-int/lit8 v4, v4, 0x4

    .line 152
    .line 153
    invoke-virtual {v5, v4}, Lr7/f;->k(I)V

    .line 154
    .line 155
    .line 156
    iget-object v2, v2, Lo7/j;->m:Lj7/e;

    .line 157
    .line 158
    iget-object v2, v2, Lo7/b;->k:Lz7/c;

    .line 159
    .line 160
    invoke-virtual {v2}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_5

    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ll7/m;

    .line 175
    .line 176
    iget-object v5, v4, Ll7/a;->m:Lp7/a;

    .line 177
    .line 178
    check-cast v5, Lp7/k;

    .line 179
    .line 180
    iget-object v5, v5, Lp7/k;->s:Lr7/c;

    .line 181
    .line 182
    invoke-virtual {v5}, Lr7/c;->get()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    and-int/lit8 v5, v5, 0x3

    .line 187
    .line 188
    const/4 v6, 0x1

    .line 189
    if-ne v5, v6, :cond_6

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    iget-object v5, v4, Ll7/a;->m:Lp7/a;

    .line 193
    .line 194
    check-cast v5, Lp7/k;

    .line 195
    .line 196
    iget-object v5, v5, Lp7/k;->t:Lr7/f;

    .line 197
    .line 198
    iget v6, v5, Lr7/f;->n:I

    .line 199
    .line 200
    if-ne v1, v6, :cond_7

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    invoke-virtual {v5, v1}, Lr7/f;->k(I)V

    .line 204
    .line 205
    .line 206
    iget-object v4, v4, Ll7/m;->o:Ls7/b;

    .line 207
    .line 208
    invoke-virtual {v4, v1, v3}, Ls7/d;->d0(IZ)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    return-void
.end method

.method public final X()V
    .locals 0

    .line 1
    return-void
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lo7/j;

    .line 2
    .line 3
    check-cast p2, Lo7/j;

    .line 4
    .line 5
    iget-object p1, p1, Lo7/j;->l:Ll7/j;

    .line 6
    .line 7
    iget-object p1, p1, Ll7/a;->m:Lp7/a;

    .line 8
    .line 9
    check-cast p1, Lp7/g;

    .line 10
    .line 11
    iget-object p1, p1, Lp7/g;->r:Lr7/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lr7/c;->get()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object p2, p2, Lo7/j;->l:Ll7/j;

    .line 18
    .line 19
    iget-object p2, p2, Ll7/a;->m:Lp7/a;

    .line 20
    .line 21
    check-cast p2, Lp7/g;

    .line 22
    .line 23
    iget-object p2, p2, Lp7/g;->r:Lr7/c;

    .line 24
    .line 25
    invoke-virtual {p2}, Lr7/c;->get()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
.end method

.method public final k0(B)Lo7/j;
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lo7/b;->Q(I)Lk7/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lo7/j;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lo7/j;->l:Ll7/j;

    .line 14
    .line 15
    invoke-virtual {v1}, Ll7/j;->V()B

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, p1, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 23
    .line 24
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lo7/j;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v2, v1, Lo7/j;->l:Ll7/j;

    .line 43
    .line 44
    invoke-virtual {v2}, Ll7/j;->V()B

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ne v2, p1, :cond_1

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_2
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public final n()Lk7/a;
    .locals 1

    .line 1
    new-instance v0, Lo7/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lo7/j;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
