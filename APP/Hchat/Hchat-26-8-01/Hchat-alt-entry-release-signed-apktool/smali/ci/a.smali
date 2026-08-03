.class public final Lci/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public a(Li0/h0;I)V
    .locals 8

    .line 1
    const v0, -0x47831c8

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {p1, v0, v2}, Li0/h0;->S(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_8

    .line 20
    .line 21
    sget-object v0, Lci/y;->b:Li0/m2;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lw0/p;

    .line 28
    .line 29
    sget-object v2, Lci/y;->a:Li0/m2;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lw0/p;

    .line 36
    .line 37
    sget-object v3, Ly1/h1;->u:Li0/m2;

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ly1/o2;

    .line 44
    .line 45
    check-cast v3, Ly1/v1;

    .line 46
    .line 47
    invoke-virtual {v3}, Ly1/v1;->a()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    invoke-static {v4, v5}, Lu2/h;->b(J)F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v3}, Ly1/v1;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    invoke-static {v5, v6}, Lu2/h;->a(J)F

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/16 v5, 0x1e0

    .line 64
    .line 65
    int-to-float v5, v5

    .line 66
    invoke-static {v3, v5}, Lu2/f;->a(FF)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ltz v3, :cond_1

    .line 71
    .line 72
    const/16 v3, 0x348

    .line 73
    .line 74
    int-to-float v3, v3

    .line 75
    invoke-static {v4, v3}, Lu2/f;->a(FF)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    :cond_1
    const v3, 0x38cd3973

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v3}, Li0/h0;->a0(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lw0/p;->listIterator()Ljava/util/ListIterator;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Luf/a;

    .line 90
    .line 91
    invoke-virtual {v3}, Luf/a;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-nez v4, :cond_7

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Li0/h0;->p(Z)V

    .line 98
    .line 99
    .line 100
    const v3, 0x38cd5a5d

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v3}, Li0/h0;->a0(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lw0/p;->listIterator()Ljava/util/ListIterator;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Luf/a;

    .line 111
    .line 112
    invoke-virtual {v3}, Luf/a;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_6

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Li0/h0;->p(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v2}, Lw0/p;->size()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-virtual {p1, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    or-int/2addr v4, v5

    .line 146
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    sget-object v6, Li0/l;->a:Li0/e;

    .line 151
    .line 152
    if-nez v4, :cond_2

    .line 153
    .line 154
    if-ne v5, v6, :cond_3

    .line 155
    .line 156
    :cond_2
    new-instance v5, Lci/u;

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-direct {v5, v0, v2, v7, v4}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    check-cast v5, Lfg/p;

    .line 167
    .line 168
    invoke-static {v1, v3, v5, p1}, Li0/r;->g(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Li0/h0;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {p1, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    or-int/2addr v1, v3

    .line 180
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    if-nez v1, :cond_4

    .line 185
    .line 186
    if-ne v3, v6, :cond_5

    .line 187
    .line 188
    :cond_4
    new-instance v3, Lc9/i;

    .line 189
    .line 190
    const/4 v1, 0x7

    .line 191
    invoke-direct {v3, v0, v1, v2}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    check-cast v3, Lfg/l;

    .line 198
    .line 199
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 200
    .line 201
    invoke-static {v0, v3, p1}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    invoke-virtual {v3}, Luf/a;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {}, Lah/a;->d()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_7
    invoke-virtual {v3}, Luf/a;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-static {}, Lah/a;->d()V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_8
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 228
    .line 229
    .line 230
    :goto_1
    invoke-virtual {p1}, Li0/h0;->t()Li0/r1;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-eqz p1, :cond_9

    .line 235
    .line 236
    new-instance v0, Lb0/t;

    .line 237
    .line 238
    const/4 v1, 0x5

    .line 239
    invoke-direct {v0, p2, v1, p0}, Lb0/t;-><init>(IILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 243
    .line 244
    :cond_9
    return-void
.end method
