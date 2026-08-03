.class public final Le0/c;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lac/k;Lh0/q0;Lw/y0;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Le0/c;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Le0/c;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Le0/c;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Le0/c;->l:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p0, p4}, Lyf/h;-><init>(Lwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Le0/d;Lwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le0/c;->g:I

    .line 14
    iput-object p1, p0, Le0/c;->l:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lyf/h;-><init>(Lwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Le0/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Le0/c;

    .line 7
    .line 8
    iget-object v1, p0, Le0/c;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lac/k;

    .line 11
    .line 12
    iget-object v2, p0, Le0/c;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lh0/q0;

    .line 15
    .line 16
    iget-object v3, p0, Le0/c;->l:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lw/y0;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3, p2}, Le0/c;-><init>(Lac/k;Lh0/q0;Lw/y0;Lwf/c;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Le0/c;->i:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance v0, Le0/c;

    .line 27
    .line 28
    iget-object v1, p0, Le0/c;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Le0/d;

    .line 31
    .line 32
    invoke-direct {v0, v1, p2}, Le0/c;-><init>(Le0/d;Lwf/c;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Le0/c;->i:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Le0/c;->g:I

    .line 2
    .line 3
    check-cast p1, Ls1/k0;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Le0/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Le0/c;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Le0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le0/c;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Le0/c;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Le0/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Le0/c;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Le0/c;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lac/k;

    .line 11
    .line 12
    iget v2, v0, Le0/c;->h:I

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x1

    .line 18
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    if-eq v2, v6, :cond_2

    .line 23
    .line 24
    if-eq v2, v5, :cond_1

    .line 25
    .line 26
    if-eq v2, v4, :cond_1

    .line 27
    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_2
    iget-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ls1/k0;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object/from16 v8, p1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ls1/k0;

    .line 60
    .line 61
    iput-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 62
    .line 63
    iput v6, v0, Le0/c;->h:I

    .line 64
    .line 65
    invoke-static {v2, v0}, La/a;->f(Ls1/k0;Lyf/a;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    if-ne v8, v7, :cond_4

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_4
    :goto_1
    check-cast v8, Ls1/k;

    .line 74
    .line 75
    iget-object v9, v1, Lac/k;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ly1/l2;

    .line 78
    .line 79
    iget-object v10, v1, Lac/k;->j:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Ls1/t;

    .line 82
    .line 83
    iget-object v11, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v12, 0x0

    .line 86
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    check-cast v11, Ls1/t;

    .line 91
    .line 92
    if-eqz v10, :cond_5

    .line 93
    .line 94
    iget-wide v13, v11, Ls1/t;->b:J

    .line 95
    .line 96
    move-wide v15, v13

    .line 97
    iget-wide v12, v10, Ls1/t;->b:J

    .line 98
    .line 99
    sub-long v13, v15, v12

    .line 100
    .line 101
    invoke-interface {v9}, Ly1/l2;->a()J

    .line 102
    .line 103
    .line 104
    move-result-wide v15

    .line 105
    cmp-long v12, v13, v15

    .line 106
    .line 107
    if-gez v12, :cond_5

    .line 108
    .line 109
    iget v12, v10, Ls1/t;->i:I

    .line 110
    .line 111
    invoke-static {v9, v12}, Lm/j0;->f(Ly1/l2;I)F

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    iget-wide v12, v10, Ls1/t;->c:J

    .line 116
    .line 117
    iget-wide v14, v11, Ls1/t;->c:J

    .line 118
    .line 119
    invoke-static {v12, v13, v14, v15}, Le1/b;->d(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v12

    .line 123
    invoke-static {v12, v13}, Le1/b;->c(J)F

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    cmpg-float v9, v10, v9

    .line 128
    .line 129
    if-gez v9, :cond_5

    .line 130
    .line 131
    iget v9, v1, Lac/k;->h:I

    .line 132
    .line 133
    add-int/2addr v9, v6

    .line 134
    iput v9, v1, Lac/k;->h:I

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    iput v6, v1, Lac/k;->h:I

    .line 138
    .line 139
    :goto_2
    iput-object v11, v1, Lac/k;->j:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {v8}, Lh0/e0;->a(Ls1/k;)Z

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    const/4 v10, 0x0

    .line 146
    if-eqz v9, :cond_8

    .line 147
    .line 148
    iget v11, v8, Ls1/k;->d:I

    .line 149
    .line 150
    and-int/lit8 v11, v11, 0x21

    .line 151
    .line 152
    if-eqz v11, :cond_8

    .line 153
    .line 154
    iget-object v11, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    const/4 v13, 0x0

    .line 161
    :goto_3
    if-ge v13, v12, :cond_7

    .line 162
    .line 163
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    check-cast v14, Ls1/t;

    .line 168
    .line 169
    invoke-virtual {v14}, Ls1/t;->b()Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_6

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_6
    add-int/lit8 v13, v13, 0x1

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    iget-object v3, v0, Le0/c;->k:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Lh0/q0;

    .line 182
    .line 183
    iput-object v10, v0, Le0/c;->i:Ljava/lang/Object;

    .line 184
    .line 185
    iput v5, v0, Le0/c;->h:I

    .line 186
    .line 187
    invoke-static {v2, v3, v1, v8, v0}, La/a;->B0(Ls1/k0;Lh0/q0;Lac/k;Ls1/k;Lyf/a;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-ne v1, v7, :cond_a

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    :goto_4
    if-nez v9, :cond_a

    .line 195
    .line 196
    iget v1, v1, Lac/k;->h:I

    .line 197
    .line 198
    iget-object v5, v0, Le0/c;->l:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v5, Lw/y0;

    .line 201
    .line 202
    if-ne v1, v6, :cond_9

    .line 203
    .line 204
    iput-object v10, v0, Le0/c;->i:Ljava/lang/Object;

    .line 205
    .line 206
    iput v4, v0, Le0/c;->h:I

    .line 207
    .line 208
    invoke-static {v2, v5, v8, v0}, La/a;->T0(Ls1/k0;Lw/y0;Ls1/k;Lyf/a;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-ne v1, v7, :cond_a

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_9
    iput-object v10, v0, Le0/c;->i:Ljava/lang/Object;

    .line 216
    .line 217
    iput v3, v0, Le0/c;->h:I

    .line 218
    .line 219
    invoke-static {v2, v5, v8, v1, v0}, La/a;->i(Ls1/k0;Lw/y0;Ls1/k;ILyf/a;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-ne v1, v7, :cond_a

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_a
    :goto_5
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 227
    .line 228
    :goto_6
    return-object v7

    .line 229
    :pswitch_0
    iget-object v1, v0, Le0/c;->l:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Le0/d;

    .line 232
    .line 233
    iget v2, v0, Le0/c;->h:I

    .line 234
    .line 235
    sget-object v3, Ls1/l;->g:Ls1/l;

    .line 236
    .line 237
    const/4 v4, 0x3

    .line 238
    const/4 v5, 0x2

    .line 239
    const/4 v7, 0x1

    .line 240
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 241
    .line 242
    if-eqz v2, :cond_e

    .line 243
    .line 244
    if-eq v2, v7, :cond_d

    .line 245
    .line 246
    if-eq v2, v5, :cond_c

    .line 247
    .line 248
    if-ne v2, v4, :cond_b

    .line 249
    .line 250
    iget-object v1, v0, Le0/c;->j:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Ls1/t;

    .line 253
    .line 254
    iget-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Ls1/k0;

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    move-object/from16 v6, p1

    .line 262
    .line 263
    move v5, v4

    .line 264
    move-object v8, v9

    .line 265
    const/4 v4, 0x0

    .line 266
    goto/16 :goto_1e

    .line 267
    .line 268
    :cond_b
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 269
    .line 270
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const/4 v9, 0x0

    .line 274
    goto/16 :goto_22

    .line 275
    .line 276
    :cond_c
    iget-object v2, v0, Le0/c;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, Ls1/l;

    .line 279
    .line 280
    iget-object v10, v0, Le0/c;->j:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v10, Ls1/t;

    .line 283
    .line 284
    iget-object v11, v0, Le0/c;->i:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v11, Ls1/k0;

    .line 287
    .line 288
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v12, p1

    .line 292
    .line 293
    goto/16 :goto_e

    .line 294
    .line 295
    :cond_d
    iget-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v2, Ls1/k0;

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v10, p1

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Ls1/k0;

    .line 311
    .line 312
    iput-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 313
    .line 314
    iput v7, v0, Le0/c;->h:I

    .line 315
    .line 316
    invoke-static {v2, v7, v3, v0}, Lm/y2;->a(Ls1/k0;ZLs1/l;Lwf/c;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    if-ne v10, v9, :cond_f

    .line 321
    .line 322
    :goto_7
    move-object v8, v9

    .line 323
    goto/16 :goto_1d

    .line 324
    .line 325
    :cond_f
    :goto_8
    check-cast v10, Ls1/t;

    .line 326
    .line 327
    iget v11, v10, Ls1/t;->i:I

    .line 328
    .line 329
    iget-wide v12, v10, Ls1/t;->c:J

    .line 330
    .line 331
    if-ne v11, v4, :cond_10

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_10
    const/4 v14, 0x4

    .line 335
    if-ne v11, v14, :cond_35

    .line 336
    .line 337
    :goto_9
    const/16 v11, 0x20

    .line 338
    .line 339
    shr-long v14, v12, v11

    .line 340
    .line 341
    long-to-int v14, v14

    .line 342
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 343
    .line 344
    .line 345
    move-result v15

    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    cmpl-float v15, v15, v16

    .line 349
    .line 350
    if-ltz v15, :cond_11

    .line 351
    .line 352
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 353
    .line 354
    .line 355
    move-result v14

    .line 356
    iget-object v15, v2, Ls1/k0;->l:Ls1/l0;

    .line 357
    .line 358
    move/from16 p1, v11

    .line 359
    .line 360
    move-wide/from16 v17, v12

    .line 361
    .line 362
    iget-wide v11, v15, Ls1/l0;->E:J

    .line 363
    .line 364
    shr-long v11, v11, p1

    .line 365
    .line 366
    long-to-int v11, v11

    .line 367
    int-to-float v11, v11

    .line 368
    cmpg-float v11, v14, v11

    .line 369
    .line 370
    if-gez v11, :cond_11

    .line 371
    .line 372
    const-wide v11, 0xffffffffL

    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    and-long v13, v17, v11

    .line 378
    .line 379
    long-to-int v13, v13

    .line 380
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    cmpl-float v14, v14, v16

    .line 385
    .line 386
    if-ltz v14, :cond_11

    .line 387
    .line 388
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    iget-object v14, v2, Ls1/k0;->l:Ls1/l0;

    .line 393
    .line 394
    iget-wide v14, v14, Ls1/l0;->E:J

    .line 395
    .line 396
    and-long/2addr v11, v14

    .line 397
    long-to-int v11, v11

    .line 398
    int-to-float v11, v11

    .line 399
    cmpg-float v11, v13, v11

    .line 400
    .line 401
    if-gez v11, :cond_11

    .line 402
    .line 403
    move v11, v7

    .line 404
    goto :goto_a

    .line 405
    :cond_11
    const/4 v11, 0x0

    .line 406
    :goto_a
    iget-boolean v12, v1, Le0/d;->x:Z

    .line 407
    .line 408
    if-nez v12, :cond_13

    .line 409
    .line 410
    if-eqz v11, :cond_12

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_12
    sget-object v11, Ls1/l;->h:Ls1/l;

    .line 414
    .line 415
    goto :goto_c

    .line 416
    :cond_13
    :goto_b
    move-object v11, v3

    .line 417
    :goto_c
    move-object/from16 v20, v11

    .line 418
    .line 419
    move-object v11, v2

    .line 420
    move-object/from16 v2, v20

    .line 421
    .line 422
    :goto_d
    iput-object v11, v0, Le0/c;->i:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v10, v0, Le0/c;->j:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v2, v0, Le0/c;->k:Ljava/lang/Object;

    .line 427
    .line 428
    iput v5, v0, Le0/c;->h:I

    .line 429
    .line 430
    invoke-virtual {v11, v2, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    if-ne v12, v9, :cond_14

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_14
    :goto_e
    check-cast v12, Ls1/k;

    .line 438
    .line 439
    iget-object v13, v12, Ls1/k;->a:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 442
    .line 443
    .line 444
    move-result v14

    .line 445
    const/4 v15, 0x0

    .line 446
    :goto_f
    if-ge v15, v14, :cond_16

    .line 447
    .line 448
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v16

    .line 452
    move-object/from16 v6, v16

    .line 453
    .line 454
    check-cast v6, Ls1/t;

    .line 455
    .line 456
    invoke-virtual {v6}, Ls1/t;->b()Z

    .line 457
    .line 458
    .line 459
    move-result v18

    .line 460
    move-object/from16 v19, v9

    .line 461
    .line 462
    if-nez v18, :cond_15

    .line 463
    .line 464
    iget-wide v8, v6, Ls1/t;->a:J

    .line 465
    .line 466
    iget-wide v4, v10, Ls1/t;->a:J

    .line 467
    .line 468
    invoke-static {v8, v9, v4, v5}, Ls1/s;->e(JJ)Z

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    if-eqz v4, :cond_15

    .line 473
    .line 474
    iget-boolean v4, v6, Ls1/t;->d:Z

    .line 475
    .line 476
    if-eqz v4, :cond_15

    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_15
    add-int/lit8 v15, v15, 0x1

    .line 480
    .line 481
    move-object/from16 v9, v19

    .line 482
    .line 483
    const/4 v4, 0x3

    .line 484
    const/4 v5, 0x2

    .line 485
    goto :goto_f

    .line 486
    :cond_16
    move-object/from16 v19, v9

    .line 487
    .line 488
    const/16 v16, 0x0

    .line 489
    .line 490
    :goto_10
    move-object/from16 v4, v16

    .line 491
    .line 492
    check-cast v4, Ls1/t;

    .line 493
    .line 494
    if-nez v4, :cond_17

    .line 495
    .line 496
    goto :goto_11

    .line 497
    :cond_17
    iget-wide v5, v4, Ls1/t;->b:J

    .line 498
    .line 499
    iget-wide v8, v10, Ls1/t;->b:J

    .line 500
    .line 501
    sub-long/2addr v5, v8

    .line 502
    invoke-virtual {v11}, Ls1/k0;->B()Ly1/l2;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    invoke-interface {v8}, Ly1/l2;->b()J

    .line 507
    .line 508
    .line 509
    move-result-wide v8

    .line 510
    cmp-long v5, v5, v8

    .line 511
    .line 512
    if-ltz v5, :cond_18

    .line 513
    .line 514
    goto :goto_11

    .line 515
    :cond_18
    iget v5, v12, Ls1/k;->c:I

    .line 516
    .line 517
    const/4 v6, 0x2

    .line 518
    if-ne v5, v6, :cond_19

    .line 519
    .line 520
    :goto_11
    const/4 v4, 0x0

    .line 521
    goto :goto_12

    .line 522
    :cond_19
    iget-wide v8, v4, Ls1/t;->c:J

    .line 523
    .line 524
    iget-wide v12, v10, Ls1/t;->c:J

    .line 525
    .line 526
    invoke-static {v8, v9, v12, v13}, Le1/b;->d(JJ)J

    .line 527
    .line 528
    .line 529
    move-result-wide v8

    .line 530
    invoke-static {v8, v9}, Le1/b;->c(J)F

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    invoke-virtual {v11}, Ls1/k0;->B()Ly1/l2;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    invoke-interface {v8}, Ly1/l2;->c()F

    .line 539
    .line 540
    .line 541
    move-result v8

    .line 542
    cmpl-float v5, v5, v8

    .line 543
    .line 544
    if-lez v5, :cond_34

    .line 545
    .line 546
    :goto_12
    if-nez v4, :cond_1a

    .line 547
    .line 548
    goto/16 :goto_21

    .line 549
    .line 550
    :cond_1a
    iget-boolean v2, v1, Le0/d;->x:Z

    .line 551
    .line 552
    if-nez v2, :cond_2f

    .line 553
    .line 554
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 555
    .line 556
    const/4 v5, 0x0

    .line 557
    :goto_13
    const/16 v6, 0x10

    .line 558
    .line 559
    if-eqz v2, :cond_22

    .line 560
    .line 561
    instance-of v8, v2, Ld1/b0;

    .line 562
    .line 563
    if-eqz v8, :cond_1b

    .line 564
    .line 565
    check-cast v2, Ld1/b0;

    .line 566
    .line 567
    invoke-static {v2}, Ld1/b0;->s1(Ld1/b0;)Z

    .line 568
    .line 569
    .line 570
    goto/16 :goto_1b

    .line 571
    .line 572
    :cond_1b
    iget v8, v2, Ly0/n;->i:I

    .line 573
    .line 574
    and-int/lit16 v8, v8, 0x400

    .line 575
    .line 576
    if-eqz v8, :cond_21

    .line 577
    .line 578
    instance-of v8, v2, Lx1/j;

    .line 579
    .line 580
    if-eqz v8, :cond_21

    .line 581
    .line 582
    move-object v8, v2

    .line 583
    check-cast v8, Lx1/j;

    .line 584
    .line 585
    iget-object v8, v8, Lx1/j;->v:Ly0/n;

    .line 586
    .line 587
    const/4 v9, 0x0

    .line 588
    :goto_14
    if-eqz v8, :cond_20

    .line 589
    .line 590
    iget v12, v8, Ly0/n;->i:I

    .line 591
    .line 592
    and-int/lit16 v12, v12, 0x400

    .line 593
    .line 594
    if-eqz v12, :cond_1f

    .line 595
    .line 596
    add-int/lit8 v9, v9, 0x1

    .line 597
    .line 598
    if-ne v9, v7, :cond_1c

    .line 599
    .line 600
    move-object v2, v8

    .line 601
    goto :goto_15

    .line 602
    :cond_1c
    if-nez v5, :cond_1d

    .line 603
    .line 604
    new-instance v5, Lj0/b;

    .line 605
    .line 606
    new-array v12, v6, [Ly0/n;

    .line 607
    .line 608
    invoke-direct {v5, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    :cond_1d
    if-eqz v2, :cond_1e

    .line 612
    .line 613
    invoke-virtual {v5, v2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    const/4 v2, 0x0

    .line 617
    :cond_1e
    invoke-virtual {v5, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    :cond_1f
    :goto_15
    iget-object v8, v8, Ly0/n;->l:Ly0/n;

    .line 621
    .line 622
    goto :goto_14

    .line 623
    :cond_20
    if-ne v9, v7, :cond_21

    .line 624
    .line 625
    goto :goto_13

    .line 626
    :cond_21
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    goto :goto_13

    .line 631
    :cond_22
    iget-object v2, v1, Ly0/n;->g:Ly0/n;

    .line 632
    .line 633
    iget-boolean v2, v2, Ly0/n;->t:Z

    .line 634
    .line 635
    if-nez v2, :cond_23

    .line 636
    .line 637
    const-string v2, "visitChildren called on an unattached node"

    .line 638
    .line 639
    invoke-static {v2}, Lu1/a;->b(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    :cond_23
    new-instance v2, Lj0/b;

    .line 643
    .line 644
    new-array v5, v6, [Ly0/n;

    .line 645
    .line 646
    invoke-direct {v2, v5}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    iget-object v5, v1, Ly0/n;->g:Ly0/n;

    .line 650
    .line 651
    iget-object v8, v5, Ly0/n;->l:Ly0/n;

    .line 652
    .line 653
    if-nez v8, :cond_24

    .line 654
    .line 655
    invoke-static {v2, v5}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 656
    .line 657
    .line 658
    goto :goto_16

    .line 659
    :cond_24
    invoke-virtual {v2, v8}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    :cond_25
    :goto_16
    iget v5, v2, Lj0/b;->i:I

    .line 663
    .line 664
    if-eqz v5, :cond_2f

    .line 665
    .line 666
    add-int/lit8 v5, v5, -0x1

    .line 667
    .line 668
    invoke-virtual {v2, v5}, Lj0/b;->k(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    check-cast v5, Ly0/n;

    .line 673
    .line 674
    iget v8, v5, Ly0/n;->j:I

    .line 675
    .line 676
    and-int/lit16 v8, v8, 0x400

    .line 677
    .line 678
    if-nez v8, :cond_26

    .line 679
    .line 680
    invoke-static {v2, v5}, Lx1/k;->b(Lj0/b;Ly0/n;)V

    .line 681
    .line 682
    .line 683
    goto :goto_16

    .line 684
    :cond_26
    :goto_17
    if-eqz v5, :cond_25

    .line 685
    .line 686
    iget v8, v5, Ly0/n;->i:I

    .line 687
    .line 688
    and-int/lit16 v8, v8, 0x400

    .line 689
    .line 690
    if-eqz v8, :cond_2e

    .line 691
    .line 692
    const/4 v8, 0x0

    .line 693
    :goto_18
    if-eqz v5, :cond_25

    .line 694
    .line 695
    instance-of v9, v5, Ld1/b0;

    .line 696
    .line 697
    if-eqz v9, :cond_27

    .line 698
    .line 699
    check-cast v5, Ld1/b0;

    .line 700
    .line 701
    invoke-static {v5}, Ld1/b0;->s1(Ld1/b0;)Z

    .line 702
    .line 703
    .line 704
    goto :goto_1b

    .line 705
    :cond_27
    iget v9, v5, Ly0/n;->i:I

    .line 706
    .line 707
    and-int/lit16 v9, v9, 0x400

    .line 708
    .line 709
    if-eqz v9, :cond_2d

    .line 710
    .line 711
    instance-of v9, v5, Lx1/j;

    .line 712
    .line 713
    if-eqz v9, :cond_2d

    .line 714
    .line 715
    move-object v9, v5

    .line 716
    check-cast v9, Lx1/j;

    .line 717
    .line 718
    iget-object v9, v9, Lx1/j;->v:Ly0/n;

    .line 719
    .line 720
    const/4 v12, 0x0

    .line 721
    :goto_19
    if-eqz v9, :cond_2c

    .line 722
    .line 723
    iget v13, v9, Ly0/n;->i:I

    .line 724
    .line 725
    and-int/lit16 v13, v13, 0x400

    .line 726
    .line 727
    if-eqz v13, :cond_2b

    .line 728
    .line 729
    add-int/lit8 v12, v12, 0x1

    .line 730
    .line 731
    if-ne v12, v7, :cond_28

    .line 732
    .line 733
    move-object v5, v9

    .line 734
    goto :goto_1a

    .line 735
    :cond_28
    if-nez v8, :cond_29

    .line 736
    .line 737
    new-instance v8, Lj0/b;

    .line 738
    .line 739
    new-array v13, v6, [Ly0/n;

    .line 740
    .line 741
    invoke-direct {v8, v13}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    :cond_29
    if-eqz v5, :cond_2a

    .line 745
    .line 746
    invoke-virtual {v8, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    const/4 v5, 0x0

    .line 750
    :cond_2a
    invoke-virtual {v8, v9}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    :cond_2b
    :goto_1a
    iget-object v9, v9, Ly0/n;->l:Ly0/n;

    .line 754
    .line 755
    goto :goto_19

    .line 756
    :cond_2c
    if-ne v12, v7, :cond_2d

    .line 757
    .line 758
    goto :goto_18

    .line 759
    :cond_2d
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    goto :goto_18

    .line 764
    :cond_2e
    iget-object v5, v5, Ly0/n;->l:Ly0/n;

    .line 765
    .line 766
    goto :goto_17

    .line 767
    :cond_2f
    :goto_1b
    iget-object v1, v1, Le0/d;->w:Lfg/a;

    .line 768
    .line 769
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4}, Ls1/t;->a()V

    .line 773
    .line 774
    .line 775
    move-object v1, v10

    .line 776
    move-object v2, v11

    .line 777
    :goto_1c
    iput-object v2, v0, Le0/c;->i:Ljava/lang/Object;

    .line 778
    .line 779
    iput-object v1, v0, Le0/c;->j:Ljava/lang/Object;

    .line 780
    .line 781
    const/4 v4, 0x0

    .line 782
    iput-object v4, v0, Le0/c;->k:Ljava/lang/Object;

    .line 783
    .line 784
    const/4 v5, 0x3

    .line 785
    iput v5, v0, Le0/c;->h:I

    .line 786
    .line 787
    invoke-virtual {v2, v3, v0}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v6

    .line 791
    move-object/from16 v8, v19

    .line 792
    .line 793
    if-ne v6, v8, :cond_30

    .line 794
    .line 795
    :goto_1d
    move-object v9, v8

    .line 796
    goto :goto_22

    .line 797
    :cond_30
    :goto_1e
    check-cast v6, Ls1/k;

    .line 798
    .line 799
    iget-object v6, v6, Ls1/k;->a:Ljava/lang/Object;

    .line 800
    .line 801
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 802
    .line 803
    .line 804
    move-result v7

    .line 805
    const/4 v9, 0x0

    .line 806
    :goto_1f
    if-ge v9, v7, :cond_32

    .line 807
    .line 808
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v10

    .line 812
    move-object v11, v10

    .line 813
    check-cast v11, Ls1/t;

    .line 814
    .line 815
    invoke-virtual {v11}, Ls1/t;->b()Z

    .line 816
    .line 817
    .line 818
    move-result v12

    .line 819
    if-nez v12, :cond_31

    .line 820
    .line 821
    iget-wide v12, v11, Ls1/t;->a:J

    .line 822
    .line 823
    iget-wide v14, v1, Ls1/t;->a:J

    .line 824
    .line 825
    invoke-static {v12, v13, v14, v15}, Ls1/s;->e(JJ)Z

    .line 826
    .line 827
    .line 828
    move-result v12

    .line 829
    if-eqz v12, :cond_31

    .line 830
    .line 831
    iget-boolean v11, v11, Ls1/t;->d:Z

    .line 832
    .line 833
    if-eqz v11, :cond_31

    .line 834
    .line 835
    goto :goto_20

    .line 836
    :cond_31
    add-int/lit8 v9, v9, 0x1

    .line 837
    .line 838
    goto :goto_1f

    .line 839
    :cond_32
    move-object v10, v4

    .line 840
    :goto_20
    check-cast v10, Ls1/t;

    .line 841
    .line 842
    if-nez v10, :cond_33

    .line 843
    .line 844
    goto :goto_21

    .line 845
    :cond_33
    invoke-virtual {v10}, Ls1/t;->a()V

    .line 846
    .line 847
    .line 848
    move-object/from16 v19, v8

    .line 849
    .line 850
    goto :goto_1c

    .line 851
    :cond_34
    move v5, v6

    .line 852
    move-object/from16 v9, v19

    .line 853
    .line 854
    const/4 v4, 0x3

    .line 855
    goto/16 :goto_d

    .line 856
    .line 857
    :cond_35
    :goto_21
    sget-object v9, Lsf/n;->a:Lsf/n;

    .line 858
    .line 859
    :goto_22
    return-object v9

    .line 860
    nop

    .line 861
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
