.class public final Lr4/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ln4/a;

.field public final b:Lr4/k0;

.field public final c:Lr4/k0;

.field public final d:Lr4/k0;

.field public final e:Lr4/k0;

.field public final f:Lr4/h0;

.field public final g:Lr4/h0;

.field public final h:Lr4/h0;

.field public final i:Lr4/w;

.field public final j:Lr4/j0;

.field public final k:Lr4/g;

.field public final l:Lr4/k0;

.field public final m:Lr4/g;

.field public final n:Lr4/h0;

.field public final o:Lr4/k0;

.field public final p:Lr4/h0;

.field public final q:[Lr4/o0;

.field public r:I

.field public final s:I


# direct methods
.method public constructor <init>(Ln4/a;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lr4/p;->a:Ln4/a;

    .line 9
    .line 10
    new-instance v2, Lr4/h0;

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v2, v0, v3}, Lr4/h0;-><init>(Lr4/p;I)V

    .line 14
    .line 15
    .line 16
    iput-object v2, v0, Lr4/p;->p:Lr4/h0;

    .line 17
    .line 18
    new-instance v4, Lr4/k0;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    invoke-direct {v4, v5, v0, v3, v6}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 23
    .line 24
    .line 25
    iput-object v4, v0, Lr4/p;->c:Lr4/k0;

    .line 26
    .line 27
    new-instance v7, Lr4/k0;

    .line 28
    .line 29
    const-string v8, "word_data"

    .line 30
    .line 31
    const/4 v9, 0x2

    .line 32
    invoke-direct {v7, v8, v0, v3, v9}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 33
    .line 34
    .line 35
    iput-object v7, v0, Lr4/p;->b:Lr4/k0;

    .line 36
    .line 37
    new-instance v8, Lr4/k0;

    .line 38
    .line 39
    const-string v10, "string_data"

    .line 40
    .line 41
    const/4 v11, 0x3

    .line 42
    invoke-direct {v8, v10, v0, v6, v11}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 43
    .line 44
    .line 45
    iput-object v8, v0, Lr4/p;->e:Lr4/k0;

    .line 46
    .line 47
    new-instance v10, Lr4/k0;

    .line 48
    .line 49
    invoke-direct {v10, v5, v0, v6, v6}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 50
    .line 51
    .line 52
    iput-object v10, v0, Lr4/p;->l:Lr4/k0;

    .line 53
    .line 54
    new-instance v12, Lr4/k0;

    .line 55
    .line 56
    const-string v13, "byte_data"

    .line 57
    .line 58
    invoke-direct {v12, v13, v0, v6, v9}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 59
    .line 60
    .line 61
    iput-object v12, v0, Lr4/p;->o:Lr4/k0;

    .line 62
    .line 63
    new-instance v13, Lr4/h0;

    .line 64
    .line 65
    invoke-direct {v13, v0, v9}, Lr4/h0;-><init>(Lr4/p;I)V

    .line 66
    .line 67
    .line 68
    iput-object v13, v0, Lr4/p;->f:Lr4/h0;

    .line 69
    .line 70
    new-instance v14, Lr4/h0;

    .line 71
    .line 72
    invoke-direct {v14, v0, v11}, Lr4/h0;-><init>(Lr4/p;I)V

    .line 73
    .line 74
    .line 75
    iput-object v14, v0, Lr4/p;->g:Lr4/h0;

    .line 76
    .line 77
    new-instance v15, Lr4/h0;

    .line 78
    .line 79
    invoke-direct {v15, v0, v6}, Lr4/h0;-><init>(Lr4/p;I)V

    .line 80
    .line 81
    .line 82
    iput-object v15, v0, Lr4/p;->h:Lr4/h0;

    .line 83
    .line 84
    move/from16 v16, v9

    .line 85
    .line 86
    new-instance v9, Lr4/w;

    .line 87
    .line 88
    invoke-direct {v9, v0}, Lr4/w;-><init>(Lr4/p;)V

    .line 89
    .line 90
    .line 91
    iput-object v9, v0, Lr4/p;->i:Lr4/w;

    .line 92
    .line 93
    move/from16 v17, v11

    .line 94
    .line 95
    new-instance v11, Lr4/j0;

    .line 96
    .line 97
    invoke-direct {v11, v0}, Lr4/j0;-><init>(Lr4/p;)V

    .line 98
    .line 99
    .line 100
    iput-object v11, v0, Lr4/p;->j:Lr4/j0;

    .line 101
    .line 102
    new-instance v5, Lr4/g;

    .line 103
    .line 104
    invoke-direct {v5, v0, v6}, Lr4/g;-><init>(Lr4/p;I)V

    .line 105
    .line 106
    .line 107
    iput-object v5, v0, Lr4/p;->k:Lr4/g;

    .line 108
    .line 109
    move-object/from16 v19, v2

    .line 110
    .line 111
    new-instance v2, Lr4/k0;

    .line 112
    .line 113
    move-object/from16 v20, v4

    .line 114
    .line 115
    const-string v4, "map"

    .line 116
    .line 117
    invoke-direct {v2, v4, v0, v3, v6}, Lr4/k0;-><init>(Ljava/lang/String;Lr4/p;II)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v0, Lr4/p;->d:Lr4/k0;

    .line 121
    .line 122
    const/16 v4, 0x1a

    .line 123
    .line 124
    invoke-virtual {v1, v4}, Ln4/a;->a(I)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const/16 v4, 0xd

    .line 129
    .line 130
    const/16 v21, 0xc

    .line 131
    .line 132
    const/16 v22, 0xb

    .line 133
    .line 134
    const/16 v23, 0xa

    .line 135
    .line 136
    const/16 v24, 0x9

    .line 137
    .line 138
    const/16 v25, 0x8

    .line 139
    .line 140
    const/16 v26, 0x7

    .line 141
    .line 142
    const/16 v27, 0x6

    .line 143
    .line 144
    const/16 v28, 0x5

    .line 145
    .line 146
    move/from16 v29, v3

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    if-eqz v1, :cond_0

    .line 150
    .line 151
    new-instance v1, Lr4/g;

    .line 152
    .line 153
    invoke-direct {v1, v0, v3}, Lr4/g;-><init>(Lr4/p;I)V

    .line 154
    .line 155
    .line 156
    iput-object v1, v0, Lr4/p;->m:Lr4/g;

    .line 157
    .line 158
    move/from16 v18, v6

    .line 159
    .line 160
    new-instance v6, Lr4/h0;

    .line 161
    .line 162
    invoke-direct {v6, v0, v3}, Lr4/h0;-><init>(Lr4/p;I)V

    .line 163
    .line 164
    .line 165
    iput-object v6, v0, Lr4/p;->n:Lr4/h0;

    .line 166
    .line 167
    move/from16 p1, v3

    .line 168
    .line 169
    const/16 v3, 0xf

    .line 170
    .line 171
    new-array v3, v3, [Lr4/o0;

    .line 172
    .line 173
    aput-object v19, v3, p1

    .line 174
    .line 175
    aput-object v13, v3, v18

    .line 176
    .line 177
    aput-object v14, v3, v16

    .line 178
    .line 179
    aput-object v15, v3, v17

    .line 180
    .line 181
    aput-object v9, v3, v29

    .line 182
    .line 183
    aput-object v11, v3, v28

    .line 184
    .line 185
    aput-object v5, v3, v27

    .line 186
    .line 187
    aput-object v1, v3, v26

    .line 188
    .line 189
    aput-object v6, v3, v25

    .line 190
    .line 191
    aput-object v7, v3, v24

    .line 192
    .line 193
    aput-object v20, v3, v23

    .line 194
    .line 195
    aput-object v8, v3, v22

    .line 196
    .line 197
    aput-object v12, v3, v21

    .line 198
    .line 199
    aput-object v10, v3, v4

    .line 200
    .line 201
    const/16 v1, 0xe

    .line 202
    .line 203
    aput-object v2, v3, v1

    .line 204
    .line 205
    iput-object v3, v0, Lr4/p;->q:[Lr4/o0;

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_0
    move/from16 p1, v3

    .line 209
    .line 210
    move/from16 v18, v6

    .line 211
    .line 212
    const/4 v1, 0x0

    .line 213
    iput-object v1, v0, Lr4/p;->m:Lr4/g;

    .line 214
    .line 215
    iput-object v1, v0, Lr4/p;->n:Lr4/h0;

    .line 216
    .line 217
    new-array v1, v4, [Lr4/o0;

    .line 218
    .line 219
    aput-object v19, v1, p1

    .line 220
    .line 221
    aput-object v13, v1, v18

    .line 222
    .line 223
    aput-object v14, v1, v16

    .line 224
    .line 225
    aput-object v15, v1, v17

    .line 226
    .line 227
    aput-object v9, v1, v29

    .line 228
    .line 229
    aput-object v11, v1, v28

    .line 230
    .line 231
    aput-object v5, v1, v27

    .line 232
    .line 233
    aput-object v7, v1, v26

    .line 234
    .line 235
    aput-object v20, v1, v25

    .line 236
    .line 237
    aput-object v8, v1, v24

    .line 238
    .line 239
    aput-object v12, v1, v23

    .line 240
    .line 241
    aput-object v10, v1, v22

    .line 242
    .line 243
    aput-object v2, v1, v21

    .line 244
    .line 245
    iput-object v1, v0, Lr4/p;->q:[Lr4/o0;

    .line 246
    .line 247
    :goto_0
    const/4 v1, -0x1

    .line 248
    iput v1, v0, Lr4/p;->r:I

    .line 249
    .line 250
    const/16 v1, 0x4f

    .line 251
    .line 252
    iput v1, v0, Lr4/p;->s:I

    .line 253
    .line 254
    return-void
.end method


# virtual methods
.method public final a(Lr4/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/p;->k:Lr4/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr4/g;->g:Ljava/util/TreeMap;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p1, Lr4/k;->h:Lv4/d0;

    .line 6
    .line 7
    iget-object v2, v2, Lv4/d0;->g:Lw4/c;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lr4/o0;->g()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v2, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p1, "already added: "

    .line 23
    .line 24
    invoke-static {v2, p1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    const-string p1, "clazz == null"

    .line 29
    .line 30
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final b(Lv4/a;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    instance-of v0, p1, Lv4/c0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr4/p;->f:Lr4/h0;

    .line 8
    .line 9
    check-cast p1, Lv4/c0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lr4/h0;->r(Lv4/c0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    instance-of v0, p1, Lv4/d0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lr4/p;->g:Lr4/h0;

    .line 20
    .line 21
    check-cast p1, Lv4/d0;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of v0, p1, Lv4/e;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lr4/p;->j:Lr4/j0;

    .line 32
    .line 33
    check-cast p1, Lv4/e;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lr4/j0;->m(Lv4/e;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    instance-of v0, p1, Lv4/m;

    .line 40
    .line 41
    iget-object v1, p0, Lr4/p;->i:Lr4/w;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    check-cast p1, Lv4/m;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    instance-of v0, p1, Lv4/l;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    check-cast p1, Lv4/l;

    .line 56
    .line 57
    invoke-virtual {p1}, Lv4/l;->k()Lv4/m;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v1, p1}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    instance-of v0, p1, Lv4/a0;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    check-cast p1, Lv4/a0;

    .line 70
    .line 71
    iget-object p1, p1, Lv4/a0;->g:Lw4/a;

    .line 72
    .line 73
    iget-object v0, p0, Lr4/p;->h:Lr4/h0;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lr4/h0;->s(Lw4/a;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    instance-of v0, p1, Lv4/x;

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iget-object v0, p0, Lr4/p;->n:Lr4/h0;

    .line 84
    .line 85
    check-cast p1, Lv4/x;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lr4/h0;->q(Lv4/x;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    return-void

    .line 91
    :cond_7
    const-string p1, "cst == null"

    .line 92
    .line 93
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final c(ZZ)Lz4/d;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lr4/p;->k:Lr4/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr4/o0;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lr4/p;->l:Lr4/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr4/o0;->d()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Lr4/p;->b:Lr4/k0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lr4/o0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lr4/p;->a:Ln4/a;

    .line 19
    .line 20
    const/16 v3, 0x1a

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ln4/a;->a(I)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget-object v5, v1, Lr4/p;->m:Lr4/g;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Lr4/o0;->d()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v4, v1, Lr4/p;->o:Lr4/k0;

    .line 34
    .line 35
    invoke-virtual {v4}, Lr4/o0;->d()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ln4/a;->a(I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, v1, Lr4/p;->n:Lr4/h0;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v3}, Lr4/o0;->d()V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v2, v1, Lr4/p;->j:Lr4/j0;

    .line 50
    .line 51
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 52
    .line 53
    .line 54
    iget-object v2, v1, Lr4/p;->i:Lr4/w;

    .line 55
    .line 56
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 57
    .line 58
    .line 59
    iget-object v2, v1, Lr4/p;->h:Lr4/h0;

    .line 60
    .line 61
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, Lr4/p;->c:Lr4/k0;

    .line 65
    .line 66
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 67
    .line 68
    .line 69
    iget-object v2, v1, Lr4/p;->g:Lr4/h0;

    .line 70
    .line 71
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 72
    .line 73
    .line 74
    iget-object v2, v1, Lr4/p;->f:Lr4/h0;

    .line 75
    .line 76
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 77
    .line 78
    .line 79
    iget-object v2, v1, Lr4/p;->e:Lr4/k0;

    .line 80
    .line 81
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, Lr4/p;->p:Lr4/h0;

    .line 85
    .line 86
    invoke-virtual {v2}, Lr4/o0;->d()V

    .line 87
    .line 88
    .line 89
    iget-object v2, v1, Lr4/p;->q:[Lr4/o0;

    .line 90
    .line 91
    array-length v4, v2

    .line 92
    const/4 v6, 0x0

    .line 93
    move v7, v6

    .line 94
    move v8, v7

    .line 95
    :goto_0
    const-string v9, "...while writing section "

    .line 96
    .line 97
    const/4 v10, 0x1

    .line 98
    if-ge v7, v4, :cond_9

    .line 99
    .line 100
    aget-object v11, v2, v7

    .line 101
    .line 102
    if-eq v11, v5, :cond_2

    .line 103
    .line 104
    if-ne v11, v3, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-virtual {v11}, Lr4/o0;->c()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    if-eqz v12, :cond_3

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    if-ltz v8, :cond_8

    .line 118
    .line 119
    iget v12, v11, Lr4/o0;->d:I

    .line 120
    .line 121
    if-gez v12, :cond_7

    .line 122
    .line 123
    iget v12, v11, Lr4/o0;->c:I

    .line 124
    .line 125
    sub-int/2addr v12, v10

    .line 126
    add-int v10, v8, v12

    .line 127
    .line 128
    not-int v12, v12

    .line 129
    and-int/2addr v10, v12

    .line 130
    iput v10, v11, Lr4/o0;->d:I

    .line 131
    .line 132
    if-lt v10, v8, :cond_6

    .line 133
    .line 134
    iget-object v8, v1, Lr4/p;->d:Lr4/k0;

    .line 135
    .line 136
    if-ne v11, v8, :cond_4

    .line 137
    .line 138
    :try_start_0
    invoke-static {v2, v8}, Lr4/c0;->n([Lr4/o0;Lr4/k0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Lr4/o0;->d()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :catch_0
    move-exception v0

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    :goto_1
    instance-of v8, v11, Lr4/k0;

    .line 148
    .line 149
    if-eqz v8, :cond_5

    .line 150
    .line 151
    move-object v8, v11

    .line 152
    check-cast v8, Lr4/k0;

    .line 153
    .line 154
    invoke-virtual {v8}, Lr4/k0;->m()V

    .line 155
    .line 156
    .line 157
    :cond_5
    invoke-virtual {v11}, Lr4/o0;->h()I

    .line 158
    .line 159
    .line 160
    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    add-int/2addr v8, v10

    .line 162
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v2, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    throw v0

    .line 182
    :cond_6
    const-string v0, "bogus placement for section "

    .line 183
    .line 184
    invoke-static {v7, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_4
    const/4 v0, 0x0

    .line 192
    return-object v0

    .line 193
    :cond_7
    const-string v0, "fileOffset already set"

    .line 194
    .line 195
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const-string v0, "fileOffset < 0"

    .line 203
    .line 204
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_9
    iput v8, v1, Lr4/p;->r:I

    .line 209
    .line 210
    new-array v7, v8, [B

    .line 211
    .line 212
    new-instance v8, Lz4/d;

    .line 213
    .line 214
    invoke-direct {v8, v7, v6}, Lz4/d;-><init>([BZ)V

    .line 215
    .line 216
    .line 217
    const/16 v11, 0xa

    .line 218
    .line 219
    if-eqz p1, :cond_d

    .line 220
    .line 221
    const/16 v12, 0x28

    .line 222
    .line 223
    iget v13, v1, Lr4/p;->s:I

    .line 224
    .line 225
    if-lt v13, v12, :cond_c

    .line 226
    .line 227
    add-int/lit8 v12, v13, -0x7

    .line 228
    .line 229
    div-int/lit8 v12, v12, 0xf

    .line 230
    .line 231
    add-int/2addr v12, v10

    .line 232
    and-int/lit8 v12, v12, -0x2

    .line 233
    .line 234
    const/4 v14, 0x6

    .line 235
    if-ge v12, v14, :cond_a

    .line 236
    .line 237
    move v12, v14

    .line 238
    goto :goto_5

    .line 239
    :cond_a
    if-le v12, v11, :cond_b

    .line 240
    .line 241
    move v12, v11

    .line 242
    :cond_b
    :goto_5
    new-instance v14, Ljava/util/ArrayList;

    .line 243
    .line 244
    const/16 v15, 0x3e8

    .line 245
    .line 246
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    iput-object v14, v8, Lz4/d;->e:Ljava/util/ArrayList;

    .line 250
    .line 251
    iput v13, v8, Lz4/d;->f:I

    .line 252
    .line 253
    iput v12, v8, Lz4/d;->g:I

    .line 254
    .line 255
    move/from16 v12, p2

    .line 256
    .line 257
    iput-boolean v12, v8, Lz4/d;->d:Z

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_c
    const-string v0, "annotationWidth < 40"

    .line 261
    .line 262
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_d
    :goto_6
    move v12, v6

    .line 267
    :goto_7
    if-ge v12, v4, :cond_12

    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    :try_start_1
    aget-object v14, v2, v12

    .line 271
    .line 272
    if-eq v14, v5, :cond_e

    .line 273
    .line 274
    if-ne v14, v3, :cond_f

    .line 275
    .line 276
    :cond_e
    invoke-virtual {v14}, Lr4/o0;->c()Ljava/util/Collection;

    .line 277
    .line 278
    .line 279
    move-result-object v15

    .line 280
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    if-eqz v15, :cond_f

    .line 285
    .line 286
    move/from16 v16, v10

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_f
    invoke-virtual {v14}, Lr4/o0;->b()I

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    move/from16 v16, v10

    .line 294
    .line 295
    iget v10, v8, Lz4/d;->c:I

    .line 296
    .line 297
    sub-int/2addr v15, v10

    .line 298
    if-ltz v15, :cond_10

    .line 299
    .line 300
    invoke-virtual {v8, v15}, Lz4/d;->o(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v14, v8}, Lr4/o0;->i(Lz4/d;)V

    .line 304
    .line 305
    .line 306
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 307
    .line 308
    move/from16 v10, v16

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :catch_1
    move-exception v0

    .line 312
    goto :goto_9

    .line 313
    :cond_10
    new-instance v0, Lf4/a;

    .line 314
    .line 315
    new-instance v2, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const-string v3, "excess write of "

    .line 321
    .line 322
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    neg-int v3, v15

    .line 326
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-direct {v0, v2, v13}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 334
    .line 335
    .line 336
    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 337
    :goto_9
    instance-of v2, v0, Lf4/a;

    .line 338
    .line 339
    if-eqz v2, :cond_11

    .line 340
    .line 341
    check-cast v0, Lf4/a;

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_11
    new-instance v2, Lf4/a;

    .line 345
    .line 346
    invoke-direct {v2, v13, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 347
    .line 348
    .line 349
    move-object v0, v2

    .line 350
    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v0, v2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_12
    move/from16 v16, v10

    .line 367
    .line 368
    iget v3, v8, Lz4/d;->c:I

    .line 369
    .line 370
    iget v4, v1, Lr4/p;->r:I

    .line 371
    .line 372
    if-ne v3, v4, :cond_24

    .line 373
    .line 374
    const-string v4, "unexpected digest write: "

    .line 375
    .line 376
    :try_start_2
    const-string v5, "SHA-1"

    .line 377
    .line 378
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 379
    .line 380
    .line 381
    move-result-object v5
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3

    .line 382
    const/16 v9, 0x20

    .line 383
    .line 384
    sub-int/2addr v3, v9

    .line 385
    invoke-virtual {v5, v7, v9, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 386
    .line 387
    .line 388
    const/16 v3, 0xc

    .line 389
    .line 390
    const/16 v10, 0x14

    .line 391
    .line 392
    :try_start_3
    invoke-virtual {v5, v7, v3, v10}, Ljava/security/MessageDigest;->digest([BII)I

    .line 393
    .line 394
    .line 395
    move-result v5
    :try_end_3
    .catch Ljava/security/DigestException; {:try_start_3 .. :try_end_3} :catch_2

    .line 396
    if-ne v5, v10, :cond_23

    .line 397
    .line 398
    iget v4, v8, Lz4/d;->c:I

    .line 399
    .line 400
    new-instance v5, Ljava/util/zip/Adler32;

    .line 401
    .line 402
    invoke-direct {v5}, Ljava/util/zip/Adler32;-><init>()V

    .line 403
    .line 404
    .line 405
    sub-int/2addr v4, v3

    .line 406
    invoke-virtual {v5, v7, v3, v4}, Ljava/util/zip/Adler32;->update([BII)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v5}, Ljava/util/zip/Adler32;->getValue()J

    .line 410
    .line 411
    .line 412
    move-result-wide v3

    .line 413
    long-to-int v3, v3

    .line 414
    const/16 v4, 0x8

    .line 415
    .line 416
    int-to-byte v5, v3

    .line 417
    aput-byte v5, v7, v4

    .line 418
    .line 419
    shr-int/lit8 v4, v3, 0x8

    .line 420
    .line 421
    int-to-byte v4, v4

    .line 422
    const/16 v5, 0x9

    .line 423
    .line 424
    aput-byte v4, v7, v5

    .line 425
    .line 426
    shr-int/lit8 v4, v3, 0x10

    .line 427
    .line 428
    int-to-byte v4, v4

    .line 429
    aput-byte v4, v7, v11

    .line 430
    .line 431
    shr-int/lit8 v3, v3, 0x18

    .line 432
    .line 433
    int-to-byte v3, v3

    .line 434
    const/16 v4, 0xb

    .line 435
    .line 436
    aput-byte v3, v7, v4

    .line 437
    .line 438
    if-eqz p1, :cond_22

    .line 439
    .line 440
    sget-object v3, Lr4/b0;->x:Lr4/b0;

    .line 441
    .line 442
    invoke-virtual {v0}, Lr4/o0;->f()V

    .line 443
    .line 444
    .line 445
    new-instance v4, Ljava/util/TreeMap;

    .line 446
    .line 447
    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 448
    .line 449
    .line 450
    iget-object v0, v0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    :cond_13
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-eqz v5, :cond_14

    .line 461
    .line 462
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    check-cast v5, Lr4/l0;

    .line 467
    .line 468
    invoke-virtual {v5}, Lr4/a0;->b()Lr4/b0;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    if-ne v7, v3, :cond_13

    .line 473
    .line 474
    invoke-virtual {v5}, Lr4/l0;->l()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    invoke-virtual {v4, v7, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_14
    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-nez v0, :cond_15

    .line 487
    .line 488
    goto :goto_d

    .line 489
    :cond_15
    const-string v0, "\nmethod code index:\n\n"

    .line 490
    .line 491
    invoke-virtual {v8, v6, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    if-eqz v3, :cond_16

    .line 507
    .line 508
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    check-cast v3, Ljava/util/Map$Entry;

    .line 513
    .line 514
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    check-cast v4, Ljava/lang/String;

    .line 519
    .line 520
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Lr4/l0;

    .line 525
    .line 526
    new-instance v5, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Lr4/l0;->g()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    invoke-virtual {v8, v6, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 552
    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_16
    :goto_d
    new-instance v0, Ljava/util/HashMap;

    .line 556
    .line 557
    const/16 v3, 0x32

    .line 558
    .line 559
    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 560
    .line 561
    .line 562
    array-length v3, v2

    .line 563
    move v4, v6

    .line 564
    :goto_e
    if-ge v4, v3, :cond_1b

    .line 565
    .line 566
    aget-object v5, v2, v4

    .line 567
    .line 568
    invoke-virtual {v5}, Lr4/o0;->c()Ljava/util/Collection;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    :cond_17
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    if-eqz v7, :cond_1a

    .line 581
    .line 582
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    check-cast v7, Lr4/a0;

    .line 587
    .line 588
    invoke-virtual {v7}, Lr4/a0;->b()Lr4/b0;

    .line 589
    .line 590
    .line 591
    move-result-object v9

    .line 592
    iget-object v9, v9, Lr4/b0;->i:Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v10

    .line 598
    check-cast v10, Lr4/p0;

    .line 599
    .line 600
    if-nez v10, :cond_18

    .line 601
    .line 602
    new-instance v10, Lr4/p0;

    .line 603
    .line 604
    invoke-direct {v10, v7, v9}, Lr4/p0;-><init>(Lr4/a0;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_18
    invoke-virtual {v7}, Lr4/a0;->c()I

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    iget v9, v10, Lr4/p0;->b:I

    .line 616
    .line 617
    add-int/lit8 v9, v9, 0x1

    .line 618
    .line 619
    iput v9, v10, Lr4/p0;->b:I

    .line 620
    .line 621
    iget v9, v10, Lr4/p0;->c:I

    .line 622
    .line 623
    add-int/2addr v9, v7

    .line 624
    iput v9, v10, Lr4/p0;->c:I

    .line 625
    .line 626
    iget v9, v10, Lr4/p0;->d:I

    .line 627
    .line 628
    if-le v7, v9, :cond_19

    .line 629
    .line 630
    iput v7, v10, Lr4/p0;->d:I

    .line 631
    .line 632
    :cond_19
    iget v9, v10, Lr4/p0;->e:I

    .line 633
    .line 634
    if-ge v7, v9, :cond_17

    .line 635
    .line 636
    iput v7, v10, Lr4/p0;->e:I

    .line 637
    .line 638
    goto :goto_f

    .line 639
    :cond_1a
    add-int/lit8 v4, v4, 0x1

    .line 640
    .line 641
    goto :goto_e

    .line 642
    :cond_1b
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-nez v2, :cond_1c

    .line 647
    .line 648
    goto/16 :goto_14

    .line 649
    .line 650
    :cond_1c
    const-string v2, "\nstatistics:\n"

    .line 651
    .line 652
    invoke-virtual {v8, v6, v2}, Lz4/d;->b(ILjava/lang/String;)V

    .line 653
    .line 654
    .line 655
    new-instance v2, Ljava/util/TreeMap;

    .line 656
    .line 657
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    if-eqz v3, :cond_1d

    .line 673
    .line 674
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    check-cast v3, Lr4/p0;

    .line 679
    .line 680
    iget-object v4, v3, Lr4/p0;->a:Ljava/lang/String;

    .line 681
    .line 682
    invoke-virtual {v2, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    goto :goto_10

    .line 686
    :cond_1d
    invoke-virtual {v2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    if-eqz v2, :cond_20

    .line 699
    .line 700
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    check-cast v2, Lr4/p0;

    .line 705
    .line 706
    new-instance v3, Ljava/lang/StringBuilder;

    .line 707
    .line 708
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 709
    .line 710
    .line 711
    new-instance v4, Ljava/lang/StringBuilder;

    .line 712
    .line 713
    const-string v5, "  "

    .line 714
    .line 715
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    iget-object v5, v2, Lr4/p0;->a:Ljava/lang/String;

    .line 719
    .line 720
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    const-string v5, ": "

    .line 724
    .line 725
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    iget v5, v2, Lr4/p0;->b:I

    .line 729
    .line 730
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    const-string v5, " item"

    .line 734
    .line 735
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    iget v5, v2, Lr4/p0;->b:I

    .line 739
    .line 740
    move/from16 v6, v16

    .line 741
    .line 742
    if-ne v5, v6, :cond_1e

    .line 743
    .line 744
    const-string v5, ""

    .line 745
    .line 746
    goto :goto_12

    .line 747
    :cond_1e
    const-string v5, "s"

    .line 748
    .line 749
    :goto_12
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    const-string v5, "; "

    .line 753
    .line 754
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    iget v5, v2, Lr4/p0;->c:I

    .line 758
    .line 759
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    const-string v5, " bytes total\n"

    .line 763
    .line 764
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    iget v4, v2, Lr4/p0;->e:I

    .line 775
    .line 776
    iget v5, v2, Lr4/p0;->d:I

    .line 777
    .line 778
    const-string v7, "    "

    .line 779
    .line 780
    if-ne v4, v5, :cond_1f

    .line 781
    .line 782
    new-instance v4, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    iget v2, v2, Lr4/p0;->e:I

    .line 788
    .line 789
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    const-string v2, " bytes/item\n"

    .line 793
    .line 794
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    goto :goto_13

    .line 805
    :cond_1f
    iget v4, v2, Lr4/p0;->c:I

    .line 806
    .line 807
    iget v5, v2, Lr4/p0;->b:I

    .line 808
    .line 809
    div-int/2addr v4, v5

    .line 810
    new-instance v5, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    iget v7, v2, Lr4/p0;->e:I

    .line 816
    .line 817
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    const-string v7, ".."

    .line 821
    .line 822
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    iget v2, v2, Lr4/p0;->d:I

    .line 826
    .line 827
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    const-string v2, " bytes/item; average "

    .line 831
    .line 832
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    const-string v2, "\n"

    .line 839
    .line 840
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    :goto_13
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    invoke-virtual {v8, v2}, Lz4/d;->c(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    move/from16 v16, v6

    .line 858
    .line 859
    goto/16 :goto_11

    .line 860
    .line 861
    :cond_20
    :goto_14
    invoke-virtual {v8}, Lz4/d;->e()V

    .line 862
    .line 863
    .line 864
    iget-object v0, v8, Lz4/d;->e:Ljava/util/ArrayList;

    .line 865
    .line 866
    if-eqz v0, :cond_22

    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    :goto_15
    if-lez v0, :cond_22

    .line 873
    .line 874
    iget-object v2, v8, Lz4/d;->e:Ljava/util/ArrayList;

    .line 875
    .line 876
    add-int/lit8 v3, v0, -0x1

    .line 877
    .line 878
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    check-cast v2, Lz4/c;

    .line 883
    .line 884
    iget v4, v2, Lz4/c;->a:I

    .line 885
    .line 886
    iget v5, v8, Lz4/d;->c:I

    .line 887
    .line 888
    if-le v4, v5, :cond_21

    .line 889
    .line 890
    iget-object v2, v8, Lz4/d;->e:Ljava/util/ArrayList;

    .line 891
    .line 892
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    add-int/lit8 v0, v0, -0x1

    .line 896
    .line 897
    goto :goto_15

    .line 898
    :cond_21
    iget v0, v2, Lz4/c;->b:I

    .line 899
    .line 900
    if-le v0, v5, :cond_22

    .line 901
    .line 902
    iput v5, v2, Lz4/c;->b:I

    .line 903
    .line 904
    :cond_22
    return-object v8

    .line 905
    :cond_23
    :try_start_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 906
    .line 907
    new-instance v2, Ljava/lang/StringBuilder;

    .line 908
    .line 909
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    const-string v3, " bytes"

    .line 916
    .line 917
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    throw v0
    :try_end_4
    .catch Ljava/security/DigestException; {:try_start_4 .. :try_end_4} :catch_2

    .line 928
    :catch_2
    move-exception v0

    .line 929
    new-instance v2, Ljava/lang/RuntimeException;

    .line 930
    .line 931
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 932
    .line 933
    .line 934
    throw v2

    .line 935
    :catch_3
    move-exception v0

    .line 936
    new-instance v2, Ljava/lang/RuntimeException;

    .line 937
    .line 938
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 939
    .line 940
    .line 941
    throw v2

    .line 942
    :cond_24
    const-string v0, "foreshortened write"

    .line 943
    .line 944
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    goto/16 :goto_4
.end method

.method public final d(Ljava/io/ByteArrayOutputStream;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1, v0}, Lr4/p;->c(ZZ)Lz4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lz4/d;->b:[B

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
