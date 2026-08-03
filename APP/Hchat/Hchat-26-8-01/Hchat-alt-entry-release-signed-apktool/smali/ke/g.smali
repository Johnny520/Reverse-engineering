.class public final Lke/g;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/d;


# static fields
.field public static final k:Lke/g;

.field public static final l:Lke/g;


# instance fields
.field public final synthetic j:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lke/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lke/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lke/g;->k:Lke/g;

    .line 8
    .line 9
    new-instance v0, Lke/g;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lke/g;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lke/g;->l:Lke/g;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lke/g;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static t0(Lud/j;)Z
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lmd/e;

    .line 3
    .line 4
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 5
    .line 6
    sget-object v1, Lmd/a;->s:Lmd/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Lud/a;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lud/a;

    .line 20
    .line 21
    iget-object p0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    instance-of v0, p0, Lzd/c;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    move-object v0, p0

    .line 33
    check-cast v0, Lzd/c;

    .line 34
    .line 35
    iget-object v0, v0, Lzd/c;->o:Lud/a;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    instance-of v0, p0, Lud/n;

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    check-cast p0, Lud/n;

    .line 45
    .line 46
    invoke-interface {p0}, Lud/n;->u()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lud/j;

    .line 65
    .line 66
    invoke-static {v0}, Lke/g;->t0(Lud/j;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 74
    return p0

    .line 75
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 76
    return p0
.end method

.method public static u0(Ljava/util/List;Lud/a;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lud/a;

    .line 16
    .line 17
    if-eq v0, p1, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lmd/a;->u:Lmd/a;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public static v0(Lud/p;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->R:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    iget-object v3, p0, Lud/p;->m:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v1, v3, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    instance-of v4, v3, Lqd/m;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    check-cast v3, Lqd/m;

    .line 31
    .line 32
    iget-object v3, v3, Lqd/m;->l:Lud/p;

    .line 33
    .line 34
    invoke-static {v3}, Lke/g;->v0(Lud/p;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return v0
.end method

.method public static w0(Lud/j;)Lud/a;
    .locals 2

    .line 1
    instance-of v0, p0, Lxd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lxd/b;

    .line 6
    .line 7
    iget-object p0, p0, Lxd/b;->k:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lud/j;

    .line 22
    .line 23
    instance-of v0, p0, Lud/a;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p0, Lud/a;

    .line 28
    .line 29
    iget-object v0, p0, Lud/a;->l:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static x0(Lud/r;Lud/n;)Z
    .locals 14

    .line 1
    instance-of v0, p1, Lyd/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_17

    .line 5
    .line 6
    check-cast p1, Lyd/c;

    .line 7
    .line 8
    sget-object v0, Lmd/a;->R:Lmd/a;

    .line 9
    .line 10
    iget-object v2, p1, Lmd/e;->g:Lmd/f;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget-object v0, p1, Lyd/c;->m:Lud/j;

    .line 21
    .line 22
    iget-object v2, p1, Lyd/c;->n:Lud/j;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    const/4 v3, 0x2

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x1

    .line 31
    if-nez v2, :cond_d

    .line 32
    .line 33
    invoke-static {v0}, Lke/g;->w0(Lud/j;)Lud/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_17

    .line 38
    .line 39
    iget-object v2, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lud/p;

    .line 46
    .line 47
    iget-object v6, v2, Lud/p;->l:Lqd/r;

    .line 48
    .line 49
    if-eqz v6, :cond_17

    .line 50
    .line 51
    iget-object v7, v6, Lqd/r;->m:Lqd/s;

    .line 52
    .line 53
    iget-object v7, v7, Lqd/s;->j:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eq v7, v5, :cond_2

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    iget-object v7, v6, Lqd/r;->m:Lqd/s;

    .line 64
    .line 65
    invoke-virtual {v7}, Lqd/s;->f()Lpd/q;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    if-eqz v7, :cond_17

    .line 70
    .line 71
    iget-object v8, v7, Lud/p;->m:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eq v9, v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_3
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_5

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Lqd/l;

    .line 96
    .line 97
    invoke-virtual {v6, v8}, Lqd/r;->h0(Lqd/l;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_4

    .line 102
    .line 103
    move-object v4, v8

    .line 104
    check-cast v4, Lqd/r;

    .line 105
    .line 106
    :cond_5
    if-nez v4, :cond_6

    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_6
    invoke-virtual {v4}, Lqd/r;->f0()Lud/p;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {p0}, Lud/r;->W()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_9

    .line 119
    .line 120
    iget-object v6, p0, Lud/r;->l:Lud/e;

    .line 121
    .line 122
    invoke-virtual {v6}, Lud/e;->c0()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_7

    .line 127
    .line 128
    iget-object v6, p0, Lud/r;->k:Lod/d;

    .line 129
    .line 130
    invoke-virtual {v6}, Lod/d;->e()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_7

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_7
    if-eqz v3, :cond_8

    .line 138
    .line 139
    invoke-virtual {v3}, Lud/p;->W()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_8

    .line 144
    .line 145
    invoke-static {p0, v2, v3}, Lke/g;->y0(Lud/r;Lud/p;Lud/p;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_9

    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :cond_8
    iget-object v6, v2, Lud/p;->l:Lqd/r;

    .line 154
    .line 155
    invoke-virtual {v6, v4}, Lqd/r;->g0(Lqd/r;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_9

    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :cond_9
    :goto_0
    iget-object v6, p1, Lyd/a;->l:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Lud/a;

    .line 170
    .line 171
    iget-object v8, p1, Lxd/a;->i:Lud/n;

    .line 172
    .line 173
    invoke-interface {v8, p1, v6}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-nez v8, :cond_a

    .line 178
    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :cond_a
    if-eqz v3, :cond_c

    .line 182
    .line 183
    invoke-virtual {v3}, Lud/p;->W()Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-eqz v8, :cond_c

    .line 188
    .line 189
    iget-object v4, v3, Lud/p;->l:Lqd/r;

    .line 190
    .line 191
    iget-object v4, v4, Lqd/r;->m:Lqd/s;

    .line 192
    .line 193
    iget-object v8, v4, Lqd/s;->j:Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-ne v8, v5, :cond_b

    .line 200
    .line 201
    invoke-virtual {v4}, Lqd/s;->f()Lpd/q;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-ne v4, v7, :cond_b

    .line 206
    .line 207
    invoke-static {p0, v3}, Lxe/l;->d(Lud/r;Lud/p;)V

    .line 208
    .line 209
    .line 210
    :cond_b
    invoke-static {v3}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    goto :goto_1

    .line 215
    :cond_c
    invoke-virtual {v4}, Lqd/r;->c0()Lqd/r;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :goto_1
    invoke-static {v2}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    iget-object v5, v7, Lud/p;->l:Lqd/r;

    .line 224
    .line 225
    invoke-virtual {v5}, Lqd/r;->c0()Lqd/r;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    new-instance v8, Ltd/b;

    .line 230
    .line 231
    iget-object v9, p1, Lyd/a;->k:Lyd/b;

    .line 232
    .line 233
    invoke-direct {v8, v9, v5, v4, v3}, Ltd/b;-><init>(Lyd/b;Lqd/r;Lqd/l;Lqd/l;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8}, Ltd/b;->i0()V

    .line 237
    .line 238
    .line 239
    invoke-static {p0, v7}, Lxe/l;->h(Lud/r;Lud/p;)V

    .line 240
    .line 241
    .line 242
    invoke-static {p0, v2}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v2}, Lxe/k;->b(Lud/a;Lud/p;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v6, Lud/a;->l:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8}, Ltd/b;->Z()V

    .line 254
    .line 255
    .line 256
    iget-object v0, v6, Lud/a;->l:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    iget-object p1, p1, Lyd/a;->l:Ljava/util/List;

    .line 262
    .line 263
    invoke-static {p1, v6}, Lke/g;->u0(Ljava/util/List;Lud/a;)V

    .line 264
    .line 265
    .line 266
    invoke-static {p0}, Lbe/b;->Y(Lud/r;)V

    .line 267
    .line 268
    .line 269
    return v1

    .line 270
    :cond_d
    invoke-static {v0}, Lke/g;->w0(Lud/j;)Lud/a;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v2}, Lke/g;->w0(Lud/j;)Lud/a;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    if-eqz v0, :cond_17

    .line 279
    .line 280
    if-nez v2, :cond_e

    .line 281
    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :cond_e
    iget-object v6, p1, Lyd/a;->l:Ljava/util/List;

    .line 285
    .line 286
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-eqz v7, :cond_f

    .line 291
    .line 292
    goto/16 :goto_3

    .line 293
    .line 294
    :cond_f
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    check-cast v7, Lud/a;

    .line 299
    .line 300
    iget-object v8, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    check-cast v8, Lud/p;

    .line 307
    .line 308
    iget-object v9, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    check-cast v9, Lud/p;

    .line 315
    .line 316
    invoke-static {p0, v8, v9}, Lke/g;->y0(Lud/r;Lud/p;Lud/p;)Z

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    if-nez v10, :cond_10

    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :cond_10
    iget-object v10, v8, Lud/p;->l:Lqd/r;

    .line 325
    .line 326
    iget-object v11, v9, Lud/p;->l:Lqd/r;

    .line 327
    .line 328
    if-eqz v10, :cond_14

    .line 329
    .line 330
    if-eqz v11, :cond_14

    .line 331
    .line 332
    iget-object v12, v10, Lqd/r;->m:Lqd/s;

    .line 333
    .line 334
    invoke-virtual {v12}, Lqd/s;->f()Lpd/q;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    iget-object v13, v11, Lqd/r;->m:Lqd/s;

    .line 339
    .line 340
    invoke-virtual {v13}, Lqd/s;->f()Lpd/q;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    if-eqz v12, :cond_17

    .line 345
    .line 346
    if-eq v12, v13, :cond_11

    .line 347
    .line 348
    goto/16 :goto_3

    .line 349
    .line 350
    :cond_11
    iget-object v13, p1, Lxd/a;->i:Lud/n;

    .line 351
    .line 352
    invoke-interface {v13, p1, v7}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    if-nez v13, :cond_12

    .line 357
    .line 358
    goto/16 :goto_3

    .line 359
    .line 360
    :cond_12
    invoke-static {v0, v8}, Lxe/k;->b(Lud/a;Lud/p;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v2, v9}, Lxe/k;->b(Lud/a;Lud/p;)V

    .line 364
    .line 365
    .line 366
    iget-object v0, v12, Lud/p;->m:Ljava/util/List;

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-ne v0, v3, :cond_13

    .line 373
    .line 374
    iget-object v10, v12, Lud/p;->l:Lqd/r;

    .line 375
    .line 376
    invoke-static {p0, v8}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 377
    .line 378
    .line 379
    goto :goto_2

    .line 380
    :cond_13
    invoke-virtual {v12, v11}, Lpd/q;->l0(Lqd/r;)V

    .line 381
    .line 382
    .line 383
    :goto_2
    invoke-static {v8}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v9}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    new-instance v2, Ltd/b;

    .line 392
    .line 393
    iget-object v3, p1, Lyd/a;->k:Lyd/b;

    .line 394
    .line 395
    invoke-direct {v2, v3, v10, v0, v1}, Ltd/b;-><init>(Lyd/b;Lqd/r;Lqd/l;Lqd/l;)V

    .line 396
    .line 397
    .line 398
    iget v0, v8, Lnd/r;->i:I

    .line 399
    .line 400
    iget v1, v9, Lnd/r;->i:I

    .line 401
    .line 402
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {p1}, Lyd/a;->H()I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    iput p1, v2, Lnd/r;->i:I

    .line 415
    .line 416
    iput-object v4, v8, Lud/p;->l:Lqd/r;

    .line 417
    .line 418
    invoke-static {p0, v9}, Lxe/l;->l(Lud/r;Lud/p;)V

    .line 419
    .line 420
    .line 421
    iget-object p0, v7, Lud/a;->l:Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Ltd/b;->Z()V

    .line 427
    .line 428
    .line 429
    iget-object p0, v7, Lud/a;->l:Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    invoke-static {v6, v7}, Lke/g;->u0(Ljava/util/List;Lud/a;)V

    .line 435
    .line 436
    .line 437
    return v5

    .line 438
    :cond_14
    invoke-virtual {p0}, Lud/r;->Z()Z

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    if-nez p0, :cond_17

    .line 443
    .line 444
    iget-object p0, v8, Lud/p;->k:Lpd/k;

    .line 445
    .line 446
    sget-object v3, Lpd/k;->p:Lpd/k;

    .line 447
    .line 448
    if-ne p0, v3, :cond_17

    .line 449
    .line 450
    iget-object p0, v9, Lud/p;->k:Lpd/k;

    .line 451
    .line 452
    if-ne p0, v3, :cond_17

    .line 453
    .line 454
    invoke-virtual {v8, v1}, Lud/p;->S(I)Lqd/l;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-virtual {v9, v1}, Lud/p;->S(I)Lqd/l;

    .line 459
    .line 460
    .line 461
    move-result-object v10

    .line 462
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    instance-of v11, p0, Lqd/n;

    .line 466
    .line 467
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    instance-of v12, v10, Lqd/n;

    .line 471
    .line 472
    if-eq v11, v12, :cond_15

    .line 473
    .line 474
    goto :goto_3

    .line 475
    :cond_15
    iget-object v11, p1, Lxd/a;->i:Lud/n;

    .line 476
    .line 477
    invoke-interface {v11, p1, v7}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    if-nez v11, :cond_16

    .line 482
    .line 483
    goto :goto_3

    .line 484
    :cond_16
    invoke-static {v0, v8}, Lxe/k;->b(Lud/a;Lud/p;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v2, v9}, Lxe/k;->b(Lud/a;Lud/p;)V

    .line 488
    .line 489
    .line 490
    sget-object v1, Lmd/a;->n:Lmd/a;

    .line 491
    .line 492
    invoke-virtual {v0, v1}, Lmd/e;->D(Lmd/a;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v1}, Lmd/e;->D(Lmd/a;)V

    .line 496
    .line 497
    .line 498
    new-instance v0, Ltd/b;

    .line 499
    .line 500
    iget-object p1, p1, Lyd/a;->k:Lyd/b;

    .line 501
    .line 502
    invoke-direct {v0, p1, v4, p0, v10}, Ltd/b;-><init>(Lyd/b;Lqd/r;Lqd/l;Lqd/l;)V

    .line 503
    .line 504
    .line 505
    new-instance p1, Lud/p;

    .line 506
    .line 507
    invoke-direct {p1, v3, v5}, Lud/p;-><init>(Lpd/k;I)V

    .line 508
    .line 509
    .line 510
    invoke-static {v0}, Lqd/l;->a0(Lud/p;)Lqd/l;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {p0}, Lqd/l;->I()Lqd/j;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    invoke-virtual {v0, p0}, Lqd/l;->W(Lqd/j;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p1, v0}, Lud/p;->I(Lqd/l;)V

    .line 522
    .line 523
    .line 524
    iget-object p0, v7, Lud/a;->l:Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 527
    .line 528
    .line 529
    invoke-virtual {p1}, Lud/p;->Z()V

    .line 530
    .line 531
    .line 532
    iget-object p0, v7, Lud/a;->l:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    invoke-virtual {v7, v1}, Lmd/e;->w(Lmd/a;)V

    .line 538
    .line 539
    .line 540
    invoke-static {v6, v7}, Lke/g;->u0(Ljava/util/List;Lud/a;)V

    .line 541
    .line 542
    .line 543
    return v5

    .line 544
    :cond_17
    :goto_3
    return v1
.end method

.method public static y0(Lud/r;Lud/p;Lud/p;)Z
    .locals 3

    .line 1
    sget-object v0, Lmd/a;->d0:Lmd/a;

    .line 2
    .line 3
    iget-object p0, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p0, :cond_9

    .line 11
    .line 12
    iget p0, p1, Lnd/r;->i:I

    .line 13
    .line 14
    iget v1, p2, Lnd/r;->i:I

    .line 15
    .line 16
    if-eq p0, v1, :cond_9

    .line 17
    .line 18
    if-eqz p0, :cond_7

    .line 19
    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    iget-object p0, p1, Lud/p;->l:Lqd/r;

    .line 23
    .line 24
    if-eqz p0, :cond_8

    .line 25
    .line 26
    iget-object p1, p2, Lud/p;->l:Lqd/r;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    iget-object p0, p0, Lqd/r;->m:Lqd/s;

    .line 33
    .line 34
    invoke-virtual {p0}, Lqd/s;->f()Lpd/q;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p1, p2, Lud/p;->l:Lqd/r;

    .line 39
    .line 40
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 41
    .line 42
    invoke-virtual {p1}, Lqd/s;->f()Lpd/q;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_8

    .line 47
    .line 48
    if-eq p0, p1, :cond_1

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 53
    .line 54
    iget-object p2, p0, Lud/p;->m:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lud/p;->m:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Lqd/l;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    instance-of v1, p2, Lqd/r;

    .line 85
    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    check-cast p2, Lqd/r;

    .line 90
    .line 91
    invoke-virtual {p2}, Lqd/r;->f0()Lud/p;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-nez p2, :cond_4

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    iget p2, p2, Lnd/r;->i:I

    .line 99
    .line 100
    if-eqz p2, :cond_2

    .line 101
    .line 102
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Lke/m;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2, v1, v2}, Ljava/util/HashMap;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/util/Map$Entry;

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    const/4 p2, 0x2

    .line 150
    if-lt p1, p2, :cond_6

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    invoke-static {p1}, Lke/g;->v0(Lud/p;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_8

    .line 158
    .line 159
    invoke-static {p2}, Lke/g;->v0(Lud/p;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-nez p0, :cond_8

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_8
    :goto_1
    const/4 p0, 0x0

    .line 167
    return p0

    .line 168
    :cond_9
    :goto_2
    return v0
.end method


# virtual methods
.method public a(Lud/r;Lud/n;)Z
    .locals 6

    .line 1
    iget v0, p0, Lke/g;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lr9/e0;->a(Lud/r;Lud/n;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    instance-of v0, p2, Lyd/c;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_10

    .line 15
    .line 16
    check-cast p2, Lyd/c;

    .line 17
    .line 18
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 19
    .line 20
    invoke-static {v0}, Lf8/i;->n0(Lud/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 30
    .line 31
    invoke-static {v0}, Lf8/i;->n0(Lud/j;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    sget-object v0, Lmd/a;->d0:Lmd/a;

    .line 43
    .line 44
    iget-object v3, p1, Lmd/e;->g:Lmd/f;

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 53
    .line 54
    invoke-static {v0}, Lf8/i;->C(Lud/j;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v3, p2, Lyd/c;->n:Lud/j;

    .line 59
    .line 60
    invoke-static {v3}, Lf8/i;->C(Lud/j;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    if-le v0, v3, :cond_e

    .line 69
    .line 70
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_2
    iget-object v0, p2, Lyd/a;->k:Lyd/b;

    .line 76
    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-static {v0}, Lyd/b;->O(Lyd/b;)Lyd/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v3, p2, Lyd/a;->k:Lyd/b;

    .line 85
    .line 86
    if-eq v0, v3, :cond_4

    .line 87
    .line 88
    iput-object v0, p2, Lyd/a;->k:Lyd/b;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    iget v0, v0, Lyd/b;->i:I

    .line 93
    .line 94
    const/4 v3, 0x3

    .line 95
    if-ne v0, v3, :cond_4

    .line 96
    .line 97
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_0
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 101
    .line 102
    invoke-static {v0}, Lf8/i;->R(Lud/j;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v3, p2, Lyd/c;->n:Lud/j;

    .line 107
    .line 108
    invoke-static {v3}, Lf8/i;->R(Lud/j;)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    iget-object v4, p2, Lyd/c;->n:Lud/j;

    .line 113
    .line 114
    invoke-static {p1, v4}, Lke/c;->n(Lud/r;Lud/j;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_8

    .line 119
    .line 120
    iget-object v4, p2, Lyd/c;->m:Lud/j;

    .line 121
    .line 122
    invoke-static {p1, v4}, Lke/c;->n(Lud/r;Lud/j;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_5

    .line 127
    .line 128
    if-ge v3, v0, :cond_5

    .line 129
    .line 130
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_5
    if-ne v3, v1, :cond_8

    .line 136
    .line 137
    invoke-static {p2}, Lf8/i;->M(Lud/j;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    invoke-virtual {p1}, Lud/r;->Z()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_6

    .line 148
    .line 149
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 150
    .line 151
    invoke-static {v0}, Lf8/i;->E(Lud/j;)Lud/p;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v3, Lpd/k;->r:Lpd/k;

    .line 156
    .line 157
    invoke-static {v0, v3}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_e

    .line 162
    .line 163
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    const/4 v5, 0x2

    .line 168
    if-le v0, v5, :cond_8

    .line 169
    .line 170
    if-eqz v4, :cond_7

    .line 171
    .line 172
    const/4 v4, 0x4

    .line 173
    if-lt v0, v4, :cond_8

    .line 174
    .line 175
    :cond_7
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_8
    iget-object v4, p2, Lyd/c;->m:Lud/j;

    .line 180
    .line 181
    if-nez v4, :cond_9

    .line 182
    .line 183
    move v4, v2

    .line 184
    goto :goto_1

    .line 185
    :cond_9
    invoke-static {v4, v4}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    :goto_1
    iget-object v5, p2, Lyd/c;->n:Lud/j;

    .line 190
    .line 191
    if-nez v5, :cond_a

    .line 192
    .line 193
    move v5, v2

    .line 194
    goto :goto_2

    .line 195
    :cond_a
    invoke-static {v5, v5}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    :goto_2
    if-eqz v5, :cond_c

    .line 200
    .line 201
    if-eqz v4, :cond_b

    .line 202
    .line 203
    if-ge v3, v0, :cond_c

    .line 204
    .line 205
    :cond_b
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_c
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 210
    .line 211
    invoke-static {v0}, Lke/c;->m(Lud/j;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_d

    .line 216
    .line 217
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 218
    .line 219
    invoke-static {v0}, Lke/c;->m(Lud/j;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_d

    .line 224
    .line 225
    if-nez v4, :cond_d

    .line 226
    .line 227
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_d
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 232
    .line 233
    invoke-static {v0}, Lf8/i;->K(Lud/j;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_e

    .line 238
    .line 239
    invoke-static {p2}, Lke/c;->l(Lyd/c;)V

    .line 240
    .line 241
    .line 242
    :cond_e
    :goto_3
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 243
    .line 244
    invoke-static {p1, v0}, Lke/c;->n(Lud/r;Lud/j;)Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    if-eqz p1, :cond_f

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_f
    iget-object p1, p2, Lyd/c;->n:Lud/j;

    .line 252
    .line 253
    instance-of p2, p1, Lxd/b;

    .line 254
    .line 255
    if-eqz p2, :cond_10

    .line 256
    .line 257
    move-object p2, p1

    .line 258
    check-cast p2, Lxd/b;

    .line 259
    .line 260
    iget-object p2, p2, Lxd/b;->k:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-ne v0, v1, :cond_10

    .line 267
    .line 268
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    instance-of v0, v0, Lyd/c;

    .line 273
    .line 274
    if-eqz v0, :cond_10

    .line 275
    .line 276
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    check-cast p2, Lud/j;

    .line 281
    .line 282
    check-cast p2, Lmd/e;

    .line 283
    .line 284
    sget-object v0, Lmd/a;->R:Lmd/a;

    .line 285
    .line 286
    invoke-virtual {p2, v0}, Lmd/e;->w(Lmd/a;)V

    .line 287
    .line 288
    .line 289
    check-cast p1, Lmd/e;

    .line 290
    .line 291
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 292
    .line 293
    .line 294
    :cond_10
    :goto_4
    return v1

    .line 295
    :pswitch_1
    instance-of p1, p2, Lxd/b;

    .line 296
    .line 297
    if-eqz p1, :cond_11

    .line 298
    .line 299
    check-cast p2, Lxd/b;

    .line 300
    .line 301
    iget-object p1, p2, Lxd/b;->k:Ljava/util/ArrayList;

    .line 302
    .line 303
    new-instance p2, Lce/n;

    .line 304
    .line 305
    const/16 v0, 0xa

    .line 306
    .line 307
    invoke-direct {p2, v0}, Lce/n;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 311
    .line 312
    .line 313
    :cond_11
    const/4 p1, 0x1

    .line 314
    return p1

    .line 315
    :pswitch_2
    instance-of v0, p2, Lzd/c;

    .line 316
    .line 317
    const/4 v1, 0x1

    .line 318
    if-eqz v0, :cond_12

    .line 319
    .line 320
    check-cast p2, Lzd/c;

    .line 321
    .line 322
    iget-object p2, p2, Lzd/c;->o:Lud/a;

    .line 323
    .line 324
    if-eqz p2, :cond_12

    .line 325
    .line 326
    iget-object v0, p2, Lud/a;->l:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eq v0, v1, :cond_12

    .line 333
    .line 334
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    const-string v0, "Incorrect condition in loop: "

    .line 339
    .line 340
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    invoke-virtual {p1, p2}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    :cond_12
    return v1

    .line 348
    :pswitch_3
    invoke-static {p1, p2}, Lke/g;->x0(Lud/r;Lud/n;)Z

    .line 349
    .line 350
    .line 351
    move-result p2

    .line 352
    if-eqz p2, :cond_13

    .line 353
    .line 354
    sget-object p2, Lmd/a;->b0:Lmd/a;

    .line 355
    .line 356
    invoke-virtual {p1, p2}, Lmd/e;->w(Lmd/a;)V

    .line 357
    .line 358
    .line 359
    :cond_13
    const/4 p1, 0x1

    .line 360
    return p1

    .line 361
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lud/r;Lud/n;)V
    .locals 6

    .line 1
    iget v0, p0, Lke/g;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    instance-of v0, p2, Lzd/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p2, Lzd/c;

    .line 12
    .line 13
    iget-object p1, p2, Lzd/c;->p:Lud/a;

    .line 14
    .line 15
    if-eqz p1, :cond_6

    .line 16
    .line 17
    iget-object v0, p2, Lzd/c;->o:Lud/a;

    .line 18
    .line 19
    if-eqz v0, :cond_6

    .line 20
    .line 21
    iget-object v0, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, p2, Lzd/c;->p:Lud/a;

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_0
    instance-of v0, p2, Lxd/d;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    check-cast p2, Lxd/d;

    .line 47
    .line 48
    iget-object v0, p2, Lxd/d;->l:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lxd/c;

    .line 65
    .line 66
    iget-object v1, v1, Lxd/c;->b:Lud/j;

    .line 67
    .line 68
    new-instance v2, Lze/c;

    .line 69
    .line 70
    invoke-direct {v2, p1}, Lze/c;-><init>(Lud/r;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Lae/g;

    .line 74
    .line 75
    const/4 v4, 0x6

    .line 76
    invoke-direct {v3, v2, v4}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lke/a;

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    invoke-direct {v4, v3, v5}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v4, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 86
    .line 87
    .line 88
    new-instance v3, Lle/e;

    .line 89
    .line 90
    invoke-direct {v3, v1, v2, p2}, Lle/e;-><init>(Lud/j;Lze/c;Lxd/d;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v3, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    instance-of p1, p2, Lxd/b;

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    check-cast p2, Lxd/b;

    .line 102
    .line 103
    iget-object p1, p2, Lxd/b;->k:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    add-int/lit8 v0, v0, -0x1

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lud/j;

    .line 123
    .line 124
    move-object v0, p1

    .line 125
    check-cast v0, Lmd/e;

    .line 126
    .line 127
    iget-object v0, v0, Lmd/e;->g:Lmd/f;

    .line 128
    .line 129
    sget-object v1, Lmd/b;->A:Lmd/b;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_3

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    const/4 v1, 0x0

    .line 143
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lnd/f;

    .line 148
    .line 149
    iget-object v1, v0, Lnd/f;->g:Lud/a;

    .line 150
    .line 151
    iget-object v0, v0, Lnd/f;->i:Lud/p;

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_4

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    instance-of v1, p1, Lud/a;

    .line 161
    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    check-cast p1, Lud/a;

    .line 165
    .line 166
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance v0, Lud/o;

    .line 183
    .line 184
    invoke-direct {v0, p1}, Lud/o;-><init>(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, v0}, Lxd/b;->H(Lud/j;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_1
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lud/r;Lud/n;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lke/g;->x0(Lud/r;Lud/n;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lbe/b;->Y(Lud/r;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method
