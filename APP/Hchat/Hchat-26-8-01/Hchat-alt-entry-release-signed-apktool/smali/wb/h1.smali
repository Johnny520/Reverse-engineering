.class public final synthetic Lwb/h1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lwb/lv;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;ZLandroid/app/Activity;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lwb/h1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/h1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/h1;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/h1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/h1;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/h1;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-boolean p6, p0, Lwb/h1;->l:Z

    .line 18
    .line 19
    iput-object p7, p0, Lwb/h1;->j:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/h1;->k:Lfg/l;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lsh/x;Lr/z;Li0/a1;Ljava/util/Set;Lfg/l;Ln9/a;ZLfg/a;)V
    .locals 1

    .line 24
    const/4 v0, 0x1

    iput v0, p0, Lwb/h1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/h1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/h1;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/h1;->j:Ljava/lang/Object;

    iput-object p4, p0, Lwb/h1;->m:Ljava/lang/Object;

    iput-object p5, p0, Lwb/h1;->k:Lfg/l;

    iput-object p6, p0, Lwb/h1;->n:Ljava/lang/Object;

    iput-boolean p7, p0, Lwb/h1;->l:Z

    iput-object p8, p0, Lwb/h1;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lsh/x;Lr/z;ZLfg/l;Ljava/util/List;Ljava/util/ArrayList;Lfg/l;Li0/a1;)V
    .locals 1

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lwb/h1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/h1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/h1;->i:Ljava/lang/Object;

    iput-boolean p3, p0, Lwb/h1;->l:Z

    iput-object p4, p0, Lwb/h1;->k:Lfg/l;

    iput-object p5, p0, Lwb/h1;->n:Ljava/lang/Object;

    iput-object p6, p0, Lwb/h1;->o:Ljava/lang/Object;

    iput-object p7, p0, Lwb/h1;->m:Ljava/lang/Object;

    iput-object p8, p0, Lwb/h1;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lwb/v0;Li0/a1;Li0/a1;Landroid/content/Context;Lfg/l;Lfg/a;Ljava/util/Set;Z)V
    .locals 1

    .line 26
    const/4 v0, 0x2

    iput v0, p0, Lwb/h1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/h1;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/h1;->j:Ljava/lang/Object;

    iput-object p3, p0, Lwb/h1;->i:Ljava/lang/Object;

    iput-object p4, p0, Lwb/h1;->m:Ljava/lang/Object;

    iput-object p5, p0, Lwb/h1;->k:Lfg/l;

    iput-object p6, p0, Lwb/h1;->n:Ljava/lang/Object;

    iput-object p7, p0, Lwb/h1;->o:Ljava/lang/Object;

    iput-boolean p8, p0, Lwb/h1;->l:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/h1;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/h1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, v0, Lwb/h1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lwb/lv;

    .line 17
    .line 18
    iget-object v1, v0, Lwb/h1;->o:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v1, v0, Lwb/h1;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, Ljava/util/Set;

    .line 27
    .line 28
    iget-object v1, v0, Lwb/h1;->n:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, v0, Lwb/h1;->j:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v11, v1

    .line 36
    check-cast v11, Landroid/app/Activity;

    .line 37
    .line 38
    move-object/from16 v5, p1

    .line 39
    .line 40
    check-cast v5, Lfg/a;

    .line 41
    .line 42
    move-object/from16 v1, p2

    .line 43
    .line 44
    check-cast v1, Li0/h0;

    .line 45
    .line 46
    move-object/from16 v2, p3

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    and-int/lit8 v9, v2, 0x6

    .line 58
    .line 59
    if-nez v9, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_0

    .line 66
    .line 67
    const/4 v9, 0x4

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const/4 v9, 0x2

    .line 70
    :goto_0
    or-int/2addr v2, v9

    .line 71
    :cond_1
    and-int/lit8 v9, v2, 0x13

    .line 72
    .line 73
    const/16 v10, 0x12

    .line 74
    .line 75
    if-eq v9, v10, :cond_2

    .line 76
    .line 77
    const/4 v9, 0x1

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/4 v9, 0x0

    .line 80
    :goto_1
    and-int/lit8 v10, v2, 0x1

    .line 81
    .line 82
    invoke-virtual {v1, v10, v9}, Li0/h0;->S(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_3

    .line 87
    .line 88
    move v13, v2

    .line 89
    sget-object v2, Lwb/y2;->p:Lwb/y2;

    .line 90
    .line 91
    move-object v9, v5

    .line 92
    new-instance v5, Lwb/ef;

    .line 93
    .line 94
    iget-boolean v10, v0, Lwb/h1;->l:Z

    .line 95
    .line 96
    iget-object v12, v0, Lwb/h1;->k:Lfg/l;

    .line 97
    .line 98
    invoke-direct/range {v5 .. v12}, Lwb/ef;-><init>(Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lfg/a;ZLandroid/app/Activity;Lfg/l;)V

    .line 99
    .line 100
    .line 101
    const v6, -0x62652cd0

    .line 102
    .line 103
    .line 104
    invoke-static {v6, v5, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    shl-int/lit8 v5, v13, 0x9

    .line 109
    .line 110
    and-int/lit16 v5, v5, 0x1c00

    .line 111
    .line 112
    const v7, 0x36006

    .line 113
    .line 114
    .line 115
    or-int v8, v5, v7

    .line 116
    .line 117
    move-object v7, v1

    .line 118
    move-object v5, v9

    .line 119
    invoke-virtual/range {v2 .. v8}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    move-object v7, v1

    .line 124
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 125
    .line 126
    .line 127
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object v1

    .line 130
    :pswitch_0
    iget-object v1, v0, Lwb/h1;->h:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v3, v1

    .line 133
    check-cast v3, Lwb/v0;

    .line 134
    .line 135
    iget-object v1, v0, Lwb/h1;->j:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v6, v1

    .line 138
    check-cast v6, Li0/a1;

    .line 139
    .line 140
    iget-object v1, v0, Lwb/h1;->i:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v7, v1

    .line 143
    check-cast v7, Li0/a1;

    .line 144
    .line 145
    iget-object v1, v0, Lwb/h1;->m:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v4, v1

    .line 148
    check-cast v4, Landroid/content/Context;

    .line 149
    .line 150
    iget-object v1, v0, Lwb/h1;->n:Ljava/lang/Object;

    .line 151
    .line 152
    move-object v11, v1

    .line 153
    check-cast v11, Lfg/a;

    .line 154
    .line 155
    iget-object v1, v0, Lwb/h1;->o:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Ljava/util/Set;

    .line 158
    .line 159
    move-object/from16 v2, p1

    .line 160
    .line 161
    check-cast v2, Lth/a;

    .line 162
    .line 163
    move-object/from16 v14, p2

    .line 164
    .line 165
    check-cast v14, Li0/h0;

    .line 166
    .line 167
    move-object/from16 v5, p3

    .line 168
    .line 169
    check-cast v5, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v2, v5, 0x11

    .line 179
    .line 180
    const/16 v8, 0x10

    .line 181
    .line 182
    const/4 v9, 0x1

    .line 183
    const/4 v10, 0x0

    .line 184
    if-eq v2, v8, :cond_4

    .line 185
    .line 186
    move v2, v9

    .line 187
    goto :goto_3

    .line 188
    :cond_4
    move v2, v10

    .line 189
    :goto_3
    and-int/2addr v5, v9

    .line 190
    invoke-virtual {v14, v5, v2}, Li0/h0;->S(IZ)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_d

    .line 195
    .line 196
    iget-boolean v9, v3, Lwb/v0;->c:Z

    .line 197
    .line 198
    if-eqz v9, :cond_5

    .line 199
    .line 200
    const-string v2, "\u4fdd\u5b58\u9009\u62e9"

    .line 201
    .line 202
    :goto_4
    move-object v12, v2

    .line 203
    goto :goto_5

    .line 204
    :cond_5
    iget-object v2, v3, Lwb/v0;->h:Ljava/lang/String;

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :goto_5
    invoke-virtual {v14, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    or-int/2addr v2, v5

    .line 216
    invoke-virtual {v14, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    or-int/2addr v2, v5

    .line 221
    invoke-virtual {v14, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    or-int/2addr v2, v5

    .line 226
    iget-object v5, v0, Lwb/h1;->k:Lfg/l;

    .line 227
    .line 228
    invoke-virtual {v14, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    or-int/2addr v2, v8

    .line 233
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    sget-object v13, Li0/l;->a:Li0/e;

    .line 238
    .line 239
    if-nez v2, :cond_6

    .line 240
    .line 241
    if-ne v8, v13, :cond_7

    .line 242
    .line 243
    :cond_6
    new-instance v2, Lc9/r0;

    .line 244
    .line 245
    const/16 v8, 0x8

    .line 246
    .line 247
    invoke-direct/range {v2 .. v8}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v14, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object v8, v2

    .line 254
    :cond_7
    check-cast v8, Lfg/a;

    .line 255
    .line 256
    iget-boolean v2, v0, Lwb/h1;->l:Z

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    if-eqz v9, :cond_9

    .line 260
    .line 261
    move-object v4, v1

    .line 262
    check-cast v4, Ljava/util/Collection;

    .line 263
    .line 264
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_9

    .line 269
    .line 270
    if-eqz v2, :cond_8

    .line 271
    .line 272
    const-string v4, "\u53d6\u6d88\u5168\u9009"

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_8
    const-string v4, "\u5168\u9009"

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_9
    move-object v4, v3

    .line 279
    :goto_6
    if-eqz v9, :cond_c

    .line 280
    .line 281
    move-object v5, v1

    .line 282
    check-cast v5, Ljava/util/Collection;

    .line 283
    .line 284
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-nez v5, :cond_c

    .line 289
    .line 290
    const v3, -0x5e59cbc7

    .line 291
    .line 292
    .line 293
    invoke-virtual {v14, v3}, Li0/h0;->a0(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    invoke-virtual {v14, v2}, Li0/h0;->g(Z)Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    or-int/2addr v3, v5

    .line 305
    invoke-virtual {v14, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    or-int/2addr v3, v5

    .line 310
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    if-nez v3, :cond_a

    .line 315
    .line 316
    if-ne v5, v13, :cond_b

    .line 317
    .line 318
    :cond_a
    new-instance v5, Lwb/p1;

    .line 319
    .line 320
    const/4 v3, 0x1

    .line 321
    invoke-direct {v5, v2, v1, v7, v3}, Lwb/p1;-><init>(ZLjava/util/Set;Li0/a1;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v14, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_b
    move-object v3, v5

    .line 328
    check-cast v3, Lfg/a;

    .line 329
    .line 330
    invoke-virtual {v14, v10}, Li0/h0;->p(Z)V

    .line 331
    .line 332
    .line 333
    :goto_7
    move-object v13, v3

    .line 334
    goto :goto_8

    .line 335
    :cond_c
    const v1, -0x5e55237d

    .line 336
    .line 337
    .line 338
    invoke-virtual {v14, v1}, Li0/h0;->a0(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v14, v10}, Li0/h0;->p(Z)V

    .line 342
    .line 343
    .line 344
    goto :goto_7

    .line 345
    :goto_8
    const/16 v15, 0x180

    .line 346
    .line 347
    const/16 v16, 0x0

    .line 348
    .line 349
    const-string v10, "\u8fd4\u56de"

    .line 350
    .line 351
    move-object v9, v8

    .line 352
    move-object v8, v12

    .line 353
    move-object v12, v4

    .line 354
    invoke-static/range {v8 .. v16}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_d
    invoke-virtual {v14}, Li0/h0;->V()V

    .line 359
    .line 360
    .line 361
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 362
    .line 363
    return-object v1

    .line 364
    :pswitch_1
    iget-object v1, v0, Lwb/h1;->h:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v1, Lsh/x;

    .line 367
    .line 368
    iget-object v2, v0, Lwb/h1;->i:Ljava/lang/Object;

    .line 369
    .line 370
    move-object v4, v2

    .line 371
    check-cast v4, Lr/z;

    .line 372
    .line 373
    iget-object v2, v0, Lwb/h1;->j:Ljava/lang/Object;

    .line 374
    .line 375
    move-object v7, v2

    .line 376
    check-cast v7, Li0/a1;

    .line 377
    .line 378
    iget-object v2, v0, Lwb/h1;->m:Ljava/lang/Object;

    .line 379
    .line 380
    move-object v8, v2

    .line 381
    check-cast v8, Ljava/util/Set;

    .line 382
    .line 383
    iget-object v2, v0, Lwb/h1;->n:Ljava/lang/Object;

    .line 384
    .line 385
    move-object v10, v2

    .line 386
    check-cast v10, Ln9/a;

    .line 387
    .line 388
    iget-object v2, v0, Lwb/h1;->o:Ljava/lang/Object;

    .line 389
    .line 390
    move-object v11, v2

    .line 391
    check-cast v11, Lfg/a;

    .line 392
    .line 393
    move-object/from16 v2, p1

    .line 394
    .line 395
    check-cast v2, Lp/x0;

    .line 396
    .line 397
    move-object/from16 v3, p2

    .line 398
    .line 399
    check-cast v3, Li0/h0;

    .line 400
    .line 401
    move-object/from16 v5, p3

    .line 402
    .line 403
    check-cast v5, Ljava/lang/Integer;

    .line 404
    .line 405
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    and-int/lit8 v6, v5, 0x6

    .line 413
    .line 414
    if-nez v6, :cond_f

    .line 415
    .line 416
    invoke-virtual {v3, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    if-eqz v6, :cond_e

    .line 421
    .line 422
    const/4 v6, 0x4

    .line 423
    goto :goto_a

    .line 424
    :cond_e
    const/4 v6, 0x2

    .line 425
    :goto_a
    or-int/2addr v5, v6

    .line 426
    :cond_f
    and-int/lit8 v6, v5, 0x13

    .line 427
    .line 428
    const/16 v9, 0x12

    .line 429
    .line 430
    const/4 v12, 0x1

    .line 431
    if-eq v6, v9, :cond_10

    .line 432
    .line 433
    move v6, v12

    .line 434
    goto :goto_b

    .line 435
    :cond_10
    const/4 v6, 0x0

    .line 436
    :goto_b
    and-int/2addr v5, v12

    .line 437
    invoke-virtual {v3, v5, v6}, Li0/h0;->S(IZ)Z

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    if-eqz v5, :cond_13

    .line 442
    .line 443
    sget-object v5, Lp/h1;->c:Lp/a0;

    .line 444
    .line 445
    iget-object v1, v1, Lsh/x;->e:Lm/a;

    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    invoke-static {v5, v1, v6}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-interface {v2}, Lp/x0;->c()F

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    const/16 v6, 0x8

    .line 457
    .line 458
    int-to-float v6, v6

    .line 459
    add-float/2addr v5, v6

    .line 460
    invoke-interface {v2}, Lp/x0;->a()F

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    const/16 v6, 0x54

    .line 465
    .line 466
    int-to-float v6, v6

    .line 467
    add-float/2addr v2, v6

    .line 468
    const/4 v6, 0x5

    .line 469
    invoke-static {v5, v2, v6}, Lp/d;->b(FFI)Lp/z0;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v3, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    invoke-virtual {v3, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    or-int/2addr v5, v6

    .line 482
    iget-object v9, v0, Lwb/h1;->k:Lfg/l;

    .line 483
    .line 484
    invoke-virtual {v3, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v6

    .line 488
    or-int/2addr v5, v6

    .line 489
    invoke-virtual {v3, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    or-int/2addr v5, v6

    .line 494
    iget-boolean v6, v0, Lwb/h1;->l:Z

    .line 495
    .line 496
    invoke-virtual {v3, v6}, Li0/h0;->g(Z)Z

    .line 497
    .line 498
    .line 499
    move-result v12

    .line 500
    or-int/2addr v5, v12

    .line 501
    invoke-virtual {v3, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    or-int/2addr v5, v12

    .line 506
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    if-nez v5, :cond_11

    .line 511
    .line 512
    sget-object v5, Li0/l;->a:Li0/e;

    .line 513
    .line 514
    if-ne v12, v5, :cond_12

    .line 515
    .line 516
    :cond_11
    new-instance v5, Lhb/x;

    .line 517
    .line 518
    const/4 v12, 0x4

    .line 519
    invoke-direct/range {v5 .. v12}, Lhb/x;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v3, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    move-object v12, v5

    .line 526
    :cond_12
    move-object v11, v12

    .line 527
    check-cast v11, Lfg/l;

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const/16 v14, 0x1f8

    .line 531
    .line 532
    const/4 v6, 0x0

    .line 533
    const/4 v7, 0x0

    .line 534
    const/4 v8, 0x0

    .line 535
    const/4 v9, 0x0

    .line 536
    const/4 v10, 0x0

    .line 537
    move-object v5, v2

    .line 538
    move-object v12, v3

    .line 539
    move-object v3, v1

    .line 540
    invoke-static/range {v3 .. v14}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 541
    .line 542
    .line 543
    goto :goto_c

    .line 544
    :cond_13
    move-object v12, v3

    .line 545
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 546
    .line 547
    .line 548
    :goto_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 549
    .line 550
    return-object v1

    .line 551
    :pswitch_2
    iget-object v1, v0, Lwb/h1;->h:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v1, Lsh/x;

    .line 554
    .line 555
    iget-object v2, v0, Lwb/h1;->i:Ljava/lang/Object;

    .line 556
    .line 557
    move-object v4, v2

    .line 558
    check-cast v4, Lr/z;

    .line 559
    .line 560
    iget-object v2, v0, Lwb/h1;->n:Ljava/lang/Object;

    .line 561
    .line 562
    move-object v9, v2

    .line 563
    check-cast v9, Ljava/util/List;

    .line 564
    .line 565
    iget-object v2, v0, Lwb/h1;->o:Ljava/lang/Object;

    .line 566
    .line 567
    move-object v10, v2

    .line 568
    check-cast v10, Ljava/util/ArrayList;

    .line 569
    .line 570
    iget-object v2, v0, Lwb/h1;->m:Ljava/lang/Object;

    .line 571
    .line 572
    move-object v11, v2

    .line 573
    check-cast v11, Lfg/l;

    .line 574
    .line 575
    iget-object v2, v0, Lwb/h1;->j:Ljava/lang/Object;

    .line 576
    .line 577
    move-object v8, v2

    .line 578
    check-cast v8, Li0/a1;

    .line 579
    .line 580
    move-object/from16 v2, p1

    .line 581
    .line 582
    check-cast v2, Lp/x0;

    .line 583
    .line 584
    move-object/from16 v12, p2

    .line 585
    .line 586
    check-cast v12, Li0/h0;

    .line 587
    .line 588
    move-object/from16 v3, p3

    .line 589
    .line 590
    check-cast v3, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    and-int/lit8 v5, v3, 0x6

    .line 600
    .line 601
    if-nez v5, :cond_15

    .line 602
    .line 603
    invoke-virtual {v12, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    if-eqz v5, :cond_14

    .line 608
    .line 609
    const/4 v5, 0x4

    .line 610
    goto :goto_d

    .line 611
    :cond_14
    const/4 v5, 0x2

    .line 612
    :goto_d
    or-int/2addr v3, v5

    .line 613
    :cond_15
    and-int/lit8 v5, v3, 0x13

    .line 614
    .line 615
    const/16 v6, 0x12

    .line 616
    .line 617
    const/4 v7, 0x1

    .line 618
    if-eq v5, v6, :cond_16

    .line 619
    .line 620
    move v5, v7

    .line 621
    goto :goto_e

    .line 622
    :cond_16
    const/4 v5, 0x0

    .line 623
    :goto_e
    and-int/2addr v3, v7

    .line 624
    invoke-virtual {v12, v3, v5}, Li0/h0;->S(IZ)Z

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    if-eqz v3, :cond_19

    .line 629
    .line 630
    sget-object v3, Lp/h1;->c:Lp/a0;

    .line 631
    .line 632
    iget-object v1, v1, Lsh/x;->e:Lm/a;

    .line 633
    .line 634
    const/4 v5, 0x0

    .line 635
    invoke-static {v3, v1, v5}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    invoke-interface {v2}, Lp/x0;->c()F

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    const/16 v5, 0x8

    .line 644
    .line 645
    int-to-float v5, v5

    .line 646
    add-float/2addr v1, v5

    .line 647
    invoke-interface {v2}, Lp/x0;->a()F

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    const/16 v5, 0x54

    .line 652
    .line 653
    int-to-float v5, v5

    .line 654
    add-float/2addr v2, v5

    .line 655
    const/4 v5, 0x5

    .line 656
    invoke-static {v1, v2, v5}, Lp/d;->b(FFI)Lp/z0;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    iget-boolean v6, v0, Lwb/h1;->l:Z

    .line 661
    .line 662
    invoke-virtual {v12, v6}, Li0/h0;->g(Z)Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    iget-object v7, v0, Lwb/h1;->k:Lfg/l;

    .line 667
    .line 668
    invoke-virtual {v12, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    or-int/2addr v2, v5

    .line 673
    invoke-virtual {v12, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    or-int/2addr v2, v5

    .line 678
    invoke-virtual {v12, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v5

    .line 682
    or-int/2addr v2, v5

    .line 683
    invoke-virtual {v12, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    or-int/2addr v2, v5

    .line 688
    invoke-virtual {v12}, Li0/h0;->P()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    if-nez v2, :cond_17

    .line 693
    .line 694
    sget-object v2, Li0/l;->a:Li0/e;

    .line 695
    .line 696
    if-ne v5, v2, :cond_18

    .line 697
    .line 698
    :cond_17
    new-instance v5, Lhb/x;

    .line 699
    .line 700
    invoke-direct/range {v5 .. v11}, Lhb/x;-><init>(ZLfg/l;Li0/a1;Ljava/util/List;Ljava/util/ArrayList;Lfg/l;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    :cond_18
    move-object v11, v5

    .line 707
    check-cast v11, Lfg/l;

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const/16 v14, 0x1f8

    .line 711
    .line 712
    const/4 v6, 0x0

    .line 713
    const/4 v7, 0x0

    .line 714
    const/4 v8, 0x0

    .line 715
    const/4 v9, 0x0

    .line 716
    const/4 v10, 0x0

    .line 717
    move-object v5, v1

    .line 718
    invoke-static/range {v3 .. v14}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 719
    .line 720
    .line 721
    goto :goto_f

    .line 722
    :cond_19
    invoke-virtual {v12}, Li0/h0;->V()V

    .line 723
    .line 724
    .line 725
    :goto_f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 726
    .line 727
    return-object v1

    .line 728
    nop

    .line 729
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
