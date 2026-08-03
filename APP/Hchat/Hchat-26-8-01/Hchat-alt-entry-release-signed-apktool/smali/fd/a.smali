.class public final Lfd/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/e;

.field public final b:Lfd/a;

.field public final c:Lb/e;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:I

.field public final h:Ljava/util/HashSet;

.field public i:I

.field public j:Z

.field public k:Lfd/h;


# direct methods
.method public constructor <init>(Lud/e;Lbc/g;)V
    .locals 7

    .line 33
    iget-boolean v3, p2, Lbc/g;->p:Z

    .line 34
    iget-object v0, p2, Lbc/g;->E:Lbc/b;

    sget-object v1, Lbc/b;->i:Lbc/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 35
    :goto_1
    iget-boolean v5, p2, Lbc/g;->o:Z

    .line 36
    iget v6, p2, Lbc/g;->V:I

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 37
    invoke-direct/range {v0 .. v6}, Lfd/a;-><init>(Lud/e;Lfd/a;ZZZI)V

    return-void
.end method

.method public constructor <init>(Lud/e;Lfd/a;)V
    .locals 7

    .line 32
    iget-boolean v3, p2, Lfd/a;->e:Z

    iget-boolean v4, p2, Lfd/a;->d:Z

    iget-boolean v5, p2, Lfd/a;->f:Z

    iget v6, p2, Lfd/a;->g:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lfd/a;-><init>(Lud/e;Lfd/a;ZZZI)V

    return-void
.end method

