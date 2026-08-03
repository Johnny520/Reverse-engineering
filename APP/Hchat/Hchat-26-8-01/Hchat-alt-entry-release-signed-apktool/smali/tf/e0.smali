.class public final Ltf/e0;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:Ljava/lang/Object;

.field public h:Ljava/util/Iterator;

.field public i:I

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(IILjava/util/Iterator;Lwf/c;)V
    .locals 0

    .line 1
    iput p1, p0, Ltf/e0;->m:I

    .line 2
    .line 3
    iput p2, p0, Ltf/e0;->n:I

    .line 4
    .line 5
    iput-object p3, p0, Ltf/e0;->o:Ljava/util/Iterator;

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
    new-instance v0, Ltf/e0;

    .line 2
    .line 3
    iget v1, p0, Ltf/e0;->n:I

    .line 4
    .line 5
    iget-object v2, p0, Ltf/e0;->o:Ljava/util/Iterator;

    .line 6
    .line 7
    iget v3, p0, Ltf/e0;->m:I

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Ltf/e0;-><init>(IILjava/util/Iterator;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lng/l;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ltf/e0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ltf/e0;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ltf/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lng/l;

    .line 6
    .line 7
    iget v2, v0, Ltf/e0;->k:I

    .line 8
    .line 9
    const/4 v3, 0x5

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    iget v7, v0, Ltf/e0;->n:I

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    iget v9, v0, Ltf/e0;->m:I

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    sget-object v11, Lxf/a;->g:Lxf/a;

    .line 20
    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    if-eq v2, v8, :cond_4

    .line 24
    .line 25
    if-eq v2, v6, :cond_3

    .line 26
    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    if-eq v2, v4, :cond_1

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iget-object v1, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ltf/c0;

    .line 36
    .line 37
    :goto_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_0
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    const/4 v1, 0x0

    .line 48
    return-object v1

    .line 49
    :cond_1
    iget v2, v0, Ltf/e0;->j:I

    .line 50
    .line 51
    iget v5, v0, Ltf/e0;->i:I

    .line 52
    .line 53
    iget-object v6, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Ltf/c0;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v7}, Ltf/c0;->a(I)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_2
    iget v2, v0, Ltf/e0;->j:I

    .line 66
    .line 67
    iget v6, v0, Ltf/e0;->i:I

    .line 68
    .line 69
    iget-object v12, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 70
    .line 71
    iget-object v13, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v13, Ltf/c0;

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v13, v7}, Ltf/c0;->a(I)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_3
    iget-object v1, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget v2, v0, Ltf/e0;->j:I

    .line 89
    .line 90
    iget v3, v0, Ltf/e0;->i:I

    .line 91
    .line 92
    iget-object v4, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 93
    .line 94
    iget-object v5, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    move v12, v2

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const/16 v2, 0x400

    .line 112
    .line 113
    if-le v9, v2, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    move v2, v9

    .line 117
    :goto_2
    sub-int v12, v7, v9

    .line 118
    .line 119
    iget-object v13, v0, Ltf/e0;->o:Ljava/util/Iterator;

    .line 120
    .line 121
    const/4 v14, 0x0

    .line 122
    if-ltz v12, :cond_a

    .line 123
    .line 124
    new-instance v5, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    move v3, v2

    .line 130
    move-object v4, v13

    .line 131
    move v2, v14

    .line 132
    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_9

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    if-lez v2, :cond_8

    .line 143
    .line 144
    add-int/lit8 v2, v2, -0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-ne v7, v9, :cond_7

    .line 155
    .line 156
    iput-object v1, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v5, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 159
    .line 160
    iput-object v4, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 161
    .line 162
    iput v3, v0, Ltf/e0;->i:I

    .line 163
    .line 164
    iput v12, v0, Ltf/e0;->j:I

    .line 165
    .line 166
    iput v8, v0, Ltf/e0;->k:I

    .line 167
    .line 168
    invoke-virtual {v1, v5, v0}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 169
    .line 170
    .line 171
    return-object v11

    .line 172
    :cond_9
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_12

    .line 177
    .line 178
    iput-object v10, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v10, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v10, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 183
    .line 184
    iput v3, v0, Ltf/e0;->i:I

    .line 185
    .line 186
    iput v12, v0, Ltf/e0;->j:I

    .line 187
    .line 188
    iput v6, v0, Ltf/e0;->k:I

    .line 189
    .line 190
    invoke-virtual {v1, v5, v0}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 191
    .line 192
    .line 193
    return-object v11

    .line 194
    :cond_a
    new-instance v6, Ltf/c0;

    .line 195
    .line 196
    new-array v15, v2, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-direct {v6, v14, v15}, Ltf/c0;-><init>(I[Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v19, v6

    .line 202
    .line 203
    move v6, v2

    .line 204
    move v2, v12

    .line 205
    move-object v12, v13

    .line 206
    move-object/from16 v13, v19

    .line 207
    .line 208
    :goto_4
    iget v14, v13, Ltf/c0;->h:I

    .line 209
    .line 210
    iget-object v15, v13, Ltf/c0;->g:[Ljava/lang/Object;

    .line 211
    .line 212
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v16

    .line 216
    if-eqz v16, :cond_10

    .line 217
    .line 218
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v16

    .line 222
    move/from16 v17, v8

    .line 223
    .line 224
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-eq v8, v14, :cond_f

    .line 229
    .line 230
    iget v8, v13, Ltf/c0;->i:I

    .line 231
    .line 232
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 233
    .line 234
    .line 235
    move-result v18

    .line 236
    add-int v18, v18, v8

    .line 237
    .line 238
    rem-int v18, v18, v14

    .line 239
    .line 240
    aput-object v16, v15, v18

    .line 241
    .line 242
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    add-int/lit8 v8, v8, 0x1

    .line 247
    .line 248
    iput v8, v13, Ltf/c0;->j:I

    .line 249
    .line 250
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-ne v8, v14, :cond_d

    .line 255
    .line 256
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-ge v8, v9, :cond_e

    .line 261
    .line 262
    shr-int/lit8 v8, v14, 0x1

    .line 263
    .line 264
    add-int/2addr v14, v8

    .line 265
    add-int/lit8 v14, v14, 0x1

    .line 266
    .line 267
    if-le v14, v9, :cond_b

    .line 268
    .line 269
    move v14, v9

    .line 270
    :cond_b
    iget v8, v13, Ltf/c0;->i:I

    .line 271
    .line 272
    if-nez v8, :cond_c

    .line 273
    .line 274
    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    goto :goto_5

    .line 279
    :cond_c
    new-array v8, v14, [Ljava/lang/Object;

    .line 280
    .line 281
    invoke-virtual {v13, v8}, Ltf/c0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    :goto_5
    new-instance v14, Ltf/c0;

    .line 286
    .line 287
    invoke-virtual {v13}, Ltf/a;->size()I

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    invoke-direct {v14, v13, v8}, Ltf/c0;-><init>(I[Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    move-object v13, v14

    .line 295
    :cond_d
    move/from16 v8, v17

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_e
    new-instance v3, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 301
    .line 302
    .line 303
    iput-object v1, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v13, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v12, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 308
    .line 309
    iput v6, v0, Ltf/e0;->i:I

    .line 310
    .line 311
    iput v2, v0, Ltf/e0;->j:I

    .line 312
    .line 313
    iput v5, v0, Ltf/e0;->k:I

    .line 314
    .line 315
    invoke-virtual {v1, v3, v0}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 316
    .line 317
    .line 318
    return-object v11

    .line 319
    :cond_f
    const-string v1, "ring buffer is full"

    .line 320
    .line 321
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_1

    .line 325
    .line 326
    :cond_10
    move v5, v6

    .line 327
    move-object v6, v13

    .line 328
    :goto_6
    invoke-virtual {v6}, Ltf/a;->size()I

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    if-le v8, v7, :cond_11

    .line 333
    .line 334
    new-instance v3, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 337
    .line 338
    .line 339
    iput-object v1, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 340
    .line 341
    iput-object v6, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object v10, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 344
    .line 345
    iput v5, v0, Ltf/e0;->i:I

    .line 346
    .line 347
    iput v2, v0, Ltf/e0;->j:I

    .line 348
    .line 349
    iput v4, v0, Ltf/e0;->k:I

    .line 350
    .line 351
    invoke-virtual {v1, v3, v0}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 352
    .line 353
    .line 354
    return-object v11

    .line 355
    :cond_11
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-nez v4, :cond_12

    .line 360
    .line 361
    iput-object v10, v0, Ltf/e0;->l:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v10, v0, Ltf/e0;->g:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v10, v0, Ltf/e0;->h:Ljava/util/Iterator;

    .line 366
    .line 367
    iput v5, v0, Ltf/e0;->i:I

    .line 368
    .line 369
    iput v2, v0, Ltf/e0;->j:I

    .line 370
    .line 371
    iput v3, v0, Ltf/e0;->k:I

    .line 372
    .line 373
    invoke-virtual {v1, v6, v0}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 374
    .line 375
    .line 376
    return-object v11

    .line 377
    :cond_12
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 378
    .line 379
    return-object v1
.end method
