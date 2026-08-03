.class public final Lm/e0;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:Ls1/k;

.field public h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lgg/q;

.field public final synthetic l:Lgg/u;

.field public final synthetic m:Lgg/u;


# direct methods
.method public constructor <init>(Lgg/q;Lgg/u;Lgg/u;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/e0;->k:Lgg/q;

    .line 2
    .line 3
    iput-object p2, p0, Lm/e0;->l:Lgg/u;

    .line 4
    .line 5
    iput-object p3, p0, Lm/e0;->m:Lgg/u;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Lyf/h;-><init>(Lwf/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    new-instance v0, Lm/e0;

    .line 2
    .line 3
    iget-object v1, p0, Lm/e0;->l:Lgg/u;

    .line 4
    .line 5
    iget-object v2, p0, Lm/e0;->m:Lgg/u;

    .line 6
    .line 7
    iget-object v3, p0, Lm/e0;->k:Lgg/q;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lm/e0;-><init>(Lgg/q;Lgg/u;Lgg/u;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/e0;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm/e0;->i:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v5, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    iget v1, v0, Lm/e0;->h:I

    .line 17
    .line 18
    iget-object v7, v0, Lm/e0;->g:Ls1/k;

    .line 19
    .line 20
    iget-object v8, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v8, Ls1/k0;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move v4, v5

    .line 28
    move-object/from16 v5, p1

    .line 29
    .line 30
    goto/16 :goto_8

    .line 31
    .line 32
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    return-object v1

    .line 39
    :cond_1
    iget v1, v0, Lm/e0;->h:I

    .line 40
    .line 41
    iget-object v7, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Ls1/k0;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v8, p1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ls1/k0;

    .line 57
    .line 58
    move-object v7, v1

    .line 59
    const/4 v1, 0x0

    .line 60
    :goto_0
    if-nez v1, :cond_13

    .line 61
    .line 62
    iput-object v7, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v2, v0, Lm/e0;->g:Ls1/k;

    .line 65
    .line 66
    iput v1, v0, Lm/e0;->h:I

    .line 67
    .line 68
    iput v5, v0, Lm/e0;->i:I

    .line 69
    .line 70
    sget-object v8, Ls1/l;->h:Ls1/l;

    .line 71
    .line 72
    invoke-virtual {v7, v8, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-ne v8, v6, :cond_3

    .line 77
    .line 78
    goto :goto_7

    .line 79
    :cond_3
    :goto_1
    check-cast v8, Ls1/k;

    .line 80
    .line 81
    iget-object v9, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    const/4 v11, 0x0

    .line 88
    :goto_2
    if-ge v11, v10, :cond_5

    .line 89
    .line 90
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, Ls1/t;

    .line 95
    .line 96
    invoke-static {v12}, Ls1/s;->d(Ls1/t;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-nez v12, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move v1, v5

    .line 107
    :goto_3
    iget-object v9, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    const/4 v11, 0x0

    .line 114
    :goto_4
    if-ge v11, v10, :cond_8

    .line 115
    .line 116
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    check-cast v12, Ls1/t;

    .line 121
    .line 122
    invoke-virtual {v12}, Ls1/t;->b()Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-nez v13, :cond_7

    .line 127
    .line 128
    iget-object v13, v7, Ls1/k0;->l:Ls1/l0;

    .line 129
    .line 130
    iget-wide v13, v13, Ls1/l0;->E:J

    .line 131
    .line 132
    invoke-virtual {v7}, Ls1/k0;->m()J

    .line 133
    .line 134
    .line 135
    move-result-wide v4

    .line 136
    invoke-static {v12, v13, v14, v4, v5}, Ls1/s;->f(Ls1/t;JJ)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 144
    .line 145
    const/4 v5, 0x1

    .line 146
    goto :goto_4

    .line 147
    :cond_7
    :goto_5
    const/4 v1, 0x1

    .line 148
    :cond_8
    iget v4, v8, Ls1/k;->c:I

    .line 149
    .line 150
    if-ne v4, v3, :cond_9

    .line 151
    .line 152
    iget-object v1, v0, Lm/e0;->k:Lgg/q;

    .line 153
    .line 154
    const/4 v4, 0x1

    .line 155
    iput-boolean v4, v1, Lgg/q;->g:Z

    .line 156
    .line 157
    move v1, v4

    .line 158
    goto :goto_6

    .line 159
    :cond_9
    const/4 v4, 0x1

    .line 160
    :goto_6
    iput-object v7, v0, Lm/e0;->j:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v8, v0, Lm/e0;->g:Ls1/k;

    .line 163
    .line 164
    iput v1, v0, Lm/e0;->h:I

    .line 165
    .line 166
    iput v3, v0, Lm/e0;->i:I

    .line 167
    .line 168
    sget-object v5, Ls1/l;->i:Ls1/l;

    .line 169
    .line 170
    invoke-virtual {v7, v5, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    if-ne v5, v6, :cond_a

    .line 175
    .line 176
    :goto_7
    return-object v6

    .line 177
    :cond_a
    move-object v15, v8

    .line 178
    move-object v8, v7

    .line 179
    move-object v7, v15

    .line 180
    :goto_8
    check-cast v5, Ls1/k;

    .line 181
    .line 182
    iget-object v5, v5, Ls1/k;->a:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    const/4 v10, 0x0

    .line 189
    :goto_9
    if-ge v10, v9, :cond_c

    .line 190
    .line 191
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    check-cast v11, Ls1/t;

    .line 196
    .line 197
    invoke-virtual {v11}, Ls1/t;->b()Z

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-eqz v11, :cond_b

    .line 202
    .line 203
    move v1, v4

    .line 204
    goto :goto_a

    .line 205
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_c
    :goto_a
    iget-object v5, v0, Lm/e0;->l:Lgg/u;

    .line 209
    .line 210
    iget-object v9, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v9, Ls1/t;

    .line 213
    .line 214
    iget-wide v9, v9, Ls1/t;->a:J

    .line 215
    .line 216
    invoke-static {v7, v9, v10}, Lm/j0;->e(Ls1/k;J)Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    iget-object v7, v7, Ls1/k;->a:Ljava/lang/Object;

    .line 221
    .line 222
    iget-object v10, v0, Lm/e0;->m:Lgg/u;

    .line 223
    .line 224
    if-eqz v9, :cond_10

    .line 225
    .line 226
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    const/4 v11, 0x0

    .line 231
    :goto_b
    if-ge v11, v9, :cond_e

    .line 232
    .line 233
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    move-object v13, v12

    .line 238
    check-cast v13, Ls1/t;

    .line 239
    .line 240
    iget-boolean v13, v13, Ls1/t;->d:Z

    .line 241
    .line 242
    if-eqz v13, :cond_d

    .line 243
    .line 244
    goto :goto_c

    .line 245
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_e
    move-object v12, v2

    .line 249
    :goto_c
    check-cast v12, Ls1/t;

    .line 250
    .line 251
    if-eqz v12, :cond_f

    .line 252
    .line 253
    iput-object v12, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v12, v10, Lgg/u;->g:Ljava/lang/Object;

    .line 256
    .line 257
    goto :goto_f

    .line 258
    :cond_f
    move v1, v4

    .line 259
    move v5, v1

    .line 260
    move-object v7, v8

    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_10
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    const/4 v11, 0x0

    .line 268
    :goto_d
    if-ge v11, v9, :cond_12

    .line 269
    .line 270
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    move-object v13, v12

    .line 275
    check-cast v13, Ls1/t;

    .line 276
    .line 277
    iget-wide v13, v13, Ls1/t;->a:J

    .line 278
    .line 279
    iget-object v2, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v2, Ls1/t;

    .line 282
    .line 283
    iget-wide v3, v2, Ls1/t;->a:J

    .line 284
    .line 285
    invoke-static {v13, v14, v3, v4}, Ls1/s;->e(JJ)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_11

    .line 290
    .line 291
    goto :goto_e

    .line 292
    :cond_11
    add-int/lit8 v11, v11, 0x1

    .line 293
    .line 294
    const/4 v2, 0x0

    .line 295
    const/4 v3, 0x2

    .line 296
    const/4 v4, 0x1

    .line 297
    goto :goto_d

    .line 298
    :cond_12
    const/4 v12, 0x0

    .line 299
    :goto_e
    iput-object v12, v10, Lgg/u;->g:Ljava/lang/Object;

    .line 300
    .line 301
    :goto_f
    move-object v7, v8

    .line 302
    const/4 v2, 0x0

    .line 303
    const/4 v3, 0x2

    .line 304
    const/4 v5, 0x1

    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_13
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 308
    .line 309
    return-object v1
.end method
