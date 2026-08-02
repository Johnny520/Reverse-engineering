.class public final Lyt;
.super Lxs1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final l:Ln30;

.field public final m:Lkj1;

.field public n:Lxp;

.field public final o:Z

.field public final p:Ld63;


# direct methods
.method public constructor <init>(Ln30;Lkj1;ZLd63;)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lxs1;-><init>(II)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lyt;->l:Ln30;

    .line 14
    .line 15
    iput-object p2, p0, Lyt;->m:Lkj1;

    .line 16
    .line 17
    iput-boolean p3, p0, Lyt;->o:Z

    .line 18
    .line 19
    iput-object p4, p0, Lyt;->p:Ld63;

    .line 20
    .line 21
    iput-object v0, p0, Lyt;->n:Lxp;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "throwsList == null"

    .line 25
    .line 26
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    const-string p0, "code == null"

    .line 31
    .line 32
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_2
    const-string p0, "ref == null"

    .line 37
    .line 38
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 12

    .line 1
    iget-object v0, p1, Lz70;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p1, Lz70;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb42;

    .line 6
    .line 7
    iget-object v1, p0, Lyt;->m:Lkj1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Lkj1;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lsd0;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lkj1;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lvu2;

    .line 22
    .line 23
    iget-object v2, v2, Lvu2;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lb5;

    .line 26
    .line 27
    iget-object v2, v2, Lb5;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lbk;

    .line 30
    .line 31
    iget-object v3, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 32
    .line 33
    array-length v3, v3

    .line 34
    const/4 v4, 0x0

    .line 35
    move v5, v4

    .line 36
    :goto_0
    const/16 v6, 0x14

    .line 37
    .line 38
    if-ge v5, v3, :cond_4

    .line 39
    .line 40
    invoke-virtual {v2, v5}, Lkj0;->e(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, Lzj;

    .line 45
    .line 46
    iget-object v7, v7, Lzj;->b:Lj01;

    .line 47
    .line 48
    invoke-virtual {v7}, Lj01;->h()Li01;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Li01;->e()Ld63;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Lkj0;

    .line 57
    .line 58
    iget-object v7, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 59
    .line 60
    array-length v7, v7

    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    iget-object v2, v1, Lkj1;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lvu2;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v3, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v2, Lvu2;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lb5;

    .line 78
    .line 79
    iget-object v2, v2, Lb5;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lbk;

    .line 82
    .line 83
    iget-object v5, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 84
    .line 85
    array-length v5, v5

    .line 86
    move v7, v4

    .line 87
    :goto_1
    if-ge v7, v5, :cond_1

    .line 88
    .line 89
    invoke-virtual {v2, v7}, Lkj0;->e(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Lzj;

    .line 94
    .line 95
    iget-object v8, v8, Lzj;->b:Lj01;

    .line 96
    .line 97
    invoke-virtual {v8}, Lj01;->h()Li01;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v8}, Li01;->e()Ld63;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    move-object v9, v8

    .line 106
    check-cast v9, Lkj0;

    .line 107
    .line 108
    iget-object v9, v9, Lkj0;->i:[Ljava/lang/Object;

    .line 109
    .line 110
    array-length v9, v9

    .line 111
    move v10, v4

    .line 112
    :goto_2
    if-ge v10, v9, :cond_0

    .line 113
    .line 114
    invoke-interface {v8, v10}, Ld63;->getType(I)Lo43;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    add-int/lit8 v10, v10, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_2

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lo43;

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Lb42;->q(Lo43;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_2
    new-instance v0, Lxp;

    .line 148
    .line 149
    invoke-direct {v0, v1}, Lxp;-><init>(Lkj1;)V

    .line 150
    .line 151
    .line 152
    iput-object v0, p0, Lyt;->n:Lxp;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_4
    :goto_4
    iget-object p0, v1, Lkj1;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lsd0;

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v0, Ljava/util/HashSet;

    .line 166
    .line 167
    invoke-direct {v0, v6}, Ljava/util/HashSet;-><init>(I)V

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, Lsd0;->f:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, La40;

    .line 189
    .line 190
    instance-of v2, v1, Lf30;

    .line 191
    .line 192
    if-eqz v2, :cond_5

    .line 193
    .line 194
    check-cast v1, Lf30;

    .line 195
    .line 196
    iget-object v1, v1, Lf30;->e:Ldz;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_5
    instance-of v1, v1, Lgc1;

    .line 203
    .line 204
    if-nez v1, :cond_6

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_6
    const/4 p0, 0x0

    .line 208
    throw p0

    .line 209
    :cond_7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_8

    .line 218
    .line 219
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ldz;

    .line 224
    .line 225
    invoke-virtual {p1, v0}, Lz70;->a(Ldz;)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_8
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->u:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Leh1;I)V
    .locals 10

    .line 1
    iget-object p1, p1, Ljm2;->b:Lz70;

    .line 2
    .line 3
    new-instance p2, Ln4;

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    invoke-direct {p2, v0, p1}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyt;->m:Lkj1;

    .line 10
    .line 11
    iget-object v1, v0, Lkj1;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lsd0;

    .line 14
    .line 15
    iget-object v1, v1, Lsd0;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La40;

    .line 34
    .line 35
    instance-of v3, v2, Lf30;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    check-cast v2, Lf30;

    .line 40
    .line 41
    iget-object v3, v2, Lf30;->e:Ldz;

    .line 42
    .line 43
    invoke-virtual {p2, v3}, Ln4;->t(Ldz;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ltz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Lf30;->o(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    instance-of v4, v3, Lm30;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    check-cast v3, Lm30;

    .line 57
    .line 58
    iget-object v3, v3, Lm30;->h:Lr30;

    .line 59
    .line 60
    invoke-virtual {p2, v3}, Ln4;->t(Ldz;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ltz v3, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Lf30;->n(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object p2, p0, Lyt;->n:Lxp;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    if-eqz p2, :cond_a

    .line 74
    .line 75
    invoke-virtual {p2}, Lxp;->a()V

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, Lz70;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Lb42;

    .line 81
    .line 82
    iget-object v2, p2, Lxp;->b:Lzp;

    .line 83
    .line 84
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 85
    .line 86
    array-length v2, v2

    .line 87
    new-instance v3, Ljava/util/TreeMap;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/TreeMap;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, p2, Lxp;->e:Ljava/util/TreeMap;

    .line 93
    .line 94
    move v3, v1

    .line 95
    :goto_1
    iget-object v4, p2, Lxp;->e:Ljava/util/TreeMap;

    .line 96
    .line 97
    if-ge v3, v2, :cond_3

    .line 98
    .line 99
    iget-object v5, p2, Lxp;->b:Lzp;

    .line 100
    .line 101
    invoke-virtual {v5, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lyp;

    .line 106
    .line 107
    iget-object v5, v5, Lyp;->j:Lwp;

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    invoke-virtual {v4, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const v3, 0xffff

    .line 121
    .line 122
    .line 123
    if-gt v2, v3, :cond_9

    .line 124
    .line 125
    new-instance v2, Lyn;

    .line 126
    .line 127
    invoke-direct {v2}, Lyn;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-object v3, p2, Lxp;->e:Ljava/util/TreeMap;

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/util/TreeMap;->size()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-virtual {v2, v3}, Lyn;->m(I)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    iput v3, p2, Lxp;->d:I

    .line 141
    .line 142
    iget-object v3, p2, Lxp;->e:Ljava/util/TreeMap;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_8

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Ljava/util/Map$Entry;

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Lwp;

    .line 169
    .line 170
    iget-object v6, v5, Lkj0;->i:[Ljava/lang/Object;

    .line 171
    .line 172
    array-length v7, v6

    .line 173
    array-length v6, v6

    .line 174
    if-nez v6, :cond_5

    .line 175
    .line 176
    move v6, v1

    .line 177
    goto :goto_3

    .line 178
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 179
    .line 180
    invoke-virtual {v5, v6}, Lkj0;->e(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, Lvp;

    .line 185
    .line 186
    iget-object v6, v6, Lvp;->h:Lr30;

    .line 187
    .line 188
    sget-object v8, Lr30;->k:Lr30;

    .line 189
    .line 190
    invoke-virtual {v6, v8}, Lr30;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    :goto_3
    iget v8, v2, Lyn;->c:I

    .line 195
    .line 196
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-interface {v4, v8}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    if-eqz v6, :cond_6

    .line 204
    .line 205
    add-int/lit8 v4, v7, -0x1

    .line 206
    .line 207
    neg-int v4, v4

    .line 208
    invoke-virtual {v2, v4}, Lyn;->l(I)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v7, v7, -0x1

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    invoke-virtual {v2, v7}, Lyn;->l(I)V

    .line 215
    .line 216
    .line 217
    :goto_4
    move v4, v1

    .line 218
    :goto_5
    if-ge v4, v7, :cond_7

    .line 219
    .line 220
    invoke-virtual {v5, v4}, Lkj0;->e(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    check-cast v8, Lvp;

    .line 225
    .line 226
    iget-object v9, v8, Lvp;->h:Lr30;

    .line 227
    .line 228
    invoke-virtual {p1, v9}, Lb42;->m(Lr30;)I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    invoke-virtual {v2, v9}, Lyn;->m(I)I

    .line 233
    .line 234
    .line 235
    iget v8, v8, Lvp;->i:I

    .line 236
    .line 237
    invoke-virtual {v2, v8}, Lyn;->m(I)I

    .line 238
    .line 239
    .line 240
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_7
    if-eqz v6, :cond_4

    .line 244
    .line 245
    invoke-virtual {v5, v7}, Lkj0;->e(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, Lvp;

    .line 250
    .line 251
    iget v4, v4, Lvp;->i:I

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Lyn;->m(I)I

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_8
    iget p1, v2, Lyn;->c:I

    .line 258
    .line 259
    new-array v3, p1, [B

    .line 260
    .line 261
    iget-object v2, v2, Lyn;->b:[B

    .line 262
    .line 263
    invoke-static {v2, v1, v3, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 264
    .line 265
    .line 266
    iput-object v3, p2, Lxp;->c:[B

    .line 267
    .line 268
    iget-object p1, p0, Lyt;->n:Lxp;

    .line 269
    .line 270
    invoke-virtual {p1}, Lxp;->a()V

    .line 271
    .line 272
    .line 273
    iget-object p2, p1, Lxp;->b:Lzp;

    .line 274
    .line 275
    iget-object p2, p2, Lkj0;->i:[Ljava/lang/Object;

    .line 276
    .line 277
    array-length p2, p2

    .line 278
    mul-int/lit8 p2, p2, 0x8

    .line 279
    .line 280
    iget-object p1, p1, Lxp;->c:[B

    .line 281
    .line 282
    array-length p1, p1

    .line 283
    add-int v1, p2, p1

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_9
    const-string p0, "too many catch handlers"

    .line 287
    .line 288
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_a
    :goto_6
    invoke-virtual {v0}, Lkj1;->v()V

    .line 293
    .line 294
    .line 295
    iget-object p1, v0, Lkj1;->l:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p1, Lb40;

    .line 298
    .line 299
    invoke-virtual {p1}, Lb40;->h()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    and-int/lit8 p2, p1, 0x1

    .line 304
    .line 305
    if-eqz p2, :cond_b

    .line 306
    .line 307
    add-int/lit8 p1, p1, 0x1

    .line 308
    .line 309
    :cond_b
    mul-int/lit8 p1, p1, 0x2

    .line 310
    .line 311
    add-int/lit8 p1, p1, 0x10

    .line 312
    .line 313
    add-int/2addr p1, v1

    .line 314
    invoke-virtual {p0, p1}, Lxs1;->j(I)V

    .line 315
    .line 316
    .line 317
    return-void
.end method

.method public final k(Lz70;Lyn;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Lyn;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v0, Lyt;->m:Lkj1;

    .line 10
    .line 11
    invoke-virtual {v3}, Lkj1;->v()V

    .line 12
    .line 13
    .line 14
    iget-object v4, v3, Lkj1;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Lb40;

    .line 17
    .line 18
    iget v4, v4, Lb40;->j:I

    .line 19
    .line 20
    invoke-virtual {v3}, Lkj1;->v()V

    .line 21
    .line 22
    .line 23
    iget-object v5, v3, Lkj1;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Lb40;

    .line 26
    .line 27
    iget-object v6, v5, Lkj0;->i:[Ljava/lang/Object;

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
    if-ge v8, v6, :cond_3

    .line 35
    .line 36
    invoke-virtual {v5, v8}, Lkj0;->e(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    check-cast v11, La40;

    .line 41
    .line 42
    instance-of v12, v11, Lf30;

    .line 43
    .line 44
    if-eqz v12, :cond_2

    .line 45
    .line 46
    move-object v12, v11

    .line 47
    check-cast v12, Lf30;

    .line 48
    .line 49
    iget-object v12, v12, Lf30;->e:Ldz;

    .line 50
    .line 51
    instance-of v13, v12, Ln30;

    .line 52
    .line 53
    if-eqz v13, :cond_1

    .line 54
    .line 55
    check-cast v12, Ln30;

    .line 56
    .line 57
    iget-object v11, v11, La40;->b:Loa0;

    .line 58
    .line 59
    iget v11, v11, Loa0;->b:I

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
    invoke-virtual {v12, v10}, Ln30;->g(Z)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move v10, v7

    .line 73
    :goto_2
    if-le v10, v9, :cond_2

    .line 74
    .line 75
    move v9, v10

    .line 76
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-boolean v5, v0, Lyt;->o:Z

    .line 80
    .line 81
    iget-object v6, v0, Lyt;->l:Ln30;

    .line 82
    .line 83
    invoke-virtual {v6, v5}, Ln30;->g(Z)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v3}, Lkj1;->v()V

    .line 88
    .line 89
    .line 90
    iget-object v8, v3, Lkj1;->l:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Lb40;

    .line 93
    .line 94
    invoke-virtual {v8}, Lb40;->h()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    and-int/lit8 v11, v8, 0x1

    .line 99
    .line 100
    if-eqz v11, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move v10, v7

    .line 104
    :goto_3
    iget-object v11, v0, Lyt;->n:Lxp;

    .line 105
    .line 106
    if-nez v11, :cond_5

    .line 107
    .line 108
    move v11, v7

    .line 109
    goto :goto_4

    .line 110
    :cond_5
    invoke-virtual {v11}, Lxp;->a()V

    .line 111
    .line 112
    .line 113
    iget-object v11, v11, Lxp;->b:Lzp;

    .line 114
    .line 115
    iget-object v11, v11, Lkj0;->i:[Ljava/lang/Object;

    .line 116
    .line 117
    array-length v11, v11

    .line 118
    :goto_4
    const/4 v12, 0x2

    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    new-instance v13, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lxs1;->g()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const/16 v14, 0x20

    .line 134
    .line 135
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, Lm30;->b()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-virtual {v1, v13, v7}, Lyn;->c(Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    invoke-static {v4}, Lpp0;->J(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const-string v14, "  registers_size: "

    .line 157
    .line 158
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    invoke-virtual {v1, v13, v12}, Lyn;->c(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v5}, Lpp0;->J(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    const-string v14, "  ins_size:       "

    .line 170
    .line 171
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-virtual {v1, v13, v12}, Lyn;->c(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v9}, Lpp0;->J(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    const-string v14, "  outs_size:      "

    .line 183
    .line 184
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-virtual {v1, v13, v12}, Lyn;->c(Ljava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v11}, Lpp0;->J(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    const-string v14, "  tries_size:     "

    .line 196
    .line 197
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-virtual {v1, v13, v12}, Lyn;->c(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v7}, Lpp0;->K(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    const-string v14, "  debug_off:      "

    .line 209
    .line 210
    invoke-virtual {v14, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    const/4 v14, 0x4

    .line 215
    invoke-virtual {v1, v13, v14}, Lyn;->c(Ljava/lang/String;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {v8}, Lpp0;->K(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    const-string v15, "  insns_size:     "

    .line 223
    .line 224
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    invoke-virtual {v1, v13, v14}, Lyn;->c(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    iget-object v13, v0, Lyt;->p:Ld63;

    .line 232
    .line 233
    move-object v14, v13

    .line 234
    check-cast v14, Lkj0;

    .line 235
    .line 236
    iget-object v15, v14, Lkj0;->i:[Ljava/lang/Object;

    .line 237
    .line 238
    array-length v15, v15

    .line 239
    if-eqz v15, :cond_9

    .line 240
    .line 241
    new-instance v15, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v12, "  throws "

    .line 244
    .line 245
    invoke-direct {v15, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object v12, v14, Lkj0;->i:[Ljava/lang/Object;

    .line 249
    .line 250
    array-length v12, v12

    .line 251
    if-nez v12, :cond_6

    .line 252
    .line 253
    const-string v12, "<empty>"

    .line 254
    .line 255
    move/from16 v16, v2

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_6
    new-instance v14, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const/16 v7, 0x64

    .line 261
    .line 262
    invoke-direct {v14, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 263
    .line 264
    .line 265
    const/4 v7, 0x0

    .line 266
    :goto_5
    if-ge v7, v12, :cond_8

    .line 267
    .line 268
    move/from16 v16, v2

    .line 269
    .line 270
    if-eqz v7, :cond_7

    .line 271
    .line 272
    const-string v2, ", "

    .line 273
    .line 274
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    :cond_7
    invoke-interface {v13, v7}, Ld63;->getType(I)Lo43;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v2}, Lo43;->b()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    add-int/lit8 v7, v7, 0x1

    .line 289
    .line 290
    move/from16 v2, v16

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_8
    move/from16 v16, v2

    .line 294
    .line 295
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    :goto_6
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const/4 v7, 0x0

    .line 307
    invoke-virtual {v1, v2, v7}, Lyn;->c(Ljava/lang/String;I)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_9
    move/from16 v16, v2

    .line 312
    .line 313
    :goto_7
    invoke-virtual {v1, v4}, Lyn;->k(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v5}, Lyn;->k(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v9}, Lyn;->k(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v11}, Lyn;->k(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v7}, Lyn;->j(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v8}, Lyn;->j(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Lkj1;->v()V

    .line 332
    .line 333
    .line 334
    iget-object v2, v3, Lkj1;->l:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, Lb40;

    .line 337
    .line 338
    :try_start_0
    invoke-virtual {v2, v1}, Lb40;->i(Lyn;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    .line 340
    .line 341
    iget-object v2, v0, Lyt;->n:Lxp;

    .line 342
    .line 343
    if-eqz v2, :cond_14

    .line 344
    .line 345
    if-eqz v10, :cond_b

    .line 346
    .line 347
    if-eqz v16, :cond_a

    .line 348
    .line 349
    const-string v2, "  padding: 0"

    .line 350
    .line 351
    const/4 v3, 0x2

    .line 352
    invoke-virtual {v1, v2, v3}, Lyn;->c(Ljava/lang/String;I)V

    .line 353
    .line 354
    .line 355
    :cond_a
    const/4 v7, 0x0

    .line 356
    invoke-virtual {v1, v7}, Lyn;->k(I)V

    .line 357
    .line 358
    .line 359
    :cond_b
    iget-object v0, v0, Lyt;->n:Lxp;

    .line 360
    .line 361
    invoke-virtual {v0}, Lxp;->a()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Lyn;->d()Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    const-string v3, ".."

    .line 369
    .line 370
    if-eqz v2, :cond_11

    .line 371
    .line 372
    invoke-virtual {v0}, Lxp;->a()V

    .line 373
    .line 374
    .line 375
    iget-object v2, v0, Lxp;->b:Lzp;

    .line 376
    .line 377
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 378
    .line 379
    array-length v2, v2

    .line 380
    const-string v4, "  tries:"

    .line 381
    .line 382
    const/4 v7, 0x0

    .line 383
    invoke-virtual {v1, v4, v7}, Lyn;->c(Ljava/lang/String;I)V

    .line 384
    .line 385
    .line 386
    const/4 v7, 0x0

    .line 387
    :goto_8
    const-string v4, "    "

    .line 388
    .line 389
    if-ge v7, v2, :cond_e

    .line 390
    .line 391
    iget-object v5, v0, Lxp;->b:Lzp;

    .line 392
    .line 393
    invoke-virtual {v5, v7}, Lkj0;->e(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    check-cast v5, Lyp;

    .line 398
    .line 399
    iget-object v6, v5, Lyp;->j:Lwp;

    .line 400
    .line 401
    new-instance v8, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v9, "    try "

    .line 404
    .line 405
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    iget v9, v5, Lyp;->h:I

    .line 409
    .line 410
    int-to-char v10, v9

    .line 411
    if-ne v9, v10, :cond_c

    .line 412
    .line 413
    invoke-static {v9}, Lpp0;->J(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v9

    .line 417
    goto :goto_9

    .line 418
    :cond_c
    invoke-static {v9}, Lpp0;->K(I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    :goto_9
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    iget v5, v5, Lyp;->i:I

    .line 429
    .line 430
    int-to-char v9, v5

    .line 431
    if-ne v5, v9, :cond_d

    .line 432
    .line 433
    invoke-static {v5}, Lpp0;->J(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    goto :goto_a

    .line 438
    :cond_d
    invoke-static {v5}, Lpp0;->K(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    :goto_a
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    const-string v8, ""

    .line 450
    .line 451
    invoke-virtual {v6, v4, v8}, Lwp;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    const/4 v6, 0x6

    .line 456
    invoke-virtual {v1, v5, v6}, Lyn;->c(Ljava/lang/String;I)V

    .line 457
    .line 458
    .line 459
    const/4 v5, 0x2

    .line 460
    invoke-virtual {v1, v4, v5}, Lyn;->c(Ljava/lang/String;I)V

    .line 461
    .line 462
    .line 463
    add-int/lit8 v7, v7, 0x1

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_e
    const-string v2, "  handlers:"

    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    invoke-virtual {v1, v2, v7}, Lyn;->c(Ljava/lang/String;I)V

    .line 470
    .line 471
    .line 472
    iget v2, v0, Lxp;->d:I

    .line 473
    .line 474
    iget-object v5, v0, Lxp;->e:Ljava/util/TreeMap;

    .line 475
    .line 476
    invoke-virtual {v5}, Ljava/util/TreeMap;->size()I

    .line 477
    .line 478
    .line 479
    move-result v5

    .line 480
    invoke-static {v5}, Lpp0;->J(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    const-string v6, "    size: "

    .line 485
    .line 486
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v1, v5, v2}, Lyn;->c(Ljava/lang/String;I)V

    .line 491
    .line 492
    .line 493
    iget-object v2, v0, Lxp;->e:Ljava/util/TreeMap;

    .line 494
    .line 495
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const/4 v5, 0x0

    .line 504
    move v6, v7

    .line 505
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    const-string v9, ": "

    .line 510
    .line 511
    if-eqz v8, :cond_10

    .line 512
    .line 513
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    check-cast v8, Ljava/util/Map$Entry;

    .line 518
    .line 519
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    check-cast v10, Lwp;

    .line 524
    .line 525
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    check-cast v8, Ljava/lang/Integer;

    .line 530
    .line 531
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    if-eqz v5, :cond_f

    .line 536
    .line 537
    sub-int v11, v8, v6

    .line 538
    .line 539
    invoke-static {v6}, Lpp0;->J(I)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    invoke-virtual {v5, v4, v6}, Lwp;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    invoke-virtual {v1, v5, v11}, Lyn;->c(Ljava/lang/String;I)V

    .line 552
    .line 553
    .line 554
    :cond_f
    move v6, v8

    .line 555
    move-object v5, v10

    .line 556
    goto :goto_b

    .line 557
    :cond_10
    iget-object v2, v0, Lxp;->c:[B

    .line 558
    .line 559
    array-length v2, v2

    .line 560
    sub-int/2addr v2, v6

    .line 561
    invoke-static {v6}, Lpp0;->J(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    invoke-virtual {v5, v4, v6}, Lwp;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-virtual {v1, v4, v2}, Lyn;->c(Ljava/lang/String;I)V

    .line 574
    .line 575
    .line 576
    goto :goto_c

    .line 577
    :cond_11
    const/4 v7, 0x0

    .line 578
    :goto_c
    iget-object v2, v0, Lxp;->b:Lzp;

    .line 579
    .line 580
    iget-object v2, v2, Lkj0;->i:[Ljava/lang/Object;

    .line 581
    .line 582
    array-length v2, v2

    .line 583
    :goto_d
    if-ge v7, v2, :cond_13

    .line 584
    .line 585
    iget-object v4, v0, Lxp;->b:Lzp;

    .line 586
    .line 587
    invoke-virtual {v4, v7}, Lkj0;->e(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    check-cast v4, Lyp;

    .line 592
    .line 593
    iget v5, v4, Lyp;->h:I

    .line 594
    .line 595
    iget v6, v4, Lyp;->i:I

    .line 596
    .line 597
    sub-int v8, v6, v5

    .line 598
    .line 599
    const/high16 v9, 0x10000

    .line 600
    .line 601
    if-ge v8, v9, :cond_12

    .line 602
    .line 603
    invoke-virtual {v1, v5}, Lyn;->j(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v8}, Lyn;->k(I)V

    .line 607
    .line 608
    .line 609
    iget-object v5, v0, Lxp;->e:Ljava/util/TreeMap;

    .line 610
    .line 611
    iget-object v4, v4, Lyp;->j:Lwp;

    .line 612
    .line 613
    invoke-virtual {v5, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    check-cast v4, Ljava/lang/Integer;

    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    invoke-virtual {v1, v4}, Lyn;->k(I)V

    .line 624
    .line 625
    .line 626
    add-int/lit8 v7, v7, 0x1

    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_12
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 630
    .line 631
    invoke-static {v5}, Lpp0;->K(I)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-static {v6}, Lpp0;->K(I)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    new-instance v4, Ljava/lang/StringBuilder;

    .line 640
    .line 641
    const-string v5, "bogus exception range: "

    .line 642
    .line 643
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    throw v0

    .line 663
    :cond_13
    iget-object v0, v0, Lxp;->c:[B

    .line 664
    .line 665
    invoke-virtual {v1, v0}, Lyn;->h([B)V

    .line 666
    .line 667
    .line 668
    :cond_14
    return-void

    .line 669
    :catch_0
    move-exception v0

    .line 670
    invoke-virtual {v6}, Lm30;->b()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    const-string v2, "...while writing instructions for "

    .line 675
    .line 676
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-static {v0, v1}, Lsg0;->a(Ljava/lang/Exception;Ljava/lang/String;)Lsg0;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
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
    iget-object p0, p0, Lyt;->l:Ln30;

    .line 9
    .line 10
    invoke-virtual {p0}, Lm30;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, "}"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
