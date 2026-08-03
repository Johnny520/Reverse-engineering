.class public final Lzd/c;
.super Lyd/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lnd/t;

.field public final n:Z

.field public final o:Lud/a;

.field public p:Lud/a;

.field public q:Lxd/b;

.field public r:Lg4/a;


# direct methods
.method public constructor <init>(Lxd/b;Lnd/t;Lud/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyd/a;-><init>(Lxd/b;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lzd/c;->m:Lnd/t;

    .line 5
    .line 6
    iput-object p3, p0, Lzd/c;->o:Lud/a;

    .line 7
    .line 8
    iput-boolean p4, p0, Lzd/c;->n:Z

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-static {p3}, La/a;->c0(Lud/h;)Lud/p;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    check-cast p1, Lpd/i;

    .line 21
    .line 22
    new-instance p2, Lyd/b;

    .line 23
    .line 24
    new-instance p4, Lxe/e;

    .line 25
    .line 26
    invoke-direct {p4, p1}, Lxe/e;-><init>(Lpd/i;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p2, p4}, Lyd/b;-><init>(Lxe/e;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    iput-object p1, p0, Lyd/a;->k:Lyd/b;

    .line 34
    .line 35
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lyd/a;->l:Ljava/util/List;

    .line 40
    .line 41
    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Lfd/i;Lfc/f;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lfd/e;->a:Lfd/g;

    .line 2
    .line 3
    iget-object v1, p1, Lfd/e;->b:Lud/r;

    .line 4
    .line 5
    iget-object v2, p0, Lzd/c;->o:Lud/a;

    .line 6
    .line 7
    invoke-static {v2}, La/a;->c0(Lud/h;)Lud/p;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    move v3, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v3, v3, Lnd/r;->i:I

    .line 17
    .line 18
    :goto_0
    if-eqz v3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p0}, Lyd/a;->H()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    invoke-virtual {p2, v3}, Lfc/f;->s(I)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lzd/c;->m:Lnd/t;

    .line 29
    .line 30
    iget-object v3, v3, Lnd/t;->a:Lud/a;

    .line 31
    .line 32
    sget-object v5, Lmd/b;->G:Lmd/b;

    .line 33
    .line 34
    iget-object v3, v3, Lmd/e;->g:Lmd/f;

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lnd/u;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    iget-object v5, v0, Lfd/g;->d:Lfd/h;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v3, v3, Lnd/u;->g:Lnd/t;

    .line 50
    .line 51
    iget v3, v3, Lnd/t;->d:I

    .line 52
    .line 53
    const-string v6, "loop"

    .line 54
    .line 55
    invoke-static {v3, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget-object v5, v5, Lfd/h;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, Ljava/util/HashSet;

    .line 62
    .line 63
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v5, ": "

    .line 71
    .line 72
    invoke-virtual {v3, v5}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object v3, p0, Lyd/a;->k:Lyd/b;

    .line 76
    .line 77
    if-nez v3, :cond_3

    .line 78
    .line 79
    const-string v0, "while (true) {"

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 85
    .line 86
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-virtual {v3}, Lyd/b;->I()Lud/p;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {p2, v5}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 98
    .line 99
    .line 100
    new-instance v6, Lfd/c;

    .line 101
    .line 102
    iget-boolean v7, p1, Lfd/e;->d:Z

    .line 103
    .line 104
    invoke-direct {v6, v0, v7}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lzd/c;->r:Lg4/a;

    .line 108
    .line 109
    const-string v7, ") {"

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    instance-of v2, v0, Lzd/b;

    .line 114
    .line 115
    const-string v8, "for ("

    .line 116
    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    check-cast v0, Lzd/b;

    .line 120
    .line 121
    invoke-virtual {p2, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Lzd/b;->a:Lud/p;

    .line 125
    .line 126
    sget-object v4, Lfd/d;->i:Lfd/d;

    .line 127
    .line 128
    invoke-virtual {p1, v2, p2, v4}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V

    .line 129
    .line 130
    .line 131
    const-string v2, "; "

    .line 132
    .line 133
    invoke-virtual {p2, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 134
    .line 135
    .line 136
    new-instance v8, Landroidx/lifecycle/x;

    .line 137
    .line 138
    const/16 v9, 0xc

    .line 139
    .line 140
    invoke-direct {v8, v9}, Landroidx/lifecycle/x;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, p2, v8, v3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, Lzd/b;->b:Lud/p;

    .line 150
    .line 151
    invoke-virtual {p1, v0, p2, v4}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 155
    .line 156
    .line 157
    invoke-static {p2, v1, v5}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 161
    .line 162
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_4
    instance-of v2, v0, Lzd/a;

    .line 170
    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    check-cast v0, Lzd/a;

    .line 174
    .line 175
    invoke-virtual {p2, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 176
    .line 177
    .line 178
    iget-object v2, v0, Lzd/a;->a:Lud/p;

    .line 179
    .line 180
    iget-object v2, v2, Lud/p;->l:Lqd/r;

    .line 181
    .line 182
    iget-object v2, v2, Lqd/r;->m:Lqd/s;

    .line 183
    .line 184
    invoke-virtual {v2}, Lqd/s;->b()Lqd/k;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-boolean v3, v2, Lqd/k;->d:Z

    .line 189
    .line 190
    if-eqz v3, :cond_5

    .line 191
    .line 192
    const-string v3, "final "

    .line 193
    .line 194
    invoke-virtual {p2, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 195
    .line 196
    .line 197
    :cond_5
    iget-object v3, v2, Lqd/k;->b:Lqd/j;

    .line 198
    .line 199
    invoke-virtual {p1, p2, v3}, Lfd/e;->q(Lfc/f;Lqd/j;)V

    .line 200
    .line 201
    .line 202
    const/16 v3, 0x20

    .line 203
    .line 204
    invoke-virtual {p2, v3}, Lfc/f;->d(C)Lfc/f;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p2, v2}, Lfd/e;->d(Lfc/f;Lqd/k;)V

    .line 208
    .line 209
    .line 210
    const-string v2, " : "

    .line 211
    .line 212
    invoke-virtual {p2, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 213
    .line 214
    .line 215
    iget-object v0, v0, Lzd/a;->b:Lud/p;

    .line 216
    .line 217
    invoke-virtual {v0, v4}, Lud/p;->S(I)Lqd/l;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p1, p2, v0, v4}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p2, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 225
    .line 226
    .line 227
    invoke-static {p2, v1, v5}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 231
    .line 232
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    const-string p2, "Unknown loop type: "

    .line 248
    .line 249
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_7
    iget-boolean v0, p0, Lzd/c;->n:Z

    .line 258
    .line 259
    if-eqz v0, :cond_a

    .line 260
    .line 261
    const-string v0, "do {"

    .line 262
    .line 263
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 264
    .line 265
    .line 266
    invoke-static {p2, v1, v5}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 270
    .line 271
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v2}, La/a;->c0(Lud/h;)Lud/p;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    if-nez p1, :cond_8

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_8
    iget v4, p1, Lnd/r;->i:I

    .line 282
    .line 283
    :goto_2
    if-eqz v4, :cond_9

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_9
    invoke-virtual {p0}, Lyd/a;->H()I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    :goto_3
    invoke-virtual {p2, v4}, Lfc/f;->s(I)V

    .line 291
    .line 292
    .line 293
    const-string p1, "} while ("

    .line 294
    .line 295
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 296
    .line 297
    .line 298
    new-instance p1, Landroidx/lifecycle/x;

    .line 299
    .line 300
    const/16 v0, 0xc

    .line 301
    .line 302
    invoke-direct {p1, v0}, Landroidx/lifecycle/x;-><init>(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6, p2, p1, v3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 306
    .line 307
    .line 308
    const-string p1, ");"

    .line 309
    .line 310
    invoke-virtual {p2, p1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_a
    const-string v0, "while ("

    .line 315
    .line 316
    invoke-virtual {p2, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 317
    .line 318
    .line 319
    new-instance v0, Landroidx/lifecycle/x;

    .line 320
    .line 321
    const/16 v2, 0xc

    .line 322
    .line 323
    invoke-direct {v0, v2}, Landroidx/lifecycle/x;-><init>(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, p2, v0, v3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p2, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 330
    .line 331
    .line 332
    invoke-static {p2, v1, v5}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 336
    .line 337
    invoke-virtual {p1, p2, v0}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 341
    .line 342
    .line 343
    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lzd/c;->q:Lxd/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "-"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lxd/b;->k()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final l(Lud/j;Lud/j;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lzd/c;->m:Lnd/t;

    .line 2
    .line 3
    iget v0, v0, Lnd/t;->d:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lzd/c;->k()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v3, "LOOP:"

    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ": "

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lyd/a;->l:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lzd/c;->p:Lud/a;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Lyd/a;->l:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lzd/c;->q:Lxd/b;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object v0
.end method
