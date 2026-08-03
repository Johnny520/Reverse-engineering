.class public final Lr4/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lp4/w;

.field public final b:Lp4/o;

.field public final c:Lz4/d;

.field public final d:Lr4/p;

.field public final e:I

.field public final f:I

.field public final g:Lw4/a;

.field public final h:Z

.field public i:I

.field public j:I

.field public k:Lz4/d;

.field public l:Ljava/lang/String;

.field public m:Z

.field public final n:[Lp4/n;


# direct methods
.method public constructor <init>(Lp4/w;Lp4/o;Lr4/p;IIZLv4/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lr4/n;->i:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lr4/n;->j:I

    .line 9
    .line 10
    iput-object p1, p0, Lr4/n;->a:Lp4/w;

    .line 11
    .line 12
    iput-object p2, p0, Lr4/n;->b:Lp4/o;

    .line 13
    .line 14
    iput-object p3, p0, Lr4/n;->d:Lr4/p;

    .line 15
    .line 16
    iget-object p1, p7, Lv4/e;->i:Lw4/a;

    .line 17
    .line 18
    iput-object p1, p0, Lr4/n;->g:Lw4/a;

    .line 19
    .line 20
    iput-boolean p6, p0, Lr4/n;->h:Z

    .line 21
    .line 22
    iput p4, p0, Lr4/n;->e:I

    .line 23
    .line 24
    iput p5, p0, Lr4/n;->f:I

    .line 25
    .line 26
    new-instance p1, Lz4/d;

    .line 27
    .line 28
    invoke-direct {p1}, Lz4/d;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lr4/n;->c:Lz4/d;

    .line 32
    .line 33
    new-array p1, p5, [Lp4/n;

    .line 34
    .line 35
    iput-object p1, p0, Lr4/n;->n:[Lp4/n;

    .line 36
    .line 37
    return-void
.end method

.method public static b(II)I
    .locals 2

    .line 1
    const/4 v0, -0x4

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0xa

    .line 5
    .line 6
    if-gt p0, v1, :cond_0

    .line 7
    .line 8
    sub-int/2addr p0, v0

    .line 9
    const/16 v0, 0xf

    .line 10
    .line 11
    invoke-static {p1, v0, p0, v1}, Lp/a;->g(IIII)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "Parameter out of range"

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static j(Lp4/n;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "v"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp4/n;->i:Lu4/o;

    .line 9
    .line 10
    iget v2, v1, Lu4/o;->g:I

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lu4/o;->i:Lu4/k;

    .line 21
    .line 22
    iget-object v1, v1, Lu4/k;->g:Lv4/c0;

    .line 23
    .line 24
    const-string v3, "null"

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lp4/n;->j:Lv4/d0;

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object v1, v1, Lv4/d0;->g:Lw4/c;

    .line 51
    .line 52
    invoke-virtual {v1}, Lw4/c;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {p0}, Lp4/n;->b()Lv4/c0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lv4/c0;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/n;->l:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lr4/n;->l:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    iget-object v0, p0, Lr4/n;->k:Lz4/d;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v1, p0, Lr4/n;->m:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-virtual {v0, p1, p2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final c()[B
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, v0, Lr4/n;->a:Lp4/w;

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    move v3, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v3, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v3, v3

    .line 13
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    move v5, v1

    .line 19
    :goto_1
    if-ge v5, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lp4/v;

    .line 26
    .line 27
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v5, v5, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance v2, Lr4/m;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v3}, Lr4/m;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-object v3, v0, Lr4/n;->g:Lw4/a;

    .line 45
    .line 46
    iget-object v5, v3, Lw4/a;->i:Lw4/b;

    .line 47
    .line 48
    iget-object v5, v5, Lz4/e;->h:[Ljava/lang/Object;

    .line 49
    .line 50
    array-length v5, v5

    .line 51
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iget-object v5, v3, Lw4/a;->i:Lw4/b;

    .line 55
    .line 56
    invoke-virtual {v5}, Lw4/b;->o()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget v6, v0, Lr4/n;->f:I

    .line 61
    .line 62
    sub-int v5, v6, v5

    .line 63
    .line 64
    iget-boolean v7, v0, Lr4/n;->h:Z

    .line 65
    .line 66
    xor-int/lit8 v8, v7, 0x1

    .line 67
    .line 68
    sub-int/2addr v5, v8

    .line 69
    new-instance v8, Ljava/util/BitSet;

    .line 70
    .line 71
    sub-int v9, v6, v5

    .line 72
    .line 73
    invoke-direct {v8, v9}, Ljava/util/BitSet;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v9, v0, Lr4/n;->b:Lp4/o;

    .line 77
    .line 78
    iget-object v10, v9, Lz4/e;->h:[Ljava/lang/Object;

    .line 79
    .line 80
    array-length v10, v10

    .line 81
    move v11, v1

    .line 82
    :goto_2
    if-ge v11, v10, :cond_4

    .line 83
    .line 84
    invoke-virtual {v9, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    check-cast v12, Lp4/n;

    .line 89
    .line 90
    iget-object v13, v12, Lp4/n;->i:Lu4/o;

    .line 91
    .line 92
    iget v13, v13, Lu4/o;->g:I

    .line 93
    .line 94
    if-ge v13, v5, :cond_2

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_2
    sub-int/2addr v13, v5

    .line 98
    invoke-virtual {v8, v13}, Ljava/util/BitSet;->get(I)Z

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    if-eqz v14, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {v8, v13}, Ljava/util/BitSet;->set(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :goto_3
    add-int/lit8 v11, v11, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    new-instance v5, Lr4/m;

    .line 115
    .line 116
    const/4 v8, 0x1

    .line 117
    invoke-direct {v5, v8}, Lr4/m;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 121
    .line 122
    .line 123
    iget-object v5, v0, Lr4/n;->k:Lz4/d;

    .line 124
    .line 125
    if-nez v5, :cond_5

    .line 126
    .line 127
    move v5, v1

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    const/4 v5, 0x1

    .line 130
    :goto_4
    iget-object v10, v0, Lr4/n;->c:Lz4/d;

    .line 131
    .line 132
    iget v11, v10, Lz4/d;->c:I

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-lez v12, :cond_6

    .line 139
    .line 140
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    check-cast v12, Lp4/v;

    .line 145
    .line 146
    iget-object v12, v12, Lp4/v;->b:Lu4/t;

    .line 147
    .line 148
    iget v12, v12, Lu4/t;->c:I

    .line 149
    .line 150
    iput v12, v0, Lr4/n;->j:I

    .line 151
    .line 152
    :cond_6
    iget v12, v0, Lr4/n;->j:I

    .line 153
    .line 154
    invoke-virtual {v10, v12}, Lz4/d;->n(I)I

    .line 155
    .line 156
    .line 157
    if-eqz v5, :cond_7

    .line 158
    .line 159
    iget v12, v10, Lz4/d;->c:I

    .line 160
    .line 161
    sub-int/2addr v12, v11

    .line 162
    new-instance v11, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v13, "line_start: "

    .line 165
    .line 166
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget v13, v0, Lr4/n;->j:I

    .line 170
    .line 171
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    invoke-virtual {v0, v12, v11}, Lr4/n;->a(ILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_7
    iget-object v11, v3, Lw4/a;->i:Lw4/b;

    .line 182
    .line 183
    invoke-virtual {v11}, Lw4/b;->o()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    sub-int/2addr v6, v11

    .line 188
    xor-int/lit8 v11, v7, 0x1

    .line 189
    .line 190
    sub-int/2addr v6, v11

    .line 191
    iget-object v3, v3, Lw4/a;->i:Lw4/b;

    .line 192
    .line 193
    iget-object v11, v3, Lz4/e;->h:[Ljava/lang/Object;

    .line 194
    .line 195
    array-length v11, v11

    .line 196
    iget-object v12, v0, Lr4/n;->n:[Lp4/n;

    .line 197
    .line 198
    if-nez v7, :cond_a

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_9

    .line 209
    .line 210
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    check-cast v13, Lp4/n;

    .line 215
    .line 216
    iget-object v14, v13, Lp4/n;->i:Lu4/o;

    .line 217
    .line 218
    iget v14, v14, Lu4/o;->g:I

    .line 219
    .line 220
    if-ne v6, v14, :cond_8

    .line 221
    .line 222
    aput-object v13, v12, v6

    .line 223
    .line 224
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 225
    .line 226
    :cond_a
    iget v7, v10, Lz4/d;->c:I

    .line 227
    .line 228
    invoke-virtual {v10, v11}, Lz4/d;->n(I)I

    .line 229
    .line 230
    .line 231
    if-eqz v5, :cond_b

    .line 232
    .line 233
    iget v13, v10, Lz4/d;->c:I

    .line 234
    .line 235
    sub-int/2addr v13, v7

    .line 236
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    const-string v14, "parameters_size: %04x"

    .line 245
    .line 246
    invoke-static {v14, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-virtual {v0, v13, v7}, Lr4/n;->a(ILjava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_b
    move v7, v1

    .line 254
    :goto_5
    if-ge v7, v11, :cond_13

    .line 255
    .line 256
    invoke-virtual {v3, v7}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    check-cast v13, Lw4/c;

    .line 261
    .line 262
    iget v14, v10, Lz4/d;->c:I

    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v15

    .line 268
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v16

    .line 272
    if-eqz v16, :cond_e

    .line 273
    .line 274
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v16

    .line 278
    move-object/from16 v8, v16

    .line 279
    .line 280
    check-cast v8, Lp4/n;

    .line 281
    .line 282
    iget-object v1, v8, Lp4/n;->i:Lu4/o;

    .line 283
    .line 284
    iget v1, v1, Lu4/o;->g:I

    .line 285
    .line 286
    if-ne v6, v1, :cond_d

    .line 287
    .line 288
    invoke-virtual {v8}, Lp4/n;->b()Lv4/c0;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-eqz v1, :cond_c

    .line 293
    .line 294
    const/4 v1, 0x0

    .line 295
    invoke-virtual {v0, v1}, Lr4/n;->h(Lv4/c0;)V

    .line 296
    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_c
    iget-object v1, v8, Lp4/n;->i:Lu4/o;

    .line 300
    .line 301
    iget-object v1, v1, Lu4/o;->i:Lu4/k;

    .line 302
    .line 303
    iget-object v1, v1, Lu4/k;->g:Lv4/c0;

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Lr4/n;->h(Lv4/c0;)V

    .line 306
    .line 307
    .line 308
    :goto_7
    aput-object v8, v12, v6

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_d
    const/4 v1, 0x0

    .line 312
    goto :goto_6

    .line 313
    :cond_e
    const/4 v8, 0x0

    .line 314
    :goto_8
    if-nez v8, :cond_f

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    invoke-virtual {v0, v1}, Lr4/n;->h(Lv4/c0;)V

    .line 318
    .line 319
    .line 320
    :cond_f
    if-eqz v5, :cond_12

    .line 321
    .line 322
    if-eqz v8, :cond_11

    .line 323
    .line 324
    invoke-virtual {v8}, Lp4/n;->b()Lv4/c0;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-eqz v1, :cond_10

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_10
    iget-object v1, v8, Lp4/n;->i:Lu4/o;

    .line 332
    .line 333
    iget-object v1, v1, Lu4/o;->i:Lu4/k;

    .line 334
    .line 335
    iget-object v1, v1, Lu4/k;->g:Lv4/c0;

    .line 336
    .line 337
    invoke-virtual {v1}, Lv4/c0;->a()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    goto :goto_a

    .line 342
    :cond_11
    :goto_9
    const-string v1, "<unnamed>"

    .line 343
    .line 344
    :goto_a
    iget v8, v10, Lz4/d;->c:I

    .line 345
    .line 346
    sub-int/2addr v8, v14

    .line 347
    new-instance v14, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    const-string v15, "parameter "

    .line 350
    .line 351
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v1, " v"

    .line 358
    .line 359
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v0, v8, v1}, Lr4/n;->a(ILjava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :cond_12
    invoke-virtual {v13}, Lw4/c;->i()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    add-int/2addr v6, v1

    .line 377
    add-int/lit8 v7, v7, 0x1

    .line 378
    .line 379
    const/4 v1, 0x0

    .line 380
    goto :goto_5

    .line 381
    :cond_13
    array-length v1, v12

    .line 382
    const/4 v2, 0x0

    .line 383
    :goto_b
    if-ge v2, v1, :cond_16

    .line 384
    .line 385
    aget-object v3, v12, v2

    .line 386
    .line 387
    if-nez v3, :cond_14

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_14
    invoke-virtual {v3}, Lp4/n;->b()Lv4/c0;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    if-eqz v5, :cond_15

    .line 395
    .line 396
    invoke-virtual {v0, v3}, Lr4/n;->f(Lp4/n;)V

    .line 397
    .line 398
    .line 399
    :cond_15
    :goto_c
    add-int/lit8 v2, v2, 0x1

    .line 400
    .line 401
    goto :goto_b

    .line 402
    :cond_16
    const/4 v1, 0x7

    .line 403
    invoke-virtual {v10, v1}, Lz4/d;->j(I)V

    .line 404
    .line 405
    .line 406
    iget-object v1, v0, Lr4/n;->k:Lz4/d;

    .line 407
    .line 408
    if-nez v1, :cond_17

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :cond_17
    iget v1, v0, Lr4/n;->i:I

    .line 412
    .line 413
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    const-string v2, "%04x: prologue end"

    .line 422
    .line 423
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const/4 v2, 0x1

    .line 428
    invoke-virtual {v0, v2, v1}, Lr4/n;->a(ILjava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :goto_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    iget-object v2, v9, Lz4/e;->h:[Ljava/lang/Object;

    .line 436
    .line 437
    array-length v2, v2

    .line 438
    const/4 v3, 0x0

    .line 439
    const/4 v5, 0x0

    .line 440
    :goto_e
    iget-object v6, v9, Lz4/e;->h:[Ljava/lang/Object;

    .line 441
    .line 442
    array-length v6, v6

    .line 443
    :goto_f
    if-ge v3, v6, :cond_23

    .line 444
    .line 445
    invoke-virtual {v9, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    check-cast v7, Lp4/n;

    .line 450
    .line 451
    iget v7, v7, Lp4/n;->g:I

    .line 452
    .line 453
    iget v8, v0, Lr4/n;->i:I

    .line 454
    .line 455
    if-ne v7, v8, :cond_23

    .line 456
    .line 457
    add-int/lit8 v7, v3, 0x1

    .line 458
    .line 459
    invoke-virtual {v9, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    check-cast v3, Lp4/n;

    .line 464
    .line 465
    iget-object v8, v3, Lp4/n;->i:Lu4/o;

    .line 466
    .line 467
    iget v11, v8, Lu4/o;->g:I

    .line 468
    .line 469
    aget-object v13, v12, v11

    .line 470
    .line 471
    if-ne v3, v13, :cond_18

    .line 472
    .line 473
    goto/16 :goto_12

    .line 474
    .line 475
    :cond_18
    aput-object v3, v12, v11

    .line 476
    .line 477
    iget v14, v3, Lp4/n;->h:I

    .line 478
    .line 479
    const/4 v15, 0x1

    .line 480
    if-ne v14, v15, :cond_20

    .line 481
    .line 482
    if-eqz v13, :cond_1b

    .line 483
    .line 484
    iget-object v14, v13, Lp4/n;->i:Lu4/o;

    .line 485
    .line 486
    invoke-virtual {v8, v14}, Lu4/o;->i(Lu4/o;)Z

    .line 487
    .line 488
    .line 489
    move-result v14

    .line 490
    if-eqz v14, :cond_1b

    .line 491
    .line 492
    iget v8, v13, Lp4/n;->h:I

    .line 493
    .line 494
    if-eq v8, v15, :cond_1a

    .line 495
    .line 496
    iget v8, v10, Lz4/d;->c:I

    .line 497
    .line 498
    const/4 v13, 0x6

    .line 499
    invoke-virtual {v10, v13}, Lz4/d;->j(I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v11}, Lr4/n;->i(I)V

    .line 503
    .line 504
    .line 505
    iget-object v11, v0, Lr4/n;->k:Lz4/d;

    .line 506
    .line 507
    if-nez v11, :cond_19

    .line 508
    .line 509
    goto/16 :goto_12

    .line 510
    .line 511
    :cond_19
    iget v11, v10, Lz4/d;->c:I

    .line 512
    .line 513
    sub-int/2addr v11, v8

    .line 514
    iget v8, v0, Lr4/n;->i:I

    .line 515
    .line 516
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    invoke-static {v3}, Lr4/n;->j(Lp4/n;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    filled-new-array {v8, v3}, [Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    const-string v8, "%04x: +local restart %s"

    .line 529
    .line 530
    invoke-static {v8, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-virtual {v0, v11, v3}, Lr4/n;->a(ILjava/lang/String;)V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_12

    .line 538
    .line 539
    :cond_1a
    const-string v1, "shouldn\'t happen"

    .line 540
    .line 541
    invoke-static {v1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    const/4 v1, 0x0

    .line 545
    return-object v1

    .line 546
    :cond_1b
    invoke-virtual {v3}, Lp4/n;->b()Lv4/c0;

    .line 547
    .line 548
    .line 549
    move-result-object v13

    .line 550
    if-eqz v13, :cond_1c

    .line 551
    .line 552
    invoke-virtual {v0, v3}, Lr4/n;->f(Lp4/n;)V

    .line 553
    .line 554
    .line 555
    goto/16 :goto_12

    .line 556
    .line 557
    :cond_1c
    iget v13, v10, Lz4/d;->c:I

    .line 558
    .line 559
    const/4 v14, 0x3

    .line 560
    invoke-virtual {v10, v14}, Lz4/d;->j(I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v11}, Lr4/n;->i(I)V

    .line 564
    .line 565
    .line 566
    iget-object v8, v8, Lu4/o;->i:Lu4/k;

    .line 567
    .line 568
    iget-object v8, v8, Lu4/k;->g:Lv4/c0;

    .line 569
    .line 570
    invoke-virtual {v0, v8}, Lr4/n;->h(Lv4/c0;)V

    .line 571
    .line 572
    .line 573
    iget-object v8, v3, Lp4/n;->j:Lv4/d0;

    .line 574
    .line 575
    if-eqz v8, :cond_1d

    .line 576
    .line 577
    iget-object v11, v0, Lr4/n;->d:Lr4/p;

    .line 578
    .line 579
    if-nez v11, :cond_1e

    .line 580
    .line 581
    :cond_1d
    const/4 v8, 0x0

    .line 582
    goto :goto_10

    .line 583
    :cond_1e
    iget-object v11, v11, Lr4/p;->g:Lr4/h0;

    .line 584
    .line 585
    invoke-virtual {v11, v8}, Lr4/h0;->m(Lv4/d0;)I

    .line 586
    .line 587
    .line 588
    move-result v8

    .line 589
    const/16 v17, 0x1

    .line 590
    .line 591
    add-int/lit8 v8, v8, 0x1

    .line 592
    .line 593
    invoke-virtual {v10, v8}, Lz4/d;->n(I)I

    .line 594
    .line 595
    .line 596
    goto :goto_11

    .line 597
    :goto_10
    invoke-virtual {v10, v8}, Lz4/d;->n(I)I

    .line 598
    .line 599
    .line 600
    :goto_11
    iget-object v8, v0, Lr4/n;->k:Lz4/d;

    .line 601
    .line 602
    if-nez v8, :cond_1f

    .line 603
    .line 604
    goto :goto_12

    .line 605
    :cond_1f
    iget v8, v10, Lz4/d;->c:I

    .line 606
    .line 607
    sub-int/2addr v8, v13

    .line 608
    iget v11, v0, Lr4/n;->i:I

    .line 609
    .line 610
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 611
    .line 612
    .line 613
    move-result-object v11

    .line 614
    invoke-static {v3}, Lr4/n;->j(Lp4/n;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    filled-new-array {v11, v3}, [Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    const-string v11, "%04x: +local %s"

    .line 623
    .line 624
    invoke-static {v11, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v0, v8, v3}, Lr4/n;->a(ILjava/lang/String;)V

    .line 629
    .line 630
    .line 631
    goto :goto_12

    .line 632
    :cond_20
    const/4 v8, 0x3

    .line 633
    if-eq v14, v8, :cond_22

    .line 634
    .line 635
    iget v8, v10, Lz4/d;->c:I

    .line 636
    .line 637
    const/4 v13, 0x5

    .line 638
    invoke-virtual {v10, v13}, Lz4/d;->j(I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v10, v11}, Lz4/d;->n(I)I

    .line 642
    .line 643
    .line 644
    iget-object v11, v0, Lr4/n;->k:Lz4/d;

    .line 645
    .line 646
    if-nez v11, :cond_21

    .line 647
    .line 648
    goto :goto_12

    .line 649
    :cond_21
    iget v11, v10, Lz4/d;->c:I

    .line 650
    .line 651
    sub-int/2addr v11, v8

    .line 652
    iget v8, v0, Lr4/n;->i:I

    .line 653
    .line 654
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    invoke-static {v3}, Lr4/n;->j(Lp4/n;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    filled-new-array {v8, v3}, [Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    const-string v8, "%04x: -local %s"

    .line 667
    .line 668
    invoke-static {v8, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    invoke-virtual {v0, v11, v3}, Lr4/n;->a(ILjava/lang/String;)V

    .line 673
    .line 674
    .line 675
    :cond_22
    :goto_12
    move v3, v7

    .line 676
    goto/16 :goto_f

    .line 677
    .line 678
    :cond_23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 679
    .line 680
    .line 681
    move-result v6

    .line 682
    :goto_13
    if-ge v5, v6, :cond_24

    .line 683
    .line 684
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v7

    .line 688
    check-cast v7, Lp4/v;

    .line 689
    .line 690
    iget v7, v7, Lp4/v;->a:I

    .line 691
    .line 692
    iget v8, v0, Lr4/n;->i:I

    .line 693
    .line 694
    if-ne v7, v8, :cond_24

    .line 695
    .line 696
    add-int/lit8 v7, v5, 0x1

    .line 697
    .line 698
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v5

    .line 702
    check-cast v5, Lp4/v;

    .line 703
    .line 704
    invoke-virtual {v0, v5}, Lr4/n;->g(Lp4/v;)V

    .line 705
    .line 706
    .line 707
    move v5, v7

    .line 708
    goto :goto_13

    .line 709
    :cond_24
    const v6, 0x7fffffff

    .line 710
    .line 711
    .line 712
    if-ge v3, v2, :cond_25

    .line 713
    .line 714
    invoke-virtual {v9, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    check-cast v7, Lp4/n;

    .line 719
    .line 720
    iget v7, v7, Lp4/n;->g:I

    .line 721
    .line 722
    goto :goto_14

    .line 723
    :cond_25
    move v7, v6

    .line 724
    :goto_14
    if-ge v5, v1, :cond_26

    .line 725
    .line 726
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v8

    .line 730
    check-cast v8, Lp4/v;

    .line 731
    .line 732
    iget v8, v8, Lp4/v;->a:I

    .line 733
    .line 734
    goto :goto_15

    .line 735
    :cond_26
    move v8, v6

    .line 736
    :goto_15
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    .line 737
    .line 738
    .line 739
    move-result v11

    .line 740
    if-ne v11, v6, :cond_27

    .line 741
    .line 742
    :goto_16
    const/4 v6, 0x0

    .line 743
    goto :goto_17

    .line 744
    :cond_27
    iget v13, v0, Lr4/n;->e:I

    .line 745
    .line 746
    if-ne v11, v13, :cond_29

    .line 747
    .line 748
    if-ne v7, v6, :cond_29

    .line 749
    .line 750
    if-ne v8, v6, :cond_29

    .line 751
    .line 752
    goto :goto_16

    .line 753
    :goto_17
    invoke-virtual {v10, v6}, Lz4/d;->j(I)V

    .line 754
    .line 755
    .line 756
    iget-object v1, v0, Lr4/n;->k:Lz4/d;

    .line 757
    .line 758
    if-nez v1, :cond_28

    .line 759
    .line 760
    goto :goto_18

    .line 761
    :cond_28
    const-string v1, "end sequence"

    .line 762
    .line 763
    const/4 v15, 0x1

    .line 764
    invoke-virtual {v0, v15, v1}, Lr4/n;->a(ILjava/lang/String;)V

    .line 765
    .line 766
    .line 767
    :goto_18
    invoke-virtual {v10}, Lz4/d;->h()[B

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    return-object v1

    .line 772
    :cond_29
    const/4 v6, 0x0

    .line 773
    const/4 v15, 0x1

    .line 774
    if-ne v11, v8, :cond_2a

    .line 775
    .line 776
    add-int/lit8 v7, v5, 0x1

    .line 777
    .line 778
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    check-cast v5, Lp4/v;

    .line 783
    .line 784
    invoke-virtual {v0, v5}, Lr4/n;->g(Lp4/v;)V

    .line 785
    .line 786
    .line 787
    move v5, v7

    .line 788
    goto/16 :goto_e

    .line 789
    .line 790
    :cond_2a
    iget v7, v0, Lr4/n;->i:I

    .line 791
    .line 792
    sub-int/2addr v11, v7

    .line 793
    invoke-virtual {v0, v11}, Lr4/n;->e(I)V

    .line 794
    .line 795
    .line 796
    goto/16 :goto_e
.end method

.method public final d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 2
    .line 3
    iget v1, v0, Lz4/d;->c:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-virtual {v0, v2}, Lz4/d;->j(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lz4/d;->m(I)V

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lr4/n;->j:I

    .line 13
    .line 14
    add-int/2addr v2, p1

    .line 15
    iput v2, p0, Lr4/n;->j:I

    .line 16
    .line 17
    iget-object p1, p0, Lr4/n;->k:Lz4/d;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget p1, v0, Lz4/d;->c:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "line = %d"

    .line 34
    .line 35
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, p1, v0}, Lr4/n;->a(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 2
    .line 3
    iget v1, v0, Lz4/d;->c:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v0, v2}, Lz4/d;->j(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lz4/d;->n(I)I

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lr4/n;->i:I

    .line 13
    .line 14
    add-int/2addr v2, p1

    .line 15
    iput v2, p0, Lr4/n;->i:I

    .line 16
    .line 17
    iget-object p1, p0, Lr4/n;->k:Lz4/d;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget p1, v0, Lz4/d;->c:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "%04x: advance pc"

    .line 34
    .line 35
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, p1, v0}, Lr4/n;->a(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final f(Lp4/n;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 2
    .line 3
    iget v1, v0, Lz4/d;->c:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-virtual {v0, v2}, Lz4/d;->j(I)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p1, Lp4/n;->i:Lu4/o;

    .line 10
    .line 11
    iget v3, v2, Lu4/o;->g:I

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Lr4/n;->i(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v2, Lu4/o;->i:Lu4/k;

    .line 17
    .line 18
    iget-object v2, v2, Lu4/k;->g:Lv4/c0;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lr4/n;->h(Lv4/c0;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p1, Lp4/n;->j:Lv4/d0;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-object v3, p0, Lr4/n;->d:Lr4/p;

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v3, v3, Lr4/p;->g:Lr4/h0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lr4/h0;->m(Lv4/d0;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Lz4/d;->n(I)I

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 45
    invoke-virtual {v0, v2}, Lz4/d;->n(I)I

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-virtual {p1}, Lp4/n;->b()Lv4/c0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p0, v2}, Lr4/n;->h(Lv4/c0;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lr4/n;->k:Lz4/d;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget v0, v0, Lz4/d;->c:I

    .line 61
    .line 62
    sub-int/2addr v0, v1

    .line 63
    iget v1, p0, Lr4/n;->i:I

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p1}, Lr4/n;->j(Lp4/n;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "%04x: +localx %s"

    .line 78
    .line 79
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, v0, p1}, Lr4/n;->a(ILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final g(Lp4/v;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lp4/v;->b:Lu4/t;

    .line 2
    .line 3
    iget v0, v0, Lu4/t;->c:I

    .line 4
    .line 5
    iget p1, p1, Lp4/v;->a:I

    .line 6
    .line 7
    iget v1, p0, Lr4/n;->j:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    iget v1, p0, Lr4/n;->i:I

    .line 11
    .line 12
    sub-int/2addr p1, v1

    .line 13
    if-ltz p1, :cond_5

    .line 14
    .line 15
    const/4 v1, -0x4

    .line 16
    const/4 v2, 0x0

    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Lr4/n;->d(I)V

    .line 24
    .line 25
    .line 26
    move v0, v2

    .line 27
    :cond_1
    invoke-static {v0, p1}, Lr4/n;->b(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    and-int/lit16 v3, v1, -0x100

    .line 32
    .line 33
    if-lez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lr4/n;->e(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2}, Lr4/n;->b(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    and-int/lit16 p1, v1, -0x100

    .line 43
    .line 44
    if-lez p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lr4/n;->d(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v2}, Lr4/n;->b(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    move p1, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move p1, v2

    .line 56
    :cond_3
    move v2, v0

    .line 57
    :goto_0
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lz4/d;->j(I)V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Lr4/n;->j:I

    .line 63
    .line 64
    add-int/2addr v0, v2

    .line 65
    iput v0, p0, Lr4/n;->j:I

    .line 66
    .line 67
    iget v0, p0, Lr4/n;->i:I

    .line 68
    .line 69
    add-int/2addr v0, p1

    .line 70
    iput v0, p0, Lr4/n;->i:I

    .line 71
    .line 72
    iget-object p1, p0, Lr4/n;->k:Lz4/d;

    .line 73
    .line 74
    if-nez p1, :cond_4

    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget v0, p0, Lr4/n;->j:I

    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "%04x: line %d"

    .line 92
    .line 93
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const/4 v0, 0x1

    .line 98
    invoke-virtual {p0, v0, p1}, Lr4/n;->a(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    const-string p1, "Position entries must be in ascending address order"

    .line 103
    .line 104
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final h(Lv4/c0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lr4/n;->d:Lr4/p;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, v1, Lr4/p;->f:Lr4/h0;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lr4/h0;->l(Lv4/c0;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lz4/d;->n(I)I

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, p1}, Lz4/d;->n(I)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final i(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lr4/n;->c:Lz4/d;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lz4/d;->n(I)I

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string v0, "Signed value where unsigned required: "

    .line 10
    .line 11
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