.method public constructor <init>(Lud/e;Lfd/a;ZZZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfd/a;->h:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Lfd/a;->a:Lud/e;

    .line 12
    .line 13
    iput-object p2, p0, Lfd/a;->b:Lfd/a;

    .line 14
    .line 15
    iput-boolean p4, p0, Lfd/a;->d:Z

    .line 16
    .line 17
    iput-boolean p3, p0, Lfd/a;->e:Z

    .line 18
    .line 19
    iput-boolean p5, p0, Lfd/a;->f:Z

    .line 20
    .line 21
    iput p6, p0, Lfd/a;->g:I

    .line 22
    .line 23
    new-instance p2, Lb/e;

    .line 24
    .line 25
    const/4 p3, 0x5

    .line 26
    invoke-direct {p2, p1, p3, p0}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lfd/a;->c:Lb/e;

    .line 30
    .line 31
    return-void
.end method

.method public static k(Lud/u;Lod/a;Lod/a;)Z
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lod/a;->k()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lud/u;->f(Lod/a;)Lud/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget-object v1, v1, Lud/e;->v:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lud/e;

    .line 44
    .line 45
    iget-object v4, v3, Lud/e;->m:Lod/a;

    .line 46
    .line 47
    invoke-virtual {v4}, Lod/a;->k()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 58
    .line 59
    invoke-virtual {v3}, Lod/a;->f()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {p2}, Lod/a;->f()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    return v2

    .line 74
    :cond_3
    iget-object p1, p1, Lod/a;->k:Lod/a;

    .line 75
    .line 76
    invoke-static {p0, p1, p2}, Lfd/a;->k(Lud/u;Lod/a;Lod/a;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public static m(Lod/a;Lod/a;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lod/a;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object p0, p0, Lod/a;->k:Lod/a;

    .line 9
    .line 10
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {p0, p1}, Lfd/a;->m(Lod/a;Lod/a;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_2
    return v1
.end method


# virtual methods
.method public final a(Lfc/f;Z)V
    .locals 11

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object p2, Lbc/a;->k:Lbc/a;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lnd/b0;->N(Lbc/a;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object p2, v0, Lud/e;->m:Lod/a;

    .line 19
    .line 20
    iget-object p2, p2, Lod/a;->j:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, " // from class: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 37
    .line 38
    .line 39
    :cond_0
    const/4 p2, 0x1

    .line 40
    iput-boolean p2, p0, Lfd/a;->j:Z

    .line 41
    .line 42
    iget-object v1, p1, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, p0, Lfd/a;->i:I

    .line 49
    .line 50
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 51
    .line 52
    .line 53
    sget-object v1, Lmd/b;->e:Lmd/b;

    .line 54
    .line 55
    iget-object v2, v0, Lmd/e;->g:Lmd/f;

    .line 56
    .line 57
    invoke-virtual {v2, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lnd/h;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_1
    iget-object v3, v1, Lnd/h;->g:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/4 v5, 0x0

    .line 75
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_7

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lnd/g;

    .line 86
    .line 87
    iget-object v7, v6, Lnd/g;->a:Lud/g;

    .line 88
    .line 89
    invoke-static {p1, v7}, Ljd/c;->b(Lfc/f;Lnd/b0;)V

    .line 90
    .line 91
    .line 92
    iget-object v7, v6, Lnd/g;->a:Lud/g;

    .line 93
    .line 94
    iget-object v7, v7, Lud/g;->l:Lod/c;

    .line 95
    .line 96
    iget-object v7, v7, Lod/c;->j:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p1, v7}, Lfc/f;->r(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v7, v6, Lnd/g;->b:Ltd/a;

    .line 102
    .line 103
    iget-object v8, v0, Lud/e;->k:Lud/u;

    .line 104
    .line 105
    iget-object v9, v7, Ltd/a;->o:Lod/d;

    .line 106
    .line 107
    invoke-virtual {v8, v9}, Lud/u;->i(Lod/d;)Lud/r;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    if-eqz v8, :cond_3

    .line 112
    .line 113
    sget-object v9, Lmd/b;->q:Lmd/b;

    .line 114
    .line 115
    iget-object v10, v8, Lmd/e;->g:Lmd/f;

    .line 116
    .line 117
    invoke-virtual {v10, v9}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    check-cast v9, Lnd/g0;

    .line 122
    .line 123
    if-eqz v9, :cond_3

    .line 124
    .line 125
    iget-object v9, v9, Lnd/g0;->g:Ljava/util/BitSet;

    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/util/BitSet;->cardinality()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    goto :goto_1

    .line 132
    :cond_3
    move v9, v2

    .line 133
    :goto_1
    iget-object v10, v7, Lud/p;->m:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-le v10, v9, :cond_5

    .line 140
    .line 141
    if-nez v5, :cond_4

    .line 142
    .line 143
    iget-object v5, v1, Lnd/h;->h:Lud/r;

    .line 144
    .line 145
    new-instance v9, Lfd/g;

    .line 146
    .line 147
    invoke-direct {v9, p0, v5}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 148
    .line 149
    .line 150
    new-instance v5, Lfd/e;

    .line 151
    .line 152
    invoke-direct {v5, v9, v2}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {v5, p1, v7, v2, v8}, Lfd/e;->f(Lfc/f;Lpd/b;ILud/r;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    iget-object v7, v6, Lnd/g;->c:Lud/e;

    .line 159
    .line 160
    if-eqz v7, :cond_6

    .line 161
    .line 162
    const/16 v7, 0x20

    .line 163
    .line 164
    invoke-virtual {p1, v7}, Lfc/f;->d(C)Lfc/f;

    .line 165
    .line 166
    .line 167
    new-instance v7, Lfd/a;

    .line 168
    .line 169
    iget-object v6, v6, Lnd/g;->c:Lud/e;

    .line 170
    .line 171
    invoke-direct {v7, v6, p0}, Lfd/a;-><init>(Lud/e;Lfd/a;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, p1, p2}, Lfd/a;->a(Lfc/f;Z)V

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_2

    .line 182
    .line 183
    const/16 v6, 0x2c

    .line 184
    .line 185
    invoke-virtual {p1, v6}, Lfc/f;->d(C)Lfc/f;

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_7
    iget-object v1, v0, Lud/e;->t:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_9

    .line 200
    .line 201
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Lud/r;

    .line 206
    .line 207
    sget-object v5, Lmd/a;->s:Lmd/a;

    .line 208
    .line 209
    iget-object v4, v4, Lmd/e;->g:Lmd/f;

    .line 210
    .line 211
    invoke-virtual {v4, v5}, Lmd/f;->a(Lmd/a;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_8

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_9
    invoke-virtual {p0}, Lfd/a;->n()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_b

    .line 223
    .line 224
    iget-object v1, v0, Lud/e;->v:Ljava/util/List;

    .line 225
    .line 226
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_d

    .line 235
    .line 236
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Lud/e;

    .line 241
    .line 242
    sget-object v5, Lmd/b;->h:Lmd/b;

    .line 243
    .line 244
    iget-object v4, v4, Lmd/e;->g:Lmd/f;

    .line 245
    .line 246
    invoke-virtual {v4, v5}, Lmd/f;->b(Loc/a;)Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-nez v4, :cond_a

    .line 251
    .line 252
    :cond_b
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_c

    .line 257
    .line 258
    invoke-virtual {p1}, Lfc/f;->p()V

    .line 259
    .line 260
    .line 261
    :cond_c
    const/16 v1, 0x3b

    .line 262
    .line 263
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Lfd/a;->n()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_d

    .line 271
    .line 272
    invoke-virtual {p1}, Lfc/f;->f()V

    .line 273
    .line 274
    .line 275
    :cond_d
    :goto_3
    iget-object v1, v0, Lud/e;->u:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_e

    .line 286
    .line 287
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    check-cast v3, Lud/g;

    .line 292
    .line 293
    invoke-virtual {p0, p1, v3}, Lfd/a;->c(Lfc/f;Lud/g;)V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_e
    iget-object v1, v0, Lud/e;->v:Ljava/util/List;

    .line 298
    .line 299
    iget-object v0, v0, Lud/e;->t:Ljava/util/List;

    .line 300
    .line 301
    const/4 v3, 0x2

    .line 302
    new-array v3, v3, [Ljava/util/List;

    .line 303
    .line 304
    aput-object v1, v3, v2

    .line 305
    .line 306
    aput-object v0, v3, p2

    .line 307
    .line 308
    invoke-static {v3}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    new-instance v0, Lae/d;

    .line 313
    .line 314
    const/4 v1, 0x4

    .line 315
    invoke-direct {v0, v1}, Lae/d;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->flatMap(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    new-instance v0, Lbe/i;

    .line 323
    .line 324
    const/16 v1, 0xd

    .line 325
    .line 326
    invoke-direct {v0, p0, v1}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    new-instance v0, Lae/a;

    .line 334
    .line 335
    const/16 v1, 0x9

    .line 336
    .line 337
    invoke-direct {v0, v1}, Lae/a;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-static {v0}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava/util/stream/Stream;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    new-instance v0, Lbe/w;

    .line 349
    .line 350
    invoke-direct {v0, p0, v1, p1}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {p2, v0}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Lfc/f;->q()V

    .line 360
    .line 361
    .line 362
    sget-object p2, Lic/c;->g:Lic/c;

    .line 363
    .line 364
    invoke-virtual {p1, p2}, Lfc/f;->j(Lhc/a;)V

    .line 365
    .line 366
    .line 367
    return-void
.end method

.method public final b(Lfc/f;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 2
    .line 3
    iget-object v1, v0, Lud/e;->o:Lb5/k;

    .line 4
    .line 5
    iget-object v2, v0, Lud/e;->m:Lod/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lb5/k;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/16 v4, 0x400

    .line 12
    .line 13
    const/16 v5, 0x8

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Lb5/k;->m(I)Lb5/k;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v5}, Lb5/k;->m(I)Lb5/k;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1}, Lb5/k;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x10

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Lb5/k;->m(I)Lb5/k;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, v4}, Lb5/k;->m(I)Lb5/k;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, v5}, Lb5/k;->m(I)Lb5/k;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lod/a;->o()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Lb5/k;->m(I)Lb5/k;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x2

    .line 57
    invoke-virtual {v1, v3}, Lb5/k;->m(I)Lb5/k;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_2
    iget v3, v1, Lb5/k;->b:I

    .line 62
    .line 63
    invoke-static {p1, v0}, Ljd/c;->b(Lfc/f;Lnd/b0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lod/a;->n()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    iget-object v4, v2, Lod/a;->g:Lqd/j;

    .line 73
    .line 74
    invoke-virtual {v4}, Lqd/j;->l()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {p1, v0, v4}, Ljd/c;->f(Lfc/f;Lnd/b0;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    invoke-static {p1, v0}, Ljd/c;->d(Lfc/f;Lnd/b0;)V

    .line 82
    .line 83
    .line 84
    sget-object v4, Lbc/a;->k:Lbc/a;

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Lnd/b0;->N(Lbc/a;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    sget-object v5, Loc/c;->c:Loc/c;

    .line 94
    .line 95
    iget-object v6, v0, Lmd/e;->g:Lmd/f;

    .line 96
    .line 97
    invoke-virtual {v6, v5}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lpc/k;

    .line 102
    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    iget-object v5, v5, Lpc/k;->g:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0}, Lud/e;->a0()Lud/e;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v6, v6, Lud/e;->m:Lod/a;

    .line 112
    .line 113
    iget-object v6, v6, Lod/a;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    const-string v6, "compiled from: "

    .line 123
    .line 124
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-static {p1, v5}, Ljd/c;->e(Lfc/f;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    :goto_1
    invoke-virtual {v0, v4}, Lnd/b0;->N(Lbc/a;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_8

    .line 136
    .line 137
    iget-object v5, v0, Lud/e;->l:Ljf/b;

    .line 138
    .line 139
    if-eqz v5, :cond_8

    .line 140
    .line 141
    iget-object v5, v5, Ljf/b;->a:Lac/k;

    .line 142
    .line 143
    iget-object v5, v5, Lac/k;->j:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, Lff/e;

    .line 146
    .line 147
    iget-object v5, v5, Lff/e;->b:Ljava/lang/String;

    .line 148
    .line 149
    if-eqz v5, :cond_8

    .line 150
    .line 151
    invoke-virtual {v0}, Lud/e;->P()Lud/e;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    if-eqz v6, :cond_7

    .line 156
    .line 157
    iget-object v6, v6, Lud/e;->l:Ljf/b;

    .line 158
    .line 159
    if-eqz v6, :cond_7

    .line 160
    .line 161
    iget-object v6, v6, Ljf/b;->a:Lac/k;

    .line 162
    .line 163
    iget-object v6, v6, Lac/k;->j:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Lff/e;

    .line 166
    .line 167
    iget-object v6, v6, Lff/e;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_7

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    const-string v6, "loaded from: "

    .line 177
    .line 178
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-static {p1, v5}, Ljd/c;->e(Lfc/f;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    :goto_2
    iget-object v5, p0, Lfd/a;->c:Lb/e;

    .line 186
    .line 187
    iget-object v6, v5, Lb/e;->h:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v6, Lud/e;

    .line 190
    .line 191
    invoke-virtual {v5, v6, p1}, Lb/e;->i(Lmd/i;Lfc/f;)V

    .line 192
    .line 193
    .line 194
    iget v5, v0, Lnd/r;->i:I

    .line 195
    .line 196
    invoke-virtual {p1, v5}, Lfc/f;->s(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v4}, Lnd/b0;->N(Lbc/a;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {v1, v4}, Lb5/k;->j(Z)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lb5/k;->d()Z

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-eqz v4, :cond_a

    .line 215
    .line 216
    and-int/lit16 v1, v3, 0x2000

    .line 217
    .line 218
    if-eqz v1, :cond_9

    .line 219
    .line 220
    const/16 v1, 0x40

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 223
    .line 224
    .line 225
    :cond_9
    const-string v1, "interface "

    .line 226
    .line 227
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_a
    invoke-virtual {v1}, Lb5/k;->b()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_b

    .line 236
    .line 237
    const-string v1, "enum "

    .line 238
    .line 239
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_b
    const-string v1, "class "

    .line 244
    .line 245
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 246
    .line 247
    .line 248
    :goto_3
    invoke-virtual {p1, v0}, Lfc/f;->k(Lhc/c;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2}, Lod/a;->k()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, Lud/e;->r:Ljava/util/List;

    .line 259
    .line 260
    const/4 v2, 0x1

    .line 261
    invoke-virtual {p0, p1, v1, v2}, Lfd/a;->d(Lfc/f;Ljava/util/List;Z)Z

    .line 262
    .line 263
    .line 264
    const/16 v1, 0x20

    .line 265
    .line 266
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 267
    .line 268
    .line 269
    iget-object v2, v0, Lud/e;->p:Lqd/j;

    .line 270
    .line 271
    const-string v4, "extends "

    .line 272
    .line 273
    if-eqz v2, :cond_c

    .line 274
    .line 275
    sget-object v5, Lqd/j;->k:Lqd/e;

    .line 276
    .line 277
    invoke-virtual {v2, v5}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    if-nez v5, :cond_c

    .line 282
    .line 283
    sget-object v5, Lmd/a;->v:Lmd/a;

    .line 284
    .line 285
    iget-object v6, v0, Lmd/e;->g:Lmd/f;

    .line 286
    .line 287
    invoke-virtual {v6, v5}, Lmd/f;->a(Lmd/a;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    if-nez v5, :cond_c

    .line 292
    .line 293
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0, p1, v2}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 300
    .line 301
    .line 302
    :cond_c
    iget-object v2, v0, Lud/e;->q:Ljava/util/List;

    .line 303
    .line 304
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-nez v2, :cond_11

    .line 309
    .line 310
    and-int/lit16 v2, v3, 0x2000

    .line 311
    .line 312
    if-eqz v2, :cond_d

    .line 313
    .line 314
    return-void

    .line 315
    :cond_d
    iget-object v2, v0, Lud/e;->o:Lb5/k;

    .line 316
    .line 317
    invoke-virtual {v2}, Lb5/k;->d()Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_e

    .line 322
    .line 323
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_e
    const-string v2, "implements "

    .line 328
    .line 329
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 330
    .line 331
    .line 332
    :goto_4
    iget-object v2, v0, Lud/e;->q:Ljava/util/List;

    .line 333
    .line 334
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    :cond_f
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_10

    .line 343
    .line 344
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Lqd/j;

    .line 349
    .line 350
    invoke-virtual {p0, p1, v3}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-eqz v3, :cond_f

    .line 358
    .line 359
    const-string v3, ", "

    .line 360
    .line 361
    invoke-virtual {p1, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_10
    iget-object v0, v0, Lud/e;->q:Ljava/util/List;

    .line 366
    .line 367
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-nez v0, :cond_11

    .line 372
    .line 373
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 374
    .line 375
    .line 376
    :cond_11
    return-void
.end method

.method public final c(Lfc/f;Lud/g;)V
    .locals 11

    .line 1
    iget-object v0, p2, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    iget-object v1, p2, Lud/g;->l:Lod/c;

    .line 4
    .line 5
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object v0, Loc/c;->a:Loc/c;

    .line 15
    .line 16
    iget-object v2, p2, Lmd/e;->g:Lmd/f;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Lmd/f;->b(Loc/a;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lmd/b;->d:Lmd/b;

    .line 25
    .line 26
    iget-object v2, p2, Lmd/e;->g:Lmd/f;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Lmd/f;->b(Loc/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    sget-object v0, Lmd/b;->a:Lmd/b;

    .line 35
    .line 36
    iget-object v2, p2, Lmd/e;->g:Lmd/f;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lmd/f;->b(Loc/a;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Lod/c;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Lfc/f;->f()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-static {p1, p2}, Ljd/c;->b(Lfc/f;Lnd/b0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lod/c;->b()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, v1, Lod/c;->h:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {p1, p2, v0}, Ljd/c;->f(Lfc/f;Lnd/b0;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lfd/a;->c:Lb/e;

    .line 68
    .line 69
    invoke-virtual {v0, p2, p1}, Lb/e;->i(Lmd/i;Lfc/f;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p2, Lud/g;->m:Lb5/k;

    .line 73
    .line 74
    sget-object v3, Lbc/a;->k:Lbc/a;

    .line 75
    .line 76
    invoke-virtual {p2, v3}, Lnd/b0;->N(Lbc/a;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {v2, v3}, Lb5/k;->j(Z)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {p1, v2}, Lfc/f;->r(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p2, Lud/g;->n:Lqd/j;

    .line 88
    .line 89
    invoke-virtual {p0, p1, v2}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 90
    .line 91
    .line 92
    const/16 v2, 0x20

    .line 93
    .line 94
    invoke-virtual {p1, v2}, Lfc/f;->d(C)Lfc/f;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lfc/f;->k(Lhc/c;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v1, Lod/c;->j:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 103
    .line 104
    .line 105
    sget-object v1, Lmd/b;->k:Lmd/b;

    .line 106
    .line 107
    iget-object v2, p2, Lmd/e;->g:Lmd/f;

    .line 108
    .line 109
    invoke-virtual {v2, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Lmd/h;

    .line 114
    .line 115
    const-string v2, " = "

    .line 116
    .line 117
    iget-object v3, p0, Lfd/a;->a:Lud/e;

    .line 118
    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    iget-object p2, v1, Lmd/h;->g:Lud/r;

    .line 122
    .line 123
    new-instance v0, Lfd/g;

    .line 124
    .line 125
    invoke-direct {v0, p0, p2}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 126
    .line 127
    .line 128
    new-instance p2, Lfd/e;

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    invoke-direct {p2, v0, v4}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 135
    .line 136
    .line 137
    iget-object v0, v1, Lmd/h;->h:Lud/p;

    .line 138
    .line 139
    :try_start_0
    sget-object v1, Lfd/d;->h:Lfd/d;

    .line 140
    .line 141
    invoke-virtual {p2, v0, p1, v1}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :catch_0
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const-string v0, "Failed to generate init code"

    .line 152
    .line 153
    invoke-static {v3, v0, p2}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_4
    sget-object v1, Loc/c;->f:Loc/c;

    .line 159
    .line 160
    iget-object v4, p2, Lmd/e;->g:Lmd/f;

    .line 161
    .line 162
    invoke-virtual {v4, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lnc/a;

    .line 167
    .line 168
    if-eqz v1, :cond_8

    .line 169
    .line 170
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 171
    .line 172
    .line 173
    iget v2, v1, Lnc/a;->g:I

    .line 174
    .line 175
    const/4 v4, 0x1

    .line 176
    iget-boolean v9, p0, Lfd/a;->d:Z

    .line 177
    .line 178
    if-ne v2, v4, :cond_5

    .line 179
    .line 180
    iget-object v7, p2, Lud/g;->n:Lqd/j;

    .line 181
    .line 182
    sget-object p2, Lfd/j;->a:Lmh/b;

    .line 183
    .line 184
    invoke-virtual {v3}, Lud/e;->n()Lud/u;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iget-object v8, p2, Lud/u;->c:Lxe/q;

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    const-wide/16 v5, 0x0

    .line 192
    .line 193
    invoke-static/range {v5 .. v10}, Lfd/j;->a(JLqd/j;Lxe/q;ZZ)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_5
    invoke-static {v1}, La7/a;->n(Lnc/a;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    instance-of v4, v2, Lqd/n;

    .line 206
    .line 207
    if-eqz v4, :cond_7

    .line 208
    .line 209
    check-cast v2, Lqd/n;

    .line 210
    .line 211
    iget-wide v5, v2, Lqd/n;->l:J

    .line 212
    .line 213
    iget-object v7, p2, Lud/g;->n:Lqd/j;

    .line 214
    .line 215
    iget p2, p0, Lfd/a;->g:I

    .line 216
    .line 217
    const/4 v0, 0x2

    .line 218
    if-eq p2, v0, :cond_6

    .line 219
    .line 220
    sget-object p2, Lye/f;->a:Lmh/b;

    .line 221
    .line 222
    sget-object p2, Lqd/j;->b:Lqd/g;

    .line 223
    .line 224
    invoke-virtual {v7, p2}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    if-eqz p2, :cond_6

    .line 229
    .line 230
    iget-object p2, v3, Lud/e;->x:Lud/e;

    .line 231
    .line 232
    if-eqz p2, :cond_6

    .line 233
    .line 234
    iget-object p2, p2, Lud/e;->m:Lod/a;

    .line 235
    .line 236
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    const-string v0, "R"

    .line 241
    .line 242
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-eqz p2, :cond_6

    .line 247
    .line 248
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    const-string v0, "0x%08x"

    .line 257
    .line 258
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    goto :goto_0

    .line 263
    :cond_6
    sget-object p2, Lfd/j;->a:Lmh/b;

    .line 264
    .line 265
    invoke-virtual {v3}, Lud/e;->n()Lud/u;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    iget-object v8, p2, Lud/u;->c:Lxe/q;

    .line 270
    .line 271
    const/4 v10, 0x0

    .line 272
    invoke-static/range {v5 .. v10}, Lfd/j;->a(JLqd/j;Lxe/q;ZZ)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    :goto_0
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 277
    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_7
    iget-object p2, v3, Lud/e;->k:Lud/u;

    .line 281
    .line 282
    invoke-virtual {v0, p2, p1, v1}, Lb/e;->q(Lud/u;Lfc/f;Lnc/a;)V

    .line 283
    .line 284
    .line 285
    :cond_8
    :goto_1
    const/16 p2, 0x3b

    .line 286
    .line 287
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method public final d(Lfc/f;Ljava/util/List;Z)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_8

    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    const/16 v1, 0x3c

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_7

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lqd/j;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-string v2, ", "

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v2, v1, Lqd/c;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Lqd/j;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p0, p1, v1}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1}, Lqd/j;->i()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_6

    .line 69
    .line 70
    const-string v2, " extends "

    .line 71
    .line 72
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lqd/j;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    instance-of v3, v2, Lqd/c;

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    invoke-virtual {p0, p1, v2}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 107
    .line 108
    .line 109
    if-eqz p3, :cond_5

    .line 110
    .line 111
    iget-object v3, p0, Lfd/a;->a:Lud/e;

    .line 112
    .line 113
    iget-object v4, v3, Lud/e;->m:Lod/a;

    .line 114
    .line 115
    invoke-virtual {v4}, Lod/a;->o()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_5

    .line 120
    .line 121
    iget-object v3, v3, Lud/e;->k:Lud/u;

    .line 122
    .line 123
    iget-object v4, v3, Lud/u;->a:Lbc/g;

    .line 124
    .line 125
    iget-boolean v4, v4, Lbc/g;->p:Z

    .line 126
    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    invoke-static {v3, v2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {p0, v2}, Lfd/a;->f(Lod/a;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_3

    .line 141
    .line 142
    const-string v2, " & "

    .line 143
    .line 144
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_7
    const/16 p2, 0x3e

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 155
    .line 156
    .line 157
    const/4 p1, 0x1

    .line 158
    return p1

    .line 159
    :cond_8
    :goto_4
    return v0
.end method

.method public final e(Lfc/f;Lqd/j;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lqd/j;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_4

    .line 6
    .line 7
    const/16 v0, 0x3c

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v2, ", "

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lqd/j;

    .line 31
    .line 32
    invoke-virtual {v2}, Lqd/j;->r()Lqd/j;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2}, Lqd/j;->q()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v2}, Lp/a;->d(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {p1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    if-eq v2, v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1, v3}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {p0, p1, v2}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/16 p2, 0x3e

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method public final f(Lod/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfd/a;->b:Lfd/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lfd/a;->f(Lod/a;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lfd/a;->h:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g(Lfc/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lfd/a;->h:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/alibaba/fastjson2/writer/b;

    .line 15
    .line 16
    const/16 v3, 0x13

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lbe/w;

    .line 29
    .line 30
    const/16 v3, 0x8

    .line 31
    .line 32
    invoke-direct {v2, p0, v3, p1}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lfc/b;->f()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final h(Lfc/f;Lqd/j;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lqd/j;->k()Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqd/j;->m()Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, v1}, Lfd/a;->r(Lfc/f;Lqd/j;Lqd/j;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x2e

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lfd/a;->h(Lfc/f;Lqd/j;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, p1, p2, v0}, Lfd/a;->r(Lfc/f;Lqd/j;Lqd/j;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final i(Lfc/f;Lud/r;)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ljd/c;->b(Lfc/f;Lnd/b0;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Ljd/c;->d(Lfc/f;Lnd/b0;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p2, Lud/r;->p:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfd/g;

    .line 12
    .line 13
    invoke-direct {v0, p0, p2}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lfd/g;->b(Lfc/f;)Z

    .line 17
    .line 18
    .line 19
    const/16 p2, 0x3b

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v0, Lmd/a;->Z:Lmd/a;

    .line 26
    .line 27
    iget-object v1, p2, Lmd/e;->g:Lmd/f;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-boolean v1, p0, Lfd/a;->f:Z

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    :cond_1
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget-boolean v0, p0, Lfd/a;->d:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 47
    .line 48
    iget-object v1, p2, Lmd/e;->g:Lmd/f;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lmd/f;->b(Loc/a;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    new-instance v0, Lfd/g;

    .line 58
    .line 59
    invoke-direct {v0, p0, p2}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    invoke-static {p2}, Lfd/g;->h(Lud/r;)Lfd/g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_1
    invoke-virtual {v0, p1}, Lfd/g;->b(Lfc/f;)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    const/16 p2, 0x20

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 76
    .line 77
    .line 78
    :cond_4
    const/16 p2, 0x7b

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p1}, Lfd/g;->d(Lfc/f;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lfc/f;->q()V

    .line 93
    .line 94
    .line 95
    sget-object p2, Lic/c;->g:Lic/c;

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lfc/f;->j(Lhc/a;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final j(Lfc/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 2
    .line 3
    iget-object v1, v0, Lud/e;->m:Lod/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lod/a;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v0, "// default package"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lfc/b;->e(Ljava/lang/String;)Lfc/f;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v1, "package "

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lfc/b;->e(Ljava/lang/String;)Lfc/f;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 27
    .line 28
    invoke-virtual {v0}, Lod/a;->j()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x3b

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lfd/a;->b:Lfd/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lfd/a;->l()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lfd/a;->h:Ljava/util/HashSet;

    .line 11
    .line 12
    return-object v0
.end method

.method public final n()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 2
    .line 3
    iget-object v0, v0, Lud/e;->u:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lud/g;

    .line 20
    .line 21
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 22
    .line 23
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public final o(Lfc/f;Lod/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 2
    .line 3
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 4
    .line 5
    invoke-virtual {v1, p2}, Lud/u;->f(Lod/a;)Lud/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lfc/f;->j(Lhc/a;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, v1, Lud/e;->m:Lod/a;

    .line 15
    .line 16
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, Lfd/a;->q(Lod/a;Lod/a;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 27
    .line 28
    invoke-virtual {p0, v0, p2}, Lfd/a;->q(Lod/a;Lod/a;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final p(Lfc/f;Lqd/j;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lqd/j;->m()Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x2e

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lfd/a;->h(Lfc/f;Lqd/j;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 20
    .line 21
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 22
    .line 23
    invoke-static {v0, p2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, p1, v0}, Lfd/a;->o(Lfc/f;Lod/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lfd/a;->e(Lfc/f;Lqd/j;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final q(Lod/a;Lod/a;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p2}, Lod/a;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lfd/a;->d:Z

    .line 6
    .line 7
    if-nez v1, :cond_13

    .line 8
    .line 9
    iget-boolean v1, p0, Lfd/a;->e:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1, p2}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p2}, Lod/a;->j()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_2
    invoke-static {p1, p2}, Lfd/a;->m(Lod/a;Lod/a;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_3
    invoke-virtual {p2}, Lod/a;->o()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    const-string v4, "."

    .line 53
    .line 54
    if-eqz v2, :cond_8

    .line 55
    .line 56
    new-instance v0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    iget-object p2, p2, Lod/a;->k:Lod/a;

    .line 65
    .line 66
    :goto_0
    if-eqz p2, :cond_6

    .line 67
    .line 68
    if-eq p2, p1, :cond_5

    .line 69
    .line 70
    invoke-static {p1, p2}, Lfd/a;->m(Lod/a;Lod/a;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    iget-object p2, p2, Lod/a;->k:Lod/a;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    :goto_1
    move p1, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_6
    const/4 p1, 0x1

    .line 86
    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lod/a;

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lfd/a;->f(Lod/a;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    new-instance p1, Lcom/alibaba/fastjson2/writer/b;

    .line 101
    .line 102
    const/16 p2, 0x14

    .line 103
    .line 104
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v4, p1}, Lxe/s;->k(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_8
    iget-object v2, p0, Lfd/a;->a:Lud/e;

    .line 113
    .line 114
    iget-object v5, v2, Lud/e;->k:Lud/u;

    .line 115
    .line 116
    invoke-static {v5, p1, p2}, Lfd/a;->k(Lud/u;Lod/a;Lod/a;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_13

    .line 121
    .line 122
    iget-object v2, v2, Lud/e;->k:Lud/u;

    .line 123
    .line 124
    invoke-virtual {p1}, Lod/a;->j()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {p2}, Lod/a;->j()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_9

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_9
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v2, v2, Lud/u;->s:Led/c;

    .line 144
    .line 145
    invoke-static {v5, v4, v3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v2, v2, Led/c;->b:Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    :goto_3
    if-eqz v3, :cond_a

    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :cond_a
    invoke-virtual {p1}, Lod/a;->m()Lod/a;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {p2}, Lod/a;->m()Lod/a;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-eqz v2, :cond_b

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    goto :goto_4

    .line 174
    :cond_b
    invoke-virtual {p1, v3}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    :goto_4
    if-eqz v2, :cond_c

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_c
    invoke-virtual {p2}, Lod/a;->l()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const-string v3, "java.lang"

    .line 186
    .line 187
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_d

    .line 192
    .line 193
    iget-object v2, p2, Lod/a;->k:Lod/a;

    .line 194
    .line 195
    if-nez v2, :cond_d

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_d
    invoke-virtual {p2}, Lod/a;->l()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {p1}, Lod/a;->l()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_e

    .line 211
    .line 212
    invoke-virtual {p2}, Lod/a;->o()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_e

    .line 217
    .line 218
    :goto_5
    return-object v1

    .line 219
    :cond_e
    invoke-virtual {p2}, Lod/a;->j()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {p1}, Lod/a;->j()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_f

    .line 232
    .line 233
    invoke-virtual {p2}, Lod/a;->i()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    :cond_f
    invoke-virtual {p0}, Lfd/a;->l()Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    :cond_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_12

    .line 250
    .line 251
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Lod/a;

    .line 256
    .line 257
    invoke-virtual {v3, p2}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_10

    .line 262
    .line 263
    invoke-virtual {v3}, Lod/a;->k()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-eqz v3, :cond_10

    .line 272
    .line 273
    invoke-virtual {p2}, Lod/a;->o()Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_11

    .line 278
    .line 279
    iget-object p2, p2, Lod/a;->k:Lod/a;

    .line 280
    .line 281
    invoke-virtual {p0, p1, p2}, Lfd/a;->q(Lod/a;Lod/a;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p1, v4, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    return-object p1

    .line 290
    :cond_11
    return-object v0

    .line 291
    :cond_12
    invoke-virtual {p0, p2}, Lfd/a;->f(Lod/a;)V

    .line 292
    .line 293
    .line 294
    return-object v1

    .line 295
    :cond_13
    :goto_6
    return-object v0
.end method

.method public final r(Lfc/f;Lqd/j;Lqd/j;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Lqd/j;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "."

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Lqd/j;->l()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    iget-object v0, p0, Lfd/a;->a:Lud/e;

    .line 23
    .line 24
    iget-object v1, v0, Lud/e;->k:Lud/u;

    .line 25
    .line 26
    invoke-static {v1, p2}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object v0, v0, Lud/e;->k:Lud/u;

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lud/u;->f(Lod/a;)Lud/e;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lfc/f;->j(Lhc/a;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1, p3}, Lfd/a;->e(Lfc/f;Lqd/j;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final s(Lfc/f;Lqd/j;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lqd/j;->o()Lqd/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lqd/j;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v1, Lqd/q;->r:Lqd/q;

    .line 16
    .line 17
    if-ne v0, v1, :cond_2

    .line 18
    .line 19
    instance-of v0, p2, Lqd/c;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p0, p1, p2}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    sget-object v1, Lqd/q;->s:Lqd/q;

    .line 36
    .line 37
    if-ne v0, v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p2}, Lqd/j;->g()Lqd/j;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p0, p1, p2}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 44
    .line 45
    .line 46
    const-string p2, "[]"

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    iget-object p2, v0, Lqd/q;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 55
    .line 56
    .line 57
    return-void
.end method
