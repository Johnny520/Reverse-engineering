.class public final synthetic Lwb/h7;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Z

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/h7;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p14, p0, Lwb/h7;->k:Z

    .line 8
    .line 9
    iput-object p1, p0, Lwb/h7;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lwb/h7;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p11, p0, Lwb/h7;->r:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p12, p0, Lwb/h7;->s:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, Lwb/h7;->h:Li0/a1;

    .line 18
    .line 19
    iput-object p4, p0, Lwb/h7;->i:Li0/a1;

    .line 20
    .line 21
    iput-object p5, p0, Lwb/h7;->j:Li0/a1;

    .line 22
    .line 23
    iput-object p13, p0, Lwb/h7;->t:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p6, p0, Lwb/h7;->l:Li0/a1;

    .line 26
    .line 27
    iput-object p7, p0, Lwb/h7;->m:Li0/a1;

    .line 28
    .line 29
    iput-object p8, p0, Lwb/h7;->n:Li0/a1;

    .line 30
    .line 31
    iput-object p9, p0, Lwb/h7;->o:Li0/a1;

    .line 32
    .line 33
    iput-object p10, p0, Lwb/h7;->u:Ljava/lang/Object;

    .line 34
    .line 35
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;Lsh/x;Lr/z;Lwb/v0;Li0/a1;Li0/a1;Ljava/util/List;Li0/a1;ZLjava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 36
    const/4 v0, 0x1

    iput v0, p0, Lwb/h7;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/h7;->p:Ljava/lang/Object;

    iput-object p2, p0, Lwb/h7;->q:Ljava/lang/Object;

    iput-object p3, p0, Lwb/h7;->r:Ljava/lang/Object;

    iput-object p4, p0, Lwb/h7;->s:Ljava/lang/Object;

    iput-object p5, p0, Lwb/h7;->h:Li0/a1;

    iput-object p6, p0, Lwb/h7;->i:Li0/a1;

    iput-object p7, p0, Lwb/h7;->t:Ljava/lang/Object;

    iput-object p8, p0, Lwb/h7;->j:Li0/a1;

    iput-boolean p9, p0, Lwb/h7;->k:Z

    iput-object p10, p0, Lwb/h7;->u:Ljava/lang/Object;

    iput-object p11, p0, Lwb/h7;->l:Li0/a1;

    iput-object p12, p0, Lwb/h7;->m:Li0/a1;

    iput-object p13, p0, Lwb/h7;->n:Li0/a1;

    iput-object p14, p0, Lwb/h7;->o:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/h7;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/h7;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/Set;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/h7;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lsh/x;

    .line 15
    .line 16
    iget-object v3, v0, Lwb/h7;->r:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v3

    .line 19
    check-cast v5, Lr/z;

    .line 20
    .line 21
    iget-object v3, v0, Lwb/h7;->s:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v7, v3

    .line 24
    check-cast v7, Lwb/v0;

    .line 25
    .line 26
    iget-object v3, v0, Lwb/h7;->t:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v13, v3

    .line 29
    check-cast v13, Ljava/util/List;

    .line 30
    .line 31
    iget-object v3, v0, Lwb/h7;->u:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v9, v3

    .line 34
    check-cast v9, Ljava/util/List;

    .line 35
    .line 36
    move-object/from16 v3, p1

    .line 37
    .line 38
    check-cast v3, Lp/x0;

    .line 39
    .line 40
    move-object/from16 v4, p2

    .line 41
    .line 42
    check-cast v4, Li0/h0;

    .line 43
    .line 44
    move-object/from16 v6, p3

    .line 45
    .line 46
    check-cast v6, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    and-int/lit8 v8, v6, 0x6

    .line 56
    .line 57
    if-nez v8, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_0

    .line 64
    .line 65
    const/4 v8, 0x4

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v8, 0x2

    .line 68
    :goto_0
    or-int/2addr v6, v8

    .line 69
    :cond_1
    and-int/lit8 v8, v6, 0x13

    .line 70
    .line 71
    const/16 v12, 0x12

    .line 72
    .line 73
    const/4 v15, 0x1

    .line 74
    if-eq v8, v12, :cond_2

    .line 75
    .line 76
    move v8, v15

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 v8, 0x0

    .line 79
    :goto_1
    and-int/2addr v6, v15

    .line 80
    invoke-virtual {v4, v6, v8}, Li0/h0;->S(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_12

    .line 85
    .line 86
    iget-object v12, v0, Lwb/h7;->i:Li0/a1;

    .line 87
    .line 88
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    check-cast v6, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 103
    .line 104
    invoke-static {v8, v6, v8}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-object v8, v0, Lwb/h7;->o:Li0/a1;

    .line 109
    .line 110
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    check-cast v8, Ljava/util/List;

    .line 115
    .line 116
    new-instance v14, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v16

    .line 129
    iget-object v10, v0, Lwb/h7;->h:Li0/a1;

    .line 130
    .line 131
    iget-object v11, v0, Lwb/h7;->j:Li0/a1;

    .line 132
    .line 133
    if-eqz v16, :cond_a

    .line 134
    .line 135
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    move-object/from16 v17, v3

    .line 140
    .line 141
    move-object v3, v15

    .line 142
    check-cast v3, Lwb/s0;

    .line 143
    .line 144
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    check-cast v10, Lwb/t0;

    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_8

    .line 155
    .line 156
    move-object/from16 v19, v5

    .line 157
    .line 158
    const/4 v5, 0x1

    .line 159
    if-eq v10, v5, :cond_7

    .line 160
    .line 161
    const/4 v5, 0x2

    .line 162
    if-eq v10, v5, :cond_6

    .line 163
    .line 164
    const/4 v5, 0x3

    .line 165
    if-eq v10, v5, :cond_4

    .line 166
    .line 167
    const/4 v5, 0x4

    .line 168
    if-ne v10, v5, :cond_3

    .line 169
    .line 170
    :goto_3
    const/4 v3, 0x1

    .line 171
    goto :goto_4

    .line 172
    :cond_3
    invoke-static {}, Lokio/a;->k()V

    .line 173
    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    goto/16 :goto_8

    .line 177
    .line 178
    :cond_4
    const/4 v5, 0x4

    .line 179
    iget-boolean v10, v7, Lwb/v0;->f:Z

    .line 180
    .line 181
    if-eqz v10, :cond_5

    .line 182
    .line 183
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-nez v10, :cond_5

    .line 194
    .line 195
    iget-boolean v10, v3, Lwb/s0;->c:Z

    .line 196
    .line 197
    if-nez v10, :cond_5

    .line 198
    .line 199
    iget-boolean v10, v3, Lwb/s0;->g:Z

    .line 200
    .line 201
    if-nez v10, :cond_5

    .line 202
    .line 203
    iget-object v3, v3, Lwb/s0;->f:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    check-cast v10, Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v3, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_5

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_5
    const/4 v3, 0x0

    .line 219
    goto :goto_4

    .line 220
    :cond_6
    const/4 v5, 0x4

    .line 221
    iget-boolean v3, v3, Lwb/s0;->g:Z

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    const/4 v5, 0x4

    .line 225
    iget-boolean v3, v3, Lwb/s0;->c:Z

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_8
    move-object/from16 v19, v5

    .line 229
    .line 230
    const/4 v5, 0x4

    .line 231
    iget-boolean v10, v3, Lwb/s0;->c:Z

    .line 232
    .line 233
    if-nez v10, :cond_5

    .line 234
    .line 235
    iget-boolean v3, v3, Lwb/s0;->g:Z

    .line 236
    .line 237
    if-nez v3, :cond_5

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :goto_4
    if-eqz v3, :cond_9

    .line 241
    .line 242
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    :cond_9
    move-object/from16 v3, v17

    .line 246
    .line 247
    move-object/from16 v5, v19

    .line 248
    .line 249
    const/4 v15, 0x1

    .line 250
    goto :goto_2

    .line 251
    :cond_a
    move-object/from16 v17, v3

    .line 252
    .line 253
    move-object/from16 v19, v5

    .line 254
    .line 255
    new-instance v3, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    :cond_b
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    if-eqz v8, :cond_c

    .line 269
    .line 270
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    move-object v14, v8

    .line 275
    check-cast v14, Lwb/s0;

    .line 276
    .line 277
    invoke-static {v14, v6}, Lwb/ho;->i6(Lwb/s0;Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v14

    .line 281
    if-eqz v14, :cond_b

    .line 282
    .line 283
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_c
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    sget-object v8, Li0/l;->a:Li0/e;

    .line 296
    .line 297
    if-nez v5, :cond_d

    .line 298
    .line 299
    if-ne v6, v8, :cond_e

    .line 300
    .line 301
    :cond_d
    new-instance v6, Lia/p;

    .line 302
    .line 303
    const/4 v5, 0x3

    .line 304
    invoke-direct {v6, v1, v5}, Lia/p;-><init>(Ljava/util/Set;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_e
    check-cast v6, Lfg/l;

    .line 311
    .line 312
    invoke-static {v6, v3}, Lwb/ho;->f7(Lfg/l;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    new-instance v3, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-eqz v6, :cond_f

    .line 334
    .line 335
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    check-cast v6, Lwb/s0;

    .line 340
    .line 341
    iget-object v6, v6, Lwb/s0;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_f
    invoke-static {v3}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    sget-object v5, Lp/h1;->c:Lp/a0;

    .line 352
    .line 353
    iget-object v2, v2, Lsh/x;->e:Lm/a;

    .line 354
    .line 355
    const/4 v6, 0x0

    .line 356
    invoke-static {v5, v2, v6}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface/range {v17 .. v17}, Lp/x0;->c()F

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    const/16 v6, 0x8

    .line 365
    .line 366
    int-to-float v6, v6

    .line 367
    add-float/2addr v5, v6

    .line 368
    invoke-interface/range {v17 .. v17}, Lp/x0;->a()F

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    const/16 v14, 0x54

    .line 373
    .line 374
    int-to-float v14, v14

    .line 375
    add-float/2addr v6, v14

    .line 376
    const/4 v14, 0x5

    .line 377
    invoke-static {v5, v6, v14}, Lp/d;->b(FFI)Lp/z0;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    invoke-virtual {v4, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    invoke-virtual {v4, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v14

    .line 389
    or-int/2addr v6, v14

    .line 390
    invoke-virtual {v4, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v14

    .line 394
    or-int/2addr v6, v14

    .line 395
    invoke-virtual {v4, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    or-int/2addr v6, v14

    .line 400
    invoke-virtual {v4, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v14

    .line 404
    or-int/2addr v6, v14

    .line 405
    iget-boolean v14, v0, Lwb/h7;->k:Z

    .line 406
    .line 407
    invoke-virtual {v4, v14}, Li0/h0;->g(Z)Z

    .line 408
    .line 409
    .line 410
    move-result v15

    .line 411
    or-int/2addr v6, v15

    .line 412
    invoke-virtual {v4, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    or-int/2addr v6, v15

    .line 417
    iget-object v15, v0, Lwb/h7;->l:Li0/a1;

    .line 418
    .line 419
    invoke-virtual {v4, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v16

    .line 423
    or-int v6, v6, v16

    .line 424
    .line 425
    invoke-virtual {v4, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v16

    .line 429
    or-int v6, v6, v16

    .line 430
    .line 431
    move-object/from16 p1, v2

    .line 432
    .line 433
    iget-object v2, v0, Lwb/h7;->m:Li0/a1;

    .line 434
    .line 435
    invoke-virtual {v4, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v16

    .line 439
    or-int v6, v6, v16

    .line 440
    .line 441
    move-object/from16 v17, v2

    .line 442
    .line 443
    iget-object v2, v0, Lwb/h7;->n:Li0/a1;

    .line 444
    .line 445
    invoke-virtual {v4, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v16

    .line 449
    or-int v6, v6, v16

    .line 450
    .line 451
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v16

    .line 455
    or-int v6, v6, v16

    .line 456
    .line 457
    move-object/from16 p2, v1

    .line 458
    .line 459
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    if-nez v6, :cond_10

    .line 464
    .line 465
    if-ne v1, v8, :cond_11

    .line 466
    .line 467
    :cond_10
    new-instance v6, Lsh/w0;

    .line 468
    .line 469
    move-object/from16 v18, v2

    .line 470
    .line 471
    move-object/from16 v16, v3

    .line 472
    .line 473
    move v8, v14

    .line 474
    move-object v14, v11

    .line 475
    move-object v11, v10

    .line 476
    move-object/from16 v10, p2

    .line 477
    .line 478
    invoke-direct/range {v6 .. v18}, Lsh/w0;-><init>(Lwb/v0;ZLjava/util/List;Ljava/util/ArrayList;Li0/a1;Li0/a1;Ljava/util/List;Li0/a1;Li0/a1;Ljava/util/Set;Li0/a1;Li0/a1;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v4, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    move-object v1, v6

    .line 485
    :cond_11
    move-object v12, v1

    .line 486
    check-cast v12, Lfg/l;

    .line 487
    .line 488
    const/4 v14, 0x0

    .line 489
    const/16 v15, 0x1f8

    .line 490
    .line 491
    const/4 v7, 0x0

    .line 492
    const/4 v8, 0x0

    .line 493
    const/4 v9, 0x0

    .line 494
    const/4 v10, 0x0

    .line 495
    const/4 v11, 0x0

    .line 496
    move-object v13, v4

    .line 497
    move-object v6, v5

    .line 498
    move-object/from16 v5, v19

    .line 499
    .line 500
    move-object/from16 v4, p1

    .line 501
    .line 502
    invoke-static/range {v4 .. v15}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_12
    move-object v13, v4

    .line 507
    invoke-virtual {v13}, Li0/h0;->V()V

    .line 508
    .line 509
    .line 510
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 511
    .line 512
    :goto_8
    return-object v1

    .line 513
    :pswitch_0
    iget-object v1, v0, Lwb/h7;->p:Ljava/lang/Object;

    .line 514
    .line 515
    move-object v3, v1

    .line 516
    check-cast v3, Landroid/content/Context;

    .line 517
    .line 518
    iget-object v1, v0, Lwb/h7;->q:Ljava/lang/Object;

    .line 519
    .line 520
    move-object v4, v1

    .line 521
    check-cast v4, Landroid/content/SharedPreferences;

    .line 522
    .line 523
    iget-object v1, v0, Lwb/h7;->r:Ljava/lang/Object;

    .line 524
    .line 525
    move-object v13, v1

    .line 526
    check-cast v13, Ljava/lang/String;

    .line 527
    .line 528
    iget-object v1, v0, Lwb/h7;->s:Ljava/lang/Object;

    .line 529
    .line 530
    move-object v14, v1

    .line 531
    check-cast v14, Ljava/lang/String;

    .line 532
    .line 533
    iget-object v1, v0, Lwb/h7;->t:Ljava/lang/Object;

    .line 534
    .line 535
    move-object v15, v1

    .line 536
    check-cast v15, Ljava/lang/String;

    .line 537
    .line 538
    iget-object v1, v0, Lwb/h7;->u:Ljava/lang/Object;

    .line 539
    .line 540
    move-object v12, v1

    .line 541
    check-cast v12, Li0/a1;

    .line 542
    .line 543
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, Lr/d;

    .line 546
    .line 547
    move-object/from16 v2, p2

    .line 548
    .line 549
    check-cast v2, Li0/h0;

    .line 550
    .line 551
    move-object/from16 v5, p3

    .line 552
    .line 553
    check-cast v5, Ljava/lang/Integer;

    .line 554
    .line 555
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    and-int/lit8 v1, v5, 0x11

    .line 563
    .line 564
    const/16 v6, 0x10

    .line 565
    .line 566
    const/4 v7, 0x1

    .line 567
    if-eq v1, v6, :cond_13

    .line 568
    .line 569
    move v1, v7

    .line 570
    goto :goto_9

    .line 571
    :cond_13
    const/4 v1, 0x0

    .line 572
    :goto_9
    and-int/2addr v5, v7

    .line 573
    invoke-virtual {v2, v5, v1}, Li0/h0;->S(IZ)Z

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    if-eqz v1, :cond_14

    .line 578
    .line 579
    move-object v1, v2

    .line 580
    new-instance v2, Lwb/l6;

    .line 581
    .line 582
    iget-object v5, v0, Lwb/h7;->h:Li0/a1;

    .line 583
    .line 584
    iget-object v6, v0, Lwb/h7;->i:Li0/a1;

    .line 585
    .line 586
    move v8, v7

    .line 587
    iget-object v7, v0, Lwb/h7;->j:Li0/a1;

    .line 588
    .line 589
    move v9, v8

    .line 590
    iget-object v8, v0, Lwb/h7;->l:Li0/a1;

    .line 591
    .line 592
    move v10, v9

    .line 593
    iget-object v9, v0, Lwb/h7;->m:Li0/a1;

    .line 594
    .line 595
    move v11, v10

    .line 596
    iget-object v10, v0, Lwb/h7;->n:Li0/a1;

    .line 597
    .line 598
    move/from16 v16, v11

    .line 599
    .line 600
    iget-object v11, v0, Lwb/h7;->o:Li0/a1;

    .line 601
    .line 602
    move-object/from16 p1, v1

    .line 603
    .line 604
    iget-boolean v1, v0, Lwb/h7;->k:Z

    .line 605
    .line 606
    move/from16 v0, v16

    .line 607
    .line 608
    move/from16 v16, v1

    .line 609
    .line 610
    move-object/from16 v1, p1

    .line 611
    .line 612
    invoke-direct/range {v2 .. v16}, Lwb/l6;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 613
    .line 614
    .line 615
    const v3, -0xd1752c0

    .line 616
    .line 617
    .line 618
    invoke-static {v3, v2, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const/16 v3, 0x30

    .line 623
    .line 624
    const/4 v4, 0x0

    .line 625
    invoke-static {v4, v2, v1, v3, v0}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 626
    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_14
    move-object v1, v2

    .line 630
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 631
    .line 632
    .line 633
    :goto_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 634
    .line 635
    return-object v0

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
