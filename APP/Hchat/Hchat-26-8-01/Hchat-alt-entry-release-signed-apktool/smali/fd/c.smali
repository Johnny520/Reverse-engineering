.class public final Lfd/c;
.super Lfd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static s(Lqd/l;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lqd/m;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    check-cast p0, Lqd/m;

    .line 10
    .line 11
    iget-object p0, p0, Lqd/m;->l:Lud/p;

    .line 12
    .line 13
    iget-object v0, p0, Lud/p;->k:Lpd/k;

    .line 14
    .line 15
    sget-object v1, Lpd/k;->j:Lpd/k;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    check-cast p0, Lpd/a;

    .line 21
    .line 22
    iget p0, p0, Lpd/a;->o:I

    .line 23
    .line 24
    invoke-static {p0}, Lt3/c;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    if-eq p0, v2, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    if-eq p0, v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    if-eq p0, v0, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    if-eq p0, v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    const/16 v0, 0x16

    .line 49
    .line 50
    if-eq p0, v0, :cond_2

    .line 51
    .line 52
    const/16 v0, 0x1a

    .line 53
    .line 54
    if-eq p0, v0, :cond_2

    .line 55
    .line 56
    const/16 v0, 0x1e

    .line 57
    .line 58
    if-eq p0, v0, :cond_2

    .line 59
    .line 60
    const/16 v0, 0x20

    .line 61
    .line 62
    if-eq p0, v0, :cond_2

    .line 63
    .line 64
    const/16 v0, 0x22

    .line 65
    .line 66
    if-eq p0, v0, :cond_2

    .line 67
    .line 68
    :goto_0
    return v2

    .line 69
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 70
    return p0
.end method


# virtual methods
.method public final r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V
    .locals 10

    .line 1
    iget-object v0, p2, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget v1, p3, Lyd/b;->i:I

    .line 9
    .line 10
    iget-object v2, p3, Lyd/b;->j:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x2

    .line 17
    const/4 v5, 0x0

    .line 18
    const/16 v6, 0x21

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    if-eqz v3, :cond_6

    .line 22
    .line 23
    if-eq v3, v7, :cond_5

    .line 24
    .line 25
    if-eq v3, v4, :cond_4

    .line 26
    .line 27
    const/4 p3, 0x3

    .line 28
    const/4 v4, 0x4

    .line 29
    if-eq v3, p3, :cond_1

    .line 30
    .line 31
    if-ne v3, v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v1}, Lwb/en;->q(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "Unknown condition mode: "

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    :goto_0
    if-ne v1, v4, :cond_2

    .line 49
    .line 50
    const-string p3, " && "

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const-string p3, " || "

    .line 54
    .line 55
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_e

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lyd/b;

    .line 70
    .line 71
    invoke-virtual {p0, p1, p2, v2}, Lfd/c;->t(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-virtual {p1, p3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {p1, v6}, Lfc/f;->d(C)Lfc/f;

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, Lyd/b;

    .line 92
    .line 93
    invoke-virtual {p0, p1, p2, p3}, Lfd/c;->t(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_5
    invoke-virtual {p3}, Lyd/b;->H()Lyd/b;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-virtual {p0, p1, p2, p3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 103
    .line 104
    .line 105
    const-string p3, " ? "

    .line 106
    .line 107
    invoke-virtual {p1, p3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    check-cast p3, Lyd/b;

    .line 115
    .line 116
    invoke-virtual {p0, p1, p2, p3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 117
    .line 118
    .line 119
    const-string p3, " : "

    .line 120
    .line 121
    invoke-virtual {p1, p3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 122
    .line 123
    .line 124
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, Lyd/b;

    .line 129
    .line 130
    invoke-virtual {p0, p1, p2, p3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_6
    iget-object p2, p3, Lyd/b;->k:Lxe/e;

    .line 136
    .line 137
    iget-object p3, p2, Lxe/e;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p3, Lpd/i;

    .line 140
    .line 141
    iget v1, p3, Lpd/i;->p:I

    .line 142
    .line 143
    invoke-virtual {p3, v5}, Lud/p;->S(I)Lqd/l;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-virtual {p2}, Lxe/e;->a()Lqd/l;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p3}, Lqd/l;->I()Lqd/j;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v3, Lqd/j;->c:Lqd/g;

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_d

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    instance-of v2, p2, Lqd/n;

    .line 167
    .line 168
    if-eqz v2, :cond_d

    .line 169
    .line 170
    invoke-virtual {p2}, Lqd/l;->I()Lqd/j;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_d

    .line 179
    .line 180
    move-object v2, p2

    .line 181
    check-cast v2, Lqd/n;

    .line 182
    .line 183
    iget-wide v2, v2, Lqd/n;->l:J

    .line 184
    .line 185
    const-wide/16 v8, 0x0

    .line 186
    .line 187
    cmp-long v2, v2, v8

    .line 188
    .line 189
    if-nez v2, :cond_7

    .line 190
    .line 191
    invoke-static {v1}, Lp/a;->a(I)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    :cond_7
    const/16 v2, 0x29

    .line 196
    .line 197
    const/16 v3, 0x28

    .line 198
    .line 199
    if-ne v1, v7, :cond_a

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-ne p2, v7, :cond_8

    .line 206
    .line 207
    invoke-virtual {p0, p1, p3, v5}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    invoke-static {p3}, Lfd/c;->s(Lqd/l;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_9

    .line 216
    .line 217
    invoke-virtual {p1, v3}, Lfc/f;->d(C)Lfc/f;

    .line 218
    .line 219
    .line 220
    :cond_9
    invoke-virtual {p0, p1, p3, v5}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 221
    .line 222
    .line 223
    if-eqz p2, :cond_e

    .line 224
    .line 225
    invoke-virtual {p1, v2}, Lfc/f;->d(C)Lfc/f;

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    if-ne v1, v4, :cond_c

    .line 230
    .line 231
    invoke-virtual {p1, v6}, Lfc/f;->d(C)Lfc/f;

    .line 232
    .line 233
    .line 234
    invoke-static {p3}, Lfd/c;->s(Lqd/l;)Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-eqz p2, :cond_b

    .line 239
    .line 240
    invoke-virtual {p1, v3}, Lfc/f;->d(C)Lfc/f;

    .line 241
    .line 242
    .line 243
    :cond_b
    invoke-virtual {p0, p1, p3, v5}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 244
    .line 245
    .line 246
    if-eqz p2, :cond_e

    .line 247
    .line 248
    invoke-virtual {p1, v2}, Lfc/f;->d(C)Lfc/f;

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_c
    invoke-static {v1}, Lp/a;->f(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const-string v3, "Unsupported boolean condition "

    .line 257
    .line 258
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget-object v3, p0, Lfd/e;->b:Lud/r;

    .line 263
    .line 264
    invoke-virtual {v3, v2}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_d
    invoke-static {p3}, Lfd/c;->s(Lqd/l;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-virtual {p0, p1, p3, v2}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 272
    .line 273
    .line 274
    const/16 p3, 0x20

    .line 275
    .line 276
    invoke-virtual {p1, p3}, Lfc/f;->d(C)Lfc/f;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-static {v1}, Lp/a;->f(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-virtual {v2, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v1, p3}, Lfc/f;->d(C)Lfc/f;

    .line 289
    .line 290
    .line 291
    invoke-static {p2}, Lfd/c;->s(Lqd/l;)Z

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    invoke-virtual {p0, p1, p2, p3}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 296
    .line 297
    .line 298
    :cond_e
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    check-cast p1, Lyd/b;

    .line 303
    .line 304
    return-void
.end method

.method public final t(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Lyd/b;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lmd/a;->p:Lmd/a;

    .line 9
    .line 10
    iget-object v2, p3, Lmd/e;->g:Lmd/f;

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
    goto :goto_0

    .line 19
    :cond_0
    iget v0, p3, Lyd/b;->i:I

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/16 v0, 0x28

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lfd/c;->r(Lfc/f;Landroidx/lifecycle/x;Lyd/b;)V

    .line 33
    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    const/16 p2, 0x29

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lfc/f;->d(C)Lfc/f;

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method
