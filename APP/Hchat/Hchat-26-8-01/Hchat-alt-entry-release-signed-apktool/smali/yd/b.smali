.class public final Lyd/b;
.super Lmd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final i:I

.field public final j:Ljava/util/List;

.field public final k:Lxe/e;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 33
    iput p1, p0, Lyd/b;->i:I

    .line 34
    iput-object p2, p0, Lyd/b;->j:Ljava/util/List;

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lyd/b;->k:Lxe/e;

    return-void
.end method

.method public constructor <init>(Lxe/e;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Lmd/e;-><init>()V

    const/4 v0, 0x1

    .line 37
    iput v0, p0, Lyd/b;->i:I

    .line 38
    iput-object p1, p0, Lyd/b;->k:Lxe/e;

    .line 39
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lyd/b;->j:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lyd/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lyd/b;->i:I

    .line 5
    .line 6
    iput v0, p0, Lyd/b;->i:I

    .line 7
    .line 8
    iget-object v0, p1, Lyd/b;->k:Lxe/e;

    .line 9
    .line 10
    iput-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 11
    .line 12
    iget v0, p1, Lyd/b;->i:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object p1, p0, Lyd/b;->j:Ljava/util/List;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object p1, p1, Lyd/b;->j:Ljava/util/List;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 30
    .line 31
    return-void
.end method

.method public static K(Lyd/b;)Lyd/b;
    .locals 5

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lyd/b;->j:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_6

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x2

    .line 13
    if-eq v2, v3, :cond_5

    .line 14
    .line 15
    if-eq v2, v4, :cond_4

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    const/4 v3, 0x4

    .line 19
    if-eq v2, p0, :cond_1

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v0}, Lwb/en;->q(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "Unknown mode for invert: "

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lyd/b;

    .line 63
    .line 64
    invoke-static {v2}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v1, Lyd/b;

    .line 73
    .line 74
    if-ne v0, v3, :cond_3

    .line 75
    .line 76
    const/4 v3, 0x5

    .line 77
    :cond_3
    invoke-direct {v1, v3, p0}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    invoke-virtual {p0}, Lyd/b;->H()Lyd/b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_5
    invoke-virtual {p0}, Lyd/b;->H()Lyd/b;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lyd/b;

    .line 95
    .line 96
    invoke-static {v0}, Lyd/b;->M(Lyd/b;)Lyd/b;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lyd/b;

    .line 105
    .line 106
    invoke-static {v1}, Lyd/b;->M(Lyd/b;)Lyd/b;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Lyd/b;

    .line 111
    .line 112
    filled-new-array {p0, v0, v1}, [Lyd/b;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-direct {v2, v4, p0}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 121
    .line 122
    .line 123
    return-object v2

    .line 124
    :cond_6
    new-instance v0, Lyd/b;

    .line 125
    .line 126
    iget-object p0, p0, Lyd/b;->k:Lxe/e;

    .line 127
    .line 128
    iget-object v1, p0, Lxe/e;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lpd/i;

    .line 131
    .line 132
    invoke-virtual {v1}, Lpd/i;->l0()V

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, p0}, Lyd/b;-><init>(Lxe/e;)V

    .line 136
    .line 137
    .line 138
    return-object v0
.end method

.method public static M(Lyd/b;)Lyd/b;
    .locals 2

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lyd/b;->H()Lyd/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance p0, Lyd/b;

    .line 16
    .line 17
    iget-object v1, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lpd/i;

    .line 20
    .line 21
    invoke-virtual {v1}, Lpd/i;->l0()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, Lyd/b;-><init>(Lxe/e;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance v0, Lyd/b;

    .line 29
    .line 30
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, v1, p0}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static O(Lyd/b;)Lyd/b;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Lyd/b;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v5, 0x3

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    if-eqz v0, :cond_10

    .line 10
    .line 11
    move-object/from16 v0, p0

    .line 12
    .line 13
    iget-object v8, v0, Lyd/b;->k:Lxe/e;

    .line 14
    .line 15
    iget-object v9, v8, Lxe/e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v9, Lpd/i;

    .line 18
    .line 19
    iget-object v10, v8, Lxe/e;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v10, Lpd/i;

    .line 22
    .line 23
    invoke-virtual {v9, v6}, Lud/p;->S(I)Lqd/l;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    instance-of v9, v9, Lqd/m;

    .line 31
    .line 32
    if-nez v9, :cond_1

    .line 33
    .line 34
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v8}, Lxe/e;->a()Lqd/l;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    instance-of v9, v9, Lqd/n;

    .line 45
    .line 46
    if-nez v9, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v8}, Lxe/e;->a()Lqd/l;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Lqd/n;

    .line 54
    .line 55
    iget-wide v11, v9, Lqd/n;->l:J

    .line 56
    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    cmp-long v9, v11, v13

    .line 60
    .line 61
    const-wide/16 v15, 0x1

    .line 62
    .line 63
    if-eqz v9, :cond_3

    .line 64
    .line 65
    cmp-long v17, v11, v15

    .line 66
    .line 67
    if-eqz v17, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v10, v6}, Lud/p;->S(I)Lqd/l;

    .line 71
    .line 72
    .line 73
    move-result-object v17

    .line 74
    move-object/from16 v4, v17

    .line 75
    .line 76
    check-cast v4, Lqd/m;

    .line 77
    .line 78
    iget-object v4, v4, Lqd/m;->l:Lud/p;

    .line 79
    .line 80
    move-wide/from16 v18, v15

    .line 81
    .line 82
    iget-object v15, v4, Lud/p;->k:Lpd/k;

    .line 83
    .line 84
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    if-eq v15, v5, :cond_5

    .line 89
    .line 90
    const/16 v11, 0xd

    .line 91
    .line 92
    if-eq v15, v11, :cond_4

    .line 93
    .line 94
    const/16 v11, 0xe

    .line 95
    .line 96
    if-eq v15, v11, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    if-nez v9, :cond_0

    .line 100
    .line 101
    iget v9, v10, Lpd/i;->p:I

    .line 102
    .line 103
    invoke-virtual {v4, v6}, Lud/p;->S(I)Lqd/l;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-virtual {v4, v7}, Lud/p;->S(I)Lqd/l;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    iput v9, v10, Lpd/i;->p:I

    .line 112
    .line 113
    invoke-virtual {v10, v6, v11}, Lud/p;->c0(ILqd/l;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v10, v7, v4}, Lud/p;->c0(ILqd/l;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    invoke-virtual {v8}, Lxe/e;->a()Lqd/l;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    invoke-virtual {v15}, Lqd/l;->I()Lqd/j;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    sget-object v1, Lqd/j;->c:Lqd/g;

    .line 129
    .line 130
    if-ne v15, v1, :cond_0

    .line 131
    .line 132
    move-object v15, v4

    .line 133
    check-cast v15, Lpd/a;

    .line 134
    .line 135
    iget v15, v15, Lpd/a;->o:I

    .line 136
    .line 137
    const/4 v2, 0x6

    .line 138
    const/4 v5, 0x7

    .line 139
    if-eq v15, v5, :cond_6

    .line 140
    .line 141
    if-ne v15, v2, :cond_0

    .line 142
    .line 143
    :cond_6
    iget v13, v10, Lpd/i;->p:I

    .line 144
    .line 145
    if-ne v13, v3, :cond_7

    .line 146
    .line 147
    if-eqz v9, :cond_8

    .line 148
    .line 149
    :cond_7
    if-ne v13, v7, :cond_9

    .line 150
    .line 151
    cmp-long v9, v11, v18

    .line 152
    .line 153
    if-nez v9, :cond_9

    .line 154
    .line 155
    :cond_8
    move v9, v7

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    move v9, v6

    .line 158
    :goto_1
    if-eqz v9, :cond_a

    .line 159
    .line 160
    move v11, v3

    .line 161
    goto :goto_2

    .line 162
    :cond_a
    move v11, v7

    .line 163
    :goto_2
    if-eqz v9, :cond_b

    .line 164
    .line 165
    if-eq v15, v5, :cond_c

    .line 166
    .line 167
    :cond_b
    if-nez v9, :cond_d

    .line 168
    .line 169
    if-ne v15, v2, :cond_d

    .line 170
    .line 171
    :cond_c
    const/4 v2, 0x5

    .line 172
    goto :goto_3

    .line 173
    :cond_d
    const/4 v2, 0x4

    .line 174
    :goto_3
    new-instance v5, Lpd/i;

    .line 175
    .line 176
    invoke-virtual {v4, v6}, Lud/p;->S(I)Lqd/l;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    new-instance v12, Lqd/n;

    .line 181
    .line 182
    const-wide/16 v13, 0x0

    .line 183
    .line 184
    invoke-direct {v12, v13, v14, v1}, Lqd/n;-><init>(JLqd/j;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v5, v11, v9, v12}, Lpd/i;-><init>(ILqd/l;Lqd/n;)V

    .line 188
    .line 189
    .line 190
    new-instance v9, Lpd/i;

    .line 191
    .line 192
    invoke-virtual {v4, v7}, Lud/p;->S(I)Lqd/l;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    new-instance v12, Lqd/n;

    .line 197
    .line 198
    invoke-direct {v12, v13, v14, v1}, Lqd/n;-><init>(JLqd/j;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v9, v11, v4, v12}, Lpd/i;-><init>(ILqd/l;Lqd/n;)V

    .line 202
    .line 203
    .line 204
    new-instance v1, Lyd/b;

    .line 205
    .line 206
    new-instance v4, Lyd/b;

    .line 207
    .line 208
    new-instance v11, Lxe/e;

    .line 209
    .line 210
    invoke-direct {v11, v5}, Lxe/e;-><init>(Lpd/i;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v4, v11}, Lyd/b;-><init>(Lxe/e;)V

    .line 214
    .line 215
    .line 216
    new-instance v5, Lyd/b;

    .line 217
    .line 218
    new-instance v11, Lxe/e;

    .line 219
    .line 220
    invoke-direct {v11, v9}, Lxe/e;-><init>(Lpd/i;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v5, v11}, Lyd/b;-><init>(Lxe/e;)V

    .line 224
    .line 225
    .line 226
    filled-new-array {v4, v5}, [Lyd/b;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-direct {v1, v2, v4}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 235
    .line 236
    .line 237
    :goto_4
    if-eqz v1, :cond_e

    .line 238
    .line 239
    return-object v1

    .line 240
    :cond_e
    iget v1, v10, Lpd/i;->p:I

    .line 241
    .line 242
    if-ne v1, v7, :cond_f

    .line 243
    .line 244
    invoke-virtual {v8}, Lxe/e;->a()Lqd/l;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v1}, Lqd/l;->L()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_f

    .line 253
    .line 254
    new-instance v0, Lyd/b;

    .line 255
    .line 256
    new-instance v1, Lyd/b;

    .line 257
    .line 258
    invoke-virtual {v10}, Lpd/i;->l0()V

    .line 259
    .line 260
    .line 261
    invoke-direct {v1, v8}, Lyd/b;-><init>(Lxe/e;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const/4 v2, 0x3

    .line 269
    invoke-direct {v0, v2, v1}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_f
    invoke-virtual {v10}, Lpd/i;->m0()V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_10
    move-object/from16 v0, p0

    .line 278
    .line 279
    :goto_5
    iget-object v1, v0, Lyd/b;->j:Ljava/util/List;

    .line 280
    .line 281
    move v2, v6

    .line 282
    const/4 v4, 0x0

    .line 283
    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-ge v2, v5, :cond_13

    .line 288
    .line 289
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    check-cast v5, Lyd/b;

    .line 294
    .line 295
    invoke-static {v5}, Lyd/b;->O(Lyd/b;)Lyd/b;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    if-eq v8, v5, :cond_12

    .line 300
    .line 301
    if-nez v4, :cond_11

    .line 302
    .line 303
    new-instance v4, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 306
    .line 307
    .line 308
    :cond_11
    invoke-interface {v4, v2, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_13
    if-eqz v4, :cond_14

    .line 315
    .line 316
    new-instance v1, Lyd/b;

    .line 317
    .line 318
    iget v0, v0, Lyd/b;->i:I

    .line 319
    .line 320
    invoke-direct {v1, v0, v4}, Lyd/b;-><init>(ILjava/util/List;)V

    .line 321
    .line 322
    .line 323
    move-object v0, v1

    .line 324
    :cond_14
    iget v1, v0, Lyd/b;->i:I

    .line 325
    .line 326
    const/4 v2, 0x3

    .line 327
    if-ne v1, v2, :cond_15

    .line 328
    .line 329
    invoke-virtual {v0}, Lyd/b;->H()Lyd/b;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iget v1, v1, Lyd/b;->i:I

    .line 334
    .line 335
    if-ne v1, v2, :cond_15

    .line 336
    .line 337
    invoke-virtual {v0}, Lyd/b;->H()Lyd/b;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :cond_15
    iget v1, v0, Lyd/b;->i:I

    .line 346
    .line 347
    if-ne v1, v3, :cond_16

    .line 348
    .line 349
    invoke-virtual {v0}, Lyd/b;->H()Lyd/b;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iget v1, v1, Lyd/b;->i:I

    .line 354
    .line 355
    if-ne v1, v2, :cond_16

    .line 356
    .line 357
    invoke-static {v0}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    :cond_16
    iget v1, v0, Lyd/b;->i:I

    .line 362
    .line 363
    iget-object v2, v0, Lyd/b;->j:Ljava/util/List;

    .line 364
    .line 365
    const/4 v4, 0x5

    .line 366
    if-eq v1, v4, :cond_17

    .line 367
    .line 368
    const/4 v4, 0x4

    .line 369
    if-ne v1, v4, :cond_1b

    .line 370
    .line 371
    :cond_17
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-le v1, v7, :cond_1b

    .line 376
    .line 377
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    :cond_18
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_1a

    .line 386
    .line 387
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Lyd/b;

    .line 392
    .line 393
    iget v5, v4, Lyd/b;->i:I

    .line 394
    .line 395
    const/4 v7, 0x3

    .line 396
    if-eq v5, v7, :cond_19

    .line 397
    .line 398
    invoke-virtual {v4}, Lyd/b;->L()Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_18

    .line 403
    .line 404
    iget-object v4, v4, Lyd/b;->k:Lxe/e;

    .line 405
    .line 406
    iget-object v4, v4, Lxe/e;->b:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v4, Lpd/i;

    .line 409
    .line 410
    iget v4, v4, Lpd/i;->p:I

    .line 411
    .line 412
    if-ne v4, v3, :cond_18

    .line 413
    .line 414
    :cond_19
    add-int/lit8 v6, v6, 0x1

    .line 415
    .line 416
    goto :goto_7

    .line 417
    :cond_1a
    div-int/2addr v1, v3

    .line 418
    if-le v6, v1, :cond_1b

    .line 419
    .line 420
    invoke-static {v0}, Lyd/b;->K(Lyd/b;)Lyd/b;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v0}, Lyd/b;->M(Lyd/b;)Lyd/b;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    :cond_1b
    return-object v0
.end method


# virtual methods
.method public final H()Lyd/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lyd/b;

    .line 9
    .line 10
    return-object v0
.end method

.method public final I()Lud/p;
    .locals 2

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 7
    .line 8
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lpd/i;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    iget-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lyd/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Lyd/b;->I()Lud/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public final J()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lyd/b;->i:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lyd/b;->k:Lxe/e;

    .line 12
    .line 13
    iget-object v1, v1, Lxe/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lpd/i;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lud/p;->U(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v1, p0, Lyd/b;->j:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lyd/b;

    .line 38
    .line 39
    invoke-virtual {v2}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v0
.end method

.method public final L()Z
    .locals 2

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final N(Lqd/l;Lqd/l;)Z
    .locals 3

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 7
    .line 8
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lpd/i;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    iget-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lyd/b;

    .line 34
    .line 35
    invoke-virtual {v2, p1, p2}, Lyd/b;->N(Lqd/l;Lqd/l;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    return p1
.end method

.method public final P(Ljava/util/function/Consumer;)V
    .locals 2

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 7
    .line 8
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lpd/i;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lud/p;->h0(Ljava/util/function/Consumer;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lae/g;

    .line 17
    .line 18
    const/16 v1, 0x17

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lyd/b;->j:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lyd/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lyd/b;

    .line 10
    .line 11
    iget v0, p0, Lyd/b;->i:I

    .line 12
    .line 13
    iget v1, p1, Lyd/b;->i:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    iget-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, p1, Lyd/b;->j:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 29
    .line 30
    iget-object p1, p1, Lyd/b;->k:Lxe/e;

    .line 31
    .line 32
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    :goto_0
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget v1, p0, Lyd/b;->i:I

    .line 8
    .line 9
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lyd/b;->j:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget-object v1, p0, Lyd/b;->k:Lxe/e;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    add-int/2addr v0, v1

    .line 36
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lyd/b;->i:I

    .line 2
    .line 3
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_6

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    iget-object v4, p0, Lyd/b;->j:Ljava/util/List;

    .line 12
    .line 13
    if-eq v1, v3, :cond_5

    .line 14
    .line 15
    if-eq v1, v2, :cond_4

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    const-string v0, "??"

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    const/4 v1, 0x5

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    const-string v0, " || "

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v0, " && "

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "("

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lyd/b;

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const/16 v0, 0x29

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :cond_4
    invoke-virtual {p0}, Lyd/b;->H()Lyd/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "!("

    .line 89
    .line 90
    const-string v2, ")"

    .line 91
    .line 92
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_5
    invoke-virtual {p0}, Lyd/b;->H()Lyd/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Lyd/b;

    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lyd/b;

    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v3, " ? "

    .line 126
    .line 127
    const-string v4, " : "

    .line 128
    .line 129
    invoke-static {v0, v3, v1, v4, v2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :cond_6
    iget-object v0, p0, Lyd/b;->k:Lxe/e;

    .line 135
    .line 136
    invoke-virtual {v0}, Lxe/e;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
.end method
