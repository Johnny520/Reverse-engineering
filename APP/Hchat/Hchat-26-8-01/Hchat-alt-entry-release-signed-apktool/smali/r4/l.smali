.class public final Lr4/l;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv4/y;

.field public final l:Li4/a;

.field public m:Lr4/i;

.field public final n:Z

.field public final o:Lw4/e;

.field public p:Lr4/o;


# direct methods
.method public constructor <init>(Lv4/y;Li4/a;ZLw4/e;)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lr4/l;->k:Lv4/y;

    .line 13
    .line 14
    iput-object p2, p0, Lr4/l;->l:Li4/a;

    .line 15
    .line 16
    iput-boolean p3, p0, Lr4/l;->n:Z

    .line 17
    .line 18
    iput-object p4, p0, Lr4/l;->o:Lw4/e;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lr4/l;->m:Lr4/i;

    .line 22
    .line 23
    iput-object p1, p0, Lr4/l;->p:Lr4/o;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p1, "throwsList == null"

    .line 27
    .line 28
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :cond_1
    const-string p1, "code == null"

    .line 34
    .line 35
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1

    .line 40
    :cond_2
    const-string p1, "ref == null"

    .line 41
    .line 42
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 12

    .line 1
    iget-object v0, p1, Lr4/p;->o:Lr4/k0;

    .line 2
    .line 3
    iget-object v1, p1, Lr4/p;->g:Lr4/h0;

    .line 4
    .line 5
    iget-object v2, p0, Lr4/l;->l:Li4/a;

    .line 6
    .line 7
    iget v3, v2, Li4/a;->g:I

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eq v3, v4, :cond_0

    .line 11
    .line 12
    iget-object v3, v2, Li4/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lp4/u;

    .line 15
    .line 16
    iget-boolean v3, v3, Lp4/u;->d:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v3, v2, Li4/a;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lp4/u;

    .line 24
    .line 25
    iget-boolean v3, v3, Lp4/u;->e:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    :goto_0
    new-instance v3, Lr4/o;

    .line 30
    .line 31
    iget-boolean v4, p0, Lr4/l;->n:Z

    .line 32
    .line 33
    iget-object v5, p0, Lr4/l;->k:Lv4/y;

    .line 34
    .line 35
    invoke-direct {v3, v2, v4, v5}, Lr4/o;-><init>(Li4/a;ZLv4/y;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lr4/l;->p:Lr4/o;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lr4/k0;->k(Lr4/l0;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, v2, Li4/a;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lb5/c;

    .line 46
    .line 47
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lf1/h;

    .line 50
    .line 51
    iget-object v0, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lu4/c;

    .line 54
    .line 55
    iget-object v3, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 56
    .line 57
    array-length v3, v3

    .line 58
    const/4 v4, 0x0

    .line 59
    move v5, v4

    .line 60
    :goto_1
    const/16 v6, 0x14

    .line 61
    .line 62
    if-ge v5, v3, :cond_6

    .line 63
    .line 64
    invoke-virtual {v0, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Lu4/b;

    .line 69
    .line 70
    iget-object v7, v7, Lu4/b;->b:Lh4/u;

    .line 71
    .line 72
    invoke-virtual {v7}, Lh4/u;->p()Lu4/i;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v7}, Lu4/i;->e()Lw4/e;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7}, Lw4/e;->size()I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_5

    .line 85
    .line 86
    iget-object v0, v2, Li4/a;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lb5/c;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lf1/h;

    .line 101
    .line 102
    iget-object v0, v0, Lf1/h;->i:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lu4/c;

    .line 105
    .line 106
    iget-object v5, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 107
    .line 108
    array-length v5, v5

    .line 109
    move v7, v4

    .line 110
    :goto_2
    if-ge v7, v5, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0, v7}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Lu4/b;

    .line 117
    .line 118
    iget-object v8, v8, Lu4/b;->b:Lh4/u;

    .line 119
    .line 120
    invoke-virtual {v8}, Lh4/u;->p()Lu4/i;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v8}, Lu4/i;->e()Lw4/e;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-interface {v8}, Lw4/e;->size()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    move v10, v4

    .line 133
    :goto_3
    if-ge v10, v9, :cond_2

    .line 134
    .line 135
    invoke-interface {v8, v10}, Lw4/e;->getType(I)Lw4/c;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    add-int/lit8 v10, v10, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_4

    .line 157
    .line 158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Lw4/c;

    .line 163
    .line 164
    invoke-virtual {v1, v3}, Lr4/h0;->t(Lw4/c;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_4
    new-instance v0, Lr4/i;

    .line 169
    .line 170
    invoke-direct {v0, v2}, Lr4/i;-><init>(Li4/a;)V

    .line 171
    .line 172
    .line 173
    iput-object v0, p0, Lr4/l;->m:Lr4/i;

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_6
    :goto_5
    iget-object v0, v2, Li4/a;->h:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lp4/u;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v1, Ljava/util/HashSet;

    .line 187
    .line 188
    invoke-direct {v1, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_b

    .line 202
    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, Lp4/h;

    .line 208
    .line 209
    instance-of v3, v2, Lp4/g;

    .line 210
    .line 211
    if-eqz v3, :cond_8

    .line 212
    .line 213
    check-cast v2, Lp4/g;

    .line 214
    .line 215
    iget-object v2, v2, Lp4/g;->f:Lv4/a;

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_8
    instance-of v3, v2, Lp4/r;

    .line 222
    .line 223
    if-eqz v3, :cond_9

    .line 224
    .line 225
    check-cast v2, Lp4/r;

    .line 226
    .line 227
    move v3, v4

    .line 228
    :goto_7
    iget-object v5, v2, Lp4/r;->f:[Lv4/a;

    .line 229
    .line 230
    array-length v6, v5

    .line 231
    if-ge v3, v6, :cond_7

    .line 232
    .line 233
    aget-object v5, v5, v3

    .line 234
    .line 235
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_9
    instance-of v3, v2, Lp4/p;

    .line 242
    .line 243
    if-nez v3, :cond_a

    .line 244
    .line 245
    instance-of v2, v2, Lp4/q;

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_a
    const/4 p1, 0x0

    .line 249
    throw p1

    .line 250
    :cond_b
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_c

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Lv4/a;

    .line 265
    .line 266
    invoke-virtual {p1, v1}, Lr4/p;->b(Lv4/a;)V

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_c
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->x:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 10

    .line 1
    iget-object p1, p1, Lr4/o0;->b:Lr4/p;

    .line 2
    .line 3
    new-instance p2, Lm/a;

    .line 4
    .line 5
    const/16 v0, 0xe

    .line 6
    .line 7
    invoke-direct {p2, p1, v0}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lr4/l;->l:Li4/a;

    .line 11
    .line 12
    iget-object v1, v0, Li4/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lp4/u;

    .line 15
    .line 16
    iget-object v1, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_8

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lp4/h;

    .line 34
    .line 35
    instance-of v4, v2, Lp4/g;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    check-cast v2, Lp4/g;

    .line 40
    .line 41
    iget-object v3, v2, Lp4/g;->f:Lv4/a;

    .line 42
    .line 43
    invoke-virtual {p2, v3}, Lm/a;->q(Lv4/a;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ltz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Lp4/g;->o(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    instance-of v4, v3, Lv4/w;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    check-cast v3, Lv4/w;

    .line 57
    .line 58
    iget-object v3, v3, Lv4/w;->g:Lv4/d0;

    .line 59
    .line 60
    invoke-virtual {p2, v3}, Lm/a;->q(Lv4/a;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ltz v3, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Lp4/g;->n(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    instance-of v4, v2, Lp4/r;

    .line 71
    .line 72
    if-eqz v4, :cond_0

    .line 73
    .line 74
    check-cast v2, Lp4/r;

    .line 75
    .line 76
    :goto_1
    iget-object v4, v2, Lp4/r;->f:[Lv4/a;

    .line 77
    .line 78
    array-length v5, v4

    .line 79
    if-ge v3, v5, :cond_0

    .line 80
    .line 81
    aget-object v4, v4, v3

    .line 82
    .line 83
    invoke-virtual {p2, v4}, Lm/a;->q(Lv4/a;)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const-string v6, "index < 0"

    .line 88
    .line 89
    if-ltz v5, :cond_7

    .line 90
    .line 91
    iget-object v7, v2, Lp4/r;->g:[I

    .line 92
    .line 93
    aget v8, v7, v3

    .line 94
    .line 95
    const/4 v9, -0x1

    .line 96
    if-ne v8, v9, :cond_6

    .line 97
    .line 98
    aput v5, v7, v3

    .line 99
    .line 100
    instance-of v5, v4, Lv4/w;

    .line 101
    .line 102
    if-eqz v5, :cond_5

    .line 103
    .line 104
    check-cast v4, Lv4/w;

    .line 105
    .line 106
    iget-object v4, v4, Lv4/w;->g:Lv4/d0;

    .line 107
    .line 108
    invoke-virtual {p2, v4}, Lm/a;->q(Lv4/a;)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-ltz v4, :cond_4

    .line 113
    .line 114
    iget v5, v2, Lp4/r;->h:I

    .line 115
    .line 116
    if-ne v5, v9, :cond_3

    .line 117
    .line 118
    iput v4, v2, Lp4/r;->h:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const-string p1, "class index already set"

    .line 122
    .line 123
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    invoke-static {v6}, Lj8/o;->t(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const-string p1, "index already set"

    .line 135
    .line 136
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_7
    invoke-static {v6}, Lj8/o;->t(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_8
    iget-object p2, p0, Lr4/l;->m:Lr4/i;

    .line 145
    .line 146
    if-eqz p2, :cond_10

    .line 147
    .line 148
    invoke-virtual {p2}, Lr4/i;->a()V

    .line 149
    .line 150
    .line 151
    iget-object p1, p1, Lr4/p;->g:Lr4/h0;

    .line 152
    .line 153
    iget-object v1, p2, Lr4/i;->b:Lp4/e;

    .line 154
    .line 155
    iget-object v1, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 156
    .line 157
    array-length v1, v1

    .line 158
    new-instance v2, Ljava/util/TreeMap;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v2, p2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 164
    .line 165
    move v2, v3

    .line 166
    :goto_3
    iget-object v4, p2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 167
    .line 168
    if-ge v2, v1, :cond_9

    .line 169
    .line 170
    iget-object v5, p2, Lr4/i;->b:Lp4/e;

    .line 171
    .line 172
    invoke-virtual {v5, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Lp4/d;

    .line 177
    .line 178
    iget-object v5, v5, Lp4/d;->i:Lp4/c;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    invoke-virtual {v4, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x1

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_9
    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    const v2, 0xffff

    .line 192
    .line 193
    .line 194
    if-gt v1, v2, :cond_f

    .line 195
    .line 196
    new-instance v1, Lz4/d;

    .line 197
    .line 198
    invoke-direct {v1}, Lz4/d;-><init>()V

    .line 199
    .line 200
    .line 201
    iget-object v2, p2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-virtual {v1, v2}, Lz4/d;->n(I)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    iput v2, p2, Lr4/i;->d:I

    .line 212
    .line 213
    iget-object v2, p2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_e

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, Ljava/util/Map$Entry;

    .line 234
    .line 235
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, Lp4/c;

    .line 240
    .line 241
    iget-object v6, v5, Lz4/e;->h:[Ljava/lang/Object;

    .line 242
    .line 243
    array-length v7, v6

    .line 244
    array-length v6, v6

    .line 245
    if-nez v6, :cond_b

    .line 246
    .line 247
    move v6, v3

    .line 248
    goto :goto_5

    .line 249
    :cond_b
    add-int/lit8 v6, v6, -0x1

    .line 250
    .line 251
    invoke-virtual {v5, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    check-cast v6, Lp4/b;

    .line 256
    .line 257
    iget-object v6, v6, Lp4/b;->g:Lv4/d0;

    .line 258
    .line 259
    sget-object v8, Lv4/d0;->j:Lv4/d0;

    .line 260
    .line 261
    invoke-virtual {v6, v8}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    :goto_5
    iget v8, v1, Lz4/d;->c:I

    .line 266
    .line 267
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-interface {v4, v8}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    if-eqz v6, :cond_c

    .line 275
    .line 276
    add-int/lit8 v4, v7, -0x1

    .line 277
    .line 278
    neg-int v4, v4

    .line 279
    invoke-virtual {v1, v4}, Lz4/d;->m(I)V

    .line 280
    .line 281
    .line 282
    add-int/lit8 v7, v7, -0x1

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_c
    invoke-virtual {v1, v7}, Lz4/d;->m(I)V

    .line 286
    .line 287
    .line 288
    :goto_6
    move v4, v3

    .line 289
    :goto_7
    if-ge v4, v7, :cond_d

    .line 290
    .line 291
    invoke-virtual {v5, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    check-cast v8, Lp4/b;

    .line 296
    .line 297
    iget-object v9, v8, Lp4/b;->g:Lv4/d0;

    .line 298
    .line 299
    invoke-virtual {p1, v9}, Lr4/h0;->m(Lv4/d0;)I

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    invoke-virtual {v1, v9}, Lz4/d;->n(I)I

    .line 304
    .line 305
    .line 306
    iget v8, v8, Lp4/b;->h:I

    .line 307
    .line 308
    invoke-virtual {v1, v8}, Lz4/d;->n(I)I

    .line 309
    .line 310
    .line 311
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_d
    if-eqz v6, :cond_a

    .line 315
    .line 316
    invoke-virtual {v5, v7}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    check-cast v4, Lp4/b;

    .line 321
    .line 322
    iget v4, v4, Lp4/b;->h:I

    .line 323
    .line 324
    invoke-virtual {v1, v4}, Lz4/d;->n(I)I

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_e
    invoke-virtual {v1}, Lz4/d;->h()[B

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    iput-object p1, p2, Lr4/i;->c:[B

    .line 333
    .line 334
    iget-object p1, p0, Lr4/l;->m:Lr4/i;

    .line 335
    .line 336
    invoke-virtual {p1}, Lr4/i;->a()V

    .line 337
    .line 338
    .line 339
    iget-object p2, p1, Lr4/i;->b:Lp4/e;

    .line 340
    .line 341
    iget-object p2, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 342
    .line 343
    array-length p2, p2

    .line 344
    mul-int/lit8 p2, p2, 0x8

    .line 345
    .line 346
    iget-object p1, p1, Lr4/i;->c:[B

    .line 347
    .line 348
    array-length p1, p1

    .line 349
    add-int v3, p2, p1

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_f
    const-string p1, "too many catch handlers"

    .line 353
    .line 354
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :cond_10
    :goto_8
    invoke-virtual {v0}, Li4/a;->j()V

    .line 359
    .line 360
    .line 361
    iget-object p1, v0, Li4/a;->m:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast p1, Lp4/i;

    .line 364
    .line 365
    invoke-virtual {p1}, Lp4/i;->o()I

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    and-int/lit8 p2, p1, 0x1

    .line 370
    .line 371
    if-eqz p2, :cond_11

    .line 372
    .line 373
    add-int/lit8 p1, p1, 0x1

    .line 374
    .line 375
    :cond_11
    mul-int/lit8 p1, p1, 0x2

    .line 376
    .line 377
    add-int/lit8 p1, p1, 0x10

    .line 378
    .line 379
    add-int/2addr p1, v3

    .line 380
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V

    .line 381
    .line 382
    .line 383
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/l;->k:Lv4/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/w;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Lz4/d;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lr4/l;->l:Li4/a;

    .line 10
    .line 11
    invoke-virtual {v3}, Li4/a;->j()V

    .line 12
    .line 13
    .line 14
    iget-object v4, v3, Li4/a;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Lp4/i;

    .line 17
    .line 18
    iget v4, v4, Lp4/i;->i:I

    .line 19
    .line 20
    invoke-virtual {v3}, Li4/a;->j()V

    .line 21
    .line 22
    .line 23
    iget-object v5, v3, Li4/a;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Lp4/i;

    .line 26
    .line 27
    iget-object v6, v5, Lz4/e;->h:[Ljava/lang/Object;

    .line 28
    .line 29
    array-length v6, v6

    .line 30
    const/4 v7, 0x0

    .line 31
    move v8, v7

    .line 32
    move v9, v8

    .line 33
    :goto_0
    const/4 v10, 0x1

    .line 34
    if-ge v8, v6, :cond_8

    .line 35
    .line 36
    invoke-virtual {v5, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    check-cast v11, Lp4/h;

    .line 41
    .line 42
    instance-of v12, v11, Lp4/g;

    .line 43
    .line 44
    if-eqz v12, :cond_5

    .line 45
    .line 46
    move-object v12, v11

    .line 47
    check-cast v12, Lp4/g;

    .line 48
    .line 49
    iget-object v12, v12, Lp4/g;->f:Lv4/a;

    .line 50
    .line 51
    instance-of v13, v12, Lv4/e;

    .line 52
    .line 53
    if-eqz v13, :cond_3

    .line 54
    .line 55
    check-cast v12, Lv4/e;

    .line 56
    .line 57
    iget-object v11, v11, Lp4/h;->b:Lp4/j;

    .line 58
    .line 59
    iget v11, v11, Lp4/j;->b:I

    .line 60
    .line 61
    const/16 v13, 0x71

    .line 62
    .line 63
    if-ne v11, v13, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    move v10, v7

    .line 67
    :goto_1
    iget-object v11, v12, Lv4/e;->i:Lw4/a;

    .line 68
    .line 69
    if-eqz v10, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    iget-object v10, v12, Lv4/e;->j:Lw4/a;

    .line 73
    .line 74
    if-nez v10, :cond_2

    .line 75
    .line 76
    iget-object v10, v12, Lv4/w;->g:Lv4/d0;

    .line 77
    .line 78
    iget-object v10, v10, Lv4/d0;->g:Lw4/c;

    .line 79
    .line 80
    invoke-virtual {v11, v10}, Lw4/a;->e(Lw4/c;)Lw4/a;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    iput-object v10, v12, Lv4/e;->j:Lw4/a;

    .line 85
    .line 86
    :cond_2
    iget-object v11, v12, Lv4/e;->j:Lw4/a;

    .line 87
    .line 88
    :goto_2
    iget-object v10, v11, Lw4/a;->i:Lw4/b;

    .line 89
    .line 90
    invoke-virtual {v10}, Lw4/b;->o()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    instance-of v10, v12, Lv4/i;

    .line 96
    .line 97
    if-eqz v10, :cond_4

    .line 98
    .line 99
    check-cast v12, Lv4/i;

    .line 100
    .line 101
    iget-object v10, v12, Lv4/i;->g:Lv4/q;

    .line 102
    .line 103
    iget-object v10, v10, Lv4/q;->i:Lw4/a;

    .line 104
    .line 105
    iget-object v10, v10, Lw4/a;->i:Lw4/b;

    .line 106
    .line 107
    invoke-virtual {v10}, Lw4/b;->o()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move v10, v7

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    instance-of v12, v11, Lp4/r;

    .line 115
    .line 116
    if-eqz v12, :cond_7

    .line 117
    .line 118
    iget-object v12, v11, Lp4/h;->b:Lp4/j;

    .line 119
    .line 120
    iget v12, v12, Lp4/j;->b:I

    .line 121
    .line 122
    const/16 v13, 0xfa

    .line 123
    .line 124
    if-ne v12, v13, :cond_6

    .line 125
    .line 126
    check-cast v11, Lp4/r;

    .line 127
    .line 128
    iget-object v11, v11, Lp4/r;->f:[Lv4/a;

    .line 129
    .line 130
    aget-object v11, v11, v10

    .line 131
    .line 132
    check-cast v11, Lv4/a0;

    .line 133
    .line 134
    iget-object v11, v11, Lv4/a0;->g:Lw4/a;

    .line 135
    .line 136
    iget-object v11, v11, Lw4/a;->i:Lw4/b;

    .line 137
    .line 138
    invoke-virtual {v11}, Lw4/b;->o()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    add-int/2addr v10, v11

    .line 143
    :goto_3
    if-le v10, v9, :cond_7

    .line 144
    .line 145
    move v9, v10

    .line 146
    goto :goto_4

    .line 147
    :cond_6
    const-string v0, "Expecting invoke-polymorphic"

    .line 148
    .line 149
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_7
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_8
    iget-object v5, v1, Lr4/l;->k:Lv4/y;

    .line 157
    .line 158
    iget-object v6, v5, Lv4/e;->i:Lw4/a;

    .line 159
    .line 160
    iget-boolean v8, v1, Lr4/l;->n:Z

    .line 161
    .line 162
    if-eqz v8, :cond_9

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_9
    iget-object v8, v5, Lv4/e;->j:Lw4/a;

    .line 166
    .line 167
    if-nez v8, :cond_a

    .line 168
    .line 169
    iget-object v8, v5, Lv4/w;->g:Lv4/d0;

    .line 170
    .line 171
    iget-object v8, v8, Lv4/d0;->g:Lw4/c;

    .line 172
    .line 173
    invoke-virtual {v6, v8}, Lw4/a;->e(Lw4/c;)Lw4/a;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    iput-object v6, v5, Lv4/e;->j:Lw4/a;

    .line 178
    .line 179
    :cond_a
    iget-object v6, v5, Lv4/e;->j:Lw4/a;

    .line 180
    .line 181
    :goto_5
    iget-object v6, v6, Lw4/a;->i:Lw4/b;

    .line 182
    .line 183
    invoke-virtual {v6}, Lw4/b;->o()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    invoke-virtual {v3}, Li4/a;->j()V

    .line 188
    .line 189
    .line 190
    iget-object v8, v3, Li4/a;->m:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v8, Lp4/i;

    .line 193
    .line 194
    invoke-virtual {v8}, Lp4/i;->o()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    and-int/lit8 v11, v8, 0x1

    .line 199
    .line 200
    if-eqz v11, :cond_b

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_b
    move v10, v7

    .line 204
    :goto_6
    iget-object v11, v1, Lr4/l;->m:Lr4/i;

    .line 205
    .line 206
    if-nez v11, :cond_c

    .line 207
    .line 208
    move v11, v7

    .line 209
    goto :goto_7

    .line 210
    :cond_c
    invoke-virtual {v11}, Lr4/i;->a()V

    .line 211
    .line 212
    .line 213
    iget-object v11, v11, Lr4/i;->b:Lp4/e;

    .line 214
    .line 215
    iget-object v11, v11, Lz4/e;->h:[Ljava/lang/Object;

    .line 216
    .line 217
    array-length v11, v11

    .line 218
    :goto_7
    iget-object v12, v1, Lr4/l;->p:Lr4/o;

    .line 219
    .line 220
    if-nez v12, :cond_d

    .line 221
    .line 222
    move v12, v7

    .line 223
    goto :goto_8

    .line 224
    :cond_d
    invoke-virtual {v12}, Lr4/l0;->f()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    :goto_8
    const/4 v13, 0x2

    .line 229
    if-eqz v2, :cond_11

    .line 230
    .line 231
    new-instance v14, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Lr4/l0;->g()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const/16 v15, 0x20

    .line 244
    .line 245
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Lv4/w;->a()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    invoke-virtual {v0, v7, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v4}, La/a;->X0(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    const-string v15, "  registers_size: "

    .line 267
    .line 268
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    invoke-virtual {v0, v13, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v6}, La/a;->X0(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    const-string v15, "  ins_size:       "

    .line 280
    .line 281
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    invoke-virtual {v0, v13, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v9}, La/a;->X0(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    const-string v15, "  outs_size:      "

    .line 293
    .line 294
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v14

    .line 298
    invoke-virtual {v0, v13, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v11}, La/a;->X0(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    const-string v15, "  tries_size:     "

    .line 306
    .line 307
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    invoke-virtual {v0, v13, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v12}, La/a;->Y0(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v14

    .line 318
    const-string v15, "  debug_off:      "

    .line 319
    .line 320
    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    const/4 v15, 0x4

    .line 325
    invoke-virtual {v0, v15, v14}, Lz4/d;->b(ILjava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v8}, La/a;->Y0(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    const-string v13, "  insns_size:     "

    .line 333
    .line 334
    invoke-virtual {v13, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    invoke-virtual {v0, v15, v13}, Lz4/d;->b(ILjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    iget-object v13, v1, Lr4/l;->o:Lw4/e;

    .line 342
    .line 343
    invoke-interface {v13}, Lw4/e;->size()I

    .line 344
    .line 345
    .line 346
    move-result v14

    .line 347
    if-eqz v14, :cond_11

    .line 348
    .line 349
    new-instance v14, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string v15, "  throws "

    .line 352
    .line 353
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-interface {v13}, Lw4/e;->size()I

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    if-nez v15, :cond_e

    .line 361
    .line 362
    const-string v13, "<empty>"

    .line 363
    .line 364
    move/from16 v16, v2

    .line 365
    .line 366
    move-object/from16 v17, v5

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_e
    new-instance v7, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    move/from16 v16, v2

    .line 372
    .line 373
    const/16 v2, 0x64

    .line 374
    .line 375
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 376
    .line 377
    .line 378
    const/4 v2, 0x0

    .line 379
    :goto_9
    if-ge v2, v15, :cond_10

    .line 380
    .line 381
    move-object/from16 v17, v5

    .line 382
    .line 383
    if-eqz v2, :cond_f

    .line 384
    .line 385
    const-string v5, ", "

    .line 386
    .line 387
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    :cond_f
    invoke-interface {v13, v2}, Lw4/e;->getType(I)Lw4/c;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-virtual {v5}, Lw4/c;->a()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    add-int/lit8 v2, v2, 0x1

    .line 402
    .line 403
    move-object/from16 v5, v17

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_10
    move-object/from16 v17, v5

    .line 407
    .line 408
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v13

    .line 412
    :goto_a
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/4 v5, 0x0

    .line 420
    invoke-virtual {v0, v5, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_11
    move/from16 v16, v2

    .line 425
    .line 426
    move-object/from16 v17, v5

    .line 427
    .line 428
    :goto_b
    invoke-virtual {v0, v4}, Lz4/d;->l(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v6}, Lz4/d;->l(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v9}, Lz4/d;->l(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v11}, Lz4/d;->l(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v12}, Lz4/d;->k(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v8}, Lz4/d;->k(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Li4/a;->j()V

    .line 447
    .line 448
    .line 449
    iget-object v2, v3, Li4/a;->m:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v2, Lp4/i;

    .line 452
    .line 453
    :try_start_0
    invoke-virtual {v2, v0}, Lp4/i;->p(Lz4/d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 454
    .line 455
    .line 456
    iget-object v2, v1, Lr4/l;->m:Lr4/i;

    .line 457
    .line 458
    const-string v3, "    "

    .line 459
    .line 460
    if-eqz v2, :cond_1c

    .line 461
    .line 462
    if-eqz v10, :cond_13

    .line 463
    .line 464
    if-eqz v16, :cond_12

    .line 465
    .line 466
    const-string v2, "  padding: 0"

    .line 467
    .line 468
    const/4 v4, 0x2

    .line 469
    invoke-virtual {v0, v4, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_12
    const/4 v5, 0x0

    .line 473
    invoke-virtual {v0, v5}, Lz4/d;->l(I)V

    .line 474
    .line 475
    .line 476
    :cond_13
    iget-object v2, v1, Lr4/l;->m:Lr4/i;

    .line 477
    .line 478
    invoke-virtual {v2}, Lr4/i;->a()V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Lz4/d;->d()Z

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    const-string v5, ".."

    .line 486
    .line 487
    if-eqz v4, :cond_19

    .line 488
    .line 489
    invoke-virtual {v2}, Lr4/i;->a()V

    .line 490
    .line 491
    .line 492
    iget-object v4, v2, Lr4/i;->b:Lp4/e;

    .line 493
    .line 494
    iget-object v4, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 495
    .line 496
    array-length v4, v4

    .line 497
    const-string v6, "  tries:"

    .line 498
    .line 499
    const/4 v7, 0x0

    .line 500
    invoke-virtual {v0, v7, v6}, Lz4/d;->b(ILjava/lang/String;)V

    .line 501
    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    :goto_c
    if-ge v6, v4, :cond_16

    .line 505
    .line 506
    iget-object v7, v2, Lr4/i;->b:Lp4/e;

    .line 507
    .line 508
    invoke-virtual {v7, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    check-cast v7, Lp4/d;

    .line 513
    .line 514
    iget-object v8, v7, Lp4/d;->i:Lp4/c;

    .line 515
    .line 516
    new-instance v9, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    const-string v10, "    try "

    .line 519
    .line 520
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    iget v10, v7, Lp4/d;->g:I

    .line 524
    .line 525
    int-to-char v11, v10

    .line 526
    if-ne v10, v11, :cond_14

    .line 527
    .line 528
    invoke-static {v10}, La/a;->X0(I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v10

    .line 532
    goto :goto_d

    .line 533
    :cond_14
    invoke-static {v10}, La/a;->Y0(I)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v10

    .line 537
    :goto_d
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    iget v7, v7, Lp4/d;->h:I

    .line 544
    .line 545
    int-to-char v10, v7

    .line 546
    if-ne v7, v10, :cond_15

    .line 547
    .line 548
    invoke-static {v7}, La/a;->X0(I)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    goto :goto_e

    .line 553
    :cond_15
    invoke-static {v7}, La/a;->Y0(I)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v7

    .line 557
    :goto_e
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    const-string v9, ""

    .line 565
    .line 566
    invoke-virtual {v8, v3, v9}, Lp4/c;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    const/4 v9, 0x6

    .line 571
    invoke-virtual {v0, v9, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 572
    .line 573
    .line 574
    const/4 v7, 0x2

    .line 575
    invoke-virtual {v0, v7, v8}, Lz4/d;->b(ILjava/lang/String;)V

    .line 576
    .line 577
    .line 578
    add-int/lit8 v6, v6, 0x1

    .line 579
    .line 580
    goto :goto_c

    .line 581
    :cond_16
    const-string v4, "  handlers:"

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    invoke-virtual {v0, v7, v4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 585
    .line 586
    .line 587
    iget v4, v2, Lr4/i;->d:I

    .line 588
    .line 589
    iget-object v6, v2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 590
    .line 591
    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    invoke-static {v6}, La/a;->X0(I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    const-string v7, "    size: "

    .line 600
    .line 601
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    invoke-virtual {v0, v4, v6}, Lz4/d;->b(ILjava/lang/String;)V

    .line 606
    .line 607
    .line 608
    iget-object v4, v2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 609
    .line 610
    invoke-virtual {v4}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    const/4 v6, 0x0

    .line 619
    move-object v7, v6

    .line 620
    const/4 v6, 0x0

    .line 621
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v8

    .line 625
    const-string v9, ": "

    .line 626
    .line 627
    if-eqz v8, :cond_18

    .line 628
    .line 629
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    check-cast v8, Ljava/util/Map$Entry;

    .line 634
    .line 635
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    check-cast v10, Lp4/c;

    .line 640
    .line 641
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v8

    .line 645
    check-cast v8, Ljava/lang/Integer;

    .line 646
    .line 647
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 648
    .line 649
    .line 650
    move-result v8

    .line 651
    if-eqz v7, :cond_17

    .line 652
    .line 653
    sub-int v11, v8, v6

    .line 654
    .line 655
    invoke-static {v6}, La/a;->X0(I)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v6

    .line 659
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-virtual {v7, v3, v6}, Lp4/c;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    invoke-virtual {v0, v11, v6}, Lz4/d;->b(ILjava/lang/String;)V

    .line 668
    .line 669
    .line 670
    :cond_17
    move v6, v8

    .line 671
    move-object v7, v10

    .line 672
    goto :goto_f

    .line 673
    :cond_18
    iget-object v4, v2, Lr4/i;->c:[B

    .line 674
    .line 675
    array-length v4, v4

    .line 676
    sub-int/2addr v4, v6

    .line 677
    invoke-static {v6}, La/a;->X0(I)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v6

    .line 681
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v6

    .line 685
    invoke-virtual {v7, v3, v6}, Lp4/c;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v6

    .line 689
    invoke-virtual {v0, v4, v6}, Lz4/d;->b(ILjava/lang/String;)V

    .line 690
    .line 691
    .line 692
    :cond_19
    iget-object v4, v2, Lr4/i;->b:Lp4/e;

    .line 693
    .line 694
    iget-object v4, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 695
    .line 696
    array-length v4, v4

    .line 697
    const/4 v6, 0x0

    .line 698
    :goto_10
    if-ge v6, v4, :cond_1b

    .line 699
    .line 700
    iget-object v7, v2, Lr4/i;->b:Lp4/e;

    .line 701
    .line 702
    invoke-virtual {v7, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    check-cast v7, Lp4/d;

    .line 707
    .line 708
    iget v8, v7, Lp4/d;->g:I

    .line 709
    .line 710
    iget v9, v7, Lp4/d;->h:I

    .line 711
    .line 712
    sub-int v10, v9, v8

    .line 713
    .line 714
    const/high16 v11, 0x10000

    .line 715
    .line 716
    if-ge v10, v11, :cond_1a

    .line 717
    .line 718
    invoke-virtual {v0, v8}, Lz4/d;->k(I)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0, v10}, Lz4/d;->l(I)V

    .line 722
    .line 723
    .line 724
    iget-object v8, v2, Lr4/i;->e:Ljava/util/TreeMap;

    .line 725
    .line 726
    iget-object v7, v7, Lp4/d;->i:Lp4/c;

    .line 727
    .line 728
    invoke-virtual {v8, v7}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v7

    .line 732
    check-cast v7, Ljava/lang/Integer;

    .line 733
    .line 734
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 735
    .line 736
    .line 737
    move-result v7

    .line 738
    invoke-virtual {v0, v7}, Lz4/d;->l(I)V

    .line 739
    .line 740
    .line 741
    add-int/lit8 v6, v6, 0x1

    .line 742
    .line 743
    goto :goto_10

    .line 744
    :cond_1a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 745
    .line 746
    invoke-static {v8}, La/a;->Y0(I)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    new-instance v4, Ljava/lang/StringBuilder;

    .line 755
    .line 756
    const-string v6, "bogus exception range: "

    .line 757
    .line 758
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    throw v0

    .line 778
    :cond_1b
    iget-object v2, v2, Lr4/i;->c:[B

    .line 779
    .line 780
    invoke-virtual {v0, v2}, Lz4/d;->i([B)V

    .line 781
    .line 782
    .line 783
    :cond_1c
    if-eqz v16, :cond_1d

    .line 784
    .line 785
    iget-object v2, v1, Lr4/l;->p:Lr4/o;

    .line 786
    .line 787
    if-eqz v2, :cond_1d

    .line 788
    .line 789
    const-string v2, "  debug info"

    .line 790
    .line 791
    const/4 v5, 0x0

    .line 792
    invoke-virtual {v0, v5, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 793
    .line 794
    .line 795
    iget-object v2, v1, Lr4/l;->p:Lr4/o;

    .line 796
    .line 797
    move-object/from16 v4, p1

    .line 798
    .line 799
    invoke-virtual {v2, v4, v3, v0, v5}, Lr4/o;->n(Lr4/p;Ljava/lang/String;Lz4/d;Z)[B

    .line 800
    .line 801
    .line 802
    :cond_1d
    return-void

    .line 803
    :catch_0
    move-exception v0

    .line 804
    invoke-virtual/range {v17 .. v17}, Lv4/w;->a()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const-string v3, "...while writing instructions for "

    .line 809
    .line 810
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-static {v2, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CodeItem{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr4/l;->k:Lv4/y;

    .line 9
    .line 10
    invoke-virtual {v1}, Lv4/w;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "}"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
