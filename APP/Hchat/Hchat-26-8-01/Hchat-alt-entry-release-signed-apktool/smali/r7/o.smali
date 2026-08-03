.class public final Lr7/o;
.super Lr7/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public t:Lr7/n;

.field public u:Lr7/o;


# virtual methods
.method public final S(Lr7/s;)I
    .locals 7

    .line 1
    instance-of v0, p1, Lr7/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_1
    move-object v1, p1

    .line 13
    check-cast v1, Lr7/o;

    .line 14
    .line 15
    iget-object v2, p0, Lr7/o;->t:Lr7/n;

    .line 16
    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    move v2, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget v2, v2, Lr7/f;->n:I

    .line 22
    .line 23
    :goto_0
    iget-object v3, v1, Lr7/o;->t:Lr7/n;

    .line 24
    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    move v3, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_3
    iget v3, v3, Lr7/f;->n:I

    .line 30
    .line 31
    :goto_1
    const/4 v4, 0x1

    .line 32
    if-nez v2, :cond_4

    .line 33
    .line 34
    move v5, v4

    .line 35
    goto :goto_2

    .line 36
    :cond_4
    move v5, v0

    .line 37
    :goto_2
    if-nez v3, :cond_5

    .line 38
    .line 39
    move v6, v4

    .line 40
    goto :goto_3

    .line 41
    :cond_5
    move v6, v0

    .line 42
    :goto_3
    invoke-static {v5, v6}, Ly7/a;->d(ZZ)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_6

    .line 47
    .line 48
    return v5

    .line 49
    :cond_6
    invoke-static {v2, v3}, Ly7/a;->e(II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_7

    .line 54
    .line 55
    return v2

    .line 56
    :cond_7
    iget-object v2, v1, Lr7/s;->q:Lr7/u;

    .line 57
    .line 58
    if-eqz v2, :cond_8

    .line 59
    .line 60
    iget-object v2, v2, Lr7/u;->m:Lo7/b;

    .line 61
    .line 62
    iget-object v2, v2, Lo7/b;->k:Lz7/c;

    .line 63
    .line 64
    invoke-virtual {v2}, Lz7/c;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_8

    .line 69
    .line 70
    move v2, v4

    .line 71
    goto :goto_4

    .line 72
    :cond_8
    move v2, v0

    .line 73
    :goto_4
    iget-object v3, p0, Lr7/s;->q:Lr7/u;

    .line 74
    .line 75
    if-eqz v3, :cond_9

    .line 76
    .line 77
    iget-object v3, v3, Lr7/u;->m:Lo7/b;

    .line 78
    .line 79
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 80
    .line 81
    invoke-virtual {v3}, Lz7/c;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_9

    .line 86
    .line 87
    move v3, v4

    .line 88
    goto :goto_5

    .line 89
    :cond_9
    move v3, v0

    .line 90
    :goto_5
    invoke-static {v2, v3}, Ly7/a;->d(ZZ)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_a

    .line 95
    .line 96
    return v2

    .line 97
    :cond_a
    invoke-virtual {p0}, Lr7/s;->Y()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {p1}, Lr7/s;->Y()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {v2, p1}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_b

    .line 110
    .line 111
    return p1

    .line 112
    :cond_b
    iget-object p1, v1, Lr7/o;->u:Lr7/o;

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    if-eqz p1, :cond_c

    .line 116
    .line 117
    iget-object v3, p1, Lk7/a;->h:Lk7/a;

    .line 118
    .line 119
    if-nez v3, :cond_c

    .line 120
    .line 121
    iput-object v2, v1, Lr7/o;->u:Lr7/o;

    .line 122
    .line 123
    move-object p1, v2

    .line 124
    :cond_c
    if-eqz p1, :cond_d

    .line 125
    .line 126
    move p1, v4

    .line 127
    goto :goto_6

    .line 128
    :cond_d
    move p1, v0

    .line 129
    :goto_6
    iget-object v3, p0, Lr7/o;->u:Lr7/o;

    .line 130
    .line 131
    if-eqz v3, :cond_e

    .line 132
    .line 133
    iget-object v5, v3, Lk7/a;->h:Lk7/a;

    .line 134
    .line 135
    if-nez v5, :cond_e

    .line 136
    .line 137
    iput-object v2, p0, Lr7/o;->u:Lr7/o;

    .line 138
    .line 139
    move-object v3, v2

    .line 140
    :cond_e
    if-eqz v3, :cond_f

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_f
    move v4, v0

    .line 144
    :goto_7
    invoke-static {p1, v4}, Ly7/a;->d(ZZ)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_10

    .line 149
    .line 150
    return p1

    .line 151
    :cond_10
    invoke-virtual {v1}, Lr7/o;->X()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-virtual {p0}, Lr7/o;->X()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-static {p1, v3}, Ly7/a;->b(II)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_11

    .line 164
    .line 165
    return p1

    .line 166
    :cond_11
    iget-object p1, p0, Lr7/o;->u:Lr7/o;

    .line 167
    .line 168
    if-eqz p1, :cond_12

    .line 169
    .line 170
    iget-object v3, p1, Lk7/a;->h:Lk7/a;

    .line 171
    .line 172
    if-nez v3, :cond_12

    .line 173
    .line 174
    iput-object v2, p0, Lr7/o;->u:Lr7/o;

    .line 175
    .line 176
    move-object p1, v2

    .line 177
    :cond_12
    if-eqz p1, :cond_13

    .line 178
    .line 179
    invoke-virtual {p1}, Lr7/s;->Y()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    goto :goto_8

    .line 184
    :cond_13
    move-object p1, v2

    .line 185
    :goto_8
    iget-object v3, v1, Lr7/o;->u:Lr7/o;

    .line 186
    .line 187
    if-eqz v3, :cond_14

    .line 188
    .line 189
    iget-object v4, v3, Lk7/a;->h:Lk7/a;

    .line 190
    .line 191
    if-nez v4, :cond_14

    .line 192
    .line 193
    iput-object v2, v1, Lr7/o;->u:Lr7/o;

    .line 194
    .line 195
    move-object v3, v2

    .line 196
    :cond_14
    if-eqz v3, :cond_15

    .line 197
    .line 198
    invoke-virtual {v3}, Lr7/s;->Y()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :cond_15
    invoke-static {p1, v2}, Ly7/a;->c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_16

    .line 207
    .line 208
    return p1

    .line 209
    :cond_16
    :goto_9
    return v0
.end method

.method public final W()V
    .locals 0

    .line 1
    return-void
.end method

.method public final X()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/s;->p:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ly7/a;->j(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lr7/o;->t:Lr7/n;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lr7/n;->O()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    :cond_0
    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lr7/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr7/o;->S(Lr7/s;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
