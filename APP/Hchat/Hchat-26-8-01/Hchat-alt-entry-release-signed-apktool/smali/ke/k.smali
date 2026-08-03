.class public final Lke/k;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Ljava/util/HashSet;

.field public final k:Ljava/util/HashSet;

.field public l:Lxd/d;

.field public m:Z

.field public final synthetic n:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lke/k;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lke/k;->j:Ljava/util/HashSet;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lke/k;->k:Ljava/util/HashSet;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lke/k;->m:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lud/r;Lud/n;)Z
    .locals 11

    .line 1
    iget v0, p0, Lke/k;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lud/j;

    .line 15
    .line 16
    instance-of v1, v0, Lud/h;

    .line 17
    .line 18
    if-eqz v1, :cond_d

    .line 19
    .line 20
    check-cast v0, Lud/h;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lke/k;->t0(Lud/h;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_d

    .line 27
    .line 28
    invoke-interface {v0}, Lud/h;->g()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x1

    .line 37
    if-le v1, v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v0}, Lud/h;->g()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 v1, v1, -0x2

    .line 48
    .line 49
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lud/p;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-le v1, v2, :cond_1

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/lit8 v1, v1, -0x2

    .line 67
    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lud/j;

    .line 73
    .line 74
    instance-of v1, p1, Lud/h;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    check-cast p1, Lud/h;

    .line 79
    .line 80
    invoke-interface {p1}, Lud/h;->g()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lud/p;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/4 p1, 0x0

    .line 92
    :goto_0
    if-eqz p1, :cond_d

    .line 93
    .line 94
    iget-object p1, p1, Lud/p;->k:Lpd/k;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/16 v1, 0x9

    .line 101
    .line 102
    if-eq p1, v1, :cond_2

    .line 103
    .line 104
    const/16 v1, 0xb

    .line 105
    .line 106
    if-eq p1, v1, :cond_2

    .line 107
    .line 108
    const/16 v1, 0x27

    .line 109
    .line 110
    if-eq p1, v1, :cond_2

    .line 111
    .line 112
    const/16 v1, 0x28

    .line 113
    .line 114
    if-eq p1, v1, :cond_2

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_2
    invoke-virtual {p0, v0, p2}, Lke/k;->u0(Lud/h;Lud/j;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_5

    .line 122
    .line 123
    :pswitch_0
    instance-of v0, p2, Lud/i;

    .line 124
    .line 125
    if-eqz v0, :cond_d

    .line 126
    .line 127
    instance-of v0, p2, Lxd/d;

    .line 128
    .line 129
    if-nez v0, :cond_d

    .line 130
    .line 131
    move-object v0, p2

    .line 132
    check-cast v0, Lxd/a;

    .line 133
    .line 134
    iget-object v0, v0, Lxd/a;->i:Lud/n;

    .line 135
    .line 136
    move-object v1, v0

    .line 137
    check-cast v1, Lmd/e;

    .line 138
    .line 139
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 140
    .line 141
    sget-object v2, Lmd/a;->U:Lmd/a;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_3

    .line 148
    .line 149
    goto/16 :goto_5

    .line 150
    .line 151
    :cond_3
    invoke-static {v0}, Lf8/i;->D(Lud/j;)Lud/h;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1}, La/a;->A(Lud/h;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/4 v3, 0x1

    .line 160
    const/4 v4, 0x0

    .line 161
    if-eqz v2, :cond_4

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Lke/k;->t0(Lud/h;)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_d

    .line 168
    .line 169
    move v2, v3

    .line 170
    goto :goto_1

    .line 171
    :cond_4
    move v2, v4

    .line 172
    :goto_1
    check-cast p2, Lud/i;

    .line 173
    .line 174
    invoke-interface {p2}, Lud/i;->i()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-instance v5, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    move v6, v3

    .line 188
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_9

    .line 193
    .line 194
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    check-cast v7, Lud/j;

    .line 199
    .line 200
    if-nez v7, :cond_6

    .line 201
    .line 202
    :goto_3
    move v6, v4

    .line 203
    goto :goto_2

    .line 204
    :cond_6
    invoke-static {v7}, Lf8/i;->F(Lud/j;)Lxe/b;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    if-nez v8, :cond_7

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_7
    iget-object v9, v8, Lxe/b;->b:Lud/p;

    .line 212
    .line 213
    iget-object v9, v9, Lud/p;->k:Lpd/k;

    .line 214
    .line 215
    sget-object v10, Lpd/k;->T:Lpd/k;

    .line 216
    .line 217
    if-ne v9, v10, :cond_8

    .line 218
    .line 219
    iget-object v6, v8, Lxe/b;->a:Lud/h;

    .line 220
    .line 221
    invoke-static {v6, v7}, Lf8/i;->z(Lud/h;Lud/j;)Lud/j;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    new-instance v8, Lxe/c;

    .line 226
    .line 227
    invoke-direct {v8, v6, v7}, Lxe/c;-><init>(Lud/h;Lud/j;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_8
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    const/16 v8, 0x9

    .line 239
    .line 240
    if-eq v7, v8, :cond_5

    .line 241
    .line 242
    const/16 v8, 0xb

    .line 243
    .line 244
    if-eq v7, v8, :cond_5

    .line 245
    .line 246
    const/16 v8, 0x27

    .line 247
    .line 248
    if-eq v7, v8, :cond_5

    .line 249
    .line 250
    const/16 v8, 0x28

    .line 251
    .line 252
    if-eq v7, v8, :cond_5

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    if-nez p2, :cond_c

    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_a

    .line 270
    .line 271
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, Lxe/c;

    .line 276
    .line 277
    iget-object v5, v4, Lxe/c;->b:Lud/h;

    .line 278
    .line 279
    iget-object v4, v4, Lxe/c;->a:Lud/j;

    .line 280
    .line 281
    invoke-virtual {p0, v5, v4}, Lke/k;->u0(Lud/h;Lud/j;)V

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_a
    if-nez v2, :cond_b

    .line 286
    .line 287
    iget-object p2, p0, Lke/k;->j:Ljava/util/HashSet;

    .line 288
    .line 289
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    iput-boolean v3, p0, Lke/k;->m:Z

    .line 293
    .line 294
    :cond_b
    sget-object p2, Lmd/a;->a0:Lmd/a;

    .line 295
    .line 296
    invoke-virtual {p1, p2}, Lmd/e;->w(Lmd/a;)V

    .line 297
    .line 298
    .line 299
    :cond_c
    if-eqz v6, :cond_d

    .line 300
    .line 301
    if-eqz v1, :cond_d

    .line 302
    .line 303
    invoke-virtual {p0, v1, v0}, Lke/k;->u0(Lud/h;Lud/j;)V

    .line 304
    .line 305
    .line 306
    :cond_d
    :goto_5
    const/4 p1, 0x1

    .line 307
    return p1

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lud/r;Lud/n;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lke/k;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lke/k;->l:Lxd/d;

    .line 17
    .line 18
    new-instance v1, Lud/p;

    .line 19
    .line 20
    sget-object v2, Lpd/k;->T:Lpd/k;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, v2, v3}, Lud/p;-><init>(Lpd/k;I)V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lmd/a;->m:Lmd/a;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lmd/e;->w(Lmd/a;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lnd/e0;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lnd/e0;-><init>(Lxd/d;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lmd/e;->y(Loc/b;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lud/o;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lud/o;-><init>(Lud/p;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lke/k;->k:Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, Lce/n;

    .line 63
    .line 64
    const/16 v0, 0xc

    .line 65
    .line 66
    invoke-direct {p2, v0}, Lce/n;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final t0(Lud/h;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lud/h;->g()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lud/p;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lud/p;->k:Lpd/k;

    .line 16
    .line 17
    sget-object v1, Lpd/k;->T:Lpd/k;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget-object v0, Lmd/b;->K:Lmd/b;

    .line 22
    .line 23
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lnd/e0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p1, Lnd/e0;->g:Lud/n;

    .line 34
    .line 35
    iget-object v0, p0, Lke/k;->l:Lxd/d;

    .line 36
    .line 37
    if-ne p1, v0, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final u0(Lud/h;Lud/j;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lud/h;->g()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lud/p;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lud/p;->k:Lpd/k;

    .line 14
    .line 15
    sget-object v2, Lpd/k;->T:Lpd/k;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lbe/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v0, Lmd/a;->u:Lmd/a;

    .line 29
    .line 30
    check-cast p1, Lmd/e;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lke/k;->k:Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method
