.class public final Lfd/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Lmh/b;


# instance fields
.field public final a:Lud/r;

.field public final b:Lfd/a;

.field public final c:Lb/e;

.field public final d:Lfd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lfd/g;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lfd/g;->e:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lfd/a;Lud/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lfd/g;->a:Lud/r;

    .line 5
    .line 6
    iput-object p1, p0, Lfd/g;->b:Lfd/a;

    .line 7
    .line 8
    iget-object v0, p1, Lfd/a;->c:Lb/e;

    .line 9
    .line 10
    iput-object v0, p0, Lfd/g;->c:Lb/e;

    .line 11
    .line 12
    new-instance v0, Lfd/h;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Lfd/h;-><init>(Lfd/a;Lud/r;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lfd/g;->d:Lfd/h;

    .line 18
    .line 19
    return-void
.end method

.method public static h(Lud/r;)Lfd/g;
    .locals 7

    .line 1
    new-instance v0, Lfd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lud/r;->l:Lud/e;

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v6, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct/range {v0 .. v6}, Lfd/a;-><init>(Lud/e;Lfd/a;ZZZI)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lfd/g;

    .line 14
    .line 15
    invoke-direct {v1, v0, p0}, Lfd/g;-><init>(Lfd/a;Lud/r;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public static i(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    neg-int p0, p0

    .line 4
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "LB_%x"

    .line 13
    .line 14
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "L%x"

    .line 28
    .line 29
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static j(Lud/a;)Ljava/lang/String;
    .locals 1

    .line 1
    iget p0, p0, Lud/a;->i:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "L%d"

    .line 12
    .line 13
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final a(Lfc/f;Lud/p;Z)V
    .locals 3

    .line 1
    sget-object v0, Lmd/b;->F:Lmd/b;

    .line 2
    .line 3
    iget-object p2, p2, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lae/b;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-string v0, "     // Catch:"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 17
    .line 18
    .line 19
    iget-object p2, p2, Lae/b;->g:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lae/f;

    .line 36
    .line 37
    const/16 v1, 0x20

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lfc/f;->d(C)Lfc/f;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lfd/g;->b:Lfd/a;

    .line 43
    .line 44
    invoke-virtual {v0}, Lae/f;->b()Lqd/j;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, p1, v2}, Lfd/a;->p(Lfc/f;Lqd/j;)V

    .line 49
    .line 50
    .line 51
    const-string v1, " -> "

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 54
    .line 55
    .line 56
    if-eqz p3, :cond_1

    .line 57
    .line 58
    iget v0, v0, Lae/f;->b:I

    .line 59
    .line 60
    invoke-static {v0}, Lfd/g;->i(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, v0, Lae/f;->c:Lud/a;

    .line 69
    .line 70
    invoke-static {v0}, Lfd/g;->j(Lud/a;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    :goto_1
    return-void
.end method

.method public final b(Lfc/f;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lfd/g;->a:Lud/r;

    .line 6
    .line 7
    iget-object v3, v2, Lud/r;->k:Lod/d;

    .line 8
    .line 9
    iget-object v4, v2, Lud/r;->k:Lod/d;

    .line 10
    .line 11
    iget-object v5, v2, Lud/r;->l:Lud/e;

    .line 12
    .line 13
    invoke-virtual {v3}, Lod/d;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v6, 0x1

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lfc/f;->p()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lfc/f;->k(Lhc/c;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "static"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 29
    .line 30
    .line 31
    return v6

    .line 32
    :cond_0
    sget-object v3, Lmd/a;->H:Lmd/a;

    .line 33
    .line 34
    iget-object v7, v2, Lmd/e;->g:Lmd/f;

    .line 35
    .line 36
    invoke-virtual {v7, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Lfc/f;->p()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lfc/f;->k(Lhc/c;)V

    .line 47
    .line 48
    .line 49
    return v7

    .line 50
    :cond_1
    sget-object v3, Lmd/b;->r:Lmd/b;

    .line 51
    .line 52
    iget-object v8, v2, Lmd/e;->g:Lmd/f;

    .line 53
    .line 54
    invoke-virtual {v8, v3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lnd/x;

    .line 59
    .line 60
    sget-object v8, Lbc/a;->k:Lbc/a;

    .line 61
    .line 62
    const-string v9, ", "

    .line 63
    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v10, v3, Lnd/x;->i:Ljava/util/HashSet;

    .line 68
    .line 69
    invoke-virtual {v10, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-nez v10, :cond_3

    .line 74
    .line 75
    const-string v10, "@Override"

    .line 76
    .line 77
    invoke-virtual {v1, v10}, Lfc/f;->r(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v8}, Lnd/b0;->N(Lbc/a;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_3

    .line 85
    .line 86
    const-string v10, " // "

    .line 87
    .line 88
    invoke-virtual {v1, v10}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 89
    .line 90
    .line 91
    iget-object v3, v3, Lnd/x;->g:Ljava/util/List;

    .line 92
    .line 93
    new-instance v10, Lcom/alibaba/fastjson2/writer/b;

    .line 94
    .line 95
    const/16 v11, 0x15

    .line 96
    .line 97
    invoke-direct {v10, v11}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v9, v10}, Lxe/s;->k(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v3}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_0
    iget-object v3, v0, Lfd/g;->c:Lb/e;

    .line 108
    .line 109
    invoke-virtual {v3, v2, v1}, Lb/e;->i(Lmd/i;Lfc/f;)V

    .line 110
    .line 111
    .line 112
    iget-object v10, v5, Lud/e;->o:Lb5/k;

    .line 113
    .line 114
    iget-object v11, v2, Lud/r;->m:Lb5/k;

    .line 115
    .line 116
    invoke-virtual {v10}, Lb5/k;->d()Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    if-eqz v12, :cond_4

    .line 121
    .line 122
    const/16 v12, 0x400

    .line 123
    .line 124
    invoke-virtual {v11, v12}, Lb5/k;->m(I)Lb5/k;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-virtual {v11, v6}, Lb5/k;->m(I)Lb5/k;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    :cond_4
    iget v12, v10, Lb5/k;->b:I

    .line 133
    .line 134
    and-int/lit16 v12, v12, 0x2000

    .line 135
    .line 136
    if-eqz v12, :cond_5

    .line 137
    .line 138
    invoke-virtual {v11, v6}, Lb5/k;->m(I)Lb5/k;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    :cond_5
    invoke-virtual {v4}, Lod/d;->f()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    if-eqz v12, :cond_6

    .line 147
    .line 148
    invoke-virtual {v5}, Lud/e;->c0()Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eqz v12, :cond_6

    .line 153
    .line 154
    const/4 v12, 0x7

    .line 155
    invoke-virtual {v11, v12}, Lb5/k;->m(I)Lb5/k;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    :cond_6
    iget-object v12, v4, Lod/d;->g:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v13, v4, Lod/d;->n:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-nez v12, :cond_7

    .line 168
    .line 169
    invoke-virtual {v11}, Lb5/k;->a()Z

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    if-nez v12, :cond_7

    .line 174
    .line 175
    iget-object v12, v4, Lod/d;->g:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v1, v2, v12}, Ljd/c;->f(Lfc/f;Lnd/b0;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_7
    sget-object v12, Lmd/a;->Z:Lmd/a;

    .line 181
    .line 182
    iget-object v13, v2, Lmd/e;->g:Lmd/f;

    .line 183
    .line 184
    invoke-virtual {v13, v12}, Lmd/f;->a(Lmd/a;)Z

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    if-eqz v12, :cond_a

    .line 189
    .line 190
    sget-object v12, Lbc/a;->i:Lbc/a;

    .line 191
    .line 192
    invoke-virtual {v2, v12}, Lnd/b0;->N(Lbc/a;)Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-eqz v12, :cond_a

    .line 197
    .line 198
    const-string v12, "/*"

    .line 199
    .line 200
    invoke-virtual {v1, v12}, Lfc/f;->r(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, Lfc/f;->o()V

    .line 204
    .line 205
    .line 206
    const-string v12, "Code decompiled incorrectly, please refer to instructions dump."

    .line 207
    .line 208
    invoke-virtual {v1, v12}, Lfc/f;->r(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object v12, v5, Lud/e;->k:Lud/u;

    .line 212
    .line 213
    iget-object v12, v12, Lud/u;->a:Lbc/g;

    .line 214
    .line 215
    iget-boolean v12, v12, Lbc/g;->o:Z

    .line 216
    .line 217
    if-nez v12, :cond_9

    .line 218
    .line 219
    instance-of v12, v1, Lfc/b;

    .line 220
    .line 221
    if-eqz v12, :cond_8

    .line 222
    .line 223
    const-string v12, "To view partially-correct code enable \'Show inconsistent code\' option in preferences"

    .line 224
    .line 225
    invoke-virtual {v1, v12}, Lfc/f;->r(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_8
    const-string v12, "To view partially-correct add \'--show-bad-code\' argument"

    .line 230
    .line 231
    invoke-virtual {v1, v12}, Lfc/f;->r(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_9
    :goto_1
    invoke-virtual {v1}, Lfc/f;->n()V

    .line 235
    .line 236
    .line 237
    const-string v12, "*/"

    .line 238
    .line 239
    invoke-virtual {v1, v12}, Lfc/f;->r(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_a
    iget v12, v2, Lnd/r;->i:I

    .line 243
    .line 244
    invoke-virtual {v1, v12}, Lfc/f;->s(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v8}, Lnd/b0;->N(Lbc/a;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    invoke-virtual {v11, v8}, Lb5/k;->j(Z)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v1, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v10}, Lb5/k;->d()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_b

    .line 263
    .line 264
    iget-boolean v8, v2, Lud/r;->p:Z

    .line 265
    .line 266
    if-nez v8, :cond_b

    .line 267
    .line 268
    iget-object v8, v2, Lud/r;->m:Lb5/k;

    .line 269
    .line 270
    invoke-virtual {v8}, Lb5/k;->h()Z

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    if-nez v8, :cond_b

    .line 275
    .line 276
    const-string v8, "default "

    .line 277
    .line 278
    invoke-virtual {v1, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 279
    .line 280
    .line 281
    :cond_b
    iget-object v8, v2, Lud/r;->v:Ljava/util/List;

    .line 282
    .line 283
    iget-object v10, v0, Lfd/g;->b:Lfd/a;

    .line 284
    .line 285
    invoke-virtual {v10, v1, v8, v7}, Lfd/a;->d(Lfc/f;Ljava/util/List;Z)Z

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    const/16 v12, 0x20

    .line 290
    .line 291
    if-eqz v8, :cond_c

    .line 292
    .line 293
    invoke-virtual {v1, v12}, Lfc/f;->d(C)Lfc/f;

    .line 294
    .line 295
    .line 296
    :cond_c
    invoke-virtual {v11}, Lb5/k;->a()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_d

    .line 301
    .line 302
    invoke-virtual {v1, v2}, Lfc/f;->k(Lhc/c;)V

    .line 303
    .line 304
    .line 305
    iget-object v8, v10, Lfd/a;->a:Lud/e;

    .line 306
    .line 307
    iget-object v8, v8, Lud/e;->m:Lod/a;

    .line 308
    .line 309
    invoke-virtual {v8}, Lod/a;->k()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-virtual {v1, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_d
    iget-object v8, v2, Lud/r;->t:Lqd/j;

    .line 318
    .line 319
    invoke-virtual {v10, v1, v8}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v12}, Lfc/f;->d(C)Lfc/f;

    .line 323
    .line 324
    .line 325
    sget-object v8, Lmd/b;->o:Lmd/b;

    .line 326
    .line 327
    iget-object v11, v2, Lmd/e;->g:Lmd/f;

    .line 328
    .line 329
    invoke-virtual {v11, v8}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    check-cast v8, Lnd/y;

    .line 334
    .line 335
    if-eqz v8, :cond_e

    .line 336
    .line 337
    iget-object v8, v8, Lnd/y;->g:Lud/r;

    .line 338
    .line 339
    goto :goto_2

    .line 340
    :cond_e
    move-object v8, v2

    .line 341
    :goto_2
    invoke-virtual {v1, v8}, Lfc/f;->k(Lhc/c;)V

    .line 342
    .line 343
    .line 344
    iget-object v8, v8, Lud/r;->k:Lod/d;

    .line 345
    .line 346
    iget-object v8, v8, Lod/d;->n:Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v1, v8}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 349
    .line 350
    .line 351
    :goto_3
    const/16 v8, 0x28

    .line 352
    .line 353
    invoke-virtual {v1, v8}, Lfc/f;->d(C)Lfc/f;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Lud/r;->S()Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v4}, Lod/d;->f()Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-eqz v4, :cond_11

    .line 365
    .line 366
    sget-object v4, Lmd/b;->e:Lmd/b;

    .line 367
    .line 368
    iget-object v11, v5, Lmd/e;->g:Lmd/f;

    .line 369
    .line 370
    invoke-virtual {v11, v4}, Lmd/f;->b(Loc/a;)Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eqz v4, :cond_11

    .line 375
    .line 376
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    const/4 v11, 0x2

    .line 381
    if-ne v4, v11, :cond_f

    .line 382
    .line 383
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 384
    .line 385
    goto :goto_4

    .line 386
    :cond_f
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-le v4, v11, :cond_10

    .line 391
    .line 392
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    invoke-interface {v8, v11, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    goto :goto_4

    .line 401
    :cond_10
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    new-instance v11, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    const-string v13, "Incorrect number of args for enum constructor: "

    .line 408
    .line 409
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v4, " (expected >= 2)"

    .line 416
    .line 417
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    invoke-virtual {v2, v4}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_11
    sget-object v4, Lmd/a;->E:Lmd/a;

    .line 429
    .line 430
    iget-object v11, v2, Lmd/e;->g:Lmd/f;

    .line 431
    .line 432
    invoke-virtual {v11, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-eqz v4, :cond_12

    .line 437
    .line 438
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    invoke-interface {v8, v6, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    :cond_12
    :goto_4
    sget-object v4, Loc/c;->g:Loc/c;

    .line 447
    .line 448
    iget-object v11, v2, Lmd/e;->g:Lmd/f;

    .line 449
    .line 450
    invoke-virtual {v11, v4}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    check-cast v4, Lpc/c;

    .line 455
    .line 456
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    move v11, v7

    .line 461
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v13

    .line 465
    if-eqz v13, :cond_1f

    .line 466
    .line 467
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v13

    .line 471
    check-cast v13, Lqd/r;

    .line 472
    .line 473
    iget-object v14, v13, Lqd/r;->m:Lqd/s;

    .line 474
    .line 475
    if-nez v14, :cond_14

    .line 476
    .line 477
    iget-boolean v15, v10, Lfd/a;->d:Z

    .line 478
    .line 479
    new-instance v12, Lqd/k;

    .line 480
    .line 481
    invoke-direct {v12}, Lqd/k;-><init>()V

    .line 482
    .line 483
    .line 484
    iget-object v7, v13, Lqd/l;->i:Lqd/j;

    .line 485
    .line 486
    iput-object v7, v12, Lqd/k;->b:Lqd/j;

    .line 487
    .line 488
    invoke-virtual {v13}, Lqd/r;->getName()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    iput-object v7, v12, Lqd/k;->a:Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v13}, Lqd/l;->N()Z

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    iput-boolean v7, v12, Lqd/k;->e:Z

    .line 499
    .line 500
    iput-boolean v6, v12, Lqd/k;->f:Z

    .line 501
    .line 502
    invoke-virtual {v13}, Lqd/l;->N()Z

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    iput-boolean v7, v12, Lqd/k;->e:Z

    .line 507
    .line 508
    if-eqz v15, :cond_13

    .line 509
    .line 510
    new-instance v7, Lqd/s;

    .line 511
    .line 512
    iget v15, v13, Lqd/r;->l:I

    .line 513
    .line 514
    move/from16 v16, v6

    .line 515
    .line 516
    const/4 v6, 0x0

    .line 517
    invoke-direct {v7, v15, v6, v13}, Lqd/s;-><init>(IILqd/r;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    iput-object v7, v12, Lqd/k;->c:Ljava/util/List;

    .line 525
    .line 526
    goto :goto_6

    .line 527
    :cond_13
    move/from16 v16, v6

    .line 528
    .line 529
    const/4 v6, 0x0

    .line 530
    goto :goto_6

    .line 531
    :cond_14
    move/from16 v16, v6

    .line 532
    .line 533
    move v6, v7

    .line 534
    invoke-virtual {v14}, Lqd/s;->b()Lqd/k;

    .line 535
    .line 536
    .line 537
    move-result-object v12

    .line 538
    :goto_6
    if-eqz v4, :cond_17

    .line 539
    .line 540
    iget-object v7, v4, Lpc/c;->g:Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 543
    .line 544
    .line 545
    move-result v15

    .line 546
    if-lt v11, v15, :cond_15

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_15
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    check-cast v7, Lpc/d;

    .line 554
    .line 555
    if-eqz v7, :cond_17

    .line 556
    .line 557
    iget-object v7, v7, Lpc/d;->g:Ljava/util/HashMap;

    .line 558
    .line 559
    invoke-virtual {v7}, Ljava/util/HashMap;->isEmpty()Z

    .line 560
    .line 561
    .line 562
    move-result v15

    .line 563
    if-eqz v15, :cond_16

    .line 564
    .line 565
    goto :goto_8

    .line 566
    :cond_16
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 567
    .line 568
    .line 569
    move-result-object v7

    .line 570
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 575
    .line 576
    .line 577
    move-result v15

    .line 578
    if-eqz v15, :cond_17

    .line 579
    .line 580
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v15

    .line 584
    check-cast v15, Lnc/b;

    .line 585
    .line 586
    invoke-virtual {v3, v1, v15}, Lb/e;->s(Lfc/f;Lnc/b;)V

    .line 587
    .line 588
    .line 589
    const/16 v15, 0x20

    .line 590
    .line 591
    invoke-virtual {v1, v15}, Lfc/f;->d(C)Lfc/f;

    .line 592
    .line 593
    .line 594
    goto :goto_7

    .line 595
    :cond_17
    :goto_8
    iget-boolean v7, v12, Lqd/k;->d:Z

    .line 596
    .line 597
    if-eqz v7, :cond_18

    .line 598
    .line 599
    const-string v7, "final "

    .line 600
    .line 601
    invoke-virtual {v1, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 602
    .line 603
    .line 604
    :cond_18
    iget-object v7, v12, Lqd/k;->b:Lqd/j;

    .line 605
    .line 606
    if-eqz v7, :cond_19

    .line 607
    .line 608
    sget-object v15, Lqd/j;->u:Lqd/h;

    .line 609
    .line 610
    if-ne v7, v15, :cond_1a

    .line 611
    .line 612
    :cond_19
    iget-object v7, v13, Lqd/l;->i:Lqd/j;

    .line 613
    .line 614
    :cond_1a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 615
    .line 616
    .line 617
    move-result v13

    .line 618
    if-nez v13, :cond_1c

    .line 619
    .line 620
    iget-object v13, v2, Lud/r;->m:Lb5/k;

    .line 621
    .line 622
    iget v13, v13, Lb5/k;->b:I

    .line 623
    .line 624
    and-int/lit16 v13, v13, 0x80

    .line 625
    .line 626
    if-eqz v13, :cond_1c

    .line 627
    .line 628
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    instance-of v13, v7, Lqd/a;

    .line 632
    .line 633
    if-eqz v13, :cond_1b

    .line 634
    .line 635
    invoke-virtual {v7}, Lqd/j;->g()Lqd/j;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    invoke-virtual {v10, v1, v7}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 640
    .line 641
    .line 642
    const-string v7, "..."

    .line 643
    .line 644
    invoke-virtual {v1, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 645
    .line 646
    .line 647
    :goto_9
    const/16 v15, 0x20

    .line 648
    .line 649
    goto :goto_a

    .line 650
    :cond_1b
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v13

    .line 654
    const-string v15, "Last argument in varargs method is not array: "

    .line 655
    .line 656
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v13

    .line 660
    invoke-virtual {v2, v13}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v10, v1, v7}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 664
    .line 665
    .line 666
    goto :goto_9

    .line 667
    :cond_1c
    invoke-virtual {v10, v1, v7}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 668
    .line 669
    .line 670
    goto :goto_9

    .line 671
    :goto_a
    invoke-virtual {v1, v15}, Lfc/f;->d(C)Lfc/f;

    .line 672
    .line 673
    .line 674
    iget-object v7, v0, Lfd/g;->d:Lfd/h;

    .line 675
    .line 676
    invoke-virtual {v7, v12}, Lfd/h;->a(Lqd/k;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    instance-of v13, v1, Lfc/b;

    .line 681
    .line 682
    if-eqz v13, :cond_1d

    .line 683
    .line 684
    if-eqz v14, :cond_1d

    .line 685
    .line 686
    invoke-virtual {v12}, Lqd/k;->a()Lqd/s;

    .line 687
    .line 688
    .line 689
    move-result-object v12

    .line 690
    invoke-static {v2, v12}, Lic/d;->a(Lud/r;Lqd/s;)Lic/d;

    .line 691
    .line 692
    .line 693
    move-result-object v12

    .line 694
    invoke-virtual {v1, v12}, Lfc/f;->k(Lhc/c;)V

    .line 695
    .line 696
    .line 697
    :cond_1d
    invoke-virtual {v1, v7}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 698
    .line 699
    .line 700
    add-int/lit8 v11, v11, 0x1

    .line 701
    .line 702
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    if-eqz v7, :cond_1e

    .line 707
    .line 708
    invoke-virtual {v1, v9}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 709
    .line 710
    .line 711
    :cond_1e
    move v7, v6

    .line 712
    move v12, v15

    .line 713
    move/from16 v6, v16

    .line 714
    .line 715
    goto/16 :goto_5

    .line 716
    .line 717
    :cond_1f
    move/from16 v16, v6

    .line 718
    .line 719
    const/16 v4, 0x29

    .line 720
    .line 721
    invoke-virtual {v1, v4}, Lfc/f;->d(C)Lfc/f;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2}, Lud/r;->s()Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    if-nez v6, :cond_21

    .line 733
    .line 734
    const-string v6, " throws "

    .line 735
    .line 736
    invoke-virtual {v1, v6}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 737
    .line 738
    .line 739
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    :cond_20
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    if-eqz v6, :cond_21

    .line 748
    .line 749
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    check-cast v6, Lqd/j;

    .line 754
    .line 755
    iget-object v7, v3, Lb/e;->i:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v7, Lfd/a;

    .line 758
    .line 759
    invoke-virtual {v7, v1, v6}, Lfd/a;->s(Lfc/f;Lqd/j;)V

    .line 760
    .line 761
    .line 762
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    if-eqz v6, :cond_20

    .line 767
    .line 768
    invoke-virtual {v1, v9}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 769
    .line 770
    .line 771
    goto :goto_b

    .line 772
    :cond_21
    iget-object v4, v5, Lud/e;->o:Lb5/k;

    .line 773
    .line 774
    iget v4, v4, Lb5/k;->b:I

    .line 775
    .line 776
    and-int/lit16 v4, v4, 0x2000

    .line 777
    .line 778
    if-eqz v4, :cond_23

    .line 779
    .line 780
    sget-object v4, Loc/c;->h:Loc/c;

    .line 781
    .line 782
    iget-object v2, v2, Lmd/e;->g:Lmd/f;

    .line 783
    .line 784
    invoke-virtual {v2, v4}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    check-cast v2, Lpc/a;

    .line 789
    .line 790
    if-nez v2, :cond_22

    .line 791
    .line 792
    const/4 v2, 0x0

    .line 793
    goto :goto_c

    .line 794
    :cond_22
    iget-object v2, v2, Lpc/a;->g:Lnc/a;

    .line 795
    .line 796
    :goto_c
    if-eqz v2, :cond_23

    .line 797
    .line 798
    const-string v4, " default "

    .line 799
    .line 800
    invoke-virtual {v1, v4}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 801
    .line 802
    .line 803
    iget-object v4, v5, Lud/e;->k:Lud/u;

    .line 804
    .line 805
    invoke-virtual {v3, v4, v1, v2}, Lb/e;->q(Lud/u;Lfc/f;Lnc/a;)V

    .line 806
    .line 807
    .line 808
    :cond_23
    return v16
.end method

.method public final c(Lfc/f;I)V
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, Lfd/g;->a:Lud/r;

    .line 3
    .line 4
    if-ne p2, v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Lud/r;->n()Lud/u;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lud/u;->a:Lbc/g;

    .line 11
    .line 12
    iget-object v0, v0, Lbc/g;->H:Lbc/a;

    .line 13
    .line 14
    sget-object v2, Lbc/a;->l:Lbc/a;

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    iget v0, v1, Lud/r;->o:I

    .line 19
    .line 20
    int-to-long v2, v0

    .line 21
    const-wide/16 v4, 0xc8

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 28
    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v0, "Method dump skipped, instruction units count: "

    .line 33
    .line 34
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p1, p2}, Lfc/f;->r(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    instance-of p2, p1, Lfc/b;

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    const-string p2, "To view this dump change \'Code comments level\' option to \'DEBUG\'"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lfc/f;->r(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p2, "To view this dump add \'--comments-level debug\' option"

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lfc/f;->r(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    const/4 v0, 0x1

    .line 67
    if-eq p2, v0, :cond_3

    .line 68
    .line 69
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 70
    .line 71
    iget-object v2, v1, Lmd/e;->g:Lmd/f;

    .line 72
    .line 73
    invoke-virtual {v2, v0}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :try_start_0
    invoke-virtual {v1}, Lud/r;->e0()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lud/r;->a0()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ldd/a;->a()Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lbe/a;

    .line 102
    .line 103
    invoke-static {v3, v1}, Lbe/h;->i0(Lbe/a;Lud/r;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_3

    .line 109
    :catch_0
    move-exception p2

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    new-instance v2, Lfd/f;

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-direct {v2, p0, v3}, Lfd/f;-><init>(Lfd/g;I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    new-instance v2, Lfd/f;

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    invoke-direct {v2, p0, v3}, Lfd/f;-><init>(Lfd/g;I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :goto_2
    :try_start_1
    sget-object v1, Lfd/g;->e:Lmh/b;

    .line 131
    .line 132
    const-string v2, "Error reload instructions in fallback mode:"

    .line 133
    .line 134
    invoke-interface {v1, v2, p2}, Lmh/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v2, "// Can\'t load method instructions: "

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p1, p2}, Lfc/f;->r(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    .line 160
    .line 161
    new-instance p1, Lfd/f;

    .line 162
    .line 163
    const/4 p2, 0x1

    .line 164
    invoke-direct {p1, p0, p2}, Lfd/f;-><init>(Lfd/g;I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :goto_3
    new-instance p2, Lfd/f;

    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    invoke-direct {p2, p0, v1}, Lfd/f;-><init>(Lfd/g;I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_3
    :goto_4
    iget-object v0, v1, Lud/r;->y:[Lud/p;

    .line 182
    .line 183
    if-nez v0, :cond_4

    .line 184
    .line 185
    const-string p2, "// Can\'t load method instructions."

    .line 186
    .line 187
    invoke-virtual {p1, p2}, Lfc/f;->r(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_4
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 192
    .line 193
    .line 194
    iget-object v2, v1, Lud/r;->w:Lqd/r;

    .line 195
    .line 196
    if-eqz v2, :cond_7

    .line 197
    .line 198
    iget-object v3, p0, Lfd/g;->d:Lfd/h;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Lqd/r;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    if-eqz v4, :cond_5

    .line 208
    .line 209
    iget-boolean v3, v3, Lfd/h;->g:Z

    .line 210
    .line 211
    if-eqz v3, :cond_6

    .line 212
    .line 213
    :cond_5
    iget v2, v2, Lqd/r;->l:I

    .line 214
    .line 215
    const-string v3, "r"

    .line 216
    .line 217
    invoke-static {v2, v3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    :cond_6
    invoke-virtual {p1, v4}, Lfc/f;->r(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const-string v2, " = this;"

    .line 225
    .line 226
    invoke-virtual {p1, v2}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 227
    .line 228
    .line 229
    :cond_7
    iget v2, p1, Lfc/f;->c:I

    .line 230
    .line 231
    invoke-static {v1}, Lfd/g;->h(Lud/r;)Lfd/g;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    new-instance v3, Lfd/e;

    .line 236
    .line 237
    const/4 v4, 0x1

    .line 238
    invoke-direct {v3, v1, v4}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 239
    .line 240
    .line 241
    array-length v5, v0

    .line 242
    const/4 v6, 0x0

    .line 243
    const/4 v7, 0x0

    .line 244
    move v8, v7

    .line 245
    :goto_5
    if-ge v8, v5, :cond_13

    .line 246
    .line 247
    aget-object v9, v0, v8

    .line 248
    .line 249
    if-nez v9, :cond_8

    .line 250
    .line 251
    goto/16 :goto_c

    .line 252
    .line 253
    :cond_8
    iget-object v10, v9, Lmd/e;->g:Lmd/f;

    .line 254
    .line 255
    sget-object v11, Lmd/b;->c:Lmd/b;

    .line 256
    .line 257
    invoke-virtual {v10, v11}, Lmd/f;->b(Loc/a;)Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_9

    .line 262
    .line 263
    iget-object v6, v9, Lmd/e;->g:Lmd/f;

    .line 264
    .line 265
    invoke-virtual {v6, v11}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    if-eqz v10, :cond_12

    .line 278
    .line 279
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    check-cast v10, Lnd/p;

    .line 284
    .line 285
    const-string v11, "// "

    .line 286
    .line 287
    invoke-virtual {p1, v11}, Lfc/f;->r(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v10, v10, Lnd/p;->g:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {p1, v10}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_9
    const/4 v10, 0x2

    .line 297
    if-eq p2, v10, :cond_c

    .line 298
    .line 299
    sget-object v10, Lmd/b;->E:Lmd/b;

    .line 300
    .line 301
    iget-object v11, v9, Lmd/e;->g:Lmd/f;

    .line 302
    .line 303
    invoke-virtual {v11, v10}, Lmd/f;->b(Loc/a;)Z

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    if-eqz v10, :cond_a

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_a
    iget-object v10, v9, Lmd/e;->g:Lmd/f;

    .line 311
    .line 312
    sget-object v11, Lmd/b;->H:Lmd/b;

    .line 313
    .line 314
    invoke-virtual {v10, v11}, Lmd/f;->b(Loc/a;)Z

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    if-eqz v10, :cond_c

    .line 319
    .line 320
    if-eqz v6, :cond_b

    .line 321
    .line 322
    iget-object v10, v6, Lud/p;->k:Lpd/k;

    .line 323
    .line 324
    sget-object v12, Lpd/k;->v:Lpd/k;

    .line 325
    .line 326
    if-ne v10, v12, :cond_b

    .line 327
    .line 328
    iget-object v10, v9, Lmd/e;->g:Lmd/f;

    .line 329
    .line 330
    invoke-virtual {v10, v11}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-ne v11, v4, :cond_b

    .line 339
    .line 340
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    check-cast v10, Lnd/q;

    .line 345
    .line 346
    iget v11, v10, Lnd/q;->a:I

    .line 347
    .line 348
    iget v12, v6, Lud/p;->n:I

    .line 349
    .line 350
    if-ne v11, v12, :cond_b

    .line 351
    .line 352
    iget v10, v10, Lnd/q;->b:I

    .line 353
    .line 354
    iget v11, v9, Lud/p;->n:I

    .line 355
    .line 356
    if-ne v10, v11, :cond_b

    .line 357
    .line 358
    check-cast v6, Lpd/i;

    .line 359
    .line 360
    invoke-virtual {v6}, Lpd/i;->k0()I

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    iget v10, v9, Lud/p;->n:I

    .line 365
    .line 366
    if-ne v10, v6, :cond_c

    .line 367
    .line 368
    :cond_b
    :goto_7
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 369
    .line 370
    .line 371
    iget v6, v9, Lud/p;->n:I

    .line 372
    .line 373
    invoke-static {v6}, Lfd/g;->i(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    const-string v10, ":"

    .line 378
    .line 379
    invoke-virtual {v6, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-virtual {p1, v6}, Lfc/f;->r(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 387
    .line 388
    .line 389
    :cond_c
    iget-object v6, v9, Lud/p;->k:Lpd/k;

    .line 390
    .line 391
    sget-object v10, Lpd/k;->Q:Lpd/k;

    .line 392
    .line 393
    if-ne v6, v10, :cond_d

    .line 394
    .line 395
    goto/16 :goto_b

    .line 396
    .line 397
    :cond_d
    const/4 v10, 0x3

    .line 398
    const-string v11, "*/"

    .line 399
    .line 400
    if-ne p2, v10, :cond_e

    .line 401
    .line 402
    :try_start_2
    sget-object v10, Lpd/k;->h:Lpd/k;

    .line 403
    .line 404
    if-ne v6, v10, :cond_e

    .line 405
    .line 406
    move-object v6, v9

    .line 407
    check-cast v6, Lpd/d;

    .line 408
    .line 409
    iget-object v6, v6, Lpd/d;->o:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v6, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    goto :goto_8

    .line 416
    :cond_e
    move v6, v7

    .line 417
    :goto_8
    if-eqz v6, :cond_f

    .line 418
    .line 419
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1, v11}, Lfc/f;->r(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    const-string v10, "//  "

    .line 426
    .line 427
    invoke-virtual {p1, v10}, Lfc/f;->r(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_9

    .line 431
    :catch_1
    move-exception v6

    .line 432
    goto :goto_a

    .line 433
    :cond_f
    iget v10, v9, Lnd/r;->i:I

    .line 434
    .line 435
    invoke-virtual {p1, v10}, Lfc/f;->s(I)V

    .line 436
    .line 437
    .line 438
    :goto_9
    invoke-static {p1, v9}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 439
    .line 440
    .line 441
    iget-object v10, v9, Lud/p;->l:Lqd/r;

    .line 442
    .line 443
    if-eqz v10, :cond_10

    .line 444
    .line 445
    iget-object v10, v10, Lqd/l;->i:Lqd/j;

    .line 446
    .line 447
    invoke-virtual {v10}, Lqd/j;->w()Z

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    if-eqz v11, :cond_10

    .line 452
    .line 453
    invoke-virtual {v10}, Lqd/j;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v10

    .line 457
    invoke-virtual {p1, v10}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 458
    .line 459
    .line 460
    move-result-object v10

    .line 461
    const/16 v11, 0x20

    .line 462
    .line 463
    invoke-virtual {v10, v11}, Lfc/f;->d(C)Lfc/f;

    .line 464
    .line 465
    .line 466
    :cond_10
    sget-object v10, Lfd/d;->i:Lfd/d;

    .line 467
    .line 468
    invoke-virtual {v3, v9, p1, v10}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V

    .line 469
    .line 470
    .line 471
    if-eqz v6, :cond_11

    .line 472
    .line 473
    const-string v6, "/*"

    .line 474
    .line 475
    invoke-virtual {p1, v6}, Lfc/f;->r(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 479
    .line 480
    .line 481
    :cond_11
    invoke-virtual {v1, p1, v9, v4}, Lfd/g;->a(Lfc/f;Lud/p;Z)V

    .line 482
    .line 483
    .line 484
    iget-object v6, v1, Lfd/g;->a:Lud/r;

    .line 485
    .line 486
    invoke-static {p1, v6, v9}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 487
    .line 488
    .line 489
    goto :goto_b

    .line 490
    :goto_a
    const-string v10, "Error generate fallback instruction: "

    .line 491
    .line 492
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    sget-object v11, Lfd/g;->e:Lmh/b;

    .line 497
    .line 498
    invoke-interface {v11, v10, v6}, Lmh/b;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 499
    .line 500
    .line 501
    iput v2, p1, Lfc/f;->c:I

    .line 502
    .line 503
    invoke-virtual {p1}, Lfc/f;->t()V

    .line 504
    .line 505
    .line 506
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    const-string v10, "// error: "

    .line 511
    .line 512
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    invoke-virtual {p1, v6}, Lfc/f;->r(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    :cond_12
    :goto_b
    move-object v6, v9

    .line 520
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 521
    .line 522
    goto/16 :goto_5

    .line 523
    .line 524
    :cond_13
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 525
    .line 526
    .line 527
    return-void
.end method

.method public final d(Lfc/f;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lfd/g;->a:Lud/r;

    .line 2
    .line 3
    iget-object v1, v0, Lud/r;->l:Lud/e;

    .line 4
    .line 5
    iget-object v2, v1, Lud/e;->k:Lud/u;

    .line 6
    .line 7
    iget-object v2, v2, Lud/u;->a:Lbc/g;

    .line 8
    .line 9
    invoke-virtual {v1}, Lud/e;->a0()Lud/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v3, Lmd/b;->j:Lmd/b;

    .line 14
    .line 15
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_7

    .line 22
    .line 23
    iget-object v1, v2, Lbc/g;->E:Lbc/b;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eq v1, v2, :cond_3

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v1, v3, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-eq v1, v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p0, p1, v2}, Lfd/g;->c(Lfc/f;I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget-object v1, v0, Lud/r;->z:Ljava/util/List;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    const-string v0, "// Blocks not ready for simple mode, using fallback"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v2}, Lfd/g;->c(Lfc/f;I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v1, v0, Lud/r;->l:Lud/e;

    .line 59
    .line 60
    iget-object v1, v1, Lud/e;->k:Lud/u;

    .line 61
    .line 62
    iget-object v1, v1, Lud/u;->a:Lbc/g;

    .line 63
    .line 64
    iget-object v2, v1, Lbc/g;->m:Lae/d;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v2, Lfc/b;

    .line 70
    .line 71
    invoke-direct {v2, v1}, Lfc/b;-><init>(Lbc/g;)V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget v1, p1, Lfc/f;->c:I

    .line 75
    .line 76
    iput v1, v2, Lfc/f;->c:I

    .line 77
    .line 78
    invoke-virtual {v2}, Lfc/f;->t()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v2}, Lfd/g;->g(Lfc/b;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Lfc/f;->c(Lfc/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catch_0
    move-exception v1

    .line 89
    const-string v2, "Simple mode code generation failed"

    .line 90
    .line 91
    invoke-static {v0, v2, v1}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v2, v1}, Ljd/c;->c(Lfc/f;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lfd/g;->f(Lfc/f;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    invoke-virtual {p0, p1}, Lfd/g;->e(Lfc/f;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_4
    iget-object v1, p0, Lfd/g;->b:Lfd/a;

    .line 106
    .line 107
    iget-boolean v1, v1, Lfd/a;->d:Z

    .line 108
    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    iget-object v0, v0, Lud/r;->G:Lxd/b;

    .line 112
    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    invoke-virtual {p0, p1}, Lfd/g;->e(Lfc/f;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_6
    :goto_0
    invoke-virtual {p0, p1}, Lfd/g;->f(Lfc/f;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    invoke-static {}, Lah/a;->d()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final e(Lfc/f;)V
    .locals 5

    .line 1
    const-string v0, "Method code generation error"

    .line 2
    .line 3
    iget-object v1, p0, Lfd/g;->a:Lud/r;

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Lfd/i;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, p0, v3}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v3, v1, Lud/r;->G:Lxd/b;

    .line 12
    .line 13
    invoke-virtual {v2, p1, v3}, Lfd/i;->u(Lfc/f;Lud/j;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v2

    .line 18
    iget-object v3, v1, Lud/r;->l:Lud/e;

    .line 19
    .line 20
    invoke-virtual {v3}, Lud/e;->a0()Lud/e;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget-object v4, Lmd/a;->f0:Lmd/a;

    .line 25
    .line 26
    iget-object v3, v3, Lmd/e;->g:Lmd/f;

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    invoke-static {v1, v0, v2}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1}, Ljd/c;->d(Lfc/f;Lnd/b0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lfd/g;->f(Lfc/f;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    throw v2

    .line 45
    :catch_1
    new-instance v2, Laf/f;

    .line 46
    .line 47
    const-string v3, "StackOverflow"

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0, v2}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v1}, Ljd/c;->d(Lfc/f;Lnd/b0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lfd/g;->f(Lfc/f;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void
.end method

.method public final f(Lfc/f;)V
    .locals 3

    .line 1
    sget-object v0, Lbc/a;->i:Lbc/a;

    .line 2
    .line 3
    iget-object v1, p0, Lfd/g;->a:Lud/r;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lnd/b0;->N(Lbc/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v2, v1, Lud/r;->k:Lod/d;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "/*"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    invoke-virtual {p0, p1, v0}, Lfd/g;->c(Lfc/f;I)V

    .line 20
    .line 21
    .line 22
    const-string v0, "*/"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const-string v0, "throw new UnsupportedOperationException(\"Method not decompiled: "

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lud/r;->l:Lud/e;

    .line 33
    .line 34
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 35
    .line 36
    invoke-virtual {v0}, Lod/a;->f()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/16 v0, 0x2e

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v0, v2, Lod/d;->n:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 v0, 0x28

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lfc/f;->d(C)Lfc/f;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, v2, Lod/d;->i:Ljava/util/List;

    .line 63
    .line 64
    const-string v1, ", "

    .line 65
    .line 66
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "):"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v0, v2, Lod/d;->h:Lqd/j;

    .line 81
    .line 82
    invoke-virtual {v0}, Lqd/j;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string v0, "\");"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final g(Lfc/b;)V
    .locals 14

    .line 1
    new-instance v0, Lb5/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfd/g;->a:Lud/r;

    .line 7
    .line 8
    iput-object v1, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v1}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v1}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/util/BitSet;

    .line 25
    .line 26
    iget-object v3, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ljava/util/BitSet;

    .line 29
    .line 30
    iget-object v4, v1, Lud/r;->z:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Lud/a;

    .line 49
    .line 50
    iget-object v8, v5, Lud/a;->l:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_0

    .line 57
    .line 58
    iget-object v8, v5, Lud/a;->m:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-lez v8, :cond_0

    .line 65
    .line 66
    iget-object v8, v5, Lud/a;->n:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-ne v8, v7, :cond_0

    .line 73
    .line 74
    iget-object v8, v5, Lud/a;->n:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Lud/a;

    .line 81
    .line 82
    iget-object v9, v5, Lud/a;->m:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v5, v8}, Lce/m;->p(Lud/a;Lud/a;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-ne v10, v7, :cond_1

    .line 92
    .line 93
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lud/a;

    .line 98
    .line 99
    invoke-static {v6, v5, v8}, Lce/m;->r(Lud/a;Lud/a;Lud/a;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_2

    .line 117
    .line 118
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Lud/a;

    .line 123
    .line 124
    invoke-static {v7, v5, v8}, Lce/m;->r(Lud/a;Lud/a;Lud/a;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    :goto_2
    sget-object v6, Lmd/a;->u:Lmd/a;

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Lmd/e;->w(Lmd/a;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    invoke-static {v1}, Lce/l;->o(Lud/r;)V

    .line 135
    .line 136
    .line 137
    new-instance v4, Ljava/util/ArrayList;

    .line 138
    .line 139
    iget-object v5, v1, Lud/r;->z:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    new-instance v5, Lbe/m0;

    .line 149
    .line 150
    const/4 v8, 0x3

    .line 151
    invoke-direct {v5, v8, v4}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 152
    .line 153
    .line 154
    iget-object v8, v1, Lud/r;->B:Lud/a;

    .line 155
    .line 156
    new-instance v9, Lae/d;

    .line 157
    .line 158
    const/16 v10, 0x1c

    .line 159
    .line 160
    invoke-direct {v9, v10}, Lae/d;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v8, v9, v5}, La/a;->d1(Lud/r;Lud/a;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    .line 164
    .line 165
    .line 166
    new-instance v5, Lbe/i;

    .line 167
    .line 168
    const/16 v8, 0xe

    .line 169
    .line 170
    invoke-direct {v5, v0, v8}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 174
    .line 175
    .line 176
    iget-object v0, v1, Lud/r;->E:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_4
    iget-object v0, v1, Lud/r;->E:Ljava/util/List;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_7

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Lae/f;

    .line 202
    .line 203
    iget-object v5, v5, Lae/f;->c:Lud/a;

    .line 204
    .line 205
    if-eqz v5, :cond_5

    .line 206
    .line 207
    sget-object v8, Lce/m;->g:Ljava/util/EnumSet;

    .line 208
    .line 209
    iget-object v8, v5, Lud/a;->m:Ljava/util/List;

    .line 210
    .line 211
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-eqz v9, :cond_6

    .line 220
    .line 221
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    check-cast v9, Lud/a;

    .line 226
    .line 227
    iget-object v9, v9, Lud/a;->n:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v9, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_6
    iget-object v5, v5, Lud/a;->m:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    :goto_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    const/4 v5, 0x0

    .line 244
    if-eqz v0, :cond_8

    .line 245
    .line 246
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 247
    .line 248
    goto/16 :goto_c

    .line 249
    .line 250
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    move-object v9, v5

    .line 255
    move v8, v6

    .line 256
    :goto_6
    if-ge v8, v0, :cond_12

    .line 257
    .line 258
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    check-cast v10, Lud/a;

    .line 263
    .line 264
    add-int/lit8 v8, v8, 0x1

    .line 265
    .line 266
    if-ne v8, v0, :cond_9

    .line 267
    .line 268
    move-object v11, v5

    .line 269
    goto :goto_7

    .line 270
    :cond_9
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    check-cast v11, Lud/a;

    .line 275
    .line 276
    :goto_7
    iget-object v12, v10, Lud/a;->m:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v13

    .line 282
    if-le v13, v7, :cond_a

    .line 283
    .line 284
    iget v9, v10, Lud/a;->j:I

    .line 285
    .line 286
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->set(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_a
    if-ne v13, v7, :cond_c

    .line 291
    .line 292
    if-eqz v9, :cond_c

    .line 293
    .line 294
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    invoke-virtual {v9, v12}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v12

    .line 302
    if-nez v12, :cond_c

    .line 303
    .line 304
    sget-object v12, Lmd/a;->B:Lmd/a;

    .line 305
    .line 306
    iget-object v13, v10, Lmd/e;->g:Lmd/f;

    .line 307
    .line 308
    invoke-virtual {v13, v12}, Lmd/f;->a(Lmd/a;)Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-nez v12, :cond_b

    .line 313
    .line 314
    iget v12, v10, Lud/a;->j:I

    .line 315
    .line 316
    invoke-virtual {v3, v12}, Ljava/util/BitSet;->set(I)V

    .line 317
    .line 318
    .line 319
    :cond_b
    iget-object v12, v9, Lud/a;->n:Ljava/util/List;

    .line 320
    .line 321
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 322
    .line 323
    .line 324
    move-result v12

    .line 325
    if-ne v12, v7, :cond_c

    .line 326
    .line 327
    invoke-virtual {v1, v9}, Lud/r;->Y(Lud/a;)Z

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    if-nez v12, :cond_c

    .line 332
    .line 333
    iget v9, v9, Lud/a;->j:I

    .line 334
    .line 335
    invoke-virtual {v2, v9}, Ljava/util/BitSet;->set(I)V

    .line 336
    .line 337
    .line 338
    :cond_c
    :goto_8
    invoke-static {v10}, La/a;->c0(Lud/h;)Lud/p;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    instance-of v12, v9, Lpd/t;

    .line 343
    .line 344
    if-eqz v12, :cond_f

    .line 345
    .line 346
    instance-of v12, v9, Lpd/i;

    .line 347
    .line 348
    if-eqz v12, :cond_e

    .line 349
    .line 350
    check-cast v9, Lpd/i;

    .line 351
    .line 352
    iget-object v12, v9, Lpd/i;->q:Lud/a;

    .line 353
    .line 354
    invoke-static {v11, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    if-eqz v13, :cond_d

    .line 359
    .line 360
    invoke-virtual {v9}, Lpd/i;->l0()V

    .line 361
    .line 362
    .line 363
    iget-object v12, v9, Lpd/i;->q:Lud/a;

    .line 364
    .line 365
    iget v12, v12, Lud/a;->j:I

    .line 366
    .line 367
    invoke-virtual {v3, v12}, Ljava/util/BitSet;->set(I)V

    .line 368
    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_d
    iget v12, v12, Lud/a;->j:I

    .line 372
    .line 373
    invoke-virtual {v3, v12}, Ljava/util/BitSet;->set(I)V

    .line 374
    .line 375
    .line 376
    :goto_9
    invoke-virtual {v9}, Lpd/i;->m0()V

    .line 377
    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_e
    iget-object v9, v10, Lud/a;->n:Ljava/util/List;

    .line 381
    .line 382
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    if-eqz v12, :cond_f

    .line 391
    .line 392
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v12

    .line 396
    check-cast v12, Lud/a;

    .line 397
    .line 398
    iget v12, v12, Lud/a;->j:I

    .line 399
    .line 400
    invoke-virtual {v3, v12}, Ljava/util/BitSet;->set(I)V

    .line 401
    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_f
    :goto_b
    sget-object v9, Lmd/b;->E:Lmd/b;

    .line 405
    .line 406
    iget-object v12, v10, Lmd/e;->g:Lmd/f;

    .line 407
    .line 408
    invoke-virtual {v12, v9}, Lmd/f;->b(Loc/a;)Z

    .line 409
    .line 410
    .line 411
    move-result v9

    .line 412
    if-eqz v9, :cond_10

    .line 413
    .line 414
    iget v9, v10, Lud/a;->j:I

    .line 415
    .line 416
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->set(I)V

    .line 417
    .line 418
    .line 419
    :cond_10
    if-nez v11, :cond_11

    .line 420
    .line 421
    invoke-virtual {v1, v10}, Lud/r;->Y(Lud/a;)Z

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    if-nez v9, :cond_11

    .line 426
    .line 427
    iget v9, v10, Lud/a;->j:I

    .line 428
    .line 429
    invoke-virtual {v2, v9}, Ljava/util/BitSet;->set(I)V

    .line 430
    .line 431
    .line 432
    :cond_11
    move-object v9, v10

    .line 433
    goto/16 :goto_6

    .line 434
    .line 435
    :cond_12
    invoke-virtual {v1}, Lud/r;->Z()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_13

    .line 440
    .line 441
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    sub-int/2addr v0, v7

    .line 446
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    check-cast v8, Lud/a;

    .line 451
    .line 452
    sget-object v9, Lmd/a;->n:Lmd/a;

    .line 453
    .line 454
    iget-object v8, v8, Lmd/e;->g:Lmd/f;

    .line 455
    .line 456
    invoke-virtual {v8, v9}, Lmd/f;->a(Lmd/a;)Z

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    if-eqz v8, :cond_13

    .line 461
    .line 462
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    :cond_13
    :goto_c
    new-instance v0, Lfd/e;

    .line 466
    .line 467
    invoke-direct {v0, p0, v7}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 468
    .line 469
    .line 470
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    :cond_14
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    if-eqz v8, :cond_1a

    .line 479
    .line 480
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    check-cast v8, Lud/a;

    .line 485
    .line 486
    iget-object v9, v8, Lmd/e;->g:Lmd/f;

    .line 487
    .line 488
    sget-object v10, Lmd/a;->s:Lmd/a;

    .line 489
    .line 490
    invoke-virtual {v9, v10}, Lmd/f;->a(Lmd/a;)Z

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    if-eqz v9, :cond_15

    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_15
    iget v9, v8, Lud/a;->j:I

    .line 498
    .line 499
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->get(I)Z

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    if-eqz v9, :cond_16

    .line 504
    .line 505
    invoke-virtual {p1}, Lfc/f;->n()V

    .line 506
    .line 507
    .line 508
    invoke-static {v8}, Lfd/g;->j(Lud/a;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    invoke-virtual {p1, v9}, Lfc/f;->r(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    const/16 v9, 0x3a

    .line 516
    .line 517
    invoke-virtual {p1, v9}, Lfc/b;->d(C)Lfc/f;

    .line 518
    .line 519
    .line 520
    invoke-virtual {p1}, Lfc/f;->o()V

    .line 521
    .line 522
    .line 523
    :cond_16
    iget-object v9, v8, Lud/a;->l:Ljava/util/ArrayList;

    .line 524
    .line 525
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    :cond_17
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    if-eqz v11, :cond_19

    .line 534
    .line 535
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v11

    .line 539
    check-cast v11, Lud/p;

    .line 540
    .line 541
    iget-object v12, v11, Lmd/e;->g:Lmd/f;

    .line 542
    .line 543
    invoke-virtual {v12, v10}, Lmd/f;->a(Lmd/a;)Z

    .line 544
    .line 545
    .line 546
    move-result v12

    .line 547
    if-nez v12, :cond_17

    .line 548
    .line 549
    iget-object v12, v11, Lud/p;->l:Lqd/r;

    .line 550
    .line 551
    if-eqz v12, :cond_18

    .line 552
    .line 553
    iget-object v12, v12, Lqd/r;->m:Lqd/s;

    .line 554
    .line 555
    invoke-virtual {v12}, Lqd/s;->b()Lqd/k;

    .line 556
    .line 557
    .line 558
    move-result-object v12

    .line 559
    iget-boolean v13, v12, Lqd/k;->f:Z

    .line 560
    .line 561
    if-nez v13, :cond_18

    .line 562
    .line 563
    sget-object v13, Lmd/a;->Q:Lmd/a;

    .line 564
    .line 565
    invoke-virtual {v11, v13}, Lmd/e;->w(Lmd/a;)V

    .line 566
    .line 567
    .line 568
    iput-boolean v7, v12, Lqd/k;->f:Z

    .line 569
    .line 570
    :cond_18
    invoke-static {p1, v11}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v11, p1, v5}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {p0, p1, v11, v6}, Lfd/g;->a(Lfc/f;Lud/p;Z)V

    .line 577
    .line 578
    .line 579
    invoke-static {p1, v1, v11}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 580
    .line 581
    .line 582
    goto :goto_e

    .line 583
    :cond_19
    iget v9, v8, Lud/a;->j:I

    .line 584
    .line 585
    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    if-eqz v9, :cond_14

    .line 590
    .line 591
    const-string v9, "goto "

    .line 592
    .line 593
    invoke-virtual {p1, v9}, Lfc/f;->r(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    iget-object v8, v8, Lud/a;->n:Ljava/util/List;

    .line 597
    .line 598
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    check-cast v8, Lud/a;

    .line 603
    .line 604
    invoke-static {v8}, Lfd/g;->j(Lud/a;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    invoke-virtual {p1, v8}, Lfc/b;->e(Ljava/lang/String;)Lfc/f;

    .line 609
    .line 610
    .line 611
    goto/16 :goto_d

    .line 612
    .line 613
    :cond_1a
    return-void
.end method
