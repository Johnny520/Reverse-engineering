.class public final Lbe/l;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Comparable;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lbe/l;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lbe/l;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbe/l;->h:Ljava/lang/Comparable;

    .line 8
    .line 9
    iput-object p2, p0, Lbe/l;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public static j(Lbe/k;Lud/g;Ltd/a;)Lnd/g;
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
    iget-object v3, v0, Lbe/k;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lud/e;

    .line 10
    .line 11
    iget-object v4, v2, Lud/p;->m:Ljava/util/List;

    .line 12
    .line 13
    iget-object v5, v2, Ltd/a;->o:Lod/d;

    .line 14
    .line 15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v4, v6, :cond_1

    .line 21
    .line 22
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 23
    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :cond_1
    iget-object v4, v0, Lbe/k;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object v6, v5, Lod/d;->j:Lod/a;

    .line 31
    .line 32
    iget-object v8, v3, Lud/e;->k:Lud/u;

    .line 33
    .line 34
    invoke-virtual {v8, v6}, Lud/u;->f(Lod/a;)Lud/e;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-nez v6, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v6, v3}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    sget-object v8, Lmd/b;->h:Lmd/b;

    .line 49
    .line 50
    iget-object v6, v6, Lmd/e;->g:Lmd/f;

    .line 51
    .line 52
    invoke-virtual {v6, v8}, Lmd/f;->b(Loc/a;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    :goto_1
    iget-object v6, v3, Lud/e;->k:Lud/u;

    .line 59
    .line 60
    invoke-virtual {v6, v5}, Lud/u;->i(Lod/d;)Lud/r;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v5}, Lud/p;->U(Ljava/util/Collection;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_14

    .line 80
    .line 81
    invoke-virtual {v2}, Ltd/a;->O()Lud/p;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ltd/a;

    .line 86
    .line 87
    new-instance v6, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v6}, Lud/p;->U(Ljava/util/Collection;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_12

    .line 104
    .line 105
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Lqd/r;

    .line 110
    .line 111
    iget-object v9, v8, Lqd/r;->m:Lqd/s;

    .line 112
    .line 113
    iget-object v10, v9, Lqd/s;->i:Lqd/r;

    .line 114
    .line 115
    iget-object v10, v10, Lqd/l;->j:Lud/p;

    .line 116
    .line 117
    sget-object v11, Lpd/k;->S:Lpd/k;

    .line 118
    .line 119
    invoke-static {v10, v11}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    const/4 v11, 0x0

    .line 124
    if-eqz v10, :cond_6

    .line 125
    .line 126
    move-object v12, v10

    .line 127
    check-cast v12, Ltd/a;

    .line 128
    .line 129
    iget-object v12, v12, Ltd/a;->o:Lod/d;

    .line 130
    .line 131
    iget-object v12, v12, Lod/d;->j:Lod/a;

    .line 132
    .line 133
    iget-object v13, v3, Lud/e;->m:Lod/a;

    .line 134
    .line 135
    invoke-virtual {v12, v13}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-nez v12, :cond_7

    .line 140
    .line 141
    :cond_6
    const/16 v16, 0x0

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    iget-object v9, v9, Lqd/s;->j:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    const/4 v12, 0x0

    .line 151
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_f

    .line 156
    .line 157
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, Lqd/r;

    .line 162
    .line 163
    iget-object v14, v14, Lqd/l;->j:Lud/p;

    .line 164
    .line 165
    if-nez v14, :cond_9

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_9
    iget-object v15, v14, Lud/p;->k:Lpd/k;

    .line 172
    .line 173
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    const/16 v16, 0x0

    .line 178
    .line 179
    const/16 v7, 0x19

    .line 180
    .line 181
    if-eq v15, v7, :cond_d

    .line 182
    .line 183
    const/16 v7, 0x21

    .line 184
    .line 185
    if-eq v15, v7, :cond_c

    .line 186
    .line 187
    const/16 v7, 0x26

    .line 188
    .line 189
    if-eq v15, v7, :cond_b

    .line 190
    .line 191
    :cond_a
    :goto_2
    move-object/from16 v12, v16

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_b
    check-cast v14, Ltd/a;

    .line 195
    .line 196
    iget-object v7, v14, Ltd/a;->o:Lod/d;

    .line 197
    .line 198
    iget-object v7, v7, Lod/d;->j:Lod/a;

    .line 199
    .line 200
    invoke-virtual {v7, v13}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-nez v7, :cond_8

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_c
    check-cast v14, Lpd/j;

    .line 208
    .line 209
    iget-object v7, v14, Lpd/j;->o:Ljava/lang/Object;

    .line 210
    .line 211
    move-object v12, v7

    .line 212
    check-cast v12, Lod/c;

    .line 213
    .line 214
    iget-object v7, v12, Lod/c;->g:Lod/a;

    .line 215
    .line 216
    invoke-virtual {v7, v13}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-eqz v7, :cond_a

    .line 221
    .line 222
    iget-object v7, v12, Lod/c;->i:Lqd/j;

    .line 223
    .line 224
    invoke-virtual {v3}, Lud/e;->b0()Lqd/j;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    invoke-virtual {v7, v14}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-nez v7, :cond_8

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_d
    iget-object v7, v0, Lbe/k;->e:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v7, Lud/p;

    .line 238
    .line 239
    invoke-virtual {v7, v11}, Lud/p;->S(I)Lqd/l;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    instance-of v15, v7, Lqd/m;

    .line 247
    .line 248
    if-eqz v15, :cond_e

    .line 249
    .line 250
    check-cast v7, Lqd/m;

    .line 251
    .line 252
    iget-object v7, v7, Lqd/m;->l:Lud/p;

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_e
    move-object/from16 v7, v16

    .line 256
    .line 257
    :goto_3
    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-nez v7, :cond_8

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_f
    const/16 v16, 0x0

    .line 265
    .line 266
    if-eqz v12, :cond_10

    .line 267
    .line 268
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    :cond_10
    :goto_4
    if-nez v12, :cond_11

    .line 272
    .line 273
    :goto_5
    move-object/from16 v7, v16

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_11
    new-instance v7, Lpd/j;

    .line 277
    .line 278
    sget-object v9, Lpd/k;->M:Lpd/k;

    .line 279
    .line 280
    invoke-direct {v7, v9, v12, v11}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 281
    .line 282
    .line 283
    invoke-static {v7}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-virtual {v5, v8, v7}, Lud/p;->b0(Lqd/l;Lqd/l;)Z

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    if-nez v7, :cond_5

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_12
    move-object v7, v5

    .line 295
    :goto_6
    if-eqz v7, :cond_13

    .line 296
    .line 297
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-object v2, v7

    .line 301
    goto :goto_7

    .line 302
    :cond_13
    iget-object v0, v1, Lud/g;->l:Lod/c;

    .line 303
    .line 304
    iget-object v0, v0, Lod/c;->h:Ljava/lang/String;

    .line 305
    .line 306
    const-string v1, "Init of enum field \'"

    .line 307
    .line 308
    const-string v2, "\' uses external variables"

    .line 309
    .line 310
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/4 v0, 0x0

    .line 318
    return-object v0

    .line 319
    :cond_14
    :goto_7
    new-instance v0, Lnd/g;

    .line 320
    .line 321
    invoke-direct {v0, v1, v2}, Lnd/g;-><init>(Lud/g;Ltd/a;)V

    .line 322
    .line 323
    .line 324
    return-object v0

    .line 325
    :goto_8
    return-object v16
.end method

.method public static k(Lbe/k;Lud/p;)Ljava/util/List;
    .locals 14

    .line 1
    iget-object v0, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lud/e;

    .line 8
    .line 9
    iget-object v2, p1, Lud/p;->k:Lpd/k;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x19

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    if-eq v2, v3, :cond_5

    .line 20
    .line 21
    const/16 v0, 0x1c

    .line 22
    .line 23
    if-eq v2, v0, :cond_4

    .line 24
    .line 25
    const/16 v0, 0x22

    .line 26
    .line 27
    if-eq v2, v0, :cond_0

    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    check-cast p1, Lpd/n;

    .line 32
    .line 33
    iget-object p1, p1, Lpd/n;->p:Lod/d;

    .line 34
    .line 35
    iget-object v0, v1, Lud/e;->k:Lud/u;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lud/u;->i(Lod/d;)Lud/r;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_11

    .line 42
    .line 43
    invoke-virtual {p1}, Lud/r;->Z()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    iget-object v0, p1, Lud/r;->C:Lud/a;

    .line 52
    .line 53
    iget-object v0, v0, Lud/a;->m:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v0}, Lxe/s;->f(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lud/a;

    .line 60
    .line 61
    invoke-static {v0}, La/a;->c0(Lud/h;)Lud/p;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lxe/m;->g(Lud/p;)Lqd/l;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lxe/m;->h(Lqd/l;)Lud/p;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_2
    invoke-static {p0, v0}, Lbe/l;->k(Lbe/k;Lud/p;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    sget-object v0, Lmd/a;->s:Lmd/a;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-object p0

    .line 89
    :cond_4
    invoke-virtual {p1, v4}, Lud/p;->S(I)Lqd/l;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Lqd/l;->R()Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_11

    .line 98
    .line 99
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v3, p1, Lud/p;->m:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_13

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Lqd/l;

    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    instance-of v7, v6, Lqd/m;

    .line 129
    .line 130
    const-string v8, "Fake field, exist only in values array"

    .line 131
    .line 132
    sget-object v9, Lmd/a;->m:Lmd/a;

    .line 133
    .line 134
    sget-object v10, Lpd/k;->S:Lpd/k;

    .line 135
    .line 136
    const-string v11, "EF"

    .line 137
    .line 138
    sget-object v12, Lpd/k;->M:Lpd/k;

    .line 139
    .line 140
    if-eqz v7, :cond_8

    .line 141
    .line 142
    check-cast v6, Lqd/m;

    .line 143
    .line 144
    iget-object v6, v6, Lqd/m;->l:Lud/p;

    .line 145
    .line 146
    iget-object v7, v6, Lud/p;->k:Lpd/k;

    .line 147
    .line 148
    if-ne v7, v12, :cond_6

    .line 149
    .line 150
    invoke-static {p0, v6}, Lbe/l;->m(Lbe/k;Lud/p;)Lnd/g;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_6
    if-ne v7, v10, :cond_7

    .line 157
    .line 158
    check-cast v6, Ltd/a;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    move-object v6, v5

    .line 162
    :goto_1
    if-eqz v6, :cond_10

    .line 163
    .line 164
    iget v7, v6, Lud/p;->n:I

    .line 165
    .line 166
    invoke-static {v7, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    iget-object v10, v1, Lud/e;->k:Lud/u;

    .line 171
    .line 172
    iget-object v11, v1, Lud/e;->m:Lod/a;

    .line 173
    .line 174
    invoke-virtual {v1}, Lud/e;->b0()Lqd/j;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    new-instance v13, Lod/c;

    .line 179
    .line 180
    invoke-direct {v13, v11, v7, v12}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 181
    .line 182
    .line 183
    iget-object v7, v10, Lud/u;->e:Lbe/k;

    .line 184
    .line 185
    invoke-virtual {v7, v13}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    new-instance v10, Lud/g;

    .line 190
    .line 191
    invoke-direct {v10, v1, v7, v4}, Lud/g;-><init>(Lud/e;Lod/c;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10, v9}, Lmd/e;->w(Lmd/a;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10, v8}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v10}, Lud/e;->R(Lud/g;)V

    .line 201
    .line 202
    .line 203
    invoke-static {p0, v10, v6}, Lbe/l;->j(Lbe/k;Lud/g;Ltd/a;)Lnd/g;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    goto/16 :goto_5

    .line 208
    .line 209
    :cond_8
    instance-of v7, v6, Lqd/r;

    .line 210
    .line 211
    if-eqz v7, :cond_10

    .line 212
    .line 213
    check-cast v6, Lqd/r;

    .line 214
    .line 215
    invoke-virtual {v6}, Lqd/r;->f0()Lud/p;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    if-eqz v7, :cond_9

    .line 220
    .line 221
    iget-object v13, v7, Lud/p;->k:Lpd/k;

    .line 222
    .line 223
    if-ne v13, v12, :cond_9

    .line 224
    .line 225
    invoke-static {p0, v7}, Lbe/l;->m(Lbe/k;Lud/p;)Lnd/g;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    goto/16 :goto_5

    .line 230
    .line 231
    :cond_9
    iget-object v7, v6, Lqd/r;->m:Lqd/s;

    .line 232
    .line 233
    iget-object v12, v7, Lqd/s;->j:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    if-nez v12, :cond_a

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_a
    iget-object v12, v7, Lqd/s;->i:Lqd/r;

    .line 243
    .line 244
    iget-object v12, v12, Lqd/l;->j:Lud/p;

    .line 245
    .line 246
    if-eqz v12, :cond_10

    .line 247
    .line 248
    iget-object v13, v12, Lud/p;->k:Lpd/k;

    .line 249
    .line 250
    if-eq v13, v10, :cond_b

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_b
    iget-object v7, v7, Lqd/s;->j:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    check-cast v7, Lqd/r;

    .line 260
    .line 261
    iget-object v7, v7, Lqd/l;->j:Lud/p;

    .line 262
    .line 263
    if-eqz v7, :cond_d

    .line 264
    .line 265
    iget-object v10, v7, Lud/p;->k:Lpd/k;

    .line 266
    .line 267
    sget-object v13, Lpd/k;->N:Lpd/k;

    .line 268
    .line 269
    if-eq v10, v13, :cond_c

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_c
    move-object v10, v7

    .line 273
    check-cast v10, Lpd/j;

    .line 274
    .line 275
    iget-object v10, v10, Lpd/j;->o:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v10, Lod/c;

    .line 278
    .line 279
    invoke-virtual {v1, v10}, Lud/e;->l0(Lod/c;)Lud/g;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    if-nez v10, :cond_e

    .line 284
    .line 285
    :cond_d
    :goto_2
    move-object v10, v5

    .line 286
    goto :goto_3

    .line 287
    :cond_e
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    :goto_3
    if-nez v10, :cond_f

    .line 291
    .line 292
    iget v6, v6, Lqd/r;->l:I

    .line 293
    .line 294
    invoke-static {v6, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    iget-object v7, v1, Lud/e;->k:Lud/u;

    .line 299
    .line 300
    iget-object v10, v1, Lud/e;->m:Lod/a;

    .line 301
    .line 302
    invoke-virtual {v1}, Lud/e;->b0()Lqd/j;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    new-instance v13, Lod/c;

    .line 307
    .line 308
    invoke-direct {v13, v10, v6, v11}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 309
    .line 310
    .line 311
    iget-object v6, v7, Lud/u;->e:Lbe/k;

    .line 312
    .line 313
    invoke-virtual {v6, v13}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    new-instance v10, Lud/g;

    .line 318
    .line 319
    invoke-direct {v10, v1, v6, v4}, Lud/g;-><init>(Lud/e;Lod/c;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v10, v9}, Lmd/e;->w(Lmd/a;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v10, v8}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v10}, Lud/e;->R(Lud/g;)V

    .line 329
    .line 330
    .line 331
    :cond_f
    check-cast v12, Ltd/a;

    .line 332
    .line 333
    invoke-static {p0, v10, v12}, Lbe/l;->j(Lbe/k;Lud/g;Ltd/a;)Lnd/g;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    goto :goto_5

    .line 338
    :cond_10
    :goto_4
    move-object v6, v5

    .line 339
    :goto_5
    if-nez v6, :cond_12

    .line 340
    .line 341
    :cond_11
    :goto_6
    return-object v5

    .line 342
    :cond_12
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    return-object v2
.end method

.method public static m(Lbe/k;Lud/p;)Lnd/g;
    .locals 9

    .line 1
    iget-object v0, p0, Lbe/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/e;

    .line 4
    .line 5
    iget-object v1, p1, Lud/p;->k:Lpd/k;

    .line 6
    .line 7
    sget-object v2, Lpd/k;->M:Lpd/k;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    move-object v1, p1

    .line 15
    check-cast v1, Lpd/j;

    .line 16
    .line 17
    iget-object v1, v1, Lpd/j;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lod/c;

    .line 20
    .line 21
    iget-object v2, p0, Lbe/k;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lud/e;->l0(Lod/c;)Lud/g;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_1
    iget-object v4, p0, Lbe/k;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Lud/a;

    .line 52
    .line 53
    iget-object v5, v5, Lud/a;->l:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Lud/p;

    .line 70
    .line 71
    if-eqz v6, :cond_3

    .line 72
    .line 73
    iget-object v7, v6, Lud/p;->k:Lpd/k;

    .line 74
    .line 75
    sget-object v8, Lpd/k;->N:Lpd/k;

    .line 76
    .line 77
    if-ne v7, v8, :cond_3

    .line 78
    .line 79
    move-object v7, v6

    .line 80
    check-cast v7, Lpd/j;

    .line 81
    .line 82
    iget-object v7, v7, Lpd/j;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v7, Lod/c;

    .line 85
    .line 86
    invoke-virtual {v0, v7}, Lud/e;->l0(Lod/c;)Lud/g;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v7, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    move-object v6, v3

    .line 98
    :goto_0
    if-nez v6, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    iget-object v0, v6, Lud/p;->m:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/4 v4, 0x1

    .line 108
    if-eq v0, v4, :cond_7

    .line 109
    .line 110
    :cond_6
    move-object v0, v3

    .line 111
    goto :goto_1

    .line 112
    :cond_7
    const/4 v0, 0x0

    .line 113
    invoke-virtual {v6, v0}, Lud/p;->S(I)Lqd/l;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    instance-of v5, v0, Lqd/m;

    .line 121
    .line 122
    sget-object v7, Lpd/k;->S:Lpd/k;

    .line 123
    .line 124
    if-eqz v5, :cond_8

    .line 125
    .line 126
    check-cast v0, Lqd/m;

    .line 127
    .line 128
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 129
    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    iget-object v5, v0, Lud/p;->k:Lpd/k;

    .line 133
    .line 134
    if-ne v5, v7, :cond_6

    .line 135
    .line 136
    check-cast v0, Ltd/a;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    instance-of v5, v0, Lqd/r;

    .line 140
    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    check-cast v0, Lqd/r;

    .line 144
    .line 145
    invoke-virtual {v0}, Lqd/r;->f0()Lud/p;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    iget-object v5, v0, Lud/p;->k:Lpd/k;

    .line 152
    .line 153
    if-ne v5, v7, :cond_6

    .line 154
    .line 155
    check-cast v0, Ltd/a;

    .line 156
    .line 157
    :goto_1
    if-nez v0, :cond_9

    .line 158
    .line 159
    :goto_2
    return-object v3

    .line 160
    :cond_9
    iget-object v3, p1, Lud/p;->l:Lqd/r;

    .line 161
    .line 162
    if-eqz v3, :cond_a

    .line 163
    .line 164
    iget-object v3, v3, Lqd/r;->m:Lqd/s;

    .line 165
    .line 166
    iget-object v3, v3, Lqd/s;->j:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-ne v3, v4, :cond_b

    .line 173
    .line 174
    :cond_a
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_b
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    invoke-static {p0, v1, v0}, Lbe/l;->j(Lbe/k;Lud/g;Ltd/a;)Lnd/g;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lbe/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbe/a;->e()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lbe/l;->h:Ljava/lang/Comparable;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lud/u;)V
    .locals 5

    .line 1
    iget v0, p0, Lbe/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    sget-object v0, Lqd/j;->n:Lqd/e;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [Lqd/j;

    .line 15
    .line 16
    sget-object v3, Lqd/j;->l:Lqd/e;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    aput-object v3, v2, v4

    .line 20
    .line 21
    sget-object v3, Lqd/j;->m:Lqd/e;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-object v3, v2, v4

    .line 25
    .line 26
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "valueOf"

    .line 31
    .line 32
    invoke-static {p1, v1, v3, v2, v0}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lbe/l;->h:Ljava/lang/Comparable;

    .line 37
    .line 38
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 39
    .line 40
    invoke-static {p1, v0}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "clone"

    .line 45
    .line 46
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {p1, v1, v2, v3, v0}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lbe/l;->i:Ljava/lang/Object;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lud/r;)V
    .locals 1

    .line 1
    iget v0, p0, Lbe/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lbe/l;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/function/Consumer;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lud/e;)Z
    .locals 2

    .line 1
    iget v0, p0, Lbe/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lbe/a;->h(Lud/e;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Lud/e;->c0()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, p1}, Lbe/l;->i(Lud/e;)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    const-string v1, "Enum visitor error"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p1, Lud/e;->o:Lb5/k;

    .line 32
    .line 33
    invoke-virtual {v0}, Lb5/k;->b()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const/16 v1, 0x4000

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lb5/k;->m(I)Lb5/k;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p1, Lud/e;->o:Lb5/k;

    .line 46
    .line 47
    const-string v0, "Failed to restore enum class, \'enum\' modifier and super class removed"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lud/e;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lud/e;->p:Lqd/j;

    .line 6
    .line 7
    iget-object v3, v0, Lud/e;->k:Lud/u;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v4, Lqd/j;->n:Lqd/e;

    .line 16
    .line 17
    iget-object v4, v4, Lqd/e;->K:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sget-object v2, Lmd/a;->v:Lmd/a;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lmd/e;->w(Lmd/a;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const-string v2, "<clinit>()V"

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lud/e;->m0(Ljava/lang/String;)Lud/r;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v7, 0x0

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    const-string v2, "Enum class init method not found"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v7

    .line 45
    :cond_1
    iget-object v4, v2, Lud/r;->G:Lxd/b;

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    iget-object v5, v2, Lud/r;->z:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    :cond_2
    :goto_0
    move/from16 v17, v7

    .line 58
    .line 59
    goto/16 :goto_16

    .line 60
    .line 61
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v4, v4, Lxd/b;->k:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Lud/j;

    .line 83
    .line 84
    instance-of v8, v6, Lud/a;

    .line 85
    .line 86
    if-eqz v8, :cond_4

    .line 87
    .line 88
    check-cast v6, Lud/a;

    .line 89
    .line 90
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    const-string v2, "Unexpected branching in enum static init block"

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return v7

    .line 106
    :cond_5
    new-instance v4, Lbe/k;

    .line 107
    .line 108
    invoke-direct {v4, v0, v5}, Lbe/k;-><init>(Lud/e;Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    iget-object v5, v4, Lbe/k;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v5, Lud/e;

    .line 114
    .line 115
    iget-object v6, v4, Lbe/k;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, Ljava/util/ArrayList;

    .line 118
    .line 119
    iget-object v8, v5, Lud/e;->m:Lod/a;

    .line 120
    .line 121
    iget-object v9, v5, Lud/e;->k:Lud/u;

    .line 122
    .line 123
    iget-object v8, v8, Lod/a;->g:Lqd/j;

    .line 124
    .line 125
    iget-object v10, v5, Lud/e;->u:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v10}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    new-instance v11, La7/b;

    .line 132
    .line 133
    const/4 v12, 0x3

    .line 134
    invoke-direct {v11, v12}, La7/b;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    new-instance v11, La7/b;

    .line 142
    .line 143
    const/4 v12, 0x4

    .line 144
    invoke-direct {v11, v12}, La7/b;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    new-instance v11, Lbe/i;

    .line 152
    .line 153
    const/4 v12, 0x1

    .line 154
    invoke-direct {v11, v8, v12}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-interface {v8, v10}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    check-cast v8, Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_6

    .line 176
    .line 177
    const-string v0, "$VALUES field not found"

    .line 178
    .line 179
    invoke-virtual {v5, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return v7

    .line 183
    :cond_6
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-le v10, v12, :cond_7

    .line 188
    .line 189
    new-instance v10, La7/b;

    .line 190
    .line 191
    const/4 v11, 0x5

    .line 192
    invoke-direct {v10, v11}, La7/b;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v8, v10}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 196
    .line 197
    .line 198
    :cond_7
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-le v10, v12, :cond_8

    .line 203
    .line 204
    invoke-interface {v8}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    new-instance v11, La7/b;

    .line 209
    .line 210
    const/4 v13, 0x6

    .line 211
    invoke-direct {v11, v13}, La7/b;-><init>(I)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v10, v11}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-interface {v10}, Ljava/util/stream/Stream;->findAny()Ljava/util/Optional;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-virtual {v10}, Ljava/util/Optional;->isPresent()Z

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    if-eqz v11, :cond_8

    .line 227
    .line 228
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    check-cast v10, Lud/g;

    .line 236
    .line 237
    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    :cond_8
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    if-eq v10, v12, :cond_9

    .line 245
    .line 246
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const-string v2, "Found several \"values\" enum fields: "

    .line 251
    .line 252
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v5, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return v7

    .line 260
    :cond_9
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    check-cast v8, Lud/g;

    .line 265
    .line 266
    iput-object v8, v4, Lbe/k;->d:Ljava/lang/Object;

    .line 267
    .line 268
    iget-object v8, v8, Lud/g;->l:Lod/c;

    .line 269
    .line 270
    iget-object v10, v4, Lbe/k;->a:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v10, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    :cond_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    if-eqz v11, :cond_c

    .line 283
    .line 284
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    check-cast v11, Lud/a;

    .line 289
    .line 290
    iget-object v14, v11, Lud/a;->l:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v15

    .line 300
    if-eqz v15, :cond_a

    .line 301
    .line 302
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v15

    .line 306
    check-cast v15, Lud/p;

    .line 307
    .line 308
    iget-object v13, v15, Lud/p;->k:Lpd/k;

    .line 309
    .line 310
    sget-object v12, Lpd/k;->N:Lpd/k;

    .line 311
    .line 312
    if-ne v13, v12, :cond_b

    .line 313
    .line 314
    check-cast v15, Lpd/j;

    .line 315
    .line 316
    iget-object v12, v15, Lpd/j;->o:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v12, Lod/c;

    .line 319
    .line 320
    invoke-virtual {v12, v8}, Lod/c;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    if-eqz v12, :cond_b

    .line 325
    .line 326
    new-instance v8, Lxe/b;

    .line 327
    .line 328
    invoke-direct {v8, v11, v15}, Lxe/b;-><init>(Lud/h;Lud/p;)V

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_b
    const/4 v12, 0x1

    .line 333
    goto :goto_2

    .line 334
    :cond_c
    const/4 v8, 0x0

    .line 335
    :goto_3
    if-nez v8, :cond_d

    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_d
    iget-object v8, v8, Lxe/b;->b:Lud/p;

    .line 340
    .line 341
    iput-object v8, v4, Lbe/k;->e:Ljava/lang/Object;

    .line 342
    .line 343
    invoke-virtual {v8, v7}, Lud/p;->S(I)Lqd/l;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    instance-of v10, v8, Lqd/m;

    .line 351
    .line 352
    if-eqz v10, :cond_e

    .line 353
    .line 354
    check-cast v8, Lqd/m;

    .line 355
    .line 356
    iget-object v8, v8, Lqd/m;->l:Lud/p;

    .line 357
    .line 358
    invoke-static {v4, v8}, Lbe/l;->k(Lbe/k;Lud/p;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    goto :goto_4

    .line 363
    :cond_e
    const/4 v8, 0x0

    .line 364
    :goto_4
    if-nez v8, :cond_f

    .line 365
    .line 366
    const-string v2, "Unknown enum class pattern. Please report as an issue!"

    .line 367
    .line 368
    invoke-virtual {v0, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return v7

    .line 372
    :cond_f
    iget-object v10, v4, Lbe/k;->e:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v10, Lud/p;

    .line 375
    .line 376
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    new-instance v10, Lnd/h;

    .line 380
    .line 381
    invoke-direct {v10, v8}, Lnd/h;-><init>(Ljava/util/List;)V

    .line 382
    .line 383
    .line 384
    iput-object v2, v10, Lnd/h;->h:Lud/r;

    .line 385
    .line 386
    invoke-virtual {v0, v10}, Lmd/e;->y(Loc/b;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    sget-object v12, Lpd/k;->M:Lpd/k;

    .line 398
    .line 399
    sget-object v13, Lmd/a;->s:Lmd/a;

    .line 400
    .line 401
    if-eqz v10, :cond_1b

    .line 402
    .line 403
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    check-cast v10, Lnd/g;

    .line 408
    .line 409
    iget-object v14, v10, Lnd/g;->b:Ltd/a;

    .line 410
    .line 411
    iget-object v15, v10, Lnd/g;->a:Lud/g;

    .line 412
    .line 413
    iget-object v11, v15, Lud/g;->l:Lod/c;

    .line 414
    .line 415
    invoke-virtual {v14, v7}, Lud/p;->S(I)Lqd/l;

    .line 416
    .line 417
    .line 418
    move-result-object v14

    .line 419
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    instance-of v7, v14, Lqd/m;

    .line 423
    .line 424
    if-eqz v7, :cond_10

    .line 425
    .line 426
    check-cast v14, Lqd/m;

    .line 427
    .line 428
    iget-object v7, v14, Lqd/m;->l:Lud/p;

    .line 429
    .line 430
    invoke-static {v3, v7}, Lxe/m;->f(Lud/u;Lud/p;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    instance-of v14, v7, Ljava/lang/String;

    .line 435
    .line 436
    if-eqz v14, :cond_10

    .line 437
    .line 438
    check-cast v7, Ljava/lang/String;

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_10
    const/4 v7, 0x0

    .line 442
    :goto_6
    if-eqz v7, :cond_11

    .line 443
    .line 444
    iget-object v14, v11, Lod/c;->j:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v14

    .line 450
    if-nez v14, :cond_11

    .line 451
    .line 452
    invoke-static {v7}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 453
    .line 454
    .line 455
    move-result v14

    .line 456
    if-eqz v14, :cond_11

    .line 457
    .line 458
    iget-object v14, v3, Lud/u;->a:Lbc/g;

    .line 459
    .line 460
    invoke-virtual {v14}, Lbc/g;->a()Z

    .line 461
    .line 462
    .line 463
    move-result v14

    .line 464
    if-eqz v14, :cond_11

    .line 465
    .line 466
    iput-object v7, v11, Lod/c;->j:Ljava/lang/String;

    .line 467
    .line 468
    :cond_11
    invoke-virtual {v15, v13}, Lmd/e;->w(Lmd/a;)V

    .line 469
    .line 470
    .line 471
    iget-object v7, v10, Lnd/g;->b:Ltd/a;

    .line 472
    .line 473
    iget-object v14, v7, Ltd/a;->o:Lod/d;

    .line 474
    .line 475
    iget-object v15, v14, Lod/d;->j:Lod/a;

    .line 476
    .line 477
    move-object/from16 v18, v3

    .line 478
    .line 479
    iget-object v3, v5, Lud/e;->m:Lod/a;

    .line 480
    .line 481
    invoke-virtual {v15, v3}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    if-nez v3, :cond_14

    .line 486
    .line 487
    invoke-virtual {v9, v15}, Lud/u;->f(Lod/a;)Lud/e;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    if-eqz v3, :cond_14

    .line 492
    .line 493
    iget-object v15, v3, Lud/e;->t:Ljava/util/List;

    .line 494
    .line 495
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v15

    .line 499
    :goto_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v19

    .line 503
    if-eqz v19, :cond_13

    .line 504
    .line 505
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v19

    .line 509
    move-object/from16 v20, v8

    .line 510
    .line 511
    move-object/from16 v8, v19

    .line 512
    .line 513
    check-cast v8, Lud/r;

    .line 514
    .line 515
    move-object/from16 v19, v15

    .line 516
    .line 517
    iget-object v15, v8, Lud/r;->m:Lb5/k;

    .line 518
    .line 519
    invoke-virtual {v15}, Lb5/k;->a()Z

    .line 520
    .line 521
    .line 522
    move-result v15

    .line 523
    if-eqz v15, :cond_12

    .line 524
    .line 525
    invoke-virtual {v8, v13}, Lmd/e;->w(Lmd/a;)V

    .line 526
    .line 527
    .line 528
    :cond_12
    move-object/from16 v15, v19

    .line 529
    .line 530
    move-object/from16 v8, v20

    .line 531
    .line 532
    goto :goto_7

    .line 533
    :cond_13
    move-object/from16 v20, v8

    .line 534
    .line 535
    iput-object v3, v10, Lnd/g;->c:Lud/e;

    .line 536
    .line 537
    iget-object v8, v3, Lud/e;->x:Lud/e;

    .line 538
    .line 539
    invoke-virtual {v8, v5}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    if-nez v8, :cond_15

    .line 544
    .line 545
    invoke-virtual {v5, v3}, Lud/e;->S(Lud/e;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3, v13}, Lmd/e;->w(Lmd/a;)V

    .line 549
    .line 550
    .line 551
    goto :goto_8

    .line 552
    :cond_14
    move-object/from16 v20, v8

    .line 553
    .line 554
    :cond_15
    :goto_8
    invoke-virtual {v9, v14}, Lud/u;->i(Lod/d;)Lud/r;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    if-eqz v3, :cond_16

    .line 559
    .line 560
    const/4 v8, 0x0

    .line 561
    invoke-static {v3, v8}, Lnd/g0;->b(Lud/r;I)V

    .line 562
    .line 563
    .line 564
    iget-object v8, v3, Lud/r;->k:Lod/d;

    .line 565
    .line 566
    iget-object v8, v8, Lod/d;->i:Ljava/util/List;

    .line 567
    .line 568
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 569
    .line 570
    .line 571
    move-result v8

    .line 572
    const/4 v10, 0x1

    .line 573
    if-le v8, v10, :cond_16

    .line 574
    .line 575
    invoke-static {v3, v10}, Lnd/g0;->b(Lud/r;I)V

    .line 576
    .line 577
    .line 578
    :cond_16
    iget-object v3, v7, Lud/p;->l:Lqd/r;

    .line 579
    .line 580
    if-eqz v3, :cond_19

    .line 581
    .line 582
    iget-object v8, v3, Lqd/r;->m:Lqd/s;

    .line 583
    .line 584
    iget-object v8, v8, Lqd/s;->j:Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    const/4 v10, 0x2

    .line 591
    if-gt v8, v10, :cond_17

    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_17
    iget-object v8, v3, Lqd/r;->m:Lqd/s;

    .line 595
    .line 596
    iget-object v8, v8, Lqd/s;->j:Ljava/util/ArrayList;

    .line 597
    .line 598
    invoke-interface {v8}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    new-instance v10, Lbe/i;

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    invoke-direct {v10, v4, v13}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v8, v10}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    if-eqz v8, :cond_1a

    .line 613
    .line 614
    new-instance v8, Lpd/j;

    .line 615
    .line 616
    invoke-direct {v8, v12, v11, v13}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3}, Lqd/r;->c0()Lqd/r;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    invoke-virtual {v8, v3}, Lud/p;->d0(Lqd/r;)V

    .line 624
    .line 625
    .line 626
    iget-object v3, v2, Lud/r;->z:Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    :cond_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v10

    .line 636
    if-eqz v10, :cond_1a

    .line 637
    .line 638
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v10

    .line 642
    check-cast v10, Lud/a;

    .line 643
    .line 644
    invoke-static {v2, v10, v7, v8}, La/a;->K0(Lud/r;Lud/a;Lud/p;Lud/p;)Z

    .line 645
    .line 646
    .line 647
    move-result v10

    .line 648
    if-eqz v10, :cond_18

    .line 649
    .line 650
    goto :goto_a

    .line 651
    :cond_19
    :goto_9
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    :cond_1a
    :goto_a
    move-object/from16 v3, v18

    .line 655
    .line 656
    move-object/from16 v8, v20

    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    goto/16 :goto_5

    .line 660
    .line 661
    :cond_1b
    iget-object v3, v4, Lbe/k;->d:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v3, Lud/g;

    .line 664
    .line 665
    invoke-virtual {v3, v13}, Lmd/e;->w(Lmd/a;)V

    .line 666
    .line 667
    .line 668
    invoke-static {v2, v6}, Lxe/l;->k(Lud/r;Ljava/util/List;)V

    .line 669
    .line 670
    .line 671
    iget-object v3, v2, Lud/r;->z:Ljava/util/List;

    .line 672
    .line 673
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    if-eqz v5, :cond_1c

    .line 682
    .line 683
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    check-cast v5, Lud/a;

    .line 688
    .line 689
    iget-object v5, v5, Lud/a;->l:Ljava/util/ArrayList;

    .line 690
    .line 691
    invoke-static {v5, v6}, Lxe/l;->e(Ljava/util/List;Ljava/util/List;)V

    .line 692
    .line 693
    .line 694
    goto :goto_b

    .line 695
    :cond_1c
    iget-object v3, v2, Lud/r;->y:[Lud/p;

    .line 696
    .line 697
    if-eqz v3, :cond_1d

    .line 698
    .line 699
    array-length v3, v3

    .line 700
    int-to-long v9, v3

    .line 701
    goto :goto_c

    .line 702
    :cond_1d
    iget-object v3, v2, Lud/r;->z:Ljava/util/List;

    .line 703
    .line 704
    if-eqz v3, :cond_1e

    .line 705
    .line 706
    invoke-interface {v3}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    new-instance v5, Lud/q;

    .line 711
    .line 712
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 713
    .line 714
    .line 715
    invoke-interface {v3, v5}, Ljava/util/stream/Stream;->mapToLong(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    invoke-interface {v3}, Ljava/util/stream/LongStream;->sum()J

    .line 720
    .line 721
    .line 722
    move-result-wide v9

    .line 723
    goto :goto_c

    .line 724
    :cond_1e
    const-wide/16 v9, -0x1

    .line 725
    .line 726
    :goto_c
    const-wide/16 v14, 0x0

    .line 727
    .line 728
    cmp-long v3, v9, v14

    .line 729
    .line 730
    if-nez v3, :cond_1f

    .line 731
    .line 732
    invoke-virtual {v2, v13}, Lmd/e;->w(Lmd/a;)V

    .line 733
    .line 734
    .line 735
    goto :goto_d

    .line 736
    :cond_1f
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    if-nez v3, :cond_20

    .line 741
    .line 742
    invoke-static {v2}, Lbe/b;->Y(Lud/r;)V

    .line 743
    .line 744
    .line 745
    :cond_20
    :goto_d
    iget-object v2, v4, Lbe/k;->d:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v2, Lud/g;

    .line 748
    .line 749
    iget-object v3, v0, Lud/e;->m:Lod/a;

    .line 750
    .line 751
    iget-object v5, v3, Lod/a;->g:Lqd/j;

    .line 752
    .line 753
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 754
    .line 755
    new-instance v3, Lqd/a;

    .line 756
    .line 757
    invoke-direct {v3, v5}, Lqd/a;-><init>(Lqd/j;)V

    .line 758
    .line 759
    .line 760
    invoke-static {v3}, Lfd/j;->b(Lqd/j;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    const-string v4, "values()"

    .line 765
    .line 766
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    iget-object v4, v0, Lud/e;->t:Ljava/util/List;

    .line 771
    .line 772
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 773
    .line 774
    .line 775
    move-result-object v4

    .line 776
    const/4 v6, 0x0

    .line 777
    :cond_21
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 778
    .line 779
    .line 780
    move-result v9

    .line 781
    if-eqz v9, :cond_2e

    .line 782
    .line 783
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v9

    .line 787
    check-cast v9, Lud/r;

    .line 788
    .line 789
    iget-object v10, v9, Lud/r;->k:Lod/d;

    .line 790
    .line 791
    invoke-virtual {v10}, Lod/d;->e()Z

    .line 792
    .line 793
    .line 794
    move-result v11

    .line 795
    iget-object v7, v10, Lod/d;->k:Ljava/lang/String;

    .line 796
    .line 797
    if-nez v11, :cond_21

    .line 798
    .line 799
    iget-boolean v8, v9, Lud/r;->p:Z

    .line 800
    .line 801
    if-eqz v8, :cond_22

    .line 802
    .line 803
    goto :goto_e

    .line 804
    :cond_22
    invoke-virtual {v10}, Lod/d;->f()Z

    .line 805
    .line 806
    .line 807
    move-result v8

    .line 808
    if-eqz v8, :cond_27

    .line 809
    .line 810
    const-string v8, "<init>(Ljava/lang/String;I)V"

    .line 811
    .line 812
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v8

    .line 816
    if-nez v8, :cond_23

    .line 817
    .line 818
    const-string v8, "<init>(Ljava/lang/String;)V"

    .line 819
    .line 820
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    if-eqz v7, :cond_26

    .line 825
    .line 826
    :cond_23
    iget-object v7, v9, Lud/r;->y:[Lud/p;

    .line 827
    .line 828
    if-eqz v7, :cond_24

    .line 829
    .line 830
    array-length v7, v7

    .line 831
    int-to-long v7, v7

    .line 832
    goto :goto_f

    .line 833
    :cond_24
    iget-object v7, v9, Lud/r;->z:Ljava/util/List;

    .line 834
    .line 835
    if-eqz v7, :cond_25

    .line 836
    .line 837
    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    new-instance v8, Lud/q;

    .line 842
    .line 843
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 844
    .line 845
    .line 846
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->mapToLong(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    invoke-interface {v7}, Ljava/util/stream/LongStream;->sum()J

    .line 851
    .line 852
    .line 853
    move-result-wide v7

    .line 854
    goto :goto_f

    .line 855
    :cond_25
    const-wide/16 v7, -0x1

    .line 856
    .line 857
    :goto_f
    cmp-long v7, v7, v14

    .line 858
    .line 859
    if-nez v7, :cond_26

    .line 860
    .line 861
    invoke-virtual {v9, v13}, Lmd/e;->w(Lmd/a;)V

    .line 862
    .line 863
    .line 864
    :cond_26
    const/4 v8, 0x0

    .line 865
    invoke-static {v9, v8}, Lnd/g0;->b(Lud/r;I)V

    .line 866
    .line 867
    .line 868
    iget-object v7, v9, Lud/r;->k:Lod/d;

    .line 869
    .line 870
    iget-object v7, v7, Lod/d;->i:Ljava/util/List;

    .line 871
    .line 872
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 873
    .line 874
    .line 875
    move-result v7

    .line 876
    const/4 v10, 0x1

    .line 877
    if-le v7, v10, :cond_21

    .line 878
    .line 879
    invoke-static {v9, v10}, Lnd/g0;->b(Lud/r;I)V

    .line 880
    .line 881
    .line 882
    goto :goto_e

    .line 883
    :cond_27
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v7

    .line 887
    if-eqz v7, :cond_29

    .line 888
    .line 889
    invoke-virtual {v1, v9, v5}, Lbe/l;->l(Lud/r;Lqd/j;)Z

    .line 890
    .line 891
    .line 892
    move-result v7

    .line 893
    if-eqz v7, :cond_28

    .line 894
    .line 895
    invoke-virtual {v9, v13}, Lmd/e;->w(Lmd/a;)V

    .line 896
    .line 897
    .line 898
    goto :goto_10

    .line 899
    :cond_28
    const-string v7, "valuesCustom"

    .line 900
    .line 901
    iput-object v7, v10, Lod/d;->n:Ljava/lang/String;

    .line 902
    .line 903
    new-instance v7, Lnd/f0;

    .line 904
    .line 905
    invoke-direct {v7, v9}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 906
    .line 907
    .line 908
    const-string v8, "to resolve conflict with enum method"

    .line 909
    .line 910
    invoke-virtual {v7, v8}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v9, v7}, Lmd/e;->y(Loc/b;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_e

    .line 917
    .line 918
    :cond_29
    invoke-virtual {v1, v9, v5}, Lbe/l;->l(Lud/r;Lqd/j;)Z

    .line 919
    .line 920
    .line 921
    move-result v7

    .line 922
    if-eqz v7, :cond_2b

    .line 923
    .line 924
    iget-object v6, v10, Lod/d;->n:Ljava/lang/String;

    .line 925
    .line 926
    const-string v7, "values"

    .line 927
    .line 928
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    if-nez v6, :cond_2a

    .line 933
    .line 934
    iget-object v6, v9, Lud/r;->H:Ljava/util/List;

    .line 935
    .line 936
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 937
    .line 938
    .line 939
    move-result v6

    .line 940
    if-nez v6, :cond_2a

    .line 941
    .line 942
    iput-object v7, v10, Lod/d;->n:Ljava/lang/String;

    .line 943
    .line 944
    new-instance v6, Lnd/f0;

    .line 945
    .line 946
    invoke-direct {v6, v9}, Lnd/f0;-><init>(Lnd/b0;)V

    .line 947
    .line 948
    .line 949
    const-string v7, "to match enum method name"

    .line 950
    .line 951
    invoke-virtual {v6, v7}, Lnd/f0;->b(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v9, v6}, Lmd/e;->y(Loc/b;)V

    .line 955
    .line 956
    .line 957
    sget-object v6, Lmd/a;->x:Lmd/a;

    .line 958
    .line 959
    invoke-virtual {v9, v6}, Lmd/e;->w(Lmd/a;)V

    .line 960
    .line 961
    .line 962
    :cond_2a
    invoke-virtual {v9, v13}, Lmd/e;->w(Lmd/a;)V

    .line 963
    .line 964
    .line 965
    :goto_10
    move-object v6, v9

    .line 966
    goto/16 :goto_e

    .line 967
    .line 968
    :cond_2b
    new-instance v7, La7/b;

    .line 969
    .line 970
    const/4 v8, 0x7

    .line 971
    invoke-direct {v7, v8}, La7/b;-><init>(I)V

    .line 972
    .line 973
    .line 974
    sget-object v8, Lxe/m;->a:Lmh/b;

    .line 975
    .line 976
    iget-boolean v8, v9, Lud/r;->p:Z

    .line 977
    .line 978
    if-nez v8, :cond_2c

    .line 979
    .line 980
    iget-object v8, v9, Lud/r;->C:Lud/a;

    .line 981
    .line 982
    iget-object v8, v8, Lud/a;->m:Ljava/util/List;

    .line 983
    .line 984
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 985
    .line 986
    .line 987
    move-result v8

    .line 988
    const/4 v10, 0x1

    .line 989
    if-ne v8, v10, :cond_2c

    .line 990
    .line 991
    sget-object v8, Lpd/k;->p:Lpd/k;

    .line 992
    .line 993
    invoke-static {v9, v8, v7}, Lxe/m;->m(Lud/r;Lpd/k;Ljava/util/function/Predicate;)Lud/p;

    .line 994
    .line 995
    .line 996
    move-result-object v7

    .line 997
    goto :goto_11

    .line 998
    :cond_2c
    const/4 v7, 0x0

    .line 999
    :goto_11
    if-nez v7, :cond_2d

    .line 1000
    .line 1001
    goto/16 :goto_e

    .line 1002
    .line 1003
    :cond_2d
    invoke-static {v7}, Lxe/m;->g(Lud/p;)Lqd/l;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v7

    .line 1007
    invoke-static {v7}, Lxe/m;->h(Lqd/l;)Lud/p;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v7

    .line 1011
    sget-object v8, Lpd/k;->A:Lpd/k;

    .line 1012
    .line 1013
    invoke-static {v7, v8}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v7

    .line 1017
    check-cast v7, Lpd/j;

    .line 1018
    .line 1019
    if-eqz v7, :cond_21

    .line 1020
    .line 1021
    iget-object v8, v7, Lpd/j;->o:Ljava/lang/Object;

    .line 1022
    .line 1023
    invoke-static {v8, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v8

    .line 1027
    if-eqz v8, :cond_21

    .line 1028
    .line 1029
    invoke-static {v7}, Lxe/m;->g(Lud/p;)Lqd/l;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    invoke-static {v7}, Lxe/m;->h(Lqd/l;)Lud/p;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v7

    .line 1037
    sget-object v8, Lpd/k;->O:Lpd/k;

    .line 1038
    .line 1039
    invoke-static {v7, v8}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    check-cast v7, Lpd/n;

    .line 1044
    .line 1045
    if-eqz v7, :cond_21

    .line 1046
    .line 1047
    iget-object v7, v7, Lpd/n;->p:Lod/d;

    .line 1048
    .line 1049
    iget-object v8, v1, Lbe/l;->h:Ljava/lang/Comparable;

    .line 1050
    .line 1051
    check-cast v8, Lod/d;

    .line 1052
    .line 1053
    invoke-virtual {v7, v8}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v7

    .line 1057
    if-eqz v7, :cond_21

    .line 1058
    .line 1059
    invoke-virtual {v9, v13}, Lmd/e;->w(Lmd/a;)V

    .line 1060
    .line 1061
    .line 1062
    goto/16 :goto_e

    .line 1063
    .line 1064
    :cond_2e
    iget-object v2, v2, Lud/g;->l:Lod/c;

    .line 1065
    .line 1066
    iget-object v0, v0, Lud/e;->t:Ljava/util/List;

    .line 1067
    .line 1068
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v7

    .line 1072
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    if-eqz v0, :cond_35

    .line 1077
    .line 1078
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    move-object v4, v0

    .line 1083
    check-cast v4, Lud/r;

    .line 1084
    .line 1085
    iget-object v0, v4, Lud/r;->k:Lod/d;

    .line 1086
    .line 1087
    invoke-virtual {v0}, Lod/d;->f()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v3

    .line 1091
    if-nez v3, :cond_2f

    .line 1092
    .line 1093
    invoke-virtual {v0}, Lod/d;->e()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v0

    .line 1097
    if-nez v0, :cond_2f

    .line 1098
    .line 1099
    iget-boolean v0, v4, Lud/r;->p:Z

    .line 1100
    .line 1101
    if-nez v0, :cond_2f

    .line 1102
    .line 1103
    if-ne v4, v6, :cond_30

    .line 1104
    .line 1105
    :cond_2f
    move-object v3, v6

    .line 1106
    const/4 v10, 0x2

    .line 1107
    :goto_13
    move-object v6, v2

    .line 1108
    goto :goto_15

    .line 1109
    :cond_30
    new-instance v0, Lbe/i;

    .line 1110
    .line 1111
    const/4 v10, 0x2

    .line 1112
    invoke-direct {v0, v2, v10}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v4, v12, v0}, Lxe/m;->m(Lud/r;Lpd/k;Ljava/util/function/Predicate;)Lud/p;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v3

    .line 1119
    if-nez v3, :cond_31

    .line 1120
    .line 1121
    move-object v3, v6

    .line 1122
    goto :goto_13

    .line 1123
    :cond_31
    move-object v3, v6

    .line 1124
    move-object v6, v2

    .line 1125
    move-object v2, v0

    .line 1126
    new-instance v0, Lbe/j;

    .line 1127
    .line 1128
    invoke-direct/range {v0 .. v6}, Lbe/j;-><init>(Lbe/l;Lbe/i;Lud/r;Lud/r;Lqd/j;Lod/c;)V

    .line 1129
    .line 1130
    .line 1131
    iget-object v1, v4, Lud/r;->z:Ljava/util/List;

    .line 1132
    .line 1133
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    :cond_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1138
    .line 1139
    .line 1140
    move-result v2

    .line 1141
    if-eqz v2, :cond_34

    .line 1142
    .line 1143
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v2

    .line 1147
    check-cast v2, Lud/a;

    .line 1148
    .line 1149
    iget-object v8, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1152
    .line 1153
    .line 1154
    move-result v9

    .line 1155
    const/4 v11, 0x0

    .line 1156
    :goto_14
    if-ge v11, v9, :cond_32

    .line 1157
    .line 1158
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v13

    .line 1162
    check-cast v13, Lud/p;

    .line 1163
    .line 1164
    invoke-static {v4, v13, v0}, Lxe/m;->l(Lud/r;Lud/p;Lbe/j;)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v0, v13}, Lbe/j;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v13

    .line 1171
    check-cast v13, Lud/p;

    .line 1172
    .line 1173
    if-eqz v13, :cond_33

    .line 1174
    .line 1175
    invoke-static {v4, v2, v11, v13}, La/a;->J0(Lud/r;Lud/a;ILud/p;)V

    .line 1176
    .line 1177
    .line 1178
    :cond_33
    add-int/lit8 v11, v11, 0x1

    .line 1179
    .line 1180
    goto :goto_14

    .line 1181
    :cond_34
    :goto_15
    move-object/from16 v1, p0

    .line 1182
    .line 1183
    move-object v2, v6

    .line 1184
    move-object v6, v3

    .line 1185
    goto :goto_12

    .line 1186
    :cond_35
    const/16 v16, 0x1

    .line 1187
    .line 1188
    return v16

    .line 1189
    :goto_16
    return v17
.end method

.method public l(Lud/r;Lqd/j;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Lud/r;->t:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, Lqd/a;

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {v0}, Lqd/j;->g()Lqd/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, La/a;->f0(Lud/r;)Lud/p;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object v0, p1, Lud/p;->k:Lpd/k;

    .line 28
    .line 29
    sget-object v1, Lpd/k;->p:Lpd/k;

    .line 30
    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p1, Lud/p;->m:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {p1}, Lxe/m;->g(Lud/p;)Lqd/l;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lxe/m;->h(Lqd/l;)Lud/p;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Lpd/k;->A:Lpd/k;

    .line 52
    .line 53
    invoke-static {p1, v0}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lpd/j;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    iget-object v0, p1, Lpd/j;->o:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v2, Lqd/a;

    .line 64
    .line 65
    invoke-direct {v2, p2}, Lqd/a;-><init>(Lqd/j;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    invoke-static {p1}, Lxe/m;->g(Lud/p;)Lqd/l;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lxe/m;->h(Lqd/l;)Lud/p;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, Lpd/k;->O:Lpd/k;

    .line 83
    .line 84
    invoke-static {p1, p2}, Lxe/m;->a(Lud/p;Lpd/k;)Lud/p;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lpd/n;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    iget-object p1, p1, Lpd/n;->p:Lod/d;

    .line 93
    .line 94
    iget-object p2, p0, Lbe/l;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p2, Lod/d;

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Lod/d;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    return v1

    .line 105
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 106
    return p1
.end method
