.class public final Lr4/k;
.super Lr4/z;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Lv4/d0;

.field public final i:I

.field public final j:Lv4/d0;

.field public k:Lr4/t0;

.field public final l:Lv4/c0;

.field public final m:Lr4/j;

.field public n:Lr4/q;

.field public o:Lr4/e;


# direct methods
.method public constructor <init>(Lv4/d0;ILv4/d0;Lw4/e;Lv4/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr4/z;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-eqz p4, :cond_1

    .line 7
    .line 8
    iput-object p1, p0, Lr4/k;->h:Lv4/d0;

    .line 9
    .line 10
    iput p2, p0, Lr4/k;->i:I

    .line 11
    .line 12
    iput-object p3, p0, Lr4/k;->j:Lv4/d0;

    .line 13
    .line 14
    invoke-interface {p4}, Lw4/e;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, 0x0

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    move-object p2, p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p2, Lr4/t0;

    .line 24
    .line 25
    invoke-direct {p2, p4}, Lr4/t0;-><init>(Lw4/e;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iput-object p2, p0, Lr4/k;->k:Lr4/t0;

    .line 29
    .line 30
    iput-object p5, p0, Lr4/k;->l:Lv4/c0;

    .line 31
    .line 32
    new-instance p2, Lr4/j;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Lr4/j;-><init>(Lv4/d0;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lr4/k;->m:Lr4/j;

    .line 38
    .line 39
    iput-object p3, p0, Lr4/k;->n:Lr4/q;

    .line 40
    .line 41
    new-instance p1, Lr4/e;

    .line 42
    .line 43
    const/4 p2, 0x4

    .line 44
    const/4 p4, -0x1

    .line 45
    invoke-direct {p1, p2, p4}, Lr4/l0;-><init>(II)V

    .line 46
    .line 47
    .line 48
    iput-object p3, p1, Lr4/e;->k:Lr4/b;

    .line 49
    .line 50
    iput-object p3, p1, Lr4/e;->l:Ljava/util/ArrayList;

    .line 51
    .line 52
    iput-object p3, p1, Lr4/e;->m:Ljava/util/ArrayList;

    .line 53
    .line 54
    iput-object p3, p1, Lr4/e;->n:Ljava/util/ArrayList;

    .line 55
    .line 56
    iput-object p1, p0, Lr4/k;->o:Lr4/e;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const-string p1, "interfaces == null"

    .line 60
    .line 61
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    throw p1

    .line 66
    :cond_2
    const-string p1, "thisClass == null"

    .line 67
    .line 68
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v1, p1, Lr4/p;->o:Lr4/k0;

    .line 4
    .line 5
    iget-object v2, p1, Lr4/p;->b:Lr4/k0;

    .line 6
    .line 7
    iget-object v3, p1, Lr4/p;->c:Lr4/k0;

    .line 8
    .line 9
    iget-object v4, p1, Lr4/p;->f:Lr4/h0;

    .line 10
    .line 11
    iget-object v5, p0, Lr4/k;->h:Lv4/d0;

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 14
    .line 15
    .line 16
    iget-object v5, p0, Lr4/k;->m:Lr4/j;

    .line 17
    .line 18
    invoke-virtual {v5}, Lr4/j;->r()Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, Lr4/p;->l:Lr4/k0;

    .line 25
    .line 26
    invoke-virtual {p1, v5}, Lr4/k0;->k(Lr4/l0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5}, Lr4/j;->q()Lv4/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    new-instance v5, Lr4/q;

    .line 36
    .line 37
    invoke-direct {v5, p1}, Lr4/q;-><init>(Lv4/d;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v5}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lr4/q;

    .line 45
    .line 46
    iput-object p1, p0, Lr4/k;->n:Lr4/q;

    .line 47
    .line 48
    :cond_0
    iget-object p1, p0, Lr4/k;->j:Lv4/d0;

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object p1, p0, Lr4/k;->k:Lr4/t0;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v3, p1}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lr4/t0;

    .line 64
    .line 65
    iput-object p1, p0, Lr4/k;->k:Lr4/t0;

    .line 66
    .line 67
    :cond_2
    iget-object p1, p0, Lr4/k;->l:Lv4/c0;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Lr4/h0;->r(Lv4/c0;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iget-object p1, p0, Lr4/k;->o:Lr4/e;

    .line 75
    .line 76
    iget-object v0, p1, Lr4/e;->k:Lr4/b;

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    iget-object v1, p1, Lr4/e;->l:Ljava/util/ArrayList;

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    iget-object v1, p1, Lr4/e;->m:Ljava/util/ArrayList;

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    iget-object v1, p1, Lr4/e;->n:Ljava/util/ArrayList;

    .line 89
    .line 90
    if-nez v1, :cond_4

    .line 91
    .line 92
    return-void

    .line 93
    :cond_4
    if-eqz v0, :cond_5

    .line 94
    .line 95
    iget-object v0, p1, Lr4/e;->l:Ljava/util/ArrayList;

    .line 96
    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    iget-object v0, p1, Lr4/e;->m:Ljava/util/ArrayList;

    .line 100
    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    iget-object v0, p1, Lr4/e;->n:Ljava/util/ArrayList;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    goto :goto_0

    .line 109
    :cond_5
    const/4 v0, 0x0

    .line 110
    :goto_0
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-virtual {v2, p1}, Lr4/k0;->l(Lr4/l0;)Lr4/l0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lr4/e;

    .line 117
    .line 118
    iput-object p1, p0, Lr4/k;->o:Lr4/e;

    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    invoke-virtual {v2, p1}, Lr4/k0;->k(Lr4/l0;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->p:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    return v0
.end method

.method public final d(Lr4/p;Lz4/d;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Lz4/d;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v4, v1, Lr4/p;->g:Lr4/h0;

    .line 12
    .line 13
    iget-object v5, v0, Lr4/k;->h:Lv4/d0;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Lr4/h0;->m(Lv4/d0;)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/4 v7, -0x1

    .line 20
    iget-object v8, v0, Lr4/k;->j:Lv4/d0;

    .line 21
    .line 22
    if-nez v8, :cond_0

    .line 23
    .line 24
    move v4, v7

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v4, v8}, Lr4/h0;->m(Lv4/d0;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    :goto_0
    iget-object v9, v0, Lr4/k;->k:Lr4/t0;

    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    if-nez v9, :cond_1

    .line 34
    .line 35
    move v9, v10

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v9}, Lr4/l0;->f()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    :goto_1
    iget-object v11, v0, Lr4/k;->o:Lr4/e;

    .line 42
    .line 43
    iget-object v12, v11, Lr4/e;->k:Lr4/b;

    .line 44
    .line 45
    if-nez v12, :cond_2

    .line 46
    .line 47
    iget-object v12, v11, Lr4/e;->l:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v12, :cond_2

    .line 50
    .line 51
    iget-object v12, v11, Lr4/e;->m:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-nez v12, :cond_2

    .line 54
    .line 55
    iget-object v12, v11, Lr4/e;->n:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-nez v12, :cond_2

    .line 58
    .line 59
    move v11, v10

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v11}, Lr4/l0;->f()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    :goto_2
    iget-object v12, v0, Lr4/k;->l:Lv4/c0;

    .line 66
    .line 67
    if-nez v12, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    iget-object v1, v1, Lr4/p;->f:Lr4/h0;

    .line 71
    .line 72
    invoke-virtual {v1, v12}, Lr4/h0;->l(Lv4/c0;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    :goto_3
    iget-object v1, v0, Lr4/k;->m:Lr4/j;

    .line 77
    .line 78
    invoke-virtual {v1}, Lr4/j;->r()Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_4

    .line 83
    .line 84
    move v1, v10

    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-virtual {v1}, Lr4/l0;->f()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    :goto_4
    iget-object v13, v0, Lr4/k;->n:Lr4/q;

    .line 91
    .line 92
    if-nez v13, :cond_5

    .line 93
    .line 94
    move v13, v10

    .line 95
    goto :goto_5

    .line 96
    :cond_5
    invoke-virtual {v13}, Lr4/l0;->f()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    :goto_5
    iget v14, v0, Lr4/k;->i:I

    .line 101
    .line 102
    if-eqz v3, :cond_9

    .line 103
    .line 104
    new-instance v3, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lr4/z;->f()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v15, 0x20

    .line 117
    .line 118
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v5, v5, Lv4/d0;->g:Lw4/c;

    .line 122
    .line 123
    invoke-virtual {v5}, Lw4/c;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v2, v10, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v6}, La/a;->Y0(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    const-string v5, "  class_idx:           "

    .line 142
    .line 143
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const/4 v5, 0x4

    .line 148
    invoke-virtual {v2, v5, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v3, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v15, "  access_flags:        "

    .line 154
    .line 155
    invoke-direct {v3, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const/16 v15, 0x7631

    .line 159
    .line 160
    const/4 v10, 0x1

    .line 161
    invoke-static {v14, v15, v10}, Lbe/h;->A(III)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v2, v5, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v10, "  superclass_idx:      "

    .line 178
    .line 179
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v4}, La/a;->Y0(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v10, " // "

    .line 190
    .line 191
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v15, "<none>"

    .line 195
    .line 196
    if-nez v8, :cond_6

    .line 197
    .line 198
    move-object v8, v15

    .line 199
    goto :goto_6

    .line 200
    :cond_6
    iget-object v8, v8, Lv4/d0;->g:Lw4/c;

    .line 201
    .line 202
    invoke-virtual {v8}, Lw4/c;->a()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    :goto_6
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v2, v5, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    const-string v8, "  interfaces_off:      "

    .line 221
    .line 222
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v2, v5, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    if-eqz v9, :cond_7

    .line 230
    .line 231
    iget-object v3, v0, Lr4/k;->k:Lr4/t0;

    .line 232
    .line 233
    iget-object v3, v3, Lr4/t0;->k:Lw4/e;

    .line 234
    .line 235
    invoke-interface {v3}, Lw4/e;->size()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    const/4 v5, 0x0

    .line 240
    :goto_7
    if-ge v5, v8, :cond_7

    .line 241
    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    move/from16 v16, v8

    .line 245
    .line 246
    const-string v8, "    "

    .line 247
    .line 248
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v3, v5}, Lw4/e;->getType(I)Lw4/c;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v8}, Lw4/c;->a()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const/4 v8, 0x0

    .line 267
    invoke-virtual {v2, v8, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 268
    .line 269
    .line 270
    add-int/lit8 v5, v5, 0x1

    .line 271
    .line 272
    move-object/from16 v0, p0

    .line 273
    .line 274
    move/from16 v8, v16

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v3, "  source_file_idx:     "

    .line 280
    .line 281
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v7}, La/a;->Y0(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    if-nez v12, :cond_8

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_8
    invoke-virtual {v12}, Lv4/c0;->a()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v15

    .line 301
    :goto_8
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    const/4 v3, 0x4

    .line 309
    invoke-virtual {v2, v3, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v11}, La/a;->Y0(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    const-string v5, "  annotations_off:     "

    .line 317
    .line 318
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v2, v3, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    const-string v5, "  class_data_off:      "

    .line 330
    .line 331
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v2, v3, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v13}, La/a;->Y0(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    const-string v5, "  static_values_off:   "

    .line 343
    .line 344
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {v2, v3, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :cond_9
    invoke-virtual {v2, v6}, Lz4/d;->k(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v14}, Lz4/d;->k(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4}, Lz4/d;->k(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v9}, Lz4/d;->k(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v7}, Lz4/d;->k(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v11}, Lz4/d;->k(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v1}, Lz4/d;->k(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v13}, Lz4/d;->k(I)V

    .line 373
    .line 374
    .line 375
    return-void
.end method

.method public final i(Lr4/r;Lv4/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/k;->m:Lr4/j;

    .line 2
    .line 3
    iget-object v1, v0, Lr4/j;->q:Lv4/d;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lr4/j;->l:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lr4/j;->m:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "static fields already sorted"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
