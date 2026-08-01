.class public final Lu11;
.super Lav0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public f:Ljava/lang/Object;

.field public g:Ljava/util/Iterator;

.field public h:I

.field public i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu11;->l:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lav0;-><init>(Lik;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 1

    .line 1
    new-instance v0, Lu11;

    .line 2
    .line 3
    iget-object p0, p0, Lu11;->l:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lu11;-><init>(Ljava/util/Iterator;Lik;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu11;->k:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq01;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu11;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lu11;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lu11;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lu11;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lq01;

    .line 6
    .line 7
    iget v2, v0, Lu11;->j:I

    .line 8
    .line 9
    const/4 v3, 0x5

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    sget-object v7, Lzk;->d:Lzk;

    .line 14
    .line 15
    if-eqz v2, :cond_c

    .line 16
    .line 17
    if-eq v2, v5, :cond_b

    .line 18
    .line 19
    if-eq v2, v4, :cond_a

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v8, 0x3

    .line 23
    if-eq v2, v8, :cond_2

    .line 24
    .line 25
    if-eq v2, v4, :cond_1

    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, Lu11;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lpv0;

    .line 32
    .line 33
    :goto_0
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v6

    .line 44
    :cond_1
    iget v2, v0, Lu11;->i:I

    .line 45
    .line 46
    iget v5, v0, Lu11;->h:I

    .line 47
    .line 48
    iget-object v8, v0, Lu11;->f:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Lpv0;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Lpv0;->b()V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_2
    iget v2, v0, Lu11;->i:I

    .line 61
    .line 62
    iget v9, v0, Lu11;->h:I

    .line 63
    .line 64
    iget-object v10, v0, Lu11;->g:Ljava/util/Iterator;

    .line 65
    .line 66
    iget-object v11, v0, Lu11;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Lpv0;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Lpv0;->b()V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget v12, v11, Lpv0;->e:I

    .line 77
    .line 78
    iget-object v13, v11, Lpv0;->d:[Ljava/lang/Object;

    .line 79
    .line 80
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-eqz v14, :cond_8

    .line 85
    .line 86
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-virtual {v11}, Lpv0;->a()I

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    if-eq v15, v12, :cond_7

    .line 95
    .line 96
    iget v15, v11, Lpv0;->f:I

    .line 97
    .line 98
    move/from16 v16, v5

    .line 99
    .line 100
    iget v5, v11, Lpv0;->g:I

    .line 101
    .line 102
    add-int/2addr v15, v5

    .line 103
    rem-int/2addr v15, v12

    .line 104
    aput-object v14, v13, v15

    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    iput v5, v11, Lpv0;->g:I

    .line 109
    .line 110
    invoke-virtual {v11}, Lpv0;->a()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-ne v5, v12, :cond_5

    .line 115
    .line 116
    iget v5, v11, Lpv0;->g:I

    .line 117
    .line 118
    if-ge v5, v3, :cond_6

    .line 119
    .line 120
    shr-int/lit8 v5, v12, 0x1

    .line 121
    .line 122
    add-int/2addr v12, v5

    .line 123
    add-int/lit8 v12, v12, 0x1

    .line 124
    .line 125
    if-le v12, v3, :cond_3

    .line 126
    .line 127
    move v12, v3

    .line 128
    :cond_3
    iget v5, v11, Lpv0;->f:I

    .line 129
    .line 130
    if-nez v5, :cond_4

    .line 131
    .line 132
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    new-array v5, v12, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v11, v5}, Lpv0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    :goto_2
    new-instance v12, Lpv0;

    .line 144
    .line 145
    iget v11, v11, Lpv0;->g:I

    .line 146
    .line 147
    invoke-direct {v12, v11, v5}, Lpv0;-><init>(I[Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object v11, v12

    .line 151
    :cond_5
    move/from16 v5, v16

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 157
    .line 158
    .line 159
    iput-object v1, v0, Lu11;->k:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v11, v0, Lu11;->f:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v10, v0, Lu11;->g:Ljava/util/Iterator;

    .line 164
    .line 165
    iput v9, v0, Lu11;->h:I

    .line 166
    .line 167
    iput v2, v0, Lu11;->i:I

    .line 168
    .line 169
    iput v8, v0, Lu11;->j:I

    .line 170
    .line 171
    invoke-virtual {v1, v0, v3}, Lq01;->b(Lik;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-object v7

    .line 175
    :cond_7
    const-string v0, "ring buffer is full"

    .line 176
    .line 177
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-object v6

    .line 181
    :cond_8
    move v5, v9

    .line 182
    move-object v8, v11

    .line 183
    :goto_3
    iget v9, v8, Lpv0;->g:I

    .line 184
    .line 185
    if-le v9, v3, :cond_9

    .line 186
    .line 187
    new-instance v3, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 190
    .line 191
    .line 192
    iput-object v1, v0, Lu11;->k:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v8, v0, Lu11;->f:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v6, v0, Lu11;->g:Ljava/util/Iterator;

    .line 197
    .line 198
    iput v5, v0, Lu11;->h:I

    .line 199
    .line 200
    iput v2, v0, Lu11;->i:I

    .line 201
    .line 202
    iput v4, v0, Lu11;->j:I

    .line 203
    .line 204
    invoke-virtual {v1, v0, v3}, Lq01;->b(Lik;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-object v7

    .line 208
    :cond_9
    invoke-virtual {v8}, Lp;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_10

    .line 213
    .line 214
    iput-object v6, v0, Lu11;->k:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v6, v0, Lu11;->f:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v6, v0, Lu11;->g:Ljava/util/Iterator;

    .line 219
    .line 220
    iput v5, v0, Lu11;->h:I

    .line 221
    .line 222
    iput v2, v0, Lu11;->i:I

    .line 223
    .line 224
    iput v3, v0, Lu11;->j:I

    .line 225
    .line 226
    invoke-virtual {v1, v0, v8}, Lq01;->b(Lik;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-object v7

    .line 230
    :cond_a
    iget-object v0, v0, Lu11;->f:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Ljava/util/ArrayList;

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_b
    move/from16 v16, v5

    .line 237
    .line 238
    iget v2, v0, Lu11;->i:I

    .line 239
    .line 240
    iget v5, v0, Lu11;->h:I

    .line 241
    .line 242
    iget-object v8, v0, Lu11;->g:Ljava/util/Iterator;

    .line 243
    .line 244
    iget-object v9, v0, Lu11;->f:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v9, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    new-instance v9, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 254
    .line 255
    .line 256
    move-object v10, v9

    .line 257
    move-object v9, v8

    .line 258
    move v8, v5

    .line 259
    move v5, v2

    .line 260
    goto :goto_4

    .line 261
    :cond_c
    move/from16 v16, v5

    .line 262
    .line 263
    invoke-static/range {p1 .. p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    new-instance v9, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    iget-object v8, v0, Lu11;->l:Ljava/util/Iterator;

    .line 272
    .line 273
    const/4 v2, 0x0

    .line 274
    move v5, v2

    .line 275
    move-object v10, v9

    .line 276
    move-object v9, v8

    .line 277
    move v8, v3

    .line 278
    :cond_d
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    if-eqz v11, :cond_f

    .line 283
    .line 284
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    if-lez v2, :cond_e

    .line 289
    .line 290
    add-int/lit8 v2, v2, -0x1

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_e
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-ne v11, v3, :cond_d

    .line 301
    .line 302
    iput-object v1, v0, Lu11;->k:Ljava/lang/Object;

    .line 303
    .line 304
    iput-object v10, v0, Lu11;->f:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object v9, v0, Lu11;->g:Ljava/util/Iterator;

    .line 307
    .line 308
    iput v8, v0, Lu11;->h:I

    .line 309
    .line 310
    iput v5, v0, Lu11;->i:I

    .line 311
    .line 312
    move/from16 v11, v16

    .line 313
    .line 314
    iput v11, v0, Lu11;->j:I

    .line 315
    .line 316
    invoke-virtual {v1, v0, v10}, Lq01;->b(Lik;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-object v7

    .line 320
    :cond_f
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-nez v2, :cond_10

    .line 325
    .line 326
    iput-object v6, v0, Lu11;->k:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v6, v0, Lu11;->f:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v6, v0, Lu11;->g:Ljava/util/Iterator;

    .line 331
    .line 332
    iput v8, v0, Lu11;->h:I

    .line 333
    .line 334
    iput v5, v0, Lu11;->i:I

    .line 335
    .line 336
    iput v4, v0, Lu11;->j:I

    .line 337
    .line 338
    invoke-virtual {v1, v0, v10}, Lq01;->b(Lik;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    return-object v7

    .line 342
    :cond_10
    :goto_5
    sget-object v0, Lna1;->a:Lna1;

    .line 343
    .line 344
    return-object v0
.end method
