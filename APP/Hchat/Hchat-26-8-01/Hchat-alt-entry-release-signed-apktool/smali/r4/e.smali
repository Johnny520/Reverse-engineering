.class public final Lr4/e;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:Lr4/b;

.field public l:Ljava/util/ArrayList;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/ArrayList;


# direct methods
.method public static n(Ljava/util/ArrayList;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lr4/p;->b:Lr4/k0;

    .line 2
    .line 3
    iget-object v1, p1, Lr4/p;->j:Lr4/j0;

    .line 4
    .line 5
    iget-object v2, p0, Lr4/e;->k:Lr4/b;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lr4/b;

    .line 14
    .line 15
    iput-object v2, p0, Lr4/e;->k:Lr4/b;

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lr4/u;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v4, p1, Lr4/p;->i:Lr4/w;

    .line 41
    .line 42
    iget-object v5, v3, Lr4/u;->g:Lv4/m;

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 45
    .line 46
    .line 47
    iget-object v4, v3, Lr4/u;->h:Lr4/b;

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lr4/b;

    .line 54
    .line 55
    iput-object v4, v3, Lr4/u;->h:Lr4/b;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lr4/f0;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v3, v2, Lr4/f0;->g:Lv4/y;

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Lr4/j0;->m(Lv4/e;)V

    .line 84
    .line 85
    .line 86
    iget-object v3, v2, Lr4/f0;->h:Lr4/b;

    .line 87
    .line 88
    invoke-virtual {v0, v3}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lr4/b;

    .line 93
    .line 94
    iput-object v3, v2, Lr4/f0;->h:Lr4/b;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget-object p1, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 98
    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Lr4/m0;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v3, v2, Lr4/m0;->g:Lv4/y;

    .line 121
    .line 122
    invoke-virtual {v1, v3}, Lr4/j0;->m(Lv4/e;)V

    .line 123
    .line 124
    .line 125
    iget-object v2, v2, Lr4/m0;->h:Lr4/v0;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lr4/k0;->k(Lr4/l0;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_3
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->C:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/e;->k:Lr4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    check-cast p1, Lr4/e;

    .line 18
    .line 19
    iget-object p1, p1, Lr4/e;->k:Lr4/b;

    .line 20
    .line 21
    if-ne v0, p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_0
    invoke-virtual {v0}, Lr4/b;->b()Lr4/b0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1}, Lr4/b;->b()Lr4/b0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_1
    invoke-virtual {v0, p1}, Lr4/b;->e(Lr4/l0;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_2
    const-string p1, "uninternable instance"

    .line 49
    .line 50
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/e;->k:Lr4/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lr4/b;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p2, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {p2}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    add-int/2addr p2, p1

    .line 14
    iget-object p1, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p1}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/2addr p1, p2

    .line 21
    mul-int/lit8 p1, p1, 0x8

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x10

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v1, "unsupported"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr4/e;->k:Lr4/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Lr4/l0;->f()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    iget-object v3, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v3}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v4, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v4}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-static {v5}, Lr4/e;->n(Ljava/util/ArrayList;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/4 v6, 0x4

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const-string v8, " annotations directory"

    .line 42
    .line 43
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {p2, v2, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const-string v8, "  class_annotations_off: "

    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {p2, v6, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, La/a;->Y0(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const-string v8, "  fields_size:           "

    .line 68
    .line 69
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {p2, v6, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const-string v8, "  methods_size:          "

    .line 81
    .line 82
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {p2, v6, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v8, "  parameters_size:       "

    .line 94
    .line 95
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {p2, v6, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {p2, v1}, Lz4/d;->k(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v3}, Lz4/d;->k(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v4}, Lz4/d;->k(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v5}, Lz4/d;->k(I)V

    .line 112
    .line 113
    .line 114
    const-string v1, "      annotations_off: "

    .line 115
    .line 116
    const-string v7, "    "

    .line 117
    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    iget-object v3, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    const-string v3, "  fields:"

    .line 128
    .line 129
    invoke-virtual {p2, v2, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    iget-object v3, p0, Lr4/e;->l:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v8, :cond_4

    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    check-cast v8, Lr4/u;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v9, p1, Lr4/p;->i:Lr4/w;

    .line 154
    .line 155
    iget-object v10, v8, Lr4/u;->g:Lv4/m;

    .line 156
    .line 157
    invoke-virtual {v9, v10}, Lr4/w;->l(Lv4/m;)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    iget-object v8, v8, Lr4/u;->h:Lr4/b;

    .line 162
    .line 163
    invoke-virtual {v8}, Lr4/l0;->f()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_3

    .line 172
    .line 173
    invoke-virtual {v10}, Lv4/w;->a()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v7, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    invoke-virtual {p2, v2, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    const-string v11, "      field_idx:       "

    .line 189
    .line 190
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-virtual {p2, v6, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v8}, La/a;->Y0(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-virtual {p2, v6, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_3
    invoke-virtual {p2, v9}, Lz4/d;->k(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, v8}, Lz4/d;->k(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_4
    const-string v3, "      method_idx:      "

    .line 216
    .line 217
    if-eqz v4, :cond_7

    .line 218
    .line 219
    iget-object v4, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    if-eqz v0, :cond_5

    .line 225
    .line 226
    const-string v4, "  methods:"

    .line 227
    .line 228
    invoke-virtual {p2, v2, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_5
    iget-object v4, p0, Lr4/e;->m:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-eqz v8, :cond_7

    .line 242
    .line 243
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    check-cast v8, Lr4/f0;

    .line 248
    .line 249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget-object v9, p1, Lr4/p;->j:Lr4/j0;

    .line 253
    .line 254
    iget-object v10, v8, Lr4/f0;->g:Lv4/y;

    .line 255
    .line 256
    invoke-virtual {v9, v10}, Lr4/j0;->l(Lv4/e;)I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    iget-object v8, v8, Lr4/f0;->h:Lr4/b;

    .line 261
    .line 262
    invoke-virtual {v8}, Lr4/l0;->f()I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    if-eqz v11, :cond_6

    .line 271
    .line 272
    invoke-virtual {v10}, Lv4/w;->a()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-virtual {v7, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    invoke-virtual {p2, v2, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-virtual {v3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-virtual {p2, v6, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v8}, La/a;->Y0(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    invoke-virtual {p2, v6, v10}, Lz4/d;->b(ILjava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_6
    invoke-virtual {p2, v9}, Lz4/d;->k(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p2, v8}, Lz4/d;->k(I)V

    .line 309
    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_7
    if-eqz v5, :cond_a

    .line 313
    .line 314
    iget-object v4, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 317
    .line 318
    .line 319
    if-eqz v0, :cond_8

    .line 320
    .line 321
    const-string v0, "  parameters:"

    .line 322
    .line 323
    invoke-virtual {p2, v2, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :cond_8
    iget-object v0, p0, Lr4/e;->n:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_a

    .line 337
    .line 338
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Lr4/m0;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    iget-object v5, p1, Lr4/p;->j:Lr4/j0;

    .line 348
    .line 349
    iget-object v8, v4, Lr4/m0;->g:Lv4/y;

    .line 350
    .line 351
    invoke-virtual {v5, v8}, Lr4/j0;->l(Lv4/e;)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    iget-object v4, v4, Lr4/m0;->h:Lr4/v0;

    .line 356
    .line 357
    invoke-virtual {v4}, Lr4/l0;->f()I

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    if-eqz v9, :cond_9

    .line 366
    .line 367
    invoke-virtual {v8}, Lv4/w;->a()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    invoke-virtual {p2, v2, v8}, Lz4/d;->b(ILjava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    invoke-virtual {v3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-virtual {p2, v6, v8}, Lz4/d;->b(ILjava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    invoke-virtual {p2, v6, v8}, Lz4/d;->b(ILjava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :cond_9
    invoke-virtual {p2, v5}, Lz4/d;->k(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p2, v4}, Lz4/d;->k(I)V

    .line 404
    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_a
    return-void
.end method
