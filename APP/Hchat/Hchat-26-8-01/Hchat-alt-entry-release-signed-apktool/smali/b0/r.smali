.class public final synthetic Lb0/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    iput v0, p0, Lb0/r;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lb0/r;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lb0/r;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput p3, p0, Lb0/r;->h:I

    .line 13
    .line 14
    iput-object p4, p0, Lb0/r;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    .line 17
    iput p6, p0, Lb0/r;->g:I

    iput-object p1, p0, Lb0/r;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb0/r;->j:Ljava/lang/Object;

    iput p3, p0, Lb0/r;->h:I

    iput-object p4, p0, Lb0/r;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 18
    iput p5, p0, Lb0/r;->g:I

    iput-object p1, p0, Lb0/r;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb0/r;->j:Ljava/lang/Object;

    iput-object p3, p0, Lb0/r;->k:Ljava/lang/Object;

    iput p4, p0, Lb0/r;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;ILsh/t;Lfg/l;)V
    .locals 1

    .line 19
    const/16 v0, 0x11

    iput v0, p0, Lb0/r;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/r;->i:Ljava/lang/Object;

    iput p2, p0, Lb0/r;->h:I

    iput-object p3, p0, Lb0/r;->j:Ljava/lang/Object;

    iput-object p4, p0, Lb0/r;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;Ll/d;Lfg/l;II)V
    .locals 0

    .line 20
    const/4 p4, 0x4

    iput p4, p0, Lb0/r;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/r;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb0/r;->j:Ljava/lang/Object;

    iput-object p3, p0, Lb0/r;->k:Ljava/lang/Object;

    iput p5, p0, Lb0/r;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lb0/r;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v7, v2

    .line 15
    check-cast v7, Lsh/t;

    .line 16
    .line 17
    iget-object v2, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v8, v2

    .line 20
    check-cast v8, Lfg/l;

    .line 21
    .line 22
    move-object/from16 v9, p1

    .line 23
    .line 24
    check-cast v9, Li0/h0;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    and-int/lit8 v3, v2, 0x3

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x1

    .line 39
    if-eq v3, v4, :cond_0

    .line 40
    .line 41
    move v3, v12

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v11

    .line 44
    :goto_0
    and-int/2addr v2, v12

    .line 45
    invoke-virtual {v9, v2, v3}, Li0/h0;->S(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move v6, v11

    .line 56
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    add-int/lit8 v13, v6, 0x1

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    if-ltz v6, :cond_2

    .line 70
    .line 71
    check-cast v3, Ljava/lang/String;

    .line 72
    .line 73
    const v5, -0x72a8ab12

    .line 74
    .line 75
    .line 76
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-virtual {v9, v5, v10, v4, v11}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    iget v5, v0, Lb0/r;->h:I

    .line 88
    .line 89
    if-ne v5, v6, :cond_1

    .line 90
    .line 91
    move v5, v12

    .line 92
    goto :goto_2

    .line 93
    :cond_1
    move v5, v11

    .line 94
    :goto_2
    const/high16 v10, 0x30000

    .line 95
    .line 96
    invoke-static/range {v3 .. v10}, Lsh/s;->f(Ljava/lang/String;IZILsh/t;Lfg/l;Li0/h0;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v11}, Li0/h0;->p(Z)V

    .line 100
    .line 101
    .line 102
    move v6, v13

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-static {}, La/a;->Q0()V

    .line 105
    .line 106
    .line 107
    throw v4

    .line 108
    :cond_3
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 109
    .line 110
    .line 111
    :cond_4
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_0
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Lwb/y2;

    .line 117
    .line 118
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lfb/c;

    .line 121
    .line 122
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lfg/a;

    .line 125
    .line 126
    move-object/from16 v4, p1

    .line 127
    .line 128
    check-cast v4, Li0/h0;

    .line 129
    .line 130
    move-object/from16 v5, p2

    .line 131
    .line 132
    check-cast v5, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget v5, v0, Lb0/r;->h:I

    .line 138
    .line 139
    or-int/lit8 v5, v5, 0x1

    .line 140
    .line 141
    invoke-static {v5}, Li0/r;->C(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v1, v2, v3, v4, v5}, Lwb/y2;->c0(Lfb/c;Lfg/a;Li0/h0;I)V

    .line 146
    .line 147
    .line 148
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_1
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Lfb/r0;

    .line 154
    .line 155
    iget-object v4, v1, Lfb/r0;->b:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v10, v2

    .line 160
    check-cast v10, Lfg/l;

    .line 161
    .line 162
    iget-object v2, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v11, v2

    .line 165
    check-cast v11, Ljava/util/List;

    .line 166
    .line 167
    move-object/from16 v7, p1

    .line 168
    .line 169
    check-cast v7, Li0/h0;

    .line 170
    .line 171
    move-object/from16 v2, p2

    .line 172
    .line 173
    check-cast v2, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    and-int/lit8 v3, v2, 0x3

    .line 180
    .line 181
    const/4 v5, 0x2

    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x1

    .line 184
    if-eq v3, v5, :cond_5

    .line 185
    .line 186
    move v3, v13

    .line 187
    goto :goto_4

    .line 188
    :cond_5
    move v3, v12

    .line 189
    :goto_4
    and-int/2addr v2, v13

    .line 190
    invoke-virtual {v7, v2, v3}, Li0/h0;->S(IZ)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_13

    .line 195
    .line 196
    iget-boolean v14, v1, Lfb/r0;->c:Z

    .line 197
    .line 198
    invoke-virtual {v7, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    or-int/2addr v2, v3

    .line 207
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    or-int/2addr v2, v3

    .line 212
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    sget-object v15, Li0/l;->a:Li0/e;

    .line 217
    .line 218
    if-nez v2, :cond_6

    .line 219
    .line 220
    if-ne v3, v15, :cond_7

    .line 221
    .line 222
    :cond_6
    new-instance v3, Lwb/gs;

    .line 223
    .line 224
    const/4 v2, 0x0

    .line 225
    invoke-direct {v3, v2, v1, v10, v11}, Lwb/gs;-><init>(ILfb/r0;Lfg/l;Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_7
    move-object v6, v3

    .line 232
    check-cast v6, Lfg/l;

    .line 233
    .line 234
    const/16 v8, 0x36

    .line 235
    .line 236
    const/16 v9, 0x8

    .line 237
    .line 238
    const-string v2, "\u540d\u79f0"

    .line 239
    .line 240
    const-string v3, "\u7528\u4e8e\u533a\u5206\u5de5\u5177\u6765\u6e90"

    .line 241
    .line 242
    const/4 v5, 0x0

    .line 243
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 244
    .line 245
    .line 246
    const/4 v2, 0x0

    .line 247
    invoke-static {v2, v7, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 248
    .line 249
    .line 250
    move v3, v12

    .line 251
    iget-boolean v12, v1, Lfb/r0;->c:Z

    .line 252
    .line 253
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_8

    .line 258
    .line 259
    iget v4, v0, Lb0/r;->h:I

    .line 260
    .line 261
    add-int/2addr v4, v13

    .line 262
    const-string v5, "MCP "

    .line 263
    .line 264
    invoke-static {v4, v5}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    :cond_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v6, "\u542f\u7528 "

    .line 271
    .line 272
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    if-eqz v14, :cond_9

    .line 283
    .line 284
    const-string v5, "\u6b64\u670d\u52a1\u5668\u7684\u5de5\u5177\u53ef\u4f9b Agent \u8c03\u7528"

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_9
    const-string v5, "\u6b64\u670d\u52a1\u5668\u4e0d\u4f1a\u8fde\u63a5\u6216\u63d0\u4f9b\u5de5\u5177"

    .line 288
    .line 289
    :goto_5
    invoke-virtual {v7, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    or-int/2addr v6, v8

    .line 298
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    or-int/2addr v6, v8

    .line 303
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    if-nez v6, :cond_a

    .line 308
    .line 309
    if-ne v8, v15, :cond_b

    .line 310
    .line 311
    :cond_a
    new-instance v8, Lwb/gs;

    .line 312
    .line 313
    const/4 v6, 0x1

    .line 314
    invoke-direct {v8, v6, v1, v10, v11}, Lwb/gs;-><init>(ILfb/r0;Lfg/l;Ljava/util/List;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_b
    move-object/from16 v16, v8

    .line 321
    .line 322
    check-cast v16, Lfg/l;

    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    const/16 v19, 0x8

    .line 327
    .line 328
    move-object v6, v15

    .line 329
    const/4 v15, 0x0

    .line 330
    move-object/from16 v17, v4

    .line 331
    .line 332
    move v4, v3

    .line 333
    move v3, v14

    .line 334
    move-object v14, v5

    .line 335
    move v5, v13

    .line 336
    move-object/from16 v13, v17

    .line 337
    .line 338
    move-object/from16 v17, v7

    .line 339
    .line 340
    invoke-static/range {v12 .. v19}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 341
    .line 342
    .line 343
    if-eqz v3, :cond_10

    .line 344
    .line 345
    const v3, -0x4fe56ee2

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7, v3}, Li0/h0;->a0(I)V

    .line 349
    .line 350
    .line 351
    invoke-static {v2, v7, v4, v5}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 352
    .line 353
    .line 354
    iget-object v14, v1, Lfb/r0;->d:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v7, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    or-int/2addr v3, v8

    .line 365
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    or-int/2addr v3, v8

    .line 370
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    if-nez v3, :cond_c

    .line 375
    .line 376
    if-ne v8, v6, :cond_d

    .line 377
    .line 378
    :cond_c
    new-instance v8, Lwb/gs;

    .line 379
    .line 380
    const/4 v3, 0x2

    .line 381
    invoke-direct {v8, v3, v1, v10, v11}, Lwb/gs;-><init>(ILfb/r0;Lfg/l;Ljava/util/List;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_d
    move-object/from16 v16, v8

    .line 388
    .line 389
    check-cast v16, Lfg/l;

    .line 390
    .line 391
    const/16 v18, 0x36

    .line 392
    .line 393
    const/16 v19, 0x8

    .line 394
    .line 395
    const-string v12, "MCP Endpoint"

    .line 396
    .line 397
    const-string v13, "\u4f8b\u5982 https://example.com/mcp"

    .line 398
    .line 399
    const/4 v15, 0x0

    .line 400
    move-object/from16 v17, v7

    .line 401
    .line 402
    invoke-static/range {v12 .. v19}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 403
    .line 404
    .line 405
    invoke-static {v2, v7, v4, v5}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 406
    .line 407
    .line 408
    iget-object v14, v1, Lfb/r0;->e:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v7, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    or-int/2addr v3, v8

    .line 419
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    or-int/2addr v3, v8

    .line 424
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    if-nez v3, :cond_e

    .line 429
    .line 430
    if-ne v8, v6, :cond_f

    .line 431
    .line 432
    :cond_e
    new-instance v8, Lwb/gs;

    .line 433
    .line 434
    const/4 v3, 0x3

    .line 435
    invoke-direct {v8, v3, v1, v10, v11}, Lwb/gs;-><init>(ILfb/r0;Lfg/l;Ljava/util/List;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v7, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_f
    move-object/from16 v16, v8

    .line 442
    .line 443
    check-cast v16, Lfg/l;

    .line 444
    .line 445
    const/16 v18, 0x36

    .line 446
    .line 447
    const/16 v19, 0x8

    .line 448
    .line 449
    const-string v12, "Authorization"

    .line 450
    .line 451
    const-string v13, "\u53ef\u9009\uff0c\u4f8b\u5982 Bearer token"

    .line 452
    .line 453
    const/4 v15, 0x0

    .line 454
    move-object/from16 v17, v7

    .line 455
    .line 456
    invoke-static/range {v12 .. v19}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7, v4}, Li0/h0;->p(Z)V

    .line 460
    .line 461
    .line 462
    goto :goto_6

    .line 463
    :cond_10
    const v3, -0x4fd2ed74

    .line 464
    .line 465
    .line 466
    invoke-virtual {v7, v3}, Li0/h0;->a0(I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v7, v4}, Li0/h0;->p(Z)V

    .line 470
    .line 471
    .line 472
    :goto_6
    invoke-static {v2, v7, v4, v5}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v7, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    or-int/2addr v2, v3

    .line 484
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    or-int/2addr v2, v3

    .line 489
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    if-nez v2, :cond_11

    .line 494
    .line 495
    if-ne v3, v6, :cond_12

    .line 496
    .line 497
    :cond_11
    new-instance v3, Lwb/zh;

    .line 498
    .line 499
    const/16 v2, 0xa

    .line 500
    .line 501
    invoke-direct {v3, v10, v11, v1, v2}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    :cond_12
    check-cast v3, Lfg/a;

    .line 508
    .line 509
    const/16 v1, 0x36

    .line 510
    .line 511
    const-string v2, "\u5220\u9664 MCP"

    .line 512
    .line 513
    const-string v4, "\u79fb\u9664\u6b64\u670d\u52a1\u5668\u914d\u7f6e"

    .line 514
    .line 515
    invoke-static {v2, v4, v3, v7, v1}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 516
    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_13
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 520
    .line 521
    .line 522
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 523
    .line 524
    return-object v1

    .line 525
    :pswitch_2
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 526
    .line 527
    move-object v3, v1

    .line 528
    check-cast v3, Landroid/widget/FrameLayout;

    .line 529
    .line 530
    iget-object v1, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 531
    .line 532
    move-object v4, v1

    .line 533
    check-cast v4, Landroid/widget/FrameLayout;

    .line 534
    .line 535
    iget-object v1, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 536
    .line 537
    move-object v6, v1

    .line 538
    check-cast v6, Lwb/er;

    .line 539
    .line 540
    move-object/from16 v7, p1

    .line 541
    .line 542
    check-cast v7, Li0/h0;

    .line 543
    .line 544
    move-object/from16 v1, p2

    .line 545
    .line 546
    check-cast v1, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    and-int/lit8 v2, v1, 0x3

    .line 553
    .line 554
    const/4 v5, 0x2

    .line 555
    const/4 v8, 0x1

    .line 556
    if-eq v2, v5, :cond_14

    .line 557
    .line 558
    move v2, v8

    .line 559
    goto :goto_8

    .line 560
    :cond_14
    const/4 v2, 0x0

    .line 561
    :goto_8
    and-int/2addr v1, v8

    .line 562
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_15

    .line 567
    .line 568
    sget-object v2, Lwb/fr;->a:Lwb/fr;

    .line 569
    .line 570
    const/16 v8, 0x6000

    .line 571
    .line 572
    iget v5, v0, Lb0/r;->h:I

    .line 573
    .line 574
    invoke-virtual/range {v2 .. v8}, Lwb/fr;->a(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;ILwb/er;Li0/h0;I)V

    .line 575
    .line 576
    .line 577
    goto :goto_9

    .line 578
    :cond_15
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 579
    .line 580
    .line 581
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 582
    .line 583
    return-object v1

    .line 584
    :pswitch_3
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v1, Ljava/util/List;

    .line 587
    .line 588
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v2, Ljava/lang/String;

    .line 591
    .line 592
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v3, Lfg/l;

    .line 595
    .line 596
    move-object/from16 v4, p1

    .line 597
    .line 598
    check-cast v4, Li0/h0;

    .line 599
    .line 600
    move-object/from16 v5, p2

    .line 601
    .line 602
    check-cast v5, Ljava/lang/Integer;

    .line 603
    .line 604
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    iget v5, v0, Lb0/r;->h:I

    .line 608
    .line 609
    or-int/lit8 v5, v5, 0x1

    .line 610
    .line 611
    invoke-static {v5}, Li0/r;->C(I)I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    invoke-static {v1, v2, v3, v4, v5}, Lwb/ho;->H0(Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_3

    .line 619
    .line 620
    :pswitch_4
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 621
    .line 622
    move-object v2, v1

    .line 623
    check-cast v2, Landroid/content/Context;

    .line 624
    .line 625
    iget-object v1, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 626
    .line 627
    move-object v3, v1

    .line 628
    check-cast v3, Lwb/s0;

    .line 629
    .line 630
    iget-object v1, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 631
    .line 632
    move-object v5, v1

    .line 633
    check-cast v5, Lfg/a;

    .line 634
    .line 635
    move-object/from16 v6, p1

    .line 636
    .line 637
    check-cast v6, Li0/h0;

    .line 638
    .line 639
    move-object/from16 v1, p2

    .line 640
    .line 641
    check-cast v1, Ljava/lang/Integer;

    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    const/4 v1, 0x1

    .line 647
    invoke-static {v1}, Li0/r;->C(I)I

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    iget v4, v0, Lb0/r;->h:I

    .line 652
    .line 653
    invoke-static/range {v2 .. v7}, Lwb/ho;->h0(Landroid/content/Context;Lwb/s0;ILfg/a;Li0/h0;I)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_3

    .line 657
    .line 658
    :pswitch_5
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v1, Landroid/content/Context;

    .line 661
    .line 662
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v2, Landroid/content/SharedPreferences;

    .line 665
    .line 666
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v3, Lfg/a;

    .line 669
    .line 670
    move-object/from16 v4, p1

    .line 671
    .line 672
    check-cast v4, Li0/h0;

    .line 673
    .line 674
    move-object/from16 v5, p2

    .line 675
    .line 676
    check-cast v5, Ljava/lang/Integer;

    .line 677
    .line 678
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    iget v5, v0, Lb0/r;->h:I

    .line 682
    .line 683
    or-int/lit8 v5, v5, 0x1

    .line 684
    .line 685
    invoke-static {v5}, Li0/r;->C(I)I

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    invoke-static {v1, v2, v3, v4, v5}, Lwb/ho;->h2(Landroid/content/Context;Landroid/content/SharedPreferences;Lfg/a;Li0/h0;I)V

    .line 690
    .line 691
    .line 692
    goto/16 :goto_3

    .line 693
    .line 694
    :pswitch_6
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v1, Lw/n1;

    .line 697
    .line 698
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v2, [Ljava/lang/Object;

    .line 701
    .line 702
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v3, Lfg/l;

    .line 705
    .line 706
    move-object/from16 v4, p1

    .line 707
    .line 708
    check-cast v4, Li0/h0;

    .line 709
    .line 710
    move-object/from16 v5, p2

    .line 711
    .line 712
    check-cast v5, Ljava/lang/Integer;

    .line 713
    .line 714
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    iget v5, v0, Lb0/r;->h:I

    .line 718
    .line 719
    or-int/lit8 v5, v5, 0x1

    .line 720
    .line 721
    invoke-static {v5}, Li0/r;->C(I)I

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    invoke-virtual {v1, v2, v3, v4, v5}, Lw/n1;->b([Ljava/lang/Object;Lfg/l;Li0/h0;I)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_3

    .line 729
    .line 730
    :pswitch_7
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v1, Lv0/d;

    .line 733
    .line 734
    iget-object v2, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v2, Ls0/d;

    .line 737
    .line 738
    move-object/from16 v3, p1

    .line 739
    .line 740
    check-cast v3, Li0/h0;

    .line 741
    .line 742
    move-object/from16 v4, p2

    .line 743
    .line 744
    check-cast v4, Ljava/lang/Integer;

    .line 745
    .line 746
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    iget v4, v0, Lb0/r;->h:I

    .line 750
    .line 751
    or-int/lit8 v4, v4, 0x1

    .line 752
    .line 753
    invoke-static {v4}, Li0/r;->C(I)I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    iget-object v5, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 758
    .line 759
    invoke-virtual {v1, v5, v2, v3, v4}, Lv0/d;->b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V

    .line 760
    .line 761
    .line 762
    goto/16 :goto_3

    .line 763
    .line 764
    :pswitch_8
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v1, Ls0/d;

    .line 767
    .line 768
    move-object/from16 v2, p1

    .line 769
    .line 770
    check-cast v2, Li0/h0;

    .line 771
    .line 772
    move-object/from16 v3, p2

    .line 773
    .line 774
    check-cast v3, Ljava/lang/Integer;

    .line 775
    .line 776
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    iget v3, v0, Lb0/r;->h:I

    .line 780
    .line 781
    invoke-static {v3}, Li0/r;->C(I)I

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    or-int/lit8 v3, v3, 0x1

    .line 786
    .line 787
    iget-object v4, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 788
    .line 789
    iget-object v5, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 790
    .line 791
    invoke-virtual {v1, v4, v5, v2, v3}, Ls0/d;->i(Ljava/lang/Object;Ljava/lang/Object;Li0/h0;I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    goto/16 :goto_3

    .line 795
    .line 796
    :pswitch_9
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v1, Ls/x0;

    .line 799
    .line 800
    iget-object v2, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v2, Ls0/d;

    .line 803
    .line 804
    move-object/from16 v3, p1

    .line 805
    .line 806
    check-cast v3, Li0/h0;

    .line 807
    .line 808
    move-object/from16 v4, p2

    .line 809
    .line 810
    check-cast v4, Ljava/lang/Integer;

    .line 811
    .line 812
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    iget v4, v0, Lb0/r;->h:I

    .line 816
    .line 817
    or-int/lit8 v4, v4, 0x1

    .line 818
    .line 819
    invoke-static {v4}, Li0/r;->C(I)I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    iget-object v5, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 824
    .line 825
    invoke-virtual {v1, v5, v2, v3, v4}, Ls/x0;->b(Ljava/lang/Object;Ls0/d;Li0/h0;I)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_3

    .line 829
    .line 830
    :pswitch_a
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 831
    .line 832
    move-object v2, v1

    .line 833
    check-cast v2, Lr/k;

    .line 834
    .line 835
    move-object/from16 v6, p1

    .line 836
    .line 837
    check-cast v6, Li0/h0;

    .line 838
    .line 839
    move-object/from16 v1, p2

    .line 840
    .line 841
    check-cast v1, Ljava/lang/Integer;

    .line 842
    .line 843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    const/4 v1, 0x1

    .line 847
    invoke-static {v1}, Li0/r;->C(I)I

    .line 848
    .line 849
    .line 850
    move-result v7

    .line 851
    iget-object v3, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 852
    .line 853
    iget v4, v0, Lb0/r;->h:I

    .line 854
    .line 855
    iget-object v5, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 856
    .line 857
    invoke-static/range {v2 .. v7}, Ls/o;->d(Lr/k;Ljava/lang/Object;ILjava/lang/Object;Li0/h0;I)V

    .line 858
    .line 859
    .line 860
    goto/16 :goto_3

    .line 861
    .line 862
    :pswitch_b
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v1, Ll/d;

    .line 865
    .line 866
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v2, Ly0/o;

    .line 869
    .line 870
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v3, Ls0/d;

    .line 873
    .line 874
    move-object/from16 v4, p1

    .line 875
    .line 876
    check-cast v4, Li0/h0;

    .line 877
    .line 878
    move-object/from16 v5, p2

    .line 879
    .line 880
    check-cast v5, Ljava/lang/Integer;

    .line 881
    .line 882
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget v5, v0, Lb0/r;->h:I

    .line 886
    .line 887
    or-int/lit8 v5, v5, 0x1

    .line 888
    .line 889
    invoke-static {v5}, Li0/r;->C(I)I

    .line 890
    .line 891
    .line 892
    move-result v5

    .line 893
    invoke-static {v1, v2, v3, v4, v5}, Ll/i;->a(Ll/d;Ly0/o;Ls0/d;Li0/h0;I)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_3

    .line 897
    .line 898
    :pswitch_c
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 899
    .line 900
    move-object v2, v1

    .line 901
    check-cast v2, Ly0/o;

    .line 902
    .line 903
    iget-object v1, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 904
    .line 905
    move-object v3, v1

    .line 906
    check-cast v3, Ll/d;

    .line 907
    .line 908
    iget-object v1, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 909
    .line 910
    move-object v4, v1

    .line 911
    check-cast v4, Lfg/l;

    .line 912
    .line 913
    move-object/from16 v5, p1

    .line 914
    .line 915
    check-cast v5, Li0/h0;

    .line 916
    .line 917
    move-object/from16 v1, p2

    .line 918
    .line 919
    check-cast v1, Ljava/lang/Integer;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    const/4 v1, 0x1

    .line 925
    invoke-static {v1}, Li0/r;->C(I)I

    .line 926
    .line 927
    .line 928
    move-result v6

    .line 929
    iget v7, v0, Lb0/r;->h:I

    .line 930
    .line 931
    invoke-static/range {v2 .. v7}, Ll/i;->b(Ly0/o;Ll/d;Lfg/l;Li0/h0;II)V

    .line 932
    .line 933
    .line 934
    goto/16 :goto_3

    .line 935
    .line 936
    :pswitch_d
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v1, Lh0/l;

    .line 939
    .line 940
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v2, Ly0/c;

    .line 943
    .line 944
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v3, Ls0/d;

    .line 947
    .line 948
    move-object/from16 v4, p1

    .line 949
    .line 950
    check-cast v4, Li0/h0;

    .line 951
    .line 952
    move-object/from16 v5, p2

    .line 953
    .line 954
    check-cast v5, Ljava/lang/Integer;

    .line 955
    .line 956
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    iget v5, v0, Lb0/r;->h:I

    .line 960
    .line 961
    or-int/lit8 v5, v5, 0x1

    .line 962
    .line 963
    invoke-static {v5}, Li0/r;->C(I)I

    .line 964
    .line 965
    .line 966
    move-result v5

    .line 967
    invoke-static {v1, v2, v3, v4, v5}, Loh/h;->a(Lh0/l;Ly0/c;Ls0/d;Li0/h0;I)V

    .line 968
    .line 969
    .line 970
    goto/16 :goto_3

    .line 971
    .line 972
    :pswitch_e
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v1, Ly0/o;

    .line 975
    .line 976
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v2, Li0/p1;

    .line 979
    .line 980
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v3, Ls0/d;

    .line 983
    .line 984
    move-object/from16 v4, p1

    .line 985
    .line 986
    check-cast v4, Li0/h0;

    .line 987
    .line 988
    move-object/from16 v5, p2

    .line 989
    .line 990
    check-cast v5, Ljava/lang/Integer;

    .line 991
    .line 992
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    iget v5, v0, Lb0/r;->h:I

    .line 996
    .line 997
    or-int/lit8 v5, v5, 0x1

    .line 998
    .line 999
    invoke-static {v5}, Li0/r;->C(I)I

    .line 1000
    .line 1001
    .line 1002
    move-result v5

    .line 1003
    invoke-static {v1, v2, v3, v4, v5}, Lr9/e0;->e(Ly0/o;Li0/p1;Ls0/d;Li0/h0;I)V

    .line 1004
    .line 1005
    .line 1006
    goto/16 :goto_3

    .line 1007
    .line 1008
    :pswitch_f
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v1, Lc9/j1;

    .line 1011
    .line 1012
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v2, Ljava/lang/String;

    .line 1015
    .line 1016
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v3, Lfg/l;

    .line 1019
    .line 1020
    move-object/from16 v4, p1

    .line 1021
    .line 1022
    check-cast v4, Li0/h0;

    .line 1023
    .line 1024
    move-object/from16 v5, p2

    .line 1025
    .line 1026
    check-cast v5, Ljava/lang/Integer;

    .line 1027
    .line 1028
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    iget v5, v0, Lb0/r;->h:I

    .line 1032
    .line 1033
    or-int/lit8 v5, v5, 0x1

    .line 1034
    .line 1035
    invoke-static {v5}, Li0/r;->C(I)I

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    invoke-virtual {v1, v2, v3, v4, v5}, Lc9/j1;->q(Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_3

    .line 1043
    .line 1044
    :pswitch_10
    iget-object v1, v0, Lb0/r;->i:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v1, Lz/g;

    .line 1047
    .line 1048
    iget-object v2, v0, Lb0/r;->j:Ljava/lang/Object;

    .line 1049
    .line 1050
    check-cast v2, Ld0/d;

    .line 1051
    .line 1052
    iget-object v3, v0, Lb0/r;->k:Ljava/lang/Object;

    .line 1053
    .line 1054
    check-cast v3, Lfg/a;

    .line 1055
    .line 1056
    move-object/from16 v4, p1

    .line 1057
    .line 1058
    check-cast v4, Li0/h0;

    .line 1059
    .line 1060
    move-object/from16 v5, p2

    .line 1061
    .line 1062
    check-cast v5, Ljava/lang/Integer;

    .line 1063
    .line 1064
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1065
    .line 1066
    .line 1067
    iget v5, v0, Lb0/r;->h:I

    .line 1068
    .line 1069
    or-int/lit8 v5, v5, 0x1

    .line 1070
    .line 1071
    invoke-static {v5}, Li0/r;->C(I)I

    .line 1072
    .line 1073
    .line 1074
    move-result v5

    .line 1075
    invoke-static {v1, v2, v3, v4, v5}, Lb0/w;->c(Lz/g;Ld0/d;Lfg/a;Li0/h0;I)V

    .line 1076
    .line 1077
    .line 1078
    goto/16 :goto_3

    .line 1079
    .line 1080
    nop

    .line 1081
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
