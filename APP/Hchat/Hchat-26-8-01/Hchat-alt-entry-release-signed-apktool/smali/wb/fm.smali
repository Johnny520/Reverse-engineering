.class public final synthetic Lwb/fm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Lfg/l;Ljava/util/List;Lfg/a;Ljava/util/Set;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/fm;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/fm;->h:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/fm;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/fm;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/fm;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/fm;->o:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/fm;->l:Ljava/util/List;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/fm;->m:Lfg/a;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/fm;->p:Ljava/lang/Object;

    .line 22
    .line 23
    iput-boolean p9, p0, Lwb/fm;->n:Z

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/a1;Li0/a1;ZLfg/a;Li0/a1;)V
    .locals 1

    .line 26
    const/4 v0, 0x2

    iput v0, p0, Lwb/fm;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/fm;->o:Ljava/lang/Object;

    iput-object p2, p0, Lwb/fm;->l:Ljava/util/List;

    iput-object p3, p0, Lwb/fm;->i:Ljava/lang/Object;

    iput-object p4, p0, Lwb/fm;->p:Ljava/lang/Object;

    iput-object p5, p0, Lwb/fm;->h:Li0/a1;

    iput-object p6, p0, Lwb/fm;->j:Li0/a1;

    iput-boolean p7, p0, Lwb/fm;->n:Z

    iput-object p8, p0, Lwb/fm;->m:Lfg/a;

    iput-object p9, p0, Lwb/fm;->k:Li0/a1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/util/LinkedHashSet;ZLfg/a;Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lwb/fm;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/fm;->o:Ljava/lang/Object;

    iput-object p2, p0, Lwb/fm;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/fm;->p:Ljava/lang/Object;

    iput-boolean p4, p0, Lwb/fm;->n:Z

    iput-object p5, p0, Lwb/fm;->m:Lfg/a;

    iput-object p6, p0, Lwb/fm;->l:Ljava/util/List;

    iput-object p7, p0, Lwb/fm;->h:Li0/a1;

    iput-object p8, p0, Lwb/fm;->j:Li0/a1;

    iput-object p9, p0, Lwb/fm;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lwb/fm;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/fm;->o:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/fm;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/fm;->p:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Lfg/l;

    .line 20
    .line 21
    check-cast p1, Lr/d;

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    check-cast v0, Li0/h0;

    .line 25
    .line 26
    move-object/from16 v1, p3

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 p1, v1, 0x11

    .line 38
    .line 39
    const/16 v3, 0x10

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    if-eq p1, v3, :cond_0

    .line 43
    .line 44
    move p1, v11

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    :goto_0
    and-int/2addr v1, v11

    .line 48
    invoke-virtual {v0, v1, p1}, Li0/h0;->S(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    new-instance v1, Lr/b;

    .line 55
    .line 56
    iget-object v3, p0, Lwb/fm;->l:Ljava/util/List;

    .line 57
    .line 58
    iget-object v6, p0, Lwb/fm;->h:Li0/a1;

    .line 59
    .line 60
    iget-object v7, p0, Lwb/fm;->j:Li0/a1;

    .line 61
    .line 62
    iget-boolean v8, p0, Lwb/fm;->n:Z

    .line 63
    .line 64
    iget-object v9, p0, Lwb/fm;->m:Lfg/a;

    .line 65
    .line 66
    iget-object v10, p0, Lwb/fm;->k:Li0/a1;

    .line 67
    .line 68
    invoke-direct/range {v1 .. v10}, Lr/b;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;Li0/a1;Li0/a1;ZLfg/a;Li0/a1;)V

    .line 69
    .line 70
    .line 71
    const p1, -0x96cb20

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v1, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/16 v1, 0x30

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static {v2, p1, v0, v1, v11}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    iget-object v0, p0, Lwb/fm;->i:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v2, v0

    .line 94
    check-cast v2, Landroid/content/Context;

    .line 95
    .line 96
    iget-object v0, p0, Lwb/fm;->o:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, Lfg/l;

    .line 100
    .line 101
    iget-object v0, p0, Lwb/fm;->p:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/util/Set;

    .line 104
    .line 105
    check-cast p1, Lth/a;

    .line 106
    .line 107
    move-object v10, p2

    .line 108
    check-cast v10, Li0/h0;

    .line 109
    .line 110
    move-object/from16 v1, p3

    .line 111
    .line 112
    check-cast v1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    and-int/lit8 p1, v1, 0x11

    .line 122
    .line 123
    const/16 v4, 0x10

    .line 124
    .line 125
    const/4 v5, 0x1

    .line 126
    const/4 v9, 0x0

    .line 127
    if-eq p1, v4, :cond_2

    .line 128
    .line 129
    move p1, v5

    .line 130
    goto :goto_2

    .line 131
    :cond_2
    move p1, v9

    .line 132
    :goto_2
    and-int/2addr v1, v5

    .line 133
    invoke-virtual {v10, v1, p1}, Li0/h0;->S(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    iget-object v4, p0, Lwb/fm;->h:Li0/a1;

    .line 140
    .line 141
    invoke-virtual {v10, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {v10, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    or-int/2addr p1, v1

    .line 150
    iget-object v5, p0, Lwb/fm;->j:Li0/a1;

    .line 151
    .line 152
    invoke-virtual {v10, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    or-int/2addr p1, v1

    .line 157
    iget-object v6, p0, Lwb/fm;->k:Li0/a1;

    .line 158
    .line 159
    invoke-virtual {v10, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    or-int/2addr p1, v1

    .line 164
    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    or-int/2addr p1, v1

    .line 169
    iget-object v7, p0, Lwb/fm;->l:Ljava/util/List;

    .line 170
    .line 171
    invoke-virtual {v10, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    or-int/2addr p1, v1

    .line 176
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    sget-object v11, Li0/l;->a:Li0/e;

    .line 181
    .line 182
    if-nez p1, :cond_3

    .line 183
    .line 184
    if-ne v1, v11, :cond_4

    .line 185
    .line 186
    :cond_3
    new-instance v1, Lc9/p0;

    .line 187
    .line 188
    const/4 v8, 0x4

    .line 189
    invoke-direct/range {v1 .. v8}, Lc9/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    check-cast v1, Lfg/a;

    .line 196
    .line 197
    move-object p1, v0

    .line 198
    check-cast p1, Ljava/util/Collection;

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    iget-boolean v3, p0, Lwb/fm;->n:Z

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    if-nez v2, :cond_6

    .line 208
    .line 209
    if-eqz v3, :cond_5

    .line 210
    .line 211
    const-string v2, "\u53d6\u6d88\u5168\u9009"

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_5
    const-string v2, "\u5168\u9009"

    .line 215
    .line 216
    :goto_3
    move-object v8, v2

    .line 217
    goto :goto_4

    .line 218
    :cond_6
    move-object v8, v4

    .line 219
    :goto_4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-nez p1, :cond_9

    .line 224
    .line 225
    const p1, 0x35623e62

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, p1}, Li0/h0;->a0(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-virtual {v10, v3}, Li0/h0;->g(Z)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    or-int/2addr p1, v2

    .line 240
    invoke-virtual {v10, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    or-int/2addr p1, v2

    .line 245
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    if-nez p1, :cond_7

    .line 250
    .line 251
    if-ne v2, v11, :cond_8

    .line 252
    .line 253
    :cond_7
    new-instance v2, Lwb/p1;

    .line 254
    .line 255
    const/4 p1, 0x2

    .line 256
    invoke-direct {v2, v3, v0, v5, p1}, Lwb/p1;-><init>(ZLjava/util/Set;Li0/a1;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_8
    move-object v4, v2

    .line 263
    check-cast v4, Lfg/a;

    .line 264
    .line 265
    invoke-virtual {v10, v9}, Li0/h0;->p(Z)V

    .line 266
    .line 267
    .line 268
    :goto_5
    move-object v9, v4

    .line 269
    goto :goto_6

    .line 270
    :cond_9
    const p1, 0x35651b9a

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10, p1}, Li0/h0;->a0(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v10, v9}, Li0/h0;->p(Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :goto_6
    const/16 v11, 0x186

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    const-string v4, "\u5957\u7528\u6a21\u677f"

    .line 284
    .line 285
    const-string v6, "\u8fd4\u56de"

    .line 286
    .line 287
    iget-object v7, p0, Lwb/fm;->m:Lfg/a;

    .line 288
    .line 289
    move-object v5, v1

    .line 290
    invoke-static/range {v4 .. v12}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_a
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 295
    .line 296
    .line 297
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 298
    .line 299
    return-object p1

    .line 300
    :pswitch_1
    iget-object v0, p0, Lwb/fm;->o:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Ljava/util/ArrayList;

    .line 303
    .line 304
    iget-object v1, p0, Lwb/fm;->i:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, Landroid/content/Context;

    .line 307
    .line 308
    iget-object v2, p0, Lwb/fm;->p:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 311
    .line 312
    check-cast p1, Lth/a;

    .line 313
    .line 314
    move-object v9, p2

    .line 315
    check-cast v9, Li0/h0;

    .line 316
    .line 317
    move-object/from16 v3, p3

    .line 318
    .line 319
    check-cast v3, Ljava/lang/Integer;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    and-int/lit8 p1, v3, 0x11

    .line 329
    .line 330
    const/16 v4, 0x10

    .line 331
    .line 332
    const/4 v5, 0x1

    .line 333
    const/4 v12, 0x0

    .line 334
    if-eq p1, v4, :cond_b

    .line 335
    .line 336
    move p1, v5

    .line 337
    goto :goto_8

    .line 338
    :cond_b
    move p1, v12

    .line 339
    :goto_8
    and-int/2addr v3, v5

    .line 340
    invoke-virtual {v9, v3, p1}, Li0/h0;->S(IZ)Z

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-eqz p1, :cond_18

    .line 345
    .line 346
    iget-object p1, p0, Lwb/fm;->h:Li0/a1;

    .line 347
    .line 348
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    check-cast v3, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    iget-object v4, p0, Lwb/fm;->k:Li0/a1;

    .line 359
    .line 360
    sget-object v5, Li0/l;->a:Li0/e;

    .line 361
    .line 362
    const/4 v6, 0x0

    .line 363
    if-eqz v3, :cond_14

    .line 364
    .line 365
    const v3, -0x21759b7e

    .line 366
    .line 367
    .line 368
    invoke-virtual {v9, v3}, Li0/h0;->a0(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    const-string v7, "\u5220\u9664\u6240\u9009\uff08"

    .line 376
    .line 377
    const-string v8, "\uff09"

    .line 378
    .line 379
    invoke-static {v3, v7, v8}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v9, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    invoke-virtual {v9, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    or-int/2addr v7, v8

    .line 392
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    if-nez v7, :cond_c

    .line 397
    .line 398
    if-ne v8, v5, :cond_d

    .line 399
    .line 400
    :cond_c
    new-instance v8, Lwb/w8;

    .line 401
    .line 402
    const/4 v7, 0x4

    .line 403
    iget-object v10, p0, Lwb/fm;->j:Li0/a1;

    .line 404
    .line 405
    invoke-direct {v8, v0, v1, v10, v7}, Lwb/w8;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Li0/a1;I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v9, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_d
    check-cast v8, Lfg/a;

    .line 412
    .line 413
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-ne v0, v5, :cond_e

    .line 418
    .line 419
    new-instance v0, Lc9/x0;

    .line 420
    .line 421
    const/16 v1, 0xb

    .line 422
    .line 423
    invoke-direct {v0, v1, p1, v4}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v9, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :cond_e
    check-cast v0, Lfg/a;

    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    iget-boolean v1, p0, Lwb/fm;->n:Z

    .line 436
    .line 437
    if-eqz p1, :cond_f

    .line 438
    .line 439
    move-object v7, v6

    .line 440
    goto :goto_a

    .line 441
    :cond_f
    if-eqz v1, :cond_10

    .line 442
    .line 443
    const-string p1, "\u53d6\u6d88\u5168\u9009"

    .line 444
    .line 445
    :goto_9
    move-object v7, p1

    .line 446
    goto :goto_a

    .line 447
    :cond_10
    const-string p1, "\u5168\u9009"

    .line 448
    .line 449
    goto :goto_9

    .line 450
    :goto_a
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    if-eqz p1, :cond_11

    .line 455
    .line 456
    const p1, -0x216a0c35

    .line 457
    .line 458
    .line 459
    invoke-virtual {v9, p1}, Li0/h0;->a0(I)V

    .line 460
    .line 461
    .line 462
    :goto_b
    invoke-virtual {v9, v12}, Li0/h0;->p(Z)V

    .line 463
    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_11
    const p1, -0x2169beb4

    .line 467
    .line 468
    .line 469
    invoke-virtual {v9, p1}, Li0/h0;->a0(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9, v1}, Li0/h0;->g(Z)Z

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    invoke-virtual {v9, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    or-int/2addr p1, v6

    .line 481
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v6

    .line 485
    if-nez p1, :cond_12

    .line 486
    .line 487
    if-ne v6, v5, :cond_13

    .line 488
    .line 489
    :cond_12
    new-instance v6, Lwb/x8;

    .line 490
    .line 491
    const/4 p1, 0x4

    .line 492
    invoke-direct {v6, v1, v2, v4, p1}, Lwb/x8;-><init>(ZLjava/util/LinkedHashSet;Li0/a1;I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v9, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    :cond_13
    check-cast v6, Lfg/a;

    .line 499
    .line 500
    goto :goto_b

    .line 501
    :goto_c
    const/16 v10, 0xd80

    .line 502
    .line 503
    const/4 v11, 0x0

    .line 504
    const-string v5, "\u53d6\u6d88"

    .line 505
    .line 506
    move-object v4, v8

    .line 507
    move-object v8, v6

    .line 508
    move-object v6, v0

    .line 509
    invoke-static/range {v3 .. v11}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v9, v12}, Li0/h0;->p(Z)V

    .line 513
    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_14
    const v0, -0x2164318c

    .line 517
    .line 518
    .line 519
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 520
    .line 521
    .line 522
    iget-object v0, p0, Lwb/fm;->l:Ljava/util/List;

    .line 523
    .line 524
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    if-eqz v1, :cond_15

    .line 529
    .line 530
    move-object v7, v6

    .line 531
    goto :goto_d

    .line 532
    :cond_15
    const-string v1, "\u6279\u91cf\u5220\u9664"

    .line 533
    .line 534
    move-object v7, v1

    .line 535
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-eqz v0, :cond_16

    .line 540
    .line 541
    const p1, -0x21608e95

    .line 542
    .line 543
    .line 544
    invoke-virtual {v9, p1}, Li0/h0;->a0(I)V

    .line 545
    .line 546
    .line 547
    :goto_e
    invoke-virtual {v9, v12}, Li0/h0;->p(Z)V

    .line 548
    .line 549
    .line 550
    move-object v8, v6

    .line 551
    goto :goto_f

    .line 552
    :cond_16
    const v0, -0x216052a3

    .line 553
    .line 554
    .line 555
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    if-ne v0, v5, :cond_17

    .line 563
    .line 564
    new-instance v0, Lc9/x0;

    .line 565
    .line 566
    const/16 v1, 0xc

    .line 567
    .line 568
    invoke-direct {v0, v1, p1, v4}, Lc9/x0;-><init>(ILi0/a1;Li0/a1;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v9, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    :cond_17
    move-object v6, v0

    .line 575
    check-cast v6, Lfg/a;

    .line 576
    .line 577
    goto :goto_e

    .line 578
    :goto_f
    const/4 v10, 0x6

    .line 579
    const/16 v11, 0xc

    .line 580
    .line 581
    const-string v3, "\u8fd4\u56de"

    .line 582
    .line 583
    iget-object v4, p0, Lwb/fm;->m:Lfg/a;

    .line 584
    .line 585
    const/4 v5, 0x0

    .line 586
    const/4 v6, 0x0

    .line 587
    invoke-static/range {v3 .. v11}, Lwb/ho;->M(Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v9, v12}, Li0/h0;->p(Z)V

    .line 591
    .line 592
    .line 593
    goto :goto_10

    .line 594
    :cond_18
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 595
    .line 596
    .line 597
    :goto_10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 598
    .line 599
    return-object p1

    .line 600
    nop

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
